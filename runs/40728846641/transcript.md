# Sandbox transcript (2026-10-28T16:44:52Z, 29b287b)

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
  "correlation_id": "7a1c180e-7944-492f-bc42-0afb2c992e65"
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
  "session_id": "1d24aebf-1038-452d-b984-84a2caa7221f",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY3OTksImlhdCI6MTc5MzIwNTg5OSwianRpIjoiMjk5ZWE0YjMtMjc3Mi00MjgyLTkwYWQtNGQ5MDQzODlkY2E1Iiwic2lkIjoiMWQyNGFlYmYtMTAzOC00NTJkLWI5ODQtODRhMmNhYTcyMjFmIn0.TseBfSGfEt8jZkLP6bMDLG1A1AxUqJ095mfD9axaPr0",
  "access_expires_at": "2026-10-28T16:59:59.381955953Z",
  "refresh_token": "U6TwCvar7Y-NLpfN8PK59NZ5V2s5jGoJUFtzomU0JEw",
  "refresh_expires_at": "2026-10-29T04:44:59.379687304Z",
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
  "session_id": "77f61bbb-e029-490d-9cc6-d2aac4d3924b",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY4MDAsImlhdCI6MTc5MzIwNTkwMCwianRpIjoiMzUxZTViYzUtY2EwMS00ZDJjLTg1ZDAtNDNmZGE0YWQ0YTAzIiwic2lkIjoiNzdmNjFiYmItZTAyOS00OTBkLTljYzYtZDJhYWM0ZDM5MjRiIn0.McZfP0SBsc10lTXNlxtjkjBpzstGN9ZlauNvMfZ62Nc",
  "access_expires_at": "2026-10-28T17:00:00.926494877Z",
  "refresh_token": "9GbcU5CLYK_7mr1CMI-zpHOCDSvw7dHMeB7JcD7Z99I",
  "refresh_expires_at": "2026-10-29T04:45:00.925556048Z",
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
  "command_id": "22fe7b77-4e9c-44af-821f-5143420b4dd0",
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
  "changed_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
  "reason": "Sandbox: force update",
  "changed_at": "2026-10-28T16:45:01.598950461Z"
}
```

## Bootstrap shows the raised minimum

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

## Outdated driver is refused going online

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380990000001",
  "device_ref": "sandbox-2017"
}
```

```json
{
  "challenge_id": "536f4246-cbd4-4e31-ba33-3bd65b56a84f",
  "expires_at": "2026-10-28T16:50:02.278972502Z",
  "resend_available_at": "2026-10-28T16:45:03.278972502Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380990000001` → **200**

```json
{
  "phone": "+380990000001",
  "audience": "DRIVER",
  "code": "651300",
  "sent_at": "2026-10-28T16:45:02.286422993Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "536f4246-cbd4-4e31-ba33-3bd65b56a84f",
  "code": "651300",
  "device_ref": "sandbox-2017"
}
```

```json
{
  "session_id": "5fd52dd8-ab0a-473f-b546-e278f4362073",
  "subject": {
    "type": "DRIVER",
    "id": "910d7137-e420-4a84-a210-a01df3967152"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTBkNzEzNy1lNDIwLTRhODQtYTIxMC1hMDFkZjM5NjcxNTIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjgwMiwiaWF0IjoxNzkzMjA1OTAyLCJqdGkiOiIzNjJhYmIxYi01NzU2LTQzMWQtYjc5OC0zYTJjMWM2YjM2OGQiLCJzaWQiOiI1ZmQ1MmRkOC1hYjBhLTQ3M2YtYjU0Ni1lMjc4ZjQzNjIwNzMifQ.Sn32rpJTp5yPyRvUy2BEvaZDZHpSBKlmtLOZzeMLfmM",
  "access_expires_at": "2026-10-28T17:00:02.608402737Z",
  "refresh_token": "jQSIrsvSV8CbM6oiCao0-OP1u9B3BE_tyMG3qN4IJpY",
  "refresh_expires_at": "2026-11-27T16:45:02.607320468Z",
  "account_created": true
}
```

`POST /api/driver/v1/work-sessions` → **409**

```json
{
  "command_id": "b00e899b-11e8-42ed-aaab-c396f4668ee1",
  "vehicle_id": "02479a67-a6ce-40fb-a5ee-003e5a5eddd9",
  "location": {
    "lat": 50.45,
    "lon": 30.52,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:45:02Z",
    "sequence": 1
  }
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions",
  "status": 409,
  "title": "Driver not eligible",
  "type": "https://errors.blizz.taxi/driver-not-eligible",
  "code": "DRIVER_NOT_ELIGIBLE",
  "correlation_id": "ce12adf2-5f42-4224-ba54-fd29827903db"
}
```

