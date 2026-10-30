# Sandbox transcript (2026-10-30T12:35:55Z, 50571ed)

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
  "correlation_id": "416d5314-4eb0-47f2-9ee3-d4fa6c83f8c4"
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
  "session_id": "9f83d308-2242-4d80-be16-f230674a3780",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ2NjMsImlhdCI6MTc5MzM2Mzc2MywianRpIjoiYjFhYTViYTktOGZjNC00M2U3LTliMTEtZjNkMmI0ZTA5MDM3Iiwic2lkIjoiOWY4M2QzMDgtMjI0Mi00ZDgwLWJlMTYtZjIzMDY3NGEzNzgwIn0.WkIo6Pq_VprwzdUZVN9TsxU70QTn1V8wkCnHBa3YU1A",
  "access_expires_at": "2026-10-30T12:51:03.679248663Z",
  "refresh_token": "MdE3tbkTN1tBMOytHub5yK8E6nJMTWLbcTOvw7cZv4c",
  "refresh_expires_at": "2026-10-31T00:36:03.67703233Z",
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
  "session_id": "86e2d0da-ceb8-4dcf-9db2-d92e7bb5bd3b",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ2NjUsImlhdCI6MTc5MzM2Mzc2NSwianRpIjoiMzU3Njg1MzQtOWRmZi00ODQ4LTg0NjItYmI4NGUxZGE2NDNhIiwic2lkIjoiODZlMmQwZGEtY2ViOC00ZGNmLTlkYjItZDkyZTdiYjViZDNiIn0.3zRxehfbKYR3siDvvIu2VaNzA7X8E2gQTb8jxZbPhic",
  "access_expires_at": "2026-10-30T12:51:05.523753715Z",
  "refresh_token": "8BULGz67vElk-JE66jxOUfp2u8bv6GD3gyemF1AIxek",
  "refresh_expires_at": "2026-10-31T00:36:05.52283863Z",
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
  "device_ref": "sandbox-21159"
}
```

```json
{
  "challenge_id": "9e1ab54b-e2d7-4d98-918d-6a563618c5c6",
  "expires_at": "2026-10-30T12:41:06.127794351Z",
  "resend_available_at": "2026-10-30T12:36:07.127794351Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "629592",
  "sent_at": "2026-10-30T12:36:06.140430342Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9e1ab54b-e2d7-4d98-918d-6a563618c5c6",
  "code": "629592",
  "device_ref": "sandbox-21159"
}
```

```json
{
  "session_id": "f9968b98-ce67-44d1-a385-dd4025f2c9e4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDY2NiwiaWF0IjoxNzkzMzYzNzY2LCJqdGkiOiI3NDAwNzViMy02ZjQyLTQ0ODMtOWFkMC05NzgzYTExMmVkOWMiLCJzaWQiOiJmOTk2OGI5OC1jZTY3LTQ0ZDEtYTM4NS1kZDQwMjVmMmM5ZTQifQ.hw1IzkHJzrSN_G9i61KmvOMs0JhbuTkC5pgWALueIMs",
  "access_expires_at": "2026-10-30T12:51:06.485585992Z",
  "refresh_token": "D5Tnm0C4_iKj-dGLyHt0Jy-cDi6szMGiQm4vsYTGUhM",
  "refresh_expires_at": "2026-11-29T12:36:06.484575801Z",
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
  "command_id": "46eb15c9-5d12-4d9e-a3bb-478902a256a3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:36:07Z",
    "sequence": 1793363767504
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cb9e3ce1-5694-46e7-9e7b-0c4aa5be9300",
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
  "last_heartbeat_at": "2026-10-30T12:36:07.371616Z",
  "last_location_at": "2026-10-30T12:36:07.371616Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639865724",
  "device_ref": "sandbox-29566"
}
```

```json
{
  "challenge_id": "39abd3bc-73e5-4410-9749-0c3f32f71393",
  "expires_at": "2026-10-30T12:41:07.669647092Z",
  "resend_available_at": "2026-10-30T12:36:08.669647092Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639865724` → **200**

```json
{
  "phone": "+380639865724",
  "audience": "CLIENT",
  "code": "379351",
  "sent_at": "2026-10-30T12:36:07.674390895Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "39abd3bc-73e5-4410-9749-0c3f32f71393",
  "code": "379351",
  "device_ref": "sandbox-29566"
}
```

```json
{
  "session_id": "81faffcb-55f0-4dc7-941f-e521b672aeeb",
  "subject": {
    "type": "CLIENT",
    "id": "1e515d9a-f452-4dc9-9111-cb5121dd1585"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZTUxNWQ5YS1mNDUyLTRkYzktOTExMS1jYjUxMjFkZDE1ODUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0NjY3LCJpYXQiOjE3OTMzNjM3NjcsImp0aSI6ImZlNDBlNTM1LTJiMDAtNGVkMy04ODcyLTQ3MDY1ZDE2MjdkZSIsInNpZCI6IjgxZmFmZmNiLTU1ZjAtNGRjNy05NDFmLWU1MjFiNjcyYWVlYiJ9.iXZ8qR21iAFhraaOMn5vWxTnLEFg8S8ARccgMsp_x2Q",
  "access_expires_at": "2026-10-30T12:51:07.983239172Z",
  "refresh_token": "0gkOXWCs93rf4waY5nq3fPIx781wMF1kxHgOid92t-s",
  "refresh_expires_at": "2026-11-29T12:36:07.982259284Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "12e51ca2-6800-40c6-bfa9-1b0acf945566",
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
  "id": "c62aa4b8-eda6-438a-8e55-d4a4784bdbb4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:41:08.311349Z",
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
  "command_id": "32a576ad-893d-4985-96d7-fd1159841099",
  "quote_id": "c62aa4b8-eda6-438a-8e55-d4a4784bdbb4",
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
  "id": "1c61cb85-1536-481f-94bc-d6bacdc243ab",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e515d9a-f452-4dc9-9111-cb5121dd1585",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:36:08.698003Z",
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
    "id": "6764a483-60fc-45a6-b056-d99e7fe53b10",
    "order_id": "1c61cb85-1536-481f-94bc-d6bacdc243ab",
    "expires_at": "2026-10-30T12:36:23.71054Z",
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

`POST /api/driver/v1/offers/6764a483-60fc-45a6-b056-d99e7fe53b10/accept` → **200**

```json
{
  "command_id": "5d6a18d5-1178-43ab-8910-1143ec19de1a"
}
```

```json
{
  "id": "8434e8f9-6015-4885-8cfd-aca22050af72",
  "order_id": "1c61cb85-1536-481f-94bc-d6bacdc243ab",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0e09a933-ae3a-42ab-8e87-7921584704c7",
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
  "command_id": "b143700d-1221-47a3-b21f-92cf870baf65",
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
    }
  },
  "changed_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T12:36:10.074656406Z"
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
  "id": "0e09a933-ae3a-42ab-8e87-7921584704c7",
  "order_id": "1c61cb85-1536-481f-94bc-d6bacdc243ab",
  "assignment_id": "8434e8f9-6015-4885-8cfd-aca22050af72",
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

`POST /api/driver/v1/work-sessions/cb9e3ce1-5694-46e7-9e7b-0c4aa5be9300/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:36:11Z",
    "sequence": 1793363771152
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cb9e3ce1-5694-46e7-9e7b-0c4aa5be9300",
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
  "last_heartbeat_at": "2026-10-30T12:36:11.041345Z",
  "last_location_at": "2026-10-30T12:36:11.041345Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0e09a933-ae3a-42ab-8e87-7921584704c7/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "cd17edcf-395f-4e04-af77-75a3b180fc95",
  "expected_version": 0
}
```

```json
{
  "id": "0e09a933-ae3a-42ab-8e87-7921584704c7",
  "order_id": "1c61cb85-1536-481f-94bc-d6bacdc243ab",
  "assignment_id": "8434e8f9-6015-4885-8cfd-aca22050af72",
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
  "arrived_at": "2026-10-30T12:36:11.359644Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0e09a933-ae3a-42ab-8e87-7921584704c7/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "4872103f-f779-4208-aada-76d2c9beb755",
  "expected_version": 1
}
```

```json
{
  "id": "0e09a933-ae3a-42ab-8e87-7921584704c7",
  "order_id": "1c61cb85-1536-481f-94bc-d6bacdc243ab",
  "assignment_id": "8434e8f9-6015-4885-8cfd-aca22050af72",
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
  "arrived_at": "2026-10-30T12:36:11.359644Z",
  "started_at": "2026-10-30T12:36:11.661102Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0e09a933-ae3a-42ab-8e87-7921584704c7/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "d188cd27-fef3-459f-a245-abd5ebdcf87b",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:36:11Z",
  "cash_received": true
}
```

```json
{
  "id": "0e09a933-ae3a-42ab-8e87-7921584704c7",
  "order_id": "1c61cb85-1536-481f-94bc-d6bacdc243ab",
  "assignment_id": "8434e8f9-6015-4885-8cfd-aca22050af72",
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
  "arrived_at": "2026-10-30T12:36:11.359644Z",
  "started_at": "2026-10-30T12:36:11.661102Z",
  "completed_at": "2026-10-30T12:36:11.972767Z",
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
  "session_id": "cb9e3ce1-5694-46e7-9e7b-0c4aa5be9300",
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
  "last_heartbeat_at": "2026-10-30T12:36:11.041345Z",
  "last_location_at": "2026-10-30T12:36:11.041345Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cb9e3ce1-5694-46e7-9e7b-0c4aa5be9300/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "dcabc1a2-1b83-4947-bbf1-ef8875665a15",
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
  "command_id": "11470a2a-b931-4dcd-9fa5-504cafbcc65f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:36:12Z",
    "sequence": 1793363772863
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
  "correlation_id": "eb95fda7-430d-4229-82ee-0f043f82e694",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "77141a6a-2a01-465b-9d8f-a47460cf476b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:36:13Z",
    "sequence": 1793363773160
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "06db27bd-d2a8-4d6c-a42d-6e6b2dff5af8",
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
  "last_heartbeat_at": "2026-10-30T12:36:13.18322Z",
  "last_location_at": "2026-10-30T12:36:13.18322Z",
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
    }
  },
  "changed_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T12:36:10.074656Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "3c8ee5df-59c2-4a9b-be38-2c14a144b1b1",
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
    }
  },
  "changed_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T12:36:13.768667007Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "06db27bd-d2a8-4d6c-a42d-6e6b2dff5af8",
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
  "last_heartbeat_at": "2026-10-30T12:36:13.18322Z",
  "last_location_at": "2026-10-30T12:36:13.18322Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/06db27bd-d2a8-4d6c-a42d-6e6b2dff5af8/close` → **200**

```json
{
  "command_id": "0a58fd6b-1b52-40e8-a54d-73404d96d2e2",
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
  "session_id": "50b689d7-6ad6-4b45-98ea-5d5ff8c55d76",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ2NzQsImlhdCI6MTc5MzM2Mzc3NCwianRpIjoiNDUxZTlkMGItYTFhMy00ZDc0LTk2YWYtYjk4NTRiMTc3NzQ2Iiwic2lkIjoiNTBiNjg5ZDctNmFkNi00YjQ1LTk4ZWEtNWQ1ZmY4YzU1ZDc2In0.o-VBLSBhhCofjPoqlaieEtCJLvVoLxbuwzqv0mg01Tc",
  "access_expires_at": "2026-10-30T12:51:14.948454676Z",
  "refresh_token": "0pLMDOfoclyunR3c08zGAPQkwxMNqb1lVtn4oenkAts",
  "refresh_expires_at": "2026-10-31T00:36:14.947477266Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "344e21db-1a9a-4bb3-8c22-f77729cc488b",
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
  "id": "fee49ae5-c49d-4d2a-8449-08ad1187f2df",
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
  "created_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
  "created_at": "2026-10-30T12:36:15.248231Z",
  "updated_at": "2026-10-30T12:36:15.248231Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636006727",
  "device_ref": "sandbox-6429"
}
```

```json
{
  "challenge_id": "b1e98db7-662c-46b8-9184-4469f28ca05a",
  "expires_at": "2026-10-30T12:41:15.546217015Z",
  "resend_available_at": "2026-10-30T12:36:16.546217015Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636006727` → **200**

```json
{
  "phone": "+380636006727",
  "audience": "CLIENT",
  "code": "843554",
  "sent_at": "2026-10-30T12:36:15.550818785Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b1e98db7-662c-46b8-9184-4469f28ca05a",
  "code": "843554",
  "device_ref": "sandbox-6429"
}
```

```json
{
  "session_id": "adb13092-40b1-4397-a41f-8433eb66f902",
  "subject": {
    "type": "CLIENT",
    "id": "ec72d208-0c13-4e2c-891a-0bd1fdd3a9b2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYzcyZDIwOC0wYzEzLTRlMmMtODkxYS0wYmQxZmRkM2E5YjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0Njc1LCJpYXQiOjE3OTMzNjM3NzUsImp0aSI6ImY4NDc3YmZjLTM1YmItNDNjNS1iOGFmLWM0YzZiOGE1NGZiMSIsInNpZCI6ImFkYjEzMDkyLTQwYjEtNDM5Ny1hNDFmLTg0MzNlYjY2ZjkwMiJ9.xl7xEM4ORNGzHxzHZ7NVSmHjDPRR_ryh_QeL-GXvduI",
  "access_expires_at": "2026-10-30T12:51:15.86433648Z",
  "refresh_token": "MdskCHCx2kE-IbwjkUK6qEcVkf34Y6dRDlsDVYqCKyA",
  "refresh_expires_at": "2026-11-29T12:36:15.863514179Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380636006727` → **200**

```json
{
  "client_id": "ec72d208-0c13-4e2c-891a-0bd1fdd3a9b2"
}
```

`POST /api/admin/v1/rider-wallets/ec72d208-0c13-4e2c-891a-0bd1fdd3a9b2/top-ups` → **201**

```json
{
  "command_id": "8d915303-b6c4-4a1f-83e9-0a099721ccde",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "ec72d208-0c13-4e2c-891a-0bd1fdd3a9b2",
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
      "id": "45f13ba5-df2b-4a10-866d-e631241ac28e",
      "at": "2026-10-30T12:36:16.431917Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ba047c5f-5bf8-4fb8-ad4b-1390d9e928d7",
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
  "id": "694b5713-cfea-41d1-a0ce-f85c71ed647b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:41:16.749888Z",
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
      "id": "fee49ae5-c49d-4d2a-8449-08ad1187f2df",
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
  "device_ref": "sandbox-25995"
}
```

```json
{
  "challenge_id": "fe29ffe7-8423-49c8-96e7-c206af2d47ed",
  "expires_at": "2026-10-30T12:41:17.044383027Z",
  "resend_available_at": "2026-10-30T12:36:18.044383027Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "988116",
  "sent_at": "2026-10-30T12:36:17.048836875Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fe29ffe7-8423-49c8-96e7-c206af2d47ed",
  "code": "988116",
  "device_ref": "sandbox-25995"
}
```

```json
{
  "session_id": "c99ac4dc-8813-4511-af51-a39db8e9c869",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDY3NywiaWF0IjoxNzkzMzYzNzc3LCJqdGkiOiJhNGRjNzNhOC1jZTI1LTQwODAtOGZiZC1lMDVmNzczMDIxODkiLCJzaWQiOiJjOTlhYzRkYy04ODEzLTQ1MTEtYWY1MS1hMzlkYjhlOWM4NjkifQ.7wkEsdRc6d9PDCx0bytzi9PS4YNFiFYGve5h4dcftnA",
  "access_expires_at": "2026-10-30T12:51:17.356936273Z",
  "refresh_token": "ikPkCmlJlSvKMwL21YbaAasYsVDpAB1iQH_NQ9uK2_g",
  "refresh_expires_at": "2026-11-29T12:36:17.356220012Z",
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
  "command_id": "41b68633-87d0-486e-9c6d-ace67780eea7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:36:17Z",
    "sequence": 1793363777933
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "de0bd0fa-3ada-454d-89b9-d6d7a4f37e31",
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
  "last_heartbeat_at": "2026-10-30T12:36:17.954586Z",
  "last_location_at": "2026-10-30T12:36:17.954586Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b330acf4-aabc-4a71-9f8e-93dba327db5b",
  "quote_id": "694b5713-cfea-41d1-a0ce-f85c71ed647b",
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
  "id": "01e6719a-c238-4e48-9d75-9a6c98bcfb6b",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec72d208-0c13-4e2c-891a-0bd1fdd3a9b2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:36:18.266631Z",
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
  "client_id": "ec72d208-0c13-4e2c-891a-0bd1fdd3a9b2",
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
      "id": "45f13ba5-df2b-4a10-866d-e631241ac28e",
      "at": "2026-10-30T12:36:16.431917Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
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
    "id": "5dba8595-5ff3-45c0-8e7b-99d32ca74744",
    "order_id": "01e6719a-c238-4e48-9d75-9a6c98bcfb6b",
    "expires_at": "2026-10-30T12:36:33.27546Z",
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

`POST /api/driver/v1/offers/5dba8595-5ff3-45c0-8e7b-99d32ca74744/accept` → **200**

```json
{
  "command_id": "b7c96f4c-23db-41e2-9b78-4532c0d6af41"
}
```

```json
{
  "id": "7d78fd53-25cb-4f1b-9c88-442af0cec20e",
  "order_id": "01e6719a-c238-4e48-9d75-9a6c98bcfb6b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "53e0e8d3-427d-4035-b905-591b2c2b1ad4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "53e0e8d3-427d-4035-b905-591b2c2b1ad4",
  "order_id": "01e6719a-c238-4e48-9d75-9a6c98bcfb6b",
  "assignment_id": "7d78fd53-25cb-4f1b-9c88-442af0cec20e",
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

`POST /api/driver/v1/work-sessions/de0bd0fa-3ada-454d-89b9-d6d7a4f37e31/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:36:19Z",
    "sequence": 1793363779746
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "de0bd0fa-3ada-454d-89b9-d6d7a4f37e31",
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
  "last_heartbeat_at": "2026-10-30T12:36:19.767821Z",
  "last_location_at": "2026-10-30T12:36:19.767821Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/53e0e8d3-427d-4035-b905-591b2c2b1ad4/arrive` → **200**

```json
{
  "command_id": "260d12ae-78ee-41cb-a26c-5d1c2d736004",
  "expected_version": 0
}
```

```json
{
  "id": "53e0e8d3-427d-4035-b905-591b2c2b1ad4",
  "order_id": "01e6719a-c238-4e48-9d75-9a6c98bcfb6b",
  "assignment_id": "7d78fd53-25cb-4f1b-9c88-442af0cec20e",
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
  "arrived_at": "2026-10-30T12:36:20.061459Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/53e0e8d3-427d-4035-b905-591b2c2b1ad4/start` → **200**

```json
{
  "command_id": "5faf98c6-406f-418e-b317-89d983a1ab46",
  "expected_version": 1
}
```

```json
{
  "id": "53e0e8d3-427d-4035-b905-591b2c2b1ad4",
  "order_id": "01e6719a-c238-4e48-9d75-9a6c98bcfb6b",
  "assignment_id": "7d78fd53-25cb-4f1b-9c88-442af0cec20e",
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
  "arrived_at": "2026-10-30T12:36:20.061459Z",
  "started_at": "2026-10-30T12:36:20.367898Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/53e0e8d3-427d-4035-b905-591b2c2b1ad4/complete` → **200**

```json
{
  "command_id": "46c1e95f-419c-4da8-beab-2423ea060915",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:36:20Z",
  "cash_received": true
}
```

```json
{
  "id": "53e0e8d3-427d-4035-b905-591b2c2b1ad4",
  "order_id": "01e6719a-c238-4e48-9d75-9a6c98bcfb6b",
  "assignment_id": "7d78fd53-25cb-4f1b-9c88-442af0cec20e",
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
  "arrived_at": "2026-10-30T12:36:20.061459Z",
  "started_at": "2026-10-30T12:36:20.367898Z",
  "completed_at": "2026-10-30T12:36:20.688111Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "ec72d208-0c13-4e2c-891a-0bd1fdd3a9b2",
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
      "id": "67e0407a-87b0-408e-a7d9-53330a4b40e5",
      "at": "2026-10-30T12:36:21.4616Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "01e6719a-c238-4e48-9d75-9a6c98bcfb6b"
    },
    {
      "id": "45f13ba5-df2b-4a10-866d-e631241ac28e",
      "at": "2026-10-30T12:36:16.431917Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/fee49ae5-c49d-4d2a-8449-08ad1187f2df/archive` → **200**

```json
{
  "command_id": "ab0b351d-761e-433a-a21e-e2c3542a3dcc",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "fee49ae5-c49d-4d2a-8449-08ad1187f2df",
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
  "created_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
  "created_at": "2026-10-30T12:36:15.248231Z",
  "updated_at": "2026-10-30T12:36:24.302313Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "de0bd0fa-3ada-454d-89b9-d6d7a4f37e31",
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
  "last_heartbeat_at": "2026-10-30T12:36:19.767821Z",
  "last_location_at": "2026-10-30T12:36:19.767821Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/de0bd0fa-3ada-454d-89b9-d6d7a4f37e31/close` → **200**

```json
{
  "command_id": "bbdac386-fa20-44fe-bba5-9599f4f82c99",
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

Done: order 01e6719a-c238-4e48-9d75-9a6c98bcfb6b.

# Scenario: broadcast-claims

## Nobody is online in Warsaw; Piotr signs in on two phones, Anna goes online 10 km from the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-7820"
}
```

```json
{
  "challenge_id": "8c35bf7d-b99f-46e2-8872-0e15dc1f82f0",
  "expires_at": "2026-10-30T12:41:25.18150184Z",
  "resend_available_at": "2026-10-30T12:36:26.18150184Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "289011",
  "sent_at": "2026-10-30T12:36:25.185891687Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8c35bf7d-b99f-46e2-8872-0e15dc1f82f0",
  "code": "289011",
  "device_ref": "sandbox-7820"
}
```

```json
{
  "session_id": "3ce82f2c-e64a-4f96-92e3-fbc874b7f530",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDY4NSwiaWF0IjoxNzkzMzYzNzg1LCJqdGkiOiJmNTA4YmVlNS1iNzBlLTQ0ZTEtODViNS1mZjA0ODBhMmQxZTciLCJzaWQiOiIzY2U4MmYyYy1lNjRhLTRmOTYtOTJlMy1mYmM4NzRiN2Y1MzAifQ.R6vyTVsoHx3AZDTw7M1RXEQrIhRJjeRfzNn0w8zMYIo",
  "access_expires_at": "2026-10-30T12:51:25.498918189Z",
  "refresh_token": "JSU48d8QCh-_w7jTf7Cgz2ocfiOhy9r7XJMM6Fo22KA",
  "refresh_expires_at": "2026-11-29T12:36:25.498264712Z",
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
  "device_ref": "sandbox-23995"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "721a8e60-4741-4826-92b5-72c98c24a0c2",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-23995"
}
```

```json
{
  "challenge_id": "1e6d78b3-e576-4eac-8699-e3fe1c40a3a5",
  "expires_at": "2026-10-30T12:41:27.365793396Z",
  "resend_available_at": "2026-10-30T12:36:28.365793396Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "805843",
  "sent_at": "2026-10-30T12:36:27.369458185Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1e6d78b3-e576-4eac-8699-e3fe1c40a3a5",
  "code": "805843",
  "device_ref": "sandbox-23995"
}
```

```json
{
  "session_id": "f6855a8f-e197-4df7-9853-1eda80ec8273",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDY4NywiaWF0IjoxNzkzMzYzNzg3LCJqdGkiOiI1YzNkNGJmZC0xMzVjLTRiMmEtOGM0NS1lYTM3NzI4NzdhMGYiLCJzaWQiOiJmNjg1NWE4Zi1lMTk3LTRkZjctOTg1My0xZWRhODBlYzgyNzMifQ.AK3Qv6IEt1ELR3KotxE9nHh42bSDxc1cMHIThGY2dNE",
  "access_expires_at": "2026-10-30T12:51:27.698552325Z",
  "refresh_token": "Ei7q-jfdm2MIKuEzS_YhNMQEWmuLoJ61bougMBVDIeU",
  "refresh_expires_at": "2026-11-29T12:36:27.697784215Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-8803"
}
```

```json
{
  "challenge_id": "11460cdf-76bc-4c73-9501-55566173a61e",
  "expires_at": "2026-10-30T12:41:27.980668133Z",
  "resend_available_at": "2026-10-30T12:36:28.980668133Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "442346",
  "sent_at": "2026-10-30T12:36:27.984596968Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "11460cdf-76bc-4c73-9501-55566173a61e",
  "code": "442346",
  "device_ref": "sandbox-8803"
}
```

```json
{
  "session_id": "19add9de-0a00-4156-a658-a3f4a2865d04",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDY4OCwiaWF0IjoxNzkzMzYzNzg4LCJqdGkiOiJkZTQ1NzhkMS1kMTMxLTQ1NjQtYTc5YS05NWI3ZDFkZTljZGIiLCJzaWQiOiIxOWFkZDlkZS0wYTAwLTQxNTYtYTY1OC1hM2Y0YTI4NjVkMDQifQ.ZgA8qYGAfs0f3rdDFMUG4ZJP5YSsNhr6NZErMMqggqs",
  "access_expires_at": "2026-10-30T12:51:28.288262621Z",
  "refresh_token": "7f1114ejYMiJ6aYg3lgIIZImx9AdFhLJDqbK2HG7sBI",
  "refresh_expires_at": "2026-11-29T12:36:28.287579529Z",
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
  "command_id": "3aa27f5c-777d-43f8-ad41-47e160462a93",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:36:29Z",
    "sequence": 1793363789127
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "ace1d7b1-06ba-4dee-af41-c2596dee37e1",
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
  "last_heartbeat_at": "2026-10-30T12:36:29.148486Z",
  "last_location_at": "2026-10-30T12:36:29.148486Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600561807",
  "device_ref": "sandbox-27330"
}
```

```json
{
  "challenge_id": "9cbd7126-b4df-4696-bd31-fe00a411fb10",
  "expires_at": "2026-10-30T12:41:29.431758227Z",
  "resend_available_at": "2026-10-30T12:36:30.431758227Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600561807` → **200**

```json
{
  "phone": "+48600561807",
  "audience": "CLIENT",
  "code": "348613",
  "sent_at": "2026-10-30T12:36:29.435928443Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9cbd7126-b4df-4696-bd31-fe00a411fb10",
  "code": "348613",
  "device_ref": "sandbox-27330"
}
```

```json
{
  "session_id": "a42e06d2-47d8-4855-adb5-b8624abfe881",
  "subject": {
    "type": "CLIENT",
    "id": "611b8f88-8993-45c6-b533-aaf566494c57"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTFiOGY4OC04OTkzLTQ1YzYtYjUzMy1hYWY1NjY0OTRjNTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0Njg5LCJpYXQiOjE3OTMzNjM3ODksImp0aSI6IjZjZGNjOTZiLWM0ZmItNDJhZS1hYzI3LWVjYmFmN2RiZmM0OCIsInNpZCI6ImE0MmUwNmQyLTQ3ZDgtNDg1NS1hZGI1LWI4NjI0YWJmZTg4MSJ9.vuEFVh30MFUGpB-k-YfBVXiEzvw35lrSMjOo0F7oVtk",
  "access_expires_at": "2026-10-30T12:51:29.734157265Z",
  "refresh_token": "uh4Pvgc0pckmkmyAz9gZVJnDbfpXwxsAARV8guusUFg",
  "refresh_expires_at": "2026-11-29T12:36:29.733513067Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b50a2bf0-311c-4f33-a5de-82ba430506b6",
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
  "id": "bdf56a63-f331-44cb-899e-7bf5eaad1030",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:41:30.021882Z",
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
  "command_id": "61d799d7-9a2f-466a-8a05-4c96228fbb30",
  "quote_id": "bdf56a63-f331-44cb-899e-7bf5eaad1030",
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
  "id": "b5649f29-a41d-48a4-922c-f98d4008a8df",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "611b8f88-8993-45c6-b533-aaf566494c57",
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
  "created_at": "2026-10-30T12:36:30.327595Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b5649f29-a41d-48a4-922c-f98d4008a8df` → **200**

```json
{
  "id": "b5649f29-a41d-48a4-922c-f98d4008a8df",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "611b8f88-8993-45c6-b533-aaf566494c57",
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
  "created_at": "2026-10-30T12:36:30.327595Z",
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

`POST /api/driver/v1/orders/b5649f29-a41d-48a4-922c-f98d4008a8df/claim` → **422**

```json
{
  "command_id": "e2534a96-edce-4644-93ec-b7ef6c2258a4"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b5649f29-a41d-48a4-922c-f98d4008a8df/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "89ee7b28-a053-46c0-899e-47eab802fe9a"
}
```

`GET /api/rider/v1/orders/b5649f29-a41d-48a4-922c-f98d4008a8df` → **200**

```json
{
  "id": "b5649f29-a41d-48a4-922c-f98d4008a8df",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "611b8f88-8993-45c6-b533-aaf566494c57",
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
  "created_at": "2026-10-30T12:36:30.327595Z",
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

`POST /api/driver/v1/orders/2a1ac846-7083-4ca0-b43f-68ced960fc95/claim` → **404**

```json
{
  "command_id": "3116cf97-a876-4e90-a4c0-197fcfad19b1"
}
```

```json
{
  "instance": "/api/driver/v1/orders/2a1ac846-7083-4ca0-b43f-68ced960fc95/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "32ebc47c-3908-4b52-bf53-7ab91bd9684a"
}
```

`POST /api/driver/v1/orders/94079706-35fe-4645-ac7c-49e3be9b9331/claim` → **404**

```json
{
  "command_id": "d2829aa8-07d7-41f9-a4f3-0ebe3b7e4bfc"
}
```

```json
{
  "instance": "/api/driver/v1/orders/94079706-35fe-4645-ac7c-49e3be9b9331/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "37c4c9f9-4ce3-4462-98c5-facac01cf9fc"
}
```

`POST /api/driver/v1/orders/5d7f9bef-9f91-4525-92cd-0f3352e66362/claim` → **404**

```json
{
  "command_id": "3d279f3b-b6a2-4777-94b5-742a167660fb"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5d7f9bef-9f91-4525-92cd-0f3352e66362/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "49cae1c6-564b-4b9d-91ff-2f78fb099b98"
}
```

`POST /api/driver/v1/orders/7877cc55-a019-4a21-8c19-8d952128e80c/claim` → **404**

```json
{
  "command_id": "c4f4d39e-bf32-47ea-bf60-7942e780e2a2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7877cc55-a019-4a21-8c19-8d952128e80c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d181cf99-c59c-452a-8e34-647a961c4688"
}
```

`POST /api/driver/v1/orders/1d5ceb70-380a-4482-81c9-10519a5f983e/claim` → **404**

```json
{
  "command_id": "fd4e842f-6421-4416-a05b-93f504a63557"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1d5ceb70-380a-4482-81c9-10519a5f983e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6191444d-12ea-4f4f-a33a-fc95531f39de"
}
```

`POST /api/driver/v1/orders/37fbb187-e466-4e06-b9be-d9f8e8f84371/claim` → **404**

```json
{
  "command_id": "48145c7f-79e6-4efa-ad5e-7faf0393cbb7"
}
```

```json
{
  "instance": "/api/driver/v1/orders/37fbb187-e466-4e06-b9be-d9f8e8f84371/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e8f94f0b-f18f-424a-9ac5-b764345114e3"
}
```

`POST /api/driver/v1/orders/f5427b74-1cd8-4c89-9e2e-5ecddbb4266b/claim` → **404**

```json
{
  "command_id": "41680eb9-f846-4873-a628-450d060108c1"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f5427b74-1cd8-4c89-9e2e-5ecddbb4266b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a8ff144f-f1df-41bd-b27d-0b258cc3ee78"
}
```

`POST /api/driver/v1/orders/1dbfd4c8-481f-4f40-8897-894f77d4bc28/claim` → **404**

```json
{
  "command_id": "461ebf0f-84be-47a5-81ed-e31169903483"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1dbfd4c8-481f-4f40-8897-894f77d4bc28/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8dd23aa2-6289-404d-98ef-38c3e083ea2e"
}
```

`POST /api/driver/v1/orders/e3163fe2-e9df-4a50-ac5c-946e17d00eec/claim` → **404**

```json
{
  "command_id": "3ce8abf4-acc7-438b-8199-e80082bd8e09"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e3163fe2-e9df-4a50-ac5c-946e17d00eec/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5f89fed9-3cda-4e8c-baba-96e6c62ba967"
}
```

`POST /api/driver/v1/orders/cf590218-523d-4e5d-b59e-95ca6ed1f0c4/claim` → **404**

```json
{
  "command_id": "293adf5b-86bc-4ff0-9c10-23f390039784"
}
```

```json
{
  "instance": "/api/driver/v1/orders/cf590218-523d-4e5d-b59e-95ca6ed1f0c4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4e209e5c-f2f6-414f-be44-2645b98f3cac"
}
```

`POST /api/driver/v1/orders/d820215b-3252-44ce-b2a0-6829ca995395/claim` → **404**

```json
{
  "command_id": "78157636-dee0-4910-9c53-6e3173de6c89"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d820215b-3252-44ce-b2a0-6829ca995395/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5eabf79a-5ba3-40c9-94cb-f9dd2e6c2b1e"
}
```

`POST /api/driver/v1/orders/85f8f7f4-de76-4bf8-9554-c7d1a4ea3892/claim` → **404**

```json
{
  "command_id": "84536bd6-def0-4921-a12c-cdec834d03be"
}
```

```json
{
  "instance": "/api/driver/v1/orders/85f8f7f4-de76-4bf8-9554-c7d1a4ea3892/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c8ebfc99-1a01-4fab-a652-6094301802fa"
}
```

`POST /api/driver/v1/orders/ff4cb125-2843-4e7a-b14c-9de4ec18d46b/claim` → **404**

```json
{
  "command_id": "b8e6d30c-1d56-4398-99cc-db3ce54fbb05"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ff4cb125-2843-4e7a-b14c-9de4ec18d46b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a97b955f-576c-4336-822e-b077f10620eb"
}
```

`POST /api/driver/v1/orders/a6039f58-e956-4063-9b37-151d85dc7922/claim` → **404**

```json
{
  "command_id": "42e4d1c5-4d2e-42b6-8d23-76086d6b1e89"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a6039f58-e956-4063-9b37-151d85dc7922/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9d78a5b7-abca-4971-95e5-d4396e6229fa"
}
```

`POST /api/driver/v1/orders/2daec372-7a23-44db-a38f-272ff630ed90/claim` → **404**

```json
{
  "command_id": "f44be747-cf02-44d9-874f-8c3830e373d8"
}
```

```json
{
  "instance": "/api/driver/v1/orders/2daec372-7a23-44db-a38f-272ff630ed90/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1e8a84bb-08ef-400e-8118-040f98a795e5"
}
```

`POST /api/driver/v1/orders/4891c7c7-a65b-4f9a-85c8-9c7abe55f3a4/claim` → **404**

```json
{
  "command_id": "026c4c98-b49a-4977-94ea-7ebd60c5125e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4891c7c7-a65b-4f9a-85c8-9c7abe55f3a4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8a0a64f1-1769-4145-afb3-2eef943f6019"
}
```

`POST /api/driver/v1/orders/6e9a83ac-fab2-450c-9545-087587a7f092/claim` → **404**

```json
{
  "command_id": "5d970bcb-4a83-43f5-9290-e7efe7c365db"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6e9a83ac-fab2-450c-9545-087587a7f092/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "83e8abe6-32d7-4e31-ab55-342c763148f6"
}
```

`POST /api/driver/v1/orders/0bf8fcd2-0b1c-4252-b86c-4a9f9432f2bb/claim` → **404**

```json
{
  "command_id": "1b8f26ca-840c-45a7-a1ab-2e4da0acb4ea"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0bf8fcd2-0b1c-4252-b86c-4a9f9432f2bb/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3086248c-7f63-4b68-97fc-626a2d87e4b0"
}
```

`POST /api/driver/v1/orders/d1eba43c-3012-477d-904d-edb3096ff927/claim` → **404**

```json
{
  "command_id": "0b8e918e-ceab-448d-8440-1ccb3e1937c5"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d1eba43c-3012-477d-904d-edb3096ff927/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d4b59a2d-688b-4201-a2c0-82a1dfdbb71b"
}
```

`POST /api/driver/v1/orders/d6fdce12-cf77-49d7-bf82-3ae03880dea4/claim` → **404**

```json
{
  "command_id": "0b6dc18b-a8d8-4f1d-87bb-9d92561ab6a8"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d6fdce12-cf77-49d7-bf82-3ae03880dea4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b3034cf6-a9eb-48a1-b956-4ec4a3f3d39d"
}
```

`POST /api/driver/v1/orders/b230d35e-8c30-4fe3-bb35-d9e502498afa/claim` → **404**

```json
{
  "command_id": "219051c8-c37a-49f6-a6ff-9bf1a9783176"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b230d35e-8c30-4fe3-bb35-d9e502498afa/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5a3cf44c-d559-4a81-a546-c3a04ace9cd5"
}
```

`POST /api/driver/v1/orders/5190a7f6-a35d-40ca-aeb1-6c216921c3ee/claim` → **404**

```json
{
  "command_id": "ef095c6e-bcee-43c1-9acd-0ab926a4099c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5190a7f6-a35d-40ca-aeb1-6c216921c3ee/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "38a2d5ba-2bd6-4d06-8b90-8103133c830e"
}
```

`POST /api/driver/v1/orders/37afcb8f-39a0-4b4a-857b-9648fb4f82cf/claim` → **404**

```json
{
  "command_id": "fef16dad-45cf-4812-81e3-e695ba9e2d5c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/37afcb8f-39a0-4b4a-857b-9648fb4f82cf/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "940e1856-5b30-4e43-9940-80aa9ea33767"
}
```

`POST /api/driver/v1/orders/ddeb9eae-c91e-44db-b876-4bd496452064/claim` → **404**

```json
{
  "command_id": "67f97afb-c18f-4981-9e51-056d706669fb"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ddeb9eae-c91e-44db-b876-4bd496452064/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "54f93a0e-395c-42cb-8d42-bd961b6090ce"
}
```

`POST /api/driver/v1/orders/1f0cf3ab-6949-4af3-a0dc-a82ca4d0412d/claim` → **404**

```json
{
  "command_id": "4a1ceb15-12be-4398-a4e8-fa62e2069566"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1f0cf3ab-6949-4af3-a0dc-a82ca4d0412d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "98b19685-4dcc-42d2-ad2e-470925714543"
}
```

`POST /api/driver/v1/orders/699882d9-1b66-440e-b6be-5a8b6a80d870/claim` → **404**

```json
{
  "command_id": "1151dfce-85c2-4c16-be11-dbcdd09718be"
}
```

```json
{
  "instance": "/api/driver/v1/orders/699882d9-1b66-440e-b6be-5a8b6a80d870/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f4440771-6380-4184-b30b-119385ad0fce"
}
```

`POST /api/driver/v1/orders/3a29f051-2910-4d0c-8619-7092e5a26486/claim` → **404**

```json
{
  "command_id": "296bc7dd-29fb-456e-9ec2-e2e125603804"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3a29f051-2910-4d0c-8619-7092e5a26486/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "68ae1fa5-5e64-446b-9004-03bb66566fb3"
}
```

`POST /api/driver/v1/orders/d09c841e-6bc4-419d-b600-d9fc2b755f83/claim` → **404**

```json
{
  "command_id": "bf2b7c4b-dd10-4bdc-b7a8-0b1695be8bd1"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d09c841e-6bc4-419d-b600-d9fc2b755f83/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5f05b196-6a53-426e-a09b-8326b7fae7a7"
}
```

`POST /api/driver/v1/orders/dad4a325-5afe-4382-a8d5-0657b2076fb9/claim` → **404**

```json
{
  "command_id": "ac2e727a-18fa-487c-94ea-c4b68acefded"
}
```

```json
{
  "instance": "/api/driver/v1/orders/dad4a325-5afe-4382-a8d5-0657b2076fb9/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "954e111f-7b82-4b37-bfb9-fd92bbb1ba91"
}
```

`POST /api/driver/v1/orders/682e544d-6a57-4ba5-b7a7-15641928ba2c/claim` → **429**

```json
{
  "command_id": "4ff648ad-e6e1-40d8-ab79-2934f87d34a9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/682e544d-6a57-4ba5-b7a7-15641928ba2c/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "ff3c0f98-34a2-40dd-8173-b4f47b7eaef8",
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
  "command_id": "99b51487-bf69-4b4f-ba5d-9c4a5aa90eba",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:36:41Z",
    "sequence": 1793363801199
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "fd840398-af10-4449-888e-5601afa3e5b7",
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
  "last_heartbeat_at": "2026-10-30T12:36:41.03932Z",
  "last_location_at": "2026-10-30T12:36:41.03932Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "b5649f29-a41d-48a4-922c-f98d4008a8df",
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

`POST /api/driver/v1/orders/b5649f29-a41d-48a4-922c-f98d4008a8df/claim` → **409**

```json
{
  "command_id": "08cf34c3-cc0d-4c80-931d-ad8501a76944"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b5649f29-a41d-48a4-922c-f98d4008a8df/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5ddbc322-abc0-4360-b4dd-499df35940be"
}
```

`POST /api/driver/v1/orders/b5649f29-a41d-48a4-922c-f98d4008a8df/claim` → **200**

```json
{
  "command_id": "947dcef2-ada7-4709-9888-91bf054567c3"
}
```

```json
{
  "id": "b298f1f0-25b4-4525-aa82-5634ba652874",
  "order_id": "b5649f29-a41d-48a4-922c-f98d4008a8df",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "c60a8438-57ad-4df4-a049-454fbb6f819c",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c60a8438-57ad-4df4-a049-454fbb6f819c",
  "order_id": "b5649f29-a41d-48a4-922c-f98d4008a8df",
  "assignment_id": "b298f1f0-25b4-4525-aa82-5634ba652874",
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

`POST /api/driver/v1/trips/c60a8438-57ad-4df4-a049-454fbb6f819c/cancel` → **200**

```json
{
  "command_id": "f16363bd-d557-4ab1-99e6-9375c08601ef",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "c60a8438-57ad-4df4-a049-454fbb6f819c",
  "order_id": "b5649f29-a41d-48a4-922c-f98d4008a8df",
  "assignment_id": "b298f1f0-25b4-4525-aa82-5634ba652874",
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

`GET /api/rider/v1/orders/b5649f29-a41d-48a4-922c-f98d4008a8df` → **200**

```json
{
  "id": "b5649f29-a41d-48a4-922c-f98d4008a8df",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "611b8f88-8993-45c6-b533-aaf566494c57",
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
    "id": "b298f1f0-25b4-4525-aa82-5634ba652874",
    "order_id": "b5649f29-a41d-48a4-922c-f98d4008a8df",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "c60a8438-57ad-4df4-a049-454fbb6f819c",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T12:36:30.327595Z",
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
  "session_id": "ace1d7b1-06ba-4dee-af41-c2596dee37e1",
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
  "last_heartbeat_at": "2026-10-30T12:36:29.148486Z",
  "last_location_at": "2026-10-30T12:36:29.148486Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ace1d7b1-06ba-4dee-af41-c2596dee37e1/close` → **200**

```json
{
  "command_id": "efdb1bdf-d08d-41ed-9bf7-9d7e3ef657d0",
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
  "session_id": "fd840398-af10-4449-888e-5601afa3e5b7",
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
  "last_heartbeat_at": "2026-10-30T12:36:41.03932Z",
  "last_location_at": "2026-10-30T12:36:41.03932Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fd840398-af10-4449-888e-5601afa3e5b7/close` → **200**

```json
{
  "command_id": "87e5e3be-63e7-4a7e-82ec-024cfc55489e",
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
  "session_id": "aed8b9ed-8feb-4614-a4aa-ee59f3dd94b0",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ3MDQsImlhdCI6MTc5MzM2MzgwNCwianRpIjoiYzA0Y2FmYTgtMTQ5Mi00MGI4LWI4ZWEtZjM0OTRmYTJiMDAxIiwic2lkIjoiYWVkOGI5ZWQtOGZlYi00NjE0LWE0YWEtZWU1OWYzZGQ5NGIwIn0.0LRUslDx-6YQ9iU9wNNPd65ZYNulO1fSNLbGQMMGQak",
  "access_expires_at": "2026-10-30T12:51:44.541887655Z",
  "refresh_token": "c8IgPOXe10X4yJixhMYM_4uq70s2OPXr6jR0iCBC8iw",
  "refresh_expires_at": "2026-10-31T00:36:44.541259685Z",
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
  "command_id": "765911a0-48bd-4ea3-ac13-8df6924d2a4c",
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
  "session_id": "4e9716ad-4af6-4d3b-bf46-880716c580e9",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ3MDUsImlhdCI6MTc5MzM2MzgwNSwianRpIjoiOWRmN2Q3ZGUtZWJiMS00NTEyLWIwNjktOWU5ODRmYzcyNDkxIiwic2lkIjoiNGU5NzE2YWQtNGFmNi00ZDNiLWJmNDYtODgwNzE2YzU4MGU5In0.PMZ8kVAFlcesJsNBi8pObeqqZVgon4NmdBUIanMHyxE",
  "access_expires_at": "2026-10-30T12:51:45.690707812Z",
  "refresh_token": "ba5SkK1Y-CtUR2H5fX6KK1pQ-J7C0X14rEsVcbmdHTA",
  "refresh_expires_at": "2026-10-31T00:36:45.690108946Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.589027245",
    "linkedid": "1730052700.589027245",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675390842"
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
    "id": "1730052700.589027245",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "53756de5-3cc4-4021-94c0-0be22e689899",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380675390842",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T12:36:45.972943Z",
      "answered_at": null,
      "ended_at": "2026-10-30T12:36:45.997447Z",
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
    "id": "1730052600.1942730378",
    "linkedid": "1730052600.1942730378",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675390842"
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
      "id": "ff1886e0-0c0f-40d2-8ee1-994bdc57fa81",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675390842",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T12:36:46.327938Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/ff1886e0-0c0f-40d2-8ee1-994bdc57fa81/answer` → **200**

```json
{
  "command_id": "3877ff49-2398-4a7d-b49b-55a8331b808d"
}
```

```json
{
  "id": "ff1886e0-0c0f-40d2-8ee1-994bdc57fa81",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675390842",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
  "order_ids": [],
  "started_at": "2026-10-30T12:36:46.327938Z",
  "answered_at": "2026-10-30T12:36:46.644971Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1942730378",
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
    "id": "1730052600.1942730378",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "ff1886e0-0c0f-40d2-8ee1-994bdc57fa81",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675390842",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
      "order_ids": [],
      "started_at": "2026-10-30T12:36:46.327938Z",
      "answered_at": "2026-10-30T12:36:46.644971Z",
      "ended_at": "2026-10-30T12:36:46.963981Z",
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
      "id": "ff1886e0-0c0f-40d2-8ee1-994bdc57fa81",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675390842",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
      "order_ids": [],
      "started_at": "2026-10-30T12:36:46.327938Z",
      "answered_at": "2026-10-30T12:36:46.644971Z",
      "ended_at": "2026-10-30T12:36:46.963981Z",
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
      "id": "ff1886e0-0c0f-40d2-8ee1-994bdc57fa81",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675390842",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
      "order_ids": [],
      "started_at": "2026-10-30T12:36:46.327938Z",
      "answered_at": "2026-10-30T12:36:46.644971Z",
      "ended_at": "2026-10-30T12:36:46.963981Z",
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
      "id": "ff1886e0-0c0f-40d2-8ee1-994bdc57fa81",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675390842",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
      "order_ids": [],
      "started_at": "2026-10-30T12:36:46.327938Z",
      "answered_at": "2026-10-30T12:36:46.644971Z",
      "ended_at": "2026-10-30T12:36:46.963981Z",
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
      "id": "ff1886e0-0c0f-40d2-8ee1-994bdc57fa81",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675390842",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
      "order_ids": [],
      "started_at": "2026-10-30T12:36:46.327938Z",
      "answered_at": "2026-10-30T12:36:46.644971Z",
      "ended_at": "2026-10-30T12:36:46.963981Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T12:36:54.116038Z"
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
      "id": "ff1886e0-0c0f-40d2-8ee1-994bdc57fa81",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675390842",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
      "order_ids": [],
      "started_at": "2026-10-30T12:36:46.327938Z",
      "answered_at": "2026-10-30T12:36:46.644971Z",
      "ended_at": "2026-10-30T12:36:46.963981Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T12:36:54.116038Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/ff1886e0-0c0f-40d2-8ee1-994bdc57fa81/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/ff1886e0-0c0f-40d2-8ee1-994bdc57fa81/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=ff1886e0-0c0f-40d2-8ee1-994bdc57fa81` → **200**

```json
{
  "changes": [
    {
      "id": "e42bf03d-a03e-4dc3-aaba-1d31bd6e1caf",
      "occurred_at": "2026-10-30T12:36:56.767466Z",
      "actor_type": "STAFF",
      "actor_id": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "ff1886e0-0c0f-40d2-8ee1-994bdc57fa81",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"eeebfa18-4ee9-45d0-bdb1-6998f7c3e893\", \"order_ids\": []}",
      "correlation_id": "55bf49c2-4f93-4500-98c9-c132f0d452bc"
    },
    {
      "id": "2ca5411b-243a-4db0-a3d1-63b7ef8584bc",
      "occurred_at": "2026-10-30T12:36:56.736337Z",
      "actor_type": "STAFF",
      "actor_id": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "ff1886e0-0c0f-40d2-8ee1-994bdc57fa81",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"eeebfa18-4ee9-45d0-bdb1-6998f7c3e893\", \"order_ids\": []}",
      "correlation_id": "b2d3b884-e99c-43e9-8c28-f1e033ad5203"
    }
  ]
}
```

Done: call ff1886e0-0c0f-40d2-8ee1-994bdc57fa81 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-13744"
}
```

```json
{
  "challenge_id": "716447d8-6459-43c5-afea-91fd771fd7b9",
  "expires_at": "2026-10-30T12:41:57.083513415Z",
  "resend_available_at": "2026-10-30T12:36:58.083513415Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "467814",
  "sent_at": "2026-10-30T12:36:57.08743086Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "716447d8-6459-43c5-afea-91fd771fd7b9",
  "code": "467814",
  "device_ref": "sandbox-13744"
}
```

```json
{
  "session_id": "2d1cbf27-585c-426b-93e8-3bab400621c3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDcxNywiaWF0IjoxNzkzMzYzODE3LCJqdGkiOiJjZDYyYThiZS0wOWYxLTQ3ZDEtYTM0Zi0xM2Y2ODEwZTVlMjIiLCJzaWQiOiIyZDFjYmYyNy01ODVjLTQyNmItOTNlOC0zYmFiNDAwNjIxYzMifQ.EKloiNjmobKsowQe8RvToX336sQxJpnUN2pevdl2ySA",
  "access_expires_at": "2026-10-30T12:51:57.392913507Z",
  "refresh_token": "LJPvQs7ShXNB0wEXvwHi3Ii2HZomZECRpQqtERMmu-g",
  "refresh_expires_at": "2026-11-29T12:36:57.392373041Z",
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
  "command_id": "9d8f76f4-bba2-43da-86bc-a758eaae9d31",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:36:57Z",
    "sequence": 1793363817953
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f0bef0d0-5b6c-4bd5-a0aa-e2c4370a8e5f",
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
  "last_heartbeat_at": "2026-10-30T12:36:57.973452Z",
  "last_location_at": "2026-10-30T12:36:57.973452Z",
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
  "session_id": "d8edd951-5721-46cd-a64e-f2d7c7a5ba5c",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ3MTgsImlhdCI6MTc5MzM2MzgxOCwianRpIjoiYmNiZjdhOWEtYmFhZi00NWYzLTgzZWQtN2U3ZTdkOTQxOGY1Iiwic2lkIjoiZDhlZGQ5NTEtNTcyMS00NmNkLWE2NGUtZjJkN2M3YTViYTVjIn0.5BrmIE7k0RX0oYoT16auuRsVOauddpRVBpjFF6d0j8o",
  "access_expires_at": "2026-10-30T12:51:58.567024485Z",
  "refresh_token": "a-ejKgFrR2QL9QwyK6xe29lATdfj6ciOKZ-jg7iNFyg",
  "refresh_expires_at": "2026-10-31T00:36:58.566435829Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "9907b105-f773-48cb-8f29-1eed79e54d3a",
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
  "id": "ae4f8e93-457e-4a03-a49d-316fbbe1db9c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:41:58.849454Z",
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
  "command_id": "6637eae8-6309-4f8b-93f1-06f5239a94c5",
  "quote_id": "ae4f8e93-457e-4a03-a49d-316fbbe1db9c",
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
    "phone": "+380671883855"
  }
}
```

```json
{
  "id": "70dbc9ef-c5ff-4d38-b273-042bab0cef69",
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
  "created_at": "2026-10-30T12:36:59.162878Z",
  "caller": {
    "name": "Олена",
    "phone": "+380671883855"
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
    "id": "8c7944c1-d107-4a1f-ac5b-a54a28a7a5cb",
    "order_id": "70dbc9ef-c5ff-4d38-b273-042bab0cef69",
    "expires_at": "2026-10-30T12:37:14.169786Z",
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

`POST /api/driver/v1/offers/8c7944c1-d107-4a1f-ac5b-a54a28a7a5cb/accept` → **200**

```json
{
  "command_id": "55c5f86e-aebe-4cc7-a9c9-29debf6d7d0e"
}
```

```json
{
  "id": "4932b238-81fa-4b07-bbcd-4de71871d8d2",
  "order_id": "70dbc9ef-c5ff-4d38-b273-042bab0cef69",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1469b9cb-402d-4e62-ac75-0a3f2ed85190",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380671883855` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380671883855` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380671883855` → **200**

```json
[
  {
    "phone": "+380671883855",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:37:01.393037987Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671883855` → **200**

```json
[
  {
    "phone": "+380671883855",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:37:01.393037987Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380671883855` → **200**

```json
[
  {
    "phone": "+380671883855",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:37:01.393037987Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1469b9cb-402d-4e62-ac75-0a3f2ed85190",
  "order_id": "70dbc9ef-c5ff-4d38-b273-042bab0cef69",
  "assignment_id": "4932b238-81fa-4b07-bbcd-4de71871d8d2",
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
    "phone": "+380671883855"
  }
}
```

`POST /api/driver/v1/work-sessions/f0bef0d0-5b6c-4bd5-a0aa-e2c4370a8e5f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:37:02Z",
    "sequence": 1793363822486
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f0bef0d0-5b6c-4bd5-a0aa-e2c4370a8e5f",
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
  "last_heartbeat_at": "2026-10-30T12:37:02.505227Z",
  "last_location_at": "2026-10-30T12:37:02.505227Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1469b9cb-402d-4e62-ac75-0a3f2ed85190/arrive` → **200**

```json
{
  "command_id": "fcdc851e-7faf-4be8-a0dc-2992e13982fd",
  "expected_version": 0
}
```

```json
{
  "id": "1469b9cb-402d-4e62-ac75-0a3f2ed85190",
  "order_id": "70dbc9ef-c5ff-4d38-b273-042bab0cef69",
  "assignment_id": "4932b238-81fa-4b07-bbcd-4de71871d8d2",
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
  "arrived_at": "2026-10-30T12:37:02.79587Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671883855"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380671883855` → **200**

```json
[
  {
    "phone": "+380671883855",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:37:01.393037987Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671883855` → **200**

```json
[
  {
    "phone": "+380671883855",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:37:01.393037987Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671883855` → **200**

```json
[
  {
    "phone": "+380671883855",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:37:01.393037987Z"
  },
  {
    "phone": "+380671883855",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T12:37:04.403755644Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671883855` → **200**

```json
[
  {
    "phone": "+380671883855",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:37:01.393037987Z"
  },
  {
    "phone": "+380671883855",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T12:37:04.403755644Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380671883855` → **200**

```json
[
  {
    "phone": "+380671883855",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:37:01.393037987Z"
  },
  {
    "phone": "+380671883855",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T12:37:04.403755644Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/1469b9cb-402d-4e62-ac75-0a3f2ed85190/start` → **200**

```json
{
  "command_id": "2040de94-27cb-4e41-b1b7-f8e6abd6dd2d",
  "expected_version": 1
}
```

```json
{
  "id": "1469b9cb-402d-4e62-ac75-0a3f2ed85190",
  "order_id": "70dbc9ef-c5ff-4d38-b273-042bab0cef69",
  "assignment_id": "4932b238-81fa-4b07-bbcd-4de71871d8d2",
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
  "arrived_at": "2026-10-30T12:37:02.79587Z",
  "started_at": "2026-10-30T12:37:05.225742Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671883855"
  }
}
```

`POST /api/driver/v1/trips/1469b9cb-402d-4e62-ac75-0a3f2ed85190/complete` → **200**

```json
{
  "command_id": "b4a5c80e-ed79-421a-b888-809569f0de38",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:37:05Z",
  "cash_received": true
}
```

```json
{
  "id": "1469b9cb-402d-4e62-ac75-0a3f2ed85190",
  "order_id": "70dbc9ef-c5ff-4d38-b273-042bab0cef69",
  "assignment_id": "4932b238-81fa-4b07-bbcd-4de71871d8d2",
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
  "arrived_at": "2026-10-30T12:37:02.79587Z",
  "started_at": "2026-10-30T12:37:05.225742Z",
  "completed_at": "2026-10-30T12:37:05.522376Z",
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
  "session_id": "f0bef0d0-5b6c-4bd5-a0aa-e2c4370a8e5f",
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
  "last_heartbeat_at": "2026-10-30T12:37:02.505227Z",
  "last_location_at": "2026-10-30T12:37:02.505227Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f0bef0d0-5b6c-4bd5-a0aa-e2c4370a8e5f/close` → **200**

```json
{
  "command_id": "6b8442bd-56ce-4ec6-bf58-eccac3baa216",
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
  "phone": "+380631436342",
  "device_ref": "sandbox-21597"
}
```

```json
{
  "challenge_id": "4541f4a8-416a-4dae-8aaf-679b0f5adb74",
  "expires_at": "2026-10-30T12:42:06.425784917Z",
  "resend_available_at": "2026-10-30T12:37:07.425784917Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631436342` → **200**

```json
{
  "phone": "+380631436342",
  "audience": "CLIENT",
  "code": "318234",
  "sent_at": "2026-10-30T12:37:06.429184463Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4541f4a8-416a-4dae-8aaf-679b0f5adb74",
  "code": "318234",
  "device_ref": "sandbox-21597"
}
```

```json
{
  "session_id": "faf62c88-7091-4c21-9b77-188b16e80bc6",
  "subject": {
    "type": "CLIENT",
    "id": "194ae0c2-fc2d-42d5-8ecc-4797ba2ac670"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOTRhZTBjMi1mYzJkLTQyZDUtOGVjYy00Nzk3YmEyYWM2NzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0NzI2LCJpYXQiOjE3OTMzNjM4MjYsImp0aSI6Ijg0MmRhMzcxLWNiMWItNDBhZC1hYjRhLTA0ODE4MzgzYTY4MSIsInNpZCI6ImZhZjYyYzg4LTcwOTEtNGMyMS05Yjc3LTE4OGIxNmU4MGJjNiJ9.s3mk4hVkHE1JMEYGSQAzvxmemKC4CipLHuvVERtebFE",
  "access_expires_at": "2026-10-30T12:52:06.737203842Z",
  "refresh_token": "ezHQs_OOKRvLRtvyn9UJqBLJLFtMrd7waVrref_CSsY",
  "refresh_expires_at": "2026-11-29T12:37:06.736646033Z",
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
  "device_ref": "sandbox-2638"
}
```

```json
{
  "challenge_id": "478f9788-6b9d-46a2-a17f-af51adf9bc51",
  "expires_at": "2026-10-30T12:42:07.286082829Z",
  "resend_available_at": "2026-10-30T12:37:08.286082829Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "302291",
  "sent_at": "2026-10-30T12:37:07.289039947Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "478f9788-6b9d-46a2-a17f-af51adf9bc51",
  "code": "302291",
  "device_ref": "sandbox-2638"
}
```

```json
{
  "session_id": "864b8987-8e29-4f89-955e-07f41d06aabb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDcyNywiaWF0IjoxNzkzMzYzODI3LCJqdGkiOiJmODM2NDM0YS1hYWY5LTRhNGMtYjM2Mi00ZjFiNjQ0NjVkMDQiLCJzaWQiOiI4NjRiODk4Ny04ZTI5LTRmODktOTU1ZS0wN2Y0MWQwNmFhYmIifQ.iG3MEEqNrwlqtaiH22vWOY1tgkRnkiFzxw4V2B47YZs",
  "access_expires_at": "2026-10-30T12:52:07.598208986Z",
  "refresh_token": "_GDCnkVEx3LseZwaHeNkX_tmeV2PSZLxwLVFJJKUMnI",
  "refresh_expires_at": "2026-11-29T12:37:07.597646829Z",
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
  "session_id": "15c5886a-a4b0-411a-918c-5cd8aa1db313",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ3MjgsImlhdCI6MTc5MzM2MzgyOCwianRpIjoiYTc3MTAyYTktMGMxNi00MTQ2LWE3ODYtYzVhYzExZjI3YWQwIiwic2lkIjoiMTVjNTg4NmEtYTRiMC00MTFhLTkxOGMtNWNkOGFhMWRiMzEzIn0.JFmfyESOAGSUqsOalwyjIBMyJafXNtgTo2oYUPFrK6Q",
  "access_expires_at": "2026-10-30T12:52:08.437779907Z",
  "refresh_token": "f6nXXBrH_L5VraXA7jvPTm_LNvujM3FHCQ2erzPj6T0",
  "refresh_expires_at": "2026-10-31T00:37:08.436200339Z",
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
  "session_id": "099cf2e5-34d4-48ea-a795-014e92291877",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ3MjksImlhdCI6MTc5MzM2MzgyOSwianRpIjoiYmFhOGZjNWEtZjBjYS00ODBiLTkzMGItNTZiNDE2ZGMwODk1Iiwic2lkIjoiMDk5Y2YyZTUtMzRkNC00OGVhLWE3OTUtMDE0ZTkyMjkxODc3In0.sgSdeDKPTvBeOGuJXKuasUh2AG_imODarrY0zqd97MA",
  "access_expires_at": "2026-10-30T12:52:09.025565824Z",
  "refresh_token": "5t7v9BH94hmvjY1tKo4t1hOkTcnV4LC63HoKSB6Zzb0",
  "refresh_expires_at": "2026-10-31T00:37:09.024950177Z",
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
  "command_id": "8d282f6e-9d03-4e82-871d-1c6fc603321f",
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
  "id": "e04ce1c5-a4fc-4674-8a77-9afca2ea0400",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:42:09.585815Z",
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
  "command_id": "d0cb720b-6f43-49bf-8504-c07623def14b",
  "quote_id": "e04ce1c5-a4fc-4674-8a77-9afca2ea0400",
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
  "id": "dbc593b0-1321-42a3-9529-e174623a2faf",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "194ae0c2-fc2d-42d5-8ecc-4797ba2ac670",
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
  "created_at": "2026-10-30T12:37:09.877475Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dbc593b0-1321-42a3-9529-e174623a2faf` → **200**

```json
{
  "id": "dbc593b0-1321-42a3-9529-e174623a2faf",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "194ae0c2-fc2d-42d5-8ecc-4797ba2ac670",
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
  "created_at": "2026-10-30T12:37:09.877475Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/dbc593b0-1321-42a3-9529-e174623a2faf/cancel` → **200**

```json
{
  "command_id": "2de1c5a4-bf93-4dc2-be3f-95d720f38ddb",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "dbc593b0-1321-42a3-9529-e174623a2faf",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "194ae0c2-fc2d-42d5-8ecc-4797ba2ac670",
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
  "created_at": "2026-10-30T12:37:09.877475Z",
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
  "command_id": "f0a67699-b0a7-4018-8c7a-c6046333730d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:37:11Z",
    "sequence": 1793363831915
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a1c34f21-015a-417d-8e2a-b52bf2a2e104",
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
  "last_heartbeat_at": "2026-10-30T12:37:11.110573Z",
  "last_location_at": "2026-10-30T12:37:11.110573Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-3195"
}
```

```json
{
  "challenge_id": "a52f06a1-c643-4577-83c3-a4108868dc9c",
  "expires_at": "2026-10-30T12:42:11.392387763Z",
  "resend_available_at": "2026-10-30T12:37:12.392387763Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "660962",
  "sent_at": "2026-10-30T12:37:11.395331633Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a52f06a1-c643-4577-83c3-a4108868dc9c",
  "code": "660962",
  "device_ref": "sandbox-3195"
}
```

```json
{
  "session_id": "f4bd786b-8aec-4d6d-9793-9ee8a7cd2115",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDczMSwiaWF0IjoxNzkzMzYzODMxLCJqdGkiOiI0YmQzOTY2Mi00OTM4LTQzZjktYWI3MC1kZGIwMTBmMzY1MTEiLCJzaWQiOiJmNGJkNzg2Yi04YWVjLTRkNmQtOTc5My05ZWU4YTdjZDIxMTUifQ.rebXxpU9t9lehiydJjpI6rEK_p6zsjAT3VloEihVBSU",
  "access_expires_at": "2026-10-30T12:52:11.694243664Z",
  "refresh_token": "qSa1vFTfKNXghaVMey3jP5BZPzy9UugYK7hjAuBCVI4",
  "refresh_expires_at": "2026-11-29T12:37:11.693665957Z",
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
  "command_id": "03b56392-75b6-4816-8348-445742e31081",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:37:12Z",
    "sequence": 1793363832263
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9183832b-b2a7-4dfd-8240-6df51021e625",
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
  "last_heartbeat_at": "2026-10-30T12:37:12.282947Z",
  "last_location_at": "2026-10-30T12:37:12.282947Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f61fd358-e565-482c-b530-0b234304b34b",
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
  "id": "11273016-995c-4452-993c-dc7e97964ba9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:42:12.580786Z",
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
  "command_id": "ba8362d1-1f5a-42d8-9027-4e4d003e802f",
  "quote_id": "11273016-995c-4452-993c-dc7e97964ba9",
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
  "id": "2fbd1c9c-af88-4be3-b67d-874cfb90553f",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "194ae0c2-fc2d-42d5-8ecc-4797ba2ac670",
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
  "created_at": "2026-10-30T12:37:12.878925Z",
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
    "id": "9e0d3a25-7f78-4b9b-bc1a-07bdaddca56c",
    "order_id": "2fbd1c9c-af88-4be3-b67d-874cfb90553f",
    "expires_at": "2026-10-30T12:37:27.882558Z",
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

`POST /api/driver/v1/offers/9e0d3a25-7f78-4b9b-bc1a-07bdaddca56c/accept` → **200**

```json
{
  "command_id": "326d207f-f6bc-4a16-9e0d-489f2dd2ff13"
}
```

```json
{
  "id": "964cce9c-67bc-4abd-9ba6-c4b562dcc0e4",
  "order_id": "2fbd1c9c-af88-4be3-b67d-874cfb90553f",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4e735f4c-1862-41b5-97b8-f4c0ffa61fa6",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4e735f4c-1862-41b5-97b8-f4c0ffa61fa6",
  "order_id": "2fbd1c9c-af88-4be3-b67d-874cfb90553f",
  "assignment_id": "964cce9c-67bc-4abd-9ba6-c4b562dcc0e4",
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

`POST /api/driver/v1/trips/4e735f4c-1862-41b5-97b8-f4c0ffa61fa6/cancel` → **200**

```json
{
  "command_id": "d3358f9a-c51a-406d-9d96-685e95e4461d",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "4e735f4c-1862-41b5-97b8-f4c0ffa61fa6",
  "order_id": "2fbd1c9c-af88-4be3-b67d-874cfb90553f",
  "assignment_id": "964cce9c-67bc-4abd-9ba6-c4b562dcc0e4",
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

`GET /api/rider/v1/orders/2fbd1c9c-af88-4be3-b67d-874cfb90553f` → **200**

```json
{
  "id": "2fbd1c9c-af88-4be3-b67d-874cfb90553f",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "194ae0c2-fc2d-42d5-8ecc-4797ba2ac670",
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
    "id": "964cce9c-67bc-4abd-9ba6-c4b562dcc0e4",
    "order_id": "2fbd1c9c-af88-4be3-b67d-874cfb90553f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "4e735f4c-1862-41b5-97b8-f4c0ffa61fa6",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T12:37:12.878925Z",
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
    "id": "87d1c193-dc95-4b24-a86e-d442e10dc791",
    "order_id": "2fbd1c9c-af88-4be3-b67d-874cfb90553f",
    "expires_at": "2026-10-30T12:37:29.05958Z",
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

`POST /api/driver/v1/offers/87d1c193-dc95-4b24-a86e-d442e10dc791/accept` → **200**

```json
{
  "command_id": "a954f078-6fd4-407b-8d04-9112351c6899"
}
```

```json
{
  "id": "24122768-77ba-483a-87b1-ba909f1c02ba",
  "order_id": "2fbd1c9c-af88-4be3-b67d-874cfb90553f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "93ef487f-35f6-4314-b25a-7030dc68c0a8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "93ef487f-35f6-4314-b25a-7030dc68c0a8",
  "order_id": "2fbd1c9c-af88-4be3-b67d-874cfb90553f",
  "assignment_id": "24122768-77ba-483a-87b1-ba909f1c02ba",
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

`POST /api/driver/v1/trips/93ef487f-35f6-4314-b25a-7030dc68c0a8/cancel` → **200**

```json
{
  "command_id": "b35d49c9-7109-4cf7-8822-d6021281e66c",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "93ef487f-35f6-4314-b25a-7030dc68c0a8",
  "order_id": "2fbd1c9c-af88-4be3-b67d-874cfb90553f",
  "assignment_id": "24122768-77ba-483a-87b1-ba909f1c02ba",
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
    "id": "2fbd1c9c-af88-4be3-b67d-874cfb90553f",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-30T12:37:12.878925Z",
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
    "id": "dbc593b0-1321-42a3-9529-e174623a2faf",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T12:37:09.877475Z",
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

`GET /api/operator/v1/orders/2fbd1c9c-af88-4be3-b67d-874cfb90553f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T12:37:12.879468Z",
      "actor": {
        "type": "CLIENT",
        "id": "194ae0c2-fc2d-42d5-8ecc-4797ba2ac670",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2fbd1c9c-af88-4be3-b67d-874cfb90553f",
        "quote_id": "11273016-995c-4452-993c-dc7e97964ba9",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "2d4decba-c170-466e-a846-1532a09626e5"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T12:37:12.88166Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2fbd1c9c-af88-4be3-b67d-874cfb90553f",
        "attempt_id": "4ed1d786-4f2d-4770-941e-9ea8cf286906",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "2d4decba-c170-466e-a846-1532a09626e5"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T12:37:12.888893Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "9e0d3a25-7f78-4b9b-bc1a-07bdaddca56c",
        "order_id": "2fbd1c9c-af88-4be3-b67d-874cfb90553f",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "2d4decba-c170-466e-a846-1532a09626e5"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T12:37:13.467043Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "9e0d3a25-7f78-4b9b-bc1a-07bdaddca56c",
        "order_id": "2fbd1c9c-af88-4be3-b67d-874cfb90553f",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "964cce9c-67bc-4abd-9ba6-c4b562dcc0e4"
      },
      "correlation_id": "7611227f-b9bb-4a07-9698-c3c4893d5864"
```

Done: orders dbc593b0-1321-42a3-9529-e174623a2faf, 2fbd1c9c-af88-4be3-b67d-874cfb90553f.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380730567714",
  "device_ref": "sandbox-14259"
}
```

```json
{
  "challenge_id": "d030a6f6-d128-472a-a5d5-36d7bb918c79",
  "expires_at": "2026-10-30T12:42:16.393258009Z",
  "resend_available_at": "2026-10-30T12:37:17.393258009Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380730567714` → **200**

```json
{
  "phone": "+380730567714",
  "audience": "CLIENT",
  "code": "352245",
  "sent_at": "2026-10-30T12:37:16.396177946Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d030a6f6-d128-472a-a5d5-36d7bb918c79",
  "code": "352245",
  "device_ref": "sandbox-14259"
}
```

```json
{
  "session_id": "2fd49578-deb4-482d-99be-80c74959d223",
  "subject": {
    "type": "CLIENT",
    "id": "41db7be8-3606-4a37-9423-2712bb4b0234"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWRiN2JlOC0zNjA2LTRhMzctOTQyMy0yNzEyYmI0YjAyMzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0NzM2LCJpYXQiOjE3OTMzNjM4MzYsImp0aSI6Ijk1YmMxOWNkLTA1ZTAtNGFiZi04OGYxLTM0NjViOWUyNWFiMiIsInNpZCI6IjJmZDQ5NTc4LWRlYjQtNDgyZC05OWJlLTgwYzc0OTU5ZDIyMyJ9.d4_Zj_DZHSyaRrM-_QqKv4jHRCWnYvi5BpAUgWR98pk",
  "access_expires_at": "2026-10-30T12:52:16.70262727Z",
  "refresh_token": "7EPceVi2AE3OPby0CCT3sLw47sLTwvSAN9_TUp55aS8",
  "refresh_expires_at": "2026-11-29T12:37:16.702088958Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "319257a3-6fec-450e-8400-f3898effe1f7",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b09066c2-bd47-4611-914a-0cd4ef192ca3",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b09066c2-bd47-4611-914a-0cd4ef192ca3",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "794d56e87196569a7685e2e9557e91e4",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b09066c2-bd47-4611-914a-0cd4ef192ca3",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730567714"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b09066c2-bd47-4611-914a-0cd4ef192ca3",
  "expires_at": "2026-10-30T13:07:16.988367Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/b09066c2-bd47-4611-914a-0cd4ef192ca3` → **200**

```json
{
  "id": "b09066c2-bd47-4611-914a-0cd4ef192ca3",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T13:07:16.988367Z",
  "card": {
    "id": "c750478f-908d-4a9d-9232-25cfbd6627ba",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2584",
    "card_type": "Visa",
    "created_at": "2026-10-30T12:37:17.289406Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "c750478f-908d-4a9d-9232-25cfbd6627ba",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****2584",
      "card_type": "Visa",
      "created_at": "2026-10-30T12:37:17.289406Z"
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
  "device_ref": "sandbox-32429"
}
```

```json
{
  "challenge_id": "e31582c8-22f7-4385-a07a-1fadbf5c78a0",
  "expires_at": "2026-10-30T12:42:17.866071746Z",
  "resend_available_at": "2026-10-30T12:37:18.866071746Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "149747",
  "sent_at": "2026-10-30T12:37:17.869310448Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e31582c8-22f7-4385-a07a-1fadbf5c78a0",
  "code": "149747",
  "device_ref": "sandbox-32429"
}
```

```json
{
  "session_id": "818d9f2f-df6d-45f6-a5f8-77b652eaa8aa",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDczOCwiaWF0IjoxNzkzMzYzODM4LCJqdGkiOiIyMTRlNTcxNC0zN2NhLTRmZjMtYjcwOC1mMWVjN2Q0ZGM0MTIiLCJzaWQiOiI4MThkOWYyZi1kZjZkLTQ1ZjYtYTVmOC03N2I2NTJlYWE4YWEifQ.uuqSFV-jpaZYyz8ZQRQseWKaBJNw-R2Ic7uwKODWWk0",
  "access_expires_at": "2026-10-30T12:52:18.165569687Z",
  "refresh_token": "cB_-uzAB2w_Xl22RkiBl6AVG3Bjyi2gTXTf5_va4qUU",
  "refresh_expires_at": "2026-11-29T12:37:18.164855637Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9183832b-b2a7-4dfd-8240-6df51021e625",
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
  "last_heartbeat_at": "2026-10-30T12:37:12.282947Z",
  "last_location_at": "2026-10-30T12:37:12.282947Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9183832b-b2a7-4dfd-8240-6df51021e625/handover` → **200**

```json
{
  "command_id": "370120a8-13b3-4fba-86d6-e93a3eda0544",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9183832b-b2a7-4dfd-8240-6df51021e625",
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
  "last_heartbeat_at": "2026-10-30T12:37:12.282947Z",
  "last_location_at": "2026-10-30T12:37:12.282947Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9183832b-b2a7-4dfd-8240-6df51021e625/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:37:19Z",
    "sequence": 1793363839266
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9183832b-b2a7-4dfd-8240-6df51021e625",
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
  "last_heartbeat_at": "2026-10-30T12:37:19.045603Z",
  "last_location_at": "2026-10-30T12:37:19.045603Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "be647560-94b8-4661-9fa7-1334cc0491c6",
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
  "id": "39050f23-9ce2-42a2-8336-640677cbf607",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:42:19.348908Z",
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
  "command_id": "a74b7708-fe93-4d0f-bcc9-50e8e17fa500",
  "quote_id": "39050f23-9ce2-42a2-8336-640677cbf607",
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
  "id": "c73ddd77-ee9a-4256-8ef9-30929193a292",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "41db7be8-3606-4a37-9423-2712bb4b0234",
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
  "created_at": "2026-10-30T12:37:19.661394Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c73ddd77-ee9a-4256-8ef9-30929193a292` → **200**

```json
{
  "id": "c73ddd77-ee9a-4256-8ef9-30929193a292",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "41db7be8-3606-4a37-9423-2712bb4b0234",
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
  "created_at": "2026-10-30T12:37:19.661394Z",
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
    "id": "f5e3eec9-4191-45fe-a703-e23c590c850a",
    "order_id": "c73ddd77-ee9a-4256-8ef9-30929193a292",
    "expires_at": "2026-10-30T12:37:34.819313Z",
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

`POST /api/driver/v1/offers/f5e3eec9-4191-45fe-a703-e23c590c850a/accept` → **200**

```json
{
  "command_id": "06a50763-ef5e-44fb-aec7-0d157fc891d0"
}
```

```json
{
  "id": "2b92af72-2923-4424-9167-947001c1b6c2",
  "order_id": "c73ddd77-ee9a-4256-8ef9-30929193a292",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ad059cb2-3f0a-4ad0-8589-3987e148638b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ad059cb2-3f0a-4ad0-8589-3987e148638b",
  "order_id": "c73ddd77-ee9a-4256-8ef9-30929193a292",
  "assignment_id": "2b92af72-2923-4424-9167-947001c1b6c2",
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

`POST /api/driver/v1/work-sessions/9183832b-b2a7-4dfd-8240-6df51021e625/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:37:21Z",
    "sequence": 1793363841142
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9183832b-b2a7-4dfd-8240-6df51021e625",
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
  "last_heartbeat_at": "2026-10-30T12:37:21.160899Z",
  "last_location_at": "2026-10-30T12:37:21.160899Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ad059cb2-3f0a-4ad0-8589-3987e148638b/arrive` → **200**

```json
{
  "command_id": "28889326-9869-49a3-8484-6ba3b78334e5",
  "expected_version": 0
}
```

```json
{
  "id": "ad059cb2-3f0a-4ad0-8589-3987e148638b",
  "order_id": "c73ddd77-ee9a-4256-8ef9-30929193a292",
  "assignment_id": "2b92af72-2923-4424-9167-947001c1b6c2",
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
  "arrived_at": "2026-10-30T12:37:21.456269Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ad059cb2-3f0a-4ad0-8589-3987e148638b/start` → **200**

```json
{
  "command_id": "4a87c6b3-332f-4836-9924-c0d03b76f3f5",
  "expected_version": 1
}
```

```json
{
  "id": "ad059cb2-3f0a-4ad0-8589-3987e148638b",
  "order_id": "c73ddd77-ee9a-4256-8ef9-30929193a292",
  "assignment_id": "2b92af72-2923-4424-9167-947001c1b6c2",
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
  "arrived_at": "2026-10-30T12:37:21.456269Z",
  "started_at": "2026-10-30T12:37:21.746759Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ad059cb2-3f0a-4ad0-8589-3987e148638b/complete` → **200**

```json
{
  "command_id": "b34ff7c8-ce2a-4fa9-80cd-7aa29b40f3bf",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:37:22Z",
  "cash_received": true
}
```

```json
{
  "id": "ad059cb2-3f0a-4ad0-8589-3987e148638b",
  "order_id": "c73ddd77-ee9a-4256-8ef9-30929193a292",
  "assignment_id": "2b92af72-2923-4424-9167-947001c1b6c2",
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
  "arrived_at": "2026-10-30T12:37:21.456269Z",
  "started_at": "2026-10-30T12:37:21.746759Z",
  "completed_at": "2026-10-30T12:37:22.058798Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/c73ddd77-ee9a-4256-8ef9-30929193a292` → **200**

```json
{
  "id": "c73ddd77-ee9a-4256-8ef9-30929193a292",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "41db7be8-3606-4a37-9423-2712bb4b0234",
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
    "id": "2b92af72-2923-4424-9167-947001c1b6c2",
    "order_id": "c73ddd77-ee9a-4256-8ef9-30929193a292",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ad059cb2-3f0a-4ad0-8589-3987e148638b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:37:19.661394Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c73ddd77-ee9a-4256-8ef9-30929193a292` → **200**

```json
{
  "id": "c73ddd77-ee9a-4256-8ef9-30929193a292",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "41db7be8-3606-4a37-9423-2712bb4b0234",
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
    "id": "2b92af72-2923-4424-9167-947001c1b6c2",
    "order_id": "c73ddd77-ee9a-4256-8ef9-30929193a292",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ad059cb2-3f0a-4ad0-8589-3987e148638b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:37:19.661394Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c73ddd77-ee9a-4256-8ef9-30929193a292` → **200**

```json
{
  "id": "c73ddd77-ee9a-4256-8ef9-30929193a292",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "41db7be8-3606-4a37-9423-2712bb4b0234",
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
    "id": "2b92af72-2923-4424-9167-947001c1b6c2",
    "order_id": "c73ddd77-ee9a-4256-8ef9-30929193a292",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ad059cb2-3f0a-4ad0-8589-3987e148638b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:37:19.661394Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c73ddd77-ee9a-4256-8ef9-30929193a292` → **200**

```json
{
  "id": "c73ddd77-ee9a-4256-8ef9-30929193a292",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "41db7be8-3606-4a37-9423-2712bb4b0234",
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
    "id": "2b92af72-2923-4424-9167-947001c1b6c2",
    "order_id": "c73ddd77-ee9a-4256-8ef9-30929193a292",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ad059cb2-3f0a-4ad0-8589-3987e148638b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:37:19.661394Z",
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

`GET /api/rider/v1/orders/c73ddd77-ee9a-4256-8ef9-30929193a292/tip` → **200**

```json
{
  "order_id": "c73ddd77-ee9a-4256-8ef9-30929193a292",
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
  "available_until": "2026-10-31T12:37:22.058798Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/c73ddd77-ee9a-4256-8ef9-30929193a292/tip` → **201**

```json
{
  "command_id": "f4beecf6-d66b-4681-b507-1f22bee50ae3",
  "amount_minor": 2500
}
```

```json
{
  "id": "dd672cd4-1b39-4612-a500-63c24a18bbbc",
  "order_id": "c73ddd77-ee9a-4256-8ef9-30929193a292",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T12:37:27.143098Z"
}
```

`GET /api/rider/v1/orders/c73ddd77-ee9a-4256-8ef9-30929193a292/tip` → **200**

```json
{
  "order_id": "c73ddd77-ee9a-4256-8ef9-30929193a292",
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
  "available_until": "2026-10-31T12:37:22.058798Z",
  "open": false,
  "tip": {
    "id": "dd672cd4-1b39-4612-a500-63c24a18bbbc",
    "order_id": "c73ddd77-ee9a-4256-8ef9-30929193a292",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T12:37:27.143098Z"
  }
}
```

`GET /api/rider/v1/orders/c73ddd77-ee9a-4256-8ef9-30929193a292/tip` → **200**

```json
{
  "order_id": "c73ddd77-ee9a-4256-8ef9-30929193a292",
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
  "available_until": "2026-10-31T12:37:22.058798Z",
  "open": false,
  "tip": {
    "id": "dd672cd4-1b39-4612-a500-63c24a18bbbc",
    "order_id": "c73ddd77-ee9a-4256-8ef9-30929193a292",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T12:37:27.143098Z"
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
      "id": "80afc523-7553-4931-a57c-86efbb06f125",
      "at": "2026-10-30T12:37:28.968107Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c73ddd77-ee9a-4256-8ef9-30929193a292",
      "counterpart_id": null
    },
    {
      "id": "8c856e58-a923-4104-8526-197fa854e297",
      "at": "2026-10-30T12:37:22.906457Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c73ddd77-ee9a-4256-8ef9-30929193a292",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8743b8e7-8276-48a7-a598-d3d3f46e1bdd",
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
  "id": "0637bc4d-3008-438c-be05-127ffc3f869e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:42:29.347414Z",
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
  "session_id": "1c642bdc-a3c9-45f1-b64a-97a4da43f408",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ3NDksImlhdCI6MTc5MzM2Mzg0OSwianRpIjoiZmM1NWQ3MGUtM2UxOC00MTE5LTk5MTItNzFhZDZlOGUxMmMyIiwic2lkIjoiMWM2NDJiZGMtYTNjOS00NWYxLWI2NGEtOTdhNGRhNDNmNDA4In0.ip2dRxqV4U7e5vbqYN75yG5FzhuXGOyTcF7ClAHAGAU",
  "access_expires_at": "2026-10-30T12:52:29.926404064Z",
  "refresh_token": "TJKqx73fQE1qAI9lg8c347kYE_RtJGNCxMqIPlhiJ9c",
  "refresh_expires_at": "2026-10-31T00:37:29.925849331Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380730567714` → **200**

```json
{
  "client_id": "41db7be8-3606-4a37-9423-2712bb4b0234"
}
```

`POST /api/admin/v1/rider-wallets/41db7be8-3606-4a37-9423-2712bb4b0234/top-ups` → **201**

```json
{
  "command_id": "23d06339-4af5-439f-9671-4f0fe854ce9f",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "41db7be8-3606-4a37-9423-2712bb4b0234",
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
      "id": "11427cf3-d362-4f4a-95ee-0d7773f62257",
      "at": "2026-10-30T12:37:30.496493Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "1a2496e6-b29a-47d9-90d4-f9760383de53",
  "quote_id": "0637bc4d-3008-438c-be05-127ffc3f869e",
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
  "id": "eb3dbcba-32df-4c92-868d-ddaf7e156310",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "41db7be8-3606-4a37-9423-2712bb4b0234",
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
  "created_at": "2026-10-30T12:37:30.800352Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/eb3dbcba-32df-4c92-868d-ddaf7e156310` → **200**

```json
{
  "id": "eb3dbcba-32df-4c92-868d-ddaf7e156310",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "41db7be8-3606-4a37-9423-2712bb4b0234",
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
  "created_at": "2026-10-30T12:37:30.800352Z",
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
    "id": "bc4cb7d9-473b-4e57-aedd-17e4517164c9",
    "order_id": "eb3dbcba-32df-4c92-868d-ddaf7e156310",
    "expires_at": "2026-10-30T12:37:45.805328Z",
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

`POST /api/driver/v1/offers/bc4cb7d9-473b-4e57-aedd-17e4517164c9/accept` → **200**

```json
{
  "command_id": "e7bb95ca-a4e3-4154-801b-f0b8f85f35ba"
}
```

```json
{
  "id": "21807799-20a8-496f-bb2b-3a7929be758b",
  "order_id": "eb3dbcba-32df-4c92-868d-ddaf7e156310",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e69bc124-d01f-426d-9d90-b2498a9bbf75",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e69bc124-d01f-426d-9d90-b2498a9bbf75",
  "order_id": "eb3dbcba-32df-4c92-868d-ddaf7e156310",
  "assignment_id": "21807799-20a8-496f-bb2b-3a7929be758b",
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

`POST /api/driver/v1/work-sessions/9183832b-b2a7-4dfd-8240-6df51021e625/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:37:32Z",
    "sequence": 1793363852240
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9183832b-b2a7-4dfd-8240-6df51021e625",
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
  "last_heartbeat_at": "2026-10-30T12:37:32.258968Z",
  "last_location_at": "2026-10-30T12:37:32.258968Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e69bc124-d01f-426d-9d90-b2498a9bbf75/arrive` → **200**

```json
{
  "command_id": "7c56ac2d-d0e8-47b6-9c25-cca36ebeaa02",
  "expected_version": 0
}
```

```json
{
  "id": "e69bc124-d01f-426d-9d90-b2498a9bbf75",
  "order_id": "eb3dbcba-32df-4c92-868d-ddaf7e156310",
  "assignment_id": "21807799-20a8-496f-bb2b-3a7929be758b",
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
  "arrived_at": "2026-10-30T12:37:32.552503Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e69bc124-d01f-426d-9d90-b2498a9bbf75/start` → **200**

```json
{
  "command_id": "f5c271f7-5880-4303-ac03-18722ad9678b",
  "expected_version": 1
}
```

```json
{
  "id": "e69bc124-d01f-426d-9d90-b2498a9bbf75",
  "order_id": "eb3dbcba-32df-4c92-868d-ddaf7e156310",
  "assignment_id": "21807799-20a8-496f-bb2b-3a7929be758b",
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
  "arrived_at": "2026-10-30T12:37:32.552503Z",
  "started_at": "2026-10-30T12:37:32.844811Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e69bc124-d01f-426d-9d90-b2498a9bbf75/complete` → **200**

```json
{
  "command_id": "e5c93ae7-e43b-4d40-b560-371ed7da030b",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:37:33Z",
  "cash_received": true
}
```

```json
{
  "id": "e69bc124-d01f-426d-9d90-b2498a9bbf75",
  "order_id": "eb3dbcba-32df-4c92-868d-ddaf7e156310",
  "assignment_id": "21807799-20a8-496f-bb2b-3a7929be758b",
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
  "arrived_at": "2026-10-30T12:37:32.552503Z",
  "started_at": "2026-10-30T12:37:32.844811Z",
  "completed_at": "2026-10-30T12:37:33.17541Z",
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
  "client_id": "41db7be8-3606-4a37-9423-2712bb4b0234",
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
      "id": "11427cf3-d362-4f4a-95ee-0d7773f62257",
      "at": "2026-10-30T12:37:30.496493Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
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

`GET /api/rider/v1/orders/eb3dbcba-32df-4c92-868d-ddaf7e156310/tip` → **200**

```json
{
  "order_id": "eb3dbcba-32df-4c92-868d-ddaf7e156310",
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
  "available_until": "2026-10-31T12:37:33.17541Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/eb3dbcba-32df-4c92-868d-ddaf7e156310/tip` → **201**

```json
{
  "command_id": "b08a8bdf-c0f9-4fa0-8ee8-7d8504972a01",
  "amount_minor": 2500
}
```

```json
{
  "id": "51406574-c609-4732-ac33-9be6afe8227e",
  "order_id": "eb3dbcba-32df-4c92-868d-ddaf7e156310",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T12:37:34.429549Z"
}
```

`GET /api/rider/v1/orders/eb3dbcba-32df-4c92-868d-ddaf7e156310/tip` → **200**

```json
{
  "order_id": "eb3dbcba-32df-4c92-868d-ddaf7e156310",
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
  "available_until": "2026-10-31T12:37:33.17541Z",
  "open": false,
  "tip": {
    "id": "51406574-c609-4732-ac33-9be6afe8227e",
    "order_id": "eb3dbcba-32df-4c92-868d-ddaf7e156310",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T12:37:34.429549Z"
  }
}
```

`GET /api/rider/v1/orders/eb3dbcba-32df-4c92-868d-ddaf7e156310/tip` → **200**

```json
{
  "order_id": "eb3dbcba-32df-4c92-868d-ddaf7e156310",
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
  "available_until": "2026-10-31T12:37:33.17541Z",
  "open": false,
  "tip": {
    "id": "51406574-c609-4732-ac33-9be6afe8227e",
    "order_id": "eb3dbcba-32df-4c92-868d-ddaf7e156310",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T12:37:34.429549Z"
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
      "id": "67fcffed-9d36-4e02-bc0d-8826ca2882cc",
      "at": "2026-10-30T12:37:36.049989Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "eb3dbcba-32df-4c92-868d-ddaf7e156310",
      "counterpart_id": null
    },
    {
      "id": "b42dd8e1-2f53-4e54-87dd-262683c15b5d",
      "at": "2026-10-30T12:37:34.015907Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "eb3dbcba-32df-4c92-868d-ddaf7e156310",
      "counterpart_id": null
    },
    {
      "id": "80afc523-7553-4931-a57c-86efbb06f125",
      "at": "2026-10-30T12:37:28.968107Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c73ddd77-ee9a-4256-8ef9-30929193a292",
      "counterpart_id": null
    },
    {
      "id": "8c856e58-a923-4104-8526-197fa854e297",
      "at": "2026-10-30T12:37:22.906457Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c73ddd77-ee9a-4256-8ef9-30929193a292",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9183832b-b2a7-4dfd-8240-6df51021e625",
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
  "last_heartbeat_at": "2026-10-30T12:37:32.258968Z",
  "last_location_at": "2026-10-30T12:37:32.258968Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9183832b-b2a7-4dfd-8240-6df51021e625/close` → **200**

```json
{
  "command_id": "4192b346-f36f-418f-93a0-0050b1e2fc43",
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

Done: card order eb3dbcba-32df-4c92-868d-ddaf7e156310.

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
  "phone": "+380734075798",
  "device_ref": "sandbox-8910"
}
```

```json
{
  "challenge_id": "e1ae4944-83b1-42a7-ac49-64ab29383e80",
  "expires_at": "2026-10-30T12:42:37.427881018Z",
  "resend_available_at": "2026-10-30T12:37:38.427881018Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734075798` → **200**

```json
{
  "phone": "+380734075798",
  "audience": "CLIENT",
  "code": "346434",
  "sent_at": "2026-10-30T12:37:37.430873944Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e1ae4944-83b1-42a7-ac49-64ab29383e80",
  "code": "346434",
  "device_ref": "sandbox-8910"
}
```

```json
{
  "session_id": "a55628fc-76f1-4f80-8c43-335a0fcc353a",
  "subject": {
    "type": "CLIENT",
    "id": "3ce23372-b25b-4cf9-996c-207858ec21d8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzY2UyMzM3Mi1iMjViLTRjZjktOTk2Yy0yMDc4NThlYzIxZDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0NzU3LCJpYXQiOjE3OTMzNjM4NTcsImp0aSI6ImE3MDFjZDBjLWEwOTYtNDI5YS05NWMzLTViZTYxZTU3ZmZlNyIsInNpZCI6ImE1NTYyOGZjLTc2ZjEtNGY4MC04YzQzLTMzNWEwZmNjMzUzYSJ9.zjBSKIeiXr8pgM1BDu6WmsT3YZVNOIa7WMBr15w1eTc",
  "access_expires_at": "2026-10-30T12:52:37.739979722Z",
  "refresh_token": "DuqR0vEEqPsRTdli64lbv-RQDGX0eCDTxULMStt0ZlM",
  "refresh_expires_at": "2026-11-29T12:37:37.739471056Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "8e680f44-af12-473e-8fd9-e4369205f3ef",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "a6ef580a-d081-4393-9867-e0bdf4dce4ea",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-a6ef580a-d081-4393-9867-e0bdf4dce4ea",
    "orderDate": "1793363858",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "5fa8ec8faf4c96b64a7caf5179d2662a",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=a6ef580a-d081-4393-9867-e0bdf4dce4ea",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734075798"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=a6ef580a-d081-4393-9867-e0bdf4dce4ea",
  "created_at": "2026-10-30T12:37:38.018422Z",
  "expires_at": "2026-10-30T13:07:38.018422Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/a6ef580a-d081-4393-9867-e0bdf4dce4ea` → **200**

```json
{
  "id": "a6ef580a-d081-4393-9867-e0bdf4dce4ea",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T12:37:38.018422Z",
  "expires_at": "2026-10-30T13:07:38.018422Z",
  "completed_at": "2026-10-30T12:37:38.308165Z",
  "masked_pan": "41****8496",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3ce23372-b25b-4cf9-996c-207858ec21d8",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3ce23372-b25b-4cf9-996c-207858ec21d8",
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
      "id": "29606635-857e-43e0-8c17-086952b6f0b3",
      "at": "2026-10-30T12:37:39.067149Z",
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
  "client_id": "3ce23372-b25b-4cf9-996c-207858ec21d8",
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
      "id": "29606635-857e-43e0-8c17-086952b6f0b3",
      "at": "2026-10-30T12:37:39.067149Z",
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
  "device_ref": "sandbox-463"
}
```

```json
{
  "challenge_id": "65672c3f-af1c-410c-99a5-deb2e3cadeb2",
  "expires_at": "2026-10-30T12:42:40.477140405Z",
  "resend_available_at": "2026-10-30T12:37:41.477140405Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "146760",
  "sent_at": "2026-10-30T12:37:40.479897895Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "65672c3f-af1c-410c-99a5-deb2e3cadeb2",
  "code": "146760",
  "device_ref": "sandbox-463"
}
```

```json
{
  "session_id": "4579d47b-109a-4bba-ab19-7c004efe84d1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDc2MCwiaWF0IjoxNzkzMzYzODYwLCJqdGkiOiI2NThkM2JlYS02YTU4LTQxNjktOTUxNS0zMzY1YTQxMzZiMjciLCJzaWQiOiI0NTc5ZDQ3Yi0xMDlhLTRiYmEtYWIxOS03YzAwNGVmZTg0ZDEifQ.IhepLcPF1LRKJwjj0bSN1oKkYQM62F621QvVsj3ZYI4",
  "access_expires_at": "2026-10-30T12:52:40.774750074Z",
  "refresh_token": "9ufdosQAnV_zFSYaf2q_md9Q1mmf0B999quY1djUzhw",
  "refresh_expires_at": "2026-11-29T12:37:40.77414139Z",
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
  "command_id": "99e756d4-54a0-4d41-8fc9-4d83f0bcaa92",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "edecc11d-d226-4db1-b87d-3fd76248cfac",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-edecc11d-d226-4db1-b87d-3fd76248cfac",
    "orderDate": "1793363861",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "a287af0512039709c87e856167c54bdf",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=edecc11d-d226-4db1-b87d-3fd76248cfac",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=edecc11d-d226-4db1-b87d-3fd76248cfac",
  "created_at": "2026-10-30T12:37:41.326988Z",
  "expires_at": "2026-10-30T13:07:41.326988Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/edecc11d-d226-4db1-b87d-3fd76248cfac` → **200**

```json
{
  "id": "edecc11d-d226-4db1-b87d-3fd76248cfac",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T12:37:41.326988Z",
  "expires_at": "2026-10-30T13:07:41.326988Z",
  "completed_at": "2026-10-30T12:37:41.605176Z",
  "masked_pan": "41****0432",
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
      "id": "e18d99c3-d98c-467e-b703-c875dd125391",
      "at": "2026-10-30T12:37:42.075084Z",
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
  "command_id": "ae55a014-ecab-4d05-abfc-87ac7c708a7a",
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
  "correlation_id": "46e003f5-8428-494c-b2ea-13a1a5e075c9"
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
  "device_ref": "sandbox-7346"
}
```

```json
{
  "challenge_id": "6bbcac83-63c2-4711-b1bb-0da049232d3d",
  "expires_at": "2026-10-30T12:42:43.754900782Z",
  "resend_available_at": "2026-10-30T12:37:44.754900782Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "623526",
  "sent_at": "2026-10-30T12:37:43.758168623Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6bbcac83-63c2-4711-b1bb-0da049232d3d",
  "code": "623526",
  "device_ref": "sandbox-7346"
}
```

```json
{
  "session_id": "4e3fe309-476d-4487-b8e4-dddabb4f616d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDc2NCwiaWF0IjoxNzkzMzYzODY0LCJqdGkiOiI0MGZlMmUxOS1kNmNkLTRhZDctYTY1Mi1jZmY0OGI1ZDNiNWIiLCJzaWQiOiI0ZTNmZTMwOS00NzZkLTQ0ODctYjhlNC1kZGRhYmI0ZjYxNmQifQ.sSsYOJHQLCXYuOYYCXgNHNMeTjRvkaRwO42h0hyjjoM",
  "access_expires_at": "2026-10-30T12:52:44.06505758Z",
  "refresh_token": "t0SNoBwHaM_tuiMs50GcIVOf3UXc6j1T8iCRcJ7LVVA",
  "refresh_expires_at": "2026-11-29T12:37:44.064505602Z",
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
  "command_id": "828d4f4a-9e75-40b7-a0aa-ba513739e23c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:37:44Z",
    "sequence": 1793363864620
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a97420be-b707-4297-b6e9-1e1390acc909",
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
  "last_heartbeat_at": "2026-10-30T12:37:44.638931Z",
  "last_location_at": "2026-10-30T12:37:44.638931Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630818321",
  "device_ref": "sandbox-20409"
}
```

```json
{
  "challenge_id": "fafc668b-b34e-4cbc-96e5-da0c71a377ce",
  "expires_at": "2026-10-30T12:42:44.921695155Z",
  "resend_available_at": "2026-10-30T12:37:45.921695155Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630818321` → **200**

```json
{
  "phone": "+380630818321",
  "audience": "CLIENT",
  "code": "066699",
  "sent_at": "2026-10-30T12:37:44.924444439Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fafc668b-b34e-4cbc-96e5-da0c71a377ce",
  "code": "066699",
  "device_ref": "sandbox-20409"
}
```

```json
{
  "session_id": "959eaf3d-20ed-4cb5-a69b-19eeedee4a44",
  "subject": {
    "type": "CLIENT",
    "id": "a501bff3-4cbb-4b70-a47a-899aa2f24d0c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTAxYmZmMy00Y2JiLTRiNzAtYTQ3YS04OTlhYTJmMjRkMGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0NzY1LCJpYXQiOjE3OTMzNjM4NjUsImp0aSI6ImRlZTkxOTI2LTQ0ZGUtNDE4OC1hNDRhLWIxZTVkZTkyOTZhMSIsInNpZCI6Ijk1OWVhZjNkLTIwZWQtNGNiNS1hNjliLTE5ZWVlZGVlNGE0NCJ9.VWTxxjrhNshkcdWr-VL9gvIgD9Ml87f_SPqSTE3tiVk",
  "access_expires_at": "2026-10-30T12:52:45.228690761Z",
  "refresh_token": "jtbxf6QmmLgH2PnQSePtNGweXVweBYPq6NbfBXcS9z8",
  "refresh_expires_at": "2026-11-29T12:37:45.228106653Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6f32526e-f559-425f-8070-13a1d0668c78",
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
  "id": "425f4982-ac9d-4fa1-ae9c-866d6efee805",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:42:45.517729Z",
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
  "command_id": "dd8cf5a0-90ba-43a6-b2ea-8687d3e33140",
  "quote_id": "425f4982-ac9d-4fa1-ae9c-866d6efee805",
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
  "id": "617e7031-2285-45bb-8d04-5f9fb4144583",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a501bff3-4cbb-4b70-a47a-899aa2f24d0c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:37:45.809191Z",
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
    "id": "29a2cb6a-b99f-4600-bc07-3213c254dba2",
    "order_id": "617e7031-2285-45bb-8d04-5f9fb4144583",
    "expires_at": "2026-10-30T12:38:00.812809Z",
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

`POST /api/driver/v1/offers/29a2cb6a-b99f-4600-bc07-3213c254dba2/accept` → **200**

```json
{
  "command_id": "f910ce60-335d-442e-8330-a3ecde768cef"
}
```

```json
{
  "id": "24bd5b2f-fed8-4bc6-803b-120bf6c9fa25",
  "order_id": "617e7031-2285-45bb-8d04-5f9fb4144583",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "beead131-cbdf-411b-850b-6a8ef9c49acb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "beead131-cbdf-411b-850b-6a8ef9c49acb",
  "order_id": "617e7031-2285-45bb-8d04-5f9fb4144583",
  "assignment_id": "24bd5b2f-fed8-4bc6-803b-120bf6c9fa25",
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

`POST /api/driver/v1/work-sessions/a97420be-b707-4297-b6e9-1e1390acc909/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:37:46Z",
    "sequence": 1793363866952
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a97420be-b707-4297-b6e9-1e1390acc909",
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
  "last_heartbeat_at": "2026-10-30T12:37:46.971092Z",
  "last_location_at": "2026-10-30T12:37:46.971092Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/beead131-cbdf-411b-850b-6a8ef9c49acb/arrive` → **200**

```json
{
  "command_id": "09678b06-2aff-4bee-b7f7-5e8b2b1fce9d",
  "expected_version": 0
}
```

```json
{
  "id": "beead131-cbdf-411b-850b-6a8ef9c49acb",
  "order_id": "617e7031-2285-45bb-8d04-5f9fb4144583",
  "assignment_id": "24bd5b2f-fed8-4bc6-803b-120bf6c9fa25",
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
  "arrived_at": "2026-10-30T12:37:47.251814Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/beead131-cbdf-411b-850b-6a8ef9c49acb/start` → **200**

```json
{
  "command_id": "56837c1b-56d5-4e6b-9c49-c553dff5f8e1",
  "expected_version": 1
}
```

```json
{
  "id": "beead131-cbdf-411b-850b-6a8ef9c49acb",
  "order_id": "617e7031-2285-45bb-8d04-5f9fb4144583",
  "assignment_id": "24bd5b2f-fed8-4bc6-803b-120bf6c9fa25",
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
  "arrived_at": "2026-10-30T12:37:47.251814Z",
  "started_at": "2026-10-30T12:37:47.549675Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/beead131-cbdf-411b-850b-6a8ef9c49acb/complete` → **200**

```json
{
  "command_id": "178a9110-96e5-4062-8f2e-173ad9f6eb12",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:37:47Z",
  "cash_received": false
}
```

```json
{
  "id": "beead131-cbdf-411b-850b-6a8ef9c49acb",
  "order_id": "617e7031-2285-45bb-8d04-5f9fb4144583",
  "assignment_id": "24bd5b2f-fed8-4bc6-803b-120bf6c9fa25",
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
  "arrived_at": "2026-10-30T12:37:47.251814Z",
  "started_at": "2026-10-30T12:37:47.549675Z",
  "completed_at": "2026-10-30T12:37:47.855317Z",
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
  "session_id": "b97553ae-0078-4dcb-b079-e96f4fe10e14",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ3NjgsImlhdCI6MTc5MzM2Mzg2OCwianRpIjoiM2QyMDAyZTYtZDVmZS00MDJhLWIyYzktOTdkZjI1OTE0MTUxIiwic2lkIjoiYjk3NTUzYWUtMDA3OC00ZGNiLWIwNzktZTk2ZjRmZTEwZTE0In0.rdWKTwwVbOer-Wqbr4Ca96TpdKTU0VLqb3dVS31DYVY",
  "access_expires_at": "2026-10-30T12:52:48.445670631Z",
  "refresh_token": "qzwaoYhKnLBBa_spKPh_p4WJHFKXBOloy6YTcTKVo7g",
  "refresh_expires_at": "2026-10-31T00:37:48.445143419Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/617e7031-2285-45bb-8d04-5f9fb4144583/cash-dispute` → **200**

```json
{
  "order_id": "617e7031-2285-45bb-8d04-5f9fb4144583",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "a501bff3-4cbb-4b70-a47a-899aa2f24d0c",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T12:37:48.134536Z",
  "decide_by": "2026-11-13T12:37:48.134536Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T12:37:48.134536Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "617e7031-2285-45bb-8d04-5f9fb4144583",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "a501bff3-4cbb-4b70-a47a-899aa2f24d0c",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T12:37:48.134536Z",
      "decide_by": "2026-11-13T12:37:48.134536Z",
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

`POST /api/admin/v1/orders/617e7031-2285-45bb-8d04-5f9fb4144583/cash-dispute/decide` → **400**

```json
{
  "command_id": "754ba87a-7b11-4bfb-b8f2-a3c0d921ef0d",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/617e7031-2285-45bb-8d04-5f9fb4144583/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "2d79864b-2d80-47c1-965d-3bf0fc2653af",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/617e7031-2285-45bb-8d04-5f9fb4144583/cash-dispute/decide` → **200**

```json
{
  "command_id": "e77ade21-8cf9-4e79-80e9-87c93f2e00fb",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "617e7031-2285-45bb-8d04-5f9fb4144583",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "a501bff3-4cbb-4b70-a47a-899aa2f24d0c",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T12:37:48.134536Z",
  "decide_by": "2026-11-13T12:37:48.134536Z",
  "decision": "PAY_DRIVER",
  "decided_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T12:37:49.636782Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/617e7031-2285-45bb-8d04-5f9fb4144583/cash-dispute/decide` → **409**

```json
{
  "command_id": "fde7ff15-9fcf-42e6-becb-bcec35dabcc8",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/617e7031-2285-45bb-8d04-5f9fb4144583/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d5862ebf-f484-47a2-842d-d6fda73ad50b"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a97420be-b707-4297-b6e9-1e1390acc909",
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
  "last_heartbeat_at": "2026-10-30T12:37:46.971092Z",
  "last_location_at": "2026-10-30T12:37:46.971092Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a97420be-b707-4297-b6e9-1e1390acc909/close` → **200**

```json
{
  "command_id": "4ddf23ba-138a-476b-bbd4-42d10a621988",
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
  "phone": "+380736748460",
  "device_ref": "sandbox-1688"
}
```

```json
{
  "challenge_id": "979beefc-323d-4ec2-ae1b-cbe39b7d451a",
  "expires_at": "2026-10-30T12:42:50.805354465Z",
  "resend_available_at": "2026-10-30T12:37:51.805354465Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380736748460` → **200**

```json
{
  "phone": "+380736748460",
  "audience": "CLIENT",
  "code": "162540",
  "sent_at": "2026-10-30T12:37:50.808367334Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "979beefc-323d-4ec2-ae1b-cbe39b7d451a",
  "code": "162540",
  "device_ref": "sandbox-1688"
}
```

```json
{
  "session_id": "e3201a04-4d00-41ec-95cf-5e327059498c",
  "subject": {
    "type": "CLIENT",
    "id": "c5301521-4295-44bf-b982-291b8e494b66"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNTMwMTUyMS00Mjk1LTQ0YmYtYjk4Mi0yOTFiOGU0OTRiNjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0NzcxLCJpYXQiOjE3OTMzNjM4NzEsImp0aSI6IjlkYmYxYWU3LThmMTgtNDNjYS05YWY3LWRkYWViOTU0YTIyNyIsInNpZCI6ImUzMjAxYTA0LTRkMDAtNDFlYy05NWNmLTVlMzI3MDU5NDk4YyJ9.8aYVVugpwWKGfS2xxIVaAEe8TNseWRRLwKwVVjGkFA4",
  "access_expires_at": "2026-10-30T12:52:51.125666122Z",
  "refresh_token": "187kS5_1Hffv_ganCLYxjVTd2IEGgL5WMOAulX0Lz_A",
  "refresh_expires_at": "2026-11-29T12:37:51.125157111Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "16dd35d9-0734-4874-8c89-1b90cdc7b151",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "572a2cd7-e7d4-41e9-a0ee-97c5631aaee5",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-572a2cd7-e7d4-41e9-a0ee-97c5631aaee5",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "7a42150b8ee249f435a16923585fae5b",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=572a2cd7-e7d4-41e9-a0ee-97c5631aaee5",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736748460"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=572a2cd7-e7d4-41e9-a0ee-97c5631aaee5",
  "expires_at": "2026-10-30T13:07:51.414734Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/572a2cd7-e7d4-41e9-a0ee-97c5631aaee5` → **200**

```json
{
  "id": "572a2cd7-e7d4-41e9-a0ee-97c5631aaee5",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T13:07:51.414734Z",
  "card": {
    "id": "c151b353-bf45-414f-b6a4-6bb5cc352aa9",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1011",
    "card_type": "Visa",
    "created_at": "2026-10-30T12:37:51.708583Z"
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
  "device_ref": "sandbox-20010"
}
```

```json
{
  "challenge_id": "1ff4ad3d-5029-4957-a82c-66eeaa60f09d",
  "expires_at": "2026-10-30T12:42:52.004821278Z",
  "resend_available_at": "2026-10-30T12:37:53.004821278Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "232019",
  "sent_at": "2026-10-30T12:37:52.007606721Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1ff4ad3d-5029-4957-a82c-66eeaa60f09d",
  "code": "232019",
  "device_ref": "sandbox-20010"
}
```

```json
{
  "session_id": "71c44f2c-dccf-421a-8c08-2b0fae3a7019",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDc3MiwiaWF0IjoxNzkzMzYzODcyLCJqdGkiOiIwZDcxMzI3ZS1mNDI1LTRkOGMtYjQ1ZC1iMmI5Njg3ZTgxYmMiLCJzaWQiOiI3MWM0NGYyYy1kY2NmLTQyMWEtOGMwOC0yYjBmYWUzYTcwMTkifQ.y1B1lTRNSGB1nu1aEJWMbmK76EmzIXYI2kK_gfpYWOc",
  "access_expires_at": "2026-10-30T12:52:52.323365966Z",
  "refresh_token": "VWZkPWelUZdzSNyYb_s-azVP4Wzp2t8IizgrKtzI8Ls",
  "refresh_expires_at": "2026-11-29T12:37:52.322792984Z",
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
  "command_id": "424699c7-c1ec-4ddd-a86c-43d0f5e8ceb5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:37:52Z",
    "sequence": 1793363872863
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "456d7203-d1cc-4036-a961-5cb1fa6b0c51",
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
  "last_heartbeat_at": "2026-10-30T12:37:52.882224Z",
  "last_location_at": "2026-10-30T12:37:52.882224Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f7c6e528-7fc0-4655-b918-d3a992e6d1d0",
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
  "id": "800b3287-d457-437c-9691-e9414d08d35f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:42:53.167926Z",
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
  "command_id": "cef46dc1-5ef6-4b40-937a-e2d187360eb4",
  "quote_id": "800b3287-d457-437c-9691-e9414d08d35f",
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
  "id": "9b9d6da8-53aa-4e8d-915d-6fca939e46d9",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c5301521-4295-44bf-b982-291b8e494b66",
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
  "created_at": "2026-10-30T12:37:53.468519Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b9d6da8-53aa-4e8d-915d-6fca939e46d9` → **200**

```json
{
  "id": "9b9d6da8-53aa-4e8d-915d-6fca939e46d9",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c5301521-4295-44bf-b982-291b8e494b66",
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
  "created_at": "2026-10-30T12:37:53.468519Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b9d6da8-53aa-4e8d-915d-6fca939e46d9` → **200**

```json
{
  "id": "9b9d6da8-53aa-4e8d-915d-6fca939e46d9",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c5301521-4295-44bf-b982-291b8e494b66",
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
  "created_at": "2026-10-30T12:37:53.468519Z",
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
    "id": "cb1122d3-5b39-4c82-9e95-18b8535ee495",
    "order_id": "9b9d6da8-53aa-4e8d-915d-6fca939e46d9",
    "expires_at": "2026-10-30T12:38:09.175181Z",
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

`POST /api/driver/v1/offers/cb1122d3-5b39-4c82-9e95-18b8535ee495/accept` → **200**

```json
{
  "command_id": "f71f9a0b-cc48-4c80-a5a4-b6103cefe413"
}
```

```json
{
  "id": "e0e46b7c-ca24-4252-9f46-a63e0f190df8",
  "order_id": "9b9d6da8-53aa-4e8d-915d-6fca939e46d9",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8804550f-9e05-44fd-9aab-f501c45a35c0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8804550f-9e05-44fd-9aab-f501c45a35c0",
  "order_id": "9b9d6da8-53aa-4e8d-915d-6fca939e46d9",
  "assignment_id": "e0e46b7c-ca24-4252-9f46-a63e0f190df8",
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

`POST /api/rider/v1/orders/9b9d6da8-53aa-4e8d-915d-6fca939e46d9/messages` → **201**

```json
{
  "command_id": "7aac528f-d864-4388-9409-e0fd199496d7",
  "body": "Я біля входу, мій номер +380736748460, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "7e9328b2-643a-4d65-9ee4-0acd05628d06",
  "order_id": "9b9d6da8-53aa-4e8d-915d-6fca939e46d9",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380736748460, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T12:37:56.254085571Z"
}
```

`POST /api/driver/v1/trips/8804550f-9e05-44fd-9aab-f501c45a35c0/messages` → **201**

```json
{
  "command_id": "7e8db742-3f55-45e0-bba4-8ba8f2291930",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "fe6a951d-ac15-481f-860e-a9ae13a53485",
  "order_id": "9b9d6da8-53aa-4e8d-915d-6fca939e46d9",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T12:37:56.538195389Z"
}
```

`POST /api/driver/v1/work-sessions/456d7203-d1cc-4036-a961-5cb1fa6b0c51/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:37:56Z",
    "sequence": 1793363876811
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "456d7203-d1cc-4036-a961-5cb1fa6b0c51",
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
  "last_heartbeat_at": "2026-10-30T12:37:56.830325Z",
  "last_location_at": "2026-10-30T12:37:56.830325Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8804550f-9e05-44fd-9aab-f501c45a35c0/arrive` → **200**

```json
{
  "command_id": "50668f36-f9cf-4f89-9f77-88e54cda349a",
  "expected_version": 0
}
```

```json
{
  "id": "8804550f-9e05-44fd-9aab-f501c45a35c0",
  "order_id": "9b9d6da8-53aa-4e8d-915d-6fca939e46d9",
  "assignment_id": "e0e46b7c-ca24-4252-9f46-a63e0f190df8",
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
  "arrived_at": "2026-10-30T12:37:57.126123Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8804550f-9e05-44fd-9aab-f501c45a35c0/start` → **200**

```json
{
  "command_id": "07cded50-7758-4877-95ad-2763ff9a33f6",
  "expected_version": 1
}
```

```json
{
  "id": "8804550f-9e05-44fd-9aab-f501c45a35c0",
  "order_id": "9b9d6da8-53aa-4e8d-915d-6fca939e46d9",
  "assignment_id": "e0e46b7c-ca24-4252-9f46-a63e0f190df8",
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
  "arrived_at": "2026-10-30T12:37:57.126123Z",
  "started_at": "2026-10-30T12:37:57.423803Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/456d7203-d1cc-4036-a961-5cb1fa6b0c51/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:37:57Z",
    "sequence": 1793363877698
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "456d7203-d1cc-4036-a961-5cb1fa6b0c51",
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
  "last_heartbeat_at": "2026-10-30T12:37:57.716912Z",
  "last_location_at": "2026-10-30T12:37:57.716912Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/8804550f-9e05-44fd-9aab-f501c45a35c0/complete` → **200**

```json
{
  "command_id": "8cc0f270-b732-474d-858f-f2b12cece875",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:37:57Z",
  "cash_received": false
}
```

```json
{
  "id": "8804550f-9e05-44fd-9aab-f501c45a35c0",
  "order_id": "9b9d6da8-53aa-4e8d-915d-6fca939e46d9",
  "assignment_id": "e0e46b7c-ca24-4252-9f46-a63e0f190df8",
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
  "arrived_at": "2026-10-30T12:37:57.126123Z",
  "started_at": "2026-10-30T12:37:57.423803Z",
  "completed_at": "2026-10-30T12:37:58.003913Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/9b9d6da8-53aa-4e8d-915d-6fca939e46d9` → **200**

```json
{
  "id": "9b9d6da8-53aa-4e8d-915d-6fca939e46d9",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c5301521-4295-44bf-b982-291b8e494b66",
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
    "id": "e0e46b7c-ca24-4252-9f46-a63e0f190df8",
    "order_id": "9b9d6da8-53aa-4e8d-915d-6fca939e46d9",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "8804550f-9e05-44fd-9aab-f501c45a35c0",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:37:53.468519Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b9d6da8-53aa-4e8d-915d-6fca939e46d9` → **200**

```json
{
  "id": "9b9d6da8-53aa-4e8d-915d-6fca939e46d9",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "c5301521-4295-44bf-b982-291b8e494b66",
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
    "id": "e0e46b7c-ca24-4252-9f46-a63e0f190df8",
    "order_id": "9b9d6da8-53aa-4e8d-915d-6fca939e46d9",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "8804550f-9e05-44fd-9aab-f501c45a35c0",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:37:53.468519Z",
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
  "session_id": "456d7203-d1cc-4036-a961-5cb1fa6b0c51",
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
  "last_heartbeat_at": "2026-10-30T12:37:57.716912Z",
  "last_location_at": "2026-10-30T12:37:57.716912Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/456d7203-d1cc-4036-a961-5cb1fa6b0c51/close` → **200**

```json
{
  "command_id": "1a4abac9-061d-4ab3-9bb9-ac97030624e5",
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
  "session_id": "ef8b8789-3bf8-4023-8e32-8b9c84c32e0a",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ3ODAsImlhdCI6MTc5MzM2Mzg4MCwianRpIjoiOWEyMmI0OGQtZmM4Yy00MGE0LWE3M2ItMGE0OTg2MGFkMDlhIiwic2lkIjoiZWY4Yjg3ODktM2JmOC00MDIzLThlMzItOGI5Yzg0YzMyZTBhIn0.VhMUkUFOkr_1Hjujj52yceHpf22e5GGpVt449SIjB6E",
  "access_expires_at": "2026-10-30T12:53:00.761264996Z",
  "refresh_token": "FPc_1IC0qKjxeTi6jdM8RrpT-44siK2zUJCvGepgAOo",
  "refresh_expires_at": "2026-10-31T00:38:00.760751083Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/9b9d6da8-53aa-4e8d-915d-6fca939e46d9/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/9b9d6da8-53aa-4e8d-915d-6fca939e46d9/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "a07ca452-593e-4cb8-9e95-c0aeec603fa6"
}
```

`GET /api/admin/v1/orders/9b9d6da8-53aa-4e8d-915d-6fca939e46d9/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T12:38:01.325871438Z",
  "order": {
    "id": "9b9d6da8-53aa-4e8d-915d-6fca939e46d9",
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
    "created_at": "2026-10-30T12:37:53.468519Z",
    "assigned_at": "2026-10-30T12:37:55.68437Z",
    "arrived_at": "2026-10-30T12:37:57.126123Z",
    "started_at": "2026-10-30T12:37:57.423803Z",
    "completed_at": "2026-10-30T12:37:58.003913Z"
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
    "id": "c5301521-4295-44bf-b982-291b8e494b66",
    "registered_at": "2026-10-30T12:37:51.123442Z",
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
      "created_at": "2026-10-30T12:37:53.470824Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T12:37:58.243735Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/9b9d6da8-53aa-4e8d-915d-6fca939e46d9/chargebacks` → **422**

```json
{
  "command_id": "f8d06539-b0de-4b2a-9fde-8f0eca1dfeae",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/9b9d6da8-53aa-4e8d-915d-6fca939e46d9/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "e34ca1c8-46bf-425f-acff-63dd8f70907c"
}
```

`POST /api/admin/v1/orders/9b9d6da8-53aa-4e8d-915d-6fca939e46d9/chargebacks` → **201**

```json
{
  "command_id": "e2cd7d99-beec-45a7-a481-f3175471b66a",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "9ae93cbd-6620-445d-bad8-f43113ea4513",
  "order_id": "9b9d6da8-53aa-4e8d-915d-6fca939e46d9",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T12:38:01.98155Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/9b9d6da8-53aa-4e8d-915d-6fca939e46d9/chargebacks` → **201**

```json
{
  "command_id": "e2cd7d99-beec-45a7-a481-f3175471b66a",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "9ae93cbd-6620-445d-bad8-f43113ea4513",
  "order_id": "9b9d6da8-53aa-4e8d-915d-6fca939e46d9",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T12:38:01.98155Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/c5301521-4295-44bf-b982-291b8e494b66` → **200**

```json
{
  "client": {
    "id": "c5301521-4295-44bf-b982-291b8e494b66",
    "phone": "+380736748460",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T12:37:51.123442Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "9b9d6da8-53aa-4e8d-915d-6fca939e46d9",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T12:37:53.468519Z",
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

`POST /api/admin/v1/orders/9b9d6da8-53aa-4e8d-915d-6fca939e46d9/chargebacks/9ae93cbd-6620-445d-bad8-f43113ea4513/resolve` → **200**

```json
{
  "command_id": "a78d8c57-0a8e-4360-873e-c36e35f82563",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "9ae93cbd-6620-445d-bad8-f43113ea4513",
  "order_id": "9b9d6da8-53aa-4e8d-915d-6fca939e46d9",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T12:38:01.98155Z",
  "resolved_at": "2026-10-30T12:38:02.928129Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/c5301521-4295-44bf-b982-291b8e494b66` → **200**

```json
{
  "client": {
    "id": "c5301521-4295-44bf-b982-291b8e494b66",
    "phone": "+380736748460",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T12:37:51.123442Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "9b9d6da8-53aa-4e8d-915d-6fca939e46d9",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T12:37:53.468519Z",
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

`GET /api/admin/v1/clients/c5301521-4295-44bf-b982-291b8e494b66` → **200**

```json
{
  "client": {
    "id": "c5301521-4295-44bf-b982-291b8e494b66",
    "phone": "+380736748460",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T12:37:51.123442Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "9b9d6da8-53aa-4e8d-915d-6fca939e46d9",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T12:37:53.468519Z",
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

`POST /api/admin/v1/orders/9b9d6da8-53aa-4e8d-915d-6fca939e46d9/chargebacks/9ae93cbd-6620-445d-bad8-f43113ea4513/resolve` → **409**

```json
{
  "command_id": "a54e355e-e138-480b-a68a-dbc0efa1867b",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/9b9d6da8-53aa-4e8d-915d-6fca939e46d9/chargebacks/9ae93cbd-6620-445d-bad8-f43113ea4513/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a44f2b32-13e3-4662-a83c-d924f0414c90"
}
```

`GET /api/admin/v1/orders/9b9d6da8-53aa-4e8d-915d-6fca939e46d9/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "9ae93cbd-6620-445d-bad8-f43113ea4513",
      "order_id": "9b9d6da8-53aa-4e8d-915d-6fca939e46d9",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T12:38:01.98155Z",
      "resolved_at": "2026-10-30T12:38:02.928129Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 9b9d6da8-53aa-4e8d-915d-6fca939e46d9 without phone or card digits; chargeback 9ae93cbd-6620-445d-bad8-f43113ea4513 recorded and won.

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
  "session_id": "e7ebec9b-be6a-4cc5-8354-1c198575cd99",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ3ODYsImlhdCI6MTc5MzM2Mzg4NiwianRpIjoiODQ5N2ViYzEtZTZkMy00ZTRlLWJlYTktNGQzZGNmNmRkOGI5Iiwic2lkIjoiZTdlYmVjOWItYmU2YS00Y2M1LTgzNTQtMWMxOTg1NzVjZDk5In0.JDDBaEMk1zI8SsZuD6lmy1rPRqIaLRPnzbPqhuD_lSg",
  "access_expires_at": "2026-10-30T12:53:06.011980568Z",
  "refresh_token": "ETvPuwsutT2nQ-7ocnyRvOOK-_jIUlcW7jtnNYY1Dgo",
  "refresh_expires_at": "2026-10-31T00:38:06.011461246Z",
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
  "phone": "+48600004902",
  "device_ref": "sandbox-5138"
}
```

```json
{
  "challenge_id": "2837bbb1-4122-4947-8485-42eeb052aa18",
  "expires_at": "2026-10-30T12:43:06.844505922Z",
  "resend_available_at": "2026-10-30T12:38:07.844505922Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600004902` → **200**

```json
{
  "phone": "+48600004902",
  "audience": "CLIENT",
  "code": "870132",
  "sent_at": "2026-10-30T12:38:06.847124645Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2837bbb1-4122-4947-8485-42eeb052aa18",
  "code": "870132",
  "device_ref": "sandbox-5138"
}
```

```json
{
  "session_id": "4f32bec8-7714-451f-9503-07922bf06d6f",
  "subject": {
    "type": "CLIENT",
    "id": "89f1f1f3-a06f-4564-8f45-0750b28a4c8d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OWYxZjFmMy1hMDZmLTQ1NjQtOGY0NS0wNzUwYjI4YTRjOGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0Nzg3LCJpYXQiOjE3OTMzNjM4ODcsImp0aSI6ImI5OTdiM2U1LWU1YWEtNDUzOC1iY2NjLTBjN2MyYmIyM2RmZSIsInNpZCI6IjRmMzJiZWM4LTc3MTQtNDUxZi05NTAzLTA3OTIyYmYwNmQ2ZiJ9.oi2aGvmFrtWSEMckR5AdjYach1mjULNCwmnaM0nR1Dg",
  "access_expires_at": "2026-10-30T12:53:07.147945971Z",
  "refresh_token": "4C-MeXERIPUii__sTeUmRrBMOf9lEYHwV-m6zXEnzVk",
  "refresh_expires_at": "2026-11-29T12:38:07.147463413Z",
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
  "command_id": "b9b4d8e6-b23d-46d9-97f2-4ca9fd9722b9",
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
  "correlation_id": "369df626-0e4a-4904-8012-d0b445d385fe",
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
  "command_id": "96252eb5-bcdd-4edc-90d4-8d78cedc10e2",
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
  "paused_at": "2026-10-30T12:38:08.278409623Z",
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
  "command_id": "8cb2b249-2622-4e60-a4c1-c2493785a38c",
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
  "id": "c4c02629-2d99-4a7b-aa34-1b0ae6e03acd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:43:08.864212Z",
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
  "command_id": "886eeb2d-accf-4b40-bcfe-1b5cdeabd410",
  "quote_id": "c4c02629-2d99-4a7b-aa34-1b0ae6e03acd",
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
  "correlation_id": "54d9c963-2744-4e93-9a3e-c0d8ec7d1681"
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
  "paused_at": "2026-10-30T12:38:08.27841Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "c0a85835-469f-41f6-b182-03c50b965dab",
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
  "command_id": "605733f5-a304-44a0-ae35-0a5e676d221c",
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
  "command_id": "70433dcd-7078-452a-921d-d1389560be09",
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
  "id": "a9955a82-58c0-4bb2-8413-01c46da86aab",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:43:10.616214Z",
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
  "command_id": "c9861e6d-7d06-417f-b225-4ca7ea645305",
  "quote_id": "a9955a82-58c0-4bb2-8413-01c46da86aab",
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
  "correlation_id": "aeb911b6-c97c-408c-95cf-7041544defad"
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
  "command_id": "a230d39d-a0e4-4609-bb73-182b6b7f38a7",
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
      "from": "15:00",
      "to": "16:00"
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
      "from": "15:00",
      "to": "16:00"
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
  "command_id": "3c1f41bc-5788-4e74-9115-f12afc143945",
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
  "id": "592fd2af-2f0e-4fdc-97eb-8096902a3f2d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:43:11.750095Z",
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
  "command_id": "7087d24a-b10d-4b8c-b19e-ada7620835ab",
  "quote_id": "592fd2af-2f0e-4fdc-97eb-8096902a3f2d",
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
  "correlation_id": "0f1c3f86-76a7-49c9-9013-cde4243b8953"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "702e04c3-78a7-42e3-a7d2-cc0e6edbec16",
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
  "correlation_id": "a5b6ee7e-43ad-4de9-8115-1acfa6918bb1"
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
      "from": "15:00",
      "to": "16:00"
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
  "command_id": "d92e9b21-4b4c-4b9e-8a1c-7fb58dfdbfee",
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
  "phone": "+380674899342",
  "device_ref": "sandbox-30726"
}
```

```json
{
  "challenge_id": "5cedca90-8c4f-400d-a2c7-2e74d3c6ba72",
  "expires_at": "2026-10-30T12:43:13.206697294Z",
  "resend_available_at": "2026-10-30T12:38:14.206697294Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674899342` → **200**

```json
{
  "phone": "+380674899342",
  "audience": "CLIENT",
  "code": "312408",
  "sent_at": "2026-10-30T12:38:13.209365459Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5cedca90-8c4f-400d-a2c7-2e74d3c6ba72",
  "code": "312408",
  "device_ref": "sandbox-30726"
}
```

```json
{
  "session_id": "43e58082-b47a-4831-b852-35dabca027c0",
  "subject": {
    "type": "CLIENT",
    "id": "8b913838-ef90-4929-b8c4-8b55dc8a14c0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YjkxMzgzOC1lZjkwLTQ5MjktYjhjNC04YjU1ZGM4YTE0YzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0NzkzLCJpYXQiOjE3OTMzNjM4OTMsImp0aSI6IjgzMmNlYjBjLTBhNTYtNGNjZS1hMzY5LWVlYTkyNjdlOWI0ZiIsInNpZCI6IjQzZTU4MDgyLWI0N2EtNDgzMS1iODUyLTM1ZGFiY2EwMjdjMCJ9.bKbQ5FDSogRKc984iKXPtDjQNANjnN639B_iPHMtSQg",
  "access_expires_at": "2026-10-30T12:53:13.532802776Z",
  "refresh_token": "4Oghq3fx7pamKJSldTDj9RPfSkjh7rheW6Zl4RA37Go",
  "refresh_expires_at": "2026-11-29T12:38:13.532288388Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8b913838-ef90-4929-b8c4-8b55dc8a14c0",
  "session_id": "43e58082-b47a-4831-b852-35dabca027c0",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "28bef95f-a4d5-4a50-80c4-1543b6b43135",
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
  "id": "b0bcf1e5-59ec-43e6-86e5-88af319de9ed",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:43:14.097290Z",
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
  "challenge_id": "3ff5225c-943b-4007-8216-5aa2f77e704e",
  "expires_at": "2026-10-30T12:43:16.402206141Z",
  "resend_available_at": "2026-10-30T12:38:17.402206141Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674899342` → **200**

```json
{
  "phone": "+380674899342",
  "audience": "CLIENT",
  "code": "657268",
  "sent_at": "2026-10-30T12:38:16.404542525Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "dfb32d7d-1fdb-4c67-a34b-5d5524ea37e9",
  "challenge_id": "3ff5225c-943b-4007-8216-5aa2f77e704e",
  "otp_code": "657268"
}
```

```json
{
  "client_id": "8b913838-ef90-4929-b8c4-8b55dc8a14c0",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T12:38:16.715152288Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "f5b4693f-7624-49b3-87f2-8b4293780785",
  "quote_id": "b0bcf1e5-59ec-43e6-86e5-88af319de9ed",
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
  "correlation_id": "0b218c09-941e-4738-b375-9d7c243cf5d7"
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
  "session_id": "dd807d40-194d-4369-a7a1-86f2d9aa9e75",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ3OTcsImlhdCI6MTc5MzM2Mzg5NywianRpIjoiMDZjY2M1M2MtM2JjZS00NDNlLTkwNGMtYThkMjBjNWNiZWM1Iiwic2lkIjoiZGQ4MDdkNDAtMTk0ZC00MzY5LWE3YTEtODZmMmQ5YWE5ZTc1In0.xKsb8qmUEmBwRcLw31_K1mEswNFVEqEF7AIIn9pEbBM",
  "access_expires_at": "2026-10-30T12:53:17.595316156Z",
  "refresh_token": "7JBnAZIO0EPwL4idRoLhYdyauNMfZMlOk0hi62cAQEc",
  "refresh_expires_at": "2026-10-31T00:38:17.594757287Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "8b913838-ef90-4929-b8c4-8b55dc8a14c0",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T12:38:16.715152Z",
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

`POST /api/admin/v1/client-deletions/8b913838-ef90-4929-b8c4-8b55dc8a14c0/complete` → **200**

```json
{
  "command_id": "7fca0b77-ad3e-412e-b935-3c00a59484d8",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "8b913838-ef90-4929-b8c4-8b55dc8a14c0",
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
  "correlation_id": "0f5bf53d-132d-47df-8955-cb6670ce7d3b"
}
```

Done: client 8b913838-ef90-4929-b8c4-8b55dc8a14c0 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665078830",
  "device_ref": "sandbox-17213"
}
```

```json
{
  "challenge_id": "187bcbb9-9ba2-46a4-9bd8-314f93e3389c",
  "expires_at": "2026-10-30T12:43:18.749870407Z",
  "resend_available_at": "2026-10-30T12:38:19.749870407Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665078830` → **200**

```json
{
  "phone": "+380665078830",
  "audience": "CLIENT",
  "code": "209956",
  "sent_at": "2026-10-30T12:38:18.752686984Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "187bcbb9-9ba2-46a4-9bd8-314f93e3389c",
  "code": "209956",
  "device_ref": "sandbox-17213"
}
```

```json
{
  "session_id": "443417d8-77df-489a-a3e4-1c188ece5c7c",
  "subject": {
    "type": "CLIENT",
    "id": "faf488d4-9e8d-400e-9066-ec11abfecf13"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYWY0ODhkNC05ZThkLTQwMGUtOTA2Ni1lYzExYWJmZWNmMTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0Nzk5LCJpYXQiOjE3OTMzNjM4OTksImp0aSI6IjhlYjU0OGNkLWE4ZGItNGM4Ny1hYmRiLThjNWZlOTBiYTZkOSIsInNpZCI6IjQ0MzQxN2Q4LTc3ZGYtNDg5YS1hM2U0LTFjMTg4ZWNlNWM3YyJ9.6J2ZoDRSjyd1A3YPxmVCCYs1m76aPqXOS-Oc2sBwZEY",
  "access_expires_at": "2026-10-30T12:53:19.060890557Z",
  "refresh_token": "G0apGobXZNGCZEt-6il_iGWH54-vph26zzE-CInOc70",
  "refresh_expires_at": "2026-11-29T12:38:19.060400025Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "faf488d4-9e8d-400e-9066-ec11abfecf13",
  "session_id": "443417d8-77df-489a-a3e4-1c188ece5c7c",
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
  "session_id": "3d5fbc9a-3d65-4155-be03-14b95c5014f3",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ3OTksImlhdCI6MTc5MzM2Mzg5OSwianRpIjoiOGIxYzNiZTgtOGJkNC00NjYwLWFhNjQtNDhiYTQ1OWI5ZTU3Iiwic2lkIjoiM2Q1ZmJjOWEtM2Q2NS00MTU1LWJlMDMtMTRiOTVjNTAxNGYzIn0.jNhgGw_g43Mdyt11IyY12NdCmT4wJsGHUX6m1Ilmcek",
  "access_expires_at": "2026-10-30T12:53:19.905096773Z",
  "refresh_token": "2DupjXOFxqKuViTL6sOkkRyQlvA-41zVdm3UHtjn2LY",
  "refresh_expires_at": "2026-10-31T00:38:19.904593848Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=5078830&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "faf488d4-9e8d-400e-9066-ec11abfecf13",
      "phone": "+380665078830",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T12:38:19.05886Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/faf488d4-9e8d-400e-9066-ec11abfecf13` → **200**

```json
{
  "client": {
    "id": "faf488d4-9e8d-400e-9066-ec11abfecf13",
    "phone": "+380665078830",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T12:38:19.05886Z",
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

`POST /api/admin/v1/clients/faf488d4-9e8d-400e-9066-ec11abfecf13/block` → **400**

```json
{
  "command_id": "4b181535-e395-4f9f-8b56-65239418ce43",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/faf488d4-9e8d-400e-9066-ec11abfecf13/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "ccd9bf10-a158-41cc-8321-ab98996238d1",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/faf488d4-9e8d-400e-9066-ec11abfecf13/block` → **200**

```json
{
  "command_id": "29b041e6-d820-4daa-ad16-2171062eaec7",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "faf488d4-9e8d-400e-9066-ec11abfecf13",
  "phone": "+380665078830",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T12:38:19.05886Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T12:38:21.129832Z",
    "by": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
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
  "correlation_id": "0f09cb00-635a-4425-8ed2-ec2bf560d747"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665078830",
  "device_ref": "sandbox-999"
}
```

```json
{
  "challenge_id": "b7f1a9cd-0eac-483e-8a41-fbab8f8e9306",
  "expires_at": "2026-10-30T12:43:23.695455369Z",
  "resend_available_at": "2026-10-30T12:38:24.695455369Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665078830` → **200**

```json
{
  "phone": "+380665078830",
  "audience": "CLIENT",
  "code": "288601",
  "sent_at": "2026-10-30T12:38:23.698068698Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "b7f1a9cd-0eac-483e-8a41-fbab8f8e9306",
  "code": "288601",
  "device_ref": "sandbox-999"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "524603b5-a07d-4ec1-9983-bf338e795e5f"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/faf488d4-9e8d-400e-9066-ec11abfecf13` → **200**

```json
{
  "client": {
    "id": "faf488d4-9e8d-400e-9066-ec11abfecf13",
    "phone": "+380665078830",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T12:38:19.05886Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T12:38:21.129832Z",
      "by": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
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

`POST /api/admin/v1/clients/faf488d4-9e8d-400e-9066-ec11abfecf13/unblock` → **200**

```json
{
  "command_id": "ccb0de00-1e06-4fa3-b21f-6f0b035f8353",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "faf488d4-9e8d-400e-9066-ec11abfecf13",
  "phone": "+380665078830",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T12:38:19.05886Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665078830",
  "device_ref": "sandbox-4898"
}
```

```json
{
  "challenge_id": "2d93f48c-97ae-42cb-b214-1a29d391d587",
  "expires_at": "2026-10-30T12:43:26.923920189Z",
  "resend_available_at": "2026-10-30T12:38:27.923920189Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665078830` → **200**

```json
{
  "phone": "+380665078830",
  "audience": "CLIENT",
  "code": "729115",
  "sent_at": "2026-10-30T12:38:26.926606259Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2d93f48c-97ae-42cb-b214-1a29d391d587",
  "code": "729115",
  "device_ref": "sandbox-4898"
}
```

```json
{
  "session_id": "90a03198-c966-4129-9507-938174b459df",
  "subject": {
    "type": "CLIENT",
    "id": "faf488d4-9e8d-400e-9066-ec11abfecf13"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYWY0ODhkNC05ZThkLTQwMGUtOTA2Ni1lYzExYWJmZWNmMTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0ODA3LCJpYXQiOjE3OTMzNjM5MDcsImp0aSI6ImM4NGU0NTZkLWE4OTUtNDVjNy1iYzhjLTljMzNhYjQyZDY2MCIsInNpZCI6IjkwYTAzMTk4LWM5NjYtNDEyOS05NTA3LTkzODE3NGI0NTlkZiJ9.KwrPtE2cf_6iY3rDpPPwDyttD9izefzAsHBdXd1qacM",
  "access_expires_at": "2026-10-30T12:53:27.226830688Z",
  "refresh_token": "YYwwgb4Y69qPlyXvf8AscrKDzM756xTJVfxccTrL2qM",
  "refresh_expires_at": "2026-11-29T12:38:27.226321521Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "faf488d4-9e8d-400e-9066-ec11abfecf13",
  "session_id": "90a03198-c966-4129-9507-938174b459df",
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
  "phone": "+380667674570",
  "device_ref": "sandbox-29030"
}
```

```json
{
  "challenge_id": "94532eb7-1192-46b1-99c2-b151b4844112",
  "expires_at": "2026-10-30T12:43:27.790190762Z",
  "resend_available_at": "2026-10-30T12:38:28.790190762Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667674570` → **200**

```json
{
  "phone": "+380667674570",
  "audience": "CLIENT",
  "code": "943455",
  "sent_at": "2026-10-30T12:38:27.792781825Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "94532eb7-1192-46b1-99c2-b151b4844112",
  "code": "943455",
  "device_ref": "sandbox-29030"
}
```

```json
{
  "session_id": "b756b061-37f7-4055-b4c1-6abb5a3380a4",
  "subject": {
    "type": "CLIENT",
    "id": "77e1ba9c-b88d-4f86-a5ba-63de0b3bd79f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3N2UxYmE5Yy1iODhkLTRmODYtYTViYS02M2RlMGIzYmQ3OWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0ODA4LCJpYXQiOjE3OTMzNjM5MDgsImp0aSI6IjgyOGMxMGRjLTU3NjgtNDk0OC05ODg5LWJkY2FlNzdjODc5NCIsInNpZCI6ImI3NTZiMDYxLTM3ZjctNDA1NS1iNGMxLTZhYmI1YTMzODBhNCJ9.DCVnsNZGxPKMFSSSwM-M-gNuCW5xi0xtdjAx8gdRlDU",
  "access_expires_at": "2026-10-30T12:53:28.098362902Z",
  "refresh_token": "0jAgceRlCn0Y9uMGGcLp-360IOBz1D-1ONgGKNcIH9g",
  "refresh_expires_at": "2026-11-29T12:38:28.097839979Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c2b84bdc-b5f0-4593-b5f4-2eb1478da2a6",
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
  "id": "842ed774-0dc9-40bf-b5c1-43d653f5d203",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:43:28.377936Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: ba80e6bf-96bb-4509-a855-7e0c275f3fc8) → **201**

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
  "session_id": "6c7df9f0-a150-4ad6-996b-fe1d321bf2f5",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ4MDgsImlhdCI6MTc5MzM2MzkwOCwianRpIjoiZDU2YjJmYzQtOTkxNC00NWUzLTkzZmYtNmRlYmU5MjYwMjA0Iiwic2lkIjoiNmM3ZGY5ZjAtYTE1MC00YWQ2LTk5NmItZmUxZDMyMWJmMmY1In0.5sYIlwD0N46_V938C6tstr8zTwvjZk8XGDtxIiIf3dI",
  "access_expires_at": "2026-10-30T12:53:28.994112894Z",
  "refresh_token": "zKr0rQfa4MXUO0de0rzZVWhjlqzXNGVg2sTanuRqlXk",
  "refresh_expires_at": "2026-10-31T00:38:28.993600721Z",
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
  "session_id": "d000677d-366b-4e41-8dc2-4ee89064d530",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ4MDksImlhdCI6MTc5MzM2MzkwOSwianRpIjoiNGRjOWU3N2EtZDRjMy00MjYyLWI4ZDQtNTJmZjM2ODI0ZWI0Iiwic2lkIjoiZDAwMDY3N2QtMzY2Yi00ZTQxLThkYzItNGVlODkwNjRkNTMwIn0.xxo1N47Y_8FweaJPXn0uAHSY7vRuLHfmDL7tGEWGjoo",
  "access_expires_at": "2026-10-30T12:53:29.573158018Z",
  "refresh_token": "CSb-iQF6I9QepFc-rstma67ONtNC93w9QoO4cuJFW1k",
  "refresh_expires_at": "2026-10-31T00:38:29.572634755Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/bdea4dd3-8057-4c53-a184-3015179ef336/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T12:38:28.670402Z",
      "actor": {
        "type": "CLIENT",
        "id": "77e1ba9c-b88d-4f86-a5ba-63de0b3bd79f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "bdea4dd3-8057-4c53-a184-3015179ef336",
        "quote_id": "842ed774-0dc9-40bf-b5c1-43d653f5d203",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "ba80e6bf-96bb-4509-a855-7e0c275f3fc8"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T12:38:28.672565Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "bdea4dd3-8057-4c53-a184-3015179ef336",
        "attempt_id": "d48486e8-b594-4343-9257-b67d969914c2",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "ba80e6bf-96bb-4509-a855-7e0c275f3fc8"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T12:38:28.67949Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "bdea4dd3-8057-4c53-a184-3015179ef336",
        "attempt_id": "d48486e8-b594-4343-9257-b67d969914c2"
      },
      "correlation_id": "ba80e6bf-96bb-4509-a855-7e0c275f3fc8"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "d48486e8-b594-4343-9257-b67d969914c2",
        "generation": 1,
        "started_at": "2026-10-30T12:38:28.67161Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T12:38:28.67949Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T12:38:28.67321Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/ba80e6bf-96bb-4509-a855-7e0c275f3fc8` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "bdea4dd3-8057-4c53-a184-3015179ef336:0",
      "order_id": "bdea4dd3-8057-4c53-a184-3015179ef336",
      "at": "2026-10-30T12:38:28.670402Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "bdea4dd3-8057-4c53-a184-3015179ef336:1",
      "order_id": "bdea4dd3-8057-4c53-a184-3015179ef336",
      "at": "2026-10-30T12:38:28.672565Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "bdea4dd3-8057-4c53-a184-3015179ef336:2",
      "order_id": "bdea4dd3-8057-4c53-a184-3015179ef336",
      "at": "2026-10-30T12:38:28.67949Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/9170c47b-65e1-4b5a-9dec-bdcd5bfc3b81` → **200**

```json
{
  "found": []
}
```

Done: request ba80e6bf-96bb-4509-a855-7e0c275f3fc8 — order bdea4dd3-8057-4c53-a184-3015179ef336 found by its id.

`GET /api/rider/v1/orders/bdea4dd3-8057-4c53-a184-3015179ef336` → **200**

```json
{
  "id": "bdea4dd3-8057-4c53-a184-3015179ef336",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "77e1ba9c-b88d-4f86-a5ba-63de0b3bd79f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:38:28.669864Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/bdea4dd3-8057-4c53-a184-3015179ef336/cancel` → **200**

```json
{
  "command_id": "3267cb49-95da-453b-9e8f-766ee300157a",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "bdea4dd3-8057-4c53-a184-3015179ef336",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "77e1ba9c-b88d-4f86-a5ba-63de0b3bd79f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:38:28.669864Z",
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
  "phone": "+380638048220",
  "device_ref": "sandbox-20935"
}
```

```json
{
  "challenge_id": "a82fa5e2-2f1b-4bbf-95d7-414fc3de9907",
  "expires_at": "2026-10-30T12:43:31.326137955Z",
  "resend_available_at": "2026-10-30T12:38:32.326137955Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638048220` → **200**

```json
{
  "phone": "+380638048220",
  "audience": "CLIENT",
  "code": "227425",
  "sent_at": "2026-10-30T12:38:31.328850681Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a82fa5e2-2f1b-4bbf-95d7-414fc3de9907",
  "code": "227425",
  "device_ref": "sandbox-20935"
}
```

```json
{
  "session_id": "01ab45ea-01a2-41c7-a673-998ba5c8adfb",
  "subject": {
    "type": "CLIENT",
    "id": "97f93c7f-007c-4d37-b7e3-1dde59bded8d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5N2Y5M2M3Zi0wMDdjLTRkMzctYjdlMy0xZGRlNTliZGVkOGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0ODExLCJpYXQiOjE3OTMzNjM5MTEsImp0aSI6IjliNmJiNDYxLTJlMWMtNGUxOS1hZDhlLTU0OTAzYzg3YzU0YyIsInNpZCI6IjAxYWI0NWVhLTAxYTItNDFjNy1hNjczLTk5OGJhNWM4YWRmYiJ9.7oHYKyHu0zYlr7xEm55PDfMa5fOVcMP6Do2J5OQuRcM",
  "access_expires_at": "2026-10-30T12:53:31.628297851Z",
  "refresh_token": "VFmHN_MjsWcdlkLWNijP1KUrOzVyfOgJx4wJ__0UpgQ",
  "refresh_expires_at": "2026-11-29T12:38:31.627684476Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "fc6bf887-565d-4c3a-ba47-8d04e71f5bfc",
  "expires_at": "2026-10-30T12:43:33.916622773Z",
  "resend_available_at": "2026-10-30T12:38:34.916622773Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638048220` → **200**

```json
{
  "phone": "+380638048220",
  "audience": "CLIENT",
  "code": "105249",
  "sent_at": "2026-10-30T12:38:33.919177753Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "f29dce0f-fd51-4193-988c-2cfd32d0bf04",
  "challenge_id": "fc6bf887-565d-4c3a-ba47-8d04e71f5bfc",
  "otp_code": "105249"
}
```

```json
{
  "id": "6a3ddf51-8784-4b8d-b087-063be4c80e1d",
  "state": "PENDING",
  "created_at": "2026-10-30T12:38:34.229247Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/6a3ddf51-8784-4b8d-b087-063be4c80e1d` → **200**

```json
{
  "id": "6a3ddf51-8784-4b8d-b087-063be4c80e1d",
  "state": "PENDING",
  "created_at": "2026-10-30T12:38:34.229247Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/6a3ddf51-8784-4b8d-b087-063be4c80e1d` → **200**

```json
{
  "id": "6a3ddf51-8784-4b8d-b087-063be4c80e1d",
  "state": "PENDING",
  "created_at": "2026-10-30T12:38:34.229247Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/6a3ddf51-8784-4b8d-b087-063be4c80e1d` → **200**

```json
{
  "id": "6a3ddf51-8784-4b8d-b087-063be4c80e1d",
  "state": "PENDING",
  "created_at": "2026-10-30T12:38:34.229247Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/6a3ddf51-8784-4b8d-b087-063be4c80e1d` → **200**

```json
{
  "id": "6a3ddf51-8784-4b8d-b087-063be4c80e1d",
  "state": "PENDING",
  "created_at": "2026-10-30T12:38:34.229247Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/6a3ddf51-8784-4b8d-b087-063be4c80e1d` → **200**

```json
{
  "id": "6a3ddf51-8784-4b8d-b087-063be4c80e1d",
  "state": "PENDING",
  "created_at": "2026-10-30T12:38:34.229247Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/6a3ddf51-8784-4b8d-b087-063be4c80e1d` → **200**

```json
{
  "id": "6a3ddf51-8784-4b8d-b087-063be4c80e1d",
  "state": "PENDING",
  "created_at": "2026-10-30T12:38:34.229247Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/6a3ddf51-8784-4b8d-b087-063be4c80e1d` → **200**

```json
{
  "id": "6a3ddf51-8784-4b8d-b087-063be4c80e1d",
  "state": "PENDING",
  "created_at": "2026-10-30T12:38:34.229247Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/6a3ddf51-8784-4b8d-b087-063be4c80e1d` → **200**

```json
{
  "id": "6a3ddf51-8784-4b8d-b087-063be4c80e1d",
  "state": "PENDING",
  "created_at": "2026-10-30T12:38:34.229247Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/6a3ddf51-8784-4b8d-b087-063be4c80e1d` → **200**

```json
{
  "id": "6a3ddf51-8784-4b8d-b087-063be4c80e1d",
  "state": "READY",
  "created_at": "2026-10-30T12:38:34.229247Z",
  "ready_at": "2026-10-30T12:38:44.138373Z",
  "expires_at": "2026-11-06T12:38:44.138373Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/6a3ddf51-8784-4b8d-b087-063be4c80e1d/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638068073",
  "device_ref": "sandbox-30904"
}
```

```json
{
  "challenge_id": "2e45f4a5-d337-4e29-a185-702682b41788",
  "expires_at": "2026-10-30T12:43:45.043143499Z",
  "resend_available_at": "2026-10-30T12:38:46.043143499Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638068073` → **200**

```json
{
  "phone": "+380638068073",
  "audience": "CLIENT",
  "code": "358567",
  "sent_at": "2026-10-30T12:38:45.046213057Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2e45f4a5-d337-4e29-a185-702682b41788",
  "code": "358567",
  "device_ref": "sandbox-30904"
}
```

```json
{
  "session_id": "d88fefec-f123-4aaf-9edf-794579a5f884",
  "subject": {
    "type": "CLIENT",
    "id": "a9c78bfe-0901-4866-8685-0e07d422eb21"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWM3OGJmZS0wOTAxLTQ4NjYtODY4NS0wZTA3ZDQyMmViMjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0ODI1LCJpYXQiOjE3OTMzNjM5MjUsImp0aSI6ImQ3ODQxYzE3LThhMWItNGJmZS05ZGY1LTJiNzg0YzI3MWFhYiIsInNpZCI6ImQ4OGZlZmVjLWYxMjMtNGFhZi05ZWRmLTc5NDU3OWE1Zjg4NCJ9.YOlicWhpvHv4kdjZjQYGY85l4zEqRn_VIiIsLFhPsRg",
  "access_expires_at": "2026-10-30T12:53:45.346475399Z",
  "refresh_token": "YOFdlQNhiM9kVNeEMizzizCYWlLy4e-ulZ2c9U9fe8I",
  "refresh_expires_at": "2026-11-29T12:38:45.345914545Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/6a3ddf51-8784-4b8d-b087-063be4c80e1d/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/6a3ddf51-8784-4b8d-b087-063be4c80e1d/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cd18485a-2d16-4396-9b5f-c21b14d44aeb"
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
  "session_id": "0049a022-cd53-4467-8d57-5aaebc11ed40",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ4MjYsImlhdCI6MTc5MzM2MzkyNiwianRpIjoiMjA1N2RlZGEtNzdkMi00OTBhLWI4NGEtMWRiMzE2MmU3OWU2Iiwic2lkIjoiMDA0OWEwMjItY2Q1My00NDY3LThkNTctNWFhZWJjMTFlZDQwIn0.STbZyyoo6jYC3syrNtiHcVD0T9HUmSFabv6mTStxfs8",
  "access_expires_at": "2026-10-30T12:53:46.179414379Z",
  "refresh_token": "ZDP0iVHFwuBE_x4sqOfqPw0BGMEFFZ1ob5ld9IwBccA",
  "refresh_expires_at": "2026-10-31T00:38:46.178854908Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "97f93c7f-007c-4d37-b7e3-1dde59bded8d",
  "session_id": "01ab45ea-01a2-41c7-a673-998ba5c8adfb",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/97f93c7f-007c-4d37-b7e3-1dde59bded8d/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "6a3ddf51-8784-4b8d-b087-063be4c80e1d",
      "state": "READY",
      "created_at": "2026-10-30T12:38:34.229247Z",
      "ready_at": "2026-10-30T12:38:44.138373Z",
      "expires_at": "2026-11-06T12:38:44.138373Z",
      "size_bytes": 1031
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
  "device_ref": "sandbox-3120"
}
```

```json
{
  "challenge_id": "ef58cfdb-9a00-4413-a9b2-8e28ad6de13d",
  "expires_at": "2026-10-30T12:43:47.015959779Z",
  "resend_available_at": "2026-10-30T12:38:48.015959779Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "743362",
  "sent_at": "2026-10-30T12:38:47.018980633Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ef58cfdb-9a00-4413-a9b2-8e28ad6de13d",
  "code": "743362",
  "device_ref": "sandbox-3120"
}
```

```json
{
  "session_id": "64eb3894-b88f-40b7-8b64-827898af457b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDgyNywiaWF0IjoxNzkzMzYzOTI3LCJqdGkiOiJlMjUxNjRhNi01MDQ5LTQyZTItYWQ5Ni0wMTg0OWU2NTUxMTIiLCJzaWQiOiI2NGViMzg5NC1iODhmLTQwYjctOGI2NC04Mjc4OThhZjQ1N2IifQ.v4iBwS8rk1rT6F1essUF5unCs4OA_TxDbVFHEGXFheQ",
  "access_expires_at": "2026-10-30T12:53:47.330900498Z",
  "refresh_token": "tKZXEPjVZcqKTFVitPQ-FfW_kmVwb_74gSBL7WoZTNI",
  "refresh_expires_at": "2026-11-29T12:38:47.330332391Z",
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
  "device_ref": "sandbox-5585"
}
```

```json
{
  "challenge_id": "e2f0eabf-b822-42d5-bd22-2e67ef2cb8c7",
  "expires_at": "2026-10-30T12:43:47.88989503Z",
  "resend_available_at": "2026-10-30T12:38:48.88989503Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "829958",
  "sent_at": "2026-10-30T12:38:47.8929536Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e2f0eabf-b822-42d5-bd22-2e67ef2cb8c7",
  "code": "829958",
  "device_ref": "sandbox-5585"
}
```

```json
{
  "session_id": "674cd1ff-14d7-4ef2-b854-53e2ecb5d725",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDgyOCwiaWF0IjoxNzkzMzYzOTI4LCJqdGkiOiI5Y2U3NTkwMC0zMWVmLTRiODAtOWY2My1kYWUzYzY0MDViMmQiLCJzaWQiOiI2NzRjZDFmZi0xNGQ3LTRlZjItYjg1NC01M2UyZWNiNWQ3MjUifQ.TYsTgrADX-ApoxQ4Zejn2DJOKjFVaoTbWhr4IS7LKQM",
  "access_expires_at": "2026-10-30T12:53:48.192420058Z",
  "refresh_token": "_RljsW2A3aX0cPMFSieY9nIarZsXGCDgw-1TFm52vig",
  "refresh_expires_at": "2026-11-29T12:38:48.191901754Z",
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
  "command_id": "6d9c47ac-9143-410e-85a8-f72abb9ef5da",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:38:48Z",
    "sequence": 1793363928747
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "36db5258-5cdd-4973-b05c-21e88c12829e",
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
  "last_heartbeat_at": "2026-10-30T12:38:48.765688Z",
  "last_location_at": "2026-10-30T12:38:48.765688Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-24817"
}
```

```json
{
  "challenge_id": "968adcc7-628f-421d-9d43-547c8d63d7ae",
  "expires_at": "2026-10-30T12:43:49.047150191Z",
  "resend_available_at": "2026-10-30T12:38:50.047150191Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "211362",
  "sent_at": "2026-10-30T12:38:49.049897776Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "968adcc7-628f-421d-9d43-547c8d63d7ae",
  "code": "211362",
  "device_ref": "sandbox-24817"
}
```

```json
{
  "session_id": "28852b74-0c2d-4412-aeca-117ce4170a8c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDgyOSwiaWF0IjoxNzkzMzYzOTI5LCJqdGkiOiJkODJjNjczOC1hNjc4LTQwYTUtYjEwZS00ODIxY2Q0NTczNTAiLCJzaWQiOiIyODg1MmI3NC0wYzJkLTQ0MTItYWVjYS0xMTdjZTQxNzBhOGMifQ.imfYLmaoBAVLoBcf7SxORTi_waCdDAu7T3W4_lDE7_I",
  "access_expires_at": "2026-10-30T12:53:49.356432529Z",
  "refresh_token": "vIcmM2o27gYPQkBx1nLec6Jo1GKptGvCjv0PmiYH1O8",
  "refresh_expires_at": "2026-11-29T12:38:49.35591686Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a1c34f21-015a-417d-8e2a-b52bf2a2e104",
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
  "last_heartbeat_at": "2026-10-30T12:37:11.110573Z",
  "last_location_at": "2026-10-30T12:37:11.110573Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a1c34f21-015a-417d-8e2a-b52bf2a2e104/handover` → **200**

```json
{
  "command_id": "501d5e0d-9589-4e81-9035-937c2829fbed",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a1c34f21-015a-417d-8e2a-b52bf2a2e104",
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
  "last_heartbeat_at": "2026-10-30T12:37:11.110573Z",
  "last_location_at": "2026-10-30T12:37:11.110573Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a1c34f21-015a-417d-8e2a-b52bf2a2e104/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:38:50Z",
    "sequence": 1793363930226
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a1c34f21-015a-417d-8e2a-b52bf2a2e104",
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
  "last_heartbeat_at": "2026-10-30T12:38:50.245345Z",
  "last_location_at": "2026-10-30T12:38:50.245345Z",
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
  "session_id": "c6092302-c456-44a3-915c-41d3ae608f35",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ4MzAsImlhdCI6MTc5MzM2MzkzMCwianRpIjoiNzAwNGU5ZTMtM2FmMi00MjhmLTg3YjMtN2UwMDE4YzliY2IwIiwic2lkIjoiYzYwOTIzMDItYzQ1Ni00NGEzLTkxNWMtNDFkM2FlNjA4ZjM1In0.4eywllvHPq5iYKcdyzb7tLIIgoYDVDZgmWnmfcYxOW4",
  "access_expires_at": "2026-10-30T12:53:50.816532746Z",
  "refresh_token": "q4MOJDyXwru99ZZqlhJe9DaUZXLtDba9d26tkEfqjJ0",
  "refresh_expires_at": "2026-10-31T00:38:50.815962741Z",
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
  "session_id": "101293a0-0c04-470a-a37d-f2dab691d555",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ4MzEsImlhdCI6MTc5MzM2MzkzMSwianRpIjoiODhlMGIzZGUtNTJhNy00OTM0LWJhZWMtMDVjMDNiMWI0NzUyIiwic2lkIjoiMTAxMjkzYTAtMGMwNC00NzBhLWEzN2QtZjJkYWI2OTFkNTU1In0.8vvkOkpfYUJQJqdwDE1GkRSit5YCb1mHXHKGqWpQMAQ",
  "access_expires_at": "2026-10-30T12:53:51.388342223Z",
  "refresh_token": "Z1SXeNLcd4iM1nL0UU5AKC17TEyVs5nMTuc94umjC18",
  "refresh_expires_at": "2026-10-31T00:38:51.387743569Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380682784517",
  "device_ref": "sandbox-756"
}
```

```json
{
  "challenge_id": "6e841621-5007-4554-be3e-20b14f6818d2",
  "expires_at": "2026-10-30T12:43:51.665999124Z",
  "resend_available_at": "2026-10-30T12:38:52.665999124Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380682784517` → **200**

```json
{
  "phone": "+380682784517",
  "audience": "CLIENT",
  "code": "354356",
  "sent_at": "2026-10-30T12:38:51.669465196Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6e841621-5007-4554-be3e-20b14f6818d2",
  "code": "354356",
  "device_ref": "sandbox-756"
}
```

```json
{
  "session_id": "ec90d972-9d74-4158-846e-1cbf31a2bd84",
  "subject": {
    "type": "CLIENT",
    "id": "40ff32ae-30a8-48c8-b00d-280ce0d7b387"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MGZmMzJhZS0zMGE4LTQ4YzgtYjAwZC0yODBjZTBkN2IzODciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0ODMxLCJpYXQiOjE3OTMzNjM5MzEsImp0aSI6ImQyYTYwMWMyLTBhMGItNDg2My1iNmM4LTRhMmIyOWY5MjdjNCIsInNpZCI6ImVjOTBkOTcyLTlkNzQtNDE1OC04NDZlLTFjYmYzMWEyYmQ4NCJ9.Jr69MeuU2_e2rmVdnZCeoPjCEXTf4guAYHRzLl8MfXY",
  "access_expires_at": "2026-10-30T12:53:51.976811002Z",
  "refresh_token": "AhH6EfY2nTJu5Dv6WNBYCOZriVzgrRDMwJQ6mLTZia0",
  "refresh_expires_at": "2026-11-29T12:38:51.976259245Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4c6e5d12-5bd6-4d0a-b1c6-d5413334ee33",
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
  "id": "d8dc95f2-aa9a-4ee5-a216-86cd9f4e3c18",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:43:52.262723Z",
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
  "command_id": "9013dc0d-2b25-4914-8427-ab32ff45f83f",
  "quote_id": "d8dc95f2-aa9a-4ee5-a216-86cd9f4e3c18",
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
  "id": "64424f8b-7c94-4e35-88e5-d685b00b6058",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "40ff32ae-30a8-48c8-b00d-280ce0d7b387",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:38:52.551318Z",
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
    "id": "f2c29b8c-e4d6-4493-b54b-bfd78cc5c0db",
    "order_id": "64424f8b-7c94-4e35-88e5-d685b00b6058",
    "expires_at": "2026-10-30T12:39:07.554494Z",
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

`POST /api/driver/v1/offers/f2c29b8c-e4d6-4493-b54b-bfd78cc5c0db/reject` → **204**

```json
{
  "command_id": "4dc30f04-1b37-4fde-9dc1-22d149171311"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "9a48969a-cbb9-485e-9347-7367811c53fa",
    "order_id": "64424f8b-7c94-4e35-88e5-d685b00b6058",
    "expires_at": "2026-10-30T12:39:08.146512Z",
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

`POST /api/driver/v1/offers/9a48969a-cbb9-485e-9347-7367811c53fa/accept` → **200**

```json
{
  "command_id": "0f433dd5-3774-4af9-bc83-ef8814dd3e87"
}
```

```json
{
  "id": "436222de-4a53-42a0-a7c4-a73aea39092e",
  "order_id": "64424f8b-7c94-4e35-88e5-d685b00b6058",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f6920baa-dac2-4d22-b657-cf535eaf9200",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/64424f8b-7c94-4e35-88e5-d685b00b6058/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T12:38:52.551879Z",
      "actor": {
        "type": "CLIENT",
        "id": "40ff32ae-30a8-48c8-b00d-280ce0d7b387",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "64424f8b-7c94-4e35-88e5-d685b00b6058",
        "quote_id": "d8dc95f2-aa9a-4ee5-a216-86cd9f4e3c18",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "6b754afa-56e5-4895-9733-61530af27c74"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T12:38:52.553774Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "64424f8b-7c94-4e35-88e5-d685b00b6058",
        "attempt_id": "00440d07-b2d4-4a42-99ab-bb85ed7f24b1",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "6b754afa-56e5-4895-9733-61530af27c74"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T12:38:52.556494Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f2c29b8c-e4d6-4493-b54b-bfd78cc5c0db",
        "order_id": "64424f8b-7c94-4e35-88e5-d685b00b6058",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "6b754afa-56e5-4895-9733-61530af27c74"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T12:38:53.145562Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f2c29b8c-e4d6-4493-b54b-bfd78cc5c0db",
        "order_id": "64424f8b-7c94-4e35-88e5-d685b00b6058"
      },
      "correlation_id": "a7049b67-6973-4ed5-80bf-b3fd6003afae"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 64424f8b-7c94-4e35-88e5-d685b00b6058 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/64424f8b-7c94-4e35-88e5-d685b00b6058` → **200**

```json
{
  "id": "64424f8b-7c94-4e35-88e5-d685b00b6058",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "40ff32ae-30a8-48c8-b00d-280ce0d7b387",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "436222de-4a53-42a0-a7c4-a73aea39092e",
    "order_id": "64424f8b-7c94-4e35-88e5-d685b00b6058",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "f6920baa-dac2-4d22-b657-cf535eaf9200",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T12:38:52.551318Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/64424f8b-7c94-4e35-88e5-d685b00b6058/cancel` → **200**

```json
{
  "command_id": "c19eac0a-e4de-41e4-9629-7ac17cd22919",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "64424f8b-7c94-4e35-88e5-d685b00b6058",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "40ff32ae-30a8-48c8-b00d-280ce0d7b387",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "436222de-4a53-42a0-a7c4-a73aea39092e",
    "order_id": "64424f8b-7c94-4e35-88e5-d685b00b6058",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "f6920baa-dac2-4d22-b657-cf535eaf9200",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T12:38:52.551318Z",
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
  "session_id": "36db5258-5cdd-4973-b05c-21e88c12829e",
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
  "last_heartbeat_at": "2026-10-30T12:38:48.765688Z",
  "last_location_at": "2026-10-30T12:38:48.765688Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/36db5258-5cdd-4973-b05c-21e88c12829e/close` → **200**

```json
{
  "command_id": "7d50e967-b572-401e-afac-6cd145236df9",
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
  "session_id": "a1c34f21-015a-417d-8e2a-b52bf2a2e104",
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
  "last_heartbeat_at": "2026-10-30T12:38:50.245345Z",
  "last_location_at": "2026-10-30T12:38:50.245345Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a1c34f21-015a-417d-8e2a-b52bf2a2e104/close` → **200**

```json
{
  "command_id": "d88a0f49-0ed1-4c31-8f04-f313224e2a86",
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
  "device_ref": "sandbox-15993"
}
```

```json
{
  "challenge_id": "2172c9fd-a491-4cd4-9e4c-42efff830dca",
  "expires_at": "2026-10-30T12:43:55.918002128Z",
  "resend_available_at": "2026-10-30T12:38:56.918002128Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "541152",
  "sent_at": "2026-10-30T12:38:55.921241174Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2172c9fd-a491-4cd4-9e4c-42efff830dca",
  "code": "541152",
  "device_ref": "sandbox-15993"
}
```

```json
{
  "session_id": "ad18c3b9-863a-4346-8257-656c6a95fa85",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDgzNiwiaWF0IjoxNzkzMzYzOTM2LCJqdGkiOiIyMmY4NmExYS1hYmIwLTQ4NjgtYmIzMy0zNDNhZGIwYWQ0NTAiLCJzaWQiOiJhZDE4YzNiOS04NjNhLTQzNDYtODI1Ny02NTZjNmE5NWZhODUifQ.lIvAnNnpOrWGXcdDUiPv3Js8-T7vt70yT8-QAklWPsE",
  "access_expires_at": "2026-10-30T12:53:56.214901945Z",
  "refresh_token": "fE-QXK8X6l5J-jSs4greyXiNnzp8Fnr0NlG1nQtmBow",
  "refresh_expires_at": "2026-11-29T12:38:56.214373121Z",
  "account_created": false
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "79bd0b23-d1c0-4f8a-bb61-429a06670ff4",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "a71b5b92-f852-4ae7-ac64-92313aef54f0",
  "upload_path": "/api/driver/v1/uploads/a71b5b92-f852-4ae7-ac64-92313aef54f0",
  "expires_at": "2026-10-30T12:53:56.508666267Z",
  "max_bytes": 86
}
```

`PUT /api/driver/v1/uploads/a71b5b92-f852-4ae7-ac64-92313aef54f0` → **200**

```json
{
  "file_id": "a71b5b92-f852-4ae7-ac64-92313aef54f0",
  "state": "SAFE",
  "content_type": "application/pdf",
  "size_bytes": 86,
  "reject_reason": null
}
```

## On the server's disk the file is not the PDF

Stored at `driver_document/2026-10/a71b5b92-f852-4ae7-ac64-92313aef54f0`, first bytes `425a4631f37b2f30` (plain: `255044462d312e37` = %PDF-1.7).

## His download is exactly what he uploaded

`GET /api/driver/v1/files/a71b5b92-f852-4ae7-ac64-92313aef54f0` → **200**

SHA-256 uploaded `54f5798d5006396f73898c7acbbcc5eb5f933d7c48f3c0e0b6855e6527e6c549`, downloaded `54f5798d5006396f73898c7acbbcc5eb5f933d7c48f3c0e0b6855e6527e6c549`.

Done: document a71b5b92-f852-4ae7-ac64-92313aef54f0 is encrypted on disk and downloads unchanged.

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
  "session_id": "72320fb6-6c81-447d-9509-52ec54d0b7b6",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ4MzcsImlhdCI6MTc5MzM2MzkzNywianRpIjoiOTczNzFjYmMtMjUxMy00ZTQ1LTg4ZWQtOTY4M2M1ZDhhODBhIiwic2lkIjoiNzIzMjBmYjYtNmM4MS00NDdkLTk1MDktNTJlYzU0ZDBiN2I2In0.rSdsMdK27A-Szs69cMr0uzoEyz1UOFVe_nyxd6lSi1Y",
  "access_expires_at": "2026-10-30T12:53:57.156064887Z",
  "refresh_token": "sph7Pp-2y_RifRIYDM3BVkmBciQX-l1kTrHQnG02Qn4",
  "refresh_expires_at": "2026-10-31T00:38:57.155554358Z",
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
  "command_id": "20030b06-f030-4806-9828-a08fa6ee13ec",
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
  "changed_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T12:38:57.74769Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "0af5f093-fbec-40d4-971e-3ea13c719358",
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
  "correlation_id": "94f11ad3-d90c-4461-89ac-b0344f9ed765"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "c1f524be-35f0-47ba-8006-2ab48e8ebabf",
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
  "correlation_id": "1baf65f3-d48f-4b85-9029-9a8980f26651"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635700751",
  "device_ref": "sandbox-14138"
}
```

```json
{
  "challenge_id": "f3c5cfb3-a21e-4401-819f-1d9526a2df70",
  "expires_at": "2026-10-30T12:43:58.628506785Z",
  "resend_available_at": "2026-10-30T12:38:59.628506785Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635700751` → **200**

```json
{
  "phone": "+380635700751",
  "audience": "CLIENT",
  "code": "492044",
  "sent_at": "2026-10-30T12:38:58.631317554Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f3c5cfb3-a21e-4401-819f-1d9526a2df70",
  "code": "492044",
  "device_ref": "sandbox-14138"
}
```

```json
{
  "session_id": "d16254b1-3f82-47d6-9b2b-11fff420e40c",
  "subject": {
    "type": "CLIENT",
    "id": "b486d547-4d67-4a59-b143-a04d96de4667"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDg2ZDU0Ny00ZDY3LTRhNTktYjE0My1hMDRkOTZkZTQ2NjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0ODM4LCJpYXQiOjE3OTMzNjM5MzgsImp0aSI6IjIyOGY4MmY4LTQ3NDAtNDRlNi04MWQ4LTQ5YzUwZjhhMzYxNiIsInNpZCI6ImQxNjI1NGIxLTNmODItNDdkNi05YjJiLTExZmZmNDIwZTQwYyJ9.x3E60X-gMRlBe2CfvwnrwzmffEu___3N7Jm5xygD2TQ",
  "access_expires_at": "2026-10-30T12:53:58.933902496Z",
  "refresh_token": "3H2FZQJVihQv-5E-JULjZ9136Yup1UZtYa91zn6wVMg",
  "refresh_expires_at": "2026-11-29T12:38:58.93334049Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6cf369b5-e742-4862-bad5-3bff34029c8e",
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
  "id": "a72822ab-2794-43c7-bab5-a29bbb48cd46",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:43:59.210667Z",
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
  "command_id": "da8e4ae3-7128-4783-a530-0e90cb0e3e99",
  "quote_id": "a72822ab-2794-43c7-bab5-a29bbb48cd46",
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
  "correlation_id": "f5df06fc-8445-4561-bd28-a1695b424d83"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ba7b72c4-b641-4c9c-8b54-8f41b8748821",
  "quote_id": "a72822ab-2794-43c7-bab5-a29bbb48cd46",
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
  "id": "3b26ea15-3c14-498d-a825-f3e0ca3fbe5f",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b486d547-4d67-4a59-b143-a04d96de4667",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:38:59.808822Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3b26ea15-3c14-498d-a825-f3e0ca3fbe5f/cancel` → **200**

```json
{
  "command_id": "6ed37228-4a9c-4b21-b0ce-425b4e6c28f9",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3b26ea15-3c14-498d-a825-f3e0ca3fbe5f",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b486d547-4d67-4a59-b143-a04d96de4667",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:38:59.808822Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The incident is over: card payments are back on

`POST /api/admin/v1/feature-flags/card-payments/change` → **200**

```json
{
  "command_id": "98389bba-d6fd-4e0c-aa2d-475b0f2b78a3",
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
  "changed_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T12:39:00.429467Z"
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
      "changed_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T12:39:00.429467Z"
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
  "device_ref": "sandbox-17386"
}
```

```json
{
  "challenge_id": "83b4a1e5-5265-42a6-841f-1bc4c54eabb0",
  "expires_at": "2026-10-30T12:44:01.312878325Z",
  "resend_available_at": "2026-10-30T12:39:02.312878325Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "402861",
  "sent_at": "2026-10-30T12:39:01.316840374Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "83b4a1e5-5265-42a6-841f-1bc4c54eabb0",
  "code": "402861",
  "device_ref": "sandbox-17386"
}
```

```json
{
  "session_id": "c48a2c3a-74cf-4709-a806-0d88faf6aee7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDg0MSwiaWF0IjoxNzkzMzYzOTQxLCJqdGkiOiJkOWUyODMwOC05NjM1LTQ3MDYtOTU2Zi1jN2JiMjk1ZDhlNmIiLCJzaWQiOiJjNDhhMmMzYS03NGNmLTQ3MDktYTgwNi0wZDg4ZmFmNmFlZTcifQ._HQgiQdfY9ItdNH1mw9HNuwdqfGgOwF2kmro2Wv0tug",
  "access_expires_at": "2026-10-30T12:54:01.640304945Z",
  "refresh_token": "aaR_qf0OMbhG4adKvPkdTuWQj9-LrNaBiGZR-ajtfKg",
  "refresh_expires_at": "2026-11-29T12:39:01.639475542Z",
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
  "command_id": "cb6fabe7-1587-47a8-aa1d-ead6b8be2f57",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:39:02Z",
    "sequence": 1793363942221
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d87dc7df-5be7-41e6-aad3-d0a5153d76bb",
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
  "last_heartbeat_at": "2026-10-30T12:39:02.239614Z",
  "last_location_at": "2026-10-30T12:39:02.239614Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673652676",
  "device_ref": "sandbox-14579"
}
```

```json
{
  "challenge_id": "99c4d55f-4c53-472e-a0a2-455fb20908b1",
  "expires_at": "2026-10-30T12:44:02.518521359Z",
  "resend_available_at": "2026-10-30T12:39:03.518521359Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673652676` → **200**

```json
{
  "phone": "+380673652676",
  "audience": "CLIENT",
  "code": "789367",
  "sent_at": "2026-10-30T12:39:02.521064871Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "99c4d55f-4c53-472e-a0a2-455fb20908b1",
  "code": "789367",
  "device_ref": "sandbox-14579"
}
```

```json
{
  "session_id": "8c427bae-0615-450d-9949-54f049894efa",
  "subject": {
    "type": "CLIENT",
    "id": "96e79073-fec9-4d3b-9136-59e6a0021108"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NmU3OTA3My1mZWM5LTRkM2ItOTEzNi01OWU2YTAwMjExMDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0ODQyLCJpYXQiOjE3OTMzNjM5NDIsImp0aSI6IjExNjdjY2I4LTg5YzItNDk1NC1iZTQ5LWViY2Y0ZjMzZTcyYyIsInNpZCI6IjhjNDI3YmFlLTA2MTUtNDUwZC05OTQ5LTU0ZjA0OTg5NGVmYSJ9.ByQPVBezQdu9P0AFF4BsbUxOQvfMFvvsuMBElNDlvwo",
  "access_expires_at": "2026-10-30T12:54:02.819251146Z",
  "refresh_token": "CvV2Zkjqr0GaEJsQUYNIY446s-6VwMBFyj1t8M4NxIg",
  "refresh_expires_at": "2026-11-29T12:39:02.818695131Z",
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
  "command_id": "a233e69f-44cb-46e7-bb84-9ec3cebee66a",
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
  "id": "d4018c2f-9ff7-47f2-93ae-e168646dc7e8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:44:03.384040Z",
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
  "command_id": "093223f8-2e90-4fbe-912a-4889027de9c2",
  "platform": "ANDROID",
  "token": "sandbox-driver-2d54b687-c096-4009-83d9-4c130ccab140"
}
```

```json
{
  "id": "1a0363b2-8024-4745-aaf6-9b06ba194463",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T12:39:03.681441Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "b74e07bb-67bf-4ee8-ad69-3cdfeed469d8",
  "platform": "ANDROID",
  "token": "sandbox-rider-3bf19cf3-99fa-423b-bb05-ff8d14edb8b7"
}
```

```json
{
  "id": "d4df6b26-9dbc-423b-b2bb-5189a9a57db4",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T12:39:03.967904Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "15ae4583-1fbd-48ab-99a7-273055ec8c41",
  "quote_id": "d4018c2f-9ff7-47f2-93ae-e168646dc7e8",
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
  "id": "5a6472ce-a871-45cc-b4df-966fcba4189b",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "96e79073-fec9-4d3b-9136-59e6a0021108",
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
  "created_at": "2026-10-30T12:39:04.286136Z",
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
    "id": "927f8bfc-29dd-410e-8e85-c749be9b534f",
    "order_id": "5a6472ce-a871-45cc-b4df-966fcba4189b",
    "expires_at": "2026-10-30T12:39:19.289538Z",
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

`POST /api/driver/v1/offers/927f8bfc-29dd-410e-8e85-c749be9b534f/accept` → **200**

```json
{
  "command_id": "92da1839-fa22-46b0-a23e-75b3e62ca916"
}
```

```json
{
  "id": "e55c9991-db5f-4864-ba1d-2cf589a59b56",
  "order_id": "5a6472ce-a871-45cc-b4df-966fcba4189b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "83dfaecf-7b91-4c84-b59d-be7f196066a7",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T12:39:04.260Z` → **200**

```json
[
  {
    "at": "2026-10-30T12:39:04.716907637Z",
    "token_suffix": "cab140",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "event_id": "075a289b-0a4e-4712-ac66-655022901585",
      "order_version": "2",
      "order_id": "5a6472ce-a871-45cc-b4df-966fcba4189b",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380673652676&after=2026-10-30T12:39:04.260Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380673652676&after=2026-10-30T12:39:04.260Z` → **200**

```json
[
  {
    "at": "2026-10-30T12:39:05.722402736Z",
    "token_suffix": "edb8b7",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "event_id": "cd321dc6-b782-4905-ab1d-33f031a60c4d",
      "order_version": "3",
      "order_id": "5a6472ce-a871-45cc-b4df-966fcba4189b",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/5a6472ce-a871-45cc-b4df-966fcba4189b/messages` → **201**

```json
{
  "command_id": "ae375f5a-b56c-45bd-b31f-445397df4cbd",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "b3feaf23-57b2-4820-b1d1-ae16a9065512",
  "order_id": "5a6472ce-a871-45cc-b4df-966fcba4189b",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T12:39:06.280125955Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "83dfaecf-7b91-4c84-b59d-be7f196066a7",
  "order_id": "5a6472ce-a871-45cc-b4df-966fcba4189b",
  "assignment_id": "e55c9991-db5f-4864-ba1d-2cf589a59b56",
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

`POST /api/driver/v1/trips/83dfaecf-7b91-4c84-b59d-be7f196066a7/messages` → **201**

```json
{
  "command_id": "5e09bf08-4ce3-4d1f-ab21-a25986fbb68d",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "313cf2bb-c698-4bcc-8f58-d41e86d43f79",
  "order_id": "5a6472ce-a871-45cc-b4df-966fcba4189b",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T12:39:06.821942303Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/5a6472ce-a871-45cc-b4df-966fcba4189b/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/83dfaecf-7b91-4c84-b59d-be7f196066a7/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380673652676"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/d87dc7df-5be7-41e6-aad3-d0a5153d76bb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:39:07Z",
    "sequence": 1793363947630
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d87dc7df-5be7-41e6-aad3-d0a5153d76bb",
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
  "last_heartbeat_at": "2026-10-30T12:39:07.648732Z",
  "last_location_at": "2026-10-30T12:39:07.648732Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "83dfaecf-7b91-4c84-b59d-be7f196066a7",
  "order_id": "5a6472ce-a871-45cc-b4df-966fcba4189b",
  "assignment_id": "e55c9991-db5f-4864-ba1d-2cf589a59b56",
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

`POST /api/driver/v1/trips/83dfaecf-7b91-4c84-b59d-be7f196066a7/arrive` → **200**

```json
{
  "command_id": "2d16b06d-23d1-4348-83b2-b8b5fdc1360b",
  "expected_version": 0
}
```

```json
{
  "id": "83dfaecf-7b91-4c84-b59d-be7f196066a7",
  "order_id": "5a6472ce-a871-45cc-b4df-966fcba4189b",
  "assignment_id": "e55c9991-db5f-4864-ba1d-2cf589a59b56",
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
  "arrived_at": "2026-10-30T12:39:08.206427Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/83dfaecf-7b91-4c84-b59d-be7f196066a7/start` → **200**

```json
{
  "command_id": "152a1e97-62c6-4b29-a020-06764b86ba49",
  "expected_version": 1
}
```

```json
{
  "id": "83dfaecf-7b91-4c84-b59d-be7f196066a7",
  "order_id": "5a6472ce-a871-45cc-b4df-966fcba4189b",
  "assignment_id": "e55c9991-db5f-4864-ba1d-2cf589a59b56",
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
  "arrived_at": "2026-10-30T12:39:08.206427Z",
  "started_at": "2026-10-30T12:39:08.493951Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/d87dc7df-5be7-41e6-aad3-d0a5153d76bb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:39:08Z",
    "sequence": 1793363948775
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d87dc7df-5be7-41e6-aad3-d0a5153d76bb",
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
  "last_heartbeat_at": "2026-10-30T12:39:08.794118Z",
  "last_location_at": "2026-10-30T12:39:08.794118Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/83dfaecf-7b91-4c84-b59d-be7f196066a7/complete` → **200**

```json
{
  "command_id": "ea772c36-b0a4-44ea-91ae-d9ffc8289a37",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:39:09Z",
  "cash_received": true
}
```

```json
{
  "id": "83dfaecf-7b91-4c84-b59d-be7f196066a7",
  "order_id": "5a6472ce-a871-45cc-b4df-966fcba4189b",
  "assignment_id": "e55c9991-db5f-4864-ba1d-2cf589a59b56",
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
  "arrived_at": "2026-10-30T12:39:08.206427Z",
  "started_at": "2026-10-30T12:39:08.493951Z",
  "completed_at": "2026-10-30T12:39:09.085852Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/5a6472ce-a871-45cc-b4df-966fcba4189b` → **200**

```json
{
  "id": "5a6472ce-a871-45cc-b4df-966fcba4189b",
  "short_number": 14,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "96e79073-fec9-4d3b-9136-59e6a0021108",
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
    "id": "e55c9991-db5f-4864-ba1d-2cf589a59b56",
    "order_id": "5a6472ce-a871-45cc-b4df-966fcba4189b",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "83dfaecf-7b91-4c84-b59d-be7f196066a7",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:39:04.286136Z",
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
    "id": "5a6472ce-a871-45cc-b4df-966fcba4189b",
    "short_number": 14,
    "status": "FULFILLED",
    "created_at": "2026-10-30T12:39:04.286136Z",
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
    "id": "83dfaecf-7b91-4c84-b59d-be7f196066a7",
    "order_id": "5a6472ce-a871-45cc-b4df-966fcba4189b",
    "order_short_number": 14,
    "created_at": "2026-10-30T12:39:04.897817Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "beead131-cbdf-411b-850b-6a8ef9c49acb",
    "order_id": "617e7031-2285-45bb-8d04-5f9fb4144583",
    "order_short_number": 9,
    "created_at": "2026-10-30T12:37:46.409234Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "1469b9cb-402d-4e62-ac75-0a3f2ed85190",
    "order_id": "70dbc9ef-c5ff-4d38-b273-042bab0cef69",
    "order_short_number": 4,
    "created_at": "2026-10-30T12:36:59.768371Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "53e0e8d3-427d-4035-b905-591b2c2b1ad4",
    "order_id": "01e6719a-c238-4e48-9d75-9a6c98bcfb6b",
    "order_short_number": 2,
    "created_at": "2026-10-30T12:36:19.180446Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "0e09a933-ae3a-42ab-8e87-7921584704c7",
    "order_id": "1c61cb85-1536-481f-94bc-d6bacdc243ab",
    "order_short_number": 1,
    "created_at": "2026-10-30T12:36:09.456722Z",
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

`GET /api/rider/v1/orders/5a6472ce-a871-45cc-b4df-966fcba4189b/tip` → **200**

```json
{
  "order_id": "5a6472ce-a871-45cc-b4df-966fcba4189b",
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
  "available_until": "2026-10-31T12:39:09.085852Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/5a6472ce-a871-45cc-b4df-966fcba4189b/tip` → **201**

```json
{
  "command_id": "eab4bd45-3464-477d-b948-e37b13092286",
  "amount_minor": 1100
}
```

```json
{
  "id": "97c59283-011a-4ed9-aa3f-603953b800e0",
  "order_id": "5a6472ce-a871-45cc-b4df-966fcba4189b",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T12:39:14.136742Z"
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
  "session_id": "f82a7006-e53e-4732-8f83-0ad447322b79",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ4NTQsImlhdCI6MTc5MzM2Mzk1NCwianRpIjoiNGRkMDRiNWItNTQ4NC00OWQ0LWJlZTAtNzU0M2U2NTI2ZjY0Iiwic2lkIjoiZjgyYTcwMDYtZTUzZS00NzMyLThmODMtMGFkNDQ3MzIyYjc5In0.GeGRcgSD_0UEw15JsWCx05P8UnvSJIJV-buIng-R_rA",
  "access_expires_at": "2026-10-30T12:54:14.752142255Z",
  "refresh_token": "eYBuWbwuu0eVW6ZrDMxcadlx93o5SGH3LBNsuQI6Mr8",
  "refresh_expires_at": "2026-10-31T00:39:14.751426623Z",
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
          "CARD": 2,
          "CASH": 11
        },
        "cancelled_by": {
          "DRIVER": 1,
          "RIDER": 3,
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
      "CARD": 2,
      "CASH": 11
    },
    "cancelled_by": {
      "DRIVER": 1,
      "RIDER": 3,
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
  "generated_at": "2026-10-30T12:39:15.043906603Z"
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
  "generated_at": "2026-10-30T12:39:15.358619479Z"
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
  "session_id": "0cc47c71-1e0d-4aa8-86e6-a32ecea85bee",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ4NTUsImlhdCI6MTc5MzM2Mzk1NSwianRpIjoiNTA0Y2VlNzEtNDUwMC00MDM5LWEwMjUtYTZmOWE1M2QxMjZjIiwic2lkIjoiMGNjNDdjNzEtMWUwZC00YWE4LTg2ZTYtYTMyZWNlYTg1YmVlIn0.fQTwyPwQYT9SEDFwwQXqvabtGjTjkPXafSQY9Bw0CtM",
  "access_expires_at": "2026-10-30T12:54:15.944336356Z",
  "refresh_token": "jHYWmL3l6jj9roC7d2JFXtLOfWtWlRAQnzghyO8Slqg",
  "refresh_expires_at": "2026-10-31T00:39:15.943683762Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5a6472ce-a871-45cc-b4df-966fcba4189b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T12:39:04.286721Z",
      "actor": {
        "type": "CLIENT",
        "id": "96e79073-fec9-4d3b-9136-59e6a0021108",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5a6472ce-a871-45cc-b4df-966fcba4189b",
        "quote_id": "d4018c2f-9ff7-47f2-93ae-e168646dc7e8",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "283cf5ff-efe9-4e86-a9b8-c3511f9735e7"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T12:39:04.288773Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5a6472ce-a871-45cc-b4df-966fcba4189b",
        "attempt_id": "24d219d5-1800-4f68-abe7-b2457ccbc160",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "283cf5ff-efe9-4e86-a9b8-c3511f9735e7"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T12:39:04.292269Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "927f8bfc-29dd-410e-8e85-c749be9b534f",
        "order_id": "5a6472ce-a871-45cc-b4df-966fcba4189b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "283cf5ff-efe9-4e86-a9b8-c3511f9735e7"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T12:39:04.899788Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "927f8bfc-29dd-410e-8e85-c749be9b534f",
        "order_id": "5a6472ce-a871-45cc-b4df-966fcba4189b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "e55c9991-db5f-4864-ba1d-2cf589a59b56"
      },
      "correlation_id": "32ae0612-8d9e-497b-bf2a-b221fbfad4ef"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T12:39:16.532464542Z",
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
      "last_location_at": "2026-10-30T12:39:08.794118Z",
      "order_id": null
    }
  ]
}
```

Done: order 5a6472ce-a871-45cc-b4df-966fcba4189b.

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
  "session_id": "e7e5fbc5-a110-4837-a0ff-045853f9f01c",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ4NTcsImlhdCI6MTc5MzM2Mzk1NywianRpIjoiMmFjYTczYjQtZmNmYi00NTZlLWFmZjgtMTk5NmZjY2IzYjQyIiwic2lkIjoiZTdlNWZiYzUtYTExMC00ODM3LWEwZmYtMDQ1ODUzZjlmMDFjIn0.JeC8u5DUTqfgy8KQzmWfIB44CLY2XBjbYzP7hf2qxGA",
  "access_expires_at": "2026-10-30T12:54:17.124944976Z",
  "refresh_token": "5X5PMJjygonoJR-bhONIG3rEP_Pf0baI7dbrfZp5uv0",
  "refresh_expires_at": "2026-10-31T00:39:17.12436142Z",
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
  "command_id": "86e0b678-30ef-4e7c-9899-854183574398",
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
  "timestamp": "2026-10-30T12:39:17.000+0000",
  "channel": {
    "id": "1730052000.2656725657",
    "linkedid": "1730052000.2656725657",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672842399"
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
  "timestamp": "2026-10-30T12:39:17.000+0000",
  "channel": {
    "id": "1730052000.2656725657",
    "linkedid": "1730052000.2656725657",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672842399"
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
  "session_id": "456c6597-f3cd-4185-91c2-4147b604697c",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ4NTgsImlhdCI6MTc5MzM2Mzk1OCwianRpIjoiZWU5NDFmODEtODg2Ni00NmZhLTg3MmUtZDI0OGZjMGViMTczIiwic2lkIjoiNDU2YzY1OTctZjNjZC00MTg1LTkxYzItNDE0N2I2MDQ2OTdjIn0.yt91nDbfD98tGxKkx0ex0hMtedFfPutO78K-VcAfN4A",
  "access_expires_at": "2026-10-30T12:54:18.3188349Z",
  "refresh_token": "HMZ9G9rGxFJQrOVnieZiFjxwM4btjsmZl64Rr3yOnvY",
  "refresh_expires_at": "2026-10-31T00:39:18.318066346Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "4a800f98-a2ce-46b1-a7d0-b9c90fd4e70d",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672842399",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T12:39:17Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/4a800f98-a2ce-46b1-a7d0-b9c90fd4e70d/answer` → **200**

```json
{
  "command_id": "70d1ff87-6998-484c-90cf-7d7e7a0ff437"
}
```

```json
{
  "id": "4a800f98-a2ce-46b1-a7d0-b9c90fd4e70d",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672842399",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
  "order_ids": [],
  "started_at": "2026-10-30T12:39:17Z",
  "answered_at": "2026-10-30T12:39:18.909903Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2656725657",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "e17e089d-89fd-4318-a4c0-e0a4b9ddd2c6",
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
  "id": "a3ced726-d41b-4ed4-8059-9e49908ccb96",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:44:19.233818Z",
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
  "command_id": "4231192b-47c6-4b73-824b-959fb706e291",
  "quote_id": "a3ced726-d41b-4ed4-8059-9e49908ccb96",
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
    "phone": "+380672842399"
  },
  "call_id": "4a800f98-a2ce-46b1-a7d0-b9c90fd4e70d"
}
```

```json
{
  "id": "776c0780-ca75-410e-bf61-95d4178678bc",
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
  "created_at": "2026-10-30T12:39:19.524717Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672842399"
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
    "id": "1730052000.2656725657",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "4a800f98-a2ce-46b1-a7d0-b9c90fd4e70d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672842399",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
      "order_ids": [
        "776c0780-ca75-410e-bf61-95d4178678bc"
      ],
      "started_at": "2026-10-30T12:39:17Z",
      "answered_at": "2026-10-30T12:39:18.909903Z",
      "ended_at": "2026-10-30T12:39:19.841517Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "ff1886e0-0c0f-40d2-8ee1-994bdc57fa81",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675390842",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
      "order_ids": [],
      "started_at": "2026-10-30T12:36:46.327938Z",
      "answered_at": "2026-10-30T12:36:46.644971Z",
      "ended_at": "2026-10-30T12:36:46.963981Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T12:36:54.116038Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/776c0780-ca75-410e-bf61-95d4178678bc` → **200**

```json
{
  "id": "776c0780-ca75-410e-bf61-95d4178678bc",
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
  "created_at": "2026-10-30T12:39:19.524717Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672842399"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/776c0780-ca75-410e-bf61-95d4178678bc` → **200**

```json
{
  "id": "776c0780-ca75-410e-bf61-95d4178678bc",
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
  "created_at": "2026-10-30T12:39:19.524717Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672842399"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/776c0780-ca75-410e-bf61-95d4178678bc/cancel` → **200**

```json
{
  "command_id": "2ddf3630-ce2c-45da-a11b-72704d1ac91e",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "776c0780-ca75-410e-bf61-95d4178678bc",
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
  "created_at": "2026-10-30T12:39:19.524717Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672842399"
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

Done: call 4a800f98-a2ce-46b1-a7d0-b9c90fd4e70d with order 776c0780-ca75-410e-bf61-95d4178678bc.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-3486"
}
```

```json
{
  "challenge_id": "5d866387-990e-41ad-8fa5-663fe7c6e152",
  "expires_at": "2026-10-30T12:44:21.062610981Z",
  "resend_available_at": "2026-10-30T12:39:22.062610981Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "957736",
  "sent_at": "2026-10-30T12:39:21.065506076Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5d866387-990e-41ad-8fa5-663fe7c6e152",
  "code": "957736",
  "device_ref": "sandbox-3486"
}
```

```json
{
  "session_id": "21853817-7082-4599-b4a9-f08c408f16ec",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDg2MSwiaWF0IjoxNzkzMzYzOTYxLCJqdGkiOiIwOGUxZjEyZS0wZTgwLTRlZjYtYmNkMi02ZTAwZDYzMjhkOWQiLCJzaWQiOiIyMTg1MzgxNy03MDgyLTQ1OTktYjRhOS1mMDhjNDA4ZjE2ZWMifQ.ghzxJo_1eWlQO14_ScXwzOLz9Lg6QbdPzjU1x-jLhVE",
  "access_expires_at": "2026-10-30T12:54:21.375475326Z",
  "refresh_token": "3S0C63FCUXZKUSoKMbgzZQb6HDowLK9Z0dqoyp_kIaU",
  "refresh_expires_at": "2026-11-29T12:39:21.374927067Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d87dc7df-5be7-41e6-aad3-d0a5153d76bb",
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
  "last_heartbeat_at": "2026-10-30T12:39:08.794118Z",
  "last_location_at": "2026-10-30T12:39:08.794118Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d87dc7df-5be7-41e6-aad3-d0a5153d76bb/handover` → **200**

```json
{
  "command_id": "eefdd28b-5041-40c3-8a5c-6df3636191f1",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d87dc7df-5be7-41e6-aad3-d0a5153d76bb",
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
  "last_heartbeat_at": "2026-10-30T12:39:08.794118Z",
  "last_location_at": "2026-10-30T12:39:08.794118Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d87dc7df-5be7-41e6-aad3-d0a5153d76bb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:39:22Z",
    "sequence": 1793363962215
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d87dc7df-5be7-41e6-aad3-d0a5153d76bb",
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
  "last_heartbeat_at": "2026-10-30T12:39:22.23299Z",
  "last_location_at": "2026-10-30T12:39:22.23299Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666132125",
  "device_ref": "sandbox-2031"
}
```

```json
{
  "challenge_id": "86751ef1-ab97-42f5-bb47-e885cb7f5fe7",
  "expires_at": "2026-10-30T12:44:22.511630911Z",
  "resend_available_at": "2026-10-30T12:39:23.511630911Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666132125` → **200**

```json
{
  "phone": "+380666132125",
  "audience": "CLIENT",
  "code": "877894",
  "sent_at": "2026-10-30T12:39:22.51480261Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "86751ef1-ab97-42f5-bb47-e885cb7f5fe7",
  "code": "877894",
  "device_ref": "sandbox-2031"
}
```

```json
{
  "session_id": "77b2c55b-1171-4d86-94ef-12c9417bc846",
  "subject": {
    "type": "CLIENT",
    "id": "82013b03-aed3-471c-b6fc-fd60616852e2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MjAxM2IwMy1hZWQzLTQ3MWMtYjZmYy1mZDYwNjE2ODUyZTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0ODYyLCJpYXQiOjE3OTMzNjM5NjIsImp0aSI6IjliMmJkNGUzLTQxMzEtNDQyOC1iZjQ3LTVjYmE3OWNhODdjZCIsInNpZCI6Ijc3YjJjNTViLTExNzEtNGQ4Ni05NGVmLTEyYzk0MTdiYzg0NiJ9.t7npisXTYceXtH1sEV2uwonfrtTrt0xX23JngXcyfAE",
  "access_expires_at": "2026-10-30T12:54:22.824587831Z",
  "refresh_token": "VZLbr7b98Fl8n8r1oCLmmMMm57TLTWRXxhttaMFZcqc",
  "refresh_expires_at": "2026-11-29T12:39:22.824071731Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4f6c60cd-ab6c-499c-9190-cb933a7f6f1d",
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
  "id": "ad012ceb-4918-47d7-ad19-0732601704a2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:44:23.105773Z",
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
  "command_id": "5898fc8a-a9d0-4a61-88ad-1678152aac6d",
  "quote_id": "ad012ceb-4918-47d7-ad19-0732601704a2",
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
  "id": "d0e31d39-7543-4c12-9ce2-1a635521f8ee",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "82013b03-aed3-471c-b6fc-fd60616852e2",
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
  "created_at": "2026-10-30T12:39:23.398374Z",
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
    "id": "a763a24c-23a8-492a-b4ec-8e6f2e5b0a61",
    "order_id": "d0e31d39-7543-4c12-9ce2-1a635521f8ee",
    "expires_at": "2026-10-30T12:39:38.401526Z",
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

`POST /api/driver/v1/offers/a763a24c-23a8-492a-b4ec-8e6f2e5b0a61/accept` → **200**

```json
{
  "command_id": "0682b660-f34d-4afb-85be-a404b9d8f520"
}
```

```json
{
  "id": "7c4ab175-60b5-4668-b5d8-22e571165690",
  "order_id": "d0e31d39-7543-4c12-9ce2-1a635521f8ee",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d02e240f-91c8-4604-9df8-6c509b32359e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d02e240f-91c8-4604-9df8-6c509b32359e",
  "order_id": "d0e31d39-7543-4c12-9ce2-1a635521f8ee",
  "assignment_id": "7c4ab175-60b5-4668-b5d8-22e571165690",
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

`POST /api/driver/v1/work-sessions/d87dc7df-5be7-41e6-aad3-d0a5153d76bb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:39:24Z",
    "sequence": 1793363964531
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d87dc7df-5be7-41e6-aad3-d0a5153d76bb",
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
  "last_heartbeat_at": "2026-10-30T12:39:24.549583Z",
  "last_location_at": "2026-10-30T12:39:24.549583Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d02e240f-91c8-4604-9df8-6c509b32359e/arrive` → **200**

```json
{
  "command_id": "f357924a-da28-42c8-9294-ecff5534bfd7",
  "expected_version": 0
}
```

```json
{
  "id": "d02e240f-91c8-4604-9df8-6c509b32359e",
  "order_id": "d0e31d39-7543-4c12-9ce2-1a635521f8ee",
  "assignment_id": "7c4ab175-60b5-4668-b5d8-22e571165690",
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
  "arrived_at": "2026-10-30T12:39:24.839749Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d02e240f-91c8-4604-9df8-6c509b32359e/start` → **200**

```json
{
  "command_id": "3f3fecbd-0ae3-4586-a400-4bba697fd2e3",
  "expected_version": 1
}
```

```json
{
  "id": "d02e240f-91c8-4604-9df8-6c509b32359e",
  "order_id": "d0e31d39-7543-4c12-9ce2-1a635521f8ee",
  "assignment_id": "7c4ab175-60b5-4668-b5d8-22e571165690",
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
  "arrived_at": "2026-10-30T12:39:24.839749Z",
  "started_at": "2026-10-30T12:39:25.128848Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/d87dc7df-5be7-41e6-aad3-d0a5153d76bb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:39:25Z",
    "sequence": 1793363965406
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d87dc7df-5be7-41e6-aad3-d0a5153d76bb",
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
  "last_heartbeat_at": "2026-10-30T12:39:25.423759Z",
  "last_location_at": "2026-10-30T12:39:25.423759Z",
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
  "device_ref": "sandbox-16565"
}
```

```json
{
  "challenge_id": "39480a10-e5ed-4f9b-847c-54cc05ee9bda",
  "expires_at": "2026-10-30T12:44:25.704142057Z",
  "resend_available_at": "2026-10-30T12:39:26.704142057Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "888401",
  "sent_at": "2026-10-30T12:39:25.706931014Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "39480a10-e5ed-4f9b-847c-54cc05ee9bda",
  "code": "888401",
  "device_ref": "sandbox-16565"
}
```

```json
{
  "session_id": "e42cd42b-f5df-4ca7-98bc-648a5118fba6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDg2NiwiaWF0IjoxNzkzMzYzOTY2LCJqdGkiOiI4OTU0ODg1OS0wZDQ0LTQwY2YtODM3Ni1kNGI4MDMyZTZiOWUiLCJzaWQiOiJlNDJjZDQyYi1mNWRmLTRjYTctOThiYy02NDhhNTExOGZiYTYifQ.K4DB0psT1klRl0nHLGnYysyJlj40hMMDYXqLUb14M8k",
  "access_expires_at": "2026-10-30T12:54:26.015106299Z",
  "refresh_token": "ZCFjz6o_yoDkGpPefqic8LiiaVjmLTdtKp2LNoOJohA",
  "refresh_expires_at": "2026-11-29T12:39:26.014519757Z",
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
  "command_id": "41872b2e-b9b4-4eca-b860-e072be86d8d1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:39:26Z",
    "sequence": 1793363966560
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "124e8c59-2514-4a41-b3f3-ad0c9040e1f8",
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
  "last_heartbeat_at": "2026-10-30T12:39:26.577596Z",
  "last_location_at": "2026-10-30T12:39:26.577596Z",
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
  "session_id": "97aab8b1-0dcd-4b63-85bc-9ed00cfb4cdf",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ4NjcsImlhdCI6MTc5MzM2Mzk2NywianRpIjoiYjVkZWEwZWEtYmNkZS00MjRiLTljOTEtMzZiMTdkZDVjNjI3Iiwic2lkIjoiOTdhYWI4YjEtMGRjZC00YjYzLTg1YmMtOWVkMDBjZmI0Y2RmIn0.qsldXrIFDtKA0ZVW16NbdQooFG25ye3kKJ3k1SjqXjk",
  "access_expires_at": "2026-10-30T12:54:27.150207536Z",
  "refresh_token": "ush9FvEgXAbGGF5mQXMkd8nZI4Uzod7cRIevWyeQp5E",
  "refresh_expires_at": "2026-10-31T00:39:27.149698298Z",
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
  "session_id": "c1124739-d786-41cf-9667-4b910e6ed683",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ4NjcsImlhdCI6MTc5MzM2Mzk2NywianRpIjoiM2FiNzQ5YzEtODRhNC00ZmU5LTgzYWItNDdkOTc1ZmMwN2Q4Iiwic2lkIjoiYzExMjQ3MzktZDc4Ni00MWNmLTk2NjctNGI5MTBlNmVkNjgzIn0._wJA3lWez2S1j8kzl6n0gQeOclrHlIS5ypwfRNL9uXY",
  "access_expires_at": "2026-10-30T12:54:27.707917273Z",
  "refresh_token": "UxVV0JanlJ-oeYBUgZThLz_j9rC-2OSPgEZXHphf98o",
  "refresh_expires_at": "2026-10-31T00:39:27.707369824Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d0e31d39-7543-4c12-9ce2-1a635521f8ee` → **200**

```json
{
  "id": "d0e31d39-7543-4c12-9ce2-1a635521f8ee",
  "short_number": 16,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "82013b03-aed3-471c-b6fc-fd60616852e2",
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
    "id": "7c4ab175-60b5-4668-b5d8-22e571165690",
    "order_id": "d0e31d39-7543-4c12-9ce2-1a635521f8ee",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "d02e240f-91c8-4604-9df8-6c509b32359e",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T12:39:23.398374Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d0e31d39-7543-4c12-9ce2-1a635521f8ee/interrupt` → **200**

```json
{
  "command_id": "1f506044-99b8-475b-8c4c-375fb4a2cb82",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "d0e31d39-7543-4c12-9ce2-1a635521f8ee",
    "short_number": 16,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "82013b03-aed3-471c-b6fc-fd60616852e2",
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
      "id": "7c4ab175-60b5-4668-b5d8-22e571165690",
      "order_id": "d0e31d39-7543-4c12-9ce2-1a635521f8ee",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "d02e240f-91c8-4604-9df8-6c509b32359e",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T12:39:23.398374Z",
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
    "id": "f6ec4912-b747-4f58-b65f-77de57cdf8ae",
    "short_number": 17,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "82013b03-aed3-471c-b6fc-fd60616852e2",
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
    "id": "70650aa0-0a0e-42cf-a0d2-b9165a82531f",
    "order_id": "f6ec4912-b747-4f58-b65f-77de57cdf8ae",
    "expires_at": "2026-10-30T12:39:43.307496Z",
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

`POST /api/driver/v1/offers/70650aa0-0a0e-42cf-a0d2-b9165a82531f/accept` → **200**

```json
{
  "command_id": "c0923b8b-2edf-4747-ab16-ad781371639c"
}
```

```json
{
  "id": "f18931ca-e842-4f66-973c-7fd4843ff82b",
  "order_id": "f6ec4912-b747-4f58-b65f-77de57cdf8ae",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b04897f8-4111-4450-b5eb-ff8a15c5e1ca",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b04897f8-4111-4450-b5eb-ff8a15c5e1ca",
  "order_id": "f6ec4912-b747-4f58-b65f-77de57cdf8ae",
  "assignment_id": "f18931ca-e842-4f66-973c-7fd4843ff82b",
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
  "session_id": "124e8c59-2514-4a41-b3f3-ad0c9040e1f8",
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
  "last_heartbeat_at": "2026-10-30T12:39:26.577596Z",
  "last_location_at": "2026-10-30T12:39:26.577596Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/124e8c59-2514-4a41-b3f3-ad0c9040e1f8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:39:29Z",
    "sequence": 1793363969745
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "124e8c59-2514-4a41-b3f3-ad0c9040e1f8",
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
  "last_heartbeat_at": "2026-10-30T12:39:29.762865Z",
  "last_location_at": "2026-10-30T12:39:29.762865Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b04897f8-4111-4450-b5eb-ff8a15c5e1ca/arrive` → **200**

```json
{
  "command_id": "372af63a-1f0b-42bb-8b5c-96d0425ea2e4",
  "expected_version": 0
}
```

```json
{
  "id": "b04897f8-4111-4450-b5eb-ff8a15c5e1ca",
  "order_id": "f6ec4912-b747-4f58-b65f-77de57cdf8ae",
  "assignment_id": "f18931ca-e842-4f66-973c-7fd4843ff82b",
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
  "arrived_at": "2026-10-30T12:39:30.043585Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b04897f8-4111-4450-b5eb-ff8a15c5e1ca/start` → **200**

```json
{
  "command_id": "e2c4c880-d596-4acb-a35d-dc899e340e2f",
  "expected_version": 1
}
```

```json
{
  "id": "b04897f8-4111-4450-b5eb-ff8a15c5e1ca",
  "order_id": "f6ec4912-b747-4f58-b65f-77de57cdf8ae",
  "assignment_id": "f18931ca-e842-4f66-973c-7fd4843ff82b",
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
  "arrived_at": "2026-10-30T12:39:30.043585Z",
  "started_at": "2026-10-30T12:39:30.349745Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b04897f8-4111-4450-b5eb-ff8a15c5e1ca/complete` → **200**

```json
{
  "command_id": "35dfce9b-18a4-417c-b0b7-851ed8a6e2d1",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:39:30Z"
}
```

```json
{
  "id": "b04897f8-4111-4450-b5eb-ff8a15c5e1ca",
  "order_id": "f6ec4912-b747-4f58-b65f-77de57cdf8ae",
  "assignment_id": "f18931ca-e842-4f66-973c-7fd4843ff82b",
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
  "arrived_at": "2026-10-30T12:39:30.043585Z",
  "started_at": "2026-10-30T12:39:30.349745Z",
  "completed_at": "2026-10-30T12:39:30.653091Z",
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
    "id": "f6ec4912-b747-4f58-b65f-77de57cdf8ae",
    "short_number": 17,
    "status": "FULFILLED",
    "created_at": "2026-10-30T12:39:28.298173Z",
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
    "id": "d0e31d39-7543-4c12-9ce2-1a635521f8ee",
    "short_number": 16,
    "status": "CANCELLED",
    "created_at": "2026-10-30T12:39:23.398374Z",
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

`GET /api/operator/v1/orders/d0e31d39-7543-4c12-9ce2-1a635521f8ee/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T12:39:23.398857Z",
      "actor": {
        "type": "CLIENT",
        "id": "82013b03-aed3-471c-b6fc-fd60616852e2",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d0e31d39-7543-4c12-9ce2-1a635521f8ee",
        "quote_id": "ad012ceb-4918-47d7-ad19-0732601704a2",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "673fc72c-1a68-4eee-88a1-37da8fa5d7a4"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T12:39:23.400796Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d0e31d39-7543-4c12-9ce2-1a635521f8ee",
        "attempt_id": "bceb1741-9a9a-4481-bf2e-8769ec343fbc",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "673fc72c-1a68-4eee-88a1-37da8fa5d7a4"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T12:39:23.403508Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a763a24c-23a8-492a-b4ec-8e6f2e5b0a61",
        "order_id": "d0e31d39-7543-4c12-9ce2-1a635521f8ee",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "673fc72c-1a68-4eee-88a1-37da8fa5d7a4"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T12:39:23.984795Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "a763a24c-23a8-492a-b4ec-8e6f2e5b0a61",
        "order_id": "d0e31d39-7543-4c12-9ce2-1a635521f8ee",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "7c4ab175-60b5-4668-b5d8-22e571165690"
      },
      "correlation_id": "6183ae99-873b-4058-a7ff-5f35da2ee47c"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/f6ec4912-b747-4f58-b65f-77de57cdf8ae/tip` → **200**

```json
{
  "order_id": "f6ec4912-b747-4f58-b65f-77de57cdf8ae",
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
  "available_until": "2026-10-31T12:39:30.653091Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/f6ec4912-b747-4f58-b65f-77de57cdf8ae/tip` → **409**

```json
{
  "command_id": "8f92a9e1-7961-4e12-baef-01c48e0488bd",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/f6ec4912-b747-4f58-b65f-77de57cdf8ae/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ba377b36-f310-4612-8c15-07d4a55435e8"
}
```

Done: interrupted d0e31d39-7543-4c12-9ce2-1a635521f8ee, follow-up f6ec4912-b747-4f58-b65f-77de57cdf8ae.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d87dc7df-5be7-41e6-aad3-d0a5153d76bb",
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
  "last_heartbeat_at": "2026-10-30T12:39:25.423759Z",
  "last_location_at": "2026-10-30T12:39:25.423759Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d87dc7df-5be7-41e6-aad3-d0a5153d76bb/close` → **200**

```json
{
  "command_id": "4e45a479-fcc6-4d5b-ae95-e0e91cda737b",
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
  "session_id": "124e8c59-2514-4a41-b3f3-ad0c9040e1f8",
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
  "last_heartbeat_at": "2026-10-30T12:39:29.762865Z",
  "last_location_at": "2026-10-30T12:39:29.762865Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/124e8c59-2514-4a41-b3f3-ad0c9040e1f8/close` → **200**

```json
{
  "command_id": "911e7f92-3926-402b-9798-453a03f0ecdf",
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
  "session_id": "99c470ff-a609-46f4-a259-2c43949deb01",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ4NzYsImlhdCI6MTc5MzM2Mzk3NiwianRpIjoiNTVjYTAxMjctMDg4Ni00ZjVkLTg0ZDQtMjVjMzVmZTIzZGFlIiwic2lkIjoiOTljNDcwZmYtYTYwOS00NmY0LWEyNTktMmM0Mzk0OWRlYjAxIn0.m3L-bXVqgcxZw2mABQaLtSxZWOISSdv6A_kwl20tVLw",
  "access_expires_at": "2026-10-30T12:54:36.835741559Z",
  "refresh_token": "hjCjCOpWjg2oKYRyg6EJgzV4w4B-8vpG4iD6Pmj5_5k",
  "refresh_expires_at": "2026-10-31T00:39:36.835175787Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "0a69a70b-870f-4c08-b14f-d5e2cf50314b",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T12:39:37Z"
}
```

```json
{
  "id": "c57e3b64-4e87-4c1f-b830-c7bc500a5bf7",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T12:39:37Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/c57e3b64-4e87-4c1f-b830-c7bc500a5bf7/publish` → **200**

```json
{
  "command_id": "a92419b4-6c14-432c-ac52-b26b7e4f6d2a",
  "expected_version": 0
}
```

```json
{
  "id": "c57e3b64-4e87-4c1f-b830-c7bc500a5bf7",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T12:39:37.437142Z",
  "published_at": "2026-10-30T12:39:37.437142Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "c57e3b64-4e87-4c1f-b830-c7bc500a5bf7",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T12:39:37.437142Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638384156",
  "device_ref": "sandbox-26272"
}
```

```json
{
  "challenge_id": "692f9db0-35af-4fc8-b443-a14d3f8d9027",
  "expires_at": "2026-10-30T12:44:37.993208305Z",
  "resend_available_at": "2026-10-30T12:39:38.993208305Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638384156` → **200**

```json
{
  "phone": "+380638384156",
  "audience": "CLIENT",
  "code": "934527",
  "sent_at": "2026-10-30T12:39:37.996048015Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "692f9db0-35af-4fc8-b443-a14d3f8d9027",
  "code": "934527",
  "device_ref": "sandbox-26272"
}
```

```json
{
  "session_id": "2063ea96-ef65-4ae1-966e-34482877af7f",
  "subject": {
    "type": "CLIENT",
    "id": "6c020291-f5be-411e-961d-05da135be662"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YzAyMDI5MS1mNWJlLTQxMWUtOTYxZC0wNWRhMTM1YmU2NjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0ODc4LCJpYXQiOjE3OTMzNjM5NzgsImp0aSI6IjQxOWJhN2M5LWE5ZTUtNDNlNy1iMzNiLWEzOTZjNGVjZTUwZiIsInNpZCI6IjIwNjNlYTk2LWVmNjUtNGFlMS05NjZlLTM0NDgyODc3YWY3ZiJ9.kopbO_pfo1be5hTD4Gvl9LeBF81wHgiM4bJ8_Ef02Ro",
  "access_expires_at": "2026-10-30T12:54:38.297696299Z",
  "refresh_token": "U6-judoSvjDwibeNcMMnlBqYz1fQ1KYjE8PDKHd6jCU",
  "refresh_expires_at": "2026-11-29T12:39:38.297166523Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "c57e3b64-4e87-4c1f-b830-c7bc500a5bf7",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T12:39:37.437142Z",
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
  "command_id": "2c1dd71a-9b61-46fd-ab21-e445ba093a73",
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
  "id": "fa8db766-9bb2-4a4f-baec-c0ca3f95fe2c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:44:38.855259Z",
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
  "command_id": "0c57188e-4656-445f-b7a8-8b2c2489754c",
  "quote_id": "fa8db766-9bb2-4a4f-baec-c0ca3f95fe2c",
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
  "correlation_id": "6f092016-3617-4936-ab95-cd2c40c14c45"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "00018d06-6fbe-4dff-b0d2-b68142d84e75",
  "version_id": "c57e3b64-4e87-4c1f-b830-c7bc500a5bf7",
  "language": "uk"
}
```

```json
{
  "version_id": "c57e3b64-4e87-4c1f-b830-c7bc500a5bf7",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T12:39:39.443977Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2afe800e-993d-413a-8f57-1e0d77765eba",
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
  "id": "1afe3173-8b46-43ef-90cd-3a5371baf68d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:44:39.724849Z",
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
  "command_id": "a5bb329f-f43b-459f-9b7c-df9dfa63abfb",
  "quote_id": "1afe3173-8b46-43ef-90cd-3a5371baf68d",
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
  "id": "089d07df-6366-45da-a3fe-2b319caae382",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c020291-f5be-411e-961d-05da135be662",
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
  "created_at": "2026-10-30T12:39:40.017927Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/089d07df-6366-45da-a3fe-2b319caae382` → **200**

```json
{
  "id": "089d07df-6366-45da-a3fe-2b319caae382",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c020291-f5be-411e-961d-05da135be662",
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
  "created_at": "2026-10-30T12:39:40.017927Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/089d07df-6366-45da-a3fe-2b319caae382/cancel` → **200**

```json
{
  "command_id": "23cbbdf2-eff8-4e1e-bc50-4c463365fa51",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "089d07df-6366-45da-a3fe-2b319caae382",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6c020291-f5be-411e-961d-05da135be662",
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
  "created_at": "2026-10-30T12:39:40.017927Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

## A published version never changes

`POST /api/admin/v1/legal-documents/c57e3b64-4e87-4c1f-b830-c7bc500a5bf7` → **409**

```json
{
  "command_id": "c35b65e3-bb3f-4590-b648-21174b082f20",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T12:39:40Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/c57e3b64-4e87-4c1f-b830-c7bc500a5bf7",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "cc137651-56d7-47a0-bf39-01d10499f591"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "dbda3cd3-0959-4241-ac09-2267c7884af7",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T12:39:41Z"
}
```

```json
{
  "id": "c12dcc62-6bdc-46d5-b3e8-a5165f6ecc0f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T12:39:41Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/c12dcc62-6bdc-46d5-b3e8-a5165f6ecc0f/publish` → **200**

```json
{
  "command_id": "d3a3d355-3cd8-4381-bdc0-d92e50639174",
  "expected_version": 0
}
```

```json
{
  "id": "c12dcc62-6bdc-46d5-b3e8-a5165f6ecc0f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T12:39:41.510185Z",
  "published_at": "2026-10-30T12:39:41.510185Z",
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
  "device_ref": "sandbox-31489"
}
```

```json
{
  "challenge_id": "76e3cd76-61e7-4690-9923-037020fcffe4",
  "expires_at": "2026-10-30T12:44:41.796049064Z",
  "resend_available_at": "2026-10-30T12:39:42.796049064Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "258634",
  "sent_at": "2026-10-30T12:39:41.798708801Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "76e3cd76-61e7-4690-9923-037020fcffe4",
  "code": "258634",
  "device_ref": "sandbox-31489"
}
```

```json
{
  "session_id": "f799714f-894c-4ba9-b7d1-8d97dacc6a68",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDg4MiwiaWF0IjoxNzkzMzYzOTgyLCJqdGkiOiJkN2E5ODE5Yi05YjQyLTQ2OTEtOTRhOS04OWYzYjhlZDQxYjYiLCJzaWQiOiJmNzk5NzE0Zi04OTRjLTRiYTktYjdkMS04ZDk3ZGFjYzZhNjgifQ.il2fy5CAx3iBdWSajEg0kMn8adcnYqVToZXotgdWEmg",
  "access_expires_at": "2026-10-30T12:54:42.102749579Z",
  "refresh_token": "-zTRJlmfTa-jGjktIGcZK-QcBGQHIHCX2zOIDE6Nb7o",
  "refresh_expires_at": "2026-11-29T12:39:42.102200467Z",
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
  "command_id": "2fc3cafe-2b0c-492b-bb3e-8601e6718eb8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:39:42Z",
    "sequence": 1793363982648
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6092a778-c7c6-4634-934e-34c9943b4f9d",
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
  "last_heartbeat_at": "2026-10-30T12:39:42.666631Z",
  "last_location_at": "2026-10-30T12:39:42.666631Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670024662",
  "device_ref": "sandbox-6490"
}
```

```json
{
  "challenge_id": "6f7750dc-1316-4f66-8182-dc5f5d9479ab",
  "expires_at": "2026-10-30T12:44:42.945001417Z",
  "resend_available_at": "2026-10-30T12:39:43.945001417Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670024662` → **200**

```json
{
  "phone": "+380670024662",
  "audience": "CLIENT",
  "code": "740058",
  "sent_at": "2026-10-30T12:39:42.947618791Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6f7750dc-1316-4f66-8182-dc5f5d9479ab",
  "code": "740058",
  "device_ref": "sandbox-6490"
}
```

```json
{
  "session_id": "b94281e0-4056-4d6d-9ad3-5b6a176a3939",
  "subject": {
    "type": "CLIENT",
    "id": "e6fa6032-6233-47f6-bcd0-cdc0962edb7a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmZhNjAzMi02MjMzLTQ3ZjYtYmNkMC1jZGMwOTYyZWRiN2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0ODgzLCJpYXQiOjE3OTMzNjM5ODMsImp0aSI6ImZjZDQ4NGYxLTE0YTgtNDQ3Ny05NzE2LWRmZTQyNzQ1Mjk1NiIsInNpZCI6ImI5NDI4MWUwLTQwNTYtNGQ2ZC05YWQzLTViNmExNzZhMzkzOSJ9.JV-OKSpu9wmrPct44xGCrOwozMAWL4eGaHmUpxytlbg",
  "access_expires_at": "2026-10-30T12:54:43.248647305Z",
  "refresh_token": "FhRkuiyHUbkzWWEVYeBccuKHT91Yvof6nBoxfS8EQ2w",
  "refresh_expires_at": "2026-11-29T12:39:43.247912207Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "10d96957-3a5e-4213-9ab3-c11c75988385",
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
  "id": "36a3aa4b-f477-4800-b345-f7b361d85402",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:44:43.536052Z",
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
  "command_id": "68b1b189-ae60-4c91-8269-87a9c84dc57a",
  "quote_id": "36a3aa4b-f477-4800-b345-f7b361d85402",
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
    "phone": "+380676436451"
  }
}
```

```json
{
  "id": "daf555e0-e8f4-4412-8a8e-4fee973f2355",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e6fa6032-6233-47f6-bcd0-cdc0962edb7a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:39:43.842366Z",
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
    "id": "04b6ce64-5073-4318-a404-862b9c7ba12d",
    "order_id": "daf555e0-e8f4-4412-8a8e-4fee973f2355",
    "expires_at": "2026-10-30T12:39:58.846163Z",
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

`POST /api/driver/v1/offers/04b6ce64-5073-4318-a404-862b9c7ba12d/accept` → **200**

```json
{
  "command_id": "f86220e7-d09e-4680-89a8-e4ac35388a86"
}
```

```json
{
  "id": "89fa1ed7-a012-48eb-96db-3001a737e433",
  "order_id": "daf555e0-e8f4-4412-8a8e-4fee973f2355",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "226d5101-d41f-47f4-838a-628b77fb14a9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "226d5101-d41f-47f4-838a-628b77fb14a9",
  "order_id": "daf555e0-e8f4-4412-8a8e-4fee973f2355",
  "assignment_id": "89fa1ed7-a012-48eb-96db-3001a737e433",
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
    "phone": "+380676436451"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b21cb76e-a27a-43c7-b375-db090421aab3",
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
  "id": "1d6721dc-01bc-4a35-adeb-723e2c4e5571",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:44:45.008912Z",
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
  "command_id": "797367a6-3cf9-4258-a46c-6cf09114b530",
  "quote_id": "1d6721dc-01bc-4a35-adeb-723e2c4e5571",
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
  "id": "d6fb9acb-db52-42ab-b4d0-f2015b91381c",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e6fa6032-6233-47f6-bcd0-cdc0962edb7a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:39:45.296699Z",
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
  "command_id": "03d309e7-3694-4bfc-a3b4-5123d534568e",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T15:39:45Z"
}
```

```json
{
  "id": "4872e898-1c35-468f-9369-0fa5c22cec46",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:44:45.621294Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T15:39:45Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "92967383-3053-426a-baf9-9d614e3fc915",
  "quote_id": "4872e898-1c35-468f-9369-0fa5c22cec46",
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
  "pickup_at": "2026-10-30T15:39:45Z"
}
```

```json
{
  "id": "74f91852-7b10-4df1-8045-52f904bcd052",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e6fa6032-6233-47f6-bcd0-cdc0962edb7a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T12:39:45.913345Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T15:39:45Z",
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
  "command_id": "2324bf47-89b4-4a58-9f0d-fe5c5c8debff",
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
  "id": "0c04fcd9-c6dd-41a5-9b36-4d071b4c5c86",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:44:46.226474Z",
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
  "command_id": "3c2457f3-ab87-4ddb-ab9a-bbbba56551e3",
  "quote_id": "0c04fcd9-c6dd-41a5-9b36-4d071b4c5c86",
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
  "correlation_id": "8d53b64d-44a0-42aa-9f42-ad51e5c3e097"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "74f91852-7b10-4df1-8045-52f904bcd052",
      "short_number": 21,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "e6fa6032-6233-47f6-bcd0-cdc0962edb7a",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T12:39:45.913345Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T15:39:45Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "d6fb9acb-db52-42ab-b4d0-f2015b91381c",
      "short_number": 20,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "e6fa6032-6233-47f6-bcd0-cdc0962edb7a",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-30T12:39:45.296699Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "daf555e0-e8f4-4412-8a8e-4fee973f2355",
      "short_number": 19,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "d6fb9acb-db52-42ab-b4d0-f2015b91381c",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e6fa6032-6233-47f6-bcd0-cdc0962edb7a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:39:45.296699Z",
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

`GET /api/rider/v1/orders/daf555e0-e8f4-4412-8a8e-4fee973f2355` → **200**

```json
{
  "id": "daf555e0-e8f4-4412-8a8e-4fee973f2355",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e6fa6032-6233-47f6-bcd0-cdc0962edb7a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "89fa1ed7-a012-48eb-96db-3001a737e433",
    "order_id": "daf555e0-e8f4-4412-8a8e-4fee973f2355",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "226d5101-d41f-47f4-838a-628b77fb14a9",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T12:39:43.842366Z",
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
    "location_at": "2026-10-30T12:39:42.666631Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/daf555e0-e8f4-4412-8a8e-4fee973f2355/cancel` → **200**

```json
{
  "command_id": "ce7a90f1-91cd-4fff-8bfc-056a72a5f5ee",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "daf555e0-e8f4-4412-8a8e-4fee973f2355",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "e6fa6032-6233-47f6-bcd0-cdc0962edb7a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "89fa1ed7-a012-48eb-96db-3001a737e433",
    "order_id": "daf555e0-e8f4-4412-8a8e-4fee973f2355",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "226d5101-d41f-47f4-838a-628b77fb14a9",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T12:39:43.842366Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d6fb9acb-db52-42ab-b4d0-f2015b91381c` → **200**

```json
{
  "id": "d6fb9acb-db52-42ab-b4d0-f2015b91381c",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e6fa6032-6233-47f6-bcd0-cdc0962edb7a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:39:45.296699Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d6fb9acb-db52-42ab-b4d0-f2015b91381c/cancel` → **200**

```json
{
  "command_id": "e87d7a1c-e29f-4433-8128-1c11e4637424",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d6fb9acb-db52-42ab-b4d0-f2015b91381c",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e6fa6032-6233-47f6-bcd0-cdc0962edb7a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:39:45.296699Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/74f91852-7b10-4df1-8045-52f904bcd052` → **200**

```json
{
  "id": "74f91852-7b10-4df1-8045-52f904bcd052",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e6fa6032-6233-47f6-bcd0-cdc0962edb7a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T12:39:45.913345Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T15:39:45Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/74f91852-7b10-4df1-8045-52f904bcd052/cancel` → **200**

```json
{
  "command_id": "47c58de7-ab79-4de3-adb4-eca3ecfa6c6a",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "74f91852-7b10-4df1-8045-52f904bcd052",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "e6fa6032-6233-47f6-bcd0-cdc0962edb7a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T12:39:45.913345Z",
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
  "pickup_at": "2026-10-30T15:39:45Z",
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
  "session_id": "6092a778-c7c6-4634-934e-34c9943b4f9d",
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
  "last_heartbeat_at": "2026-10-30T12:39:42.666631Z",
  "last_location_at": "2026-10-30T12:39:42.666631Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6092a778-c7c6-4634-934e-34c9943b4f9d/close` → **200**

```json
{
  "command_id": "eacefddd-180c-4740-96cb-00282eae4579",
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

Done: orders daf555e0-e8f4-4412-8a8e-4fee973f2355, d6fb9acb-db52-42ab-b4d0-f2015b91381c, 74f91852-7b10-4df1-8045-52f904bcd052.

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
  "session_id": "aa5b6ab7-a9ba-4ed7-8557-cd13f358981c",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ4OTAsImlhdCI6MTc5MzM2Mzk5MCwianRpIjoiYTRjNTgzMjgtY2NlYi00YTFkLWI0NzktYTY0MDkzZDYzMmI2Iiwic2lkIjoiYWE1YjZhYjctYTliYS00ZWQ3LTg1NTctY2QxM2YzNTg5ODFjIn0.zZTW--3PoGZpsr1P3h6g-BFj15IFeHYPQ95aLLL_phU",
  "access_expires_at": "2026-10-30T12:54:50.036763747Z",
  "refresh_token": "Y54MubPTdS4jSaQRiaBTn3Qh-1l_FgO163r9VnyJctU",
  "refresh_expires_at": "2026-10-31T00:39:50.036213914Z",
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
  "session_id": "8d6403a1-5d4c-429d-8a8c-3f0b97a3b093",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ4OTAsImlhdCI6MTc5MzM2Mzk5MCwianRpIjoiOTU1Y2EwMWUtMjk4Ni00MDY0LWI3NGEtYzhkMDIwMzU1MzJmIiwic2lkIjoiOGQ2NDAzYTEtNWQ0Yy00MjlkLThhOGMtM2YwYjk3YTNiMDkzIn0.txpWaFTukTlXt_KxOpu6Fi6bAAKGxu0EUATMKx7YrUk",
  "access_expires_at": "2026-10-30T12:54:50.614223305Z",
  "refresh_token": "MSjdt_a6kdlFYuQY7UttFXJDQfpnpHH9eb_1SJbQbXw",
  "refresh_expires_at": "2026-10-31T00:39:50.613678262Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26365"
}
```

```json
{
  "challenge_id": "648de7d6-efee-4f6f-97df-364a467585c0",
  "expires_at": "2026-10-30T12:44:50.888499484Z",
  "resend_available_at": "2026-10-30T12:39:51.888499484Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "234668",
  "sent_at": "2026-10-30T12:39:50.891361546Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "648de7d6-efee-4f6f-97df-364a467585c0",
  "code": "234668",
  "device_ref": "sandbox-26365"
}
```

```json
{
  "session_id": "e9cab80b-bbea-4178-bc63-ba0d4cfe3bc8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDg5MSwiaWF0IjoxNzkzMzYzOTkxLCJqdGkiOiIxNTUwMDI1MC1iZjI5LTQ2MWUtOWRlZS01MzNhZjdjMmU1YjMiLCJzaWQiOiJlOWNhYjgwYi1iYmVhLTQxNzgtYmM2My1iYTBkNGNmZTNiYzgifQ.qsJ6KeeejAvA_C5qoWQeNRHgerK-Oh8aYQnwfDrr0m0",
  "access_expires_at": "2026-10-30T12:54:51.203203849Z",
  "refresh_token": "_eAz2oWfH91A4FNuEUTnjEsyeBaf8iBn_aUlryiSZwQ",
  "refresh_expires_at": "2026-11-29T12:39:51.202721241Z",
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
  "command_id": "5ff10281-7fd7-4bfe-a2cd-c1453a5e734c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:39:51Z",
    "sequence": 1793363991763
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "94a88c4e-41e5-4ef7-a6d6-5c3795f33bd4",
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
  "last_heartbeat_at": "2026-10-30T12:39:51.781442Z",
  "last_location_at": "2026-10-30T12:39:51.781442Z",
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
  "command_id": "98b7c5c3-510f-4fee-90eb-ef05ae334988",
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
  "effective_at": "2026-10-30T12:39:52.354164Z",
  "changed_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T12:37:05.528375Z",
  "last_entries": [
    {
      "order_id": "70dbc9ef-c5ff-4d38-b273-042bab0cef69",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T12:37:05.528375Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "bf3b3c28-bc20-49a3-a71e-d9d119afddea",
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
  "id": "02ed0538-6b6c-4d46-b45a-752fdace7e09",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:44:52.922073Z",
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
  "command_id": "1f63105b-a3a4-4ed1-ae74-dabe67851169",
  "quote_id": "02ed0538-6b6c-4d46-b45a-752fdace7e09",
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
    "phone": "+380671116160"
  }
}
```

```json
{
  "id": "df358b51-45a8-453e-abb3-e889eea3ebc8",
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
  "created_at": "2026-10-30T12:39:53.213675Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671116160"
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
    "id": "90eb1ab1-4ee0-4420-98a2-03dab9820538",
    "order_id": "df358b51-45a8-453e-abb3-e889eea3ebc8",
    "expires_at": "2026-10-30T12:40:08.217129Z",
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

`POST /api/driver/v1/offers/90eb1ab1-4ee0-4420-98a2-03dab9820538/accept` → **200**

```json
{
  "command_id": "4215193f-3bfc-4c8e-84de-868c96227bcb"
}
```

```json
{
  "id": "69c4239e-458e-4642-8b5e-a02a75d417cd",
  "order_id": "df358b51-45a8-453e-abb3-e889eea3ebc8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "48ca2919-ebfe-4b44-a1ca-63a73c86ec5e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "48ca2919-ebfe-4b44-a1ca-63a73c86ec5e",
  "order_id": "df358b51-45a8-453e-abb3-e889eea3ebc8",
  "assignment_id": "69c4239e-458e-4642-8b5e-a02a75d417cd",
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
    "phone": "+380671116160"
  }
}
```

`POST /api/driver/v1/work-sessions/94a88c4e-41e5-4ef7-a6d6-5c3795f33bd4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:39:54Z",
    "sequence": 1793363994368
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "94a88c4e-41e5-4ef7-a6d6-5c3795f33bd4",
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
  "last_heartbeat_at": "2026-10-30T12:39:54.386747Z",
  "last_location_at": "2026-10-30T12:39:54.386747Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/48ca2919-ebfe-4b44-a1ca-63a73c86ec5e/arrive` → **200**

```json
{
  "command_id": "dde51cfc-ab8d-4bc3-89c2-469d86d0f27c",
  "expected_version": 0
}
```

```json
{
  "id": "48ca2919-ebfe-4b44-a1ca-63a73c86ec5e",
  "order_id": "df358b51-45a8-453e-abb3-e889eea3ebc8",
  "assignment_id": "69c4239e-458e-4642-8b5e-a02a75d417cd",
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
  "arrived_at": "2026-10-30T12:39:54.668169Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671116160"
  }
}
```

`POST /api/driver/v1/trips/48ca2919-ebfe-4b44-a1ca-63a73c86ec5e/start` → **200**

```json
{
  "command_id": "e3176498-2434-4118-82a6-feebf729b533",
  "expected_version": 1
}
```

```json
{
  "id": "48ca2919-ebfe-4b44-a1ca-63a73c86ec5e",
  "order_id": "df358b51-45a8-453e-abb3-e889eea3ebc8",
  "assignment_id": "69c4239e-458e-4642-8b5e-a02a75d417cd",
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
  "arrived_at": "2026-10-30T12:39:54.668169Z",
  "started_at": "2026-10-30T12:39:54.96216Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671116160"
  }
}
```

`POST /api/driver/v1/trips/48ca2919-ebfe-4b44-a1ca-63a73c86ec5e/complete` → **200**

```json
{
  "command_id": "82bd300b-dcf0-4797-9124-0642bc8c22f8",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:39:55Z",
  "cash_received": true
}
```

```json
{
  "id": "48ca2919-ebfe-4b44-a1ca-63a73c86ec5e",
  "order_id": "df358b51-45a8-453e-abb3-e889eea3ebc8",
  "assignment_id": "69c4239e-458e-4642-8b5e-a02a75d417cd",
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
  "arrived_at": "2026-10-30T12:39:54.668169Z",
  "started_at": "2026-10-30T12:39:54.96216Z",
  "completed_at": "2026-10-30T12:39:55.258895Z",
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
  "command_id": "cedd1def-f801-42e0-8eea-777a14ce4ec0",
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
  "id": "ae8c5e1b-82de-4ee2-80b6-58ffe325552c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:44:55.556169Z",
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
  "command_id": "4cda6840-8190-4eef-a88f-65210b1167e7",
  "quote_id": "ae8c5e1b-82de-4ee2-80b6-58ffe325552c",
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
    "phone": "+3806711127541"
  }
}
```

```json
{
  "id": "368e54f5-12f3-4b04-b906-dc3bc990dba3",
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
  "created_at": "2026-10-30T12:39:55.862877Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711127541"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/368e54f5-12f3-4b04-b906-dc3bc990dba3` → **200**

```json
{
  "id": "368e54f5-12f3-4b04-b906-dc3bc990dba3",
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
  "created_at": "2026-10-30T12:39:55.862877Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711127541"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/368e54f5-12f3-4b04-b906-dc3bc990dba3/cancel` → **200**

```json
{
  "command_id": "82fd8379-c442-4583-8298-ef7b1556f1c2",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "368e54f5-12f3-4b04-b906-dc3bc990dba3",
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
  "created_at": "2026-10-30T12:39:55.862877Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711127541"
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
  "staff_id": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T12:37:05.528375Z",
  "last_entries": [
    {
      "order_id": "368e54f5-12f3-4b04-b906-dc3bc990dba3",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T12:39:56.479411Z"
    },
    {
      "order_id": "df358b51-45a8-453e-abb3-e889eea3ebc8",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T12:39:55.26369Z"
    },
    {
      "order_id": "70dbc9ef-c5ff-4d38-b273-042bab0cef69",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T12:37:05.528375Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "94a88c4e-41e5-4ef7-a6d6-5c3795f33bd4",
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
  "last_heartbeat_at": "2026-10-30T12:39:54.386747Z",
  "last_location_at": "2026-10-30T12:39:54.386747Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/94a88c4e-41e5-4ef7-a6d6-5c3795f33bd4/close` → **200**

```json
{
  "command_id": "4f438b82-0c06-4d6f-85dc-2a23482fa0ac",
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

Done: operator bonus for fulfilled df358b51-45a8-453e-abb3-e889eea3ebc8 and operator-fault cancellation 368e54f5-12f3-4b04-b906-dc3bc990dba3.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672253909",
  "device_ref": "sandbox-12778"
}
```

```json
{
  "challenge_id": "7007c563-24e8-4551-97e7-9155c0661018",
  "expires_at": "2026-10-30T12:45:00.874971449Z",
  "resend_available_at": "2026-10-30T12:40:01.874971449Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672253909` → **200**

```json
{
  "phone": "+380672253909",
  "audience": "CLIENT",
  "code": "667598",
  "sent_at": "2026-10-30T12:40:00.878377884Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672619097",
  "device_ref": "sandbox-18241",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "c651cf00-5a19-4843-adf0-dacfcf6835b6",
  "expires_at": "2026-10-30T12:45:02.389869484Z",
  "resend_available_at": "2026-10-30T12:40:03.389869484Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672619097` → **200**

```json
{
  "phone": "+380672619097",
  "audience": "CLIENT",
  "code": "169551",
  "sent_at": "2026-10-30T12:40:02.392396403Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672619097",
  "device_ref": "sandbox-19435",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "cedb8e01-0181-4893-af9c-de451abad495",
  "expires_at": "2026-10-30T12:45:03.911424985Z",
  "resend_available_at": "2026-10-30T12:40:04.911424985Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380672619097` → **200**

```json
{
  "phone": "+380672619097",
  "audience": "CLIENT",
  "code": "987119",
  "sent_at": "2026-10-30T12:40:03.914153245Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675480000",
  "device_ref": "sandbox-9823"
}
```

```json
{
  "challenge_id": "fbd1b285-d2d1-4070-aef4-49795578b54f",
  "expires_at": "2026-10-30T12:45:05.434492708Z",
  "resend_available_at": "2026-10-30T12:40:06.434492708Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675480000",
  "device_ref": "sandbox-28952"
}
```

```json
{
  "challenge_id": "3de5ac5b-7852-48fc-93cf-8e830dce3989",
  "expires_at": "2026-10-30T12:45:06.920434549Z",
  "resend_available_at": "2026-10-30T12:40:07.920434549Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675480000` → **200**

```json
{
  "phone": "+380675480000",
  "audience": "CLIENT",
  "code": "937783",
  "sent_at": "2026-10-30T12:40:06.923483569Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675480000",
  "device_ref": "sandbox-9663",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "88756d2a-ba76-4647-a22e-25c8fb721d69",
  "expires_at": "2026-10-30T12:45:08.430149655Z",
  "resend_available_at": "2026-10-30T12:40:09.430149655Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675480000` → **200**

```json
{
  "phone": "+380675480000",
  "audience": "CLIENT",
  "code": "008413",
  "sent_at": "2026-10-30T12:40:08.432934003Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380675480000",
  "device_ref": "sandbox-27500",
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
  "correlation_id": "ecdaa049-644d-4db6-8253-d392c77208bb",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000004776"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "64a3cbfd-9dbf-4e7c-9234-f9889cd98845"
}
```

`GET /sandbox/v1/otp?phone=%2B442000004776` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120014869"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "4eb7cffa-b99f-4d0c-a3e4-30044b20c156"
}
```

`GET /sandbox/v1/otp?phone=%2B37120014869` → **404**

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
  "session_id": "8583594f-1c7d-40b7-81f2-32a25c680b29",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ5MTEsImlhdCI6MTc5MzM2NDAxMSwianRpIjoiM2JkMzllYWQtYjY0Yi00N2IxLTlmN2QtYWI0NDhmMTI4ZWQ0Iiwic2lkIjoiODU4MzU5NGYtMWM3ZC00MGI3LTgxZjItMzJhMjVjNjgwYjI5In0.shx06vU9hDJMbjC7vfyEpvEbcuty1BNAqBepFpWuLg4",
  "access_expires_at": "2026-10-30T12:55:11.151916209Z",
  "refresh_token": "7Ju0uFCYDZHP80wrHJ_EoLB3JtiaOj3nR8hFh2CZtZw",
  "refresh_expires_at": "2026-10-31T00:40:11.151346419Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675480000` → **200**

```json
{
  "deliveries": [
    {
      "id": "adab9a6c-2b6a-454b-9ad5-6ea6af5cad65",
      "challenge_id": "88756d2a-ba76-4647-a22e-25c8fb721d69",
      "phone": "+380675480000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-77a678ab-0f5f-4394-a701-1f50cd68937c",
      "error": null,
      "attempted_at": "2026-10-30T12:40:08.433438Z"
    },
    {
      "id": "b2235d44-6535-45ad-835c-42abc1144cf0",
      "challenge_id": "3de5ac5b-7852-48fc-93cf-8e830dce3989",
      "phone": "+380675480000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-f068a04a-3519-4337-9e09-e435f9d2f367",
      "error": null,
      "attempted_at": "2026-10-30T12:40:06.923902Z"
    },
    {
      "id": "6ec20490-5337-4998-bb3b-dcd41f88aad7",
      "challenge_id": "fbd1b285-d2d1-4070-aef4-49795578b54f",
      "phone": "+380675480000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T12:40:05.437486Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380675480000` → **200**

```json
{
  "phone": "+380675480000",
  "audience": "CLIENT",
  "code": "008413",
  "sent_at": "2026-10-30T12:40:08.432934003Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380672619097` → **200**

```json
{
  "deliveries": [
    {
      "id": "0a5b28d0-88e8-4be9-a87e-3c2807d64316",
      "challenge_id": "cedb8e01-0181-4893-af9c-de451abad495",
      "phone": "+380672619097",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-4a080276-76da-495d-90a7-5639c2424d01",
      "error": null,
      "attempted_at": "2026-10-30T12:40:03.914657Z"
    },
    {
      "id": "34b99e3d-fa94-4058-93e0-efc3976904a6",
      "challenge_id": "c651cf00-5a19-4843-adf0-dacfcf6835b6",
      "phone": "+380672619097",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-b3ab6983-c131-4b03-ba09-8241cd263153",
      "error": null,
      "attempted_at": "2026-10-30T12:40:02.392895Z"
    }
  ]
}
```

Done: SMS to +380672253909; SMS then a call to +380672619097; a failed SMS, two calls and a refused third to +380675480000; +44 and +371 refused.

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
  "session_id": "a49109f9-9606-4ef8-8d79-23269c94e847",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ5MTIsImlhdCI6MTc5MzM2NDAxMiwianRpIjoiNzA0NzgzYWYtZDA0NC00MWUwLTg4MTUtMDY1YzI5M2RiNDFmIiwic2lkIjoiYTQ5MTA5ZjktOTYwNi00ZWY4LThkNzktMjMyNjljOTRlODQ3In0.jlAozVSpdxbwNcFqJLwmdscPNUSK43OmLO0GIMR7Elo",
  "access_expires_at": "2026-10-30T12:55:12.334948021Z",
  "refresh_token": "dml6Ax8N8CFj_cyKOKg5793B35MbkS4dJ23WT-yeF7A",
  "refresh_expires_at": "2026-10-31T00:40:12.334423325Z",
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
  "session_id": "22d91502-f32c-4358-b1a8-9862992a72be",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ5MTIsImlhdCI6MTc5MzM2NDAxMiwianRpIjoiODY2ZmYwMmYtMDQ4Mi00YTEzLWIxZTgtMzhmNGIxNTljZGJiIiwic2lkIjoiMjJkOTE1MDItZjMyYy00MzU4LWIxYTgtOTg2Mjk5MmE3MmJlIn0.YffkrPUOSrIvzygnlRoDRHjtJvft_7acJg_NuOjg1a4",
  "access_expires_at": "2026-10-30T12:55:12.904438101Z",
  "refresh_token": "-LxM-6-yAwJ1MbxeibF-cg9-WW3omqlQyL5SVSOImWA",
  "refresh_expires_at": "2026-10-31T00:40:12.903875776Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
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

`POST /api/admin/v1/staff-extensions/af917cdd-a61b-46d8-a476-ec7ab7598f51` → **200**

```json
{
  "command_id": "1b1c0a8a-135d-47f6-aac5-3efc28537cd2",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "bc7dd076-e81d-46c3-b120-385b999c9cf8",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T12:40:14.045508Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T12:40:14.045508Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "40a27fc4-f789-441a-bbcc-cba9be57b3a5",
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
  "id": "7a123781-901d-4cba-86f1-c7d009833281",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:45:14.600867Z",
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
  "command_id": "75e75b73-0be4-4c1e-9763-dcdc4b2664ad",
  "quote_id": "7a123781-901d-4cba-86f1-c7d009833281",
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
    "phone": "+380676220427"
  }
}
```

```json
{
  "id": "7efbdcf2-3f6b-48be-9fa8-a8cff05a37ac",
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
  "created_at": "2026-10-30T12:40:14.900231Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676220427"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/7efbdcf2-3f6b-48be-9fa8-a8cff05a37ac/calls` → **201**

```json
{
  "command_id": "8db3bc70-2a89-4c6a-967a-c1d14843089c",
  "to": "CALLER"
}
```

```json
{
  "id": "ebb81369-26e8-4606-a549-14cc7f4f7f8b",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
  "order_ids": [
    "7efbdcf2-3f6b-48be-9fa8-a8cff05a37ac"
  ],
  "started_at": "2026-10-30T12:40:15.21079Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/7efbdcf2-3f6b-48be-9fa8-a8cff05a37ac/calls` → **201**

```json
{
  "command_id": "8db3bc70-2a89-4c6a-967a-c1d14843089c",
  "to": "CALLER"
}
```

```json
{
  "id": "ebb81369-26e8-4606-a549-14cc7f4f7f8b",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
  "order_ids": [
    "7efbdcf2-3f6b-48be-9fa8-a8cff05a37ac"
  ],
  "started_at": "2026-10-30T12:40:15.21079Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "ebb81369-26e8-4606-a549-14cc7f4f7f8b",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380676220427",
    "at": "2026-10-30T12:40:15.213366858Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "ebb81369-26e8-4606-a549-14cc7f4f7f8b",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.5625",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "ebb81369-26e8-4606-a549-14cc7f4f7f8b"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "ebb81369-26e8-4606-a549-14cc7f4f7f8b",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=7efbdcf2-3f6b-48be-9fa8-a8cff05a37ac` → **200**

```json
{
  "calls": [
    {
      "id": "ebb81369-26e8-4606-a549-14cc7f4f7f8b",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
      "order_ids": [
        "7efbdcf2-3f6b-48be-9fa8-a8cff05a37ac"
      ],
      "started_at": "2026-10-30T12:40:15.21079Z",
      "answered_at": "2026-10-30T12:40:15.856395Z",
      "ended_at": "2026-10-30T12:40:15.878816Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=7efbdcf2-3f6b-48be-9fa8-a8cff05a37ac` → **200**

```json
{
  "calls": [
    {
      "id": "ebb81369-26e8-4606-a549-14cc7f4f7f8b",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
      "order_ids": [
        "7efbdcf2-3f6b-48be-9fa8-a8cff05a37ac"
      ],
      "started_at": "2026-10-30T12:40:15.21079Z",
      "answered_at": "2026-10-30T12:40:15.856395Z",
      "ended_at": "2026-10-30T12:40:15.878816Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=7efbdcf2-3f6b-48be-9fa8-a8cff05a37ac` → **200**

```json
{
  "calls": [
    {
      "id": "ebb81369-26e8-4606-a549-14cc7f4f7f8b",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
      "order_ids": [
        "7efbdcf2-3f6b-48be-9fa8-a8cff05a37ac"
      ],
      "started_at": "2026-10-30T12:40:15.21079Z",
      "answered_at": "2026-10-30T12:40:15.856395Z",
      "ended_at": "2026-10-30T12:40:15.878816Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=7efbdcf2-3f6b-48be-9fa8-a8cff05a37ac` → **200**

```json
{
  "calls": [
    {
      "id": "ebb81369-26e8-4606-a549-14cc7f4f7f8b",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
      "order_ids": [
        "7efbdcf2-3f6b-48be-9fa8-a8cff05a37ac"
      ],
      "started_at": "2026-10-30T12:40:15.21079Z",
      "answered_at": "2026-10-30T12:40:15.856395Z",
      "ended_at": "2026-10-30T12:40:15.878816Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=7efbdcf2-3f6b-48be-9fa8-a8cff05a37ac` → **200**

```json
{
  "calls": [
    {
      "id": "ebb81369-26e8-4606-a549-14cc7f4f7f8b",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
      "order_ids": [
        "7efbdcf2-3f6b-48be-9fa8-a8cff05a37ac"
      ],
      "started_at": "2026-10-30T12:40:15.21079Z",
      "answered_at": "2026-10-30T12:40:15.856395Z",
      "ended_at": "2026-10-30T12:40:15.878816Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T12:40:24.165986Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/7efbdcf2-3f6b-48be-9fa8-a8cff05a37ac` → **200**

```json
{
  "id": "7efbdcf2-3f6b-48be-9fa8-a8cff05a37ac",
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
  "created_at": "2026-10-30T12:40:14.900231Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676220427"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7efbdcf2-3f6b-48be-9fa8-a8cff05a37ac/cancel` → **200**

```json
{
  "command_id": "5216805f-5d6f-4b82-8f71-6bf1f68e3171",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "7efbdcf2-3f6b-48be-9fa8-a8cff05a37ac",
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
  "created_at": "2026-10-30T12:40:14.900231Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676220427"
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
  "command_id": "51c85860-8ad0-47aa-8c9b-b28850dab948",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T12:40:26.008263Z",
  "extension": "101"
}
```

Done: outgoing call ebb81369-26e8-4606-a549-14cc7f4f7f8b from order 7efbdcf2-3f6b-48be-9fa8-a8cff05a37ac, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636039284",
  "device_ref": "sandbox-16109"
}
```

```json
{
  "challenge_id": "7f99e8c3-cbd2-4e22-ad0b-c7b6eae8a3bc",
  "expires_at": "2026-10-30T12:45:26.323149633Z",
  "resend_available_at": "2026-10-30T12:40:27.323149633Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636039284` → **200**

```json
{
  "phone": "+380636039284",
  "audience": "CLIENT",
  "code": "958364",
  "sent_at": "2026-10-30T12:40:26.325949116Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f99e8c3-cbd2-4e22-ad0b-c7b6eae8a3bc",
  "code": "958364",
  "device_ref": "sandbox-16109"
}
```

```json
{
  "session_id": "85c5993f-7105-455b-aaf9-b19d177b1944",
  "subject": {
    "type": "CLIENT",
    "id": "821c98d0-906e-40f3-8772-cf72398d4304"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MjFjOThkMC05MDZlLTQwZjMtODc3Mi1jZjcyMzk4ZDQzMDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0OTI2LCJpYXQiOjE3OTMzNjQwMjYsImp0aSI6Ijc5ZDg2Y2RmLTEwMWQtNGUyMy1iMDY4LTEwNjM3NzAxYTE4NSIsInNpZCI6Ijg1YzU5OTNmLTcxMDUtNDU1Yi1hYWY5LWIxOWQxNzdiMTk0NCJ9.E7YPGqLc2SLlRspcWAvu20uRYwk4R4O6Llj8TsAmFZQ",
  "access_expires_at": "2026-10-30T12:55:26.621693417Z",
  "refresh_token": "rx53PVTNX6148WvQUOU5UXYnAxEYiPYTd936Ee0tp38",
  "refresh_expires_at": "2026-11-29T12:40:26.621186835Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "821c98d0-906e-40f3-8772-cf72398d4304",
  "session_id": "85c5993f-7105-455b-aaf9-b19d177b1944",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636039284",
  "device_ref": "sandbox-29719"
}
```

```json
{
  "challenge_id": "37b884bb-a3ee-4e5f-913a-90361a2f4b86",
  "expires_at": "2026-10-30T12:45:29.16209605Z",
  "resend_available_at": "2026-10-30T12:40:30.16209605Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636039284` → **200**

```json
{
  "phone": "+380636039284",
  "audience": "CLIENT",
  "code": "333850",
  "sent_at": "2026-10-30T12:40:29.16464429Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "37b884bb-a3ee-4e5f-913a-90361a2f4b86",
  "code": "333850",
  "device_ref": "sandbox-29719"
}
```

```json
{
  "session_id": "cdbc4b57-ef9b-490d-b5a5-b6f8d39ceba2",
  "subject": {
    "type": "CLIENT",
    "id": "821c98d0-906e-40f3-8772-cf72398d4304"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MjFjOThkMC05MDZlLTQwZjMtODc3Mi1jZjcyMzk4ZDQzMDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0OTI5LCJpYXQiOjE3OTMzNjQwMjksImp0aSI6Ijk5MmI5OTg5LTA2MDMtNGRmYS04OGI0LWZlMjAyOWEyOTcyYSIsInNpZCI6ImNkYmM0YjU3LWVmOWItNDkwZC1iNWE1LWI2ZjhkMzljZWJhMiJ9._m2Bj5a7-OfXeLFCd6PaUrKI4e1W4nCUg_b04r8eAGU",
  "access_expires_at": "2026-10-30T12:55:29.475455509Z",
  "refresh_token": "wUk6rBznpwQC5hzlbt4ljNXD5W9bo4EgG2tnJkvuEwk",
  "refresh_expires_at": "2026-11-29T12:40:29.474898883Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "1bdd7fc1-6a26-4eff-b449-aa566a62e302",
  "expires_at": "2026-10-30T12:45:31.757875971Z",
  "resend_available_at": "2026-10-30T12:40:32.757875971Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636039284` → **200**

```json
{
  "phone": "+380636039284",
  "audience": "CLIENT",
  "code": "541725",
  "sent_at": "2026-10-30T12:40:31.761028Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380636154766"
}
```

```json
{
  "challenge_id": "70855e49-81d0-4364-a245-6ada8fc6f02a",
  "expires_at": "2026-10-30T12:45:32.057051995Z",
  "resend_available_at": "2026-10-30T12:40:33.057051995Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636154766` → **200**

```json
{
  "phone": "+380636154766",
  "audience": "CLIENT",
  "code": "357159",
  "sent_at": "2026-10-30T12:40:32.059468905Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "75b8871e-b565-4e02-9faf-2f66c33dd14b",
  "current_challenge_id": "1bdd7fc1-6a26-4eff-b449-aa566a62e302",
  "current_code": "000000",
  "new_challenge_id": "70855e49-81d0-4364-a245-6ada8fc6f02a",
  "new_code": "357159"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "607ad4ea-cab8-44c5-a462-e2f00a04eb2d"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "eb5269a9-8cbd-4b9f-ab67-5f1ec9841386",
  "current_challenge_id": "1bdd7fc1-6a26-4eff-b449-aa566a62e302",
  "current_code": "541725",
  "new_challenge_id": "70855e49-81d0-4364-a245-6ada8fc6f02a",
  "new_code": "357159"
}
```

```json
{
  "subject_id": "821c98d0-906e-40f3-8772-cf72398d4304",
  "phone": "+380636154766",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "821c98d0-906e-40f3-8772-cf72398d4304",
  "session_id": "85c5993f-7105-455b-aaf9-b19d177b1944",
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
  "correlation_id": "e99097a5-9c40-44c9-af45-024f3382462a"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636154766",
  "device_ref": "sandbox-5357"
}
```

```json
{
  "challenge_id": "bba1f9e4-2352-409f-aff4-f77c375e6851",
  "expires_at": "2026-10-30T12:45:35.539952262Z",
  "resend_available_at": "2026-10-30T12:40:36.539952262Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636154766` → **200**

```json
{
  "phone": "+380636154766",
  "audience": "CLIENT",
  "code": "466412",
  "sent_at": "2026-10-30T12:40:35.542796555Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bba1f9e4-2352-409f-aff4-f77c375e6851",
  "code": "466412",
  "device_ref": "sandbox-5357"
}
```

```json
{
  "session_id": "2be48f1e-21bd-4a29-96a3-2239af1f52d8",
  "subject": {
    "type": "CLIENT",
    "id": "821c98d0-906e-40f3-8772-cf72398d4304"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MjFjOThkMC05MDZlLTQwZjMtODc3Mi1jZjcyMzk4ZDQzMDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0OTM1LCJpYXQiOjE3OTMzNjQwMzUsImp0aSI6ImM4YTk3NTRlLWJkMzYtNDdhYS1hZTYzLTJiYjZkZmY1MGNjYyIsInNpZCI6IjJiZTQ4ZjFlLTIxYmQtNGEyOS05NmEzLTIyMzlhZjFmNTJkOCJ9.a-edgNHv2O0C92JnXJDHvV7NgymKr-rPjxUpYuHeUqw",
  "access_expires_at": "2026-10-30T12:55:35.849697379Z",
  "refresh_token": "4B5cr8y1fwBW-cryv9AD0IWMNSfp0s3kApLAaVxtFJ8",
  "refresh_expires_at": "2026-11-29T12:40:35.849139565Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "821c98d0-906e-40f3-8772-cf72398d4304",
  "session_id": "2be48f1e-21bd-4a29-96a3-2239af1f52d8",
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
  "session_id": "c0ed37ac-f238-4a52-b05f-83f5e34dc26e",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ5MzYsImlhdCI6MTc5MzM2NDAzNiwianRpIjoiY2EyOTIxMTYtYzk2MS00MmU3LWIyOTMtNzZlMGUwZTFlMjExIiwic2lkIjoiYzBlZDM3YWMtZjIzOC00YTUyLWIwNWYtODNmNWUzNGRjMjZlIn0.-TBJ2Kg-zSJN10oK8cNBGkwTYU5DCV0RK7tsZ2YyWns",
  "access_expires_at": "2026-10-30T12:55:36.70862167Z",
  "refresh_token": "_IoN7m5AwOWHWex_K_VrMtzXd9w9pirICT7UjfrBZ0M",
  "refresh_expires_at": "2026-10-31T00:40:36.708050932Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/821c98d0-906e-40f3-8772-cf72398d4304` → **200**

```json
{
  "client": {
    "id": "821c98d0-906e-40f3-8772-cf72398d4304",
    "phone": "+380636154766",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T12:40:26.619708Z",
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

`POST /api/admin/v1/clients/821c98d0-906e-40f3-8772-cf72398d4304/phone/new-code` → **201**

```json
{
  "phone": "+380634614265"
}
```

```json
{
  "challenge_id": "d02109b9-ac0a-476b-9c88-f679344b2788",
  "expires_at": "2026-10-30T12:45:37.297609613Z",
  "resend_available_at": "2026-10-30T12:40:38.297609613Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634614265` → **200**

```json
{
  "phone": "+380634614265",
  "audience": "CLIENT",
  "code": "102308",
  "sent_at": "2026-10-30T12:40:37.300082376Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/821c98d0-906e-40f3-8772-cf72398d4304/phone` → **422**

```json
{
  "command_id": "6e99592d-6d08-4dfe-bea2-4a82d5e9bee4",
  "expected_version": 3,
  "new_challenge_id": "d02109b9-ac0a-476b-9c88-f679344b2788",
  "new_code": "102309",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/821c98d0-906e-40f3-8772-cf72398d4304/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "e5dc788a-0601-4b3f-abe0-7ac3309c57de"
}
```

`POST /api/admin/v1/clients/821c98d0-906e-40f3-8772-cf72398d4304/phone` → **400**

```json
{
  "command_id": "2d8bec83-4595-4dc4-a174-11285f8ba991",
  "expected_version": 3,
  "new_challenge_id": "d02109b9-ac0a-476b-9c88-f679344b2788",
  "new_code": "102308",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/821c98d0-906e-40f3-8772-cf72398d4304/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "097c8d80-fcc4-4a6a-9a69-51d08e7b35bb",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/821c98d0-906e-40f3-8772-cf72398d4304/phone` → **200**

```json
{
  "command_id": "04bbf3a2-8c55-4a6b-8b4c-4b2cdfc4cd46",
  "expected_version": 3,
  "new_challenge_id": "d02109b9-ac0a-476b-9c88-f679344b2788",
  "new_code": "102308",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "821c98d0-906e-40f3-8772-cf72398d4304",
  "phone": "+380634614265",
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
  "correlation_id": "579bc15d-2db3-4679-826e-7dc0cbee8e85"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634614265",
  "device_ref": "sandbox-15202"
}
```

```json
{
  "challenge_id": "9b279b09-94c4-432d-a2f3-b63d9abe16c7",
  "expires_at": "2026-10-30T12:45:38.748838002Z",
  "resend_available_at": "2026-10-30T12:40:39.748838002Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634614265` → **200**

```json
{
  "phone": "+380634614265",
  "audience": "CLIENT",
  "code": "132880",
  "sent_at": "2026-10-30T12:40:38.751659527Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9b279b09-94c4-432d-a2f3-b63d9abe16c7",
  "code": "132880",
  "device_ref": "sandbox-15202"
}
```

```json
{
  "session_id": "02c114fd-6c38-478e-bfd1-613c71fb2c31",
  "subject": {
    "type": "CLIENT",
    "id": "821c98d0-906e-40f3-8772-cf72398d4304"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MjFjOThkMC05MDZlLTQwZjMtODc3Mi1jZjcyMzk4ZDQzMDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0OTM5LCJpYXQiOjE3OTMzNjQwMzksImp0aSI6IjdjYjMwNGI3LTljZjItNGVlZi04Nzc1LTRkNGRmYzFjNWE0OSIsInNpZCI6IjAyYzExNGZkLTZjMzgtNDc4ZS1iZmQxLTYxM2M3MWZiMmMzMSJ9.Kr6Tqz416LPlUucnEMFFJgZDz6JYXP2pMHPHr6eNVH0",
  "access_expires_at": "2026-10-30T12:55:39.062072139Z",
  "refresh_token": "en7B9I-zt_tVOcMmoaREPLdSpauWUAqB9b5yfDntszI",
  "refresh_expires_at": "2026-11-29T12:40:39.061496414Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "821c98d0-906e-40f3-8772-cf72398d4304",
  "session_id": "02c114fd-6c38-478e-bfd1-613c71fb2c31",
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
  "phone": "+380633478435",
  "device_ref": "sandbox-8912"
}
```

```json
{
  "challenge_id": "57ea99d4-3af9-4bb7-91ed-576e814c38b0",
  "expires_at": "2026-10-30T12:45:39.61842257Z",
  "resend_available_at": "2026-10-30T12:40:40.61842257Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633478435` → **200**

```json
{
  "phone": "+380633478435",
  "audience": "CLIENT",
  "code": "068204",
  "sent_at": "2026-10-30T12:40:39.621121086Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "57ea99d4-3af9-4bb7-91ed-576e814c38b0",
  "code": "068204",
  "device_ref": "sandbox-8912"
}
```

```json
{
  "session_id": "8ca325b4-4576-41c5-860a-414d825de916",
  "subject": {
    "type": "CLIENT",
    "id": "81915690-231d-40a4-83f9-d4fed6df3da1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MTkxNTY5MC0yMzFkLTQwYTQtODNmOS1kNGZlZDZkZjNkYTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0OTM5LCJpYXQiOjE3OTMzNjQwMzksImp0aSI6ImRiNDNhZTE5LWM4ZjYtNGE4My05NmQxLWNiMzY5NzhlZjlhNyIsInNpZCI6IjhjYTMyNWI0LTQ1NzYtNDFjNS04NjBhLTQxNGQ4MjVkZTkxNiJ9.RCsQNm_ND8ATKOQiOqXaJA_GhItDT3W0ijtBljbRgWI",
  "access_expires_at": "2026-10-30T12:55:39.92521472Z",
  "refresh_token": "mubBFZBhlURXvRbT359K_lRx7dMOviSMjqBfPYWYa5A",
  "refresh_expires_at": "2026-11-29T12:40:39.924693897Z",
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
  "session_id": "7442f249-996d-4d4a-9d02-f7eac88d21c9",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ5NDEsImlhdCI6MTc5MzM2NDA0MSwianRpIjoiOTZjN2RkYzEtYmZkNi00NjQyLWJmYWUtOWI1NmI2ZWQ5ZDcxIiwic2lkIjoiNzQ0MmYyNDktOTk2ZC00ZDRhLTlkMDItZjdlYWM4OGQyMWM5In0.sHnKJVSIr5xLyIaVcSjC9dnvPYMi2WX1JcoTgpbbqMQ",
  "access_expires_at": "2026-10-30T12:55:41.069100157Z",
  "refresh_token": "bu0zW0lzIljgpnoaS377-xYscOyiT5R3Cm_jNqq_bd8",
  "refresh_expires_at": "2026-10-31T00:40:41.068542134Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380633478435` → **200**

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
  "correlation_id": "59cfc1ed-67a2-4959-a511-377f2413c4f9"
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
  "session_id": "0c53c87a-9a8b-4040-8b03-3f18cdbc8cd8",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ5NDIsImlhdCI6MTc5MzM2NDA0MiwianRpIjoiNWI0MGQ3ODItNjM5Zi00YWU4LThmZmYtYTdhYTk2ZjQ1OWIwIiwic2lkIjoiMGM1M2M4N2EtOWE4Yi00MDQwLThiMDMtM2YxOGNkYmM4Y2Q4In0.RijcVj_5Y2Zzis2NIB2M75DGdNq7bXyWMhmI5JtbqTI",
  "access_expires_at": "2026-10-30T12:55:42.24887261Z",
  "refresh_token": "5mEuDAx0tZcOZcOBz4UHSGnCb4EbNYa1I68MKDm7aXU",
  "refresh_expires_at": "2026-10-31T00:40:42.248100601Z",
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
    }
  },
  "changed_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T12:36:13.768667Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "3a13392b-f38a-4c3c-b95d-7c580c6f25f0",
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
    }
  },
  "changed_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T12:40:42.820085239Z"
}
```

## The rider books the airport for 2026-10-30T15:40:41Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600482933",
  "device_ref": "sandbox-12785"
}
```

```json
{
  "challenge_id": "fc94890b-d5fd-41ad-a970-9480df89be1b",
  "expires_at": "2026-10-30T12:45:43.1137167Z",
  "resend_available_at": "2026-10-30T12:40:44.1137167Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600482933` → **200**

```json
{
  "phone": "+48600482933",
  "audience": "CLIENT",
  "code": "499583",
  "sent_at": "2026-10-30T12:40:43.116848799Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fc94890b-d5fd-41ad-a970-9480df89be1b",
  "code": "499583",
  "device_ref": "sandbox-12785"
}
```

```json
{
  "session_id": "e83441f9-c76b-4c7b-88fb-4bc0c702e692",
  "subject": {
    "type": "CLIENT",
    "id": "80f7f843-8631-446f-ab13-cb056738b957"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MGY3Zjg0My04NjMxLTQ0NmYtYWIxMy1jYjA1NjczOGI5NTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0OTQzLCJpYXQiOjE3OTMzNjQwNDMsImp0aSI6ImFhM2E4OGI1LWQ2NDYtNGYyNC05MjQyLWIxYjZmZDM5OGYyZSIsInNpZCI6ImU4MzQ0MWY5LWM3NmItNGM3Yi04OGZiLTRiYzBjNzAyZTY5MiJ9.akI125tjSo732T2BixBLEVIh7Ta5A7urS5Egn2lqVBw",
  "access_expires_at": "2026-10-30T12:55:43.419311587Z",
  "refresh_token": "OiWeUoUzPUvQiOk2cdplJuDx0E_Bc-zWq9Dom-gCNnw",
  "refresh_expires_at": "2026-11-29T12:40:43.418776105Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1db0012c-8721-4c1e-b9e9-4156b9443aa9",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T15:40:41Z"
}
```

```json
{
  "id": "34cda1e4-ec17-4a2a-b339-8b01a527b63d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:45:43.705582Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T15:40:41Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a0c01019-10c2-4782-8e0a-4b1556c44b04",
  "quote_id": "34cda1e4-ec17-4a2a-b339-8b01a527b63d",
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
  "pickup_at": "2026-10-30T15:40:41Z"
}
```

```json
{
  "id": "4ff53f22-13b0-48d5-b33d-0de36b5b8713",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "80f7f843-8631-446f-ab13-cb056738b957",
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
  "created_at": "2026-10-30T12:40:44.002757Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T15:40:41Z",
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
  "device_ref": "sandbox-5574"
}
```

```json
{
  "challenge_id": "3abb47d9-6e97-4c60-8065-d54ce95d4444",
  "expires_at": "2026-10-30T12:45:44.294829616Z",
  "resend_available_at": "2026-10-30T12:40:45.294829616Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "524538",
  "sent_at": "2026-10-30T12:40:44.297488678Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3abb47d9-6e97-4c60-8065-d54ce95d4444",
  "code": "524538",
  "device_ref": "sandbox-5574"
}
```

```json
{
  "session_id": "b6420330-3797-4f84-8a01-a8a9a7bd7434",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDk0NCwiaWF0IjoxNzkzMzY0MDQ0LCJqdGkiOiI0YTBlMTg5NC03OTE3LTQzYzEtODk5Mi1jYmYzMTYyNTkyMTIiLCJzaWQiOiJiNjQyMDMzMC0zNzk3LTRmODQtOGEwMS1hOGE5YTdiZDc0MzQifQ.Iqre31_r1tKP9hyXTzOEX4HqONN55Cb4_AMCiPfapJE",
  "access_expires_at": "2026-10-30T12:55:44.608904766Z",
  "refresh_token": "U74Q1H60HcsyNUky9JOkNaPboI8KjExG3QDLR6Xvk-U",
  "refresh_expires_at": "2026-11-29T12:40:44.608374375Z",
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
  "command_id": "9e5610a1-7cab-41d7-8d49-b71c957db4b9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:40:45Z",
    "sequence": 1793364045174
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "54212083-14a1-4ad5-b97e-8a964a4769e1",
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
  "last_heartbeat_at": "2026-10-30T12:40:45.191985Z",
  "last_location_at": "2026-10-30T12:40:45.191985Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "4ff53f22-13b0-48d5-b33d-0de36b5b8713",
      "short_number": 25,
      "pickup_at": "2026-10-30T15:40:41Z",
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

`POST /api/driver/v1/preorders/4ff53f22-13b0-48d5-b33d-0de36b5b8713/reserve` → **200**

```json
{
  "command_id": "a36723af-390d-4bb1-ba83-b612d3d1cbb4"
}
```

```json
{
  "id": "1f9632bd-eb06-4aef-a930-b4621f2cf6b8",
  "state": "RESERVED",
  "order": {
    "order_id": "4ff53f22-13b0-48d5-b33d-0de36b5b8713",
    "short_number": 25,
    "pickup_at": "2026-10-30T15:40:41Z",
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
  "reserved_at": "2026-10-30T12:40:45.760845Z",
  "confirm_from": "2026-10-30T15:10:41Z",
  "confirm_until": "2026-10-30T15:20:41Z",
  "drop_until": "2026-10-30T14:40:41Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "1f9632bd-eb06-4aef-a930-b4621f2cf6b8",
      "state": "RESERVED",
      "order": {
        "order_id": "4ff53f22-13b0-48d5-b33d-0de36b5b8713",
        "short_number": 25,
        "pickup_at": "2026-10-30T15:40:41Z",
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
      "reserved_at": "2026-10-30T12:40:45.760845Z",
      "confirm_from": "2026-10-30T15:10:41Z",
      "confirm_until": "2026-10-30T15:20:41Z",
      "drop_until": "2026-10-30T14:40:41Z"
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
      "id": "1f9632bd-eb06-4aef-a930-b4621f2cf6b8",
      "state": "RESERVED",
      "order": {
        "order_id": "4ff53f22-13b0-48d5-b33d-0de36b5b8713",
        "short_number": 25,
        "pickup_at": "2026-10-30T15:40:41Z",
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
      "reserved_at": "2026-10-30T12:40:45.760845Z",
      "confirm_from": "2026-10-30T15:10:41Z",
      "confirm_until": "2026-10-30T15:20:41Z",
      "drop_until": "2026-10-30T14:40:41Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/1f9632bd-eb06-4aef-a930-b4621f2cf6b8/confirm` → **409**

```json
{
  "command_id": "ae88a102-6c70-4b67-a386-106c5ceeba32"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/1f9632bd-eb06-4aef-a930-b4621f2cf6b8/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2544b5d1-8de7-4b86-b072-6da478613307"
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
  "session_id": "2234cd8e-d659-4ca8-bbe1-993f0685bcf1",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ5NDcsImlhdCI6MTc5MzM2NDA0NywianRpIjoiZTY1OGZjNWQtY2ZhYS00NTJiLTgzOWQtNzBkN2ZjOGQyZWIwIiwic2lkIjoiMjIzNGNkOGUtZDY1OS00Y2E4LWJiZTEtOTkzZjA2ODViY2YxIn0.ZrnS_SdoUegNsp4us90FzzoZHZhmOZGXRaN-XM6OKm8",
  "access_expires_at": "2026-10-30T12:55:47.188081218Z",
  "refresh_token": "PpxUBGFE3gkDsGzZG71QKOoRs-B9YebQF2L2ES5czY8",
  "refresh_expires_at": "2026-10-31T00:40:47.187522831Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4ff53f22-13b0-48d5-b33d-0de36b5b8713` → **200**

```json
{
  "id": "4ff53f22-13b0-48d5-b33d-0de36b5b8713",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "80f7f843-8631-446f-ab13-cb056738b957",
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
  "created_at": "2026-10-30T12:40:44.002757Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T15:40:41Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "1f9632bd-eb06-4aef-a930-b4621f2cf6b8",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T12:40:45.760845Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/4ff53f22-13b0-48d5-b33d-0de36b5b8713/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T12:40:44.004053Z",
      "actor": {
        "type": "CLIENT",
        "id": "80f7f843-8631-446f-ab13-cb056738b957",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "4ff53f22-13b0-48d5-b33d-0de36b5b8713",
        "preorder": true,
        "quote_id": "34cda1e4-ec17-4a2a-b339-8b01a527b63d",
        "pickup_at": "2026-10-30T15:40:41Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "144214d6-9e03-4faf-9fe4-bf218758fdd0"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T12:40:45.761944Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4ff53f22-13b0-48d5-b33d-0de36b5b8713",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "1f9632bd-eb06-4aef-a930-b4621f2cf6b8"
      },
      "correlation_id": "29f54e83-65d6-4976-82e6-4fd8d93f6463"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 4ff53f22-13b0-48d5-b33d-0de36b5b8713, reservation 1f9632bd-eb06-4aef-a930-b4621f2cf6b8.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6403"
}
```

```json
{
  "challenge_id": "e226acbb-18bb-4ffc-8f29-0b078a3e4add",
  "expires_at": "2026-10-30T12:45:48.054574348Z",
  "resend_available_at": "2026-10-30T12:40:49.054574348Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "668060",
  "sent_at": "2026-10-30T12:40:48.057245293Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e226acbb-18bb-4ffc-8f29-0b078a3e4add",
  "code": "668060",
  "device_ref": "sandbox-6403"
}
```

```json
{
  "session_id": "8c22a021-2dc6-4110-93db-1cd9d9092a28",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDk0OCwiaWF0IjoxNzkzMzY0MDQ4LCJqdGkiOiIxNTQxZjYxOC1mYmNiLTQyZDQtYWJiYS05YTM0YzRiNDNiMGUiLCJzaWQiOiI4YzIyYTAyMS0yZGM2LTQxMTAtOTNkYi0xY2Q5ZDkwOTJhMjgifQ.U_z3vdYY7NqrNuxC80gk1clwnA6evBZfCVadriYKF4U",
  "access_expires_at": "2026-10-30T12:55:48.362098293Z",
  "refresh_token": "_zri8nmJUJO2UU9TGzD5J2cjSaQI8L9BR1yfmt2U_ZQ",
  "refresh_expires_at": "2026-11-29T12:40:48.361591041Z",
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
  "command_id": "2345413a-ce36-41ef-a662-e9071f5d5ffc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:40:48Z",
    "sequence": 1793364048913
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5aa91ff3-3d7b-442a-a20c-59f240fe33e6",
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
  "last_heartbeat_at": "2026-10-30T12:40:48.931071Z",
  "last_location_at": "2026-10-30T12:40:48.931071Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676200061",
  "device_ref": "sandbox-3942"
}
```

```json
{
  "challenge_id": "0f74009e-d77f-4ef6-bdcf-52b5a4f528d8",
  "expires_at": "2026-10-30T12:45:49.221261609Z",
  "resend_available_at": "2026-10-30T12:40:50.221261609Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676200061` → **200**

```json
{
  "phone": "+380676200061",
  "audience": "CLIENT",
  "code": "121329",
  "sent_at": "2026-10-30T12:40:49.224363609Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0f74009e-d77f-4ef6-bdcf-52b5a4f528d8",
  "code": "121329",
  "device_ref": "sandbox-3942"
}
```

```json
{
  "session_id": "f03ad235-e54a-4303-9822-16e2905204c5",
  "subject": {
    "type": "CLIENT",
    "id": "8895f839-c0eb-4b67-8f2e-26e33cb4418d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODk1ZjgzOS1jMGViLTRiNjctOGYyZS0yNmUzM2NiNDQxOGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0OTQ5LCJpYXQiOjE3OTMzNjQwNDksImp0aSI6IjAyYjNjY2QyLWI4OGQtNGU3Yy05NWZkLTY0M2FiMjQzMjdjMSIsInNpZCI6ImYwM2FkMjM1LWU1NGEtNDMwMy05ODIyLTE2ZTI5MDUyMDRjNSJ9.ciRK37Pv_fmTXjxehVlgFbpd9hCJaDdu6PJlNrvJPXA",
  "access_expires_at": "2026-10-30T12:55:49.536089653Z",
  "refresh_token": "2l6tRn-wwOs91ZGSSBvzxKoEkLrvkKjMXzJQ71oksUo",
  "refresh_expires_at": "2026-11-29T12:40:49.535590527Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "afe5a086-5c9f-4a81-8db7-dd596826ea44",
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
  "id": "075448a9-4031-41c9-8047-8b7ccc19845a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:45:49.828490Z",
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
  "command_id": "66c232d4-b002-4133-912f-c05d0cf42862",
  "quote_id": "075448a9-4031-41c9-8047-8b7ccc19845a",
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
  "id": "d8166b00-73f9-47e1-8af2-960ac24b7815",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8895f839-c0eb-4b67-8f2e-26e33cb4418d",
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
  "created_at": "2026-10-30T12:40:50.121358Z",
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
    "id": "888f77b8-0593-4765-9c81-3ae2ca509aa8",
    "order_id": "d8166b00-73f9-47e1-8af2-960ac24b7815",
    "expires_at": "2026-10-30T12:41:05.124235Z",
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

`POST /api/driver/v1/offers/888f77b8-0593-4765-9c81-3ae2ca509aa8/accept` → **200**

```json
{
  "command_id": "37a3d0ca-2257-4ca8-8e3f-94ddce63c3ff"
}
```

```json
{
  "id": "e5753622-f4ba-458b-8a86-42fa019a7328",
  "order_id": "d8166b00-73f9-47e1-8af2-960ac24b7815",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ef437308-6ee3-436c-8019-441c709963de",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ef437308-6ee3-436c-8019-441c709963de",
  "order_id": "d8166b00-73f9-47e1-8af2-960ac24b7815",
  "assignment_id": "e5753622-f4ba-458b-8a86-42fa019a7328",
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

`POST /api/driver/v1/work-sessions/5aa91ff3-3d7b-442a-a20c-59f240fe33e6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:40:51Z",
    "sequence": 1793364051242
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5aa91ff3-3d7b-442a-a20c-59f240fe33e6",
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
  "last_heartbeat_at": "2026-10-30T12:40:51.262545Z",
  "last_location_at": "2026-10-30T12:40:51.262545Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ef437308-6ee3-436c-8019-441c709963de",
  "order_id": "d8166b00-73f9-47e1-8af2-960ac24b7815",
  "assignment_id": "e5753622-f4ba-458b-8a86-42fa019a7328",
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

`POST /api/driver/v1/trips/ef437308-6ee3-436c-8019-441c709963de/arrive` → **200**

```json
{
  "command_id": "757cb292-9509-47f5-84ec-f7f5c8fb1eb4",
  "expected_version": 0
}
```

```json
{
  "id": "ef437308-6ee3-436c-8019-441c709963de",
  "order_id": "d8166b00-73f9-47e1-8af2-960ac24b7815",
  "assignment_id": "e5753622-f4ba-458b-8a86-42fa019a7328",
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
  "arrived_at": "2026-10-30T12:40:51.843168Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ef437308-6ee3-436c-8019-441c709963de/start` → **200**

```json
{
  "command_id": "a6eb2a0c-18c0-4aed-b26c-3d3d6cf02630",
  "expected_version": 1
}
```

```json
{
  "id": "ef437308-6ee3-436c-8019-441c709963de",
  "order_id": "d8166b00-73f9-47e1-8af2-960ac24b7815",
  "assignment_id": "e5753622-f4ba-458b-8a86-42fa019a7328",
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
  "arrived_at": "2026-10-30T12:40:51.843168Z",
  "started_at": "2026-10-30T12:40:52.144624Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/5aa91ff3-3d7b-442a-a20c-59f240fe33e6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:40:52Z",
    "sequence": 1793364052425
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5aa91ff3-3d7b-442a-a20c-59f240fe33e6",
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
  "last_heartbeat_at": "2026-10-30T12:40:52.443664Z",
  "last_location_at": "2026-10-30T12:40:52.443664Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/ef437308-6ee3-436c-8019-441c709963de/complete` → **200**

```json
{
  "command_id": "ebb8232a-476b-4ef5-a93e-5ef16e045178",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:40:52Z",
  "cash_received": true
}
```

```json
{
  "id": "ef437308-6ee3-436c-8019-441c709963de",
  "order_id": "d8166b00-73f9-47e1-8af2-960ac24b7815",
  "assignment_id": "e5753622-f4ba-458b-8a86-42fa019a7328",
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
  "arrived_at": "2026-10-30T12:40:51.843168Z",
  "started_at": "2026-10-30T12:40:52.144624Z",
  "completed_at": "2026-10-30T12:40:52.725267Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/d8166b00-73f9-47e1-8af2-960ac24b7815/rating` → **200**

```json
{
  "command_id": "3f65ce08-47bc-4100-9ec5-3bde3ffe99c2",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "d8166b00-73f9-47e1-8af2-960ac24b7815",
  "score": 5,
  "created_at": "2026-10-30T12:40:53.02600667Z"
}
```

`POST /api/driver/v1/orders/d8166b00-73f9-47e1-8af2-960ac24b7815/rating` → **200**

```json
{
  "command_id": "90ae4e4d-7f49-43cb-b1e0-4021cfe6f1a7",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "d8166b00-73f9-47e1-8af2-960ac24b7815",
  "score": 4,
  "created_at": "2026-10-30T12:40:53.314173393Z"
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
  "session_id": "ffba767c-891f-4582-b9e5-2bb43a671cfa",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ5NTQsImlhdCI6MTc5MzM2NDA1NCwianRpIjoiZmE5YTlhNGEtODlhOS00OTkzLTk4ZDAtZDRkNjQwOTE3NThjIiwic2lkIjoiZmZiYTc2N2MtODkxZi00NTgyLWI5ZTUtMmJiNDNhNjcxY2ZhIn0.sL0k-PRF4MOVXaJ1QA10VCrrKXVZ0LARzDby6Dt4BMY",
  "access_expires_at": "2026-10-30T12:55:54.185563658Z",
  "refresh_token": "hIgc5N4gd6diuTnoep2hBexc1Vb3gN3a78zwMr0sjvE",
  "refresh_expires_at": "2026-10-31T00:40:54.184996265Z",
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
  "session_id": "8f743373-e8ce-4afd-a202-a2f756587d3e",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ5NTQsImlhdCI6MTc5MzM2NDA1NCwianRpIjoiY2Q1OWUzZGYtM2FiNi00ZTY2LThjZGMtZjQ0OTAyNTQ1NzUxIiwic2lkIjoiOGY3NDMzNzMtZThjZS00YWZkLWEyMDItYTJmNzU2NTg3ZDNlIn0.srJs_U2SiMvt5PdIYz_hLVKWBPz_tp1RDIVFLi6idb8",
  "access_expires_at": "2026-10-30T12:55:54.765554208Z",
  "refresh_token": "K7-nu33QKlqdPYi9stP74nSlWiMwEUFwnYq6rM8m_Ds",
  "refresh_expires_at": "2026-10-31T00:40:54.764949766Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d8166b00-73f9-47e1-8af2-960ac24b7815/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "d8166b00-73f9-47e1-8af2-960ac24b7815",
      "author_type": "RIDER",
      "author_id": "8895f839-c0eb-4b67-8f2e-26e33cb4418d",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T12:40:53.026007Z"
    },
    {
      "order_id": "d8166b00-73f9-47e1-8af2-960ac24b7815",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "8895f839-c0eb-4b67-8f2e-26e33cb4418d",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T12:40:53.314173Z"
    }
  ]
}
```

Done: ratings for order d8166b00-73f9-47e1-8af2-960ac24b7815.

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
  "session_id": "95b68aa2-18fc-4f7b-9888-0a393e79e5ad",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ5NTUsImlhdCI6MTc5MzM2NDA1NSwianRpIjoiYjcyZTBkZjUtMzM1MC00MzVmLWIzYTgtZWU3MzAyNTcwOTYxIiwic2lkIjoiOTViNjhhYTItMThmYy00ZjdiLTk4ODgtMGEzOTNlNzllNWFkIn0.Nn5cvDAYSI8zgX0v7migJBgsT44Y_VntP-5zaahvAPk",
  "access_expires_at": "2026-10-30T12:55:55.649471336Z",
  "refresh_token": "KQfiuLquyF2Y05ZdfNd34be80EAIC25ff6LNn-10DU0",
  "refresh_expires_at": "2026-10-31T00:40:55.648873336Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "67ee5e90-8493-402f-b93c-e1364a0309df",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "539d0994-e9d9-466f-be28-bace44b0943c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:40:55.934824Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/539d0994-e9d9-466f-be28-bace44b0943c` → **200**

```json
{
  "id": "539d0994-e9d9-466f-be28-bace44b0943c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:40:55.934824Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/539d0994-e9d9-466f-be28-bace44b0943c` → **200**

```json
{
  "id": "539d0994-e9d9-466f-be28-bace44b0943c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:40:55.934824Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/539d0994-e9d9-466f-be28-bace44b0943c` → **200**

```json
{
  "id": "539d0994-e9d9-466f-be28-bace44b0943c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:40:55.934824Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/539d0994-e9d9-466f-be28-bace44b0943c` → **200**

```json
{
  "id": "539d0994-e9d9-466f-be28-bace44b0943c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T12:40:55.934824Z",
  "ready_at": "2026-10-30T12:40:59.2206Z",
  "expires_at": "2026-10-31T12:40:59.2206Z"
}
```

`GET /api/admin/v1/reports/exports/539d0994-e9d9-466f-be28-bace44b0943c/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "17b90b4a-0dd5-4703-82f6-235005c6403d",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "5f3277df-22f0-45d8-bd39-61114b308495",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:41:00.391864Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5f3277df-22f0-45d8-bd39-61114b308495` → **200**

```json
{
  "id": "5f3277df-22f0-45d8-bd39-61114b308495",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:41:00.391864Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5f3277df-22f0-45d8-bd39-61114b308495` → **200**

```json
{
  "id": "5f3277df-22f0-45d8-bd39-61114b308495",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:41:00.391864Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5f3277df-22f0-45d8-bd39-61114b308495` → **200**

```json
{
  "id": "5f3277df-22f0-45d8-bd39-61114b308495",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:41:00.391864Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5f3277df-22f0-45d8-bd39-61114b308495` → **200**

```json
{
  "id": "5f3277df-22f0-45d8-bd39-61114b308495",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T12:41:00.391864Z",
  "ready_at": "2026-10-30T12:41:04.227734Z",
  "expires_at": "2026-10-31T12:41:04.227734Z"
}
```

`GET /api/admin/v1/reports/exports/5f3277df-22f0-45d8-bd39-61114b308495/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/e6e91458-c59b-4d0d-9ab1-98ca0504f7ec` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/e6e91458-c59b-4d0d-9ab1-98ca0504f7ec",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f0aed8ec-0fbe-4d7b-a3ee-731bd182ef0d"
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
  "device_ref": "sandbox-188"
}
```

```json
{
  "challenge_id": "d84bcb98-e639-4286-b3e4-5f8fa750f456",
  "expires_at": "2026-10-30T12:46:05.142418126Z",
  "resend_available_at": "2026-10-30T12:41:06.142418126Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "518245",
  "sent_at": "2026-10-30T12:41:05.145508151Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d84bcb98-e639-4286-b3e4-5f8fa750f456",
  "code": "518245",
  "device_ref": "sandbox-188"
}
```

```json
{
  "session_id": "9e4273ac-eae4-40e9-bc94-d10db256e475",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDk2NSwiaWF0IjoxNzkzMzY0MDY1LCJqdGkiOiJlZDc4MTY1Ny1hNGIwLTRmYTAtODA0OS0zNTNkZTM0MDAxNDIiLCJzaWQiOiI5ZTQyNzNhYy1lYWU0LTQwZTktYmM5NC1kMTBkYjI1NmU0NzUifQ.vCv-kOOZWxOWkHEM3-ZYNceb5SVM6pCRZJpixcLcqEg",
  "access_expires_at": "2026-10-30T12:56:05.439186023Z",
  "refresh_token": "9Yu_Ka5KRaKTIKuvcHz7NPXzH7vb5_U1UNrHsgzUSlk",
  "refresh_expires_at": "2026-11-29T12:41:05.438643395Z",
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
  "command_id": "46622b67-3c90-425e-ad0c-a20bae6af3cc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:41:06Z",
    "sequence": 1793364066255
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3ae308da-633d-48f6-be47-953f03f2af70",
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
  "last_heartbeat_at": "2026-10-30T12:41:06.273088Z",
  "last_location_at": "2026-10-30T12:41:06.273088Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "cd813c5b-8f40-487c-9759-2a9b91b151a9",
  "points": [
    {
      "sequence": 1793364068549,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T12:40:08Z"
    },
    {
      "sequence": 1793364068556,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T12:41:08Z"
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
  "session_id": "8552c6c4-4999-41ac-8afb-472b43f22626",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ5NjksImlhdCI6MTc5MzM2NDA2OSwianRpIjoiNTMzZmI4YzktMDE5OC00NzZmLWFhNzYtNWRlMjZjOGIyNmFhIiwic2lkIjoiODU1MmM2YzQtNDk5OS00MWFjLThhZmItNDcyYjQzZjIyNjI2In0.es2wKQPY0R_l2xA32jrVzhzryCqrEoek4crzkhdKrTo",
  "access_expires_at": "2026-10-30T12:56:09.164819652Z",
  "refresh_token": "qNjPBts_JHWP7gycthS8-m0E2rZ1zvl_TgTnvKl2HPQ",
  "refresh_expires_at": "2026-10-31T00:41:09.164223034Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "ebebc435-6b70-4e58-adeb-118dafc0435a",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T12:41:08Z",
        "track_point_id": "4add4ac6-4417-413d-b50e-ad9e6477c6d6",
        "work_session_id": "3ae308da-633d-48f6-be47-953f03f2af70"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T12:41:08Z",
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

`POST /api/admin/v1/driver-risk-flags/ebebc435-6b70-4e58-adeb-118dafc0435a/confirm` → **200**

```json
{
  "command_id": "f60bd2d0-4b94-4540-8635-27415956f8c9",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "ebebc435-6b70-4e58-adeb-118dafc0435a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T12:41:08Z",
    "track_point_id": "4add4ac6-4417-413d-b50e-ad9e6477c6d6",
    "work_session_id": "3ae308da-633d-48f6-be47-953f03f2af70"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T12:41:08Z",
  "reason": null,
  "reviewed_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
  "reviewed_at": "2026-10-30T12:41:10.064528Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/ebebc435-6b70-4e58-adeb-118dafc0435a/dismiss` → **409**

```json
{
  "command_id": "6afc086f-a846-483a-8b9a-4ac72650c3ac",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/ebebc435-6b70-4e58-adeb-118dafc0435a/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4b9f5ac5-d121-4a33-8315-3a2796d873b0"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "a1dc5168-4a91-4000-8cdb-2e85d9e0fed5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "6f9681fa-9fe1-489e-a135-197254fd61a3",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
  "raised_at": "2026-10-30T12:41:10.65939Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/6f9681fa-9fe1-489e-a135-197254fd61a3/dismiss` → **200**

```json
{
  "command_id": "c9bd026d-80ff-42f8-8e59-bb1051756d69",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "6f9681fa-9fe1-489e-a135-197254fd61a3",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
  "raised_at": "2026-10-30T12:41:10.65939Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
  "reviewed_at": "2026-10-30T12:41:10.950327Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "84a00250-34c0-4c43-b4d1-dff42046b4fd",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "ebebc435-6b70-4e58-adeb-118dafc0435a"
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
      "actor_id": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T12:41:11.258727Z"
    }
  ],
  "duplicates": []
}
```

Done: flag ebebc435-6b70-4e58-adeb-118dafc0435a confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "2eb730dd-11a5-4ce0-b9b8-63ba5e9b8944",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ5NzIsImlhdCI6MTc5MzM2NDA3MiwianRpIjoiZGJkNTY0YTYtZGU5Yy00ZmQ1LTk5M2ItMzE1NjQxNjJlYjUyIiwic2lkIjoiMmViNzMwZGQtMTFhNS00Y2UwLWI5YjgtNjNiYTVlOWI4OTQ0In0.g-Zg_V8XVggXL-tyqfJZYCeYZrNdFDw5Ds_zzbhS2QY",
  "access_expires_at": "2026-10-30T12:56:12.143929766Z",
  "refresh_token": "Wa4wFgRMPpmAiYeATWubl0mK2ckrEP0syYicdyrFKuc",
  "refresh_expires_at": "2026-10-31T00:41:12.143444976Z",
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
      "actor_id": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T12:41:11.258727Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "a61d136a-19b7-4c6b-aa3b-15ccbfabb1aa",
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
  "session_id": "3ae308da-633d-48f6-be47-953f03f2af70",
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
  "last_heartbeat_at": "2026-10-30T12:41:06.273088Z",
  "last_location_at": "2026-10-30T12:41:06.273088Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3ae308da-633d-48f6-be47-953f03f2af70/close` → **200**

```json
{
  "command_id": "8683fd64-bbc6-4012-89d2-7e0be2a6614d",
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
  "session_id": "bd9ae3d1-a35f-4099-beaa-7ba82cafc633",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ5NzMsImlhdCI6MTc5MzM2NDA3MywianRpIjoiZjE0M2NhYjAtMzlmYi00NGEwLTgyODktZDM1MDVlZjdiNmI5Iiwic2lkIjoiYmQ5YWUzZDEtYTM1Zi00MDk5LWJlYWEtN2JhODJjYWZjNjMzIn0.e6dsOUG9UC7cpK1DkHKSXtzEt65bid20VNE-DGJRg5M",
  "access_expires_at": "2026-10-30T12:56:13.867641656Z",
  "refresh_token": "7n6fuB-dNKzZYwglnws2H0LKWw5FPMNrWIANsjEDL9Q",
  "refresh_expires_at": "2026-10-31T00:41:13.867123204Z",
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
  "command_id": "c303293a-3932-4081-bcda-cc53f7affa22",
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
  "changed_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T12:41:14.445026Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "c303293a-3932-4081-bcda-cc53f7affa22",
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
  "changed_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T12:41:14.445026Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48726938166",
  "device_ref": "sandbox-3365"
}
```

```json
{
  "challenge_id": "bf7267d2-3a8e-46ef-82e1-5987206ba127",
  "expires_at": "2026-10-30T12:46:15.044832625Z",
  "resend_available_at": "2026-10-30T12:41:16.044832625Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48726938166` → **200**

```json
{
  "phone": "+48726938166",
  "audience": "CLIENT",
  "code": "726121",
  "sent_at": "2026-10-30T12:41:15.047658965Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bf7267d2-3a8e-46ef-82e1-5987206ba127",
  "code": "726121",
  "device_ref": "sandbox-3365"
}
```

```json
{
  "session_id": "6aa3892e-e138-440e-9b39-275e52f50f56",
  "subject": {
    "type": "CLIENT",
    "id": "7cd311b0-a1fa-4cf3-b344-d14583bea4c8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3Y2QzMTFiMC1hMWZhLTRjZjMtYjM0NC1kMTQ1ODNiZWE0YzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0OTc1LCJpYXQiOjE3OTMzNjQwNzUsImp0aSI6IjJiMDgyYjc1LTcyODctNDJjMS1iZmEwLTg2OWJmNTM0N2QyZCIsInNpZCI6IjZhYTM4OTJlLWUxMzgtNDQwZS05YjM5LTI3NWU1MmY1MGY1NiJ9.2NFDwFW7UGKeqn5ONnJ8iX1fADzzg3j_Nh-RMt3RT9c",
  "access_expires_at": "2026-10-30T12:56:15.350788693Z",
  "refresh_token": "uQry1LrsWCfcPgGoL7LOo_b8hZBqcJDvcAi9qZ092Fo",
  "refresh_expires_at": "2026-11-29T12:41:15.350322618Z",
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
  "correlation_id": "e931b9d6-1e75-4aa3-83d3-b4bcac76e8fa"
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
  "device_ref": "sandbox-10524"
}
```

```json
{
  "challenge_id": "e3475eba-3d86-424c-adcc-6f43364ad4f0",
  "expires_at": "2026-10-30T12:46:16.191963756Z",
  "resend_available_at": "2026-10-30T12:41:17.191963756Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "787543",
  "sent_at": "2026-10-30T12:41:16.194684448Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3475eba-3d86-424c-adcc-6f43364ad4f0",
  "code": "787543",
  "device_ref": "sandbox-10524"
}
```

```json
{
  "session_id": "e22aa926-2469-47e0-9da7-6f1352d03b34",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDk3NiwiaWF0IjoxNzkzMzY0MDc2LCJqdGkiOiI2YjExYjI4Yy05ODljLTQyMDEtOWUxMS05MTk2MjM2OWJmYjgiLCJzaWQiOiJlMjJhYTkyNi0yNDY5LTQ3ZTAtOWRhNy02ZjEzNTJkMDNiMzQifQ.hxm2t9ZmyzFk6Wr--gZNPPfr19Nm9SSgcH1NlAvyF54",
  "access_expires_at": "2026-10-30T12:56:16.502682505Z",
  "refresh_token": "mZJxQv-oP5pbfN_axUdbqgOBD2KED7RYdZ1WhB3shYA",
  "refresh_expires_at": "2026-11-29T12:41:16.502135361Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "54212083-14a1-4ad5-b97e-8a964a4769e1",
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
  "last_heartbeat_at": "2026-10-30T12:40:45.191985Z",
  "last_location_at": "2026-10-30T12:40:45.191985Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/54212083-14a1-4ad5-b97e-8a964a4769e1/handover` → **200**

```json
{
  "command_id": "b8cf220c-9872-42b8-ab56-8e47d87a7ce8",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "54212083-14a1-4ad5-b97e-8a964a4769e1",
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
  "last_heartbeat_at": "2026-10-30T12:40:45.191985Z",
  "last_location_at": "2026-10-30T12:40:45.191985Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/54212083-14a1-4ad5-b97e-8a964a4769e1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:41:17Z",
    "sequence": 1793364077352
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "54212083-14a1-4ad5-b97e-8a964a4769e1",
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
  "last_heartbeat_at": "2026-10-30T12:41:17.370541Z",
  "last_location_at": "2026-10-30T12:41:17.370541Z",
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
  "session_id": "54212083-14a1-4ad5-b97e-8a964a4769e1",
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
  "last_heartbeat_at": "2026-10-30T12:41:17.370541Z",
  "last_location_at": "2026-10-30T12:41:17.370541Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/54212083-14a1-4ad5-b97e-8a964a4769e1/close` → **200**

```json
{
  "command_id": "198b893c-c565-4630-a811-14b31119db09",
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
  "correlation_id": "558741e7-ec39-4fbf-bc09-5b626732ac03"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672292837",
  "device_ref": "sandbox-21866"
}
```

```json
{
  "challenge_id": "6c478da1-0294-466d-a2f0-a7232708a0ad",
  "expires_at": "2026-10-30T12:46:18.802018922Z",
  "resend_available_at": "2026-10-30T12:41:19.802018922Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672292837` → **200**

```json
{
  "phone": "+380672292837",
  "audience": "CLIENT",
  "code": "927373",
  "sent_at": "2026-10-30T12:41:18.804762989Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6c478da1-0294-466d-a2f0-a7232708a0ad",
  "code": "927373",
  "device_ref": "sandbox-21866"
}
```

```json
{
  "session_id": "509ec2fc-35de-42d8-9fe1-c50975f94545",
  "subject": {
    "type": "CLIENT",
    "id": "87937553-16a5-4cc6-b304-1d5e76fe4706"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NzkzNzU1My0xNmE1LTRjYzYtYjMwNC0xZDVlNzZmZTQ3MDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0OTc5LCJpYXQiOjE3OTMzNjQwNzksImp0aSI6Ijc4OTAzM2FkLTkwNTYtNGRmOC04YjRjLTFjZDVhZjNmMTBlMyIsInNpZCI6IjUwOWVjMmZjLTM1ZGUtNDJkOC05ZmUxLWM1MDk3NWY5NDU0NSJ9.1aO4dVQ9sniAnJZE98G0ykb9Vr9kjQhfBbav2hnAt4k",
  "access_expires_at": "2026-10-30T12:56:19.116087495Z",
  "refresh_token": "4rP6v-bZCnfnydtMC5hwqstVKDjp1JUArHge5janpd8",
  "refresh_expires_at": "2026-11-29T12:41:19.115486921Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "0d0055e8-b14f-4d39-9988-06de1e3db434",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "9bdc4344-e43a-4465-82d7-12b5008da20e",
  "upload_path": "/api/rider/v1/uploads/9bdc4344-e43a-4465-82d7-12b5008da20e",
  "expires_at": "2026-10-30T12:56:19.408824187Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/9bdc4344-e43a-4465-82d7-12b5008da20e` → **200**

```json
{
  "file_id": "9bdc4344-e43a-4465-82d7-12b5008da20e",
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
  "command_id": "92123aac-b906-48d1-90cf-fb131a6d799c",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "6b33b65f-5458-42fa-84f9-ffd75cf90a1e",
  "upload_path": "/api/rider/v1/uploads/6b33b65f-5458-42fa-84f9-ffd75cf90a1e",
  "expires_at": "2026-10-30T12:56:19.729686818Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/6b33b65f-5458-42fa-84f9-ffd75cf90a1e` → **200**

```json
{
  "file_id": "6b33b65f-5458-42fa-84f9-ffd75cf90a1e",
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
  "command_id": "a3e8610e-07bd-44bd-910c-0007027177f2",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "9a31f2e8-c76b-49ad-ba02-861555de8de2",
  "upload_path": "/api/rider/v1/uploads/9a31f2e8-c76b-49ad-ba02-861555de8de2",
  "expires_at": "2026-10-30T12:56:20.029137536Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/9a31f2e8-c76b-49ad-ba02-861555de8de2` → **200**

```json
{
  "file_id": "9a31f2e8-c76b-49ad-ba02-861555de8de2",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "b62d669a-4163-44b3-b300-fd61a871cd79",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "9a31f2e8-c76b-49ad-ba02-861555de8de2"
  ]
}
```

```json
{
  "id": "d8fdac01-b9e2-464e-b996-047ec49c88d2",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "87937553-16a5-4cc6-b304-1d5e76fe4706",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T12:41:20.346147Z",
  "updated_at": "2026-10-30T12:41:20.346147Z",
  "respond_by": "2026-10-30T16:41:20.346147Z",
  "messages": [
    {
      "id": "87880ff0-d043-4fe7-b775-c325407bdab0",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "87937553-16a5-4cc6-b304-1d5e76fe4706",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T12:41:20.34724Z",
      "attachments": [
        {
          "file_id": "9a31f2e8-c76b-49ad-ba02-861555de8de2",
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
  "session_id": "60d2a440-9e2f-4ba3-a66d-44155adbd4b2",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ5ODAsImlhdCI6MTc5MzM2NDA4MCwianRpIjoiYTMyZDk0ZDItNTFlNy00NGU0LWJhOWMtYzk4YWRhYjQzNzgwIiwic2lkIjoiNjBkMmE0NDAtOWUyZi00YmEzLWE2NmQtNDQxNTVhZGJkNGIyIn0.QSF0jTa49MpJaDkEmp-9PmIC-sVpYkzvmSbyxcJXrF0",
  "access_expires_at": "2026-10-30T12:56:20.931734916Z",
  "refresh_token": "9QPs0f_xMFURhpeuVfHnin3FjTJPxACYhMaDyWbXhaM",
  "refresh_expires_at": "2026-10-31T00:41:20.931173996Z",
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
  "session_id": "6c1a9594-2b9a-48e6-8a85-116c036508b1",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ5ODEsImlhdCI6MTc5MzM2NDA4MSwianRpIjoiZDcyMGY0MjMtZTkxNS00ZmY4LWJhMGUtZTE2YWQ1OGIzMDBlIiwic2lkIjoiNmMxYTk1OTQtMmI5YS00OGU2LThhODUtMTE2YzAzNjUwOGIxIn0.07pP-l4D2CSY80R11MECs01Fs9jUD0dBl8Lcq0Oi9yk",
  "access_expires_at": "2026-10-30T12:56:21.486748623Z",
  "refresh_token": "M-oo0JUDoJnrYb4iDE5fBV_85zo6ka2wYo_D3zoTHBE",
  "refresh_expires_at": "2026-10-31T00:41:21.486219672Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/d8fdac01-b9e2-464e-b996-047ec49c88d2/attachments/9a31f2e8-c76b-49ad-ba02-861555de8de2` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "d036b54f-c4a0-49bf-8f67-2b00ebf8d588",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "83bbce2e-6af1-48f8-914f-2672660c620b",
  "upload_path": "/api/operator/v1/uploads/83bbce2e-6af1-48f8-914f-2672660c620b",
  "expires_at": "2026-10-30T12:56:21.793326181Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/83bbce2e-6af1-48f8-914f-2672660c620b` → **200**

```json
{
  "file_id": "83bbce2e-6af1-48f8-914f-2672660c620b",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/d8fdac01-b9e2-464e-b996-047ec49c88d2` → **200**

```json
{
  "id": "d8fdac01-b9e2-464e-b996-047ec49c88d2",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "87937553-16a5-4cc6-b304-1d5e76fe4706",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T12:41:20.346147Z",
  "updated_at": "2026-10-30T12:41:20.346147Z",
  "respond_by": "2026-10-30T16:41:20.346147Z",
  "messages": [
    {
      "id": "87880ff0-d043-4fe7-b775-c325407bdab0",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "87937553-16a5-4cc6-b304-1d5e76fe4706",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T12:41:20.34724Z",
      "attachments": [
        {
          "file_id": "9a31f2e8-c76b-49ad-ba02-861555de8de2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/d8fdac01-b9e2-464e-b996-047ec49c88d2/comments` → **200**

```json
{
  "command_id": "70d9a62a-fa6c-495d-b429-076af88b1179",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "83bbce2e-6af1-48f8-914f-2672660c620b"
  ]
}
```

```json
{
  "id": "d8fdac01-b9e2-464e-b996-047ec49c88d2",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "87937553-16a5-4cc6-b304-1d5e76fe4706",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T12:41:20.346147Z",
  "updated_at": "2026-10-30T12:41:22.431677Z",
  "respond_by": "2026-10-30T16:41:20.346147Z",
  "messages": [
    {
      "id": "87880ff0-d043-4fe7-b775-c325407bdab0",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "87937553-16a5-4cc6-b304-1d5e76fe4706",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T12:41:20.34724Z",
      "attachments": [
        {
          "file_id": "9a31f2e8-c76b-49ad-ba02-861555de8de2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "3c535807-25e3-4686-a0d0-18187cecb9cd",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T12:41:22.431188Z",
      "attachments": [
        {
          "file_id": "83bbce2e-6af1-48f8-914f-2672660c620b",
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

`GET /api/rider/v1/support/cases/d8fdac01-b9e2-464e-b996-047ec49c88d2` → **200**

```json
{
  "id": "d8fdac01-b9e2-464e-b996-047ec49c88d2",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "87937553-16a5-4cc6-b304-1d5e76fe4706",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T12:41:20.346147Z",
  "updated_at": "2026-10-30T12:41:22.431677Z",
  "respond_by": "2026-10-30T16:41:20.346147Z",
  "messages": [
    {
      "id": "87880ff0-d043-4fe7-b775-c325407bdab0",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "87937553-16a5-4cc6-b304-1d5e76fe4706",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T12:41:20.34724Z",
      "attachments": [
        {
          "file_id": "9a31f2e8-c76b-49ad-ba02-861555de8de2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "3c535807-25e3-4686-a0d0-18187cecb9cd",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T12:41:22.431188Z",
      "attachments": [
        {
          "file_id": "83bbce2e-6af1-48f8-914f-2672660c620b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/d8fdac01-b9e2-464e-b996-047ec49c88d2/attachments/83bbce2e-6af1-48f8-914f-2672660c620b` → **200**

Done: support case d8fdac01-b9e2-464e-b996-047ec49c88d2, rider attachment 9a31f2e8-c76b-49ad-ba02-861555de8de2, operator attachment 83bbce2e-6af1-48f8-914f-2672660c620b.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734458430",
  "device_ref": "sandbox-13119"
}
```

```json
{
  "challenge_id": "8a704b7d-7d39-424c-b145-fd1bb96c6f22",
  "expires_at": "2026-10-30T12:46:23.049786498Z",
  "resend_available_at": "2026-10-30T12:41:24.049786498Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734458430` → **200**

```json
{
  "phone": "+380734458430",
  "audience": "CLIENT",
  "code": "373664",
  "sent_at": "2026-10-30T12:41:23.052685283Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8a704b7d-7d39-424c-b145-fd1bb96c6f22",
  "code": "373664",
  "device_ref": "sandbox-13119"
}
```

```json
{
  "session_id": "ae1c4fa7-07d0-4ebe-a8ab-cc234ea39079",
  "subject": {
    "type": "CLIENT",
    "id": "152d839a-119e-4e02-8b3d-ef6783f7b66d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTJkODM5YS0xMTllLTRlMDItOGIzZC1lZjY3ODNmN2I2NmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY0OTgzLCJpYXQiOjE3OTMzNjQwODMsImp0aSI6ImUzNjc4MjNkLTU1MjMtNGJiMy1iMWZkLTA4ZWU0NTAyNTAwYiIsInNpZCI6ImFlMWM0ZmE3LTA3ZDAtNGViZS1hOGFiLWNjMjM0ZWEzOTA3OSJ9.j4mOfe0Kt3UKGkDVneqR9BPyrlxjLUm2MvbPv1oxfPo",
  "access_expires_at": "2026-10-30T12:56:23.363950878Z",
  "refresh_token": "mIcH6mPs5eU32KOqNaipn6f4ri5Pu1F11F_zH_4svaU",
  "refresh_expires_at": "2026-11-29T12:41:23.363462522Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "a9f73f71-8c28-428d-a236-2d4f3d63af4a",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "9f62bdff-8b9a-44eb-a6a1-31f42e568614",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-9f62bdff-8b9a-44eb-a6a1-31f42e568614",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "7dca3442152754f836e77d7aaabb91c2",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=9f62bdff-8b9a-44eb-a6a1-31f42e568614",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734458430"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=9f62bdff-8b9a-44eb-a6a1-31f42e568614",
  "expires_at": "2026-10-30T13:11:23.652531Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/9f62bdff-8b9a-44eb-a6a1-31f42e568614` → **200**

```json
{
  "id": "9f62bdff-8b9a-44eb-a6a1-31f42e568614",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T13:11:23.652531Z",
  "card": {
    "id": "d615abde-2f9d-488f-922f-f833d02073dd",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1647",
    "card_type": "Visa",
    "created_at": "2026-10-30T12:41:23.940719Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "71f8a6ce-350f-4afd-b41a-5b154dfaa07e",
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
  "id": "8ce69f13-ce64-4171-b772-c558e483f0da",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:46:24.258972Z",
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
  "command_id": "5520daa3-f924-463b-bfbd-0bc384102586",
  "quote_id": "8ce69f13-ce64-4171-b772-c558e483f0da",
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
  "id": "c848d5c0-6b25-4206-af78-757d34229990",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "152d839a-119e-4e02-8b3d-ef6783f7b66d",
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
  "created_at": "2026-10-30T12:41:24.55681Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c848d5c0-6b25-4206-af78-757d34229990` → **200**

```json
{
  "id": "c848d5c0-6b25-4206-af78-757d34229990",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "152d839a-119e-4e02-8b3d-ef6783f7b66d",
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
  "created_at": "2026-10-30T12:41:24.55681Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c848d5c0-6b25-4206-af78-757d34229990` → **200**

```json
{
  "id": "c848d5c0-6b25-4206-af78-757d34229990",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "152d839a-119e-4e02-8b3d-ef6783f7b66d",
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
  "created_at": "2026-10-30T12:41:24.55681Z",
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

`GET /api/rider/v1/orders/c848d5c0-6b25-4206-af78-757d34229990` → **200**

```json
{
  "id": "c848d5c0-6b25-4206-af78-757d34229990",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "152d839a-119e-4e02-8b3d-ef6783f7b66d",
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
  "created_at": "2026-10-30T12:41:24.55681Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c848d5c0-6b25-4206-af78-757d34229990/switch-to-cash` → **200**

```json
{
  "command_id": "ef06fad1-2f44-498a-babe-857eebbdc31d",
  "expected_version": 3
}
```

```json
{
  "id": "c848d5c0-6b25-4206-af78-757d34229990",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "152d839a-119e-4e02-8b3d-ef6783f7b66d",
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
  "created_at": "2026-10-30T12:41:24.55681Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c848d5c0-6b25-4206-af78-757d34229990/switch-to-cash` → **409**

```json
{
  "command_id": "8d569ac5-159c-49aa-adf6-cd54f6541c9d",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/c848d5c0-6b25-4206-af78-757d34229990/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "417bdee5-1454-4d97-be64-0a174367f9c7"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/c848d5c0-6b25-4206-af78-757d34229990` → **200**

```json
{
  "id": "c848d5c0-6b25-4206-af78-757d34229990",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "152d839a-119e-4e02-8b3d-ef6783f7b66d",
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
  "created_at": "2026-10-30T12:41:24.55681Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c848d5c0-6b25-4206-af78-757d34229990/cancel` → **200**

```json
{
  "command_id": "ba8f7ef5-c695-48d4-b6ed-db3f669eb829",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c848d5c0-6b25-4206-af78-757d34229990",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "152d839a-119e-4e02-8b3d-ef6783f7b66d",
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
  "created_at": "2026-10-30T12:41:24.55681Z",
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
  "session_id": "838110c0-a4a3-478d-bab4-eaef3b9089da",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ5ODgsImlhdCI6MTc5MzM2NDA4OCwianRpIjoiNTBkOGQzYTktNmY0Yi00Y2ZiLWJkZjItNmY1YTRmNWM0ZDNlIiwic2lkIjoiODM4MTEwYzAtYTRhMy00NzhkLWJhYjQtZWFlZjNiOTA4OWRhIn0.DgjCgHlthjbzrUqFvNKXzn9-CH2r00RQ4RamjkqyjzI",
  "access_expires_at": "2026-10-30T12:56:28.204479513Z",
  "refresh_token": "6w3tlUDZQvXsbdwXoBDLwHszMH9VSY58jT_HYg6_VoY",
  "refresh_expires_at": "2026-10-31T00:41:28.203953908Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-15050"
}
```

```json
{
  "challenge_id": "debe56ec-9055-4adb-9663-fc4b99b51ba3",
  "expires_at": "2026-10-30T12:46:28.472166787Z",
  "resend_available_at": "2026-10-30T12:41:29.472166787Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "065775",
  "sent_at": "2026-10-30T12:41:28.475055325Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "debe56ec-9055-4adb-9663-fc4b99b51ba3",
  "code": "065775",
  "device_ref": "sandbox-15050"
}
```

```json
{
  "session_id": "88a999aa-3faf-479f-92d8-2d73cad8a271",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDk4OCwiaWF0IjoxNzkzMzY0MDg4LCJqdGkiOiIyMDQzYmM2MS1lYzI0LTQxOWItYTA4Yy04MTViNmVlMzE1YjMiLCJzaWQiOiI4OGE5OTlhYS0zZmFmLTQ3OWYtOTJkOC0yZDczY2FkOGEyNzEifQ.Y2HwWZs35cPK2sa_HvqHCdt03G5NU1IC_LK0yrfIOu4",
  "access_expires_at": "2026-10-30T12:56:28.777426318Z",
  "refresh_token": "-eZIYWtpUPXrc_iN-AEhmyhhbfplQo9bX70mh5uZSFM",
  "refresh_expires_at": "2026-11-29T12:41:28.776853023Z",
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
      "actor_id": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T12:41:11.258727Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T12:41:12.732227Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "7f1afa51-0710-4581-bc64-0953eff227d9",
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
  "device_ref": "sandbox-19242"
}
```

```json
{
  "challenge_id": "ca776802-6bb5-44e0-bedf-3f32c27a9921",
  "expires_at": "2026-10-30T12:46:29.928465469Z",
  "resend_available_at": "2026-10-30T12:41:30.928465469Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "055880",
  "sent_at": "2026-10-30T12:41:29.931151688Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ca776802-6bb5-44e0-bedf-3f32c27a9921",
  "code": "055880",
  "device_ref": "sandbox-19242"
}
```

```json
{
  "session_id": "c7bf9744-45a9-40b9-827a-43e8b6edff20",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDk5MCwiaWF0IjoxNzkzMzY0MDkwLCJqdGkiOiIyZDJmMDEyZi1mYWE2LTRjZWEtOWI3ZC0yNjRkMjllN2I4YTkiLCJzaWQiOiJjN2JmOTc0NC00NWE5LTQwYjktODI3YS00M2U4YjZlZGZmMjAifQ.qmkAJS3cAl-dVlhvvdurzP7CLaHp5ah_yIN7_Apc4Y8",
  "access_expires_at": "2026-10-30T12:56:30.240108324Z",
  "refresh_token": "M7gBZ7SaWnlNqy0WxX-pnmyRJrtR5U_MJN21DTz1L4U",
  "refresh_expires_at": "2026-11-29T12:41:30.239585644Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5aa91ff3-3d7b-442a-a20c-59f240fe33e6",
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
  "last_heartbeat_at": "2026-10-30T12:40:52.443664Z",
  "last_location_at": "2026-10-30T12:40:52.443664Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5aa91ff3-3d7b-442a-a20c-59f240fe33e6/handover` → **200**

```json
{
  "command_id": "5f18970c-38bd-49a8-ba51-e0179c600e38",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5aa91ff3-3d7b-442a-a20c-59f240fe33e6",
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
  "last_heartbeat_at": "2026-10-30T12:40:52.443664Z",
  "last_location_at": "2026-10-30T12:40:52.443664Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5aa91ff3-3d7b-442a-a20c-59f240fe33e6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:41:31Z",
    "sequence": 1793364091828
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5aa91ff3-3d7b-442a-a20c-59f240fe33e6",
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
  "last_heartbeat_at": "2026-10-30T12:41:31.101105Z",
  "last_location_at": "2026-10-30T12:41:31.101105Z",
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
  "command_id": "1a96324d-05dc-4104-8c2c-5a60342d2b76",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:41:31Z",
    "sequence": 1793364091829
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1d5bd227-c8b5-4b0e-9549-d169c19897a0",
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
  "last_heartbeat_at": "2026-10-30T12:41:31.669879Z",
  "last_location_at": "2026-10-30T12:41:31.669879Z",
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
  "session_id": "b2ac013a-a847-4fed-9ef6-59060abc4e20",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ5OTIsImlhdCI6MTc5MzM2NDA5MiwianRpIjoiNGJjZWIxN2EtNTExMy00MWJkLTkzNGEtYTE0ZDVhNWZmMzY5Iiwic2lkIjoiYjJhYzAxM2EtYTg0Ny00ZmVkLTllZjYtNTkwNjBhYmM0ZTIwIn0.R0rJnLBxFzqelOJEFqLtnGERiJD44nYLwyXIWi-WYXQ",
  "access_expires_at": "2026-10-30T12:56:32.26295906Z",
  "refresh_token": "5_AnWyrgLL_c6wIde11zxGzKulTaM8sJomng2yNdfBU",
  "refresh_expires_at": "2026-10-31T00:41:32.26247377Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d683d316-67b7-451d-b936-d8a7ba0fb64c",
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
  "id": "a31f3f90-c6ae-44bd-938b-1ddf4c2dc005",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:46:32.539480Z",
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
  "command_id": "a37245e7-cb37-4263-a769-f7c879a3eb26",
  "quote_id": "a31f3f90-c6ae-44bd-938b-1ddf4c2dc005",
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
  "id": "efd54317-c412-47b6-b6c6-343a96e10729",
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
  "created_at": "2026-10-30T12:41:32.831765Z",
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
    "id": "6dbd8a86-f560-4223-bb2f-adae0f91e026",
    "order_id": "efd54317-c412-47b6-b6c6-343a96e10729",
    "expires_at": "2026-10-30T12:41:47.835961Z",
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

`POST /api/driver/v1/offers/6dbd8a86-f560-4223-bb2f-adae0f91e026/accept` → **200**

```json
{
  "command_id": "97581098-02e9-4d15-ae9d-8df4e4b9e91c"
}
```

```json
{
  "id": "8927caf3-c925-4bd3-a4ad-c400b83f1001",
  "order_id": "efd54317-c412-47b6-b6c6-343a96e10729",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2a9e3e9d-9382-40fb-8b14-a02d9beff298",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2a9e3e9d-9382-40fb-8b14-a02d9beff298",
  "order_id": "efd54317-c412-47b6-b6c6-343a96e10729",
  "assignment_id": "8927caf3-c925-4bd3-a4ad-c400b83f1001",
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

`POST /api/driver/v1/work-sessions/1d5bd227-c8b5-4b0e-9549-d169c19897a0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:41:34Z",
    "sequence": 1793364094393
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1d5bd227-c8b5-4b0e-9549-d169c19897a0",
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
  "last_heartbeat_at": "2026-10-30T12:41:34.411358Z",
  "last_location_at": "2026-10-30T12:41:34.411358Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2a9e3e9d-9382-40fb-8b14-a02d9beff298/arrive` → **200**

```json
{
  "command_id": "dd5f4131-7401-4fc1-9183-d427795ed2c3",
  "expected_version": 0
}
```

```json
{
  "id": "2a9e3e9d-9382-40fb-8b14-a02d9beff298",
  "order_id": "efd54317-c412-47b6-b6c6-343a96e10729",
  "assignment_id": "8927caf3-c925-4bd3-a4ad-c400b83f1001",
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
  "arrived_at": "2026-10-30T12:41:34.691999Z",
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

`POST /api/driver/v1/trips/2a9e3e9d-9382-40fb-8b14-a02d9beff298/start` → **200**

```json
{
  "command_id": "2df75578-a3cf-4925-af73-f6a31815cf2e",
  "expected_version": 1
}
```

```json
{
  "id": "2a9e3e9d-9382-40fb-8b14-a02d9beff298",
  "order_id": "efd54317-c412-47b6-b6c6-343a96e10729",
  "assignment_id": "8927caf3-c925-4bd3-a4ad-c400b83f1001",
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
  "arrived_at": "2026-10-30T12:41:34.691999Z",
  "started_at": "2026-10-30T12:41:34.98412Z",
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

`POST /api/driver/v1/trips/2a9e3e9d-9382-40fb-8b14-a02d9beff298/complete` → **200**

```json
{
  "command_id": "880b693f-6773-4040-9b54-81a12bab0bf5",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:41:35Z",
  "cash_received": true
}
```

```json
{
  "id": "2a9e3e9d-9382-40fb-8b14-a02d9beff298",
  "order_id": "efd54317-c412-47b6-b6c6-343a96e10729",
  "assignment_id": "8927caf3-c925-4bd3-a4ad-c400b83f1001",
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
  "arrived_at": "2026-10-30T12:41:34.691999Z",
  "started_at": "2026-10-30T12:41:34.98412Z",
  "completed_at": "2026-10-30T12:41:35.29632Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/efd54317-c412-47b6-b6c6-343a96e10729` → **200**

```json
{
  "id": "efd54317-c412-47b6-b6c6-343a96e10729",
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
    "id": "8927caf3-c925-4bd3-a4ad-c400b83f1001",
    "order_id": "efd54317-c412-47b6-b6c6-343a96e10729",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2a9e3e9d-9382-40fb-8b14-a02d9beff298",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:41:32.831765Z",
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
  "session_id": "5aa91ff3-3d7b-442a-a20c-59f240fe33e6",
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
  "last_heartbeat_at": "2026-10-30T12:41:31.101105Z",
  "last_location_at": "2026-10-30T12:41:31.101105Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5aa91ff3-3d7b-442a-a20c-59f240fe33e6/close` → **200**

```json
{
  "command_id": "84c7ef9e-d83f-4f9e-b4b3-0e7c14e8c290",
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
  "session_id": "1d5bd227-c8b5-4b0e-9549-d169c19897a0",
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
  "last_heartbeat_at": "2026-10-30T12:41:34.411358Z",
  "last_location_at": "2026-10-30T12:41:34.411358Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1d5bd227-c8b5-4b0e-9549-d169c19897a0/close` → **200**

```json
{
  "command_id": "39abea9e-9e6a-4131-9da0-99e03ae237c3",
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

Done: terminal order efd54317-c412-47b6-b6c6-343a96e10729 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12942"
}
```

```json
{
  "challenge_id": "62992744-b7e7-480e-8248-c7449c5c7c3f",
  "expires_at": "2026-10-30T12:46:40.302959491Z",
  "resend_available_at": "2026-10-30T12:41:41.302959491Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "674088",
  "sent_at": "2026-10-30T12:41:40.305915502Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62992744-b7e7-480e-8248-c7449c5c7c3f",
  "code": "674088",
  "device_ref": "sandbox-12942"
}
```

```json
{
  "session_id": "e5f48efc-6057-4e72-baf3-6b7c67c3257c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTAwMCwiaWF0IjoxNzkzMzY0MTAwLCJqdGkiOiJiYTkyMDkyOC1hYjRjLTRiNGEtOThlNS01ZThmN2RmNmEzOWEiLCJzaWQiOiJlNWY0OGVmYy02MDU3LTRlNzItYmFmMy02YjdjNjdjMzI1N2MifQ.JdM9FM0COjabvAzOvOGxJ35rwhg4D4CS72aBFlh-mw0",
  "access_expires_at": "2026-10-30T12:56:40.622889977Z",
  "refresh_token": "5A9crkLZw5Y2kU3M0yxpkv03uLpM9A_2nacdI9s0MGo",
  "refresh_expires_at": "2026-11-29T12:41:40.622400359Z",
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
  "device_ref": "sandbox-8015"
}
```

```json
{
  "challenge_id": "540f151f-6482-4ab6-acc8-66f69d9ce53e",
  "expires_at": "2026-10-30T12:46:41.182868183Z",
  "resend_available_at": "2026-10-30T12:41:42.182868183Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "673163",
  "sent_at": "2026-10-30T12:41:41.185599267Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "540f151f-6482-4ab6-acc8-66f69d9ce53e",
  "code": "673163",
  "device_ref": "sandbox-8015"
}
```

```json
{
  "session_id": "807207d0-6ad9-4c16-b6bc-33ebcbb54fe8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTAwMSwiaWF0IjoxNzkzMzY0MTAxLCJqdGkiOiJkNGZmNjgxOC0yNGZiLTQ1ODktYTgwNS0wODcxODVhNGM5MjAiLCJzaWQiOiI4MDcyMDdkMC02YWQ5LTRjMTYtYjZiYy0zM2ViY2JiNTRmZTgifQ.P2KErthJy5_x6u5dmIS3uvmLRDvGjuygnTTPJk9lT7A",
  "access_expires_at": "2026-10-30T12:56:41.493936918Z",
  "refresh_token": "9zPJeDrydAeTzvoLEn9-fy6f0sszA8v-InJxcRXeLac",
  "refresh_expires_at": "2026-11-29T12:41:41.493230017Z",
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
  "device_ref": "sandbox-5213"
}
```

```json
{
  "challenge_id": "f048af73-39b7-4d1d-8cf0-dd58271226b5",
  "expires_at": "2026-10-30T12:46:42.048242564Z",
  "resend_available_at": "2026-10-30T12:41:43.048242564Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "921744",
  "sent_at": "2026-10-30T12:41:42.051088902Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f048af73-39b7-4d1d-8cf0-dd58271226b5",
  "code": "921744",
  "device_ref": "sandbox-5213"
}
```

```json
{
  "session_id": "8af84041-dba7-45a2-b093-5bb4678525b3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTAwMiwiaWF0IjoxNzkzMzY0MTAyLCJqdGkiOiI5NzhkNjgxZi1iOWUwLTQ1YWQtYjg3YS1lYWI1ZDExMzYxZGMiLCJzaWQiOiI4YWY4NDA0MS1kYmE3LTQ1YTItYjA5My01YmI0Njc4NTI1YjMifQ.wu7GcqHesC5g-IbTUMUwneVoSWs2RZYokYpe6fTqY-Q",
  "access_expires_at": "2026-10-30T12:56:42.377250264Z",
  "refresh_token": "Jx-c7WHIhqPaFEFDkXwrF8ZPzrhYGcC8rlirAcRA92o",
  "refresh_expires_at": "2026-11-29T12:41:42.376640204Z",
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
  "phone": "+380691199029",
  "device_ref": "sandbox-30359"
}
```

```json
{
  "challenge_id": "df7aa78a-4bbf-4fa8-9d3d-c64b2102c290",
  "expires_at": "2026-10-30T12:46:42.932413385Z",
  "resend_available_at": "2026-10-30T12:41:43.932413385Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380691199029` → **200**

```json
{
  "phone": "+380691199029",
  "audience": "CLIENT",
  "code": "386641",
  "sent_at": "2026-10-30T12:41:42.934960593Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "df7aa78a-4bbf-4fa8-9d3d-c64b2102c290",
  "code": "386641",
  "device_ref": "sandbox-30359"
}
```

```json
{
  "session_id": "50549be7-8669-44a0-873c-e489965ca4dc",
  "subject": {
    "type": "CLIENT",
    "id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGFlODE0Ny1jYWZlLTQwY2EtOTNlNy05ZTBmMWM2MWM0MWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1MDAzLCJpYXQiOjE3OTMzNjQxMDMsImp0aSI6IjNkMGQ1ZDkwLTM1MDYtNDkwNC05YTY3LTdmOTEzMDAyOWJkMiIsInNpZCI6IjUwNTQ5YmU3LTg2NjktNDRhMC04NzNjLWU0ODk5NjVjYTRkYyJ9.2_kgSEoonoRwXSBlubIN4UNh4eHUjOQCzEz5L8wYnRE",
  "access_expires_at": "2026-10-30T12:56:43.237155252Z",
  "refresh_token": "-ArKckpzJZ5i_l8v3JFTNq4pQFRi-9dV1g0mWsAq8JA",
  "refresh_expires_at": "2026-11-29T12:41:43.236681854Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "275577f6-d63c-479a-9b9a-45d235660a63",
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
  "id": "8b8ef2b1-6e0e-4ab3-b732-12c3dfabdb91",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:46:43.527805Z",
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
  "command_id": "eb950709-f72d-4d57-84f2-0dfb1a025ce5",
  "quote_id": "8b8ef2b1-6e0e-4ab3-b732-12c3dfabdb91",
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
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
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
  "blizz_dispatch_excluded_total": 11,
  "blizz_sms_sent_total": 77
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="BROADCAST"} 1
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 11.57601433
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 17
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 14.190463324
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.170363215
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

`GET /api/rider/v1/orders/10cab032-3a5d-4be5-a19a-105f6e90b70a` → **200**

```json
{
  "id": "10cab032-3a5d-4be5-a19a-105f6e90b70a",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e4ae8147-cafe-40ca-93e7-9e0f1c61c41f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:43.816788Z",
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
  "session_id": "a3189838-b753-46b1-ba43-e74cf827a5f7",
  "subject": {
    "type": "STAFF",
    "id": "af917cdd-a61b-46d8-a476-ec7ab7598f51"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjkxN2NkZC1hNjFiLTQ2ZDgtYTQ3Ni1lYzdhYjc1OThmNTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjUxODUsImlhdCI6MTc5MzM2NDI4NSwianRpIjoiYTkxNmMzN2QtNDVhMC00NGFiLTgwYzctYTc4ZDJlZmZkNDM2Iiwic2lkIjoiYTMxODk4MzgtYjc1My00NmIxLWJhNDMtZTc0Y2Y4MjdhNWY3In0.p3Ix5rOoFMlioUoCEsYjFF3SnUgSz_Zxw-x05L1xK3w",
  "access_expires_at": "2026-10-30T12:59:45.422232636Z",
  "refresh_token": "RQu4M2b9uU5rXPHXm_6sguB1nV2VNSiYPJI7wXRFupo",
  "refresh_expires_at": "2026-10-31T00:44:45.421427315Z",
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
  "id": "784cf74e-981c-463e-b01a-63c802383fb1",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T12:44:45.709744Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T12:44:45.70979Z",
  "updated_at": "2026-10-30T12:44:45.727022Z",
  "finished_at": "2026-10-30T12:44:45.727022Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/784cf74e-981c-463e-b01a-63c802383fb1` → **200**

```json
{
  "run": {
    "id": "784cf74e-981c-463e-b01a-63c802383fb1",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T12:44:45.709744Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T12:44:45.70979Z",
    "updated_at": "2026-10-30T12:44:45.727022Z",
    "finished_at": "2026-10-30T12:44:45.727022Z",
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
  "id": "784cf74e-981c-463e-b01a-63c802383fb1",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T12:44:45.709744Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T12:44:45.70979Z",
  "updated_at": "2026-10-30T12:44:45.727022Z",
  "finished_at": "2026-10-30T12:44:45.727022Z",
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
  "id": "784cf74e-981c-463e-b01a-63c802383fb1",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T12:44:45.709744Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T12:44:45.70979Z",
  "updated_at": "2026-10-30T12:44:45.727022Z",
  "finished_at": "2026-10-30T12:44:45.727022Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/68f39430-dc76-443b-9753-6e8df86d73a7` → **204**

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
  "id": "81cae790-b02b-4044-8da0-9dd2ef414a69",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T12:44:46.160472Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T12:44:46.160504Z",
  "updated_at": "2026-10-30T12:44:46.168104Z",
  "finished_at": "2026-10-30T12:44:46.168104Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/81cae790-b02b-4044-8da0-9dd2ef414a69` → **200**

```json
{
  "run": {
    "id": "81cae790-b02b-4044-8da0-9dd2ef414a69",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T12:44:46.160472Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T12:44:46.160504Z",
    "updated_at": "2026-10-30T12:44:46.168104Z",
    "finished_at": "2026-10-30T12:44:46.168104Z",
    "version": 1
  },
  "items": [
    {
      "id": "615e8343-d0d3-428f-9382-f0b2624523e1",
      "run_id": "81cae790-b02b-4044-8da0-9dd2ef414a69",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "5318571669a7f01fc9b62e5e00279d2f5350bb84f1b6f0eeeeac3ec1006a02d5",
      "reference_display": "sandbox-reconciliation-68f#####-dc76-443b-9753-6e8df86d73a7",
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
      "provider_at": "2026-10-30T12:44:46Z",
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
  "id": "81cae790-b02b-4044-8da0-9dd2ef414a69",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T12:44:46.160472Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T12:44:46.160504Z",
  "updated_at": "2026-10-30T12:44:46.168104Z",
  "finished_at": "2026-10-30T12:44:46.168104Z",
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
  "id": "81cae790-b02b-4044-8da0-9dd2ef414a69",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T12:44:46.160472Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T12:44:46.160504Z",
  "updated_at": "2026-10-30T12:44:46.168104Z",
  "finished_at": "2026-10-30T12:44:46.168104Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/615e8343-d0d3-428f-9382-f0b2624523e1/resolve` → **200**

```json
{
  "command_id": "2c64b0cd-8a69-424b-82b5-c02f4fed4ba2",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "615e8343-d0d3-428f-9382-f0b2624523e1",
  "run_id": "81cae790-b02b-4044-8da0-9dd2ef414a69",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "5318571669a7f01fc9b62e5e00279d2f5350bb84f1b6f0eeeeac3ec1006a02d5",
  "reference_display": "sandbox-reconciliation-68f#####-dc76-443b-9753-6e8df86d73a7",
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
  "provider_at": "2026-10-30T12:44:46Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
  "resolved_at": "2026-10-30T12:44:46.583434Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/615e8343-d0d3-428f-9382-f0b2624523e1/resolve` → **200**

```json
{
  "command_id": "2c64b0cd-8a69-424b-82b5-c02f4fed4ba2",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "615e8343-d0d3-428f-9382-f0b2624523e1",
  "run_id": "81cae790-b02b-4044-8da0-9dd2ef414a69",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "5318571669a7f01fc9b62e5e00279d2f5350bb84f1b6f0eeeeac3ec1006a02d5",
  "reference_display": "sandbox-reconciliation-68f#####-dc76-443b-9753-6e8df86d73a7",
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
  "provider_at": "2026-10-30T12:44:46Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
  "resolved_at": "2026-10-30T12:44:46.583434Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/615e8343-d0d3-428f-9382-f0b2624523e1/resolve` → **409**

```json
{
  "command_id": "99990efc-1e79-4cbf-a7b1-607a239904ab",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/615e8343-d0d3-428f-9382-f0b2624523e1/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e7b0c9e3-dba4-4972-a007-1acbbe214d7c"
}
```

`GET /api/admin/v1/payment-reconciliations/81cae790-b02b-4044-8da0-9dd2ef414a69` → **200**

```json
{
  "run": {
    "id": "81cae790-b02b-4044-8da0-9dd2ef414a69",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T12:44:46.160472Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T12:44:46.160504Z",
    "updated_at": "2026-10-30T12:44:46.583434Z",
    "finished_at": "2026-10-30T12:44:46.168104Z",
    "version": 2
  },
  "items": [
    {
      "id": "615e8343-d0d3-428f-9382-f0b2624523e1",
      "run_id": "81cae790-b02b-4044-8da0-9dd2ef414a69",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "5318571669a7f01fc9b62e5e00279d2f5350bb84f1b6f0eeeeac3ec1006a02d5",
      "reference_display": "sandbox-reconciliation-68f#####-dc76-443b-9753-6e8df86d73a7",
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
      "provider_at": "2026-10-30T12:44:46Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "af917cdd-a61b-46d8-a476-ec7ab7598f51",
      "resolved_at": "2026-10-30T12:44:46.583434Z",
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
      "id": "81cae790-b02b-4044-8da0-9dd2ef414a69",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T12:44:46.160472Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T12:44:46.160504Z",
      "updated_at": "2026-10-30T12:44:46.583434Z",
      "finished_at": "2026-10-30T12:44:46.168104Z",
      "version": 2
    },
    {
      "id": "0ea91f73-23b6-43b0-b819-a45de8946a5d",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T12:36:24.104669Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T12:36:24.104736Z",
      "updated_at": "2026-10-30T12:36:24.112259Z",
      "finished_at": "2026-10-30T12:36:24.112259Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/68f39430-dc76-443b-9753-6e8df86d73a7` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "81cae790-b02b-4044-8da0-9dd2ef414a69",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T12:44:46.160472Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T12:44:46.160504Z",
  "updated_at": "2026-10-30T12:44:46.583434Z",
  "finished_at": "2026-10-30T12:44:46.168104Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793364409315E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793364409598E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793364409598E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793364409326E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793364409599E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
