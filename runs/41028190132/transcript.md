# Sandbox transcript (2026-10-30T08:43:00Z, 70dedbf)

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
  "correlation_id": "8f5d3cb0-f756-4da1-9389-240e642b3cd0"
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
  "session_id": "6bd4c6d3-be16-4e41-9513-df8c081194d6",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2OTAsImlhdCI6MTc5MzM0OTc5MCwianRpIjoiMWFlOTE0Y2EtOTc2NC00M2UyLWJhNTctNDJhZWRiZjE1YmI3Iiwic2lkIjoiNmJkNGM2ZDMtYmUxNi00ZTQxLTk1MTMtZGY4YzA4MTE5NGQ2In0.wtaly1jBdE-N-8IhMJDI5SxVdvtVrYihWb3PdnEw9hE",
  "access_expires_at": "2026-10-30T08:58:10.641805795Z",
  "refresh_token": "sTL3vsKUsWX_Rg9rmBl0xD6dgeBDyov_Tn1crO6tCTI",
  "refresh_expires_at": "2026-10-30T20:43:10.639708927Z",
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
  "session_id": "502fece4-3ad8-4c03-adf2-dfc5ba7ee814",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2OTIsImlhdCI6MTc5MzM0OTc5MiwianRpIjoiYmRhZTljNDAtZWVlZi00MzI4LTg3ZDktZmFiMmY5M2RiODExIiwic2lkIjoiNTAyZmVjZTQtM2FkOC00YzAzLWFkZjItZGZjNWJhN2VlODE0In0.xTgGDNWYzkGO7pU9lBV0871WQC1KP4malribNy2ruj4",
  "access_expires_at": "2026-10-30T08:58:12.506467945Z",
  "refresh_token": "Xzgio85vjM2fk7niAMMeRvvVYKUkihrw7ByudR6Dvl0",
  "refresh_expires_at": "2026-10-30T20:43:12.505452203Z",
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
  "device_ref": "sandbox-14980"
}
```

```json
{
  "challenge_id": "61b3f1a6-7b4d-4f1f-9c4e-1918172afccc",
  "expires_at": "2026-10-30T08:48:13.133251811Z",
  "resend_available_at": "2026-10-30T08:43:14.133251811Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "818056",
  "sent_at": "2026-10-30T08:43:13.145539354Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "61b3f1a6-7b4d-4f1f-9c4e-1918172afccc",
  "code": "818056",
  "device_ref": "sandbox-14980"
}
```

```json
{
  "session_id": "9ba8452e-0831-475f-8b4d-444a0e3cd151",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDY5MywiaWF0IjoxNzkzMzQ5NzkzLCJqdGkiOiI1YjA4MjhjOC1kYjkyLTQwMDctYjFmNC1mYzQ0MmEwMDRlZjciLCJzaWQiOiI5YmE4NDUyZS0wODMxLTQ3NWYtOGI0ZC00NDRhMGUzY2QxNTEifQ.pXNLpjbtu_Q5D4ZbephHyrQwY1RPQFKoAKHia_52Xs0",
  "access_expires_at": "2026-10-30T08:58:13.530559025Z",
  "refresh_token": "cbQK6R2Pz0PbE1GhM7pZsAXurRAGt0KlLufZupvhkKA",
  "refresh_expires_at": "2026-11-29T08:43:13.529341594Z",
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
  "command_id": "2f275db9-d234-4c00-9887-ee89b52ec4dc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:43:14Z",
    "sequence": 1793349794115
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c0644df4-263f-48fb-9786-1cbceffa9eec",
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
  "last_heartbeat_at": "2026-10-30T08:43:14.26122Z",
  "last_location_at": "2026-10-30T08:43:14.26122Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636407945",
  "device_ref": "sandbox-11454"
}
```

```json
{
  "challenge_id": "bf6e0353-0725-45a1-8ba7-b834425b7860",
  "expires_at": "2026-10-30T08:48:14.582495449Z",
  "resend_available_at": "2026-10-30T08:43:15.582495449Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636407945` → **200**

```json
{
  "phone": "+380636407945",
  "audience": "CLIENT",
  "code": "802105",
  "sent_at": "2026-10-30T08:43:14.587364185Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bf6e0353-0725-45a1-8ba7-b834425b7860",
  "code": "802105",
  "device_ref": "sandbox-11454"
}
```

```json
{
  "session_id": "d00d6d6e-ae12-4a54-a0f7-07950556866e",
  "subject": {
    "type": "CLIENT",
    "id": "02af991d-5690-4bb1-b61d-47d89c9f7e67"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMmFmOTkxZC01NjkwLTRiYjEtYjYxZC00N2Q4OWM5ZjdlNjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNjk0LCJpYXQiOjE3OTMzNDk3OTQsImp0aSI6ImNjZWY0Nzc1LWUzZTYtNDgxYS1iNTdhLWIyMjZjZDQ0ZDc5OCIsInNpZCI6ImQwMGQ2ZDZlLWFlMTItNGE1NC1hMGY3LTA3OTUwNTU2ODY2ZSJ9.oH1iM7w2j6jUQD0fiVYLtEXueHXLpMsfYsj3zKYD6U4",
  "access_expires_at": "2026-10-30T08:58:14.899511444Z",
  "refresh_token": "NKPFRj5X2gD6KK2GfIKsXse7HfGQ2jPgtKGVBf_oewE",
  "refresh_expires_at": "2026-11-29T08:43:14.898643824Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ae04f260-40d7-4d65-a401-9d00d4cba893",
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
  "id": "03a90a9d-70fa-4144-be5e-f18685943ba0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:48:15.225564Z",
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
  "command_id": "8bb062ad-5eec-4d7f-af49-620f8a655b6e",
  "quote_id": "03a90a9d-70fa-4144-be5e-f18685943ba0",
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
  "id": "0daa033d-eb34-417b-900b-e5e5a707f1cf",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02af991d-5690-4bb1-b61d-47d89c9f7e67",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:43:15.612362Z",
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
    "id": "75a7c2bb-5433-4808-be62-6fbd598741f5",
    "order_id": "0daa033d-eb34-417b-900b-e5e5a707f1cf",
    "expires_at": "2026-10-30T08:43:30.623202Z",
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

`POST /api/driver/v1/offers/75a7c2bb-5433-4808-be62-6fbd598741f5/accept` → **200**

```json
{
  "command_id": "a9f94696-2774-411f-9ee1-ff2ad1248a8a"
}
```

```json
{
  "id": "d64f27fd-2f68-4699-a976-70fefd79f320",
  "order_id": "0daa033d-eb34-417b-900b-e5e5a707f1cf",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5c883456-c405-4581-afe5-6c6306ccafd0",
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
  "command_id": "35be2611-8e02-45c4-b00c-ce8bbdf95ce8",
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
  "changed_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T08:43:16.929884054Z"
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
  "id": "5c883456-c405-4581-afe5-6c6306ccafd0",
  "order_id": "0daa033d-eb34-417b-900b-e5e5a707f1cf",
  "assignment_id": "d64f27fd-2f68-4699-a976-70fefd79f320",
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

`POST /api/driver/v1/work-sessions/c0644df4-263f-48fb-9786-1cbceffa9eec/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:43:17Z",
    "sequence": 1793349797830
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c0644df4-263f-48fb-9786-1cbceffa9eec",
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
  "last_heartbeat_at": "2026-10-30T08:43:17.855708Z",
  "last_location_at": "2026-10-30T08:43:17.855708Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5c883456-c405-4581-afe5-6c6306ccafd0/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "f3fc463e-057b-4567-8f0c-07c5210ce94c",
  "expected_version": 0
}
```

```json
{
  "id": "5c883456-c405-4581-afe5-6c6306ccafd0",
  "order_id": "0daa033d-eb34-417b-900b-e5e5a707f1cf",
  "assignment_id": "d64f27fd-2f68-4699-a976-70fefd79f320",
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
  "arrived_at": "2026-10-30T08:43:18.168792Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5c883456-c405-4581-afe5-6c6306ccafd0/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "d588cbab-0b7f-4e93-bd3e-f2a0cd77f93b",
  "expected_version": 1
}
```

```json
{
  "id": "5c883456-c405-4581-afe5-6c6306ccafd0",
  "order_id": "0daa033d-eb34-417b-900b-e5e5a707f1cf",
  "assignment_id": "d64f27fd-2f68-4699-a976-70fefd79f320",
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
  "arrived_at": "2026-10-30T08:43:18.168792Z",
  "started_at": "2026-10-30T08:43:18.465929Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5c883456-c405-4581-afe5-6c6306ccafd0/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "4d57a2d1-c686-4c37-9b29-830aef0aedfc",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:43:18Z",
  "cash_received": true
}
```

```json
{
  "id": "5c883456-c405-4581-afe5-6c6306ccafd0",
  "order_id": "0daa033d-eb34-417b-900b-e5e5a707f1cf",
  "assignment_id": "d64f27fd-2f68-4699-a976-70fefd79f320",
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
  "arrived_at": "2026-10-30T08:43:18.168792Z",
  "started_at": "2026-10-30T08:43:18.465929Z",
  "completed_at": "2026-10-30T08:43:18.772012Z",
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
  "session_id": "c0644df4-263f-48fb-9786-1cbceffa9eec",
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
  "last_heartbeat_at": "2026-10-30T08:43:17.855708Z",
  "last_location_at": "2026-10-30T08:43:17.855708Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c0644df4-263f-48fb-9786-1cbceffa9eec/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "18869c61-cfed-49ef-a140-908f1e57743a",
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
  "command_id": "b2b5be0e-4c83-468e-a7e9-8d7457e3998d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:43:19Z",
    "sequence": 1793349799698
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
  "correlation_id": "e6714352-a549-4d58-ac14-424c41b1c9d2",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "4bf25ff1-f934-4651-a148-d42763521535",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:43:20Z",
    "sequence": 1793349800104
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "209021cf-4548-471f-8e0e-a0810c8435d5",
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
  "last_heartbeat_at": "2026-10-30T08:43:20.031908Z",
  "last_location_at": "2026-10-30T08:43:20.031908Z",
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
  "changed_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T08:43:16.929884Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "17aac3ad-f74b-4888-a182-e5937fff3e1b",
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
  "changed_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T08:43:20.631842964Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "209021cf-4548-471f-8e0e-a0810c8435d5",
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
  "last_heartbeat_at": "2026-10-30T08:43:20.031908Z",
  "last_location_at": "2026-10-30T08:43:20.031908Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/209021cf-4548-471f-8e0e-a0810c8435d5/close` → **200**

```json
{
  "command_id": "de9a89f2-c136-4c64-b979-700a45017ecc",
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
  "session_id": "919278e4-52ce-44e9-835d-293b4db1745f",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3MDEsImlhdCI6MTc5MzM0OTgwMSwianRpIjoiN2Q5YTJkZTUtMmQ0Mi00YjBhLWJlZjAtMDY2MzM3M2I4NDYzIiwic2lkIjoiOTE5Mjc4ZTQtNTJjZS00NGU5LTgzNWQtMjkzYjRkYjE3NDVmIn0.5ZavIYsVop3GF09lGJDxTyoOQdDaeb89-sKwB9OurPM",
  "access_expires_at": "2026-10-30T08:58:21.863620572Z",
  "refresh_token": "aTelqGkujm2W3RDBRfCFd9b4Pf0SBOtRY9gfGmCJ9_M",
  "refresh_expires_at": "2026-10-30T20:43:21.862849381Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "f467793a-77ee-4184-bbfd-b472f22dd0a0",
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
  "id": "91c79559-090f-4c18-9ba7-b38f6b92113a",
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
  "created_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
  "created_at": "2026-10-30T08:43:22.180823Z",
  "updated_at": "2026-10-30T08:43:22.180823Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634079256",
  "device_ref": "sandbox-25840"
}
```

```json
{
  "challenge_id": "43798048-ee08-4982-afc4-8c0c3a4704b5",
  "expires_at": "2026-10-30T08:48:22.484030049Z",
  "resend_available_at": "2026-10-30T08:43:23.484030049Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634079256` → **200**

```json
{
  "phone": "+380634079256",
  "audience": "CLIENT",
  "code": "938559",
  "sent_at": "2026-10-30T08:43:22.488407841Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "43798048-ee08-4982-afc4-8c0c3a4704b5",
  "code": "938559",
  "device_ref": "sandbox-25840"
}
```

```json
{
  "session_id": "cd81956d-4b19-4404-a72a-829e520fb9f6",
  "subject": {
    "type": "CLIENT",
    "id": "3189fe5e-b772-4374-a3aa-99c0c693062c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTg5ZmU1ZS1iNzcyLTQzNzQtYTNhYS05OWMwYzY5MzA2MmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNzAyLCJpYXQiOjE3OTMzNDk4MDIsImp0aSI6ImIxZjlmMmNkLTMxYWQtNDJlOS1iOTAzLWE3NmU5MTg5Y2QzZiIsInNpZCI6ImNkODE5NTZkLTRiMTktNDQwNC1hNzJhLTgyOWU1MjBmYjlmNiJ9.si45b9qFgj2jiWjTQsI2zJBjglQl8BFuzCQs_J67tb4",
  "access_expires_at": "2026-10-30T08:58:22.798806966Z",
  "refresh_token": "STqwAiJeOr5bFeGJKnGTn5H9TsrkTWHlCypTP3KWv6Y",
  "refresh_expires_at": "2026-11-29T08:43:22.798077639Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380634079256` → **200**

```json
{
  "client_id": "3189fe5e-b772-4374-a3aa-99c0c693062c"
}
```

`POST /api/admin/v1/rider-wallets/3189fe5e-b772-4374-a3aa-99c0c693062c/top-ups` → **201**

```json
{
  "command_id": "9421f74e-52bc-4f32-ba3a-20b70d80f2ff",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "3189fe5e-b772-4374-a3aa-99c0c693062c",
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
      "id": "b799f3e4-f917-4957-bcbb-77b09b0aa75b",
      "at": "2026-10-30T08:43:23.380459Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "89e6993f-21ee-4534-98f4-26dcf0ea1085",
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
  "id": "44f0efed-07f7-43ac-971d-783b4bc84653",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:48:23.695869Z",
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
      "id": "91c79559-090f-4c18-9ba7-b38f6b92113a",
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
  "device_ref": "sandbox-28122"
}
```

```json
{
  "challenge_id": "78629a04-ea28-44b1-a902-139fc5d0e30a",
  "expires_at": "2026-10-30T08:48:24.014374929Z",
  "resend_available_at": "2026-10-30T08:43:25.014374929Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "364385",
  "sent_at": "2026-10-30T08:43:24.01861273Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "78629a04-ea28-44b1-a902-139fc5d0e30a",
  "code": "364385",
  "device_ref": "sandbox-28122"
}
```

```json
{
  "session_id": "7cc950d5-5609-48f4-b877-96f66e1d59c3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDcwNCwiaWF0IjoxNzkzMzQ5ODA0LCJqdGkiOiI0ZDAwMTNiMy0zYWRmLTQ2NmEtOGUyNy00NTYyODM4NGJhNWYiLCJzaWQiOiI3Y2M5NTBkNS01NjA5LTQ4ZjQtYjg3Ny05NmY2NmUxZDU5YzMifQ.NtJSqpO9zgB37gkyxUgpRHcQPlQ8oB_F8NiMoO-gpMY",
  "access_expires_at": "2026-10-30T08:58:24.32863198Z",
  "refresh_token": "ug2ZemhPbcTbCKiR3fzAX_FFzXrWXqeGpH1ndM0IDCQ",
  "refresh_expires_at": "2026-11-29T08:43:24.327879645Z",
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
  "command_id": "11309576-2a78-4dce-baf1-6bd3f353a59f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:43:24Z",
    "sequence": 1793349804885
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6aa9eb4a-1e80-4da8-8eef-aebbfe613016",
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
  "last_heartbeat_at": "2026-10-30T08:43:24.906579Z",
  "last_location_at": "2026-10-30T08:43:24.906579Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "7eafc17c-d727-4c6f-abb4-e7d77e705ead",
  "quote_id": "44f0efed-07f7-43ac-971d-783b4bc84653",
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
  "id": "9fdeae8d-682f-4320-be83-8eadb4ac69f9",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3189fe5e-b772-4374-a3aa-99c0c693062c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:43:25.211861Z",
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
  "client_id": "3189fe5e-b772-4374-a3aa-99c0c693062c",
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
      "id": "b799f3e4-f917-4957-bcbb-77b09b0aa75b",
      "at": "2026-10-30T08:43:23.380459Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
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
    "id": "16a32b32-adbb-47fe-9ad3-84d49ac30cf6",
    "order_id": "9fdeae8d-682f-4320-be83-8eadb4ac69f9",
    "expires_at": "2026-10-30T08:43:40.220384Z",
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

`POST /api/driver/v1/offers/16a32b32-adbb-47fe-9ad3-84d49ac30cf6/accept` → **200**

```json
{
  "command_id": "7167db61-93d8-4db2-bd7a-70e625decde3"
}
```

```json
{
  "id": "2121731e-c287-45ed-9d66-ed8b1a7baf4e",
  "order_id": "9fdeae8d-682f-4320-be83-8eadb4ac69f9",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "063b1f75-43db-4c98-a958-08d518c12696",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "063b1f75-43db-4c98-a958-08d518c12696",
  "order_id": "9fdeae8d-682f-4320-be83-8eadb4ac69f9",
  "assignment_id": "2121731e-c287-45ed-9d66-ed8b1a7baf4e",
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

`POST /api/driver/v1/work-sessions/6aa9eb4a-1e80-4da8-8eef-aebbfe613016/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:43:26Z",
    "sequence": 1793349806696
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6aa9eb4a-1e80-4da8-8eef-aebbfe613016",
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
  "last_heartbeat_at": "2026-10-30T08:43:26.717004Z",
  "last_location_at": "2026-10-30T08:43:26.717004Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/063b1f75-43db-4c98-a958-08d518c12696/arrive` → **200**

```json
{
  "command_id": "45e65a97-7ece-42a8-a599-f95e0c0b0e05",
  "expected_version": 0
}
```

```json
{
  "id": "063b1f75-43db-4c98-a958-08d518c12696",
  "order_id": "9fdeae8d-682f-4320-be83-8eadb4ac69f9",
  "assignment_id": "2121731e-c287-45ed-9d66-ed8b1a7baf4e",
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
  "arrived_at": "2026-10-30T08:43:27.027892Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/063b1f75-43db-4c98-a958-08d518c12696/start` → **200**

```json
{
  "command_id": "89c9e677-51f9-4898-af28-1de25b1c29db",
  "expected_version": 1
}
```

```json
{
  "id": "063b1f75-43db-4c98-a958-08d518c12696",
  "order_id": "9fdeae8d-682f-4320-be83-8eadb4ac69f9",
  "assignment_id": "2121731e-c287-45ed-9d66-ed8b1a7baf4e",
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
  "arrived_at": "2026-10-30T08:43:27.027892Z",
  "started_at": "2026-10-30T08:43:27.347984Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/063b1f75-43db-4c98-a958-08d518c12696/complete` → **200**

```json
{
  "command_id": "d6a729d6-3623-4232-bd05-a7096d4a1414",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:43:27Z",
  "cash_received": true
}
```

```json
{
  "id": "063b1f75-43db-4c98-a958-08d518c12696",
  "order_id": "9fdeae8d-682f-4320-be83-8eadb4ac69f9",
  "assignment_id": "2121731e-c287-45ed-9d66-ed8b1a7baf4e",
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
  "arrived_at": "2026-10-30T08:43:27.027892Z",
  "started_at": "2026-10-30T08:43:27.347984Z",
  "completed_at": "2026-10-30T08:43:27.66716Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3189fe5e-b772-4374-a3aa-99c0c693062c",
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
      "id": "2ab6c36e-ade5-45c8-9a94-559917758f8c",
      "at": "2026-10-30T08:43:28.147763Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "9fdeae8d-682f-4320-be83-8eadb4ac69f9"
    },
    {
      "id": "b799f3e4-f917-4957-bcbb-77b09b0aa75b",
      "at": "2026-10-30T08:43:23.380459Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/91c79559-090f-4c18-9ba7-b38f6b92113a/archive` → **200**

```json
{
  "command_id": "e4100cf2-16b1-4c03-8e25-7cd6378b9136",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "91c79559-090f-4c18-9ba7-b38f6b92113a",
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
  "created_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
  "created_at": "2026-10-30T08:43:22.180823Z",
  "updated_at": "2026-10-30T08:43:31.269667Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6aa9eb4a-1e80-4da8-8eef-aebbfe613016",
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
  "last_heartbeat_at": "2026-10-30T08:43:26.717004Z",
  "last_location_at": "2026-10-30T08:43:26.717004Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6aa9eb4a-1e80-4da8-8eef-aebbfe613016/close` → **200**

```json
{
  "command_id": "5c1448dc-b626-4e95-996a-b9201f5967fd",
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

Done: order 9fdeae8d-682f-4320-be83-8eadb4ac69f9.

# Scenario: broadcast-claims

## Nobody is online in Warsaw; Piotr signs in on two phones, Anna goes online 10 km from the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-30657"
}
```

```json
{
  "challenge_id": "84903137-19f7-4149-86ae-9ba7e4025dfc",
  "expires_at": "2026-10-30T08:48:32.17522417Z",
  "resend_available_at": "2026-10-30T08:43:33.17522417Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "581442",
  "sent_at": "2026-10-30T08:43:32.179899899Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "84903137-19f7-4149-86ae-9ba7e4025dfc",
  "code": "581442",
  "device_ref": "sandbox-30657"
}
```

```json
{
  "session_id": "6f5ae704-c759-4bed-b7fa-faafa8fe1829",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDcxMiwiaWF0IjoxNzkzMzQ5ODEyLCJqdGkiOiI2Mzg4YjYzYy1lZWU4LTQ0ZWUtODY0OS05ZjhhNWQ5MzExMWYiLCJzaWQiOiI2ZjVhZTcwNC1jNzU5LTRiZWQtYjdmYS1mYWFmYThmZTE4MjkifQ.a_2yWmuHEx-B3ULtZqFqYr_Q4_y886A-kPEUsZQI13s",
  "access_expires_at": "2026-10-30T08:58:32.493733762Z",
  "refresh_token": "AKmViPR2_2Jdv5GEukSrXJ7vddSK834aC14JHksrPOk",
  "refresh_expires_at": "2026-11-29T08:43:32.493029933Z",
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
  "device_ref": "sandbox-11917"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "84d5daa6-8886-4792-a801-99d886f7da35",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-11917"
}
```

```json
{
  "challenge_id": "917d148a-e725-47ca-b461-50f48974ebf2",
  "expires_at": "2026-10-30T08:48:34.37453996Z",
  "resend_available_at": "2026-10-30T08:43:35.37453996Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "860782",
  "sent_at": "2026-10-30T08:43:34.378695896Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "917d148a-e725-47ca-b461-50f48974ebf2",
  "code": "860782",
  "device_ref": "sandbox-11917"
}
```

```json
{
  "session_id": "f46eb52f-9c61-4fac-b24c-234b5991edaf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDcxNCwiaWF0IjoxNzkzMzQ5ODE0LCJqdGkiOiI0YmRjMjUyNy1iYWM4LTRiNmItODkyYi1iZjgyZDk4OGExMTAiLCJzaWQiOiJmNDZlYjUyZi05YzYxLTRmYWMtYjI0Yy0yMzRiNTk5MWVkYWYifQ.3Nk98gqZjNkJXOCzWF3DA6nvTD5NM3xuLo40JACJF8Q",
  "access_expires_at": "2026-10-30T08:58:34.68888682Z",
  "refresh_token": "FPu4SmcfwP4uw35w5XQVIYLzlguEiv1Mt45WwmPVt9Q",
  "refresh_expires_at": "2026-11-29T08:43:34.688123074Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-2974"
}
```

```json
{
  "challenge_id": "6f233a6f-ec35-49f2-803b-d1e921a12e37",
  "expires_at": "2026-10-30T08:48:34.972876073Z",
  "resend_available_at": "2026-10-30T08:43:35.972876073Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "276505",
  "sent_at": "2026-10-30T08:43:34.976567399Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6f233a6f-ec35-49f2-803b-d1e921a12e37",
  "code": "276505",
  "device_ref": "sandbox-2974"
}
```

```json
{
  "session_id": "b5e39e8d-3e9c-4d9f-b1ca-17461f594735",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDcxNSwiaWF0IjoxNzkzMzQ5ODE1LCJqdGkiOiIxNGJhZjM2NS1hNWJiLTQyOWQtYjViZS1lZmEzNjE1N2IxNmMiLCJzaWQiOiJiNWUzOWU4ZC0zZTljLTRkOWYtYjFjYS0xNzQ2MWY1OTQ3MzUifQ.SoouMoZdAN33_dKDITfQf_X9h0giu81v6tdeMiVauKs",
  "access_expires_at": "2026-10-30T08:58:35.289228801Z",
  "refresh_token": "F9fLbC-XFbAAlPtkb79K6BJDKc1iEIy3WvNjncELCJg",
  "refresh_expires_at": "2026-11-29T08:43:35.288463634Z",
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
  "command_id": "77c0271a-946a-4f9a-b113-2a6be810bccc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:43:36Z",
    "sequence": 1793349816129
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "13f33564-cfa5-405e-9239-cc2732da3f9b",
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
  "last_heartbeat_at": "2026-10-30T08:43:36.149727Z",
  "last_location_at": "2026-10-30T08:43:36.149727Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600124301",
  "device_ref": "sandbox-17336"
}
```

```json
{
  "challenge_id": "d4e4e044-74c6-4dee-ac04-090317935908",
  "expires_at": "2026-10-30T08:48:36.453273717Z",
  "resend_available_at": "2026-10-30T08:43:37.453273717Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600124301` → **200**

```json
{
  "phone": "+48600124301",
  "audience": "CLIENT",
  "code": "892617",
  "sent_at": "2026-10-30T08:43:36.458000061Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d4e4e044-74c6-4dee-ac04-090317935908",
  "code": "892617",
  "device_ref": "sandbox-17336"
}
```

```json
{
  "session_id": "631e2fc0-133a-4131-9f11-9016af1a040b",
  "subject": {
    "type": "CLIENT",
    "id": "90576992-af37-43cd-b405-d3fabce73976"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MDU3Njk5Mi1hZjM3LTQzY2QtYjQwNS1kM2ZhYmNlNzM5NzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNzE2LCJpYXQiOjE3OTMzNDk4MTYsImp0aSI6ImQ3ZTE0ZDNmLThkNmMtNDhhMC04MzYyLWY3YWVmZGI0NTE4ZSIsInNpZCI6IjYzMWUyZmMwLTEzM2EtNDEzMS05ZjExLTkwMTZhZjFhMDQwYiJ9.J8FgdQX7_1dKFiLxXpnzahomaWnSQSeAmg9VPnCISdw",
  "access_expires_at": "2026-10-30T08:58:36.77072957Z",
  "refresh_token": "S-VUV2wRj0LiPsFq09W5mAqETAUPbJbS9cwkkRyFPm0",
  "refresh_expires_at": "2026-11-29T08:43:36.770009491Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d4e15db4-e26b-4914-9170-bfba7e3cc4f6",
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
  "id": "8c4b5289-0a9b-478f-acb2-531cb7fb1846",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:48:37.065747Z",
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
  "command_id": "ab59f153-3d7e-49c4-b0a1-270966d6fa8f",
  "quote_id": "8c4b5289-0a9b-478f-acb2-531cb7fb1846",
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
  "id": "ab25c636-fd66-4b22-aa3c-72f29f4ebd85",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "90576992-af37-43cd-b405-d3fabce73976",
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
  "created_at": "2026-10-30T08:43:37.364391Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab25c636-fd66-4b22-aa3c-72f29f4ebd85` → **200**

```json
{
  "id": "ab25c636-fd66-4b22-aa3c-72f29f4ebd85",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "90576992-af37-43cd-b405-d3fabce73976",
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
  "created_at": "2026-10-30T08:43:37.364391Z",
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

`POST /api/driver/v1/orders/ab25c636-fd66-4b22-aa3c-72f29f4ebd85/claim` → **422**

```json
{
  "command_id": "f1cb6b37-c654-480e-8e2c-e7866db38d67"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ab25c636-fd66-4b22-aa3c-72f29f4ebd85/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "9950ca64-b339-4f70-a9c9-cc4a57eb3153"
}
```

`GET /api/rider/v1/orders/ab25c636-fd66-4b22-aa3c-72f29f4ebd85` → **200**

```json
{
  "id": "ab25c636-fd66-4b22-aa3c-72f29f4ebd85",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "90576992-af37-43cd-b405-d3fabce73976",
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
  "created_at": "2026-10-30T08:43:37.364391Z",
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

`POST /api/driver/v1/orders/226c2d34-0f87-4721-a30d-5f84e4476180/claim` → **404**

```json
{
  "command_id": "6ba35e43-55cd-40a7-b203-004c13636578"
}
```

```json
{
  "instance": "/api/driver/v1/orders/226c2d34-0f87-4721-a30d-5f84e4476180/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ea42107a-148c-45de-b9fe-decc0d62f366"
}
```

`POST /api/driver/v1/orders/a0f236d4-08f8-4478-a36a-e5ea73ba570d/claim` → **404**

```json
{
  "command_id": "1c943202-2d26-4c68-8c07-cd36cb686b05"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a0f236d4-08f8-4478-a36a-e5ea73ba570d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "311181ea-d052-44d5-9f16-e253003b3755"
}
```

`POST /api/driver/v1/orders/d7716dc8-0e1f-4eb9-b4df-32e4947e2847/claim` → **404**

```json
{
  "command_id": "8b1496c5-a448-4bd7-9491-d6b96696ac0c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d7716dc8-0e1f-4eb9-b4df-32e4947e2847/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "32f5b97b-12f5-421d-80aa-fac3f2d1baee"
}
```

`POST /api/driver/v1/orders/49950cd0-76a4-48fb-99f4-e44d8e159f19/claim` → **404**

```json
{
  "command_id": "5fa0c652-a914-47a3-b813-1eba13233788"
}
```

```json
{
  "instance": "/api/driver/v1/orders/49950cd0-76a4-48fb-99f4-e44d8e159f19/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "91a80e70-619e-4a7e-ad8f-bddead67206e"
}
```

`POST /api/driver/v1/orders/d8702485-446d-4460-870e-c18cb9bbbbc1/claim` → **404**

```json
{
  "command_id": "87ffc122-40e7-4f97-8790-fec67b8cb2c5"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d8702485-446d-4460-870e-c18cb9bbbbc1/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c131c6a8-5a71-46ca-ae94-6a642dc28d45"
}
```

`POST /api/driver/v1/orders/f33bd429-7e3a-40c9-ad49-c2564cafad9e/claim` → **404**

```json
{
  "command_id": "ea68d1e0-3c39-4ff4-bb44-ede1809dd69a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f33bd429-7e3a-40c9-ad49-c2564cafad9e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5e46bcab-af28-4fb5-a856-768b2f1860ae"
}
```

`POST /api/driver/v1/orders/8d85006f-f432-4c53-bccb-6b6c2736df33/claim` → **404**

```json
{
  "command_id": "4c9ea00e-8c8e-4bfb-90cc-298e3d288efa"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8d85006f-f432-4c53-bccb-6b6c2736df33/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ade9a693-e306-4639-9be9-c3ad0afe2575"
}
```

`POST /api/driver/v1/orders/22744637-02f9-402b-b242-04b9111dccd9/claim` → **404**

```json
{
  "command_id": "c557f9fc-514a-4895-b9c3-b2ad3f697e4e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/22744637-02f9-402b-b242-04b9111dccd9/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b0aa1f1d-79a5-4d2f-ad8d-116be6afcc94"
}
```

`POST /api/driver/v1/orders/751027cd-e53f-4f52-8de4-eee30570c954/claim` → **404**

```json
{
  "command_id": "7c749cef-e439-4225-b040-22e68d4aee22"
}
```

```json
{
  "instance": "/api/driver/v1/orders/751027cd-e53f-4f52-8de4-eee30570c954/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "10491585-8fb7-4985-9c34-8c8d468d5ced"
}
```

`POST /api/driver/v1/orders/cf1ab268-109a-4f24-bf9a-e32efa054fc5/claim` → **404**

```json
{
  "command_id": "57bd291a-a17b-46ea-bb7b-5169054a6252"
}
```

```json
{
  "instance": "/api/driver/v1/orders/cf1ab268-109a-4f24-bf9a-e32efa054fc5/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5e1e4c62-f2a5-4e8d-8e33-f89288fe2fa7"
}
```

`POST /api/driver/v1/orders/eda19a9d-0e99-4825-8d91-791ceee12808/claim` → **404**

```json
{
  "command_id": "16b4d6e0-f996-4616-9328-fdd3a196d770"
}
```

```json
{
  "instance": "/api/driver/v1/orders/eda19a9d-0e99-4825-8d91-791ceee12808/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c6d4ddd0-ee24-4874-97dd-776b8f510165"
}
```

`POST /api/driver/v1/orders/1dc14ae6-54bb-4482-9770-c29769d2b329/claim` → **404**

```json
{
  "command_id": "3bb3a25c-2351-4709-9d22-89c46085e99d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1dc14ae6-54bb-4482-9770-c29769d2b329/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d15924d1-9dd2-4277-b328-d5d4a0bf0dc7"
}
```

`POST /api/driver/v1/orders/006de0d9-4e5b-4809-a4bb-a063e67a306e/claim` → **404**

```json
{
  "command_id": "752c2fb0-1d14-4a51-9d24-25c8c2b894f2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/006de0d9-4e5b-4809-a4bb-a063e67a306e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e50670c2-1cd2-431e-b443-fbe9ecd24bb8"
}
```

`POST /api/driver/v1/orders/aa2c811d-f57f-428d-abb4-f87d8461c21d/claim` → **404**

```json
{
  "command_id": "8541642c-6730-43eb-a1f9-016bfbc2ef9f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/aa2c811d-f57f-428d-abb4-f87d8461c21d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "eb26f9e2-ea3b-4232-a6ad-aebef224d372"
}
```

`POST /api/driver/v1/orders/c9295eaf-8f5d-443d-8f46-611c263b63ad/claim` → **404**

```json
{
  "command_id": "0ad37db3-8ffd-49f1-9d61-84586d127b65"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c9295eaf-8f5d-443d-8f46-611c263b63ad/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4cba62d9-0759-44d5-b006-8f3fd7984ad8"
}
```

`POST /api/driver/v1/orders/91343fe7-806f-48e7-ad82-cfcb30b4ab38/claim` → **404**

```json
{
  "command_id": "08699b21-6eb6-4cf7-b4e5-8931952ca6d3"
}
```

```json
{
  "instance": "/api/driver/v1/orders/91343fe7-806f-48e7-ad82-cfcb30b4ab38/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5e5dd2d2-346a-45d1-8786-3d9c7ee68b8e"
}
```

`POST /api/driver/v1/orders/f0a656b2-158c-45ee-9a67-0ba45fc0c868/claim` → **404**

```json
{
  "command_id": "e0dc49cf-b3d8-4129-9032-05a972b6e46d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f0a656b2-158c-45ee-9a67-0ba45fc0c868/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "bb27fb75-f152-428c-adbb-9b8e66936f8b"
}
```

`POST /api/driver/v1/orders/3f809006-3847-43ac-87a3-d27bcb09933a/claim` → **404**

```json
{
  "command_id": "c17c8a04-9d66-45d0-9d5a-206a9faaea8d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3f809006-3847-43ac-87a3-d27bcb09933a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ce1b04a6-1f95-4566-bd83-262aa5d1043f"
}
```

`POST /api/driver/v1/orders/78e65411-18c4-4c2b-8747-0199bd94c215/claim` → **404**

```json
{
  "command_id": "64129943-fafc-4bcf-85cb-f5500627754b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/78e65411-18c4-4c2b-8747-0199bd94c215/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e600ef83-6983-416f-9e35-5a9f7405bc97"
}
```

`POST /api/driver/v1/orders/52dddf62-26ad-4055-8b48-c5ff60e4cbff/claim` → **404**

```json
{
  "command_id": "73917325-2a39-4710-80d4-3f4524902e9b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/52dddf62-26ad-4055-8b48-c5ff60e4cbff/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "42626792-2e02-419b-a96f-624a652b9968"
}
```

`POST /api/driver/v1/orders/4f119956-84ad-4600-b2e4-6ba7579915cc/claim` → **404**

```json
{
  "command_id": "61434b09-24df-49ab-8806-b683bda6e386"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4f119956-84ad-4600-b2e4-6ba7579915cc/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8eacbf91-325d-427d-97bf-a40e02a01a89"
}
```

`POST /api/driver/v1/orders/29368654-bb14-4bcf-8b01-75ac063886dd/claim` → **404**

```json
{
  "command_id": "715cdf9e-fbee-40d7-8123-cfefab1696ad"
}
```

```json
{
  "instance": "/api/driver/v1/orders/29368654-bb14-4bcf-8b01-75ac063886dd/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0133850e-1cd3-484d-b4ef-95f556b3c870"
}
```

`POST /api/driver/v1/orders/d8ab9361-4dc2-497c-996b-decbde100a83/claim` → **404**

```json
{
  "command_id": "5e9ca99a-827f-4722-8990-55c72fc7b7d4"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d8ab9361-4dc2-497c-996b-decbde100a83/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3943f562-73ba-47b9-93ec-731d9209345e"
}
```

`POST /api/driver/v1/orders/3c18c884-e4cc-431c-8001-e9c5ad3017ca/claim` → **404**

```json
{
  "command_id": "8e61e4d7-26a5-4ad2-ae37-38d9f330bf8d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3c18c884-e4cc-431c-8001-e9c5ad3017ca/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b2fa8afa-b7f9-4ed1-9d43-85f4f626f480"
}
```

`POST /api/driver/v1/orders/699a7de0-cef0-4e81-af89-d9e82416caa6/claim` → **404**

```json
{
  "command_id": "a9644368-b1e8-445e-83c8-49dc6a9b7868"
}
```

```json
{
  "instance": "/api/driver/v1/orders/699a7de0-cef0-4e81-af89-d9e82416caa6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ab461297-ae19-48b6-a1fa-3066d70b2ac1"
}
```

`POST /api/driver/v1/orders/5c7aebb9-87f2-4ea2-8848-6dbc2bd85f56/claim` → **404**

```json
{
  "command_id": "10213fe6-1aeb-4312-918e-04b3095a2112"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5c7aebb9-87f2-4ea2-8848-6dbc2bd85f56/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "22deda61-303c-4e76-a8f4-493f36094854"
}
```

`POST /api/driver/v1/orders/d321bfa7-6900-4e9d-8431-dc033ed59897/claim` → **404**

```json
{
  "command_id": "19c18a63-9736-4b54-b98e-ca898ad6ef33"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d321bfa7-6900-4e9d-8431-dc033ed59897/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "28bad773-0a3c-4823-9ee0-3d5c88155dd7"
}
```

`POST /api/driver/v1/orders/fb088d8f-9eb7-4a1c-bc05-47b6e7a9e7dc/claim` → **404**

```json
{
  "command_id": "ee2c0256-3982-40b0-bec5-829ab308c09b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/fb088d8f-9eb7-4a1c-bc05-47b6e7a9e7dc/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2fb88e58-5308-49ec-a74f-e600ac9dc87c"
}
```

`POST /api/driver/v1/orders/881e1ef5-b09a-45a1-9daa-12bc523fdc76/claim` → **404**

```json
{
  "command_id": "79773269-01cf-45b6-a33c-bb19901a0bbe"
}
```

```json
{
  "instance": "/api/driver/v1/orders/881e1ef5-b09a-45a1-9daa-12bc523fdc76/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c17711a0-2e4d-44db-babd-a86ecf9be9ca"
}
```

`POST /api/driver/v1/orders/e114b47a-9e7b-436b-b069-e285247476fc/claim` → **429**

```json
{
  "command_id": "0510d8db-b82b-446a-8b6f-61fa34f0fe38"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e114b47a-9e7b-436b-b069-e285247476fc/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "b602dfaa-ef57-4c21-bcca-80205e5ea6f7",
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
  "command_id": "85a54bde-1ae0-441a-9700-1f933a708fa0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:43:48Z",
    "sequence": 1793349828112
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "fe78e0f5-4a93-418e-adcc-1d92cf761b5b",
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
  "last_heartbeat_at": "2026-10-30T08:43:48.13216Z",
  "last_location_at": "2026-10-30T08:43:48.13216Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "ab25c636-fd66-4b22-aa3c-72f29f4ebd85",
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

`POST /api/driver/v1/orders/ab25c636-fd66-4b22-aa3c-72f29f4ebd85/claim` → **409**

```json
{
  "command_id": "ea80dfd6-d068-4956-b328-205768fd0156"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ab25c636-fd66-4b22-aa3c-72f29f4ebd85/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d858b24e-50e9-4f33-a750-d4595e07fa37"
}
```

`POST /api/driver/v1/orders/ab25c636-fd66-4b22-aa3c-72f29f4ebd85/claim` → **200**

```json
{
  "command_id": "a1cb86c0-adcb-459f-914e-915dc4015ba7"
}
```

```json
{
  "id": "f1fe9db5-634e-45eb-a9fc-69d500f6569d",
  "order_id": "ab25c636-fd66-4b22-aa3c-72f29f4ebd85",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "9f741a75-d489-489e-b522-ca2c525f5d1e",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9f741a75-d489-489e-b522-ca2c525f5d1e",
  "order_id": "ab25c636-fd66-4b22-aa3c-72f29f4ebd85",
  "assignment_id": "f1fe9db5-634e-45eb-a9fc-69d500f6569d",
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

`POST /api/driver/v1/trips/9f741a75-d489-489e-b522-ca2c525f5d1e/cancel` → **200**

```json
{
  "command_id": "9d6238af-e22b-457a-a9e0-d69a10e71df2",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "9f741a75-d489-489e-b522-ca2c525f5d1e",
  "order_id": "ab25c636-fd66-4b22-aa3c-72f29f4ebd85",
  "assignment_id": "f1fe9db5-634e-45eb-a9fc-69d500f6569d",
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

`GET /api/rider/v1/orders/ab25c636-fd66-4b22-aa3c-72f29f4ebd85` → **200**

```json
{
  "id": "ab25c636-fd66-4b22-aa3c-72f29f4ebd85",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "90576992-af37-43cd-b405-d3fabce73976",
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
    "id": "f1fe9db5-634e-45eb-a9fc-69d500f6569d",
    "order_id": "ab25c636-fd66-4b22-aa3c-72f29f4ebd85",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "9f741a75-d489-489e-b522-ca2c525f5d1e",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T08:43:37.364391Z",
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
  "session_id": "13f33564-cfa5-405e-9239-cc2732da3f9b",
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
  "last_heartbeat_at": "2026-10-30T08:43:36.149727Z",
  "last_location_at": "2026-10-30T08:43:36.149727Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/13f33564-cfa5-405e-9239-cc2732da3f9b/close` → **200**

```json
{
  "command_id": "89a2c396-6d5f-4890-a972-e8a83093b012",
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
  "session_id": "fe78e0f5-4a93-418e-adcc-1d92cf761b5b",
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
  "last_heartbeat_at": "2026-10-30T08:43:48.13216Z",
  "last_location_at": "2026-10-30T08:43:48.13216Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fe78e0f5-4a93-418e-adcc-1d92cf761b5b/close` → **200**

```json
{
  "command_id": "79100e90-3113-4282-8c6a-1b738b9484b1",
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
  "session_id": "393f1535-7707-49d6-b54f-c0b425624353",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3MzEsImlhdCI6MTc5MzM0OTgzMSwianRpIjoiMWYxNjE1MmMtMTIzOC00OTkzLThiMDQtZmU4MmQ3NGY2NjE3Iiwic2lkIjoiMzkzZjE1MzUtNzcwNy00OWQ2LWI1NGYtYzBiNDI1NjI0MzUzIn0.0NvDkC3KeK1edtgCFLQySBqWtZjiS0x1_PymBWGg3X0",
  "access_expires_at": "2026-10-30T08:58:51.687365859Z",
  "refresh_token": "NyOrBnqZRfIAgmb7ChsA9hZBfdWh9H2EG-Z4zCV2eug",
  "refresh_expires_at": "2026-10-30T20:43:51.686558531Z",
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
  "command_id": "19e602e5-d4fc-4ed7-b3bc-fe69f4b28b83",
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
  "session_id": "7fe5dca2-4f8f-4ff2-8365-dabf2f274dce",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3MzIsImlhdCI6MTc5MzM0OTgzMiwianRpIjoiY2IwNTQ2ZjMtMDgwYi00ZmQ5LWFlNzktYTBiNTRjYWYyOGI0Iiwic2lkIjoiN2ZlNWRjYTItNGY4Zi00ZmYyLTgzNjUtZGFiZjJmMjc0ZGNlIn0.cjI1pq4UQhi9ie_kdMMuBxntWykX6kKyz3ma7N6R_Kc",
  "access_expires_at": "2026-10-30T08:58:52.913777178Z",
  "refresh_token": "zr9Vgwa2kOiVpPVmZ71ElzvySLKg_wq_BmXQSzqif4o",
  "refresh_expires_at": "2026-10-30T20:43:52.913195084Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.1938130939",
    "linkedid": "1730052700.1938130939",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672261000"
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
    "id": "1730052700.1938130939",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "75a2aaa0-9336-4517-9df7-a10a43c7d65c",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380672261000",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T08:43:53.206237Z",
      "answered_at": null,
      "ended_at": "2026-10-30T08:43:53.233104Z",
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
    "id": "1730052600.290947019",
    "linkedid": "1730052600.290947019",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672261000"
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
      "id": "8908afb5-9f39-43a4-8335-9eb8dd052ac0",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672261000",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T08:43:53.556982Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/8908afb5-9f39-43a4-8335-9eb8dd052ac0/answer` → **200**

```json
{
  "command_id": "29d7eb70-f809-47cc-a5dd-78317f47517b"
}
```

```json
{
  "id": "8908afb5-9f39-43a4-8335-9eb8dd052ac0",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672261000",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
  "order_ids": [],
  "started_at": "2026-10-30T08:43:53.556982Z",
  "answered_at": "2026-10-30T08:43:53.881222Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.290947019",
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
    "id": "1730052600.290947019",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "8908afb5-9f39-43a4-8335-9eb8dd052ac0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672261000",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
      "order_ids": [],
      "started_at": "2026-10-30T08:43:53.556982Z",
      "answered_at": "2026-10-30T08:43:53.881222Z",
      "ended_at": "2026-10-30T08:43:54.197082Z",
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
      "id": "8908afb5-9f39-43a4-8335-9eb8dd052ac0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672261000",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
      "order_ids": [],
      "started_at": "2026-10-30T08:43:53.556982Z",
      "answered_at": "2026-10-30T08:43:53.881222Z",
      "ended_at": "2026-10-30T08:43:54.197082Z",
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
      "id": "8908afb5-9f39-43a4-8335-9eb8dd052ac0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672261000",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
      "order_ids": [],
      "started_at": "2026-10-30T08:43:53.556982Z",
      "answered_at": "2026-10-30T08:43:53.881222Z",
      "ended_at": "2026-10-30T08:43:54.197082Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:43:58.809764Z"
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
      "id": "8908afb5-9f39-43a4-8335-9eb8dd052ac0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672261000",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
      "order_ids": [],
      "started_at": "2026-10-30T08:43:53.556982Z",
      "answered_at": "2026-10-30T08:43:53.881222Z",
      "ended_at": "2026-10-30T08:43:54.197082Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:43:58.809764Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/8908afb5-9f39-43a4-8335-9eb8dd052ac0/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/8908afb5-9f39-43a4-8335-9eb8dd052ac0/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=8908afb5-9f39-43a4-8335-9eb8dd052ac0` → **200**

```json
{
  "changes": [
    {
      "id": "64ae8d43-d617-4ea5-9b65-352890e85014",
      "occurred_at": "2026-10-30T08:43:59.450202Z",
      "actor_type": "STAFF",
      "actor_id": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "8908afb5-9f39-43a4-8335-9eb8dd052ac0",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"fde4b80c-3f55-45cf-99e9-361e73b22f43\", \"order_ids\": []}",
      "correlation_id": "8d501fbd-f208-45a8-bb91-7fc5572b4f83"
    },
    {
      "id": "37a0820d-a283-42bd-b51c-39365b0759a2",
      "occurred_at": "2026-10-30T08:43:59.419019Z",
      "actor_type": "STAFF",
      "actor_id": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "8908afb5-9f39-43a4-8335-9eb8dd052ac0",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"fde4b80c-3f55-45cf-99e9-361e73b22f43\", \"order_ids\": []}",
      "correlation_id": "b2f8ac78-33cb-45c4-81e7-391a48ad9e8b"
    }
  ]
}
```

Done: call 8908afb5-9f39-43a4-8335-9eb8dd052ac0 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-14642"
}
```

```json
{
  "challenge_id": "9b038771-8f05-4a62-927b-487211c4e8fe",
  "expires_at": "2026-10-30T08:48:59.772667742Z",
  "resend_available_at": "2026-10-30T08:44:00.772667742Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "585872",
  "sent_at": "2026-10-30T08:43:59.776442138Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9b038771-8f05-4a62-927b-487211c4e8fe",
  "code": "585872",
  "device_ref": "sandbox-14642"
}
```

```json
{
  "session_id": "1685d168-73e1-4d80-a153-7fb2285e961f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDc0MCwiaWF0IjoxNzkzMzQ5ODQwLCJqdGkiOiJmZDczMDdjYi1kMTg0LTQxZjEtYmI1My01YjZiODU2N2I2M2EiLCJzaWQiOiIxNjg1ZDE2OC03M2UxLTRkODAtYTE1My03ZmIyMjg1ZTk2MWYifQ.vA6xa6Ur1jt_Jiu8nE-BD2aRAPj6b3f3snCu9wlQSes",
  "access_expires_at": "2026-10-30T08:59:00.094885014Z",
  "refresh_token": "8HuPePndJU88eJFN3heVpjRXaeHEXSUMYnX6IRDVRww",
  "refresh_expires_at": "2026-11-29T08:44:00.094254555Z",
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
  "command_id": "2d60fac3-3597-41a0-b5af-734cfa6936ec",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:44:00Z",
    "sequence": 1793349840652
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7a2cc161-ba9f-48a3-a715-b0e498a69c8f",
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
  "last_heartbeat_at": "2026-10-30T08:44:00.672985Z",
  "last_location_at": "2026-10-30T08:44:00.672985Z",
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
  "session_id": "75970203-9c3c-4e36-831c-b5e10c7c194d",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3NDEsImlhdCI6MTc5MzM0OTg0MSwianRpIjoiMDYwMGQzOWQtMDI1OS00ZGZkLTg0ZWItMWQzYWVkYTBjMDE3Iiwic2lkIjoiNzU5NzAyMDMtOWMzYy00ZTM2LTgzMWMtYjVlMTBjN2MxOTRkIn0.CiV2_IW4gJczEUKmpj0qQUTC_c1qQKgPUIZgoESYf-w",
  "access_expires_at": "2026-10-30T08:59:01.254205615Z",
  "refresh_token": "pSmrh4CNom0eQEEPuvdtTP8p5bwt2h9IyieA5jKsgMA",
  "refresh_expires_at": "2026-10-30T20:44:01.253649409Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "0cecf11e-5247-47e9-9bf6-5faba5dcec6f",
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
  "id": "64e57a2f-9d93-4515-a1c9-a58603b98eff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:49:01.539028Z",
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
  "command_id": "9f02690e-ec7b-492c-8a31-fdcbffcdf886",
  "quote_id": "64e57a2f-9d93-4515-a1c9-a58603b98eff",
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
    "phone": "+380676664650"
  }
}
```

```json
{
  "id": "9a1157a6-6e10-4c0b-8661-5cf790b2ad9d",
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
  "created_at": "2026-10-30T08:44:01.863932Z",
  "caller": {
    "name": "Олена",
    "phone": "+380676664650"
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
    "id": "75dd53fd-761d-47fa-ab33-5f1239188c4d",
    "order_id": "9a1157a6-6e10-4c0b-8661-5cf790b2ad9d",
    "expires_at": "2026-10-30T08:44:16.869188Z",
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

`POST /api/driver/v1/offers/75dd53fd-761d-47fa-ab33-5f1239188c4d/accept` → **200**

```json
{
  "command_id": "71e95bca-c9de-40cf-a520-aba17fd26419"
}
```

```json
{
  "id": "597f8c9c-df9e-481d-86fa-bc9110cbed1a",
  "order_id": "9a1157a6-6e10-4c0b-8661-5cf790b2ad9d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e294eee8-0c16-4d8c-8895-5a59a29c11ba",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380676664650` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380676664650` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380676664650` → **200**

```json
[
  {
    "phone": "+380676664650",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:44:04.106112241Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676664650` → **200**

```json
[
  {
    "phone": "+380676664650",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:44:04.106112241Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380676664650` → **200**

```json
[
  {
    "phone": "+380676664650",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:44:04.106112241Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e294eee8-0c16-4d8c-8895-5a59a29c11ba",
  "order_id": "9a1157a6-6e10-4c0b-8661-5cf790b2ad9d",
  "assignment_id": "597f8c9c-df9e-481d-86fa-bc9110cbed1a",
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
    "phone": "+380676664650"
  }
}
```

`POST /api/driver/v1/work-sessions/7a2cc161-ba9f-48a3-a715-b0e498a69c8f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:44:05Z",
    "sequence": 1793349845183
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7a2cc161-ba9f-48a3-a715-b0e498a69c8f",
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
  "last_heartbeat_at": "2026-10-30T08:44:05.20228Z",
  "last_location_at": "2026-10-30T08:44:05.20228Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e294eee8-0c16-4d8c-8895-5a59a29c11ba/arrive` → **200**

```json
{
  "command_id": "45abab98-e0bb-4101-a7b9-4f5c8b56fb01",
  "expected_version": 0
}
```

```json
{
  "id": "e294eee8-0c16-4d8c-8895-5a59a29c11ba",
  "order_id": "9a1157a6-6e10-4c0b-8661-5cf790b2ad9d",
  "assignment_id": "597f8c9c-df9e-481d-86fa-bc9110cbed1a",
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
  "arrived_at": "2026-10-30T08:44:05.489642Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380676664650"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380676664650` → **200**

```json
[
  {
    "phone": "+380676664650",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:44:04.106112241Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676664650` → **200**

```json
[
  {
    "phone": "+380676664650",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:44:04.106112241Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676664650` → **200**

```json
[
  {
    "phone": "+380676664650",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:44:04.106112241Z"
  },
  {
    "phone": "+380676664650",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T08:44:07.11613306Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676664650` → **200**

```json
[
  {
    "phone": "+380676664650",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:44:04.106112241Z"
  },
  {
    "phone": "+380676664650",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T08:44:07.11613306Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380676664650` → **200**

```json
[
  {
    "phone": "+380676664650",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:44:04.106112241Z"
  },
  {
    "phone": "+380676664650",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T08:44:07.11613306Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/e294eee8-0c16-4d8c-8895-5a59a29c11ba/start` → **200**

```json
{
  "command_id": "f0d44b33-5fe1-4c00-853c-aaf8f040835b",
  "expected_version": 1
}
```

```json
{
  "id": "e294eee8-0c16-4d8c-8895-5a59a29c11ba",
  "order_id": "9a1157a6-6e10-4c0b-8661-5cf790b2ad9d",
  "assignment_id": "597f8c9c-df9e-481d-86fa-bc9110cbed1a",
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
  "arrived_at": "2026-10-30T08:44:05.489642Z",
  "started_at": "2026-10-30T08:44:07.914892Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380676664650"
  }
}
```

`POST /api/driver/v1/trips/e294eee8-0c16-4d8c-8895-5a59a29c11ba/complete` → **200**

```json
{
  "command_id": "8f560800-8354-46c1-b85b-d85131a28fab",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:44:08Z",
  "cash_received": true
}
```

```json
{
  "id": "e294eee8-0c16-4d8c-8895-5a59a29c11ba",
  "order_id": "9a1157a6-6e10-4c0b-8661-5cf790b2ad9d",
  "assignment_id": "597f8c9c-df9e-481d-86fa-bc9110cbed1a",
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
  "arrived_at": "2026-10-30T08:44:05.489642Z",
  "started_at": "2026-10-30T08:44:07.914892Z",
  "completed_at": "2026-10-30T08:44:08.219994Z",
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
  "session_id": "7a2cc161-ba9f-48a3-a715-b0e498a69c8f",
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
  "last_heartbeat_at": "2026-10-30T08:44:05.20228Z",
  "last_location_at": "2026-10-30T08:44:05.20228Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7a2cc161-ba9f-48a3-a715-b0e498a69c8f/close` → **200**

```json
{
  "command_id": "0b19aed3-119d-4050-b334-047d509bd10c",
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
  "phone": "+380632040117",
  "device_ref": "sandbox-4362"
}
```

```json
{
  "challenge_id": "b13f5ba7-c0c2-453e-8e01-34a9ef32f07c",
  "expires_at": "2026-10-30T08:49:09.119123811Z",
  "resend_available_at": "2026-10-30T08:44:10.119123811Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632040117` → **200**

```json
{
  "phone": "+380632040117",
  "audience": "CLIENT",
  "code": "127270",
  "sent_at": "2026-10-30T08:44:09.122355266Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b13f5ba7-c0c2-453e-8e01-34a9ef32f07c",
  "code": "127270",
  "device_ref": "sandbox-4362"
}
```

```json
{
  "session_id": "977df746-422c-41c7-a0b8-c698317740de",
  "subject": {
    "type": "CLIENT",
    "id": "7c7a67ed-da6c-4876-b8ff-4b6b35851751"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzdhNjdlZC1kYTZjLTQ4NzYtYjhmZi00YjZiMzU4NTE3NTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNzQ5LCJpYXQiOjE3OTMzNDk4NDksImp0aSI6IjhjNTIzOGI2LTU2YjYtNDUxZS05YmMwLTQ2ODRiMGEwYjBkNyIsInNpZCI6Ijk3N2RmNzQ2LTQyMmMtNDFjNy1hMGI4LWM2OTgzMTc3NDBkZSJ9.LnZT1NHxYpx0UBrbmyOCLBZsrReiGzSq_9lYBplWtFA",
  "access_expires_at": "2026-10-30T08:59:09.434185444Z",
  "refresh_token": "4nV6Yp5C9ca0xKfWk9XYxoouTKCyokUcCDItChxWY7M",
  "refresh_expires_at": "2026-11-29T08:44:09.433644888Z",
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
  "device_ref": "sandbox-12875"
}
```

```json
{
  "challenge_id": "33ce900e-fc42-400a-afb2-264f269243ef",
  "expires_at": "2026-10-30T08:49:10.005824122Z",
  "resend_available_at": "2026-10-30T08:44:11.005824122Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "404792",
  "sent_at": "2026-10-30T08:44:10.008598237Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "33ce900e-fc42-400a-afb2-264f269243ef",
  "code": "404792",
  "device_ref": "sandbox-12875"
}
```

```json
{
  "session_id": "63de03c1-ed3b-4863-a761-bf0cfac114b3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDc1MCwiaWF0IjoxNzkzMzQ5ODUwLCJqdGkiOiI2ZjU2NTUwMi00NDM5LTQwMzctOGZlMC02M2M2NDBkYjNiNGYiLCJzaWQiOiI2M2RlMDNjMS1lZDNiLTQ4NjMtYTc2MS1iZjBjZmFjMTE0YjMifQ.WMDLTGOA8W6G31N1GxpLZhbXuH9h25tz6wUn3srKunM",
  "access_expires_at": "2026-10-30T08:59:10.32565057Z",
  "refresh_token": "jrwWk_15jM3AppXsYs9TVL8RDNqUtB4ZfvA3u_thxEk",
  "refresh_expires_at": "2026-11-29T08:44:10.32495862Z",
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
  "session_id": "55a1cd39-3b30-4033-8cba-a46b0cc1fe1c",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3NTEsImlhdCI6MTc5MzM0OTg1MSwianRpIjoiNzRiMzAzMjktNTNhNi00MjY0LTk3NzctZTAwMGI2MDNkMmQzIiwic2lkIjoiNTVhMWNkMzktM2IzMC00MDMzLThjYmEtYTQ2YjBjYzFmZTFjIn0.yUt3htd7hTUJhOraisBkbuX71FYJO9HwND6YLO-aXhk",
  "access_expires_at": "2026-10-30T08:59:11.160968297Z",
  "refresh_token": "zGIz3l0zwFV9TClv2K_BRcCXHJybyfVVI0UQGKjOodI",
  "refresh_expires_at": "2026-10-30T20:44:11.160328627Z",
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
  "session_id": "e432c364-bee3-47ec-90f7-e3a948ee9f1f",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3NTEsImlhdCI6MTc5MzM0OTg1MSwianRpIjoiMDk4ODEzY2MtY2MyMS00Y2UwLWIzY2ItYjdhOTY4MTYyZmY2Iiwic2lkIjoiZTQzMmMzNjQtYmVlMy00N2VjLTkwZjctZTNhOTQ4ZWU5ZjFmIn0.cWlobCsaiovwUaRGCogneI55jww8fnES1Q__2X_kvEk",
  "access_expires_at": "2026-10-30T08:59:11.734583466Z",
  "refresh_token": "29koWKqkk3hUBdoYwEnmQHPOthbgP_aFX_M7FwJijbQ",
  "refresh_expires_at": "2026-10-30T20:44:11.734001213Z",
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
  "command_id": "4da6878a-e5d0-4681-b459-667da489d742",
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
  "id": "0e455a37-6a35-413a-8655-85baa6d14c59",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:49:12.314373Z",
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
  "command_id": "eb2bc293-dacb-4c41-a610-d1626a83d222",
  "quote_id": "0e455a37-6a35-413a-8655-85baa6d14c59",
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
  "id": "1b41aa79-8c22-412a-8bbb-480d169dc07c",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7c7a67ed-da6c-4876-b8ff-4b6b35851751",
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
  "created_at": "2026-10-30T08:44:12.605411Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1b41aa79-8c22-412a-8bbb-480d169dc07c` → **200**

```json
{
  "id": "1b41aa79-8c22-412a-8bbb-480d169dc07c",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7c7a67ed-da6c-4876-b8ff-4b6b35851751",
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
  "created_at": "2026-10-30T08:44:12.605411Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/1b41aa79-8c22-412a-8bbb-480d169dc07c/cancel` → **200**

```json
{
  "command_id": "bbada856-bf70-470d-bc35-8de91306f5ff",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "1b41aa79-8c22-412a-8bbb-480d169dc07c",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7c7a67ed-da6c-4876-b8ff-4b6b35851751",
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
  "created_at": "2026-10-30T08:44:12.605411Z",
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
  "command_id": "7ea67a1c-0b62-45c4-ab30-d58848932752",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:44:13Z",
    "sequence": 1793349853818
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "73360dc9-37bf-4d3a-b1a4-9a1376a5ecf6",
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
  "last_heartbeat_at": "2026-10-30T08:44:13.838363Z",
  "last_location_at": "2026-10-30T08:44:13.838363Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-18747"
}
```

```json
{
  "challenge_id": "f9288c71-cada-42dd-a73c-1254bc4a31bd",
  "expires_at": "2026-10-30T08:49:14.124753407Z",
  "resend_available_at": "2026-10-30T08:44:15.124753407Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "777895",
  "sent_at": "2026-10-30T08:44:14.127522368Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f9288c71-cada-42dd-a73c-1254bc4a31bd",
  "code": "777895",
  "device_ref": "sandbox-18747"
}
```

```json
{
  "session_id": "d66f0e2c-dd4d-4415-9711-7d6a4d2b888d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDc1NCwiaWF0IjoxNzkzMzQ5ODU0LCJqdGkiOiIyNjRjZTVkOS01MTJkLTRiM2YtODFlMS05ZWNlZWQ1ZDgxNmIiLCJzaWQiOiJkNjZmMGUyYy1kZDRkLTQ0MTUtOTcxMS03ZDZhNGQyYjg4OGQifQ.HRVqwdao25Bn-gbJHi1Hj6lJwRBELgiLpcXFIFOgVhQ",
  "access_expires_at": "2026-10-30T08:59:14.436990172Z",
  "refresh_token": "MwuTSywtb4gEF8eHA8R5dPqglUqJgV5mUY3UCW5zePw",
  "refresh_expires_at": "2026-11-29T08:44:14.436355775Z",
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
  "command_id": "76af8fa8-74e8-43e8-967c-ec686e3573e2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:44:14Z",
    "sequence": 1793349854985
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "cf3d3c86-7624-42d4-b844-b08c3144ec70",
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
  "last_heartbeat_at": "2026-10-30T08:44:15.005227Z",
  "last_location_at": "2026-10-30T08:44:15.005227Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0d1d291d-ddc8-44fb-a3ed-ff40efef055a",
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
  "id": "f623bd18-0787-4132-a1ca-e11645b2b352",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:49:15.290925Z",
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
  "command_id": "d283a1b2-bf85-4a7d-b82f-65183d6ad6b2",
  "quote_id": "f623bd18-0787-4132-a1ca-e11645b2b352",
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
  "id": "81461a6d-f211-44c0-93aa-228c99071f0d",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7c7a67ed-da6c-4876-b8ff-4b6b35851751",
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
  "created_at": "2026-10-30T08:44:15.592077Z",
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
    "id": "1a88e44c-7890-4633-b60a-a76c75f76bc5",
    "order_id": "81461a6d-f211-44c0-93aa-228c99071f0d",
    "expires_at": "2026-10-30T08:44:30.595699Z",
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

`POST /api/driver/v1/offers/1a88e44c-7890-4633-b60a-a76c75f76bc5/accept` → **200**

```json
{
  "command_id": "3f56e5b5-790d-42fe-86d3-e1f8a507dd42"
}
```

```json
{
  "id": "e8e8ccd0-240c-49a4-8fe0-525b10698904",
  "order_id": "81461a6d-f211-44c0-93aa-228c99071f0d",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fb4cd029-f1d1-42f5-af65-055fa00ecec6",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fb4cd029-f1d1-42f5-af65-055fa00ecec6",
  "order_id": "81461a6d-f211-44c0-93aa-228c99071f0d",
  "assignment_id": "e8e8ccd0-240c-49a4-8fe0-525b10698904",
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

`POST /api/driver/v1/trips/fb4cd029-f1d1-42f5-af65-055fa00ecec6/cancel` → **200**

```json
{
  "command_id": "985e1920-2fa5-441b-95af-14e2ea8b49d6",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "fb4cd029-f1d1-42f5-af65-055fa00ecec6",
  "order_id": "81461a6d-f211-44c0-93aa-228c99071f0d",
  "assignment_id": "e8e8ccd0-240c-49a4-8fe0-525b10698904",
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

`GET /api/rider/v1/orders/81461a6d-f211-44c0-93aa-228c99071f0d` → **200**

```json
{
  "id": "81461a6d-f211-44c0-93aa-228c99071f0d",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "7c7a67ed-da6c-4876-b8ff-4b6b35851751",
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
    "id": "e8e8ccd0-240c-49a4-8fe0-525b10698904",
    "order_id": "81461a6d-f211-44c0-93aa-228c99071f0d",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "fb4cd029-f1d1-42f5-af65-055fa00ecec6",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T08:44:15.592077Z",
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
    "id": "e53ef5ae-552a-4992-a6ba-5bc77c74c711",
    "order_id": "81461a6d-f211-44c0-93aa-228c99071f0d",
    "expires_at": "2026-10-30T08:44:31.787325Z",
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

`POST /api/driver/v1/offers/e53ef5ae-552a-4992-a6ba-5bc77c74c711/accept` → **200**

```json
{
  "command_id": "1ef95b53-e64f-48d8-b94e-cca0ee627246"
}
```

```json
{
  "id": "c2de0291-1280-4968-b08f-77c7cf4db83a",
  "order_id": "81461a6d-f211-44c0-93aa-228c99071f0d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a22d6b16-2a6a-4175-a1dd-19007f60b9c9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a22d6b16-2a6a-4175-a1dd-19007f60b9c9",
  "order_id": "81461a6d-f211-44c0-93aa-228c99071f0d",
  "assignment_id": "c2de0291-1280-4968-b08f-77c7cf4db83a",
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

`POST /api/driver/v1/trips/a22d6b16-2a6a-4175-a1dd-19007f60b9c9/cancel` → **200**

```json
{
  "command_id": "52413297-ec4b-4efd-a601-458a8bc89bf5",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "a22d6b16-2a6a-4175-a1dd-19007f60b9c9",
  "order_id": "81461a6d-f211-44c0-93aa-228c99071f0d",
  "assignment_id": "c2de0291-1280-4968-b08f-77c7cf4db83a",
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
    "id": "81461a6d-f211-44c0-93aa-228c99071f0d",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-30T08:44:15.592077Z",
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
    "id": "1b41aa79-8c22-412a-8bbb-480d169dc07c",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T08:44:12.605411Z",
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

`GET /api/operator/v1/orders/81461a6d-f211-44c0-93aa-228c99071f0d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:44:15.592632Z",
      "actor": {
        "type": "CLIENT",
        "id": "7c7a67ed-da6c-4876-b8ff-4b6b35851751",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "81461a6d-f211-44c0-93aa-228c99071f0d",
        "quote_id": "f623bd18-0787-4132-a1ca-e11645b2b352",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "23bc2f34-4380-4d2d-b54b-fe365ea3be00"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:44:15.594796Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "81461a6d-f211-44c0-93aa-228c99071f0d",
        "attempt_id": "97b192bc-e0d3-4504-ad33-5aec533cf603",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "23bc2f34-4380-4d2d-b54b-fe365ea3be00"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:44:15.602063Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1a88e44c-7890-4633-b60a-a76c75f76bc5",
        "order_id": "81461a6d-f211-44c0-93aa-228c99071f0d",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "23bc2f34-4380-4d2d-b54b-fe365ea3be00"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T08:44:16.189079Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "1a88e44c-7890-4633-b60a-a76c75f76bc5",
        "order_id": "81461a6d-f211-44c0-93aa-228c99071f0d",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "e8e8ccd0-240c-49a4-8fe0-525b10698904"
      },
      "correlation_id": "ba52b419-eee7-4ceb-854f-2dab3f50612e"
```

Done: orders 1b41aa79-8c22-412a-8bbb-480d169dc07c, 81461a6d-f211-44c0-93aa-228c99071f0d.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734461571",
  "device_ref": "sandbox-19408"
}
```

```json
{
  "challenge_id": "51f426e8-3235-493e-8c6d-8f19afcbdb7e",
  "expires_at": "2026-10-30T08:49:19.162013926Z",
  "resend_available_at": "2026-10-30T08:44:20.162013926Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734461571` → **200**

```json
{
  "phone": "+380734461571",
  "audience": "CLIENT",
  "code": "671188",
  "sent_at": "2026-10-30T08:44:19.164803756Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "51f426e8-3235-493e-8c6d-8f19afcbdb7e",
  "code": "671188",
  "device_ref": "sandbox-19408"
}
```

```json
{
  "session_id": "bc016f4e-829b-4c12-8ca3-6cda276b4f9c",
  "subject": {
    "type": "CLIENT",
    "id": "4bed269e-1ee2-48e9-bd98-f49cbb9e5ac3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YmVkMjY5ZS0xZWUyLTQ4ZTktYmQ5OC1mNDljYmI5ZTVhYzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNzU5LCJpYXQiOjE3OTMzNDk4NTksImp0aSI6ImNhNWY2NjI0LWE5MDQtNGQ2ZS04ZmM4LTYyMTdhYmUwYTA4OSIsInNpZCI6ImJjMDE2ZjRlLTgyOWItNGMxMi04Y2EzLTZjZGEyNzZiNGY5YyJ9.FWvKoi8yFBgNOUQDlmo6raXv05ElCheeuuGn1zVBjPM",
  "access_expires_at": "2026-10-30T08:59:19.4742818Z",
  "refresh_token": "3uLkOLFM6wXISuQSmFh-SOZYcUBzreXNZr8KoHkoQR8",
  "refresh_expires_at": "2026-11-29T08:44:19.473734962Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "d5f479c6-341d-4d39-843f-389bd34bdad2",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "8bad5aeb-770f-476a-98d3-d1b56fc2de95",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-8bad5aeb-770f-476a-98d3-d1b56fc2de95",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "c9504b97495e50800449d915c6c284b5",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=8bad5aeb-770f-476a-98d3-d1b56fc2de95",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734461571"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=8bad5aeb-770f-476a-98d3-d1b56fc2de95",
  "expires_at": "2026-10-30T09:14:19.75615Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/8bad5aeb-770f-476a-98d3-d1b56fc2de95` → **200**

```json
{
  "id": "8bad5aeb-770f-476a-98d3-d1b56fc2de95",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T09:14:19.75615Z",
  "card": {
    "id": "ee2b75bd-1696-49cb-b504-815fb594c657",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6265",
    "card_type": "Visa",
    "created_at": "2026-10-30T08:44:20.05335Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "ee2b75bd-1696-49cb-b504-815fb594c657",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****6265",
      "card_type": "Visa",
      "created_at": "2026-10-30T08:44:20.05335Z"
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
  "device_ref": "sandbox-27394"
}
```

```json
{
  "challenge_id": "9b1604f4-ef6f-43f2-ab7d-b51546a82ce1",
  "expires_at": "2026-10-30T08:49:20.632128631Z",
  "resend_available_at": "2026-10-30T08:44:21.632128631Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "437341",
  "sent_at": "2026-10-30T08:44:20.635178321Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9b1604f4-ef6f-43f2-ab7d-b51546a82ce1",
  "code": "437341",
  "device_ref": "sandbox-27394"
}
```

```json
{
  "session_id": "51c3568d-615e-4082-8c20-44108effea5e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDc2MCwiaWF0IjoxNzkzMzQ5ODYwLCJqdGkiOiJlMDZlZmZjNC1mMmFjLTQ4ZDMtYjU0My1lZDEwZDkwNTc2MWMiLCJzaWQiOiI1MWMzNTY4ZC02MTVlLTQwODItOGMyMC00NDEwOGVmZmVhNWUifQ.Cdwe-m56X-o4OqcNFVcC7GA9EcXPi6QsoUYs1Q7ZEBs",
  "access_expires_at": "2026-10-30T08:59:20.944110595Z",
  "refresh_token": "HqEEb-g011XqBYOIHObSpjkWhZR8GbyuOYeW8mYM6OQ",
  "refresh_expires_at": "2026-11-29T08:44:20.943560473Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "cf3d3c86-7624-42d4-b844-b08c3144ec70",
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
  "last_heartbeat_at": "2026-10-30T08:44:15.005227Z",
  "last_location_at": "2026-10-30T08:44:15.005227Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cf3d3c86-7624-42d4-b844-b08c3144ec70/handover` → **200**

```json
{
  "command_id": "e3967921-880e-4423-a8ea-4dec27986b1d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "cf3d3c86-7624-42d4-b844-b08c3144ec70",
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
  "last_heartbeat_at": "2026-10-30T08:44:15.005227Z",
  "last_location_at": "2026-10-30T08:44:15.005227Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cf3d3c86-7624-42d4-b844-b08c3144ec70/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:44:21Z",
    "sequence": 1793349861793
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "cf3d3c86-7624-42d4-b844-b08c3144ec70",
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
  "last_heartbeat_at": "2026-10-30T08:44:21.812625Z",
  "last_location_at": "2026-10-30T08:44:21.812625Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a2490001-b0e0-481b-843c-57b3a4c09fff",
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
  "id": "9c7d55ce-4b2a-43c6-a5b9-9b112f2a575c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:49:22.116117Z",
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
  "command_id": "b20c02d9-11be-4c42-94ae-1729bdcea2d0",
  "quote_id": "9c7d55ce-4b2a-43c6-a5b9-9b112f2a575c",
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
  "id": "45a88345-919c-4eb5-9033-1a9f52797274",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4bed269e-1ee2-48e9-bd98-f49cbb9e5ac3",
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
  "created_at": "2026-10-30T08:44:22.426075Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/45a88345-919c-4eb5-9033-1a9f52797274` → **200**

```json
{
  "id": "45a88345-919c-4eb5-9033-1a9f52797274",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4bed269e-1ee2-48e9-bd98-f49cbb9e5ac3",
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
  "created_at": "2026-10-30T08:44:22.426075Z",
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
    "id": "9007fd7a-d8b8-4a75-80ab-f85325cff001",
    "order_id": "45a88345-919c-4eb5-9033-1a9f52797274",
    "expires_at": "2026-10-30T08:44:37.505618Z",
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

`POST /api/driver/v1/offers/9007fd7a-d8b8-4a75-80ab-f85325cff001/accept` → **200**

```json
{
  "command_id": "c804d331-7617-421a-b5eb-15fc070a8090"
}
```

```json
{
  "id": "53438ea8-3557-4424-aff8-6f022eaa76c8",
  "order_id": "45a88345-919c-4eb5-9033-1a9f52797274",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cb9593cf-1757-4fa4-b344-f29defc2bb8f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cb9593cf-1757-4fa4-b344-f29defc2bb8f",
  "order_id": "45a88345-919c-4eb5-9033-1a9f52797274",
  "assignment_id": "53438ea8-3557-4424-aff8-6f022eaa76c8",
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

`POST /api/driver/v1/work-sessions/cf3d3c86-7624-42d4-b844-b08c3144ec70/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:44:23Z",
    "sequence": 1793349863910
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "cf3d3c86-7624-42d4-b844-b08c3144ec70",
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
  "last_heartbeat_at": "2026-10-30T08:44:23.929538Z",
  "last_location_at": "2026-10-30T08:44:23.929538Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/cb9593cf-1757-4fa4-b344-f29defc2bb8f/arrive` → **200**

```json
{
  "command_id": "609a2fb6-4dd0-447e-8207-d2c1de8eb375",
  "expected_version": 0
}
```

```json
{
  "id": "cb9593cf-1757-4fa4-b344-f29defc2bb8f",
  "order_id": "45a88345-919c-4eb5-9033-1a9f52797274",
  "assignment_id": "53438ea8-3557-4424-aff8-6f022eaa76c8",
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
  "arrived_at": "2026-10-30T08:44:24.223753Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cb9593cf-1757-4fa4-b344-f29defc2bb8f/start` → **200**

```json
{
  "command_id": "7a67b455-7577-4e4c-9840-b87c3f9d243e",
  "expected_version": 1
}
```

```json
{
  "id": "cb9593cf-1757-4fa4-b344-f29defc2bb8f",
  "order_id": "45a88345-919c-4eb5-9033-1a9f52797274",
  "assignment_id": "53438ea8-3557-4424-aff8-6f022eaa76c8",
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
  "arrived_at": "2026-10-30T08:44:24.223753Z",
  "started_at": "2026-10-30T08:44:24.52517Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cb9593cf-1757-4fa4-b344-f29defc2bb8f/complete` → **200**

```json
{
  "command_id": "730f4a6f-603e-4afd-8f5c-407203f82cdb",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:44:24Z",
  "cash_received": true
}
```

```json
{
  "id": "cb9593cf-1757-4fa4-b344-f29defc2bb8f",
  "order_id": "45a88345-919c-4eb5-9033-1a9f52797274",
  "assignment_id": "53438ea8-3557-4424-aff8-6f022eaa76c8",
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
  "arrived_at": "2026-10-30T08:44:24.223753Z",
  "started_at": "2026-10-30T08:44:24.52517Z",
  "completed_at": "2026-10-30T08:44:24.840552Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/45a88345-919c-4eb5-9033-1a9f52797274` → **200**

```json
{
  "id": "45a88345-919c-4eb5-9033-1a9f52797274",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "4bed269e-1ee2-48e9-bd98-f49cbb9e5ac3",
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
    "id": "53438ea8-3557-4424-aff8-6f022eaa76c8",
    "order_id": "45a88345-919c-4eb5-9033-1a9f52797274",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cb9593cf-1757-4fa4-b344-f29defc2bb8f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:44:22.426075Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/45a88345-919c-4eb5-9033-1a9f52797274` → **200**

```json
{
  "id": "45a88345-919c-4eb5-9033-1a9f52797274",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "4bed269e-1ee2-48e9-bd98-f49cbb9e5ac3",
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
    "id": "53438ea8-3557-4424-aff8-6f022eaa76c8",
    "order_id": "45a88345-919c-4eb5-9033-1a9f52797274",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cb9593cf-1757-4fa4-b344-f29defc2bb8f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:44:22.426075Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/45a88345-919c-4eb5-9033-1a9f52797274` → **200**

```json
{
  "id": "45a88345-919c-4eb5-9033-1a9f52797274",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "4bed269e-1ee2-48e9-bd98-f49cbb9e5ac3",
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
    "id": "53438ea8-3557-4424-aff8-6f022eaa76c8",
    "order_id": "45a88345-919c-4eb5-9033-1a9f52797274",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cb9593cf-1757-4fa4-b344-f29defc2bb8f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:44:22.426075Z",
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

`GET /api/rider/v1/orders/45a88345-919c-4eb5-9033-1a9f52797274/tip` → **200**

```json
{
  "order_id": "45a88345-919c-4eb5-9033-1a9f52797274",
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
  "available_until": "2026-10-31T08:44:24.840552Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/45a88345-919c-4eb5-9033-1a9f52797274/tip` → **201**

```json
{
  "command_id": "67e5ff53-feb0-4073-ad0e-344cb4c09008",
  "amount_minor": 2500
}
```

```json
{
  "id": "56409ed8-7e69-4b57-936e-3c17eac2152e",
  "order_id": "45a88345-919c-4eb5-9033-1a9f52797274",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T08:44:28.618229Z"
}
```

`GET /api/rider/v1/orders/45a88345-919c-4eb5-9033-1a9f52797274/tip` → **200**

```json
{
  "order_id": "45a88345-919c-4eb5-9033-1a9f52797274",
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
  "available_until": "2026-10-31T08:44:24.840552Z",
  "open": false,
  "tip": {
    "id": "56409ed8-7e69-4b57-936e-3c17eac2152e",
    "order_id": "45a88345-919c-4eb5-9033-1a9f52797274",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T08:44:28.618229Z"
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
      "id": "acc61cd9-f00a-4287-b753-316aa66f7b23",
      "at": "2026-10-30T08:44:25.586494Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "45a88345-919c-4eb5-9033-1a9f52797274",
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
      "id": "630106e3-5079-4f8b-b37f-13cb730621b8",
      "at": "2026-10-30T08:44:29.662292Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "45a88345-919c-4eb5-9033-1a9f52797274",
      "counterpart_id": null
    },
    {
      "id": "acc61cd9-f00a-4287-b753-316aa66f7b23",
      "at": "2026-10-30T08:44:25.586494Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "45a88345-919c-4eb5-9033-1a9f52797274",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8a24e7d7-1be6-4700-a038-710fa3e62e17",
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
  "id": "4cec5c3d-b480-4825-97e2-51bbaf08adb8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:49:30.819200Z",
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
  "session_id": "11968385-183e-4645-a497-38a375baf84e",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3NzEsImlhdCI6MTc5MzM0OTg3MSwianRpIjoiNjZlZjE4YzgtZjg4Ni00YjNhLWI1MmEtNzQ3N2YwMmE2MzAwIiwic2lkIjoiMTE5NjgzODUtMTgzZS00NjQ1LWE0OTctMzhhMzc1YmFmODRlIn0.pbNFmb5cO5uS0xp3vhex8Z3OKmKjagwVbUe97W8caaM",
  "access_expires_at": "2026-10-30T08:59:31.418993294Z",
  "refresh_token": "PWtfpo5KE46KxaXM8jjKWO5cSacezZU3Deq9ozcJT60",
  "refresh_expires_at": "2026-10-30T20:44:31.418402304Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380734461571` → **200**

```json
{
  "client_id": "4bed269e-1ee2-48e9-bd98-f49cbb9e5ac3"
}
```

`POST /api/admin/v1/rider-wallets/4bed269e-1ee2-48e9-bd98-f49cbb9e5ac3/top-ups` → **201**

```json
{
  "command_id": "aa7095af-d4c1-460d-b722-4a4e07a03c85",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "4bed269e-1ee2-48e9-bd98-f49cbb9e5ac3",
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
      "id": "96738e5a-f756-416e-998b-86b1347daa57",
      "at": "2026-10-30T08:44:31.988636Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9897e6ba-dfd5-4115-a901-6222f78d1d89",
  "quote_id": "4cec5c3d-b480-4825-97e2-51bbaf08adb8",
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
  "id": "78d00b27-c63e-46f5-b2e6-2a57f7fa5ea4",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4bed269e-1ee2-48e9-bd98-f49cbb9e5ac3",
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
  "created_at": "2026-10-30T08:44:32.320602Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/78d00b27-c63e-46f5-b2e6-2a57f7fa5ea4` → **200**

```json
{
  "id": "78d00b27-c63e-46f5-b2e6-2a57f7fa5ea4",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4bed269e-1ee2-48e9-bd98-f49cbb9e5ac3",
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
  "created_at": "2026-10-30T08:44:32.320602Z",
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
    "id": "a987dacc-75c3-4323-bf5e-038b2402b797",
    "order_id": "78d00b27-c63e-46f5-b2e6-2a57f7fa5ea4",
    "expires_at": "2026-10-30T08:44:47.3259Z",
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

`POST /api/driver/v1/offers/a987dacc-75c3-4323-bf5e-038b2402b797/accept` → **200**

```json
{
  "command_id": "9a63178c-bb82-4b28-bf06-49783f6e666f"
}
```

```json
{
  "id": "7f2c00de-699b-457e-8a9c-f9b81a3a7da2",
  "order_id": "78d00b27-c63e-46f5-b2e6-2a57f7fa5ea4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "85d2df86-2400-4892-8c99-3ba964ebb929",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "85d2df86-2400-4892-8c99-3ba964ebb929",
  "order_id": "78d00b27-c63e-46f5-b2e6-2a57f7fa5ea4",
  "assignment_id": "7f2c00de-699b-457e-8a9c-f9b81a3a7da2",
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

`POST /api/driver/v1/work-sessions/cf3d3c86-7624-42d4-b844-b08c3144ec70/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:44:33Z",
    "sequence": 1793349873818
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "cf3d3c86-7624-42d4-b844-b08c3144ec70",
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
  "last_heartbeat_at": "2026-10-30T08:44:33.837017Z",
  "last_location_at": "2026-10-30T08:44:33.837017Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/85d2df86-2400-4892-8c99-3ba964ebb929/arrive` → **200**

```json
{
  "command_id": "2a0b0b55-a07c-4a28-a11f-3cb0a6d02c87",
  "expected_version": 0
}
```

```json
{
  "id": "85d2df86-2400-4892-8c99-3ba964ebb929",
  "order_id": "78d00b27-c63e-46f5-b2e6-2a57f7fa5ea4",
  "assignment_id": "7f2c00de-699b-457e-8a9c-f9b81a3a7da2",
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
  "arrived_at": "2026-10-30T08:44:34.13322Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/85d2df86-2400-4892-8c99-3ba964ebb929/start` → **200**

```json
{
  "command_id": "a8f0118b-44bd-43a9-ae2a-bef75749e6eb",
  "expected_version": 1
}
```

```json
{
  "id": "85d2df86-2400-4892-8c99-3ba964ebb929",
  "order_id": "78d00b27-c63e-46f5-b2e6-2a57f7fa5ea4",
  "assignment_id": "7f2c00de-699b-457e-8a9c-f9b81a3a7da2",
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
  "arrived_at": "2026-10-30T08:44:34.13322Z",
  "started_at": "2026-10-30T08:44:34.442096Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/85d2df86-2400-4892-8c99-3ba964ebb929/complete` → **200**

```json
{
  "command_id": "52bb2059-c186-4eb3-a57b-1d14890ed077",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:44:34Z",
  "cash_received": true
}
```

```json
{
  "id": "85d2df86-2400-4892-8c99-3ba964ebb929",
  "order_id": "78d00b27-c63e-46f5-b2e6-2a57f7fa5ea4",
  "assignment_id": "7f2c00de-699b-457e-8a9c-f9b81a3a7da2",
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
  "arrived_at": "2026-10-30T08:44:34.13322Z",
  "started_at": "2026-10-30T08:44:34.442096Z",
  "completed_at": "2026-10-30T08:44:34.757199Z",
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
  "client_id": "4bed269e-1ee2-48e9-bd98-f49cbb9e5ac3",
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
      "id": "96738e5a-f756-416e-998b-86b1347daa57",
      "at": "2026-10-30T08:44:31.988636Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
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

`GET /api/rider/v1/orders/78d00b27-c63e-46f5-b2e6-2a57f7fa5ea4/tip` → **200**

```json
{
  "order_id": "78d00b27-c63e-46f5-b2e6-2a57f7fa5ea4",
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
  "available_until": "2026-10-31T08:44:34.757199Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/78d00b27-c63e-46f5-b2e6-2a57f7fa5ea4/tip` → **201**

```json
{
  "command_id": "ae8eafc7-5173-489c-87e1-d7bb9b58ba1f",
  "amount_minor": 2500
}
```

```json
{
  "id": "e86ce500-68be-4683-a35a-0cc0ed2d4eb4",
  "order_id": "78d00b27-c63e-46f5-b2e6-2a57f7fa5ea4",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T08:44:35.92918Z"
}
```

`GET /api/rider/v1/orders/78d00b27-c63e-46f5-b2e6-2a57f7fa5ea4/tip` → **200**

```json
{
  "order_id": "78d00b27-c63e-46f5-b2e6-2a57f7fa5ea4",
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
  "available_until": "2026-10-31T08:44:34.757199Z",
  "open": false,
  "tip": {
    "id": "e86ce500-68be-4683-a35a-0cc0ed2d4eb4",
    "order_id": "78d00b27-c63e-46f5-b2e6-2a57f7fa5ea4",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T08:44:35.92918Z"
  }
}
```

`GET /api/rider/v1/orders/78d00b27-c63e-46f5-b2e6-2a57f7fa5ea4/tip` → **200**

```json
{
  "order_id": "78d00b27-c63e-46f5-b2e6-2a57f7fa5ea4",
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
  "available_until": "2026-10-31T08:44:34.757199Z",
  "open": false,
  "tip": {
    "id": "e86ce500-68be-4683-a35a-0cc0ed2d4eb4",
    "order_id": "78d00b27-c63e-46f5-b2e6-2a57f7fa5ea4",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T08:44:35.92918Z"
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
      "id": "750afd48-5304-46e2-be37-ba560da62361",
      "at": "2026-10-30T08:44:37.754622Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "78d00b27-c63e-46f5-b2e6-2a57f7fa5ea4",
      "counterpart_id": null
    },
    {
      "id": "e2ef63b3-ff8b-484f-836e-a8721076a401",
      "at": "2026-10-30T08:44:35.726145Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "78d00b27-c63e-46f5-b2e6-2a57f7fa5ea4",
      "counterpart_id": null
    },
    {
      "id": "630106e3-5079-4f8b-b37f-13cb730621b8",
      "at": "2026-10-30T08:44:29.662292Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "45a88345-919c-4eb5-9033-1a9f52797274",
      "counterpart_id": null
    },
    {
      "id": "acc61cd9-f00a-4287-b753-316aa66f7b23",
      "at": "2026-10-30T08:44:25.586494Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "45a88345-919c-4eb5-9033-1a9f52797274",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "cf3d3c86-7624-42d4-b844-b08c3144ec70",
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
  "last_heartbeat_at": "2026-10-30T08:44:33.837017Z",
  "last_location_at": "2026-10-30T08:44:33.837017Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cf3d3c86-7624-42d4-b844-b08c3144ec70/close` → **200**

```json
{
  "command_id": "2fe0adf0-f940-4044-af73-d8c27a67f3da",
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

Done: card order 78d00b27-c63e-46f5-b2e6-2a57f7fa5ea4.

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
  "phone": "+380738078172",
  "device_ref": "sandbox-7714"
}
```

```json
{
  "challenge_id": "d8995743-98a1-4e1d-ab7b-df003a2775e9",
  "expires_at": "2026-10-30T08:49:38.970029197Z",
  "resend_available_at": "2026-10-30T08:44:39.970029197Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738078172` → **200**

```json
{
  "phone": "+380738078172",
  "audience": "CLIENT",
  "code": "089734",
  "sent_at": "2026-10-30T08:44:38.972910645Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d8995743-98a1-4e1d-ab7b-df003a2775e9",
  "code": "089734",
  "device_ref": "sandbox-7714"
}
```

```json
{
  "session_id": "9cc1255e-2aea-4ac6-92ef-d32f9a2742d4",
  "subject": {
    "type": "CLIENT",
    "id": "248737f3-f847-4c0b-9a9c-a8689bf5cc5d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNDg3MzdmMy1mODQ3LTRjMGItOWE5Yy1hODY4OWJmNWNjNWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNzc5LCJpYXQiOjE3OTMzNDk4NzksImp0aSI6IjY2NTg4Y2Q4LTM0YjUtNDBiMi1hMjEzLWEyMDU2NmNkY2FkYyIsInNpZCI6IjljYzEyNTVlLTJhZWEtNGFjNi05MmVmLWQzMmY5YTI3NDJkNCJ9.lnwsFnJ03a-maSzBq7NR0aAF89CbeNYMEZ6IVAYi-zg",
  "access_expires_at": "2026-10-30T08:59:39.284541345Z",
  "refresh_token": "QfIx_8xzPri49WDNO_RTmbX1OT91WZqaBjelWtJlHQU",
  "refresh_expires_at": "2026-11-29T08:44:39.283968539Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "2d2c3ac9-ec34-4bdc-8f9f-76ddb044f9db",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "cdca522b-7597-49b8-b2e1-0e9bab08e645",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-cdca522b-7597-49b8-b2e1-0e9bab08e645",
    "orderDate": "1793349879",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "6b2145a290f75d4e6d70205916696ef5",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=cdca522b-7597-49b8-b2e1-0e9bab08e645",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738078172"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=cdca522b-7597-49b8-b2e1-0e9bab08e645",
  "created_at": "2026-10-30T08:44:39.581583Z",
  "expires_at": "2026-10-30T09:14:39.581583Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/cdca522b-7597-49b8-b2e1-0e9bab08e645` → **200**

```json
{
  "id": "cdca522b-7597-49b8-b2e1-0e9bab08e645",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T08:44:39.581583Z",
  "expires_at": "2026-10-30T09:14:39.581583Z",
  "completed_at": "2026-10-30T08:44:39.867351Z",
  "masked_pan": "41****5397",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "248737f3-f847-4c0b-9a9c-a8689bf5cc5d",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "248737f3-f847-4c0b-9a9c-a8689bf5cc5d",
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
      "id": "de992eaa-bfba-4d0d-9ba7-08ae7322a31e",
      "at": "2026-10-30T08:44:40.771866Z",
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
  "client_id": "248737f3-f847-4c0b-9a9c-a8689bf5cc5d",
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
      "id": "de992eaa-bfba-4d0d-9ba7-08ae7322a31e",
      "at": "2026-10-30T08:44:40.771866Z",
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
  "device_ref": "sandbox-22782"
}
```

```json
{
  "challenge_id": "98f6610a-0eff-42d7-9ff6-777d9de11677",
  "expires_at": "2026-10-30T08:49:42.05134368Z",
  "resend_available_at": "2026-10-30T08:44:43.05134368Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "706067",
  "sent_at": "2026-10-30T08:44:42.053991674Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "98f6610a-0eff-42d7-9ff6-777d9de11677",
  "code": "706067",
  "device_ref": "sandbox-22782"
}
```

```json
{
  "session_id": "74359f66-9d65-4d8b-b944-50f2e605a666",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDc4MiwiaWF0IjoxNzkzMzQ5ODgyLCJqdGkiOiI0MDA3ZjEyZS00Njk3LTRjOTItYWUxOC0xOTgyNTc3ZDc4NDMiLCJzaWQiOiI3NDM1OWY2Ni05ZDY1LTRkOGItYjk0NC01MGYyZTYwNWE2NjYifQ.IrqAkRchk_eBUXOzSB2-7h_na3Hsohxf4P6vrzNh7F0",
  "access_expires_at": "2026-10-30T08:59:42.370533077Z",
  "refresh_token": "Nt2E12OPsWkxwkKfP6puNovn3SAVx15Nb6djWexB40U",
  "refresh_expires_at": "2026-11-29T08:44:42.369899993Z",
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
  "command_id": "668725ec-1a8d-4859-b57e-902bfd757aaf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "85f055dc-3a23-42fa-9738-f65948186275",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-85f055dc-3a23-42fa-9738-f65948186275",
    "orderDate": "1793349882",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "90433fd101e8a9a821402a4b360527d5",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=85f055dc-3a23-42fa-9738-f65948186275",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=85f055dc-3a23-42fa-9738-f65948186275",
  "created_at": "2026-10-30T08:44:42.951008Z",
  "expires_at": "2026-10-30T09:14:42.951008Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/85f055dc-3a23-42fa-9738-f65948186275` → **200**

```json
{
  "id": "85f055dc-3a23-42fa-9738-f65948186275",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T08:44:42.951008Z",
  "expires_at": "2026-10-30T09:14:42.951008Z",
  "completed_at": "2026-10-30T08:44:43.234511Z",
  "masked_pan": "41****4611",
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
      "id": "5a72c11c-ca58-4ae4-b152-c79cb3c28026",
      "at": "2026-10-30T08:44:43.780165Z",
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
  "command_id": "660db3f2-65aa-4740-9a1f-aead69ccab90",
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
  "correlation_id": "d53cb781-0bf0-448f-96ec-ee60da232a75"
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
  "device_ref": "sandbox-22152"
}
```

```json
{
  "challenge_id": "ed084d54-fb18-4d18-bc78-7722216198b9",
  "expires_at": "2026-10-30T08:49:45.42539803Z",
  "resend_available_at": "2026-10-30T08:44:46.42539803Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "073650",
  "sent_at": "2026-10-30T08:44:45.428168846Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ed084d54-fb18-4d18-bc78-7722216198b9",
  "code": "073650",
  "device_ref": "sandbox-22152"
}
```

```json
{
  "session_id": "147ab393-31ff-4c94-ab4e-c099db6810b9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDc4NSwiaWF0IjoxNzkzMzQ5ODg1LCJqdGkiOiI2Njk1YzVmMy05YmYxLTQ1ZmItOWZjNi04YzQyODczMjc1MDMiLCJzaWQiOiIxNDdhYjM5My0zMWZmLTRjOTQtYWI0ZS1jMDk5ZGI2ODEwYjkifQ.AxC-XqnIwr-gdQ_NVi4vtVTTnXiXlFgRq7XAnDgT6b4",
  "access_expires_at": "2026-10-30T08:59:45.745908324Z",
  "refresh_token": "TwPRyS8bEzRaJZ8eUOxBe9fKlc2jniwBSDKY-3_Fp-s",
  "refresh_expires_at": "2026-11-29T08:44:45.745290205Z",
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
  "command_id": "a5a01c86-64c9-454f-8e21-ee03c59eeb8f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:44:46Z",
    "sequence": 1793349886296
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ee6ab7b9-9fd7-4287-bb77-0f4707200dfe",
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
  "last_heartbeat_at": "2026-10-30T08:44:46.315876Z",
  "last_location_at": "2026-10-30T08:44:46.315876Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633257744",
  "device_ref": "sandbox-11011"
}
```

```json
{
  "challenge_id": "224faa18-8735-4a64-b597-e442a7c85f2f",
  "expires_at": "2026-10-30T08:49:46.608621663Z",
  "resend_available_at": "2026-10-30T08:44:47.608621663Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633257744` → **200**

```json
{
  "phone": "+380633257744",
  "audience": "CLIENT",
  "code": "296681",
  "sent_at": "2026-10-30T08:44:46.611130759Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "224faa18-8735-4a64-b597-e442a7c85f2f",
  "code": "296681",
  "device_ref": "sandbox-11011"
}
```

```json
{
  "session_id": "0b127ce6-a6b9-44a0-8774-d566d7425d3d",
  "subject": {
    "type": "CLIENT",
    "id": "62696768-13d0-4875-9c18-542a573bfadd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MjY5Njc2OC0xM2QwLTQ4NzUtOWMxOC01NDJhNTczYmZhZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNzg2LCJpYXQiOjE3OTMzNDk4ODYsImp0aSI6ImJkMDY5MjlhLWMzMjMtNDY1Yy1iY2ZjLTA1YjdmMWU5MGQ1NiIsInNpZCI6IjBiMTI3Y2U2LWE2YjktNDRhMC04Nzc0LWQ1NjZkNzQyNWQzZCJ9.d2uwYa74h8jy_eHL28DZB5_N1HcomcJVWcgf7scra5w",
  "access_expires_at": "2026-10-30T08:59:46.9197429Z",
  "refresh_token": "ZIokmMz2JU0x28tJbmpVIYDK5xyEXCqqfSFDVVk3_6o",
  "refresh_expires_at": "2026-11-29T08:44:46.919177139Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "411d6f67-42d4-4a13-93eb-c36948cb9ac7",
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
  "id": "e7a1659a-c3be-48cf-86e0-31cfbe1c21b0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:49:47.210882Z",
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
  "command_id": "76ffe1f0-a2bb-4a60-95d8-4535311616e5",
  "quote_id": "e7a1659a-c3be-48cf-86e0-31cfbe1c21b0",
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
  "id": "8d7f58af-60dc-442c-a390-e423cd7aee7c",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "62696768-13d0-4875-9c18-542a573bfadd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:47.509997Z",
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
    "id": "98c2baa7-76fe-444a-9608-dc8a909ed5b5",
    "order_id": "8d7f58af-60dc-442c-a390-e423cd7aee7c",
    "expires_at": "2026-10-30T08:45:02.513968Z",
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

`POST /api/driver/v1/offers/98c2baa7-76fe-444a-9608-dc8a909ed5b5/accept` → **200**

```json
{
  "command_id": "15660fdf-33fc-41de-a364-8758b2515746"
}
```

```json
{
  "id": "2450b3c8-b4ab-410b-918e-6dd0a2492815",
  "order_id": "8d7f58af-60dc-442c-a390-e423cd7aee7c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "913a83ca-8d48-46d7-ac79-e4c3aba11068",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "913a83ca-8d48-46d7-ac79-e4c3aba11068",
  "order_id": "8d7f58af-60dc-442c-a390-e423cd7aee7c",
  "assignment_id": "2450b3c8-b4ab-410b-918e-6dd0a2492815",
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

`POST /api/driver/v1/work-sessions/ee6ab7b9-9fd7-4287-bb77-0f4707200dfe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:44:48Z",
    "sequence": 1793349888673
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ee6ab7b9-9fd7-4287-bb77-0f4707200dfe",
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
  "last_heartbeat_at": "2026-10-30T08:44:48.691468Z",
  "last_location_at": "2026-10-30T08:44:48.691468Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/913a83ca-8d48-46d7-ac79-e4c3aba11068/arrive` → **200**

```json
{
  "command_id": "405c9f07-5585-49b1-8d50-3a4f3ed7ad02",
  "expected_version": 0
}
```

```json
{
  "id": "913a83ca-8d48-46d7-ac79-e4c3aba11068",
  "order_id": "8d7f58af-60dc-442c-a390-e423cd7aee7c",
  "assignment_id": "2450b3c8-b4ab-410b-918e-6dd0a2492815",
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
  "arrived_at": "2026-10-30T08:44:48.985888Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/913a83ca-8d48-46d7-ac79-e4c3aba11068/start` → **200**

```json
{
  "command_id": "d04e2ee2-19fd-4d6c-b42c-1ea9318a177c",
  "expected_version": 1
}
```

```json
{
  "id": "913a83ca-8d48-46d7-ac79-e4c3aba11068",
  "order_id": "8d7f58af-60dc-442c-a390-e423cd7aee7c",
  "assignment_id": "2450b3c8-b4ab-410b-918e-6dd0a2492815",
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
  "arrived_at": "2026-10-30T08:44:48.985888Z",
  "started_at": "2026-10-30T08:44:49.279706Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/913a83ca-8d48-46d7-ac79-e4c3aba11068/complete` → **200**

```json
{
  "command_id": "d78eb26e-e4fb-4dbe-a47c-785d8fb17dd2",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:44:49Z",
  "cash_received": false
}
```

```json
{
  "id": "913a83ca-8d48-46d7-ac79-e4c3aba11068",
  "order_id": "8d7f58af-60dc-442c-a390-e423cd7aee7c",
  "assignment_id": "2450b3c8-b4ab-410b-918e-6dd0a2492815",
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
  "arrived_at": "2026-10-30T08:44:48.985888Z",
  "started_at": "2026-10-30T08:44:49.279706Z",
  "completed_at": "2026-10-30T08:44:49.576346Z",
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
  "session_id": "4812d493-aa3d-4192-90ca-57a0317147b5",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3OTAsImlhdCI6MTc5MzM0OTg5MCwianRpIjoiNWRmZGU3M2ItZmQ2Ni00MTRjLWEzZGItODlhMjIwYjg2MGQzIiwic2lkIjoiNDgxMmQ0OTMtYWEzZC00MTkyLTkwY2EtNTdhMDMxNzE0N2I1In0.aRmdtbE5-lLAbIP2X4p3MNe5i17ko4AW4JKpLb3mvWw",
  "access_expires_at": "2026-10-30T08:59:50.163496493Z",
  "refresh_token": "e6n9FMyKGj33goVx25ggaF9S_a4F8WviVOzyBVpfN6s",
  "refresh_expires_at": "2026-10-30T20:44:50.162952582Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/8d7f58af-60dc-442c-a390-e423cd7aee7c/cash-dispute` → **200**

```json
{
  "order_id": "8d7f58af-60dc-442c-a390-e423cd7aee7c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "62696768-13d0-4875-9c18-542a573bfadd",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T08:44:49.871871Z",
  "decide_by": "2026-11-13T08:44:49.871871Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T08:44:49.871871Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "8d7f58af-60dc-442c-a390-e423cd7aee7c",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "62696768-13d0-4875-9c18-542a573bfadd",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T08:44:49.871871Z",
      "decide_by": "2026-11-13T08:44:49.871871Z",
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

`POST /api/admin/v1/orders/8d7f58af-60dc-442c-a390-e423cd7aee7c/cash-dispute/decide` → **400**

```json
{
  "command_id": "9f831f42-e88a-4962-9021-dd9ccf121d62",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/8d7f58af-60dc-442c-a390-e423cd7aee7c/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "afd06660-5653-4e3a-85d8-079c2e66bbc8",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/8d7f58af-60dc-442c-a390-e423cd7aee7c/cash-dispute/decide` → **200**

```json
{
  "command_id": "a12a861f-ad97-4b6d-bd02-72509c7bd61b",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "8d7f58af-60dc-442c-a390-e423cd7aee7c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "62696768-13d0-4875-9c18-542a573bfadd",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T08:44:49.871871Z",
  "decide_by": "2026-11-13T08:44:49.871871Z",
  "decision": "PAY_DRIVER",
  "decided_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T08:44:51.380018Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/8d7f58af-60dc-442c-a390-e423cd7aee7c/cash-dispute/decide` → **409**

```json
{
  "command_id": "62314613-64ed-40c8-adb6-151f20921359",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/8d7f58af-60dc-442c-a390-e423cd7aee7c/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "befd0806-014f-4722-9662-1229db79d1e8"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ee6ab7b9-9fd7-4287-bb77-0f4707200dfe",
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
  "last_heartbeat_at": "2026-10-30T08:44:48.691468Z",
  "last_location_at": "2026-10-30T08:44:48.691468Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ee6ab7b9-9fd7-4287-bb77-0f4707200dfe/close` → **200**

```json
{
  "command_id": "81943569-3d2e-4d37-b83d-3b2393cfbcce",
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
  "phone": "+380731253121",
  "device_ref": "sandbox-12071"
}
```

```json
{
  "challenge_id": "a78f2c55-34d8-41c5-9da8-f8a2d37ed47b",
  "expires_at": "2026-10-30T08:49:52.646939485Z",
  "resend_available_at": "2026-10-30T08:44:53.646939485Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731253121` → **200**

```json
{
  "phone": "+380731253121",
  "audience": "CLIENT",
  "code": "763744",
  "sent_at": "2026-10-30T08:44:52.650022465Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a78f2c55-34d8-41c5-9da8-f8a2d37ed47b",
  "code": "763744",
  "device_ref": "sandbox-12071"
}
```

```json
{
  "session_id": "f87eb295-ff07-4680-a062-d2b89a66fa13",
  "subject": {
    "type": "CLIENT",
    "id": "24708bd5-b4fd-487f-b3ff-3c00a02f75e4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNDcwOGJkNS1iNGZkLTQ4N2YtYjNmZi0zYzAwYTAyZjc1ZTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNzkyLCJpYXQiOjE3OTMzNDk4OTIsImp0aSI6ImY4MDk2YWRjLTA3OTctNGZiYS05ZTNjLThlMzUzODM0OWZjNSIsInNpZCI6ImY4N2ViMjk1LWZmMDctNDY4MC1hMDYyLWQyYjg5YTY2ZmExMyJ9.wFdUzivm2eBRGfguSnZv4rLuYKk5b6Aq_xfW-o9Sh24",
  "access_expires_at": "2026-10-30T08:59:52.964942171Z",
  "refresh_token": "iNhdW2RpPqI98AlfbxuC1LB6jAF1Fwd65MZnv4xvidE",
  "refresh_expires_at": "2026-11-29T08:44:52.964377253Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "48c7c7ca-4a01-4dc4-bdc3-da957b227f2f",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b44fcfbc-adf6-4af5-9a4d-d8ead08779ca",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b44fcfbc-adf6-4af5-9a4d-d8ead08779ca",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "577648268dcdc2c5cde8b20d6700e922",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b44fcfbc-adf6-4af5-9a4d-d8ead08779ca",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731253121"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b44fcfbc-adf6-4af5-9a4d-d8ead08779ca",
  "expires_at": "2026-10-30T09:14:53.254511Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/b44fcfbc-adf6-4af5-9a4d-d8ead08779ca` → **200**

```json
{
  "id": "b44fcfbc-adf6-4af5-9a4d-d8ead08779ca",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T09:14:53.254511Z",
  "card": {
    "id": "73493d46-5f63-4fbe-bdee-a42d1fd69dc0",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3409",
    "card_type": "Visa",
    "created_at": "2026-10-30T08:44:53.553814Z"
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
  "device_ref": "sandbox-29328"
}
```

```json
{
  "challenge_id": "3a7ad4f8-3f63-44b4-bd64-29e8a4d862b6",
  "expires_at": "2026-10-30T08:49:53.87776504Z",
  "resend_available_at": "2026-10-30T08:44:54.87776504Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "078295",
  "sent_at": "2026-10-30T08:44:53.88052668Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3a7ad4f8-3f63-44b4-bd64-29e8a4d862b6",
  "code": "078295",
  "device_ref": "sandbox-29328"
}
```

```json
{
  "session_id": "e33d2bb6-94eb-49c8-83a4-e809fcb377e9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDc5NCwiaWF0IjoxNzkzMzQ5ODk0LCJqdGkiOiIzYmQwYzRlZi01MGFhLTQ2Y2EtODBmOC04YWFjNmYxMzNhNTMiLCJzaWQiOiJlMzNkMmJiNi05NGViLTQ5YzgtODNhNC1lODA5ZmNiMzc3ZTkifQ.WXcXu7GgItDF3l_5PjL_Lme-EcXJDpN1juXXaZHANn0",
  "access_expires_at": "2026-10-30T08:59:54.184310079Z",
  "refresh_token": "ZbsaKiCp0IH3bkBRDI0ltW3hrvEhJhT9WTYLoTCm80A",
  "refresh_expires_at": "2026-11-29T08:44:54.183796535Z",
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
  "command_id": "d18c25dc-20ce-4ce4-b8b4-7cffc0a38414",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:44:54Z",
    "sequence": 1793349894743
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b4f94b72-cfd2-41a3-bd61-742e0e2e9525",
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
  "last_heartbeat_at": "2026-10-30T08:44:54.761588Z",
  "last_location_at": "2026-10-30T08:44:54.761588Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3cb6a6c3-2739-4b11-b631-d7bb8f95f21b",
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
  "id": "b443c136-6293-47c8-8138-a6a6c68c62af",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:49:55.053952Z",
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
  "command_id": "d969bc87-05bb-4bce-963c-a491690fc151",
  "quote_id": "b443c136-6293-47c8-8138-a6a6c68c62af",
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
  "id": "050a4e67-6931-4a95-b23d-03b201611d84",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "24708bd5-b4fd-487f-b3ff-3c00a02f75e4",
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
  "created_at": "2026-10-30T08:44:55.353718Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/050a4e67-6931-4a95-b23d-03b201611d84` → **200**

```json
{
  "id": "050a4e67-6931-4a95-b23d-03b201611d84",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "24708bd5-b4fd-487f-b3ff-3c00a02f75e4",
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
  "created_at": "2026-10-30T08:44:55.353718Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/050a4e67-6931-4a95-b23d-03b201611d84` → **200**

```json
{
  "id": "050a4e67-6931-4a95-b23d-03b201611d84",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "24708bd5-b4fd-487f-b3ff-3c00a02f75e4",
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
  "created_at": "2026-10-30T08:44:55.353718Z",
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
    "id": "04b65ff3-6f66-4ec0-adcd-afe78e380695",
    "order_id": "050a4e67-6931-4a95-b23d-03b201611d84",
    "expires_at": "2026-10-30T08:45:10.915268Z",
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

`POST /api/driver/v1/offers/04b65ff3-6f66-4ec0-adcd-afe78e380695/accept` → **200**

```json
{
  "command_id": "8f1cea02-8b44-41ec-b3d8-ed8bb8062750"
}
```

```json
{
  "id": "056e366d-f43f-4dc7-b02d-e7ffc595c8cc",
  "order_id": "050a4e67-6931-4a95-b23d-03b201611d84",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d9b8aa7c-7702-40e5-a9a1-aec17b054048",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d9b8aa7c-7702-40e5-a9a1-aec17b054048",
  "order_id": "050a4e67-6931-4a95-b23d-03b201611d84",
  "assignment_id": "056e366d-f43f-4dc7-b02d-e7ffc595c8cc",
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

`POST /api/rider/v1/orders/050a4e67-6931-4a95-b23d-03b201611d84/messages` → **201**

```json
{
  "command_id": "0df1236c-fc2c-47ea-813c-4651068b3686",
  "body": "Я біля входу, мій номер +380731253121, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "25394bf0-8a50-462a-8833-374c31ce46c5",
  "order_id": "050a4e67-6931-4a95-b23d-03b201611d84",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380731253121, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T08:44:58.130847831Z"
}
```

`POST /api/driver/v1/trips/d9b8aa7c-7702-40e5-a9a1-aec17b054048/messages` → **201**

```json
{
  "command_id": "cc71b6e9-a735-43a9-91f0-81aa5ed58e9f",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "394197b3-5eac-4b47-88e5-61e3b968e8bf",
  "order_id": "050a4e67-6931-4a95-b23d-03b201611d84",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T08:44:58.418265945Z"
}
```

`POST /api/driver/v1/work-sessions/b4f94b72-cfd2-41a3-bd61-742e0e2e9525/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:44:58Z",
    "sequence": 1793349898692
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b4f94b72-cfd2-41a3-bd61-742e0e2e9525",
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
  "last_heartbeat_at": "2026-10-30T08:44:58.711264Z",
  "last_location_at": "2026-10-30T08:44:58.711264Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d9b8aa7c-7702-40e5-a9a1-aec17b054048/arrive` → **200**

```json
{
  "command_id": "6b903e16-326d-4fb2-8f48-4cdd7be82c10",
  "expected_version": 0
}
```

```json
{
  "id": "d9b8aa7c-7702-40e5-a9a1-aec17b054048",
  "order_id": "050a4e67-6931-4a95-b23d-03b201611d84",
  "assignment_id": "056e366d-f43f-4dc7-b02d-e7ffc595c8cc",
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
  "arrived_at": "2026-10-30T08:44:59.02158Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d9b8aa7c-7702-40e5-a9a1-aec17b054048/start` → **200**

```json
{
  "command_id": "611eb42c-8022-4151-a25c-efa63402a4ef",
  "expected_version": 1
}
```

```json
{
  "id": "d9b8aa7c-7702-40e5-a9a1-aec17b054048",
  "order_id": "050a4e67-6931-4a95-b23d-03b201611d84",
  "assignment_id": "056e366d-f43f-4dc7-b02d-e7ffc595c8cc",
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
  "arrived_at": "2026-10-30T08:44:59.02158Z",
  "started_at": "2026-10-30T08:44:59.329674Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/b4f94b72-cfd2-41a3-bd61-742e0e2e9525/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:44:59Z",
    "sequence": 1793349899605
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b4f94b72-cfd2-41a3-bd61-742e0e2e9525",
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
  "last_heartbeat_at": "2026-10-30T08:44:59.624496Z",
  "last_location_at": "2026-10-30T08:44:59.624496Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/d9b8aa7c-7702-40e5-a9a1-aec17b054048/complete` → **200**

```json
{
  "command_id": "cbd107b0-b1ea-4c93-a8ac-e35b41112714",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:44:59Z",
  "cash_received": false
}
```

```json
{
  "id": "d9b8aa7c-7702-40e5-a9a1-aec17b054048",
  "order_id": "050a4e67-6931-4a95-b23d-03b201611d84",
  "assignment_id": "056e366d-f43f-4dc7-b02d-e7ffc595c8cc",
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
  "arrived_at": "2026-10-30T08:44:59.02158Z",
  "started_at": "2026-10-30T08:44:59.329674Z",
  "completed_at": "2026-10-30T08:44:59.918816Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/050a4e67-6931-4a95-b23d-03b201611d84` → **200**

```json
{
  "id": "050a4e67-6931-4a95-b23d-03b201611d84",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "24708bd5-b4fd-487f-b3ff-3c00a02f75e4",
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
    "id": "056e366d-f43f-4dc7-b02d-e7ffc595c8cc",
    "order_id": "050a4e67-6931-4a95-b23d-03b201611d84",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d9b8aa7c-7702-40e5-a9a1-aec17b054048",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:44:55.353718Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/050a4e67-6931-4a95-b23d-03b201611d84` → **200**

```json
{
  "id": "050a4e67-6931-4a95-b23d-03b201611d84",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "24708bd5-b4fd-487f-b3ff-3c00a02f75e4",
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
    "id": "056e366d-f43f-4dc7-b02d-e7ffc595c8cc",
    "order_id": "050a4e67-6931-4a95-b23d-03b201611d84",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d9b8aa7c-7702-40e5-a9a1-aec17b054048",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:44:55.353718Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/050a4e67-6931-4a95-b23d-03b201611d84` → **200**

```json
{
  "id": "050a4e67-6931-4a95-b23d-03b201611d84",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "24708bd5-b4fd-487f-b3ff-3c00a02f75e4",
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
    "id": "056e366d-f43f-4dc7-b02d-e7ffc595c8cc",
    "order_id": "050a4e67-6931-4a95-b23d-03b201611d84",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d9b8aa7c-7702-40e5-a9a1-aec17b054048",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:44:55.353718Z",
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
  "session_id": "b4f94b72-cfd2-41a3-bd61-742e0e2e9525",
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
  "last_heartbeat_at": "2026-10-30T08:44:59.624496Z",
  "last_location_at": "2026-10-30T08:44:59.624496Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b4f94b72-cfd2-41a3-bd61-742e0e2e9525/close` → **200**

```json
{
  "command_id": "7c9ba78b-ae8b-4ba7-93ad-1fe0e9309dd9",
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
  "session_id": "730f3bc8-c971-4a7c-be1c-734c71e04ad6",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA4MDMsImlhdCI6MTc5MzM0OTkwMywianRpIjoiMDljYTc0MzktMzk5OC00ZTVhLTk0YjgtYzVkNGY1MmM3ZmYxIiwic2lkIjoiNzMwZjNiYzgtYzk3MS00YTdjLWJlMWMtNzM0YzcxZTA0YWQ2In0.bq5-lNoOJpFVXRxfl6NkSwBwTmZ_xQkW9k0ZkUACJrQ",
  "access_expires_at": "2026-10-30T09:00:03.965844227Z",
  "refresh_token": "HWf-D91BgApOvy3FHFz-82FsO4THOL3wSawJjCdh9lw",
  "refresh_expires_at": "2026-10-30T20:45:03.965312319Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/050a4e67-6931-4a95-b23d-03b201611d84/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/050a4e67-6931-4a95-b23d-03b201611d84/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "85b59c93-e849-4391-8d89-ee4a0e1be410"
}
```

`GET /api/admin/v1/orders/050a4e67-6931-4a95-b23d-03b201611d84/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T08:45:04.533465366Z",
  "order": {
    "id": "050a4e67-6931-4a95-b23d-03b201611d84",
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
    "created_at": "2026-10-30T08:44:55.353718Z",
    "assigned_at": "2026-10-30T08:44:57.53808Z",
    "arrived_at": "2026-10-30T08:44:59.02158Z",
    "started_at": "2026-10-30T08:44:59.329674Z",
    "completed_at": "2026-10-30T08:44:59.918816Z"
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
    "id": "24708bd5-b4fd-487f-b3ff-3c00a02f75e4",
    "registered_at": "2026-10-30T08:44:52.962684Z",
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
      "created_at": "2026-10-30T08:44:55.356264Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T08:44:59.990155Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/050a4e67-6931-4a95-b23d-03b201611d84/chargebacks` → **422**

```json
{
  "command_id": "27df7930-5d7d-405b-875a-58a3bdf819d3",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/050a4e67-6931-4a95-b23d-03b201611d84/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "37fdf0d8-d339-4b5d-93a3-17642339d03d"
}
```

`POST /api/admin/v1/orders/050a4e67-6931-4a95-b23d-03b201611d84/chargebacks` → **201**

```json
{
  "command_id": "2c1a7ec1-2464-4db0-87bb-feacfbee329d",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "f9b8a41f-e37f-49ff-a14a-abbaac32729c",
  "order_id": "050a4e67-6931-4a95-b23d-03b201611d84",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T08:45:05.192715Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/050a4e67-6931-4a95-b23d-03b201611d84/chargebacks` → **201**

```json
{
  "command_id": "2c1a7ec1-2464-4db0-87bb-feacfbee329d",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "f9b8a41f-e37f-49ff-a14a-abbaac32729c",
  "order_id": "050a4e67-6931-4a95-b23d-03b201611d84",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T08:45:05.192715Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/24708bd5-b4fd-487f-b3ff-3c00a02f75e4` → **200**

```json
{
  "client": {
    "id": "24708bd5-b4fd-487f-b3ff-3c00a02f75e4",
    "phone": "+380731253121",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:44:52.962684Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "050a4e67-6931-4a95-b23d-03b201611d84",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T08:44:55.353718Z",
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

`GET /api/admin/v1/clients/24708bd5-b4fd-487f-b3ff-3c00a02f75e4` → **200**

```json
{
  "client": {
    "id": "24708bd5-b4fd-487f-b3ff-3c00a02f75e4",
    "phone": "+380731253121",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:44:52.962684Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "050a4e67-6931-4a95-b23d-03b201611d84",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T08:44:55.353718Z",
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

`POST /api/admin/v1/orders/050a4e67-6931-4a95-b23d-03b201611d84/chargebacks/f9b8a41f-e37f-49ff-a14a-abbaac32729c/resolve` → **200**

```json
{
  "command_id": "baa90c7c-e75a-441c-9f67-86e76cd378e9",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "f9b8a41f-e37f-49ff-a14a-abbaac32729c",
  "order_id": "050a4e67-6931-4a95-b23d-03b201611d84",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T08:45:05.192715Z",
  "resolved_at": "2026-10-30T08:45:07.437544Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/24708bd5-b4fd-487f-b3ff-3c00a02f75e4` → **200**

```json
{
  "client": {
    "id": "24708bd5-b4fd-487f-b3ff-3c00a02f75e4",
    "phone": "+380731253121",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:44:52.962684Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "050a4e67-6931-4a95-b23d-03b201611d84",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T08:44:55.353718Z",
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

`GET /api/admin/v1/clients/24708bd5-b4fd-487f-b3ff-3c00a02f75e4` → **200**

```json
{
  "client": {
    "id": "24708bd5-b4fd-487f-b3ff-3c00a02f75e4",
    "phone": "+380731253121",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:44:52.962684Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "050a4e67-6931-4a95-b23d-03b201611d84",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T08:44:55.353718Z",
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

`POST /api/admin/v1/orders/050a4e67-6931-4a95-b23d-03b201611d84/chargebacks/f9b8a41f-e37f-49ff-a14a-abbaac32729c/resolve` → **409**

```json
{
  "command_id": "cfc7ef9a-0c3b-40db-b7bc-019c40d24e84",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/050a4e67-6931-4a95-b23d-03b201611d84/chargebacks/f9b8a41f-e37f-49ff-a14a-abbaac32729c/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d66f232e-f98b-4db2-a0aa-bc546b457b08"
}
```

`GET /api/admin/v1/orders/050a4e67-6931-4a95-b23d-03b201611d84/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "f9b8a41f-e37f-49ff-a14a-abbaac32729c",
      "order_id": "050a4e67-6931-4a95-b23d-03b201611d84",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T08:45:05.192715Z",
      "resolved_at": "2026-10-30T08:45:07.437544Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 050a4e67-6931-4a95-b23d-03b201611d84 without phone or card digits; chargeback f9b8a41f-e37f-49ff-a14a-abbaac32729c recorded and won.

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
  "session_id": "03b3099b-6210-4a17-96c8-759ea52cc24e",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA4MTAsImlhdCI6MTc5MzM0OTkxMCwianRpIjoiMGU5NDkxYjAtMzc1OC00MGNiLTg2ZTYtYmQyMzExOTE0MzQ1Iiwic2lkIjoiMDNiMzA5OWItNjIxMC00YTE3LTk2YzgtNzU5ZWE1MmNjMjRlIn0.gZfFaTRBNJtjKAL1TMHDcyI3VFQ0wwnXJDShHneJK2Q",
  "access_expires_at": "2026-10-30T09:00:10.532336016Z",
  "refresh_token": "e_KPlNglGsZT2w6HmX7L7aXNuLPCSHUpQ9e8IEFabJA",
  "refresh_expires_at": "2026-10-30T20:45:10.531774549Z",
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
  "phone": "+48600847544",
  "device_ref": "sandbox-29855"
}
```

```json
{
  "challenge_id": "c8b7a7c8-a382-4b7e-a8d3-ae18188b7f87",
  "expires_at": "2026-10-30T08:50:11.390489154Z",
  "resend_available_at": "2026-10-30T08:45:12.390489154Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600847544` → **200**

```json
{
  "phone": "+48600847544",
  "audience": "CLIENT",
  "code": "034831",
  "sent_at": "2026-10-30T08:45:11.393488421Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c8b7a7c8-a382-4b7e-a8d3-ae18188b7f87",
  "code": "034831",
  "device_ref": "sandbox-29855"
}
```

```json
{
  "session_id": "0b6ae565-75b3-425b-b8f4-0bb4f99fd8c4",
  "subject": {
    "type": "CLIENT",
    "id": "7b26b876-04eb-4820-8c86-3186c0c50cff"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YjI2Yjg3Ni0wNGViLTQ4MjAtOGM4Ni0zMTg2YzBjNTBjZmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwODExLCJpYXQiOjE3OTMzNDk5MTEsImp0aSI6IjkxMGUyZDgyLTgxYWUtNGQxYi1iMmU1LWY4OWNmNTM4NzA2MyIsInNpZCI6IjBiNmFlNTY1LTc1YjMtNDI1Yi1iOGY0LTBiYjRmOTlmZDhjNCJ9.50r_2OyW_mW47EKXQHIoXvAQqqlHMe0cUbENnOrHUt4",
  "access_expires_at": "2026-10-30T09:00:11.704108541Z",
  "refresh_token": "OSefl5Oz66oFNy2z4CIpNe67vplR36WJU6-GgYsYBeY",
  "refresh_expires_at": "2026-11-29T08:45:11.703610526Z",
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
  "command_id": "c237c2b5-f948-4029-b6b2-fb6e4a2aa77f",
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
  "correlation_id": "8e32f8b5-ce33-4059-a18a-bc5fd32543e5",
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
  "command_id": "cacf47f6-5798-4b16-8ff3-f0994441ed1d",
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
  "paused_at": "2026-10-30T08:45:12.840401041Z",
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
  "command_id": "a8fb2bbd-9713-4d44-996a-b245b3bc0ee9",
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
  "id": "dc65a9a1-7fca-4f02-8da0-30755af29862",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:50:13.462169Z",
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
  "command_id": "2b9380f8-02d2-4cb6-bbc1-0ffaafd696a9",
  "quote_id": "dc65a9a1-7fca-4f02-8da0-30755af29862",
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
  "correlation_id": "3335dc65-df53-4e61-8911-a225ca7faa74"
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
  "paused_at": "2026-10-30T08:45:12.840401Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "91123d5c-a879-4c41-a1cb-6708c3396897",
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
  "command_id": "9cdc28d9-6b6e-49af-82ea-5870305cb2e0",
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
  "command_id": "ded62e13-3688-4779-8559-18f5a6fed45a",
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
  "id": "682a0fc6-0917-461a-bfd8-473652dfe16d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:50:15.196566Z",
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
  "command_id": "be7bbf5a-54e7-4d0c-b5b0-d39d505b0c39",
  "quote_id": "682a0fc6-0917-461a-bfd8-473652dfe16d",
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
  "correlation_id": "bc5e8be1-a191-4659-90d4-bab4473773c7"
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
  "command_id": "805aadc7-74fa-4f3d-9251-89f273cfecb1",
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
      "from": "11:00",
      "to": "12:00"
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
      "from": "11:00",
      "to": "12:00"
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
  "command_id": "69227af0-afcd-476b-b648-f0a054347409",
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
  "id": "472b5c1a-4980-49d0-a049-b201af5a96de",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:50:16.375299Z",
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
  "command_id": "d5d5d3c7-9a52-41d5-8b8d-951f2c0d7c9d",
  "quote_id": "472b5c1a-4980-49d0-a049-b201af5a96de",
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
  "correlation_id": "2f8448ce-1537-47d8-90e4-99b248d7642d"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "eb2ba651-0821-4ad6-894a-826d45c61f77",
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
  "correlation_id": "a53897b3-dfa5-4c5b-a965-9efe68315975"
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
      "from": "11:00",
      "to": "12:00"
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
  "command_id": "77fc0bce-6334-4ec2-8a44-313e73493e78",
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
  "phone": "+380670597723",
  "device_ref": "sandbox-2405"
}
```

```json
{
  "challenge_id": "3f4460f2-b00c-413c-ae27-6ace0c0ceada",
  "expires_at": "2026-10-30T08:50:17.850154773Z",
  "resend_available_at": "2026-10-30T08:45:18.850154773Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670597723` → **200**

```json
{
  "phone": "+380670597723",
  "audience": "CLIENT",
  "code": "307269",
  "sent_at": "2026-10-30T08:45:17.852804198Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3f4460f2-b00c-413c-ae27-6ace0c0ceada",
  "code": "307269",
  "device_ref": "sandbox-2405"
}
```

```json
{
  "session_id": "b707379d-1def-40f7-805f-3bd820135d6a",
  "subject": {
    "type": "CLIENT",
    "id": "07bfe2fe-ea3a-4257-a67a-5b92c4c97f9f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwN2JmZTJmZS1lYTNhLTQyNTctYTY3YS01YjkyYzRjOTdmOWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwODE4LCJpYXQiOjE3OTMzNDk5MTgsImp0aSI6ImE5MzYxMzg3LWZiNTgtNGZkYi1iODJmLWYzN2JiNzAwNTc2MSIsInNpZCI6ImI3MDczNzlkLTFkZWYtNDBmNy04MDVmLTNiZDgyMDEzNWQ2YSJ9.edt9U7X7uVaoyrIiXfEFOA3FddhMAkd-I98QFvhohLM",
  "access_expires_at": "2026-10-30T09:00:18.164844598Z",
  "refresh_token": "9cwdWswwNYuxDA0-OQ7gDj3pTGL433q4FyQUV6UV7pM",
  "refresh_expires_at": "2026-11-29T08:45:18.164320855Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "07bfe2fe-ea3a-4257-a67a-5b92c4c97f9f",
  "session_id": "b707379d-1def-40f7-805f-3bd820135d6a",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "13e3f936-289e-4a84-a27d-fdf1a477ee78",
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
  "id": "d2e69a37-a425-4136-b39f-61199dd6d919",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:50:18.771525Z",
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
  "challenge_id": "16c2d45e-b2f1-43ef-b014-1c9ff19f566c",
  "expires_at": "2026-10-30T08:50:21.073534324Z",
  "resend_available_at": "2026-10-30T08:45:22.073534324Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670597723` → **200**

```json
{
  "phone": "+380670597723",
  "audience": "CLIENT",
  "code": "947494",
  "sent_at": "2026-10-30T08:45:21.075970406Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "a8b209f3-6d1c-4662-8134-a4f564c0ace7",
  "challenge_id": "16c2d45e-b2f1-43ef-b014-1c9ff19f566c",
  "otp_code": "947494"
}
```

```json
{
  "client_id": "07bfe2fe-ea3a-4257-a67a-5b92c4c97f9f",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T08:45:21.401237497Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "1c5e1043-c173-4bb8-a33d-509a85abda92",
  "quote_id": "d2e69a37-a425-4136-b39f-61199dd6d919",
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
  "correlation_id": "d020d367-4703-4b94-bf56-531037a13e32"
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
  "session_id": "f2c6f3f1-64b0-4413-a006-924e2a632866",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA4MjIsImlhdCI6MTc5MzM0OTkyMiwianRpIjoiMDlkYTcwZGMtZWMyNi00ODFjLTllZTgtMjg0ZWJjNzJmMDFiIiwic2lkIjoiZjJjNmYzZjEtNjRiMC00NDEzLWEwMDYtOTI0ZTJhNjMyODY2In0.vVAftYW94TGBS0SXoxJ_RmnCG6dz_NwlO2YP-Xgnp8M",
  "access_expires_at": "2026-10-30T09:00:22.273711263Z",
  "refresh_token": "0vFlaLNQHMmSUhsoT9Or9T2zdldS23YnJADmDFnH5Bw",
  "refresh_expires_at": "2026-10-30T20:45:22.273175046Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "07bfe2fe-ea3a-4257-a67a-5b92c4c97f9f",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T08:45:21.401237Z",
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

`POST /api/admin/v1/client-deletions/07bfe2fe-ea3a-4257-a67a-5b92c4c97f9f/complete` → **200**

```json
{
  "command_id": "8e1729e7-e335-4e70-b437-213174d28227",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "07bfe2fe-ea3a-4257-a67a-5b92c4c97f9f",
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
  "correlation_id": "9e5b637a-598c-4423-a0e6-18e3adc7954b"
}
```

Done: client 07bfe2fe-ea3a-4257-a67a-5b92c4c97f9f anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660358818",
  "device_ref": "sandbox-4092"
}
```

```json
{
  "challenge_id": "4cf25b9b-e9f1-4ade-8f9a-5c0032f381f1",
  "expires_at": "2026-10-30T08:50:23.488069533Z",
  "resend_available_at": "2026-10-30T08:45:24.488069533Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660358818` → **200**

```json
{
  "phone": "+380660358818",
  "audience": "CLIENT",
  "code": "952357",
  "sent_at": "2026-10-30T08:45:23.491585622Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4cf25b9b-e9f1-4ade-8f9a-5c0032f381f1",
  "code": "952357",
  "device_ref": "sandbox-4092"
}
```

```json
{
  "session_id": "fc37d047-9a59-4b6a-a2d8-2dfcadbc4267",
  "subject": {
    "type": "CLIENT",
    "id": "c932c696-8bea-42c6-955a-9345098d830b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOTMyYzY5Ni04YmVhLTQyYzYtOTU1YS05MzQ1MDk4ZDgzMGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwODIzLCJpYXQiOjE3OTMzNDk5MjMsImp0aSI6ImRkYjIxMjIxLTE3MjEtNGMyMC04ZGY5LWYxNWE0MjIxNTRkMyIsInNpZCI6ImZjMzdkMDQ3LTlhNTktNGI2YS1hMmQ4LTJkZmNhZGJjNDI2NyJ9.SZVY314TReKteMmpgpzfXFbsacssMilfJOfludZCEGo",
  "access_expires_at": "2026-10-30T09:00:23.818729072Z",
  "refresh_token": "HEpyLb7bKHamZ7GMgFG8whvwhzvdDHi8j7uMIBTeo3A",
  "refresh_expires_at": "2026-11-29T08:45:23.818208687Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c932c696-8bea-42c6-955a-9345098d830b",
  "session_id": "fc37d047-9a59-4b6a-a2d8-2dfcadbc4267",
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
  "session_id": "9714af2d-29a5-43d7-885b-caf63faf81de",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA4MjQsImlhdCI6MTc5MzM0OTkyNCwianRpIjoiNDA1MjM3MTEtODVjOC00Mjc4LTg2YWItNDQ2ZGQwOTg0NGNiIiwic2lkIjoiOTcxNGFmMmQtMjlhNS00M2Q3LTg4NWItY2FmNjNmYWY4MWRlIn0.VP5r4Y7hLJHRs8MXzU8vCOtZyKuVLsrg6-T9PGQYjjk",
  "access_expires_at": "2026-10-30T09:00:24.674460863Z",
  "refresh_token": "5-5nG3BU3nHxAgB9V_6qVbifw9n4R9K2NRWQyqnaV1Q",
  "refresh_expires_at": "2026-10-30T20:45:24.673965565Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=0358818&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "c932c696-8bea-42c6-955a-9345098d830b",
      "phone": "+380660358818",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T08:45:23.816592Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/c932c696-8bea-42c6-955a-9345098d830b` → **200**

```json
{
  "client": {
    "id": "c932c696-8bea-42c6-955a-9345098d830b",
    "phone": "+380660358818",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:45:23.816592Z",
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

`POST /api/admin/v1/clients/c932c696-8bea-42c6-955a-9345098d830b/block` → **400**

```json
{
  "command_id": "96343afa-6661-48d7-af0f-406ae49e3f77",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/c932c696-8bea-42c6-955a-9345098d830b/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "a5e3a736-b981-4e2e-85a2-41061be74fac",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/c932c696-8bea-42c6-955a-9345098d830b/block` → **200**

```json
{
  "command_id": "8ec9b7af-e0ab-4bbb-a917-03bc319e3d15",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "c932c696-8bea-42c6-955a-9345098d830b",
  "phone": "+380660358818",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T08:45:23.816592Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T08:45:25.871098Z",
    "by": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
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
  "correlation_id": "a5397ade-b7f6-4528-9a76-b37cd8f00b53"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660358818",
  "device_ref": "sandbox-14372"
}
```

```json
{
  "challenge_id": "71b39103-65a5-4b3f-8bf9-184fb8499a99",
  "expires_at": "2026-10-30T08:50:28.433694552Z",
  "resend_available_at": "2026-10-30T08:45:29.433694552Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660358818` → **200**

```json
{
  "phone": "+380660358818",
  "audience": "CLIENT",
  "code": "282501",
  "sent_at": "2026-10-30T08:45:28.43619272Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "71b39103-65a5-4b3f-8bf9-184fb8499a99",
  "code": "282501",
  "device_ref": "sandbox-14372"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "d4ce008c-db8e-487f-ab2d-9194fd001b5c"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/c932c696-8bea-42c6-955a-9345098d830b` → **200**

```json
{
  "client": {
    "id": "c932c696-8bea-42c6-955a-9345098d830b",
    "phone": "+380660358818",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T08:45:23.816592Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T08:45:25.871098Z",
      "by": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
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

`POST /api/admin/v1/clients/c932c696-8bea-42c6-955a-9345098d830b/unblock` → **200**

```json
{
  "command_id": "7313da5a-eca1-4bb5-b2b2-ef5d19d2944c",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "c932c696-8bea-42c6-955a-9345098d830b",
  "phone": "+380660358818",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T08:45:23.816592Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660358818",
  "device_ref": "sandbox-26126"
}
```

```json
{
  "challenge_id": "18cba8d2-9583-4725-840f-ac5bb3dd968e",
  "expires_at": "2026-10-30T08:50:31.638109193Z",
  "resend_available_at": "2026-10-30T08:45:32.638109193Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660358818` → **200**

```json
{
  "phone": "+380660358818",
  "audience": "CLIENT",
  "code": "061376",
  "sent_at": "2026-10-30T08:45:31.640878672Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "18cba8d2-9583-4725-840f-ac5bb3dd968e",
  "code": "061376",
  "device_ref": "sandbox-26126"
}
```

```json
{
  "session_id": "05cd6588-8a5a-43ca-a9ef-661d77e5a2ec",
  "subject": {
    "type": "CLIENT",
    "id": "c932c696-8bea-42c6-955a-9345098d830b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOTMyYzY5Ni04YmVhLTQyYzYtOTU1YS05MzQ1MDk4ZDgzMGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwODMxLCJpYXQiOjE3OTMzNDk5MzEsImp0aSI6ImYyYTMzYTM4LWU1YTItNDkwMy1hOTgxLWQ1N2Q4MTkxOGU3MyIsInNpZCI6IjA1Y2Q2NTg4LThhNWEtNDNjYS1hOWVmLTY2MWQ3N2U1YTJlYyJ9.9wBJ_cOABPtOc72NilyBXxH_mLXXvpbwy_ldo4hw7qc",
  "access_expires_at": "2026-10-30T09:00:31.941327662Z",
  "refresh_token": "g56CvD76NRqJSOLPZAK2Kx6hj52hWIiSYEAHpOTuedQ",
  "refresh_expires_at": "2026-11-29T08:45:31.940857982Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c932c696-8bea-42c6-955a-9345098d830b",
  "session_id": "05cd6588-8a5a-43ca-a9ef-661d77e5a2ec",
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
  "phone": "+380666970558",
  "device_ref": "sandbox-19371"
}
```

```json
{
  "challenge_id": "2803939a-def9-4249-aff6-22cdf3ae7f3f",
  "expires_at": "2026-10-30T08:50:32.517590945Z",
  "resend_available_at": "2026-10-30T08:45:33.517590945Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666970558` → **200**

```json
{
  "phone": "+380666970558",
  "audience": "CLIENT",
  "code": "969919",
  "sent_at": "2026-10-30T08:45:32.520174426Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2803939a-def9-4249-aff6-22cdf3ae7f3f",
  "code": "969919",
  "device_ref": "sandbox-19371"
}
```

```json
{
  "session_id": "6bea90ee-3788-4d56-be77-1dd1676b0bc0",
  "subject": {
    "type": "CLIENT",
    "id": "2729c83c-aa3c-41a3-943a-4262d04b06de"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNzI5YzgzYy1hYTNjLTQxYTMtOTQzYS00MjYyZDA0YjA2ZGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwODMyLCJpYXQiOjE3OTMzNDk5MzIsImp0aSI6IjYxODFlM2FhLWJhYzAtNGU0Yi05MzY4LTg4YTc4NTFkNmJlZCIsInNpZCI6IjZiZWE5MGVlLTM3ODgtNGQ1Ni1iZTc3LTFkZDE2NzZiMGJjMCJ9.jHEliTwfVOvSFdM43-5MJd9UJFcH97FnbR2BI_OxMGw",
  "access_expires_at": "2026-10-30T09:00:32.820826173Z",
  "refresh_token": "Lf7IC3UEe-ww175xtiG5fEsMB-Zk4ppA1iflxRboLjY",
  "refresh_expires_at": "2026-11-29T08:45:32.820327488Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c2183653-5dd0-4a0f-874c-4c751cbd2c5a",
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
  "id": "3a3f1596-1217-4660-8e22-42b303fabede",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:50:33.104184Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 268c7136-2532-452a-831d-0db46ad95d23) → **201**

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
  "session_id": "c8aecb53-edd7-4113-991a-1607a9bc48f4",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA4MzMsImlhdCI6MTc5MzM0OTkzMywianRpIjoiNmQ5ZTIxNTYtMGJmNS00YjA0LThiYzUtODlhMGM5ZjdkMzc5Iiwic2lkIjoiYzhhZWNiNTMtZWRkNy00MTEzLTk5MWEtMTYwN2E5YmM0OGY0In0.wSFkBIJTImcDzdpo6nwyIr3eMYZV7b_NOrfjfWr6uuE",
  "access_expires_at": "2026-10-30T09:00:33.737557183Z",
  "refresh_token": "9f8Rj2zo9UUTyk9h2_8_VEPZ4k3EXUtSwslHd97Jx-k",
  "refresh_expires_at": "2026-10-30T20:45:33.736981163Z",
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
  "session_id": "be0fbd92-54db-4f5a-b1e6-c64dc8ef7e5f",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA4MzQsImlhdCI6MTc5MzM0OTkzNCwianRpIjoiZTYyZjE1ODUtZWI1MC00MWY5LThkOGMtMDMzYjUxZDc2OTYzIiwic2lkIjoiYmUwZmJkOTItNTRkYi00ZjVhLWIxZTYtYzY0ZGM4ZWY3ZTVmIn0.2n2xaVdSvH0Ygm338Ic9po5aC2Cr0tRFkiXj0l_1Hzg",
  "access_expires_at": "2026-10-30T09:00:34.312194224Z",
  "refresh_token": "CD1GvKb_1S63a9_xS1UITyd6S4Eo6nxasrtWsOfw5XM",
  "refresh_expires_at": "2026-10-30T20:45:34.311716348Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/27f6f63a-4c83-4b11-b1e8-a303b808188d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:45:33.409278Z",
      "actor": {
        "type": "CLIENT",
        "id": "2729c83c-aa3c-41a3-943a-4262d04b06de",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "27f6f63a-4c83-4b11-b1e8-a303b808188d",
        "quote_id": "3a3f1596-1217-4660-8e22-42b303fabede",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "268c7136-2532-452a-831d-0db46ad95d23"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:45:33.411118Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "27f6f63a-4c83-4b11-b1e8-a303b808188d",
        "attempt_id": "0b31e28b-b40b-452e-9ad2-eb9efed5a621",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "268c7136-2532-452a-831d-0db46ad95d23"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T08:45:33.418211Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "27f6f63a-4c83-4b11-b1e8-a303b808188d",
        "attempt_id": "0b31e28b-b40b-452e-9ad2-eb9efed5a621"
      },
      "correlation_id": "268c7136-2532-452a-831d-0db46ad95d23"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "0b31e28b-b40b-452e-9ad2-eb9efed5a621",
        "generation": 1,
        "started_at": "2026-10-30T08:45:33.41018Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T08:45:33.418211Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T08:45:33.411776Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/268c7136-2532-452a-831d-0db46ad95d23` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "27f6f63a-4c83-4b11-b1e8-a303b808188d:0",
      "order_id": "27f6f63a-4c83-4b11-b1e8-a303b808188d",
      "at": "2026-10-30T08:45:33.409278Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "27f6f63a-4c83-4b11-b1e8-a303b808188d:1",
      "order_id": "27f6f63a-4c83-4b11-b1e8-a303b808188d",
      "at": "2026-10-30T08:45:33.411118Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "27f6f63a-4c83-4b11-b1e8-a303b808188d:2",
      "order_id": "27f6f63a-4c83-4b11-b1e8-a303b808188d",
      "at": "2026-10-30T08:45:33.418211Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/7d2ecac0-894e-4bac-8f05-c0440e094d0f` → **200**

```json
{
  "found": []
}
```

Done: request 268c7136-2532-452a-831d-0db46ad95d23 — order 27f6f63a-4c83-4b11-b1e8-a303b808188d found by its id.

`GET /api/rider/v1/orders/27f6f63a-4c83-4b11-b1e8-a303b808188d` → **200**

```json
{
  "id": "27f6f63a-4c83-4b11-b1e8-a303b808188d",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2729c83c-aa3c-41a3-943a-4262d04b06de",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:45:33.408842Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/27f6f63a-4c83-4b11-b1e8-a303b808188d/cancel` → **200**

```json
{
  "command_id": "0f20d06a-9469-47dc-8466-cb398f2522e4",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "27f6f63a-4c83-4b11-b1e8-a303b808188d",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2729c83c-aa3c-41a3-943a-4262d04b06de",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:45:33.408842Z",
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
  "phone": "+380635719030",
  "device_ref": "sandbox-9413"
}
```

```json
{
  "challenge_id": "aa4907b3-fc63-4b6e-8bcf-a3ba85dd8cd3",
  "expires_at": "2026-10-30T08:50:36.063860006Z",
  "resend_available_at": "2026-10-30T08:45:37.063860006Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635719030` → **200**

```json
{
  "phone": "+380635719030",
  "audience": "CLIENT",
  "code": "839250",
  "sent_at": "2026-10-30T08:45:36.066769261Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa4907b3-fc63-4b6e-8bcf-a3ba85dd8cd3",
  "code": "839250",
  "device_ref": "sandbox-9413"
}
```

```json
{
  "session_id": "851d2dd7-aae8-4ad4-ac26-f76e4281c1df",
  "subject": {
    "type": "CLIENT",
    "id": "2ec29fd2-20a6-448b-a4f5-7fc7987dbb8c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZWMyOWZkMi0yMGE2LTQ0OGItYTRmNS03ZmM3OTg3ZGJiOGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwODM2LCJpYXQiOjE3OTMzNDk5MzYsImp0aSI6IjJjOWEzOGUyLTViMTAtNDc4Ni05ZDRlLWY5MWJlYjRjODdiYiIsInNpZCI6Ijg1MWQyZGQ3LWFhZTgtNGFkNC1hYzI2LWY3NmU0MjgxYzFkZiJ9.v-8zdmU1IWKgzvh-P4HbzsY-nvfLXJmxnFTBCgST7SA",
  "access_expires_at": "2026-10-30T09:00:36.373271428Z",
  "refresh_token": "xPq6xnlpSYI1hrEpV5V4dIzOnXrTeUecMhr_EaBlQ_8",
  "refresh_expires_at": "2026-11-29T08:45:36.372779705Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "9877b999-a6fc-45c8-851c-7618dd8cd53e",
  "expires_at": "2026-10-30T08:50:38.659248502Z",
  "resend_available_at": "2026-10-30T08:45:39.659248502Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635719030` → **200**

```json
{
  "phone": "+380635719030",
  "audience": "CLIENT",
  "code": "974442",
  "sent_at": "2026-10-30T08:45:38.661615058Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "49aea4c4-a5d9-480c-9b0c-890951f21c9b",
  "challenge_id": "9877b999-a6fc-45c8-851c-7618dd8cd53e",
  "otp_code": "974442"
}
```

```json
{
  "id": "58f0d66b-08de-4165-9197-c3cc2baa1e50",
  "state": "PENDING",
  "created_at": "2026-10-30T08:45:38.981887Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/58f0d66b-08de-4165-9197-c3cc2baa1e50` → **200**

```json
{
  "id": "58f0d66b-08de-4165-9197-c3cc2baa1e50",
  "state": "PENDING",
  "created_at": "2026-10-30T08:45:38.981887Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/58f0d66b-08de-4165-9197-c3cc2baa1e50` → **200**

```json
{
  "id": "58f0d66b-08de-4165-9197-c3cc2baa1e50",
  "state": "PENDING",
  "created_at": "2026-10-30T08:45:38.981887Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/58f0d66b-08de-4165-9197-c3cc2baa1e50` → **200**

```json
{
  "id": "58f0d66b-08de-4165-9197-c3cc2baa1e50",
  "state": "PENDING",
  "created_at": "2026-10-30T08:45:38.981887Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/58f0d66b-08de-4165-9197-c3cc2baa1e50` → **200**

```json
{
  "id": "58f0d66b-08de-4165-9197-c3cc2baa1e50",
  "state": "PENDING",
  "created_at": "2026-10-30T08:45:38.981887Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/58f0d66b-08de-4165-9197-c3cc2baa1e50` → **200**

```json
{
  "id": "58f0d66b-08de-4165-9197-c3cc2baa1e50",
  "state": "PENDING",
  "created_at": "2026-10-30T08:45:38.981887Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/58f0d66b-08de-4165-9197-c3cc2baa1e50` → **200**

```json
{
  "id": "58f0d66b-08de-4165-9197-c3cc2baa1e50",
  "state": "PENDING",
  "created_at": "2026-10-30T08:45:38.981887Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/58f0d66b-08de-4165-9197-c3cc2baa1e50` → **200**

```json
{
  "id": "58f0d66b-08de-4165-9197-c3cc2baa1e50",
  "state": "PENDING",
  "created_at": "2026-10-30T08:45:38.981887Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/58f0d66b-08de-4165-9197-c3cc2baa1e50` → **200**

```json
{
  "id": "58f0d66b-08de-4165-9197-c3cc2baa1e50",
  "state": "PENDING",
  "created_at": "2026-10-30T08:45:38.981887Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/58f0d66b-08de-4165-9197-c3cc2baa1e50` → **200**

```json
{
  "id": "58f0d66b-08de-4165-9197-c3cc2baa1e50",
  "state": "READY",
  "created_at": "2026-10-30T08:45:38.981887Z",
  "ready_at": "2026-10-30T08:45:48.842656Z",
  "expires_at": "2026-11-06T08:45:48.842656Z",
  "size_bytes": 1028
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/58f0d66b-08de-4165-9197-c3cc2baa1e50/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633882814",
  "device_ref": "sandbox-7227"
}
```

```json
{
  "challenge_id": "e07bc030-c3ad-4d38-905d-49a405b5c3f9",
  "expires_at": "2026-10-30T08:50:49.887763022Z",
  "resend_available_at": "2026-10-30T08:45:50.887763022Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633882814` → **200**

```json
{
  "phone": "+380633882814",
  "audience": "CLIENT",
  "code": "034377",
  "sent_at": "2026-10-30T08:45:49.890456676Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e07bc030-c3ad-4d38-905d-49a405b5c3f9",
  "code": "034377",
  "device_ref": "sandbox-7227"
}
```

```json
{
  "session_id": "07a6d4e4-722a-4bac-abe5-bfcd417c92ec",
  "subject": {
    "type": "CLIENT",
    "id": "62790702-b650-4448-9177-75ad37c604da"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2Mjc5MDcwMi1iNjUwLTQ0NDgtOTE3Ny03NWFkMzdjNjA0ZGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwODUwLCJpYXQiOjE3OTMzNDk5NTAsImp0aSI6ImNiODRkMWEzLWJlNTgtNDU2Mi1hNzdjLTA4MTk3YTE0ZTE5MyIsInNpZCI6IjA3YTZkNGU0LTcyMmEtNGJhYy1hYmU1LWJmY2Q0MTdjOTJlYyJ9.KOiNjIgxNGawHJodY2IU1MRwlwJ4mrHRUHUAFzWbGdQ",
  "access_expires_at": "2026-10-30T09:00:50.191787566Z",
  "refresh_token": "08AJY58HvXNhyrgTB9OfSr6VPQVDiMi-Hy0lOsQOnoQ",
  "refresh_expires_at": "2026-11-29T08:45:50.191268192Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/58f0d66b-08de-4165-9197-c3cc2baa1e50/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/58f0d66b-08de-4165-9197-c3cc2baa1e50/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b63733fc-fe1f-4cbd-8cb4-0b87839bee48"
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
  "session_id": "4f1fff74-59ac-41a4-978d-60df390c7e1b",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA4NTEsImlhdCI6MTc5MzM0OTk1MSwianRpIjoiN2QzMzE0ZWItN2NmMS00ZjY3LTgwNjctNzRjMjE2MjIyODcxIiwic2lkIjoiNGYxZmZmNzQtNTlhYy00MWE0LTk3OGQtNjBkZjM5MGM3ZTFiIn0.Siycp6zf2PROukz_-nLJGEwtTQr7zVEMoCp8Y1Pu274",
  "access_expires_at": "2026-10-30T09:00:51.049356919Z",
  "refresh_token": "K_yKKx7cx6zMpQWA6wCneMx5RAC2jsswn9JvpURCsoo",
  "refresh_expires_at": "2026-10-30T20:45:51.04882402Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "2ec29fd2-20a6-448b-a4f5-7fc7987dbb8c",
  "session_id": "851d2dd7-aae8-4ad4-ac26-f76e4281c1df",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/2ec29fd2-20a6-448b-a4f5-7fc7987dbb8c/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "58f0d66b-08de-4165-9197-c3cc2baa1e50",
      "state": "READY",
      "created_at": "2026-10-30T08:45:38.981887Z",
      "ready_at": "2026-10-30T08:45:48.842656Z",
      "expires_at": "2026-11-06T08:45:48.842656Z",
      "size_bytes": 1028
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
  "device_ref": "sandbox-29327"
}
```

```json
{
  "challenge_id": "21317921-ed8c-475c-8d1b-4b701593d44f",
  "expires_at": "2026-10-30T08:50:51.99908124Z",
  "resend_available_at": "2026-10-30T08:45:52.99908124Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "246814",
  "sent_at": "2026-10-30T08:45:52.001883486Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "21317921-ed8c-475c-8d1b-4b701593d44f",
  "code": "246814",
  "device_ref": "sandbox-29327"
}
```

```json
{
  "session_id": "f9ee0187-aee6-4220-93ce-b2a07ed70279",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDg1MiwiaWF0IjoxNzkzMzQ5OTUyLCJqdGkiOiI5NzA5Mzg5MS1lOTQ4LTRlZTktYTk5NC1kYzQ2OGZiNmVkMzkiLCJzaWQiOiJmOWVlMDE4Ny1hZWU2LTQyMjAtOTNjZS1iMmEwN2VkNzAyNzkifQ.bhsph0Dpqx7DUqwsDmtawpxFpmAmJuxm9DMkWtHNACg",
  "access_expires_at": "2026-10-30T09:00:52.340114145Z",
  "refresh_token": "Wd9xY1XHqV0N5x8uB722Cg01ZSl_PFn8M9EBH8qmGkA",
  "refresh_expires_at": "2026-11-29T08:45:52.339511502Z",
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
  "device_ref": "sandbox-446"
}
```

```json
{
  "challenge_id": "5173e619-3293-4cc5-954a-718ebb87a838",
  "expires_at": "2026-10-30T08:50:52.904726173Z",
  "resend_available_at": "2026-10-30T08:45:53.904726173Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "398333",
  "sent_at": "2026-10-30T08:45:52.908054909Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5173e619-3293-4cc5-954a-718ebb87a838",
  "code": "398333",
  "device_ref": "sandbox-446"
}
```

```json
{
  "session_id": "a83d2bbe-1317-489f-87cf-8fb00f2af55e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDg1MywiaWF0IjoxNzkzMzQ5OTUzLCJqdGkiOiJjMDgyZGNlYS1mNzEwLTRhZDMtOWIwZS0wZWJkMzI3MzA1NzQiLCJzaWQiOiJhODNkMmJiZS0xMzE3LTQ4OWYtODdjZi04ZmIwMGYyYWY1NWUifQ.VhHeaY8LF3gnrTA7YCxqL9Ju3sgeaGnVa0F4aDec1EE",
  "access_expires_at": "2026-10-30T09:00:53.21649743Z",
  "refresh_token": "Zr0jduI-NVSWwujqajpt53u1XYBuguMDR6shUjy2bk8",
  "refresh_expires_at": "2026-11-29T08:45:53.215959197Z",
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
  "command_id": "95ea5a15-1913-410d-b2b6-97db277a06ea",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:45:53Z",
    "sequence": 1793349953790
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f9fa7794-c732-42c9-bf53-d73c5e30bc97",
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
  "last_heartbeat_at": "2026-10-30T08:45:53.809242Z",
  "last_location_at": "2026-10-30T08:45:53.809242Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-21617"
}
```

```json
{
  "challenge_id": "b7a576d3-c4f5-46af-a1c9-cdc0ddf1bac2",
  "expires_at": "2026-10-30T08:50:54.098766721Z",
  "resend_available_at": "2026-10-30T08:45:55.098766721Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "810143",
  "sent_at": "2026-10-30T08:45:54.102815959Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b7a576d3-c4f5-46af-a1c9-cdc0ddf1bac2",
  "code": "810143",
  "device_ref": "sandbox-21617"
}
```

```json
{
  "session_id": "489b66c3-d4b3-4b4d-a18b-1e9bbb530308",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDg1NCwiaWF0IjoxNzkzMzQ5OTU0LCJqdGkiOiIzMDcxY2QwMC0xZGIyLTQ5YzUtODU4MC1mNmJhYThlOWVjZTQiLCJzaWQiOiI0ODliNjZjMy1kNGIzLTRiNGQtYTE4Yi0xZTliYmI1MzAzMDgifQ.j1Hn0lxCj_WJCWqdQlpg36Sn9DoNlDDiEmtbtCFvNbM",
  "access_expires_at": "2026-10-30T09:00:54.415915656Z",
  "refresh_token": "zALIVMflRzMWQs64uCvrWnbNTYirAuwK6RkPRAg99a4",
  "refresh_expires_at": "2026-11-29T08:45:54.415357118Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "73360dc9-37bf-4d3a-b1a4-9a1376a5ecf6",
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
  "last_heartbeat_at": "2026-10-30T08:44:13.838363Z",
  "last_location_at": "2026-10-30T08:44:13.838363Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/73360dc9-37bf-4d3a-b1a4-9a1376a5ecf6/handover` → **200**

```json
{
  "command_id": "6c1c8e66-7746-44e0-b597-d5866767cb80",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "73360dc9-37bf-4d3a-b1a4-9a1376a5ecf6",
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
  "last_heartbeat_at": "2026-10-30T08:44:13.838363Z",
  "last_location_at": "2026-10-30T08:44:13.838363Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/73360dc9-37bf-4d3a-b1a4-9a1376a5ecf6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:45:55Z",
    "sequence": 1793349955260
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "73360dc9-37bf-4d3a-b1a4-9a1376a5ecf6",
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
  "last_heartbeat_at": "2026-10-30T08:45:55.27877Z",
  "last_location_at": "2026-10-30T08:45:55.27877Z",
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
  "session_id": "3367f21c-2105-4576-bf2c-54711ea2f73c",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA4NTUsImlhdCI6MTc5MzM0OTk1NSwianRpIjoiOTRkNjI2N2QtMDlmMC00NDMyLTg5MTgtZjY2MTQwMDY4YzdjIiwic2lkIjoiMzM2N2YyMWMtMjEwNS00NTc2LWJmMmMtNTQ3MTFlYTJmNzNjIn0.TiYmrbMNY-UY_0XrymQUN1tkDQEYmLBMHUAwwXdTHvM",
  "access_expires_at": "2026-10-30T09:00:55.855911276Z",
  "refresh_token": "KRcu_DL6Wn6vi5CvA767n5WCMJyFujrQm0CgJAPdNPE",
  "refresh_expires_at": "2026-10-30T20:45:55.855356247Z",
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
  "session_id": "8458f403-e252-40c2-8617-01051f5ba80c",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA4NTYsImlhdCI6MTc5MzM0OTk1NiwianRpIjoiZjk0ZDkxZTYtMmRhYS00NDJlLWI4MjItZjdhZmNlOTM1NDZiIiwic2lkIjoiODQ1OGY0MDMtZTI1Mi00MGMyLTg2MTctMDEwNTFmNWJhODBjIn0.I8nXLTCTsX36sP5vWQj5pTHMcF2-UO348rvGIgqQh6E",
  "access_expires_at": "2026-10-30T09:00:56.41917101Z",
  "refresh_token": "AKh52NMVdv20nSvbtqrqDih38Jpm5ANmGqJs0g3ywTA",
  "refresh_expires_at": "2026-10-30T20:45:56.418608807Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380689279063",
  "device_ref": "sandbox-11273"
}
```

```json
{
  "challenge_id": "e6a45815-bdf4-46b5-8bf4-12f86d8b1786",
  "expires_at": "2026-10-30T08:50:56.695937686Z",
  "resend_available_at": "2026-10-30T08:45:57.695937686Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380689279063` → **200**

```json
{
  "phone": "+380689279063",
  "audience": "CLIENT",
  "code": "879163",
  "sent_at": "2026-10-30T08:45:56.69877633Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e6a45815-bdf4-46b5-8bf4-12f86d8b1786",
  "code": "879163",
  "device_ref": "sandbox-11273"
}
```

```json
{
  "session_id": "84bc66df-3a0b-4d61-b818-fd8f732e7bc2",
  "subject": {
    "type": "CLIENT",
    "id": "a2fdf930-4af8-4d1d-a08a-aee2ab2a5b72"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMmZkZjkzMC00YWY4LTRkMWQtYTA4YS1hZWUyYWIyYTViNzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwODU2LCJpYXQiOjE3OTMzNDk5NTYsImp0aSI6Ijc1OWQzOWRhLWJhYzItNDRmYy1hNWJlLTZkYjZjMTBhMmRmZSIsInNpZCI6Ijg0YmM2NmRmLTNhMGItNGQ2MS1iODE4LWZkOGY3MzJlN2JjMiJ9.NopuOEJMGpfojxC-Ovtm6ubeY63qbB75UKqlY69XGIQ",
  "access_expires_at": "2026-10-30T09:00:56.998009045Z",
  "refresh_token": "_i_ZqUUZiaBsDAxyrn0Pwf3Nia8ZRpp0sGHnGzxi95E",
  "refresh_expires_at": "2026-11-29T08:45:56.997518387Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "837b50a7-c88c-479c-9cf0-8d07e44cad78",
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
  "id": "d4096115-39ae-4866-a74d-96ea2642db64",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:50:57.280810Z",
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
  "command_id": "14bd1c4d-ff65-40c8-a841-797552639145",
  "quote_id": "d4096115-39ae-4866-a74d-96ea2642db64",
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
  "id": "c4a6ce70-edc4-4eb0-8305-d5af6556ce06",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a2fdf930-4af8-4d1d-a08a-aee2ab2a5b72",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:45:57.578636Z",
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
    "id": "dab3d90a-8025-4d75-8758-0586d19b87b6",
    "order_id": "c4a6ce70-edc4-4eb0-8305-d5af6556ce06",
    "expires_at": "2026-10-30T08:46:12.581788Z",
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

`POST /api/driver/v1/offers/dab3d90a-8025-4d75-8758-0586d19b87b6/reject` → **204**

```json
{
  "command_id": "f3fc77e6-ba19-4ce2-ae37-e3537330c3b0"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "8d689270-3597-4c4d-9229-32b7f5cb499f",
    "order_id": "c4a6ce70-edc4-4eb0-8305-d5af6556ce06",
    "expires_at": "2026-10-30T08:46:13.185349Z",
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

`POST /api/driver/v1/offers/8d689270-3597-4c4d-9229-32b7f5cb499f/accept` → **200**

```json
{
  "command_id": "0846fb82-8865-40db-8be8-5b59e38dbd3c"
}
```

```json
{
  "id": "30024fd6-9668-480e-b297-3b04930ac150",
  "order_id": "c4a6ce70-edc4-4eb0-8305-d5af6556ce06",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3ca9544f-6877-4721-944d-83730d03eda1",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/c4a6ce70-edc4-4eb0-8305-d5af6556ce06/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:45:57.579071Z",
      "actor": {
        "type": "CLIENT",
        "id": "a2fdf930-4af8-4d1d-a08a-aee2ab2a5b72",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c4a6ce70-edc4-4eb0-8305-d5af6556ce06",
        "quote_id": "d4096115-39ae-4866-a74d-96ea2642db64",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "b05462bc-8649-4c57-9d0a-1bd9203b111e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:45:57.581027Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c4a6ce70-edc4-4eb0-8305-d5af6556ce06",
        "attempt_id": "cbe087aa-6cd8-4873-b82b-11dcdfce233d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b05462bc-8649-4c57-9d0a-1bd9203b111e"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:45:57.583994Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "dab3d90a-8025-4d75-8758-0586d19b87b6",
        "order_id": "c4a6ce70-edc4-4eb0-8305-d5af6556ce06",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "b05462bc-8649-4c57-9d0a-1bd9203b111e"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T08:45:58.184487Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "dab3d90a-8025-4d75-8758-0586d19b87b6",
        "order_id": "c4a6ce70-edc4-4eb0-8305-d5af6556ce06"
      },
      "correlation_id": "3b5e062d-df7b-436e-b7d8-0405e2025451"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order c4a6ce70-edc4-4eb0-8305-d5af6556ce06 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/c4a6ce70-edc4-4eb0-8305-d5af6556ce06` → **200**

```json
{
  "id": "c4a6ce70-edc4-4eb0-8305-d5af6556ce06",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "a2fdf930-4af8-4d1d-a08a-aee2ab2a5b72",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "30024fd6-9668-480e-b297-3b04930ac150",
    "order_id": "c4a6ce70-edc4-4eb0-8305-d5af6556ce06",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "3ca9544f-6877-4721-944d-83730d03eda1",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T08:45:57.578636Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c4a6ce70-edc4-4eb0-8305-d5af6556ce06/cancel` → **200**

```json
{
  "command_id": "c98e4cf0-e64c-46cb-abf2-8c0717b7e9fa",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "c4a6ce70-edc4-4eb0-8305-d5af6556ce06",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "a2fdf930-4af8-4d1d-a08a-aee2ab2a5b72",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "30024fd6-9668-480e-b297-3b04930ac150",
    "order_id": "c4a6ce70-edc4-4eb0-8305-d5af6556ce06",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "3ca9544f-6877-4721-944d-83730d03eda1",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T08:45:57.578636Z",
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
  "session_id": "f9fa7794-c732-42c9-bf53-d73c5e30bc97",
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
  "last_heartbeat_at": "2026-10-30T08:45:53.809242Z",
  "last_location_at": "2026-10-30T08:45:53.809242Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f9fa7794-c732-42c9-bf53-d73c5e30bc97/close` → **200**

```json
{
  "command_id": "5bb618b6-d5ba-4691-95c8-e9c6404db093",
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
  "session_id": "73360dc9-37bf-4d3a-b1a4-9a1376a5ecf6",
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
  "last_heartbeat_at": "2026-10-30T08:45:55.27877Z",
  "last_location_at": "2026-10-30T08:45:55.27877Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/73360dc9-37bf-4d3a-b1a4-9a1376a5ecf6/close` → **200**

```json
{
  "command_id": "3afda47e-207e-4ff0-9a1b-9c694dbee10e",
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
  "session_id": "ececcee5-3984-4a3a-adc9-60bcb8d333c8",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA4NjEsImlhdCI6MTc5MzM0OTk2MSwianRpIjoiOWQ3ZmUwZjMtMTE4Ny00ZWFlLTkxNGEtOWE3MWJmMzkyZTY2Iiwic2lkIjoiZWNlY2NlZTUtMzk4NC00YTNhLWFkYzktNjBiY2I4ZDMzM2M4In0.3KHuV5WzUqJcVgE2BpkTYDUMP0Zj5yk5_vh4Tw93TUM",
  "access_expires_at": "2026-10-30T09:01:01.22568056Z",
  "refresh_token": "aRZssvvS-OKTUMT73PZUwt_w67DGQXxDzkQKfpoSK3g",
  "refresh_expires_at": "2026-10-30T20:46:01.225162989Z",
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
  "command_id": "827f2954-87fb-42ad-af0c-e9d2a792870f",
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
  "changed_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T08:46:01.803951Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "44041252-7c47-4f96-b030-78d2ee41f792",
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
  "correlation_id": "59cd8aae-2908-4f5f-832e-9f283f6d53c5"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "187e11b1-a84e-4d79-b53b-6a626e639922",
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
  "correlation_id": "ef9b8b75-eb77-4130-abf3-ab515a0beb5b"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632940106",
  "device_ref": "sandbox-12538"
}
```

```json
{
  "challenge_id": "95b1ac92-d242-42c4-bb80-c14e4d7f0216",
  "expires_at": "2026-10-30T08:51:02.681496953Z",
  "resend_available_at": "2026-10-30T08:46:03.681496953Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632940106` → **200**

```json
{
  "phone": "+380632940106",
  "audience": "CLIENT",
  "code": "685538",
  "sent_at": "2026-10-30T08:46:02.684057001Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "95b1ac92-d242-42c4-bb80-c14e4d7f0216",
  "code": "685538",
  "device_ref": "sandbox-12538"
}
```

```json
{
  "session_id": "f09d155e-d4bb-44f4-9bc5-422301aee236",
  "subject": {
    "type": "CLIENT",
    "id": "26866d76-3c84-4bcb-bf80-7aaf5086f112"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNjg2NmQ3Ni0zYzg0LTRiY2ItYmY4MC03YWFmNTA4NmYxMTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwODYyLCJpYXQiOjE3OTMzNDk5NjIsImp0aSI6ImJlZDU1ZjNmLTQyMzctNGNkZi05NGQ5LTM5YzRiZDgwOWI4MSIsInNpZCI6ImYwOWQxNTVlLWQ0YmItNDRmNC05YmM1LTQyMjMwMWFlZTIzNiJ9.xe_nKqgBZ6_h2FkqapcIsWRMeeI2DQP3m6k4v-NC-v0",
  "access_expires_at": "2026-10-30T09:01:02.983533326Z",
  "refresh_token": "7KulMvO4DO4knXQhwjTEl_xSG8jbR6ki6jyxoWlaE90",
  "refresh_expires_at": "2026-11-29T08:46:02.983025144Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a4d17758-51cc-4328-b76e-bdcf21fa08fd",
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
  "id": "4f11ba3c-f3dc-4998-a3be-f01d6b9dd850",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:51:03.271846Z",
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
  "command_id": "2d12713b-9bdd-47b2-99c1-ea92e8c14494",
  "quote_id": "4f11ba3c-f3dc-4998-a3be-f01d6b9dd850",
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
  "correlation_id": "ac3f5d89-5a7e-45a9-81d7-bfc251001252"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "aad9bffe-570d-40b6-853b-2993585d1373",
  "quote_id": "4f11ba3c-f3dc-4998-a3be-f01d6b9dd850",
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
  "id": "9fa9e69e-2248-429b-a001-9b3ba769904c",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26866d76-3c84-4bcb-bf80-7aaf5086f112",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:46:03.878011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9fa9e69e-2248-429b-a001-9b3ba769904c/cancel` → **200**

```json
{
  "command_id": "866a9e5e-2a70-43a8-a58e-5b0ae1f4a6c2",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "9fa9e69e-2248-429b-a001-9b3ba769904c",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "26866d76-3c84-4bcb-bf80-7aaf5086f112",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:46:03.878011Z",
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
  "command_id": "af1b60c9-4963-4492-9bee-89d60e612eab",
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
  "changed_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T08:46:04.518951Z"
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
      "changed_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T08:46:04.518951Z"
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
  "device_ref": "sandbox-14070"
}
```

```json
{
  "challenge_id": "8ba6c476-1166-4464-9bc5-15395583aeb2",
  "expires_at": "2026-10-30T08:51:05.40475521Z",
  "resend_available_at": "2026-10-30T08:46:06.40475521Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "744926",
  "sent_at": "2026-10-30T08:46:05.407220035Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8ba6c476-1166-4464-9bc5-15395583aeb2",
  "code": "744926",
  "device_ref": "sandbox-14070"
}
```

```json
{
  "session_id": "881ea144-b8f7-4c6e-ada6-45709a71cbe8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDg2NSwiaWF0IjoxNzkzMzQ5OTY1LCJqdGkiOiI2MmFjYmE0ZS1mOGQ1LTRkMGYtYWExOC0xZTQ5YTFmMzE1ZTgiLCJzaWQiOiI4ODFlYTE0NC1iOGY3LTRjNmUtYWRhNi00NTcwOWE3MWNiZTgifQ.RpXRIUGClfNDsq3h7IaeG_0NqTMqtHGaOXhrKzpo-JM",
  "access_expires_at": "2026-10-30T09:01:05.711807374Z",
  "refresh_token": "kmeet_MrzJHImUZbMoNmuk9Twqyyr1sj4h5YF2HYhM0",
  "refresh_expires_at": "2026-11-29T08:46:05.711269966Z",
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
  "command_id": "1fbce682-e3c9-4717-b466-7fb8624ce44a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:46:06Z",
    "sequence": 1793349966281
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0bfe2b25-1256-46cc-8b58-a4f9fd5274b5",
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
  "last_heartbeat_at": "2026-10-30T08:46:06.299251Z",
  "last_location_at": "2026-10-30T08:46:06.299251Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679195133",
  "device_ref": "sandbox-9795"
}
```

```json
{
  "challenge_id": "9dc7ad5d-f095-43e5-8988-5fcdc8457450",
  "expires_at": "2026-10-30T08:51:06.589845882Z",
  "resend_available_at": "2026-10-30T08:46:07.589845882Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679195133` → **200**

```json
{
  "phone": "+380679195133",
  "audience": "CLIENT",
  "code": "506875",
  "sent_at": "2026-10-30T08:46:06.592467999Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9dc7ad5d-f095-43e5-8988-5fcdc8457450",
  "code": "506875",
  "device_ref": "sandbox-9795"
}
```

```json
{
  "session_id": "33fa4d76-ceed-4303-9ddd-57d31e8350c5",
  "subject": {
    "type": "CLIENT",
    "id": "9ac68111-2166-4c07-be33-ca7976115f65"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YWM2ODExMS0yMTY2LTRjMDctYmUzMy1jYTc5NzYxMTVmNjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwODY2LCJpYXQiOjE3OTMzNDk5NjYsImp0aSI6ImM4NzBhNDhiLWZmZWQtNDdhZS05YjQ0LTNkMTI0YTUyNDllZiIsInNpZCI6IjMzZmE0ZDc2LWNlZWQtNDMwMy05ZGRkLTU3ZDMxZTgzNTBjNSJ9.wPrEyrCLVSW87l8oSRcZOkCxzFAMaTxDwbWOBxZ1bJw",
  "access_expires_at": "2026-10-30T09:01:06.904506839Z",
  "refresh_token": "TsPCAY1Qa969M5m_Vmq2t6J47oSS7MUVP8BYt7yUxfE",
  "refresh_expires_at": "2026-11-29T08:46:06.903891195Z",
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
  "command_id": "c1f30c75-bfbe-4128-888d-838254c528e2",
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
  "id": "c6ad4a3b-c5be-45a7-80e5-3d6c4ba21003",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:51:07.483474Z",
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
  "command_id": "e84d7005-482e-4aac-acbc-28bc9d783394",
  "platform": "ANDROID",
  "token": "sandbox-driver-a748a191-ff44-45c8-8227-3a3eae894bca"
}
```

```json
{
  "id": "862acef1-10dd-4e5f-b866-cd50fc5ce0f5",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T08:46:07.777544Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "720b589a-8b27-4b37-b3b2-4a046021c360",
  "platform": "ANDROID",
  "token": "sandbox-rider-2e7152df-e4a8-4db5-a28e-f02632b86e89"
}
```

```json
{
  "id": "45891fce-4182-4c18-aa9c-26a6c7092bcb",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T08:46:08.073859Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ad75aaeb-0e21-4292-a4c4-90f98ee1e97d",
  "quote_id": "c6ad4a3b-c5be-45a7-80e5-3d6c4ba21003",
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
  "id": "ab9f6e6e-47ac-460d-b258-7b6f650c9e01",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9ac68111-2166-4c07-be33-ca7976115f65",
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
  "created_at": "2026-10-30T08:46:08.366929Z",
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
    "id": "3955c4dc-ead9-43d1-85b5-bc2fbbb68c70",
    "order_id": "ab9f6e6e-47ac-460d-b258-7b6f650c9e01",
    "expires_at": "2026-10-30T08:46:23.370024Z",
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

`POST /api/driver/v1/offers/3955c4dc-ead9-43d1-85b5-bc2fbbb68c70/accept` → **200**

```json
{
  "command_id": "d65f64b7-d9b8-4f59-a9fd-bb861727b93a"
}
```

```json
{
  "id": "bde70a15-9838-4035-8bf6-a834fbb543a5",
  "order_id": "ab9f6e6e-47ac-460d-b258-7b6f650c9e01",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6226225c-6127-4ef4-bfa7-b827b0510498",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T08:46:08.343Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T08:46:08.343Z` → **200**

```json
[
  {
    "at": "2026-10-30T08:46:09.447937422Z",
    "token_suffix": "894bca",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "event_id": "f948b1b3-05c7-48eb-9584-0a85459b09b9",
      "order_version": "2",
      "order_id": "ab9f6e6e-47ac-460d-b258-7b6f650c9e01",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380679195133&after=2026-10-30T08:46:08.343Z` → **200**

```json
[
  {
    "at": "2026-10-30T08:46:09.450160782Z",
    "token_suffix": "b86e89",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "event_id": "188d084a-7e44-4598-8705-91f96ccf63a7",
      "order_version": "3",
      "order_id": "ab9f6e6e-47ac-460d-b258-7b6f650c9e01",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/ab9f6e6e-47ac-460d-b258-7b6f650c9e01/messages` → **201**

```json
{
  "command_id": "c8034611-6f0e-4e52-8f3e-8d90186fe4fd",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "af21732f-084f-4a87-9af2-52222f23ce91",
  "order_id": "ab9f6e6e-47ac-460d-b258-7b6f650c9e01",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T08:46:10.353244475Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6226225c-6127-4ef4-bfa7-b827b0510498",
  "order_id": "ab9f6e6e-47ac-460d-b258-7b6f650c9e01",
  "assignment_id": "bde70a15-9838-4035-8bf6-a834fbb543a5",
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

`POST /api/driver/v1/trips/6226225c-6127-4ef4-bfa7-b827b0510498/messages` → **201**

```json
{
  "command_id": "40e1320a-7a8e-4c6a-b002-3c659c0c7b32",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "1d5efde4-fa02-48f0-ab41-2322969d8218",
  "order_id": "ab9f6e6e-47ac-460d-b258-7b6f650c9e01",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T08:46:10.913177724Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/ab9f6e6e-47ac-460d-b258-7b6f650c9e01/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/6226225c-6127-4ef4-bfa7-b827b0510498/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380679195133"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/0bfe2b25-1256-46cc-8b58-a4f9fd5274b5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:46:11Z",
    "sequence": 1793349971772
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0bfe2b25-1256-46cc-8b58-a4f9fd5274b5",
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
  "last_heartbeat_at": "2026-10-30T08:46:11.790181Z",
  "last_location_at": "2026-10-30T08:46:11.790181Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6226225c-6127-4ef4-bfa7-b827b0510498",
  "order_id": "ab9f6e6e-47ac-460d-b258-7b6f650c9e01",
  "assignment_id": "bde70a15-9838-4035-8bf6-a834fbb543a5",
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

`POST /api/driver/v1/trips/6226225c-6127-4ef4-bfa7-b827b0510498/arrive` → **200**

```json
{
  "command_id": "d32f4410-8fa7-4d3f-9233-eca1e0750487",
  "expected_version": 0
}
```

```json
{
  "id": "6226225c-6127-4ef4-bfa7-b827b0510498",
  "order_id": "ab9f6e6e-47ac-460d-b258-7b6f650c9e01",
  "assignment_id": "bde70a15-9838-4035-8bf6-a834fbb543a5",
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
  "arrived_at": "2026-10-30T08:46:12.353938Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6226225c-6127-4ef4-bfa7-b827b0510498/start` → **200**

```json
{
  "command_id": "36721a40-06d8-4b92-a4d2-65411046bfa8",
  "expected_version": 1
}
```

```json
{
  "id": "6226225c-6127-4ef4-bfa7-b827b0510498",
  "order_id": "ab9f6e6e-47ac-460d-b258-7b6f650c9e01",
  "assignment_id": "bde70a15-9838-4035-8bf6-a834fbb543a5",
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
  "arrived_at": "2026-10-30T08:46:12.353938Z",
  "started_at": "2026-10-30T08:46:12.634271Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/0bfe2b25-1256-46cc-8b58-a4f9fd5274b5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:46:12Z",
    "sequence": 1793349972913
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0bfe2b25-1256-46cc-8b58-a4f9fd5274b5",
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
  "last_heartbeat_at": "2026-10-30T08:46:12.930732Z",
  "last_location_at": "2026-10-30T08:46:12.930732Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/6226225c-6127-4ef4-bfa7-b827b0510498/complete` → **200**

```json
{
  "command_id": "a23762e8-043c-45c8-ac19-a8e4a72646dd",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:46:13Z",
  "cash_received": true
}
```

```json
{
  "id": "6226225c-6127-4ef4-bfa7-b827b0510498",
  "order_id": "ab9f6e6e-47ac-460d-b258-7b6f650c9e01",
  "assignment_id": "bde70a15-9838-4035-8bf6-a834fbb543a5",
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
  "arrived_at": "2026-10-30T08:46:12.353938Z",
  "started_at": "2026-10-30T08:46:12.634271Z",
  "completed_at": "2026-10-30T08:46:13.219719Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/ab9f6e6e-47ac-460d-b258-7b6f650c9e01` → **200**

```json
{
  "id": "ab9f6e6e-47ac-460d-b258-7b6f650c9e01",
  "short_number": 14,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "9ac68111-2166-4c07-be33-ca7976115f65",
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
    "id": "bde70a15-9838-4035-8bf6-a834fbb543a5",
    "order_id": "ab9f6e6e-47ac-460d-b258-7b6f650c9e01",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6226225c-6127-4ef4-bfa7-b827b0510498",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:46:08.366929Z",
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
    "id": "ab9f6e6e-47ac-460d-b258-7b6f650c9e01",
    "short_number": 14,
    "status": "FULFILLED",
    "created_at": "2026-10-30T08:46:08.366929Z",
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
    "id": "6226225c-6127-4ef4-bfa7-b827b0510498",
    "order_id": "ab9f6e6e-47ac-460d-b258-7b6f650c9e01",
    "order_short_number": 14,
    "created_at": "2026-10-30T08:46:08.970646Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "913a83ca-8d48-46d7-ac79-e4c3aba11068",
    "order_id": "8d7f58af-60dc-442c-a390-e423cd7aee7c",
    "order_short_number": 9,
    "created_at": "2026-10-30T08:44:48.109147Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "e294eee8-0c16-4d8c-8895-5a59a29c11ba",
    "order_id": "9a1157a6-6e10-4c0b-8661-5cf790b2ad9d",
    "order_short_number": 4,
    "created_at": "2026-10-30T08:44:02.487002Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "063b1f75-43db-4c98-a958-08d518c12696",
    "order_id": "9fdeae8d-682f-4320-be83-8eadb4ac69f9",
    "order_short_number": 2,
    "created_at": "2026-10-30T08:43:26.116016Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "5c883456-c405-4581-afe5-6c6306ccafd0",
    "order_id": "0daa033d-eb34-417b-900b-e5e5a707f1cf",
    "order_short_number": 1,
    "created_at": "2026-10-30T08:43:16.299948Z",
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

`GET /api/rider/v1/orders/ab9f6e6e-47ac-460d-b258-7b6f650c9e01/tip` → **200**

```json
{
  "order_id": "ab9f6e6e-47ac-460d-b258-7b6f650c9e01",
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
  "available_until": "2026-10-31T08:46:13.219719Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/ab9f6e6e-47ac-460d-b258-7b6f650c9e01/tip` → **201**

```json
{
  "command_id": "29d191e5-d929-440c-b064-33e9b6528ec4",
  "amount_minor": 1100
}
```

```json
{
  "id": "7f5481e4-ad65-4cd0-b1db-beefaa46d86d",
  "order_id": "ab9f6e6e-47ac-460d-b258-7b6f650c9e01",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T08:46:18.2764Z"
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
  "session_id": "1a371bcf-8ec5-4353-9b17-3aff699a346b",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA4NzgsImlhdCI6MTc5MzM0OTk3OCwianRpIjoiMDgzNTA5NGItYjA5MS00NzhlLWI0OTItZDNhM2M0OGQ0NzQ0Iiwic2lkIjoiMWEzNzFiY2YtOGVjNS00MzUzLTliMTctM2FmZjY5OWEzNDZiIn0.3FAA91hWmjfNvibvKquUHho49xdMtFwI-RNx7x6k0S4",
  "access_expires_at": "2026-10-30T09:01:18.857468816Z",
  "refresh_token": "ftR7vfdZCgE1sAIwVr5CWsegDD7weJR30LBoXKlZS0E",
  "refresh_expires_at": "2026-10-30T20:46:18.856868541Z",
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
  "generated_at": "2026-10-30T08:46:19.149904225Z"
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
  "generated_at": "2026-10-30T08:46:19.437336739Z"
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
  "session_id": "a6ec0e38-cf8c-4854-b721-ef853b8a4a02",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA4ODAsImlhdCI6MTc5MzM0OTk4MCwianRpIjoiOGM5NmFlNDctOGUwNS00MGQxLTg5NmItN2FjMzRhMzUwOWNlIiwic2lkIjoiYTZlYzBlMzgtY2Y4Yy00ODU0LWI3MjEtZWY4NTNiOGE0YTAyIn0.SiivW2WFSEiephs0sX33cQ5PsExlpgkbuuK66imc7vM",
  "access_expires_at": "2026-10-30T09:01:20.025670709Z",
  "refresh_token": "t9S7Mh_OxY-D2OqF0ugsaDwN2PRJ4aMXWWLjuxLke40",
  "refresh_expires_at": "2026-10-30T20:46:20.025098758Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ab9f6e6e-47ac-460d-b258-7b6f650c9e01/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:46:08.367371Z",
      "actor": {
        "type": "CLIENT",
        "id": "9ac68111-2166-4c07-be33-ca7976115f65",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ab9f6e6e-47ac-460d-b258-7b6f650c9e01",
        "quote_id": "c6ad4a3b-c5be-45a7-80e5-3d6c4ba21003",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "5e243e57-c7b3-4c0c-801d-07c6597cf021"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:46:08.369278Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ab9f6e6e-47ac-460d-b258-7b6f650c9e01",
        "attempt_id": "cdade8c8-c5a8-48d1-b976-d8aa5cf5872c",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "5e243e57-c7b3-4c0c-801d-07c6597cf021"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:46:08.372071Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3955c4dc-ead9-43d1-85b5-bc2fbbb68c70",
        "order_id": "ab9f6e6e-47ac-460d-b258-7b6f650c9e01",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "5e243e57-c7b3-4c0c-801d-07c6597cf021"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T08:46:08.972725Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "3955c4dc-ead9-43d1-85b5-bc2fbbb68c70",
        "order_id": "ab9f6e6e-47ac-460d-b258-7b6f650c9e01",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "bde70a15-9838-4035-8bf6-a834fbb543a5"
      },
      "correlation_id": "6e34c41c-6d25-4dda-9c62-1dea179171d9"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T08:46:20.615324853Z",
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
      "last_location_at": "2026-10-30T08:46:12.930732Z",
      "order_id": null
    }
  ]
}
```

Done: order ab9f6e6e-47ac-460d-b258-7b6f650c9e01.

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
  "session_id": "4b113334-ab62-4a9e-9b2e-86015ef446bd",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA4ODEsImlhdCI6MTc5MzM0OTk4MSwianRpIjoiZjk0N2M0YTktMjE1MS00YzMzLTk1NzMtMmNlZDRkOGU1YWI1Iiwic2lkIjoiNGIxMTMzMzQtYWI2Mi00YTllLTliMmUtODYwMTVlZjQ0NmJkIn0.ytRXUSFWouOHoUdlJgqAEtm_siDP3Yq4NuHjsPL-Ju4",
  "access_expires_at": "2026-10-30T09:01:21.212980714Z",
  "refresh_token": "Wj1aUuCvUkSuqg_SgXRtqdUzg8fk_k3VPhjp87K01Hg",
  "refresh_expires_at": "2026-10-30T20:46:21.212486458Z",
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
  "command_id": "b50c3a59-6101-4225-9463-0cd4c2f79f49",
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
  "timestamp": "2026-10-30T08:46:22.000+0000",
  "channel": {
    "id": "1730052000.1241324997",
    "linkedid": "1730052000.1241324997",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673600466"
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
  "timestamp": "2026-10-30T08:46:22.000+0000",
  "channel": {
    "id": "1730052000.1241324997",
    "linkedid": "1730052000.1241324997",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673600466"
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
  "session_id": "69c6de45-cdee-4e66-aabf-9d04d0f497bd",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA4ODIsImlhdCI6MTc5MzM0OTk4MiwianRpIjoiMGZmZjE0MTItZTY2Ni00ZjUyLTkyNjgtNmE0M2JlYWYxODdiIiwic2lkIjoiNjljNmRlNDUtY2RlZS00ZTY2LWFhYmYtOWQwNGQwZjQ5N2JkIn0.O7s3r57si0qSOOCe6gLjPHT1W3MhRHVmWTdvMARebTQ",
  "access_expires_at": "2026-10-30T09:01:22.386226229Z",
  "refresh_token": "EX1qvu1ce4SoM3aej2Q-Tvf-opHbUH4rfdAauPmOx_U",
  "refresh_expires_at": "2026-10-30T20:46:22.385606013Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "f7956c09-5268-4335-84ac-99cc8f01031a",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673600466",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T08:46:22Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/f7956c09-5268-4335-84ac-99cc8f01031a/answer` → **200**

```json
{
  "command_id": "0976f0ce-926d-4fa0-bb86-fb4de0c39a97"
}
```

```json
{
  "id": "f7956c09-5268-4335-84ac-99cc8f01031a",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673600466",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
  "order_ids": [],
  "started_at": "2026-10-30T08:46:22Z",
  "answered_at": "2026-10-30T08:46:22.960978Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1241324997",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "e365c59f-ad44-42a8-8698-4a987d4302bd",
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
  "id": "bf62237b-368d-4600-a87d-e87d6fd2cdaa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:51:23.280138Z",
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
  "command_id": "4ac84082-151c-476d-8722-3c202f42d72b",
  "quote_id": "bf62237b-368d-4600-a87d-e87d6fd2cdaa",
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
    "phone": "+380673600466"
  },
  "call_id": "f7956c09-5268-4335-84ac-99cc8f01031a"
}
```

```json
{
  "id": "76215000-8219-490c-bda5-754273342520",
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
  "created_at": "2026-10-30T08:46:23.586955Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673600466"
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
    "id": "1730052000.1241324997",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "f7956c09-5268-4335-84ac-99cc8f01031a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673600466",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
      "order_ids": [
        "76215000-8219-490c-bda5-754273342520"
      ],
      "started_at": "2026-10-30T08:46:22Z",
      "answered_at": "2026-10-30T08:46:22.960978Z",
      "ended_at": "2026-10-30T08:46:23.909896Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "8908afb5-9f39-43a4-8335-9eb8dd052ac0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672261000",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
      "order_ids": [],
      "started_at": "2026-10-30T08:43:53.556982Z",
      "answered_at": "2026-10-30T08:43:53.881222Z",
      "ended_at": "2026-10-30T08:43:54.197082Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:43:58.809764Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/76215000-8219-490c-bda5-754273342520` → **200**

```json
{
  "id": "76215000-8219-490c-bda5-754273342520",
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
  "created_at": "2026-10-30T08:46:23.586955Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673600466"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/76215000-8219-490c-bda5-754273342520` → **200**

```json
{
  "id": "76215000-8219-490c-bda5-754273342520",
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
  "created_at": "2026-10-30T08:46:23.586955Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673600466"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/76215000-8219-490c-bda5-754273342520/cancel` → **200**

```json
{
  "command_id": "6cb220d2-0962-400d-b2e7-c19298227370",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "76215000-8219-490c-bda5-754273342520",
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
  "created_at": "2026-10-30T08:46:23.586955Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673600466"
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

Done: call f7956c09-5268-4335-84ac-99cc8f01031a with order 76215000-8219-490c-bda5-754273342520.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-3705"
}
```

```json
{
  "challenge_id": "91545137-8525-4c03-b776-b369666a360f",
  "expires_at": "2026-10-30T08:51:25.134152656Z",
  "resend_available_at": "2026-10-30T08:46:26.134152656Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "223988",
  "sent_at": "2026-10-30T08:46:25.13657415Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "91545137-8525-4c03-b776-b369666a360f",
  "code": "223988",
  "device_ref": "sandbox-3705"
}
```

```json
{
  "session_id": "505b4928-7ed8-48cc-bd2a-b73149c18560",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDg4NSwiaWF0IjoxNzkzMzQ5OTg1LCJqdGkiOiIyMTk4ZWYwNi0xYjYwLTQ3MzYtYTkzYS03MTI0ZDQ3NDVlYzAiLCJzaWQiOiI1MDViNDkyOC03ZWQ4LTQ4Y2MtYmQyYS1iNzMxNDljMTg1NjAifQ.joYd5FEp1fHiapT2vwrrG-kaUlrkeD70FoqZkGzTbZY",
  "access_expires_at": "2026-10-30T09:01:25.443524567Z",
  "refresh_token": "53FMHRwbCyjGwwpP0Gvon3osMiKQd4fhnJ96hD-TQy0",
  "refresh_expires_at": "2026-11-29T08:46:25.442958575Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0bfe2b25-1256-46cc-8b58-a4f9fd5274b5",
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
  "last_heartbeat_at": "2026-10-30T08:46:12.930732Z",
  "last_location_at": "2026-10-30T08:46:12.930732Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0bfe2b25-1256-46cc-8b58-a4f9fd5274b5/handover` → **200**

```json
{
  "command_id": "230f9b6b-dce5-4b98-89e1-214f459847b3",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0bfe2b25-1256-46cc-8b58-a4f9fd5274b5",
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
  "last_heartbeat_at": "2026-10-30T08:46:12.930732Z",
  "last_location_at": "2026-10-30T08:46:12.930732Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0bfe2b25-1256-46cc-8b58-a4f9fd5274b5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:46:26Z",
    "sequence": 1793349986299
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0bfe2b25-1256-46cc-8b58-a4f9fd5274b5",
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
  "last_heartbeat_at": "2026-10-30T08:46:26.317387Z",
  "last_location_at": "2026-10-30T08:46:26.317387Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662874503",
  "device_ref": "sandbox-10033"
}
```

```json
{
  "challenge_id": "20cf266f-fdc1-416e-8620-e402842c96e5",
  "expires_at": "2026-10-30T08:51:26.603565612Z",
  "resend_available_at": "2026-10-30T08:46:27.603565612Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662874503` → **200**

```json
{
  "phone": "+380662874503",
  "audience": "CLIENT",
  "code": "233480",
  "sent_at": "2026-10-30T08:46:26.606230139Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "20cf266f-fdc1-416e-8620-e402842c96e5",
  "code": "233480",
  "device_ref": "sandbox-10033"
}
```

```json
{
  "session_id": "82ad3ec9-e988-4b39-a771-b78fb5c086a6",
  "subject": {
    "type": "CLIENT",
    "id": "2158dd0a-f5aa-4b2c-bda9-b464cd519fe9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU4ZGQwYS1mNWFhLTRiMmMtYmRhOS1iNDY0Y2Q1MTlmZTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwODg2LCJpYXQiOjE3OTMzNDk5ODYsImp0aSI6IjZhZWM2ODdhLTIxYzMtNDk1Yi1iNmQ4LTI4OGE4NmUzM2JjYSIsInNpZCI6IjgyYWQzZWM5LWU5ODgtNGIzOS1hNzcxLWI3OGZiNWMwODZhNiJ9.TdRpgPed3JZ_yDFoBwmao97-Og1JGvVTi8GyyJWS4Qg",
  "access_expires_at": "2026-10-30T09:01:26.907897843Z",
  "refresh_token": "9OqhAGG13PI7RYpAzY2cHBd2IfsBLn8LLsfPUoTNdIk",
  "refresh_expires_at": "2026-11-29T08:46:26.907400751Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d45bda2e-3217-4282-905e-8237e863ab48",
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
  "id": "47e2d626-82e5-488f-a449-db0cb9ce3aff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:51:27.193385Z",
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
  "command_id": "e07b390a-f8b8-4161-8043-611a4c92a85a",
  "quote_id": "47e2d626-82e5-488f-a449-db0cb9ce3aff",
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
  "id": "ad7b0587-a3b4-4d11-a8f5-8a104b68cf15",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2158dd0a-f5aa-4b2c-bda9-b464cd519fe9",
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
  "created_at": "2026-10-30T08:46:27.485044Z",
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
    "id": "f12f458f-8a64-4a7c-9595-79cc2389fe30",
    "order_id": "ad7b0587-a3b4-4d11-a8f5-8a104b68cf15",
    "expires_at": "2026-10-30T08:46:42.488147Z",
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

`POST /api/driver/v1/offers/f12f458f-8a64-4a7c-9595-79cc2389fe30/accept` → **200**

```json
{
  "command_id": "6fd0d052-5ba8-4038-827a-e96c9b426e96"
}
```

```json
{
  "id": "08899cc0-5a99-4ffe-a5ff-c991c4fd3552",
  "order_id": "ad7b0587-a3b4-4d11-a8f5-8a104b68cf15",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6ddddffb-e3f6-44a8-a6c9-db48962872ce",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6ddddffb-e3f6-44a8-a6c9-db48962872ce",
  "order_id": "ad7b0587-a3b4-4d11-a8f5-8a104b68cf15",
  "assignment_id": "08899cc0-5a99-4ffe-a5ff-c991c4fd3552",
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

`POST /api/driver/v1/work-sessions/0bfe2b25-1256-46cc-8b58-a4f9fd5274b5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:46:28Z",
    "sequence": 1793349988625
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0bfe2b25-1256-46cc-8b58-a4f9fd5274b5",
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
  "last_heartbeat_at": "2026-10-30T08:46:28.642971Z",
  "last_location_at": "2026-10-30T08:46:28.642971Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6ddddffb-e3f6-44a8-a6c9-db48962872ce/arrive` → **200**

```json
{
  "command_id": "f2716b4d-8d85-47d9-84ca-bdbf6017e7ac",
  "expected_version": 0
}
```

```json
{
  "id": "6ddddffb-e3f6-44a8-a6c9-db48962872ce",
  "order_id": "ad7b0587-a3b4-4d11-a8f5-8a104b68cf15",
  "assignment_id": "08899cc0-5a99-4ffe-a5ff-c991c4fd3552",
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
  "arrived_at": "2026-10-30T08:46:28.944748Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6ddddffb-e3f6-44a8-a6c9-db48962872ce/start` → **200**

```json
{
  "command_id": "818d1b85-474a-4803-ad80-bb86f024dfad",
  "expected_version": 1
}
```

```json
{
  "id": "6ddddffb-e3f6-44a8-a6c9-db48962872ce",
  "order_id": "ad7b0587-a3b4-4d11-a8f5-8a104b68cf15",
  "assignment_id": "08899cc0-5a99-4ffe-a5ff-c991c4fd3552",
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
  "arrived_at": "2026-10-30T08:46:28.944748Z",
  "started_at": "2026-10-30T08:46:29.255655Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/0bfe2b25-1256-46cc-8b58-a4f9fd5274b5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:46:29Z",
    "sequence": 1793349989543
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0bfe2b25-1256-46cc-8b58-a4f9fd5274b5",
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
  "last_heartbeat_at": "2026-10-30T08:46:29.56165Z",
  "last_location_at": "2026-10-30T08:46:29.56165Z",
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
  "device_ref": "sandbox-2152"
}
```

```json
{
  "challenge_id": "6295d320-388b-40d1-83b8-49f3404bd913",
  "expires_at": "2026-10-30T08:51:29.836099255Z",
  "resend_available_at": "2026-10-30T08:46:30.836099255Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "288089",
  "sent_at": "2026-10-30T08:46:29.838745563Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6295d320-388b-40d1-83b8-49f3404bd913",
  "code": "288089",
  "device_ref": "sandbox-2152"
}
```

```json
{
  "session_id": "03e46935-0648-440f-9a6a-9d93a116f232",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDg5MCwiaWF0IjoxNzkzMzQ5OTkwLCJqdGkiOiI0ZjFkMGUzNy0zYTQ4LTRkNTAtODliMC03OTA3YzI3Y2RlMjAiLCJzaWQiOiIwM2U0NjkzNS0wNjQ4LTQ0MGYtOWE2YS05ZDkzYTExNmYyMzIifQ.qrWHIiuDYJBduTAs8xz2I0gKbj83a3YfruRmByCsxy4",
  "access_expires_at": "2026-10-30T09:01:30.148030065Z",
  "refresh_token": "9ugQtai153ee_AsKshGAJNtWuJV0FZFVDu2yof_k-Pc",
  "refresh_expires_at": "2026-11-29T08:46:30.147527082Z",
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
  "command_id": "f1eec834-04fb-4d39-a481-300203d034b5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:46:30Z",
    "sequence": 1793349990693
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0507a805-9131-4868-94e6-c17f45306f28",
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
  "last_heartbeat_at": "2026-10-30T08:46:30.710568Z",
  "last_location_at": "2026-10-30T08:46:30.710568Z",
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
  "session_id": "b1636071-7479-4d96-a624-9784544c310b",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA4OTEsImlhdCI6MTc5MzM0OTk5MSwianRpIjoiNzA4Njk1NzUtMjVjMy00Y2Q2LTg4MzAtODgyYjRjN2ZlOThhIiwic2lkIjoiYjE2MzYwNzEtNzQ3OS00ZDk2LWE2MjQtOTc4NDU0NGMzMTBiIn0.SRBfGrQTnVNWXpd11jseqH1Y38fcEgeutTCv4W2M_8M",
  "access_expires_at": "2026-10-30T09:01:31.294161957Z",
  "refresh_token": "YJwWU7oWiB07WL7qFbS-dd2wa1N6ccca0pOQElaJaQ0",
  "refresh_expires_at": "2026-10-30T20:46:31.2936672Z",
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
  "session_id": "4390154f-5a41-4f17-a23a-b593aaee4818",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA4OTEsImlhdCI6MTc5MzM0OTk5MSwianRpIjoiM2UxZGEzZTktOTgxYy00MzJmLTk1MmQtYTkxZDc0ZDRkZDFhIiwic2lkIjoiNDM5MDE1NGYtNWE0MS00ZjE3LWEyM2EtYjU5M2FhZWU0ODE4In0.HOKvlfSZivGm1mS_E7cM-1skR-OF6NLrJkR6IzrZo_s",
  "access_expires_at": "2026-10-30T09:01:31.862465035Z",
  "refresh_token": "1sTiTYIcjK6D0CKpN1sRaKSIgIVBCSKFGBXaFrok_ZI",
  "refresh_expires_at": "2026-10-30T20:46:31.861979514Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ad7b0587-a3b4-4d11-a8f5-8a104b68cf15` → **200**

```json
{
  "id": "ad7b0587-a3b4-4d11-a8f5-8a104b68cf15",
  "short_number": 16,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "2158dd0a-f5aa-4b2c-bda9-b464cd519fe9",
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
    "id": "08899cc0-5a99-4ffe-a5ff-c991c4fd3552",
    "order_id": "ad7b0587-a3b4-4d11-a8f5-8a104b68cf15",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "6ddddffb-e3f6-44a8-a6c9-db48962872ce",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T08:46:27.485044Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ad7b0587-a3b4-4d11-a8f5-8a104b68cf15/interrupt` → **200**

```json
{
  "command_id": "d98858bb-db6b-47c7-b828-3fb40b4fdddc",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "ad7b0587-a3b4-4d11-a8f5-8a104b68cf15",
    "short_number": 16,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "2158dd0a-f5aa-4b2c-bda9-b464cd519fe9",
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
      "id": "08899cc0-5a99-4ffe-a5ff-c991c4fd3552",
      "order_id": "ad7b0587-a3b4-4d11-a8f5-8a104b68cf15",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "6ddddffb-e3f6-44a8-a6c9-db48962872ce",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T08:46:27.485044Z",
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
    "id": "566b075a-369a-46f8-a323-e48da473cfc0",
    "short_number": 17,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "2158dd0a-f5aa-4b2c-bda9-b464cd519fe9",
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
    "id": "e637912c-8bec-4f53-aa2a-64c5a7e7666c",
    "order_id": "566b075a-369a-46f8-a323-e48da473cfc0",
    "expires_at": "2026-10-30T08:46:47.460853Z",
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

`POST /api/driver/v1/offers/e637912c-8bec-4f53-aa2a-64c5a7e7666c/accept` → **200**

```json
{
  "command_id": "c99f10fc-2236-4990-8ecd-022af6190931"
}
```

```json
{
  "id": "d860e93f-12f5-442a-bde7-76cbcfd89482",
  "order_id": "566b075a-369a-46f8-a323-e48da473cfc0",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e756d29a-03a4-4329-91df-e6c8ddfdfb8f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e756d29a-03a4-4329-91df-e6c8ddfdfb8f",
  "order_id": "566b075a-369a-46f8-a323-e48da473cfc0",
  "assignment_id": "d860e93f-12f5-442a-bde7-76cbcfd89482",
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
  "session_id": "0507a805-9131-4868-94e6-c17f45306f28",
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
  "last_heartbeat_at": "2026-10-30T08:46:30.710568Z",
  "last_location_at": "2026-10-30T08:46:30.710568Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/0507a805-9131-4868-94e6-c17f45306f28/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:46:33Z",
    "sequence": 1793349993898
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0507a805-9131-4868-94e6-c17f45306f28",
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
  "last_heartbeat_at": "2026-10-30T08:46:33.916299Z",
  "last_location_at": "2026-10-30T08:46:33.916299Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e756d29a-03a4-4329-91df-e6c8ddfdfb8f/arrive` → **200**

```json
{
  "command_id": "fed3736f-ec63-42e2-9391-487816dda4c4",
  "expected_version": 0
}
```

```json
{
  "id": "e756d29a-03a4-4329-91df-e6c8ddfdfb8f",
  "order_id": "566b075a-369a-46f8-a323-e48da473cfc0",
  "assignment_id": "d860e93f-12f5-442a-bde7-76cbcfd89482",
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
  "arrived_at": "2026-10-30T08:46:34.234296Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e756d29a-03a4-4329-91df-e6c8ddfdfb8f/start` → **200**

```json
{
  "command_id": "c4f385fa-9adb-4077-a546-f8cee2be0a0a",
  "expected_version": 1
}
```

```json
{
  "id": "e756d29a-03a4-4329-91df-e6c8ddfdfb8f",
  "order_id": "566b075a-369a-46f8-a323-e48da473cfc0",
  "assignment_id": "d860e93f-12f5-442a-bde7-76cbcfd89482",
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
  "arrived_at": "2026-10-30T08:46:34.234296Z",
  "started_at": "2026-10-30T08:46:34.533232Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e756d29a-03a4-4329-91df-e6c8ddfdfb8f/complete` → **200**

```json
{
  "command_id": "92637686-1e84-4ecd-8a3c-7d7479dd1ccb",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:46:34Z"
}
```

```json
{
  "id": "e756d29a-03a4-4329-91df-e6c8ddfdfb8f",
  "order_id": "566b075a-369a-46f8-a323-e48da473cfc0",
  "assignment_id": "d860e93f-12f5-442a-bde7-76cbcfd89482",
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
  "arrived_at": "2026-10-30T08:46:34.234296Z",
  "started_at": "2026-10-30T08:46:34.533232Z",
  "completed_at": "2026-10-30T08:46:34.838342Z",
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
    "id": "566b075a-369a-46f8-a323-e48da473cfc0",
    "short_number": 17,
    "status": "FULFILLED",
    "created_at": "2026-10-30T08:46:32.452028Z",
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
    "id": "ad7b0587-a3b4-4d11-a8f5-8a104b68cf15",
    "short_number": 16,
    "status": "CANCELLED",
    "created_at": "2026-10-30T08:46:27.485044Z",
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

`GET /api/operator/v1/orders/ad7b0587-a3b4-4d11-a8f5-8a104b68cf15/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:46:27.485576Z",
      "actor": {
        "type": "CLIENT",
        "id": "2158dd0a-f5aa-4b2c-bda9-b464cd519fe9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ad7b0587-a3b4-4d11-a8f5-8a104b68cf15",
        "quote_id": "47e2d626-82e5-488f-a449-db0cb9ce3aff",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "f0a6b43e-a1cc-4331-8fa7-939e98aeb1ed"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:46:27.487411Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ad7b0587-a3b4-4d11-a8f5-8a104b68cf15",
        "attempt_id": "bf62ed2a-0f3f-4c29-9c37-943befe197fc",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f0a6b43e-a1cc-4331-8fa7-939e98aeb1ed"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:46:27.490212Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f12f458f-8a64-4a7c-9595-79cc2389fe30",
        "order_id": "ad7b0587-a3b4-4d11-a8f5-8a104b68cf15",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "f0a6b43e-a1cc-4331-8fa7-939e98aeb1ed"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T08:46:28.070402Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "f12f458f-8a64-4a7c-9595-79cc2389fe30",
        "order_id": "ad7b0587-a3b4-4d11-a8f5-8a104b68cf15",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "08899cc0-5a99-4ffe-a5ff-c991c4fd3552"
      },
      "correlation_id": "3076253b-b4e9-4cf2-9d08-c257efc83efc"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/566b075a-369a-46f8-a323-e48da473cfc0/tip` → **200**

```json
{
  "order_id": "566b075a-369a-46f8-a323-e48da473cfc0",
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
  "available_until": "2026-10-31T08:46:34.838342Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/566b075a-369a-46f8-a323-e48da473cfc0/tip` → **409**

```json
{
  "command_id": "da4602b3-4868-44ed-a81b-9e64f02b5fb1",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/566b075a-369a-46f8-a323-e48da473cfc0/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "db2e2704-081c-49aa-95d1-b132e38684d9"
}
```

Done: interrupted ad7b0587-a3b4-4d11-a8f5-8a104b68cf15, follow-up 566b075a-369a-46f8-a323-e48da473cfc0.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0bfe2b25-1256-46cc-8b58-a4f9fd5274b5",
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
  "last_heartbeat_at": "2026-10-30T08:46:29.56165Z",
  "last_location_at": "2026-10-30T08:46:29.56165Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0bfe2b25-1256-46cc-8b58-a4f9fd5274b5/close` → **200**

```json
{
  "command_id": "c9ad5fdf-ebd9-48be-96cf-c159a5c100e3",
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
  "session_id": "0507a805-9131-4868-94e6-c17f45306f28",
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
  "last_heartbeat_at": "2026-10-30T08:46:33.916299Z",
  "last_location_at": "2026-10-30T08:46:33.916299Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0507a805-9131-4868-94e6-c17f45306f28/close` → **200**

```json
{
  "command_id": "cf715ef2-38fe-479e-9507-fa57e731fafe",
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
  "session_id": "d810598b-210d-4e32-a6f1-08c00892ef7b",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA5MDEsImlhdCI6MTc5MzM1MDAwMSwianRpIjoiNTA3MzhjZTItZWE1YS00ODcxLTk4NDctNzAzNDgxM2M5Y2UwIiwic2lkIjoiZDgxMDU5OGItMjEwZC00ZTMyLWE2ZjEtMDhjMDA4OTJlZjdiIn0.bDTSSVG7n_8U3uUElAXgS_LwBBL-v8hpQ250xz7pOJs",
  "access_expires_at": "2026-10-30T09:01:41.024044061Z",
  "refresh_token": "V7ZHnb0HhJRf1Dux0DpmLuLoW3nKMfYE4OYYfGMx-J8",
  "refresh_expires_at": "2026-10-30T20:46:41.023386303Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "e948d7ad-398a-4a3d-91e4-9103bab4952e",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:46:41Z"
}
```

```json
{
  "id": "3fd3e081-4173-4dfc-8049-2a3eb186dffb",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:46:41Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/3fd3e081-4173-4dfc-8049-2a3eb186dffb/publish` → **200**

```json
{
  "command_id": "1feb5746-e9fb-41e3-9055-61ed59b058de",
  "expected_version": 0
}
```

```json
{
  "id": "3fd3e081-4173-4dfc-8049-2a3eb186dffb",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:46:41.618647Z",
  "published_at": "2026-10-30T08:46:41.618647Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "3fd3e081-4173-4dfc-8049-2a3eb186dffb",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T08:46:41.618647Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635707538",
  "device_ref": "sandbox-8833"
}
```

```json
{
  "challenge_id": "de5d1ca5-5a20-448b-a36f-56a333be08c6",
  "expires_at": "2026-10-30T08:51:42.190139356Z",
  "resend_available_at": "2026-10-30T08:46:43.190139356Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635707538` → **200**

```json
{
  "phone": "+380635707538",
  "audience": "CLIENT",
  "code": "718713",
  "sent_at": "2026-10-30T08:46:42.193099049Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "de5d1ca5-5a20-448b-a36f-56a333be08c6",
  "code": "718713",
  "device_ref": "sandbox-8833"
}
```

```json
{
  "session_id": "0c4f40d4-619f-4007-bd59-3ac25bfa7d41",
  "subject": {
    "type": "CLIENT",
    "id": "c9cf128a-4b0c-4af1-be47-4ebcaf7d38b5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOWNmMTI4YS00YjBjLTRhZjEtYmU0Ny00ZWJjYWY3ZDM4YjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwOTAyLCJpYXQiOjE3OTMzNTAwMDIsImp0aSI6ImQ4MWRkNjQ4LTIwMDAtNDM5NC04NWVhLTZmNWE3ZWQzMWQxOCIsInNpZCI6IjBjNGY0MGQ0LTYxOWYtNDAwNy1iZDU5LTNhYzI1YmZhN2Q0MSJ9.MIOs_arEsPMO3TJL0sjPpLDhD2k-EzmeyD3qxPF7FcY",
  "access_expires_at": "2026-10-30T09:01:42.502375087Z",
  "refresh_token": "wF1yXq83BcFUdYXAmoFa2V-6X6TtlHrtz7kmhZwZjZY",
  "refresh_expires_at": "2026-11-29T08:46:42.501900066Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "3fd3e081-4173-4dfc-8049-2a3eb186dffb",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T08:46:41.618647Z",
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
  "command_id": "541bf1fb-0b32-48e6-8a82-86d853c6ef6e",
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
  "id": "78fff8a2-9995-491e-a7f5-eb43fb396a07",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:51:43.067523Z",
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
  "command_id": "fb4a8cbb-87c6-4d2a-81b1-ec01a5d1b8d4",
  "quote_id": "78fff8a2-9995-491e-a7f5-eb43fb396a07",
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
  "correlation_id": "9b08e9e9-b4ab-4e29-989a-552a7346c250"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "ad350f54-66aa-459c-ac4c-756b38e32bca",
  "version_id": "3fd3e081-4173-4dfc-8049-2a3eb186dffb",
  "language": "uk"
}
```

```json
{
  "version_id": "3fd3e081-4173-4dfc-8049-2a3eb186dffb",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T08:46:43.654376Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "847ab6f9-f242-4e98-830d-48731d26d794",
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
  "id": "ed9ee3ff-6063-407f-b25e-beedfbae8084",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:51:43.949811Z",
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
  "command_id": "21228a3e-f628-442e-8290-128917e796d6",
  "quote_id": "ed9ee3ff-6063-407f-b25e-beedfbae8084",
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
  "id": "8a2f5c5e-c9ee-457e-9576-ab4b07c45fc4",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c9cf128a-4b0c-4af1-be47-4ebcaf7d38b5",
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
  "created_at": "2026-10-30T08:46:44.246867Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8a2f5c5e-c9ee-457e-9576-ab4b07c45fc4` → **200**

```json
{
  "id": "8a2f5c5e-c9ee-457e-9576-ab4b07c45fc4",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c9cf128a-4b0c-4af1-be47-4ebcaf7d38b5",
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
  "created_at": "2026-10-30T08:46:44.246867Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/8a2f5c5e-c9ee-457e-9576-ab4b07c45fc4/cancel` → **200**

```json
{
  "command_id": "55d8e9c3-1a63-4e8e-8fcd-87779f5fd61b",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "8a2f5c5e-c9ee-457e-9576-ab4b07c45fc4",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c9cf128a-4b0c-4af1-be47-4ebcaf7d38b5",
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
  "created_at": "2026-10-30T08:46:44.246867Z",
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

`POST /api/admin/v1/legal-documents/3fd3e081-4173-4dfc-8049-2a3eb186dffb` → **409**

```json
{
  "command_id": "651d383d-793b-4500-a820-ca2654210f6a",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:46:45Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/3fd3e081-4173-4dfc-8049-2a3eb186dffb",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6aded6aa-8d73-49d0-8dee-c5e927447da2"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "6c2b4284-22f7-4a8c-95e2-f5adbbb72dd6",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T08:46:45Z"
}
```

```json
{
  "id": "a424d032-a888-4f7c-8374-45fc9e4acb3a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T08:46:45Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/a424d032-a888-4f7c-8374-45fc9e4acb3a/publish` → **200**

```json
{
  "command_id": "0f519c1a-6ee4-4546-b2ad-a1c9f4932b10",
  "expected_version": 0
}
```

```json
{
  "id": "a424d032-a888-4f7c-8374-45fc9e4acb3a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T08:46:45.754478Z",
  "published_at": "2026-10-30T08:46:45.754478Z",
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
  "device_ref": "sandbox-23016"
}
```

```json
{
  "challenge_id": "2c6a4c7d-a5b0-4841-aefd-fe39f56c0a05",
  "expires_at": "2026-10-30T08:51:46.045565762Z",
  "resend_available_at": "2026-10-30T08:46:47.045565762Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "698222",
  "sent_at": "2026-10-30T08:46:46.048038253Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2c6a4c7d-a5b0-4841-aefd-fe39f56c0a05",
  "code": "698222",
  "device_ref": "sandbox-23016"
}
```

```json
{
  "session_id": "8489af8c-345f-4f2d-953e-404bc4d34625",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDkwNiwiaWF0IjoxNzkzMzUwMDA2LCJqdGkiOiIyZjFhMzQ3ZS05NTJhLTRkNDktODQ5My0yMDI0ZDg1ODc4MzkiLCJzaWQiOiI4NDg5YWY4Yy0zNDVmLTRmMmQtOTUzZS00MDRiYzRkMzQ2MjUifQ.4nuivZS4ME1rPfEV29zO3XQR5t9IzVqyWXfUqnQlKhE",
  "access_expires_at": "2026-10-30T09:01:46.347082445Z",
  "refresh_token": "Lwj02AqTT2TJqm1EZ90tXQ662noiQlJPyG5aLFjhAfE",
  "refresh_expires_at": "2026-11-29T08:46:46.346605607Z",
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
  "command_id": "a8e26b9c-cc6e-4188-8a5c-7cac47371280",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:46:46Z",
    "sequence": 1793350006901
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "addd7d3a-b82e-47ae-9d99-349f13d9dca9",
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
  "last_heartbeat_at": "2026-10-30T08:46:46.918591Z",
  "last_location_at": "2026-10-30T08:46:46.918591Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672762016",
  "device_ref": "sandbox-25657"
}
```

```json
{
  "challenge_id": "e2fffb1d-a34b-4457-932c-d0ca3c5f530f",
  "expires_at": "2026-10-30T08:51:47.199532077Z",
  "resend_available_at": "2026-10-30T08:46:48.199532077Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672762016` → **200**

```json
{
  "phone": "+380672762016",
  "audience": "CLIENT",
  "code": "701233",
  "sent_at": "2026-10-30T08:46:47.202012801Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e2fffb1d-a34b-4457-932c-d0ca3c5f530f",
  "code": "701233",
  "device_ref": "sandbox-25657"
}
```

```json
{
  "session_id": "84dee8b7-c9f1-48f0-8cee-221a36c8a71d",
  "subject": {
    "type": "CLIENT",
    "id": "618f14e0-8c49-4f42-b2d1-a35c900125ea"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MThmMTRlMC04YzQ5LTRmNDItYjJkMS1hMzVjOTAwMTI1ZWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwOTA3LCJpYXQiOjE3OTMzNTAwMDcsImp0aSI6ImQ1NjdhMzZlLTIwMzYtNDAyOS1hNGIzLWE1NzQ0NTNmMjdjMCIsInNpZCI6Ijg0ZGVlOGI3LWM5ZjEtNDhmMC04Y2VlLTIyMWEzNmM4YTcxZCJ9.tbj5Ju21lHlWcBKDh1i5wKZeovD90EdvMjRNvMgUmZg",
  "access_expires_at": "2026-10-30T09:01:47.50979085Z",
  "refresh_token": "7PzrlPFUu_6-hHxbIlzCgFczv5jMO43DG78AQrVOOm8",
  "refresh_expires_at": "2026-11-29T08:46:47.509151983Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "03b7d0e4-8a38-4336-9333-ed9c060ae8b6",
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
  "id": "0feb5ca4-7b58-43a3-a619-d78eed7cb206",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:51:47.797678Z",
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
  "command_id": "52cede5f-168b-4358-a64e-f5d526b7da04",
  "quote_id": "0feb5ca4-7b58-43a3-a619-d78eed7cb206",
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
    "phone": "+380671909079"
  }
}
```

```json
{
  "id": "ad9cf594-8c1d-4fde-ad6b-d687099c017f",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "618f14e0-8c49-4f42-b2d1-a35c900125ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:46:48.100209Z",
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
    "id": "1dca7793-324f-4f5f-9827-9d1649474ae5",
    "order_id": "ad9cf594-8c1d-4fde-ad6b-d687099c017f",
    "expires_at": "2026-10-30T08:47:03.104055Z",
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

`POST /api/driver/v1/offers/1dca7793-324f-4f5f-9827-9d1649474ae5/accept` → **200**

```json
{
  "command_id": "a0933e62-79b0-4693-ade6-d596a4509455"
}
```

```json
{
  "id": "5abb4369-3917-4f3f-9446-29df89f0eb2f",
  "order_id": "ad9cf594-8c1d-4fde-ad6b-d687099c017f",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "87a0741d-5f54-4fd6-93db-cbc0dd4b883c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "87a0741d-5f54-4fd6-93db-cbc0dd4b883c",
  "order_id": "ad9cf594-8c1d-4fde-ad6b-d687099c017f",
  "assignment_id": "5abb4369-3917-4f3f-9446-29df89f0eb2f",
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
    "phone": "+380671909079"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "413ed30e-e758-4845-8030-96999cc9214a",
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
  "id": "48764f20-d2e2-412e-aaf6-1ed8a8d720ea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:51:49.309234Z",
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
  "command_id": "1c86159f-9310-432b-aa81-7e662c063d0f",
  "quote_id": "48764f20-d2e2-412e-aaf6-1ed8a8d720ea",
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
  "id": "3ddd76a6-7096-44bd-bb27-9397d311f954",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "618f14e0-8c49-4f42-b2d1-a35c900125ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:46:49.607667Z",
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
  "command_id": "35c27544-be7d-4724-a256-c7d3331bc7ce",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T11:46:49Z"
}
```

```json
{
  "id": "20a00997-fb39-4b72-a166-68d473cc13b6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:51:49.924102Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T11:46:49Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a4b03ce6-3aaf-476b-ad60-0530019420e7",
  "quote_id": "20a00997-fb39-4b72-a166-68d473cc13b6",
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
  "pickup_at": "2026-10-30T11:46:49Z"
}
```

```json
{
  "id": "c4549783-1157-4796-a84c-4c55f6c72980",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "618f14e0-8c49-4f42-b2d1-a35c900125ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T08:46:50.223717Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T11:46:49Z",
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
  "command_id": "787ed4ba-4d7e-40ac-b442-45820a7ae7a6",
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
  "id": "939169e5-4e03-40f8-8821-4486e134252c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:51:50.548099Z",
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
  "command_id": "c0d7b314-c386-49f9-a607-4ef1143e6311",
  "quote_id": "939169e5-4e03-40f8-8821-4486e134252c",
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
  "correlation_id": "162f00e5-3393-4bb9-b553-40a649c14805"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "c4549783-1157-4796-a84c-4c55f6c72980",
      "short_number": 21,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "618f14e0-8c49-4f42-b2d1-a35c900125ea",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T08:46:50.223717Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T11:46:49Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "3ddd76a6-7096-44bd-bb27-9397d311f954",
      "short_number": 20,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "618f14e0-8c49-4f42-b2d1-a35c900125ea",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-30T08:46:49.607667Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "ad9cf594-8c1d-4fde-ad6b-d687099c017f",
      "short_number": 19,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "3ddd76a6-7096-44bd-bb27-9397d311f954",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "618f14e0-8c49-4f42-b2d1-a35c900125ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:46:49.607667Z",
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

`GET /api/rider/v1/orders/ad9cf594-8c1d-4fde-ad6b-d687099c017f` → **200**

```json
{
  "id": "ad9cf594-8c1d-4fde-ad6b-d687099c017f",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "618f14e0-8c49-4f42-b2d1-a35c900125ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5abb4369-3917-4f3f-9446-29df89f0eb2f",
    "order_id": "ad9cf594-8c1d-4fde-ad6b-d687099c017f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "87a0741d-5f54-4fd6-93db-cbc0dd4b883c",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T08:46:48.100209Z",
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
    "location_at": "2026-10-30T08:46:46.918591Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/ad9cf594-8c1d-4fde-ad6b-d687099c017f/cancel` → **200**

```json
{
  "command_id": "cd40abce-fb24-40a2-ba9d-50a8980f8165",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ad9cf594-8c1d-4fde-ad6b-d687099c017f",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "618f14e0-8c49-4f42-b2d1-a35c900125ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5abb4369-3917-4f3f-9446-29df89f0eb2f",
    "order_id": "ad9cf594-8c1d-4fde-ad6b-d687099c017f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "87a0741d-5f54-4fd6-93db-cbc0dd4b883c",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T08:46:48.100209Z",
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

`GET /api/rider/v1/orders/3ddd76a6-7096-44bd-bb27-9397d311f954` → **200**

```json
{
  "id": "3ddd76a6-7096-44bd-bb27-9397d311f954",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "618f14e0-8c49-4f42-b2d1-a35c900125ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:46:49.607667Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3ddd76a6-7096-44bd-bb27-9397d311f954/cancel` → **200**

```json
{
  "command_id": "6f72f5ba-2d5a-420b-b069-3393770b4bf8",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3ddd76a6-7096-44bd-bb27-9397d311f954",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "618f14e0-8c49-4f42-b2d1-a35c900125ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:46:49.607667Z",
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

`GET /api/rider/v1/orders/c4549783-1157-4796-a84c-4c55f6c72980` → **200**

```json
{
  "id": "c4549783-1157-4796-a84c-4c55f6c72980",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "618f14e0-8c49-4f42-b2d1-a35c900125ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T08:46:50.223717Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T11:46:49Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c4549783-1157-4796-a84c-4c55f6c72980/cancel` → **200**

```json
{
  "command_id": "acb036d3-9e4e-4c01-8314-a1b09760dfdd",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c4549783-1157-4796-a84c-4c55f6c72980",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "618f14e0-8c49-4f42-b2d1-a35c900125ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T08:46:50.223717Z",
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
  "pickup_at": "2026-10-30T11:46:49Z",
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
  "session_id": "addd7d3a-b82e-47ae-9d99-349f13d9dca9",
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
  "last_heartbeat_at": "2026-10-30T08:46:46.918591Z",
  "last_location_at": "2026-10-30T08:46:46.918591Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/addd7d3a-b82e-47ae-9d99-349f13d9dca9/close` → **200**

```json
{
  "command_id": "e1161ac3-ff1a-401d-b3a3-210646ab7eec",
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

Done: orders ad9cf594-8c1d-4fde-ad6b-d687099c017f, 3ddd76a6-7096-44bd-bb27-9397d311f954, c4549783-1157-4796-a84c-4c55f6c72980.

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
  "session_id": "15b3ebbe-bd33-4408-8a0b-5bc3b3a17fc8",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA5MTQsImlhdCI6MTc5MzM1MDAxNCwianRpIjoiN2M1MGExMjctNTQxNC00YmViLWFlMGEtODFkYzcwYmJjODdkIiwic2lkIjoiMTViM2ViYmUtYmQzMy00NDA4LThhMGItNWJjM2IzYTE3ZmM4In0.Cl98PFYoXmzRyTr4y1z0g2AUQQtHQJ5E7qvKjodxaOs",
  "access_expires_at": "2026-10-30T09:01:54.561062587Z",
  "refresh_token": "zBG2Eso8h2oirUwua3YVV3JEwTW-wMdD6SFk3k1sDc4",
  "refresh_expires_at": "2026-10-30T20:46:54.56012516Z",
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
  "session_id": "97621ed8-6e61-4870-ac72-694fae6262f9",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA5MTUsImlhdCI6MTc5MzM1MDAxNSwianRpIjoiNTZlM2JhYjEtYzkyMS00ZWExLThlZDgtZWM2MTgyNzg3YTZiIiwic2lkIjoiOTc2MjFlZDgtNmU2MS00ODcwLWFjNzItNjk0ZmFlNjI2MmY5In0.n8rS_X6LMVWDN_-m0PAyVB2WZ1dP6lf0PSXaRL0ToQM",
  "access_expires_at": "2026-10-30T09:01:55.133496581Z",
  "refresh_token": "wH-SyBi2V9VdP5B6JtDOM6iy3B-knP2-9r4jDVEfWGI",
  "refresh_expires_at": "2026-10-30T20:46:55.132886317Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-9605"
}
```

```json
{
  "challenge_id": "a82d880c-204c-4162-b715-d3226f42f326",
  "expires_at": "2026-10-30T08:51:55.4239769Z",
  "resend_available_at": "2026-10-30T08:46:56.4239769Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "998023",
  "sent_at": "2026-10-30T08:46:55.426498816Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a82d880c-204c-4162-b715-d3226f42f326",
  "code": "998023",
  "device_ref": "sandbox-9605"
}
```

```json
{
  "session_id": "a226a516-af1d-47f3-b5ea-3b04cc3926bf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDkxNSwiaWF0IjoxNzkzMzUwMDE1LCJqdGkiOiIzMmZkMzFiNS1kYTRmLTRmMzMtODViNi1lZDIyNWUyY2ZiZDgiLCJzaWQiOiJhMjI2YTUxNi1hZjFkLTQ3ZjMtYjVlYS0zYjA0Y2MzOTI2YmYifQ.9HMRvZQraw0vxf9toykx5kfSQHBVBGtrZZ288pJmj-I",
  "access_expires_at": "2026-10-30T09:01:55.743956041Z",
  "refresh_token": "bGs2T6Q9qQBK-BNYU029W6-gAZOBvEwPMUbBrJD5rfs",
  "refresh_expires_at": "2026-11-29T08:46:55.743302627Z",
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
  "command_id": "184ec561-d0b6-4176-a7e0-f89ae856f13f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:46:56Z",
    "sequence": 1793350016300
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3bebc310-a464-41fa-a268-715998707184",
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
  "last_heartbeat_at": "2026-10-30T08:46:56.317711Z",
  "last_location_at": "2026-10-30T08:46:56.317711Z",
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
  "command_id": "b81b39c6-cf41-4d1c-95de-994a21d35062",
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
  "effective_at": "2026-10-30T08:46:56.906987Z",
  "changed_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T08:44:08.226885Z",
  "last_entries": [
    {
      "order_id": "9a1157a6-6e10-4c0b-8661-5cf790b2ad9d",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T08:44:08.226885Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d74a31cd-44eb-48f7-9c2b-802dc91eb99d",
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
  "id": "da4c1f7f-2288-41a7-b52c-bb513d25a7c3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:51:57.490114Z",
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
  "command_id": "b3fe912f-2191-41c7-bb71-75fa8a238530",
  "quote_id": "da4c1f7f-2288-41a7-b52c-bb513d25a7c3",
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
    "phone": "+3806711124337"
  }
}
```

```json
{
  "id": "7224ba74-b3dc-4f99-b6eb-16e654a144c5",
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
  "created_at": "2026-10-30T08:46:57.788987Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711124337"
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
    "id": "8962ff83-5521-4fb0-8cde-31b9bc6f8d07",
    "order_id": "7224ba74-b3dc-4f99-b6eb-16e654a144c5",
    "expires_at": "2026-10-30T08:47:12.793056Z",
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

`POST /api/driver/v1/offers/8962ff83-5521-4fb0-8cde-31b9bc6f8d07/accept` → **200**

```json
{
  "command_id": "d55cbfb2-8784-411e-8063-928a68dcd6d7"
}
```

```json
{
  "id": "744a38fa-a8b3-4032-ac1f-4f67718f502d",
  "order_id": "7224ba74-b3dc-4f99-b6eb-16e654a144c5",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b9b0c985-85ae-41a1-bcc2-6c339efb4a12",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b9b0c985-85ae-41a1-bcc2-6c339efb4a12",
  "order_id": "7224ba74-b3dc-4f99-b6eb-16e654a144c5",
  "assignment_id": "744a38fa-a8b3-4032-ac1f-4f67718f502d",
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
    "phone": "+3806711124337"
  }
}
```

`POST /api/driver/v1/work-sessions/3bebc310-a464-41fa-a268-715998707184/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:46:58Z",
    "sequence": 1793350018939
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3bebc310-a464-41fa-a268-715998707184",
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
  "last_heartbeat_at": "2026-10-30T08:46:58.957138Z",
  "last_location_at": "2026-10-30T08:46:58.957138Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b9b0c985-85ae-41a1-bcc2-6c339efb4a12/arrive` → **200**

```json
{
  "command_id": "38b0817c-f432-41f2-966a-9f122af3bd4a",
  "expected_version": 0
}
```

```json
{
  "id": "b9b0c985-85ae-41a1-bcc2-6c339efb4a12",
  "order_id": "7224ba74-b3dc-4f99-b6eb-16e654a144c5",
  "assignment_id": "744a38fa-a8b3-4032-ac1f-4f67718f502d",
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
  "arrived_at": "2026-10-30T08:46:59.259614Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711124337"
  }
}
```

`POST /api/driver/v1/trips/b9b0c985-85ae-41a1-bcc2-6c339efb4a12/start` → **200**

```json
{
  "command_id": "3011fd24-9246-4134-8baa-469a34717f93",
  "expected_version": 1
}
```

```json
{
  "id": "b9b0c985-85ae-41a1-bcc2-6c339efb4a12",
  "order_id": "7224ba74-b3dc-4f99-b6eb-16e654a144c5",
  "assignment_id": "744a38fa-a8b3-4032-ac1f-4f67718f502d",
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
  "arrived_at": "2026-10-30T08:46:59.259614Z",
  "started_at": "2026-10-30T08:46:59.579579Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711124337"
  }
}
```

`POST /api/driver/v1/trips/b9b0c985-85ae-41a1-bcc2-6c339efb4a12/complete` → **200**

```json
{
  "command_id": "ed2dc766-62e2-4848-a16f-ec98595fe494",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:46:59Z",
  "cash_received": true
}
```

```json
{
  "id": "b9b0c985-85ae-41a1-bcc2-6c339efb4a12",
  "order_id": "7224ba74-b3dc-4f99-b6eb-16e654a144c5",
  "assignment_id": "744a38fa-a8b3-4032-ac1f-4f67718f502d",
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
  "arrived_at": "2026-10-30T08:46:59.259614Z",
  "started_at": "2026-10-30T08:46:59.579579Z",
  "completed_at": "2026-10-30T08:46:59.87374Z",
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
  "command_id": "05069007-4ed9-43f4-bb14-be8f2ed9df35",
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
  "id": "e0239a41-a60b-4fb6-b75c-cbd067815a70",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:52:00.167526Z",
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
  "command_id": "46775b3e-e0e0-4d4e-ba38-e010dd833338",
  "quote_id": "e0239a41-a60b-4fb6-b75c-cbd067815a70",
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
    "phone": "+3806711132486"
  }
}
```

```json
{
  "id": "926fb8ee-2b01-4d5c-a471-ff437f3646eb",
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
  "created_at": "2026-10-30T08:47:00.465524Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711132486"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/926fb8ee-2b01-4d5c-a471-ff437f3646eb` → **200**

```json
{
  "id": "926fb8ee-2b01-4d5c-a471-ff437f3646eb",
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
  "created_at": "2026-10-30T08:47:00.465524Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711132486"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/926fb8ee-2b01-4d5c-a471-ff437f3646eb/cancel` → **200**

```json
{
  "command_id": "70de2506-5e7b-474c-b6bb-68c964db14b3",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "926fb8ee-2b01-4d5c-a471-ff437f3646eb",
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
  "created_at": "2026-10-30T08:47:00.465524Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711132486"
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
  "staff_id": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T08:44:08.226885Z",
  "last_entries": [
    {
      "order_id": "926fb8ee-2b01-4d5c-a471-ff437f3646eb",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T08:47:01.0851Z"
    },
    {
      "order_id": "7224ba74-b3dc-4f99-b6eb-16e654a144c5",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T08:46:59.878334Z"
    },
    {
      "order_id": "9a1157a6-6e10-4c0b-8661-5cf790b2ad9d",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T08:44:08.226885Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3bebc310-a464-41fa-a268-715998707184",
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
  "last_heartbeat_at": "2026-10-30T08:46:58.957138Z",
  "last_location_at": "2026-10-30T08:46:58.957138Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3bebc310-a464-41fa-a268-715998707184/close` → **200**

```json
{
  "command_id": "162edb9b-43cc-46e3-8fa4-1f18d56840a7",
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

Done: operator bonus for fulfilled 7224ba74-b3dc-4f99-b6eb-16e654a144c5 and operator-fault cancellation 926fb8ee-2b01-4d5c-a471-ff437f3646eb.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672394669",
  "device_ref": "sandbox-6837"
}
```

```json
{
  "challenge_id": "2c489cde-9e10-4d97-82e2-e476988f9343",
  "expires_at": "2026-10-30T08:52:05.484765697Z",
  "resend_available_at": "2026-10-30T08:47:06.484765697Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672394669` → **200**

```json
{
  "phone": "+380672394669",
  "audience": "CLIENT",
  "code": "198062",
  "sent_at": "2026-10-30T08:47:05.487471947Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672520323",
  "device_ref": "sandbox-15782",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "535066d9-3b7c-4d58-b604-08d6eab3d8d7",
  "expires_at": "2026-10-30T08:52:06.992102527Z",
  "resend_available_at": "2026-10-30T08:47:07.992102527Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672520323` → **200**

```json
{
  "phone": "+380672520323",
  "audience": "CLIENT",
  "code": "342932",
  "sent_at": "2026-10-30T08:47:06.9942881Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672520323",
  "device_ref": "sandbox-30669",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "45790a82-c232-48b3-b587-b71285f032c3",
  "expires_at": "2026-10-30T08:52:08.504644716Z",
  "resend_available_at": "2026-10-30T08:47:09.504644716Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380672520323` → **200**

```json
{
  "phone": "+380672520323",
  "audience": "CLIENT",
  "code": "909389",
  "sent_at": "2026-10-30T08:47:08.507241945Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671030000",
  "device_ref": "sandbox-10159"
}
```

```json
{
  "challenge_id": "61d5cc3c-1fa8-473e-a291-0b4858598a2b",
  "expires_at": "2026-10-30T08:52:10.012108353Z",
  "resend_available_at": "2026-10-30T08:47:11.012108353Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671030000",
  "device_ref": "sandbox-2388"
}
```

```json
{
  "challenge_id": "48c03e7e-4276-4c5e-9e5d-e0aede040f6b",
  "expires_at": "2026-10-30T08:52:11.50678302Z",
  "resend_available_at": "2026-10-30T08:47:12.50678302Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380671030000` → **200**

```json
{
  "phone": "+380671030000",
  "audience": "CLIENT",
  "code": "157866",
  "sent_at": "2026-10-30T08:47:11.509705233Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671030000",
  "device_ref": "sandbox-866",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "3fa9de90-a715-48b5-a5af-c9c21c13a67b",
  "expires_at": "2026-10-30T08:52:13.025749737Z",
  "resend_available_at": "2026-10-30T08:47:14.025749737Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380671030000` → **200**

```json
{
  "phone": "+380671030000",
  "audience": "CLIENT",
  "code": "038653",
  "sent_at": "2026-10-30T08:47:13.028329501Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380671030000",
  "device_ref": "sandbox-24126",
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
  "correlation_id": "8442a156-1722-4696-8f47-cd60ce852e35",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000009159"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "182e3728-0916-4c8c-86c8-ad04f781c958"
}
```

`GET /sandbox/v1/otp?phone=%2B442000009159` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120013374"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "f0e3289b-6627-45bc-9cf2-ddd086c36470"
}
```

`GET /sandbox/v1/otp?phone=%2B37120013374` → **404**

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
  "session_id": "ae7d28de-9436-4951-b63e-f30ab54e0587",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA5MzUsImlhdCI6MTc5MzM1MDAzNSwianRpIjoiNWEzNDI2ZTgtZmRhMi00ZTE5LTg4MzQtMDQzZDk5ZGU5ODY4Iiwic2lkIjoiYWU3ZDI4ZGUtOTQzNi00OTUxLWI2M2UtZjMwYWI1NGUwNTg3In0.65KmyaYpgBS8cWP-4nq5tkBpMmC58oo7FUPL1NpuMHk",
  "access_expires_at": "2026-10-30T09:02:15.764278839Z",
  "refresh_token": "8FTrPOPMLWYKhGdjlcO3WkOCKyCLErGL-jG1dN6I2VM",
  "refresh_expires_at": "2026-10-30T20:47:15.76364414Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380671030000` → **200**

```json
{
  "deliveries": [
    {
      "id": "061fa3fe-3879-43dd-95fe-7981a5dbfa11",
      "challenge_id": "3fa9de90-a715-48b5-a5af-c9c21c13a67b",
      "phone": "+380671030000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-100d1162-58e5-4b31-9cdc-fee5124827d3",
      "error": null,
      "attempted_at": "2026-10-30T08:47:13.02888Z"
    },
    {
      "id": "0932a810-306d-40ab-ac76-b8b26864760b",
      "challenge_id": "48c03e7e-4276-4c5e-9e5d-e0aede040f6b",
      "phone": "+380671030000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-99865dd5-a5ae-4bce-88ee-fccddf62a4e4",
      "error": null,
      "attempted_at": "2026-10-30T08:47:11.509959Z"
    },
    {
      "id": "2a3d9923-e1c1-49ef-8915-ff4d0714f34a",
      "challenge_id": "61d5cc3c-1fa8-473e-a291-0b4858598a2b",
      "phone": "+380671030000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T08:47:10.014698Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380671030000` → **200**

```json
{
  "phone": "+380671030000",
  "audience": "CLIENT",
  "code": "038653",
  "sent_at": "2026-10-30T08:47:13.028329501Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380672520323` → **200**

```json
{
  "deliveries": [
    {
      "id": "2218ecc3-ab63-47df-8d38-ce2378835414",
      "challenge_id": "45790a82-c232-48b3-b587-b71285f032c3",
      "phone": "+380672520323",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-8f7aa580-678e-4e35-8efd-95ebfa6d751d",
      "error": null,
      "attempted_at": "2026-10-30T08:47:08.507769Z"
    },
    {
      "id": "466e2e8e-65cd-4f43-8c92-9b6cdb0e5914",
      "challenge_id": "535066d9-3b7c-4d58-b604-08d6eab3d8d7",
      "phone": "+380672520323",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-534626e1-6710-48d8-8288-e01d26a3210f",
      "error": null,
      "attempted_at": "2026-10-30T08:47:06.99476Z"
    }
  ]
}
```

Done: SMS to +380672394669; SMS then a call to +380672520323; a failed SMS, two calls and a refused third to +380671030000; +44 and +371 refused.

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
  "session_id": "ad964043-2a20-4886-8e08-f734539e93e3",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA5MzYsImlhdCI6MTc5MzM1MDAzNiwianRpIjoiNzk5MzBmNWQtNzA5ZS00OWVkLTg5NGItNWY1ZWI0MTI4MzM5Iiwic2lkIjoiYWQ5NjQwNDMtMmEyMC00ODg2LThlMDgtZjczNDUzOWU5M2UzIn0.ErtMLxfVnx7MPowXfYQcoBkJu7tsXC28DtGZjkUHkHs",
  "access_expires_at": "2026-10-30T09:02:16.9481568Z",
  "refresh_token": "7Hq1hfb8U1nOFVtyk9rP_q-CcstjZlKbnZl73Lb6g5I",
  "refresh_expires_at": "2026-10-30T20:47:16.94759101Z",
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
  "session_id": "3ddfcbbd-6de8-416e-9dbc-5f93aac3a72c",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA5MzcsImlhdCI6MTc5MzM1MDAzNywianRpIjoiN2YzNDFjMzItZDNlMy00ODFlLTk3YmEtZjNiYTE1ODc2MDQ3Iiwic2lkIjoiM2RkZmNiYmQtNmRlOC00MTZlLTlkYmMtNWY5M2FhYzNhNzJjIn0.NAHVkI0OLA1TSEButEb1XBpHgBuxle9ncy1lyEQ6d0o",
  "access_expires_at": "2026-10-30T09:02:17.523589451Z",
  "refresh_token": "bSLH7MmZrqEq3BfhnbDi08ewC08Q29_mZFy2ZK7kpKI",
  "refresh_expires_at": "2026-10-30T20:47:17.522991281Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
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

`POST /api/admin/v1/staff-extensions/5d6c2743-93ae-43b8-b1f1-13f213963e73` → **200**

```json
{
  "command_id": "4e977eb6-116a-4dce-8fb4-8704f90bd67c",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "ba8da447-3847-454e-8573-38fb0561cf6c",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T08:47:18.658674Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T08:47:18.658674Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "bb0388cf-72a2-47a6-8d78-15c21223d793",
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
  "id": "dd3e5a11-d1a2-4b15-abbf-1f9f1af80164",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:52:19.225864Z",
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
  "command_id": "3b02ee6e-3271-4f70-bf33-2e3cb719aadb",
  "quote_id": "dd3e5a11-d1a2-4b15-abbf-1f9f1af80164",
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
    "phone": "+380671067136"
  }
}
```

```json
{
  "id": "aad8b9af-b03f-4444-a9c8-4f19f39581ad",
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
  "created_at": "2026-10-30T08:47:19.520028Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671067136"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/aad8b9af-b03f-4444-a9c8-4f19f39581ad/calls` → **201**

```json
{
  "command_id": "a596c003-c9d7-4baa-9114-d5f461fbdb79",
  "to": "CALLER"
}
```

```json
{
  "id": "57ffa343-7c95-4464-8cc4-ec9bec5982b3",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
  "order_ids": [
    "aad8b9af-b03f-4444-a9c8-4f19f39581ad"
  ],
  "started_at": "2026-10-30T08:47:19.871279Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/aad8b9af-b03f-4444-a9c8-4f19f39581ad/calls` → **201**

```json
{
  "command_id": "a596c003-c9d7-4baa-9114-d5f461fbdb79",
  "to": "CALLER"
}
```

```json
{
  "id": "57ffa343-7c95-4464-8cc4-ec9bec5982b3",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
  "order_ids": [
    "aad8b9af-b03f-4444-a9c8-4f19f39581ad"
  ],
  "started_at": "2026-10-30T08:47:19.871279Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "57ffa343-7c95-4464-8cc4-ec9bec5982b3",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380671067136",
    "at": "2026-10-30T08:47:19.873576139Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "57ffa343-7c95-4464-8cc4-ec9bec5982b3",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.16609",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "57ffa343-7c95-4464-8cc4-ec9bec5982b3"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "57ffa343-7c95-4464-8cc4-ec9bec5982b3",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=aad8b9af-b03f-4444-a9c8-4f19f39581ad` → **200**

```json
{
  "calls": [
    {
      "id": "57ffa343-7c95-4464-8cc4-ec9bec5982b3",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
      "order_ids": [
        "aad8b9af-b03f-4444-a9c8-4f19f39581ad"
      ],
      "started_at": "2026-10-30T08:47:19.871279Z",
      "answered_at": "2026-10-30T08:47:20.531883Z",
      "ended_at": "2026-10-30T08:47:20.552289Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=aad8b9af-b03f-4444-a9c8-4f19f39581ad` → **200**

```json
{
  "calls": [
    {
      "id": "57ffa343-7c95-4464-8cc4-ec9bec5982b3",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
      "order_ids": [
        "aad8b9af-b03f-4444-a9c8-4f19f39581ad"
      ],
      "started_at": "2026-10-30T08:47:19.871279Z",
      "answered_at": "2026-10-30T08:47:20.531883Z",
      "ended_at": "2026-10-30T08:47:20.552289Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=aad8b9af-b03f-4444-a9c8-4f19f39581ad` → **200**

```json
{
  "calls": [
    {
      "id": "57ffa343-7c95-4464-8cc4-ec9bec5982b3",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
      "order_ids": [
        "aad8b9af-b03f-4444-a9c8-4f19f39581ad"
      ],
      "started_at": "2026-10-30T08:47:19.871279Z",
      "answered_at": "2026-10-30T08:47:20.531883Z",
      "ended_at": "2026-10-30T08:47:20.552289Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=aad8b9af-b03f-4444-a9c8-4f19f39581ad` → **200**

```json
{
  "calls": [
    {
      "id": "57ffa343-7c95-4464-8cc4-ec9bec5982b3",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
      "order_ids": [
        "aad8b9af-b03f-4444-a9c8-4f19f39581ad"
      ],
      "started_at": "2026-10-30T08:47:19.871279Z",
      "answered_at": "2026-10-30T08:47:20.531883Z",
      "ended_at": "2026-10-30T08:47:20.552289Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=aad8b9af-b03f-4444-a9c8-4f19f39581ad` → **200**

```json
{
  "calls": [
    {
      "id": "57ffa343-7c95-4464-8cc4-ec9bec5982b3",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
      "order_ids": [
        "aad8b9af-b03f-4444-a9c8-4f19f39581ad"
      ],
      "started_at": "2026-10-30T08:47:19.871279Z",
      "answered_at": "2026-10-30T08:47:20.531883Z",
      "ended_at": "2026-10-30T08:47:20.552289Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:47:28.867458Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/aad8b9af-b03f-4444-a9c8-4f19f39581ad` → **200**

```json
{
  "id": "aad8b9af-b03f-4444-a9c8-4f19f39581ad",
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
  "created_at": "2026-10-30T08:47:19.520028Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671067136"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/aad8b9af-b03f-4444-a9c8-4f19f39581ad/cancel` → **200**

```json
{
  "command_id": "64665c62-8324-4377-ac02-c01fd49f1eac",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "aad8b9af-b03f-4444-a9c8-4f19f39581ad",
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
  "created_at": "2026-10-30T08:47:19.520028Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671067136"
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
  "command_id": "8098c4de-0960-418c-b43f-922e04701260",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T08:47:30.662067Z",
  "extension": "101"
}
```

Done: outgoing call 57ffa343-7c95-4464-8cc4-ec9bec5982b3 from order aad8b9af-b03f-4444-a9c8-4f19f39581ad, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634662232",
  "device_ref": "sandbox-15357"
}
```

```json
{
  "challenge_id": "01f5329e-b512-473f-80b6-263d7324feee",
  "expires_at": "2026-10-30T08:52:30.955449418Z",
  "resend_available_at": "2026-10-30T08:47:31.955449418Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634662232` → **200**

```json
{
  "phone": "+380634662232",
  "audience": "CLIENT",
  "code": "137784",
  "sent_at": "2026-10-30T08:47:30.95798782Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "01f5329e-b512-473f-80b6-263d7324feee",
  "code": "137784",
  "device_ref": "sandbox-15357"
}
```

```json
{
  "session_id": "cad39885-d519-4957-b1b9-85a37b9e0b03",
  "subject": {
    "type": "CLIENT",
    "id": "831fca5a-df60-4c05-bd32-f42e0b7c04d6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MzFmY2E1YS1kZjYwLTRjMDUtYmQzMi1mNDJlMGI3YzA0ZDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwOTUxLCJpYXQiOjE3OTMzNTAwNTEsImp0aSI6ImQ2MGZmOWNmLWNlNjMtNDg0YS1iMjBmLTBhMjkxYzRiYTRhYiIsInNpZCI6ImNhZDM5ODg1LWQ1MTktNDk1Ny1iMWI5LTg1YTM3YjllMGIwMyJ9.F0L0m5V3bBnLaJw5B-bWDC-RXiURXI13YYbdDUPFF0Q",
  "access_expires_at": "2026-10-30T09:02:31.260615886Z",
  "refresh_token": "aB4FRkQRG88cb8eYIU77RrGtz9my5glK0zkuQSI44xY",
  "refresh_expires_at": "2026-11-29T08:47:31.260096057Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "831fca5a-df60-4c05-bd32-f42e0b7c04d6",
  "session_id": "cad39885-d519-4957-b1b9-85a37b9e0b03",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634662232",
  "device_ref": "sandbox-8074"
}
```

```json
{
  "challenge_id": "c3183120-0637-497d-acfa-8b3cd4c4c7b4",
  "expires_at": "2026-10-30T08:52:33.814478279Z",
  "resend_available_at": "2026-10-30T08:47:34.814478279Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634662232` → **200**

```json
{
  "phone": "+380634662232",
  "audience": "CLIENT",
  "code": "680447",
  "sent_at": "2026-10-30T08:47:33.816963255Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c3183120-0637-497d-acfa-8b3cd4c4c7b4",
  "code": "680447",
  "device_ref": "sandbox-8074"
}
```

```json
{
  "session_id": "c25065d3-0ee3-4843-8f92-f2da90e8cd3d",
  "subject": {
    "type": "CLIENT",
    "id": "831fca5a-df60-4c05-bd32-f42e0b7c04d6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MzFmY2E1YS1kZjYwLTRjMDUtYmQzMi1mNDJlMGI3YzA0ZDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwOTU0LCJpYXQiOjE3OTMzNTAwNTQsImp0aSI6IjkyMDBmZTk3LTUzYTQtNDliNS1hZGY0LTQwZjI3OGNlY2E1YSIsInNpZCI6ImMyNTA2NWQzLTBlZTMtNDg0My04ZjkyLWYyZGE5MGU4Y2QzZCJ9.L62Kf9SDhqKClctiNnizmsStLtSxU1D6l7WOHrIVe28",
  "access_expires_at": "2026-10-30T09:02:34.116112572Z",
  "refresh_token": "UFJolARWBj3hhMtGPQyEa80PYG3PJxTokLaOpZig0Pk",
  "refresh_expires_at": "2026-11-29T08:47:34.11562104Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "a048e2ac-4aa8-4986-a2ec-7aa190f05955",
  "expires_at": "2026-10-30T08:52:36.396736645Z",
  "resend_available_at": "2026-10-30T08:47:37.396736645Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634662232` → **200**

```json
{
  "phone": "+380634662232",
  "audience": "CLIENT",
  "code": "190142",
  "sent_at": "2026-10-30T08:47:36.399050151Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380633060306"
}
```

```json
{
  "challenge_id": "8d1e421a-517a-4781-b8ca-fde3e52f2377",
  "expires_at": "2026-10-30T08:52:36.692371773Z",
  "resend_available_at": "2026-10-30T08:47:37.692371773Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633060306` → **200**

```json
{
  "phone": "+380633060306",
  "audience": "CLIENT",
  "code": "570684",
  "sent_at": "2026-10-30T08:47:36.694395774Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "f0a430a3-29dd-4c26-ba79-3ead73dafdb6",
  "current_challenge_id": "a048e2ac-4aa8-4986-a2ec-7aa190f05955",
  "current_code": "000000",
  "new_challenge_id": "8d1e421a-517a-4781-b8ca-fde3e52f2377",
  "new_code": "570684"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "c9d78150-0934-4aaf-91db-1b6483657f4b"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "61186120-2359-45ce-89e9-c8b178583cc9",
  "current_challenge_id": "a048e2ac-4aa8-4986-a2ec-7aa190f05955",
  "current_code": "190142",
  "new_challenge_id": "8d1e421a-517a-4781-b8ca-fde3e52f2377",
  "new_code": "570684"
}
```

```json
{
  "subject_id": "831fca5a-df60-4c05-bd32-f42e0b7c04d6",
  "phone": "+380633060306",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "831fca5a-df60-4c05-bd32-f42e0b7c04d6",
  "session_id": "cad39885-d519-4957-b1b9-85a37b9e0b03",
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
  "correlation_id": "920c20cf-9da2-460d-8ef8-1155b0524e62"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633060306",
  "device_ref": "sandbox-21281"
}
```

```json
{
  "challenge_id": "f9309b3c-d105-4c55-b507-0b9b872dab94",
  "expires_at": "2026-10-30T08:52:40.134271004Z",
  "resend_available_at": "2026-10-30T08:47:41.134271004Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633060306` → **200**

```json
{
  "phone": "+380633060306",
  "audience": "CLIENT",
  "code": "336130",
  "sent_at": "2026-10-30T08:47:40.136964316Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f9309b3c-d105-4c55-b507-0b9b872dab94",
  "code": "336130",
  "device_ref": "sandbox-21281"
}
```

```json
{
  "session_id": "8ccbc3af-9e29-4c9a-8fb0-430f1ca8d95e",
  "subject": {
    "type": "CLIENT",
    "id": "831fca5a-df60-4c05-bd32-f42e0b7c04d6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MzFmY2E1YS1kZjYwLTRjMDUtYmQzMi1mNDJlMGI3YzA0ZDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwOTYwLCJpYXQiOjE3OTMzNTAwNjAsImp0aSI6ImMzNTY2YTczLTg3ZDAtNDIwZC1hZjI4LWExYjVlODc4Mjc4MyIsInNpZCI6IjhjY2JjM2FmLTllMjktNGM5YS04ZmIwLTQzMGYxY2E4ZDk1ZSJ9.Hrc9jOS-RxvgYyg5G6CpFOWVXTVFnozAtMWifXUW6jA",
  "access_expires_at": "2026-10-30T09:02:40.442440697Z",
  "refresh_token": "YGZhhQ2k_un0TY0U6Jc0tdHKhaS-mwYoOUeNicdmqn4",
  "refresh_expires_at": "2026-11-29T08:47:40.44186403Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "831fca5a-df60-4c05-bd32-f42e0b7c04d6",
  "session_id": "8ccbc3af-9e29-4c9a-8fb0-430f1ca8d95e",
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
  "session_id": "a4b32803-c02c-4b6c-bbc1-11f5ffd100a7",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA5NjEsImlhdCI6MTc5MzM1MDA2MSwianRpIjoiZDg5ZTJlNjUtMTJlMy00MjEwLWE3MTAtMDkxYTE5YmQ3YjU4Iiwic2lkIjoiYTRiMzI4MDMtYzAyYy00YjZjLWJiYzEtMTFmNWZmZDEwMGE3In0.6T3HVUqP1CkvAqrnEx4wDri2NHpooGfYIdDmWUsxJA8",
  "access_expires_at": "2026-10-30T09:02:41.293019186Z",
  "refresh_token": "GJCIM7AnxiDdqckjmd3V1VZQsHxT9nHNSkevKHmPvbU",
  "refresh_expires_at": "2026-10-30T20:47:41.292529869Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/831fca5a-df60-4c05-bd32-f42e0b7c04d6` → **200**

```json
{
  "client": {
    "id": "831fca5a-df60-4c05-bd32-f42e0b7c04d6",
    "phone": "+380633060306",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:47:31.258591Z",
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

`POST /api/admin/v1/clients/831fca5a-df60-4c05-bd32-f42e0b7c04d6/phone/new-code` → **201**

```json
{
  "phone": "+380636875265"
}
```

```json
{
  "challenge_id": "cf2f0659-8080-4518-b55b-4f36aeda544e",
  "expires_at": "2026-10-30T08:52:41.894826254Z",
  "resend_available_at": "2026-10-30T08:47:42.894826254Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636875265` → **200**

```json
{
  "phone": "+380636875265",
  "audience": "CLIENT",
  "code": "883423",
  "sent_at": "2026-10-30T08:47:41.89730998Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/831fca5a-df60-4c05-bd32-f42e0b7c04d6/phone` → **422**

```json
{
  "command_id": "91ac05cf-4c73-4289-8ecf-0ef26b8fc46f",
  "expected_version": 3,
  "new_challenge_id": "cf2f0659-8080-4518-b55b-4f36aeda544e",
  "new_code": "883424",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/831fca5a-df60-4c05-bd32-f42e0b7c04d6/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "94199a2c-8010-4a61-b7b4-906ed6d06b34"
}
```

`POST /api/admin/v1/clients/831fca5a-df60-4c05-bd32-f42e0b7c04d6/phone` → **400**

```json
{
  "command_id": "df0b016b-56cb-4bb2-96fc-72706e93d5eb",
  "expected_version": 3,
  "new_challenge_id": "cf2f0659-8080-4518-b55b-4f36aeda544e",
  "new_code": "883423",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/831fca5a-df60-4c05-bd32-f42e0b7c04d6/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "d3208dc9-9261-4d96-97b3-be4d74067f9a",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/831fca5a-df60-4c05-bd32-f42e0b7c04d6/phone` → **200**

```json
{
  "command_id": "fbb1c4f4-84b1-4a19-8b9f-72ac79b7b7a1",
  "expected_version": 3,
  "new_challenge_id": "cf2f0659-8080-4518-b55b-4f36aeda544e",
  "new_code": "883423",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "831fca5a-df60-4c05-bd32-f42e0b7c04d6",
  "phone": "+380636875265",
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
  "correlation_id": "6da6aa2b-9122-4d28-aee1-7ec87a40fb37"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636875265",
  "device_ref": "sandbox-26421"
}
```

```json
{
  "challenge_id": "17ed9d91-4940-4a01-8592-56c614eb5052",
  "expires_at": "2026-10-30T08:52:43.356072219Z",
  "resend_available_at": "2026-10-30T08:47:44.356072219Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636875265` → **200**

```json
{
  "phone": "+380636875265",
  "audience": "CLIENT",
  "code": "812358",
  "sent_at": "2026-10-30T08:47:43.358561222Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "17ed9d91-4940-4a01-8592-56c614eb5052",
  "code": "812358",
  "device_ref": "sandbox-26421"
}
```

```json
{
  "session_id": "5d4b0726-6871-4ef2-8964-7fda1f3c98d1",
  "subject": {
    "type": "CLIENT",
    "id": "831fca5a-df60-4c05-bd32-f42e0b7c04d6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MzFmY2E1YS1kZjYwLTRjMDUtYmQzMi1mNDJlMGI3YzA0ZDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwOTYzLCJpYXQiOjE3OTMzNTAwNjMsImp0aSI6ImVlZTkyNjY3LTJlNWUtNGY3Zi05ODI2LTAxNDIwYTVmY2U5MyIsInNpZCI6IjVkNGIwNzI2LTY4NzEtNGVmMi04OTY0LTdmZGExZjNjOThkMSJ9.eKjImzXwfUIW_3FYDW820M1ov9CGYyzO2oBi8ZHuIiE",
  "access_expires_at": "2026-10-30T09:02:43.655021709Z",
  "refresh_token": "nqZpAKH3OblLN5CCmzR8K1fMTm2Os8SM5ZqwCGgXpf0",
  "refresh_expires_at": "2026-11-29T08:47:43.65448341Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "831fca5a-df60-4c05-bd32-f42e0b7c04d6",
  "session_id": "5d4b0726-6871-4ef2-8964-7fda1f3c98d1",
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
  "phone": "+380630789676",
  "device_ref": "sandbox-6044"
}
```

```json
{
  "challenge_id": "c3811f55-060f-45aa-beee-26e712ceae1c",
  "expires_at": "2026-10-30T08:52:44.217333966Z",
  "resend_available_at": "2026-10-30T08:47:45.217333966Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630789676` → **200**

```json
{
  "phone": "+380630789676",
  "audience": "CLIENT",
  "code": "636245",
  "sent_at": "2026-10-30T08:47:44.220184722Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c3811f55-060f-45aa-beee-26e712ceae1c",
  "code": "636245",
  "device_ref": "sandbox-6044"
}
```

```json
{
  "session_id": "39879610-ed50-41f1-b374-271162092529",
  "subject": {
    "type": "CLIENT",
    "id": "23d8fd33-95b8-45d5-9413-448167d6e8e0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2Q4ZmQzMy05NWI4LTQ1ZDUtOTQxMy00NDgxNjdkNmU4ZTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwOTY0LCJpYXQiOjE3OTMzNTAwNjQsImp0aSI6IjA4NDVlNjNkLThiZGQtNDkzYS1iZTVlLWJkNzIyYTIwMjM4OCIsInNpZCI6IjM5ODc5NjEwLWVkNTAtNDFmMS1iMzc0LTI3MTE2MjA5MjUyOSJ9._xAqQXbjFhcR7atiS7KOcyAlP6YFL7rkGWCaDKVGGU4",
  "access_expires_at": "2026-10-30T09:02:44.521821992Z",
  "refresh_token": "9NXitbALUg13Qa689yoLbq3xHhzXIt_YchXgG67LQp8",
  "refresh_expires_at": "2026-11-29T08:47:44.521291698Z",
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
  "session_id": "a8ee7b4a-29ac-4aee-90d9-ae0e5d106e9e",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA5NjUsImlhdCI6MTc5MzM1MDA2NSwianRpIjoiNmEzZDZjNGQtMmQzYy00YjI1LWJiZGMtMGFhOTU0MzdmZTI5Iiwic2lkIjoiYThlZTdiNGEtMjlhYy00YWVlLTkwZDktYWUwZTVkMTA2ZTllIn0._pUbWzljLrQg0n3uW-x7vi-vKKTBMFwcusJzEA-5ohA",
  "access_expires_at": "2026-10-30T09:02:45.711110756Z",
  "refresh_token": "PJ5wf6jcBqAndgQNFDtwR5un_myDKNhmHMgDkxvWeL0",
  "refresh_expires_at": "2026-10-30T20:47:45.710588818Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380630789676` → **200**

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
  "correlation_id": "fab51766-f247-43e7-9466-c911795db689"
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
  "session_id": "6565fb87-1585-42ab-a9b4-1d05764e09ed",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA5NjYsImlhdCI6MTc5MzM1MDA2NiwianRpIjoiNGMwMWFkMTEtYmM4Yy00ZWIwLWE0MDAtYTEyZDhiMWI3NjVmIiwic2lkIjoiNjU2NWZiODctMTU4NS00MmFiLWE5YjQtMWQwNTc2NGUwOWVkIn0.kIAbEQt1FuWfmameDlWo1lzEaqexvC_QKx0ATtVphpE",
  "access_expires_at": "2026-10-30T09:02:46.871063916Z",
  "refresh_token": "uQYhJ3FvrDiI3HEV7LK8vWWZgEg2lAWt9fJoYErJc90",
  "refresh_expires_at": "2026-10-30T20:47:46.870582865Z",
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
  "changed_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T08:43:20.631843Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "f681f2f6-5016-4af5-ae38-e552bdaa18d3",
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
  "changed_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T08:47:47.446361657Z"
}
```

## The rider books the airport for 2026-10-30T11:47:46Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600226386",
  "device_ref": "sandbox-3691"
}
```

```json
{
  "challenge_id": "df87b112-3850-4d53-b36a-c61ad089cad6",
  "expires_at": "2026-10-30T08:52:47.742270717Z",
  "resend_available_at": "2026-10-30T08:47:48.742270717Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600226386` → **200**

```json
{
  "phone": "+48600226386",
  "audience": "CLIENT",
  "code": "700533",
  "sent_at": "2026-10-30T08:47:47.744959764Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "df87b112-3850-4d53-b36a-c61ad089cad6",
  "code": "700533",
  "device_ref": "sandbox-3691"
}
```

```json
{
  "session_id": "4909fa43-2499-4965-896f-e42230f449d0",
  "subject": {
    "type": "CLIENT",
    "id": "07816008-0f77-4e5f-b06d-1b1a2a0054cd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNzgxNjAwOC0wZjc3LTRlNWYtYjA2ZC0xYjFhMmEwMDU0Y2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwOTY4LCJpYXQiOjE3OTMzNTAwNjgsImp0aSI6ImJhYWRlMGU1LWZjNjYtNDA1ZC1iNGFiLTE3YmU0MWRkNzE5OSIsInNpZCI6IjQ5MDlmYTQzLTI0OTktNDk2NS04OTZmLWU0MjIzMGY0NDlkMCJ9.8sDoa_3_BCSJ-yDaTB3B8i0yUZwDZA6QguI6tzHKL-U",
  "access_expires_at": "2026-10-30T09:02:48.041186447Z",
  "refresh_token": "cWnJ4jf8tmh00h1ZQ-SO814ifmEZfMII_SNYitgcFag",
  "refresh_expires_at": "2026-11-29T08:47:48.040449037Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2d0b8a0e-df6b-44a5-af18-ab7d56820ff9",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T11:47:46Z"
}
```

```json
{
  "id": "59d201bd-7468-4ce8-8b04-3cd2b4780214",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:52:48.333448Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T11:47:46Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "090e2288-4992-48bb-ada2-2efb6b31d5e6",
  "quote_id": "59d201bd-7468-4ce8-8b04-3cd2b4780214",
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
  "pickup_at": "2026-10-30T11:47:46Z"
}
```

```json
{
  "id": "c5591fc0-93ee-4157-89e4-7f0481dc84b8",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "07816008-0f77-4e5f-b06d-1b1a2a0054cd",
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
  "created_at": "2026-10-30T08:47:48.633895Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T11:47:46Z",
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
  "device_ref": "sandbox-16971"
}
```

```json
{
  "challenge_id": "a7fb5710-a3b1-454d-a1ba-161dfeb37ef1",
  "expires_at": "2026-10-30T08:52:48.938513537Z",
  "resend_available_at": "2026-10-30T08:47:49.938513537Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "960629",
  "sent_at": "2026-10-30T08:47:48.940910134Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a7fb5710-a3b1-454d-a1ba-161dfeb37ef1",
  "code": "960629",
  "device_ref": "sandbox-16971"
}
```

```json
{
  "session_id": "5605dc89-1389-4370-aa80-e6ff5b1f1ed2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDk2OSwiaWF0IjoxNzkzMzUwMDY5LCJqdGkiOiJkOWRjYjFiZi1iODI1LTRhOWQtYmJiNy1lZmQ0MDhkNDFmOTciLCJzaWQiOiI1NjA1ZGM4OS0xMzg5LTQzNzAtYWE4MC1lNmZmNWIxZjFlZDIifQ.SveRLyE_kt2Sa3FQisIDwtrxiGsom3XjL-d9rEOB94Q",
  "access_expires_at": "2026-10-30T09:02:49.244657386Z",
  "refresh_token": "htPw95OZrZpS3tHbyRwLx08b-fTI-e9yrsZklyb-sxY",
  "refresh_expires_at": "2026-11-29T08:47:49.24414181Z",
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
  "command_id": "86a55803-9289-447d-b370-83c2785548ab",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:47:49Z",
    "sequence": 1793350069800
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4654c7b7-89fe-472e-b950-a8b4cdffe7c5",
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
  "last_heartbeat_at": "2026-10-30T08:47:49.819245Z",
  "last_location_at": "2026-10-30T08:47:49.819245Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "c5591fc0-93ee-4157-89e4-7f0481dc84b8",
      "short_number": 25,
      "pickup_at": "2026-10-30T11:47:46Z",
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

`POST /api/driver/v1/preorders/c5591fc0-93ee-4157-89e4-7f0481dc84b8/reserve` → **200**

```json
{
  "command_id": "b890e3fd-b2ab-487d-91dd-b678c1c56ad4"
}
```

```json
{
  "id": "8ffdad12-3736-4eb1-ac1b-4450ac6d95db",
  "state": "RESERVED",
  "order": {
    "order_id": "c5591fc0-93ee-4157-89e4-7f0481dc84b8",
    "short_number": 25,
    "pickup_at": "2026-10-30T11:47:46Z",
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
  "reserved_at": "2026-10-30T08:47:50.407909Z",
  "confirm_from": "2026-10-30T11:17:46Z",
  "confirm_until": "2026-10-30T11:27:46Z",
  "drop_until": "2026-10-30T10:47:46Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "8ffdad12-3736-4eb1-ac1b-4450ac6d95db",
      "state": "RESERVED",
      "order": {
        "order_id": "c5591fc0-93ee-4157-89e4-7f0481dc84b8",
        "short_number": 25,
        "pickup_at": "2026-10-30T11:47:46Z",
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
      "reserved_at": "2026-10-30T08:47:50.407909Z",
      "confirm_from": "2026-10-30T11:17:46Z",
      "confirm_until": "2026-10-30T11:27:46Z",
      "drop_until": "2026-10-30T10:47:46Z"
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
      "id": "8ffdad12-3736-4eb1-ac1b-4450ac6d95db",
      "state": "RESERVED",
      "order": {
        "order_id": "c5591fc0-93ee-4157-89e4-7f0481dc84b8",
        "short_number": 25,
        "pickup_at": "2026-10-30T11:47:46Z",
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
      "reserved_at": "2026-10-30T08:47:50.407909Z",
      "confirm_from": "2026-10-30T11:17:46Z",
      "confirm_until": "2026-10-30T11:27:46Z",
      "drop_until": "2026-10-30T10:47:46Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/8ffdad12-3736-4eb1-ac1b-4450ac6d95db/confirm` → **409**

```json
{
  "command_id": "a24b34fe-4ff2-47e6-b949-f0460d4269f6"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/8ffdad12-3736-4eb1-ac1b-4450ac6d95db/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "277fa561-b15a-417d-92e3-d79b8110ceb0"
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
  "session_id": "9b97fe36-dec3-4001-aa52-a7d7a42c478c",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA5NzEsImlhdCI6MTc5MzM1MDA3MSwianRpIjoiM2Q3N2JkZTEtNzM0Zi00ZWJlLWFlMjUtMWNkNmM5MTY3NzlhIiwic2lkIjoiOWI5N2ZlMzYtZGVjMy00MDAxLWFhNTItYTdkN2E0MmM0NzhjIn0.knOGLbx5nZ2ohC-SQYD5zJz0T-wd5_Lt4QSPGS_ZR1c",
  "access_expires_at": "2026-10-30T09:02:51.875569947Z",
  "refresh_token": "wDZFsx--NRSg3J3gZ4Rzs0TIcNy-j3oG_J7q9ElLmGI",
  "refresh_expires_at": "2026-10-30T20:47:51.874958129Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c5591fc0-93ee-4157-89e4-7f0481dc84b8` → **200**

```json
{
  "id": "c5591fc0-93ee-4157-89e4-7f0481dc84b8",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "07816008-0f77-4e5f-b06d-1b1a2a0054cd",
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
  "created_at": "2026-10-30T08:47:48.633895Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T11:47:46Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "8ffdad12-3736-4eb1-ac1b-4450ac6d95db",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T08:47:50.407909Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/c5591fc0-93ee-4157-89e4-7f0481dc84b8/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T08:47:48.634988Z",
      "actor": {
        "type": "CLIENT",
        "id": "07816008-0f77-4e5f-b06d-1b1a2a0054cd",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "c5591fc0-93ee-4157-89e4-7f0481dc84b8",
        "preorder": true,
        "quote_id": "59d201bd-7468-4ce8-8b04-3cd2b4780214",
        "pickup_at": "2026-10-30T11:47:46Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "510c5902-98b4-4318-97b3-cae29c2d9604"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T08:47:50.409177Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c5591fc0-93ee-4157-89e4-7f0481dc84b8",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "8ffdad12-3736-4eb1-ac1b-4450ac6d95db"
      },
      "correlation_id": "c5e57c48-e61d-4e02-b985-44c983ed6e5b"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order c5591fc0-93ee-4157-89e4-7f0481dc84b8, reservation 8ffdad12-3736-4eb1-ac1b-4450ac6d95db.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2674"
}
```

```json
{
  "challenge_id": "e3b86451-15ce-4ae1-97f5-7d09c803145a",
  "expires_at": "2026-10-30T08:52:52.803356792Z",
  "resend_available_at": "2026-10-30T08:47:53.803356792Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "383757",
  "sent_at": "2026-10-30T08:47:52.807289658Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3b86451-15ce-4ae1-97f5-7d09c803145a",
  "code": "383757",
  "device_ref": "sandbox-2674"
}
```

```json
{
  "session_id": "b8a373c1-aea7-49e4-88d3-a49f9e025ec9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDk3MywiaWF0IjoxNzkzMzUwMDczLCJqdGkiOiIwNjBjNGEzMC1lNzc0LTRiZTAtYjM4My0yZThlZmE4MmQ5ZTUiLCJzaWQiOiJiOGEzNzNjMS1hZWE3LTQ5ZTQtODhkMy1hNDlmOWUwMjVlYzkifQ.UMGh8-dNBe54LgxGxBZOLTSbu26V2MMfKOhfHrJkpP8",
  "access_expires_at": "2026-10-30T09:02:53.110385388Z",
  "refresh_token": "EWDaNaSFaF79DYMNGrYm9iRi_dwKoWHyIS-FoyTS1Wo",
  "refresh_expires_at": "2026-11-29T08:47:53.109793572Z",
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
  "command_id": "d90bdc30-84f0-4f97-a7e9-871cedb75b47",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:47:53Z",
    "sequence": 1793350073673
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7937963a-5fc2-429d-be7e-7c1b14c13482",
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
  "last_heartbeat_at": "2026-10-30T08:47:53.692042Z",
  "last_location_at": "2026-10-30T08:47:53.692042Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677692566",
  "device_ref": "sandbox-32442"
}
```

```json
{
  "challenge_id": "57bc05a6-4c0a-4310-bf48-c3c95c55aa25",
  "expires_at": "2026-10-30T08:52:53.972363635Z",
  "resend_available_at": "2026-10-30T08:47:54.972363635Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677692566` → **200**

```json
{
  "phone": "+380677692566",
  "audience": "CLIENT",
  "code": "658194",
  "sent_at": "2026-10-30T08:47:53.974683378Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "57bc05a6-4c0a-4310-bf48-c3c95c55aa25",
  "code": "658194",
  "device_ref": "sandbox-32442"
}
```

```json
{
  "session_id": "c3928a7f-c7a8-4e39-ac8e-20523e16f625",
  "subject": {
    "type": "CLIENT",
    "id": "ad98ec51-e8f1-4e3a-9768-911ec48f0b21"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZDk4ZWM1MS1lOGYxLTRlM2EtOTc2OC05MTFlYzQ4ZjBiMjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwOTc0LCJpYXQiOjE3OTMzNTAwNzQsImp0aSI6ImUwY2UwY2UxLWZkMWMtNGFhOS05OTY0LTVhY2RhNTIyMmNlMSIsInNpZCI6ImMzOTI4YTdmLWM3YTgtNGUzOS1hYzhlLTIwNTIzZTE2ZjYyNSJ9.E1S21Wo1R-KVGF4jovnAyEKhaEoA9wWTU3g0XyrFWKI",
  "access_expires_at": "2026-10-30T09:02:54.284663029Z",
  "refresh_token": "D8sYt9qyB044tIlPEYDOC_ZS2ixXnajGTs64z4f6Hi8",
  "refresh_expires_at": "2026-11-29T08:47:54.284149528Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "aed3994e-5d59-4930-bd87-2e40784e4a6d",
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
  "id": "7bc25b2b-921b-4785-8fad-f1de21e36bb4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:52:54.573485Z",
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
  "command_id": "f0b9d6ba-dec8-424c-a0cf-35e8157fe158",
  "quote_id": "7bc25b2b-921b-4785-8fad-f1de21e36bb4",
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
  "id": "b529569b-db99-4a27-8b24-864bc8b72bd8",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad98ec51-e8f1-4e3a-9768-911ec48f0b21",
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
  "created_at": "2026-10-30T08:47:54.861767Z",
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
    "id": "d035c9f6-68f1-4fba-a1c8-4e3f7a5858f8",
    "order_id": "b529569b-db99-4a27-8b24-864bc8b72bd8",
    "expires_at": "2026-10-30T08:48:09.865485Z",
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

`POST /api/driver/v1/offers/d035c9f6-68f1-4fba-a1c8-4e3f7a5858f8/accept` → **200**

```json
{
  "command_id": "a295be51-832c-4d6d-90c1-6ff4cf690c90"
}
```

```json
{
  "id": "3c38bd9e-432e-4ed4-8a31-07da8bfa1394",
  "order_id": "b529569b-db99-4a27-8b24-864bc8b72bd8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6eb7ee7c-8054-456e-b2f8-920fb7d5848c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6eb7ee7c-8054-456e-b2f8-920fb7d5848c",
  "order_id": "b529569b-db99-4a27-8b24-864bc8b72bd8",
  "assignment_id": "3c38bd9e-432e-4ed4-8a31-07da8bfa1394",
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

`POST /api/driver/v1/work-sessions/7937963a-5fc2-429d-be7e-7c1b14c13482/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:47:56Z",
    "sequence": 1793350076315
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7937963a-5fc2-429d-be7e-7c1b14c13482",
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
  "last_heartbeat_at": "2026-10-30T08:47:56.049393Z",
  "last_location_at": "2026-10-30T08:47:56.049393Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6eb7ee7c-8054-456e-b2f8-920fb7d5848c",
  "order_id": "b529569b-db99-4a27-8b24-864bc8b72bd8",
  "assignment_id": "3c38bd9e-432e-4ed4-8a31-07da8bfa1394",
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

`POST /api/driver/v1/trips/6eb7ee7c-8054-456e-b2f8-920fb7d5848c/arrive` → **200**

```json
{
  "command_id": "9723a3e0-054f-493d-9742-9098b18b61ac",
  "expected_version": 0
}
```

```json
{
  "id": "6eb7ee7c-8054-456e-b2f8-920fb7d5848c",
  "order_id": "b529569b-db99-4a27-8b24-864bc8b72bd8",
  "assignment_id": "3c38bd9e-432e-4ed4-8a31-07da8bfa1394",
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
  "arrived_at": "2026-10-30T08:47:56.61204Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6eb7ee7c-8054-456e-b2f8-920fb7d5848c/start` → **200**

```json
{
  "command_id": "3194be4c-950b-441a-895b-ff803dc61377",
  "expected_version": 1
}
```

```json
{
  "id": "6eb7ee7c-8054-456e-b2f8-920fb7d5848c",
  "order_id": "b529569b-db99-4a27-8b24-864bc8b72bd8",
  "assignment_id": "3c38bd9e-432e-4ed4-8a31-07da8bfa1394",
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
  "arrived_at": "2026-10-30T08:47:56.61204Z",
  "started_at": "2026-10-30T08:47:56.912151Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/7937963a-5fc2-429d-be7e-7c1b14c13482/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:47:57Z",
    "sequence": 1793350077194
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7937963a-5fc2-429d-be7e-7c1b14c13482",
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
  "last_heartbeat_at": "2026-10-30T08:47:57.212168Z",
  "last_location_at": "2026-10-30T08:47:57.212168Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/6eb7ee7c-8054-456e-b2f8-920fb7d5848c/complete` → **200**

```json
{
  "command_id": "6f1167ec-5df4-44cc-b66f-49ebc74e532e",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:47:57Z",
  "cash_received": true
}
```

```json
{
  "id": "6eb7ee7c-8054-456e-b2f8-920fb7d5848c",
  "order_id": "b529569b-db99-4a27-8b24-864bc8b72bd8",
  "assignment_id": "3c38bd9e-432e-4ed4-8a31-07da8bfa1394",
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
  "arrived_at": "2026-10-30T08:47:56.61204Z",
  "started_at": "2026-10-30T08:47:56.912151Z",
  "completed_at": "2026-10-30T08:47:57.494987Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/b529569b-db99-4a27-8b24-864bc8b72bd8/rating` → **200**

```json
{
  "command_id": "b7930aae-9472-4680-bee1-3142e94c5549",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "b529569b-db99-4a27-8b24-864bc8b72bd8",
  "score": 5,
  "created_at": "2026-10-30T08:47:57.80458306Z"
}
```

`POST /api/driver/v1/orders/b529569b-db99-4a27-8b24-864bc8b72bd8/rating` → **200**

```json
{
  "command_id": "600a943e-7a35-4ea1-a046-54980b9be927",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "b529569b-db99-4a27-8b24-864bc8b72bd8",
  "score": 4,
  "created_at": "2026-10-30T08:47:58.087807963Z"
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
  "session_id": "c0a2a2d5-a1bb-4ea6-8980-44b9fed7e507",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA5NzgsImlhdCI6MTc5MzM1MDA3OCwianRpIjoiMTI4YmMwNmQtZDUwMi00OTBiLTkzOGUtYzhjYjEyZjE0NDdhIiwic2lkIjoiYzBhMmEyZDUtYTFiYi00ZWE2LTg5ODAtNDRiOWZlZDdlNTA3In0.pwgOgzO_Wvvsro0o2Uv6Yc6FT7huKkvHAz6gRATPxeA",
  "access_expires_at": "2026-10-30T09:02:58.947106463Z",
  "refresh_token": "5KHD3Cxo4rBIC-SX-g6USOXzsxSMSCyU6_Qb1_TXl5Y",
  "refresh_expires_at": "2026-10-30T20:47:58.946574867Z",
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
  "session_id": "389f0f4c-8d08-46db-baa0-04fa8e82b994",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA5NzksImlhdCI6MTc5MzM1MDA3OSwianRpIjoiZTkwMjU2NjktYWJmOS00ZTJlLWI0YTktOTE3Y2I3MDEwZGJkIiwic2lkIjoiMzg5ZjBmNGMtOGQwOC00NmRiLWJhYTAtMDRmYThlODJiOTk0In0.uMUsKeKI6BnwDIFpPZzVpVqcikEvjT4wWLR6BvMHfqg",
  "access_expires_at": "2026-10-30T09:02:59.531967279Z",
  "refresh_token": "OXpn22Y1FotBAlCxO9-hRtLBLkGxqoFSrB_0jJpVfaA",
  "refresh_expires_at": "2026-10-30T20:47:59.531389136Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b529569b-db99-4a27-8b24-864bc8b72bd8/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "b529569b-db99-4a27-8b24-864bc8b72bd8",
      "author_type": "RIDER",
      "author_id": "ad98ec51-e8f1-4e3a-9768-911ec48f0b21",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T08:47:57.804583Z"
    },
    {
      "order_id": "b529569b-db99-4a27-8b24-864bc8b72bd8",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "ad98ec51-e8f1-4e3a-9768-911ec48f0b21",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T08:47:58.087808Z"
    }
  ]
}
```

Done: ratings for order b529569b-db99-4a27-8b24-864bc8b72bd8.

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
  "session_id": "92c16246-e657-41fe-9549-134be6330af0",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA5ODAsImlhdCI6MTc5MzM1MDA4MCwianRpIjoiNjU3NWFjZmMtMmRmNi00M2FjLTkwYTItMjNiM2YxMjhhZWZiIiwic2lkIjoiOTJjMTYyNDYtZTY1Ny00MWZlLTk1NDktMTM0YmU2MzMwYWYwIn0.rfst4CpCuiJlWhOqIdUx8MXgugEWS_jCsTSU0LX9OE0",
  "access_expires_at": "2026-10-30T09:03:00.412053453Z",
  "refresh_token": "EkxqP5NzezvJpj_n0hP1kumhPDyVTp2e_O5PZGwS5LE",
  "refresh_expires_at": "2026-10-30T20:48:00.411567913Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "1febcf02-ea1c-40e1-a3dc-63806f1c9f8b",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "493376a4-8a18-4085-9237-97641c41de2a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:48:00.695609Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/493376a4-8a18-4085-9237-97641c41de2a` → **200**

```json
{
  "id": "493376a4-8a18-4085-9237-97641c41de2a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:48:00.695609Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/493376a4-8a18-4085-9237-97641c41de2a` → **200**

```json
{
  "id": "493376a4-8a18-4085-9237-97641c41de2a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:48:00.695609Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/493376a4-8a18-4085-9237-97641c41de2a` → **200**

```json
{
  "id": "493376a4-8a18-4085-9237-97641c41de2a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:48:00.695609Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/493376a4-8a18-4085-9237-97641c41de2a` → **200**

```json
{
  "id": "493376a4-8a18-4085-9237-97641c41de2a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T08:48:00.695609Z",
  "ready_at": "2026-10-30T08:48:03.926076Z",
  "expires_at": "2026-10-31T08:48:03.926076Z"
}
```

`GET /api/admin/v1/reports/exports/493376a4-8a18-4085-9237-97641c41de2a/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "d8a98db9-6d01-4c03-975b-cdd221a51fa5",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "9e4a4ffa-4058-4805-adee-b6fec9a78714",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:48:05.169118Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/9e4a4ffa-4058-4805-adee-b6fec9a78714` → **200**

```json
{
  "id": "9e4a4ffa-4058-4805-adee-b6fec9a78714",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:48:05.169118Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/9e4a4ffa-4058-4805-adee-b6fec9a78714` → **200**

```json
{
  "id": "9e4a4ffa-4058-4805-adee-b6fec9a78714",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:48:05.169118Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/9e4a4ffa-4058-4805-adee-b6fec9a78714` → **200**

```json
{
  "id": "9e4a4ffa-4058-4805-adee-b6fec9a78714",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:48:05.169118Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/9e4a4ffa-4058-4805-adee-b6fec9a78714` → **200**

```json
{
  "id": "9e4a4ffa-4058-4805-adee-b6fec9a78714",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T08:48:05.169118Z",
  "ready_at": "2026-10-30T08:48:08.934537Z",
  "expires_at": "2026-10-31T08:48:08.934537Z"
}
```

`GET /api/admin/v1/reports/exports/9e4a4ffa-4058-4805-adee-b6fec9a78714/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/a3ec1d06-049a-47ae-a3a6-b5b7a37b0d42` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/a3ec1d06-049a-47ae-a3a6-b5b7a37b0d42",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3b5bc9bb-0888-40f8-a914-29b69461ef6c"
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
  "device_ref": "sandbox-25854"
}
```

```json
{
  "challenge_id": "943ffd2f-877e-430f-9b59-38d8b55d888d",
  "expires_at": "2026-10-30T08:53:09.940305579Z",
  "resend_available_at": "2026-10-30T08:48:10.940305579Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "869646",
  "sent_at": "2026-10-30T08:48:09.943193719Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "943ffd2f-877e-430f-9b59-38d8b55d888d",
  "code": "869646",
  "device_ref": "sandbox-25854"
}
```

```json
{
  "session_id": "7df23e92-e4e1-48f3-bc1e-a7b4666fd381",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDk5MCwiaWF0IjoxNzkzMzUwMDkwLCJqdGkiOiJmNTk3MTIyOC1jNzYxLTRkYjktODg4OC1jZjhkN2E1ZWU2ZjUiLCJzaWQiOiI3ZGYyM2U5Mi1lNGUxLTQ4ZjMtYmMxZS1hN2I0NjY2ZmQzODEifQ.F1lkw7gJz0qdWg2L33HV8tzK4Cfowgv_TJZNlVEmaWI",
  "access_expires_at": "2026-10-30T09:03:10.259876337Z",
  "refresh_token": "qsBe21nHFpTZmbqw3nrAjOv3LF1OsLFuust9bN3KcLg",
  "refresh_expires_at": "2026-11-29T08:48:10.259333541Z",
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
  "command_id": "b8340925-6421-434b-9f02-d8b46be84505",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:48:11Z",
    "sequence": 1793350091123
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8269f836-8af7-4a91-b901-f368cfe57e6b",
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
  "last_heartbeat_at": "2026-10-30T08:48:11.141034Z",
  "last_location_at": "2026-10-30T08:48:11.141034Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "61cb3ddc-5a82-437a-9d2c-f1a59401c95f",
  "points": [
    {
      "sequence": 1793350093426,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T08:47:13Z"
    },
    {
      "sequence": 1793350093434,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T08:48:13Z"
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
  "session_id": "d6ce088a-4e72-49a2-a1a2-3d91806cb35f",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA5OTQsImlhdCI6MTc5MzM1MDA5NCwianRpIjoiOTQyMmUwZjktNTNjNi00M2Y4LWFiODctZDhkZDc0YWIwN2ZkIiwic2lkIjoiZDZjZTA4OGEtNGU3Mi00OWEyLWExYTItM2Q5MTgwNmNiMzVmIn0.aQCfpxDVab5o_nvoeZbwAz4hPHzmAHuY6B86svDT7Q4",
  "access_expires_at": "2026-10-30T09:03:14.062744225Z",
  "refresh_token": "lnreIj0cp1OZjs2_ztBXP8nQclztnhHhDhrMhQtETr8",
  "refresh_expires_at": "2026-10-30T20:48:14.062196048Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "7244e0a4-706d-47fa-96be-f1ed6c4ef0c4",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T08:48:13Z",
        "track_point_id": "f8ee26ef-b05d-4356-b388-b4add221dadb",
        "work_session_id": "8269f836-8af7-4a91-b901-f368cfe57e6b"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T08:48:13Z",
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

`POST /api/admin/v1/driver-risk-flags/7244e0a4-706d-47fa-96be-f1ed6c4ef0c4/confirm` → **200**

```json
{
  "command_id": "88fa1bd1-a553-4de2-9af1-829ef2643bb4",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "7244e0a4-706d-47fa-96be-f1ed6c4ef0c4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T08:48:13Z",
    "track_point_id": "f8ee26ef-b05d-4356-b388-b4add221dadb",
    "work_session_id": "8269f836-8af7-4a91-b901-f368cfe57e6b"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T08:48:13Z",
  "reason": null,
  "reviewed_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
  "reviewed_at": "2026-10-30T08:48:14.956063Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/7244e0a4-706d-47fa-96be-f1ed6c4ef0c4/dismiss` → **409**

```json
{
  "command_id": "76ee4d36-2bce-408c-9718-b5fb0de89e97",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/7244e0a4-706d-47fa-96be-f1ed6c4ef0c4/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4cba7f14-ce85-4e6e-b6d3-3e52f8f1bc96"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "ac77af52-263f-4da5-b4da-2adc1a6f9eb2",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "7ec4abd4-cbfa-4a08-a8b1-6b8df37d6c20",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
  "raised_at": "2026-10-30T08:48:15.551199Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/7ec4abd4-cbfa-4a08-a8b1-6b8df37d6c20/dismiss` → **200**

```json
{
  "command_id": "8a8cd2b1-35cf-4115-b39e-8917ce10452c",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "7ec4abd4-cbfa-4a08-a8b1-6b8df37d6c20",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
  "raised_at": "2026-10-30T08:48:15.551199Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
  "reviewed_at": "2026-10-30T08:48:15.850084Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "cbb7969b-a600-47ad-8ffa-f1907f63f0a1",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "7244e0a4-706d-47fa-96be-f1ed6c4ef0c4"
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
      "actor_id": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T08:48:16.155187Z"
    }
  ]
}
```

Done: flag 7244e0a4-706d-47fa-96be-f1ed6c4ef0c4 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "801875ba-b735-4a8a-a58a-222d34091c58",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA5OTcsImlhdCI6MTc5MzM1MDA5NywianRpIjoiMmFmNjZiNDAtMmRkNC00ZGNiLWIwM2EtYjJiZTQxYzQ3NjdmIiwic2lkIjoiODAxODc1YmEtYjczNS00YThhLWE1OGEtMjIyZDM0MDkxYzU4In0.9K8BKeRkndb6fiPg9_-jiz-6PCasFNWqqMPSuY27MNk",
  "access_expires_at": "2026-10-30T09:03:17.027846883Z",
  "refresh_token": "6tzW2QajGJQlR1F_5l-NLwSMjyf8-URx3Q7Do_1G-5o",
  "refresh_expires_at": "2026-10-30T20:48:17.027318654Z",
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
      "actor_id": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T08:48:16.155187Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "f81b483c-4ec8-47ed-aaae-d78ae630d95e",
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
  "session_id": "8269f836-8af7-4a91-b901-f368cfe57e6b",
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
  "last_heartbeat_at": "2026-10-30T08:48:11.141034Z",
  "last_location_at": "2026-10-30T08:48:11.141034Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8269f836-8af7-4a91-b901-f368cfe57e6b/close` → **200**

```json
{
  "command_id": "bb961b35-905f-45fa-9aa9-36988f1305d3",
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
  "session_id": "793a13a7-3ce4-4e3a-91f7-efc86780e44d",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA5OTgsImlhdCI6MTc5MzM1MDA5OCwianRpIjoiODQwZjVhMWMtNWQ4Zi00NzQ3LTg2M2YtZWQyMzRkZDdkYWZiIiwic2lkIjoiNzkzYTEzYTctM2NlNC00ZTNhLTkxZjctZWZjODY3ODBlNDRkIn0.SyoTTyLUBUZGYF-Rf7rEQ33KygMi5CAWXyqUUTmFwqo",
  "access_expires_at": "2026-10-30T09:03:18.768988161Z",
  "refresh_token": "CS2O3tgG0j-ADwKZaUdb8Bd3alKQL1bVbdbDaXlKPjE",
  "refresh_expires_at": "2026-10-30T20:48:18.768488535Z",
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
  "command_id": "46981e2c-39bf-4f70-9e9b-027c7ebc704d",
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
  "changed_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T08:48:19.36139Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "46981e2c-39bf-4f70-9e9b-027c7ebc704d",
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
  "changed_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T08:48:19.36139Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48829791078",
  "device_ref": "sandbox-20151"
}
```

```json
{
  "challenge_id": "be3f25bc-6279-48e6-b8e9-ab9bf2f6585e",
  "expires_at": "2026-10-30T08:53:19.966851838Z",
  "resend_available_at": "2026-10-30T08:48:20.966851838Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48829791078` → **200**

```json
{
  "phone": "+48829791078",
  "audience": "CLIENT",
  "code": "339901",
  "sent_at": "2026-10-30T08:48:19.96992731Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "be3f25bc-6279-48e6-b8e9-ab9bf2f6585e",
  "code": "339901",
  "device_ref": "sandbox-20151"
}
```

```json
{
  "session_id": "6cfb65f2-dc81-4d20-9517-9c94aca618da",
  "subject": {
    "type": "CLIENT",
    "id": "8acefb0c-4338-4d32-a3ef-07d6f80e9888"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YWNlZmIwYy00MzM4LTRkMzItYTNlZi0wN2Q2ZjgwZTk4ODgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxMDAwLCJpYXQiOjE3OTMzNTAxMDAsImp0aSI6IjQyMzk5NzI2LTAwMGMtNDBmNS1hZmNiLTk2NjkzZjFkZTFmOCIsInNpZCI6IjZjZmI2NWYyLWRjODEtNGQyMC05NTE3LTljOTRhY2E2MThkYSJ9.mE1eWcYTXnWFA7V25qHca9JL4YP56BZ5PzV4uMwyS0M",
  "access_expires_at": "2026-10-30T09:03:20.293600793Z",
  "refresh_token": "CO6Px3JaXyc6JVYOc0UnJ8DYpuQ-zHmqn7fO6odC310",
  "refresh_expires_at": "2026-11-29T08:48:20.293105806Z",
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
  "correlation_id": "117542a9-0c82-4201-a560-161eb0d95580"
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
  "device_ref": "sandbox-32003"
}
```

```json
{
  "challenge_id": "ebb0a287-b6f1-40fa-9e45-7509cf24ea1c",
  "expires_at": "2026-10-30T08:53:21.140175161Z",
  "resend_available_at": "2026-10-30T08:48:22.140175161Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "182428",
  "sent_at": "2026-10-30T08:48:21.142654155Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ebb0a287-b6f1-40fa-9e45-7509cf24ea1c",
  "code": "182428",
  "device_ref": "sandbox-32003"
}
```

```json
{
  "session_id": "36916d7f-bb64-4de0-a5bb-13944a703783",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTAwMSwiaWF0IjoxNzkzMzUwMTAxLCJqdGkiOiJlYmZhYTljMi0xMWMwLTQ1ZGUtOWQ4Mi1mYmQ5ZWU3ZWE5MjQiLCJzaWQiOiIzNjkxNmQ3Zi1iYjY0LTRkZTAtYTViYi0xMzk0NGE3MDM3ODMifQ.ZcEsK-c-VqxIyIpM_SjbOhNHNbwF_3zDD1cuwXKA5Lg",
  "access_expires_at": "2026-10-30T09:03:21.457127503Z",
  "refresh_token": "bsKUntAKMXj_iyKzOcXwUIgWJzx5ggTlLrzKjAGbujw",
  "refresh_expires_at": "2026-11-29T08:48:21.456620583Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4654c7b7-89fe-472e-b950-a8b4cdffe7c5",
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
  "last_heartbeat_at": "2026-10-30T08:47:49.819245Z",
  "last_location_at": "2026-10-30T08:47:49.819245Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4654c7b7-89fe-472e-b950-a8b4cdffe7c5/handover` → **200**

```json
{
  "command_id": "091965ee-7561-471f-a53e-b1549030e2e0",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4654c7b7-89fe-472e-b950-a8b4cdffe7c5",
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
  "last_heartbeat_at": "2026-10-30T08:47:49.819245Z",
  "last_location_at": "2026-10-30T08:47:49.819245Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4654c7b7-89fe-472e-b950-a8b4cdffe7c5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:48:22Z",
    "sequence": 1793350102314
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4654c7b7-89fe-472e-b950-a8b4cdffe7c5",
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
  "last_heartbeat_at": "2026-10-30T08:48:22.333054Z",
  "last_location_at": "2026-10-30T08:48:22.333054Z",
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
  "session_id": "4654c7b7-89fe-472e-b950-a8b4cdffe7c5",
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
  "last_heartbeat_at": "2026-10-30T08:48:22.333054Z",
  "last_location_at": "2026-10-30T08:48:22.333054Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4654c7b7-89fe-472e-b950-a8b4cdffe7c5/close` → **200**

```json
{
  "command_id": "4db5d57c-83d6-4cdd-be89-34025c5ed894",
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
  "correlation_id": "107b11cd-e008-40f2-8594-315bc5a21849"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675101974",
  "device_ref": "sandbox-7285"
}
```

```json
{
  "challenge_id": "2400a0da-9346-4b43-b88f-c7f211725cf2",
  "expires_at": "2026-10-30T08:53:23.771243163Z",
  "resend_available_at": "2026-10-30T08:48:24.771243163Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675101974` → **200**

```json
{
  "phone": "+380675101974",
  "audience": "CLIENT",
  "code": "081991",
  "sent_at": "2026-10-30T08:48:23.773669786Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2400a0da-9346-4b43-b88f-c7f211725cf2",
  "code": "081991",
  "device_ref": "sandbox-7285"
}
```

```json
{
  "session_id": "e8562db4-0eb3-4add-87d8-cdafd9da9606",
  "subject": {
    "type": "CLIENT",
    "id": "2ae94b07-908a-400c-9e69-b79ff4685a17"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYWU5NGIwNy05MDhhLTQwMGMtOWU2OS1iNzlmZjQ2ODVhMTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxMDA0LCJpYXQiOjE3OTMzNTAxMDQsImp0aSI6IjgzZmFhMzAzLWUzNGUtNDkyZC05OGVhLTllYzZmYTg0ZmE0ZSIsInNpZCI6ImU4NTYyZGI0LTBlYjMtNGFkZC04N2Q4LWNkYWZkOWRhOTYwNiJ9.OG_e5F2x4tysvihUELGv--KGpejrnWbWttTkMhimcNo",
  "access_expires_at": "2026-10-30T09:03:24.092280757Z",
  "refresh_token": "G-bSKZZzmzD6vESX7UwoZTVvIAYWNRn7WKzWPLq9DWQ",
  "refresh_expires_at": "2026-11-29T08:48:24.091754071Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "981efdae-6b4c-4274-91a6-598598dc3763",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "2b446eac-e96f-4f0c-b3f4-e8b0d41e00a2",
  "upload_path": "/api/rider/v1/uploads/2b446eac-e96f-4f0c-b3f4-e8b0d41e00a2",
  "expires_at": "2026-10-30T09:03:24.391025783Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/2b446eac-e96f-4f0c-b3f4-e8b0d41e00a2` → **200**

```json
{
  "file_id": "2b446eac-e96f-4f0c-b3f4-e8b0d41e00a2",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "bdc1f185-79ec-493f-a1f3-bc87bec86386",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "2b446eac-e96f-4f0c-b3f4-e8b0d41e00a2"
  ]
}
```

```json
{
  "id": "5a84a973-20cb-4231-b9c0-a6abe147be6b",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "2ae94b07-908a-400c-9e69-b79ff4685a17",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T08:48:24.715284Z",
  "updated_at": "2026-10-30T08:48:24.715284Z",
  "respond_by": "2026-10-30T12:48:24.715284Z",
  "messages": [
    {
      "id": "46ff5e36-ce1c-4128-9984-80800888ed9d",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "2ae94b07-908a-400c-9e69-b79ff4685a17",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:48:24.716453Z",
      "attachments": [
        {
          "file_id": "2b446eac-e96f-4f0c-b3f4-e8b0d41e00a2",
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
  "session_id": "256daf87-c7d9-4678-87f1-3a6be9ba2e92",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTEwMDUsImlhdCI6MTc5MzM1MDEwNSwianRpIjoiZTc2NDE1YzctMzA1Ni00ZWU0LTk0YmUtNmI0NDY1YzViZjA0Iiwic2lkIjoiMjU2ZGFmODctYzdkOS00Njc4LTg3ZjEtM2E2YmU5YmEyZTkyIn0.dzQWgI4iltBxq4ph6RMXK2mEMYrZwN3TauwGbYwQEgY",
  "access_expires_at": "2026-10-30T09:03:25.331359115Z",
  "refresh_token": "vJNj7MVEkaTiJSttGD6Ygba5Oc_v7AtbgLjfDyB2w4E",
  "refresh_expires_at": "2026-10-30T20:48:25.330866953Z",
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
  "session_id": "71373ef9-af22-40d9-95c9-fc07e12869ab",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTEwMDUsImlhdCI6MTc5MzM1MDEwNSwianRpIjoiNmFkY2RkZTctNjhiMi00ZDUyLTk4ZDUtODU0ZmMyNTk4Njk4Iiwic2lkIjoiNzEzNzNlZjktYWYyMi00MGQ5LTk1YzktZmMwN2UxMjg2OWFiIn0.IiV4uivYKo-T4aEKN5pP51JVOYiDUTCQpyMxkBfSc4s",
  "access_expires_at": "2026-10-30T09:03:25.903089764Z",
  "refresh_token": "tc7aU5shfGVZEZDH--bEtUA0gq7-y9GxDF3A35pPnws",
  "refresh_expires_at": "2026-10-30T20:48:25.902517031Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/5a84a973-20cb-4231-b9c0-a6abe147be6b/attachments/2b446eac-e96f-4f0c-b3f4-e8b0d41e00a2` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "d5d19602-0307-4c1f-b5ab-25fd9a632d40",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "ef110997-5eed-4e52-91c5-524743cb3663",
  "upload_path": "/api/operator/v1/uploads/ef110997-5eed-4e52-91c5-524743cb3663",
  "expires_at": "2026-10-30T09:03:26.208174818Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/ef110997-5eed-4e52-91c5-524743cb3663` → **200**

```json
{
  "file_id": "ef110997-5eed-4e52-91c5-524743cb3663",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/5a84a973-20cb-4231-b9c0-a6abe147be6b` → **200**

```json
{
  "id": "5a84a973-20cb-4231-b9c0-a6abe147be6b",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "2ae94b07-908a-400c-9e69-b79ff4685a17",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T08:48:24.715284Z",
  "updated_at": "2026-10-30T08:48:24.715284Z",
  "respond_by": "2026-10-30T12:48:24.715284Z",
  "messages": [
    {
      "id": "46ff5e36-ce1c-4128-9984-80800888ed9d",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "2ae94b07-908a-400c-9e69-b79ff4685a17",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:48:24.716453Z",
      "attachments": [
        {
          "file_id": "2b446eac-e96f-4f0c-b3f4-e8b0d41e00a2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/5a84a973-20cb-4231-b9c0-a6abe147be6b/comments` → **200**

```json
{
  "command_id": "f8e95f5f-06c5-4748-a025-9ff0884996ce",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "ef110997-5eed-4e52-91c5-524743cb3663"
  ]
}
```

```json
{
  "id": "5a84a973-20cb-4231-b9c0-a6abe147be6b",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "2ae94b07-908a-400c-9e69-b79ff4685a17",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T08:48:24.715284Z",
  "updated_at": "2026-10-30T08:48:26.830588Z",
  "respond_by": "2026-10-30T12:48:24.715284Z",
  "messages": [
    {
      "id": "46ff5e36-ce1c-4128-9984-80800888ed9d",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "2ae94b07-908a-400c-9e69-b79ff4685a17",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:48:24.716453Z",
      "attachments": [
        {
          "file_id": "2b446eac-e96f-4f0c-b3f4-e8b0d41e00a2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "1c72ab3d-eb86-43b3-a240-eb499fc4afba",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T08:48:26.8301Z",
      "attachments": [
        {
          "file_id": "ef110997-5eed-4e52-91c5-524743cb3663",
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

`GET /api/rider/v1/support/cases/5a84a973-20cb-4231-b9c0-a6abe147be6b` → **200**

```json
{
  "id": "5a84a973-20cb-4231-b9c0-a6abe147be6b",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "2ae94b07-908a-400c-9e69-b79ff4685a17",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T08:48:24.715284Z",
  "updated_at": "2026-10-30T08:48:26.830588Z",
  "respond_by": "2026-10-30T12:48:24.715284Z",
  "messages": [
    {
      "id": "46ff5e36-ce1c-4128-9984-80800888ed9d",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "2ae94b07-908a-400c-9e69-b79ff4685a17",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:48:24.716453Z",
      "attachments": [
        {
          "file_id": "2b446eac-e96f-4f0c-b3f4-e8b0d41e00a2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "1c72ab3d-eb86-43b3-a240-eb499fc4afba",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T08:48:26.8301Z",
      "attachments": [
        {
          "file_id": "ef110997-5eed-4e52-91c5-524743cb3663",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/5a84a973-20cb-4231-b9c0-a6abe147be6b/attachments/ef110997-5eed-4e52-91c5-524743cb3663` → **200**

Done: support case 5a84a973-20cb-4231-b9c0-a6abe147be6b, rider attachment 2b446eac-e96f-4f0c-b3f4-e8b0d41e00a2, operator attachment ef110997-5eed-4e52-91c5-524743cb3663.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735955944",
  "device_ref": "sandbox-15112"
}
```

```json
{
  "challenge_id": "28571c90-e3a1-4048-b21c-96c7fe02953c",
  "expires_at": "2026-10-30T08:53:27.450874415Z",
  "resend_available_at": "2026-10-30T08:48:28.450874415Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735955944` → **200**

```json
{
  "phone": "+380735955944",
  "audience": "CLIENT",
  "code": "915472",
  "sent_at": "2026-10-30T08:48:27.453618253Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "28571c90-e3a1-4048-b21c-96c7fe02953c",
  "code": "915472",
  "device_ref": "sandbox-15112"
}
```

```json
{
  "session_id": "c3ae82cd-f3f9-44f0-b5cc-01d2862c3f45",
  "subject": {
    "type": "CLIENT",
    "id": "0e645cfd-0a16-4637-a995-61e215b67edf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZTY0NWNmZC0wYTE2LTQ2MzctYTk5NS02MWUyMTViNjdlZGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxMDA3LCJpYXQiOjE3OTMzNTAxMDcsImp0aSI6Ijc5MjM3OTczLWY4NzQtNGU1NC04YjY3LTI1NzlhNGJjMTJiMyIsInNpZCI6ImMzYWU4MmNkLWYzZjktNDRmMC1iNWNjLTAxZDI4NjJjM2Y0NSJ9.6OHERCNOIp5HlI4uZXSpUMNQtv1CpYqaa_ULxIp0vJc",
  "access_expires_at": "2026-10-30T09:03:27.759523486Z",
  "refresh_token": "R1CIzglAPd2YkvnmAFaLq6gqx3Z0vZHlUlG5WugG5co",
  "refresh_expires_at": "2026-11-29T08:48:27.759012369Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "3a218b93-19fe-4953-b831-7b42b39e2719",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "61f73976-ac05-4c44-8c62-d7f0c3529eb3",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-61f73976-ac05-4c44-8c62-d7f0c3529eb3",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "5660e0a1f5542eb235f46617b7cfca76",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=61f73976-ac05-4c44-8c62-d7f0c3529eb3",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735955944"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=61f73976-ac05-4c44-8c62-d7f0c3529eb3",
  "expires_at": "2026-10-30T09:18:28.04771Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/61f73976-ac05-4c44-8c62-d7f0c3529eb3` → **200**

```json
{
  "id": "61f73976-ac05-4c44-8c62-d7f0c3529eb3",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T09:18:28.04771Z",
  "card": {
    "id": "31acc84d-914a-40eb-b045-5090fdd52aa6",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6742",
    "card_type": "Visa",
    "created_at": "2026-10-30T08:48:28.33611Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "58a7f70d-e549-4bbd-9de5-c807b1508acf",
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
  "id": "8c93a907-1027-4dc5-adcf-7dfffab19172",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:53:28.647046Z",
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
  "command_id": "329c3d42-8db5-4046-b421-9ff24bbcdd5e",
  "quote_id": "8c93a907-1027-4dc5-adcf-7dfffab19172",
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
  "id": "af059893-3cc9-47e8-acb3-426f12752576",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0e645cfd-0a16-4637-a995-61e215b67edf",
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
  "created_at": "2026-10-30T08:48:28.958854Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/af059893-3cc9-47e8-acb3-426f12752576` → **200**

```json
{
  "id": "af059893-3cc9-47e8-acb3-426f12752576",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0e645cfd-0a16-4637-a995-61e215b67edf",
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
  "created_at": "2026-10-30T08:48:28.958854Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/af059893-3cc9-47e8-acb3-426f12752576` → **200**

```json
{
  "id": "af059893-3cc9-47e8-acb3-426f12752576",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0e645cfd-0a16-4637-a995-61e215b67edf",
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
  "created_at": "2026-10-30T08:48:28.958854Z",
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

`GET /api/rider/v1/orders/af059893-3cc9-47e8-acb3-426f12752576` → **200**

```json
{
  "id": "af059893-3cc9-47e8-acb3-426f12752576",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0e645cfd-0a16-4637-a995-61e215b67edf",
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
  "created_at": "2026-10-30T08:48:28.958854Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/af059893-3cc9-47e8-acb3-426f12752576/switch-to-cash` → **200**

```json
{
  "command_id": "7fc030a4-b5f3-4d92-83c7-aed891b26b21",
  "expected_version": 3
}
```

```json
{
  "id": "af059893-3cc9-47e8-acb3-426f12752576",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "0e645cfd-0a16-4637-a995-61e215b67edf",
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
  "created_at": "2026-10-30T08:48:28.958854Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/af059893-3cc9-47e8-acb3-426f12752576/switch-to-cash` → **409**

```json
{
  "command_id": "ef5c973a-8f2f-45ec-9c08-6683c8213ebd",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/af059893-3cc9-47e8-acb3-426f12752576/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6b1eff55-dc5f-4dfe-9511-d7fba3077662"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/af059893-3cc9-47e8-acb3-426f12752576` → **200**

```json
{
  "id": "af059893-3cc9-47e8-acb3-426f12752576",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "0e645cfd-0a16-4637-a995-61e215b67edf",
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
  "created_at": "2026-10-30T08:48:28.958854Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/af059893-3cc9-47e8-acb3-426f12752576/cancel` → **200**

```json
{
  "command_id": "e9c7041e-9ac5-4866-9170-d82503f249bd",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "af059893-3cc9-47e8-acb3-426f12752576",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "0e645cfd-0a16-4637-a995-61e215b67edf",
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
  "created_at": "2026-10-30T08:48:28.958854Z",
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
  "session_id": "daa47f7d-184f-41a9-b4c0-dd042c75f461",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTEwMTIsImlhdCI6MTc5MzM1MDExMiwianRpIjoiOGEwNzlkNjMtMDllYy00OTQ1LTliNGQtYzQyMWNjNTcyY2FjIiwic2lkIjoiZGFhNDdmN2QtMTg0Zi00MWE5LWI0YzAtZGQwNDJjNzVmNDYxIn0.aIYhs_4LSLtiaJYAiVGZVh_IeHB3QwyFJn7AoHZgqc4",
  "access_expires_at": "2026-10-30T09:03:32.691104847Z",
  "refresh_token": "4NfdOhOmOoW9Mlgf2uTDlrxqFCJQUFmtrXo-FmWtZ3w",
  "refresh_expires_at": "2026-10-30T20:48:32.690608898Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-469"
}
```

```json
{
  "challenge_id": "f8f4d9bb-601c-4aa2-bae2-5ef8717f696d",
  "expires_at": "2026-10-30T08:53:32.971283967Z",
  "resend_available_at": "2026-10-30T08:48:33.971283967Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "961227",
  "sent_at": "2026-10-30T08:48:32.974222677Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f8f4d9bb-601c-4aa2-bae2-5ef8717f696d",
  "code": "961227",
  "device_ref": "sandbox-469"
}
```

```json
{
  "session_id": "c40228b6-7449-44ef-8330-b739557f988e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTAxMywiaWF0IjoxNzkzMzUwMTEzLCJqdGkiOiIwOWE4NDQ0Ni00OTFjLTQ4NmEtOWY0Ni1kOTk3OTZhZDIwYTgiLCJzaWQiOiJjNDAyMjhiNi03NDQ5LTQ0ZWYtODMzMC1iNzM5NTU3Zjk4OGUifQ.Bkv0bMQjRF9_2Y9LxD8TI1pXvUSWmYmItBXJPgPT0cg",
  "access_expires_at": "2026-10-30T09:03:33.295742333Z",
  "refresh_token": "3LrknkISazbGQwaFOug7aFX9yMMJMdQ4OP5hiMsGlWA",
  "refresh_expires_at": "2026-11-29T08:48:33.295172698Z",
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
      "actor_id": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T08:48:16.155187Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T08:48:17.607463Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "e6edadff-6974-4dca-81cb-ebb5a21e0bf8",
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
  "device_ref": "sandbox-17736"
}
```

```json
{
  "challenge_id": "4db90ed0-3faa-420a-9c50-b26f5512996d",
  "expires_at": "2026-10-30T08:53:34.462991494Z",
  "resend_available_at": "2026-10-30T08:48:35.462991494Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "271243",
  "sent_at": "2026-10-30T08:48:34.465573855Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4db90ed0-3faa-420a-9c50-b26f5512996d",
  "code": "271243",
  "device_ref": "sandbox-17736"
}
```

```json
{
  "session_id": "a7ba7337-e3c1-4633-9534-5f4886d2d293",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTAxNCwiaWF0IjoxNzkzMzUwMTE0LCJqdGkiOiIxNTEyMjhlZC05YzEzLTRiZDMtYmUzMC1iZTZmYzM2NTYzM2MiLCJzaWQiOiJhN2JhNzMzNy1lM2MxLTQ2MzMtOTUzNC01ZjQ4ODZkMmQyOTMifQ.cJsrvARInbYIBPORKVMCkB-z0ZA-0S5unke506PIEUY",
  "access_expires_at": "2026-10-30T09:03:34.789919018Z",
  "refresh_token": "MRCPofG5ZRTN6Q5tbPuzXU51EAUB0yewzB64-6hQdW4",
  "refresh_expires_at": "2026-11-29T08:48:34.789353809Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7937963a-5fc2-429d-be7e-7c1b14c13482",
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
  "last_heartbeat_at": "2026-10-30T08:47:57.212168Z",
  "last_location_at": "2026-10-30T08:47:57.212168Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7937963a-5fc2-429d-be7e-7c1b14c13482/handover` → **200**

```json
{
  "command_id": "15928c40-4217-4e42-8079-77470423972a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7937963a-5fc2-429d-be7e-7c1b14c13482",
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
  "last_heartbeat_at": "2026-10-30T08:47:57.212168Z",
  "last_location_at": "2026-10-30T08:47:57.212168Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7937963a-5fc2-429d-be7e-7c1b14c13482/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:48:35Z",
    "sequence": 1793350115636
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7937963a-5fc2-429d-be7e-7c1b14c13482",
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
  "last_heartbeat_at": "2026-10-30T08:48:35.654347Z",
  "last_location_at": "2026-10-30T08:48:35.654347Z",
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
  "command_id": "3a79be61-749d-4ea1-951e-f1527646e1c8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:48:36Z",
    "sequence": 1793350116234
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "833abd0c-322c-4e10-baf5-16cbca2b1f2d",
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
  "last_heartbeat_at": "2026-10-30T08:48:36.252068Z",
  "last_location_at": "2026-10-30T08:48:36.252068Z",
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
  "session_id": "295be868-2269-4973-86c8-c200c898d773",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTEwMTYsImlhdCI6MTc5MzM1MDExNiwianRpIjoiZjI5YWZlODAtNDQzNi00N2FmLWIzZTQtNWRjZjFjYzFiNTBhIiwic2lkIjoiMjk1YmU4NjgtMjI2OS00OTczLTg2YzgtYzIwMGM4OThkNzczIn0.nNjTMqCQUsRxbmhBIjeZ1_AIDrruWyNmBgi1g8yfzps",
  "access_expires_at": "2026-10-30T09:03:36.83222571Z",
  "refresh_token": "ew3fmE-Z8EdVeP2GE1OeCqRu6EGVZq6Xx9R4OQxV77s",
  "refresh_expires_at": "2026-10-30T20:48:36.831686643Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "e54de793-4c4b-4db1-81d1-735140091524",
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
  "id": "e00b2086-4815-4407-932e-56c237f622e0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:53:37.121194Z",
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
  "command_id": "d4405c5f-d117-4577-960e-1cd7e893cbf8",
  "quote_id": "e00b2086-4815-4407-932e-56c237f622e0",
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
  "id": "e62ce2d1-ea52-4f70-bdef-a0db71a4e105",
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
  "created_at": "2026-10-30T08:48:37.434368Z",
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
    "id": "df248881-063c-4713-a3ad-0a9f47d625f9",
    "order_id": "e62ce2d1-ea52-4f70-bdef-a0db71a4e105",
    "expires_at": "2026-10-30T08:48:52.438499Z",
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

`POST /api/driver/v1/offers/df248881-063c-4713-a3ad-0a9f47d625f9/accept` → **200**

```json
{
  "command_id": "1eb6e94e-3352-4beb-93df-923766d62368"
}
```

```json
{
  "id": "af127023-2abb-4a85-8dea-1425c18426a2",
  "order_id": "e62ce2d1-ea52-4f70-bdef-a0db71a4e105",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4895f9d5-5912-4ae7-a592-b133116fc17b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4895f9d5-5912-4ae7-a592-b133116fc17b",
  "order_id": "e62ce2d1-ea52-4f70-bdef-a0db71a4e105",
  "assignment_id": "af127023-2abb-4a85-8dea-1425c18426a2",
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

`POST /api/driver/v1/work-sessions/833abd0c-322c-4e10-baf5-16cbca2b1f2d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:48:38Z",
    "sequence": 1793350118888
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "833abd0c-322c-4e10-baf5-16cbca2b1f2d",
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
  "last_heartbeat_at": "2026-10-30T08:48:38.906254Z",
  "last_location_at": "2026-10-30T08:48:38.906254Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4895f9d5-5912-4ae7-a592-b133116fc17b/arrive` → **200**

```json
{
  "command_id": "a82af53d-81b4-4783-8e03-fb47fd794f72",
  "expected_version": 0
}
```

```json
{
  "id": "4895f9d5-5912-4ae7-a592-b133116fc17b",
  "order_id": "e62ce2d1-ea52-4f70-bdef-a0db71a4e105",
  "assignment_id": "af127023-2abb-4a85-8dea-1425c18426a2",
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
  "arrived_at": "2026-10-30T08:48:39.209067Z",
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

`POST /api/driver/v1/trips/4895f9d5-5912-4ae7-a592-b133116fc17b/start` → **200**

```json
{
  "command_id": "b8253ba5-0a52-4793-a6c6-82351dc0beb8",
  "expected_version": 1
}
```

```json
{
  "id": "4895f9d5-5912-4ae7-a592-b133116fc17b",
  "order_id": "e62ce2d1-ea52-4f70-bdef-a0db71a4e105",
  "assignment_id": "af127023-2abb-4a85-8dea-1425c18426a2",
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
  "arrived_at": "2026-10-30T08:48:39.209067Z",
  "started_at": "2026-10-30T08:48:39.503188Z",
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

`POST /api/driver/v1/trips/4895f9d5-5912-4ae7-a592-b133116fc17b/complete` → **200**

```json
{
  "command_id": "10432023-32c9-4d10-a101-3eaed2d7a510",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:48:39Z",
  "cash_received": true
}
```

```json
{
  "id": "4895f9d5-5912-4ae7-a592-b133116fc17b",
  "order_id": "e62ce2d1-ea52-4f70-bdef-a0db71a4e105",
  "assignment_id": "af127023-2abb-4a85-8dea-1425c18426a2",
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
  "arrived_at": "2026-10-30T08:48:39.209067Z",
  "started_at": "2026-10-30T08:48:39.503188Z",
  "completed_at": "2026-10-30T08:48:39.805773Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/e62ce2d1-ea52-4f70-bdef-a0db71a4e105` → **200**

```json
{
  "id": "e62ce2d1-ea52-4f70-bdef-a0db71a4e105",
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
    "id": "af127023-2abb-4a85-8dea-1425c18426a2",
    "order_id": "e62ce2d1-ea52-4f70-bdef-a0db71a4e105",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4895f9d5-5912-4ae7-a592-b133116fc17b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:48:37.434368Z",
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
  "session_id": "7937963a-5fc2-429d-be7e-7c1b14c13482",
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
  "last_heartbeat_at": "2026-10-30T08:48:35.654347Z",
  "last_location_at": "2026-10-30T08:48:35.654347Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7937963a-5fc2-429d-be7e-7c1b14c13482/close` → **200**

```json
{
  "command_id": "ed3c4d63-9370-4928-80f1-3b2386fc23c7",
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
  "session_id": "833abd0c-322c-4e10-baf5-16cbca2b1f2d",
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
  "last_heartbeat_at": "2026-10-30T08:48:38.906254Z",
  "last_location_at": "2026-10-30T08:48:38.906254Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/833abd0c-322c-4e10-baf5-16cbca2b1f2d/close` → **200**

```json
{
  "command_id": "6c2d1bff-1300-4e00-b369-0ee35b2b7948",
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

Done: terminal order e62ce2d1-ea52-4f70-bdef-a0db71a4e105 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-7175"
}
```

```json
{
  "challenge_id": "166f70e6-257e-4b7f-b88c-2941130e6c9c",
  "expires_at": "2026-10-30T08:53:44.853801567Z",
  "resend_available_at": "2026-10-30T08:48:45.853801567Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "967580",
  "sent_at": "2026-10-30T08:48:44.856361392Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "166f70e6-257e-4b7f-b88c-2941130e6c9c",
  "code": "967580",
  "device_ref": "sandbox-7175"
}
```

```json
{
  "session_id": "977daf37-55cb-47ca-a332-fb59c49c98d1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTAyNSwiaWF0IjoxNzkzMzUwMTI1LCJqdGkiOiJiOGY0ZDc4NS1mYmY1LTQ2MDQtOWUyOC1iMGNjMjg5YjI3MjgiLCJzaWQiOiI5NzdkYWYzNy01NWNiLTQ3Y2EtYTMzMi1mYjU5YzQ5Yzk4ZDEifQ.Owb2HOTlKb61rS2cSSxiz6gxbMFe2OdAfqRLx01VBNI",
  "access_expires_at": "2026-10-30T09:03:45.163290334Z",
  "refresh_token": "egxxMlDdJs-UHFDJ-P0B_2F0ODjbY9j784e_CeZCUEs",
  "refresh_expires_at": "2026-11-29T08:48:45.162769583Z",
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
  "device_ref": "sandbox-4656"
}
```

```json
{
  "challenge_id": "a4e0023d-cd55-4c64-9f60-afd2706e6677",
  "expires_at": "2026-10-30T08:53:45.726194433Z",
  "resend_available_at": "2026-10-30T08:48:46.726194433Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "821460",
  "sent_at": "2026-10-30T08:48:45.728914144Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a4e0023d-cd55-4c64-9f60-afd2706e6677",
  "code": "821460",
  "device_ref": "sandbox-4656"
}
```

```json
{
  "session_id": "d26148f0-d018-4ff7-8623-03662b67c42a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTAyNiwiaWF0IjoxNzkzMzUwMTI2LCJqdGkiOiIwZWE5YTZjNi03MzNhLTQ2OTEtYTlhOC04NjU2NjQzYjdmNzgiLCJzaWQiOiJkMjYxNDhmMC1kMDE4LTRmZjctODYyMy0wMzY2MmI2N2M0MmEifQ.NqM8iDzMOR4QEqsV-5hQDV_-1C136eIueYzFyeA-KQg",
  "access_expires_at": "2026-10-30T09:03:46.062556128Z",
  "refresh_token": "TtTeo0vSqqAa6xZkQwqdfKezuPsWEcpaB0SytXGe3Ik",
  "refresh_expires_at": "2026-11-29T08:48:46.061194858Z",
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
  "device_ref": "sandbox-23764"
}
```

```json
{
  "challenge_id": "d9b3c507-a07d-4ba9-8073-dedb93ad0cb8",
  "expires_at": "2026-10-30T08:53:46.634342765Z",
  "resend_available_at": "2026-10-30T08:48:47.634342765Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "355921",
  "sent_at": "2026-10-30T08:48:46.637148483Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d9b3c507-a07d-4ba9-8073-dedb93ad0cb8",
  "code": "355921",
  "device_ref": "sandbox-23764"
}
```

```json
{
  "session_id": "8d07ae55-b9c3-4b11-b92b-ba2d46bdf680",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTAyNiwiaWF0IjoxNzkzMzUwMTI2LCJqdGkiOiI5NDFhYTAyYy1hOTgzLTQwZTktOTc5ZS1lZWI1ODE5OWM1ZDkiLCJzaWQiOiI4ZDA3YWU1NS1iOWMzLTRiMTEtYjkyYi1iYTJkNDZiZGY2ODAifQ.Ds5rVjI2Xm_lbHqk-wMx1sH_R7H48dbyHgC9AdF1bzo",
  "access_expires_at": "2026-10-30T09:03:46.94252613Z",
  "refresh_token": "XjmrCWgktRomXe9lm3C_lJE3ajN8O5eQ-2pdReg-FaU",
  "refresh_expires_at": "2026-11-29T08:48:46.942019742Z",
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
  "phone": "+380690843752",
  "device_ref": "sandbox-9019"
}
```

```json
{
  "challenge_id": "3b6443cf-422b-40fa-8f08-ce390633694a",
  "expires_at": "2026-10-30T08:53:47.502805631Z",
  "resend_available_at": "2026-10-30T08:48:48.502805631Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380690843752` → **200**

```json
{
  "phone": "+380690843752",
  "audience": "CLIENT",
  "code": "680064",
  "sent_at": "2026-10-30T08:48:47.505491361Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3b6443cf-422b-40fa-8f08-ce390633694a",
  "code": "680064",
  "device_ref": "sandbox-9019"
}
```

```json
{
  "session_id": "3ea30788-3e67-4548-bd5b-37b6834270b0",
  "subject": {
    "type": "CLIENT",
    "id": "a1aa85c1-7fa7-4174-b892-d8683176f83d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMWFhODVjMS03ZmE3LTQxNzQtYjg5Mi1kODY4MzE3NmY4M2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxMDI3LCJpYXQiOjE3OTMzNTAxMjcsImp0aSI6IjhkMGQwOTczLTg1OTktNDE1OS05YWJlLTRhYTc0NGE5YjI5MyIsInNpZCI6IjNlYTMwNzg4LTNlNjctNDU0OC1iZDViLTM3YjY4MzQyNzBiMCJ9.PeCIlR1erFaAQGbjsoM3rh9oUcq8C1a0TdS9zFcL3kw",
  "access_expires_at": "2026-10-30T09:03:47.806861387Z",
  "refresh_token": "B6TdEGJshi-opwCJgEAgxmytNmNAq0br7D7Vv9Z9cYQ",
  "refresh_expires_at": "2026-11-29T08:48:47.806357343Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e558c816-550d-45fd-80fb-efd5eb163407",
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
  "id": "66e9d756-5913-43e9-9327-fe79e224384d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:53:48.081987Z",
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
  "command_id": "8fd6772e-60be-4b74-b8f2-6c3bd8d01704",
  "quote_id": "66e9d756-5913-43e9-9327-fe79e224384d",
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
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
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
  "blizz_sms_sent_total": 76
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="BROADCAST"} 1
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 11.650739339
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 17
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 14.316262398
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.172964699
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
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 69.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/6a4fb6de-ac73-4edb-8e60-6cd575d0b58f` → **200**

```json
{
  "id": "6a4fb6de-ac73-4edb-8e60-6cd575d0b58f",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a1aa85c1-7fa7-4174-b892-d8683176f83d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:48:48.379376Z",
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
  "session_id": "14eb5ce7-f828-412a-a329-3ff813c57923",
  "subject": {
    "type": "STAFF",
    "id": "5d6c2743-93ae-43b8-b1f1-13f213963e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDZjMjc0My05M2FlLTQzYjgtYjFmMS0xM2YyMTM5NjNlNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTEyMTAsImlhdCI6MTc5MzM1MDMxMCwianRpIjoiNDg0Y2YyODctNmI4Yi00Y2YzLTlkN2QtOGNiODY3NDVjNmFjIiwic2lkIjoiMTRlYjVjZTctZjgyOC00MTJhLWEzMjktM2ZmODEzYzU3OTIzIn0.i5vXL7swLDNLzAL89S_tMG7Gg8u4e19SYXz0ApLTUqY",
  "access_expires_at": "2026-10-30T09:06:50.115680615Z",
  "refresh_token": "dsJybH9s1Erd9h4cvgOBDXkp0_jgjATkhg48nJBwc8A",
  "refresh_expires_at": "2026-10-30T20:51:50.115129724Z",
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
  "id": "aa6159fb-74ef-46a9-9db5-07144e22e993",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:51:50.42556Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:51:50.425594Z",
  "updated_at": "2026-10-30T08:51:50.441811Z",
  "finished_at": "2026-10-30T08:51:50.441811Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/aa6159fb-74ef-46a9-9db5-07144e22e993` → **200**

```json
{
  "run": {
    "id": "aa6159fb-74ef-46a9-9db5-07144e22e993",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T08:51:50.42556Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T08:51:50.425594Z",
    "updated_at": "2026-10-30T08:51:50.441811Z",
    "finished_at": "2026-10-30T08:51:50.441811Z",
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
  "id": "aa6159fb-74ef-46a9-9db5-07144e22e993",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:51:50.42556Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:51:50.425594Z",
  "updated_at": "2026-10-30T08:51:50.441811Z",
  "finished_at": "2026-10-30T08:51:50.441811Z",
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
  "id": "aa6159fb-74ef-46a9-9db5-07144e22e993",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:51:50.42556Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:51:50.425594Z",
  "updated_at": "2026-10-30T08:51:50.441811Z",
  "finished_at": "2026-10-30T08:51:50.441811Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/4db3f47d-ed80-45d4-bede-61e067b2426a` → **204**

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
  "id": "45124f15-f0b1-477f-817b-5672e596a3a3",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:51:50.890413Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:51:50.890471Z",
  "updated_at": "2026-10-30T08:51:50.898451Z",
  "finished_at": "2026-10-30T08:51:50.898451Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/45124f15-f0b1-477f-817b-5672e596a3a3` → **200**

```json
{
  "run": {
    "id": "45124f15-f0b1-477f-817b-5672e596a3a3",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T08:51:50.890413Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T08:51:50.890471Z",
    "updated_at": "2026-10-30T08:51:50.898451Z",
    "finished_at": "2026-10-30T08:51:50.898451Z",
    "version": 1
  },
  "items": [
    {
      "id": "f6b27983-9ae4-4103-ac35-5733bb9ec9e0",
      "run_id": "45124f15-f0b1-477f-817b-5672e596a3a3",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "3f59e51770f3e48b8dedd2185da2249c74d0be330051d7589cf988927ad09014",
      "reference_display": "sandbox-reconciliation-4db3f47d-ed80-45d4-bede-61e067b2426a",
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
      "provider_at": "2026-10-30T08:51:50Z",
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
  "id": "45124f15-f0b1-477f-817b-5672e596a3a3",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:51:50.890413Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:51:50.890471Z",
  "updated_at": "2026-10-30T08:51:50.898451Z",
  "finished_at": "2026-10-30T08:51:50.898451Z",
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
  "id": "45124f15-f0b1-477f-817b-5672e596a3a3",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:51:50.890413Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:51:50.890471Z",
  "updated_at": "2026-10-30T08:51:50.898451Z",
  "finished_at": "2026-10-30T08:51:50.898451Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/f6b27983-9ae4-4103-ac35-5733bb9ec9e0/resolve` → **200**

```json
{
  "command_id": "1fbb2a2e-842a-44e1-9982-f56bdf856e1e",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "f6b27983-9ae4-4103-ac35-5733bb9ec9e0",
  "run_id": "45124f15-f0b1-477f-817b-5672e596a3a3",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "3f59e51770f3e48b8dedd2185da2249c74d0be330051d7589cf988927ad09014",
  "reference_display": "sandbox-reconciliation-4db3f47d-ed80-45d4-bede-61e067b2426a",
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
  "provider_at": "2026-10-30T08:51:50Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
  "resolved_at": "2026-10-30T08:51:51.351333Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/f6b27983-9ae4-4103-ac35-5733bb9ec9e0/resolve` → **200**

```json
{
  "command_id": "1fbb2a2e-842a-44e1-9982-f56bdf856e1e",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "f6b27983-9ae4-4103-ac35-5733bb9ec9e0",
  "run_id": "45124f15-f0b1-477f-817b-5672e596a3a3",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "3f59e51770f3e48b8dedd2185da2249c74d0be330051d7589cf988927ad09014",
  "reference_display": "sandbox-reconciliation-4db3f47d-ed80-45d4-bede-61e067b2426a",
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
  "provider_at": "2026-10-30T08:51:50Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
  "resolved_at": "2026-10-30T08:51:51.351333Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/f6b27983-9ae4-4103-ac35-5733bb9ec9e0/resolve` → **409**

```json
{
  "command_id": "6d1dc366-4257-45f3-9186-4ff9a74d0bcf",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/f6b27983-9ae4-4103-ac35-5733bb9ec9e0/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ceb5c82c-2f3e-4b8d-be78-ea727aa3b50c"
}
```

`GET /api/admin/v1/payment-reconciliations/45124f15-f0b1-477f-817b-5672e596a3a3` → **200**

```json
{
  "run": {
    "id": "45124f15-f0b1-477f-817b-5672e596a3a3",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T08:51:50.890413Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T08:51:50.890471Z",
    "updated_at": "2026-10-30T08:51:51.351333Z",
    "finished_at": "2026-10-30T08:51:50.898451Z",
    "version": 2
  },
  "items": [
    {
      "id": "f6b27983-9ae4-4103-ac35-5733bb9ec9e0",
      "run_id": "45124f15-f0b1-477f-817b-5672e596a3a3",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "3f59e51770f3e48b8dedd2185da2249c74d0be330051d7589cf988927ad09014",
      "reference_display": "sandbox-reconciliation-4db3f47d-ed80-45d4-bede-61e067b2426a",
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
      "provider_at": "2026-10-30T08:51:50Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "5d6c2743-93ae-43b8-b1f1-13f213963e73",
      "resolved_at": "2026-10-30T08:51:51.351333Z",
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
      "id": "45124f15-f0b1-477f-817b-5672e596a3a3",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T08:51:50.890413Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T08:51:50.890471Z",
      "updated_at": "2026-10-30T08:51:51.351333Z",
      "finished_at": "2026-10-30T08:51:50.898451Z",
      "version": 2
    },
    {
      "id": "6f823976-61f9-48fe-959d-2331a216ab96",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T08:43:28.824444Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T08:43:28.824646Z",
      "updated_at": "2026-10-30T08:43:28.830833Z",
      "finished_at": "2026-10-30T08:43:28.830833Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/4db3f47d-ed80-45d4-bede-61e067b2426a` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "45124f15-f0b1-477f-817b-5672e596a3a3",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:51:50.890413Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:51:50.890471Z",
  "updated_at": "2026-10-30T08:51:51.351333Z",
  "finished_at": "2026-10-30T08:51:50.898451Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793350434016E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793350434281E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793350434282E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793350434028E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793350434282E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
