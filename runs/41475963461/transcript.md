# Sandbox transcript (2026-11-02T15:54:06Z, 08bc92c)

# Scenario: address-duplicates

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
  "correlation_id": "4e0e2390-373d-4c6e-89c5-1004f37b7ba8"
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
  "session_id": "c0cc52a5-e33f-41b1-a3a9-844b8cd4ade7",
  "subject": {
    "type": "STAFF",
    "id": "ef2f46e4-651f-479e-ac64-61e783c4f37f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZjJmNDZlNC02NTFmLTQ3OWUtYWM2NC02MWU3ODNjNGYzN2YiLCJhdWQiOiJhZG1pbiIsInN2YyI6IjVlMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDAwMSIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM2MzU3NTQsImlhdCI6MTc5MzYzNDg1NCwianRpIjoiN2FkODM5ZWQtYWU3Ni00ZTVhLTlmOWYtZjRkY2FhZWI3NjYxIiwic2lkIjoiYzBjYzUyYTUtZTMzZi00MWIxLWEzYTktODQ0YjhjZDRhZGU3In0.VWPa2HJRf_w8aRyrP_BuqsVlTFhPHuP7mTryGYSBjXQ",
  "access_expires_at": "2026-11-02T16:09:14.905336074Z",
  "refresh_token": "GMcPB1kV4k5R1B6ps8bWtBe5NndlXsgoBmggd4rM-iM",
  "refresh_expires_at": "2026-11-03T03:54:14.902922813Z",
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
  "session_id": "44686821-dbc2-4d5b-9e86-67c489584e85",
  "subject": {
    "type": "STAFF",
    "id": "ef2f46e4-651f-479e-ac64-61e783c4f37f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZjJmNDZlNC02NTFmLTQ3OWUtYWM2NC02MWU3ODNjNGYzN2YiLCJhdWQiOiJhZG1pbiIsInN2YyI6IjVlMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDAwMSIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM2MzU3NTYsImlhdCI6MTc5MzYzNDg1NiwianRpIjoiYzI0MWRhMGEtYzg4Yi00ZmNkLWEwN2UtOTMxZGI5ZTVmMjIxIiwic2lkIjoiNDQ2ODY4MjEtZGJjMi00ZDViLTllODYtNjdjNDg5NTg0ZTg1In0.zKIZDhUMTLTMPUFOLFUo4J5xTUeHj4jbhN63VE4Oifw",
  "access_expires_at": "2026-11-02T16:09:16.781158012Z",
  "refresh_token": "eg2--xvLhHMpp6JxKFQrLEPI0hcM13phqUN0GDQheQo",
  "refresh_expires_at": "2026-11-03T03:54:16.779850832Z",
  "password_change_required": false
}
```

`GET /api/config/v1/bootstrap` → **200**

```json
{
  "settings_version": 0,
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
      "orders_paused": false,
      "center": {
        "lat": 52.230000000000004,
        "lon": 21.060000000000002
      }
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
      "orders_paused": false,
      "center": {
        "lat": 50.425,
        "lon": 30.525
      }
    }
  ],
  "app_versions": {
    "rider_android": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
```

## Staff add Хрещатик, 983

`POST /api/admin/v1/addresses` → **201**

```json
{
  "command_id": "82c59814-03f2-402a-ad45-e29adfef34b7",
  "data": {
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "kind": "HOUSE",
    "label": "Хрещатик, 983",
    "language": "uk",
    "street": "Хрещатик",
    "house_raw": "983",
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    }
  },
  "reason": "Sandbox address"
}
```

```json
{
  "id": "4533bf7e-c58c-4347-9dd4-4ffd13073e30",
  "data": {
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "kind": "HOUSE",
    "label": "Хрещатик, 983",
    "language": "uk",
    "street": "Хрещатик",
    "house_raw": "983",
    "building": null,
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "instructions": null,
    "override": null
  },
  "house": {
    "number": "983",
    "suffix": "",
    "building": ""
  },
  "source": "OWN",
  "visibility": "ACTIVE",
  "version": 0,
  "aliases": []
}
```

## The same house 10 m away is a duplicate naming the first

`POST /api/admin/v1/addresses` → **409**

```json
{
  "command_id": "90f6c7e4-a3c9-40e4-8307-ac411d824aee",
  "data": {
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "kind": "HOUSE",
    "label": "Хрещатик, 983",
    "language": "uk",
    "street": "Хрещатик",
    "house_raw": "983",
    "pickup": {
      "lat": 50.45019,
      "lon": 30.5234
    }
  },
  "reason": "Sandbox duplicate"
}
```

```json
{
  "instance": "/api/admin/v1/addresses",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3b54d261-b32d-4f54-b4f5-9c745a1b64bd",
  "duplicate_of": "4533bf7e-c58c-4347-9dd4-4ffd13073e30"
}
```

## Saved as distinct with a reason, it is accepted

`POST /api/admin/v1/addresses` → **201**

```json
{
  "command_id": "ea5eb244-5157-482c-b536-19da2a47a104",
  "data": {
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "kind": "HOUSE",
    "label": "Хрещатик, 983",
    "language": "uk",
    "street": "Хрещатик",
    "house_raw": "983",
    "pickup": {
      "lat": 50.45019,
      "lon": 30.5234
    }
  },
  "reason": "Sandbox: the yard entrance is another pickup point",
  "distinct": true
}
```

```json
{
  "id": "bffbf839-07ae-4204-8265-d053222efc19",
  "data": {
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "kind": "HOUSE",
    "label": "Хрещатик, 983",
    "language": "uk",
    "street": "Хрещатик",
    "house_raw": "983",
    "building": null,
    "pickup": {
      "lat": 50.45019,
      "lon": 30.5234
    },
    "instructions": null,
    "override": null
  },
  "house": {
    "number": "983",
    "suffix": "",
    "building": ""
  },
  "source": "OWN",
  "visibility": "ACTIVE",
  "version": 0,
  "aliases": []
}
```

## Hidden, then restored: a duplicate again unless restored as distinct

`GET /api/admin/v1/addresses/bffbf839-07ae-4204-8265-d053222efc19` → **200**

```json
{
  "id": "bffbf839-07ae-4204-8265-d053222efc19",
  "data": {
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "kind": "HOUSE",
    "label": "Хрещатик, 983",
    "language": "uk",
    "street": "Хрещатик",
    "house_raw": "983",
    "building": null,
    "pickup": {
      "lat": 50.45019,
      "lon": 30.5234
    },
    "instructions": null,
    "override": null
  },
  "house": {
    "number": "983",
    "suffix": "",
    "building": ""
  },
  "source": "OWN",
  "visibility": "ACTIVE",
  "version": 0,
  "aliases": []
}
```

`POST /api/admin/v1/addresses/bffbf839-07ae-4204-8265-d053222efc19/hide` → **200**

```json
{
  "command_id": "a5b4b501-c5f5-4593-92a9-35cf1587d24f",
  "expected_version": 0,
  "reason": "Sandbox: closed for repairs"
}
```

```json
{
  "id": "bffbf839-07ae-4204-8265-d053222efc19",
  "data": {
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "kind": "HOUSE",
    "label": "Хрещатик, 983",
    "language": "uk",
    "street": "Хрещатик",
    "house_raw": "983",
    "building": null,
    "pickup": {
      "lat": 50.45019,
      "lon": 30.5234
    },
    "instructions": null,
    "override": null
  },
  "house": {
    "number": "983",
    "suffix": "",
    "building": ""
  },
  "source": "OWN",
  "visibility": "HIDDEN",
  "version": 1,
  "aliases": []
}
```

`POST /api/admin/v1/addresses/bffbf839-07ae-4204-8265-d053222efc19/restore` → **409**

```json
{
  "command_id": "f65b4ee6-8ac6-4c5e-a2d9-311cf88443d1",
  "expected_version": 1,
  "reason": "Sandbox: open again"
}
```

```json
{
  "instance": "/api/admin/v1/addresses/bffbf839-07ae-4204-8265-d053222efc19/restore",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6cf45799-a8fb-4510-ad77-20c87586c38f",
  "duplicate_of": "4533bf7e-c58c-4347-9dd4-4ffd13073e30"
}
```

`POST /api/admin/v1/addresses/bffbf839-07ae-4204-8265-d053222efc19/restore` → **200**

```json
{
  "command_id": "f91fa431-99a9-4a15-b339-f3ba07cb0ef1",
  "expected_version": 1,
  "reason": "Sandbox: the yard entrance is open again",
  "distinct": true
}
```

```json
{
  "id": "bffbf839-07ae-4204-8265-d053222efc19",
  "data": {
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "kind": "HOUSE",
    "label": "Хрещатик, 983",
    "language": "uk",
    "street": "Хрещатик",
    "house_raw": "983",
    "building": null,
    "pickup": {
      "lat": 50.45019,
      "lon": 30.5234
    },
    "instructions": null,
    "override": null
  },
  "house": {
    "number": "983",
    "suffix": "",
    "building": ""
  },
  "source": "OWN",
  "visibility": "ACTIVE",
  "version": 2,
  "aliases": []
}
```

Done: Хрещатик, 983 added, its duplicate refused with duplicate_of, saved and restored only as distinct; both hidden.

`GET /api/admin/v1/addresses/4533bf7e-c58c-4347-9dd4-4ffd13073e30` → **200**

```json
{
  "id": "4533bf7e-c58c-4347-9dd4-4ffd13073e30",
  "data": {
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "kind": "HOUSE",
    "label": "Хрещатик, 983",
    "language": "uk",
    "street": "Хрещатик",
    "house_raw": "983",
    "building": null,
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "instructions": null,
    "override": null
  },
  "house": {
    "number": "983",
    "suffix": "",
    "building": ""
  },
  "source": "OWN",
  "visibility": "ACTIVE",
  "version": 0,
  "aliases": []
}
```

`POST /api/admin/v1/addresses/4533bf7e-c58c-4347-9dd4-4ffd13073e30/hide` → **200**

```json
{
  "command_id": "e9c684c8-f5a3-47ae-aa1b-81663a0784d0",
  "expected_version": 0,
  "reason": "Sandbox clean-up"
}
```

```json
{
  "id": "4533bf7e-c58c-4347-9dd4-4ffd13073e30",
  "data": {
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "kind": "HOUSE",
    "label": "Хрещатик, 983",
    "language": "uk",
    "street": "Хрещатик",
    "house_raw": "983",
    "building": null,
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "instructions": null,
    "override": null
  },
  "house": {
    "number": "983",
    "suffix": "",
    "building": ""
  },
  "source": "OWN",
  "visibility": "HIDDEN",
  "version": 1,
  "aliases": []
}
```

`GET /api/admin/v1/addresses/bffbf839-07ae-4204-8265-d053222efc19` → **200**

```json
{
  "id": "bffbf839-07ae-4204-8265-d053222efc19",
  "data": {
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "kind": "HOUSE",
    "label": "Хрещатик, 983",
    "language": "uk",
    "street": "Хрещатик",
    "house_raw": "983",
    "building": null,
    "pickup": {
      "lat": 50.45019,
      "lon": 30.5234
    },
    "instructions": null,
    "override": null
  },
  "house": {
    "number": "983",
    "suffix": "",
    "building": ""
  },
  "source": "OWN",
  "visibility": "ACTIVE",
  "version": 2,
  "aliases": []
}
```

`POST /api/admin/v1/addresses/bffbf839-07ae-4204-8265-d053222efc19/hide` → **200**

```json
{
  "command_id": "4756a8fd-dbad-4477-a42b-945f5d7acee9",
  "expected_version": 2,
  "reason": "Sandbox clean-up"
}
```

```json
{
  "id": "bffbf839-07ae-4204-8265-d053222efc19",
  "data": {
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "kind": "HOUSE",
    "label": "Хрещатик, 983",
    "language": "uk",
    "street": "Хрещатик",
    "house_raw": "983",
    "building": null,
    "pickup": {
      "lat": 50.45019,
      "lon": 30.5234
    },
    "instructions": null,
    "override": null
  },
  "house": {
    "number": "983",
    "suffix": "",
    "building": ""
  },
  "source": "OWN",
  "visibility": "HIDDEN",
  "version": 3,
  "aliases": []
}
```

# Scenario: admin-orders

## A rider orders and changes their mind

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665091397",
  "device_ref": "sandbox-6771"
}
```

