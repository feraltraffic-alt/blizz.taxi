# Sandbox transcript (2026-10-28T16:32:37Z, 020735a)

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
  "correlation_id": "c1a3967a-cc9a-49ff-b613-b14bca6a2a0a"
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
  "session_id": "a251d46f-e7bf-434b-ac85-886bc2d48e7c",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYwNjUsImlhdCI6MTc5MzIwNTE2NSwianRpIjoiNGZjMzVhYzUtNzYxYy00MzI5LTkyNjYtYjM4YjQyM2Q1ZmViIiwic2lkIjoiYTI1MWQ0NmYtZTdiZi00MzRiLWFjODUtODg2YmMyZDQ4ZTdjIn0.OZY3_kUxTYKKk7RGxZrWninSwPRPv4RyOs3vsDYu7mY",
  "access_expires_at": "2026-10-28T16:47:45.438341303Z",
  "refresh_token": "6cfQk17Cs8VKOGfE9F41dP2iBzrTYO0b6EmZItWC5m8",
  "refresh_expires_at": "2026-10-29T04:32:45.436102668Z",
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
  "session_id": "9911ab17-b403-4371-92d3-c72177ec633a",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYwNjYsImlhdCI6MTc5MzIwNTE2NiwianRpIjoiN2U5ZTc5MGItZjIxNS00MGQwLWFlNWQtMWQwZDQ2ZTc3M2Q5Iiwic2lkIjoiOTkxMWFiMTctYjQwMy00MzcxLTkyZDMtYzcyMTc3ZWM2MzNhIn0.5jVkl7F_s69Ji07aOG9eqX4pBAinQNs4gpKemFpuqR8",
  "access_expires_at": "2026-10-28T16:47:46.968441047Z",
  "refresh_token": "CSAN8htls0RTwxN_JRq-9mc2XA_JsfNWFY8pTJd29Vo",
  "refresh_expires_at": "2026-10-29T04:32:46.967462517Z",
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
  "command_id": "88fc0748-d0c1-4cf3-8271-d9fbf176cb37",
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
  "changed_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
  "reason": "Sandbox: force update",
  "changed_at": "2026-10-28T16:32:47.577821628Z"
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
  "device_ref": "sandbox-21215"
}
```

```json
{
  "challenge_id": "18435729-02ea-44a9-bc89-c5c489615ad1",
  "expires_at": "2026-10-28T16:37:48.174445237Z",
  "resend_available_at": "2026-10-28T16:32:49.174445237Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380990000001` → **200**

```json
{
  "phone": "+380990000001",
  "audience": "DRIVER",
  "code": "616605",
  "sent_at": "2026-10-28T16:32:48.182343041Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "18435729-02ea-44a9-bc89-c5c489615ad1",
  "code": "616605",
  "device_ref": "sandbox-21215"
}
```

```json
{
  "session_id": "d3194e47-95d3-48e6-af8a-3355840c3558",
  "subject": {
    "type": "DRIVER",
    "id": "4b453ab1-817a-407e-8725-8bb4e3a9d041"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YjQ1M2FiMS04MTdhLTQwN2UtODcyNS04YmI0ZTNhOWQwNDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjA2OCwiaWF0IjoxNzkzMjA1MTY4LCJqdGkiOiJiYmFiMDNiMS03MTcyLTQzMjMtYTk3Mi05OGRmMmQ1YjAxZDUiLCJzaWQiOiJkMzE5NGU0Ny05NWQzLTQ4ZTYtYWY4YS0zMzU1ODQwYzM1NTgifQ.X7Ms-lh7Re15OLvqbWpEkE4n83O-ueYhy1Lx-lg7_D4",
  "access_expires_at": "2026-10-28T16:47:48.504512766Z",
  "refresh_token": "fzJ21pmZsz1yq8c4L1-yLtp5V0DdBbajrtHPpSY3HSo",
  "refresh_expires_at": "2026-11-27T16:32:48.503579041Z",
  "account_created": true
}
```

`POST /api/driver/v1/work-sessions` → **400**

```json
{
  "command_id": "387b2489-a11c-4abb-b6ac-72cbe43bd619",
  "vehicle_id": "a3a08d00-4672-48f2-a183-e4e775981651"
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "495c24df-f16c-452f-a684-58acb055483b",
  "field_errors": [
    {
      "code": "NotNull",
      "field": "location"
    }
  ]
}
```

**Expected 426, got 400 — scenario stopped.**

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
  "changed_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
  "reason": "Sandbox: force update",
  "changed_at": "2026-10-28T16:32:47.577822Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "e2cf75ed-75f5-432b-b226-85f963bd9dff",
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
  "changed_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
  "reason": "Sandbox clean-up",
  "changed_at": "2026-10-28T16:32:49.377059827Z"
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
  "session_id": "184c2b0d-4fff-4db7-9ffc-c98afe3f8afe",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYwNjksImlhdCI6MTc5MzIwNTE2OSwianRpIjoiZGVhMjM0NjgtN2Q2Yi00OTYxLWJkMGYtZmExOGJlZGQzM2I1Iiwic2lkIjoiMTg0YzJiMGQtNGZmZi00ZGI3LTlmZmMtYzk4YWZlM2Y4YWZlIn0.wHd5hFUkWl5kaUiZcXSX8PgHKgKtRI2vsv2S0Frh-wQ",
  "access_expires_at": "2026-10-28T16:47:49.971476695Z",
  "refresh_token": "kldeD3Tx6F1Wpcb3_lca2D-0OMUn0a8EU0_xpBIU4dM",
  "refresh_expires_at": "2026-10-29T04:32:49.97052084Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "c71ac577-9175-44ab-8bbf-10cae455f3fe",
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
  "id": "0e35c463-f602-4428-97b5-4e08dd189ef8",
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
  "created_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
  "created_at": "2026-10-28T16:32:50.258272Z",
  "updated_at": "2026-10-28T16:32:50.258272Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632812501",
  "device_ref": "sandbox-16760"
}
```

```json
{
  "challenge_id": "373464a1-337e-4772-9478-c9bdb09e8f94",
  "expires_at": "2026-10-28T16:37:50.545908653Z",
  "resend_available_at": "2026-10-28T16:32:51.545908653Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632812501` → **200**

```json
{
  "phone": "+380632812501",
  "audience": "CLIENT",
  "code": "697435",
  "sent_at": "2026-10-28T16:32:50.549623555Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "373464a1-337e-4772-9478-c9bdb09e8f94",
  "code": "697435",
  "device_ref": "sandbox-16760"
}
```

```json
{
  "session_id": "c3670b25-17cf-4f3a-bc94-e05ac3170630",
  "subject": {
    "type": "CLIENT",
    "id": "87cd6751-3943-493b-9819-0f1200a07cb3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4N2NkNjc1MS0zOTQzLTQ5M2ItOTgxOS0wZjEyMDBhMDdjYjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MDcwLCJpYXQiOjE3OTMyMDUxNzAsImp0aSI6ImJiYmY2MTc2LWIxMjgtNDQyNy1hNTdmLWRiOTFhODVkODNmOSIsInNpZCI6ImMzNjcwYjI1LTE3Y2YtNGYzYS1iYzk0LWUwNWFjMzE3MDYzMCJ9.1ykJXRdXN4dCsbYFBREmTQloze7YbY_dUJWUlImpJLo",
  "access_expires_at": "2026-10-28T16:47:50.839549651Z",
  "refresh_token": "wYs44_OHzxp55HISaAyamGFyJSyCix7UmVnTFWOH9Ow",
  "refresh_expires_at": "2026-11-27T16:32:50.838532098Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380632812501` → **200**

```json
{
  "client_id": "87cd6751-3943-493b-9819-0f1200a07cb3"
}
```

`POST /api/admin/v1/rider-wallets/87cd6751-3943-493b-9819-0f1200a07cb3/top-ups` → **201**

```json
{
  "command_id": "92352364-ef1d-47ab-8eaf-682a7d3fb911",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "87cd6751-3943-493b-9819-0f1200a07cb3",
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
      "id": "c1e6f03c-c4fa-40f8-b32a-45fae4dd9ecd",
      "at": "2026-10-28T16:32:51.375793Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "00a88c61-ca8a-4394-a8cd-f0fd3057f762",
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
  "id": "76cd66d3-8692-41fb-8add-3036d225dc85",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:37:51.870140Z",
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
      "id": "0e35c463-f602-4428-97b5-4e08dd189ef8",
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
  "device_ref": "sandbox-10506"
}
```

```json
{
  "challenge_id": "81700a37-f369-487c-a871-bf04d04715c2",
  "expires_at": "2026-10-28T16:37:52.172226051Z",
  "resend_available_at": "2026-10-28T16:32:53.172226051Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "368144",
  "sent_at": "2026-10-28T16:32:52.17578983Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "81700a37-f369-487c-a871-bf04d04715c2",
  "code": "368144",
  "device_ref": "sandbox-10506"
}
```

```json
{
  "session_id": "7eac2adb-f5f0-4854-baf7-778e0bd28e57",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjA3MiwiaWF0IjoxNzkzMjA1MTcyLCJqdGkiOiIyMzJjYjk4Yi0xNDY1LTQxMTAtODZmYi03MDE2NmZmN2VjYzAiLCJzaWQiOiI3ZWFjMmFkYi1mNWYwLTQ4NTQtYmFmNy03NzhlMGJkMjhlNTcifQ.ibbJkviWYvO2rE7aarjXZqxFWIlTFk2JJDuBZ2UCzUw",
  "access_expires_at": "2026-10-28T16:47:52.460747402Z",
  "refresh_token": "xM8K2_tZiMcXWlJuFiE5nunPvFFptc4vRFl6xrSe30o",
  "refresh_expires_at": "2026-11-27T16:32:52.459888301Z",
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
  "command_id": "4d07534f-ee18-4e5c-8232-e65885900630",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:32:52Z",
    "sequence": 1793205172996
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a709ca63-4c36-45a6-90bd-f913d616fb4f",
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
  "last_heartbeat_at": "2026-10-28T16:32:53.033458Z",
  "last_location_at": "2026-10-28T16:32:53.033458Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "72bbba86-4d84-47de-95ca-dfa36d8f4890",
  "quote_id": "76cd66d3-8692-41fb-8add-3036d225dc85",
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
  "id": "df7bd5a1-ca46-4c7d-a1f4-ff66920b56cf",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "87cd6751-3943-493b-9819-0f1200a07cb3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:32:53.371569Z",
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
  "client_id": "87cd6751-3943-493b-9819-0f1200a07cb3",
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
      "id": "c1e6f03c-c4fa-40f8-b32a-45fae4dd9ecd",
      "at": "2026-10-28T16:32:51.375793Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
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
    "id": "cc7a578e-19f8-4e95-8164-5b8a1ac20211",
    "order_id": "df7bd5a1-ca46-4c7d-a1f4-ff66920b56cf",
    "expires_at": "2026-10-28T16:33:08.384976Z",
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

`POST /api/driver/v1/offers/cc7a578e-19f8-4e95-8164-5b8a1ac20211/accept` → **200**

```json
{
  "command_id": "2753e978-8ea7-44f5-a2cd-b32b1abaf9b2"
}
```

```json
{
  "id": "dc227c1e-cae0-40f1-8df2-d41f694d9652",
  "order_id": "df7bd5a1-ca46-4c7d-a1f4-ff66920b56cf",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4ed16ec0-7e68-4ba7-adc6-101e9ba879b8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4ed16ec0-7e68-4ba7-adc6-101e9ba879b8",
  "order_id": "df7bd5a1-ca46-4c7d-a1f4-ff66920b56cf",
  "assignment_id": "dc227c1e-cae0-40f1-8df2-d41f694d9652",
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

`POST /api/driver/v1/work-sessions/a709ca63-4c36-45a6-90bd-f913d616fb4f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:32:54Z",
    "sequence": 1793205174764
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a709ca63-4c36-45a6-90bd-f913d616fb4f",
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
  "last_heartbeat_at": "2026-10-28T16:32:54.790396Z",
  "last_location_at": "2026-10-28T16:32:54.790396Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4ed16ec0-7e68-4ba7-adc6-101e9ba879b8/arrive` → **200**

```json
{
  "command_id": "d1fddebf-fd6e-490e-a668-50da35ba4d4f",
  "expected_version": 0
}
```

```json
{
  "id": "4ed16ec0-7e68-4ba7-adc6-101e9ba879b8",
  "order_id": "df7bd5a1-ca46-4c7d-a1f4-ff66920b56cf",
  "assignment_id": "dc227c1e-cae0-40f1-8df2-d41f694d9652",
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
  "arrived_at": "2026-10-28T16:32:55.098829Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4ed16ec0-7e68-4ba7-adc6-101e9ba879b8/start` → **200**

```json
{
  "command_id": "93310dc3-e2a9-4eec-a2d5-93066d13a3eb",
  "expected_version": 1
}
```

```json
{
  "id": "4ed16ec0-7e68-4ba7-adc6-101e9ba879b8",
  "order_id": "df7bd5a1-ca46-4c7d-a1f4-ff66920b56cf",
  "assignment_id": "dc227c1e-cae0-40f1-8df2-d41f694d9652",
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
  "arrived_at": "2026-10-28T16:32:55.098829Z",
  "started_at": "2026-10-28T16:32:55.379673Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/4ed16ec0-7e68-4ba7-adc6-101e9ba879b8/complete` → **200**

```json
{
  "command_id": "0641afc1-8c68-459a-be19-2efd78d37530",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:32:55Z",
  "cash_received": true
}
```

```json
{
  "id": "4ed16ec0-7e68-4ba7-adc6-101e9ba879b8",
  "order_id": "df7bd5a1-ca46-4c7d-a1f4-ff66920b56cf",
  "assignment_id": "dc227c1e-cae0-40f1-8df2-d41f694d9652",
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
  "arrived_at": "2026-10-28T16:32:55.098829Z",
  "started_at": "2026-10-28T16:32:55.379673Z",
  "completed_at": "2026-10-28T16:32:55.681869Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "87cd6751-3943-493b-9819-0f1200a07cb3",
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
      "id": "b5f845a9-b07a-48e4-8e66-ece7b878dae6",
      "at": "2026-10-28T16:32:55.966039Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "df7bd5a1-ca46-4c7d-a1f4-ff66920b56cf"
    },
    {
      "id": "c1e6f03c-c4fa-40f8-b32a-45fae4dd9ecd",
      "at": "2026-10-28T16:32:51.375793Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/0e35c463-f602-4428-97b5-4e08dd189ef8/archive` → **200**

```json
{
  "command_id": "d6357eef-a30d-4758-acc9-6b8aaedb75b0",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "0e35c463-f602-4428-97b5-4e08dd189ef8",
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
  "created_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
  "created_at": "2026-10-28T16:32:50.258272Z",
  "updated_at": "2026-10-28T16:32:59.278451Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a709ca63-4c36-45a6-90bd-f913d616fb4f",
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
  "last_heartbeat_at": "2026-10-28T16:32:54.790396Z",
  "last_location_at": "2026-10-28T16:32:54.790396Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a709ca63-4c36-45a6-90bd-f913d616fb4f/close` → **200**

```json
{
  "command_id": "19db9723-8d1e-49c7-b472-16299900de96",
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

Done: order df7bd5a1-ca46-4c7d-a1f4-ff66920b56cf.

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
  "session_id": "806da1b4-fa3d-4bda-977b-e11d87437969",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYwODAsImlhdCI6MTc5MzIwNTE4MCwianRpIjoiNWU1ODgxMDEtOGU3OC00MzUyLWIyZjktOTUzOTJkMDRkMjA1Iiwic2lkIjoiODA2ZGExYjQtZmEzZC00YmRhLTk3N2ItZTExZDg3NDM3OTY5In0.63g5I46Lyn_LZUNNBv7NPA3QStjM9to9Q22o6TmF_sU",
  "access_expires_at": "2026-10-28T16:48:00.432268757Z",
  "refresh_token": "ZoSeJcFblDNkYRvLl1UmElav7nat1VwrahSxglyrNLE",
  "refresh_expires_at": "2026-10-29T04:33:00.43153419Z",
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
  "command_id": "64d2450a-befe-4072-99cb-dbc970df00cd",
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
  "session_id": "444d5e0b-1032-447b-9306-82444fa66b21",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYwODEsImlhdCI6MTc5MzIwNTE4MSwianRpIjoiNGE3MjBiYzktYzFjMS00ZTVkLTg3NzEtMWUxZDNjYjJiNWM5Iiwic2lkIjoiNDQ0ZDVlMGItMTAzMi00NDdiLTkzMDYtODI0NDRmYTY2YjIxIn0.iuPtOC_omUuQFyJaQjD93WziiUCS4N3OPRh_TAcpsoE",
  "access_expires_at": "2026-10-28T16:48:01.540491917Z",
  "refresh_token": "8ecGNsnSjfxdDq9wfnMVeLD2Kq6hlHQP2tezC8UR77U",
  "refresh_expires_at": "2026-10-29T04:33:01.539779863Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.2154631040",
    "linkedid": "1730052700.2154631040",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679605268"
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
    "id": "1730052700.2154631040",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "0329a23c-3fe5-4e65-9ece-2bc96dad45d6",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380679605268",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T16:33:01.805867Z",
      "answered_at": null,
      "ended_at": "2026-10-28T16:33:01.830733Z",
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
    "id": "1730052600.3025626602",
    "linkedid": "1730052600.3025626602",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679605268"
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
      "id": "eaccbf65-1d74-4cc7-bfd7-4544578ccc50",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679605268",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T16:33:02.141764Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/eaccbf65-1d74-4cc7-bfd7-4544578ccc50/answer` → **200**

```json
{
  "command_id": "0f1f7c34-8228-43f6-820b-fa82b198fadf"
}
```

```json
{
  "id": "eaccbf65-1d74-4cc7-bfd7-4544578ccc50",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679605268",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
  "order_ids": [],
  "started_at": "2026-10-28T16:33:02.141764Z",
  "answered_at": "2026-10-28T16:33:02.44668Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.3025626602",
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
    "id": "1730052600.3025626602",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "eaccbf65-1d74-4cc7-bfd7-4544578ccc50",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679605268",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
      "order_ids": [],
      "started_at": "2026-10-28T16:33:02.141764Z",
      "answered_at": "2026-10-28T16:33:02.44668Z",
      "ended_at": "2026-10-28T16:33:02.735086Z",
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
      "id": "eaccbf65-1d74-4cc7-bfd7-4544578ccc50",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679605268",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
      "order_ids": [],
      "started_at": "2026-10-28T16:33:02.141764Z",
      "answered_at": "2026-10-28T16:33:02.44668Z",
      "ended_at": "2026-10-28T16:33:02.735086Z",
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
      "id": "eaccbf65-1d74-4cc7-bfd7-4544578ccc50",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679605268",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
      "order_ids": [],
      "started_at": "2026-10-28T16:33:02.141764Z",
      "answered_at": "2026-10-28T16:33:02.44668Z",
      "ended_at": "2026-10-28T16:33:02.735086Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T16:33:06.758885Z"
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
      "id": "eaccbf65-1d74-4cc7-bfd7-4544578ccc50",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679605268",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
      "order_ids": [],
      "started_at": "2026-10-28T16:33:02.141764Z",
      "answered_at": "2026-10-28T16:33:02.44668Z",
      "ended_at": "2026-10-28T16:33:02.735086Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T16:33:06.758885Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/eaccbf65-1d74-4cc7-bfd7-4544578ccc50/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/eaccbf65-1d74-4cc7-bfd7-4544578ccc50/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=eaccbf65-1d74-4cc7-bfd7-4544578ccc50` → **200**

```json
{
  "changes": [
    {
      "id": "064082c8-2469-4f8a-bea2-72e7a6ca3690",
      "occurred_at": "2026-10-28T16:33:07.924516Z",
      "actor_type": "STAFF",
      "actor_id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "eaccbf65-1d74-4cc7-bfd7-4544578ccc50",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"828486e4-1873-43a5-bcec-81230cc17f2b\", \"order_ids\": []}",
      "correlation_id": "0213cbc7-b594-44fc-83a5-308e0d0ac44f"
    },
    {
      "id": "e3712706-a631-4f6a-9409-aaf87e0b9e73",
      "occurred_at": "2026-10-28T16:33:07.8913Z",
      "actor_type": "STAFF",
      "actor_id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "eaccbf65-1d74-4cc7-bfd7-4544578ccc50",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"828486e4-1873-43a5-bcec-81230cc17f2b\", \"order_ids\": []}",
      "correlation_id": "33b672ed-9daf-441b-a6b2-0917ea0a56b2"
    }
  ]
}
```

Done: call eaccbf65-1d74-4cc7-bfd7-4544578ccc50 recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632944346",
  "device_ref": "sandbox-23968"
}
```

```json
{
  "challenge_id": "130275d4-f38e-4c04-8b67-24700dfc99d6",
  "expires_at": "2026-10-28T16:38:08.235450377Z",
  "resend_available_at": "2026-10-28T16:33:09.235450377Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632944346` → **200**

```json
{
  "phone": "+380632944346",
  "audience": "CLIENT",
  "code": "423658",
  "sent_at": "2026-10-28T16:33:08.239085957Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "130275d4-f38e-4c04-8b67-24700dfc99d6",
  "code": "423658",
  "device_ref": "sandbox-23968"
}
```

```json
{
  "session_id": "d663e14e-939a-4710-b532-143d69c8a604",
  "subject": {
    "type": "CLIENT",
    "id": "5c4bd48f-a9e5-4bd2-9b0f-44bf794b61d9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YzRiZDQ4Zi1hOWU1LTRiZDItOWIwZi00NGJmNzk0YjYxZDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MDg4LCJpYXQiOjE3OTMyMDUxODgsImp0aSI6ImVjMzkyNjVmLTY0NTctNDY0My05YTE0LWE5MmUxOTlkYjkyMyIsInNpZCI6ImQ2NjNlMTRlLTkzOWEtNDcxMC1iNTMyLTE0M2Q2OWM4YTYwNCJ9.ma06nLJPwDzOYmiYORczxjvn_6z4B8eJGG1VnfLaV5o",
  "access_expires_at": "2026-10-28T16:48:08.529347388Z",
  "refresh_token": "pUyp8DO_uZEPbZ2U-ORUNWqKsS2Hrpv6MvRnKd4gV8Y",
  "refresh_expires_at": "2026-11-27T16:33:08.52860081Z",
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
  "device_ref": "sandbox-12449"
}
```

```json
{
  "challenge_id": "1d085590-df91-4221-a3c2-e9609d1f9db7",
  "expires_at": "2026-10-28T16:38:09.05796319Z",
  "resend_available_at": "2026-10-28T16:33:10.05796319Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "139303",
  "sent_at": "2026-10-28T16:33:09.0621049Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1d085590-df91-4221-a3c2-e9609d1f9db7",
  "code": "139303",
  "device_ref": "sandbox-12449"
}
```

```json
{
  "session_id": "3ff8b75c-461f-4f98-a6f5-66557dcfd7bb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjA4OSwiaWF0IjoxNzkzMjA1MTg5LCJqdGkiOiI0ZTkzM2M2MS1hMTNiLTQ0ODgtOWE4Ny03YWRmMWQ1NTZkMDAiLCJzaWQiOiIzZmY4Yjc1Yy00NjFmLTRmOTgtYTZmNS02NjU1N2RjZmQ3YmIifQ.LYkXX_aikylEZey2Mw7vY6pZxxyN0OWdA7q_zYNM5EM",
  "access_expires_at": "2026-10-28T16:48:09.350121399Z",
  "refresh_token": "FoG09ROdhOHE5Ri_MbyQIJdN6MJCR6ISRd8oBZUza8w",
  "refresh_expires_at": "2026-11-27T16:33:09.349450221Z",
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
  "session_id": "e73e0d78-eaf4-4353-b9cd-055a8c7a838c",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYwOTAsImlhdCI6MTc5MzIwNTE5MCwianRpIjoiYTM5OGUxMTAtY2NkYi00ZTYxLTkwZmYtMzhiMWQ4ZGIyMmU4Iiwic2lkIjoiZTczZTBkNzgtZWFmNC00MzUzLWI5Y2QtMDU1YThjN2E4MzhjIn0.r20L30i0004WtD83pRAx_Svx-vdwwY5lAGF7sMMGNNo",
  "access_expires_at": "2026-10-28T16:48:10.162681964Z",
  "refresh_token": "-9Hc121Z8bgmNytpOnXgW5yiayVznvoRjm9fNKTFeHE",
  "refresh_expires_at": "2026-10-29T04:33:10.161905029Z",
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
  "session_id": "ba982a92-17df-44a9-bd31-658b82fbc7d3",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYwOTAsImlhdCI6MTc5MzIwNTE5MCwianRpIjoiZjBmZTEwNDItMzM5ZS00MTFjLTgwNjAtZDQ4MTUxM2Y2MWQwIiwic2lkIjoiYmE5ODJhOTItMTdkZi00NGE5LWJkMzEtNjU4YjgyZmJjN2QzIn0.Oh1UoNn1EkiGH6-SB94z3pD-AkYrwYYfswhNDM4KTyA",
  "access_expires_at": "2026-10-28T16:48:10.727291194Z",
  "refresh_token": "bIyb4CpgM152kXB6GQrMwuOruJrjB_zYrsfoOtgRosM",
  "refresh_expires_at": "2026-10-29T04:33:10.726678044Z",
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
  "command_id": "dfa8f784-fe13-442d-b586-6262571244bb",
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
  "id": "478435c7-6333-404c-9b14-eee56ed3c38b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:38:11.267871Z",
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
  "command_id": "678212eb-13f5-46c6-bfb0-cd8c0736c920",
  "quote_id": "478435c7-6333-404c-9b14-eee56ed3c38b",
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
  "id": "ca675686-0631-4fee-ad3a-700b5389735f",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5c4bd48f-a9e5-4bd2-9b0f-44bf794b61d9",
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
  "created_at": "2026-10-28T16:33:11.549912Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/ca675686-0631-4fee-ad3a-700b5389735f` → **200**

```json
{
  "id": "ca675686-0631-4fee-ad3a-700b5389735f",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5c4bd48f-a9e5-4bd2-9b0f-44bf794b61d9",
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
  "created_at": "2026-10-28T16:33:11.549912Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/ca675686-0631-4fee-ad3a-700b5389735f/cancel` → **200**

```json
{
  "command_id": "58ebfbb2-ac90-4f03-8747-cb4850dc13b6",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "ca675686-0631-4fee-ad3a-700b5389735f",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5c4bd48f-a9e5-4bd2-9b0f-44bf794b61d9",
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
  "created_at": "2026-10-28T16:33:11.549912Z",
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
  "command_id": "64732641-6b06-45bd-88d8-3a2a2f80bf82",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:33:12Z",
    "sequence": 1793205192664
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "364979ce-3bfd-4f5d-a478-7e63a7097b09",
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
  "last_heartbeat_at": "2026-10-28T16:33:12.68466Z",
  "last_location_at": "2026-10-28T16:33:12.68466Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-5858"
}
```

```json
{
  "challenge_id": "59f9f4a9-a797-4b02-95e1-578041921013",
  "expires_at": "2026-10-28T16:38:12.956954825Z",
  "resend_available_at": "2026-10-28T16:33:13.956954825Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "820169",
  "sent_at": "2026-10-28T16:33:12.959841626Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "59f9f4a9-a797-4b02-95e1-578041921013",
  "code": "820169",
  "device_ref": "sandbox-5858"
}
```

```json
{
  "session_id": "b5a1af65-4411-43c0-9a66-d38836d34dfb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjA5MywiaWF0IjoxNzkzMjA1MTkzLCJqdGkiOiJiYWE0YTk2YS1jZmZjLTQyMjQtYTNjNS1iODEwNWI4NjQ5ZTYiLCJzaWQiOiJiNWExYWY2NS00NDExLTQzYzAtOWE2Ni1kMzg4MzZkMzRkZmIifQ.yb_yF4KvJrTcu0ANGwxTaw0IFsCZ5e9xkUeAAps7pFQ",
  "access_expires_at": "2026-10-28T16:48:13.257589949Z",
  "refresh_token": "Cpiv_R-kSKfasg_cxKw682-UziOsp9CMe3YiA3K52CY",
  "refresh_expires_at": "2026-11-27T16:33:13.256952272Z",
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
  "command_id": "147ba5e3-1819-4bf6-bc7c-bc1b62306bed",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:33:13Z",
    "sequence": 1793205193791
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "026c16ea-0a35-4266-a9c8-f769f46a871b",
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
  "last_heartbeat_at": "2026-10-28T16:33:13.812839Z",
  "last_location_at": "2026-10-28T16:33:13.812839Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "801b4f80-4a38-47d7-9cd1-2c9cb71252b7",
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
  "id": "3486704d-a6cc-4492-a05d-07323ef8de5e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:38:14.094953Z",
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
  "command_id": "72fec8db-9b0f-4e27-8de5-7593cd3f4e3d",
  "quote_id": "3486704d-a6cc-4492-a05d-07323ef8de5e",
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
  "id": "c30e3631-26dd-4eb6-850a-c0fd3570101a",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5c4bd48f-a9e5-4bd2-9b0f-44bf794b61d9",
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
  "created_at": "2026-10-28T16:33:14.392555Z",
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
    "id": "1eacbc0f-cf2d-4fc8-9b15-8e378ef71ec3",
    "order_id": "c30e3631-26dd-4eb6-850a-c0fd3570101a",
    "expires_at": "2026-10-28T16:33:29.397338Z",
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

`POST /api/driver/v1/offers/1eacbc0f-cf2d-4fc8-9b15-8e378ef71ec3/accept` → **200**

```json
{
  "command_id": "9ff233df-c306-4a52-8679-888fa99bfef9"
}
```

```json
{
  "id": "04ee7c9f-1738-4159-b70a-19300b5a1b89",
  "order_id": "c30e3631-26dd-4eb6-850a-c0fd3570101a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "059a3048-b1ab-4965-8664-aedfab9cb33a",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "059a3048-b1ab-4965-8664-aedfab9cb33a",
  "order_id": "c30e3631-26dd-4eb6-850a-c0fd3570101a",
  "assignment_id": "04ee7c9f-1738-4159-b70a-19300b5a1b89",
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

`POST /api/driver/v1/trips/059a3048-b1ab-4965-8664-aedfab9cb33a/cancel` → **200**

```json
{
  "command_id": "6ece814e-b257-46b0-b2eb-97563d0712fa",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "059a3048-b1ab-4965-8664-aedfab9cb33a",
  "order_id": "c30e3631-26dd-4eb6-850a-c0fd3570101a",
  "assignment_id": "04ee7c9f-1738-4159-b70a-19300b5a1b89",
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

`GET /api/rider/v1/orders/c30e3631-26dd-4eb6-850a-c0fd3570101a` → **200**

```json
{
  "id": "c30e3631-26dd-4eb6-850a-c0fd3570101a",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "5c4bd48f-a9e5-4bd2-9b0f-44bf794b61d9",
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
    "id": "04ee7c9f-1738-4159-b70a-19300b5a1b89",
    "order_id": "c30e3631-26dd-4eb6-850a-c0fd3570101a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "059a3048-b1ab-4965-8664-aedfab9cb33a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T16:33:14.392555Z",
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
    "id": "a1b9f6f3-c3d4-4515-9071-688cce2ac88c",
    "order_id": "c30e3631-26dd-4eb6-850a-c0fd3570101a",
    "expires_at": "2026-10-28T16:33:30.541077Z",
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

`POST /api/driver/v1/offers/a1b9f6f3-c3d4-4515-9071-688cce2ac88c/accept` → **200**

```json
{
  "command_id": "f236b4bc-1455-4cb2-8a5e-63a4621966b4"
}
```

```json
{
  "id": "60032bf0-b170-4f4b-9a77-c320eb319f0c",
  "order_id": "c30e3631-26dd-4eb6-850a-c0fd3570101a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a9fbc246-fd2e-428a-8322-272f32cd97b5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a9fbc246-fd2e-428a-8322-272f32cd97b5",
  "order_id": "c30e3631-26dd-4eb6-850a-c0fd3570101a",
  "assignment_id": "60032bf0-b170-4f4b-9a77-c320eb319f0c",
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

`POST /api/driver/v1/trips/a9fbc246-fd2e-428a-8322-272f32cd97b5/cancel` → **200**

```json
{
  "command_id": "323a15a3-6ac4-4ea3-87fb-1c567ac205e7",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "a9fbc246-fd2e-428a-8322-272f32cd97b5",
  "order_id": "c30e3631-26dd-4eb6-850a-c0fd3570101a",
  "assignment_id": "60032bf0-b170-4f4b-9a77-c320eb319f0c",
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
    "id": "c30e3631-26dd-4eb6-850a-c0fd3570101a",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T16:33:14.392555Z",
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
    "id": "ca675686-0631-4fee-ad3a-700b5389735f",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T16:33:11.549912Z",
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
]
```

`GET /api/operator/v1/orders/c30e3631-26dd-4eb6-850a-c0fd3570101a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:33:14.393483Z",
      "actor": {
        "type": "CLIENT",
        "id": "5c4bd48f-a9e5-4bd2-9b0f-44bf794b61d9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c30e3631-26dd-4eb6-850a-c0fd3570101a",
        "quote_id": "3486704d-a6cc-4492-a05d-07323ef8de5e",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "8e6ee424-4458-4250-99ba-e9cff1f7ca11"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:33:14.396148Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c30e3631-26dd-4eb6-850a-c0fd3570101a",
        "attempt_id": "dd50b080-533c-49a8-a8a6-ef339d8e88b5",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "8e6ee424-4458-4250-99ba-e9cff1f7ca11"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T16:33:14.403853Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1eacbc0f-cf2d-4fc8-9b15-8e378ef71ec3",
        "order_id": "c30e3631-26dd-4eb6-850a-c0fd3570101a",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "8e6ee424-4458-4250-99ba-e9cff1f7ca11"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T16:33:14.952412Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "1eacbc0f-cf2d-4fc8-9b15-8e378ef71ec3",
        "order_id": "c30e3631-26dd-4eb6-850a-c0fd3570101a",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "04ee7c9f-1738-4159-b70a-19300b5a1b89"
      },
      "correlation_id": "a8d5a063-d4d3-43bc-ad36-c64421f9313b"
```

Done: orders ca675686-0631-4fee-ad3a-700b5389735f, c30e3631-26dd-4eb6-850a-c0fd3570101a.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731947214",
  "device_ref": "sandbox-7580"
}
```

```json
{
  "challenge_id": "86e569e3-aabf-4c67-8cf7-d5305f99997d",
  "expires_at": "2026-10-28T16:38:17.739246185Z",
  "resend_available_at": "2026-10-28T16:33:18.739246185Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380731947214` → **200**

```json
{
  "phone": "+380731947214",
  "audience": "CLIENT",
  "code": "765199",
  "sent_at": "2026-10-28T16:33:17.742182448Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "86e569e3-aabf-4c67-8cf7-d5305f99997d",
  "code": "765199",
  "device_ref": "sandbox-7580"
}
```

```json
{
  "session_id": "cbd0eb0a-45b6-4631-b3e0-72db7ed1aad4",
  "subject": {
    "type": "CLIENT",
    "id": "1311443e-0312-4632-8118-f1816f9c250f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzExNDQzZS0wMzEyLTQ2MzItODExOC1mMTgxNmY5YzI1MGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MDk4LCJpYXQiOjE3OTMyMDUxOTgsImp0aSI6IjMzMjAwNDMxLTRkNjctNGQyYy1iMTliLTNkMzM1MzI0NzAwNiIsInNpZCI6ImNiZDBlYjBhLTQ1YjYtNDYzMS1iM2UwLTcyZGI3ZWQxYWFkNCJ9.aEF4RM5j9zMOsvIwXX-j3K6yBWfKMbe7DpL2UHtrtz8",
  "access_expires_at": "2026-10-28T16:48:18.034234472Z",
  "refresh_token": "F3bNbVGNXJcD1QuzHvGKa2ziX1EsG1bD4xL1n-NQfHs",
  "refresh_expires_at": "2026-11-27T16:33:18.033551765Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "a3292393-dcf9-4072-bef0-80a5bbb0af78",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "2b8a014b-5cf2-4418-a0d8-32de1b2d8d19",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-2b8a014b-5cf2-4418-a0d8-32de1b2d8d19",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "3f1b505f1646d1602a97cf8533ab12fc",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=2b8a014b-5cf2-4418-a0d8-32de1b2d8d19",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731947214"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=2b8a014b-5cf2-4418-a0d8-32de1b2d8d19",
  "expires_at": "2026-10-28T17:03:18.310175Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/2b8a014b-5cf2-4418-a0d8-32de1b2d8d19` → **200**

```json
{
  "id": "2b8a014b-5cf2-4418-a0d8-32de1b2d8d19",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T17:03:18.310175Z",
  "card": {
    "id": "c4054d0b-0a8f-4a31-89e5-363832a06792",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8790",
    "card_type": "Visa",
    "created_at": "2026-10-28T16:33:18.592822Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "c4054d0b-0a8f-4a31-89e5-363832a06792",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****8790",
      "card_type": "Visa",
      "created_at": "2026-10-28T16:33:18.592822Z"
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
  "device_ref": "sandbox-594"
}
```

```json
{
  "challenge_id": "9fbb9203-ad2b-4a11-a9d1-61d739f25dab",
  "expires_at": "2026-10-28T16:38:19.129261096Z",
  "resend_available_at": "2026-10-28T16:33:20.129261096Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "172822",
  "sent_at": "2026-10-28T16:33:19.132810549Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9fbb9203-ad2b-4a11-a9d1-61d739f25dab",
  "code": "172822",
  "device_ref": "sandbox-594"
}
```

```json
{
  "session_id": "90b83545-afdd-4fb3-a00b-4c4a62c99fc1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjA5OSwiaWF0IjoxNzkzMjA1MTk5LCJqdGkiOiIwNmQ4OGE0ZS03ZDEyLTQ0YTgtYjYzNS00NDUwNjQ1MWIzZTkiLCJzaWQiOiI5MGI4MzU0NS1hZmRkLTRmYjMtYTAwYi00YzRhNjJjOTlmYzEifQ.dY--FDQkbDzAI76GTa_k8joiLDSxgYGTVxDEjDx2mDU",
  "access_expires_at": "2026-10-28T16:48:19.424895893Z",
  "refresh_token": "2w9_yVWJMLUv-niPfodgqIr2cPiHtvuAz2NF0k1ILLQ",
  "refresh_expires_at": "2026-11-27T16:33:19.424286848Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "026c16ea-0a35-4266-a9c8-f769f46a871b",
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
  "last_heartbeat_at": "2026-10-28T16:33:13.812839Z",
  "last_location_at": "2026-10-28T16:33:13.812839Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/026c16ea-0a35-4266-a9c8-f769f46a871b/handover` → **200**

```json
{
  "command_id": "709a39c9-52af-4132-8221-ca0384f08edb",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "026c16ea-0a35-4266-a9c8-f769f46a871b",
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
  "last_heartbeat_at": "2026-10-28T16:33:13.812839Z",
  "last_location_at": "2026-10-28T16:33:13.812839Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/026c16ea-0a35-4266-a9c8-f769f46a871b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:33:20Z",
    "sequence": 1793205200232
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "026c16ea-0a35-4266-a9c8-f769f46a871b",
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
  "last_heartbeat_at": "2026-10-28T16:33:20.2538Z",
  "last_location_at": "2026-10-28T16:33:20.2538Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1bf41897-c3e5-4ee4-912c-504c1b3b22d7",
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
  "id": "ed7bf49d-391f-46cb-93f4-8b2b698962b8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:38:20.540728Z",
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
  "command_id": "a3f661da-207c-443c-b653-5d9057c1d629",
  "quote_id": "ed7bf49d-391f-46cb-93f4-8b2b698962b8",
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
  "id": "60e21d41-6ae2-4d8b-b547-ddca1577eb86",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1311443e-0312-4632-8118-f1816f9c250f",
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
  "created_at": "2026-10-28T16:33:20.82516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/60e21d41-6ae2-4d8b-b547-ddca1577eb86` → **200**

```json
{
  "id": "60e21d41-6ae2-4d8b-b547-ddca1577eb86",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1311443e-0312-4632-8118-f1816f9c250f",
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
  "created_at": "2026-10-28T16:33:20.82516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/60e21d41-6ae2-4d8b-b547-ddca1577eb86` → **200**

```json
{
  "id": "60e21d41-6ae2-4d8b-b547-ddca1577eb86",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1311443e-0312-4632-8118-f1816f9c250f",
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
  "created_at": "2026-10-28T16:33:20.82516Z",
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
    "id": "6684755a-6fe7-4121-8bca-a74379417974",
    "order_id": "60e21d41-6ae2-4d8b-b547-ddca1577eb86",
    "expires_at": "2026-10-28T16:33:36.134355Z",
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

`POST /api/driver/v1/offers/6684755a-6fe7-4121-8bca-a74379417974/accept` → **200**

```json
{
  "command_id": "b03755fb-9604-4689-9ea9-9748560ef1e4"
}
```

```json
{
  "id": "6bf538ba-01a7-424a-bc96-c261265f20a9",
  "order_id": "60e21d41-6ae2-4d8b-b547-ddca1577eb86",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8f17c8db-ce9d-4fcb-a180-605241cf61ce",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8f17c8db-ce9d-4fcb-a180-605241cf61ce",
  "order_id": "60e21d41-6ae2-4d8b-b547-ddca1577eb86",
  "assignment_id": "6bf538ba-01a7-424a-bc96-c261265f20a9",
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

`POST /api/driver/v1/work-sessions/026c16ea-0a35-4266-a9c8-f769f46a871b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:33:23Z",
    "sequence": 1793205203479
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "026c16ea-0a35-4266-a9c8-f769f46a871b",
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
  "last_heartbeat_at": "2026-10-28T16:33:23.499972Z",
  "last_location_at": "2026-10-28T16:33:23.499972Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8f17c8db-ce9d-4fcb-a180-605241cf61ce/arrive` → **200**

```json
{
  "command_id": "7da7dc4d-6693-4db3-a7cb-f565e67d0191",
  "expected_version": 0
}
```

```json
{
  "id": "8f17c8db-ce9d-4fcb-a180-605241cf61ce",
  "order_id": "60e21d41-6ae2-4d8b-b547-ddca1577eb86",
  "assignment_id": "6bf538ba-01a7-424a-bc96-c261265f20a9",
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
  "arrived_at": "2026-10-28T16:33:23.776008Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8f17c8db-ce9d-4fcb-a180-605241cf61ce/start` → **200**

```json
{
  "command_id": "c4c47fc0-ed77-416b-8490-126dfa6a5930",
  "expected_version": 1
}
```

```json
{
  "id": "8f17c8db-ce9d-4fcb-a180-605241cf61ce",
  "order_id": "60e21d41-6ae2-4d8b-b547-ddca1577eb86",
  "assignment_id": "6bf538ba-01a7-424a-bc96-c261265f20a9",
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
  "arrived_at": "2026-10-28T16:33:23.776008Z",
  "started_at": "2026-10-28T16:33:24.055339Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8f17c8db-ce9d-4fcb-a180-605241cf61ce/complete` → **200**

```json
{
  "command_id": "c7bfeea6-8702-4d1c-9b47-67d915b8ab52",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:33:24Z"
}
```

```json
{
  "id": "8f17c8db-ce9d-4fcb-a180-605241cf61ce",
  "order_id": "60e21d41-6ae2-4d8b-b547-ddca1577eb86",
  "assignment_id": "6bf538ba-01a7-424a-bc96-c261265f20a9",
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
  "arrived_at": "2026-10-28T16:33:23.776008Z",
  "started_at": "2026-10-28T16:33:24.055339Z",
  "completed_at": "2026-10-28T16:33:24.337969Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/60e21d41-6ae2-4d8b-b547-ddca1577eb86` → **200**

```json
{
  "id": "60e21d41-6ae2-4d8b-b547-ddca1577eb86",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "1311443e-0312-4632-8118-f1816f9c250f",
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
    "id": "6bf538ba-01a7-424a-bc96-c261265f20a9",
    "order_id": "60e21d41-6ae2-4d8b-b547-ddca1577eb86",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "8f17c8db-ce9d-4fcb-a180-605241cf61ce",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:33:20.82516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/60e21d41-6ae2-4d8b-b547-ddca1577eb86` → **200**

```json
{
  "id": "60e21d41-6ae2-4d8b-b547-ddca1577eb86",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "1311443e-0312-4632-8118-f1816f9c250f",
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
    "id": "6bf538ba-01a7-424a-bc96-c261265f20a9",
    "order_id": "60e21d41-6ae2-4d8b-b547-ddca1577eb86",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "8f17c8db-ce9d-4fcb-a180-605241cf61ce",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:33:20.82516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/60e21d41-6ae2-4d8b-b547-ddca1577eb86` → **200**

```json
{
  "id": "60e21d41-6ae2-4d8b-b547-ddca1577eb86",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "1311443e-0312-4632-8118-f1816f9c250f",
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
    "id": "6bf538ba-01a7-424a-bc96-c261265f20a9",
    "order_id": "60e21d41-6ae2-4d8b-b547-ddca1577eb86",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "8f17c8db-ce9d-4fcb-a180-605241cf61ce",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:33:20.82516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/60e21d41-6ae2-4d8b-b547-ddca1577eb86` → **200**

```json
{
  "id": "60e21d41-6ae2-4d8b-b547-ddca1577eb86",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "1311443e-0312-4632-8118-f1816f9c250f",
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
    "id": "6bf538ba-01a7-424a-bc96-c261265f20a9",
    "order_id": "60e21d41-6ae2-4d8b-b547-ddca1577eb86",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "8f17c8db-ce9d-4fcb-a180-605241cf61ce",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:33:20.82516Z",
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
      "id": "914a7da6-3c99-4319-9b7b-4b2a8a22be1a",
      "at": "2026-10-28T16:33:25.195702Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "60e21d41-6ae2-4d8b-b547-ddca1577eb86",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/60e21d41-6ae2-4d8b-b547-ddca1577eb86/tip` → **200**

```json
{
  "order_id": "60e21d41-6ae2-4d8b-b547-ddca1577eb86",
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
  "available_until": "2026-10-29T16:33:24.337969Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/60e21d41-6ae2-4d8b-b547-ddca1577eb86/tip` → **201**

```json
{
  "command_id": "c7276f7f-1a22-4b4f-9287-907a906603e0",
  "amount_minor": 2500
}
```

```json
{
  "id": "78f389cb-cb87-41f8-b556-994cd9a9fa26",
  "order_id": "60e21d41-6ae2-4d8b-b547-ddca1577eb86",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T16:33:29.527341Z"
}
```

`GET /api/rider/v1/orders/60e21d41-6ae2-4d8b-b547-ddca1577eb86/tip` → **200**

```json
{
  "order_id": "60e21d41-6ae2-4d8b-b547-ddca1577eb86",
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
  "available_until": "2026-10-29T16:33:24.337969Z",
  "open": false,
  "tip": {
    "id": "78f389cb-cb87-41f8-b556-994cd9a9fa26",
    "order_id": "60e21d41-6ae2-4d8b-b547-ddca1577eb86",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T16:33:29.527341Z"
  }
}
```

`GET /api/rider/v1/orders/60e21d41-6ae2-4d8b-b547-ddca1577eb86/tip` → **200**

```json
{
  "order_id": "60e21d41-6ae2-4d8b-b547-ddca1577eb86",
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
  "available_until": "2026-10-29T16:33:24.337969Z",
  "open": false,
  "tip": {
    "id": "78f389cb-cb87-41f8-b556-994cd9a9fa26",
    "order_id": "60e21d41-6ae2-4d8b-b547-ddca1577eb86",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T16:33:29.527341Z"
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
      "id": "2fca2939-480b-4608-9cc8-25680c1c6ef1",
      "at": "2026-10-28T16:33:31.263839Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "60e21d41-6ae2-4d8b-b547-ddca1577eb86",
      "counterpart_id": null
    },
    {
      "id": "914a7da6-3c99-4319-9b7b-4b2a8a22be1a",
      "at": "2026-10-28T16:33:25.195702Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "60e21d41-6ae2-4d8b-b547-ddca1577eb86",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "026c16ea-0a35-4266-a9c8-f769f46a871b",
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
  "last_heartbeat_at": "2026-10-28T16:33:23.499972Z",
  "last_location_at": "2026-10-28T16:33:23.499972Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/026c16ea-0a35-4266-a9c8-f769f46a871b/close` → **200**

```json
{
  "command_id": "bf03ffaf-d5b3-4600-80de-1b136c034741",
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

Done: card order 60e21d41-6ae2-4d8b-b547-ddca1577eb86.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732258157",
  "device_ref": "sandbox-22509"
}
```

```json
{
  "challenge_id": "1a8d08c4-21ed-4b96-b6c6-4a16136d6dd6",
  "expires_at": "2026-10-28T16:38:32.17308266Z",
  "resend_available_at": "2026-10-28T16:33:33.17308266Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732258157` → **200**

```json
{
  "phone": "+380732258157",
  "audience": "CLIENT",
  "code": "016038",
  "sent_at": "2026-10-28T16:33:32.176046425Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1a8d08c4-21ed-4b96-b6c6-4a16136d6dd6",
  "code": "016038",
  "device_ref": "sandbox-22509"
}
```

```json
{
  "session_id": "f0733ce4-0693-47f3-9a89-2dfed44c0edf",
  "subject": {
    "type": "CLIENT",
    "id": "3fc7be65-3bab-4eb2-8315-1e2e3a0989c8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZmM3YmU2NS0zYmFiLTRlYjItODMxNS0xZTJlM2EwOTg5YzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MTEyLCJpYXQiOjE3OTMyMDUyMTIsImp0aSI6IjNmZDFjYTUzLTRmMTAtNDU1ZS05ZmNiLThhNTViOTU0ZjM1YSIsInNpZCI6ImYwNzMzY2U0LTA2OTMtNDdmMy05YTg5LTJkZmVkNDRjMGVkZiJ9.kUbyjL0As2fWpGpRpiEygM0UmORKbsmLXLfdowvsVYM",
  "access_expires_at": "2026-10-28T16:48:32.46759909Z",
  "refresh_token": "KIUrkxVmzGnfRco_35QdDMfJJ2o56BSUK5AjGxXxt8U",
  "refresh_expires_at": "2026-11-27T16:33:32.466950815Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "18e11df4-9392-4202-9c7c-031ff7422c9a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "d02d6d28-91d9-4043-bc66-a79321694e39",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-d02d6d28-91d9-4043-bc66-a79321694e39",
    "orderDate": "1793205212",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "172ea45ffc1cf448e6da7619a2fd3826",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=d02d6d28-91d9-4043-bc66-a79321694e39",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732258157"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=d02d6d28-91d9-4043-bc66-a79321694e39",
  "created_at": "2026-10-28T16:33:32.740174Z",
  "expires_at": "2026-10-28T17:03:32.740174Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/d02d6d28-91d9-4043-bc66-a79321694e39` → **200**

```json
{
  "id": "d02d6d28-91d9-4043-bc66-a79321694e39",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T16:33:32.740174Z",
  "expires_at": "2026-10-28T17:03:32.740174Z",
  "completed_at": "2026-10-28T16:33:33.01809Z",
  "masked_pan": "41****8373",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3fc7be65-3bab-4eb2-8315-1e2e3a0989c8",
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
      "id": "d0e7b3e9-4d75-4a5f-92e2-8aa25275ccb3",
      "at": "2026-10-28T16:33:33.281218Z",
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
  "client_id": "3fc7be65-3bab-4eb2-8315-1e2e3a0989c8",
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
      "id": "d0e7b3e9-4d75-4a5f-92e2-8aa25275ccb3",
      "at": "2026-10-28T16:33:33.281218Z",
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
  "device_ref": "sandbox-14902"
}
```

```json
{
  "challenge_id": "e4524ecd-181b-4e02-9b89-f157aae28bcd",
  "expires_at": "2026-10-28T16:38:33.849525657Z",
  "resend_available_at": "2026-10-28T16:33:34.849525657Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "960651",
  "sent_at": "2026-10-28T16:33:33.852507284Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e4524ecd-181b-4e02-9b89-f157aae28bcd",
  "code": "960651",
  "device_ref": "sandbox-14902"
}
```

```json
{
  "session_id": "25acee1b-8a13-463a-aedd-9dcaaaadf9c1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjExNCwiaWF0IjoxNzkzMjA1MjE0LCJqdGkiOiIxYzE1ODEzOC04MDZhLTQzNTUtODQyYi0wYmUzOGJmZTE4ZDkiLCJzaWQiOiIyNWFjZWUxYi04YTEzLTQ2M2EtYWVkZC05ZGNhYWFhZGY5YzEifQ.tDJwwRZ2_M0xHswdzJProSRkx4Mm7BbcC6y8xtXQwa0",
  "access_expires_at": "2026-10-28T16:48:34.148258144Z",
  "refresh_token": "EH1XSPVnTyu_vHR29HdlAWynAoWCJr90Jourz3tE7_k",
  "refresh_expires_at": "2026-11-27T16:33:34.147555376Z",
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
  "command_id": "d65c957a-76d2-4322-a46d-021133a05569",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "4a8b266e-0be4-47a0-904e-236d33cd1a87",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-4a8b266e-0be4-47a0-904e-236d33cd1a87",
    "orderDate": "1793205214",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "900d4f1beabbe663b3aa28db5f7d98fd",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=4a8b266e-0be4-47a0-904e-236d33cd1a87",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=4a8b266e-0be4-47a0-904e-236d33cd1a87",
  "created_at": "2026-10-28T16:33:34.679783Z",
  "expires_at": "2026-10-28T17:03:34.679783Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/4a8b266e-0be4-47a0-904e-236d33cd1a87` → **200**

```json
{
  "id": "4a8b266e-0be4-47a0-904e-236d33cd1a87",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T16:33:34.679783Z",
  "expires_at": "2026-10-28T17:03:34.679783Z",
  "completed_at": "2026-10-28T16:33:34.94324Z",
  "masked_pan": "41****2991",
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
      "id": "131e3d9a-3952-4217-b664-d66ae642edb5",
      "at": "2026-10-28T16:33:35.29458Z",
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
  "command_id": "84dfb2d0-12cc-4e67-a1f2-151bf77407f1",
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
  "correlation_id": "9f765454-97a6-4630-99d7-a495cac691e1"
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
  "session_id": "a1e102e0-e0d2-4b74-ab77-301f9eca81c7",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYxMTcsImlhdCI6MTc5MzIwNTIxNywianRpIjoiMDAwYTRjZTQtZjdlMC00Y2Q2LTkwZTUtZTNhNzliZjFlMjM4Iiwic2lkIjoiYTFlMTAyZTAtZTBkMi00Yjc0LWFiNzctMzAxZjllY2E4MWM3In0.Vhc7VGcoRQOYT2uncqyRn2W27N745lYxSSZpzZPOccY",
  "access_expires_at": "2026-10-28T16:48:37.356595868Z",
  "refresh_token": "3r7khuKxXrd_GFCQSfADlQYSuafUD7k7SnoDPaRhOp4",
  "refresh_expires_at": "2026-10-29T04:33:37.356040165Z",
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
  "phone": "+48600083701",
  "device_ref": "sandbox-1301"
}
```

```json
{
  "challenge_id": "ebcf12d4-4dc6-4e2f-bb48-470bb02e9504",
  "expires_at": "2026-10-28T16:38:38.162238701Z",
  "resend_available_at": "2026-10-28T16:33:39.162238701Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600083701` → **200**

```json
{
  "phone": "+48600083701",
  "audience": "CLIENT",
  "code": "066601",
  "sent_at": "2026-10-28T16:33:38.164799889Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ebcf12d4-4dc6-4e2f-bb48-470bb02e9504",
  "code": "066601",
  "device_ref": "sandbox-1301"
}
```

```json
{
  "session_id": "9b65cf1f-fac5-4cc3-bc32-0aeb1a5cef71",
  "subject": {
    "type": "CLIENT",
    "id": "c3276493-2642-401d-ad6f-4c982362b3af"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMzI3NjQ5My0yNjQyLTQwMWQtYWQ2Zi00Yzk4MjM2MmIzYWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MTE4LCJpYXQiOjE3OTMyMDUyMTgsImp0aSI6IjE2YmNlMjE3LWVlYzUtNDA3Ni1iMmI3LWVkMTM3MTdlYzlkMyIsInNpZCI6IjliNjVjZjFmLWZhYzUtNGNjMy1iYzMyLTBhZWIxYTVjZWY3MSJ9.VpnjOsI4QhBc-4IKF8Wl2EEkzv3GEHkokOcLI0kihKk",
  "access_expires_at": "2026-10-28T16:48:38.450819502Z",
  "refresh_token": "ibu5r3Gc1ZwuIVXr4SmSSTYMlKX75Db8TmTHcifa61o",
  "refresh_expires_at": "2026-11-27T16:33:38.450177067Z",
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
  "command_id": "8b289ab8-58c2-4bf5-b120-fe1a4003cb3b",
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
  "correlation_id": "36e60daf-2a87-49da-aba2-d53d7a0e9673",
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
  "command_id": "1b0b4544-b331-484e-bf5f-0605737b2445",
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
  "paused_at": "2026-10-28T16:33:39.505065731Z",
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
  "command_id": "3c40b51e-4bdc-4817-a3fa-f98680617faf",
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
  "id": "142dd744-a441-41b2-9ea3-716053b04bf9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:38:40.065357Z",
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
  "command_id": "ecc1ff0f-068c-4186-ad12-8e7d21190de8",
  "quote_id": "142dd744-a441-41b2-9ea3-716053b04bf9",
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
  "correlation_id": "6ad1141b-7eb1-44f7-8175-3999385f9a15"
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
  "paused_at": "2026-10-28T16:33:39.505066Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "b45b363a-3c57-4f0f-bf3d-0e76df7e3f10",
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
  "command_id": "dcde0093-5112-42ce-9d74-bd7bef552cad",
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
  "command_id": "f46b7bc3-479d-4d1e-920d-8bd9d85632f6",
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
  "id": "28416736-5ed1-4651-8bc7-8fa9c1191af0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:38:41.709342Z",
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
  "command_id": "9e6d2188-5df8-4292-81fd-8f5dc163735b",
  "quote_id": "28416736-5ed1-4651-8bc7-8fa9c1191af0",
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
  "correlation_id": "58c99056-d176-4d80-8509-16bb3db752b7"
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
  "command_id": "97131d96-420d-4d53-a695-dde12f7ced06",
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
  "command_id": "fe8a05c6-097b-400c-823a-6f2f4047b280",
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
  "id": "47d39f4d-a6c2-4e25-8219-6962dd99b931",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:38:42.804115Z",
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
  "command_id": "98ec0dc7-4fd1-4281-99ec-eedbfa71e077",
  "quote_id": "47d39f4d-a6c2-4e25-8219-6962dd99b931",
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
  "correlation_id": "05674357-0807-4a2c-a964-c514b70a83ab"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "e59ec29b-5d89-4869-a936-74123e02cf64",
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
  "correlation_id": "df374a53-3be4-48f2-9b98-c2a2f1ac4e02"
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
  "command_id": "bd7b99cd-5fbd-41c4-9003-e3e25542277f",
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
  "phone": "+380674141540",
  "device_ref": "sandbox-25217"
}
```

```json
{
  "challenge_id": "b4974b30-8670-47b1-b285-80f2048ae12f",
  "expires_at": "2026-10-28T16:38:44.21614383Z",
  "resend_available_at": "2026-10-28T16:33:45.21614383Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674141540` → **200**

```json
{
  "phone": "+380674141540",
  "audience": "CLIENT",
  "code": "421765",
  "sent_at": "2026-10-28T16:33:44.218584179Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b4974b30-8670-47b1-b285-80f2048ae12f",
  "code": "421765",
  "device_ref": "sandbox-25217"
}
```

```json
{
  "session_id": "4a3eddb0-9140-44a1-94e0-8ff507c87321",
  "subject": {
    "type": "CLIENT",
    "id": "d0400691-122e-45b8-b900-1a287dc60f44"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMDQwMDY5MS0xMjJlLTQ1YjgtYjkwMC0xYTI4N2RjNjBmNDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MTI0LCJpYXQiOjE3OTMyMDUyMjQsImp0aSI6ImVhZTZjZDBhLWU3N2YtNGZjZi04M2E4LThiZGU5MGRiMjNjMiIsInNpZCI6IjRhM2VkZGIwLTkxNDAtNDRhMS05NGUwLThmZjUwN2M4NzMyMSJ9.Be-D0MkLrfolhjj0D9g2dPie0BpxciZjoPaqnQEXtn4",
  "access_expires_at": "2026-10-28T16:48:44.505858477Z",
  "refresh_token": "YUq7k4s2sANVMUg8R4KTnkMcEtD_nz2D1wDQXXlo2dc",
  "refresh_expires_at": "2026-11-27T16:33:44.505204606Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d0400691-122e-45b8-b900-1a287dc60f44",
  "session_id": "4a3eddb0-9140-44a1-94e0-8ff507c87321",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e2ea1118-ef30-47ef-b719-f76d248d1761",
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
  "id": "e699bf49-fbec-485f-9db4-3aa60f4f1235",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:38:45.031191Z",
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
  "challenge_id": "a7580905-c3e5-4d96-b05d-65f639fe6a00",
  "expires_at": "2026-10-28T16:38:47.313491135Z",
  "resend_available_at": "2026-10-28T16:33:48.313491135Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674141540` → **200**

```json
{
  "phone": "+380674141540",
  "audience": "CLIENT",
  "code": "098267",
  "sent_at": "2026-10-28T16:33:47.315692182Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "7e9e01bb-32bc-4235-b7cf-7b7316f74b56",
  "challenge_id": "a7580905-c3e5-4d96-b05d-65f639fe6a00",
  "otp_code": "098267"
}
```

```json
{
  "client_id": "d0400691-122e-45b8-b900-1a287dc60f44",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T16:33:47.614160413Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "57c104a2-e2ab-4fba-a725-d1a091e65abf",
  "quote_id": "e699bf49-fbec-485f-9db4-3aa60f4f1235",
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
  "correlation_id": "2f609402-9ae9-4255-ae3e-3acec806900b"
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
  "session_id": "951787f5-4e21-4762-a8ab-00bfa0ed3e2a",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYxMjgsImlhdCI6MTc5MzIwNTIyOCwianRpIjoiYTE4OWZkODMtMTQ0Yi00MTAwLTgyZGItMDg3NjA3ZGNmNjdhIiwic2lkIjoiOTUxNzg3ZjUtNGUyMS00NzYyLWE4YWItMDBiZmEwZWQzZTJhIn0.gmNk6Jvmju5DDSbF1uHhpMCuaFcr4yYQ-B2vYl2SL1Q",
  "access_expires_at": "2026-10-28T16:48:48.465078409Z",
  "refresh_token": "hS558C2E8e5yU8mipvHs7M_2T1uN70ky8JBLwKR7JRE",
  "refresh_expires_at": "2026-10-29T04:33:48.464427638Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "d0400691-122e-45b8-b900-1a287dc60f44",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T16:33:47.61416Z",
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

`POST /api/admin/v1/client-deletions/d0400691-122e-45b8-b900-1a287dc60f44/complete` → **200**

```json
{
  "command_id": "e0343417-946c-4036-ae61-e6d6b511d030",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "d0400691-122e-45b8-b900-1a287dc60f44",
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
  "correlation_id": "e22c673b-d001-454c-8137-913dd98c9c1e"
}
```

Done: client d0400691-122e-45b8-b900-1a287dc60f44 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665078157",
  "device_ref": "sandbox-27700"
}
```

```json
{
  "challenge_id": "6450f66e-2f1c-48c2-8137-0cef16df725b",
  "expires_at": "2026-10-28T16:38:49.568837023Z",
  "resend_available_at": "2026-10-28T16:33:50.568837023Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665078157` → **200**

```json
{
  "phone": "+380665078157",
  "audience": "CLIENT",
  "code": "218723",
  "sent_at": "2026-10-28T16:33:49.571439069Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6450f66e-2f1c-48c2-8137-0cef16df725b",
  "code": "218723",
  "device_ref": "sandbox-27700"
}
```

```json
{
  "session_id": "deefee7d-7bef-4c4d-b6a7-7ca9a64ad694",
  "subject": {
    "type": "CLIENT",
    "id": "8816c26f-19d2-4c68-b7b7-deb417be9078"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE2YzI2Zi0xOWQyLTRjNjgtYjdiNy1kZWI0MTdiZTkwNzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MTI5LCJpYXQiOjE3OTMyMDUyMjksImp0aSI6ImY4ZGM2NTUxLWEyMmMtNGUwMy04OGQ0LWJlMjE1ZDlmOTkyMSIsInNpZCI6ImRlZWZlZTdkLTdiZWYtNGM0ZC1iNmE3LTdjYTlhNjRhZDY5NCJ9.qhtKqXPVbegmGOjd2DfYa0h5pMiiwhv2g2SUea_QRuw",
  "access_expires_at": "2026-10-28T16:48:49.862496485Z",
  "refresh_token": "AvuHvsTMuEwwdNJ2TatXivSp8QcScJPjc24Bt9hhPTM",
  "refresh_expires_at": "2026-11-27T16:33:49.861899306Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8816c26f-19d2-4c68-b7b7-deb417be9078",
  "session_id": "deefee7d-7bef-4c4d-b6a7-7ca9a64ad694",
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
  "session_id": "9da827d7-a613-497c-9543-f13823299fdb",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYxMzAsImlhdCI6MTc5MzIwNTIzMCwianRpIjoiMDNlNDNlNTItNDcyOS00YzE5LWE2ZTgtYjhhNmY1ZmNjMGY3Iiwic2lkIjoiOWRhODI3ZDctYTYxMy00OTdjLTk1NDMtZjEzODIzMjk5ZmRiIn0.1kKmcGc-dZRvatS_Tgo8maD2OvogmiSvi93_lVK3el8",
  "access_expires_at": "2026-10-28T16:48:50.699203331Z",
  "refresh_token": "64B7XsBqmWvBx-ifJAqaX2kUzYxIDseEBQMs5OqGolc",
  "refresh_expires_at": "2026-10-29T04:33:50.697441754Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=5078157&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "8816c26f-19d2-4c68-b7b7-deb417be9078",
      "phone": "+380665078157",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T16:33:49.85997Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/8816c26f-19d2-4c68-b7b7-deb417be9078` → **200**

```json
{
  "client": {
    "id": "8816c26f-19d2-4c68-b7b7-deb417be9078",
    "phone": "+380665078157",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T16:33:49.85997Z",
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

`POST /api/admin/v1/clients/8816c26f-19d2-4c68-b7b7-deb417be9078/block` → **400**

```json
{
  "command_id": "34c89558-d05e-4cbe-aa12-da4e5001f3d0",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/8816c26f-19d2-4c68-b7b7-deb417be9078/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "a7daaad2-4351-496c-bc0f-3245b420ad9b",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/8816c26f-19d2-4c68-b7b7-deb417be9078/block` → **200**

```json
{
  "command_id": "43227ec6-2207-4236-acaa-112a5cf66a42",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "8816c26f-19d2-4c68-b7b7-deb417be9078",
  "phone": "+380665078157",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T16:33:49.85997Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T16:33:51.83564Z",
    "by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
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
  "correlation_id": "dc928741-8591-481f-af73-269b840c29f1"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665078157",
  "device_ref": "sandbox-28639"
}
```

```json
{
  "challenge_id": "a1827c47-8a22-49a6-a12b-dd27b030d737",
  "expires_at": "2026-10-28T16:38:54.376915Z",
  "resend_available_at": "2026-10-28T16:33:55.376915Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665078157` → **200**

```json
{
  "phone": "+380665078157",
  "audience": "CLIENT",
  "code": "831241",
  "sent_at": "2026-10-28T16:33:54.379145571Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "a1827c47-8a22-49a6-a12b-dd27b030d737",
  "code": "831241",
  "device_ref": "sandbox-28639"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "9e041bd2-d6d3-486c-8729-38c5febdecc8"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/8816c26f-19d2-4c68-b7b7-deb417be9078` → **200**

```json
{
  "client": {
    "id": "8816c26f-19d2-4c68-b7b7-deb417be9078",
    "phone": "+380665078157",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T16:33:49.85997Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T16:33:51.83564Z",
      "by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
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

`POST /api/admin/v1/clients/8816c26f-19d2-4c68-b7b7-deb417be9078/unblock` → **200**

```json
{
  "command_id": "ec2f6030-3283-403d-8908-bbc2e28eb3d6",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "8816c26f-19d2-4c68-b7b7-deb417be9078",
  "phone": "+380665078157",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T16:33:49.85997Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665078157",
  "device_ref": "sandbox-2101"
}
```

```json
{
  "challenge_id": "d0155f07-702b-48cf-adbf-a356662b6632",
  "expires_at": "2026-10-28T16:38:57.503599982Z",
  "resend_available_at": "2026-10-28T16:33:58.503599982Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665078157` → **200**

```json
{
  "phone": "+380665078157",
  "audience": "CLIENT",
  "code": "861118",
  "sent_at": "2026-10-28T16:33:57.506681754Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d0155f07-702b-48cf-adbf-a356662b6632",
  "code": "861118",
  "device_ref": "sandbox-2101"
}
```

```json
{
  "session_id": "bf0682a8-1a38-4c26-a8a4-2be681c053ab",
  "subject": {
    "type": "CLIENT",
    "id": "8816c26f-19d2-4c68-b7b7-deb417be9078"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE2YzI2Zi0xOWQyLTRjNjgtYjdiNy1kZWI0MTdiZTkwNzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MTM3LCJpYXQiOjE3OTMyMDUyMzcsImp0aSI6IjMwNmQ5NGIxLTUxNTktNDkxNy04ZGZiLTA1MWY2N2ZiZTA5MCIsInNpZCI6ImJmMDY4MmE4LTFhMzgtNGMyNi1hOGE0LTJiZTY4MWMwNTNhYiJ9.mzZ0hWnMf70XJhoW6fMyButv3NSv_dnWc3wausO1JHw",
  "access_expires_at": "2026-10-28T16:48:57.79874797Z",
  "refresh_token": "qyNSRQe4G66dtCB3Hatv0_Ox6AbHuZCRSsgsi82uvZs",
  "refresh_expires_at": "2026-11-27T16:33:57.798025867Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8816c26f-19d2-4c68-b7b7-deb417be9078",
  "session_id": "bf0682a8-1a38-4c26-a8a4-2be681c053ab",
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
  "phone": "+380666838429",
  "device_ref": "sandbox-30520"
}
```

```json
{
  "challenge_id": "47d1b0e7-1bdb-4381-86bc-cd8de650e29b",
  "expires_at": "2026-10-28T16:38:58.333292443Z",
  "resend_available_at": "2026-10-28T16:33:59.333292443Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666838429` → **200**

```json
{
  "phone": "+380666838429",
  "audience": "CLIENT",
  "code": "266161",
  "sent_at": "2026-10-28T16:33:58.3355594Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "47d1b0e7-1bdb-4381-86bc-cd8de650e29b",
  "code": "266161",
  "device_ref": "sandbox-30520"
}
```

```json
{
  "session_id": "a8642928-93fc-4854-a1ea-6a1a1fc5e77f",
  "subject": {
    "type": "CLIENT",
    "id": "6103eaa3-353a-4b90-befa-73444e2d8e3a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTAzZWFhMy0zNTNhLTRiOTAtYmVmYS03MzQ0NGUyZDhlM2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MTM4LCJpYXQiOjE3OTMyMDUyMzgsImp0aSI6IjM3MjEzNjg1LTExNGItNGZhMy04MDYxLThjZTM3MDE4Mzk0NSIsInNpZCI6ImE4NjQyOTI4LTkzZmMtNDg1NC1hMWVhLTZhMWExZmM1ZTc3ZiJ9.ZaDs28g3obYuJ7hpF718oRGSSqw-xHvIeOa2qCDLLfE",
  "access_expires_at": "2026-10-28T16:48:58.627587582Z",
  "refresh_token": "6yrsUxTjbR9A5N3qBve4vB8pmH_lxdipns_j1i6PifY",
  "refresh_expires_at": "2026-11-27T16:33:58.627045814Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "82f72d7a-08ac-4f92-8e06-4480b8509895",
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
  "id": "b30abe5d-3344-499d-8d57-a8291318329d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:38:58.896677Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 1eddfd36-0fcb-4f95-b128-fad225159888) → **201**

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
  "session_id": "775abf6f-fdee-49ef-abe1-e0fa5d99a271",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYxMzksImlhdCI6MTc5MzIwNTIzOSwianRpIjoiZDMzNzRlM2QtYTM4YS00ZGZjLTkzOWItZGE3ODMyMjNjMDE2Iiwic2lkIjoiNzc1YWJmNmYtZmRlZS00OWVmLWFiZTEtZTBmYTVkOTlhMjcxIn0.uVbLk7kfP61mXxy5QxXn5XIg7dRvLiy4GcaLKdkWKdw",
  "access_expires_at": "2026-10-28T16:48:59.511673323Z",
  "refresh_token": "T6lqeqZVbSPsrZP2NjadUrPO5M756EKERpPVH97KNgo",
  "refresh_expires_at": "2026-10-29T04:33:59.511056675Z",
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
  "session_id": "d6ce3128-c363-4604-8146-08f1b7613501",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYxNDAsImlhdCI6MTc5MzIwNTI0MCwianRpIjoiOWRlZjQzYjctMTI1Ni00ZWRkLThkYWQtMGUyNzI5NTliYjIyIiwic2lkIjoiZDZjZTMxMjgtYzM2My00NjA0LTgxNDYtMDhmMWI3NjEzNTAxIn0.yRcl9Ib2TR8ozIyyZhG4L6rUFz0ym2JQP91H-25o2Tw",
  "access_expires_at": "2026-10-28T16:49:00.07049157Z",
  "refresh_token": "hmFacACnFCMvVErc3-llib1uZVMRbSdvr4k2dZFVUXY",
  "refresh_expires_at": "2026-10-29T04:34:00.069892846Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/6930388f-14d5-4e8f-b6ec-8cda4a1821a3/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:33:59.179434Z",
      "actor": {
        "type": "CLIENT",
        "id": "6103eaa3-353a-4b90-befa-73444e2d8e3a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6930388f-14d5-4e8f-b6ec-8cda4a1821a3",
        "quote_id": "b30abe5d-3344-499d-8d57-a8291318329d",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "1eddfd36-0fcb-4f95-b128-fad225159888"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:33:59.181336Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6930388f-14d5-4e8f-b6ec-8cda4a1821a3",
        "attempt_id": "5ff7d741-480b-4700-93bc-96a0ce6fd9c4",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "1eddfd36-0fcb-4f95-b128-fad225159888"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T16:33:59.191319Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6930388f-14d5-4e8f-b6ec-8cda4a1821a3",
        "attempt_id": "5ff7d741-480b-4700-93bc-96a0ce6fd9c4"
      },
      "correlation_id": "1eddfd36-0fcb-4f95-b128-fad225159888"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "5ff7d741-480b-4700-93bc-96a0ce6fd9c4",
        "generation": 1,
        "started_at": "2026-10-28T16:33:59.180198Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T16:33:59.191319Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T16:33:59.182284Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/1eddfd36-0fcb-4f95-b128-fad225159888` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "6930388f-14d5-4e8f-b6ec-8cda4a1821a3:0",
      "order_id": "6930388f-14d5-4e8f-b6ec-8cda4a1821a3",
      "at": "2026-10-28T16:33:59.179434Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "6930388f-14d5-4e8f-b6ec-8cda4a1821a3:1",
      "order_id": "6930388f-14d5-4e8f-b6ec-8cda4a1821a3",
      "at": "2026-10-28T16:33:59.181336Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "6930388f-14d5-4e8f-b6ec-8cda4a1821a3:2",
      "order_id": "6930388f-14d5-4e8f-b6ec-8cda4a1821a3",
      "at": "2026-10-28T16:33:59.191319Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/c9457661-f05b-4e09-9729-2207743a98a9` → **200**

```json
{
  "found": []
}
```

Done: request 1eddfd36-0fcb-4f95-b128-fad225159888 — order 6930388f-14d5-4e8f-b6ec-8cda4a1821a3 found by its id.

`GET /api/rider/v1/orders/6930388f-14d5-4e8f-b6ec-8cda4a1821a3` → **200**

```json
{
  "id": "6930388f-14d5-4e8f-b6ec-8cda4a1821a3",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6103eaa3-353a-4b90-befa-73444e2d8e3a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:33:59.178836Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/6930388f-14d5-4e8f-b6ec-8cda4a1821a3/cancel` → **200**

```json
{
  "command_id": "9eecfd07-831e-4693-bdc9-81f1dd58ff85",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6930388f-14d5-4e8f-b6ec-8cda4a1821a3",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6103eaa3-353a-4b90-befa-73444e2d8e3a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:33:59.178836Z",
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
  "discount_minor": 0
}
```

# Scenario: data-export

## A rider signs in and asks for a code to confirm the copy

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634310450",
  "device_ref": "sandbox-217"
}
```

```json
{
  "challenge_id": "22fdee73-80c6-45ae-8554-cca144dcbe76",
  "expires_at": "2026-10-28T16:39:01.739538477Z",
  "resend_available_at": "2026-10-28T16:34:02.739538477Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634310450` → **200**

```json
{
  "phone": "+380634310450",
  "audience": "CLIENT",
  "code": "741880",
  "sent_at": "2026-10-28T16:34:01.741854165Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "22fdee73-80c6-45ae-8554-cca144dcbe76",
  "code": "741880",
  "device_ref": "sandbox-217"
}
```

```json
{
  "session_id": "d955da93-f3b5-4b1c-a651-171566241315",
  "subject": {
    "type": "CLIENT",
    "id": "1d888899-a222-4f9b-9bca-e3cccd6f17b3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZDg4ODg5OS1hMjIyLTRmOWItOWJjYS1lM2NjY2Q2ZjE3YjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MTQyLCJpYXQiOjE3OTMyMDUyNDIsImp0aSI6IjRkZDhjZmE1LTRjYzgtNDBkOC1hM2NmLWI0YjQ1OWY1NDJiOSIsInNpZCI6ImQ5NTVkYTkzLWYzYjUtNGIxYy1hNjUxLTE3MTU2NjI0MTMxNSJ9.ptBdP70ZeLHlL-dr4aL1Gf9m5xIjuGmQEWMDjZA1lKg",
  "access_expires_at": "2026-10-28T16:49:02.026917511Z",
  "refresh_token": "lHxwjWBrMwaovgEjlnzbR4D0flm-PBa9LY1Q5lm_ok4",
  "refresh_expires_at": "2026-11-27T16:34:02.026356327Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "f1ccbf31-c3c3-4c21-bb42-6cbef605d8ec",
  "expires_at": "2026-10-28T16:39:04.293860703Z",
  "resend_available_at": "2026-10-28T16:34:05.293860703Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634310450` → **200**

```json
{
  "phone": "+380634310450",
  "audience": "CLIENT",
  "code": "548454",
  "sent_at": "2026-10-28T16:34:04.29627463Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "77988fad-bfa5-4992-a637-cc90b81ddf70",
  "challenge_id": "f1ccbf31-c3c3-4c21-bb42-6cbef605d8ec",
  "otp_code": "548454"
}
```

```json
{
  "id": "ed7a01a4-118a-4dc2-9a2d-7fe010216bd2",
  "state": "PENDING",
  "created_at": "2026-10-28T16:34:04.595864Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/ed7a01a4-118a-4dc2-9a2d-7fe010216bd2` → **200**

```json
{
  "id": "ed7a01a4-118a-4dc2-9a2d-7fe010216bd2",
  "state": "PENDING",
  "created_at": "2026-10-28T16:34:04.595864Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/ed7a01a4-118a-4dc2-9a2d-7fe010216bd2` → **200**

```json
{
  "id": "ed7a01a4-118a-4dc2-9a2d-7fe010216bd2",
  "state": "PENDING",
  "created_at": "2026-10-28T16:34:04.595864Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/ed7a01a4-118a-4dc2-9a2d-7fe010216bd2` → **200**

```json
{
  "id": "ed7a01a4-118a-4dc2-9a2d-7fe010216bd2",
  "state": "READY",
  "created_at": "2026-10-28T16:34:04.595864Z",
  "ready_at": "2026-10-28T16:34:06.770842Z",
  "expires_at": "2026-11-04T16:34:06.770842Z",
  "size_bytes": 1029
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/ed7a01a4-118a-4dc2-9a2d-7fe010216bd2/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633850859",
  "device_ref": "sandbox-25851"
}
```

```json
{
  "challenge_id": "a1b87f71-6c1e-4457-84d5-6cf3a6ae463c",
  "expires_at": "2026-10-28T16:39:07.741911426Z",
  "resend_available_at": "2026-10-28T16:34:08.741911426Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633850859` → **200**

```json
{
  "phone": "+380633850859",
  "audience": "CLIENT",
  "code": "594626",
  "sent_at": "2026-10-28T16:34:07.744260047Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a1b87f71-6c1e-4457-84d5-6cf3a6ae463c",
  "code": "594626",
  "device_ref": "sandbox-25851"
}
```

```json
{
  "session_id": "e9143963-9449-4fac-948f-d52b14c53290",
  "subject": {
    "type": "CLIENT",
    "id": "251bab97-eccd-41fa-a644-b53ae66b7ae0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNTFiYWI5Ny1lY2NkLTQxZmEtYTY0NC1iNTNhZTY2YjdhZTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MTQ4LCJpYXQiOjE3OTMyMDUyNDgsImp0aSI6ImFlN2QzMWRiLTJjYmMtNGJlNC1iYjQyLTIwMWVlYmU4NzVlOCIsInNpZCI6ImU5MTQzOTYzLTk0NDktNGZhYy05NDhmLWQ1MmIxNGM1MzI5MCJ9.Bccdl_1iYbU_MiIRfBe5WRvurxR0i1F3gBVYl9IXr3I",
  "access_expires_at": "2026-10-28T16:49:08.037355161Z",
  "refresh_token": "BJNp5RlKI88_BPgmRtHyziFMX8Dkk1kLo8BlxRxPDd0",
  "refresh_expires_at": "2026-11-27T16:34:08.036755018Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/ed7a01a4-118a-4dc2-9a2d-7fe010216bd2/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/ed7a01a4-118a-4dc2-9a2d-7fe010216bd2/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5128bf15-ae0b-47c7-bb66-eb39d5c07205"
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
  "session_id": "45a76f0d-8abf-4bba-a032-8cd2740f01ba",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYxNDgsImlhdCI6MTc5MzIwNTI0OCwianRpIjoiMzZhNWIzYjEtYzgzZS00ZTI4LTk0NDctYzA2N2Q2MmY4OTFlIiwic2lkIjoiNDVhNzZmMGQtOGFiZi00YmJhLWEwMzItOGNkMjc0MGYwMWJhIn0.qdGaqaN_ZPXhbhwUjR2SYNcK6Z6CgO6hf0u6BWfvQgk",
  "access_expires_at": "2026-10-28T16:49:08.877318573Z",
  "refresh_token": "Z17gZBFaLdCY4pQ4Qv4hG-wkAlWu7XyDCPcbRoKQgQQ",
  "refresh_expires_at": "2026-10-29T04:34:08.87673624Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1d888899-a222-4f9b-9bca-e3cccd6f17b3",
  "session_id": "d955da93-f3b5-4b1c-a651-171566241315",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/1d888899-a222-4f9b-9bca-e3cccd6f17b3/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "ed7a01a4-118a-4dc2-9a2d-7fe010216bd2",
      "state": "READY",
      "created_at": "2026-10-28T16:34:04.595864Z",
      "ready_at": "2026-10-28T16:34:06.770842Z",
      "expires_at": "2026-11-04T16:34:06.770842Z",
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
  "device_ref": "sandbox-18509"
}
```

```json
{
  "challenge_id": "2490e6c0-d1a1-4114-b573-c4b343e59326",
  "expires_at": "2026-10-28T16:39:09.661505424Z",
  "resend_available_at": "2026-10-28T16:34:10.661505424Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "779809",
  "sent_at": "2026-10-28T16:34:09.663935354Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2490e6c0-d1a1-4114-b573-c4b343e59326",
  "code": "779809",
  "device_ref": "sandbox-18509"
}
```

```json
{
  "session_id": "ee0f1d65-e5ad-4a6c-9419-6f1393ffab84",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjE0OSwiaWF0IjoxNzkzMjA1MjQ5LCJqdGkiOiJjZmIwNjg0MS1kN2EwLTRjNWUtODFmMy05NGYwMWNhZGE0NWYiLCJzaWQiOiJlZTBmMWQ2NS1lNWFkLTRhNmMtOTQxOS02ZjEzOTNmZmFiODQifQ.Y7zjHXJlDac0-Sgt6e-Ts0T63aJuzyQHsqxu6QvdyH0",
  "access_expires_at": "2026-10-28T16:49:09.948847766Z",
  "refresh_token": "W21wG2BmOs1_v_qtSuu2PLgJnX2qjazczeIacjNe1Bw",
  "refresh_expires_at": "2026-11-27T16:34:09.948173933Z",
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
  "device_ref": "sandbox-3863"
}
```

```json
{
  "challenge_id": "445ca0c2-6bec-4172-9017-1e1ec6d84a5c",
  "expires_at": "2026-10-28T16:39:10.478891064Z",
  "resend_available_at": "2026-10-28T16:34:11.478891064Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "568937",
  "sent_at": "2026-10-28T16:34:10.481179484Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "445ca0c2-6bec-4172-9017-1e1ec6d84a5c",
  "code": "568937",
  "device_ref": "sandbox-3863"
}
```

```json
{
  "session_id": "0ce2174d-499c-4d2d-b002-ea8906b7e419",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjE1MCwiaWF0IjoxNzkzMjA1MjUwLCJqdGkiOiIzOGZlOTgyZi04ODBlLTRiM2QtODQ1Yy05NWY4MDdhNzhmZjUiLCJzaWQiOiIwY2UyMTc0ZC00OTljLTRkMmQtYjAwMi1lYTg5MDZiN2U0MTkifQ.mlIxWzfEq2iGYi6hIhHfafryLU0_YnxY5O7TMq2KxFo",
  "access_expires_at": "2026-10-28T16:49:10.76739659Z",
  "refresh_token": "3Lw7xDSi-8NfnvqXuwe_15JneZt1IBzKa43AsNCX-ws",
  "refresh_expires_at": "2026-11-27T16:34:10.766742293Z",
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
  "command_id": "d13cf76d-7c16-4dba-bea7-f4574ed98c17",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:34:11Z",
    "sequence": 1793205251310
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7276fd68-b79c-494e-bf95-9e14e43b58fa",
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
  "last_heartbeat_at": "2026-10-28T16:34:11.329765Z",
  "last_location_at": "2026-10-28T16:34:11.329765Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-11400"
}
```

```json
{
  "challenge_id": "e21aacdf-d994-4867-93da-74a33b9ebac4",
  "expires_at": "2026-10-28T16:39:11.591584859Z",
  "resend_available_at": "2026-10-28T16:34:12.591584859Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "615301",
  "sent_at": "2026-10-28T16:34:11.595039462Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e21aacdf-d994-4867-93da-74a33b9ebac4",
  "code": "615301",
  "device_ref": "sandbox-11400"
}
```

```json
{
  "session_id": "e023ffed-ec80-4e6c-bf7a-da1621507d7e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjE1MSwiaWF0IjoxNzkzMjA1MjUxLCJqdGkiOiJhYzQ3YjI3Yi1mZDI2LTQ5YjMtODM1Mi05OWFhZTEwNThkODAiLCJzaWQiOiJlMDIzZmZlZC1lYzgwLTRlNmMtYmY3YS1kYTE2MjE1MDdkN2UifQ.pTsQig_C-4zTIY9yAasYV7vzrp17rYz3j7l9JOvqyZA",
  "access_expires_at": "2026-10-28T16:49:11.890116722Z",
  "refresh_token": "ysF8owzbdpBv0EkqwN3y2TfufoPT8gwn8VWdEK7EGrg",
  "refresh_expires_at": "2026-11-27T16:34:11.889443141Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "364979ce-3bfd-4f5d-a478-7e63a7097b09",
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
  "last_heartbeat_at": "2026-10-28T16:33:12.68466Z",
  "last_location_at": "2026-10-28T16:33:12.68466Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/364979ce-3bfd-4f5d-a478-7e63a7097b09/handover` → **200**

```json
{
  "command_id": "1a2e6142-a14a-45eb-ab5a-807452080f35",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "364979ce-3bfd-4f5d-a478-7e63a7097b09",
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
  "last_heartbeat_at": "2026-10-28T16:33:12.68466Z",
  "last_location_at": "2026-10-28T16:33:12.68466Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/364979ce-3bfd-4f5d-a478-7e63a7097b09/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:34:12Z",
    "sequence": 1793205252675
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "364979ce-3bfd-4f5d-a478-7e63a7097b09",
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
  "last_heartbeat_at": "2026-10-28T16:34:12.694385Z",
  "last_location_at": "2026-10-28T16:34:12.694385Z",
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
  "session_id": "152fd79d-00a3-4ac1-adb2-7f273fd9be86",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYxNTMsImlhdCI6MTc5MzIwNTI1MywianRpIjoiOGM5MTU3Y2YtZTRjOC00MWEyLWI5ZWUtMGRkYjdmOGJhZWE2Iiwic2lkIjoiMTUyZmQ3OWQtMDBhMy00YWMxLWFkYjItN2YyNzNmZDliZTg2In0.gI3opRS4rZfITRrCPjhU8yc9IcB3F4amKBpMSluHtsY",
  "access_expires_at": "2026-10-28T16:49:13.248756027Z",
  "refresh_token": "3gWMynMYle91nt7eoUomNJkKUrXeSOdOAMD7kJlkl5Y",
  "refresh_expires_at": "2026-10-29T04:34:13.248198941Z",
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
  "session_id": "8834d222-1aeb-4e59-9380-14ec39fde938",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYxNTMsImlhdCI6MTc5MzIwNTI1MywianRpIjoiZmRkYTFjODctYjExYS00ODcyLWFhZTYtNTIxYTE4MTUwZWY5Iiwic2lkIjoiODgzNGQyMjItMWFlYi00ZTU5LTkzODAtMTRlYzM5ZmRlOTM4In0.J6aoEIO4n0p0BhuxKXlJG65Tyg2MFXqcwGhz502EOTc",
  "access_expires_at": "2026-10-28T16:49:13.809726462Z",
  "refresh_token": "-A7fZtDK_NiejLGC2hOhhHpgnFLKsoqWHyhfqXpvdZU",
  "refresh_expires_at": "2026-10-29T04:34:13.809181127Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380689778858",
  "device_ref": "sandbox-5302"
}
```

```json
{
  "challenge_id": "e2510775-391e-40b7-9296-0866a115bf42",
  "expires_at": "2026-10-28T16:39:14.073637322Z",
  "resend_available_at": "2026-10-28T16:34:15.073637322Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380689778858` → **200**

```json
{
  "phone": "+380689778858",
  "audience": "CLIENT",
  "code": "926114",
  "sent_at": "2026-10-28T16:34:14.075971113Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e2510775-391e-40b7-9296-0866a115bf42",
  "code": "926114",
  "device_ref": "sandbox-5302"
}
```

```json
{
  "session_id": "0c256d4d-3ea2-4b00-b383-5638c6948f62",
  "subject": {
    "type": "CLIENT",
    "id": "e47a67c4-9721-4c61-8742-c14522cc26c5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNDdhNjdjNC05NzIxLTRjNjEtODc0Mi1jMTQ1MjJjYzI2YzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MTU0LCJpYXQiOjE3OTMyMDUyNTQsImp0aSI6IjZhODMzODM1LWU1ZWUtNGM5YS1hOWM0LWU3NzQ5OGQ1NTRlNSIsInNpZCI6IjBjMjU2ZDRkLTNlYTItNGIwMC1iMzgzLTU2MzhjNjk0OGY2MiJ9.soTuwtGJWalc81pEIM-Nbrzty-KMzXfCkhEp66Izm1c",
  "access_expires_at": "2026-10-28T16:49:14.361200795Z",
  "refresh_token": "G944wQeDtlavXWcDJ8u26SplCq4WAU8lrdphnB44Vh0",
  "refresh_expires_at": "2026-11-27T16:34:14.360625525Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d1758886-10bb-409e-b712-14d30dec0c53",
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
  "id": "513305b2-ff9e-4168-bb27-3618588fc441",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:39:14.631690Z",
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
  "command_id": "529a59ef-475f-4f67-80ac-97d843c715af",
  "quote_id": "513305b2-ff9e-4168-bb27-3618588fc441",
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
  "id": "03132838-19e5-42fa-911a-d2de24527171",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e47a67c4-9721-4c61-8742-c14522cc26c5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:34:14.919311Z",
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
    "id": "7ac4d01c-795f-4434-ba03-f941ce804687",
    "order_id": "03132838-19e5-42fa-911a-d2de24527171",
    "expires_at": "2026-10-28T16:34:29.922564Z",
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

`POST /api/driver/v1/offers/7ac4d01c-795f-4434-ba03-f941ce804687/reject` → **204**

```json
{
  "command_id": "748634a4-0932-40fc-a73f-f705941f755f"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "4a893d76-2d62-4a4b-88fb-98e49339323f",
    "order_id": "03132838-19e5-42fa-911a-d2de24527171",
    "expires_at": "2026-10-28T16:34:30.481684Z",
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

`POST /api/driver/v1/offers/4a893d76-2d62-4a4b-88fb-98e49339323f/accept` → **200**

```json
{
  "command_id": "0ab3c3c6-a2ae-45d8-96dc-de5c5be87859"
}
```

```json
{
  "id": "272980a0-1e9e-4a8d-990e-5e300e107445",
  "order_id": "03132838-19e5-42fa-911a-d2de24527171",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5765793a-3772-47d5-b597-aef8f64c15fe",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/03132838-19e5-42fa-911a-d2de24527171/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:34:14.919854Z",
      "actor": {
        "type": "CLIENT",
        "id": "e47a67c4-9721-4c61-8742-c14522cc26c5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "03132838-19e5-42fa-911a-d2de24527171",
        "quote_id": "513305b2-ff9e-4168-bb27-3618588fc441",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "045de8e8-5ff0-4b8d-b28e-f830fe5c84eb"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:34:14.92175Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "03132838-19e5-42fa-911a-d2de24527171",
        "attempt_id": "2ca98e81-60eb-4b53-9999-adfb79deb353",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "045de8e8-5ff0-4b8d-b28e-f830fe5c84eb"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T16:34:14.928335Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "7ac4d01c-795f-4434-ba03-f941ce804687",
        "order_id": "03132838-19e5-42fa-911a-d2de24527171",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "045de8e8-5ff0-4b8d-b28e-f830fe5c84eb"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T16:34:15.480664Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "7ac4d01c-795f-4434-ba03-f941ce804687",
        "order_id": "03132838-19e5-42fa-911a-d2de24527171"
      },
      "correlation_id": "b6afa09d-4af9-4b01-8f1b-0618af40116d"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 03132838-19e5-42fa-911a-d2de24527171 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/03132838-19e5-42fa-911a-d2de24527171` → **200**

```json
{
  "id": "03132838-19e5-42fa-911a-d2de24527171",
  "short_number": 6,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "e47a67c4-9721-4c61-8742-c14522cc26c5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "272980a0-1e9e-4a8d-990e-5e300e107445",
    "order_id": "03132838-19e5-42fa-911a-d2de24527171",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "5765793a-3772-47d5-b597-aef8f64c15fe",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T16:34:14.919311Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/03132838-19e5-42fa-911a-d2de24527171/cancel` → **200**

```json
{
  "command_id": "287b6f04-7811-4a7f-9f75-401563a8761a",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "03132838-19e5-42fa-911a-d2de24527171",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "e47a67c4-9721-4c61-8742-c14522cc26c5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "272980a0-1e9e-4a8d-990e-5e300e107445",
    "order_id": "03132838-19e5-42fa-911a-d2de24527171",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "5765793a-3772-47d5-b597-aef8f64c15fe",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T16:34:14.919311Z",
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
  "session_id": "7276fd68-b79c-494e-bf95-9e14e43b58fa",
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
  "last_heartbeat_at": "2026-10-28T16:34:11.329765Z",
  "last_location_at": "2026-10-28T16:34:11.329765Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7276fd68-b79c-494e-bf95-9e14e43b58fa/close` → **200**

```json
{
  "command_id": "9d3ed37e-1c56-452f-a6b8-5333fe034ac0",
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
  "session_id": "364979ce-3bfd-4f5d-a478-7e63a7097b09",
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
  "last_heartbeat_at": "2026-10-28T16:34:12.694385Z",
  "last_location_at": "2026-10-28T16:34:12.694385Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/364979ce-3bfd-4f5d-a478-7e63a7097b09/close` → **200**

```json
{
  "command_id": "c30e8363-0960-48d2-994e-55ce0e24921b",
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
  "device_ref": "sandbox-12411"
}
```

```json
{
  "challenge_id": "beb98d26-3f10-466b-a133-6749067a8e9c",
  "expires_at": "2026-10-28T16:39:18.319222705Z",
  "resend_available_at": "2026-10-28T16:34:19.319222705Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "556628",
  "sent_at": "2026-10-28T16:34:18.321732394Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "beb98d26-3f10-466b-a133-6749067a8e9c",
  "code": "556628",
  "device_ref": "sandbox-12411"
}
```

```json
{
  "session_id": "9a9767c5-fbd2-459d-8990-a7ee9e9da168",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjE1OCwiaWF0IjoxNzkzMjA1MjU4LCJqdGkiOiIyYjNiOGUzMy0yYWM5LTQ1MWItYWM5Ny04Y2JmYjdjNGRjZmEiLCJzaWQiOiI5YTk3NjdjNS1mYmQyLTQ1OWQtODk5MC1hN2VlOWU5ZGExNjgifQ.uFKKgoSAnsoVhaiodSwH56bPmEVGj8knfrvUJRQHuS4",
  "access_expires_at": "2026-10-28T16:49:18.621682634Z",
  "refresh_token": "8TDO_JVkyIROenbJQ8_Kd700TLUPa5-CtsNutxxk4y0",
  "refresh_expires_at": "2026-11-27T16:34:18.620962695Z",
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
  "command_id": "6d624227-868c-44a1-becc-4e5cc50de236",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:34:19Z",
    "sequence": 1793205259145
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "93bac51b-9d0e-44d4-b931-bb33973b35b7",
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
  "last_heartbeat_at": "2026-10-28T16:34:19.164147Z",
  "last_location_at": "2026-10-28T16:34:19.164147Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673529158",
  "device_ref": "sandbox-9940"
}
```

```json
{
  "challenge_id": "22908d2f-c796-4413-9d58-666a65f5873c",
  "expires_at": "2026-10-28T16:39:19.430910417Z",
  "resend_available_at": "2026-10-28T16:34:20.430910417Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673529158` → **200**

```json
{
  "phone": "+380673529158",
  "audience": "CLIENT",
  "code": "244177",
  "sent_at": "2026-10-28T16:34:19.433764422Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "22908d2f-c796-4413-9d58-666a65f5873c",
  "code": "244177",
  "device_ref": "sandbox-9940"
}
```

```json
{
  "session_id": "ee789915-b370-4046-880b-3f0311e3200d",
  "subject": {
    "type": "CLIENT",
    "id": "b8288fd6-6adf-4c61-aa3c-7de29858ea72"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODI4OGZkNi02YWRmLTRjNjEtYWEzYy03ZGUyOTg1OGVhNzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MTU5LCJpYXQiOjE3OTMyMDUyNTksImp0aSI6IjFhMjkyZTE4LTBkZWEtNGNmYS04Yjg0LTkwMjk4ODIwNjA5NiIsInNpZCI6ImVlNzg5OTE1LWIzNzAtNDA0Ni04ODBiLTNmMDMxMWUzMjAwZCJ9.OImVlkxZxyjFfwVnJlgdfYVHrvAMozMAsjCLB5o5-10",
  "access_expires_at": "2026-10-28T16:49:19.718445708Z",
  "refresh_token": "cHyn5nywj1CMbvEYTZlrLs3cWBkPIFX-IuSqvyyrmdA",
  "refresh_expires_at": "2026-11-27T16:34:19.71789826Z",
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
  "command_id": "948dcdde-2eb3-460c-9c8b-54e1372c018e",
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
  "id": "edb0a3b5-dfe4-4301-97a3-17d1d35ecd2a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:39:20.246459Z",
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
  "command_id": "c99986cb-edfd-4918-917e-a03cc6694144",
  "platform": "ANDROID",
  "token": "sandbox-driver-2a25e683-e913-4cc2-87e1-b1bcb1b20788"
}
```

```json
{
  "id": "8fb5ce7d-a003-4793-8117-32aa78fb427b",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T16:34:20.531251Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "79d5f677-db5e-4dad-a9be-f60716bfa522",
  "platform": "ANDROID",
  "token": "sandbox-rider-61d3139d-b218-4de0-9b72-67e899fc350f"
}
```

```json
{
  "id": "a8481061-0a93-4af8-be8b-1fe3035ebba4",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T16:34:20.799809Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2c5e7d93-2a4d-4ec9-bc35-b7117f62bf0c",
  "quote_id": "edb0a3b5-dfe4-4301-97a3-17d1d35ecd2a",
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
  "id": "f8b80a4d-afb0-4e45-8c5a-757f4d7870a8",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b8288fd6-6adf-4c61-aa3c-7de29858ea72",
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
  "created_at": "2026-10-28T16:34:21.073093Z",
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
    "id": "46cab5b6-dd3c-4766-bc7b-a690b1ac254e",
    "order_id": "f8b80a4d-afb0-4e45-8c5a-757f4d7870a8",
    "expires_at": "2026-10-28T16:34:36.076304Z",
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

`POST /api/driver/v1/offers/46cab5b6-dd3c-4766-bc7b-a690b1ac254e/accept` → **200**

```json
{
  "command_id": "5b70e59b-5892-4265-8837-59ed16189aa3"
}
```

```json
{
  "id": "38a992eb-46ab-4163-a232-0064b0d92a94",
  "order_id": "f8b80a4d-afb0-4e45-8c5a-757f4d7870a8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c676aa0a-f591-4c81-95cc-947b8fefdce0",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T16:34:21.479Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T16:34:21.479Z` → **200**

```json
[
  {
    "at": "2026-10-28T16:34:22.015194807Z",
    "token_suffix": "b20788",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "ad17a493-fce1-4108-862a-9ce6eff01e85",
      "order_version": "2",
      "order_id": "f8b80a4d-afb0-4e45-8c5a-757f4d7870a8",
      "type": "driver.offer",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380673529158&after=2026-10-28T16:34:21.479Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380673529158&after=2026-10-28T16:34:21.479Z` → **200**

```json
[
  {
    "at": "2026-10-28T16:34:23.020546393Z",
    "token_suffix": "fc350f",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "62d84b93-639d-4d8c-95fa-6b0e8a6f378c",
      "order_version": "3",
      "order_id": "f8b80a4d-afb0-4e45-8c5a-757f4d7870a8",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/f8b80a4d-afb0-4e45-8c5a-757f4d7870a8/messages` → **201**

```json
{
  "command_id": "cc728ef6-128c-4b43-997a-ae3044d40d32",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "11c0a036-d598-4158-9487-5f0bf92b0cc9",
  "order_id": "f8b80a4d-afb0-4e45-8c5a-757f4d7870a8",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T16:34:24.019296277Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c676aa0a-f591-4c81-95cc-947b8fefdce0",
  "order_id": "f8b80a4d-afb0-4e45-8c5a-757f4d7870a8",
  "assignment_id": "38a992eb-46ab-4163-a232-0064b0d92a94",
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

`POST /api/driver/v1/trips/c676aa0a-f591-4c81-95cc-947b8fefdce0/messages` → **201**

```json
{
  "command_id": "83947719-afe3-4a29-999d-e0da811f11c8",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "f26b7f1a-5e2d-4c33-b1a7-c21d59b7ef15",
  "order_id": "f8b80a4d-afb0-4e45-8c5a-757f4d7870a8",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T16:34:24.545384372Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/f8b80a4d-afb0-4e45-8c5a-757f4d7870a8/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/c676aa0a-f591-4c81-95cc-947b8fefdce0/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380673529158"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/93bac51b-9d0e-44d4-b931-bb33973b35b7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:34:25Z",
    "sequence": 1793205265321
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "93bac51b-9d0e-44d4-b931-bb33973b35b7",
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
  "last_heartbeat_at": "2026-10-28T16:34:25.34077Z",
  "last_location_at": "2026-10-28T16:34:25.34077Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c676aa0a-f591-4c81-95cc-947b8fefdce0",
  "order_id": "f8b80a4d-afb0-4e45-8c5a-757f4d7870a8",
  "assignment_id": "38a992eb-46ab-4163-a232-0064b0d92a94",
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

`POST /api/driver/v1/trips/c676aa0a-f591-4c81-95cc-947b8fefdce0/arrive` → **200**

```json
{
  "command_id": "b06301e1-abac-4476-b020-554087578d54",
  "expected_version": 0
}
```

```json
{
  "id": "c676aa0a-f591-4c81-95cc-947b8fefdce0",
  "order_id": "f8b80a4d-afb0-4e45-8c5a-757f4d7870a8",
  "assignment_id": "38a992eb-46ab-4163-a232-0064b0d92a94",
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
  "arrived_at": "2026-10-28T16:34:25.874526Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c676aa0a-f591-4c81-95cc-947b8fefdce0/start` → **200**

```json
{
  "command_id": "29fc474c-ca33-41e5-9fbf-7696a0ab1e03",
  "expected_version": 1
}
```

```json
{
  "id": "c676aa0a-f591-4c81-95cc-947b8fefdce0",
  "order_id": "f8b80a4d-afb0-4e45-8c5a-757f4d7870a8",
  "assignment_id": "38a992eb-46ab-4163-a232-0064b0d92a94",
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
  "arrived_at": "2026-10-28T16:34:25.874526Z",
  "started_at": "2026-10-28T16:34:26.15302Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/93bac51b-9d0e-44d4-b931-bb33973b35b7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:34:26Z",
    "sequence": 1793205266425
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "93bac51b-9d0e-44d4-b931-bb33973b35b7",
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
  "last_heartbeat_at": "2026-10-28T16:34:26.445747Z",
  "last_location_at": "2026-10-28T16:34:26.445747Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/c676aa0a-f591-4c81-95cc-947b8fefdce0/complete` → **200**

```json
{
  "command_id": "59151049-f02a-4194-8aa1-eaaeebd3d9bf",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:34:26Z",
  "cash_received": true
}
```

```json
{
  "id": "c676aa0a-f591-4c81-95cc-947b8fefdce0",
  "order_id": "f8b80a4d-afb0-4e45-8c5a-757f4d7870a8",
  "assignment_id": "38a992eb-46ab-4163-a232-0064b0d92a94",
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
  "arrived_at": "2026-10-28T16:34:25.874526Z",
  "started_at": "2026-10-28T16:34:26.15302Z",
  "completed_at": "2026-10-28T16:34:26.721365Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/f8b80a4d-afb0-4e45-8c5a-757f4d7870a8` → **200**

```json
{
  "id": "f8b80a4d-afb0-4e45-8c5a-757f4d7870a8",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "b8288fd6-6adf-4c61-aa3c-7de29858ea72",
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
    "id": "38a992eb-46ab-4163-a232-0064b0d92a94",
    "order_id": "f8b80a4d-afb0-4e45-8c5a-757f4d7870a8",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c676aa0a-f591-4c81-95cc-947b8fefdce0",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:34:21.073093Z",
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
    "id": "f8b80a4d-afb0-4e45-8c5a-757f4d7870a8",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-28T16:34:21.073093Z",
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
    "id": "c676aa0a-f591-4c81-95cc-947b8fefdce0",
    "order_id": "f8b80a4d-afb0-4e45-8c5a-757f4d7870a8",
    "order_short_number": 7,
    "created_at": "2026-10-28T16:34:21.637846Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "4ed16ec0-7e68-4ba7-adc6-101e9ba879b8",
    "order_id": "df7bd5a1-ca46-4c7d-a1f4-ff66920b56cf",
    "order_short_number": 1,
    "created_at": "2026-10-28T16:32:54.24162Z",
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

`GET /api/rider/v1/orders/f8b80a4d-afb0-4e45-8c5a-757f4d7870a8/tip` → **200**

```json
{
  "order_id": "f8b80a4d-afb0-4e45-8c5a-757f4d7870a8",
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
  "available_until": "2026-10-29T16:34:26.721365Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/f8b80a4d-afb0-4e45-8c5a-757f4d7870a8/tip` → **201**

```json
{
  "command_id": "84a71c6a-ea17-4c5b-ab0e-68b52c1a5ff0",
  "amount_minor": 1100
}
```

```json
{
  "id": "8f554774-76c2-488e-a555-8244b4951169",
  "order_id": "f8b80a4d-afb0-4e45-8c5a-757f4d7870a8",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T16:34:31.643722Z"
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
  "session_id": "e373e0d1-525b-4f45-945d-d2f3864e9ebd",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYxNzIsImlhdCI6MTc5MzIwNTI3MiwianRpIjoiMDk2ODYwODAtZDIwNy00NWZjLWIzYTMtMzY2MmRhNjZkNzNjIiwic2lkIjoiZTM3M2UwZDEtNTI1Yi00ZjQ1LTk0NWQtZDJmMzg2NGU5ZWJkIn0.7LAi7a_4i6WqdLxfyR4A1gD2AIDyAeNAz0kUwjITccY",
  "access_expires_at": "2026-10-28T16:49:32.211054634Z",
  "refresh_token": "nlFeF8rS1k1vQfNd7cEk1iV_iJlFx1VxCmpMq-WHbas",
  "refresh_expires_at": "2026-10-29T04:34:32.210505873Z",
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
          "RIDER": 2,
          "STAFF": 1,
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
      "RIDER": 2,
      "STAFF": 1,
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
  "generated_at": "2026-10-28T16:34:32.475336161Z"
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
  "generated_at": "2026-10-28T16:34:32.74437505Z"
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
  "session_id": "4097fd31-a6ff-44c1-a1e2-5c427027ff4c",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYxNzMsImlhdCI6MTc5MzIwNTI3MywianRpIjoiODBmN2M3ZTMtMTE1MC00YjVlLWE2NmYtNTYzOTIzMWEwMWFkIiwic2lkIjoiNDA5N2ZkMzEtYTZmZi00NGMxLWExZTItNWM0MjcwMjdmZjRjIn0.8tdnlCmcOEKkZGr-ZbiFmZ0fZltorRYlXEueDY88N8U",
  "access_expires_at": "2026-10-28T16:49:33.307817706Z",
  "refresh_token": "rYBh6a2i8ivwDgYCK1PT3SV99MmZcA3D5tvW3fnqyOA",
  "refresh_expires_at": "2026-10-29T04:34:33.307269546Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f8b80a4d-afb0-4e45-8c5a-757f4d7870a8/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:34:21.073579Z",
      "actor": {
        "type": "CLIENT",
        "id": "b8288fd6-6adf-4c61-aa3c-7de29858ea72",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "f8b80a4d-afb0-4e45-8c5a-757f4d7870a8",
        "quote_id": "edb0a3b5-dfe4-4301-97a3-17d1d35ecd2a",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "e54b42f5-53e5-4d2b-9cad-04d7a49d4687"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:34:21.075474Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f8b80a4d-afb0-4e45-8c5a-757f4d7870a8",
        "attempt_id": "3b8aa1c9-350e-4810-a769-4db9876d77a1",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "e54b42f5-53e5-4d2b-9cad-04d7a49d4687"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T16:34:21.081856Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "46cab5b6-dd3c-4766-bc7b-a690b1ac254e",
        "order_id": "f8b80a4d-afb0-4e45-8c5a-757f4d7870a8",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "e54b42f5-53e5-4d2b-9cad-04d7a49d4687"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T16:34:21.639733Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "46cab5b6-dd3c-4766-bc7b-a690b1ac254e",
        "order_id": "f8b80a4d-afb0-4e45-8c5a-757f4d7870a8",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "38a992eb-46ab-4163-a232-0064b0d92a94"
      },
      "correlation_id": "dd9f3357-9b03-46f9-b3c0-683ca4fbeff5"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T16:34:33.845514781Z",
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
      "last_location_at": "2026-10-28T16:34:26.445747Z",
      "order_id": null
    }
  ]
}
```

Done: order f8b80a4d-afb0-4e45-8c5a-757f4d7870a8.

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
  "session_id": "781e10e2-7be6-437e-ba68-9b2f6bbec7f0",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYxNzQsImlhdCI6MTc5MzIwNTI3NCwianRpIjoiYjE3OGE0N2EtZDA1Mi00Yzk3LTkxOTUtOTY2NjI0ZDYzODY5Iiwic2lkIjoiNzgxZTEwZTItN2JlNi00MzdlLWJhNjgtOWIyZjZiYmVjN2YwIn0.t_wcCp82I7aDvSdbAw6HxuLGJIibuRK1Q6jtg9FAixM",
  "access_expires_at": "2026-10-28T16:49:34.427591429Z",
  "refresh_token": "pA44MySVzRvIzyAwZ8rJ_gfGpPOSe03PytGP79r92og",
  "refresh_expires_at": "2026-10-29T04:34:34.427014356Z",
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
  "command_id": "6a1203d3-78af-435e-9cf9-428415b3155c",
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
  "timestamp": "2026-10-28T16:34:35.000+0000",
  "channel": {
    "id": "1730052000.1635330086",
    "linkedid": "1730052000.1635330086",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676573842"
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
  "timestamp": "2026-10-28T16:34:35.000+0000",
  "channel": {
    "id": "1730052000.1635330086",
    "linkedid": "1730052000.1635330086",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676573842"
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
  "session_id": "71e383ce-5a83-48b5-a7cf-8ad20c79231f",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYxNzUsImlhdCI6MTc5MzIwNTI3NSwianRpIjoiNzAzMzViZTQtZDdjZS00YTQxLTg0NGMtZmFjZGNlMDBlM2NjIiwic2lkIjoiNzFlMzgzY2UtNWE4My00OGI1LWE3Y2YtOGFkMjBjNzkyMzFmIn0.L-f7iEvFSjhJX_MgFtA9bzAJcuQiOy5Ey8Lzlnjmqyc",
  "access_expires_at": "2026-10-28T16:49:35.546047733Z",
  "refresh_token": "HAzyG02SiD2TG0M8xVWDrfPlBDPzIo3D2U7LU1__2bQ",
  "refresh_expires_at": "2026-10-29T04:34:35.545446785Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "d2f3e590-420b-4a75-95a4-b7531a45c044",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380676573842",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T16:34:35Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/d2f3e590-420b-4a75-95a4-b7531a45c044/answer` → **200**

```json
{
  "command_id": "038bbee5-5c5b-4db1-bab9-cbeef664c2cc"
}
```

```json
{
  "id": "d2f3e590-420b-4a75-95a4-b7531a45c044",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380676573842",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
  "order_ids": [],
  "started_at": "2026-10-28T16:34:35Z",
  "answered_at": "2026-10-28T16:34:36.093505Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1635330086",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "e9f86708-8ae1-450f-8d07-473ab937c6c0",
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
  "id": "d713eb07-84cf-46a5-9411-28fe54900a47",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:39:36.403760Z",
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
  "command_id": "76da61e7-ac3c-4ac2-877a-c40229210006",
  "quote_id": "d713eb07-84cf-46a5-9411-28fe54900a47",
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
    "phone": "+380676573842"
  },
  "call_id": "d2f3e590-420b-4a75-95a4-b7531a45c044"
}
```

```json
{
  "id": "62cf1990-c914-4032-b246-5a84358a0858",
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
  "created_at": "2026-10-28T16:34:36.697344Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676573842"
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
    "id": "1730052000.1635330086",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "d2f3e590-420b-4a75-95a4-b7531a45c044",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676573842",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
      "order_ids": [
        "62cf1990-c914-4032-b246-5a84358a0858"
      ],
      "started_at": "2026-10-28T16:34:35Z",
      "answered_at": "2026-10-28T16:34:36.093505Z",
      "ended_at": "2026-10-28T16:34:36.997518Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "eaccbf65-1d74-4cc7-bfd7-4544578ccc50",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679605268",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
      "order_ids": [],
      "started_at": "2026-10-28T16:33:02.141764Z",
      "answered_at": "2026-10-28T16:33:02.44668Z",
      "ended_at": "2026-10-28T16:33:02.735086Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T16:33:06.758885Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/62cf1990-c914-4032-b246-5a84358a0858` → **200**

```json
{
  "id": "62cf1990-c914-4032-b246-5a84358a0858",
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
  "created_at": "2026-10-28T16:34:36.697344Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676573842"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/62cf1990-c914-4032-b246-5a84358a0858` → **200**

```json
{
  "id": "62cf1990-c914-4032-b246-5a84358a0858",
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
  "created_at": "2026-10-28T16:34:36.697344Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676573842"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/62cf1990-c914-4032-b246-5a84358a0858/cancel` → **200**

```json
{
  "command_id": "fed88d79-e9c2-4344-a976-362b9332e712",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "62cf1990-c914-4032-b246-5a84358a0858",
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
  "created_at": "2026-10-28T16:34:36.697344Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676573842"
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

Done: call d2f3e590-420b-4a75-95a4-b7531a45c044 with order 62cf1990-c914-4032-b246-5a84358a0858.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-28167"
}
```

```json
{
  "challenge_id": "942bc158-8e06-425c-bd7e-82fa9013dd07",
  "expires_at": "2026-10-28T16:39:38.147760759Z",
  "resend_available_at": "2026-10-28T16:34:39.147760759Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "357210",
  "sent_at": "2026-10-28T16:34:38.150719564Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "942bc158-8e06-425c-bd7e-82fa9013dd07",
  "code": "357210",
  "device_ref": "sandbox-28167"
}
```

```json
{
  "session_id": "450cf6f8-213a-422e-9123-6f3e5cc9a5fc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjE3OCwiaWF0IjoxNzkzMjA1Mjc4LCJqdGkiOiJlYjllZTQzNC0xNDRjLTQyZDItOTdmZC1hNWMwNWNkM2FjOWEiLCJzaWQiOiI0NTBjZjZmOC0yMTNhLTQyMmUtOTEyMy02ZjNlNWNjOWE1ZmMifQ.uJlex8e8WqC_JoE8l0nbRHKU4cYEXVQTFPS-kaW3sFQ",
  "access_expires_at": "2026-10-28T16:49:38.437756506Z",
  "refresh_token": "UcRtsdAMOfcMkrtc6AuYiogfSeE7XFryMIT3QReAno8",
  "refresh_expires_at": "2026-11-27T16:34:38.437127155Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "93bac51b-9d0e-44d4-b931-bb33973b35b7",
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
  "last_heartbeat_at": "2026-10-28T16:34:26.445747Z",
  "last_location_at": "2026-10-28T16:34:26.445747Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/93bac51b-9d0e-44d4-b931-bb33973b35b7/handover` → **200**

```json
{
  "command_id": "49b5bcd1-ed89-4af7-889c-d56f9700d837",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "93bac51b-9d0e-44d4-b931-bb33973b35b7",
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
  "last_heartbeat_at": "2026-10-28T16:34:26.445747Z",
  "last_location_at": "2026-10-28T16:34:26.445747Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/93bac51b-9d0e-44d4-b931-bb33973b35b7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:34:39Z",
    "sequence": 1793205279225
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "93bac51b-9d0e-44d4-b931-bb33973b35b7",
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
  "last_heartbeat_at": "2026-10-28T16:34:39.245372Z",
  "last_location_at": "2026-10-28T16:34:39.245372Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668752165",
  "device_ref": "sandbox-9170"
}
```

```json
{
  "challenge_id": "52adb478-80ca-43bc-8709-213d3b18b839",
  "expires_at": "2026-10-28T16:39:39.510963293Z",
  "resend_available_at": "2026-10-28T16:34:40.510963293Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668752165` → **200**

```json
{
  "phone": "+380668752165",
  "audience": "CLIENT",
  "code": "062256",
  "sent_at": "2026-10-28T16:34:39.513157152Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "52adb478-80ca-43bc-8709-213d3b18b839",
  "code": "062256",
  "device_ref": "sandbox-9170"
}
```

```json
{
  "session_id": "0a60a2a6-b7a4-4511-8881-a58ef09340a3",
  "subject": {
    "type": "CLIENT",
    "id": "4431090c-8065-44e3-a96d-af079fa4552c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NDMxMDkwYy04MDY1LTQ0ZTMtYTk2ZC1hZjA3OWZhNDU1MmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MTc5LCJpYXQiOjE3OTMyMDUyNzksImp0aSI6ImYyNjNiY2Y3LTJhYjItNGFiMy04ZmU5LTk1NjcxMmZiMDIwZSIsInNpZCI6IjBhNjBhMmE2LWI3YTQtNDUxMS04ODgxLWE1OGVmMDkzNDBhMyJ9.U4hKM6IVfce0M4pz9vrPgd2JjXsRo9BPBakscf933nw",
  "access_expires_at": "2026-10-28T16:49:39.798375227Z",
  "refresh_token": "UhlUlvTTpAXvOf-Gt31RNk7f37arl17cefxFF91WF8o",
  "refresh_expires_at": "2026-11-27T16:34:39.797788917Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b9f403f7-9100-479a-a9a9-5cff06c18f71",
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
  "id": "0a326c27-284a-4b6e-90a7-13e7b7cff9ae",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:39:40.073219Z",
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
  "command_id": "eac002d4-73f1-4567-9804-a838a9d9d757",
  "quote_id": "0a326c27-284a-4b6e-90a7-13e7b7cff9ae",
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
  "id": "2053892e-e0a2-4321-88b9-b3ba1a355397",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4431090c-8065-44e3-a96d-af079fa4552c",
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
  "created_at": "2026-10-28T16:34:40.351881Z",
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
    "id": "fd034f34-e161-4c17-868d-f6a0d2532c54",
    "order_id": "2053892e-e0a2-4321-88b9-b3ba1a355397",
    "expires_at": "2026-10-28T16:34:55.35507Z",
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

`POST /api/driver/v1/offers/fd034f34-e161-4c17-868d-f6a0d2532c54/accept` → **200**

```json
{
  "command_id": "ff042bf8-73bb-4dcc-83ab-7741cf11fdc8"
}
```

```json
{
  "id": "951dc128-d52f-4cf4-8f6d-556e0428c33d",
  "order_id": "2053892e-e0a2-4321-88b9-b3ba1a355397",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7539fd55-f607-4eed-b34f-c37febfe445d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7539fd55-f607-4eed-b34f-c37febfe445d",
  "order_id": "2053892e-e0a2-4321-88b9-b3ba1a355397",
  "assignment_id": "951dc128-d52f-4cf4-8f6d-556e0428c33d",
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

`POST /api/driver/v1/work-sessions/93bac51b-9d0e-44d4-b931-bb33973b35b7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:34:41Z",
    "sequence": 1793205281417
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "93bac51b-9d0e-44d4-b931-bb33973b35b7",
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
  "last_heartbeat_at": "2026-10-28T16:34:41.447111Z",
  "last_location_at": "2026-10-28T16:34:41.447111Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7539fd55-f607-4eed-b34f-c37febfe445d/arrive` → **200**

```json
{
  "command_id": "530422f5-2b14-4b02-a85f-6c095fb85821",
  "expected_version": 0
}
```

```json
{
  "id": "7539fd55-f607-4eed-b34f-c37febfe445d",
  "order_id": "2053892e-e0a2-4321-88b9-b3ba1a355397",
  "assignment_id": "951dc128-d52f-4cf4-8f6d-556e0428c33d",
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
  "arrived_at": "2026-10-28T16:34:41.731007Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7539fd55-f607-4eed-b34f-c37febfe445d/start` → **200**

```json
{
  "command_id": "4f88d9f6-2a7a-4192-8ded-bb2309824c68",
  "expected_version": 1
}
```

```json
{
  "id": "7539fd55-f607-4eed-b34f-c37febfe445d",
  "order_id": "2053892e-e0a2-4321-88b9-b3ba1a355397",
  "assignment_id": "951dc128-d52f-4cf4-8f6d-556e0428c33d",
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
  "arrived_at": "2026-10-28T16:34:41.731007Z",
  "started_at": "2026-10-28T16:34:42.00588Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/93bac51b-9d0e-44d4-b931-bb33973b35b7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:34:42Z",
    "sequence": 1793205282272
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "93bac51b-9d0e-44d4-b931-bb33973b35b7",
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
  "last_heartbeat_at": "2026-10-28T16:34:42.291429Z",
  "last_location_at": "2026-10-28T16:34:42.291429Z",
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
  "device_ref": "sandbox-27375"
}
```

```json
{
  "challenge_id": "5067d10c-af48-4f48-b9db-164b98f1a7a2",
  "expires_at": "2026-10-28T16:39:42.544290433Z",
  "resend_available_at": "2026-10-28T16:34:43.544290433Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "928555",
  "sent_at": "2026-10-28T16:34:42.546739647Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5067d10c-af48-4f48-b9db-164b98f1a7a2",
  "code": "928555",
  "device_ref": "sandbox-27375"
}
```

```json
{
  "session_id": "294b62a6-d1ca-46f5-9b9b-e9b8dbc71ce8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjE4MiwiaWF0IjoxNzkzMjA1MjgyLCJqdGkiOiIxMmVmMTU4Zi05ODk2LTQyZjYtYTQ5NS0wM2I4MjhmYmJlM2YiLCJzaWQiOiIyOTRiNjJhNi1kMWNhLTQ2ZjUtOWI5Yi1lOWI4ZGJjNzFjZTgifQ.-70CFFiQYkkg5t8InCMeHLEUt2ksmoN7U_B1q4NXJE0",
  "access_expires_at": "2026-10-28T16:49:42.832508057Z",
  "refresh_token": "zAlpngoSFOQtXP3TSxvZv1TXeoU2IudLgssGGBrj9go",
  "refresh_expires_at": "2026-11-27T16:34:42.831953726Z",
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
  "command_id": "dcdf5c15-bcc2-479d-8d51-acd68be57364",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:34:43Z",
    "sequence": 1793205283357
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f5e65895-e00c-4856-b6d7-927dc109cbec",
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
  "last_heartbeat_at": "2026-10-28T16:34:43.376729Z",
  "last_location_at": "2026-10-28T16:34:43.376729Z",
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
  "session_id": "31e8f517-75cd-448a-adbb-eeca0d4d2903",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYxODMsImlhdCI6MTc5MzIwNTI4MywianRpIjoiOWRjNzM5YzQtNWUwOS00NzMwLTkzZDgtMGVjYjc3NDljZmM1Iiwic2lkIjoiMzFlOGY1MTctNzVjZC00NDhhLWFkYmItZWVjYTBkNGQyOTAzIn0.bV8fJsLbbRNtrc0icwznwdVnBQ-huF2JtcLjOaBgTsk",
  "access_expires_at": "2026-10-28T16:49:43.935684587Z",
  "refresh_token": "QNVkLYpkyJUPhnGtQpbJB9BdzedDi8ZhG3VRb7U8neI",
  "refresh_expires_at": "2026-10-29T04:34:43.935068318Z",
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
  "session_id": "c2df9f56-74b8-4783-a669-aeee5b46d162",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYxODQsImlhdCI6MTc5MzIwNTI4NCwianRpIjoiZGI5NzJiYTgtZTY3My00NGI3LTljZjktNTQyNTYzN2Y3ZTM0Iiwic2lkIjoiYzJkZjlmNTYtNzRiOC00NzgzLWE2NjktYWVlZTViNDZkMTYyIn0.53E_26q526OvF6yv7FzgYtUzTetFq-lT4FiSufigAJI",
  "access_expires_at": "2026-10-28T16:49:44.491404766Z",
  "refresh_token": "NQkzpcTvhWmLemuLf4EoA3c_pEov1Sc92Vx604lV8tg",
  "refresh_expires_at": "2026-10-29T04:34:44.490862097Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2053892e-e0a2-4321-88b9-b3ba1a355397` → **200**

```json
{
  "id": "2053892e-e0a2-4321-88b9-b3ba1a355397",
  "short_number": 9,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "4431090c-8065-44e3-a96d-af079fa4552c",
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
    "id": "951dc128-d52f-4cf4-8f6d-556e0428c33d",
    "order_id": "2053892e-e0a2-4321-88b9-b3ba1a355397",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "7539fd55-f607-4eed-b34f-c37febfe445d",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T16:34:40.351881Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/2053892e-e0a2-4321-88b9-b3ba1a355397/interrupt` → **200**

```json
{
  "command_id": "3990f2f0-1273-44a7-a632-484b1281aa16",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "2053892e-e0a2-4321-88b9-b3ba1a355397",
    "short_number": 9,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "4431090c-8065-44e3-a96d-af079fa4552c",
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
      "id": "951dc128-d52f-4cf4-8f6d-556e0428c33d",
      "order_id": "2053892e-e0a2-4321-88b9-b3ba1a355397",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "7539fd55-f607-4eed-b34f-c37febfe445d",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T16:34:40.351881Z",
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
    "id": "62fe2c0d-8ced-40cc-bcde-4c993e8f03a8",
    "short_number": 10,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "4431090c-8065-44e3-a96d-af079fa4552c",
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
    "id": "2ae6efba-55fa-4d33-9214-f91fa9cee4ce",
    "order_id": "62fe2c0d-8ced-40cc-bcde-4c993e8f03a8",
    "expires_at": "2026-10-28T16:35:00.061556Z",
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

`POST /api/driver/v1/offers/2ae6efba-55fa-4d33-9214-f91fa9cee4ce/accept` → **200**

```json
{
  "command_id": "b702b154-91f5-4fe4-862c-ad9f037d612f"
}
```

```json
{
  "id": "c84a4e97-ecf4-42fa-a94e-0e9b882b9d8b",
  "order_id": "62fe2c0d-8ced-40cc-bcde-4c993e8f03a8",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b694e95a-c340-4f42-b0d9-ddb0ccfe29f5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b694e95a-c340-4f42-b0d9-ddb0ccfe29f5",
  "order_id": "62fe2c0d-8ced-40cc-bcde-4c993e8f03a8",
  "assignment_id": "c84a4e97-ecf4-42fa-a94e-0e9b882b9d8b",
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
  "session_id": "f5e65895-e00c-4856-b6d7-927dc109cbec",
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
  "last_heartbeat_at": "2026-10-28T16:34:43.376729Z",
  "last_location_at": "2026-10-28T16:34:43.376729Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/f5e65895-e00c-4856-b6d7-927dc109cbec/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:34:46Z",
    "sequence": 1793205286417
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f5e65895-e00c-4856-b6d7-927dc109cbec",
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
  "last_heartbeat_at": "2026-10-28T16:34:46.435947Z",
  "last_location_at": "2026-10-28T16:34:46.435947Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b694e95a-c340-4f42-b0d9-ddb0ccfe29f5/arrive` → **200**

```json
{
  "command_id": "129ef582-2fbb-4041-b844-8f195d7d1550",
  "expected_version": 0
}
```

```json
{
  "id": "b694e95a-c340-4f42-b0d9-ddb0ccfe29f5",
  "order_id": "62fe2c0d-8ced-40cc-bcde-4c993e8f03a8",
  "assignment_id": "c84a4e97-ecf4-42fa-a94e-0e9b882b9d8b",
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
  "arrived_at": "2026-10-28T16:34:46.71676Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b694e95a-c340-4f42-b0d9-ddb0ccfe29f5/start` → **200**

```json
{
  "command_id": "c1e44614-cb04-4a6f-85b4-091aa81462e2",
  "expected_version": 1
}
```

```json
{
  "id": "b694e95a-c340-4f42-b0d9-ddb0ccfe29f5",
  "order_id": "62fe2c0d-8ced-40cc-bcde-4c993e8f03a8",
  "assignment_id": "c84a4e97-ecf4-42fa-a94e-0e9b882b9d8b",
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
  "arrived_at": "2026-10-28T16:34:46.71676Z",
  "started_at": "2026-10-28T16:34:46.992086Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b694e95a-c340-4f42-b0d9-ddb0ccfe29f5/complete` → **200**

```json
{
  "command_id": "f8ad03e1-0bd0-494e-ac6d-77f62b8cb4b8",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:34:47Z"
}
```

```json
{
  "id": "b694e95a-c340-4f42-b0d9-ddb0ccfe29f5",
  "order_id": "62fe2c0d-8ced-40cc-bcde-4c993e8f03a8",
  "assignment_id": "c84a4e97-ecf4-42fa-a94e-0e9b882b9d8b",
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
  "arrived_at": "2026-10-28T16:34:46.71676Z",
  "started_at": "2026-10-28T16:34:46.992086Z",
  "completed_at": "2026-10-28T16:34:47.273153Z",
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
    "id": "62fe2c0d-8ced-40cc-bcde-4c993e8f03a8",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T16:34:45.05039Z",
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
    "id": "2053892e-e0a2-4321-88b9-b3ba1a355397",
    "short_number": 9,
    "status": "CANCELLED",
    "created_at": "2026-10-28T16:34:40.351881Z",
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

`GET /api/operator/v1/orders/2053892e-e0a2-4321-88b9-b3ba1a355397/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:34:40.352393Z",
      "actor": {
        "type": "CLIENT",
        "id": "4431090c-8065-44e3-a96d-af079fa4552c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2053892e-e0a2-4321-88b9-b3ba1a355397",
        "quote_id": "0a326c27-284a-4b6e-90a7-13e7b7cff9ae",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "f343b38a-e95d-4d32-90a4-a469801187bd"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:34:40.354259Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2053892e-e0a2-4321-88b9-b3ba1a355397",
        "attempt_id": "fad1f0cc-249a-421c-ae65-9a95d32a240b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f343b38a-e95d-4d32-90a4-a469801187bd"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T16:34:40.357836Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "fd034f34-e161-4c17-868d-f6a0d2532c54",
        "order_id": "2053892e-e0a2-4321-88b9-b3ba1a355397",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "f343b38a-e95d-4d32-90a4-a469801187bd"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T16:34:40.8983Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "fd034f34-e161-4c17-868d-f6a0d2532c54",
        "order_id": "2053892e-e0a2-4321-88b9-b3ba1a355397",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "951dc128-d52f-4cf4-8f6d-556e0428c33d"
      },
      "correlation_id": "e510a194-f409-41a8-be99-06e7509d8bf5"
```

Done: interrupted 2053892e-e0a2-4321-88b9-b3ba1a355397, follow-up 62fe2c0d-8ced-40cc-bcde-4c993e8f03a8.

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
  "session_id": "6a9936da-51e1-4f56-a337-153a8e7de751",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYxOTEsImlhdCI6MTc5MzIwNTI5MSwianRpIjoiMDIzY2FjYmQtYjUxMy00OTE5LTk4M2EtYmViM2UwYjE4M2EwIiwic2lkIjoiNmE5OTM2ZGEtNTFlMS00ZjU2LWEzMzctMTUzYThlN2RlNzUxIn0.21m7vuU5qTjBpb7wiD8ye_vs5OEIdSziqWaaxWAHeAI",
  "access_expires_at": "2026-10-28T16:49:51.658836141Z",
  "refresh_token": "cjNrCS9yiB_4sWIRIWgrA0mh-f82ENbrYOBKS5bL6LA",
  "refresh_expires_at": "2026-10-29T04:34:51.658320041Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "bd59fa67-ac2c-429b-b125-5eea76e5e82b",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:34:51Z"
}
```

```json
{
  "id": "f5b8e762-4da0-463a-b899-d6f5788a0e69",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:34:51Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/f5b8e762-4da0-463a-b899-d6f5788a0e69/publish` → **200**

```json
{
  "command_id": "0d03673e-0295-4bb0-89c8-688664d7f68e",
  "expected_version": 0
}
```

```json
{
  "id": "f5b8e762-4da0-463a-b899-d6f5788a0e69",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:34:52.21696Z",
  "published_at": "2026-10-28T16:34:52.21696Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "f5b8e762-4da0-463a-b899-d6f5788a0e69",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T16:34:52.21696Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636324348",
  "device_ref": "sandbox-773"
}
```

```json
{
  "challenge_id": "c443e6ce-9fcf-4b37-a23c-5c388d5d0e36",
  "expires_at": "2026-10-28T16:39:52.737835185Z",
  "resend_available_at": "2026-10-28T16:34:53.737835185Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636324348` → **200**

```json
{
  "phone": "+380636324348",
  "audience": "CLIENT",
  "code": "680749",
  "sent_at": "2026-10-28T16:34:52.740208911Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c443e6ce-9fcf-4b37-a23c-5c388d5d0e36",
  "code": "680749",
  "device_ref": "sandbox-773"
}
```

```json
{
  "session_id": "9e14706f-ec81-4be9-931d-0dba74e758b8",
  "subject": {
    "type": "CLIENT",
    "id": "2869d9db-6ba3-45ce-bd5b-85665a51257c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyODY5ZDlkYi02YmEzLTQ1Y2UtYmQ1Yi04NTY2NWE1MTI1N2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MTkzLCJpYXQiOjE3OTMyMDUyOTMsImp0aSI6IjJhM2ZjNjZlLTViOTUtNGE4Mi1iYTc4LTVlMGI5MjY0N2IwNSIsInNpZCI6IjllMTQ3MDZmLWVjODEtNGJlOS05MzFkLTBkYmE3NGU3NThiOCJ9.lHGsa4yu_4_UDFc3B5kzM7jWU7Wy9-r0FMoX70nCSOQ",
  "access_expires_at": "2026-10-28T16:49:53.030578031Z",
  "refresh_token": "utVivZe2_U07B6L_3dknPM4m9elkWYOSdKoKs2GjQjA",
  "refresh_expires_at": "2026-11-27T16:34:53.030044741Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "f5b8e762-4da0-463a-b899-d6f5788a0e69",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T16:34:52.21696Z",
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
  "command_id": "edc0b67b-0b91-4f28-bcab-800a34de3fe5",
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
  "id": "cb7d5e95-b450-41ca-be8b-c4af80a2b11a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:39:53.565871Z",
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
  "command_id": "2488dadc-d8e0-4762-8744-1977af906c4b",
  "quote_id": "cb7d5e95-b450-41ca-be8b-c4af80a2b11a",
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
  "correlation_id": "6aae00e1-4663-4211-b988-e7e0e45c86db"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "4ffed5eb-d2fc-498f-a9ec-03ee3d439651",
  "version_id": "f5b8e762-4da0-463a-b899-d6f5788a0e69",
  "language": "uk"
}
```

```json
{
  "version_id": "f5b8e762-4da0-463a-b899-d6f5788a0e69",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T16:34:54.118267Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ba187528-18fd-4162-ac01-4bef7a730763",
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
  "id": "7950c5a5-abcc-42bd-82ea-bf7e14d1826d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:39:54.394954Z",
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
  "command_id": "9d9085be-e47c-41b1-8fa0-3b0f56b53494",
  "quote_id": "7950c5a5-abcc-42bd-82ea-bf7e14d1826d",
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
  "id": "e5a23a07-7cc3-4e84-b7fa-9df5e4a8df0a",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2869d9db-6ba3-45ce-bd5b-85665a51257c",
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
  "created_at": "2026-10-28T16:34:54.671952Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/e5a23a07-7cc3-4e84-b7fa-9df5e4a8df0a` → **200**

```json
{
  "id": "e5a23a07-7cc3-4e84-b7fa-9df5e4a8df0a",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2869d9db-6ba3-45ce-bd5b-85665a51257c",
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
  "created_at": "2026-10-28T16:34:54.671952Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/e5a23a07-7cc3-4e84-b7fa-9df5e4a8df0a/cancel` → **200**

```json
{
  "command_id": "6618e9c5-e1e8-4aee-bdce-438baaca33fc",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e5a23a07-7cc3-4e84-b7fa-9df5e4a8df0a",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2869d9db-6ba3-45ce-bd5b-85665a51257c",
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
  "created_at": "2026-10-28T16:34:54.671952Z",
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
  "discount_minor": 0
}
```

## A published version never changes

`POST /api/admin/v1/legal-documents/f5b8e762-4da0-463a-b899-d6f5788a0e69` → **409**

```json
{
  "command_id": "0005bacf-50ac-4f0d-a19e-cd2b40087445",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:34:55Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/f5b8e762-4da0-463a-b899-d6f5788a0e69",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "fae8a0db-1896-4c61-b846-881e04905010"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "617c91fa-e6d7-45f7-b0e1-afe96f0b2f72",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T16:34:55Z"
}
```

```json
{
  "id": "19868e0d-d3d6-4eb4-97d4-a035eace6a3e",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T16:34:55Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/19868e0d-d3d6-4eb4-97d4-a035eace6a3e/publish` → **200**

```json
{
  "command_id": "2eb76c97-3cec-4b2b-9a73-cda04f3cdb65",
  "expected_version": 0
}
```

```json
{
  "id": "19868e0d-d3d6-4eb4-97d4-a035eace6a3e",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T16:34:56.091572Z",
  "published_at": "2026-10-28T16:34:56.091572Z",
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
  "device_ref": "sandbox-10897"
}
```

```json
{
  "challenge_id": "5a4493b2-789d-42a3-a275-bb8a23538798",
  "expires_at": "2026-10-28T16:39:56.363161947Z",
  "resend_available_at": "2026-10-28T16:34:57.363161947Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "930128",
  "sent_at": "2026-10-28T16:34:56.365606664Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5a4493b2-789d-42a3-a275-bb8a23538798",
  "code": "930128",
  "device_ref": "sandbox-10897"
}
```

```json
{
  "session_id": "7584327c-0758-4d6c-b5a3-5bc591d27fdd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjE5NiwiaWF0IjoxNzkzMjA1Mjk2LCJqdGkiOiJlYzE5NTk5YS1jOGE3LTRjODktYjIyZi05ZTYxNmVkNDhmODQiLCJzaWQiOiI3NTg0MzI3Yy0wNzU4LTRkNmMtYjVhMy01YmM1OTFkMjdmZGQifQ.hBPMNbtsCMkLRVyXAmAtQRSKeW--EBwMW-xHb-dBpDw",
  "access_expires_at": "2026-10-28T16:49:56.655825883Z",
  "refresh_token": "NSbTq_ffN9v-9cexQojvo6003pMDIbTK-TBGqlfjg3k",
  "refresh_expires_at": "2026-11-27T16:34:56.655159153Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f5e65895-e00c-4856-b6d7-927dc109cbec",
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
  "last_heartbeat_at": "2026-10-28T16:34:46.435947Z",
  "last_location_at": "2026-10-28T16:34:46.435947Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f5e65895-e00c-4856-b6d7-927dc109cbec/handover` → **200**

```json
{
  "command_id": "51b444f2-d0a6-49e5-a56b-931be63033fb",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f5e65895-e00c-4856-b6d7-927dc109cbec",
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
  "last_heartbeat_at": "2026-10-28T16:34:46.435947Z",
  "last_location_at": "2026-10-28T16:34:46.435947Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f5e65895-e00c-4856-b6d7-927dc109cbec/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:34:57Z",
    "sequence": 1793205297451
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f5e65895-e00c-4856-b6d7-927dc109cbec",
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
  "last_heartbeat_at": "2026-10-28T16:34:57.470304Z",
  "last_location_at": "2026-10-28T16:34:57.470304Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675658956",
  "device_ref": "sandbox-8161"
}
```

```json
{
  "challenge_id": "5dd9c83c-5a9a-41ba-91fc-175a0b4a464f",
  "expires_at": "2026-10-28T16:39:57.732240265Z",
  "resend_available_at": "2026-10-28T16:34:58.732240265Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675658956` → **200**

```json
{
  "phone": "+380675658956",
  "audience": "CLIENT",
  "code": "796994",
  "sent_at": "2026-10-28T16:34:57.734298593Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5dd9c83c-5a9a-41ba-91fc-175a0b4a464f",
  "code": "796994",
  "device_ref": "sandbox-8161"
}
```

```json
{
  "session_id": "952db66d-acd1-46d0-a7ab-bf38db1867cf",
  "subject": {
    "type": "CLIENT",
    "id": "a04aa454-b3b1-4b92-972c-569dc0c217d8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMDRhYTQ1NC1iM2IxLTRiOTItOTcyYy01NjlkYzBjMjE3ZDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MTk4LCJpYXQiOjE3OTMyMDUyOTgsImp0aSI6ImM0YmEwZTZkLTQ2NWQtNDYzOS1hYjQ4LTU2MDJiY2QxZmNjOSIsInNpZCI6Ijk1MmRiNjZkLWFjZDEtNDZkMC1hN2FiLWJmMzhkYjE4NjdjZiJ9.4nUzNceKKluKMrXeqdreooownGp5biGdNMf-m4Lsiww",
  "access_expires_at": "2026-10-28T16:49:58.024949497Z",
  "refresh_token": "1IUuF0_ZHVmCtTTVfCgNJ_2gCNCzdN2rMfXbFpaIZOU",
  "refresh_expires_at": "2026-11-27T16:34:58.024461008Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "12cb0b59-8ed4-4be9-a09c-1536864d765f",
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
  "id": "f85697a6-5970-4b40-b78a-3b4e0f496b7b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:39:58.296438Z",
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
  "command_id": "4286dedd-8469-448f-8b5e-cc89d9892ebe",
  "quote_id": "f85697a6-5970-4b40-b78a-3b4e0f496b7b",
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
    "phone": "+380679634904"
  }
}
```

```json
{
  "id": "d38a3db6-53f3-40bd-ae08-a55bf9de5bd5",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a04aa454-b3b1-4b92-972c-569dc0c217d8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:34:58.577096Z",
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
    "id": "e3bb8ae3-6e80-4a47-b689-e32efbd808a5",
    "order_id": "d38a3db6-53f3-40bd-ae08-a55bf9de5bd5",
    "expires_at": "2026-10-28T16:35:13.580346Z",
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

`POST /api/driver/v1/offers/e3bb8ae3-6e80-4a47-b689-e32efbd808a5/accept` → **200**

```json
{
  "command_id": "8e0a4533-beb9-4688-9905-f47d96a751d7"
}
```

```json
{
  "id": "4eb70889-78c5-4a7c-8b2a-ab5cb08c9069",
  "order_id": "d38a3db6-53f3-40bd-ae08-a55bf9de5bd5",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "249118d2-a526-4faf-95e9-c5fbdada44ae",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "249118d2-a526-4faf-95e9-c5fbdada44ae",
  "order_id": "d38a3db6-53f3-40bd-ae08-a55bf9de5bd5",
  "assignment_id": "4eb70889-78c5-4a7c-8b2a-ab5cb08c9069",
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
    "phone": "+380679634904"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1325b7f2-8d08-4caf-8abb-d889b3916b5c",
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
  "id": "a0353425-985e-4de8-bf73-eaea04c07e7b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:39:59.717825Z",
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
  "command_id": "a354780d-baed-4305-87ba-a53e5726d9fc",
  "quote_id": "a0353425-985e-4de8-bf73-eaea04c07e7b",
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
  "id": "4ff78339-43fb-44b5-ada1-6e182522eeb2",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a04aa454-b3b1-4b92-972c-569dc0c217d8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:34:59.99366Z",
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
  "command_id": "206c1df2-0548-466c-bb0d-b72cc17ea0d2",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T19:35:00Z"
}
```

```json
{
  "id": "b392bb54-927f-472e-a547-ea3bf6f0346c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:40:00.285755Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T19:35:00Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "99e091bd-0f79-425e-b2eb-fca14f856c37",
  "quote_id": "b392bb54-927f-472e-a547-ea3bf6f0346c",
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
  "pickup_at": "2026-10-28T19:35:00Z"
}
```

```json
{
  "id": "b0df7717-052f-4c30-b595-542727dc7aa2",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a04aa454-b3b1-4b92-972c-569dc0c217d8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T16:35:00.562074Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T19:35:00Z",
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
  "command_id": "a9104e83-7c48-430c-8afe-27214b73f9a7",
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
  "id": "2f9ec3e5-5d0a-4219-b513-e84260fc72e4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:40:00.849741Z",
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
  "command_id": "00ae1235-8e21-44d8-a7a5-344e5016ad74",
  "quote_id": "2f9ec3e5-5d0a-4219-b513-e84260fc72e4",
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
  "correlation_id": "1d8c7767-eb05-46d0-a884-9faea9e62fa6"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "b0df7717-052f-4c30-b595-542727dc7aa2",
      "short_number": 14,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "a04aa454-b3b1-4b92-972c-569dc0c217d8",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T16:35:00.562074Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T19:35:00Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "4ff78339-43fb-44b5-ada1-6e182522eeb2",
      "short_number": 13,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "a04aa454-b3b1-4b92-972c-569dc0c217d8",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-28T16:34:59.99366Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "d38a3db6-53f3-40bd-ae08-a55bf9de5bd5",
      "short_number": 12,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "a04aa454-b3b1-4b92-972c-569dc0c217d8",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "4ff78339-43fb-44b5-ada1-6e182522eeb2",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a04aa454-b3b1-4b92-972c-569dc0c217d8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:34:59.99366Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/d38a3db6-53f3-40bd-ae08-a55bf9de5bd5` → **200**

```json
{
  "id": "d38a3db6-53f3-40bd-ae08-a55bf9de5bd5",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a04aa454-b3b1-4b92-972c-569dc0c217d8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "4eb70889-78c5-4a7c-8b2a-ab5cb08c9069",
    "order_id": "d38a3db6-53f3-40bd-ae08-a55bf9de5bd5",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "249118d2-a526-4faf-95e9-c5fbdada44ae",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T16:34:58.577096Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/d38a3db6-53f3-40bd-ae08-a55bf9de5bd5/cancel` → **200**

```json
{
  "command_id": "7fe1e8f2-3a33-4486-9a98-caf2e829c265",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d38a3db6-53f3-40bd-ae08-a55bf9de5bd5",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "a04aa454-b3b1-4b92-972c-569dc0c217d8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "4eb70889-78c5-4a7c-8b2a-ab5cb08c9069",
    "order_id": "d38a3db6-53f3-40bd-ae08-a55bf9de5bd5",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "249118d2-a526-4faf-95e9-c5fbdada44ae",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T16:34:58.577096Z",
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
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/4ff78339-43fb-44b5-ada1-6e182522eeb2` → **200**

```json
{
  "id": "4ff78339-43fb-44b5-ada1-6e182522eeb2",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a04aa454-b3b1-4b92-972c-569dc0c217d8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:34:59.99366Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/4ff78339-43fb-44b5-ada1-6e182522eeb2/cancel` → **200**

```json
{
  "command_id": "7cb8af1c-0650-4176-92db-94e8eec22b92",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4ff78339-43fb-44b5-ada1-6e182522eeb2",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a04aa454-b3b1-4b92-972c-569dc0c217d8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:34:59.99366Z",
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
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/b0df7717-052f-4c30-b595-542727dc7aa2` → **200**

```json
{
  "id": "b0df7717-052f-4c30-b595-542727dc7aa2",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a04aa454-b3b1-4b92-972c-569dc0c217d8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T16:35:00.562074Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T19:35:00Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/b0df7717-052f-4c30-b595-542727dc7aa2/cancel` → **200**

```json
{
  "command_id": "39b648e1-6d45-4b43-bffd-97ba7fde7d25",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b0df7717-052f-4c30-b595-542727dc7aa2",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "a04aa454-b3b1-4b92-972c-569dc0c217d8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T16:35:00.562074Z",
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
  "pickup_at": "2026-10-28T19:35:00Z",
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
  "session_id": "f5e65895-e00c-4856-b6d7-927dc109cbec",
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
  "last_heartbeat_at": "2026-10-28T16:34:57.470304Z",
  "last_location_at": "2026-10-28T16:34:57.470304Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f5e65895-e00c-4856-b6d7-927dc109cbec/close` → **200**

```json
{
  "command_id": "7b9d2c24-38d0-438a-9e94-2d1574f18146",
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

Done: orders d38a3db6-53f3-40bd-ae08-a55bf9de5bd5, 4ff78339-43fb-44b5-ada1-6e182522eeb2, b0df7717-052f-4c30-b595-542727dc7aa2.

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
  "session_id": "4dc4b2b1-6ea8-43d3-b018-41572268df86",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyMDQsImlhdCI6MTc5MzIwNTMwNCwianRpIjoiNzg4ZjRjYzMtNzkzMi00OTJiLWFmN2QtNWZkNWM1MDI2Njg3Iiwic2lkIjoiNGRjNGIyYjEtNmVhOC00M2QzLWIwMTgtNDE1NzIyNjhkZjg2In0.PVmN07YGFCskma1XNOAW9PS-gFDD-1aePXuuewSERPM",
  "access_expires_at": "2026-10-28T16:50:04.433181017Z",
  "refresh_token": "jMz4SFqGijVdojAW7gUqzUJFaRS_5Yv3_mBPiiNKx4M",
  "refresh_expires_at": "2026-10-29T04:35:04.432656291Z",
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
  "session_id": "e084f3ab-79a3-41b7-a29f-bc809edb7d8e",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyMDQsImlhdCI6MTc5MzIwNTMwNCwianRpIjoiZjAxOTBiM2EtMDBkMS00NDdkLTg1NWEtZjQ5NDRjNDI3OWZmIiwic2lkIjoiZTA4NGYzYWItNzlhMy00MWI3LWEyOWYtYmM4MDllZGI3ZDhlIn0.IVR4E_Pl6z_9HGuPzD21Fq4bLLyTWLSGfuXg8YGftug",
  "access_expires_at": "2026-10-28T16:50:04.99466091Z",
  "refresh_token": "OT7FDYVSQ2ukcOi03lKatYzUtg0-pTO5Tkwf5n5rS24",
  "refresh_expires_at": "2026-10-29T04:35:04.994069768Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-14272"
}
```

```json
{
  "challenge_id": "1486aa79-dfa9-44c5-b920-88b01b9b9c28",
  "expires_at": "2026-10-28T16:40:05.283864985Z",
  "resend_available_at": "2026-10-28T16:35:06.283864985Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "888262",
  "sent_at": "2026-10-28T16:35:05.286755054Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1486aa79-dfa9-44c5-b920-88b01b9b9c28",
  "code": "888262",
  "device_ref": "sandbox-14272"
}
```

```json
{
  "session_id": "4eda8d83-da9a-4da3-9687-e9f1c979c7da",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjIwNSwiaWF0IjoxNzkzMjA1MzA1LCJqdGkiOiJlMTEyMzdkNS02ODgyLTRkZWUtOTM0Mi1mMzdiN2RmYTY4MWQiLCJzaWQiOiI0ZWRhOGQ4My1kYTlhLTRkYTMtOTY4Ny1lOWYxYzk3OWM3ZGEifQ.Y146vvwn6RqVBInieh35pT9CBFYt-09Bl9zzEWBNX10",
  "access_expires_at": "2026-10-28T16:50:05.618152193Z",
  "refresh_token": "DtQAnDhCSsgutP7sPsr0hqvR_iM7hAZF_-peiQBuOHg",
  "refresh_expires_at": "2026-11-27T16:35:05.61754829Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "93bac51b-9d0e-44d4-b931-bb33973b35b7",
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
  "last_heartbeat_at": "2026-10-28T16:34:42.291429Z",
  "last_location_at": "2026-10-28T16:34:42.291429Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/93bac51b-9d0e-44d4-b931-bb33973b35b7/handover` → **200**

```json
{
  "command_id": "5a9dac57-5aeb-4ab7-9b82-4d9cc844eac5",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "93bac51b-9d0e-44d4-b931-bb33973b35b7",
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
  "last_heartbeat_at": "2026-10-28T16:34:42.291429Z",
  "last_location_at": "2026-10-28T16:34:42.291429Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/93bac51b-9d0e-44d4-b931-bb33973b35b7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:35:06Z",
    "sequence": 1793205306441
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "93bac51b-9d0e-44d4-b931-bb33973b35b7",
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
  "last_heartbeat_at": "2026-10-28T16:35:06.460448Z",
  "last_location_at": "2026-10-28T16:35:06.460448Z",
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
  "command_id": "b95120da-faf5-4ffb-ac5a-0778c17d419e",
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
  "effective_at": "2026-10-28T16:35:07.029042Z",
  "changed_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T16:35:07.296503652Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "27755b9e-73be-44ab-808a-b1c2980327ce",
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
  "id": "a1b733a9-6128-4aaa-9a10-e3c813a72033",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:40:07.564330Z",
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
  "command_id": "5f404da2-42d7-4f31-b526-e61020f7c2df",
  "quote_id": "a1b733a9-6128-4aaa-9a10-e3c813a72033",
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
    "phone": "+380671111817"
  }
}
```

```json
{
  "id": "27fd0d02-a3dc-4b59-9636-978a35a10782",
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
  "created_at": "2026-10-28T16:35:07.852395Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671111817"
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
    "id": "0af6bf49-d09e-437e-81cf-94124ef5e248",
    "order_id": "27fd0d02-a3dc-4b59-9636-978a35a10782",
    "expires_at": "2026-10-28T16:35:22.855776Z",
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

`POST /api/driver/v1/offers/0af6bf49-d09e-437e-81cf-94124ef5e248/accept` → **200**

```json
{
  "command_id": "8688c66c-e496-4333-9863-d1cde325207b"
}
```

```json
{
  "id": "ddf638ee-5985-4315-a86e-ef89a635e691",
  "order_id": "27fd0d02-a3dc-4b59-9636-978a35a10782",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "60dfe495-6085-4b8a-a2a8-fbcc654539c2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "60dfe495-6085-4b8a-a2a8-fbcc654539c2",
  "order_id": "27fd0d02-a3dc-4b59-9636-978a35a10782",
  "assignment_id": "ddf638ee-5985-4315-a86e-ef89a635e691",
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
    "phone": "+380671111817"
  }
}
```

`POST /api/driver/v1/work-sessions/93bac51b-9d0e-44d4-b931-bb33973b35b7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:35:08Z",
    "sequence": 1793205308946
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "93bac51b-9d0e-44d4-b931-bb33973b35b7",
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
  "last_heartbeat_at": "2026-10-28T16:35:08.965538Z",
  "last_location_at": "2026-10-28T16:35:08.965538Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/60dfe495-6085-4b8a-a2a8-fbcc654539c2/arrive` → **200**

```json
{
  "command_id": "5770b0fc-d2e5-404d-a74e-50cf08d2d013",
  "expected_version": 0
}
```

```json
{
  "id": "60dfe495-6085-4b8a-a2a8-fbcc654539c2",
  "order_id": "27fd0d02-a3dc-4b59-9636-978a35a10782",
  "assignment_id": "ddf638ee-5985-4315-a86e-ef89a635e691",
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
  "arrived_at": "2026-10-28T16:35:09.241102Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671111817"
  }
}
```

`POST /api/driver/v1/trips/60dfe495-6085-4b8a-a2a8-fbcc654539c2/start` → **200**

```json
{
  "command_id": "cc5e0957-2f20-453a-9fff-b9565d417174",
  "expected_version": 1
}
```

```json
{
  "id": "60dfe495-6085-4b8a-a2a8-fbcc654539c2",
  "order_id": "27fd0d02-a3dc-4b59-9636-978a35a10782",
  "assignment_id": "ddf638ee-5985-4315-a86e-ef89a635e691",
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
  "arrived_at": "2026-10-28T16:35:09.241102Z",
  "started_at": "2026-10-28T16:35:09.525308Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671111817"
  }
}
```

`POST /api/driver/v1/trips/60dfe495-6085-4b8a-a2a8-fbcc654539c2/complete` → **200**

```json
{
  "command_id": "b4c91596-2f4d-43f4-9f58-5da5a55458f6",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:35:09Z",
  "cash_received": true
}
```

```json
{
  "id": "60dfe495-6085-4b8a-a2a8-fbcc654539c2",
  "order_id": "27fd0d02-a3dc-4b59-9636-978a35a10782",
  "assignment_id": "ddf638ee-5985-4315-a86e-ef89a635e691",
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
  "arrived_at": "2026-10-28T16:35:09.241102Z",
  "started_at": "2026-10-28T16:35:09.525308Z",
  "completed_at": "2026-10-28T16:35:09.810534Z",
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
  "command_id": "de6a34b7-a96a-4c20-996b-b9b834675b0a",
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
  "id": "5783bf83-231c-4af8-9fe9-3566886ba4d4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:40:10.098132Z",
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
  "command_id": "889bbb48-6d4a-44f5-a2ce-bbca51d2bf2d",
  "quote_id": "5783bf83-231c-4af8-9fe9-3566886ba4d4",
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
    "phone": "+380671117792"
  }
}
```

```json
{
  "id": "5b01b651-0cd2-4674-98a9-ae2cdf0591a6",
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
  "created_at": "2026-10-28T16:35:10.377682Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671117792"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/5b01b651-0cd2-4674-98a9-ae2cdf0591a6` → **200**

```json
{
  "id": "5b01b651-0cd2-4674-98a9-ae2cdf0591a6",
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
  "created_at": "2026-10-28T16:35:10.377682Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671117792"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5b01b651-0cd2-4674-98a9-ae2cdf0591a6/cancel` → **200**

```json
{
  "command_id": "1d0514cc-f5af-48fe-9098-30c1b35106a9",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "5b01b651-0cd2-4674-98a9-ae2cdf0591a6",
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
  "created_at": "2026-10-28T16:35:10.377682Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671117792"
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
  "staff_id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T16:35:09.815484Z",
  "last_entries": [
    {
      "order_id": "5b01b651-0cd2-4674-98a9-ae2cdf0591a6",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T16:35:10.949394Z"
    },
    {
      "order_id": "27fd0d02-a3dc-4b59-9636-978a35a10782",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T16:35:09.815484Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "93bac51b-9d0e-44d4-b931-bb33973b35b7",
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
  "last_heartbeat_at": "2026-10-28T16:35:08.965538Z",
  "last_location_at": "2026-10-28T16:35:08.965538Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/93bac51b-9d0e-44d4-b931-bb33973b35b7/close` → **200**

```json
{
  "command_id": "e5af4da3-2a40-4211-8f35-a7d53e028203",
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

Done: operator bonus for fulfilled 27fd0d02-a3dc-4b59-9636-978a35a10782 and operator-fault cancellation 5b01b651-0cd2-4674-98a9-ae2cdf0591a6.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679005956",
  "device_ref": "sandbox-6370"
}
```

```json
{
  "challenge_id": "cd6a758e-4a8a-4435-80ea-e469850404cb",
  "expires_at": "2026-10-28T16:40:14.05649137Z",
  "resend_available_at": "2026-10-28T16:35:15.05649137Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679005956` → **200**

```json
{
  "phone": "+380679005956",
  "audience": "CLIENT",
  "code": "801939",
  "sent_at": "2026-10-28T16:35:14.058786019Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677702383",
  "device_ref": "sandbox-2132",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "b584ce67-20a8-4a5a-8c80-76af50496970",
  "expires_at": "2026-10-28T16:40:14.346703983Z",
  "resend_available_at": "2026-10-28T16:35:15.346703983Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677702383` → **200**

```json
{
  "phone": "+380677702383",
  "audience": "CLIENT",
  "code": "276282",
  "sent_at": "2026-10-28T16:35:14.348801197Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671840000",
  "device_ref": "sandbox-4714"
}
```

```json
{
  "challenge_id": "69bf00ba-0007-4e72-aa96-6ecee19cfc3d",
  "expires_at": "2026-10-28T16:40:14.63504747Z",
  "resend_available_at": "2026-10-28T16:35:15.63504747Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671840000` → **200**

```json
{
  "phone": "+380671840000",
  "audience": "CLIENT",
  "code": "092136",
  "sent_at": "2026-10-28T16:35:14.637696211Z",
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
  "session_id": "b5effd46-e283-4a36-8695-59c9231ae82a",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyMTUsImlhdCI6MTc5MzIwNTMxNSwianRpIjoiOTljZjliNzYtOWI5Ni00ZmNmLWI0NDgtMGExNGMxNTgwYWFhIiwic2lkIjoiYjVlZmZkNDYtZTI4My00YTM2LTg2OTUtNTljOTIzMWFlODJhIn0._rJ_WfpPbuw_6MwGn9bZJ-OWQzhLiZZuJe7I2mUeK9g",
  "access_expires_at": "2026-10-28T16:50:15.21434327Z",
  "refresh_token": "l_OfgJga95XlvQKezvTZN4NVGrqa4k74YcLhPVQQmh0",
  "refresh_expires_at": "2026-10-29T04:35:15.213794319Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380671840000` → **200**

```json
{
  "deliveries": [
    {
      "id": "23e5e066-5195-4c32-aa60-be2b773e5ff0",
      "challenge_id": "69bf00ba-0007-4e72-aa96-6ecee19cfc3d",
      "phone": "+380671840000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-a44b2ebe-7e8f-4ea9-b948-8af7dc920e7c",
      "error": null,
      "attempted_at": "2026-10-28T16:35:14.638021Z"
    },
    {
      "id": "93f579ce-d543-4a19-8a5a-f95fd4068931",
      "challenge_id": "69bf00ba-0007-4e72-aa96-6ecee19cfc3d",
      "phone": "+380671840000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T16:35:14.637238Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380671840000` → **200**

```json
{
  "phone": "+380671840000",
  "audience": "CLIENT",
  "code": "092136",
  "sent_at": "2026-10-28T16:35:14.637696211Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677702383` → **200**

```json
{
  "deliveries": [
    {
      "id": "52c0bf46-61db-401a-a13b-7711dc41b0de",
      "challenge_id": "b584ce67-20a8-4a5a-8c80-76af50496970",
      "phone": "+380677702383",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-b923f617-4468-4484-aa86-5c672d04f0b5",
      "error": null,
      "attempted_at": "2026-10-28T16:35:14.349057Z"
    }
  ]
}
```

Done: SMS to +380679005956, a call to +380677702383, SMS then a call to +380671840000.

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
  "session_id": "2d0c1fb9-5998-4920-a6ff-323f5bca59e3",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyMTYsImlhdCI6MTc5MzIwNTMxNiwianRpIjoiMWVlMzI5ZmMtNjUyYi00ZGJjLThjMDEtYzMxNmNiNmViNmYzIiwic2lkIjoiMmQwYzFmYjktNTk5OC00OTIwLWE2ZmYtMzIzZjViY2E1OWUzIn0.JVtpdbnvmpXb04iymRHbphgShevsNbmTzE9doAV8XuY",
  "access_expires_at": "2026-10-28T16:50:16.350345807Z",
  "refresh_token": "IPz21tZgAlh08WZPN1bi4NRt-bMG7kBqIe6uF8Fp9l0",
  "refresh_expires_at": "2026-10-29T04:35:16.349785464Z",
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
  "session_id": "11bc68e8-448a-41e4-b1ba-645d66583836",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyMTYsImlhdCI6MTc5MzIwNTMxNiwianRpIjoiNjFhZWQwOWItMjZmMC00NmQzLTlkNTMtYjFmYzlkN2Y1MmZiIiwic2lkIjoiMTFiYzY4ZTgtNDQ4YS00MWU0LWIxYmEtNjQ1ZDY2NTgzODM2In0.DHU2Wlo0FJ-k-YvaA7WuzK-kv_yMTLMplPSVj1TnX-Y",
  "access_expires_at": "2026-10-28T16:50:16.897699283Z",
  "refresh_token": "Ja26_0RwPYubWx63M02k1rqJCyODmvVFRICWJhCnftA",
  "refresh_expires_at": "2026-10-29T04:35:16.897178855Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
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

`POST /api/admin/v1/staff-extensions/725c9a46-fbce-4d3c-b712-bcb4e9ec2925` → **200**

```json
{
  "command_id": "4ea61b70-5254-4db9-af3d-959e339d92fa",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "f2782ddb-6ecd-46a3-b8a4-12ea94c5ce88",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T16:35:17.964127Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T16:35:17.964127Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "41d7ea6c-c2b3-4079-807e-928ba9fc816b",
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
  "id": "14b5c1d4-375a-4603-83a1-16bd36d53082",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:40:18.490472Z",
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
  "command_id": "d9e09cff-d0b3-4b06-81e1-c36f93258367",
  "quote_id": "14b5c1d4-375a-4603-83a1-16bd36d53082",
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
    "phone": "+380679553892"
  }
}
```

```json
{
  "id": "7e0ed6dd-07eb-4c6e-a6a5-c9b43f574a35",
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
  "created_at": "2026-10-28T16:35:18.76511Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679553892"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/7e0ed6dd-07eb-4c6e-a6a5-c9b43f574a35/calls` → **201**

```json
{
  "command_id": "a8bc7261-eee7-4466-bde3-8008305e9f2e",
  "to": "CALLER"
}
```

```json
{
  "id": "3910b844-18ab-47ce-94ca-6182438b72f3",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
  "order_ids": [
    "7e0ed6dd-07eb-4c6e-a6a5-c9b43f574a35"
  ],
  "started_at": "2026-10-28T16:35:19.057176Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/7e0ed6dd-07eb-4c6e-a6a5-c9b43f574a35/calls` → **201**

```json
{
  "command_id": "a8bc7261-eee7-4466-bde3-8008305e9f2e",
  "to": "CALLER"
}
```

```json
{
  "id": "3910b844-18ab-47ce-94ca-6182438b72f3",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
  "order_ids": [
    "7e0ed6dd-07eb-4c6e-a6a5-c9b43f574a35"
  ],
  "started_at": "2026-10-28T16:35:19.057176Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "3910b844-18ab-47ce-94ca-6182438b72f3",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380679553892",
    "at": "2026-10-28T16:35:19.059119726Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "3910b844-18ab-47ce-94ca-6182438b72f3",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.5835",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "3910b844-18ab-47ce-94ca-6182438b72f3"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "3910b844-18ab-47ce-94ca-6182438b72f3",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=7e0ed6dd-07eb-4c6e-a6a5-c9b43f574a35` → **200**

```json
{
  "calls": [
    {
      "id": "3910b844-18ab-47ce-94ca-6182438b72f3",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
      "order_ids": [
        "7e0ed6dd-07eb-4c6e-a6a5-c9b43f574a35"
      ],
      "started_at": "2026-10-28T16:35:19.057176Z",
      "answered_at": "2026-10-28T16:35:19.67618Z",
      "ended_at": "2026-10-28T16:35:19.696481Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=7e0ed6dd-07eb-4c6e-a6a5-c9b43f574a35` → **200**

```json
{
  "calls": [
    {
      "id": "3910b844-18ab-47ce-94ca-6182438b72f3",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
      "order_ids": [
        "7e0ed6dd-07eb-4c6e-a6a5-c9b43f574a35"
      ],
      "started_at": "2026-10-28T16:35:19.057176Z",
      "answered_at": "2026-10-28T16:35:19.67618Z",
      "ended_at": "2026-10-28T16:35:19.696481Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=7e0ed6dd-07eb-4c6e-a6a5-c9b43f574a35` → **200**

```json
{
  "calls": [
    {
      "id": "3910b844-18ab-47ce-94ca-6182438b72f3",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
      "order_ids": [
        "7e0ed6dd-07eb-4c6e-a6a5-c9b43f574a35"
      ],
      "started_at": "2026-10-28T16:35:19.057176Z",
      "answered_at": "2026-10-28T16:35:19.67618Z",
      "ended_at": "2026-10-28T16:35:19.696481Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=7e0ed6dd-07eb-4c6e-a6a5-c9b43f574a35` → **200**

```json
{
  "calls": [
    {
      "id": "3910b844-18ab-47ce-94ca-6182438b72f3",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
      "order_ids": [
        "7e0ed6dd-07eb-4c6e-a6a5-c9b43f574a35"
      ],
      "started_at": "2026-10-28T16:35:19.057176Z",
      "answered_at": "2026-10-28T16:35:19.67618Z",
      "ended_at": "2026-10-28T16:35:19.696481Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=7e0ed6dd-07eb-4c6e-a6a5-c9b43f574a35` → **200**

```json
{
  "calls": [
    {
      "id": "3910b844-18ab-47ce-94ca-6182438b72f3",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
      "order_ids": [
        "7e0ed6dd-07eb-4c6e-a6a5-c9b43f574a35"
      ],
      "started_at": "2026-10-28T16:35:19.057176Z",
      "answered_at": "2026-10-28T16:35:19.67618Z",
      "ended_at": "2026-10-28T16:35:19.696481Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T16:35:26.796736Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/7e0ed6dd-07eb-4c6e-a6a5-c9b43f574a35` → **200**

```json
{
  "id": "7e0ed6dd-07eb-4c6e-a6a5-c9b43f574a35",
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
  "created_at": "2026-10-28T16:35:18.76511Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679553892"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7e0ed6dd-07eb-4c6e-a6a5-c9b43f574a35/cancel` → **200**

```json
{
  "command_id": "82ba69e1-6f5a-4655-9e03-e2b3b203305f",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "7e0ed6dd-07eb-4c6e-a6a5-c9b43f574a35",
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
  "created_at": "2026-10-28T16:35:18.76511Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679553892"
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
  "command_id": "acb897ab-2c2d-40ec-ab30-0e0545f6d007",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T16:35:29.665973Z",
  "extension": "101"
}
```

Done: outgoing call 3910b844-18ab-47ce-94ca-6182438b72f3 from order 7e0ed6dd-07eb-4c6e-a6a5-c9b43f574a35, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635181522",
  "device_ref": "sandbox-23721"
}
```

```json
{
  "challenge_id": "815fae81-a765-4396-ad36-034059da9783",
  "expires_at": "2026-10-28T16:40:29.945418743Z",
  "resend_available_at": "2026-10-28T16:35:30.945418743Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635181522` → **200**

```json
{
  "phone": "+380635181522",
  "audience": "CLIENT",
  "code": "203973",
  "sent_at": "2026-10-28T16:35:29.947799363Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "815fae81-a765-4396-ad36-034059da9783",
  "code": "203973",
  "device_ref": "sandbox-23721"
}
```

```json
{
  "session_id": "49549ecf-1798-49f1-8319-b7aca0cb6d31",
  "subject": {
    "type": "CLIENT",
    "id": "a8b35519-2af6-4e02-9799-bc0015196c27"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOGIzNTUxOS0yYWY2LTRlMDItOTc5OS1iYzAwMTUxOTZjMjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MjMwLCJpYXQiOjE3OTMyMDUzMzAsImp0aSI6IjMwMDA1NTFkLWM5MWQtNDFiOC04ZDc0LTMyNTI5NDkzZTBlOCIsInNpZCI6IjQ5NTQ5ZWNmLTE3OTgtNDlmMS04MzE5LWI3YWNhMGNiNmQzMSJ9.IF-oK_NJjYBRtg_XaMHPhHuYmkWjOd-OSvTInAVaGLU",
  "access_expires_at": "2026-10-28T16:50:30.234055018Z",
  "refresh_token": "6hBkB3uLlUl8aaCdd67y1C6niyULfjDmWn83VK3zPTI",
  "refresh_expires_at": "2026-11-27T16:35:30.233419949Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a8b35519-2af6-4e02-9799-bc0015196c27",
  "session_id": "49549ecf-1798-49f1-8319-b7aca0cb6d31",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635181522",
  "device_ref": "sandbox-30064"
}
```

```json
{
  "challenge_id": "d73be087-aa51-44f8-a262-addcfbebaac8",
  "expires_at": "2026-10-28T16:40:32.745815573Z",
  "resend_available_at": "2026-10-28T16:35:33.745815573Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635181522` → **200**

```json
{
  "phone": "+380635181522",
  "audience": "CLIENT",
  "code": "471131",
  "sent_at": "2026-10-28T16:35:32.748015726Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d73be087-aa51-44f8-a262-addcfbebaac8",
  "code": "471131",
  "device_ref": "sandbox-30064"
}
```

```json
{
  "session_id": "0038ca7c-2afa-4a38-84f5-2abe633ae37a",
  "subject": {
    "type": "CLIENT",
    "id": "a8b35519-2af6-4e02-9799-bc0015196c27"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOGIzNTUxOS0yYWY2LTRlMDItOTc5OS1iYzAwMTUxOTZjMjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MjMzLCJpYXQiOjE3OTMyMDUzMzMsImp0aSI6IjY0MjVmMTM4LTMzMWQtNDBjNS04MjVmLTFhODhiMjc0OWJjYiIsInNpZCI6IjAwMzhjYTdjLTJhZmEtNGEzOC04NGY1LTJhYmU2MzNhZTM3YSJ9.DbAosqOTd8fOeTwzVGqHVGCzdZt4v4t0OnHhuakRQsQ",
  "access_expires_at": "2026-10-28T16:50:33.037271905Z",
  "refresh_token": "sw50XGsU6vMTEdri-juKbqEZQ04xBxIJo1ZyE10veOU",
  "refresh_expires_at": "2026-11-27T16:35:33.036412967Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "5466c41c-4aaf-4117-a5f8-97cf7c30a3a9",
  "expires_at": "2026-10-28T16:40:35.310599761Z",
  "resend_available_at": "2026-10-28T16:35:36.310599761Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635181522` → **200**

```json
{
  "phone": "+380635181522",
  "audience": "CLIENT",
  "code": "723131",
  "sent_at": "2026-10-28T16:35:35.312628746Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380632386109"
}
```

```json
{
  "challenge_id": "04f467b7-b102-4b22-82e1-f799fcf404c8",
  "expires_at": "2026-10-28T16:40:35.594100929Z",
  "resend_available_at": "2026-10-28T16:35:36.594100929Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632386109` → **200**

```json
{
  "phone": "+380632386109",
  "audience": "CLIENT",
  "code": "034814",
  "sent_at": "2026-10-28T16:35:35.595930503Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "ab79734d-1078-4105-85ca-2e01ac5aee80",
  "current_challenge_id": "5466c41c-4aaf-4117-a5f8-97cf7c30a3a9",
  "current_code": "000000",
  "new_challenge_id": "04f467b7-b102-4b22-82e1-f799fcf404c8",
  "new_code": "034814"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "6f692c7b-f616-4725-b02b-5b7a21e98ea6"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "62ded4e6-3275-48db-9e59-39c9e224abaa",
  "current_challenge_id": "5466c41c-4aaf-4117-a5f8-97cf7c30a3a9",
  "current_code": "723131",
  "new_challenge_id": "04f467b7-b102-4b22-82e1-f799fcf404c8",
  "new_code": "034814"
}
```

```json
{
  "subject_id": "a8b35519-2af6-4e02-9799-bc0015196c27",
  "phone": "+380632386109",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a8b35519-2af6-4e02-9799-bc0015196c27",
  "session_id": "49549ecf-1798-49f1-8319-b7aca0cb6d31",
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
  "correlation_id": "710c19fd-2ea7-4fa7-add5-31866d0d7b31"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632386109",
  "device_ref": "sandbox-9846"
}
```

```json
{
  "challenge_id": "6c07e0d5-bd21-4efd-9f4d-ebcbcd016366",
  "expires_at": "2026-10-28T16:40:38.958976645Z",
  "resend_available_at": "2026-10-28T16:35:39.958976645Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632386109` → **200**

```json
{
  "phone": "+380632386109",
  "audience": "CLIENT",
  "code": "118541",
  "sent_at": "2026-10-28T16:35:38.960916482Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6c07e0d5-bd21-4efd-9f4d-ebcbcd016366",
  "code": "118541",
  "device_ref": "sandbox-9846"
}
```

```json
{
  "session_id": "9dbebffb-4ea3-4767-bda2-c96e32d3e207",
  "subject": {
    "type": "CLIENT",
    "id": "a8b35519-2af6-4e02-9799-bc0015196c27"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOGIzNTUxOS0yYWY2LTRlMDItOTc5OS1iYzAwMTUxOTZjMjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MjM5LCJpYXQiOjE3OTMyMDUzMzksImp0aSI6ImFlMzI4YTNjLWNkMDctNDBkYi1iMjljLWI2MWY2MThiY2IwMyIsInNpZCI6IjlkYmViZmZiLTRlYTMtNDc2Ny1iZGEyLWM5NmUzMmQzZTIwNyJ9.jOhImoDW3w78AJ01B4r6GAnIegc00iWCxDyA-sF-i1g",
  "access_expires_at": "2026-10-28T16:50:39.247651149Z",
  "refresh_token": "aJL9OZfAqpfapC_zryc2YIhuBqoYPr4WxW4OJ5KWVR0",
  "refresh_expires_at": "2026-11-27T16:35:39.24703467Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a8b35519-2af6-4e02-9799-bc0015196c27",
  "session_id": "9dbebffb-4ea3-4767-bda2-c96e32d3e207",
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
  "session_id": "abd9770b-9875-47fb-8ede-eb481318a07a",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyNDAsImlhdCI6MTc5MzIwNTM0MCwianRpIjoiMDFiMTZkOTUtMDVlMS00NWJiLTg5M2ItNjVkYTVjYmRkZjNjIiwic2lkIjoiYWJkOTc3MGItOTg3NS00N2ZiLThlZGUtZWI0ODEzMThhMDdhIn0.f8td3ia6jyJbwYnlaF8zBxllIIMSTzmZ23itQnZT1xI",
  "access_expires_at": "2026-10-28T16:50:40.058250907Z",
  "refresh_token": "ZW0-LrN74sSCRyEc_u_d9zWLxrx06eVUnW49NKgbCmk",
  "refresh_expires_at": "2026-10-29T04:35:40.057674885Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/a8b35519-2af6-4e02-9799-bc0015196c27` → **200**

```json
{
  "client": {
    "id": "a8b35519-2af6-4e02-9799-bc0015196c27",
    "phone": "+380632386109",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T16:35:30.23168Z",
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

`POST /api/admin/v1/clients/a8b35519-2af6-4e02-9799-bc0015196c27/phone` → **400**

```json
{
  "command_id": "9cff498a-17ed-435b-acf6-b437b7d57886",
  "expected_version": 3,
  "phone": "+380635585650",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/a8b35519-2af6-4e02-9799-bc0015196c27/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "03ab527d-e912-4e8f-874c-4d1fd57db521",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/a8b35519-2af6-4e02-9799-bc0015196c27/phone` → **200**

```json
{
  "command_id": "76b8db1e-31a4-40a0-ae97-fb8de9140a7c",
  "expected_version": 3,
  "phone": "+380635585650",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "a8b35519-2af6-4e02-9799-bc0015196c27",
  "phone": "+380635585650",
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
  "correlation_id": "b59feaf3-b958-47e5-acfe-c6edb742afa4"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635585650",
  "device_ref": "sandbox-5236"
}
```

```json
{
  "challenge_id": "24265f83-fd31-40b0-92de-713d93024cef",
  "expires_at": "2026-10-28T16:40:41.429399899Z",
  "resend_available_at": "2026-10-28T16:35:42.429399899Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635585650` → **200**

```json
{
  "phone": "+380635585650",
  "audience": "CLIENT",
  "code": "035110",
  "sent_at": "2026-10-28T16:35:41.431598798Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "24265f83-fd31-40b0-92de-713d93024cef",
  "code": "035110",
  "device_ref": "sandbox-5236"
}
```

```json
{
  "session_id": "6c6320ae-2464-44d0-985b-075c4b76f470",
  "subject": {
    "type": "CLIENT",
    "id": "a8b35519-2af6-4e02-9799-bc0015196c27"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOGIzNTUxOS0yYWY2LTRlMDItOTc5OS1iYzAwMTUxOTZjMjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MjQxLCJpYXQiOjE3OTMyMDUzNDEsImp0aSI6ImE5YWIwYzI4LTMzOWItNGE2MS1hNTI5LWMzZGYwMzQxODU5NCIsInNpZCI6IjZjNjMyMGFlLTI0NjQtNDRkMC05ODViLTA3NWM0Yjc2ZjQ3MCJ9.HcLREqFC0JmOUbX9pLZIGoHRDBJJIyHrKPKV6b7_ICQ",
  "access_expires_at": "2026-10-28T16:50:41.713716253Z",
  "refresh_token": "US4o-s7FRyxdn2JFJ6oNRpPIXqZt7_dDeef-aGU4BOU",
  "refresh_expires_at": "2026-11-27T16:35:41.713125975Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a8b35519-2af6-4e02-9799-bc0015196c27",
  "session_id": "6c6320ae-2464-44d0-985b-075c4b76f470",
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
  "phone": "+380633911512",
  "device_ref": "sandbox-20407"
}
```

```json
{
  "challenge_id": "27873d54-a448-420a-af6f-ee64599d332d",
  "expires_at": "2026-10-28T16:40:42.235628257Z",
  "resend_available_at": "2026-10-28T16:35:43.235628257Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633911512` → **200**

```json
{
  "phone": "+380633911512",
  "audience": "CLIENT",
  "code": "415370",
  "sent_at": "2026-10-28T16:35:42.237971757Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "27873d54-a448-420a-af6f-ee64599d332d",
  "code": "415370",
  "device_ref": "sandbox-20407"
}
```

```json
{
  "session_id": "ad06b7e3-073d-4887-be73-b9d77dadb128",
  "subject": {
    "type": "CLIENT",
    "id": "a4186edf-466b-42ab-94aa-5233871a7691"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDE4NmVkZi00NjZiLTQyYWItOTRhYS01MjMzODcxYTc2OTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MjQyLCJpYXQiOjE3OTMyMDUzNDIsImp0aSI6Ijc1MTk5MDdlLTgxZDAtNDJhZC1hMDY4LWY5ODQ2NDRhZTdjNSIsInNpZCI6ImFkMDZiN2UzLTA3M2QtNDg4Ny1iZTczLWI5ZDc3ZGFkYjEyOCJ9.FrC26ral9pnjDl8JUDcchU5IP1ycFMG-H59GUrsbA70",
  "access_expires_at": "2026-10-28T16:50:42.532887419Z",
  "refresh_token": "SWqZeBFYCV3_Go_HjydJv1LMsxPOUixd19RpWdDTesU",
  "refresh_expires_at": "2026-11-27T16:35:42.532326826Z",
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
  "session_id": "f07ee6b1-9c1c-447a-8d45-b0a6166f022a",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyNDMsImlhdCI6MTc5MzIwNTM0MywianRpIjoiN2I1Zjk3M2MtNTc1Yi00ODg1LTg3ZTEtMDBlMjg5ZjUyMTA2Iiwic2lkIjoiZjA3ZWU2YjEtOWMxYy00NDdhLThkNDUtYjBhNjE2NmYwMjJhIn0.9TTThSLdZMO78oc9j6ehBQPSlmRMQdyDqMMM1K6yzJA",
  "access_expires_at": "2026-10-28T16:50:43.633499823Z",
  "refresh_token": "QTsOlkJCAomvxWkaFaxDU3d40h0uP9xH7_kCpK_BWVw",
  "refresh_expires_at": "2026-10-29T04:35:43.632902482Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380633911512` → **200**

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
  "correlation_id": "8d1adda2-9f19-47e9-b263-b1cdcd4848ab"
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
  "session_id": "6f81ba23-346a-4d8a-8b8a-c3a824f871f8",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyNDQsImlhdCI6MTc5MzIwNTM0NCwianRpIjoiM2U3MTI0NjQtMWU1NS00OTMxLWI3ZTEtZjAwOGZjN2JhYzQ4Iiwic2lkIjoiNmY4MWJhMjMtMzQ2YS00ZDhhLThiOGEtYzNhODI0Zjg3MWY4In0.pBC9l1SQXnGlUua6xghLQvMvrJN9psGjjLx6SSuJ95s",
  "access_expires_at": "2026-10-28T16:50:44.738554336Z",
  "refresh_token": "xjm7EuiaHl911v8BF2UnaD4T4Ry1HnycoJitHUrXBx8",
  "refresh_expires_at": "2026-10-29T04:35:44.737976835Z",
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
  "changed_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
  "reason": "Sandbox clean-up",
  "changed_at": "2026-10-28T16:32:49.37706Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "b9a38e61-da47-4b77-9d9f-a209d4bc720a",
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
  "changed_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T16:35:45.277748604Z"
}
```

## The rider books the airport for 2026-10-28T19:35:44Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600677784",
  "device_ref": "sandbox-25383"
}
```

```json
{
  "challenge_id": "1a65b508-536e-4efd-9bd8-8972d4c04dfa",
  "expires_at": "2026-10-28T16:40:45.558979187Z",
  "resend_available_at": "2026-10-28T16:35:46.558979187Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600677784` → **200**

```json
{
  "phone": "+48600677784",
  "audience": "CLIENT",
  "code": "121841",
  "sent_at": "2026-10-28T16:35:45.561202353Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1a65b508-536e-4efd-9bd8-8972d4c04dfa",
  "code": "121841",
  "device_ref": "sandbox-25383"
}
```

```json
{
  "session_id": "0ca98254-4fac-4b2a-9386-9ce41c128403",
  "subject": {
    "type": "CLIENT",
    "id": "871d1f19-d64c-41da-a46e-4ff1f8659881"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NzFkMWYxOS1kNjRjLTQxZGEtYTQ2ZS00ZmYxZjg2NTk4ODEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MjQ1LCJpYXQiOjE3OTMyMDUzNDUsImp0aSI6IjJmNjhlMmE4LTU3OWQtNDhmMC04MDA3LWUwYjcyMTkwYWJmMCIsInNpZCI6IjBjYTk4MjU0LTRmYWMtNGIyYS05Mzg2LTljZTQxYzEyODQwMyJ9.FBUSyNC3xV7iTqmCISJWYeLCXyseIyDf73ivR_TdMrQ",
  "access_expires_at": "2026-10-28T16:50:45.851227918Z",
  "refresh_token": "W799DoZpki01yYuv_xE603YARqWuahZVDDxxBeBOzrA",
  "refresh_expires_at": "2026-11-27T16:35:45.850603343Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f9485b33-1518-45c4-a3c0-e6beffcd5764",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T19:35:44Z"
}
```

```json
{
  "id": "af4e3451-32a0-4e9b-943d-386df3bb3a1a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:40:46.129063Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T19:35:44Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "70d93176-5c95-4012-9882-dee28f057cf3",
  "quote_id": "af4e3451-32a0-4e9b-943d-386df3bb3a1a",
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
  "pickup_at": "2026-10-28T19:35:44Z"
}
```

```json
{
  "id": "dc78b013-d1fc-4158-9b1b-3a8d6481c0d4",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "871d1f19-d64c-41da-a46e-4ff1f8659881",
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
  "created_at": "2026-10-28T16:35:46.403627Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T19:35:44Z",
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
  "device_ref": "sandbox-7524"
}
```

```json
{
  "challenge_id": "611b75ae-9c96-44c3-b22a-6f7a8f694e10",
  "expires_at": "2026-10-28T16:40:46.682333385Z",
  "resend_available_at": "2026-10-28T16:35:47.682333385Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "510779",
  "sent_at": "2026-10-28T16:35:46.684604152Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "611b75ae-9c96-44c3-b22a-6f7a8f694e10",
  "code": "510779",
  "device_ref": "sandbox-7524"
}
```

```json
{
  "session_id": "42bab613-e571-4ef3-b174-7420b8240cb0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjI0NiwiaWF0IjoxNzkzMjA1MzQ2LCJqdGkiOiJlNTFmZjJlZi04ZDJjLTQwMjctYjVjYi1mNDBjZGU4OGU4MDEiLCJzaWQiOiI0MmJhYjYxMy1lNTcxLTRlZjMtYjE3NC03NDIwYjgyNDBjYjAifQ.XREYJWVRf0lcu8buuyHSdhnxXDz4YTyQbyyo40vo0AE",
  "access_expires_at": "2026-10-28T16:50:46.974987979Z",
  "refresh_token": "8jStmYWKe8wAeO21GSa86uyEn2Dw2gitoCFxmdoWbKM",
  "refresh_expires_at": "2026-11-27T16:35:46.974208752Z",
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
  "command_id": "442758da-7832-4c8a-ba94-8700e9aab1b1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:35:47Z",
    "sequence": 1793205347517
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4c36c4a7-55f7-4384-a407-258c7fc6ae51",
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
  "last_heartbeat_at": "2026-10-28T16:35:47.536212Z",
  "last_location_at": "2026-10-28T16:35:47.536212Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "dc78b013-d1fc-4158-9b1b-3a8d6481c0d4",
      "short_number": 18,
      "pickup_at": "2026-10-28T19:35:44Z",
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

`POST /api/driver/v1/preorders/dc78b013-d1fc-4158-9b1b-3a8d6481c0d4/reserve` → **200**

```json
{
  "command_id": "8c2db606-e08e-401a-a9c1-16b73476c626"
}
```

```json
{
  "id": "bbcfdf06-c790-4a7a-9324-dd28628ab204",
  "state": "RESERVED",
  "order": {
    "order_id": "dc78b013-d1fc-4158-9b1b-3a8d6481c0d4",
    "short_number": 18,
    "pickup_at": "2026-10-28T19:35:44Z",
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
  "reserved_at": "2026-10-28T16:35:48.077898Z",
  "confirm_from": "2026-10-28T19:05:44Z",
  "confirm_until": "2026-10-28T19:15:44Z",
  "drop_until": "2026-10-28T18:35:44Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "bbcfdf06-c790-4a7a-9324-dd28628ab204",
      "state": "RESERVED",
      "order": {
        "order_id": "dc78b013-d1fc-4158-9b1b-3a8d6481c0d4",
        "short_number": 18,
        "pickup_at": "2026-10-28T19:35:44Z",
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
      "reserved_at": "2026-10-28T16:35:48.077898Z",
      "confirm_from": "2026-10-28T19:05:44Z",
      "confirm_until": "2026-10-28T19:15:44Z",
      "drop_until": "2026-10-28T18:35:44Z"
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
      "id": "bbcfdf06-c790-4a7a-9324-dd28628ab204",
      "state": "RESERVED",
      "order": {
        "order_id": "dc78b013-d1fc-4158-9b1b-3a8d6481c0d4",
        "short_number": 18,
        "pickup_at": "2026-10-28T19:35:44Z",
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
      "reserved_at": "2026-10-28T16:35:48.077898Z",
      "confirm_from": "2026-10-28T19:05:44Z",
      "confirm_until": "2026-10-28T19:15:44Z",
      "drop_until": "2026-10-28T18:35:44Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/bbcfdf06-c790-4a7a-9324-dd28628ab204/confirm` → **409**

```json
{
  "command_id": "e29937b2-a0c1-4c7e-9040-4503d0a3f0a1"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/bbcfdf06-c790-4a7a-9324-dd28628ab204/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8f2e3c42-f58e-4898-a8a5-1ad81ef73842"
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
  "session_id": "a413cfd2-2284-4441-9480-f9d10302c094",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyNDksImlhdCI6MTc5MzIwNTM0OSwianRpIjoiMzE1NjdmNGEtYjc0My00MzNjLWE3ZjItY2NmYWU2NDQyNTAyIiwic2lkIjoiYTQxM2NmZDItMjI4NC00NDQxLTk0ODAtZjlkMTAzMDJjMDk0In0.ey6LUhAaNkKPVeYe6f3w8dYUIVRlW1I_bwrbcrd1GeI",
  "access_expires_at": "2026-10-28T16:50:49.424139272Z",
  "refresh_token": "thXxurUXOCQmJdjdTeO07rLj1ufM5ogrd7n1P6Msauo",
  "refresh_expires_at": "2026-10-29T04:35:49.423594708Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/dc78b013-d1fc-4158-9b1b-3a8d6481c0d4` → **200**

```json
{
  "id": "dc78b013-d1fc-4158-9b1b-3a8d6481c0d4",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "871d1f19-d64c-41da-a46e-4ff1f8659881",
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
  "created_at": "2026-10-28T16:35:46.403627Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T19:35:44Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "bbcfdf06-c790-4a7a-9324-dd28628ab204",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T16:35:48.077898Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/dc78b013-d1fc-4158-9b1b-3a8d6481c0d4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T16:35:46.404798Z",
      "actor": {
        "type": "CLIENT",
        "id": "871d1f19-d64c-41da-a46e-4ff1f8659881",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "dc78b013-d1fc-4158-9b1b-3a8d6481c0d4",
        "preorder": true,
        "quote_id": "af4e3451-32a0-4e9b-943d-386df3bb3a1a",
        "pickup_at": "2026-10-28T19:35:44Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "6f4d110d-4ce2-42fd-89d7-f2ab888f67ad"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T16:35:48.079082Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "dc78b013-d1fc-4158-9b1b-3a8d6481c0d4",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "bbcfdf06-c790-4a7a-9324-dd28628ab204"
      },
      "correlation_id": "79c0f288-8931-4795-8dff-26e6200b2a12"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order dc78b013-d1fc-4158-9b1b-3a8d6481c0d4, reservation bbcfdf06-c790-4a7a-9324-dd28628ab204.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21782"
}
```

```json
{
  "challenge_id": "72556e8b-8ea6-4ca9-aba4-1ec74d891e60",
  "expires_at": "2026-10-28T16:40:50.254180788Z",
  "resend_available_at": "2026-10-28T16:35:51.254180788Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "548610",
  "sent_at": "2026-10-28T16:35:50.256316231Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "72556e8b-8ea6-4ca9-aba4-1ec74d891e60",
  "code": "548610",
  "device_ref": "sandbox-21782"
}
```

```json
{
  "session_id": "6fa40e94-77d7-4048-a503-27f110c36ce0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjI1MCwiaWF0IjoxNzkzMjA1MzUwLCJqdGkiOiJkNjFhNzFlMi0wM2FkLTQ5NTctYjRmMi02YWU3ODRmMDUzOWYiLCJzaWQiOiI2ZmE0MGU5NC03N2Q3LTQwNDgtYTUwMy0yN2YxMTBjMzZjZTAifQ.lFMzzcDukq3ZNBac75EqjTCf_W57C7kWsLmwSIdyvgg",
  "access_expires_at": "2026-10-28T16:50:50.540692428Z",
  "refresh_token": "tIClo0Vt7sBJRtma2fA5LNLVBslvVEZnbe8NsWb01RA",
  "refresh_expires_at": "2026-11-27T16:35:50.540024926Z",
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
  "command_id": "0c718345-5c47-4493-b144-2c7789d6f879",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:35:51Z",
    "sequence": 1793205351625
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1538ea35-1ede-40cc-b843-15be2c78eedf",
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
  "last_heartbeat_at": "2026-10-28T16:35:51.080759Z",
  "last_location_at": "2026-10-28T16:35:51.080759Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678229366",
  "device_ref": "sandbox-13737"
}
```

```json
{
  "challenge_id": "e6c5fbe3-099f-4850-9107-de8e6c564463",
  "expires_at": "2026-10-28T16:40:51.345539235Z",
  "resend_available_at": "2026-10-28T16:35:52.345539235Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678229366` → **200**

```json
{
  "phone": "+380678229366",
  "audience": "CLIENT",
  "code": "182266",
  "sent_at": "2026-10-28T16:35:51.347775319Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e6c5fbe3-099f-4850-9107-de8e6c564463",
  "code": "182266",
  "device_ref": "sandbox-13737"
}
```

```json
{
  "session_id": "be75248d-c191-4552-8b98-706095f70002",
  "subject": {
    "type": "CLIENT",
    "id": "8dc9709a-02b2-4a22-9de0-fba16ad1eb0e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZGM5NzA5YS0wMmIyLTRhMjItOWRlMC1mYmExNmFkMWViMGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MjUxLCJpYXQiOjE3OTMyMDUzNTEsImp0aSI6IjNjOTVjODFkLThkOWYtNDBjZi05NzIxLWI4ZjczY2ZlZDIwOSIsInNpZCI6ImJlNzUyNDhkLWMxOTEtNDU1Mi04Yjk4LTcwNjA5NWY3MDAwMiJ9.ha1XRZpfh7Nnw6RQKMiGFplPCQc6vcOyCzlTKOfEUmc",
  "access_expires_at": "2026-10-28T16:50:51.634331558Z",
  "refresh_token": "iLfcCk5lDRoxo1mU-rH5C_6B8CeFdfmFyukup4RmH84",
  "refresh_expires_at": "2026-11-27T16:35:51.633779808Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0375b644-6b46-4033-b749-ccf48a8faea3",
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
  "id": "2886eb25-6056-48c5-a6dc-7ba7ca01e160",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:40:51.909973Z",
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
  "command_id": "0037bd8b-0da5-4a63-808a-24e5af9a6f12",
  "quote_id": "2886eb25-6056-48c5-a6dc-7ba7ca01e160",
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
  "id": "09c5a1ad-4b16-4452-8352-42e9abc459d0",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8dc9709a-02b2-4a22-9de0-fba16ad1eb0e",
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
  "created_at": "2026-10-28T16:35:52.186652Z",
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
    "id": "7066f0c0-9339-4551-8cf3-106c7963e0c4",
    "order_id": "09c5a1ad-4b16-4452-8352-42e9abc459d0",
    "expires_at": "2026-10-28T16:36:07.189759Z",
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

`POST /api/driver/v1/offers/7066f0c0-9339-4551-8cf3-106c7963e0c4/accept` → **200**

```json
{
  "command_id": "02873b90-8400-4af3-9c5a-6b8f20b8203b"
}
```

```json
{
  "id": "0f1f3a98-ec8b-449f-b6c5-b12a7865b1df",
  "order_id": "09c5a1ad-4b16-4452-8352-42e9abc459d0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9755a7a1-5506-4d73-a06c-0a9e9c989604",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9755a7a1-5506-4d73-a06c-0a9e9c989604",
  "order_id": "09c5a1ad-4b16-4452-8352-42e9abc459d0",
  "assignment_id": "0f1f3a98-ec8b-449f-b6c5-b12a7865b1df",
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

`POST /api/driver/v1/work-sessions/1538ea35-1ede-40cc-b843-15be2c78eedf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:35:53Z",
    "sequence": 1793205353265
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1538ea35-1ede-40cc-b843-15be2c78eedf",
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
  "last_heartbeat_at": "2026-10-28T16:35:53.284029Z",
  "last_location_at": "2026-10-28T16:35:53.284029Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9755a7a1-5506-4d73-a06c-0a9e9c989604",
  "order_id": "09c5a1ad-4b16-4452-8352-42e9abc459d0",
  "assignment_id": "0f1f3a98-ec8b-449f-b6c5-b12a7865b1df",
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

`POST /api/driver/v1/trips/9755a7a1-5506-4d73-a06c-0a9e9c989604/arrive` → **200**

```json
{
  "command_id": "73391f4f-bdc9-47aa-8db6-293555d7277e",
  "expected_version": 0
}
```

```json
{
  "id": "9755a7a1-5506-4d73-a06c-0a9e9c989604",
  "order_id": "09c5a1ad-4b16-4452-8352-42e9abc459d0",
  "assignment_id": "0f1f3a98-ec8b-449f-b6c5-b12a7865b1df",
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
  "arrived_at": "2026-10-28T16:35:53.813157Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9755a7a1-5506-4d73-a06c-0a9e9c989604/start` → **200**

```json
{
  "command_id": "d07ff6e7-bf16-4b5f-9032-fe42586e0bb7",
  "expected_version": 1
}
```

```json
{
  "id": "9755a7a1-5506-4d73-a06c-0a9e9c989604",
  "order_id": "09c5a1ad-4b16-4452-8352-42e9abc459d0",
  "assignment_id": "0f1f3a98-ec8b-449f-b6c5-b12a7865b1df",
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
  "arrived_at": "2026-10-28T16:35:53.813157Z",
  "started_at": "2026-10-28T16:35:54.088253Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/1538ea35-1ede-40cc-b843-15be2c78eedf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:35:54Z",
    "sequence": 1793205354353
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1538ea35-1ede-40cc-b843-15be2c78eedf",
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
  "last_heartbeat_at": "2026-10-28T16:35:54.372625Z",
  "last_location_at": "2026-10-28T16:35:54.372625Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/9755a7a1-5506-4d73-a06c-0a9e9c989604/complete` → **200**

```json
{
  "command_id": "c3c1e8df-e218-46d2-b613-cdeb4ca05a36",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:35:54Z",
  "cash_received": true
}
```

```json
{
  "id": "9755a7a1-5506-4d73-a06c-0a9e9c989604",
  "order_id": "09c5a1ad-4b16-4452-8352-42e9abc459d0",
  "assignment_id": "0f1f3a98-ec8b-449f-b6c5-b12a7865b1df",
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
  "arrived_at": "2026-10-28T16:35:53.813157Z",
  "started_at": "2026-10-28T16:35:54.088253Z",
  "completed_at": "2026-10-28T16:35:54.642098Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/09c5a1ad-4b16-4452-8352-42e9abc459d0/rating` → **200**

```json
{
  "command_id": "832461b4-239d-4ab7-af8a-6d8cbcc0e03c",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "09c5a1ad-4b16-4452-8352-42e9abc459d0",
  "score": 5,
  "created_at": "2026-10-28T16:35:54.937458284Z"
}
```

`POST /api/driver/v1/orders/09c5a1ad-4b16-4452-8352-42e9abc459d0/rating` → **200**

```json
{
  "command_id": "ea3b1c2a-8d62-49ca-8053-826b7cf2382b",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "09c5a1ad-4b16-4452-8352-42e9abc459d0",
  "score": 4,
  "created_at": "2026-10-28T16:35:55.204061142Z"
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
  "session_id": "72d8fe06-9686-4a23-8033-98f36d9ec03d",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyNTYsImlhdCI6MTc5MzIwNTM1NiwianRpIjoiZDQzZjQzZTMtNjQ2NC00NmM3LWFjZTQtZWQ5ZTY5ZmI4OTQzIiwic2lkIjoiNzJkOGZlMDYtOTY4Ni00YTIzLTgwMzMtOThmMzZkOWVjMDNkIn0.jFJfNn_-LDznAV16kGa1xQpL00ENqkUcrLPBK50FRVI",
  "access_expires_at": "2026-10-28T16:50:56.01820835Z",
  "refresh_token": "tVauCEbyq9gKRbfyi0qPaTzjLKBO3hppyvOWciuNQIM",
  "refresh_expires_at": "2026-10-29T04:35:56.017647386Z",
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
  "session_id": "be85e8d2-0382-477f-b921-8b8d2f4e305c",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyNTYsImlhdCI6MTc5MzIwNTM1NiwianRpIjoiNDZjZjNkMzEtMWIwMy00YjA1LWE1ZWYtZjhkNzk0NjliYmI5Iiwic2lkIjoiYmU4NWU4ZDItMDM4Mi00NzdmLWI5MjEtOGI4ZDJmNGUzMDVjIn0.JhLEP0oG5zPrfVh_2vbvZQQH0mksiT2jgEOzrdIRauE",
  "access_expires_at": "2026-10-28T16:50:56.569864358Z",
  "refresh_token": "vY-a91KF_In_50EtMnvWE6HJdO6tL3cE8c0YS4X1zyw",
  "refresh_expires_at": "2026-10-29T04:35:56.569368866Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/09c5a1ad-4b16-4452-8352-42e9abc459d0/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "09c5a1ad-4b16-4452-8352-42e9abc459d0",
      "author_type": "RIDER",
      "author_id": "8dc9709a-02b2-4a22-9de0-fba16ad1eb0e",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T16:35:54.937458Z"
    },
    {
      "order_id": "09c5a1ad-4b16-4452-8352-42e9abc459d0",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "8dc9709a-02b2-4a22-9de0-fba16ad1eb0e",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T16:35:55.204061Z"
    }
  ]
}
```

Done: ratings for order 09c5a1ad-4b16-4452-8352-42e9abc459d0.

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
  "session_id": "31353d29-76cd-4a0f-afd3-90453d96cd97",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyNTcsImlhdCI6MTc5MzIwNTM1NywianRpIjoiNjI2OWU2ZTItMjVhYi00YjVjLTliYWMtYmM5NTdlYWM3NTM3Iiwic2lkIjoiMzEzNTNkMjktNzZjZC00YTBmLWFmZDMtOTA0NTNkOTZjZDk3In0.c5L3HZ5Dy0bhv0tEhc6rPlrijUyqlP9auf8kiPhF1lA",
  "access_expires_at": "2026-10-28T16:50:57.407263409Z",
  "refresh_token": "yLA8TpKHwfB6kKYKbdvrDYwUj22u5C8aEBP5mqGAdV0",
  "refresh_expires_at": "2026-10-29T04:35:57.406690763Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "a558b5a3-7bac-4e0d-9839-0318ab4082ed",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "5b7e46b8-6203-48ca-ad6f-9f7f272e5231",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:35:57.705085Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5b7e46b8-6203-48ca-ad6f-9f7f272e5231` → **200**

```json
{
  "id": "5b7e46b8-6203-48ca-ad6f-9f7f272e5231",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:35:57.705085Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5b7e46b8-6203-48ca-ad6f-9f7f272e5231` → **200**

```json
{
  "id": "5b7e46b8-6203-48ca-ad6f-9f7f272e5231",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:35:57.705085Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5b7e46b8-6203-48ca-ad6f-9f7f272e5231` → **200**

```json
{
  "id": "5b7e46b8-6203-48ca-ad6f-9f7f272e5231",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:35:57.705085Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5b7e46b8-6203-48ca-ad6f-9f7f272e5231` → **200**

```json
{
  "id": "5b7e46b8-6203-48ca-ad6f-9f7f272e5231",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:35:57.705085Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5b7e46b8-6203-48ca-ad6f-9f7f272e5231` → **200**

```json
{
  "id": "5b7e46b8-6203-48ca-ad6f-9f7f272e5231",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T16:35:57.705085Z",
  "ready_at": "2026-10-28T16:36:01.82592Z",
  "expires_at": "2026-10-29T16:36:01.82592Z"
}
```

`GET /api/admin/v1/reports/exports/5b7e46b8-6203-48ca-ad6f-9f7f272e5231/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
total,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "47039d41-2223-4f8f-8ce4-c8d6415a2d64",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "e4bf6f9e-b037-45d6-9ed7-a1b2754e3abe",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:36:03.328209Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e4bf6f9e-b037-45d6-9ed7-a1b2754e3abe` → **200**

```json
{
  "id": "e4bf6f9e-b037-45d6-9ed7-a1b2754e3abe",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:36:03.328209Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e4bf6f9e-b037-45d6-9ed7-a1b2754e3abe` → **200**

```json
{
  "id": "e4bf6f9e-b037-45d6-9ed7-a1b2754e3abe",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:36:03.328209Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e4bf6f9e-b037-45d6-9ed7-a1b2754e3abe` → **200**

```json
{
  "id": "e4bf6f9e-b037-45d6-9ed7-a1b2754e3abe",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:36:03.328209Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e4bf6f9e-b037-45d6-9ed7-a1b2754e3abe` → **200**

```json
{
  "id": "e4bf6f9e-b037-45d6-9ed7-a1b2754e3abe",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T16:36:03.328209Z",
  "ready_at": "2026-10-28T16:36:06.834253Z",
  "expires_at": "2026-10-29T16:36:06.834253Z"
}
```

`GET /api/admin/v1/reports/exports/e4bf6f9e-b037-45d6-9ed7-a1b2754e3abe/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/0a9e6b6e-3327-4440-b2ee-9207edf98ab4` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/0a9e6b6e-3327-4440-b2ee-9207edf98ab4",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2b35a61c-2fbb-4d14-9fd8-79853ba6122d"
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
  "device_ref": "sandbox-28817"
}
```

```json
{
  "challenge_id": "11cee146-a74d-47cf-8960-7811848340ae",
  "expires_at": "2026-10-28T16:41:07.981658679Z",
  "resend_available_at": "2026-10-28T16:36:08.981658679Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "469377",
  "sent_at": "2026-10-28T16:36:07.983821012Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "11cee146-a74d-47cf-8960-7811848340ae",
  "code": "469377",
  "device_ref": "sandbox-28817"
}
```

```json
{
  "session_id": "e95a1f30-f7dd-4b73-bd23-7bf8d6ade5a2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjI2OCwiaWF0IjoxNzkzMjA1MzY4LCJqdGkiOiJjZjM5MzJmZS0wNzZiLTQyOTAtYmIzNy1hYTVmMGEzZWM0NGUiLCJzaWQiOiJlOTVhMWYzMC1mN2RkLTRiNzMtYmQyMy03YmY4ZDZhZGU1YTIifQ.Jut7PRtNugOgq7sqcArq1lRk97NU3UkR4v5YT_uh7eg",
  "access_expires_at": "2026-10-28T16:51:08.26909718Z",
  "refresh_token": "4FpNa-VgE01PYOiucdz89HwQbT0c3jajQfacyIcgmBM",
  "refresh_expires_at": "2026-11-27T16:36:08.268482264Z",
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
  "command_id": "bc2538fd-39d5-4d3e-87ab-21cdfff8f601",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:36:09Z",
    "sequence": 1793205369384
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3dfc2f14-6c1d-4eea-ba50-f406945b4b94",
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
  "last_heartbeat_at": "2026-10-28T16:36:09.056845Z",
  "last_location_at": "2026-10-28T16:36:09.056845Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "fd97e6d3-39be-4659-8532-d8053ff653d6",
  "points": [
    {
      "sequence": 1793205371351,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T16:35:11Z"
    },
    {
      "sequence": 1793205371358,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T16:36:11Z"
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
  "session_id": "df642df0-91a7-4534-959f-110e8edd86de",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyNzEsImlhdCI6MTc5MzIwNTM3MSwianRpIjoiZDI2MWU3MjEtOTAxMS00ZWJkLWI4NGYtZWU4YTQ0NmJmODI4Iiwic2lkIjoiZGY2NDJkZjAtOTFhNy00NTM0LTk1OWYtMTEwZThlZGQ4NmRlIn0.XEUmYxr8FJk_ndgxlx0gkQRMd9rHpa_0wO22pq63HhY",
  "access_expires_at": "2026-10-28T16:51:11.971367685Z",
  "refresh_token": "4Ie5q_0GXUU0ayGTgyAcyF4Mb8yYyQFhMqiMQuq7_Cs",
  "refresh_expires_at": "2026-10-29T04:36:11.97076233Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "6c8f70b8-2f4b-425f-84d0-f054a25e7b0b",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T16:36:11Z",
        "track_point_id": "d7e26fa8-fbd3-4fdf-924c-8d8e02147c9f",
        "work_session_id": "3dfc2f14-6c1d-4eea-ba50-f406945b4b94"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T16:36:11Z",
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

`POST /api/admin/v1/driver-risk-flags/6c8f70b8-2f4b-425f-84d0-f054a25e7b0b/confirm` → **200**

```json
{
  "command_id": "49757878-a6f1-49b7-a2d3-23181ca10566",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "6c8f70b8-2f4b-425f-84d0-f054a25e7b0b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T16:36:11Z",
    "track_point_id": "d7e26fa8-fbd3-4fdf-924c-8d8e02147c9f",
    "work_session_id": "3dfc2f14-6c1d-4eea-ba50-f406945b4b94"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T16:36:11Z",
  "reason": null,
  "reviewed_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
  "reviewed_at": "2026-10-28T16:36:12.825395Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/6c8f70b8-2f4b-425f-84d0-f054a25e7b0b/dismiss` → **409**

```json
{
  "command_id": "f81410bc-a8fa-4ad0-a106-661162c56946",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/6c8f70b8-2f4b-425f-84d0-f054a25e7b0b/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "248a0bd7-620f-45a0-b6b0-e66f182407f5"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "2789edf9-5c76-4a24-9b1d-b577a937c095",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "eadcd6c5-03bd-47e1-b9b9-f9fd46fcb8a3",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
  "raised_at": "2026-10-28T16:36:13.367704Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/eadcd6c5-03bd-47e1-b9b9-f9fd46fcb8a3/dismiss` → **200**

```json
{
  "command_id": "c7464b47-bb2a-4a17-a3ee-f0e917d30216",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "eadcd6c5-03bd-47e1-b9b9-f9fd46fcb8a3",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
  "raised_at": "2026-10-28T16:36:13.367704Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
  "reviewed_at": "2026-10-28T16:36:13.644155Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "f79ec920-db06-4d0f-8cf9-f4f0e32cf57c",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "6c8f70b8-2f4b-425f-84d0-f054a25e7b0b"
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
      "actor_id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T16:36:13.926597Z"
    }
  ]
}
```

Done: flag 6c8f70b8-2f4b-425f-84d0-f054a25e7b0b confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "6740aa8c-55dc-4f6f-b8eb-46bfccdbe872",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyNzQsImlhdCI6MTc5MzIwNTM3NCwianRpIjoiMTA2YWU3OWItYTljZC00NTA5LTg5MGItYjFhYjVlZGJiMWIzIiwic2lkIjoiNjc0MGFhOGMtNTVkYy00ZjZmLWI4ZWItNDZiZmNjZGJlODcyIn0.1gwlWmxODj1qGwuNWcJAcN1N13qKVHlSsp0FeKNOg3E",
  "access_expires_at": "2026-10-28T16:51:14.758401125Z",
  "refresh_token": "JbnbW5wVvmla0eUZxz_2PuADPwjKyNQYvE6AZlS5NSc",
  "refresh_expires_at": "2026-10-29T04:36:14.757799136Z",
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
      "actor_id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T16:36:13.926597Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "f03b6f2d-5a8f-451d-a86f-1c90643e5e9d",
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
  "session_id": "3dfc2f14-6c1d-4eea-ba50-f406945b4b94",
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
  "last_heartbeat_at": "2026-10-28T16:36:09.056845Z",
  "last_location_at": "2026-10-28T16:36:09.056845Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3dfc2f14-6c1d-4eea-ba50-f406945b4b94/close` → **200**

```json
{
  "command_id": "0c6c40c4-d294-403e-a938-86385a94fe40",
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
  "session_id": "2d809020-c5e5-4db2-80d0-2d579f1697b9",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyNzYsImlhdCI6MTc5MzIwNTM3NiwianRpIjoiNThmMmVlZDYtOThmMS00OWZmLTg4NGUtMmU1NDdhZTEwMDYwIiwic2lkIjoiMmQ4MDkwMjAtYzVlNS00ZGIyLTgwZDAtMmQ1NzlmMTY5N2I5In0.MAFes_Z7A4T1AT-XhF5oPcqYDQVOy340QIRGYWteES4",
  "access_expires_at": "2026-10-28T16:51:16.422305642Z",
  "refresh_token": "QJW7ka58WD9rP6oC1GMTO6N1Yp4KntsNz5DMWafF3W0",
  "refresh_expires_at": "2026-10-29T04:36:16.421771277Z",
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
  "command_id": "19170d4d-3b38-4031-a72c-49792e65071a",
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
  "changed_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T16:36:16.972074Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "19170d4d-3b38-4031-a72c-49792e65071a",
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
  "changed_by": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T16:36:16.972074Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48381739149",
  "device_ref": "sandbox-10526"
}
```

```json
{
  "challenge_id": "00f9ef62-6cd9-4a65-9760-60db39560bc0",
  "expires_at": "2026-10-28T16:41:17.520021023Z",
  "resend_available_at": "2026-10-28T16:36:18.520021023Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48381739149` → **200**

```json
{
  "phone": "+48381739149",
  "audience": "CLIENT",
  "code": "648965",
  "sent_at": "2026-10-28T16:36:17.522179058Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "00f9ef62-6cd9-4a65-9760-60db39560bc0",
  "code": "648965",
  "device_ref": "sandbox-10526"
}
```

```json
{
  "session_id": "e9d4c112-6b2c-4032-b2b8-627cc1542eb6",
  "subject": {
    "type": "CLIENT",
    "id": "32bde5c7-df43-4181-b30e-f498faa8910d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMmJkZTVjNy1kZjQzLTQxODEtYjMwZS1mNDk4ZmFhODkxMGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2Mjc3LCJpYXQiOjE3OTMyMDUzNzcsImp0aSI6ImNhOTA2ZWJmLTMxY2YtNDI5NC04YjQwLWE0ZDc5NjBkZmU2NiIsInNpZCI6ImU5ZDRjMTEyLTZiMmMtNDAzMi1iMmI4LTYyN2NjMTU0MmViNiJ9.nTs68J7iZMAtBPvJaHucOAY2kZp1sfXQ0rc5jwfKWKg",
  "access_expires_at": "2026-10-28T16:51:17.814762736Z",
  "refresh_token": "3lC7v2X-O7XsM2hzGsMlJMIL75eWuyu5q6BUrFrxODo",
  "refresh_expires_at": "2026-11-27T16:36:17.814149786Z",
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
  "correlation_id": "5f2a93bb-66cc-4e05-b776-6aed0f15cbbc"
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
  "device_ref": "sandbox-3713"
}
```

```json
{
  "challenge_id": "6156d96b-2c00-47f1-a7af-b6d192d64d7f",
  "expires_at": "2026-10-28T16:41:18.6179768Z",
  "resend_available_at": "2026-10-28T16:36:19.6179768Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "435556",
  "sent_at": "2026-10-28T16:36:18.620172181Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6156d96b-2c00-47f1-a7af-b6d192d64d7f",
  "code": "435556",
  "device_ref": "sandbox-3713"
}
```

```json
{
  "session_id": "85950f5c-c979-4d55-8927-49dac1ee4c2f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjI3OCwiaWF0IjoxNzkzMjA1Mzc4LCJqdGkiOiI5MTE5ZTUxZi1hYjc4LTQ3OGYtODFjNS1jNDNiZTk3NTE0NDAiLCJzaWQiOiI4NTk1MGY1Yy1jOTc5LTRkNTUtODkyNy00OWRhYzFlZTRjMmYifQ.2_ygxDzQsHxhXiH3hjr0mikjEaInYiB5xB0_9ZyMZfU",
  "access_expires_at": "2026-10-28T16:51:18.901601898Z",
  "refresh_token": "dOLWV8KmYC-PGd82yPRhGPFr6bfdyBp8BFHka8B8paU",
  "refresh_expires_at": "2026-11-27T16:36:18.901053318Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4c36c4a7-55f7-4384-a407-258c7fc6ae51",
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
  "last_heartbeat_at": "2026-10-28T16:35:47.536212Z",
  "last_location_at": "2026-10-28T16:35:47.536212Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4c36c4a7-55f7-4384-a407-258c7fc6ae51/handover` → **200**

```json
{
  "command_id": "f710e883-5066-43e2-ac15-8b5e9b79f2dc",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4c36c4a7-55f7-4384-a407-258c7fc6ae51",
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
  "last_heartbeat_at": "2026-10-28T16:35:47.536212Z",
  "last_location_at": "2026-10-28T16:35:47.536212Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4c36c4a7-55f7-4384-a407-258c7fc6ae51/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:36:19Z",
    "sequence": 1793205379688
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4c36c4a7-55f7-4384-a407-258c7fc6ae51",
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
  "last_heartbeat_at": "2026-10-28T16:36:19.706906Z",
  "last_location_at": "2026-10-28T16:36:19.706906Z",
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
  "session_id": "4c36c4a7-55f7-4384-a407-258c7fc6ae51",
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
  "last_heartbeat_at": "2026-10-28T16:36:19.706906Z",
  "last_location_at": "2026-10-28T16:36:19.706906Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4c36c4a7-55f7-4384-a407-258c7fc6ae51/close` → **200**

```json
{
  "command_id": "05af3e44-1137-4262-b1b4-2761411121d4",
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
  "correlation_id": "59232cc3-6040-43ab-b3c9-1590b34e3ea5"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677256574",
  "device_ref": "sandbox-6273"
}
```

```json
{
  "challenge_id": "09963c1b-0fde-47a2-ba24-68750157b236",
  "expires_at": "2026-10-28T16:41:21.063933934Z",
  "resend_available_at": "2026-10-28T16:36:22.063933934Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677256574` → **200**

```json
{
  "phone": "+380677256574",
  "audience": "CLIENT",
  "code": "367046",
  "sent_at": "2026-10-28T16:36:21.066147902Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "09963c1b-0fde-47a2-ba24-68750157b236",
  "code": "367046",
  "device_ref": "sandbox-6273"
}
```

```json
{
  "session_id": "9afa9b4d-a969-4caa-81e8-03c05de18098",
  "subject": {
    "type": "CLIENT",
    "id": "b31ba0cf-0b66-47ec-b6ff-4a1fff5afeee"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzFiYTBjZi0wYjY2LTQ3ZWMtYjZmZi00YTFmZmY1YWZlZWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MjgxLCJpYXQiOjE3OTMyMDUzODEsImp0aSI6ImY2YjJjYTg4LTIxYTctNDEzNC1iNjgyLTNjMTc2ODY5NTc0YSIsInNpZCI6IjlhZmE5YjRkLWE5NjktNGNhYS04MWU4LTAzYzA1ZGUxODA5OCJ9.y4Sg4ABW_C1unhHcX2LWpdBtB0ZVHrYB9znEOxALvWY",
  "access_expires_at": "2026-10-28T16:51:21.350504013Z",
  "refresh_token": "9IzkJb4fohhNU0siWbUAzyDTjI1U87VdWCa3bjtETiI",
  "refresh_expires_at": "2026-11-27T16:36:21.34995374Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "318e4052-fccb-494f-820e-31851040affb",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "8423c8d8-0280-4b2b-8ee5-36563755c1b0",
  "upload_path": "/api/rider/v1/uploads/8423c8d8-0280-4b2b-8ee5-36563755c1b0",
  "expires_at": "2026-10-28T16:51:21.615934911Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/8423c8d8-0280-4b2b-8ee5-36563755c1b0` → **200**

```json
{
  "file_id": "8423c8d8-0280-4b2b-8ee5-36563755c1b0",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "7a0dbb33-fdc8-4287-9001-be4abee31b4d",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "8423c8d8-0280-4b2b-8ee5-36563755c1b0"
  ]
}
```

```json
{
  "id": "3c9805e1-38c4-4382-bfe3-d8f096515285",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b31ba0cf-0b66-47ec-b6ff-4a1fff5afeee",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T16:36:21.915879Z",
  "updated_at": "2026-10-28T16:36:21.915879Z",
  "messages": [
    {
      "id": "c0e958db-4039-4d30-be62-53e1587dbf0a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b31ba0cf-0b66-47ec-b6ff-4a1fff5afeee",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:36:21.917222Z",
      "attachments": [
        {
          "file_id": "8423c8d8-0280-4b2b-8ee5-36563755c1b0",
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
  "session_id": "2f69ebc0-3706-45b4-b4e7-aebd8dfaabdf",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyODIsImlhdCI6MTc5MzIwNTM4MiwianRpIjoiY2Q5MzE3MTEtZmQzNS00NmZiLWI5NGMtOTIwZGNkNmQyZjdiIiwic2lkIjoiMmY2OWViYzAtMzcwNi00NWI0LWI0ZTctYWViZDhkZmFhYmRmIn0.GyaT11E-qhl4OLVddw5JNHD6K2dFkwRibheUw7vyYew",
  "access_expires_at": "2026-10-28T16:51:22.496164668Z",
  "refresh_token": "aHRP595wUgNuYV9T3vj9XaIvtXA7JacnpyEgd4arRRE",
  "refresh_expires_at": "2026-10-29T04:36:22.495646003Z",
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
  "session_id": "aae12c20-2205-4580-99ac-d1ed08db89d6",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyODMsImlhdCI6MTc5MzIwNTM4MywianRpIjoiNmFkMzY3OTMtMzAzOS00YzNiLWFkYjEtYTRkMzc3MjNjNjExIiwic2lkIjoiYWFlMTJjMjAtMjIwNS00NTgwLTk5YWMtZDFlZDA4ZGI4OWQ2In0.wxQ2MspmZX2KD_gIhq8Ex2XGZsP-2BR633AYcy_fJbw",
  "access_expires_at": "2026-10-28T16:51:23.052020586Z",
  "refresh_token": "JfJdVqiQ6482uQoxa0CJ-pSOKl-uhCNlOlUAKJmJy64",
  "refresh_expires_at": "2026-10-29T04:36:23.051315104Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/3c9805e1-38c4-4382-bfe3-d8f096515285/attachments/8423c8d8-0280-4b2b-8ee5-36563755c1b0` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "2663af40-138b-4052-bf2e-ac025857919f",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "ed8e5cfe-9f87-44ba-bd84-c5ad66775f9d",
  "upload_path": "/api/operator/v1/uploads/ed8e5cfe-9f87-44ba-bd84-c5ad66775f9d",
  "expires_at": "2026-10-28T16:51:23.333486783Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/ed8e5cfe-9f87-44ba-bd84-c5ad66775f9d` → **200**

```json
{
  "file_id": "ed8e5cfe-9f87-44ba-bd84-c5ad66775f9d",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/3c9805e1-38c4-4382-bfe3-d8f096515285` → **200**

```json
{
  "id": "3c9805e1-38c4-4382-bfe3-d8f096515285",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b31ba0cf-0b66-47ec-b6ff-4a1fff5afeee",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T16:36:21.915879Z",
  "updated_at": "2026-10-28T16:36:21.915879Z",
  "messages": [
    {
      "id": "c0e958db-4039-4d30-be62-53e1587dbf0a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b31ba0cf-0b66-47ec-b6ff-4a1fff5afeee",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:36:21.917222Z",
      "attachments": [
        {
          "file_id": "8423c8d8-0280-4b2b-8ee5-36563755c1b0",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/3c9805e1-38c4-4382-bfe3-d8f096515285/comments` → **200**

```json
{
  "command_id": "0634e4e5-a108-4915-96a1-1e248429f2a1",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "ed8e5cfe-9f87-44ba-bd84-c5ad66775f9d"
  ]
}
```

```json
{
  "id": "3c9805e1-38c4-4382-bfe3-d8f096515285",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b31ba0cf-0b66-47ec-b6ff-4a1fff5afeee",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T16:36:21.915879Z",
  "updated_at": "2026-10-28T16:36:23.896905Z",
  "messages": [
    {
      "id": "c0e958db-4039-4d30-be62-53e1587dbf0a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b31ba0cf-0b66-47ec-b6ff-4a1fff5afeee",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:36:21.917222Z",
      "attachments": [
        {
          "file_id": "8423c8d8-0280-4b2b-8ee5-36563755c1b0",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "2d886dbb-9d25-4298-b147-69915077fc88",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T16:36:23.896478Z",
      "attachments": [
        {
          "file_id": "ed8e5cfe-9f87-44ba-bd84-c5ad66775f9d",
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

`GET /api/rider/v1/support/cases/3c9805e1-38c4-4382-bfe3-d8f096515285` → **200**

```json
{
  "id": "3c9805e1-38c4-4382-bfe3-d8f096515285",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b31ba0cf-0b66-47ec-b6ff-4a1fff5afeee",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T16:36:21.915879Z",
  "updated_at": "2026-10-28T16:36:23.896905Z",
  "messages": [
    {
      "id": "c0e958db-4039-4d30-be62-53e1587dbf0a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b31ba0cf-0b66-47ec-b6ff-4a1fff5afeee",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:36:21.917222Z",
      "attachments": [
        {
          "file_id": "8423c8d8-0280-4b2b-8ee5-36563755c1b0",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "2d886dbb-9d25-4298-b147-69915077fc88",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T16:36:23.896478Z",
      "attachments": [
        {
          "file_id": "ed8e5cfe-9f87-44ba-bd84-c5ad66775f9d",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/3c9805e1-38c4-4382-bfe3-d8f096515285/attachments/ed8e5cfe-9f87-44ba-bd84-c5ad66775f9d` → **200**

Done: support case 3c9805e1-38c4-4382-bfe3-d8f096515285, rider attachment 8423c8d8-0280-4b2b-8ee5-36563755c1b0, operator attachment ed8e5cfe-9f87-44ba-bd84-c5ad66775f9d.

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
  "session_id": "86ee5023-2446-4636-802f-62c509abb412",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyODQsImlhdCI6MTc5MzIwNTM4NCwianRpIjoiYmE5M2NhYzUtMzhhZS00MjMyLThmMWYtMjEzMjNiYzEwOGQ4Iiwic2lkIjoiODZlZTUwMjMtMjQ0Ni00NjM2LTgwMmYtNjJjNTA5YWJiNDEyIn0.Zm1UJIILYIY2HCbk43Qj6hbH-P-lhdPQjUjBZiY4epE",
  "access_expires_at": "2026-10-28T16:51:24.769334671Z",
  "refresh_token": "WyaVXAjKIEqYnUix4IMAndeUjwig4AN6ulgCaXQq5Tg",
  "refresh_expires_at": "2026-10-29T04:36:24.768732291Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-12288"
}
```

```json
{
  "challenge_id": "b372d082-e8a1-43e6-ba20-a754ac2d7094",
  "expires_at": "2026-10-28T16:41:25.025635141Z",
  "resend_available_at": "2026-10-28T16:36:26.025635141Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "938225",
  "sent_at": "2026-10-28T16:36:25.027899404Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b372d082-e8a1-43e6-ba20-a754ac2d7094",
  "code": "938225",
  "device_ref": "sandbox-12288"
}
```

```json
{
  "session_id": "b34b7b9f-8d98-4674-b8be-2d307289fb03",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjI4NSwiaWF0IjoxNzkzMjA1Mzg1LCJqdGkiOiI2MzlkZTQ0NS03NmIxLTRlY2YtOGM0ZS1iNjFmNzFiNTM1NjQiLCJzaWQiOiJiMzRiN2I5Zi04ZDk4LTQ2NzQtYjhiZS0yZDMwNzI4OWZiMDMifQ.wXAGp6xVDAemxecdxuQ1P3VdKh5o0ErC6FYxsNdO3iE",
  "access_expires_at": "2026-10-28T16:51:25.317685811Z",
  "refresh_token": "e_iK6j3EWm7B9ePcVBOJbDVLIiQcWUlX0dMpFKXzaCg",
  "refresh_expires_at": "2026-11-27T16:36:25.31718009Z",
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
      "actor_id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T16:36:13.926597Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T16:36:15.306617Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "8419f13c-8791-4f5b-b110-be6e406eb422",
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
  "device_ref": "sandbox-22808"
}
```

```json
{
  "challenge_id": "44088ab4-6836-4710-bd50-162979133e9c",
  "expires_at": "2026-10-28T16:41:26.406132072Z",
  "resend_available_at": "2026-10-28T16:36:27.406132072Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "895174",
  "sent_at": "2026-10-28T16:36:26.408146112Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "44088ab4-6836-4710-bd50-162979133e9c",
  "code": "895174",
  "device_ref": "sandbox-22808"
}
```

```json
{
  "session_id": "76a91cd9-10d4-41fa-a55b-dae5d967ed09",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjI4NiwiaWF0IjoxNzkzMjA1Mzg2LCJqdGkiOiJhMTFlNTNjYS1hMTEyLTRlN2ItYjAzYi0yZTEzMDVkOGNiOGQiLCJzaWQiOiI3NmE5MWNkOS0xMGQ0LTQxZmEtYTU1Yi1kYWU1ZDk2N2VkMDkifQ.V37o59vqYkjwAMvRQcy40UGssI6KxOZTxhCjO5zSM4g",
  "access_expires_at": "2026-10-28T16:51:26.690179055Z",
  "refresh_token": "eXoOKQSoK5_LBWC2QcngIWfTjoclnnWqEEMWQDKdP2k",
  "refresh_expires_at": "2026-11-27T16:36:26.689572955Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1538ea35-1ede-40cc-b843-15be2c78eedf",
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
  "last_heartbeat_at": "2026-10-28T16:35:54.372625Z",
  "last_location_at": "2026-10-28T16:35:54.372625Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/1538ea35-1ede-40cc-b843-15be2c78eedf/handover` → **200**

```json
{
  "command_id": "40c83b22-9142-4ddc-8816-fa54447004d2",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1538ea35-1ede-40cc-b843-15be2c78eedf",
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
  "last_heartbeat_at": "2026-10-28T16:35:54.372625Z",
  "last_location_at": "2026-10-28T16:35:54.372625Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/1538ea35-1ede-40cc-b843-15be2c78eedf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:36:27Z",
    "sequence": 1793205387487
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1538ea35-1ede-40cc-b843-15be2c78eedf",
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
  "last_heartbeat_at": "2026-10-28T16:36:27.506317Z",
  "last_location_at": "2026-10-28T16:36:27.506317Z",
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
  "command_id": "b5f41cb8-4e1f-4351-99e3-a4f098b610ad",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:36:28Z",
    "sequence": 1793205388318
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "76509741-8265-414a-84d8-709d3d11de6e",
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
  "last_heartbeat_at": "2026-10-28T16:36:28.049911Z",
  "last_location_at": "2026-10-28T16:36:28.049911Z",
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
  "session_id": "4c516f33-7e7e-4ed2-b036-5ca4daf50ee6",
  "subject": {
    "type": "STAFF",
    "id": "725c9a46-fbce-4d3c-b712-bcb4e9ec2925"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVjOWE0Ni1mYmNlLTRkM2MtYjcxMi1iY2I0ZTllYzI5MjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyODgsImlhdCI6MTc5MzIwNTM4OCwianRpIjoiMmFkZjYyNTUtZDhlYi00ZTUzLTllNzktZjQ0NjE0ZWJhOGRiIiwic2lkIjoiNGM1MTZmMzMtN2U3ZS00ZWQyLWIwMzYtNWNhNGRhZjUwZWU2In0.0jwXdWeuuL0M9jUDZKTmxYHp3iJLSJH_MkpYst_WLAg",
  "access_expires_at": "2026-10-28T16:51:28.614227111Z",
  "refresh_token": "u7BYeujTgCZm_vUmN9-hP4p9eTwNojwNUa1nQ0KyPIQ",
  "refresh_expires_at": "2026-10-29T04:36:28.61364603Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "6e7ea284-f0e1-42de-ab02-4947d6fc325f",
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
  "id": "87626a9c-1b64-42e6-90d5-c157e6dcecb8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:41:28.880295Z",
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
  "command_id": "2fbb6fa4-bd8b-4f8a-81ae-00d48c6b8117",
  "quote_id": "87626a9c-1b64-42e6-90d5-c157e6dcecb8",
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
  "id": "c3dce4b9-a249-430e-a1cb-2dec080b2cd7",
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
  "created_at": "2026-10-28T16:36:29.153802Z",
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
    "id": "565001e3-6cd5-4697-902d-e762f555ea46",
    "order_id": "c3dce4b9-a249-430e-a1cb-2dec080b2cd7",
    "expires_at": "2026-10-28T16:36:44.157001Z",
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

`POST /api/driver/v1/offers/565001e3-6cd5-4697-902d-e762f555ea46/accept` → **200**

```json
{
  "command_id": "9f5c048a-ded9-4faa-b6ea-a185c088b678"
}
```

```json
{
  "id": "57281b2b-d3de-4bb2-8352-99036cdba4b2",
  "order_id": "c3dce4b9-a249-430e-a1cb-2dec080b2cd7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bbaebbc5-1070-4c4c-9775-b9043f87f9c2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bbaebbc5-1070-4c4c-9775-b9043f87f9c2",
  "order_id": "c3dce4b9-a249-430e-a1cb-2dec080b2cd7",
  "assignment_id": "57281b2b-d3de-4bb2-8352-99036cdba4b2",
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

`POST /api/driver/v1/work-sessions/76509741-8265-414a-84d8-709d3d11de6e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:36:30Z",
    "sequence": 1793205390495
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "76509741-8265-414a-84d8-709d3d11de6e",
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
  "last_heartbeat_at": "2026-10-28T16:36:30.516585Z",
  "last_location_at": "2026-10-28T16:36:30.516585Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/bbaebbc5-1070-4c4c-9775-b9043f87f9c2/arrive` → **200**

```json
{
  "command_id": "9abd5f4d-52ac-445f-90e9-7efcba7c198e",
  "expected_version": 0
}
```

```json
{
  "id": "bbaebbc5-1070-4c4c-9775-b9043f87f9c2",
  "order_id": "c3dce4b9-a249-430e-a1cb-2dec080b2cd7",
  "assignment_id": "57281b2b-d3de-4bb2-8352-99036cdba4b2",
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
  "arrived_at": "2026-10-28T16:36:30.789024Z",
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

`POST /api/driver/v1/trips/bbaebbc5-1070-4c4c-9775-b9043f87f9c2/start` → **200**

```json
{
  "command_id": "cb6d02c7-1b7e-484a-9f60-ce039652c8ad",
  "expected_version": 1
}
```

```json
{
  "id": "bbaebbc5-1070-4c4c-9775-b9043f87f9c2",
  "order_id": "c3dce4b9-a249-430e-a1cb-2dec080b2cd7",
  "assignment_id": "57281b2b-d3de-4bb2-8352-99036cdba4b2",
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
  "arrived_at": "2026-10-28T16:36:30.789024Z",
  "started_at": "2026-10-28T16:36:31.071578Z",
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

`POST /api/driver/v1/trips/bbaebbc5-1070-4c4c-9775-b9043f87f9c2/complete` → **200**

```json
{
  "command_id": "92327fc2-538d-419e-b057-182acca796ee",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:36:31Z",
  "cash_received": true
}
```

```json
{
  "id": "bbaebbc5-1070-4c4c-9775-b9043f87f9c2",
  "order_id": "c3dce4b9-a249-430e-a1cb-2dec080b2cd7",
  "assignment_id": "57281b2b-d3de-4bb2-8352-99036cdba4b2",
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
  "arrived_at": "2026-10-28T16:36:30.789024Z",
  "started_at": "2026-10-28T16:36:31.071578Z",
  "completed_at": "2026-10-28T16:36:31.36447Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/c3dce4b9-a249-430e-a1cb-2dec080b2cd7` → **200**

```json
{
  "id": "c3dce4b9-a249-430e-a1cb-2dec080b2cd7",
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
    "id": "57281b2b-d3de-4bb2-8352-99036cdba4b2",
    "order_id": "c3dce4b9-a249-430e-a1cb-2dec080b2cd7",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "bbaebbc5-1070-4c4c-9775-b9043f87f9c2",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:36:29.153802Z",
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
  "session_id": "1538ea35-1ede-40cc-b843-15be2c78eedf",
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
  "last_heartbeat_at": "2026-10-28T16:36:27.506317Z",
  "last_location_at": "2026-10-28T16:36:27.506317Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1538ea35-1ede-40cc-b843-15be2c78eedf/close` → **200**

```json
{
  "command_id": "252ad70b-e2e6-4cee-88a9-aa354f8b17fe",
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
  "session_id": "76509741-8265-414a-84d8-709d3d11de6e",
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
  "last_heartbeat_at": "2026-10-28T16:36:30.516585Z",
  "last_location_at": "2026-10-28T16:36:30.516585Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/76509741-8265-414a-84d8-709d3d11de6e/close` → **200**

```json
{
  "command_id": "55791cb4-f36f-4f1c-9d1e-06dafc1d2fce",
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

Done: terminal order c3dce4b9-a249-430e-a1cb-2dec080b2cd7 by Andrii (5a000000-0000-4000-8000-000000000403).
