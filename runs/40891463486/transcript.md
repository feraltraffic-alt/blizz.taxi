# Sandbox transcript (2026-10-29T14:27:13Z, 7422c39)

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
  "correlation_id": "e8737906-a19b-433c-a92b-f4588d18216f"
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
  "session_id": "ab203f6d-4d31-42e0-9759-2a45f1d7fd64",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODQ5NDAsImlhdCI6MTc5MzI4NDA0MCwianRpIjoiNWUxZWY4MjUtZTg2ZS00OWU4LTgxNDEtMjBiOTdlNTY3Nzk5Iiwic2lkIjoiYWIyMDNmNmQtNGQzMS00MmUwLTk3NTktMmE0NWYxZDdmZDY0In0.ZqS3w9dyT7bYiRlTktv4kC9U_pzNKNPKl31bWTMF7yQ",
  "access_expires_at": "2026-10-29T14:42:20.545756035Z",
  "refresh_token": "YRIu2wfksbqDVyCrS4kiNv9ASjZTjIFH75jh2xJVxhk",
  "refresh_expires_at": "2026-10-30T02:27:20.543221893Z",
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
  "session_id": "3bc4606c-e6f8-4193-815f-6a8c076522e6",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODQ5NDIsImlhdCI6MTc5MzI4NDA0MiwianRpIjoiMDRhYmU2ZGYtYjJlYi00NjZmLWExNTItNzFlZTY1MWJiMzU2Iiwic2lkIjoiM2JjNDYwNmMtZTZmOC00MTkzLTgxNWYtNmE4YzA3NjUyMmU2In0.HJdHwYKpQwAwgg0UC5KtFOglYt_227sQpjKLTpr_544",
  "access_expires_at": "2026-10-29T14:42:22.398759367Z",
  "refresh_token": "3uq9_kbaRWUb82O1IrrPmQly9jR5W_AsBAYa-53j7RI",
  "refresh_expires_at": "2026-10-30T02:27:22.397713141Z",
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
  "device_ref": "sandbox-1503"
}
```

```json
{
  "challenge_id": "34f0b695-c670-4681-918e-a8123d487839",
  "expires_at": "2026-10-29T14:32:23.007330496Z",
  "resend_available_at": "2026-10-29T14:27:24.007330496Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "040430",
  "sent_at": "2026-10-29T14:27:23.023553453Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "34f0b695-c670-4681-918e-a8123d487839",
  "code": "040430",
  "device_ref": "sandbox-1503"
}
```

```json
{
  "session_id": "d18fde3e-2881-438b-8b87-0e6755ed3a15",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NDk0MywiaWF0IjoxNzkzMjg0MDQzLCJqdGkiOiIyYmJkMGZkNS0wZmY0LTQwZjUtYjYyZC1mZDlmOGQzMjU2ZjciLCJzaWQiOiJkMThmZGUzZS0yODgxLTQzOGItOGI4Ny0wZTY3NTVlZDNhMTUifQ.jtc2ZugxCwjjr2wa-diODUzgg9-wB3003hRYzvBpaWY",
  "access_expires_at": "2026-10-29T14:42:23.422977147Z",
  "refresh_token": "NxnfbnyhqKJ8qRJxHh5q8JwLTJ8eLa9flryi9S_Y3v4",
  "refresh_expires_at": "2026-11-28T14:27:23.421650404Z",
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
  "command_id": "68e0f932-a525-40e3-aa89-8010677a0363",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:27:23Z",
    "sequence": 1793284043995
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d4094ae5-df5e-4c0b-871e-99a4cb2f9484",
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
  "last_heartbeat_at": "2026-10-29T14:27:24.067472Z",
  "last_location_at": "2026-10-29T14:27:24.067472Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631102946",
  "device_ref": "sandbox-15967"
}
```

```json
{
  "challenge_id": "684d8b2b-5d95-41aa-96d3-db5fcc42a67e",
  "expires_at": "2026-10-29T14:32:24.375246867Z",
  "resend_available_at": "2026-10-29T14:27:25.375246867Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631102946` → **200**

```json
{
  "phone": "+380631102946",
  "audience": "CLIENT",
  "code": "834887",
  "sent_at": "2026-10-29T14:27:24.380440444Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "684d8b2b-5d95-41aa-96d3-db5fcc42a67e",
  "code": "834887",
  "device_ref": "sandbox-15967"
}
```

```json
{
  "session_id": "ed522d47-ed54-4b80-bfe1-92784e7ddfbc",
  "subject": {
    "type": "CLIENT",
    "id": "f5c94a16-0379-4285-8d30-c9fbad26cf92"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNWM5NGExNi0wMzc5LTQyODUtOGQzMC1jOWZiYWQyNmNmOTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg0OTQ0LCJpYXQiOjE3OTMyODQwNDQsImp0aSI6IjUxZGY3NmM2LTE2ODktNGEyNi04ZDI4LTdlODhkNzgxOGUwNCIsInNpZCI6ImVkNTIyZDQ3LWVkNTQtNGI4MC1iZmUxLTkyNzg0ZTdkZGZiYyJ9.th4G5XMztw7oshFaaEPr-E_DzpdXuGj7sqpRMSe3VPo",
  "access_expires_at": "2026-10-29T14:42:24.693501262Z",
  "refresh_token": "LAiy5TAbhPtFoJrME6iPNmzmcJbUetnuoNHlNWEIdFM",
  "refresh_expires_at": "2026-11-28T14:27:24.6925651Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "786ea057-f604-47af-85e5-862e04db3690",
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
  "id": "e5172060-c64c-4dfe-864e-f8b118e938d2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:32:25.011175Z",
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
  "command_id": "b6781f97-491d-41d2-801e-440afdcf0af2",
  "quote_id": "e5172060-c64c-4dfe-864e-f8b118e938d2",
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
  "id": "6a828d3f-87f8-4a09-871f-32294dffd248",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5c94a16-0379-4285-8d30-c9fbad26cf92",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:27:25.384737Z",
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
    "id": "4c58986f-b8f5-4376-83ae-1d93e6d8c5eb",
    "order_id": "6a828d3f-87f8-4a09-871f-32294dffd248",
    "expires_at": "2026-10-29T14:27:40.3963Z",
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

`POST /api/driver/v1/offers/4c58986f-b8f5-4376-83ae-1d93e6d8c5eb/accept` → **200**

```json
{
  "command_id": "3d106d2b-7342-401b-9fc6-13117e524fb9"
}
```

```json
{
  "id": "f01d5758-a8c1-4aeb-a514-a4ab057ffaf0",
  "order_id": "6a828d3f-87f8-4a09-871f-32294dffd248",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e881731a-2400-475d-b58b-02232b55e7f8",
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
  "command_id": "550944b8-8fd7-4eb9-ac9f-7e29fd6dea05",
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
  "changed_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T14:27:26.643343854Z"
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
  "id": "e881731a-2400-475d-b58b-02232b55e7f8",
  "order_id": "6a828d3f-87f8-4a09-871f-32294dffd248",
  "assignment_id": "f01d5758-a8c1-4aeb-a514-a4ab057ffaf0",
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

`POST /api/driver/v1/work-sessions/d4094ae5-df5e-4c0b-871e-99a4cb2f9484/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:27:27Z",
    "sequence": 1793284047550
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d4094ae5-df5e-4c0b-871e-99a4cb2f9484",
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
  "last_heartbeat_at": "2026-10-29T14:27:27.575974Z",
  "last_location_at": "2026-10-29T14:27:27.575974Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e881731a-2400-475d-b58b-02232b55e7f8/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "e04ff808-2fad-4e11-bdee-c9a0b2bbb0a5",
  "expected_version": 0
}
```

```json
{
  "id": "e881731a-2400-475d-b58b-02232b55e7f8",
  "order_id": "6a828d3f-87f8-4a09-871f-32294dffd248",
  "assignment_id": "f01d5758-a8c1-4aeb-a514-a4ab057ffaf0",
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
  "arrived_at": "2026-10-29T14:27:27.873989Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e881731a-2400-475d-b58b-02232b55e7f8/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "28ae2f5e-6368-46c9-a535-12291df6c195",
  "expected_version": 1
}
```

```json
{
  "id": "e881731a-2400-475d-b58b-02232b55e7f8",
  "order_id": "6a828d3f-87f8-4a09-871f-32294dffd248",
  "assignment_id": "f01d5758-a8c1-4aeb-a514-a4ab057ffaf0",
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
  "arrived_at": "2026-10-29T14:27:27.873989Z",
  "started_at": "2026-10-29T14:27:28.174378Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e881731a-2400-475d-b58b-02232b55e7f8/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "4b4f7dab-b3a4-4e6d-b92b-377b7e980002",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:27:28Z",
  "cash_received": true
}
```

```json
{
  "id": "e881731a-2400-475d-b58b-02232b55e7f8",
  "order_id": "6a828d3f-87f8-4a09-871f-32294dffd248",
  "assignment_id": "f01d5758-a8c1-4aeb-a514-a4ab057ffaf0",
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
  "arrived_at": "2026-10-29T14:27:27.873989Z",
  "started_at": "2026-10-29T14:27:28.174378Z",
  "completed_at": "2026-10-29T14:27:28.49457Z",
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
  "session_id": "d4094ae5-df5e-4c0b-871e-99a4cb2f9484",
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
  "last_heartbeat_at": "2026-10-29T14:27:27.575974Z",
  "last_location_at": "2026-10-29T14:27:27.575974Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d4094ae5-df5e-4c0b-871e-99a4cb2f9484/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "7ca0ea4b-5c19-4736-9d7a-cdc61a4b2fbf",
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
  "command_id": "250711a0-d7c4-45fc-9509-5046896e171d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:27:29Z",
    "sequence": 1793284049386
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
  "correlation_id": "7b790d0f-9037-4c3d-bd48-88473a9d58f2",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "aa0ca1c3-8238-42a9-9129-abb87548a5c5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:27:29Z",
    "sequence": 1793284049704
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1e734e4a-60ea-4100-997b-3a4f1e054b72",
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
  "last_heartbeat_at": "2026-10-29T14:27:29.726029Z",
  "last_location_at": "2026-10-29T14:27:29.726029Z",
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
  "changed_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T14:27:26.643344Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "6115530e-20e1-4b9a-b7c1-d8574b86418d",
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
  "changed_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T14:27:30.319818811Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1e734e4a-60ea-4100-997b-3a4f1e054b72",
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
  "last_heartbeat_at": "2026-10-29T14:27:29.726029Z",
  "last_location_at": "2026-10-29T14:27:29.726029Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1e734e4a-60ea-4100-997b-3a4f1e054b72/close` → **200**

```json
{
  "command_id": "025d2db3-370f-49d0-a6d9-e46e84ebe7f7",
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
  "session_id": "767f1e5b-6753-4447-a151-ada736fc40ca",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODQ5NTEsImlhdCI6MTc5MzI4NDA1MSwianRpIjoiMDdjZWViMmEtMWFkZC00YzhkLTkxMzAtZmI4NDAxYmFhZDE1Iiwic2lkIjoiNzY3ZjFlNWItNjc1My00NDQ3LWExNTEtYWRhNzM2ZmM0MGNhIn0.FWaZFHYZMcA25PRUd1nRA1rFMQqyBHyHliaJlE0b648",
  "access_expires_at": "2026-10-29T14:42:31.485183013Z",
  "refresh_token": "DIIEPdrrEJ7zC4sU3Xtp_110QBX2e4zXhlmlGqxdFzQ",
  "refresh_expires_at": "2026-10-30T02:27:31.484436476Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "3820e773-5aa6-4add-bdaa-657cda4f6332",
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
  "id": "5a0df387-88d9-4cac-8ebd-f603ad0be1b8",
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
  "created_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
  "created_at": "2026-10-29T14:27:31.786109Z",
  "updated_at": "2026-10-29T14:27:31.786109Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630801573",
  "device_ref": "sandbox-11497"
}
```

```json
{
  "challenge_id": "49119797-bf95-4403-80cd-83b4dda96b2c",
  "expires_at": "2026-10-29T14:32:32.086482246Z",
  "resend_available_at": "2026-10-29T14:27:33.086482246Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630801573` → **200**

```json
{
  "phone": "+380630801573",
  "audience": "CLIENT",
  "code": "811732",
  "sent_at": "2026-10-29T14:27:32.091228109Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "49119797-bf95-4403-80cd-83b4dda96b2c",
  "code": "811732",
  "device_ref": "sandbox-11497"
}
```

```json
{
  "session_id": "d1d4f436-f019-4ff4-87b2-3a6b55c1c9cb",
  "subject": {
    "type": "CLIENT",
    "id": "b9dab405-fe73-47e5-b9e1-f4027fdfc3f6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiOWRhYjQwNS1mZTczLTQ3ZTUtYjllMS1mNDAyN2ZkZmMzZjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg0OTUyLCJpYXQiOjE3OTMyODQwNTIsImp0aSI6ImU5ZWJiMzQ0LWNlMjMtNGZjNC1iOGEwLTM1N2ZkZDM3ODM2YyIsInNpZCI6ImQxZDRmNDM2LWYwMTktNGZmNC04N2IyLTNhNmI1NWMxYzljYiJ9.r8WqZPk6WxlVnHpVa0unVbTKWyz0Xos1o1F4OhvtuHs",
  "access_expires_at": "2026-10-29T14:42:32.399334299Z",
  "refresh_token": "O6uCxGo9sFnqg6A7bjgqaIR7D9AFOEnzoYg_Pr8xB3E",
  "refresh_expires_at": "2026-11-28T14:27:32.398681958Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380630801573` → **200**

```json
{
  "client_id": "b9dab405-fe73-47e5-b9e1-f4027fdfc3f6"
}
```

`POST /api/admin/v1/rider-wallets/b9dab405-fe73-47e5-b9e1-f4027fdfc3f6/top-ups` → **201**

```json
{
  "command_id": "b2539af7-46a1-4e70-b809-6ba85bf99dbd",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "b9dab405-fe73-47e5-b9e1-f4027fdfc3f6",
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
      "id": "4d1e4e16-d777-4f9a-9903-9a6a5f9350f7",
      "at": "2026-10-29T14:27:32.977373Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4821fe1d-4c42-4116-9d5d-9d65c46ec2ef",
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
  "id": "0c56a12e-e5f5-4583-a701-2fc72c685c1e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:32:33.292602Z",
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
      "id": "5a0df387-88d9-4cac-8ebd-f603ad0be1b8",
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
  "device_ref": "sandbox-1923"
}
```

```json
{
  "challenge_id": "faef39c7-2056-49e3-8ee2-31f3d0ac8367",
  "expires_at": "2026-10-29T14:32:33.59002948Z",
  "resend_available_at": "2026-10-29T14:27:34.59002948Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "477988",
  "sent_at": "2026-10-29T14:27:33.594185556Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "faef39c7-2056-49e3-8ee2-31f3d0ac8367",
  "code": "477988",
  "device_ref": "sandbox-1923"
}
```

```json
{
  "session_id": "8fbaead6-9956-4331-a889-6bdd567e8e8e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NDk1MywiaWF0IjoxNzkzMjg0MDUzLCJqdGkiOiIwZjQ0MzE2Yi0xM2FjLTRhOWQtOWM4MC01YjMxNGZlOGJmMjQiLCJzaWQiOiI4ZmJhZWFkNi05OTU2LTQzMzEtYTg4OS02YmRkNTY3ZThlOGUifQ.lf9aEZm7t0go_U9VSsCP6nXbTQtJMM5cMq7bjlY3gJ4",
  "access_expires_at": "2026-10-29T14:42:33.900786322Z",
  "refresh_token": "28S_WfdaNnS6XlwQxjWdL1Ob8Uc1qb0yZGWXW92owQI",
  "refresh_expires_at": "2026-11-28T14:27:33.900031861Z",
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
  "command_id": "47c4429b-aad3-478f-9852-3d9b44e59f3b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:27:34Z",
    "sequence": 1793284054445
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7d1ca977-3ed6-473e-90f3-65398f665b43",
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
  "last_heartbeat_at": "2026-10-29T14:27:34.466039Z",
  "last_location_at": "2026-10-29T14:27:34.466039Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "1e52a269-4b3d-4681-a8f7-0de68d2c148f",
  "quote_id": "0c56a12e-e5f5-4583-a701-2fc72c685c1e",
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
  "id": "4b5bb73a-52fb-4db8-ae43-a687ea9b7325",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9dab405-fe73-47e5-b9e1-f4027fdfc3f6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:27:34.766496Z",
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
  "client_id": "b9dab405-fe73-47e5-b9e1-f4027fdfc3f6",
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
      "id": "4d1e4e16-d777-4f9a-9903-9a6a5f9350f7",
      "at": "2026-10-29T14:27:32.977373Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
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
    "id": "7f78ffd3-457b-4404-819c-24a345934b04",
    "order_id": "4b5bb73a-52fb-4db8-ae43-a687ea9b7325",
    "expires_at": "2026-10-29T14:27:49.77545Z",
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

`POST /api/driver/v1/offers/7f78ffd3-457b-4404-819c-24a345934b04/accept` → **200**

```json
{
  "command_id": "ba1c8f41-cef7-4803-a977-d66fba18ec4c"
}
```

```json
{
  "id": "868c7532-8a7f-4d09-a55a-324001ede0f1",
  "order_id": "4b5bb73a-52fb-4db8-ae43-a687ea9b7325",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "109c95d3-6bbe-4303-b0f9-d63783a8a398",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "109c95d3-6bbe-4303-b0f9-d63783a8a398",
  "order_id": "4b5bb73a-52fb-4db8-ae43-a687ea9b7325",
  "assignment_id": "868c7532-8a7f-4d09-a55a-324001ede0f1",
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

`POST /api/driver/v1/work-sessions/7d1ca977-3ed6-473e-90f3-65398f665b43/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:27:36Z",
    "sequence": 1793284056203
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7d1ca977-3ed6-473e-90f3-65398f665b43",
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
  "last_heartbeat_at": "2026-10-29T14:27:36.223489Z",
  "last_location_at": "2026-10-29T14:27:36.223489Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/109c95d3-6bbe-4303-b0f9-d63783a8a398/arrive` → **200**

```json
{
  "command_id": "f3e5a0c2-28b3-4654-919b-a7d7d29846fd",
  "expected_version": 0
}
```

```json
{
  "id": "109c95d3-6bbe-4303-b0f9-d63783a8a398",
  "order_id": "4b5bb73a-52fb-4db8-ae43-a687ea9b7325",
  "assignment_id": "868c7532-8a7f-4d09-a55a-324001ede0f1",
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
  "arrived_at": "2026-10-29T14:27:36.539776Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/109c95d3-6bbe-4303-b0f9-d63783a8a398/start` → **200**

```json
{
  "command_id": "37b467ad-d7a1-4f8f-bd0d-71b55ff25c44",
  "expected_version": 1
}
```

```json
{
  "id": "109c95d3-6bbe-4303-b0f9-d63783a8a398",
  "order_id": "4b5bb73a-52fb-4db8-ae43-a687ea9b7325",
  "assignment_id": "868c7532-8a7f-4d09-a55a-324001ede0f1",
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
  "arrived_at": "2026-10-29T14:27:36.539776Z",
  "started_at": "2026-10-29T14:27:36.837223Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/109c95d3-6bbe-4303-b0f9-d63783a8a398/complete` → **200**

```json
{
  "command_id": "169b010c-a768-44f7-ad49-c18cc2f4e377",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:27:37Z",
  "cash_received": true
}
```

```json
{
  "id": "109c95d3-6bbe-4303-b0f9-d63783a8a398",
  "order_id": "4b5bb73a-52fb-4db8-ae43-a687ea9b7325",
  "assignment_id": "868c7532-8a7f-4d09-a55a-324001ede0f1",
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
  "arrived_at": "2026-10-29T14:27:36.539776Z",
  "started_at": "2026-10-29T14:27:36.837223Z",
  "completed_at": "2026-10-29T14:27:37.155911Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "b9dab405-fe73-47e5-b9e1-f4027fdfc3f6",
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
      "id": "745103ae-abf2-4d35-ae9b-07bf21b4061c",
      "at": "2026-10-29T14:27:37.470513Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "4b5bb73a-52fb-4db8-ae43-a687ea9b7325"
    },
    {
      "id": "4d1e4e16-d777-4f9a-9903-9a6a5f9350f7",
      "at": "2026-10-29T14:27:32.977373Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/5a0df387-88d9-4cac-8ebd-f603ad0be1b8/archive` → **200**

```json
{
  "command_id": "cf1f6f7f-7393-49e4-8b68-d71c4dff91df",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "5a0df387-88d9-4cac-8ebd-f603ad0be1b8",
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
  "created_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
  "created_at": "2026-10-29T14:27:31.786109Z",
  "updated_at": "2026-10-29T14:27:40.761227Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7d1ca977-3ed6-473e-90f3-65398f665b43",
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
  "last_heartbeat_at": "2026-10-29T14:27:36.223489Z",
  "last_location_at": "2026-10-29T14:27:36.223489Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7d1ca977-3ed6-473e-90f3-65398f665b43/close` → **200**

```json
{
  "command_id": "656ca261-ee1b-4dcc-97ad-c1765b9825e1",
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

Done: order 4b5bb73a-52fb-4db8-ae43-a687ea9b7325.

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
  "session_id": "2aab4a62-824a-4532-ac31-35b1b34cf374",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODQ5NjEsImlhdCI6MTc5MzI4NDA2MSwianRpIjoiNzI4ODRhZjQtM2QyNy00NjA5LTkzNzItYzA3ZTM0MWNmNzI4Iiwic2lkIjoiMmFhYjRhNjItODI0YS00NTMyLWFjMzEtMzViMWIzNGNmMzc0In0.dNt0z_V_B-p3yrq_fVcKctgKTdGKVclxd77dwb39boQ",
  "access_expires_at": "2026-10-29T14:42:41.939616962Z",
  "refresh_token": "YUGGwEEluwKepr9MBG6eiAa07EjZG85TJjKasdrQRoQ",
  "refresh_expires_at": "2026-10-30T02:27:41.938836913Z",
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
  "command_id": "a0afc005-df07-461e-994d-7a9c5604bbb1",
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
  "session_id": "3496bcac-8e89-452b-85b7-561d377a26a0",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODQ5NjMsImlhdCI6MTc5MzI4NDA2MywianRpIjoiZDVmNTJhMDMtZjM4YS00MWEzLWI1ZjYtOTUyZTM0YTEyMzQzIiwic2lkIjoiMzQ5NmJjYWMtOGU4OS00NTJiLTg1YjctNTYxZDM3N2EyNmEwIn0.KS3psFdhkpGdcmFS4bDA1z04jK3jTGgdxZ4K-cVE86I",
  "access_expires_at": "2026-10-29T14:42:43.107814909Z",
  "refresh_token": "Ij4WhU-JQASinXrnxmYrPu-r-Eh4VTbz9v3cotgqyh4",
  "refresh_expires_at": "2026-10-30T02:27:43.107012287Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.852459",
    "linkedid": "1730052700.852459",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673001291"
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
    "id": "1730052700.852459",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "157f018c-0263-4d46-9398-556d57c8712d",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380673001291",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T14:27:43.42649Z",
      "answered_at": null,
      "ended_at": "2026-10-29T14:27:43.450977Z",
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
    "id": "1730052600.1571523944",
    "linkedid": "1730052600.1571523944",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673001291"
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
      "id": "2c8f32a7-070a-4020-adf2-49e8052d7880",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673001291",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T14:27:43.771064Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/2c8f32a7-070a-4020-adf2-49e8052d7880/answer` → **200**

```json
{
  "command_id": "c3ddb164-f8d0-4d10-b25c-ca6b7a672fe5"
}
```

```json
{
  "id": "2c8f32a7-070a-4020-adf2-49e8052d7880",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673001291",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
  "order_ids": [],
  "started_at": "2026-10-29T14:27:43.771064Z",
  "answered_at": "2026-10-29T14:27:44.095025Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1571523944",
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
    "id": "1730052600.1571523944",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "2c8f32a7-070a-4020-adf2-49e8052d7880",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673001291",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
      "order_ids": [],
      "started_at": "2026-10-29T14:27:43.771064Z",
      "answered_at": "2026-10-29T14:27:44.095025Z",
      "ended_at": "2026-10-29T14:27:44.392261Z",
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
      "id": "2c8f32a7-070a-4020-adf2-49e8052d7880",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673001291",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
      "order_ids": [],
      "started_at": "2026-10-29T14:27:43.771064Z",
      "answered_at": "2026-10-29T14:27:44.095025Z",
      "ended_at": "2026-10-29T14:27:44.392261Z",
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
      "id": "2c8f32a7-070a-4020-adf2-49e8052d7880",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673001291",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
      "order_ids": [],
      "started_at": "2026-10-29T14:27:43.771064Z",
      "answered_at": "2026-10-29T14:27:44.095025Z",
      "ended_at": "2026-10-29T14:27:44.392261Z",
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
      "id": "2c8f32a7-070a-4020-adf2-49e8052d7880",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673001291",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
      "order_ids": [],
      "started_at": "2026-10-29T14:27:43.771064Z",
      "answered_at": "2026-10-29T14:27:44.095025Z",
      "ended_at": "2026-10-29T14:27:44.392261Z",
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
      "id": "2c8f32a7-070a-4020-adf2-49e8052d7880",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673001291",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
      "order_ids": [],
      "started_at": "2026-10-29T14:27:43.771064Z",
      "answered_at": "2026-10-29T14:27:44.095025Z",
      "ended_at": "2026-10-29T14:27:44.392261Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:27:53.156668Z"
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
      "id": "2c8f32a7-070a-4020-adf2-49e8052d7880",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673001291",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
      "order_ids": [],
      "started_at": "2026-10-29T14:27:43.771064Z",
      "answered_at": "2026-10-29T14:27:44.095025Z",
      "ended_at": "2026-10-29T14:27:44.392261Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:27:53.156668Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/2c8f32a7-070a-4020-adf2-49e8052d7880/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/2c8f32a7-070a-4020-adf2-49e8052d7880/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=2c8f32a7-070a-4020-adf2-49e8052d7880` → **200**

```json
{
  "changes": [
    {
      "id": "75ca9ef8-e099-4ab2-8e8e-b1a05fd4c90d",
      "occurred_at": "2026-10-29T14:27:54.18271Z",
      "actor_type": "STAFF",
      "actor_id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "2c8f32a7-070a-4020-adf2-49e8052d7880",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"4cbd5578-cf65-4ca6-bd58-e657eb54c13d\", \"order_ids\": []}",
      "correlation_id": "050bfae6-923b-42e5-a58c-21e20f74fb8c"
    },
    {
      "id": "4d9b028c-b344-4bc5-9d69-e61526af61b4",
      "occurred_at": "2026-10-29T14:27:54.147526Z",
      "actor_type": "STAFF",
      "actor_id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "2c8f32a7-070a-4020-adf2-49e8052d7880",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"4cbd5578-cf65-4ca6-bd58-e657eb54c13d\", \"order_ids\": []}",
      "correlation_id": "a183f9c0-dbd8-44fb-92d6-0e84debb66d1"
    }
  ]
}
```

Done: call 2c8f32a7-070a-4020-adf2-49e8052d7880 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-18371"
}
```

```json
{
  "challenge_id": "8ded6c7a-86cc-4001-8d70-d6fe9ab6148e",
  "expires_at": "2026-10-29T14:32:54.502923863Z",
  "resend_available_at": "2026-10-29T14:27:55.502923863Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "581852",
  "sent_at": "2026-10-29T14:27:54.507218115Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8ded6c7a-86cc-4001-8d70-d6fe9ab6148e",
  "code": "581852",
  "device_ref": "sandbox-18371"
}
```

```json
{
  "session_id": "12fc5f20-b2e8-4d87-bcb0-d9c2ded0fc66",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NDk3NCwiaWF0IjoxNzkzMjg0MDc0LCJqdGkiOiI3ZjNkYTVjMC0wOTk5LTRlOGItOGVmMy0yZjQ4YmE4MmY3NGUiLCJzaWQiOiIxMmZjNWYyMC1iMmU4LTRkODctYmNiMC1kOWMyZGVkMGZjNjYifQ.kvydN9A16Tu3JTJumoNWby7Sz66IRufxXjIZPGD9WqA",
  "access_expires_at": "2026-10-29T14:42:54.809266547Z",
  "refresh_token": "bLyqwYUn_CC6-gh0rcj2o1AI0vwyVIuJXHKR5V5fnjs",
  "refresh_expires_at": "2026-11-28T14:27:54.808655044Z",
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
  "command_id": "be275ebd-0d47-4820-856a-c0399c299f8c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:27:55Z",
    "sequence": 1793284075350
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9bbfdf10-d501-4f45-a7ff-26697c1104a5",
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
  "last_heartbeat_at": "2026-10-29T14:27:55.371143Z",
  "last_location_at": "2026-10-29T14:27:55.371143Z",
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
  "session_id": "d85940f8-9ecf-4f31-8d48-b30b6ef250cf",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODQ5NzUsImlhdCI6MTc5MzI4NDA3NSwianRpIjoiYTRlNGI5OTctZGNiNS00MDBjLWEyZmUtZmY5YTMwMTI2YTgxIiwic2lkIjoiZDg1OTQwZjgtOWVjZi00ZjMxLThkNDgtYjMwYjZlZjI1MGNmIn0.bmEhD-j8a7ioCJUzw3TgeMUV1FEn8c6EA8tUjjfI-3k",
  "access_expires_at": "2026-10-29T14:42:55.971674117Z",
  "refresh_token": "craOUPSaTpT8Bpa9W090VQyiL49kcqsUlLPGmEghPoM",
  "refresh_expires_at": "2026-10-30T02:27:55.970940985Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "8a9d1e37-f9e2-46e3-ac66-6ccdb120e0b1",
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
  "id": "09e5aaf9-c8de-41a2-ba3a-55630024f061",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:32:56.255311Z",
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
  "command_id": "2c51730e-7191-487b-9dc9-7b93e47dea25",
  "quote_id": "09e5aaf9-c8de-41a2-ba3a-55630024f061",
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
    "phone": "+380675930482"
  }
}
```

```json
{
  "id": "d59efb03-9e53-490b-b1d0-cf3e4d35fb81",
  "short_number": 3,
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
  "created_at": "2026-10-29T14:27:56.578815Z",
  "caller": {
    "name": "Олена",
    "phone": "+380675930482"
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
    "id": "58659158-3168-4e46-af0b-5d644cbf969f",
    "order_id": "d59efb03-9e53-490b-b1d0-cf3e4d35fb81",
    "expires_at": "2026-10-29T14:28:11.584092Z",
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

`POST /api/driver/v1/offers/58659158-3168-4e46-af0b-5d644cbf969f/accept` → **200**

```json
{
  "command_id": "578306f4-9ddc-4594-a149-86046880aa25"
}
```

```json
{
  "id": "e22ef5ef-29b5-4e95-b077-46d3d2fb7a45",
  "order_id": "d59efb03-9e53-490b-b1d0-cf3e4d35fb81",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "974f94d8-af3c-4868-ad95-b0e749537405",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380675930482` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380675930482` → **200**

```json
[
  {
    "phone": "+380675930482",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:27:58.331445587Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675930482` → **200**

```json
[
  {
    "phone": "+380675930482",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:27:58.331445587Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675930482` → **200**

```json
[
  {
    "phone": "+380675930482",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:27:58.331445587Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "974f94d8-af3c-4868-ad95-b0e749537405",
  "order_id": "d59efb03-9e53-490b-b1d0-cf3e4d35fb81",
  "assignment_id": "e22ef5ef-29b5-4e95-b077-46d3d2fb7a45",
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
    "phone": "+380675930482"
  }
}
```

`POST /api/driver/v1/work-sessions/9bbfdf10-d501-4f45-a7ff-26697c1104a5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:27:58Z",
    "sequence": 1793284078852
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9bbfdf10-d501-4f45-a7ff-26697c1104a5",
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
  "last_heartbeat_at": "2026-10-29T14:27:58.875592Z",
  "last_location_at": "2026-10-29T14:27:58.875592Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/974f94d8-af3c-4868-ad95-b0e749537405/arrive` → **200**

```json
{
  "command_id": "6fb5e3ce-1b78-4ad1-a37f-ccd264097a0f",
  "expected_version": 0
}
```

```json
{
  "id": "974f94d8-af3c-4868-ad95-b0e749537405",
  "order_id": "d59efb03-9e53-490b-b1d0-cf3e4d35fb81",
  "assignment_id": "e22ef5ef-29b5-4e95-b077-46d3d2fb7a45",
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
  "arrived_at": "2026-10-29T14:27:59.165725Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675930482"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380675930482` → **200**

```json
[
  {
    "phone": "+380675930482",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:27:58.331445587Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675930482` → **200**

```json
[
  {
    "phone": "+380675930482",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:27:58.331445587Z"
  },
  {
    "phone": "+380675930482",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T14:28:00.339079852Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675930482` → **200**

```json
[
  {
    "phone": "+380675930482",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:27:58.331445587Z"
  },
  {
    "phone": "+380675930482",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T14:28:00.339079852Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675930482` → **200**

```json
[
  {
    "phone": "+380675930482",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:27:58.331445587Z"
  },
  {
    "phone": "+380675930482",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T14:28:00.339079852Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/974f94d8-af3c-4868-ad95-b0e749537405/start` → **200**

```json
{
  "command_id": "8a1d71fc-47bd-4bd2-9976-cacf3120c852",
  "expected_version": 1
}
```

```json
{
  "id": "974f94d8-af3c-4868-ad95-b0e749537405",
  "order_id": "d59efb03-9e53-490b-b1d0-cf3e4d35fb81",
  "assignment_id": "e22ef5ef-29b5-4e95-b077-46d3d2fb7a45",
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
  "arrived_at": "2026-10-29T14:27:59.165725Z",
  "started_at": "2026-10-29T14:28:00.568438Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675930482"
  }
}
```

`POST /api/driver/v1/trips/974f94d8-af3c-4868-ad95-b0e749537405/complete` → **200**

```json
{
  "command_id": "581ad85e-dc9e-4959-8058-e2ce032ff039",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:28:00Z",
  "cash_received": true
}
```

```json
{
  "id": "974f94d8-af3c-4868-ad95-b0e749537405",
  "order_id": "d59efb03-9e53-490b-b1d0-cf3e4d35fb81",
  "assignment_id": "e22ef5ef-29b5-4e95-b077-46d3d2fb7a45",
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
  "arrived_at": "2026-10-29T14:27:59.165725Z",
  "started_at": "2026-10-29T14:28:00.568438Z",
  "completed_at": "2026-10-29T14:28:00.861436Z",
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
  "session_id": "9bbfdf10-d501-4f45-a7ff-26697c1104a5",
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
  "last_heartbeat_at": "2026-10-29T14:27:58.875592Z",
  "last_location_at": "2026-10-29T14:27:58.875592Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9bbfdf10-d501-4f45-a7ff-26697c1104a5/close` → **200**

```json
{
  "command_id": "d7a34709-ef52-4fad-bd04-d001097aaa76",
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
  "phone": "+380632254679",
  "device_ref": "sandbox-13753"
}
```

```json
{
  "challenge_id": "ae744998-5d59-484d-b3e9-66aa3631a9df",
  "expires_at": "2026-10-29T14:33:01.752420346Z",
  "resend_available_at": "2026-10-29T14:28:02.752420346Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632254679` → **200**

```json
{
  "phone": "+380632254679",
  "audience": "CLIENT",
  "code": "461580",
  "sent_at": "2026-10-29T14:28:01.757531558Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ae744998-5d59-484d-b3e9-66aa3631a9df",
  "code": "461580",
  "device_ref": "sandbox-13753"
}
```

```json
{
  "session_id": "797eab97-ad0f-44f0-bdfd-df8eb52dc2b2",
  "subject": {
    "type": "CLIENT",
    "id": "28dfa5b1-c3ab-4118-bb42-2ee67d85f355"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOGRmYTViMS1jM2FiLTQxMTgtYmI0Mi0yZWU2N2Q4NWYzNTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg0OTgyLCJpYXQiOjE3OTMyODQwODIsImp0aSI6ImIzOTZlMjViLTI2ZjktNDM1YS05ZDZiLTI3M2U0M2NiN2I1YiIsInNpZCI6Ijc5N2VhYjk3LWFkMGYtNDRmMC1iZGZkLWRmOGViNTJkYzJiMiJ9.0q5VQyhVbR3kT4id7x6GUbwXHBFu0tjP0JFZw7zEd2w",
  "access_expires_at": "2026-10-29T14:43:02.07282337Z",
  "refresh_token": "k3oQdvXxR-QUAD1NPIe2tXiLh6bQ0tgFYzLnCjjZ-NI",
  "refresh_expires_at": "2026-11-28T14:28:02.072092154Z",
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
        "ru": "Передумал ехать",
        "en": "Changed my mind",
        "uk": "Передумав їхати"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long",
        "uk": "Довго чекати авто"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "pl": "Błędny adres",
        "ru": "Ошибся адресом",
        "en": "Wrong address",
        "uk": "Помилився адресою"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "pl": "Inny transport",
        "ru": "Уеду на другом транспорте",
        "en": "Found other transport",
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
  "device_ref": "sandbox-770"
}
```

```json
{
  "challenge_id": "737a624d-9563-4c6e-a434-bb8bfab2e9b8",
  "expires_at": "2026-10-29T14:33:02.6248666Z",
  "resend_available_at": "2026-10-29T14:28:03.6248666Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "890327",
  "sent_at": "2026-10-29T14:28:02.62846934Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "737a624d-9563-4c6e-a434-bb8bfab2e9b8",
  "code": "890327",
  "device_ref": "sandbox-770"
}
```

```json
{
  "session_id": "9a8caab4-b03a-4b6d-8f1a-0e41aabf3699",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NDk4MiwiaWF0IjoxNzkzMjg0MDgyLCJqdGkiOiIzNGM2NjA2NS03MzBkLTQzYjItODQ4NS05NjM3NjViNmExYjEiLCJzaWQiOiI5YThjYWFiNC1iMDNhLTRiNmQtOGYxYS0wZTQxYWFiZjM2OTkifQ.cPg-yMa3-oYYbsNqfyNO4UYOxcHDdecuvngJxOOL7dM",
  "access_expires_at": "2026-10-29T14:43:02.933386264Z",
  "refresh_token": "Gv8yy1JJg1nkHolpni0dwa14YslMPlVsL2fiZoao4kU",
  "refresh_expires_at": "2026-11-28T14:28:02.932756025Z",
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
        "ru": "Пассажир не вышел",
        "en": "Passenger did not show up",
        "uk": "Пасажир не вийшов"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "pl": "Awaria samochodu",
        "ru": "Неисправность автомобиля",
        "en": "Vehicle problem",
        "uk": "Несправність автомобіля"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "pl": "Nie mogę dojechać",
        "ru": "Не могу подъехать",
        "en": "Cannot reach the pickup",
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
  "session_id": "86b433cc-6c8a-4899-8284-b062995044bf",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODQ5ODMsImlhdCI6MTc5MzI4NDA4MywianRpIjoiNTRlYjRiNjItZTliZS00NWFjLTk4ZDAtYmNiMjUzODQ1YTk5Iiwic2lkIjoiODZiNDMzY2MtNmM4YS00ODk5LTgyODQtYjA2Mjk5NTA0NGJmIn0.U4srrJfEopij4fx_ZvVlIBnwn1Sgd0HycxhpGQ3WouA",
  "access_expires_at": "2026-10-29T14:43:03.77225014Z",
  "refresh_token": "uJpBJjhhP0_WQcgSQaQCT0IZ-Viqe0LGdKYTv6LMD98",
  "refresh_expires_at": "2026-10-30T02:28:03.771676797Z",
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
  "session_id": "58007859-9e4f-43ec-978e-e68bfb1ab305",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODQ5ODQsImlhdCI6MTc5MzI4NDA4NCwianRpIjoiYWEwMGViZGEtYTRmYS00ZWM1LTk5NTItYzcxYjRmMTgzNjQzIiwic2lkIjoiNTgwMDc4NTktOWU0Zi00M2VjLTk3OGUtZTY4YmZiMWFiMzA1In0.0vv_DzYXUhHsir3Nyz6CC-75lvmSf1fjvqJqv2zS-Y8",
  "access_expires_at": "2026-10-29T14:43:04.348413492Z",
  "refresh_token": "uzd9lFPUfb5ISJ8VkA-u1HpdnXSH8R7oDipj91ee7hg",
  "refresh_expires_at": "2026-10-30T02:28:04.347686267Z",
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
        "ru": "Пассажир попросил",
        "en": "Passenger asked",
        "uk": "Пасажир попросив"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "pl": "Duplikat zamówienia",
        "ru": "Дубль заказа",
        "en": "Duplicate order",
        "uk": "Дубль замовлення"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "pl": "Brak wolnych aut",
        "ru": "Нет свободных машин",
        "en": "No cars available",
        "uk": "Немає вільних авто"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "pl": "Zamówienie testowe",
        "ru": "Тестовый заказ",
        "en": "Test order",
        "uk": "Тестове замовлення"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "pl": "Błąd operatora",
        "ru": "Ошибка оператора",
        "en": "Operator error",
        "uk": "Помилка оператора"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "pl": "Wypadek",
        "ru": "ДТП",
        "en": "Accident",
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
  "command_id": "3c69e4b3-792e-48b2-b74a-18103d9d3b49",
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
  "id": "412e93e8-db85-4e17-911d-b92983a774ee",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:33:04.913133Z",
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
  "command_id": "c405b66a-2e72-4b77-906f-18401ae3b793",
  "quote_id": "412e93e8-db85-4e17-911d-b92983a774ee",
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
  "id": "d6857123-f2aa-4ead-844b-d4b762c8794f",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "28dfa5b1-c3ab-4118-bb42-2ee67d85f355",
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
  "created_at": "2026-10-29T14:28:05.224572Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d6857123-f2aa-4ead-844b-d4b762c8794f` → **200**

```json
{
  "id": "d6857123-f2aa-4ead-844b-d4b762c8794f",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "28dfa5b1-c3ab-4118-bb42-2ee67d85f355",
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
  "created_at": "2026-10-29T14:28:05.224572Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d6857123-f2aa-4ead-844b-d4b762c8794f/cancel` → **200**

```json
{
  "command_id": "ea56a578-5a03-411d-8071-15961f80163f",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "d6857123-f2aa-4ead-844b-d4b762c8794f",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "28dfa5b1-c3ab-4118-bb42-2ee67d85f355",
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
  "created_at": "2026-10-29T14:28:05.224572Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "pl": "Zbyt długie oczekiwanie",
      "ru": "Долго ждать машину",
      "en": "The wait is too long",
      "uk": "Довго чекати авто"
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
  "command_id": "44134152-1859-4694-896a-da2a90188b53",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:28:06Z",
    "sequence": 1793284086396
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "da476764-0cee-4d53-a8db-c6578e404813",
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
  "last_heartbeat_at": "2026-10-29T14:28:06.416563Z",
  "last_location_at": "2026-10-29T14:28:06.416563Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-15796"
}
```

```json
{
  "challenge_id": "6b56961e-2ccb-4075-b0ab-0306820b2b18",
  "expires_at": "2026-10-29T14:33:06.708015231Z",
  "resend_available_at": "2026-10-29T14:28:07.708015231Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "178332",
  "sent_at": "2026-10-29T14:28:06.711417786Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6b56961e-2ccb-4075-b0ab-0306820b2b18",
  "code": "178332",
  "device_ref": "sandbox-15796"
}
```

```json
{
  "session_id": "db268bef-4488-4279-ada2-ab79fed8d71d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NDk4NywiaWF0IjoxNzkzMjg0MDg3LCJqdGkiOiI1Y2M3MGZlZi1kNmNiLTRkYmQtYWQ2OC04Mzg2MDgxMzk2NWIiLCJzaWQiOiJkYjI2OGJlZi00NDg4LTQyNzktYWRhMi1hYjc5ZmVkOGQ3MWQifQ.JAFiMPbnF5HL3l0o22ICjMgn02xqtEQF9ZS9E9CepdY",
  "access_expires_at": "2026-10-29T14:43:07.021179273Z",
  "refresh_token": "wqdkPQWQyYY53gDdjBIF7qNRjJOF5BqX09JUkfrNl-Y",
  "refresh_expires_at": "2026-11-28T14:28:07.020484734Z",
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
  "command_id": "29da1f48-3ec6-43b7-b548-bbc2ca3fbc60",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:28:07Z",
    "sequence": 1793284087581
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "165775d9-98f8-43fa-b01a-7182ea38f164",
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
  "last_heartbeat_at": "2026-10-29T14:28:07.602336Z",
  "last_location_at": "2026-10-29T14:28:07.602336Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "98997e14-c1c0-4082-9bf1-d0cfbfb1913c",
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
  "id": "f51444ff-8cd1-4fc0-9808-dabcb6d65da8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:33:07.893213Z",
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
  "command_id": "59adebb3-b4a8-4f12-b3cc-788c9c6abcea",
  "quote_id": "f51444ff-8cd1-4fc0-9808-dabcb6d65da8",
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
  "id": "b373cbac-e10d-4c4d-89c7-30c073fc917f",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "28dfa5b1-c3ab-4118-bb42-2ee67d85f355",
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
  "created_at": "2026-10-29T14:28:08.198282Z",
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
    "id": "ffd7d703-7ae7-4e46-ab7a-a11b9b2b3a6f",
    "order_id": "b373cbac-e10d-4c4d-89c7-30c073fc917f",
    "expires_at": "2026-10-29T14:28:23.202143Z",
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

`POST /api/driver/v1/offers/ffd7d703-7ae7-4e46-ab7a-a11b9b2b3a6f/accept` → **200**

```json
{
  "command_id": "1db17ca5-d6fd-4946-9686-2f41d360925f"
}
```

```json
{
  "id": "7ab9004d-6848-44c4-b062-0d8d698e434b",
  "order_id": "b373cbac-e10d-4c4d-89c7-30c073fc917f",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9c946613-19a3-428a-a6d2-df232a77805f",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9c946613-19a3-428a-a6d2-df232a77805f",
  "order_id": "b373cbac-e10d-4c4d-89c7-30c073fc917f",
  "assignment_id": "7ab9004d-6848-44c4-b062-0d8d698e434b",
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

`POST /api/driver/v1/trips/9c946613-19a3-428a-a6d2-df232a77805f/cancel` → **200**

```json
{
  "command_id": "5fe3567f-5ee3-4617-a8f8-9d685d61bd67",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "9c946613-19a3-428a-a6d2-df232a77805f",
  "order_id": "b373cbac-e10d-4c4d-89c7-30c073fc917f",
  "assignment_id": "7ab9004d-6848-44c4-b062-0d8d698e434b",
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

`GET /api/rider/v1/orders/b373cbac-e10d-4c4d-89c7-30c073fc917f` → **200**

```json
{
  "id": "b373cbac-e10d-4c4d-89c7-30c073fc917f",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "28dfa5b1-c3ab-4118-bb42-2ee67d85f355",
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
    "id": "7ab9004d-6848-44c4-b062-0d8d698e434b",
    "order_id": "b373cbac-e10d-4c4d-89c7-30c073fc917f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "9c946613-19a3-428a-a6d2-df232a77805f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T14:28:08.198282Z",
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
    "id": "c1db8cec-8d8f-4cd8-959e-2b70bc75bc1b",
    "order_id": "b373cbac-e10d-4c4d-89c7-30c073fc917f",
    "expires_at": "2026-10-29T14:28:24.353534Z",
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

`POST /api/driver/v1/offers/c1db8cec-8d8f-4cd8-959e-2b70bc75bc1b/accept` → **200**

```json
{
  "command_id": "8cc1eaa7-2166-4c3a-94ad-935f5bddb0f6"
}
```

```json
{
  "id": "73e7d8af-3fc7-4035-9f0a-492dbe638465",
  "order_id": "b373cbac-e10d-4c4d-89c7-30c073fc917f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4383864f-583e-4374-93f0-e335fd02e47c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4383864f-583e-4374-93f0-e335fd02e47c",
  "order_id": "b373cbac-e10d-4c4d-89c7-30c073fc917f",
  "assignment_id": "73e7d8af-3fc7-4035-9f0a-492dbe638465",
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

`POST /api/driver/v1/trips/4383864f-583e-4374-93f0-e335fd02e47c/cancel` → **200**

```json
{
  "command_id": "c0accbec-6aa0-4523-9ce0-66bef88ff407",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "4383864f-583e-4374-93f0-e335fd02e47c",
  "order_id": "b373cbac-e10d-4c4d-89c7-30c073fc917f",
  "assignment_id": "73e7d8af-3fc7-4035-9f0a-492dbe638465",
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
    "id": "b373cbac-e10d-4c4d-89c7-30c073fc917f",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T14:28:08.198282Z",
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
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати"
      }
    },
    "pickup_at": null
  },
  {
    "id": "d6857123-f2aa-4ead-844b-d4b762c8794f",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T14:28:05.224572Z",
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
        "ru": "Долго ждать машину",
        "en": "The wait is too long",
        "uk": "Довго чекати авто"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/b373cbac-e10d-4c4d-89c7-30c073fc917f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:28:08.19895Z",
      "actor": {
        "type": "CLIENT",
        "id": "28dfa5b1-c3ab-4118-bb42-2ee67d85f355",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b373cbac-e10d-4c4d-89c7-30c073fc917f",
        "quote_id": "f51444ff-8cd1-4fc0-9808-dabcb6d65da8",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "986235cf-ad05-4ee2-97d8-a4824e7a2f26"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:28:08.20118Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b373cbac-e10d-4c4d-89c7-30c073fc917f",
        "attempt_id": "bd5f1a73-117d-44ec-ab56-fe609b54f340",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "986235cf-ad05-4ee2-97d8-a4824e7a2f26"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:28:08.208513Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ffd7d703-7ae7-4e46-ab7a-a11b9b2b3a6f",
        "order_id": "b373cbac-e10d-4c4d-89c7-30c073fc917f",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "986235cf-ad05-4ee2-97d8-a4824e7a2f26"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T14:28:08.787287Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "ffd7d703-7ae7-4e46-ab7a-a11b9b2b3a6f",
        "order_id": "b373cbac-e10d-4c4d-89c7-30c073fc917f",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "7ab9004d-6848-44c4-b062-0d8d698e434b"
      },
      "correlation_id": "ee6b6ea0-eb5b-4cad-b4e2-f2f9646c4d5c"
```

Done: orders d6857123-f2aa-4ead-844b-d4b762c8794f, b373cbac-e10d-4c4d-89c7-30c073fc917f.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737449937",
  "device_ref": "sandbox-13470"
}
```

```json
{
  "challenge_id": "a0b6c5db-7c60-46ea-8a12-a0b3424b3a48",
  "expires_at": "2026-10-29T14:33:11.72728896Z",
  "resend_available_at": "2026-10-29T14:28:12.72728896Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737449937` → **200**

```json
{
  "phone": "+380737449937",
  "audience": "CLIENT",
  "code": "364283",
  "sent_at": "2026-10-29T14:28:11.730583332Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a0b6c5db-7c60-46ea-8a12-a0b3424b3a48",
  "code": "364283",
  "device_ref": "sandbox-13470"
}
```

```json
{
  "session_id": "22f4e3f9-ec88-4759-8f49-cbff78b39fe4",
  "subject": {
    "type": "CLIENT",
    "id": "0242d2fb-b66a-4e26-8b75-9e04bb28c2e4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjQyZDJmYi1iNjZhLTRlMjYtOGI3NS05ZTA0YmIyOGMyZTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg0OTkyLCJpYXQiOjE3OTMyODQwOTIsImp0aSI6ImZlNmJmMmNhLTE1ZTEtNGEwYS1iZmQxLWM1N2IwYjgwYmZlOSIsInNpZCI6IjIyZjRlM2Y5LWVjODgtNDc1OS04ZjQ5LWNiZmY3OGIzOWZlNCJ9.-zHdSkyZFu24wWgMRowEBxZgFN7gl1ph2Y9OeJWCK6k",
  "access_expires_at": "2026-10-29T14:43:12.056020505Z",
  "refresh_token": "ZiluQ3UEEAI1XOICLGBWMfx3vhnq7eyzHx6SnuKosYg",
  "refresh_expires_at": "2026-11-28T14:28:12.055430391Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "44efa19a-508c-4736-8423-2d7208af0fb1",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "958bc990-5ce0-4f27-8640-b28cd307c118",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-958bc990-5ce0-4f27-8640-b28cd307c118",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "3c89ae245bf91fedc7669cf0b890a642",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=958bc990-5ce0-4f27-8640-b28cd307c118",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737449937"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=958bc990-5ce0-4f27-8640-b28cd307c118",
  "expires_at": "2026-10-29T14:58:12.337223Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/958bc990-5ce0-4f27-8640-b28cd307c118` → **200**

```json
{
  "id": "958bc990-5ce0-4f27-8640-b28cd307c118",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T14:58:12.337223Z",
  "card": {
    "id": "d8030300-d18a-4936-9a4e-62e4a5ebf4e5",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1786",
    "card_type": "Visa",
    "created_at": "2026-10-29T14:28:12.627457Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "d8030300-d18a-4936-9a4e-62e4a5ebf4e5",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****1786",
      "card_type": "Visa",
      "created_at": "2026-10-29T14:28:12.627457Z"
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
  "device_ref": "sandbox-16015"
}
```

```json
{
  "challenge_id": "05b62fce-88a7-4810-a8c6-ce7a4eb10e41",
  "expires_at": "2026-10-29T14:33:13.20852111Z",
  "resend_available_at": "2026-10-29T14:28:14.20852111Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "313733",
  "sent_at": "2026-10-29T14:28:13.212049177Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "05b62fce-88a7-4810-a8c6-ce7a4eb10e41",
  "code": "313733",
  "device_ref": "sandbox-16015"
}
```

```json
{
  "session_id": "f6b70e8d-0971-4e09-8190-ca11bf9f6dc1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NDk5MywiaWF0IjoxNzkzMjg0MDkzLCJqdGkiOiIwZTI1MzlmZS1lNTExLTQ2MGYtYjQxYi0zYzlkYjA2NmM0ZTUiLCJzaWQiOiJmNmI3MGU4ZC0wOTcxLTRlMDktODE5MC1jYTExYmY5ZjZkYzEifQ.ZlLaJeX8dg8u20QJnrKyqT470wvRp7hYOgPHrZ7hHxc",
  "access_expires_at": "2026-10-29T14:43:13.521663575Z",
  "refresh_token": "L0bqqy_IbvjtHuBzt8dH63Nb5Up_Ad6zS86nRWf6OX4",
  "refresh_expires_at": "2026-11-28T14:28:13.521075044Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "165775d9-98f8-43fa-b01a-7182ea38f164",
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
  "last_heartbeat_at": "2026-10-29T14:28:07.602336Z",
  "last_location_at": "2026-10-29T14:28:07.602336Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/165775d9-98f8-43fa-b01a-7182ea38f164/handover` → **200**

```json
{
  "command_id": "8d591af1-dfcf-4e14-bd49-e26720ca7153",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "165775d9-98f8-43fa-b01a-7182ea38f164",
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
  "last_heartbeat_at": "2026-10-29T14:28:07.602336Z",
  "last_location_at": "2026-10-29T14:28:07.602336Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/165775d9-98f8-43fa-b01a-7182ea38f164/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:28:14Z",
    "sequence": 1793284094367
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "165775d9-98f8-43fa-b01a-7182ea38f164",
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
  "last_heartbeat_at": "2026-10-29T14:28:14.387292Z",
  "last_location_at": "2026-10-29T14:28:14.387292Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "911289bb-12e6-4234-9e11-819fcee3b4cb",
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
  "id": "845d2fb0-5178-4e77-b7d8-d36df34aef46",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:33:14.674682Z",
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
  "command_id": "5f44b111-2802-4ee8-b055-d17806d6b28a",
  "quote_id": "845d2fb0-5178-4e77-b7d8-d36df34aef46",
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
  "id": "6db1ba11-18b2-49ac-8f8d-0f25bb8e271b",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0242d2fb-b66a-4e26-8b75-9e04bb28c2e4",
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
  "created_at": "2026-10-29T14:28:14.980284Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6db1ba11-18b2-49ac-8f8d-0f25bb8e271b` → **200**

```json
{
  "id": "6db1ba11-18b2-49ac-8f8d-0f25bb8e271b",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0242d2fb-b66a-4e26-8b75-9e04bb28c2e4",
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
  "created_at": "2026-10-29T14:28:14.980284Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6db1ba11-18b2-49ac-8f8d-0f25bb8e271b` → **200**

```json
{
  "id": "6db1ba11-18b2-49ac-8f8d-0f25bb8e271b",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0242d2fb-b66a-4e26-8b75-9e04bb28c2e4",
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
  "created_at": "2026-10-29T14:28:14.980284Z",
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
    "id": "5f79433a-b8ac-4546-85a2-a022ace540ed",
    "order_id": "6db1ba11-18b2-49ac-8f8d-0f25bb8e271b",
    "expires_at": "2026-10-29T14:28:30.68143Z",
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

`POST /api/driver/v1/offers/5f79433a-b8ac-4546-85a2-a022ace540ed/accept` → **200**

```json
{
  "command_id": "ae5e1358-7ff1-424b-a4f4-88d7abd643f5"
}
```

```json
{
  "id": "6931dbd7-1d09-42c2-a5b8-1b1b1a75b085",
  "order_id": "6db1ba11-18b2-49ac-8f8d-0f25bb8e271b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "35ac8ab2-e8b3-4520-8b45-d3be3939b9d0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "35ac8ab2-e8b3-4520-8b45-d3be3939b9d0",
  "order_id": "6db1ba11-18b2-49ac-8f8d-0f25bb8e271b",
  "assignment_id": "6931dbd7-1d09-42c2-a5b8-1b1b1a75b085",
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

`POST /api/driver/v1/work-sessions/165775d9-98f8-43fa-b01a-7182ea38f164/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:28:17Z",
    "sequence": 1793284097762
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "165775d9-98f8-43fa-b01a-7182ea38f164",
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
  "last_heartbeat_at": "2026-10-29T14:28:17.781001Z",
  "last_location_at": "2026-10-29T14:28:17.781001Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/35ac8ab2-e8b3-4520-8b45-d3be3939b9d0/arrive` → **200**

```json
{
  "command_id": "d6b5987b-9f87-4f69-9996-1409ffc66f70",
  "expected_version": 0
}
```

```json
{
  "id": "35ac8ab2-e8b3-4520-8b45-d3be3939b9d0",
  "order_id": "6db1ba11-18b2-49ac-8f8d-0f25bb8e271b",
  "assignment_id": "6931dbd7-1d09-42c2-a5b8-1b1b1a75b085",
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
  "arrived_at": "2026-10-29T14:28:18.078088Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/35ac8ab2-e8b3-4520-8b45-d3be3939b9d0/start` → **200**

```json
{
  "command_id": "463a467e-2c08-4365-9512-dcb33f4ae9cd",
  "expected_version": 1
}
```

```json
{
  "id": "35ac8ab2-e8b3-4520-8b45-d3be3939b9d0",
  "order_id": "6db1ba11-18b2-49ac-8f8d-0f25bb8e271b",
  "assignment_id": "6931dbd7-1d09-42c2-a5b8-1b1b1a75b085",
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
  "arrived_at": "2026-10-29T14:28:18.078088Z",
  "started_at": "2026-10-29T14:28:18.380019Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/35ac8ab2-e8b3-4520-8b45-d3be3939b9d0/complete` → **200**

```json
{
  "command_id": "56204237-9c0a-4e0b-83f5-8846a64b709d",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:28:18Z",
  "cash_received": true
}
```

```json
{
  "id": "35ac8ab2-e8b3-4520-8b45-d3be3939b9d0",
  "order_id": "6db1ba11-18b2-49ac-8f8d-0f25bb8e271b",
  "assignment_id": "6931dbd7-1d09-42c2-a5b8-1b1b1a75b085",
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
  "arrived_at": "2026-10-29T14:28:18.078088Z",
  "started_at": "2026-10-29T14:28:18.380019Z",
  "completed_at": "2026-10-29T14:28:18.675896Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/6db1ba11-18b2-49ac-8f8d-0f25bb8e271b` → **200**

```json
{
  "id": "6db1ba11-18b2-49ac-8f8d-0f25bb8e271b",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "0242d2fb-b66a-4e26-8b75-9e04bb28c2e4",
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
    "id": "6931dbd7-1d09-42c2-a5b8-1b1b1a75b085",
    "order_id": "6db1ba11-18b2-49ac-8f8d-0f25bb8e271b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "35ac8ab2-e8b3-4520-8b45-d3be3939b9d0",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:28:14.980284Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6db1ba11-18b2-49ac-8f8d-0f25bb8e271b` → **200**

```json
{
  "id": "6db1ba11-18b2-49ac-8f8d-0f25bb8e271b",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "0242d2fb-b66a-4e26-8b75-9e04bb28c2e4",
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
    "id": "6931dbd7-1d09-42c2-a5b8-1b1b1a75b085",
    "order_id": "6db1ba11-18b2-49ac-8f8d-0f25bb8e271b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "35ac8ab2-e8b3-4520-8b45-d3be3939b9d0",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:28:14.980284Z",
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

`GET /api/rider/v1/orders/6db1ba11-18b2-49ac-8f8d-0f25bb8e271b/tip` → **200**

```json
{
  "order_id": "6db1ba11-18b2-49ac-8f8d-0f25bb8e271b",
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
  "available_until": "2026-10-30T14:28:18.675896Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/6db1ba11-18b2-49ac-8f8d-0f25bb8e271b/tip` → **201**

```json
{
  "command_id": "1a46359e-1d16-486c-8148-ce3970b0d1be",
  "amount_minor": 2500
}
```

```json
{
  "id": "2a14f3f8-39ec-45a5-a7a6-14034bef2912",
  "order_id": "6db1ba11-18b2-49ac-8f8d-0f25bb8e271b",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T14:28:21.140248Z"
}
```

`GET /api/rider/v1/orders/6db1ba11-18b2-49ac-8f8d-0f25bb8e271b/tip` → **200**

```json
{
  "order_id": "6db1ba11-18b2-49ac-8f8d-0f25bb8e271b",
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
  "available_until": "2026-10-30T14:28:18.675896Z",
  "open": false,
  "tip": {
    "id": "2a14f3f8-39ec-45a5-a7a6-14034bef2912",
    "order_id": "6db1ba11-18b2-49ac-8f8d-0f25bb8e271b",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T14:28:21.140248Z"
  }
}
```

`GET /api/rider/v1/orders/6db1ba11-18b2-49ac-8f8d-0f25bb8e271b/tip` → **200**

```json
{
  "order_id": "6db1ba11-18b2-49ac-8f8d-0f25bb8e271b",
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
  "available_until": "2026-10-30T14:28:18.675896Z",
  "open": false,
  "tip": {
    "id": "2a14f3f8-39ec-45a5-a7a6-14034bef2912",
    "order_id": "6db1ba11-18b2-49ac-8f8d-0f25bb8e271b",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T14:28:21.140248Z"
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
      "id": "4a300301-a433-4e17-9a9c-a86e0fc3e8ab",
      "at": "2026-10-29T14:28:22.803109Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "6db1ba11-18b2-49ac-8f8d-0f25bb8e271b",
      "counterpart_id": null
    },
    {
      "id": "1fe1119e-dad1-4e14-99b8-6ad91dccafdf",
      "at": "2026-10-29T14:28:18.7318Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "6db1ba11-18b2-49ac-8f8d-0f25bb8e271b",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "76d139f8-2d95-44d9-926d-ea3fe47981cd",
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
  "id": "7d7ee7a4-bd04-4824-8290-f4b88c0d9122",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:33:23.314738Z",
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
  "session_id": "8685809d-e524-45ee-a0f7-e17b36f5c5a9",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwMDMsImlhdCI6MTc5MzI4NDEwMywianRpIjoiMjE4NmFiMDctZWI5MC00MjdkLTlhYmQtNzcxMjhjNjUwNjZhIiwic2lkIjoiODY4NTgwOWQtZTUyNC00NWVlLWEwZjctZTE3YjM2ZjVjNWE5In0.HP9VGnExRIfvexgT7uHqpQh7mCpohSSj0HdUmWSloTY",
  "access_expires_at": "2026-10-29T14:43:23.906740629Z",
  "refresh_token": "HBErTCLwVUGSFP6zwUSVYk2x1RSNopiU6rLUkVcXVhY",
  "refresh_expires_at": "2026-10-30T02:28:23.906107574Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380737449937` → **200**

```json
{
  "client_id": "0242d2fb-b66a-4e26-8b75-9e04bb28c2e4"
}
```

`POST /api/admin/v1/rider-wallets/0242d2fb-b66a-4e26-8b75-9e04bb28c2e4/top-ups` → **201**

```json
{
  "command_id": "b0686ce6-48e5-42ea-bf97-d929d8f34e43",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "0242d2fb-b66a-4e26-8b75-9e04bb28c2e4",
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
      "id": "ccfbca09-66dd-4d6a-b9f8-86ea2af1c258",
      "at": "2026-10-29T14:28:24.453556Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "fcb576aa-a1e8-4e2c-85c8-ea820d910cbf",
  "quote_id": "7d7ee7a4-bd04-4824-8290-f4b88c0d9122",
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
  "id": "ec310976-a326-4768-bcc4-0586ffc5c775",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0242d2fb-b66a-4e26-8b75-9e04bb28c2e4",
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
  "created_at": "2026-10-29T14:28:24.748933Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ec310976-a326-4768-bcc4-0586ffc5c775` → **200**

```json
{
  "id": "ec310976-a326-4768-bcc4-0586ffc5c775",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0242d2fb-b66a-4e26-8b75-9e04bb28c2e4",
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
  "created_at": "2026-10-29T14:28:24.748933Z",
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
    "id": "723a3bc3-b60c-482f-b691-1224363a170b",
    "order_id": "ec310976-a326-4768-bcc4-0586ffc5c775",
    "expires_at": "2026-10-29T14:28:39.755645Z",
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

`POST /api/driver/v1/offers/723a3bc3-b60c-482f-b691-1224363a170b/accept` → **200**

```json
{
  "command_id": "e15da202-156e-4b40-9616-61de56b3f014"
}
```

```json
{
  "id": "da093bc4-8107-4718-83d4-479d9e9929cb",
  "order_id": "ec310976-a326-4768-bcc4-0586ffc5c775",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "132d53a5-e6f0-46d5-8cc9-ddd5d653c361",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "132d53a5-e6f0-46d5-8cc9-ddd5d653c361",
  "order_id": "ec310976-a326-4768-bcc4-0586ffc5c775",
  "assignment_id": "da093bc4-8107-4718-83d4-479d9e9929cb",
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

`POST /api/driver/v1/work-sessions/165775d9-98f8-43fa-b01a-7182ea38f164/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:28:26Z",
    "sequence": 1793284106188
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "165775d9-98f8-43fa-b01a-7182ea38f164",
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
  "last_heartbeat_at": "2026-10-29T14:28:26.208156Z",
  "last_location_at": "2026-10-29T14:28:26.208156Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/132d53a5-e6f0-46d5-8cc9-ddd5d653c361/arrive` → **200**

```json
{
  "command_id": "b19ca764-9d46-4bf1-8e7c-51d6aa3ecf3a",
  "expected_version": 0
}
```

```json
{
  "id": "132d53a5-e6f0-46d5-8cc9-ddd5d653c361",
  "order_id": "ec310976-a326-4768-bcc4-0586ffc5c775",
  "assignment_id": "da093bc4-8107-4718-83d4-479d9e9929cb",
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
  "arrived_at": "2026-10-29T14:28:26.493979Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/132d53a5-e6f0-46d5-8cc9-ddd5d653c361/start` → **200**

```json
{
  "command_id": "337f3331-a606-43a5-8b3b-b2b8a19a5086",
  "expected_version": 1
}
```

```json
{
  "id": "132d53a5-e6f0-46d5-8cc9-ddd5d653c361",
  "order_id": "ec310976-a326-4768-bcc4-0586ffc5c775",
  "assignment_id": "da093bc4-8107-4718-83d4-479d9e9929cb",
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
  "arrived_at": "2026-10-29T14:28:26.493979Z",
  "started_at": "2026-10-29T14:28:26.791498Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/132d53a5-e6f0-46d5-8cc9-ddd5d653c361/complete` → **200**

```json
{
  "command_id": "68f9109b-4ceb-4edc-a259-deef76c529f0",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:28:27Z",
  "cash_received": true
}
```

```json
{
  "id": "132d53a5-e6f0-46d5-8cc9-ddd5d653c361",
  "order_id": "ec310976-a326-4768-bcc4-0586ffc5c775",
  "assignment_id": "da093bc4-8107-4718-83d4-479d9e9929cb",
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
  "arrived_at": "2026-10-29T14:28:26.493979Z",
  "started_at": "2026-10-29T14:28:26.791498Z",
  "completed_at": "2026-10-29T14:28:27.092572Z",
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
  "client_id": "0242d2fb-b66a-4e26-8b75-9e04bb28c2e4",
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
      "id": "ccfbca09-66dd-4d6a-b9f8-86ea2af1c258",
      "at": "2026-10-29T14:28:24.453556Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
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

`GET /api/rider/v1/orders/ec310976-a326-4768-bcc4-0586ffc5c775/tip` → **200**

```json
{
  "order_id": "ec310976-a326-4768-bcc4-0586ffc5c775",
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
  "available_until": "2026-10-30T14:28:27.092572Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/ec310976-a326-4768-bcc4-0586ffc5c775/tip` → **201**

```json
{
  "command_id": "47b14241-cd51-45d5-ad29-53a3fc09fff4",
  "amount_minor": 2500
}
```

```json
{
  "id": "8a3aaee5-344e-44e4-b53e-50ed6ad525dc",
  "order_id": "ec310976-a326-4768-bcc4-0586ffc5c775",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T14:28:28.273403Z"
}
```

`GET /api/rider/v1/orders/ec310976-a326-4768-bcc4-0586ffc5c775/tip` → **200**

```json
{
  "order_id": "ec310976-a326-4768-bcc4-0586ffc5c775",
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
  "available_until": "2026-10-30T14:28:27.092572Z",
  "open": false,
  "tip": {
    "id": "8a3aaee5-344e-44e4-b53e-50ed6ad525dc",
    "order_id": "ec310976-a326-4768-bcc4-0586ffc5c775",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T14:28:28.273403Z"
  }
}
```

`GET /api/rider/v1/orders/ec310976-a326-4768-bcc4-0586ffc5c775/tip` → **200**

```json
{
  "order_id": "ec310976-a326-4768-bcc4-0586ffc5c775",
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
  "available_until": "2026-10-30T14:28:27.092572Z",
  "open": false,
  "tip": {
    "id": "8a3aaee5-344e-44e4-b53e-50ed6ad525dc",
    "order_id": "ec310976-a326-4768-bcc4-0586ffc5c775",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T14:28:28.273403Z"
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
      "id": "779e2681-1d11-4a45-b79d-e2f0962cfac8",
      "at": "2026-10-29T14:28:29.884965Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ec310976-a326-4768-bcc4-0586ffc5c775",
      "counterpart_id": null
    },
    {
      "id": "650eed0f-c5ff-4333-b319-e44a068af2f7",
      "at": "2026-10-29T14:28:27.858155Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ec310976-a326-4768-bcc4-0586ffc5c775",
      "counterpart_id": null
    },
    {
      "id": "4a300301-a433-4e17-9a9c-a86e0fc3e8ab",
      "at": "2026-10-29T14:28:22.803109Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "6db1ba11-18b2-49ac-8f8d-0f25bb8e271b",
      "counterpart_id": null
    },
    {
      "id": "1fe1119e-dad1-4e14-99b8-6ad91dccafdf",
      "at": "2026-10-29T14:28:18.7318Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "6db1ba11-18b2-49ac-8f8d-0f25bb8e271b",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "165775d9-98f8-43fa-b01a-7182ea38f164",
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
  "last_heartbeat_at": "2026-10-29T14:28:26.208156Z",
  "last_location_at": "2026-10-29T14:28:26.208156Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/165775d9-98f8-43fa-b01a-7182ea38f164/close` → **200**

```json
{
  "command_id": "130fb6e4-1d31-4250-8759-5d07f64be6ba",
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

Done: card order ec310976-a326-4768-bcc4-0586ffc5c775.

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
  "phone": "+380736171196",
  "device_ref": "sandbox-23207"
}
```

```json
{
  "challenge_id": "4e29f696-090e-407f-9d42-dd1c1d77e0bd",
  "expires_at": "2026-10-29T14:33:31.271250997Z",
  "resend_available_at": "2026-10-29T14:28:32.271250997Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380736171196` → **200**

```json
{
  "phone": "+380736171196",
  "audience": "CLIENT",
  "code": "437088",
  "sent_at": "2026-10-29T14:28:31.274202419Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4e29f696-090e-407f-9d42-dd1c1d77e0bd",
  "code": "437088",
  "device_ref": "sandbox-23207"
}
```

```json
{
  "session_id": "d3510619-27ba-4ce2-8787-ad2b0fa5f33b",
  "subject": {
    "type": "CLIENT",
    "id": "59f41acd-7a21-43e5-8de6-6aeaecebc283"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWY0MWFjZC03YTIxLTQzZTUtOGRlNi02YWVhZWNlYmMyODMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDExLCJpYXQiOjE3OTMyODQxMTEsImp0aSI6ImY2OTAxODNiLWVhMTAtNGNhZi04ZmM3LTI1NGUxMjUwM2U1NyIsInNpZCI6ImQzNTEwNjE5LTI3YmEtNGNlMi04Nzg3LWFkMmIwZmE1ZjMzYiJ9.m5yI1LYRn0kQOGOmExC1UWhs4XU3VCz5qSK8e9wwGxQ",
  "access_expires_at": "2026-10-29T14:43:31.581978286Z",
  "refresh_token": "ZS4qNlmqah4lQ0ATaFgXpo2Dja_aQ5jmuMT0gOj9-2c",
  "refresh_expires_at": "2026-11-28T14:28:31.581273438Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "a09bb745-7185-4160-ac26-67f453ccf52b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "8edd4357-154d-43eb-8c34-c23f8e787f9e",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-8edd4357-154d-43eb-8c34-c23f8e787f9e",
    "orderDate": "1793284111",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "4f632f3e1fd83c6aaf4edd405754315d",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=8edd4357-154d-43eb-8c34-c23f8e787f9e",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736171196"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=8edd4357-154d-43eb-8c34-c23f8e787f9e",
  "created_at": "2026-10-29T14:28:31.873156Z",
  "expires_at": "2026-10-29T14:58:31.873156Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/8edd4357-154d-43eb-8c34-c23f8e787f9e` → **200**

```json
{
  "id": "8edd4357-154d-43eb-8c34-c23f8e787f9e",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T14:28:31.873156Z",
  "expires_at": "2026-10-29T14:58:31.873156Z",
  "completed_at": "2026-10-29T14:28:32.172113Z",
  "masked_pan": "41****6754",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "59f41acd-7a21-43e5-8de6-6aeaecebc283",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "59f41acd-7a21-43e5-8de6-6aeaecebc283",
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
      "id": "713f4d5b-8e29-493e-9628-b0fc1c1b8d54",
      "at": "2026-10-29T14:28:32.902735Z",
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
  "client_id": "59f41acd-7a21-43e5-8de6-6aeaecebc283",
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
      "id": "713f4d5b-8e29-493e-9628-b0fc1c1b8d54",
      "at": "2026-10-29T14:28:32.902735Z",
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
  "device_ref": "sandbox-21248"
}
```

```json
{
  "challenge_id": "c2bb359e-cd56-4162-b1d9-5fed896e5583",
  "expires_at": "2026-10-29T14:33:34.307568694Z",
  "resend_available_at": "2026-10-29T14:28:35.307568694Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "780922",
  "sent_at": "2026-10-29T14:28:34.310654918Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c2bb359e-cd56-4162-b1d9-5fed896e5583",
  "code": "780922",
  "device_ref": "sandbox-21248"
}
```

```json
{
  "session_id": "bf323d9a-5cb8-493d-ae45-66c90c42c9b3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTAxNCwiaWF0IjoxNzkzMjg0MTE0LCJqdGkiOiI3ZDgzYjYxNS01OGEyLTQ0MWItODU3Ny01YmFiMWQ5N2E1ODIiLCJzaWQiOiJiZjMyM2Q5YS01Y2I4LTQ5M2QtYWU0NS02NmM5MGM0MmM5YjMifQ.P1p5iKW0Dz0eaSqEFcWHl2KdAFD34bqAePA1lK3wTmw",
  "access_expires_at": "2026-10-29T14:43:34.608011996Z",
  "refresh_token": "xpbxmAGluSQ7lpzOCOLEW_yA1Fc28ygbV0GxtySUrC4",
  "refresh_expires_at": "2026-11-28T14:28:34.607413008Z",
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
  "command_id": "e45e67a6-df13-4eee-8a8a-ad4fbbfa2ad5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "f9cc3913-421b-483a-9c9a-183153dd307e",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-f9cc3913-421b-483a-9c9a-183153dd307e",
    "orderDate": "1793284115",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "98d13f1529021f0f3a0c98d7c00cd6d2",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=f9cc3913-421b-483a-9c9a-183153dd307e",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=f9cc3913-421b-483a-9c9a-183153dd307e",
  "created_at": "2026-10-29T14:28:35.147813Z",
  "expires_at": "2026-10-29T14:58:35.147813Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/f9cc3913-421b-483a-9c9a-183153dd307e` → **200**

```json
{
  "id": "f9cc3913-421b-483a-9c9a-183153dd307e",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T14:28:35.147813Z",
  "expires_at": "2026-10-29T14:58:35.147813Z",
  "completed_at": "2026-10-29T14:28:35.426553Z",
  "masked_pan": "41****3927",
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
      "id": "20c3d347-a9c6-42db-a6dc-db41cb65a5a4",
      "at": "2026-10-29T14:28:35.910467Z",
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
  "command_id": "b78f9a43-25df-4cdd-899e-45107cef2a47",
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
  "correlation_id": "45949993-78ae-4cc7-a4c1-a4cea0ed70ac"
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
  "device_ref": "sandbox-1791"
}
```

```json
{
  "challenge_id": "147da933-f931-491c-a7f0-5afce03b1ee5",
  "expires_at": "2026-10-29T14:33:37.598318817Z",
  "resend_available_at": "2026-10-29T14:28:38.598318817Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "737849",
  "sent_at": "2026-10-29T14:28:37.601197112Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "147da933-f931-491c-a7f0-5afce03b1ee5",
  "code": "737849",
  "device_ref": "sandbox-1791"
}
```

```json
{
  "session_id": "264d457f-a91c-4c9d-8ab1-db7ac91ac114",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTAxNywiaWF0IjoxNzkzMjg0MTE3LCJqdGkiOiI0NTdhNTM0MS1mOGU0LTRmYzItODIxYS1mNWZhMGE1NmE1NTciLCJzaWQiOiIyNjRkNDU3Zi1hOTFjLTRjOWQtOGFiMS1kYjdhYzkxYWMxMTQifQ.P0G4_KWIfR-A1YovwgRfEqupzEDahre3jaStaZ3LhZg",
  "access_expires_at": "2026-10-29T14:43:37.904750457Z",
  "refresh_token": "v4xfw-Tk8025fjvEr2X56wBViPnVFeRNY7yUiVIkhw8",
  "refresh_expires_at": "2026-11-28T14:28:37.904109969Z",
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
  "command_id": "9d984557-148d-4898-bc4a-eae1ce691ece",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:28:38Z",
    "sequence": 1793284118447
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a6ab537a-1059-48e5-9895-1cd1b6a70645",
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
  "last_heartbeat_at": "2026-10-29T14:28:38.466338Z",
  "last_location_at": "2026-10-29T14:28:38.466338Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631200785",
  "device_ref": "sandbox-122"
}
```

```json
{
  "challenge_id": "c966d1e7-09fa-4b9f-80dc-4e8bdd8f1b4c",
  "expires_at": "2026-10-29T14:33:38.752736813Z",
  "resend_available_at": "2026-10-29T14:28:39.752736813Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631200785` → **200**

```json
{
  "phone": "+380631200785",
  "audience": "CLIENT",
  "code": "314560",
  "sent_at": "2026-10-29T14:28:38.755585633Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c966d1e7-09fa-4b9f-80dc-4e8bdd8f1b4c",
  "code": "314560",
  "device_ref": "sandbox-122"
}
```

```json
{
  "session_id": "f26a0d93-2458-4e9e-83b1-a9e5b399932c",
  "subject": {
    "type": "CLIENT",
    "id": "9a3eaaf3-665d-4e43-8d88-2e83b97e0bc8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YTNlYWFmMy02NjVkLTRlNDMtOGQ4OC0yZTgzYjk3ZTBiYzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDE5LCJpYXQiOjE3OTMyODQxMTksImp0aSI6ImE0Y2Y0ZjllLTA4MTQtNDVjOC1iOGY5LTdkMTVhYjE5NmFiMCIsInNpZCI6ImYyNmEwZDkzLTI0NTgtNGU5ZS04M2IxLWE5ZTViMzk5OTMyYyJ9.ewSutlQOhr-ga-bxcRBWtWTsVTyivOP1bmkH9796_pQ",
  "access_expires_at": "2026-10-29T14:43:39.055892051Z",
  "refresh_token": "GjD1Jky5bUVa-wDwQ0-oNdBW6C2_vplVlPRI9_TeFbo",
  "refresh_expires_at": "2026-11-28T14:28:39.055279275Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "491fe969-cf47-4482-842f-0b391506365b",
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
  "id": "e00949f8-f4e9-47e5-ba79-61d9dc67487b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:33:39.343670Z",
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
  "command_id": "5d479283-55f0-4d93-9eb8-8e6581395740",
  "quote_id": "e00949f8-f4e9-47e5-ba79-61d9dc67487b",
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
  "id": "a354de7f-3bbc-476e-b16c-b08c244b6d74",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9a3eaaf3-665d-4e43-8d88-2e83b97e0bc8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:28:39.640809Z",
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
    "id": "48dd6b2a-2e48-4f49-b768-fd798b8a0481",
    "order_id": "a354de7f-3bbc-476e-b16c-b08c244b6d74",
    "expires_at": "2026-10-29T14:28:54.64401Z",
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

`POST /api/driver/v1/offers/48dd6b2a-2e48-4f49-b768-fd798b8a0481/accept` → **200**

```json
{
  "command_id": "1316342a-cc65-4459-a6b5-1d3290d8ecff"
}
```

```json
{
  "id": "4fbc14fb-0f86-463c-b706-254238f53516",
  "order_id": "a354de7f-3bbc-476e-b16c-b08c244b6d74",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2b3abc04-59c6-4856-8a75-6bf15b75edaa",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2b3abc04-59c6-4856-8a75-6bf15b75edaa",
  "order_id": "a354de7f-3bbc-476e-b16c-b08c244b6d74",
  "assignment_id": "4fbc14fb-0f86-463c-b706-254238f53516",
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

`POST /api/driver/v1/work-sessions/a6ab537a-1059-48e5-9895-1cd1b6a70645/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:28:40Z",
    "sequence": 1793284120768
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a6ab537a-1059-48e5-9895-1cd1b6a70645",
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
  "last_heartbeat_at": "2026-10-29T14:28:40.78703Z",
  "last_location_at": "2026-10-29T14:28:40.78703Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2b3abc04-59c6-4856-8a75-6bf15b75edaa/arrive` → **200**

```json
{
  "command_id": "c718d4b8-ea8e-4968-b913-72df4d60eed8",
  "expected_version": 0
}
```

```json
{
  "id": "2b3abc04-59c6-4856-8a75-6bf15b75edaa",
  "order_id": "a354de7f-3bbc-476e-b16c-b08c244b6d74",
  "assignment_id": "4fbc14fb-0f86-463c-b706-254238f53516",
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
  "arrived_at": "2026-10-29T14:28:41.077604Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2b3abc04-59c6-4856-8a75-6bf15b75edaa/start` → **200**

```json
{
  "command_id": "ab32be53-15a7-46df-8077-6cc6865e1ade",
  "expected_version": 1
}
```

```json
{
  "id": "2b3abc04-59c6-4856-8a75-6bf15b75edaa",
  "order_id": "a354de7f-3bbc-476e-b16c-b08c244b6d74",
  "assignment_id": "4fbc14fb-0f86-463c-b706-254238f53516",
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
  "arrived_at": "2026-10-29T14:28:41.077604Z",
  "started_at": "2026-10-29T14:28:41.367319Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2b3abc04-59c6-4856-8a75-6bf15b75edaa/complete` → **200**

```json
{
  "command_id": "2d0d6a43-4db3-4b05-9bf5-43e801d0d152",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:28:41Z",
  "cash_received": false
}
```

```json
{
  "id": "2b3abc04-59c6-4856-8a75-6bf15b75edaa",
  "order_id": "a354de7f-3bbc-476e-b16c-b08c244b6d74",
  "assignment_id": "4fbc14fb-0f86-463c-b706-254238f53516",
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
  "arrived_at": "2026-10-29T14:28:41.077604Z",
  "started_at": "2026-10-29T14:28:41.367319Z",
  "completed_at": "2026-10-29T14:28:41.668535Z",
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
  "session_id": "a7f3aede-f5aa-41ff-9ba3-57eefef1798a",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwMjIsImlhdCI6MTc5MzI4NDEyMiwianRpIjoiZWY2NWM0NDQtOWE2OC00OTA1LTk4OGUtOTUyZDlmZjdjYTdjIiwic2lkIjoiYTdmM2FlZGUtZjVhYS00MWZmLTliYTMtNTdlZWZlZjE3OThhIn0.EuTLZlAV5dK1APjQE3JNr2BxaAUaq3VO5o23RXQSHuM",
  "access_expires_at": "2026-10-29T14:43:42.25025754Z",
  "refresh_token": "VF-V20pQ9nYfli5SesqqqthkfGQuz7B2xxVzlEUfTMw",
  "refresh_expires_at": "2026-10-30T02:28:42.249693229Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/a354de7f-3bbc-476e-b16c-b08c244b6d74/cash-dispute` → **200**

```json
{
  "order_id": "a354de7f-3bbc-476e-b16c-b08c244b6d74",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "9a3eaaf3-665d-4e43-8d88-2e83b97e0bc8",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T14:28:41.961083Z",
  "decide_by": "2026-11-12T14:28:41.961083Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T14:28:41.961083Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "a354de7f-3bbc-476e-b16c-b08c244b6d74",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "9a3eaaf3-665d-4e43-8d88-2e83b97e0bc8",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T14:28:41.961083Z",
      "decide_by": "2026-11-12T14:28:41.961083Z",
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

`POST /api/admin/v1/orders/a354de7f-3bbc-476e-b16c-b08c244b6d74/cash-dispute/decide` → **400**

```json
{
  "command_id": "b6f86be1-48c6-4ea9-a07f-f9f802464c42",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/a354de7f-3bbc-476e-b16c-b08c244b6d74/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "780a2d24-fd64-4e40-943d-bfe31b09708d",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/a354de7f-3bbc-476e-b16c-b08c244b6d74/cash-dispute/decide` → **200**

```json
{
  "command_id": "1ac30d6e-af93-48a0-9685-7df412bec7d8",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "a354de7f-3bbc-476e-b16c-b08c244b6d74",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "9a3eaaf3-665d-4e43-8d88-2e83b97e0bc8",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T14:28:41.961083Z",
  "decide_by": "2026-11-12T14:28:41.961083Z",
  "decision": "PAY_DRIVER",
  "decided_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T14:28:43.429558Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/a354de7f-3bbc-476e-b16c-b08c244b6d74/cash-dispute/decide` → **409**

```json
{
  "command_id": "9ea990ef-84cb-4f8f-8791-e0f8eb52c2ad",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/a354de7f-3bbc-476e-b16c-b08c244b6d74/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "34361223-4492-40e3-896a-bc0ddeccead4"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a6ab537a-1059-48e5-9895-1cd1b6a70645",
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
  "last_heartbeat_at": "2026-10-29T14:28:40.78703Z",
  "last_location_at": "2026-10-29T14:28:40.78703Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a6ab537a-1059-48e5-9895-1cd1b6a70645/close` → **200**

```json
{
  "command_id": "350f4903-a4d4-4f3e-86cf-69b8fe95fe40",
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
  "phone": "+380734615072",
  "device_ref": "sandbox-9286"
}
```

```json
{
  "challenge_id": "be91c5d0-f6d3-4ce7-a5ca-6161fca2edd6",
  "expires_at": "2026-10-29T14:33:44.565768079Z",
  "resend_available_at": "2026-10-29T14:28:45.565768079Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734615072` → **200**

```json
{
  "phone": "+380734615072",
  "audience": "CLIENT",
  "code": "217310",
  "sent_at": "2026-10-29T14:28:44.568952858Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "be91c5d0-f6d3-4ce7-a5ca-6161fca2edd6",
  "code": "217310",
  "device_ref": "sandbox-9286"
}
```

```json
{
  "session_id": "78f1f0b5-88f2-4d9d-b042-93d2c87542d1",
  "subject": {
    "type": "CLIENT",
    "id": "50fddc83-d4a2-4884-b8c6-8d16cac2d50c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGZkZGM4My1kNGEyLTQ4ODQtYjhjNi04ZDE2Y2FjMmQ1MGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDI0LCJpYXQiOjE3OTMyODQxMjQsImp0aSI6IjNjZjYxNzQwLWZmNTktNDBhZi1hNTIwLWM2ZGFjZDk2MDMyMSIsInNpZCI6Ijc4ZjFmMGI1LTg4ZjItNGQ5ZC1iMDQyLTkzZDJjODc1NDJkMSJ9.0t2K2QiN4a2xk2HvekUNH0a12XE7ELbpF6oOv0VB_4I",
  "access_expires_at": "2026-10-29T14:43:44.887022561Z",
  "refresh_token": "IDdB0akEG0ejgUEPPx25UchWWaCORPQrm8gHBoceyKg",
  "refresh_expires_at": "2026-11-28T14:28:44.886447175Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "aa99d0f0-e1b9-4b81-8469-9a184d9da1e5",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "4d2af12f-fc1c-4ff5-ad1a-59e6c334f5e1",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-4d2af12f-fc1c-4ff5-ad1a-59e6c334f5e1",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "084e979fad0ba7476460e0f8dc475f82",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=4d2af12f-fc1c-4ff5-ad1a-59e6c334f5e1",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734615072"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=4d2af12f-fc1c-4ff5-ad1a-59e6c334f5e1",
  "expires_at": "2026-10-29T14:58:45.182543Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/4d2af12f-fc1c-4ff5-ad1a-59e6c334f5e1` → **200**

```json
{
  "id": "4d2af12f-fc1c-4ff5-ad1a-59e6c334f5e1",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T14:58:45.182543Z",
  "card": {
    "id": "660f6167-1479-4460-9370-6879465fd303",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6107",
    "card_type": "Visa",
    "created_at": "2026-10-29T14:28:45.470957Z"
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
  "device_ref": "sandbox-29413"
}
```

```json
{
  "challenge_id": "fb8c1e99-f8af-4da2-9149-22f5a525ec5c",
  "expires_at": "2026-10-29T14:33:45.769506682Z",
  "resend_available_at": "2026-10-29T14:28:46.769506682Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "116214",
  "sent_at": "2026-10-29T14:28:45.77265038Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fb8c1e99-f8af-4da2-9149-22f5a525ec5c",
  "code": "116214",
  "device_ref": "sandbox-29413"
}
```

```json
{
  "session_id": "66a5b1b3-93c7-411f-98da-3fed63ba9353",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTAyNiwiaWF0IjoxNzkzMjg0MTI2LCJqdGkiOiI0YzVhMWEyZS03Y2ViLTRhNDItOTJjNC03N2E3NzIxYjcxOTQiLCJzaWQiOiI2NmE1YjFiMy05M2M3LTQxMWYtOThkYS0zZmVkNjNiYTkzNTMifQ.51UcETNs9nQcn6yv1OQtG03H32lu_o8UjOe9I_eOrEY",
  "access_expires_at": "2026-10-29T14:43:46.079164444Z",
  "refresh_token": "euTKhDBvAH3MP8QQmAfmtGhJpi7sotFrMbb94TDrtIY",
  "refresh_expires_at": "2026-11-28T14:28:46.078519697Z",
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
  "command_id": "056f1e0f-33d0-4b13-8857-690f059cc4cc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:28:46Z",
    "sequence": 1793284126641
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "be902fa3-b755-4533-a60a-c758e1f6a22e",
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
  "last_heartbeat_at": "2026-10-29T14:28:46.661116Z",
  "last_location_at": "2026-10-29T14:28:46.661116Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c51d0484-496d-405f-b711-7cbaaf27aa0f",
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
  "id": "224a2316-f693-46e2-bae4-e5c80fefbff9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:33:46.952836Z",
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
  "command_id": "abd32e97-87df-4259-93ca-591ddb8fe78b",
  "quote_id": "224a2316-f693-46e2-bae4-e5c80fefbff9",
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
  "id": "f4670498-bb4a-440a-807f-d5626a1c5f35",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "50fddc83-d4a2-4884-b8c6-8d16cac2d50c",
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
  "created_at": "2026-10-29T14:28:47.253809Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4670498-bb4a-440a-807f-d5626a1c5f35` → **200**

```json
{
  "id": "f4670498-bb4a-440a-807f-d5626a1c5f35",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "50fddc83-d4a2-4884-b8c6-8d16cac2d50c",
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
  "created_at": "2026-10-29T14:28:47.253809Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4670498-bb4a-440a-807f-d5626a1c5f35` → **200**

```json
{
  "id": "f4670498-bb4a-440a-807f-d5626a1c5f35",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "50fddc83-d4a2-4884-b8c6-8d16cac2d50c",
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
  "created_at": "2026-10-29T14:28:47.253809Z",
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
    "id": "12947c47-f861-43f3-8c13-3374be08c642",
    "order_id": "f4670498-bb4a-440a-807f-d5626a1c5f35",
    "expires_at": "2026-10-29T14:29:02.99669Z",
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

`POST /api/driver/v1/offers/12947c47-f861-43f3-8c13-3374be08c642/accept` → **200**

```json
{
  "command_id": "492f84be-222a-47db-bd97-d250d155038f"
}
```

```json
{
  "id": "0f701928-3502-43e3-b7c2-0d032db4a4dd",
  "order_id": "f4670498-bb4a-440a-807f-d5626a1c5f35",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d5379269-ef49-44d6-a663-da9033811f98",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d5379269-ef49-44d6-a663-da9033811f98",
  "order_id": "f4670498-bb4a-440a-807f-d5626a1c5f35",
  "assignment_id": "0f701928-3502-43e3-b7c2-0d032db4a4dd",
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

`POST /api/rider/v1/orders/f4670498-bb4a-440a-807f-d5626a1c5f35/messages` → **201**

```json
{
  "command_id": "d8531592-91e1-4d86-9754-dd3aa028afc8",
  "body": "Я біля входу, мій номер +380734615072, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "7357e8b2-23fb-4e56-9657-d9163001cbc5",
  "order_id": "f4670498-bb4a-440a-807f-d5626a1c5f35",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380734615072, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-29T14:28:49.991367171Z"
}
```

`POST /api/driver/v1/trips/d5379269-ef49-44d6-a663-da9033811f98/messages` → **201**

```json
{
  "command_id": "bafadd5c-f2b2-4251-a018-950a8d85383b",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "27189b9c-8064-45f3-8bf2-2c1bf887ff01",
  "order_id": "f4670498-bb4a-440a-807f-d5626a1c5f35",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-29T14:28:50.290121731Z"
}
```

`POST /api/driver/v1/work-sessions/be902fa3-b755-4533-a60a-c758e1f6a22e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:28:50Z",
    "sequence": 1793284130562
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "be902fa3-b755-4533-a60a-c758e1f6a22e",
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
  "last_heartbeat_at": "2026-10-29T14:28:50.581247Z",
  "last_location_at": "2026-10-29T14:28:50.581247Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d5379269-ef49-44d6-a663-da9033811f98/arrive` → **200**

```json
{
  "command_id": "8638a5c4-d3dc-4b26-a3f2-9011cbe73d4f",
  "expected_version": 0
}
```

```json
{
  "id": "d5379269-ef49-44d6-a663-da9033811f98",
  "order_id": "f4670498-bb4a-440a-807f-d5626a1c5f35",
  "assignment_id": "0f701928-3502-43e3-b7c2-0d032db4a4dd",
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
  "arrived_at": "2026-10-29T14:28:50.862937Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d5379269-ef49-44d6-a663-da9033811f98/start` → **200**

```json
{
  "command_id": "352f4b58-c325-4d2a-a01e-b7d34c10b293",
  "expected_version": 1
}
```

```json
{
  "id": "d5379269-ef49-44d6-a663-da9033811f98",
  "order_id": "f4670498-bb4a-440a-807f-d5626a1c5f35",
  "assignment_id": "0f701928-3502-43e3-b7c2-0d032db4a4dd",
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
  "arrived_at": "2026-10-29T14:28:50.862937Z",
  "started_at": "2026-10-29T14:28:51.157549Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/be902fa3-b755-4533-a60a-c758e1f6a22e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:28:51Z",
    "sequence": 1793284131435
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "be902fa3-b755-4533-a60a-c758e1f6a22e",
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
  "last_heartbeat_at": "2026-10-29T14:28:51.454577Z",
  "last_location_at": "2026-10-29T14:28:51.454577Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/d5379269-ef49-44d6-a663-da9033811f98/complete` → **200**

```json
{
  "command_id": "dced0e89-75a4-4570-96f2-1f19efabd203",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:28:51Z",
  "cash_received": false
}
```

```json
{
  "id": "d5379269-ef49-44d6-a663-da9033811f98",
  "order_id": "f4670498-bb4a-440a-807f-d5626a1c5f35",
  "assignment_id": "0f701928-3502-43e3-b7c2-0d032db4a4dd",
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
  "arrived_at": "2026-10-29T14:28:50.862937Z",
  "started_at": "2026-10-29T14:28:51.157549Z",
  "completed_at": "2026-10-29T14:28:51.739726Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/f4670498-bb4a-440a-807f-d5626a1c5f35` → **200**

```json
{
  "id": "f4670498-bb4a-440a-807f-d5626a1c5f35",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "50fddc83-d4a2-4884-b8c6-8d16cac2d50c",
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
    "id": "0f701928-3502-43e3-b7c2-0d032db4a4dd",
    "order_id": "f4670498-bb4a-440a-807f-d5626a1c5f35",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d5379269-ef49-44d6-a663-da9033811f98",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:28:47.253809Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4670498-bb4a-440a-807f-d5626a1c5f35` → **200**

```json
{
  "id": "f4670498-bb4a-440a-807f-d5626a1c5f35",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "50fddc83-d4a2-4884-b8c6-8d16cac2d50c",
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
    "id": "0f701928-3502-43e3-b7c2-0d032db4a4dd",
    "order_id": "f4670498-bb4a-440a-807f-d5626a1c5f35",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d5379269-ef49-44d6-a663-da9033811f98",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:28:47.253809Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4670498-bb4a-440a-807f-d5626a1c5f35` → **200**

```json
{
  "id": "f4670498-bb4a-440a-807f-d5626a1c5f35",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "50fddc83-d4a2-4884-b8c6-8d16cac2d50c",
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
    "id": "0f701928-3502-43e3-b7c2-0d032db4a4dd",
    "order_id": "f4670498-bb4a-440a-807f-d5626a1c5f35",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d5379269-ef49-44d6-a663-da9033811f98",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:28:47.253809Z",
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
  "session_id": "be902fa3-b755-4533-a60a-c758e1f6a22e",
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
  "last_heartbeat_at": "2026-10-29T14:28:51.454577Z",
  "last_location_at": "2026-10-29T14:28:51.454577Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/be902fa3-b755-4533-a60a-c758e1f6a22e/close` → **200**

```json
{
  "command_id": "30f6e382-292e-466a-9630-15dbb12de35c",
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
  "session_id": "4c27dffa-3aa9-46fc-abac-60659b72764f",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwMzUsImlhdCI6MTc5MzI4NDEzNSwianRpIjoiYjk5NjEwOTItNmI2Ni00YTdmLTlkM2EtZTBmZjAyM2FmNTMxIiwic2lkIjoiNGMyN2RmZmEtM2FhOS00NmZjLWFiYWMtNjA2NTliNzI3NjRmIn0.AY-V2eIOD8qK3mJtc7wtNvPQ6IqOpBONE7ZowL4EhE8",
  "access_expires_at": "2026-10-29T14:43:55.785295541Z",
  "refresh_token": "c32gTA2YXEtk0y8ES-7VWI48-5Uimk3kHnI9hjqfh-0",
  "refresh_expires_at": "2026-10-30T02:28:55.784768365Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/f4670498-bb4a-440a-807f-d5626a1c5f35/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/f4670498-bb4a-440a-807f-d5626a1c5f35/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "b0d8ebc2-71ce-4525-9a1a-a578e0f526b0"
}
```

`GET /api/admin/v1/orders/f4670498-bb4a-440a-807f-d5626a1c5f35/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-29T14:28:56.340852049Z",
  "order": {
    "id": "f4670498-bb4a-440a-807f-d5626a1c5f35",
    "short_number": 9,
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
    "created_at": "2026-10-29T14:28:47.253809Z",
    "assigned_at": "2026-10-29T14:28:49.426488Z",
    "arrived_at": "2026-10-29T14:28:50.862937Z",
    "started_at": "2026-10-29T14:28:51.157549Z",
    "completed_at": "2026-10-29T14:28:51.739726Z"
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
    "id": "50fddc83-d4a2-4884-b8c6-8d16cac2d50c",
    "registered_at": "2026-10-29T14:28:44.884597Z",
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
      "created_at": "2026-10-29T14:28:47.25669Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-29T14:28:52.057197Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/f4670498-bb4a-440a-807f-d5626a1c5f35/chargebacks` → **422**

```json
{
  "command_id": "51a142a0-9aad-44a2-8d5d-940aa21e999b",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "instance": "/api/admin/v1/orders/f4670498-bb4a-440a-807f-d5626a1c5f35/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "449f6694-9396-4d88-bbea-e8140bbf75d5"
}
```

`POST /api/admin/v1/orders/f4670498-bb4a-440a-807f-d5626a1c5f35/chargebacks` → **201**

```json
{
  "command_id": "625a1bdb-44d7-47e6-8cfa-8ee8bab12d29",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "eded0d02-f4a8-4519-b736-b7eae93ccd54",
  "order_id": "f4670498-bb4a-440a-807f-d5626a1c5f35",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T14:28:56.986906Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/f4670498-bb4a-440a-807f-d5626a1c5f35/chargebacks` → **201**

```json
{
  "command_id": "625a1bdb-44d7-47e6-8cfa-8ee8bab12d29",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "eded0d02-f4a8-4519-b736-b7eae93ccd54",
  "order_id": "f4670498-bb4a-440a-807f-d5626a1c5f35",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T14:28:56.986906Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/50fddc83-d4a2-4884-b8c6-8d16cac2d50c` → **200**

```json
{
  "client": {
    "id": "50fddc83-d4a2-4884-b8c6-8d16cac2d50c",
    "phone": "+380734615072",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:28:44.884597Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "f4670498-bb4a-440a-807f-d5626a1c5f35",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T14:28:47.253809Z",
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

`POST /api/admin/v1/orders/f4670498-bb4a-440a-807f-d5626a1c5f35/chargebacks/eded0d02-f4a8-4519-b736-b7eae93ccd54/resolve` → **200**

```json
{
  "command_id": "6449507c-e1a2-4f5a-829f-e0f2cbd7bfba",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "eded0d02-f4a8-4519-b736-b7eae93ccd54",
  "order_id": "f4670498-bb4a-440a-807f-d5626a1c5f35",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-29T14:28:56.986906Z",
  "resolved_at": "2026-10-29T14:28:57.910531Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/50fddc83-d4a2-4884-b8c6-8d16cac2d50c` → **200**

```json
{
  "client": {
    "id": "50fddc83-d4a2-4884-b8c6-8d16cac2d50c",
    "phone": "+380734615072",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:28:44.884597Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "f4670498-bb4a-440a-807f-d5626a1c5f35",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T14:28:47.253809Z",
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

`POST /api/admin/v1/orders/f4670498-bb4a-440a-807f-d5626a1c5f35/chargebacks/eded0d02-f4a8-4519-b736-b7eae93ccd54/resolve` → **409**

```json
{
  "command_id": "aca96a37-9fbd-488c-8b49-ce01d856a2a6",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/f4670498-bb4a-440a-807f-d5626a1c5f35/chargebacks/eded0d02-f4a8-4519-b736-b7eae93ccd54/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a20d5358-2861-42d0-af75-9dcc32f4ac69"
}
```

`GET /api/admin/v1/orders/f4670498-bb4a-440a-807f-d5626a1c5f35/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "eded0d02-f4a8-4519-b736-b7eae93ccd54",
      "order_id": "f4670498-bb4a-440a-807f-d5626a1c5f35",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-28",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-29T14:28:56.986906Z",
      "resolved_at": "2026-10-29T14:28:57.910531Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order f4670498-bb4a-440a-807f-d5626a1c5f35 without phone or card digits; chargeback eded0d02-f4a8-4519-b736-b7eae93ccd54 recorded and won.

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
  "session_id": "a0ee7282-f469-42dd-8293-0014fb99a7c5",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwMzksImlhdCI6MTc5MzI4NDEzOSwianRpIjoiMGJkN2Q0MDAtYzkxMi00OTFlLTg4YmMtZTk3YWMzMmJhNDUxIiwic2lkIjoiYTBlZTcyODItZjQ2OS00MmRkLTgyOTMtMDAxNGZiOTlhN2M1In0.C7NScYAX-pPK5BB765o5t_nGA9Xk6aIp_PLmA4qL-s0",
  "access_expires_at": "2026-10-29T14:43:59.658143908Z",
  "refresh_token": "T9rNJn770N6yLe6aMr09NzuDjfs0ykzqFxVrjX6FQsc",
  "refresh_expires_at": "2026-10-30T02:28:59.657590753Z",
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
  "phone": "+48600298411",
  "device_ref": "sandbox-1833"
}
```

```json
{
  "challenge_id": "f1130289-ecd0-4a74-8aa3-6c57ef804916",
  "expires_at": "2026-10-29T14:34:00.501213711Z",
  "resend_available_at": "2026-10-29T14:29:01.501213711Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600298411` → **200**

```json
{
  "phone": "+48600298411",
  "audience": "CLIENT",
  "code": "265375",
  "sent_at": "2026-10-29T14:29:00.50399399Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f1130289-ecd0-4a74-8aa3-6c57ef804916",
  "code": "265375",
  "device_ref": "sandbox-1833"
}
```

```json
{
  "session_id": "73262bd4-5074-4981-919f-71e5b34ecebb",
  "subject": {
    "type": "CLIENT",
    "id": "6ef555fb-c32c-420f-9d11-71aefb474780"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWY1NTVmYi1jMzJjLTQyMGYtOWQxMS03MWFlZmI0NzQ3ODAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDQwLCJpYXQiOjE3OTMyODQxNDAsImp0aSI6IjhkNzExYTQ0LWM1YWQtNGFjZC1iMzExLTY5ZGEzODRmZTlkZSIsInNpZCI6IjczMjYyYmQ0LTUwNzQtNDk4MS05MTlmLTcxZTViMzRlY2ViYiJ9.aR87_eDZxyQXpiaRk2ScfOPwm8rsP64aKPgGTqTfj_M",
  "access_expires_at": "2026-10-29T14:44:00.810393717Z",
  "refresh_token": "O8z0Z1BkZK7WefWCLmmNfZYvymOUboB1LlABJAz5ugo",
  "refresh_expires_at": "2026-11-28T14:29:00.809753927Z",
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
  "command_id": "1d0a5e5a-3e4c-4aa7-b700-84d5f873091d",
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
  "correlation_id": "2720e1a5-e8cd-494b-91f3-607f30f69afb",
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
  "command_id": "70b1c593-a2e2-42b9-a767-f088ff4c1a03",
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
  "paused_at": "2026-10-29T14:29:01.951746918Z",
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
  "command_id": "24efa7d5-0085-4295-90d7-d3139d64314b",
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
  "id": "ac6526b4-fc9c-417f-9c6e-45e3da221887",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:34:02.551331Z",
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
  "command_id": "085ca00c-849e-443b-b29c-1f11945ea85d",
  "quote_id": "ac6526b4-fc9c-417f-9c6e-45e3da221887",
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
  "correlation_id": "f466455a-7beb-4526-ad1a-d2db2b2ad2ce"
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
  "paused_at": "2026-10-29T14:29:01.951747Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "45ee1b30-ac57-4f38-98fa-cb8ac4f6c103",
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
  "command_id": "c166490a-4ebb-4201-8a0a-b1d09a086503",
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
  "command_id": "dd0edd39-6747-4fa5-8715-1ae2c1813a5f",
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
  "id": "db471626-5d0c-4e1d-b3ba-d4c6dba23192",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:34:04.299560Z",
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
  "command_id": "eb669afe-dead-4f49-96f6-24825c29fce6",
  "quote_id": "db471626-5d0c-4e1d-b3ba-d4c6dba23192",
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
  "correlation_id": "3e2f3743-bcb9-465f-9185-38e0aa979de0"
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
  "command_id": "3a1d21b3-5794-473b-bacb-3e1759d4aaff",
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
  "command_id": "ed74cd8e-478b-40e2-a2e8-ea3838f909cc",
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
  "id": "7a32d0d2-54bd-4dcb-8c47-69974aa19040",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:34:05.443258Z",
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
  "command_id": "1e58a92f-c485-445b-9349-c57717cf4399",
  "quote_id": "7a32d0d2-54bd-4dcb-8c47-69974aa19040",
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
  "correlation_id": "641dee22-4c2f-4803-bd01-e3bbf868ddeb"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "0d0bae1e-1449-43ff-8b24-38a02c1f9cf3",
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
  "correlation_id": "2fb9c891-d595-44df-8cb6-85437855a735"
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
  "command_id": "73e9d087-88e6-4e85-8ddf-6fed5169fb14",
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
  "phone": "+380672304243",
  "device_ref": "sandbox-13431"
}
```

```json
{
  "challenge_id": "53880f9a-0f01-43c0-aa9d-ae425b2b485a",
  "expires_at": "2026-10-29T14:34:06.888533189Z",
  "resend_available_at": "2026-10-29T14:29:07.888533189Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672304243` → **200**

```json
{
  "phone": "+380672304243",
  "audience": "CLIENT",
  "code": "695598",
  "sent_at": "2026-10-29T14:29:06.891132843Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "53880f9a-0f01-43c0-aa9d-ae425b2b485a",
  "code": "695598",
  "device_ref": "sandbox-13431"
}
```

```json
{
  "session_id": "e5e2f520-562a-48c3-98b2-3c583a4ec44b",
  "subject": {
    "type": "CLIENT",
    "id": "de1702db-2740-4f25-a330-24d060823ad2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZTE3MDJkYi0yNzQwLTRmMjUtYTMzMC0yNGQwNjA4MjNhZDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDQ3LCJpYXQiOjE3OTMyODQxNDcsImp0aSI6Ijg2Y2RhMDQxLWQ3NTktNDM0NC1hZjMzLWUyM2EyYjZhYjJkOSIsInNpZCI6ImU1ZTJmNTIwLTU2MmEtNDhjMy05OGIyLTNjNTgzYTRlYzQ0YiJ9.5ieVlxU9JkuFdcUdKK0zoI4jnStqsjSIRbFkX1ivpuU",
  "access_expires_at": "2026-10-29T14:44:07.200380092Z",
  "refresh_token": "SbHXKZwOnFPN9bYjppnCRzl64k2jOP1awkuYfKQFl0U",
  "refresh_expires_at": "2026-11-28T14:29:07.199847957Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "de1702db-2740-4f25-a330-24d060823ad2",
  "session_id": "e5e2f520-562a-48c3-98b2-3c583a4ec44b",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "de47f301-910e-48cb-99ec-e2f93afbb711",
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
  "id": "12579632-fd01-41bd-910c-6675e6b5cae1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:34:07.771835Z",
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
  "challenge_id": "bcc06fdc-f9b3-4540-a6b3-4a9247c8a192",
  "expires_at": "2026-10-29T14:34:10.066323554Z",
  "resend_available_at": "2026-10-29T14:29:11.066323554Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672304243` → **200**

```json
{
  "phone": "+380672304243",
  "audience": "CLIENT",
  "code": "582250",
  "sent_at": "2026-10-29T14:29:10.068843759Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "6cd24906-c401-4abe-88c2-8a434d9378e7",
  "challenge_id": "bcc06fdc-f9b3-4540-a6b3-4a9247c8a192",
  "otp_code": "582250"
}
```

```json
{
  "client_id": "de1702db-2740-4f25-a330-24d060823ad2",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T14:29:10.384104966Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "c0057b3b-5c82-4450-91c9-43b1cff01a94",
  "quote_id": "12579632-fd01-41bd-910c-6675e6b5cae1",
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
  "correlation_id": "7c47332b-c55c-4619-bb1f-2dfed84f7f1c"
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
  "session_id": "0a6b2a0d-c1cc-477c-8987-c07ebf918379",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwNTEsImlhdCI6MTc5MzI4NDE1MSwianRpIjoiOTNiOTFkOGItNzRiYy00N2FlLTljOGYtOTlhMDI2MjBkZTZjIiwic2lkIjoiMGE2YjJhMGQtYzFjYy00NzdjLTg5ODctYzA3ZWJmOTE4Mzc5In0.3ARi6X2XG1iQDQar2_M0M-cP7dNTEWqeQSDFmjrtTl4",
  "access_expires_at": "2026-10-29T14:44:11.245229811Z",
  "refresh_token": "qQ6e4HnzTllSIcutQV3qQ2963ndrWXAc_yenVUFZUGw",
  "refresh_expires_at": "2026-10-30T02:29:11.244642502Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "de1702db-2740-4f25-a330-24d060823ad2",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T14:29:10.384105Z",
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

`POST /api/admin/v1/client-deletions/de1702db-2740-4f25-a330-24d060823ad2/complete` → **200**

```json
{
  "command_id": "21915ddf-6251-485b-abe8-e760f295046d",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "de1702db-2740-4f25-a330-24d060823ad2",
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
  "correlation_id": "45fb3a3d-e24a-4f49-aee4-576c2de3d09d"
}
```

Done: client de1702db-2740-4f25-a330-24d060823ad2 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660578515",
  "device_ref": "sandbox-7765"
}
```

```json
{
  "challenge_id": "3c000d18-4191-46ab-91e3-ba74d20c2080",
  "expires_at": "2026-10-29T14:34:12.407895321Z",
  "resend_available_at": "2026-10-29T14:29:13.407895321Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660578515` → **200**

```json
{
  "phone": "+380660578515",
  "audience": "CLIENT",
  "code": "998360",
  "sent_at": "2026-10-29T14:29:12.410761082Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c000d18-4191-46ab-91e3-ba74d20c2080",
  "code": "998360",
  "device_ref": "sandbox-7765"
}
```

```json
{
  "session_id": "3f01820e-fbaa-4e8c-9713-f54e7767663b",
  "subject": {
    "type": "CLIENT",
    "id": "96254296-7dde-4b74-9564-98cd619b8d61"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NjI1NDI5Ni03ZGRlLTRiNzQtOTU2NC05OGNkNjE5YjhkNjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDUyLCJpYXQiOjE3OTMyODQxNTIsImp0aSI6IjUxYmY4NjRmLWYzOTUtNGI3ZS1hMWFmLWM0MGNiYjNmNjBhZSIsInNpZCI6IjNmMDE4MjBlLWZiYWEtNGU4Yy05NzEzLWY1NGU3NzY3NjYzYiJ9.IMHBFTv114in5UJXmawfIsnH4J0QepMGdGihmo6VaE0",
  "access_expires_at": "2026-10-29T14:44:12.709721488Z",
  "refresh_token": "pT2ihErCCyYvQxKWe1Nz4t26qd6l4gFlf8I3-iOCvrE",
  "refresh_expires_at": "2026-11-28T14:29:12.709116922Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "96254296-7dde-4b74-9564-98cd619b8d61",
  "session_id": "3f01820e-fbaa-4e8c-9713-f54e7767663b",
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
  "session_id": "27c5c8ac-e696-4a82-bd2e-e3f04b2603ad",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwNTMsImlhdCI6MTc5MzI4NDE1MywianRpIjoiYjFlNDcxYzYtODg5Ny00MTNmLTkyMmQtNWI0YWYwNjVkZGZkIiwic2lkIjoiMjdjNWM4YWMtZTY5Ni00YTgyLWJkMmUtZTNmMDRiMjYwM2FkIn0.Gmzw6xHbc0DCm72imx7Q_FAYswADwqExGO5Ng8lIfYc",
  "access_expires_at": "2026-10-29T14:44:13.577069579Z",
  "refresh_token": "wuu4DjBMeNQyXJ9erpI47YyY6-VhRw-BWFAA3yV4Ws4",
  "refresh_expires_at": "2026-10-30T02:29:13.576523738Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=0578515&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "96254296-7dde-4b74-9564-98cd619b8d61",
      "phone": "+380660578515",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T14:29:12.707239Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/96254296-7dde-4b74-9564-98cd619b8d61` → **200**

```json
{
  "client": {
    "id": "96254296-7dde-4b74-9564-98cd619b8d61",
    "phone": "+380660578515",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:29:12.707239Z",
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

`POST /api/admin/v1/clients/96254296-7dde-4b74-9564-98cd619b8d61/block` → **400**

```json
{
  "command_id": "fd535fbd-3c6b-455e-948f-506268bfc82d",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/96254296-7dde-4b74-9564-98cd619b8d61/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "ab578d0c-af5a-4609-8528-73c446a6dbe9",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/96254296-7dde-4b74-9564-98cd619b8d61/block` → **200**

```json
{
  "command_id": "5eadfa58-a778-466b-96e4-fe4a0ccdcc7b",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "96254296-7dde-4b74-9564-98cd619b8d61",
  "phone": "+380660578515",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T14:29:12.707239Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T14:29:14.756113Z",
    "by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
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
  "correlation_id": "07c4512c-e2a8-4c09-856f-6ee706a47d38"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660578515",
  "device_ref": "sandbox-6731"
}
```

```json
{
  "challenge_id": "71fc4112-52d1-46a5-aeac-19d62ecc8660",
  "expires_at": "2026-10-29T14:34:17.327600474Z",
  "resend_available_at": "2026-10-29T14:29:18.327600474Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660578515` → **200**

```json
{
  "phone": "+380660578515",
  "audience": "CLIENT",
  "code": "925046",
  "sent_at": "2026-10-29T14:29:17.330182261Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "71fc4112-52d1-46a5-aeac-19d62ecc8660",
  "code": "925046",
  "device_ref": "sandbox-6731"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "e472668c-9e42-4e45-bf4a-87e5fd564cb1"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/96254296-7dde-4b74-9564-98cd619b8d61` → **200**

```json
{
  "client": {
    "id": "96254296-7dde-4b74-9564-98cd619b8d61",
    "phone": "+380660578515",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T14:29:12.707239Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T14:29:14.756113Z",
      "by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
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

`POST /api/admin/v1/clients/96254296-7dde-4b74-9564-98cd619b8d61/unblock` → **200**

```json
{
  "command_id": "77c6120a-0ddf-42ac-a851-b35dd7bc9583",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "96254296-7dde-4b74-9564-98cd619b8d61",
  "phone": "+380660578515",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T14:29:12.707239Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660578515",
  "device_ref": "sandbox-1412"
}
```

```json
{
  "challenge_id": "29256aa6-405d-4ec1-a8c9-aa93ac09998d",
  "expires_at": "2026-10-29T14:34:20.540852797Z",
  "resend_available_at": "2026-10-29T14:29:21.540852797Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660578515` → **200**

```json
{
  "phone": "+380660578515",
  "audience": "CLIENT",
  "code": "425265",
  "sent_at": "2026-10-29T14:29:20.543584055Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "29256aa6-405d-4ec1-a8c9-aa93ac09998d",
  "code": "425265",
  "device_ref": "sandbox-1412"
}
```

```json
{
  "session_id": "fe993a59-ecf5-4538-88e9-a809e2776586",
  "subject": {
    "type": "CLIENT",
    "id": "96254296-7dde-4b74-9564-98cd619b8d61"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NjI1NDI5Ni03ZGRlLTRiNzQtOTU2NC05OGNkNjE5YjhkNjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDYwLCJpYXQiOjE3OTMyODQxNjAsImp0aSI6ImM3NmE2MTA1LTE2ZmMtNDE0OC1iMTFlLWE4MjM4NjI0ZGI0NyIsInNpZCI6ImZlOTkzYTU5LWVjZjUtNDUzOC04OGU5LWE4MDllMjc3NjU4NiJ9.CI9fnV_m_6TQ-SjOy9yvNiwUztj-A2V5X4TNVf8llfw",
  "access_expires_at": "2026-10-29T14:44:20.870022382Z",
  "refresh_token": "If_n7g27c7tkwO__6OLAFp9oFGDMlBWJnRic4ThKuiI",
  "refresh_expires_at": "2026-11-28T14:29:20.869337919Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "96254296-7dde-4b74-9564-98cd619b8d61",
  "session_id": "fe993a59-ecf5-4538-88e9-a809e2776586",
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
  "phone": "+380666246570",
  "device_ref": "sandbox-22234"
}
```

```json
{
  "challenge_id": "f289089b-ad2e-4f4b-ae27-83030d9af2d3",
  "expires_at": "2026-10-29T14:34:21.433235074Z",
  "resend_available_at": "2026-10-29T14:29:22.433235074Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666246570` → **200**

```json
{
  "phone": "+380666246570",
  "audience": "CLIENT",
  "code": "427413",
  "sent_at": "2026-10-29T14:29:21.43606791Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f289089b-ad2e-4f4b-ae27-83030d9af2d3",
  "code": "427413",
  "device_ref": "sandbox-22234"
}
```

```json
{
  "session_id": "3327e2ba-d2f1-4670-b6d6-1bf449c30766",
  "subject": {
    "type": "CLIENT",
    "id": "f84534c4-4c9c-4f5b-a286-06b84db37ac1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODQ1MzRjNC00YzljLTRmNWItYTI4Ni0wNmI4NGRiMzdhYzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDYxLCJpYXQiOjE3OTMyODQxNjEsImp0aSI6ImQ0MTQ1ZmZiLTMyMDQtNDAwYy1hMDczLTY4M2VmNDFhOTY0MSIsInNpZCI6IjMzMjdlMmJhLWQyZjEtNDY3MC1iNmQ2LTFiZjQ0OWMzMDc2NiJ9.BGqXQJvyuF8W2DcrQvLDXUszaoneLUvSdrwDyg9G020",
  "access_expires_at": "2026-10-29T14:44:21.730431777Z",
  "refresh_token": "XdtfxTXfF_qsFB_hasSxG4W4YCH879DjcAsTdEJGHA4",
  "refresh_expires_at": "2026-11-28T14:29:21.729920962Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "eef7f376-cd6f-449c-8db0-e4f0edefda34",
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
  "id": "d58e85a1-edd2-41aa-af8f-9f9e2cf04ddd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:34:22.020070Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: c2c31c26-1615-45be-ab56-e4f2ca2e29df) → **201**

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
  "session_id": "e68388bf-13a6-43ac-a101-a619cd384628",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwNjIsImlhdCI6MTc5MzI4NDE2MiwianRpIjoiNGNkMmIwMDMtZDJiMi00Mjg2LWFlYmMtMWViM2NiMzhjNDBkIiwic2lkIjoiZTY4Mzg4YmYtMTNhNi00M2FjLWExMDEtYTYxOWNkMzg0NjI4In0.C4cbS3HdQHNdhR3wd-oop8Bum4d5rzowc7IHGaZTqyk",
  "access_expires_at": "2026-10-29T14:44:22.633459593Z",
  "refresh_token": "7xdf0ltZJUmNeXv-jTxhHyv0IUyEicvXTGyjf2WLFck",
  "refresh_expires_at": "2026-10-30T02:29:22.632897983Z",
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
  "session_id": "4c1468ff-5a4c-42a6-a7ab-27920e5d2584",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwNjMsImlhdCI6MTc5MzI4NDE2MywianRpIjoiOTAxZTMxOGUtMWUwMi00MDc4LThjN2YtZmIxOWQyNWJhOTQ1Iiwic2lkIjoiNGMxNDY4ZmYtNWE0Yy00MmE2LWE3YWItMjc5MjBlNWQyNTg0In0.6G-7GEAnLUHhGPfgwl9Oix1L9iM22J_TF0SlfyAgu_U",
  "access_expires_at": "2026-10-29T14:44:23.204908372Z",
  "refresh_token": "FDQcd0neUDjHjpD_6mu10kqSUCtXo3Yw6-SANMZJT0E",
  "refresh_expires_at": "2026-10-30T02:29:23.204311024Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/20741414-04d0-4e2c-8ea7-b5d1634ce629/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:29:22.310622Z",
      "actor": {
        "type": "CLIENT",
        "id": "f84534c4-4c9c-4f5b-a286-06b84db37ac1",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "20741414-04d0-4e2c-8ea7-b5d1634ce629",
        "quote_id": "d58e85a1-edd2-41aa-af8f-9f9e2cf04ddd",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "c2c31c26-1615-45be-ab56-e4f2ca2e29df"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:29:22.312478Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "20741414-04d0-4e2c-8ea7-b5d1634ce629",
        "attempt_id": "814af866-f2d2-47a2-acee-e0d6de0a6374",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c2c31c26-1615-45be-ab56-e4f2ca2e29df"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T14:29:22.318797Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "20741414-04d0-4e2c-8ea7-b5d1634ce629",
        "attempt_id": "814af866-f2d2-47a2-acee-e0d6de0a6374"
      },
      "correlation_id": "c2c31c26-1615-45be-ab56-e4f2ca2e29df"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "814af866-f2d2-47a2-acee-e0d6de0a6374",
        "generation": 1,
        "started_at": "2026-10-29T14:29:22.311566Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T14:29:22.318797Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T14:29:22.313173Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/c2c31c26-1615-45be-ab56-e4f2ca2e29df` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "20741414-04d0-4e2c-8ea7-b5d1634ce629:0",
      "order_id": "20741414-04d0-4e2c-8ea7-b5d1634ce629",
      "at": "2026-10-29T14:29:22.310622Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "20741414-04d0-4e2c-8ea7-b5d1634ce629:1",
      "order_id": "20741414-04d0-4e2c-8ea7-b5d1634ce629",
      "at": "2026-10-29T14:29:22.312478Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "20741414-04d0-4e2c-8ea7-b5d1634ce629:2",
      "order_id": "20741414-04d0-4e2c-8ea7-b5d1634ce629",
      "at": "2026-10-29T14:29:22.318797Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/dd2f82a3-aa74-467a-aa0f-6e53ac74163a` → **200**

```json
{
  "found": []
}
```

Done: request c2c31c26-1615-45be-ab56-e4f2ca2e29df — order 20741414-04d0-4e2c-8ea7-b5d1634ce629 found by its id.

`GET /api/rider/v1/orders/20741414-04d0-4e2c-8ea7-b5d1634ce629` → **200**

```json
{
  "id": "20741414-04d0-4e2c-8ea7-b5d1634ce629",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f84534c4-4c9c-4f5b-a286-06b84db37ac1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:29:22.310122Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/20741414-04d0-4e2c-8ea7-b5d1634ce629/cancel` → **200**

```json
{
  "command_id": "897a2068-4f2e-4ad7-8deb-30b739c296d6",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "20741414-04d0-4e2c-8ea7-b5d1634ce629",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f84534c4-4c9c-4f5b-a286-06b84db37ac1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:29:22.310122Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
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
  "phone": "+380630563337",
  "device_ref": "sandbox-26888"
}
```

```json
{
  "challenge_id": "47fa071b-8259-4553-b76a-3f5c574aaf8b",
  "expires_at": "2026-10-29T14:34:24.940007054Z",
  "resend_available_at": "2026-10-29T14:29:25.940007054Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630563337` → **200**

```json
{
  "phone": "+380630563337",
  "audience": "CLIENT",
  "code": "801224",
  "sent_at": "2026-10-29T14:29:24.942799902Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "47fa071b-8259-4553-b76a-3f5c574aaf8b",
  "code": "801224",
  "device_ref": "sandbox-26888"
}
```

```json
{
  "session_id": "30b66879-60f6-4b41-9bd4-7b564bd05dda",
  "subject": {
    "type": "CLIENT",
    "id": "314f2eb4-8cba-406f-a958-d58d723ba491"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRmMmViNC04Y2JhLTQwNmYtYTk1OC1kNThkNzIzYmE0OTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDY1LCJpYXQiOjE3OTMyODQxNjUsImp0aSI6ImE3MzFiYzlkLTVlYTItNGU3Mi05YmJkLTA2YmUxNWUwNDE2MSIsInNpZCI6IjMwYjY2ODc5LTYwZjYtNGI0MS05YmQ0LTdiNTY0YmQwNWRkYSJ9.g72dn4MkuJA2Se2x25i9pmNJfNPmYQ7IZTxP3iIUd1s",
  "access_expires_at": "2026-10-29T14:44:25.255124243Z",
  "refresh_token": "nnYmJ-Lfxm8uICmo6uXDHyhJmIfXtleOlK70jOh2GuU",
  "refresh_expires_at": "2026-11-28T14:29:25.254543198Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "32c74214-192c-4614-9884-1b8e7e04e234",
  "expires_at": "2026-10-29T14:34:27.539576937Z",
  "resend_available_at": "2026-10-29T14:29:28.539576937Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630563337` → **200**

```json
{
  "phone": "+380630563337",
  "audience": "CLIENT",
  "code": "789919",
  "sent_at": "2026-10-29T14:29:27.542457841Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "8d10a09b-8243-4a24-8005-4c29602dad6c",
  "challenge_id": "32c74214-192c-4614-9884-1b8e7e04e234",
  "otp_code": "789919"
}
```

```json
{
  "id": "b836e3b7-c3a4-4ed9-a9f1-2f329fa47574",
  "state": "PENDING",
  "created_at": "2026-10-29T14:29:27.848716Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/b836e3b7-c3a4-4ed9-a9f1-2f329fa47574` → **200**

```json
{
  "id": "b836e3b7-c3a4-4ed9-a9f1-2f329fa47574",
  "state": "PENDING",
  "created_at": "2026-10-29T14:29:27.848716Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b836e3b7-c3a4-4ed9-a9f1-2f329fa47574` → **200**

```json
{
  "id": "b836e3b7-c3a4-4ed9-a9f1-2f329fa47574",
  "state": "PENDING",
  "created_at": "2026-10-29T14:29:27.848716Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b836e3b7-c3a4-4ed9-a9f1-2f329fa47574` → **200**

```json
{
  "id": "b836e3b7-c3a4-4ed9-a9f1-2f329fa47574",
  "state": "PENDING",
  "created_at": "2026-10-29T14:29:27.848716Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b836e3b7-c3a4-4ed9-a9f1-2f329fa47574` → **200**

```json
{
  "id": "b836e3b7-c3a4-4ed9-a9f1-2f329fa47574",
  "state": "PENDING",
  "created_at": "2026-10-29T14:29:27.848716Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b836e3b7-c3a4-4ed9-a9f1-2f329fa47574` → **200**

```json
{
  "id": "b836e3b7-c3a4-4ed9-a9f1-2f329fa47574",
  "state": "READY",
  "created_at": "2026-10-29T14:29:27.848716Z",
  "ready_at": "2026-10-29T14:29:33.187411Z",
  "expires_at": "2026-11-05T14:29:33.187411Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/b836e3b7-c3a4-4ed9-a9f1-2f329fa47574/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637270688",
  "device_ref": "sandbox-29010"
}
```

```json
{
  "challenge_id": "d711c70e-a67f-4554-8a2a-1af6061a5b9b",
  "expires_at": "2026-10-29T14:34:33.535196739Z",
  "resend_available_at": "2026-10-29T14:29:34.535196739Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637270688` → **200**

```json
{
  "phone": "+380637270688",
  "audience": "CLIENT",
  "code": "004557",
  "sent_at": "2026-10-29T14:29:33.53791791Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d711c70e-a67f-4554-8a2a-1af6061a5b9b",
  "code": "004557",
  "device_ref": "sandbox-29010"
}
```

```json
{
  "session_id": "efe6f0eb-0dd0-4463-82d8-79e4f840a70b",
  "subject": {
    "type": "CLIENT",
    "id": "37152f21-d30d-4278-a12f-bbc754c50e39"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNzE1MmYyMS1kMzBkLTQyNzgtYTEyZi1iYmM3NTRjNTBlMzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDczLCJpYXQiOjE3OTMyODQxNzMsImp0aSI6IjQ3NTBmMDY2LWY2YTQtNDFjOC1iNWQ5LWI2MThiZjQ1M2MwMSIsInNpZCI6ImVmZTZmMGViLTBkZDAtNDQ2My04MmQ4LTc5ZTRmODQwYTcwYiJ9.OMa0VVbwsI10e8w4bJHBVTIPXxgXYQu8DVJHssV5p7Q",
  "access_expires_at": "2026-10-29T14:44:33.834852929Z",
  "refresh_token": "dBTHa7a4GlIYRX73OV-MFmT8nVbeeH9qZIaSiqJFf5s",
  "refresh_expires_at": "2026-11-28T14:29:33.834284465Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/b836e3b7-c3a4-4ed9-a9f1-2f329fa47574/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/b836e3b7-c3a4-4ed9-a9f1-2f329fa47574/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f12ef848-6fc8-438f-b040-84e021a87e0f"
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
  "session_id": "28cc38bf-329d-4d59-99af-da0e53c5b378",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwNzQsImlhdCI6MTc5MzI4NDE3NCwianRpIjoiOTRiMGIxOGYtM2VhOC00MmViLTg1MGQtZDczNGI1YzkyNGQ0Iiwic2lkIjoiMjhjYzM4YmYtMzI5ZC00ZDU5LTk5YWYtZGEwZTUzYzViMzc4In0.Dxf9G4ZPAVZQU1UGw0TfDoo7YHhNAbZkAMK4UJWWEPY",
  "access_expires_at": "2026-10-29T14:44:34.681131164Z",
  "refresh_token": "3H7_zpdKaRYnM-VKaO02_3nV85eJI7zrOjKFa0vkKQU",
  "refresh_expires_at": "2026-10-30T02:29:34.680587396Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "314f2eb4-8cba-406f-a958-d58d723ba491",
  "session_id": "30b66879-60f6-4b41-9bd4-7b564bd05dda",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/314f2eb4-8cba-406f-a958-d58d723ba491/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "b836e3b7-c3a4-4ed9-a9f1-2f329fa47574",
      "state": "READY",
      "created_at": "2026-10-29T14:29:27.848716Z",
      "ready_at": "2026-10-29T14:29:33.187411Z",
      "expires_at": "2026-11-05T14:29:33.187411Z",
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
  "device_ref": "sandbox-11789"
}
```

```json
{
  "challenge_id": "7f1793b9-3632-46b3-a5d7-6032734f8803",
  "expires_at": "2026-10-29T14:34:35.514046303Z",
  "resend_available_at": "2026-10-29T14:29:36.514046303Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "159074",
  "sent_at": "2026-10-29T14:29:35.516596471Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f1793b9-3632-46b3-a5d7-6032734f8803",
  "code": "159074",
  "device_ref": "sandbox-11789"
}
```

```json
{
  "session_id": "b295fcef-6430-44e1-8b93-500f80e4f473",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTA3NSwiaWF0IjoxNzkzMjg0MTc1LCJqdGkiOiJjNGE4NzQ1ZS1hMTE3LTQ1MmEtYTM3ZS05NTA2YzZkZDA2YjQiLCJzaWQiOiJiMjk1ZmNlZi02NDMwLTQ0ZTEtOGI5My01MDBmODBlNGY0NzMifQ.PvnW0vklyoYv_mk4iNOmWHL26BrIgk_k1UWRuqY5Xf0",
  "access_expires_at": "2026-10-29T14:44:35.82516783Z",
  "refresh_token": "PShp8ZD3z3ByC0bFIFgYyoxsf6_Z87r82Huvgqj0QXg",
  "refresh_expires_at": "2026-11-28T14:29:35.824668927Z",
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
  "device_ref": "sandbox-23399"
}
```

```json
{
  "challenge_id": "b151b776-6bbb-46b5-8836-311d093f3486",
  "expires_at": "2026-10-29T14:34:36.356643191Z",
  "resend_available_at": "2026-10-29T14:29:37.356643191Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "278786",
  "sent_at": "2026-10-29T14:29:36.359175145Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b151b776-6bbb-46b5-8836-311d093f3486",
  "code": "278786",
  "device_ref": "sandbox-23399"
}
```

```json
{
  "session_id": "be4723b1-e9de-426e-ab37-170381a9cc0d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTA3NiwiaWF0IjoxNzkzMjg0MTc2LCJqdGkiOiJjN2I1OWI5My1jM2U4LTQxNTUtODE0OS1lMDIyN2M1MjdiOWMiLCJzaWQiOiJiZTQ3MjNiMS1lOWRlLTQyNmUtYWIzNy0xNzAzODFhOWNjMGQifQ.j2Yb0M_uDya-Utc5t_WIl3QiGk1z5_a4agQ6pM6AAq8",
  "access_expires_at": "2026-10-29T14:44:36.652504736Z",
  "refresh_token": "czGbZsyUo3hhc0sIuEk38TqLJw_QMcMwVy4d2O8KhcA",
  "refresh_expires_at": "2026-11-28T14:29:36.651924967Z",
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
  "command_id": "8d93c3b8-bb13-4cb5-9e24-afebd6f82b9d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:29:37Z",
    "sequence": 1793284177197
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "55ffedc3-d281-423b-a32a-c1465622bee5",
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
  "last_heartbeat_at": "2026-10-29T14:29:37.216595Z",
  "last_location_at": "2026-10-29T14:29:37.216595Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-24148"
}
```

```json
{
  "challenge_id": "a79221ac-a793-4369-866d-c4bd10d7b141",
  "expires_at": "2026-10-29T14:34:37.498820668Z",
  "resend_available_at": "2026-10-29T14:29:38.498820668Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "966268",
  "sent_at": "2026-10-29T14:29:37.501611638Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a79221ac-a793-4369-866d-c4bd10d7b141",
  "code": "966268",
  "device_ref": "sandbox-24148"
}
```

```json
{
  "session_id": "597a8283-e80d-4f57-9f92-720b46a8631d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTA3NywiaWF0IjoxNzkzMjg0MTc3LCJqdGkiOiJlMTAxZTFhYy1iOGQxLTRkODAtODM5MS1hMWNiMTQ5MTgwNGIiLCJzaWQiOiI1OTdhODI4My1lODBkLTRmNTctOWY5Mi03MjBiNDZhODYzMWQifQ.Lcm4Ias31aXpiTSgOsM1bKV7f6AKYaJ5EJgd0-Vodf8",
  "access_expires_at": "2026-10-29T14:44:37.808499993Z",
  "refresh_token": "RIYLVHZWjyx0QDrOARyQvcStRr6gPu3ZTW-O_GgJme8",
  "refresh_expires_at": "2026-11-28T14:29:37.807939992Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "da476764-0cee-4d53-a8db-c6578e404813",
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
  "last_heartbeat_at": "2026-10-29T14:28:06.416563Z",
  "last_location_at": "2026-10-29T14:28:06.416563Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/da476764-0cee-4d53-a8db-c6578e404813/handover` → **200**

```json
{
  "command_id": "96d38b5b-4e7f-420d-a3d3-8ff2e962a89b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "da476764-0cee-4d53-a8db-c6578e404813",
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
  "last_heartbeat_at": "2026-10-29T14:28:06.416563Z",
  "last_location_at": "2026-10-29T14:28:06.416563Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/da476764-0cee-4d53-a8db-c6578e404813/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:29:38Z",
    "sequence": 1793284178679
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "da476764-0cee-4d53-a8db-c6578e404813",
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
  "last_heartbeat_at": "2026-10-29T14:29:38.697521Z",
  "last_location_at": "2026-10-29T14:29:38.697521Z",
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
  "session_id": "aebb0a5f-9920-49d4-951a-b254d408b497",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwNzksImlhdCI6MTc5MzI4NDE3OSwianRpIjoiOWQ4MmI0YmEtYjk0Yi00MGYxLTg5NDYtNjU1ZDIyZTE2ZTQxIiwic2lkIjoiYWViYjBhNWYtOTkyMC00OWQ0LTk1MWEtYjI1NGQ0MDhiNDk3In0.pokxESO3pEkVSNjEIpc_7JM5cpSgOjFQyqqvXqSx-rA",
  "access_expires_at": "2026-10-29T14:44:39.264249565Z",
  "refresh_token": "i8RhHatSva3TUTo68jdYqljMrhZqRiTX7zGWZ1NTHQA",
  "refresh_expires_at": "2026-10-30T02:29:39.263734362Z",
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
  "session_id": "82afbf54-8a01-4518-976a-d2f708828b7a",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwNzksImlhdCI6MTc5MzI4NDE3OSwianRpIjoiZmNmNjY4N2MtYmIzZS00YWU0LWI0MGEtZmZmMmRiMWRjNTgyIiwic2lkIjoiODJhZmJmNTQtOGEwMS00NTE4LTk3NmEtZDJmNzA4ODI4YjdhIn0.FxOHaRfdJ6Z8c2nHy6uiB_NXsjDi0-KVN9_Qa6QuZmY",
  "access_expires_at": "2026-10-29T14:44:39.829206016Z",
  "refresh_token": "ELoNSoVsc8TgY-DeTVra1a1ILfrtwm3LawlrazP3rkM",
  "refresh_expires_at": "2026-10-30T02:29:39.828655967Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380686190949",
  "device_ref": "sandbox-11718"
}
```

```json
{
  "challenge_id": "524f0dab-3e45-42cb-92a4-a737c621cc40",
  "expires_at": "2026-10-29T14:34:40.114683822Z",
  "resend_available_at": "2026-10-29T14:29:41.114683822Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380686190949` → **200**

```json
{
  "phone": "+380686190949",
  "audience": "CLIENT",
  "code": "345880",
  "sent_at": "2026-10-29T14:29:40.117969897Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "524f0dab-3e45-42cb-92a4-a737c621cc40",
  "code": "345880",
  "device_ref": "sandbox-11718"
}
```

```json
{
  "session_id": "90d608d8-5f76-4279-ac66-091e21099276",
  "subject": {
    "type": "CLIENT",
    "id": "6897498b-ca16-421c-8473-f1d0b0d1589c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODk3NDk4Yi1jYTE2LTQyMWMtODQ3My1mMWQwYjBkMTU4OWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDgwLCJpYXQiOjE3OTMyODQxODAsImp0aSI6IjYxOTQ1YjVhLWRkMDMtNDRkNS04ZTBmLTQ2Yzg4YWQ3MWUwOCIsInNpZCI6IjkwZDYwOGQ4LTVmNzYtNDI3OS1hYzY2LTA5MWUyMTA5OTI3NiJ9.0Sfd99cwxNwfJS5KbFT01jSi6pXbDy_CDP8R5xqY6vs",
  "access_expires_at": "2026-10-29T14:44:40.427088337Z",
  "refresh_token": "Rxa-l7AfWQuLVyErcsmjB19tCnSKrJzyQIM6HmPdgaw",
  "refresh_expires_at": "2026-11-28T14:29:40.426557995Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "66b82a0b-70f6-4cbc-aba6-cdf38372c97c",
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
  "id": "5476cbdb-d252-4f17-9ef5-7daced509352",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:34:40.718372Z",
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
  "command_id": "78c02e4e-1c7d-40db-ade0-b706a5e08263",
  "quote_id": "5476cbdb-d252-4f17-9ef5-7daced509352",
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
  "id": "9a600f33-b476-453c-a375-4b47cfcd44cc",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6897498b-ca16-421c-8473-f1d0b0d1589c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:29:41.022948Z",
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
    "id": "c10fbae7-9079-4daa-9c80-8ff575436c83",
    "order_id": "9a600f33-b476-453c-a375-4b47cfcd44cc",
    "expires_at": "2026-10-29T14:29:56.026019Z",
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

`POST /api/driver/v1/offers/c10fbae7-9079-4daa-9c80-8ff575436c83/reject` → **204**

```json
{
  "command_id": "703633d9-9033-4076-8d67-52a9ffe2a3a0"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "064ef8c2-f730-4abf-bd9b-d1c6896d52f4",
    "order_id": "9a600f33-b476-453c-a375-4b47cfcd44cc",
    "expires_at": "2026-10-29T14:29:56.633412Z",
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

`POST /api/driver/v1/offers/064ef8c2-f730-4abf-bd9b-d1c6896d52f4/accept` → **200**

```json
{
  "command_id": "3fdea057-9720-436a-aa79-cae0328f1874"
}
```

```json
{
  "id": "0e6b43c9-699f-41ee-8b2e-02cd57738dfe",
  "order_id": "9a600f33-b476-453c-a375-4b47cfcd44cc",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1dc9f72d-0e72-4bdd-b6b9-f3ad4a8f6480",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/9a600f33-b476-453c-a375-4b47cfcd44cc/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:29:41.023384Z",
      "actor": {
        "type": "CLIENT",
        "id": "6897498b-ca16-421c-8473-f1d0b0d1589c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "9a600f33-b476-453c-a375-4b47cfcd44cc",
        "quote_id": "5476cbdb-d252-4f17-9ef5-7daced509352",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "8d4f9f66-18ea-4058-8600-b9b0c8e89833"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:29:41.025274Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9a600f33-b476-453c-a375-4b47cfcd44cc",
        "attempt_id": "84b4dfe5-d207-4654-abc2-cbe98a4bc768",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "8d4f9f66-18ea-4058-8600-b9b0c8e89833"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:29:41.02899Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c10fbae7-9079-4daa-9c80-8ff575436c83",
        "order_id": "9a600f33-b476-453c-a375-4b47cfcd44cc",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "8d4f9f66-18ea-4058-8600-b9b0c8e89833"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T14:29:41.63228Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c10fbae7-9079-4daa-9c80-8ff575436c83",
        "order_id": "9a600f33-b476-453c-a375-4b47cfcd44cc"
      },
      "correlation_id": "7b8cccbc-0e70-4a80-a274-e0d15c0f92d7"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 9a600f33-b476-453c-a375-4b47cfcd44cc — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/9a600f33-b476-453c-a375-4b47cfcd44cc` → **200**

```json
{
  "id": "9a600f33-b476-453c-a375-4b47cfcd44cc",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "6897498b-ca16-421c-8473-f1d0b0d1589c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "0e6b43c9-699f-41ee-8b2e-02cd57738dfe",
    "order_id": "9a600f33-b476-453c-a375-4b47cfcd44cc",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "1dc9f72d-0e72-4bdd-b6b9-f3ad4a8f6480",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T14:29:41.022948Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9a600f33-b476-453c-a375-4b47cfcd44cc/cancel` → **200**

```json
{
  "command_id": "6f784caf-cf98-48cb-986a-998b162d4363",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "9a600f33-b476-453c-a375-4b47cfcd44cc",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "6897498b-ca16-421c-8473-f1d0b0d1589c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "0e6b43c9-699f-41ee-8b2e-02cd57738dfe",
    "order_id": "9a600f33-b476-453c-a375-4b47cfcd44cc",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "1dc9f72d-0e72-4bdd-b6b9-f3ad4a8f6480",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T14:29:41.022948Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
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
  "session_id": "55ffedc3-d281-423b-a32a-c1465622bee5",
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
  "last_heartbeat_at": "2026-10-29T14:29:37.216595Z",
  "last_location_at": "2026-10-29T14:29:37.216595Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/55ffedc3-d281-423b-a32a-c1465622bee5/close` → **200**

```json
{
  "command_id": "b0c5cd3f-f308-4b1f-a2ef-9ffceb8095ee",
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
  "session_id": "da476764-0cee-4d53-a8db-c6578e404813",
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
  "last_heartbeat_at": "2026-10-29T14:29:38.697521Z",
  "last_location_at": "2026-10-29T14:29:38.697521Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/da476764-0cee-4d53-a8db-c6578e404813/close` → **200**

```json
{
  "command_id": "79e15674-7cdd-4a1a-bfba-b49c59690338",
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
  "session_id": "a7ca551d-8463-4aa7-b6c9-76839e915012",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwODQsImlhdCI6MTc5MzI4NDE4NCwianRpIjoiNDI3NTU0ODktZTk1ZS00Zjk5LWJmMmQtMzNiMTA2MmU4YmI1Iiwic2lkIjoiYTdjYTU1MWQtODQ2My00YWE3LWI2YzktNzY4MzllOTE1MDEyIn0._MJNIaA1bQEhDMB_GPgPACRD4Z85uPR-y_DiRtp-XZM",
  "access_expires_at": "2026-10-29T14:44:44.653290999Z",
  "refresh_token": "yCYExKoddoXPave2PqcVRZBV74VeJbZFws2x-e7UG7Q",
  "refresh_expires_at": "2026-10-30T02:29:44.652817132Z",
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
  "command_id": "66e1d980-4c3f-42aa-9177-cb1959cc3a9e",
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
  "changed_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T14:29:45.222575Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "12f4a39a-2a99-402b-80ef-50e595f3c64a",
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
  "correlation_id": "53fc27b4-5c8e-48f4-9d21-18466a07ecd8"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "38f085ef-210e-4cca-ba3d-b8f9e05f1136",
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
  "correlation_id": "c4179f6b-87e1-4e3c-a4f9-4fabb881e9ed"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634662789",
  "device_ref": "sandbox-30560"
}
```

```json
{
  "challenge_id": "afe795c0-309a-499f-9b44-f6f243a781a3",
  "expires_at": "2026-10-29T14:34:46.077569274Z",
  "resend_available_at": "2026-10-29T14:29:47.077569274Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634662789` → **200**

```json
{
  "phone": "+380634662789",
  "audience": "CLIENT",
  "code": "000831",
  "sent_at": "2026-10-29T14:29:46.080279651Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "afe795c0-309a-499f-9b44-f6f243a781a3",
  "code": "000831",
  "device_ref": "sandbox-30560"
}
```

```json
{
  "session_id": "c51da2d4-a0da-4794-bfa2-8484a259e30f",
  "subject": {
    "type": "CLIENT",
    "id": "29db1fcd-101f-45c9-9e1d-09ea23a9bce6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWRiMWZjZC0xMDFmLTQ1YzktOWUxZC0wOWVhMjNhOWJjZTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDg2LCJpYXQiOjE3OTMyODQxODYsImp0aSI6ImUzNzI1ZGIzLWM1ODItNGNjNy1iNTY3LWViMTA1YWIzMGJlNCIsInNpZCI6ImM1MWRhMmQ0LWEwZGEtNDc5NC1iZmEyLTg0ODRhMjU5ZTMwZiJ9.S3phA2RmcCQ7HYLrqz1fmzoIJPRxirVYVblWB7f4nus",
  "access_expires_at": "2026-10-29T14:44:46.380311305Z",
  "refresh_token": "1KPQIiwWUYQunbWsHBUs5OCH7Ac5EE4Auhf9lm6-g1w",
  "refresh_expires_at": "2026-11-28T14:29:46.379742521Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6c91d5a8-2d06-44f9-af85-90d4254f7316",
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
  "id": "984826e0-613c-4a3d-894e-133c38742415",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:34:46.658699Z",
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
  "command_id": "f0e87180-ba35-4a6d-b28c-44cf239e4781",
  "quote_id": "984826e0-613c-4a3d-894e-133c38742415",
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
  "correlation_id": "ce534168-8b5e-42c5-9b5b-7218d97d8f4b"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c4652a55-5a3f-495d-bca7-fc66ab5bc834",
  "quote_id": "984826e0-613c-4a3d-894e-133c38742415",
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
  "id": "b0bfd41b-3454-4e55-93dd-a4df65a31032",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "29db1fcd-101f-45c9-9e1d-09ea23a9bce6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:29:47.231803Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b0bfd41b-3454-4e55-93dd-a4df65a31032/cancel` → **200**

```json
{
  "command_id": "270b8a57-25a9-4421-b2f0-d03bd58c2b57",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b0bfd41b-3454-4e55-93dd-a4df65a31032",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "29db1fcd-101f-45c9-9e1d-09ea23a9bce6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:29:47.231803Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
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
  "command_id": "9155e2f8-bc60-4a81-86a1-1535170ea4fc",
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
  "changed_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T14:29:47.839385Z"
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
      "changed_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T14:29:47.839385Z"
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
  "device_ref": "sandbox-31112"
}
```

```json
{
  "challenge_id": "d8804b3f-f40f-4220-969a-e2fa0331621e",
  "expires_at": "2026-10-29T14:34:48.710235794Z",
  "resend_available_at": "2026-10-29T14:29:49.710235794Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "047338",
  "sent_at": "2026-10-29T14:29:48.71299718Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d8804b3f-f40f-4220-969a-e2fa0331621e",
  "code": "047338",
  "device_ref": "sandbox-31112"
}
```

```json
{
  "session_id": "7a62a558-bf5f-4b3c-b787-64d670650262",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTA4OSwiaWF0IjoxNzkzMjg0MTg5LCJqdGkiOiIzNjllMjEzYy0yZjU2LTRiM2ItOWE5ZS1kNWQ4OWVlOWU1OGYiLCJzaWQiOiI3YTYyYTU1OC1iZjVmLTRiM2MtYjc4Ny02NGQ2NzA2NTAyNjIifQ.jguoUwPX8KO117BI2rjsJKUcTqUOv7J0utyUk78dyKY",
  "access_expires_at": "2026-10-29T14:44:49.010768209Z",
  "refresh_token": "b1zT8htt4e7zlroCDnKw4XoqmZLzsbiU3-5MZ8JuO4U",
  "refresh_expires_at": "2026-11-28T14:29:49.010226436Z",
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
  "command_id": "890608c4-d6fb-4c91-9c8b-2a650292bb58",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:29:49Z",
    "sequence": 1793284189573
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cb290d9f-a233-4828-b465-bac63d13237b",
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
  "last_heartbeat_at": "2026-10-29T14:29:49.591285Z",
  "last_location_at": "2026-10-29T14:29:49.591285Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676207960",
  "device_ref": "sandbox-18077"
}
```

```json
{
  "challenge_id": "f735752a-efe9-4772-bf99-2a627cfd8d82",
  "expires_at": "2026-10-29T14:34:49.875954216Z",
  "resend_available_at": "2026-10-29T14:29:50.875954216Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676207960` → **200**

```json
{
  "phone": "+380676207960",
  "audience": "CLIENT",
  "code": "144732",
  "sent_at": "2026-10-29T14:29:49.878554981Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f735752a-efe9-4772-bf99-2a627cfd8d82",
  "code": "144732",
  "device_ref": "sandbox-18077"
}
```

```json
{
  "session_id": "8b541da2-0bd0-4088-827d-16b091d3de84",
  "subject": {
    "type": "CLIENT",
    "id": "af6280ec-54b9-4d86-863f-22b83f628704"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjYyODBlYy01NGI5LTRkODYtODYzZi0yMmI4M2Y2Mjg3MDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDkwLCJpYXQiOjE3OTMyODQxOTAsImp0aSI6IjE2OWFhNWU4LTE3MmMtNDc0ZC1hYjA4LWEyZTg2NjFlZTdhNiIsInNpZCI6IjhiNTQxZGEyLTBiZDAtNDA4OC04MjdkLTE2YjA5MWQzZGU4NCJ9.lmuI8rqfLED1y_XOuGXDEK2tBZ2gmFWPNw96dmXMqog",
  "access_expires_at": "2026-10-29T14:44:50.177311262Z",
  "refresh_token": "cBX6VFm3ukEDCjMr2ugOr5xdTkENYprxTKP8SlvA2sM",
  "refresh_expires_at": "2026-11-28T14:29:50.176848816Z",
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
  "command_id": "2daf888b-45e4-43a9-8bbe-8e9f2a1d571a",
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
  "id": "8016b330-3c19-4641-ae18-e40b49c0da9b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:34:50.741010Z",
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
  "command_id": "65fcc0b4-e46d-43c4-8ff8-0f50481164b6",
  "platform": "ANDROID",
  "token": "sandbox-driver-47b57ce6-e34d-4286-8db9-1b1337ef0b49"
}
```

```json
{
  "id": "3fa2dd1e-903a-46da-b297-a9964e9ef4e4",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T14:29:51.034811Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "1b4a5b1b-8b9e-4102-93ff-9a0d9ddd4189",
  "platform": "ANDROID",
  "token": "sandbox-rider-11f773fa-1ffc-482a-9c5a-02ea14b23f31"
}
```

```json
{
  "id": "a11e8edc-179b-409a-a75d-d95902647cb1",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T14:29:51.322961Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "75f58e12-a133-4561-bf2f-40059c9ec60e",
  "quote_id": "8016b330-3c19-4641-ae18-e40b49c0da9b",
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
  "id": "b7c9239a-42a0-436f-bedb-d9f536973b88",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "af6280ec-54b9-4d86-863f-22b83f628704",
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
  "created_at": "2026-10-29T14:29:51.612048Z",
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
    "id": "e6bfb5c4-aa60-4eb4-afa1-089ed183c2ea",
    "order_id": "b7c9239a-42a0-436f-bedb-d9f536973b88",
    "expires_at": "2026-10-29T14:30:06.615151Z",
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

`POST /api/driver/v1/offers/e6bfb5c4-aa60-4eb4-afa1-089ed183c2ea/accept` → **200**

```json
{
  "command_id": "4e4d5eab-0eb3-4009-a37e-1bd44cae526b"
}
```

```json
{
  "id": "5a3a3116-8161-495e-94f7-ffd4157680f6",
  "order_id": "b7c9239a-42a0-436f-bedb-d9f536973b88",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "060b6691-a7ef-4c0c-a5d6-a5243bcdb275",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T14:29:51.588Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T14:29:51.588Z` → **200**

```json
[
  {
    "at": "2026-10-29T14:29:52.600130808Z",
    "token_suffix": "ef0b49",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "event_id": "2fcaa731-d855-4ece-8809-b4eaa688df7f",
      "order_version": "2",
      "order_id": "b7c9239a-42a0-436f-bedb-d9f536973b88",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380676207960&after=2026-10-29T14:29:51.588Z` → **200**

```json
[
  {
    "at": "2026-10-29T14:29:52.602074955Z",
    "token_suffix": "b23f31",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "event_id": "3fc44c67-887f-4f75-bcca-6b0b5640bb68",
      "order_version": "3",
      "order_id": "b7c9239a-42a0-436f-bedb-d9f536973b88",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/b7c9239a-42a0-436f-bedb-d9f536973b88/messages` → **201**

```json
{
  "command_id": "0c25f722-c2c2-486d-8ed6-9153013f1215",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "41674ed2-4683-4055-a601-60e1865990c4",
  "order_id": "b7c9239a-42a0-436f-bedb-d9f536973b88",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T14:29:53.572405712Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "060b6691-a7ef-4c0c-a5d6-a5243bcdb275",
  "order_id": "b7c9239a-42a0-436f-bedb-d9f536973b88",
  "assignment_id": "5a3a3116-8161-495e-94f7-ffd4157680f6",
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

`POST /api/driver/v1/trips/060b6691-a7ef-4c0c-a5d6-a5243bcdb275/messages` → **201**

```json
{
  "command_id": "84cf3573-0a14-4028-9561-bac57f72f8fc",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "75f20df0-12f4-4a01-b71d-cb94c1da486c",
  "order_id": "b7c9239a-42a0-436f-bedb-d9f536973b88",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T14:29:54.194448064Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/b7c9239a-42a0-436f-bedb-d9f536973b88/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/060b6691-a7ef-4c0c-a5d6-a5243bcdb275/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380676207960"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/cb290d9f-a233-4828-b465-bac63d13237b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:29:55Z",
    "sequence": 1793284195427
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cb290d9f-a233-4828-b465-bac63d13237b",
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
  "last_heartbeat_at": "2026-10-29T14:29:55.061132Z",
  "last_location_at": "2026-10-29T14:29:55.061132Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "060b6691-a7ef-4c0c-a5d6-a5243bcdb275",
  "order_id": "b7c9239a-42a0-436f-bedb-d9f536973b88",
  "assignment_id": "5a3a3116-8161-495e-94f7-ffd4157680f6",
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

`POST /api/driver/v1/trips/060b6691-a7ef-4c0c-a5d6-a5243bcdb275/arrive` → **200**

```json
{
  "command_id": "e92f2bae-a8ef-4c21-8b80-a83d8842df9f",
  "expected_version": 0
}
```

```json
{
  "id": "060b6691-a7ef-4c0c-a5d6-a5243bcdb275",
  "order_id": "b7c9239a-42a0-436f-bedb-d9f536973b88",
  "assignment_id": "5a3a3116-8161-495e-94f7-ffd4157680f6",
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
  "arrived_at": "2026-10-29T14:29:55.633138Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/060b6691-a7ef-4c0c-a5d6-a5243bcdb275/start` → **200**

```json
{
  "command_id": "a580530c-48d8-458e-9561-18c656178eb6",
  "expected_version": 1
}
```

```json
{
  "id": "060b6691-a7ef-4c0c-a5d6-a5243bcdb275",
  "order_id": "b7c9239a-42a0-436f-bedb-d9f536973b88",
  "assignment_id": "5a3a3116-8161-495e-94f7-ffd4157680f6",
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
  "arrived_at": "2026-10-29T14:29:55.633138Z",
  "started_at": "2026-10-29T14:29:55.929675Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/cb290d9f-a233-4828-b465-bac63d13237b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:29:56Z",
    "sequence": 1793284196212
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cb290d9f-a233-4828-b465-bac63d13237b",
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
  "last_heartbeat_at": "2026-10-29T14:29:56.23099Z",
  "last_location_at": "2026-10-29T14:29:56.23099Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/060b6691-a7ef-4c0c-a5d6-a5243bcdb275/complete` → **200**

```json
{
  "command_id": "fb45e2fc-5f0a-49cb-8988-c4532b08495a",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:29:56Z",
  "cash_received": true
}
```

```json
{
  "id": "060b6691-a7ef-4c0c-a5d6-a5243bcdb275",
  "order_id": "b7c9239a-42a0-436f-bedb-d9f536973b88",
  "assignment_id": "5a3a3116-8161-495e-94f7-ffd4157680f6",
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
  "arrived_at": "2026-10-29T14:29:55.633138Z",
  "started_at": "2026-10-29T14:29:55.929675Z",
  "completed_at": "2026-10-29T14:29:56.522143Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/b7c9239a-42a0-436f-bedb-d9f536973b88` → **200**

```json
{
  "id": "b7c9239a-42a0-436f-bedb-d9f536973b88",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "af6280ec-54b9-4d86-863f-22b83f628704",
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
    "id": "5a3a3116-8161-495e-94f7-ffd4157680f6",
    "order_id": "b7c9239a-42a0-436f-bedb-d9f536973b88",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "060b6691-a7ef-4c0c-a5d6-a5243bcdb275",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:29:51.612048Z",
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
    "id": "b7c9239a-42a0-436f-bedb-d9f536973b88",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-29T14:29:51.612048Z",
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
    "id": "060b6691-a7ef-4c0c-a5d6-a5243bcdb275",
    "order_id": "b7c9239a-42a0-436f-bedb-d9f536973b88",
    "order_short_number": 13,
    "created_at": "2026-10-29T14:29:52.199645Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "2b3abc04-59c6-4856-8a75-6bf15b75edaa",
    "order_id": "a354de7f-3bbc-476e-b16c-b08c244b6d74",
    "order_short_number": 8,
    "created_at": "2026-10-29T14:28:40.227377Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "974f94d8-af3c-4868-ad95-b0e749537405",
    "order_id": "d59efb03-9e53-490b-b1d0-cf3e4d35fb81",
    "order_short_number": 3,
    "created_at": "2026-10-29T14:27:57.199169Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "109c95d3-6bbe-4303-b0f9-d63783a8a398",
    "order_id": "4b5bb73a-52fb-4db8-ae43-a687ea9b7325",
    "order_short_number": 2,
    "created_at": "2026-10-29T14:27:35.653764Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "e881731a-2400-475d-b58b-02232b55e7f8",
    "order_id": "6a828d3f-87f8-4a09-871f-32294dffd248",
    "order_short_number": 1,
    "created_at": "2026-10-29T14:27:26.007033Z",
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

`GET /api/driver/v1/earnings?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-29&to=2026-10-29` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-29",
  "to": "2026-10-29",
  "days": [
    {
      "date": "2026-10-29",
      "figures": {
        "trips": 5,
        "fare_minor": 52585,
        "commission_minor": 7890,
        "driver_share_minor": 44695,
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

`GET /api/rider/v1/orders/b7c9239a-42a0-436f-bedb-d9f536973b88/tip` → **200**

```json
{
  "order_id": "b7c9239a-42a0-436f-bedb-d9f536973b88",
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
  "available_until": "2026-10-30T14:29:56.522143Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/b7c9239a-42a0-436f-bedb-d9f536973b88/tip` → **201**

```json
{
  "command_id": "16b817a8-4dae-4496-8825-bffe1edf6f4e",
  "amount_minor": 1100
}
```

```json
{
  "id": "db067288-cf7b-4321-ae7b-bc70341f604e",
  "order_id": "b7c9239a-42a0-436f-bedb-d9f536973b88",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T14:30:01.531694Z"
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
  "session_id": "48c50f14-82cb-4a15-80ee-7f4eaaf125e2",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxMDIsImlhdCI6MTc5MzI4NDIwMiwianRpIjoiZTAxODBhNDktOWZiNC00OTQ5LWE2ZGEtNDZiOTdhOGFiMDMzIiwic2lkIjoiNDhjNTBmMTQtODJjYi00YTE1LTgwZWUtN2Y0ZWFhZjEyNWUyIn0.PDzTNc2kTWUkBXK4QazDiWKeFEbDa-8NMrl5gX0_Mco",
  "access_expires_at": "2026-10-29T14:45:02.115479861Z",
  "refresh_token": "a89UZBo48QY2Z7DZTXAuSyTS71zWggp2kaARCV5skZI",
  "refresh_expires_at": "2026-10-30T02:30:02.11489957Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/reports/orders?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-29&to=2026-10-29` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-29",
  "to": "2026-10-29",
  "days": [
    {
      "date": "2026-10-29",
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
      "PHONE": 1,
      "APP": 12
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
  "generated_at": "2026-10-29T14:30:02.399562298Z"
}
```

`GET /api/admin/v1/reports/finance?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-29&to=2026-10-29` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-29",
  "to": "2026-10-29",
  "days": [
    {
      "date": "2026-10-29",
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
  "generated_at": "2026-10-29T14:30:02.694042199Z"
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
  "session_id": "b9d045cb-63d6-4cf8-aa2c-2d8bbf661b6b",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxMDMsImlhdCI6MTc5MzI4NDIwMywianRpIjoiMmM5MGI4ZWQtZmY4Zi00ZGU3LThhZGQtOTRjNzQzMTBkNjU0Iiwic2lkIjoiYjlkMDQ1Y2ItNjNkNi00Y2Y4LWFhMmMtMmQ4YmJmNjYxYjZiIn0.a79jaBh2iyV_iZksl2YXVf_N55BJa9Ux80vSyIPrjpg",
  "access_expires_at": "2026-10-29T14:45:03.269650601Z",
  "refresh_token": "z9_0JjOu4vwF9KoNjnZ3kwMLb59cvl8k4DX6CeWTaKE",
  "refresh_expires_at": "2026-10-30T02:30:03.269065967Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b7c9239a-42a0-436f-bedb-d9f536973b88/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:29:51.612523Z",
      "actor": {
        "type": "CLIENT",
        "id": "af6280ec-54b9-4d86-863f-22b83f628704",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b7c9239a-42a0-436f-bedb-d9f536973b88",
        "quote_id": "8016b330-3c19-4641-ae18-e40b49c0da9b",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "7551c1dc-2d9a-427b-a3c8-cac0ca3e7097"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:29:51.614392Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b7c9239a-42a0-436f-bedb-d9f536973b88",
        "attempt_id": "ae0af903-7423-44c5-a378-445941a35bbc",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "7551c1dc-2d9a-427b-a3c8-cac0ca3e7097"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:29:51.617268Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e6bfb5c4-aa60-4eb4-afa1-089ed183c2ea",
        "order_id": "b7c9239a-42a0-436f-bedb-d9f536973b88",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "7551c1dc-2d9a-427b-a3c8-cac0ca3e7097"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T14:29:52.201205Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "e6bfb5c4-aa60-4eb4-afa1-089ed183c2ea",
        "order_id": "b7c9239a-42a0-436f-bedb-d9f536973b88",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "5a3a3116-8161-495e-94f7-ffd4157680f6"
      },
      "correlation_id": "19da4c38-9aa8-4f70-8de1-19ddae29565e"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T14:30:03.867603608Z",
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
      "last_location_at": "2026-10-29T14:29:56.23099Z",
      "order_id": null
    }
  ]
}
```

Done: order b7c9239a-42a0-436f-bedb-d9f536973b88.

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
  "session_id": "b6c53015-0863-4c21-a5de-4e5db0af6030",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxMDQsImlhdCI6MTc5MzI4NDIwNCwianRpIjoiYmViYjcxNDEtOWNhYS00Y2ZiLWIxMmEtNWY1MzllOTg0OGIzIiwic2lkIjoiYjZjNTMwMTUtMDg2My00YzIxLWE1ZGUtNGU1ZGIwYWY2MDMwIn0.0gmCvqQnMOGap0dz3t8tbL_U_sh8je3SBN8JIRpICyU",
  "access_expires_at": "2026-10-29T14:45:04.467675878Z",
  "refresh_token": "fSxtaIy50QxJTtXBF0aeHg4b3SjF0c003lq4cqobsJ4",
  "refresh_expires_at": "2026-10-30T02:30:04.467037604Z",
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
  "command_id": "e9f1ceb2-8e1a-41bd-b7d1-8542799483e2",
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
  "timestamp": "2026-10-29T14:30:05.000+0000",
  "channel": {
    "id": "1730052000.594012216",
    "linkedid": "1730052000.594012216",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674018645"
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
  "timestamp": "2026-10-29T14:30:05.000+0000",
  "channel": {
    "id": "1730052000.594012216",
    "linkedid": "1730052000.594012216",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674018645"
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
  "session_id": "c1108f43-a64f-4180-831c-9d3a2eb1d3a2",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxMDUsImlhdCI6MTc5MzI4NDIwNSwianRpIjoiN2Q2ODRmODYtMDhkOC00ZDhkLTlhZTYtOTAyYjI4ZGY3ZDU3Iiwic2lkIjoiYzExMDhmNDMtYTY0Zi00MTgwLTgzMWMtOWQzYTJlYjFkM2EyIn0.DIOcs3PWIRrtrJMct2c2pUxGIlk0aR9xMGcyc54S-MI",
  "access_expires_at": "2026-10-29T14:45:05.655601803Z",
  "refresh_token": "_14Ph2DorPQjNKyGw3Y3pdxRdiTGfdKZ2XfJrWV-jFg",
  "refresh_expires_at": "2026-10-30T02:30:05.655068285Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "4d3ca90b-d22b-4103-928c-bb62926af0fa",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674018645",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T14:30:05Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/4d3ca90b-d22b-4103-928c-bb62926af0fa/answer` → **200**

```json
{
  "command_id": "ebacf90f-9572-4f3c-97eb-7c2eeedf518e"
}
```

```json
{
  "id": "4d3ca90b-d22b-4103-928c-bb62926af0fa",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674018645",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
  "order_ids": [],
  "started_at": "2026-10-29T14:30:05Z",
  "answered_at": "2026-10-29T14:30:06.234581Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.594012216",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "6f483095-eea2-495a-8c3d-d55ed90b7827",
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
  "id": "a9d182de-197d-4f93-a7b7-3ffe928ea3bc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:35:06.558421Z",
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
  "command_id": "a02e578f-01f4-47e8-892a-ee3e8ecd7080",
  "quote_id": "a9d182de-197d-4f93-a7b7-3ffe928ea3bc",
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
    "phone": "+380674018645"
  },
  "call_id": "4d3ca90b-d22b-4103-928c-bb62926af0fa"
}
```

```json
{
  "id": "b0d147ef-4f13-4d24-b905-b8ae13264b4a",
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
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:30:06.864063Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674018645"
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
    "id": "1730052000.594012216",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "4d3ca90b-d22b-4103-928c-bb62926af0fa",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674018645",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
      "order_ids": [
        "b0d147ef-4f13-4d24-b905-b8ae13264b4a"
      ],
      "started_at": "2026-10-29T14:30:05Z",
      "answered_at": "2026-10-29T14:30:06.234581Z",
      "ended_at": "2026-10-29T14:30:07.166738Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "2c8f32a7-070a-4020-adf2-49e8052d7880",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673001291",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
      "order_ids": [],
      "started_at": "2026-10-29T14:27:43.771064Z",
      "answered_at": "2026-10-29T14:27:44.095025Z",
      "ended_at": "2026-10-29T14:27:44.392261Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:27:53.156668Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/b0d147ef-4f13-4d24-b905-b8ae13264b4a` → **200**

```json
{
  "id": "b0d147ef-4f13-4d24-b905-b8ae13264b4a",
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
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:30:06.864063Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674018645"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/b0d147ef-4f13-4d24-b905-b8ae13264b4a` → **200**

```json
{
  "id": "b0d147ef-4f13-4d24-b905-b8ae13264b4a",
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
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:30:06.864063Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674018645"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b0d147ef-4f13-4d24-b905-b8ae13264b4a/cancel` → **200**

```json
{
  "command_id": "46b137bc-666e-424e-968d-1b99cad0bc2a",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "b0d147ef-4f13-4d24-b905-b8ae13264b4a",
  "short_number": 14,
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
  "created_at": "2026-10-29T14:30:06.864063Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674018645"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 4d3ca90b-d22b-4103-928c-bb62926af0fa with order b0d147ef-4f13-4d24-b905-b8ae13264b4a.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-16343"
}
```

```json
{
  "challenge_id": "155b7c2a-5945-469b-afa4-9d5b3164706e",
  "expires_at": "2026-10-29T14:35:08.405972283Z",
  "resend_available_at": "2026-10-29T14:30:09.405972283Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "411036",
  "sent_at": "2026-10-29T14:30:08.408604258Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "155b7c2a-5945-469b-afa4-9d5b3164706e",
  "code": "411036",
  "device_ref": "sandbox-16343"
}
```

```json
{
  "session_id": "5fffe62b-470b-401c-93e4-df90f56b6d5b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTEwOCwiaWF0IjoxNzkzMjg0MjA4LCJqdGkiOiIwNzZmOWMyNy1hODhjLTQyNjUtYWM4ZS0wYjJhZjM4NTkwMzAiLCJzaWQiOiI1ZmZmZTYyYi00NzBiLTQwMWMtOTNlNC1kZjkwZjU2YjZkNWIifQ.pkUOd5ATEbBR3bNCrJu9aOFjrhHRyhVl1B8a7xwpJgk",
  "access_expires_at": "2026-10-29T14:45:08.722938784Z",
  "refresh_token": "kdf-gNOY8dAVlJ82PhyYLzrESstRF_nPff_ZJ-kglQw",
  "refresh_expires_at": "2026-11-28T14:30:08.722144829Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cb290d9f-a233-4828-b465-bac63d13237b",
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
  "last_heartbeat_at": "2026-10-29T14:29:56.23099Z",
  "last_location_at": "2026-10-29T14:29:56.23099Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cb290d9f-a233-4828-b465-bac63d13237b/handover` → **200**

```json
{
  "command_id": "120a08dc-33e8-4e12-ade6-44cfae2f9d47",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cb290d9f-a233-4828-b465-bac63d13237b",
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
  "last_heartbeat_at": "2026-10-29T14:29:56.23099Z",
  "last_location_at": "2026-10-29T14:29:56.23099Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cb290d9f-a233-4828-b465-bac63d13237b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:30:09Z",
    "sequence": 1793284209560
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cb290d9f-a233-4828-b465-bac63d13237b",
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
  "last_heartbeat_at": "2026-10-29T14:30:09.579307Z",
  "last_location_at": "2026-10-29T14:30:09.579307Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666621584",
  "device_ref": "sandbox-31284"
}
```

```json
{
  "challenge_id": "4dd59fce-df98-42ea-87f3-b8e450e7df91",
  "expires_at": "2026-10-29T14:35:09.861701391Z",
  "resend_available_at": "2026-10-29T14:30:10.861701391Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666621584` → **200**

```json
{
  "phone": "+380666621584",
  "audience": "CLIENT",
  "code": "242071",
  "sent_at": "2026-10-29T14:30:09.864268481Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4dd59fce-df98-42ea-87f3-b8e450e7df91",
  "code": "242071",
  "device_ref": "sandbox-31284"
}
```

```json
{
  "session_id": "6f57f6bf-e1ef-4134-b4f5-c45b8e71b3eb",
  "subject": {
    "type": "CLIENT",
    "id": "ef4d64ff-3c53-4367-8c8d-70e8c022471a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZjRkNjRmZi0zYzUzLTQzNjctOGM4ZC03MGU4YzAyMjQ3MWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MTEwLCJpYXQiOjE3OTMyODQyMTAsImp0aSI6IjMzN2RhN2YyLTIyYmEtNDJiNy1iYmNlLTkzMmUzMWI2OTZlMiIsInNpZCI6IjZmNTdmNmJmLWUxZWYtNDEzNC1iNGY1LWM0NWI4ZTcxYjNlYiJ9.s8lQqLgXodxMjsS05bQg4ITeUz6WTm9JdW1wdablnzg",
  "access_expires_at": "2026-10-29T14:45:10.173510189Z",
  "refresh_token": "Avwv81zdLkWR7wmmnx_GQKlthP6cGK69IkRDMl4MS3c",
  "refresh_expires_at": "2026-11-28T14:30:10.17283562Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "934ded77-4952-4931-9fb9-1b78d81594ad",
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
  "id": "1cefcf3b-f04e-4479-809c-2cd55f847b0f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:35:10.462423Z",
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
  "command_id": "245a859c-1bb4-4a00-940d-62e570adde42",
  "quote_id": "1cefcf3b-f04e-4479-809c-2cd55f847b0f",
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
  "id": "e952a875-b49e-4914-b98e-c2de11ee98d0",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ef4d64ff-3c53-4367-8c8d-70e8c022471a",
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
  "created_at": "2026-10-29T14:30:10.754517Z",
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
    "id": "2097f3d6-7e2b-4708-9e33-d1f8b94365d9",
    "order_id": "e952a875-b49e-4914-b98e-c2de11ee98d0",
    "expires_at": "2026-10-29T14:30:25.757532Z",
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

`POST /api/driver/v1/offers/2097f3d6-7e2b-4708-9e33-d1f8b94365d9/accept` → **200**

```json
{
  "command_id": "b22ffd17-ba40-427e-b179-1c9f49685253"
}
```

```json
{
  "id": "c3b541af-fc32-4971-82e8-fee870b6dce3",
  "order_id": "e952a875-b49e-4914-b98e-c2de11ee98d0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "65faaa73-d5bd-4a68-a807-4b1920b26198",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "65faaa73-d5bd-4a68-a807-4b1920b26198",
  "order_id": "e952a875-b49e-4914-b98e-c2de11ee98d0",
  "assignment_id": "c3b541af-fc32-4971-82e8-fee870b6dce3",
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

`POST /api/driver/v1/work-sessions/cb290d9f-a233-4828-b465-bac63d13237b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:30:11Z",
    "sequence": 1793284211855
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cb290d9f-a233-4828-b465-bac63d13237b",
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
  "last_heartbeat_at": "2026-10-29T14:30:11.873835Z",
  "last_location_at": "2026-10-29T14:30:11.873835Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/65faaa73-d5bd-4a68-a807-4b1920b26198/arrive` → **200**

```json
{
  "command_id": "cb83fab5-8084-4698-b59e-5fff47f11959",
  "expected_version": 0
}
```

```json
{
  "id": "65faaa73-d5bd-4a68-a807-4b1920b26198",
  "order_id": "e952a875-b49e-4914-b98e-c2de11ee98d0",
  "assignment_id": "c3b541af-fc32-4971-82e8-fee870b6dce3",
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
  "arrived_at": "2026-10-29T14:30:12.168776Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/65faaa73-d5bd-4a68-a807-4b1920b26198/start` → **200**

```json
{
  "command_id": "2e543a2d-e423-41b0-92b9-a50cfcc988a3",
  "expected_version": 1
}
```

```json
{
  "id": "65faaa73-d5bd-4a68-a807-4b1920b26198",
  "order_id": "e952a875-b49e-4914-b98e-c2de11ee98d0",
  "assignment_id": "c3b541af-fc32-4971-82e8-fee870b6dce3",
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
  "arrived_at": "2026-10-29T14:30:12.168776Z",
  "started_at": "2026-10-29T14:30:12.457932Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/cb290d9f-a233-4828-b465-bac63d13237b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:30:12Z",
    "sequence": 1793284212744
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cb290d9f-a233-4828-b465-bac63d13237b",
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
  "last_heartbeat_at": "2026-10-29T14:30:12.762971Z",
  "last_location_at": "2026-10-29T14:30:12.762971Z",
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
  "device_ref": "sandbox-7032"
}
```

```json
{
  "challenge_id": "3b8da0c0-4af7-40e7-b35e-1f777937f348",
  "expires_at": "2026-10-29T14:35:13.037492455Z",
  "resend_available_at": "2026-10-29T14:30:14.037492455Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "993527",
  "sent_at": "2026-10-29T14:30:13.040211382Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3b8da0c0-4af7-40e7-b35e-1f777937f348",
  "code": "993527",
  "device_ref": "sandbox-7032"
}
```

```json
{
  "session_id": "25120491-d074-47fd-b0de-561fbdeb5f7e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTExMywiaWF0IjoxNzkzMjg0MjEzLCJqdGkiOiJjZDFiZWQzNy0zZDBlLTQ3ZDUtYjI1NC1iNzVjY2Y0Yjg0NzMiLCJzaWQiOiIyNTEyMDQ5MS1kMDc0LTQ3ZmQtYjBkZS01NjFmYmRlYjVmN2UifQ.SCx_QmYnQpw2Ho3ehTQqJS4ajhjqcBqZgbJpExWSgUw",
  "access_expires_at": "2026-10-29T14:45:13.387394367Z",
  "refresh_token": "9wvl-wGdZ9h9N0lESoNCeiNIkwEsFhJKtJBToOYAdnw",
  "refresh_expires_at": "2026-11-28T14:30:13.386889653Z",
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
  "command_id": "d9480104-d4ca-4960-9234-006ff861f5c5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:30:13Z",
    "sequence": 1793284213959
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "da54a5c7-f670-4564-a11a-046c70bb4640",
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
  "last_heartbeat_at": "2026-10-29T14:30:13.977546Z",
  "last_location_at": "2026-10-29T14:30:13.977546Z",
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
  "session_id": "ad5f5b22-2a5f-4336-a734-f9df481f5665",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxMTQsImlhdCI6MTc5MzI4NDIxNCwianRpIjoiOWQxNmY5YzMtZDIyNy00MDIzLTg3MTItNzEzMmUyODFiNjViIiwic2lkIjoiYWQ1ZjViMjItMmE1Zi00MzM2LWE3MzQtZjlkZjQ4MWY1NjY1In0.D6ZsH9VpeB23nVFRv7hoPAcWKMJ_z5GhVIAWsCez3gA",
  "access_expires_at": "2026-10-29T14:45:14.55840881Z",
  "refresh_token": "6Tjr8NHJg0iK16ZenhsNOFv3BQ-kipa9ga4KMOUDY64",
  "refresh_expires_at": "2026-10-30T02:30:14.557889288Z",
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
  "session_id": "a52c506b-7339-4c3b-877e-5d06a328a3e8",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxMTUsImlhdCI6MTc5MzI4NDIxNSwianRpIjoiOTczNTlmN2UtMTIxMy00YjBhLTkyOTItYTJiN2U2MTgyYTA5Iiwic2lkIjoiYTUyYzUwNmItNzMzOS00YzNiLTg3N2UtNWQwNmEzMjhhM2U4In0.qz4mpPGPQJ0V4SjAjqSSfJ2t2pZIWCH2lTRa6gADa6w",
  "access_expires_at": "2026-10-29T14:45:15.133606787Z",
  "refresh_token": "RTB7E3LmBXnejg-xE8UOvqw0Kh5TBpNkkBBw91OFIrY",
  "refresh_expires_at": "2026-10-30T02:30:15.132963162Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e952a875-b49e-4914-b98e-c2de11ee98d0` → **200**

```json
{
  "id": "e952a875-b49e-4914-b98e-c2de11ee98d0",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "ef4d64ff-3c53-4367-8c8d-70e8c022471a",
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
    "id": "c3b541af-fc32-4971-82e8-fee870b6dce3",
    "order_id": "e952a875-b49e-4914-b98e-c2de11ee98d0",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "65faaa73-d5bd-4a68-a807-4b1920b26198",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T14:30:10.754517Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e952a875-b49e-4914-b98e-c2de11ee98d0/interrupt` → **200**

```json
{
  "command_id": "9cb83bb4-a09d-4540-9671-0bfff9fa4426",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "e952a875-b49e-4914-b98e-c2de11ee98d0",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "ef4d64ff-3c53-4367-8c8d-70e8c022471a",
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
      "id": "c3b541af-fc32-4971-82e8-fee870b6dce3",
      "order_id": "e952a875-b49e-4914-b98e-c2de11ee98d0",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "65faaa73-d5bd-4a68-a807-4b1920b26198",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T14:30:10.754517Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "85238daa-f073-4084-92f9-1d8f4438b10e",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "ef4d64ff-3c53-4367-8c8d-70e8c022471a",
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
    "id": "cb7d8e0a-0ee5-4726-9dd8-ce338ee97d97",
    "order_id": "85238daa-f073-4084-92f9-1d8f4438b10e",
    "expires_at": "2026-10-29T14:30:30.731993Z",
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

`POST /api/driver/v1/offers/cb7d8e0a-0ee5-4726-9dd8-ce338ee97d97/accept` → **200**

```json
{
  "command_id": "46a78d24-58da-4663-bd4b-2aa8e55b006c"
}
```

```json
{
  "id": "03540da6-0392-4064-a1d0-6a166ff029e5",
  "order_id": "85238daa-f073-4084-92f9-1d8f4438b10e",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2042b0e9-c20a-4314-87b6-1d1f72ed67ec",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2042b0e9-c20a-4314-87b6-1d1f72ed67ec",
  "order_id": "85238daa-f073-4084-92f9-1d8f4438b10e",
  "assignment_id": "03540da6-0392-4064-a1d0-6a166ff029e5",
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
  "session_id": "da54a5c7-f670-4564-a11a-046c70bb4640",
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
  "last_heartbeat_at": "2026-10-29T14:30:13.977546Z",
  "last_location_at": "2026-10-29T14:30:13.977546Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/da54a5c7-f670-4564-a11a-046c70bb4640/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:30:17Z",
    "sequence": 1793284217174
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "da54a5c7-f670-4564-a11a-046c70bb4640",
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
  "last_heartbeat_at": "2026-10-29T14:30:17.192192Z",
  "last_location_at": "2026-10-29T14:30:17.192192Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2042b0e9-c20a-4314-87b6-1d1f72ed67ec/arrive` → **200**

```json
{
  "command_id": "07a7bdbb-6097-4427-bf8e-72c0974c4763",
  "expected_version": 0
}
```

```json
{
  "id": "2042b0e9-c20a-4314-87b6-1d1f72ed67ec",
  "order_id": "85238daa-f073-4084-92f9-1d8f4438b10e",
  "assignment_id": "03540da6-0392-4064-a1d0-6a166ff029e5",
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
  "arrived_at": "2026-10-29T14:30:17.469708Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2042b0e9-c20a-4314-87b6-1d1f72ed67ec/start` → **200**

```json
{
  "command_id": "0b660422-d919-4d19-9708-58d69138954f",
  "expected_version": 1
}
```

```json
{
  "id": "2042b0e9-c20a-4314-87b6-1d1f72ed67ec",
  "order_id": "85238daa-f073-4084-92f9-1d8f4438b10e",
  "assignment_id": "03540da6-0392-4064-a1d0-6a166ff029e5",
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
  "arrived_at": "2026-10-29T14:30:17.469708Z",
  "started_at": "2026-10-29T14:30:17.768926Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2042b0e9-c20a-4314-87b6-1d1f72ed67ec/complete` → **200**

```json
{
  "command_id": "47af2317-992b-489a-b423-17a98b3fcacc",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:30:18Z"
}
```

```json
{
  "id": "2042b0e9-c20a-4314-87b6-1d1f72ed67ec",
  "order_id": "85238daa-f073-4084-92f9-1d8f4438b10e",
  "assignment_id": "03540da6-0392-4064-a1d0-6a166ff029e5",
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
  "arrived_at": "2026-10-29T14:30:17.469708Z",
  "started_at": "2026-10-29T14:30:17.768926Z",
  "completed_at": "2026-10-29T14:30:18.077544Z",
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
    "id": "85238daa-f073-4084-92f9-1d8f4438b10e",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-29T14:30:15.722484Z",
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
    "id": "e952a875-b49e-4914-b98e-c2de11ee98d0",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-29T14:30:10.754517Z",
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
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
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

`GET /api/operator/v1/orders/e952a875-b49e-4914-b98e-c2de11ee98d0/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:30:10.754985Z",
      "actor": {
        "type": "CLIENT",
        "id": "ef4d64ff-3c53-4367-8c8d-70e8c022471a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e952a875-b49e-4914-b98e-c2de11ee98d0",
        "quote_id": "1cefcf3b-f04e-4479-809c-2cd55f847b0f",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "c3eada13-a78f-4d3f-9f0b-ef8ec2993547"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:30:10.756844Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e952a875-b49e-4914-b98e-c2de11ee98d0",
        "attempt_id": "1311d7e2-92c8-4d92-8977-44dfc77b0336",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c3eada13-a78f-4d3f-9f0b-ef8ec2993547"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:30:10.759465Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2097f3d6-7e2b-4708-9e33-d1f8b94365d9",
        "order_id": "e952a875-b49e-4914-b98e-c2de11ee98d0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "c3eada13-a78f-4d3f-9f0b-ef8ec2993547"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T14:30:11.315992Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "2097f3d6-7e2b-4708-9e33-d1f8b94365d9",
        "order_id": "e952a875-b49e-4914-b98e-c2de11ee98d0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "c3b541af-fc32-4971-82e8-fee870b6dce3"
      },
      "correlation_id": "70a59a94-ba23-49f6-80b5-152280200da6"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/85238daa-f073-4084-92f9-1d8f4438b10e/tip` → **200**

```json
{
  "order_id": "85238daa-f073-4084-92f9-1d8f4438b10e",
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
  "available_until": "2026-10-30T14:30:18.077544Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/85238daa-f073-4084-92f9-1d8f4438b10e/tip` → **409**

```json
{
  "command_id": "8a9a19fb-1937-46ad-9161-ac7eca34296d",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/85238daa-f073-4084-92f9-1d8f4438b10e/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d4e165c5-42fe-47f0-b0c1-531975af6dc1"
}
```

Done: interrupted e952a875-b49e-4914-b98e-c2de11ee98d0, follow-up 85238daa-f073-4084-92f9-1d8f4438b10e.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cb290d9f-a233-4828-b465-bac63d13237b",
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
  "last_heartbeat_at": "2026-10-29T14:30:12.762971Z",
  "last_location_at": "2026-10-29T14:30:12.762971Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cb290d9f-a233-4828-b465-bac63d13237b/close` → **200**

```json
{
  "command_id": "c9ade725-ddab-44cb-beb3-42222a833dca",
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
  "session_id": "da54a5c7-f670-4564-a11a-046c70bb4640",
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
  "last_heartbeat_at": "2026-10-29T14:30:17.192192Z",
  "last_location_at": "2026-10-29T14:30:17.192192Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/da54a5c7-f670-4564-a11a-046c70bb4640/close` → **200**

```json
{
  "command_id": "fb8e5601-fabb-4d01-9da1-997d892a68cf",
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
  "session_id": "0b9c3c64-ab4d-491f-8baf-85b67b8fb0b3",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxMjQsImlhdCI6MTc5MzI4NDIyNCwianRpIjoiZWE4ZDNjZGMtNDUwNS00MWRjLWFjOTgtMWY3NjNiNTIwMGFhIiwic2lkIjoiMGI5YzNjNjQtYWI0ZC00OTFmLThiYWYtODViNjdiOGZiMGIzIn0.37_9VJARxnIAiNqT2HHnx-pVMiNARlP4jhoD-u9YKWE",
  "access_expires_at": "2026-10-29T14:45:24.296338215Z",
  "refresh_token": "ZwcJNh7_SHoh4Qcv1LQwPpXAsE4QWvs9p8SvBSr8NlA",
  "refresh_expires_at": "2026-10-30T02:30:24.295330355Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "d005746e-d142-4ab9-bb3a-2fa5110458e5",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:30:24Z"
}
```

```json
{
  "id": "ce61695b-918d-4fb7-9c94-6837a5440f1e",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:30:24Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/ce61695b-918d-4fb7-9c94-6837a5440f1e/publish` → **200**

```json
{
  "command_id": "ac6cceb7-7c16-49a0-a402-3edf3671cfe8",
  "expected_version": 0
}
```

```json
{
  "id": "ce61695b-918d-4fb7-9c94-6837a5440f1e",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:30:24.89432Z",
  "published_at": "2026-10-29T14:30:24.89432Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "ce61695b-918d-4fb7-9c94-6837a5440f1e",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T14:30:24.89432Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637379038",
  "device_ref": "sandbox-21537"
}
```

```json
{
  "challenge_id": "97e34a6e-06a7-459f-bd24-e76317ecda9d",
  "expires_at": "2026-10-29T14:35:25.467837901Z",
  "resend_available_at": "2026-10-29T14:30:26.467837901Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637379038` → **200**

```json
{
  "phone": "+380637379038",
  "audience": "CLIENT",
  "code": "644424",
  "sent_at": "2026-10-29T14:30:25.471283465Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "97e34a6e-06a7-459f-bd24-e76317ecda9d",
  "code": "644424",
  "device_ref": "sandbox-21537"
}
```

```json
{
  "session_id": "2f51e4fd-b178-4b63-af49-efb04cbadfdb",
  "subject": {
    "type": "CLIENT",
    "id": "a23dc46f-1278-4df9-acb2-06f4c6cc9138"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjNkYzQ2Zi0xMjc4LTRkZjktYWNiMi0wNmY0YzZjYzkxMzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MTI1LCJpYXQiOjE3OTMyODQyMjUsImp0aSI6ImQ2NTZmZWY4LTg1MDEtNDczOC1hZWFkLTEyYTA5NDU1ODA0MSIsInNpZCI6IjJmNTFlNGZkLWIxNzgtNGI2My1hZjQ5LWVmYjA0Y2JhZGZkYiJ9.prWTjtdcGsX6O-jZQgABSDt39pIJ_veVLESMhiRLJ0E",
  "access_expires_at": "2026-10-29T14:45:25.776198694Z",
  "refresh_token": "3Z8Hd4Eh6onUkSO-Ae5r_d2iIUZOCqUlkSCvkW50Jw0",
  "refresh_expires_at": "2026-11-28T14:30:25.77556845Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "ce61695b-918d-4fb7-9c94-6837a5440f1e",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T14:30:24.89432Z",
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
  "command_id": "f8dff394-6118-402a-8f73-4114de9f511c",
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
  "id": "c75fa99b-fe2c-4140-a9e4-da7a8e05520c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:35:26.341149Z",
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
  "command_id": "0d634591-31a2-459f-80bf-76110daab561",
  "quote_id": "c75fa99b-fe2c-4140-a9e4-da7a8e05520c",
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
  "correlation_id": "0be7cfe1-468e-4f5e-a551-0ddd9676ec44"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "44d8fffd-4823-490e-b054-a14418f9da08",
  "version_id": "ce61695b-918d-4fb7-9c94-6837a5440f1e",
  "language": "uk"
}
```

```json
{
  "version_id": "ce61695b-918d-4fb7-9c94-6837a5440f1e",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T14:30:26.926154Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "95bf9c71-de0c-46ba-af0c-0c3541063c82",
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
  "id": "b5cdc705-2926-4385-928b-933c21473b25",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:35:27.212269Z",
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
  "command_id": "68089c2a-74a9-4a8d-8ed3-6274f2eedf71",
  "quote_id": "b5cdc705-2926-4385-928b-933c21473b25",
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
  "id": "a9f63df0-5b94-4823-8d4e-c6e798397f08",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a23dc46f-1278-4df9-acb2-06f4c6cc9138",
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
  "created_at": "2026-10-29T14:30:27.500987Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a9f63df0-5b94-4823-8d4e-c6e798397f08` → **200**

```json
{
  "id": "a9f63df0-5b94-4823-8d4e-c6e798397f08",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a23dc46f-1278-4df9-acb2-06f4c6cc9138",
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
  "created_at": "2026-10-29T14:30:27.500987Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a9f63df0-5b94-4823-8d4e-c6e798397f08/cancel` → **200**

```json
{
  "command_id": "240bcc6c-dd49-4715-bc71-e6ae4bd82309",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a9f63df0-5b94-4823-8d4e-c6e798397f08",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a23dc46f-1278-4df9-acb2-06f4c6cc9138",
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
  "created_at": "2026-10-29T14:30:27.500987Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
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

`POST /api/admin/v1/legal-documents/ce61695b-918d-4fb7-9c94-6837a5440f1e` → **409**

```json
{
  "command_id": "86470b46-53dd-4664-99d4-b3e482f3c0b6",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:30:28Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/ce61695b-918d-4fb7-9c94-6837a5440f1e",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8ff48760-c562-4c30-a126-394bddf40cf0"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "f91e839a-6222-464f-9ede-494c181b8aad",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T14:30:28Z"
}
```

```json
{
  "id": "4b3b0f70-2670-45e2-863b-5a586402f031",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T14:30:28Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/4b3b0f70-2670-45e2-863b-5a586402f031/publish` → **200**

```json
{
  "command_id": "979bfd0d-1793-4631-aff7-b00bb2d7b8e4",
  "expected_version": 0
}
```

```json
{
  "id": "4b3b0f70-2670-45e2-863b-5a586402f031",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T14:30:29.006867Z",
  "published_at": "2026-10-29T14:30:29.006867Z",
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
  "device_ref": "sandbox-27394"
}
```

```json
{
  "challenge_id": "981d59f3-2dbb-4602-8900-3be62bd70a41",
  "expires_at": "2026-10-29T14:35:29.299233414Z",
  "resend_available_at": "2026-10-29T14:30:30.299233414Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "143640",
  "sent_at": "2026-10-29T14:30:29.301750243Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "981d59f3-2dbb-4602-8900-3be62bd70a41",
  "code": "143640",
  "device_ref": "sandbox-27394"
}
```

```json
{
  "session_id": "c43efc46-8e44-41d6-bc6c-d366324d2b5e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTEyOSwiaWF0IjoxNzkzMjg0MjI5LCJqdGkiOiJlMzllNjM1Ni00N2JkLTRjZGUtOTQwNi03NTlmM2YzMThmY2UiLCJzaWQiOiJjNDNlZmM0Ni04ZTQ0LTQxZDYtYmM2Yy1kMzY2MzI0ZDJiNWUifQ.lLEKRC_ipaAY9QE58lxUjs28ZQWq6VPBeVAKIiGaGdE",
  "access_expires_at": "2026-10-29T14:45:29.595727666Z",
  "refresh_token": "IUs6cKfaC5L0qPXGuay_gvLkwYsBeJJOSTEv_Hl-WrA",
  "refresh_expires_at": "2026-11-28T14:30:29.595039338Z",
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
  "command_id": "bea90097-57df-4436-9fa1-999a2001af4f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:30:30Z",
    "sequence": 1793284230151
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "de393a60-e1d6-45f2-ab7a-35a2bbe8b00b",
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
  "last_heartbeat_at": "2026-10-29T14:30:30.16926Z",
  "last_location_at": "2026-10-29T14:30:30.16926Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675985625",
  "device_ref": "sandbox-25323"
}
```

```json
{
  "challenge_id": "59c351f6-b6e7-46d2-bae9-be662f8b7066",
  "expires_at": "2026-10-29T14:35:30.462987173Z",
  "resend_available_at": "2026-10-29T14:30:31.462987173Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675985625` → **200**

```json
{
  "phone": "+380675985625",
  "audience": "CLIENT",
  "code": "919354",
  "sent_at": "2026-10-29T14:30:30.465688645Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "59c351f6-b6e7-46d2-bae9-be662f8b7066",
  "code": "919354",
  "device_ref": "sandbox-25323"
}
```

```json
{
  "session_id": "7fc51491-c108-464d-931d-12c8185f00fb",
  "subject": {
    "type": "CLIENT",
    "id": "26d33efd-faaf-4031-a64e-122903884502"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmQzM2VmZC1mYWFmLTQwMzEtYTY0ZS0xMjI5MDM4ODQ1MDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MTMwLCJpYXQiOjE3OTMyODQyMzAsImp0aSI6ImMxOGI1NWJmLTE4NjAtNDNmZi1hYjYxLTRhODljMjYxYjBlOCIsInNpZCI6IjdmYzUxNDkxLWMxMDgtNDY0ZC05MzFkLTEyYzgxODVmMDBmYiJ9.z8naN5XlwolTqHZtWjecunxc-wCSksTPMyKrWKRdUcU",
  "access_expires_at": "2026-10-29T14:45:30.781948899Z",
  "refresh_token": "71PYlWz55MvG6mtltU9muDBojSoUzGdlYsLAiKobd2k",
  "refresh_expires_at": "2026-11-28T14:30:30.781164895Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a016d40d-a3bc-4f34-99bb-fe9048b60fdc",
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
  "id": "b48e348a-864b-455d-be02-b382b25fe029",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:35:31.076921Z",
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
  "command_id": "639d5301-697b-48be-9a06-54972035a14f",
  "quote_id": "b48e348a-864b-455d-be02-b382b25fe029",
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
    "phone": "+380679164680"
  }
}
```

```json
{
  "id": "97213d98-dc00-4539-b1f7-3f1d52c73b06",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26d33efd-faaf-4031-a64e-122903884502",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:30:31.365142Z",
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
    "id": "3ed6fdee-1ea3-4b7a-98da-110d5ac6ca6b",
    "order_id": "97213d98-dc00-4539-b1f7-3f1d52c73b06",
    "expires_at": "2026-10-29T14:30:46.368519Z",
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

`POST /api/driver/v1/offers/3ed6fdee-1ea3-4b7a-98da-110d5ac6ca6b/accept` → **200**

```json
{
  "command_id": "50411b9e-a81b-440b-950b-03656705d22a"
}
```

```json
{
  "id": "727d372f-aa90-4437-a2ed-4fab7722bd41",
  "order_id": "97213d98-dc00-4539-b1f7-3f1d52c73b06",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c026ed7e-8871-42f8-b88f-9ca50b29252d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c026ed7e-8871-42f8-b88f-9ca50b29252d",
  "order_id": "97213d98-dc00-4539-b1f7-3f1d52c73b06",
  "assignment_id": "727d372f-aa90-4437-a2ed-4fab7722bd41",
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
    "phone": "+380679164680"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9cbfde44-a70a-4056-a5d0-1ad3bc64fea5",
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
  "id": "0fea818d-0de4-487b-83a7-6d368925a327",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:35:32.545875Z",
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
  "command_id": "e427f90f-96c3-4f7b-80ce-e78624bfe9ee",
  "quote_id": "0fea818d-0de4-487b-83a7-6d368925a327",
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
  "id": "d14557a0-1329-46bf-a2e5-59500d46950e",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26d33efd-faaf-4031-a64e-122903884502",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:30:32.841813Z",
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
  "command_id": "7735c6f6-f49f-4548-9cc7-b5a8871e2ce9",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T17:30:33Z"
}
```

```json
{
  "id": "74777871-3a92-4673-8c9b-efb88213bef3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:35:33.145203Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T17:30:33Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b5d54ccf-7802-4508-8e22-b73d5f964cdd",
  "quote_id": "74777871-3a92-4673-8c9b-efb88213bef3",
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
  "pickup_at": "2026-10-29T17:30:33Z"
}
```

```json
{
  "id": "b921861c-2763-4da3-a9a0-72d8bd665ebc",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "26d33efd-faaf-4031-a64e-122903884502",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T14:30:33.436556Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T17:30:33Z",
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
  "command_id": "65451693-995b-471d-92e8-810c383ac205",
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
  "id": "2b5b12ef-99c3-4846-9156-f9ee5e87801d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:35:33.744773Z",
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
  "command_id": "3013373c-f69e-4eed-8afb-6d5accfae5aa",
  "quote_id": "2b5b12ef-99c3-4846-9156-f9ee5e87801d",
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
  "correlation_id": "2673ceac-48e5-476a-88c4-f005b91ea9ac"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "b921861c-2763-4da3-a9a0-72d8bd665ebc",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "26d33efd-faaf-4031-a64e-122903884502",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T14:30:33.436556Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T17:30:33Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "d14557a0-1329-46bf-a2e5-59500d46950e",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "26d33efd-faaf-4031-a64e-122903884502",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-29T14:30:32.841813Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "97213d98-dc00-4539-b1f7-3f1d52c73b06",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "d14557a0-1329-46bf-a2e5-59500d46950e",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26d33efd-faaf-4031-a64e-122903884502",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:30:32.841813Z",
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

`GET /api/rider/v1/orders/97213d98-dc00-4539-b1f7-3f1d52c73b06` → **200**

```json
{
  "id": "97213d98-dc00-4539-b1f7-3f1d52c73b06",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "26d33efd-faaf-4031-a64e-122903884502",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "727d372f-aa90-4437-a2ed-4fab7722bd41",
    "order_id": "97213d98-dc00-4539-b1f7-3f1d52c73b06",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "c026ed7e-8871-42f8-b88f-9ca50b29252d",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T14:30:31.365142Z",
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
    "location_at": "2026-10-29T14:30:30.16926Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/97213d98-dc00-4539-b1f7-3f1d52c73b06/cancel` → **200**

```json
{
  "command_id": "a607ffd0-8b77-4fd1-946b-79915edf5031",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "97213d98-dc00-4539-b1f7-3f1d52c73b06",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "26d33efd-faaf-4031-a64e-122903884502",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "727d372f-aa90-4437-a2ed-4fab7722bd41",
    "order_id": "97213d98-dc00-4539-b1f7-3f1d52c73b06",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "c026ed7e-8871-42f8-b88f-9ca50b29252d",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T14:30:31.365142Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
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

`GET /api/rider/v1/orders/d14557a0-1329-46bf-a2e5-59500d46950e` → **200**

```json
{
  "id": "d14557a0-1329-46bf-a2e5-59500d46950e",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26d33efd-faaf-4031-a64e-122903884502",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:30:32.841813Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d14557a0-1329-46bf-a2e5-59500d46950e/cancel` → **200**

```json
{
  "command_id": "c4d3faaa-ae2d-4cc8-9b2c-94dd036d4bcc",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d14557a0-1329-46bf-a2e5-59500d46950e",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "26d33efd-faaf-4031-a64e-122903884502",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:30:32.841813Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
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

`GET /api/rider/v1/orders/b921861c-2763-4da3-a9a0-72d8bd665ebc` → **200**

```json
{
  "id": "b921861c-2763-4da3-a9a0-72d8bd665ebc",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "26d33efd-faaf-4031-a64e-122903884502",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T14:30:33.436556Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T17:30:33Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b921861c-2763-4da3-a9a0-72d8bd665ebc/cancel` → **200**

```json
{
  "command_id": "f1cf356d-bcd0-419d-bf3f-94beabdcb453",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b921861c-2763-4da3-a9a0-72d8bd665ebc",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "26d33efd-faaf-4031-a64e-122903884502",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T14:30:33.436556Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
    }
  },
  "pickup_at": "2026-10-29T17:30:33Z",
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
  "session_id": "de393a60-e1d6-45f2-ab7a-35a2bbe8b00b",
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
  "last_heartbeat_at": "2026-10-29T14:30:30.16926Z",
  "last_location_at": "2026-10-29T14:30:30.16926Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/de393a60-e1d6-45f2-ab7a-35a2bbe8b00b/close` → **200**

```json
{
  "command_id": "ec778d09-9d52-47e3-91ab-44e6bd8e269f",
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

Done: orders 97213d98-dc00-4539-b1f7-3f1d52c73b06, d14557a0-1329-46bf-a2e5-59500d46950e, b921861c-2763-4da3-a9a0-72d8bd665ebc.

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
  "session_id": "4da24735-2e89-4a15-b1e7-d5ce17b3ddf1",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxMzcsImlhdCI6MTc5MzI4NDIzNywianRpIjoiNmI2NDZkNmItZTFjNS00NjI5LTlmM2ItMzJiZmVjZWUwMjExIiwic2lkIjoiNGRhMjQ3MzUtMmU4OS00YTE1LWIxZTctZDVjZTE3YjNkZGYxIn0.4-JCSA4yjNs6dohD9V1ZyTTwc7qSOCF6W4P3LRK_GRo",
  "access_expires_at": "2026-10-29T14:45:37.549125541Z",
  "refresh_token": "ST7pvDgp-xRxSM5eHFwVqYE7sr-8S4gfq2Qqj_-AIVI",
  "refresh_expires_at": "2026-10-30T02:30:37.548506342Z",
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
  "session_id": "1a5a024a-1e87-4d0e-88a5-94ed072c4d9e",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxMzgsImlhdCI6MTc5MzI4NDIzOCwianRpIjoiNjNmYzAwMDYtMzk2ZC00NGJlLTk1ZWItZDU0ZTlkMjIyZGNkIiwic2lkIjoiMWE1YTAyNGEtMWU4Ny00ZDBlLTg4YTUtOTRlZDA3MmM0ZDllIn0.KoFhhdHUdigFyRCDvZr_aMLIHaOOk58ZtmKyKjkvqvk",
  "access_expires_at": "2026-10-29T14:45:38.12271552Z",
  "refresh_token": "KfOOEWmk4lmJuvMGP7LTwwQBM6doBwBIF18zyChIX5Y",
  "refresh_expires_at": "2026-10-30T02:30:38.122127019Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21435"
}
```

```json
{
  "challenge_id": "5abf7915-3c9b-4e8d-a980-dc00bad07712",
  "expires_at": "2026-10-29T14:35:38.397065841Z",
  "resend_available_at": "2026-10-29T14:30:39.397065841Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "087790",
  "sent_at": "2026-10-29T14:30:38.399917874Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5abf7915-3c9b-4e8d-a980-dc00bad07712",
  "code": "087790",
  "device_ref": "sandbox-21435"
}
```

```json
{
  "session_id": "215f8366-650b-4b83-a977-18f2ca265862",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTEzOCwiaWF0IjoxNzkzMjg0MjM4LCJqdGkiOiJiYzFjZTJmOC1kOTE0LTRjY2ItYWEwNC1mMjQ0ODgwZjQwZGEiLCJzaWQiOiIyMTVmODM2Ni02NTBiLTRiODMtYTk3Ny0xOGYyY2EyNjU4NjIifQ.WtJmzZVYJRFkjKHe4drn9M0J6AeZtYMa29ql6axZ86w",
  "access_expires_at": "2026-10-29T14:45:38.709330483Z",
  "refresh_token": "MadbQ4c76aDVCWq28PTlZGTuuvahKTz135bMPTCDHSo",
  "refresh_expires_at": "2026-11-28T14:30:38.70877839Z",
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
  "command_id": "9b29f23e-a478-4d4c-be2b-31a8f930f394",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:30:39Z",
    "sequence": 1793284239293
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "525f815c-97ab-4dd6-ad77-041e1963612f",
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
  "last_heartbeat_at": "2026-10-29T14:30:39.311329Z",
  "last_location_at": "2026-10-29T14:30:39.311329Z",
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
  "command_id": "2117892c-2693-4b1a-ae7a-bbdb9b128e57",
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
  "effective_at": "2026-10-29T14:30:39.892571Z",
  "changed_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T14:28:00.867576Z",
  "last_entries": [
    {
      "order_id": "d59efb03-9e53-490b-b1d0-cf3e4d35fb81",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T14:28:00.867576Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "5190fd02-aa81-4408-8134-f155aa6e0a11",
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
  "id": "2b9fa5b4-6a3a-4ef7-b47a-ad6bc6d15671",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:35:40.457503Z",
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
  "command_id": "c89a3ce1-2bca-45b3-8402-42dc946abcce",
  "quote_id": "2b9fa5b4-6a3a-4ef7-b47a-ad6bc6d15671",
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
    "phone": "+3806711116950"
  }
}
```

```json
{
  "id": "b566d5b9-671d-4612-8a5c-ccdbcbfea277",
  "short_number": 21,
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
  "created_at": "2026-10-29T14:30:40.746987Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711116950"
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
    "id": "4c8d464f-6248-47e0-bd4f-834ff6207ea5",
    "order_id": "b566d5b9-671d-4612-8a5c-ccdbcbfea277",
    "expires_at": "2026-10-29T14:30:55.75129Z",
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

`POST /api/driver/v1/offers/4c8d464f-6248-47e0-bd4f-834ff6207ea5/accept` → **200**

```json
{
  "command_id": "e75c411f-d066-4c61-851f-01913980127e"
}
```

```json
{
  "id": "eb818462-6a98-4d19-b111-e339401c16c1",
  "order_id": "b566d5b9-671d-4612-8a5c-ccdbcbfea277",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3ce32dd3-c096-414b-9a3c-3f971118ab1d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3ce32dd3-c096-414b-9a3c-3f971118ab1d",
  "order_id": "b566d5b9-671d-4612-8a5c-ccdbcbfea277",
  "assignment_id": "eb818462-6a98-4d19-b111-e339401c16c1",
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
    "phone": "+3806711116950"
  }
}
```

`POST /api/driver/v1/work-sessions/525f815c-97ab-4dd6-ad77-041e1963612f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:30:41Z",
    "sequence": 1793284241892
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "525f815c-97ab-4dd6-ad77-041e1963612f",
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
  "last_heartbeat_at": "2026-10-29T14:30:41.909951Z",
  "last_location_at": "2026-10-29T14:30:41.909951Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3ce32dd3-c096-414b-9a3c-3f971118ab1d/arrive` → **200**

```json
{
  "command_id": "d8b0f97c-8342-4149-bee9-b4905bd17b20",
  "expected_version": 0
}
```

```json
{
  "id": "3ce32dd3-c096-414b-9a3c-3f971118ab1d",
  "order_id": "b566d5b9-671d-4612-8a5c-ccdbcbfea277",
  "assignment_id": "eb818462-6a98-4d19-b111-e339401c16c1",
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
  "arrived_at": "2026-10-29T14:30:42.188986Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711116950"
  }
}
```

`POST /api/driver/v1/trips/3ce32dd3-c096-414b-9a3c-3f971118ab1d/start` → **200**

```json
{
  "command_id": "4601c3c2-0f9b-4485-9e40-ca230e9a1c6d",
  "expected_version": 1
}
```

```json
{
  "id": "3ce32dd3-c096-414b-9a3c-3f971118ab1d",
  "order_id": "b566d5b9-671d-4612-8a5c-ccdbcbfea277",
  "assignment_id": "eb818462-6a98-4d19-b111-e339401c16c1",
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
  "arrived_at": "2026-10-29T14:30:42.188986Z",
  "started_at": "2026-10-29T14:30:42.471381Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711116950"
  }
}
```

`POST /api/driver/v1/trips/3ce32dd3-c096-414b-9a3c-3f971118ab1d/complete` → **200**

```json
{
  "command_id": "d61a9c25-ab28-4056-84f9-9f1704d98952",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:30:42Z",
  "cash_received": true
}
```

```json
{
  "id": "3ce32dd3-c096-414b-9a3c-3f971118ab1d",
  "order_id": "b566d5b9-671d-4612-8a5c-ccdbcbfea277",
  "assignment_id": "eb818462-6a98-4d19-b111-e339401c16c1",
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
  "arrived_at": "2026-10-29T14:30:42.188986Z",
  "started_at": "2026-10-29T14:30:42.471381Z",
  "completed_at": "2026-10-29T14:30:42.769548Z",
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
  "command_id": "196a3c19-8569-4a29-8b03-7ea166b30904",
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
  "id": "5630a9a0-5c1a-42fb-b1d1-a9000ec42c02",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:35:43.063912Z",
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
  "command_id": "6b81b97e-29c0-4ca8-a632-1c2da0d052c8",
  "quote_id": "5630a9a0-5c1a-42fb-b1d1-a9000ec42c02",
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
    "phone": "+3806711130663"
  }
}
```

```json
{
  "id": "0d397030-eb09-400f-ba9d-c5a1ea2a1382",
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
  "created_at": "2026-10-29T14:30:43.373167Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711130663"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/0d397030-eb09-400f-ba9d-c5a1ea2a1382` → **200**

```json
{
  "id": "0d397030-eb09-400f-ba9d-c5a1ea2a1382",
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
  "created_at": "2026-10-29T14:30:43.373167Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711130663"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0d397030-eb09-400f-ba9d-c5a1ea2a1382/cancel` → **200**

```json
{
  "command_id": "16e8912e-3af6-4106-a7b3-6ad2e207dcf5",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "0d397030-eb09-400f-ba9d-c5a1ea2a1382",
  "short_number": 22,
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
  "created_at": "2026-10-29T14:30:43.373167Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711130663"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "pl": "Błąd operatora",
      "ru": "Ошибка оператора",
      "en": "Operator error",
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
  "staff_id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T14:28:00.867576Z",
  "last_entries": [
    {
      "order_id": "0d397030-eb09-400f-ba9d-c5a1ea2a1382",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T14:30:43.991291Z"
    },
    {
      "order_id": "b566d5b9-671d-4612-8a5c-ccdbcbfea277",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T14:30:42.774436Z"
    },
    {
      "order_id": "d59efb03-9e53-490b-b1d0-cf3e4d35fb81",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T14:28:00.867576Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "525f815c-97ab-4dd6-ad77-041e1963612f",
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
  "last_heartbeat_at": "2026-10-29T14:30:41.909951Z",
  "last_location_at": "2026-10-29T14:30:41.909951Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/525f815c-97ab-4dd6-ad77-041e1963612f/close` → **200**

```json
{
  "command_id": "fac85c41-fefc-485f-baf6-a9b48004d0aa",
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

Done: operator bonus for fulfilled b566d5b9-671d-4612-8a5c-ccdbcbfea277 and operator-fault cancellation 0d397030-eb09-400f-ba9d-c5a1ea2a1382.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670776821",
  "device_ref": "sandbox-2373"
}
```

```json
{
  "challenge_id": "32c968fb-f8e9-462b-85f1-62f7778edfbb",
  "expires_at": "2026-10-29T14:35:48.396078355Z",
  "resend_available_at": "2026-10-29T14:30:49.396078355Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670776821` → **200**

```json
{
  "phone": "+380670776821",
  "audience": "CLIENT",
  "code": "542775",
  "sent_at": "2026-10-29T14:30:48.398696231Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676634200",
  "device_ref": "sandbox-20747",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "4af2558e-f9ff-46b9-93e6-7e4d412fac0d",
  "expires_at": "2026-10-29T14:35:49.912858326Z",
  "resend_available_at": "2026-10-29T14:30:50.912858326Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676634200` → **200**

```json
{
  "phone": "+380676634200",
  "audience": "CLIENT",
  "code": "138781",
  "sent_at": "2026-10-29T14:30:49.915237056Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676634200",
  "device_ref": "sandbox-12438",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "a784fc58-63cf-4993-937f-b230dea83008",
  "expires_at": "2026-10-29T14:35:51.419508556Z",
  "resend_available_at": "2026-10-29T14:30:52.419508556Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380676634200` → **200**

```json
{
  "phone": "+380676634200",
  "audience": "CLIENT",
  "code": "922180",
  "sent_at": "2026-10-29T14:30:51.422369801Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676600000",
  "device_ref": "sandbox-22087"
}
```

```json
{
  "challenge_id": "c126a2e2-48d8-49b3-997b-512a19d9f1c4",
  "expires_at": "2026-10-29T14:35:52.943000612Z",
  "resend_available_at": "2026-10-29T14:30:53.943000612Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676600000",
  "device_ref": "sandbox-11746"
}
```

```json
{
  "challenge_id": "40d75922-ac08-4fd5-adff-a98ed4ac57e1",
  "expires_at": "2026-10-29T14:35:54.452232838Z",
  "resend_available_at": "2026-10-29T14:30:55.452232838Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380676600000` → **200**

```json
{
  "phone": "+380676600000",
  "audience": "CLIENT",
  "code": "835755",
  "sent_at": "2026-10-29T14:30:54.455109272Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676600000",
  "device_ref": "sandbox-24334",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "187155a1-8c0d-4342-90c8-84d5606839cd",
  "expires_at": "2026-10-29T14:35:55.955000432Z",
  "resend_available_at": "2026-10-29T14:30:56.955000432Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380676600000` → **200**

```json
{
  "phone": "+380676600000",
  "audience": "CLIENT",
  "code": "995287",
  "sent_at": "2026-10-29T14:30:55.957638369Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380676600000",
  "device_ref": "sandbox-4656",
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
  "correlation_id": "ebcdc80f-a2d9-494c-a4f5-ac39e4450171",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000008219"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "a4b66916-4446-4f33-9955-bec023ed219a"
}
```

`GET /sandbox/v1/otp?phone=%2B442000008219` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120001753"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "c3fa28c4-f192-438b-bd60-eb78e0db5a20"
}
```

`GET /sandbox/v1/otp?phone=%2B37120001753` → **404**

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
  "session_id": "0a30ea75-6f9a-4a44-bd5c-2e3cb9077f9c",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxNTgsImlhdCI6MTc5MzI4NDI1OCwianRpIjoiNjA4YjJkMzAtYTM2ZC00NGI3LThjNWItYjU0YTRjM2ZlMWEwIiwic2lkIjoiMGEzMGVhNzUtNmY5YS00YTQ0LWJkNWMtMmUzY2I5MDc3ZjljIn0.v8j33lVqsQx1pJU2IwgpTKgdChw74kzLaVn14Y5VaL0",
  "access_expires_at": "2026-10-29T14:45:58.668570399Z",
  "refresh_token": "7nyz2DEc0GXNm2VwzKU3CalgxikCkdahJ25xchB35KE",
  "refresh_expires_at": "2026-10-30T02:30:58.668031621Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676600000` → **200**

```json
{
  "deliveries": [
    {
      "id": "1cb7a8f0-59d0-467c-891a-903f5e4ba439",
      "challenge_id": "187155a1-8c0d-4342-90c8-84d5606839cd",
      "phone": "+380676600000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-39d30159-1b3d-46b4-bfd0-5a3bc00d7c76",
      "error": null,
      "attempted_at": "2026-10-29T14:30:55.957874Z"
    },
    {
      "id": "bfdadb93-f401-4d9a-a7b5-1c59ee97a674",
      "challenge_id": "40d75922-ac08-4fd5-adff-a98ed4ac57e1",
      "phone": "+380676600000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-d960faad-00e0-496d-bc71-365b0903aea2",
      "error": null,
      "attempted_at": "2026-10-29T14:30:54.455578Z"
    },
    {
      "id": "bce00fea-2a22-4877-9f1f-7ac81133e3a0",
      "challenge_id": "c126a2e2-48d8-49b3-997b-512a19d9f1c4",
      "phone": "+380676600000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T14:30:52.945802Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380676600000` → **200**

```json
{
  "phone": "+380676600000",
  "audience": "CLIENT",
  "code": "995287",
  "sent_at": "2026-10-29T14:30:55.957638369Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676634200` → **200**

```json
{
  "deliveries": [
    {
      "id": "4ceb5fdc-038b-45f3-b67d-8df757b690ac",
      "challenge_id": "a784fc58-63cf-4993-937f-b230dea83008",
      "phone": "+380676634200",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-dcc6dd6a-fa4c-4079-af18-be179fb6e6b9",
      "error": null,
      "attempted_at": "2026-10-29T14:30:51.422834Z"
    },
    {
      "id": "1918ad23-4626-4c1e-800b-07b7e5a95794",
      "challenge_id": "4af2558e-f9ff-46b9-93e6-7e4d412fac0d",
      "phone": "+380676634200",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-83e17169-dbfb-4272-b2bb-b5058a0eacaf",
      "error": null,
      "attempted_at": "2026-10-29T14:30:49.915519Z"
    }
  ]
}
```

Done: SMS to +380670776821; SMS then a call to +380676634200; a failed SMS, two calls and a refused third to +380676600000; +44 and +371 refused.

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
  "session_id": "3ad82e97-da61-4618-b975-8e45bc36d1e7",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxNTksImlhdCI6MTc5MzI4NDI1OSwianRpIjoiYmI0YjlkMTMtMWE2Ni00ZjI0LWFjOTctZjgzMTk1MTAwYWExIiwic2lkIjoiM2FkODJlOTctZGE2MS00NjE4LWI5NzUtOGU0NWJjMzZkMWU3In0.0psu_zZBOtB5CmQKUW-yVSYWHoIG9u2SrBG_dDD7D64",
  "access_expires_at": "2026-10-29T14:45:59.836404615Z",
  "refresh_token": "uoQXmhM4_QxcVHiS11ShggRXKXNi_nr-1fxLonY6oF8",
  "refresh_expires_at": "2026-10-30T02:30:59.835644973Z",
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
  "session_id": "184c0529-fc55-46e2-891c-316eb6d52771",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxNjAsImlhdCI6MTc5MzI4NDI2MCwianRpIjoiNmQ1NmQ0ZDAtOTdmNy00M2E1LTg1YjMtNzJkNDkyMzI4NDRiIiwic2lkIjoiMTg0YzA1MjktZmM1NS00NmUyLTg5MWMtMzE2ZWI2ZDUyNzcxIn0.Dv7Lf2yIPNcKvprwK5frAazPy9Z-PWYvy2fXET9aA9E",
  "access_expires_at": "2026-10-29T14:46:00.396310526Z",
  "refresh_token": "yHxzfEQzLGjA6YJrxjhaB5RN9Ofs-7MgYOJP_OJ5N_Q",
  "refresh_expires_at": "2026-10-30T02:31:00.39581023Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
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

`POST /api/admin/v1/staff-extensions/d6d4f7e4-3042-463b-973a-b3447e4ed45a` → **200**

```json
{
  "command_id": "0d49b3e0-16a1-4ab1-9bdf-af786b2641e3",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "01607fce-2e83-4453-8df3-250d08fdbb8e",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T14:31:01.518612Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T14:31:01.518612Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "25bec17a-4707-4e36-b206-ee1f7c1fd517",
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
  "id": "4905eb57-439c-4aab-b559-a441389b76ee",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:36:02.072147Z",
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
  "command_id": "565d4c8d-b35d-4cd7-8709-b7e62fdff457",
  "quote_id": "4905eb57-439c-4aab-b559-a441389b76ee",
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
    "phone": "+380670998367"
  }
}
```

```json
{
  "id": "e8f45eb9-af55-48df-bde8-7c576a22f5f9",
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
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:02.354488Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670998367"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/e8f45eb9-af55-48df-bde8-7c576a22f5f9/calls` → **201**

```json
{
  "command_id": "7786d717-3f76-4144-91f1-c964b089d457",
  "to": "CALLER"
}
```

```json
{
  "id": "d06002ca-af08-4fb6-b0f0-b9dbf29538e3",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
  "order_ids": [
    "e8f45eb9-af55-48df-bde8-7c576a22f5f9"
  ],
  "started_at": "2026-10-29T14:31:02.674171Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/e8f45eb9-af55-48df-bde8-7c576a22f5f9/calls` → **201**

```json
{
  "command_id": "7786d717-3f76-4144-91f1-c964b089d457",
  "to": "CALLER"
}
```

```json
{
  "id": "d06002ca-af08-4fb6-b0f0-b9dbf29538e3",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
  "order_ids": [
    "e8f45eb9-af55-48df-bde8-7c576a22f5f9"
  ],
  "started_at": "2026-10-29T14:31:02.674171Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "d06002ca-af08-4fb6-b0f0-b9dbf29538e3",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380670998367",
    "at": "2026-10-29T14:31:02.676464954Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "d06002ca-af08-4fb6-b0f0-b9dbf29538e3",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.8918",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "d06002ca-af08-4fb6-b0f0-b9dbf29538e3"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "d06002ca-af08-4fb6-b0f0-b9dbf29538e3",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=e8f45eb9-af55-48df-bde8-7c576a22f5f9` → **200**

```json
{
  "calls": [
    {
      "id": "d06002ca-af08-4fb6-b0f0-b9dbf29538e3",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
      "order_ids": [
        "e8f45eb9-af55-48df-bde8-7c576a22f5f9"
      ],
      "started_at": "2026-10-29T14:31:02.674171Z",
      "answered_at": "2026-10-29T14:31:03.326154Z",
      "ended_at": "2026-10-29T14:31:03.3463Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=e8f45eb9-af55-48df-bde8-7c576a22f5f9` → **200**

```json
{
  "calls": [
    {
      "id": "d06002ca-af08-4fb6-b0f0-b9dbf29538e3",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
      "order_ids": [
        "e8f45eb9-af55-48df-bde8-7c576a22f5f9"
      ],
      "started_at": "2026-10-29T14:31:02.674171Z",
      "answered_at": "2026-10-29T14:31:03.326154Z",
      "ended_at": "2026-10-29T14:31:03.3463Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=e8f45eb9-af55-48df-bde8-7c576a22f5f9` → **200**

```json
{
  "calls": [
    {
      "id": "d06002ca-af08-4fb6-b0f0-b9dbf29538e3",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
      "order_ids": [
        "e8f45eb9-af55-48df-bde8-7c576a22f5f9"
      ],
      "started_at": "2026-10-29T14:31:02.674171Z",
      "answered_at": "2026-10-29T14:31:03.326154Z",
      "ended_at": "2026-10-29T14:31:03.3463Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=e8f45eb9-af55-48df-bde8-7c576a22f5f9` → **200**

```json
{
  "calls": [
    {
      "id": "d06002ca-af08-4fb6-b0f0-b9dbf29538e3",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
      "order_ids": [
        "e8f45eb9-af55-48df-bde8-7c576a22f5f9"
      ],
      "started_at": "2026-10-29T14:31:02.674171Z",
      "answered_at": "2026-10-29T14:31:03.326154Z",
      "ended_at": "2026-10-29T14:31:03.3463Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=e8f45eb9-af55-48df-bde8-7c576a22f5f9` → **200**

```json
{
  "calls": [
    {
      "id": "d06002ca-af08-4fb6-b0f0-b9dbf29538e3",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
      "order_ids": [
        "e8f45eb9-af55-48df-bde8-7c576a22f5f9"
      ],
      "started_at": "2026-10-29T14:31:02.674171Z",
      "answered_at": "2026-10-29T14:31:03.326154Z",
      "ended_at": "2026-10-29T14:31:03.3463Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=e8f45eb9-af55-48df-bde8-7c576a22f5f9` → **200**

```json
{
  "calls": [
    {
      "id": "d06002ca-af08-4fb6-b0f0-b9dbf29538e3",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
      "order_ids": [
        "e8f45eb9-af55-48df-bde8-7c576a22f5f9"
      ],
      "started_at": "2026-10-29T14:31:02.674171Z",
      "answered_at": "2026-10-29T14:31:03.326154Z",
      "ended_at": "2026-10-29T14:31:03.3463Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:31:13.216092Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/e8f45eb9-af55-48df-bde8-7c576a22f5f9` → **200**

```json
{
  "id": "e8f45eb9-af55-48df-bde8-7c576a22f5f9",
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
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:02.354488Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670998367"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e8f45eb9-af55-48df-bde8-7c576a22f5f9/cancel` → **200**

```json
{
  "command_id": "06883d26-96de-4449-ba58-5a3c532d8c84",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "e8f45eb9-af55-48df-bde8-7c576a22f5f9",
  "short_number": 23,
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
  "created_at": "2026-10-29T14:31:02.354488Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670998367"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
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
  "command_id": "0e06ae14-3973-4af8-bde9-8fec7560ac82",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T14:31:15.734786Z",
  "extension": "101"
}
```

Done: outgoing call d06002ca-af08-4fb6-b0f0-b9dbf29538e3 from order e8f45eb9-af55-48df-bde8-7c576a22f5f9, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639702759",
  "device_ref": "sandbox-2802"
}
```

```json
{
  "challenge_id": "d8f7a1fb-4041-48ad-82ee-73d002fec28f",
  "expires_at": "2026-10-29T14:36:16.026531622Z",
  "resend_available_at": "2026-10-29T14:31:17.026531622Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639702759` → **200**

```json
{
  "phone": "+380639702759",
  "audience": "CLIENT",
  "code": "306294",
  "sent_at": "2026-10-29T14:31:16.029234581Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d8f7a1fb-4041-48ad-82ee-73d002fec28f",
  "code": "306294",
  "device_ref": "sandbox-2802"
}
```

```json
{
  "session_id": "4f8397df-e501-4cab-b946-3ebbb5dcd597",
  "subject": {
    "type": "CLIENT",
    "id": "6dde3b6d-aa55-4b01-9a6e-7d181de078d8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZGRlM2I2ZC1hYTU1LTRiMDEtOWE2ZS03ZDE4MWRlMDc4ZDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MTc2LCJpYXQiOjE3OTMyODQyNzYsImp0aSI6IjIzZmU1N2U3LWY2MjItNDZlNC04NTI0LTA3MzY4ZTdhNDE0NSIsInNpZCI6IjRmODM5N2RmLWU1MDEtNGNhYi1iOTQ2LTNlYmJiNWRjZDU5NyJ9.VD8j_H2yVQR_HCaBTpCjPve7KPmpb2ULl4BL1-YqZ5I",
  "access_expires_at": "2026-10-29T14:46:16.336464734Z",
  "refresh_token": "11cPQc2wL1LlqNWwyWcLz-BtCRjCVxHTs64FoPahvsc",
  "refresh_expires_at": "2026-11-28T14:31:16.335935554Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6dde3b6d-aa55-4b01-9a6e-7d181de078d8",
  "session_id": "4f8397df-e501-4cab-b946-3ebbb5dcd597",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639702759",
  "device_ref": "sandbox-21445"
}
```

```json
{
  "challenge_id": "bc70d517-d6e1-4896-b604-66f305b12a40",
  "expires_at": "2026-10-29T14:36:18.882841177Z",
  "resend_available_at": "2026-10-29T14:31:19.882841177Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639702759` → **200**

```json
{
  "phone": "+380639702759",
  "audience": "CLIENT",
  "code": "483009",
  "sent_at": "2026-10-29T14:31:18.885425286Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc70d517-d6e1-4896-b604-66f305b12a40",
  "code": "483009",
  "device_ref": "sandbox-21445"
}
```

```json
{
  "session_id": "ff3c2a15-4ab9-43ad-af46-42ad5065c8d7",
  "subject": {
    "type": "CLIENT",
    "id": "6dde3b6d-aa55-4b01-9a6e-7d181de078d8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZGRlM2I2ZC1hYTU1LTRiMDEtOWE2ZS03ZDE4MWRlMDc4ZDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MTc5LCJpYXQiOjE3OTMyODQyNzksImp0aSI6IjY3N2Y4ZDExLWEzMGYtNGNhZi1hOGQxLWY3OWFjNGM3MmEzZCIsInNpZCI6ImZmM2MyYTE1LTRhYjktNDNhZC1hZjQ2LTQyYWQ1MDY1YzhkNyJ9.EPRztAveeNmSHKa2Qzm3owjSRx7NhaBWLsU3aKD_RYU",
  "access_expires_at": "2026-10-29T14:46:19.191655976Z",
  "refresh_token": "miXKuXnXCvtlgR7rWvgmRH-zDMxYV4qqgsxVFjTz_8w",
  "refresh_expires_at": "2026-11-28T14:31:19.191098392Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "734f1cec-918c-474f-97e5-d34926bbee94",
  "expires_at": "2026-10-29T14:36:21.470151239Z",
  "resend_available_at": "2026-10-29T14:31:22.470151239Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639702759` → **200**

```json
{
  "phone": "+380639702759",
  "audience": "CLIENT",
  "code": "915662",
  "sent_at": "2026-10-29T14:31:21.472499222Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380638087267"
}
```

```json
{
  "challenge_id": "92d8555d-eade-4592-a1b6-43b3b02c3aba",
  "expires_at": "2026-10-29T14:36:21.763989002Z",
  "resend_available_at": "2026-10-29T14:31:22.763989002Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638087267` → **200**

```json
{
  "phone": "+380638087267",
  "audience": "CLIENT",
  "code": "586488",
  "sent_at": "2026-10-29T14:31:21.766432697Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "71d9969c-4dc5-463f-8a71-024ac0c8f768",
  "current_challenge_id": "734f1cec-918c-474f-97e5-d34926bbee94",
  "current_code": "000000",
  "new_challenge_id": "92d8555d-eade-4592-a1b6-43b3b02c3aba",
  "new_code": "586488"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "def69ae8-b09d-4f9a-86b5-831d52b00700"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "79f5de85-ca80-4d85-a39f-7d174d3fec0a",
  "current_challenge_id": "734f1cec-918c-474f-97e5-d34926bbee94",
  "current_code": "915662",
  "new_challenge_id": "92d8555d-eade-4592-a1b6-43b3b02c3aba",
  "new_code": "586488"
}
```

```json
{
  "subject_id": "6dde3b6d-aa55-4b01-9a6e-7d181de078d8",
  "phone": "+380638087267",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6dde3b6d-aa55-4b01-9a6e-7d181de078d8",
  "session_id": "4f8397df-e501-4cab-b946-3ebbb5dcd597",
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
  "correlation_id": "3c2baa67-de1d-4ab5-ab21-c6c3711aa1cb"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638087267",
  "device_ref": "sandbox-28059"
}
```

```json
{
  "challenge_id": "e671e736-a00e-4acb-9f65-faaa5875615e",
  "expires_at": "2026-10-29T14:36:25.186713632Z",
  "resend_available_at": "2026-10-29T14:31:26.186713632Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638087267` → **200**

```json
{
  "phone": "+380638087267",
  "audience": "CLIENT",
  "code": "588904",
  "sent_at": "2026-10-29T14:31:25.189259435Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e671e736-a00e-4acb-9f65-faaa5875615e",
  "code": "588904",
  "device_ref": "sandbox-28059"
}
```

```json
{
  "session_id": "9ebf803f-8bbe-482c-b884-6f224d93982e",
  "subject": {
    "type": "CLIENT",
    "id": "6dde3b6d-aa55-4b01-9a6e-7d181de078d8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZGRlM2I2ZC1hYTU1LTRiMDEtOWE2ZS03ZDE4MWRlMDc4ZDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MTg1LCJpYXQiOjE3OTMyODQyODUsImp0aSI6ImE1YjI0MDY5LWI1YTctNDVlMS05MGFmLWM0ZjhhZDBjZjM1ZCIsInNpZCI6IjllYmY4MDNmLThiYmUtNDgyYy1iODg0LTZmMjI0ZDkzOTgyZSJ9.swk3QHb9xqyDhFpuvfRNcVSFI36h6pGqG15O4EtBu2A",
  "access_expires_at": "2026-10-29T14:46:25.492602272Z",
  "refresh_token": "V2qf6oEkWcG1ebkWxBxaRAFeWRPf4okfsmEMvC8bruA",
  "refresh_expires_at": "2026-11-28T14:31:25.492065988Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6dde3b6d-aa55-4b01-9a6e-7d181de078d8",
  "session_id": "9ebf803f-8bbe-482c-b884-6f224d93982e",
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
  "session_id": "ef9a600b-2e49-4636-9a43-bd33758cb9f1",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxODYsImlhdCI6MTc5MzI4NDI4NiwianRpIjoiM2E1OGRmZmQtYTU3OC00OGQyLTg2ODYtYmY4ODNhYzA0OTJmIiwic2lkIjoiZWY5YTYwMGItMmU0OS00NjM2LTlhNDMtYmQzMzc1OGNiOWYxIn0.o7UCjnbG1xVTvSxYiBmsMwmZzrxKRDE4VVSK1ORy1wI",
  "access_expires_at": "2026-10-29T14:46:26.327526239Z",
  "refresh_token": "fYTvdMwzSY0tfmL6nGnjZLz1gDSEQ-e5F9TeZE70M98",
  "refresh_expires_at": "2026-10-30T02:31:26.326797609Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/6dde3b6d-aa55-4b01-9a6e-7d181de078d8` → **200**

```json
{
  "client": {
    "id": "6dde3b6d-aa55-4b01-9a6e-7d181de078d8",
    "phone": "+380638087267",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:31:16.334441Z",
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

`POST /api/admin/v1/clients/6dde3b6d-aa55-4b01-9a6e-7d181de078d8/phone/new-code` → **201**

```json
{
  "phone": "+380631954722"
}
```

```json
{
  "challenge_id": "fcdd96fe-43cb-443f-9666-3aea5d2cd522",
  "expires_at": "2026-10-29T14:36:26.94541724Z",
  "resend_available_at": "2026-10-29T14:31:27.94541724Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631954722` → **200**

```json
{
  "phone": "+380631954722",
  "audience": "CLIENT",
  "code": "989265",
  "sent_at": "2026-10-29T14:31:26.948082378Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/6dde3b6d-aa55-4b01-9a6e-7d181de078d8/phone` → **422**

```json
{
  "command_id": "b2e242a2-87aa-4ddb-8cc6-25de0b97c149",
  "expected_version": 3,
  "new_challenge_id": "fcdd96fe-43cb-443f-9666-3aea5d2cd522",
  "new_code": "989266",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/6dde3b6d-aa55-4b01-9a6e-7d181de078d8/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "5d756e88-4753-4a2d-8077-35b313a29f8a"
}
```

`POST /api/admin/v1/clients/6dde3b6d-aa55-4b01-9a6e-7d181de078d8/phone` → **400**

```json
{
  "command_id": "7e5444b4-3411-41f2-adaf-27d2deae04f8",
  "expected_version": 3,
  "new_challenge_id": "fcdd96fe-43cb-443f-9666-3aea5d2cd522",
  "new_code": "989265",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/6dde3b6d-aa55-4b01-9a6e-7d181de078d8/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "8332cc85-36b2-489e-b4f0-2379bc856f30",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/6dde3b6d-aa55-4b01-9a6e-7d181de078d8/phone` → **200**

```json
{
  "command_id": "80d3d6a8-fdf0-431d-8c7e-f88cef5e64b9",
  "expected_version": 3,
  "new_challenge_id": "fcdd96fe-43cb-443f-9666-3aea5d2cd522",
  "new_code": "989265",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "6dde3b6d-aa55-4b01-9a6e-7d181de078d8",
  "phone": "+380631954722",
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
  "correlation_id": "f77308bb-a9e6-47b5-9935-31e974ea5893"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631954722",
  "device_ref": "sandbox-14568"
}
```

```json
{
  "challenge_id": "f9f8015d-a201-4095-a4e6-f4c035c0ce14",
  "expires_at": "2026-10-29T14:36:28.386670276Z",
  "resend_available_at": "2026-10-29T14:31:29.386670276Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631954722` → **200**

```json
{
  "phone": "+380631954722",
  "audience": "CLIENT",
  "code": "651695",
  "sent_at": "2026-10-29T14:31:28.389400755Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f9f8015d-a201-4095-a4e6-f4c035c0ce14",
  "code": "651695",
  "device_ref": "sandbox-14568"
}
```

```json
{
  "session_id": "683b2ec9-41c5-49c6-a2ca-0530c8a0803b",
  "subject": {
    "type": "CLIENT",
    "id": "6dde3b6d-aa55-4b01-9a6e-7d181de078d8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZGRlM2I2ZC1hYTU1LTRiMDEtOWE2ZS03ZDE4MWRlMDc4ZDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MTg4LCJpYXQiOjE3OTMyODQyODgsImp0aSI6Ijc4OTkyYmU1LWYyNGYtNGZmNC1iNGY0LWEyMGJiYzlhNmQzYiIsInNpZCI6IjY4M2IyZWM5LTQxYzUtNDljNi1hMmNhLTA1MzBjOGEwODAzYiJ9.LWLb1rVoUpO4R0ZwuX2TjTlNkfh6BolNA730abZbLuc",
  "access_expires_at": "2026-10-29T14:46:28.697110444Z",
  "refresh_token": "qyZI1eSkXNs0PMDU-u05ujiGaRdY7IB0mK6YRefH_2Y",
  "refresh_expires_at": "2026-11-28T14:31:28.696553662Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6dde3b6d-aa55-4b01-9a6e-7d181de078d8",
  "session_id": "683b2ec9-41c5-49c6-a2ca-0530c8a0803b",
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
  "phone": "+380632970708",
  "device_ref": "sandbox-26300"
}
```

```json
{
  "challenge_id": "1aa0037b-ab95-4a4e-8798-f9b67d5e29ae",
  "expires_at": "2026-10-29T14:36:29.243254701Z",
  "resend_available_at": "2026-10-29T14:31:30.243254701Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632970708` → **200**

```json
{
  "phone": "+380632970708",
  "audience": "CLIENT",
  "code": "573019",
  "sent_at": "2026-10-29T14:31:29.245723799Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1aa0037b-ab95-4a4e-8798-f9b67d5e29ae",
  "code": "573019",
  "device_ref": "sandbox-26300"
}
```

```json
{
  "session_id": "fb2b1d5f-93b1-42b8-8e5e-f7998b7ff008",
  "subject": {
    "type": "CLIENT",
    "id": "073539f3-1fa5-452f-af0f-c69722f1d078"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNzM1MzlmMy0xZmE1LTQ1MmYtYWYwZi1jNjk3MjJmMWQwNzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MTg5LCJpYXQiOjE3OTMyODQyODksImp0aSI6ImJlMmFjNTZmLWE2ZTQtNGIxOC04NmQ2LTBmZjZkODE4YTM4MCIsInNpZCI6ImZiMmIxZDVmLTkzYjEtNDJiOC04ZTVlLWY3OTk4YjdmZjAwOCJ9.LoIIhEMJjWtezOoZ6l3ek34nh-dkzPvTo11pLKo7P6c",
  "access_expires_at": "2026-10-29T14:46:29.551672745Z",
  "refresh_token": "2Ae39Lyt_M0TLUmF1dIgRHjS-BZOGpCC3gOCPxwK9nQ",
  "refresh_expires_at": "2026-11-28T14:31:29.551171527Z",
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
  "session_id": "87e029fa-cbe1-4c94-a459-d16b3be06b6d",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxOTAsImlhdCI6MTc5MzI4NDI5MCwianRpIjoiY2FmZTM1YzItMzk4Ny00MzQ1LTg5MjQtNGU4MDgyODE4YTcxIiwic2lkIjoiODdlMDI5ZmEtY2JlMS00Yzk0LWE0NTktZDE2YjNiZTA2YjZkIn0.vFObHfRDoX5MwEQUpBs5lnYcAeSPAzXOsOnApy9q1UE",
  "access_expires_at": "2026-10-29T14:46:30.723761669Z",
  "refresh_token": "uTjz8hD-k3pH0Ga7addqcCaQpeHktVZ_Q6DPbXJCJ68",
  "refresh_expires_at": "2026-10-30T02:31:30.72312502Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380632970708` → **200**

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
  "correlation_id": "18e98db3-caaa-461e-bc11-f07f6322c192"
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
  "session_id": "eb97aaf8-b288-436e-bf63-503d5a2a78c7",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxOTEsImlhdCI6MTc5MzI4NDI5MSwianRpIjoiYTgwNzc5MGItZDBlNS00NmY5LTg3ZGItMmI3NGU0ODU4YzAxIiwic2lkIjoiZWI5N2FhZjgtYjI4OC00MzZlLWJmNjMtNTAzZDVhMmE3OGM3In0.2wSPKKi2PffuZuRm2j1-CHnGQV2qQK_2Jx3fyv63Avw",
  "access_expires_at": "2026-10-29T14:46:31.862285303Z",
  "refresh_token": "poQ-Ab7PgXomRZoV8ac7sbd0oAdqDlZ8m8T1OxZvpD8",
  "refresh_expires_at": "2026-10-30T02:31:31.861753448Z",
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
  "changed_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T14:27:30.319819Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "e9d04ab2-345a-4640-802d-391b15007a1e",
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
  "changed_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T14:31:32.428714112Z"
}
```

## The rider books the airport for 2026-10-29T17:31:31Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600205409",
  "device_ref": "sandbox-18121"
}
```

```json
{
  "challenge_id": "d3cd285a-8078-4ddb-b24d-6ba405845662",
  "expires_at": "2026-10-29T14:36:32.727829563Z",
  "resend_available_at": "2026-10-29T14:31:33.727829563Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600205409` → **200**

```json
{
  "phone": "+48600205409",
  "audience": "CLIENT",
  "code": "116683",
  "sent_at": "2026-10-29T14:31:32.730438285Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d3cd285a-8078-4ddb-b24d-6ba405845662",
  "code": "116683",
  "device_ref": "sandbox-18121"
}
```

```json
{
  "session_id": "612e4462-27a2-480b-a342-3c8f60934a54",
  "subject": {
    "type": "CLIENT",
    "id": "3b62add1-f14f-498a-9519-6336665862de"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYjYyYWRkMS1mMTRmLTQ5OGEtOTUxOS02MzM2NjY1ODYyZGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MTkzLCJpYXQiOjE3OTMyODQyOTMsImp0aSI6ImE1N2U5NzFlLTNhYmYtNGY2MS05YjU1LWU4NGM3ODljZmNjNiIsInNpZCI6IjYxMmU0NDYyLTI3YTItNDgwYi1hMzQyLTNjOGY2MDkzNGE1NCJ9.ihU2mI7togV9osfRInXaJJoZr9k4gYXUEKNuL0Cv2Yc",
  "access_expires_at": "2026-10-29T14:46:33.034422294Z",
  "refresh_token": "LpW--84qWw7gkuUZOnYSioRd0eGk_JTfjuJ2CMhoa0g",
  "refresh_expires_at": "2026-11-28T14:31:33.033918221Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "83c8712f-5c0d-481f-9a83-8bd66f20e18b",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T17:31:31Z"
}
```

```json
{
  "id": "b5346c19-3e98-4ddf-b5f7-f90461fc0e02",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:36:33.316226Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T17:31:31Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "353bfd61-cf3f-48d4-bb41-db1386f9bc2a",
  "quote_id": "b5346c19-3e98-4ddf-b5f7-f90461fc0e02",
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
  "pickup_at": "2026-10-29T17:31:31Z"
}
```

```json
{
  "id": "7725995a-22af-4a71-8557-f3247ad3c3a6",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3b62add1-f14f-498a-9519-6336665862de",
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
  "created_at": "2026-10-29T14:31:33.614112Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T17:31:31Z",
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
  "device_ref": "sandbox-17468"
}
```

```json
{
  "challenge_id": "d13175f4-003f-4117-be32-2e2cbdf2372a",
  "expires_at": "2026-10-29T14:36:33.929837585Z",
  "resend_available_at": "2026-10-29T14:31:34.929837585Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "223026",
  "sent_at": "2026-10-29T14:31:33.932540463Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d13175f4-003f-4117-be32-2e2cbdf2372a",
  "code": "223026",
  "device_ref": "sandbox-17468"
}
```

```json
{
  "session_id": "11a62b65-d2f6-4ba1-a171-8e7b91e4ee2a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTE5NCwiaWF0IjoxNzkzMjg0Mjk0LCJqdGkiOiJhNzE3MzE0YS0wN2YzLTQ5NGEtYTU1MC1iYjUyOTQ3ODRhOTYiLCJzaWQiOiIxMWE2MmI2NS1kMmY2LTRiYTEtYTE3MS04ZTdiOTFlNGVlMmEifQ.z_ntWoOfxos8rlqEmlL7HCr9qKFgBpYp8pN1jTtBh1o",
  "access_expires_at": "2026-10-29T14:46:34.230609003Z",
  "refresh_token": "A43pJb7dzIV1xSI09GvHpWPvY5mTyVQwt7rxMKRiB9o",
  "refresh_expires_at": "2026-11-28T14:31:34.230056368Z",
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
  "command_id": "778da035-f425-473f-9bb0-0bd4bc1e8a84",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:31:34Z",
    "sequence": 1793284294783
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "c8a3768e-02a6-41ed-91e3-1617384817d9",
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
  "last_heartbeat_at": "2026-10-29T14:31:34.801173Z",
  "last_location_at": "2026-10-29T14:31:34.801173Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "7725995a-22af-4a71-8557-f3247ad3c3a6",
      "short_number": 24,
      "pickup_at": "2026-10-29T17:31:31Z",
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

`POST /api/driver/v1/preorders/7725995a-22af-4a71-8557-f3247ad3c3a6/reserve` → **200**

```json
{
  "command_id": "da3c117c-d36e-400d-9f38-452f5de5c71b"
}
```

```json
{
  "id": "cd02f303-186d-4cbe-82f5-4e92a3ff9dec",
  "state": "RESERVED",
  "order": {
    "order_id": "7725995a-22af-4a71-8557-f3247ad3c3a6",
    "short_number": 24,
    "pickup_at": "2026-10-29T17:31:31Z",
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
  "reserved_at": "2026-10-29T14:31:35.377117Z",
  "confirm_from": "2026-10-29T17:01:31Z",
  "confirm_until": "2026-10-29T17:11:31Z",
  "drop_until": "2026-10-29T16:31:31Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "cd02f303-186d-4cbe-82f5-4e92a3ff9dec",
      "state": "RESERVED",
      "order": {
        "order_id": "7725995a-22af-4a71-8557-f3247ad3c3a6",
        "short_number": 24,
        "pickup_at": "2026-10-29T17:31:31Z",
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
      "reserved_at": "2026-10-29T14:31:35.377117Z",
      "confirm_from": "2026-10-29T17:01:31Z",
      "confirm_until": "2026-10-29T17:11:31Z",
      "drop_until": "2026-10-29T16:31:31Z"
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
      "id": "cd02f303-186d-4cbe-82f5-4e92a3ff9dec",
      "state": "RESERVED",
      "order": {
        "order_id": "7725995a-22af-4a71-8557-f3247ad3c3a6",
        "short_number": 24,
        "pickup_at": "2026-10-29T17:31:31Z",
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
      "reserved_at": "2026-10-29T14:31:35.377117Z",
      "confirm_from": "2026-10-29T17:01:31Z",
      "confirm_until": "2026-10-29T17:11:31Z",
      "drop_until": "2026-10-29T16:31:31Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/cd02f303-186d-4cbe-82f5-4e92a3ff9dec/confirm` → **409**

```json
{
  "command_id": "d34081af-d162-427f-ae4c-5d71082d065a"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/cd02f303-186d-4cbe-82f5-4e92a3ff9dec/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "91b7f7ee-8c54-4052-a539-1438aa1075c4"
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
  "session_id": "1f64fa8b-0917-4235-bc9a-b5a328e287cf",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxOTYsImlhdCI6MTc5MzI4NDI5NiwianRpIjoiYTZkZTU2YzUtODcwMC00Y2JmLWI2Y2UtZWYyMTg3ZGYxNGVlIiwic2lkIjoiMWY2NGZhOGItMDkxNy00MjM1LWJjOWEtYjVhMzI4ZTI4N2NmIn0.O4n8SWFMLUFNrc0wSK8kOw2iOjMX7VgzWJKLrMEAX5k",
  "access_expires_at": "2026-10-29T14:46:36.780022732Z",
  "refresh_token": "lq48nYMTFHRH8pz8VNJodKlc60-lrwmXzbmDkJ3h4BI",
  "refresh_expires_at": "2026-10-30T02:31:36.779249024Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/7725995a-22af-4a71-8557-f3247ad3c3a6` → **200**

```json
{
  "id": "7725995a-22af-4a71-8557-f3247ad3c3a6",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "3b62add1-f14f-498a-9519-6336665862de",
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
  "created_at": "2026-10-29T14:31:33.614112Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T17:31:31Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "cd02f303-186d-4cbe-82f5-4e92a3ff9dec",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T14:31:35.377117Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/7725995a-22af-4a71-8557-f3247ad3c3a6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T14:31:33.615473Z",
      "actor": {
        "type": "CLIENT",
        "id": "3b62add1-f14f-498a-9519-6336665862de",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "7725995a-22af-4a71-8557-f3247ad3c3a6",
        "preorder": true,
        "quote_id": "b5346c19-3e98-4ddf-b5f7-f90461fc0e02",
        "pickup_at": "2026-10-29T17:31:31Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "53cc8ce9-bee2-4772-bfcc-ee1d79f58bc3"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T14:31:35.378174Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7725995a-22af-4a71-8557-f3247ad3c3a6",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "cd02f303-186d-4cbe-82f5-4e92a3ff9dec"
      },
      "correlation_id": "92a36dc6-a91a-4f0d-a576-2aba3a27f3c7"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 7725995a-22af-4a71-8557-f3247ad3c3a6, reservation cd02f303-186d-4cbe-82f5-4e92a3ff9dec.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26807"
}
```

```json
{
  "challenge_id": "6d3e431f-060e-4f98-a889-0486d9e8229d",
  "expires_at": "2026-10-29T14:36:37.652295003Z",
  "resend_available_at": "2026-10-29T14:31:38.652295003Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "145534",
  "sent_at": "2026-10-29T14:31:37.654826579Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6d3e431f-060e-4f98-a889-0486d9e8229d",
  "code": "145534",
  "device_ref": "sandbox-26807"
}
```

```json
{
  "session_id": "323976ca-15ba-4515-846f-444a4fd00784",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTE5NywiaWF0IjoxNzkzMjg0Mjk3LCJqdGkiOiJiMTAyOTY5ZS1jNDRkLTQ5NTYtYmU0Yy1kZWZkMzRhNDY4NGQiLCJzaWQiOiIzMjM5NzZjYS0xNWJhLTQ1MTUtODQ2Zi00NDRhNGZkMDA3ODQifQ.irAO67zGHZ7QbQIvfp26f0gSbhynYbTiZ9EknVgDM8s",
  "access_expires_at": "2026-10-29T14:46:37.955870419Z",
  "refresh_token": "e9jdZps4LZgaqmVSCWoSF2DXklsTY_Mq1ymXCwvLaJ4",
  "refresh_expires_at": "2026-11-28T14:31:37.955224401Z",
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
  "command_id": "3def3069-17ef-45eb-8a2b-90d403b5904e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:31:38Z",
    "sequence": 1793284298528
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "72770097-f72a-498a-997e-2e16139aaa32",
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
  "last_heartbeat_at": "2026-10-29T14:31:38.547045Z",
  "last_location_at": "2026-10-29T14:31:38.547045Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676752320",
  "device_ref": "sandbox-2740"
}
```

```json
{
  "challenge_id": "83080e96-45a8-45a8-8c61-e4e8038cc873",
  "expires_at": "2026-10-29T14:36:38.830770074Z",
  "resend_available_at": "2026-10-29T14:31:39.830770074Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676752320` → **200**

```json
{
  "phone": "+380676752320",
  "audience": "CLIENT",
  "code": "978002",
  "sent_at": "2026-10-29T14:31:38.833445288Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "83080e96-45a8-45a8-8c61-e4e8038cc873",
  "code": "978002",
  "device_ref": "sandbox-2740"
}
```

```json
{
  "session_id": "7d471f9b-356c-4ef5-957a-56772e6cf669",
  "subject": {
    "type": "CLIENT",
    "id": "23a17761-8697-4544-8547-2ac2c01acb02"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2ExNzc2MS04Njk3LTQ1NDQtODU0Ny0yYWMyYzAxYWNiMDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MTk5LCJpYXQiOjE3OTMyODQyOTksImp0aSI6IjVhZThmMzRmLTNhNGYtNGUwNy05MWE3LWU5ODZkNTQ2MmVlMyIsInNpZCI6IjdkNDcxZjliLTM1NmMtNGVmNS05NTdhLTU2NzcyZTZjZjY2OSJ9.WLFJh1xTxkViabUBr0S0XxI1nGhg9fkQkeHYgbwLu_Q",
  "access_expires_at": "2026-10-29T14:46:39.137528243Z",
  "refresh_token": "vVXpgxM7pGbWM7tboi8e1D8cwHGBRobJ0ZnK2-Opwnw",
  "refresh_expires_at": "2026-11-28T14:31:39.136788457Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "407e9f93-f786-460f-9d1b-39ce93d36363",
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
  "id": "c5519ac0-1ff4-4efc-bd9a-042ad1e2c2ac",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:36:39.416263Z",
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
  "command_id": "c9977d9b-b32b-49b3-84b5-bfca0d457606",
  "quote_id": "c5519ac0-1ff4-4efc-bd9a-042ad1e2c2ac",
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
  "id": "dc5a03c9-142f-4958-a7b5-6c7999511455",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23a17761-8697-4544-8547-2ac2c01acb02",
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
  "created_at": "2026-10-29T14:31:39.70369Z",
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
    "id": "98e6d275-3b2b-4143-8023-a6b264b348e9",
    "order_id": "dc5a03c9-142f-4958-a7b5-6c7999511455",
    "expires_at": "2026-10-29T14:31:54.706551Z",
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

`POST /api/driver/v1/offers/98e6d275-3b2b-4143-8023-a6b264b348e9/accept` → **200**

```json
{
  "command_id": "c01ea9d2-9145-40be-b17b-7c2f2cfaa422"
}
```

```json
{
  "id": "711d3cd1-9328-4035-a9b0-9548029452b5",
  "order_id": "dc5a03c9-142f-4958-a7b5-6c7999511455",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d496f113-fb93-4ff0-8bfc-6b723c1798c8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d496f113-fb93-4ff0-8bfc-6b723c1798c8",
  "order_id": "dc5a03c9-142f-4958-a7b5-6c7999511455",
  "assignment_id": "711d3cd1-9328-4035-a9b0-9548029452b5",
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

`POST /api/driver/v1/work-sessions/72770097-f72a-498a-997e-2e16139aaa32/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:31:40Z",
    "sequence": 1793284300833
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "72770097-f72a-498a-997e-2e16139aaa32",
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
  "last_heartbeat_at": "2026-10-29T14:31:40.851595Z",
  "last_location_at": "2026-10-29T14:31:40.851595Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d496f113-fb93-4ff0-8bfc-6b723c1798c8",
  "order_id": "dc5a03c9-142f-4958-a7b5-6c7999511455",
  "assignment_id": "711d3cd1-9328-4035-a9b0-9548029452b5",
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

`POST /api/driver/v1/trips/d496f113-fb93-4ff0-8bfc-6b723c1798c8/arrive` → **200**

```json
{
  "command_id": "ac7fe90e-56b1-42fe-bae1-1ff7401649a1",
  "expected_version": 0
}
```

```json
{
  "id": "d496f113-fb93-4ff0-8bfc-6b723c1798c8",
  "order_id": "dc5a03c9-142f-4958-a7b5-6c7999511455",
  "assignment_id": "711d3cd1-9328-4035-a9b0-9548029452b5",
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
  "arrived_at": "2026-10-29T14:31:41.40303Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d496f113-fb93-4ff0-8bfc-6b723c1798c8/start` → **200**

```json
{
  "command_id": "9cb0f13c-dcbf-42b7-88a6-c855ae0af5ff",
  "expected_version": 1
}
```

```json
{
  "id": "d496f113-fb93-4ff0-8bfc-6b723c1798c8",
  "order_id": "dc5a03c9-142f-4958-a7b5-6c7999511455",
  "assignment_id": "711d3cd1-9328-4035-a9b0-9548029452b5",
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
  "arrived_at": "2026-10-29T14:31:41.40303Z",
  "started_at": "2026-10-29T14:31:41.694764Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/72770097-f72a-498a-997e-2e16139aaa32/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:31:41Z",
    "sequence": 1793284301981
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "72770097-f72a-498a-997e-2e16139aaa32",
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
  "last_heartbeat_at": "2026-10-29T14:31:41.999284Z",
  "last_location_at": "2026-10-29T14:31:41.999284Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/d496f113-fb93-4ff0-8bfc-6b723c1798c8/complete` → **200**

```json
{
  "command_id": "5aa0021c-a736-4e67-8b1a-61af60e28664",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:31:42Z",
  "cash_received": true
}
```

```json
{
  "id": "d496f113-fb93-4ff0-8bfc-6b723c1798c8",
  "order_id": "dc5a03c9-142f-4958-a7b5-6c7999511455",
  "assignment_id": "711d3cd1-9328-4035-a9b0-9548029452b5",
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
  "arrived_at": "2026-10-29T14:31:41.40303Z",
  "started_at": "2026-10-29T14:31:41.694764Z",
  "completed_at": "2026-10-29T14:31:42.279256Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/dc5a03c9-142f-4958-a7b5-6c7999511455/rating` → **200**

```json
{
  "command_id": "48cb202d-7d19-436f-bdd2-3738024f6635",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "dc5a03c9-142f-4958-a7b5-6c7999511455",
  "score": 5,
  "created_at": "2026-10-29T14:31:42.581435863Z"
}
```

`POST /api/driver/v1/orders/dc5a03c9-142f-4958-a7b5-6c7999511455/rating` → **200**

```json
{
  "command_id": "1097e6d8-eb54-489e-9040-d1026aed973c",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "dc5a03c9-142f-4958-a7b5-6c7999511455",
  "score": 4,
  "created_at": "2026-10-29T14:31:42.865890776Z"
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
  "session_id": "6208d5e4-1da5-450f-a57b-a684e287be28",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUyMDMsImlhdCI6MTc5MzI4NDMwMywianRpIjoiNWZjZWIxNjMtZDFlYi00MmVmLWI0MzctNGFiMGUyODdjNWE1Iiwic2lkIjoiNjIwOGQ1ZTQtMWRhNS00NTBmLWE1N2ItYTY4NGUyODdiZTI4In0.b-G8p0Ga-jWrjHPOYQI2qZ7myc96qwVn6m8IBXBgg4k",
  "access_expires_at": "2026-10-29T14:46:43.72086958Z",
  "refresh_token": "KaoPMM8087dzUsZUlk2amHV87fX6IzBR-vV0_3WiZUk",
  "refresh_expires_at": "2026-10-30T02:31:43.720366199Z",
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
  "session_id": "70439cba-4b99-4a4b-a882-568a200327f7",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUyMDQsImlhdCI6MTc5MzI4NDMwNCwianRpIjoiNDI1MTQ3N2EtY2FhOC00NmIyLWJiYTctZjY0YTIyY2NhMjQwIiwic2lkIjoiNzA0MzljYmEtNGI5OS00YTRiLWE4ODItNTY4YTIwMDMyN2Y3In0.g-L6EMEseR8Aky7FnEBYjj24jnCwZNyiQDMEyA861iA",
  "access_expires_at": "2026-10-29T14:46:44.291473775Z",
  "refresh_token": "wC-Bz6bHPjDH9dNxTL96Po54gjNuEbNzoS1V6f2UT34",
  "refresh_expires_at": "2026-10-30T02:31:44.29089178Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/dc5a03c9-142f-4958-a7b5-6c7999511455/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "dc5a03c9-142f-4958-a7b5-6c7999511455",
      "author_type": "RIDER",
      "author_id": "23a17761-8697-4544-8547-2ac2c01acb02",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T14:31:42.581436Z"
    },
    {
      "order_id": "dc5a03c9-142f-4958-a7b5-6c7999511455",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "23a17761-8697-4544-8547-2ac2c01acb02",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T14:31:42.865891Z"
    }
  ]
}
```

Done: ratings for order dc5a03c9-142f-4958-a7b5-6c7999511455.

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
  "session_id": "79af2b3a-2c7b-498d-8fdd-bdca73b7ed34",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUyMDUsImlhdCI6MTc5MzI4NDMwNSwianRpIjoiZWVkMTMxYjktYzY5Mi00OGQwLTkwNTAtZjI0NmVmMTY4NDgyIiwic2lkIjoiNzlhZjJiM2EtMmM3Yi00OThkLThmZGQtYmRjYTczYjdlZDM0In0.u9fgiFEJTS1WXC2-wuMC88fijVuGzfgInztuaDjR1BU",
  "access_expires_at": "2026-10-29T14:46:45.166120108Z",
  "refresh_token": "9sZh-LSIPCw-ll7lYPky4fu48FX3CG0JAeY_DqTb5Gw",
  "refresh_expires_at": "2026-10-30T02:31:45.165572713Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "40e0daae-41d3-40ee-bc1b-9c4afcec342e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "aaee0e46-95df-4c4b-b170-d93479029fef",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:31:45.445415Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/aaee0e46-95df-4c4b-b170-d93479029fef` → **200**

```json
{
  "id": "aaee0e46-95df-4c4b-b170-d93479029fef",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:31:45.445415Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/aaee0e46-95df-4c4b-b170-d93479029fef` → **200**

```json
{
  "id": "aaee0e46-95df-4c4b-b170-d93479029fef",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:31:45.445415Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/aaee0e46-95df-4c4b-b170-d93479029fef` → **200**

```json
{
  "id": "aaee0e46-95df-4c4b-b170-d93479029fef",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T14:31:45.445415Z",
  "ready_at": "2026-10-29T14:31:48.241823Z",
  "expires_at": "2026-10-30T14:31:48.241823Z"
}
```

`GET /api/admin/v1/reports/exports/aaee0e46-95df-4c4b-b170-d93479029fef/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "aab9cacf-904c-4035-b775-ab77d38bc34b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "f5fe0223-68a4-4fce-b0fb-adc65a74ae84",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:31:48.576452Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f5fe0223-68a4-4fce-b0fb-adc65a74ae84` → **200**

```json
{
  "id": "f5fe0223-68a4-4fce-b0fb-adc65a74ae84",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:31:48.576452Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f5fe0223-68a4-4fce-b0fb-adc65a74ae84` → **200**

```json
{
  "id": "f5fe0223-68a4-4fce-b0fb-adc65a74ae84",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:31:48.576452Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f5fe0223-68a4-4fce-b0fb-adc65a74ae84` → **200**

```json
{
  "id": "f5fe0223-68a4-4fce-b0fb-adc65a74ae84",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:31:48.576452Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f5fe0223-68a4-4fce-b0fb-adc65a74ae84` → **200**

```json
{
  "id": "f5fe0223-68a4-4fce-b0fb-adc65a74ae84",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:31:48.576452Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f5fe0223-68a4-4fce-b0fb-adc65a74ae84` → **200**

```json
{
  "id": "f5fe0223-68a4-4fce-b0fb-adc65a74ae84",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T14:31:48.576452Z",
  "ready_at": "2026-10-29T14:31:53.248982Z",
  "expires_at": "2026-10-30T14:31:53.248982Z"
}
```

`GET /api/admin/v1/reports/exports/f5fe0223-68a4-4fce-b0fb-adc65a74ae84/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/6e7ba2b3-3594-432a-9f3b-ccc0740c4365` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/6e7ba2b3-3594-432a-9f3b-ccc0740c4365",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "597a5dce-eaf2-4c8e-9198-2871f570bc54"
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
  "device_ref": "sandbox-15067"
}
```

```json
{
  "challenge_id": "a1985c27-714a-4436-b27a-d59ac386587a",
  "expires_at": "2026-10-29T14:36:54.593044295Z",
  "resend_available_at": "2026-10-29T14:31:55.593044295Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "122483",
  "sent_at": "2026-10-29T14:31:54.595752631Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a1985c27-714a-4436-b27a-d59ac386587a",
  "code": "122483",
  "device_ref": "sandbox-15067"
}
```

```json
{
  "session_id": "141871ae-f16f-433a-89a4-e635309bc9a8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTIxNCwiaWF0IjoxNzkzMjg0MzE0LCJqdGkiOiJkNjZmZjlhNC03MjdiLTRiNzYtYTdlNi04MDliM2VlODdjNmYiLCJzaWQiOiIxNDE4NzFhZS1mMTZmLTQzM2EtODlhNC1lNjM1MzA5YmM5YTgifQ.4rNYDI8C92G71sSEkHmouEDsMK-nEf7lF7sY2uHbJfA",
  "access_expires_at": "2026-10-29T14:46:54.893877599Z",
  "refresh_token": "yDSFstfCWZKWKP9hXsxTEpvUC_sIinKSQRIkuHY3m8Y",
  "refresh_expires_at": "2026-11-28T14:31:54.893291092Z",
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
  "command_id": "f52c51b4-32e4-4fa4-b0bc-1cb0f8f6c16f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:31:55Z",
    "sequence": 1793284315709
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3d78769a-26ee-450a-8dbd-804dca9dd1fa",
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
  "last_heartbeat_at": "2026-10-29T14:31:55.726673Z",
  "last_location_at": "2026-10-29T14:31:55.726673Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "d5cf5d00-cad4-42ee-af11-cf120b46ccb6",
  "points": [
    {
      "sequence": 1793284318503,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T14:30:57Z"
    },
    {
      "sequence": 1793284318504,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T14:31:58Z"
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
  "session_id": "a145ce02-82f6-43ab-b67b-0c135456484d",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUyMTgsImlhdCI6MTc5MzI4NDMxOCwianRpIjoiMDQ1YzQxYTktNTFhMy00ZWQ5LTljOGEtZWQyYzA2MDJhODNiIiwic2lkIjoiYTE0NWNlMDItODJmNi00M2FiLWI2N2ItMGMxMzU0NTY0ODRkIn0.anANWBOcmebB0shuDB_k8mgCRJ7REppT_OauI3GMvPs",
  "access_expires_at": "2026-10-29T14:46:58.618467436Z",
  "refresh_token": "JGCbLpelyg58GnEQTeci840cZu7cTz9vdQbYqkxlN1Q",
  "refresh_expires_at": "2026-10-30T02:31:58.617919581Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "470ef8cb-7008-4953-86f9-81bcf5d27c7d",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 61.0,
        "speed_kph": 2362,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T14:31:58Z",
        "track_point_id": "da3e62f3-80dd-4c1a-8705-76b6287b3601",
        "work_session_id": "3d78769a-26ee-450a-8dbd-804dca9dd1fa"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T14:31:58Z",
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
  "history": []
}
```

## Support confirms it with a reason — once

`POST /api/admin/v1/driver-risk-flags/470ef8cb-7008-4953-86f9-81bcf5d27c7d/confirm` → **200**

```json
{
  "command_id": "574028d5-449e-45f0-8090-22753e7a059f",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "470ef8cb-7008-4953-86f9-81bcf5d27c7d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 61.0,
    "speed_kph": 2362,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T14:31:58Z",
    "track_point_id": "da3e62f3-80dd-4c1a-8705-76b6287b3601",
    "work_session_id": "3d78769a-26ee-450a-8dbd-804dca9dd1fa"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T14:31:58Z",
  "reason": null,
  "reviewed_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
  "reviewed_at": "2026-10-29T14:31:59.494504Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/470ef8cb-7008-4953-86f9-81bcf5d27c7d/dismiss` → **409**

```json
{
  "command_id": "b56dc55c-2d25-4f8f-a24d-7a0f38558d43",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/470ef8cb-7008-4953-86f9-81bcf5d27c7d/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c5e26437-b3bd-4afa-83f1-9f25a55ebdb7"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "d1c0492d-3841-4c03-b5f2-62b619c9cf1a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "a1eb78d5-1258-45c3-83ba-f6379a98000a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
  "raised_at": "2026-10-29T14:32:00.082552Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/a1eb78d5-1258-45c3-83ba-f6379a98000a/dismiss` → **200**

```json
{
  "command_id": "c6c46e60-2306-4504-8a7e-5bad68f2796b",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "a1eb78d5-1258-45c3-83ba-f6379a98000a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
  "raised_at": "2026-10-29T14:32:00.082552Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
  "reviewed_at": "2026-10-29T14:32:00.380301Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "96b7598c-d92b-42bd-ac74-c18bb12ee0b9",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "470ef8cb-7008-4953-86f9-81bcf5d27c7d"
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
      "actor_id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T14:32:00.671628Z"
    }
  ]
}
```

Done: flag 470ef8cb-7008-4953-86f9-81bcf5d27c7d confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "3e485c3e-a4d6-479f-8a15-7b759ee77b1f",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUyMjEsImlhdCI6MTc5MzI4NDMyMSwianRpIjoiOTBiYTYyMWMtNGVlZS00ZjBjLWJkYzItZjM4YjZmZTFkNjQ5Iiwic2lkIjoiM2U0ODVjM2UtYTRkNi00NzlmLThhMTUtN2I3NTllZTc3YjFmIn0.88OPS6-x397qW5JvZABTPCFV_5YB9AOZlouTDMxRB8E",
  "access_expires_at": "2026-10-29T14:47:01.547932249Z",
  "refresh_token": "uRR9O4oq6ET8UTIFKUXZInJn7UH5PqXgSDrwF1Xc26s",
  "refresh_expires_at": "2026-10-30T02:32:01.547383322Z",
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
      "actor_id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T14:32:00.671628Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "8561d881-a978-4abf-8070-2a054391e910",
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
  "session_id": "3d78769a-26ee-450a-8dbd-804dca9dd1fa",
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
  "last_heartbeat_at": "2026-10-29T14:31:55.726673Z",
  "last_location_at": "2026-10-29T14:31:55.726673Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3d78769a-26ee-450a-8dbd-804dca9dd1fa/close` → **200**

```json
{
  "command_id": "decb903a-0635-40e5-ad87-a9a65785a839",
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
  "session_id": "879604d4-3b13-4547-91b1-e83dc8fb639f",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUyMjMsImlhdCI6MTc5MzI4NDMyMywianRpIjoiZTZmMDhmNGQtMmMyOC00NTQ3LTlmNWYtYmY3MDI1YjVkMTk5Iiwic2lkIjoiODc5NjA0ZDQtM2IxMy00NTQ3LTkxYjEtZTgzZGM4ZmI2MzlmIn0.5sQCVo9gsV1gyDzLQM8OtPQ-KL8y5rvGHUzDpVS6dug",
  "access_expires_at": "2026-10-29T14:47:03.279473756Z",
  "refresh_token": "D6yM5SIqMp28BgXI-G-6FkOjorVrHBigZQa2j2GkU1E",
  "refresh_expires_at": "2026-10-30T02:32:03.278933205Z",
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
  "command_id": "78aff771-3074-4f5d-903f-c78e35ab4ed3",
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
  "changed_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T14:32:03.847965Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "78aff771-3074-4f5d-903f-c78e35ab4ed3",
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
  "changed_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T14:32:03.847965Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48689184155",
  "device_ref": "sandbox-18318"
}
```

```json
{
  "challenge_id": "841f2183-1393-48e2-8c16-78a459f48380",
  "expires_at": "2026-10-29T14:37:04.425485315Z",
  "resend_available_at": "2026-10-29T14:32:05.425485315Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48689184155` → **200**

```json
{
  "phone": "+48689184155",
  "audience": "CLIENT",
  "code": "868576",
  "sent_at": "2026-10-29T14:32:04.428063598Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "841f2183-1393-48e2-8c16-78a459f48380",
  "code": "868576",
  "device_ref": "sandbox-18318"
}
```

```json
{
  "session_id": "bc8af9a7-d31a-4c5e-a0eb-64bdc0500345",
  "subject": {
    "type": "CLIENT",
    "id": "6c48d56a-0993-4539-b1f9-17670b81a70a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YzQ4ZDU2YS0wOTkzLTQ1MzktYjFmOS0xNzY3MGI4MWE3MGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MjI0LCJpYXQiOjE3OTMyODQzMjQsImp0aSI6Ijg3ZWNhODM1LTcwY2EtNDUxMi1hODRmLWU5MzhkMzhiM2I1MSIsInNpZCI6ImJjOGFmOWE3LWQzMWEtNGM1ZS1hMGViLTY0YmRjMDUwMDM0NSJ9.pNiM2L2jXRS6zxvUs_ixOOEnrwoo8MXyjFFzrP8VvZ0",
  "access_expires_at": "2026-10-29T14:47:04.738813241Z",
  "refresh_token": "_McNyzj9pAJ3XCXS1yd-lzBHMVhnEPf0OP7un3eB-ac",
  "refresh_expires_at": "2026-11-28T14:32:04.738269353Z",
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
  "correlation_id": "f66148e6-63ef-4509-9388-8aaace2c305e"
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
  "device_ref": "sandbox-689"
}
```

```json
{
  "challenge_id": "2b5ede19-f2c3-440d-8a24-145ba682feb2",
  "expires_at": "2026-10-29T14:37:05.607684835Z",
  "resend_available_at": "2026-10-29T14:32:06.607684835Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "534751",
  "sent_at": "2026-10-29T14:32:05.610250424Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2b5ede19-f2c3-440d-8a24-145ba682feb2",
  "code": "534751",
  "device_ref": "sandbox-689"
}
```

```json
{
  "session_id": "a7c6c462-639b-432e-a22f-e29458f0c08f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTIyNSwiaWF0IjoxNzkzMjg0MzI1LCJqdGkiOiJjNTVmMzhhOS00ZDU0LTQzNGMtOGNmYi1iMDU2MjBmMzk0MTgiLCJzaWQiOiJhN2M2YzQ2Mi02MzliLTQzMmUtYTIyZi1lMjk0NThmMGMwOGYifQ.QK0-f3t3fMh-LriZpE-gtvhIqnCe6PbPYze1cE1sEi0",
  "access_expires_at": "2026-10-29T14:47:05.915474888Z",
  "refresh_token": "v0dt0OxnOiJQmLp76viHcHgoRvLf0u0drCKNblIHPGw",
  "refresh_expires_at": "2026-11-28T14:32:05.914921463Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "c8a3768e-02a6-41ed-91e3-1617384817d9",
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
  "last_heartbeat_at": "2026-10-29T14:31:34.801173Z",
  "last_location_at": "2026-10-29T14:31:34.801173Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c8a3768e-02a6-41ed-91e3-1617384817d9/handover` → **200**

```json
{
  "command_id": "57d5df38-6795-40f9-8250-321662184856",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "c8a3768e-02a6-41ed-91e3-1617384817d9",
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
  "last_heartbeat_at": "2026-10-29T14:31:34.801173Z",
  "last_location_at": "2026-10-29T14:31:34.801173Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c8a3768e-02a6-41ed-91e3-1617384817d9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:32:06Z",
    "sequence": 1793284326751
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "c8a3768e-02a6-41ed-91e3-1617384817d9",
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
  "last_heartbeat_at": "2026-10-29T14:32:06.769071Z",
  "last_location_at": "2026-10-29T14:32:06.769071Z",
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
  "session_id": "c8a3768e-02a6-41ed-91e3-1617384817d9",
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
  "last_heartbeat_at": "2026-10-29T14:32:06.769071Z",
  "last_location_at": "2026-10-29T14:32:06.769071Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c8a3768e-02a6-41ed-91e3-1617384817d9/close` → **200**

```json
{
  "command_id": "c2ef3a42-60ba-48cc-8a24-ecd91294d43d",
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
  "correlation_id": "3defbbfc-3778-41ed-bbb3-a84ecde9bca8"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678448222",
  "device_ref": "sandbox-12229"
}
```

```json
{
  "challenge_id": "0c5455d7-ffe8-4ef4-aaeb-7586d21fd9a3",
  "expires_at": "2026-10-29T14:37:08.21393303Z",
  "resend_available_at": "2026-10-29T14:32:09.21393303Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678448222` → **200**

```json
{
  "phone": "+380678448222",
  "audience": "CLIENT",
  "code": "389004",
  "sent_at": "2026-10-29T14:32:08.21640954Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0c5455d7-ffe8-4ef4-aaeb-7586d21fd9a3",
  "code": "389004",
  "device_ref": "sandbox-12229"
}
```

```json
{
  "session_id": "4c66a046-d91c-4487-890f-bf3456896d82",
  "subject": {
    "type": "CLIENT",
    "id": "d6e3bfae-181d-4197-a2a0-b4089e875f91"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmUzYmZhZS0xODFkLTQxOTctYTJhMC1iNDA4OWU4NzVmOTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MjI4LCJpYXQiOjE3OTMyODQzMjgsImp0aSI6IjQxY2JmYWY4LTQ3ZmYtNGYzMS1hMmY4LTFkM2M1ZDMzNWQ3NyIsInNpZCI6IjRjNjZhMDQ2LWQ5MWMtNDQ4Ny04OTBmLWJmMzQ1Njg5NmQ4MiJ9.suIk27rvr-S7c0un5rqnoxQpRhuEhtGwpkyVHsKmpPE",
  "access_expires_at": "2026-10-29T14:47:08.517037405Z",
  "refresh_token": "Z1ZZlroFCbjC99om9mynfhdebFXuSJT3I7NqU9Gpcvo",
  "refresh_expires_at": "2026-11-28T14:32:08.51653803Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "e0cbc377-0c3d-4f83-b24e-2de762ebc55b",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "118a3e17-a1c9-4b1e-83e5-63b9e559e783",
  "upload_path": "/api/rider/v1/uploads/118a3e17-a1c9-4b1e-83e5-63b9e559e783",
  "expires_at": "2026-10-29T14:47:08.807858165Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/118a3e17-a1c9-4b1e-83e5-63b9e559e783` → **200**

```json
{
  "file_id": "118a3e17-a1c9-4b1e-83e5-63b9e559e783",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "0370b2c4-3e34-4794-b196-a701b2862805",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "118a3e17-a1c9-4b1e-83e5-63b9e559e783"
  ]
}
```

```json
{
  "id": "074ceb3c-1c8b-437d-a54d-c5b9abd40850",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d6e3bfae-181d-4197-a2a0-b4089e875f91",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T14:32:09.127379Z",
  "updated_at": "2026-10-29T14:32:09.127379Z",
  "respond_by": "2026-10-29T18:32:09.127379Z",
  "messages": [
    {
      "id": "945ee77e-df10-4c0f-a27f-7b7c84fb2142",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d6e3bfae-181d-4197-a2a0-b4089e875f91",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:32:09.128284Z",
      "attachments": [
        {
          "file_id": "118a3e17-a1c9-4b1e-83e5-63b9e559e783",
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
  "session_id": "d6b3999e-8485-40a3-81dd-d9faaf1594ee",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUyMjksImlhdCI6MTc5MzI4NDMyOSwianRpIjoiNzRjMTBkOWMtYzg1My00NmRlLTg3MWUtNmRhZjI4NmNkNDFlIiwic2lkIjoiZDZiMzk5OWUtODQ4NS00MGEzLTgxZGQtZDlmYWFmMTU5NGVlIn0.nY8qANOjT1SlJuSxztQjG2r6lr-LzkpbgOQ5byvqpog",
  "access_expires_at": "2026-10-29T14:47:09.72676967Z",
  "refresh_token": "yDNRSuKrrazTAXkwKjAYK84_1u-xuZoVU4VuOleephk",
  "refresh_expires_at": "2026-10-30T02:32:09.726185017Z",
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
  "session_id": "dff17c4c-6a46-4be6-9ce1-cd75200a940e",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUyMzAsImlhdCI6MTc5MzI4NDMzMCwianRpIjoiOTgxOTY4MWQtYmVlOC00YWIzLWJmNTctOGMwNmUyNzQ3NDIzIiwic2lkIjoiZGZmMTdjNGMtNmE0Ni00YmU2LTljZTEtY2Q3NTIwMGE5NDBlIn0.eSfVWIURN1ZhOAIWN5IwMihZ3u7PFDPzqt0bg3iZZ9c",
  "access_expires_at": "2026-10-29T14:47:10.286544232Z",
  "refresh_token": "90l-cDtIijas5dfSeTr6H7nP5MW5ndQc9WZJfYU9vF4",
  "refresh_expires_at": "2026-10-30T02:32:10.2859871Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/074ceb3c-1c8b-437d-a54d-c5b9abd40850/attachments/118a3e17-a1c9-4b1e-83e5-63b9e559e783` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "05545940-64f8-4717-99b6-db4312ea2b1f",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "aa08db94-e5db-4738-8308-8f29576719bf",
  "upload_path": "/api/operator/v1/uploads/aa08db94-e5db-4738-8308-8f29576719bf",
  "expires_at": "2026-10-29T14:47:10.602612718Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/aa08db94-e5db-4738-8308-8f29576719bf` → **200**

```json
{
  "file_id": "aa08db94-e5db-4738-8308-8f29576719bf",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/074ceb3c-1c8b-437d-a54d-c5b9abd40850` → **200**

```json
{
  "id": "074ceb3c-1c8b-437d-a54d-c5b9abd40850",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d6e3bfae-181d-4197-a2a0-b4089e875f91",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T14:32:09.127379Z",
  "updated_at": "2026-10-29T14:32:09.127379Z",
  "respond_by": "2026-10-29T18:32:09.127379Z",
  "messages": [
    {
      "id": "945ee77e-df10-4c0f-a27f-7b7c84fb2142",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d6e3bfae-181d-4197-a2a0-b4089e875f91",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:32:09.128284Z",
      "attachments": [
        {
          "file_id": "118a3e17-a1c9-4b1e-83e5-63b9e559e783",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/074ceb3c-1c8b-437d-a54d-c5b9abd40850/comments` → **200**

```json
{
  "command_id": "53fec234-eace-453b-9866-527b721f799a",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "aa08db94-e5db-4738-8308-8f29576719bf"
  ]
}
```

```json
{
  "id": "074ceb3c-1c8b-437d-a54d-c5b9abd40850",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d6e3bfae-181d-4197-a2a0-b4089e875f91",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T14:32:09.127379Z",
  "updated_at": "2026-10-29T14:32:11.200899Z",
  "respond_by": "2026-10-29T18:32:09.127379Z",
  "messages": [
    {
      "id": "945ee77e-df10-4c0f-a27f-7b7c84fb2142",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d6e3bfae-181d-4197-a2a0-b4089e875f91",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:32:09.128284Z",
      "attachments": [
        {
          "file_id": "118a3e17-a1c9-4b1e-83e5-63b9e559e783",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "af7f666a-c88d-4ddc-a588-837f48f9a8ec",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T14:32:11.200425Z",
      "attachments": [
        {
          "file_id": "aa08db94-e5db-4738-8308-8f29576719bf",
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

`GET /api/rider/v1/support/cases/074ceb3c-1c8b-437d-a54d-c5b9abd40850` → **200**

```json
{
  "id": "074ceb3c-1c8b-437d-a54d-c5b9abd40850",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d6e3bfae-181d-4197-a2a0-b4089e875f91",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T14:32:09.127379Z",
  "updated_at": "2026-10-29T14:32:11.200899Z",
  "respond_by": "2026-10-29T18:32:09.127379Z",
  "messages": [
    {
      "id": "945ee77e-df10-4c0f-a27f-7b7c84fb2142",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d6e3bfae-181d-4197-a2a0-b4089e875f91",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:32:09.128284Z",
      "attachments": [
        {
          "file_id": "118a3e17-a1c9-4b1e-83e5-63b9e559e783",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "af7f666a-c88d-4ddc-a588-837f48f9a8ec",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T14:32:11.200425Z",
      "attachments": [
        {
          "file_id": "aa08db94-e5db-4738-8308-8f29576719bf",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/074ceb3c-1c8b-437d-a54d-c5b9abd40850/attachments/aa08db94-e5db-4738-8308-8f29576719bf` → **200**

Done: support case 074ceb3c-1c8b-437d-a54d-c5b9abd40850, rider attachment 118a3e17-a1c9-4b1e-83e5-63b9e559e783, operator attachment aa08db94-e5db-4738-8308-8f29576719bf.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737263666",
  "device_ref": "sandbox-2474"
}
```

```json
{
  "challenge_id": "7842fabc-7e17-4835-bd36-af96e5aa717e",
  "expires_at": "2026-10-29T14:37:11.796462772Z",
  "resend_available_at": "2026-10-29T14:32:12.796462772Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737263666` → **200**

```json
{
  "phone": "+380737263666",
  "audience": "CLIENT",
  "code": "125412",
  "sent_at": "2026-10-29T14:32:11.79910659Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7842fabc-7e17-4835-bd36-af96e5aa717e",
  "code": "125412",
  "device_ref": "sandbox-2474"
}
```

```json
{
  "session_id": "954c48e5-1eec-48f9-b175-18a8a3c4a998",
  "subject": {
    "type": "CLIENT",
    "id": "5438121f-4106-4de2-a83c-83d639fc7f3a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDM4MTIxZi00MTA2LTRkZTItYTgzYy04M2Q2MzlmYzdmM2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MjMyLCJpYXQiOjE3OTMyODQzMzIsImp0aSI6ImEwNjQ3NWFhLTMxYmItNDkyMC05MmIzLTlkZWJhOTAzMjFkZCIsInNpZCI6Ijk1NGM0OGU1LTFlZWMtNDhmOS1iMTc1LTE4YThhM2M0YTk5OCJ9.GJpy1UmVCJ4L-SxKnGYMlEF3Fku4-XYRHdjdR_y8YXE",
  "access_expires_at": "2026-10-29T14:47:12.112555458Z",
  "refresh_token": "nIzjHMyjx-kAHumNocjMhU3gry4P4UyrtAHH4Zn-7Ls",
  "refresh_expires_at": "2026-11-28T14:32:12.11201152Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "57af81a2-8124-433b-adde-f40f7813e866",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "9b1bec8c-342b-479e-b7fa-a2faab7cd185",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-9b1bec8c-342b-479e-b7fa-a2faab7cd185",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "e78a3efff2bf15e061174fcd23db59f0",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=9b1bec8c-342b-479e-b7fa-a2faab7cd185",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737263666"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=9b1bec8c-342b-479e-b7fa-a2faab7cd185",
  "expires_at": "2026-10-29T15:02:12.391171Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/9b1bec8c-342b-479e-b7fa-a2faab7cd185` → **200**

```json
{
  "id": "9b1bec8c-342b-479e-b7fa-a2faab7cd185",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T15:02:12.391171Z",
  "card": {
    "id": "e660134a-0d74-476a-a088-17babe1a0d0f",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5745",
    "card_type": "Visa",
    "created_at": "2026-10-29T14:32:12.67776Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "19db86d0-eadc-43c7-95fa-3c93f1bb533b",
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
  "id": "35becb8d-74ce-4b0a-972e-424b61c49e6a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:37:12.976839Z",
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
  "command_id": "4187f9f1-94bc-4d8e-803c-c8f2276f7e57",
  "quote_id": "35becb8d-74ce-4b0a-972e-424b61c49e6a",
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
  "id": "cb184b1d-6146-4698-9307-1805bbde5464",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5438121f-4106-4de2-a83c-83d639fc7f3a",
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
  "created_at": "2026-10-29T14:32:13.27482Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cb184b1d-6146-4698-9307-1805bbde5464` → **200**

```json
{
  "id": "cb184b1d-6146-4698-9307-1805bbde5464",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5438121f-4106-4de2-a83c-83d639fc7f3a",
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
  "created_at": "2026-10-29T14:32:13.27482Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cb184b1d-6146-4698-9307-1805bbde5464` → **200**

```json
{
  "id": "cb184b1d-6146-4698-9307-1805bbde5464",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5438121f-4106-4de2-a83c-83d639fc7f3a",
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
  "created_at": "2026-10-29T14:32:13.27482Z",
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

`GET /api/rider/v1/orders/cb184b1d-6146-4698-9307-1805bbde5464` → **200**

```json
{
  "id": "cb184b1d-6146-4698-9307-1805bbde5464",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5438121f-4106-4de2-a83c-83d639fc7f3a",
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
  "created_at": "2026-10-29T14:32:13.27482Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/cb184b1d-6146-4698-9307-1805bbde5464/switch-to-cash` → **200**

```json
{
  "command_id": "bda01c45-89cc-4fda-a6d7-51b9d836f970",
  "expected_version": 3
}
```

```json
{
  "id": "cb184b1d-6146-4698-9307-1805bbde5464",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "5438121f-4106-4de2-a83c-83d639fc7f3a",
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
  "created_at": "2026-10-29T14:32:13.27482Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/cb184b1d-6146-4698-9307-1805bbde5464/switch-to-cash` → **409**

```json
{
  "command_id": "cffb2b1c-a571-4a6e-bc39-cca3219c763f",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/cb184b1d-6146-4698-9307-1805bbde5464/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "97b05da4-11cb-4ddc-a28b-ac89688f5dd4"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/cb184b1d-6146-4698-9307-1805bbde5464` → **200**

```json
{
  "id": "cb184b1d-6146-4698-9307-1805bbde5464",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "5438121f-4106-4de2-a83c-83d639fc7f3a",
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
  "created_at": "2026-10-29T14:32:13.27482Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/cb184b1d-6146-4698-9307-1805bbde5464/cancel` → **200**

```json
{
  "command_id": "dda72e31-c829-4ec8-ac34-97bc9e5e9e7a",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "cb184b1d-6146-4698-9307-1805bbde5464",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "5438121f-4106-4de2-a83c-83d639fc7f3a",
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
  "created_at": "2026-10-29T14:32:13.27482Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
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
  "session_id": "e03406f0-d0bf-41d4-985c-4685ce22417c",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUyMzYsImlhdCI6MTc5MzI4NDMzNiwianRpIjoiYjIzNWRlNmEtZTA0Ni00NTZjLThmM2EtMWRiNzE0M2JiOGU5Iiwic2lkIjoiZTAzNDA2ZjAtZDBiZi00MWQ0LTk4NWMtNDY4NWNlMjI0MTdjIn0.sfE2NBUu4skDk2WAF9vhXN95_QKqIZuNyy6mmxBIK64",
  "access_expires_at": "2026-10-29T14:47:16.950045512Z",
  "refresh_token": "7snldEF7W8K3fVo9XyK20AZ-Z4tk1Tq9LXcINh1LH7U",
  "refresh_expires_at": "2026-10-30T02:32:16.949516633Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-7423"
}
```

```json
{
  "challenge_id": "f7c03587-4baa-4be5-a908-3ed5f80b001a",
  "expires_at": "2026-10-29T14:37:17.22410239Z",
  "resend_available_at": "2026-10-29T14:32:18.22410239Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "324473",
  "sent_at": "2026-10-29T14:32:17.227011112Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f7c03587-4baa-4be5-a908-3ed5f80b001a",
  "code": "324473",
  "device_ref": "sandbox-7423"
}
```

```json
{
  "session_id": "1e49ceef-69f9-40ac-9f3c-a587990c3cd9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTIzNywiaWF0IjoxNzkzMjg0MzM3LCJqdGkiOiI5YjE2ZjEyOC1jYmU3LTQ5NmEtYmYzOS1hNDI2NjQ4OWQ0MmQiLCJzaWQiOiIxZTQ5Y2VlZi02OWY5LTQwYWMtOWYzYy1hNTg3OTkwYzNjZDkifQ.wPPzAGsEWQH2aQRw4L5RAcxBUIJyP14hM2oHx8w29SQ",
  "access_expires_at": "2026-10-29T14:47:17.5297669Z",
  "refresh_token": "DfWOqb8VbipkzmzZYkqjGnUC8cxWn0GCEhKX0zFEXQw",
  "refresh_expires_at": "2026-11-28T14:32:17.529171383Z",
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
      "actor_id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T14:32:00.671628Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T14:32:02.12341Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "c72db24d-85b7-40de-974b-6865bfa9dedb",
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
  "device_ref": "sandbox-18158"
}
```

```json
{
  "challenge_id": "95e7679e-51f5-4120-b9b2-fa6cd47980d2",
  "expires_at": "2026-10-29T14:37:18.657045468Z",
  "resend_available_at": "2026-10-29T14:32:19.657045468Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "358699",
  "sent_at": "2026-10-29T14:32:18.659822463Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "95e7679e-51f5-4120-b9b2-fa6cd47980d2",
  "code": "358699",
  "device_ref": "sandbox-18158"
}
```

```json
{
  "session_id": "866120a2-a0a8-4a2e-8eb7-5b84ebb8eb83",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTIzOCwiaWF0IjoxNzkzMjg0MzM4LCJqdGkiOiI1NDYxNTEwYi0xNGFhLTRmNmYtOGYyOC03N2ZmYjA0NjFiNjAiLCJzaWQiOiI4NjYxMjBhMi1hMGE4LTRhMmUtOGViNy01Yjg0ZWJiOGViODMifQ.YoZErAfbVetM_JlPcKLrxU_MPnYMu-I36mcNo_1Asdg",
  "access_expires_at": "2026-10-29T14:47:18.964934816Z",
  "refresh_token": "Lo5Opv756QEFU-a-WsYa4-w0_L4lE1uxBUFYXWd0Spw",
  "refresh_expires_at": "2026-11-28T14:32:18.964400597Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "72770097-f72a-498a-997e-2e16139aaa32",
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
  "last_heartbeat_at": "2026-10-29T14:31:41.999284Z",
  "last_location_at": "2026-10-29T14:31:41.999284Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/72770097-f72a-498a-997e-2e16139aaa32/handover` → **200**

```json
{
  "command_id": "4667714c-0545-4789-b558-95302efa2850",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "72770097-f72a-498a-997e-2e16139aaa32",
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
  "last_heartbeat_at": "2026-10-29T14:31:41.999284Z",
  "last_location_at": "2026-10-29T14:31:41.999284Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/72770097-f72a-498a-997e-2e16139aaa32/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:32:19Z",
    "sequence": 1793284339798
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "72770097-f72a-498a-997e-2e16139aaa32",
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
  "last_heartbeat_at": "2026-10-29T14:32:19.816541Z",
  "last_location_at": "2026-10-29T14:32:19.816541Z",
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
  "command_id": "0866d224-6062-43e8-9471-643e0d2c0ba2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:32:20Z",
    "sequence": 1793284340359
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c1a4dcad-d915-4595-9d86-cf7b2c07dffc",
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
  "last_heartbeat_at": "2026-10-29T14:32:20.376745Z",
  "last_location_at": "2026-10-29T14:32:20.376745Z",
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
  "session_id": "f25861bd-b191-471e-a138-010c8a580134",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUyNDAsImlhdCI6MTc5MzI4NDM0MCwianRpIjoiZTVmYWQ0N2EtYjRhMy00ZDk1LWIyZWMtNjIzNWM2YjgzYTM3Iiwic2lkIjoiZjI1ODYxYmQtYjE5MS00NzFlLWExMzgtMDEwYzhhNTgwMTM0In0._nLYNzcdfpx7RonXwSWldpz8-E85hRJw_fe1C98P2_E",
  "access_expires_at": "2026-10-29T14:47:20.98017684Z",
  "refresh_token": "s2tLjFWFAa76gv0QAEJSyKMDUYcjKDQ4hvrXZsgZPzc",
  "refresh_expires_at": "2026-10-30T02:32:20.979694949Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c590fdba-23f8-469d-80cf-42f65cbba57c",
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
  "id": "b24f005a-484b-4e8a-a45f-baff8a0e6c30",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:37:21.260805Z",
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
  "command_id": "a3c55338-dfe5-4ba1-89c5-9bce3add46c4",
  "quote_id": "b24f005a-484b-4e8a-a45f-baff8a0e6c30",
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
  "id": "ac871206-bae1-4cc3-8732-1b79aca217b8",
  "short_number": 27,
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
  "created_at": "2026-10-29T14:32:21.559044Z",
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
    "id": "9c85c5ec-071b-41d5-8475-0bf73745879c",
    "order_id": "ac871206-bae1-4cc3-8732-1b79aca217b8",
    "expires_at": "2026-10-29T14:32:36.562819Z",
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

`POST /api/driver/v1/offers/9c85c5ec-071b-41d5-8475-0bf73745879c/accept` → **200**

```json
{
  "command_id": "271b5174-8022-46da-9fa9-0b8e91b970c2"
}
```

```json
{
  "id": "52fc8fbc-e852-4ee4-9824-c329ffab2e12",
  "order_id": "ac871206-bae1-4cc3-8732-1b79aca217b8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cedc43c1-1598-4ca2-ad8c-87e463c72401",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cedc43c1-1598-4ca2-ad8c-87e463c72401",
  "order_id": "ac871206-bae1-4cc3-8732-1b79aca217b8",
  "assignment_id": "52fc8fbc-e852-4ee4-9824-c329ffab2e12",
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

`POST /api/driver/v1/work-sessions/c1a4dcad-d915-4595-9d86-cf7b2c07dffc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:32:22Z",
    "sequence": 1793284342957
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c1a4dcad-d915-4595-9d86-cf7b2c07dffc",
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
  "last_heartbeat_at": "2026-10-29T14:32:22.976156Z",
  "last_location_at": "2026-10-29T14:32:22.976156Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/cedc43c1-1598-4ca2-ad8c-87e463c72401/arrive` → **200**

```json
{
  "command_id": "1c7e4215-ca12-4727-9bc5-99bbccb2264b",
  "expected_version": 0
}
```

```json
{
  "id": "cedc43c1-1598-4ca2-ad8c-87e463c72401",
  "order_id": "ac871206-bae1-4cc3-8732-1b79aca217b8",
  "assignment_id": "52fc8fbc-e852-4ee4-9824-c329ffab2e12",
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
  "arrived_at": "2026-10-29T14:32:23.263598Z",
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

`POST /api/driver/v1/trips/cedc43c1-1598-4ca2-ad8c-87e463c72401/start` → **200**

```json
{
  "command_id": "54a98da0-9395-4e70-8f31-576e129fea09",
  "expected_version": 1
}
```

```json
{
  "id": "cedc43c1-1598-4ca2-ad8c-87e463c72401",
  "order_id": "ac871206-bae1-4cc3-8732-1b79aca217b8",
  "assignment_id": "52fc8fbc-e852-4ee4-9824-c329ffab2e12",
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
  "arrived_at": "2026-10-29T14:32:23.263598Z",
  "started_at": "2026-10-29T14:32:23.553957Z",
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

`POST /api/driver/v1/trips/cedc43c1-1598-4ca2-ad8c-87e463c72401/complete` → **200**

```json
{
  "command_id": "f82b01e6-3a24-4794-9dcb-aa70bdd73c3e",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:32:23Z",
  "cash_received": true
}
```

```json
{
  "id": "cedc43c1-1598-4ca2-ad8c-87e463c72401",
  "order_id": "ac871206-bae1-4cc3-8732-1b79aca217b8",
  "assignment_id": "52fc8fbc-e852-4ee4-9824-c329ffab2e12",
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
  "arrived_at": "2026-10-29T14:32:23.263598Z",
  "started_at": "2026-10-29T14:32:23.553957Z",
  "completed_at": "2026-10-29T14:32:23.853647Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/ac871206-bae1-4cc3-8732-1b79aca217b8` → **200**

```json
{
  "id": "ac871206-bae1-4cc3-8732-1b79aca217b8",
  "short_number": 27,
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
    "id": "52fc8fbc-e852-4ee4-9824-c329ffab2e12",
    "order_id": "ac871206-bae1-4cc3-8732-1b79aca217b8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cedc43c1-1598-4ca2-ad8c-87e463c72401",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:32:21.559044Z",
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
  "session_id": "72770097-f72a-498a-997e-2e16139aaa32",
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
  "last_heartbeat_at": "2026-10-29T14:32:19.816541Z",
  "last_location_at": "2026-10-29T14:32:19.816541Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/72770097-f72a-498a-997e-2e16139aaa32/close` → **200**

```json
{
  "command_id": "939220e0-146e-4c47-aa1f-df828aed9a90",
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
  "session_id": "c1a4dcad-d915-4595-9d86-cf7b2c07dffc",
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
  "last_heartbeat_at": "2026-10-29T14:32:22.976156Z",
  "last_location_at": "2026-10-29T14:32:22.976156Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c1a4dcad-d915-4595-9d86-cf7b2c07dffc/close` → **200**

```json
{
  "command_id": "38361e38-6627-4ff3-96b2-00556dcbed1e",
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

Done: terminal order ac871206-bae1-4cc3-8732-1b79aca217b8 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12434"
}
```

```json
{
  "challenge_id": "165c6daf-dc01-4f57-94b5-f0cba668a3c0",
  "expires_at": "2026-10-29T14:37:28.841505888Z",
  "resend_available_at": "2026-10-29T14:32:29.841505888Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "069969",
  "sent_at": "2026-10-29T14:32:28.845356411Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "165c6daf-dc01-4f57-94b5-f0cba668a3c0",
  "code": "069969",
  "device_ref": "sandbox-12434"
}
```

```json
{
  "session_id": "04467930-b1ba-4928-b463-1f3219e86526",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTI0OSwiaWF0IjoxNzkzMjg0MzQ5LCJqdGkiOiI0MDc0ZTBkMi1kMWUyLTQ1ZjUtODk1ZC02ODc0ZTk3YWI3NjAiLCJzaWQiOiIwNDQ2NzkzMC1iMWJhLTQ5MjgtYjQ2My0xZjMyMTllODY1MjYifQ.BnY9qvc4dpuwcmLhnjJep8C2nRoamTyR2zjeBzA-NTQ",
  "access_expires_at": "2026-10-29T14:47:29.165048622Z",
  "refresh_token": "2MO8Z6F8Rn2oyFKtBKFGfQk4kWaN7zXtFRRi19GOLLg",
  "refresh_expires_at": "2026-11-28T14:32:29.164480194Z",
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
  "device_ref": "sandbox-21913"
}
```

```json
{
  "challenge_id": "7b2b0830-4607-4558-a186-32024f462fa2",
  "expires_at": "2026-10-29T14:37:29.710853193Z",
  "resend_available_at": "2026-10-29T14:32:30.710853193Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "090938",
  "sent_at": "2026-10-29T14:32:29.713524129Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7b2b0830-4607-4558-a186-32024f462fa2",
  "code": "090938",
  "device_ref": "sandbox-21913"
}
```

```json
{
  "session_id": "5ac59304-48e1-485c-a86a-6fe217395901",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTI1MCwiaWF0IjoxNzkzMjg0MzUwLCJqdGkiOiIyOWM1MzRkYi0zZGIyLTRiYWItYWYxMy1hN2UwOTFkZGMzMzEiLCJzaWQiOiI1YWM1OTMwNC00OGUxLTQ4NWMtYTg2YS02ZmUyMTczOTU5MDEifQ.Oj3tYBcCBZxuSMSvnXQymIT2esU06gzNmGQO5hIxafI",
  "access_expires_at": "2026-10-29T14:47:30.019811476Z",
  "refresh_token": "AnMHgxephAO3ZWLtrLJIA0ZdrAUaW9pcFRQoWBruoss",
  "refresh_expires_at": "2026-11-28T14:32:30.01924122Z",
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
  "device_ref": "sandbox-10388"
}
```

```json
{
  "challenge_id": "1d5f13d7-7877-418f-8606-1331715e203e",
  "expires_at": "2026-10-29T14:37:30.557101072Z",
  "resend_available_at": "2026-10-29T14:32:31.557101072Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "089236",
  "sent_at": "2026-10-29T14:32:30.559746028Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1d5f13d7-7877-418f-8606-1331715e203e",
  "code": "089236",
  "device_ref": "sandbox-10388"
}
```

```json
{
  "session_id": "04e9a104-a4ee-4537-ac64-bc355061c938",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTI1MCwiaWF0IjoxNzkzMjg0MzUwLCJqdGkiOiIwYmZhNzJjYi1iN2Y2LTRhZWYtOTFmOS1jMTU0ZTUwZmY3YWMiLCJzaWQiOiIwNGU5YTEwNC1hNGVlLTQ1MzctYWM2NC1iYzM1NTA2MWM5MzgifQ.TTF-9NeqRJG3eoHQK52fslIWq62QGdCwbP3dR3aolvI",
  "access_expires_at": "2026-10-29T14:47:30.887231887Z",
  "refresh_token": "ApUzF2gtgGS_0SoCV8-4r5f0MbCwYuYiL19j9YMlAvU",
  "refresh_expires_at": "2026-11-28T14:32:30.886577448Z",
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
  "phone": "+380698372484",
  "device_ref": "sandbox-7855"
}
```

```json
{
  "challenge_id": "e35bb255-462c-4922-affe-7d6cabfac948",
  "expires_at": "2026-10-29T14:37:31.441766437Z",
  "resend_available_at": "2026-10-29T14:32:32.441766437Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380698372484` → **200**

```json
{
  "phone": "+380698372484",
  "audience": "CLIENT",
  "code": "806017",
  "sent_at": "2026-10-29T14:32:31.444185294Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e35bb255-462c-4922-affe-7d6cabfac948",
  "code": "806017",
  "device_ref": "sandbox-7855"
}
```

```json
{
  "session_id": "90bb9e13-2d90-41fe-b2fa-27aacfec74b3",
  "subject": {
    "type": "CLIENT",
    "id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZDcxN2MyZi0wNzhkLTRiNWMtOGJjNC1iMDY1ZmQ0ZTJkNDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MjUxLCJpYXQiOjE3OTMyODQzNTEsImp0aSI6IjBmZmZjNjY2LTYwOTYtNGNiYi04ZDM1LTcwZTUwMTk1NWY0YyIsInNpZCI6IjkwYmI5ZTEzLTJkOTAtNDFmZS1iMmZhLTI3YWFjZmVjNzRiMyJ9.CgDMM8ieCmrGHgS2bzVtj47OxJjl61f2b4nBUMW0GU0",
  "access_expires_at": "2026-10-29T14:47:31.743981825Z",
  "refresh_token": "MzOGEz3fPEVhH4XpCQz4TYyazW_lDE4oESbY08ObTrE",
  "refresh_expires_at": "2026-11-28T14:32:31.743414684Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9e3873be-238f-4e03-bf27-f9ee06e733d5",
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
  "id": "6eed0be7-12bc-4383-b870-5bc69953fa5e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:37:32.023988Z",
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
  "command_id": "4634420f-4ce5-411c-909d-59026804d5d4",
  "quote_id": "6eed0be7-12bc-4383-b870-5bc69953fa5e",
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
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
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
  "blizz_orders_total": 28,
  "blizz_orders_cancelled_total": 14,
  "blizz_orders_unfulfilled_total": 1,
  "blizz_dispatch_first_offer_seconds_count": 18,
  "blizz_dispatch_assigned_seconds_count": 17,
  "blizz_offers_total": 20,
  "blizz_dispatch_excluded_total": 10,
  "blizz_sms_sent_total": 72
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 17
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 14.503867668
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.145700418
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 17.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 1.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="false"} 20.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="true"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="PHONE",preorder="false"} 6.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="DRIVER",reason="PASSENGER_ASKED"} 1.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="CHANGED_MIND"} 7.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="WAIT_TOO_LONG"} 1.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="NO_CARS"} 3.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="OTHER"} 2.0
blizz_orders_unfulfilled_total{application="blizz-taxi-server"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="CALLER",state="SENT"} 6.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="FAILED"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 65.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/092ea328-9acb-4caa-93d5-b269362a63f4` → **200**

```json
{
  "id": "092ea328-9acb-4caa-93d5-b269362a63f4",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2d717c2f-078d-4b5c-8bc4-b065fd4e2d49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:32:32.316871Z",
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
  "session_id": "434a4969-40b4-4345-aaac-5e72ea248ce1",
  "subject": {
    "type": "STAFF",
    "id": "d6d4f7e4-3042-463b-973a-b3447e4ed45a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmQ0ZjdlNC0zMDQyLTQ2M2ItOTczYS1iMzQ0N2U0ZWQ0NWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU0MzksImlhdCI6MTc5MzI4NDUzOSwianRpIjoiMDAwOGVlMWItZjI4Zi00OWE1LWExZTAtM2Q5YjdlMTU5Nzg4Iiwic2lkIjoiNDM0YTQ5NjktNDBiNC00MzQ1LWFhYWMtNWU3MmVhMjQ4Y2UxIn0.2Di_rM3Rb-qmXCVljZfp-IEtXaWpZ1Rfal0Owz-_ZQY",
  "access_expires_at": "2026-10-29T14:50:39.120958641Z",
  "refresh_token": "eO4o1223mYhbKH5ePrIT0KFq0HLsvsraSe53D-rxF34",
  "refresh_expires_at": "2026-10-30T02:35:39.120416507Z",
  "password_change_required": false
}
```

## The earlier card flows reconcile cleanly without moving money

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29"
}
```

```json
{
  "id": "7343b865-ca02-4475-a74a-60995bb3071b",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:35:39.418695Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:35:39.418744Z",
  "updated_at": "2026-10-29T14:35:39.436301Z",
  "finished_at": "2026-10-29T14:35:39.436301Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/7343b865-ca02-4475-a74a-60995bb3071b` → **200**

```json
{
  "run": {
    "id": "7343b865-ca02-4475-a74a-60995bb3071b",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T14:35:39.418695Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T14:35:39.418744Z",
    "updated_at": "2026-10-29T14:35:39.436301Z",
    "finished_at": "2026-10-29T14:35:39.436301Z",
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
  "day": "2026-10-29"
}
```

```json
{
  "id": "7343b865-ca02-4475-a74a-60995bb3071b",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:35:39.418695Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:35:39.418744Z",
  "updated_at": "2026-10-29T14:35:39.436301Z",
  "finished_at": "2026-10-29T14:35:39.436301Z",
  "version": 1
}
```

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29"
}
```

```json
{
  "id": "7343b865-ca02-4475-a74a-60995bb3071b",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:35:39.418695Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:35:39.418744Z",
  "updated_at": "2026-10-29T14:35:39.436301Z",
  "finished_at": "2026-10-29T14:35:39.436301Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/fc262492-8aca-4f92-afdb-b09a1af36c92` → **204**

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
  "day": "2026-10-29"
}
```

```json
{
  "id": "1306ae25-f9ba-4902-92f5-e2be1a351070",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:35:39.875956Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:35:39.875999Z",
  "updated_at": "2026-10-29T14:35:39.883333Z",
  "finished_at": "2026-10-29T14:35:39.883333Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/1306ae25-f9ba-4902-92f5-e2be1a351070` → **200**

```json
{
  "run": {
    "id": "1306ae25-f9ba-4902-92f5-e2be1a351070",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T14:35:39.875956Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T14:35:39.875999Z",
    "updated_at": "2026-10-29T14:35:39.883333Z",
    "finished_at": "2026-10-29T14:35:39.883333Z",
    "version": 1
  },
  "items": [
    {
      "id": "20e4b3b8-554c-4e7e-a9ef-fafcced41e6d",
      "run_id": "1306ae25-f9ba-4902-92f5-e2be1a351070",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "f79f6f32f76b38681272d28cca62823d2c81ba66a3e09aeaaf85f915be88d713",
      "reference_display": "sandbox-reconciliation-fc#####-8aca-4f92-afdb-b09a1af36c92",
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
      "provider_at": "2026-10-29T14:35:39Z",
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
  "day": "2026-10-29"
}
```

```json
{
  "id": "1306ae25-f9ba-4902-92f5-e2be1a351070",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:35:39.875956Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:35:39.875999Z",
  "updated_at": "2026-10-29T14:35:39.883333Z",
  "finished_at": "2026-10-29T14:35:39.883333Z",
  "version": 1
}
```

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29"
}
```

```json
{
  "id": "1306ae25-f9ba-4902-92f5-e2be1a351070",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:35:39.875956Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:35:39.875999Z",
  "updated_at": "2026-10-29T14:35:39.883333Z",
  "finished_at": "2026-10-29T14:35:39.883333Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/20e4b3b8-554c-4e7e-a9ef-fafcced41e6d/resolve` → **200**

```json
{
  "command_id": "ca5d6560-1df1-4525-86d4-d00fbf3eb387",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "20e4b3b8-554c-4e7e-a9ef-fafcced41e6d",
  "run_id": "1306ae25-f9ba-4902-92f5-e2be1a351070",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "f79f6f32f76b38681272d28cca62823d2c81ba66a3e09aeaaf85f915be88d713",
  "reference_display": "sandbox-reconciliation-fc#####-8aca-4f92-afdb-b09a1af36c92",
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
  "provider_at": "2026-10-29T14:35:39Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
  "resolved_at": "2026-10-29T14:35:40.310671Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/20e4b3b8-554c-4e7e-a9ef-fafcced41e6d/resolve` → **200**

```json
{
  "command_id": "ca5d6560-1df1-4525-86d4-d00fbf3eb387",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "20e4b3b8-554c-4e7e-a9ef-fafcced41e6d",
  "run_id": "1306ae25-f9ba-4902-92f5-e2be1a351070",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "f79f6f32f76b38681272d28cca62823d2c81ba66a3e09aeaaf85f915be88d713",
  "reference_display": "sandbox-reconciliation-fc#####-8aca-4f92-afdb-b09a1af36c92",
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
  "provider_at": "2026-10-29T14:35:39Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
  "resolved_at": "2026-10-29T14:35:40.310671Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/20e4b3b8-554c-4e7e-a9ef-fafcced41e6d/resolve` → **409**

```json
{
  "command_id": "4fc2f69a-1aed-423e-a6ba-351c56bc5200",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/20e4b3b8-554c-4e7e-a9ef-fafcced41e6d/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ed699739-d565-41a3-bb2c-ee2cd61eb454"
}
```

`GET /api/admin/v1/payment-reconciliations/1306ae25-f9ba-4902-92f5-e2be1a351070` → **200**

```json
{
  "run": {
    "id": "1306ae25-f9ba-4902-92f5-e2be1a351070",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T14:35:39.875956Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T14:35:39.875999Z",
    "updated_at": "2026-10-29T14:35:40.310671Z",
    "finished_at": "2026-10-29T14:35:39.883333Z",
    "version": 2
  },
  "items": [
    {
      "id": "20e4b3b8-554c-4e7e-a9ef-fafcced41e6d",
      "run_id": "1306ae25-f9ba-4902-92f5-e2be1a351070",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "f79f6f32f76b38681272d28cca62823d2c81ba66a3e09aeaaf85f915be88d713",
      "reference_display": "sandbox-reconciliation-fc#####-8aca-4f92-afdb-b09a1af36c92",
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
      "provider_at": "2026-10-29T14:35:39Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "d6d4f7e4-3042-463b-973a-b3447e4ed45a",
      "resolved_at": "2026-10-29T14:35:40.310671Z",
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
      "id": "1306ae25-f9ba-4902-92f5-e2be1a351070",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-29T14:35:39.875956Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T14:35:39.875999Z",
      "updated_at": "2026-10-29T14:35:40.310671Z",
      "finished_at": "2026-10-29T14:35:39.883333Z",
      "version": 2
    },
    {
      "id": "64343c14-46a7-43b7-9f95-d0c3d753b059",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-28",
      "period_from": "2026-10-27T22:00:00Z",
      "period_to": "2026-10-29T02:00:00Z",
      "observed_until": "2026-10-29T14:27:43.123106Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T14:27:43.123271Z",
      "updated_at": "2026-10-29T14:27:43.128936Z",
      "finished_at": "2026-10-29T14:27:43.128936Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/fc262492-8aca-4f92-afdb-b09a1af36c92` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29"
}
```

```json
{
  "id": "1306ae25-f9ba-4902-92f5-e2be1a351070",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:35:39.875956Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:35:39.875999Z",
  "updated_at": "2026-10-29T14:35:40.310671Z",
  "finished_at": "2026-10-29T14:35:39.883333Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.79328466334E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793284663484E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793284663484E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793284663485E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793284663485E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