```json
{
  "challenge_id": "88f8b06f-b198-470f-8806-ebad8fb74ed6",
  "expires_at": "2026-11-02T15:59:21.512514161Z",
  "resend_available_at": "2026-11-02T15:54:22.512514161Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665091397` → **200**

```json
{
  "phone": "+380665091397",
  "audience": "CLIENT",
  "code": "556326",
  "sent_at": "2026-11-02T15:54:21.526605535Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88f8b06f-b198-470f-8806-ebad8fb74ed6",
  "code": "556326",
  "device_ref": "sandbox-6771"
}
```

```json
{
  "session_id": "d94c409e-357e-4376-b742-b4c77813d44b",
  "subject": {
    "type": "CLIENT",
    "id": "5d428748-b617-48f8-b1dd-84d4772ce242"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDQyODc0OC1iNjE3LTQ4ZjgtYjFkZC04NGQ0NzcyY2UyNDIiLCJhdWQiOiJyaWRlciIsInN2YyI6IjVlMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDAwMSIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNjM1NzYxLCJpYXQiOjE3OTM2MzQ4NjEsImp0aSI6IjIyODA5M2IxLWJlMzItNDI4Zi1hMmY4LTkzNGY5MmE0YzkwYiIsInNpZCI6ImQ5NGM0MDllLTM1N2UtNDM3Ni1iNzQyLWI0Yzc3ODEzZDQ0YiJ9.SHhcDidpzf2YBIoGIzaiHsS5Jj2M1Oc1a2zv7XFcWwc",
  "access_expires_at": "2026-11-02T16:09:21.930225819Z",
  "refresh_token": "O2ZzB74ueQ0dzw74heyY-sl1Mj282eIMq7_ULRZQgsM",
  "refresh_expires_at": "2026-12-02T15:54:21.929213457Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "02217a31-0f79-450a-95e6-0de7b7d63063",
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
  "id": "714100af-802d-4433-a6c3-141c85837be5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-11-02T15:59:22.283512Z",
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
  "promotions": [],
  "payment_methods": [
    "CARD",
    "CASH"
  ],
  "card_hold_minor": 10517
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c90452af-0c57-4ae7-862a-c3d32ec809ff",
  "quote_id": "714100af-802d-4433-a6c3-141c85837be5",
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
  "id": "557df73b-8cf0-45c1-a536-2feddc8ea833",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5d428748-b617-48f8-b1dd-84d4772ce242",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-11-02T15:54:22.716609Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/rider/v1/orders/557df73b-8cf0-45c1-a536-2feddc8ea833/cancel` → **200**

