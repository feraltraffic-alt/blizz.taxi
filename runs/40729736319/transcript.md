# Sandbox transcript (2026-10-28T16:50:26Z, 6284384)

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
  "correlation_id": "8bc83467-62d2-49b5-87e8-0ab0fa6e2905"
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
  "session_id": "32b64a87-f2ea-4436-9cfa-6d09c8376799",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcxMzQsImlhdCI6MTc5MzIwNjIzNCwianRpIjoiMjU4NWUwM2YtNzdhYS00ZmUyLWEyMGMtYjI2NWQyODRkMTkzIiwic2lkIjoiMzJiNjRhODctZjJlYS00NDM2LTljZmEtNmQwOWM4Mzc2Nzk5In0.QsmMF9t6OY5qCJQr-d7drV_Eh1NzbMSvgG0JUOMKJkg",
  "access_expires_at": "2026-10-28T17:05:34.937742449Z",
  "refresh_token": "6CV71azG3--gao4DRLDKuRrC5gw9kbjqf3FPFnhsVIo",
  "refresh_expires_at": "2026-10-29T04:50:34.935215916Z",
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
  "session_id": "ad22ff0b-180a-4411-adfc-66b7466d7a35",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcxMzYsImlhdCI6MTc5MzIwNjIzNiwianRpIjoiYzFlM2I3MWUtNzJjMS00MTBhLWIzNmMtMTNmZWRhMGMyYjdlIiwic2lkIjoiYWQyMmZmMGItMTgwYS00NDExLWFkZmMtNjZiNzQ2NmQ3YTM1In0.f1u2reqBNSt_UqKp-ZV9n_7j725s22nLA2lnppv1vzg",
  "access_expires_at": "2026-10-28T17:05:36.580857937Z",
  "refresh_token": "f3TdrdEPwweJyh_BGscZPH6wDp_fq5L1ptzFc6NAQk4",
  "refresh_expires_at": "2026-10-29T04:50:36.579818533Z",
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
  "command_id": "6c5ec3e1-9279-4373-9c4f-f5580d5a6f9b",
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
  "changed_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
  "reason": "Sandbox: force update",
  "changed_at": "2026-10-28T16:50:37.19629787Z"
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
  "device_ref": "sandbox-191"
}
```

```json
{
  "challenge_id": "76c0705b-f4e5-4b20-88cc-59d0cd8abea7",
  "expires_at": "2026-10-28T16:55:37.772309157Z",
  "resend_available_at": "2026-10-28T16:50:38.772309157Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380990000001` → **200**

```json
{
  "phone": "+380990000001",
  "audience": "DRIVER",
  "code": "412700",
  "sent_at": "2026-10-28T16:50:37.780891872Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "76c0705b-f4e5-4b20-88cc-59d0cd8abea7",
  "code": "412700",
  "device_ref": "sandbox-191"
}
```

```json
{
  "session_id": "75ad63a1-90a5-4fd7-8f45-cbd8081e2117",
  "subject": {
    "type": "DRIVER",
    "id": "08013a0f-662f-489f-a958-78793554eeba"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODAxM2EwZi02NjJmLTQ4OWYtYTk1OC03ODc5MzU1NGVlYmEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNzEzOCwiaWF0IjoxNzkzMjA2MjM4LCJqdGkiOiIzZjgxYjQxMy02OTFjLTRlNDYtODAyYy1mYTQzZDUzZGM4N2QiLCJzaWQiOiI3NWFkNjNhMS05MGE1LTRmZDctOGY0NS1jYmQ4MDgxZTIxMTcifQ.CPkncBVD5jYwsXpHRBIjxw5OYnIZEuSC9VAIkbVA0BU",
  "access_expires_at": "2026-10-28T17:05:38.1028178Z",
  "refresh_token": "e-77ynyd8Vehu6XpGZMFYOX58Im-ZTSAX5gnxVJCsZI",
  "refresh_expires_at": "2026-11-27T16:50:38.101556343Z",
  "account_created": true
}
```

`POST /api/driver/v1/work-sessions` → **409**

```json
{
  "command_id": "c432c062-f41e-4943-8c2b-24bfd87e2dad",
  "vehicle_id": "67d6ce1d-5767-4a65-aaf3-c34d765cf4d7",
  "location": {
    "lat": 50.45,
    "lon": 30.52,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:50:38Z",
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
  "correlation_id": "9f4cb66e-7356-4f3b-99db-1bcd0c6bc441"
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
  "changed_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
  "reason": "Sandbox: force update",
  "changed_at": "2026-10-28T16:50:37.196298Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "0d9b8d67-d4dc-4431-a024-593b6e232e20",
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
  "changed_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
  "reason": "Sandbox clean-up",
  "changed_at": "2026-10-28T16:50:39.076709647Z"
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
  "session_id": "f84021b0-ba1a-4aa7-9b61-c0391daf6403",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcxMzksImlhdCI6MTc5MzIwNjIzOSwianRpIjoiMmUyNDliZTgtYzQyNi00YmFkLWI3MjQtMTEwNTIwNTQ2ZTIxIiwic2lkIjoiZjg0MDIxYjAtYmExYS00YWE3LTliNjEtYzAzOTFkYWY2NDAzIn0.YSCjEmhlsEGk2nb8y5neYqkyHfG5WT6ohkCIgKT5ltE",
  "access_expires_at": "2026-10-28T17:05:39.709405504Z",
  "refresh_token": "rsVa4-67kQhZwd7GTT_HnRg95q-2plDvR8onaA3lh70",
  "refresh_expires_at": "2026-10-29T04:50:39.708258693Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "c07829f4-742a-4f97-a10a-dee4b3a639fa",
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
  "id": "fd45d943-c0bd-4186-b673-930479add1dc",
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
  "created_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
  "created_at": "2026-10-28T16:50:39.991536Z",
  "updated_at": "2026-10-28T16:50:39.991536Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637259399",
  "device_ref": "sandbox-20103"
}
```

```json
{
  "challenge_id": "4fc34ea3-0e6e-42e9-9b6c-251b6505ab17",
  "expires_at": "2026-10-28T16:55:40.288765374Z",
  "resend_available_at": "2026-10-28T16:50:41.288765374Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637259399` → **200**

```json
{
  "phone": "+380637259399",
  "audience": "CLIENT",
  "code": "693294",
  "sent_at": "2026-10-28T16:50:40.292978208Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4fc34ea3-0e6e-42e9-9b6c-251b6505ab17",
  "code": "693294",
  "device_ref": "sandbox-20103"
}
```

```json
{
  "session_id": "b90f0c17-d9ea-4256-ad41-f342f84e6098",
  "subject": {
    "type": "CLIENT",
    "id": "2cc9eb7a-6530-488c-9430-43882bf81bf1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyY2M5ZWI3YS02NTMwLTQ4OGMtOTQzMC00Mzg4MmJmODFiZjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3MTQwLCJpYXQiOjE3OTMyMDYyNDAsImp0aSI6ImNiMjVmZTc3LTJmNDktNGFiMi04NmFkLTg1Y2NjNTg5YjI5MyIsInNpZCI6ImI5MGYwYzE3LWQ5ZWEtNDI1Ni1hZDQxLWYzNDJmODRlNjA5OCJ9.sy6TI-aIdkRoaOErutoMYQ02r_7bb2wjgkh9z_v0gN0",
  "access_expires_at": "2026-10-28T17:05:40.580323122Z",
  "refresh_token": "u12lLBgFKjrYUDQEfIv4vh-s1i85RqKQbKan-lG8izI",
  "refresh_expires_at": "2026-11-27T16:50:40.57894716Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380637259399` → **200**

```json
{
  "client_id": "2cc9eb7a-6530-488c-9430-43882bf81bf1"
}
```

`POST /api/admin/v1/rider-wallets/2cc9eb7a-6530-488c-9430-43882bf81bf1/top-ups` → **201**

```json
{
  "command_id": "c685a394-58ee-4de0-947d-4ccab3074e17",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "2cc9eb7a-6530-488c-9430-43882bf81bf1",
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
      "id": "c9376637-2c17-4c7f-af85-0d8e265efe14",
      "at": "2026-10-28T16:50:41.142892Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7839859a-7817-4d7e-a27e-b76b01a34ac3",
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
  "id": "86bf6dbe-5977-4408-982d-1430fd3f5d37",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:55:41.708572Z",
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
      "id": "fd45d943-c0bd-4186-b673-930479add1dc",
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
  "device_ref": "sandbox-21936"
}
```

```json
{
  "challenge_id": "7b0c4a8f-9ea9-428a-88b5-d1e93afb4a1a",
  "expires_at": "2026-10-28T16:55:42.017359983Z",
  "resend_available_at": "2026-10-28T16:50:43.017359983Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "626292",
  "sent_at": "2026-10-28T16:50:42.02212803Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7b0c4a8f-9ea9-428a-88b5-d1e93afb4a1a",
  "code": "626292",
  "device_ref": "sandbox-21936"
}
```

```json
{
  "session_id": "9a475b2f-a067-46f4-a199-db72828cc479",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNzE0MiwiaWF0IjoxNzkzMjA2MjQyLCJqdGkiOiIzZmYxZmY2Mi1jMDVmLTQwY2QtYWZjNC0yYWIyZWVmMDE2ZDUiLCJzaWQiOiI5YTQ3NWIyZi1hMDY3LTQ2ZjQtYTE5OS1kYjcyODI4Y2M0NzkifQ.IN0K29vSZ0AOzMez0SqKY5SMbVq1XniyQjPPyHqger4",
  "access_expires_at": "2026-10-28T17:05:42.318457288Z",
  "refresh_token": "I00X7L8ieCoKGcVQOB80ZW7JyysBW0gV-qzzMdoKMhc",
  "refresh_expires_at": "2026-11-27T16:50:42.31748465Z",
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
  "command_id": "8d2eb823-afd5-4fa4-9941-4406577f6e65",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:50:42Z",
    "sequence": 1793206242852
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8e3641d3-ddfe-4c36-b684-1ca783cc81db",
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
  "last_heartbeat_at": "2026-10-28T16:50:42.875455Z",
  "last_location_at": "2026-10-28T16:50:42.875455Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9c8347c1-e46a-4fb6-ada6-c3dd11a4a67e",
  "quote_id": "86bf6dbe-5977-4408-982d-1430fd3f5d37",
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
  "id": "a7fec40f-ae17-4362-a1fa-35494b729716",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2cc9eb7a-6530-488c-9430-43882bf81bf1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:50:43.215404Z",
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
  "client_id": "2cc9eb7a-6530-488c-9430-43882bf81bf1",
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
      "id": "c9376637-2c17-4c7f-af85-0d8e265efe14",
      "at": "2026-10-28T16:50:41.142892Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
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
    "id": "ebc6a7aa-58d6-4712-a8be-c1570138381a",
    "order_id": "a7fec40f-ae17-4362-a1fa-35494b729716",
    "expires_at": "2026-10-28T16:50:58.230759Z",
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

`POST /api/driver/v1/offers/ebc6a7aa-58d6-4712-a8be-c1570138381a/accept` → **200**

```json
{
  "command_id": "087a9051-2b2a-41be-931c-69adb4fcac56"
}
```

```json
{
  "id": "2c0dcca8-308f-446b-9458-4e38fe6148c2",
  "order_id": "a7fec40f-ae17-4362-a1fa-35494b729716",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9d8f5082-992a-4818-8e25-1ce6b01be4a8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9d8f5082-992a-4818-8e25-1ce6b01be4a8",
  "order_id": "a7fec40f-ae17-4362-a1fa-35494b729716",
  "assignment_id": "2c0dcca8-308f-446b-9458-4e38fe6148c2",
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

`POST /api/driver/v1/work-sessions/8e3641d3-ddfe-4c36-b684-1ca783cc81db/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:50:44Z",
    "sequence": 1793206244606
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8e3641d3-ddfe-4c36-b684-1ca783cc81db",
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
  "last_heartbeat_at": "2026-10-28T16:50:44.635336Z",
  "last_location_at": "2026-10-28T16:50:44.635336Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9d8f5082-992a-4818-8e25-1ce6b01be4a8/arrive` → **200**

```json
{
  "command_id": "865683fd-bfcb-439a-8d3c-e155b179c3d2",
  "expected_version": 0
}
```

```json
{
  "id": "9d8f5082-992a-4818-8e25-1ce6b01be4a8",
  "order_id": "a7fec40f-ae17-4362-a1fa-35494b729716",
  "assignment_id": "2c0dcca8-308f-446b-9458-4e38fe6148c2",
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
  "arrived_at": "2026-10-28T16:50:44.92048Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9d8f5082-992a-4818-8e25-1ce6b01be4a8/start` → **200**

```json
{
  "command_id": "8da21bee-cb55-4858-ad78-3d42989882a3",
  "expected_version": 1
}
```

```json
{
  "id": "9d8f5082-992a-4818-8e25-1ce6b01be4a8",
  "order_id": "a7fec40f-ae17-4362-a1fa-35494b729716",
  "assignment_id": "2c0dcca8-308f-446b-9458-4e38fe6148c2",
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
  "arrived_at": "2026-10-28T16:50:44.92048Z",
  "started_at": "2026-10-28T16:50:45.211113Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/9d8f5082-992a-4818-8e25-1ce6b01be4a8/complete` → **200**

```json
{
  "command_id": "b61946cf-31d2-49eb-8a90-1cc579e5bfd4",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:50:45Z",
  "cash_received": true
}
```

```json
{
  "id": "9d8f5082-992a-4818-8e25-1ce6b01be4a8",
  "order_id": "a7fec40f-ae17-4362-a1fa-35494b729716",
  "assignment_id": "2c0dcca8-308f-446b-9458-4e38fe6148c2",
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
  "arrived_at": "2026-10-28T16:50:44.92048Z",
  "started_at": "2026-10-28T16:50:45.211113Z",
  "completed_at": "2026-10-28T16:50:45.519642Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "2cc9eb7a-6530-488c-9430-43882bf81bf1",
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
      "id": "21921398-614f-40dc-bc20-8abc03b5442c",
      "at": "2026-10-28T16:50:46.162111Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "a7fec40f-ae17-4362-a1fa-35494b729716"
    },
    {
      "id": "c9376637-2c17-4c7f-af85-0d8e265efe14",
      "at": "2026-10-28T16:50:41.142892Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/fd45d943-c0bd-4186-b673-930479add1dc/archive` → **200**

```json
{
  "command_id": "c0ab64b9-e6a6-4d9f-926e-162fc31017cd",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "fd45d943-c0bd-4186-b673-930479add1dc",
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
  "created_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
  "created_at": "2026-10-28T16:50:39.991536Z",
  "updated_at": "2026-10-28T16:50:49.111556Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8e3641d3-ddfe-4c36-b684-1ca783cc81db",
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
  "last_heartbeat_at": "2026-10-28T16:50:44.635336Z",
  "last_location_at": "2026-10-28T16:50:44.635336Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8e3641d3-ddfe-4c36-b684-1ca783cc81db/close` → **200**

```json
{
  "command_id": "cdea53b6-ac7d-460b-abd3-0a6c6c6824a4",
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

Done: order a7fec40f-ae17-4362-a1fa-35494b729716.

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
  "session_id": "8c0033e7-0475-4de5-8c43-178aa45ad122",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcxNTAsImlhdCI6MTc5MzIwNjI1MCwianRpIjoiMjQ1YTM3MmMtMjQ5NS00YTFjLThmMzEtYzZiZGJhOWU2MWQ1Iiwic2lkIjoiOGMwMDMzZTctMDQ3NS00ZGU1LThjNDMtMTc4YWE0NWFkMTIyIn0.VU2j4BKWKgbichhQCoNDhwjNZBfP0SAn8tTdl0YZznA",
  "access_expires_at": "2026-10-28T17:05:50.275513031Z",
  "refresh_token": "zEFNPsfsYONt4NIdycTOI5ic9pPG5LT7H3Hbo1KPUag",
  "refresh_expires_at": "2026-10-29T04:50:50.274644813Z",
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
  "command_id": "392b1c8d-c882-4126-96e1-c78c37df68d6",
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
  "session_id": "59604344-ce14-434c-9a1d-69bc88c192b6",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcxNTEsImlhdCI6MTc5MzIwNjI1MSwianRpIjoiOGI5NjQwODYtNjRmZi00YjlmLWFkZDItYjRjNjU3YzAzYmI0Iiwic2lkIjoiNTk2MDQzNDQtY2UxNC00MzRjLTlhMWQtNjliYzg4YzE5MmI2In0.q1eRwiI6dgejKCrEfQDFm9goLoL7tyUBMhlRb3LanwM",
  "access_expires_at": "2026-10-28T17:05:51.43371138Z",
  "refresh_token": "KNHT_DnrvINC0ixZPXc08QD9nvP3oUbCfgssvTYaMzU",
  "refresh_expires_at": "2026-10-29T04:50:51.432880563Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.3095421596",
    "linkedid": "1730052700.3095421596",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678465730"
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
    "id": "1730052700.3095421596",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "8b2d5fb7-fbad-45a0-a655-812d00a2fc12",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380678465730",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T16:50:51.696276Z",
      "answered_at": null,
      "ended_at": "2026-10-28T16:50:51.72521Z",
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
    "id": "1730052600.2185415942",
    "linkedid": "1730052600.2185415942",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678465730"
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
      "id": "7445436a-1f10-432b-ae97-4cbf9f5570d4",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380678465730",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T16:50:52.03243Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/7445436a-1f10-432b-ae97-4cbf9f5570d4/answer` → **200**

```json
{
  "command_id": "b157fdcd-cbef-4504-9138-95a0a937df1b"
}
```

```json
{
  "id": "7445436a-1f10-432b-ae97-4cbf9f5570d4",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380678465730",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
  "order_ids": [],
  "started_at": "2026-10-28T16:50:52.03243Z",
  "answered_at": "2026-10-28T16:50:52.350967Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2185415942",
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
    "id": "1730052600.2185415942",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "7445436a-1f10-432b-ae97-4cbf9f5570d4",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678465730",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
      "order_ids": [],
      "started_at": "2026-10-28T16:50:52.03243Z",
      "answered_at": "2026-10-28T16:50:52.350967Z",
      "ended_at": "2026-10-28T16:50:52.639418Z",
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
      "id": "7445436a-1f10-432b-ae97-4cbf9f5570d4",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678465730",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
      "order_ids": [],
      "started_at": "2026-10-28T16:50:52.03243Z",
      "answered_at": "2026-10-28T16:50:52.350967Z",
      "ended_at": "2026-10-28T16:50:52.639418Z",
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
      "id": "7445436a-1f10-432b-ae97-4cbf9f5570d4",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678465730",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
      "order_ids": [],
      "started_at": "2026-10-28T16:50:52.03243Z",
      "answered_at": "2026-10-28T16:50:52.350967Z",
      "ended_at": "2026-10-28T16:50:52.639418Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T16:50:54.957154Z"
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
      "id": "7445436a-1f10-432b-ae97-4cbf9f5570d4",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678465730",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
      "order_ids": [],
      "started_at": "2026-10-28T16:50:52.03243Z",
      "answered_at": "2026-10-28T16:50:52.350967Z",
      "ended_at": "2026-10-28T16:50:52.639418Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T16:50:54.957154Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/7445436a-1f10-432b-ae97-4cbf9f5570d4/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/7445436a-1f10-432b-ae97-4cbf9f5570d4/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=7445436a-1f10-432b-ae97-4cbf9f5570d4` → **200**

```json
{
  "changes": [
    {
      "id": "0934cee1-d133-4171-af5e-56cd76bb06f6",
      "occurred_at": "2026-10-28T16:50:57.793389Z",
      "actor_type": "STAFF",
      "actor_id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "7445436a-1f10-432b-ae97-4cbf9f5570d4",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"5eb68c78-b024-485e-a299-e22d575ecc8a\", \"order_ids\": []}",
      "correlation_id": "9c3d4c1c-a776-471b-b325-552eaa81dde8"
    },
    {
      "id": "74679910-2f36-4852-b0b8-4f8a2e50afe2",
      "occurred_at": "2026-10-28T16:50:57.761643Z",
      "actor_type": "STAFF",
      "actor_id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "7445436a-1f10-432b-ae97-4cbf9f5570d4",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"5eb68c78-b024-485e-a299-e22d575ecc8a\", \"order_ids\": []}",
      "correlation_id": "694476eb-81f5-451a-bcb2-abffa4a31e2a"
    }
  ]
}
```

Done: call 7445436a-1f10-432b-ae97-4cbf9f5570d4 recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636039400",
  "device_ref": "sandbox-7438"
}
```

```json
{
  "challenge_id": "bb25c3ff-a514-45b7-bdd6-5ce5c542cef3",
  "expires_at": "2026-10-28T16:55:58.101011317Z",
  "resend_available_at": "2026-10-28T16:50:59.101011317Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636039400` → **200**

```json
{
  "phone": "+380636039400",
  "audience": "CLIENT",
  "code": "239938",
  "sent_at": "2026-10-28T16:50:58.105531234Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bb25c3ff-a514-45b7-bdd6-5ce5c542cef3",
  "code": "239938",
  "device_ref": "sandbox-7438"
}
```

```json
{
  "session_id": "eb353e5d-ee83-4061-8278-01ecc75b742a",
  "subject": {
    "type": "CLIENT",
    "id": "6407f08d-d528-4c3e-90bd-6763d02b8694"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NDA3ZjA4ZC1kNTI4LTRjM2UtOTBiZC02NzYzZDAyYjg2OTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3MTU4LCJpYXQiOjE3OTMyMDYyNTgsImp0aSI6ImJiZDI4M2M4LTYxYTctNGQzMy1iOTk3LTBlMDY4MmE3ZjFiZiIsInNpZCI6ImViMzUzZTVkLWVlODMtNDA2MS04Mjc4LTAxZWNjNzViNzQyYSJ9.4yGvF5wjApQkfEDncOHq_eayMiWT2luR1d9GFLCo8nA",
  "access_expires_at": "2026-10-28T17:05:58.400165457Z",
  "refresh_token": "IO6pHThAqb1GT4wC81M0DrL7kFVYXDd-GCCgnkc6tqs",
  "refresh_expires_at": "2026-11-27T16:50:58.399324558Z",
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
  "device_ref": "sandbox-22390"
}
```

```json
{
  "challenge_id": "4e1cdac9-4ad1-4821-9a8c-21e8c8b6ee9d",
  "expires_at": "2026-10-28T16:55:58.925969345Z",
  "resend_available_at": "2026-10-28T16:50:59.925969345Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "033350",
  "sent_at": "2026-10-28T16:50:58.929485522Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4e1cdac9-4ad1-4821-9a8c-21e8c8b6ee9d",
  "code": "033350",
  "device_ref": "sandbox-22390"
}
```

```json
{
  "session_id": "da30cbe1-e1e2-438e-9f32-941349f51f44",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNzE1OSwiaWF0IjoxNzkzMjA2MjU5LCJqdGkiOiJmODczNDFlNS0xZGY3LTQyZTYtOTA0MC1kNGJiN2MyYTU4ZjEiLCJzaWQiOiJkYTMwY2JlMS1lMWUyLTQzOGUtOWYzMi05NDEzNDlmNTFmNDQifQ.sy7ZDfMrUo_hAz4oIY04VwqUDAyw2hKwuHSBQ6llPqc",
  "access_expires_at": "2026-10-28T17:05:59.225736827Z",
  "refresh_token": "i17TjoRhvDbdRZojXe6WK4GpiJeUEpApJ_Qdmp7ZEes",
  "refresh_expires_at": "2026-11-27T16:50:59.22502082Z",
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
  "session_id": "ac63fc2c-e866-4e6b-8aef-8b7c568d1694",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcxNjAsImlhdCI6MTc5MzIwNjI2MCwianRpIjoiOTIxNDE3MzMtZDg0Yy00MDhhLWEyMTItNTYzYzA3ZDRhOGEyIiwic2lkIjoiYWM2M2ZjMmMtZTg2Ni00ZTZiLThhZWYtOGI3YzU2OGQxNjk0In0.UToRxN1wZpoz5MYmp0f5y_ED06_pERPaw3zq2JNp1fU",
  "access_expires_at": "2026-10-28T17:06:00.060876433Z",
  "refresh_token": "1geW1tzGjU563zu32cwGrRuYhvIXyD6fQmIxTLVqaTs",
  "refresh_expires_at": "2026-10-29T04:51:00.0602088Z",
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
  "session_id": "842eea31-4c1a-41a0-b382-2ed2496266d8",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcxNjAsImlhdCI6MTc5MzIwNjI2MCwianRpIjoiYjM0YzBmNmItMTgyMy00ZWFjLTk1N2UtODVkN2RiNTdiNDM3Iiwic2lkIjoiODQyZWVhMzEtNGMxYS00MWEwLWIzODItMmVkMjQ5NjI2NmQ4In0.zQxzEc_ewuBTdqGkpyje3eRJRVBzmLAhIXHUyFvEuoM",
  "access_expires_at": "2026-10-28T17:06:00.640965592Z",
  "refresh_token": "1KMNjs1Wx8zFvPFh2RagGM2KRI2ZMAXSPsUVMCvwfIY",
  "refresh_expires_at": "2026-10-29T04:51:00.640320713Z",
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
  "command_id": "3725332d-fa33-4ced-a918-d5c27b5670b9",
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
  "id": "70e77198-cd2d-4291-a29f-699072229bcc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:56:01.159565Z",
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
  "command_id": "1c4cda74-3cea-48ea-9ab1-5de32914d230",
  "quote_id": "70e77198-cd2d-4291-a29f-699072229bcc",
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
  "id": "c05358eb-47dd-4cff-8010-7dd1b2ac6b2a",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6407f08d-d528-4c3e-90bd-6763d02b8694",
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
  "created_at": "2026-10-28T16:51:01.441706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/c05358eb-47dd-4cff-8010-7dd1b2ac6b2a` → **200**

```json
{
  "id": "c05358eb-47dd-4cff-8010-7dd1b2ac6b2a",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6407f08d-d528-4c3e-90bd-6763d02b8694",
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
  "created_at": "2026-10-28T16:51:01.441706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/c05358eb-47dd-4cff-8010-7dd1b2ac6b2a/cancel` → **200**

```json
{
  "command_id": "9cea2102-6ae6-40c0-8c30-93dc662c9ff2",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "c05358eb-47dd-4cff-8010-7dd1b2ac6b2a",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6407f08d-d528-4c3e-90bd-6763d02b8694",
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
  "created_at": "2026-10-28T16:51:01.441706Z",
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
  "command_id": "7653c2b3-e623-46d8-82f2-c5698bd25716",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:51:02Z",
    "sequence": 1793206262548
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "58485797-bc76-4dc6-9044-4b8d337aadbe",
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
  "last_heartbeat_at": "2026-10-28T16:51:02.5693Z",
  "last_location_at": "2026-10-28T16:51:02.5693Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-5785"
}
```

```json
{
  "challenge_id": "39eef202-909b-4627-b2d2-16325ab67555",
  "expires_at": "2026-10-28T16:56:02.842420479Z",
  "resend_available_at": "2026-10-28T16:51:03.842420479Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "835276",
  "sent_at": "2026-10-28T16:51:02.846071688Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "39eef202-909b-4627-b2d2-16325ab67555",
  "code": "835276",
  "device_ref": "sandbox-5785"
}
```

```json
{
  "session_id": "bf42302c-dcce-495b-b6e8-3d1cf3c0a9b1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNzE2MywiaWF0IjoxNzkzMjA2MjYzLCJqdGkiOiI2M2NkM2IwNC1lOTM1LTQxYjEtYWZlNy1kYTFkYjQxMWEwZjAiLCJzaWQiOiJiZjQyMzAyYy1kY2NlLTQ5NWItYjZlOC0zZDFjZjNjMGE5YjEifQ.WuvL8fmTwReEF2r-mLOYQOHgDcbQCDWnyIWVuC3GaHg",
  "access_expires_at": "2026-10-28T17:06:03.14188033Z",
  "refresh_token": "lIh_HCMvFLXi7RNmy_hWgIoBb_X40U0oo9zhiYHSNMo",
  "refresh_expires_at": "2026-11-27T16:51:03.141260756Z",
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
  "command_id": "d8b5703d-9237-40c8-a25f-2823e65ba8c6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:51:03Z",
    "sequence": 1793206263685
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e34e7393-7b3e-46f0-a3fd-57c3d32b4548",
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
  "last_heartbeat_at": "2026-10-28T16:51:03.706592Z",
  "last_location_at": "2026-10-28T16:51:03.706592Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8ab27ef7-ea82-4712-8f38-c3eb8a86ac7a",
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
  "id": "bec86d73-1246-4172-be41-7d9f9db6a316",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:56:03.994447Z",
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
  "command_id": "321ee297-52a8-402f-ab1e-b496c7f14fa0",
  "quote_id": "bec86d73-1246-4172-be41-7d9f9db6a316",
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
  "id": "56b1e89b-fbe2-41fd-b8c5-12651feebf44",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6407f08d-d528-4c3e-90bd-6763d02b8694",
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
  "created_at": "2026-10-28T16:51:04.281661Z",
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
    "id": "3f1ea1fc-03d2-4145-bf15-8d1d4d1d3fae",
    "order_id": "56b1e89b-fbe2-41fd-b8c5-12651feebf44",
    "expires_at": "2026-10-28T16:51:19.286082Z",
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

`POST /api/driver/v1/offers/3f1ea1fc-03d2-4145-bf15-8d1d4d1d3fae/accept` → **200**

```json
{
  "command_id": "7795a0ab-6d22-469b-8e6d-b440f7503a70"
}
```

```json
{
  "id": "355dce7e-ddaa-4b3d-8190-9c0622417641",
  "order_id": "56b1e89b-fbe2-41fd-b8c5-12651feebf44",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "540f393f-f332-40ec-af98-c561a7acb202",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "540f393f-f332-40ec-af98-c561a7acb202",
  "order_id": "56b1e89b-fbe2-41fd-b8c5-12651feebf44",
  "assignment_id": "355dce7e-ddaa-4b3d-8190-9c0622417641",
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

`POST /api/driver/v1/trips/540f393f-f332-40ec-af98-c561a7acb202/cancel` → **200**

```json
{
  "command_id": "4fe64a42-5e7b-46eb-87d2-4f15c3309e0d",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "540f393f-f332-40ec-af98-c561a7acb202",
  "order_id": "56b1e89b-fbe2-41fd-b8c5-12651feebf44",
  "assignment_id": "355dce7e-ddaa-4b3d-8190-9c0622417641",
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

`GET /api/rider/v1/orders/56b1e89b-fbe2-41fd-b8c5-12651feebf44` → **200**

```json
{
  "id": "56b1e89b-fbe2-41fd-b8c5-12651feebf44",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "6407f08d-d528-4c3e-90bd-6763d02b8694",
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
    "id": "355dce7e-ddaa-4b3d-8190-9c0622417641",
    "order_id": "56b1e89b-fbe2-41fd-b8c5-12651feebf44",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "540f393f-f332-40ec-af98-c561a7acb202",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T16:51:04.281661Z",
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
    "id": "52fdcbe9-f113-483b-a111-8b0996077028",
    "order_id": "56b1e89b-fbe2-41fd-b8c5-12651feebf44",
    "expires_at": "2026-10-28T16:51:20.405527Z",
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

`POST /api/driver/v1/offers/52fdcbe9-f113-483b-a111-8b0996077028/accept` → **200**

```json
{
  "command_id": "11ec4fdf-773a-41ea-aec8-58229518237e"
}
```

```json
{
  "id": "00fcf80b-cfbe-4894-bb68-9cfe533c2389",
  "order_id": "56b1e89b-fbe2-41fd-b8c5-12651feebf44",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e8671335-052f-4ccb-ba6f-b121109ef3c5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e8671335-052f-4ccb-ba6f-b121109ef3c5",
  "order_id": "56b1e89b-fbe2-41fd-b8c5-12651feebf44",
  "assignment_id": "00fcf80b-cfbe-4894-bb68-9cfe533c2389",
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

`POST /api/driver/v1/trips/e8671335-052f-4ccb-ba6f-b121109ef3c5/cancel` → **200**

```json
{
  "command_id": "ce28ea8e-aa18-447b-b8af-e29dc2bde1ca",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "e8671335-052f-4ccb-ba6f-b121109ef3c5",
  "order_id": "56b1e89b-fbe2-41fd-b8c5-12651feebf44",
  "assignment_id": "00fcf80b-cfbe-4894-bb68-9cfe533c2389",
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
    "id": "56b1e89b-fbe2-41fd-b8c5-12651feebf44",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T16:51:04.281661Z",
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
    "id": "c05358eb-47dd-4cff-8010-7dd1b2ac6b2a",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T16:51:01.441706Z",
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

`GET /api/operator/v1/orders/56b1e89b-fbe2-41fd-b8c5-12651feebf44/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:51:04.28251Z",
      "actor": {
        "type": "CLIENT",
        "id": "6407f08d-d528-4c3e-90bd-6763d02b8694",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "56b1e89b-fbe2-41fd-b8c5-12651feebf44",
        "quote_id": "bec86d73-1246-4172-be41-7d9f9db6a316",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "830b572c-4ad8-4fb6-9bc3-10219e2e9bd2"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:51:04.284806Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "56b1e89b-fbe2-41fd-b8c5-12651feebf44",
        "attempt_id": "987dfa77-81d3-4439-9539-76de70be162c",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "830b572c-4ad8-4fb6-9bc3-10219e2e9bd2"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T16:51:04.293157Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3f1ea1fc-03d2-4145-bf15-8d1d4d1d3fae",
        "order_id": "56b1e89b-fbe2-41fd-b8c5-12651feebf44",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "830b572c-4ad8-4fb6-9bc3-10219e2e9bd2"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T16:51:04.835476Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "3f1ea1fc-03d2-4145-bf15-8d1d4d1d3fae",
        "order_id": "56b1e89b-fbe2-41fd-b8c5-12651feebf44",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "355dce7e-ddaa-4b3d-8190-9c0622417641"
      },
      "correlation_id": "0d760029-43ea-4d11-b326-56f4c7a1b822"
```

Done: orders c05358eb-47dd-4cff-8010-7dd1b2ac6b2a, 56b1e89b-fbe2-41fd-b8c5-12651feebf44.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733515835",
  "device_ref": "sandbox-16038"
}
```

```json
{
  "challenge_id": "1751acb6-a1f7-4d85-b188-ff75e3adc01c",
  "expires_at": "2026-10-28T16:56:07.975883036Z",
  "resend_available_at": "2026-10-28T16:51:08.975883036Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380733515835` → **200**

```json
{
  "phone": "+380733515835",
  "audience": "CLIENT",
  "code": "624065",
  "sent_at": "2026-10-28T16:51:07.979136435Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1751acb6-a1f7-4d85-b188-ff75e3adc01c",
  "code": "624065",
  "device_ref": "sandbox-16038"
}
```

```json
{
  "session_id": "cb68b3a6-c6f8-4d53-acd7-e84ad84fb55d",
  "subject": {
    "type": "CLIENT",
    "id": "762c8309-0a18-46a7-821b-0f0980976743"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NjJjODMwOS0wYTE4LTQ2YTctODIxYi0wZjA5ODA5NzY3NDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3MTY4LCJpYXQiOjE3OTMyMDYyNjgsImp0aSI6IjFiNGNiMWI3LTBhNjYtNDRmYi04MjQ1LTNiNzE4NTNjZmYwMyIsInNpZCI6ImNiNjhiM2E2LWM2ZjgtNGQ1My1hY2Q3LWU4NGFkODRmYjU1ZCJ9.omSElJCSs5QjVasJE8gVcmw_zG22uNsh9g4Lyw__gsk",
  "access_expires_at": "2026-10-28T17:06:08.266822108Z",
  "refresh_token": "7-5hkQZp90LeTkg8sVboArAw47YMOj7GHSHoAm97o4M",
  "refresh_expires_at": "2026-11-27T16:51:08.266183894Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "e7146144-cae6-4966-bb82-0dc5a16e9506",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "2977fe1f-1be7-4272-9d64-94a2afce259a",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-2977fe1f-1be7-4272-9d64-94a2afce259a",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "5f4ee17e82203f1a0c6ef7e9224c6080",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=2977fe1f-1be7-4272-9d64-94a2afce259a",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733515835"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=2977fe1f-1be7-4272-9d64-94a2afce259a",
  "expires_at": "2026-10-28T17:21:08.553217Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/2977fe1f-1be7-4272-9d64-94a2afce259a` → **200**

```json
{
  "id": "2977fe1f-1be7-4272-9d64-94a2afce259a",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T17:21:08.553217Z",
  "card": {
    "id": "fd7b36cd-8d31-4607-b62b-3d759d9e6479",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5107",
    "card_type": "Visa",
    "created_at": "2026-10-28T16:51:08.832773Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "fd7b36cd-8d31-4607-b62b-3d759d9e6479",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****5107",
      "card_type": "Visa",
      "created_at": "2026-10-28T16:51:08.832773Z"
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
  "device_ref": "sandbox-17030"
}
```

```json
{
  "challenge_id": "af5cd512-441c-4215-888d-397b3a9758b9",
  "expires_at": "2026-10-28T16:56:09.379474202Z",
  "resend_available_at": "2026-10-28T16:51:10.379474202Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "106573",
  "sent_at": "2026-10-28T16:51:09.382873096Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "af5cd512-441c-4215-888d-397b3a9758b9",
  "code": "106573",
  "device_ref": "sandbox-17030"
}
```

```json
{
  "session_id": "bf716770-5718-4039-86e3-5cb2d42ee91a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNzE2OSwiaWF0IjoxNzkzMjA2MjY5LCJqdGkiOiI4NmJhMjJiMS01MDhjLTQ4YTEtOTJkZC1jMmE0NzY2YTRkZGEiLCJzaWQiOiJiZjcxNjc3MC01NzE4LTQwMzktODZlMy01Y2IyZDQyZWU5MWEifQ.f81yZJnSbc4IWyu9SZiyxWX8my-o_leUmu0yCdt29TM",
  "access_expires_at": "2026-10-28T17:06:09.673164327Z",
  "refresh_token": "TfASQRtt-Wv22GTVZTbf2XNPeNVdKmaZndLzQpj42wU",
  "refresh_expires_at": "2026-11-27T16:51:09.672620686Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e34e7393-7b3e-46f0-a3fd-57c3d32b4548",
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
  "last_heartbeat_at": "2026-10-28T16:51:03.706592Z",
  "last_location_at": "2026-10-28T16:51:03.706592Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e34e7393-7b3e-46f0-a3fd-57c3d32b4548/handover` → **200**

```json
{
  "command_id": "e39de1e4-9d9a-4340-ba1b-3de7a779d6ab",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e34e7393-7b3e-46f0-a3fd-57c3d32b4548",
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
  "last_heartbeat_at": "2026-10-28T16:51:03.706592Z",
  "last_location_at": "2026-10-28T16:51:03.706592Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e34e7393-7b3e-46f0-a3fd-57c3d32b4548/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:51:10Z",
    "sequence": 1793206270464
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e34e7393-7b3e-46f0-a3fd-57c3d32b4548",
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
  "last_heartbeat_at": "2026-10-28T16:51:10.484695Z",
  "last_location_at": "2026-10-28T16:51:10.484695Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "abb861d1-2a86-4239-be36-50db7f8c21ca",
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
  "id": "fb42219c-1cfd-4b5a-899a-0cfbd9c3bce8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:56:10.757472Z",
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
  "command_id": "e5d046fc-5646-4598-bd6d-db447e277d8a",
  "quote_id": "fb42219c-1cfd-4b5a-899a-0cfbd9c3bce8",
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
  "id": "e0cf192e-3dde-491d-882e-11a557e3d688",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "762c8309-0a18-46a7-821b-0f0980976743",
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
  "created_at": "2026-10-28T16:51:11.0381Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/e0cf192e-3dde-491d-882e-11a557e3d688` → **200**

```json
{
  "id": "e0cf192e-3dde-491d-882e-11a557e3d688",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "762c8309-0a18-46a7-821b-0f0980976743",
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
  "created_at": "2026-10-28T16:51:11.0381Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/e0cf192e-3dde-491d-882e-11a557e3d688` → **200**

```json
{
  "id": "e0cf192e-3dde-491d-882e-11a557e3d688",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "762c8309-0a18-46a7-821b-0f0980976743",
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
  "created_at": "2026-10-28T16:51:11.0381Z",
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
    "id": "ca28c749-bcfe-48ac-b704-05f81efcbb5c",
    "order_id": "e0cf192e-3dde-491d-882e-11a557e3d688",
    "expires_at": "2026-10-28T16:51:26.36415Z",
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

`POST /api/driver/v1/offers/ca28c749-bcfe-48ac-b704-05f81efcbb5c/accept` → **200**

```json
{
  "command_id": "68b1fb38-e111-4c24-87e2-9ed8f65d9d6b"
}
```

```json
{
  "id": "d9dc66fe-e582-4739-a754-bfa7318d3ab8",
  "order_id": "e0cf192e-3dde-491d-882e-11a557e3d688",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "88384193-2697-4ea5-93a6-52da34bf484f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "88384193-2697-4ea5-93a6-52da34bf484f",
  "order_id": "e0cf192e-3dde-491d-882e-11a557e3d688",
  "assignment_id": "d9dc66fe-e582-4739-a754-bfa7318d3ab8",
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

`POST /api/driver/v1/work-sessions/e34e7393-7b3e-46f0-a3fd-57c3d32b4548/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:51:13Z",
    "sequence": 1793206273703
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e34e7393-7b3e-46f0-a3fd-57c3d32b4548",
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
  "last_heartbeat_at": "2026-10-28T16:51:13.725307Z",
  "last_location_at": "2026-10-28T16:51:13.725307Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/88384193-2697-4ea5-93a6-52da34bf484f/arrive` → **200**

```json
{
  "command_id": "80aaedff-d637-498c-9388-65368f60d38d",
  "expected_version": 0
}
```

```json
{
  "id": "88384193-2697-4ea5-93a6-52da34bf484f",
  "order_id": "e0cf192e-3dde-491d-882e-11a557e3d688",
  "assignment_id": "d9dc66fe-e582-4739-a754-bfa7318d3ab8",
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
  "arrived_at": "2026-10-28T16:51:14.00894Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/88384193-2697-4ea5-93a6-52da34bf484f/start` → **200**

```json
{
  "command_id": "4b2de680-bb7a-444e-bf87-f0d16591dbe9",
  "expected_version": 1
}
```

```json
{
  "id": "88384193-2697-4ea5-93a6-52da34bf484f",
  "order_id": "e0cf192e-3dde-491d-882e-11a557e3d688",
  "assignment_id": "d9dc66fe-e582-4739-a754-bfa7318d3ab8",
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
  "arrived_at": "2026-10-28T16:51:14.00894Z",
  "started_at": "2026-10-28T16:51:14.297066Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/88384193-2697-4ea5-93a6-52da34bf484f/complete` → **200**

```json
{
  "command_id": "3ae4cb69-7448-45d9-8f3d-0885f6856f59",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:51:14Z"
}
```

```json
{
  "id": "88384193-2697-4ea5-93a6-52da34bf484f",
  "order_id": "e0cf192e-3dde-491d-882e-11a557e3d688",
  "assignment_id": "d9dc66fe-e582-4739-a754-bfa7318d3ab8",
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
  "arrived_at": "2026-10-28T16:51:14.00894Z",
  "started_at": "2026-10-28T16:51:14.297066Z",
  "completed_at": "2026-10-28T16:51:14.589268Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/e0cf192e-3dde-491d-882e-11a557e3d688` → **200**

```json
{
  "id": "e0cf192e-3dde-491d-882e-11a557e3d688",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "762c8309-0a18-46a7-821b-0f0980976743",
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
    "id": "d9dc66fe-e582-4739-a754-bfa7318d3ab8",
    "order_id": "e0cf192e-3dde-491d-882e-11a557e3d688",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "88384193-2697-4ea5-93a6-52da34bf484f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:51:11.0381Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/e0cf192e-3dde-491d-882e-11a557e3d688` → **200**

```json
{
  "id": "e0cf192e-3dde-491d-882e-11a557e3d688",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "762c8309-0a18-46a7-821b-0f0980976743",
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
    "id": "d9dc66fe-e582-4739-a754-bfa7318d3ab8",
    "order_id": "e0cf192e-3dde-491d-882e-11a557e3d688",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "88384193-2697-4ea5-93a6-52da34bf484f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:51:11.0381Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/e0cf192e-3dde-491d-882e-11a557e3d688` → **200**

```json
{
  "id": "e0cf192e-3dde-491d-882e-11a557e3d688",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "762c8309-0a18-46a7-821b-0f0980976743",
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
    "id": "d9dc66fe-e582-4739-a754-bfa7318d3ab8",
    "order_id": "e0cf192e-3dde-491d-882e-11a557e3d688",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "88384193-2697-4ea5-93a6-52da34bf484f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:51:11.0381Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/e0cf192e-3dde-491d-882e-11a557e3d688` → **200**

```json
{
  "id": "e0cf192e-3dde-491d-882e-11a557e3d688",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "762c8309-0a18-46a7-821b-0f0980976743",
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
    "id": "d9dc66fe-e582-4739-a754-bfa7318d3ab8",
    "order_id": "e0cf192e-3dde-491d-882e-11a557e3d688",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "88384193-2697-4ea5-93a6-52da34bf484f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:51:11.0381Z",
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
      "id": "7fccbc4e-102f-483c-bfbc-f735a0572e15",
      "at": "2026-10-28T16:51:15.450408Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e0cf192e-3dde-491d-882e-11a557e3d688",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/e0cf192e-3dde-491d-882e-11a557e3d688/tip` → **200**

```json
{
  "order_id": "e0cf192e-3dde-491d-882e-11a557e3d688",
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
  "available_until": "2026-10-29T16:51:14.589268Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/e0cf192e-3dde-491d-882e-11a557e3d688/tip` → **201**

```json
{
  "command_id": "00d96a46-6a74-4cd8-91a0-4045e0d30a75",
  "amount_minor": 2500
}
```

```json
{
  "id": "570271b6-fc3c-4805-8723-7a81dfd605e5",
  "order_id": "e0cf192e-3dde-491d-882e-11a557e3d688",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T16:51:19.790946Z"
}
```

`GET /api/rider/v1/orders/e0cf192e-3dde-491d-882e-11a557e3d688/tip` → **200**

```json
{
  "order_id": "e0cf192e-3dde-491d-882e-11a557e3d688",
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
  "available_until": "2026-10-29T16:51:14.589268Z",
  "open": false,
  "tip": {
    "id": "570271b6-fc3c-4805-8723-7a81dfd605e5",
    "order_id": "e0cf192e-3dde-491d-882e-11a557e3d688",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T16:51:19.790946Z"
  }
}
```

`GET /api/rider/v1/orders/e0cf192e-3dde-491d-882e-11a557e3d688/tip` → **200**

```json
{
  "order_id": "e0cf192e-3dde-491d-882e-11a557e3d688",
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
  "available_until": "2026-10-29T16:51:14.589268Z",
  "open": false,
  "tip": {
    "id": "570271b6-fc3c-4805-8723-7a81dfd605e5",
    "order_id": "e0cf192e-3dde-491d-882e-11a557e3d688",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T16:51:19.790946Z"
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
      "id": "57de43d4-3fcc-4b0a-babc-ebc05123ccfe",
      "at": "2026-10-28T16:51:21.525542Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "e0cf192e-3dde-491d-882e-11a557e3d688",
      "counterpart_id": null
    },
    {
      "id": "7fccbc4e-102f-483c-bfbc-f735a0572e15",
      "at": "2026-10-28T16:51:15.450408Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e0cf192e-3dde-491d-882e-11a557e3d688",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e34e7393-7b3e-46f0-a3fd-57c3d32b4548",
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
  "last_heartbeat_at": "2026-10-28T16:51:13.725307Z",
  "last_location_at": "2026-10-28T16:51:13.725307Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e34e7393-7b3e-46f0-a3fd-57c3d32b4548/close` → **200**

```json
{
  "command_id": "9b671c9e-88a9-49c0-a756-0ce163cdee01",
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

Done: card order e0cf192e-3dde-491d-882e-11a557e3d688.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739069664",
  "device_ref": "sandbox-27617"
}
```

```json
{
  "challenge_id": "e93b4c4e-c460-4012-a13a-55b9d101417f",
  "expires_at": "2026-10-28T16:56:22.42052425Z",
  "resend_available_at": "2026-10-28T16:51:23.42052425Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380739069664` → **200**

```json
{
  "phone": "+380739069664",
  "audience": "CLIENT",
  "code": "565467",
  "sent_at": "2026-10-28T16:51:22.42382579Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e93b4c4e-c460-4012-a13a-55b9d101417f",
  "code": "565467",
  "device_ref": "sandbox-27617"
}
```

```json
{
  "session_id": "84177bca-4b84-4a6b-b9bb-d4c4c6f2d5c8",
  "subject": {
    "type": "CLIENT",
    "id": "88f1b753-345c-4f0d-a0f0-cd7a190caa64"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OGYxYjc1My0zNDVjLTRmMGQtYTBmMC1jZDdhMTkwY2FhNjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3MTgyLCJpYXQiOjE3OTMyMDYyODIsImp0aSI6ImI4Y2MwM2Q0LTdlNjgtNDlkZi04NjcwLWEwM2I1ZmMwOTc4MCIsInNpZCI6Ijg0MTc3YmNhLTRiODQtNGE2Yi1iOWJiLWQ0YzRjNmYyZDVjOCJ9.hrN324YQNLUbj6C3gtWVHS1ZGXFGHb3sjida62WhIbU",
  "access_expires_at": "2026-10-28T17:06:22.718561509Z",
  "refresh_token": "5E8QUdWYq6h6xsEnFt0WW8_s_cTB6gu15utEq_lC3k0",
  "refresh_expires_at": "2026-11-27T16:51:22.717859256Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "afd25876-f333-4fe3-a845-2ba324248ac0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "e3b87940-bbc1-4b6a-ac8d-0a5ae57bdeb1",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-e3b87940-bbc1-4b6a-ac8d-0a5ae57bdeb1",
    "orderDate": "1793206283",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "d5d0bf1b58be6dd3bcdce29eb888f604",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=e3b87940-bbc1-4b6a-ac8d-0a5ae57bdeb1",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739069664"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=e3b87940-bbc1-4b6a-ac8d-0a5ae57bdeb1",
  "created_at": "2026-10-28T16:51:23.001249Z",
  "expires_at": "2026-10-28T17:21:23.001249Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/e3b87940-bbc1-4b6a-ac8d-0a5ae57bdeb1` → **200**

```json
{
  "id": "e3b87940-bbc1-4b6a-ac8d-0a5ae57bdeb1",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T16:51:23.001249Z",
  "expires_at": "2026-10-28T17:21:23.001249Z",
  "completed_at": "2026-10-28T16:51:23.291703Z",
  "masked_pan": "41****4116",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "88f1b753-345c-4f0d-a0f0-cd7a190caa64",
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
      "id": "2fa13774-440d-4899-b24e-8043b3ce97d2",
      "at": "2026-10-28T16:51:23.545365Z",
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
  "client_id": "88f1b753-345c-4f0d-a0f0-cd7a190caa64",
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
      "id": "2fa13774-440d-4899-b24e-8043b3ce97d2",
      "at": "2026-10-28T16:51:23.545365Z",
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
  "device_ref": "sandbox-2951"
}
```

```json
{
  "challenge_id": "b16e2259-1756-4e2c-a8bb-4d0969fbae6d",
  "expires_at": "2026-10-28T16:56:24.120387413Z",
  "resend_available_at": "2026-10-28T16:51:25.120387413Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "414560",
  "sent_at": "2026-10-28T16:51:24.123317823Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b16e2259-1756-4e2c-a8bb-4d0969fbae6d",
  "code": "414560",
  "device_ref": "sandbox-2951"
}
```

```json
{
  "session_id": "ef1172a0-5504-4c45-85d5-bf654a9880c7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNzE4NCwiaWF0IjoxNzkzMjA2Mjg0LCJqdGkiOiJjYmI4NTYxMi00NTQ3LTRjMDctOGY2OC00NTgyMDVmZjQwNjEiLCJzaWQiOiJlZjExNzJhMC01NTA0LTRjNDUtODVkNS1iZjY1NGE5ODgwYzcifQ.wWBMZvW6un2vRGLymZHkhTFH7NkmVZ2We_rh6CZHw4M",
  "access_expires_at": "2026-10-28T17:06:24.408793609Z",
  "refresh_token": "MMoSkJYU7wepEkQ_dB5gxE2MK1FaSP07SRB0OxNDolE",
  "refresh_expires_at": "2026-11-27T16:51:24.408130584Z",
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
  "command_id": "5d0ecfe0-6118-4e45-bc00-54ad0095203d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "2d3cf0a8-cbc4-401e-9aa3-93bb31c1ecca",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-2d3cf0a8-cbc4-401e-9aa3-93bb31c1ecca",
    "orderDate": "1793206284",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "225172ece18649b608efc0a0f5b92de8",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=2d3cf0a8-cbc4-401e-9aa3-93bb31c1ecca",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=2d3cf0a8-cbc4-401e-9aa3-93bb31c1ecca",
  "created_at": "2026-10-28T16:51:24.947417Z",
  "expires_at": "2026-10-28T17:21:24.947417Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/2d3cf0a8-cbc4-401e-9aa3-93bb31c1ecca` → **200**

```json
{
  "id": "2d3cf0a8-cbc4-401e-9aa3-93bb31c1ecca",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T16:51:24.947417Z",
  "expires_at": "2026-10-28T17:21:24.947417Z",
  "completed_at": "2026-10-28T16:51:25.218117Z",
  "masked_pan": "41****8856",
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
      "id": "4c15cb4e-56e9-4839-abff-7cb34ac2bbd0",
      "at": "2026-10-28T16:51:25.559849Z",
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
  "command_id": "0e704173-8ad4-47c4-bff0-94171392bcc9",
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
  "correlation_id": "2fe67bef-e922-47bb-8d9e-fe9cc2f5529b"
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
  "session_id": "b63a4313-466c-403e-8c35-905dd91aa289",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcxODcsImlhdCI6MTc5MzIwNjI4NywianRpIjoiN2ZlNjQ0ZmItNWIxYS00NGUzLThjNzEtZjcxMWZmOWNiMzU2Iiwic2lkIjoiYjYzYTQzMTMtNDY2Yy00MDNlLThjMzUtOTA1ZGQ5MWFhMjg5In0.6drvkzZooUrL5V43y9eqdplBd8jJhzhK3Sl8yEe3O_w",
  "access_expires_at": "2026-10-28T17:06:27.655012395Z",
  "refresh_token": "jEb0fj0laektGvUg9yzVlDfM_AOe4HxsfkwpVcTxk0w",
  "refresh_expires_at": "2026-10-29T04:51:27.654436753Z",
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
  "phone": "+48600348673",
  "device_ref": "sandbox-20610"
}
```

```json
{
  "challenge_id": "1b812047-a47a-45b9-962d-542ae87c1472",
  "expires_at": "2026-10-28T16:56:28.477958326Z",
  "resend_available_at": "2026-10-28T16:51:29.477958326Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600348673` → **200**

```json
{
  "phone": "+48600348673",
  "audience": "CLIENT",
  "code": "988217",
  "sent_at": "2026-10-28T16:51:28.480623739Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1b812047-a47a-45b9-962d-542ae87c1472",
  "code": "988217",
  "device_ref": "sandbox-20610"
}
```

```json
{
  "session_id": "e780908a-dbe0-4a15-8f2b-9534b51bc2fc",
  "subject": {
    "type": "CLIENT",
    "id": "34f2f553-2ff3-4686-8775-ac45a12e600f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNGYyZjU1My0yZmYzLTQ2ODYtODc3NS1hYzQ1YTEyZTYwMGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3MTg4LCJpYXQiOjE3OTMyMDYyODgsImp0aSI6IjU4ZGU5Mzg0LWRhM2EtNDY4NC1iNDA2LWM2MjViZmMxYTRkZiIsInNpZCI6ImU3ODA5MDhhLWRiZTAtNGExNS04ZjJiLTk1MzRiNTFiYzJmYyJ9.3jihdKZkTx49leQmCZ1_9ZFe23ftdEajvzD6sfNgKeM",
  "access_expires_at": "2026-10-28T17:06:28.77316285Z",
  "refresh_token": "KrwHm3xmKIE1pjcLbLXEXwdYQaabuUCTZSTx_Wwunrs",
  "refresh_expires_at": "2026-11-27T16:51:28.772366493Z",
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
  "command_id": "36d942a7-a32c-4d86-b151-592f32f2a3e8",
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
  "correlation_id": "6ef1d8a0-5997-4b95-aad8-fef600fa583a",
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
  "command_id": "4c0f9da8-db33-47bf-a42e-700f194fad1f",
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
  "paused_at": "2026-10-28T16:51:29.864157492Z",
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
  "command_id": "3d3109b3-62f1-4253-8813-a0eb152e5a83",
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
  "id": "6e0a4e29-4346-49da-9d47-0a25b74417bb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:56:30.423819Z",
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
  "command_id": "ff36b234-daab-4d38-a06d-855395da4182",
  "quote_id": "6e0a4e29-4346-49da-9d47-0a25b74417bb",
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
  "correlation_id": "c44af405-2759-4bd4-ba15-73d107fa161a"
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
  "paused_at": "2026-10-28T16:51:29.864157Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "6e6ec588-8c25-4a94-a568-6c143eca862e",
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
  "command_id": "602d2742-e387-4b03-b10d-f61a2e5405ab",
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
  "command_id": "fb2726a5-2f01-4cfe-b721-56b7716a805a",
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
  "id": "43813846-c184-4c8a-8c26-6429fa80ad59",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:56:32.089846Z",
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
  "command_id": "df200062-ff11-45f1-b558-8f453ee3a97f",
  "quote_id": "43813846-c184-4c8a-8c26-6429fa80ad59",
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
  "correlation_id": "e91db9b9-8bec-462a-86f1-673ea9961c12"
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
  "command_id": "56f7baf6-9930-49ad-8785-c9880c4de874",
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
  "command_id": "b562f421-6588-4d2d-a30e-be335c9df082",
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
  "id": "972aa69e-c38c-4b2c-a341-65ee2b17f612",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:56:33.184010Z",
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
  "command_id": "16e54762-a1cb-4e7c-8d20-43c8249ceadd",
  "quote_id": "972aa69e-c38c-4b2c-a341-65ee2b17f612",
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
  "correlation_id": "5cfaa0a1-b8ee-4aa2-a709-95e645821ddd"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "9e65d241-e379-4650-a537-518eaf6d3994",
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
  "correlation_id": "30ccfad5-9ed9-461f-a6c0-a93663df32de"
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
  "command_id": "ed16f14f-a3cd-40fe-908b-631df9ae80c4",
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
  "phone": "+380672192906",
  "device_ref": "sandbox-27391"
}
```

```json
{
  "challenge_id": "c4691f89-7622-4789-9cab-e29469096dbd",
  "expires_at": "2026-10-28T16:56:34.581454247Z",
  "resend_available_at": "2026-10-28T16:51:35.581454247Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672192906` → **200**

```json
{
  "phone": "+380672192906",
  "audience": "CLIENT",
  "code": "848499",
  "sent_at": "2026-10-28T16:51:34.584230227Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c4691f89-7622-4789-9cab-e29469096dbd",
  "code": "848499",
  "device_ref": "sandbox-27391"
}
```

```json
{
  "session_id": "b79e2393-6a10-4071-9914-c3ca02b1411c",
  "subject": {
    "type": "CLIENT",
    "id": "6c435bb5-5e9c-463a-9155-09b2e9614fba"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YzQzNWJiNS01ZTljLTQ2M2EtOTE1NS0wOWIyZTk2MTRmYmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3MTk0LCJpYXQiOjE3OTMyMDYyOTQsImp0aSI6IjhiNGE3NDIxLTFiZWMtNDdmNS04ODhmLTU2YTQwZGRkYTgxNCIsInNpZCI6ImI3OWUyMzkzLTZhMTAtNDA3MS05OTE0LWMzY2EwMmIxNDExYyJ9.XAc7KcCBpcpgkG-OO3Bc2oO_GxdN2JbC6vfqpOsjeeA",
  "access_expires_at": "2026-10-28T17:06:34.880537119Z",
  "refresh_token": "tFCO-wFYob8DQASIEqRvCEV0GVjeAEeCOXlVL4dzi1Y",
  "refresh_expires_at": "2026-11-27T16:51:34.8798779Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6c435bb5-5e9c-463a-9155-09b2e9614fba",
  "session_id": "b79e2393-6a10-4071-9914-c3ca02b1411c",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2e61cf06-6dac-400c-9f77-10f030536823",
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
  "id": "0307280c-c9b2-488a-a3ca-cf90fa082d8c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:56:35.414740Z",
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
  "challenge_id": "34c33136-14e7-486c-aeb2-fecf1f94cbd6",
  "expires_at": "2026-10-28T16:56:37.686113483Z",
  "resend_available_at": "2026-10-28T16:51:38.686113483Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672192906` → **200**

```json
{
  "phone": "+380672192906",
  "audience": "CLIENT",
  "code": "505606",
  "sent_at": "2026-10-28T16:51:37.68827782Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "cdfac342-4eab-42e0-8113-21b4cf8ce79b",
  "challenge_id": "34c33136-14e7-486c-aeb2-fecf1f94cbd6",
  "otp_code": "505606"
}
```

```json
{
  "client_id": "6c435bb5-5e9c-463a-9155-09b2e9614fba",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T16:51:37.986647731Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "2d60cd37-436b-4e2c-a7f9-5000eaf1e08e",
  "quote_id": "0307280c-c9b2-488a-a3ca-cf90fa082d8c",
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
  "correlation_id": "d7a9be97-269a-4408-8fe0-d12c14342b5c"
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
  "session_id": "3a737a02-b747-4f84-a724-d66ff3503151",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcxOTgsImlhdCI6MTc5MzIwNjI5OCwianRpIjoiYzhmNDU2NDYtNzRmYS00ODA1LThmNGYtODVmMzhmNWFmMGU1Iiwic2lkIjoiM2E3MzdhMDItYjc0Ny00Zjg0LWE3MjQtZDY2ZmYzNTAzMTUxIn0.9lnueqBXQ7ex-xMjHAVQNtQ3n8pBPRKAqyBM13riASk",
  "access_expires_at": "2026-10-28T17:06:38.852810067Z",
  "refresh_token": "elEu9iy7FdTfGKIrmrKjR6v0kxoYFD_3dW5u2MzBWQw",
  "refresh_expires_at": "2026-10-29T04:51:38.852150053Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "6c435bb5-5e9c-463a-9155-09b2e9614fba",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T16:51:37.986648Z",
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

`POST /api/admin/v1/client-deletions/6c435bb5-5e9c-463a-9155-09b2e9614fba/complete` → **200**

```json
{
  "command_id": "686a443b-99cc-495d-bc57-f708ad54e4d9",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "6c435bb5-5e9c-463a-9155-09b2e9614fba",
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
  "correlation_id": "c88b56c9-139f-4a3d-a269-9f88c888ecfd"
}
```

Done: client 6c435bb5-5e9c-463a-9155-09b2e9614fba anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660590273",
  "device_ref": "sandbox-876"
}
```

```json
{
  "challenge_id": "808d0af3-cafb-4e41-b1d5-a2cef1087584",
  "expires_at": "2026-10-28T16:56:39.959406914Z",
  "resend_available_at": "2026-10-28T16:51:40.959406914Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660590273` → **200**

```json
{
  "phone": "+380660590273",
  "audience": "CLIENT",
  "code": "802544",
  "sent_at": "2026-10-28T16:51:39.962193549Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "808d0af3-cafb-4e41-b1d5-a2cef1087584",
  "code": "802544",
  "device_ref": "sandbox-876"
}
```

```json
{
  "session_id": "3a3e754b-dc66-4710-9f0d-25fa6534c7ba",
  "subject": {
    "type": "CLIENT",
    "id": "fb77148c-815a-43ca-b20b-0d6b1ed9c724"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjc3MTQ4Yy04MTVhLTQzY2EtYjIwYi0wZDZiMWVkOWM3MjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3MjAwLCJpYXQiOjE3OTMyMDYzMDAsImp0aSI6IjQ2N2RjNWJjLTFmN2ItNGU4ZS04N2MyLTQxZjRhNzU3YTZjNyIsInNpZCI6IjNhM2U3NTRiLWRjNjYtNDcxMC05ZjBkLTI1ZmE2NTM0YzdiYSJ9.GUkZQ1iG8LhOeK6ohfgCNwzl8hSfesYEXctu4jMZojM",
  "access_expires_at": "2026-10-28T17:06:40.249254129Z",
  "refresh_token": "ijyW3syUaFoGHV5AXfwy4w-3pYU5WGzgEBy55VPrfjQ",
  "refresh_expires_at": "2026-11-27T16:51:40.248630182Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "fb77148c-815a-43ca-b20b-0d6b1ed9c724",
  "session_id": "3a3e754b-dc66-4710-9f0d-25fa6534c7ba",
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
  "session_id": "401ed87b-ac49-4271-9220-550cf771190b",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcyMDEsImlhdCI6MTc5MzIwNjMwMSwianRpIjoiYmZkMzIwMzQtOGNjYS00NDA2LTg0MDUtMzQ2ZDhmZWRmMzRhIiwic2lkIjoiNDAxZWQ4N2ItYWM0OS00MjcxLTkyMjAtNTUwY2Y3NzExOTBiIn0.WGJegJ_4ubaoZEo9aqP8W9Ye1DGTYgk9ilkhHT1ZTFY",
  "access_expires_at": "2026-10-28T17:06:41.094723316Z",
  "refresh_token": "k1NkPDijZKEiuV351RLIv2dhfAXkjfvp7AubGS_QRj8",
  "refresh_expires_at": "2026-10-29T04:51:41.094020884Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=0590273&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "fb77148c-815a-43ca-b20b-0d6b1ed9c724",
      "phone": "+380660590273",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T16:51:40.246482Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/fb77148c-815a-43ca-b20b-0d6b1ed9c724` → **200**

```json
{
  "client": {
    "id": "fb77148c-815a-43ca-b20b-0d6b1ed9c724",
    "phone": "+380660590273",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T16:51:40.246482Z",
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

`POST /api/admin/v1/clients/fb77148c-815a-43ca-b20b-0d6b1ed9c724/block` → **400**

```json
{
  "command_id": "fcf962f6-8d8e-41fc-a758-4f2c804287d3",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/fb77148c-815a-43ca-b20b-0d6b1ed9c724/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "0b084ea5-95e7-4a52-8c4d-95a19c3ed212",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/fb77148c-815a-43ca-b20b-0d6b1ed9c724/block` → **200**

```json
{
  "command_id": "30499ebc-b8c2-4247-9e83-282796aeaeb0",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "fb77148c-815a-43ca-b20b-0d6b1ed9c724",
  "phone": "+380660590273",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T16:51:40.246482Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T16:51:42.22281Z",
    "by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
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
  "correlation_id": "f9c0fcf9-edd5-4e50-859a-337383973367"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660590273",
  "device_ref": "sandbox-10826"
}
```

```json
{
  "challenge_id": "6ec07f87-13d5-44cf-8405-287ed1c61d0a",
  "expires_at": "2026-10-28T16:56:44.770419376Z",
  "resend_available_at": "2026-10-28T16:51:45.770419376Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660590273` → **200**

```json
{
  "phone": "+380660590273",
  "audience": "CLIENT",
  "code": "946515",
  "sent_at": "2026-10-28T16:51:44.772889363Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "6ec07f87-13d5-44cf-8405-287ed1c61d0a",
  "code": "946515",
  "device_ref": "sandbox-10826"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "7f453ba5-77c9-4299-8d6a-3068042f05ae"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/fb77148c-815a-43ca-b20b-0d6b1ed9c724` → **200**

```json
{
  "client": {
    "id": "fb77148c-815a-43ca-b20b-0d6b1ed9c724",
    "phone": "+380660590273",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T16:51:40.246482Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T16:51:42.22281Z",
      "by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
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

`POST /api/admin/v1/clients/fb77148c-815a-43ca-b20b-0d6b1ed9c724/unblock` → **200**

```json
{
  "command_id": "92609c71-78f1-4d57-8d1b-8a81038d3bf9",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "fb77148c-815a-43ca-b20b-0d6b1ed9c724",
  "phone": "+380660590273",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T16:51:40.246482Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660590273",
  "device_ref": "sandbox-10874"
}
```

```json
{
  "challenge_id": "e1180421-6136-4665-bda9-ebb42a77f342",
  "expires_at": "2026-10-28T16:56:47.89299959Z",
  "resend_available_at": "2026-10-28T16:51:48.89299959Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660590273` → **200**

```json
{
  "phone": "+380660590273",
  "audience": "CLIENT",
  "code": "002626",
  "sent_at": "2026-10-28T16:51:47.895268599Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e1180421-6136-4665-bda9-ebb42a77f342",
  "code": "002626",
  "device_ref": "sandbox-10874"
}
```

```json
{
  "session_id": "bbd3aa8a-52f2-4715-8c30-7d3fc85e1afe",
  "subject": {
    "type": "CLIENT",
    "id": "fb77148c-815a-43ca-b20b-0d6b1ed9c724"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjc3MTQ4Yy04MTVhLTQzY2EtYjIwYi0wZDZiMWVkOWM3MjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3MjA4LCJpYXQiOjE3OTMyMDYzMDgsImp0aSI6IjZiZGE3YmMwLTJhYmItNDRlOC1iN2VlLTlhMjRkMDRjMTc5OCIsInNpZCI6ImJiZDNhYThhLTUyZjItNDcxNS04YzMwLTdkM2ZjODVlMWFmZSJ9.MOZrm-emXjflJ695iJCHSUropNOiAYosg2jh7Cnq73s",
  "access_expires_at": "2026-10-28T17:06:48.181718824Z",
  "refresh_token": "Urhwj54iRHTmFmwbqsboh9I7QvRLxMIFvxDO57wqlwc",
  "refresh_expires_at": "2026-11-27T16:51:48.1809541Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "fb77148c-815a-43ca-b20b-0d6b1ed9c724",
  "session_id": "bbd3aa8a-52f2-4715-8c30-7d3fc85e1afe",
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
  "phone": "+380664406830",
  "device_ref": "sandbox-2391"
}
```

```json
{
  "challenge_id": "b590664a-377d-4809-8181-9947f3690d2f",
  "expires_at": "2026-10-28T16:56:48.720244714Z",
  "resend_available_at": "2026-10-28T16:51:49.720244714Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664406830` → **200**

```json
{
  "phone": "+380664406830",
  "audience": "CLIENT",
  "code": "697347",
  "sent_at": "2026-10-28T16:51:48.722813149Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b590664a-377d-4809-8181-9947f3690d2f",
  "code": "697347",
  "device_ref": "sandbox-2391"
}
```

```json
{
  "session_id": "b023b6f2-b9ca-4c2f-992f-c4d3fb1ab351",
  "subject": {
    "type": "CLIENT",
    "id": "c6dd2b7b-bb60-4556-8141-220815882830"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNmRkMmI3Yi1iYjYwLTQ1NTYtODE0MS0yMjA4MTU4ODI4MzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3MjA5LCJpYXQiOjE3OTMyMDYzMDksImp0aSI6IjVkYWQyZjNlLWZjZmMtNDlhMS04ZjFhLTU3ZTliOTdjMDczOCIsInNpZCI6ImIwMjNiNmYyLWI5Y2EtNGMyZi05OTJmLWM0ZDNmYjFhYjM1MSJ9.WjFXmp6bhXjg18It-llmH93tSFx3RqtTIaw1qkSFMXg",
  "access_expires_at": "2026-10-28T17:06:49.01675422Z",
  "refresh_token": "514nE9pykTwn0lTDATcDrrDaPyeXvNFbnoRYH1Qnzt4",
  "refresh_expires_at": "2026-11-27T16:51:49.016268561Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "af6f5a37-327c-4ab7-882d-69eb6acb3789",
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
  "id": "4cf6bc96-6ba1-490e-ba45-130e6ded2a02",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:56:49.299164Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 6d5a165e-5b29-4747-be02-c60efc7dc5cc) → **201**

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
  "session_id": "62a9f7eb-467a-4c9b-a0f2-54809d9aa9c3",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcyMDksImlhdCI6MTc5MzIwNjMwOSwianRpIjoiODZmZDc2YjAtOGJlNi00MzFiLTg5MTMtNWY3YmI1ZmJjYmVmIiwic2lkIjoiNjJhOWY3ZWItNDY3YS00YzliLWEwZjItNTQ4MDlkOWFhOWMzIn0.IFSAM19DDsXD0OUYlbVso-x1Ue76qGgzAb55mHIwSdA",
  "access_expires_at": "2026-10-28T17:06:49.936664802Z",
  "refresh_token": "HLv8Xyd4RghZWLQzjHFkbYIeDhWSGGNTKIHbsjcmlrQ",
  "refresh_expires_at": "2026-10-29T04:51:49.936144242Z",
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
  "session_id": "c227448b-4195-4edf-a135-03947b7ba9af",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcyMTAsImlhdCI6MTc5MzIwNjMxMCwianRpIjoiZjEzODc0NGMtMjFlNS00NDVlLTgyN2MtY2MyYjY4OTJhOTU1Iiwic2lkIjoiYzIyNzQ0OGItNDE5NS00ZWRmLWExMzUtMDM5NDdiN2JhOWFmIn0.gE5bNGuFXUTQuPMuQPRjx5KAQBk0ZkOW6poJKg3yfsg",
  "access_expires_at": "2026-10-28T17:06:50.513382169Z",
  "refresh_token": "5iSQb1vUPERrU1pMcjoJx0M3z-7NWLITimgwuaJi-B0",
  "refresh_expires_at": "2026-10-29T04:51:50.512689682Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/be390f55-692f-4ee0-950d-728d292040f2/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:51:49.580199Z",
      "actor": {
        "type": "CLIENT",
        "id": "c6dd2b7b-bb60-4556-8141-220815882830",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "be390f55-692f-4ee0-950d-728d292040f2",
        "quote_id": "4cf6bc96-6ba1-490e-ba45-130e6ded2a02",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "6d5a165e-5b29-4747-be02-c60efc7dc5cc"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:51:49.58207Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "be390f55-692f-4ee0-950d-728d292040f2",
        "attempt_id": "f63698da-5d42-4027-a2cc-61632602522f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "6d5a165e-5b29-4747-be02-c60efc7dc5cc"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T16:51:49.591472Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "be390f55-692f-4ee0-950d-728d292040f2",
        "attempt_id": "f63698da-5d42-4027-a2cc-61632602522f"
      },
      "correlation_id": "6d5a165e-5b29-4747-be02-c60efc7dc5cc"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "f63698da-5d42-4027-a2cc-61632602522f",
        "generation": 1,
        "started_at": "2026-10-28T16:51:49.581131Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T16:51:49.591472Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T16:51:49.582967Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/6d5a165e-5b29-4747-be02-c60efc7dc5cc` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "be390f55-692f-4ee0-950d-728d292040f2:0",
      "order_id": "be390f55-692f-4ee0-950d-728d292040f2",
      "at": "2026-10-28T16:51:49.580199Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "be390f55-692f-4ee0-950d-728d292040f2:1",
      "order_id": "be390f55-692f-4ee0-950d-728d292040f2",
      "at": "2026-10-28T16:51:49.58207Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "be390f55-692f-4ee0-950d-728d292040f2:2",
      "order_id": "be390f55-692f-4ee0-950d-728d292040f2",
      "at": "2026-10-28T16:51:49.591472Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/36af02f6-551a-4956-84aa-43665f3c5bf4` → **200**

```json
{
  "found": []
}
```

Done: request 6d5a165e-5b29-4747-be02-c60efc7dc5cc — order be390f55-692f-4ee0-950d-728d292040f2 found by its id.

`GET /api/rider/v1/orders/be390f55-692f-4ee0-950d-728d292040f2` → **200**

```json
{
  "id": "be390f55-692f-4ee0-950d-728d292040f2",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c6dd2b7b-bb60-4556-8141-220815882830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:51:49.579481Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/be390f55-692f-4ee0-950d-728d292040f2/cancel` → **200**

```json
{
  "command_id": "962c701d-52d0-4f4d-80c7-0d8e9c5515c1",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "be390f55-692f-4ee0-950d-728d292040f2",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c6dd2b7b-bb60-4556-8141-220815882830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:51:49.579481Z",
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
  "phone": "+380630661583",
  "device_ref": "sandbox-14515"
}
```

```json
{
  "challenge_id": "67c83c49-ca61-4569-b7ad-7b7ab0c6e916",
  "expires_at": "2026-10-28T16:56:52.169107242Z",
  "resend_available_at": "2026-10-28T16:51:53.169107242Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630661583` → **200**

```json
{
  "phone": "+380630661583",
  "audience": "CLIENT",
  "code": "121009",
  "sent_at": "2026-10-28T16:51:52.171573416Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "67c83c49-ca61-4569-b7ad-7b7ab0c6e916",
  "code": "121009",
  "device_ref": "sandbox-14515"
}
```

```json
{
  "session_id": "3148605e-3f15-441a-9352-e4309f81fa30",
  "subject": {
    "type": "CLIENT",
    "id": "76d4f69d-fa6b-470d-b465-2b5062743c80"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NmQ0ZjY5ZC1mYTZiLTQ3MGQtYjQ2NS0yYjUwNjI3NDNjODAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3MjEyLCJpYXQiOjE3OTMyMDYzMTIsImp0aSI6IjhkNzcyMGNjLTk3MDgtNGQwYS1iOTJkLWI5N2FjMGIzNmZlZiIsInNpZCI6IjMxNDg2MDVlLTNmMTUtNDQxYS05MzUyLWU0MzA5ZjgxZmEzMCJ9.1s1OAEF0_cscUfJaD83QcjCDkzV6Mwj-NBjTEPdaEJc",
  "access_expires_at": "2026-10-28T17:06:52.468766467Z",
  "refresh_token": "23Vi1aa1hawFZoNYHQM5zGUknDZTXVC7qviYiKWbq2Y",
  "refresh_expires_at": "2026-11-27T16:51:52.468217614Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "c6035f6e-a406-4f23-9964-4b079abcff68",
  "expires_at": "2026-10-28T16:56:54.740102183Z",
  "resend_available_at": "2026-10-28T16:51:55.740102183Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630661583` → **200**

```json
{
  "phone": "+380630661583",
  "audience": "CLIENT",
  "code": "446317",
  "sent_at": "2026-10-28T16:51:54.742149812Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "11e66e1d-1bdf-45a2-9378-2550dfb6e8a3",
  "challenge_id": "c6035f6e-a406-4f23-9964-4b079abcff68",
  "otp_code": "446317"
}
```

```json
{
  "id": "fe255673-aa9b-405b-a8e6-dfb70dae2daf",
  "state": "PENDING",
  "created_at": "2026-10-28T16:51:55.035781Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/fe255673-aa9b-405b-a8e6-dfb70dae2daf` → **200**

```json
{
  "id": "fe255673-aa9b-405b-a8e6-dfb70dae2daf",
  "state": "PENDING",
  "created_at": "2026-10-28T16:51:55.035781Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/fe255673-aa9b-405b-a8e6-dfb70dae2daf` → **200**

```json
{
  "id": "fe255673-aa9b-405b-a8e6-dfb70dae2daf",
  "state": "PENDING",
  "created_at": "2026-10-28T16:51:55.035781Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/fe255673-aa9b-405b-a8e6-dfb70dae2daf` → **200**

```json
{
  "id": "fe255673-aa9b-405b-a8e6-dfb70dae2daf",
  "state": "PENDING",
  "created_at": "2026-10-28T16:51:55.035781Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/fe255673-aa9b-405b-a8e6-dfb70dae2daf` → **200**

```json
{
  "id": "fe255673-aa9b-405b-a8e6-dfb70dae2daf",
  "state": "PENDING",
  "created_at": "2026-10-28T16:51:55.035781Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/fe255673-aa9b-405b-a8e6-dfb70dae2daf` → **200**

```json
{
  "id": "fe255673-aa9b-405b-a8e6-dfb70dae2daf",
  "state": "PENDING",
  "created_at": "2026-10-28T16:51:55.035781Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/fe255673-aa9b-405b-a8e6-dfb70dae2daf` → **200**

```json
{
  "id": "fe255673-aa9b-405b-a8e6-dfb70dae2daf",
  "state": "PENDING",
  "created_at": "2026-10-28T16:51:55.035781Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/fe255673-aa9b-405b-a8e6-dfb70dae2daf` → **200**

```json
{
  "id": "fe255673-aa9b-405b-a8e6-dfb70dae2daf",
  "state": "PENDING",
  "created_at": "2026-10-28T16:51:55.035781Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/fe255673-aa9b-405b-a8e6-dfb70dae2daf` → **200**

```json
{
  "id": "fe255673-aa9b-405b-a8e6-dfb70dae2daf",
  "state": "PENDING",
  "created_at": "2026-10-28T16:51:55.035781Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/fe255673-aa9b-405b-a8e6-dfb70dae2daf` → **200**

```json
{
  "id": "fe255673-aa9b-405b-a8e6-dfb70dae2daf",
  "state": "READY",
  "created_at": "2026-10-28T16:51:55.035781Z",
  "ready_at": "2026-10-28T16:52:04.973069Z",
  "expires_at": "2026-11-04T16:52:04.973069Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/fe255673-aa9b-405b-a8e6-dfb70dae2daf/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639023331",
  "device_ref": "sandbox-31703"
}
```

```json
{
  "challenge_id": "6ad01b16-a251-496e-9c75-d395e1e3c5fd",
  "expires_at": "2026-10-28T16:57:05.677381671Z",
  "resend_available_at": "2026-10-28T16:52:06.677381671Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639023331` → **200**

```json
{
  "phone": "+380639023331",
  "audience": "CLIENT",
  "code": "936975",
  "sent_at": "2026-10-28T16:52:05.679888011Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6ad01b16-a251-496e-9c75-d395e1e3c5fd",
  "code": "936975",
  "device_ref": "sandbox-31703"
}
```

```json
{
  "session_id": "f920c764-2fd6-4e6e-b0fe-ec742a23f5db",
  "subject": {
    "type": "CLIENT",
    "id": "3bf30b82-3b8a-40e9-8e24-2daeae765b73"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYmYzMGI4Mi0zYjhhLTQwZTktOGUyNC0yZGFlYWU3NjViNzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3MjI1LCJpYXQiOjE3OTMyMDYzMjUsImp0aSI6ImM5ZDAyYjFhLTkxZTctNGU0Yi1hYjg5LTZmZjExNzExNjhmYyIsInNpZCI6ImY5MjBjNzY0LTJmZDYtNGU2ZS1iMGZlLWVjNzQyYTIzZjVkYiJ9.3LN6aJLmZxSHmQi1HRcSa8UN_0rJsR-rcUbxdSaoxow",
  "access_expires_at": "2026-10-28T17:07:05.960713454Z",
  "refresh_token": "ZE4jRnwW5nFdrc0SVn1-yIpRajAbSd6ByJA9VCvqKsU",
  "refresh_expires_at": "2026-11-27T16:52:05.96027048Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/fe255673-aa9b-405b-a8e6-dfb70dae2daf/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/fe255673-aa9b-405b-a8e6-dfb70dae2daf/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0cdbc811-e67c-483a-a3f7-a1cb6e693526"
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
  "session_id": "fa8a9c3b-69d0-4ad1-840f-691c7d360936",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcyMjYsImlhdCI6MTc5MzIwNjMyNiwianRpIjoiNGM5ZmE2YzEtNjhhYy00NjNhLTk3MmYtNTQ2YTVkNGQxZmY3Iiwic2lkIjoiZmE4YTljM2ItNjlkMC00YWQxLTg0MGYtNjkxYzdkMzYwOTM2In0.jrGQ1q4Fy5Qad89z61Vc4nyO2Hxf1SyEci3TS7NqKRk",
  "access_expires_at": "2026-10-28T17:07:06.802497348Z",
  "refresh_token": "PwQKt32927cn5UoXaGUVUh_MQnnn7ty0Vv1KoE3urxA",
  "refresh_expires_at": "2026-10-29T04:52:06.801891403Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "76d4f69d-fa6b-470d-b465-2b5062743c80",
  "session_id": "3148605e-3f15-441a-9352-e4309f81fa30",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/76d4f69d-fa6b-470d-b465-2b5062743c80/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "fe255673-aa9b-405b-a8e6-dfb70dae2daf",
      "state": "READY",
      "created_at": "2026-10-28T16:51:55.035781Z",
      "ready_at": "2026-10-28T16:52:04.973069Z",
      "expires_at": "2026-11-04T16:52:04.973069Z",
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
  "device_ref": "sandbox-6922"
}
```

```json
{
  "challenge_id": "e1c786f1-ea89-4d9f-808b-3aae5787f3c6",
  "expires_at": "2026-10-28T16:57:07.583183336Z",
  "resend_available_at": "2026-10-28T16:52:08.583183336Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "757522",
  "sent_at": "2026-10-28T16:52:07.585448377Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e1c786f1-ea89-4d9f-808b-3aae5787f3c6",
  "code": "757522",
  "device_ref": "sandbox-6922"
}
```

```json
{
  "session_id": "9dcde227-51a0-4d73-852c-d2810a5bc67d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNzIyNywiaWF0IjoxNzkzMjA2MzI3LCJqdGkiOiI5OTc1MzE1ZC0yOGY3LTQ0OTUtOTJhNC02YTM1MTY1ZTU5MWYiLCJzaWQiOiI5ZGNkZTIyNy01MWEwLTRkNzMtODUyYy1kMjgxMGE1YmM2N2QifQ.HyCtasfecUXeyCHTxiOKNt2UvWHhowHzahgEnx7E96E",
  "access_expires_at": "2026-10-28T17:07:07.872573411Z",
  "refresh_token": "Jja-UaIyFEuvNxAn9MF4_PHuKLe8fRvKN0Lpfqf6wC0",
  "refresh_expires_at": "2026-11-27T16:52:07.871899036Z",
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
  "device_ref": "sandbox-31505"
}
```

```json
{
  "challenge_id": "151a2c49-614c-4492-93cc-2ec7b1d6f363",
  "expires_at": "2026-10-28T16:57:08.386438373Z",
  "resend_available_at": "2026-10-28T16:52:09.386438373Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "709932",
  "sent_at": "2026-10-28T16:52:08.388977864Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "151a2c49-614c-4492-93cc-2ec7b1d6f363",
  "code": "709932",
  "device_ref": "sandbox-31505"
}
```

```json
{
  "session_id": "75188d5e-3e03-4cb3-a771-a4377cc54cbc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNzIyOCwiaWF0IjoxNzkzMjA2MzI4LCJqdGkiOiIxZWIxYzA5NC0xOTc0LTRmZTQtYjk5MC01NmQ0ODBlYWM1OWUiLCJzaWQiOiI3NTE4OGQ1ZS0zZTAzLTRjYjMtYTc3MS1hNDM3N2NjNTRjYmMifQ.4lB52WiyqIa7lyzXL6Jx_XjXo9NwxbJnHgmxPn5VHiU",
  "access_expires_at": "2026-10-28T17:07:08.669434488Z",
  "refresh_token": "8UlnWv5rkra0S4wUxj1S6eOIUchv1CJywEzWhjfmVKs",
  "refresh_expires_at": "2026-11-27T16:52:08.668627523Z",
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
  "command_id": "d5f59e2e-9f52-4606-8951-d6359b60c949",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:52:09Z",
    "sequence": 1793206329173
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "14bb03fd-20e5-4d33-87dc-39a298d17439",
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
  "last_heartbeat_at": "2026-10-28T16:52:09.192388Z",
  "last_location_at": "2026-10-28T16:52:09.192388Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-10324"
}
```

```json
{
  "challenge_id": "bf26ee75-690c-46b8-87d7-ab2b3d9a32ec",
  "expires_at": "2026-10-28T16:57:09.470202385Z",
  "resend_available_at": "2026-10-28T16:52:10.470202385Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "159465",
  "sent_at": "2026-10-28T16:52:09.472998806Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bf26ee75-690c-46b8-87d7-ab2b3d9a32ec",
  "code": "159465",
  "device_ref": "sandbox-10324"
}
```

```json
{
  "session_id": "97bfea71-8f51-46a2-934a-9cb2b6c78c91",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNzIyOSwiaWF0IjoxNzkzMjA2MzI5LCJqdGkiOiI0Yzg3YTk0MS1kM2U4LTQxZjYtOGM1Mi01MDk5NzNlNTFjNzQiLCJzaWQiOiI5N2JmZWE3MS04ZjUxLTQ2YTItOTM0YS05Y2IyYjZjNzhjOTEifQ.Igh5lFgOdGMH72fkafyLlBDhCAdpdGHyD2_Bi1EegsY",
  "access_expires_at": "2026-10-28T17:07:09.763418861Z",
  "refresh_token": "JxqPxPnVAQ3JhEsJeO75-rp68hXFW_iCbPpyWW55esk",
  "refresh_expires_at": "2026-11-27T16:52:09.76282295Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "58485797-bc76-4dc6-9044-4b8d337aadbe",
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
  "last_heartbeat_at": "2026-10-28T16:51:02.5693Z",
  "last_location_at": "2026-10-28T16:51:02.5693Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/58485797-bc76-4dc6-9044-4b8d337aadbe/handover` → **200**

```json
{
  "command_id": "d74a5d4a-fbfe-46f3-b2ca-65f47dc1e9b1",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "58485797-bc76-4dc6-9044-4b8d337aadbe",
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
  "last_heartbeat_at": "2026-10-28T16:51:02.5693Z",
  "last_location_at": "2026-10-28T16:51:02.5693Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/58485797-bc76-4dc6-9044-4b8d337aadbe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:52:10Z",
    "sequence": 1793206330549
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "58485797-bc76-4dc6-9044-4b8d337aadbe",
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
  "last_heartbeat_at": "2026-10-28T16:52:10.568305Z",
  "last_location_at": "2026-10-28T16:52:10.568305Z",
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
  "session_id": "c832c7a8-d028-4dab-81a6-e3bcf3f82b68",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcyMzEsImlhdCI6MTc5MzIwNjMzMSwianRpIjoiNGU4ZTQ1ZTUtMmI2Yy00YTMxLWFkMzQtM2EzOWI4MmJjOTc2Iiwic2lkIjoiYzgzMmM3YTgtZDAyOC00ZGFiLTgxYTYtZTNiY2YzZjgyYjY4In0.Nu3cotsgdCq-YUHGaoaj6mT6ygduNpgJhiZ3rAyrb-8",
  "access_expires_at": "2026-10-28T17:07:11.141185623Z",
  "refresh_token": "Ahsm7q7hgfuxhgCQfC3kqe42Qp4NqyjTDj_927KlChg",
  "refresh_expires_at": "2026-10-29T04:52:11.14056145Z",
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
  "session_id": "bf4e6507-ec77-4b89-ac9e-fe5e8523032a",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcyMzEsImlhdCI6MTc5MzIwNjMzMSwianRpIjoiOGY1N2NkMzItMjNmNC00ZjA4LTkwMDEtYzM2OGZlMjliNzVhIiwic2lkIjoiYmY0ZTY1MDctZWM3Ny00Yjg5LWFjOWUtZmU1ZTg1MjMwMzJhIn0.h4ljSlX_hIeWAH7pNQsQsEgIUH9QY8nYvk0Wh2Sb13o",
  "access_expires_at": "2026-10-28T17:07:11.721650689Z",
  "refresh_token": "UFbyXKeLmUA_n6m45b89iv8q1FuHYcZsDJiChUQUoUE",
  "refresh_expires_at": "2026-10-29T04:52:11.721167294Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380689256201",
  "device_ref": "sandbox-31060"
}
```

```json
{
  "challenge_id": "eca35549-fcea-4d73-a39d-b92ac73ac6f7",
  "expires_at": "2026-10-28T16:57:11.975310459Z",
  "resend_available_at": "2026-10-28T16:52:12.975310459Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380689256201` → **200**

```json
{
  "phone": "+380689256201",
  "audience": "CLIENT",
  "code": "993110",
  "sent_at": "2026-10-28T16:52:11.977952677Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eca35549-fcea-4d73-a39d-b92ac73ac6f7",
  "code": "993110",
  "device_ref": "sandbox-31060"
}
```

```json
{
  "session_id": "08ce1530-050e-4edb-9407-565b96c089ca",
  "subject": {
    "type": "CLIENT",
    "id": "c97174be-3aa3-44b6-ae87-a046233c6077"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOTcxNzRiZS0zYWEzLTQ0YjYtYWU4Ny1hMDQ2MjMzYzYwNzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3MjMyLCJpYXQiOjE3OTMyMDYzMzIsImp0aSI6IjhiYTFlYTljLTdhMDAtNDU0Yi04MGIzLTAzOTMzMTgzMGY0NCIsInNpZCI6IjA4Y2UxNTMwLTA1MGUtNGVkYi05NDA3LTU2NWI5NmMwODljYSJ9.8EL2hGt0OBibA_nu0iUZPBr7cRCP-rUOkHjK9ZV-sQg",
  "access_expires_at": "2026-10-28T17:07:12.256511749Z",
  "refresh_token": "wEz8rIwYSFf0IfyFAncpzKfs2iFaK8nBjDGbwOXYM48",
  "refresh_expires_at": "2026-11-27T16:52:12.255956742Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4e41b757-fe54-4b09-b544-e5ef0c59ec8e",
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
  "id": "0cb3896f-62bc-4bd3-9994-e34f73065739",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:57:12.519429Z",
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
  "command_id": "790cc623-146a-406d-9c5e-dbabda46231a",
  "quote_id": "0cb3896f-62bc-4bd3-9994-e34f73065739",
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
  "id": "0a6511f1-9351-41b2-9c6f-ab8c4a529d25",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c97174be-3aa3-44b6-ae87-a046233c6077",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:52:12.80756Z",
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
    "id": "c6469818-7fe0-459e-8797-afbfd30035d7",
    "order_id": "0a6511f1-9351-41b2-9c6f-ab8c4a529d25",
    "expires_at": "2026-10-28T16:52:27.810963Z",
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

`POST /api/driver/v1/offers/c6469818-7fe0-459e-8797-afbfd30035d7/reject` → **204**

```json
{
  "command_id": "addfb680-42af-4917-902d-073df990b034"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "fe16ea4b-494e-4585-9842-5cce031b5e67",
    "order_id": "0a6511f1-9351-41b2-9c6f-ab8c4a529d25",
    "expires_at": "2026-10-28T16:52:28.348242Z",
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

`POST /api/driver/v1/offers/fe16ea4b-494e-4585-9842-5cce031b5e67/accept` → **200**

```json
{
  "command_id": "d8437920-e097-400a-8e9c-e0b00b484807"
}
```

```json
{
  "id": "8cf3800a-bf37-4189-8c5a-f20132d97193",
  "order_id": "0a6511f1-9351-41b2-9c6f-ab8c4a529d25",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0ef3e7b4-1edf-43d8-8ab3-5a46444d5152",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/0a6511f1-9351-41b2-9c6f-ab8c4a529d25/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:52:12.808169Z",
      "actor": {
        "type": "CLIENT",
        "id": "c97174be-3aa3-44b6-ae87-a046233c6077",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "0a6511f1-9351-41b2-9c6f-ab8c4a529d25",
        "quote_id": "0cb3896f-62bc-4bd3-9994-e34f73065739",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "4673a284-bc09-4b12-be9e-a73196bc1d0a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:52:12.810092Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0a6511f1-9351-41b2-9c6f-ab8c4a529d25",
        "attempt_id": "546c0f7a-8bf0-4bcc-afda-3e45fceb5107",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "4673a284-bc09-4b12-be9e-a73196bc1d0a"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T16:52:12.817022Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c6469818-7fe0-459e-8797-afbfd30035d7",
        "order_id": "0a6511f1-9351-41b2-9c6f-ab8c4a529d25",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "4673a284-bc09-4b12-be9e-a73196bc1d0a"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T16:52:13.34704Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c6469818-7fe0-459e-8797-afbfd30035d7",
        "order_id": "0a6511f1-9351-41b2-9c6f-ab8c4a529d25"
      },
      "correlation_id": "4e6cc470-dd1d-47c0-b132-db5e5d6b7316"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 0a6511f1-9351-41b2-9c6f-ab8c4a529d25 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/0a6511f1-9351-41b2-9c6f-ab8c4a529d25` → **200**

```json
{
  "id": "0a6511f1-9351-41b2-9c6f-ab8c4a529d25",
  "short_number": 6,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "c97174be-3aa3-44b6-ae87-a046233c6077",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "8cf3800a-bf37-4189-8c5a-f20132d97193",
    "order_id": "0a6511f1-9351-41b2-9c6f-ab8c4a529d25",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "0ef3e7b4-1edf-43d8-8ab3-5a46444d5152",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T16:52:12.80756Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0a6511f1-9351-41b2-9c6f-ab8c4a529d25/cancel` → **200**

```json
{
  "command_id": "72b033ba-336b-44f6-8a08-b46fe9a5b033",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "0a6511f1-9351-41b2-9c6f-ab8c4a529d25",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c97174be-3aa3-44b6-ae87-a046233c6077",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "8cf3800a-bf37-4189-8c5a-f20132d97193",
    "order_id": "0a6511f1-9351-41b2-9c6f-ab8c4a529d25",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "0ef3e7b4-1edf-43d8-8ab3-5a46444d5152",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T16:52:12.80756Z",
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
  "session_id": "14bb03fd-20e5-4d33-87dc-39a298d17439",
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
  "last_heartbeat_at": "2026-10-28T16:52:09.192388Z",
  "last_location_at": "2026-10-28T16:52:09.192388Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/14bb03fd-20e5-4d33-87dc-39a298d17439/close` → **200**

```json
{
  "command_id": "25956579-17d5-45ae-bca7-042e9e638cf3",
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
  "session_id": "58485797-bc76-4dc6-9044-4b8d337aadbe",
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
  "last_heartbeat_at": "2026-10-28T16:52:10.568305Z",
  "last_location_at": "2026-10-28T16:52:10.568305Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/58485797-bc76-4dc6-9044-4b8d337aadbe/close` → **200**

```json
{
  "command_id": "7f09cd9c-8771-4fc3-9644-425cae19f965",
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
  "device_ref": "sandbox-18617"
}
```

```json
{
  "challenge_id": "8c4b7a84-f1bb-4309-87f6-9db11bc0e3dd",
  "expires_at": "2026-10-28T16:57:16.179034279Z",
  "resend_available_at": "2026-10-28T16:52:17.179034279Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "247985",
  "sent_at": "2026-10-28T16:52:16.18153422Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8c4b7a84-f1bb-4309-87f6-9db11bc0e3dd",
  "code": "247985",
  "device_ref": "sandbox-18617"
}
```

```json
{
  "session_id": "b97a1095-abff-41f1-93ea-f39bd96ba208",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNzIzNiwiaWF0IjoxNzkzMjA2MzM2LCJqdGkiOiJiZGI2OTNhNS1kYTI0LTQ2Y2ItYjVhMy1kYzI2NDA4YmQ4NjkiLCJzaWQiOiJiOTdhMTA5NS1hYmZmLTQxZjEtOTNlYS1mMzliZDk2YmEyMDgifQ.GWwTgX0ZOrrFczoGbaDsCJx2248wyAGmNDdl8VHRST8",
  "access_expires_at": "2026-10-28T17:07:16.4704264Z",
  "refresh_token": "OeUVidHFjEKQpHlyAhKolea-6nDXtW7CWa03F3iZ4Qg",
  "refresh_expires_at": "2026-11-27T16:52:16.469857861Z",
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
  "command_id": "07a951df-d752-44be-966f-fdb37be98f6b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:52:16Z",
    "sequence": 1793206336990
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4b1f0f79-040b-4bf3-87e2-786ee0d1ff05",
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
  "last_heartbeat_at": "2026-10-28T16:52:17.00897Z",
  "last_location_at": "2026-10-28T16:52:17.00897Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679141492",
  "device_ref": "sandbox-10520"
}
```

```json
{
  "challenge_id": "874ebdda-3b08-4f1a-9e63-6efd6e55b453",
  "expires_at": "2026-10-28T16:57:17.268666548Z",
  "resend_available_at": "2026-10-28T16:52:18.268666548Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679141492` → **200**

```json
{
  "phone": "+380679141492",
  "audience": "CLIENT",
  "code": "590523",
  "sent_at": "2026-10-28T16:52:17.271335548Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "874ebdda-3b08-4f1a-9e63-6efd6e55b453",
  "code": "590523",
  "device_ref": "sandbox-10520"
}
```

```json
{
  "session_id": "e386acbe-f97f-498d-a929-06df51ade2d8",
  "subject": {
    "type": "CLIENT",
    "id": "3aae46fa-a132-403e-9e01-32c5e29b3d08"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYWFlNDZmYS1hMTMyLTQwM2UtOWUwMS0zMmM1ZTI5YjNkMDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3MjM3LCJpYXQiOjE3OTMyMDYzMzcsImp0aSI6IjYwYjNkMWEzLWUzZGYtNDYxYS04MzZiLTllOTE2YTBmMDU0YiIsInNpZCI6ImUzODZhY2JlLWY5N2YtNDk4ZC1hOTI5LTA2ZGY1MWFkZTJkOCJ9.Rukjq1w3-nLRx9LyqqMJM8GsMOUbIcSezzBVf2YV8mE",
  "access_expires_at": "2026-10-28T17:07:17.55433996Z",
  "refresh_token": "3kS_gQBNe-WU35PiZOq7QcOvkMxH3YcNGn2ZZRKK8OM",
  "refresh_expires_at": "2026-11-27T16:52:17.553763119Z",
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
  "command_id": "25287643-5e94-486b-954c-ccb0b8276ccc",
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
  "id": "e8a756bc-1fb5-4c36-8213-346fb2cbd0d3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:57:18.087216Z",
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
  "command_id": "102e6181-2502-434e-a100-b68674bf26ec",
  "platform": "ANDROID",
  "token": "sandbox-driver-546ddc57-be66-436a-8c63-4bf54a4810f6"
}
```

```json
{
  "id": "b3514f65-e382-422e-85d6-e57b0091aff7",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T16:52:18.36794Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "5bb86fe8-787e-430e-90f4-40f65baf53f4",
  "platform": "ANDROID",
  "token": "sandbox-rider-6ba79ec6-08f3-474e-bd16-15044ded1133"
}
```

```json
{
  "id": "f12572d6-253e-41fb-90eb-3ed073a7cc51",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T16:52:18.631244Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "599b6dfc-bab8-43a2-9de3-403b656ec9dc",
  "quote_id": "e8a756bc-1fb5-4c36-8213-346fb2cbd0d3",
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
  "id": "b77f60e7-4080-462f-ae69-2d58a8b449e8",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3aae46fa-a132-403e-9e01-32c5e29b3d08",
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
  "created_at": "2026-10-28T16:52:18.909671Z",
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
    "id": "a0c0c9d8-8b4c-49d4-a08c-a099e0c6dc14",
    "order_id": "b77f60e7-4080-462f-ae69-2d58a8b449e8",
    "expires_at": "2026-10-28T16:52:33.913068Z",
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

`POST /api/driver/v1/offers/a0c0c9d8-8b4c-49d4-a08c-a099e0c6dc14/accept` → **200**

```json
{
  "command_id": "48e8bde1-5dbe-48c0-8647-ce69e0e228c1"
}
```

```json
{
  "id": "3031277b-c84a-4726-af4c-9be93797792d",
  "order_id": "b77f60e7-4080-462f-ae69-2d58a8b449e8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "93d1a3a0-64cc-4e82-914a-e305994e7111",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T16:52:18.884Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T16:52:18.884Z` → **200**

```json
[
  {
    "at": "2026-10-28T16:52:20.259663548Z",
    "token_suffix": "4810f6",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "event_type": "OfferMade",
      "event_id": "9b4ea9f9-0113-45dc-b4c0-65678c28306c",
      "order_version": "2",
      "order_id": "b77f60e7-4080-462f-ae69-2d58a8b449e8"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380679141492&after=2026-10-28T16:52:18.884Z` → **200**

```json
[
  {
    "at": "2026-10-28T16:52:20.263015986Z",
    "token_suffix": "ed1133",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted",
      "event_id": "e9cac9d6-be04-4d8a-a556-2ee4839dda35",
      "order_version": "3",
      "order_id": "b77f60e7-4080-462f-ae69-2d58a8b449e8"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/b77f60e7-4080-462f-ae69-2d58a8b449e8/messages` → **201**

```json
{
  "command_id": "a6fc625f-d81f-46c3-99d3-79fc8209453f",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "6b6644ea-3822-48fe-94ad-f2c2e5b26a6d",
  "order_id": "b77f60e7-4080-462f-ae69-2d58a8b449e8",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T16:52:20.833449599Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "93d1a3a0-64cc-4e82-914a-e305994e7111",
  "order_id": "b77f60e7-4080-462f-ae69-2d58a8b449e8",
  "assignment_id": "3031277b-c84a-4726-af4c-9be93797792d",
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

`POST /api/driver/v1/trips/93d1a3a0-64cc-4e82-914a-e305994e7111/messages` → **201**

```json
{
  "command_id": "f721779b-75d3-4fba-aff8-83bc0cc260f0",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "ec34e928-738c-4e24-9f83-74ba715a7562",
  "order_id": "b77f60e7-4080-462f-ae69-2d58a8b449e8",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T16:52:21.380511003Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/b77f60e7-4080-462f-ae69-2d58a8b449e8/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/93d1a3a0-64cc-4e82-914a-e305994e7111/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380679141492"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/4b1f0f79-040b-4bf3-87e2-786ee0d1ff05/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:52:22Z",
    "sequence": 1793206342151
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4b1f0f79-040b-4bf3-87e2-786ee0d1ff05",
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
  "last_heartbeat_at": "2026-10-28T16:52:22.169561Z",
  "last_location_at": "2026-10-28T16:52:22.169561Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "93d1a3a0-64cc-4e82-914a-e305994e7111",
  "order_id": "b77f60e7-4080-462f-ae69-2d58a8b449e8",
  "assignment_id": "3031277b-c84a-4726-af4c-9be93797792d",
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

`POST /api/driver/v1/trips/93d1a3a0-64cc-4e82-914a-e305994e7111/arrive` → **200**

```json
{
  "command_id": "090127ba-d1fc-49ca-811f-cae61d924db0",
  "expected_version": 0
}
```

```json
{
  "id": "93d1a3a0-64cc-4e82-914a-e305994e7111",
  "order_id": "b77f60e7-4080-462f-ae69-2d58a8b449e8",
  "assignment_id": "3031277b-c84a-4726-af4c-9be93797792d",
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
  "arrived_at": "2026-10-28T16:52:22.690182Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/93d1a3a0-64cc-4e82-914a-e305994e7111/start` → **200**

```json
{
  "command_id": "f0f70fcf-6a2b-4715-bcd7-ebbd9c1d371f",
  "expected_version": 1
}
```

```json
{
  "id": "93d1a3a0-64cc-4e82-914a-e305994e7111",
  "order_id": "b77f60e7-4080-462f-ae69-2d58a8b449e8",
  "assignment_id": "3031277b-c84a-4726-af4c-9be93797792d",
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
  "arrived_at": "2026-10-28T16:52:22.690182Z",
  "started_at": "2026-10-28T16:52:22.959551Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/4b1f0f79-040b-4bf3-87e2-786ee0d1ff05/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:52:23Z",
    "sequence": 1793206343219
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4b1f0f79-040b-4bf3-87e2-786ee0d1ff05",
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
  "last_heartbeat_at": "2026-10-28T16:52:23.238472Z",
  "last_location_at": "2026-10-28T16:52:23.238472Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/93d1a3a0-64cc-4e82-914a-e305994e7111/complete` → **200**

```json
{
  "command_id": "2c72fce2-59ad-4555-9886-0289490eada6",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:52:23Z",
  "cash_received": true
}
```

```json
{
  "id": "93d1a3a0-64cc-4e82-914a-e305994e7111",
  "order_id": "b77f60e7-4080-462f-ae69-2d58a8b449e8",
  "assignment_id": "3031277b-c84a-4726-af4c-9be93797792d",
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
  "arrived_at": "2026-10-28T16:52:22.690182Z",
  "started_at": "2026-10-28T16:52:22.959551Z",
  "completed_at": "2026-10-28T16:52:23.516101Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/b77f60e7-4080-462f-ae69-2d58a8b449e8` → **200**

```json
{
  "id": "b77f60e7-4080-462f-ae69-2d58a8b449e8",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "3aae46fa-a132-403e-9e01-32c5e29b3d08",
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
    "id": "3031277b-c84a-4726-af4c-9be93797792d",
    "order_id": "b77f60e7-4080-462f-ae69-2d58a8b449e8",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "93d1a3a0-64cc-4e82-914a-e305994e7111",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:52:18.909671Z",
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
    "id": "b77f60e7-4080-462f-ae69-2d58a8b449e8",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-28T16:52:18.909671Z",
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
    "id": "93d1a3a0-64cc-4e82-914a-e305994e7111",
    "order_id": "b77f60e7-4080-462f-ae69-2d58a8b449e8",
    "order_short_number": 7,
    "created_at": "2026-10-28T16:52:19.460555Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "9d8f5082-992a-4818-8e25-1ce6b01be4a8",
    "order_id": "a7fec40f-ae17-4362-a1fa-35494b729716",
    "order_short_number": 1,
    "created_at": "2026-10-28T16:50:44.088434Z",
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

`GET /api/rider/v1/orders/b77f60e7-4080-462f-ae69-2d58a8b449e8/tip` → **200**

```json
{
  "order_id": "b77f60e7-4080-462f-ae69-2d58a8b449e8",
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
  "available_until": "2026-10-29T16:52:23.516101Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/b77f60e7-4080-462f-ae69-2d58a8b449e8/tip` → **201**

```json
{
  "command_id": "31142a52-441a-46ab-98df-18dc72bcb4c8",
  "amount_minor": 1100
}
```

```json
{
  "id": "fd8cc9bc-099a-4fa9-9422-231c66cf3d7d",
  "order_id": "b77f60e7-4080-462f-ae69-2d58a8b449e8",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T16:52:28.410885Z"
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
  "session_id": "130ed8b0-d2ea-4787-a7b8-54bc7c4c2118",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcyNDgsImlhdCI6MTc5MzIwNjM0OCwianRpIjoiMTFkMTE1ZjQtOTdkNi00NTc2LWI1MmEtMjNlZGY2ZmFmODYzIiwic2lkIjoiMTMwZWQ4YjAtZDJlYS00Nzg3LWE3YjgtNTRiYzdjNGMyMTE4In0.WuyDTDk1cSraFzTeRmzScn0kri4FoWAC-F0cufU-S3A",
  "access_expires_at": "2026-10-28T17:07:28.997629949Z",
  "refresh_token": "y_bRSUrFJbqNsmKPNGaIOJpzPRjasiYMotIHKbHEE3w",
  "refresh_expires_at": "2026-10-29T04:52:28.997203584Z",
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
  "generated_at": "2026-10-28T16:52:29.2711796Z"
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
  "generated_at": "2026-10-28T16:52:29.534599156Z"
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
  "session_id": "b0327564-ed71-42ec-99ae-0ceed20c2421",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcyNTAsImlhdCI6MTc5MzIwNjM1MCwianRpIjoiMjg1YjRiNmUtNDU3Ni00NThjLThlNjAtNTVmYzU3MGE3YzA5Iiwic2lkIjoiYjAzMjc1NjQtZWQ3MS00MmVjLTk5YWUtMGNlZWQyMGMyNDIxIn0.EAqomrs6PY3jaiFrBOoA48upjeqiZxjUHj_F6InPZT8",
  "access_expires_at": "2026-10-28T17:07:30.150866334Z",
  "refresh_token": "g6qyseGmMPGe7XSeN1u-EnVgTnqh6A10xmkTdv5elO8",
  "refresh_expires_at": "2026-10-29T04:52:30.150311634Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b77f60e7-4080-462f-ae69-2d58a8b449e8/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:52:18.910299Z",
      "actor": {
        "type": "CLIENT",
        "id": "3aae46fa-a132-403e-9e01-32c5e29b3d08",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b77f60e7-4080-462f-ae69-2d58a8b449e8",
        "quote_id": "e8a756bc-1fb5-4c36-8213-346fb2cbd0d3",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "a4ce674a-c0b8-44a6-b75e-e29f9e746c44"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:52:18.912242Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b77f60e7-4080-462f-ae69-2d58a8b449e8",
        "attempt_id": "0bcd9b96-83f8-4791-900d-afe86d480b64",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "a4ce674a-c0b8-44a6-b75e-e29f9e746c44"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T16:52:18.918474Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a0c0c9d8-8b4c-49d4-a08c-a099e0c6dc14",
        "order_id": "b77f60e7-4080-462f-ae69-2d58a8b449e8",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "a4ce674a-c0b8-44a6-b75e-e29f9e746c44"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T16:52:19.465128Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "a0c0c9d8-8b4c-49d4-a08c-a099e0c6dc14",
        "order_id": "b77f60e7-4080-462f-ae69-2d58a8b449e8",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "3031277b-c84a-4726-af4c-9be93797792d"
      },
      "correlation_id": "a90a30b9-d779-4e95-9022-7773c72b1d3e"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T16:52:30.674628857Z",
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
      "last_location_at": "2026-10-28T16:52:23.238472Z",
      "order_id": null
    }
  ]
}
```

Done: order b77f60e7-4080-462f-ae69-2d58a8b449e8.

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
  "session_id": "0184b557-ffb8-4601-beac-697ecf15f4db",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcyNTEsImlhdCI6MTc5MzIwNjM1MSwianRpIjoiZjg0ZmNiYjYtMWNkOS00M2Q4LWJiOTctYjMxNmY3NDRmNjhlIiwic2lkIjoiMDE4NGI1NTctZmZiOC00NjAxLWJlYWMtNjk3ZWNmMTVmNGRiIn0.vkY_WSeWrLMrCoOU6WExsZDK1GcnWhdAbdJ3AJaAOq0",
  "access_expires_at": "2026-10-28T17:07:31.277993057Z",
  "refresh_token": "KkzLkow-HEq68q7zY8Dbjd0zMNG--VVD9oXZKrmcvFA",
  "refresh_expires_at": "2026-10-29T04:52:31.277524268Z",
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
  "command_id": "4c252a7e-100e-478a-95c3-101e69e0b9c2",
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
  "timestamp": "2026-10-28T16:52:32.000+0000",
  "channel": {
    "id": "1730052000.581431979",
    "linkedid": "1730052000.581431979",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679221710"
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
  "timestamp": "2026-10-28T16:52:32.000+0000",
  "channel": {
    "id": "1730052000.581431979",
    "linkedid": "1730052000.581431979",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679221710"
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
  "session_id": "dd576962-8033-402c-bb58-61150a682860",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcyNTIsImlhdCI6MTc5MzIwNjM1MiwianRpIjoiZDMzOWI2ZjEtZjNiZC00NDhkLTg1NmEtMmM3YjA2NDA5ZjQzIiwic2lkIjoiZGQ1NzY5NjItODAzMy00MDJjLWJiNTgtNjExNTBhNjgyODYwIn0.aCAuvQCz0pacfoZmn_iYmC0AikF6dcZbcN6wQVQHwRY",
  "access_expires_at": "2026-10-28T17:07:32.424536914Z",
  "refresh_token": "LK4qjn5FhED16K4y2BeywMcj_DuM4kzED8XOqXUccmQ",
  "refresh_expires_at": "2026-10-29T04:52:32.423890182Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "842699a0-399a-423b-84dd-115531afc8cc",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679221710",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T16:52:32Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/842699a0-399a-423b-84dd-115531afc8cc/answer` → **200**

```json
{
  "command_id": "fa59f24d-af32-4d43-9a19-84b098aa2de6"
}
```

```json
{
  "id": "842699a0-399a-423b-84dd-115531afc8cc",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679221710",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
  "order_ids": [],
  "started_at": "2026-10-28T16:52:32Z",
  "answered_at": "2026-10-28T16:52:32.953003Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.581431979",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "fc1563c1-b7a1-43b2-b045-711b207cbb53",
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
  "id": "1f46fb3a-8429-4fe1-8b8d-5148477c3957",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:57:33.250086Z",
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
  "command_id": "1ac1725b-38c8-4136-9b26-c78461a23f1e",
  "quote_id": "1f46fb3a-8429-4fe1-8b8d-5148477c3957",
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
    "phone": "+380679221710"
  },
  "call_id": "842699a0-399a-423b-84dd-115531afc8cc"
}
```

```json
{
  "id": "04581335-11e6-4b5d-98fe-d7c8a4907a7d",
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
  "created_at": "2026-10-28T16:52:33.546631Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679221710"
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
    "id": "1730052000.581431979",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "842699a0-399a-423b-84dd-115531afc8cc",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679221710",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
      "order_ids": [
        "04581335-11e6-4b5d-98fe-d7c8a4907a7d"
      ],
      "started_at": "2026-10-28T16:52:32Z",
      "answered_at": "2026-10-28T16:52:32.953003Z",
      "ended_at": "2026-10-28T16:52:33.838354Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "7445436a-1f10-432b-ae97-4cbf9f5570d4",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678465730",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
      "order_ids": [],
      "started_at": "2026-10-28T16:50:52.03243Z",
      "answered_at": "2026-10-28T16:50:52.350967Z",
      "ended_at": "2026-10-28T16:50:52.639418Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T16:50:54.957154Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/04581335-11e6-4b5d-98fe-d7c8a4907a7d` → **200**

```json
{
  "id": "04581335-11e6-4b5d-98fe-d7c8a4907a7d",
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
  "created_at": "2026-10-28T16:52:33.546631Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679221710"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/04581335-11e6-4b5d-98fe-d7c8a4907a7d` → **200**

```json
{
  "id": "04581335-11e6-4b5d-98fe-d7c8a4907a7d",
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
  "created_at": "2026-10-28T16:52:33.546631Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679221710"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/04581335-11e6-4b5d-98fe-d7c8a4907a7d/cancel` → **200**

```json
{
  "command_id": "1655211e-91b2-418b-b4d9-80401796b86a",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "04581335-11e6-4b5d-98fe-d7c8a4907a7d",
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
  "created_at": "2026-10-28T16:52:33.546631Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679221710"
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

Done: call 842699a0-399a-423b-84dd-115531afc8cc with order 04581335-11e6-4b5d-98fe-d7c8a4907a7d.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21686"
}
```

```json
{
  "challenge_id": "44d577ad-d34c-4ed5-a1b8-9d2b249d3933",
  "expires_at": "2026-10-28T16:57:34.977831021Z",
  "resend_available_at": "2026-10-28T16:52:35.977831021Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "943731",
  "sent_at": "2026-10-28T16:52:34.981162791Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "44d577ad-d34c-4ed5-a1b8-9d2b249d3933",
  "code": "943731",
  "device_ref": "sandbox-21686"
}
```

```json
{
  "session_id": "1ce13947-e0f4-4cd0-b936-edc0fb80cc7a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNzI1NSwiaWF0IjoxNzkzMjA2MzU1LCJqdGkiOiIyYzNmNDY2OS01ODhjLTQyMWQtOGYyMi1jNzBlNWM4Y2JiMTYiLCJzaWQiOiIxY2UxMzk0Ny1lMGY0LTRjZDAtYjkzNi1lZGMwZmI4MGNjN2EifQ.ATGvCtjb4aMViW-KugEvkZ8CIh_Z3pHFTL8E5fSscY8",
  "access_expires_at": "2026-10-28T17:07:35.262729643Z",
  "refresh_token": "w9HtcmOozb_3Yhz9l9WZQprt5JUwPlXQp1GADkfC5bw",
  "refresh_expires_at": "2026-11-27T16:52:35.26224423Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4b1f0f79-040b-4bf3-87e2-786ee0d1ff05",
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
  "last_heartbeat_at": "2026-10-28T16:52:23.238472Z",
  "last_location_at": "2026-10-28T16:52:23.238472Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4b1f0f79-040b-4bf3-87e2-786ee0d1ff05/handover` → **200**

```json
{
  "command_id": "b09d39e0-204e-4682-93a7-1d23269c0c9b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4b1f0f79-040b-4bf3-87e2-786ee0d1ff05",
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
  "last_heartbeat_at": "2026-10-28T16:52:23.238472Z",
  "last_location_at": "2026-10-28T16:52:23.238472Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4b1f0f79-040b-4bf3-87e2-786ee0d1ff05/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:52:36Z",
    "sequence": 1793206356447
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4b1f0f79-040b-4bf3-87e2-786ee0d1ff05",
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
  "last_heartbeat_at": "2026-10-28T16:52:36.063778Z",
  "last_location_at": "2026-10-28T16:52:36.063778Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663890086",
  "device_ref": "sandbox-19126"
}
```

```json
{
  "challenge_id": "f8d7983a-73b2-41e1-a993-96b542f62c24",
  "expires_at": "2026-10-28T16:57:36.319568901Z",
  "resend_available_at": "2026-10-28T16:52:37.319568901Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663890086` → **200**

```json
{
  "phone": "+380663890086",
  "audience": "CLIENT",
  "code": "076883",
  "sent_at": "2026-10-28T16:52:36.321617565Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f8d7983a-73b2-41e1-a993-96b542f62c24",
  "code": "076883",
  "device_ref": "sandbox-19126"
}
```

```json
{
  "session_id": "925b6477-5a61-4820-9982-0918cf78fc2a",
  "subject": {
    "type": "CLIENT",
    "id": "64de8f3e-cbb7-4398-82cf-79d74264e870"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGRlOGYzZS1jYmI3LTQzOTgtODJjZi03OWQ3NDI2NGU4NzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3MjU2LCJpYXQiOjE3OTMyMDYzNTYsImp0aSI6IjAyYzQyOWMzLTViNjctNDYzYi04ZjdmLTg0ZDgwOTdhZGQyMiIsInNpZCI6IjkyNWI2NDc3LTVhNjEtNDgyMC05OTgyLTA5MThjZjc4ZmMyYSJ9.0tzACavysv5BzlJInZIkHMHK8IsYogSP1LIOejCJw0w",
  "access_expires_at": "2026-10-28T17:07:36.60665102Z",
  "refresh_token": "UseZvcYFrERaNdXFu5eajwEBKyZPQBhdfvx4e4NW3oM",
  "refresh_expires_at": "2026-11-27T16:52:36.606221495Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2ac3475b-57a4-4fdc-8811-fb031d62eefd",
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
  "id": "3fcabc17-8215-4aac-9a60-538c27569ecc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:57:36.875764Z",
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
  "command_id": "cfa9ce0a-9670-469a-9b79-98ae81e5314b",
  "quote_id": "3fcabc17-8215-4aac-9a60-538c27569ecc",
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
  "id": "dcc64fcf-cc65-4897-8c89-938290f00d3a",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "64de8f3e-cbb7-4398-82cf-79d74264e870",
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
  "created_at": "2026-10-28T16:52:37.151234Z",
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
    "id": "e5e09216-3a81-4b04-b706-bbadb7d0cb52",
    "order_id": "dcc64fcf-cc65-4897-8c89-938290f00d3a",
    "expires_at": "2026-10-28T16:52:52.154503Z",
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

`POST /api/driver/v1/offers/e5e09216-3a81-4b04-b706-bbadb7d0cb52/accept` → **200**

```json
{
  "command_id": "c8827c2c-bc31-403b-916c-e1ff00d2928f"
}
```

```json
{
  "id": "7f7ab5a6-109c-49c1-8546-7a8092254412",
  "order_id": "dcc64fcf-cc65-4897-8c89-938290f00d3a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "adabf790-b46f-49ce-9ae4-bb8ebf0aeaf9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "adabf790-b46f-49ce-9ae4-bb8ebf0aeaf9",
  "order_id": "dcc64fcf-cc65-4897-8c89-938290f00d3a",
  "assignment_id": "7f7ab5a6-109c-49c1-8546-7a8092254412",
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

`POST /api/driver/v1/work-sessions/4b1f0f79-040b-4bf3-87e2-786ee0d1ff05/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:52:38Z",
    "sequence": 1793206358218
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4b1f0f79-040b-4bf3-87e2-786ee0d1ff05",
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
  "last_heartbeat_at": "2026-10-28T16:52:38.237828Z",
  "last_location_at": "2026-10-28T16:52:38.237828Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/adabf790-b46f-49ce-9ae4-bb8ebf0aeaf9/arrive` → **200**

```json
{
  "command_id": "599253a0-1fb3-4f5f-adb7-4875c6b13238",
  "expected_version": 0
}
```

```json
{
  "id": "adabf790-b46f-49ce-9ae4-bb8ebf0aeaf9",
  "order_id": "dcc64fcf-cc65-4897-8c89-938290f00d3a",
  "assignment_id": "7f7ab5a6-109c-49c1-8546-7a8092254412",
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
  "arrived_at": "2026-10-28T16:52:38.508349Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/adabf790-b46f-49ce-9ae4-bb8ebf0aeaf9/start` → **200**

```json
{
  "command_id": "17685658-1d00-4be7-a79a-36b29e12bfe7",
  "expected_version": 1
}
```

```json
{
  "id": "adabf790-b46f-49ce-9ae4-bb8ebf0aeaf9",
  "order_id": "dcc64fcf-cc65-4897-8c89-938290f00d3a",
  "assignment_id": "7f7ab5a6-109c-49c1-8546-7a8092254412",
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
  "arrived_at": "2026-10-28T16:52:38.508349Z",
  "started_at": "2026-10-28T16:52:38.783423Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/4b1f0f79-040b-4bf3-87e2-786ee0d1ff05/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:52:39Z",
    "sequence": 1793206359469
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4b1f0f79-040b-4bf3-87e2-786ee0d1ff05",
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
  "last_heartbeat_at": "2026-10-28T16:52:39.066638Z",
  "last_location_at": "2026-10-28T16:52:39.066638Z",
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
  "device_ref": "sandbox-24904"
}
```

```json
{
  "challenge_id": "8480e053-f76e-4882-9520-c34abffa53c3",
  "expires_at": "2026-10-28T16:57:39.324420427Z",
  "resend_available_at": "2026-10-28T16:52:40.324420427Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "185732",
  "sent_at": "2026-10-28T16:52:39.326786542Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8480e053-f76e-4882-9520-c34abffa53c3",
  "code": "185732",
  "device_ref": "sandbox-24904"
}
```

```json
{
  "session_id": "1af66f1d-aa2a-488a-b278-71e923014138",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNzI1OSwiaWF0IjoxNzkzMjA2MzU5LCJqdGkiOiI4MzVlZTFmNi00Mjg3LTRiMDEtOWZmNi01ZWVmNWIwOTlkYmMiLCJzaWQiOiIxYWY2NmYxZC1hYTJhLTQ4OGEtYjI3OC03MWU5MjMwMTQxMzgifQ.TIG-KL5Pw-RSXrnbOA9teM_3D74Z7PAwI9rANnCicEk",
  "access_expires_at": "2026-10-28T17:07:39.608246124Z",
  "refresh_token": "dVs6Nc4QTNPLxize3-ySvPtV-nG5RNbMv4BFynRfKy0",
  "refresh_expires_at": "2026-11-27T16:52:39.607600635Z",
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
  "command_id": "6253fffb-0b4f-4674-a8d9-c5ff405e5a44",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:52:40Z",
    "sequence": 1793206360131
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b59d9cbd-ee49-40ed-923b-696f3497a834",
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
  "last_heartbeat_at": "2026-10-28T16:52:40.14986Z",
  "last_location_at": "2026-10-28T16:52:40.14986Z",
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
  "session_id": "e5a09e1b-625b-42f8-8fbd-c4aadafd973b",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcyNjAsImlhdCI6MTc5MzIwNjM2MCwianRpIjoiMzlmNDNhNjMtZjlkMC00NjY2LTgxYjItMTJiNDdkODJkNjJiIiwic2lkIjoiZTVhMDllMWItNjI1Yi00MmY4LThmYmQtYzRhYWRhZmQ5NzNiIn0._f5RZk3NcJL49_MkYoIjZR5omF-5Z8QiEv1hAQbbzPc",
  "access_expires_at": "2026-10-28T17:07:40.732175975Z",
  "refresh_token": "6JX0J6z5Bkne1MqSJs0WjA2gT9Zq6sIA8QvhHBfWYmo",
  "refresh_expires_at": "2026-10-29T04:52:40.731698601Z",
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
  "session_id": "a88ef83e-0a47-4f09-80fc-038f83dc9b3f",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcyNjEsImlhdCI6MTc5MzIwNjM2MSwianRpIjoiZjNiMGE1NzEtZmZkNS00MzU2LWJhYjctMWEwYmUxOGEwNTZhIiwic2lkIjoiYTg4ZWY4M2UtMGE0Ny00ZjA5LTgwZmMtMDM4ZjgzZGM5YjNmIn0.8PcC_X4OXAa1g4ba2tIotzdA5wIjs4wXjuyN2WWN4fs",
  "access_expires_at": "2026-10-28T17:07:41.312731317Z",
  "refresh_token": "zsRyCYeeCkd50ZO_IkMbTrUA72gPUx9h1B27xQP9HWM",
  "refresh_expires_at": "2026-10-29T04:52:41.312268559Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/dcc64fcf-cc65-4897-8c89-938290f00d3a` → **200**

```json
{
  "id": "dcc64fcf-cc65-4897-8c89-938290f00d3a",
  "short_number": 9,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "64de8f3e-cbb7-4398-82cf-79d74264e870",
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
    "id": "7f7ab5a6-109c-49c1-8546-7a8092254412",
    "order_id": "dcc64fcf-cc65-4897-8c89-938290f00d3a",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "adabf790-b46f-49ce-9ae4-bb8ebf0aeaf9",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T16:52:37.151234Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/dcc64fcf-cc65-4897-8c89-938290f00d3a/interrupt` → **200**

```json
{
  "command_id": "ff1f31d3-605f-48b2-96da-1981ec8a3693",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "dcc64fcf-cc65-4897-8c89-938290f00d3a",
    "short_number": 9,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "64de8f3e-cbb7-4398-82cf-79d74264e870",
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
      "id": "7f7ab5a6-109c-49c1-8546-7a8092254412",
      "order_id": "dcc64fcf-cc65-4897-8c89-938290f00d3a",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "adabf790-b46f-49ce-9ae4-bb8ebf0aeaf9",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T16:52:37.151234Z",
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
    "id": "3d473895-b448-4357-8fbe-824cd6456185",
    "short_number": 10,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "64de8f3e-cbb7-4398-82cf-79d74264e870",
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
    "id": "23c02e6a-ecee-41c1-8697-ebae550030af",
    "order_id": "3d473895-b448-4357-8fbe-824cd6456185",
    "expires_at": "2026-10-28T16:52:56.871296Z",
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

`POST /api/driver/v1/offers/23c02e6a-ecee-41c1-8697-ebae550030af/accept` → **200**

```json
{
  "command_id": "bea73558-4e5c-485f-9345-2950ad427cdd"
}
```

```json
{
  "id": "657b0a60-e6a9-4146-8da8-86fb1746fa30",
  "order_id": "3d473895-b448-4357-8fbe-824cd6456185",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ab6928a4-86ac-4564-97d1-62e336ca2e5b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ab6928a4-86ac-4564-97d1-62e336ca2e5b",
  "order_id": "3d473895-b448-4357-8fbe-824cd6456185",
  "assignment_id": "657b0a60-e6a9-4146-8da8-86fb1746fa30",
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
  "session_id": "b59d9cbd-ee49-40ed-923b-696f3497a834",
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
  "last_heartbeat_at": "2026-10-28T16:52:40.14986Z",
  "last_location_at": "2026-10-28T16:52:40.14986Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/b59d9cbd-ee49-40ed-923b-696f3497a834/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:52:43Z",
    "sequence": 1793206363219
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b59d9cbd-ee49-40ed-923b-696f3497a834",
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
  "last_heartbeat_at": "2026-10-28T16:52:43.238562Z",
  "last_location_at": "2026-10-28T16:52:43.238562Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ab6928a4-86ac-4564-97d1-62e336ca2e5b/arrive` → **200**

```json
{
  "command_id": "ce3de9ce-7d78-4e01-8dc9-297b942dded1",
  "expected_version": 0
}
```

```json
{
  "id": "ab6928a4-86ac-4564-97d1-62e336ca2e5b",
  "order_id": "3d473895-b448-4357-8fbe-824cd6456185",
  "assignment_id": "657b0a60-e6a9-4146-8da8-86fb1746fa30",
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
  "arrived_at": "2026-10-28T16:52:43.507891Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ab6928a4-86ac-4564-97d1-62e336ca2e5b/start` → **200**

```json
{
  "command_id": "38928f3d-098e-45fa-a9bd-ca32628f7ec9",
  "expected_version": 1
}
```

```json
{
  "id": "ab6928a4-86ac-4564-97d1-62e336ca2e5b",
  "order_id": "3d473895-b448-4357-8fbe-824cd6456185",
  "assignment_id": "657b0a60-e6a9-4146-8da8-86fb1746fa30",
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
  "arrived_at": "2026-10-28T16:52:43.507891Z",
  "started_at": "2026-10-28T16:52:43.777535Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ab6928a4-86ac-4564-97d1-62e336ca2e5b/complete` → **200**

```json
{
  "command_id": "ecaa8592-fdc6-4a6d-bd29-b6e51446d5b3",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:52:44Z"
}
```

```json
{
  "id": "ab6928a4-86ac-4564-97d1-62e336ca2e5b",
  "order_id": "3d473895-b448-4357-8fbe-824cd6456185",
  "assignment_id": "657b0a60-e6a9-4146-8da8-86fb1746fa30",
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
  "arrived_at": "2026-10-28T16:52:43.507891Z",
  "started_at": "2026-10-28T16:52:43.777535Z",
  "completed_at": "2026-10-28T16:52:44.054271Z",
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
    "id": "3d473895-b448-4357-8fbe-824cd6456185",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T16:52:41.860508Z",
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
    "id": "dcc64fcf-cc65-4897-8c89-938290f00d3a",
    "short_number": 9,
    "status": "CANCELLED",
    "created_at": "2026-10-28T16:52:37.151234Z",
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

`GET /api/operator/v1/orders/dcc64fcf-cc65-4897-8c89-938290f00d3a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:52:37.15178Z",
      "actor": {
        "type": "CLIENT",
        "id": "64de8f3e-cbb7-4398-82cf-79d74264e870",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "dcc64fcf-cc65-4897-8c89-938290f00d3a",
        "quote_id": "3fcabc17-8215-4aac-9a60-538c27569ecc",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "b22eee33-aa9a-4426-802b-c8d685523e22"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:52:37.153649Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "dcc64fcf-cc65-4897-8c89-938290f00d3a",
        "attempt_id": "a277989f-85ee-4f71-82fa-69915c3a8034",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b22eee33-aa9a-4426-802b-c8d685523e22"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T16:52:37.15728Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e5e09216-3a81-4b04-b706-bbadb7d0cb52",
        "order_id": "dcc64fcf-cc65-4897-8c89-938290f00d3a",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "b22eee33-aa9a-4426-802b-c8d685523e22"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T16:52:37.70502Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "e5e09216-3a81-4b04-b706-bbadb7d0cb52",
        "order_id": "dcc64fcf-cc65-4897-8c89-938290f00d3a",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "7f7ab5a6-109c-49c1-8546-7a8092254412"
      },
      "correlation_id": "e755b98f-0f4d-4c21-99b5-435a4eab1a1b"
```

Done: interrupted dcc64fcf-cc65-4897-8c89-938290f00d3a, follow-up 3d473895-b448-4357-8fbe-824cd6456185.

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
  "session_id": "1f3368b6-d32f-479d-9c04-30ea055e17ab",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcyNjgsImlhdCI6MTc5MzIwNjM2OCwianRpIjoiOGVlMzE1OTYtMmUwZC00ODMzLWExODctNDgxNWE5YTU0YWJhIiwic2lkIjoiMWYzMzY4YjYtZDMyZi00NzlkLTljMDQtMzBlYTA1NWUxN2FiIn0.QU6LmSXkIDQ_jG-QnCKv6k_JqXuEv3gZobpqEjv5uys",
  "access_expires_at": "2026-10-28T17:07:48.443148327Z",
  "refresh_token": "z_NEigkogCQnUpQTRasEbbfUOwXkc5eXUDVcpVHr5Hc",
  "refresh_expires_at": "2026-10-29T04:52:48.442594961Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "d0cb950b-a0f7-4a0f-821d-f5573007acd5",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:52:48Z"
}
```

```json
{
  "id": "28b264b1-0a13-435f-a8ec-962f5483cb0a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:52:48Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/28b264b1-0a13-435f-a8ec-962f5483cb0a/publish` → **200**

```json
{
  "command_id": "429868df-2f67-4bc7-a0db-972d84693347",
  "expected_version": 0
}
```

```json
{
  "id": "28b264b1-0a13-435f-a8ec-962f5483cb0a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:52:48.996413Z",
  "published_at": "2026-10-28T16:52:48.996413Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "28b264b1-0a13-435f-a8ec-962f5483cb0a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T16:52:48.996413Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634318972",
  "device_ref": "sandbox-22510"
}
```

```json
{
  "challenge_id": "80c0a4c9-1296-4269-8580-728f83868272",
  "expires_at": "2026-10-28T16:57:49.522309202Z",
  "resend_available_at": "2026-10-28T16:52:50.522309202Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634318972` → **200**

```json
{
  "phone": "+380634318972",
  "audience": "CLIENT",
  "code": "114557",
  "sent_at": "2026-10-28T16:52:49.524856971Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "80c0a4c9-1296-4269-8580-728f83868272",
  "code": "114557",
  "device_ref": "sandbox-22510"
}
```

```json
{
  "session_id": "72453c20-6508-468d-89df-656854398716",
  "subject": {
    "type": "CLIENT",
    "id": "4d61452c-6394-4cd4-a842-f587b7424395"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDYxNDUyYy02Mzk0LTRjZDQtYTg0Mi1mNTg3Yjc0MjQzOTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3MjY5LCJpYXQiOjE3OTMyMDYzNjksImp0aSI6IjI4YmU2ZTkxLTg5NmItNDZlNS1iMzljLTc5M2NhZDU5MjE0OSIsInNpZCI6IjcyNDUzYzIwLTY1MDgtNDY4ZC04OWRmLTY1Njg1NDM5ODcxNiJ9.R-JAB8vTnzFyOuz6durozGnEPeWj3KIXWAigCGc_f1s",
  "access_expires_at": "2026-10-28T17:07:49.806791414Z",
  "refresh_token": "VZKDuzeYWpD9WeFLQplwlEG90R60_PZYR88gz4aSnC0",
  "refresh_expires_at": "2026-11-27T16:52:49.80630666Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "28b264b1-0a13-435f-a8ec-962f5483cb0a",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T16:52:48.996413Z",
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
  "command_id": "91ebbe03-6a31-4851-b273-1fc1f7eb63a3",
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
  "id": "fb2248e8-dc22-40bc-a543-c491c6e28326",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:57:50.347499Z",
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
  "command_id": "386d98f7-eb32-49b3-ac60-5c0f3d8142f0",
  "quote_id": "fb2248e8-dc22-40bc-a543-c491c6e28326",
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
  "correlation_id": "a3ee5557-0de4-4988-9584-2ef1f365463d"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "9bae8644-73a9-4306-9b8f-194411cd61b5",
  "version_id": "28b264b1-0a13-435f-a8ec-962f5483cb0a",
  "language": "uk"
}
```

```json
{
  "version_id": "28b264b1-0a13-435f-a8ec-962f5483cb0a",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T16:52:50.885142Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7b04b6a5-be1a-4507-b239-d507dedaee0e",
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
  "id": "888e0c5e-a48f-407f-99c3-6aa58f4ec9fd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:57:51.157083Z",
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
  "command_id": "f75031bc-64ec-4195-8d1f-8f86a245f936",
  "quote_id": "888e0c5e-a48f-407f-99c3-6aa58f4ec9fd",
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
  "id": "ca19e607-d3c1-488c-9a4a-967459e4568f",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d61452c-6394-4cd4-a842-f587b7424395",
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
  "created_at": "2026-10-28T16:52:51.430557Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/ca19e607-d3c1-488c-9a4a-967459e4568f` → **200**

```json
{
  "id": "ca19e607-d3c1-488c-9a4a-967459e4568f",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d61452c-6394-4cd4-a842-f587b7424395",
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
  "created_at": "2026-10-28T16:52:51.430557Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/ca19e607-d3c1-488c-9a4a-967459e4568f/cancel` → **200**

```json
{
  "command_id": "46590141-172e-46dd-b027-7d8089a94402",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ca19e607-d3c1-488c-9a4a-967459e4568f",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4d61452c-6394-4cd4-a842-f587b7424395",
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
  "created_at": "2026-10-28T16:52:51.430557Z",
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

`POST /api/admin/v1/legal-documents/28b264b1-0a13-435f-a8ec-962f5483cb0a` → **409**

```json
{
  "command_id": "bcef1003-210f-48af-afb9-2d71a80b7c71",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:52:52Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/28b264b1-0a13-435f-a8ec-962f5483cb0a",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "68b66149-1025-4e7f-825b-08baf14547a5"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "36d4a4ca-d42a-473d-8553-00cf7731b100",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T16:52:52Z"
}
```

```json
{
  "id": "b5dbab6a-6d77-435e-91a2-43f9b4972792",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T16:52:52Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/b5dbab6a-6d77-435e-91a2-43f9b4972792/publish` → **200**

```json
{
  "command_id": "91c78e00-3706-4493-9d0c-a90198cc648f",
  "expected_version": 0
}
```

```json
{
  "id": "b5dbab6a-6d77-435e-91a2-43f9b4972792",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T16:52:52.809542Z",
  "published_at": "2026-10-28T16:52:52.809542Z",
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
  "device_ref": "sandbox-21150"
}
```

```json
{
  "challenge_id": "0415a15d-fea5-4ce6-88d0-1752dd3f56b4",
  "expires_at": "2026-10-28T16:57:53.07760566Z",
  "resend_available_at": "2026-10-28T16:52:54.07760566Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "169320",
  "sent_at": "2026-10-28T16:52:53.079827929Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0415a15d-fea5-4ce6-88d0-1752dd3f56b4",
  "code": "169320",
  "device_ref": "sandbox-21150"
}
```

```json
{
  "session_id": "f877d371-d2dd-4727-9c4a-a70af4db6e8b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNzI3MywiaWF0IjoxNzkzMjA2MzczLCJqdGkiOiJhNmIzYjYwMC03NTJkLTQ4ZTUtOTIzOS0yNTM4MWYxN2Q5ODYiLCJzaWQiOiJmODc3ZDM3MS1kMmRkLTQ3MjctOWM0YS1hNzBhZjRkYjZlOGIifQ.rdxSG_t8b5GptxOutGk1j947KDpOtkSa97l0qkWHIi8",
  "access_expires_at": "2026-10-28T17:07:53.366075613Z",
  "refresh_token": "vzEG4SyWpjkIi2tR7Dv6LtqV2oC5xM7Fblzaoj8_xaQ",
  "refresh_expires_at": "2026-11-27T16:52:53.365392558Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b59d9cbd-ee49-40ed-923b-696f3497a834",
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
  "last_heartbeat_at": "2026-10-28T16:52:43.238562Z",
  "last_location_at": "2026-10-28T16:52:43.238562Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b59d9cbd-ee49-40ed-923b-696f3497a834/handover` → **200**

```json
{
  "command_id": "9b8b9326-898c-4238-a5ae-e8f6f7ed2a5b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b59d9cbd-ee49-40ed-923b-696f3497a834",
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
  "last_heartbeat_at": "2026-10-28T16:52:43.238562Z",
  "last_location_at": "2026-10-28T16:52:43.238562Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b59d9cbd-ee49-40ed-923b-696f3497a834/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:52:54Z",
    "sequence": 1793206374151
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b59d9cbd-ee49-40ed-923b-696f3497a834",
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
  "last_heartbeat_at": "2026-10-28T16:52:54.169873Z",
  "last_location_at": "2026-10-28T16:52:54.169873Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679029048",
  "device_ref": "sandbox-25652"
}
```

```json
{
  "challenge_id": "c360ddc6-59eb-4e82-8399-7cfbf4d08813",
  "expires_at": "2026-10-28T16:57:54.434807672Z",
  "resend_available_at": "2026-10-28T16:52:55.434807672Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679029048` → **200**

```json
{
  "phone": "+380679029048",
  "audience": "CLIENT",
  "code": "510518",
  "sent_at": "2026-10-28T16:52:54.437316876Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c360ddc6-59eb-4e82-8399-7cfbf4d08813",
  "code": "510518",
  "device_ref": "sandbox-25652"
}
```

```json
{
  "session_id": "bb1a25ef-12f7-4f87-beda-0189847f5df5",
  "subject": {
    "type": "CLIENT",
    "id": "57df8c0f-acd5-4161-a392-01c7ee905957"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1N2RmOGMwZi1hY2Q1LTQxNjEtYTM5Mi0wMWM3ZWU5MDU5NTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3Mjc0LCJpYXQiOjE3OTMyMDYzNzQsImp0aSI6IjYyN2MzOGU3LThjYjYtNDM1MC1hNDIzLWU1YWU2NzkzZWQwMiIsInNpZCI6ImJiMWEyNWVmLTEyZjctNGY4Ny1iZWRhLTAxODk4NDdmNWRmNSJ9.HGX3xhq1S5qjZys3pruebNmA9-XoOVOrm4uThqQ2mbc",
  "access_expires_at": "2026-10-28T17:07:54.734711608Z",
  "refresh_token": "QwaJrf_0VYcPTbnu69PYxAlP71L9vL0qo9Nuc5n6ApA",
  "refresh_expires_at": "2026-11-27T16:52:54.734046631Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5ff648fb-814a-4b8c-8cf8-2db5e91e4aa1",
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
  "id": "22ed2d78-d194-47f0-b03e-3a81acc8bb31",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:57:55.020180Z",
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
  "command_id": "09b81d99-6356-4731-8f52-0ae906d413ef",
  "quote_id": "22ed2d78-d194-47f0-b03e-3a81acc8bb31",
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
    "phone": "+380672370035"
  }
}
```

```json
{
  "id": "442e95a5-2be7-4dd4-9f47-8d10369c6024",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "57df8c0f-acd5-4161-a392-01c7ee905957",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:52:55.298937Z",
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
    "id": "6354ab45-469f-47eb-a586-38a12ae35807",
    "order_id": "442e95a5-2be7-4dd4-9f47-8d10369c6024",
    "expires_at": "2026-10-28T16:53:10.302933Z",
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

`POST /api/driver/v1/offers/6354ab45-469f-47eb-a586-38a12ae35807/accept` → **200**

```json
{
  "command_id": "e8031bdb-4355-4a5b-be6b-9d2fc54a2a98"
}
```

```json
{
  "id": "ac9e7cbf-21f5-4b22-bcf6-c6b9122f63be",
  "order_id": "442e95a5-2be7-4dd4-9f47-8d10369c6024",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4eeff90e-b8ac-484f-b025-78da0dcc9664",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4eeff90e-b8ac-484f-b025-78da0dcc9664",
  "order_id": "442e95a5-2be7-4dd4-9f47-8d10369c6024",
  "assignment_id": "ac9e7cbf-21f5-4b22-bcf6-c6b9122f63be",
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
    "phone": "+380672370035"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5324573c-e545-4c0b-9d9c-1fe534855411",
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
  "id": "f80ffb35-c74b-4d01-a2ae-cd3ada3c9fda",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:57:56.373107Z",
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
  "command_id": "7db745dd-e2fd-4dc6-9df9-ad76f4984449",
  "quote_id": "f80ffb35-c74b-4d01-a2ae-cd3ada3c9fda",
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
  "id": "073c7f63-2ceb-454f-b48b-60249bca611b",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "57df8c0f-acd5-4161-a392-01c7ee905957",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:52:56.647503Z",
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
  "command_id": "0a27c7b5-d7ab-424e-9f4f-299bd951c7b3",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T19:52:56Z"
}
```

```json
{
  "id": "60222dcf-42e0-4a2d-9431-df1d52e36a0f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:57:56.935923Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T19:52:56Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "5e00289f-41a8-4404-9f78-70c7b8492729",
  "quote_id": "60222dcf-42e0-4a2d-9431-df1d52e36a0f",
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
  "pickup_at": "2026-10-28T19:52:56Z"
}
```

```json
{
  "id": "a6e531b9-9ee6-446d-9c57-e8114039eb49",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "57df8c0f-acd5-4161-a392-01c7ee905957",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T16:52:57.221691Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T19:52:56Z",
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
  "command_id": "0e6c3f31-4ea2-4e3e-8ea2-4c946586bcf5",
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
  "id": "48685d78-70a7-437f-b4e9-9e98f6b1edd0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:57:57.506622Z",
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
  "command_id": "9a192cd0-c5ed-4d7a-825a-fc657d2f2010",
  "quote_id": "48685d78-70a7-437f-b4e9-9e98f6b1edd0",
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
  "correlation_id": "b930c7aa-4e0e-4b4c-9c4c-ea10ee6ec916"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "a6e531b9-9ee6-446d-9c57-e8114039eb49",
      "short_number": 14,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "57df8c0f-acd5-4161-a392-01c7ee905957",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T16:52:57.221691Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T19:52:56Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "073c7f63-2ceb-454f-b48b-60249bca611b",
      "short_number": 13,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "57df8c0f-acd5-4161-a392-01c7ee905957",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-28T16:52:56.647503Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "442e95a5-2be7-4dd4-9f47-8d10369c6024",
      "short_number": 12,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "57df8c0f-acd5-4161-a392-01c7ee905957",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "073c7f63-2ceb-454f-b48b-60249bca611b",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "57df8c0f-acd5-4161-a392-01c7ee905957",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:52:56.647503Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/442e95a5-2be7-4dd4-9f47-8d10369c6024` → **200**

```json
{
  "id": "442e95a5-2be7-4dd4-9f47-8d10369c6024",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "57df8c0f-acd5-4161-a392-01c7ee905957",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "ac9e7cbf-21f5-4b22-bcf6-c6b9122f63be",
    "order_id": "442e95a5-2be7-4dd4-9f47-8d10369c6024",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "4eeff90e-b8ac-484f-b025-78da0dcc9664",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T16:52:55.298937Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/442e95a5-2be7-4dd4-9f47-8d10369c6024/cancel` → **200**

```json
{
  "command_id": "85779b72-2d25-4e93-b8df-1b3e43b13cfe",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "442e95a5-2be7-4dd4-9f47-8d10369c6024",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "57df8c0f-acd5-4161-a392-01c7ee905957",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "ac9e7cbf-21f5-4b22-bcf6-c6b9122f63be",
    "order_id": "442e95a5-2be7-4dd4-9f47-8d10369c6024",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "4eeff90e-b8ac-484f-b025-78da0dcc9664",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T16:52:55.298937Z",
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

`GET /api/rider/v1/orders/073c7f63-2ceb-454f-b48b-60249bca611b` → **200**

```json
{
  "id": "073c7f63-2ceb-454f-b48b-60249bca611b",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "57df8c0f-acd5-4161-a392-01c7ee905957",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:52:56.647503Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/073c7f63-2ceb-454f-b48b-60249bca611b/cancel` → **200**

```json
{
  "command_id": "af6819f0-ea06-40b6-b77a-2a69dd5d2db8",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "073c7f63-2ceb-454f-b48b-60249bca611b",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "57df8c0f-acd5-4161-a392-01c7ee905957",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T16:52:56.647503Z",
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

`GET /api/rider/v1/orders/a6e531b9-9ee6-446d-9c57-e8114039eb49` → **200**

```json
{
  "id": "a6e531b9-9ee6-446d-9c57-e8114039eb49",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "57df8c0f-acd5-4161-a392-01c7ee905957",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T16:52:57.221691Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T19:52:56Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/a6e531b9-9ee6-446d-9c57-e8114039eb49/cancel` → **200**

```json
{
  "command_id": "a72ef027-0236-4893-9b25-48bc7882968c",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a6e531b9-9ee6-446d-9c57-e8114039eb49",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "57df8c0f-acd5-4161-a392-01c7ee905957",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T16:52:57.221691Z",
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
  "pickup_at": "2026-10-28T19:52:56Z",
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
  "session_id": "b59d9cbd-ee49-40ed-923b-696f3497a834",
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
  "last_heartbeat_at": "2026-10-28T16:52:54.169873Z",
  "last_location_at": "2026-10-28T16:52:54.169873Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b59d9cbd-ee49-40ed-923b-696f3497a834/close` → **200**

```json
{
  "command_id": "f725d040-e2e3-4aae-ac01-6da58ddd8b04",
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

Done: orders 442e95a5-2be7-4dd4-9f47-8d10369c6024, 073c7f63-2ceb-454f-b48b-60249bca611b, a6e531b9-9ee6-446d-9c57-e8114039eb49.

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
  "session_id": "806c4a77-8eb4-4be2-af68-2f3fc2ca005d",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcyODEsImlhdCI6MTc5MzIwNjM4MSwianRpIjoiZjQwMDg0NDAtZmUyNy00ZmFiLWFjNDYtNjllZGI2NjA5MzIyIiwic2lkIjoiODA2YzRhNzctOGViNC00YmUyLWFmNjgtMmYzZmMyY2EwMDVkIn0.RPeV8vuA69BBHIBV5cZuPIPRfd6wMRnvv2Ofjntvbh4",
  "access_expires_at": "2026-10-28T17:08:01.071975477Z",
  "refresh_token": "R7Ubd_ghLHyY2h7WVmYW_zHsmDEC2X-MMcJUTrhA5_A",
  "refresh_expires_at": "2026-10-29T04:53:01.07145407Z",
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
  "session_id": "4a4699d8-e098-4c9f-bf4d-c318cefce07c",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcyODEsImlhdCI6MTc5MzIwNjM4MSwianRpIjoiMWJmZjYzODItYjM1Yi00MzcwLWI3YjUtOTAyMmNhOWIxMDMwIiwic2lkIjoiNGE0Njk5ZDgtZTA5OC00YzlmLWJmNGQtYzMxOGNlZmNlMDdjIn0.LlW2QNqjf_Tz9hWNHSPaUEbJ2gEE-4EbDu_XusWV2v0",
  "access_expires_at": "2026-10-28T17:08:01.65012461Z",
  "refresh_token": "AhM1gCK0UAgEZJj20LRB-l7ChJUxlppQE_BVwYarcbE",
  "refresh_expires_at": "2026-10-29T04:53:01.649602181Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21249"
}
```

```json
{
  "challenge_id": "a3002820-fb8e-4bd0-a608-f0a7f5d204d1",
  "expires_at": "2026-10-28T16:58:01.903563398Z",
  "resend_available_at": "2026-10-28T16:53:02.903563398Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "921597",
  "sent_at": "2026-10-28T16:53:01.905781595Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a3002820-fb8e-4bd0-a608-f0a7f5d204d1",
  "code": "921597",
  "device_ref": "sandbox-21249"
}
```

```json
{
  "session_id": "9b5ed3ed-2a44-4871-8504-fcea30c3113d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNzI4MiwiaWF0IjoxNzkzMjA2MzgyLCJqdGkiOiI4MTVhZTVkMi01MjVkLTQ4OTQtOWQ3Yi0wNzE5N2I4ZDQyZWUiLCJzaWQiOiI5YjVlZDNlZC0yYTQ0LTQ4NzEtODUwNC1mY2VhMzBjMzExM2QifQ.mvejpzQhvCflgHFak7TBmq5Hx7HCDZtilMkWDhAnVvU",
  "access_expires_at": "2026-10-28T17:08:02.18845695Z",
  "refresh_token": "vgyiMlEEOn0Lu5_jv40m-IAKvPHDMw0cXyl7X0v0fqQ",
  "refresh_expires_at": "2026-11-27T16:53:02.187863243Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4b1f0f79-040b-4bf3-87e2-786ee0d1ff05",
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
  "last_heartbeat_at": "2026-10-28T16:52:39.066638Z",
  "last_location_at": "2026-10-28T16:52:39.066638Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4b1f0f79-040b-4bf3-87e2-786ee0d1ff05/handover` → **200**

```json
{
  "command_id": "28fc4f66-98e7-4d9c-8a59-a4f250a1e09f",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4b1f0f79-040b-4bf3-87e2-786ee0d1ff05",
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
  "last_heartbeat_at": "2026-10-28T16:52:39.066638Z",
  "last_location_at": "2026-10-28T16:52:39.066638Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4b1f0f79-040b-4bf3-87e2-786ee0d1ff05/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:53:02Z",
    "sequence": 1793206382976
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4b1f0f79-040b-4bf3-87e2-786ee0d1ff05",
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
  "last_heartbeat_at": "2026-10-28T16:53:02.995475Z",
  "last_location_at": "2026-10-28T16:53:02.995475Z",
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
  "command_id": "d6ad6043-2f15-4e9c-9ad8-a1ca9be66577",
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
  "effective_at": "2026-10-28T16:53:03.536185Z",
  "changed_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T16:53:03.805570952Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "0c53b0ae-ba21-4d4b-8a19-b7a3bbc08f1b",
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
  "id": "a32b5cfe-8658-467e-9479-f235a7a25466",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:58:04.083887Z",
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
  "command_id": "decf1f6d-3058-48d7-ba11-3f87a3019716",
  "quote_id": "a32b5cfe-8658-467e-9479-f235a7a25466",
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
    "phone": "+3806711129599"
  }
}
```

```json
{
  "id": "2cf7d209-126c-4acd-bf97-7412d13367ee",
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
  "created_at": "2026-10-28T16:53:04.36125Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711129599"
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
    "id": "0c5f006d-1517-4030-b1ba-a719d10212d9",
    "order_id": "2cf7d209-126c-4acd-bf97-7412d13367ee",
    "expires_at": "2026-10-28T16:53:19.364664Z",
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

`POST /api/driver/v1/offers/0c5f006d-1517-4030-b1ba-a719d10212d9/accept` → **200**

```json
{
  "command_id": "fe44bd43-7d57-43e7-8002-a2f8e56eee9e"
}
```

```json
{
  "id": "cba66389-c6a3-49e7-bd8a-4f226062c378",
  "order_id": "2cf7d209-126c-4acd-bf97-7412d13367ee",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "142b8af6-215d-4d40-b0fd-2ed41f9bccb2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "142b8af6-215d-4d40-b0fd-2ed41f9bccb2",
  "order_id": "2cf7d209-126c-4acd-bf97-7412d13367ee",
  "assignment_id": "cba66389-c6a3-49e7-bd8a-4f226062c378",
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
    "phone": "+3806711129599"
  }
}
```

`POST /api/driver/v1/work-sessions/4b1f0f79-040b-4bf3-87e2-786ee0d1ff05/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:53:05Z",
    "sequence": 1793206385464
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4b1f0f79-040b-4bf3-87e2-786ee0d1ff05",
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
  "last_heartbeat_at": "2026-10-28T16:53:05.483808Z",
  "last_location_at": "2026-10-28T16:53:05.483808Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/142b8af6-215d-4d40-b0fd-2ed41f9bccb2/arrive` → **200**

```json
{
  "command_id": "0584b603-ed89-4746-b724-c9957e0996da",
  "expected_version": 0
}
```

```json
{
  "id": "142b8af6-215d-4d40-b0fd-2ed41f9bccb2",
  "order_id": "2cf7d209-126c-4acd-bf97-7412d13367ee",
  "assignment_id": "cba66389-c6a3-49e7-bd8a-4f226062c378",
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
  "arrived_at": "2026-10-28T16:53:05.753839Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711129599"
  }
}
```

`POST /api/driver/v1/trips/142b8af6-215d-4d40-b0fd-2ed41f9bccb2/start` → **200**

```json
{
  "command_id": "83f3ff50-4663-4651-8886-124ec7d10c0c",
  "expected_version": 1
}
```

```json
{
  "id": "142b8af6-215d-4d40-b0fd-2ed41f9bccb2",
  "order_id": "2cf7d209-126c-4acd-bf97-7412d13367ee",
  "assignment_id": "cba66389-c6a3-49e7-bd8a-4f226062c378",
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
  "arrived_at": "2026-10-28T16:53:05.753839Z",
  "started_at": "2026-10-28T16:53:06.031278Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711129599"
  }
}
```

`POST /api/driver/v1/trips/142b8af6-215d-4d40-b0fd-2ed41f9bccb2/complete` → **200**

```json
{
  "command_id": "30ffd3f6-b85a-4fee-ab61-ec1167823d89",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:53:06Z",
  "cash_received": true
}
```

```json
{
  "id": "142b8af6-215d-4d40-b0fd-2ed41f9bccb2",
  "order_id": "2cf7d209-126c-4acd-bf97-7412d13367ee",
  "assignment_id": "cba66389-c6a3-49e7-bd8a-4f226062c378",
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
  "arrived_at": "2026-10-28T16:53:05.753839Z",
  "started_at": "2026-10-28T16:53:06.031278Z",
  "completed_at": "2026-10-28T16:53:06.305854Z",
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
  "command_id": "bcdc9c1e-a47c-4cd2-925b-ab4111b7ea19",
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
  "id": "f6075abc-7cf6-449a-b474-7de8b09c7c0c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:58:06.578519Z",
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
  "command_id": "eb746ef7-e69d-49fe-804d-214f19870681",
  "quote_id": "f6075abc-7cf6-449a-b474-7de8b09c7c0c",
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
    "phone": "+380671115987"
  }
}
```

```json
{
  "id": "1f22e60f-482b-4bb5-9f1b-9e51f16615de",
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
  "created_at": "2026-10-28T16:53:06.849544Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671115987"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/1f22e60f-482b-4bb5-9f1b-9e51f16615de` → **200**

```json
{
  "id": "1f22e60f-482b-4bb5-9f1b-9e51f16615de",
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
  "created_at": "2026-10-28T16:53:06.849544Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671115987"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/1f22e60f-482b-4bb5-9f1b-9e51f16615de/cancel` → **200**

```json
{
  "command_id": "3d2c5741-4a3b-4f62-84d6-6c2a3c5aad2f",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "1f22e60f-482b-4bb5-9f1b-9e51f16615de",
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
  "created_at": "2026-10-28T16:53:06.849544Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671115987"
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
  "staff_id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T16:53:06.310851Z",
  "last_entries": [
    {
      "order_id": "1f22e60f-482b-4bb5-9f1b-9e51f16615de",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T16:53:07.425293Z"
    },
    {
      "order_id": "2cf7d209-126c-4acd-bf97-7412d13367ee",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T16:53:06.310851Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4b1f0f79-040b-4bf3-87e2-786ee0d1ff05",
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
  "last_heartbeat_at": "2026-10-28T16:53:05.483808Z",
  "last_location_at": "2026-10-28T16:53:05.483808Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4b1f0f79-040b-4bf3-87e2-786ee0d1ff05/close` → **200**

```json
{
  "command_id": "bd09554c-5dd6-4a00-95e5-7b28df7b8292",
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

Done: operator bonus for fulfilled 2cf7d209-126c-4acd-bf97-7412d13367ee and operator-fault cancellation 1f22e60f-482b-4bb5-9f1b-9e51f16615de.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676988527",
  "device_ref": "sandbox-25009"
}
```

```json
{
  "challenge_id": "aff9d033-e168-4e76-a12a-bbecd70c8022",
  "expires_at": "2026-10-28T16:58:10.537532873Z",
  "resend_available_at": "2026-10-28T16:53:11.537532873Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676988527` → **200**

```json
{
  "phone": "+380676988527",
  "audience": "CLIENT",
  "code": "618144",
  "sent_at": "2026-10-28T16:53:10.53995715Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678090028",
  "device_ref": "sandbox-22883",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "51f6322d-f8d7-45af-9628-ed40b829e47b",
  "expires_at": "2026-10-28T16:58:10.826612001Z",
  "resend_available_at": "2026-10-28T16:53:11.826612001Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678090028` → **200**

```json
{
  "phone": "+380678090028",
  "audience": "CLIENT",
  "code": "399394",
  "sent_at": "2026-10-28T16:53:10.828935586Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673920000",
  "device_ref": "sandbox-21586"
}
```

```json
{
  "challenge_id": "d4d3a142-216b-446e-939b-1fa5af19e222",
  "expires_at": "2026-10-28T16:58:11.113627318Z",
  "resend_available_at": "2026-10-28T16:53:12.113627318Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673920000` → **200**

```json
{
  "phone": "+380673920000",
  "audience": "CLIENT",
  "code": "610116",
  "sent_at": "2026-10-28T16:53:11.116544241Z",
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
  "session_id": "e2bc3f4e-2638-474c-96cf-da8c963b6e1a",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcyOTEsImlhdCI6MTc5MzIwNjM5MSwianRpIjoiMjk4NTAyZDItMGQwZS00N2ZjLTlmNzEtNGQwYjg4OTJjMjQ0Iiwic2lkIjoiZTJiYzNmNGUtMjYzOC00NzRjLTk2Y2YtZGE4Yzk2M2I2ZTFhIn0.d97tOferBgnEzrODNuF7ZXDB9HbjD6-UQefPgrJHAXk",
  "access_expires_at": "2026-10-28T17:08:11.722398577Z",
  "refresh_token": "_5TCSEU_ieVzmWzUUDVv_V0uDOMt1Azu_6ZKTrl0_Wk",
  "refresh_expires_at": "2026-10-29T04:53:11.721892533Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380673920000` → **200**

```json
{
  "deliveries": [
    {
      "id": "d6425f8d-c5b4-4742-ae03-a56903ff16ed",
      "challenge_id": "d4d3a142-216b-446e-939b-1fa5af19e222",
      "phone": "+380673920000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-953556e4-1445-4ee5-90f4-c71d4e7b070f",
      "error": null,
      "attempted_at": "2026-10-28T16:53:11.11682Z"
    },
    {
      "id": "acc8d8c9-d28f-414c-9029-56df695ade45",
      "challenge_id": "d4d3a142-216b-446e-939b-1fa5af19e222",
      "phone": "+380673920000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T16:53:11.115821Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380673920000` → **200**

```json
{
  "phone": "+380673920000",
  "audience": "CLIENT",
  "code": "610116",
  "sent_at": "2026-10-28T16:53:11.116544241Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678090028` → **200**

```json
{
  "deliveries": [
    {
      "id": "9d9c2990-7719-490f-8bdd-242a7c916c19",
      "challenge_id": "51f6322d-f8d7-45af-9628-ed40b829e47b",
      "phone": "+380678090028",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-08831b8f-9b4d-48dc-87c3-9cb7708bc1bd",
      "error": null,
      "attempted_at": "2026-10-28T16:53:10.829228Z"
    }
  ]
}
```

Done: SMS to +380676988527, a call to +380678090028, SMS then a call to +380673920000.

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
  "session_id": "91011201-4b11-44e4-b07d-5078952c20eb",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcyOTIsImlhdCI6MTc5MzIwNjM5MiwianRpIjoiYmM3ZTZmYmEtYTQxMi00MDFiLThhNjYtZWRjN2Q1MWNhMzc1Iiwic2lkIjoiOTEwMTEyMDEtNGIxMS00NGU0LWIwN2QtNTA3ODk1MmMyMGViIn0.7R5WWjLynm_aNxY-fLz5my5e4vNeMB6IZ5gpqS1-u48",
  "access_expires_at": "2026-10-28T17:08:12.857408538Z",
  "refresh_token": "kxLRzQ3myMdflpSAoOTD9bNvWsrB-I_Hf42sfyYxcWs",
  "refresh_expires_at": "2026-10-29T04:53:12.856811002Z",
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
  "session_id": "5d118572-bcf6-46b8-a237-8edb9e6c4978",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDcyOTMsImlhdCI6MTc5MzIwNjM5MywianRpIjoiYzNjZDc3NDgtZTVhMi00MmEwLTliMmItM2IzM2U4MDM4ZjVkIiwic2lkIjoiNWQxMTg1NzItYmNmNi00NmI4LWEyMzctOGVkYjllNmM0OTc4In0.-zhaIX2S9t6dKKiHmuym-pdGZUzEmUBHt-j89LMCreQ",
  "access_expires_at": "2026-10-28T17:08:13.436892852Z",
  "refresh_token": "aKOMocw4HYSRmQ1ys3Ivk59cdNu-Svycbp3KkNIqRrg",
  "refresh_expires_at": "2026-10-29T04:53:13.436456113Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
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

`POST /api/admin/v1/staff-extensions/fb08c1e5-5485-4389-8e4a-0d97c49680c2` → **200**

```json
{
  "command_id": "c09be19b-bdb9-4319-8355-57154d811a6a",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "df5152bf-64f4-45d1-81f8-7c6705b946d6",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T16:53:14.489175Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T16:53:14.489175Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "57760338-b475-4b53-9a68-ec23cf6b5faf",
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
  "id": "173ca569-c26e-4cd6-b76e-c4e174b4d502",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:58:15.027556Z",
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
  "command_id": "87aa4c91-da89-4d89-8ab7-af9b729edf0a",
  "quote_id": "173ca569-c26e-4cd6-b76e-c4e174b4d502",
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
    "phone": "+380678717272"
  }
}
```

```json
{
  "id": "18cd533a-42ff-4244-83de-0ff6fcfe7364",
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
  "created_at": "2026-10-28T16:53:15.310751Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678717272"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/18cd533a-42ff-4244-83de-0ff6fcfe7364/calls` → **201**

```json
{
  "command_id": "0156a69a-3718-44ff-8e1e-eb2deb75f0a6",
  "to": "CALLER"
}
```

```json
{
  "id": "a0d5dcb9-7b6c-405f-862b-5e70cc244ab1",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
  "order_ids": [
    "18cd533a-42ff-4244-83de-0ff6fcfe7364"
  ],
  "started_at": "2026-10-28T16:53:15.605667Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/18cd533a-42ff-4244-83de-0ff6fcfe7364/calls` → **201**

```json
{
  "command_id": "0156a69a-3718-44ff-8e1e-eb2deb75f0a6",
  "to": "CALLER"
}
```

```json
{
  "id": "a0d5dcb9-7b6c-405f-862b-5e70cc244ab1",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
  "order_ids": [
    "18cd533a-42ff-4244-83de-0ff6fcfe7364"
  ],
  "started_at": "2026-10-28T16:53:15.605667Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "a0d5dcb9-7b6c-405f-862b-5e70cc244ab1",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380678717272",
    "at": "2026-10-28T16:53:15.60799286Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "a0d5dcb9-7b6c-405f-862b-5e70cc244ab1",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.22134",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "a0d5dcb9-7b6c-405f-862b-5e70cc244ab1"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "a0d5dcb9-7b6c-405f-862b-5e70cc244ab1",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=18cd533a-42ff-4244-83de-0ff6fcfe7364` → **200**

```json
{
  "calls": [
    {
      "id": "a0d5dcb9-7b6c-405f-862b-5e70cc244ab1",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
      "order_ids": [
        "18cd533a-42ff-4244-83de-0ff6fcfe7364"
      ],
      "started_at": "2026-10-28T16:53:15.605667Z",
      "answered_at": "2026-10-28T16:53:16.218318Z",
      "ended_at": "2026-10-28T16:53:16.239752Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=18cd533a-42ff-4244-83de-0ff6fcfe7364` → **200**

```json
{
  "calls": [
    {
      "id": "a0d5dcb9-7b6c-405f-862b-5e70cc244ab1",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
      "order_ids": [
        "18cd533a-42ff-4244-83de-0ff6fcfe7364"
      ],
      "started_at": "2026-10-28T16:53:15.605667Z",
      "answered_at": "2026-10-28T16:53:16.218318Z",
      "ended_at": "2026-10-28T16:53:16.239752Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=18cd533a-42ff-4244-83de-0ff6fcfe7364` → **200**

```json
{
  "calls": [
    {
      "id": "a0d5dcb9-7b6c-405f-862b-5e70cc244ab1",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
      "order_ids": [
        "18cd533a-42ff-4244-83de-0ff6fcfe7364"
      ],
      "started_at": "2026-10-28T16:53:15.605667Z",
      "answered_at": "2026-10-28T16:53:16.218318Z",
      "ended_at": "2026-10-28T16:53:16.239752Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=18cd533a-42ff-4244-83de-0ff6fcfe7364` → **200**

```json
{
  "calls": [
    {
      "id": "a0d5dcb9-7b6c-405f-862b-5e70cc244ab1",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
      "order_ids": [
        "18cd533a-42ff-4244-83de-0ff6fcfe7364"
      ],
      "started_at": "2026-10-28T16:53:15.605667Z",
      "answered_at": "2026-10-28T16:53:16.218318Z",
      "ended_at": "2026-10-28T16:53:16.239752Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=18cd533a-42ff-4244-83de-0ff6fcfe7364` → **200**

```json
{
  "calls": [
    {
      "id": "a0d5dcb9-7b6c-405f-862b-5e70cc244ab1",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
      "order_ids": [
        "18cd533a-42ff-4244-83de-0ff6fcfe7364"
      ],
      "started_at": "2026-10-28T16:53:15.605667Z",
      "answered_at": "2026-10-28T16:53:16.218318Z",
      "ended_at": "2026-10-28T16:53:16.239752Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T16:53:25.000015Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/18cd533a-42ff-4244-83de-0ff6fcfe7364` → **200**

```json
{
  "id": "18cd533a-42ff-4244-83de-0ff6fcfe7364",
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
  "created_at": "2026-10-28T16:53:15.310751Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678717272"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/18cd533a-42ff-4244-83de-0ff6fcfe7364/cancel` → **200**

```json
{
  "command_id": "fee30d8e-565a-4df6-bcac-3e1b242099f0",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "18cd533a-42ff-4244-83de-0ff6fcfe7364",
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
  "created_at": "2026-10-28T16:53:15.310751Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678717272"
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
  "command_id": "e7a6814a-0be3-4ada-a952-c27cb92c548f",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T16:53:26.195278Z",
  "extension": "101"
}
```

Done: outgoing call a0d5dcb9-7b6c-405f-862b-5e70cc244ab1 from order 18cd533a-42ff-4244-83de-0ff6fcfe7364, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632302177",
  "device_ref": "sandbox-16381"
}
```

```json
{
  "challenge_id": "55aa927e-a3db-4193-a696-b863f4b82b42",
  "expires_at": "2026-10-28T16:58:26.469038696Z",
  "resend_available_at": "2026-10-28T16:53:27.469038696Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632302177` → **200**

```json
{
  "phone": "+380632302177",
  "audience": "CLIENT",
  "code": "972237",
  "sent_at": "2026-10-28T16:53:26.471509312Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "55aa927e-a3db-4193-a696-b863f4b82b42",
  "code": "972237",
  "device_ref": "sandbox-16381"
}
```

```json
{
  "session_id": "11a32afa-caff-474e-a0d6-905015970cde",
  "subject": {
    "type": "CLIENT",
    "id": "431519a2-77cf-46f5-9e6a-79992fa2f212"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzE1MTlhMi03N2NmLTQ2ZjUtOWU2YS03OTk5MmZhMmYyMTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3MzA2LCJpYXQiOjE3OTMyMDY0MDYsImp0aSI6ImE2OTg3ZjJhLTZhY2MtNDMzYi1iMGJjLWNiNThhNzc0ZWIwZiIsInNpZCI6IjExYTMyYWZhLWNhZmYtNDc0ZS1hMGQ2LTkwNTAxNTk3MGNkZSJ9.-E5cUTgqzr7052Yzzppiix_Hlb5oBM3OSbqOooZ8kYo",
  "access_expires_at": "2026-10-28T17:08:26.753751503Z",
  "refresh_token": "atfbgJfC3h14WqEj0TCBo2A7dhFXb779tn1XHWEr5CY",
  "refresh_expires_at": "2026-11-27T16:53:26.753216052Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "431519a2-77cf-46f5-9e6a-79992fa2f212",
  "session_id": "11a32afa-caff-474e-a0d6-905015970cde",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632302177",
  "device_ref": "sandbox-12318"
}
```

```json
{
  "challenge_id": "32752070-366b-4956-b10b-8687d45a8806",
  "expires_at": "2026-10-28T16:58:29.263460588Z",
  "resend_available_at": "2026-10-28T16:53:30.263460588Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632302177` → **200**

```json
{
  "phone": "+380632302177",
  "audience": "CLIENT",
  "code": "720435",
  "sent_at": "2026-10-28T16:53:29.265720567Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "32752070-366b-4956-b10b-8687d45a8806",
  "code": "720435",
  "device_ref": "sandbox-12318"
}
```

```json
{
  "session_id": "c0b91488-54cf-452c-842e-460ee6b9ca77",
  "subject": {
    "type": "CLIENT",
    "id": "431519a2-77cf-46f5-9e6a-79992fa2f212"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzE1MTlhMi03N2NmLTQ2ZjUtOWU2YS03OTk5MmZhMmYyMTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3MzA5LCJpYXQiOjE3OTMyMDY0MDksImp0aSI6IjhiODQ4NDFkLWY3ZmQtNGUyMC05ZTMyLTBiNDZjNmRkNmY5MiIsInNpZCI6ImMwYjkxNDg4LTU0Y2YtNDUyYy04NDJlLTQ2MGVlNmI5Y2E3NyJ9.kqESugIyUDVABMaDnxaRtVcLovKqcwjzgfGUnLtHC6c",
  "access_expires_at": "2026-10-28T17:08:29.554647817Z",
  "refresh_token": "4MF_do6cocl9dN8zhgGA5TOKZbGWUPDCHK-WEM3UpdA",
  "refresh_expires_at": "2026-11-27T16:53:29.554199383Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "2d3c5cfc-e900-4ba9-82a4-ce47a2404af3",
  "expires_at": "2026-10-28T16:58:31.835821529Z",
  "resend_available_at": "2026-10-28T16:53:32.835821529Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632302177` → **200**

```json
{
  "phone": "+380632302177",
  "audience": "CLIENT",
  "code": "060733",
  "sent_at": "2026-10-28T16:53:31.837873312Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380638362055"
}
```

```json
{
  "challenge_id": "236aacef-2e32-478b-a84d-e700e2e59611",
  "expires_at": "2026-10-28T16:58:32.120599772Z",
  "resend_available_at": "2026-10-28T16:53:33.120599772Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638362055` → **200**

```json
{
  "phone": "+380638362055",
  "audience": "CLIENT",
  "code": "352370",
  "sent_at": "2026-10-28T16:53:32.122390906Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "33f7308e-2745-4437-a049-d8d4d837b360",
  "current_challenge_id": "2d3c5cfc-e900-4ba9-82a4-ce47a2404af3",
  "current_code": "000000",
  "new_challenge_id": "236aacef-2e32-478b-a84d-e700e2e59611",
  "new_code": "352370"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "e3ee0bef-69e2-4a7c-8882-2243c886330b"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "2178f3b0-47c1-4ef7-9535-23e4eea778e8",
  "current_challenge_id": "2d3c5cfc-e900-4ba9-82a4-ce47a2404af3",
  "current_code": "060733",
  "new_challenge_id": "236aacef-2e32-478b-a84d-e700e2e59611",
  "new_code": "352370"
}
```

```json
{
  "subject_id": "431519a2-77cf-46f5-9e6a-79992fa2f212",
  "phone": "+380638362055",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "431519a2-77cf-46f5-9e6a-79992fa2f212",
  "session_id": "11a32afa-caff-474e-a0d6-905015970cde",
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
  "correlation_id": "a3a769f3-61e8-4f7c-a8f9-9106b1cc2a81"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638362055",
  "device_ref": "sandbox-14872"
}
```

```json
{
  "challenge_id": "c970b464-9d61-497b-8c60-5c898400aea1",
  "expires_at": "2026-10-28T16:58:35.445816348Z",
  "resend_available_at": "2026-10-28T16:53:36.445816348Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638362055` → **200**

```json
{
  "phone": "+380638362055",
  "audience": "CLIENT",
  "code": "099118",
  "sent_at": "2026-10-28T16:53:35.448192196Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c970b464-9d61-497b-8c60-5c898400aea1",
  "code": "099118",
  "device_ref": "sandbox-14872"
}
```

```json
{
  "session_id": "b2a83a84-13d3-49a3-8b93-f1fcd1ce5dc5",
  "subject": {
    "type": "CLIENT",
    "id": "431519a2-77cf-46f5-9e6a-79992fa2f212"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzE1MTlhMi03N2NmLTQ2ZjUtOWU2YS03OTk5MmZhMmYyMTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3MzE1LCJpYXQiOjE3OTMyMDY0MTUsImp0aSI6ImZiYzRkNmM0LWY1OTctNDJhMi1hZDI2LTFmOTM4ZTJlYTE2ZCIsInNpZCI6ImIyYTgzYTg0LTEzZDMtNDlhMy04YjkzLWYxZmNkMWNlNWRjNSJ9.gHsapWx_cguKfdoxlHGG1ta3Qz_YjRk1LT86gkJxI7Q",
  "access_expires_at": "2026-10-28T17:08:35.740313221Z",
  "refresh_token": "L0T3v0fUISdycAr30pi4V1xeNDfcX9zMAOT3ui8UnIY",
  "refresh_expires_at": "2026-11-27T16:53:35.739506384Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "431519a2-77cf-46f5-9e6a-79992fa2f212",
  "session_id": "b2a83a84-13d3-49a3-8b93-f1fcd1ce5dc5",
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
  "session_id": "4cb3ec4c-27cb-4d74-8e07-959c50092497",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDczMTYsImlhdCI6MTc5MzIwNjQxNiwianRpIjoiNjBkMGJhMmUtZWRkYy00NzZhLTk2ZGYtOGFkMjVhYWZlYzQ2Iiwic2lkIjoiNGNiM2VjNGMtMjdjYi00ZDc0LThlMDctOTU5YzUwMDkyNDk3In0.09vncoxN5N0VpedC7h0MMNXiRfENcjGm2JoMVFHfSgs",
  "access_expires_at": "2026-10-28T17:08:36.578517257Z",
  "refresh_token": "AInhdhdWOrs00ui5QEShkzhvv3_N5br01N-w-otrRMI",
  "refresh_expires_at": "2026-10-29T04:53:36.578008957Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/431519a2-77cf-46f5-9e6a-79992fa2f212` → **200**

```json
{
  "client": {
    "id": "431519a2-77cf-46f5-9e6a-79992fa2f212",
    "phone": "+380638362055",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T16:53:26.751345Z",
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

`POST /api/admin/v1/clients/431519a2-77cf-46f5-9e6a-79992fa2f212/phone` → **400**

```json
{
  "command_id": "bf097061-f23c-463b-94a4-e49774998cf2",
  "expected_version": 3,
  "phone": "+380636568528",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/431519a2-77cf-46f5-9e6a-79992fa2f212/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "0b2ea226-7568-42ae-965f-18a0a453ed18",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/431519a2-77cf-46f5-9e6a-79992fa2f212/phone` → **200**

```json
{
  "command_id": "720ebd49-7ef5-490b-9785-06fa4276c211",
  "expected_version": 3,
  "phone": "+380636568528",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "431519a2-77cf-46f5-9e6a-79992fa2f212",
  "phone": "+380636568528",
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
  "correlation_id": "ab42db6d-555f-4283-ad12-1d1029751686"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636568528",
  "device_ref": "sandbox-8661"
}
```

```json
{
  "challenge_id": "37e324e9-e0b0-4b33-b257-9af3bcab29ff",
  "expires_at": "2026-10-28T16:58:37.923136567Z",
  "resend_available_at": "2026-10-28T16:53:38.923136567Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636568528` → **200**

```json
{
  "phone": "+380636568528",
  "audience": "CLIENT",
  "code": "798727",
  "sent_at": "2026-10-28T16:53:37.925274219Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "37e324e9-e0b0-4b33-b257-9af3bcab29ff",
  "code": "798727",
  "device_ref": "sandbox-8661"
}
```

```json
{
  "session_id": "10fd7d50-9027-45cb-abce-16e07012c29f",
  "subject": {
    "type": "CLIENT",
    "id": "431519a2-77cf-46f5-9e6a-79992fa2f212"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzE1MTlhMi03N2NmLTQ2ZjUtOWU2YS03OTk5MmZhMmYyMTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3MzE4LCJpYXQiOjE3OTMyMDY0MTgsImp0aSI6IjI1YjBmOTliLTZhMDYtNGZlZC05ZDNlLTQ5MTU2ZDhmMTZjNiIsInNpZCI6IjEwZmQ3ZDUwLTkwMjctNDVjYi1hYmNlLTE2ZTA3MDEyYzI5ZiJ9.-PyQXKCZ2gkzaaEr2bttjS2EVsiTX8iTe_Z8Yue68S4",
  "access_expires_at": "2026-10-28T17:08:38.217056067Z",
  "refresh_token": "nQOL5Mnp6r-v9IYtRGB6Y1JhVAR2xU8YYD09rf9Zp4o",
  "refresh_expires_at": "2026-11-27T16:53:38.216478205Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "431519a2-77cf-46f5-9e6a-79992fa2f212",
  "session_id": "10fd7d50-9027-45cb-abce-16e07012c29f",
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
  "phone": "+380637351146",
  "device_ref": "sandbox-7033"
}
```

```json
{
  "challenge_id": "a5accb16-2e10-4f6f-9c80-7fa6db416e5d",
  "expires_at": "2026-10-28T16:58:38.730518373Z",
  "resend_available_at": "2026-10-28T16:53:39.730518373Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637351146` → **200**

```json
{
  "phone": "+380637351146",
  "audience": "CLIENT",
  "code": "151263",
  "sent_at": "2026-10-28T16:53:38.732731886Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a5accb16-2e10-4f6f-9c80-7fa6db416e5d",
  "code": "151263",
  "device_ref": "sandbox-7033"
}
```

```json
{
  "session_id": "63a4f56a-6de3-4af7-a289-166c07c266d6",
  "subject": {
    "type": "CLIENT",
    "id": "574d735b-dd42-4b26-98a6-6c617b6d84c7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NzRkNzM1Yi1kZDQyLTRiMjYtOThhNi02YzYxN2I2ZDg0YzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3MzE5LCJpYXQiOjE3OTMyMDY0MTksImp0aSI6IjFkNjhiNjlmLWI2NjktNDViMC04NTNjLWI4ZWZiNDMxZDhlNyIsInNpZCI6IjYzYTRmNTZhLTZkZTMtNGFmNy1hMjg5LTE2NmMwN2MyNjZkNiJ9.4HsEIzWtoWCmFvm00buYfM2PpbvQKAB8clE9zvc-A_E",
  "access_expires_at": "2026-10-28T17:08:39.011383503Z",
  "refresh_token": "-U6gVwV-mgSqDDRCTINDqZ-CTCthBPKzdojSy7rjZ2A",
  "refresh_expires_at": "2026-11-27T16:53:39.010794427Z",
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
  "session_id": "7b9c3761-a15b-4b4f-ac5c-f0fad491c900",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDczMjAsImlhdCI6MTc5MzIwNjQyMCwianRpIjoiN2M3ZjE0YWItODRhZC00YTViLWE4NjItZDg5MDU4ZGZkMzg1Iiwic2lkIjoiN2I5YzM3NjEtYTE1Yi00YjRmLWFjNWMtZjBmYWQ0OTFjOTAwIn0.90VU6x0dvnLyPonJGr5II9YPi81pq14z961QfVQPcZ0",
  "access_expires_at": "2026-10-28T17:08:40.129365207Z",
  "refresh_token": "7YWXEe6mcAUZuvFR3TPtA18pfAsil9T0km85kJqiEAY",
  "refresh_expires_at": "2026-10-29T04:53:40.128819272Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380637351146` → **200**

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
  "correlation_id": "31112bcb-6a71-4ea9-8f82-86319f3ec7c3"
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
  "session_id": "f1fd5752-1f14-48ea-9bc6-6684c4edf9f3",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDczMjEsImlhdCI6MTc5MzIwNjQyMSwianRpIjoiOGU0NTMzOTMtMDAyNC00MWQxLWFkMTYtZDgzNDkzMWVkYmJjIiwic2lkIjoiZjFmZDU3NTItMWYxNC00OGVhLTliYzYtNjY4NGM0ZWRmOWYzIn0.D2_iD__bwMPKZU3rzJ6paQCOrh3bFVhyzJ5GzmX6cic",
  "access_expires_at": "2026-10-28T17:08:41.239467848Z",
  "refresh_token": "3cGE6rZiHdLGZ0gqz_F96CkyL9a4R0A4TINSvYekJhI",
  "refresh_expires_at": "2026-10-29T04:53:41.238816515Z",
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
  "changed_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
  "reason": "Sandbox clean-up",
  "changed_at": "2026-10-28T16:50:39.07671Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "e465ba47-63f7-453b-bed5-27a15c2fb42c",
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
  "changed_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T16:53:41.763565043Z"
}
```

## The rider books the airport for 2026-10-28T19:53:40Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600113950",
  "device_ref": "sandbox-30415"
}
```

```json
{
  "challenge_id": "f025367b-93b7-49e6-aad3-7da335b44f3d",
  "expires_at": "2026-10-28T16:58:42.034793856Z",
  "resend_available_at": "2026-10-28T16:53:43.034793856Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600113950` → **200**

```json
{
  "phone": "+48600113950",
  "audience": "CLIENT",
  "code": "437649",
  "sent_at": "2026-10-28T16:53:42.038136779Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f025367b-93b7-49e6-aad3-7da335b44f3d",
  "code": "437649",
  "device_ref": "sandbox-30415"
}
```

```json
{
  "session_id": "2a978209-37f2-402a-ab23-7b406f79aa0a",
  "subject": {
    "type": "CLIENT",
    "id": "1ec65ff8-d5db-44ef-bad5-6cb1a1a5ca00"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZWM2NWZmOC1kNWRiLTQ0ZWYtYmFkNS02Y2IxYTFhNWNhMDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3MzIyLCJpYXQiOjE3OTMyMDY0MjIsImp0aSI6IjFiODIyYjIzLTM5ZDctNGU0ZS1hNGEzLWMzNmNmMDUzMWEzMCIsInNpZCI6IjJhOTc4MjA5LTM3ZjItNDAyYS1hYjIzLTdiNDA2Zjc5YWEwYSJ9.Q-m7ybvQZ4XTJBZ5FxsMMBjqzGoJjL02fZq1f_QVS7g",
  "access_expires_at": "2026-10-28T17:08:42.312439844Z",
  "refresh_token": "F7u1njJ8ma7Hr_ux5c364txLExUJU-ccFMZrRHmVyL0",
  "refresh_expires_at": "2026-11-27T16:53:42.311677679Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d25e88ee-aa5d-4ec3-bc45-8999f625dd62",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T19:53:40Z"
}
```

```json
{
  "id": "060b51f6-2a4e-4f1e-9ae0-7ecd29a1da5b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:58:42.575943Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T19:53:40Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3b68f82d-5f1d-4a33-8704-c7c967c2ef80",
  "quote_id": "060b51f6-2a4e-4f1e-9ae0-7ecd29a1da5b",
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
  "pickup_at": "2026-10-28T19:53:40Z"
}
```

```json
{
  "id": "2b8f066e-2d4b-4a24-b38d-9bbb269b90c6",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1ec65ff8-d5db-44ef-bad5-6cb1a1a5ca00",
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
  "created_at": "2026-10-28T16:53:42.849318Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T19:53:40Z",
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
  "device_ref": "sandbox-7146"
}
```

```json
{
  "challenge_id": "24dfb009-a8ca-4724-a417-6e36d658df27",
  "expires_at": "2026-10-28T16:58:43.12267929Z",
  "resend_available_at": "2026-10-28T16:53:44.12267929Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "215856",
  "sent_at": "2026-10-28T16:53:43.12486361Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "24dfb009-a8ca-4724-a417-6e36d658df27",
  "code": "215856",
  "device_ref": "sandbox-7146"
}
```

```json
{
  "session_id": "78181601-66d9-4afc-ab2e-230348ddf923",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNzMyMywiaWF0IjoxNzkzMjA2NDIzLCJqdGkiOiJhZWJhYmVhZi04YzhiLTQ2MzctOGViZi1mNGE2YzFiMWZkZTciLCJzaWQiOiI3ODE4MTYwMS02NmQ5LTRhZmMtYWIyZS0yMzAzNDhkZGY5MjMifQ.CZytJFe4yMCN9MaOqyP3AR560GbLVQ-m7Sv1uJZY5rc",
  "access_expires_at": "2026-10-28T17:08:43.401917721Z",
  "refresh_token": "s-Zop-aTujyIsijQCykFFIx8mbrUzF3XUKUuY5LRZjw",
  "refresh_expires_at": "2026-11-27T16:53:43.401322655Z",
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
  "command_id": "942fc16b-1d07-457f-8ef5-de40ab259042",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:53:43Z",
    "sequence": 1793206423928
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "75b6bd9c-fa90-4492-b434-9a7f2576db40",
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
  "last_heartbeat_at": "2026-10-28T16:53:43.947054Z",
  "last_location_at": "2026-10-28T16:53:43.947054Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "2b8f066e-2d4b-4a24-b38d-9bbb269b90c6",
      "short_number": 18,
      "pickup_at": "2026-10-28T19:53:40Z",
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

`POST /api/driver/v1/preorders/2b8f066e-2d4b-4a24-b38d-9bbb269b90c6/reserve` → **200**

```json
{
  "command_id": "ca2f14b5-f6b0-4050-87d9-a1c51085a19d"
}
```

```json
{
  "id": "b49c49ef-f402-482c-a693-d35b084136d5",
  "state": "RESERVED",
  "order": {
    "order_id": "2b8f066e-2d4b-4a24-b38d-9bbb269b90c6",
    "short_number": 18,
    "pickup_at": "2026-10-28T19:53:40Z",
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
  "reserved_at": "2026-10-28T16:53:44.477588Z",
  "confirm_from": "2026-10-28T19:23:40Z",
  "confirm_until": "2026-10-28T19:33:40Z",
  "drop_until": "2026-10-28T18:53:40Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "b49c49ef-f402-482c-a693-d35b084136d5",
      "state": "RESERVED",
      "order": {
        "order_id": "2b8f066e-2d4b-4a24-b38d-9bbb269b90c6",
        "short_number": 18,
        "pickup_at": "2026-10-28T19:53:40Z",
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
      "reserved_at": "2026-10-28T16:53:44.477588Z",
      "confirm_from": "2026-10-28T19:23:40Z",
      "confirm_until": "2026-10-28T19:33:40Z",
      "drop_until": "2026-10-28T18:53:40Z"
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
      "id": "b49c49ef-f402-482c-a693-d35b084136d5",
      "state": "RESERVED",
      "order": {
        "order_id": "2b8f066e-2d4b-4a24-b38d-9bbb269b90c6",
        "short_number": 18,
        "pickup_at": "2026-10-28T19:53:40Z",
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
      "reserved_at": "2026-10-28T16:53:44.477588Z",
      "confirm_from": "2026-10-28T19:23:40Z",
      "confirm_until": "2026-10-28T19:33:40Z",
      "drop_until": "2026-10-28T18:53:40Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/b49c49ef-f402-482c-a693-d35b084136d5/confirm` → **409**

```json
{
  "command_id": "fb69b341-7d82-4335-9a76-a8858644d69f"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/b49c49ef-f402-482c-a693-d35b084136d5/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "1782ed73-5f83-4d0f-a2ab-2873e8c7520e"
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
  "session_id": "d87fa268-1d16-428d-987f-fdb9eb8d67c5",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDczMjUsImlhdCI6MTc5MzIwNjQyNSwianRpIjoiMTY0ZDIxNWYtZjgxZS00OWJhLWJhYTItMzE3ZGU3OWRmOTA1Iiwic2lkIjoiZDg3ZmEyNjgtMWQxNi00MjhkLTk4N2YtZmRiOWViOGQ2N2M1In0.-WGA9_L2guINGMPwDYTYwDphQf50jIGWtJrpe-0DiMs",
  "access_expires_at": "2026-10-28T17:08:45.833925537Z",
  "refresh_token": "My_S5xhvNPVmb2h-ABYcJDqk56Yn1EURqrsriBdtAr0",
  "refresh_expires_at": "2026-10-29T04:53:45.833390245Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2b8f066e-2d4b-4a24-b38d-9bbb269b90c6` → **200**

```json
{
  "id": "2b8f066e-2d4b-4a24-b38d-9bbb269b90c6",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "1ec65ff8-d5db-44ef-bad5-6cb1a1a5ca00",
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
  "created_at": "2026-10-28T16:53:42.849318Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T19:53:40Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "b49c49ef-f402-482c-a693-d35b084136d5",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T16:53:44.477588Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/2b8f066e-2d4b-4a24-b38d-9bbb269b90c6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T16:53:42.850641Z",
      "actor": {
        "type": "CLIENT",
        "id": "1ec65ff8-d5db-44ef-bad5-6cb1a1a5ca00",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "2b8f066e-2d4b-4a24-b38d-9bbb269b90c6",
        "preorder": true,
        "quote_id": "060b51f6-2a4e-4f1e-9ae0-7ecd29a1da5b",
        "pickup_at": "2026-10-28T19:53:40Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "06256235-29a7-4787-9c75-0522cfc666c7"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T16:53:44.478852Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2b8f066e-2d4b-4a24-b38d-9bbb269b90c6",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "b49c49ef-f402-482c-a693-d35b084136d5"
      },
      "correlation_id": "0edfe429-aa91-4e9e-850a-0e5bafb24137"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 2b8f066e-2d4b-4a24-b38d-9bbb269b90c6, reservation b49c49ef-f402-482c-a693-d35b084136d5.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-14028"
}
```

```json
{
  "challenge_id": "bd793db1-6472-4166-8be4-f671ae94a817",
  "expires_at": "2026-10-28T16:58:46.629635357Z",
  "resend_available_at": "2026-10-28T16:53:47.629635357Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "103958",
  "sent_at": "2026-10-28T16:53:46.631800102Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bd793db1-6472-4166-8be4-f671ae94a817",
  "code": "103958",
  "device_ref": "sandbox-14028"
}
```

```json
{
  "session_id": "52760516-0111-4ceb-b53a-ed7b8138cfb1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNzMyNiwiaWF0IjoxNzkzMjA2NDI2LCJqdGkiOiI1Yjg4ZmFlYi0zYjcyLTQyZjAtYjUxNi0wZDY4M2Y5NTc1ZjgiLCJzaWQiOiI1Mjc2MDUxNi0wMTExLTRjZWItYjUzYS1lZDdiODEzOGNmYjEifQ.NhfQca8Xwpa7VvHHIRbL2haKTWLJBuoWxnx4h_5xoLA",
  "access_expires_at": "2026-10-28T17:08:46.910052291Z",
  "refresh_token": "xfdHC2V_EOI1gTcY08kjY3LhyLQN3G6lFGKf0r4v7qI",
  "refresh_expires_at": "2026-11-27T16:53:46.909522968Z",
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
  "command_id": "e4de6e43-a36e-44d0-884e-243b0a2dd743",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:53:47Z",
    "sequence": 1793206427411
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ce66f2b1-71ee-4db2-b057-08709f8c15a4",
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
  "last_heartbeat_at": "2026-10-28T16:53:47.429119Z",
  "last_location_at": "2026-10-28T16:53:47.429119Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670283653",
  "device_ref": "sandbox-7108"
}
```

```json
{
  "challenge_id": "5a4f938d-70eb-4b3b-9030-05cfa6b6000d",
  "expires_at": "2026-10-28T16:58:47.686716951Z",
  "resend_available_at": "2026-10-28T16:53:48.686716951Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670283653` → **200**

```json
{
  "phone": "+380670283653",
  "audience": "CLIENT",
  "code": "016622",
  "sent_at": "2026-10-28T16:53:47.688865754Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5a4f938d-70eb-4b3b-9030-05cfa6b6000d",
  "code": "016622",
  "device_ref": "sandbox-7108"
}
```

```json
{
  "session_id": "041a08ec-ce93-4689-8fc0-cd2b36368f5d",
  "subject": {
    "type": "CLIENT",
    "id": "c6b4dd1b-d08c-49b3-8b8e-fb48c4e25689"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNmI0ZGQxYi1kMDhjLTQ5YjMtOGI4ZS1mYjQ4YzRlMjU2ODkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3MzI3LCJpYXQiOjE3OTMyMDY0MjcsImp0aSI6IjQ4NDFlZDZiLTY1MWEtNDFhMS05ZGUxLWI4ZGNiYmZjMDk5ZSIsInNpZCI6IjA0MWEwOGVjLWNlOTMtNDY4OS04ZmMwLWNkMmIzNjM2OGY1ZCJ9.6IshLlfD7j4AwIob7O4BzWl3ZVzbj9j637HIyQRwS-E",
  "access_expires_at": "2026-10-28T17:08:47.974544328Z",
  "refresh_token": "I5-TsoR7pkWKBWW6QCp5YAELfgcesjhKCkdbYPPJnwU",
  "refresh_expires_at": "2026-11-27T16:53:47.974046916Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "94524df0-8c7f-4be5-83d3-69c63e91e9a3",
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
  "id": "1b7b6349-7ca0-4dd1-8b6a-74d46fd9742d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:58:48.240052Z",
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
  "command_id": "660efa8e-8a06-47a4-a42f-7c59208ff16c",
  "quote_id": "1b7b6349-7ca0-4dd1-8b6a-74d46fd9742d",
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
  "id": "01ad8e66-7db0-4ff4-b8bc-1dd4d0611650",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c6b4dd1b-d08c-49b3-8b8e-fb48c4e25689",
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
  "created_at": "2026-10-28T16:53:48.506389Z",
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
    "id": "ad98ee9d-f99f-4fe3-9fd8-f69dce8e12bf",
    "order_id": "01ad8e66-7db0-4ff4-b8bc-1dd4d0611650",
    "expires_at": "2026-10-28T16:54:03.509647Z",
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

`POST /api/driver/v1/offers/ad98ee9d-f99f-4fe3-9fd8-f69dce8e12bf/accept` → **200**

```json
{
  "command_id": "72452f0a-63ef-43d9-b413-5ad4abf6e71d"
}
```

```json
{
  "id": "2b5364cd-ebb2-4897-8ad6-a823d52f118a",
  "order_id": "01ad8e66-7db0-4ff4-b8bc-1dd4d0611650",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9ebb1fb8-2ee8-425f-8390-a7034f533a07",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9ebb1fb8-2ee8-425f-8390-a7034f533a07",
  "order_id": "01ad8e66-7db0-4ff4-b8bc-1dd4d0611650",
  "assignment_id": "2b5364cd-ebb2-4897-8ad6-a823d52f118a",
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

`POST /api/driver/v1/work-sessions/ce66f2b1-71ee-4db2-b057-08709f8c15a4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:53:49Z",
    "sequence": 1793206429566
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ce66f2b1-71ee-4db2-b057-08709f8c15a4",
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
  "last_heartbeat_at": "2026-10-28T16:53:49.584892Z",
  "last_location_at": "2026-10-28T16:53:49.584892Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9ebb1fb8-2ee8-425f-8390-a7034f533a07",
  "order_id": "01ad8e66-7db0-4ff4-b8bc-1dd4d0611650",
  "assignment_id": "2b5364cd-ebb2-4897-8ad6-a823d52f118a",
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

`POST /api/driver/v1/trips/9ebb1fb8-2ee8-425f-8390-a7034f533a07/arrive` → **200**

```json
{
  "command_id": "43f879ea-ded7-47d9-af68-5e283e41c6df",
  "expected_version": 0
}
```

```json
{
  "id": "9ebb1fb8-2ee8-425f-8390-a7034f533a07",
  "order_id": "01ad8e66-7db0-4ff4-b8bc-1dd4d0611650",
  "assignment_id": "2b5364cd-ebb2-4897-8ad6-a823d52f118a",
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
  "arrived_at": "2026-10-28T16:53:50.089925Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9ebb1fb8-2ee8-425f-8390-a7034f533a07/start` → **200**

```json
{
  "command_id": "e24a9290-c1a5-4df9-9d36-c4491351e7e7",
  "expected_version": 1
}
```

```json
{
  "id": "9ebb1fb8-2ee8-425f-8390-a7034f533a07",
  "order_id": "01ad8e66-7db0-4ff4-b8bc-1dd4d0611650",
  "assignment_id": "2b5364cd-ebb2-4897-8ad6-a823d52f118a",
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
  "arrived_at": "2026-10-28T16:53:50.089925Z",
  "started_at": "2026-10-28T16:53:50.357102Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/ce66f2b1-71ee-4db2-b057-08709f8c15a4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:53:50Z",
    "sequence": 1793206430607
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ce66f2b1-71ee-4db2-b057-08709f8c15a4",
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
  "last_heartbeat_at": "2026-10-28T16:53:50.62573Z",
  "last_location_at": "2026-10-28T16:53:50.62573Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/9ebb1fb8-2ee8-425f-8390-a7034f533a07/complete` → **200**

```json
{
  "command_id": "1dbf1e50-ae49-41ba-827d-fc59ba16f2a5",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:53:50Z",
  "cash_received": true
}
```

```json
{
  "id": "9ebb1fb8-2ee8-425f-8390-a7034f533a07",
  "order_id": "01ad8e66-7db0-4ff4-b8bc-1dd4d0611650",
  "assignment_id": "2b5364cd-ebb2-4897-8ad6-a823d52f118a",
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
  "arrived_at": "2026-10-28T16:53:50.089925Z",
  "started_at": "2026-10-28T16:53:50.357102Z",
  "completed_at": "2026-10-28T16:53:50.898109Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/01ad8e66-7db0-4ff4-b8bc-1dd4d0611650/rating` → **200**

```json
{
  "command_id": "856756ea-282a-4047-90d7-d6d79829db53",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "01ad8e66-7db0-4ff4-b8bc-1dd4d0611650",
  "score": 5,
  "created_at": "2026-10-28T16:53:51.175193726Z"
}
```

`POST /api/driver/v1/orders/01ad8e66-7db0-4ff4-b8bc-1dd4d0611650/rating` → **200**

```json
{
  "command_id": "07aa5416-18d4-45fc-9ef8-cfe0206e2a96",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "01ad8e66-7db0-4ff4-b8bc-1dd4d0611650",
  "score": 4,
  "created_at": "2026-10-28T16:53:51.450439702Z"
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
  "session_id": "9184ca9a-ec7c-4ee6-9d72-29c298863245",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDczMzIsImlhdCI6MTc5MzIwNjQzMiwianRpIjoiMmMwNTNiYmUtODZjYy00NTMwLThmZTEtYjhlNjg0YWNhNjg0Iiwic2lkIjoiOTE4NGNhOWEtZWM3Yy00ZWU2LTlkNzItMjljMjk4ODYzMjQ1In0.rK5Cs8tXE3RungYPBgCagJneJZ3vuidna1tWygdcBy0",
  "access_expires_at": "2026-10-28T17:08:52.292002634Z",
  "refresh_token": "u7qPXNT_OUU2hBmBr4yMXHlrXtDQFpwy9O2GBXEJRYA",
  "refresh_expires_at": "2026-10-29T04:53:52.291354816Z",
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
  "session_id": "1bc1d33d-b3fe-4278-89d1-31e309e0bea0",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDczMzIsImlhdCI6MTc5MzIwNjQzMiwianRpIjoiZmMyOTJkNWItYjc0MS00YWMwLWI1MjgtNmVjZDg5NWY0M2FkIiwic2lkIjoiMWJjMWQzM2QtYjNmZS00Mjc4LTg5ZDEtMzFlMzA5ZTBiZWEwIn0.sCsDPFCuvQMir_gGTFCnvQbnlVQxxpGrQive5hNuAfg",
  "access_expires_at": "2026-10-28T17:08:52.870261152Z",
  "refresh_token": "v_apELFFkBt-9lxhgmzOpsUZeHb68aMI1CbqgQTfyaE",
  "refresh_expires_at": "2026-10-29T04:53:52.869741026Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/01ad8e66-7db0-4ff4-b8bc-1dd4d0611650/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "01ad8e66-7db0-4ff4-b8bc-1dd4d0611650",
      "author_type": "RIDER",
      "author_id": "c6b4dd1b-d08c-49b3-8b8e-fb48c4e25689",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T16:53:51.175194Z"
    },
    {
      "order_id": "01ad8e66-7db0-4ff4-b8bc-1dd4d0611650",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "c6b4dd1b-d08c-49b3-8b8e-fb48c4e25689",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T16:53:51.45044Z"
    }
  ]
}
```

Done: ratings for order 01ad8e66-7db0-4ff4-b8bc-1dd4d0611650.

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
  "session_id": "4df31f24-2876-4459-ae7e-579b6112b7e6",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDczMzMsImlhdCI6MTc5MzIwNjQzMywianRpIjoiOWRhOWE2MmMtZDA1Ny00OGMxLTk0NTEtZjM4NmQxOWNiYWJlIiwic2lkIjoiNGRmMzFmMjQtMjg3Ni00NDU5LWFlN2UtNTc5YjYxMTJiN2U2In0.SRRKexgtnhK_GE4RMu674hspw5Qdyeke1vzM1mRC49E",
  "access_expires_at": "2026-10-28T17:08:53.714549207Z",
  "refresh_token": "G5ZySrWKZ-TN2Q9gbnea1qxwLa1l1XkWAO3XA_sMa_Y",
  "refresh_expires_at": "2026-10-29T04:53:53.714056538Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "aa68c3a7-4f0a-4c10-b5ec-4d0c303b3bfd",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "9ce6eab0-6940-461f-ace8-b84532123788",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:53:53.988589Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/9ce6eab0-6940-461f-ace8-b84532123788` → **200**

```json
{
  "id": "9ce6eab0-6940-461f-ace8-b84532123788",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:53:53.988589Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/9ce6eab0-6940-461f-ace8-b84532123788` → **200**

```json
{
  "id": "9ce6eab0-6940-461f-ace8-b84532123788",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T16:53:53.988589Z",
  "ready_at": "2026-10-28T16:53:55.029586Z",
  "expires_at": "2026-10-29T16:53:55.029586Z"
}
```

`GET /api/admin/v1/reports/exports/9ce6eab0-6940-461f-ace8-b84532123788/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
total,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "b80519df-58d4-4cb3-83ff-64b4bf671499",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "e760e407-9106-4354-b78f-b59cd0055691",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:53:55.807947Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e760e407-9106-4354-b78f-b59cd0055691` → **200**

```json
{
  "id": "e760e407-9106-4354-b78f-b59cd0055691",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:53:55.807947Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e760e407-9106-4354-b78f-b59cd0055691` → **200**

```json
{
  "id": "e760e407-9106-4354-b78f-b59cd0055691",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:53:55.807947Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e760e407-9106-4354-b78f-b59cd0055691` → **200**

```json
{
  "id": "e760e407-9106-4354-b78f-b59cd0055691",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:53:55.807947Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e760e407-9106-4354-b78f-b59cd0055691` → **200**

```json
{
  "id": "e760e407-9106-4354-b78f-b59cd0055691",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:53:55.807947Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e760e407-9106-4354-b78f-b59cd0055691` → **200**

```json
{
  "id": "e760e407-9106-4354-b78f-b59cd0055691",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T16:53:55.807947Z",
  "ready_at": "2026-10-28T16:54:00.039036Z",
  "expires_at": "2026-10-29T16:54:00.039036Z"
}
```

`GET /api/admin/v1/reports/exports/e760e407-9106-4354-b78f-b59cd0055691/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/4962d624-7312-4b2a-b7c5-d6c2d04a9e71` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/4962d624-7312-4b2a-b7c5-d6c2d04a9e71",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c10d119d-6a52-47a2-9928-54f19dd70251"
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
  "device_ref": "sandbox-19829"
}
```

```json
{
  "challenge_id": "bd629e49-f361-41ac-8797-cb8db0041b94",
  "expires_at": "2026-10-28T16:59:01.684789234Z",
  "resend_available_at": "2026-10-28T16:54:02.684789234Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "710095",
  "sent_at": "2026-10-28T16:54:01.687310469Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bd629e49-f361-41ac-8797-cb8db0041b94",
  "code": "710095",
  "device_ref": "sandbox-19829"
}
```

```json
{
  "session_id": "83e8eef5-d0ec-4177-8077-c28a06097b7a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNzM0MSwiaWF0IjoxNzkzMjA2NDQxLCJqdGkiOiI0ODI0YzAzNi1iYmIzLTQ3NjAtOWMzYS04ZjI5Y2RiNGYzYTMiLCJzaWQiOiI4M2U4ZWVmNS1kMGVjLTQxNzctODA3Ny1jMjhhMDYwOTdiN2EifQ.xYA88whmbdhlmZ5mJXEvWWFYQ23Kn6-Om3aEbz-BehY",
  "access_expires_at": "2026-10-28T17:09:01.966530663Z",
  "refresh_token": "tU2wLi_bcPP0XTozwutVQwN9Q0SOejEn2bobK-WAO_4",
  "refresh_expires_at": "2026-11-27T16:54:01.965827642Z",
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
  "command_id": "015c9d9a-1f67-4f1d-8f64-ee543e2c451a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:54:02Z",
    "sequence": 1793206442724
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1ab16cc1-4ccf-4002-a7e4-641446b50fde",
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
  "last_heartbeat_at": "2026-10-28T16:54:02.743199Z",
  "last_location_at": "2026-10-28T16:54:02.743199Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "03521771-998b-4c1a-a921-64429442b282",
  "points": [
    {
      "sequence": 1793206445641,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T16:53:04Z"
    },
    {
      "sequence": 1793206445642,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T16:54:05Z"
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
  "session_id": "1a1614b1-5dc2-4290-b83f-14c334180188",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDczNDUsImlhdCI6MTc5MzIwNjQ0NSwianRpIjoiNzFiNTVlMTItZTc3MS00NjdlLWEyMjgtNTU3MGE2MmYxZGI4Iiwic2lkIjoiMWExNjE0YjEtNWRjMi00MjkwLWI4M2YtMTRjMzM0MTgwMTg4In0.-9CX4NoY0VzG4d2amkrPrN5I0wSP3--sR0f3kG3OKhU",
  "access_expires_at": "2026-10-28T17:09:05.628273688Z",
  "refresh_token": "SdHmnDTNG39Og_iM7d_qSzY4zCKn37SFDYgckXKxRFE",
  "refresh_expires_at": "2026-10-29T04:54:05.627670164Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "43255fc2-f4c7-4d09-a22e-dafe8e285f26",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 61.0,
        "speed_kph": 2362,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T16:54:05Z",
        "track_point_id": "631229c4-5846-4f5e-bc1c-67ce268d9a3c",
        "work_session_id": "1ab16cc1-4ccf-4002-a7e4-641446b50fde"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T16:54:05Z",
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

`POST /api/admin/v1/driver-risk-flags/43255fc2-f4c7-4d09-a22e-dafe8e285f26/confirm` → **200**

```json
{
  "command_id": "4eaa40fc-cc7c-46b1-a649-1175752793fa",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "43255fc2-f4c7-4d09-a22e-dafe8e285f26",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 61.0,
    "speed_kph": 2362,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T16:54:05Z",
    "track_point_id": "631229c4-5846-4f5e-bc1c-67ce268d9a3c",
    "work_session_id": "1ab16cc1-4ccf-4002-a7e4-641446b50fde"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T16:54:05Z",
  "reason": null,
  "reviewed_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
  "reviewed_at": "2026-10-28T16:54:06.470997Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/43255fc2-f4c7-4d09-a22e-dafe8e285f26/dismiss` → **409**

```json
{
  "command_id": "3ffeb361-24e7-4a1a-80df-0aabcb40c003",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/43255fc2-f4c7-4d09-a22e-dafe8e285f26/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4b41815d-9d3f-4d3d-a845-fcfcba12ba5e"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "cb86c6eb-e49f-48b3-aa20-073a67c97027",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "38dd75b0-fa57-4274-a3b2-39359cece93e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
  "raised_at": "2026-10-28T16:54:07.020895Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/38dd75b0-fa57-4274-a3b2-39359cece93e/dismiss` → **200**

```json
{
  "command_id": "2c3183b9-b5c2-4c57-9410-68ec2fa5a9e3",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "38dd75b0-fa57-4274-a3b2-39359cece93e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
  "raised_at": "2026-10-28T16:54:07.020895Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
  "reviewed_at": "2026-10-28T16:54:07.297179Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "0b90ffac-8a10-4158-a65f-ef9009a927a6",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "43255fc2-f4c7-4d09-a22e-dafe8e285f26"
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
      "actor_id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T16:54:07.583224Z"
    }
  ]
}
```

Done: flag 43255fc2-f4c7-4d09-a22e-dafe8e285f26 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "501ea7d8-f918-4302-a77f-98dc0e648b51",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDczNDgsImlhdCI6MTc5MzIwNjQ0OCwianRpIjoiNmNlYjFhYTMtZjhkZS00ZjFhLTgzZjYtMTkzNzZiZGYwMTFhIiwic2lkIjoiNTAxZWE3ZDgtZjkxOC00MzAyLWE3N2YtOThkYzBlNjQ4YjUxIn0.OAtiOKNddaMpSHSM2A7Tf1ci4z8OL25-2ovy4uVUU6E",
  "access_expires_at": "2026-10-28T17:09:08.429776081Z",
  "refresh_token": "4NrEJQ1FlI1vR1v3DBrpXtZ7jjnCeesxpz_l3xvhRbc",
  "refresh_expires_at": "2026-10-29T04:54:08.429322144Z",
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
      "actor_id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T16:54:07.583224Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "c289cb1b-b65d-4790-8544-ed03bbb3aa38",
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
  "session_id": "1ab16cc1-4ccf-4002-a7e4-641446b50fde",
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
  "last_heartbeat_at": "2026-10-28T16:54:02.743199Z",
  "last_location_at": "2026-10-28T16:54:02.743199Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1ab16cc1-4ccf-4002-a7e4-641446b50fde/close` → **200**

```json
{
  "command_id": "6e922518-dee2-4b2a-a5c8-a99699b94ccd",
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
  "session_id": "0db3264c-979e-471d-aa5d-436a535e557b",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDczNTAsImlhdCI6MTc5MzIwNjQ1MCwianRpIjoiNGNkNjJmMmYtZmQ2Zi00MjU3LWJhMzQtMTA2OGFiZDc5ZTY5Iiwic2lkIjoiMGRiMzI2NGMtOTc5ZS00NzFkLWFhNWQtNDM2YTUzNWU1NTdiIn0.hAeUh_Qbrw8Vuxupw1ViPkJYyLw9fkIB7vLsY5ux-mE",
  "access_expires_at": "2026-10-28T17:09:10.061631455Z",
  "refresh_token": "dsiToVK-8r4xoWVlJuO18Jaqo3FjVpVjnxYCZXryAvU",
  "refresh_expires_at": "2026-10-29T04:54:10.061182295Z",
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
  "command_id": "c5ae816e-4e6c-4537-aef4-e936ac1348b4",
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
  "changed_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T16:54:10.594805Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "c5ae816e-4e6c-4537-aef4-e936ac1348b4",
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
  "changed_by": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T16:54:10.594805Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48424283379",
  "device_ref": "sandbox-13705"
}
```

```json
{
  "challenge_id": "6bf9bb18-553d-4b32-a075-3b62e8c95dc3",
  "expires_at": "2026-10-28T16:59:11.148873903Z",
  "resend_available_at": "2026-10-28T16:54:12.148873903Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48424283379` → **200**

```json
{
  "phone": "+48424283379",
  "audience": "CLIENT",
  "code": "927135",
  "sent_at": "2026-10-28T16:54:11.151585672Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6bf9bb18-553d-4b32-a075-3b62e8c95dc3",
  "code": "927135",
  "device_ref": "sandbox-13705"
}
```

```json
{
  "session_id": "5f21598a-cddd-495b-aacd-9f86359c0881",
  "subject": {
    "type": "CLIENT",
    "id": "4d302aef-0372-441c-9933-045c222302c9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDMwMmFlZi0wMzcyLTQ0MWMtOTkzMy0wNDVjMjIyMzAyYzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3MzUxLCJpYXQiOjE3OTMyMDY0NTEsImp0aSI6IjFmZjhhN2Q1LWYzYjUtNDNlZS1hYWJiLTU0MDI4ZThkYjg3ZCIsInNpZCI6IjVmMjE1OThhLWNkZGQtNDk1Yi1hYWNkLTlmODYzNTljMDg4MSJ9.WMKQYYd_c1h5PMmckYSqDjRlse56971iv1KGKn8gDkQ",
  "access_expires_at": "2026-10-28T17:09:11.429376607Z",
  "refresh_token": "4Ic7Zdnpq5IiN-e6LtMwYdiqustHoGbORuVJFwlw8EA",
  "refresh_expires_at": "2026-11-27T16:54:11.428931949Z",
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
  "correlation_id": "461a9370-4895-40d4-af66-91fa494e0799"
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
  "device_ref": "sandbox-23361"
}
```

```json
{
  "challenge_id": "a876a8e8-1909-460b-9162-6a61f7ca6ea5",
  "expires_at": "2026-10-28T16:59:12.207001918Z",
  "resend_available_at": "2026-10-28T16:54:13.207001918Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "785209",
  "sent_at": "2026-10-28T16:54:12.209163063Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a876a8e8-1909-460b-9162-6a61f7ca6ea5",
  "code": "785209",
  "device_ref": "sandbox-23361"
}
```

```json
{
  "session_id": "b49846b1-89ab-4c2b-98e1-75dd7cf3b299",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNzM1MiwiaWF0IjoxNzkzMjA2NDUyLCJqdGkiOiJjZTkyYTBiZC1kZDViLTRlZWUtYTU1OS0wZGE0NzQ2ZGEyMTQiLCJzaWQiOiJiNDk4NDZiMS04OWFiLTRjMmItOThlMS03NWRkN2NmM2IyOTkifQ.O2u96ZBrXl5oOYOKb18hvWDg7udunS6ZMkz0HJBF9ig",
  "access_expires_at": "2026-10-28T17:09:12.497897083Z",
  "refresh_token": "odt0nUquxS1IOT8tlEKNUqVzO7TNl3WTSXIgLwNo01c",
  "refresh_expires_at": "2026-11-27T16:54:12.497437324Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "75b6bd9c-fa90-4492-b434-9a7f2576db40",
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
  "last_heartbeat_at": "2026-10-28T16:53:43.947054Z",
  "last_location_at": "2026-10-28T16:53:43.947054Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/75b6bd9c-fa90-4492-b434-9a7f2576db40/handover` → **200**

```json
{
  "command_id": "21bc777e-207e-4943-bc84-bf17a058d4e6",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "75b6bd9c-fa90-4492-b434-9a7f2576db40",
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
  "last_heartbeat_at": "2026-10-28T16:53:43.947054Z",
  "last_location_at": "2026-10-28T16:53:43.947054Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/75b6bd9c-fa90-4492-b434-9a7f2576db40/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:54:13Z",
    "sequence": 1793206453262
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "75b6bd9c-fa90-4492-b434-9a7f2576db40",
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
  "last_heartbeat_at": "2026-10-28T16:54:13.281706Z",
  "last_location_at": "2026-10-28T16:54:13.281706Z",
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
  "session_id": "75b6bd9c-fa90-4492-b434-9a7f2576db40",
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
  "last_heartbeat_at": "2026-10-28T16:54:13.281706Z",
  "last_location_at": "2026-10-28T16:54:13.281706Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/75b6bd9c-fa90-4492-b434-9a7f2576db40/close` → **200**

```json
{
  "command_id": "52a73f02-5b80-4498-b795-2237ad7b4a00",
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
  "correlation_id": "de4e1ac2-bc81-4fae-851d-9921e48fa421"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677983962",
  "device_ref": "sandbox-11720"
}
```

```json
{
  "challenge_id": "5c3ae0d2-4aec-49a7-9058-114b26c3ba31",
  "expires_at": "2026-10-28T16:59:14.593212362Z",
  "resend_available_at": "2026-10-28T16:54:15.593212362Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677983962` → **200**

```json
{
  "phone": "+380677983962",
  "audience": "CLIENT",
  "code": "419722",
  "sent_at": "2026-10-28T16:54:14.595362809Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5c3ae0d2-4aec-49a7-9058-114b26c3ba31",
  "code": "419722",
  "device_ref": "sandbox-11720"
}
```

```json
{
  "session_id": "a99462e7-0b4b-41ca-b7aa-11eb89ac39b8",
  "subject": {
    "type": "CLIENT",
    "id": "d2b078dc-1513-48e5-bc31-879376240691"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMmIwNzhkYy0xNTEzLTQ4ZTUtYmMzMS04NzkzNzYyNDA2OTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA3MzU0LCJpYXQiOjE3OTMyMDY0NTQsImp0aSI6IjZhYjI4NzNkLTQ5YTMtNDI3MC1hOWMxLTk5NWU5MTkwYzBmYyIsInNpZCI6ImE5OTQ2MmU3LTBiNGItNDFjYS1iN2FhLTExZWI4OWFjMzliOCJ9.A2fS3dBieG0iyxD0HUZLN4plYgKOMCvVs92ZrPXbBb4",
  "access_expires_at": "2026-10-28T17:09:14.878627354Z",
  "refresh_token": "UHXCn8hGlyVekXIJtM0lAur7_wAScaqH8cAvf30ValA",
  "refresh_expires_at": "2026-11-27T16:54:14.878139967Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "6295d910-e145-4876-b15d-9dce39ec8ff4",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "69bf6596-3c27-4a83-8464-4b2028476fcb",
  "upload_path": "/api/rider/v1/uploads/69bf6596-3c27-4a83-8464-4b2028476fcb",
  "expires_at": "2026-10-28T17:09:15.148655904Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/69bf6596-3c27-4a83-8464-4b2028476fcb` → **200**

```json
{
  "file_id": "69bf6596-3c27-4a83-8464-4b2028476fcb",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "6c3cb185-5a7d-4c2d-90e8-4679e4203273",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "69bf6596-3c27-4a83-8464-4b2028476fcb"
  ]
}
```

```json
{
  "id": "87992c64-e485-4d45-80ab-f79851bfb09a",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d2b078dc-1513-48e5-bc31-879376240691",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T16:54:15.456826Z",
  "updated_at": "2026-10-28T16:54:15.456826Z",
  "messages": [
    {
      "id": "d39cb172-f4eb-4af9-86fb-02e5f304f2c5",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d2b078dc-1513-48e5-bc31-879376240691",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:54:15.458493Z",
      "attachments": [
        {
          "file_id": "69bf6596-3c27-4a83-8464-4b2028476fcb",
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
  "session_id": "71d40e29-0e53-46f4-86a7-7fa3266454b1",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDczNTYsImlhdCI6MTc5MzIwNjQ1NiwianRpIjoiZDRhYjQ4YzktNzk5Ny00MjA2LTk0YzgtZmE0ZGI3YWYxMDE1Iiwic2lkIjoiNzFkNDBlMjktMGU1My00NmY0LTg2YTctN2ZhMzI2NjQ1NGIxIn0.C1YXY1HlwXK-dn2Kg1jzU8GV674ZXNe2K1z9hTFPdJk",
  "access_expires_at": "2026-10-28T17:09:16.065807754Z",
  "refresh_token": "R9G_uK09RjCQZI8mKePQIGkYYzClA6WjNRspjkSfxBc",
  "refresh_expires_at": "2026-10-29T04:54:16.064949682Z",
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
  "session_id": "74cd2715-0f7d-44ca-ac6b-c78b12f61e1b",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDczNTYsImlhdCI6MTc5MzIwNjQ1NiwianRpIjoiNTdhMDA5MTEtZmUxOC00Y2EwLWJhYmMtNGUyZTE2MmI3MzhhIiwic2lkIjoiNzRjZDI3MTUtMGY3ZC00NGNhLWFjNmItYzc4YjEyZjYxZTFiIn0.edSta7ZdeigWKxOuV_D4lVAyCvTdldXd9kBQkSu4zDk",
  "access_expires_at": "2026-10-28T17:09:16.65500355Z",
  "refresh_token": "UdMwpFqKM-h0jdP_NBWk73Uv__7u0AL_HU9ucDkc-Vc",
  "refresh_expires_at": "2026-10-29T04:54:16.654156534Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/87992c64-e485-4d45-80ab-f79851bfb09a/attachments/69bf6596-3c27-4a83-8464-4b2028476fcb` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "94d00e01-3127-4c8c-a0e6-652dd409f504",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "3ae0644d-bad0-4007-adcc-59916b002b4f",
  "upload_path": "/api/operator/v1/uploads/3ae0644d-bad0-4007-adcc-59916b002b4f",
  "expires_at": "2026-10-28T17:09:16.928442789Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/3ae0644d-bad0-4007-adcc-59916b002b4f` → **200**

```json
{
  "file_id": "3ae0644d-bad0-4007-adcc-59916b002b4f",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/87992c64-e485-4d45-80ab-f79851bfb09a` → **200**

```json
{
  "id": "87992c64-e485-4d45-80ab-f79851bfb09a",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d2b078dc-1513-48e5-bc31-879376240691",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T16:54:15.456826Z",
  "updated_at": "2026-10-28T16:54:15.456826Z",
  "messages": [
    {
      "id": "d39cb172-f4eb-4af9-86fb-02e5f304f2c5",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d2b078dc-1513-48e5-bc31-879376240691",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:54:15.458493Z",
      "attachments": [
        {
          "file_id": "69bf6596-3c27-4a83-8464-4b2028476fcb",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/87992c64-e485-4d45-80ab-f79851bfb09a/comments` → **200**

```json
{
  "command_id": "bdc69a44-990c-4540-83e0-22a63b4fe5fc",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "3ae0644d-bad0-4007-adcc-59916b002b4f"
  ]
}
```

```json
{
  "id": "87992c64-e485-4d45-80ab-f79851bfb09a",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d2b078dc-1513-48e5-bc31-879376240691",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T16:54:15.456826Z",
  "updated_at": "2026-10-28T16:54:17.504569Z",
  "messages": [
    {
      "id": "d39cb172-f4eb-4af9-86fb-02e5f304f2c5",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d2b078dc-1513-48e5-bc31-879376240691",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:54:15.458493Z",
      "attachments": [
        {
          "file_id": "69bf6596-3c27-4a83-8464-4b2028476fcb",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "bb3922c7-6a69-4ed3-bf42-ba9bb9c83b40",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T16:54:17.504174Z",
      "attachments": [
        {
          "file_id": "3ae0644d-bad0-4007-adcc-59916b002b4f",
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

`GET /api/rider/v1/support/cases/87992c64-e485-4d45-80ab-f79851bfb09a` → **200**

```json
{
  "id": "87992c64-e485-4d45-80ab-f79851bfb09a",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d2b078dc-1513-48e5-bc31-879376240691",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T16:54:15.456826Z",
  "updated_at": "2026-10-28T16:54:17.504569Z",
  "messages": [
    {
      "id": "d39cb172-f4eb-4af9-86fb-02e5f304f2c5",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d2b078dc-1513-48e5-bc31-879376240691",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:54:15.458493Z",
      "attachments": [
        {
          "file_id": "69bf6596-3c27-4a83-8464-4b2028476fcb",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "bb3922c7-6a69-4ed3-bf42-ba9bb9c83b40",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T16:54:17.504174Z",
      "attachments": [
        {
          "file_id": "3ae0644d-bad0-4007-adcc-59916b002b4f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/87992c64-e485-4d45-80ab-f79851bfb09a/attachments/3ae0644d-bad0-4007-adcc-59916b002b4f` → **200**

Done: support case 87992c64-e485-4d45-80ab-f79851bfb09a, rider attachment 69bf6596-3c27-4a83-8464-4b2028476fcb, operator attachment 3ae0644d-bad0-4007-adcc-59916b002b4f.

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
  "session_id": "6469e436-b3a6-4fb1-a045-5842959fb7d8",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDczNTgsImlhdCI6MTc5MzIwNjQ1OCwianRpIjoiNmY4OWQzZmYtOTg0YS00NTQyLWEzODAtYzBmOGQ1Mjk2Y2FkIiwic2lkIjoiNjQ2OWU0MzYtYjNhNi00ZmIxLWEwNDUtNTg0Mjk1OWZiN2Q4In0.WX0gngPHijq3kNR7w_2hsTySKaNAJJ7lR0ykeo3n8_Y",
  "access_expires_at": "2026-10-28T17:09:18.386490632Z",
  "refresh_token": "P48epKMa-bXnAYRN-e6YkkE_JxMZ2oVJjVn-qoJTxMA",
  "refresh_expires_at": "2026-10-29T04:54:18.386034074Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-22"
}
```

```json
{
  "challenge_id": "f98fc5dc-c939-409d-a713-75521ef19d51",
  "expires_at": "2026-10-28T16:59:18.645995498Z",
  "resend_available_at": "2026-10-28T16:54:19.645995498Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "065450",
  "sent_at": "2026-10-28T16:54:18.64835739Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f98fc5dc-c939-409d-a713-75521ef19d51",
  "code": "065450",
  "device_ref": "sandbox-22"
}
```

```json
{
  "session_id": "d2aa9801-e162-4255-9a5c-9844d69e22b2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNzM1OCwiaWF0IjoxNzkzMjA2NDU4LCJqdGkiOiI4NzRhNzVhMi03NDRhLTRmMWMtYjI4Zi04YjY0MDI0ZmExOWIiLCJzaWQiOiJkMmFhOTgwMS1lMTYyLTQyNTUtOWE1Yy05ODQ0ZDY5ZTIyYjIifQ.vlVYALRv4j3GIFzd2L51NNj_1OUNjKQZZ8xtqKFtcVQ",
  "access_expires_at": "2026-10-28T17:09:18.930626572Z",
  "refresh_token": "IecbBy8b-FMSVYpWkTVEcKU3P74XIrYWuNEN9T6zjsg",
  "refresh_expires_at": "2026-11-27T16:54:18.930100651Z",
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
      "actor_id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T16:54:07.583224Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T16:54:08.955471Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "b83cc31f-7603-411d-82bc-6b135d4b971b",
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
  "device_ref": "sandbox-28003"
}
```

```json
{
  "challenge_id": "b6e9aac3-b436-4c4b-b9c9-ef58e16ff96c",
  "expires_at": "2026-10-28T16:59:19.982093201Z",
  "resend_available_at": "2026-10-28T16:54:20.982093201Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "145341",
  "sent_at": "2026-10-28T16:54:19.984135273Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b6e9aac3-b436-4c4b-b9c9-ef58e16ff96c",
  "code": "145341",
  "device_ref": "sandbox-28003"
}
```

```json
{
  "session_id": "f3df1a88-804a-4425-ae70-324a3375cafa",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNzM2MCwiaWF0IjoxNzkzMjA2NDYwLCJqdGkiOiJlMjQ5ZjM4OS1iNzhiLTQzZDUtYTk2Zi1kYzQ0MTMxZDZkNDMiLCJzaWQiOiJmM2RmMWE4OC04MDRhLTQ0MjUtYWU3MC0zMjRhMzM3NWNhZmEifQ.vymsd85HRpcb4setmapPwoyKGBDZ_trf6mPWdg2bHMk",
  "access_expires_at": "2026-10-28T17:09:20.267298942Z",
  "refresh_token": "vZIeuAmPxAVgkf9J0YOi3Fsu8_uGIkMbnE-IKBL3wGM",
  "refresh_expires_at": "2026-11-27T16:54:20.266749293Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ce66f2b1-71ee-4db2-b057-08709f8c15a4",
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
  "last_heartbeat_at": "2026-10-28T16:53:50.62573Z",
  "last_location_at": "2026-10-28T16:53:50.62573Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/ce66f2b1-71ee-4db2-b057-08709f8c15a4/handover` → **200**

```json
{
  "command_id": "7a47bc13-f3f1-4c8f-80d8-07aa53444a8f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ce66f2b1-71ee-4db2-b057-08709f8c15a4",
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
  "last_heartbeat_at": "2026-10-28T16:53:50.62573Z",
  "last_location_at": "2026-10-28T16:53:50.62573Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/ce66f2b1-71ee-4db2-b057-08709f8c15a4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:54:21Z",
    "sequence": 1793206461392
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ce66f2b1-71ee-4db2-b057-08709f8c15a4",
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
  "last_heartbeat_at": "2026-10-28T16:54:21.057806Z",
  "last_location_at": "2026-10-28T16:54:21.057806Z",
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
  "command_id": "4b427254-2866-47dd-99ae-8dee55bfd7ec",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:54:21Z",
    "sequence": 1793206461574
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "53a230c9-41ef-44e4-bdaa-4fe39269dbf3",
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
  "last_heartbeat_at": "2026-10-28T16:54:21.592427Z",
  "last_location_at": "2026-10-28T16:54:21.592427Z",
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
  "session_id": "c3b8d8e1-212a-425d-a6e4-5717537623e7",
  "subject": {
    "type": "STAFF",
    "id": "fb08c1e5-5485-4389-8e4a-0d97c49680c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjA4YzFlNS01NDg1LTQzODktOGU0YS0wZDk3YzQ5NjgwYzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDczNjIsImlhdCI6MTc5MzIwNjQ2MiwianRpIjoiOGQxMTI4NTUtZjE3NS00OTA4LTlhN2MtZTczYzEyODlmOTZjIiwic2lkIjoiYzNiOGQ4ZTEtMjEyYS00MjVkLWE2ZTQtNTcxNzUzNzYyM2U3In0.oCQNkhAoa8QQ8rPnrUSM6LM9qX7p2fm0ktyBJNxShJk",
  "access_expires_at": "2026-10-28T17:09:22.170330531Z",
  "refresh_token": "aWkoV8N_-nuyf4UexACWJR5hV1OSqaZkFeHfzpnCuJo",
  "refresh_expires_at": "2026-10-29T04:54:22.169606659Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c62e1c3a-8a94-43d0-9017-69a350101eb6",
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
  "id": "45261465-4569-4b4c-ac78-04be62f69699",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:59:22.436688Z",
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
  "command_id": "efcc519b-9309-4907-975a-8f7d192d00ee",
  "quote_id": "45261465-4569-4b4c-ac78-04be62f69699",
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
  "id": "3fd841a0-6d07-4d11-8d67-69c5198e7ba2",
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
  "created_at": "2026-10-28T16:54:22.7058Z",
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
    "id": "1835db1d-7331-42eb-949c-62f521f4dd41",
    "order_id": "3fd841a0-6d07-4d11-8d67-69c5198e7ba2",
    "expires_at": "2026-10-28T16:54:37.708484Z",
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

`POST /api/driver/v1/offers/1835db1d-7331-42eb-949c-62f521f4dd41/accept` → **200**

```json
{
  "command_id": "0f201252-c347-4b7f-825d-6953577e5cc3"
}
```

```json
{
  "id": "bd736252-c3b1-4908-a5a9-f61822bf9731",
  "order_id": "3fd841a0-6d07-4d11-8d67-69c5198e7ba2",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c38d7f7b-aa39-4145-b3b0-18d58abb73db",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c38d7f7b-aa39-4145-b3b0-18d58abb73db",
  "order_id": "3fd841a0-6d07-4d11-8d67-69c5198e7ba2",
  "assignment_id": "bd736252-c3b1-4908-a5a9-f61822bf9731",
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

`POST /api/driver/v1/work-sessions/53a230c9-41ef-44e4-bdaa-4fe39269dbf3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:54:23Z",
    "sequence": 1793206464138
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "53a230c9-41ef-44e4-bdaa-4fe39269dbf3",
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
  "last_heartbeat_at": "2026-10-28T16:54:24.019486Z",
  "last_location_at": "2026-10-28T16:54:24.019486Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c38d7f7b-aa39-4145-b3b0-18d58abb73db/arrive` → **200**

```json
{
  "command_id": "7bf4d6d3-ce83-49df-b4d7-88b292e7c559",
  "expected_version": 0
}
```

```json
{
  "id": "c38d7f7b-aa39-4145-b3b0-18d58abb73db",
  "order_id": "3fd841a0-6d07-4d11-8d67-69c5198e7ba2",
  "assignment_id": "bd736252-c3b1-4908-a5a9-f61822bf9731",
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
  "arrived_at": "2026-10-28T16:54:24.287379Z",
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

`POST /api/driver/v1/trips/c38d7f7b-aa39-4145-b3b0-18d58abb73db/start` → **200**

```json
{
  "command_id": "2bf00993-c721-4c42-8fef-c1af87a9304a",
  "expected_version": 1
}
```

```json
{
  "id": "c38d7f7b-aa39-4145-b3b0-18d58abb73db",
  "order_id": "3fd841a0-6d07-4d11-8d67-69c5198e7ba2",
  "assignment_id": "bd736252-c3b1-4908-a5a9-f61822bf9731",
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
  "arrived_at": "2026-10-28T16:54:24.287379Z",
  "started_at": "2026-10-28T16:54:24.561869Z",
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

`POST /api/driver/v1/trips/c38d7f7b-aa39-4145-b3b0-18d58abb73db/complete` → **200**

```json
{
  "command_id": "96f0bc36-0398-43c5-9346-b6e5cbaaff07",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:54:24Z",
  "cash_received": true
}
```

```json
{
  "id": "c38d7f7b-aa39-4145-b3b0-18d58abb73db",
  "order_id": "3fd841a0-6d07-4d11-8d67-69c5198e7ba2",
  "assignment_id": "bd736252-c3b1-4908-a5a9-f61822bf9731",
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
  "arrived_at": "2026-10-28T16:54:24.287379Z",
  "started_at": "2026-10-28T16:54:24.561869Z",
  "completed_at": "2026-10-28T16:54:24.836111Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/3fd841a0-6d07-4d11-8d67-69c5198e7ba2` → **200**

```json
{
  "id": "3fd841a0-6d07-4d11-8d67-69c5198e7ba2",
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
    "id": "bd736252-c3b1-4908-a5a9-f61822bf9731",
    "order_id": "3fd841a0-6d07-4d11-8d67-69c5198e7ba2",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c38d7f7b-aa39-4145-b3b0-18d58abb73db",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:54:22.7058Z",
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
  "session_id": "ce66f2b1-71ee-4db2-b057-08709f8c15a4",
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
  "last_heartbeat_at": "2026-10-28T16:54:21.057806Z",
  "last_location_at": "2026-10-28T16:54:21.057806Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ce66f2b1-71ee-4db2-b057-08709f8c15a4/close` → **200**

```json
{
  "command_id": "7434e33c-074d-48c0-b4a9-0b32056f0bb5",
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
  "session_id": "53a230c9-41ef-44e4-bdaa-4fe39269dbf3",
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
  "last_heartbeat_at": "2026-10-28T16:54:24.019486Z",
  "last_location_at": "2026-10-28T16:54:24.019486Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/53a230c9-41ef-44e4-bdaa-4fe39269dbf3/close` → **200**

```json
{
  "command_id": "ce07eadd-9bbb-4b70-a910-361a40b88d16",
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

Done: terminal order 3fd841a0-6d07-4d11-8d67-69c5198e7ba2 by Andrii (5a000000-0000-4000-8000-000000000403).
