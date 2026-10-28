# Sandbox transcript (2026-10-28T16:38:42Z, 1669996)

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
  "correlation_id": "b336670a-ef79-42f5-8bc5-ed76000c43c8"
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
  "session_id": "a3d9bb3a-d325-41c2-96c8-cd304b167bbe",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY0MzEsImlhdCI6MTc5MzIwNTUzMSwianRpIjoiNDJiNDQ1M2QtZjI0My00NGQxLWEzNTUtOTdmY2U4YTljZTMyIiwic2lkIjoiYTNkOWJiM2EtZDMyNS00MWMyLTk2YzgtY2QzMDRiMTY3YmJlIn0.lUvB7xs19ROVJz9a2Bd6WDv-5PyvqnUrrs2K6ZgeUIU",
  "access_expires_at": "2026-10-28T16:53:51.763896744Z",
  "refresh_token": "C2kdyadGTRnAEJSx5ONHBGULZrUlWQrhXDeF1gayAf4",
  "refresh_expires_at": "2026-10-29T04:38:51.762167624Z",
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
  "session_id": "627c7757-c00f-4e1e-968d-aee2ca48709f",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY0MzMsImlhdCI6MTc5MzIwNTUzMywianRpIjoiOGFmNTVkNDItMGE0Yy00YWI5LWJiZDAtZjJkYjRlMGE0NDhjIiwic2lkIjoiNjI3Yzc3NTctYzAwZi00ZTFlLTk2OGQtYWVlMmNhNDg3MDlmIn0.6hdr5grk4xxN1_FJGLUgB19hTlaqFyibsoTGTTaD4aI",
  "access_expires_at": "2026-10-28T16:53:53.094812743Z",
  "refresh_token": "xgIUq1lKvcQZRMGfj-ISLvcs5ZwSbdnOZvFB5I8-clw",
  "refresh_expires_at": "2026-10-29T04:38:53.09398363Z",
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
  "command_id": "dae45e70-2473-4998-a354-e5c6b7d7ef5f",
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
  "changed_by": "6873b609-b860-49e4-8d57-f3e610bae089",
  "reason": "Sandbox: force update",
  "changed_at": "2026-10-28T16:38:53.578353649Z"
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
  "device_ref": "sandbox-31017"
}
```

```json
{
  "challenge_id": "ad8d5d76-a0b5-415a-a0ee-8d30b646f261",
  "expires_at": "2026-10-28T16:43:54.052920904Z",
  "resend_available_at": "2026-10-28T16:38:55.052920904Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380990000001` → **200**

```json
{
  "phone": "+380990000001",
  "audience": "DRIVER",
  "code": "073302",
  "sent_at": "2026-10-28T16:38:54.058335671Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad8d5d76-a0b5-415a-a0ee-8d30b646f261",
  "code": "073302",
  "device_ref": "sandbox-31017"
}
```

```json
{
  "session_id": "cad45c92-3af0-45a0-b692-018c3441cada",
  "subject": {
    "type": "DRIVER",
    "id": "fe52b930-4384-4da4-a900-ec98145d71e8"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZTUyYjkzMC00Mzg0LTRkYTQtYTkwMC1lYzk4MTQ1ZDcxZTgiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjQzNCwiaWF0IjoxNzkzMjA1NTM0LCJqdGkiOiJhZWQyYjEyMC03OWJkLTQ1NGUtYTg5Ni00YmFiOTU0NTg4NmIiLCJzaWQiOiJjYWQ0NWM5Mi0zYWYwLTQ1YTAtYjY5Mi0wMThjMzQ0MWNhZGEifQ.Mc0E3Yc5D2WGgwcgWhaKuDYrHAE5ztltQsWIc_fDHyA",
  "access_expires_at": "2026-10-28T16:53:54.31148435Z",
  "refresh_token": "a6AQ3qWbqjKhscMZ2Yq5E_i_kUHbiKa4YaSDU1vaN_A",
  "refresh_expires_at": "2026-11-27T16:38:54.310808679Z",
  "account_created": true
}
```

`POST /api/driver/v1/work-sessions` → **409**

```json
{
  "command_id": "b454d064-f755-403f-a4bb-33b17613b62f",
  "vehicle_id": "9e1abd9f-a7c4-4e63-b9d6-3add251936d1",
  "location": {
    "lat": 50.45,
    "lon": 30.52,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:38:54Z",
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
  "correlation_id": "a2a66b02-940b-4bbc-966d-cef86de772d0"
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
  "changed_by": "6873b609-b860-49e4-8d57-f3e610bae089",
  "reason": "Sandbox: force update",
  "changed_at": "2026-10-28T16:38:53.578354Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "37e1fea2-4586-409a-8405-b94b0442a321",
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
  "changed_by": "6873b609-b860-49e4-8d57-f3e610bae089",
  "reason": "Sandbox clean-up",
  "changed_at": "2026-10-28T16:38:55.023973862Z"
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
  "session_id": "16e98ca3-814e-4615-b3e0-423176f80b8c",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY0MzUsImlhdCI6MTc5MzIwNTUzNSwianRpIjoiZTg5NzVkMTQtYWYyMy00Y2I5LWEyNTgtMTJiNTIwMjk0ODJjIiwic2lkIjoiMTZlOThjYTMtODE0ZS00NjE1LWIzZTAtNDIzMTc2ZjgwYjhjIn0.ong9e1hOdPaT0oUtRn2cCeA4YDJsqV24XUrc6HPCoUU",
  "access_expires_at": "2026-10-28T16:53:55.521377228Z",
  "refresh_token": "DjddaKH6Tntdw4O-lGRdE2tbgBqrxLb2WnWau4KxZkc",
  "refresh_expires_at": "2026-10-29T04:38:55.52063904Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "c2456976-dc9d-4a39-b223-f1566decaa87",
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
  "id": "2140b7b3-054b-4050-a4d1-3ce18223176d",
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
  "created_by": "6873b609-b860-49e4-8d57-f3e610bae089",
  "created_at": "2026-10-28T16:38:55.754135Z",
  "updated_at": "2026-10-28T16:38:55.754135Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637753830",
  "device_ref": "sandbox-25195"
}
```

```json
{
  "challenge_id": "b2db2de9-c5e9-4b59-beb1-30e1f2c811d2",
  "expires_at": "2026-10-28T16:43:55.977897272Z",
  "resend_available_at": "2026-10-28T16:38:56.977897272Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637753830` → **200**

```json
{
  "phone": "+380637753830",
  "audience": "CLIENT",
  "code": "460233",
  "sent_at": "2026-10-28T16:38:55.98101627Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b2db2de9-c5e9-4b59-beb1-30e1f2c811d2",
  "code": "460233",
  "device_ref": "sandbox-25195"
}
```

```json
{
  "session_id": "45fc2b42-d513-4484-90b2-5e4fb923d4c8",
  "subject": {
    "type": "CLIENT",
    "id": "6794a988-6985-48a4-9f4f-0cbeb4c383c3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2Nzk0YTk4OC02OTg1LTQ4YTQtOWY0Zi0wY2JlYjRjMzgzYzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NDM2LCJpYXQiOjE3OTMyMDU1MzYsImp0aSI6IjJlNjUxNDUxLTI5NTctNDE3Zi05YzMwLTAxODY3MDU5OGZmMiIsInNpZCI6IjQ1ZmMyYjQyLWQ1MTMtNDQ4NC05MGIyLTVlNGZiOTIzZDRjOCJ9.98qQ_GpT_wx54nJoo9VTUhGB-nPPb1GbbwXVT1o1sZM",
  "access_expires_at": "2026-10-28T16:53:56.223716968Z",
  "refresh_token": "BI6PFLfg1Fx-Yyo0F7y8TqHLJt9ues0Ybu3Tch2GktA",
  "refresh_expires_at": "2026-11-27T16:38:56.222960448Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380637753830` → **200**

```json
{
  "client_id": "6794a988-6985-48a4-9f4f-0cbeb4c383c3"
}
```

`POST /api/admin/v1/rider-wallets/6794a988-6985-48a4-9f4f-0cbeb4c383c3/top-ups` → **201**

```json
{
  "command_id": "2037231a-b911-49c4-8650-bca7483a268f",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "6794a988-6985-48a4-9f4f-0cbeb4c383c3",
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
      "id": "8545387c-d45f-4e4d-9695-7c5016c12b68",
      "at": "2026-10-28T16:38:56.671275Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6873b609-b860-49e4-8d57-f3e610bae089",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0431d390-c830-4f95-ac86-aa732b8f5cf4",
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
  "id": "6b59aba3-331b-4c0d-84b8-a3d3fe27e9e0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:43:57.112070Z",
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
      "id": "2140b7b3-054b-4050-a4d1-3ce18223176d",
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
  "device_ref": "sandbox-24691"
}
```

```json
{
  "challenge_id": "ab773809-c1f9-41a0-b571-1be7b123f8cb",
  "expires_at": "2026-10-28T16:43:57.361722024Z",
  "resend_available_at": "2026-10-28T16:38:58.361722024Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "612936",
  "sent_at": "2026-10-28T16:38:57.364990403Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ab773809-c1f9-41a0-b571-1be7b123f8cb",
  "code": "612936",
  "device_ref": "sandbox-24691"
}
```

```json
{
  "session_id": "6d98bd5d-29ee-4a4b-a5f2-4522e9135287",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjQzNywiaWF0IjoxNzkzMjA1NTM3LCJqdGkiOiIyZWEyNTkyNS1iYzI5LTQ5Y2UtOTMwZi1lMDhjMDE4MTMyZWQiLCJzaWQiOiI2ZDk4YmQ1ZC0yOWVlLTRhNGItYTVmMi00NTIyZTkxMzUyODcifQ.D6KVjkW85b1wId6Aihr3zAqpRHsYlA0vg4hSyIiYjMo",
  "access_expires_at": "2026-10-28T16:53:57.60651613Z",
  "refresh_token": "7Tq-WlifOSYzx3IdSxCFVxlHcMXs_ZJTM_L2dAQnM6o",
  "refresh_expires_at": "2026-11-27T16:38:57.605899207Z",
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
  "command_id": "74dbded7-4922-4ceb-949b-43943e75b70f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:38:58Z",
    "sequence": 1793205538573
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "768e298c-8fc2-4ad2-b51b-01f5c2f2884c",
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
  "last_heartbeat_at": "2026-10-28T16:38:58.077289Z",
  "last_location_at": "2026-10-28T16:38:58.077289Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c7674519-0c1d-4e5c-96d8-b9f8d49b0214",
  "quote_id": "6b59aba3-331b-4c0d-84b8-a3d3fe27e9e0",
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
  "id": "1d05c0e0-cf3f-43dc-8132-5aee50ea6a93",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6794a988-6985-48a4-9f4f-0cbeb4c383c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:38:58.355262Z",
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
  "client_id": "6794a988-6985-48a4-9f4f-0cbeb4c383c3",
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
      "id": "8545387c-d45f-4e4d-9695-7c5016c12b68",
      "at": "2026-10-28T16:38:56.671275Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6873b609-b860-49e4-8d57-f3e610bae089",
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
    "id": "a836bd62-5f23-4abd-8332-676abe5b5279",
    "order_id": "1d05c0e0-cf3f-43dc-8132-5aee50ea6a93",
    "expires_at": "2026-10-28T16:39:13.365932Z",
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

`POST /api/driver/v1/offers/a836bd62-5f23-4abd-8332-676abe5b5279/accept` → **200**

```json
{
  "command_id": "db610df9-46c8-4cfe-b824-ba6d2607dd3e"
}
```

```json
{
  "id": "0ad9fe79-27c0-45c1-afaf-4fc18b653741",
  "order_id": "1d05c0e0-cf3f-43dc-8132-5aee50ea6a93",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e7a3e025-2231-4b5c-8c8b-f490b50b78e2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e7a3e025-2231-4b5c-8c8b-f490b50b78e2",
  "order_id": "1d05c0e0-cf3f-43dc-8132-5aee50ea6a93",
  "assignment_id": "0ad9fe79-27c0-45c1-afaf-4fc18b653741",
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

`POST /api/driver/v1/work-sessions/768e298c-8fc2-4ad2-b51b-01f5c2f2884c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:38:59Z",
    "sequence": 1793205539532
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "768e298c-8fc2-4ad2-b51b-01f5c2f2884c",
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
  "last_heartbeat_at": "2026-10-28T16:38:59.557839Z",
  "last_location_at": "2026-10-28T16:38:59.557839Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e7a3e025-2231-4b5c-8c8b-f490b50b78e2/arrive` → **200**

```json
{
  "command_id": "8aebbf68-9de0-4e55-a07d-a55336f0eb6f",
  "expected_version": 0
}
```

```json
{
  "id": "e7a3e025-2231-4b5c-8c8b-f490b50b78e2",
  "order_id": "1d05c0e0-cf3f-43dc-8132-5aee50ea6a93",
  "assignment_id": "0ad9fe79-27c0-45c1-afaf-4fc18b653741",
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
  "arrived_at": "2026-10-28T16:38:59.788976Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e7a3e025-2231-4b5c-8c8b-f490b50b78e2/start` → **200**

```json
{
  "command_id": "fe02c603-3f00-49ce-90b6-2f9b2162b341",
  "expected_version": 1
}
```

```json
{
  "id": "e7a3e025-2231-4b5c-8c8b-f490b50b78e2",
  "order_id": "1d05c0e0-cf3f-43dc-8132-5aee50ea6a93",
  "assignment_id": "0ad9fe79-27c0-45c1-afaf-4fc18b653741",
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
  "arrived_at": "2026-10-28T16:38:59.788976Z",
  "started_at": "2026-10-28T16:39:00.024041Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/e7a3e025-2231-4b5c-8c8b-f490b50b78e2/complete` → **200**

```json
{
  "command_id": "c7231658-e998-4781-951d-2c519bc74e4c",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:39:00Z",
  "cash_received": true
}
```

```json
{
  "id": "e7a3e025-2231-4b5c-8c8b-f490b50b78e2",
  "order_id": "1d05c0e0-cf3f-43dc-8132-5aee50ea6a93",
  "assignment_id": "0ad9fe79-27c0-45c1-afaf-4fc18b653741",
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
  "arrived_at": "2026-10-28T16:38:59.788976Z",
  "started_at": "2026-10-28T16:39:00.024041Z",
  "completed_at": "2026-10-28T16:39:00.286822Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "6794a988-6985-48a4-9f4f-0cbeb4c383c3",
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
      "id": "96dadbe0-1852-4fd6-a8c9-364eca9e63eb",
      "at": "2026-10-28T16:39:01.310481Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "1d05c0e0-cf3f-43dc-8132-5aee50ea6a93"
    },
    {
      "id": "8545387c-d45f-4e4d-9695-7c5016c12b68",
      "at": "2026-10-28T16:38:56.671275Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6873b609-b860-49e4-8d57-f3e610bae089",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/2140b7b3-054b-4050-a4d1-3ce18223176d/archive` → **200**

```json
{
  "command_id": "132ff612-97be-4149-968b-de8eba13b3e5",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "2140b7b3-054b-4050-a4d1-3ce18223176d",
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
  "created_by": "6873b609-b860-49e4-8d57-f3e610bae089",
  "created_at": "2026-10-28T16:38:55.754135Z",
  "updated_at": "2026-10-28T16:39:03.76915Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "768e298c-8fc2-4ad2-b51b-01f5c2f2884c",
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
  "last_heartbeat_at": "2026-10-28T16:38:59.557839Z",
  "last_location_at": "2026-10-28T16:38:59.557839Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/768e298c-8fc2-4ad2-b51b-01f5c2f2884c/close` → **200**

```json
{
  "command_id": "23be5476-18b2-4a57-a4c9-b98050687f14",
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

Done: order 1d05c0e0-cf3f-43dc-8132-5aee50ea6a93.

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
  "session_id": "657a949f-404f-4a4f-85db-d5e75e920916",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY0NDQsImlhdCI6MTc5MzIwNTU0NCwianRpIjoiNmVhMzc3YjQtZGJlMy00OWEyLTk4M2YtODFmYjVkYjAzMzgwIiwic2lkIjoiNjU3YTk0OWYtNDA0Zi00YTRmLTg1ZGItZDVlNzVlOTIwOTE2In0.BgorMHZyU8qoHfTXJ5FtRRACoN_wK1ldJZDv6abD1bc",
  "access_expires_at": "2026-10-28T16:54:04.719814321Z",
  "refresh_token": "3ZC-58IgTH9NwRPpTxxrpkN7sKjP58RzaCR0nSrHHII",
  "refresh_expires_at": "2026-10-29T04:39:04.719241633Z",
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
  "command_id": "6a8c233d-0c8f-4934-b7b1-3edad9455417",
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
  "session_id": "8f8165e0-a5bc-404e-b0b4-28b9c3ad7589",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY0NDUsImlhdCI6MTc5MzIwNTU0NSwianRpIjoiMmY3ZTYwMWItNWYzNi00N2M1LTlmZGUtNDA5MzIyODNkNjBmIiwic2lkIjoiOGY4MTY1ZTAtYTViYy00MDRlLWIwYjQtMjhiOWMzYWQ3NTg5In0.xsi-JJ1fsNgZvK_ECbImT-UrK2yDWDrZArmF-gJqMnw",
  "access_expires_at": "2026-10-28T16:54:05.650716554Z",
  "refresh_token": "njZI2xmtkXP5Oju4cW27HjtKrVhjnw8FwfnekEFie6M",
  "refresh_expires_at": "2026-10-29T04:39:05.650131668Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.3173827663",
    "linkedid": "1730052700.3173827663",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676102727"
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
    "id": "1730052700.3173827663",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "0229d255-edb6-4724-9f22-f99a3330bc0b",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380676102727",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T16:39:05.863362Z",
      "answered_at": null,
      "ended_at": "2026-10-28T16:39:05.885817Z",
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
    "id": "1730052600.1501429244",
    "linkedid": "1730052600.1501429244",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676102727"
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
      "id": "9fd5740b-e71c-497d-970a-d12add6d5747",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380676102727",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T16:39:06.131996Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/9fd5740b-e71c-497d-970a-d12add6d5747/answer` → **200**

```json
{
  "command_id": "a8ca620b-3fd4-41ff-879e-b0f5fb4b5bc1"
}
```

```json
{
  "id": "9fd5740b-e71c-497d-970a-d12add6d5747",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380676102727",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6873b609-b860-49e4-8d57-f3e610bae089",
  "order_ids": [],
  "started_at": "2026-10-28T16:39:06.131996Z",
  "answered_at": "2026-10-28T16:39:06.390421Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1501429244",
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
    "id": "1730052600.1501429244",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "9fd5740b-e71c-497d-970a-d12add6d5747",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676102727",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6873b609-b860-49e4-8d57-f3e610bae089",
      "order_ids": [],
      "started_at": "2026-10-28T16:39:06.131996Z",
      "answered_at": "2026-10-28T16:39:06.390421Z",
      "ended_at": "2026-10-28T16:39:06.648898Z",
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
      "id": "9fd5740b-e71c-497d-970a-d12add6d5747",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676102727",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6873b609-b860-49e4-8d57-f3e610bae089",
      "order_ids": [],
      "started_at": "2026-10-28T16:39:06.131996Z",
      "answered_at": "2026-10-28T16:39:06.390421Z",
      "ended_at": "2026-10-28T16:39:06.648898Z",
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
      "id": "9fd5740b-e71c-497d-970a-d12add6d5747",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676102727",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6873b609-b860-49e4-8d57-f3e610bae089",
      "order_ids": [],
      "started_at": "2026-10-28T16:39:06.131996Z",
      "answered_at": "2026-10-28T16:39:06.390421Z",
      "ended_at": "2026-10-28T16:39:06.648898Z",
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
      "id": "9fd5740b-e71c-497d-970a-d12add6d5747",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676102727",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6873b609-b860-49e4-8d57-f3e610bae089",
      "order_ids": [],
      "started_at": "2026-10-28T16:39:06.131996Z",
      "answered_at": "2026-10-28T16:39:06.390421Z",
      "ended_at": "2026-10-28T16:39:06.648898Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T16:39:11.141089Z"
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
      "id": "9fd5740b-e71c-497d-970a-d12add6d5747",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676102727",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6873b609-b860-49e4-8d57-f3e610bae089",
      "order_ids": [],
      "started_at": "2026-10-28T16:39:06.131996Z",
      "answered_at": "2026-10-28T16:39:06.390421Z",
      "ended_at": "2026-10-28T16:39:06.648898Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T16:39:11.141089Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/9fd5740b-e71c-497d-970a-d12add6d5747/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/9fd5740b-e71c-497d-970a-d12add6d5747/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=9fd5740b-e71c-497d-970a-d12add6d5747` → **200**

```json
{
  "changes": [
    {
      "id": "0a61752b-da15-4a39-bd20-fbbc381b05e4",
      "occurred_at": "2026-10-28T16:39:13.818132Z",
      "actor_type": "STAFF",
      "actor_id": "6873b609-b860-49e4-8d57-f3e610bae089",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "9fd5740b-e71c-497d-970a-d12add6d5747",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"de64d733-d17e-40a5-8a0b-232fb9a41b5a\", \"order_ids\": []}",
      "correlation_id": "afb8b8dc-8996-465a-b514-78d6dd65e2ff"
    },
    {
      "id": "aa8fb330-0e7c-4534-89b8-faad65c3929f",
      "occurred_at": "2026-10-28T16:39:13.789701Z",
      "actor_type": "STAFF",
      "actor_id": "6873b609-b860-49e4-8d57-f3e610bae089",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "9fd5740b-e71c-497d-970a-d12add6d5747",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"de64d733-d17e-40a5-8a0b-232fb9a41b5a\", \"order_ids\": []}",
      "correlation_id": "eea91c1d-d6b3-4812-80db-b114629f88c1"
    }
  ]
}
```

Done: call 9fd5740b-e71c-497d-970a-d12add6d5747 recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635215203",
  "device_ref": "sandbox-17413"
}
```

```json
{
  "challenge_id": "3a8200c4-0fb2-44c2-b1d7-cf6fcbe0f468",
  "expires_at": "2026-10-28T16:44:14.07548542Z",
  "resend_available_at": "2026-10-28T16:39:15.07548542Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635215203` → **200**

```json
{
  "phone": "+380635215203",
  "audience": "CLIENT",
  "code": "235554",
  "sent_at": "2026-10-28T16:39:14.079947659Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3a8200c4-0fb2-44c2-b1d7-cf6fcbe0f468",
  "code": "235554",
  "device_ref": "sandbox-17413"
}
```

```json
{
  "session_id": "be1dde05-c374-4558-ae84-a7e09a72f614",
  "subject": {
    "type": "CLIENT",
    "id": "d92f9904-28e4-498d-8e4f-37e6a169f05f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkOTJmOTkwNC0yOGU0LTQ5OGQtOGU0Zi0zN2U2YTE2OWYwNWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NDU0LCJpYXQiOjE3OTMyMDU1NTQsImp0aSI6ImFiMTAzMmE3LTExOWItNGYyOC1iN2QyLTUwOGVkN2M5ZTE1MiIsInNpZCI6ImJlMWRkZTA1LWMzNzQtNDU1OC1hZTg0LWE3ZTA5YTcyZjYxNCJ9.GtXN3a0cG1Nr9VpzkfyyeyhgmcKh9lqx_Rp-mxVoKNk",
  "access_expires_at": "2026-10-28T16:54:14.325431206Z",
  "refresh_token": "ve0V9HnoZitJhAb3Fm7esZz1RtSebeYdT9oxcTMY6Es",
  "refresh_expires_at": "2026-11-27T16:39:14.324886138Z",
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
        "uk": "Передумав їхати",
        "pl": "Zmiana planów",
        "ru": "Передумал ехать",
        "en": "Changed my mind"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "uk": "Помилився адресою",
        "pl": "Błędny adres",
        "ru": "Ошибся адресом",
        "en": "Wrong address"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "uk": "Поїду іншим транспортом",
        "pl": "Inny transport",
        "ru": "Уеду на другом транспорте",
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
  "device_ref": "sandbox-27795"
}
```

```json
{
  "challenge_id": "83a46e71-1e91-49b8-b3ac-8cf5bc49ae25",
  "expires_at": "2026-10-28T16:44:14.754403098Z",
  "resend_available_at": "2026-10-28T16:39:15.754403098Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "137027",
  "sent_at": "2026-10-28T16:39:14.799840746Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "83a46e71-1e91-49b8-b3ac-8cf5bc49ae25",
  "code": "137027",
  "device_ref": "sandbox-27795"
}
```

```json
{
  "session_id": "33f8c46c-6cfd-428c-874d-bef6a0c04b23",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjQ1NSwiaWF0IjoxNzkzMjA1NTU1LCJqdGkiOiJhNTIwZDA3MS04YmU0LTQ1NTYtYjNjYi02NWExYzU2YTM0YjUiLCJzaWQiOiIzM2Y4YzQ2Yy02Y2ZkLTQyOGMtODc0ZC1iZWY2YTBjMDRiMjMifQ.pYhDnhcQZ6el_YxKI3hNwAKpw2VHTWg32LYKrQUsVJg",
  "access_expires_at": "2026-10-28T16:54:15.067809243Z",
  "refresh_token": "-nIR8GpCACIjhCkg3NxaX2QixdzZP7otrs333kS7wcQ",
  "refresh_expires_at": "2026-11-27T16:39:15.06707062Z",
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
        "uk": "Пасажир не вийшов",
        "pl": "Pasażer nie przyszedł",
        "ru": "Пассажир не вышел",
        "en": "Passenger did not show up"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "uk": "Несправність автомобіля",
        "pl": "Awaria samochodu",
        "ru": "Неисправность автомобиля",
        "en": "Vehicle problem"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "uk": "Не можу під'їхати",
        "pl": "Nie mogę dojechać",
        "ru": "Не могу подъехать",
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
  "session_id": "c71eb616-689d-4406-9b58-8736f11af7d7",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY0NTUsImlhdCI6MTc5MzIwNTU1NSwianRpIjoiYjgzNTc5Y2ItY2NlNC00Mzk3LWIwNWQtM2FiNTk2MjYyODNlIiwic2lkIjoiYzcxZWI2MTYtNjg5ZC00NDA2LTliNTgtODczNmYxMWFmN2Q3In0._s-C6Fkc18iq5Cpnpd9SdDjihIzDBPq7Gfgp8vlkjkc",
  "access_expires_at": "2026-10-28T16:54:15.757214225Z",
  "refresh_token": "SEkkBOdw2ScmLleAFLYzvLn0c4G4uD71stG5uW_ZNUE",
  "refresh_expires_at": "2026-10-29T04:39:15.756710029Z",
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
  "session_id": "73aab76b-28fc-4c5f-9a80-618e4767d976",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY0NTYsImlhdCI6MTc5MzIwNTU1NiwianRpIjoiZTY0NzBlYzUtZjU3My00NTllLWFjODMtY2U5NGE2NjQyNzI5Iiwic2lkIjoiNzNhYWI3NmItMjhmYy00YzVmLTlhODAtNjE4ZTQ3NjdkOTc2In0.bis_MtIXihBRDRI_GjGucHieP1PfRmsB-vS_19a9iak",
  "access_expires_at": "2026-10-28T16:54:16.233823371Z",
  "refresh_token": "97GCMya319ACNRDFtZIdMj7nRqgUJak-m6j2DoHSnK8",
  "refresh_expires_at": "2026-10-29T04:39:16.233280584Z",
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
        "uk": "Пасажир попросив",
        "pl": "Na prośbę pasażera",
        "ru": "Пассажир попросил",
        "en": "Passenger asked"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "uk": "Дубль замовлення",
        "pl": "Duplikat zamówienia",
        "ru": "Дубль заказа",
        "en": "Duplicate order"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "uk": "Немає вільних авто",
        "pl": "Brak wolnych aut",
        "ru": "Нет свободных машин",
        "en": "No cars available"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "uk": "Тестове замовлення",
        "pl": "Zamówienie testowe",
        "ru": "Тестовый заказ",
        "en": "Test order"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "uk": "Помилка оператора",
        "pl": "Błąd operatora",
        "ru": "Ошибка оператора",
        "en": "Operator error"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "uk": "ДТП",
        "pl": "Wypadek",
        "ru": "ДТП",
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
  "command_id": "44a2f831-6995-4649-8122-8458f4626189",
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
  "id": "e63c1d30-620e-46ae-8669-5eba18e6de03",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:44:16.680753Z",
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
  "command_id": "0824d498-2119-4d3e-adf6-e3ca62d64475",
  "quote_id": "e63c1d30-620e-46ae-8669-5eba18e6de03",
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
  "id": "1aaf52d7-08a3-4ecf-86be-3246a9c936b9",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d92f9904-28e4-498d-8e4f-37e6a169f05f",
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
  "created_at": "2026-10-28T16:39:16.913728Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/1aaf52d7-08a3-4ecf-86be-3246a9c936b9` → **200**

```json
{
  "id": "1aaf52d7-08a3-4ecf-86be-3246a9c936b9",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d92f9904-28e4-498d-8e4f-37e6a169f05f",
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
  "created_at": "2026-10-28T16:39:16.913728Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/1aaf52d7-08a3-4ecf-86be-3246a9c936b9/cancel` → **200**

```json
{
  "command_id": "ab255fab-4d15-4919-a145-e288c061ad5c",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "1aaf52d7-08a3-4ecf-86be-3246a9c936b9",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d92f9904-28e4-498d-8e4f-37e6a169f05f",
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
  "created_at": "2026-10-28T16:39:16.913728Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "uk": "Довго чекати авто",
      "pl": "Zbyt długie oczekiwanie",
      "ru": "Долго ждать машину",
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
  "command_id": "4665a280-c5dc-4190-9dbb-10c41485109e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:39:17Z",
    "sequence": 1793205557836
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "91a3a1fb-9b60-40f4-8744-a44b8ce60c4f",
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
  "last_heartbeat_at": "2026-10-28T16:39:17.8549Z",
  "last_location_at": "2026-10-28T16:39:17.8549Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-10788"
}
```

```json
{
  "challenge_id": "3c4b617d-bd57-4e12-8c25-f06929dfc4d5",
  "expires_at": "2026-10-28T16:44:18.086394992Z",
  "resend_available_at": "2026-10-28T16:39:19.086394992Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "763972",
  "sent_at": "2026-10-28T16:39:18.089277649Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c4b617d-bd57-4e12-8c25-f06929dfc4d5",
  "code": "763972",
  "device_ref": "sandbox-10788"
}
```

```json
{
  "session_id": "0b81bd0b-05a7-4b00-a569-5d460624ae8c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjQ1OCwiaWF0IjoxNzkzMjA1NTU4LCJqdGkiOiJjYjhjNTVhOS0wNjY1LTQyNWYtOWQxMC1kNTQ0ZDM2MzFmODMiLCJzaWQiOiIwYjgxYmQwYi0wNWE3LTRiMDAtYTU2OS01ZDQ2MDYyNGFlOGMifQ.DqWeT6ZhQdUvTOJ1kd22ncaQ2BKkk14vD3JQZGfw5yo",
  "access_expires_at": "2026-10-28T16:54:18.331016684Z",
  "refresh_token": "329ZdVCe9rmX5wjGPX5yS4ITfrby8tVjK_KLMCS19DI",
  "refresh_expires_at": "2026-11-27T16:39:18.330575831Z",
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
  "command_id": "2b2be9dc-c463-44d4-9d43-87b76e786f05",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:39:18Z",
    "sequence": 1793205558758
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "abc21243-e90b-4b22-a174-1910094cb3b9",
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
  "last_heartbeat_at": "2026-10-28T16:39:18.777293Z",
  "last_location_at": "2026-10-28T16:39:18.777293Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4e3e8cf5-98bd-45a3-897e-08b4e83ce2f1",
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
  "id": "fd5f1132-912d-4e49-8f1a-41bfd3cd919e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:44:18.998771Z",
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
  "command_id": "526baf2e-4dfc-4e0b-a6b0-85acfa3a8483",
  "quote_id": "fd5f1132-912d-4e49-8f1a-41bfd3cd919e",
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
  "id": "6e8cad8f-369a-4a59-8ce8-11b50f5ed17d",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d92f9904-28e4-498d-8e4f-37e6a169f05f",
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
  "created_at": "2026-10-28T16:39:19.223521Z",
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
    "id": "a8089df8-f8e0-4ea6-b256-f1306bbaf617",
    "order_id": "6e8cad8f-369a-4a59-8ce8-11b50f5ed17d",
    "expires_at": "2026-10-28T16:39:34.22676Z",
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

`POST /api/driver/v1/offers/a8089df8-f8e0-4ea6-b256-f1306bbaf617/accept` → **200**

```json
{
  "command_id": "4fc6ff9f-adf6-4d57-b768-3484e62728b6"
}
```

```json
{
  "id": "fb7190c8-4840-43c4-b246-ef9ac134ecc5",
  "order_id": "6e8cad8f-369a-4a59-8ce8-11b50f5ed17d",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "99389341-fd07-4199-b276-c4c3dd2e91a4",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "99389341-fd07-4199-b276-c4c3dd2e91a4",
  "order_id": "6e8cad8f-369a-4a59-8ce8-11b50f5ed17d",
  "assignment_id": "fb7190c8-4840-43c4-b246-ef9ac134ecc5",
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

`POST /api/driver/v1/trips/99389341-fd07-4199-b276-c4c3dd2e91a4/cancel` → **200**

```json
{
  "command_id": "77e892ee-05ed-4b28-8403-f6ea9db6b1e3",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "99389341-fd07-4199-b276-c4c3dd2e91a4",
  "order_id": "6e8cad8f-369a-4a59-8ce8-11b50f5ed17d",
  "assignment_id": "fb7190c8-4840-43c4-b246-ef9ac134ecc5",
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

`GET /api/rider/v1/orders/6e8cad8f-369a-4a59-8ce8-11b50f5ed17d` → **200**

```json
{
  "id": "6e8cad8f-369a-4a59-8ce8-11b50f5ed17d",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "d92f9904-28e4-498d-8e4f-37e6a169f05f",
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
    "id": "fb7190c8-4840-43c4-b246-ef9ac134ecc5",
    "order_id": "6e8cad8f-369a-4a59-8ce8-11b50f5ed17d",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "99389341-fd07-4199-b276-c4c3dd2e91a4",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T16:39:19.223521Z",
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
    "id": "0850cbe3-6d81-44fa-ac3d-280d941038c9",
    "order_id": "6e8cad8f-369a-4a59-8ce8-11b50f5ed17d",
    "expires_at": "2026-10-28T16:39:35.127717Z",
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

`POST /api/driver/v1/offers/0850cbe3-6d81-44fa-ac3d-280d941038c9/accept` → **200**

```json
{
  "command_id": "739faba0-84f7-46cc-98cb-127b5f7ed9fb"
}
```

```json
{
  "id": "55a90727-1ce2-418c-9e94-e6c700622ba0",
  "order_id": "6e8cad8f-369a-4a59-8ce8-11b50f5ed17d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "459837a3-84be-4e9c-88ef-5e12f92d8da3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "459837a3-84be-4e9c-88ef-5e12f92d8da3",
  "order_id": "6e8cad8f-369a-4a59-8ce8-11b50f5ed17d",
  "assignment_id": "55a90727-1ce2-418c-9e94-e6c700622ba0",
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

`POST /api/driver/v1/trips/459837a3-84be-4e9c-88ef-5e12f92d8da3/cancel` → **200**

```json
{
  "command_id": "bb22586a-5f82-4656-a44b-c3f20d092a21",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "459837a3-84be-4e9c-88ef-5e12f92d8da3",
  "order_id": "6e8cad8f-369a-4a59-8ce8-11b50f5ed17d",
  "assignment_id": "55a90727-1ce2-418c-9e94-e6c700622ba0",
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
    "id": "6e8cad8f-369a-4a59-8ce8-11b50f5ed17d",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T16:39:19.223521Z",
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
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel"
      }
    },
    "pickup_at": null
  },
  {
    "id": "1aaf52d7-08a3-4ecf-86be-3246a9c936b9",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T16:39:16.913728Z",
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
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/6e8cad8f-369a-4a59-8ce8-11b50f5ed17d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:39:19.224102Z",
      "actor": {
        "type": "CLIENT",
        "id": "d92f9904-28e4-498d-8e4f-37e6a169f05f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6e8cad8f-369a-4a59-8ce8-11b50f5ed17d",
        "quote_id": "fd5f1132-912d-4e49-8f1a-41bfd3cd919e",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "5b4030d2-846f-4046-80fd-b42cc60ad465"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:39:19.225945Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6e8cad8f-369a-4a59-8ce8-11b50f5ed17d",
        "attempt_id": "d24f2ecd-4fd0-4007-84d8-432ea037deee",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "5b4030d2-846f-4046-80fd-b42cc60ad465"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T16:39:19.231996Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a8089df8-f8e0-4ea6-b256-f1306bbaf617",
        "order_id": "6e8cad8f-369a-4a59-8ce8-11b50f5ed17d",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "5b4030d2-846f-4046-80fd-b42cc60ad465"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T16:39:19.674966Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "a8089df8-f8e0-4ea6-b256-f1306bbaf617",
        "order_id": "6e8cad8f-369a-4a59-8ce8-11b50f5ed17d",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "fb7190c8-4840-43c4-b246-ef9ac134ecc5"
      },
      "correlation_id": "c45536c7-fb56-40af-bf63-ee8906cfe728"
```

Done: orders 1aaf52d7-08a3-4ecf-86be-3246a9c936b9, 6e8cad8f-369a-4a59-8ce8-11b50f5ed17d.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737315516",
  "device_ref": "sandbox-5519"
}
```

```json
{
  "challenge_id": "3383458e-d593-49db-9a39-d53cd6fb6534",
  "expires_at": "2026-10-28T16:44:21.963033585Z",
  "resend_available_at": "2026-10-28T16:39:22.963033585Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380737315516` → **200**

```json
{
  "phone": "+380737315516",
  "audience": "CLIENT",
  "code": "821033",
  "sent_at": "2026-10-28T16:39:21.96580581Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3383458e-d593-49db-9a39-d53cd6fb6534",
  "code": "821033",
  "device_ref": "sandbox-5519"
}
```

```json
{
  "session_id": "96542564-7d8c-4ff0-8c38-adbf60141dc1",
  "subject": {
    "type": "CLIENT",
    "id": "9ece3fd1-9a53-476d-8883-40a17c2cb8a8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZWNlM2ZkMS05YTUzLTQ3NmQtODg4My00MGExN2MyY2I4YTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NDYyLCJpYXQiOjE3OTMyMDU1NjIsImp0aSI6ImViMmUzODYxLWQ1MTEtNGIwNS1iM2RmLWNkMThlNDQ1MjE3ZiIsInNpZCI6Ijk2NTQyNTY0LTdkOGMtNGZmMC04YzM4LWFkYmY2MDE0MWRjMSJ9.r6w72HC1N6nGKmaLSp3jbfNtwdev62imnOXpsp5vmdo",
  "access_expires_at": "2026-10-28T16:54:22.204837935Z",
  "refresh_token": "eJhU-1LrJJcPdUhstrOCbsSOG33XOsuVNMJ7u3yKQ1o",
  "refresh_expires_at": "2026-11-27T16:39:22.204420627Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "e4f28afe-c983-4e07-9fbc-08ba06893335",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "18273caf-c5f2-4059-b498-0a1170758c6d",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-18273caf-c5f2-4059-b498-0a1170758c6d",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "832b2e87a78bd3fa8233e686c0b3e7b3",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=18273caf-c5f2-4059-b498-0a1170758c6d",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737315516"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=18273caf-c5f2-4059-b498-0a1170758c6d",
  "expires_at": "2026-10-28T17:09:22.429094Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/18273caf-c5f2-4059-b498-0a1170758c6d` → **200**

```json
{
  "id": "18273caf-c5f2-4059-b498-0a1170758c6d",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T17:09:22.429094Z",
  "card": {
    "id": "cf97616e-4a6d-4ebb-8d2a-e361ef8411e2",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9520",
    "card_type": "Visa",
    "created_at": "2026-10-28T16:39:22.66079Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "cf97616e-4a6d-4ebb-8d2a-e361ef8411e2",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****9520",
      "card_type": "Visa",
      "created_at": "2026-10-28T16:39:22.66079Z"
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
  "device_ref": "sandbox-24191"
}
```

```json
{
  "challenge_id": "0070ee08-1edf-4c3a-885e-de57b7857816",
  "expires_at": "2026-10-28T16:44:23.117315681Z",
  "resend_available_at": "2026-10-28T16:39:24.117315681Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "454957",
  "sent_at": "2026-10-28T16:39:23.14540614Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0070ee08-1edf-4c3a-885e-de57b7857816",
  "code": "454957",
  "device_ref": "sandbox-24191"
}
```

```json
{
  "session_id": "07f7f98f-9cfb-42c0-a523-1719a8a902d2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjQ2MywiaWF0IjoxNzkzMjA1NTYzLCJqdGkiOiI0N2M0ZTFhNS1jZDIwLTRlYmMtOWQ0My03NDI4OGM5ZTc2MzgiLCJzaWQiOiIwN2Y3Zjk4Zi05Y2ZiLTQyYzAtYTUyMy0xNzE5YThhOTAyZDIifQ.D1rPVpMpMpWdQGzMn_WkndeaUzyTwabuQiaLCKPmUKY",
  "access_expires_at": "2026-10-28T16:54:23.391752579Z",
  "refresh_token": "FW0c-wfuV1zXjot3hg9rOBpsYhdMlyIX6ruIphCMcko",
  "refresh_expires_at": "2026-11-27T16:39:23.391258468Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "abc21243-e90b-4b22-a174-1910094cb3b9",
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
  "last_heartbeat_at": "2026-10-28T16:39:18.777293Z",
  "last_location_at": "2026-10-28T16:39:18.777293Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/abc21243-e90b-4b22-a174-1910094cb3b9/handover` → **200**

```json
{
  "command_id": "2908a0c3-5a73-49dd-94af-dc346c9a7cd6",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "abc21243-e90b-4b22-a174-1910094cb3b9",
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
  "last_heartbeat_at": "2026-10-28T16:39:18.777293Z",
  "last_location_at": "2026-10-28T16:39:18.777293Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/abc21243-e90b-4b22-a174-1910094cb3b9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:39:24Z",
    "sequence": 1793205564406
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "abc21243-e90b-4b22-a174-1910094cb3b9",
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
  "last_heartbeat_at": "2026-10-28T16:39:24.059092Z",
  "last_location_at": "2026-10-28T16:39:24.059092Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c451a309-917d-4f77-ad0d-a56cecd2d4ee",
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
  "id": "a2e80e92-be0c-4320-8e5d-7d961464a88d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:44:24.285826Z",
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
  "command_id": "6840cd2c-a360-4706-9cf3-eac1f8a726ac",
  "quote_id": "a2e80e92-be0c-4320-8e5d-7d961464a88d",
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
  "id": "024bb121-fa60-4fb7-abfe-e56a2e504a92",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9ece3fd1-9a53-476d-8883-40a17c2cb8a8",
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
  "created_at": "2026-10-28T16:39:24.517282Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/024bb121-fa60-4fb7-abfe-e56a2e504a92` → **200**

```json
{
  "id": "024bb121-fa60-4fb7-abfe-e56a2e504a92",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9ece3fd1-9a53-476d-8883-40a17c2cb8a8",
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
  "created_at": "2026-10-28T16:39:24.517282Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/024bb121-fa60-4fb7-abfe-e56a2e504a92` → **200**

```json
{
  "id": "024bb121-fa60-4fb7-abfe-e56a2e504a92",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9ece3fd1-9a53-476d-8883-40a17c2cb8a8",
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
  "created_at": "2026-10-28T16:39:24.517282Z",
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
    "id": "40b3505f-de2d-4f28-8b23-6e786224128d",
    "order_id": "024bb121-fa60-4fb7-abfe-e56a2e504a92",
    "expires_at": "2026-10-28T16:39:40.515232Z",
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

`POST /api/driver/v1/offers/40b3505f-de2d-4f28-8b23-6e786224128d/accept` → **200**

```json
{
  "command_id": "244dc036-ec67-439d-a831-18126227dde5"
}
```

```json
{
  "id": "cfa7330a-ebaa-46aa-be4f-bfe3f4e4fbfd",
  "order_id": "024bb121-fa60-4fb7-abfe-e56a2e504a92",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "375129d5-f9a0-4995-b65a-e1483dc78e2b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "375129d5-f9a0-4995-b65a-e1483dc78e2b",
  "order_id": "024bb121-fa60-4fb7-abfe-e56a2e504a92",
  "assignment_id": "cfa7330a-ebaa-46aa-be4f-bfe3f4e4fbfd",
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

`POST /api/driver/v1/work-sessions/abc21243-e90b-4b22-a174-1910094cb3b9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:39:26Z",
    "sequence": 1793205566931
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "abc21243-e90b-4b22-a174-1910094cb3b9",
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
  "last_heartbeat_at": "2026-10-28T16:39:26.95112Z",
  "last_location_at": "2026-10-28T16:39:26.95112Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/375129d5-f9a0-4995-b65a-e1483dc78e2b/arrive` → **200**

```json
{
  "command_id": "f5679e16-79be-49f9-bfde-fd5fa583145e",
  "expected_version": 0
}
```

```json
{
  "id": "375129d5-f9a0-4995-b65a-e1483dc78e2b",
  "order_id": "024bb121-fa60-4fb7-abfe-e56a2e504a92",
  "assignment_id": "cfa7330a-ebaa-46aa-be4f-bfe3f4e4fbfd",
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
  "arrived_at": "2026-10-28T16:39:27.200072Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/375129d5-f9a0-4995-b65a-e1483dc78e2b/start` → **200**

```json
{
  "command_id": "51c768da-9e29-40bc-939f-3911a220dac9",
  "expected_version": 1
}
```

```json
{
  "id": "375129d5-f9a0-4995-b65a-e1483dc78e2b",
  "order_id": "024bb121-fa60-4fb7-abfe-e56a2e504a92",
  "assignment_id": "cfa7330a-ebaa-46aa-be4f-bfe3f4e4fbfd",
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
  "arrived_at": "2026-10-28T16:39:27.200072Z",
  "started_at": "2026-10-28T16:39:27.431608Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/375129d5-f9a0-4995-b65a-e1483dc78e2b/complete` → **200**

```json
{
  "command_id": "47ddb202-f86f-4b31-83a8-2695b1d9a8f0",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:39:27Z"
}
```

```json
{
  "id": "375129d5-f9a0-4995-b65a-e1483dc78e2b",
  "order_id": "024bb121-fa60-4fb7-abfe-e56a2e504a92",
  "assignment_id": "cfa7330a-ebaa-46aa-be4f-bfe3f4e4fbfd",
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
  "arrived_at": "2026-10-28T16:39:27.200072Z",
  "started_at": "2026-10-28T16:39:27.431608Z",
  "completed_at": "2026-10-28T16:39:27.666837Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/024bb121-fa60-4fb7-abfe-e56a2e504a92` → **200**

```json
{
  "id": "024bb121-fa60-4fb7-abfe-e56a2e504a92",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "9ece3fd1-9a53-476d-8883-40a17c2cb8a8",
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
    "id": "cfa7330a-ebaa-46aa-be4f-bfe3f4e4fbfd",
    "order_id": "024bb121-fa60-4fb7-abfe-e56a2e504a92",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "375129d5-f9a0-4995-b65a-e1483dc78e2b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:39:24.517282Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/024bb121-fa60-4fb7-abfe-e56a2e504a92` → **200**

```json
{
  "id": "024bb121-fa60-4fb7-abfe-e56a2e504a92",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "9ece3fd1-9a53-476d-8883-40a17c2cb8a8",
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
    "id": "cfa7330a-ebaa-46aa-be4f-bfe3f4e4fbfd",
    "order_id": "024bb121-fa60-4fb7-abfe-e56a2e504a92",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "375129d5-f9a0-4995-b65a-e1483dc78e2b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:39:24.517282Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/024bb121-fa60-4fb7-abfe-e56a2e504a92` → **200**

```json
{
  "id": "024bb121-fa60-4fb7-abfe-e56a2e504a92",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "9ece3fd1-9a53-476d-8883-40a17c2cb8a8",
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
    "id": "cfa7330a-ebaa-46aa-be4f-bfe3f4e4fbfd",
    "order_id": "024bb121-fa60-4fb7-abfe-e56a2e504a92",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "375129d5-f9a0-4995-b65a-e1483dc78e2b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:39:24.517282Z",
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
      "id": "8b758b54-b202-49c7-88fb-541710c32b63",
      "at": "2026-10-28T16:39:27.737746Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "024bb121-fa60-4fb7-abfe-e56a2e504a92",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/024bb121-fa60-4fb7-abfe-e56a2e504a92/tip` → **200**

```json
{
  "order_id": "024bb121-fa60-4fb7-abfe-e56a2e504a92",
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
  "available_until": "2026-10-29T16:39:27.666837Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/024bb121-fa60-4fb7-abfe-e56a2e504a92/tip` → **201**

```json
{
  "command_id": "e72e5c5b-10a0-4785-bca2-04c49857775c",
  "amount_minor": 2500
}
```

```json
{
  "id": "5662eac1-8335-4f1e-bd70-37d6ba8b2ec9",
  "order_id": "024bb121-fa60-4fb7-abfe-e56a2e504a92",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T16:39:31.2664Z"
}
```

`GET /api/rider/v1/orders/024bb121-fa60-4fb7-abfe-e56a2e504a92/tip` → **200**

```json
{
  "order_id": "024bb121-fa60-4fb7-abfe-e56a2e504a92",
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
  "available_until": "2026-10-29T16:39:27.666837Z",
  "open": false,
  "tip": {
    "id": "5662eac1-8335-4f1e-bd70-37d6ba8b2ec9",
    "order_id": "024bb121-fa60-4fb7-abfe-e56a2e504a92",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T16:39:31.2664Z"
  }
}
```

`GET /api/rider/v1/orders/024bb121-fa60-4fb7-abfe-e56a2e504a92/tip` → **200**

```json
{
  "order_id": "024bb121-fa60-4fb7-abfe-e56a2e504a92",
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
  "available_until": "2026-10-29T16:39:27.666837Z",
  "open": false,
  "tip": {
    "id": "5662eac1-8335-4f1e-bd70-37d6ba8b2ec9",
    "order_id": "024bb121-fa60-4fb7-abfe-e56a2e504a92",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T16:39:31.2664Z"
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
      "id": "1e676375-5a98-4b98-8552-984bb88ea30c",
      "at": "2026-10-28T16:39:32.791644Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "024bb121-fa60-4fb7-abfe-e56a2e504a92",
      "counterpart_id": null
    },
    {
      "id": "8b758b54-b202-49c7-88fb-541710c32b63",
      "at": "2026-10-28T16:39:27.737746Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "024bb121-fa60-4fb7-abfe-e56a2e504a92",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "abc21243-e90b-4b22-a174-1910094cb3b9",
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
  "last_heartbeat_at": "2026-10-28T16:39:26.95112Z",
  "last_location_at": "2026-10-28T16:39:26.95112Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/abc21243-e90b-4b22-a174-1910094cb3b9/close` → **200**

```json
{
  "command_id": "07c4f2ab-6309-4fd8-8afa-628d59ee56cd",
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

Done: card order 024bb121-fa60-4fb7-abfe-e56a2e504a92.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737963288",
  "device_ref": "sandbox-16534"
}
```

```json
{
  "challenge_id": "c386df3e-ce38-4831-bdb3-10c295be2ffc",
  "expires_at": "2026-10-28T16:44:33.614416414Z",
  "resend_available_at": "2026-10-28T16:39:34.614416414Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380737963288` → **200**

```json
{
  "phone": "+380737963288",
  "audience": "CLIENT",
  "code": "939037",
  "sent_at": "2026-10-28T16:39:33.616977336Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c386df3e-ce38-4831-bdb3-10c295be2ffc",
  "code": "939037",
  "device_ref": "sandbox-16534"
}
```

```json
{
  "session_id": "91390db0-6d69-45d2-9ff0-2723fe91d09f",
  "subject": {
    "type": "CLIENT",
    "id": "cdff54e4-de18-4afd-9930-a74ec9a4c295"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZGZmNTRlNC1kZTE4LTRhZmQtOTkzMC1hNzRlYzlhNGMyOTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NDczLCJpYXQiOjE3OTMyMDU1NzMsImp0aSI6IjRmZTc5YjcwLTEyNGYtNDM3MS05Mzg4LWExZTNhNjA4ZjgzMyIsInNpZCI6IjkxMzkwZGIwLTZkNjktNDVkMi05ZmYwLTI3MjNmZTkxZDA5ZiJ9.3tD58XfJTZTgDoAOw5ffMbAtQMjb2LIUgv_6EalgK4s",
  "access_expires_at": "2026-10-28T16:54:33.863671668Z",
  "refresh_token": "mwQLh2-zrwk765j-v4VZRApwwPHz1gvjOD74LaDlEuQ",
  "refresh_expires_at": "2026-11-27T16:39:33.863129165Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "c12b7bd2-8516-42e6-9988-ea7d895b5a59",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "140b4bea-b80c-47f7-bf90-07792e3acc74",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-140b4bea-b80c-47f7-bf90-07792e3acc74",
    "orderDate": "1793205574",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "10df4c812c857c261dff00b8008d3582",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=140b4bea-b80c-47f7-bf90-07792e3acc74",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737963288"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=140b4bea-b80c-47f7-bf90-07792e3acc74",
  "created_at": "2026-10-28T16:39:34.091131Z",
  "expires_at": "2026-10-28T17:09:34.091131Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/140b4bea-b80c-47f7-bf90-07792e3acc74` → **200**

```json
{
  "id": "140b4bea-b80c-47f7-bf90-07792e3acc74",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T16:39:34.091131Z",
  "expires_at": "2026-10-28T17:09:34.091131Z",
  "completed_at": "2026-10-28T16:39:34.421932Z",
  "masked_pan": "41****8899",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "cdff54e4-de18-4afd-9930-a74ec9a4c295",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "cdff54e4-de18-4afd-9930-a74ec9a4c295",
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
      "id": "a688237a-96e6-4ce6-83d1-7e1f48e00b50",
      "at": "2026-10-28T16:39:34.881508Z",
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
  "client_id": "cdff54e4-de18-4afd-9930-a74ec9a4c295",
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
      "id": "a688237a-96e6-4ce6-83d1-7e1f48e00b50",
      "at": "2026-10-28T16:39:34.881508Z",
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
  "device_ref": "sandbox-2"
}
```

```json
{
  "challenge_id": "85cdd2b2-d8d3-48a6-84f6-8541bbd17848",
  "expires_at": "2026-10-28T16:44:36.314169477Z",
  "resend_available_at": "2026-10-28T16:39:37.314169477Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "905505",
  "sent_at": "2026-10-28T16:39:36.316687101Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "85cdd2b2-d8d3-48a6-84f6-8541bbd17848",
  "code": "905505",
  "device_ref": "sandbox-2"
}
```

```json
{
  "session_id": "1c767cfb-115d-447b-9aaf-981aa7f85a9e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjQ3NiwiaWF0IjoxNzkzMjA1NTc2LCJqdGkiOiI5OWQzMDcyMS1iOTU0LTRmN2QtOGUwMS0xZmM4ZGZiYjNhMmIiLCJzaWQiOiIxYzc2N2NmYi0xMTVkLTQ0N2ItOWFhZi05ODFhYTdmODVhOWUifQ.jWsKwEC2tWygsFnErmWyd8pK2Y5UBifg5Oy1Rb41EfA",
  "access_expires_at": "2026-10-28T16:54:36.55364087Z",
  "refresh_token": "Lcz1fdRrkrx9tBQXhFkosDNzPNUnkN4CQueSLJ--Dig",
  "refresh_expires_at": "2026-11-27T16:39:36.553220598Z",
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
  "command_id": "675a46f9-047f-4276-8647-9d74f7e6c960",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "99dcabc3-bcf3-4eee-9e1f-5e0d50293b0f",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-99dcabc3-bcf3-4eee-9e1f-5e0d50293b0f",
    "orderDate": "1793205576",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "6d3179de53ed7a766ab2bfcde5f86146",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=99dcabc3-bcf3-4eee-9e1f-5e0d50293b0f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=99dcabc3-bcf3-4eee-9e1f-5e0d50293b0f",
  "created_at": "2026-10-28T16:39:36.985535Z",
  "expires_at": "2026-10-28T17:09:36.985535Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/99dcabc3-bcf3-4eee-9e1f-5e0d50293b0f` → **200**

```json
{
  "id": "99dcabc3-bcf3-4eee-9e1f-5e0d50293b0f",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T16:39:36.985535Z",
  "expires_at": "2026-10-28T17:09:36.985535Z",
  "completed_at": "2026-10-28T16:39:37.212461Z",
  "masked_pan": "41****5530",
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
      "id": "0e6466fc-311b-4730-aa41-77263657858c",
      "at": "2026-10-28T16:39:37.928908Z",
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
  "command_id": "35689fef-1b67-4fb6-be85-e0591a7c7a41",
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
  "correlation_id": "ae1430f3-ad50-4bd9-b59e-29ac9d486e60"
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
  "session_id": "e9b8fcf3-413d-48d2-a91e-0f67a51b777e",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY0NzksImlhdCI6MTc5MzIwNTU3OSwianRpIjoiNmQ2Mzc3YTQtMzAwNy00MDQzLThmNTAtNTRjYTRmMGU4NzYxIiwic2lkIjoiZTliOGZjZjMtNDEzZC00OGQyLWE5MWUtMGY2N2E1MWI3NzdlIn0.nYe1MoEahE9rzl0c-q1poep2iNSKFXdg4jkNq-OdI4U",
  "access_expires_at": "2026-10-28T16:54:39.38419818Z",
  "refresh_token": "6iRWEUL8pFwlGQS0XMinxQ0NbJtYrTo6kHWHtPKY4WE",
  "refresh_expires_at": "2026-10-29T04:39:39.383631061Z",
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
  "phone": "+48600318375",
  "device_ref": "sandbox-3316"
}
```

```json
{
  "challenge_id": "b184c771-d398-4d7d-844d-befaab4c1be0",
  "expires_at": "2026-10-28T16:44:40.041817985Z",
  "resend_available_at": "2026-10-28T16:39:41.041817985Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600318375` → **200**

```json
{
  "phone": "+48600318375",
  "audience": "CLIENT",
  "code": "693046",
  "sent_at": "2026-10-28T16:39:40.043799268Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b184c771-d398-4d7d-844d-befaab4c1be0",
  "code": "693046",
  "device_ref": "sandbox-3316"
}
```

```json
{
  "session_id": "fd989e43-5338-4570-b488-97fbd29b9c77",
  "subject": {
    "type": "CLIENT",
    "id": "54865f17-55fe-431c-a347-e99178f36236"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDg2NWYxNy01NWZlLTQzMWMtYTM0Ny1lOTkxNzhmMzYyMzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NDgwLCJpYXQiOjE3OTMyMDU1ODAsImp0aSI6IjIyMjQwMGUyLTEzNmUtNDU1OS1hYTg5LTk0MzAzNmE4MDBkOSIsInNpZCI6ImZkOTg5ZTQzLTUzMzgtNDU3MC1iNDg4LTk3ZmJkMjliOWM3NyJ9._BUwQf-xhzdP1Vpj9kYPfXgwjSLdqVOEygql1oqBs7Q",
  "access_expires_at": "2026-10-28T16:54:40.282838243Z",
  "refresh_token": "13s4HZPJRonMZKq-sEBb6nBsJhBle7iZvFCRZP_BiJI",
  "refresh_expires_at": "2026-11-27T16:39:40.282423519Z",
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
  "command_id": "59e5845c-ed9e-44b2-bc0e-1bf1ce49494f",
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
  "correlation_id": "3a704087-4d67-445c-b3b6-e30669944136",
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
  "command_id": "ebdb3914-1ec9-4704-80d1-3324a3b1bb7b",
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
  "paused_at": "2026-10-28T16:39:41.173662335Z",
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
  "command_id": "51555e1d-2d39-4338-8f83-52278d1d4465",
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
  "id": "9ab0de0a-40ab-41aa-a3f8-4b3418cb0235",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:44:41.630926Z",
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
  "command_id": "6c6565b6-0af7-4bef-89d1-b44c4e601ac9",
  "quote_id": "9ab0de0a-40ab-41aa-a3f8-4b3418cb0235",
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
  "correlation_id": "a3ed2345-3004-4cb4-99fe-96ac516fd649"
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
  "paused_at": "2026-10-28T16:39:41.173662Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "8bdd3189-dc97-4c2a-9f41-c63ab8fdb329",
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
  "command_id": "bfbb0630-c06a-4ace-882a-3d0d4fdf8033",
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
  "command_id": "a213b864-b856-4194-80b8-79d419edfb31",
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
  "id": "365302fc-cb8e-411f-8b6b-2a7ee0c6e11e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:44:43.090619Z",
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
  "command_id": "1b88fbb1-abfc-4f00-9f14-68618fd284ac",
  "quote_id": "365302fc-cb8e-411f-8b6b-2a7ee0c6e11e",
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
  "correlation_id": "a989f2e3-aca0-430d-b584-ee0174f30607"
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
  "command_id": "66f1c238-ca66-4723-8a0c-0a42f07700f0",
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
  "command_id": "728876d4-7d9e-41ac-8294-304200ad6a58",
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
  "id": "32d72697-15c5-448c-a191-6dab9f363d10",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:44:43.992715Z",
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
  "command_id": "cb929761-9578-4566-bb26-992eed6e71b7",
  "quote_id": "32d72697-15c5-448c-a191-6dab9f363d10",
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
  "correlation_id": "b5f7c915-ebe8-4d7a-9ba8-54fb6d82e11c"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "d7279220-707e-47dc-a9c2-6078a2ca941b",
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
  "correlation_id": "b5309adb-285d-45bb-8e9d-8a8bcdd27015"
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
  "command_id": "91208a5b-a582-4aad-a28c-5d0946966fcf",
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
  "phone": "+380679017422",
  "device_ref": "sandbox-11617"
}
```

```json
{
  "challenge_id": "c035938f-0ef7-4caf-a217-bcf801d7d1dc",
  "expires_at": "2026-10-28T16:44:45.110973926Z",
  "resend_available_at": "2026-10-28T16:39:46.110973926Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679017422` → **200**

```json
{
  "phone": "+380679017422",
  "audience": "CLIENT",
  "code": "352761",
  "sent_at": "2026-10-28T16:39:45.113223526Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c035938f-0ef7-4caf-a217-bcf801d7d1dc",
  "code": "352761",
  "device_ref": "sandbox-11617"
}
```

```json
{
  "session_id": "d8cb451c-a341-4b4d-8efc-69e91ccb539a",
  "subject": {
    "type": "CLIENT",
    "id": "fc9ee8e1-32b4-48f1-8c9e-d9e3fe2f9a81"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzllZThlMS0zMmI0LTQ4ZjEtOGM5ZS1kOWUzZmUyZjlhODEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NDg1LCJpYXQiOjE3OTMyMDU1ODUsImp0aSI6ImJjNjQ0NTk3LTcyMDktNDc4OS05OGE4LTJiMzhkZjIyMDBiZCIsInNpZCI6ImQ4Y2I0NTFjLWEzNDEtNGI0ZC04ZWZjLTY5ZTkxY2NiNTM5YSJ9.Vr5H9kAXv9tLaylkB73TD8XoFDe0pqjd7ioRepop8m0",
  "access_expires_at": "2026-10-28T16:54:45.410653619Z",
  "refresh_token": "3z6tddGzRbCGxUesqF0D4AlIhHWVH9a3IQXe_XLyImk",
  "refresh_expires_at": "2026-11-27T16:39:45.410109544Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "fc9ee8e1-32b4-48f1-8c9e-d9e3fe2f9a81",
  "session_id": "d8cb451c-a341-4b4d-8efc-69e91ccb539a",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bfe906ef-8412-4dec-af4d-89974cc11a02",
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
  "id": "7bd1819a-35e8-414b-9d3d-db2d51645872",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:44:45.896516Z",
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
  "challenge_id": "4b73d5c8-1a0f-450e-bd5e-d7283acb387a",
  "expires_at": "2026-10-28T16:44:48.130620656Z",
  "resend_available_at": "2026-10-28T16:39:49.130620656Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679017422` → **200**

```json
{
  "phone": "+380679017422",
  "audience": "CLIENT",
  "code": "241333",
  "sent_at": "2026-10-28T16:39:48.132294604Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "f8895e57-6334-4a20-844b-68238eba0286",
  "challenge_id": "4b73d5c8-1a0f-450e-bd5e-d7283acb387a",
  "otp_code": "241333"
}
```

```json
{
  "client_id": "fc9ee8e1-32b4-48f1-8c9e-d9e3fe2f9a81",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T16:39:48.381533713Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "d48f29ac-6062-481a-b6e8-45027417030b",
  "quote_id": "7bd1819a-35e8-414b-9d3d-db2d51645872",
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
  "correlation_id": "92e146e6-7ce5-4e9c-815c-fda9008aee81"
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
  "session_id": "f5659e30-676c-46c7-ac65-c9bdf8972447",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY0ODksImlhdCI6MTc5MzIwNTU4OSwianRpIjoiZmQ3ZjgwYjktMTAxNi00NzBjLTliYzMtYzk4ZDA5M2IzMWZiIiwic2lkIjoiZjU2NTllMzAtNjc2Yy00NmM3LWFjNjUtYzliZGY4OTcyNDQ3In0.glj6dFtlLeJI-Q5X2E7OyMvtBZ9Cp53gi4zgGW4ejjQ",
  "access_expires_at": "2026-10-28T16:54:49.088501658Z",
  "refresh_token": "KSOcrRkam_XTaZTo_jH-NbCOtfvdUGNM9JvsRLfgDN0",
  "refresh_expires_at": "2026-10-29T04:39:49.088022008Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "fc9ee8e1-32b4-48f1-8c9e-d9e3fe2f9a81",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T16:39:48.381534Z",
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

`POST /api/admin/v1/client-deletions/fc9ee8e1-32b4-48f1-8c9e-d9e3fe2f9a81/complete` → **200**

```json
{
  "command_id": "576de363-ba48-4e81-85c7-36f1e152ccb6",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "fc9ee8e1-32b4-48f1-8c9e-d9e3fe2f9a81",
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
  "correlation_id": "20212f0f-e3e4-4092-8898-ec9e9d6c9ab5"
}
```

Done: client fc9ee8e1-32b4-48f1-8c9e-d9e3fe2f9a81 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665501860",
  "device_ref": "sandbox-14834"
}
```

```json
{
  "challenge_id": "513a07ad-8beb-472d-8e0e-68b2042bc445",
  "expires_at": "2026-10-28T16:44:49.967787218Z",
  "resend_available_at": "2026-10-28T16:39:50.967787218Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665501860` → **200**

```json
{
  "phone": "+380665501860",
  "audience": "CLIENT",
  "code": "976331",
  "sent_at": "2026-10-28T16:39:49.969412645Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "513a07ad-8beb-472d-8e0e-68b2042bc445",
  "code": "976331",
  "device_ref": "sandbox-14834"
}
```

```json
{
  "session_id": "00dcfbe4-0898-41d6-922d-619fa969e728",
  "subject": {
    "type": "CLIENT",
    "id": "8c6b425d-b66b-4737-a58a-5a66026c9524"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YzZiNDI1ZC1iNjZiLTQ3MzctYTU4YS01YTY2MDI2Yzk1MjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NDkwLCJpYXQiOjE3OTMyMDU1OTAsImp0aSI6IjY3MmU2Y2EyLThlN2UtNDFkOC04OThjLTA4NWNkZWJjYzQ4NiIsInNpZCI6IjAwZGNmYmU0LTA4OTgtNDFkNi05MjJkLTYxOWZhOTY5ZTcyOCJ9.-hWxjSHNxMz3rTXS_YvfsZAhFgUFDLwmwXRf1uJoctw",
  "access_expires_at": "2026-10-28T16:54:50.210620083Z",
  "refresh_token": "sb5RNGJnltZ6j1w9AXLGh2CKdtWAn1YLOgRaxDNh6T0",
  "refresh_expires_at": "2026-11-27T16:39:50.210114474Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8c6b425d-b66b-4737-a58a-5a66026c9524",
  "session_id": "00dcfbe4-0898-41d6-922d-619fa969e728",
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
  "session_id": "6fc0780e-960b-4de7-b803-26c556f40a78",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY0OTAsImlhdCI6MTc5MzIwNTU5MCwianRpIjoiNjQ5Y2IyNjMtYzRhNS00Zjc5LWIxNGQtOWI2ZDhhMzJlZjEzIiwic2lkIjoiNmZjMDc4MGUtOTYwYi00ZGU3LWI4MDMtMjZjNTU2ZjQwYTc4In0.ez4OiV6eSPwcJ7oUmtJNhAyiMkkkEo-od2HYEnaS4Us",
  "access_expires_at": "2026-10-28T16:54:50.897357071Z",
  "refresh_token": "U4FL3Ko8jqg_mE7cjuSe0vYBqqetMZPSfXC2hA8KttI",
  "refresh_expires_at": "2026-10-29T04:39:50.896815049Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=5501860&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "8c6b425d-b66b-4737-a58a-5a66026c9524",
      "phone": "+380665501860",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T16:39:50.20825Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/8c6b425d-b66b-4737-a58a-5a66026c9524` → **200**

```json
{
  "client": {
    "id": "8c6b425d-b66b-4737-a58a-5a66026c9524",
    "phone": "+380665501860",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T16:39:50.20825Z",
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

`POST /api/admin/v1/clients/8c6b425d-b66b-4737-a58a-5a66026c9524/block` → **400**

```json
{
  "command_id": "d57101d9-915c-458d-a9a1-ba7925384ddb",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/8c6b425d-b66b-4737-a58a-5a66026c9524/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "f43f942e-cfd8-4e67-bf54-9a4231f0a332",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/8c6b425d-b66b-4737-a58a-5a66026c9524/block` → **200**

```json
{
  "command_id": "dd8534bf-908d-4e7d-8e83-3e0d48cef684",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "8c6b425d-b66b-4737-a58a-5a66026c9524",
  "phone": "+380665501860",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T16:39:50.20825Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T16:39:51.825936Z",
    "by": "6873b609-b860-49e4-8d57-f3e610bae089"
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
  "correlation_id": "358e666a-f4f8-4bb8-a2be-b733298051b6"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665501860",
  "device_ref": "sandbox-492"
}
```

```json
{
  "challenge_id": "b9cebff4-45ef-4ef1-9e3b-0ea39e25d656",
  "expires_at": "2026-10-28T16:44:54.271193605Z",
  "resend_available_at": "2026-10-28T16:39:55.271193605Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665501860` → **200**

```json
{
  "phone": "+380665501860",
  "audience": "CLIENT",
  "code": "666154",
  "sent_at": "2026-10-28T16:39:54.273340408Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "b9cebff4-45ef-4ef1-9e3b-0ea39e25d656",
  "code": "666154",
  "device_ref": "sandbox-492"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "82347560-688d-409c-8798-0a727b93d674"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/8c6b425d-b66b-4737-a58a-5a66026c9524` → **200**

```json
{
  "client": {
    "id": "8c6b425d-b66b-4737-a58a-5a66026c9524",
    "phone": "+380665501860",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T16:39:50.20825Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T16:39:51.825936Z",
      "by": "6873b609-b860-49e4-8d57-f3e610bae089"
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

`POST /api/admin/v1/clients/8c6b425d-b66b-4737-a58a-5a66026c9524/unblock` → **200**

```json
{
  "command_id": "c37eb9a5-54e7-44dc-84bc-717fb72965c7",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "8c6b425d-b66b-4737-a58a-5a66026c9524",
  "phone": "+380665501860",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T16:39:50.20825Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665501860",
  "device_ref": "sandbox-12432"
}
```

```json
{
  "challenge_id": "4f755fd5-01d1-40e3-83c6-fca951856ff8",
  "expires_at": "2026-10-28T16:44:57.205575194Z",
  "resend_available_at": "2026-10-28T16:39:58.205575194Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665501860` → **200**

```json
{
  "phone": "+380665501860",
  "audience": "CLIENT",
  "code": "717799",
  "sent_at": "2026-10-28T16:39:57.207281246Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f755fd5-01d1-40e3-83c6-fca951856ff8",
  "code": "717799",
  "device_ref": "sandbox-12432"
}
```

```json
{
  "session_id": "7b926ecc-0d6b-4ae2-abdb-3ad58c779fca",
  "subject": {
    "type": "CLIENT",
    "id": "8c6b425d-b66b-4737-a58a-5a66026c9524"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YzZiNDI1ZC1iNjZiLTQ3MzctYTU4YS01YTY2MDI2Yzk1MjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NDk3LCJpYXQiOjE3OTMyMDU1OTcsImp0aSI6IjUxNWY1ZTE0LTg3NzAtNDI2My1hYzExLTBhZjFhN2EzNmEyZiIsInNpZCI6IjdiOTI2ZWNjLTBkNmItNGFlMi1hYmRiLTNhZDU4Yzc3OWZjYSJ9.ZNYjAWQSrhJi3xsm5618MEsBMO9K50jiDcXUxe8LzkE",
  "access_expires_at": "2026-10-28T16:54:57.442282867Z",
  "refresh_token": "FFBh7w5dluM4yho952Vc9E0LEUNxgrt9Ja0OL3ntFUk",
  "refresh_expires_at": "2026-11-27T16:39:57.44182596Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8c6b425d-b66b-4737-a58a-5a66026c9524",
  "session_id": "7b926ecc-0d6b-4ae2-abdb-3ad58c779fca",
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
  "phone": "+380663462728",
  "device_ref": "sandbox-31783"
}
```

```json
{
  "challenge_id": "d95bde5f-1b16-47dc-b4b3-e4faad8ac9bf",
  "expires_at": "2026-10-28T16:44:57.886849454Z",
  "resend_available_at": "2026-10-28T16:39:58.886849454Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663462728` → **200**

```json
{
  "phone": "+380663462728",
  "audience": "CLIENT",
  "code": "327141",
  "sent_at": "2026-10-28T16:39:57.888635819Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d95bde5f-1b16-47dc-b4b3-e4faad8ac9bf",
  "code": "327141",
  "device_ref": "sandbox-31783"
}
```

```json
{
  "session_id": "d66d88a0-24c3-431e-ba83-a57fdce1e6bf",
  "subject": {
    "type": "CLIENT",
    "id": "f6f0c18d-35de-4aef-b06d-07ea6b2340cf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNmYwYzE4ZC0zNWRlLTRhZWYtYjA2ZC0wN2VhNmIyMzQwY2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NDk4LCJpYXQiOjE3OTMyMDU1OTgsImp0aSI6IjUzN2Y2MzE5LWFkY2EtNDIzOC04MmM4LWZmZTYwOTEzZjhlYiIsInNpZCI6ImQ2NmQ4OGEwLTI0YzMtNDMxZS1iYTgzLWE1N2ZkY2UxZTZiZiJ9.mF34uotKooqF0JVIUrB16ezN693JOXkyTW4a13jP_O4",
  "access_expires_at": "2026-10-28T16:54:58.130961984Z",
  "refresh_token": "oMyu6zny2OHEHIXY0as8eaG-35rLXoivJALQJLSmvSo",
  "refresh_expires_at": "2026-11-27T16:39:58.130562753Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a1c9c928-a54d-4d49-b4a1-4634c3e077cf",
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
  "id": "f649c1b1-7e93-4d30-a07e-2c8daf1a19b5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:44:58.359455Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: c1c37ad2-bcb0-4cdb-a0ac-1529e7dbb048) → **201**

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
  "session_id": "1804b253-6f5f-46c8-99ff-d4caf45e85ed",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY0OTgsImlhdCI6MTc5MzIwNTU5OCwianRpIjoiZjYzNTEwZDctNmU2Ny00YjIxLWFlYWYtMjNjNWNhMzRlMTcxIiwic2lkIjoiMTgwNGIyNTMtNmY1Zi00NmM4LTk5ZmYtZDRjYWY0NWU4NWVkIn0.niPyH-zl6TjnQbcEUy8w8Zn7flp16Io35DK05BNM8Sw",
  "access_expires_at": "2026-10-28T16:54:58.894042493Z",
  "refresh_token": "27HuzaRk1SLUOM5sX-gX3acagzY231MqggxRLZ-9t_E",
  "refresh_expires_at": "2026-10-29T04:39:58.893531836Z",
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
  "session_id": "776cbb52-f911-45d7-a97f-888acdde9e83",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY0OTksImlhdCI6MTc5MzIwNTU5OSwianRpIjoiNWEyYWQyYTctNTU5Yy00OGVlLWI1ZDMtY2Y5NDFhM2VlNmVkIiwic2lkIjoiNzc2Y2JiNTItZjkxMS00NWQ3LWE5N2YtODg4YWNkZGU5ZTgzIn0.xgsZikvvmo_y0MWUxjafZSioBkC-mWtXDKFyUB-C0Tc",
  "access_expires_at": "2026-10-28T16:54:59.368955494Z",
  "refresh_token": "4fCo91FSrj9q82tNIOnSnhB1Z_fBvkgdvkCpwl9upts",
  "refresh_expires_at": "2026-10-29T04:39:59.368430703Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f37d689c-e0d5-40b2-b99e-9113b9daf59e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:39:58.598595Z",
      "actor": {
        "type": "CLIENT",
        "id": "f6f0c18d-35de-4aef-b06d-07ea6b2340cf",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "f37d689c-e0d5-40b2-b99e-9113b9daf59e",
        "quote_id": "f649c1b1-7e93-4d30-a07e-2c8daf1a19b5",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "c1c37ad2-bcb0-4cdb-a0ac-1529e7dbb048"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:39:58.600442Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f37d689c-e0d5-40b2-b99e-9113b9daf59e",
        "attempt_id": "e78a710e-2857-4a33-9818-5e2bb09ec821",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c1c37ad2-bcb0-4cdb-a0ac-1529e7dbb048"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T16:39:58.611819Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f37d689c-e0d5-40b2-b99e-9113b9daf59e",
        "attempt_id": "e78a710e-2857-4a33-9818-5e2bb09ec821"
      },
      "correlation_id": "c1c37ad2-bcb0-4cdb-a0ac-1529e7dbb048"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "e78a710e-2857-4a33-9818-5e2bb09ec821",
        "generation": 1,
        "started_at": "2026-10-28T16:39:58.599376Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T16:39:58.611819Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T16:39:58.601411Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/c1c37ad2-bcb0-4cdb-a0ac-1529e7dbb048` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "f37d689c-e0d5-40b2-b99e-9113b9daf59e:0",
      "order_id": "f37d689c-e0d5-40b2-b99e-9113b9daf59e",
      "at": "2026-10-28T16:39:58.598595Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "f37d689c-e0d5-40b2-b99e-9113b9daf59e:1",
      "order_id": "f37d689c-e0d5-40b2-b99e-9113b9daf59e",
      "at": "2026-10-28T16:39:58.600442Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "f37d689c-e0d5-40b2-b99e-9113b9daf59e:2",
      "order_id": "f37d689c-e0d5-40b2-b99e-9113b9daf59e",
      "at": "2026-10-28T16:39:58.611819Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/cff5d064-101f-4e4f-b9bc-546d4765c720` → **200**

```json
{
  "found": []
}
```

Done: request c1c37ad2-bcb0-4cdb-a0ac-1529e7dbb048 — order f37d689c-e0d5-40b2-b99e-9113b9daf59e found by its id.

`GET /api/rider/v1/orders/f37d689c-e0d5-40b2-b99e-9113b9daf59e` → **200**

```json
{
  "id": "f37d689c-e0d5-40b2-b99e-9113b9daf59e",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f6f0c18d-35de-4aef-b06d-07ea6b2340cf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:39:58.597865Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/f37d689c-e0d5-40b2-b99e-9113b9daf59e/cancel` → **200**

```json
{
  "command_id": "940d01e3-5e64-4ae4-a044-a5c6632c8b38",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f37d689c-e0d5-40b2-b99e-9113b9daf59e",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f6f0c18d-35de-4aef-b06d-07ea6b2340cf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:39:58.597865Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
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
  "phone": "+380636177323",
  "device_ref": "sandbox-12673"
}
```

```json
{
  "challenge_id": "0d304ac3-abe1-4bf7-a1db-63d7b4cd4b1e",
  "expires_at": "2026-10-28T16:45:00.705784996Z",
  "resend_available_at": "2026-10-28T16:40:01.705784996Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636177323` → **200**

```json
{
  "phone": "+380636177323",
  "audience": "CLIENT",
  "code": "603819",
  "sent_at": "2026-10-28T16:40:00.707797301Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0d304ac3-abe1-4bf7-a1db-63d7b4cd4b1e",
  "code": "603819",
  "device_ref": "sandbox-12673"
}
```

```json
{
  "session_id": "c98ab2bc-f9e1-4ecd-968f-9a278a8d4bc1",
  "subject": {
    "type": "CLIENT",
    "id": "b16cbdcd-d8f4-403b-b3c8-48dc097d3cd2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTZjYmRjZC1kOGY0LTQwM2ItYjNjOC00OGRjMDk3ZDNjZDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NTAwLCJpYXQiOjE3OTMyMDU2MDAsImp0aSI6IjE1NDI1NjY4LTExZGEtNGRkOS04ZTJiLTE2ZWJkZDkzYTk0OSIsInNpZCI6ImM5OGFiMmJjLWY5ZTEtNGVjZC05NjhmLTlhMjc4YThkNGJjMSJ9.tgOcxampyOPw_kgcYHLwlbv3-rzguJoOi6APKBLNodg",
  "access_expires_at": "2026-10-28T16:55:00.94614765Z",
  "refresh_token": "6CU0O2E76E11rLIJEd-o2xbpaJC5rnZucMIilSF9Bb8",
  "refresh_expires_at": "2026-11-27T16:40:00.945718434Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "29dfa678-8658-42df-b751-fd942386d116",
  "expires_at": "2026-10-28T16:45:03.16087159Z",
  "resend_available_at": "2026-10-28T16:40:04.16087159Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636177323` → **200**

```json
{
  "phone": "+380636177323",
  "audience": "CLIENT",
  "code": "471257",
  "sent_at": "2026-10-28T16:40:03.162553956Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "f19360ad-63c3-461d-9668-6958aef349f0",
  "challenge_id": "29dfa678-8658-42df-b751-fd942386d116",
  "otp_code": "471257"
}
```

```json
{
  "id": "195c603f-85f5-4f3b-b69c-220fa7f6b086",
  "state": "PENDING",
  "created_at": "2026-10-28T16:40:03.41063Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/195c603f-85f5-4f3b-b69c-220fa7f6b086` → **200**

```json
{
  "id": "195c603f-85f5-4f3b-b69c-220fa7f6b086",
  "state": "PENDING",
  "created_at": "2026-10-28T16:40:03.41063Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/195c603f-85f5-4f3b-b69c-220fa7f6b086` → **200**

```json
{
  "id": "195c603f-85f5-4f3b-b69c-220fa7f6b086",
  "state": "PENDING",
  "created_at": "2026-10-28T16:40:03.41063Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/195c603f-85f5-4f3b-b69c-220fa7f6b086` → **200**

```json
{
  "id": "195c603f-85f5-4f3b-b69c-220fa7f6b086",
  "state": "PENDING",
  "created_at": "2026-10-28T16:40:03.41063Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/195c603f-85f5-4f3b-b69c-220fa7f6b086` → **200**

```json
{
  "id": "195c603f-85f5-4f3b-b69c-220fa7f6b086",
  "state": "PENDING",
  "created_at": "2026-10-28T16:40:03.41063Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/195c603f-85f5-4f3b-b69c-220fa7f6b086` → **200**

```json
{
  "id": "195c603f-85f5-4f3b-b69c-220fa7f6b086",
  "state": "PENDING",
  "created_at": "2026-10-28T16:40:03.41063Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/195c603f-85f5-4f3b-b69c-220fa7f6b086` → **200**

```json
{
  "id": "195c603f-85f5-4f3b-b69c-220fa7f6b086",
  "state": "PENDING",
  "created_at": "2026-10-28T16:40:03.41063Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/195c603f-85f5-4f3b-b69c-220fa7f6b086` → **200**

```json
{
  "id": "195c603f-85f5-4f3b-b69c-220fa7f6b086",
  "state": "PENDING",
  "created_at": "2026-10-28T16:40:03.41063Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/195c603f-85f5-4f3b-b69c-220fa7f6b086` → **200**

```json
{
  "id": "195c603f-85f5-4f3b-b69c-220fa7f6b086",
  "state": "READY",
  "created_at": "2026-10-28T16:40:03.41063Z",
  "ready_at": "2026-10-28T16:40:11.153395Z",
  "expires_at": "2026-11-04T16:40:11.153395Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/195c603f-85f5-4f3b-b69c-220fa7f6b086/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634360732",
  "device_ref": "sandbox-23009"
}
```

```json
{
  "challenge_id": "d471d740-1f4f-4a3b-9f09-61bcb4b4214c",
  "expires_at": "2026-10-28T16:45:12.391504543Z",
  "resend_available_at": "2026-10-28T16:40:13.391504543Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634360732` → **200**

```json
{
  "phone": "+380634360732",
  "audience": "CLIENT",
  "code": "959927",
  "sent_at": "2026-10-28T16:40:12.393499477Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d471d740-1f4f-4a3b-9f09-61bcb4b4214c",
  "code": "959927",
  "device_ref": "sandbox-23009"
}
```

```json
{
  "session_id": "62bb2374-cd3d-420c-a053-2e61109e15c9",
  "subject": {
    "type": "CLIENT",
    "id": "653a7db0-18c2-4d90-bddf-5c0e3b680777"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTNhN2RiMC0xOGMyLTRkOTAtYmRkZi01YzBlM2I2ODA3NzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NTEyLCJpYXQiOjE3OTMyMDU2MTIsImp0aSI6ImU2Yjk1OWYwLWY2Y2MtNDNiZS05NGUxLTYwMjg4NWU3OTQ0MCIsInNpZCI6IjYyYmIyMzc0LWNkM2QtNDIwYy1hMDUzLTJlNjExMDllMTVjOSJ9.F-BRhnuu9zCjzpRpGEnPm2Y3C7eBddWrPV0rWjbHeeI",
  "access_expires_at": "2026-10-28T16:55:12.628014986Z",
  "refresh_token": "-dP_xFsXe1LTGnqRYvDQ0GbRyRVQsB3UVJohAmU13kg",
  "refresh_expires_at": "2026-11-27T16:40:12.62759863Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/195c603f-85f5-4f3b-b69c-220fa7f6b086/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/195c603f-85f5-4f3b-b69c-220fa7f6b086/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2870e32f-5d47-4d6e-8e50-4ea4d6440fbb"
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
  "session_id": "290f51e4-e287-4f8e-b97c-33a7f038176f",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY1MTMsImlhdCI6MTc5MzIwNTYxMywianRpIjoiZTJmNGI2ZjctNjExZC00ZWM4LTlhN2QtY2RkZjI5MGQyNWU0Iiwic2lkIjoiMjkwZjUxZTQtZTI4Ny00ZjhlLWI5N2MtMzNhN2YwMzgxNzZmIn0.k5_GDiufXXg-Qi46QQj2rUCu6jT0x4VutrcP_Xj3SvE",
  "access_expires_at": "2026-10-28T16:55:13.416302706Z",
  "refresh_token": "LfFZiS85ZhlYPhHNLdzCZ2vtmB1C8WKRWBG5LQtwc9U",
  "refresh_expires_at": "2026-10-29T04:40:13.415895002Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b16cbdcd-d8f4-403b-b3c8-48dc097d3cd2",
  "session_id": "c98ab2bc-f9e1-4ecd-968f-9a278a8d4bc1",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/b16cbdcd-d8f4-403b-b3c8-48dc097d3cd2/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "195c603f-85f5-4f3b-b69c-220fa7f6b086",
      "state": "READY",
      "created_at": "2026-10-28T16:40:03.41063Z",
      "ready_at": "2026-10-28T16:40:11.153395Z",
      "expires_at": "2026-11-04T16:40:11.153395Z",
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
  "device_ref": "sandbox-3843"
}
```

```json
{
  "challenge_id": "a1f409d4-1f0c-45bf-8e3d-47b2891fcdde",
  "expires_at": "2026-10-28T16:45:14.121214679Z",
  "resend_available_at": "2026-10-28T16:40:15.121214679Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "095472",
  "sent_at": "2026-10-28T16:40:14.123082924Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a1f409d4-1f0c-45bf-8e3d-47b2891fcdde",
  "code": "095472",
  "device_ref": "sandbox-3843"
}
```

```json
{
  "session_id": "67658fd6-db54-4e54-bb56-60744def96a9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjUxNCwiaWF0IjoxNzkzMjA1NjE0LCJqdGkiOiJhZTVmN2MzMy04ZGQzLTQ5MDQtYjBhYi1mMjJiZDNkZTlmZmYiLCJzaWQiOiI2NzY1OGZkNi1kYjU0LTRlNTQtYmI1Ni02MDc0NGRlZjk2YTkifQ.XQ8H9ybaFAf-fU5qrxCL95ubgytH3SY28hfek-burs0",
  "access_expires_at": "2026-10-28T16:55:14.367392854Z",
  "refresh_token": "mz2eXXShhpe-sgrX18pFfP3B821r6pPTo4221Jof6ec",
  "refresh_expires_at": "2026-11-27T16:40:14.366894837Z",
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
  "device_ref": "sandbox-30714"
}
```

```json
{
  "challenge_id": "f5559692-fa2e-4e3c-b01a-0814eb166a74",
  "expires_at": "2026-10-28T16:45:14.783833558Z",
  "resend_available_at": "2026-10-28T16:40:15.783833558Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "216643",
  "sent_at": "2026-10-28T16:40:14.785613543Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f5559692-fa2e-4e3c-b01a-0814eb166a74",
  "code": "216643",
  "device_ref": "sandbox-30714"
}
```

```json
{
  "session_id": "4e3a7928-f884-4760-983c-685b3c97f8b1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjUxNSwiaWF0IjoxNzkzMjA1NjE1LCJqdGkiOiJhMDJlNDFlMy1lMWYxLTQ4NWYtOTkxOC0zZGNmNzMzNmM1ZWUiLCJzaWQiOiI0ZTNhNzkyOC1mODg0LTQ3NjAtOTgzYy02ODViM2M5N2Y4YjEifQ.kRzwegWa28BVimNXEb0HxvP1_pjn1V0D9BEJtDm7jjw",
  "access_expires_at": "2026-10-28T16:55:15.024712638Z",
  "refresh_token": "45XlwpJ-9dJz0fi3HvFxkmdfFej9FV1F42stcU6X1Hk",
  "refresh_expires_at": "2026-11-27T16:40:15.024264781Z",
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
  "command_id": "81960eaf-3c48-4ed6-87e8-115cb036f061",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:40:15Z",
    "sequence": 1793205615452
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f45350c1-d388-4e07-8884-8f06f1b93f46",
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
  "last_heartbeat_at": "2026-10-28T16:40:15.469212Z",
  "last_location_at": "2026-10-28T16:40:15.469212Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-22042"
}
```

```json
{
  "challenge_id": "7fa8d8f5-cfbf-45d7-9718-ef3722df9e19",
  "expires_at": "2026-10-28T16:45:15.684477373Z",
  "resend_available_at": "2026-10-28T16:40:16.684477373Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "755766",
  "sent_at": "2026-10-28T16:40:15.68648851Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7fa8d8f5-cfbf-45d7-9718-ef3722df9e19",
  "code": "755766",
  "device_ref": "sandbox-22042"
}
```

```json
{
  "session_id": "a8ed8ada-7201-4028-b393-a2cf675a465b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjUxNSwiaWF0IjoxNzkzMjA1NjE1LCJqdGkiOiJhMjYyZmVhMC02NTU5LTRiMDItYjc0Zi1lNmIwZDM3NTJmMDgiLCJzaWQiOiJhOGVkOGFkYS03MjAxLTQwMjgtYjM5My1hMmNmNjc1YTQ2NWIifQ.zxiPaG0nzZJf7ojaHl3K9LdneoimnzptC2dlxBVINdU",
  "access_expires_at": "2026-10-28T16:55:15.924402335Z",
  "refresh_token": "AoUVJ467AUKD5gb_Un9oUzvPSV-6mBOeV1pOWllIv2A",
  "refresh_expires_at": "2026-11-27T16:40:15.923956986Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "91a3a1fb-9b60-40f4-8744-a44b8ce60c4f",
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
  "last_heartbeat_at": "2026-10-28T16:39:17.8549Z",
  "last_location_at": "2026-10-28T16:39:17.8549Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/91a3a1fb-9b60-40f4-8744-a44b8ce60c4f/handover` → **200**

```json
{
  "command_id": "69b8741c-e57f-468d-ba87-7d81fb6c4e2c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "91a3a1fb-9b60-40f4-8744-a44b8ce60c4f",
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
  "last_heartbeat_at": "2026-10-28T16:39:17.8549Z",
  "last_location_at": "2026-10-28T16:39:17.8549Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/91a3a1fb-9b60-40f4-8744-a44b8ce60c4f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:40:16Z",
    "sequence": 1793205616579
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "91a3a1fb-9b60-40f4-8744-a44b8ce60c4f",
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
  "last_heartbeat_at": "2026-10-28T16:40:16.59681Z",
  "last_location_at": "2026-10-28T16:40:16.59681Z",
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
  "session_id": "22b8ce88-acb9-40d7-8c62-397775322e42",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY1MTcsImlhdCI6MTc5MzIwNTYxNywianRpIjoiNWIxNmUzZjItMjA1Yy00NzMxLTk5NjAtYWM4Mzk0ZTBhZjc0Iiwic2lkIjoiMjJiOGNlODgtYWNiOS00MGQ3LThjNjItMzk3Nzc1MzIyZTQyIn0.o5oPFw6G03gdNbMcbnca9Jn0rVZA3K5EYGB7Y0VbDpE",
  "access_expires_at": "2026-10-28T16:55:17.071348769Z",
  "refresh_token": "PQyHkijkp8aKc1EvMSZhByxQdDMl82EUenTG4qLLv1k",
  "refresh_expires_at": "2026-10-29T04:40:17.070796191Z",
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
  "session_id": "54a839ea-7ca2-4d71-b4ae-646a4a221d06",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY1MTcsImlhdCI6MTc5MzIwNTYxNywianRpIjoiYTg0YzJkNzktNjM2NS00NjkzLTkxYmQtYzQxMjVjZDc2YmVkIiwic2lkIjoiNTRhODM5ZWEtN2NhMi00ZDcxLWI0YWUtNjQ2YTRhMjIxZDA2In0.UFcZC1vtqTzAvpUCnvcV8Dy60b1ezlBVwkEA_ZdRNWA",
  "access_expires_at": "2026-10-28T16:55:17.53964576Z",
  "refresh_token": "jp6ro_WQ-1y1nunaJ-ERSx5HiLvB9wc2XZkunDcEAV4",
  "refresh_expires_at": "2026-10-29T04:40:17.539223986Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380688738791",
  "device_ref": "sandbox-11902"
}
```

```json
{
  "challenge_id": "731012ec-f0ab-41d8-9659-c6da9da4a2f9",
  "expires_at": "2026-10-28T16:45:17.75781854Z",
  "resend_available_at": "2026-10-28T16:40:18.75781854Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380688738791` → **200**

```json
{
  "phone": "+380688738791",
  "audience": "CLIENT",
  "code": "364790",
  "sent_at": "2026-10-28T16:40:17.759701157Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "731012ec-f0ab-41d8-9659-c6da9da4a2f9",
  "code": "364790",
  "device_ref": "sandbox-11902"
}
```

```json
{
  "session_id": "fa878377-3897-4eb8-adab-445cdd61e0d3",
  "subject": {
    "type": "CLIENT",
    "id": "dfdf1e29-0ce0-4b50-b7b3-a2579b20cc80"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZmRmMWUyOS0wY2UwLTRiNTAtYjdiMy1hMjU3OWIyMGNjODAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NTE3LCJpYXQiOjE3OTMyMDU2MTcsImp0aSI6ImQ3NjRlYmVhLWM3ODUtNGJiOC1iNWFlLTlhNjE2OTJhZTY3YSIsInNpZCI6ImZhODc4Mzc3LTM4OTctNGViOC1hZGFiLTQ0NWNkZDYxZTBkMyJ9.YWD1_ObTFSL5yCDYSYBxyXnzKoXY7DUKkXNbmxJnnoQ",
  "access_expires_at": "2026-10-28T16:55:17.995059308Z",
  "refresh_token": "ST0CEOdj_gvrAgTMOc3eerkAWVt19FMm_-FS3LWO_ik",
  "refresh_expires_at": "2026-11-27T16:40:17.994667258Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "aba2654b-afe4-491a-903f-fd28e1311a52",
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
  "id": "9e18f58d-3a9b-4457-9c90-79df2dd663b5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:45:18.219193Z",
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
  "command_id": "8d5e6124-b1c2-4b5c-8dce-b0a723b0f980",
  "quote_id": "9e18f58d-3a9b-4457-9c90-79df2dd663b5",
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
  "id": "4e3b5404-a202-4189-9436-2d4c21bdb7c6",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dfdf1e29-0ce0-4b50-b7b3-a2579b20cc80",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:40:18.452977Z",
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
    "id": "2ce7f815-8bed-45f5-9a10-d82351d20b3b",
    "order_id": "4e3b5404-a202-4189-9436-2d4c21bdb7c6",
    "expires_at": "2026-10-28T16:40:33.455913Z",
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

`POST /api/driver/v1/offers/2ce7f815-8bed-45f5-9a10-d82351d20b3b/reject` → **204**

```json
{
  "command_id": "f2a2e240-9895-4111-bbe9-e825af8019f0"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "e1e48657-9b95-4fe8-9ab4-ee1b16335e7c",
    "order_id": "4e3b5404-a202-4189-9436-2d4c21bdb7c6",
    "expires_at": "2026-10-28T16:40:33.910269Z",
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

`POST /api/driver/v1/offers/e1e48657-9b95-4fe8-9ab4-ee1b16335e7c/accept` → **200**

```json
{
  "command_id": "f63cdb8a-8041-4e3e-8a8b-e64b9d7d710c"
}
```

```json
{
  "id": "985e1072-f6f1-4c39-b738-65d116f560aa",
  "order_id": "4e3b5404-a202-4189-9436-2d4c21bdb7c6",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6f1aca0d-565c-4f7c-90a9-63afafb079af",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/4e3b5404-a202-4189-9436-2d4c21bdb7c6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:40:18.453457Z",
      "actor": {
        "type": "CLIENT",
        "id": "dfdf1e29-0ce0-4b50-b7b3-a2579b20cc80",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4e3b5404-a202-4189-9436-2d4c21bdb7c6",
        "quote_id": "9e18f58d-3a9b-4457-9c90-79df2dd663b5",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "416be1a1-b60d-4e09-964a-283da80039de"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:40:18.455124Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4e3b5404-a202-4189-9436-2d4c21bdb7c6",
        "attempt_id": "ece4c5b7-e41f-4a82-bcaf-0f78b3056b75",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "416be1a1-b60d-4e09-964a-283da80039de"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T16:40:18.460587Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2ce7f815-8bed-45f5-9a10-d82351d20b3b",
        "order_id": "4e3b5404-a202-4189-9436-2d4c21bdb7c6",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "416be1a1-b60d-4e09-964a-283da80039de"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T16:40:18.909475Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2ce7f815-8bed-45f5-9a10-d82351d20b3b",
        "order_id": "4e3b5404-a202-4189-9436-2d4c21bdb7c6"
      },
      "correlation_id": "d0301adb-b990-4951-8f95-4ffd578db4c9"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 4e3b5404-a202-4189-9436-2d4c21bdb7c6 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/4e3b5404-a202-4189-9436-2d4c21bdb7c6` → **200**

```json
{
  "id": "4e3b5404-a202-4189-9436-2d4c21bdb7c6",
  "short_number": 6,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "dfdf1e29-0ce0-4b50-b7b3-a2579b20cc80",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "985e1072-f6f1-4c39-b738-65d116f560aa",
    "order_id": "4e3b5404-a202-4189-9436-2d4c21bdb7c6",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "6f1aca0d-565c-4f7c-90a9-63afafb079af",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T16:40:18.452977Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4e3b5404-a202-4189-9436-2d4c21bdb7c6/cancel` → **200**

```json
{
  "command_id": "71fec7f1-6dae-45a5-ba22-7e7908fa81f7",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "4e3b5404-a202-4189-9436-2d4c21bdb7c6",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "dfdf1e29-0ce0-4b50-b7b3-a2579b20cc80",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "985e1072-f6f1-4c39-b738-65d116f560aa",
    "order_id": "4e3b5404-a202-4189-9436-2d4c21bdb7c6",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "6f1aca0d-565c-4f7c-90a9-63afafb079af",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T16:40:18.452977Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
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
  "session_id": "f45350c1-d388-4e07-8884-8f06f1b93f46",
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
  "last_heartbeat_at": "2026-10-28T16:40:15.469212Z",
  "last_location_at": "2026-10-28T16:40:15.469212Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f45350c1-d388-4e07-8884-8f06f1b93f46/close` → **200**

```json
{
  "command_id": "db50040f-2a16-4e72-bf62-8206f39ddea5",
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
  "session_id": "91a3a1fb-9b60-40f4-8744-a44b8ce60c4f",
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
  "last_heartbeat_at": "2026-10-28T16:40:16.59681Z",
  "last_location_at": "2026-10-28T16:40:16.59681Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/91a3a1fb-9b60-40f4-8744-a44b8ce60c4f/close` → **200**

```json
{
  "command_id": "0ea6b9e0-3ff0-47f9-8695-d6757b2d5d96",
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
  "device_ref": "sandbox-28762"
}
```

```json
{
  "challenge_id": "b1a553b7-44ad-4071-96b4-50f9a4e79113",
  "expires_at": "2026-10-28T16:45:21.198446484Z",
  "resend_available_at": "2026-10-28T16:40:22.198446484Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "629786",
  "sent_at": "2026-10-28T16:40:21.200248412Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b1a553b7-44ad-4071-96b4-50f9a4e79113",
  "code": "629786",
  "device_ref": "sandbox-28762"
}
```

```json
{
  "session_id": "18703897-0a83-40a1-9def-6867a256e0cb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjUyMSwiaWF0IjoxNzkzMjA1NjIxLCJqdGkiOiIxNDZmZWM3NC0xZGNhLTRlNjUtYWVlNy1kNmFhZjcxNjhmNGQiLCJzaWQiOiIxODcwMzg5Ny0wYTgzLTQwYTEtOWRlZi02ODY3YTI1NmUwY2IifQ.bIwYR9viDavUO3Y-9QXCLRhTKBjrSaPhdu2nF6d-z5Q",
  "access_expires_at": "2026-10-28T16:55:21.436324691Z",
  "refresh_token": "OYphVd48ImbtWH1xb7oOrTfY4V3B7TCmpD-puwJY0ZM",
  "refresh_expires_at": "2026-11-27T16:40:21.435873523Z",
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
  "command_id": "4ee87b14-5771-492f-b94b-7302c140714b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:40:21Z",
    "sequence": 1793205621863
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd8f2d15-bb86-4373-baef-29fba586a396",
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
  "last_heartbeat_at": "2026-10-28T16:40:21.880289Z",
  "last_location_at": "2026-10-28T16:40:21.880289Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674782910",
  "device_ref": "sandbox-12031"
}
```

```json
{
  "challenge_id": "b0bc5758-194d-4923-86d8-8b1fe91ada99",
  "expires_at": "2026-10-28T16:45:22.091732571Z",
  "resend_available_at": "2026-10-28T16:40:23.091732571Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674782910` → **200**

```json
{
  "phone": "+380674782910",
  "audience": "CLIENT",
  "code": "218177",
  "sent_at": "2026-10-28T16:40:22.093503903Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b0bc5758-194d-4923-86d8-8b1fe91ada99",
  "code": "218177",
  "device_ref": "sandbox-12031"
}
```

```json
{
  "session_id": "ab5a5d53-1032-4e60-a4ae-9c2ff454fc25",
  "subject": {
    "type": "CLIENT",
    "id": "17240ab6-1726-4c98-9722-1cc29c231701"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNzI0MGFiNi0xNzI2LTRjOTgtOTcyMi0xY2MyOWMyMzE3MDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NTIyLCJpYXQiOjE3OTMyMDU2MjIsImp0aSI6IjEzODgyYTdkLTczY2YtNDdjYS1iOGNlLTI0N2RmMjVhOGYzNyIsInNpZCI6ImFiNWE1ZDUzLTEwMzItNGU2MC1hNGFlLTljMmZmNDU0ZmMyNSJ9.exLfVGOc5Ltj1h2ymrtzS6_zquhoAiAS-gR6hvn3FX0",
  "access_expires_at": "2026-10-28T16:55:22.321537271Z",
  "refresh_token": "EOcwhH_Zs9Ide4XWX7TWbF-5oTQLhR-xjd_T4ijOViE",
  "refresh_expires_at": "2026-11-27T16:40:22.321121726Z",
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
  "command_id": "1d4caed6-5f1f-4fd1-9bce-a18712bda766",
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
  "id": "60999e35-dec3-43e6-8889-51fad3d1c752",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:45:22.750083Z",
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
  "command_id": "20c6c165-5484-4c84-9641-1edee65825a5",
  "platform": "ANDROID",
  "token": "sandbox-driver-abc4db1f-03f4-42b0-8bea-ae790864ea71"
}
```

```json
{
  "id": "1ef6f444-f848-4825-8ad5-6d4717f31967",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T16:40:22.979878Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "9ac42c76-2275-432b-b1c2-c4f7dc2bf3f8",
  "platform": "ANDROID",
  "token": "sandbox-rider-b35edb5e-c3d9-465a-a41a-f241daaf8f6d"
}
```

```json
{
  "id": "86d2d502-1626-49e2-bdb7-f332c6bfab9a",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T16:40:23.200279Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "79807e43-4d0b-46cb-9981-6c94486ccdca",
  "quote_id": "60999e35-dec3-43e6-8889-51fad3d1c752",
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
  "id": "1a068a37-4d9c-4f48-ac59-e188904344b2",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17240ab6-1726-4c98-9722-1cc29c231701",
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
  "created_at": "2026-10-28T16:40:23.434455Z",
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
    "id": "51785b50-8c55-4681-86f6-ee999d57489c",
    "order_id": "1a068a37-4d9c-4f48-ac59-e188904344b2",
    "expires_at": "2026-10-28T16:40:38.436953Z",
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

`POST /api/driver/v1/offers/51785b50-8c55-4681-86f6-ee999d57489c/accept` → **200**

```json
{
  "command_id": "a692f4ee-ab54-47ca-b569-f0096ad76bec"
}
```

```json
{
  "id": "265f4e0d-7571-4dd2-857f-05c6e00ce3ab",
  "order_id": "1a068a37-4d9c-4f48-ac59-e188904344b2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b33ed2a6-e69c-4caf-96cf-8c11140514ea",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T16:40:23.413Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T16:40:23.413Z` → **200**

```json
[
  {
    "at": "2026-10-28T16:40:24.350045088Z",
    "token_suffix": "64ea71",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "event_type": "OfferMade",
      "event_id": "ab6cc759-4bba-4228-98ba-d8fb922e406b",
      "order_version": "2",
      "order_id": "1a068a37-4d9c-4f48-ac59-e188904344b2"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380674782910&after=2026-10-28T16:40:23.413Z` → **200**

```json
[
  {
    "at": "2026-10-28T16:40:24.351900615Z",
    "token_suffix": "af8f6d",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted",
      "event_id": "20e3bd00-63ca-421b-ad4d-c6383850e541",
      "order_version": "3",
      "order_id": "1a068a37-4d9c-4f48-ac59-e188904344b2"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/1a068a37-4d9c-4f48-ac59-e188904344b2/messages` → **201**

```json
{
  "command_id": "8e9c6855-9ef5-41cc-872a-d0f7f55a81ab",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "57dfcf29-017d-4e5f-a05a-0077271a37a2",
  "order_id": "1a068a37-4d9c-4f48-ac59-e188904344b2",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T16:40:25.288613987Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b33ed2a6-e69c-4caf-96cf-8c11140514ea",
  "order_id": "1a068a37-4d9c-4f48-ac59-e188904344b2",
  "assignment_id": "265f4e0d-7571-4dd2-857f-05c6e00ce3ab",
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

`POST /api/driver/v1/trips/b33ed2a6-e69c-4caf-96cf-8c11140514ea/messages` → **201**

```json
{
  "command_id": "e97e507e-2f33-45dd-b00f-e1866309f6e0",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "8c521535-efb4-4ee6-8572-fb739fe920bc",
  "order_id": "1a068a37-4d9c-4f48-ac59-e188904344b2",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T16:40:25.785527848Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/1a068a37-4d9c-4f48-ac59-e188904344b2/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/b33ed2a6-e69c-4caf-96cf-8c11140514ea/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674782910"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/cd8f2d15-bb86-4373-baef-29fba586a396/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:40:26Z",
    "sequence": 1793205626402
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd8f2d15-bb86-4373-baef-29fba586a396",
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
  "last_heartbeat_at": "2026-10-28T16:40:26.419527Z",
  "last_location_at": "2026-10-28T16:40:26.419527Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b33ed2a6-e69c-4caf-96cf-8c11140514ea",
  "order_id": "1a068a37-4d9c-4f48-ac59-e188904344b2",
  "assignment_id": "265f4e0d-7571-4dd2-857f-05c6e00ce3ab",
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

`POST /api/driver/v1/trips/b33ed2a6-e69c-4caf-96cf-8c11140514ea/arrive` → **200**

```json
{
  "command_id": "7f39cd20-cc51-401a-8a08-84dffae2615f",
  "expected_version": 0
}
```

```json
{
  "id": "b33ed2a6-e69c-4caf-96cf-8c11140514ea",
  "order_id": "1a068a37-4d9c-4f48-ac59-e188904344b2",
  "assignment_id": "265f4e0d-7571-4dd2-857f-05c6e00ce3ab",
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
  "arrived_at": "2026-10-28T16:40:26.834554Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b33ed2a6-e69c-4caf-96cf-8c11140514ea/start` → **200**

```json
{
  "command_id": "d5be797f-de0d-4492-b692-6ea3fa32907a",
  "expected_version": 1
}
```

```json
{
  "id": "b33ed2a6-e69c-4caf-96cf-8c11140514ea",
  "order_id": "1a068a37-4d9c-4f48-ac59-e188904344b2",
  "assignment_id": "265f4e0d-7571-4dd2-857f-05c6e00ce3ab",
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
  "arrived_at": "2026-10-28T16:40:26.834554Z",
  "started_at": "2026-10-28T16:40:27.051754Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/cd8f2d15-bb86-4373-baef-29fba586a396/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:40:27Z",
    "sequence": 1793205627265
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd8f2d15-bb86-4373-baef-29fba586a396",
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
  "last_heartbeat_at": "2026-10-28T16:40:27.283148Z",
  "last_location_at": "2026-10-28T16:40:27.283148Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/b33ed2a6-e69c-4caf-96cf-8c11140514ea/complete` → **200**

```json
{
  "command_id": "bc0d3c54-2bdb-4c46-b693-6006f768a19d",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:40:27Z",
  "cash_received": true
}
```

```json
{
  "id": "b33ed2a6-e69c-4caf-96cf-8c11140514ea",
  "order_id": "1a068a37-4d9c-4f48-ac59-e188904344b2",
  "assignment_id": "265f4e0d-7571-4dd2-857f-05c6e00ce3ab",
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
  "arrived_at": "2026-10-28T16:40:26.834554Z",
  "started_at": "2026-10-28T16:40:27.051754Z",
  "completed_at": "2026-10-28T16:40:27.510884Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/1a068a37-4d9c-4f48-ac59-e188904344b2` → **200**

```json
{
  "id": "1a068a37-4d9c-4f48-ac59-e188904344b2",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "17240ab6-1726-4c98-9722-1cc29c231701",
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
    "id": "265f4e0d-7571-4dd2-857f-05c6e00ce3ab",
    "order_id": "1a068a37-4d9c-4f48-ac59-e188904344b2",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b33ed2a6-e69c-4caf-96cf-8c11140514ea",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:40:23.434455Z",
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
    "id": "1a068a37-4d9c-4f48-ac59-e188904344b2",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-28T16:40:23.434455Z",
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
    "id": "b33ed2a6-e69c-4caf-96cf-8c11140514ea",
    "order_id": "1a068a37-4d9c-4f48-ac59-e188904344b2",
    "order_short_number": 7,
    "created_at": "2026-10-28T16:40:23.889172Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "e7a3e025-2231-4b5c-8c8b-f490b50b78e2",
    "order_id": "1d05c0e0-cf3f-43dc-8132-5aee50ea6a93",
    "order_short_number": 1,
    "created_at": "2026-10-28T16:38:59.084016Z",
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

`GET /api/rider/v1/orders/1a068a37-4d9c-4f48-ac59-e188904344b2/tip` → **200**

```json
{
  "order_id": "1a068a37-4d9c-4f48-ac59-e188904344b2",
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
  "available_until": "2026-10-29T16:40:27.510884Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/1a068a37-4d9c-4f48-ac59-e188904344b2/tip` → **201**

```json
{
  "command_id": "ebf8923d-0be3-41ef-b5fe-eb53c5a188e2",
  "amount_minor": 1100
}
```

```json
{
  "id": "0cafc58b-f5a6-4540-bd0a-ad055e2132bc",
  "order_id": "1a068a37-4d9c-4f48-ac59-e188904344b2",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T16:40:32.049075Z"
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
  "session_id": "a45d6e45-64ae-4a9f-b716-ea22e1ef8ded",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY1MzIsImlhdCI6MTc5MzIwNTYzMiwianRpIjoiNGMwZDNhN2QtMTU4Zi00YzI3LTg2MmEtNzMwYzg0NTY1N2YyIiwic2lkIjoiYTQ1ZDZlNDUtNjRhZS00YTlmLWI3MTYtZWEyMmUxZWY4ZGVkIn0.HndpyUMcqmjgs6rBuw-bv5Z7rtOafwwvSrSD-8PfoF8",
  "access_expires_at": "2026-10-28T16:55:32.535912839Z",
  "refresh_token": "JYUE-aFzeVA6e7kaCMDl5uEUcAS5cFkEECLXzTWfZc4",
  "refresh_expires_at": "2026-10-29T04:40:32.535483569Z",
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
          "RIDER": 2,
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
      "DRIVER": 1,
      "RIDER": 2,
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
  "generated_at": "2026-10-28T16:40:32.753208206Z"
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
  "generated_at": "2026-10-28T16:40:32.977632497Z"
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
  "session_id": "0dc06c9d-9312-4c1c-b6ae-1ff9e53bf719",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY1MzMsImlhdCI6MTc5MzIwNTYzMywianRpIjoiYWIyZDgxNTYtMWIyZC00YTcwLTg3NjQtZGQxMzlmYzJhODFiIiwic2lkIjoiMGRjMDZjOWQtOTMxMi00YzFjLWI2YWUtMWZmOWU1M2JmNzE5In0.lyTleHXaz7D52pIhdYTg2W6pUMNOoRxuxx7UP_0M0MU",
  "access_expires_at": "2026-10-28T16:55:33.460691457Z",
  "refresh_token": "50heAIyOcgLZ-5E68ALumNirtCEa_cgknQCLWEO0DHM",
  "refresh_expires_at": "2026-10-29T04:40:33.460211106Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/1a068a37-4d9c-4f48-ac59-e188904344b2/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:40:23.43484Z",
      "actor": {
        "type": "CLIENT",
        "id": "17240ab6-1726-4c98-9722-1cc29c231701",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "1a068a37-4d9c-4f48-ac59-e188904344b2",
        "quote_id": "60999e35-dec3-43e6-8889-51fad3d1c752",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "db434501-303e-47ee-b001-6a465d45cf98"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:40:23.436346Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1a068a37-4d9c-4f48-ac59-e188904344b2",
        "attempt_id": "8d60b78f-86dd-488b-b4e1-595b694847f6",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "db434501-303e-47ee-b001-6a465d45cf98"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T16:40:23.441354Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "51785b50-8c55-4681-86f6-ee999d57489c",
        "order_id": "1a068a37-4d9c-4f48-ac59-e188904344b2",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "db434501-303e-47ee-b001-6a465d45cf98"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T16:40:23.890719Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "51785b50-8c55-4681-86f6-ee999d57489c",
        "order_id": "1a068a37-4d9c-4f48-ac59-e188904344b2",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "265f4e0d-7571-4dd2-857f-05c6e00ce3ab"
      },
      "correlation_id": "020f617e-21c1-464c-9c0d-e08a5fdc9922"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T16:40:33.8988441Z",
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
      "last_location_at": "2026-10-28T16:40:27.283148Z",
      "order_id": null
    }
  ]
}
```

Done: order 1a068a37-4d9c-4f48-ac59-e188904344b2.

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
  "session_id": "78d73666-9373-4d2d-85f8-9bd3adb612d7",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY1MzQsImlhdCI6MTc5MzIwNTYzNCwianRpIjoiZWNjYzI3YTUtN2VlNC00YzY1LWIyYzktNTMyNGIxYjJhYTIyIiwic2lkIjoiNzhkNzM2NjYtOTM3My00ZDJkLTg1ZjgtOWJkM2FkYjYxMmQ3In0.4gnqD0kLex2Hm_B94zIgxcSsRkd0RCk8zlHLdVuLhFw",
  "access_expires_at": "2026-10-28T16:55:34.415685945Z",
  "refresh_token": "Q3LcCV2AZsW4d3WIVzOa3CTH4oFtD_4q8qV5H2E2o3U",
  "refresh_expires_at": "2026-10-29T04:40:34.4152708Z",
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
  "command_id": "ec3c51ca-a647-4d49-b578-f56e2066ead2",
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
  "timestamp": "2026-10-28T16:40:35.000+0000",
  "channel": {
    "id": "1730052000.125814882",
    "linkedid": "1730052000.125814882",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671441384"
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
  "timestamp": "2026-10-28T16:40:35.000+0000",
  "channel": {
    "id": "1730052000.125814882",
    "linkedid": "1730052000.125814882",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671441384"
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
  "session_id": "d3494e22-2fbc-49ef-9133-41bc3aaf12c9",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY1MzUsImlhdCI6MTc5MzIwNTYzNSwianRpIjoiNWFjMjExOGQtNGNlOC00YjA5LWE5MjItOGJhYjUyZjc4YWMyIiwic2lkIjoiZDM0OTRlMjItMmZiYy00OWVmLTkxMzMtNDFiYzNhYWYxMmM5In0.byZKFQWPx2JCS9WGzK_IYkzyt9o2-tjB_ODkzBehBpY",
  "access_expires_at": "2026-10-28T16:55:35.364298851Z",
  "refresh_token": "5bs0S6Yyfk45rPHdIANLEIGBPQ53ueTWUF9_e9JxAW4",
  "refresh_expires_at": "2026-10-29T04:40:35.363795335Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "baf3993a-396d-44d9-8364-448024c8c448",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380671441384",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T16:40:35Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/baf3993a-396d-44d9-8364-448024c8c448/answer` → **200**

```json
{
  "command_id": "f06bba19-5563-4e12-843e-62495e5f3d5f"
}
```

```json
{
  "id": "baf3993a-396d-44d9-8364-448024c8c448",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380671441384",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6873b609-b860-49e4-8d57-f3e610bae089",
  "order_ids": [],
  "started_at": "2026-10-28T16:40:35Z",
  "answered_at": "2026-10-28T16:40:35.816072Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.125814882",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "8f82b71f-c4e4-477a-a79c-e57c282db255",
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
  "id": "8a8a98a4-9fed-4f1e-82a7-ec09e80a29f1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:45:36.064020Z",
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
  "command_id": "f710f0a3-b3d4-49a0-9feb-7b7884f3d729",
  "quote_id": "8a8a98a4-9fed-4f1e-82a7-ec09e80a29f1",
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
    "phone": "+380671441384"
  },
  "call_id": "baf3993a-396d-44d9-8364-448024c8c448"
}
```

```json
{
  "id": "2d6a0b28-a33b-4cd1-8fc8-05d3b80f258a",
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
  "created_at": "2026-10-28T16:40:36.298178Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671441384"
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
    "id": "1730052000.125814882",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "baf3993a-396d-44d9-8364-448024c8c448",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671441384",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6873b609-b860-49e4-8d57-f3e610bae089",
      "order_ids": [
        "2d6a0b28-a33b-4cd1-8fc8-05d3b80f258a"
      ],
      "started_at": "2026-10-28T16:40:35Z",
      "answered_at": "2026-10-28T16:40:35.816072Z",
      "ended_at": "2026-10-28T16:40:36.535904Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "9fd5740b-e71c-497d-970a-d12add6d5747",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676102727",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6873b609-b860-49e4-8d57-f3e610bae089",
      "order_ids": [],
      "started_at": "2026-10-28T16:39:06.131996Z",
      "answered_at": "2026-10-28T16:39:06.390421Z",
      "ended_at": "2026-10-28T16:39:06.648898Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T16:39:11.141089Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/2d6a0b28-a33b-4cd1-8fc8-05d3b80f258a` → **200**

```json
{
  "id": "2d6a0b28-a33b-4cd1-8fc8-05d3b80f258a",
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
  "created_at": "2026-10-28T16:40:36.298178Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671441384"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/2d6a0b28-a33b-4cd1-8fc8-05d3b80f258a` → **200**

```json
{
  "id": "2d6a0b28-a33b-4cd1-8fc8-05d3b80f258a",
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
  "created_at": "2026-10-28T16:40:36.298178Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671441384"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/2d6a0b28-a33b-4cd1-8fc8-05d3b80f258a/cancel` → **200**

```json
{
  "command_id": "e00cb2da-b500-42d8-bbb2-93a40a0b2d7a",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "2d6a0b28-a33b-4cd1-8fc8-05d3b80f258a",
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
  "created_at": "2026-10-28T16:40:36.298178Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671441384"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call baf3993a-396d-44d9-8364-448024c8c448 with order 2d6a0b28-a33b-4cd1-8fc8-05d3b80f258a.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-22249"
}
```

```json
{
  "challenge_id": "cbef79f4-2c81-46b5-aa71-448413a471b6",
  "expires_at": "2026-10-28T16:45:37.472898616Z",
  "resend_available_at": "2026-10-28T16:40:38.472898616Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "842611",
  "sent_at": "2026-10-28T16:40:37.475173433Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cbef79f4-2c81-46b5-aa71-448413a471b6",
  "code": "842611",
  "device_ref": "sandbox-22249"
}
```

```json
{
  "session_id": "28984f6a-bf24-4cfc-bf55-64e748994be7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjUzNywiaWF0IjoxNzkzMjA1NjM3LCJqdGkiOiI5NWEzYjRlZi0wNjQ0LTQ4YjEtYWM5YS1hZjM2MzhlYmZiMDYiLCJzaWQiOiIyODk4NGY2YS1iZjI0LTRjZmMtYmY1NS02NGU3NDg5OTRiZTcifQ.DJ_NA4a1SJOTqjzQYYZgnJugSoQXVORXKwjty2uoRY0",
  "access_expires_at": "2026-10-28T16:55:37.709408618Z",
  "refresh_token": "CFcrdO1YBHgdmW8aCSMKF01YnqS4CpEalIGEhwG-N5Y",
  "refresh_expires_at": "2026-11-27T16:40:37.708867447Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd8f2d15-bb86-4373-baef-29fba586a396",
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
  "last_heartbeat_at": "2026-10-28T16:40:27.283148Z",
  "last_location_at": "2026-10-28T16:40:27.283148Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cd8f2d15-bb86-4373-baef-29fba586a396/handover` → **200**

```json
{
  "command_id": "fe845a06-64de-4ed1-b586-2d4ce575a248",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd8f2d15-bb86-4373-baef-29fba586a396",
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
  "last_heartbeat_at": "2026-10-28T16:40:27.283148Z",
  "last_location_at": "2026-10-28T16:40:27.283148Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cd8f2d15-bb86-4373-baef-29fba586a396/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:40:38Z",
    "sequence": 1793205638362
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd8f2d15-bb86-4373-baef-29fba586a396",
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
  "last_heartbeat_at": "2026-10-28T16:40:38.37917Z",
  "last_location_at": "2026-10-28T16:40:38.37917Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668036282",
  "device_ref": "sandbox-4233"
}
```

```json
{
  "challenge_id": "67430161-e9e9-4fe0-bdcb-01400437a9db",
  "expires_at": "2026-10-28T16:45:38.587357819Z",
  "resend_available_at": "2026-10-28T16:40:39.587357819Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668036282` → **200**

```json
{
  "phone": "+380668036282",
  "audience": "CLIENT",
  "code": "458137",
  "sent_at": "2026-10-28T16:40:38.589127579Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "67430161-e9e9-4fe0-bdcb-01400437a9db",
  "code": "458137",
  "device_ref": "sandbox-4233"
}
```

```json
{
  "session_id": "3e4322b6-44ba-4974-9bfd-83c9689d0c27",
  "subject": {
    "type": "CLIENT",
    "id": "fc741c81-ed88-4afa-84a2-a5b0fb4c8342"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzc0MWM4MS1lZDg4LTRhZmEtODRhMi1hNWIwZmI0YzgzNDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NTM4LCJpYXQiOjE3OTMyMDU2MzgsImp0aSI6IjAxNmIyNWI3LTU0NTAtNDc4ZS05ZGMxLTE2NjM1MzE4YWI5YSIsInNpZCI6IjNlNDMyMmI2LTQ0YmEtNDk3NC05YmZkLTgzYzk2ODlkMGMyNyJ9.SDs_FB8aP70hRPT0j7D_dO945iuPpS1wekmnXKKEPZw",
  "access_expires_at": "2026-10-28T16:55:38.827781351Z",
  "refresh_token": "ma_f8ULataA7VLoYXc-E2f1G7bWc6vq_bIPMyb_JYcM",
  "refresh_expires_at": "2026-11-27T16:40:38.827379005Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b48a0eb9-b9ef-42c0-b59a-3d3bad67d68e",
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
  "id": "18f15c00-c01c-4b46-8283-33cc8b47bb69",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:45:39.049492Z",
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
  "command_id": "c2b90d0b-8c27-43e8-9a06-97cd40b24333",
  "quote_id": "18f15c00-c01c-4b46-8283-33cc8b47bb69",
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
  "id": "e886d5d2-5273-44bf-a484-1180e19c2bf9",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fc741c81-ed88-4afa-84a2-a5b0fb4c8342",
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
  "created_at": "2026-10-28T16:40:39.269354Z",
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
    "id": "f401ffc0-9c87-4694-90bf-d6ed52147e73",
    "order_id": "e886d5d2-5273-44bf-a484-1180e19c2bf9",
    "expires_at": "2026-10-28T16:40:54.271844Z",
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

`POST /api/driver/v1/offers/f401ffc0-9c87-4694-90bf-d6ed52147e73/accept` → **200**

```json
{
  "command_id": "cc686524-057d-4b2c-ad82-68c26110fc98"
}
```

```json
{
  "id": "5e96dd33-6b53-453f-adb4-b9393b08bb6e",
  "order_id": "e886d5d2-5273-44bf-a484-1180e19c2bf9",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d852fa2d-e589-4418-ac5e-c4b655daa620",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d852fa2d-e589-4418-ac5e-c4b655daa620",
  "order_id": "e886d5d2-5273-44bf-a484-1180e19c2bf9",
  "assignment_id": "5e96dd33-6b53-453f-adb4-b9393b08bb6e",
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

`POST /api/driver/v1/work-sessions/cd8f2d15-bb86-4373-baef-29fba586a396/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:40:40Z",
    "sequence": 1793205640128
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd8f2d15-bb86-4373-baef-29fba586a396",
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
  "last_heartbeat_at": "2026-10-28T16:40:40.144768Z",
  "last_location_at": "2026-10-28T16:40:40.144768Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d852fa2d-e589-4418-ac5e-c4b655daa620/arrive` → **200**

```json
{
  "command_id": "d420cd2c-fe17-4829-a1e0-91c099ce4507",
  "expected_version": 0
}
```

```json
{
  "id": "d852fa2d-e589-4418-ac5e-c4b655daa620",
  "order_id": "e886d5d2-5273-44bf-a484-1180e19c2bf9",
  "assignment_id": "5e96dd33-6b53-453f-adb4-b9393b08bb6e",
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
  "arrived_at": "2026-10-28T16:40:40.367064Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d852fa2d-e589-4418-ac5e-c4b655daa620/start` → **200**

```json
{
  "command_id": "c11a7f1d-2831-4b7d-9683-89f8369693ec",
  "expected_version": 1
}
```

```json
{
  "id": "d852fa2d-e589-4418-ac5e-c4b655daa620",
  "order_id": "e886d5d2-5273-44bf-a484-1180e19c2bf9",
  "assignment_id": "5e96dd33-6b53-453f-adb4-b9393b08bb6e",
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
  "arrived_at": "2026-10-28T16:40:40.367064Z",
  "started_at": "2026-10-28T16:40:40.599018Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/cd8f2d15-bb86-4373-baef-29fba586a396/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:40:40Z",
    "sequence": 1793205640816
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd8f2d15-bb86-4373-baef-29fba586a396",
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
  "last_heartbeat_at": "2026-10-28T16:40:40.833604Z",
  "last_location_at": "2026-10-28T16:40:40.833604Z",
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
  "device_ref": "sandbox-2044"
}
```

```json
{
  "challenge_id": "3ef4b082-faf4-4435-be08-a782318dace4",
  "expires_at": "2026-10-28T16:45:41.047353718Z",
  "resend_available_at": "2026-10-28T16:40:42.047353718Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "667086",
  "sent_at": "2026-10-28T16:40:41.049026676Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3ef4b082-faf4-4435-be08-a782318dace4",
  "code": "667086",
  "device_ref": "sandbox-2044"
}
```

```json
{
  "session_id": "d09a3fb3-7b02-4187-9da1-a1d0b5a20215",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjU0MSwiaWF0IjoxNzkzMjA1NjQxLCJqdGkiOiJhNjhlMTliYy1lYzkzLTQ1ODctYjVhZC0zZTZiMzE0NDgzNDQiLCJzaWQiOiJkMDlhM2ZiMy03YjAyLTQxODctOWRhMS1hMWQwYjVhMjAyMTUifQ.yAgvEOd2gui1d42bGRmntSFgA9398O4mmyYPgG_HWj0",
  "access_expires_at": "2026-10-28T16:55:41.295487175Z",
  "refresh_token": "zwcFbXgDyj4c5q1WsCmzK0JYZZ6UbFX_iB7SWYzkyNA",
  "refresh_expires_at": "2026-11-27T16:40:41.295020363Z",
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
  "command_id": "bf44bf2f-1651-45d6-8945-421afa13f849",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:40:41Z",
    "sequence": 1793205641719
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f87bc92d-84f8-4fd9-a965-fe83eff05f55",
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
  "last_heartbeat_at": "2026-10-28T16:40:41.735912Z",
  "last_location_at": "2026-10-28T16:40:41.735912Z",
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
  "session_id": "6f38fb9d-6640-473d-a888-2c507cdad93a",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY1NDIsImlhdCI6MTc5MzIwNTY0MiwianRpIjoiMGY1OGUxYTctYjVlYS00NTJiLWFiMWUtYjdkMjY5ZmY2ZjM2Iiwic2lkIjoiNmYzOGZiOWQtNjY0MC00NzNkLWE4ODgtMmM1MDdjZGFkOTNhIn0.3b5Mze_NVf0EgetMzQxQg26yd5h6-ap2Yh4wqD9H2pE",
  "access_expires_at": "2026-10-28T16:55:42.213939696Z",
  "refresh_token": "AGdModXLq3HtWTHdpaqm1ZBRR3hwxqQS7dp7LqAM4h8",
  "refresh_expires_at": "2026-10-29T04:40:42.213553984Z",
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
  "session_id": "4f38650f-100c-4d4f-912c-cbdbf9661544",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY1NDIsImlhdCI6MTc5MzIwNTY0MiwianRpIjoiMDY2NjlkYzktYjE5Ny00MDJkLTkwNmUtNzRmYmQ4ZTgwMjU4Iiwic2lkIjoiNGYzODY1MGYtMTAwYy00ZDRmLTkxMmMtY2JkYmY5NjYxNTQ0In0.C20G8dABd5o8bjNjkwTz7SjG3377VMITmWPeYvV8wOQ",
  "access_expires_at": "2026-10-28T16:55:42.684381391Z",
  "refresh_token": "caZ4esgcU1fploJ6Brnj41s_3o8J_RGhrYBZ-URXqxs",
  "refresh_expires_at": "2026-10-29T04:40:42.683951464Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e886d5d2-5273-44bf-a484-1180e19c2bf9` → **200**

```json
{
  "id": "e886d5d2-5273-44bf-a484-1180e19c2bf9",
  "short_number": 9,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "fc741c81-ed88-4afa-84a2-a5b0fb4c8342",
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
    "id": "5e96dd33-6b53-453f-adb4-b9393b08bb6e",
    "order_id": "e886d5d2-5273-44bf-a484-1180e19c2bf9",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "d852fa2d-e589-4418-ac5e-c4b655daa620",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T16:40:39.269354Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e886d5d2-5273-44bf-a484-1180e19c2bf9/interrupt` → **200**

```json
{
  "command_id": "b6f25d9c-3b6c-485f-afd7-231db123438a",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "e886d5d2-5273-44bf-a484-1180e19c2bf9",
    "short_number": 9,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "fc741c81-ed88-4afa-84a2-a5b0fb4c8342",
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
      "id": "5e96dd33-6b53-453f-adb4-b9393b08bb6e",
      "order_id": "e886d5d2-5273-44bf-a484-1180e19c2bf9",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "d852fa2d-e589-4418-ac5e-c4b655daa620",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T16:40:39.269354Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "361cc0f3-d7eb-40df-9f92-8daf341d802d",
    "short_number": 10,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "fc741c81-ed88-4afa-84a2-a5b0fb4c8342",
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
    "id": "2d97909c-3a92-4da1-9d38-8bef10fffc0d",
    "order_id": "361cc0f3-d7eb-40df-9f92-8daf341d802d",
    "expires_at": "2026-10-28T16:40:58.144346Z",
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

`POST /api/driver/v1/offers/2d97909c-3a92-4da1-9d38-8bef10fffc0d/accept` → **200**

```json
{
  "command_id": "4f1b6f28-dd70-4dbe-9a71-ecf9e5aa5b3c"
}
```

```json
{
  "id": "1db4c2b5-b9a5-4477-a2c4-85f35b5e7e2c",
  "order_id": "361cc0f3-d7eb-40df-9f92-8daf341d802d",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c21565df-7560-4f51-9d46-c23c4171898f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c21565df-7560-4f51-9d46-c23c4171898f",
  "order_id": "361cc0f3-d7eb-40df-9f92-8daf341d802d",
  "assignment_id": "1db4c2b5-b9a5-4477-a2c4-85f35b5e7e2c",
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
  "session_id": "f87bc92d-84f8-4fd9-a965-fe83eff05f55",
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
  "last_heartbeat_at": "2026-10-28T16:40:41.735912Z",
  "last_location_at": "2026-10-28T16:40:41.735912Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/f87bc92d-84f8-4fd9-a965-fe83eff05f55/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:40:44Z",
    "sequence": 1793205644258
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f87bc92d-84f8-4fd9-a965-fe83eff05f55",
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
  "last_heartbeat_at": "2026-10-28T16:40:44.275461Z",
  "last_location_at": "2026-10-28T16:40:44.275461Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c21565df-7560-4f51-9d46-c23c4171898f/arrive` → **200**

```json
{
  "command_id": "563f22f7-180f-481c-afeb-12d04f8d0489",
  "expected_version": 0
}
```

```json
{
  "id": "c21565df-7560-4f51-9d46-c23c4171898f",
  "order_id": "361cc0f3-d7eb-40df-9f92-8daf341d802d",
  "assignment_id": "1db4c2b5-b9a5-4477-a2c4-85f35b5e7e2c",
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
  "arrived_at": "2026-10-28T16:40:44.500416Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c21565df-7560-4f51-9d46-c23c4171898f/start` → **200**

```json
{
  "command_id": "dc435276-7cf6-4a08-9a5e-9afe64899a49",
  "expected_version": 1
}
```

```json
{
  "id": "c21565df-7560-4f51-9d46-c23c4171898f",
  "order_id": "361cc0f3-d7eb-40df-9f92-8daf341d802d",
  "assignment_id": "1db4c2b5-b9a5-4477-a2c4-85f35b5e7e2c",
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
  "arrived_at": "2026-10-28T16:40:44.500416Z",
  "started_at": "2026-10-28T16:40:44.787528Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c21565df-7560-4f51-9d46-c23c4171898f/complete` → **200**

```json
{
  "command_id": "bfcb8300-8280-40a3-912e-69bd1a24a4bd",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:40:45Z"
}
```

```json
{
  "id": "c21565df-7560-4f51-9d46-c23c4171898f",
  "order_id": "361cc0f3-d7eb-40df-9f92-8daf341d802d",
  "assignment_id": "1db4c2b5-b9a5-4477-a2c4-85f35b5e7e2c",
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
  "arrived_at": "2026-10-28T16:40:44.500416Z",
  "started_at": "2026-10-28T16:40:44.787528Z",
  "completed_at": "2026-10-28T16:40:45.019321Z",
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
    "id": "361cc0f3-d7eb-40df-9f92-8daf341d802d",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T16:40:43.136824Z",
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
    "id": "e886d5d2-5273-44bf-a484-1180e19c2bf9",
    "short_number": 9,
    "status": "CANCELLED",
    "created_at": "2026-10-28T16:40:39.269354Z",
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
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
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

`GET /api/operator/v1/orders/e886d5d2-5273-44bf-a484-1180e19c2bf9/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:40:39.269757Z",
      "actor": {
        "type": "CLIENT",
        "id": "fc741c81-ed88-4afa-84a2-a5b0fb4c8342",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e886d5d2-5273-44bf-a484-1180e19c2bf9",
        "quote_id": "18f15c00-c01c-4b46-8283-33cc8b47bb69",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "190831e2-4a4a-4b4d-a0ec-56ade51fa3f3"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:40:39.27121Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e886d5d2-5273-44bf-a484-1180e19c2bf9",
        "attempt_id": "2cfa11ba-f6d5-4cfe-b624-379eb9dd3778",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "190831e2-4a4a-4b4d-a0ec-56ade51fa3f3"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T16:40:39.274122Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f401ffc0-9c87-4694-90bf-d6ed52147e73",
        "order_id": "e886d5d2-5273-44bf-a484-1180e19c2bf9",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "190831e2-4a4a-4b4d-a0ec-56ade51fa3f3"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T16:40:39.71104Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "f401ffc0-9c87-4694-90bf-d6ed52147e73",
        "order_id": "e886d5d2-5273-44bf-a484-1180e19c2bf9",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "5e96dd33-6b53-453f-adb4-b9393b08bb6e"
      },
      "correlation_id": "787c54ea-4571-44ab-820d-bf71d071d393"
```

Done: interrupted e886d5d2-5273-44bf-a484-1180e19c2bf9, follow-up 361cc0f3-d7eb-40df-9f92-8daf341d802d.

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
  "session_id": "cc86566a-4e49-4d29-b1ce-7efc60fb9cc6",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY1NDksImlhdCI6MTc5MzIwNTY0OSwianRpIjoiZjZlOWE1MzgtZGI3My00ZWI3LWJiOTktZTkxMmQxOTIwN2Y4Iiwic2lkIjoiY2M4NjU2NmEtNGU0OS00ZDI5LWIxY2UtN2VmYzYwZmI5Y2M2In0.j0ClW2Qc9yoWbPlgWjzsYnO5lZCMjqTjUD1GCaRtSkE",
  "access_expires_at": "2026-10-28T16:55:49.178514414Z",
  "refresh_token": "FOQHuECH88z1HIUTxMyU4RrEhfEMUxfNiD-z2XJFY4E",
  "refresh_expires_at": "2026-10-29T04:40:49.178077457Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "38e14500-c6e4-4a8a-8d81-649982af9fd6",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:40:49Z"
}
```

```json
{
  "id": "58da8725-ef35-4a97-8e2f-0c9e2713ef0c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:40:49Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/58da8725-ef35-4a97-8e2f-0c9e2713ef0c/publish` → **200**

```json
{
  "command_id": "7396a505-d60a-41b8-9ba8-83a46f5a643b",
  "expected_version": 0
}
```

```json
{
  "id": "58da8725-ef35-4a97-8e2f-0c9e2713ef0c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:40:49.63884Z",
  "published_at": "2026-10-28T16:40:49.63884Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "58da8725-ef35-4a97-8e2f-0c9e2713ef0c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T16:40:49.63884Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632919943",
  "device_ref": "sandbox-31633"
}
```

```json
{
  "challenge_id": "fd7580fe-cc05-4f9e-84e3-56ac7ac7a415",
  "expires_at": "2026-10-28T16:45:50.067587719Z",
  "resend_available_at": "2026-10-28T16:40:51.067587719Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632919943` → **200**

```json
{
  "phone": "+380632919943",
  "audience": "CLIENT",
  "code": "576555",
  "sent_at": "2026-10-28T16:40:50.070455179Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fd7580fe-cc05-4f9e-84e3-56ac7ac7a415",
  "code": "576555",
  "device_ref": "sandbox-31633"
}
```

```json
{
  "session_id": "d7a25792-f469-4742-a0df-ea0700ed6da1",
  "subject": {
    "type": "CLIENT",
    "id": "00d4e750-ea45-43e1-a510-1674b56427e3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMGQ0ZTc1MC1lYTQ1LTQzZTEtYTUxMC0xNjc0YjU2NDI3ZTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NTUwLCJpYXQiOjE3OTMyMDU2NTAsImp0aSI6IjA4ZmVjNzYwLTI2NDAtNDlhZC1hMTJhLTAzMzY4Y2ZkN2I3NiIsInNpZCI6ImQ3YTI1NzkyLWY0NjktNDc0Mi1hMGRmLWVhMDcwMGVkNmRhMSJ9.RaB74HcKvQK-3eI-rANf27SmOoyOc9xYeAZsxp7lUGI",
  "access_expires_at": "2026-10-28T16:55:50.304551766Z",
  "refresh_token": "ZgfaC2vCjKhRGAaaVmv_Ts-xfmM3voarfa0Ln-uqY-c",
  "refresh_expires_at": "2026-11-27T16:40:50.304149675Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "58da8725-ef35-4a97-8e2f-0c9e2713ef0c",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T16:40:49.63884Z",
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
  "command_id": "002c3919-7557-46bb-9491-18dabddb6700",
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
  "id": "9b4fb429-6728-4bf9-80a9-cf3d182c2bbd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:45:50.731612Z",
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
  "command_id": "37895cff-4fe4-42b5-a17d-09db58539f69",
  "quote_id": "9b4fb429-6728-4bf9-80a9-cf3d182c2bbd",
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
  "correlation_id": "b45785e2-d032-47b1-acc5-2b2141e7da62"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "a5d94602-a1ba-4e24-aadb-269e747b3cfc",
  "version_id": "58da8725-ef35-4a97-8e2f-0c9e2713ef0c",
  "language": "uk"
}
```

```json
{
  "version_id": "58da8725-ef35-4a97-8e2f-0c9e2713ef0c",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T16:40:51.182239Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fa4e053c-3044-4628-82ba-c56cfdbb1fc3",
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
  "id": "3869500e-369e-4c21-b99c-16a62b033a7c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:45:51.398424Z",
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
  "command_id": "7094fd52-b634-43db-8f34-e7e498f93355",
  "quote_id": "3869500e-369e-4c21-b99c-16a62b033a7c",
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
  "id": "119d41ae-8b70-4f72-b77b-d0e86c358dc5",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "00d4e750-ea45-43e1-a510-1674b56427e3",
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
  "created_at": "2026-10-28T16:40:51.624352Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/119d41ae-8b70-4f72-b77b-d0e86c358dc5` → **200**

```json
{
  "id": "119d41ae-8b70-4f72-b77b-d0e86c358dc5",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "00d4e750-ea45-43e1-a510-1674b56427e3",
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
  "created_at": "2026-10-28T16:40:51.624352Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/119d41ae-8b70-4f72-b77b-d0e86c358dc5/cancel` → **200**

```json
{
  "command_id": "12b1adf1-ce65-4a57-900b-51e433afaac9",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "119d41ae-8b70-4f72-b77b-d0e86c358dc5",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "00d4e750-ea45-43e1-a510-1674b56427e3",
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
  "created_at": "2026-10-28T16:40:51.624352Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
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

`POST /api/admin/v1/legal-documents/58da8725-ef35-4a97-8e2f-0c9e2713ef0c` → **409**

```json
{
  "command_id": "c9be603e-d047-4bd0-9642-c4738300314e",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:40:52Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/58da8725-ef35-4a97-8e2f-0c9e2713ef0c",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "89153b3b-96b3-44c9-aea2-11bd46b782c3"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "7b0eb689-7037-4d98-9e4c-466049dfb6b4",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T16:40:52Z"
}
```

```json
{
  "id": "6aa195a8-ff6e-48d6-88f6-cda4df0eeaae",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T16:40:52Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/6aa195a8-ff6e-48d6-88f6-cda4df0eeaae/publish` → **200**

```json
{
  "command_id": "b8f5224a-e56a-4553-97a8-45fab6b4c02d",
  "expected_version": 0
}
```

```json
{
  "id": "6aa195a8-ff6e-48d6-88f6-cda4df0eeaae",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T16:40:52.756328Z",
  "published_at": "2026-10-28T16:40:52.756328Z",
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
  "device_ref": "sandbox-8188"
}
```

```json
{
  "challenge_id": "88266bf4-c63b-4610-bd98-a72b08c0ee96",
  "expires_at": "2026-10-28T16:45:52.98145853Z",
  "resend_available_at": "2026-10-28T16:40:53.98145853Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "490998",
  "sent_at": "2026-10-28T16:40:52.983206147Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88266bf4-c63b-4610-bd98-a72b08c0ee96",
  "code": "490998",
  "device_ref": "sandbox-8188"
}
```

```json
{
  "session_id": "c190ae3f-68f7-4d2e-8c14-f254a3a7bbab",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjU1MywiaWF0IjoxNzkzMjA1NjUzLCJqdGkiOiIxOGU5OWRjYy0zNDY3LTQ1YzgtOWZiYi1mM2M2NjFhMzNmODMiLCJzaWQiOiJjMTkwYWUzZi02OGY3LTRkMmUtOGMxNC1mMjU0YTNhN2JiYWIifQ.W59SPe-5A0IWBDgbFFctcG92qGkCXppMD6_jeaxDIwc",
  "access_expires_at": "2026-10-28T16:55:53.219632332Z",
  "refresh_token": "SrKQs7aRvmX1s-c5LBVyEZXBRec1Tq84noZD_UYv73g",
  "refresh_expires_at": "2026-11-27T16:40:53.219254012Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f87bc92d-84f8-4fd9-a965-fe83eff05f55",
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
  "last_heartbeat_at": "2026-10-28T16:40:44.275461Z",
  "last_location_at": "2026-10-28T16:40:44.275461Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f87bc92d-84f8-4fd9-a965-fe83eff05f55/handover` → **200**

```json
{
  "command_id": "fe3d84cd-b807-4bea-8110-f32e479d6cd2",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f87bc92d-84f8-4fd9-a965-fe83eff05f55",
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
  "last_heartbeat_at": "2026-10-28T16:40:44.275461Z",
  "last_location_at": "2026-10-28T16:40:44.275461Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f87bc92d-84f8-4fd9-a965-fe83eff05f55/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:40:53Z",
    "sequence": 1793205653861
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f87bc92d-84f8-4fd9-a965-fe83eff05f55",
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
  "last_heartbeat_at": "2026-10-28T16:40:53.878743Z",
  "last_location_at": "2026-10-28T16:40:53.878743Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679938179",
  "device_ref": "sandbox-12424"
}
```

```json
{
  "challenge_id": "bb10c965-b777-4838-a340-d2816a384769",
  "expires_at": "2026-10-28T16:45:54.09537435Z",
  "resend_available_at": "2026-10-28T16:40:55.09537435Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679938179` → **200**

```json
{
  "phone": "+380679938179",
  "audience": "CLIENT",
  "code": "884265",
  "sent_at": "2026-10-28T16:40:54.097171777Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bb10c965-b777-4838-a340-d2816a384769",
  "code": "884265",
  "device_ref": "sandbox-12424"
}
```

```json
{
  "session_id": "a26c6829-d59c-4b12-92d9-3c3f7f81a95b",
  "subject": {
    "type": "CLIENT",
    "id": "1d0a42cd-0876-4c11-a104-51b97fb45b3d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZDBhNDJjZC0wODc2LTRjMTEtYTEwNC01MWI5N2ZiNDViM2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NTU0LCJpYXQiOjE3OTMyMDU2NTQsImp0aSI6ImZkMTAzZWI0LTJhYmItNDEzZi1hNTNjLWQ5ZTc4MGE0MDM4NiIsInNpZCI6ImEyNmM2ODI5LWQ1OWMtNGIxMi05MmQ5LTNjM2Y3ZjgxYTk1YiJ9.Y2SMYyFRHj8sm_q090OPgDmA1dW2Kb2UAqvaXcwxbMY",
  "access_expires_at": "2026-10-28T16:55:54.345716333Z",
  "refresh_token": "I8hoBP8Noufl8K9GxMZSxquhM_WI9jNXAtPX6HS4nRk",
  "refresh_expires_at": "2026-11-27T16:40:54.345316421Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "35969a76-9c41-4557-ac8d-2e38fd5fdee6",
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
  "id": "7ae3ebb1-32eb-4814-8050-77a6627b128c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:45:54.564196Z",
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
  "command_id": "62da2076-d43d-44de-b656-6fc051645783",
  "quote_id": "7ae3ebb1-32eb-4814-8050-77a6627b128c",
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
    "phone": "+380679738729"
  }
}
```

```json
{
  "id": "21b3df9e-daf1-4605-833e-fd74fc98b614",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1d0a42cd-0876-4c11-a104-51b97fb45b3d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:40:54.782489Z",
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
    "id": "6b2e7109-200e-4250-b820-144ed72a6eac",
    "order_id": "21b3df9e-daf1-4605-833e-fd74fc98b614",
    "expires_at": "2026-10-28T16:41:09.784816Z",
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

`POST /api/driver/v1/offers/6b2e7109-200e-4250-b820-144ed72a6eac/accept` → **200**

```json
{
  "command_id": "2bffb1c2-c2dd-4f7a-8c5c-7500fe20be68"
}
```

```json
{
  "id": "7dd016b6-861e-444e-9933-17c59dc5d934",
  "order_id": "21b3df9e-daf1-4605-833e-fd74fc98b614",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6e800483-73ea-4ca4-9197-9eb0623c82a1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6e800483-73ea-4ca4-9197-9eb0623c82a1",
  "order_id": "21b3df9e-daf1-4605-833e-fd74fc98b614",
  "assignment_id": "7dd016b6-861e-444e-9933-17c59dc5d934",
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
    "phone": "+380679738729"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "616d13ea-3157-455f-8197-76dbe6987dc8",
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
  "id": "2f91a701-b9f0-473d-b5b0-d6853f34d7f2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:45:55.672550Z",
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
  "command_id": "32231edc-0e8c-4ceb-a1ca-5a2031488c87",
  "quote_id": "2f91a701-b9f0-473d-b5b0-d6853f34d7f2",
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
  "id": "3d3db1c4-aead-4eb4-9b8e-8fcc7e2a4ad0",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1d0a42cd-0876-4c11-a104-51b97fb45b3d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:40:55.894515Z",
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
  "command_id": "e8d34ca3-5622-477d-97df-fcb2d9282743",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T19:40:56Z"
}
```

```json
{
  "id": "6f178c69-4a64-459c-991c-2c16d44b0055",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:45:56.128871Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T19:40:56Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "56975c9b-889f-4895-8d5a-e16a7a28039a",
  "quote_id": "6f178c69-4a64-459c-991c-2c16d44b0055",
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
  "pickup_at": "2026-10-28T19:40:56Z"
}
```

```json
{
  "id": "74370f2f-53d3-4a81-ac24-10aba0b7703f",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1d0a42cd-0876-4c11-a104-51b97fb45b3d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T16:40:56.358552Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T19:40:56Z",
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
  "command_id": "9e9c7ffa-fca3-43bd-974b-a9f23671dda3",
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
  "id": "de6c4e44-211e-4052-932e-174e9ac7963c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:45:56.588387Z",
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
  "command_id": "0cfb0b61-2c58-452a-8590-8d6b6a320179",
  "quote_id": "de6c4e44-211e-4052-932e-174e9ac7963c",
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
  "correlation_id": "31d7c69b-8fde-4e33-aebc-d619c25d8969"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "74370f2f-53d3-4a81-ac24-10aba0b7703f",
      "short_number": 14,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "1d0a42cd-0876-4c11-a104-51b97fb45b3d",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T16:40:56.358552Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T19:40:56Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "3d3db1c4-aead-4eb4-9b8e-8fcc7e2a4ad0",
      "short_number": 13,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "1d0a42cd-0876-4c11-a104-51b97fb45b3d",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-28T16:40:55.894515Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "21b3df9e-daf1-4605-833e-fd74fc98b614",
      "short_number": 12,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "1d0a42cd-0876-4c11-a104-51b97fb45b3d",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "3d3db1c4-aead-4eb4-9b8e-8fcc7e2a4ad0",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1d0a42cd-0876-4c11-a104-51b97fb45b3d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:40:55.894515Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/21b3df9e-daf1-4605-833e-fd74fc98b614` → **200**

```json
{
  "id": "21b3df9e-daf1-4605-833e-fd74fc98b614",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1d0a42cd-0876-4c11-a104-51b97fb45b3d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "7dd016b6-861e-444e-9933-17c59dc5d934",
    "order_id": "21b3df9e-daf1-4605-833e-fd74fc98b614",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "6e800483-73ea-4ca4-9197-9eb0623c82a1",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T16:40:54.782489Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/21b3df9e-daf1-4605-833e-fd74fc98b614/cancel` → **200**

```json
{
  "command_id": "c0f5c4dd-ba57-4830-a60c-260cb1ec620a",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "21b3df9e-daf1-4605-833e-fd74fc98b614",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "1d0a42cd-0876-4c11-a104-51b97fb45b3d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "7dd016b6-861e-444e-9933-17c59dc5d934",
    "order_id": "21b3df9e-daf1-4605-833e-fd74fc98b614",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "6e800483-73ea-4ca4-9197-9eb0623c82a1",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T16:40:54.782489Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
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

`GET /api/rider/v1/orders/3d3db1c4-aead-4eb4-9b8e-8fcc7e2a4ad0` → **200**

```json
{
  "id": "3d3db1c4-aead-4eb4-9b8e-8fcc7e2a4ad0",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1d0a42cd-0876-4c11-a104-51b97fb45b3d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:40:55.894515Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/3d3db1c4-aead-4eb4-9b8e-8fcc7e2a4ad0/cancel` → **200**

```json
{
  "command_id": "8ec56ab9-0c5d-4968-b55c-a2ee4b2fe000",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3d3db1c4-aead-4eb4-9b8e-8fcc7e2a4ad0",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1d0a42cd-0876-4c11-a104-51b97fb45b3d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:40:55.894515Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
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

`GET /api/rider/v1/orders/74370f2f-53d3-4a81-ac24-10aba0b7703f` → **200**

```json
{
  "id": "74370f2f-53d3-4a81-ac24-10aba0b7703f",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1d0a42cd-0876-4c11-a104-51b97fb45b3d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T16:40:56.358552Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T19:40:56Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/74370f2f-53d3-4a81-ac24-10aba0b7703f/cancel` → **200**

```json
{
  "command_id": "26809488-87d7-498e-ab37-13e45025b3f6",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "74370f2f-53d3-4a81-ac24-10aba0b7703f",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "1d0a42cd-0876-4c11-a104-51b97fb45b3d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T16:40:56.358552Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind"
    }
  },
  "pickup_at": "2026-10-28T19:40:56Z",
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
  "session_id": "f87bc92d-84f8-4fd9-a965-fe83eff05f55",
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
  "last_heartbeat_at": "2026-10-28T16:40:53.878743Z",
  "last_location_at": "2026-10-28T16:40:53.878743Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f87bc92d-84f8-4fd9-a965-fe83eff05f55/close` → **200**

```json
{
  "command_id": "26fbcac2-0d0e-442f-9bf5-4a2147aa0cd5",
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

Done: orders 21b3df9e-daf1-4605-833e-fd74fc98b614, 3d3db1c4-aead-4eb4-9b8e-8fcc7e2a4ad0, 74370f2f-53d3-4a81-ac24-10aba0b7703f.

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
  "session_id": "ea3d0dc3-4a9e-4caa-bfa9-3a23197c4269",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY1NTksImlhdCI6MTc5MzIwNTY1OSwianRpIjoiNmJjNzM3OGQtYzgwMS00ZDE5LWJiMzItYTc0NjQyY2U5Y2E2Iiwic2lkIjoiZWEzZDBkYzMtNGE5ZS00Y2FhLWJmYTktM2EyMzE5N2M0MjY5In0.VPNnql1-Ik_2F5kgZP_HsrSHr8RxBcMUT2O4YQbPgvw",
  "access_expires_at": "2026-10-28T16:55:59.516639243Z",
  "refresh_token": "E933NHmm_l4aWhCzdJJt5Sma3crOq4bQDf2Qtuv37G0",
  "refresh_expires_at": "2026-10-29T04:40:59.516226221Z",
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
  "session_id": "3520d20c-0d4c-41e6-bd5d-a73a36fbe215",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY1NTksImlhdCI6MTc5MzIwNTY1OSwianRpIjoiYzkxNWMxYjQtYzI5Zi00ODNiLThjZjEtMTBiOWRjZjA1NGJlIiwic2lkIjoiMzUyMGQyMGMtMGQ0Yy00MWU2LWJkNWQtYTczYTM2ZmJlMjE1In0.ynxCBdwi8fz06DW9MaiyEMW9Lzb5kbdC385zUe3Uzhk",
  "access_expires_at": "2026-10-28T16:55:59.986127201Z",
  "refresh_token": "WzT2axNXYyXLaX-khZyk1VHPvoo_Av30DggOtlVDoiI",
  "refresh_expires_at": "2026-10-29T04:40:59.985698717Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26657"
}
```

```json
{
  "challenge_id": "83ad64df-2e04-487c-bf5b-10750d21945d",
  "expires_at": "2026-10-28T16:46:00.195855354Z",
  "resend_available_at": "2026-10-28T16:41:01.195855354Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "982266",
  "sent_at": "2026-10-28T16:41:00.197616972Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "83ad64df-2e04-487c-bf5b-10750d21945d",
  "code": "982266",
  "device_ref": "sandbox-26657"
}
```

```json
{
  "session_id": "0c230b71-4211-4aaa-a361-a3b34223bb9b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjU2MCwiaWF0IjoxNzkzMjA1NjYwLCJqdGkiOiIxNzhiYThhMC05MGYwLTQ3NmItYjhlMS00ODVlYTM2ZTJmZTkiLCJzaWQiOiIwYzIzMGI3MS00MjExLTRhYWEtYTM2MS1hM2IzNDIyM2JiOWIifQ.KyUp1csmRV45-gtttLgmmKIoj9ywjJVbD4mJOT0Z-AE",
  "access_expires_at": "2026-10-28T16:56:00.426699513Z",
  "refresh_token": "EzKlQ5_KjAx3KLXU9lWlPCVdVHOapG0qgtCMRZmPwlk",
  "refresh_expires_at": "2026-11-27T16:41:00.426302546Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd8f2d15-bb86-4373-baef-29fba586a396",
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
  "last_heartbeat_at": "2026-10-28T16:40:40.833604Z",
  "last_location_at": "2026-10-28T16:40:40.833604Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/cd8f2d15-bb86-4373-baef-29fba586a396/handover` → **200**

```json
{
  "command_id": "243ba538-a895-4bcd-a8b6-a3a55a3211b4",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd8f2d15-bb86-4373-baef-29fba586a396",
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
  "last_heartbeat_at": "2026-10-28T16:40:40.833604Z",
  "last_location_at": "2026-10-28T16:40:40.833604Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/cd8f2d15-bb86-4373-baef-29fba586a396/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:41:01Z",
    "sequence": 1793205661701
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd8f2d15-bb86-4373-baef-29fba586a396",
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
  "last_heartbeat_at": "2026-10-28T16:41:01.086333Z",
  "last_location_at": "2026-10-28T16:41:01.086333Z",
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
  "command_id": "534c97af-f733-4056-b3b2-73f8144eec6d",
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
  "effective_at": "2026-10-28T16:41:01.534132Z",
  "changed_by": "6873b609-b860-49e4-8d57-f3e610bae089",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "6873b609-b860-49e4-8d57-f3e610bae089",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T16:41:01.756547335Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "446f252e-f0df-4fb4-a5ce-554457628a20",
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
  "id": "3583f6bf-f691-4760-abfe-fc2af290e3dd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:46:01.971361Z",
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
  "command_id": "a58715bb-92d1-4b34-ab7c-a98037f1c78d",
  "quote_id": "3583f6bf-f691-4760-abfe-fc2af290e3dd",
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
    "phone": "+3806711112251"
  }
}
```

```json
{
  "id": "a0c79b3e-ee83-4b2a-9f34-b56e815a09f6",
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
  "created_at": "2026-10-28T16:41:02.195385Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711112251"
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
    "id": "85167bca-b2ad-437c-8ff2-177b708cbce4",
    "order_id": "a0c79b3e-ee83-4b2a-9f34-b56e815a09f6",
    "expires_at": "2026-10-28T16:41:17.198003Z",
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

`POST /api/driver/v1/offers/85167bca-b2ad-437c-8ff2-177b708cbce4/accept` → **200**

```json
{
  "command_id": "102342c8-737a-430d-8468-37b1ee6f7f2a"
}
```

```json
{
  "id": "e79e88c4-f467-4594-8a49-f3a21fea797b",
  "order_id": "a0c79b3e-ee83-4b2a-9f34-b56e815a09f6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e93e11a3-a47b-490b-b0f2-81879c4dd73d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e93e11a3-a47b-490b-b0f2-81879c4dd73d",
  "order_id": "a0c79b3e-ee83-4b2a-9f34-b56e815a09f6",
  "assignment_id": "e79e88c4-f467-4594-8a49-f3a21fea797b",
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
    "phone": "+3806711112251"
  }
}
```

`POST /api/driver/v1/work-sessions/cd8f2d15-bb86-4373-baef-29fba586a396/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:41:03Z",
    "sequence": 1793205663477
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd8f2d15-bb86-4373-baef-29fba586a396",
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
  "last_heartbeat_at": "2026-10-28T16:41:03.064662Z",
  "last_location_at": "2026-10-28T16:41:03.064662Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e93e11a3-a47b-490b-b0f2-81879c4dd73d/arrive` → **200**

```json
{
  "command_id": "da39519b-af11-45f3-a577-45bc07b6e052",
  "expected_version": 0
}
```

```json
{
  "id": "e93e11a3-a47b-490b-b0f2-81879c4dd73d",
  "order_id": "a0c79b3e-ee83-4b2a-9f34-b56e815a09f6",
  "assignment_id": "e79e88c4-f467-4594-8a49-f3a21fea797b",
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
  "arrived_at": "2026-10-28T16:41:03.286862Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711112251"
  }
}
```

`POST /api/driver/v1/trips/e93e11a3-a47b-490b-b0f2-81879c4dd73d/start` → **200**

```json
{
  "command_id": "80a6b700-7b76-4527-89e6-bf3ac45c0d5e",
  "expected_version": 1
}
```

```json
{
  "id": "e93e11a3-a47b-490b-b0f2-81879c4dd73d",
  "order_id": "a0c79b3e-ee83-4b2a-9f34-b56e815a09f6",
  "assignment_id": "e79e88c4-f467-4594-8a49-f3a21fea797b",
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
  "arrived_at": "2026-10-28T16:41:03.286862Z",
  "started_at": "2026-10-28T16:41:03.534476Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711112251"
  }
}
```

`POST /api/driver/v1/trips/e93e11a3-a47b-490b-b0f2-81879c4dd73d/complete` → **200**

```json
{
  "command_id": "0700ac1c-316e-4a0f-a06b-739f392d8e1d",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:41:03Z",
  "cash_received": true
}
```

```json
{
  "id": "e93e11a3-a47b-490b-b0f2-81879c4dd73d",
  "order_id": "a0c79b3e-ee83-4b2a-9f34-b56e815a09f6",
  "assignment_id": "e79e88c4-f467-4594-8a49-f3a21fea797b",
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
  "arrived_at": "2026-10-28T16:41:03.286862Z",
  "started_at": "2026-10-28T16:41:03.534476Z",
  "completed_at": "2026-10-28T16:41:03.77753Z",
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
  "command_id": "937f170d-1b95-46f2-86d6-bfb98ccf0168",
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
  "id": "a959d646-f652-4765-8c4d-8c391ca3646f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:46:04.006886Z",
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
  "command_id": "5b3d3b32-441c-4cd0-a110-4ca21a3221de",
  "quote_id": "a959d646-f652-4765-8c4d-8c391ca3646f",
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
    "phone": "+380671114272"
  }
}
```

```json
{
  "id": "ead9928e-b100-49f7-8955-f8c348cc2918",
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
  "created_at": "2026-10-28T16:41:04.231015Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671114272"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/ead9928e-b100-49f7-8955-f8c348cc2918` → **200**

```json
{
  "id": "ead9928e-b100-49f7-8955-f8c348cc2918",
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
  "created_at": "2026-10-28T16:41:04.231015Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671114272"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ead9928e-b100-49f7-8955-f8c348cc2918/cancel` → **200**

```json
{
  "command_id": "91c7ba8b-ac14-43b9-8c20-126b250f8c58",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "ead9928e-b100-49f7-8955-f8c348cc2918",
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
  "created_at": "2026-10-28T16:41:04.231015Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671114272"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "uk": "Помилка оператора",
      "pl": "Błąd operatora",
      "ru": "Ошибка оператора",
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
  "staff_id": "6873b609-b860-49e4-8d57-f3e610bae089",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T16:41:03.781612Z",
  "last_entries": [
    {
      "order_id": "ead9928e-b100-49f7-8955-f8c348cc2918",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T16:41:04.701422Z"
    },
    {
      "order_id": "a0c79b3e-ee83-4b2a-9f34-b56e815a09f6",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T16:41:03.781612Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd8f2d15-bb86-4373-baef-29fba586a396",
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
  "last_heartbeat_at": "2026-10-28T16:41:03.064662Z",
  "last_location_at": "2026-10-28T16:41:03.064662Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cd8f2d15-bb86-4373-baef-29fba586a396/close` → **200**

```json
{
  "command_id": "6162f45f-b6c8-43b4-baae-3db04ba47b4a",
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

Done: operator bonus for fulfilled a0c79b3e-ee83-4b2a-9f34-b56e815a09f6 and operator-fault cancellation ead9928e-b100-49f7-8955-f8c348cc2918.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671501523",
  "device_ref": "sandbox-30462"
}
```

```json
{
  "challenge_id": "8fc28353-ac76-4205-894b-c4588379a5dc",
  "expires_at": "2026-10-28T16:46:07.600683712Z",
  "resend_available_at": "2026-10-28T16:41:08.600683712Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671501523` → **200**

```json
{
  "phone": "+380671501523",
  "audience": "CLIENT",
  "code": "103568",
  "sent_at": "2026-10-28T16:41:07.602627069Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675787954",
  "device_ref": "sandbox-18876",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "d1429866-52f7-49de-b629-04a482d1fa9a",
  "expires_at": "2026-10-28T16:46:07.841705875Z",
  "resend_available_at": "2026-10-28T16:41:08.841705875Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675787954` → **200**

```json
{
  "phone": "+380675787954",
  "audience": "CLIENT",
  "code": "663035",
  "sent_at": "2026-10-28T16:41:07.843427975Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676510000",
  "device_ref": "sandbox-6920"
}
```

```json
{
  "challenge_id": "b3723735-db91-4d08-9dce-b60a5c545cce",
  "expires_at": "2026-10-28T16:46:08.07761248Z",
  "resend_available_at": "2026-10-28T16:41:09.07761248Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676510000` → **200**

```json
{
  "phone": "+380676510000",
  "audience": "CLIENT",
  "code": "926928",
  "sent_at": "2026-10-28T16:41:08.079934648Z",
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
  "session_id": "34526692-f3e3-4c53-a52f-3e0be194fa49",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY1NjgsImlhdCI6MTc5MzIwNTY2OCwianRpIjoiNWRhYzVhM2YtYTVlMy00ODhkLThhMmEtNTZiMjU1Y2YxOTZmIiwic2lkIjoiMzQ1MjY2OTItZjNlMy00YzUzLWE1MmYtM2UwYmUxOTRmYTQ5In0.KBFiJGDO7CmfM5iAEp40QzY1D4dfeMg78EzHUSBJsU4",
  "access_expires_at": "2026-10-28T16:56:08.582062378Z",
  "refresh_token": "siRmQXnMVa06ktFCz_bZUIQFOTElz5zckVj6UR_Njgw",
  "refresh_expires_at": "2026-10-29T04:41:08.581612002Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676510000` → **200**

```json
{
  "deliveries": [
    {
      "id": "6b66cbc3-e3cc-451b-8df8-6ab7b831e7c2",
      "challenge_id": "b3723735-db91-4d08-9dce-b60a5c545cce",
      "phone": "+380676510000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-d1062e7b-654e-4bcc-bef7-7152446ea19b",
      "error": null,
      "attempted_at": "2026-10-28T16:41:08.080166Z"
    },
    {
      "id": "b737d8cd-901f-4a56-9783-595a2e29ada0",
      "challenge_id": "b3723735-db91-4d08-9dce-b60a5c545cce",
      "phone": "+380676510000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T16:41:08.079522Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380676510000` → **200**

```json
{
  "phone": "+380676510000",
  "audience": "CLIENT",
  "code": "926928",
  "sent_at": "2026-10-28T16:41:08.079934648Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675787954` → **200**

```json
{
  "deliveries": [
    {
      "id": "00b56c23-139c-43c2-8696-e79cc189779f",
      "challenge_id": "d1429866-52f7-49de-b629-04a482d1fa9a",
      "phone": "+380675787954",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-9d0850a8-4f4e-453e-8bba-49029fad3aff",
      "error": null,
      "attempted_at": "2026-10-28T16:41:07.843641Z"
    }
  ]
}
```

Done: SMS to +380671501523, a call to +380675787954, SMS then a call to +380676510000.

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
  "session_id": "b5a163a8-e457-484f-8643-7f65eba0ccae",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY1NjksImlhdCI6MTc5MzIwNTY2OSwianRpIjoiZDAwZGUxMGYtZjJhNC00MTI3LTkzNWMtZDViYTJjMTc0ODdiIiwic2lkIjoiYjVhMTYzYTgtZTQ1Ny00ODRmLTg2NDMtN2Y2NWViYTBjY2FlIn0.GmmVcy1oPiw4KSLOZ2h9o38YohS1YpWDQtJGwXx4uGM",
  "access_expires_at": "2026-10-28T16:56:09.516597489Z",
  "refresh_token": "Dw7vlhSDj2Nf_VbSJbL7GEAl9VI6kbNBGSLwuH1xhrM",
  "refresh_expires_at": "2026-10-29T04:41:09.51619985Z",
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
  "session_id": "557e1d6f-bb96-45bf-887a-2276519152f3",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY1NjksImlhdCI6MTc5MzIwNTY2OSwianRpIjoiNWMzYzFhZTMtOWM3NC00NWZjLTgyZjUtNTAzNThhZDZkMzdmIiwic2lkIjoiNTU3ZTFkNmYtYmI5Ni00NWJmLTg4N2EtMjI3NjUxOTE1MmYzIn0.DrXJja7sLeSy9vpLqzUy3_upoSu3YM1InbMxNOo_798",
  "access_expires_at": "2026-10-28T16:56:09.982356309Z",
  "refresh_token": "RcohhPFQn2wcd-9vusx__Cl3X3FnyOKRDQyR2jZ38JA",
  "refresh_expires_at": "2026-10-29T04:41:09.981954905Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "6873b609-b860-49e4-8d57-f3e610bae089",
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

`POST /api/admin/v1/staff-extensions/6873b609-b860-49e4-8d57-f3e610bae089` → **200**

```json
{
  "command_id": "f434c599-d82b-4933-9b5d-f361fec225ae",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "6873b609-b860-49e4-8d57-f3e610bae089",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "85187360-c982-4739-a055-8826b37f4046",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T16:41:10.846574Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T16:41:10.846574Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "4defa840-95eb-47c4-b0a9-e25ee548b865",
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
  "id": "7dcb2343-9cbc-4b4b-93cf-fe27cf257b4d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:46:11.271617Z",
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
  "command_id": "73a4fe2b-7de8-429f-908f-4ad3ae4950e0",
  "quote_id": "7dcb2343-9cbc-4b4b-93cf-fe27cf257b4d",
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
    "phone": "+380678564572"
  }
}
```

```json
{
  "id": "2b50ef1e-7b7d-4ff2-bf76-86b4819c7c3c",
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
  "created_at": "2026-10-28T16:41:11.496957Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678564572"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/2b50ef1e-7b7d-4ff2-bf76-86b4819c7c3c/calls` → **201**

```json
{
  "command_id": "12c30519-21da-4e88-8f20-01c623185777",
  "to": "CALLER"
}
```

```json
{
  "id": "7ae5c42d-5565-457a-891e-3b4e35535d03",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6873b609-b860-49e4-8d57-f3e610bae089",
  "order_ids": [
    "2b50ef1e-7b7d-4ff2-bf76-86b4819c7c3c"
  ],
  "started_at": "2026-10-28T16:41:11.753493Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/2b50ef1e-7b7d-4ff2-bf76-86b4819c7c3c/calls` → **201**

```json
{
  "command_id": "12c30519-21da-4e88-8f20-01c623185777",
  "to": "CALLER"
}
```

```json
{
  "id": "7ae5c42d-5565-457a-891e-3b4e35535d03",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6873b609-b860-49e4-8d57-f3e610bae089",
  "order_ids": [
    "2b50ef1e-7b7d-4ff2-bf76-86b4819c7c3c"
  ],
  "started_at": "2026-10-28T16:41:11.753493Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "7ae5c42d-5565-457a-891e-3b4e35535d03",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380678564572",
    "at": "2026-10-28T16:41:11.755428515Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "7ae5c42d-5565-457a-891e-3b4e35535d03",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.5209",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "7ae5c42d-5565-457a-891e-3b4e35535d03"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "7ae5c42d-5565-457a-891e-3b4e35535d03",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=2b50ef1e-7b7d-4ff2-bf76-86b4819c7c3c` → **200**

```json
{
  "calls": [
    {
      "id": "7ae5c42d-5565-457a-891e-3b4e35535d03",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6873b609-b860-49e4-8d57-f3e610bae089",
      "order_ids": [
        "2b50ef1e-7b7d-4ff2-bf76-86b4819c7c3c"
      ],
      "started_at": "2026-10-28T16:41:11.753493Z",
      "answered_at": "2026-10-28T16:41:12.253071Z",
      "ended_at": "2026-10-28T16:41:12.271748Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=2b50ef1e-7b7d-4ff2-bf76-86b4819c7c3c` → **200**

```json
{
  "calls": [
    {
      "id": "7ae5c42d-5565-457a-891e-3b4e35535d03",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6873b609-b860-49e4-8d57-f3e610bae089",
      "order_ids": [
        "2b50ef1e-7b7d-4ff2-bf76-86b4819c7c3c"
      ],
      "started_at": "2026-10-28T16:41:11.753493Z",
      "answered_at": "2026-10-28T16:41:12.253071Z",
      "ended_at": "2026-10-28T16:41:12.271748Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=2b50ef1e-7b7d-4ff2-bf76-86b4819c7c3c` → **200**

```json
{
  "calls": [
    {
      "id": "7ae5c42d-5565-457a-891e-3b4e35535d03",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6873b609-b860-49e4-8d57-f3e610bae089",
      "order_ids": [
        "2b50ef1e-7b7d-4ff2-bf76-86b4819c7c3c"
      ],
      "started_at": "2026-10-28T16:41:11.753493Z",
      "answered_at": "2026-10-28T16:41:12.253071Z",
      "ended_at": "2026-10-28T16:41:12.271748Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=2b50ef1e-7b7d-4ff2-bf76-86b4819c7c3c` → **200**

```json
{
  "calls": [
    {
      "id": "7ae5c42d-5565-457a-891e-3b4e35535d03",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6873b609-b860-49e4-8d57-f3e610bae089",
      "order_ids": [
        "2b50ef1e-7b7d-4ff2-bf76-86b4819c7c3c"
      ],
      "started_at": "2026-10-28T16:41:11.753493Z",
      "answered_at": "2026-10-28T16:41:12.253071Z",
      "ended_at": "2026-10-28T16:41:12.271748Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=2b50ef1e-7b7d-4ff2-bf76-86b4819c7c3c` → **200**

```json
{
  "calls": [
    {
      "id": "7ae5c42d-5565-457a-891e-3b4e35535d03",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6873b609-b860-49e4-8d57-f3e610bae089",
      "order_ids": [
        "2b50ef1e-7b7d-4ff2-bf76-86b4819c7c3c"
      ],
      "started_at": "2026-10-28T16:41:11.753493Z",
      "answered_at": "2026-10-28T16:41:12.253071Z",
      "ended_at": "2026-10-28T16:41:12.271748Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T16:41:21.175714Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/2b50ef1e-7b7d-4ff2-bf76-86b4819c7c3c` → **200**

```json
{
  "id": "2b50ef1e-7b7d-4ff2-bf76-86b4819c7c3c",
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
  "created_at": "2026-10-28T16:41:11.496957Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678564572"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/2b50ef1e-7b7d-4ff2-bf76-86b4819c7c3c/cancel` → **200**

```json
{
  "command_id": "4eec2b6e-1b11-4341-8461-872b4869d381",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "2b50ef1e-7b7d-4ff2-bf76-86b4819c7c3c",
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
  "created_at": "2026-10-28T16:41:11.496957Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678564572"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
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
  "command_id": "99bff201-1643-4552-a62a-2f6a9b4be32b",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T16:41:21.876254Z",
  "extension": "101"
}
```

Done: outgoing call 7ae5c42d-5565-457a-891e-3b4e35535d03 from order 2b50ef1e-7b7d-4ff2-bf76-86b4819c7c3c, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633942063",
  "device_ref": "sandbox-28869"
}
```

```json
{
  "challenge_id": "49fa28f6-453c-43d4-9bd0-eb8d0ab9211c",
  "expires_at": "2026-10-28T16:46:22.101287466Z",
  "resend_available_at": "2026-10-28T16:41:23.101287466Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633942063` → **200**

```json
{
  "phone": "+380633942063",
  "audience": "CLIENT",
  "code": "764209",
  "sent_at": "2026-10-28T16:41:22.103063235Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "49fa28f6-453c-43d4-9bd0-eb8d0ab9211c",
  "code": "764209",
  "device_ref": "sandbox-28869"
}
```

```json
{
  "session_id": "e35cdb36-9cbd-454d-9234-61a6671c8b0d",
  "subject": {
    "type": "CLIENT",
    "id": "f78ba0d8-9064-4157-b43a-423cf2b79ccb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNzhiYTBkOC05MDY0LTQxNTctYjQzYS00MjNjZjJiNzljY2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NTgyLCJpYXQiOjE3OTMyMDU2ODIsImp0aSI6IjQzMGFmZmMzLWY2ZjEtNDFjZC04MGZmLTk1ZDNhZTQyOWRmNiIsInNpZCI6ImUzNWNkYjM2LTljYmQtNDU0ZC05MjM0LTYxYTY2NzFjOGIwZCJ9.1_0u12wFIgmhRmVnpIfHFnx8QLEcYiDS9KW7BMrUVYE",
  "access_expires_at": "2026-10-28T16:56:22.337298106Z",
  "refresh_token": "df8fehxWN1EQfAToB5uaRDc4pD3o417cOBQyNNmYjMg",
  "refresh_expires_at": "2026-11-27T16:41:22.336834094Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "f78ba0d8-9064-4157-b43a-423cf2b79ccb",
  "session_id": "e35cdb36-9cbd-454d-9234-61a6671c8b0d",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633942063",
  "device_ref": "sandbox-343"
}
```

```json
{
  "challenge_id": "7231865f-b007-4dbb-a5a0-6ac063f286d3",
  "expires_at": "2026-10-28T16:46:24.760776817Z",
  "resend_available_at": "2026-10-28T16:41:25.760776817Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633942063` → **200**

```json
{
  "phone": "+380633942063",
  "audience": "CLIENT",
  "code": "389112",
  "sent_at": "2026-10-28T16:41:24.762641968Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7231865f-b007-4dbb-a5a0-6ac063f286d3",
  "code": "389112",
  "device_ref": "sandbox-343"
}
```

```json
{
  "session_id": "33c9d560-9a01-45ed-bd3c-7eccd3c58480",
  "subject": {
    "type": "CLIENT",
    "id": "f78ba0d8-9064-4157-b43a-423cf2b79ccb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNzhiYTBkOC05MDY0LTQxNTctYjQzYS00MjNjZjJiNzljY2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NTg0LCJpYXQiOjE3OTMyMDU2ODQsImp0aSI6IjllNDhhNmNiLTA3OTEtNDkyNi1iM2U2LWU3ZmUwN2ZhMTBhNyIsInNpZCI6IjMzYzlkNTYwLTlhMDEtNDVlZC1iZDNjLTdlY2NkM2M1ODQ4MCJ9.tebQsvdWvnKbwakW4qZ5F05r_IZEOsHwv9nizHoCYIU",
  "access_expires_at": "2026-10-28T16:56:24.999491906Z",
  "refresh_token": "drnzRGhAexDVAxgshe8Dh4vV9qeGNSyQkMZJa2g7cV0",
  "refresh_expires_at": "2026-11-27T16:41:24.999081769Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "f17b44cb-39b9-48e8-90e2-240a9125c359",
  "expires_at": "2026-10-28T16:46:27.217844194Z",
  "resend_available_at": "2026-10-28T16:41:28.217844194Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633942063` → **200**

```json
{
  "phone": "+380633942063",
  "audience": "CLIENT",
  "code": "136367",
  "sent_at": "2026-10-28T16:41:27.219325592Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380632526112"
}
```

```json
{
  "challenge_id": "771144d8-d8d9-4079-aa27-f778be312fe3",
  "expires_at": "2026-10-28T16:46:27.449478095Z",
  "resend_available_at": "2026-10-28T16:41:28.449478095Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632526112` → **200**

```json
{
  "phone": "+380632526112",
  "audience": "CLIENT",
  "code": "300947",
  "sent_at": "2026-10-28T16:41:27.450818149Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "021bd0dc-7e1a-488f-bf51-7b9118c237e8",
  "current_challenge_id": "f17b44cb-39b9-48e8-90e2-240a9125c359",
  "current_code": "000000",
  "new_challenge_id": "771144d8-d8d9-4079-aa27-f778be312fe3",
  "new_code": "300947"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "6d10ac5a-62ee-4f39-afd5-f914ae085b46"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "2ae5df84-cfe2-4d03-b6cb-2840d625812a",
  "current_challenge_id": "f17b44cb-39b9-48e8-90e2-240a9125c359",
  "current_code": "136367",
  "new_challenge_id": "771144d8-d8d9-4079-aa27-f778be312fe3",
  "new_code": "300947"
}
```

```json
{
  "subject_id": "f78ba0d8-9064-4157-b43a-423cf2b79ccb",
  "phone": "+380632526112",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "f78ba0d8-9064-4157-b43a-423cf2b79ccb",
  "session_id": "e35cdb36-9cbd-454d-9234-61a6671c8b0d",
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
  "correlation_id": "fe0f9734-1fe9-4b2c-ad54-5e4213099898"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632526112",
  "device_ref": "sandbox-18909"
}
```

```json
{
  "challenge_id": "51708768-b2d5-4a2e-89d2-d60313c49e7f",
  "expires_at": "2026-10-28T16:46:30.544879568Z",
  "resend_available_at": "2026-10-28T16:41:31.544879568Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632526112` → **200**

```json
{
  "phone": "+380632526112",
  "audience": "CLIENT",
  "code": "993093",
  "sent_at": "2026-10-28T16:41:30.5465251Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "51708768-b2d5-4a2e-89d2-d60313c49e7f",
  "code": "993093",
  "device_ref": "sandbox-18909"
}
```

```json
{
  "session_id": "cb7a5655-bb38-4136-b7c5-7515e1188110",
  "subject": {
    "type": "CLIENT",
    "id": "f78ba0d8-9064-4157-b43a-423cf2b79ccb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNzhiYTBkOC05MDY0LTQxNTctYjQzYS00MjNjZjJiNzljY2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NTkwLCJpYXQiOjE3OTMyMDU2OTAsImp0aSI6IjQ5YTUyZmEwLWE0NWMtNDJlYy1iNzM3LWQyY2Y4ZDhhODJhYyIsInNpZCI6ImNiN2E1NjU1LWJiMzgtNDEzNi1iN2M1LTc1MTVlMTE4ODExMCJ9.iBY-D0CB2dLvtKGbY-lKqqYzN3kbeCugnokCIJM5M-k",
  "access_expires_at": "2026-10-28T16:56:30.779604047Z",
  "refresh_token": "vpH3N6Qj1HMwImm7FXOAtJK6yNsPjFDza5PtreaucI4",
  "refresh_expires_at": "2026-11-27T16:41:30.779219939Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "f78ba0d8-9064-4157-b43a-423cf2b79ccb",
  "session_id": "cb7a5655-bb38-4136-b7c5-7515e1188110",
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
  "session_id": "591ac8dd-a7a2-4169-a77a-fb33536a861c",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY1OTEsImlhdCI6MTc5MzIwNTY5MSwianRpIjoiMTkwNWMzMDMtNTMyYi00ZDExLTgyNzktN2VhYjZhYzg5MDQ0Iiwic2lkIjoiNTkxYWM4ZGQtYTdhMi00MTY5LWE3N2EtZmIzMzUzNmE4NjFjIn0.UQ9mXVE3srYa1nDGw4ZckJj_b2Ni2-UjOwUGdDTnfX4",
  "access_expires_at": "2026-10-28T16:56:31.465919725Z",
  "refresh_token": "O7hopbBWNGXx-rpCeQfuWFA3R_YwbWamvlBT8cCwKF8",
  "refresh_expires_at": "2026-10-29T04:41:31.465486744Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/f78ba0d8-9064-4157-b43a-423cf2b79ccb` → **200**

```json
{
  "client": {
    "id": "f78ba0d8-9064-4157-b43a-423cf2b79ccb",
    "phone": "+380632526112",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T16:41:22.335412Z",
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

`POST /api/admin/v1/clients/f78ba0d8-9064-4157-b43a-423cf2b79ccb/phone` → **400**

```json
{
  "command_id": "83dc6c5e-bb63-4611-b4db-e55969a30759",
  "expected_version": 3,
  "phone": "+380637719719",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/f78ba0d8-9064-4157-b43a-423cf2b79ccb/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "70cc9069-bc61-4ed7-bcbd-881d6461fe51",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/f78ba0d8-9064-4157-b43a-423cf2b79ccb/phone` → **200**

```json
{
  "command_id": "a223e750-ca01-4707-a79f-68a7c1ea907a",
  "expected_version": 3,
  "phone": "+380637719719",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "f78ba0d8-9064-4157-b43a-423cf2b79ccb",
  "phone": "+380637719719",
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
  "correlation_id": "dfad2913-a99c-4dd3-855b-826796474cdf"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637719719",
  "device_ref": "sandbox-15738"
}
```

```json
{
  "challenge_id": "7566b414-3b7f-4b6a-bb4a-169265d0c64a",
  "expires_at": "2026-10-28T16:46:32.573616886Z",
  "resend_available_at": "2026-10-28T16:41:33.573616886Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637719719` → **200**

```json
{
  "phone": "+380637719719",
  "audience": "CLIENT",
  "code": "902266",
  "sent_at": "2026-10-28T16:41:32.575461963Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7566b414-3b7f-4b6a-bb4a-169265d0c64a",
  "code": "902266",
  "device_ref": "sandbox-15738"
}
```

```json
{
  "session_id": "1d7a0270-d5b0-48b6-90d2-429787c2625a",
  "subject": {
    "type": "CLIENT",
    "id": "f78ba0d8-9064-4157-b43a-423cf2b79ccb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNzhiYTBkOC05MDY0LTQxNTctYjQzYS00MjNjZjJiNzljY2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NTkyLCJpYXQiOjE3OTMyMDU2OTIsImp0aSI6IjhmMmYzNzNlLTEzZGItNDU0Ni1iZThmLTE0ZTI1OTUzYTIxYiIsInNpZCI6IjFkN2EwMjcwLWQ1YjAtNDhiNi05MGQyLTQyOTc4N2MyNjI1YSJ9.Rw73wTmEDEW3GCTpW47cNt9Mxn-v2kJGlNiMPdAazhE",
  "access_expires_at": "2026-10-28T16:56:32.808676316Z",
  "refresh_token": "rEKsiPlAu2I1J84qyHzJPy626ZNn6BJGFe52xenkjVk",
  "refresh_expires_at": "2026-11-27T16:41:32.808225128Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "f78ba0d8-9064-4157-b43a-423cf2b79ccb",
  "session_id": "1d7a0270-d5b0-48b6-90d2-429787c2625a",
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
  "phone": "+380635581260",
  "device_ref": "sandbox-21988"
}
```

```json
{
  "challenge_id": "f38290a1-1d4e-4d53-944a-13795a4e8628",
  "expires_at": "2026-10-28T16:46:33.237810812Z",
  "resend_available_at": "2026-10-28T16:41:34.237810812Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635581260` → **200**

```json
{
  "phone": "+380635581260",
  "audience": "CLIENT",
  "code": "566748",
  "sent_at": "2026-10-28T16:41:33.23946397Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f38290a1-1d4e-4d53-944a-13795a4e8628",
  "code": "566748",
  "device_ref": "sandbox-21988"
}
```

```json
{
  "session_id": "26135c47-e947-4dfc-90de-79b2fed3af76",
  "subject": {
    "type": "CLIENT",
    "id": "d33bd7c3-575f-4b77-957e-b7a1dc12a0c6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzNiZDdjMy01NzVmLTRiNzctOTU3ZS1iN2ExZGMxMmEwYzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NTkzLCJpYXQiOjE3OTMyMDU2OTMsImp0aSI6IjNhODVmZDBhLTViNjItNGNhNS1hNzk2LWFjMWQ2ZDRkODE5OSIsInNpZCI6IjI2MTM1YzQ3LWU5NDctNGRmYy05MGRlLTc5YjJmZWQzYWY3NiJ9.6nIGw6yVRG0S-O4N38dm5iHQW6dgPM7b2SWvxNSJTE8",
  "access_expires_at": "2026-10-28T16:56:33.472400211Z",
  "refresh_token": "0eVNvYmxuPuHFJHazCZCMPi6A2MGInLGuoJlpO-cHcM",
  "refresh_expires_at": "2026-11-27T16:41:33.471972167Z",
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
  "session_id": "c410cd91-669e-4e67-b2ef-7df2384c3d54",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY1OTQsImlhdCI6MTc5MzIwNTY5NCwianRpIjoiYjNiMDQ4MmMtMDA0OS00NTVjLWExNzctYTk2NjViNzVmMmM3Iiwic2lkIjoiYzQxMGNkOTEtNjY5ZS00ZTY3LWIyZWYtN2RmMjM4NGMzZDU0In0.logk9sjxkcaIfRuVfVUGY7Ww4cPdYU3OqlG68DUjbow",
  "access_expires_at": "2026-10-28T16:56:34.382671499Z",
  "refresh_token": "7ZWrHsQ8dLJXC_RDqXG9rI4nUPYbqLF9I4e5zzTO0SI",
  "refresh_expires_at": "2026-10-29T04:41:34.382226926Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380635581260` → **200**

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
  "correlation_id": "482af3d0-7e74-4d4b-ab6b-1babf009c668"
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
  "session_id": "60ee247a-b692-488c-9f6d-da53643c4c87",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY1OTUsImlhdCI6MTc5MzIwNTY5NSwianRpIjoiZjIwOGY5ZjUtMzYwNC00OGY2LThhOWYtYzI0OTFmNTA3NzRjIiwic2lkIjoiNjBlZTI0N2EtYjY5Mi00ODhjLTlmNmQtZGE1MzY0M2M0Yzg3In0.F-G7toopYINcPNXzeFljgcvFSbIYAUgSZukaqo9bfIY",
  "access_expires_at": "2026-10-28T16:56:35.295546006Z",
  "refresh_token": "1umkQ-6oJwDAwW_eJuCySnDqfKGgbU41P_7072YDfqI",
  "refresh_expires_at": "2026-10-29T04:41:35.295074307Z",
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
  "changed_by": "6873b609-b860-49e4-8d57-f3e610bae089",
  "reason": "Sandbox clean-up",
  "changed_at": "2026-10-28T16:38:55.023974Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "2d750f67-3ff0-49b8-a5a4-6409e8068ad1",
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
  "changed_by": "6873b609-b860-49e4-8d57-f3e610bae089",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T16:41:35.73564094Z"
}
```

## The rider books the airport for 2026-10-28T19:41:35Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600725743",
  "device_ref": "sandbox-12588"
}
```

```json
{
  "challenge_id": "0bc05ed8-7c69-456d-8763-ba6dfa5b0524",
  "expires_at": "2026-10-28T16:46:35.959772555Z",
  "resend_available_at": "2026-10-28T16:41:36.959772555Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600725743` → **200**

```json
{
  "phone": "+48600725743",
  "audience": "CLIENT",
  "code": "241479",
  "sent_at": "2026-10-28T16:41:35.961710069Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0bc05ed8-7c69-456d-8763-ba6dfa5b0524",
  "code": "241479",
  "device_ref": "sandbox-12588"
}
```

```json
{
  "session_id": "fc813ee0-ebec-4a0f-92a2-5416cf1e257e",
  "subject": {
    "type": "CLIENT",
    "id": "0a371316-a1e8-4485-9629-2711922711e6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYTM3MTMxNi1hMWU4LTQ0ODUtOTYyOS0yNzExOTIyNzExZTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NTk2LCJpYXQiOjE3OTMyMDU2OTYsImp0aSI6ImI4ZWMwNTExLWQ0NzAtNDg3Zi04NGNkLTIyODk1YWNhMzUxNSIsInNpZCI6ImZjODEzZWUwLWViZWMtNGEwZi05MmEyLTU0MTZjZjFlMjU3ZSJ9.YTo2jLpup2C1iED8BDbOW9rYPcWr9hMixx-E3bGPyNA",
  "access_expires_at": "2026-10-28T16:56:36.196104785Z",
  "refresh_token": "cQdsEz7hmPPnYrSvvaC7ErQbMfBz0jYlkM7aDuq0sL4",
  "refresh_expires_at": "2026-11-27T16:41:36.195670076Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "71225ead-8ff9-43a3-8c23-d41206767538",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T19:41:35Z"
}
```

```json
{
  "id": "60736bd0-eb70-4ae4-8507-edc86a6de403",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:46:36.415202Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T19:41:35Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "e20fc3ad-dea1-4e5c-bd7d-f59b6338763c",
  "quote_id": "60736bd0-eb70-4ae4-8507-edc86a6de403",
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
  "pickup_at": "2026-10-28T19:41:35Z"
}
```

```json
{
  "id": "10d5b799-875b-47f8-8d3a-3a61f94bb1cb",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0a371316-a1e8-4485-9629-2711922711e6",
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
  "created_at": "2026-10-28T16:41:36.638762Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T19:41:35Z",
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
  "device_ref": "sandbox-23428"
}
```

```json
{
  "challenge_id": "ac72bc81-0a05-4676-9dd6-b7b8500d6623",
  "expires_at": "2026-10-28T16:46:36.867066065Z",
  "resend_available_at": "2026-10-28T16:41:37.867066065Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "039557",
  "sent_at": "2026-10-28T16:41:36.868825895Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ac72bc81-0a05-4676-9dd6-b7b8500d6623",
  "code": "039557",
  "device_ref": "sandbox-23428"
}
```

```json
{
  "session_id": "5fedc48e-d856-4625-837a-aa6c12b7e45b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjU5NywiaWF0IjoxNzkzMjA1Njk3LCJqdGkiOiI5MjkzZTcwMS05NDJmLTRiZmUtYTZkNC00YTAxMThiODI4YTUiLCJzaWQiOiI1ZmVkYzQ4ZS1kODU2LTQ2MjUtODM3YS1hYTZjMTJiN2U0NWIifQ.u1jT6p0FqhGe1MgYB2fJayy-BZJMydxgaMHeqbyNdjI",
  "access_expires_at": "2026-10-28T16:56:37.101300859Z",
  "refresh_token": "5ifxGTVpaFQ_MZEkea967Q-TcX7HKTEZXfg0x1HpR1I",
  "refresh_expires_at": "2026-11-27T16:41:37.100716905Z",
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
  "command_id": "e888b90b-408d-459b-a0a3-ec9b73fef854",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:41:37Z",
    "sequence": 1793205697516
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0907bf5f-8ad6-4ccd-8a72-01d86f80722b",
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
  "last_heartbeat_at": "2026-10-28T16:41:37.532357Z",
  "last_location_at": "2026-10-28T16:41:37.532357Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "10d5b799-875b-47f8-8d3a-3a61f94bb1cb",
      "short_number": 18,
      "pickup_at": "2026-10-28T19:41:35Z",
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

`POST /api/driver/v1/preorders/10d5b799-875b-47f8-8d3a-3a61f94bb1cb/reserve` → **200**

```json
{
  "command_id": "a2b15320-a213-4eb3-ac61-2a6898dac97a"
}
```

```json
{
  "id": "a77e68a8-b9b9-4932-9237-9745be8fdbd5",
  "state": "RESERVED",
  "order": {
    "order_id": "10d5b799-875b-47f8-8d3a-3a61f94bb1cb",
    "short_number": 18,
    "pickup_at": "2026-10-28T19:41:35Z",
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
  "reserved_at": "2026-10-28T16:41:37.967909Z",
  "confirm_from": "2026-10-28T19:11:35Z",
  "confirm_until": "2026-10-28T19:21:35Z",
  "drop_until": "2026-10-28T18:41:35Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "a77e68a8-b9b9-4932-9237-9745be8fdbd5",
      "state": "RESERVED",
      "order": {
        "order_id": "10d5b799-875b-47f8-8d3a-3a61f94bb1cb",
        "short_number": 18,
        "pickup_at": "2026-10-28T19:41:35Z",
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
      "reserved_at": "2026-10-28T16:41:37.967909Z",
      "confirm_from": "2026-10-28T19:11:35Z",
      "confirm_until": "2026-10-28T19:21:35Z",
      "drop_until": "2026-10-28T18:41:35Z"
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
      "id": "a77e68a8-b9b9-4932-9237-9745be8fdbd5",
      "state": "RESERVED",
      "order": {
        "order_id": "10d5b799-875b-47f8-8d3a-3a61f94bb1cb",
        "short_number": 18,
        "pickup_at": "2026-10-28T19:41:35Z",
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
      "reserved_at": "2026-10-28T16:41:37.967909Z",
      "confirm_from": "2026-10-28T19:11:35Z",
      "confirm_until": "2026-10-28T19:21:35Z",
      "drop_until": "2026-10-28T18:41:35Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/a77e68a8-b9b9-4932-9237-9745be8fdbd5/confirm` → **409**

```json
{
  "command_id": "c34ff908-ee81-4f0e-9d22-1d74c9f6bc1a"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/a77e68a8-b9b9-4932-9237-9745be8fdbd5/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6715c422-56b1-45df-b4fd-6290f0ba839c"
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
  "session_id": "9ff99990-eca7-4802-8477-296a1f6d357a",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY1OTksImlhdCI6MTc5MzIwNTY5OSwianRpIjoiMzAwYWViMTktZGE3Yi00N2U5LWIzNTEtNGQ1NDRjOTQzODE0Iiwic2lkIjoiOWZmOTk5OTAtZWNhNy00ODAyLTg0NzctMjk2YTFmNmQzNTdhIn0.9fLi40Oc_oNC1h77IWDmCsiwZbPjGYoDPuWJ2IOo_ug",
  "access_expires_at": "2026-10-28T16:56:39.078545352Z",
  "refresh_token": "nJle1EzfychnVkaQiuGugASdgwSj3NBXk2dfJKV6GZk",
  "refresh_expires_at": "2026-10-29T04:41:39.078150618Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/10d5b799-875b-47f8-8d3a-3a61f94bb1cb` → **200**

```json
{
  "id": "10d5b799-875b-47f8-8d3a-3a61f94bb1cb",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "0a371316-a1e8-4485-9629-2711922711e6",
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
  "created_at": "2026-10-28T16:41:36.638762Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T19:41:35Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "a77e68a8-b9b9-4932-9237-9745be8fdbd5",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T16:41:37.967909Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/10d5b799-875b-47f8-8d3a-3a61f94bb1cb/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T16:41:36.639598Z",
      "actor": {
        "type": "CLIENT",
        "id": "0a371316-a1e8-4485-9629-2711922711e6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "10d5b799-875b-47f8-8d3a-3a61f94bb1cb",
        "preorder": true,
        "quote_id": "60736bd0-eb70-4ae4-8507-edc86a6de403",
        "pickup_at": "2026-10-28T19:41:35Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "1d57bd18-3347-4bd0-99a6-aa8085646180"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T16:41:37.968772Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "10d5b799-875b-47f8-8d3a-3a61f94bb1cb",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "a77e68a8-b9b9-4932-9237-9745be8fdbd5"
      },
      "correlation_id": "af44712b-c3e2-4554-8ebb-537ccc65a45d"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 10d5b799-875b-47f8-8d3a-3a61f94bb1cb, reservation a77e68a8-b9b9-4932-9237-9745be8fdbd5.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-25254"
}
```

```json
{
  "challenge_id": "10406f60-1b71-4e9d-b10e-a2a01868eaaf",
  "expires_at": "2026-10-28T16:46:39.759783109Z",
  "resend_available_at": "2026-10-28T16:41:40.759783109Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "584837",
  "sent_at": "2026-10-28T16:41:39.761597736Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "10406f60-1b71-4e9d-b10e-a2a01868eaaf",
  "code": "584837",
  "device_ref": "sandbox-25254"
}
```

```json
{
  "session_id": "3f658ac1-16a1-469f-aee7-479b2446bd32",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjU5OSwiaWF0IjoxNzkzMjA1Njk5LCJqdGkiOiJjNTVmZGMzNi05YTI5LTQ2YTMtOWE2Mi02NWM2NTE3OTY2Y2IiLCJzaWQiOiIzZjY1OGFjMS0xNmExLTQ2OWYtYWVlNy00NzliMjQ0NmJkMzIifQ.s4-gcBDhXqAYYEsjjJllPGNkmd8NxvJQ_xdw22aowXk",
  "access_expires_at": "2026-10-28T16:56:39.992857994Z",
  "refresh_token": "GhhqDMusD83xGVel8cODYKjZm37lYF0qFbYh_r4LYug",
  "refresh_expires_at": "2026-11-27T16:41:39.992454346Z",
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
  "command_id": "dd308598-7ce6-442b-84ae-c30d49af8561",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:41:40Z",
    "sequence": 1793205700405
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6e47b443-9cd3-4cf5-ba00-39cb27c5deed",
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
  "last_heartbeat_at": "2026-10-28T16:41:40.421516Z",
  "last_location_at": "2026-10-28T16:41:40.421516Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670895180",
  "device_ref": "sandbox-6904"
}
```

```json
{
  "challenge_id": "a55f8119-a954-484f-ad38-b46ca237783b",
  "expires_at": "2026-10-28T16:46:40.636105529Z",
  "resend_available_at": "2026-10-28T16:41:41.636105529Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670895180` → **200**

```json
{
  "phone": "+380670895180",
  "audience": "CLIENT",
  "code": "986486",
  "sent_at": "2026-10-28T16:41:40.637919123Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a55f8119-a954-484f-ad38-b46ca237783b",
  "code": "986486",
  "device_ref": "sandbox-6904"
}
```

```json
{
  "session_id": "93489db8-76ff-4009-a2b5-7176aaa9170b",
  "subject": {
    "type": "CLIENT",
    "id": "de5c8d87-5737-4bca-b2a7-92d6a194504e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZTVjOGQ4Ny01NzM3LTRiY2EtYjJhNy05MmQ2YTE5NDUwNGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NjAwLCJpYXQiOjE3OTMyMDU3MDAsImp0aSI6ImFmNjdiYzc4LWQyZTctNDM2ZS04NjA3LTg0NjQ1NTU5YWM3MyIsInNpZCI6IjkzNDg5ZGI4LTc2ZmYtNDAwOS1hMmI1LTcxNzZhYWE5MTcwYiJ9.kCknMMk4bcVd73tf34Tg-GYXXt4q8phfwPQOE7eq4Tk",
  "access_expires_at": "2026-10-28T16:56:40.871989435Z",
  "refresh_token": "6ujZGuYemlRJNoAun9zCNgQnN88jNKHkBj_mTLaqA9s",
  "refresh_expires_at": "2026-11-27T16:41:40.871490928Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "45a7e8d7-a405-4d98-b0a5-f220579983eb",
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
  "id": "1f93ba4f-e210-4a87-aa97-77484053f743",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:46:41.095516Z",
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
  "command_id": "a12316d5-59d6-41c5-8d08-8feb96e3753d",
  "quote_id": "1f93ba4f-e210-4a87-aa97-77484053f743",
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
  "id": "0722dcfc-a048-4def-9e49-8ac28ac086fe",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "de5c8d87-5737-4bca-b2a7-92d6a194504e",
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
  "created_at": "2026-10-28T16:41:41.32127Z",
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
    "id": "7e78f3f9-291b-48f1-a054-503b77362cd3",
    "order_id": "0722dcfc-a048-4def-9e49-8ac28ac086fe",
    "expires_at": "2026-10-28T16:41:56.323808Z",
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

`POST /api/driver/v1/offers/7e78f3f9-291b-48f1-a054-503b77362cd3/accept` → **200**

```json
{
  "command_id": "720615c0-461a-4e5e-b3db-c5f096589e18"
}
```

```json
{
  "id": "421583a4-c2f5-4527-bf4b-7b01a656c6ff",
  "order_id": "0722dcfc-a048-4def-9e49-8ac28ac086fe",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f01aa850-896a-4066-94ca-fa4072fc5a25",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f01aa850-896a-4066-94ca-fa4072fc5a25",
  "order_id": "0722dcfc-a048-4def-9e49-8ac28ac086fe",
  "assignment_id": "421583a4-c2f5-4527-bf4b-7b01a656c6ff",
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

`POST /api/driver/v1/work-sessions/6e47b443-9cd3-4cf5-ba00-39cb27c5deed/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:41:42Z",
    "sequence": 1793205702173
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6e47b443-9cd3-4cf5-ba00-39cb27c5deed",
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
  "last_heartbeat_at": "2026-10-28T16:41:42.189795Z",
  "last_location_at": "2026-10-28T16:41:42.189795Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f01aa850-896a-4066-94ca-fa4072fc5a25",
  "order_id": "0722dcfc-a048-4def-9e49-8ac28ac086fe",
  "assignment_id": "421583a4-c2f5-4527-bf4b-7b01a656c6ff",
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

`POST /api/driver/v1/trips/f01aa850-896a-4066-94ca-fa4072fc5a25/arrive` → **200**

```json
{
  "command_id": "9c0e4032-1e83-438b-8bab-9ee534a97822",
  "expected_version": 0
}
```

```json
{
  "id": "f01aa850-896a-4066-94ca-fa4072fc5a25",
  "order_id": "0722dcfc-a048-4def-9e49-8ac28ac086fe",
  "assignment_id": "421583a4-c2f5-4527-bf4b-7b01a656c6ff",
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
  "arrived_at": "2026-10-28T16:41:42.611319Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f01aa850-896a-4066-94ca-fa4072fc5a25/start` → **200**

```json
{
  "command_id": "21332968-bf18-47a3-ace0-292ff3abb051",
  "expected_version": 1
}
```

```json
{
  "id": "f01aa850-896a-4066-94ca-fa4072fc5a25",
  "order_id": "0722dcfc-a048-4def-9e49-8ac28ac086fe",
  "assignment_id": "421583a4-c2f5-4527-bf4b-7b01a656c6ff",
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
  "arrived_at": "2026-10-28T16:41:42.611319Z",
  "started_at": "2026-10-28T16:41:42.830653Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/6e47b443-9cd3-4cf5-ba00-39cb27c5deed/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:41:43Z",
    "sequence": 1793205703479
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6e47b443-9cd3-4cf5-ba00-39cb27c5deed",
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
  "last_heartbeat_at": "2026-10-28T16:41:43.064575Z",
  "last_location_at": "2026-10-28T16:41:43.064575Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/f01aa850-896a-4066-94ca-fa4072fc5a25/complete` → **200**

```json
{
  "command_id": "ceffaec9-2270-4942-960f-c0e740731e33",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:41:43Z",
  "cash_received": true
}
```

```json
{
  "id": "f01aa850-896a-4066-94ca-fa4072fc5a25",
  "order_id": "0722dcfc-a048-4def-9e49-8ac28ac086fe",
  "assignment_id": "421583a4-c2f5-4527-bf4b-7b01a656c6ff",
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
  "arrived_at": "2026-10-28T16:41:42.611319Z",
  "started_at": "2026-10-28T16:41:42.830653Z",
  "completed_at": "2026-10-28T16:41:43.284011Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/0722dcfc-a048-4def-9e49-8ac28ac086fe/rating` → **200**

```json
{
  "command_id": "b728d513-1b51-4c7a-b226-31aa2689aea2",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "0722dcfc-a048-4def-9e49-8ac28ac086fe",
  "score": 5,
  "created_at": "2026-10-28T16:41:43.51614467Z"
}
```

`POST /api/driver/v1/orders/0722dcfc-a048-4def-9e49-8ac28ac086fe/rating` → **200**

```json
{
  "command_id": "7e8312c0-c475-43f2-bedd-97f702f48169",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "0722dcfc-a048-4def-9e49-8ac28ac086fe",
  "score": 4,
  "created_at": "2026-10-28T16:41:43.731850385Z"
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
  "session_id": "82009045-4ed4-4abe-9053-4f7f20629644",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY2MDQsImlhdCI6MTc5MzIwNTcwNCwianRpIjoiZjQyMDE3OTEtYmQ0ZC00ZDQ4LWFhODAtZDg5Yjc3NWYzYmMyIiwic2lkIjoiODIwMDkwNDUtNGVkNC00YWJlLTkwNTMtNGY3ZjIwNjI5NjQ0In0.Q78jYCERjPAlvfKXsPXXpnVPiiPSe3VYEDdA2XS5Kf4",
  "access_expires_at": "2026-10-28T16:56:44.419267941Z",
  "refresh_token": "Y_DDq59wI-ACfVFVbTE4aAagM3wPFpnOm3FKXlvSkWE",
  "refresh_expires_at": "2026-10-29T04:41:44.418861469Z",
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
  "session_id": "74829956-739a-4bfe-900a-eb782181c253",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY2MDQsImlhdCI6MTc5MzIwNTcwNCwianRpIjoiZTU5OGEwYmMtNmY5Yy00YzU1LWE5NWMtMDViOTBiMjAyMjY2Iiwic2lkIjoiNzQ4Mjk5NTYtNzM5YS00YmZlLTkwMGEtZWI3ODIxODFjMjUzIn0.FhWeKv7-X4u4MO3-oieBblSsm9m2vYvssY6zAMmRcdE",
  "access_expires_at": "2026-10-28T16:56:44.894449355Z",
  "refresh_token": "gdtwDmz_-ikV-yb0VXHE2rEI8hsPVMslOWN7Lt44pmg",
  "refresh_expires_at": "2026-10-29T04:41:44.894036243Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/0722dcfc-a048-4def-9e49-8ac28ac086fe/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "0722dcfc-a048-4def-9e49-8ac28ac086fe",
      "author_type": "RIDER",
      "author_id": "de5c8d87-5737-4bca-b2a7-92d6a194504e",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T16:41:43.516145Z"
    },
    {
      "order_id": "0722dcfc-a048-4def-9e49-8ac28ac086fe",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "de5c8d87-5737-4bca-b2a7-92d6a194504e",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T16:41:43.73185Z"
    }
  ]
}
```

Done: ratings for order 0722dcfc-a048-4def-9e49-8ac28ac086fe.

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
  "session_id": "40cb9a6d-10ce-4dc4-b8af-21ac20f90d5f",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY2MDUsImlhdCI6MTc5MzIwNTcwNSwianRpIjoiZWIwYzk0NjAtMDFlMy00ZWQ3LTkzNmMtMDQwZDVmZGY1M2YzIiwic2lkIjoiNDBjYjlhNmQtMTBjZS00ZGM0LWI4YWYtMjFhYzIwZjkwZDVmIn0.TqxBDfESKnQV87gzXXRnIk6rX3f19Dgqljmer9-Tt30",
  "access_expires_at": "2026-10-28T16:56:45.596254952Z",
  "refresh_token": "OO-nC1eGofPfwPEwOdvraKbH-oahHxHQtTxDHUvb_Vw",
  "refresh_expires_at": "2026-10-29T04:41:45.595603027Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "6312df43-825d-4a54-a5ee-d29f0c23268d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "96063230-26dd-41c6-acc6-098b5b3a7827",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:41:45.82119Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/96063230-26dd-41c6-acc6-098b5b3a7827` → **200**

```json
{
  "id": "96063230-26dd-41c6-acc6-098b5b3a7827",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:41:45.82119Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/96063230-26dd-41c6-acc6-098b5b3a7827` → **200**

```json
{
  "id": "96063230-26dd-41c6-acc6-098b5b3a7827",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T16:41:45.82119Z",
  "ready_at": "2026-10-28T16:41:46.193286Z",
  "expires_at": "2026-10-29T16:41:46.193286Z"
}
```

`GET /api/admin/v1/reports/exports/96063230-26dd-41c6-acc6-098b5b3a7827/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
total,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "8e477010-813c-43af-ba4b-8b93ed4b98dd",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "4882ee0e-14ff-407f-9ad5-60ffe6f27f71",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:41:47.511373Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/4882ee0e-14ff-407f-9ad5-60ffe6f27f71` → **200**

```json
{
  "id": "4882ee0e-14ff-407f-9ad5-60ffe6f27f71",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:41:47.511373Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/4882ee0e-14ff-407f-9ad5-60ffe6f27f71` → **200**

```json
{
  "id": "4882ee0e-14ff-407f-9ad5-60ffe6f27f71",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:41:47.511373Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/4882ee0e-14ff-407f-9ad5-60ffe6f27f71` → **200**

```json
{
  "id": "4882ee0e-14ff-407f-9ad5-60ffe6f27f71",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:41:47.511373Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/4882ee0e-14ff-407f-9ad5-60ffe6f27f71` → **200**

```json
{
  "id": "4882ee0e-14ff-407f-9ad5-60ffe6f27f71",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T16:41:47.511373Z",
  "ready_at": "2026-10-28T16:41:51.199967Z",
  "expires_at": "2026-10-29T16:41:51.199967Z"
}
```

`GET /api/admin/v1/reports/exports/4882ee0e-14ff-407f-9ad5-60ffe6f27f71/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/855f33fe-1b32-4120-bdd7-49e774d52200` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/855f33fe-1b32-4120-bdd7-49e774d52200",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "23a2722f-2588-44bf-a8ab-4bf47eeaf3f9"
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
  "device_ref": "sandbox-18007"
}
```

```json
{
  "challenge_id": "9a349f60-c2a5-4108-b8c7-f6ca3e382ec7",
  "expires_at": "2026-10-28T16:46:51.892102846Z",
  "resend_available_at": "2026-10-28T16:41:52.892102846Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "898046",
  "sent_at": "2026-10-28T16:41:51.893877764Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9a349f60-c2a5-4108-b8c7-f6ca3e382ec7",
  "code": "898046",
  "device_ref": "sandbox-18007"
}
```

```json
{
  "session_id": "353aefbb-9e08-4ff4-9d80-5aa61a8ccf74",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjYxMiwiaWF0IjoxNzkzMjA1NzEyLCJqdGkiOiI4YmZhYjM2NC04YTJlLTRmMzMtYWY4ZC1iOTk0YzIxYzAyNWMiLCJzaWQiOiIzNTNhZWZiYi05ZTA4LTRmZjQtOWQ4MC01YWE2MWE4Y2NmNzQifQ.OOMUdXjiCtdhif8kooWwQw70DEbXV3B4eBQaQbh9aHQ",
  "access_expires_at": "2026-10-28T16:56:52.194631899Z",
  "refresh_token": "Id4f7Xyooi6LElqOulWWE01Ct8ijvDoCdcIBbwla6wM",
  "refresh_expires_at": "2026-11-27T16:41:52.194152739Z",
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
  "command_id": "298bbca8-c7f5-4ed5-bd50-9e10d641a53a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:41:52Z",
    "sequence": 1793205712832
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7a8e4316-3fa2-46d7-9144-01a02f57ce37",
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
  "last_heartbeat_at": "2026-10-28T16:41:52.848851Z",
  "last_location_at": "2026-10-28T16:41:52.848851Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "011618d2-58d0-4331-8ef3-3fcedd5e88ed",
  "points": [
    {
      "sequence": 1793205715693,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T16:40:55Z"
    },
    {
      "sequence": 1793205715758,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T16:41:55Z"
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
  "session_id": "cb19d067-ae62-45d2-9290-bda29dcdfd5f",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY2MTUsImlhdCI6MTc5MzIwNTcxNSwianRpIjoiNjdlMWNlMTItOGE1ZC00OTM5LThmNDItNjUwNDVhM2U1MTU3Iiwic2lkIjoiY2IxOWQwNjctYWU2Mi00NWQyLTkyOTAtYmRhMjlkY2RmZDVmIn0.uPeXmddBxRXP2PjgF0e_Yx36qT9Das2j1BRQA5SgSos",
  "access_expires_at": "2026-10-28T16:56:55.576806248Z",
  "refresh_token": "XswRAgQesW7_ULTyM4YIaTBhuOsjZCZd1y0cJMlMjp4",
  "refresh_expires_at": "2026-10-29T04:41:55.57634137Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "48203da7-6fb0-4222-8ac0-f483bddc9fba",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T16:41:55Z",
        "track_point_id": "0bfc0d50-a29f-4547-a5d3-c7248dbd8dd0",
        "work_session_id": "7a8e4316-3fa2-46d7-9144-01a02f57ce37"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T16:41:55Z",
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

`POST /api/admin/v1/driver-risk-flags/48203da7-6fb0-4222-8ac0-f483bddc9fba/confirm` → **200**

```json
{
  "command_id": "5ec20517-8d50-4321-906a-9b9d12b5e7fa",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "48203da7-6fb0-4222-8ac0-f483bddc9fba",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T16:41:55Z",
    "track_point_id": "0bfc0d50-a29f-4547-a5d3-c7248dbd8dd0",
    "work_session_id": "7a8e4316-3fa2-46d7-9144-01a02f57ce37"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T16:41:55Z",
  "reason": null,
  "reviewed_by": "6873b609-b860-49e4-8d57-f3e610bae089",
  "reviewed_at": "2026-10-28T16:41:56.260924Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/48203da7-6fb0-4222-8ac0-f483bddc9fba/dismiss` → **409**

```json
{
  "command_id": "a762c3f2-0c34-4170-92d5-e4df4a0a7559",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/48203da7-6fb0-4222-8ac0-f483bddc9fba/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "163fd7b2-02c8-4108-80cf-961ef957c931"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "c7f6cbec-1c1d-4510-8e22-b25646636206",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "468c0ab1-1739-4e5f-a9d1-2ed7c93ba53c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "6873b609-b860-49e4-8d57-f3e610bae089",
  "raised_at": "2026-10-28T16:41:56.714773Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/468c0ab1-1739-4e5f-a9d1-2ed7c93ba53c/dismiss` → **200**

```json
{
  "command_id": "73e20c25-b65e-4c40-aacd-e774457f050c",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "468c0ab1-1739-4e5f-a9d1-2ed7c93ba53c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "6873b609-b860-49e4-8d57-f3e610bae089",
  "raised_at": "2026-10-28T16:41:56.714773Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "6873b609-b860-49e4-8d57-f3e610bae089",
  "reviewed_at": "2026-10-28T16:41:56.950031Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "6b450ef4-b102-462f-97b9-98d3eacea956",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "48203da7-6fb0-4222-8ac0-f483bddc9fba"
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
      "actor_id": "6873b609-b860-49e4-8d57-f3e610bae089",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T16:41:57.18062Z"
    }
  ]
}
```

Done: flag 48203da7-6fb0-4222-8ac0-f483bddc9fba confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "7fbf98a7-8d25-425f-8a25-c22064b8894b",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY2MTcsImlhdCI6MTc5MzIwNTcxNywianRpIjoiYTU1ODMwMGEtNWY2Yi00NGRiLWE5MTgtMjBhOWE4MTEyMGVlIiwic2lkIjoiN2ZiZjk4YTctOGQyNS00MjVmLThhMjUtYzIyMDY0Yjg4OTRiIn0.4M_ET8aaBV46QlA-q0b9y_qH4dnpG0OvfDeqiDydjn8",
  "access_expires_at": "2026-10-28T16:56:57.869022724Z",
  "refresh_token": "nSJbqZfZKF1K4pKWllhSlG16vdkrV1nayX8PLQSmN9A",
  "refresh_expires_at": "2026-10-29T04:41:57.868577124Z",
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
      "actor_id": "6873b609-b860-49e4-8d57-f3e610bae089",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T16:41:57.18062Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "a7cb7a55-df80-423c-93fa-2aa5d23a3dfa",
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
  "session_id": "7a8e4316-3fa2-46d7-9144-01a02f57ce37",
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
  "last_heartbeat_at": "2026-10-28T16:41:52.848851Z",
  "last_location_at": "2026-10-28T16:41:52.848851Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7a8e4316-3fa2-46d7-9144-01a02f57ce37/close` → **200**

```json
{
  "command_id": "e626e1fb-bfa4-42da-bfa9-284495943cb9",
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
  "session_id": "1c882b1e-d8ae-48f9-bef5-4eda5427071d",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY2MTksImlhdCI6MTc5MzIwNTcxOSwianRpIjoiZmRmNDQ0YjEtNDUzOS00NjY0LThjNTItM2NmOTk5MTFmMTdhIiwic2lkIjoiMWM4ODJiMWUtZDhhZS00OGY5LWJlZjUtNGVkYTU0MjcwNzFkIn0.hoF3rbWyWMVa6shOCd8-nmkE8BfnVGEwFNoOzUzR9Lo",
  "access_expires_at": "2026-10-28T16:56:59.231682079Z",
  "refresh_token": "Xeq8LjgFW27-729FymUm-YwbvOcovvKT_FvqTg5v4_I",
  "refresh_expires_at": "2026-10-29T04:41:59.231242167Z",
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
  "command_id": "7a557cb3-e114-46c0-8c4b-c96d669bad61",
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
  "changed_by": "6873b609-b860-49e4-8d57-f3e610bae089",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T16:41:59.668142Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "7a557cb3-e114-46c0-8c4b-c96d669bad61",
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
  "changed_by": "6873b609-b860-49e4-8d57-f3e610bae089",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T16:41:59.668142Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48428953566",
  "device_ref": "sandbox-25250"
}
```

```json
{
  "challenge_id": "158f9d6f-1834-4f6d-bb0f-2b0ed97b2ee7",
  "expires_at": "2026-10-28T16:47:00.125307269Z",
  "resend_available_at": "2026-10-28T16:42:01.125307269Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48428953566` → **200**

```json
{
  "phone": "+48428953566",
  "audience": "CLIENT",
  "code": "809205",
  "sent_at": "2026-10-28T16:42:00.127231979Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "158f9d6f-1834-4f6d-bb0f-2b0ed97b2ee7",
  "code": "809205",
  "device_ref": "sandbox-25250"
}
```

```json
{
  "session_id": "102ec2d7-35d7-4896-8169-09f07dbca767",
  "subject": {
    "type": "CLIENT",
    "id": "ed2cfc7f-dda9-4f76-9150-9e37f52014cb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZDJjZmM3Zi1kZGE5LTRmNzYtOTE1MC05ZTM3ZjUyMDE0Y2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NjIwLCJpYXQiOjE3OTMyMDU3MjAsImp0aSI6IjIwNDA1Njc5LTc0NDQtNGU4My04MGJkLTQ2NjVkNTFjM2UzZCIsInNpZCI6IjEwMmVjMmQ3LTM1ZDctNDg5Ni04MTY5LTA5ZjA3ZGJjYTc2NyJ9.BnpCHKK3FmguDkdQPwYP8RXsN3S17WvfyLtn4UBdlSI",
  "access_expires_at": "2026-10-28T16:57:00.360748865Z",
  "refresh_token": "bSaOE6JbkOhOGkleoDf-31wP07UDlkaOUUTkzyUlq8M",
  "refresh_expires_at": "2026-11-27T16:42:00.360207583Z",
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
  "correlation_id": "b7821093-b210-4553-93e2-5c8566593a64"
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
  "device_ref": "sandbox-9071"
}
```

```json
{
  "challenge_id": "8c9027d7-01aa-43d7-b679-2c1a72a66ce0",
  "expires_at": "2026-10-28T16:47:00.996100064Z",
  "resend_available_at": "2026-10-28T16:42:01.996100064Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "327242",
  "sent_at": "2026-10-28T16:42:00.997757899Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8c9027d7-01aa-43d7-b679-2c1a72a66ce0",
  "code": "327242",
  "device_ref": "sandbox-9071"
}
```

```json
{
  "session_id": "1ef4c77f-05d9-408c-ba52-4259400f118a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjYyMSwiaWF0IjoxNzkzMjA1NzIxLCJqdGkiOiI3NzNmMDI0NC1iZmY5LTQ1OGQtOGNjMy1lYzI4ZWY4YmY4YmEiLCJzaWQiOiIxZWY0Yzc3Zi0wNWQ5LTQwOGMtYmE1Mi00MjU5NDAwZjExOGEifQ.13C_EymO79jAAmlEcE3TODwEShUxyjnOjxRbYd_IG9s",
  "access_expires_at": "2026-10-28T16:57:01.359404724Z",
  "refresh_token": "_J2XtSL-9wOApprUvvXrhQTGEES7b_ukVtmLZoJKeKg",
  "refresh_expires_at": "2026-11-27T16:42:01.358978028Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0907bf5f-8ad6-4ccd-8a72-01d86f80722b",
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
  "last_heartbeat_at": "2026-10-28T16:41:37.532357Z",
  "last_location_at": "2026-10-28T16:41:37.532357Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0907bf5f-8ad6-4ccd-8a72-01d86f80722b/handover` → **200**

```json
{
  "command_id": "caf30d9f-a7b2-4100-9318-1bb3e3a76ef7",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0907bf5f-8ad6-4ccd-8a72-01d86f80722b",
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
  "last_heartbeat_at": "2026-10-28T16:41:37.532357Z",
  "last_location_at": "2026-10-28T16:41:37.532357Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0907bf5f-8ad6-4ccd-8a72-01d86f80722b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:42:02Z",
    "sequence": 1793205722102
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0907bf5f-8ad6-4ccd-8a72-01d86f80722b",
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
  "last_heartbeat_at": "2026-10-28T16:42:02.11934Z",
  "last_location_at": "2026-10-28T16:42:02.11934Z",
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
  "session_id": "0907bf5f-8ad6-4ccd-8a72-01d86f80722b",
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
  "last_heartbeat_at": "2026-10-28T16:42:02.11934Z",
  "last_location_at": "2026-10-28T16:42:02.11934Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0907bf5f-8ad6-4ccd-8a72-01d86f80722b/close` → **200**

```json
{
  "command_id": "fb228872-7f48-4b59-b4bc-3f9997b498d2",
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
  "correlation_id": "76d7db2a-1d14-4993-8da2-031bcc6c5695"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675128836",
  "device_ref": "sandbox-25396"
}
```

```json
{
  "challenge_id": "e089c7b6-a53d-4380-8fc2-04a56cd94291",
  "expires_at": "2026-10-28T16:47:03.203903243Z",
  "resend_available_at": "2026-10-28T16:42:04.203903243Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675128836` → **200**

```json
{
  "phone": "+380675128836",
  "audience": "CLIENT",
  "code": "767243",
  "sent_at": "2026-10-28T16:42:03.20565073Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e089c7b6-a53d-4380-8fc2-04a56cd94291",
  "code": "767243",
  "device_ref": "sandbox-25396"
}
```

```json
{
  "session_id": "5d3c2507-2a4d-4933-bdbf-b3e2f917af42",
  "subject": {
    "type": "CLIENT",
    "id": "3c34fa10-0afb-4539-9761-0a40b69eba26"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzM0ZmExMC0wYWZiLTQ1MzktOTc2MS0wYTQwYjY5ZWJhMjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NjIzLCJpYXQiOjE3OTMyMDU3MjMsImp0aSI6ImU0ODg2NGEwLTM0ZTYtNGZjNC1hOTE4LTkwYTgxYWEyN2UyMiIsInNpZCI6IjVkM2MyNTA3LTJhNGQtNDkzMy1iZGJmLWIzZTJmOTE3YWY0MiJ9.bKzHT_Wib4w2qPN188sDQxnOwKLZtM7qQK3s_RrTxaI",
  "access_expires_at": "2026-10-28T16:57:03.433608008Z",
  "refresh_token": "8BqCIc90vUyQ9uaQ_QU7XacHD403xerCjizK9wvZvAE",
  "refresh_expires_at": "2026-11-27T16:42:03.433219793Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "00018889-8b0a-4b0c-9bea-dcd4b83338a8",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "c4894996-5da4-46a1-9219-1316aebddb72",
  "upload_path": "/api/rider/v1/uploads/c4894996-5da4-46a1-9219-1316aebddb72",
  "expires_at": "2026-10-28T16:57:03.677090727Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/c4894996-5da4-46a1-9219-1316aebddb72` → **200**

```json
{
  "file_id": "c4894996-5da4-46a1-9219-1316aebddb72",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "e675b051-eb03-4991-9b49-520328aadac8",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "c4894996-5da4-46a1-9219-1316aebddb72"
  ]
}
```

```json
{
  "id": "3614f9bc-003e-4e90-8f66-1db4ceef3bc1",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3c34fa10-0afb-4539-9761-0a40b69eba26",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T16:42:03.926465Z",
  "updated_at": "2026-10-28T16:42:03.926465Z",
  "messages": [
    {
      "id": "eae83d52-e227-462f-8641-74242e903c93",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3c34fa10-0afb-4539-9761-0a40b69eba26",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:42:03.927582Z",
      "attachments": [
        {
          "file_id": "c4894996-5da4-46a1-9219-1316aebddb72",
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
  "session_id": "504450e7-48e4-4769-8057-f69a423a6fe3",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY2MjQsImlhdCI6MTc5MzIwNTcyNCwianRpIjoiZjgwOWM2ZGMtOWQzMi00NzQ0LWFlYTAtNTVjN2U4MzRmOGI4Iiwic2lkIjoiNTA0NDUwZTctNDhlNC00NzY5LTgwNTctZjY5YTQyM2E2ZmUzIn0.EAfsKD54hKYNyxtn3oni0Qmv1Z1PearDuCc_a7frMRE",
  "access_expires_at": "2026-10-28T16:57:04.421701388Z",
  "refresh_token": "zimt-UDTxxEVgY0iIIO73AM_vrSXWJ7lmBsNRK1iETM",
  "refresh_expires_at": "2026-10-29T04:42:04.421301086Z",
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
  "session_id": "ebfa9ac0-1d88-43f4-86de-35e47b58f63f",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY2MjQsImlhdCI6MTc5MzIwNTcyNCwianRpIjoiZDM0YTJmMGQtMzBhNi00N2Q0LThkMTMtOTAxZmUzYzM4YjVjIiwic2lkIjoiZWJmYTlhYzAtMWQ4OC00M2Y0LTg2ZGUtMzVlNDdiNThmNjNmIn0.uu0eRU7JPeK-1vxfEvnGAUSbRdRtPyb_yr4by98NFwI",
  "access_expires_at": "2026-10-28T16:57:04.888219814Z",
  "refresh_token": "rgkYe4mtAL-ELwavjvjaerZwThL6WkBuUgpWUdzsXkQ",
  "refresh_expires_at": "2026-10-29T04:42:04.887564393Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/3614f9bc-003e-4e90-8f66-1db4ceef3bc1/attachments/c4894996-5da4-46a1-9219-1316aebddb72` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "7a83d392-5565-4f85-ae53-918d2ef63040",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "004d2720-1092-42bf-a763-77aa94688289",
  "upload_path": "/api/operator/v1/uploads/004d2720-1092-42bf-a763-77aa94688289",
  "expires_at": "2026-10-28T16:57:05.137235207Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/004d2720-1092-42bf-a763-77aa94688289` → **200**

```json
{
  "file_id": "004d2720-1092-42bf-a763-77aa94688289",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/3614f9bc-003e-4e90-8f66-1db4ceef3bc1` → **200**

```json
{
  "id": "3614f9bc-003e-4e90-8f66-1db4ceef3bc1",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3c34fa10-0afb-4539-9761-0a40b69eba26",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T16:42:03.926465Z",
  "updated_at": "2026-10-28T16:42:03.926465Z",
  "messages": [
    {
      "id": "eae83d52-e227-462f-8641-74242e903c93",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3c34fa10-0afb-4539-9761-0a40b69eba26",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:42:03.927582Z",
      "attachments": [
        {
          "file_id": "c4894996-5da4-46a1-9219-1316aebddb72",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/3614f9bc-003e-4e90-8f66-1db4ceef3bc1/comments` → **200**

```json
{
  "command_id": "473c8bfb-72e1-422d-9795-02a293682592",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "004d2720-1092-42bf-a763-77aa94688289"
  ]
}
```

```json
{
  "id": "3614f9bc-003e-4e90-8f66-1db4ceef3bc1",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3c34fa10-0afb-4539-9761-0a40b69eba26",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T16:42:03.926465Z",
  "updated_at": "2026-10-28T16:42:05.604225Z",
  "messages": [
    {
      "id": "eae83d52-e227-462f-8641-74242e903c93",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3c34fa10-0afb-4539-9761-0a40b69eba26",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:42:03.927582Z",
      "attachments": [
        {
          "file_id": "c4894996-5da4-46a1-9219-1316aebddb72",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "41bbdaf6-d781-4e16-ac22-ce25383d04c1",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "6873b609-b860-49e4-8d57-f3e610bae089",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T16:42:05.603919Z",
      "attachments": [
        {
          "file_id": "004d2720-1092-42bf-a763-77aa94688289",
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

`GET /api/rider/v1/support/cases/3614f9bc-003e-4e90-8f66-1db4ceef3bc1` → **200**

```json
{
  "id": "3614f9bc-003e-4e90-8f66-1db4ceef3bc1",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3c34fa10-0afb-4539-9761-0a40b69eba26",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T16:42:03.926465Z",
  "updated_at": "2026-10-28T16:42:05.604225Z",
  "messages": [
    {
      "id": "eae83d52-e227-462f-8641-74242e903c93",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3c34fa10-0afb-4539-9761-0a40b69eba26",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:42:03.927582Z",
      "attachments": [
        {
          "file_id": "c4894996-5da4-46a1-9219-1316aebddb72",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "41bbdaf6-d781-4e16-ac22-ce25383d04c1",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T16:42:05.603919Z",
      "attachments": [
        {
          "file_id": "004d2720-1092-42bf-a763-77aa94688289",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/3614f9bc-003e-4e90-8f66-1db4ceef3bc1/attachments/004d2720-1092-42bf-a763-77aa94688289` → **200**

Done: support case 3614f9bc-003e-4e90-8f66-1db4ceef3bc1, rider attachment c4894996-5da4-46a1-9219-1316aebddb72, operator attachment 004d2720-1092-42bf-a763-77aa94688289.

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
  "session_id": "73f14a72-3fbb-421c-ac67-8b15a9ba6912",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY2MjYsImlhdCI6MTc5MzIwNTcyNiwianRpIjoiYmE3ZDEzZDEtOGNiNy00ZjFmLWIwNDYtYjYwMDNiMWMxYmRlIiwic2lkIjoiNzNmMTRhNzItM2ZiYi00MjFjLWFjNjctOGIxNWE5YmE2OTEyIn0.5Lr0eCilIyDfZStudDTi1DhFgawnFg-bQuacItDhVyE",
  "access_expires_at": "2026-10-28T16:57:06.344671412Z",
  "refresh_token": "x_cYyX8ULiDHXPMznstcxaN0nt4WVZQgeNR7-wD3lDM",
  "refresh_expires_at": "2026-10-29T04:42:06.344259112Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-28097"
}
```

```json
{
  "challenge_id": "aad7af53-4202-4d30-b67a-67d2a7113905",
  "expires_at": "2026-10-28T16:47:06.555843409Z",
  "resend_available_at": "2026-10-28T16:42:07.555843409Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "433776",
  "sent_at": "2026-10-28T16:42:06.557613335Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aad7af53-4202-4d30-b67a-67d2a7113905",
  "code": "433776",
  "device_ref": "sandbox-28097"
}
```

```json
{
  "session_id": "8a0252d1-a0ac-4fc8-af74-7e564546b738",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjYyNiwiaWF0IjoxNzkzMjA1NzI2LCJqdGkiOiI4MWYwYTMwZi1lMTVkLTRkYmEtOTI4Zi1mYTcwM2NhY2YyZDciLCJzaWQiOiI4YTAyNTJkMS1hMGFjLTRmYzgtYWY3NC03ZTU2NDU0NmI3MzgifQ.lHoHx4BlGmxbW2Oi_Ie_s2RtSE7Whmrn8g0cbi6Nl0g",
  "access_expires_at": "2026-10-28T16:57:06.794491014Z",
  "refresh_token": "VLlLAfpGyfEj3A14iUw0ZkIHVq3AGwliDAO4tkqObng",
  "refresh_expires_at": "2026-11-27T16:42:06.79408332Z",
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
      "actor_id": "6873b609-b860-49e4-8d57-f3e610bae089",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T16:41:57.18062Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "6873b609-b860-49e4-8d57-f3e610bae089",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T16:41:58.315032Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "b31d4484-6d65-476b-bc1e-6f642b1377f1",
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
  "device_ref": "sandbox-6797"
}
```

```json
{
  "challenge_id": "8d0b3b25-91e9-4d94-9db5-aad0d029f30c",
  "expires_at": "2026-10-28T16:47:07.682711977Z",
  "resend_available_at": "2026-10-28T16:42:08.682711977Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "881187",
  "sent_at": "2026-10-28T16:42:07.684246985Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8d0b3b25-91e9-4d94-9db5-aad0d029f30c",
  "code": "881187",
  "device_ref": "sandbox-6797"
}
```

```json
{
  "session_id": "4585eadb-4fb7-401d-a098-5d1dc082ae53",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjYyNywiaWF0IjoxNzkzMjA1NzI3LCJqdGkiOiI3YmE0NWEzOS1jOWM0LTQ5YWItOTZlYy04YTE5OGRkMjQzMGIiLCJzaWQiOiI0NTg1ZWFkYi00ZmI3LTQwMWQtYTA5OC01ZDFkYzA4MmFlNTMifQ.X4cWiDn7dTOIX4NzeIFya7wVs2zbZf4FEWW-FhSr0d8",
  "access_expires_at": "2026-10-28T16:57:07.923028057Z",
  "refresh_token": "bxVvtzD0HlLdYJbkyPUXULHtXnE5az7Ejem5lPpRAmE",
  "refresh_expires_at": "2026-11-27T16:42:07.922566078Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6e47b443-9cd3-4cf5-ba00-39cb27c5deed",
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
  "last_heartbeat_at": "2026-10-28T16:41:43.064575Z",
  "last_location_at": "2026-10-28T16:41:43.064575Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6e47b443-9cd3-4cf5-ba00-39cb27c5deed/handover` → **200**

```json
{
  "command_id": "ba51f329-4d2a-4b1d-ba63-fd47af80ee23",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6e47b443-9cd3-4cf5-ba00-39cb27c5deed",
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
  "last_heartbeat_at": "2026-10-28T16:41:43.064575Z",
  "last_location_at": "2026-10-28T16:41:43.064575Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6e47b443-9cd3-4cf5-ba00-39cb27c5deed/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:42:08Z",
    "sequence": 1793205728596
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6e47b443-9cd3-4cf5-ba00-39cb27c5deed",
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
  "last_heartbeat_at": "2026-10-28T16:42:08.613002Z",
  "last_location_at": "2026-10-28T16:42:08.613002Z",
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
  "command_id": "420e3533-153e-4bb1-a66c-ce997ba0b56d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:42:09Z",
    "sequence": 1793205729381
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2ebc51da-a440-4c8f-9e68-555820d05c8f",
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
  "last_heartbeat_at": "2026-10-28T16:42:09.054321Z",
  "last_location_at": "2026-10-28T16:42:09.054321Z",
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
  "session_id": "fa333a51-6e70-4e50-a435-68bcdae828d2",
  "subject": {
    "type": "STAFF",
    "id": "6873b609-b860-49e4-8d57-f3e610bae089"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODczYjYwOS1iODYwLTQ5ZTQtOGQ1Ny1mM2U2MTBiYWUwODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY2MjksImlhdCI6MTc5MzIwNTcyOSwianRpIjoiOWI2ZDZiZDctNzc5YS00MTAzLWFlODMtOGYyYzdjM2Y4NDBmIiwic2lkIjoiZmEzMzNhNTEtNmU3MC00ZTUwLWE0MzUtNjhiY2RhZTgyOGQyIn0.Ct3pITBZp9GO4TFIfISzXhs3fAFiVLwm20Baj-clAlw",
  "access_expires_at": "2026-10-28T16:57:09.536255985Z",
  "refresh_token": "X6gxatdR6MK6_EnjU51ipT0SrqZZLbVoUA3l766zFg4",
  "refresh_expires_at": "2026-10-29T04:42:09.535836013Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "205ee599-36b3-4a82-a504-6e1b946ae1a3",
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
  "id": "134b4b45-6e80-4a2c-9d8d-bae6650bcc3a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:47:09.755106Z",
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
  "command_id": "3baaa312-ea77-4231-a675-75b42d9f5b68",
  "quote_id": "134b4b45-6e80-4a2c-9d8d-bae6650bcc3a",
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
  "id": "30375ada-4f67-4ee8-ad40-e231e7c00555",
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
  "created_at": "2026-10-28T16:42:09.984717Z",
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
    "id": "5bb0075b-d2dd-40a3-9b8b-029506dcfb47",
    "order_id": "30375ada-4f67-4ee8-ad40-e231e7c00555",
    "expires_at": "2026-10-28T16:42:24.988299Z",
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

`POST /api/driver/v1/offers/5bb0075b-d2dd-40a3-9b8b-029506dcfb47/accept` → **200**

```json
{
  "command_id": "8e4bd6d8-3378-469b-95d6-60683f5812e5"
}
```

```json
{
  "id": "801d940b-73db-41ed-a197-2f357ed93741",
  "order_id": "30375ada-4f67-4ee8-ad40-e231e7c00555",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bfd987a3-3c9a-43ed-998f-937a41ac495b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bfd987a3-3c9a-43ed-998f-937a41ac495b",
  "order_id": "30375ada-4f67-4ee8-ad40-e231e7c00555",
  "assignment_id": "801d940b-73db-41ed-a197-2f357ed93741",
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

`POST /api/driver/v1/work-sessions/2ebc51da-a440-4c8f-9e68-555820d05c8f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:42:11Z",
    "sequence": 1793205731106
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2ebc51da-a440-4c8f-9e68-555820d05c8f",
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
  "last_heartbeat_at": "2026-10-28T16:42:11.122496Z",
  "last_location_at": "2026-10-28T16:42:11.122496Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/bfd987a3-3c9a-43ed-998f-937a41ac495b/arrive` → **200**

```json
{
  "command_id": "8d460a3d-27a9-4680-8b97-fde6db109d1a",
  "expected_version": 0
}
```

```json
{
  "id": "bfd987a3-3c9a-43ed-998f-937a41ac495b",
  "order_id": "30375ada-4f67-4ee8-ad40-e231e7c00555",
  "assignment_id": "801d940b-73db-41ed-a197-2f357ed93741",
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
  "arrived_at": "2026-10-28T16:42:11.348764Z",
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

`POST /api/driver/v1/trips/bfd987a3-3c9a-43ed-998f-937a41ac495b/start` → **200**

```json
{
  "command_id": "171deb7e-24f1-4c59-9ef5-bf653ba1453f",
  "expected_version": 1
}
```

```json
{
  "id": "bfd987a3-3c9a-43ed-998f-937a41ac495b",
  "order_id": "30375ada-4f67-4ee8-ad40-e231e7c00555",
  "assignment_id": "801d940b-73db-41ed-a197-2f357ed93741",
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
  "arrived_at": "2026-10-28T16:42:11.348764Z",
  "started_at": "2026-10-28T16:42:11.577375Z",
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

`POST /api/driver/v1/trips/bfd987a3-3c9a-43ed-998f-937a41ac495b/complete` → **200**

```json
{
  "command_id": "9b4401f3-11a9-4fb3-a446-b91d4a593239",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:42:11Z",
  "cash_received": true
}
```

```json
{
  "id": "bfd987a3-3c9a-43ed-998f-937a41ac495b",
  "order_id": "30375ada-4f67-4ee8-ad40-e231e7c00555",
  "assignment_id": "801d940b-73db-41ed-a197-2f357ed93741",
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
  "arrived_at": "2026-10-28T16:42:11.348764Z",
  "started_at": "2026-10-28T16:42:11.577375Z",
  "completed_at": "2026-10-28T16:42:11.812507Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/30375ada-4f67-4ee8-ad40-e231e7c00555` → **200**

```json
{
  "id": "30375ada-4f67-4ee8-ad40-e231e7c00555",
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
    "id": "801d940b-73db-41ed-a197-2f357ed93741",
    "order_id": "30375ada-4f67-4ee8-ad40-e231e7c00555",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "bfd987a3-3c9a-43ed-998f-937a41ac495b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:42:09.984717Z",
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
  "session_id": "6e47b443-9cd3-4cf5-ba00-39cb27c5deed",
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
  "last_heartbeat_at": "2026-10-28T16:42:08.613002Z",
  "last_location_at": "2026-10-28T16:42:08.613002Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6e47b443-9cd3-4cf5-ba00-39cb27c5deed/close` → **200**

```json
{
  "command_id": "64a1c9c5-e53e-4946-9127-6889e7ed7dbe",
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
  "session_id": "2ebc51da-a440-4c8f-9e68-555820d05c8f",
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
  "last_heartbeat_at": "2026-10-28T16:42:11.122496Z",
  "last_location_at": "2026-10-28T16:42:11.122496Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2ebc51da-a440-4c8f-9e68-555820d05c8f/close` → **200**

```json
{
  "command_id": "4e828f8c-3b35-4aa5-98ef-392cac3346a0",
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

Done: terminal order 30375ada-4f67-4ee8-ad40-e231e7c00555 by Andrii (5a000000-0000-4000-8000-000000000403).