```json
{
  "command_id": "a4648d17-ef37-4d1a-8470-dd5f0dc24293",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "557df73b-8cf0-45c1-a536-2feddc8ea833",
  "short_number": 1,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5d428748-b617-48f8-b1dd-84d4772ce242",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-11-02T15:54:22.716609Z",
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
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

## Staff find it by the rider's phone, cancelled, and by its number

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "f316e7c2-28c6-4440-b723-dfef79feea9c",
  "subject": {
    "type": "STAFF",
    "id": "ef2f46e4-651f-479e-ac64-61e783c4f37f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZjJmNDZlNC02NTFmLTQ3OWUtYWM2NC02MWU3ODNjNGYzN2YiLCJhdWQiOiJhZG1pbiIsInN2YyI6IjVlMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDAwMSIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM2MzU3NjMsImlhdCI6MTc5MzYzNDg2MywianRpIjoiN2YwYzk3NmYtNGYyOC00NzMyLTgzODItZTkzNzA1ZmRhOGNmIiwic2lkIjoiZjMxNmU3YzItMjhjNi00NDQwLWI3MjMtZGZlZjc5ZmVlYTljIn0.zLRWP_5QF-LvD70yto4yQFOW6qKCAvUZEnyP1SPPudQ",
  "access_expires_at": "2026-11-02T16:09:23.83846628Z",
  "refresh_token": "mI4Ie1LLu3iQzP-sE2OOhOpRPmQps234osclZpVbSIk",
  "refresh_expires_at": "2026-11-03T03:54:23.837482737Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders?rider_phone=%2B380665091397&status=CANCELLED` → **200**

