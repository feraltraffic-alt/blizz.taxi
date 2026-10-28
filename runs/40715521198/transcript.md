# Sandbox transcript (2026-10-28T15:24:51Z, 6e06316)

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
  "correlation_id": "66cde7ef-0617-4901-be00-e360c705e9d0"
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
  "session_id": "5ce9648d-d3af-4567-b5fb-b2a586cb0553",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDE5OTcsImlhdCI6MTc5MzIwMTA5NywianRpIjoiNTA2NzRiYjgtNWRiMy00OGQ3LTg1ZjktYWE2MjVjY2U5OGU2Iiwic2lkIjoiNWNlOTY0OGQtZDNhZi00NTY3LWI1ZmItYjJhNTg2Y2IwNTUzIn0.p_BTr3jOV2M2h0mWSJIsftMH6fPD-EuXWMZQtQjnFys",
  "access_expires_at": "2026-10-28T15:39:57.763976515Z",
  "refresh_token": "WCGyxvJekwqi-0aajpgIqFbzaW673_m9Cp_9MuntcwE",
  "refresh_expires_at": "2026-10-29T03:24:57.761726175Z",
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
  "session_id": "38e85ea8-df5c-4d91-b919-4204b039b856",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDE5OTksImlhdCI6MTc5MzIwMTA5OSwianRpIjoiMWNkNmFjNDktZThhYi00M2U0LTk1ODMtZTRlZjk2ZDc5M2EyIiwic2lkIjoiMzhlODVlYTgtZGY1Yy00ZDkxLWI5MTktNDIwNGIwMzliODU2In0.zLqzbvE59yrQet90AbRaJRkk5Vf1rZaNcXIhwUPIDK0",
  "access_expires_at": "2026-10-28T15:39:59.297818029Z",
  "refresh_token": "pxuJN9FiCu9iWLcP26PZ3zWT1QN3PsCuTxra2iFQqHw",
  "refresh_expires_at": "2026-10-29T03:24:59.296819154Z",
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
  "command_id": "23b2868b-b886-4156-8d74-eb3d6775c1a9",
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
      }
    }
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
  "correlation_id": "030c0710-5874-4d53-bbd7-6420c49968f2"
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
  "command_id": "7b1acc06-2911-41a6-8c44-5b1aa0c1bf2f",
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
  "changed_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
  "reason": "Sandbox clean-up",
  "changed_at": "2026-10-28T15:25:00.501885206Z"
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
  "session_id": "59536a79-3628-4736-8c6c-d8e751deb303",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIwMDEsImlhdCI6MTc5MzIwMTEwMSwianRpIjoiYWNkYjc4ZjktODM4ZC00MjUyLWE5NzEtMzY3MGUwMDA3OWQwIiwic2lkIjoiNTk1MzZhNzktMzYyOC00NzM2LThjNmMtZDhlNzUxZGViMzAzIn0.kLzU7AAUXZLHDWcmPDd567FEpfeOvEO2M3r4Y18nPHk",
  "access_expires_at": "2026-10-28T15:40:01.105880699Z",
  "refresh_token": "jgbjE2JGQB1SMmmKAxIE4G4OdeABgEtjTimknDinA8g",
  "refresh_expires_at": "2026-10-29T03:25:01.104546798Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "f2517e37-8217-46ee-8b50-99ec084095be",
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
  "id": "ea2b5b91-d2e8-4852-8aa8-cb29c7f08619",
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
  "created_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
  "created_at": "2026-10-28T15:25:01.409209Z",
  "updated_at": "2026-10-28T15:25:01.409209Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639247908",
  "device_ref": "sandbox-22947"
}
```

```json
{
  "challenge_id": "d29350f5-fedc-417d-b556-c0ce87be7bed",
  "expires_at": "2026-10-28T15:30:01.72583619Z",
  "resend_available_at": "2026-10-28T15:25:02.72583619Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639247908` → **200**

```json
{
  "phone": "+380639247908",
  "audience": "CLIENT",
  "code": "022108",
  "sent_at": "2026-10-28T15:25:01.73375237Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d29350f5-fedc-417d-b556-c0ce87be7bed",
  "code": "022108",
  "device_ref": "sandbox-22947"
}
```

```json
{
  "session_id": "434664d4-4ca2-4517-bf75-f638d88ff64e",
  "subject": {
    "type": "CLIENT",
    "id": "324429e9-2083-4a0b-b0fb-b2698239d4b9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMjQ0MjllOS0yMDgzLTRhMGItYjBmYi1iMjY5ODIzOWQ0YjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMDAyLCJpYXQiOjE3OTMyMDExMDIsImp0aSI6ImQyMTZlMTAzLWQ1MmItNGM5OS04NDkxLWUyYTM4M2NiM2E4MSIsInNpZCI6IjQzNDY2NGQ0LTRjYTItNDUxNy1iZjc1LWY2MzhkODhmZjY0ZSJ9.VbfhCuaR4Ru4a3y-0i9Tj93tqCbgcR88l1mrD9YVlzU",
  "access_expires_at": "2026-10-28T15:40:02.0639895Z",
  "refresh_token": "I5dyCz142vo4XnFo_zSrEi0bPY9V9wli7DGUL-Fgmak",
  "refresh_expires_at": "2026-11-27T15:25:02.062901861Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380639247908` → **200**

```json
{
  "client_id": "324429e9-2083-4a0b-b0fb-b2698239d4b9"
}
```

`POST /api/admin/v1/rider-wallets/324429e9-2083-4a0b-b0fb-b2698239d4b9/top-ups` → **201**

```json
{
  "command_id": "b93cafd0-8f86-43e8-9bb5-cca28da9e066",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "324429e9-2083-4a0b-b0fb-b2698239d4b9",
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
      "id": "985936ed-56d7-490a-ade6-ef57a4b5caab",
      "at": "2026-10-28T15:25:02.622141Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "15b90960-96fb-4910-bdf9-da6eb4252db7",
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
  "id": "654a36d6-bf95-4951-a5aa-1ae5b3a0cb12",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:30:03.020271Z",
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
      "id": "ea2b5b91-d2e8-4852-8aa8-cb29c7f08619",
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
  "device_ref": "sandbox-2464"
}
```

```json
{
  "challenge_id": "79c8f93c-f497-453f-9114-a33f276c7396",
  "expires_at": "2026-10-28T15:30:03.331041131Z",
  "resend_available_at": "2026-10-28T15:25:04.331041131Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "676895",
  "sent_at": "2026-10-28T15:25:03.335441617Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "79c8f93c-f497-453f-9114-a33f276c7396",
  "code": "676895",
  "device_ref": "sandbox-2464"
}
```

```json
{
  "session_id": "e52452d6-80b9-4601-a6e9-553b4723c79d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjAwMywiaWF0IjoxNzkzMjAxMTAzLCJqdGkiOiI1NDhiZmQ1NS1kZjc5LTRjZjMtOTI5OS1iZjU5MDY1OWE0N2UiLCJzaWQiOiJlNTI0NTJkNi04MGI5LTQ2MDEtYTZlOS01NTNiNDcyM2M3OWQifQ.muI_g5_SeiTz-V2PXsdNbxAJoI0Hudpuar3FaU36VkI",
  "access_expires_at": "2026-10-28T15:40:03.640215929Z",
  "refresh_token": "1lxAs_19Oyed6LPh63NJoVMXNg_2op5_7uaveWQuLmk",
  "refresh_expires_at": "2026-11-27T15:25:03.639070833Z",
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
  "command_id": "755e48f4-7b74-44cf-947f-d40f2fefc6f0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:25:04Z",
    "sequence": 1793201104193
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd13e746-bbce-46c8-a630-24f21e51eb7b",
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
  "last_heartbeat_at": "2026-10-28T15:25:04.246941Z",
  "last_location_at": "2026-10-28T15:25:04.246941Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "02fce276-c37a-496f-8af3-aabff87f3f81",
  "quote_id": "654a36d6-bf95-4951-a5aa-1ae5b3a0cb12",
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
  "id": "a75515b7-bba1-43d3-8a3f-5b4c996fbaf4",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "324429e9-2083-4a0b-b0fb-b2698239d4b9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:25:04.583711Z",
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
  "client_id": "324429e9-2083-4a0b-b0fb-b2698239d4b9",
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
      "id": "985936ed-56d7-490a-ade6-ef57a4b5caab",
      "at": "2026-10-28T15:25:02.622141Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
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
    "id": "a3f7c0b2-f572-4415-af3c-1f87a4b6e1ae",
    "order_id": "a75515b7-bba1-43d3-8a3f-5b4c996fbaf4",
    "expires_at": "2026-10-28T15:25:19.597981Z",
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

`POST /api/driver/v1/offers/a3f7c0b2-f572-4415-af3c-1f87a4b6e1ae/accept` → **200**

```json
{
  "command_id": "5d1c0018-185a-4193-b4d0-c120a76ef2ac"
}
```

```json
{
  "id": "768c745d-e980-43ec-8472-00b5e09c4a40",
  "order_id": "a75515b7-bba1-43d3-8a3f-5b4c996fbaf4",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6cd8cfa3-e2bf-47a9-8947-be4678e8aea7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6cd8cfa3-e2bf-47a9-8947-be4678e8aea7",
  "order_id": "a75515b7-bba1-43d3-8a3f-5b4c996fbaf4",
  "assignment_id": "768c745d-e980-43ec-8472-00b5e09c4a40",
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

`POST /api/driver/v1/work-sessions/cd13e746-bbce-46c8-a630-24f21e51eb7b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:25:06Z",
    "sequence": 1793201106417
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd13e746-bbce-46c8-a630-24f21e51eb7b",
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
  "last_heartbeat_at": "2026-10-28T15:25:06.070953Z",
  "last_location_at": "2026-10-28T15:25:06.070953Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6cd8cfa3-e2bf-47a9-8947-be4678e8aea7/arrive` → **200**

```json
{
  "command_id": "c9d1b75d-79f8-4d7f-bdee-1e542fb7b71b",
  "expected_version": 0
}
```

```json
{
  "id": "6cd8cfa3-e2bf-47a9-8947-be4678e8aea7",
  "order_id": "a75515b7-bba1-43d3-8a3f-5b4c996fbaf4",
  "assignment_id": "768c745d-e980-43ec-8472-00b5e09c4a40",
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
  "arrived_at": "2026-10-28T15:25:06.371521Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6cd8cfa3-e2bf-47a9-8947-be4678e8aea7/start` → **200**

```json
{
  "command_id": "701f1e9b-f8ea-45b3-a6aa-0a3ff8eb8792",
  "expected_version": 1
}
```

```json
{
  "id": "6cd8cfa3-e2bf-47a9-8947-be4678e8aea7",
  "order_id": "a75515b7-bba1-43d3-8a3f-5b4c996fbaf4",
  "assignment_id": "768c745d-e980-43ec-8472-00b5e09c4a40",
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
  "arrived_at": "2026-10-28T15:25:06.371521Z",
  "started_at": "2026-10-28T15:25:06.676185Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/6cd8cfa3-e2bf-47a9-8947-be4678e8aea7/complete` → **200**

```json
{
  "command_id": "1c4305f7-0b8b-4387-ae1b-739c3f901350",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:25:06Z",
  "cash_received": true
}
```

```json
{
  "id": "6cd8cfa3-e2bf-47a9-8947-be4678e8aea7",
  "order_id": "a75515b7-bba1-43d3-8a3f-5b4c996fbaf4",
  "assignment_id": "768c745d-e980-43ec-8472-00b5e09c4a40",
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
  "arrived_at": "2026-10-28T15:25:06.371521Z",
  "started_at": "2026-10-28T15:25:06.676185Z",
  "completed_at": "2026-10-28T15:25:06.998536Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "324429e9-2083-4a0b-b0fb-b2698239d4b9",
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
      "id": "1578a5f4-b673-43b2-911b-93ae9c9e3d15",
      "at": "2026-10-28T15:25:07.687623Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "a75515b7-bba1-43d3-8a3f-5b4c996fbaf4"
    },
    {
      "id": "985936ed-56d7-490a-ade6-ef57a4b5caab",
      "at": "2026-10-28T15:25:02.622141Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/ea2b5b91-d2e8-4852-8aa8-cb29c7f08619/archive` → **200**

```json
{
  "command_id": "be2e11ab-75d4-48b6-a515-5efeb9d38e4b",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "ea2b5b91-d2e8-4852-8aa8-cb29c7f08619",
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
  "created_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
  "created_at": "2026-10-28T15:25:01.409209Z",
  "updated_at": "2026-10-28T15:25:10.587889Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd13e746-bbce-46c8-a630-24f21e51eb7b",
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
  "last_heartbeat_at": "2026-10-28T15:25:06.070953Z",
  "last_location_at": "2026-10-28T15:25:06.070953Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cd13e746-bbce-46c8-a630-24f21e51eb7b/close` → **200**

```json
{
  "command_id": "a8fdf953-43f8-47af-9466-e78876089ecc",
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

Done: order a75515b7-bba1-43d3-8a3f-5b4c996fbaf4.

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
  "session_id": "24b8f3df-6be2-46ca-ad9f-b7e829385fc1",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIwMTEsImlhdCI6MTc5MzIwMTExMSwianRpIjoiYWY4MDkwMzctYzkyZC00YzE5LWE2ZTktYzhiNTZjMjQ0ZGEzIiwic2lkIjoiMjRiOGYzZGYtNmJlMi00NmNhLWFkOWYtYjdlODI5Mzg1ZmMxIn0.sSHCJo6OFH7gXVEOk_ybxUZXn9VwCTDWEwzy1onOX5o",
  "access_expires_at": "2026-10-28T15:40:11.760682392Z",
  "refresh_token": "a_0Tcs8fMVW-Li3-YzdhzXbGfRNO1Xxj0Jse6z0F9DE",
  "refresh_expires_at": "2026-10-29T03:25:11.759972444Z",
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
  "command_id": "19d705f8-0f1c-48de-9b85-8f2601c9d4a6",
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
  "session_id": "737e081a-839a-4b01-b4b0-4af35fa73984",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIwMTIsImlhdCI6MTc5MzIwMTExMiwianRpIjoiOWViMTY2NDgtMjE4OC00NjAyLWIwODctYzdkNjVlYWI3ODU0Iiwic2lkIjoiNzM3ZTA4MWEtODM5YS00YjAxLWI0YjAtNGFmMzVmYTczOTg0In0.T6ruXFak7v-6w-8619zaNCE1lM9mM6EXUifh939DCVU",
  "access_expires_at": "2026-10-28T15:40:12.919568061Z",
  "refresh_token": "0xIpKUY8xQgqeSvGIYKtn6A1KZe2X7RlJSOoJV14D00",
  "refresh_expires_at": "2026-10-29T03:25:12.918683906Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.73553384",
    "linkedid": "1730052700.73553384",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670883913"
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
    "id": "1730052700.73553384",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "9bb9ab74-c395-4679-b277-9412b36381fa",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380670883913",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T15:25:13.197283Z",
      "answered_at": null,
      "ended_at": "2026-10-28T15:25:13.224155Z",
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
    "id": "1730052600.150125199",
    "linkedid": "1730052600.150125199",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670883913"
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
      "id": "dddb7ef4-f7b3-44f0-8b11-987d4ee2bfa9",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670883913",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T15:25:13.547925Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/dddb7ef4-f7b3-44f0-8b11-987d4ee2bfa9/answer` → **200**

```json
{
  "command_id": "e12f8c0e-da58-40e2-b24a-6877c5892b17"
}
```

```json
{
  "id": "dddb7ef4-f7b3-44f0-8b11-987d4ee2bfa9",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670883913",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
  "order_ids": [],
  "started_at": "2026-10-28T15:25:13.547925Z",
  "answered_at": "2026-10-28T15:25:13.867052Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.150125199",
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
    "id": "1730052600.150125199",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "dddb7ef4-f7b3-44f0-8b11-987d4ee2bfa9",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670883913",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
      "order_ids": [],
      "started_at": "2026-10-28T15:25:13.547925Z",
      "answered_at": "2026-10-28T15:25:13.867052Z",
      "ended_at": "2026-10-28T15:25:14.169969Z",
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
      "id": "dddb7ef4-f7b3-44f0-8b11-987d4ee2bfa9",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670883913",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
      "order_ids": [],
      "started_at": "2026-10-28T15:25:13.547925Z",
      "answered_at": "2026-10-28T15:25:13.867052Z",
      "ended_at": "2026-10-28T15:25:14.169969Z",
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
      "id": "dddb7ef4-f7b3-44f0-8b11-987d4ee2bfa9",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670883913",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
      "order_ids": [],
      "started_at": "2026-10-28T15:25:13.547925Z",
      "answered_at": "2026-10-28T15:25:13.867052Z",
      "ended_at": "2026-10-28T15:25:14.169969Z",
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
      "id": "dddb7ef4-f7b3-44f0-8b11-987d4ee2bfa9",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670883913",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
      "order_ids": [],
      "started_at": "2026-10-28T15:25:13.547925Z",
      "answered_at": "2026-10-28T15:25:13.867052Z",
      "ended_at": "2026-10-28T15:25:14.169969Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:25:19.500092Z"
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
      "id": "dddb7ef4-f7b3-44f0-8b11-987d4ee2bfa9",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670883913",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
      "order_ids": [],
      "started_at": "2026-10-28T15:25:13.547925Z",
      "answered_at": "2026-10-28T15:25:13.867052Z",
      "ended_at": "2026-10-28T15:25:14.169969Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:25:19.500092Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/dddb7ef4-f7b3-44f0-8b11-987d4ee2bfa9/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/dddb7ef4-f7b3-44f0-8b11-987d4ee2bfa9/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=dddb7ef4-f7b3-44f0-8b11-987d4ee2bfa9` → **200**

```json
{
  "changes": [
    {
      "id": "59c572d7-ac30-4c8c-b569-79696c6a1f1a",
      "occurred_at": "2026-10-28T15:25:21.640523Z",
      "actor_type": "STAFF",
      "actor_id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "dddb7ef4-f7b3-44f0-8b11-987d4ee2bfa9",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"cde154c4-9cda-492c-a532-63983cdcbafc\", \"order_ids\": []}",
      "correlation_id": "9029bf0b-3b6a-4b2a-b691-b178279d7b74"
    },
    {
      "id": "748a350f-af99-44bf-be76-12efe13f042d",
      "occurred_at": "2026-10-28T15:25:21.606636Z",
      "actor_type": "STAFF",
      "actor_id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "dddb7ef4-f7b3-44f0-8b11-987d4ee2bfa9",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"cde154c4-9cda-492c-a532-63983cdcbafc\", \"order_ids\": []}",
      "correlation_id": "44eceb50-35d7-407d-a7f6-642a2ec0203a"
    }
  ]
}
```

Done: call dddb7ef4-f7b3-44f0-8b11-987d4ee2bfa9 recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639412308",
  "device_ref": "sandbox-13712"
}
```

```json
{
  "challenge_id": "3ebe31dd-28e4-49a9-9903-a739893c0a32",
  "expires_at": "2026-10-28T15:30:21.96449507Z",
  "resend_available_at": "2026-10-28T15:25:22.96449507Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639412308` → **200**

```json
{
  "phone": "+380639412308",
  "audience": "CLIENT",
  "code": "638405",
  "sent_at": "2026-10-28T15:25:21.968075315Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3ebe31dd-28e4-49a9-9903-a739893c0a32",
  "code": "638405",
  "device_ref": "sandbox-13712"
}
```

```json
{
  "session_id": "6e0e77c8-8ecb-4d2b-abbd-af8ebc50783e",
  "subject": {
    "type": "CLIENT",
    "id": "94646d65-4399-4093-9157-2e8eb5649bed"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDY0NmQ2NS00Mzk5LTQwOTMtOTE1Ny0yZThlYjU2NDliZWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMDIyLCJpYXQiOjE3OTMyMDExMjIsImp0aSI6ImYxNzk0OWE1LWFjZTgtNDExOC1hZjhjLTliMzdlNWQwNzYxOSIsInNpZCI6IjZlMGU3N2M4LThlY2ItNGQyYi1hYmJkLWFmOGViYzUwNzgzZSJ9.zqrDKIO7NA-m5LeycR6N37VQl1CbMOLF8_v1Jq7XOxM",
  "access_expires_at": "2026-10-28T15:40:22.284297109Z",
  "refresh_token": "J5DnGNvU79ma-h16oUBXcdeOQdUM8K5TvShltTckx_o",
  "refresh_expires_at": "2026-11-27T15:25:22.283422856Z",
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
        "pl": "Zmiana planów",
        "uk": "Передумав їхати",
        "en": "Changed my mind",
        "ru": "Передумал ехать"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто",
        "en": "The wait is too long",
        "ru": "Долго ждать машину"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "pl": "Błędny adres",
        "uk": "Помилився адресою",
        "en": "Wrong address",
        "ru": "Ошибся адресом"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "pl": "Inny transport",
        "uk": "Поїду іншим транспортом",
        "en": "Found other transport",
        "ru": "Уеду на другом транспорте"
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
  "device_ref": "sandbox-19577"
}
```

```json
{
  "challenge_id": "449687b4-3a5c-4fa7-a34e-e3c022436be7",
  "expires_at": "2026-10-28T15:30:22.832699174Z",
  "resend_available_at": "2026-10-28T15:25:23.832699174Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "986972",
  "sent_at": "2026-10-28T15:25:22.835928536Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "449687b4-3a5c-4fa7-a34e-e3c022436be7",
  "code": "986972",
  "device_ref": "sandbox-19577"
}
```

```json
{
  "session_id": "d075625d-e79a-4eb2-ba06-8d9213527c62",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjAyMywiaWF0IjoxNzkzMjAxMTIzLCJqdGkiOiJmZmQ2NzIxNi03YTk1LTRlZDUtODUwNC1jOWYzZGZkYzUxYWYiLCJzaWQiOiJkMDc1NjI1ZC1lNzlhLTRlYjItYmEwNi04ZDkyMTM1MjdjNjIifQ.AaW22m6Rs6RQhWVI58w9mWavbFq_liZ7gLusWAO8rYk",
  "access_expires_at": "2026-10-28T15:40:23.130669041Z",
  "refresh_token": "njEcuGgfxIXAReATIFl_Vr_HTQcDqEf9T8o1mv1tBZA",
  "refresh_expires_at": "2026-11-27T15:25:23.129913949Z",
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
        "pl": "Pasażer nie przyszedł",
        "uk": "Пасажир не вийшов",
        "en": "Passenger did not show up",
        "ru": "Пассажир не вышел"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "pl": "Awaria samochodu",
        "uk": "Несправність автомобіля",
        "en": "Vehicle problem",
        "ru": "Неисправность автомобиля"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "pl": "Nie mogę dojechać",
        "uk": "Не можу під'їхати",
        "en": "Cannot reach the pickup",
        "ru": "Не могу подъехать"
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
  "session_id": "d574aafe-fafa-422c-a8a7-da4e8b4d22c7",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIwMjMsImlhdCI6MTc5MzIwMTEyMywianRpIjoiNmU2ZjBlODItZTE0Zi00M2ZjLTlkNTctMTc3NmNlNzA2OTdiIiwic2lkIjoiZDU3NGFhZmUtZmFmYS00MjJjLWE4YTctZGE0ZThiNGQyMmM3In0.FM0rRgtL4tjdLNgPVNNcJ90-Krt2gc4ER3p0VMQmSCg",
  "access_expires_at": "2026-10-28T15:40:23.957876205Z",
  "refresh_token": "OXVmDPamRSFHVsJj_Nm8FhbvvToS_2yBojhbZyapAvA",
  "refresh_expires_at": "2026-10-29T03:25:23.957132263Z",
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
  "session_id": "95e60214-b2dd-4c29-aa95-55a1724b9baa",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIwMjQsImlhdCI6MTc5MzIwMTEyNCwianRpIjoiYTE0YzE4YjgtNjA1My00YmJiLTllNjItY2E1ZWE2NzZmYmRkIiwic2lkIjoiOTVlNjAyMTQtYjJkZC00YzI5LWFhOTUtNTVhMTcyNGI5YmFhIn0.vGrehDN6vf_w7VHj2dPJ6ariQXSzVW09KV41AgPIapI",
  "access_expires_at": "2026-10-28T15:40:24.518897558Z",
  "refresh_token": "XUHVn5sj2k9Le6Wx6BOh6XQ9fWQDQ76Ph3SJ19NsH_Y",
  "refresh_expires_at": "2026-10-29T03:25:24.518186628Z",
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
        "pl": "Na prośbę pasażera",
        "uk": "Пасажир попросив",
        "en": "Passenger asked",
        "ru": "Пассажир попросил"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "pl": "Duplikat zamówienia",
        "uk": "Дубль замовлення",
        "en": "Duplicate order",
        "ru": "Дубль заказа"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "pl": "Brak wolnych aut",
        "uk": "Немає вільних авто",
        "en": "No cars available",
        "ru": "Нет свободных машин"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "pl": "Zamówienie testowe",
        "uk": "Тестове замовлення",
        "en": "Test order",
        "ru": "Тестовый заказ"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "pl": "Błąd operatora",
        "uk": "Помилка оператора",
        "en": "Operator error",
        "ru": "Ошибка оператора"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "pl": "Wypadek",
        "uk": "ДТП",
        "en": "Accident",
        "ru": "ДТП"
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
  "command_id": "bfaa9c5f-0663-47da-aab8-ce400ca38620",
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
  "id": "9b2eb1ec-e921-4f78-9ca1-d848dacd81c2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:30:25.060733Z",
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
  "command_id": "0b9630bc-7490-4cff-8a2f-5b5b32678095",
  "quote_id": "9b2eb1ec-e921-4f78-9ca1-d848dacd81c2",
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
  "id": "928e4038-bb6e-40c8-802c-15f3a31de4c1",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94646d65-4399-4093-9157-2e8eb5649bed",
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
  "created_at": "2026-10-28T15:25:25.367917Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/928e4038-bb6e-40c8-802c-15f3a31de4c1` → **200**

```json
{
  "id": "928e4038-bb6e-40c8-802c-15f3a31de4c1",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94646d65-4399-4093-9157-2e8eb5649bed",
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
  "created_at": "2026-10-28T15:25:25.367917Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/928e4038-bb6e-40c8-802c-15f3a31de4c1/cancel` → **200**

```json
{
  "command_id": "0a92247c-3e32-4476-9a77-20bcbb47669a",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "928e4038-bb6e-40c8-802c-15f3a31de4c1",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "94646d65-4399-4093-9157-2e8eb5649bed",
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
  "created_at": "2026-10-28T15:25:25.367917Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "pl": "Zbyt długie oczekiwanie",
      "uk": "Довго чекати авто",
      "en": "The wait is too long",
      "ru": "Долго ждать машину"
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
  "command_id": "f381ca50-c261-4e7c-8fa4-ab1900c3b5b4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:25:26Z",
    "sequence": 1793201126529
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cb30b3d8-b959-47d5-9cec-b976c3cdc2f0",
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
  "last_heartbeat_at": "2026-10-28T15:25:26.550836Z",
  "last_location_at": "2026-10-28T15:25:26.550836Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-1673"
}
```

```json
{
  "challenge_id": "cefc5178-acbd-4a17-bd68-59ee73afb39c",
  "expires_at": "2026-10-28T15:30:26.838974378Z",
  "resend_available_at": "2026-10-28T15:25:27.838974378Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "492061",
  "sent_at": "2026-10-28T15:25:26.842796976Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cefc5178-acbd-4a17-bd68-59ee73afb39c",
  "code": "492061",
  "device_ref": "sandbox-1673"
}
```

```json
{
  "session_id": "60193e99-8892-4def-a01e-15cc013b86b1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjAyNywiaWF0IjoxNzkzMjAxMTI3LCJqdGkiOiIyMDI3NGYyZi03ODliLTQzN2ItYWEyYi02NjkxY2JlOTE1NTkiLCJzaWQiOiI2MDE5M2U5OS04ODkyLTRkZWYtYTAxZS0xNWNjMDEzYjg2YjEifQ.GSlCN5_xI2Q2xJCGBX5jlQdmLfFmCAP_jnFOn6KbdyU",
  "access_expires_at": "2026-10-28T15:40:27.141015574Z",
  "refresh_token": "2tUI7WMLsn-gDtnYTJJM49k4Cu23BuBBssBvQNAKAfI",
  "refresh_expires_at": "2026-11-27T15:25:27.140297668Z",
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
  "command_id": "209dc249-e887-4ad0-8bf6-32cdfc1f4cb2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:25:27Z",
    "sequence": 1793201127688
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e8076527-96b7-4d89-87fb-84d0059f945c",
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
  "last_heartbeat_at": "2026-10-28T15:25:27.710407Z",
  "last_location_at": "2026-10-28T15:25:27.710407Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f18474bd-4a86-4c15-83d8-d0ef16013bad",
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
  "id": "2d0a3c30-117b-466e-98eb-34203ca59bce",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:30:27.996983Z",
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
  "command_id": "12dc71d8-de37-4f38-9390-e7232c26cfbe",
  "quote_id": "2d0a3c30-117b-466e-98eb-34203ca59bce",
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
  "id": "ee579c83-3d5a-43fd-a94d-717da9b63591",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94646d65-4399-4093-9157-2e8eb5649bed",
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
  "created_at": "2026-10-28T15:25:28.286065Z",
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
    "id": "4a5703e7-4b8b-4191-9782-f21f0d78b6f5",
    "order_id": "ee579c83-3d5a-43fd-a94d-717da9b63591",
    "expires_at": "2026-10-28T15:25:43.290054Z",
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

`POST /api/driver/v1/offers/4a5703e7-4b8b-4191-9782-f21f0d78b6f5/accept` → **200**

```json
{
  "command_id": "da2ff4ee-c363-452c-960b-54e549858905"
}
```

```json
{
  "id": "3b4ed022-a39c-4322-972c-6b028b524ed4",
  "order_id": "ee579c83-3d5a-43fd-a94d-717da9b63591",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a9282c5a-f33e-47a6-b733-0f571f439143",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a9282c5a-f33e-47a6-b733-0f571f439143",
  "order_id": "ee579c83-3d5a-43fd-a94d-717da9b63591",
  "assignment_id": "3b4ed022-a39c-4322-972c-6b028b524ed4",
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

`POST /api/driver/v1/trips/a9282c5a-f33e-47a6-b733-0f571f439143/cancel` → **200**

```json
{
  "command_id": "c930e689-7f9c-440e-b7bf-ce94a407764d",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "a9282c5a-f33e-47a6-b733-0f571f439143",
  "order_id": "ee579c83-3d5a-43fd-a94d-717da9b63591",
  "assignment_id": "3b4ed022-a39c-4322-972c-6b028b524ed4",
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

`GET /api/rider/v1/orders/ee579c83-3d5a-43fd-a94d-717da9b63591` → **200**

```json
{
  "id": "ee579c83-3d5a-43fd-a94d-717da9b63591",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "94646d65-4399-4093-9157-2e8eb5649bed",
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
    "id": "3b4ed022-a39c-4322-972c-6b028b524ed4",
    "order_id": "ee579c83-3d5a-43fd-a94d-717da9b63591",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "a9282c5a-f33e-47a6-b733-0f571f439143",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T15:25:28.286065Z",
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
    "id": "a41ba8d1-d064-4531-9a20-ed1488f13a22",
    "order_id": "ee579c83-3d5a-43fd-a94d-717da9b63591",
    "expires_at": "2026-10-28T15:25:44.430432Z",
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

`POST /api/driver/v1/offers/a41ba8d1-d064-4531-9a20-ed1488f13a22/accept` → **200**

```json
{
  "command_id": "f978ac5b-a666-4b8b-9447-a2054845a962"
}
```

```json
{
  "id": "5cdd7eed-b3a0-4f00-b8b9-8c1d0ece01c7",
  "order_id": "ee579c83-3d5a-43fd-a94d-717da9b63591",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f91d5068-359c-4165-9797-2da8c108f574",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f91d5068-359c-4165-9797-2da8c108f574",
  "order_id": "ee579c83-3d5a-43fd-a94d-717da9b63591",
  "assignment_id": "5cdd7eed-b3a0-4f00-b8b9-8c1d0ece01c7",
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

`POST /api/driver/v1/trips/f91d5068-359c-4165-9797-2da8c108f574/cancel` → **200**

```json
{
  "command_id": "c280972d-f478-451e-97b5-f0c63e3d860b",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "f91d5068-359c-4165-9797-2da8c108f574",
  "order_id": "ee579c83-3d5a-43fd-a94d-717da9b63591",
  "assignment_id": "5cdd7eed-b3a0-4f00-b8b9-8c1d0ece01c7",
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
    "id": "ee579c83-3d5a-43fd-a94d-717da9b63591",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T15:25:28.286065Z",
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
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить"
      }
    },
    "pickup_at": null
  },
  {
    "id": "928e4038-bb6e-40c8-802c-15f3a31de4c1",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T15:25:25.367917Z",
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
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто",
        "en": "The wait is too long",
        "ru": "Долго ждать машину"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/ee579c83-3d5a-43fd-a94d-717da9b63591/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:25:28.286768Z",
      "actor": {
        "type": "CLIENT",
        "id": "94646d65-4399-4093-9157-2e8eb5649bed",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ee579c83-3d5a-43fd-a94d-717da9b63591",
        "quote_id": "2d0a3c30-117b-466e-98eb-34203ca59bce",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "48ab28d1-b0d8-4cf9-bcee-ac194c8abd9e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:25:28.289043Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ee579c83-3d5a-43fd-a94d-717da9b63591",
        "attempt_id": "0e69981b-1f26-47bc-921e-ec4489688eee",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "48ab28d1-b0d8-4cf9-bcee-ac194c8abd9e"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T15:25:28.296666Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "4a5703e7-4b8b-4191-9782-f21f0d78b6f5",
        "order_id": "ee579c83-3d5a-43fd-a94d-717da9b63591",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "48ab28d1-b0d8-4cf9-bcee-ac194c8abd9e"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T15:25:28.858577Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "4a5703e7-4b8b-4191-9782-f21f0d78b6f5",
        "order_id": "ee579c83-3d5a-43fd-a94d-717da9b63591",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "3b4ed022-a39c-4322-972c-6b028b524ed4"
      },
      "correlation_id": "e1f781d3-bd72-41da-8980-bf3dd4e3e1c0"
```

Done: orders 928e4038-bb6e-40c8-802c-15f3a31de4c1, ee579c83-3d5a-43fd-a94d-717da9b63591.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380736486993",
  "device_ref": "sandbox-14253"
}
```

```json
{
  "challenge_id": "0a9b0c99-b69e-4293-a342-ce0753a26e85",
  "expires_at": "2026-10-28T15:30:31.699734033Z",
  "resend_available_at": "2026-10-28T15:25:32.699734033Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380736486993` → **200**

```json
{
  "phone": "+380736486993",
  "audience": "CLIENT",
  "code": "630932",
  "sent_at": "2026-10-28T15:25:31.70255014Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0a9b0c99-b69e-4293-a342-ce0753a26e85",
  "code": "630932",
  "device_ref": "sandbox-14253"
}
```

```json
{
  "session_id": "0ce9c0ce-d353-4949-b47c-765d69c02665",
  "subject": {
    "type": "CLIENT",
    "id": "c243414a-c9ad-49e9-ab34-4f9592d797b3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMjQzNDE0YS1jOWFkLTQ5ZTktYWIzNC00Zjk1OTJkNzk3YjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMDMyLCJpYXQiOjE3OTMyMDExMzIsImp0aSI6IjQ5N2I4NzE3LTgxNDEtNGYwZS04MTdmLTk4ZDE4OWU2MDU4YyIsInNpZCI6IjBjZTljMGNlLWQzNTMtNDk0OS1iNDdjLTc2NWQ2OWMwMjY2NSJ9.ghGUFWSi4Ahj8T2T0TvNCxYwiO2ligd_1-fp2BjRrSM",
  "access_expires_at": "2026-10-28T15:40:32.001977355Z",
  "refresh_token": "clTKeQvIX1BePpKD4LP6283zYx3vxDj0TOeD8EdHzGs",
  "refresh_expires_at": "2026-11-27T15:25:32.001378094Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "80924994-0dcb-4f11-a432-cf569454ce7e",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "49455a45-8f20-421a-bde3-2687e6b12ca7",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-49455a45-8f20-421a-bde3-2687e6b12ca7",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "0cbb0002da5d119adde63fb9f69416db",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=49455a45-8f20-421a-bde3-2687e6b12ca7",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736486993"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=49455a45-8f20-421a-bde3-2687e6b12ca7",
  "expires_at": "2026-10-28T15:55:32.288501Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/49455a45-8f20-421a-bde3-2687e6b12ca7` → **200**

```json
{
  "id": "49455a45-8f20-421a-bde3-2687e6b12ca7",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T15:55:32.288501Z",
  "card": {
    "id": "c5e6dd01-1652-4f80-b03e-9a80a8d80b8a",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0380",
    "card_type": "Visa",
    "created_at": "2026-10-28T15:25:32.578621Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "c5e6dd01-1652-4f80-b03e-9a80a8d80b8a",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****0380",
      "card_type": "Visa",
      "created_at": "2026-10-28T15:25:32.578621Z"
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
  "device_ref": "sandbox-25024"
}
```

```json
{
  "challenge_id": "bd1df137-5705-4040-b0e2-e406493890d1",
  "expires_at": "2026-10-28T15:30:33.159536292Z",
  "resend_available_at": "2026-10-28T15:25:34.159536292Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "470398",
  "sent_at": "2026-10-28T15:25:33.163126267Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bd1df137-5705-4040-b0e2-e406493890d1",
  "code": "470398",
  "device_ref": "sandbox-25024"
}
```

```json
{
  "session_id": "df664a4a-e60f-4933-b218-ab406936b4fc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjAzMywiaWF0IjoxNzkzMjAxMTMzLCJqdGkiOiI1ZmZmODdhMi0yMjAxLTQ0ODMtYjZlNi0zZjNmZDhmM2ZmOGUiLCJzaWQiOiJkZjY2NGE0YS1lNjBmLTQ5MzMtYjIxOC1hYjQwNjkzNmI0ZmMifQ.uaFjOnFI5YYVVade08booCHEre2eImVYAjdJXKtWvug",
  "access_expires_at": "2026-10-28T15:40:33.457843532Z",
  "refresh_token": "u4Mg5Cgpu-UZmZz9id9C-Yd6EIxzsu-q3Z1xRPoAykU",
  "refresh_expires_at": "2026-11-27T15:25:33.457204527Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e8076527-96b7-4d89-87fb-84d0059f945c",
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
  "last_heartbeat_at": "2026-10-28T15:25:27.710407Z",
  "last_location_at": "2026-10-28T15:25:27.710407Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e8076527-96b7-4d89-87fb-84d0059f945c/handover` → **200**

```json
{
  "command_id": "4a96c274-7e99-470e-ae50-542e55f41b22",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e8076527-96b7-4d89-87fb-84d0059f945c",
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
  "last_heartbeat_at": "2026-10-28T15:25:27.710407Z",
  "last_location_at": "2026-10-28T15:25:27.710407Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e8076527-96b7-4d89-87fb-84d0059f945c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:25:34Z",
    "sequence": 1793201134282
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e8076527-96b7-4d89-87fb-84d0059f945c",
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
  "last_heartbeat_at": "2026-10-28T15:25:34.304422Z",
  "last_location_at": "2026-10-28T15:25:34.304422Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1b86feeb-9e6c-4bca-a74f-96df9e15c813",
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
  "id": "7e680b04-29f0-45d7-9ee6-c9eea56915de",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:30:34.586159Z",
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
  "command_id": "21576845-c24f-46c0-a1a6-c7dcb677d8d7",
  "quote_id": "7e680b04-29f0-45d7-9ee6-c9eea56915de",
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
  "id": "3d8374c8-7be8-45a6-8b28-317e20115a71",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c243414a-c9ad-49e9-ab34-4f9592d797b3",
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
  "created_at": "2026-10-28T15:25:34.88521Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/3d8374c8-7be8-45a6-8b28-317e20115a71` → **200**

```json
{
  "id": "3d8374c8-7be8-45a6-8b28-317e20115a71",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c243414a-c9ad-49e9-ab34-4f9592d797b3",
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
  "created_at": "2026-10-28T15:25:34.88521Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/3d8374c8-7be8-45a6-8b28-317e20115a71` → **200**

```json
{
  "id": "3d8374c8-7be8-45a6-8b28-317e20115a71",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c243414a-c9ad-49e9-ab34-4f9592d797b3",
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
  "created_at": "2026-10-28T15:25:34.88521Z",
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
    "id": "f8fe0240-9bc2-40d6-a4f7-6653143c61f6",
    "order_id": "3d8374c8-7be8-45a6-8b28-317e20115a71",
    "expires_at": "2026-10-28T15:25:50.865099Z",
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

`POST /api/driver/v1/offers/f8fe0240-9bc2-40d6-a4f7-6653143c61f6/accept` → **200**

```json
{
  "command_id": "1aac64a2-8636-4574-b541-94f973325725"
}
```

```json
{
  "id": "4116f221-57be-4371-96d0-f6af436d1f39",
  "order_id": "3d8374c8-7be8-45a6-8b28-317e20115a71",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9412e9ca-27f1-4174-aceb-c363ef3bb60a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9412e9ca-27f1-4174-aceb-c363ef3bb60a",
  "order_id": "3d8374c8-7be8-45a6-8b28-317e20115a71",
  "assignment_id": "4116f221-57be-4371-96d0-f6af436d1f39",
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

`POST /api/driver/v1/work-sessions/e8076527-96b7-4d89-87fb-84d0059f945c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:25:37Z",
    "sequence": 1793201137568
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e8076527-96b7-4d89-87fb-84d0059f945c",
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
  "last_heartbeat_at": "2026-10-28T15:25:37.589369Z",
  "last_location_at": "2026-10-28T15:25:37.589369Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9412e9ca-27f1-4174-aceb-c363ef3bb60a/arrive` → **200**

```json
{
  "command_id": "86c16ff6-1b94-4c41-b68d-7a2c1e61d01c",
  "expected_version": 0
}
```

```json
{
  "id": "9412e9ca-27f1-4174-aceb-c363ef3bb60a",
  "order_id": "3d8374c8-7be8-45a6-8b28-317e20115a71",
  "assignment_id": "4116f221-57be-4371-96d0-f6af436d1f39",
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
  "arrived_at": "2026-10-28T15:25:37.873326Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9412e9ca-27f1-4174-aceb-c363ef3bb60a/start` → **200**

```json
{
  "command_id": "c89d0df5-737b-4dfe-aa9e-a3b191f9cc04",
  "expected_version": 1
}
```

```json
{
  "id": "9412e9ca-27f1-4174-aceb-c363ef3bb60a",
  "order_id": "3d8374c8-7be8-45a6-8b28-317e20115a71",
  "assignment_id": "4116f221-57be-4371-96d0-f6af436d1f39",
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
  "arrived_at": "2026-10-28T15:25:37.873326Z",
  "started_at": "2026-10-28T15:25:38.159197Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9412e9ca-27f1-4174-aceb-c363ef3bb60a/complete` → **200**

```json
{
  "command_id": "34f618cc-4188-48d8-81f5-d3ba8d7afaf5",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:25:38Z"
}
```

```json
{
  "id": "9412e9ca-27f1-4174-aceb-c363ef3bb60a",
  "order_id": "3d8374c8-7be8-45a6-8b28-317e20115a71",
  "assignment_id": "4116f221-57be-4371-96d0-f6af436d1f39",
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
  "arrived_at": "2026-10-28T15:25:37.873326Z",
  "started_at": "2026-10-28T15:25:38.159197Z",
  "completed_at": "2026-10-28T15:25:38.44981Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/3d8374c8-7be8-45a6-8b28-317e20115a71` → **200**

```json
{
  "id": "3d8374c8-7be8-45a6-8b28-317e20115a71",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c243414a-c9ad-49e9-ab34-4f9592d797b3",
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
    "id": "4116f221-57be-4371-96d0-f6af436d1f39",
    "order_id": "3d8374c8-7be8-45a6-8b28-317e20115a71",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9412e9ca-27f1-4174-aceb-c363ef3bb60a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:25:34.88521Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/3d8374c8-7be8-45a6-8b28-317e20115a71` → **200**

```json
{
  "id": "3d8374c8-7be8-45a6-8b28-317e20115a71",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "c243414a-c9ad-49e9-ab34-4f9592d797b3",
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
    "id": "4116f221-57be-4371-96d0-f6af436d1f39",
    "order_id": "3d8374c8-7be8-45a6-8b28-317e20115a71",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9412e9ca-27f1-4174-aceb-c363ef3bb60a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:25:34.88521Z",
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
      "id": "6dad5423-693d-4c54-b222-fd7f1ef94e62",
      "at": "2026-10-28T15:25:38.922699Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3d8374c8-7be8-45a6-8b28-317e20115a71",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/3d8374c8-7be8-45a6-8b28-317e20115a71/tip` → **200**

```json
{
  "order_id": "3d8374c8-7be8-45a6-8b28-317e20115a71",
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
  "available_until": "2026-10-29T15:25:38.44981Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/3d8374c8-7be8-45a6-8b28-317e20115a71/tip` → **201**

```json
{
  "command_id": "b625e4c2-cccb-4ead-805b-c275f35ecdc9",
  "amount_minor": 2500
}
```

```json
{
  "id": "dfd131fb-dc7a-4190-9427-22a7ba705203",
  "order_id": "3d8374c8-7be8-45a6-8b28-317e20115a71",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T15:25:41.171019Z"
}
```

`GET /api/rider/v1/orders/3d8374c8-7be8-45a6-8b28-317e20115a71/tip` → **200**

```json
{
  "order_id": "3d8374c8-7be8-45a6-8b28-317e20115a71",
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
  "available_until": "2026-10-29T15:25:38.44981Z",
  "open": false,
  "tip": {
    "id": "dfd131fb-dc7a-4190-9427-22a7ba705203",
    "order_id": "3d8374c8-7be8-45a6-8b28-317e20115a71",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T15:25:41.171019Z"
  }
}
```

`GET /api/rider/v1/orders/3d8374c8-7be8-45a6-8b28-317e20115a71/tip` → **200**

```json
{
  "order_id": "3d8374c8-7be8-45a6-8b28-317e20115a71",
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
  "available_until": "2026-10-29T15:25:38.44981Z",
  "open": false,
  "tip": {
    "id": "dfd131fb-dc7a-4190-9427-22a7ba705203",
    "order_id": "3d8374c8-7be8-45a6-8b28-317e20115a71",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T15:25:41.171019Z"
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
      "id": "bd539eca-9c11-4e52-9b40-f0c897c2f35e",
      "at": "2026-10-28T15:25:42.989979Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3d8374c8-7be8-45a6-8b28-317e20115a71",
      "counterpart_id": null
    },
    {
      "id": "6dad5423-693d-4c54-b222-fd7f1ef94e62",
      "at": "2026-10-28T15:25:38.922699Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3d8374c8-7be8-45a6-8b28-317e20115a71",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e8076527-96b7-4d89-87fb-84d0059f945c",
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
  "last_heartbeat_at": "2026-10-28T15:25:37.589369Z",
  "last_location_at": "2026-10-28T15:25:37.589369Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e8076527-96b7-4d89-87fb-84d0059f945c/close` → **200**

```json
{
  "command_id": "543a9dce-3d75-4140-960c-646c58f1bb7d",
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

Done: card order 3d8374c8-7be8-45a6-8b28-317e20115a71.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380736631856",
  "device_ref": "sandbox-1001"
}
```

```json
{
  "challenge_id": "ed8cf0b9-d950-4b31-b8fe-236f38e00512",
  "expires_at": "2026-10-28T15:30:43.861198611Z",
  "resend_available_at": "2026-10-28T15:25:44.861198611Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380736631856` → **200**

```json
{
  "phone": "+380736631856",
  "audience": "CLIENT",
  "code": "777620",
  "sent_at": "2026-10-28T15:25:43.867025391Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ed8cf0b9-d950-4b31-b8fe-236f38e00512",
  "code": "777620",
  "device_ref": "sandbox-1001"
}
```

```json
{
  "session_id": "595adb95-cf32-4d25-8cab-97393903d4ce",
  "subject": {
    "type": "CLIENT",
    "id": "cd0de320-24ca-4640-b271-568afd717cf8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZDBkZTMyMC0yNGNhLTQ2NDAtYjI3MS01NjhhZmQ3MTdjZjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMDQ0LCJpYXQiOjE3OTMyMDExNDQsImp0aSI6ImRlYjcxNDMwLWRjNzgtNGRlOC1iZDYyLTU1NWU2ZmVmNDg1ZCIsInNpZCI6IjU5NWFkYjk1LWNmMzItNGQyNS04Y2FiLTk3MzkzOTAzZDRjZSJ9.0CDXwfwr2CLWkilZFXgufq4GT_RP-A8Qe-TgYbU8zBM",
  "access_expires_at": "2026-10-28T15:40:44.192873966Z",
  "refresh_token": "bzEM4Hw3trRYw1kKs_1G5IqwcSzeNeW9tDdYDFLOK3Y",
  "refresh_expires_at": "2026-11-27T15:25:44.192210555Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "9c7a01f1-5e93-466c-a52d-60ced37beb25",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "fa9fdeb6-81da-45ab-bfa9-3711d2d3aa94",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-fa9fdeb6-81da-45ab-bfa9-3711d2d3aa94",
    "orderDate": "1793201144",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "c007593602d37f5f8e6493b78cf8879d",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=fa9fdeb6-81da-45ab-bfa9-3711d2d3aa94",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736631856"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=fa9fdeb6-81da-45ab-bfa9-3711d2d3aa94",
  "created_at": "2026-10-28T15:25:44.482658Z",
  "expires_at": "2026-10-28T15:55:44.482658Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/fa9fdeb6-81da-45ab-bfa9-3711d2d3aa94` → **200**

```json
{
  "id": "fa9fdeb6-81da-45ab-bfa9-3711d2d3aa94",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T15:25:44.482658Z",
  "expires_at": "2026-10-28T15:55:44.482658Z",
  "completed_at": "2026-10-28T15:25:44.763339Z",
  "masked_pan": "41****1830",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "cd0de320-24ca-4640-b271-568afd717cf8",
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
      "id": "ab4f5e95-8a9c-4c96-b91a-03e157e0c962",
      "at": "2026-10-28T15:25:45.010792Z",
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
  "client_id": "cd0de320-24ca-4640-b271-568afd717cf8",
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
      "id": "ab4f5e95-8a9c-4c96-b91a-03e157e0c962",
      "at": "2026-10-28T15:25:45.010792Z",
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
  "device_ref": "sandbox-11463"
}
```

```json
{
  "challenge_id": "7187a345-0931-4906-ba1d-ce4dbcb13d8e",
  "expires_at": "2026-10-28T15:30:45.612718539Z",
  "resend_available_at": "2026-10-28T15:25:46.612718539Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "611990",
  "sent_at": "2026-10-28T15:25:45.615645702Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7187a345-0931-4906-ba1d-ce4dbcb13d8e",
  "code": "611990",
  "device_ref": "sandbox-11463"
}
```

```json
{
  "session_id": "a132f7a5-9734-45f1-a28d-7d0f45d337ca",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjA0NSwiaWF0IjoxNzkzMjAxMTQ1LCJqdGkiOiI0OWE0YTIxMi1kZTc2LTRiNjEtOTcwZi05MTNlNTNhZmRhZmYiLCJzaWQiOiJhMTMyZjdhNS05NzM0LTQ1ZjEtYTI4ZC03ZDBmNDVkMzM3Y2EifQ.LVqHYc-Ms1RHCCOOvynnE_LO3K3K2Dj1DKx4v34xMxs",
  "access_expires_at": "2026-10-28T15:40:45.908762787Z",
  "refresh_token": "unyKv5lYAojsfCsQfEJUgLrkmtZBXTPPGwnAOb1gNM0",
  "refresh_expires_at": "2026-11-27T15:25:45.908084198Z",
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
  "command_id": "3423c28f-c582-439e-be02-2bd37977a0ed",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "63c2a83e-1494-4362-8cbb-f1cbbc0f1886",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-63c2a83e-1494-4362-8cbb-f1cbbc0f1886",
    "orderDate": "1793201146",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "40898b6ccee18d5eb6d29cd5e3c2ec6d",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=63c2a83e-1494-4362-8cbb-f1cbbc0f1886",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=63c2a83e-1494-4362-8cbb-f1cbbc0f1886",
  "created_at": "2026-10-28T15:25:46.451423Z",
  "expires_at": "2026-10-28T15:55:46.451423Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/63c2a83e-1494-4362-8cbb-f1cbbc0f1886` → **200**

```json
{
  "id": "63c2a83e-1494-4362-8cbb-f1cbbc0f1886",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T15:25:46.451423Z",
  "expires_at": "2026-10-28T15:55:46.451423Z",
  "completed_at": "2026-10-28T15:25:46.727511Z",
  "masked_pan": "41****7210",
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
      "id": "4cdf38ed-c47e-418b-9549-22c0c51463ed",
      "at": "2026-10-28T15:25:47.020633Z",
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
  "command_id": "7f17aef3-b333-45fb-8501-14f096d1b0e9",
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
  "correlation_id": "d2b4521a-4fe9-4b5c-90da-7a530ffe5473"
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
  "session_id": "111a13ca-3cf1-456c-af0d-6d827ed36115",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIwNDksImlhdCI6MTc5MzIwMTE0OSwianRpIjoiMzYyMGI3NWUtNjhhYy00ZjIyLWExNjMtYzQ1ODU0MTU1ZjMyIiwic2lkIjoiMTExYTEzY2EtM2NmMS00NTZjLWFmMGQtNmQ4MjdlZDM2MTE1In0.mKPFEo30tHgWvEwC0kP6qZ7cPTBwTI2J_d24uX7TwVo",
  "access_expires_at": "2026-10-28T15:40:49.154978524Z",
  "refresh_token": "2IacghJ0p6IGeISqmNHrCOrmsS-aI-WUkclteF4_q9E",
  "refresh_expires_at": "2026-10-29T03:25:49.1542012Z",
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
  "phone": "+48600418742",
  "device_ref": "sandbox-25575"
}
```

```json
{
  "challenge_id": "aa05cefc-6af7-47f0-b8e2-3d186d7ace1a",
  "expires_at": "2026-10-28T15:30:49.986191625Z",
  "resend_available_at": "2026-10-28T15:25:50.986191625Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600418742` → **200**

```json
{
  "phone": "+48600418742",
  "audience": "CLIENT",
  "code": "191934",
  "sent_at": "2026-10-28T15:25:49.989130077Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa05cefc-6af7-47f0-b8e2-3d186d7ace1a",
  "code": "191934",
  "device_ref": "sandbox-25575"
}
```

```json
{
  "session_id": "07bb120b-9d88-4956-a82e-f13934332839",
  "subject": {
    "type": "CLIENT",
    "id": "22121735-41f0-4355-945e-eca4c97de975"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMjEyMTczNS00MWYwLTQzNTUtOTQ1ZS1lY2E0Yzk3ZGU5NzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMDUwLCJpYXQiOjE3OTMyMDExNTAsImp0aSI6ImFmYzNiY2FlLTZhZWMtNGNkMi04YzBmLTBkNDljN2YwZDk3MSIsInNpZCI6IjA3YmIxMjBiLTlkODgtNDk1Ni1hODJlLWYxMzkzNDMzMjgzOSJ9.0JeXCRAv3wWmosREnsi4_R1y-NY0seGfTfi-irO1Bf4",
  "access_expires_at": "2026-10-28T15:40:50.28744393Z",
  "refresh_token": "ZnoLtCNtXhmj52XrWLfE-JRK9JH5OMW-7Ln3EHtWHkI",
  "refresh_expires_at": "2026-11-27T15:25:50.286834366Z",
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
  "command_id": "780cd73c-613e-4159-ba23-81ef107f2469",
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
  "correlation_id": "06c4e291-08d9-4535-9c87-1f8472fd9087",
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
  "command_id": "f0aabde9-2053-4794-9363-f75cce0e1a50",
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
  "paused_at": "2026-10-28T15:25:51.399651197Z",
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
  "command_id": "6741115a-6cd8-4867-8a7f-80c6811e7e27",
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
  "id": "ac4a7bb5-479c-4567-b9e2-dea12f0e7fa8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:30:51.965413Z",
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
  "command_id": "b6ea142a-9887-46ce-a264-97a08d128342",
  "quote_id": "ac4a7bb5-479c-4567-b9e2-dea12f0e7fa8",
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
  "correlation_id": "0b664ef4-53c7-4b32-b63a-69bc0a3160a4"
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
  "paused_at": "2026-10-28T15:25:51.399651Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "e4cafb43-a42d-435e-8ad0-086b8bffc1d2",
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
  "command_id": "e082ef09-23c8-4ea2-9edd-72ae7f2d1d42",
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
  "command_id": "84e78c72-7b85-4236-9e7f-fb13935a5eb1",
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
  "id": "6b4f94d0-7a96-432f-a1af-1ad0b476813d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:30:53.654723Z",
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
  "command_id": "c6fa53b1-edac-4c65-a2e9-709f4c23621e",
  "quote_id": "6b4f94d0-7a96-432f-a1af-1ad0b476813d",
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
  "correlation_id": "94d41f6c-3b98-48d8-91ef-d33cd5c63e98"
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
  "command_id": "6c979216-1c3c-47c2-811c-2353f8b539f0",
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
  "command_id": "93048b62-ff1d-466e-bca0-26d2934db374",
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
  "id": "f6175bc9-3ff4-4c78-92ec-2bcb1cbf178b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:30:54.799131Z",
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
  "command_id": "8afaf302-0c49-457a-8174-9fc5b3289474",
  "quote_id": "f6175bc9-3ff4-4c78-92ec-2bcb1cbf178b",
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
  "correlation_id": "a0be1ca2-cd1c-4ee4-984e-f57a5cbcc4f7"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "bace086a-13f0-411f-a5c2-26a58c685c42",
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
  "correlation_id": "151de638-2672-4548-bbf2-52eb278a8012"
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
  "command_id": "875ab3bd-9e0e-4762-a9dc-fe4028fe7366",
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
  "phone": "+380670934350",
  "device_ref": "sandbox-26251"
}
```

```json
{
  "challenge_id": "62966eb9-196f-4695-b621-7ea4f10cdfd6",
  "expires_at": "2026-10-28T15:30:56.208560717Z",
  "resend_available_at": "2026-10-28T15:25:57.208560717Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670934350` → **200**

```json
{
  "phone": "+380670934350",
  "audience": "CLIENT",
  "code": "420553",
  "sent_at": "2026-10-28T15:25:56.211263182Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62966eb9-196f-4695-b621-7ea4f10cdfd6",
  "code": "420553",
  "device_ref": "sandbox-26251"
}
```

```json
{
  "session_id": "90a2a21b-13af-404a-bbf8-9cb8f0e1f511",
  "subject": {
    "type": "CLIENT",
    "id": "a3c7cb4d-713f-4f68-96a5-378e104eeb92"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2M3Y2I0ZC03MTNmLTRmNjgtOTZhNS0zNzhlMTA0ZWViOTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMDU2LCJpYXQiOjE3OTMyMDExNTYsImp0aSI6ImNkYTQ1YmIxLTY3NDQtNGUyZi1hYTE0LTFiYmZhNWZkZWZhNSIsInNpZCI6IjkwYTJhMjFiLTEzYWYtNDA0YS1iYmY4LTljYjhmMGUxZjUxMSJ9.n9s6f8OrRipK7yXjWsDQQCzgHK0EUtl_X816gmiMPG4",
  "access_expires_at": "2026-10-28T15:40:56.508763621Z",
  "refresh_token": "ZpqITlSHmVIZv7XvDCanxeQpzBhPIDaJq2oJqckQU_0",
  "refresh_expires_at": "2026-11-27T15:25:56.508091544Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a3c7cb4d-713f-4f68-96a5-378e104eeb92",
  "session_id": "90a2a21b-13af-404a-bbf8-9cb8f0e1f511",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f191d0c8-d3eb-4f57-aeff-1815280a2b2c",
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
  "id": "ed2edc15-5c7f-4b4f-a46d-2deb9442860f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:30:57.075358Z",
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
  "challenge_id": "3da5ea72-737f-469d-993f-9cfbd74a3697",
  "expires_at": "2026-10-28T15:30:59.35462081Z",
  "resend_available_at": "2026-10-28T15:26:00.35462081Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670934350` → **200**

```json
{
  "phone": "+380670934350",
  "audience": "CLIENT",
  "code": "403666",
  "sent_at": "2026-10-28T15:25:59.356818598Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "fac1b0eb-f078-439a-9ee5-8d289ef9e452",
  "challenge_id": "3da5ea72-737f-469d-993f-9cfbd74a3697",
  "otp_code": "403666"
}
```

```json
{
  "client_id": "a3c7cb4d-713f-4f68-96a5-378e104eeb92",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T15:25:59.664195711Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "3b9d9002-c743-4581-a4fe-b1e821584aec",
  "quote_id": "ed2edc15-5c7f-4b4f-a46d-2deb9442860f",
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
  "correlation_id": "3c3050ec-ed53-4750-a38e-42881e9a9c6b"
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
  "session_id": "f53a671f-d5a4-4357-8406-728e1f5036a1",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIwNjAsImlhdCI6MTc5MzIwMTE2MCwianRpIjoiZDI4NDY4ZmEtYzY0Ni00MzlhLTk4YzgtMTNmZjliYzBkYzY1Iiwic2lkIjoiZjUzYTY3MWYtZDVhNC00MzU3LTg0MDYtNzI4ZTFmNTAzNmExIn0.Xaf7atK-CLsgaGNQZh4GaBa8AjKmHCnS1_hWH67Syx4",
  "access_expires_at": "2026-10-28T15:41:00.513866843Z",
  "refresh_token": "NRZKoXDzE8OReQmJypk6n6ncpFS5DlQsrihTKYMugKs",
  "refresh_expires_at": "2026-10-29T03:26:00.513190785Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "a3c7cb4d-713f-4f68-96a5-378e104eeb92",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T15:25:59.664196Z",
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

`POST /api/admin/v1/client-deletions/a3c7cb4d-713f-4f68-96a5-378e104eeb92/complete` → **200**

```json
{
  "command_id": "4b76ad95-b83b-46ea-a063-c967ef234375",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "a3c7cb4d-713f-4f68-96a5-378e104eeb92",
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
  "correlation_id": "e3ff4c14-8976-409d-b2e5-59cc076302eb"
}
```

Done: client a3c7cb4d-713f-4f68-96a5-378e104eeb92 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662523263",
  "device_ref": "sandbox-26564"
}
```

```json
{
  "challenge_id": "e2376e99-3bc3-4425-8048-8b9ef1d27dc6",
  "expires_at": "2026-10-28T15:31:01.629232844Z",
  "resend_available_at": "2026-10-28T15:26:02.629232844Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662523263` → **200**

```json
{
  "phone": "+380662523263",
  "audience": "CLIENT",
  "code": "573212",
  "sent_at": "2026-10-28T15:26:01.632010763Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e2376e99-3bc3-4425-8048-8b9ef1d27dc6",
  "code": "573212",
  "device_ref": "sandbox-26564"
}
```

```json
{
  "session_id": "d26a98fa-ab60-466c-9caa-b52082c77cba",
  "subject": {
    "type": "CLIENT",
    "id": "a7730fc1-1e64-463e-a5cc-e6db6a7386b9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNzczMGZjMS0xZTY0LTQ2M2UtYTVjYy1lNmRiNmE3Mzg2YjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMDYxLCJpYXQiOjE3OTMyMDExNjEsImp0aSI6IjI1MzZmOWM3LTI4YTMtNGM0Mi05NjdlLWI0MGM4YzJhNDUyMSIsInNpZCI6ImQyNmE5OGZhLWFiNjAtNDY2Yy05Y2FhLWI1MjA4MmM3N2NiYSJ9.LAicEwIBWHglwRqcdK9b6djUPqlPjS9HGLmD7vS1qgI",
  "access_expires_at": "2026-10-28T15:41:01.925286707Z",
  "refresh_token": "mSZ52C4BV0misZhvdnyXuQ_iSwLrI9e_Flh3kvPL5vA",
  "refresh_expires_at": "2026-11-27T15:26:01.924680614Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a7730fc1-1e64-463e-a5cc-e6db6a7386b9",
  "session_id": "d26a98fa-ab60-466c-9caa-b52082c77cba",
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
  "session_id": "afd0914b-c565-450e-90b7-8eb6cda76db4",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIwNjIsImlhdCI6MTc5MzIwMTE2MiwianRpIjoiZGMzYzk3ZWMtOGMyMC00MTdhLWFmN2EtZGU5ZmY0MmU4M2Y2Iiwic2lkIjoiYWZkMDkxNGItYzU2NS00NTBlLTkwYjctOGViNmNkYTc2ZGI0In0.7ytyJ2zawCNCmzkFUEQaAY4T7TdK8hmsRZrMefsIGZs",
  "access_expires_at": "2026-10-28T15:41:02.755675167Z",
  "refresh_token": "An8IQi2-6fRlKoItXuQBnlHGw_s5juq021pBbWo_9ic",
  "refresh_expires_at": "2026-10-29T03:26:02.75506198Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=2523263&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "a7730fc1-1e64-463e-a5cc-e6db6a7386b9",
      "phone": "+380662523263",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T15:26:01.922731Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/a7730fc1-1e64-463e-a5cc-e6db6a7386b9` → **200**

```json
{
  "client": {
    "id": "a7730fc1-1e64-463e-a5cc-e6db6a7386b9",
    "phone": "+380662523263",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T15:26:01.922731Z",
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

`POST /api/admin/v1/clients/a7730fc1-1e64-463e-a5cc-e6db6a7386b9/block` → **400**

```json
{
  "command_id": "c736d120-cde3-41f4-9942-d85ee22270d0",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/a7730fc1-1e64-463e-a5cc-e6db6a7386b9/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "b7b002b9-d542-4a88-afb7-22b1ec63334b",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/a7730fc1-1e64-463e-a5cc-e6db6a7386b9/block` → **200**

```json
{
  "command_id": "f1e5905b-3eb7-406a-85cb-3571b45cd6a1",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "a7730fc1-1e64-463e-a5cc-e6db6a7386b9",
  "phone": "+380662523263",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T15:26:01.922731Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T15:26:03.923033Z",
    "by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
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
  "correlation_id": "517bb9f9-c82b-49d4-b0f7-f532537d4c91"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662523263",
  "device_ref": "sandbox-31586"
}
```

```json
{
  "challenge_id": "f0462b48-640e-4581-8a00-190f353f36a3",
  "expires_at": "2026-10-28T15:31:06.474464411Z",
  "resend_available_at": "2026-10-28T15:26:07.474464411Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662523263` → **200**

```json
{
  "phone": "+380662523263",
  "audience": "CLIENT",
  "code": "544909",
  "sent_at": "2026-10-28T15:26:06.476730449Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "f0462b48-640e-4581-8a00-190f353f36a3",
  "code": "544909",
  "device_ref": "sandbox-31586"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "5f61ca83-ac72-4016-a5ef-ec07901dfaf2"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/a7730fc1-1e64-463e-a5cc-e6db6a7386b9` → **200**

```json
{
  "client": {
    "id": "a7730fc1-1e64-463e-a5cc-e6db6a7386b9",
    "phone": "+380662523263",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T15:26:01.922731Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T15:26:03.923033Z",
      "by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
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

`POST /api/admin/v1/clients/a7730fc1-1e64-463e-a5cc-e6db6a7386b9/unblock` → **200**

```json
{
  "command_id": "76256696-3d68-4770-9585-12b798be9a12",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "a7730fc1-1e64-463e-a5cc-e6db6a7386b9",
  "phone": "+380662523263",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T15:26:01.922731Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662523263",
  "device_ref": "sandbox-659"
}
```

```json
{
  "challenge_id": "23737c51-8a2c-4582-8ba7-01329cc8d67b",
  "expires_at": "2026-10-28T15:31:09.630060484Z",
  "resend_available_at": "2026-10-28T15:26:10.630060484Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662523263` → **200**

```json
{
  "phone": "+380662523263",
  "audience": "CLIENT",
  "code": "309668",
  "sent_at": "2026-10-28T15:26:09.632599259Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "23737c51-8a2c-4582-8ba7-01329cc8d67b",
  "code": "309668",
  "device_ref": "sandbox-659"
}
```

```json
{
  "session_id": "6000892d-c862-48bf-9a3f-61ec9cf00ef2",
  "subject": {
    "type": "CLIENT",
    "id": "a7730fc1-1e64-463e-a5cc-e6db6a7386b9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNzczMGZjMS0xZTY0LTQ2M2UtYTVjYy1lNmRiNmE3Mzg2YjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMDY5LCJpYXQiOjE3OTMyMDExNjksImp0aSI6IjRjNWQ1ZWQ2LTFkNTktNDNiMy1iYzhkLTRlOGM1YzhkNDJhYyIsInNpZCI6IjYwMDA4OTJkLWM4NjItNDhiZi05YTNmLTYxZWM5Y2YwMGVmMiJ9.DgZX-X8uPeq6mDwGaoLrS3YpC4i0WFBcB5aKn2wynPQ",
  "access_expires_at": "2026-10-28T15:41:09.93020134Z",
  "refresh_token": "-u5pe7UqiJ69e_sDN3wfGh6p18-qOALCV5RPxRZUkTg",
  "refresh_expires_at": "2026-11-27T15:26:09.92952205Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a7730fc1-1e64-463e-a5cc-e6db6a7386b9",
  "session_id": "6000892d-c862-48bf-9a3f-61ec9cf00ef2",
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
  "phone": "+380667853794",
  "device_ref": "sandbox-21359"
}
```

```json
{
  "challenge_id": "f491957f-a087-4f69-a956-d88ab06a2c04",
  "expires_at": "2026-10-28T15:31:10.493083763Z",
  "resend_available_at": "2026-10-28T15:26:11.493083763Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667853794` → **200**

```json
{
  "phone": "+380667853794",
  "audience": "CLIENT",
  "code": "815540",
  "sent_at": "2026-10-28T15:26:10.4954741Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f491957f-a087-4f69-a956-d88ab06a2c04",
  "code": "815540",
  "device_ref": "sandbox-21359"
}
```

```json
{
  "session_id": "16934bab-f166-4a5e-9796-c98c8bd587e3",
  "subject": {
    "type": "CLIENT",
    "id": "6f9de2ad-4fc4-4aad-a09f-7bb8687c326f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZjlkZTJhZC00ZmM0LTRhYWQtYTA5Zi03YmI4Njg3YzMyNmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMDcwLCJpYXQiOjE3OTMyMDExNzAsImp0aSI6IjY2MjBkYjMxLWQ3OGEtNGE3NC1hNjU1LWJjNTIwOTNlZDY1MyIsInNpZCI6IjE2OTM0YmFiLWYxNjYtNGE1ZS05Nzk2LWM5OGM4YmQ1ODdlMyJ9.K66Vql7cgIUoj_bUJtpMyokczUtLXTZfRtGbK8_1_Mk",
  "access_expires_at": "2026-10-28T15:41:10.790819676Z",
  "refresh_token": "pA64cbIzl7Xu9jXJHtLLfzNC532iPE8Ir6Jf8RoyNNA",
  "refresh_expires_at": "2026-11-27T15:26:10.790123655Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0619f41e-1a06-4c58-bf7b-0626f76c4f14",
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
  "id": "ffee1620-f8d3-48cb-83bc-98e025d306ad",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:31:11.067891Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: b5651d4d-3c79-40ef-a375-d9bb6515d9ae) → **201**

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
  "session_id": "3dc0cc9a-b3cc-4fdd-87b2-1a779716bd7b",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIwNzEsImlhdCI6MTc5MzIwMTE3MSwianRpIjoiODhhODQwNGItYzNjZC00YjcxLWI2YTktZGY0MjNhZjVkOTk5Iiwic2lkIjoiM2RjMGNjOWEtYjNjYy00ZmRkLTg3YjItMWE3Nzk3MTZiZDdiIn0.KKc70J5no8AK_ZmQ3CAC6yJNRob6z1_pb7fe-2QNMrI",
  "access_expires_at": "2026-10-28T15:41:11.679377197Z",
  "refresh_token": "aBEtlJFiO9NCM2h-J6nE1raE6jlfZC-y0v0sX-Lx840",
  "refresh_expires_at": "2026-10-29T03:26:11.67874729Z",
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
  "session_id": "2e41ef88-98ff-4eb9-8edd-0f67d147ecd1",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIwNzIsImlhdCI6MTc5MzIwMTE3MiwianRpIjoiYTE4YTk4ZjUtNzk3YS00M2VhLTgyNzYtYjk2MjAwZmQ2N2Q5Iiwic2lkIjoiMmU0MWVmODgtOThmZi00ZWI5LThlZGQtMGY2N2QxNDdlY2QxIn0.hDEFbARr6SGijk8GE_Nuv5VmCjQBMAM_v15x1GGmvsc",
  "access_expires_at": "2026-10-28T15:41:12.247988958Z",
  "refresh_token": "LcX2gYCvIs91UFTBOEBCLg3X6Tke52p5tuiPdvgAIDY",
  "refresh_expires_at": "2026-10-29T03:26:12.247365232Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e8828e69-1fff-4902-9828-268b46587391/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:26:11.348777Z",
      "actor": {
        "type": "CLIENT",
        "id": "6f9de2ad-4fc4-4aad-a09f-7bb8687c326f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e8828e69-1fff-4902-9828-268b46587391",
        "quote_id": "ffee1620-f8d3-48cb-83bc-98e025d306ad",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "b5651d4d-3c79-40ef-a375-d9bb6515d9ae"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:26:11.351006Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e8828e69-1fff-4902-9828-268b46587391",
        "attempt_id": "555013eb-c334-48e4-add0-50b91d4a9387",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b5651d4d-3c79-40ef-a375-d9bb6515d9ae"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T15:26:11.361297Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e8828e69-1fff-4902-9828-268b46587391",
        "attempt_id": "555013eb-c334-48e4-add0-50b91d4a9387"
      },
      "correlation_id": "b5651d4d-3c79-40ef-a375-d9bb6515d9ae"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "555013eb-c334-48e4-add0-50b91d4a9387",
        "generation": 1,
        "started_at": "2026-10-28T15:26:11.349721Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T15:26:11.361297Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T15:26:11.35216Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/b5651d4d-3c79-40ef-a375-d9bb6515d9ae` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "e8828e69-1fff-4902-9828-268b46587391:0",
      "order_id": "e8828e69-1fff-4902-9828-268b46587391",
      "at": "2026-10-28T15:26:11.348777Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "e8828e69-1fff-4902-9828-268b46587391:1",
      "order_id": "e8828e69-1fff-4902-9828-268b46587391",
      "at": "2026-10-28T15:26:11.351006Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "e8828e69-1fff-4902-9828-268b46587391:2",
      "order_id": "e8828e69-1fff-4902-9828-268b46587391",
      "at": "2026-10-28T15:26:11.361297Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/653216fb-bb3d-4613-8b3c-42d6ff3cd4de` → **200**

```json
{
  "found": []
}
```

Done: request b5651d4d-3c79-40ef-a375-d9bb6515d9ae — order e8828e69-1fff-4902-9828-268b46587391 found by its id.

`GET /api/rider/v1/orders/e8828e69-1fff-4902-9828-268b46587391` → **200**

```json
{
  "id": "e8828e69-1fff-4902-9828-268b46587391",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6f9de2ad-4fc4-4aad-a09f-7bb8687c326f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T15:26:11.347964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/e8828e69-1fff-4902-9828-268b46587391/cancel` → **200**

```json
{
  "command_id": "b42de2f7-37df-4b7b-acbf-fa7321ed0f32",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e8828e69-1fff-4902-9828-268b46587391",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6f9de2ad-4fc4-4aad-a09f-7bb8687c326f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:26:11.347964Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
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
  "phone": "+380635941524",
  "device_ref": "sandbox-10535"
}
```

```json
{
  "challenge_id": "7ecc7f57-c5c4-4ced-972e-5bb0442f9e89",
  "expires_at": "2026-10-28T15:31:13.945331174Z",
  "resend_available_at": "2026-10-28T15:26:14.945331174Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635941524` → **200**

```json
{
  "phone": "+380635941524",
  "audience": "CLIENT",
  "code": "391414",
  "sent_at": "2026-10-28T15:26:13.947637765Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7ecc7f57-c5c4-4ced-972e-5bb0442f9e89",
  "code": "391414",
  "device_ref": "sandbox-10535"
}
```

```json
{
  "session_id": "44239759-e859-4f67-926c-7e50afa5b2cc",
  "subject": {
    "type": "CLIENT",
    "id": "874de094-8fc6-496d-8fc0-e49003fa6e48"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NzRkZTA5NC04ZmM2LTQ5NmQtOGZjMC1lNDkwMDNmYTZlNDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMDc0LCJpYXQiOjE3OTMyMDExNzQsImp0aSI6IjJhZWM1NjE1LTkwZGMtNGZjNy1hYzU5LWZlZmVmNjUwMjVjMSIsInNpZCI6IjQ0MjM5NzU5LWU4NTktNGY2Ny05MjZjLTdlNTBhZmE1YjJjYyJ9.kYHRha2xKYdSkSn6pPPP-xywAJ0RJnUxYsXca2CIyTY",
  "access_expires_at": "2026-10-28T15:41:14.239331423Z",
  "refresh_token": "kCQr_ock1ehS5gnjaDhv-Hz3iIDG1qJPjF3qyJvBKMs",
  "refresh_expires_at": "2026-11-27T15:26:14.238746279Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "d3ad0def-28af-4ac3-b40f-4e4d641edd95",
  "expires_at": "2026-10-28T15:31:16.510949003Z",
  "resend_available_at": "2026-10-28T15:26:17.510949003Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635941524` → **200**

```json
{
  "phone": "+380635941524",
  "audience": "CLIENT",
  "code": "986381",
  "sent_at": "2026-10-28T15:26:16.513646861Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "a9cfca7f-51e0-44a8-8d9c-a56bd25d9839",
  "challenge_id": "d3ad0def-28af-4ac3-b40f-4e4d641edd95",
  "otp_code": "986381"
}
```

```json
{
  "id": "7b76005c-6423-494a-a24a-a3bf2d2ef9f3",
  "state": "PENDING",
  "created_at": "2026-10-28T15:26:16.812462Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/7b76005c-6423-494a-a24a-a3bf2d2ef9f3` → **200**

```json
{
  "id": "7b76005c-6423-494a-a24a-a3bf2d2ef9f3",
  "state": "PENDING",
  "created_at": "2026-10-28T15:26:16.812462Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/7b76005c-6423-494a-a24a-a3bf2d2ef9f3` → **200**

```json
{
  "id": "7b76005c-6423-494a-a24a-a3bf2d2ef9f3",
  "state": "PENDING",
  "created_at": "2026-10-28T15:26:16.812462Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/7b76005c-6423-494a-a24a-a3bf2d2ef9f3` → **200**

```json
{
  "id": "7b76005c-6423-494a-a24a-a3bf2d2ef9f3",
  "state": "READY",
  "created_at": "2026-10-28T15:26:16.812462Z",
  "ready_at": "2026-10-28T15:26:19.528771Z",
  "expires_at": "2026-11-04T15:26:19.528771Z",
  "size_bytes": 1030
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/7b76005c-6423-494a-a24a-a3bf2d2ef9f3/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634830141",
  "device_ref": "sandbox-25248"
}
```

```json
{
  "challenge_id": "79133fb3-0b25-4ff8-8d82-82880e4ef198",
  "expires_at": "2026-10-28T15:31:19.912596572Z",
  "resend_available_at": "2026-10-28T15:26:20.912596572Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634830141` → **200**

```json
{
  "phone": "+380634830141",
  "audience": "CLIENT",
  "code": "147605",
  "sent_at": "2026-10-28T15:26:19.914981096Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "79133fb3-0b25-4ff8-8d82-82880e4ef198",
  "code": "147605",
  "device_ref": "sandbox-25248"
}
```

```json
{
  "session_id": "f572e817-33d9-43bb-94da-1e57b40eb8cc",
  "subject": {
    "type": "CLIENT",
    "id": "941d9b58-975a-4292-a0a5-fb13ce198395"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDFkOWI1OC05NzVhLTQyOTItYTBhNS1mYjEzY2UxOTgzOTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMDgwLCJpYXQiOjE3OTMyMDExODAsImp0aSI6IjA2MDFmYmY4LTNlOTktNDg1Yy05ZTIyLTUzMTZlOTllYTQ4NSIsInNpZCI6ImY1NzJlODE3LTMzZDktNDNiYi05NGRhLTFlNTdiNDBlYjhjYyJ9.yj8fEMF6FYZOOKHhVohVYgRKdh1Bn4Mb2Swh2ncoeWk",
  "access_expires_at": "2026-10-28T15:41:20.211938687Z",
  "refresh_token": "iatMnDuRFbgTVBa9ujztYxf_UWnu5FbZJsL7didoJKw",
  "refresh_expires_at": "2026-11-27T15:26:20.211373211Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/7b76005c-6423-494a-a24a-a3bf2d2ef9f3/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/7b76005c-6423-494a-a24a-a3bf2d2ef9f3/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "388222d9-2950-4592-8f65-360006d070b2"
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
  "session_id": "2ef7a99c-a531-4118-a435-6f3e969ca010",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIwODEsImlhdCI6MTc5MzIwMTE4MSwianRpIjoiYTYwNmE3MmQtNWVmYy00YWU4LWE4NGQtYzFiMjI1ZGFkYTMzIiwic2lkIjoiMmVmN2E5OWMtYTUzMS00MTE4LWE0MzUtNmYzZTk2OWNhMDEwIn0.Y2KvRp20Zg7RCqU3FQelAi7Eyax4YfNJhwMsg2f9jw4",
  "access_expires_at": "2026-10-28T15:41:21.039658841Z",
  "refresh_token": "b_3fYLzHwTUAmPDH79BGtQGMdggPFdUqjgDfAGMBrL8",
  "refresh_expires_at": "2026-10-29T03:26:21.039072075Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "874de094-8fc6-496d-8fc0-e49003fa6e48",
  "session_id": "44239759-e859-4f67-926c-7e50afa5b2cc",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/874de094-8fc6-496d-8fc0-e49003fa6e48/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "7b76005c-6423-494a-a24a-a3bf2d2ef9f3",
      "state": "READY",
      "created_at": "2026-10-28T15:26:16.812462Z",
      "ready_at": "2026-10-28T15:26:19.528771Z",
      "expires_at": "2026-11-04T15:26:19.528771Z",
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
  "device_ref": "sandbox-1095"
}
```

```json
{
  "challenge_id": "09c1e3f4-5b32-4594-98a5-76732fe64e1f",
  "expires_at": "2026-10-28T15:31:21.867021854Z",
  "resend_available_at": "2026-10-28T15:26:22.867021854Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "702945",
  "sent_at": "2026-10-28T15:26:21.869931566Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "09c1e3f4-5b32-4594-98a5-76732fe64e1f",
  "code": "702945",
  "device_ref": "sandbox-1095"
}
```

```json
{
  "session_id": "bf5c4950-ecbf-4e4b-ba53-ef0415dd6c34",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjA4MiwiaWF0IjoxNzkzMjAxMTgyLCJqdGkiOiIwNmRkNWYyMi1mYTJkLTRmNzktYWFhYS00Mjk0MjMxNzQ1Y2YiLCJzaWQiOiJiZjVjNDk1MC1lY2JmLTRlNGItYmE1My1lZjA0MTVkZDZjMzQifQ.ibFLmFGDsjsPasTMcXPyFeFbqrbcpTZtiEfnTlHsn1c",
  "access_expires_at": "2026-10-28T15:41:22.166268568Z",
  "refresh_token": "KcUgqxDLJ3hwv8YCvmN20NWlyOYDZm2VO_ULjXRJRdc",
  "refresh_expires_at": "2026-11-27T15:26:22.165695276Z",
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
  "device_ref": "sandbox-23517"
}
```

```json
{
  "challenge_id": "a01c73c5-d4e0-45c4-a0c2-a315c5b555ac",
  "expires_at": "2026-10-28T15:31:22.702357434Z",
  "resend_available_at": "2026-10-28T15:26:23.702357434Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "068412",
  "sent_at": "2026-10-28T15:26:22.704717275Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a01c73c5-d4e0-45c4-a0c2-a315c5b555ac",
  "code": "068412",
  "device_ref": "sandbox-23517"
}
```

```json
{
  "session_id": "13c72c12-ce4f-4270-8d0e-96326d323356",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjA4MywiaWF0IjoxNzkzMjAxMTgzLCJqdGkiOiJlNGFjMTc3ZC1lZDU0LTQyZjEtYjc4Ny0xOWZhYmIyMzM5ODEiLCJzaWQiOiIxM2M3MmMxMi1jZTRmLTQyNzAtOGQwZS05NjMyNmQzMjMzNTYifQ.cFSixLzCLVCPIVpnzDOPJEhxF5p5uHsiO4nREPHoG1k",
  "access_expires_at": "2026-10-28T15:41:23.000772746Z",
  "refresh_token": "992oHUZnxDZYNVkGXY0lyGKAmZFGF4w9ycE2WTDxtf8",
  "refresh_expires_at": "2026-11-27T15:26:23.000014929Z",
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
  "command_id": "2f311d93-e229-4fc7-9fd3-4f81f7475f60",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:26:23Z",
    "sequence": 1793201183547
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6e7f7f33-425f-4959-a26e-9294da735442",
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
  "last_heartbeat_at": "2026-10-28T15:26:23.567289Z",
  "last_location_at": "2026-10-28T15:26:23.567289Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-4286"
}
```

```json
{
  "challenge_id": "b7b17a05-ad45-45cc-989b-854db808a4d9",
  "expires_at": "2026-10-28T15:31:23.836314083Z",
  "resend_available_at": "2026-10-28T15:26:24.836314083Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "350803",
  "sent_at": "2026-10-28T15:26:23.838647136Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b7b17a05-ad45-45cc-989b-854db808a4d9",
  "code": "350803",
  "device_ref": "sandbox-4286"
}
```

```json
{
  "session_id": "60bbee7a-bab3-42d0-a40c-16746a7fdd07",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjA4NCwiaWF0IjoxNzkzMjAxMTg0LCJqdGkiOiJiMjIyYjQ2ZC01OWIyLTQ5M2UtYTgwMC00MDhlODBlMjAxYmMiLCJzaWQiOiI2MGJiZWU3YS1iYWIzLTQyZDAtYTQwYy0xNjc0NmE3ZmRkMDcifQ.PdP8FJHM7jFDbGz7-FXOk-1AyM9crUvxoZ1two2236g",
  "access_expires_at": "2026-10-28T15:41:24.132678349Z",
  "refresh_token": "DH0YqiSlGm8PiLNkWjbf_SArpg16KgnqMsg_8g89DZ8",
  "refresh_expires_at": "2026-11-27T15:26:24.132071574Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cb30b3d8-b959-47d5-9cec-b976c3cdc2f0",
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
  "last_heartbeat_at": "2026-10-28T15:25:26.550836Z",
  "last_location_at": "2026-10-28T15:25:26.550836Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/cb30b3d8-b959-47d5-9cec-b976c3cdc2f0/handover` → **200**

```json
{
  "command_id": "1fe1becc-ea1d-489e-b3ca-3e1a8e6d0e12",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cb30b3d8-b959-47d5-9cec-b976c3cdc2f0",
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
  "last_heartbeat_at": "2026-10-28T15:25:26.550836Z",
  "last_location_at": "2026-10-28T15:25:26.550836Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/cb30b3d8-b959-47d5-9cec-b976c3cdc2f0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:26:24Z",
    "sequence": 1793201184950
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cb30b3d8-b959-47d5-9cec-b976c3cdc2f0",
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
  "last_heartbeat_at": "2026-10-28T15:26:24.971402Z",
  "last_location_at": "2026-10-28T15:26:24.971402Z",
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
  "session_id": "29862395-c66d-49b6-818a-8b23e695d2c8",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIwODUsImlhdCI6MTc5MzIwMTE4NSwianRpIjoiNTNjZTE3NzItZjNjYi00ODgxLThlZTktOWQ4MDY0NTg5YjZiIiwic2lkIjoiMjk4NjIzOTUtYzY2ZC00OWI2LTgxOGEtOGIyM2U2OTVkMmM4In0.sQg1FGCGuMtx9_jkl1T_5YY37t4C46tQOuANdKDlOjk",
  "access_expires_at": "2026-10-28T15:41:25.541484835Z",
  "refresh_token": "I82mviFb-3S1EgRRhLuhP6-XigXXTAJE2PhWajG09Ok",
  "refresh_expires_at": "2026-10-29T03:26:25.54089363Z",
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
  "session_id": "ec043cc2-5122-48e8-a504-3bb29b3a57f6",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIwODYsImlhdCI6MTc5MzIwMTE4NiwianRpIjoiNzFlZGUyNWQtMzdlZS00OGNiLWJjMmYtM2IxY2ZkYzQ0NzAwIiwic2lkIjoiZWMwNDNjYzItNTEyMi00OGU4LWE1MDQtM2JiMjliM2E1N2Y2In0.cjt43iD6Xf05B3gMsDxnyeWtEC5c2baLOkLWASvdF9A",
  "access_expires_at": "2026-10-28T15:41:26.09522373Z",
  "refresh_token": "MNXgEjHl2JNvfhmU6gpU5wKIN0U374b4bYVGVbVNiQE",
  "refresh_expires_at": "2026-10-29T03:26:26.094629533Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380684636503",
  "device_ref": "sandbox-29602"
}
```

```json
{
  "challenge_id": "187b45a1-63a2-4d1c-8102-f208d908e991",
  "expires_at": "2026-10-28T15:31:26.358775919Z",
  "resend_available_at": "2026-10-28T15:26:27.358775919Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380684636503` → **200**

```json
{
  "phone": "+380684636503",
  "audience": "CLIENT",
  "code": "727728",
  "sent_at": "2026-10-28T15:26:26.361305507Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "187b45a1-63a2-4d1c-8102-f208d908e991",
  "code": "727728",
  "device_ref": "sandbox-29602"
}
```

```json
{
  "session_id": "00d67ae8-11d6-466e-b8bd-2112837170e9",
  "subject": {
    "type": "CLIENT",
    "id": "f58010bb-b9a3-43d1-9bfe-0e88be2ecef1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNTgwMTBiYi1iOWEzLTQzZDEtOWJmZS0wZTg4YmUyZWNlZjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMDg2LCJpYXQiOjE3OTMyMDExODYsImp0aSI6IjhkNTAyYTY1LTA0ZWYtNDhhNi1hZmE1LTk3NzgxMWViM2MwNCIsInNpZCI6IjAwZDY3YWU4LTExZDYtNDY2ZS1iOGJkLTIxMTI4MzcxNzBlOSJ9.WGW25TtZoK3HWkbzfPo3rdGlxgBXfFn6skkck5JCyFE",
  "access_expires_at": "2026-10-28T15:41:26.657288291Z",
  "refresh_token": "SeIEtQ1o-2A0qgBf2VGF4PpgSReoro8miaSTXiy5JJc",
  "refresh_expires_at": "2026-11-27T15:26:26.656716352Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "48e2ec0f-4614-4642-9bac-fa91f59a0912",
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
  "id": "081ab82f-9d20-4f97-b7dd-3cd2972a44d0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:31:26.940907Z",
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
  "command_id": "97d631b1-e13c-410c-ade3-3f784e6b4d6e",
  "quote_id": "081ab82f-9d20-4f97-b7dd-3cd2972a44d0",
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
  "id": "d2e44b80-9223-436f-90a0-bea11482be48",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f58010bb-b9a3-43d1-9bfe-0e88be2ecef1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:26:27.231329Z",
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
    "id": "25098c42-cb7d-44c5-993a-7a2347304488",
    "order_id": "d2e44b80-9223-436f-90a0-bea11482be48",
    "expires_at": "2026-10-28T15:26:42.234684Z",
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

`POST /api/driver/v1/offers/25098c42-cb7d-44c5-993a-7a2347304488/reject` → **204**

```json
{
  "command_id": "308aed50-f6c4-4fab-8aeb-876a108118d9"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "85cf8fc5-da0f-4577-beb4-7255c9d612e2",
    "order_id": "d2e44b80-9223-436f-90a0-bea11482be48",
    "expires_at": "2026-10-28T15:26:42.819679Z",
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

`POST /api/driver/v1/offers/85cf8fc5-da0f-4577-beb4-7255c9d612e2/accept` → **200**

```json
{
  "command_id": "08f4a203-56ad-4040-b068-b510c0328d7f"
}
```

```json
{
  "id": "8fd6deca-b9ce-48a9-abf6-d3668c16af3a",
  "order_id": "d2e44b80-9223-436f-90a0-bea11482be48",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e0748fcd-91a4-4a9d-bbd0-ee9266dd4a55",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/d2e44b80-9223-436f-90a0-bea11482be48/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:26:27.231823Z",
      "actor": {
        "type": "CLIENT",
        "id": "f58010bb-b9a3-43d1-9bfe-0e88be2ecef1",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d2e44b80-9223-436f-90a0-bea11482be48",
        "quote_id": "081ab82f-9d20-4f97-b7dd-3cd2972a44d0",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "fe8c348b-f874-43a6-abbe-35f532a92507"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:26:27.233782Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d2e44b80-9223-436f-90a0-bea11482be48",
        "attempt_id": "f15904d2-4b41-49da-9cb4-d8b1e1bb30c0",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "fe8c348b-f874-43a6-abbe-35f532a92507"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T15:26:27.241527Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "25098c42-cb7d-44c5-993a-7a2347304488",
        "order_id": "d2e44b80-9223-436f-90a0-bea11482be48",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "fe8c348b-f874-43a6-abbe-35f532a92507"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T15:26:27.818576Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "25098c42-cb7d-44c5-993a-7a2347304488",
        "order_id": "d2e44b80-9223-436f-90a0-bea11482be48"
      },
      "correlation_id": "0cc31666-03dd-47d2-93c1-2e5a6c0e9473"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order d2e44b80-9223-436f-90a0-bea11482be48 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/d2e44b80-9223-436f-90a0-bea11482be48` → **200**

```json
{
  "id": "d2e44b80-9223-436f-90a0-bea11482be48",
  "short_number": 6,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "f58010bb-b9a3-43d1-9bfe-0e88be2ecef1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "8fd6deca-b9ce-48a9-abf6-d3668c16af3a",
    "order_id": "d2e44b80-9223-436f-90a0-bea11482be48",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "e0748fcd-91a4-4a9d-bbd0-ee9266dd4a55",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T15:26:27.231329Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d2e44b80-9223-436f-90a0-bea11482be48/cancel` → **200**

```json
{
  "command_id": "a8669476-771e-4a87-881f-ca32084187d7",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "d2e44b80-9223-436f-90a0-bea11482be48",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "f58010bb-b9a3-43d1-9bfe-0e88be2ecef1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "8fd6deca-b9ce-48a9-abf6-d3668c16af3a",
    "order_id": "d2e44b80-9223-436f-90a0-bea11482be48",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "e0748fcd-91a4-4a9d-bbd0-ee9266dd4a55",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T15:26:27.231329Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин"
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
  "session_id": "6e7f7f33-425f-4959-a26e-9294da735442",
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
  "last_heartbeat_at": "2026-10-28T15:26:23.567289Z",
  "last_location_at": "2026-10-28T15:26:23.567289Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6e7f7f33-425f-4959-a26e-9294da735442/close` → **200**

```json
{
  "command_id": "a1458c10-1425-4cdd-b3c3-1038cc8e5a52",
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
  "session_id": "cb30b3d8-b959-47d5-9cec-b976c3cdc2f0",
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
  "last_heartbeat_at": "2026-10-28T15:26:24.971402Z",
  "last_location_at": "2026-10-28T15:26:24.971402Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cb30b3d8-b959-47d5-9cec-b976c3cdc2f0/close` → **200**

```json
{
  "command_id": "40a5ba96-d2f8-450b-9af8-5f3b2c674cea",
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
  "device_ref": "sandbox-2965"
}
```

```json
{
  "challenge_id": "ac146fee-ed03-4f92-992a-20289eed779f",
  "expires_at": "2026-10-28T15:31:30.746629834Z",
  "resend_available_at": "2026-10-28T15:26:31.746629834Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "930344",
  "sent_at": "2026-10-28T15:26:30.748989685Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ac146fee-ed03-4f92-992a-20289eed779f",
  "code": "930344",
  "device_ref": "sandbox-2965"
}
```

```json
{
  "session_id": "3c8dc69c-239b-441c-a06c-f1ab73d6afa4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjA5MSwiaWF0IjoxNzkzMjAxMTkxLCJqdGkiOiIzNTFlMjJjOS02OTRiLTQwMDMtYTEzZS05NDhlODNkZjhmNTciLCJzaWQiOiIzYzhkYzY5Yy0yMzliLTQ0MWMtYTA2Yy1mMWFiNzNkNmFmYTQifQ.trPEYEmYmHar0p4AWiKMeqadqaU_r3qlmHkzbwe87oQ",
  "access_expires_at": "2026-10-28T15:41:31.050873226Z",
  "refresh_token": "VN6GvKY0mkecTIRluWXJWGNpXMEW3PGSQoL2W7dCxk8",
  "refresh_expires_at": "2026-11-27T15:26:31.05021813Z",
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
  "command_id": "1d894358-e792-46d9-b42e-c639172d7bc8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:26:31Z",
    "sequence": 1793201191595
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7592154f-9f85-4b7a-9f44-e9c49bd12e5f",
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
  "last_heartbeat_at": "2026-10-28T15:26:31.614581Z",
  "last_location_at": "2026-10-28T15:26:31.614581Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679662868",
  "device_ref": "sandbox-26016"
}
```

```json
{
  "challenge_id": "79432185-e955-4adb-9df7-9c4d97d3079c",
  "expires_at": "2026-10-28T15:31:31.896388534Z",
  "resend_available_at": "2026-10-28T15:26:32.896388534Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679662868` → **200**

```json
{
  "phone": "+380679662868",
  "audience": "CLIENT",
  "code": "040753",
  "sent_at": "2026-10-28T15:26:31.89880974Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "79432185-e955-4adb-9df7-9c4d97d3079c",
  "code": "040753",
  "device_ref": "sandbox-26016"
}
```

```json
{
  "session_id": "8e522041-a36f-41b7-ba2a-ae7fe5b7f158",
  "subject": {
    "type": "CLIENT",
    "id": "78f94daa-fcaf-47d4-a928-a0a0ca0a2e03"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3OGY5NGRhYS1mY2FmLTQ3ZDQtYTkyOC1hMGEwY2EwYTJlMDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMDkyLCJpYXQiOjE3OTMyMDExOTIsImp0aSI6IjI5ODBiMDE5LWU0NjItNGQ3OS1hMWUwLTA0ZmZlOGQ5N2JhYSIsInNpZCI6IjhlNTIyMDQxLWEzNmYtNDFiNy1iYTJhLWFlN2ZlNWI3ZjE1OCJ9.e3esK3UZLEnxm4YPl-N6VAZTYK8PIWZCa44UCs3w-gI",
  "access_expires_at": "2026-10-28T15:41:32.190527188Z",
  "refresh_token": "bvqwuKLGOE75M83soYKJSHf2a-iGznh-8qIB6aWpqDc",
  "refresh_expires_at": "2026-11-27T15:26:32.189870308Z",
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
  "command_id": "56a05245-a629-4355-8e10-1b6d080c2329",
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
  "id": "07f3be13-d898-4ba9-9589-248cc299b312",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:31:32.737063Z",
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
  "command_id": "baa23747-a752-4893-8ec2-f152983db787",
  "platform": "ANDROID",
  "token": "sandbox-driver-d2596f1e-6a0e-4b3c-bb07-fa40f78dedd7"
}
```

```json
{
  "id": "71c1c563-b1b8-456d-8499-d4473c168435",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T15:26:33.026835Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "69dbacbd-a1d5-48c0-b16f-004a46dd05fc",
  "platform": "ANDROID",
  "token": "sandbox-rider-111bf2dc-6bcd-4ebe-89a7-cdc1bc68cbed"
}
```

```json
{
  "id": "53abe0a5-91f6-4481-be88-2831780fa3fb",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T15:26:33.325176Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "dbe89b69-0200-4ebd-af51-3cc7845055a9",
  "quote_id": "07f3be13-d898-4ba9-9589-248cc299b312",
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
  "id": "08b5e113-adbb-4f14-8fa2-0344fc8634de",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "78f94daa-fcaf-47d4-a928-a0a0ca0a2e03",
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
  "created_at": "2026-10-28T15:26:33.616932Z",
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
    "id": "8574054e-8d3c-4180-95d7-4d3d56dfd17d",
    "order_id": "08b5e113-adbb-4f14-8fa2-0344fc8634de",
    "expires_at": "2026-10-28T15:26:48.620367Z",
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

`POST /api/driver/v1/offers/8574054e-8d3c-4180-95d7-4d3d56dfd17d/accept` → **200**

```json
{
  "command_id": "5fba48df-1ac0-40a1-a1c3-20aa67fc8b68"
}
```

```json
{
  "id": "2ee1bd83-7791-4aa5-a1ec-7fdf6ebb86b4",
  "order_id": "08b5e113-adbb-4f14-8fa2-0344fc8634de",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a823122e-96ef-4093-b58b-ff98e35272ae",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T15:26:33.590Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T15:26:33.590Z` → **200**

```json
[
  {
    "at": "2026-10-28T15:26:34.771223568Z",
    "token_suffix": "8dedd7",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "7b55dfb9-1fc2-4ad3-bb80-9d1b2d8b18e3",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "08b5e113-adbb-4f14-8fa2-0344fc8634de",
      "order_version": "2"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380679662868&after=2026-10-28T15:26:33.590Z` → **200**

```json
[
  {
    "at": "2026-10-28T15:26:34.774485299Z",
    "token_suffix": "68cbed",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "509ff336-21d7-4c98-aeee-6bc5b53bc55d",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "08b5e113-adbb-4f14-8fa2-0344fc8634de",
      "order_version": "3"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/08b5e113-adbb-4f14-8fa2-0344fc8634de/messages` → **201**

```json
{
  "command_id": "33350509-0d1d-4d25-a549-1935f88c8019",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "f534a3f0-9d2f-444c-a37f-53b60e9bd681",
  "order_id": "08b5e113-adbb-4f14-8fa2-0344fc8634de",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T15:26:35.568111605Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a823122e-96ef-4093-b58b-ff98e35272ae",
  "order_id": "08b5e113-adbb-4f14-8fa2-0344fc8634de",
  "assignment_id": "2ee1bd83-7791-4aa5-a1ec-7fdf6ebb86b4",
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

`POST /api/driver/v1/trips/a823122e-96ef-4093-b58b-ff98e35272ae/messages` → **201**

```json
{
  "command_id": "6d016ac3-d6a9-4bbf-87a0-f885f27d993c",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "f469a842-edc7-4334-b207-0eb7dba02f92",
  "order_id": "08b5e113-adbb-4f14-8fa2-0344fc8634de",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T15:26:36.111939425Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/08b5e113-adbb-4f14-8fa2-0344fc8634de/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/a823122e-96ef-4093-b58b-ff98e35272ae/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380679662868"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/7592154f-9f85-4b7a-9f44-e9c49bd12e5f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:26:36Z",
    "sequence": 1793201196927
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7592154f-9f85-4b7a-9f44-e9c49bd12e5f",
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
  "last_heartbeat_at": "2026-10-28T15:26:36.947921Z",
  "last_location_at": "2026-10-28T15:26:36.947921Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a823122e-96ef-4093-b58b-ff98e35272ae",
  "order_id": "08b5e113-adbb-4f14-8fa2-0344fc8634de",
  "assignment_id": "2ee1bd83-7791-4aa5-a1ec-7fdf6ebb86b4",
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

`POST /api/driver/v1/trips/a823122e-96ef-4093-b58b-ff98e35272ae/arrive` → **200**

```json
{
  "command_id": "6c119f02-046f-4e78-ad1e-c0b6353d2bf4",
  "expected_version": 0
}
```

```json
{
  "id": "a823122e-96ef-4093-b58b-ff98e35272ae",
  "order_id": "08b5e113-adbb-4f14-8fa2-0344fc8634de",
  "assignment_id": "2ee1bd83-7791-4aa5-a1ec-7fdf6ebb86b4",
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
  "arrived_at": "2026-10-28T15:26:37.496447Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a823122e-96ef-4093-b58b-ff98e35272ae/start` → **200**

```json
{
  "command_id": "296b78b0-09f6-4191-b8ae-15c053b8eccc",
  "expected_version": 1
}
```

```json
{
  "id": "a823122e-96ef-4093-b58b-ff98e35272ae",
  "order_id": "08b5e113-adbb-4f14-8fa2-0344fc8634de",
  "assignment_id": "2ee1bd83-7791-4aa5-a1ec-7fdf6ebb86b4",
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
  "arrived_at": "2026-10-28T15:26:37.496447Z",
  "started_at": "2026-10-28T15:26:37.777093Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/7592154f-9f85-4b7a-9f44-e9c49bd12e5f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:26:38Z",
    "sequence": 1793201198446
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7592154f-9f85-4b7a-9f44-e9c49bd12e5f",
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
  "last_heartbeat_at": "2026-10-28T15:26:38.064861Z",
  "last_location_at": "2026-10-28T15:26:38.064861Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/a823122e-96ef-4093-b58b-ff98e35272ae/complete` → **200**

```json
{
  "command_id": "8f6699e9-a643-45ab-9c98-b82a5eada325",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:26:38Z",
  "cash_received": true
}
```

```json
{
  "id": "a823122e-96ef-4093-b58b-ff98e35272ae",
  "order_id": "08b5e113-adbb-4f14-8fa2-0344fc8634de",
  "assignment_id": "2ee1bd83-7791-4aa5-a1ec-7fdf6ebb86b4",
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
  "arrived_at": "2026-10-28T15:26:37.496447Z",
  "started_at": "2026-10-28T15:26:37.777093Z",
  "completed_at": "2026-10-28T15:26:38.360529Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/08b5e113-adbb-4f14-8fa2-0344fc8634de` → **200**

```json
{
  "id": "08b5e113-adbb-4f14-8fa2-0344fc8634de",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "78f94daa-fcaf-47d4-a928-a0a0ca0a2e03",
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
    "id": "2ee1bd83-7791-4aa5-a1ec-7fdf6ebb86b4",
    "order_id": "08b5e113-adbb-4f14-8fa2-0344fc8634de",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a823122e-96ef-4093-b58b-ff98e35272ae",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:26:33.616932Z",
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
    "id": "08b5e113-adbb-4f14-8fa2-0344fc8634de",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-28T15:26:33.616932Z",
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
    "id": "a823122e-96ef-4093-b58b-ff98e35272ae",
    "order_id": "08b5e113-adbb-4f14-8fa2-0344fc8634de",
    "order_short_number": 7,
    "created_at": "2026-10-28T15:26:34.187982Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "6cd8cfa3-e2bf-47a9-8947-be4678e8aea7",
    "order_id": "a75515b7-bba1-43d3-8a3f-5b4c996fbaf4",
    "order_short_number": 1,
    "created_at": "2026-10-28T15:25:05.479359Z",
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

`GET /api/rider/v1/orders/08b5e113-adbb-4f14-8fa2-0344fc8634de/tip` → **200**

```json
{
  "order_id": "08b5e113-adbb-4f14-8fa2-0344fc8634de",
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
  "available_until": "2026-10-29T15:26:38.360529Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/08b5e113-adbb-4f14-8fa2-0344fc8634de/tip` → **201**

```json
{
  "command_id": "2b58b1cc-4c2d-49ed-99ff-4f32a6da6f5c",
  "amount_minor": 1100
}
```

```json
{
  "id": "823bf018-4235-4bc2-9678-814b85e6f169",
  "order_id": "08b5e113-adbb-4f14-8fa2-0344fc8634de",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T15:26:43.303357Z"
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
  "session_id": "5535e582-1216-4b25-bfbc-b920417eecc8",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIxMDMsImlhdCI6MTc5MzIwMTIwMywianRpIjoiZDhhM2MyZDYtNTBjOS00NzBjLTk2NjAtZTU4Mjc0MzBmMjQxIiwic2lkIjoiNTUzNWU1ODItMTIxNi00YjI1LWJmYmMtYjkyMDQxN2VlY2M4In0.GA0H7wkHrT_FSR_31J1EC54Q1d69qfQNkRH9Vph_x8w",
  "access_expires_at": "2026-10-28T15:41:43.929570524Z",
  "refresh_token": "8mbjGufzWhUXCprOMjY70-_OwDXwyG2mu7lfVtTAStU",
  "refresh_expires_at": "2026-10-29T03:26:43.928891294Z",
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
          "DRIVER": 1,
          "STAFF": 1,
          "RIDER": 2
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
      "DRIVER": 1,
      "STAFF": 1,
      "RIDER": 2
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
  "generated_at": "2026-10-28T15:26:44.224486919Z"
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
  "generated_at": "2026-10-28T15:26:44.515930303Z"
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
  "session_id": "b8cc7391-92f2-40b1-8abd-5e967933f231",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIxMDUsImlhdCI6MTc5MzIwMTIwNSwianRpIjoiYTFiNThjMjctNzBmMy00ODFlLWJiMDYtNzY4NWM2NWY5OTY5Iiwic2lkIjoiYjhjYzczOTEtOTJmMi00MGIxLThhYmQtNWU5Njc5MzNmMjMxIn0.SenBrAbW4ms2XzQmZpUlgVilcO_GChtA4P2hKQe4IMc",
  "access_expires_at": "2026-10-28T15:41:45.091765298Z",
  "refresh_token": "TcPPK2BjR7QZrDVvM7S_JGusMUCx6xkeX2WXYQzDDAE",
  "refresh_expires_at": "2026-10-29T03:26:45.09112306Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/08b5e113-adbb-4f14-8fa2-0344fc8634de/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:26:33.617497Z",
      "actor": {
        "type": "CLIENT",
        "id": "78f94daa-fcaf-47d4-a928-a0a0ca0a2e03",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "08b5e113-adbb-4f14-8fa2-0344fc8634de",
        "quote_id": "07f3be13-d898-4ba9-9589-248cc299b312",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "d8a800be-cab1-45dc-8e78-83648e50a0d5"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:26:33.619475Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "08b5e113-adbb-4f14-8fa2-0344fc8634de",
        "attempt_id": "d66087ea-00bd-44ba-8b4c-ab2b249f8425",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "d8a800be-cab1-45dc-8e78-83648e50a0d5"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T15:26:33.626454Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "8574054e-8d3c-4180-95d7-4d3d56dfd17d",
        "order_id": "08b5e113-adbb-4f14-8fa2-0344fc8634de",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "d8a800be-cab1-45dc-8e78-83648e50a0d5"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T15:26:34.190134Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "8574054e-8d3c-4180-95d7-4d3d56dfd17d",
        "order_id": "08b5e113-adbb-4f14-8fa2-0344fc8634de",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "2ee1bd83-7791-4aa5-a1ec-7fdf6ebb86b4"
      },
      "correlation_id": "5b79871f-dca0-40c6-a007-8515ecefcaef"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T15:26:45.640003766Z",
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
      "last_location_at": "2026-10-28T15:26:38.064861Z",
      "order_id": null
    }
  ]
}
```

Done: order 08b5e113-adbb-4f14-8fa2-0344fc8634de.

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
  "session_id": "65ec66dc-74a8-4ad5-87b3-30cd557b4fd1",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIxMDYsImlhdCI6MTc5MzIwMTIwNiwianRpIjoiZWZmYmYyNTQtY2EzZi00Y2I4LTkxODMtZDBkZTBhNmJiNTdjIiwic2lkIjoiNjVlYzY2ZGMtNzRhOC00YWQ1LTg3YjMtMzBjZDU1N2I0ZmQxIn0.QbOsSwF7wdcGXQUu6uDzCSbeCNqPrWvHUt6yDA598e8",
  "access_expires_at": "2026-10-28T15:41:46.2337103Z",
  "refresh_token": "nqotdtY28WWWYXsCY2dy4lWh_MSYYgBOB57_kD5XQYY",
  "refresh_expires_at": "2026-10-29T03:26:46.23304412Z",
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
  "command_id": "f2533fb2-653d-4369-890e-781671a65f84",
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
  "timestamp": "2026-10-28T15:26:47.000+0000",
  "channel": {
    "id": "1730052000.2229930333",
    "linkedid": "1730052000.2229930333",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674578411"
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
  "timestamp": "2026-10-28T15:26:47.000+0000",
  "channel": {
    "id": "1730052000.2229930333",
    "linkedid": "1730052000.2229930333",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674578411"
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
  "session_id": "4bfcb945-dcf8-440f-97ca-78f1e70f65e9",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIxMDcsImlhdCI6MTc5MzIwMTIwNywianRpIjoiNTRjNGQwZWUtMTNkZS00ZmY2LTk5ZjItZWJkNGQ0Nzc1ODRkIiwic2lkIjoiNGJmY2I5NDUtZGNmOC00NDBmLTk3Y2EtNzhmMWU3MGY2NWU5In0.5F7v5H9U_1FxHKvDvBZQoSowdkjPDo3lXJKWAfciw4U",
  "access_expires_at": "2026-10-28T15:41:47.382952357Z",
  "refresh_token": "1E2WSwck9iqa_7n9ZAy9xCFlSIo935_SmeiBkgQT77o",
  "refresh_expires_at": "2026-10-29T03:26:47.382320239Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "80673af0-78cf-4bd1-92ba-672e29ba43e6",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674578411",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T15:26:47Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/80673af0-78cf-4bd1-92ba-672e29ba43e6/answer` → **200**

```json
{
  "command_id": "4284eabe-35cb-4df9-ab2b-71519b40c4da"
}
```

```json
{
  "id": "80673af0-78cf-4bd1-92ba-672e29ba43e6",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674578411",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
  "order_ids": [],
  "started_at": "2026-10-28T15:26:47Z",
  "answered_at": "2026-10-28T15:26:47.937121Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2229930333",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "5045be35-f304-4162-9181-3685e650f820",
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
  "id": "bb2708aa-97bd-48e3-81d9-afcaf63517cc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:31:48.241689Z",
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
  "command_id": "e671866a-f8f1-4c9a-98cb-d0301ff3d4de",
  "quote_id": "bb2708aa-97bd-48e3-81d9-afcaf63517cc",
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
    "phone": "+380674578411"
  },
  "call_id": "80673af0-78cf-4bd1-92ba-672e29ba43e6"
}
```

```json
{
  "id": "5f532be5-21ab-46b8-a45d-26ff3314214f",
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
  "created_at": "2026-10-28T15:26:48.560025Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674578411"
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
    "id": "1730052000.2229930333",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "80673af0-78cf-4bd1-92ba-672e29ba43e6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674578411",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
      "order_ids": [
        "5f532be5-21ab-46b8-a45d-26ff3314214f"
      ],
      "started_at": "2026-10-28T15:26:47Z",
      "answered_at": "2026-10-28T15:26:47.937121Z",
      "ended_at": "2026-10-28T15:26:48.858269Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "dddb7ef4-f7b3-44f0-8b11-987d4ee2bfa9",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670883913",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
      "order_ids": [],
      "started_at": "2026-10-28T15:25:13.547925Z",
      "answered_at": "2026-10-28T15:25:13.867052Z",
      "ended_at": "2026-10-28T15:25:14.169969Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:25:19.500092Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/5f532be5-21ab-46b8-a45d-26ff3314214f` → **200**

```json
{
  "id": "5f532be5-21ab-46b8-a45d-26ff3314214f",
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
  "created_at": "2026-10-28T15:26:48.560025Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674578411"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/5f532be5-21ab-46b8-a45d-26ff3314214f` → **200**

```json
{
  "id": "5f532be5-21ab-46b8-a45d-26ff3314214f",
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
  "created_at": "2026-10-28T15:26:48.560025Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674578411"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5f532be5-21ab-46b8-a45d-26ff3314214f/cancel` → **200**

```json
{
  "command_id": "f1c57494-4483-4328-9105-a0f76243793a",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "5f532be5-21ab-46b8-a45d-26ff3314214f",
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
  "created_at": "2026-10-28T15:26:48.560025Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674578411"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 80673af0-78cf-4bd1-92ba-672e29ba43e6 with order 5f532be5-21ab-46b8-a45d-26ff3314214f.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-27674"
}
```

```json
{
  "challenge_id": "3aef5bd8-5f01-470d-b825-e167ee3154ae",
  "expires_at": "2026-10-28T15:31:50.052169016Z",
  "resend_available_at": "2026-10-28T15:26:51.052169016Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "899946",
  "sent_at": "2026-10-28T15:26:50.054360723Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3aef5bd8-5f01-470d-b825-e167ee3154ae",
  "code": "899946",
  "device_ref": "sandbox-27674"
}
```

```json
{
  "session_id": "af9df10d-83d6-4fd5-a28b-61f3ba4ddb93",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjExMCwiaWF0IjoxNzkzMjAxMjEwLCJqdGkiOiJjZWNkZGM4ZS0xZDcxLTRiM2EtYjUwZC0wNDA3ZjIyMmM4MjYiLCJzaWQiOiJhZjlkZjEwZC04M2Q2LTRmZDUtYTI4Yi02MWYzYmE0ZGRiOTMifQ.yeGjSpWiB7Knk454U5dYIkueKZ6HWAkv6_Q_Wss-SFk",
  "access_expires_at": "2026-10-28T15:41:50.351904052Z",
  "refresh_token": "xTtBXLp6XO_SYbNUp4KBH3tUJIGyqmdszd77PkvX4Wc",
  "refresh_expires_at": "2026-11-27T15:26:50.351302719Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7592154f-9f85-4b7a-9f44-e9c49bd12e5f",
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
  "last_heartbeat_at": "2026-10-28T15:26:38.064861Z",
  "last_location_at": "2026-10-28T15:26:38.064861Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7592154f-9f85-4b7a-9f44-e9c49bd12e5f/handover` → **200**

```json
{
  "command_id": "a3d7dbf0-6875-47f8-94ed-74e84ca67e55",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7592154f-9f85-4b7a-9f44-e9c49bd12e5f",
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
  "last_heartbeat_at": "2026-10-28T15:26:38.064861Z",
  "last_location_at": "2026-10-28T15:26:38.064861Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7592154f-9f85-4b7a-9f44-e9c49bd12e5f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:26:51Z",
    "sequence": 1793201211157
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7592154f-9f85-4b7a-9f44-e9c49bd12e5f",
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
  "last_heartbeat_at": "2026-10-28T15:26:51.177502Z",
  "last_location_at": "2026-10-28T15:26:51.177502Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661802940",
  "device_ref": "sandbox-20767"
}
```

```json
{
  "challenge_id": "8fb27129-e69f-433f-aa94-b378defb9890",
  "expires_at": "2026-10-28T15:31:51.447792133Z",
  "resend_available_at": "2026-10-28T15:26:52.447792133Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661802940` → **200**

```json
{
  "phone": "+380661802940",
  "audience": "CLIENT",
  "code": "926897",
  "sent_at": "2026-10-28T15:26:51.450324821Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8fb27129-e69f-433f-aa94-b378defb9890",
  "code": "926897",
  "device_ref": "sandbox-20767"
}
```

```json
{
  "session_id": "6ec3e488-6a62-4cbf-8fee-524bc1888892",
  "subject": {
    "type": "CLIENT",
    "id": "e0ff25d2-c056-434b-b701-041cebe9e641"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMGZmMjVkMi1jMDU2LTQzNGItYjcwMS0wNDFjZWJlOWU2NDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMTExLCJpYXQiOjE3OTMyMDEyMTEsImp0aSI6ImViODU4NmRmLWZkMmQtNDVjMC1hZDFhLTNjZmU0NzI5YjU4MSIsInNpZCI6IjZlYzNlNDg4LTZhNjItNGNiZi04ZmVlLTUyNGJjMTg4ODg5MiJ9.lk36XsoCr43ivW5nq4804ku4b-jpNlYTFsQ42MdYRAQ",
  "access_expires_at": "2026-10-28T15:41:51.744657782Z",
  "refresh_token": "l0hbKnl8KKyHUEH8FEze7sFvGOzRd97RBt9XrWLFWVE",
  "refresh_expires_at": "2026-11-27T15:26:51.744058539Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "523bdf30-4d66-480e-b4b0-e16fddd3a471",
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
  "id": "5fd9b181-9c1f-4ecb-a59e-d09e11f0bbb9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:31:52.024597Z",
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
  "command_id": "7ce7c2b9-4a5e-445f-99cd-61554b56a6e0",
  "quote_id": "5fd9b181-9c1f-4ecb-a59e-d09e11f0bbb9",
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
  "id": "e537ea89-ffac-49bc-91a7-0a1b3ccae80d",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e0ff25d2-c056-434b-b701-041cebe9e641",
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
  "created_at": "2026-10-28T15:26:52.30773Z",
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
    "id": "10d1883f-5473-4dd1-bb33-783c16408580",
    "order_id": "e537ea89-ffac-49bc-91a7-0a1b3ccae80d",
    "expires_at": "2026-10-28T15:27:07.311831Z",
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

`POST /api/driver/v1/offers/10d1883f-5473-4dd1-bb33-783c16408580/accept` → **200**

```json
{
  "command_id": "1565932a-b2f5-442d-b408-c2a6e7b90f0b"
}
```

```json
{
  "id": "73a69c95-0496-4bc8-aa02-c0ba40360b3e",
  "order_id": "e537ea89-ffac-49bc-91a7-0a1b3ccae80d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a222e507-b1cd-4912-9aaa-c969dd01a426",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a222e507-b1cd-4912-9aaa-c969dd01a426",
  "order_id": "e537ea89-ffac-49bc-91a7-0a1b3ccae80d",
  "assignment_id": "73a69c95-0496-4bc8-aa02-c0ba40360b3e",
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

`POST /api/driver/v1/work-sessions/7592154f-9f85-4b7a-9f44-e9c49bd12e5f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:26:53Z",
    "sequence": 1793201213407
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7592154f-9f85-4b7a-9f44-e9c49bd12e5f",
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
  "last_heartbeat_at": "2026-10-28T15:26:53.428024Z",
  "last_location_at": "2026-10-28T15:26:53.428024Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a222e507-b1cd-4912-9aaa-c969dd01a426/arrive` → **200**

```json
{
  "command_id": "604e5c3f-141f-4ccd-ada2-d9f65bf658f5",
  "expected_version": 0
}
```

```json
{
  "id": "a222e507-b1cd-4912-9aaa-c969dd01a426",
  "order_id": "e537ea89-ffac-49bc-91a7-0a1b3ccae80d",
  "assignment_id": "73a69c95-0496-4bc8-aa02-c0ba40360b3e",
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
  "arrived_at": "2026-10-28T15:26:53.723535Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a222e507-b1cd-4912-9aaa-c969dd01a426/start` → **200**

```json
{
  "command_id": "b5c642f1-1c05-4931-b2e2-ea26ab92673c",
  "expected_version": 1
}
```

```json
{
  "id": "a222e507-b1cd-4912-9aaa-c969dd01a426",
  "order_id": "e537ea89-ffac-49bc-91a7-0a1b3ccae80d",
  "assignment_id": "73a69c95-0496-4bc8-aa02-c0ba40360b3e",
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
  "arrived_at": "2026-10-28T15:26:53.723535Z",
  "started_at": "2026-10-28T15:26:54.014741Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/7592154f-9f85-4b7a-9f44-e9c49bd12e5f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:26:54Z",
    "sequence": 1793201214299
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7592154f-9f85-4b7a-9f44-e9c49bd12e5f",
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
  "last_heartbeat_at": "2026-10-28T15:26:54.320081Z",
  "last_location_at": "2026-10-28T15:26:54.320081Z",
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
  "device_ref": "sandbox-4738"
}
```

```json
{
  "challenge_id": "6212f760-6e14-42b4-a6c8-39d3fabac368",
  "expires_at": "2026-10-28T15:31:54.592101976Z",
  "resend_available_at": "2026-10-28T15:26:55.592101976Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "013365",
  "sent_at": "2026-10-28T15:26:54.595527617Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6212f760-6e14-42b4-a6c8-39d3fabac368",
  "code": "013365",
  "device_ref": "sandbox-4738"
}
```

```json
{
  "session_id": "7b65979f-89bd-4db5-98be-2f43620e83c9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjExNCwiaWF0IjoxNzkzMjAxMjE0LCJqdGkiOiI3MDBlNDBkYS04MWM5LTRkNDItYjg0Ny0yMjVhZWFmYzAzNjYiLCJzaWQiOiI3YjY1OTc5Zi04OWJkLTRkYjUtOThiZS0yZjQzNjIwZTgzYzkifQ._3CcFxKJYBOKd5IHfKNxmd5tobxu_qs9YdWZ0ev_j8A",
  "access_expires_at": "2026-10-28T15:41:54.89508366Z",
  "refresh_token": "iEGOLhBGVHHTBb4QpH5Ay0cSXPj9DB-D52N-ACov5RM",
  "refresh_expires_at": "2026-11-27T15:26:54.894452201Z",
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
  "command_id": "42c05a6b-310c-4f2d-9288-c016ab88a5a3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:26:55Z",
    "sequence": 1793201215435
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8e7717a2-1f85-4ecf-9130-09a1cb2718ef",
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
  "last_heartbeat_at": "2026-10-28T15:26:55.454129Z",
  "last_location_at": "2026-10-28T15:26:55.454129Z",
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
  "session_id": "1982591d-82c5-403e-ae42-2464d1c66035",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIxMTYsImlhdCI6MTc5MzIwMTIxNiwianRpIjoiZTUwNjM0MDMtYTBiMS00MTE0LWI3NGEtZTcyMmE4MmYzMzE1Iiwic2lkIjoiMTk4MjU5MWQtODJjNS00MDNlLWFlNDItMjQ2NGQxYzY2MDM1In0.EHYtTFcsn078_NSg_PncrhINE1fu8RqWzScdYpzzitI",
  "access_expires_at": "2026-10-28T15:41:56.016599933Z",
  "refresh_token": "i0KFTDrYSOhh7aavQuIe7RXgsYiZBsONXLxnUuDSOcE",
  "refresh_expires_at": "2026-10-29T03:26:56.015990705Z",
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
  "session_id": "8e366627-8eb0-4508-8e18-5019472979e5",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIxMTYsImlhdCI6MTc5MzIwMTIxNiwianRpIjoiNjQ0Yzk0M2ItYTQ1Ny00NDM1LWIxYjMtNDc2MGYzOGFiYjI0Iiwic2lkIjoiOGUzNjY2MjctOGViMC00NTA4LThlMTgtNTAxOTQ3Mjk3OWU1In0.kNyzB6I5cb9R6j2DkBX9-JvOHHyuZ92IF4xBGf4NXvA",
  "access_expires_at": "2026-10-28T15:41:56.574972332Z",
  "refresh_token": "3AALy8oW4ppgirjgB1Bxmt6iEe8kzp9kjLDxpkdz_7A",
  "refresh_expires_at": "2026-10-29T03:26:56.574295873Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e537ea89-ffac-49bc-91a7-0a1b3ccae80d` → **200**

```json
{
  "id": "e537ea89-ffac-49bc-91a7-0a1b3ccae80d",
  "short_number": 9,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "e0ff25d2-c056-434b-b701-041cebe9e641",
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
    "id": "73a69c95-0496-4bc8-aa02-c0ba40360b3e",
    "order_id": "e537ea89-ffac-49bc-91a7-0a1b3ccae80d",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "a222e507-b1cd-4912-9aaa-c969dd01a426",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T15:26:52.30773Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e537ea89-ffac-49bc-91a7-0a1b3ccae80d/interrupt` → **200**

```json
{
  "command_id": "3d1ba0e7-a816-40c0-ad82-40533e5acdf5",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "e537ea89-ffac-49bc-91a7-0a1b3ccae80d",
    "short_number": 9,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "e0ff25d2-c056-434b-b701-041cebe9e641",
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
      "id": "73a69c95-0496-4bc8-aa02-c0ba40360b3e",
      "order_id": "e537ea89-ffac-49bc-91a7-0a1b3ccae80d",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "a222e507-b1cd-4912-9aaa-c969dd01a426",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T15:26:52.30773Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "12dd9cf4-ebf4-4350-8d2b-ccaf86bf1c8d",
    "short_number": 10,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "e0ff25d2-c056-434b-b701-041cebe9e641",
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
    "id": "c06cae72-c3c5-4f64-84aa-458724d5b441",
    "order_id": "12dd9cf4-ebf4-4350-8d2b-ccaf86bf1c8d",
    "expires_at": "2026-10-28T15:27:12.150304Z",
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

`POST /api/driver/v1/offers/c06cae72-c3c5-4f64-84aa-458724d5b441/accept` → **200**

```json
{
  "command_id": "c783f310-f796-4d36-9fad-7e2df52e1d1d"
}
```

```json
{
  "id": "c44b26e1-5fdf-423b-b362-384ffd45c8b4",
  "order_id": "12dd9cf4-ebf4-4350-8d2b-ccaf86bf1c8d",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0be2ba73-bbeb-4808-99a0-4fb70d6ca3f5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0be2ba73-bbeb-4808-99a0-4fb70d6ca3f5",
  "order_id": "12dd9cf4-ebf4-4350-8d2b-ccaf86bf1c8d",
  "assignment_id": "c44b26e1-5fdf-423b-b362-384ffd45c8b4",
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
  "session_id": "8e7717a2-1f85-4ecf-9130-09a1cb2718ef",
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
  "last_heartbeat_at": "2026-10-28T15:26:55.454129Z",
  "last_location_at": "2026-10-28T15:26:55.454129Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/8e7717a2-1f85-4ecf-9130-09a1cb2718ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:26:58Z",
    "sequence": 1793201218543
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8e7717a2-1f85-4ecf-9130-09a1cb2718ef",
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
  "last_heartbeat_at": "2026-10-28T15:26:58.56757Z",
  "last_location_at": "2026-10-28T15:26:58.56757Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0be2ba73-bbeb-4808-99a0-4fb70d6ca3f5/arrive` → **200**

```json
{
  "command_id": "839c600f-b16c-4004-b818-3dbf45606ad7",
  "expected_version": 0
}
```

```json
{
  "id": "0be2ba73-bbeb-4808-99a0-4fb70d6ca3f5",
  "order_id": "12dd9cf4-ebf4-4350-8d2b-ccaf86bf1c8d",
  "assignment_id": "c44b26e1-5fdf-423b-b362-384ffd45c8b4",
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
  "arrived_at": "2026-10-28T15:26:58.854668Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0be2ba73-bbeb-4808-99a0-4fb70d6ca3f5/start` → **200**

```json
{
  "command_id": "273ff9da-006b-4633-916e-4f16299cb643",
  "expected_version": 1
}
```

```json
{
  "id": "0be2ba73-bbeb-4808-99a0-4fb70d6ca3f5",
  "order_id": "12dd9cf4-ebf4-4350-8d2b-ccaf86bf1c8d",
  "assignment_id": "c44b26e1-5fdf-423b-b362-384ffd45c8b4",
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
  "arrived_at": "2026-10-28T15:26:58.854668Z",
  "started_at": "2026-10-28T15:26:59.131444Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0be2ba73-bbeb-4808-99a0-4fb70d6ca3f5/complete` → **200**

```json
{
  "command_id": "e70478d5-7d0f-4fa8-b062-f09aae0b8cdf",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:26:59Z"
}
```

```json
{
  "id": "0be2ba73-bbeb-4808-99a0-4fb70d6ca3f5",
  "order_id": "12dd9cf4-ebf4-4350-8d2b-ccaf86bf1c8d",
  "assignment_id": "c44b26e1-5fdf-423b-b362-384ffd45c8b4",
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
  "arrived_at": "2026-10-28T15:26:58.854668Z",
  "started_at": "2026-10-28T15:26:59.131444Z",
  "completed_at": "2026-10-28T15:26:59.424178Z",
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
    "id": "12dd9cf4-ebf4-4350-8d2b-ccaf86bf1c8d",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T15:26:57.140575Z",
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
    "id": "e537ea89-ffac-49bc-91a7-0a1b3ccae80d",
    "short_number": 9,
    "status": "CANCELLED",
    "created_at": "2026-10-28T15:26:52.30773Z",
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
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути"
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

`GET /api/operator/v1/orders/e537ea89-ffac-49bc-91a7-0a1b3ccae80d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:26:52.308301Z",
      "actor": {
        "type": "CLIENT",
        "id": "e0ff25d2-c056-434b-b701-041cebe9e641",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e537ea89-ffac-49bc-91a7-0a1b3ccae80d",
        "quote_id": "5fd9b181-9c1f-4ecb-a59e-d09e11f0bbb9",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "be37b7e8-6190-46d4-8e21-e3dbb31cb73b"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:26:52.310594Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e537ea89-ffac-49bc-91a7-0a1b3ccae80d",
        "attempt_id": "a2a6082e-696f-41ab-b677-f6df1fd818da",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "be37b7e8-6190-46d4-8e21-e3dbb31cb73b"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T15:26:52.315057Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "10d1883f-5473-4dd1-bb33-783c16408580",
        "order_id": "e537ea89-ffac-49bc-91a7-0a1b3ccae80d",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "be37b7e8-6190-46d4-8e21-e3dbb31cb73b"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T15:26:52.877655Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "10d1883f-5473-4dd1-bb33-783c16408580",
        "order_id": "e537ea89-ffac-49bc-91a7-0a1b3ccae80d",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "73a69c95-0496-4bc8-aa02-c0ba40360b3e"
      },
      "correlation_id": "b3fb7f15-c57f-4ab9-bf8c-01b686f4d177"
```

Done: interrupted e537ea89-ffac-49bc-91a7-0a1b3ccae80d, follow-up 12dd9cf4-ebf4-4350-8d2b-ccaf86bf1c8d.

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
  "session_id": "fbe36ba4-d0c5-4548-bc54-b4a054b20b8b",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIxMjMsImlhdCI6MTc5MzIwMTIyMywianRpIjoiMzEwMmZlYzctMDQ3Mi00ZDBiLTg1ODUtMTRhZTA3MDFiZDcxIiwic2lkIjoiZmJlMzZiYTQtZDBjNS00NTQ4LWJjNTQtYjRhMDU0YjIwYjhiIn0.fLlRVylNmsTNgdOxhM9hloywEgIhvUvhvxcDan3J1wc",
  "access_expires_at": "2026-10-28T15:42:03.84089747Z",
  "refresh_token": "A3Wsnfe58PHDeNRm751c_XTFEE9KKPQL3HPqV1wZOH8",
  "refresh_expires_at": "2026-10-29T03:27:03.840319369Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "65ba1075-14d4-45aa-b917-906093672842",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T15:27:04Z"
}
```

```json
{
  "id": "4b6f0692-0306-49e1-a142-2c373d1f96b5",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T15:27:04Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/4b6f0692-0306-49e1-a142-2c373d1f96b5/publish` → **200**

```json
{
  "command_id": "ff78fc94-8435-48f3-829b-212864d996ef",
  "expected_version": 0
}
```

```json
{
  "id": "4b6f0692-0306-49e1-a142-2c373d1f96b5",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T15:27:04.424572Z",
  "published_at": "2026-10-28T15:27:04.424572Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "4b6f0692-0306-49e1-a142-2c373d1f96b5",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T15:27:04.424572Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631923173",
  "device_ref": "sandbox-24709"
}
```

```json
{
  "challenge_id": "e9572185-5331-4d6b-b1ec-f0b3aa6b1d59",
  "expires_at": "2026-10-28T15:32:04.98134699Z",
  "resend_available_at": "2026-10-28T15:27:05.98134699Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631923173` → **200**

```json
{
  "phone": "+380631923173",
  "audience": "CLIENT",
  "code": "213395",
  "sent_at": "2026-10-28T15:27:04.983628125Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9572185-5331-4d6b-b1ec-f0b3aa6b1d59",
  "code": "213395",
  "device_ref": "sandbox-24709"
}
```

```json
{
  "session_id": "dc423664-9d67-479a-9674-7d10b5641d0c",
  "subject": {
    "type": "CLIENT",
    "id": "8dfd7404-3867-44b4-b4b8-ed0dad8c0890"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZGZkNzQwNC0zODY3LTQ0YjQtYjRiOC1lZDBkYWQ4YzA4OTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMTI1LCJpYXQiOjE3OTMyMDEyMjUsImp0aSI6ImIxMDZiOWIwLTJkZjctNGEyYS1iM2QxLWU1MTU3YTY0MDY1NSIsInNpZCI6ImRjNDIzNjY0LTlkNjctNDc5YS05Njc0LTdkMTBiNTY0MWQwYyJ9.EfpBmjNwEAAR0gcGargUcJld1gde0vYzVHh97dnb-Vc",
  "access_expires_at": "2026-10-28T15:42:05.27639242Z",
  "refresh_token": "VWGB17uPu7ciWMNnMyS6tKaLQL0H5ecM6uDIUx4meu0",
  "refresh_expires_at": "2026-11-27T15:27:05.275706128Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "4b6f0692-0306-49e1-a142-2c373d1f96b5",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T15:27:04.424572Z",
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
  "command_id": "165f8a7c-c152-44dd-9d1d-bb39a1932221",
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
  "id": "2ddd12d9-5393-46d4-a0c1-c28c28a9593f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:32:05.823704Z",
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
  "command_id": "724ef775-46b3-4080-9beb-d0a2fc2b0a29",
  "quote_id": "2ddd12d9-5393-46d4-a0c1-c28c28a9593f",
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
  "correlation_id": "c40ba720-50c3-45dd-a6fa-0ff3dc31d3d1"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "e3ac6603-fb83-4604-a3c6-d552e6ca6f2f",
  "version_id": "4b6f0692-0306-49e1-a142-2c373d1f96b5",
  "language": "uk"
}
```

```json
{
  "version_id": "4b6f0692-0306-49e1-a142-2c373d1f96b5",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T15:27:06.393598Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "71d87d1a-36ad-42d4-88d9-d9ac77e12d93",
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
  "id": "ff34d0d6-211f-480a-8330-cc45bff8bd3c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:32:06.671060Z",
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
  "command_id": "fee6fa0b-e1ba-4ee0-bfbf-96ead5db3aef",
  "quote_id": "ff34d0d6-211f-480a-8330-cc45bff8bd3c",
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
  "id": "cc087ce9-4b71-4e9c-be48-5301600a751b",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8dfd7404-3867-44b4-b4b8-ed0dad8c0890",
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
  "created_at": "2026-10-28T15:27:06.953551Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/cc087ce9-4b71-4e9c-be48-5301600a751b` → **200**

```json
{
  "id": "cc087ce9-4b71-4e9c-be48-5301600a751b",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8dfd7404-3867-44b4-b4b8-ed0dad8c0890",
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
  "created_at": "2026-10-28T15:27:06.953551Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/cc087ce9-4b71-4e9c-be48-5301600a751b/cancel` → **200**

```json
{
  "command_id": "9c47784a-5496-4db8-98d2-b2982034f514",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "cc087ce9-4b71-4e9c-be48-5301600a751b",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8dfd7404-3867-44b4-b4b8-ed0dad8c0890",
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
  "created_at": "2026-10-28T15:27:06.953551Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
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

`POST /api/admin/v1/legal-documents/4b6f0692-0306-49e1-a142-2c373d1f96b5` → **409**

```json
{
  "command_id": "13046d8b-78e4-4583-9957-48f64d646d5b",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T15:27:07Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/4b6f0692-0306-49e1-a142-2c373d1f96b5",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "67d3adc0-baec-4b68-a2d6-2c2dd69b9394"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "b453e37f-5453-4dbd-9d57-c6154b3ab77a",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T15:27:08Z"
}
```

```json
{
  "id": "12911d2f-5ea9-4c85-9c4d-536d99dc6fec",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T15:27:08Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/12911d2f-5ea9-4c85-9c4d-536d99dc6fec/publish` → **200**

```json
{
  "command_id": "1084c868-bebc-49f4-a974-8b57cd1836ee",
  "expected_version": 0
}
```

```json
{
  "id": "12911d2f-5ea9-4c85-9c4d-536d99dc6fec",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T15:27:08.386325Z",
  "published_at": "2026-10-28T15:27:08.386325Z",
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
  "device_ref": "sandbox-6206"
}
```

```json
{
  "challenge_id": "9a743f2e-9b72-4b8d-9799-52a1f2efb0ec",
  "expires_at": "2026-10-28T15:32:08.672166904Z",
  "resend_available_at": "2026-10-28T15:27:09.672166904Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "526877",
  "sent_at": "2026-10-28T15:27:08.674337428Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9a743f2e-9b72-4b8d-9799-52a1f2efb0ec",
  "code": "526877",
  "device_ref": "sandbox-6206"
}
```

```json
{
  "session_id": "45974ac9-68fe-47cc-916c-5affc8d3db58",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjEyOCwiaWF0IjoxNzkzMjAxMjI4LCJqdGkiOiIzYTIxOGZkNy04Njk3LTQ2MTctOWFkOC1jZDBmYjZjZDU1ZDEiLCJzaWQiOiI0NTk3NGFjOS02OGZlLTQ3Y2MtOTE2Yy01YWZmYzhkM2RiNTgifQ.yELyieyPHuJUuvSxwTI1EKdXWT4fB5y_AXrfWvA2JZM",
  "access_expires_at": "2026-10-28T15:42:08.98167101Z",
  "refresh_token": "_HdH_T1gsGGujxLSJaJXhR5cdTfkX2xXd9VF7j6Xsx4",
  "refresh_expires_at": "2026-11-27T15:27:08.981085249Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8e7717a2-1f85-4ecf-9130-09a1cb2718ef",
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
  "last_heartbeat_at": "2026-10-28T15:26:58.56757Z",
  "last_location_at": "2026-10-28T15:26:58.56757Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8e7717a2-1f85-4ecf-9130-09a1cb2718ef/handover` → **200**

```json
{
  "command_id": "acf150f9-8034-4e7c-a7db-9da1c0708bb8",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8e7717a2-1f85-4ecf-9130-09a1cb2718ef",
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
  "last_heartbeat_at": "2026-10-28T15:26:58.56757Z",
  "last_location_at": "2026-10-28T15:26:58.56757Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8e7717a2-1f85-4ecf-9130-09a1cb2718ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:27:09Z",
    "sequence": 1793201229818
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8e7717a2-1f85-4ecf-9130-09a1cb2718ef",
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
  "last_heartbeat_at": "2026-10-28T15:27:09.83829Z",
  "last_location_at": "2026-10-28T15:27:09.83829Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676490142",
  "device_ref": "sandbox-11931"
}
```

```json
{
  "challenge_id": "a9b9c3b7-3729-4211-8831-f230b4ddbc39",
  "expires_at": "2026-10-28T15:32:10.115081091Z",
  "resend_available_at": "2026-10-28T15:27:11.115081091Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676490142` → **200**

```json
{
  "phone": "+380676490142",
  "audience": "CLIENT",
  "code": "143960",
  "sent_at": "2026-10-28T15:27:10.117524408Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a9b9c3b7-3729-4211-8831-f230b4ddbc39",
  "code": "143960",
  "device_ref": "sandbox-11931"
}
```

```json
{
  "session_id": "bd26110a-a3ed-486b-8b45-723efec4f22f",
  "subject": {
    "type": "CLIENT",
    "id": "4b39f981-bc44-44e8-9095-dd6757a24de1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YjM5Zjk4MS1iYzQ0LTQ0ZTgtOTA5NS1kZDY3NTdhMjRkZTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMTMwLCJpYXQiOjE3OTMyMDEyMzAsImp0aSI6ImJlYjEwZDg3LWM3OGMtNDYwNi05NWNhLTg3YzUxYjNiZmY3OCIsInNpZCI6ImJkMjYxMTBhLWEzZWQtNDg2Yi04YjQ1LTcyM2VmZWM0ZjIyZiJ9.6df_Bonrh7FScoLduEnGyr17cKvgS856ZX4Mjb5Vv2w",
  "access_expires_at": "2026-10-28T15:42:10.415974984Z",
  "refresh_token": "R_JO4ZpRtsZMgxyJagyedct1NQYKP-okSiMYNRco4g0",
  "refresh_expires_at": "2026-11-27T15:27:10.415468877Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e4852008-9565-48b4-99c1-0d6fe1779e57",
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
  "id": "3ee5bbf9-5dac-477c-8d63-a7b4108ff22f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:32:10.692509Z",
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
  "command_id": "bf980964-fc6b-4951-8222-37ddf9847bbe",
  "quote_id": "3ee5bbf9-5dac-477c-8d63-a7b4108ff22f",
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
    "phone": "+380675041191"
  }
}
```

```json
{
  "id": "193a81c8-af96-4891-a8ac-5618b0a6a0a8",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b39f981-bc44-44e8-9095-dd6757a24de1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:27:10.974911Z",
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
    "id": "79250ade-57f8-433d-8fcf-97453965dfa8",
    "order_id": "193a81c8-af96-4891-a8ac-5618b0a6a0a8",
    "expires_at": "2026-10-28T15:27:25.978413Z",
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

`POST /api/driver/v1/offers/79250ade-57f8-433d-8fcf-97453965dfa8/accept` → **200**

```json
{
  "command_id": "2da5c944-e746-4078-bc5d-444c78ab0014"
}
```

```json
{
  "id": "4ac8326d-b26f-4dcd-abc5-d42a654f4586",
  "order_id": "193a81c8-af96-4891-a8ac-5618b0a6a0a8",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "816db3a2-c5ca-4b49-abaa-047626a85feb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "816db3a2-c5ca-4b49-abaa-047626a85feb",
  "order_id": "193a81c8-af96-4891-a8ac-5618b0a6a0a8",
  "assignment_id": "4ac8326d-b26f-4dcd-abc5-d42a654f4586",
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
    "phone": "+380675041191"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2ecb3854-9411-462d-8fe9-37f20383a1fb",
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
  "id": "798fb171-18dc-476e-927e-4fe429158b29",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:32:12.120214Z",
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
  "command_id": "fea9a39a-3a43-4e0d-88fb-1455f4894d8f",
  "quote_id": "798fb171-18dc-476e-927e-4fe429158b29",
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
  "id": "5ddde60b-8a8e-4d7a-a4e4-5d403431e7b1",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b39f981-bc44-44e8-9095-dd6757a24de1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T15:27:12.403977Z",
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
  "command_id": "b5904707-1b7a-46bc-9a18-51c5884245ac",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T18:27:12Z"
}
```

```json
{
  "id": "bdbd6d38-1ec6-4ded-9109-3bdf29d1cf0e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:32:12.705957Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T18:27:12Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ae133dd7-33b8-4a13-8427-dbc1234d033a",
  "quote_id": "bdbd6d38-1ec6-4ded-9109-3bdf29d1cf0e",
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
  "pickup_at": "2026-10-28T18:27:12Z"
}
```

```json
{
  "id": "324c8c55-3c74-42f9-b754-7515a9feaf6b",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4b39f981-bc44-44e8-9095-dd6757a24de1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T15:27:12.99592Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T18:27:12Z",
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
  "command_id": "843e239c-15bd-4f8f-b0d4-e53a799520de",
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
  "id": "450371e0-27e6-472c-8d22-6f946f01bcd0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:32:13.292810Z",
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
  "command_id": "06961ede-e713-4344-9ed9-c53cecc7d129",
  "quote_id": "450371e0-27e6-472c-8d22-6f946f01bcd0",
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
  "correlation_id": "74e28a2c-b2d0-43a5-a67a-6bee6e07e535"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "324c8c55-3c74-42f9-b754-7515a9feaf6b",
      "short_number": 14,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "4b39f981-bc44-44e8-9095-dd6757a24de1",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T15:27:12.99592Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T18:27:12Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "5ddde60b-8a8e-4d7a-a4e4-5d403431e7b1",
      "short_number": 13,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "4b39f981-bc44-44e8-9095-dd6757a24de1",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-28T15:27:12.403977Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "193a81c8-af96-4891-a8ac-5618b0a6a0a8",
      "short_number": 12,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "4b39f981-bc44-44e8-9095-dd6757a24de1",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "5ddde60b-8a8e-4d7a-a4e4-5d403431e7b1",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b39f981-bc44-44e8-9095-dd6757a24de1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T15:27:12.403977Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/193a81c8-af96-4891-a8ac-5618b0a6a0a8` → **200**

```json
{
  "id": "193a81c8-af96-4891-a8ac-5618b0a6a0a8",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4b39f981-bc44-44e8-9095-dd6757a24de1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "4ac8326d-b26f-4dcd-abc5-d42a654f4586",
    "order_id": "193a81c8-af96-4891-a8ac-5618b0a6a0a8",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "816db3a2-c5ca-4b49-abaa-047626a85feb",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T15:27:10.974911Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/193a81c8-af96-4891-a8ac-5618b0a6a0a8/cancel` → **200**

```json
{
  "command_id": "7e7a0d9e-5abf-4826-a7e5-1622d634647e",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "193a81c8-af96-4891-a8ac-5618b0a6a0a8",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "4b39f981-bc44-44e8-9095-dd6757a24de1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "4ac8326d-b26f-4dcd-abc5-d42a654f4586",
    "order_id": "193a81c8-af96-4891-a8ac-5618b0a6a0a8",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "816db3a2-c5ca-4b49-abaa-047626a85feb",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T15:27:10.974911Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/5ddde60b-8a8e-4d7a-a4e4-5d403431e7b1` → **200**

```json
{
  "id": "5ddde60b-8a8e-4d7a-a4e4-5d403431e7b1",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b39f981-bc44-44e8-9095-dd6757a24de1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T15:27:12.403977Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/5ddde60b-8a8e-4d7a-a4e4-5d403431e7b1/cancel` → **200**

```json
{
  "command_id": "e3f97432-c939-465b-a168-9e777e9fa3e2",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5ddde60b-8a8e-4d7a-a4e4-5d403431e7b1",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4b39f981-bc44-44e8-9095-dd6757a24de1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:27:12.403977Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/324c8c55-3c74-42f9-b754-7515a9feaf6b` → **200**

```json
{
  "id": "324c8c55-3c74-42f9-b754-7515a9feaf6b",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4b39f981-bc44-44e8-9095-dd6757a24de1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T15:27:12.99592Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T18:27:12Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/324c8c55-3c74-42f9-b754-7515a9feaf6b/cancel` → **200**

```json
{
  "command_id": "f26b7e6c-af3b-4572-afb7-fc343f42b31d",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "324c8c55-3c74-42f9-b754-7515a9feaf6b",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "4b39f981-bc44-44e8-9095-dd6757a24de1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T15:27:12.99592Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
    }
  },
  "pickup_at": "2026-10-28T18:27:12Z",
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
  "session_id": "8e7717a2-1f85-4ecf-9130-09a1cb2718ef",
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
  "last_heartbeat_at": "2026-10-28T15:27:09.83829Z",
  "last_location_at": "2026-10-28T15:27:09.83829Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8e7717a2-1f85-4ecf-9130-09a1cb2718ef/close` → **200**

```json
{
  "command_id": "78456b02-198f-4ec5-bdbf-292c18aab5ad",
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

Done: orders 193a81c8-af96-4891-a8ac-5618b0a6a0a8, 5ddde60b-8a8e-4d7a-a4e4-5d403431e7b1, 324c8c55-3c74-42f9-b754-7515a9feaf6b.

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
  "session_id": "c7f36353-ce48-4cbf-a541-7d9924c4e241",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIxMzcsImlhdCI6MTc5MzIwMTIzNywianRpIjoiMmJkZDczNTMtNzAyMi00ZDliLWE4ZWEtNGViNDc4OTZjNTY1Iiwic2lkIjoiYzdmMzYzNTMtY2U0OC00Y2JmLWE1NDEtN2Q5OTI0YzRlMjQxIn0.CflTHnUvb-UgUdNj4At4z5GF78pZprZ8GPqu1pL1UJA",
  "access_expires_at": "2026-10-28T15:42:17.043069723Z",
  "refresh_token": "_-QfnzEfKjX5QXJP_Zf_nPhL_SzMkAu_m5qqKjnIVAI",
  "refresh_expires_at": "2026-10-29T03:27:17.042432542Z",
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
  "session_id": "be911484-92e2-4078-ac68-1daf81bf6fe8",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIxMzcsImlhdCI6MTc5MzIwMTIzNywianRpIjoiZmRhNGMwZjQtZWU4Zi00NzI2LWIyNzAtMTcyMDExNDMwOWMwIiwic2lkIjoiYmU5MTE0ODQtOTJlMi00MDc4LWFjNjgtMWRhZjgxYmY2ZmU4In0.juzq8XdIjCbGVUUzR4zjOl4CDTf4wSV1lUIWxdXS3U0",
  "access_expires_at": "2026-10-28T15:42:17.603601623Z",
  "refresh_token": "TgUXe-cOSMnqAs6LSY1r1nLx1wfERDCgki0vOP_76ro",
  "refresh_expires_at": "2026-10-29T03:27:17.603041617Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17702"
}
```

```json
{
  "challenge_id": "4a72a3a9-30d2-4df7-a3f6-e82141a60ab6",
  "expires_at": "2026-10-28T15:32:17.8691984Z",
  "resend_available_at": "2026-10-28T15:27:18.8691984Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "273558",
  "sent_at": "2026-10-28T15:27:17.871581865Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4a72a3a9-30d2-4df7-a3f6-e82141a60ab6",
  "code": "273558",
  "device_ref": "sandbox-17702"
}
```

```json
{
  "session_id": "fc6a9f0c-ae5d-428b-9935-596efd751ef5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjEzOCwiaWF0IjoxNzkzMjAxMjM4LCJqdGkiOiI2OWQ3MmUzZS1lYTY0LTQyMDItYjVkMC1kMTkzYzZjMmIyZTgiLCJzaWQiOiJmYzZhOWYwYy1hZTVkLTQyOGItOTkzNS01OTZlZmQ3NTFlZjUifQ.9K4vcUZ8UIZ7YY4t_d7-BcQ0ulqny4MAUtG2KlcFACI",
  "access_expires_at": "2026-10-28T15:42:18.173611338Z",
  "refresh_token": "lqd6BeTJrqkT91-XyS__5BYL2oRqiG-E_Peaqt2sPDQ",
  "refresh_expires_at": "2026-11-27T15:27:18.173048074Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7592154f-9f85-4b7a-9f44-e9c49bd12e5f",
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
  "last_heartbeat_at": "2026-10-28T15:26:54.320081Z",
  "last_location_at": "2026-10-28T15:26:54.320081Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7592154f-9f85-4b7a-9f44-e9c49bd12e5f/handover` → **200**

```json
{
  "command_id": "56f4745e-b3b4-4ae6-9f6e-0911ee0370fe",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7592154f-9f85-4b7a-9f44-e9c49bd12e5f",
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
  "last_heartbeat_at": "2026-10-28T15:26:54.320081Z",
  "last_location_at": "2026-10-28T15:26:54.320081Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7592154f-9f85-4b7a-9f44-e9c49bd12e5f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:27:19Z",
    "sequence": 1793201239496
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7592154f-9f85-4b7a-9f44-e9c49bd12e5f",
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
  "last_heartbeat_at": "2026-10-28T15:27:19.024603Z",
  "last_location_at": "2026-10-28T15:27:19.024603Z",
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
  "command_id": "0fe63811-a61e-4188-b785-b141200c3fd6",
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
  "effective_at": "2026-10-28T15:27:19.583862Z",
  "changed_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T15:27:19.862532945Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7f3b0008-3e4e-44e1-bf55-cf6ad3c25e42",
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
  "id": "80599737-64f8-4bc4-86f7-1ff954a9d44d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:32:20.145322Z",
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
  "command_id": "9d4fb069-4063-4c36-a4ae-ebe24b270ed9",
  "quote_id": "80599737-64f8-4bc4-86f7-1ff954a9d44d",
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
    "phone": "+3806711123555"
  }
}
```

```json
{
  "id": "29d219a1-b26e-41ba-ab40-50508ce43404",
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
  "created_at": "2026-10-28T15:27:20.43301Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711123555"
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
    "id": "8ded01fe-398a-48f3-9824-fa7ea013887f",
    "order_id": "29d219a1-b26e-41ba-ab40-50508ce43404",
    "expires_at": "2026-10-28T15:27:35.436624Z",
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

`POST /api/driver/v1/offers/8ded01fe-398a-48f3-9824-fa7ea013887f/accept` → **200**

```json
{
  "command_id": "3ce01018-2e80-49f0-b9aa-bca39fe7c5d3"
}
```

```json
{
  "id": "474d598f-b03f-49c9-9d33-f641522504cb",
  "order_id": "29d219a1-b26e-41ba-ab40-50508ce43404",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4eeaefaa-f288-437c-a50f-ab13bd1e05ce",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4eeaefaa-f288-437c-a50f-ab13bd1e05ce",
  "order_id": "29d219a1-b26e-41ba-ab40-50508ce43404",
  "assignment_id": "474d598f-b03f-49c9-9d33-f641522504cb",
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
    "phone": "+3806711123555"
  }
}
```

`POST /api/driver/v1/work-sessions/7592154f-9f85-4b7a-9f44-e9c49bd12e5f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:27:21Z",
    "sequence": 1793201241524
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7592154f-9f85-4b7a-9f44-e9c49bd12e5f",
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
  "last_heartbeat_at": "2026-10-28T15:27:21.544347Z",
  "last_location_at": "2026-10-28T15:27:21.544347Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4eeaefaa-f288-437c-a50f-ab13bd1e05ce/arrive` → **200**

```json
{
  "command_id": "a0cb7026-6491-4b02-bf51-9cf57f8eb921",
  "expected_version": 0
}
```

```json
{
  "id": "4eeaefaa-f288-437c-a50f-ab13bd1e05ce",
  "order_id": "29d219a1-b26e-41ba-ab40-50508ce43404",
  "assignment_id": "474d598f-b03f-49c9-9d33-f641522504cb",
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
  "arrived_at": "2026-10-28T15:27:21.830084Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711123555"
  }
}
```

`POST /api/driver/v1/trips/4eeaefaa-f288-437c-a50f-ab13bd1e05ce/start` → **200**

```json
{
  "command_id": "80ff8d6a-f1ed-4880-a34a-b1d431e1ec8b",
  "expected_version": 1
}
```

```json
{
  "id": "4eeaefaa-f288-437c-a50f-ab13bd1e05ce",
  "order_id": "29d219a1-b26e-41ba-ab40-50508ce43404",
  "assignment_id": "474d598f-b03f-49c9-9d33-f641522504cb",
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
  "arrived_at": "2026-10-28T15:27:21.830084Z",
  "started_at": "2026-10-28T15:27:22.119327Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711123555"
  }
}
```

`POST /api/driver/v1/trips/4eeaefaa-f288-437c-a50f-ab13bd1e05ce/complete` → **200**

```json
{
  "command_id": "a70a2a6d-b117-4828-ae7e-890556f3022f",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:27:22Z",
  "cash_received": true
}
```

```json
{
  "id": "4eeaefaa-f288-437c-a50f-ab13bd1e05ce",
  "order_id": "29d219a1-b26e-41ba-ab40-50508ce43404",
  "assignment_id": "474d598f-b03f-49c9-9d33-f641522504cb",
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
  "arrived_at": "2026-10-28T15:27:21.830084Z",
  "started_at": "2026-10-28T15:27:22.119327Z",
  "completed_at": "2026-10-28T15:27:22.415457Z",
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
  "command_id": "4423754c-b2b5-41a3-8089-e65fea44b86a",
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
  "id": "d15e34d9-0cc6-4de0-a241-e278a4ab775e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:32:22.716757Z",
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
  "command_id": "87bfe879-5267-4e58-8030-0cc19d123bfa",
  "quote_id": "d15e34d9-0cc6-4de0-a241-e278a4ab775e",
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
    "phone": "+3806711121654"
  }
}
```

```json
{
  "id": "91d51527-fa7d-44a7-91b4-64e44a3cca9e",
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
  "created_at": "2026-10-28T15:27:23.004778Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121654"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/91d51527-fa7d-44a7-91b4-64e44a3cca9e` → **200**

```json
{
  "id": "91d51527-fa7d-44a7-91b4-64e44a3cca9e",
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
  "created_at": "2026-10-28T15:27:23.004778Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121654"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/91d51527-fa7d-44a7-91b4-64e44a3cca9e/cancel` → **200**

```json
{
  "command_id": "2dfacf66-68c6-403c-a30d-2e9ec0590010",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "91d51527-fa7d-44a7-91b4-64e44a3cca9e",
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
  "created_at": "2026-10-28T15:27:23.004778Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121654"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "pl": "Błąd operatora",
      "uk": "Помилка оператора",
      "en": "Operator error",
      "ru": "Ошибка оператора"
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
  "staff_id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T15:27:22.420871Z",
  "last_entries": [
    {
      "order_id": "91d51527-fa7d-44a7-91b4-64e44a3cca9e",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T15:27:23.596051Z"
    },
    {
      "order_id": "29d219a1-b26e-41ba-ab40-50508ce43404",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T15:27:22.420871Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7592154f-9f85-4b7a-9f44-e9c49bd12e5f",
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
  "last_heartbeat_at": "2026-10-28T15:27:21.544347Z",
  "last_location_at": "2026-10-28T15:27:21.544347Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7592154f-9f85-4b7a-9f44-e9c49bd12e5f/close` → **200**

```json
{
  "command_id": "f004cbef-54e0-468b-a0f7-f7f224cd152a",
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

Done: operator bonus for fulfilled 29d219a1-b26e-41ba-ab40-50508ce43404 and operator-fault cancellation 91d51527-fa7d-44a7-91b4-64e44a3cca9e.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679022533",
  "device_ref": "sandbox-219"
}
```

```json
{
  "challenge_id": "385a4fa8-129f-4ccc-87ac-77878a2cbfe5",
  "expires_at": "2026-10-28T15:32:26.742777665Z",
  "resend_available_at": "2026-10-28T15:27:27.742777665Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679022533` → **200**

```json
{
  "phone": "+380679022533",
  "audience": "CLIENT",
  "code": "136703",
  "sent_at": "2026-10-28T15:27:26.745148012Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678542674",
  "device_ref": "sandbox-6516",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "22a8e429-3e9a-4c58-a178-d4d8717b8479",
  "expires_at": "2026-10-28T15:32:27.053391834Z",
  "resend_available_at": "2026-10-28T15:27:28.053391834Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678542674` → **200**

```json
{
  "phone": "+380678542674",
  "audience": "CLIENT",
  "code": "464451",
  "sent_at": "2026-10-28T15:27:27.055535133Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671610000",
  "device_ref": "sandbox-27811"
}
```

```json
{
  "challenge_id": "a4b9d8ce-266a-4cdd-95a1-4f48c00908cf",
  "expires_at": "2026-10-28T15:32:27.354279622Z",
  "resend_available_at": "2026-10-28T15:27:28.354279622Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671610000` → **200**

```json
{
  "phone": "+380671610000",
  "audience": "CLIENT",
  "code": "818109",
  "sent_at": "2026-10-28T15:27:27.35714057Z",
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
  "session_id": "6c9bf89e-938e-4d4e-9af0-7ce7e3b57727",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIxNDcsImlhdCI6MTc5MzIwMTI0NywianRpIjoiOTIxNDJmYjMtNjE5My00MWUxLTlmOTktNzMxZTIyNTU2YzFhIiwic2lkIjoiNmM5YmY4OWUtOTM4ZS00ZDRlLTlhZjAtN2NlN2UzYjU3NzI3In0.6kXjuxvhHYfXPnOLZ_EoDSVXnpg4rIBUxLStG4JapdE",
  "access_expires_at": "2026-10-28T15:42:27.940359478Z",
  "refresh_token": "OmemTxJdhASaQIGwqlsTnzwi-zrFbbmfU3FjVgjUAHU",
  "refresh_expires_at": "2026-10-29T03:27:27.93976164Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380671610000` → **200**

```json
{
  "deliveries": [
    {
      "id": "6ae09187-56fd-4666-8165-edf61062845c",
      "challenge_id": "a4b9d8ce-266a-4cdd-95a1-4f48c00908cf",
      "phone": "+380671610000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-7e69af1b-1432-4b79-a93a-e68bcdb86ab5",
      "error": null,
      "attempted_at": "2026-10-28T15:27:27.357406Z"
    },
    {
      "id": "5041922d-12d0-40aa-b30b-508e0d1b44e4",
      "challenge_id": "a4b9d8ce-266a-4cdd-95a1-4f48c00908cf",
      "phone": "+380671610000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T15:27:27.356647Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380671610000` → **200**

```json
{
  "phone": "+380671610000",
  "audience": "CLIENT",
  "code": "818109",
  "sent_at": "2026-10-28T15:27:27.35714057Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678542674` → **200**

```json
{
  "deliveries": [
    {
      "id": "62e72ca5-78ac-47e1-94dd-bb29b90f93ac",
      "challenge_id": "22a8e429-3e9a-4c58-a178-d4d8717b8479",
      "phone": "+380678542674",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-05d19ab9-80cb-4230-9547-2b44ec1d5dcf",
      "error": null,
      "attempted_at": "2026-10-28T15:27:27.055776Z"
    }
  ]
}
```

Done: SMS to +380679022533, a call to +380678542674, SMS then a call to +380671610000.

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
  "session_id": "c382c19d-b312-4a95-ba75-84066d4ae5d8",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIxNDksImlhdCI6MTc5MzIwMTI0OSwianRpIjoiMmY0ZGI2MTEtZWRiNC00NmE5LTg0YjUtMGEyOTQ5MWQ1YWEyIiwic2lkIjoiYzM4MmMxOWQtYjMxMi00YTk1LWJhNzUtODQwNjZkNGFlNWQ4In0.oJQfuNZiC_RAyxpIMUF5JttZVhzw_po8OL4o1-3emCU",
  "access_expires_at": "2026-10-28T15:42:29.096831502Z",
  "refresh_token": "tK1EGO4qdqLOXU9WSMRAxqv9rVF-tMnNYUzx1K4q6Zg",
  "refresh_expires_at": "2026-10-29T03:27:29.096304046Z",
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
  "session_id": "084ace9a-68c8-4ae8-a81b-0ef8f7aa78e3",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIxNDksImlhdCI6MTc5MzIwMTI0OSwianRpIjoiMGJiZDBjZjEtMmJjZi00NzhmLWJjYTgtYzVlM2I1MTU1NzM1Iiwic2lkIjoiMDg0YWNlOWEtNjhjOC00YWU4LWE4MWItMGVmOGY3YWE3OGUzIn0.dPRk4KQVfBpGNHXQdfZAOoSAtDUBp2Vus8JdiooQ9xo",
  "access_expires_at": "2026-10-28T15:42:29.654522875Z",
  "refresh_token": "OqW1y-caqwHoG8OJo40_cKISTDvNea8NgKRfavPeS78",
  "refresh_expires_at": "2026-10-29T03:27:29.653933977Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
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

`POST /api/admin/v1/staff-extensions/b0a8b628-d86b-4ee3-a7c0-ad4e97261073` → **200**

```json
{
  "command_id": "fb59192c-4015-4a39-bf1a-ffff8ab9978e",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "e25ab292-258c-4a46-a8e2-490e1ea76a94",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T15:27:30.748204Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T15:27:30.748204Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "9e58479d-b724-4588-a27b-d80b51fe18aa",
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
  "id": "abcff94c-e203-4502-8bce-b6ad6d732625",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:32:31.287956Z",
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
  "command_id": "e6d3c386-5562-47c4-9775-f1a9900e7e6e",
  "quote_id": "abcff94c-e203-4502-8bce-b6ad6d732625",
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
    "phone": "+380673318275"
  }
}
```

```json
{
  "id": "3bd26914-457b-4a61-b489-380acfed5f9b",
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
  "created_at": "2026-10-28T15:27:31.574359Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673318275"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/3bd26914-457b-4a61-b489-380acfed5f9b/calls` → **201**

```json
{
  "command_id": "54cee7d1-1b0c-4bc3-90d9-59fd40fc184d",
  "to": "CALLER"
}
```

```json
{
  "id": "5e64e160-9f08-4f75-aac5-5e1cb420569c",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
  "order_ids": [
    "3bd26914-457b-4a61-b489-380acfed5f9b"
  ],
  "started_at": "2026-10-28T15:27:31.882646Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/3bd26914-457b-4a61-b489-380acfed5f9b/calls` → **201**

```json
{
  "command_id": "54cee7d1-1b0c-4bc3-90d9-59fd40fc184d",
  "to": "CALLER"
}
```

```json
{
  "id": "5e64e160-9f08-4f75-aac5-5e1cb420569c",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
  "order_ids": [
    "3bd26914-457b-4a61-b489-380acfed5f9b"
  ],
  "started_at": "2026-10-28T15:27:31.882646Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "5e64e160-9f08-4f75-aac5-5e1cb420569c",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380673318275",
    "at": "2026-10-28T15:27:31.884916362Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "5e64e160-9f08-4f75-aac5-5e1cb420569c",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.11193",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "5e64e160-9f08-4f75-aac5-5e1cb420569c"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "5e64e160-9f08-4f75-aac5-5e1cb420569c",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=3bd26914-457b-4a61-b489-380acfed5f9b` → **200**

```json
{
  "calls": [
    {
      "id": "5e64e160-9f08-4f75-aac5-5e1cb420569c",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
      "order_ids": [
        "3bd26914-457b-4a61-b489-380acfed5f9b"
      ],
      "started_at": "2026-10-28T15:27:31.882646Z",
      "answered_at": "2026-10-28T15:27:32.517011Z",
      "ended_at": "2026-10-28T15:27:32.538829Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=3bd26914-457b-4a61-b489-380acfed5f9b` → **200**

```json
{
  "calls": [
    {
      "id": "5e64e160-9f08-4f75-aac5-5e1cb420569c",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
      "order_ids": [
        "3bd26914-457b-4a61-b489-380acfed5f9b"
      ],
      "started_at": "2026-10-28T15:27:31.882646Z",
      "answered_at": "2026-10-28T15:27:32.517011Z",
      "ended_at": "2026-10-28T15:27:32.538829Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=3bd26914-457b-4a61-b489-380acfed5f9b` → **200**

```json
{
  "calls": [
    {
      "id": "5e64e160-9f08-4f75-aac5-5e1cb420569c",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
      "order_ids": [
        "3bd26914-457b-4a61-b489-380acfed5f9b"
      ],
      "started_at": "2026-10-28T15:27:31.882646Z",
      "answered_at": "2026-10-28T15:27:32.517011Z",
      "ended_at": "2026-10-28T15:27:32.538829Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=3bd26914-457b-4a61-b489-380acfed5f9b` → **200**

```json
{
  "calls": [
    {
      "id": "5e64e160-9f08-4f75-aac5-5e1cb420569c",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
      "order_ids": [
        "3bd26914-457b-4a61-b489-380acfed5f9b"
      ],
      "started_at": "2026-10-28T15:27:31.882646Z",
      "answered_at": "2026-10-28T15:27:32.517011Z",
      "ended_at": "2026-10-28T15:27:32.538829Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=3bd26914-457b-4a61-b489-380acfed5f9b` → **200**

```json
{
  "calls": [
    {
      "id": "5e64e160-9f08-4f75-aac5-5e1cb420569c",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
      "order_ids": [
        "3bd26914-457b-4a61-b489-380acfed5f9b"
      ],
      "started_at": "2026-10-28T15:27:31.882646Z",
      "answered_at": "2026-10-28T15:27:32.517011Z",
      "ended_at": "2026-10-28T15:27:32.538829Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:27:39.556736Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/3bd26914-457b-4a61-b489-380acfed5f9b` → **200**

```json
{
  "id": "3bd26914-457b-4a61-b489-380acfed5f9b",
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
  "created_at": "2026-10-28T15:27:31.574359Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673318275"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3bd26914-457b-4a61-b489-380acfed5f9b/cancel` → **200**

```json
{
  "command_id": "303cd918-831a-4ad4-843b-18e8ead95f8d",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "3bd26914-457b-4a61-b489-380acfed5f9b",
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
  "created_at": "2026-10-28T15:27:31.574359Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673318275"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин"
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
  "command_id": "229bc5d4-1e51-4217-8546-3a0a13cf7292",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T15:27:42.59677Z",
  "extension": "101"
}
```

Done: outgoing call 5e64e160-9f08-4f75-aac5-5e1cb420569c from order 3bd26914-457b-4a61-b489-380acfed5f9b, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639626957",
  "device_ref": "sandbox-6004"
}
```

```json
{
  "challenge_id": "6ce34a59-2eb3-48c2-be36-a81b531a93bb",
  "expires_at": "2026-10-28T15:32:42.875992159Z",
  "resend_available_at": "2026-10-28T15:27:43.875992159Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639626957` → **200**

```json
{
  "phone": "+380639626957",
  "audience": "CLIENT",
  "code": "098891",
  "sent_at": "2026-10-28T15:27:42.878293345Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6ce34a59-2eb3-48c2-be36-a81b531a93bb",
  "code": "098891",
  "device_ref": "sandbox-6004"
}
```

```json
{
  "session_id": "24f0ee53-30a5-4fde-aa06-46bb4f86a054",
  "subject": {
    "type": "CLIENT",
    "id": "5158036b-bfd0-41bb-86fe-5c1c0b102a15"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MTU4MDM2Yi1iZmQwLTQxYmItODZmZS01YzFjMGIxMDJhMTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMTYzLCJpYXQiOjE3OTMyMDEyNjMsImp0aSI6IjgzNjdiM2NiLWUwYzctNGRmNy1hZWM4LTFiZmZjNDY4MjU4MiIsInNpZCI6IjI0ZjBlZTUzLTMwYTUtNGZkZS1hYTA2LTQ2YmI0Zjg2YTA1NCJ9.p-CM9ucsrIQi1JJFgbK9Di_CHx1WxqrHyT4HFdpc6d0",
  "access_expires_at": "2026-10-28T15:42:43.162487467Z",
  "refresh_token": "QLVGL1LGGNhQv9TkiMpzsXDtKxrQWYXEAhphMl-ac_c",
  "refresh_expires_at": "2026-11-27T15:27:43.161925617Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "5158036b-bfd0-41bb-86fe-5c1c0b102a15",
  "session_id": "24f0ee53-30a5-4fde-aa06-46bb4f86a054",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639626957",
  "device_ref": "sandbox-29253"
}
```

```json
{
  "challenge_id": "30fdf43b-ae42-4bcf-97be-68ee9c1dc0a3",
  "expires_at": "2026-10-28T15:32:45.726093042Z",
  "resend_available_at": "2026-10-28T15:27:46.726093042Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639626957` → **200**

```json
{
  "phone": "+380639626957",
  "audience": "CLIENT",
  "code": "505967",
  "sent_at": "2026-10-28T15:27:45.728058685Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "30fdf43b-ae42-4bcf-97be-68ee9c1dc0a3",
  "code": "505967",
  "device_ref": "sandbox-29253"
}
```

```json
{
  "session_id": "ed882b36-d387-4241-a704-907f477d0016",
  "subject": {
    "type": "CLIENT",
    "id": "5158036b-bfd0-41bb-86fe-5c1c0b102a15"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MTU4MDM2Yi1iZmQwLTQxYmItODZmZS01YzFjMGIxMDJhMTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMTY2LCJpYXQiOjE3OTMyMDEyNjYsImp0aSI6Ijg4ODkyMGNmLWNiODQtNDFiNC1iYTA4LWNhNDA0NDVjZTU4NiIsInNpZCI6ImVkODgyYjM2LWQzODctNDI0MS1hNzA0LTkwN2Y0NzdkMDAxNiJ9.AfMzKo9EhUqjuy_38L3vt5Cv10S49NH0DsQueTg3yOo",
  "access_expires_at": "2026-10-28T15:42:46.022476856Z",
  "refresh_token": "Exvys_tO-IHVFCCl3VRcJ8vqn0CsOFytHw0LYeJgc_8",
  "refresh_expires_at": "2026-11-27T15:27:46.021833443Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "ca8e2460-8a10-48fa-8523-d14856b89cc4",
  "expires_at": "2026-10-28T15:32:48.297400344Z",
  "resend_available_at": "2026-10-28T15:27:49.297400344Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639626957` → **200**

```json
{
  "phone": "+380639626957",
  "audience": "CLIENT",
  "code": "314072",
  "sent_at": "2026-10-28T15:27:48.299451126Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380636641665"
}
```

```json
{
  "challenge_id": "6a56abb4-43bf-41a0-812a-17ff32785cf0",
  "expires_at": "2026-10-28T15:32:48.578191658Z",
  "resend_available_at": "2026-10-28T15:27:49.578191658Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636641665` → **200**

```json
{
  "phone": "+380636641665",
  "audience": "CLIENT",
  "code": "677322",
  "sent_at": "2026-10-28T15:27:48.579926513Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "7bd7d5a3-2e34-4f52-8478-ba85c242f2bb",
  "current_challenge_id": "ca8e2460-8a10-48fa-8523-d14856b89cc4",
  "current_code": "000000",
  "new_challenge_id": "6a56abb4-43bf-41a0-812a-17ff32785cf0",
  "new_code": "677322"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "6e47fcc9-8891-4849-8323-e9f83e31ce57"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "1d24779e-80c1-49e6-a315-4ab52d16d450",
  "current_challenge_id": "ca8e2460-8a10-48fa-8523-d14856b89cc4",
  "current_code": "314072",
  "new_challenge_id": "6a56abb4-43bf-41a0-812a-17ff32785cf0",
  "new_code": "677322"
}
```

```json
{
  "subject_id": "5158036b-bfd0-41bb-86fe-5c1c0b102a15",
  "phone": "+380636641665",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "5158036b-bfd0-41bb-86fe-5c1c0b102a15",
  "session_id": "24f0ee53-30a5-4fde-aa06-46bb4f86a054",
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
  "correlation_id": "4f4b01c0-d1b3-40c8-a866-0e0d5b8ab84a"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636641665",
  "device_ref": "sandbox-3423"
}
```

```json
{
  "challenge_id": "7d9c5dd4-222b-4c3d-bbbc-4c118bd5ec4d",
  "expires_at": "2026-10-28T15:32:52.005067729Z",
  "resend_available_at": "2026-10-28T15:27:53.005067729Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636641665` → **200**

```json
{
  "phone": "+380636641665",
  "audience": "CLIENT",
  "code": "535030",
  "sent_at": "2026-10-28T15:27:52.007215853Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7d9c5dd4-222b-4c3d-bbbc-4c118bd5ec4d",
  "code": "535030",
  "device_ref": "sandbox-3423"
}
```

```json
{
  "session_id": "319828d4-4948-4bca-a47b-11b5d01b7cda",
  "subject": {
    "type": "CLIENT",
    "id": "5158036b-bfd0-41bb-86fe-5c1c0b102a15"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MTU4MDM2Yi1iZmQwLTQxYmItODZmZS01YzFjMGIxMDJhMTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMTcyLCJpYXQiOjE3OTMyMDEyNzIsImp0aSI6IjkwZmVmNGI5LTdmNTUtNGY2Yy05MmQxLTljMjhkNzMzODgzMiIsInNpZCI6IjMxOTgyOGQ0LTQ5NDgtNGJjYS1hNDdiLTExYjVkMDFiN2NkYSJ9._xetrE7vgmerzLd0Xo0OGGyQgi7VyqG6_6ngL_JQeLY",
  "access_expires_at": "2026-10-28T15:42:52.295016467Z",
  "refresh_token": "W3sOD-yKfmDj-34uAUdx-EZQc47J4zo4MxMw86pOtJc",
  "refresh_expires_at": "2026-11-27T15:27:52.294436991Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "5158036b-bfd0-41bb-86fe-5c1c0b102a15",
  "session_id": "319828d4-4948-4bca-a47b-11b5d01b7cda",
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
  "session_id": "999c5400-f83f-4d8f-950a-73129ed48b1f",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIxNzMsImlhdCI6MTc5MzIwMTI3MywianRpIjoiNGM1ODMzYjktNWFiNC00YmZlLWExOWUtYTBiMjZkODhkMzY2Iiwic2lkIjoiOTk5YzU0MDAtZjgzZi00ZDhmLTk1MGEtNzMxMjllZDQ4YjFmIn0.Xmfe5-p5_XTVo31F9uoYtOQZOHX72FaRdvvldBl7_pk",
  "access_expires_at": "2026-10-28T15:42:53.115012637Z",
  "refresh_token": "_apLingv3JfSDnfc0MU8XDj8EF3BYZstZrx_XZEK7XY",
  "refresh_expires_at": "2026-10-29T03:27:53.114494478Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/5158036b-bfd0-41bb-86fe-5c1c0b102a15` → **200**

```json
{
  "client": {
    "id": "5158036b-bfd0-41bb-86fe-5c1c0b102a15",
    "phone": "+380636641665",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T15:27:43.160301Z",
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

`POST /api/admin/v1/clients/5158036b-bfd0-41bb-86fe-5c1c0b102a15/phone` → **400**

```json
{
  "command_id": "e37d74bf-0a4b-4e8d-80e0-2b57345ef290",
  "expected_version": 3,
  "phone": "+380631845850",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/5158036b-bfd0-41bb-86fe-5c1c0b102a15/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "7e5ad8a2-1d36-464e-ad41-35e38dd1b225",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/5158036b-bfd0-41bb-86fe-5c1c0b102a15/phone` → **200**

```json
{
  "command_id": "98aea62a-dbba-47e1-8edc-469a60062ece",
  "expected_version": 3,
  "phone": "+380631845850",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "5158036b-bfd0-41bb-86fe-5c1c0b102a15",
  "phone": "+380631845850",
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
  "correlation_id": "92907359-00e9-4397-80ab-7ba16794d809"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631845850",
  "device_ref": "sandbox-25304"
}
```

```json
{
  "challenge_id": "872afa0b-4db0-4295-80d5-0446f9f9523f",
  "expires_at": "2026-10-28T15:32:54.522320443Z",
  "resend_available_at": "2026-10-28T15:27:55.522320443Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631845850` → **200**

```json
{
  "phone": "+380631845850",
  "audience": "CLIENT",
  "code": "057043",
  "sent_at": "2026-10-28T15:27:54.524555329Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "872afa0b-4db0-4295-80d5-0446f9f9523f",
  "code": "057043",
  "device_ref": "sandbox-25304"
}
```

```json
{
  "session_id": "3d42dfaf-3e7e-4eca-8591-233c3926a394",
  "subject": {
    "type": "CLIENT",
    "id": "5158036b-bfd0-41bb-86fe-5c1c0b102a15"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MTU4MDM2Yi1iZmQwLTQxYmItODZmZS01YzFjMGIxMDJhMTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMTc0LCJpYXQiOjE3OTMyMDEyNzQsImp0aSI6ImRkMGFhOGJkLTk4YjEtNDBhZC04NzU5LTZiYzk0ZjkwMGUwYiIsInNpZCI6IjNkNDJkZmFmLTNlN2UtNGVjYS04NTkxLTIzM2MzOTI2YTM5NCJ9.bOAWfygj2ZL5gaw2OBguAzvZHOJinidaVm7vCil091U",
  "access_expires_at": "2026-10-28T15:42:54.822782494Z",
  "refresh_token": "k6LUwvBWRJFZw_4Lq5HFiK3JSF4aFVneDamQ_jOB4FI",
  "refresh_expires_at": "2026-11-27T15:27:54.821973021Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "5158036b-bfd0-41bb-86fe-5c1c0b102a15",
  "session_id": "3d42dfaf-3e7e-4eca-8591-233c3926a394",
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
  "phone": "+380634482615",
  "device_ref": "sandbox-447"
}
```

```json
{
  "challenge_id": "a17bc30d-9785-4d05-bff7-3a81a657ea57",
  "expires_at": "2026-10-28T15:32:55.36191084Z",
  "resend_available_at": "2026-10-28T15:27:56.36191084Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634482615` → **200**

```json
{
  "phone": "+380634482615",
  "audience": "CLIENT",
  "code": "407316",
  "sent_at": "2026-10-28T15:27:55.364168139Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a17bc30d-9785-4d05-bff7-3a81a657ea57",
  "code": "407316",
  "device_ref": "sandbox-447"
}
```

```json
{
  "session_id": "13e8fe60-ff84-42a5-befd-abf8ea929053",
  "subject": {
    "type": "CLIENT",
    "id": "92033f92-83b1-47e5-9fe7-3425f69ebae5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MjAzM2Y5Mi04M2IxLTQ3ZTUtOWZlNy0zNDI1ZjY5ZWJhZTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMTc1LCJpYXQiOjE3OTMyMDEyNzUsImp0aSI6IjdlNzVjODAwLThjNGMtNGQ0Yy1hMWZiLTUyNTI3NmZmMzVhNyIsInNpZCI6IjEzZThmZTYwLWZmODQtNDJhNS1iZWZkLWFiZjhlYTkyOTA1MyJ9.cYJ1RdYpthOocleckHr9UubZuKYClj2iyklacv6RNK8",
  "access_expires_at": "2026-10-28T15:42:55.657570892Z",
  "refresh_token": "WIhQMi5jAvcrbU7Yeqw07l4yKoAnk324J0oXNNZJS7c",
  "refresh_expires_at": "2026-11-27T15:27:55.656937635Z",
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
  "session_id": "c48e32b9-b158-466a-a3d7-83269db9d727",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIxNzYsImlhdCI6MTc5MzIwMTI3NiwianRpIjoiMGU0ZTE2YzYtNTkyOS00YjVkLWJmYzgtZDJiMmU2MzE4YTBkIiwic2lkIjoiYzQ4ZTMyYjktYjE1OC00NjZhLWEzZDctODMyNjlkYjlkNzI3In0.7laUJxVrRkPq95IaCFKK_oZ29DsKkmMKGp2b7LxF5gc",
  "access_expires_at": "2026-10-28T15:42:56.784781572Z",
  "refresh_token": "Fg_chLLVC5xEiDndHdj8J0zrVwLYUwY_WPxw0pA5WWw",
  "refresh_expires_at": "2026-10-29T03:27:56.784156681Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380634482615` → **200**

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
  "correlation_id": "f3108f05-1ac3-4912-9847-5f9123e56867"
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
  "session_id": "99865903-5fe6-4bee-ac4c-8ed115ec7e86",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIxNzcsImlhdCI6MTc5MzIwMTI3NywianRpIjoiZGRiMzQzMGUtNzQ3ZC00MmU3LTlmY2YtMWM4OThkNjJmYTU4Iiwic2lkIjoiOTk4NjU5MDMtNWZlNi00YmVlLWFjNGMtOGVkMTE1ZWM3ZTg2In0.wdpMQkLs2IsUFhU-RwR__viXiWA89A_YZMUlOSiw0O0",
  "access_expires_at": "2026-10-28T15:42:57.887375937Z",
  "refresh_token": "dCd6uLiXuDZgMLTv80Ac9ZNFNhM1S5p560mE6ZBNKIU",
  "refresh_expires_at": "2026-10-29T03:27:57.886760787Z",
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
  "changed_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
  "reason": "Sandbox clean-up",
  "changed_at": "2026-10-28T15:25:00.501885Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "964c2e7b-2d53-4291-99ef-07ae51b34e43",
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
  "changed_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T15:27:58.430576899Z"
}
```

## The rider books the airport for 2026-10-28T18:27:57Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600215658",
  "device_ref": "sandbox-5730"
}
```

```json
{
  "challenge_id": "ba5d128f-2341-493d-af37-5298a8fe137b",
  "expires_at": "2026-10-28T15:32:58.710853Z",
  "resend_available_at": "2026-10-28T15:27:59.710853Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600215658` → **200**

```json
{
  "phone": "+48600215658",
  "audience": "CLIENT",
  "code": "123193",
  "sent_at": "2026-10-28T15:27:58.713004187Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ba5d128f-2341-493d-af37-5298a8fe137b",
  "code": "123193",
  "device_ref": "sandbox-5730"
}
```

```json
{
  "session_id": "d7449126-ac66-4f5b-a756-4ca5122f7625",
  "subject": {
    "type": "CLIENT",
    "id": "140b0ede-75a8-4031-aa1f-5ebce9d60fa6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNDBiMGVkZS03NWE4LTQwMzEtYWExZi01ZWJjZTlkNjBmYTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMTc4LCJpYXQiOjE3OTMyMDEyNzgsImp0aSI6ImMyYWZiN2E0LTVhZDItNGUwYy05MTIxLTg4N2ZlYTE5YzEwYSIsInNpZCI6ImQ3NDQ5MTI2LWFjNjYtNGY1Yi1hNzU2LTRjYTUxMjJmNzYyNSJ9.IIkinf4zCQIGNkPkXEB-Najhc9nfE7IogWsdnE6VJzk",
  "access_expires_at": "2026-10-28T15:42:58.997472571Z",
  "refresh_token": "C1Al4JhG7fvXA1ntLD0kU9ZEtv_LqC2hO_8wpQsV4u0",
  "refresh_expires_at": "2026-11-27T15:27:58.996824269Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1c3e8a29-3ed8-4a83-8672-5dab7a608aa6",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T18:27:57Z"
}
```

```json
{
  "id": "204500ef-7590-4051-88fb-f20773b2f680",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:32:59.277143Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T18:27:57Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8241bdd3-9c5f-404e-80fd-8c68faa3c85d",
  "quote_id": "204500ef-7590-4051-88fb-f20773b2f680",
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
  "pickup_at": "2026-10-28T18:27:57Z"
}
```

```json
{
  "id": "e188d93b-8efe-400c-b5b5-669875959488",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "140b0ede-75a8-4031-aa1f-5ebce9d60fa6",
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
  "created_at": "2026-10-28T15:27:59.577918Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T18:27:57Z",
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
  "device_ref": "sandbox-3084"
}
```

```json
{
  "challenge_id": "7c1e6868-f81b-4b35-95df-55a48b73b644",
  "expires_at": "2026-10-28T15:32:59.866786066Z",
  "resend_available_at": "2026-10-28T15:28:00.866786066Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "690082",
  "sent_at": "2026-10-28T15:27:59.869545659Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7c1e6868-f81b-4b35-95df-55a48b73b644",
  "code": "690082",
  "device_ref": "sandbox-3084"
}
```

```json
{
  "session_id": "5ca28a9c-86f9-4434-800d-331b9a094918",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjE4MCwiaWF0IjoxNzkzMjAxMjgwLCJqdGkiOiJmMjc3NDM5ZC02MzNkLTQyNDUtOGViZi0yNDRmMjE2OGZkZDkiLCJzaWQiOiI1Y2EyOGE5Yy04NmY5LTQ0MzQtODAwZC0zMzFiOWEwOTQ5MTgifQ.zGwWfwDR56xCIXLGynyN1JR3VZrMfzL4bhMuOX3mq70",
  "access_expires_at": "2026-10-28T15:43:00.160569937Z",
  "refresh_token": "y9sRHLAUTCf9gfc7YIaR_qWGx6B2-TPhLPrmLRBDlGM",
  "refresh_expires_at": "2026-11-27T15:28:00.15990019Z",
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
  "command_id": "470f2bfe-e581-493f-a732-24148fb603e6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:28:00Z",
    "sequence": 1793201280698
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b980d9ad-2805-44a1-87aa-44a84996810f",
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
  "last_heartbeat_at": "2026-10-28T15:28:00.718188Z",
  "last_location_at": "2026-10-28T15:28:00.718188Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "e188d93b-8efe-400c-b5b5-669875959488",
      "short_number": 18,
      "pickup_at": "2026-10-28T18:27:57Z",
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

`POST /api/driver/v1/preorders/e188d93b-8efe-400c-b5b5-669875959488/reserve` → **200**

```json
{
  "command_id": "8a12cd57-dcec-4120-b7f5-0910510b9537"
}
```

```json
{
  "id": "706b9334-816f-440c-bdde-4f5c56c44b3a",
  "state": "RESERVED",
  "order": {
    "order_id": "e188d93b-8efe-400c-b5b5-669875959488",
    "short_number": 18,
    "pickup_at": "2026-10-28T18:27:57Z",
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
  "reserved_at": "2026-10-28T15:28:01.283673Z",
  "confirm_from": "2026-10-28T17:57:57Z",
  "confirm_until": "2026-10-28T18:07:57Z",
  "drop_until": "2026-10-28T17:27:57Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "706b9334-816f-440c-bdde-4f5c56c44b3a",
      "state": "RESERVED",
      "order": {
        "order_id": "e188d93b-8efe-400c-b5b5-669875959488",
        "short_number": 18,
        "pickup_at": "2026-10-28T18:27:57Z",
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
      "reserved_at": "2026-10-28T15:28:01.283673Z",
      "confirm_from": "2026-10-28T17:57:57Z",
      "confirm_until": "2026-10-28T18:07:57Z",
      "drop_until": "2026-10-28T17:27:57Z"
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
      "id": "706b9334-816f-440c-bdde-4f5c56c44b3a",
      "state": "RESERVED",
      "order": {
        "order_id": "e188d93b-8efe-400c-b5b5-669875959488",
        "short_number": 18,
        "pickup_at": "2026-10-28T18:27:57Z",
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
      "reserved_at": "2026-10-28T15:28:01.283673Z",
      "confirm_from": "2026-10-28T17:57:57Z",
      "confirm_until": "2026-10-28T18:07:57Z",
      "drop_until": "2026-10-28T17:27:57Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/706b9334-816f-440c-bdde-4f5c56c44b3a/confirm` → **409**

```json
{
  "command_id": "dc32c0d6-384f-420b-992d-ccb576cec5d3"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/706b9334-816f-440c-bdde-4f5c56c44b3a/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "7d1fa0d5-4e68-417f-b0d4-fa0a2a74b6fd"
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
  "session_id": "358ac38c-fc7c-43e0-8ac2-d239faa5edd0",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIxODIsImlhdCI6MTc5MzIwMTI4MiwianRpIjoiYzg3ZDNiMjUtYzIyMi00MDY2LTkwYjEtZjYyYWVjMmVkNGE2Iiwic2lkIjoiMzU4YWMzOGMtZmM3Yy00M2UwLThhYzItZDIzOWZhYTVlZGQwIn0.j1LClLWF97RV7ovbGUv8vUArANepwgh-oldqoDMNBTA",
  "access_expires_at": "2026-10-28T15:43:02.660692546Z",
  "refresh_token": "5B9r7RPn5mT6Z_wOz6Txj6u951AMRl5NT047hv41uZE",
  "refresh_expires_at": "2026-10-29T03:28:02.65982668Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e188d93b-8efe-400c-b5b5-669875959488` → **200**

```json
{
  "id": "e188d93b-8efe-400c-b5b5-669875959488",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "140b0ede-75a8-4031-aa1f-5ebce9d60fa6",
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
  "created_at": "2026-10-28T15:27:59.577918Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T18:27:57Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "706b9334-816f-440c-bdde-4f5c56c44b3a",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T15:28:01.283673Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/e188d93b-8efe-400c-b5b5-669875959488/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T15:27:59.579103Z",
      "actor": {
        "type": "CLIENT",
        "id": "140b0ede-75a8-4031-aa1f-5ebce9d60fa6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "e188d93b-8efe-400c-b5b5-669875959488",
        "preorder": true,
        "quote_id": "204500ef-7590-4051-88fb-f20773b2f680",
        "pickup_at": "2026-10-28T18:27:57Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "06f071b2-6859-4360-a449-ed74cbfcd714"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T15:28:01.28488Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e188d93b-8efe-400c-b5b5-669875959488",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "706b9334-816f-440c-bdde-4f5c56c44b3a"
      },
      "correlation_id": "32c689ae-71c2-4ad9-b8c5-f74980381dfb"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order e188d93b-8efe-400c-b5b5-669875959488, reservation 706b9334-816f-440c-bdde-4f5c56c44b3a.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-9325"
}
```

```json
{
  "challenge_id": "dbb863a2-af72-400a-9def-7151c841c1fd",
  "expires_at": "2026-10-28T15:33:03.493071787Z",
  "resend_available_at": "2026-10-28T15:28:04.493071787Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "391715",
  "sent_at": "2026-10-28T15:28:03.495354921Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dbb863a2-af72-400a-9def-7151c841c1fd",
  "code": "391715",
  "device_ref": "sandbox-9325"
}
```

```json
{
  "session_id": "9fda9cb4-96a5-4f04-aa34-d844056915e3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjE4MywiaWF0IjoxNzkzMjAxMjgzLCJqdGkiOiI1NDI2MTc4Ni05MzUwLTQ5YjMtODBmMC04MDY2NDFhZTEzOWMiLCJzaWQiOiI5ZmRhOWNiNC05NmE1LTRmMDQtYWEzNC1kODQ0MDU2OTE1ZTMifQ.SKSIaIM9zC3SKHzPRb1xEkBM0KaVnqRp5m5aP0UKMpE",
  "access_expires_at": "2026-10-28T15:43:03.7908705Z",
  "refresh_token": "KIU8V14DmvrLa0qifrNaF2GeysfoCGnY1I418L7-MIs",
  "refresh_expires_at": "2026-11-27T15:28:03.79031331Z",
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
  "command_id": "2833e2b8-edf8-4b88-b69e-6e5bc14f96ed",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:28:04Z",
    "sequence": 1793201284317
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d941e5e2-f8cd-43c4-919b-318e309bb8a8",
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
  "last_heartbeat_at": "2026-10-28T15:28:04.336139Z",
  "last_location_at": "2026-10-28T15:28:04.336139Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679636234",
  "device_ref": "sandbox-18282"
}
```

```json
{
  "challenge_id": "2f494b54-e2fa-4f3d-bf1f-ba88a3a57e67",
  "expires_at": "2026-10-28T15:33:04.622540747Z",
  "resend_available_at": "2026-10-28T15:28:05.622540747Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679636234` → **200**

```json
{
  "phone": "+380679636234",
  "audience": "CLIENT",
  "code": "461694",
  "sent_at": "2026-10-28T15:28:04.624747058Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2f494b54-e2fa-4f3d-bf1f-ba88a3a57e67",
  "code": "461694",
  "device_ref": "sandbox-18282"
}
```

```json
{
  "session_id": "04d2a091-13a0-4e62-a4a8-ffe94e022de8",
  "subject": {
    "type": "CLIENT",
    "id": "2523b8e1-0162-4673-aa99-c313258bf13d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNTIzYjhlMS0wMTYyLTQ2NzMtYWE5OS1jMzEzMjU4YmYxM2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMTg0LCJpYXQiOjE3OTMyMDEyODQsImp0aSI6ImY5NWU4NDQ2LWY2NzItNDIyMi04YjYxLWNhYzdhZmExODM2MSIsInNpZCI6IjA0ZDJhMDkxLTEzYTAtNGU2Mi1hNGE4LWZmZTk0ZTAyMmRlOCJ9.5WGYSt95K-Z8FOGRXJMBV-MzB5P19EAptgxhBg6_cOM",
  "access_expires_at": "2026-10-28T15:43:04.919176816Z",
  "refresh_token": "rSgmV-mUoskWahGJ-1aOcBY8-KGfdv97vl5O6qdQP5w",
  "refresh_expires_at": "2026-11-27T15:28:04.918652247Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7aaf3502-34b5-4f9a-8b43-093caf7f93b2",
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
  "id": "d48ff7cf-a477-4bc8-9bc3-9a1532e7ae4a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:33:05.195913Z",
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
  "command_id": "7e305813-a432-4997-8485-6d57c4955419",
  "quote_id": "d48ff7cf-a477-4bc8-9bc3-9a1532e7ae4a",
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
  "id": "42f0528a-c8ce-43b3-818e-89b849b3665e",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2523b8e1-0162-4673-aa99-c313258bf13d",
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
  "created_at": "2026-10-28T15:28:05.475173Z",
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
    "id": "8ff1a996-b2ad-42ce-9ff6-869fa2dfe4b8",
    "order_id": "42f0528a-c8ce-43b3-818e-89b849b3665e",
    "expires_at": "2026-10-28T15:28:20.478715Z",
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

`POST /api/driver/v1/offers/8ff1a996-b2ad-42ce-9ff6-869fa2dfe4b8/accept` → **200**

```json
{
  "command_id": "da87528f-ffb6-4372-a831-7514b2cafb51"
}
```

```json
{
  "id": "46480dc6-32ef-457d-91c0-d2fa6add2c61",
  "order_id": "42f0528a-c8ce-43b3-818e-89b849b3665e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ebf5a546-9076-4ea4-89b3-45c289a87781",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ebf5a546-9076-4ea4-89b3-45c289a87781",
  "order_id": "42f0528a-c8ce-43b3-818e-89b849b3665e",
  "assignment_id": "46480dc6-32ef-457d-91c0-d2fa6add2c61",
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

`POST /api/driver/v1/work-sessions/d941e5e2-f8cd-43c4-919b-318e309bb8a8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:28:06Z",
    "sequence": 1793201286567
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d941e5e2-f8cd-43c4-919b-318e309bb8a8",
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
  "last_heartbeat_at": "2026-10-28T15:28:06.586487Z",
  "last_location_at": "2026-10-28T15:28:06.586487Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ebf5a546-9076-4ea4-89b3-45c289a87781",
  "order_id": "42f0528a-c8ce-43b3-818e-89b849b3665e",
  "assignment_id": "46480dc6-32ef-457d-91c0-d2fa6add2c61",
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

`POST /api/driver/v1/trips/ebf5a546-9076-4ea4-89b3-45c289a87781/arrive` → **200**

```json
{
  "command_id": "6f546271-56ef-4104-942e-2317d153259b",
  "expected_version": 0
}
```

```json
{
  "id": "ebf5a546-9076-4ea4-89b3-45c289a87781",
  "order_id": "42f0528a-c8ce-43b3-818e-89b849b3665e",
  "assignment_id": "46480dc6-32ef-457d-91c0-d2fa6add2c61",
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
  "arrived_at": "2026-10-28T15:28:07.132725Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ebf5a546-9076-4ea4-89b3-45c289a87781/start` → **200**

```json
{
  "command_id": "37c5d8e7-2017-403e-aa0a-9ea6718b2b48",
  "expected_version": 1
}
```

```json
{
  "id": "ebf5a546-9076-4ea4-89b3-45c289a87781",
  "order_id": "42f0528a-c8ce-43b3-818e-89b849b3665e",
  "assignment_id": "46480dc6-32ef-457d-91c0-d2fa6add2c61",
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
  "arrived_at": "2026-10-28T15:28:07.132725Z",
  "started_at": "2026-10-28T15:28:07.404556Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/d941e5e2-f8cd-43c4-919b-318e309bb8a8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:28:07Z",
    "sequence": 1793201287670
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d941e5e2-f8cd-43c4-919b-318e309bb8a8",
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
  "last_heartbeat_at": "2026-10-28T15:28:07.689231Z",
  "last_location_at": "2026-10-28T15:28:07.689231Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/ebf5a546-9076-4ea4-89b3-45c289a87781/complete` → **200**

```json
{
  "command_id": "25d1edcb-30c2-420e-a164-4b2620b6cdd3",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:28:07Z",
  "cash_received": true
}
```

```json
{
  "id": "ebf5a546-9076-4ea4-89b3-45c289a87781",
  "order_id": "42f0528a-c8ce-43b3-818e-89b849b3665e",
  "assignment_id": "46480dc6-32ef-457d-91c0-d2fa6add2c61",
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
  "arrived_at": "2026-10-28T15:28:07.132725Z",
  "started_at": "2026-10-28T15:28:07.404556Z",
  "completed_at": "2026-10-28T15:28:07.970577Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/42f0528a-c8ce-43b3-818e-89b849b3665e/rating` → **200**

```json
{
  "command_id": "ce9e3f6f-abe7-43e7-8d5d-80bbc03475e8",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "42f0528a-c8ce-43b3-818e-89b849b3665e",
  "score": 5,
  "created_at": "2026-10-28T15:28:08.259987479Z"
}
```

`POST /api/driver/v1/orders/42f0528a-c8ce-43b3-818e-89b849b3665e/rating` → **200**

```json
{
  "command_id": "47f6bd38-4a15-4487-95ac-6c359fbe3bf6",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "42f0528a-c8ce-43b3-818e-89b849b3665e",
  "score": 4,
  "created_at": "2026-10-28T15:28:08.524978655Z"
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
  "session_id": "879c0843-55ca-45d9-b138-755946d9ce8e",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIxODksImlhdCI6MTc5MzIwMTI4OSwianRpIjoiYzgzMTM2MDItNDdhMS00MzNjLWI3MzItZGMxNDE1ZWUyYWJhIiwic2lkIjoiODc5YzA4NDMtNTVjYS00NWQ5LWIxMzgtNzU1OTQ2ZDljZThlIn0.pvJ6NJDihSvcnpVqPEq0dtMlFFhUURYNzfJDtJOLRFI",
  "access_expires_at": "2026-10-28T15:43:09.36008696Z",
  "refresh_token": "afhPY9uiwQAzbaPd_4NAfel7LYzibc5oNbvBotedFUk",
  "refresh_expires_at": "2026-10-29T03:28:09.359539076Z",
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
  "session_id": "4223837e-fca1-430e-8b79-ac159d607bd4",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIxODksImlhdCI6MTc5MzIwMTI4OSwianRpIjoiODQ5MDY5YWQtZjU0My00MmNiLWFiZTEtOGVmY2Q5YzRjOWNlIiwic2lkIjoiNDIyMzgzN2UtZmNhMS00MzBlLThiNzktYWMxNTlkNjA3YmQ0In0.Cm7Txgi0K2CKfbQdIIqHY4a17foELub5JoDByCNo19E",
  "access_expires_at": "2026-10-28T15:43:09.930195472Z",
  "refresh_token": "r2ApewCrkycJvLCxE9gS3e3cGWHuIhiV16ZvFhrYYNM",
  "refresh_expires_at": "2026-10-29T03:28:09.929555115Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/42f0528a-c8ce-43b3-818e-89b849b3665e/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "42f0528a-c8ce-43b3-818e-89b849b3665e",
      "author_type": "RIDER",
      "author_id": "2523b8e1-0162-4673-aa99-c313258bf13d",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T15:28:08.259987Z"
    },
    {
      "order_id": "42f0528a-c8ce-43b3-818e-89b849b3665e",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "2523b8e1-0162-4673-aa99-c313258bf13d",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T15:28:08.524979Z"
    }
  ]
}
```

Done: ratings for order 42f0528a-c8ce-43b3-818e-89b849b3665e.

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
  "session_id": "060fbb6a-8beb-49ac-8406-1c2f78becdf2",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIxOTAsImlhdCI6MTc5MzIwMTI5MCwianRpIjoiM2M1M2MwYjItMTdkNC00ZGE5LThmN2EtMTQ0NzlmZDYwZDg5Iiwic2lkIjoiMDYwZmJiNmEtOGJlYi00OWFjLTg0MDYtMWMyZjc4YmVjZGYyIn0.qxNe4I020v5AVgwwMoyH9kGqyq7G9Qsuu3bBAYdJPx4",
  "access_expires_at": "2026-10-28T15:43:10.789058164Z",
  "refresh_token": "WQF21nHY2KuEXSQp1tkBpe0fxKZMA6BEcqdEvw9mnbA",
  "refresh_expires_at": "2026-10-29T03:28:10.788525077Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "b863a6c7-f170-4cf5-b9c8-9208538d6e31",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "37b312d2-633b-43e2-95af-bb3742421a95",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:28:11.066732Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/37b312d2-633b-43e2-95af-bb3742421a95` → **200**

```json
{
  "id": "37b312d2-633b-43e2-95af-bb3742421a95",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:28:11.066732Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/37b312d2-633b-43e2-95af-bb3742421a95` → **200**

```json
{
  "id": "37b312d2-633b-43e2-95af-bb3742421a95",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:28:11.066732Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/37b312d2-633b-43e2-95af-bb3742421a95` → **200**

```json
{
  "id": "37b312d2-633b-43e2-95af-bb3742421a95",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:28:11.066732Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/37b312d2-633b-43e2-95af-bb3742421a95` → **200**

```json
{
  "id": "37b312d2-633b-43e2-95af-bb3742421a95",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T15:28:11.066732Z",
  "ready_at": "2026-10-28T15:28:14.577283Z",
  "expires_at": "2026-10-29T15:28:14.577283Z"
}
```

`GET /api/admin/v1/reports/exports/37b312d2-633b-43e2-95af-bb3742421a95/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
total,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "074cb14d-227a-470e-9117-4082149cc291",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "e6f1af6e-e38e-4b71-8b58-3e643d0ae505",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:28:15.469437Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e6f1af6e-e38e-4b71-8b58-3e643d0ae505` → **200**

```json
{
  "id": "e6f1af6e-e38e-4b71-8b58-3e643d0ae505",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:28:15.469437Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e6f1af6e-e38e-4b71-8b58-3e643d0ae505` → **200**

```json
{
  "id": "e6f1af6e-e38e-4b71-8b58-3e643d0ae505",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:28:15.469437Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e6f1af6e-e38e-4b71-8b58-3e643d0ae505` → **200**

```json
{
  "id": "e6f1af6e-e38e-4b71-8b58-3e643d0ae505",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:28:15.469437Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e6f1af6e-e38e-4b71-8b58-3e643d0ae505` → **200**

```json
{
  "id": "e6f1af6e-e38e-4b71-8b58-3e643d0ae505",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:28:15.469437Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e6f1af6e-e38e-4b71-8b58-3e643d0ae505` → **200**

```json
{
  "id": "e6f1af6e-e38e-4b71-8b58-3e643d0ae505",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T15:28:15.469437Z",
  "ready_at": "2026-10-28T15:28:19.587207Z",
  "expires_at": "2026-10-29T15:28:19.587207Z"
}
```

`GET /api/admin/v1/reports/exports/e6f1af6e-e38e-4b71-8b58-3e643d0ae505/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/e569aa6f-2f89-42db-b58d-52d1fe0c1520` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/e569aa6f-2f89-42db-b58d-52d1fe0c1520",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ae75d9dd-3221-4803-8add-0d1ef03b0932"
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
  "device_ref": "sandbox-27106"
}
```

```json
{
  "challenge_id": "fa81770e-73b1-46a2-831e-73e7bfcc0177",
  "expires_at": "2026-10-28T15:33:21.446343802Z",
  "resend_available_at": "2026-10-28T15:28:22.446343802Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "026844",
  "sent_at": "2026-10-28T15:28:21.448702836Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fa81770e-73b1-46a2-831e-73e7bfcc0177",
  "code": "026844",
  "device_ref": "sandbox-27106"
}
```

```json
{
  "session_id": "2e652f1e-c4e0-408e-a72f-a7b9460dbb85",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjIwMSwiaWF0IjoxNzkzMjAxMzAxLCJqdGkiOiI4ZmY2NWY0Ni01YzI0LTRhNGYtYjczNC0wMzlhMGU2ZjU5ZGEiLCJzaWQiOiIyZTY1MmYxZS1jNGUwLTQwOGUtYTcyZi1hN2I5NDYwZGJiODUifQ.I_fHoOqksn4kex0RH-tcnLsqg-WjOAi2ZQg227CXp1A",
  "access_expires_at": "2026-10-28T15:43:21.752102545Z",
  "refresh_token": "FNeWS3Sbubu3R38t_rrIb-xrzRkdW9AcGXYzEIwQtBg",
  "refresh_expires_at": "2026-11-27T15:28:21.751503035Z",
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
  "command_id": "783a8e00-ec43-4a40-9527-2d24485b0137",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:28:22Z",
    "sequence": 1793201302572
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5d3786b2-5f6e-467b-87ee-693482e91408",
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
  "last_heartbeat_at": "2026-10-28T15:28:22.591305Z",
  "last_location_at": "2026-10-28T15:28:22.591305Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "6e39e983-d933-4849-a5a9-c589d1aa228c",
  "points": [
    {
      "sequence": 1793201304869,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T15:27:24Z"
    },
    {
      "sequence": 1793201304876,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T15:28:24Z"
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
  "session_id": "85062696-bc8f-4362-a499-39449c825b2d",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIyMDUsImlhdCI6MTc5MzIwMTMwNSwianRpIjoiZmM4ZGQzYzctYWZjOC00OGJlLThhYjctMDMwOWMwZjRhOGE3Iiwic2lkIjoiODUwNjI2OTYtYmM4Zi00MzYyLWE0OTktMzk0NDljODI1YjJkIn0.GWe2vgTabUfcg8AjeezJESiwlUcrpLpfjX1Zqzb_Lxk",
  "access_expires_at": "2026-10-28T15:43:25.475043573Z",
  "refresh_token": "YWI6gTxnwTltqtiF19ynW1NqGoWui3iwr_e3ZKN9zVw",
  "refresh_expires_at": "2026-10-29T03:28:25.474442009Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "892b6cae-c910-48f6-a4ae-549a20b54a46",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T15:28:24Z",
        "track_point_id": "50dc95e4-2745-409b-9c60-f9b89363ad7d",
        "work_session_id": "5d3786b2-5f6e-467b-87ee-693482e91408"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T15:28:24Z",
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

`POST /api/admin/v1/driver-risk-flags/892b6cae-c910-48f6-a4ae-549a20b54a46/confirm` → **200**

```json
{
  "command_id": "8e022cc0-da71-4ae3-874a-742e956c187e",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "892b6cae-c910-48f6-a4ae-549a20b54a46",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T15:28:24Z",
    "track_point_id": "50dc95e4-2745-409b-9c60-f9b89363ad7d",
    "work_session_id": "5d3786b2-5f6e-467b-87ee-693482e91408"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T15:28:24Z",
  "reason": null,
  "reviewed_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
  "reviewed_at": "2026-10-28T15:28:26.348379Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/892b6cae-c910-48f6-a4ae-549a20b54a46/dismiss` → **409**

```json
{
  "command_id": "b55df853-5928-417d-a4e9-e27e5fcd14f3",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/892b6cae-c910-48f6-a4ae-549a20b54a46/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "544f0c07-9662-409a-9508-839dbfdfd3e3"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "d59b5544-22da-497f-836a-947247a40c74",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "0af2e4dc-5e3b-4ef7-9006-b8693ea54c30",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
  "raised_at": "2026-10-28T15:28:26.920405Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/0af2e4dc-5e3b-4ef7-9006-b8693ea54c30/dismiss` → **200**

```json
{
  "command_id": "9fa64e2b-35f4-41a1-a93c-df21991e7318",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "0af2e4dc-5e3b-4ef7-9006-b8693ea54c30",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
  "raised_at": "2026-10-28T15:28:26.920405Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
  "reviewed_at": "2026-10-28T15:28:27.20691Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "b500a706-27b2-467b-a899-6d82a8a149af",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "892b6cae-c910-48f6-a4ae-549a20b54a46"
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
      "actor_id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T15:28:27.492326Z"
    }
  ]
}
```

Done: flag 892b6cae-c910-48f6-a4ae-549a20b54a46 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "ef7f20bc-f858-4009-9ce5-2bf23a894116",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIyMDgsImlhdCI6MTc5MzIwMTMwOCwianRpIjoiM2FjNjcxNTAtMjA2Mi00ZmE5LTlmYTgtZGEzNzdlMWExYWY3Iiwic2lkIjoiZWY3ZjIwYmMtZjg1OC00MDA5LTljZTUtMmJmMjNhODk0MTE2In0.FsDxEJt0X13REiGAZagih9hs_rZ7-_NH2oC8FaVjTis",
  "access_expires_at": "2026-10-28T15:43:28.338758593Z",
  "refresh_token": "8rI7aPQNpxrf-44T6OIjUFwLML-o8_hhZUORB10Z6gw",
  "refresh_expires_at": "2026-10-29T03:28:28.338142101Z",
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
      "actor_id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T15:28:27.492326Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "935b4514-811b-4602-836f-a6aa417e272d",
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
  "session_id": "5d3786b2-5f6e-467b-87ee-693482e91408",
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
  "last_heartbeat_at": "2026-10-28T15:28:22.591305Z",
  "last_location_at": "2026-10-28T15:28:22.591305Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5d3786b2-5f6e-467b-87ee-693482e91408/close` → **200**

```json
{
  "command_id": "71e43926-569e-42f2-9a1e-8401c280bbc0",
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
  "session_id": "47e93e8d-cc26-4194-9ee5-2ff0ac6f5dc2",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIyMTAsImlhdCI6MTc5MzIwMTMxMCwianRpIjoiMDUyZmFhOGYtMmI4MS00MGYwLWE4ZDAtYmRlNWZmNjU3ZWIzIiwic2lkIjoiNDdlOTNlOGQtY2MyNi00MTk0LTllZTUtMmZmMGFjNmY1ZGMyIn0.nPvNw922QL6D72aA6i3iFHCwZD-jJOOhI3jL3-hJD-c",
  "access_expires_at": "2026-10-28T15:43:30.047538423Z",
  "refresh_token": "aQRGBp8SUdDb0YWN6W_nk4XXX8jguZfMr4W2qN8wrFs",
  "refresh_expires_at": "2026-10-29T03:28:30.046912904Z",
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
  "command_id": "8e1cc1c3-fccf-4260-bad1-f0d63cbe3bdd",
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
  "changed_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T15:28:30.599066Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "8e1cc1c3-fccf-4260-bad1-f0d63cbe3bdd",
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
  "changed_by": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T15:28:30.599066Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48917130111",
  "device_ref": "sandbox-31941"
}
```

```json
{
  "challenge_id": "c63bab80-1994-40ad-99dc-8c903285174f",
  "expires_at": "2026-10-28T15:33:31.147896498Z",
  "resend_available_at": "2026-10-28T15:28:32.147896498Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48917130111` → **200**

```json
{
  "phone": "+48917130111",
  "audience": "CLIENT",
  "code": "361043",
  "sent_at": "2026-10-28T15:28:31.150177811Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c63bab80-1994-40ad-99dc-8c903285174f",
  "code": "361043",
  "device_ref": "sandbox-31941"
}
```

```json
{
  "session_id": "83322bac-20df-4ca3-ae96-2ec84f31ee3d",
  "subject": {
    "type": "CLIENT",
    "id": "d980cbf6-5e7a-426b-834e-f5123bb88391"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkOTgwY2JmNi01ZTdhLTQyNmItODM0ZS1mNTEyM2JiODgzOTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMjExLCJpYXQiOjE3OTMyMDEzMTEsImp0aSI6IjQ0ZWJjNmY1LTkzOTQtNDU4NC1iMThiLWIyMWU4MGEwNDlmZiIsInNpZCI6IjgzMzIyYmFjLTIwZGYtNGNhMy1hZTk2LTJlYzg0ZjMxZWUzZCJ9.qD2-Z38JKzKziF6NI2Z-lZyiFOkNfsGxVbzBqaNDpYI",
  "access_expires_at": "2026-10-28T15:43:31.43578192Z",
  "refresh_token": "h7QsAaMSgvPcwMefca0dhbyjjQlelaLf6WT7ruEdeUM",
  "refresh_expires_at": "2026-11-27T15:28:31.435219198Z",
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
  "correlation_id": "58702baa-440a-4506-a047-62a008433b6b"
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
  "device_ref": "sandbox-6844"
}
```

```json
{
  "challenge_id": "d289bffa-2a12-4d16-bb2c-fbaa85fd324c",
  "expires_at": "2026-10-28T15:33:32.238644981Z",
  "resend_available_at": "2026-10-28T15:28:33.238644981Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "709182",
  "sent_at": "2026-10-28T15:28:32.240858561Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d289bffa-2a12-4d16-bb2c-fbaa85fd324c",
  "code": "709182",
  "device_ref": "sandbox-6844"
}
```

```json
{
  "session_id": "660e4ca0-8aae-473c-8c90-a4574faf491e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjIxMiwiaWF0IjoxNzkzMjAxMzEyLCJqdGkiOiI5ZDhkYTVmMS1jZjZmLTRmODgtOWM1NC1hNDUwNzcyYmY0ODIiLCJzaWQiOiI2NjBlNGNhMC04YWFlLTQ3M2MtOGM5MC1hNDU3NGZhZjQ5MWUifQ.AxCvL5iWZpIIhxlhrzgpfKvFNhzY2MR_UUuNeVtZ8lU",
  "access_expires_at": "2026-10-28T15:43:32.528951501Z",
  "refresh_token": "SmwYf7ZASHVAM02PsRbEQF12sEzNmbirzdJUFegQnvk",
  "refresh_expires_at": "2026-11-27T15:28:32.528420709Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b980d9ad-2805-44a1-87aa-44a84996810f",
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
  "last_heartbeat_at": "2026-10-28T15:28:00.718188Z",
  "last_location_at": "2026-10-28T15:28:00.718188Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b980d9ad-2805-44a1-87aa-44a84996810f/handover` → **200**

```json
{
  "command_id": "0caefb0a-f223-4c3a-93ca-9af68021dcbe",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b980d9ad-2805-44a1-87aa-44a84996810f",
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
  "last_heartbeat_at": "2026-10-28T15:28:00.718188Z",
  "last_location_at": "2026-10-28T15:28:00.718188Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b980d9ad-2805-44a1-87aa-44a84996810f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:28:33Z",
    "sequence": 1793201313333
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b980d9ad-2805-44a1-87aa-44a84996810f",
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
  "last_heartbeat_at": "2026-10-28T15:28:33.352444Z",
  "last_location_at": "2026-10-28T15:28:33.352444Z",
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
  "session_id": "b980d9ad-2805-44a1-87aa-44a84996810f",
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
  "last_heartbeat_at": "2026-10-28T15:28:33.352444Z",
  "last_location_at": "2026-10-28T15:28:33.352444Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b980d9ad-2805-44a1-87aa-44a84996810f/close` → **200**

```json
{
  "command_id": "992f3d35-248e-48ae-8045-cfb3910fbd33",
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
  "correlation_id": "ab3d1a10-25a0-4724-bc74-5a7793033236"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670367016",
  "device_ref": "sandbox-14033"
}
```

```json
{
  "challenge_id": "525415f1-73e0-404c-8f3e-977f7833d1df",
  "expires_at": "2026-10-28T15:33:34.716366338Z",
  "resend_available_at": "2026-10-28T15:28:35.716366338Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670367016` → **200**

```json
{
  "phone": "+380670367016",
  "audience": "CLIENT",
  "code": "682065",
  "sent_at": "2026-10-28T15:28:34.718711689Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "525415f1-73e0-404c-8f3e-977f7833d1df",
  "code": "682065",
  "device_ref": "sandbox-14033"
}
```

```json
{
  "session_id": "beb21005-443a-413d-a0e4-ed5875d53dd4",
  "subject": {
    "type": "CLIENT",
    "id": "eefa404f-7b5d-45b8-a41a-3eb132b0204c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWZhNDA0Zi03YjVkLTQ1YjgtYTQxYS0zZWIxMzJiMDIwNGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMjE1LCJpYXQiOjE3OTMyMDEzMTUsImp0aSI6Ijg3ZjEzZmMzLTZjZmQtNDNiYS1hMmYxLTc5ZjczOTY4ZDJkOCIsInNpZCI6ImJlYjIxMDA1LTQ0M2EtNDEzZC1hMGU0LWVkNTg3NWQ1M2RkNCJ9.HjgWbwZ_WmqMxMc1ZcY05JCpKzBjbTJPm45418zS56I",
  "access_expires_at": "2026-10-28T15:43:35.022210238Z",
  "refresh_token": "7nGHJw3CbkOKoYvaSco4Hs8LO8YTRvo5WWKhaUm4BIs",
  "refresh_expires_at": "2026-11-27T15:28:35.021663967Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "06378f80-e8b2-4bf4-9625-24f71bda5352",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "19e3d592-901c-4347-b632-a2177e65de42",
  "upload_path": "/api/rider/v1/uploads/19e3d592-901c-4347-b632-a2177e65de42",
  "expires_at": "2026-10-28T15:43:35.295752247Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/19e3d592-901c-4347-b632-a2177e65de42` → **200**

```json
{
  "file_id": "19e3d592-901c-4347-b632-a2177e65de42",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "2519b35e-bfdc-4a75-83f8-145a9e334eae",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "19e3d592-901c-4347-b632-a2177e65de42"
  ]
}
```

```json
{
  "id": "ab770578-63ff-4b08-874d-f0bce1b5030b",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "eefa404f-7b5d-45b8-a41a-3eb132b0204c",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T15:28:35.626451Z",
  "updated_at": "2026-10-28T15:28:35.626451Z",
  "messages": [
    {
      "id": "ffc7a975-454c-48ad-acb1-9cdded1ce8c6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "eefa404f-7b5d-45b8-a41a-3eb132b0204c",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T15:28:35.628527Z",
      "attachments": [
        {
          "file_id": "19e3d592-901c-4347-b632-a2177e65de42",
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
  "session_id": "ccb10b8a-b753-40be-8090-7ef269406460",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIyMTYsImlhdCI6MTc5MzIwMTMxNiwianRpIjoiMWQ1MGJhNzEtZGI0ZC00MWMwLTllZDQtMGEyM2QwNDJhZjFlIiwic2lkIjoiY2NiMTBiOGEtYjc1My00MGJlLTgwOTAtN2VmMjY5NDA2NDYwIn0.OFxx_Vir2bdCs6_xAvX-b66c-UKPQbGnQuJv9WN16lA",
  "access_expires_at": "2026-10-28T15:43:36.2171268Z",
  "refresh_token": "nKyvmENM8wluIqYdaRW7boX0cOU1YKUNQGlnSzNqfn4",
  "refresh_expires_at": "2026-10-29T03:28:36.216580138Z",
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
  "session_id": "e30ab2f0-d873-49c9-a047-abb212970591",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIyMTYsImlhdCI6MTc5MzIwMTMxNiwianRpIjoiYWY5NTdlNDAtYzExYS00OTE2LTlhMDQtMGIzMzhhMjg0MGY5Iiwic2lkIjoiZTMwYWIyZjAtZDg3My00OWM5LWEwNDctYWJiMjEyOTcwNTkxIn0.waAGjIgwb87sfFgvjMrpjLV6Q0R65a5xnrrwjezHk1k",
  "access_expires_at": "2026-10-28T15:43:36.79289645Z",
  "refresh_token": "TrYhzTO4EncRHciteBa2kusuin4WnIM4jrbJmwvFbq4",
  "refresh_expires_at": "2026-10-29T03:28:36.792362473Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/ab770578-63ff-4b08-874d-f0bce1b5030b/attachments/19e3d592-901c-4347-b632-a2177e65de42` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "9db1390d-f49f-462d-b430-a42e0416d956",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "7372c4fd-ca84-4408-92ca-df47a93085eb",
  "upload_path": "/api/operator/v1/uploads/7372c4fd-ca84-4408-92ca-df47a93085eb",
  "expires_at": "2026-10-28T15:43:37.075329118Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/7372c4fd-ca84-4408-92ca-df47a93085eb` → **200**

```json
{
  "file_id": "7372c4fd-ca84-4408-92ca-df47a93085eb",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/ab770578-63ff-4b08-874d-f0bce1b5030b` → **200**

```json
{
  "id": "ab770578-63ff-4b08-874d-f0bce1b5030b",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "eefa404f-7b5d-45b8-a41a-3eb132b0204c",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T15:28:35.626451Z",
  "updated_at": "2026-10-28T15:28:35.626451Z",
  "messages": [
    {
      "id": "ffc7a975-454c-48ad-acb1-9cdded1ce8c6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "eefa404f-7b5d-45b8-a41a-3eb132b0204c",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T15:28:35.628527Z",
      "attachments": [
        {
          "file_id": "19e3d592-901c-4347-b632-a2177e65de42",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/ab770578-63ff-4b08-874d-f0bce1b5030b/comments` → **200**

```json
{
  "command_id": "64a42279-3f29-4abe-b26a-26d15e70b221",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "7372c4fd-ca84-4408-92ca-df47a93085eb"
  ]
}
```

```json
{
  "id": "ab770578-63ff-4b08-874d-f0bce1b5030b",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "eefa404f-7b5d-45b8-a41a-3eb132b0204c",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T15:28:35.626451Z",
  "updated_at": "2026-10-28T15:28:37.666484Z",
  "messages": [
    {
      "id": "ffc7a975-454c-48ad-acb1-9cdded1ce8c6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "eefa404f-7b5d-45b8-a41a-3eb132b0204c",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T15:28:35.628527Z",
      "attachments": [
        {
          "file_id": "19e3d592-901c-4347-b632-a2177e65de42",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "be9aabfc-a3f6-4fb5-bba2-3ff4b80251c4",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T15:28:37.666064Z",
      "attachments": [
        {
          "file_id": "7372c4fd-ca84-4408-92ca-df47a93085eb",
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

`GET /api/rider/v1/support/cases/ab770578-63ff-4b08-874d-f0bce1b5030b` → **200**

```json
{
  "id": "ab770578-63ff-4b08-874d-f0bce1b5030b",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "eefa404f-7b5d-45b8-a41a-3eb132b0204c",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T15:28:35.626451Z",
  "updated_at": "2026-10-28T15:28:37.666484Z",
  "messages": [
    {
      "id": "ffc7a975-454c-48ad-acb1-9cdded1ce8c6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "eefa404f-7b5d-45b8-a41a-3eb132b0204c",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T15:28:35.628527Z",
      "attachments": [
        {
          "file_id": "19e3d592-901c-4347-b632-a2177e65de42",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "be9aabfc-a3f6-4fb5-bba2-3ff4b80251c4",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T15:28:37.666064Z",
      "attachments": [
        {
          "file_id": "7372c4fd-ca84-4408-92ca-df47a93085eb",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/ab770578-63ff-4b08-874d-f0bce1b5030b/attachments/7372c4fd-ca84-4408-92ca-df47a93085eb` → **200**

Done: support case ab770578-63ff-4b08-874d-f0bce1b5030b, rider attachment 19e3d592-901c-4347-b632-a2177e65de42, operator attachment 7372c4fd-ca84-4408-92ca-df47a93085eb.

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
  "session_id": "10651f4d-c1da-40f1-8bd6-392677e51803",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIyMTgsImlhdCI6MTc5MzIwMTMxOCwianRpIjoiMjg5NTdhZmEtYzJhMS00ZmMyLWExYTEtMWFjOGRhOTc3OWExIiwic2lkIjoiMTA2NTFmNGQtYzFkYS00MGYxLThiZDYtMzkyNjc3ZTUxODAzIn0.nsGX1bA02KBx-3RRJpIpCnzQuwNjBJgwLbeUwyRMYAc",
  "access_expires_at": "2026-10-28T15:43:38.549212197Z",
  "refresh_token": "I_0nuWT7k1T0gYiLbjAfm7IruXHriNFqcryerpIZx-s",
  "refresh_expires_at": "2026-10-29T03:28:38.548428473Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-1607"
}
```

```json
{
  "challenge_id": "7097a669-eff4-4bce-bda3-d0cd57824ffa",
  "expires_at": "2026-10-28T15:33:38.819407326Z",
  "resend_available_at": "2026-10-28T15:28:39.819407326Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "182431",
  "sent_at": "2026-10-28T15:28:38.821798435Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7097a669-eff4-4bce-bda3-d0cd57824ffa",
  "code": "182431",
  "device_ref": "sandbox-1607"
}
```

```json
{
  "session_id": "1cf2c234-51a5-40bf-a19a-57cdb0258f49",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjIxOSwiaWF0IjoxNzkzMjAxMzE5LCJqdGkiOiJlYjI0ZGIxNi04Yzg2LTQ3OWUtODk3ZS02N2E0MjFlZWU5ZjciLCJzaWQiOiIxY2YyYzIzNC01MWE1LTQwYmYtYTE5YS01N2NkYjAyNThmNDkifQ.drmYXkgNWrFS0UjIR50IVRgrJJsX788RuDM2rJ82HQY",
  "access_expires_at": "2026-10-28T15:43:39.116981737Z",
  "refresh_token": "TfF8xk80eYfXjfrLNK9F13pXdwUdg0V3BryqQbJ9UKo",
  "refresh_expires_at": "2026-11-27T15:28:39.116398076Z",
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
      "actor_id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T15:28:27.492326Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T15:28:28.902059Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "38380ca1-0b09-4998-9846-2e9025f93cfc",
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
  "device_ref": "sandbox-6929"
}
```

```json
{
  "challenge_id": "b5e94077-04d5-49c7-bd55-ef3cf3b3a7d9",
  "expires_at": "2026-10-28T15:33:40.215730298Z",
  "resend_available_at": "2026-10-28T15:28:41.215730298Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "153855",
  "sent_at": "2026-10-28T15:28:40.217895104Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b5e94077-04d5-49c7-bd55-ef3cf3b3a7d9",
  "code": "153855",
  "device_ref": "sandbox-6929"
}
```

```json
{
  "session_id": "dfa4341e-d0c4-498d-a978-423e21b0efe3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjIyMCwiaWF0IjoxNzkzMjAxMzIwLCJqdGkiOiJkZTAxZmYzYS02MWM1LTRiNTItOTcwZC02ZDU5YjExYTdlYTUiLCJzaWQiOiJkZmE0MzQxZS1kMGM0LTQ5OGQtYTk3OC00MjNlMjFiMGVmZTMifQ.1HM31_WQAjqo9WnfQPnfrVgwOLriOBQkz2fw75ko5QQ",
  "access_expires_at": "2026-10-28T15:43:40.511257991Z",
  "refresh_token": "rKCZM83TSDm488CxfoRoAPpf4GjTp1B_tln08rd2OzE",
  "refresh_expires_at": "2026-11-27T15:28:40.510662338Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d941e5e2-f8cd-43c4-919b-318e309bb8a8",
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
  "last_heartbeat_at": "2026-10-28T15:28:07.689231Z",
  "last_location_at": "2026-10-28T15:28:07.689231Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/d941e5e2-f8cd-43c4-919b-318e309bb8a8/handover` → **200**

```json
{
  "command_id": "c6b47e94-5e92-426b-a62a-2f4c98cf6429",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d941e5e2-f8cd-43c4-919b-318e309bb8a8",
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
  "last_heartbeat_at": "2026-10-28T15:28:07.689231Z",
  "last_location_at": "2026-10-28T15:28:07.689231Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/d941e5e2-f8cd-43c4-919b-318e309bb8a8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:28:41Z",
    "sequence": 1793201321326
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d941e5e2-f8cd-43c4-919b-318e309bb8a8",
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
  "last_heartbeat_at": "2026-10-28T15:28:41.345554Z",
  "last_location_at": "2026-10-28T15:28:41.345554Z",
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
  "command_id": "4e39b983-d47e-4f44-9d91-ec22482188a8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:28:41Z",
    "sequence": 1793201321876
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7ec308a6-ca90-4e21-a5b4-020e4e3e6cc4",
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
  "last_heartbeat_at": "2026-10-28T15:28:41.895383Z",
  "last_location_at": "2026-10-28T15:28:41.895383Z",
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
  "session_id": "6b8dd065-b00f-4791-becc-c6f9f6031d11",
  "subject": {
    "type": "STAFF",
    "id": "b0a8b628-d86b-4ee3-a7c0-ad4e97261073"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGE4YjYyOC1kODZiLTRlZTMtYTdjMC1hZDRlOTcyNjEwNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIyMjIsImlhdCI6MTc5MzIwMTMyMiwianRpIjoiMzZiYWY3N2UtNjJlZS00YmZlLWIwMmUtOTdhOGUxYzQ1NTU2Iiwic2lkIjoiNmI4ZGQwNjUtYjAwZi00NzkxLWJlY2MtYzZmOWY2MDMxZDExIn0.CfuZ1bpLVB_WVKBzSXohezeM_L0q21uSy9jlJy17srY",
  "access_expires_at": "2026-10-28T15:43:42.460642628Z",
  "refresh_token": "BT3561voy9UrllM3_26qiTj1-gmeizY2RnUSsuWXLZo",
  "refresh_expires_at": "2026-10-29T03:28:42.460016158Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "37a9fb4d-c957-4500-9be8-4ba8a158e0b7",
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
  "id": "818b1e41-bfbc-4bf2-8bad-253a025d97bd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:33:42.735820Z",
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
  "command_id": "3990cd74-e542-40df-a6f5-1ec0c7d2df0a",
  "quote_id": "818b1e41-bfbc-4bf2-8bad-253a025d97bd",
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
  "id": "d3969efb-0eec-4245-a317-4e032768a89b",
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
  "created_at": "2026-10-28T15:28:43.015719Z",
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
    "id": "26cba7a7-a95e-4fcc-a0fe-46c3e266a205",
    "order_id": "d3969efb-0eec-4245-a317-4e032768a89b",
    "expires_at": "2026-10-28T15:28:58.019377Z",
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

`POST /api/driver/v1/offers/26cba7a7-a95e-4fcc-a0fe-46c3e266a205/accept` → **200**

```json
{
  "command_id": "f4793203-1022-4c3e-bae4-fff9f142c9fa"
}
```

```json
{
  "id": "e93eb365-845a-40a0-bbaf-dcaef52d3600",
  "order_id": "d3969efb-0eec-4245-a317-4e032768a89b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "303f1a4c-56ca-4a37-9b2d-4ac89e9289fe",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "303f1a4c-56ca-4a37-9b2d-4ac89e9289fe",
  "order_id": "d3969efb-0eec-4245-a317-4e032768a89b",
  "assignment_id": "e93eb365-845a-40a0-bbaf-dcaef52d3600",
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

`POST /api/driver/v1/work-sessions/7ec308a6-ca90-4e21-a5b4-020e4e3e6cc4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:28:44Z",
    "sequence": 1793201324468
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7ec308a6-ca90-4e21-a5b4-020e4e3e6cc4",
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
  "last_heartbeat_at": "2026-10-28T15:28:44.488159Z",
  "last_location_at": "2026-10-28T15:28:44.488159Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/303f1a4c-56ca-4a37-9b2d-4ac89e9289fe/arrive` → **200**

```json
{
  "command_id": "ea9cce33-04cd-47cc-bb15-e5dfcc2b0c48",
  "expected_version": 0
}
```

```json
{
  "id": "303f1a4c-56ca-4a37-9b2d-4ac89e9289fe",
  "order_id": "d3969efb-0eec-4245-a317-4e032768a89b",
  "assignment_id": "e93eb365-845a-40a0-bbaf-dcaef52d3600",
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
  "arrived_at": "2026-10-28T15:28:44.76968Z",
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

`POST /api/driver/v1/trips/303f1a4c-56ca-4a37-9b2d-4ac89e9289fe/start` → **200**

```json
{
  "command_id": "6a1ff446-c8a2-4fb1-813d-4e472e909eb3",
  "expected_version": 1
}
```

```json
{
  "id": "303f1a4c-56ca-4a37-9b2d-4ac89e9289fe",
  "order_id": "d3969efb-0eec-4245-a317-4e032768a89b",
  "assignment_id": "e93eb365-845a-40a0-bbaf-dcaef52d3600",
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
  "arrived_at": "2026-10-28T15:28:44.76968Z",
  "started_at": "2026-10-28T15:28:45.054686Z",
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

`POST /api/driver/v1/trips/303f1a4c-56ca-4a37-9b2d-4ac89e9289fe/complete` → **200**

```json
{
  "command_id": "6279cd32-e2ca-4a15-a60a-767a522919b3",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:28:45Z",
  "cash_received": true
}
```

```json
{
  "id": "303f1a4c-56ca-4a37-9b2d-4ac89e9289fe",
  "order_id": "d3969efb-0eec-4245-a317-4e032768a89b",
  "assignment_id": "e93eb365-845a-40a0-bbaf-dcaef52d3600",
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
  "arrived_at": "2026-10-28T15:28:44.76968Z",
  "started_at": "2026-10-28T15:28:45.054686Z",
  "completed_at": "2026-10-28T15:28:45.364652Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/d3969efb-0eec-4245-a317-4e032768a89b` → **200**

```json
{
  "id": "d3969efb-0eec-4245-a317-4e032768a89b",
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
    "id": "e93eb365-845a-40a0-bbaf-dcaef52d3600",
    "order_id": "d3969efb-0eec-4245-a317-4e032768a89b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "303f1a4c-56ca-4a37-9b2d-4ac89e9289fe",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:28:43.015719Z",
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
  "session_id": "d941e5e2-f8cd-43c4-919b-318e309bb8a8",
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
  "last_heartbeat_at": "2026-10-28T15:28:41.345554Z",
  "last_location_at": "2026-10-28T15:28:41.345554Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d941e5e2-f8cd-43c4-919b-318e309bb8a8/close` → **200**

```json
{
  "command_id": "a20fd233-8407-4beb-a20b-33851fbc307e",
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
  "session_id": "7ec308a6-ca90-4e21-a5b4-020e4e3e6cc4",
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
  "last_heartbeat_at": "2026-10-28T15:28:44.488159Z",
  "last_location_at": "2026-10-28T15:28:44.488159Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7ec308a6-ca90-4e21-a5b4-020e4e3e6cc4/close` → **200**

```json
{
  "command_id": "972d2e4e-cb57-450c-bd39-f4375dab9638",
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

Done: terminal order d3969efb-0eec-4245-a317-4e032768a89b by Andrii (5a000000-0000-4000-8000-000000000403).
