# Sandbox transcript (2026-10-29T14:39:47Z, a009733)

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
  "correlation_id": "a592ad7f-b98c-475a-8fd0-9fb3d74dede3"
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
  "session_id": "3768dc5a-d709-429e-9d3a-0d4b44dbf21f",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU2OTUsImlhdCI6MTc5MzI4NDc5NSwianRpIjoiODJiNTMwZjItODFiNi00NmIyLTk4NTctM2FkOGQ2OGVmMjNlIiwic2lkIjoiMzc2OGRjNWEtZDcwOS00MjllLTlkM2EtMGQ0YjQ0ZGJmMjFmIn0.G9EdUqEIvnv0I84URVA-_4-UyPlVOsOHGq_1tdFDAWs",
  "access_expires_at": "2026-10-29T14:54:55.064622158Z",
  "refresh_token": "Oo_M3nBXPW0_6mB13he3msTeqGyoSqKw8OcTfs_kQ0c",
  "refresh_expires_at": "2026-10-30T02:39:55.062149964Z",
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
  "session_id": "e515fb0b-0dba-4552-a0bd-77346ab547b5",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU2OTYsImlhdCI6MTc5MzI4NDc5NiwianRpIjoiNGE0YjFiMjktNTM1Ni00MTYzLTgyYjMtZTcwZTQ0OGRmMDM1Iiwic2lkIjoiZTUxNWZiMGItMGRiYS00NTUyLWEwYmQtNzczNDZhYjU0N2I1In0.-a2TIi8Dkb-PM91SLiC-FnF-UZ45dtxnlCs1EVL391Y",
  "access_expires_at": "2026-10-29T14:54:56.918833741Z",
  "refresh_token": "js89NB2G4c6wskIxEyqrcODpL_ODzUo7jsaqQhmw-sU",
  "refresh_expires_at": "2026-10-30T02:39:56.917864095Z",
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
  "device_ref": "sandbox-22814"
}
```

```json
{
  "challenge_id": "47dbf45c-f120-4585-9868-45effe17b2a2",
  "expires_at": "2026-10-29T14:44:57.550606064Z",
  "resend_available_at": "2026-10-29T14:39:58.550606064Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "607724",
  "sent_at": "2026-10-29T14:39:57.56383777Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "47dbf45c-f120-4585-9868-45effe17b2a2",
  "code": "607724",
  "device_ref": "sandbox-22814"
}
```

```json
{
  "session_id": "b24e3cf0-269a-445e-a674-00e8e59909c0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTY5NywiaWF0IjoxNzkzMjg0Nzk3LCJqdGkiOiI1ZTg0NzU3Yy04Y2JlLTQ1OWMtYTFlNy1jOGJkN2VkYzI2MTkiLCJzaWQiOiJiMjRlM2NmMC0yNjlhLTQ0NWUtYTY3NC0wMGU4ZTU5OTA5YzAifQ.22xfxEmO1FYMMjCLvpNcZUu98-Ozl_dS0ZGlb9ov5cg",
  "access_expires_at": "2026-10-29T14:54:57.901641184Z",
  "refresh_token": "HSrJ1KqQHJlNM7qlfpqiDUhnQX1uF_MDJRq5D40xAB8",
  "refresh_expires_at": "2026-11-28T14:39:57.900555971Z",
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
  "command_id": "aec28ec1-d1e0-4538-80b0-66582cddd608",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:39:58Z",
    "sequence": 1793284798482
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bf20f824-0394-4cbe-a682-be1dcc168529",
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
  "last_heartbeat_at": "2026-10-29T14:39:58.680897Z",
  "last_location_at": "2026-10-29T14:39:58.680897Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631537900",
  "device_ref": "sandbox-28716"
}
```

```json
{
  "challenge_id": "c0643a46-95f0-4e4a-b756-252b33010b9c",
  "expires_at": "2026-10-29T14:44:58.974106644Z",
  "resend_available_at": "2026-10-29T14:39:59.974106644Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631537900` → **200**

```json
{
  "phone": "+380631537900",
  "audience": "CLIENT",
  "code": "689869",
  "sent_at": "2026-10-29T14:39:58.979236403Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c0643a46-95f0-4e4a-b756-252b33010b9c",
  "code": "689869",
  "device_ref": "sandbox-28716"
}
```

```json
{
  "session_id": "0b8a2285-2b68-4c8e-817a-9929fd52d643",
  "subject": {
    "type": "CLIENT",
    "id": "8229ef4e-0440-4c67-a6b5-0fd004b30c6f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MjI5ZWY0ZS0wNDQwLTRjNjctYTZiNS0wZmQwMDRiMzBjNmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1Njk5LCJpYXQiOjE3OTMyODQ3OTksImp0aSI6ImFkMzQ4Njc3LTUwODAtNDRlNy04NjIxLTkxYmFhZDFkZWJiZCIsInNpZCI6IjBiOGEyMjg1LTJiNjgtNGM4ZS04MTdhLTk5MjlmZDUyZDY0MyJ9.cjSOdTNtUL27reX1bKvRcL3zfC2GYJ9hT9uIkCe_p_Y",
  "access_expires_at": "2026-10-29T14:54:59.292679684Z",
  "refresh_token": "7KmI0h4dMesUy8L50lodw3jbqG52ku3ETzZrFHSt_8k",
  "refresh_expires_at": "2026-11-28T14:39:59.291799686Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9d1588ed-b794-47f7-b1d9-335e940ef02b",
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
  "id": "af35714a-27aa-46ff-83b2-ccab3a95f702",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:44:59.619028Z",
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
  "command_id": "d4ed58b3-5bcc-425e-99e4-45a4272d5113",
  "quote_id": "af35714a-27aa-46ff-83b2-ccab3a95f702",
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
  "id": "c10a20df-2161-4c88-95ab-3fbae91cfb4d",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8229ef4e-0440-4c67-a6b5-0fd004b30c6f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:40:00.021408Z",
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
    "id": "b1b9961d-6b0e-480a-8af9-93640421a0b9",
    "order_id": "c10a20df-2161-4c88-95ab-3fbae91cfb4d",
    "expires_at": "2026-10-29T14:40:15.031974Z",
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

`POST /api/driver/v1/offers/b1b9961d-6b0e-480a-8af9-93640421a0b9/accept` → **200**

```json
{
  "command_id": "f6e6733d-43d6-456f-9f3c-4ef8435fb434"
}
```

```json
{
  "id": "6ebd4192-b6d0-4a6a-8c4c-df0aec9dec17",
  "order_id": "c10a20df-2161-4c88-95ab-3fbae91cfb4d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d07ed68e-05d3-459c-9e9f-9836d5455c9f",
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
  "command_id": "377cde52-6603-432e-b7d5-ce2b4b7f5ba5",
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
  "changed_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T14:40:01.305152953Z"
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
  "id": "d07ed68e-05d3-459c-9e9f-9836d5455c9f",
  "order_id": "c10a20df-2161-4c88-95ab-3fbae91cfb4d",
  "assignment_id": "6ebd4192-b6d0-4a6a-8c4c-df0aec9dec17",
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

`POST /api/driver/v1/work-sessions/bf20f824-0394-4cbe-a682-be1dcc168529/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:02Z",
    "sequence": 1793284802238
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bf20f824-0394-4cbe-a682-be1dcc168529",
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
  "last_heartbeat_at": "2026-10-29T14:40:02.26629Z",
  "last_location_at": "2026-10-29T14:40:02.26629Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d07ed68e-05d3-459c-9e9f-9836d5455c9f/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "a7b836bf-6a18-480d-b14e-03da1fed6628",
  "expected_version": 0
}
```

```json
{
  "id": "d07ed68e-05d3-459c-9e9f-9836d5455c9f",
  "order_id": "c10a20df-2161-4c88-95ab-3fbae91cfb4d",
  "assignment_id": "6ebd4192-b6d0-4a6a-8c4c-df0aec9dec17",
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
  "arrived_at": "2026-10-29T14:40:02.579193Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d07ed68e-05d3-459c-9e9f-9836d5455c9f/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "b9a8385b-7459-4f48-82fd-ffc342f1b2fd",
  "expected_version": 1
}
```

```json
{
  "id": "d07ed68e-05d3-459c-9e9f-9836d5455c9f",
  "order_id": "c10a20df-2161-4c88-95ab-3fbae91cfb4d",
  "assignment_id": "6ebd4192-b6d0-4a6a-8c4c-df0aec9dec17",
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
  "arrived_at": "2026-10-29T14:40:02.579193Z",
  "started_at": "2026-10-29T14:40:02.894643Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d07ed68e-05d3-459c-9e9f-9836d5455c9f/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "59568730-f572-483b-9bf2-1f8fcba94717",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:40:03Z",
  "cash_received": true
}
```

```json
{
  "id": "d07ed68e-05d3-459c-9e9f-9836d5455c9f",
  "order_id": "c10a20df-2161-4c88-95ab-3fbae91cfb4d",
  "assignment_id": "6ebd4192-b6d0-4a6a-8c4c-df0aec9dec17",
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
  "arrived_at": "2026-10-29T14:40:02.579193Z",
  "started_at": "2026-10-29T14:40:02.894643Z",
  "completed_at": "2026-10-29T14:40:03.220441Z",
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
  "session_id": "bf20f824-0394-4cbe-a682-be1dcc168529",
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
  "last_heartbeat_at": "2026-10-29T14:40:02.26629Z",
  "last_location_at": "2026-10-29T14:40:02.26629Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bf20f824-0394-4cbe-a682-be1dcc168529/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "70237885-041f-405a-b2f7-d9dfbd12d3d8",
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
  "command_id": "523d0787-32d7-40f0-8568-46a86be0a3ef",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:04Z",
    "sequence": 1793284804164
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
  "correlation_id": "6f607660-c27e-476b-9070-2772a3935464",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "7acb3fc8-0751-4ded-836d-dc7a339becce",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:04Z",
    "sequence": 1793284804480
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ffc8d465-2ea1-4355-ac27-b24c63168ad4",
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
  "last_heartbeat_at": "2026-10-29T14:40:04.502392Z",
  "last_location_at": "2026-10-29T14:40:04.502392Z",
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
  "changed_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T14:40:01.305153Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "0db9c572-c8a6-4022-933e-4a85b31f2b4b",
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
  "changed_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T14:40:05.105831278Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ffc8d465-2ea1-4355-ac27-b24c63168ad4",
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
  "last_heartbeat_at": "2026-10-29T14:40:04.502392Z",
  "last_location_at": "2026-10-29T14:40:04.502392Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ffc8d465-2ea1-4355-ac27-b24c63168ad4/close` → **200**

```json
{
  "command_id": "c8586440-4df3-4ae7-9f9f-136f372fe7da",
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
  "session_id": "40e184a9-a4ba-4d36-9dcc-3fe6a91fefe7",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3MDYsImlhdCI6MTc5MzI4NDgwNiwianRpIjoiOWU3ZGM0MTYtNmUyYi00NmM5LTgyNmMtYjA5NjYxZjM5NzhhIiwic2lkIjoiNDBlMTg0YTktYTRiYS00ZDM2LTlkY2MtM2ZlNmE5MWZlZmU3In0.qsiHnx8nDWumMrcXw9Mrk1Bcv8tRtPBAvOypXgMHQ0I",
  "access_expires_at": "2026-10-29T14:55:06.312742571Z",
  "refresh_token": "bm_jwFXeJbkoo8kxdeJVus-fOuYVSpMM3cjMBKD1VE0",
  "refresh_expires_at": "2026-10-30T02:40:06.311945105Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "631ebbbe-6dbc-4bbf-a6be-9198f2808a76",
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
  "id": "9a4e7c82-8962-4608-b97b-f036975f3fc5",
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
  "created_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
  "created_at": "2026-10-29T14:40:06.619886Z",
  "updated_at": "2026-10-29T14:40:06.619886Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632970531",
  "device_ref": "sandbox-11835"
}
```

```json
{
  "challenge_id": "6164f6fe-bd1a-40ae-afb9-8150ac9157dd",
  "expires_at": "2026-10-29T14:45:06.928700013Z",
  "resend_available_at": "2026-10-29T14:40:07.928700013Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632970531` → **200**

```json
{
  "phone": "+380632970531",
  "audience": "CLIENT",
  "code": "093358",
  "sent_at": "2026-10-29T14:40:06.932906619Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6164f6fe-bd1a-40ae-afb9-8150ac9157dd",
  "code": "093358",
  "device_ref": "sandbox-11835"
}
```

```json
{
  "session_id": "904c1835-bd00-46ad-972c-36b8d51d0970",
  "subject": {
    "type": "CLIENT",
    "id": "8fc5c942-a5d8-4bdf-91cc-14f9d3a94b5e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmM1Yzk0Mi1hNWQ4LTRiZGYtOTFjYy0xNGY5ZDNhOTRiNWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1NzA3LCJpYXQiOjE3OTMyODQ4MDcsImp0aSI6IjUyMTdhYmQwLWYzMGItNGVlNS05NTMzLThmNDU2N2NjOGQ1NiIsInNpZCI6IjkwNGMxODM1LWJkMDAtNDZhZC05NzJjLTM2YjhkNTFkMDk3MCJ9.9IVbdrC5RuAQ5HF7d26MS190lpgr75d-NNoiI3RvMtk",
  "access_expires_at": "2026-10-29T14:55:07.250368829Z",
  "refresh_token": "qBbiQYkpkItreuGD4nv0PJcHO61KPfU4BIVaJabXHns",
  "refresh_expires_at": "2026-11-28T14:40:07.249612916Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380632970531` → **200**

```json
{
  "client_id": "8fc5c942-a5d8-4bdf-91cc-14f9d3a94b5e"
}
```

`POST /api/admin/v1/rider-wallets/8fc5c942-a5d8-4bdf-91cc-14f9d3a94b5e/top-ups` → **201**

```json
{
  "command_id": "b68f46ec-76f8-4f93-96f7-8e27de2262a8",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "8fc5c942-a5d8-4bdf-91cc-14f9d3a94b5e",
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
      "id": "0bcf8fca-4a0a-4e7f-beb5-cce67d047a37",
      "at": "2026-10-29T14:40:07.835523Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "377508ca-edc8-41c6-8ba0-33415eb74afb",
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
  "id": "28e02d1d-d3e2-403f-8471-79f1fa5aed40",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:45:08.149579Z",
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
      "id": "9a4e7c82-8962-4608-b97b-f036975f3fc5",
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
  "device_ref": "sandbox-22942"
}
```

```json
{
  "challenge_id": "933b76b2-2654-44b0-81b2-b04b6e4a6e9d",
  "expires_at": "2026-10-29T14:45:08.442036208Z",
  "resend_available_at": "2026-10-29T14:40:09.442036208Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "278338",
  "sent_at": "2026-10-29T14:40:08.446244087Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "933b76b2-2654-44b0-81b2-b04b6e4a6e9d",
  "code": "278338",
  "device_ref": "sandbox-22942"
}
```

```json
{
  "session_id": "a817640a-c01e-4cd2-a588-43aa1fb8ab13",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTcwOCwiaWF0IjoxNzkzMjg0ODA4LCJqdGkiOiI2ZTdhNzE0Mi03OGMwLTRjOTgtOTc2MS1hZGIyMTY0MTc0MDAiLCJzaWQiOiJhODE3NjQwYS1jMDFlLTRjZDItYTU4OC00M2FhMWZiOGFiMTMifQ.8mEXhzcj_Hp6vW0W7Fs8BlzYHsATsI3pCGHZu6Satf0",
  "access_expires_at": "2026-10-29T14:55:08.75509966Z",
  "refresh_token": "Ols8qXTZR92aceM3nXT_YeoCQWjJvv2g6Z0WxvtPoLc",
  "refresh_expires_at": "2026-11-28T14:40:08.754432548Z",
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
  "command_id": "7016e3d4-d988-494c-850e-fd3649cef02f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:09Z",
    "sequence": 1793284809326
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ee1921a-8bfb-4975-982f-a88006c9fef3",
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
  "last_heartbeat_at": "2026-10-29T14:40:09.34754Z",
  "last_location_at": "2026-10-29T14:40:09.34754Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "86b3865d-d888-4924-9f50-4001fc4c14fc",
  "quote_id": "28e02d1d-d3e2-403f-8471-79f1fa5aed40",
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
  "id": "c21ef961-6fb2-44ba-9866-bc846508c0af",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8fc5c942-a5d8-4bdf-91cc-14f9d3a94b5e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:40:09.646629Z",
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
  "client_id": "8fc5c942-a5d8-4bdf-91cc-14f9d3a94b5e",
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
      "id": "0bcf8fca-4a0a-4e7f-beb5-cce67d047a37",
      "at": "2026-10-29T14:40:07.835523Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
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
    "id": "66df738a-5f92-479e-9db5-9ef4219b71c9",
    "order_id": "c21ef961-6fb2-44ba-9866-bc846508c0af",
    "expires_at": "2026-10-29T14:40:24.655748Z",
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

`POST /api/driver/v1/offers/66df738a-5f92-479e-9db5-9ef4219b71c9/accept` → **200**

```json
{
  "command_id": "cfcc393a-586a-421d-8676-3a86b2b51584"
}
```

```json
{
  "id": "cd179d99-b9e1-4d02-b965-fdf0cb16640e",
  "order_id": "c21ef961-6fb2-44ba-9866-bc846508c0af",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "961a3ac6-c41b-4703-9e73-777fefcb79e9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "961a3ac6-c41b-4703-9e73-777fefcb79e9",
  "order_id": "c21ef961-6fb2-44ba-9866-bc846508c0af",
  "assignment_id": "cd179d99-b9e1-4d02-b965-fdf0cb16640e",
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

`POST /api/driver/v1/work-sessions/2ee1921a-8bfb-4975-982f-a88006c9fef3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:11Z",
    "sequence": 1793284811117
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ee1921a-8bfb-4975-982f-a88006c9fef3",
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
  "last_heartbeat_at": "2026-10-29T14:40:11.139211Z",
  "last_location_at": "2026-10-29T14:40:11.139211Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/961a3ac6-c41b-4703-9e73-777fefcb79e9/arrive` → **200**

```json
{
  "command_id": "710d1b1b-6df0-494a-9ba3-084fdc74f77f",
  "expected_version": 0
}
```

```json
{
  "id": "961a3ac6-c41b-4703-9e73-777fefcb79e9",
  "order_id": "c21ef961-6fb2-44ba-9866-bc846508c0af",
  "assignment_id": "cd179d99-b9e1-4d02-b965-fdf0cb16640e",
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
  "arrived_at": "2026-10-29T14:40:11.43429Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/961a3ac6-c41b-4703-9e73-777fefcb79e9/start` → **200**

```json
{
  "command_id": "191e7924-6976-43fa-88a3-519d84bc6bd3",
  "expected_version": 1
}
```

```json
{
  "id": "961a3ac6-c41b-4703-9e73-777fefcb79e9",
  "order_id": "c21ef961-6fb2-44ba-9866-bc846508c0af",
  "assignment_id": "cd179d99-b9e1-4d02-b965-fdf0cb16640e",
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
  "arrived_at": "2026-10-29T14:40:11.43429Z",
  "started_at": "2026-10-29T14:40:11.750709Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/961a3ac6-c41b-4703-9e73-777fefcb79e9/complete` → **200**

```json
{
  "command_id": "742b260e-826c-4dcb-a63e-fb30c1de5d87",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:40:12Z",
  "cash_received": true
}
```

```json
{
  "id": "961a3ac6-c41b-4703-9e73-777fefcb79e9",
  "order_id": "c21ef961-6fb2-44ba-9866-bc846508c0af",
  "assignment_id": "cd179d99-b9e1-4d02-b965-fdf0cb16640e",
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
  "arrived_at": "2026-10-29T14:40:11.43429Z",
  "started_at": "2026-10-29T14:40:11.750709Z",
  "completed_at": "2026-10-29T14:40:12.091811Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "8fc5c942-a5d8-4bdf-91cc-14f9d3a94b5e",
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
      "id": "d23328e1-d463-42e1-b071-f1508c8245be",
      "at": "2026-10-29T14:40:12.888945Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "c21ef961-6fb2-44ba-9866-bc846508c0af"
    },
    {
      "id": "0bcf8fca-4a0a-4e7f-beb5-cce67d047a37",
      "at": "2026-10-29T14:40:07.835523Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/9a4e7c82-8962-4608-b97b-f036975f3fc5/archive` → **200**

```json
{
  "command_id": "3cff9267-8eed-43a5-9ffd-376e169fe56f",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "9a4e7c82-8962-4608-b97b-f036975f3fc5",
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
  "created_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
  "created_at": "2026-10-29T14:40:06.619886Z",
  "updated_at": "2026-10-29T14:40:15.753634Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ee1921a-8bfb-4975-982f-a88006c9fef3",
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
  "last_heartbeat_at": "2026-10-29T14:40:11.139211Z",
  "last_location_at": "2026-10-29T14:40:11.139211Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2ee1921a-8bfb-4975-982f-a88006c9fef3/close` → **200**

```json
{
  "command_id": "3246c071-b3a3-43c0-94ca-36c94367b513",
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

Done: order c21ef961-6fb2-44ba-9866-bc846508c0af.

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
  "session_id": "f718a9ed-098c-49f0-a4e3-963e45bacfcb",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3MTYsImlhdCI6MTc5MzI4NDgxNiwianRpIjoiNTI4NDBhNWYtYzBjMC00MmQ4LWEwZTktMWQyY2YwOGNkZmE0Iiwic2lkIjoiZjcxOGE5ZWQtMDk4Yy00OWYwLWE0ZTMtOTYzZTQ1YmFjZmNiIn0.eUt-zQcJOW-NOvZ8u1oqf0vHzK3Tsa5ul_vA6hIQTjo",
  "access_expires_at": "2026-10-29T14:55:16.954020539Z",
  "refresh_token": "Q32hPSMaXAEPBa1gevi-Ea-jKOk69YiW38s8LukPmLw",
  "refresh_expires_at": "2026-10-30T02:40:16.95328545Z",
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
  "command_id": "4f51285e-b66c-4d3c-9d3c-c9e562208967",
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
  "session_id": "ac8becb8-17cb-443a-902c-5963260587d4",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3MTgsImlhdCI6MTc5MzI4NDgxOCwianRpIjoiNTZkMjM5MjQtMGMwNi00YTU5LTk3MTEtNWVhN2U5OTU0YTI5Iiwic2lkIjoiYWM4YmVjYjgtMTdjYi00NDNhLTkwMmMtNTk2MzI2MDU4N2Q0In0.z90EqAQRa-1vfY3rSmph4wDIcEkn_ecmYbTKVw7NJSc",
  "access_expires_at": "2026-10-29T14:55:18.148826467Z",
  "refresh_token": "3xxnDWAbfcVTtyAU_m8Qfo-peISqpFV5ZLF142Z7-hg",
  "refresh_expires_at": "2026-10-30T02:40:18.148154316Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.907225787",
    "linkedid": "1730052700.907225787",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672755316"
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
    "id": "1730052700.907225787",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "ff21c178-d3e0-4744-9ef4-1d60d5c436d4",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380672755316",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T14:40:18.438695Z",
      "answered_at": null,
      "ended_at": "2026-10-29T14:40:18.464687Z",
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
    "id": "1730052600.3056127298",
    "linkedid": "1730052600.3056127298",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672755316"
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
      "id": "7a0dba4c-74c1-40db-93a4-db72bc08aa1d",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672755316",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T14:40:18.82557Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/7a0dba4c-74c1-40db-93a4-db72bc08aa1d/answer` → **200**

```json
{
  "command_id": "74b6ea9a-67c9-415c-8c28-dae75f6e24fb"
}
```

```json
{
  "id": "7a0dba4c-74c1-40db-93a4-db72bc08aa1d",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672755316",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
  "order_ids": [],
  "started_at": "2026-10-29T14:40:18.82557Z",
  "answered_at": "2026-10-29T14:40:19.152143Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.3056127298",
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
    "id": "1730052600.3056127298",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "7a0dba4c-74c1-40db-93a4-db72bc08aa1d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672755316",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
      "order_ids": [],
      "started_at": "2026-10-29T14:40:18.82557Z",
      "answered_at": "2026-10-29T14:40:19.152143Z",
      "ended_at": "2026-10-29T14:40:19.456649Z",
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
      "id": "7a0dba4c-74c1-40db-93a4-db72bc08aa1d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672755316",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
      "order_ids": [],
      "started_at": "2026-10-29T14:40:18.82557Z",
      "answered_at": "2026-10-29T14:40:19.152143Z",
      "ended_at": "2026-10-29T14:40:19.456649Z",
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
      "id": "7a0dba4c-74c1-40db-93a4-db72bc08aa1d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672755316",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
      "order_ids": [],
      "started_at": "2026-10-29T14:40:18.82557Z",
      "answered_at": "2026-10-29T14:40:19.152143Z",
      "ended_at": "2026-10-29T14:40:19.456649Z",
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
      "id": "7a0dba4c-74c1-40db-93a4-db72bc08aa1d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672755316",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
      "order_ids": [],
      "started_at": "2026-10-29T14:40:18.82557Z",
      "answered_at": "2026-10-29T14:40:19.152143Z",
      "ended_at": "2026-10-29T14:40:19.456649Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:40:25.630514Z"
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
      "id": "7a0dba4c-74c1-40db-93a4-db72bc08aa1d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672755316",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
      "order_ids": [],
      "started_at": "2026-10-29T14:40:18.82557Z",
      "answered_at": "2026-10-29T14:40:19.152143Z",
      "ended_at": "2026-10-29T14:40:19.456649Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:40:25.630514Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/7a0dba4c-74c1-40db-93a4-db72bc08aa1d/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/7a0dba4c-74c1-40db-93a4-db72bc08aa1d/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=7a0dba4c-74c1-40db-93a4-db72bc08aa1d` → **200**

```json
{
  "changes": [
    {
      "id": "18aca7c9-5584-4579-afa5-3a98b7939f48",
      "occurred_at": "2026-10-29T14:40:27.012402Z",
      "actor_type": "STAFF",
      "actor_id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "7a0dba4c-74c1-40db-93a4-db72bc08aa1d",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"f77a5981-de1c-4a74-b36d-304a49d2d33a\", \"order_ids\": []}",
      "correlation_id": "71b277cb-8ea2-4562-97dc-6a1fc8cadf85"
    },
    {
      "id": "8248795e-be87-46dd-afe9-078f83815c44",
      "occurred_at": "2026-10-29T14:40:26.976824Z",
      "actor_type": "STAFF",
      "actor_id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "7a0dba4c-74c1-40db-93a4-db72bc08aa1d",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"f77a5981-de1c-4a74-b36d-304a49d2d33a\", \"order_ids\": []}",
      "correlation_id": "7368cc95-a3d8-4e2a-90e3-72f6b9f8e3ab"
    }
  ]
}
```

Done: call 7a0dba4c-74c1-40db-93a4-db72bc08aa1d recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31344"
}
```

```json
{
  "challenge_id": "9b8600f3-873a-4479-8b97-db63a4a26f14",
  "expires_at": "2026-10-29T14:45:27.34787176Z",
  "resend_available_at": "2026-10-29T14:40:28.34787176Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "124159",
  "sent_at": "2026-10-29T14:40:27.35221693Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9b8600f3-873a-4479-8b97-db63a4a26f14",
  "code": "124159",
  "device_ref": "sandbox-31344"
}
```

```json
{
  "session_id": "f6748e73-0dec-4415-97d2-d208a84e1a47",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTcyNywiaWF0IjoxNzkzMjg0ODI3LCJqdGkiOiI0NzNlOWM3NC1jY2VkLTRiZGQtOGFlOC05ZmFkYjViODM5MjUiLCJzaWQiOiJmNjc0OGU3My0wZGVjLTQ0MTUtOTdkMi1kMjA4YTg0ZTFhNDcifQ.xf68ETVcRQUv45FV-jrzvbjAwe8yErNhu3bZG-Zy9Bg",
  "access_expires_at": "2026-10-29T14:55:27.681576941Z",
  "refresh_token": "vVo1lzl5JFuoB4gZ_7soKf02Zy-MylXdVN_oc_0fxMc",
  "refresh_expires_at": "2026-11-28T14:40:27.680916001Z",
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
  "command_id": "4bbec86e-f592-44ab-bfe0-f3579419f9cf",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:28Z",
    "sequence": 1793284828248
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aac436b2-078c-4b63-bca9-24c376f847f0",
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
  "last_heartbeat_at": "2026-10-29T14:40:28.270005Z",
  "last_location_at": "2026-10-29T14:40:28.270005Z",
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
  "session_id": "6eb65355-117e-4b97-acae-d9784e5f9c1f",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3MjgsImlhdCI6MTc5MzI4NDgyOCwianRpIjoiZmZiYzM4OGItYjBhMi00ZWIwLWIwNDItMmZkMTcyZjQ4NjJjIiwic2lkIjoiNmViNjUzNTUtMTE3ZS00Yjk3LWFjYWUtZDk3ODRlNWY5YzFmIn0.0wtc0YsosE-gm8dU_gf7NKHSh_Lz8WjmEV_ffDB1plY",
  "access_expires_at": "2026-10-29T14:55:28.858930936Z",
  "refresh_token": "RiiNCYN6aOwxGd2dOfmGPJ2lxEVtG81nqD_LXufJhjM",
  "refresh_expires_at": "2026-10-30T02:40:28.858223679Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "bc95d28a-6057-4a1e-94de-6e764e4cb1c0",
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
  "id": "12e8a3a1-88d0-4072-a371-f5f3d6c5bf59",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:45:29.166917Z",
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
  "command_id": "ee3414e0-5ad3-4b70-b008-ae3779d19133",
  "quote_id": "12e8a3a1-88d0-4072-a371-f5f3d6c5bf59",
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
    "phone": "+380676762345"
  }
}
```

```json
{
  "id": "f82cf60c-75cb-4a25-b379-9d938e776a84",
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
  "created_at": "2026-10-29T14:40:29.487664Z",
  "caller": {
    "name": "Олена",
    "phone": "+380676762345"
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
    "id": "48512ba3-a38f-4c3b-8283-a916406cb2f3",
    "order_id": "f82cf60c-75cb-4a25-b379-9d938e776a84",
    "expires_at": "2026-10-29T14:40:44.493146Z",
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

`POST /api/driver/v1/offers/48512ba3-a38f-4c3b-8283-a916406cb2f3/accept` → **200**

```json
{
  "command_id": "a5c824fc-aa91-43be-93df-0b4654d53c02"
}
```

```json
{
  "id": "54da6f69-611c-40df-892b-034c57d6d6ec",
  "order_id": "f82cf60c-75cb-4a25-b379-9d938e776a84",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2afb0bd6-9b79-42b0-a860-003f31fc4591",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380676762345` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380676762345` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380676762345` → **200**

```json
[
  {
    "phone": "+380676762345",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:31.789751998Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676762345` → **200**

```json
[
  {
    "phone": "+380676762345",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:31.789751998Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380676762345` → **200**

```json
[
  {
    "phone": "+380676762345",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:31.789751998Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2afb0bd6-9b79-42b0-a860-003f31fc4591",
  "order_id": "f82cf60c-75cb-4a25-b379-9d938e776a84",
  "assignment_id": "54da6f69-611c-40df-892b-034c57d6d6ec",
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
    "phone": "+380676762345"
  }
}
```

`POST /api/driver/v1/work-sessions/aac436b2-078c-4b63-bca9-24c376f847f0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:32Z",
    "sequence": 1793284832849
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aac436b2-078c-4b63-bca9-24c376f847f0",
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
  "last_heartbeat_at": "2026-10-29T14:40:32.869958Z",
  "last_location_at": "2026-10-29T14:40:32.869958Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2afb0bd6-9b79-42b0-a860-003f31fc4591/arrive` → **200**

```json
{
  "command_id": "4430cb25-f578-47ff-8957-fd8311d6b88f",
  "expected_version": 0
}
```

```json
{
  "id": "2afb0bd6-9b79-42b0-a860-003f31fc4591",
  "order_id": "f82cf60c-75cb-4a25-b379-9d938e776a84",
  "assignment_id": "54da6f69-611c-40df-892b-034c57d6d6ec",
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
  "arrived_at": "2026-10-29T14:40:33.178189Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380676762345"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380676762345` → **200**

```json
[
  {
    "phone": "+380676762345",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:31.789751998Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676762345` → **200**

```json
[
  {
    "phone": "+380676762345",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:31.789751998Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676762345` → **200**

```json
[
  {
    "phone": "+380676762345",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:31.789751998Z"
  },
  {
    "phone": "+380676762345",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:34.80092517Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676762345` → **200**

```json
[
  {
    "phone": "+380676762345",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:31.789751998Z"
  },
  {
    "phone": "+380676762345",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:34.80092517Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380676762345` → **200**

```json
[
  {
    "phone": "+380676762345",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:31.789751998Z"
  },
  {
    "phone": "+380676762345",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:34.80092517Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/2afb0bd6-9b79-42b0-a860-003f31fc4591/start` → **200**

```json
{
  "command_id": "c904f21b-e395-4ef9-88b1-eafe1744e0f7",
  "expected_version": 1
}
```

```json
{
  "id": "2afb0bd6-9b79-42b0-a860-003f31fc4591",
  "order_id": "f82cf60c-75cb-4a25-b379-9d938e776a84",
  "assignment_id": "54da6f69-611c-40df-892b-034c57d6d6ec",
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
  "arrived_at": "2026-10-29T14:40:33.178189Z",
  "started_at": "2026-10-29T14:40:35.621255Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380676762345"
  }
}
```

`POST /api/driver/v1/trips/2afb0bd6-9b79-42b0-a860-003f31fc4591/complete` → **200**

```json
{
  "command_id": "8f551eb3-8a5b-402f-967a-9f77e8d71b16",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:40:35Z",
  "cash_received": true
}
```

```json
{
  "id": "2afb0bd6-9b79-42b0-a860-003f31fc4591",
  "order_id": "f82cf60c-75cb-4a25-b379-9d938e776a84",
  "assignment_id": "54da6f69-611c-40df-892b-034c57d6d6ec",
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
  "arrived_at": "2026-10-29T14:40:33.178189Z",
  "started_at": "2026-10-29T14:40:35.621255Z",
  "completed_at": "2026-10-29T14:40:35.932965Z",
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
  "session_id": "aac436b2-078c-4b63-bca9-24c376f847f0",
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
  "last_heartbeat_at": "2026-10-29T14:40:32.869958Z",
  "last_location_at": "2026-10-29T14:40:32.869958Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aac436b2-078c-4b63-bca9-24c376f847f0/close` → **200**

```json
{
  "command_id": "be23bd67-e569-44d6-9384-7d4605bde585",
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
  "phone": "+380639030206",
  "device_ref": "sandbox-11671"
}
```

```json
{
  "challenge_id": "b6571e30-bfb3-4d02-af07-76a64e142c5e",
  "expires_at": "2026-10-29T14:45:36.834030219Z",
  "resend_available_at": "2026-10-29T14:40:37.834030219Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639030206` → **200**

```json
{
  "phone": "+380639030206",
  "audience": "CLIENT",
  "code": "925391",
  "sent_at": "2026-10-29T14:40:36.838239505Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b6571e30-bfb3-4d02-af07-76a64e142c5e",
  "code": "925391",
  "device_ref": "sandbox-11671"
}
```

```json
{
  "session_id": "0ea5e047-2e81-4ccb-b4d1-70c1fe1543f6",
  "subject": {
    "type": "CLIENT",
    "id": "339d59f2-2040-4036-aa3f-9dcc908db75f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMzlkNTlmMi0yMDQwLTQwMzYtYWEzZi05ZGNjOTA4ZGI3NWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1NzM3LCJpYXQiOjE3OTMyODQ4MzcsImp0aSI6ImI3NGJlOTRmLTE3MzItNDcxZi1iNjVlLTZiNjU3OGNkYmEwOCIsInNpZCI6IjBlYTVlMDQ3LTJlODEtNGNjYi1iNGQxLTcwYzFmZTE1NDNmNiJ9.qBB5KqsrS08f6ERmiHgMfyJ5-18qoaVeXLpNb_uoUq8",
  "access_expires_at": "2026-10-29T14:55:37.153840659Z",
  "refresh_token": "_DQxKK9Sw7tl5Fm5CavcdA2JsAGdgZRQMSF14GDY56M",
  "refresh_expires_at": "2026-11-28T14:40:37.15320772Z",
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
  "device_ref": "sandbox-12423"
}
```

```json
{
  "challenge_id": "343a2410-ee4a-4981-9e86-923f4b2d66ab",
  "expires_at": "2026-10-29T14:45:37.715537744Z",
  "resend_available_at": "2026-10-29T14:40:38.715537744Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "716808",
  "sent_at": "2026-10-29T14:40:37.720414968Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "343a2410-ee4a-4981-9e86-923f4b2d66ab",
  "code": "716808",
  "device_ref": "sandbox-12423"
}
```

```json
{
  "session_id": "11199fda-09e4-4162-9a7d-4c658457106c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTczOCwiaWF0IjoxNzkzMjg0ODM4LCJqdGkiOiJmNjE0M2JiZC00MTlmLTQ0N2ItYWZmYy0wYzk3OTcwYjkyNTAiLCJzaWQiOiIxMTE5OWZkYS0wOWU0LTQxNjItOWE3ZC00YzY1ODQ1NzEwNmMifQ.zej1hsSaPxSZKHPKAwhpLMwVcbu7DKw_nrpZlJoVeKE",
  "access_expires_at": "2026-10-29T14:55:38.040375713Z",
  "refresh_token": "WtpAYNvHf5kq1AAs5mP8eP7BlFZ_EiGlEJszsp2Dv8c",
  "refresh_expires_at": "2026-11-28T14:40:38.039773933Z",
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
  "session_id": "ba57cf2d-6153-48e5-b005-ee33ad5747ef",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3MzgsImlhdCI6MTc5MzI4NDgzOCwianRpIjoiM2E3MzE2NGYtNGJhNi00YzQ5LThkODAtMDhlMTJlYzM4MWFmIiwic2lkIjoiYmE1N2NmMmQtNjE1My00OGU1LWIwMDUtZWUzM2FkNTc0N2VmIn0.Y7ygiWZ3Pr4tM5MKax8YJzYYK5HW1BDVN7FRC74TTug",
  "access_expires_at": "2026-10-29T14:55:38.89971846Z",
  "refresh_token": "EVJNNZsSlP0fLTgeLu0_Qx3HEH140Qh6hLhC2_o0o54",
  "refresh_expires_at": "2026-10-30T02:40:38.899131728Z",
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
  "session_id": "355400ed-ca7d-4e96-a761-598585a91975",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3MzksImlhdCI6MTc5MzI4NDgzOSwianRpIjoiY2QyNWNkZTYtOWU0MC00NmM3LWIwYjktM2E1MTBhNDczMWVhIiwic2lkIjoiMzU1NDAwZWQtY2E3ZC00ZTk2LWE3NjEtNTk4NTg1YTkxOTc1In0.pQPyo0R-0z2OHHbeWSA0C7n6qUntVQi7E8NiufarcHg",
  "access_expires_at": "2026-10-29T14:55:39.515515448Z",
  "refresh_token": "3cjqed3CqCAxglRpHoSarStEdJ2Fu1qhIRsiCY-FNmc",
  "refresh_expires_at": "2026-10-30T02:40:39.514821168Z",
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
  "command_id": "8e1c5766-691a-4230-adcb-0553cb383bd4",
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
  "id": "192f42ba-17d7-47e8-8d20-54e84407eaae",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:45:40.130011Z",
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
  "command_id": "f7eb8190-2ea0-4628-b455-5ae9d096634e",
  "quote_id": "192f42ba-17d7-47e8-8d20-54e84407eaae",
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
  "id": "ee8c0649-5d48-47a1-8a3d-3293049ac0a3",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "339d59f2-2040-4036-aa3f-9dcc908db75f",
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
  "created_at": "2026-10-29T14:40:40.428816Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ee8c0649-5d48-47a1-8a3d-3293049ac0a3` → **200**

```json
{
  "id": "ee8c0649-5d48-47a1-8a3d-3293049ac0a3",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "339d59f2-2040-4036-aa3f-9dcc908db75f",
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
  "created_at": "2026-10-29T14:40:40.428816Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ee8c0649-5d48-47a1-8a3d-3293049ac0a3/cancel` → **200**

```json
{
  "command_id": "c622e577-12d8-4de8-8347-0dd621678567",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "ee8c0649-5d48-47a1-8a3d-3293049ac0a3",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "339d59f2-2040-4036-aa3f-9dcc908db75f",
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
  "created_at": "2026-10-29T14:40:40.428816Z",
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
  "command_id": "b70de8fa-13d9-4c4f-b971-a4c717b20a46",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:41Z",
    "sequence": 1793284841661
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a6191e5b-938a-4dac-a18c-a95df1062dab",
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
  "last_heartbeat_at": "2026-10-29T14:40:41.682609Z",
  "last_location_at": "2026-10-29T14:40:41.682609Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-19445"
}
```

```json
{
  "challenge_id": "231fe47f-ce46-46d0-97f3-c523e1ef6fa7",
  "expires_at": "2026-10-29T14:45:41.965800078Z",
  "resend_available_at": "2026-10-29T14:40:42.965800078Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "082522",
  "sent_at": "2026-10-29T14:40:41.969301086Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "231fe47f-ce46-46d0-97f3-c523e1ef6fa7",
  "code": "082522",
  "device_ref": "sandbox-19445"
}
```

```json
{
  "session_id": "d1f4167e-8af8-4a75-a0c3-b8916d50e120",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTc0MiwiaWF0IjoxNzkzMjg0ODQyLCJqdGkiOiI2ZmExMDRiMS04YmU1LTQ5ZjktOWVjZC1iOWIxNDc5NjUyZmIiLCJzaWQiOiJkMWY0MTY3ZS04YWY4LTRhNzUtYTBjMy1iODkxNmQ1MGUxMjAifQ.GnTG4qwBUVT2EUOHuF_w7NG9bYi9M990ljdd0fs6yZI",
  "access_expires_at": "2026-10-29T14:55:42.280468931Z",
  "refresh_token": "GFXuOxwvtR89XLQTkQfjVe8SsqgAM0NAcxk6OyOb9AA",
  "refresh_expires_at": "2026-11-28T14:40:42.27981759Z",
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
  "command_id": "ab8f0003-eac8-437a-a5d9-ec2f4e10c581",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:42Z",
    "sequence": 1793284842857
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "19af53e2-4291-4c6b-ad08-e0a061867d4b",
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
  "last_heartbeat_at": "2026-10-29T14:40:42.87976Z",
  "last_location_at": "2026-10-29T14:40:42.87976Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "832cd3d2-39b9-4a59-834b-0893308ab65d",
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
  "id": "e9cdba41-34dd-45f1-9915-a331e58867cc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:45:43.173702Z",
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
  "command_id": "9560427c-05b1-4a36-b8b4-114841950988",
  "quote_id": "e9cdba41-34dd-45f1-9915-a331e58867cc",
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
  "id": "cb650ff7-231c-4879-b624-508a125d3d41",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "339d59f2-2040-4036-aa3f-9dcc908db75f",
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
  "created_at": "2026-10-29T14:40:43.47652Z",
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
    "id": "e37bf9b3-d3f2-4a0d-b60c-b5dba99a4dfe",
    "order_id": "cb650ff7-231c-4879-b624-508a125d3d41",
    "expires_at": "2026-10-29T14:40:58.480904Z",
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

`POST /api/driver/v1/offers/e37bf9b3-d3f2-4a0d-b60c-b5dba99a4dfe/accept` → **200**

```json
{
  "command_id": "ff2ae876-6e0c-43a6-b34f-000635acfdbe"
}
```

```json
{
  "id": "eefb8e64-aa64-46c8-b967-7b368723c52f",
  "order_id": "cb650ff7-231c-4879-b624-508a125d3d41",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d6935719-a268-4862-9daa-8e0f4fa37784",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d6935719-a268-4862-9daa-8e0f4fa37784",
  "order_id": "cb650ff7-231c-4879-b624-508a125d3d41",
  "assignment_id": "eefb8e64-aa64-46c8-b967-7b368723c52f",
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

`POST /api/driver/v1/trips/d6935719-a268-4862-9daa-8e0f4fa37784/cancel` → **200**

```json
{
  "command_id": "df5780b7-395f-45bd-b668-c57ff9d03b75",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "d6935719-a268-4862-9daa-8e0f4fa37784",
  "order_id": "cb650ff7-231c-4879-b624-508a125d3d41",
  "assignment_id": "eefb8e64-aa64-46c8-b967-7b368723c52f",
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

`GET /api/rider/v1/orders/cb650ff7-231c-4879-b624-508a125d3d41` → **200**

```json
{
  "id": "cb650ff7-231c-4879-b624-508a125d3d41",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "339d59f2-2040-4036-aa3f-9dcc908db75f",
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
    "id": "eefb8e64-aa64-46c8-b967-7b368723c52f",
    "order_id": "cb650ff7-231c-4879-b624-508a125d3d41",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "d6935719-a268-4862-9daa-8e0f4fa37784",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T14:40:43.47652Z",
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
    "id": "82e36aaf-3254-4906-bce7-6b4dd4fe8b04",
    "order_id": "cb650ff7-231c-4879-b624-508a125d3d41",
    "expires_at": "2026-10-29T14:40:59.657422Z",
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

`POST /api/driver/v1/offers/82e36aaf-3254-4906-bce7-6b4dd4fe8b04/accept` → **200**

```json
{
  "command_id": "b6fb396a-f7c5-436f-abc6-7e4faee781dc"
}
```

```json
{
  "id": "31f56caa-aa9e-4f08-ac7a-0febd6869a6c",
  "order_id": "cb650ff7-231c-4879-b624-508a125d3d41",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "864ec7a5-04a0-4c06-85d2-de0a30b3109e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "864ec7a5-04a0-4c06-85d2-de0a30b3109e",
  "order_id": "cb650ff7-231c-4879-b624-508a125d3d41",
  "assignment_id": "31f56caa-aa9e-4f08-ac7a-0febd6869a6c",
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

`POST /api/driver/v1/trips/864ec7a5-04a0-4c06-85d2-de0a30b3109e/cancel` → **200**

```json
{
  "command_id": "f4436af9-34c5-40a9-bbb3-74db48fc05d5",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "864ec7a5-04a0-4c06-85d2-de0a30b3109e",
  "order_id": "cb650ff7-231c-4879-b624-508a125d3d41",
  "assignment_id": "31f56caa-aa9e-4f08-ac7a-0febd6869a6c",
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
    "id": "cb650ff7-231c-4879-b624-508a125d3d41",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T14:40:43.47652Z",
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
    "id": "ee8c0649-5d48-47a1-8a3d-3293049ac0a3",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T14:40:40.428816Z",
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

`GET /api/operator/v1/orders/cb650ff7-231c-4879-b624-508a125d3d41/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:40:43.477265Z",
      "actor": {
        "type": "CLIENT",
        "id": "339d59f2-2040-4036-aa3f-9dcc908db75f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "cb650ff7-231c-4879-b624-508a125d3d41",
        "quote_id": "e9cdba41-34dd-45f1-9915-a331e58867cc",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "88a8a482-4fa0-4d31-b12e-d723a9941358"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:40:43.479928Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "cb650ff7-231c-4879-b624-508a125d3d41",
        "attempt_id": "ffd69439-f31d-413f-bf2d-1cf48ee1a35a",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "88a8a482-4fa0-4d31-b12e-d723a9941358"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:40:43.48723Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e37bf9b3-d3f2-4a0d-b60c-b5dba99a4dfe",
        "order_id": "cb650ff7-231c-4879-b624-508a125d3d41",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "88a8a482-4fa0-4d31-b12e-d723a9941358"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T14:40:44.074907Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "e37bf9b3-d3f2-4a0d-b60c-b5dba99a4dfe",
        "order_id": "cb650ff7-231c-4879-b624-508a125d3d41",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "eefb8e64-aa64-46c8-b967-7b368723c52f"
      },
      "correlation_id": "84ce8839-2558-4282-8a3e-076292c7b93f"
```

Done: orders ee8c0649-5d48-47a1-8a3d-3293049ac0a3, cb650ff7-231c-4879-b624-508a125d3d41.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380730440440",
  "device_ref": "sandbox-3747"
}
```

```json
{
  "challenge_id": "029d4970-b67d-4130-9007-acc052d6a944",
  "expires_at": "2026-10-29T14:45:47.077872408Z",
  "resend_available_at": "2026-10-29T14:40:48.077872408Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380730440440` → **200**

```json
{
  "phone": "+380730440440",
  "audience": "CLIENT",
  "code": "934817",
  "sent_at": "2026-10-29T14:40:47.081473495Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "029d4970-b67d-4130-9007-acc052d6a944",
  "code": "934817",
  "device_ref": "sandbox-3747"
}
```

```json
{
  "session_id": "6d9b310c-e195-48ba-b688-14279a2bd531",
  "subject": {
    "type": "CLIENT",
    "id": "1a6ea1bd-86c9-4bce-8b04-e26b09c5114f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYTZlYTFiZC04NmM5LTRiY2UtOGIwNC1lMjZiMDljNTExNGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1NzQ3LCJpYXQiOjE3OTMyODQ4NDcsImp0aSI6IjhlNTlhZGY5LTRkM2YtNDI1NS1iZmI4LTYwZDViNDY3NjQyOCIsInNpZCI6IjZkOWIzMTBjLWUxOTUtNDhiYS1iNjg4LTE0Mjc5YTJiZDUzMSJ9.pQnDt8v3NcoL34ZNd9aOSRIsT_FytaxpTuWtcnDeB4Y",
  "access_expires_at": "2026-10-29T14:55:47.40063499Z",
  "refresh_token": "I9lY6_Kw8Pd7gK-eoA_3duPVIdRuBb4kAAEOqOnvz-U",
  "refresh_expires_at": "2026-11-28T14:40:47.40005457Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "6443018a-b3c8-4526-bec7-9b5b172717be",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "61a88181-bc8e-4922-a537-a40fd50f699a",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-61a88181-bc8e-4922-a537-a40fd50f699a",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "73fffce9abcbfb56db53c91087b28602",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=61a88181-bc8e-4922-a537-a40fd50f699a",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730440440"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=61a88181-bc8e-4922-a537-a40fd50f699a",
  "expires_at": "2026-10-29T15:10:47.69289Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/61a88181-bc8e-4922-a537-a40fd50f699a` → **200**

```json
{
  "id": "61a88181-bc8e-4922-a537-a40fd50f699a",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T15:10:47.69289Z",
  "card": {
    "id": "0c89bc9c-4682-4522-8f89-f476fa780c6d",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0091",
    "card_type": "Visa",
    "created_at": "2026-10-29T14:40:48.019271Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "0c89bc9c-4682-4522-8f89-f476fa780c6d",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****0091",
      "card_type": "Visa",
      "created_at": "2026-10-29T14:40:48.019271Z"
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
  "device_ref": "sandbox-21910"
}
```

```json
{
  "challenge_id": "2581b8c1-d6ff-4b8b-bf0f-832655d5a795",
  "expires_at": "2026-10-29T14:45:48.62180765Z",
  "resend_available_at": "2026-10-29T14:40:49.62180765Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "334579",
  "sent_at": "2026-10-29T14:40:48.625295634Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2581b8c1-d6ff-4b8b-bf0f-832655d5a795",
  "code": "334579",
  "device_ref": "sandbox-21910"
}
```

```json
{
  "session_id": "718f8485-ccb0-40a0-91fc-5f27d009da56",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTc0OCwiaWF0IjoxNzkzMjg0ODQ4LCJqdGkiOiJjZGE1OWJlNy00NjgxLTQ5ZmItOWEyMS1iN2IyODRhYzIzZjEiLCJzaWQiOiI3MThmODQ4NS1jY2IwLTQwYTAtOTFmYy01ZjI3ZDAwOWRhNTYifQ.lBRCNH0rrsPEqtJx5mrlLd3lK83pfUewm98Ahdm7eFY",
  "access_expires_at": "2026-10-29T14:55:48.933769216Z",
  "refresh_token": "nQph3k6fOh2FMgJewlqVqLYJzMFJSt5Vk35nxi8WlbQ",
  "refresh_expires_at": "2026-11-28T14:40:48.933160556Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "19af53e2-4291-4c6b-ad08-e0a061867d4b",
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
  "last_heartbeat_at": "2026-10-29T14:40:42.87976Z",
  "last_location_at": "2026-10-29T14:40:42.87976Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/19af53e2-4291-4c6b-ad08-e0a061867d4b/handover` → **200**

```json
{
  "command_id": "b964daa7-372e-4873-ba42-ce4dc539f255",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "19af53e2-4291-4c6b-ad08-e0a061867d4b",
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
  "last_heartbeat_at": "2026-10-29T14:40:42.87976Z",
  "last_location_at": "2026-10-29T14:40:42.87976Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/19af53e2-4291-4c6b-ad08-e0a061867d4b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:49Z",
    "sequence": 1793284849794
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "19af53e2-4291-4c6b-ad08-e0a061867d4b",
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
  "last_heartbeat_at": "2026-10-29T14:40:49.813684Z",
  "last_location_at": "2026-10-29T14:40:49.813684Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "048308b6-f307-4953-8b17-741ba16e90b2",
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
  "id": "1ea0bea8-f603-4aaa-a581-39956242e746",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:45:50.138558Z",
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
  "command_id": "ac30ea81-78a1-4a39-9f5a-c9b3992ea8db",
  "quote_id": "1ea0bea8-f603-4aaa-a581-39956242e746",
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
  "id": "ba675574-1d12-4cf8-b901-8d28bc6ef3fe",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1a6ea1bd-86c9-4bce-8b04-e26b09c5114f",
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
  "created_at": "2026-10-29T14:40:50.445656Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ba675574-1d12-4cf8-b901-8d28bc6ef3fe` → **200**

```json
{
  "id": "ba675574-1d12-4cf8-b901-8d28bc6ef3fe",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1a6ea1bd-86c9-4bce-8b04-e26b09c5114f",
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
  "created_at": "2026-10-29T14:40:50.445656Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ba675574-1d12-4cf8-b901-8d28bc6ef3fe` → **200**

```json
{
  "id": "ba675574-1d12-4cf8-b901-8d28bc6ef3fe",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1a6ea1bd-86c9-4bce-8b04-e26b09c5114f",
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
  "created_at": "2026-10-29T14:40:50.445656Z",
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
    "id": "08373566-7ee6-4ead-956b-5e882dd59bf2",
    "order_id": "ba675574-1d12-4cf8-b901-8d28bc6ef3fe",
    "expires_at": "2026-10-29T14:41:06.119019Z",
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

`POST /api/driver/v1/offers/08373566-7ee6-4ead-956b-5e882dd59bf2/accept` → **200**

```json
{
  "command_id": "07ea0e3c-1c9f-47a8-b0cb-7b71cb362cad"
}
```

```json
{
  "id": "37745e81-b494-461b-836a-847ebcf20962",
  "order_id": "ba675574-1d12-4cf8-b901-8d28bc6ef3fe",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b9386b1a-5f93-4320-b507-f38f2ba6581c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b9386b1a-5f93-4320-b507-f38f2ba6581c",
  "order_id": "ba675574-1d12-4cf8-b901-8d28bc6ef3fe",
  "assignment_id": "37745e81-b494-461b-836a-847ebcf20962",
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

`POST /api/driver/v1/work-sessions/19af53e2-4291-4c6b-ad08-e0a061867d4b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:53Z",
    "sequence": 1793284853216
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "19af53e2-4291-4c6b-ad08-e0a061867d4b",
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
  "last_heartbeat_at": "2026-10-29T14:40:53.238552Z",
  "last_location_at": "2026-10-29T14:40:53.238552Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b9386b1a-5f93-4320-b507-f38f2ba6581c/arrive` → **200**

```json
{
  "command_id": "08db7302-1e9d-45d0-81b9-409f5ae314d4",
  "expected_version": 0
}
```

```json
{
  "id": "b9386b1a-5f93-4320-b507-f38f2ba6581c",
  "order_id": "ba675574-1d12-4cf8-b901-8d28bc6ef3fe",
  "assignment_id": "37745e81-b494-461b-836a-847ebcf20962",
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
  "arrived_at": "2026-10-29T14:40:53.531262Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b9386b1a-5f93-4320-b507-f38f2ba6581c/start` → **200**

```json
{
  "command_id": "b56a33b5-e446-46b4-a4ac-1efa1cb78757",
  "expected_version": 1
}
```

```json
{
  "id": "b9386b1a-5f93-4320-b507-f38f2ba6581c",
  "order_id": "ba675574-1d12-4cf8-b901-8d28bc6ef3fe",
  "assignment_id": "37745e81-b494-461b-836a-847ebcf20962",
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
  "arrived_at": "2026-10-29T14:40:53.531262Z",
  "started_at": "2026-10-29T14:40:53.830329Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b9386b1a-5f93-4320-b507-f38f2ba6581c/complete` → **200**

```json
{
  "command_id": "6440c1a2-8e63-4519-9d87-10d70d114416",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:40:54Z",
  "cash_received": true
}
```

```json
{
  "id": "b9386b1a-5f93-4320-b507-f38f2ba6581c",
  "order_id": "ba675574-1d12-4cf8-b901-8d28bc6ef3fe",
  "assignment_id": "37745e81-b494-461b-836a-847ebcf20962",
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
  "arrived_at": "2026-10-29T14:40:53.531262Z",
  "started_at": "2026-10-29T14:40:53.830329Z",
  "completed_at": "2026-10-29T14:40:54.128332Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/ba675574-1d12-4cf8-b901-8d28bc6ef3fe` → **200**

```json
{
  "id": "ba675574-1d12-4cf8-b901-8d28bc6ef3fe",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "1a6ea1bd-86c9-4bce-8b04-e26b09c5114f",
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
    "id": "37745e81-b494-461b-836a-847ebcf20962",
    "order_id": "ba675574-1d12-4cf8-b901-8d28bc6ef3fe",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b9386b1a-5f93-4320-b507-f38f2ba6581c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:40:50.445656Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ba675574-1d12-4cf8-b901-8d28bc6ef3fe` → **200**

```json
{
  "id": "ba675574-1d12-4cf8-b901-8d28bc6ef3fe",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "1a6ea1bd-86c9-4bce-8b04-e26b09c5114f",
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
    "id": "37745e81-b494-461b-836a-847ebcf20962",
    "order_id": "ba675574-1d12-4cf8-b901-8d28bc6ef3fe",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b9386b1a-5f93-4320-b507-f38f2ba6581c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:40:50.445656Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ba675574-1d12-4cf8-b901-8d28bc6ef3fe` → **200**

```json
{
  "id": "ba675574-1d12-4cf8-b901-8d28bc6ef3fe",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "1a6ea1bd-86c9-4bce-8b04-e26b09c5114f",
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
    "id": "37745e81-b494-461b-836a-847ebcf20962",
    "order_id": "ba675574-1d12-4cf8-b901-8d28bc6ef3fe",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b9386b1a-5f93-4320-b507-f38f2ba6581c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:40:50.445656Z",
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

`GET /api/rider/v1/orders/ba675574-1d12-4cf8-b901-8d28bc6ef3fe/tip` → **200**

```json
{
  "order_id": "ba675574-1d12-4cf8-b901-8d28bc6ef3fe",
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
  "available_until": "2026-10-30T14:40:54.128332Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/ba675574-1d12-4cf8-b901-8d28bc6ef3fe/tip` → **201**

```json
{
  "command_id": "84c65dbe-be42-4cec-bab4-1d14e54c12eb",
  "amount_minor": 2500
}
```

```json
{
  "id": "803b5f31-568d-481d-a44b-5477017c99e6",
  "order_id": "ba675574-1d12-4cf8-b901-8d28bc6ef3fe",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T14:40:57.926451Z"
}
```

`GET /api/rider/v1/orders/ba675574-1d12-4cf8-b901-8d28bc6ef3fe/tip` → **200**

```json
{
  "order_id": "ba675574-1d12-4cf8-b901-8d28bc6ef3fe",
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
  "available_until": "2026-10-30T14:40:54.128332Z",
  "open": false,
  "tip": {
    "id": "803b5f31-568d-481d-a44b-5477017c99e6",
    "order_id": "ba675574-1d12-4cf8-b901-8d28bc6ef3fe",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T14:40:57.926451Z"
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
      "id": "29853dc2-d2dd-4ab4-b580-30e5c47b777f",
      "at": "2026-10-29T14:40:54.169926Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ba675574-1d12-4cf8-b901-8d28bc6ef3fe",
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
      "id": "3aae2db3-9076-4ddd-a7f2-4b5537270cc9",
      "at": "2026-10-29T14:40:59.225052Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ba675574-1d12-4cf8-b901-8d28bc6ef3fe",
      "counterpart_id": null
    },
    {
      "id": "29853dc2-d2dd-4ab4-b580-30e5c47b777f",
      "at": "2026-10-29T14:40:54.169926Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ba675574-1d12-4cf8-b901-8d28bc6ef3fe",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1f121a51-4493-44eb-a37c-0e9d315255c0",
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
  "id": "d7de847a-221b-4409-a90c-7cac14fbc079",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:46:00.089576Z",
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
  "session_id": "e26481ec-6058-4c0c-b72a-a115e3d99e1d",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3NjAsImlhdCI6MTc5MzI4NDg2MCwianRpIjoiYTlhYzc3MWEtNjFhMy00ZjE5LTk2ODYtZjIwZDk4MDkwMTk0Iiwic2lkIjoiZTI2NDgxZWMtNjA1OC00YzBjLWI3MmEtYTExNWUzZDk5ZTFkIn0.ap2GDZN2AUlXDOwJHw3udQ7zFvMDO08ezoQAxgct2YE",
  "access_expires_at": "2026-10-29T14:56:00.682633744Z",
  "refresh_token": "C0YY1MNmVsEKeT2SmHxFSY9zXb4DpXJl_JNz_d-su4k",
  "refresh_expires_at": "2026-10-30T02:41:00.682042703Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380730440440` → **200**

```json
{
  "client_id": "1a6ea1bd-86c9-4bce-8b04-e26b09c5114f"
}
```

`POST /api/admin/v1/rider-wallets/1a6ea1bd-86c9-4bce-8b04-e26b09c5114f/top-ups` → **201**

```json
{
  "command_id": "b13a0b50-8274-4d4e-8661-c2ba9f978e1d",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "1a6ea1bd-86c9-4bce-8b04-e26b09c5114f",
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
      "id": "c455aaaa-8216-464b-b1fa-06cc76bea756",
      "at": "2026-10-29T14:41:01.250427Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d48f5894-a2cf-4afc-9d2f-891564db009c",
  "quote_id": "d7de847a-221b-4409-a90c-7cac14fbc079",
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
  "id": "f6870f62-8a83-425f-8ca9-9b5c4acb2080",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1a6ea1bd-86c9-4bce-8b04-e26b09c5114f",
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
  "created_at": "2026-10-29T14:41:01.547676Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6870f62-8a83-425f-8ca9-9b5c4acb2080` → **200**

```json
{
  "id": "f6870f62-8a83-425f-8ca9-9b5c4acb2080",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1a6ea1bd-86c9-4bce-8b04-e26b09c5114f",
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
  "created_at": "2026-10-29T14:41:01.547676Z",
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
    "id": "ee349f2a-0d96-4858-b3b2-41907adc295b",
    "order_id": "f6870f62-8a83-425f-8ca9-9b5c4acb2080",
    "expires_at": "2026-10-29T14:41:16.553299Z",
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

`POST /api/driver/v1/offers/ee349f2a-0d96-4858-b3b2-41907adc295b/accept` → **200**

```json
{
  "command_id": "763dc77f-2161-46a5-a5cb-363aa496dae3"
}
```

```json
{
  "id": "5b25a892-4ab6-4430-a47a-d484fe87293a",
  "order_id": "f6870f62-8a83-425f-8ca9-9b5c4acb2080",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "eed3cec2-688c-442e-8b21-8dc8b1cb3e1d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "eed3cec2-688c-442e-8b21-8dc8b1cb3e1d",
  "order_id": "f6870f62-8a83-425f-8ca9-9b5c4acb2080",
  "assignment_id": "5b25a892-4ab6-4430-a47a-d484fe87293a",
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

`POST /api/driver/v1/work-sessions/19af53e2-4291-4c6b-ad08-e0a061867d4b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:41:03Z",
    "sequence": 1793284863233
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "19af53e2-4291-4c6b-ad08-e0a061867d4b",
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
  "last_heartbeat_at": "2026-10-29T14:41:03.042581Z",
  "last_location_at": "2026-10-29T14:41:03.042581Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/eed3cec2-688c-442e-8b21-8dc8b1cb3e1d/arrive` → **200**

```json
{
  "command_id": "0fc43cbd-1ed8-488e-8c7f-9cfa80c94c07",
  "expected_version": 0
}
```

```json
{
  "id": "eed3cec2-688c-442e-8b21-8dc8b1cb3e1d",
  "order_id": "f6870f62-8a83-425f-8ca9-9b5c4acb2080",
  "assignment_id": "5b25a892-4ab6-4430-a47a-d484fe87293a",
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
  "arrived_at": "2026-10-29T14:41:03.359919Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/eed3cec2-688c-442e-8b21-8dc8b1cb3e1d/start` → **200**

```json
{
  "command_id": "70dbb748-ff51-481a-ab6d-f9c97788b346",
  "expected_version": 1
}
```

```json
{
  "id": "eed3cec2-688c-442e-8b21-8dc8b1cb3e1d",
  "order_id": "f6870f62-8a83-425f-8ca9-9b5c4acb2080",
  "assignment_id": "5b25a892-4ab6-4430-a47a-d484fe87293a",
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
  "arrived_at": "2026-10-29T14:41:03.359919Z",
  "started_at": "2026-10-29T14:41:03.664392Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/eed3cec2-688c-442e-8b21-8dc8b1cb3e1d/complete` → **200**

```json
{
  "command_id": "0da855ba-309c-4371-8715-1ef0c38a1dbd",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:41:03Z",
  "cash_received": true
}
```

```json
{
  "id": "eed3cec2-688c-442e-8b21-8dc8b1cb3e1d",
  "order_id": "f6870f62-8a83-425f-8ca9-9b5c4acb2080",
  "assignment_id": "5b25a892-4ab6-4430-a47a-d484fe87293a",
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
  "arrived_at": "2026-10-29T14:41:03.359919Z",
  "started_at": "2026-10-29T14:41:03.664392Z",
  "completed_at": "2026-10-29T14:41:03.964323Z",
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
  "client_id": "1a6ea1bd-86c9-4bce-8b04-e26b09c5114f",
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
      "id": "c455aaaa-8216-464b-b1fa-06cc76bea756",
      "at": "2026-10-29T14:41:01.250427Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
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
      "balance_minor": 30204,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

## The rider tips 15 % on the same card; all of it goes to Andrii

`GET /api/rider/v1/orders/f6870f62-8a83-425f-8ca9-9b5c4acb2080/tip` → **200**

```json
{
  "order_id": "f6870f62-8a83-425f-8ca9-9b5c4acb2080",
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
  "available_until": "2026-10-30T14:41:03.964323Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/f6870f62-8a83-425f-8ca9-9b5c4acb2080/tip` → **201**

```json
{
  "command_id": "103cff83-cc48-4c46-b9f9-6f0960d97c61",
  "amount_minor": 2500
}
```

```json
{
  "id": "db927335-762e-4ab2-8776-01b150862bbf",
  "order_id": "f6870f62-8a83-425f-8ca9-9b5c4acb2080",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T14:41:05.120708Z"
}
```

`GET /api/rider/v1/orders/f6870f62-8a83-425f-8ca9-9b5c4acb2080/tip` → **200**

```json
{
  "order_id": "f6870f62-8a83-425f-8ca9-9b5c4acb2080",
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
  "available_until": "2026-10-30T14:41:03.964323Z",
  "open": false,
  "tip": {
    "id": "db927335-762e-4ab2-8776-01b150862bbf",
    "order_id": "f6870f62-8a83-425f-8ca9-9b5c4acb2080",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T14:41:05.120708Z"
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
      "balance_minor": 30204
    }
  ],
  "entries": [
    {
      "id": "f82e470e-cc0b-4767-aa72-49540a2894d3",
      "at": "2026-10-29T14:41:04.275385Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f6870f62-8a83-425f-8ca9-9b5c4acb2080",
      "counterpart_id": null
    },
    {
      "id": "3aae2db3-9076-4ddd-a7f2-4b5537270cc9",
      "at": "2026-10-29T14:40:59.225052Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ba675574-1d12-4cf8-b901-8d28bc6ef3fe",
      "counterpart_id": null
    },
    {
      "id": "29853dc2-d2dd-4ab4-b580-30e5c47b777f",
      "at": "2026-10-29T14:40:54.169926Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ba675574-1d12-4cf8-b901-8d28bc6ef3fe",
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
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "cf63f98b-ef19-47ec-aa54-0792011c2d41",
      "at": "2026-10-29T14:41:06.29861Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f6870f62-8a83-425f-8ca9-9b5c4acb2080",
      "counterpart_id": null
    },
    {
      "id": "f82e470e-cc0b-4767-aa72-49540a2894d3",
      "at": "2026-10-29T14:41:04.275385Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f6870f62-8a83-425f-8ca9-9b5c4acb2080",
      "counterpart_id": null
    },
    {
      "id": "3aae2db3-9076-4ddd-a7f2-4b5537270cc9",
      "at": "2026-10-29T14:40:59.225052Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ba675574-1d12-4cf8-b901-8d28bc6ef3fe",
      "counterpart_id": null
    },
    {
      "id": "29853dc2-d2dd-4ab4-b580-30e5c47b777f",
      "at": "2026-10-29T14:40:54.169926Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ba675574-1d12-4cf8-b901-8d28bc6ef3fe",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "19af53e2-4291-4c6b-ad08-e0a061867d4b",
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
  "last_heartbeat_at": "2026-10-29T14:41:03.042581Z",
  "last_location_at": "2026-10-29T14:41:03.042581Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/19af53e2-4291-4c6b-ad08-e0a061867d4b/close` → **200**

```json
{
  "command_id": "02356fe7-2499-4022-9f7e-fb59b997c28e",
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

Done: card order f6870f62-8a83-425f-8ca9-9b5c4acb2080.

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
  "phone": "+380730061599",
  "device_ref": "sandbox-3286"
}
```

```json
{
  "challenge_id": "11e750af-6181-432f-860b-f62e10359481",
  "expires_at": "2026-10-29T14:46:08.128185363Z",
  "resend_available_at": "2026-10-29T14:41:09.128185363Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380730061599` → **200**

```json
{
  "phone": "+380730061599",
  "audience": "CLIENT",
  "code": "979412",
  "sent_at": "2026-10-29T14:41:08.131428283Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "11e750af-6181-432f-860b-f62e10359481",
  "code": "979412",
  "device_ref": "sandbox-3286"
}
```

```json
{
  "session_id": "b43b2554-ef22-46a1-b3eb-324d4e2cdff9",
  "subject": {
    "type": "CLIENT",
    "id": "023cf8f0-6500-4203-8765-55bada2e15d4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjNjZjhmMC02NTAwLTQyMDMtODc2NS01NWJhZGEyZTE1ZDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1NzY4LCJpYXQiOjE3OTMyODQ4NjgsImp0aSI6IjliNWFiZWI3LTUyNTgtNDJkNC04ODhhLTExNjIzNDYxMzcxNyIsInNpZCI6ImI0M2IyNTU0LWVmMjItNDZhMS1iM2ViLTMyNGQ0ZTJjZGZmOSJ9.HpBycXOYRAbe_QkYRXrSnT_u1IAo45jhJX7g2-htgYw",
  "access_expires_at": "2026-10-29T14:56:08.459199281Z",
  "refresh_token": "vnzG2jbTktrQWnfbq9hP2q4c6Kxwm6wBq5OT5naLUgE",
  "refresh_expires_at": "2026-11-28T14:41:08.458547334Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "c4e31ae9-7f5a-4c03-aa69-f05d7556ee4a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "6561873b-b125-4e2f-96c8-595d4673684e",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-6561873b-b125-4e2f-96c8-595d4673684e",
    "orderDate": "1793284868",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "2235324d0f493db2ef562186c3b8417b",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=6561873b-b125-4e2f-96c8-595d4673684e",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730061599"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=6561873b-b125-4e2f-96c8-595d4673684e",
  "created_at": "2026-10-29T14:41:08.751962Z",
  "expires_at": "2026-10-29T15:11:08.751962Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/6561873b-b125-4e2f-96c8-595d4673684e` → **200**

```json
{
  "id": "6561873b-b125-4e2f-96c8-595d4673684e",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T14:41:08.751962Z",
  "expires_at": "2026-10-29T15:11:08.751962Z",
  "completed_at": "2026-10-29T14:41:09.037102Z",
  "masked_pan": "41****1162",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "023cf8f0-6500-4203-8765-55bada2e15d4",
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
      "id": "47ee558d-e4ee-4bf8-a6f9-88476ee0f67d",
      "at": "2026-10-29T14:41:09.331067Z",
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
  "client_id": "023cf8f0-6500-4203-8765-55bada2e15d4",
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
      "id": "47ee558d-e4ee-4bf8-a6f9-88476ee0f67d",
      "at": "2026-10-29T14:41:09.331067Z",
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
  "device_ref": "sandbox-25446"
}
```

```json
{
  "challenge_id": "345d2dda-5d5a-4eab-b1bf-445f6a376092",
  "expires_at": "2026-10-29T14:46:09.917846134Z",
  "resend_available_at": "2026-10-29T14:41:10.917846134Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "764705",
  "sent_at": "2026-10-29T14:41:09.920851499Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "345d2dda-5d5a-4eab-b1bf-445f6a376092",
  "code": "764705",
  "device_ref": "sandbox-25446"
}
```

```json
{
  "session_id": "d7e870b3-9010-4207-983f-b2a7172d5f90",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTc3MCwiaWF0IjoxNzkzMjg0ODcwLCJqdGkiOiJlZjA0MmFlMC02YTU3LTRhZWYtOTMzMC1jZTdkNzNkY2UwYzUiLCJzaWQiOiJkN2U4NzBiMy05MDEwLTQyMDctOTgzZi1iMmE3MTcyZDVmOTAifQ.YQ3_3bcZl1zOfnLxYPgi0EIkXCVjYOfSqjP8aikaU80",
  "access_expires_at": "2026-10-29T14:56:10.244571937Z",
  "refresh_token": "CCyALJaMIr4LI87pt76NeJJm71A5LTonFAHSAbZ1z9I",
  "refresh_expires_at": "2026-11-28T14:41:10.242086615Z",
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
  "command_id": "4f6fb24c-7598-43c6-a0cd-29c8e082e5ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "5cb2849d-0750-476d-a81d-19aea7e086af",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-5cb2849d-0750-476d-a81d-19aea7e086af",
    "orderDate": "1793284870",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "27f534796773fdbc19940de8d412c202",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=5cb2849d-0750-476d-a81d-19aea7e086af",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=5cb2849d-0750-476d-a81d-19aea7e086af",
  "created_at": "2026-10-29T14:41:10.820532Z",
  "expires_at": "2026-10-29T15:11:10.820532Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/5cb2849d-0750-476d-a81d-19aea7e086af` → **200**

```json
{
  "id": "5cb2849d-0750-476d-a81d-19aea7e086af",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T14:41:10.820532Z",
  "expires_at": "2026-10-29T15:11:10.820532Z",
  "completed_at": "2026-10-29T14:41:11.102797Z",
  "masked_pan": "41****1703",
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
      "id": "acae7fad-d68b-443c-8b7c-0a12a09c2d74",
      "at": "2026-10-29T14:41:11.33842Z",
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
  "command_id": "77cb17ed-4a89-40d8-bde1-2f9b51ba1e5d",
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
  "correlation_id": "c918bc2b-e49a-4d99-bce9-74f499ca6f66"
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
  "device_ref": "sandbox-5410"
}
```

```json
{
  "challenge_id": "75e060b2-4700-4e5e-9b09-d8df0ce455eb",
  "expires_at": "2026-10-29T14:46:12.000609202Z",
  "resend_available_at": "2026-10-29T14:41:13.000609202Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "550649",
  "sent_at": "2026-10-29T14:41:12.003491237Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "75e060b2-4700-4e5e-9b09-d8df0ce455eb",
  "code": "550649",
  "device_ref": "sandbox-5410"
}
```

```json
{
  "session_id": "71ff058f-f32a-4308-a770-591396b7781d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTc3MiwiaWF0IjoxNzkzMjg0ODcyLCJqdGkiOiI3NmFiODFjMi0yYjdjLTRhY2MtYTZiZi01N2JlMDgzZGZjODciLCJzaWQiOiI3MWZmMDU4Zi1mMzJhLTQzMDgtYTc3MC01OTEzOTZiNzc4MWQifQ.DUbp06lDhTbztuI3RACCsE2Baq61s_NRn3FU5pvf7_M",
  "access_expires_at": "2026-10-29T14:56:12.312212252Z",
  "refresh_token": "ahtMqSJ37JJxPAVZwxWQ2y0VJqELR2pIAYlFrFkw0Do",
  "refresh_expires_at": "2026-11-28T14:41:12.311668869Z",
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
  "command_id": "d8d5234f-81a4-402e-b163-7181da6e702a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:41:12Z",
    "sequence": 1793284872863
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e0939b1c-c873-4120-9724-50cbea3301e6",
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
  "last_heartbeat_at": "2026-10-29T14:41:12.882892Z",
  "last_location_at": "2026-10-29T14:41:12.882892Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632518717",
  "device_ref": "sandbox-12138"
}
```

```json
{
  "challenge_id": "0df801f9-d6a7-4c32-8ff0-d166a615443e",
  "expires_at": "2026-10-29T14:46:13.169095782Z",
  "resend_available_at": "2026-10-29T14:41:14.169095782Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632518717` → **200**

```json
{
  "phone": "+380632518717",
  "audience": "CLIENT",
  "code": "925263",
  "sent_at": "2026-10-29T14:41:13.171921964Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0df801f9-d6a7-4c32-8ff0-d166a615443e",
  "code": "925263",
  "device_ref": "sandbox-12138"
}
```

```json
{
  "session_id": "26401432-68d0-4b1c-87ba-ad57b33e2433",
  "subject": {
    "type": "CLIENT",
    "id": "2502e5f8-7ed6-453b-9851-b092ea20650d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNTAyZTVmOC03ZWQ2LTQ1M2ItOTg1MS1iMDkyZWEyMDY1MGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1NzczLCJpYXQiOjE3OTMyODQ4NzMsImp0aSI6IjdhOThmZTQ5LWI5YWYtNDU1NC1hMTFkLWEzYjY3YTMxOTZiNiIsInNpZCI6IjI2NDAxNDMyLTY4ZDAtNGIxYy04N2JhLWFkNTdiMzNlMjQzMyJ9.rVNauIuLwwKuepCLf1-i62yo2GTdd0gcn2GUkbZ4AmM",
  "access_expires_at": "2026-10-29T14:56:13.48951164Z",
  "refresh_token": "lDYAiRwjtDM8p7OsLMu3pHCdzhpvOwRs9O2n1qqiV4A",
  "refresh_expires_at": "2026-11-28T14:41:13.488900771Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "07a3e149-dc14-4100-bff3-af46cafd9823",
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
  "id": "41ab671a-c158-4481-bd6c-980ab27e1c49",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:46:13.775177Z",
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
  "command_id": "e8064f7a-c820-4a1e-b421-544c2b6217af",
  "quote_id": "41ab671a-c158-4481-bd6c-980ab27e1c49",
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
  "id": "83b04032-460f-4211-999c-ccf38a8aaf9b",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2502e5f8-7ed6-453b-9851-b092ea20650d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:41:14.075154Z",
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
    "id": "227c4c2c-132d-409b-ab76-c5a7d53ae90f",
    "order_id": "83b04032-460f-4211-999c-ccf38a8aaf9b",
    "expires_at": "2026-10-29T14:41:29.078392Z",
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

`POST /api/driver/v1/offers/227c4c2c-132d-409b-ab76-c5a7d53ae90f/accept` → **200**

```json
{
  "command_id": "f76f8873-6669-4454-8b99-b66d3007dd5a"
}
```

```json
{
  "id": "6ceff5f6-d923-45b1-a6d4-85c493e33b68",
  "order_id": "83b04032-460f-4211-999c-ccf38a8aaf9b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b58c1536-4dcf-469d-aadc-589517626965",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b58c1536-4dcf-469d-aadc-589517626965",
  "order_id": "83b04032-460f-4211-999c-ccf38a8aaf9b",
  "assignment_id": "6ceff5f6-d923-45b1-a6d4-85c493e33b68",
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

`POST /api/driver/v1/work-sessions/e0939b1c-c873-4120-9724-50cbea3301e6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:41:15Z",
    "sequence": 1793284875221
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e0939b1c-c873-4120-9724-50cbea3301e6",
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
  "last_heartbeat_at": "2026-10-29T14:41:15.240177Z",
  "last_location_at": "2026-10-29T14:41:15.240177Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b58c1536-4dcf-469d-aadc-589517626965/arrive` → **200**

```json
{
  "command_id": "dee815ba-b551-4cb0-a039-9fb2765d2668",
  "expected_version": 0
}
```

```json
{
  "id": "b58c1536-4dcf-469d-aadc-589517626965",
  "order_id": "83b04032-460f-4211-999c-ccf38a8aaf9b",
  "assignment_id": "6ceff5f6-d923-45b1-a6d4-85c493e33b68",
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
  "arrived_at": "2026-10-29T14:41:15.535873Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b58c1536-4dcf-469d-aadc-589517626965/start` → **200**

```json
{
  "command_id": "12c73ec6-f586-427e-be41-b25e92171d0d",
  "expected_version": 1
}
```

```json
{
  "id": "b58c1536-4dcf-469d-aadc-589517626965",
  "order_id": "83b04032-460f-4211-999c-ccf38a8aaf9b",
  "assignment_id": "6ceff5f6-d923-45b1-a6d4-85c493e33b68",
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
  "arrived_at": "2026-10-29T14:41:15.535873Z",
  "started_at": "2026-10-29T14:41:15.840461Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b58c1536-4dcf-469d-aadc-589517626965/complete` → **200**

```json
{
  "command_id": "2d816a70-d525-4d36-85ae-7528c1cffebc",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:41:16Z",
  "cash_received": false
}
```

```json
{
  "id": "b58c1536-4dcf-469d-aadc-589517626965",
  "order_id": "83b04032-460f-4211-999c-ccf38a8aaf9b",
  "assignment_id": "6ceff5f6-d923-45b1-a6d4-85c493e33b68",
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
  "arrived_at": "2026-10-29T14:41:15.535873Z",
  "started_at": "2026-10-29T14:41:15.840461Z",
  "completed_at": "2026-10-29T14:41:16.149055Z",
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
  "session_id": "543b90de-e604-4b76-a584-6c5dfd533021",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3NzYsImlhdCI6MTc5MzI4NDg3NiwianRpIjoiNGE0MTBkOTEtYmM3Ny00ZGFmLTkzMzktODM1NGMzNTRiNWQyIiwic2lkIjoiNTQzYjkwZGUtZTYwNC00Yjc2LWE1ODQtNmM1ZGZkNTMzMDIxIn0.mli0bx83fQZkvUM8Qjf_OIHJQIjt7x6x0rVY2njPj0I",
  "access_expires_at": "2026-10-29T14:56:16.752946782Z",
  "refresh_token": "FgXiJz6-xlm_gLSl-R0lvwa2VmcTQ6bHqnOxkeZmdVY",
  "refresh_expires_at": "2026-10-30T02:41:16.752218255Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/83b04032-460f-4211-999c-ccf38a8aaf9b/cash-dispute` → **200**

```json
{
  "order_id": "83b04032-460f-4211-999c-ccf38a8aaf9b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "2502e5f8-7ed6-453b-9851-b092ea20650d",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T14:41:16.3903Z",
  "decide_by": "2026-11-12T14:41:16.3903Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T14:41:16.3903Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "83b04032-460f-4211-999c-ccf38a8aaf9b",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "2502e5f8-7ed6-453b-9851-b092ea20650d",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T14:41:16.3903Z",
      "decide_by": "2026-11-12T14:41:16.3903Z",
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

`POST /api/admin/v1/orders/83b04032-460f-4211-999c-ccf38a8aaf9b/cash-dispute/decide` → **400**

```json
{
  "command_id": "6079f3f3-b176-4cc9-b457-08d54541abc6",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/83b04032-460f-4211-999c-ccf38a8aaf9b/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "9feb15aa-fb95-4ab0-b287-3dbde04d329b",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/83b04032-460f-4211-999c-ccf38a8aaf9b/cash-dispute/decide` → **200**

```json
{
  "command_id": "7e392955-e459-4703-8ac0-9605e3136a95",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "83b04032-460f-4211-999c-ccf38a8aaf9b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "2502e5f8-7ed6-453b-9851-b092ea20650d",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T14:41:16.3903Z",
  "decide_by": "2026-11-12T14:41:16.3903Z",
  "decision": "PAY_DRIVER",
  "decided_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T14:41:17.946697Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/83b04032-460f-4211-999c-ccf38a8aaf9b/cash-dispute/decide` → **409**

```json
{
  "command_id": "056f5193-4816-4c80-bad8-c497ab4405d6",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/83b04032-460f-4211-999c-ccf38a8aaf9b/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "47c39cb6-54c2-4801-8555-e34bfb840f30"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e0939b1c-c873-4120-9724-50cbea3301e6",
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
  "last_heartbeat_at": "2026-10-29T14:41:15.240177Z",
  "last_location_at": "2026-10-29T14:41:15.240177Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e0939b1c-c873-4120-9724-50cbea3301e6/close` → **200**

```json
{
  "command_id": "a80ab059-b7a5-4c0d-ac86-b5371492eaee",
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
  "phone": "+380739225105",
  "device_ref": "sandbox-26880"
}
```

```json
{
  "challenge_id": "4655e0ee-c3cd-4de5-958a-b5da123989dc",
  "expires_at": "2026-10-29T14:46:19.143574162Z",
  "resend_available_at": "2026-10-29T14:41:20.143574162Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739225105` → **200**

```json
{
  "phone": "+380739225105",
  "audience": "CLIENT",
  "code": "552497",
  "sent_at": "2026-10-29T14:41:19.146432819Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4655e0ee-c3cd-4de5-958a-b5da123989dc",
  "code": "552497",
  "device_ref": "sandbox-26880"
}
```

```json
{
  "session_id": "0d6e3818-33d2-4abe-9c0f-fff50f3c38de",
  "subject": {
    "type": "CLIENT",
    "id": "c588cf27-0224-4d22-8990-76c8afcefe71"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNTg4Y2YyNy0wMjI0LTRkMjItODk5MC03NmM4YWZjZWZlNzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1Nzc5LCJpYXQiOjE3OTMyODQ4NzksImp0aSI6ImZhZTc3M2Q5LTc4YWItNDgwZS05YTVhLTViNzBlNmQ4ZTU0NyIsInNpZCI6IjBkNmUzODE4LTMzZDItNGFiZS05YzBmLWZmZjUwZjNjMzhkZSJ9.VVvAnjFa6E25iKnO5E_39-sNKW5Q9LKkJEGDFAqvovc",
  "access_expires_at": "2026-10-29T14:56:19.454811756Z",
  "refresh_token": "eSubpZfwWt-YLua-KLwnwsRGtR96YDNIFl9LhDszmXs",
  "refresh_expires_at": "2026-11-28T14:41:19.454201782Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "81903f81-f100-442b-a0d9-2c478133fa3e",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "16a4f271-260b-4ec1-a976-5b89065a1809",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-16a4f271-260b-4ec1-a976-5b89065a1809",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "e6055ddecccf5ec182da5d5bf5126cfd",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=16a4f271-260b-4ec1-a976-5b89065a1809",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739225105"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=16a4f271-260b-4ec1-a976-5b89065a1809",
  "expires_at": "2026-10-29T15:11:19.751065Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/16a4f271-260b-4ec1-a976-5b89065a1809` → **200**

```json
{
  "id": "16a4f271-260b-4ec1-a976-5b89065a1809",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T15:11:19.751065Z",
  "card": {
    "id": "01fa0f8e-0815-4c58-96b2-e099874a8fed",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0093",
    "card_type": "Visa",
    "created_at": "2026-10-29T14:41:20.056051Z"
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
  "device_ref": "sandbox-2871"
}
```

```json
{
  "challenge_id": "b1bdef1b-ebb8-4f11-bfe9-4175ac942092",
  "expires_at": "2026-10-29T14:46:20.353165862Z",
  "resend_available_at": "2026-10-29T14:41:21.353165862Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "522826",
  "sent_at": "2026-10-29T14:41:20.355961186Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b1bdef1b-ebb8-4f11-bfe9-4175ac942092",
  "code": "522826",
  "device_ref": "sandbox-2871"
}
```

```json
{
  "session_id": "c3a69886-3dee-4018-b6fe-7038d22e72c0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTc4MCwiaWF0IjoxNzkzMjg0ODgwLCJqdGkiOiI5OTBlNGNlYy1hNjg0LTRkNzMtOTYyYy02NDcxZmU5OGFiOTciLCJzaWQiOiJjM2E2OTg4Ni0zZGVlLTQwMTgtYjZmZS03MDM4ZDIyZTcyYzAifQ.8IXHlj1bdBrDO95L25PxvKLK_opISIJjQyFtnXzkTYk",
  "access_expires_at": "2026-10-29T14:56:20.667663535Z",
  "refresh_token": "iM5900fJFY-XK-F0Apda_SJEJfq9dWgQFh7zSbDRCPs",
  "refresh_expires_at": "2026-11-28T14:41:20.667107109Z",
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
  "command_id": "5a6f21d0-c9cf-41f9-aa6c-7751b59dad3f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:41:21Z",
    "sequence": 1793284881236
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ecadb030-d15c-46b3-9a10-c214600d76e6",
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
  "last_heartbeat_at": "2026-10-29T14:41:21.255178Z",
  "last_location_at": "2026-10-29T14:41:21.255178Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3db3ebfa-e12d-4ea2-871b-32b36b2af569",
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
  "id": "7b1f47ba-863c-4c70-ab36-bfe892db4f03",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:46:21.559476Z",
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
  "command_id": "ee1dcd23-71c6-4efd-a485-3285bc7ed379",
  "quote_id": "7b1f47ba-863c-4c70-ab36-bfe892db4f03",
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
  "id": "7d3129ad-003a-4908-833f-bbcf37129873",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c588cf27-0224-4d22-8990-76c8afcefe71",
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
  "created_at": "2026-10-29T14:41:21.867514Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7d3129ad-003a-4908-833f-bbcf37129873` → **200**

```json
{
  "id": "7d3129ad-003a-4908-833f-bbcf37129873",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c588cf27-0224-4d22-8990-76c8afcefe71",
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
  "created_at": "2026-10-29T14:41:21.867514Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7d3129ad-003a-4908-833f-bbcf37129873` → **200**

```json
{
  "id": "7d3129ad-003a-4908-833f-bbcf37129873",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c588cf27-0224-4d22-8990-76c8afcefe71",
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
  "created_at": "2026-10-29T14:41:21.867514Z",
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
    "id": "91acd047-9c2c-41fd-9935-7e0a0af62820",
    "order_id": "7d3129ad-003a-4908-833f-bbcf37129873",
    "expires_at": "2026-10-29T14:41:37.437319Z",
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

`POST /api/driver/v1/offers/91acd047-9c2c-41fd-9935-7e0a0af62820/accept` → **200**

```json
{
  "command_id": "afe42c8c-c74a-4f93-9d85-1f95bdf24057"
}
```

```json
{
  "id": "7a629999-c416-4f04-9764-debdc7c7eabe",
  "order_id": "7d3129ad-003a-4908-833f-bbcf37129873",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "392d67b6-d57c-4227-bf32-b54038504ef9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "392d67b6-d57c-4227-bf32-b54038504ef9",
  "order_id": "7d3129ad-003a-4908-833f-bbcf37129873",
  "assignment_id": "7a629999-c416-4f04-9764-debdc7c7eabe",
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

`POST /api/rider/v1/orders/7d3129ad-003a-4908-833f-bbcf37129873/messages` → **201**

```json
{
  "command_id": "a7ec89ec-cb87-4777-a383-60f018c0299d",
  "body": "Я біля входу, мій номер +380739225105, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "39db3661-a460-4366-840d-e27d00f6fdf2",
  "order_id": "7d3129ad-003a-4908-833f-bbcf37129873",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380739225105, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-29T14:41:24.634369546Z"
}
```

`POST /api/driver/v1/trips/392d67b6-d57c-4227-bf32-b54038504ef9/messages` → **201**

```json
{
  "command_id": "697a12c9-3ffc-4670-8b31-57d8a8af1537",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "1cbbd998-84eb-4ed5-b900-19219d601aab",
  "order_id": "7d3129ad-003a-4908-833f-bbcf37129873",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-29T14:41:24.928069165Z"
}
```

`POST /api/driver/v1/work-sessions/ecadb030-d15c-46b3-9a10-c214600d76e6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:41:25Z",
    "sequence": 1793284885200
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ecadb030-d15c-46b3-9a10-c214600d76e6",
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
  "last_heartbeat_at": "2026-10-29T14:41:25.220079Z",
  "last_location_at": "2026-10-29T14:41:25.220079Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/392d67b6-d57c-4227-bf32-b54038504ef9/arrive` → **200**

```json
{
  "command_id": "bcf31677-5d65-4a4e-ab46-b37200bcdaef",
  "expected_version": 0
}
```

```json
{
  "id": "392d67b6-d57c-4227-bf32-b54038504ef9",
  "order_id": "7d3129ad-003a-4908-833f-bbcf37129873",
  "assignment_id": "7a629999-c416-4f04-9764-debdc7c7eabe",
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
  "arrived_at": "2026-10-29T14:41:25.517414Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/392d67b6-d57c-4227-bf32-b54038504ef9/start` → **200**

```json
{
  "command_id": "61c386d3-71c1-45f7-9a2f-b84b840467f1",
  "expected_version": 1
}
```

```json
{
  "id": "392d67b6-d57c-4227-bf32-b54038504ef9",
  "order_id": "7d3129ad-003a-4908-833f-bbcf37129873",
  "assignment_id": "7a629999-c416-4f04-9764-debdc7c7eabe",
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
  "arrived_at": "2026-10-29T14:41:25.517414Z",
  "started_at": "2026-10-29T14:41:25.830022Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/ecadb030-d15c-46b3-9a10-c214600d76e6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:41:26Z",
    "sequence": 1793284886122
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ecadb030-d15c-46b3-9a10-c214600d76e6",
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
  "last_heartbeat_at": "2026-10-29T14:41:26.140736Z",
  "last_location_at": "2026-10-29T14:41:26.140736Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/392d67b6-d57c-4227-bf32-b54038504ef9/complete` → **200**

```json
{
  "command_id": "9379653e-8684-4be7-a606-4da4d1f961ab",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:41:26Z",
  "cash_received": false
}
```

```json
{
  "id": "392d67b6-d57c-4227-bf32-b54038504ef9",
  "order_id": "7d3129ad-003a-4908-833f-bbcf37129873",
  "assignment_id": "7a629999-c416-4f04-9764-debdc7c7eabe",
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
  "arrived_at": "2026-10-29T14:41:25.517414Z",
  "started_at": "2026-10-29T14:41:25.830022Z",
  "completed_at": "2026-10-29T14:41:26.436548Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/7d3129ad-003a-4908-833f-bbcf37129873` → **200**

```json
{
  "id": "7d3129ad-003a-4908-833f-bbcf37129873",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c588cf27-0224-4d22-8990-76c8afcefe71",
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
    "id": "7a629999-c416-4f04-9764-debdc7c7eabe",
    "order_id": "7d3129ad-003a-4908-833f-bbcf37129873",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "392d67b6-d57c-4227-bf32-b54038504ef9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:41:21.867514Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7d3129ad-003a-4908-833f-bbcf37129873` → **200**

```json
{
  "id": "7d3129ad-003a-4908-833f-bbcf37129873",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c588cf27-0224-4d22-8990-76c8afcefe71",
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
    "id": "7a629999-c416-4f04-9764-debdc7c7eabe",
    "order_id": "7d3129ad-003a-4908-833f-bbcf37129873",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "392d67b6-d57c-4227-bf32-b54038504ef9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:41:21.867514Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7d3129ad-003a-4908-833f-bbcf37129873` → **200**

```json
{
  "id": "7d3129ad-003a-4908-833f-bbcf37129873",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "c588cf27-0224-4d22-8990-76c8afcefe71",
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
    "id": "7a629999-c416-4f04-9764-debdc7c7eabe",
    "order_id": "7d3129ad-003a-4908-833f-bbcf37129873",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "392d67b6-d57c-4227-bf32-b54038504ef9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:41:21.867514Z",
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
  "session_id": "ecadb030-d15c-46b3-9a10-c214600d76e6",
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
  "last_heartbeat_at": "2026-10-29T14:41:26.140736Z",
  "last_location_at": "2026-10-29T14:41:26.140736Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ecadb030-d15c-46b3-9a10-c214600d76e6/close` → **200**

```json
{
  "command_id": "b4d749cf-e175-4beb-904e-b150cb120239",
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
  "session_id": "17488597-c6e7-4f5c-afcc-ddabca914279",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3OTAsImlhdCI6MTc5MzI4NDg5MCwianRpIjoiYjVmOTEyZTAtYmM3ZC00NzA1LTllNTgtMGUwODU3NTgwMWFhIiwic2lkIjoiMTc0ODg1OTctYzZlNy00ZjVjLWFmY2MtZGRhYmNhOTE0Mjc5In0.l-hH7pFY0cbjIdZbDywzpYbgdiPsINWEOQPYc-I21zw",
  "access_expires_at": "2026-10-29T14:56:30.494067296Z",
  "refresh_token": "uJQjkpy-GYTVYnEXR8ZIrersnanTb2_OhtyZ6mPkfJc",
  "refresh_expires_at": "2026-10-30T02:41:30.493518985Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/7d3129ad-003a-4908-833f-bbcf37129873/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/7d3129ad-003a-4908-833f-bbcf37129873/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "67a2da3e-64f5-4983-8cae-938ed4e98276"
}
```

`GET /api/admin/v1/orders/7d3129ad-003a-4908-833f-bbcf37129873/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-29T14:41:31.07021933Z",
  "order": {
    "id": "7d3129ad-003a-4908-833f-bbcf37129873",
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
    "created_at": "2026-10-29T14:41:21.867514Z",
    "assigned_at": "2026-10-29T14:41:24.059147Z",
    "arrived_at": "2026-10-29T14:41:25.517414Z",
    "started_at": "2026-10-29T14:41:25.830022Z",
    "completed_at": "2026-10-29T14:41:26.436548Z"
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
    "id": "c588cf27-0224-4d22-8990-76c8afcefe71",
    "registered_at": "2026-10-29T14:41:19.452411Z",
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
      "created_at": "2026-10-29T14:41:21.869898Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-29T14:41:26.509889Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/7d3129ad-003a-4908-833f-bbcf37129873/chargebacks` → **422**

```json
{
  "command_id": "73cd90c5-8211-4f0e-964f-55008ddfacc2",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "instance": "/api/admin/v1/orders/7d3129ad-003a-4908-833f-bbcf37129873/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "1318fc89-4fec-427d-bbc4-d6059e639714"
}
```

`POST /api/admin/v1/orders/7d3129ad-003a-4908-833f-bbcf37129873/chargebacks` → **201**

```json
{
  "command_id": "c09ce4a4-dc05-4a56-a5af-69112e30c691",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "ed69d0a9-c1c2-4376-9045-c45b63b116ec",
  "order_id": "7d3129ad-003a-4908-833f-bbcf37129873",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T14:41:31.725959Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/7d3129ad-003a-4908-833f-bbcf37129873/chargebacks` → **201**

```json
{
  "command_id": "c09ce4a4-dc05-4a56-a5af-69112e30c691",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "ed69d0a9-c1c2-4376-9045-c45b63b116ec",
  "order_id": "7d3129ad-003a-4908-833f-bbcf37129873",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T14:41:31.725959Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/c588cf27-0224-4d22-8990-76c8afcefe71` → **200**

```json
{
  "client": {
    "id": "c588cf27-0224-4d22-8990-76c8afcefe71",
    "phone": "+380739225105",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:41:19.452411Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "7d3129ad-003a-4908-833f-bbcf37129873",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T14:41:21.867514Z",
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

`GET /api/admin/v1/clients/c588cf27-0224-4d22-8990-76c8afcefe71` → **200**

```json
{
  "client": {
    "id": "c588cf27-0224-4d22-8990-76c8afcefe71",
    "phone": "+380739225105",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:41:19.452411Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "7d3129ad-003a-4908-833f-bbcf37129873",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T14:41:21.867514Z",
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

`POST /api/admin/v1/orders/7d3129ad-003a-4908-833f-bbcf37129873/chargebacks/ed69d0a9-c1c2-4376-9045-c45b63b116ec/resolve` → **200**

```json
{
  "command_id": "365f4e36-80d8-412d-ad71-ef10f5e50418",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "ed69d0a9-c1c2-4376-9045-c45b63b116ec",
  "order_id": "7d3129ad-003a-4908-833f-bbcf37129873",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-29T14:41:31.725959Z",
  "resolved_at": "2026-10-29T14:41:33.987127Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/c588cf27-0224-4d22-8990-76c8afcefe71` → **200**

```json
{
  "client": {
    "id": "c588cf27-0224-4d22-8990-76c8afcefe71",
    "phone": "+380739225105",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:41:19.452411Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "7d3129ad-003a-4908-833f-bbcf37129873",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T14:41:21.867514Z",
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

`GET /api/admin/v1/clients/c588cf27-0224-4d22-8990-76c8afcefe71` → **200**

```json
{
  "client": {
    "id": "c588cf27-0224-4d22-8990-76c8afcefe71",
    "phone": "+380739225105",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:41:19.452411Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "7d3129ad-003a-4908-833f-bbcf37129873",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T14:41:21.867514Z",
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

`POST /api/admin/v1/orders/7d3129ad-003a-4908-833f-bbcf37129873/chargebacks/ed69d0a9-c1c2-4376-9045-c45b63b116ec/resolve` → **409**

```json
{
  "command_id": "7e16641a-b56a-4d7b-96e9-5badb4ed1db1",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/7d3129ad-003a-4908-833f-bbcf37129873/chargebacks/ed69d0a9-c1c2-4376-9045-c45b63b116ec/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6400c4e8-96d8-444a-81b2-a8c865965a8c"
}
```

`GET /api/admin/v1/orders/7d3129ad-003a-4908-833f-bbcf37129873/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "ed69d0a9-c1c2-4376-9045-c45b63b116ec",
      "order_id": "7d3129ad-003a-4908-833f-bbcf37129873",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-28",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-29T14:41:31.725959Z",
      "resolved_at": "2026-10-29T14:41:33.987127Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 7d3129ad-003a-4908-833f-bbcf37129873 without phone or card digits; chargeback ed69d0a9-c1c2-4376-9045-c45b63b116ec recorded and won.

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
  "session_id": "b790da6c-37c5-4ead-a8d6-a5b444c45202",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3OTcsImlhdCI6MTc5MzI4NDg5NywianRpIjoiNmJhYmI0NzgtMWM4Mi00ZDk3LWE2MmYtMTY5OGEwMjJjMmMxIiwic2lkIjoiYjc5MGRhNmMtMzdjNS00ZWFkLWE4ZDYtYTViNDQ0YzQ1MjAyIn0.LPwWcEyBUWowZydOd2nPTv1wdZoo04IpV_1WJOVpOlM",
  "access_expires_at": "2026-10-29T14:56:37.098988029Z",
  "refresh_token": "R2hSXXbnP3lvwYCwmVQqqxoaAPUd6EzACLWk-28TSoY",
  "refresh_expires_at": "2026-10-30T02:41:37.098421394Z",
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
  "phone": "+48600291073",
  "device_ref": "sandbox-7473"
}
```

```json
{
  "challenge_id": "dea6ee33-9d4e-4ce5-8bda-32bd3bea9ad9",
  "expires_at": "2026-10-29T14:46:37.960754008Z",
  "resend_available_at": "2026-10-29T14:41:38.960754008Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600291073` → **200**

```json
{
  "phone": "+48600291073",
  "audience": "CLIENT",
  "code": "979643",
  "sent_at": "2026-10-29T14:41:37.963329947Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dea6ee33-9d4e-4ce5-8bda-32bd3bea9ad9",
  "code": "979643",
  "device_ref": "sandbox-7473"
}
```

```json
{
  "session_id": "cdeab630-d78a-44f0-9baa-52901d26c7f7",
  "subject": {
    "type": "CLIENT",
    "id": "728d0e6a-7f91-4d18-84ae-b9190baefef5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjhkMGU2YS03ZjkxLTRkMTgtODRhZS1iOTE5MGJhZWZlZjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1Nzk4LCJpYXQiOjE3OTMyODQ4OTgsImp0aSI6IjE1ZDUzYmQ2LWVkN2QtNDJhZC04YzM2LTQ1MmY0OGU0YjdkMCIsInNpZCI6ImNkZWFiNjMwLWQ3OGEtNDRmMC05YmFhLTUyOTAxZDI2YzdmNyJ9.cqfnnAUZwJPFStm3ix01ar5052bm3EMPVtWVa0TKAyA",
  "access_expires_at": "2026-10-29T14:56:38.283697074Z",
  "refresh_token": "LR9elFrAEgmJumds80YKcmAU0gAwjvF0eZ4S3atqqio",
  "refresh_expires_at": "2026-11-28T14:41:38.283156087Z",
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
  "command_id": "edcee1ed-4657-48e6-b0dd-3a73a48b20d0",
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
  "correlation_id": "02723fd4-50f3-45d2-a18a-6bd4130c1c7a",
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
  "command_id": "89867061-2015-44ef-8e5f-ce5ca32e5e4a",
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
  "paused_at": "2026-10-29T14:41:39.511570621Z",
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
  "command_id": "1aaf7319-7861-40a0-9bcc-01706e0a220f",
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
  "id": "a54123fa-1cd9-49fc-bda2-311b3a0b73d1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:46:40.171250Z",
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
  "command_id": "838b3bc4-cf7b-47c0-9005-77e1437cff63",
  "quote_id": "a54123fa-1cd9-49fc-bda2-311b3a0b73d1",
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
  "correlation_id": "66f2846c-1205-4e81-bebe-fb349cd2e02f"
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
  "paused_at": "2026-10-29T14:41:39.511571Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "2a8122e2-6fdd-4903-9c60-375e3fc48b6d",
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
  "command_id": "73f33b75-6a4b-48b3-acf6-165f83e7e75c",
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
  "command_id": "3b7e72e4-e84c-44fa-bea9-3d7530c2c20f",
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
  "id": "ec76984e-1142-4e69-a8cc-7551e943f7d7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:46:41.900414Z",
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
  "command_id": "bf9eb9a7-15f6-4b1b-8a73-dc0dcf262696",
  "quote_id": "ec76984e-1142-4e69-a8cc-7551e943f7d7",
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
  "correlation_id": "1ae592a9-ac73-467b-9b61-0a6eb3ad7cb4"
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
  "command_id": "77b7f16c-49c5-49bc-bf1a-c3a2faeca1e6",
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
  "command_id": "98ef98ae-7463-4715-8e7d-1a5f0d73155d",
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
  "id": "971de6f0-b7d3-412f-9a62-b896543ade14",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:46:43.069843Z",
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
  "command_id": "89d76ef3-abbb-4ba9-ae32-e334d493e470",
  "quote_id": "971de6f0-b7d3-412f-9a62-b896543ade14",
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
  "correlation_id": "e149b80c-ce05-46e2-822b-2e1ff84c5eb8"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "5df36467-b517-4bad-81b7-71e1404d8679",
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
  "correlation_id": "30f3ecb6-6821-4515-82c5-3fcf3540e889"
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
  "command_id": "dc728d3f-d151-49a4-8866-38d920847121",
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
  "phone": "+380672175041",
  "device_ref": "sandbox-7868"
}
```

```json
{
  "challenge_id": "434ee23a-30e1-4c74-a694-9441f33c35ca",
  "expires_at": "2026-10-29T14:46:44.547645684Z",
  "resend_available_at": "2026-10-29T14:41:45.547645684Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672175041` → **200**

```json
{
  "phone": "+380672175041",
  "audience": "CLIENT",
  "code": "394695",
  "sent_at": "2026-10-29T14:41:44.550182582Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "434ee23a-30e1-4c74-a694-9441f33c35ca",
  "code": "394695",
  "device_ref": "sandbox-7868"
}
```

```json
{
  "session_id": "77d7321e-7dc2-4d6b-b277-135692233205",
  "subject": {
    "type": "CLIENT",
    "id": "d9574a24-8807-4234-8076-63ef4d3104f6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkOTU3NGEyNC04ODA3LTQyMzQtODA3Ni02M2VmNGQzMTA0ZjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODA0LCJpYXQiOjE3OTMyODQ5MDQsImp0aSI6Ijc1MDk2NGZkLTAyYzgtNDhmMi1hY2I3LTc2Mzg2Mjg0MDM1NCIsInNpZCI6Ijc3ZDczMjFlLTdkYzItNGQ2Yi1iMjc3LTEzNTY5MjIzMzIwNSJ9.DkYaTIMh0CtRYcdYOCMHxvwyec-TDXXHRqLYPDt1iig",
  "access_expires_at": "2026-10-29T14:56:44.860606422Z",
  "refresh_token": "jexRUSrjyE5UyYrgnYl0c7GB4QGwHZdzrMc0RegG9z8",
  "refresh_expires_at": "2026-11-28T14:41:44.860070704Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d9574a24-8807-4234-8076-63ef4d3104f6",
  "session_id": "77d7321e-7dc2-4d6b-b277-135692233205",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "11445fa6-1458-4a7c-9469-0cf990f715f9",
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
  "id": "090deb38-dfaa-46e3-acfb-b6eb9460b9ba",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:46:45.433272Z",
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
  "challenge_id": "ed793af4-9dde-4201-a9ec-e47bd7cea8dc",
  "expires_at": "2026-10-29T14:46:47.733876117Z",
  "resend_available_at": "2026-10-29T14:41:48.733876117Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672175041` → **200**

```json
{
  "phone": "+380672175041",
  "audience": "CLIENT",
  "code": "193617",
  "sent_at": "2026-10-29T14:41:47.736328527Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "204c7c8a-e102-4c33-bed7-43d8dfc8af78",
  "challenge_id": "ed793af4-9dde-4201-a9ec-e47bd7cea8dc",
  "otp_code": "193617"
}
```

```json
{
  "client_id": "d9574a24-8807-4234-8076-63ef4d3104f6",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T14:41:48.050828587Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "296f69a5-bca2-4ee9-99bf-a0dd1ccdd435",
  "quote_id": "090deb38-dfaa-46e3-acfb-b6eb9460b9ba",
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
  "correlation_id": "27bf60a1-e779-43ee-af46-68779f72938d"
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
  "session_id": "27e3dd60-9d24-4ead-8416-aa10cf1ab353",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4MDgsImlhdCI6MTc5MzI4NDkwOCwianRpIjoiNmJhZjc1MmEtMWNjOC00YTZmLTkxNTItMGQ1ODkzYzU4ZDgzIiwic2lkIjoiMjdlM2RkNjAtOWQyNC00ZWFkLTg0MTYtYWExMGNmMWFiMzUzIn0.9tvBJTqKkTkczBX5eY7pC4L7YL-zKn3ovHRwU0bag5I",
  "access_expires_at": "2026-10-29T14:56:48.95086183Z",
  "refresh_token": "aOW-yXHZjTNmYr704snMw2gqMlnn14c6PJTurIq_Hbg",
  "refresh_expires_at": "2026-10-30T02:41:48.950213434Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "d9574a24-8807-4234-8076-63ef4d3104f6",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T14:41:48.050829Z",
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

`POST /api/admin/v1/client-deletions/d9574a24-8807-4234-8076-63ef4d3104f6/complete` → **200**

```json
{
  "command_id": "a741da5a-8e28-4246-9541-2d4d962eeb64",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "d9574a24-8807-4234-8076-63ef4d3104f6",
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
  "correlation_id": "7fd08489-ff71-4260-b8ea-9164cd469b82"
}
```

Done: client d9574a24-8807-4234-8076-63ef4d3104f6 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662920525",
  "device_ref": "sandbox-23207"
}
```

```json
{
  "challenge_id": "211d6995-0abb-4b44-a223-b7ebe2243953",
  "expires_at": "2026-10-29T14:46:50.13483561Z",
  "resend_available_at": "2026-10-29T14:41:51.13483561Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662920525` → **200**

```json
{
  "phone": "+380662920525",
  "audience": "CLIENT",
  "code": "006146",
  "sent_at": "2026-10-29T14:41:50.138753538Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "211d6995-0abb-4b44-a223-b7ebe2243953",
  "code": "006146",
  "device_ref": "sandbox-23207"
}
```

```json
{
  "session_id": "5e131b26-b298-4cc9-b77a-a4cf682be7b5",
  "subject": {
    "type": "CLIENT",
    "id": "7fa43e02-6833-40fd-877c-f4b164bd3848"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZmE0M2UwMi02ODMzLTQwZmQtODc3Yy1mNGIxNjRiZDM4NDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODEwLCJpYXQiOjE3OTMyODQ5MTAsImp0aSI6Ijc0YTUzN2Y2LTQ0ZDMtNGYzZS05NWFlLWQ4ZThlZWViZTE0YyIsInNpZCI6IjVlMTMxYjI2LWIyOTgtNGNjOS1iNzdhLWE0Y2Y2ODJiZTdiNSJ9.bi51Af9WitqVEWcRP9yvMfBA-rog81U0deuLNJHu4TQ",
  "access_expires_at": "2026-10-29T14:56:50.451045184Z",
  "refresh_token": "S8wNV3f3czN6ufFT4X4lhBwVwVqlSEN1bjGLUDoSMW4",
  "refresh_expires_at": "2026-11-28T14:41:50.450541897Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7fa43e02-6833-40fd-877c-f4b164bd3848",
  "session_id": "5e131b26-b298-4cc9-b77a-a4cf682be7b5",
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
  "session_id": "77c17a69-8ae6-48b8-b350-1f91fd8fccfb",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4MTEsImlhdCI6MTc5MzI4NDkxMSwianRpIjoiZjE2YTU2NWYtZGZiMy00ODkxLWJlMTItMThiNmJhNzBhZjQ5Iiwic2lkIjoiNzdjMTdhNjktOGFlNi00OGI4LWIzNTAtMWY5MWZkOGZjY2ZiIn0.5m2KFOzs3wh0ywvJ1fIyEC1YbF4-8iFg_okhaJOMZuc",
  "access_expires_at": "2026-10-29T14:56:51.291886784Z",
  "refresh_token": "mXQFlk79i0ra-I64l5ohv31vx_zlrouxiX8gLm3yjjg",
  "refresh_expires_at": "2026-10-30T02:41:51.291367597Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=2920525&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "7fa43e02-6833-40fd-877c-f4b164bd3848",
      "phone": "+380662920525",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T14:41:50.448808Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/7fa43e02-6833-40fd-877c-f4b164bd3848` → **200**

```json
{
  "client": {
    "id": "7fa43e02-6833-40fd-877c-f4b164bd3848",
    "phone": "+380662920525",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:41:50.448808Z",
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

`POST /api/admin/v1/clients/7fa43e02-6833-40fd-877c-f4b164bd3848/block` → **400**

```json
{
  "command_id": "22df0e7a-3b70-4574-b5f3-ea6f0250f751",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/7fa43e02-6833-40fd-877c-f4b164bd3848/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "b47823ae-260e-4ada-9a54-f1e3f8af1d15",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/7fa43e02-6833-40fd-877c-f4b164bd3848/block` → **200**

```json
{
  "command_id": "408d51ba-032d-46d5-8d81-86647a2dcf97",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "7fa43e02-6833-40fd-877c-f4b164bd3848",
  "phone": "+380662920525",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T14:41:50.448808Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T14:41:52.497014Z",
    "by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
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
  "correlation_id": "23c5d921-aff1-40ff-b09e-3ca63c6ec5cc"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662920525",
  "device_ref": "sandbox-4907"
}
```

```json
{
  "challenge_id": "3608e8b1-4884-4631-837d-78fe7979dd03",
  "expires_at": "2026-10-29T14:46:55.075686985Z",
  "resend_available_at": "2026-10-29T14:41:56.075686985Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662920525` → **200**

```json
{
  "phone": "+380662920525",
  "audience": "CLIENT",
  "code": "075936",
  "sent_at": "2026-10-29T14:41:55.078737683Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "3608e8b1-4884-4631-837d-78fe7979dd03",
  "code": "075936",
  "device_ref": "sandbox-4907"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "403eab7c-428d-4606-b65f-bd5449f1a93b"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/7fa43e02-6833-40fd-877c-f4b164bd3848` → **200**

```json
{
  "client": {
    "id": "7fa43e02-6833-40fd-877c-f4b164bd3848",
    "phone": "+380662920525",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T14:41:50.448808Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T14:41:52.497014Z",
      "by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
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

`POST /api/admin/v1/clients/7fa43e02-6833-40fd-877c-f4b164bd3848/unblock` → **200**

```json
{
  "command_id": "61a2adab-ab20-4079-80c3-bde952039e05",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "7fa43e02-6833-40fd-877c-f4b164bd3848",
  "phone": "+380662920525",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T14:41:50.448808Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662920525",
  "device_ref": "sandbox-4503"
}
```

```json
{
  "challenge_id": "6685ca81-5572-4584-ae2e-fda598ef5d7f",
  "expires_at": "2026-10-29T14:46:58.344317818Z",
  "resend_available_at": "2026-10-29T14:41:59.344317818Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662920525` → **200**

```json
{
  "phone": "+380662920525",
  "audience": "CLIENT",
  "code": "073584",
  "sent_at": "2026-10-29T14:41:58.346886563Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6685ca81-5572-4584-ae2e-fda598ef5d7f",
  "code": "073584",
  "device_ref": "sandbox-4503"
}
```

```json
{
  "session_id": "f62bf7e8-d185-42ca-94ae-3bc21efd6579",
  "subject": {
    "type": "CLIENT",
    "id": "7fa43e02-6833-40fd-877c-f4b164bd3848"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZmE0M2UwMi02ODMzLTQwZmQtODc3Yy1mNGIxNjRiZDM4NDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODE4LCJpYXQiOjE3OTMyODQ5MTgsImp0aSI6ImI1NDQ5ZmE0LWRkYmItNGQ0ZC04NmEyLTllNDc3OTg2N2ZlMyIsInNpZCI6ImY2MmJmN2U4LWQxODUtNDJjYS05NGFlLTNiYzIxZWZkNjU3OSJ9.9kaIhimOp-yMELWdrpTWlyJ_y5rboIakaUgJTXJqjSw",
  "access_expires_at": "2026-10-29T14:56:58.661734968Z",
  "refresh_token": "Vqps982RVkIi9_aCgQC1fOJSvKj2GRJAfyrUWmYnwCI",
  "refresh_expires_at": "2026-11-28T14:41:58.661205021Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7fa43e02-6833-40fd-877c-f4b164bd3848",
  "session_id": "f62bf7e8-d185-42ca-94ae-3bc21efd6579",
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
  "phone": "+380663893573",
  "device_ref": "sandbox-12269"
}
```

```json
{
  "challenge_id": "d16acb36-7d99-4871-a3b7-e55d48d39816",
  "expires_at": "2026-10-29T14:46:59.235407694Z",
  "resend_available_at": "2026-10-29T14:42:00.235407694Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663893573` → **200**

```json
{
  "phone": "+380663893573",
  "audience": "CLIENT",
  "code": "551243",
  "sent_at": "2026-10-29T14:41:59.238165821Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d16acb36-7d99-4871-a3b7-e55d48d39816",
  "code": "551243",
  "device_ref": "sandbox-12269"
}
```

```json
{
  "session_id": "5ece9ce0-1cf6-4f03-859c-025a4a6aa8ec",
  "subject": {
    "type": "CLIENT",
    "id": "c9bfd157-e5ae-4285-bb9b-c9bfb16e7d31"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOWJmZDE1Ny1lNWFlLTQyODUtYmI5Yi1jOWJmYjE2ZTdkMzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODE5LCJpYXQiOjE3OTMyODQ5MTksImp0aSI6IjY1NjJmNzk5LTU1ZWEtNDIxYy04ZTZhLTE0ZjUxMjRiY2MyZSIsInNpZCI6IjVlY2U5Y2UwLTFjZjYtNGYwMy04NTljLTAyNWE0YTZhYThlYyJ9.6FbNb60a98zRZJUN4J2jht8eapU7crkO7AVVh5geatk",
  "access_expires_at": "2026-10-29T14:56:59.549380358Z",
  "refresh_token": "FqjeHbhAcap7CICWEDlUIg029SL5tcB57AzIvRz5aBc",
  "refresh_expires_at": "2026-11-28T14:41:59.548836154Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "384677a6-b172-4200-a514-6041578d185f",
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
  "id": "6e0a36e7-4a97-471e-9722-29b8abdc0d4b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:46:59.839792Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: dc808223-f8c6-4dfc-8aa0-60e39cffed06) → **201**

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
  "session_id": "26b09a66-3d3e-4dc9-a0b3-1fc15ee16aee",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4MjAsImlhdCI6MTc5MzI4NDkyMCwianRpIjoiMzVjNzA5ZjEtMjdhNS00MjRiLWI3NjEtNmRhNWI0NTI1MWVjIiwic2lkIjoiMjZiMDlhNjYtM2QzZS00ZGM5LWEwYjMtMWZjMTVlZTE2YWVlIn0.5I0TMYn6L1kPoSGAjUQWDCBHA0waScFmj9_x1VeEhc0",
  "access_expires_at": "2026-10-29T14:57:00.462959198Z",
  "refresh_token": "4z7a6P-1oAC6Dhw3iSCogebomxLfA1h1vB3jRDN8-jM",
  "refresh_expires_at": "2026-10-30T02:42:00.462424422Z",
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
  "session_id": "f3e4713f-3584-4ce1-844b-6300c31cf5aa",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4MjEsImlhdCI6MTc5MzI4NDkyMSwianRpIjoiMTBiNjdkNGYtOTJkOS00MDkxLWFjNWYtOTViNjgxZWRlYmU1Iiwic2lkIjoiZjNlNDcxM2YtMzU4NC00Y2UxLTg0NGItNjMwMGMzMWNmNWFhIn0.Haotyum93o7077LLE5-vs9GKv7oAfofLgqjCUIU8kQ0",
  "access_expires_at": "2026-10-29T14:57:01.046619908Z",
  "refresh_token": "l58coBQTGPgQklFJ4OLOcQZjxZhW6GDDOq9_iBKUD5s",
  "refresh_expires_at": "2026-10-30T02:42:01.046081134Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c632b49e-fb12-4970-9123-3b750efffd15/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:42:00.13387Z",
      "actor": {
        "type": "CLIENT",
        "id": "c9bfd157-e5ae-4285-bb9b-c9bfb16e7d31",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c632b49e-fb12-4970-9123-3b750efffd15",
        "quote_id": "6e0a36e7-4a97-471e-9722-29b8abdc0d4b",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "dc808223-f8c6-4dfc-8aa0-60e39cffed06"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:42:00.136162Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c632b49e-fb12-4970-9123-3b750efffd15",
        "attempt_id": "bea21ee4-2d59-4ca5-947f-87b190f3fa9d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "dc808223-f8c6-4dfc-8aa0-60e39cffed06"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T14:42:00.143138Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c632b49e-fb12-4970-9123-3b750efffd15",
        "attempt_id": "bea21ee4-2d59-4ca5-947f-87b190f3fa9d"
      },
      "correlation_id": "dc808223-f8c6-4dfc-8aa0-60e39cffed06"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "bea21ee4-2d59-4ca5-947f-87b190f3fa9d",
        "generation": 1,
        "started_at": "2026-10-29T14:42:00.135181Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T14:42:00.143138Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T14:42:00.136908Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/dc808223-f8c6-4dfc-8aa0-60e39cffed06` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "c632b49e-fb12-4970-9123-3b750efffd15:0",
      "order_id": "c632b49e-fb12-4970-9123-3b750efffd15",
      "at": "2026-10-29T14:42:00.13387Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "c632b49e-fb12-4970-9123-3b750efffd15:1",
      "order_id": "c632b49e-fb12-4970-9123-3b750efffd15",
      "at": "2026-10-29T14:42:00.136162Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "c632b49e-fb12-4970-9123-3b750efffd15:2",
      "order_id": "c632b49e-fb12-4970-9123-3b750efffd15",
      "at": "2026-10-29T14:42:00.143138Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/7c8c017e-321a-42b9-b12a-3fbfcb230dd6` → **200**

```json
{
  "found": []
}
```

Done: request dc808223-f8c6-4dfc-8aa0-60e39cffed06 — order c632b49e-fb12-4970-9123-3b750efffd15 found by its id.

`GET /api/rider/v1/orders/c632b49e-fb12-4970-9123-3b750efffd15` → **200**

```json
{
  "id": "c632b49e-fb12-4970-9123-3b750efffd15",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c9bfd157-e5ae-4285-bb9b-c9bfb16e7d31",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:42:00.133151Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c632b49e-fb12-4970-9123-3b750efffd15/cancel` → **200**

```json
{
  "command_id": "9b5c6f3d-772e-47c4-b3b2-930d55cad9e3",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c632b49e-fb12-4970-9123-3b750efffd15",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c9bfd157-e5ae-4285-bb9b-c9bfb16e7d31",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:42:00.133151Z",
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
  "phone": "+380638636317",
  "device_ref": "sandbox-18527"
}
```

```json
{
  "challenge_id": "0f2e3260-a87e-443e-9560-b8f3cd33add5",
  "expires_at": "2026-10-29T14:47:02.836123693Z",
  "resend_available_at": "2026-10-29T14:42:03.836123693Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638636317` → **200**

```json
{
  "phone": "+380638636317",
  "audience": "CLIENT",
  "code": "101783",
  "sent_at": "2026-10-29T14:42:02.839121887Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0f2e3260-a87e-443e-9560-b8f3cd33add5",
  "code": "101783",
  "device_ref": "sandbox-18527"
}
```

```json
{
  "session_id": "88ae0869-3551-463b-a352-9355e5295c95",
  "subject": {
    "type": "CLIENT",
    "id": "98387bc5-05f2-49a6-9e56-aa27ad37c6d0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ODM4N2JjNS0wNWYyLTQ5YTYtOWU1Ni1hYTI3YWQzN2M2ZDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODIzLCJpYXQiOjE3OTMyODQ5MjMsImp0aSI6IjBjNGUyMDQ2LTIyNzMtNGUzYy04NDFlLTdmOTcwYzFiODExMyIsInNpZCI6Ijg4YWUwODY5LTM1NTEtNDYzYi1hMzUyLTkzNTVlNTI5NWM5NSJ9.49AdQWQ1d7v9dBfJoPYJxQpQxkEUBCdN1CHHqepD6q0",
  "access_expires_at": "2026-10-29T14:57:03.155168825Z",
  "refresh_token": "49uAiF21KtSUJmx6oFulgB_tAFUkEOoBBpJSa3mUQoY",
  "refresh_expires_at": "2026-11-28T14:42:03.154579508Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "a8c97849-5f91-41f3-bfa3-cc95581dff8e",
  "expires_at": "2026-10-29T14:47:05.440545078Z",
  "resend_available_at": "2026-10-29T14:42:06.440545078Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638636317` → **200**

```json
{
  "phone": "+380638636317",
  "audience": "CLIENT",
  "code": "670275",
  "sent_at": "2026-10-29T14:42:05.443179026Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "64c683b6-378d-492e-8a90-4ef25c86920d",
  "challenge_id": "a8c97849-5f91-41f3-bfa3-cc95581dff8e",
  "otp_code": "670275"
}
```

```json
{
  "id": "19a456e2-8f67-4dca-8e04-ea2e84d41048",
  "state": "PENDING",
  "created_at": "2026-10-29T14:42:05.765424Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/19a456e2-8f67-4dca-8e04-ea2e84d41048` → **200**

```json
{
  "id": "19a456e2-8f67-4dca-8e04-ea2e84d41048",
  "state": "PENDING",
  "created_at": "2026-10-29T14:42:05.765424Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/19a456e2-8f67-4dca-8e04-ea2e84d41048` → **200**

```json
{
  "id": "19a456e2-8f67-4dca-8e04-ea2e84d41048",
  "state": "PENDING",
  "created_at": "2026-10-29T14:42:05.765424Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/19a456e2-8f67-4dca-8e04-ea2e84d41048` → **200**

```json
{
  "id": "19a456e2-8f67-4dca-8e04-ea2e84d41048",
  "state": "PENDING",
  "created_at": "2026-10-29T14:42:05.765424Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/19a456e2-8f67-4dca-8e04-ea2e84d41048` → **200**

```json
{
  "id": "19a456e2-8f67-4dca-8e04-ea2e84d41048",
  "state": "PENDING",
  "created_at": "2026-10-29T14:42:05.765424Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/19a456e2-8f67-4dca-8e04-ea2e84d41048` → **200**

```json
{
  "id": "19a456e2-8f67-4dca-8e04-ea2e84d41048",
  "state": "PENDING",
  "created_at": "2026-10-29T14:42:05.765424Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/19a456e2-8f67-4dca-8e04-ea2e84d41048` → **200**

```json
{
  "id": "19a456e2-8f67-4dca-8e04-ea2e84d41048",
  "state": "PENDING",
  "created_at": "2026-10-29T14:42:05.765424Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/19a456e2-8f67-4dca-8e04-ea2e84d41048` → **200**

```json
{
  "id": "19a456e2-8f67-4dca-8e04-ea2e84d41048",
  "state": "PENDING",
  "created_at": "2026-10-29T14:42:05.765424Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/19a456e2-8f67-4dca-8e04-ea2e84d41048` → **200**

```json
{
  "id": "19a456e2-8f67-4dca-8e04-ea2e84d41048",
  "state": "PENDING",
  "created_at": "2026-10-29T14:42:05.765424Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/19a456e2-8f67-4dca-8e04-ea2e84d41048` → **200**

```json
{
  "id": "19a456e2-8f67-4dca-8e04-ea2e84d41048",
  "state": "READY",
  "created_at": "2026-10-29T14:42:05.765424Z",
  "ready_at": "2026-10-29T14:42:15.656003Z",
  "expires_at": "2026-11-05T14:42:15.656003Z",
  "size_bytes": 1027
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/19a456e2-8f67-4dca-8e04-ea2e84d41048/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636780021",
  "device_ref": "sandbox-27500"
}
```

```json
{
  "challenge_id": "8588c1a4-e040-4960-8842-4e10cb7e1e7a",
  "expires_at": "2026-10-29T14:47:16.607176541Z",
  "resend_available_at": "2026-10-29T14:42:17.607176541Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636780021` → **200**

```json
{
  "phone": "+380636780021",
  "audience": "CLIENT",
  "code": "192679",
  "sent_at": "2026-10-29T14:42:16.610105597Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8588c1a4-e040-4960-8842-4e10cb7e1e7a",
  "code": "192679",
  "device_ref": "sandbox-27500"
}
```

```json
{
  "session_id": "93904f64-eda6-4777-a711-8a351a5abda1",
  "subject": {
    "type": "CLIENT",
    "id": "4d7252e3-1034-4a3c-93ba-c27e97d76d4e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDcyNTJlMy0xMDM0LTRhM2MtOTNiYS1jMjdlOTdkNzZkNGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODM2LCJpYXQiOjE3OTMyODQ5MzYsImp0aSI6ImVhNWYwNDU2LTQxMzUtNDRhZS05OGZlLWNjMDY0ZjQ1MjMyOCIsInNpZCI6IjkzOTA0ZjY0LWVkYTYtNDc3Ny1hNzExLThhMzUxYTVhYmRhMSJ9.mIK04l96HmFNiTQb6ooRv6EFa29bWA6OO4MHo96k21A",
  "access_expires_at": "2026-10-29T14:57:16.916308494Z",
  "refresh_token": "gmVR40533-U0Wz-X3Qgi7nmwO9Ddv9y4300hOTDIwLk",
  "refresh_expires_at": "2026-11-28T14:42:16.915788257Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/19a456e2-8f67-4dca-8e04-ea2e84d41048/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/19a456e2-8f67-4dca-8e04-ea2e84d41048/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a2ce794c-2b5c-41e3-b272-cf67257735ef"
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
  "session_id": "995e7a5c-9e53-40ae-a256-9350b79556ac",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4MzcsImlhdCI6MTc5MzI4NDkzNywianRpIjoiNWVkYmFmMWUtYWI1Ni00YWU3LTg5ZDQtZDJiNzg3NjRlZWU0Iiwic2lkIjoiOTk1ZTdhNWMtOWU1My00MGFlLWEyNTYtOTM1MGI3OTU1NmFjIn0.6utZHJOhRXyySOYIHJ7qz1mQelb_SjbOIOAPBtDFz-U",
  "access_expires_at": "2026-10-29T14:57:17.790271619Z",
  "refresh_token": "P8QP_2vnUtT4FZjdufxsAfrgs6ez326v6v0mJXD7Adc",
  "refresh_expires_at": "2026-10-30T02:42:17.789726344Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "98387bc5-05f2-49a6-9e56-aa27ad37c6d0",
  "session_id": "88ae0869-3551-463b-a352-9355e5295c95",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/98387bc5-05f2-49a6-9e56-aa27ad37c6d0/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "19a456e2-8f67-4dca-8e04-ea2e84d41048",
      "state": "READY",
      "created_at": "2026-10-29T14:42:05.765424Z",
      "ready_at": "2026-10-29T14:42:15.656003Z",
      "expires_at": "2026-11-05T14:42:15.656003Z",
      "size_bytes": 1027
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
  "device_ref": "sandbox-18474"
}
```

```json
{
  "challenge_id": "30110290-cf0c-454e-9990-7646ffdd666f",
  "expires_at": "2026-10-29T14:47:18.63555601Z",
  "resend_available_at": "2026-10-29T14:42:19.63555601Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "340438",
  "sent_at": "2026-10-29T14:42:18.638069064Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "30110290-cf0c-454e-9990-7646ffdd666f",
  "code": "340438",
  "device_ref": "sandbox-18474"
}
```

```json
{
  "session_id": "31e55edd-9be2-463a-b34f-30fd68ea111b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTgzOCwiaWF0IjoxNzkzMjg0OTM4LCJqdGkiOiI1YWM1ZTJjNC1hNDc4LTRiZjQtOWY2ZC05NjJmNmViNzFjZTMiLCJzaWQiOiIzMWU1NWVkZC05YmUyLTQ2M2EtYjM0Zi0zMGZkNjhlYTExMWIifQ.4Su3IAMEW2jI69-tHmzLjuqPPYoJczeIZl2VMpd6MJo",
  "access_expires_at": "2026-10-29T14:57:18.937101621Z",
  "refresh_token": "Np8YBf_7Jd2aGbJJLl-PGnP2o19BW4XqqpEfMMye3Q4",
  "refresh_expires_at": "2026-11-28T14:42:18.936606469Z",
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
  "device_ref": "sandbox-177"
}
```

```json
{
  "challenge_id": "ce23e6db-0b69-47b2-a9f9-f3084766c5f8",
  "expires_at": "2026-10-29T14:47:19.508330384Z",
  "resend_available_at": "2026-10-29T14:42:20.508330384Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "638599",
  "sent_at": "2026-10-29T14:42:19.51099668Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce23e6db-0b69-47b2-a9f9-f3084766c5f8",
  "code": "638599",
  "device_ref": "sandbox-177"
}
```

```json
{
  "session_id": "1b97e7fb-6345-4d4f-93bc-bafdf0dc271b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTgzOSwiaWF0IjoxNzkzMjg0OTM5LCJqdGkiOiI2NGY2NTRkYS0yZmQ5LTQyMTUtYTI4Zi0yNGRjNGM3NDkzMjEiLCJzaWQiOiIxYjk3ZTdmYi02MzQ1LTRkNGYtOTNiYy1iYWZkZjBkYzI3MWIifQ.vJnnroEkCkPMksXrJR8XHDODffv-YSB2ozsmBywFp1U",
  "access_expires_at": "2026-10-29T14:57:19.825100348Z",
  "refresh_token": "KCuWGU120Hpansr78H2k7xq9McJ4Xsgpn_gP9talq4A",
  "refresh_expires_at": "2026-11-28T14:42:19.824493868Z",
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
  "command_id": "9989df4a-556b-41ae-aeeb-d0a2f8db1612",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:20Z",
    "sequence": 1793284940393
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a17592fb-dadf-498e-bf0e-72094e542187",
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
  "last_heartbeat_at": "2026-10-29T14:42:20.411844Z",
  "last_location_at": "2026-10-29T14:42:20.411844Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-9993"
}
```

```json
{
  "challenge_id": "7d3b75e3-8bbc-44b3-8fa8-530e7b40e6c8",
  "expires_at": "2026-10-29T14:47:20.700815134Z",
  "resend_available_at": "2026-10-29T14:42:21.700815134Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "193443",
  "sent_at": "2026-10-29T14:42:20.703615816Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7d3b75e3-8bbc-44b3-8fa8-530e7b40e6c8",
  "code": "193443",
  "device_ref": "sandbox-9993"
}
```

```json
{
  "session_id": "38d60ee8-4bec-4216-8785-ddd35efb0876",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTg0MSwiaWF0IjoxNzkzMjg0OTQxLCJqdGkiOiJmZjFmMDUyYy0zM2FiLTQ0N2UtODVmMy01MzhkYWM3YjdkMDQiLCJzaWQiOiIzOGQ2MGVlOC00YmVjLTQyMTYtODc4NS1kZGQzNWVmYjA4NzYifQ.TCbL90K6-5CIj6hEQhGG6C9_vVc8rapn4TOcjMLclPw",
  "access_expires_at": "2026-10-29T14:57:21.011688282Z",
  "refresh_token": "kz24TP9AOkeZeXfxEa3AluCMfjnoxl5Kv5_QFkC1bDU",
  "refresh_expires_at": "2026-11-28T14:42:21.011130303Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a6191e5b-938a-4dac-a18c-a95df1062dab",
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
  "last_heartbeat_at": "2026-10-29T14:40:41.682609Z",
  "last_location_at": "2026-10-29T14:40:41.682609Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a6191e5b-938a-4dac-a18c-a95df1062dab/handover` → **200**

```json
{
  "command_id": "41518ebc-8a07-45a9-a850-410b6dbf9009",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a6191e5b-938a-4dac-a18c-a95df1062dab",
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
  "last_heartbeat_at": "2026-10-29T14:40:41.682609Z",
  "last_location_at": "2026-10-29T14:40:41.682609Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a6191e5b-938a-4dac-a18c-a95df1062dab/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:21Z",
    "sequence": 1793284941864
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a6191e5b-938a-4dac-a18c-a95df1062dab",
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
  "last_heartbeat_at": "2026-10-29T14:42:21.882268Z",
  "last_location_at": "2026-10-29T14:42:21.882268Z",
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
  "session_id": "f85ae3ff-3b7c-4071-afa3-dc94bd190d1d",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4NDIsImlhdCI6MTc5MzI4NDk0MiwianRpIjoiYjdjYzM1NjItZjAxOS00NDk4LTllZmYtNmQ2MzE1NGE5YjNiIiwic2lkIjoiZjg1YWUzZmYtM2I3Yy00MDcxLWFmYTMtZGM5NGJkMTkwZDFkIn0.BLOaCOGDbm44ABxEBkXBaIc-xpmP1eDoMD_wnYXo9dg",
  "access_expires_at": "2026-10-29T14:57:22.456887741Z",
  "refresh_token": "PjhV043bjKYDMFoxxdpLb02PLOB2_GLqaY7SfdOVBeI",
  "refresh_expires_at": "2026-10-30T02:42:22.456366871Z",
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
  "session_id": "472ca4ee-4149-4d81-868d-498f88414b04",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4NDMsImlhdCI6MTc5MzI4NDk0MywianRpIjoiMTE1YmY2ZWQtNjZiZS00ZGM4LWIxYjgtNmQ2NDVkMTU2NGFhIiwic2lkIjoiNDcyY2E0ZWUtNDE0OS00ZDgxLTg2OGQtNDk4Zjg4NDE0YjA0In0.IWwvq8yJiMcOoGexbPXx1o4UAz58EOOczGMEJ7EqCy4",
  "access_expires_at": "2026-10-29T14:57:23.042541164Z",
  "refresh_token": "Op9LOm7tcjm0HZJo2-qW0I4TA-r31cHdJIP8ltPoOvo",
  "refresh_expires_at": "2026-10-30T02:42:23.041997081Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380689538458",
  "device_ref": "sandbox-11410"
}
```

```json
{
  "challenge_id": "0079d04e-f3bc-4abc-9ce3-03b44392cf9f",
  "expires_at": "2026-10-29T14:47:23.319624856Z",
  "resend_available_at": "2026-10-29T14:42:24.319624856Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380689538458` → **200**

```json
{
  "phone": "+380689538458",
  "audience": "CLIENT",
  "code": "367289",
  "sent_at": "2026-10-29T14:42:23.322494754Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0079d04e-f3bc-4abc-9ce3-03b44392cf9f",
  "code": "367289",
  "device_ref": "sandbox-11410"
}
```

```json
{
  "session_id": "4dc3f100-489c-4714-88dc-04effbe223e1",
  "subject": {
    "type": "CLIENT",
    "id": "3b20da17-1f6d-462b-b02c-de39ffe9aa46"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYjIwZGExNy0xZjZkLTQ2MmItYjAyYy1kZTM5ZmZlOWFhNDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODQzLCJpYXQiOjE3OTMyODQ5NDMsImp0aSI6IjcyMWU2NTMxLTA0NmQtNDVjYS1hZDliLWRmYzBlNDM3OTZlOSIsInNpZCI6IjRkYzNmMTAwLTQ4OWMtNDcxNC04OGRjLTA0ZWZmYmUyMjNlMSJ9.-B_Z5sTlv02AnqENSOz8eiRJSsRXIfgzHdCIzQyDAbY",
  "access_expires_at": "2026-10-29T14:57:23.641069404Z",
  "refresh_token": "1F78kdi2UENnhWXIXUUqN55NJGOJHFC8bjdSM66JTrw",
  "refresh_expires_at": "2026-11-28T14:42:23.640583078Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "eb1d6e73-bc2e-44a1-8aed-1813c831a7ec",
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
  "id": "2f09447e-f653-4028-91cd-ed9dd1945b51",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:47:23.926653Z",
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
  "command_id": "0cdca982-4af8-4d1d-b9c4-9624932f9ea0",
  "quote_id": "2f09447e-f653-4028-91cd-ed9dd1945b51",
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
  "id": "5361a1e6-6000-4bd4-a6f1-69d5b8d33755",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3b20da17-1f6d-462b-b02c-de39ffe9aa46",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:42:24.22404Z",
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
    "id": "0199a70c-de81-4f2d-b8bc-eb1c3ee70b51",
    "order_id": "5361a1e6-6000-4bd4-a6f1-69d5b8d33755",
    "expires_at": "2026-10-29T14:42:39.227741Z",
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

`POST /api/driver/v1/offers/0199a70c-de81-4f2d-b8bc-eb1c3ee70b51/reject` → **204**

```json
{
  "command_id": "7214c001-1de8-4690-84a2-0ec86760cab9"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "d1b55907-85aa-473b-8526-f9992671c87a",
    "order_id": "5361a1e6-6000-4bd4-a6f1-69d5b8d33755",
    "expires_at": "2026-10-29T14:42:39.8306Z",
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

`POST /api/driver/v1/offers/d1b55907-85aa-473b-8526-f9992671c87a/accept` → **200**

```json
{
  "command_id": "f942e0f9-f82a-4ca2-a2d4-83acfaf5db7e"
}
```

```json
{
  "id": "9293f99b-6171-47c2-b3a5-81bfea16c281",
  "order_id": "5361a1e6-6000-4bd4-a6f1-69d5b8d33755",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "396cf192-8270-448d-8fff-79eb380f998f",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/5361a1e6-6000-4bd4-a6f1-69d5b8d33755/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:42:24.224564Z",
      "actor": {
        "type": "CLIENT",
        "id": "3b20da17-1f6d-462b-b02c-de39ffe9aa46",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5361a1e6-6000-4bd4-a6f1-69d5b8d33755",
        "quote_id": "2f09447e-f653-4028-91cd-ed9dd1945b51",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "614d7bc1-5300-4f29-b1c5-2a3e377a53c5"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:42:24.226822Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5361a1e6-6000-4bd4-a6f1-69d5b8d33755",
        "attempt_id": "3f49cec5-9dc8-47f4-9e29-7d960bccf495",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "614d7bc1-5300-4f29-b1c5-2a3e377a53c5"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:42:24.230754Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "0199a70c-de81-4f2d-b8bc-eb1c3ee70b51",
        "order_id": "5361a1e6-6000-4bd4-a6f1-69d5b8d33755",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "614d7bc1-5300-4f29-b1c5-2a3e377a53c5"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T14:42:24.829593Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "0199a70c-de81-4f2d-b8bc-eb1c3ee70b51",
        "order_id": "5361a1e6-6000-4bd4-a6f1-69d5b8d33755"
      },
      "correlation_id": "9b502fe8-6cd0-4100-980f-4264645ddd19"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 5361a1e6-6000-4bd4-a6f1-69d5b8d33755 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/5361a1e6-6000-4bd4-a6f1-69d5b8d33755` → **200**

```json
{
  "id": "5361a1e6-6000-4bd4-a6f1-69d5b8d33755",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "3b20da17-1f6d-462b-b02c-de39ffe9aa46",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "9293f99b-6171-47c2-b3a5-81bfea16c281",
    "order_id": "5361a1e6-6000-4bd4-a6f1-69d5b8d33755",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "396cf192-8270-448d-8fff-79eb380f998f",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T14:42:24.22404Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5361a1e6-6000-4bd4-a6f1-69d5b8d33755/cancel` → **200**

```json
{
  "command_id": "2a3deb11-6316-4b13-a61f-49c1bf1906aa",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "5361a1e6-6000-4bd4-a6f1-69d5b8d33755",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "3b20da17-1f6d-462b-b02c-de39ffe9aa46",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "9293f99b-6171-47c2-b3a5-81bfea16c281",
    "order_id": "5361a1e6-6000-4bd4-a6f1-69d5b8d33755",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "396cf192-8270-448d-8fff-79eb380f998f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T14:42:24.22404Z",
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
  "session_id": "a17592fb-dadf-498e-bf0e-72094e542187",
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
  "last_heartbeat_at": "2026-10-29T14:42:20.411844Z",
  "last_location_at": "2026-10-29T14:42:20.411844Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a17592fb-dadf-498e-bf0e-72094e542187/close` → **200**

```json
{
  "command_id": "635960e8-d79f-44f9-907f-f93d9b4cd544",
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
  "session_id": "a6191e5b-938a-4dac-a18c-a95df1062dab",
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
  "last_heartbeat_at": "2026-10-29T14:42:21.882268Z",
  "last_location_at": "2026-10-29T14:42:21.882268Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a6191e5b-938a-4dac-a18c-a95df1062dab/close` → **200**

```json
{
  "command_id": "46989031-b027-4100-bf50-57cdb35eb5b1",
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
  "session_id": "5c5eb4d7-555d-44b6-9aa0-632f3393091c",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4NDcsImlhdCI6MTc5MzI4NDk0NywianRpIjoiNjI3Yjk3ODAtZjRhMS00NDBjLWJkOTctYWZkYTJmZWEyMDY4Iiwic2lkIjoiNWM1ZWI0ZDctNTU1ZC00NGI2LTlhYTAtNjMyZjMzOTMwOTFjIn0.20RfBJO-YqP8R8rLfqtvHybI6tGWVHI2ELQMF8xwls8",
  "access_expires_at": "2026-10-29T14:57:27.857981604Z",
  "refresh_token": "DlKINVxUNsJ9LFWXLJ-w4bQKbE1HZ1c6arLnIIavgTI",
  "refresh_expires_at": "2026-10-30T02:42:27.857479179Z",
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
  "command_id": "369f51aa-485b-4942-baf9-7691ffa4cbc0",
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
  "changed_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T14:42:28.439429Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "6468fb3b-6cd0-4e51-9e75-67259bb4c565",
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
  "correlation_id": "528769d2-7887-41ba-aa74-d5d3b6816778"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "189ef33c-ba89-4441-b700-c372edf92e20",
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
  "correlation_id": "8d736d0b-809a-42fc-bb61-c74e8089367c"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632979479",
  "device_ref": "sandbox-16735"
}
```

```json
{
  "challenge_id": "37d6252a-06b8-48b6-9a16-6ea367e1594c",
  "expires_at": "2026-10-29T14:47:29.318101971Z",
  "resend_available_at": "2026-10-29T14:42:30.318101971Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632979479` → **200**

```json
{
  "phone": "+380632979479",
  "audience": "CLIENT",
  "code": "713276",
  "sent_at": "2026-10-29T14:42:29.320764766Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "37d6252a-06b8-48b6-9a16-6ea367e1594c",
  "code": "713276",
  "device_ref": "sandbox-16735"
}
```

```json
{
  "session_id": "a47ab7c8-5cab-457b-9731-50653d72fdf8",
  "subject": {
    "type": "CLIENT",
    "id": "0de51438-0be6-4028-90cc-29c801111d8a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGU1MTQzOC0wYmU2LTQwMjgtOTBjYy0yOWM4MDExMTFkOGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODQ5LCJpYXQiOjE3OTMyODQ5NDksImp0aSI6ImM0OGIzMWZmLThiMmEtNDA0NC04M2ZmLTgzZjYxMzU4Yjk0OCIsInNpZCI6ImE0N2FiN2M4LTVjYWItNDU3Yi05NzMxLTUwNjUzZDcyZmRmOCJ9.PSk7X26Eq81OviWRS5IF3bKyyp8mzsCSvuvMOtnv7Jo",
  "access_expires_at": "2026-10-29T14:57:29.647691025Z",
  "refresh_token": "RRWi-_z_jxEP-PokQ4y_TDdUMqo-1EX8HGfc1O200BY",
  "refresh_expires_at": "2026-11-28T14:42:29.647125963Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ba57dd24-8b0e-441f-8956-00cab25439e3",
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
  "id": "f8947aa0-2c9f-4a61-906f-2f0436621458",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:47:29.938852Z",
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
  "command_id": "508d5d14-be0d-4601-8068-c47d83b9e7b7",
  "quote_id": "f8947aa0-2c9f-4a61-906f-2f0436621458",
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
  "correlation_id": "5496d651-dd54-4d7c-beb7-53ca950aba42"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9835276e-e478-4401-90c2-785a3bfa5865",
  "quote_id": "f8947aa0-2c9f-4a61-906f-2f0436621458",
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
  "id": "adde7ed5-83b9-42c3-90d5-30d28ebb6eab",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0de51438-0be6-4028-90cc-29c801111d8a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:42:30.530726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/adde7ed5-83b9-42c3-90d5-30d28ebb6eab/cancel` → **200**

```json
{
  "command_id": "72288669-363f-4f7b-a868-64c9a02893c2",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "adde7ed5-83b9-42c3-90d5-30d28ebb6eab",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0de51438-0be6-4028-90cc-29c801111d8a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:42:30.530726Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The incident is over: card payments are back on

`POST /api/admin/v1/feature-flags/card-payments/change` → **200**

```json
{
  "command_id": "40c4b8d9-b606-4ebe-9661-91b10873b210",
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
  "changed_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T14:42:31.176791Z"
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
      "changed_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T14:42:31.176791Z"
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
  "device_ref": "sandbox-28902"
}
```

```json
{
  "challenge_id": "eea83fc8-aee5-4007-9ecf-40272bc80030",
  "expires_at": "2026-10-29T14:47:32.050731352Z",
  "resend_available_at": "2026-10-29T14:42:33.050731352Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "283133",
  "sent_at": "2026-10-29T14:42:32.053429791Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eea83fc8-aee5-4007-9ecf-40272bc80030",
  "code": "283133",
  "device_ref": "sandbox-28902"
}
```

```json
{
  "session_id": "3ef9c924-b9f1-4ed0-9cd3-a07fcb3d461b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTg1MiwiaWF0IjoxNzkzMjg0OTUyLCJqdGkiOiIxMzlkMWZkNy0xMGJmLTQ4OTgtYTdmYy1mNTRmODEzZDg0YmIiLCJzaWQiOiIzZWY5YzkyNC1iOWYxLTRlZDAtOWNkMy1hMDdmY2IzZDQ2MWIifQ.Mmk_VzRrVlvOWhBJ8sGhZnkdBGSTXdk_UZa189xPL-s",
  "access_expires_at": "2026-10-29T14:57:32.357447317Z",
  "refresh_token": "RCcUnmwwUsV1mqgmzta_LPED2pVi3Wfpum88t4VresE",
  "refresh_expires_at": "2026-11-28T14:42:32.356910857Z",
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
  "command_id": "abe921d7-c90f-4fd4-9ca3-840bc4ca7b4c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:32Z",
    "sequence": 1793284952915
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1f50a33c-c96c-42cb-9eb0-5c804120a523",
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
  "last_heartbeat_at": "2026-10-29T14:42:32.933557Z",
  "last_location_at": "2026-10-29T14:42:32.933557Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674136389",
  "device_ref": "sandbox-9733"
}
```

```json
{
  "challenge_id": "c74ece28-1cb2-4e68-a918-d7e7de9a6fd1",
  "expires_at": "2026-10-29T14:47:33.220009574Z",
  "resend_available_at": "2026-10-29T14:42:34.220009574Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674136389` → **200**

```json
{
  "phone": "+380674136389",
  "audience": "CLIENT",
  "code": "439658",
  "sent_at": "2026-10-29T14:42:33.222550262Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c74ece28-1cb2-4e68-a918-d7e7de9a6fd1",
  "code": "439658",
  "device_ref": "sandbox-9733"
}
```

```json
{
  "session_id": "4a7ce2b0-53f9-47d9-a499-f72e29d56163",
  "subject": {
    "type": "CLIENT",
    "id": "b98ae1c3-21ea-4364-bf01-d1e07255a832"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiOThhZTFjMy0yMWVhLTQzNjQtYmYwMS1kMWUwNzI1NWE4MzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODUzLCJpYXQiOjE3OTMyODQ5NTMsImp0aSI6IjZmZDMyOTA4LWE2YTUtNDBhNy1iYzE0LWMyNDhjNGFlZTdkMiIsInNpZCI6IjRhN2NlMmIwLTUzZjktNDdkOS1hNDk5LWY3MmUyOWQ1NjE2MyJ9.4W2sNUAKb3hgbwDutodUqFcpORAHU1dIFIqOFewnRiQ",
  "access_expires_at": "2026-10-29T14:57:33.535288847Z",
  "refresh_token": "bwQHj5WOXvQFDQT96rowsmwCrgrez5hTY-JTuBOJB34",
  "refresh_expires_at": "2026-11-28T14:42:33.534826085Z",
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
  "command_id": "ccbc706f-0a45-4847-9d6d-e0149e200d06",
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
  "id": "6912f243-c1a6-4ddf-a86d-ee71b491e745",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:47:34.108974Z",
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
  "command_id": "64d008de-9b5c-4ddb-aa98-3d4f412133ad",
  "platform": "ANDROID",
  "token": "sandbox-driver-23af8e85-a164-4ba7-944b-3c2f3f0917bd"
}
```

```json
{
  "id": "c380ebe4-d417-43ce-9a97-8c9082e29a78",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T14:42:34.411282Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "6fc5a45f-139b-4c2b-9e5a-3ca247bc591f",
  "platform": "ANDROID",
  "token": "sandbox-rider-85b64be3-82c5-429b-b49a-2cd6b1e5fcb1"
}
```

```json
{
  "id": "c42c9f2c-04ae-4501-8fcb-fbde91aa0574",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T14:42:34.714998Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3511ea1e-2eea-41ae-882a-af9c81899800",
  "quote_id": "6912f243-c1a6-4ddf-a86d-ee71b491e745",
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
  "id": "1f6a8d26-2b0f-4088-bf20-72fca14b14e7",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b98ae1c3-21ea-4364-bf01-d1e07255a832",
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
  "created_at": "2026-10-29T14:42:35.022731Z",
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
    "id": "96272fb5-83ea-4d47-9891-e10f120f9f74",
    "order_id": "1f6a8d26-2b0f-4088-bf20-72fca14b14e7",
    "expires_at": "2026-10-29T14:42:50.025647Z",
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

`POST /api/driver/v1/offers/96272fb5-83ea-4d47-9891-e10f120f9f74/accept` → **200**

```json
{
  "command_id": "edddea6b-57da-4306-be46-c51a9c7ee520"
}
```

```json
{
  "id": "e88c4e5e-4f49-4b5b-af0b-cfcc8f08d3d2",
  "order_id": "1f6a8d26-2b0f-4088-bf20-72fca14b14e7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "602efb3d-87da-456d-bc3c-1889b6158ee6",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T14:42:34.999Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T14:42:34.999Z` → **200**

```json
[
  {
    "at": "2026-10-29T14:42:36.074328488Z",
    "token_suffix": "0917bd",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "7e80cff5-8359-4a9f-8927-73094601fad6",
      "order_version": "2",
      "order_id": "1f6a8d26-2b0f-4088-bf20-72fca14b14e7",
      "type": "driver.offer",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380674136389&after=2026-10-29T14:42:34.999Z` → **200**

```json
[
  {
    "at": "2026-10-29T14:42:36.07678845Z",
    "token_suffix": "e5fcb1",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "fffbdf70-cc2f-427a-96d3-f3cf075310be",
      "order_version": "3",
      "order_id": "1f6a8d26-2b0f-4088-bf20-72fca14b14e7",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/1f6a8d26-2b0f-4088-bf20-72fca14b14e7/messages` → **201**

```json
{
  "command_id": "96897ba4-4a0c-48f7-98de-6376cdb50fc0",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "14f2100a-5401-42cb-8842-4df1bca57f50",
  "order_id": "1f6a8d26-2b0f-4088-bf20-72fca14b14e7",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T14:42:37.00358212Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "602efb3d-87da-456d-bc3c-1889b6158ee6",
  "order_id": "1f6a8d26-2b0f-4088-bf20-72fca14b14e7",
  "assignment_id": "e88c4e5e-4f49-4b5b-af0b-cfcc8f08d3d2",
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

`POST /api/driver/v1/trips/602efb3d-87da-456d-bc3c-1889b6158ee6/messages` → **201**

```json
{
  "command_id": "831c6484-1eb8-47cc-a755-9d60ed32c015",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "7b992ff7-8c2c-4728-94bf-faa152a2740d",
  "order_id": "1f6a8d26-2b0f-4088-bf20-72fca14b14e7",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T14:42:37.572415019Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/1f6a8d26-2b0f-4088-bf20-72fca14b14e7/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/602efb3d-87da-456d-bc3c-1889b6158ee6/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674136389"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/1f50a33c-c96c-42cb-9eb0-5c804120a523/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:38Z",
    "sequence": 1793284958408
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1f50a33c-c96c-42cb-9eb0-5c804120a523",
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
  "last_heartbeat_at": "2026-10-29T14:42:38.427542Z",
  "last_location_at": "2026-10-29T14:42:38.427542Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "602efb3d-87da-456d-bc3c-1889b6158ee6",
  "order_id": "1f6a8d26-2b0f-4088-bf20-72fca14b14e7",
  "assignment_id": "e88c4e5e-4f49-4b5b-af0b-cfcc8f08d3d2",
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

`POST /api/driver/v1/trips/602efb3d-87da-456d-bc3c-1889b6158ee6/arrive` → **200**

```json
{
  "command_id": "fb9cd3d1-8118-4369-9a44-60f0b62d9bf4",
  "expected_version": 0
}
```

```json
{
  "id": "602efb3d-87da-456d-bc3c-1889b6158ee6",
  "order_id": "1f6a8d26-2b0f-4088-bf20-72fca14b14e7",
  "assignment_id": "e88c4e5e-4f49-4b5b-af0b-cfcc8f08d3d2",
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
  "arrived_at": "2026-10-29T14:42:38.992169Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/602efb3d-87da-456d-bc3c-1889b6158ee6/start` → **200**

```json
{
  "command_id": "5dce662e-12bf-49dc-86a6-b573628907d7",
  "expected_version": 1
}
```

```json
{
  "id": "602efb3d-87da-456d-bc3c-1889b6158ee6",
  "order_id": "1f6a8d26-2b0f-4088-bf20-72fca14b14e7",
  "assignment_id": "e88c4e5e-4f49-4b5b-af0b-cfcc8f08d3d2",
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
  "arrived_at": "2026-10-29T14:42:38.992169Z",
  "started_at": "2026-10-29T14:42:39.316086Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/1f50a33c-c96c-42cb-9eb0-5c804120a523/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:39Z",
    "sequence": 1793284959644
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1f50a33c-c96c-42cb-9eb0-5c804120a523",
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
  "last_heartbeat_at": "2026-10-29T14:42:39.665273Z",
  "last_location_at": "2026-10-29T14:42:39.665273Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/602efb3d-87da-456d-bc3c-1889b6158ee6/complete` → **200**

```json
{
  "command_id": "cc98361a-e4e9-4fbd-9d3c-cfed018abd67",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:42:39Z",
  "cash_received": true
}
```

```json
{
  "id": "602efb3d-87da-456d-bc3c-1889b6158ee6",
  "order_id": "1f6a8d26-2b0f-4088-bf20-72fca14b14e7",
  "assignment_id": "e88c4e5e-4f49-4b5b-af0b-cfcc8f08d3d2",
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
  "arrived_at": "2026-10-29T14:42:38.992169Z",
  "started_at": "2026-10-29T14:42:39.316086Z",
  "completed_at": "2026-10-29T14:42:40.00398Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/1f6a8d26-2b0f-4088-bf20-72fca14b14e7` → **200**

```json
{
  "id": "1f6a8d26-2b0f-4088-bf20-72fca14b14e7",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "b98ae1c3-21ea-4364-bf01-d1e07255a832",
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
    "id": "e88c4e5e-4f49-4b5b-af0b-cfcc8f08d3d2",
    "order_id": "1f6a8d26-2b0f-4088-bf20-72fca14b14e7",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "602efb3d-87da-456d-bc3c-1889b6158ee6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:42:35.022731Z",
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
    "id": "1f6a8d26-2b0f-4088-bf20-72fca14b14e7",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-29T14:42:35.022731Z",
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
    "id": "602efb3d-87da-456d-bc3c-1889b6158ee6",
    "order_id": "1f6a8d26-2b0f-4088-bf20-72fca14b14e7",
    "order_short_number": 13,
    "created_at": "2026-10-29T14:42:35.609312Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "b58c1536-4dcf-469d-aadc-589517626965",
    "order_id": "83b04032-460f-4211-999c-ccf38a8aaf9b",
    "order_short_number": 8,
    "created_at": "2026-10-29T14:41:14.66405Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "2afb0bd6-9b79-42b0-a860-003f31fc4591",
    "order_id": "f82cf60c-75cb-4a25-b379-9d938e776a84",
    "order_short_number": 3,
    "created_at": "2026-10-29T14:40:30.133122Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "961a3ac6-c41b-4703-9e73-777fefcb79e9",
    "order_id": "c21ef961-6fb2-44ba-9866-bc846508c0af",
    "order_short_number": 2,
    "created_at": "2026-10-29T14:40:10.554558Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "d07ed68e-05d3-459c-9e9f-9836d5455c9f",
    "order_id": "c10a20df-2161-4c88-95ab-3fbae91cfb4d",
    "order_short_number": 1,
    "created_at": "2026-10-29T14:40:00.681012Z",
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

`GET /api/rider/v1/orders/1f6a8d26-2b0f-4088-bf20-72fca14b14e7/tip` → **200**

```json
{
  "order_id": "1f6a8d26-2b0f-4088-bf20-72fca14b14e7",
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
  "available_until": "2026-10-30T14:42:40.00398Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/1f6a8d26-2b0f-4088-bf20-72fca14b14e7/tip` → **201**

```json
{
  "command_id": "ed96e7b6-69bf-4267-821b-0b6eace845b8",
  "amount_minor": 1100
}
```

```json
{
  "id": "0b1edf80-970c-46fe-b08c-fc5851519f4b",
  "order_id": "1f6a8d26-2b0f-4088-bf20-72fca14b14e7",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T14:42:45.026994Z"
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
  "session_id": "6d72acfc-4a1d-49ce-ab27-e1274ee48fcb",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4NjUsImlhdCI6MTc5MzI4NDk2NSwianRpIjoiYjEyNmIxZTItY2Q4NC00YWFkLWIzYzAtZGYwNDQwNGQ3NTJjIiwic2lkIjoiNmQ3MmFjZmMtNGExZC00OWNlLWFiMjctZTEyNzRlZTQ4ZmNiIn0.JPs3d8OIvkBEra9At1-GZYTWc65gHvjFD0O1wjbd604",
  "access_expires_at": "2026-10-29T14:57:45.607933542Z",
  "refresh_token": "KGUtIOu15K9a1YGROOZ-wOplcEzUC97IPcOPEJGkys8",
  "refresh_expires_at": "2026-10-30T02:42:45.607411099Z",
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
          "APP": 12,
          "PHONE": 1
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
      "APP": 12,
      "PHONE": 1
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
  "generated_at": "2026-10-29T14:42:45.89937879Z"
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
  "generated_at": "2026-10-29T14:42:46.195750593Z"
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
  "session_id": "148eccfa-ae1e-407f-a27c-307aa7dbfd9e",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4NjYsImlhdCI6MTc5MzI4NDk2NiwianRpIjoiYzA0M2ViOTItZWQ5Mi00YzlhLWE5YjgtNmQ3M2U3NTZiZGI2Iiwic2lkIjoiMTQ4ZWNjZmEtYWUxZS00MDdmLWEyN2MtMzA3YWE3ZGJmZDllIn0.nqydH7jnt7UrKkxMx6AaRgIoPQs-3qZh4h7d8KgyXT0",
  "access_expires_at": "2026-10-29T14:57:46.783901461Z",
  "refresh_token": "fX_AKbvfzRLA4F9FOzZ36NP8iXO94lshza066nwrJbs",
  "refresh_expires_at": "2026-10-30T02:42:46.783373047Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/1f6a8d26-2b0f-4088-bf20-72fca14b14e7/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:42:35.023188Z",
      "actor": {
        "type": "CLIENT",
        "id": "b98ae1c3-21ea-4364-bf01-d1e07255a832",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "1f6a8d26-2b0f-4088-bf20-72fca14b14e7",
        "quote_id": "6912f243-c1a6-4ddf-a86d-ee71b491e745",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "621b6d0c-0087-4db0-9456-68faca31cd66"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:42:35.024955Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1f6a8d26-2b0f-4088-bf20-72fca14b14e7",
        "attempt_id": "79ebc5ff-4667-4faf-905d-56d69b6b60d4",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "621b6d0c-0087-4db0-9456-68faca31cd66"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:42:35.028417Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "96272fb5-83ea-4d47-9891-e10f120f9f74",
        "order_id": "1f6a8d26-2b0f-4088-bf20-72fca14b14e7",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "621b6d0c-0087-4db0-9456-68faca31cd66"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T14:42:35.610953Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "96272fb5-83ea-4d47-9891-e10f120f9f74",
        "order_id": "1f6a8d26-2b0f-4088-bf20-72fca14b14e7",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "e88c4e5e-4f49-4b5b-af0b-cfcc8f08d3d2"
      },
      "correlation_id": "59ea9e2a-c991-4944-8df4-695b41859c14"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T14:42:47.349740577Z",
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
      "last_location_at": "2026-10-29T14:42:39.665273Z",
      "order_id": null
    }
  ]
}
```

Done: order 1f6a8d26-2b0f-4088-bf20-72fca14b14e7.

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
  "session_id": "ed082830-9640-4db6-bd23-58d8087e9663",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4NjcsImlhdCI6MTc5MzI4NDk2NywianRpIjoiYjgzNGM0YWUtMzRkNi00NWQzLWFlODAtNzNmYTkwNjRlNWE4Iiwic2lkIjoiZWQwODI4MzAtOTY0MC00ZGI2LWJkMjMtNThkODA4N2U5NjYzIn0.6uWF-_JiJ12jPgTbZtqJt2WySss04OlE6xtuibee_R8",
  "access_expires_at": "2026-10-29T14:57:47.96150743Z",
  "refresh_token": "QvzXIrf5ly3rOLE9XMMwNZeBAZMG8CYdmiKZ3UetYlI",
  "refresh_expires_at": "2026-10-30T02:42:47.960912852Z",
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
  "command_id": "d69d3445-38ee-4513-9ac3-47b9ec53c6d4",
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
  "timestamp": "2026-10-29T14:42:48.000+0000",
  "channel": {
    "id": "1730052000.194458764",
    "linkedid": "1730052000.194458764",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672637252"
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
  "timestamp": "2026-10-29T14:42:48.000+0000",
  "channel": {
    "id": "1730052000.194458764",
    "linkedid": "1730052000.194458764",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672637252"
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
  "session_id": "d6edcf8e-a81e-466e-8c04-41b43f209971",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4NjksImlhdCI6MTc5MzI4NDk2OSwianRpIjoiYTQ2MzU3NTctOGNlOC00MDI5LTkzZjYtN2Y2MmM2YjkwOGI2Iiwic2lkIjoiZDZlZGNmOGUtYTgxZS00NjZlLThjMDQtNDFiNDNmMjA5OTcxIn0.jdb1zaKYApwDFeLViZi3JAVKpcA3QmtxP6-17j5gjZU",
  "access_expires_at": "2026-10-29T14:57:49.185889553Z",
  "refresh_token": "VCCpUHHKVjnJt24FsM-iugkCo-gNDc4pApY5vki-WOc",
  "refresh_expires_at": "2026-10-30T02:42:49.184961735Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "034fddd0-ca58-454d-adf8-f0e352f6dbf7",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672637252",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T14:42:48Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/034fddd0-ca58-454d-adf8-f0e352f6dbf7/answer` → **200**

```json
{
  "command_id": "edcd27d4-8a00-4ed6-b886-9b54b0634bf7"
}
```

```json
{
  "id": "034fddd0-ca58-454d-adf8-f0e352f6dbf7",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672637252",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
  "order_ids": [],
  "started_at": "2026-10-29T14:42:48Z",
  "answered_at": "2026-10-29T14:42:49.763964Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.194458764",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "eb634013-aa78-43cf-9fe6-1325cf0d6a75",
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
  "id": "472a425c-1771-42e4-9d1d-eadeef2b74f6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:47:50.100174Z",
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
  "command_id": "987061f2-5f11-4be0-b8af-296bc7ca64a9",
  "quote_id": "472a425c-1771-42e4-9d1d-eadeef2b74f6",
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
    "phone": "+380672637252"
  },
  "call_id": "034fddd0-ca58-454d-adf8-f0e352f6dbf7"
}
```

```json
{
  "id": "ac76ec56-4958-4c4b-a7c5-6c856962d43f",
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
  "created_at": "2026-10-29T14:42:50.413509Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672637252"
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
    "id": "1730052000.194458764",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "034fddd0-ca58-454d-adf8-f0e352f6dbf7",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672637252",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
      "order_ids": [
        "ac76ec56-4958-4c4b-a7c5-6c856962d43f"
      ],
      "started_at": "2026-10-29T14:42:48Z",
      "answered_at": "2026-10-29T14:42:49.763964Z",
      "ended_at": "2026-10-29T14:42:50.736112Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "7a0dba4c-74c1-40db-93a4-db72bc08aa1d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672755316",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
      "order_ids": [],
      "started_at": "2026-10-29T14:40:18.82557Z",
      "answered_at": "2026-10-29T14:40:19.152143Z",
      "ended_at": "2026-10-29T14:40:19.456649Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:40:25.630514Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/ac76ec56-4958-4c4b-a7c5-6c856962d43f` → **200**

```json
{
  "id": "ac76ec56-4958-4c4b-a7c5-6c856962d43f",
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
  "created_at": "2026-10-29T14:42:50.413509Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672637252"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/ac76ec56-4958-4c4b-a7c5-6c856962d43f` → **200**

```json
{
  "id": "ac76ec56-4958-4c4b-a7c5-6c856962d43f",
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
  "created_at": "2026-10-29T14:42:50.413509Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672637252"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ac76ec56-4958-4c4b-a7c5-6c856962d43f/cancel` → **200**

```json
{
  "command_id": "f53f2f83-1e9a-4639-8e8d-52c01c7fbe30",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "ac76ec56-4958-4c4b-a7c5-6c856962d43f",
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
  "created_at": "2026-10-29T14:42:50.413509Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672637252"
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

Done: call 034fddd0-ca58-454d-adf8-f0e352f6dbf7 with order ac76ec56-4958-4c4b-a7c5-6c856962d43f.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-4525"
}
```

```json
{
  "challenge_id": "98222973-1b10-4f2f-b8a0-4dacf70ea7fc",
  "expires_at": "2026-10-29T14:47:52.008378363Z",
  "resend_available_at": "2026-10-29T14:42:53.008378363Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "971246",
  "sent_at": "2026-10-29T14:42:52.011894803Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "98222973-1b10-4f2f-b8a0-4dacf70ea7fc",
  "code": "971246",
  "device_ref": "sandbox-4525"
}
```

```json
{
  "session_id": "f1a10d37-b946-43bd-89bf-a0fa1aefc5f1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTg3MiwiaWF0IjoxNzkzMjg0OTcyLCJqdGkiOiIwOGI3NTkyOC01MWVkLTQ1Y2UtYTQwYS1lYmY0ZjIyMGE2MTciLCJzaWQiOiJmMWExMGQzNy1iOTQ2LTQzYmQtODliZi1hMGZhMWFlZmM1ZjEifQ.qdk9vmvj6wYU1iMnRllyK9jexIv1dGNJnncoGhSuWvA",
  "access_expires_at": "2026-10-29T14:57:52.325528272Z",
  "refresh_token": "Zh1sRurfybaiBPzh7YlOQC51tvzewfT89n2awCE2qbs",
  "refresh_expires_at": "2026-11-28T14:42:52.324935237Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1f50a33c-c96c-42cb-9eb0-5c804120a523",
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
  "last_heartbeat_at": "2026-10-29T14:42:39.665273Z",
  "last_location_at": "2026-10-29T14:42:39.665273Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1f50a33c-c96c-42cb-9eb0-5c804120a523/handover` → **200**

```json
{
  "command_id": "133c05e1-77ca-47f3-9a6b-1b0266a0896f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1f50a33c-c96c-42cb-9eb0-5c804120a523",
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
  "last_heartbeat_at": "2026-10-29T14:42:39.665273Z",
  "last_location_at": "2026-10-29T14:42:39.665273Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1f50a33c-c96c-42cb-9eb0-5c804120a523/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:53Z",
    "sequence": 1793284973193
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1f50a33c-c96c-42cb-9eb0-5c804120a523",
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
  "last_heartbeat_at": "2026-10-29T14:42:53.213325Z",
  "last_location_at": "2026-10-29T14:42:53.213325Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669483003",
  "device_ref": "sandbox-22287"
}
```

```json
{
  "challenge_id": "233582f5-b2d4-4f33-94cb-f8b0704e4839",
  "expires_at": "2026-10-29T14:47:53.505424545Z",
  "resend_available_at": "2026-10-29T14:42:54.505424545Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669483003` → **200**

```json
{
  "phone": "+380669483003",
  "audience": "CLIENT",
  "code": "511975",
  "sent_at": "2026-10-29T14:42:53.507980326Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "233582f5-b2d4-4f33-94cb-f8b0704e4839",
  "code": "511975",
  "device_ref": "sandbox-22287"
}
```

```json
{
  "session_id": "a47a366a-97d7-4c51-b61d-e836217aeea0",
  "subject": {
    "type": "CLIENT",
    "id": "b4fb3c6a-004c-4eb2-b518-2436cf805859"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNGZiM2M2YS0wMDRjLTRlYjItYjUxOC0yNDM2Y2Y4MDU4NTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODczLCJpYXQiOjE3OTMyODQ5NzMsImp0aSI6ImQwOGI1OGE1LWJmNzAtNDQ4Zi04YTEyLTljYzE3ZDkyZDA2MiIsInNpZCI6ImE0N2EzNjZhLTk3ZDctNGM1MS1iNjFkLWU4MzYyMTdhZWVhMCJ9.vDdk--Gn1EKBfS6WC5kEwrRlFYBR1Ik9nTupU_chZWc",
  "access_expires_at": "2026-10-29T14:57:53.821727189Z",
  "refresh_token": "uCWXde_L8xowUygeJSJUJs53D0XWyCIRv087ulN3kfQ",
  "refresh_expires_at": "2026-11-28T14:42:53.821040981Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ba61a0b2-44ac-4743-b420-e8f2286daceb",
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
  "id": "136b6c0d-52e3-451c-939a-269b3af98a15",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:47:54.112286Z",
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
  "command_id": "2524d072-c3b1-4dd2-b603-b1bd70261638",
  "quote_id": "136b6c0d-52e3-451c-939a-269b3af98a15",
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
  "id": "3aac461a-f211-40ee-ae38-a567a790c363",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b4fb3c6a-004c-4eb2-b518-2436cf805859",
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
  "created_at": "2026-10-29T14:42:54.411433Z",
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
    "id": "7d15a317-3aaf-46a5-86fc-b6c0b9ead15b",
    "order_id": "3aac461a-f211-40ee-ae38-a567a790c363",
    "expires_at": "2026-10-29T14:43:09.414379Z",
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

`POST /api/driver/v1/offers/7d15a317-3aaf-46a5-86fc-b6c0b9ead15b/accept` → **200**

```json
{
  "command_id": "f46b33e5-5e36-4545-9425-aa5dd03bab67"
}
```

```json
{
  "id": "7cfabb99-5cb5-42f7-9329-ff51f4d1fa09",
  "order_id": "3aac461a-f211-40ee-ae38-a567a790c363",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cbd6f834-9b25-48e4-9098-417243a8a96c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cbd6f834-9b25-48e4-9098-417243a8a96c",
  "order_id": "3aac461a-f211-40ee-ae38-a567a790c363",
  "assignment_id": "7cfabb99-5cb5-42f7-9329-ff51f4d1fa09",
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

`POST /api/driver/v1/work-sessions/1f50a33c-c96c-42cb-9eb0-5c804120a523/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:55Z",
    "sequence": 1793284975584
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1f50a33c-c96c-42cb-9eb0-5c804120a523",
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
  "last_heartbeat_at": "2026-10-29T14:42:55.602821Z",
  "last_location_at": "2026-10-29T14:42:55.602821Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/cbd6f834-9b25-48e4-9098-417243a8a96c/arrive` → **200**

```json
{
  "command_id": "f9d1d84a-54e8-4f73-bfd6-9ed516e57344",
  "expected_version": 0
}
```

```json
{
  "id": "cbd6f834-9b25-48e4-9098-417243a8a96c",
  "order_id": "3aac461a-f211-40ee-ae38-a567a790c363",
  "assignment_id": "7cfabb99-5cb5-42f7-9329-ff51f4d1fa09",
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
  "arrived_at": "2026-10-29T14:42:55.898966Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cbd6f834-9b25-48e4-9098-417243a8a96c/start` → **200**

```json
{
  "command_id": "4659ce56-5558-46ea-8609-b8d70bcfd3d8",
  "expected_version": 1
}
```

```json
{
  "id": "cbd6f834-9b25-48e4-9098-417243a8a96c",
  "order_id": "3aac461a-f211-40ee-ae38-a567a790c363",
  "assignment_id": "7cfabb99-5cb5-42f7-9329-ff51f4d1fa09",
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
  "arrived_at": "2026-10-29T14:42:55.898966Z",
  "started_at": "2026-10-29T14:42:56.194885Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/1f50a33c-c96c-42cb-9eb0-5c804120a523/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:56Z",
    "sequence": 1793284976478
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1f50a33c-c96c-42cb-9eb0-5c804120a523",
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
  "last_heartbeat_at": "2026-10-29T14:42:56.496168Z",
  "last_location_at": "2026-10-29T14:42:56.496168Z",
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
  "device_ref": "sandbox-5113"
}
```

```json
{
  "challenge_id": "6e5131d5-62d4-425d-8013-6144fb83f4b4",
  "expires_at": "2026-10-29T14:47:56.778683857Z",
  "resend_available_at": "2026-10-29T14:42:57.778683857Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "734144",
  "sent_at": "2026-10-29T14:42:56.781472602Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6e5131d5-62d4-425d-8013-6144fb83f4b4",
  "code": "734144",
  "device_ref": "sandbox-5113"
}
```

```json
{
  "session_id": "08ad0d4d-23cc-4e60-9fbb-210a65b2f077",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTg3NywiaWF0IjoxNzkzMjg0OTc3LCJqdGkiOiI2MTkxNjYzNS0yMTQ4LTQyMGEtYjY3Zi03ZTQ2OGMxZTFkMDIiLCJzaWQiOiIwOGFkMGQ0ZC0yM2NjLTRlNjAtOWZiYi0yMTBhNjViMmYwNzcifQ.91uaPLG9r_9ezXCWmod2KpVZe-zl-8gWGLc6u-bnVis",
  "access_expires_at": "2026-10-29T14:57:57.101278542Z",
  "refresh_token": "Hl7VtF0k6XNQOM7p42WAFxTx80SWrA8EmUaGNc_cZ9M",
  "refresh_expires_at": "2026-11-28T14:42:57.100531831Z",
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
  "command_id": "eaa56c7a-8e0b-4daa-b9e0-0b8ab5df30c4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:57Z",
    "sequence": 1793284977666
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "518eed20-58f0-4a8b-a779-e0b6d3c598bf",
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
  "last_heartbeat_at": "2026-10-29T14:42:57.684644Z",
  "last_location_at": "2026-10-29T14:42:57.684644Z",
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
  "session_id": "e3507e68-49f1-4193-ac36-00f598e90c5e",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4NzgsImlhdCI6MTc5MzI4NDk3OCwianRpIjoiYTJmNTFhYjQtZDMwMS00ODQyLWJhOGItZjUyMmViMDUxYzExIiwic2lkIjoiZTM1MDdlNjgtNDlmMS00MTkzLWFjMzYtMDBmNTk4ZTkwYzVlIn0.x_FTLBrLnjoVcyu83rJrJcoUTpmKj6OdxTmivp0sclc",
  "access_expires_at": "2026-10-29T14:57:58.267417454Z",
  "refresh_token": "PzdbqpK_9Lq2S6_SqfwXrDp2an5eGi3Xmeyb4w16cqs",
  "refresh_expires_at": "2026-10-30T02:42:58.266738299Z",
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
  "session_id": "bf2b7d0b-7236-430b-9b61-1e1b50bf10f2",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4NzgsImlhdCI6MTc5MzI4NDk3OCwianRpIjoiNWQ2ODY3MWQtNTYxYy00ODgzLWJlZTEtYzJmYTRlMjlkNjE0Iiwic2lkIjoiYmYyYjdkMGItNzIzNi00MzBiLTliNjEtMWUxYjUwYmYxMGYyIn0.gCfyJwZq7oNv1URJJPN4XO99C1UpnSWvU_jUDs44pQg",
  "access_expires_at": "2026-10-29T14:57:58.84968163Z",
  "refresh_token": "HcnSz_rEand3AEGlMwXK34X-8HJw2QIYcm8Tubc9SQI",
  "refresh_expires_at": "2026-10-30T02:42:58.849078546Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3aac461a-f211-40ee-ae38-a567a790c363` → **200**

```json
{
  "id": "3aac461a-f211-40ee-ae38-a567a790c363",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "b4fb3c6a-004c-4eb2-b518-2436cf805859",
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
    "id": "7cfabb99-5cb5-42f7-9329-ff51f4d1fa09",
    "order_id": "3aac461a-f211-40ee-ae38-a567a790c363",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "cbd6f834-9b25-48e4-9098-417243a8a96c",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T14:42:54.411433Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3aac461a-f211-40ee-ae38-a567a790c363/interrupt` → **200**

```json
{
  "command_id": "71f63fbb-9ab3-4667-99b6-646bef8ce033",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "3aac461a-f211-40ee-ae38-a567a790c363",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "b4fb3c6a-004c-4eb2-b518-2436cf805859",
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
      "id": "7cfabb99-5cb5-42f7-9329-ff51f4d1fa09",
      "order_id": "3aac461a-f211-40ee-ae38-a567a790c363",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "cbd6f834-9b25-48e4-9098-417243a8a96c",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T14:42:54.411433Z",
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
    "id": "664d9a9d-4012-4f6b-b502-32c03cc0581a",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "b4fb3c6a-004c-4eb2-b518-2436cf805859",
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
    "id": "e891448e-9703-4c01-856b-593857bba85e",
    "order_id": "664d9a9d-4012-4f6b-b502-32c03cc0581a",
    "expires_at": "2026-10-29T14:43:14.465534Z",
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

`POST /api/driver/v1/offers/e891448e-9703-4c01-856b-593857bba85e/accept` → **200**

```json
{
  "command_id": "2f595e56-aa24-4f55-aed7-c75b99cee1b1"
}
```

```json
{
  "id": "582a7d9f-c244-4154-91de-443153c6de5a",
  "order_id": "664d9a9d-4012-4f6b-b502-32c03cc0581a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a5af3c8d-af51-47e2-96cc-3df54bcd3d34",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a5af3c8d-af51-47e2-96cc-3df54bcd3d34",
  "order_id": "664d9a9d-4012-4f6b-b502-32c03cc0581a",
  "assignment_id": "582a7d9f-c244-4154-91de-443153c6de5a",
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
  "session_id": "518eed20-58f0-4a8b-a779-e0b6d3c598bf",
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
  "last_heartbeat_at": "2026-10-29T14:42:57.684644Z",
  "last_location_at": "2026-10-29T14:42:57.684644Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/518eed20-58f0-4a8b-a779-e0b6d3c598bf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:43:00Z",
    "sequence": 1793284980955
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "518eed20-58f0-4a8b-a779-e0b6d3c598bf",
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
  "last_heartbeat_at": "2026-10-29T14:43:00.975249Z",
  "last_location_at": "2026-10-29T14:43:00.975249Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a5af3c8d-af51-47e2-96cc-3df54bcd3d34/arrive` → **200**

```json
{
  "command_id": "f686e26d-16b2-4d95-9909-0c3235a1d015",
  "expected_version": 0
}
```

```json
{
  "id": "a5af3c8d-af51-47e2-96cc-3df54bcd3d34",
  "order_id": "664d9a9d-4012-4f6b-b502-32c03cc0581a",
  "assignment_id": "582a7d9f-c244-4154-91de-443153c6de5a",
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
  "arrived_at": "2026-10-29T14:43:01.275037Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a5af3c8d-af51-47e2-96cc-3df54bcd3d34/start` → **200**

```json
{
  "command_id": "b74e78a6-a091-4760-a6e7-a11e2c859b97",
  "expected_version": 1
}
```

```json
{
  "id": "a5af3c8d-af51-47e2-96cc-3df54bcd3d34",
  "order_id": "664d9a9d-4012-4f6b-b502-32c03cc0581a",
  "assignment_id": "582a7d9f-c244-4154-91de-443153c6de5a",
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
  "arrived_at": "2026-10-29T14:43:01.275037Z",
  "started_at": "2026-10-29T14:43:01.578506Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a5af3c8d-af51-47e2-96cc-3df54bcd3d34/complete` → **200**

```json
{
  "command_id": "6257a4f0-1fbf-49b1-8077-866307e091c0",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:43:01Z"
}
```

```json
{
  "id": "a5af3c8d-af51-47e2-96cc-3df54bcd3d34",
  "order_id": "664d9a9d-4012-4f6b-b502-32c03cc0581a",
  "assignment_id": "582a7d9f-c244-4154-91de-443153c6de5a",
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
  "arrived_at": "2026-10-29T14:43:01.275037Z",
  "started_at": "2026-10-29T14:43:01.578506Z",
  "completed_at": "2026-10-29T14:43:01.883033Z",
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
    "id": "664d9a9d-4012-4f6b-b502-32c03cc0581a",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-29T14:42:59.456168Z",
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
    "id": "3aac461a-f211-40ee-ae38-a567a790c363",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-29T14:42:54.411433Z",
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

`GET /api/operator/v1/orders/3aac461a-f211-40ee-ae38-a567a790c363/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:42:54.411931Z",
      "actor": {
        "type": "CLIENT",
        "id": "b4fb3c6a-004c-4eb2-b518-2436cf805859",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "3aac461a-f211-40ee-ae38-a567a790c363",
        "quote_id": "136b6c0d-52e3-451c-939a-269b3af98a15",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "a2480277-9dd8-4b0a-b1b1-e18b83773695"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:42:54.413701Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3aac461a-f211-40ee-ae38-a567a790c363",
        "attempt_id": "b66d3962-5015-48c2-a3ab-b977d05e3cf6",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "a2480277-9dd8-4b0a-b1b1-e18b83773695"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:42:54.416325Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "7d15a317-3aaf-46a5-86fc-b6c0b9ead15b",
        "order_id": "3aac461a-f211-40ee-ae38-a567a790c363",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "a2480277-9dd8-4b0a-b1b1-e18b83773695"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T14:42:55.03524Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "7d15a317-3aaf-46a5-86fc-b6c0b9ead15b",
        "order_id": "3aac461a-f211-40ee-ae38-a567a790c363",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "7cfabb99-5cb5-42f7-9329-ff51f4d1fa09"
      },
      "correlation_id": "645b9af6-abbf-4ec1-ae9f-9133d1b5434f"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/664d9a9d-4012-4f6b-b502-32c03cc0581a/tip` → **200**

```json
{
  "order_id": "664d9a9d-4012-4f6b-b502-32c03cc0581a",
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
  "available_until": "2026-10-30T14:43:01.883033Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/664d9a9d-4012-4f6b-b502-32c03cc0581a/tip` → **409**

```json
{
  "command_id": "13837425-b5af-4642-864d-268d6463e560",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/664d9a9d-4012-4f6b-b502-32c03cc0581a/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "42020589-7c25-4e95-89f2-4b30e6e25522"
}
```

Done: interrupted 3aac461a-f211-40ee-ae38-a567a790c363, follow-up 664d9a9d-4012-4f6b-b502-32c03cc0581a.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1f50a33c-c96c-42cb-9eb0-5c804120a523",
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
  "last_heartbeat_at": "2026-10-29T14:42:56.496168Z",
  "last_location_at": "2026-10-29T14:42:56.496168Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1f50a33c-c96c-42cb-9eb0-5c804120a523/close` → **200**

```json
{
  "command_id": "183502b7-609b-4084-9517-443a554909b2",
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
  "session_id": "518eed20-58f0-4a8b-a779-e0b6d3c598bf",
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
  "last_heartbeat_at": "2026-10-29T14:43:00.975249Z",
  "last_location_at": "2026-10-29T14:43:00.975249Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/518eed20-58f0-4a8b-a779-e0b6d3c598bf/close` → **200**

```json
{
  "command_id": "fe67c854-e32a-4ac0-a279-5412fc4a8d37",
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
  "session_id": "9d80e398-5785-4764-b737-8ac3a97eb26e",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4ODgsImlhdCI6MTc5MzI4NDk4OCwianRpIjoiZmRmOWFhMzItMDI1Yy00Njk0LTk4MzMtZjEwNzdhMzhhYmU1Iiwic2lkIjoiOWQ4MGUzOTgtNTc4NS00NzY0LWI3MzctOGFjM2E5N2ViMjZlIn0.y_J74zZwjcnEzLQLcIy_1RXiji2EmcqXV3h7xf9MFi8",
  "access_expires_at": "2026-10-29T14:58:08.069231425Z",
  "refresh_token": "ONVx5fuL5a14gW6T1170Lgavy_VzkwOyXerBCUt9HV4",
  "refresh_expires_at": "2026-10-30T02:43:08.068559183Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "e37be3c0-dbe3-4054-8432-09607fea5c04",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:43:08Z"
}
```

```json
{
  "id": "886863c0-ef76-47a7-9bec-dcad289b5a2e",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:43:08Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/886863c0-ef76-47a7-9bec-dcad289b5a2e/publish` → **200**

```json
{
  "command_id": "63325207-8d4d-4823-b8ef-db086445901f",
  "expected_version": 0
}
```

```json
{
  "id": "886863c0-ef76-47a7-9bec-dcad289b5a2e",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:43:08.663811Z",
  "published_at": "2026-10-29T14:43:08.663811Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "886863c0-ef76-47a7-9bec-dcad289b5a2e",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T14:43:08.663811Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638844179",
  "device_ref": "sandbox-12362"
}
```

```json
{
  "challenge_id": "cf00e6b2-c7ea-44b9-992d-8f6175819f36",
  "expires_at": "2026-10-29T14:48:09.236087636Z",
  "resend_available_at": "2026-10-29T14:43:10.236087636Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638844179` → **200**

```json
{
  "phone": "+380638844179",
  "audience": "CLIENT",
  "code": "933938",
  "sent_at": "2026-10-29T14:43:09.238867564Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cf00e6b2-c7ea-44b9-992d-8f6175819f36",
  "code": "933938",
  "device_ref": "sandbox-12362"
}
```

```json
{
  "session_id": "f1d2d905-0c02-4e97-a928-0c32dd5fd35c",
  "subject": {
    "type": "CLIENT",
    "id": "db96eecf-f537-4c6b-a02a-148e71fc20f6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjk2ZWVjZi1mNTM3LTRjNmItYTAyYS0xNDhlNzFmYzIwZjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODg5LCJpYXQiOjE3OTMyODQ5ODksImp0aSI6IjI1YWNjMGM2LTgxNDEtNGRmNy1iMzNlLTY3M2FjNjRhY2IzNCIsInNpZCI6ImYxZDJkOTA1LTBjMDItNGU5Ny1hOTI4LTBjMzJkZDVmZDM1YyJ9.4LCzRGRF-eEhnKcc55-ym7hst654FIPMCTHEx4T1bZg",
  "access_expires_at": "2026-10-29T14:58:09.553717428Z",
  "refresh_token": "MP5_oTnGsWOM0pfXqXE6Cv-erW9KB2RKnNfdq8I1BNw",
  "refresh_expires_at": "2026-11-28T14:43:09.553138442Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "886863c0-ef76-47a7-9bec-dcad289b5a2e",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T14:43:08.663811Z",
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
  "command_id": "8b264d36-d5ec-483e-b454-4acf9c40aedd",
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
  "id": "1ee0cd8e-6717-4766-90f0-4178c49784e5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:48:10.150471Z",
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
  "command_id": "7fa401df-f543-4ba4-a303-6264064a527a",
  "quote_id": "1ee0cd8e-6717-4766-90f0-4178c49784e5",
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
  "correlation_id": "a2ead567-a5cc-4236-9d71-9c8bdb135bcb"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "663982a4-899d-450f-9f27-44aff091c0aa",
  "version_id": "886863c0-ef76-47a7-9bec-dcad289b5a2e",
  "language": "uk"
}
```

```json
{
  "version_id": "886863c0-ef76-47a7-9bec-dcad289b5a2e",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T14:43:10.744403Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8ead49e9-553e-421e-a0cb-342ff85236e9",
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
  "id": "79ed8101-b303-43b6-a1c1-131df3a61728",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:48:11.041557Z",
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
  "command_id": "cde0e33e-a06e-426b-abd4-2f14191c060a",
  "quote_id": "79ed8101-b303-43b6-a1c1-131df3a61728",
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
  "id": "291d0500-e2ac-4133-87ef-4bd9396607fa",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "db96eecf-f537-4c6b-a02a-148e71fc20f6",
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
  "created_at": "2026-10-29T14:43:11.33199Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291d0500-e2ac-4133-87ef-4bd9396607fa` → **200**

```json
{
  "id": "291d0500-e2ac-4133-87ef-4bd9396607fa",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "db96eecf-f537-4c6b-a02a-148e71fc20f6",
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
  "created_at": "2026-10-29T14:43:11.33199Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/291d0500-e2ac-4133-87ef-4bd9396607fa/cancel` → **200**

```json
{
  "command_id": "4909880a-0825-4f56-a16f-4a3638373f0b",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "291d0500-e2ac-4133-87ef-4bd9396607fa",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "db96eecf-f537-4c6b-a02a-148e71fc20f6",
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
  "created_at": "2026-10-29T14:43:11.33199Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

## A published version never changes

`POST /api/admin/v1/legal-documents/886863c0-ef76-47a7-9bec-dcad289b5a2e` → **409**

```json
{
  "command_id": "7b13ff63-9369-41a9-923a-9cd34d243fc0",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:43:12Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/886863c0-ef76-47a7-9bec-dcad289b5a2e",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "dd30e3ec-5391-41f5-9865-3bd4bcff5c71"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "1b9e6a7f-2db4-4843-b526-f884d6ee8026",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T14:43:12Z"
}
```

```json
{
  "id": "717846c1-a670-4165-967e-52e27ad829f5",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T14:43:12Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/717846c1-a670-4165-967e-52e27ad829f5/publish` → **200**

```json
{
  "command_id": "3f95aca0-fb2b-47b8-8f6e-ce45efe5f3ed",
  "expected_version": 0
}
```

```json
{
  "id": "717846c1-a670-4165-967e-52e27ad829f5",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T14:43:12.827959Z",
  "published_at": "2026-10-29T14:43:12.827959Z",
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
  "device_ref": "sandbox-13196"
}
```

```json
{
  "challenge_id": "effc4a61-d5b7-46ea-90bf-b722f879cf96",
  "expires_at": "2026-10-29T14:48:13.122207756Z",
  "resend_available_at": "2026-10-29T14:43:14.122207756Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "831183",
  "sent_at": "2026-10-29T14:43:13.124939503Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "effc4a61-d5b7-46ea-90bf-b722f879cf96",
  "code": "831183",
  "device_ref": "sandbox-13196"
}
```

```json
{
  "session_id": "d9f4055e-f97a-4b71-9c90-d371a2ee85fa",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTg5MywiaWF0IjoxNzkzMjg0OTkzLCJqdGkiOiI3MWJkMjE3Ny05MDhkLTQ0N2MtOThkNC01NDc1YWFiNTVlMmIiLCJzaWQiOiJkOWY0MDU1ZS1mOTdhLTRiNzEtOWM5MC1kMzcxYTJlZTg1ZmEifQ.edrsUeOjaeTXXtY29P5qvjwfCiE4yB4Tdnv-PvxpwuQ",
  "access_expires_at": "2026-10-29T14:58:13.451657113Z",
  "refresh_token": "T-KI3P58S09I3drtkveuYUF4zs9edKCdILyIWvQCQ0M",
  "refresh_expires_at": "2026-11-28T14:43:13.45108329Z",
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
  "command_id": "74119982-24b1-4cc1-89ef-12667ab04898",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:43:14Z",
    "sequence": 1793284994543
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9e340043-5126-4916-b281-1cbfb13fb09e",
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
  "last_heartbeat_at": "2026-10-29T14:43:14.024069Z",
  "last_location_at": "2026-10-29T14:43:14.024069Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673401010",
  "device_ref": "sandbox-26406"
}
```

```json
{
  "challenge_id": "f148f9b0-6f54-4fe8-8561-9b2d36ab8a04",
  "expires_at": "2026-10-29T14:48:14.316000699Z",
  "resend_available_at": "2026-10-29T14:43:15.316000699Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673401010` → **200**

```json
{
  "phone": "+380673401010",
  "audience": "CLIENT",
  "code": "490455",
  "sent_at": "2026-10-29T14:43:14.318697643Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f148f9b0-6f54-4fe8-8561-9b2d36ab8a04",
  "code": "490455",
  "device_ref": "sandbox-26406"
}
```

```json
{
  "session_id": "99a511fa-9594-41a8-be3e-43aac506351a",
  "subject": {
    "type": "CLIENT",
    "id": "7cf37e84-e7a4-4636-8f96-faa5e49b09ed"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3Y2YzN2U4NC1lN2E0LTQ2MzYtOGY5Ni1mYWE1ZTQ5YjA5ZWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODk0LCJpYXQiOjE3OTMyODQ5OTQsImp0aSI6IjBmZTMwNmM0LWE3ZmQtNDY4Ny1iMDg0LTcwNzE4MzI0YmNjMSIsInNpZCI6Ijk5YTUxMWZhLTk1OTQtNDFhOC1iZTNlLTQzYWFjNTA2MzUxYSJ9.M8W9DNB6B273Q7wBNSmrYkrKU_DoEx78Hq8wSUZxPqE",
  "access_expires_at": "2026-10-29T14:58:14.619026459Z",
  "refresh_token": "15taOXIvRU386IPwsJ_Lc7m0wgtOSzhXyum28zdb0is",
  "refresh_expires_at": "2026-11-28T14:43:14.618512727Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "87f1a8fd-cf37-4b43-9866-ed10a14acc27",
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
  "id": "fa019184-0e5b-4a45-b5c7-2d831161c4ca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:48:14.904976Z",
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
  "command_id": "b927d9b3-5f6c-4365-9ab0-6767ddac6eae",
  "quote_id": "fa019184-0e5b-4a45-b5c7-2d831161c4ca",
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
    "phone": "+380670268958"
  }
}
```

```json
{
  "id": "c89244a4-58dc-44e2-8755-9236dd38303a",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7cf37e84-e7a4-4636-8f96-faa5e49b09ed",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:43:15.212141Z",
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
    "id": "2dd12407-c982-49c2-a2e3-a304607458a4",
    "order_id": "c89244a4-58dc-44e2-8755-9236dd38303a",
    "expires_at": "2026-10-29T14:43:30.215408Z",
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

`POST /api/driver/v1/offers/2dd12407-c982-49c2-a2e3-a304607458a4/accept` → **200**

```json
{
  "command_id": "66eed6fe-4e63-46ae-a1fe-6a6db89b1a55"
}
```

```json
{
  "id": "e7a0d320-9f7b-4f1b-83e8-ada60a2f39fb",
  "order_id": "c89244a4-58dc-44e2-8755-9236dd38303a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4a966e1e-d77b-40ac-9f5b-8cf7689aa9c1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4a966e1e-d77b-40ac-9f5b-8cf7689aa9c1",
  "order_id": "c89244a4-58dc-44e2-8755-9236dd38303a",
  "assignment_id": "e7a0d320-9f7b-4f1b-83e8-ada60a2f39fb",
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
    "phone": "+380670268958"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "be7ca6cc-4448-4603-8ca4-45b85bf548e7",
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
  "id": "7fc52f0c-5307-4149-b255-cb0d706eb666",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:48:16.394078Z",
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
  "command_id": "765227a7-9d9c-4b3c-804d-09e8ad495b67",
  "quote_id": "7fc52f0c-5307-4149-b255-cb0d706eb666",
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
  "id": "198dbad9-171b-4dc9-8cbd-ce7d23c6e390",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7cf37e84-e7a4-4636-8f96-faa5e49b09ed",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:43:16.689783Z",
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
  "command_id": "c4eb75da-cd06-4bb2-9baa-215ff9c3ea6c",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T17:43:16Z"
}
```

```json
{
  "id": "c6cc077a-11b1-48cb-8d1f-64608a28b161",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:48:17.004422Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T17:43:16Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "957a97d0-9c83-4bef-8c7d-61540767eae4",
  "quote_id": "c6cc077a-11b1-48cb-8d1f-64608a28b161",
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
  "pickup_at": "2026-10-29T17:43:16Z"
}
```

```json
{
  "id": "631a9453-560c-4823-a12c-210691a39888",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7cf37e84-e7a4-4636-8f96-faa5e49b09ed",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T14:43:17.306275Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T17:43:16Z",
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
  "command_id": "0624a243-c179-4696-9177-86e4ff05b72e",
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
  "id": "91d58be0-5cb7-4c4e-b79b-7e5ccfe6407a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:48:17.621059Z",
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
  "command_id": "5bdd1f8f-2ea2-4dc7-a78d-98b3300542de",
  "quote_id": "91d58be0-5cb7-4c4e-b79b-7e5ccfe6407a",
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
  "correlation_id": "a255432c-63bf-4008-a461-93caa033d9ad"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "631a9453-560c-4823-a12c-210691a39888",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "7cf37e84-e7a4-4636-8f96-faa5e49b09ed",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T14:43:17.306275Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T17:43:16Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "198dbad9-171b-4dc9-8cbd-ce7d23c6e390",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "7cf37e84-e7a4-4636-8f96-faa5e49b09ed",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-29T14:43:16.689783Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "c89244a4-58dc-44e2-8755-9236dd38303a",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "198dbad9-171b-4dc9-8cbd-ce7d23c6e390",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7cf37e84-e7a4-4636-8f96-faa5e49b09ed",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:43:16.689783Z",
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

`GET /api/rider/v1/orders/c89244a4-58dc-44e2-8755-9236dd38303a` → **200**

```json
{
  "id": "c89244a4-58dc-44e2-8755-9236dd38303a",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7cf37e84-e7a4-4636-8f96-faa5e49b09ed",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "e7a0d320-9f7b-4f1b-83e8-ada60a2f39fb",
    "order_id": "c89244a4-58dc-44e2-8755-9236dd38303a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "4a966e1e-d77b-40ac-9f5b-8cf7689aa9c1",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T14:43:15.212141Z",
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
    "location_at": "2026-10-29T14:43:14.024069Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/c89244a4-58dc-44e2-8755-9236dd38303a/cancel` → **200**

```json
{
  "command_id": "4af49201-a14c-4091-a439-16d1fecf9605",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c89244a4-58dc-44e2-8755-9236dd38303a",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "7cf37e84-e7a4-4636-8f96-faa5e49b09ed",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "e7a0d320-9f7b-4f1b-83e8-ada60a2f39fb",
    "order_id": "c89244a4-58dc-44e2-8755-9236dd38303a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "4a966e1e-d77b-40ac-9f5b-8cf7689aa9c1",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T14:43:15.212141Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/198dbad9-171b-4dc9-8cbd-ce7d23c6e390` → **200**

```json
{
  "id": "198dbad9-171b-4dc9-8cbd-ce7d23c6e390",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7cf37e84-e7a4-4636-8f96-faa5e49b09ed",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:43:16.689783Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/198dbad9-171b-4dc9-8cbd-ce7d23c6e390/cancel` → **200**

```json
{
  "command_id": "5e494b76-1f3c-415d-9e54-7c41b8be2b08",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "198dbad9-171b-4dc9-8cbd-ce7d23c6e390",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7cf37e84-e7a4-4636-8f96-faa5e49b09ed",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:43:16.689783Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/631a9453-560c-4823-a12c-210691a39888` → **200**

```json
{
  "id": "631a9453-560c-4823-a12c-210691a39888",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7cf37e84-e7a4-4636-8f96-faa5e49b09ed",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T14:43:17.306275Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T17:43:16Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/631a9453-560c-4823-a12c-210691a39888/cancel` → **200**

```json
{
  "command_id": "1fd3809c-ce69-47d3-9e75-81818d07ccf0",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "631a9453-560c-4823-a12c-210691a39888",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "7cf37e84-e7a4-4636-8f96-faa5e49b09ed",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T14:43:17.306275Z",
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
  "pickup_at": "2026-10-29T17:43:16Z",
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
  "session_id": "9e340043-5126-4916-b281-1cbfb13fb09e",
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
  "last_heartbeat_at": "2026-10-29T14:43:14.024069Z",
  "last_location_at": "2026-10-29T14:43:14.024069Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9e340043-5126-4916-b281-1cbfb13fb09e/close` → **200**

```json
{
  "command_id": "3719681d-0030-46f6-9a0c-7bc349ceffc5",
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

Done: orders c89244a4-58dc-44e2-8755-9236dd38303a, 198dbad9-171b-4dc9-8cbd-ce7d23c6e390, 631a9453-560c-4823-a12c-210691a39888.

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
  "session_id": "2b144126-9a70-479a-9e28-b98a3febedd8",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5MDEsImlhdCI6MTc5MzI4NTAwMSwianRpIjoiYjNhNzY2ZWEtN2E4Mi00YTNjLThmMDgtY2Q0MmQ5YzZlOWIwIiwic2lkIjoiMmIxNDQxMjYtOWE3MC00NzlhLTllMjgtYjk4YTNmZWJlZGQ4In0._Ob6Qn3s2uGW-BoRAzabVISNH_Joo4vAb8dsgZccg9E",
  "access_expires_at": "2026-10-29T14:58:21.471300894Z",
  "refresh_token": "ceSq1gqWqk7HRahE7i1dEkU9zQ6OCgfG-d6faoxl1SQ",
  "refresh_expires_at": "2026-10-30T02:43:21.470806143Z",
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
  "session_id": "dd738e0f-dfad-448e-8b38-b7b6a20fdaae",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5MDIsImlhdCI6MTc5MzI4NTAwMiwianRpIjoiYTYwMGQxOTktZjA0Zi00YzA2LWI3N2UtZTZiNjRmYmFjZWViIiwic2lkIjoiZGQ3MzhlMGYtZGZhZC00NDhlLThiMzgtYjdiNmEyMGZkYWFlIn0.-DZisD6u6JgisV-LBqKAqtFGXr_MX-tJxiAGPRO6xr8",
  "access_expires_at": "2026-10-29T14:58:22.036020884Z",
  "refresh_token": "JdBtlcYPVlYC6U1U5RvQLR-eIX0e2N-BWFAGS0CK1Rg",
  "refresh_expires_at": "2026-10-30T02:43:22.035515172Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21822"
}
```

```json
{
  "challenge_id": "d8bd63f3-5901-48fb-9875-3671d3a5ef30",
  "expires_at": "2026-10-29T14:48:22.305124827Z",
  "resend_available_at": "2026-10-29T14:43:23.305124827Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "930037",
  "sent_at": "2026-10-29T14:43:22.308033795Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d8bd63f3-5901-48fb-9875-3671d3a5ef30",
  "code": "930037",
  "device_ref": "sandbox-21822"
}
```

```json
{
  "session_id": "20afe87b-dd61-4be2-a823-c905ce5a6929",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTkwMiwiaWF0IjoxNzkzMjg1MDAyLCJqdGkiOiJjNzg0MGIyNi0wYzY4LTRiMjItYWUzZS0xMWIzN2YyNDJlYjMiLCJzaWQiOiIyMGFmZTg3Yi1kZDYxLTRiZTItYTgyMy1jOTA1Y2U1YTY5MjkifQ.G3y7GaXSUhqAr9MI5eGRazIcxDdgxmhFe3xcbhP_WiM",
  "access_expires_at": "2026-10-29T14:58:22.621773732Z",
  "refresh_token": "HJoRsailQqLnV7MZBa85Xt5qmaoafvkzHWdpKTbBYpg",
  "refresh_expires_at": "2026-11-28T14:43:22.62122542Z",
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
  "command_id": "734b6acf-0de6-4cdf-88ec-df030019c39b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:43:23Z",
    "sequence": 1793285003182
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3526b08c-30d3-4e89-bc8d-e8065dae9c8b",
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
  "last_heartbeat_at": "2026-10-29T14:43:23.200676Z",
  "last_location_at": "2026-10-29T14:43:23.200676Z",
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
  "command_id": "80630270-ae6c-4e0d-9f3a-a81ba0f5be2f",
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
  "effective_at": "2026-10-29T14:43:23.784226Z",
  "changed_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T14:40:35.938962Z",
  "last_entries": [
    {
      "order_id": "f82cf60c-75cb-4a25-b379-9d938e776a84",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T14:40:35.938962Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "5c5cf9c7-48ae-468e-bbb8-b034272d7ab7",
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
  "id": "3a3c5d53-be82-4c64-b388-b45d5967eb42",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:48:24.371875Z",
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
  "command_id": "da48e581-00b9-454f-ad46-c7eebf7b2fe8",
  "quote_id": "3a3c5d53-be82-4c64-b388-b45d5967eb42",
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
    "phone": "+380671110263"
  }
}
```

```json
{
  "id": "dcfc206b-2e3a-4623-bab0-1126b99480fb",
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
  "created_at": "2026-10-29T14:43:24.667303Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671110263"
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
    "id": "e1fd2dbb-1afb-4a72-9be0-49a15d15ea5e",
    "order_id": "dcfc206b-2e3a-4623-bab0-1126b99480fb",
    "expires_at": "2026-10-29T14:43:39.670844Z",
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

`POST /api/driver/v1/offers/e1fd2dbb-1afb-4a72-9be0-49a15d15ea5e/accept` → **200**

```json
{
  "command_id": "30345187-4eac-4e17-b9da-723715443344"
}
```

```json
{
  "id": "b1599d3a-6aa6-4ef8-aad2-156318497361",
  "order_id": "dcfc206b-2e3a-4623-bab0-1126b99480fb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "650525e6-bb8f-4eb1-9908-5a25b787c945",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "650525e6-bb8f-4eb1-9908-5a25b787c945",
  "order_id": "dcfc206b-2e3a-4623-bab0-1126b99480fb",
  "assignment_id": "b1599d3a-6aa6-4ef8-aad2-156318497361",
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
    "phone": "+380671110263"
  }
}
```

`POST /api/driver/v1/work-sessions/3526b08c-30d3-4e89-bc8d-e8065dae9c8b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:43:25Z",
    "sequence": 1793285005852
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3526b08c-30d3-4e89-bc8d-e8065dae9c8b",
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
  "last_heartbeat_at": "2026-10-29T14:43:25.870412Z",
  "last_location_at": "2026-10-29T14:43:25.870412Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/650525e6-bb8f-4eb1-9908-5a25b787c945/arrive` → **200**

```json
{
  "command_id": "761b1770-d070-4d5c-8dd2-6e0753b4df02",
  "expected_version": 0
}
```

```json
{
  "id": "650525e6-bb8f-4eb1-9908-5a25b787c945",
  "order_id": "dcfc206b-2e3a-4623-bab0-1126b99480fb",
  "assignment_id": "b1599d3a-6aa6-4ef8-aad2-156318497361",
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
  "arrived_at": "2026-10-29T14:43:26.161421Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671110263"
  }
}
```

`POST /api/driver/v1/trips/650525e6-bb8f-4eb1-9908-5a25b787c945/start` → **200**

```json
{
  "command_id": "4e8de6a7-9f7a-4aa9-86af-54e71fc78a6d",
  "expected_version": 1
}
```

```json
{
  "id": "650525e6-bb8f-4eb1-9908-5a25b787c945",
  "order_id": "dcfc206b-2e3a-4623-bab0-1126b99480fb",
  "assignment_id": "b1599d3a-6aa6-4ef8-aad2-156318497361",
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
  "arrived_at": "2026-10-29T14:43:26.161421Z",
  "started_at": "2026-10-29T14:43:26.464576Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671110263"
  }
}
```

`POST /api/driver/v1/trips/650525e6-bb8f-4eb1-9908-5a25b787c945/complete` → **200**

```json
{
  "command_id": "48384f51-1336-4b5b-8fb1-20e641285742",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:43:26Z",
  "cash_received": true
}
```

```json
{
  "id": "650525e6-bb8f-4eb1-9908-5a25b787c945",
  "order_id": "dcfc206b-2e3a-4623-bab0-1126b99480fb",
  "assignment_id": "b1599d3a-6aa6-4ef8-aad2-156318497361",
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
  "arrived_at": "2026-10-29T14:43:26.161421Z",
  "started_at": "2026-10-29T14:43:26.464576Z",
  "completed_at": "2026-10-29T14:43:26.769197Z",
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
  "command_id": "b487f47a-78e3-498c-b1a8-72eca8b63990",
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
  "id": "a6d0cf37-3448-4e2f-9afc-08e30bdba85c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:48:27.082483Z",
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
  "command_id": "45a7c272-d2ec-4e3d-9a0d-0de067177964",
  "quote_id": "a6d0cf37-3448-4e2f-9afc-08e30bdba85c",
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
    "phone": "+3806711119315"
  }
}
```

```json
{
  "id": "2e3e4a27-bd81-4223-a097-ca92c1dafa7b",
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
  "created_at": "2026-10-29T14:43:27.387393Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711119315"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/2e3e4a27-bd81-4223-a097-ca92c1dafa7b` → **200**

```json
{
  "id": "2e3e4a27-bd81-4223-a097-ca92c1dafa7b",
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
  "created_at": "2026-10-29T14:43:27.387393Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711119315"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/2e3e4a27-bd81-4223-a097-ca92c1dafa7b/cancel` → **200**

```json
{
  "command_id": "6a04c989-7e31-4a91-8505-de4b316b6478",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "2e3e4a27-bd81-4223-a097-ca92c1dafa7b",
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
  "created_at": "2026-10-29T14:43:27.387393Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711119315"
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
  "staff_id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T14:40:35.938962Z",
  "last_entries": [
    {
      "order_id": "2e3e4a27-bd81-4223-a097-ca92c1dafa7b",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T14:43:27.999237Z"
    },
    {
      "order_id": "dcfc206b-2e3a-4623-bab0-1126b99480fb",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T14:43:26.773986Z"
    },
    {
      "order_id": "f82cf60c-75cb-4a25-b379-9d938e776a84",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T14:40:35.938962Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3526b08c-30d3-4e89-bc8d-e8065dae9c8b",
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
  "last_heartbeat_at": "2026-10-29T14:43:25.870412Z",
  "last_location_at": "2026-10-29T14:43:25.870412Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3526b08c-30d3-4e89-bc8d-e8065dae9c8b/close` → **200**

```json
{
  "command_id": "e93f601e-ca01-42b3-842c-9363b6c26fc6",
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

Done: operator bonus for fulfilled dcfc206b-2e3a-4623-bab0-1126b99480fb and operator-fault cancellation 2e3e4a27-bd81-4223-a097-ca92c1dafa7b.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672636163",
  "device_ref": "sandbox-8937"
}
```

```json
{
  "challenge_id": "f2e8a38f-399a-415f-823a-f3be600df030",
  "expires_at": "2026-10-29T14:48:32.426681492Z",
  "resend_available_at": "2026-10-29T14:43:33.426681492Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672636163` → **200**

```json
{
  "phone": "+380672636163",
  "audience": "CLIENT",
  "code": "627152",
  "sent_at": "2026-10-29T14:43:32.429530138Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677651940",
  "device_ref": "sandbox-20341",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "9c651e94-c967-44e6-be82-3981c9d1443f",
  "expires_at": "2026-10-29T14:48:33.936900239Z",
  "resend_available_at": "2026-10-29T14:43:34.936900239Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677651940` → **200**

```json
{
  "phone": "+380677651940",
  "audience": "CLIENT",
  "code": "871163",
  "sent_at": "2026-10-29T14:43:33.939455209Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677651940",
  "device_ref": "sandbox-28749",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "6372d391-b0a3-47a3-a707-03f423186629",
  "expires_at": "2026-10-29T14:48:35.459657371Z",
  "resend_available_at": "2026-10-29T14:43:36.459657371Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677651940` → **200**

```json
{
  "phone": "+380677651940",
  "audience": "CLIENT",
  "code": "242259",
  "sent_at": "2026-10-29T14:43:35.463099929Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676410000",
  "device_ref": "sandbox-10546"
}
```

```json
{
  "challenge_id": "f0b9398b-c158-4280-99fe-c908909bcfb5",
  "expires_at": "2026-10-29T14:48:36.978214929Z",
  "resend_available_at": "2026-10-29T14:43:37.978214929Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676410000",
  "device_ref": "sandbox-26092"
}
```

```json
{
  "challenge_id": "68bb5859-607e-46af-9372-2177d7546839",
  "expires_at": "2026-10-29T14:48:38.470509841Z",
  "resend_available_at": "2026-10-29T14:43:39.470509841Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380676410000` → **200**

```json
{
  "phone": "+380676410000",
  "audience": "CLIENT",
  "code": "962571",
  "sent_at": "2026-10-29T14:43:38.473888263Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676410000",
  "device_ref": "sandbox-13251",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "d782651d-34f6-4220-b0a9-400f255f7ca2",
  "expires_at": "2026-10-29T14:48:39.986972864Z",
  "resend_available_at": "2026-10-29T14:43:40.986972864Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380676410000` → **200**

```json
{
  "phone": "+380676410000",
  "audience": "CLIENT",
  "code": "926621",
  "sent_at": "2026-10-29T14:43:39.989449976Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380676410000",
  "device_ref": "sandbox-20250",
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
  "correlation_id": "f0565a8d-c696-4fcc-b3ba-82fb951b4278",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000003250"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "e14552a4-8e5e-46b0-8e57-7a34a86cd629"
}
```

`GET /sandbox/v1/otp?phone=%2B442000003250` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120019543"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "c425f07a-29f7-4d6a-8a3f-2c2512aed632"
}
```

`GET /sandbox/v1/otp?phone=%2B37120019543` → **404**

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
  "session_id": "4d7424b9-695e-40c4-8b8e-98ef1531a569",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5MjIsImlhdCI6MTc5MzI4NTAyMiwianRpIjoiMDI3MGU2Y2ItZWI2Yi00N2U2LTg5ZjEtNDRlNzdhZWU3YjczIiwic2lkIjoiNGQ3NDI0YjktNjk1ZS00MGM0LThiOGUtOThlZjE1MzFhNTY5In0.IfofXK6rKTKdTUBH6qhsWyoi_op6NMfGq3yXwwezQpQ",
  "access_expires_at": "2026-10-29T14:58:42.714256724Z",
  "refresh_token": "ZZuu7oX_A9RrmCVhcd4pphzGa_Q-fuowbbt3DaLPOmA",
  "refresh_expires_at": "2026-10-30T02:43:42.713756184Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676410000` → **200**

```json
{
  "deliveries": [
    {
      "id": "30571edb-52d8-48df-935e-ba135b52c878",
      "challenge_id": "d782651d-34f6-4220-b0a9-400f255f7ca2",
      "phone": "+380676410000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-57dd43a9-de4b-48c8-8479-898633e7eae0",
      "error": null,
      "attempted_at": "2026-10-29T14:43:39.989933Z"
    },
    {
      "id": "132b415e-6641-4fa2-bfff-6e70581ac44b",
      "challenge_id": "68bb5859-607e-46af-9372-2177d7546839",
      "phone": "+380676410000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-24a46c64-8bbf-4b7e-9bd0-fb56b9c21d59",
      "error": null,
      "attempted_at": "2026-10-29T14:43:38.474137Z"
    },
    {
      "id": "6ceefa51-2dfa-4666-aa68-df9b3310ca8c",
      "challenge_id": "f0b9398b-c158-4280-99fe-c908909bcfb5",
      "phone": "+380676410000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T14:43:36.980969Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380676410000` → **200**

```json
{
  "phone": "+380676410000",
  "audience": "CLIENT",
  "code": "926621",
  "sent_at": "2026-10-29T14:43:39.989449976Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677651940` → **200**

```json
{
  "deliveries": [
    {
      "id": "b0726123-77df-42cb-aa8e-e692a30aab37",
      "challenge_id": "6372d391-b0a3-47a3-a707-03f423186629",
      "phone": "+380677651940",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-02c9fe64-04c0-4011-86c2-c65c12916d50",
      "error": null,
      "attempted_at": "2026-10-29T14:43:35.463445Z"
    },
    {
      "id": "d79c1aea-b5a4-487a-a2fe-700f5d526030",
      "challenge_id": "9c651e94-c967-44e6-be82-3981c9d1443f",
      "phone": "+380677651940",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-87a56941-f0ac-44b6-80aa-263626189f4b",
      "error": null,
      "attempted_at": "2026-10-29T14:43:33.939968Z"
    }
  ]
}
```

Done: SMS to +380672636163; SMS then a call to +380677651940; a failed SMS, two calls and a refused third to +380676410000; +44 and +371 refused.

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
  "session_id": "6368537f-15a0-47e6-8485-39fcc653b1d3",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5MjMsImlhdCI6MTc5MzI4NTAyMywianRpIjoiMTQyOTkzYjYtYTE5Zi00MTk5LThjODktOTA5NTMwMzBjOTFlIiwic2lkIjoiNjM2ODUzN2YtMTVhMC00N2U2LTg0ODUtMzlmY2M2NTNiMWQzIn0.dqx-AzReEbfaGEkT64L_ZCCE8VnMlNieLq0L46S7EZQ",
  "access_expires_at": "2026-10-29T14:58:43.899180498Z",
  "refresh_token": "W0as4RQ2TrVULYOe2fm4u8gOSnzshnJOsGcoY-3K88Q",
  "refresh_expires_at": "2026-10-30T02:43:43.898367448Z",
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
  "session_id": "71a10911-d458-401b-8b66-423e8e1b4f4b",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5MjQsImlhdCI6MTc5MzI4NTAyNCwianRpIjoiMzRlNWNiODAtNzg4Yi00ZTVjLTkyMTQtYTdiM2M2MGM1NjYwIiwic2lkIjoiNzFhMTA5MTEtZDQ1OC00MDFiLThiNjYtNDIzZThlMWI0ZjRiIn0.I47vAQGHwbeGGhq3g2jsC6LzP8245dgOeEc2T_f4VI0",
  "access_expires_at": "2026-10-29T14:58:44.476504066Z",
  "refresh_token": "AUbOM0dC3GdkivwLHdysgWCe34uWp1Dfql9GvUZp3QE",
  "refresh_expires_at": "2026-10-30T02:43:44.475916074Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
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

`POST /api/admin/v1/staff-extensions/4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a` → **200**

```json
{
  "command_id": "ac6e57f3-ca2a-49ab-a04d-218d23a75831",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "1bde7468-36ad-45e8-995a-61b9b4b2f3d9",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T14:43:45.632601Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T14:43:45.632601Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "09865cea-4b2d-485b-9a35-5b6b20e40a56",
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
  "id": "3c1aefb0-d1ab-4a57-89ae-eae4e6c8a8f1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:48:46.208486Z",
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
  "command_id": "1eb15172-b5a2-4f00-8173-b5378f6c29eb",
  "quote_id": "3c1aefb0-d1ab-4a57-89ae-eae4e6c8a8f1",
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
    "phone": "+380675891910"
  }
}
```

```json
{
  "id": "c8849dfa-2c44-42a9-b717-f0b77936abe6",
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
  "created_at": "2026-10-29T14:43:46.518696Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675891910"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/c8849dfa-2c44-42a9-b717-f0b77936abe6/calls` → **201**

```json
{
  "command_id": "14e6fb8c-98ba-49cd-811c-a541101a8545",
  "to": "CALLER"
}
```

```json
{
  "id": "04ccfb44-901a-461c-8ee0-67ee0c486ef0",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
  "order_ids": [
    "c8849dfa-2c44-42a9-b717-f0b77936abe6"
  ],
  "started_at": "2026-10-29T14:43:46.838015Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/c8849dfa-2c44-42a9-b717-f0b77936abe6/calls` → **201**

```json
{
  "command_id": "14e6fb8c-98ba-49cd-811c-a541101a8545",
  "to": "CALLER"
}
```

```json
{
  "id": "04ccfb44-901a-461c-8ee0-67ee0c486ef0",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
  "order_ids": [
    "c8849dfa-2c44-42a9-b717-f0b77936abe6"
  ],
  "started_at": "2026-10-29T14:43:46.838015Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "04ccfb44-901a-461c-8ee0-67ee0c486ef0",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380675891910",
    "at": "2026-10-29T14:43:46.840564349Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "04ccfb44-901a-461c-8ee0-67ee0c486ef0",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.16280",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "04ccfb44-901a-461c-8ee0-67ee0c486ef0"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "04ccfb44-901a-461c-8ee0-67ee0c486ef0",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=c8849dfa-2c44-42a9-b717-f0b77936abe6` → **200**

```json
{
  "calls": [
    {
      "id": "04ccfb44-901a-461c-8ee0-67ee0c486ef0",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
      "order_ids": [
        "c8849dfa-2c44-42a9-b717-f0b77936abe6"
      ],
      "started_at": "2026-10-29T14:43:46.838015Z",
      "answered_at": "2026-10-29T14:43:47.511974Z",
      "ended_at": "2026-10-29T14:43:47.534101Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=c8849dfa-2c44-42a9-b717-f0b77936abe6` → **200**

```json
{
  "calls": [
    {
      "id": "04ccfb44-901a-461c-8ee0-67ee0c486ef0",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
      "order_ids": [
        "c8849dfa-2c44-42a9-b717-f0b77936abe6"
      ],
      "started_at": "2026-10-29T14:43:46.838015Z",
      "answered_at": "2026-10-29T14:43:47.511974Z",
      "ended_at": "2026-10-29T14:43:47.534101Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=c8849dfa-2c44-42a9-b717-f0b77936abe6` → **200**

```json
{
  "calls": [
    {
      "id": "04ccfb44-901a-461c-8ee0-67ee0c486ef0",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
      "order_ids": [
        "c8849dfa-2c44-42a9-b717-f0b77936abe6"
      ],
      "started_at": "2026-10-29T14:43:46.838015Z",
      "answered_at": "2026-10-29T14:43:47.511974Z",
      "ended_at": "2026-10-29T14:43:47.534101Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=c8849dfa-2c44-42a9-b717-f0b77936abe6` → **200**

```json
{
  "calls": [
    {
      "id": "04ccfb44-901a-461c-8ee0-67ee0c486ef0",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
      "order_ids": [
        "c8849dfa-2c44-42a9-b717-f0b77936abe6"
      ],
      "started_at": "2026-10-29T14:43:46.838015Z",
      "answered_at": "2026-10-29T14:43:47.511974Z",
      "ended_at": "2026-10-29T14:43:47.534101Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=c8849dfa-2c44-42a9-b717-f0b77936abe6` → **200**

```json
{
  "calls": [
    {
      "id": "04ccfb44-901a-461c-8ee0-67ee0c486ef0",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
      "order_ids": [
        "c8849dfa-2c44-42a9-b717-f0b77936abe6"
      ],
      "started_at": "2026-10-29T14:43:46.838015Z",
      "answered_at": "2026-10-29T14:43:47.511974Z",
      "ended_at": "2026-10-29T14:43:47.534101Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:43:55.704052Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/c8849dfa-2c44-42a9-b717-f0b77936abe6` → **200**

```json
{
  "id": "c8849dfa-2c44-42a9-b717-f0b77936abe6",
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
  "created_at": "2026-10-29T14:43:46.518696Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675891910"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c8849dfa-2c44-42a9-b717-f0b77936abe6/cancel` → **200**

```json
{
  "command_id": "cd4ffcf6-af77-4880-9d60-7af8b193c4cf",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "c8849dfa-2c44-42a9-b717-f0b77936abe6",
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
  "created_at": "2026-10-29T14:43:46.518696Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675891910"
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
  "command_id": "beb7d979-3642-417b-a9dc-c1b4b6772e08",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T14:43:57.629856Z",
  "extension": "101"
}
```

Done: outgoing call 04ccfb44-901a-461c-8ee0-67ee0c486ef0 from order c8849dfa-2c44-42a9-b717-f0b77936abe6, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632126516",
  "device_ref": "sandbox-29142"
}
```

```json
{
  "challenge_id": "632ac3c6-4997-4441-8690-fbbcebe74f52",
  "expires_at": "2026-10-29T14:48:57.925776399Z",
  "resend_available_at": "2026-10-29T14:43:58.925776399Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632126516` → **200**

```json
{
  "phone": "+380632126516",
  "audience": "CLIENT",
  "code": "348260",
  "sent_at": "2026-10-29T14:43:57.928490735Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "632ac3c6-4997-4441-8690-fbbcebe74f52",
  "code": "348260",
  "device_ref": "sandbox-29142"
}
```

```json
{
  "session_id": "db331ad2-988d-4dff-a40a-2645409442ed",
  "subject": {
    "type": "CLIENT",
    "id": "c7ebe029-3e8f-490d-9caf-99d3203d166e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjN2ViZTAyOS0zZThmLTQ5MGQtOWNhZi05OWQzMjAzZDE2NmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTM4LCJpYXQiOjE3OTMyODUwMzgsImp0aSI6ImY0Y2I5ZjJjLWIwN2MtNDIzYS1iMWVhLTViNmU0NTk1YzgxMCIsInNpZCI6ImRiMzMxYWQyLTk4OGQtNGRmZi1hNDBhLTI2NDU0MDk0NDJlZCJ9.xdVMqX4DzoZZs0xRC6VXK9ajOmyJRauaHmc63-7SqLM",
  "access_expires_at": "2026-10-29T14:58:58.243530951Z",
  "refresh_token": "RrRFjpWq94zpNFGLRzZGXV6AiGFFGm5NV9uSv4PqcGo",
  "refresh_expires_at": "2026-11-28T14:43:58.243014337Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c7ebe029-3e8f-490d-9caf-99d3203d166e",
  "session_id": "db331ad2-988d-4dff-a40a-2645409442ed",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632126516",
  "device_ref": "sandbox-4638"
}
```

```json
{
  "challenge_id": "4416376c-2f22-4e62-9c81-9916ab40b35a",
  "expires_at": "2026-10-29T14:49:00.807027581Z",
  "resend_available_at": "2026-10-29T14:44:01.807027581Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632126516` → **200**

```json
{
  "phone": "+380632126516",
  "audience": "CLIENT",
  "code": "687069",
  "sent_at": "2026-10-29T14:44:00.810162354Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4416376c-2f22-4e62-9c81-9916ab40b35a",
  "code": "687069",
  "device_ref": "sandbox-4638"
}
```

```json
{
  "session_id": "f5afab54-dddc-457f-a606-980d89b537ee",
  "subject": {
    "type": "CLIENT",
    "id": "c7ebe029-3e8f-490d-9caf-99d3203d166e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjN2ViZTAyOS0zZThmLTQ5MGQtOWNhZi05OWQzMjAzZDE2NmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTQxLCJpYXQiOjE3OTMyODUwNDEsImp0aSI6IjlhYzVkZmMxLWM0YTctNDI1YS05NmNmLTllNjRiZjFkMjg1MiIsInNpZCI6ImY1YWZhYjU0LWRkZGMtNDU3Zi1hNjA2LTk4MGQ4OWI1MzdlZSJ9.2O9hdaudXBqN_sMzQerWowxpC4Hnx9JgIPtQ8KvHp8Y",
  "access_expires_at": "2026-10-29T14:59:01.122475249Z",
  "refresh_token": "DjNKoX0r_7CoSkXnd6kUEB8vdzDXW2N60crX6G8ucPQ",
  "refresh_expires_at": "2026-11-28T14:44:01.121933995Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "3e777b15-3787-427d-a974-090f55b5e61d",
  "expires_at": "2026-10-29T14:49:03.421599212Z",
  "resend_available_at": "2026-10-29T14:44:04.421599212Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632126516` → **200**

```json
{
  "phone": "+380632126516",
  "audience": "CLIENT",
  "code": "039738",
  "sent_at": "2026-10-29T14:44:03.423930435Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380636831209"
}
```

```json
{
  "challenge_id": "93b8c910-dee0-40f7-9466-d50544c85645",
  "expires_at": "2026-10-29T14:49:03.734665428Z",
  "resend_available_at": "2026-10-29T14:44:04.734665428Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636831209` → **200**

```json
{
  "phone": "+380636831209",
  "audience": "CLIENT",
  "code": "590438",
  "sent_at": "2026-10-29T14:44:03.736740884Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "ab10f877-92b2-48e6-b91f-89b0c803f9a5",
  "current_challenge_id": "3e777b15-3787-427d-a974-090f55b5e61d",
  "current_code": "000000",
  "new_challenge_id": "93b8c910-dee0-40f7-9466-d50544c85645",
  "new_code": "590438"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "5c4dd0e5-fc9f-4b47-a887-37609c178944"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "5bb86293-a632-44c8-9d67-e85024475b3c",
  "current_challenge_id": "3e777b15-3787-427d-a974-090f55b5e61d",
  "current_code": "039738",
  "new_challenge_id": "93b8c910-dee0-40f7-9466-d50544c85645",
  "new_code": "590438"
}
```

```json
{
  "subject_id": "c7ebe029-3e8f-490d-9caf-99d3203d166e",
  "phone": "+380636831209",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c7ebe029-3e8f-490d-9caf-99d3203d166e",
  "session_id": "db331ad2-988d-4dff-a40a-2645409442ed",
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
  "correlation_id": "9a32c3ba-1153-42a9-920e-2b0c6330ac73"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636831209",
  "device_ref": "sandbox-21913"
}
```

```json
{
  "challenge_id": "dc48c152-2f6b-4c53-81f3-de4d55f0276e",
  "expires_at": "2026-10-29T14:49:07.16704129Z",
  "resend_available_at": "2026-10-29T14:44:08.16704129Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636831209` → **200**

```json
{
  "phone": "+380636831209",
  "audience": "CLIENT",
  "code": "189091",
  "sent_at": "2026-10-29T14:44:07.169523701Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dc48c152-2f6b-4c53-81f3-de4d55f0276e",
  "code": "189091",
  "device_ref": "sandbox-21913"
}
```

```json
{
  "session_id": "efecd1a5-fd94-46a1-8f8c-abdc03332731",
  "subject": {
    "type": "CLIENT",
    "id": "c7ebe029-3e8f-490d-9caf-99d3203d166e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjN2ViZTAyOS0zZThmLTQ5MGQtOWNhZi05OWQzMjAzZDE2NmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTQ3LCJpYXQiOjE3OTMyODUwNDcsImp0aSI6ImUwMjE1M2UzLTMwNzQtNGEzYi04OTVhLWRkMDZkODg5Y2Y4YyIsInNpZCI6ImVmZWNkMWE1LWZkOTQtNDZhMS04ZjhjLWFiZGMwMzMzMjczMSJ9.Z197YUNBJiG5AB1im0Fovbugrq0rHSPHLe9ng9cONBk",
  "access_expires_at": "2026-10-29T14:59:07.485783852Z",
  "refresh_token": "DMg4CPAZFpSn5jHclg9cg3ZlnttkUJ08CuYDbpP24K0",
  "refresh_expires_at": "2026-11-28T14:44:07.485232766Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c7ebe029-3e8f-490d-9caf-99d3203d166e",
  "session_id": "efecd1a5-fd94-46a1-8f8c-abdc03332731",
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
  "session_id": "d68e7c73-bd59-4ce6-9555-a3ac2fd89790",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5NDgsImlhdCI6MTc5MzI4NTA0OCwianRpIjoiNmUzYjg1ZGUtMmFkMy00MWY3LWE4NDktNzFlYjQzMjU5NmVlIiwic2lkIjoiZDY4ZTdjNzMtYmQ1OS00Y2U2LTk1NTUtYTNhYzJmZDg5NzkwIn0.V38zE1S_D8kn5eT_P0nqrCXhcmCYwOMj72YUI51yGzs",
  "access_expires_at": "2026-10-29T14:59:08.340710717Z",
  "refresh_token": "2sLarFIC49IP_ecpcsJ9He40ldV9RcwknuWdKKyPcPc",
  "refresh_expires_at": "2026-10-30T02:44:08.340174659Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/c7ebe029-3e8f-490d-9caf-99d3203d166e` → **200**

```json
{
  "client": {
    "id": "c7ebe029-3e8f-490d-9caf-99d3203d166e",
    "phone": "+380636831209",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:43:58.241455Z",
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

`POST /api/admin/v1/clients/c7ebe029-3e8f-490d-9caf-99d3203d166e/phone/new-code` → **201**

```json
{
  "phone": "+380631717022"
}
```

```json
{
  "challenge_id": "6ee7cd2a-16d4-4e78-b543-92e29ca0fd82",
  "expires_at": "2026-10-29T14:49:08.939132789Z",
  "resend_available_at": "2026-10-29T14:44:09.939132789Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631717022` → **200**

```json
{
  "phone": "+380631717022",
  "audience": "CLIENT",
  "code": "579036",
  "sent_at": "2026-10-29T14:44:08.941445353Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/c7ebe029-3e8f-490d-9caf-99d3203d166e/phone` → **422**

```json
{
  "command_id": "fa81d956-5b59-417e-8155-ac07d9619549",
  "expected_version": 3,
  "new_challenge_id": "6ee7cd2a-16d4-4e78-b543-92e29ca0fd82",
  "new_code": "579037",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/c7ebe029-3e8f-490d-9caf-99d3203d166e/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "84f4f0b4-73b4-402f-85a4-591b3da85af1"
}
```

`POST /api/admin/v1/clients/c7ebe029-3e8f-490d-9caf-99d3203d166e/phone` → **400**

```json
{
  "command_id": "4600a389-feb8-41f8-a189-aa767650da60",
  "expected_version": 3,
  "new_challenge_id": "6ee7cd2a-16d4-4e78-b543-92e29ca0fd82",
  "new_code": "579036",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/c7ebe029-3e8f-490d-9caf-99d3203d166e/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "0c396764-6e06-44b2-b64a-f781243c04f6",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/c7ebe029-3e8f-490d-9caf-99d3203d166e/phone` → **200**

```json
{
  "command_id": "f960748d-182b-4b8b-989c-8e522124ae8c",
  "expected_version": 3,
  "new_challenge_id": "6ee7cd2a-16d4-4e78-b543-92e29ca0fd82",
  "new_code": "579036",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "c7ebe029-3e8f-490d-9caf-99d3203d166e",
  "phone": "+380631717022",
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
  "correlation_id": "5afead9f-6962-42b4-806e-d7fe45603b65"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631717022",
  "device_ref": "sandbox-9243"
}
```

```json
{
  "challenge_id": "754bf304-1b03-4d5b-b431-d1df0ec2d7d8",
  "expires_at": "2026-10-29T14:49:10.397455734Z",
  "resend_available_at": "2026-10-29T14:44:11.397455734Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631717022` → **200**

```json
{
  "phone": "+380631717022",
  "audience": "CLIENT",
  "code": "325250",
  "sent_at": "2026-10-29T14:44:10.399956292Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "754bf304-1b03-4d5b-b431-d1df0ec2d7d8",
  "code": "325250",
  "device_ref": "sandbox-9243"
}
```

```json
{
  "session_id": "06774f99-3695-4dbd-be14-c831a545b78a",
  "subject": {
    "type": "CLIENT",
    "id": "c7ebe029-3e8f-490d-9caf-99d3203d166e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjN2ViZTAyOS0zZThmLTQ5MGQtOWNhZi05OWQzMjAzZDE2NmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTUwLCJpYXQiOjE3OTMyODUwNTAsImp0aSI6ImFhNGY3NjAzLTRjNzgtNGFjYi1hN2FmLTQ0MjFkYjg2MGE3NiIsInNpZCI6IjA2Nzc0Zjk5LTM2OTUtNGRiZC1iZTE0LWM4MzFhNTQ1Yjc4YSJ9.LP5wIO_U2NHRnzjGfTzgWenU9veY184SYOO8O97N1Z8",
  "access_expires_at": "2026-10-29T14:59:10.703868122Z",
  "refresh_token": "UbIYraL1YhsMP6rJS8v1ev_IrtFmWwnah8Coybnn24U",
  "refresh_expires_at": "2026-11-28T14:44:10.703373504Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c7ebe029-3e8f-490d-9caf-99d3203d166e",
  "session_id": "06774f99-3695-4dbd-be14-c831a545b78a",
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
  "phone": "+380635737534",
  "device_ref": "sandbox-30462"
}
```

```json
{
  "challenge_id": "cab35cc9-968e-40ab-b04a-e644c2e39437",
  "expires_at": "2026-10-29T14:49:11.28120261Z",
  "resend_available_at": "2026-10-29T14:44:12.28120261Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635737534` → **200**

```json
{
  "phone": "+380635737534",
  "audience": "CLIENT",
  "code": "111407",
  "sent_at": "2026-10-29T14:44:11.283575337Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cab35cc9-968e-40ab-b04a-e644c2e39437",
  "code": "111407",
  "device_ref": "sandbox-30462"
}
```

```json
{
  "session_id": "1c07a942-5b6a-4340-bd8f-eaf2cae4da85",
  "subject": {
    "type": "CLIENT",
    "id": "2a33289e-bad5-4d74-9a89-f24311306506"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTMzMjg5ZS1iYWQ1LTRkNzQtOWE4OS1mMjQzMTEzMDY1MDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTUxLCJpYXQiOjE3OTMyODUwNTEsImp0aSI6ImE1MWRmZjUxLTdkNDEtNDYyYS05MzUxLTQ1YTZmYmQwNmNjNyIsInNpZCI6IjFjMDdhOTQyLTViNmEtNDM0MC1iZDhmLWVhZjJjYWU0ZGE4NSJ9.8yUktrRWdCgVhWbsMTOmduqX-HbNUojtztuBY3bcUrc",
  "access_expires_at": "2026-10-29T14:59:11.584828998Z",
  "refresh_token": "mAn5_UCA1vSn9w6f_O_EZx-REFOsNzXfsc20ZuWrtJ4",
  "refresh_expires_at": "2026-11-28T14:44:11.584321517Z",
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
  "session_id": "0d8ca1e4-8069-426d-8cef-158eb8c4ce3e",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5NTIsImlhdCI6MTc5MzI4NTA1MiwianRpIjoiMzQ0MmYyNTYtYzg1OS00OGJlLTlmMmItYThhYjI1NTNhYjQ5Iiwic2lkIjoiMGQ4Y2ExZTQtODA2OS00MjZkLThjZWYtMTU4ZWI4YzRjZTNlIn0.vff0TO84eusY7nBUHciBj66UnrcY-KHtRbTIoWB-Se8",
  "access_expires_at": "2026-10-29T14:59:12.741662603Z",
  "refresh_token": "7769_owbHRvFjWElRvGewchGeW4ySUqyFQEpEwlnFow",
  "refresh_expires_at": "2026-10-30T02:44:12.741131207Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380635737534` → **200**

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
  "correlation_id": "6b690f14-405a-4540-b3fe-16a6c1c81103"
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
  "session_id": "3ca6bd00-3344-4495-b545-a666239ef246",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5NTMsImlhdCI6MTc5MzI4NTA1MywianRpIjoiODdlMjVmNDEtYzQ5ZS00M2NlLTlkMWYtMzZiZjk0ZTk1MmU1Iiwic2lkIjoiM2NhNmJkMDAtMzM0NC00NDk1LWI1NDUtYTY2NjIzOWVmMjQ2In0.a_9RVTWxFUys4_DT6XvMP8B-3pUHNFEMFfvgZcZqZj4",
  "access_expires_at": "2026-10-29T14:59:13.897074235Z",
  "refresh_token": "2yjPFE18tQVUr8xFDTqZkZIdAtcKwBR3mRqu-UNjjus",
  "refresh_expires_at": "2026-10-30T02:44:13.89647203Z",
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
  "changed_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T14:40:05.105831Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "c7276452-4601-478b-a30f-5b2b5c74e376",
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
  "changed_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T14:44:14.47510157Z"
}
```

## The rider books the airport for 2026-10-29T17:44:13Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600622242",
  "device_ref": "sandbox-19810"
}
```

```json
{
  "challenge_id": "59d57b7d-f02a-46ea-88c6-045e716a2db6",
  "expires_at": "2026-10-29T14:49:14.78358229Z",
  "resend_available_at": "2026-10-29T14:44:15.78358229Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600622242` → **200**

```json
{
  "phone": "+48600622242",
  "audience": "CLIENT",
  "code": "620509",
  "sent_at": "2026-10-29T14:44:14.786200318Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "59d57b7d-f02a-46ea-88c6-045e716a2db6",
  "code": "620509",
  "device_ref": "sandbox-19810"
}
```

```json
{
  "session_id": "ea5d8882-5598-4d0d-b3de-a343e526c247",
  "subject": {
    "type": "CLIENT",
    "id": "36dd20f9-a212-4cb6-8988-6b44a9e9f139"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNmRkMjBmOS1hMjEyLTRjYjYtODk4OC02YjQ0YTllOWYxMzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTU1LCJpYXQiOjE3OTMyODUwNTUsImp0aSI6ImY0NWRjZmQ0LTMwYTQtNGY5YS04MjI4LWIyYzgzYWRiMTAyYyIsInNpZCI6ImVhNWQ4ODgyLTU1OTgtNGQwZC1iM2RlLWEzNDNlNTI2YzI0NyJ9.FNd-zn1613GMYU4tOC-l8qKvsAruxCEV_w5ZfYT0b2Y",
  "access_expires_at": "2026-10-29T14:59:15.088309756Z",
  "refresh_token": "vaOe7cyfYN8b8hkn34TvmYIAc5M-lZT_zK4UcJOcoKA",
  "refresh_expires_at": "2026-11-28T14:44:15.087829815Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4df083e3-96cc-446c-8d3a-505c15eef7da",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T17:44:13Z"
}
```

```json
{
  "id": "c1b6c48d-db51-412e-8a43-68605b4212e1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:49:15.384698Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T17:44:13Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "66610ea3-8434-4b40-8849-878b6dfa5497",
  "quote_id": "c1b6c48d-db51-412e-8a43-68605b4212e1",
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
  "pickup_at": "2026-10-29T17:44:13Z"
}
```

```json
{
  "id": "9f887d77-4b78-40ef-a559-58d98023e0c2",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "36dd20f9-a212-4cb6-8988-6b44a9e9f139",
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
  "created_at": "2026-10-29T14:44:15.698088Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T17:44:13Z",
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
  "device_ref": "sandbox-9180"
}
```

```json
{
  "challenge_id": "6925b293-f7da-4989-897b-2b0dc234d960",
  "expires_at": "2026-10-29T14:49:15.998930609Z",
  "resend_available_at": "2026-10-29T14:44:16.998930609Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "813228",
  "sent_at": "2026-10-29T14:44:16.001505579Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6925b293-f7da-4989-897b-2b0dc234d960",
  "code": "813228",
  "device_ref": "sandbox-9180"
}
```

```json
{
  "session_id": "27c220b7-954a-4969-982c-df0792f0c5f8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTk1NiwiaWF0IjoxNzkzMjg1MDU2LCJqdGkiOiJkM2M1ZTg0NC1jMGRmLTRmODktYTFjMS1kZTU4MDY4YTAyZWQiLCJzaWQiOiIyN2MyMjBiNy05NTRhLTQ5NjktOTgyYy1kZjA3OTJmMGM1ZjgifQ.zSTLRKfQRz_IdIMzKSm4Tu0UqjsABJwi7uZXEdIW4M0",
  "access_expires_at": "2026-10-29T14:59:16.317662774Z",
  "refresh_token": "Mtgo3NRLtGJDvvgg3hspo19gwR7WLlSMF2jzrRiYh2o",
  "refresh_expires_at": "2026-11-28T14:44:16.317138493Z",
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
  "command_id": "a15cd409-104b-4c83-8551-be62b2816aec",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:44:16Z",
    "sequence": 1793285056883
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "db8c1b24-5538-4e0a-a339-034e8b1d41fb",
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
  "last_heartbeat_at": "2026-10-29T14:44:16.901863Z",
  "last_location_at": "2026-10-29T14:44:16.901863Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "9f887d77-4b78-40ef-a559-58d98023e0c2",
      "short_number": 24,
      "pickup_at": "2026-10-29T17:44:13Z",
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

`POST /api/driver/v1/preorders/9f887d77-4b78-40ef-a559-58d98023e0c2/reserve` → **200**

```json
{
  "command_id": "d02530e8-aa35-4963-8d54-225040a9f39b"
}
```

```json
{
  "id": "5693a222-c231-426a-a12c-978bf05bae9b",
  "state": "RESERVED",
  "order": {
    "order_id": "9f887d77-4b78-40ef-a559-58d98023e0c2",
    "short_number": 24,
    "pickup_at": "2026-10-29T17:44:13Z",
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
  "reserved_at": "2026-10-29T14:44:17.488225Z",
  "confirm_from": "2026-10-29T17:14:13Z",
  "confirm_until": "2026-10-29T17:24:13Z",
  "drop_until": "2026-10-29T16:44:13Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "5693a222-c231-426a-a12c-978bf05bae9b",
      "state": "RESERVED",
      "order": {
        "order_id": "9f887d77-4b78-40ef-a559-58d98023e0c2",
        "short_number": 24,
        "pickup_at": "2026-10-29T17:44:13Z",
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
      "reserved_at": "2026-10-29T14:44:17.488225Z",
      "confirm_from": "2026-10-29T17:14:13Z",
      "confirm_until": "2026-10-29T17:24:13Z",
      "drop_until": "2026-10-29T16:44:13Z"
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
      "id": "5693a222-c231-426a-a12c-978bf05bae9b",
      "state": "RESERVED",
      "order": {
        "order_id": "9f887d77-4b78-40ef-a559-58d98023e0c2",
        "short_number": 24,
        "pickup_at": "2026-10-29T17:44:13Z",
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
      "reserved_at": "2026-10-29T14:44:17.488225Z",
      "confirm_from": "2026-10-29T17:14:13Z",
      "confirm_until": "2026-10-29T17:24:13Z",
      "drop_until": "2026-10-29T16:44:13Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/5693a222-c231-426a-a12c-978bf05bae9b/confirm` → **409**

```json
{
  "command_id": "f1123112-ea2b-42ba-81fc-7c40fff4667a"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/5693a222-c231-426a-a12c-978bf05bae9b/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5e4e3728-9229-4256-931d-bfe3aad5b372"
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
  "session_id": "0607051d-50de-45ad-b60a-841f6857d526",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5NTgsImlhdCI6MTc5MzI4NTA1OCwianRpIjoiZjA1MmE4YmMtOWZkNC00NWJiLTljYjMtNTBjNDQ4YzRmNjY3Iiwic2lkIjoiMDYwNzA1MWQtNTBkZS00NWFkLWI2MGEtODQxZjY4NTdkNTI2In0.XywrtFU2NvxQmZ2Jr9NOchuN3EoTmsHkaiZ3w4dxayk",
  "access_expires_at": "2026-10-29T14:59:18.900936056Z",
  "refresh_token": "fblPUV8xPOHpEwRNuNv_OhkDA8ZACPe_QOigemSwXm8",
  "refresh_expires_at": "2026-10-30T02:44:18.900402025Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9f887d77-4b78-40ef-a559-58d98023e0c2` → **200**

```json
{
  "id": "9f887d77-4b78-40ef-a559-58d98023e0c2",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "36dd20f9-a212-4cb6-8988-6b44a9e9f139",
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
  "created_at": "2026-10-29T14:44:15.698088Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T17:44:13Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "5693a222-c231-426a-a12c-978bf05bae9b",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T14:44:17.488225Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/9f887d77-4b78-40ef-a559-58d98023e0c2/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T14:44:15.699254Z",
      "actor": {
        "type": "CLIENT",
        "id": "36dd20f9-a212-4cb6-8988-6b44a9e9f139",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "9f887d77-4b78-40ef-a559-58d98023e0c2",
        "preorder": true,
        "quote_id": "c1b6c48d-db51-412e-8a43-68605b4212e1",
        "pickup_at": "2026-10-29T17:44:13Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "d9740536-99f6-42ea-9c23-23063e757449"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T14:44:17.489457Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9f887d77-4b78-40ef-a559-58d98023e0c2",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "5693a222-c231-426a-a12c-978bf05bae9b"
      },
      "correlation_id": "be07f7c9-13ba-4ef2-9ca0-7ee11e18d6d2"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 9f887d77-4b78-40ef-a559-58d98023e0c2, reservation 5693a222-c231-426a-a12c-978bf05bae9b.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-32123"
}
```

```json
{
  "challenge_id": "2fc7797d-e066-4d64-8ecf-33d1a0e3dd35",
  "expires_at": "2026-10-29T14:49:19.778731115Z",
  "resend_available_at": "2026-10-29T14:44:20.778731115Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "872039",
  "sent_at": "2026-10-29T14:44:19.781139338Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2fc7797d-e066-4d64-8ecf-33d1a0e3dd35",
  "code": "872039",
  "device_ref": "sandbox-32123"
}
```

```json
{
  "session_id": "cac264dc-27ac-46f4-8971-ceb899cb904b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTk2MCwiaWF0IjoxNzkzMjg1MDYwLCJqdGkiOiJmZWU0MTVlNS03ZDFlLTQ2YjEtYjlkNC02MjUyYWI5ZTIxYTQiLCJzaWQiOiJjYWMyNjRkYy0yN2FjLTQ2ZjQtODk3MS1jZWI4OTljYjkwNGIifQ.Q-jgNIwJrCVQ1MWVopivMbxgNaw4nZACHkjcRbhavQ0",
  "access_expires_at": "2026-10-29T14:59:20.086805809Z",
  "refresh_token": "CxNWDRzJ3GS9E6tdKkB6gklWR-ET-ilKh0SfqeZtLTg",
  "refresh_expires_at": "2026-11-28T14:44:20.086292947Z",
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
  "command_id": "e6cb4606-6de4-4c6a-9b76-fbdd046a9ada",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:44:20Z",
    "sequence": 1793285060642
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2e21c673-3e74-49c3-8b70-afa59defdbdd",
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
  "last_heartbeat_at": "2026-10-29T14:44:20.660434Z",
  "last_location_at": "2026-10-29T14:44:20.660434Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678209820",
  "device_ref": "sandbox-26629"
}
```

```json
{
  "challenge_id": "abaed5d6-a1c7-4f93-a414-9eb35f4c82ab",
  "expires_at": "2026-10-29T14:49:20.959123923Z",
  "resend_available_at": "2026-10-29T14:44:21.959123923Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678209820` → **200**

```json
{
  "phone": "+380678209820",
  "audience": "CLIENT",
  "code": "999257",
  "sent_at": "2026-10-29T14:44:20.961957864Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "abaed5d6-a1c7-4f93-a414-9eb35f4c82ab",
  "code": "999257",
  "device_ref": "sandbox-26629"
}
```

```json
{
  "session_id": "66d6dcab-e8cc-467f-b90b-e89ee7f1a2bc",
  "subject": {
    "type": "CLIENT",
    "id": "ca81c00c-f3f9-480e-872a-07383a7c7a14"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTgxYzAwYy1mM2Y5LTQ4MGUtODcyYS0wNzM4M2E3YzdhMTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTYxLCJpYXQiOjE3OTMyODUwNjEsImp0aSI6ImJiMDdhZjlhLWFiYzMtNDIzNS05NjE1LWJmZTcwZThlZDdlMSIsInNpZCI6IjY2ZDZkY2FiLWU4Y2MtNDY3Zi1iOTBiLWU4OWVlN2YxYTJiYyJ9.9RPeSsp6jE46liE-K4LwZZOfVahzbHv6ZLyQBvMoVkw",
  "access_expires_at": "2026-10-29T14:59:21.29748854Z",
  "refresh_token": "JAAvzApfM9erb4cuufgNcYH_1B8WUoZElpESnOYCS_I",
  "refresh_expires_at": "2026-11-28T14:44:21.296680472Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b458b155-bb64-4e4e-aaca-653b773ed958",
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
  "id": "a8006c80-c7f6-4ba0-9fd2-3e709add2a2e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:49:21.591309Z",
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
  "command_id": "918f9e20-c3d9-460a-82fb-3b0e5bcf73c5",
  "quote_id": "a8006c80-c7f6-4ba0-9fd2-3e709add2a2e",
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
  "id": "725fd332-679e-48d5-8236-5ba39797c8b7",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ca81c00c-f3f9-480e-872a-07383a7c7a14",
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
  "created_at": "2026-10-29T14:44:21.876207Z",
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
    "id": "8c875043-fff0-4927-9373-b7cbbcd1a21b",
    "order_id": "725fd332-679e-48d5-8236-5ba39797c8b7",
    "expires_at": "2026-10-29T14:44:36.879585Z",
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

`POST /api/driver/v1/offers/8c875043-fff0-4927-9373-b7cbbcd1a21b/accept` → **200**

```json
{
  "command_id": "62eefd72-6eaf-42cb-b23d-a0c4ff85434c"
}
```

```json
{
  "id": "4f62ba0b-3ed7-4bdb-a6da-a0214b635b9b",
  "order_id": "725fd332-679e-48d5-8236-5ba39797c8b7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9b036290-d9aa-4fc5-8e38-e91ea6eb7364",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9b036290-d9aa-4fc5-8e38-e91ea6eb7364",
  "order_id": "725fd332-679e-48d5-8236-5ba39797c8b7",
  "assignment_id": "4f62ba0b-3ed7-4bdb-a6da-a0214b635b9b",
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

`POST /api/driver/v1/work-sessions/2e21c673-3e74-49c3-8b70-afa59defdbdd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:44:23Z",
    "sequence": 1793285063388
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2e21c673-3e74-49c3-8b70-afa59defdbdd",
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
  "last_heartbeat_at": "2026-10-29T14:44:23.056739Z",
  "last_location_at": "2026-10-29T14:44:23.056739Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9b036290-d9aa-4fc5-8e38-e91ea6eb7364",
  "order_id": "725fd332-679e-48d5-8236-5ba39797c8b7",
  "assignment_id": "4f62ba0b-3ed7-4bdb-a6da-a0214b635b9b",
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

`POST /api/driver/v1/trips/9b036290-d9aa-4fc5-8e38-e91ea6eb7364/arrive` → **200**

```json
{
  "command_id": "2f88c5ba-02c3-4c9a-8c56-f12cfe994c77",
  "expected_version": 0
}
```

```json
{
  "id": "9b036290-d9aa-4fc5-8e38-e91ea6eb7364",
  "order_id": "725fd332-679e-48d5-8236-5ba39797c8b7",
  "assignment_id": "4f62ba0b-3ed7-4bdb-a6da-a0214b635b9b",
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
  "arrived_at": "2026-10-29T14:44:23.643266Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9b036290-d9aa-4fc5-8e38-e91ea6eb7364/start` → **200**

```json
{
  "command_id": "a638dd93-5677-40bb-99fd-6ff6d6d68033",
  "expected_version": 1
}
```

```json
{
  "id": "9b036290-d9aa-4fc5-8e38-e91ea6eb7364",
  "order_id": "725fd332-679e-48d5-8236-5ba39797c8b7",
  "assignment_id": "4f62ba0b-3ed7-4bdb-a6da-a0214b635b9b",
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
  "arrived_at": "2026-10-29T14:44:23.643266Z",
  "started_at": "2026-10-29T14:44:23.935097Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/2e21c673-3e74-49c3-8b70-afa59defdbdd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:44:24Z",
    "sequence": 1793285064224
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2e21c673-3e74-49c3-8b70-afa59defdbdd",
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
  "last_heartbeat_at": "2026-10-29T14:44:24.242385Z",
  "last_location_at": "2026-10-29T14:44:24.242385Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/9b036290-d9aa-4fc5-8e38-e91ea6eb7364/complete` → **200**

```json
{
  "command_id": "262fc397-303b-4445-9510-eab99c03b9d7",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:44:24Z",
  "cash_received": true
}
```

```json
{
  "id": "9b036290-d9aa-4fc5-8e38-e91ea6eb7364",
  "order_id": "725fd332-679e-48d5-8236-5ba39797c8b7",
  "assignment_id": "4f62ba0b-3ed7-4bdb-a6da-a0214b635b9b",
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
  "arrived_at": "2026-10-29T14:44:23.643266Z",
  "started_at": "2026-10-29T14:44:23.935097Z",
  "completed_at": "2026-10-29T14:44:24.525668Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/725fd332-679e-48d5-8236-5ba39797c8b7/rating` → **200**

```json
{
  "command_id": "1087adbc-8a26-4ea1-baf8-0f3b920fad40",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "725fd332-679e-48d5-8236-5ba39797c8b7",
  "score": 5,
  "created_at": "2026-10-29T14:44:24.831516345Z"
}
```

`POST /api/driver/v1/orders/725fd332-679e-48d5-8236-5ba39797c8b7/rating` → **200**

```json
{
  "command_id": "b6860747-c784-4f12-a141-95a40aae928f",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "725fd332-679e-48d5-8236-5ba39797c8b7",
  "score": 4,
  "created_at": "2026-10-29T14:44:25.119298111Z"
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
  "session_id": "c42a54d6-6e69-4668-a7d5-f3c9a3820a18",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5NjUsImlhdCI6MTc5MzI4NTA2NSwianRpIjoiYjY4YjNmNzItOWY3OS00N2RmLWI5NWYtYTk2MWY2NmQwNTRhIiwic2lkIjoiYzQyYTU0ZDYtNmU2OS00NjY4LWE3ZDUtZjNjOWEzODIwYTE4In0.v0YDDKpI9YpC_ANFPgZUhHw_Td5XbD9msRxJoWPY4fY",
  "access_expires_at": "2026-10-29T14:59:25.983016476Z",
  "refresh_token": "plsIwgwGzvSX5Kv4gAfGtG0T4FiYmyxU0b7kdwnkhdg",
  "refresh_expires_at": "2026-10-30T02:44:25.982524481Z",
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
  "session_id": "04dde5c6-13c3-4283-bf28-dc5e39bff67c",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5NjYsImlhdCI6MTc5MzI4NTA2NiwianRpIjoiNjUyYjE4MjItNzkyMC00Mjc5LTg5OWQtZmJhMTljMjBmMDA0Iiwic2lkIjoiMDRkZGU1YzYtMTNjMy00MjgzLWJmMjgtZGM1ZTM5YmZmNjdjIn0.BbI63fOqiBPiJYkCrQsYaAAxb9Adb_uNpKpRPcaIzhw",
  "access_expires_at": "2026-10-29T14:59:26.570642079Z",
  "refresh_token": "bdGk6pKw-otwlsv-7Wn5CJBXnmcuFJEP8ZTCbBP8SN8",
  "refresh_expires_at": "2026-10-30T02:44:26.57011443Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/725fd332-679e-48d5-8236-5ba39797c8b7/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "725fd332-679e-48d5-8236-5ba39797c8b7",
      "author_type": "RIDER",
      "author_id": "ca81c00c-f3f9-480e-872a-07383a7c7a14",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T14:44:24.831516Z"
    },
    {
      "order_id": "725fd332-679e-48d5-8236-5ba39797c8b7",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "ca81c00c-f3f9-480e-872a-07383a7c7a14",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T14:44:25.119298Z"
    }
  ]
}
```

Done: ratings for order 725fd332-679e-48d5-8236-5ba39797c8b7.

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
  "session_id": "d235a63c-2a22-40f4-91ca-585529fc4960",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5NjcsImlhdCI6MTc5MzI4NTA2NywianRpIjoiNTM4MTlmZWItZWQ2MC00YjFhLTg1ZWEtM2ZmOWE5MmNiZmM4Iiwic2lkIjoiZDIzNWE2M2MtMmEyMi00MGY0LTkxY2EtNTg1NTI5ZmM0OTYwIn0.AOcEAU5LrMsX9FBcanLUCHumsFb6ZiiLQXnTVyC12lA",
  "access_expires_at": "2026-10-29T14:59:27.433493624Z",
  "refresh_token": "fYd9h0HnbgdNMrgfBNcwLB1yFGtCw27SYUBkUcTMeng",
  "refresh_expires_at": "2026-10-30T02:44:27.432967288Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "a901c712-39df-47c1-8937-a2c12a77f1ff",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "ee872a85-be4c-43dd-8538-7542095fd7cc",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:44:27.729721Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ee872a85-be4c-43dd-8538-7542095fd7cc` → **200**

```json
{
  "id": "ee872a85-be4c-43dd-8538-7542095fd7cc",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:44:27.729721Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ee872a85-be4c-43dd-8538-7542095fd7cc` → **200**

```json
{
  "id": "ee872a85-be4c-43dd-8538-7542095fd7cc",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:44:27.729721Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ee872a85-be4c-43dd-8538-7542095fd7cc` → **200**

```json
{
  "id": "ee872a85-be4c-43dd-8538-7542095fd7cc",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:44:27.729721Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ee872a85-be4c-43dd-8538-7542095fd7cc` → **200**

```json
{
  "id": "ee872a85-be4c-43dd-8538-7542095fd7cc",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T14:44:27.729721Z",
  "ready_at": "2026-10-29T14:44:30.721808Z",
  "expires_at": "2026-10-30T14:44:30.721808Z"
}
```

`GET /api/admin/v1/reports/exports/ee872a85-be4c-43dd-8538-7542095fd7cc/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "4a163bff-0f15-4087-960a-aa059a7cc7d8",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "78ef3163-4230-4cf4-b4a5-0619c91041a4",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:44:32.185029Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/78ef3163-4230-4cf4-b4a5-0619c91041a4` → **200**

```json
{
  "id": "78ef3163-4230-4cf4-b4a5-0619c91041a4",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:44:32.185029Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/78ef3163-4230-4cf4-b4a5-0619c91041a4` → **200**

```json
{
  "id": "78ef3163-4230-4cf4-b4a5-0619c91041a4",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:44:32.185029Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/78ef3163-4230-4cf4-b4a5-0619c91041a4` → **200**

```json
{
  "id": "78ef3163-4230-4cf4-b4a5-0619c91041a4",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:44:32.185029Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/78ef3163-4230-4cf4-b4a5-0619c91041a4` → **200**

```json
{
  "id": "78ef3163-4230-4cf4-b4a5-0619c91041a4",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T14:44:32.185029Z",
  "ready_at": "2026-10-29T14:44:35.729139Z",
  "expires_at": "2026-10-30T14:44:35.729139Z"
}
```

`GET /api/admin/v1/reports/exports/78ef3163-4230-4cf4-b4a5-0619c91041a4/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/96a421b3-2746-4ad4-aa62-24b7c4d781fd` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/96a421b3-2746-4ad4-aa62-24b7c4d781fd",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "421000e0-2c35-43d4-acd6-494483902441"
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
  "device_ref": "sandbox-22529"
}
```

```json
{
  "challenge_id": "ce15ea82-892c-4768-9448-216eb1da1976",
  "expires_at": "2026-10-29T14:49:36.954984917Z",
  "resend_available_at": "2026-10-29T14:44:37.954984917Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "589676",
  "sent_at": "2026-10-29T14:44:36.957747387Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce15ea82-892c-4768-9448-216eb1da1976",
  "code": "589676",
  "device_ref": "sandbox-22529"
}
```

```json
{
  "session_id": "6f98b5e7-9737-4872-841a-6e3ccc241544",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTk3NywiaWF0IjoxNzkzMjg1MDc3LCJqdGkiOiI0MjYwODJiNy03ZDAzLTQxYzUtODEwYy01YmJiYzEwMWNhYjgiLCJzaWQiOiI2Zjk4YjVlNy05NzM3LTQ4NzItODQxYS02ZTNjY2MyNDE1NDQifQ.H63jE460VFj2Meb0KzDOtmtVFNL9ofwT6fcrDb78gr8",
  "access_expires_at": "2026-10-29T14:59:37.266396717Z",
  "refresh_token": "JjAI_x_LL18_y9XWZ_eetonij2T86nZ9mnkexiLiD14",
  "refresh_expires_at": "2026-11-28T14:44:37.265889115Z",
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
  "command_id": "eb504f23-4ff5-4b17-b7f5-b10f67b93b70",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:44:38Z",
    "sequence": 1793285078128
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "12e1450b-dc24-470d-b019-e058e7c3fc41",
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
  "last_heartbeat_at": "2026-10-29T14:44:38.14612Z",
  "last_location_at": "2026-10-29T14:44:38.14612Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "50632b83-4f11-4026-9ee9-b4834c7e413b",
  "points": [
    {
      "sequence": 1793285080428,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T14:43:40Z"
    },
    {
      "sequence": 1793285080436,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T14:44:40Z"
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
  "session_id": "68e29c08-7361-4b8a-a8d8-8d38b5c30fa1",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5ODEsImlhdCI6MTc5MzI4NTA4MSwianRpIjoiMTk2YTBjZTktOTkyMS00YzM4LTkwOGMtMDRjZDhiYWVhM2E4Iiwic2lkIjoiNjhlMjljMDgtNzM2MS00YjhhLWE4ZDgtOGQzOGI1YzMwZmExIn0.fgebq0MZZsEsD6hkHFZy4LNZGQ1X7aZ4AiQDsGlISig",
  "access_expires_at": "2026-10-29T14:59:41.066931173Z",
  "refresh_token": "CcDhWAgXXOn1RUl0YYscQmZaewgj4DBxzcDVfJJXfWI",
  "refresh_expires_at": "2026-10-30T02:44:41.066379379Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "76ea9485-26fc-4206-b888-6c03fd2c0a25",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T14:44:40Z",
        "track_point_id": "3325fd1f-cae7-4e5b-bf02-b112e67c353c",
        "work_session_id": "12e1450b-dc24-470d-b019-e058e7c3fc41"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T14:44:40Z",
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

`POST /api/admin/v1/driver-risk-flags/76ea9485-26fc-4206-b888-6c03fd2c0a25/confirm` → **200**

```json
{
  "command_id": "384835d1-c4ef-44e1-8a08-a3151ef8f314",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "76ea9485-26fc-4206-b888-6c03fd2c0a25",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T14:44:40Z",
    "track_point_id": "3325fd1f-cae7-4e5b-bf02-b112e67c353c",
    "work_session_id": "12e1450b-dc24-470d-b019-e058e7c3fc41"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T14:44:40Z",
  "reason": null,
  "reviewed_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
  "reviewed_at": "2026-10-29T14:44:41.99496Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/76ea9485-26fc-4206-b888-6c03fd2c0a25/dismiss` → **409**

```json
{
  "command_id": "a906849d-5ac7-41ff-b8e0-e48049eb7f5e",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/76ea9485-26fc-4206-b888-6c03fd2c0a25/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5a3beed8-6bc4-4995-8283-44596b3f6b9d"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "ec7c7a1d-f05a-49ed-bf83-2b8c6416fb01",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "1ebf34d1-459b-423d-906a-5fbb4b096644",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
  "raised_at": "2026-10-29T14:44:42.585301Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/1ebf34d1-459b-423d-906a-5fbb4b096644/dismiss` → **200**

```json
{
  "command_id": "2c0173ed-7162-4dfd-9367-e1eb52bf4c01",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "1ebf34d1-459b-423d-906a-5fbb4b096644",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
  "raised_at": "2026-10-29T14:44:42.585301Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
  "reviewed_at": "2026-10-29T14:44:42.881789Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "e1cd9821-4fe6-4ca3-87bf-394a521f41fd",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "76ea9485-26fc-4206-b888-6c03fd2c0a25"
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
      "actor_id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T14:44:43.18332Z"
    }
  ]
}
```

Done: flag 76ea9485-26fc-4206-b888-6c03fd2c0a25 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "ca3cbaf9-641d-4626-a6dd-39c40055b639",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5ODQsImlhdCI6MTc5MzI4NTA4NCwianRpIjoiZGMzNTZlODUtMDc4YS00ZjFhLTk5NGQtZTAzNWQ1MDZmYjEyIiwic2lkIjoiY2EzY2JhZjktNjQxZC00NjI2LWE2ZGQtMzljNDAwNTViNjM5In0.bOOcWuOdAew_USqV6QHTrK9teUVUfl9gIm_JIUC8R8U",
  "access_expires_at": "2026-10-29T14:59:44.067394385Z",
  "refresh_token": "GjxnDtjo9Z8wtRFL-US5LSZ4QNLCjQg9qHIAVYira2U",
  "refresh_expires_at": "2026-10-30T02:44:44.066779942Z",
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
      "actor_id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T14:44:43.18332Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **409**

```json
{
  "command_id": "877a1b1b-0149-4b30-9e18-e4bee8100b33",
  "expected_version": 6,
  "reason": "Sandbox clean-up"
}
```

```json
{
  "instance": "/api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4d1bcbd2-c5de-4bcc-89d1-3ae36e0811ac"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "12e1450b-dc24-470d-b019-e058e7c3fc41",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "SUSPENDED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-29T14:44:38.14612Z",
  "last_location_at": "2026-10-29T14:44:38.14612Z",
  "eligible": false,
  "ineligible_reasons": [
    "ADMISSION_SUSPENDED"
  ]
}
```

`POST /api/driver/v1/work-sessions/12e1450b-dc24-470d-b019-e058e7c3fc41/close` → **200**

```json
{
  "command_id": "8e459cb2-fb1d-4c71-877a-066f28ff725d",
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
  "review_status": "SUSPENDED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "ADMISSION_SUSPENDED",
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
  "session_id": "549ee186-68da-4765-83e5-f5c161060031",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5ODUsImlhdCI6MTc5MzI4NTA4NSwianRpIjoiN2IyYmNiMTktYzU3Ny00NzRkLWE0ODItYWJmZDcxYmQyZjU3Iiwic2lkIjoiNTQ5ZWUxODYtNjhkYS00NzY1LTgzZTUtZjVjMTYxMDYwMDMxIn0.HpiaBRnCsIrwaA79WDpfYijErAcyK7BOnaaZfa-TBTM",
  "access_expires_at": "2026-10-29T14:59:45.823545106Z",
  "refresh_token": "r25JfwzTCbNafMr8B8jMbh5xr2f8VaT5EmVM6658LCg",
  "refresh_expires_at": "2026-10-30T02:44:45.82297107Z",
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
  "command_id": "6e5cc8f3-4101-4fb3-b13a-1271a8f2d266",
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
  "changed_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T14:44:46.402489Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "6e5cc8f3-4101-4fb3-b13a-1271a8f2d266",
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
  "changed_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T14:44:46.402489Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48692157710",
  "device_ref": "sandbox-7834"
}
```

```json
{
  "challenge_id": "9cbc4113-012d-4db2-b12b-7c7e7e371e32",
  "expires_at": "2026-10-29T14:49:47.011026989Z",
  "resend_available_at": "2026-10-29T14:44:48.011026989Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48692157710` → **200**

```json
{
  "phone": "+48692157710",
  "audience": "CLIENT",
  "code": "168061",
  "sent_at": "2026-10-29T14:44:47.013991469Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9cbc4113-012d-4db2-b12b-7c7e7e371e32",
  "code": "168061",
  "device_ref": "sandbox-7834"
}
```

```json
{
  "session_id": "acf5313e-269d-4541-a311-de90f1923a56",
  "subject": {
    "type": "CLIENT",
    "id": "1c87f5f2-d8ce-4340-adc5-d2ead9128e70"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzg3ZjVmMi1kOGNlLTQzNDAtYWRjNS1kMmVhZDkxMjhlNzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTg3LCJpYXQiOjE3OTMyODUwODcsImp0aSI6IjZjMjcxOWI0LTBiMWQtNGFjNy05Mzk2LWJmYTM1YjQyZTAxZiIsInNpZCI6ImFjZjUzMTNlLTI2OWQtNDU0MS1hMzExLWRlOTBmMTkyM2E1NiJ9.YekEghNjHPKLbPOjWnHmIbv8kHlmFvdBA5GgNzbqg4U",
  "access_expires_at": "2026-10-29T14:59:47.319798203Z",
  "refresh_token": "X6uL5RtqTgDSCCTDIv6xt1pdW7MjesrW7-p1O_-JPOg",
  "refresh_expires_at": "2026-11-28T14:44:47.319251466Z",
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
  "correlation_id": "4c9bf2f0-c486-422f-97ab-258f388c6897"
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
  "device_ref": "sandbox-14749"
}
```

```json
{
  "challenge_id": "60442e1f-8a1f-4e07-b703-14375e3b7bce",
  "expires_at": "2026-10-29T14:49:48.184665557Z",
  "resend_available_at": "2026-10-29T14:44:49.184665557Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "859157",
  "sent_at": "2026-10-29T14:44:48.187632865Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "60442e1f-8a1f-4e07-b703-14375e3b7bce",
  "code": "859157",
  "device_ref": "sandbox-14749"
}
```

```json
{
  "session_id": "40de5d6e-7671-4107-966c-c8f2c3defc27",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTk4OCwiaWF0IjoxNzkzMjg1MDg4LCJqdGkiOiIxODlhY2U5Ni1jMDg5LTQ5NTUtODE0Mi1kMDFhZWRhYjYzYjkiLCJzaWQiOiI0MGRlNWQ2ZS03NjcxLTQxMDctOTY2Yy1jOGYyYzNkZWZjMjcifQ.0EUNlBs7Pf19083mHm3idHM_uBbRcIo1YIDq_idFtp8",
  "access_expires_at": "2026-10-29T14:59:48.497370165Z",
  "refresh_token": "xRnOAx3cemFHRCxIs927oI1VpnNl0Vm98KnhHjLqBfw",
  "refresh_expires_at": "2026-11-28T14:44:48.496855007Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "db8c1b24-5538-4e0a-a339-034e8b1d41fb",
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
  "last_heartbeat_at": "2026-10-29T14:44:16.901863Z",
  "last_location_at": "2026-10-29T14:44:16.901863Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/db8c1b24-5538-4e0a-a339-034e8b1d41fb/handover` → **200**

```json
{
  "command_id": "69e55883-39b2-4244-b6dc-f04b969c8abb",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "db8c1b24-5538-4e0a-a339-034e8b1d41fb",
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
  "last_heartbeat_at": "2026-10-29T14:44:16.901863Z",
  "last_location_at": "2026-10-29T14:44:16.901863Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/db8c1b24-5538-4e0a-a339-034e8b1d41fb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:44:49Z",
    "sequence": 1793285089348
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "db8c1b24-5538-4e0a-a339-034e8b1d41fb",
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
  "last_heartbeat_at": "2026-10-29T14:44:49.366505Z",
  "last_location_at": "2026-10-29T14:44:49.366505Z",
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
  "session_id": "db8c1b24-5538-4e0a-a339-034e8b1d41fb",
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
  "last_heartbeat_at": "2026-10-29T14:44:49.366505Z",
  "last_location_at": "2026-10-29T14:44:49.366505Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/db8c1b24-5538-4e0a-a339-034e8b1d41fb/close` → **200**

```json
{
  "command_id": "52384cb6-15db-462e-a160-b36c5141bc0e",
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
  "correlation_id": "13977429-5e60-4243-a53f-18968ec8ad7b"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676576995",
  "device_ref": "sandbox-9856"
}
```

```json
{
  "challenge_id": "ea5bb3a2-ee49-4e12-9086-e35f431e557e",
  "expires_at": "2026-10-29T14:49:50.846966694Z",
  "resend_available_at": "2026-10-29T14:44:51.846966694Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676576995` → **200**

```json
{
  "phone": "+380676576995",
  "audience": "CLIENT",
  "code": "499814",
  "sent_at": "2026-10-29T14:44:50.850282659Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ea5bb3a2-ee49-4e12-9086-e35f431e557e",
  "code": "499814",
  "device_ref": "sandbox-9856"
}
```

```json
{
  "session_id": "5d6154d3-0112-423f-9bbd-3e93bfc670c2",
  "subject": {
    "type": "CLIENT",
    "id": "aee2e128-5729-4eec-b2c4-54e820be116f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZWUyZTEyOC01NzI5LTRlZWMtYjJjNC01NGU4MjBiZTExNmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTkxLCJpYXQiOjE3OTMyODUwOTEsImp0aSI6IjQ1ZGY3YmQ5LWJhNDUtNDU5ZS04NTI2LThhMjhiODQzM2E0ZCIsInNpZCI6IjVkNjE1NGQzLTAxMTItNDIzZi05YmJkLTNlOTNiZmM2NzBjMiJ9.wWb2Eet32AF9ocD2gAvLyx_T6PJzEvWVC7pSOy2VPIo",
  "access_expires_at": "2026-10-29T14:59:51.157938318Z",
  "refresh_token": "MF1L3aL9AS2f6Uy_bDVyBgNgTydOdHP9r3EPE-3Bhio",
  "refresh_expires_at": "2026-11-28T14:44:51.157425206Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "ab66cfd7-99b7-4a50-a50d-d4ccececbead",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "a04256cb-fd7e-43b8-82bc-df406ea67048",
  "upload_path": "/api/rider/v1/uploads/a04256cb-fd7e-43b8-82bc-df406ea67048",
  "expires_at": "2026-10-29T14:59:51.455135587Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/a04256cb-fd7e-43b8-82bc-df406ea67048` → **200**

```json
{
  "file_id": "a04256cb-fd7e-43b8-82bc-df406ea67048",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "56ae23f0-e41e-4bbf-887f-eb88bc7865f4",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "a04256cb-fd7e-43b8-82bc-df406ea67048"
  ]
}
```

```json
{
  "id": "6ea6044a-007e-4b78-913d-64699d24fb7a",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "aee2e128-5729-4eec-b2c4-54e820be116f",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T14:44:51.801721Z",
  "updated_at": "2026-10-29T14:44:51.801721Z",
  "respond_by": "2026-10-29T18:44:51.801721Z",
  "messages": [
    {
      "id": "ff6d3f51-7a8a-4047-bfbd-f859494bfd5e",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "aee2e128-5729-4eec-b2c4-54e820be116f",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:44:51.802696Z",
      "attachments": [
        {
          "file_id": "a04256cb-fd7e-43b8-82bc-df406ea67048",
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
  "session_id": "1678e7fe-f0c7-431b-bf20-43a61b99e82d",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5OTIsImlhdCI6MTc5MzI4NTA5MiwianRpIjoiMDYxNmNjMjgtMzA3ZS00NjQ1LWE5MjAtOGEzZDMxNDRlYWFiIiwic2lkIjoiMTY3OGU3ZmUtZjBjNy00MzFiLWJmMjAtNDNhNjFiOTllODJkIn0.A1uLxMAaOdMsi5ibcm2gyyJ5PzlFSapG0oJqgTzll5s",
  "access_expires_at": "2026-10-29T14:59:52.415404397Z",
  "refresh_token": "kc_j9_e2NMxI8wPjt0XmTIle_rrnZFAsDDXbwKXLLf8",
  "refresh_expires_at": "2026-10-30T02:44:52.414857742Z",
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
  "session_id": "a1d41865-9592-4b51-962b-f2659edf1d35",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5OTIsImlhdCI6MTc5MzI4NTA5MiwianRpIjoiNmU5ZjFhNTgtNTk5Ni00YjZkLWJiNDQtZjEyZTJjMjMwODAzIiwic2lkIjoiYTFkNDE4NjUtOTU5Mi00YjUxLTk2MmItZjI2NTllZGYxZDM1In0.Rj48bFv8Eh8RZ4SxsfnBZSogR8-IkEZ4y0OipLzG6mc",
  "access_expires_at": "2026-10-29T14:59:52.99075111Z",
  "refresh_token": "6IfN53h1OxBxlfBngenfteFm0cruduN7fcY-vDKimkc",
  "refresh_expires_at": "2026-10-30T02:44:52.990155544Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/6ea6044a-007e-4b78-913d-64699d24fb7a/attachments/a04256cb-fd7e-43b8-82bc-df406ea67048` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "bfc2f0c6-c17a-448e-bb19-f9aed0cf139f",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "c505947c-ec71-4189-a73f-c57ee6453751",
  "upload_path": "/api/operator/v1/uploads/c505947c-ec71-4189-a73f-c57ee6453751",
  "expires_at": "2026-10-29T14:59:53.289440888Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/c505947c-ec71-4189-a73f-c57ee6453751` → **200**

```json
{
  "file_id": "c505947c-ec71-4189-a73f-c57ee6453751",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/6ea6044a-007e-4b78-913d-64699d24fb7a` → **200**

```json
{
  "id": "6ea6044a-007e-4b78-913d-64699d24fb7a",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "aee2e128-5729-4eec-b2c4-54e820be116f",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T14:44:51.801721Z",
  "updated_at": "2026-10-29T14:44:51.801721Z",
  "respond_by": "2026-10-29T18:44:51.801721Z",
  "messages": [
    {
      "id": "ff6d3f51-7a8a-4047-bfbd-f859494bfd5e",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "aee2e128-5729-4eec-b2c4-54e820be116f",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:44:51.802696Z",
      "attachments": [
        {
          "file_id": "a04256cb-fd7e-43b8-82bc-df406ea67048",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/6ea6044a-007e-4b78-913d-64699d24fb7a/comments` → **200**

```json
{
  "command_id": "839f70e4-36c9-4b9e-8a2f-67cd0946d7d5",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "c505947c-ec71-4189-a73f-c57ee6453751"
  ]
}
```

```json
{
  "id": "6ea6044a-007e-4b78-913d-64699d24fb7a",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "aee2e128-5729-4eec-b2c4-54e820be116f",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T14:44:51.801721Z",
  "updated_at": "2026-10-29T14:44:53.899502Z",
  "respond_by": "2026-10-29T18:44:51.801721Z",
  "messages": [
    {
      "id": "ff6d3f51-7a8a-4047-bfbd-f859494bfd5e",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "aee2e128-5729-4eec-b2c4-54e820be116f",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:44:51.802696Z",
      "attachments": [
        {
          "file_id": "a04256cb-fd7e-43b8-82bc-df406ea67048",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "2866f0c3-c8ae-4ba7-a459-75f917a77b8c",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T14:44:53.898968Z",
      "attachments": [
        {
          "file_id": "c505947c-ec71-4189-a73f-c57ee6453751",
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

`GET /api/rider/v1/support/cases/6ea6044a-007e-4b78-913d-64699d24fb7a` → **200**

```json
{
  "id": "6ea6044a-007e-4b78-913d-64699d24fb7a",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "aee2e128-5729-4eec-b2c4-54e820be116f",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T14:44:51.801721Z",
  "updated_at": "2026-10-29T14:44:53.899502Z",
  "respond_by": "2026-10-29T18:44:51.801721Z",
  "messages": [
    {
      "id": "ff6d3f51-7a8a-4047-bfbd-f859494bfd5e",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "aee2e128-5729-4eec-b2c4-54e820be116f",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:44:51.802696Z",
      "attachments": [
        {
          "file_id": "a04256cb-fd7e-43b8-82bc-df406ea67048",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "2866f0c3-c8ae-4ba7-a459-75f917a77b8c",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T14:44:53.898968Z",
      "attachments": [
        {
          "file_id": "c505947c-ec71-4189-a73f-c57ee6453751",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/6ea6044a-007e-4b78-913d-64699d24fb7a/attachments/c505947c-ec71-4189-a73f-c57ee6453751` → **200**

Done: support case 6ea6044a-007e-4b78-913d-64699d24fb7a, rider attachment a04256cb-fd7e-43b8-82bc-df406ea67048, operator attachment c505947c-ec71-4189-a73f-c57ee6453751.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739995615",
  "device_ref": "sandbox-24805"
}
```

```json
{
  "challenge_id": "593cf5ea-b5a5-4210-ba66-dabae5a9ca07",
  "expires_at": "2026-10-29T14:49:54.526055376Z",
  "resend_available_at": "2026-10-29T14:44:55.526055376Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739995615` → **200**

```json
{
  "phone": "+380739995615",
  "audience": "CLIENT",
  "code": "908496",
  "sent_at": "2026-10-29T14:44:54.528703245Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "593cf5ea-b5a5-4210-ba66-dabae5a9ca07",
  "code": "908496",
  "device_ref": "sandbox-24805"
}
```

```json
{
  "session_id": "2e59906a-7620-4ecb-955e-64daffb727ae",
  "subject": {
    "type": "CLIENT",
    "id": "427e98c5-dc70-4c8b-83fc-dae8081c4898"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MjdlOThjNS1kYzcwLTRjOGItODNmYy1kYWU4MDgxYzQ4OTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTk0LCJpYXQiOjE3OTMyODUwOTQsImp0aSI6ImYxMDRlYjU2LWQxMjctNGI0Ni04NTVmLWNhMzY0ZWExN2RhYyIsInNpZCI6IjJlNTk5MDZhLTc2MjAtNGVjYi05NTVlLTY0ZGFmZmI3MjdhZSJ9.k5gItyiIOzfYJZS3az_SdhFNh7PJtAQUoaJ1_Db1jJM",
  "access_expires_at": "2026-10-29T14:59:54.838410908Z",
  "refresh_token": "DMUr_MgIRQV5634A0bQBrEHMlvi9XHHOmO7mfqTqDY8",
  "refresh_expires_at": "2026-11-28T14:44:54.837915626Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "247a0aef-c308-416d-a3cb-3c1490f52f2e",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "78a58d15-4e44-48c8-91cc-c0a491faf5b4",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-78a58d15-4e44-48c8-91cc-c0a491faf5b4",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "ce93005d3321dc34ebcd90504dd76fd4",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=78a58d15-4e44-48c8-91cc-c0a491faf5b4",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739995615"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=78a58d15-4e44-48c8-91cc-c0a491faf5b4",
  "expires_at": "2026-10-29T15:14:55.129388Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/78a58d15-4e44-48c8-91cc-c0a491faf5b4` → **200**

```json
{
  "id": "78a58d15-4e44-48c8-91cc-c0a491faf5b4",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T15:14:55.129388Z",
  "card": {
    "id": "91c88978-8a7f-4fa3-9978-de71d6142fd3",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9830",
    "card_type": "Visa",
    "created_at": "2026-10-29T14:44:55.414961Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d227da25-2f98-4c15-98dd-190e7e3fbc43",
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
  "id": "6008971e-16d5-4041-8c2a-66253530cf3e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:49:55.712274Z",
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
  "command_id": "ee38d90f-282b-4c91-b0cd-b9e62ee80329",
  "quote_id": "6008971e-16d5-4041-8c2a-66253530cf3e",
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
  "id": "b3c686c2-fda0-49af-844c-22ff2d0fdfd5",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "427e98c5-dc70-4c8b-83fc-dae8081c4898",
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
  "created_at": "2026-10-29T14:44:56.014942Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b3c686c2-fda0-49af-844c-22ff2d0fdfd5` → **200**

```json
{
  "id": "b3c686c2-fda0-49af-844c-22ff2d0fdfd5",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "427e98c5-dc70-4c8b-83fc-dae8081c4898",
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
  "created_at": "2026-10-29T14:44:56.014942Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b3c686c2-fda0-49af-844c-22ff2d0fdfd5` → **200**

```json
{
  "id": "b3c686c2-fda0-49af-844c-22ff2d0fdfd5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "427e98c5-dc70-4c8b-83fc-dae8081c4898",
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
  "created_at": "2026-10-29T14:44:56.014942Z",
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

`GET /api/rider/v1/orders/b3c686c2-fda0-49af-844c-22ff2d0fdfd5` → **200**

```json
{
  "id": "b3c686c2-fda0-49af-844c-22ff2d0fdfd5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "427e98c5-dc70-4c8b-83fc-dae8081c4898",
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
  "created_at": "2026-10-29T14:44:56.014942Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b3c686c2-fda0-49af-844c-22ff2d0fdfd5/switch-to-cash` → **200**

```json
{
  "command_id": "e66f2ba8-3a37-47e0-b58a-adcf20bd27e9",
  "expected_version": 3
}
```

```json
{
  "id": "b3c686c2-fda0-49af-844c-22ff2d0fdfd5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "427e98c5-dc70-4c8b-83fc-dae8081c4898",
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
  "created_at": "2026-10-29T14:44:56.014942Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b3c686c2-fda0-49af-844c-22ff2d0fdfd5/switch-to-cash` → **409**

```json
{
  "command_id": "b31bbe7f-1a33-4a58-a117-16ca01ee9d1a",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/b3c686c2-fda0-49af-844c-22ff2d0fdfd5/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "17e224e4-5297-4b89-9c57-2a59ff60a43b"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/b3c686c2-fda0-49af-844c-22ff2d0fdfd5` → **200**

```json
{
  "id": "b3c686c2-fda0-49af-844c-22ff2d0fdfd5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "427e98c5-dc70-4c8b-83fc-dae8081c4898",
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
  "created_at": "2026-10-29T14:44:56.014942Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b3c686c2-fda0-49af-844c-22ff2d0fdfd5/cancel` → **200**

```json
{
  "command_id": "6981ddfa-29ec-4b49-8b1e-50aaa2cb6d09",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b3c686c2-fda0-49af-844c-22ff2d0fdfd5",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "427e98c5-dc70-4c8b-83fc-dae8081c4898",
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
  "created_at": "2026-10-29T14:44:56.014942Z",
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
  "session_id": "611291b4-f510-49f6-9c0c-786eae8a43c7",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5OTksImlhdCI6MTc5MzI4NTA5OSwianRpIjoiNTFiMmRkNDctZjc4ZC00MjI1LWJmMDUtZmQ0Y2YwNDljYjdmIiwic2lkIjoiNjExMjkxYjQtZjUxMC00OWY2LTljMGMtNzg2ZWFlOGE0M2M3In0.-VsfbncFukhvQQdWr6lbBh7I6aJ-LZF07RuXWztQCtA",
  "access_expires_at": "2026-10-29T14:59:59.724135823Z",
  "refresh_token": "2LzPcG-JgIQ5svSrVJlHvPi9Z0yyMA7zkux8DtG0eVc",
  "refresh_expires_at": "2026-10-30T02:44:59.723626437Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-2291"
}
```

```json
{
  "challenge_id": "d44d030f-12f0-4a7d-8264-236b160bb06a",
  "expires_at": "2026-10-29T14:50:00.008256469Z",
  "resend_available_at": "2026-10-29T14:45:01.008256469Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "149805",
  "sent_at": "2026-10-29T14:45:00.01112142Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d44d030f-12f0-4a7d-8264-236b160bb06a",
  "code": "149805",
  "device_ref": "sandbox-2291"
}
```

```json
{
  "session_id": "b9471638-f0c8-4fa8-be43-54ae524a9f0f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjAwMCwiaWF0IjoxNzkzMjg1MTAwLCJqdGkiOiJmYjZjYWRjYy1mYWY2LTRkZDYtOWVjNi1iOTdlZjdmN2EwMjEiLCJzaWQiOiJiOTQ3MTYzOC1mMGM4LTRmYTgtYmU0My01NGFlNTI0YTlmMGYifQ.I60m6av116-_aRcaUFbYKBQEprZP3_BGKmSPbOnSbQM",
  "access_expires_at": "2026-10-29T15:00:00.320206175Z",
  "refresh_token": "D2uFCBZkUNQOAbpOc2fqmTYV9dSxWFlrN-bApcz9dBI",
  "refresh_expires_at": "2026-11-28T14:45:00.319715453Z",
  "account_created": false
}
```

`GET /api/driver/v1/profile` → **200**

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "SUSPENDED",
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
    "review_status": "SUSPENDED",
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
      "actor_id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T14:44:43.18332Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "b1959116-56f1-43a5-b62c-a00548a0c4d5",
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
  "review_status": "SUSPENDED",
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
  "device_ref": "sandbox-31667"
}
```

```json
{
  "challenge_id": "ff266055-8845-4964-8228-ed967f24273d",
  "expires_at": "2026-10-29T14:50:01.456502002Z",
  "resend_available_at": "2026-10-29T14:45:02.456502002Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "280485",
  "sent_at": "2026-10-29T14:45:01.458984643Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ff266055-8845-4964-8228-ed967f24273d",
  "code": "280485",
  "device_ref": "sandbox-31667"
}
```

```json
{
  "session_id": "afa874cf-eb91-4118-8601-70469bb40fcc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjAwMSwiaWF0IjoxNzkzMjg1MTAxLCJqdGkiOiJmZTNjZWQ5Ni1kYzljLTQxY2YtOTYxNC02YTcyN2FjNTM0MGEiLCJzaWQiOiJhZmE4NzRjZi1lYjkxLTQxMTgtODYwMS03MDQ2OWJiNDBmY2MifQ.hbj3tRLDTiYPXiLJ-hFkuuqruYRihD_xuP6N_6nuDXM",
  "access_expires_at": "2026-10-29T15:00:01.783754208Z",
  "refresh_token": "2Ue020u0rUBUDRjwEl38HNz6ZGjGNdKCZDQszm_VU7M",
  "refresh_expires_at": "2026-11-28T14:45:01.783186504Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2e21c673-3e74-49c3-8b70-afa59defdbdd",
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
  "last_heartbeat_at": "2026-10-29T14:44:24.242385Z",
  "last_location_at": "2026-10-29T14:44:24.242385Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/2e21c673-3e74-49c3-8b70-afa59defdbdd/handover` → **200**

```json
{
  "command_id": "76d2ec23-6501-416b-b55a-c8ce92e2561c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2e21c673-3e74-49c3-8b70-afa59defdbdd",
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
  "last_heartbeat_at": "2026-10-29T14:44:24.242385Z",
  "last_location_at": "2026-10-29T14:44:24.242385Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/2e21c673-3e74-49c3-8b70-afa59defdbdd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:45:02Z",
    "sequence": 1793285102641
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2e21c673-3e74-49c3-8b70-afa59defdbdd",
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
  "last_heartbeat_at": "2026-10-29T14:45:02.659181Z",
  "last_location_at": "2026-10-29T14:45:02.659181Z",
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
  "review_status": "SUSPENDED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "ADMISSION_SUSPENDED",
    "NO_OPEN_SESSION"
  ]
}
```

`POST /api/driver/v1/work-sessions` → **409**

```json
{
  "command_id": "6e0b6d85-b159-4970-bfc9-ce0b21e9fc29",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:45:03Z",
    "sequence": 1793285103209
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
  "correlation_id": "4a7397ea-716f-4dc0-8e75-ff0018b572a1"
}
```

**Expected 201, got 409 — scenario stopped.**

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-13347"
}
```

```json
{
  "challenge_id": "fbbc9289-2e1b-4b94-b9e7-77cd839f6d00",
  "expires_at": "2026-10-29T14:50:03.539528697Z",
  "resend_available_at": "2026-10-29T14:45:04.539528697Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "952575",
  "sent_at": "2026-10-29T14:45:03.542162853Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fbbc9289-2e1b-4b94-b9e7-77cd839f6d00",
  "code": "952575",
  "device_ref": "sandbox-13347"
}
```

```json
{
  "session_id": "153e8f61-0345-4c85-9436-239bf753c016",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjAwMywiaWF0IjoxNzkzMjg1MTAzLCJqdGkiOiJjMjIyNDdhMi0xMWYwLTRlN2ItYmJlNy05OWIzMDYxNDc4YjgiLCJzaWQiOiIxNTNlOGY2MS0wMzQ1LTRjODUtOTQzNi0yMzliZjc1M2MwMTYifQ.zgqG-8xNVhYAnV3sHWNs7FD_sZJMHE2G98oi_n4q38k",
  "access_expires_at": "2026-10-29T15:00:03.862016846Z",
  "refresh_token": "mXyt1rQAYP4TMH_tIe3hEpVS0CIL78mQda5f_3Tk4XM",
  "refresh_expires_at": "2026-11-28T14:45:03.861415607Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2e21c673-3e74-49c3-8b70-afa59defdbdd",
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
  "last_heartbeat_at": "2026-10-29T14:45:02.659181Z",
  "last_location_at": "2026-10-29T14:45:02.659181Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2e21c673-3e74-49c3-8b70-afa59defdbdd/close` → **409**

```json
{
  "command_id": "771a52ed-3333-4cd8-8fec-ed26f936ad9c",
  "expected_version": 1
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions/2e21c673-3e74-49c3-8b70-afa59defdbdd/close",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4c472313-dd2b-4580-9504-0c41a28b1b0a"
}
```

**Expected 200, got 409 — scenario stopped.**

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
  "session_id": "05730d78-710e-4c92-9000-58766ca59bea",
  "subject": {
    "type": "STAFF",
    "id": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDBiM2I1Yy1hNmFkLTQ1YjctYTljZC01YjRjNzA1YjNhNWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODYwMDUsImlhdCI6MTc5MzI4NTEwNSwianRpIjoiMThjMGE1NGEtZWJmNi00ZjBkLTkwM2ItY2JiZjZhMzM4NWQwIiwic2lkIjoiMDU3MzBkNzgtNzEwZS00YzkyLTkwMDAtNTg3NjZjYTU5YmVhIn0.975vbG2KexkcTNziAoY9XbCGm--YFzv1Vv_aECnL0FY",
  "access_expires_at": "2026-10-29T15:00:05.030401168Z",
  "refresh_token": "UwqYtNhm0gp2DHoLJ94HdwKlII0tLAnIEijipKREFF4",
  "refresh_expires_at": "2026-10-30T02:45:05.029850298Z",
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
  "id": "befca494-48c1-4359-9d7f-22229d25c38b",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:45:05.331335Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:45:05.33144Z",
  "updated_at": "2026-10-29T14:45:05.34837Z",
  "finished_at": "2026-10-29T14:45:05.34837Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/befca494-48c1-4359-9d7f-22229d25c38b` → **200**

```json
{
  "run": {
    "id": "befca494-48c1-4359-9d7f-22229d25c38b",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T14:45:05.331335Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T14:45:05.33144Z",
    "updated_at": "2026-10-29T14:45:05.34837Z",
    "finished_at": "2026-10-29T14:45:05.34837Z",
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
  "id": "befca494-48c1-4359-9d7f-22229d25c38b",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:45:05.331335Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:45:05.33144Z",
  "updated_at": "2026-10-29T14:45:05.34837Z",
  "finished_at": "2026-10-29T14:45:05.34837Z",
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
  "id": "befca494-48c1-4359-9d7f-22229d25c38b",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:45:05.331335Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:45:05.33144Z",
  "updated_at": "2026-10-29T14:45:05.34837Z",
  "finished_at": "2026-10-29T14:45:05.34837Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/ab72a8ab-5ca8-4049-8e81-dc5286d8a805` → **204**

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
  "id": "b7773110-b55e-44cc-aecd-80fe63346d88",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:45:05.786637Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:45:05.786721Z",
  "updated_at": "2026-10-29T14:45:05.794889Z",
  "finished_at": "2026-10-29T14:45:05.794889Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/b7773110-b55e-44cc-aecd-80fe63346d88` → **200**

```json
{
  "run": {
    "id": "b7773110-b55e-44cc-aecd-80fe63346d88",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T14:45:05.786637Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T14:45:05.786721Z",
    "updated_at": "2026-10-29T14:45:05.794889Z",
    "finished_at": "2026-10-29T14:45:05.794889Z",
    "version": 1
  },
  "items": [
    {
      "id": "30bb5290-9528-4eb5-8d8c-b97000175dd1",
      "run_id": "b7773110-b55e-44cc-aecd-80fe63346d88",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "8d68e0280ff9784b255ffa2fcae5a2c89e6ea0a380e69d5b52b01c6834310c9f",
      "reference_display": "sandbox-reconciliation-ab72a8ab-5ca8-4049-8e81-dc5286d8a805",
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
      "provider_at": "2026-10-29T14:45:05Z",
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
  "id": "b7773110-b55e-44cc-aecd-80fe63346d88",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:45:05.786637Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:45:05.786721Z",
  "updated_at": "2026-10-29T14:45:05.794889Z",
  "finished_at": "2026-10-29T14:45:05.794889Z",
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
  "id": "b7773110-b55e-44cc-aecd-80fe63346d88",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:45:05.786637Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:45:05.786721Z",
  "updated_at": "2026-10-29T14:45:05.794889Z",
  "finished_at": "2026-10-29T14:45:05.794889Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/30bb5290-9528-4eb5-8d8c-b97000175dd1/resolve` → **200**

```json
{
  "command_id": "6504815a-3256-47fc-8cc8-19e8f0d8e298",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "30bb5290-9528-4eb5-8d8c-b97000175dd1",
  "run_id": "b7773110-b55e-44cc-aecd-80fe63346d88",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "8d68e0280ff9784b255ffa2fcae5a2c89e6ea0a380e69d5b52b01c6834310c9f",
  "reference_display": "sandbox-reconciliation-ab72a8ab-5ca8-4049-8e81-dc5286d8a805",
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
  "provider_at": "2026-10-29T14:45:05Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
  "resolved_at": "2026-10-29T14:45:06.217035Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/30bb5290-9528-4eb5-8d8c-b97000175dd1/resolve` → **200**

```json
{
  "command_id": "6504815a-3256-47fc-8cc8-19e8f0d8e298",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "30bb5290-9528-4eb5-8d8c-b97000175dd1",
  "run_id": "b7773110-b55e-44cc-aecd-80fe63346d88",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "8d68e0280ff9784b255ffa2fcae5a2c89e6ea0a380e69d5b52b01c6834310c9f",
  "reference_display": "sandbox-reconciliation-ab72a8ab-5ca8-4049-8e81-dc5286d8a805",
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
  "provider_at": "2026-10-29T14:45:05Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
  "resolved_at": "2026-10-29T14:45:06.217035Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/30bb5290-9528-4eb5-8d8c-b97000175dd1/resolve` → **409**

```json
{
  "command_id": "bd2af03e-c6ae-450c-bf11-2fdf36901ac3",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/30bb5290-9528-4eb5-8d8c-b97000175dd1/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "97930500-8015-4ee5-829a-f93a0190ad81"
}
```

`GET /api/admin/v1/payment-reconciliations/b7773110-b55e-44cc-aecd-80fe63346d88` → **200**

```json
{
  "run": {
    "id": "b7773110-b55e-44cc-aecd-80fe63346d88",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T14:45:05.786637Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T14:45:05.786721Z",
    "updated_at": "2026-10-29T14:45:06.217035Z",
    "finished_at": "2026-10-29T14:45:05.794889Z",
    "version": 2
  },
  "items": [
    {
      "id": "30bb5290-9528-4eb5-8d8c-b97000175dd1",
      "run_id": "b7773110-b55e-44cc-aecd-80fe63346d88",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "8d68e0280ff9784b255ffa2fcae5a2c89e6ea0a380e69d5b52b01c6834310c9f",
      "reference_display": "sandbox-reconciliation-ab72a8ab-5ca8-4049-8e81-dc5286d8a805",
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
      "provider_at": "2026-10-29T14:45:05Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "4d0b3b5c-a6ad-45b7-a9cd-5b4c705b3a5a",
      "resolved_at": "2026-10-29T14:45:06.217035Z",
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
      "id": "b7773110-b55e-44cc-aecd-80fe63346d88",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-29T14:45:05.786637Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T14:45:05.786721Z",
      "updated_at": "2026-10-29T14:45:06.217035Z",
      "finished_at": "2026-10-29T14:45:05.794889Z",
      "version": 2
    },
    {
      "id": "d833b129-73c1-4bd0-9a9c-2fecc5765226",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-28",
      "period_from": "2026-10-27T22:00:00Z",
      "period_to": "2026-10-29T02:00:00Z",
      "observed_until": "2026-10-29T14:40:15.593045Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T14:40:15.593212Z",
      "updated_at": "2026-10-29T14:40:15.601016Z",
      "finished_at": "2026-10-29T14:40:15.601016Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/ab72a8ab-5ca8-4049-8e81-dc5286d8a805` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29"
}
```

```json
{
  "id": "b7773110-b55e-44cc-aecd-80fe63346d88",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:45:05.786637Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:45:05.786721Z",
  "updated_at": "2026-10-29T14:45:06.217035Z",
  "finished_at": "2026-10-29T14:45:05.794889Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793285230775E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793285230892E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793285230893E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793285230894E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793285230893E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