```json
{
  "orders": [
    {
      "id": "557df73b-8cf0-45c1-a536-2feddc8ea833",
      "short_number": 1,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "status": "CANCELLED",
      "channel": "APP",
      "created_at": "2026-11-02T15:54:22.716609Z",
      "payer_client_id": "5d428748-b617-48f8-b1dd-84d4772ce242",
      "driver_id": null,
      "vehicle_class": "STANDARD",
      "payment_method": "CASH",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "accounting": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/admin/v1/orders?city_id=5a000000-0000-4000-8000-000000000001&short_number=1` → **200**

```json
{
  "orders": [
    {
      "id": "557df73b-8cf0-45c1-a536-2feddc8ea833",
      "short_number": 1,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "status": "CANCELLED",
      "channel": "APP",
      "created_at": "2026-11-02T15:54:22.716609Z",
      "payer_client_id": "5d428748-b617-48f8-b1dd-84d4772ce242",
      "driver_id": null,
      "vehicle_class": "STANDARD",
      "payment_method": "CASH",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "accounting": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

## A page of two, then the next one from its cursor

`GET /api/admin/v1/orders?city_id=5a000000-0000-4000-8000-000000000001&limit=2` → **200**

```json
{
  "orders": [
    {
      "id": "557df73b-8cf0-45c1-a536-2feddc8ea833",
      "short_number": 1,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "status": "CANCELLED",
      "channel": "APP",
      "created_at": "2026-11-02T15:54:22.716609Z",
      "payer_client_id": "5d428748-b617-48f8-b1dd-84d4772ce242",
      "driver_id": null,
      "vehicle_class": "STANDARD",
      "payment_method": "CASH",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "accounting": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

## Kyiv's day by status and the order's history

`GET /api/admin/v1/orders/overview?city_id=5a000000-0000-4000-8000-000000000001&date=2026-11-02` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "date": "2026-11-02",
  "time_zone": "Europe/Kyiv",
  "total": 1,
  "by_status": [
    {
      "status": "CANCELLED",
      "count": 1
    }
  ]
}
```

`GET /api/admin/v1/orders/557df73b-8cf0-45c1-a536-2feddc8ea833/timeline` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-11-02T15:54:22.71855Z",
      "actor": {
        "type": "CLIENT",
        "id": "5d428748-b617-48f8-b1dd-84d4772ce242",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "557df73b-8cf0-45c1-a536-2feddc8ea833",
        "quote_id": "714100af-802d-4433-a6c3-141c85837be5",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "6e488ef8-19a3-4e3b-b353-2be2926a8d5c"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-11-02T15:54:22.724937Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "557df73b-8cf0-45c1-a536-2feddc8ea833",
        "attempt_id": "58293689-8e19-470d-a72a-22d2121cd1d4",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "6e488ef8-19a3-4e3b-b353-2be2926a8d5c"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-11-02T15:54:22.777545Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "557df73b-8cf0-45c1-a536-2feddc8ea833",
        "attempt_id": "58293689-8e19-470d-a72a-22d2121cd1d4"
      },
      "correlation_id": "6e488ef8-19a3-4e3b-b353-2be2926a8d5c"
    },
    {
      "sequence": 3,
      "type": "OrderCancelled",
      "occurred_at": "2026-11-02T15:54:23.167769Z",
      "actor": {
        "type": "CLIENT",
        "id": "5d428748-b617-48f8-b1dd-84d4772ce242",
        "name": null,
        "role": null
      },
      "reason": "CHANGED_MIND",
      "details": {
        "order_id": "557df73b-8cf0-45c1-a536-2feddc8ea833",
        "reason_code": "CHANGED_MIND",
        "cancelled_by": "RIDER",
        "reason_labels": {
          "en": "Changed my mind",
          "pl": "Zmiana planów",
          "ru": "Передумал ехать",
          "uk": "Передумав їхати"
        }
```

Done: order 1 found by phone and number; Kyiv's day: [{"status":"CANCELLED","count":1}].

# Scenario: admission-cities

## Only Andrii is online in Kyiv for this scenario

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31201"
}
```

```json
{
  "challenge_id": "ecd6f70f-0401-4614-a685-46f04dfb62cd",
  "expires_at": "2026-11-02T15:59:25.933888023Z",
  "resend_available_at": "2026-11-02T15:54:26.933888023Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "193339",
  "sent_at": "2026-11-02T15:54:25.93835657Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ecd6f70f-0401-4614-a685-46f04dfb62cd",
  "code": "193339",
  "device_ref": "sandbox-31201"
}
```

```json
{
  "session_id": "214a9af8-f570-47a7-949e-23743b274b65",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdmMiOiI1ZTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwMDEiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzYzNTc2NiwiaWF0IjoxNzkzNjM0ODY2LCJqdGkiOiJmOGVjOGM1NS03NzMzLTQ5NjgtYjg2MS1kZmUyYmE4M2YyMTMiLCJzaWQiOiIyMTRhOWFmOC1mNTcwLTQ3YTctOTQ5ZS0yMzc0M2IyNzRiNjUifQ.eQW7sX6i0Uk6uqjt1pd9QxdJBN29BFjeFrG0Lm1LT6Q",
  "access_expires_at": "2026-11-02T16:09:26.301182522Z",
  "refresh_token": "rrfeJ1SeCJ7kUJSeAl_XNCYyAv-MBYitm6QQz9oRZ3Y",
  "refresh_expires_at": "2026-12-02T15:54:26.299943862Z",
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
  "device_ref": "sandbox-23568"
}
```

```json
{
  "challenge_id": "db60492e-5da7-49a0-b17d-40868241b89d",
  "expires_at": "2026-11-02T15:59:26.949079495Z",
  "resend_available_at": "2026-11-02T15:54:27.949079495Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "340665",
  "sent_at": "2026-11-02T15:54:26.953669589Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "db60492e-5da7-49a0-b17d-40868241b89d",
  "code": "340665",
  "device_ref": "sandbox-23568"
}
```

```json
{
  "session_id": "202c654a-264f-4ac3-97b2-06f383fe3a62",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdmMiOiI1ZTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwMDEiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzYzNTc2NywiaWF0IjoxNzkzNjM0ODY3LCJqdGkiOiJhNWY1MjQ3My0yYzVmLTQ2NDItODBiOC0wNzI3MmU2ZjJiNDYiLCJzaWQiOiIyMDJjNjU0YS0yNjRmLTRhYzMtOTdiMi0wNmYzODNmZTNhNjIifQ.NomRlivIFy9sgrz6Q5czAuuciAgnXTOXKf28jHVK8gA",
  "access_expires_at": "2026-11-02T16:09:27.313354944Z",
  "refresh_token": "-YidlH57LE0Whdz8nA3uCvoITkOnjVVIxbzNYQGMQD8",
  "refresh_expires_at": "2026-12-02T15:54:27.312457035Z",
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

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "07389a45-175e-4434-aa9d-40555c493d3b",
  "subject": {
    "type": "STAFF",
    "id": "ef2f46e4-651f-479e-ac64-61e783c4f37f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZjJmNDZlNC02NTFmLTQ3OWUtYWM2NC02MWU3ODNjNGYzN2YiLCJhdWQiOiJhZG1pbiIsInN2YyI6IjVlMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDAwMSIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM2MzU3NjgsImlhdCI6MTc5MzYzNDg2OCwianRpIjoiMTQ3Nzk2MDUtNDU0Yy00OWUxLWIxOTQtNWQ5YmJhZmIzOGFhIiwic2lkIjoiMDczODlhNDUtMTc1ZS00NDM0LWFhOWQtNDA1NTVjNDkzZDNiIn0.JTsV1njdlWkJ1hvim4AxVJUkR1jOUOC378sWchevkZM",
  "access_expires_at": "2026-11-02T16:09:28.26472874Z",
  "refresh_token": "Rug9lDlSlMkYkq55nG8nEDUIwuWnUhL5pkdAyqhWok0",
  "refresh_expires_at": "2026-11-03T03:54:28.263889744Z",
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
  "session_id": "f9ca60a6-6097-4fd1-b885-3432e939633a",
  "subject": {
    "type": "STAFF",
    "id": "ef2f46e4-651f-479e-ac64-61e783c4f37f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZjJmNDZlNC02NTFmLTQ3OWUtYWM2NC02MWU3ODNjNGYzN2YiLCJhdWQiOiJvcGVyYXRvciIsInN2YyI6IjVlMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDAwMSIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM2MzU3NjgsImlhdCI6MTc5MzYzNDg2OCwianRpIjoiNTEyMzRlMGYtMTlkNy00M2E0LWIxOGMtYmU0ODljZmQxNDYxIiwic2lkIjoiZjljYTYwYTYtNjA5Ny00ZmQxLWI4ODUtMzQzMmU5Mzk2MzNhIn0.U5CcW92sf2vthCDEF_KqTbmGr3CAVPxeZwzxmE-om44",
  "access_expires_at": "2026-11-02T16:09:28.874804549Z",
  "refresh_token": "8RNc4yk6B-IX3AHFsn8XEC3JR2xfXhHlhRHZ6lpta40",
  "refresh_expires_at": "2026-11-03T03:54:28.873889305Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-1652"
}
```

```json
{
  "challenge_id": "0ae9c336-05f9-4f1e-b766-5b84b8bde4ba",
  "expires_at": "2026-11-02T15:59:29.193397041Z",
  "resend_available_at": "2026-11-02T15:54:30.193397041Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "243864",
  "sent_at": "2026-11-02T15:54:29.197918771Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0ae9c336-05f9-4f1e-b766-5b84b8bde4ba",
  "code": "243864",
  "device_ref": "sandbox-1652"
}
```

```json
{
  "session_id": "e95778e9-9705-4c47-a6de-d45ad60b9d53",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdmMiOiI1ZTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwMDEiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzYzNTc2OSwiaWF0IjoxNzkzNjM0ODY5LCJqdGkiOiI2MGFjNDU0Ni05NGZkLTQ3NjgtYTEwMy1lMzRiMjM5ZjcwM2UiLCJzaWQiOiJlOTU3NzhlOS05NzA1LTRjNDctYTZkZS1kNDVhZDYwYjlkNTMifQ.bvFFP2uJ-2qNNeTEb232NmnyxE2LfduFIhZH8DKHQsI",
  "access_expires_at": "2026-11-02T16:09:29.568359188Z",
  "refresh_token": "HYktCbsS18xdLUQEDxFgqguA4ERWeWOsecJXX70iskU",
  "refresh_expires_at": "2026-12-02T15:54:29.567512655Z",
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

## E1: admitted only in Warsaw, Andrii cannot go online in Kyiv

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "account_state": "ACTIVE",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "APPROVED",
    "version": 1,
    "has_payment_terminal": false,
    "admission_city_ids": [
      "5a000000-0000-4000-8000-000000000001"
    ],
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

`PUT /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/admission-cities` → **200**

```json
{
  "command_id": "9342cf62-41d2-44e9-b22e-04cb6c8d0377",
  "expected_version": 1,
  "city_ids": [
    "5a000000-0000-4000-8000-000000000002"
  ],
  "reason": "Moved to the Warsaw office"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "account_state": "ACTIVE",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 2,
  "has_payment_terminal": false,
  "admission_city_ids": [
    "5a000000-0000-4000-8000-000000000002"
  ],
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

`POST /api/driver/v1/work-sessions` → **409**

```json
{
  "command_id": "6e18c03b-63f1-4be8-9edd-a2bd9f17e579",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-11-02T15:54:30Z",
    "sequence": 1793634870954
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
  "correlation_id": "ef341e9a-6c4a-4c3b-b6c7-cfaaad99c0f8"
}
```

## Back in Kyiv he goes online; then he is taken off Kyiv while online

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "account_state": "ACTIVE",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "APPROVED",
    "version": 2,
    "has_payment_terminal": false,
    "admission_city_ids": [
      "5a000000-0000-4000-8000-000000000002"
    ],
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

`PUT /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/admission-cities` → **200**

```json
{
  "command_id": "c82d7149-5069-4725-b6d6-bdef862db7e2",
  "expected_version": 2,
  "city_ids": [
    "5a000000-0000-4000-8000-000000000001"
  ],
  "reason": "Back in Kyiv"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "account_state": "ACTIVE",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 3,
  "has_payment_terminal": false,
  "admission_city_ids": [
    "5a000000-0000-4000-8000-000000000001"
  ],
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
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
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
  "command_id": "624f99bc-bad4-4f08-a08d-5c602ece98d2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-11-02T15:54:32Z",
    "sequence": 1793634872360
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d4951cbf-2620-4da8-a38e-4a2c24433189",
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
  "last_heartbeat_at": "2026-11-02T15:54:32.386116Z",
  "last_location_at": "2026-11-02T15:54:32.386116Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "account_state": "ACTIVE",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "APPROVED",
    "version": 3,
    "has_payment_terminal": false,
    "admission_city_ids": [
      "5a000000-0000-4000-8000-000000000001"
    ],
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

`PUT /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/admission-cities` → **200**

```json
{
  "command_id": "63408c03-7498-45f7-8925-1a2ebe2a40f7",
  "expected_version": 3,
  "city_ids": [
    "5a000000-0000-4000-8000-000000000002"
  ],
  "reason": "Kyiv licence suspended for a check"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "account_state": "ACTIVE",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 4,
  "has_payment_terminal": false,
  "admission_city_ids": [
    "5a000000-0000-4000-8000-000000000002"
  ],
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
  "session_id": "d4951cbf-2620-4da8-a38e-4a2c24433189",
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
  "last_heartbeat_at": "2026-11-02T15:54:32.386116Z",
  "last_location_at": "2026-11-02T15:54:32.386116Z",
  "eligible": false,
  "ineligible_reasons": [
    "ADMISSION_CITY"
  ]
}
```

## A rider orders 300 m from him: no offer, not in his ALL tab, a claim is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380685675124",
  "device_ref": "sandbox-2927"
}
```

```json
{
  "challenge_id": "0acf6142-7bab-4c8a-9a3b-8b301a3f769a",
  "expires_at": "2026-11-02T15:59:33.747898121Z",
  "resend_available_at": "2026-11-02T15:54:34.747898121Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380685675124` → **200**

```json
{
  "phone": "+380685675124",
  "audience": "CLIENT",
  "code": "875223",
  "sent_at": "2026-11-02T15:54:33.752275114Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0acf6142-7bab-4c8a-9a3b-8b301a3f769a",
  "code": "875223",
  "device_ref": "sandbox-2927"
}
```

```json
{
  "session_id": "4594be9e-2921-4ad9-a642-a6946a05ac8a",
  "subject": {
    "type": "CLIENT",
    "id": "e355f6f8-ecee-48df-be4b-914912c0a119"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzU1ZjZmOC1lY2VlLTQ4ZGYtYmU0Yi05MTQ5MTJjMGExMTkiLCJhdWQiOiJyaWRlciIsInN2YyI6IjVlMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDAwMSIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNjM1Nzc0LCJpYXQiOjE3OTM2MzQ4NzQsImp0aSI6IjMzNmUzODcwLTcxOWUtNDhhYi1hMTI1LWRlODg2MTZmMWI4NiIsInNpZCI6IjQ1OTRiZTllLTI5MjEtNGFkOS1hNjQyLWE2OTQ2YTA1YWM4YSJ9.4d9Zid2Te15pa4091D-b-8-mCBXrREVXykIRMkkXK9s",
  "access_expires_at": "2026-11-02T16:09:34.11150924Z",
  "refresh_token": "TArAINKVIxy2OjKgq5TcudgV2Qt3Hr0KbVq1nCJYCpo",
  "refresh_expires_at": "2026-12-02T15:54:34.110749792Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ff985643-d1cb-49a0-90ae-b4e96d65a23e",
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
  "id": "d2a23684-9f29-41f3-9f70-6b4b047159eb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-11-02T15:59:34.445895Z",
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
  "promotions": [],
  "payment_methods": [
    "CARD",
    "CASH"
  ],
  "card_hold_minor": 10517
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "32e6c4c5-9fde-4bb2-b275-0b4ad9c94e55",
  "quote_id": "d2a23684-9f29-41f3-9f70-6b4b047159eb",
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
  "id": "2c4ec46e-c644-4c37-b244-3f6c8b9a1e81",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e355f6f8-ecee-48df-be4b-914912c0a119",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-11-02T15:54:34.817152Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[]
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[]
```

`POST /api/driver/v1/orders/2c4ec46e-c644-4c37-b244-3f6c8b9a1e81/claim` → **409**

```json
{
  "command_id": "98bb27e7-66b5-454f-b64f-facb4815454d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/2c4ec46e-c644-4c37-b244-3f6c8b9a1e81/claim",
  "status": 409,
  "title": "Driver not eligible",
  "type": "https://errors.blizz.taxi/driver-not-eligible",
  "code": "DRIVER_NOT_ELIGIBLE",
  "correlation_id": "4f2c50cf-8930-437d-81bb-6d79df26f223"
}
```

`GET /api/operator/v1/orders/2c4ec46e-c644-4c37-b244-3f6c8b9a1e81/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-11-02T15:54:34.818155Z",
      "actor": {
        "type": "CLIENT",
        "id": "e355f6f8-ecee-48df-be4b-914912c0a119",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2c4ec46e-c644-4c37-b244-3f6c8b9a1e81",
        "quote_id": "d2a23684-9f29-41f3-9f70-6b4b047159eb",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "03e0f005-6449-401f-82bc-3af3b3d4f0af"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-11-02T15:54:34.821229Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2c4ec46e-c644-4c37-b244-3f6c8b9a1e81",
        "attempt_id": "bb071a44-b86f-4b7f-bd7a-3a3e17860a76",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "03e0f005-6449-401f-82bc-3af3b3d4f0af"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-11-02T15:54:34.867332Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2c4ec46e-c644-4c37-b244-3f6c8b9a1e81",
        "attempt_id": "bb071a44-b86f-4b7f-bd7a-3a3e17860a76"
      },
      "correlation_id": "03e0f005-6449-401f-82bc-3af3b3d4f0af"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "bb071a44-b86f-4b7f-bd7a-3a3e17860a76",
        "generation": 1,
        "started_at": "2026-11-02T15:54:34.819678Z",
        "first_offer_at": null,
        "broadcast_at": "2026-11-02T15:54:34.867332Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-11-02T15:54:34.822675Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000403",
```

## Zones: Kyiv again; the ALL tab narrowed to a zone around the pickup has the order, another zone does not

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "account_state": "ACTIVE",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "APPROVED",
    "version": 4,
    "has_payment_terminal": false,
    "admission_city_ids": [
      "5a000000-0000-4000-8000-000000000002"
    ],
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

`PUT /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/admission-cities` → **200**

```json
{
  "command_id": "0aff15c6-4f31-429c-ad7b-0ac6c8991865",
  "expected_version": 4,
  "city_ids": [
    "5a000000-0000-4000-8000-000000000001"
  ],
  "reason": "Check done"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "account_state": "ACTIVE",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 5,
  "has_payment_terminal": false,
  "admission_city_ids": [
    "5a000000-0000-4000-8000-000000000001"
  ],
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

`POST /api/driver/v1/work-sessions/d4951cbf-2620-4da8-a38e-4a2c24433189/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-11-02T15:54:37Z",
    "sequence": 1793634877440
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d4951cbf-2620-4da8-a38e-4a2c24433189",
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
  "last_heartbeat_at": "2026-11-02T15:54:37.492308Z",
  "last_location_at": "2026-11-02T15:54:37.492308Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000001/zones` → **201**

```json
{
  "command_id": "3d8eeffc-d7f5-41f4-860b-4f09b96f395f",
  "type": "DISTRICT",
  "polygon": {
    "type": "Polygon",
    "coordinates": [
      [
        [
          30.510,
          50.440
        ],
        [
          30.540,
          50.440
        ],
        [
          30.540,
          50.460
        ],
        [
          30.510,
          50.460
        ],
        [
          30.510,
          50.440
        ]
      ]
    ]
  },
  "priority": 1,
  "reason": "Sandbox: ALL tab filter"
}
```

```json
{
  "id": "0db99f02-bd9e-461f-bc1a-3d969bef51e4",
  "state": "DRAFT",
  "version": 0
}
```