**Expected 426, got 409 — scenario stopped.**

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
  "changed_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
  "reason": "Sandbox: force update",
  "changed_at": "2026-10-28T16:45:01.59895Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "eeea4f9a-503f-464b-abda-94c2488c5016",
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
    "app_versions": null
  },
  "reason": "Sandbox clean-up"
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
    "app_versions": null
  },
  "changed_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
  "reason": "Sandbox clean-up",
  "changed_at": "2026-10-28T16:45:03.518292709Z"
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
  "session_id": "6bb090eb-a8e7-4c8b-a4de-792674f98466",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY4MDQsImlhdCI6MTc5MzIwNTkwNCwianRpIjoiYWNlZjg0ZWQtODFmOS00YWU2LTgzZTUtMjQ1YjBlMzY0ZjU2Iiwic2lkIjoiNmJiMDkwZWItYThlNy00YzhiLWE0ZGUtNzkyNjc0Zjk4NDY2In0.z-8rDpB45t5FdnDLmCq_Uk2MRXwciXoBVL03JpSrXZ0",
  "access_expires_at": "2026-10-28T17:00:04.11628736Z",
  "refresh_token": "SMt4EDYIlp5j-INa6F21y0EZsW-dI-PcE6WKel8dUts",
  "refresh_expires_at": "2026-10-29T04:45:04.11526804Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "012177c7-fe6b-4f05-ac1c-581bc5adda90",
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
  "id": "2ae75f5a-3de9-4f97-8ef9-bb725d45ccd0",
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
  "created_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
  "created_at": "2026-10-28T16:45:04.406255Z",
  "updated_at": "2026-10-28T16:45:04.406255Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639343976",
  "device_ref": "sandbox-25741"
}
```

```json
{
  "challenge_id": "6bb01de1-633c-43c3-94fb-7167f85ccd3d",
  "expires_at": "2026-10-28T16:50:04.691609325Z",
  "resend_available_at": "2026-10-28T16:45:05.691609325Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639343976` → **200**

```json
{
  "phone": "+380639343976",
  "audience": "CLIENT",
  "code": "025899",
  "sent_at": "2026-10-28T16:45:04.695361285Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6bb01de1-633c-43c3-94fb-7167f85ccd3d",
  "code": "025899",
  "device_ref": "sandbox-25741"
}
```

```json
{
  "session_id": "c430f7ff-60f7-4c4e-9507-0da76cffbd3a",
  "subject": {
    "type": "CLIENT",
    "id": "d802051c-4139-4461-bf46-270e98491c8a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODAyMDUxYy00MTM5LTQ0NjEtYmY0Ni0yNzBlOTg0OTFjOGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2ODA1LCJpYXQiOjE3OTMyMDU5MDUsImp0aSI6Ijk4ZDY0YWI1LWQzZDUtNDA5Mi04NGViLTA3N2E3OTY5MzI2ZCIsInNpZCI6ImM0MzBmN2ZmLTYwZjctNGM0ZS05NTA3LTBkYTc2Y2ZmYmQzYSJ9.L7_oxyH6U_YE4tNAjTlpCc1V1h118SBZRxCzarkYKd0",
  "access_expires_at": "2026-10-28T17:00:05.022935847Z",
  "refresh_token": "VVS-7QvYpAJjdAlJN4abLXEQ_4VVfB3hk0XfCWnMan8",
  "refresh_expires_at": "2026-11-27T16:45:05.021976781Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380639343976` → **200**

```json
{
  "client_id": "d802051c-4139-4461-bf46-270e98491c8a"
}
```

`POST /api/admin/v1/rider-wallets/d802051c-4139-4461-bf46-270e98491c8a/top-ups` → **201**

```json
{
  "command_id": "d62e80fe-bedb-4aec-8d09-7ef21bb958d4",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "d802051c-4139-4461-bf46-270e98491c8a",
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
      "id": "e4eebf95-d52d-4a18-97c2-b2c1d4e65b05",
      "at": "2026-10-28T16:45:05.583246Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "dc68d6eb-f015-445b-856c-b62f86a6025c",
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
  "id": "4f069790-9ec8-4131-b927-d55e1a2afe60",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:50:06.127536Z",
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
      "id": "2ae75f5a-3de9-4f97-8ef9-bb725d45ccd0",
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
  "device_ref": "sandbox-18510"
}
```

```json
{
  "challenge_id": "f626073a-cab0-42e4-b808-22915d8089bb",
  "expires_at": "2026-10-28T16:50:06.437505645Z",
  "resend_available_at": "2026-10-28T16:45:07.437505645Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "084623",
  "sent_at": "2026-10-28T16:45:06.442071924Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f626073a-cab0-42e4-b808-22915d8089bb",
  "code": "084623",
  "device_ref": "sandbox-18510"
}
```

```json
{
  "session_id": "1319128f-9b57-4f11-9ec8-040ef01cdf3a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjgwNiwiaWF0IjoxNzkzMjA1OTA2LCJqdGkiOiJhNDllMzFlNS0xNjBkLTQ1YWEtYTI4Zi0wM2FlNGM4MTE5NDciLCJzaWQiOiIxMzE5MTI4Zi05YjU3LTRmMTEtOWVjOC0wNDBlZjAxY2RmM2EifQ.telKAu27-oZNh6fM_dgOh77QWNBemVwURBxJ_2u6p04",
  "access_expires_at": "2026-10-28T17:00:06.751531244Z",
  "refresh_token": "n0PiKdfGCJEuKr2RpdXECWRzWNsfCp0iGJRbzAg1awA",
  "refresh_expires_at": "2026-11-27T16:45:06.750549125Z",
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
  "command_id": "9db4b1aa-1014-443f-b803-9ad24bb3a54d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:45:07Z",
    "sequence": 1793205907295
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7b2a67c1-b11e-425e-9b7c-ecc6d11374cf",
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
  "last_heartbeat_at": "2026-10-28T16:45:07.319468Z",
  "last_location_at": "2026-10-28T16:45:07.319468Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f316793f-7f3a-40e7-880c-6461f45e3d41",
  "quote_id": "4f069790-9ec8-4131-b927-d55e1a2afe60",
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
  "id": "a4c403b5-5c33-459a-a5e1-5a159e807083",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d802051c-4139-4461-bf46-270e98491c8a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:45:07.652874Z",
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
  "client_id": "d802051c-4139-4461-bf46-270e98491c8a",
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
      "id": "e4eebf95-d52d-4a18-97c2-b2c1d4e65b05",
      "at": "2026-10-28T16:45:05.583246Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
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
    "id": "0f0d8309-0b57-426d-aea0-b87e4e5bc799",
    "order_id": "a4c403b5-5c33-459a-a5e1-5a159e807083",
    "expires_at": "2026-10-28T16:45:22.665486Z",
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

`POST /api/driver/v1/offers/0f0d8309-0b57-426d-aea0-b87e4e5bc799/accept` → **200**

```json
{
  "command_id": "2dc40970-a41f-4fa8-a1b8-c4f8527361ac"
}
```

```json
{
  "id": "43ba02e6-b951-47a3-a05c-b043bc7da80c",
  "order_id": "a4c403b5-5c33-459a-a5e1-5a159e807083",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1a609ce1-d73e-4e65-b83e-2d4a0093fd23",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1a609ce1-d73e-4e65-b83e-2d4a0093fd23",
  "order_id": "a4c403b5-5c33-459a-a5e1-5a159e807083",
  "assignment_id": "43ba02e6-b951-47a3-a05c-b043bc7da80c",
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

`POST /api/driver/v1/work-sessions/7b2a67c1-b11e-425e-9b7c-ecc6d11374cf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:45:09Z",
    "sequence": 1793205909110
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7b2a67c1-b11e-425e-9b7c-ecc6d11374cf",
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
  "last_heartbeat_at": "2026-10-28T16:45:09.139466Z",
  "last_location_at": "2026-10-28T16:45:09.139466Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1a609ce1-d73e-4e65-b83e-2d4a0093fd23/arrive` → **200**

```json
{
  "command_id": "d3518671-0d76-40fc-8cca-9f34e1ecb40c",
  "expected_version": 0
}
```

```json
{
  "id": "1a609ce1-d73e-4e65-b83e-2d4a0093fd23",
  "order_id": "a4c403b5-5c33-459a-a5e1-5a159e807083",
  "assignment_id": "43ba02e6-b951-47a3-a05c-b043bc7da80c",
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
  "arrived_at": "2026-10-28T16:45:09.436119Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1a609ce1-d73e-4e65-b83e-2d4a0093fd23/start` → **200**

```json
{
  "command_id": "2a8e938f-77c5-491d-8a10-9178cb0289ae",
  "expected_version": 1
}
```

```json
{
  "id": "1a609ce1-d73e-4e65-b83e-2d4a0093fd23",
  "order_id": "a4c403b5-5c33-459a-a5e1-5a159e807083",
  "assignment_id": "43ba02e6-b951-47a3-a05c-b043bc7da80c",
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
  "arrived_at": "2026-10-28T16:45:09.436119Z",
  "started_at": "2026-10-28T16:45:09.749057Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/1a609ce1-d73e-4e65-b83e-2d4a0093fd23/complete` → **200**

```json
{
  "command_id": "8c37c155-0de4-4f42-a2a2-168585af5ae6",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:45:10Z",
  "cash_received": true
}
```

```json
{
  "id": "1a609ce1-d73e-4e65-b83e-2d4a0093fd23",
  "order_id": "a4c403b5-5c33-459a-a5e1-5a159e807083",
  "assignment_id": "43ba02e6-b951-47a3-a05c-b043bc7da80c",
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
  "arrived_at": "2026-10-28T16:45:09.436119Z",
  "started_at": "2026-10-28T16:45:09.749057Z",
  "completed_at": "2026-10-28T16:45:10.085364Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "d802051c-4139-4461-bf46-270e98491c8a",
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
      "id": "9e08d0b5-e273-4164-9cce-c6446b95a9f5",
      "at": "2026-10-28T16:45:10.756534Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "a4c403b5-5c33-459a-a5e1-5a159e807083"
    },
    {
      "id": "e4eebf95-d52d-4a18-97c2-b2c1d4e65b05",
      "at": "2026-10-28T16:45:05.583246Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/2ae75f5a-3de9-4f97-8ef9-bb725d45ccd0/archive` → **200**

```json
{
  "command_id": "9f6a72e7-d9a4-403a-b0ea-6829555eb97f",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "2ae75f5a-3de9-4f97-8ef9-bb725d45ccd0",
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
  "created_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
  "created_at": "2026-10-28T16:45:04.406255Z",
  "updated_at": "2026-10-28T16:45:13.692729Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7b2a67c1-b11e-425e-9b7c-ecc6d11374cf",
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
  "last_heartbeat_at": "2026-10-28T16:45:09.139466Z",
  "last_location_at": "2026-10-28T16:45:09.139466Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7b2a67c1-b11e-425e-9b7c-ecc6d11374cf/close` → **200**

```json
{
  "command_id": "bbef969b-e0aa-4a05-ac32-987e250d5bf1",
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

Done: order a4c403b5-5c33-459a-a5e1-5a159e807083.

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
  "session_id": "f8e3ab24-70cd-4943-8b77-0c71c88bfcaf",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY4MTQsImlhdCI6MTc5MzIwNTkxNCwianRpIjoiYTMzMGM2OWYtNDU2My00ZTg5LTg0NzQtMTlhOWY5MzNhZmRjIiwic2lkIjoiZjhlM2FiMjQtNzBjZC00OTQzLThiNzctMGM3MWM4OGJmY2FmIn0.6zT3FIo1LFZK6i3_4bYwIoMagI6O0eIOtOIRYtS2I3s",
  "access_expires_at": "2026-10-28T17:00:14.86243602Z",
  "refresh_token": "y_S4upxd9Kn63oi7z9YIkg29a6n95EHWaMW3Nu133C8",
  "refresh_expires_at": "2026-10-29T04:45:14.861619227Z",
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
  "command_id": "349eb0ff-ace5-4395-a6eb-5e5f4dbdf24d",
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
  "session_id": "ffe7a3db-937b-483d-8c5d-1d5dfcb622f2",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY4MTYsImlhdCI6MTc5MzIwNTkxNiwianRpIjoiZGE4NmNjODMtYTI4Mi00MjBkLThiZTktMTQ0ZjM3MzgxNDQ5Iiwic2lkIjoiZmZlN2EzZGItOTM3Yi00ODNkLThjNWQtMWQ1ZGZjYjYyMmYyIn0.A3DXq9e6RPXFEJoZ5fvmc2jVfhY98wemJ2LhtyH7axM",
  "access_expires_at": "2026-10-28T17:00:16.017298662Z",
  "refresh_token": "DfzYEyF3k2nVPU-9mDvYjVHMZv4bxy4UV00Xf6LSyts",
  "refresh_expires_at": "2026-10-29T04:45:16.016435991Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.1262111999",
    "linkedid": "1730052700.1262111999",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672089100"
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
    "id": "1730052700.1262111999",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "a3ff2ea0-b0e2-467a-bea9-08ee47da7648",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380672089100",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T16:45:16.28845Z",
      "answered_at": null,
      "ended_at": "2026-10-28T16:45:16.315539Z",
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
    "id": "1730052600.2959421030",
    "linkedid": "1730052600.2959421030",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672089100"
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
      "id": "d6dec466-0b14-4420-ab3f-5a242d30a302",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672089100",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T16:45:16.632681Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/d6dec466-0b14-4420-ab3f-5a242d30a302/answer` → **200**

```json
{
  "command_id": "4496d203-2789-4481-b833-9cc752a56a53"
}
```

```json
{
  "id": "d6dec466-0b14-4420-ab3f-5a242d30a302",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672089100",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
  "order_ids": [],
  "started_at": "2026-10-28T16:45:16.632681Z",
  "answered_at": "2026-10-28T16:45:16.961488Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2959421030",
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
    "id": "1730052600.2959421030",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "d6dec466-0b14-4420-ab3f-5a242d30a302",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672089100",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
      "order_ids": [],
      "started_at": "2026-10-28T16:45:16.632681Z",
      "answered_at": "2026-10-28T16:45:16.961488Z",
      "ended_at": "2026-10-28T16:45:17.266227Z",
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
      "id": "d6dec466-0b14-4420-ab3f-5a242d30a302",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672089100",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
      "order_ids": [],
      "started_at": "2026-10-28T16:45:16.632681Z",
      "answered_at": "2026-10-28T16:45:16.961488Z",
      "ended_at": "2026-10-28T16:45:17.266227Z",
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
      "id": "d6dec466-0b14-4420-ab3f-5a242d30a302",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672089100",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
      "order_ids": [],
      "started_at": "2026-10-28T16:45:16.632681Z",
      "answered_at": "2026-10-28T16:45:16.961488Z",
      "ended_at": "2026-10-28T16:45:17.266227Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T16:45:20.547406Z"
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
      "id": "d6dec466-0b14-4420-ab3f-5a242d30a302",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672089100",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
      "order_ids": [],
      "started_at": "2026-10-28T16:45:16.632681Z",
      "answered_at": "2026-10-28T16:45:16.961488Z",
      "ended_at": "2026-10-28T16:45:17.266227Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T16:45:20.547406Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/d6dec466-0b14-4420-ab3f-5a242d30a302/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/d6dec466-0b14-4420-ab3f-5a242d30a302/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=d6dec466-0b14-4420-ab3f-5a242d30a302` → **200**

```json
{
  "changes": [
    {
      "id": "a6b2c431-416b-4c5b-a54c-03f787976e78",
      "occurred_at": "2026-10-28T16:45:22.473552Z",
      "actor_type": "STAFF",
      "actor_id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "d6dec466-0b14-4420-ab3f-5a242d30a302",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"7634cb91-0b90-49b2-aae0-7718840b35eb\", \"order_ids\": []}",
      "correlation_id": "ccea99b4-45b7-43ad-b75d-ef2665c80603"
    },
    {
      "id": "b1c86784-e817-4afa-94d6-253f21a5fce0",
      "occurred_at": "2026-10-28T16:45:22.43825Z",
      "actor_type": "STAFF",
      "actor_id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "d6dec466-0b14-4420-ab3f-5a242d30a302",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"7634cb91-0b90-49b2-aae0-7718840b35eb\", \"order_ids\": []}",
      "correlation_id": "dec56187-7bb9-4eea-beff-7a8d63a099be"
    }
  ]
}
```

Done: call d6dec466-0b14-4420-ab3f-5a242d30a302 recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636981474",
  "device_ref": "sandbox-23490"
}
```

```json
{
  "challenge_id": "ca480eef-98f7-483b-88fe-ad9eba4d38e5",
  "expires_at": "2026-10-28T16:50:22.800219723Z",
  "resend_available_at": "2026-10-28T16:45:23.800219723Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636981474` → **200**

```json
{
  "phone": "+380636981474",
  "audience": "CLIENT",
  "code": "788860",
  "sent_at": "2026-10-28T16:45:22.80433697Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ca480eef-98f7-483b-88fe-ad9eba4d38e5",
  "code": "788860",
  "device_ref": "sandbox-23490"
}
```

```json
{
  "session_id": "ce9af4d5-09a8-42ac-8872-03c1d28afba6",
  "subject": {
    "type": "CLIENT",
    "id": "56badb2d-d4c6-4602-a0ba-543089506a19"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NmJhZGIyZC1kNGM2LTQ2MDItYTBiYS01NDMwODk1MDZhMTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2ODIzLCJpYXQiOjE3OTMyMDU5MjMsImp0aSI6IjFiOGU5NTY2LTYxZWYtNGNmOS1hM2Y1LTExMGM5NzJhZTQxNSIsInNpZCI6ImNlOWFmNGQ1LTA5YTgtNDJhYy04ODcyLTAzYzFkMjhhZmJhNiJ9.RF0a8V0-kvDiZJE0QXLAFdPbhxb3jsvl7By9O1kNgHo",
  "access_expires_at": "2026-10-28T17:00:23.111624917Z",
  "refresh_token": "T4UTR1mbwuCs5HRET8bEutC7Ati0esIQftME7VH7oBU",
  "refresh_expires_at": "2026-11-27T16:45:23.110811246Z",
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
  "device_ref": "sandbox-26727"
}
```

```json
{
  "challenge_id": "c776492a-5bd2-4e26-97d0-26ab24a0ebea",
  "expires_at": "2026-10-28T16:50:23.674913869Z",
  "resend_available_at": "2026-10-28T16:45:24.674913869Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "818895",
  "sent_at": "2026-10-28T16:45:23.678675939Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c776492a-5bd2-4e26-97d0-26ab24a0ebea",
  "code": "818895",
  "device_ref": "sandbox-26727"
}
```

```json
{
  "session_id": "90c5e197-6c2b-4823-a073-59fc76f20a51",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjgyMywiaWF0IjoxNzkzMjA1OTIzLCJqdGkiOiI0YmI3Yjk3Yi1kOThlLTQ1ZGUtODM5YS03OGQ0MDk2MjExYjUiLCJzaWQiOiI5MGM1ZTE5Ny02YzJiLTQ4MjMtYTA3My01OWZjNzZmMjBhNTEifQ._3GwaNSBT_YIravP0OJJtBLRQb0ry6rozsedV4J10SI",
  "access_expires_at": "2026-10-28T17:00:23.978696687Z",
  "refresh_token": "8GyimrBhFn4rT4nt62Z1GcKoUK4yhfWTIO0vS7sje1k",
  "refresh_expires_at": "2026-11-27T16:45:23.977888432Z",
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
  "session_id": "689cce85-b56e-469b-8c5f-afeffb393510",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY4MjQsImlhdCI6MTc5MzIwNTkyNCwianRpIjoiYmZmYjBiYjQtNzlmMS00MGMxLWI3NjYtMDZjYjczMjY5N2JhIiwic2lkIjoiNjg5Y2NlODUtYjU2ZS00NjliLThjNWYtYWZlZmZiMzkzNTEwIn0.ijbixSyQhHeZ3QfucUwX_LNF5SddW3sg-d_mj9ZFLEM",
  "access_expires_at": "2026-10-28T17:00:24.821183822Z",
  "refresh_token": "GHcuYwpg5T53egDBsEJ6eYObvkLO8upigRDf9uQnVqg",
  "refresh_expires_at": "2026-10-29T04:45:24.820378404Z",
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
  "session_id": "d3ba9a33-e725-478b-bef4-e9f3e20afffb",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY4MjUsImlhdCI6MTc5MzIwNTkyNSwianRpIjoiZmI2NzU2MjctN2Q0Ny00MTBiLTg5NWQtMzUyMzU3OWU0YWY3Iiwic2lkIjoiZDNiYTlhMzMtZTcyNS00NzhiLWJlZjQtZTlmM2UyMGFmZmZiIn0.Q4dfdwsDkq4ijA1TJorMZS_CjZG-tgZRsMPGm1pUrDQ",
  "access_expires_at": "2026-10-28T17:00:25.3955359Z",
  "refresh_token": "kYENK3sCdZm_A-JJJqFtOzUQZWAovttdwIKPuhAPGBw",
  "refresh_expires_at": "2026-10-29T04:45:25.394904437Z",
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
  "command_id": "09c344a3-98f3-47b5-86f0-579377a79a05",
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
  "id": "6b4fe184-cc04-48a9-9b30-f9b28aaa794c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:50:25.966109Z",
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
  "command_id": "592857ff-3ad0-4283-ad7c-ceb94c53dd7c",
  "quote_id": "6b4fe184-cc04-48a9-9b30-f9b28aaa794c",
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
  "id": "c88ed385-e0b8-446b-8e16-6a4dc4bfb9d2",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56badb2d-d4c6-4602-a0ba-543089506a19",
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
  "created_at": "2026-10-28T16:45:26.263509Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/c88ed385-e0b8-446b-8e16-6a4dc4bfb9d2` → **200**

```json
{
  "id": "c88ed385-e0b8-446b-8e16-6a4dc4bfb9d2",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56badb2d-d4c6-4602-a0ba-543089506a19",
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
  "created_at": "2026-10-28T16:45:26.263509Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/c88ed385-e0b8-446b-8e16-6a4dc4bfb9d2/cancel` → **200**

```json
{
  "command_id": "b7c4c41d-2f4a-462b-bf4c-1393b2037b6b",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "c88ed385-e0b8-446b-8e16-6a4dc4bfb9d2",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "56badb2d-d4c6-4602-a0ba-543089506a19",
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
  "created_at": "2026-10-28T16:45:26.263509Z",
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
  "command_id": "748c3c7c-7b21-45d6-9e53-803fc1d5a2d2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:45:27Z",
    "sequence": 1793205927426
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "fce638e2-a8b9-48ff-b592-41b2958d1910",
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
  "last_heartbeat_at": "2026-10-28T16:45:27.448104Z",
  "last_location_at": "2026-10-28T16:45:27.448104Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-3854"
}
```

```json
{
  "challenge_id": "3c5d3861-e73f-451f-bef2-257471aa2518",
  "expires_at": "2026-10-28T16:50:27.71617029Z",
  "resend_available_at": "2026-10-28T16:45:28.71617029Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "439776",
  "sent_at": "2026-10-28T16:45:27.719232513Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c5d3861-e73f-451f-bef2-257471aa2518",
  "code": "439776",
  "device_ref": "sandbox-3854"
}
```

```json
{
  "session_id": "2ff9559b-1d43-4cc1-ad49-aabcb3188235",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjgyOCwiaWF0IjoxNzkzMjA1OTI4LCJqdGkiOiJkMjdhYzUyZi00NjcyLTQ4NGEtYjc3My0zMGJiYzNlZDFlZWYiLCJzaWQiOiIyZmY5NTU5Yi0xZDQzLTRjYzEtYWQ0OS1hYWJjYjMxODgyMzUifQ.lxFPpTyNRI2Spfe4vA_5z6bAodVoyDrexnLA3JmZBSc",
  "access_expires_at": "2026-10-28T17:00:28.028811049Z",
  "refresh_token": "5HJUWIr8DMfOqG7bFRT7vYI8mPBQD5SrmFmAEo1g0V4",
  "refresh_expires_at": "2026-11-27T16:45:28.028029356Z",
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
  "command_id": "76c3bde5-0f3a-43f9-bad3-529addacfcc0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:45:28Z",
    "sequence": 1793205928566
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "040c9796-c596-4913-8b16-ab961048f030",
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
  "last_heartbeat_at": "2026-10-28T16:45:28.587458Z",
  "last_location_at": "2026-10-28T16:45:28.587458Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "839b2da0-8b30-4726-b309-7baf095b8575",
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
  "id": "7fa2b6b0-49e1-43b0-b374-f7e4ad112bcc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:50:28.875403Z",
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
  "command_id": "344d523b-ae21-42ed-ba4c-9a58a6e2430a",
  "quote_id": "7fa2b6b0-49e1-43b0-b374-f7e4ad112bcc",
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
  "id": "da0297f8-ded0-49e9-91aa-31677b0c0b8a",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56badb2d-d4c6-4602-a0ba-543089506a19",
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
  "created_at": "2026-10-28T16:45:29.168654Z",
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
    "id": "1199abad-691f-41fd-9357-ff7f74ca8a88",
    "order_id": "da0297f8-ded0-49e9-91aa-31677b0c0b8a",
    "expires_at": "2026-10-28T16:45:44.172847Z",
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

`POST /api/driver/v1/offers/1199abad-691f-41fd-9357-ff7f74ca8a88/accept` → **200**

```json
{
  "command_id": "8f30315a-d9f5-4769-99af-4d6e891a7b78"
}
```

```json
{
  "id": "eb6f0793-0724-4bf0-990a-d5ca925e7f83",
  "order_id": "da0297f8-ded0-49e9-91aa-31677b0c0b8a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1c1eda7e-c031-493f-b1ed-2cd41a852e81",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1c1eda7e-c031-493f-b1ed-2cd41a852e81",
  "order_id": "da0297f8-ded0-49e9-91aa-31677b0c0b8a",
  "assignment_id": "eb6f0793-0724-4bf0-990a-d5ca925e7f83",
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

`POST /api/driver/v1/trips/1c1eda7e-c031-493f-b1ed-2cd41a852e81/cancel` → **200**

```json
{
  "command_id": "da952159-9626-4531-bef4-2626841f5b23",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "1c1eda7e-c031-493f-b1ed-2cd41a852e81",
  "order_id": "da0297f8-ded0-49e9-91aa-31677b0c0b8a",
  "assignment_id": "eb6f0793-0724-4bf0-990a-d5ca925e7f83",
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

`GET /api/rider/v1/orders/da0297f8-ded0-49e9-91aa-31677b0c0b8a` → **200**

```json
{
  "id": "da0297f8-ded0-49e9-91aa-31677b0c0b8a",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "56badb2d-d4c6-4602-a0ba-543089506a19",
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
    "id": "eb6f0793-0724-4bf0-990a-d5ca925e7f83",
    "order_id": "da0297f8-ded0-49e9-91aa-31677b0c0b8a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "1c1eda7e-c031-493f-b1ed-2cd41a852e81",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T16:45:29.168654Z",
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
    "id": "ab65527b-bb77-483d-a03c-d0c45318764c",
    "order_id": "da0297f8-ded0-49e9-91aa-31677b0c0b8a",
    "expires_at": "2026-10-28T16:45:45.349498Z",
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

`POST /api/driver/v1/offers/ab65527b-bb77-483d-a03c-d0c45318764c/accept` → **200**

```json
{
  "command_id": "c04bb3b2-69aa-4ca9-a388-7b28e5bd8b2b"
}
```

```json
{
  "id": "0f3bbc1e-d42c-41ac-bc2e-00543433ca21",
  "order_id": "da0297f8-ded0-49e9-91aa-31677b0c0b8a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7e8977bf-ecd5-413c-acad-f29367e899dc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7e8977bf-ecd5-413c-acad-f29367e899dc",
  "order_id": "da0297f8-ded0-49e9-91aa-31677b0c0b8a",
  "assignment_id": "0f3bbc1e-d42c-41ac-bc2e-00543433ca21",
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

`POST /api/driver/v1/trips/7e8977bf-ecd5-413c-acad-f29367e899dc/cancel` → **200**

```json
{
  "command_id": "f8cb67cb-8fd1-4a84-b944-720d633c10dc",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "7e8977bf-ecd5-413c-acad-f29367e899dc",
  "order_id": "da0297f8-ded0-49e9-91aa-31677b0c0b8a",
  "assignment_id": "0f3bbc1e-d42c-41ac-bc2e-00543433ca21",
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
    "id": "da0297f8-ded0-49e9-91aa-31677b0c0b8a",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T16:45:29.168654Z",
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
    "id": "c88ed385-e0b8-446b-8e16-6a4dc4bfb9d2",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T16:45:26.263509Z",
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

`GET /api/operator/v1/orders/da0297f8-ded0-49e9-91aa-31677b0c0b8a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:45:29.16937Z",
      "actor": {
        "type": "CLIENT",
        "id": "56badb2d-d4c6-4602-a0ba-543089506a19",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "da0297f8-ded0-49e9-91aa-31677b0c0b8a",
        "quote_id": "7fa2b6b0-49e1-43b0-b374-f7e4ad112bcc",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "20d09d79-a21d-4336-b8d5-2d06a6206bc3"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:45:29.171582Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "da0297f8-ded0-49e9-91aa-31677b0c0b8a",
        "attempt_id": "c02cabd1-b2a9-4079-9176-d371af311051",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "20d09d79-a21d-4336-b8d5-2d06a6206bc3"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T16:45:29.179443Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1199abad-691f-41fd-9357-ff7f74ca8a88",
        "order_id": "da0297f8-ded0-49e9-91aa-31677b0c0b8a",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "20d09d79-a21d-4336-b8d5-2d06a6206bc3"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T16:45:29.74247Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "1199abad-691f-41fd-9357-ff7f74ca8a88",
        "order_id": "da0297f8-ded0-49e9-91aa-31677b0c0b8a",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "eb6f0793-0724-4bf0-990a-d5ca925e7f83"
      },
      "correlation_id": "2c096e4b-8e39-4d88-be6a-d00fc291501b"
```

Done: orders c88ed385-e0b8-446b-8e16-6a4dc4bfb9d2, da0297f8-ded0-49e9-91aa-31677b0c0b8a.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732264329",
  "device_ref": "sandbox-23815"
}
```

```json
{
  "challenge_id": "8ae2d724-d865-4ab8-8c41-259d9b8e9456",
  "expires_at": "2026-10-28T16:50:32.625004004Z",
  "resend_available_at": "2026-10-28T16:45:33.625004004Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732264329` → **200**

```json
{
  "phone": "+380732264329",
  "audience": "CLIENT",
  "code": "651115",
  "sent_at": "2026-10-28T16:45:32.628132932Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8ae2d724-d865-4ab8-8c41-259d9b8e9456",
  "code": "651115",
  "device_ref": "sandbox-23815"
}
```

```json
{
  "session_id": "1d85bc4a-c36f-4bed-864f-af536f60a4c2",
  "subject": {
    "type": "CLIENT",
    "id": "c5107bc8-9aff-4409-aca3-63b376823057"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNTEwN2JjOC05YWZmLTQ0MDktYWNhMy02M2IzNzY4MjMwNTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2ODMyLCJpYXQiOjE3OTMyMDU5MzIsImp0aSI6ImEzNmQ2NjI4LTUwNzctNGU1My1hMjQwLTRmNjY4NjBhNDE0OSIsInNpZCI6IjFkODViYzRhLWMzNmYtNGJlZC04NjRmLWFmNTM2ZjYwYTRjMiJ9.MOERMvPdBUK9oELYqmvJMEzgb4OWRG-lEhfsyx_uPOg",
  "access_expires_at": "2026-10-28T17:00:32.924105742Z",
  "refresh_token": "kTHCDAjeGzTtTSYvhv435Pt2xFwrrhbc6IRePTurKfI",
  "refresh_expires_at": "2026-11-27T16:45:32.92345882Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "0e122fa1-e8c9-42f3-944a-7bd4f1768cd1",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b49a04ad-2034-40a0-85b2-0b952aec70f7",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b49a04ad-2034-40a0-85b2-0b952aec70f7",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "716e7c20146b00e166edde9087ca875d",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b49a04ad-2034-40a0-85b2-0b952aec70f7",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732264329"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b49a04ad-2034-40a0-85b2-0b952aec70f7",
  "expires_at": "2026-10-28T17:15:33.201387Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/b49a04ad-2034-40a0-85b2-0b952aec70f7` → **200**

```json
{
  "id": "b49a04ad-2034-40a0-85b2-0b952aec70f7",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T17:15:33.201387Z",
  "card": {
    "id": "6118f6a0-6b78-431f-92a6-da8a277f6f82",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0770",
    "card_type": "Visa",
    "created_at": "2026-10-28T16:45:33.491399Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "6118f6a0-6b78-431f-92a6-da8a277f6f82",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****0770",
      "card_type": "Visa",
      "created_at": "2026-10-28T16:45:33.491399Z"
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
  "device_ref": "sandbox-17307"
}
```

```json
{
  "challenge_id": "bfbd67da-a310-4ab4-be2b-2d53b7549709",
  "expires_at": "2026-10-28T16:50:34.057341956Z",
  "resend_available_at": "2026-10-28T16:45:35.057341956Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "636394",
  "sent_at": "2026-10-28T16:45:34.060801772Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bfbd67da-a310-4ab4-be2b-2d53b7549709",
  "code": "636394",
  "device_ref": "sandbox-17307"
}
```

```json
{
  "session_id": "b2d30dab-0e13-41cd-a346-35adc9b29f00",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjgzNCwiaWF0IjoxNzkzMjA1OTM0LCJqdGkiOiI2NGRkNGI4MS0zYjkzLTRiMjktOTYzZS01M2IyOWYzOWI3ZjMiLCJzaWQiOiJiMmQzMGRhYi0wZTEzLTQxY2QtYTM0Ni0zNWFkYzliMjlmMDAifQ._Eb9fagedLngfQvUEUy1kZYBVUXtM9K1fXBkzf2IfQw",
  "access_expires_at": "2026-10-28T17:00:34.359527984Z",
  "refresh_token": "ppsNnphwYvdwicvqGVo8UUuptdybbGT4vVx5Zk14mAE",
  "refresh_expires_at": "2026-11-27T16:45:34.358913283Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "040c9796-c596-4913-8b16-ab961048f030",
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
  "last_heartbeat_at": "2026-10-28T16:45:28.587458Z",
  "last_location_at": "2026-10-28T16:45:28.587458Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/040c9796-c596-4913-8b16-ab961048f030/handover` → **200**

```json
{
  "command_id": "b297929a-ce7e-49e7-8e20-14b2fa46e4ca",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "040c9796-c596-4913-8b16-ab961048f030",
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
  "last_heartbeat_at": "2026-10-28T16:45:28.587458Z",
  "last_location_at": "2026-10-28T16:45:28.587458Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/040c9796-c596-4913-8b16-ab961048f030/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:45:35Z",
    "sequence": 1793205935188
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "040c9796-c596-4913-8b16-ab961048f030",
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
  "last_heartbeat_at": "2026-10-28T16:45:35.209888Z",
  "last_location_at": "2026-10-28T16:45:35.209888Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "92eb9c6b-ba59-4e6c-a432-8e79f6519ce3",
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
  "id": "3b12fd29-b346-4d5e-86f5-b947007f3bae",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:50:35.510075Z",
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
  "command_id": "ab590fb0-9b63-4b3e-938c-20e8204bae94",
  "quote_id": "3b12fd29-b346-4d5e-86f5-b947007f3bae",
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
  "id": "5134bd12-b0b9-44c3-879f-98acd628f072",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c5107bc8-9aff-4409-aca3-63b376823057",
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
  "created_at": "2026-10-28T16:45:35.806374Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/5134bd12-b0b9-44c3-879f-98acd628f072` → **200**

```json
{
  "id": "5134bd12-b0b9-44c3-879f-98acd628f072",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c5107bc8-9aff-4409-aca3-63b376823057",
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
  "created_at": "2026-10-28T16:45:35.806374Z",
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
    "id": "08aead35-1f17-4baa-857d-321a92ff4e6e",
    "order_id": "5134bd12-b0b9-44c3-879f-98acd628f072",
    "expires_at": "2026-10-28T16:45:50.9252Z",
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

`POST /api/driver/v1/offers/08aead35-1f17-4baa-857d-321a92ff4e6e/accept` → **200**

```json
{
  "command_id": "770003e8-1cb7-4eb4-b9d2-f3c0fcbf80b6"
}
```

```json
{
  "id": "c5a48194-da47-4b59-baad-348b8875b8d7",
  "order_id": "5134bd12-b0b9-44c3-879f-98acd628f072",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "44345df3-b195-4fb2-8181-86b1a6be3ef5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "44345df3-b195-4fb2-8181-86b1a6be3ef5",
  "order_id": "5134bd12-b0b9-44c3-879f-98acd628f072",
  "assignment_id": "c5a48194-da47-4b59-baad-348b8875b8d7",
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

`POST /api/driver/v1/work-sessions/040c9796-c596-4913-8b16-ab961048f030/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:45:37Z",
    "sequence": 1793205937222
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "040c9796-c596-4913-8b16-ab961048f030",
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
  "last_heartbeat_at": "2026-10-28T16:45:37.244212Z",
  "last_location_at": "2026-10-28T16:45:37.244212Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/44345df3-b195-4fb2-8181-86b1a6be3ef5/arrive` → **200**

```json
{
  "command_id": "ac78e24f-559b-42e3-8cd9-7df7bc89c56e",
  "expected_version": 0
}
```

```json
{
  "id": "44345df3-b195-4fb2-8181-86b1a6be3ef5",
  "order_id": "5134bd12-b0b9-44c3-879f-98acd628f072",
  "assignment_id": "c5a48194-da47-4b59-baad-348b8875b8d7",
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
  "arrived_at": "2026-10-28T16:45:37.525101Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/44345df3-b195-4fb2-8181-86b1a6be3ef5/start` → **200**

```json
{
  "command_id": "9135bc43-c80e-40c5-b650-ad127299d0b3",
  "expected_version": 1
}
```

```json
{
  "id": "44345df3-b195-4fb2-8181-86b1a6be3ef5",
  "order_id": "5134bd12-b0b9-44c3-879f-98acd628f072",
  "assignment_id": "c5a48194-da47-4b59-baad-348b8875b8d7",
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
  "arrived_at": "2026-10-28T16:45:37.525101Z",
  "started_at": "2026-10-28T16:45:37.816094Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/44345df3-b195-4fb2-8181-86b1a6be3ef5/complete` → **200**

```json
{
  "command_id": "b41f19f2-1aff-4ccc-8da9-6306e6b66d75",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:45:38Z"
}
```

```json
{
  "id": "44345df3-b195-4fb2-8181-86b1a6be3ef5",
  "order_id": "5134bd12-b0b9-44c3-879f-98acd628f072",
  "assignment_id": "c5a48194-da47-4b59-baad-348b8875b8d7",
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
  "arrived_at": "2026-10-28T16:45:37.525101Z",
  "started_at": "2026-10-28T16:45:37.816094Z",
  "completed_at": "2026-10-28T16:45:38.126326Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/5134bd12-b0b9-44c3-879f-98acd628f072` → **200**

```json
{
  "id": "5134bd12-b0b9-44c3-879f-98acd628f072",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c5107bc8-9aff-4409-aca3-63b376823057",
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
    "id": "c5a48194-da47-4b59-baad-348b8875b8d7",
    "order_id": "5134bd12-b0b9-44c3-879f-98acd628f072",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "44345df3-b195-4fb2-8181-86b1a6be3ef5",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:45:35.806374Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/5134bd12-b0b9-44c3-879f-98acd628f072` → **200**

```json
{
  "id": "5134bd12-b0b9-44c3-879f-98acd628f072",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c5107bc8-9aff-4409-aca3-63b376823057",
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
    "id": "c5a48194-da47-4b59-baad-348b8875b8d7",
    "order_id": "5134bd12-b0b9-44c3-879f-98acd628f072",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "44345df3-b195-4fb2-8181-86b1a6be3ef5",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:45:35.806374Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/5134bd12-b0b9-44c3-879f-98acd628f072` → **200**

```json
{
  "id": "5134bd12-b0b9-44c3-879f-98acd628f072",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c5107bc8-9aff-4409-aca3-63b376823057",
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
    "id": "c5a48194-da47-4b59-baad-348b8875b8d7",
    "order_id": "5134bd12-b0b9-44c3-879f-98acd628f072",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "44345df3-b195-4fb2-8181-86b1a6be3ef5",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:45:35.806374Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/5134bd12-b0b9-44c3-879f-98acd628f072` → **200**

```json
{
  "id": "5134bd12-b0b9-44c3-879f-98acd628f072",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "c5107bc8-9aff-4409-aca3-63b376823057",
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
    "id": "c5a48194-da47-4b59-baad-348b8875b8d7",
    "order_id": "5134bd12-b0b9-44c3-879f-98acd628f072",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "44345df3-b195-4fb2-8181-86b1a6be3ef5",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:45:35.806374Z",
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
      "id": "9de50b61-b5f6-4680-b32a-bd73a1d2aa96",
      "at": "2026-10-28T16:45:38.986364Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5134bd12-b0b9-44c3-879f-98acd628f072",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/5134bd12-b0b9-44c3-879f-98acd628f072/tip` → **200**

```json
{
  "order_id": "5134bd12-b0b9-44c3-879f-98acd628f072",
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
  "available_until": "2026-10-29T16:45:38.126326Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/5134bd12-b0b9-44c3-879f-98acd628f072/tip` → **201**

```json
{
  "command_id": "11606a74-4716-4e63-ac2c-7d8cc20acc8a",
  "amount_minor": 2500
}
```

```json
{
  "id": "10ef4921-a2c9-4c5c-add5-00aa035a1168",
  "order_id": "5134bd12-b0b9-44c3-879f-98acd628f072",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T16:45:43.376579Z"
}
```

`GET /api/rider/v1/orders/5134bd12-b0b9-44c3-879f-98acd628f072/tip` → **200**

```json
{
  "order_id": "5134bd12-b0b9-44c3-879f-98acd628f072",
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
  "available_until": "2026-10-29T16:45:38.126326Z",
  "open": false,
  "tip": {
    "id": "10ef4921-a2c9-4c5c-add5-00aa035a1168",
    "order_id": "5134bd12-b0b9-44c3-879f-98acd628f072",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T16:45:43.376579Z"
  }
}
```

`GET /api/rider/v1/orders/5134bd12-b0b9-44c3-879f-98acd628f072/tip` → **200**

```json
{
  "order_id": "5134bd12-b0b9-44c3-879f-98acd628f072",
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
  "available_until": "2026-10-29T16:45:38.126326Z",
  "open": false,
  "tip": {
    "id": "10ef4921-a2c9-4c5c-add5-00aa035a1168",
    "order_id": "5134bd12-b0b9-44c3-879f-98acd628f072",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T16:45:43.376579Z"
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
      "id": "b74ce6e4-4afb-44cd-a9ed-0444cb23e940",
      "at": "2026-10-28T16:45:45.046274Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5134bd12-b0b9-44c3-879f-98acd628f072",
      "counterpart_id": null
    },
    {
      "id": "9de50b61-b5f6-4680-b32a-bd73a1d2aa96",
      "at": "2026-10-28T16:45:38.986364Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5134bd12-b0b9-44c3-879f-98acd628f072",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "040c9796-c596-4913-8b16-ab961048f030",
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
  "last_heartbeat_at": "2026-10-28T16:45:37.244212Z",
  "last_location_at": "2026-10-28T16:45:37.244212Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/040c9796-c596-4913-8b16-ab961048f030/close` → **200**

```json
{
  "command_id": "fb0efe72-9525-4e3f-acca-33213f5c397a",
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

Done: card order 5134bd12-b0b9-44c3-879f-98acd628f072.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732822636",
  "device_ref": "sandbox-14035"
}
```

```json
{
  "challenge_id": "a72d0fcb-3ec3-4891-8ba4-1cc33ae3f7b5",
  "expires_at": "2026-10-28T16:50:46.055929774Z",
  "resend_available_at": "2026-10-28T16:45:47.055929774Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732822636` → **200**

```json
{
  "phone": "+380732822636",
  "audience": "CLIENT",
  "code": "210626",
  "sent_at": "2026-10-28T16:45:46.059944932Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a72d0fcb-3ec3-4891-8ba4-1cc33ae3f7b5",
  "code": "210626",
  "device_ref": "sandbox-14035"
}
```

```json
{
  "session_id": "370be93b-337f-44d3-a459-1b743da07ae2",
  "subject": {
    "type": "CLIENT",
    "id": "014929c5-d2c4-4973-a28e-829f1dd212e0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMTQ5MjljNS1kMmM0LTQ5NzMtYTI4ZS04MjlmMWRkMjEyZTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2ODQ2LCJpYXQiOjE3OTMyMDU5NDYsImp0aSI6IjhiOGFkYWNlLTkzNTktNGY2Ni1hZGQ4LWFjZjg1NzZjYjUwNiIsInNpZCI6IjM3MGJlOTNiLTMzN2YtNDRkMy1hNDU5LTFiNzQzZGEwN2FlMiJ9.y0xbKO0bsVVmppS5T3-OYj55M5Im2soS7tIUBOeawAY",
  "access_expires_at": "2026-10-28T17:00:46.362589517Z",
  "refresh_token": "qv2lSrkc8ZZfnYHdSpM7LzBbS2KhLV24eCNZqlLw4uo",
  "refresh_expires_at": "2026-11-27T16:45:46.362015682Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "73dbb178-3a67-4afb-ae5a-96072e996e37",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "cdb5c887-40c2-43f5-a682-51a99cfc0cec",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-cdb5c887-40c2-43f5-a682-51a99cfc0cec",
    "orderDate": "1793205946",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "9afda0e407772fda33d2a606599ce842",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=cdb5c887-40c2-43f5-a682-51a99cfc0cec",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732822636"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=cdb5c887-40c2-43f5-a682-51a99cfc0cec",
  "created_at": "2026-10-28T16:45:46.640991Z",
  "expires_at": "2026-10-28T17:15:46.640991Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/cdb5c887-40c2-43f5-a682-51a99cfc0cec` → **200**

```json
{
  "id": "cdb5c887-40c2-43f5-a682-51a99cfc0cec",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T16:45:46.640991Z",
  "expires_at": "2026-10-28T17:15:46.640991Z",
  "completed_at": "2026-10-28T16:45:46.930933Z",
  "masked_pan": "41****1269",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "014929c5-d2c4-4973-a28e-829f1dd212e0",
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
      "id": "50108626-538c-4485-90ba-c3c497af2e8c",
      "at": "2026-10-28T16:45:47.065289Z",
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
  "client_id": "014929c5-d2c4-4973-a28e-829f1dd212e0",
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
      "id": "50108626-538c-4485-90ba-c3c497af2e8c",
      "at": "2026-10-28T16:45:47.065289Z",
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
  "device_ref": "sandbox-2403"
}
```

```json
{
  "challenge_id": "d71dd4f6-4a73-4519-8c3b-b39b56302594",
  "expires_at": "2026-10-28T16:50:47.791341779Z",
  "resend_available_at": "2026-10-28T16:45:48.791341779Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "179335",
  "sent_at": "2026-10-28T16:45:47.794377373Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d71dd4f6-4a73-4519-8c3b-b39b56302594",
  "code": "179335",
  "device_ref": "sandbox-2403"
}
```

```json
{
  "session_id": "a0b72ec1-2610-499d-b018-08bc7d07f40f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjg0OCwiaWF0IjoxNzkzMjA1OTQ4LCJqdGkiOiJjNzg1YzE1ZS1hYjU3LTRjNmYtYjE5Mi02OTM4ZWMzYTUwYmIiLCJzaWQiOiJhMGI3MmVjMS0yNjEwLTQ5OWQtYjAxOC0wOGJjN2QwN2Y0MGYifQ.sHbn2G6hp9mTWfpuVv8Zz1O5VeMq5QkA-RgCKPZxc7A",
  "access_expires_at": "2026-10-28T17:00:48.090259035Z",
  "refresh_token": "fuvWt2TYtZEspNiQKShScV2EhnxRfC9F9hSAvZq9NOo",
  "refresh_expires_at": "2026-11-27T16:45:48.089635057Z",
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
  "command_id": "208cc5f9-88da-4a76-8989-d650a10fca23",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "9d955b07-0390-4893-9667-d074060a66d8",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-9d955b07-0390-4893-9667-d074060a66d8",
    "orderDate": "1793205948",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "487c2b64427b360befb7b0871d4629c8",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=9d955b07-0390-4893-9667-d074060a66d8",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=9d955b07-0390-4893-9667-d074060a66d8",
  "created_at": "2026-10-28T16:45:48.62925Z",
  "expires_at": "2026-10-28T17:15:48.62925Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/9d955b07-0390-4893-9667-d074060a66d8` → **200**

```json
{
  "id": "9d955b07-0390-4893-9667-d074060a66d8",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T16:45:48.62925Z",
  "expires_at": "2026-10-28T17:15:48.62925Z",
  "completed_at": "2026-10-28T16:45:48.910446Z",
  "masked_pan": "41****8242",
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
      "id": "7b5304ac-a351-4bfe-8a27-5f8adddb6a99",
      "at": "2026-10-28T16:45:49.0762Z",
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
  "command_id": "ad32181d-68ed-4d52-8db1-3218b3cda631",
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
  "correlation_id": "0fe493f3-ce83-4e40-bd35-223cd033524c"
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
  "session_id": "c1dc6895-71a1-4c71-9593-1bec619edea6",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY4NTAsImlhdCI6MTc5MzIwNTk1MCwianRpIjoiNDViOTQ3MTctNmYwZC00YWNiLThjODItOTllYTQ2M2VlMmE3Iiwic2lkIjoiYzFkYzY4OTUtNzFhMS00YzcxLTk1OTMtMWJlYzYxOWVkZWE2In0.U2oOzggARHsBDeC-qNU6WWyDpXFD3JrouToe_yEZnno",
  "access_expires_at": "2026-10-28T17:00:50.063472215Z",
  "refresh_token": "OooTOXcT645TMLQ8TYgNi-7hmpxK4cXUOPolXy0Pwsg",
  "refresh_expires_at": "2026-10-29T04:45:50.062852896Z",
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
  "phone": "+48600888443",
  "device_ref": "sandbox-4866"
}
```

```json
{
  "challenge_id": "c1853197-823e-426c-ab9c-be0421c97a93",
  "expires_at": "2026-10-28T16:50:50.921133219Z",
  "resend_available_at": "2026-10-28T16:45:51.921133219Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600888443` → **200**

```json
{
  "phone": "+48600888443",
  "audience": "CLIENT",
  "code": "689143",
  "sent_at": "2026-10-28T16:45:50.923881224Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c1853197-823e-426c-ab9c-be0421c97a93",
  "code": "689143",
  "device_ref": "sandbox-4866"
}
```

```json
{
  "session_id": "80015ba2-04d7-493e-8788-b2e688f68d7e",
  "subject": {
    "type": "CLIENT",
    "id": "a7e1fd86-db8a-4882-9a45-d55729a8a0c6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2UxZmQ4Ni1kYjhhLTQ4ODItOWE0NS1kNTU3MjlhOGEwYzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2ODUxLCJpYXQiOjE3OTMyMDU5NTEsImp0aSI6IjBmZGY4MzQ0LWE0ZjYtNDczMC1iNDA0LTU5Y2EzMDg3YTI2MSIsInNpZCI6IjgwMDE1YmEyLTA0ZDctNDkzZS04Nzg4LWIyZTY4OGY2OGQ3ZSJ9._S-Hldfqx2Ephx6AkpIhjoLN1OeXn4S54ITQnwjagfE",
  "access_expires_at": "2026-10-28T17:00:51.221584134Z",
  "refresh_token": "kxJVFiPRXJ7KffgFGbrKEaAxAetIYWCv5qyX6Uku9h0",
  "refresh_expires_at": "2026-11-27T16:45:51.220969744Z",
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
  "command_id": "54802464-1e95-4cd0-a32b-51f15915b649",
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
  "correlation_id": "faf4bbe6-673e-4bf2-ac58-ce720e82a9e4",
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
  "command_id": "ff33e6c7-9341-4f96-ace6-9161a625171b",
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
  "paused_at": "2026-10-28T16:45:52.336026728Z",
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
  "command_id": "d3ab0565-eeaf-4629-8b92-b358e921723a",
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
  "id": "26fcd045-2654-4d26-bb0b-d08b73dbb720",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:50:52.917262Z",
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
  "command_id": "06b1ddc8-e5f5-4917-b6ae-99b8b787d0ac",
  "quote_id": "26fcd045-2654-4d26-bb0b-d08b73dbb720",
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
  "correlation_id": "3772e1af-eca3-4338-a3f5-1b50960392e5"
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
  "paused_at": "2026-10-28T16:45:52.336027Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "cd664673-fbb6-4011-beb4-ba4d59fd19da",
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
  "command_id": "ab78b065-602c-4849-931f-dc0b8aaf20d1",
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
  "command_id": "ff5c90ee-d730-4da8-881d-941508c9a2ba",
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
  "id": "31cca1c2-8d4f-4525-8c0c-ec34fb61609f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:50:54.604248Z",
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
  "command_id": "907694e1-1ace-40b1-a7ce-c444b4015a8d",
  "quote_id": "31cca1c2-8d4f-4525-8c0c-ec34fb61609f",
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
  "correlation_id": "bdc6df7e-3a87-4b17-82c4-422231e66029"
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
  "command_id": "fa0940bc-4240-4437-8f18-cf8b1fd7e7a2",
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
      "from": "19:00",
      "to": "20:00"
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
      "from": "19:00",
      "to": "20:00"
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
  "command_id": "68ce7c89-841e-4e8a-98b1-f3844cab632e",
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
  "id": "7f3a7e7d-bb58-45b5-a593-208195bed7c2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:50:55.747436Z",
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
  "command_id": "c76ccaa1-af97-41ae-a6cc-9bac03a52201",
  "quote_id": "7f3a7e7d-bb58-45b5-a593-208195bed7c2",
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
  "correlation_id": "a5bba528-01e5-48aa-8952-77383e0a302b"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "4f66bf3c-3b10-486a-916f-d6b304abafb6",
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
  "correlation_id": "c8a7a270-257f-4c90-b473-8bec3d29ab74"
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
      "from": "19:00",
      "to": "20:00"
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
  "command_id": "303f8c01-f418-4ddd-9cc2-fc0e00ed640f",
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
  "phone": "+380671315526",
  "device_ref": "sandbox-22739"
}
```

```json
{
  "challenge_id": "cb096cf6-934c-406c-9a37-b1fafdc7de3b",
  "expires_at": "2026-10-28T16:50:57.17330047Z",
  "resend_available_at": "2026-10-28T16:45:58.17330047Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671315526` → **200**

```json
{
  "phone": "+380671315526",
  "audience": "CLIENT",
  "code": "292528",
  "sent_at": "2026-10-28T16:45:57.176012416Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cb096cf6-934c-406c-9a37-b1fafdc7de3b",
  "code": "292528",
  "device_ref": "sandbox-22739"
}
```

```json
{
  "session_id": "b0a8c75f-bc7c-417d-bd5f-d1f65f1a5348",
  "subject": {
    "type": "CLIENT",
    "id": "2eee3225-2a15-4b1b-8ff7-4f0b5c133785"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZWVlMzIyNS0yYTE1LTRiMWItOGZmNy00ZjBiNWMxMzM3ODUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2ODU3LCJpYXQiOjE3OTMyMDU5NTcsImp0aSI6ImIxY2ZkMWYwLTQ1OWEtNGJjYS1hNTdhLTk1YzVhMTU1MGQ1MCIsInNpZCI6ImIwYThjNzVmLWJjN2MtNDE3ZC1iZDVmLWQxZjY1ZjFhNTM0OCJ9.qYOCPDoXZRVBt_Hw2EsKNan-gy6GwgSnAjf-cudyJ1s",
  "access_expires_at": "2026-10-28T17:00:57.474397543Z",
  "refresh_token": "23t_jFAJIYS9j1dwes-2NTuoLJJb6wgtpTUoMnNr4-0",
  "refresh_expires_at": "2026-11-27T16:45:57.473746584Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "2eee3225-2a15-4b1b-8ff7-4f0b5c133785",
  "session_id": "b0a8c75f-bc7c-417d-bd5f-d1f65f1a5348",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f0b6df3a-efc8-456d-945f-e10d1a3b87d1",
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
  "id": "9faaf71d-7b97-49bd-8dbc-b418f9d42b7f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:50:58.019414Z",
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
  "challenge_id": "9d10573c-5de5-4b52-8eb3-b241644d7102",
  "expires_at": "2026-10-28T16:51:00.301744885Z",
  "resend_available_at": "2026-10-28T16:46:01.301744885Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671315526` → **200**

```json
{
  "phone": "+380671315526",
  "audience": "CLIENT",
  "code": "021474",
  "sent_at": "2026-10-28T16:46:00.304564674Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "fd350256-43b9-4161-9948-33ae950188e4",
  "challenge_id": "9d10573c-5de5-4b52-8eb3-b241644d7102",
  "otp_code": "021474"
}
```

```json
{
  "client_id": "2eee3225-2a15-4b1b-8ff7-4f0b5c133785",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T16:46:00.621255628Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "2dc50e5d-ef80-4abe-9581-edccb2f2082e",
  "quote_id": "9faaf71d-7b97-49bd-8dbc-b418f9d42b7f",
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
  "correlation_id": "366bd1bc-5782-4abc-a8ba-ae8eefbbd1e0"
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
  "session_id": "b8f925d2-9b14-4a34-a491-fbbe3ecbe75a",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY4NjEsImlhdCI6MTc5MzIwNTk2MSwianRpIjoiN2M4OGEzNzctYjgzOS00NDBhLWE3MzUtYWFlNDY4ZjY2NjIzIiwic2lkIjoiYjhmOTI1ZDItOWIxNC00YTM0LWE0OTEtZmJiZTNlY2JlNzVhIn0.ki6YaA_SMWhcNPh4ZQqeutDA85IqLb6n0pqe-rpH-_Y",
  "access_expires_at": "2026-10-28T17:01:01.501737727Z",
  "refresh_token": "yO6lq3qY64DV4F0ZX9vymut4csITgscTbV6gtYgON_8",
  "refresh_expires_at": "2026-10-29T04:46:01.501063996Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "2eee3225-2a15-4b1b-8ff7-4f0b5c133785",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T16:46:00.621256Z",
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

`POST /api/admin/v1/client-deletions/2eee3225-2a15-4b1b-8ff7-4f0b5c133785/complete` → **200**

```json
{
  "command_id": "51deb55b-2602-4df5-9d86-ffe5872fc233",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "2eee3225-2a15-4b1b-8ff7-4f0b5c133785",
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
  "correlation_id": "d0215935-2ac8-44ac-bdf6-9a4c7ee68bc8"
}
```

Done: client 2eee3225-2a15-4b1b-8ff7-4f0b5c133785 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663282889",
  "device_ref": "sandbox-8869"
}
```

```json
{
  "challenge_id": "8097ed24-e144-491d-a769-fb05b4af23fc",
  "expires_at": "2026-10-28T16:51:02.688395143Z",
  "resend_available_at": "2026-10-28T16:46:03.688395143Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663282889` → **200**

```json
{
  "phone": "+380663282889",
  "audience": "CLIENT",
  "code": "113996",
  "sent_at": "2026-10-28T16:46:02.691141739Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8097ed24-e144-491d-a769-fb05b4af23fc",
  "code": "113996",
  "device_ref": "sandbox-8869"
}
```

```json
{
  "session_id": "82a4cba0-dffa-4d43-9e83-f0bbea61fb89",
  "subject": {
    "type": "CLIENT",
    "id": "7a4492f0-d575-4133-b2a7-b35b5bb4161c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YTQ0OTJmMC1kNTc1LTQxMzMtYjJhNy1iMzViNWJiNDE2MWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2ODYzLCJpYXQiOjE3OTMyMDU5NjMsImp0aSI6IjkwNzBjZmI2LWE1MmItNDNmMC1hMjVmLWQwYWU1Mjc4YWExYyIsInNpZCI6IjgyYTRjYmEwLWRmZmEtNGQ0My05ZTgzLWYwYmJlYTYxZmI4OSJ9.JMpm38yjINhWC-QkmW7gMiJeh1AR47P6ebZ5vyP2fZU",
  "access_expires_at": "2026-10-28T17:01:03.019344805Z",
  "refresh_token": "zDRUMyNZgkkq-GGPBl4sbPmmdr9DZjBx8Vip0hjhDOs",
  "refresh_expires_at": "2026-11-27T16:46:03.018688697Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7a4492f0-d575-4133-b2a7-b35b5bb4161c",
  "session_id": "82a4cba0-dffa-4d43-9e83-f0bbea61fb89",
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
  "session_id": "63c0cebb-414c-477d-bb78-4d4cabff48fa",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY4NjMsImlhdCI6MTc5MzIwNTk2MywianRpIjoiYzVhNjZiYzYtMzJiNC00ZDljLThiOTMtM2I5ZThjYTc2ZjFlIiwic2lkIjoiNjNjMGNlYmItNDE0Yy00NzdkLWJiNzgtNGQ0Y2FiZmY0OGZhIn0.Uv6wmoEek8gT_Wa0H5PcglzhDPVQljVLGY_pmnixKd4",
  "access_expires_at": "2026-10-28T17:01:03.875860779Z",
  "refresh_token": "Rx_lIIvfg8usUk_msgQ76JW7zCie1nxHi-3FJzDRkmk",
  "refresh_expires_at": "2026-10-29T04:46:03.875259353Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=3282889&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "7a4492f0-d575-4133-b2a7-b35b5bb4161c",
      "phone": "+380663282889",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T16:46:03.015056Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/7a4492f0-d575-4133-b2a7-b35b5bb4161c` → **200**

```json
{
  "client": {
    "id": "7a4492f0-d575-4133-b2a7-b35b5bb4161c",
    "phone": "+380663282889",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T16:46:03.015056Z",
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

`POST /api/admin/v1/clients/7a4492f0-d575-4133-b2a7-b35b5bb4161c/block` → **400**

```json
{
  "command_id": "fa1e063f-4f39-4c7b-9199-4be349903015",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/7a4492f0-d575-4133-b2a7-b35b5bb4161c/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "24b0863a-d9c7-4f44-a0c6-e9752a852008",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/7a4492f0-d575-4133-b2a7-b35b5bb4161c/block` → **200**

```json
{
  "command_id": "7f1aa8f0-b7fa-4a7c-b2d8-5d1b520f594e",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "7a4492f0-d575-4133-b2a7-b35b5bb4161c",
  "phone": "+380663282889",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T16:46:03.015056Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T16:46:05.044652Z",
    "by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
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
  "correlation_id": "c9bc6e53-0f94-4fc5-87e4-b030ee9f58c5"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663282889",
  "device_ref": "sandbox-29429"
}
```

```json
{
  "challenge_id": "1e5a45ba-a8c8-4eb8-a9da-12362096c72f",
  "expires_at": "2026-10-28T16:51:07.599549165Z",
  "resend_available_at": "2026-10-28T16:46:08.599549165Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663282889` → **200**

```json
{
  "phone": "+380663282889",
  "audience": "CLIENT",
  "code": "754593",
  "sent_at": "2026-10-28T16:46:07.602127795Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "1e5a45ba-a8c8-4eb8-a9da-12362096c72f",
  "code": "754593",
  "device_ref": "sandbox-29429"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "e17ca5d7-0731-431a-b8c8-b7fecca35494"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/7a4492f0-d575-4133-b2a7-b35b5bb4161c` → **200**

```json
{
  "client": {
    "id": "7a4492f0-d575-4133-b2a7-b35b5bb4161c",
    "phone": "+380663282889",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T16:46:03.015056Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T16:46:05.044652Z",
      "by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
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

`POST /api/admin/v1/clients/7a4492f0-d575-4133-b2a7-b35b5bb4161c/unblock` → **200**

```json
{
  "command_id": "3fefc410-5743-4e62-9b71-7f9da47bcc8d",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "7a4492f0-d575-4133-b2a7-b35b5bb4161c",
  "phone": "+380663282889",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T16:46:03.015056Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663282889",
  "device_ref": "sandbox-9767"
}
```

```json
{
  "challenge_id": "8922cacb-48ff-46ad-94d8-9af962eaa77d",
  "expires_at": "2026-10-28T16:51:10.780126338Z",
  "resend_available_at": "2026-10-28T16:46:11.780126338Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663282889` → **200**

```json
{
  "phone": "+380663282889",
  "audience": "CLIENT",
  "code": "052027",
  "sent_at": "2026-10-28T16:46:10.78247654Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8922cacb-48ff-46ad-94d8-9af962eaa77d",
  "code": "052027",
  "device_ref": "sandbox-9767"
}
```

```json
{
  "session_id": "769123a9-5cef-4a8c-8c5a-06aa98bba5a6",
  "subject": {
    "type": "CLIENT",
    "id": "7a4492f0-d575-4133-b2a7-b35b5bb4161c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YTQ0OTJmMC1kNTc1LTQxMzMtYjJhNy1iMzViNWJiNDE2MWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2ODcxLCJpYXQiOjE3OTMyMDU5NzEsImp0aSI6IjhkNjllZTU3LTRkNDUtNDNiMS1iMjdkLTRjYjRhN2YzNDc0NyIsInNpZCI6Ijc2OTEyM2E5LTVjZWYtNGE4Yy04YzVhLTA2YWE5OGJiYTVhNiJ9.2b7z8w9dyQYZK5xNRrQYqzfs1ZO1xPhimJdeHYs6RpU",
  "access_expires_at": "2026-10-28T17:01:11.093053713Z",
  "refresh_token": "uzzyaMiW1tiWc04p_mMOGOsOEMFeJYh8ZLCbNIR3XWg",
  "refresh_expires_at": "2026-11-27T16:46:11.092436357Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7a4492f0-d575-4133-b2a7-b35b5bb4161c",
  "session_id": "769123a9-5cef-4a8c-8c5a-06aa98bba5a6",
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
  "phone": "+380662050636",
  "device_ref": "sandbox-16406"
}
```

```json
{
  "challenge_id": "77e69123-429a-4404-8159-84f5ae00fb88",
  "expires_at": "2026-10-28T16:51:11.664258279Z",
  "resend_available_at": "2026-10-28T16:46:12.664258279Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662050636` → **200**

```json
{
  "phone": "+380662050636",
  "audience": "CLIENT",
  "code": "774362",
  "sent_at": "2026-10-28T16:46:11.666915133Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "77e69123-429a-4404-8159-84f5ae00fb88",
  "code": "774362",
  "device_ref": "sandbox-16406"
}
```

```json
{
  "session_id": "173a1bf1-000c-4612-b569-a9561996bd09",
  "subject": {
    "type": "CLIENT",
    "id": "ff970635-646f-4efd-8cda-c8300fabec04"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjk3MDYzNS02NDZmLTRlZmQtOGNkYS1jODMwMGZhYmVjMDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2ODcxLCJpYXQiOjE3OTMyMDU5NzEsImp0aSI6IjYzNTcwOTFjLTllMjgtNDBmYi1iOTlmLTIyYzlhYjg2NzVmYSIsInNpZCI6IjE3M2ExYmYxLTAwMGMtNDYxMi1iNTY5LWE5NTYxOTk2YmQwOSJ9.IhUSqkEkqcBSr24Nt59y87JG7sUDKNtYc8LNLPl_67Q",
  "access_expires_at": "2026-10-28T17:01:11.977232558Z",
  "refresh_token": "rc6CxvwlCYq-AQqcUOp6-uK-4SKLxVOTy1QnDs1KBfc",
  "refresh_expires_at": "2026-11-27T16:46:11.976589937Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5d5c0bfb-c4ef-4d56-80f2-fe0e7885fb37",
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
  "id": "523d97e1-da9f-4cf9-88ed-d7886a6ffb88",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:51:12.260770Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: b34ea1eb-6e3f-4f3d-a37b-5de69dc8ea38) → **201**

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
  "session_id": "ef866052-b051-49c9-af70-fd57b151d9c2",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY4NzIsImlhdCI6MTc5MzIwNTk3MiwianRpIjoiZTlkNjA0YjEtMGRkMS00MGQyLThkNTMtOWJlM2NmMDhmNDE4Iiwic2lkIjoiZWY4NjYwNTItYjA1MS00OWM5LWFmNzAtZmQ1N2IxNTFkOWMyIn0.A1dubWt5UNmrZvr6fsz5e30ZKiaf0WUvUySO_V267wk",
  "access_expires_at": "2026-10-28T17:01:12.888672412Z",
  "refresh_token": "3hNSML4q68T3uxMIeSR49uzY_Xrvj_MMjC2b7d5sa-8",
  "refresh_expires_at": "2026-10-29T04:46:12.887960289Z",
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
  "session_id": "22e5f4a1-fd08-43ee-9eef-74895ee6dd0a",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY4NzMsImlhdCI6MTc5MzIwNTk3MywianRpIjoiYzYyMzViOTEtZDExOS00MjRhLTg3MjQtZWY4MmE0NTVkMDVmIiwic2lkIjoiMjJlNWY0YTEtZmQwOC00M2VlLTllZWYtNzQ4OTVlZTZkZDBhIn0.J6wE0KpbFsHMPd9RVTjOmcFVDgSGBfNuEfMmNhu8AWQ",
  "access_expires_at": "2026-10-28T17:01:13.465265551Z",
  "refresh_token": "aAWZJ1D3v3tNU7mC9EyTBHda1bZuoRaXIPySfYtGQBA",
  "refresh_expires_at": "2026-10-29T04:46:13.464552283Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/1f25bb0b-4ccd-4270-b497-0d1d8630cfee/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:46:12.555235Z",
      "actor": {
        "type": "CLIENT",
        "id": "ff970635-646f-4efd-8cda-c8300fabec04",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "1f25bb0b-4ccd-4270-b497-0d1d8630cfee",
        "quote_id": "523d97e1-da9f-4cf9-88ed-d7886a6ffb88",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "b34ea1eb-6e3f-4f3d-a37b-5de69dc8ea38"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:46:12.557111Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1f25bb0b-4ccd-4270-b497-0d1d8630cfee",
        "attempt_id": "9378fe94-476c-4164-b830-e24bb7c2a6f9",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b34ea1eb-6e3f-4f3d-a37b-5de69dc8ea38"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T16:46:12.567125Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1f25bb0b-4ccd-4270-b497-0d1d8630cfee",
        "attempt_id": "9378fe94-476c-4164-b830-e24bb7c2a6f9"
      },
      "correlation_id": "b34ea1eb-6e3f-4f3d-a37b-5de69dc8ea38"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "9378fe94-476c-4164-b830-e24bb7c2a6f9",
        "generation": 1,
        "started_at": "2026-10-28T16:46:12.556075Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T16:46:12.567125Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T16:46:12.558076Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/b34ea1eb-6e3f-4f3d-a37b-5de69dc8ea38` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "1f25bb0b-4ccd-4270-b497-0d1d8630cfee:0",
      "order_id": "1f25bb0b-4ccd-4270-b497-0d1d8630cfee",
      "at": "2026-10-28T16:46:12.555235Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "1f25bb0b-4ccd-4270-b497-0d1d8630cfee:1",
      "order_id": "1f25bb0b-4ccd-4270-b497-0d1d8630cfee",
      "at": "2026-10-28T16:46:12.557111Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "1f25bb0b-4ccd-4270-b497-0d1d8630cfee:2",
      "order_id": "1f25bb0b-4ccd-4270-b497-0d1d8630cfee",
      "at": "2026-10-28T16:46:12.567125Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/8c0992b9-52e9-4822-88e0-03d2320709c8` → **200**

```json
{
  "found": []
}
```

Done: request b34ea1eb-6e3f-4f3d-a37b-5de69dc8ea38 — order 1f25bb0b-4ccd-4270-b497-0d1d8630cfee found by its id.

`GET /api/rider/v1/orders/1f25bb0b-4ccd-4270-b497-0d1d8630cfee` → **200**

```json
{
  "id": "1f25bb0b-4ccd-4270-b497-0d1d8630cfee",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ff970635-646f-4efd-8cda-c8300fabec04",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T16:46:12.554572Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/1f25bb0b-4ccd-4270-b497-0d1d8630cfee/cancel` → **200**

```json
{
  "command_id": "937698d5-e000-4206-8b61-d539648ab288",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "1f25bb0b-4ccd-4270-b497-0d1d8630cfee",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ff970635-646f-4efd-8cda-c8300fabec04",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:46:12.554572Z",
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
  "phone": "+380631800755",
  "device_ref": "sandbox-29387"
}
```

```json
{
  "challenge_id": "cfd8c3a2-4ffe-40e0-8cd6-771689d82738",
  "expires_at": "2026-10-28T16:51:15.246047375Z",
  "resend_available_at": "2026-10-28T16:46:16.246047375Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631800755` → **200**

```json
{
  "phone": "+380631800755",
  "audience": "CLIENT",
  "code": "395782",
  "sent_at": "2026-10-28T16:46:15.249317627Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cfd8c3a2-4ffe-40e0-8cd6-771689d82738",
  "code": "395782",
  "device_ref": "sandbox-29387"
}
```

```json
{
  "session_id": "4d3d795c-f440-4ea6-b38d-417c2735c996",
  "subject": {
    "type": "CLIENT",
    "id": "d67fc4c4-2043-4b8b-91b2-cd9f01048f30"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjdmYzRjNC0yMDQzLTRiOGItOTFiMi1jZDlmMDEwNDhmMzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2ODc1LCJpYXQiOjE3OTMyMDU5NzUsImp0aSI6ImE3MWNiMzE5LTJhMTMtNDBhNC04NDY0LTQ0NTMzMTZmNWM5NyIsInNpZCI6IjRkM2Q3OTVjLWY0NDAtNGVhNi1iMzhkLTQxN2MyNzM1Yzk5NiJ9.n1IxrTqTtUHOWzUCGdZPWEH_0LqtazOkhmYiqcPdnrs",
  "access_expires_at": "2026-10-28T17:01:15.549594225Z",
  "refresh_token": "jptNSaii1ZbCxwqEpuBLyLxfKu3bgeXI_nb7iY2cWfs",
  "refresh_expires_at": "2026-11-27T16:46:15.549050588Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "decec74b-cae4-49d1-90e8-45c4b177f58e",
  "expires_at": "2026-10-28T16:51:17.824154688Z",
  "resend_available_at": "2026-10-28T16:46:18.824154688Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631800755` → **200**

```json
{
  "phone": "+380631800755",
  "audience": "CLIENT",
  "code": "591602",
  "sent_at": "2026-10-28T16:46:17.826241544Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "4b89335e-e065-444e-8967-a1cc058bcf6a",
  "challenge_id": "decec74b-cae4-49d1-90e8-45c4b177f58e",
  "otp_code": "591602"
}
```

```json
{
  "id": "c0f7ea7c-4659-4958-9e49-798f33d1254b",
  "state": "PENDING",
  "created_at": "2026-10-28T16:46:18.156015Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/c0f7ea7c-4659-4958-9e49-798f33d1254b` → **200**

```json
{
  "id": "c0f7ea7c-4659-4958-9e49-798f33d1254b",
  "state": "PENDING",
  "created_at": "2026-10-28T16:46:18.156015Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c0f7ea7c-4659-4958-9e49-798f33d1254b` → **200**

```json
{
  "id": "c0f7ea7c-4659-4958-9e49-798f33d1254b",
  "state": "PENDING",
  "created_at": "2026-10-28T16:46:18.156015Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c0f7ea7c-4659-4958-9e49-798f33d1254b` → **200**

```json
{
  "id": "c0f7ea7c-4659-4958-9e49-798f33d1254b",
  "state": "READY",
  "created_at": "2026-10-28T16:46:18.156015Z",
  "ready_at": "2026-10-28T16:46:20.560965Z",
  "expires_at": "2026-11-04T16:46:20.560965Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/c0f7ea7c-4659-4958-9e49-798f33d1254b/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635110301",
  "device_ref": "sandbox-1264"
}
```

```json
{
  "challenge_id": "a3fe5469-3ea5-4e84-825c-9be54371e54b",
  "expires_at": "2026-10-28T16:51:21.316183868Z",
  "resend_available_at": "2026-10-28T16:46:22.316183868Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635110301` → **200**

```json
{
  "phone": "+380635110301",
  "audience": "CLIENT",
  "code": "489538",
  "sent_at": "2026-10-28T16:46:21.319189924Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a3fe5469-3ea5-4e84-825c-9be54371e54b",
  "code": "489538",
  "device_ref": "sandbox-1264"
}
```

```json
{
  "session_id": "395f3b85-a002-4052-98ff-d0491f2a4de2",
  "subject": {
    "type": "CLIENT",
    "id": "1487ae18-1191-4210-bd22-4eee57d97876"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNDg3YWUxOC0xMTkxLTQyMTAtYmQyMi00ZWVlNTdkOTc4NzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2ODgxLCJpYXQiOjE3OTMyMDU5ODEsImp0aSI6IjcxYjU1MTQ1LWY4YzAtNDAxMC04NjY4LWQzYjlhYThlYWZmNSIsInNpZCI6IjM5NWYzYjg1LWEwMDItNDA1Mi05OGZmLWQwNDkxZjJhNGRlMiJ9.mCfmdMrBoTQB1PMQOmL3ZaR10hwkbF3aB_JyoNgMR5k",
  "access_expires_at": "2026-10-28T17:01:21.626245843Z",
  "refresh_token": "cvBKZYZl9gzd0ihWrQ8jecyw_p8ZHZuZDh-JbvfSd8M",
  "refresh_expires_at": "2026-11-27T16:46:21.625612969Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/c0f7ea7c-4659-4958-9e49-798f33d1254b/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/c0f7ea7c-4659-4958-9e49-798f33d1254b/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b5578a83-31c8-4c51-b402-1fa99fc73efc"
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
  "session_id": "7d1b72f9-4347-42aa-bb68-85c8b002e94c",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY4ODIsImlhdCI6MTc5MzIwNTk4MiwianRpIjoiZmY4ZTFkZDgtYmJlYy00MmY1LTliOWMtYzE1MzkyNjdlOWNhIiwic2lkIjoiN2QxYjcyZjktNDM0Ny00MmFhLWJiNjgtODVjOGIwMDJlOTRjIn0.i0XOyzGRt5MzmBkF1aGyfrM-oN7PVhIOKExUHe1VBZ0",
  "access_expires_at": "2026-10-28T17:01:22.483695522Z",
  "refresh_token": "DKIfM3qSxbOlIk3uamjk4mos939faU0XmuUvDcN8VFE",
  "refresh_expires_at": "2026-10-29T04:46:22.483130404Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d67fc4c4-2043-4b8b-91b2-cd9f01048f30",
  "session_id": "4d3d795c-f440-4ea6-b38d-417c2735c996",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/d67fc4c4-2043-4b8b-91b2-cd9f01048f30/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "c0f7ea7c-4659-4958-9e49-798f33d1254b",
      "state": "READY",
      "created_at": "2026-10-28T16:46:18.156015Z",
      "ready_at": "2026-10-28T16:46:20.560965Z",
      "expires_at": "2026-11-04T16:46:20.560965Z",
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
  "device_ref": "sandbox-31507"
}
```

```json
{
  "challenge_id": "f0d4e393-61bb-47e0-a18a-1a5f7e49cbb6",
  "expires_at": "2026-10-28T16:51:23.343955205Z",
  "resend_available_at": "2026-10-28T16:46:24.343955205Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "168585",
  "sent_at": "2026-10-28T16:46:23.346611098Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f0d4e393-61bb-47e0-a18a-1a5f7e49cbb6",
  "code": "168585",
  "device_ref": "sandbox-31507"
}
```

```json
{
  "session_id": "a162de6d-bba6-48f6-bdd8-7243cc1f91b8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjg4MywiaWF0IjoxNzkzMjA1OTgzLCJqdGkiOiJkOTY5NTJjYy1kMmQxLTQ4ODgtYjcyNy1mZjljNTlkYjMyNTAiLCJzaWQiOiJhMTYyZGU2ZC1iYmE2LTQ4ZjYtYmRkOC03MjQzY2MxZjkxYjgifQ.M-AAH9uDF4tiVfAc6MsA8s4ZrO15m8AjtS72VRbs_hk",
  "access_expires_at": "2026-10-28T17:01:23.657582372Z",
  "refresh_token": "Tl8JrqAf1WMJdJTKm7ObK2v9mmLw3Ydg7MHkFEREhJU",
  "refresh_expires_at": "2026-11-27T16:46:23.65698795Z",
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
  "device_ref": "sandbox-890"
}
```

```json
{
  "challenge_id": "a924071e-827f-47e1-8e09-3bb2a563a8fa",
  "expires_at": "2026-10-28T16:51:24.219298822Z",
  "resend_available_at": "2026-10-28T16:46:25.219298822Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "917301",
  "sent_at": "2026-10-28T16:46:24.221973849Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a924071e-827f-47e1-8e09-3bb2a563a8fa",
  "code": "917301",
  "device_ref": "sandbox-890"
}
```

```json
{
  "session_id": "8d20c550-745d-4220-a075-d52279fea101",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjg4NCwiaWF0IjoxNzkzMjA1OTg0LCJqdGkiOiIxOWI5ZGJhZS1hMjVjLTQyNDgtYTMwNC03MjYyY2U0YmNiMTYiLCJzaWQiOiI4ZDIwYzU1MC03NDVkLTQyMjAtYTA3NS1kNTIyNzlmZWExMDEifQ.IX3wGkuCdFlPGjUUoIt7v44W5k_hcjOoQjhr1he3AdM",
  "access_expires_at": "2026-10-28T17:01:24.532663509Z",
  "refresh_token": "hZIdQzaxyrYzSO7gb6hRYACCVKqyOvQOIzs4QysJCoI",
  "refresh_expires_at": "2026-11-27T16:46:24.532094935Z",
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
  "command_id": "440298f3-58aa-4935-a8e2-9c72726d880b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:46:25Z",
    "sequence": 1793205985921
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6461bc5-ba86-4925-935a-a3095cb4d25c",
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
  "last_heartbeat_at": "2026-10-28T16:46:25.113348Z",
  "last_location_at": "2026-10-28T16:46:25.113348Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-28692"
}
```

```json
{
  "challenge_id": "bda27e03-79e5-479e-98fa-f51f2999fd60",
  "expires_at": "2026-10-28T16:51:25.401129775Z",
  "resend_available_at": "2026-10-28T16:46:26.401129775Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "681133",
  "sent_at": "2026-10-28T16:46:25.404826274Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bda27e03-79e5-479e-98fa-f51f2999fd60",
  "code": "681133",
  "device_ref": "sandbox-28692"
}
```

```json
{
  "session_id": "ff6cb52e-e454-4ef7-9b77-fdb755dac262",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjg4NSwiaWF0IjoxNzkzMjA1OTg1LCJqdGkiOiIyZGFmYmY2YS1iYzM2LTRhMDEtYTNiNC1iYjgyMzliZjU2Y2UiLCJzaWQiOiJmZjZjYjUyZS1lNDU0LTRlZjctOWI3Ny1mZGI3NTVkYWMyNjIifQ.RM0AbjB8a1vKbZq5mBUg_jAVoLrmgy4Pkm0TVXzfckU",
  "access_expires_at": "2026-10-28T17:01:25.715642361Z",
  "refresh_token": "5TVqKXl0gWDztE2lygFQe5GkhyC3HAQgc5glKorqWOo",
  "refresh_expires_at": "2026-11-27T16:46:25.715046565Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "fce638e2-a8b9-48ff-b592-41b2958d1910",
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
  "last_heartbeat_at": "2026-10-28T16:45:27.448104Z",
  "last_location_at": "2026-10-28T16:45:27.448104Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/fce638e2-a8b9-48ff-b592-41b2958d1910/handover` → **200**

```json
{
  "command_id": "39f54e59-14da-48be-a8e8-546636af742f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "fce638e2-a8b9-48ff-b592-41b2958d1910",
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
  "last_heartbeat_at": "2026-10-28T16:45:27.448104Z",
  "last_location_at": "2026-10-28T16:45:27.448104Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/fce638e2-a8b9-48ff-b592-41b2958d1910/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:46:26Z",
    "sequence": 1793205986573
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "fce638e2-a8b9-48ff-b592-41b2958d1910",
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
  "last_heartbeat_at": "2026-10-28T16:46:26.594736Z",
  "last_location_at": "2026-10-28T16:46:26.594736Z",
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
  "session_id": "a33ef1ec-548d-47f5-ab32-28cbc9ab6623",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY4ODcsImlhdCI6MTc5MzIwNTk4NywianRpIjoiZTkwYmI2YWUtMjdmMi00ODg0LTkwMWYtOTljOTI2MGY3YTJiIiwic2lkIjoiYTMzZWYxZWMtNTQ4ZC00N2Y1LWFiMzItMjhjYmM5YWI2NjIzIn0.7d6S0JrYtxGMx7HvDYwkkoEalEAN7t2Ks-I5RoscPEg",
  "access_expires_at": "2026-10-28T17:01:27.163844954Z",
  "refresh_token": "Iuimk2ukOSJi1nBin5hfMzu_K9KY-ygqu0w9BL0iEn8",
  "refresh_expires_at": "2026-10-29T04:46:27.163188254Z",
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
  "session_id": "86f01abc-645a-4957-bcd4-398e8cc43cd1",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY4ODcsImlhdCI6MTc5MzIwNTk4NywianRpIjoiZWY2ZGU0NTQtZmViNC00NDg4LWE0OTctMzg2MDYyNmUwNzEyIiwic2lkIjoiODZmMDFhYmMtNjQ1YS00OTU3LWJjZDQtMzk4ZThjYzQzY2QxIn0.Y6dk-vbPajU_LehN4RXz3IG3sSO7Knvp7gNci9_G77w",
  "access_expires_at": "2026-10-28T17:01:27.741573537Z",
  "refresh_token": "mVBsjqe-Ht7F_Ov831MM_nKucFFUkDdhRZqZN8FVRpM",
  "refresh_expires_at": "2026-10-29T04:46:27.740951653Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380680675050",
  "device_ref": "sandbox-9422"
}
```

```json
{
  "challenge_id": "e87525a8-4573-4ff8-8a86-05385c6c3af2",
  "expires_at": "2026-10-28T16:51:28.019593367Z",
  "resend_available_at": "2026-10-28T16:46:29.019593367Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380680675050` → **200**

```json
{
  "phone": "+380680675050",
  "audience": "CLIENT",
  "code": "729607",
  "sent_at": "2026-10-28T16:46:28.022514292Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e87525a8-4573-4ff8-8a86-05385c6c3af2",
  "code": "729607",
  "device_ref": "sandbox-9422"
}
```

```json
{
  "session_id": "6cef4531-3b76-4ee4-b0ab-1e39a1cca401",
  "subject": {
    "type": "CLIENT",
    "id": "ecb8b7a1-c78f-487a-9424-411611420e91"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlY2I4YjdhMS1jNzhmLTQ4N2EtOTQyNC00MTE2MTE0MjBlOTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2ODg4LCJpYXQiOjE3OTMyMDU5ODgsImp0aSI6ImQ1MTU3MWMzLWVlZWQtNDdkYS1iMjlmLTBiNDM4Mjc1NzQzNiIsInNpZCI6IjZjZWY0NTMxLTNiNzYtNGVlNC1iMGFiLTFlMzlhMWNjYTQwMSJ9.ioLfxRAsEts6uqjCfC-Zz6UbYuOu1hcEHrL6iIc-IX4",
  "access_expires_at": "2026-10-28T17:01:28.33160779Z",
  "refresh_token": "apXOhg-MdU6nyzBiypkoE0UiLb-BGPwCIl9CgrzIJVE",
  "refresh_expires_at": "2026-11-27T16:46:28.330966359Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "508532eb-7f4a-4623-91d6-5f52dd949d24",
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
  "id": "c019785b-64c5-4902-b661-ed3a6c188b05",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:51:28.624265Z",
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
  "command_id": "929c6b81-6eef-4024-a1e6-105ba6b64a75",
  "quote_id": "c019785b-64c5-4902-b661-ed3a6c188b05",
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
  "id": "e2d85c8a-705b-43c7-91c8-d997cec2fa83",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ecb8b7a1-c78f-487a-9424-411611420e91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:46:28.928895Z",
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
    "id": "70a5a557-ed7e-4678-8e2a-3ef49ce36de2",
    "order_id": "e2d85c8a-705b-43c7-91c8-d997cec2fa83",
    "expires_at": "2026-10-28T16:46:43.932514Z",
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

`POST /api/driver/v1/offers/70a5a557-ed7e-4678-8e2a-3ef49ce36de2/reject` → **204**

```json
{
  "command_id": "f4e306dd-403c-4c61-b325-2b39fa522c44"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "068fb13f-3f2e-4c25-9cad-992a3dbb9d1f",
    "order_id": "e2d85c8a-705b-43c7-91c8-d997cec2fa83",
    "expires_at": "2026-10-28T16:46:44.527351Z",
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

`POST /api/driver/v1/offers/068fb13f-3f2e-4c25-9cad-992a3dbb9d1f/accept` → **200**

```json
{
  "command_id": "746e8b71-1088-4aca-b20f-3430153dc9d2"
}
```

```json
{
  "id": "2aad8e38-4dfb-4d08-a61e-0fc6f265ace1",
  "order_id": "e2d85c8a-705b-43c7-91c8-d997cec2fa83",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "21fef0d0-f770-4571-a786-3a5f80f7c219",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/e2d85c8a-705b-43c7-91c8-d997cec2fa83/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:46:28.929434Z",
      "actor": {
        "type": "CLIENT",
        "id": "ecb8b7a1-c78f-487a-9424-411611420e91",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e2d85c8a-705b-43c7-91c8-d997cec2fa83",
        "quote_id": "c019785b-64c5-4902-b661-ed3a6c188b05",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "2c1c0853-a195-426a-9f5a-1137796a0101"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:46:28.931534Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e2d85c8a-705b-43c7-91c8-d997cec2fa83",
        "attempt_id": "4c9f51f7-fa20-4722-b63e-e6e29fdc4b1e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "2c1c0853-a195-426a-9f5a-1137796a0101"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T16:46:28.938831Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "70a5a557-ed7e-4678-8e2a-3ef49ce36de2",
        "order_id": "e2d85c8a-705b-43c7-91c8-d997cec2fa83",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "2c1c0853-a195-426a-9f5a-1137796a0101"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T16:46:29.526173Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "70a5a557-ed7e-4678-8e2a-3ef49ce36de2",
        "order_id": "e2d85c8a-705b-43c7-91c8-d997cec2fa83"
      },
      "correlation_id": "feb2dad6-64ff-4d4c-8698-24c5f7c91819"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order e2d85c8a-705b-43c7-91c8-d997cec2fa83 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/e2d85c8a-705b-43c7-91c8-d997cec2fa83` → **200**

```json
{
  "id": "e2d85c8a-705b-43c7-91c8-d997cec2fa83",
  "short_number": 6,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "ecb8b7a1-c78f-487a-9424-411611420e91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "2aad8e38-4dfb-4d08-a61e-0fc6f265ace1",
    "order_id": "e2d85c8a-705b-43c7-91c8-d997cec2fa83",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "21fef0d0-f770-4571-a786-3a5f80f7c219",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T16:46:28.928895Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e2d85c8a-705b-43c7-91c8-d997cec2fa83/cancel` → **200**

```json
{
  "command_id": "b4065ed2-b5bc-40df-babc-c3c9e1598f99",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "e2d85c8a-705b-43c7-91c8-d997cec2fa83",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "ecb8b7a1-c78f-487a-9424-411611420e91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "2aad8e38-4dfb-4d08-a61e-0fc6f265ace1",
    "order_id": "e2d85c8a-705b-43c7-91c8-d997cec2fa83",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "21fef0d0-f770-4571-a786-3a5f80f7c219",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T16:46:28.928895Z",
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
  "session_id": "d6461bc5-ba86-4925-935a-a3095cb4d25c",
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
  "last_heartbeat_at": "2026-10-28T16:46:25.113348Z",
  "last_location_at": "2026-10-28T16:46:25.113348Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d6461bc5-ba86-4925-935a-a3095cb4d25c/close` → **200**

```json
{
  "command_id": "cedd863e-56eb-44e6-984f-4ff61b8c35a5",
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
  "session_id": "fce638e2-a8b9-48ff-b592-41b2958d1910",
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
  "last_heartbeat_at": "2026-10-28T16:46:26.594736Z",
  "last_location_at": "2026-10-28T16:46:26.594736Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fce638e2-a8b9-48ff-b592-41b2958d1910/close` → **200**

```json
{
  "command_id": "c171716e-0c9c-4645-b731-ace3de5024f4",
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
  "device_ref": "sandbox-2348"
}
```

```json
{
  "challenge_id": "d6337ec7-0db8-41ab-8e1c-e1563a4cd2da",
  "expires_at": "2026-10-28T16:51:32.554899758Z",
  "resend_available_at": "2026-10-28T16:46:33.554899758Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "328855",
  "sent_at": "2026-10-28T16:46:32.557804014Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d6337ec7-0db8-41ab-8e1c-e1563a4cd2da",
  "code": "328855",
  "device_ref": "sandbox-2348"
}
```

```json
{
  "session_id": "c7907942-50e7-4015-9d10-a7c8dfdeb5ba",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjg5MiwiaWF0IjoxNzkzMjA1OTkyLCJqdGkiOiIxMjA1ZTllYS1kNDlkLTRiYTktYjg2Mi0yNDAyMzU3MjA0Y2YiLCJzaWQiOiJjNzkwNzk0Mi01MGU3LTQwMTUtOWQxMC1hN2M4ZGZkZWI1YmEifQ.rjJZ8PdVwRWROPSWASAIzXlIO2OsUxD2xz8I6CdRotA",
  "access_expires_at": "2026-10-28T17:01:32.866967224Z",
  "refresh_token": "B4ICvIQ6sf_cEzIBK8x4JWtkcz2uj7seygjU7M-XbHc",
  "refresh_expires_at": "2026-11-27T16:46:32.866346091Z",
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
  "command_id": "4e3dc68f-1b92-43b2-b05f-8d49e5970c97",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:46:33Z",
    "sequence": 1793205993411
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f5767605-6f55-4c40-aed4-992e6adbf231",
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
  "last_heartbeat_at": "2026-10-28T16:46:33.431342Z",
  "last_location_at": "2026-10-28T16:46:33.431342Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674052752",
  "device_ref": "sandbox-11637"
}
```

```json
{
  "challenge_id": "d28f3296-52e1-443f-aaba-fbed766b4c54",
  "expires_at": "2026-10-28T16:51:33.710616591Z",
  "resend_available_at": "2026-10-28T16:46:34.710616591Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674052752` → **200**

```json
{
  "phone": "+380674052752",
  "audience": "CLIENT",
  "code": "789714",
  "sent_at": "2026-10-28T16:46:33.713293193Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d28f3296-52e1-443f-aaba-fbed766b4c54",
  "code": "789714",
  "device_ref": "sandbox-11637"
}
```

```json
{
  "session_id": "2ec9ae8d-008b-4247-a636-985e630e2d63",
  "subject": {
    "type": "CLIENT",
    "id": "816ed4d7-7a6d-418a-a2bc-b9eb61340675"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MTZlZDRkNy03YTZkLTQxOGEtYTJiYy1iOWViNjEzNDA2NzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2ODk0LCJpYXQiOjE3OTMyMDU5OTQsImp0aSI6ImFjZWNmOTFiLTFmZTktNGZkYy05NDI2LWM1NWEzYWI2ZWU2NSIsInNpZCI6IjJlYzlhZThkLTAwOGItNDI0Ny1hNjM2LTk4NWU2MzBlMmQ2MyJ9.kEH8Md9r8aJ_K_yZ5YLCSrKCUuY5Pwnf5fFA_nC57YA",
  "access_expires_at": "2026-10-28T17:01:34.01386197Z",
  "refresh_token": "SOBlY4fNyQdhuQXmcq-SZxvXIyCOrBvQeAw6ChoNjMo",
  "refresh_expires_at": "2026-11-27T16:46:34.013275383Z",
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
  "command_id": "a5d4fc30-70fb-4761-b595-6770e05f6462",
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
  "id": "42f2304a-4732-4ec3-8f53-6abd19800243",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:51:34.564951Z",
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
  "command_id": "6230eb2e-8a55-490e-83b4-edd18734f462",
  "platform": "ANDROID",
  "token": "sandbox-driver-f74c6446-dd74-4058-b1ad-7e1cdb939533"
}
```

```json
{
  "id": "53f8b15b-1ed7-4dfd-9b31-ac3611d8a93f",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T16:46:34.858853Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "2be6cf4d-0f3f-43c9-98ca-513953c2cb32",
  "platform": "ANDROID",
  "token": "sandbox-rider-8adbac9e-30a6-4db3-ab03-b4d5099df30e"
}
```

```json
{
  "id": "88709b86-13fa-4bb0-a882-a9aca909428e",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T16:46:35.138454Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "af961ec3-47c9-4a3c-916b-a9a93aaf5469",
  "quote_id": "42f2304a-4732-4ec3-8f53-6abd19800243",
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
  "id": "2b217945-83aa-40fb-966e-192ab0983644",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "816ed4d7-7a6d-418a-a2bc-b9eb61340675",
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
  "created_at": "2026-10-28T16:46:35.429727Z",
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
    "id": "16121a48-34d9-49a2-8720-e2b8250867cd",
    "order_id": "2b217945-83aa-40fb-966e-192ab0983644",
    "expires_at": "2026-10-28T16:46:50.433136Z",
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

`POST /api/driver/v1/offers/16121a48-34d9-49a2-8720-e2b8250867cd/accept` → **200**

```json
{
  "command_id": "6fb62f5e-0dae-448e-8f17-8079a0f0319d"
}
```

```json
{
  "id": "6c300918-aaac-4ba5-93d6-e733e350af1f",
  "order_id": "2b217945-83aa-40fb-966e-192ab0983644",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f094b3e4-f36e-4072-b828-14be053aa525",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T16:46:35.402Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T16:46:35.402Z` → **200**

```json
[
  {
    "at": "2026-10-28T16:46:36.835238771Z",
    "token_suffix": "939533",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "2b217945-83aa-40fb-966e-192ab0983644",
      "order_version": "2",
      "event_id": "71505363-6842-45a9-82df-7d821cbd6588",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380674052752&after=2026-10-28T16:46:35.402Z` → **200**

```json
[
  {
    "at": "2026-10-28T16:46:36.838481158Z",
    "token_suffix": "9df30e",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "2b217945-83aa-40fb-966e-192ab0983644",
      "order_version": "3",
      "event_id": "cfe6cfa3-02b4-4832-997e-d075cfdba8d9",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/2b217945-83aa-40fb-966e-192ab0983644/messages` → **201**

```json
{
  "command_id": "185d2b81-a076-4ea2-8932-660a390cadab",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "bf2aeab5-d1f7-4338-b428-2f711844ecb3",
  "order_id": "2b217945-83aa-40fb-966e-192ab0983644",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T16:46:37.425377265Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f094b3e4-f36e-4072-b828-14be053aa525",
  "order_id": "2b217945-83aa-40fb-966e-192ab0983644",
  "assignment_id": "6c300918-aaac-4ba5-93d6-e733e350af1f",
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

`POST /api/driver/v1/trips/f094b3e4-f36e-4072-b828-14be053aa525/messages` → **201**

```json
{
  "command_id": "8649a3c3-d37e-433f-aa49-1e866b6ac1a0",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "1b9e0c47-95ff-47e4-a1c6-4ca6ce08b6d7",
  "order_id": "2b217945-83aa-40fb-966e-192ab0983644",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T16:46:37.996126996Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/2b217945-83aa-40fb-966e-192ab0983644/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/f094b3e4-f36e-4072-b828-14be053aa525/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674052752"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/f5767605-6f55-4c40-aed4-992e6adbf231/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:46:38Z",
    "sequence": 1793205998831
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f5767605-6f55-4c40-aed4-992e6adbf231",
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
  "last_heartbeat_at": "2026-10-28T16:46:38.852421Z",
  "last_location_at": "2026-10-28T16:46:38.852421Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f094b3e4-f36e-4072-b828-14be053aa525",
  "order_id": "2b217945-83aa-40fb-966e-192ab0983644",
  "assignment_id": "6c300918-aaac-4ba5-93d6-e733e350af1f",
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

`POST /api/driver/v1/trips/f094b3e4-f36e-4072-b828-14be053aa525/arrive` → **200**

```json
{
  "command_id": "87a7d1e8-b6ad-432e-b202-1e500e4bcf15",
  "expected_version": 0
}
```

```json
{
  "id": "f094b3e4-f36e-4072-b828-14be053aa525",
  "order_id": "2b217945-83aa-40fb-966e-192ab0983644",
  "assignment_id": "6c300918-aaac-4ba5-93d6-e733e350af1f",
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
  "arrived_at": "2026-10-28T16:46:39.427992Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f094b3e4-f36e-4072-b828-14be053aa525/start` → **200**

```json
{
  "command_id": "d965d0fb-273f-4d8d-9da1-eb50562fee63",
  "expected_version": 1
}
```

```json
{
  "id": "f094b3e4-f36e-4072-b828-14be053aa525",
  "order_id": "2b217945-83aa-40fb-966e-192ab0983644",
  "assignment_id": "6c300918-aaac-4ba5-93d6-e733e350af1f",
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
  "arrived_at": "2026-10-28T16:46:39.427992Z",
  "started_at": "2026-10-28T16:46:39.748247Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/f5767605-6f55-4c40-aed4-992e6adbf231/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:46:40Z",
    "sequence": 1793206000452
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f5767605-6f55-4c40-aed4-992e6adbf231",
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
  "last_heartbeat_at": "2026-10-28T16:46:40.068302Z",
  "last_location_at": "2026-10-28T16:46:40.068302Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/f094b3e4-f36e-4072-b828-14be053aa525/complete` → **200**

```json
{
  "command_id": "d50fa9a7-d901-4c90-9965-7416428277f0",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:46:40Z",
  "cash_received": true
}
```

```json
{
  "id": "f094b3e4-f36e-4072-b828-14be053aa525",
  "order_id": "2b217945-83aa-40fb-966e-192ab0983644",
  "assignment_id": "6c300918-aaac-4ba5-93d6-e733e350af1f",
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
  "arrived_at": "2026-10-28T16:46:39.427992Z",
  "started_at": "2026-10-28T16:46:39.748247Z",
  "completed_at": "2026-10-28T16:46:40.364678Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/2b217945-83aa-40fb-966e-192ab0983644` → **200**

```json
{
  "id": "2b217945-83aa-40fb-966e-192ab0983644",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "816ed4d7-7a6d-418a-a2bc-b9eb61340675",
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
    "id": "6c300918-aaac-4ba5-93d6-e733e350af1f",
    "order_id": "2b217945-83aa-40fb-966e-192ab0983644",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f094b3e4-f36e-4072-b828-14be053aa525",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:46:35.429727Z",
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
    "id": "2b217945-83aa-40fb-966e-192ab0983644",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-28T16:46:35.429727Z",
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
    "id": "f094b3e4-f36e-4072-b828-14be053aa525",
    "order_id": "2b217945-83aa-40fb-966e-192ab0983644",
    "order_short_number": 7,
    "created_at": "2026-10-28T16:46:36.022543Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "1a609ce1-d73e-4e65-b83e-2d4a0093fd23",
    "order_id": "a4c403b5-5c33-459a-a5e1-5a159e807083",
    "order_short_number": 1,
    "created_at": "2026-10-28T16:45:08.541957Z",
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

`GET /api/rider/v1/orders/2b217945-83aa-40fb-966e-192ab0983644/tip` → **200**

```json
{
  "order_id": "2b217945-83aa-40fb-966e-192ab0983644",
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
  "available_until": "2026-10-29T16:46:40.364678Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/2b217945-83aa-40fb-966e-192ab0983644/tip` → **201**

```json
{
  "command_id": "33109340-11bb-4917-a893-b01d54a7fced",
  "amount_minor": 1100
}
```

```json
{
  "id": "458418ea-b842-4e64-b72f-07e50f107212",
  "order_id": "2b217945-83aa-40fb-966e-192ab0983644",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T16:46:45.458645Z"
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
  "session_id": "de26bcad-c143-4649-ac18-26678bbd35a3",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY5MDYsImlhdCI6MTc5MzIwNjAwNiwianRpIjoiZTk1ZDIxYjYtNDdjOS00OWFiLWIwZjktZWQ5ZjY1NTgwYzYxIiwic2lkIjoiZGUyNmJjYWQtYzE0My00NjQ5LWFjMTgtMjY2NzhiYmQzNWEzIn0.ceBE92kPhwtVAY_5DkZ6IXP4o0UbC8H11FuI_iJ9D7k",
  "access_expires_at": "2026-10-28T17:01:46.053739739Z",
  "refresh_token": "4tDdnbwOCkyXSc2MiQP0nngcndhgL9kKokbiLWvlv70",
  "refresh_expires_at": "2026-10-29T04:46:46.053111232Z",
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
  "generated_at": "2026-10-28T16:46:46.331529869Z"
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
  "generated_at": "2026-10-28T16:46:46.635567952Z"
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
  "session_id": "88b27ac9-e283-474e-996f-87be47a8d7cf",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY5MDcsImlhdCI6MTc5MzIwNjAwNywianRpIjoiYjVlMWVmMTctYzU1ZC00MzEyLTljMTctNTgwODAzODc1MWJkIiwic2lkIjoiODhiMjdhYzktZTI4My00NzRlLTk5NmYtODdiZTQ3YThkN2NmIn0.zXz5cNKY7z3v7vnToxHQ7Oky-eK7KUrOLAGtHtu47_w",
  "access_expires_at": "2026-10-28T17:01:47.214278875Z",
  "refresh_token": "8UllwejMNVrEvv3sz1oCll5yuWsI5a0FaYcgQ440oU8",
  "refresh_expires_at": "2026-10-29T04:46:47.21363377Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2b217945-83aa-40fb-966e-192ab0983644/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:46:35.430291Z",
      "actor": {
        "type": "CLIENT",
        "id": "816ed4d7-7a6d-418a-a2bc-b9eb61340675",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2b217945-83aa-40fb-966e-192ab0983644",
        "quote_id": "42f2304a-4732-4ec3-8f53-6abd19800243",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "1b16faa5-dff2-49de-85d7-27d969810c5f"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:46:35.432276Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2b217945-83aa-40fb-966e-192ab0983644",
        "attempt_id": "797b41e5-188d-4043-97cf-ea7b900d5332",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "1b16faa5-dff2-49de-85d7-27d969810c5f"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T16:46:35.438901Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "16121a48-34d9-49a2-8720-e2b8250867cd",
        "order_id": "2b217945-83aa-40fb-966e-192ab0983644",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "1b16faa5-dff2-49de-85d7-27d969810c5f"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T16:46:36.024861Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "16121a48-34d9-49a2-8720-e2b8250867cd",
        "order_id": "2b217945-83aa-40fb-966e-192ab0983644",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "6c300918-aaac-4ba5-93d6-e733e350af1f"
      },
      "correlation_id": "b63eebdf-b619-4aee-9142-ede08e5de8e6"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T16:46:47.784058771Z",
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
      "last_location_at": "2026-10-28T16:46:40.068302Z",
      "order_id": null
    }
  ]
}
```

Done: order 2b217945-83aa-40fb-966e-192ab0983644.

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
  "session_id": "5749ea41-ce59-4f6d-b9db-10e830423b6d",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY5MDgsImlhdCI6MTc5MzIwNjAwOCwianRpIjoiNjBjOWRiZDYtYmYwMy00NzQzLThmNjQtMzA1NjhlODNmNWQ3Iiwic2lkIjoiNTc0OWVhNDEtY2U1OS00ZjZkLWI5ZGItMTBlODMwNDIzYjZkIn0.R_Jg09jnBXILRQ78LkvXRa1gwrnpI6tnSej4FcRZ1uU",
  "access_expires_at": "2026-10-28T17:01:48.378936228Z",
  "refresh_token": "Ch4_fDaD_QHdjrc_9DV-PjqBcBXCdYC5DliUlIIdZpw",
  "refresh_expires_at": "2026-10-29T04:46:48.378334061Z",
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
  "command_id": "b74631fb-3e7f-4a57-a390-b1bc152b4e86",
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
  "timestamp": "2026-10-28T16:46:49.000+0000",
  "channel": {
    "id": "1730052000.1205511450",
    "linkedid": "1730052000.1205511450",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673534786"
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
  "timestamp": "2026-10-28T16:46:49.000+0000",
  "channel": {
    "id": "1730052000.1205511450",
    "linkedid": "1730052000.1205511450",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673534786"
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
  "session_id": "2f9122db-1f3f-485c-bfab-025e1bccc840",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY5MDksImlhdCI6MTc5MzIwNjAwOSwianRpIjoiY2M5YmQ4OTgtMjMxOC00ODJiLWEzNTMtMDEwZDVkNmM1NDM4Iiwic2lkIjoiMmY5MTIyZGItMWYzZi00ODVjLWJmYWItMDI1ZTFiY2NjODQwIn0.8Sf6VxtUTqr-w7TgwF4YBrF1HoYaeykqLqkFV7aJ6Mo",
  "access_expires_at": "2026-10-28T17:01:49.556389937Z",
  "refresh_token": "TrNIlSOWat7KJxGODafEXOCKAwyBQ4KNXv4bAxcnWsQ",
  "refresh_expires_at": "2026-10-29T04:46:49.555739822Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "5ca45fa8-ba07-4383-aeb5-1a6f92d4ae65",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673534786",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T16:46:49Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/5ca45fa8-ba07-4383-aeb5-1a6f92d4ae65/answer` → **200**

```json
{
  "command_id": "98a83760-07ed-4153-bf45-3e73cb1e6e69"
}
```

```json
{
  "id": "5ca45fa8-ba07-4383-aeb5-1a6f92d4ae65",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673534786",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
  "order_ids": [],
  "started_at": "2026-10-28T16:46:49Z",
  "answered_at": "2026-10-28T16:46:50.134332Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1205511450",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "093d40b8-3b9c-4550-9b63-a540f16e3877",
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
  "id": "f28a032b-cec8-4bb3-b02e-1062712fe3ce",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:51:50.456743Z",
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
  "command_id": "7a9bee56-4d9d-4802-8499-64c6360d2d17",
  "quote_id": "f28a032b-cec8-4bb3-b02e-1062712fe3ce",
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
    "phone": "+380673534786"
  },
  "call_id": "5ca45fa8-ba07-4383-aeb5-1a6f92d4ae65"
}
```

```json
{
  "id": "b8fcaac8-d086-4a99-bb70-19bc805c2889",
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
  "created_at": "2026-10-28T16:46:50.768735Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673534786"
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
    "id": "1730052000.1205511450",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "5ca45fa8-ba07-4383-aeb5-1a6f92d4ae65",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673534786",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
      "order_ids": [
        "b8fcaac8-d086-4a99-bb70-19bc805c2889"
      ],
      "started_at": "2026-10-28T16:46:49Z",
      "answered_at": "2026-10-28T16:46:50.134332Z",
      "ended_at": "2026-10-28T16:46:51.084847Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "d6dec466-0b14-4420-ab3f-5a242d30a302",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672089100",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
      "order_ids": [],
      "started_at": "2026-10-28T16:45:16.632681Z",
      "answered_at": "2026-10-28T16:45:16.961488Z",
      "ended_at": "2026-10-28T16:45:17.266227Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T16:45:20.547406Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/b8fcaac8-d086-4a99-bb70-19bc805c2889` → **200**

```json
{
  "id": "b8fcaac8-d086-4a99-bb70-19bc805c2889",
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
  "created_at": "2026-10-28T16:46:50.768735Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673534786"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/b8fcaac8-d086-4a99-bb70-19bc805c2889` → **200**

```json
{
  "id": "b8fcaac8-d086-4a99-bb70-19bc805c2889",
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
  "created_at": "2026-10-28T16:46:50.768735Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673534786"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b8fcaac8-d086-4a99-bb70-19bc805c2889/cancel` → **200**

```json
{
  "command_id": "08fab7ba-dee5-4eff-8b54-cc2f9c3ba392",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "b8fcaac8-d086-4a99-bb70-19bc805c2889",
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
  "created_at": "2026-10-28T16:46:50.768735Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673534786"
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

Done: call 5ca45fa8-ba07-4383-aeb5-1a6f92d4ae65 with order b8fcaac8-d086-4a99-bb70-19bc805c2889.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-14280"
}
```

```json
{
  "challenge_id": "ab09c9f1-2ca9-40df-9fa3-e24bc5a8d4ca",
  "expires_at": "2026-10-28T16:51:52.302302261Z",
  "resend_available_at": "2026-10-28T16:46:53.302302261Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "606273",
  "sent_at": "2026-10-28T16:46:52.304864538Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ab09c9f1-2ca9-40df-9fa3-e24bc5a8d4ca",
  "code": "606273",
  "device_ref": "sandbox-14280"
}
```

```json
{
  "session_id": "3c379793-9632-4428-90eb-3a6af3143448",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjkxMiwiaWF0IjoxNzkzMjA2MDEyLCJqdGkiOiJiOTYzNGQ0My1hNDFkLTRkZDMtYTRmNC00MGFlM2JlOTc1ODciLCJzaWQiOiIzYzM3OTc5My05NjMyLTQ0MjgtOTBlYi0zYTZhZjMxNDM0NDgifQ.PAXXTLnyHCNagouqGuFCqcpwYsHypEFsOy3uZkqu-WA",
  "access_expires_at": "2026-10-28T17:01:52.614710766Z",
  "refresh_token": "aykNh8laYyRtVcTOcl1A4qwuTr__OOlNIXzQY4XqrqA",
  "refresh_expires_at": "2026-11-27T16:46:52.614120414Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f5767605-6f55-4c40-aed4-992e6adbf231",
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
  "last_heartbeat_at": "2026-10-28T16:46:40.068302Z",
  "last_location_at": "2026-10-28T16:46:40.068302Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f5767605-6f55-4c40-aed4-992e6adbf231/handover` → **200**

```json
{
  "command_id": "8ea9933d-66c8-4840-ba08-818d6006b844",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f5767605-6f55-4c40-aed4-992e6adbf231",
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
  "last_heartbeat_at": "2026-10-28T16:46:40.068302Z",
  "last_location_at": "2026-10-28T16:46:40.068302Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f5767605-6f55-4c40-aed4-992e6adbf231/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:46:53Z",
    "sequence": 1793206013459
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f5767605-6f55-4c40-aed4-992e6adbf231",
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
  "last_heartbeat_at": "2026-10-28T16:46:53.479818Z",
  "last_location_at": "2026-10-28T16:46:53.479818Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667542089",
  "device_ref": "sandbox-15914"
}
```

```json
{
  "challenge_id": "d9557283-ae3b-4fea-b071-17c5e7993701",
  "expires_at": "2026-10-28T16:51:53.750071805Z",
  "resend_available_at": "2026-10-28T16:46:54.750071805Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667542089` → **200**

```json
{
  "phone": "+380667542089",
  "audience": "CLIENT",
  "code": "682615",
  "sent_at": "2026-10-28T16:46:53.752398229Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d9557283-ae3b-4fea-b071-17c5e7993701",
  "code": "682615",
  "device_ref": "sandbox-15914"
}
```

```json
{
  "session_id": "2d893fda-e31e-432a-a915-c77c83265d04",
  "subject": {
    "type": "CLIENT",
    "id": "346814b3-9c57-4e62-8861-c46a7c294ca1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNDY4MTRiMy05YzU3LTRlNjItODg2MS1jNDZhN2MyOTRjYTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2OTE0LCJpYXQiOjE3OTMyMDYwMTQsImp0aSI6IjhiZTAxNDg1LTJiNTgtNDNjZi1iMzYzLWM1Y2Y3ZDU1YTIwYSIsInNpZCI6IjJkODkzZmRhLWUzMWUtNDMyYS1hOTE1LWM3N2M4MzI2NWQwNCJ9.xw1Cl_ON05Npy3YDeZiqfs57ioAvCT12ASgaM1Yit7g",
  "access_expires_at": "2026-10-28T17:01:54.057340927Z",
  "refresh_token": "NY3oqOoJMhNrNVtDI6SOBGwUEG3PRu65HOZDjckaYyc",
  "refresh_expires_at": "2026-11-27T16:46:54.056693815Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a31c5c78-e6e2-4333-a30d-11d559831815",
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
  "id": "79edef66-5a79-4198-abc5-cdeb97c3399a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:51:54.346185Z",
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
  "command_id": "d2c96e0e-4a96-4410-b2b3-70db08cff97b",
  "quote_id": "79edef66-5a79-4198-abc5-cdeb97c3399a",
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
  "id": "ee7aa7f8-edfb-46c8-8a3f-f644411025ce",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "346814b3-9c57-4e62-8861-c46a7c294ca1",
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
  "created_at": "2026-10-28T16:46:54.640116Z",
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
    "id": "cbf16ab7-360b-4e23-8379-21e82c9b51ba",
    "order_id": "ee7aa7f8-edfb-46c8-8a3f-f644411025ce",
    "expires_at": "2026-10-28T16:47:09.643287Z",
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

`POST /api/driver/v1/offers/cbf16ab7-360b-4e23-8379-21e82c9b51ba/accept` → **200**

```json
{
  "command_id": "adff541e-b4a5-4644-ac9f-b6f8a5bb1cdd"
}
```

```json
{
  "id": "2b5ff4f4-9869-4f10-8af0-2b1f6d1cc35a",
  "order_id": "ee7aa7f8-edfb-46c8-8a3f-f644411025ce",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d58ed016-23a2-45c3-b42e-ab00931df0ef",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d58ed016-23a2-45c3-b42e-ab00931df0ef",
  "order_id": "ee7aa7f8-edfb-46c8-8a3f-f644411025ce",
  "assignment_id": "2b5ff4f4-9869-4f10-8af0-2b1f6d1cc35a",
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

`POST /api/driver/v1/work-sessions/f5767605-6f55-4c40-aed4-992e6adbf231/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:46:55Z",
    "sequence": 1793206015770
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f5767605-6f55-4c40-aed4-992e6adbf231",
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
  "last_heartbeat_at": "2026-10-28T16:46:55.791379Z",
  "last_location_at": "2026-10-28T16:46:55.791379Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d58ed016-23a2-45c3-b42e-ab00931df0ef/arrive` → **200**

```json
{
  "command_id": "0d034706-8d5b-4e34-b415-0ec98ce9a864",
  "expected_version": 0
}
```

```json
{
  "id": "d58ed016-23a2-45c3-b42e-ab00931df0ef",
  "order_id": "ee7aa7f8-edfb-46c8-8a3f-f644411025ce",
  "assignment_id": "2b5ff4f4-9869-4f10-8af0-2b1f6d1cc35a",
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
  "arrived_at": "2026-10-28T16:46:56.085246Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d58ed016-23a2-45c3-b42e-ab00931df0ef/start` → **200**

```json
{
  "command_id": "eb7cefa6-2278-4ab0-82e0-65fa435de839",
  "expected_version": 1
}
```

```json
{
  "id": "d58ed016-23a2-45c3-b42e-ab00931df0ef",
  "order_id": "ee7aa7f8-edfb-46c8-8a3f-f644411025ce",
  "assignment_id": "2b5ff4f4-9869-4f10-8af0-2b1f6d1cc35a",
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
  "arrived_at": "2026-10-28T16:46:56.085246Z",
  "started_at": "2026-10-28T16:46:56.377177Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/f5767605-6f55-4c40-aed4-992e6adbf231/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:46:56Z",
    "sequence": 1793206016671
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f5767605-6f55-4c40-aed4-992e6adbf231",
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
  "last_heartbeat_at": "2026-10-28T16:46:56.693864Z",
  "last_location_at": "2026-10-28T16:46:56.693864Z",
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
  "device_ref": "sandbox-31096"
}
```

```json
{
  "challenge_id": "79f00844-4404-492f-983d-a4f621c2bace",
  "expires_at": "2026-10-28T16:51:56.974837308Z",
  "resend_available_at": "2026-10-28T16:46:57.974837308Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "124273",
  "sent_at": "2026-10-28T16:46:56.978276776Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "79f00844-4404-492f-983d-a4f621c2bace",
  "code": "124273",
  "device_ref": "sandbox-31096"
}
```

```json
{
  "session_id": "792a29ae-1697-4183-b9a6-e95bce97c1e6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjkxNywiaWF0IjoxNzkzMjA2MDE3LCJqdGkiOiIxOTg4ZjJhNS02YzdkLTQ3YjYtYjNiOC00MzllYzE2MDBiYmIiLCJzaWQiOiI3OTJhMjlhZS0xNjk3LTQxODMtYjlhNi1lOTViY2U5N2MxZTYifQ.podQ1c7ZM-VOZv6l0wEVcbZlSikzZLrT-YnQHtRuiCc",
  "access_expires_at": "2026-10-28T17:01:57.285987053Z",
  "refresh_token": "eD63dxn5hsm1iItiVTxEnrQoqa_cQznQswDOSLW0i1s",
  "refresh_expires_at": "2026-11-27T16:46:57.285384605Z",
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
  "command_id": "2b795440-6863-4fcf-8106-21b9e1b3c820",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:46:57Z",
    "sequence": 1793206017824
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6a37edb5-a0fc-44a0-a8d8-99ecd760f578",
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
  "last_heartbeat_at": "2026-10-28T16:46:57.844384Z",
  "last_location_at": "2026-10-28T16:46:57.844384Z",
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
  "session_id": "911e0c07-eb41-4e34-ae57-c772382f0fd5",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY5MTgsImlhdCI6MTc5MzIwNjAxOCwianRpIjoiMDg2MmE2NmEtZjU1MC00OTdiLWIyYWYtZWRkOTg5ZWYyYzBmIiwic2lkIjoiOTExZTBjMDctZWI0MS00ZTM0LWFlNTctYzc3MjM4MmYwZmQ1In0._QPWi9KvH59Fvys8F_qJJxrp45HHrPhHV2TIvNrUf8Q",
  "access_expires_at": "2026-10-28T17:01:58.419569524Z",
  "refresh_token": "FJzN_mLQvS1B-uSckTtM96Mink6DbHLReP-919aZW1I",
  "refresh_expires_at": "2026-10-29T04:46:58.418988947Z",
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
  "session_id": "21f092b1-df3d-49fe-a774-2bddfe4d4336",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY5MTgsImlhdCI6MTc5MzIwNjAxOCwianRpIjoiMGZhNWMzYmQtMDdlOC00NGYyLThjYmQtODViZGZkOTRlZTNkIiwic2lkIjoiMjFmMDkyYjEtZGYzZC00OWZlLWE3NzQtMmJkZGZlNGQ0MzM2In0.4GCQBZ4b316yDlPnM2ZzMEu2CwKXzP5Cc_xU_D1CuXI",
  "access_expires_at": "2026-10-28T17:01:58.995457143Z",
  "refresh_token": "6FrpZ50Z1sNB7brK_O-zsfziGjIc5VCzToqNw6MHx0Q",
  "refresh_expires_at": "2026-10-29T04:46:58.994874242Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ee7aa7f8-edfb-46c8-8a3f-f644411025ce` → **200**

```json
{
  "id": "ee7aa7f8-edfb-46c8-8a3f-f644411025ce",
  "short_number": 9,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "346814b3-9c57-4e62-8861-c46a7c294ca1",
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
    "id": "2b5ff4f4-9869-4f10-8af0-2b1f6d1cc35a",
    "order_id": "ee7aa7f8-edfb-46c8-8a3f-f644411025ce",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "d58ed016-23a2-45c3-b42e-ab00931df0ef",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T16:46:54.640116Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ee7aa7f8-edfb-46c8-8a3f-f644411025ce/interrupt` → **200**

```json
{
  "command_id": "d968e4fa-a86d-4679-98c5-dcecc89445a1",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "ee7aa7f8-edfb-46c8-8a3f-f644411025ce",
    "short_number": 9,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "346814b3-9c57-4e62-8861-c46a7c294ca1",
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
      "id": "2b5ff4f4-9869-4f10-8af0-2b1f6d1cc35a",
      "order_id": "ee7aa7f8-edfb-46c8-8a3f-f644411025ce",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "d58ed016-23a2-45c3-b42e-ab00931df0ef",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T16:46:54.640116Z",
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
    "id": "41b82718-6bd5-4fe5-a066-9fb386864f66",
    "short_number": 10,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "346814b3-9c57-4e62-8861-c46a7c294ca1",
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
    "id": "3f5a9aac-6bc5-4c77-a246-f2816b074d43",
    "order_id": "41b82718-6bd5-4fe5-a066-9fb386864f66",
    "expires_at": "2026-10-28T16:47:14.578535Z",
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

`POST /api/driver/v1/offers/3f5a9aac-6bc5-4c77-a246-f2816b074d43/accept` → **200**

```json
{
  "command_id": "6325b325-39db-4e71-b721-74083a370093"
}
```

```json
{
  "id": "71f274e7-1601-4eca-b7cd-52bd6e8900d4",
  "order_id": "41b82718-6bd5-4fe5-a066-9fb386864f66",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6e4ca1b5-afd1-41cc-bd21-2bf6630d875b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6e4ca1b5-afd1-41cc-bd21-2bf6630d875b",
  "order_id": "41b82718-6bd5-4fe5-a066-9fb386864f66",
  "assignment_id": "71f274e7-1601-4eca-b7cd-52bd6e8900d4",
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
  "session_id": "6a37edb5-a0fc-44a0-a8d8-99ecd760f578",
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
  "last_heartbeat_at": "2026-10-28T16:46:57.844384Z",
  "last_location_at": "2026-10-28T16:46:57.844384Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/6a37edb5-a0fc-44a0-a8d8-99ecd760f578/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:47:00Z",
    "sequence": 1793206020996
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6a37edb5-a0fc-44a0-a8d8-99ecd760f578",
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
  "last_heartbeat_at": "2026-10-28T16:47:01.01618Z",
  "last_location_at": "2026-10-28T16:47:01.01618Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6e4ca1b5-afd1-41cc-bd21-2bf6630d875b/arrive` → **200**

```json
{
  "command_id": "35b8ca01-76ff-4e2f-96e1-81e87aea61fe",
  "expected_version": 0
}
```

```json
{
  "id": "6e4ca1b5-afd1-41cc-bd21-2bf6630d875b",
  "order_id": "41b82718-6bd5-4fe5-a066-9fb386864f66",
  "assignment_id": "71f274e7-1601-4eca-b7cd-52bd6e8900d4",
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
  "arrived_at": "2026-10-28T16:47:01.299055Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6e4ca1b5-afd1-41cc-bd21-2bf6630d875b/start` → **200**

```json
{
  "command_id": "ff39f42f-9b57-409a-932f-254d5cc45682",
  "expected_version": 1
}
```

```json
{
  "id": "6e4ca1b5-afd1-41cc-bd21-2bf6630d875b",
  "order_id": "41b82718-6bd5-4fe5-a066-9fb386864f66",
  "assignment_id": "71f274e7-1601-4eca-b7cd-52bd6e8900d4",
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
  "arrived_at": "2026-10-28T16:47:01.299055Z",
  "started_at": "2026-10-28T16:47:01.592784Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6e4ca1b5-afd1-41cc-bd21-2bf6630d875b/complete` → **200**

```json
{
  "command_id": "7184c4b8-dd55-4557-8743-75fad3762395",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:47:01Z"
}
```

```json
{
  "id": "6e4ca1b5-afd1-41cc-bd21-2bf6630d875b",
  "order_id": "41b82718-6bd5-4fe5-a066-9fb386864f66",
  "assignment_id": "71f274e7-1601-4eca-b7cd-52bd6e8900d4",
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
  "arrived_at": "2026-10-28T16:47:01.299055Z",
  "started_at": "2026-10-28T16:47:01.592784Z",
  "completed_at": "2026-10-28T16:47:01.903311Z",
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
    "id": "41b82718-6bd5-4fe5-a066-9fb386864f66",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T16:46:59.568611Z",
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
    "id": "ee7aa7f8-edfb-46c8-8a3f-f644411025ce",
    "short_number": 9,
    "status": "CANCELLED",
    "created_at": "2026-10-28T16:46:54.640116Z",
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

`GET /api/operator/v1/orders/ee7aa7f8-edfb-46c8-8a3f-f644411025ce/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:46:54.640617Z",
      "actor": {
        "type": "CLIENT",
        "id": "346814b3-9c57-4e62-8861-c46a7c294ca1",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ee7aa7f8-edfb-46c8-8a3f-f644411025ce",
        "quote_id": "79edef66-5a79-4198-abc5-cdeb97c3399a",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "440e0945-18d9-495b-9170-3026cce8daf9"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:46:54.642484Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ee7aa7f8-edfb-46c8-8a3f-f644411025ce",
        "attempt_id": "d692e03c-128b-407b-82ff-0b7574886934",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "440e0945-18d9-495b-9170-3026cce8daf9"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T16:46:54.646233Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "cbf16ab7-360b-4e23-8379-21e82c9b51ba",
        "order_id": "ee7aa7f8-edfb-46c8-8a3f-f644411025ce",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "440e0945-18d9-495b-9170-3026cce8daf9"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T16:46:55.221782Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "cbf16ab7-360b-4e23-8379-21e82c9b51ba",
        "order_id": "ee7aa7f8-edfb-46c8-8a3f-f644411025ce",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "2b5ff4f4-9869-4f10-8af0-2b1f6d1cc35a"
      },
      "correlation_id": "72e59200-3777-4c87-80d4-d4f5a9872b45"
```

Done: interrupted ee7aa7f8-edfb-46c8-8a3f-f644411025ce, follow-up 41b82718-6bd5-4fe5-a066-9fb386864f66.

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
  "session_id": "a3a31afe-d140-4ab5-b943-e26965b6e7e6",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY5MjYsImlhdCI6MTc5MzIwNjAyNiwianRpIjoiYTMwYzVkN2MtZjljZC00N2ZkLThlMGYtNDgwYzk2MjI1MzMwIiwic2lkIjoiYTNhMzFhZmUtZDE0MC00YWI1LWI5NDMtZTI2OTY1YjZlN2U2In0.Y8NJrcFbY4hgEy9-Cza8pNh-jjPSuwvok7xM7w3sGbQ",
  "access_expires_at": "2026-10-28T17:02:06.343492785Z",
  "refresh_token": "xhh4W1JE9NWO8I7e1Ke0jCANvCOBnFIxYLLyI3l8W9Q",
  "refresh_expires_at": "2026-10-29T04:47:06.342968133Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "d4a91567-e13c-4774-a17d-b3633c2c4064",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:47:06Z"
}
```

```json
{
  "id": "627e026f-5df4-4c63-85c0-5c350ab6c56b",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:47:06Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/627e026f-5df4-4c63-85c0-5c350ab6c56b/publish` → **200**

```json
{
  "command_id": "faa09476-f3df-4cc8-92f6-015af380e319",
  "expected_version": 0
}
```

```json
{
  "id": "627e026f-5df4-4c63-85c0-5c350ab6c56b",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:47:06.950511Z",
  "published_at": "2026-10-28T16:47:06.950511Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "627e026f-5df4-4c63-85c0-5c350ab6c56b",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T16:47:06.950511Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633764421",
  "device_ref": "sandbox-15847"
}
```

```json
{
  "challenge_id": "c6656573-386b-459d-9d29-ff3ed8bd5832",
  "expires_at": "2026-10-28T16:52:07.513523496Z",
  "resend_available_at": "2026-10-28T16:47:08.513523496Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633764421` → **200**

```json
{
  "phone": "+380633764421",
  "audience": "CLIENT",
  "code": "469259",
  "sent_at": "2026-10-28T16:47:07.516054732Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c6656573-386b-459d-9d29-ff3ed8bd5832",
  "code": "469259",
  "device_ref": "sandbox-15847"
}
```

```json
{
  "session_id": "ffd37702-bdd8-47dc-92c8-5a410ecd4e57",
  "subject": {
    "type": "CLIENT",
    "id": "f1a1f147-68a3-4178-b265-3c04d90f372c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMWExZjE0Ny02OGEzLTQxNzgtYjI2NS0zYzA0ZDkwZjM3MmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2OTI3LCJpYXQiOjE3OTMyMDYwMjcsImp0aSI6Ijk1MTVlNDE5LTgzNWEtNGRlNC05ZmI0LTRhZjc5MmM0NjQ5NCIsInNpZCI6ImZmZDM3NzAyLWJkZDgtNDdkYy05MmM4LTVhNDEwZWNkNGU1NyJ9.7ZqKVK6hnODftbbu7B5mejez6Ssz8JdZCKgE8b_X20k",
  "access_expires_at": "2026-10-28T17:02:07.818749173Z",
  "refresh_token": "04g2Uj-Ro-HhEoYqJSowil_TYYtOfJn5UCx7-SlhGTE",
  "refresh_expires_at": "2026-11-27T16:47:07.818212399Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "627e026f-5df4-4c63-85c0-5c350ab6c56b",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T16:47:06.950511Z",
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
  "command_id": "c4045d85-3863-4abc-a602-1f2683761ee9",
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
  "id": "bb455f93-7615-4668-be5a-7f2762531495",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:52:08.373380Z",
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
  "command_id": "c580d2b2-700c-44ca-ba9c-94b9838e1b63",
  "quote_id": "bb455f93-7615-4668-be5a-7f2762531495",
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
  "correlation_id": "5d260a4e-3dd0-4be3-bb3f-2a41f16c8fc2"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "0eafdadc-ffe6-4f48-97ed-e25c0649caf4",
  "version_id": "627e026f-5df4-4c63-85c0-5c350ab6c56b",
  "language": "uk"
}
```

```json
{
  "version_id": "627e026f-5df4-4c63-85c0-5c350ab6c56b",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T16:47:08.948237Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3c7430e5-3d16-4a19-9d5a-ec58601ddd33",
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
  "id": "f00e7091-23d4-4e87-a345-99ea06327587",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:52:09.229471Z",
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
  "command_id": "ab85f72a-9807-44f5-bd83-aa1f664b8e17",
  "quote_id": "f00e7091-23d4-4e87-a345-99ea06327587",
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
  "id": "4503db5d-4edf-4093-885f-53f6a4bdd429",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f1a1f147-68a3-4178-b265-3c04d90f372c",
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
  "created_at": "2026-10-28T16:47:09.517059Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/4503db5d-4edf-4093-885f-53f6a4bdd429` → **200**

```json
{
  "id": "4503db5d-4edf-4093-885f-53f6a4bdd429",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f1a1f147-68a3-4178-b265-3c04d90f372c",
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
  "created_at": "2026-10-28T16:47:09.517059Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/4503db5d-4edf-4093-885f-53f6a4bdd429/cancel` → **200**

```json
{
  "command_id": "12a5732b-010a-4ce3-9426-72ee3c80f2f1",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4503db5d-4edf-4093-885f-53f6a4bdd429",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f1a1f147-68a3-4178-b265-3c04d90f372c",
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
  "created_at": "2026-10-28T16:47:09.517059Z",
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

`POST /api/admin/v1/legal-documents/627e026f-5df4-4c63-85c0-5c350ab6c56b` → **409**

```json
{
  "command_id": "fe8f2a35-1652-45e2-89e4-6ecb417d803b",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:47:10Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/627e026f-5df4-4c63-85c0-5c350ab6c56b",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "9ecfc5e5-9db3-465c-a6b4-48ee3a327aca"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "5fe7db89-ea21-44f0-ba92-892870783b33",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T16:47:10Z"
}
```

```json
{
  "id": "0306824d-8174-4b11-95aa-5e303748a257",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T16:47:10Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/0306824d-8174-4b11-95aa-5e303748a257/publish` → **200**

```json
{
  "command_id": "182f0c1e-a545-4c9e-b3cc-5b7a74e08f40",
  "expected_version": 0
}
```

```json
{
  "id": "0306824d-8174-4b11-95aa-5e303748a257",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T16:47:11.002131Z",
  "published_at": "2026-10-28T16:47:11.002131Z",
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
  "device_ref": "sandbox-12543"
}
```

```json
{
  "challenge_id": "f7b91f21-df34-425d-b389-01f5d7f18ea7",
  "expires_at": "2026-10-28T16:52:11.284569046Z",
  "resend_available_at": "2026-10-28T16:47:12.284569046Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "651869",
  "sent_at": "2026-10-28T16:47:11.287055158Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f7b91f21-df34-425d-b389-01f5d7f18ea7",
  "code": "651869",
  "device_ref": "sandbox-12543"
}
```

```json
{
  "session_id": "602a0fb1-280d-4c00-8c75-0e4b1a563eca",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjkzMSwiaWF0IjoxNzkzMjA2MDMxLCJqdGkiOiJjMWU1MWM0NS04YTg1LTRiN2QtOGEyMC05ODVmYjYyZWM3NGIiLCJzaWQiOiI2MDJhMGZiMS0yODBkLTRjMDAtOGM3NS0wZTRiMWE1NjNlY2EifQ.EENk3AZKvaGOb7jz0K4T6B7LfCzE6ZbZmFX-PDZRKf4",
  "access_expires_at": "2026-10-28T17:02:11.592995746Z",
  "refresh_token": "HfaO0W_wfZexHWln55s9hddoBaPT-JWAck9ighr3y_k",
  "refresh_expires_at": "2026-11-27T16:47:11.592369885Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6a37edb5-a0fc-44a0-a8d8-99ecd760f578",
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
  "last_heartbeat_at": "2026-10-28T16:47:01.01618Z",
  "last_location_at": "2026-10-28T16:47:01.01618Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6a37edb5-a0fc-44a0-a8d8-99ecd760f578/handover` → **200**

```json
{
  "command_id": "562fc6a9-2032-434f-8567-1771c9dfa2cb",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6a37edb5-a0fc-44a0-a8d8-99ecd760f578",
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
  "last_heartbeat_at": "2026-10-28T16:47:01.01618Z",
  "last_location_at": "2026-10-28T16:47:01.01618Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6a37edb5-a0fc-44a0-a8d8-99ecd760f578/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:47:12Z",
    "sequence": 1793206032436
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6a37edb5-a0fc-44a0-a8d8-99ecd760f578",
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
  "last_heartbeat_at": "2026-10-28T16:47:12.456793Z",
  "last_location_at": "2026-10-28T16:47:12.456793Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679270798",
  "device_ref": "sandbox-11739"
}
```

```json
{
  "challenge_id": "7d3f6888-be48-4f77-8d4a-81ee32dc43a1",
  "expires_at": "2026-10-28T16:52:12.728492015Z",
  "resend_available_at": "2026-10-28T16:47:13.728492015Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679270798` → **200**

```json
{
  "phone": "+380679270798",
  "audience": "CLIENT",
  "code": "802688",
  "sent_at": "2026-10-28T16:47:12.730920049Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7d3f6888-be48-4f77-8d4a-81ee32dc43a1",
  "code": "802688",
  "device_ref": "sandbox-11739"
}
```

```json
{
  "session_id": "692f9a33-6402-4908-ae79-6c4b6c21bc37",
  "subject": {
    "type": "CLIENT",
    "id": "3cf066f9-7a60-46c6-b94f-e23ea8f4402a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzY2YwNjZmOS03YTYwLTQ2YzYtYjk0Zi1lMjNlYThmNDQwMmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2OTMzLCJpYXQiOjE3OTMyMDYwMzMsImp0aSI6IjhjZmI1YzUzLWFjNmEtNGY1NC05ZTNmLTcwN2FhNzNiNzlkMSIsInNpZCI6IjY5MmY5YTMzLTY0MDItNDkwOC1hZTc5LTZjNGI2YzIxYmMzNyJ9.iDgJPeVsC7VE_pq1VRq0FqY5JHWexXHeTqThk-PTrF4",
  "access_expires_at": "2026-10-28T17:02:13.036280006Z",
  "refresh_token": "MlZ-d-EKplnAs2ItXQiViLOjGPtgvzOAuNIPVYi2BCI",
  "refresh_expires_at": "2026-11-27T16:47:13.035738452Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e1aaede6-29bb-4737-89e5-6c77896ad74a",
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
  "id": "5d6a884e-d028-47e3-a11e-d8e186b1c44a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:52:13.317370Z",
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
  "command_id": "bafadbed-d806-42a8-a958-f6ae99cbcb14",
  "quote_id": "5d6a884e-d028-47e3-a11e-d8e186b1c44a",
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
    "phone": "+380678652287"
  }
}
```

```json
{
  "id": "ef22b3f3-221b-4dbe-a735-cb4c92806546",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3cf066f9-7a60-46c6-b94f-e23ea8f4402a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:47:13.613561Z",
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
    "id": "9d251637-e446-4bb0-8596-7a2c2a2cb5b0",
    "order_id": "ef22b3f3-221b-4dbe-a735-cb4c92806546",
    "expires_at": "2026-10-28T16:47:28.617175Z",
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

`POST /api/driver/v1/offers/9d251637-e446-4bb0-8596-7a2c2a2cb5b0/accept` → **200**

```json
{
  "command_id": "dca8b253-e23d-4dad-9a06-a49ccc799745"
}
```

```json
{
  "id": "956b078c-bca3-4078-a17a-1c3b4b5d4321",
  "order_id": "ef22b3f3-221b-4dbe-a735-cb4c92806546",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bc0497fe-4f2b-4201-ad8d-fa5f14a221dc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bc0497fe-4f2b-4201-ad8d-fa5f14a221dc",
  "order_id": "ef22b3f3-221b-4dbe-a735-cb4c92806546",
  "assignment_id": "956b078c-bca3-4078-a17a-1c3b4b5d4321",
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
    "phone": "+380678652287"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8699ebf3-526b-43dc-9895-36e7842bc091",
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
  "id": "b63140af-587f-4e08-a713-ca65cd8424f0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:52:14.800908Z",
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
  "command_id": "802c971d-5acb-44e4-8070-67139c9b1f94",
  "quote_id": "b63140af-587f-4e08-a713-ca65cd8424f0",
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
  "id": "27da78d9-9975-4509-959b-a6a5b84f5f7a",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3cf066f9-7a60-46c6-b94f-e23ea8f4402a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T16:47:15.08888Z",
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
  "command_id": "496a72d7-8638-4b8d-8a4b-7703c51e6a02",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T19:47:15Z"
}
```

```json
{
  "id": "c8c7654c-c2a5-48bd-ba3b-d2dc060b60da",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:52:15.387200Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T19:47:15Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "02fc1639-6266-4039-87a4-8776108d3e50",
  "quote_id": "c8c7654c-c2a5-48bd-ba3b-d2dc060b60da",
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
  "pickup_at": "2026-10-28T19:47:15Z"
}
```

```json
{
  "id": "b07746e0-7703-45ce-829d-0800746df71c",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3cf066f9-7a60-46c6-b94f-e23ea8f4402a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T16:47:15.674896Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T19:47:15Z",
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
  "command_id": "300292dc-3324-42d7-848f-336dcd8e71f8",
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
  "id": "00bb2cad-761d-442d-9dbc-fdf8c97ff11d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:52:15.980373Z",
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
  "command_id": "03f5cff5-c631-443c-a14b-279db224dbd2",
  "quote_id": "00bb2cad-761d-442d-9dbc-fdf8c97ff11d",
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
  "correlation_id": "f7eca200-fa5d-48f2-969b-aa0953191242"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "b07746e0-7703-45ce-829d-0800746df71c",
      "short_number": 14,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "3cf066f9-7a60-46c6-b94f-e23ea8f4402a",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T16:47:15.674896Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T19:47:15Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "27da78d9-9975-4509-959b-a6a5b84f5f7a",
      "short_number": 13,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "3cf066f9-7a60-46c6-b94f-e23ea8f4402a",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-28T16:47:15.08888Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "ef22b3f3-221b-4dbe-a735-cb4c92806546",
      "short_number": 12,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "3cf066f9-7a60-46c6-b94f-e23ea8f4402a",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "27da78d9-9975-4509-959b-a6a5b84f5f7a",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3cf066f9-7a60-46c6-b94f-e23ea8f4402a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T16:47:15.08888Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/ef22b3f3-221b-4dbe-a735-cb4c92806546` → **200**

```json
{
  "id": "ef22b3f3-221b-4dbe-a735-cb4c92806546",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3cf066f9-7a60-46c6-b94f-e23ea8f4402a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "956b078c-bca3-4078-a17a-1c3b4b5d4321",
    "order_id": "ef22b3f3-221b-4dbe-a735-cb4c92806546",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "bc0497fe-4f2b-4201-ad8d-fa5f14a221dc",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T16:47:13.613561Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/ef22b3f3-221b-4dbe-a735-cb4c92806546/cancel` → **200**

```json
{
  "command_id": "6a8d908b-79df-41a1-83e9-c120861a47ec",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ef22b3f3-221b-4dbe-a735-cb4c92806546",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "3cf066f9-7a60-46c6-b94f-e23ea8f4402a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "956b078c-bca3-4078-a17a-1c3b4b5d4321",
    "order_id": "ef22b3f3-221b-4dbe-a735-cb4c92806546",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "bc0497fe-4f2b-4201-ad8d-fa5f14a221dc",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T16:47:13.613561Z",
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

`GET /api/rider/v1/orders/27da78d9-9975-4509-959b-a6a5b84f5f7a` → **200**

```json
{
  "id": "27da78d9-9975-4509-959b-a6a5b84f5f7a",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3cf066f9-7a60-46c6-b94f-e23ea8f4402a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T16:47:15.08888Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/27da78d9-9975-4509-959b-a6a5b84f5f7a/cancel` → **200**

```json
{
  "command_id": "6c2a1d0c-728e-418e-81e3-3168b3387123",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "27da78d9-9975-4509-959b-a6a5b84f5f7a",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3cf066f9-7a60-46c6-b94f-e23ea8f4402a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:47:15.08888Z",
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

`GET /api/rider/v1/orders/b07746e0-7703-45ce-829d-0800746df71c` → **200**

```json
{
  "id": "b07746e0-7703-45ce-829d-0800746df71c",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3cf066f9-7a60-46c6-b94f-e23ea8f4402a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T16:47:15.674896Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T19:47:15Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/b07746e0-7703-45ce-829d-0800746df71c/cancel` → **200**

```json
{
  "command_id": "ca3eb6f7-8f53-45cf-abb0-2c78c2e0d870",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b07746e0-7703-45ce-829d-0800746df71c",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "3cf066f9-7a60-46c6-b94f-e23ea8f4402a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T16:47:15.674896Z",
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
  "pickup_at": "2026-10-28T19:47:15Z",
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
  "session_id": "6a37edb5-a0fc-44a0-a8d8-99ecd760f578",
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
  "last_heartbeat_at": "2026-10-28T16:47:12.456793Z",
  "last_location_at": "2026-10-28T16:47:12.456793Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6a37edb5-a0fc-44a0-a8d8-99ecd760f578/close` → **200**

```json
{
  "command_id": "4aaae988-9865-4c43-ab2a-db8a73fb8f46",
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

Done: orders ef22b3f3-221b-4dbe-a735-cb4c92806546, 27da78d9-9975-4509-959b-a6a5b84f5f7a, b07746e0-7703-45ce-829d-0800746df71c.

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
  "session_id": "1dd7347d-28fe-4e12-a588-fff7145b3705",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY5MzksImlhdCI6MTc5MzIwNjAzOSwianRpIjoiNGRmODJiZDYtNmYxNS00ODBhLWFmZmQtMWYzNjUyNWU0MTc3Iiwic2lkIjoiMWRkNzM0N2QtMjhmZS00ZTEyLWE1ODgtZmZmNzE0NWIzNzA1In0.DkXdR9j5GL_joM3GMq9OdT9iatgSIvsRPg9pY2HrdPY",
  "access_expires_at": "2026-10-28T17:02:19.700238869Z",
  "refresh_token": "Ocx6Jgxt9XU0sxKHcmRvtvzPOqVrRWds1rEUYj0DqkY",
  "refresh_expires_at": "2026-10-29T04:47:19.699679743Z",
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
  "session_id": "0c5b093d-568b-4cfd-b458-f96ebfa0d226",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY5NDAsImlhdCI6MTc5MzIwNjA0MCwianRpIjoiZjhhYjQ4OTAtYTA5ZC00YTlhLWI1MmMtMjVhYTY1NDNjZDZmIiwic2lkIjoiMGM1YjA5M2QtNTY4Yi00Y2ZkLWI0NTgtZjk2ZWJmYTBkMjI2In0._nlHROxeCphCstzleQ_0-oweFQZOtzAjGwIqxsUbBV4",
  "access_expires_at": "2026-10-28T17:02:20.263535551Z",
  "refresh_token": "aiXizzh_Qx_CLXFB0LOB4c-NzUTgKNWlc_uG3-oh16M",
  "refresh_expires_at": "2026-10-29T04:47:20.262953942Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-1276"
}
```

```json
{
  "challenge_id": "068c834b-e859-4329-8ca4-9bb337f81640",
  "expires_at": "2026-10-28T16:52:20.538972147Z",
  "resend_available_at": "2026-10-28T16:47:21.538972147Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "650703",
  "sent_at": "2026-10-28T16:47:20.541474921Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "068c834b-e859-4329-8ca4-9bb337f81640",
  "code": "650703",
  "device_ref": "sandbox-1276"
}
```

```json
{
  "session_id": "29cefe26-8fc3-4349-a651-6126f4d78e52",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjk0MCwiaWF0IjoxNzkzMjA2MDQwLCJqdGkiOiIxZDY5OWE2Ny01YjI3LTQ2ZTAtYTIxZC0wMzBhMzNhODMxOGUiLCJzaWQiOiIyOWNlZmUyNi04ZmMzLTQzNDktYTY1MS02MTI2ZjRkNzhlNTIifQ.it5vPItZFtujAEjMN8OIllNfet0jMRxZv37vcRW4GF0",
  "access_expires_at": "2026-10-28T17:02:20.857565407Z",
  "refresh_token": "FaG7umZ0ExD9pYdzk0WMy1j0ucpa_GodvG-HGEIegkE",
  "refresh_expires_at": "2026-11-27T16:47:20.856990561Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f5767605-6f55-4c40-aed4-992e6adbf231",
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
  "last_heartbeat_at": "2026-10-28T16:46:56.693864Z",
  "last_location_at": "2026-10-28T16:46:56.693864Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f5767605-6f55-4c40-aed4-992e6adbf231/handover` → **200**

```json
{
  "command_id": "e406caaf-4a28-4cdc-aecb-50ed506279fd",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f5767605-6f55-4c40-aed4-992e6adbf231",
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
  "last_heartbeat_at": "2026-10-28T16:46:56.693864Z",
  "last_location_at": "2026-10-28T16:46:56.693864Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f5767605-6f55-4c40-aed4-992e6adbf231/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:47:21Z",
    "sequence": 1793206041689
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f5767605-6f55-4c40-aed4-992e6adbf231",
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
  "last_heartbeat_at": "2026-10-28T16:47:21.709499Z",
  "last_location_at": "2026-10-28T16:47:21.709499Z",
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
  "command_id": "e342879e-071f-4ba5-a430-8309e1ec79f8",
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
  "effective_at": "2026-10-28T16:47:22.304592Z",
  "changed_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T16:47:22.589559915Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "a28d7ebe-202f-4946-b544-1d89a2b04065",
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
  "id": "e748208c-1cfa-461c-a2b0-5c83ec3c1b1f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:52:22.876376Z",
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
  "command_id": "e6178f25-4dee-4df5-bfef-2b5bb8b19238",
  "quote_id": "e748208c-1cfa-461c-a2b0-5c83ec3c1b1f",
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
    "phone": "+380671117998"
  }
}
```

```json
{
  "id": "903899ea-989e-4994-8726-7d82b0552e75",
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
  "created_at": "2026-10-28T16:47:23.179599Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671117998"
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
    "id": "caf4447b-b75b-4213-807e-072e5e9c712a",
    "order_id": "903899ea-989e-4994-8726-7d82b0552e75",
    "expires_at": "2026-10-28T16:47:38.183186Z",
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

`POST /api/driver/v1/offers/caf4447b-b75b-4213-807e-072e5e9c712a/accept` → **200**

```json
{
  "command_id": "bbe362aa-69b6-4121-bba7-9bc02ed52e7a"
}
```

```json
{
  "id": "4d2294e7-e42a-41f4-8aa8-ebf782c49d23",
  "order_id": "903899ea-989e-4994-8726-7d82b0552e75",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "364d8403-eab5-4fe0-b9ed-3d8157e78f4d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "364d8403-eab5-4fe0-b9ed-3d8157e78f4d",
  "order_id": "903899ea-989e-4994-8726-7d82b0552e75",
  "assignment_id": "4d2294e7-e42a-41f4-8aa8-ebf782c49d23",
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
    "phone": "+380671117998"
  }
}
```

`POST /api/driver/v1/work-sessions/f5767605-6f55-4c40-aed4-992e6adbf231/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:47:24Z",
    "sequence": 1793206044303
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f5767605-6f55-4c40-aed4-992e6adbf231",
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
  "last_heartbeat_at": "2026-10-28T16:47:24.324351Z",
  "last_location_at": "2026-10-28T16:47:24.324351Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/364d8403-eab5-4fe0-b9ed-3d8157e78f4d/arrive` → **200**

```json
{
  "command_id": "e7d7c120-ecc1-410c-82e6-5b466822f0f0",
  "expected_version": 0
}
```

```json
{
  "id": "364d8403-eab5-4fe0-b9ed-3d8157e78f4d",
  "order_id": "903899ea-989e-4994-8726-7d82b0552e75",
  "assignment_id": "4d2294e7-e42a-41f4-8aa8-ebf782c49d23",
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
  "arrived_at": "2026-10-28T16:47:24.624218Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671117998"
  }
}
```

`POST /api/driver/v1/trips/364d8403-eab5-4fe0-b9ed-3d8157e78f4d/start` → **200**

```json
{
  "command_id": "51cf8d90-eed1-4817-a892-43eda3f70554",
  "expected_version": 1
}
```

```json
{
  "id": "364d8403-eab5-4fe0-b9ed-3d8157e78f4d",
  "order_id": "903899ea-989e-4994-8726-7d82b0552e75",
  "assignment_id": "4d2294e7-e42a-41f4-8aa8-ebf782c49d23",
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
  "arrived_at": "2026-10-28T16:47:24.624218Z",
  "started_at": "2026-10-28T16:47:24.920313Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671117998"
  }
}
```

`POST /api/driver/v1/trips/364d8403-eab5-4fe0-b9ed-3d8157e78f4d/complete` → **200**

```json
{
  "command_id": "518cde97-212b-4613-9b73-cb5c6571f914",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:47:25Z",
  "cash_received": true
}
```

```json
{
  "id": "364d8403-eab5-4fe0-b9ed-3d8157e78f4d",
  "order_id": "903899ea-989e-4994-8726-7d82b0552e75",
  "assignment_id": "4d2294e7-e42a-41f4-8aa8-ebf782c49d23",
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
  "arrived_at": "2026-10-28T16:47:24.624218Z",
  "started_at": "2026-10-28T16:47:24.920313Z",
  "completed_at": "2026-10-28T16:47:25.21543Z",
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
  "command_id": "f6695afe-56c8-4fe4-97d1-79770a8ffabd",
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
  "id": "72ae47a7-90c5-49fb-83aa-2bfef2c9dff8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:52:25.517012Z",
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
  "command_id": "2d357994-5336-4dd8-9759-b5ab7ebcbb26",
  "quote_id": "72ae47a7-90c5-49fb-83aa-2bfef2c9dff8",
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
    "phone": "+3806711128688"
  }
}
```

```json
{
  "id": "91f8a317-5576-4bf4-88ab-0753443b45b1",
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
  "created_at": "2026-10-28T16:47:25.813907Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711128688"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/91f8a317-5576-4bf4-88ab-0753443b45b1` → **200**

```json
{
  "id": "91f8a317-5576-4bf4-88ab-0753443b45b1",
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
  "created_at": "2026-10-28T16:47:25.813907Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711128688"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/91f8a317-5576-4bf4-88ab-0753443b45b1/cancel` → **200**

```json
{
  "command_id": "99ecd5f2-dc55-4d06-be37-bddf4f658937",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "91f8a317-5576-4bf4-88ab-0753443b45b1",
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
  "created_at": "2026-10-28T16:47:25.813907Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711128688"
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
  "staff_id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T16:47:25.220923Z",
  "last_entries": [
    {
      "order_id": "91f8a317-5576-4bf4-88ab-0753443b45b1",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T16:47:26.412616Z"
    },
    {
      "order_id": "903899ea-989e-4994-8726-7d82b0552e75",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T16:47:25.220923Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f5767605-6f55-4c40-aed4-992e6adbf231",
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
  "last_heartbeat_at": "2026-10-28T16:47:24.324351Z",
  "last_location_at": "2026-10-28T16:47:24.324351Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f5767605-6f55-4c40-aed4-992e6adbf231/close` → **200**

```json
{
  "command_id": "3f62ff57-d6ae-47d1-adb9-241a54e99448",
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

Done: operator bonus for fulfilled 903899ea-989e-4994-8726-7d82b0552e75 and operator-fault cancellation 91f8a317-5576-4bf4-88ab-0753443b45b1.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676218319",
  "device_ref": "sandbox-32028"
}
```

```json
{
  "challenge_id": "53b7ad97-a66f-4059-8738-c8ba4fe14052",
  "expires_at": "2026-10-28T16:52:29.604952313Z",
  "resend_available_at": "2026-10-28T16:47:30.604952313Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676218319` → **200**

```json
{
  "phone": "+380676218319",
  "audience": "CLIENT",
  "code": "798290",
  "sent_at": "2026-10-28T16:47:29.60749898Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676456489",
  "device_ref": "sandbox-20822",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "fb15b79d-e19b-4dbb-a1bf-3ceaffef2eb7",
  "expires_at": "2026-10-28T16:52:29.914022255Z",
  "resend_available_at": "2026-10-28T16:47:30.914022255Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676456489` → **200**

```json
{
  "phone": "+380676456489",
  "audience": "CLIENT",
  "code": "223320",
  "sent_at": "2026-10-28T16:47:29.916476987Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671180000",
  "device_ref": "sandbox-5874"
}
```

```json
{
  "challenge_id": "d6b4b26d-7ce1-47de-a7cc-bdc196ca3f75",
  "expires_at": "2026-10-28T16:52:30.225506722Z",
  "resend_available_at": "2026-10-28T16:47:31.225506722Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671180000` → **200**

```json
{
  "phone": "+380671180000",
  "audience": "CLIENT",
  "code": "765625",
  "sent_at": "2026-10-28T16:47:30.228737537Z",
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
  "session_id": "b8acd116-9c4c-4a7c-9dca-bc5c96110ba7",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY5NTAsImlhdCI6MTc5MzIwNjA1MCwianRpIjoiMGIzYWExZjgtZTMyMC00NTgzLWEyNGYtZDE0YzNhZjE0NTI0Iiwic2lkIjoiYjhhY2QxMTYtOWM0Yy00YTdjLTlkY2EtYmM1Yzk2MTEwYmE3In0.M6cBRUJJbiVPdzTUYXv8R8GWOkwhhQFfrI7tjl4GQ7Y",
  "access_expires_at": "2026-10-28T17:02:30.825707981Z",
  "refresh_token": "01YUmoUJYeq8uBuHF10dOX3fh4qN2YEJ858JIb2pef8",
  "refresh_expires_at": "2026-10-29T04:47:30.825185273Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380671180000` → **200**

```json
{
  "deliveries": [
    {
      "id": "e328bcce-32e7-4297-813c-8f6d8c08a37e",
      "challenge_id": "d6b4b26d-7ce1-47de-a7cc-bdc196ca3f75",
      "phone": "+380671180000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-0c07e451-f50a-4db9-9385-127d1da28281",
      "error": null,
      "attempted_at": "2026-10-28T16:47:30.229015Z"
    },
    {
      "id": "fbec84a2-9f67-4ad6-8d8d-8d595fef7546",
      "challenge_id": "d6b4b26d-7ce1-47de-a7cc-bdc196ca3f75",
      "phone": "+380671180000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T16:47:30.228165Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380671180000` → **200**

```json
{
  "phone": "+380671180000",
  "audience": "CLIENT",
  "code": "765625",
  "sent_at": "2026-10-28T16:47:30.228737537Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676456489` → **200**

```json
{
  "deliveries": [
    {
      "id": "a9bd0c5f-1a45-4700-be0b-315d96f0785f",
      "challenge_id": "fb15b79d-e19b-4dbb-a1bf-3ceaffef2eb7",
      "phone": "+380676456489",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-b4f63dc0-334b-424d-b30c-d8c93331aaac",
      "error": null,
      "attempted_at": "2026-10-28T16:47:29.916783Z"
    }
  ]
}
```

Done: SMS to +380676218319, a call to +380676456489, SMS then a call to +380671180000.

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
  "session_id": "a96071a5-e86d-4556-b920-e7aa8c1844ca",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY5NTIsImlhdCI6MTc5MzIwNjA1MiwianRpIjoiZGMzZjUwYTEtMTk2ZS00ZjJlLTg1Y2EtNzEyOGNiY2VmODI3Iiwic2lkIjoiYTk2MDcxYTUtZTg2ZC00NTU2LWI5MjAtZTdhYThjMTg0NGNhIn0.nLukBDQcx4-fZzoaviuZFCjPCJGxCtEL9hSgLROwCJI",
  "access_expires_at": "2026-10-28T17:02:32.020495576Z",
  "refresh_token": "sOahUG1sQ2GSoV7JV0BnepkR8-xbubfd6o-zjUMZ_CY",
  "refresh_expires_at": "2026-10-29T04:47:32.01996847Z",
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
  "session_id": "91d83720-78fb-461e-8243-98151faf13f4",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY5NTIsImlhdCI6MTc5MzIwNjA1MiwianRpIjoiMWJmY2NkODYtNzc1MC00NWRmLWIwNDktYThmODUzMjdjZWI5Iiwic2lkIjoiOTFkODM3MjAtNzhmYi00NjFlLTgyNDMtOTgxNTFmYWYxM2Y0In0.CKirNmpEbt9SVLBb8e3rEFWT-OqKjKSrHFLLcuf3O24",
  "access_expires_at": "2026-10-28T17:02:32.617367654Z",
  "refresh_token": "W1VGf0eB5qNNZO_rULHFXU_Glf9_EGrnh_NFoF-Y-bU",
  "refresh_expires_at": "2026-10-29T04:47:32.616800734Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
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

`POST /api/admin/v1/staff-extensions/e14613aa-1c2b-43d6-ba50-11f3e64e309b` → **200**

```json
{
  "command_id": "6254b6ca-4cc4-40c8-b48d-2127df583fb6",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "1f2f1dcb-1997-401b-bac9-ca1fb371e965",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T16:47:33.762589Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T16:47:33.762589Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c63a7de3-3588-4136-bc32-6b761768b958",
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
  "id": "6004a1cd-948e-49b5-a25d-242a8f451e7c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:52:34.333495Z",
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
  "command_id": "58a518bc-8545-4d34-a740-a02cd7205f5a",
  "quote_id": "6004a1cd-948e-49b5-a25d-242a8f451e7c",
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
    "phone": "+380673355411"
  }
}
```

```json
{
  "id": "9ade8141-b91f-4845-a7d9-848c7e43e7b6",
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
  "created_at": "2026-10-28T16:47:34.631569Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673355411"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/9ade8141-b91f-4845-a7d9-848c7e43e7b6/calls` → **201**

```json
{
  "command_id": "8eece50c-2a2e-4047-81eb-eeec251aeb96",
  "to": "CALLER"
}
```

```json
{
  "id": "ee1f7b36-589e-4e0e-94ce-3c2a1f0b9cab",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
  "order_ids": [
    "9ade8141-b91f-4845-a7d9-848c7e43e7b6"
  ],
  "started_at": "2026-10-28T16:47:34.948184Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/9ade8141-b91f-4845-a7d9-848c7e43e7b6/calls` → **201**

```json
{
  "command_id": "8eece50c-2a2e-4047-81eb-eeec251aeb96",
  "to": "CALLER"
}
```

```json
{
  "id": "ee1f7b36-589e-4e0e-94ce-3c2a1f0b9cab",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
  "order_ids": [
    "9ade8141-b91f-4845-a7d9-848c7e43e7b6"
  ],
  "started_at": "2026-10-28T16:47:34.948184Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "ee1f7b36-589e-4e0e-94ce-3c2a1f0b9cab",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380673355411",
    "at": "2026-10-28T16:47:34.950750139Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "ee1f7b36-589e-4e0e-94ce-3c2a1f0b9cab",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.22043",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "ee1f7b36-589e-4e0e-94ce-3c2a1f0b9cab"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "ee1f7b36-589e-4e0e-94ce-3c2a1f0b9cab",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=9ade8141-b91f-4845-a7d9-848c7e43e7b6` → **200**

```json
{
  "calls": [
    {
      "id": "ee1f7b36-589e-4e0e-94ce-3c2a1f0b9cab",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
      "order_ids": [
        "9ade8141-b91f-4845-a7d9-848c7e43e7b6"
      ],
      "started_at": "2026-10-28T16:47:34.948184Z",
      "answered_at": "2026-10-28T16:47:35.615608Z",
      "ended_at": "2026-10-28T16:47:35.640412Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=9ade8141-b91f-4845-a7d9-848c7e43e7b6` → **200**

```json
{
  "calls": [
    {
      "id": "ee1f7b36-589e-4e0e-94ce-3c2a1f0b9cab",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
      "order_ids": [
        "9ade8141-b91f-4845-a7d9-848c7e43e7b6"
      ],
      "started_at": "2026-10-28T16:47:34.948184Z",
      "answered_at": "2026-10-28T16:47:35.615608Z",
      "ended_at": "2026-10-28T16:47:35.640412Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=9ade8141-b91f-4845-a7d9-848c7e43e7b6` → **200**

```json
{
  "calls": [
    {
      "id": "ee1f7b36-589e-4e0e-94ce-3c2a1f0b9cab",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
      "order_ids": [
        "9ade8141-b91f-4845-a7d9-848c7e43e7b6"
      ],
      "started_at": "2026-10-28T16:47:34.948184Z",
      "answered_at": "2026-10-28T16:47:35.615608Z",
      "ended_at": "2026-10-28T16:47:35.640412Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=9ade8141-b91f-4845-a7d9-848c7e43e7b6` → **200**

```json
{
  "calls": [
    {
      "id": "ee1f7b36-589e-4e0e-94ce-3c2a1f0b9cab",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
      "order_ids": [
        "9ade8141-b91f-4845-a7d9-848c7e43e7b6"
      ],
      "started_at": "2026-10-28T16:47:34.948184Z",
      "answered_at": "2026-10-28T16:47:35.615608Z",
      "ended_at": "2026-10-28T16:47:35.640412Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T16:47:40.585049Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/9ade8141-b91f-4845-a7d9-848c7e43e7b6` → **200**

```json
{
  "id": "9ade8141-b91f-4845-a7d9-848c7e43e7b6",
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
  "created_at": "2026-10-28T16:47:34.631569Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673355411"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9ade8141-b91f-4845-a7d9-848c7e43e7b6/cancel` → **200**

```json
{
  "command_id": "6fa3b4d2-8fef-4d82-98d6-c4bde267d5ce",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "9ade8141-b91f-4845-a7d9-848c7e43e7b6",
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
  "created_at": "2026-10-28T16:47:34.631569Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673355411"
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
  "command_id": "868182c0-bf0a-4e3b-829e-4198dc5e5062",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T16:47:43.448999Z",
  "extension": "101"
}
```

Done: outgoing call ee1f7b36-589e-4e0e-94ce-3c2a1f0b9cab from order 9ade8141-b91f-4845-a7d9-848c7e43e7b6, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633976254",
  "device_ref": "sandbox-13836"
}
```

```json
{
  "challenge_id": "7e8ab307-c787-40bd-9354-4f4f1856f9e6",
  "expires_at": "2026-10-28T16:52:43.742743001Z",
  "resend_available_at": "2026-10-28T16:47:44.742743001Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633976254` → **200**

```json
{
  "phone": "+380633976254",
  "audience": "CLIENT",
  "code": "610345",
  "sent_at": "2026-10-28T16:47:43.745305336Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7e8ab307-c787-40bd-9354-4f4f1856f9e6",
  "code": "610345",
  "device_ref": "sandbox-13836"
}
```

```json
{
  "session_id": "61ec027f-2429-4efb-b9aa-6cd8b275a0fd",
  "subject": {
    "type": "CLIENT",
    "id": "bef5ceab-d11b-4aad-9523-5c2c41495f80"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZWY1Y2VhYi1kMTFiLTRhYWQtOTUyMy01YzJjNDE0OTVmODAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2OTY0LCJpYXQiOjE3OTMyMDYwNjQsImp0aSI6IjFmNjA5YzZiLWU2YTMtNDhhNi1iMzE5LTI5YzJkMDg1OWNhMyIsInNpZCI6IjYxZWMwMjdmLTI0MjktNGVmYi1iOWFhLTZjZDhiMjc1YTBmZCJ9.G3zb4Lde12dvK5l4byyL5exe5M50OUOn4nRFXEnVYBY",
  "access_expires_at": "2026-10-28T17:02:44.051655683Z",
  "refresh_token": "wjPhweXgtCxYQJJ_Nonkn-IgtdkT1b-66Z8sehqVBkY",
  "refresh_expires_at": "2026-11-27T16:47:44.05100206Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bef5ceab-d11b-4aad-9523-5c2c41495f80",
  "session_id": "61ec027f-2429-4efb-b9aa-6cd8b275a0fd",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633976254",
  "device_ref": "sandbox-958"
}
```

```json
{
  "challenge_id": "e0d140c1-63dc-48f8-b5ae-4c073fdd2d94",
  "expires_at": "2026-10-28T16:52:46.593718662Z",
  "resend_available_at": "2026-10-28T16:47:47.593718662Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633976254` → **200**

```json
{
  "phone": "+380633976254",
  "audience": "CLIENT",
  "code": "138434",
  "sent_at": "2026-10-28T16:47:46.596079631Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e0d140c1-63dc-48f8-b5ae-4c073fdd2d94",
  "code": "138434",
  "device_ref": "sandbox-958"
}
```

```json
{
  "session_id": "43f418b4-609c-4079-b7ee-f631ab2e9a54",
  "subject": {
    "type": "CLIENT",
    "id": "bef5ceab-d11b-4aad-9523-5c2c41495f80"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZWY1Y2VhYi1kMTFiLTRhYWQtOTUyMy01YzJjNDE0OTVmODAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2OTY2LCJpYXQiOjE3OTMyMDYwNjYsImp0aSI6IjMyNjU5MjcxLWI0MmQtNGEyNi1hYmNlLWQ3MzIxOGRhMWQ5OCIsInNpZCI6IjQzZjQxOGI0LTYwOWMtNDA3OS1iN2VlLWY2MzFhYjJlOWE1NCJ9.oFwqEng7nr-sGitxE-SU7A2V_WnRP7qvo40HEzoBvr8",
  "access_expires_at": "2026-10-28T17:02:46.912005752Z",
  "refresh_token": "7ZbaUqM92et7OciOntP0QWk2PQ9xgEg4IQcdyPL1Sko",
  "refresh_expires_at": "2026-11-27T16:47:46.911413865Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "50b84307-6e23-46da-a140-7abca9b4c8c6",
  "expires_at": "2026-10-28T16:52:49.199396174Z",
  "resend_available_at": "2026-10-28T16:47:50.199396174Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633976254` → **200**

```json
{
  "phone": "+380633976254",
  "audience": "CLIENT",
  "code": "185554",
  "sent_at": "2026-10-28T16:47:49.201697723Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380630345904"
}
```

```json
{
  "challenge_id": "8c75015e-7c02-4d02-9df1-2f99e221694f",
  "expires_at": "2026-10-28T16:52:49.496169866Z",
  "resend_available_at": "2026-10-28T16:47:50.496169866Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630345904` → **200**

```json
{
  "phone": "+380630345904",
  "audience": "CLIENT",
  "code": "320274",
  "sent_at": "2026-10-28T16:47:49.498091158Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "dd51dd56-3789-4894-b1bc-203d968164c6",
  "current_challenge_id": "50b84307-6e23-46da-a140-7abca9b4c8c6",
  "current_code": "000000",
  "new_challenge_id": "8c75015e-7c02-4d02-9df1-2f99e221694f",
  "new_code": "320274"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "702c73c1-0fbe-4555-b9ee-f300e904e660"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "fab242ab-dc8e-422b-8c02-b3401c4ea836",
  "current_challenge_id": "50b84307-6e23-46da-a140-7abca9b4c8c6",
  "current_code": "185554",
  "new_challenge_id": "8c75015e-7c02-4d02-9df1-2f99e221694f",
  "new_code": "320274"
}
```

```json
{
  "subject_id": "bef5ceab-d11b-4aad-9523-5c2c41495f80",
  "phone": "+380630345904",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bef5ceab-d11b-4aad-9523-5c2c41495f80",
  "session_id": "61ec027f-2429-4efb-b9aa-6cd8b275a0fd",
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
  "correlation_id": "7668224a-ff2d-4477-a5e3-09b1167383f7"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630345904",
  "device_ref": "sandbox-1791"
}
```

```json
{
  "challenge_id": "2d657efc-b838-4640-a96b-4424def0db80",
  "expires_at": "2026-10-28T16:52:52.941480686Z",
  "resend_available_at": "2026-10-28T16:47:53.941480686Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630345904` → **200**

```json
{
  "phone": "+380630345904",
  "audience": "CLIENT",
  "code": "763101",
  "sent_at": "2026-10-28T16:47:52.943716896Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2d657efc-b838-4640-a96b-4424def0db80",
  "code": "763101",
  "device_ref": "sandbox-1791"
}
```

```json
{
  "session_id": "51ff6527-b7e0-4f63-94c8-343015ae3856",
  "subject": {
    "type": "CLIENT",
    "id": "bef5ceab-d11b-4aad-9523-5c2c41495f80"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZWY1Y2VhYi1kMTFiLTRhYWQtOTUyMy01YzJjNDE0OTVmODAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2OTczLCJpYXQiOjE3OTMyMDYwNzMsImp0aSI6IjJhNzQ4NDc5LTc1MTUtNDYyOC04MjNhLTFjNDdiMTg0YTJhZCIsInNpZCI6IjUxZmY2NTI3LWI3ZTAtNGY2My05NGM4LTM0MzAxNWFlMzg1NiJ9.jUyTCHz-G3zKQu9d6Pqqv3iXyb5ls4l-STU8jzOXBxE",
  "access_expires_at": "2026-10-28T17:02:53.241499555Z",
  "refresh_token": "bStPHP_50vzLkBQtnHPOUD7fFmy2fYVW0HUskV16wgE",
  "refresh_expires_at": "2026-11-27T16:47:53.240945007Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bef5ceab-d11b-4aad-9523-5c2c41495f80",
  "session_id": "51ff6527-b7e0-4f63-94c8-343015ae3856",
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
  "session_id": "c4716a13-8dc9-4339-b006-7d8d553af39c",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY5NzQsImlhdCI6MTc5MzIwNjA3NCwianRpIjoiZjdiZmM0OGEtZmQ5NC00YTljLWExZmUtZWFhMWVlZTBlZGZhIiwic2lkIjoiYzQ3MTZhMTMtOGRjOS00MzM5LWIwMDYtN2Q4ZDU1M2FmMzljIn0.IOs6omzxM3sX4mWHzP_6Wr4FbLtx3JyQoP0-ZqIIYrA",
  "access_expires_at": "2026-10-28T17:02:54.079333555Z",
  "refresh_token": "9QoAa6ZTlVpA7lfT2UXKj0UzgQXIY_Wj3tt9LOeZ76Q",
  "refresh_expires_at": "2026-10-29T04:47:54.078793957Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/bef5ceab-d11b-4aad-9523-5c2c41495f80` → **200**

```json
{
  "client": {
    "id": "bef5ceab-d11b-4aad-9523-5c2c41495f80",
    "phone": "+380630345904",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T16:47:44.048942Z",
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

`POST /api/admin/v1/clients/bef5ceab-d11b-4aad-9523-5c2c41495f80/phone` → **400**

```json
{
  "command_id": "753966e5-b997-474c-ba4f-0501bbbcd06c",
  "expected_version": 3,
  "phone": "+380630799188",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/bef5ceab-d11b-4aad-9523-5c2c41495f80/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "3c97e4ae-4cb5-4cf8-b934-0f7101566214",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/bef5ceab-d11b-4aad-9523-5c2c41495f80/phone` → **200**

```json
{
  "command_id": "ce6cee9b-aea7-4b62-a314-04f2691cc564",
  "expected_version": 3,
  "phone": "+380630799188",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "bef5ceab-d11b-4aad-9523-5c2c41495f80",
  "phone": "+380630799188",
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
  "correlation_id": "9ce1e869-90f3-45dc-a485-bae1fcc60b44"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630799188",
  "device_ref": "sandbox-30796"
}
```

```json
{
  "challenge_id": "820c159e-2d42-411f-8126-6b6260bb2884",
  "expires_at": "2026-10-28T16:52:55.548551162Z",
  "resend_available_at": "2026-10-28T16:47:56.548551162Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630799188` → **200**

```json
{
  "phone": "+380630799188",
  "audience": "CLIENT",
  "code": "055220",
  "sent_at": "2026-10-28T16:47:55.551051405Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "820c159e-2d42-411f-8126-6b6260bb2884",
  "code": "055220",
  "device_ref": "sandbox-30796"
}
```

```json
{
  "session_id": "ceea1507-c3c5-4fcb-b616-aa4c85b3acb1",
  "subject": {
    "type": "CLIENT",
    "id": "bef5ceab-d11b-4aad-9523-5c2c41495f80"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZWY1Y2VhYi1kMTFiLTRhYWQtOTUyMy01YzJjNDE0OTVmODAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2OTc1LCJpYXQiOjE3OTMyMDYwNzUsImp0aSI6IjdmODI4MjgwLWFkOTItNDdhNS1iMDY0LThkNjE4NzEzZGMyOCIsInNpZCI6ImNlZWExNTA3LWMzYzUtNGZjYi1iNjE2LWFhNGM4NWIzYWNiMSJ9.Iykxk0QsKjIm3MroToj1e-z220bf_QtNu-7uqmyiiTs",
  "access_expires_at": "2026-10-28T17:02:55.848804321Z",
  "refresh_token": "F-hyq6jcwz4JKRwKU5hgTgUTxU-LaAsNp2gDf_VsPOE",
  "refresh_expires_at": "2026-11-27T16:47:55.848243643Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bef5ceab-d11b-4aad-9523-5c2c41495f80",
  "session_id": "ceea1507-c3c5-4fcb-b616-aa4c85b3acb1",
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
  "phone": "+380638434804",
  "device_ref": "sandbox-2622"
}
```

```json
{
  "challenge_id": "89e28ec3-60dd-4eb8-8b0f-e9e2f2cabc51",
  "expires_at": "2026-10-28T16:52:56.417952104Z",
  "resend_available_at": "2026-10-28T16:47:57.417952104Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638434804` → **200**

```json
{
  "phone": "+380638434804",
  "audience": "CLIENT",
  "code": "407834",
  "sent_at": "2026-10-28T16:47:56.420500207Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "89e28ec3-60dd-4eb8-8b0f-e9e2f2cabc51",
  "code": "407834",
  "device_ref": "sandbox-2622"
}
```

```json
{
  "session_id": "587a075d-5f57-4b8b-b935-1ccf55c66f9d",
  "subject": {
    "type": "CLIENT",
    "id": "b02ef9d7-4f8a-45af-85bb-79a337158a6d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMDJlZjlkNy00ZjhhLTQ1YWYtODViYi03OWEzMzcxNThhNmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2OTc2LCJpYXQiOjE3OTMyMDYwNzYsImp0aSI6IjRhY2E2MzM4LWRiZWMtNDcxNS1iNzYxLTE2YmZjZTM2M2VlZiIsInNpZCI6IjU4N2EwNzVkLTVmNTctNGI4Yi1iOTM1LTFjY2Y1NWM2NmY5ZCJ9.h8RbN2C-w6-3wYL_suqlEH4kvfAYELlHfAEygVeGZp8",
  "access_expires_at": "2026-10-28T17:02:56.727016728Z",
  "refresh_token": "eCP6itLSg46bE2Q3dIukwapjBFAsde9_lOXDEC3Egwc",
  "refresh_expires_at": "2026-11-27T16:47:56.725982593Z",
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
  "session_id": "1849ac2e-d3be-4bca-9b01-1450a08e5bf7",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY5NzcsImlhdCI6MTc5MzIwNjA3NywianRpIjoiNTY3NWRiYmMtZmUzNS00YTkwLWJmMzctOGY3NjZjMDg4NTBjIiwic2lkIjoiMTg0OWFjMmUtZDNiZS00YmNhLTliMDEtMTQ1MGEwOGU1YmY3In0.j_dkcpIB2F_fH1eltA-f7JNi1guiXKBZNAO0I2smGUI",
  "access_expires_at": "2026-10-28T17:02:57.915498191Z",
  "refresh_token": "x_E2QeelDeweJMgH9BuVY4P1DVY_-_R2BabsQGdOktE",
  "refresh_expires_at": "2026-10-29T04:47:57.914874254Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380638434804` → **200**

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
  "correlation_id": "de748d63-dfce-4a37-82b0-9cc1e18c1c33"
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
  "session_id": "24777f0c-3e69-4b11-9409-107038220a6f",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY5NzksImlhdCI6MTc5MzIwNjA3OSwianRpIjoiZmFmMzEwYjktYjYzMC00MjU2LWE2MjQtMWYxNzVkZTI2M2E0Iiwic2lkIjoiMjQ3NzdmMGMtM2U2OS00YjExLTk0MDktMTA3MDM4MjIwYTZmIn0.6xklHCnVR-084Ac5I89THQBZ1ZIbQfRQE9IFR2AR6xQ",
  "access_expires_at": "2026-10-28T17:02:59.067459783Z",
  "refresh_token": "hOlpEV3r3MJcVvowtHKmcaJ43CzR7hhItAPET3U0_Ug",
  "refresh_expires_at": "2026-10-29T04:47:59.066726292Z",
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
  "changed_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
  "reason": "Sandbox clean-up",
  "changed_at": "2026-10-28T16:45:03.518293Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "329b34b0-b63e-4682-b8d0-b129282a779c",
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
  "changed_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T16:47:59.635956853Z"
}
```

## The rider books the airport for 2026-10-28T19:47:58Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600348626",
  "device_ref": "sandbox-19692"
}
```

```json
{
  "challenge_id": "762f476b-9a81-47e1-9ec3-c8958d80b57c",
  "expires_at": "2026-10-28T16:52:59.933555976Z",
  "resend_available_at": "2026-10-28T16:48:00.933555976Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600348626` → **200**

```json
{
  "phone": "+48600348626",
  "audience": "CLIENT",
  "code": "517441",
  "sent_at": "2026-10-28T16:47:59.935969662Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "762f476b-9a81-47e1-9ec3-c8958d80b57c",
  "code": "517441",
  "device_ref": "sandbox-19692"
}
```

```json
{
  "session_id": "2d5cc5c1-49f4-456d-839d-385ae8815816",
  "subject": {
    "type": "CLIENT",
    "id": "433111aa-8c12-4344-8054-b2532735d8f7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzMxMTFhYS04YzEyLTQzNDQtODA1NC1iMjUzMjczNWQ4ZjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2OTgwLCJpYXQiOjE3OTMyMDYwODAsImp0aSI6IjY4NGYzNGU1LTNmN2QtNGQ3Yy04ZWE2LWE0MzNlYzM1OTIyZCIsInNpZCI6IjJkNWNjNWMxLTQ5ZjQtNDU2ZC04MzlkLTM4NWFlODgxNTgxNiJ9.-M2eb4kg95lyNM1egyqGw-t47relEfe7zAWApQUpuTM",
  "access_expires_at": "2026-10-28T17:03:00.255910608Z",
  "refresh_token": "GvXvFx2iemJ3ynaQNYf4XugbWkuvpI2nWkLcO-8Jt2s",
  "refresh_expires_at": "2026-11-27T16:48:00.255218403Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "26bcfa3f-62f2-4fc2-8254-1e58bb7b518c",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T19:47:58Z"
}
```

```json
{
  "id": "75f9b921-2406-4f76-a4f4-63b78b88d247",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:53:00.536085Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T19:47:58Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c1244bfe-9749-4fc3-a4d9-d2e8e5c2df83",
  "quote_id": "75f9b921-2406-4f76-a4f4-63b78b88d247",
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
  "pickup_at": "2026-10-28T19:47:58Z"
}
```

```json
{
  "id": "d15e8af9-c181-47bf-bc04-1ca0a9c86c85",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "433111aa-8c12-4344-8054-b2532735d8f7",
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
  "created_at": "2026-10-28T16:48:00.827883Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T19:47:58Z",
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
  "device_ref": "sandbox-17087"
}
```

```json
{
  "challenge_id": "bcf860a4-493c-4b11-899f-c709db461355",
  "expires_at": "2026-10-28T16:53:01.124327907Z",
  "resend_available_at": "2026-10-28T16:48:02.124327907Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "561440",
  "sent_at": "2026-10-28T16:48:01.127003138Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bcf860a4-493c-4b11-899f-c709db461355",
  "code": "561440",
  "device_ref": "sandbox-17087"
}
```

```json
{
  "session_id": "0660e12b-af7a-4426-988d-6e6543e8cf90",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjk4MSwiaWF0IjoxNzkzMjA2MDgxLCJqdGkiOiJlNGM1YzZlYi02ZTBkLTQ1NzAtYjNhOC01ZWNhNjNjNzJlYjkiLCJzaWQiOiIwNjYwZTEyYi1hZjdhLTQ0MjYtOTg4ZC02ZTY1NDNlOGNmOTAifQ.9Yz4QybV816ly2LARf7cjMJJ2-uhfV-QtnU7oeJ9S7M",
  "access_expires_at": "2026-10-28T17:03:01.431171287Z",
  "refresh_token": "yHiOiWj788YQ9Vpd4s51I27YLzOvd5f3mIXuMv1n_ug",
  "refresh_expires_at": "2026-11-27T16:48:01.430279468Z",
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
  "command_id": "67374039-0866-498e-806e-f6c6152a6254",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:48:01Z",
    "sequence": 1793206081989
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "9d45f84e-16f9-475d-be47-249ee7714822",
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
  "last_heartbeat_at": "2026-10-28T16:48:02.010512Z",
  "last_location_at": "2026-10-28T16:48:02.010512Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "d15e8af9-c181-47bf-bc04-1ca0a9c86c85",
      "short_number": 18,
      "pickup_at": "2026-10-28T19:47:58Z",
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

`POST /api/driver/v1/preorders/d15e8af9-c181-47bf-bc04-1ca0a9c86c85/reserve` → **200**

```json
{
  "command_id": "00d9af90-ce81-4055-9ee6-9a651ef76449"
}
```

```json
{
  "id": "8b394e87-7652-4458-a761-01ca3bb0b044",
  "state": "RESERVED",
  "order": {
    "order_id": "d15e8af9-c181-47bf-bc04-1ca0a9c86c85",
    "short_number": 18,
    "pickup_at": "2026-10-28T19:47:58Z",
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
  "reserved_at": "2026-10-28T16:48:02.604814Z",
  "confirm_from": "2026-10-28T19:17:58Z",
  "confirm_until": "2026-10-28T19:27:58Z",
  "drop_until": "2026-10-28T18:47:58Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "8b394e87-7652-4458-a761-01ca3bb0b044",
      "state": "RESERVED",
      "order": {
        "order_id": "d15e8af9-c181-47bf-bc04-1ca0a9c86c85",
        "short_number": 18,
        "pickup_at": "2026-10-28T19:47:58Z",
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
      "reserved_at": "2026-10-28T16:48:02.604814Z",
      "confirm_from": "2026-10-28T19:17:58Z",
      "confirm_until": "2026-10-28T19:27:58Z",
      "drop_until": "2026-10-28T18:47:58Z"
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
      "id": "8b394e87-7652-4458-a761-01ca3bb0b044",
      "state": "RESERVED",
      "order": {
        "order_id": "d15e8af9-c181-47bf-bc04-1ca0a9c86c85",
        "short_number": 18,
        "pickup_at": "2026-10-28T19:47:58Z",
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
      "reserved_at": "2026-10-28T16:48:02.604814Z",
      "confirm_from": "2026-10-28T19:17:58Z",
      "confirm_until": "2026-10-28T19:27:58Z",
      "drop_until": "2026-10-28T18:47:58Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/8b394e87-7652-4458-a761-01ca3bb0b044/confirm` → **409**

```json
{
  "command_id": "778ff07c-8419-4000-8a01-0c4e549e3dea"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/8b394e87-7652-4458-a761-01ca3bb0b044/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "af52307f-7d9b-448f-8193-e5e3dea1765e"
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
  "session_id": "c9d9f5aa-79e2-431f-9c61-40a1747d149a",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY5ODQsImlhdCI6MTc5MzIwNjA4NCwianRpIjoiNjk2ODFlNjItYTI4Ny00NzgxLWExZDQtNmY2YjU3ZTQxMzUzIiwic2lkIjoiYzlkOWY1YWEtNzllMi00MzFmLTljNjEtNDBhMTc0N2QxNDlhIn0.dXHubhuQhov0AHd5Gcs4cbsk4wk1hjf43A3EXosA3Fs",
  "access_expires_at": "2026-10-28T17:03:04.131278396Z",
  "refresh_token": "VPbcPsL1jyKo9H9joR5FZuB3Q2Ia7nbf2BGhyvuJJWA",
  "refresh_expires_at": "2026-10-29T04:48:04.130658724Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d15e8af9-c181-47bf-bc04-1ca0a9c86c85` → **200**

```json
{
  "id": "d15e8af9-c181-47bf-bc04-1ca0a9c86c85",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "433111aa-8c12-4344-8054-b2532735d8f7",
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
  "created_at": "2026-10-28T16:48:00.827883Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T19:47:58Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "8b394e87-7652-4458-a761-01ca3bb0b044",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T16:48:02.604814Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/d15e8af9-c181-47bf-bc04-1ca0a9c86c85/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T16:48:00.829473Z",
      "actor": {
        "type": "CLIENT",
        "id": "433111aa-8c12-4344-8054-b2532735d8f7",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "d15e8af9-c181-47bf-bc04-1ca0a9c86c85",
        "preorder": true,
        "quote_id": "75f9b921-2406-4f76-a4f4-63b78b88d247",
        "pickup_at": "2026-10-28T19:47:58Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "7d20b7ff-2c13-402a-883c-bf15e64b49ab"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T16:48:02.606116Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d15e8af9-c181-47bf-bc04-1ca0a9c86c85",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "8b394e87-7652-4458-a761-01ca3bb0b044"
      },
      "correlation_id": "560cf78c-bba0-4473-983b-8c495833891a"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order d15e8af9-c181-47bf-bc04-1ca0a9c86c85, reservation 8b394e87-7652-4458-a761-01ca3bb0b044.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-5580"
}
```

```json
{
  "challenge_id": "80a19156-34c0-4811-bf7f-b76d43188a32",
  "expires_at": "2026-10-28T16:53:05.006669601Z",
  "resend_available_at": "2026-10-28T16:48:06.006669601Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "443280",
  "sent_at": "2026-10-28T16:48:05.009202498Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "80a19156-34c0-4811-bf7f-b76d43188a32",
  "code": "443280",
  "device_ref": "sandbox-5580"
}
```

```json
{
  "session_id": "80dd3b76-f682-4ed8-83f7-a8b40549f679",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjk4NSwiaWF0IjoxNzkzMjA2MDg1LCJqdGkiOiJmMDk1NWU1Ny03YzY4LTQ3MWEtOTJkZC0wMjdhOTdjNjE4MWYiLCJzaWQiOiI4MGRkM2I3Ni1mNjgyLTRlZDgtODNmNy1hOGI0MDU0OWY2NzkifQ.qONEd9ot3Phy_1u5t30ygyRoZfgib_T5YqNkW2kxOAE",
  "access_expires_at": "2026-10-28T17:03:05.310435976Z",
  "refresh_token": "XXNNcTCqWL2T6JCzM-dJGkbPuI3yeTd-vQa9ABgEUtY",
  "refresh_expires_at": "2026-11-27T16:48:05.309921623Z",
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
  "command_id": "25928d4e-418a-431a-ab9a-d1433cbc51e2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:48:05Z",
    "sequence": 1793206085851
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fe1b20ab-e8e5-4164-a535-38bf54038cd0",
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
  "last_heartbeat_at": "2026-10-28T16:48:05.870461Z",
  "last_location_at": "2026-10-28T16:48:05.870461Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675298260",
  "device_ref": "sandbox-11814"
}
```

```json
{
  "challenge_id": "3a3b003f-950a-469c-a85e-227374a827b7",
  "expires_at": "2026-10-28T16:53:06.142461647Z",
  "resend_available_at": "2026-10-28T16:48:07.142461647Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675298260` → **200**

```json
{
  "phone": "+380675298260",
  "audience": "CLIENT",
  "code": "170770",
  "sent_at": "2026-10-28T16:48:06.144881595Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3a3b003f-950a-469c-a85e-227374a827b7",
  "code": "170770",
  "device_ref": "sandbox-11814"
}
```

```json
{
  "session_id": "27fa9347-6939-4d89-9452-8c59879f9d21",
  "subject": {
    "type": "CLIENT",
    "id": "581120be-8067-4862-b769-ea907739a794"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ODExMjBiZS04MDY3LTQ4NjItYjc2OS1lYTkwNzczOWE3OTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2OTg2LCJpYXQiOjE3OTMyMDYwODYsImp0aSI6IjRiMzEwZWRmLWFhY2UtNDU1Yy04OTBjLTRjZjBkOTQ2YWQ1MiIsInNpZCI6IjI3ZmE5MzQ3LTY5MzktNGQ4OS05NDUyLThjNTk4NzlmOWQyMSJ9.D5YL9badoRNC1vb1pNcomgs89umqNsSazcoccLdjibM",
  "access_expires_at": "2026-10-28T17:03:06.438924387Z",
  "refresh_token": "rzBx2ciB623w_0cC1qtjhU-rV4TGiRYYmIJ1Hurx-p8",
  "refresh_expires_at": "2026-11-27T16:48:06.438347229Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9f9559a7-d6de-411b-99f5-ba5cd859faa9",
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
  "id": "66afb50f-021d-41be-8c40-e7c31f38ceb8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:53:06.724218Z",
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
  "command_id": "d020fadb-51b7-4b8f-ba6d-d1e42ed46293",
  "quote_id": "66afb50f-021d-41be-8c40-e7c31f38ceb8",
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
  "id": "0ecd426c-2a09-48cb-819e-8d933412de76",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "581120be-8067-4862-b769-ea907739a794",
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
  "created_at": "2026-10-28T16:48:07.01833Z",
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
    "id": "8f9767c3-6f76-4b1f-9125-af21207049ec",
    "order_id": "0ecd426c-2a09-48cb-819e-8d933412de76",
    "expires_at": "2026-10-28T16:48:22.02175Z",
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

`POST /api/driver/v1/offers/8f9767c3-6f76-4b1f-9125-af21207049ec/accept` → **200**

```json
{
  "command_id": "4e633e96-e3ae-4697-b46b-ed5ea990e871"
}
```

```json
{
  "id": "f1ab9243-b9b5-456b-9ade-8535df040947",
  "order_id": "0ecd426c-2a09-48cb-819e-8d933412de76",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e7212471-4d46-4e3e-8737-b9608c099efc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e7212471-4d46-4e3e-8737-b9608c099efc",
  "order_id": "0ecd426c-2a09-48cb-819e-8d933412de76",
  "assignment_id": "f1ab9243-b9b5-456b-9ade-8535df040947",
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

`POST /api/driver/v1/work-sessions/fe1b20ab-e8e5-4164-a535-38bf54038cd0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:48:08Z",
    "sequence": 1793206088160
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fe1b20ab-e8e5-4164-a535-38bf54038cd0",
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
  "last_heartbeat_at": "2026-10-28T16:48:08.181413Z",
  "last_location_at": "2026-10-28T16:48:08.181413Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e7212471-4d46-4e3e-8737-b9608c099efc",
  "order_id": "0ecd426c-2a09-48cb-819e-8d933412de76",
  "assignment_id": "f1ab9243-b9b5-456b-9ade-8535df040947",
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

`POST /api/driver/v1/trips/e7212471-4d46-4e3e-8737-b9608c099efc/arrive` → **200**

```json
{
  "command_id": "a82971a1-0e8a-4693-93f7-40b05cdbf88c",
  "expected_version": 0
}
```

```json
{
  "id": "e7212471-4d46-4e3e-8737-b9608c099efc",
  "order_id": "0ecd426c-2a09-48cb-819e-8d933412de76",
  "assignment_id": "f1ab9243-b9b5-456b-9ade-8535df040947",
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
  "arrived_at": "2026-10-28T16:48:08.730221Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e7212471-4d46-4e3e-8737-b9608c099efc/start` → **200**

```json
{
  "command_id": "ea7b4cfb-8bf9-49ed-a8ea-b05201bb47b5",
  "expected_version": 1
}
```

```json
{
  "id": "e7212471-4d46-4e3e-8737-b9608c099efc",
  "order_id": "0ecd426c-2a09-48cb-819e-8d933412de76",
  "assignment_id": "f1ab9243-b9b5-456b-9ade-8535df040947",
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
  "arrived_at": "2026-10-28T16:48:08.730221Z",
  "started_at": "2026-10-28T16:48:09.021932Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/fe1b20ab-e8e5-4164-a535-38bf54038cd0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:48:09Z",
    "sequence": 1793206089295
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fe1b20ab-e8e5-4164-a535-38bf54038cd0",
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
  "last_heartbeat_at": "2026-10-28T16:48:09.315949Z",
  "last_location_at": "2026-10-28T16:48:09.315949Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/e7212471-4d46-4e3e-8737-b9608c099efc/complete` → **200**

```json
{
  "command_id": "62a71aaf-7308-4b40-ac8a-f9f61d35de62",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:48:09Z",
  "cash_received": true
}
```

```json
{
  "id": "e7212471-4d46-4e3e-8737-b9608c099efc",
  "order_id": "0ecd426c-2a09-48cb-819e-8d933412de76",
  "assignment_id": "f1ab9243-b9b5-456b-9ade-8535df040947",
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
  "arrived_at": "2026-10-28T16:48:08.730221Z",
  "started_at": "2026-10-28T16:48:09.021932Z",
  "completed_at": "2026-10-28T16:48:09.598929Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/0ecd426c-2a09-48cb-819e-8d933412de76/rating` → **200**

```json
{
  "command_id": "7d4cac32-9633-4c25-84e5-ca652683aebb",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "0ecd426c-2a09-48cb-819e-8d933412de76",
  "score": 5,
  "created_at": "2026-10-28T16:48:09.908621083Z"
}
```

`POST /api/driver/v1/orders/0ecd426c-2a09-48cb-819e-8d933412de76/rating` → **200**

```json
{
  "command_id": "4184d92f-39c4-480f-9d04-6423aef70fb3",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "0ecd426c-2a09-48cb-819e-8d933412de76",
  "score": 4,
  "created_at": "2026-10-28T16:48:10.199600447Z"
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
  "session_id": "e1c4241f-3fd3-4375-bf6d-ae66cd9a6d88",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY5OTEsImlhdCI6MTc5MzIwNjA5MSwianRpIjoiYjAwZDQxOTQtNWE3NS00ODg2LTk5YTUtZDI5YmVjOTg4ODkwIiwic2lkIjoiZTFjNDI0MWYtM2ZkMy00Mzc1LWJmNmQtYWU2NmNkOWE2ZDg4In0.fktTzkFto8VU3rugBlGDdbXvqNnbi21V3wijzEMprqk",
  "access_expires_at": "2026-10-28T17:03:11.052975457Z",
  "refresh_token": "ct6CiEk6tK8-dO7PONsNnFwzkcsoFBKEOofoCWzKAUo",
  "refresh_expires_at": "2026-10-29T04:48:11.052412274Z",
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
  "session_id": "939dcc65-0696-4db0-a40a-a7aaeefc8133",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY5OTEsImlhdCI6MTc5MzIwNjA5MSwianRpIjoiZjE1YWNkNjAtYmJiNS00OWEwLTgzYjUtMTZmZGViYTBiMjg0Iiwic2lkIjoiOTM5ZGNjNjUtMDY5Ni00ZGIwLWE0MGEtYTdhYWVlZmM4MTMzIn0.w9w-lYyJYYvfdODDdiuSZxhneJKl-_J4z1AUCKrBQPs",
  "access_expires_at": "2026-10-28T17:03:11.621745951Z",
  "refresh_token": "IZm3gxQSwIq-PFj-iL_4IySnBMkbZEitvxpjhgXLvHc",
  "refresh_expires_at": "2026-10-29T04:48:11.621218564Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/0ecd426c-2a09-48cb-819e-8d933412de76/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "0ecd426c-2a09-48cb-819e-8d933412de76",
      "author_type": "RIDER",
      "author_id": "581120be-8067-4862-b769-ea907739a794",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T16:48:09.908621Z"
    },
    {
      "order_id": "0ecd426c-2a09-48cb-819e-8d933412de76",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "581120be-8067-4862-b769-ea907739a794",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T16:48:10.1996Z"
    }
  ]
}
```

Done: ratings for order 0ecd426c-2a09-48cb-819e-8d933412de76.

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
  "session_id": "0309adab-cd28-4b28-9c6f-546ccc54dfda",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY5OTIsImlhdCI6MTc5MzIwNjA5MiwianRpIjoiOWQzMzY3ODYtMjFjNC00ZDYyLWJhYmEtMGE0MmRmN2JjZWZiIiwic2lkIjoiMDMwOWFkYWItY2QyOC00YjI4LTljNmYtNTQ2Y2NjNTRkZmRhIn0.NcyTxO4EDWhh6WCdGR2o-pK_Vda7D05YOkBsdPzsiLc",
  "access_expires_at": "2026-10-28T17:03:12.487628883Z",
  "refresh_token": "zZmYPUqWCz_J7-jskB3MpDmNVWRcs4qs0UXoLNeKb5A",
  "refresh_expires_at": "2026-10-29T04:48:12.487073434Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "501e2559-cbfb-4f27-8a40-9e82169e486c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "0449e7c4-6865-4517-96ad-ba65cd7fb119",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:48:12.788743Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0449e7c4-6865-4517-96ad-ba65cd7fb119` → **200**

```json
{
  "id": "0449e7c4-6865-4517-96ad-ba65cd7fb119",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:48:12.788743Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0449e7c4-6865-4517-96ad-ba65cd7fb119` → **200**

```json
{
  "id": "0449e7c4-6865-4517-96ad-ba65cd7fb119",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:48:12.788743Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0449e7c4-6865-4517-96ad-ba65cd7fb119` → **200**

```json
{
  "id": "0449e7c4-6865-4517-96ad-ba65cd7fb119",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T16:48:12.788743Z",
  "ready_at": "2026-10-28T16:48:15.629513Z",
  "expires_at": "2026-10-29T16:48:15.629513Z"
}
```

`GET /api/admin/v1/reports/exports/0449e7c4-6865-4517-96ad-ba65cd7fb119/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
total,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "5aa919d5-0768-44bf-b7ab-6fd0328f90ba",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "bbf8159c-9609-4217-b5f3-b1ec6ba7c39b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:48:15.986064Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/bbf8159c-9609-4217-b5f3-b1ec6ba7c39b` → **200**

```json
{
  "id": "bbf8159c-9609-4217-b5f3-b1ec6ba7c39b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:48:15.986064Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/bbf8159c-9609-4217-b5f3-b1ec6ba7c39b` → **200**

```json
{
  "id": "bbf8159c-9609-4217-b5f3-b1ec6ba7c39b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:48:15.986064Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/bbf8159c-9609-4217-b5f3-b1ec6ba7c39b` → **200**

```json
{
  "id": "bbf8159c-9609-4217-b5f3-b1ec6ba7c39b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:48:15.986064Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/bbf8159c-9609-4217-b5f3-b1ec6ba7c39b` → **200**

```json
{
  "id": "bbf8159c-9609-4217-b5f3-b1ec6ba7c39b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:48:15.986064Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/bbf8159c-9609-4217-b5f3-b1ec6ba7c39b` → **200**

```json
{
  "id": "bbf8159c-9609-4217-b5f3-b1ec6ba7c39b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T16:48:15.986064Z",
  "ready_at": "2026-10-28T16:48:20.63767Z",
  "expires_at": "2026-10-29T16:48:20.63767Z"
}
```

`GET /api/admin/v1/reports/exports/bbf8159c-9609-4217-b5f3-b1ec6ba7c39b/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/50782dc0-c736-42f3-adb4-6c590a4b6122` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/50782dc0-c736-42f3-adb4-6c590a4b6122",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5f325df6-a26d-46c9-b4d8-9271811bf4ac"
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
  "device_ref": "sandbox-20083"
}
```

```json
{
  "challenge_id": "30d46ffb-b6e2-49e4-a097-ab3dd97ce2ae",
  "expires_at": "2026-10-28T16:53:21.965459564Z",
  "resend_available_at": "2026-10-28T16:48:22.965459564Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "405053",
  "sent_at": "2026-10-28T16:48:21.967983082Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "30d46ffb-b6e2-49e4-a097-ab3dd97ce2ae",
  "code": "405053",
  "device_ref": "sandbox-20083"
}
```

```json
{
  "session_id": "0db06dc4-b4ea-4bd8-8c92-0e253468f940",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNzAwMiwiaWF0IjoxNzkzMjA2MTAyLCJqdGkiOiIxMWExNTUyNS0yYWI1LTQ2YjUtOTM4MS00OTBlZjAwMzk1OGIiLCJzaWQiOiIwZGIwNmRjNC1iNGVhLTRiZDgtOGM5Mi0wZTI1MzQ2OGY5NDAifQ.EL_L9QMtd2HUjdi0EL2xfAvA3bJWKPI_yrbR4ZlcluM",
  "access_expires_at": "2026-10-28T17:03:22.269652812Z",
  "refresh_token": "UaxdA_-ZkauarfLMhUbkgRMX4nUBu1zB-H18i3fdfI4",
  "refresh_expires_at": "2026-11-27T16:48:22.268992446Z",
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
  "command_id": "7819e9cd-4060-47f6-8071-b589676d771b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:48:23Z",
    "sequence": 1793206103103
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "76cf7007-5515-489f-ad23-e3b992a561a5",
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
  "last_heartbeat_at": "2026-10-28T16:48:23.123268Z",
  "last_location_at": "2026-10-28T16:48:23.123268Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "9fd20eb7-62d7-4547-a8af-77dbe1685a26",
  "points": [
    {
      "sequence": 1793206105405,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T16:47:25Z"
    },
    {
      "sequence": 1793206105413,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T16:48:25Z"
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
  "session_id": "b79ecd1f-9b5b-4530-ba06-032aeeffc51e",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcwMDYsImlhdCI6MTc5MzIwNjEwNiwianRpIjoiYTQ2MzI0NDUtYTVlMi00Zjk5LTg4ZGEtNzAwYTg3NjE4YTEzIiwic2lkIjoiYjc5ZWNkMWYtOWI1Yi00NTMwLWJhMDYtMDMyYWVlZmZjNTFlIn0.DTu7l1DIyk-tzWdmYYDtFLsZ6tFbhUakiKZSPOgBUBg",
  "access_expires_at": "2026-10-28T17:03:26.037605743Z",
  "refresh_token": "B7rGVDNWRaC6-2Akjwnq226CQLWDlKB1ImUVGuqOTs4",
  "refresh_expires_at": "2026-10-29T04:48:26.036958575Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "df826fe2-15ff-4baa-ad74-b41b7f3b8048",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T16:48:25Z",
        "track_point_id": "b3895a22-86c5-453a-a7b2-1f31d3ff0380",
        "work_session_id": "76cf7007-5515-489f-ad23-e3b992a561a5"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T16:48:25Z",
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

`POST /api/admin/v1/driver-risk-flags/df826fe2-15ff-4baa-ad74-b41b7f3b8048/confirm` → **200**

```json
{
  "command_id": "fad1ce8d-abce-464c-a9ca-ec7ec3f37055",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "df826fe2-15ff-4baa-ad74-b41b7f3b8048",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T16:48:25Z",
    "track_point_id": "b3895a22-86c5-453a-a7b2-1f31d3ff0380",
    "work_session_id": "76cf7007-5515-489f-ad23-e3b992a561a5"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T16:48:25Z",
  "reason": null,
  "reviewed_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
  "reviewed_at": "2026-10-28T16:48:26.926977Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/df826fe2-15ff-4baa-ad74-b41b7f3b8048/dismiss` → **409**

```json
{
  "command_id": "1c93e2ae-e0ce-4e56-b8c3-7b9637073497",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/df826fe2-15ff-4baa-ad74-b41b7f3b8048/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "0ce5842b-a5b9-4885-8b5e-5a2775504ab5"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "f0fca434-4bf4-4f4a-9b4a-ec1dd3a3bf2e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "5891d7f8-775f-46d4-80ec-e55cad36c606",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
  "raised_at": "2026-10-28T16:48:27.502705Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/5891d7f8-775f-46d4-80ec-e55cad36c606/dismiss` → **200**

```json
{
  "command_id": "c02e7521-8035-4c2a-ac32-9498a1b57f77",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "5891d7f8-775f-46d4-80ec-e55cad36c606",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
  "raised_at": "2026-10-28T16:48:27.502705Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
  "reviewed_at": "2026-10-28T16:48:27.794493Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "739bc31e-ba2b-4daa-bc43-7acd8bb46cef",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "df826fe2-15ff-4baa-ad74-b41b7f3b8048"
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
      "actor_id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T16:48:28.094383Z"
    }
  ]
}
```

Done: flag df826fe2-15ff-4baa-ad74-b41b7f3b8048 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "508aa6d9-d964-4ba8-84e9-519ea457b943",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcwMDgsImlhdCI6MTc5MzIwNjEwOCwianRpIjoiYThkOWFmODctZjUyMC00YzM3LThiMWQtZTAyYTU1NGQxZTdlIiwic2lkIjoiNTA4YWE2ZDktZDk2NC00YmE4LTg0ZTktNTE5ZWE0NTdiOTQzIn0.BjaQlSeZ5TmVN92gqoJB3L7d_8I78coSO_UoNMDfKWM",
  "access_expires_at": "2026-10-28T17:03:28.961620188Z",
  "refresh_token": "NZUnaADxSchbXqtilwaKibR2otKT1JAdf2ZZy2wxAB4",
  "refresh_expires_at": "2026-10-29T04:48:28.961025059Z",
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
      "actor_id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T16:48:28.094383Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "609d5a80-5226-482f-8a85-45fb8429d0b9",
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
  "session_id": "76cf7007-5515-489f-ad23-e3b992a561a5",
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
  "last_heartbeat_at": "2026-10-28T16:48:23.123268Z",
  "last_location_at": "2026-10-28T16:48:23.123268Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/76cf7007-5515-489f-ad23-e3b992a561a5/close` → **200**

```json
{
  "command_id": "20318de1-5c94-453b-92b9-706ca098d7b7",
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
  "session_id": "f62f8524-4545-49dd-ae7c-ba7c0ab6e51b",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcwMTAsImlhdCI6MTc5MzIwNjExMCwianRpIjoiMTJmYTFkNDAtZDY3OC00ODY4LWEzYWMtMzEzZmIwYTYwMzQ5Iiwic2lkIjoiZjYyZjg1MjQtNDU0NS00OWRkLWFlN2MtYmE3YzBhYjZlNTFiIn0.eDiUXBo89wYloSOi5SJr6ox2nz99lg6Sgs-Qb6PqSNo",
  "access_expires_at": "2026-10-28T17:03:30.681290352Z",
  "refresh_token": "U5d8hhrfOxGS8MMfGPbcaCxveQ1OITzzcRIPk5sAXW0",
  "refresh_expires_at": "2026-10-29T04:48:30.68070666Z",
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
  "command_id": "aee840cf-5aca-4bfc-bade-45c0a79448b1",
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
  "changed_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T16:48:31.258619Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "aee840cf-5aca-4bfc-bade-45c0a79448b1",
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
  "changed_by": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T16:48:31.258619Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48161358201",
  "device_ref": "sandbox-21733"
}
```

```json
{
  "challenge_id": "ff13d5ca-806b-49d1-8c97-818adeb62cb1",
  "expires_at": "2026-10-28T16:53:31.823466374Z",
  "resend_available_at": "2026-10-28T16:48:32.823466374Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48161358201` → **200**

```json
{
  "phone": "+48161358201",
  "audience": "CLIENT",
  "code": "348209",
  "sent_at": "2026-10-28T16:48:31.825852779Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ff13d5ca-806b-49d1-8c97-818adeb62cb1",
  "code": "348209",
  "device_ref": "sandbox-21733"
}
```

```json
{
  "session_id": "f13e1283-8df8-48a7-acd6-f10a993bbca9",
  "subject": {
    "type": "CLIENT",
    "id": "332efd83-420b-4a0a-adac-36a84a4397f9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMzJlZmQ4My00MjBiLTRhMGEtYWRhYy0zNmE4NGE0Mzk3ZjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3MDEyLCJpYXQiOjE3OTMyMDYxMTIsImp0aSI6ImI3Y2M2MzIwLWIyYWItNDAxOS1iNDQ4LTM0ZTY4YmUyY2FiYiIsInNpZCI6ImYxM2UxMjgzLThkZjgtNDhhNy1hY2Q2LWYxMGE5OTNiYmNhOSJ9.TIuLk3CHHI8zf8xT83USxtWnHMQ87Y5F5iSWWM6I5_U",
  "access_expires_at": "2026-10-28T17:03:32.119469005Z",
  "refresh_token": "lWLC0rOlBy2cralHI4PlfHBEiY3BXOvUB-nlBKsQDpI",
  "refresh_expires_at": "2026-11-27T16:48:32.118911732Z",
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
  "correlation_id": "ccde2daa-2e7c-4568-871b-1b712a80663e"
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
  "device_ref": "sandbox-11539"
}
```

```json
{
  "challenge_id": "380c24fa-458a-419e-95cb-5dfad1cc5166",
  "expires_at": "2026-10-28T16:53:32.939197707Z",
  "resend_available_at": "2026-10-28T16:48:33.939197707Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "882357",
  "sent_at": "2026-10-28T16:48:32.941667077Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "380c24fa-458a-419e-95cb-5dfad1cc5166",
  "code": "882357",
  "device_ref": "sandbox-11539"
}
```

```json
{
  "session_id": "7640b7dd-42ce-4663-ae35-5a81f9ab0bf5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNzAxMywiaWF0IjoxNzkzMjA2MTEzLCJqdGkiOiJhY2EyOGY3Mi04Y2IxLTRjMjgtOGJhNC00Y2JlZjIyNTNhMTYiLCJzaWQiOiI3NjQwYjdkZC00MmNlLTQ2NjMtYWUzNS01YTgxZjlhYjBiZjUifQ.ADMke-C8EaSHeTf5JRtfZ9XjyeoY4EvXR-nlSC0MdU0",
  "access_expires_at": "2026-10-28T17:03:33.26709275Z",
  "refresh_token": "Ejr2D4-VXjH6xsz8SbXNJlHPI3DxCsPyu-kQXW81XUU",
  "refresh_expires_at": "2026-11-27T16:48:33.266496674Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "9d45f84e-16f9-475d-be47-249ee7714822",
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
  "last_heartbeat_at": "2026-10-28T16:48:02.010512Z",
  "last_location_at": "2026-10-28T16:48:02.010512Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/9d45f84e-16f9-475d-be47-249ee7714822/handover` → **200**

```json
{
  "command_id": "264a3ae0-604a-4a26-ab96-7bb60ac61ea2",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "9d45f84e-16f9-475d-be47-249ee7714822",
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
  "last_heartbeat_at": "2026-10-28T16:48:02.010512Z",
  "last_location_at": "2026-10-28T16:48:02.010512Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/9d45f84e-16f9-475d-be47-249ee7714822/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:48:34Z",
    "sequence": 1793206114973
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "9d45f84e-16f9-475d-be47-249ee7714822",
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
  "last_heartbeat_at": "2026-10-28T16:48:34.116918Z",
  "last_location_at": "2026-10-28T16:48:34.116918Z",
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
  "session_id": "9d45f84e-16f9-475d-be47-249ee7714822",
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
  "last_heartbeat_at": "2026-10-28T16:48:34.116918Z",
  "last_location_at": "2026-10-28T16:48:34.116918Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9d45f84e-16f9-475d-be47-249ee7714822/close` → **200**

```json
{
  "command_id": "3976f980-03ac-4fec-af89-806b610977d4",
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
  "correlation_id": "341af062-ec96-4f25-aa52-b2b97ffdafa8"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677616096",
  "device_ref": "sandbox-19669"
}
```

```json
{
  "challenge_id": "466615a2-5cb6-4f1d-86dc-081d96cd01d9",
  "expires_at": "2026-10-28T16:53:35.530711042Z",
  "resend_available_at": "2026-10-28T16:48:36.530711042Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677616096` → **200**

```json
{
  "phone": "+380677616096",
  "audience": "CLIENT",
  "code": "222651",
  "sent_at": "2026-10-28T16:48:35.532992982Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "466615a2-5cb6-4f1d-86dc-081d96cd01d9",
  "code": "222651",
  "device_ref": "sandbox-19669"
}
```

```json
{
  "session_id": "e5dfc39e-2181-4ea3-8d94-c0269340604c",
  "subject": {
    "type": "CLIENT",
    "id": "47fe3551-a407-4196-b8fb-b92280952a28"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0N2ZlMzU1MS1hNDA3LTQxOTYtYjhmYi1iOTIyODA5NTJhMjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3MDE1LCJpYXQiOjE3OTMyMDYxMTUsImp0aSI6IjA5YjhjMzA5LWM5MzgtNDkwMC05OWVlLWM5ZTc3Nzg3OGI5MSIsInNpZCI6ImU1ZGZjMzllLTIxODEtNGVhMy04ZDk0LWMwMjY5MzQwNjA0YyJ9.5KScqJNTVAVMRlYQ5pWJXkPYE51DQWgfAEjK_Y1uPk4",
  "access_expires_at": "2026-10-28T17:03:35.833824027Z",
  "refresh_token": "HiNc6k-AIF5WSCqrsXoUD8ZyczjS0aAGIgn55M21gI4",
  "refresh_expires_at": "2026-11-27T16:48:35.83309402Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "acb35a52-5857-44f4-b17c-ed42e1fa5589",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "96d613ac-475a-40fa-a4b3-0934cc93d5b9",
  "upload_path": "/api/rider/v1/uploads/96d613ac-475a-40fa-a4b3-0934cc93d5b9",
  "expires_at": "2026-10-28T17:03:36.13009292Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/96d613ac-475a-40fa-a4b3-0934cc93d5b9` → **200**

```json
{
  "file_id": "96d613ac-475a-40fa-a4b3-0934cc93d5b9",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "5a08c191-34a9-4b94-af4b-0cea9b35a498",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "96d613ac-475a-40fa-a4b3-0934cc93d5b9"
  ]
}
```

```json
{
  "id": "c1b46316-3f4a-44f3-9ff5-52b94511718f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "47fe3551-a407-4196-b8fb-b92280952a28",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T16:48:36.444502Z",
  "updated_at": "2026-10-28T16:48:36.444502Z",
  "messages": [
    {
      "id": "3dc9b6dc-306b-4502-97e4-c98f63b11f2e",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "47fe3551-a407-4196-b8fb-b92280952a28",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:48:36.446108Z",
      "attachments": [
        {
          "file_id": "96d613ac-475a-40fa-a4b3-0934cc93d5b9",
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
  "session_id": "2fa55c5e-3eed-44be-8062-803045f10022",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcwMTcsImlhdCI6MTc5MzIwNjExNywianRpIjoiNTIyNTJjZTctZTQ1MS00NzUwLWFjMmMtZjcyNGViNTBmNzMzIiwic2lkIjoiMmZhNTVjNWUtM2VlZC00NGJlLTgwNjItODAzMDQ1ZjEwMDIyIn0.KHbVAvBq-AtPfRRZ1iSObFoaUfsxAoK9-9c9kqJCKoA",
  "access_expires_at": "2026-10-28T17:03:37.044961296Z",
  "refresh_token": "G5kXj8K7shyqvhbh_S_ObyrT0KoEzKFxVpvgj0Ef9ys",
  "refresh_expires_at": "2026-10-29T04:48:37.044320896Z",
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
  "session_id": "416523fd-82e7-458e-afdf-27762b9f5a9f",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcwMTcsImlhdCI6MTc5MzIwNjExNywianRpIjoiMzMxZWZjN2YtMjVmOS00MDNhLWJjOWEtMzljZTIwNzAyNmVmIiwic2lkIjoiNDE2NTIzZmQtODJlNy00NThlLWFmZGYtMjc3NjJiOWY1YTlmIn0.yTOddAWr60WzPGxkgtsgKOUOeF9oVgu2FZazIoWvfxI",
  "access_expires_at": "2026-10-28T17:03:37.609230485Z",
  "refresh_token": "tdsgv0zDrULfJ_Q6lsfqF9mWNz1ASjuW1V1-e_5qTxM",
  "refresh_expires_at": "2026-10-29T04:48:37.608387518Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/c1b46316-3f4a-44f3-9ff5-52b94511718f/attachments/96d613ac-475a-40fa-a4b3-0934cc93d5b9` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "3c9c7d4f-31e6-4bf9-b716-e1b973dd72a4",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "ca28cbd2-f917-4200-89f1-27bba92d5da2",
  "upload_path": "/api/operator/v1/uploads/ca28cbd2-f917-4200-89f1-27bba92d5da2",
  "expires_at": "2026-10-28T17:03:37.902427704Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/ca28cbd2-f917-4200-89f1-27bba92d5da2` → **200**

```json
{
  "file_id": "ca28cbd2-f917-4200-89f1-27bba92d5da2",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/c1b46316-3f4a-44f3-9ff5-52b94511718f` → **200**

```json
{
  "id": "c1b46316-3f4a-44f3-9ff5-52b94511718f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "47fe3551-a407-4196-b8fb-b92280952a28",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T16:48:36.444502Z",
  "updated_at": "2026-10-28T16:48:36.444502Z",
  "messages": [
    {
      "id": "3dc9b6dc-306b-4502-97e4-c98f63b11f2e",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "47fe3551-a407-4196-b8fb-b92280952a28",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:48:36.446108Z",
      "attachments": [
        {
          "file_id": "96d613ac-475a-40fa-a4b3-0934cc93d5b9",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/c1b46316-3f4a-44f3-9ff5-52b94511718f/comments` → **200**

```json
{
  "command_id": "68bc71c4-aa50-4790-86a3-0aa4c4e919e9",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "ca28cbd2-f917-4200-89f1-27bba92d5da2"
  ]
}
```

```json
{
  "id": "c1b46316-3f4a-44f3-9ff5-52b94511718f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "47fe3551-a407-4196-b8fb-b92280952a28",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T16:48:36.444502Z",
  "updated_at": "2026-10-28T16:48:38.5313Z",
  "messages": [
    {
      "id": "3dc9b6dc-306b-4502-97e4-c98f63b11f2e",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "47fe3551-a407-4196-b8fb-b92280952a28",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:48:36.446108Z",
      "attachments": [
        {
          "file_id": "96d613ac-475a-40fa-a4b3-0934cc93d5b9",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "65a9e8a9-cb48-41b6-b873-b9fe8b85bfe9",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T16:48:38.530945Z",
      "attachments": [
        {
          "file_id": "ca28cbd2-f917-4200-89f1-27bba92d5da2",
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

`GET /api/rider/v1/support/cases/c1b46316-3f4a-44f3-9ff5-52b94511718f` → **200**

```json
{
  "id": "c1b46316-3f4a-44f3-9ff5-52b94511718f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "47fe3551-a407-4196-b8fb-b92280952a28",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T16:48:36.444502Z",
  "updated_at": "2026-10-28T16:48:38.5313Z",
  "messages": [
    {
      "id": "3dc9b6dc-306b-4502-97e4-c98f63b11f2e",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "47fe3551-a407-4196-b8fb-b92280952a28",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:48:36.446108Z",
      "attachments": [
        {
          "file_id": "96d613ac-475a-40fa-a4b3-0934cc93d5b9",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "65a9e8a9-cb48-41b6-b873-b9fe8b85bfe9",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T16:48:38.530945Z",
      "attachments": [
        {
          "file_id": "ca28cbd2-f917-4200-89f1-27bba92d5da2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/c1b46316-3f4a-44f3-9ff5-52b94511718f/attachments/ca28cbd2-f917-4200-89f1-27bba92d5da2` → **200**

Done: support case c1b46316-3f4a-44f3-9ff5-52b94511718f, rider attachment 96d613ac-475a-40fa-a4b3-0934cc93d5b9, operator attachment ca28cbd2-f917-4200-89f1-27bba92d5da2.

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
  "session_id": "e862d94a-bd02-48b9-9138-6e9168c71be9",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcwMTksImlhdCI6MTc5MzIwNjExOSwianRpIjoiNDMwYjJhNGEtZTUxYi00MGViLWFjMTctMGE0OTJiMzRhYWY2Iiwic2lkIjoiZTg2MmQ5NGEtYmQwMi00OGI5LTkxMzgtNmU5MTY4YzcxYmU5In0.uSHOcGyd7wex0VZeoRraTBv5x4_2X2rNVHUrAC9gEOM",
  "access_expires_at": "2026-10-28T17:03:39.430181068Z",
  "refresh_token": "O0rsAsQSsuYci9lT8-lqPssiAjYPd-Q4-d5r72lkIfo",
  "refresh_expires_at": "2026-10-29T04:48:39.429588039Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-22267"
}
```

```json
{
  "challenge_id": "4d7033e1-0154-4748-90d7-b52b96de97eb",
  "expires_at": "2026-10-28T16:53:39.722244376Z",
  "resend_available_at": "2026-10-28T16:48:40.722244376Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "824906",
  "sent_at": "2026-10-28T16:48:39.724545516Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4d7033e1-0154-4748-90d7-b52b96de97eb",
  "code": "824906",
  "device_ref": "sandbox-22267"
}
```

```json
{
  "session_id": "8ed955f9-cf8b-49f6-83a0-b13037b9838a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNzAyMCwiaWF0IjoxNzkzMjA2MTIwLCJqdGkiOiJmODExZGEyYy1mNzFlLTRhNmMtODAxMi1jNDM0NjM2OTI3N2YiLCJzaWQiOiI4ZWQ5NTVmOS1jZjhiLTQ5ZjYtODNhMC1iMTMwMzdiOTgzOGEifQ.Ci1cusQP2Ge9v7cG5Zsqs-IB4tP8jw_m1zG7MuqafM4",
  "access_expires_at": "2026-10-28T17:03:40.035859224Z",
  "refresh_token": "WGe-AhB24IdgVKxBH0kSs1PDSVG3XbJfXRGowF_2CJ8",
  "refresh_expires_at": "2026-11-27T16:48:40.035234959Z",
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
      "actor_id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T16:48:28.094383Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T16:48:29.52673Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "41390397-6ea8-401e-a387-2d6a57435b1d",
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
  "device_ref": "sandbox-24508"
}
```

```json
{
  "challenge_id": "4f4b957f-6627-4554-bb94-b0605889b07c",
  "expires_at": "2026-10-28T16:53:41.159024933Z",
  "resend_available_at": "2026-10-28T16:48:42.159024933Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "950008",
  "sent_at": "2026-10-28T16:48:41.161260836Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f4b957f-6627-4554-bb94-b0605889b07c",
  "code": "950008",
  "device_ref": "sandbox-24508"
}
```

```json
{
  "session_id": "67462c5f-92c2-4c83-b36b-4f9c5c5b50c9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNzAyMSwiaWF0IjoxNzkzMjA2MTIxLCJqdGkiOiIwYWRkNTEwOS1kZWYzLTRmOWEtYjlhNy1iY2UzNWI3YmM0NDMiLCJzaWQiOiI2NzQ2MmM1Zi05MmMyLTRjODMtYjM2Yi00ZjljNWM1YjUwYzkifQ.QbJJEJO8SBHhXCPBaoruZL9--OifqmjCdZ-AsdWyAdY",
  "access_expires_at": "2026-10-28T17:03:41.466594806Z",
  "refresh_token": "WdMroObqmAwvS0y-sAYFTJKspBZ3qevbezq7am-tIqE",
  "refresh_expires_at": "2026-11-27T16:48:41.466024719Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fe1b20ab-e8e5-4164-a535-38bf54038cd0",
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
  "last_heartbeat_at": "2026-10-28T16:48:09.315949Z",
  "last_location_at": "2026-10-28T16:48:09.315949Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/fe1b20ab-e8e5-4164-a535-38bf54038cd0/handover` → **200**

```json
{
  "command_id": "d86dc0a0-cd58-4fc6-8dc3-531bad5506dd",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fe1b20ab-e8e5-4164-a535-38bf54038cd0",
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
  "last_heartbeat_at": "2026-10-28T16:48:09.315949Z",
  "last_location_at": "2026-10-28T16:48:09.315949Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/fe1b20ab-e8e5-4164-a535-38bf54038cd0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:48:42Z",
    "sequence": 1793206122299
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fe1b20ab-e8e5-4164-a535-38bf54038cd0",
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
  "last_heartbeat_at": "2026-10-28T16:48:42.318488Z",
  "last_location_at": "2026-10-28T16:48:42.318488Z",
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
  "command_id": "53f80fa4-b02a-4a53-a516-879072ba948c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:48:42Z",
    "sequence": 1793206122866
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b1decddf-1f77-4bfb-9a17-6275921fb44f",
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
  "last_heartbeat_at": "2026-10-28T16:48:42.88564Z",
  "last_location_at": "2026-10-28T16:48:42.88564Z",
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
  "session_id": "8ceb9855-34d8-451f-b82e-541cb68cbc02",
  "subject": {
    "type": "STAFF",
    "id": "e14613aa-1c2b-43d6-ba50-11f3e64e309b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ2MTNhYS0xYzJiLTQzZDYtYmE1MC0xMWYzZTY0ZTMwOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcwMjMsImlhdCI6MTc5MzIwNjEyMywianRpIjoiMWU3ZjdmNGUtNGU3Zi00MDlkLThhZmMtNjBkZjkzNWJjMTYzIiwic2lkIjoiOGNlYjk4NTUtMzRkOC00NTFmLWI4MmUtNTQxY2I2OGNiYzAyIn0.LaZT6u_gSK_md-YB5HTPLnilDPvTYFpuQJDEpz58bgY",
  "access_expires_at": "2026-10-28T17:03:43.464953309Z",
  "refresh_token": "qeA5XsyVEmRmEWXehr-6ja75XG8duis6vKrNt5EF6bA",
  "refresh_expires_at": "2026-10-29T04:48:43.464324503Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "628767e5-70fd-4695-a28c-992f4c3694af",
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
  "id": "f5ba8425-9fd4-4d06-a340-ef917c305084",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:53:43.745520Z",
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
  "command_id": "75fd8588-da1f-4802-865c-aa6278768875",
  "quote_id": "f5ba8425-9fd4-4d06-a340-ef917c305084",
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
  "id": "2904ee91-e3be-4efe-8a9b-3331297267d9",
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
  "created_at": "2026-10-28T16:48:44.0357Z",
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
    "id": "2fd5f9a0-3113-4829-95f7-5c51bef072f1",
    "order_id": "2904ee91-e3be-4efe-8a9b-3331297267d9",
    "expires_at": "2026-10-28T16:48:59.039433Z",
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

`POST /api/driver/v1/offers/2fd5f9a0-3113-4829-95f7-5c51bef072f1/accept` → **200**

```json
{
  "command_id": "f0db8605-8bfd-400d-9082-5a18152b93a0"
}
```

```json
{
  "id": "eaab4886-3ba1-4b22-9530-63a2c88fbc88",
  "order_id": "2904ee91-e3be-4efe-8a9b-3331297267d9",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "be68111b-ec4c-4ffd-9ff5-45c7526d9dd7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "be68111b-ec4c-4ffd-9ff5-45c7526d9dd7",
  "order_id": "2904ee91-e3be-4efe-8a9b-3331297267d9",
  "assignment_id": "eaab4886-3ba1-4b22-9530-63a2c88fbc88",
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

`POST /api/driver/v1/work-sessions/b1decddf-1f77-4bfb-9a17-6275921fb44f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:48:45Z",
    "sequence": 1793206125425
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b1decddf-1f77-4bfb-9a17-6275921fb44f",
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
  "last_heartbeat_at": "2026-10-28T16:48:45.444983Z",
  "last_location_at": "2026-10-28T16:48:45.444983Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/be68111b-ec4c-4ffd-9ff5-45c7526d9dd7/arrive` → **200**

```json
{
  "command_id": "94d775cc-ad7f-4ab2-bb55-997641fa297a",
  "expected_version": 0
}
```

```json
{
  "id": "be68111b-ec4c-4ffd-9ff5-45c7526d9dd7",
  "order_id": "2904ee91-e3be-4efe-8a9b-3331297267d9",
  "assignment_id": "eaab4886-3ba1-4b22-9530-63a2c88fbc88",
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
  "arrived_at": "2026-10-28T16:48:45.736665Z",
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

`POST /api/driver/v1/trips/be68111b-ec4c-4ffd-9ff5-45c7526d9dd7/start` → **200**

```json
{
  "command_id": "49bf7bad-af63-46e0-bdd8-5c0be7665ba7",
  "expected_version": 1
}
```

```json
{
  "id": "be68111b-ec4c-4ffd-9ff5-45c7526d9dd7",
  "order_id": "2904ee91-e3be-4efe-8a9b-3331297267d9",
  "assignment_id": "eaab4886-3ba1-4b22-9530-63a2c88fbc88",
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
  "arrived_at": "2026-10-28T16:48:45.736665Z",
  "started_at": "2026-10-28T16:48:46.03337Z",
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

`POST /api/driver/v1/trips/be68111b-ec4c-4ffd-9ff5-45c7526d9dd7/complete` → **200**

```json
{
  "command_id": "f82d13bd-a54e-4521-a4eb-8dc8f698758d",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:48:46Z",
  "cash_received": true
}
```

```json
{
  "id": "be68111b-ec4c-4ffd-9ff5-45c7526d9dd7",
  "order_id": "2904ee91-e3be-4efe-8a9b-3331297267d9",
  "assignment_id": "eaab4886-3ba1-4b22-9530-63a2c88fbc88",
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
  "arrived_at": "2026-10-28T16:48:45.736665Z",
  "started_at": "2026-10-28T16:48:46.03337Z",
  "completed_at": "2026-10-28T16:48:46.329481Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/2904ee91-e3be-4efe-8a9b-3331297267d9` → **200**

```json
{
  "id": "2904ee91-e3be-4efe-8a9b-3331297267d9",
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
    "id": "eaab4886-3ba1-4b22-9530-63a2c88fbc88",
    "order_id": "2904ee91-e3be-4efe-8a9b-3331297267d9",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "be68111b-ec4c-4ffd-9ff5-45c7526d9dd7",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:48:44.0357Z",
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
  "session_id": "fe1b20ab-e8e5-4164-a535-38bf54038cd0",
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
  "last_heartbeat_at": "2026-10-28T16:48:42.318488Z",
  "last_location_at": "2026-10-28T16:48:42.318488Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fe1b20ab-e8e5-4164-a535-38bf54038cd0/close` → **200**

```json
{
  "command_id": "1626f2cb-83c0-42a5-8136-c8fe8231d3b8",
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
  "session_id": "b1decddf-1f77-4bfb-9a17-6275921fb44f",
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
  "last_heartbeat_at": "2026-10-28T16:48:45.444983Z",
  "last_location_at": "2026-10-28T16:48:45.444983Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b1decddf-1f77-4bfb-9a17-6275921fb44f/close` → **200**

```json
{
  "command_id": "4555291a-8af0-4a87-a99b-4e3f87443921",
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

Done: terminal order 2904ee91-e3be-4efe-8a9b-3331297267d9 by Andrii (5a000000-0000-4000-8000-000000000403).
