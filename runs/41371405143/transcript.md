# Sandbox transcript (2026-11-02T01:15:12Z, 0977af0)

# Scenario: two-services

## The platform owner signs in (and changes the first password once)

`POST /auth/v1/staff/sign-in` → **401**

```json
{
  "login": "owner",
  "password": "Sandbox-Owner-2026-ok",
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
  "correlation_id": "73783aba-e865-4d00-bb2f-bde3aa6dfc39"
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "owner",
  "password": "Sandbox-Owner-2026",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "c5f82cad-c933-40bb-ab7d-92c15b2f0ac2",
  "subject": {
    "type": "STAFF",
    "id": "50f3c28a-6a2a-4009-a08e-3f6d4583c877"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGYzYzI4YS02YTJhLTQwMDktYTA4ZS0zZjZkNDU4M2M4NzciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM1ODMwMTksImlhdCI6MTc5MzU4MjExOSwianRpIjoiMGZmNzM4YjMtZWU1My00Mjg4LThjMzgtYjM2NDg0OGYwOGYzIiwic2lkIjoiYzVmODJjYWQtYzkzMy00MGJiLWFiN2QtOTJjMTViMmYwYWMyIn0.jIwtqO47XOMLRtkW3Bnz_6I2JgGDsX3ABamKRnDwPGo",
  "access_expires_at": "2026-11-02T01:30:19.596920596Z",
  "refresh_token": "ofjoYQYLcuvFKNQR2s6nV9RaRVdSDzj-jiPFoRMC7go",
  "refresh_expires_at": "2026-11-02T13:15:19.594496193Z",
  "password_change_required": true
}
```

`POST /api/admin/v1/me/password` → **204**

```json
{
  "current_password": "Sandbox-Owner-2026",
  "new_password": "Sandbox-Owner-2026-ok"
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "owner",
  "password": "Sandbox-Owner-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "a1611ff2-20a6-45ab-aeef-3a383a9bfae3",
  "subject": {
    "type": "STAFF",
    "id": "50f3c28a-6a2a-4009-a08e-3f6d4583c877"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGYzYzI4YS02YTJhLTQwMDktYTA4ZS0zZjZkNDU4M2M4NzciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM1ODMwMjEsImlhdCI6MTc5MzU4MjEyMSwianRpIjoiZWIyNjczYTEtMTA3NC00NmJlLWI4YzctZTU1ZGZhMDc3N2RmIiwic2lkIjoiYTE2MTFmZjItMjBhNi00NWFiLWFlZWYtM2EzODNhOWJmYWUzIn0.oys9_fFYyEzWcxI7NyWeiRBsZBP-W2pGLfDTTT4gaX8",
  "access_expires_at": "2026-11-02T01:30:21.481179497Z",
  "refresh_token": "K9hXRtj9bnzV-D3A3p15k3cVuUwEpeSyOe4k09JqF8o",
  "refresh_expires_at": "2026-11-02T13:15:21.480134946Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders` → **403**

```json
{
  "instance": "/api/admin/v1/orders",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "7c5406f4-118d-4b35-acae-5eb19c7b5652"
}
```

The owner reaches nothing inside a service.

## A second taxi service with its first super admin, only with the owner's own password

`POST /api/admin/v1/services` → **403**

```json
{
  "command_id": "20636f07-490c-46e5-9fbd-7d676d8d9ab4",
  "code": "second-467730",
  "name": "Second taxi",
  "reason": "Sandbox: a second brand",
  "super_admin": {
    "login": "boss-second-467730",
    "initial_password": "Sandbox-Boss-2026",
    "first_name": "Iryna",
    "last_name": "Koval"
  },
  "password": "not-the-password"
}
```

```json
{
  "instance": "/api/admin/v1/services",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "d4c4a70a-3a02-41cc-a320-e11254f1e78a"
}
```

`POST /api/admin/v1/services` → **201**

```json
{
  "command_id": "20636f07-490c-46e5-9fbd-7d676d8d9ab4",
  "code": "second-467730",
  "name": "Second taxi",
  "reason": "Sandbox: a second brand",
  "super_admin": {
    "login": "boss-second-467730",
    "initial_password": "Sandbox-Boss-2026",
    "first_name": "Iryna",
    "last_name": "Koval"
  },
  "password": "Sandbox-Owner-2026-ok"
}
```

```json
{
  "id": "8a042e7b-ded8-424c-aeee-29028d6fb84e",
  "code": "second-467730",
  "name": "Second taxi",
  "state": "ACTIVE",
  "version": 1,
  "created_at": "2026-11-02T01:15:23.085374Z"
}
```

## One phone, two services: two riders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380507153549",
  "device_ref": "sandbox-31185"
}
```

```json
{
  "challenge_id": "7ab3f44d-838e-4c7d-a0b6-df8383c21c61",
  "expires_at": "2026-11-02T01:20:23.725043614Z",
  "resend_available_at": "2026-11-02T01:15:24.725043614Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380507153549` → **200**

```json
{
  "phone": "+380507153549",
  "audience": "CLIENT",
  "code": "160016",
  "sent_at": "2026-11-02T01:15:23.737554033Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7ab3f44d-838e-4c7d-a0b6-df8383c21c61",
  "code": "160016",
  "device_ref": "sandbox-31185"
}
```

```json
{
  "session_id": "20c4bed4-c2bb-4c82-865d-62a78f172bf0",
  "subject": {
    "type": "CLIENT",
    "id": "4fd307ea-4d03-44eb-bd02-7ee21c35af12"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZmQzMDdlYS00ZDAzLTQ0ZWItYmQwMi03ZWUyMWMzNWFmMTIiLCJhdWQiOiJyaWRlciIsInN2YyI6IjVlMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDAwMSIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNTgzMDI0LCJpYXQiOjE3OTM1ODIxMjQsImp0aSI6ImViYTNmMTQwLWIwZTgtNGMzOS1iOWNkLWU2MDQ2YmNmNzUzNSIsInNpZCI6IjIwYzRiZWQ0LWMyYmItNGM4Mi04NjVkLTYyYTc4ZjE3MmJmMCJ9.9wpJ1g6z4jfGdD_7oD8wxiR4Cxx3SIOLxTaAJNdnXiM",
  "access_expires_at": "2026-11-02T01:30:24.109755681Z",
  "refresh_token": "eytDqXK-p9RxPAb7x-bUDvrQt5NpomOXi73trjccMUY",
  "refresh_expires_at": "2026-12-02T01:15:24.10864727Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380507153549",
  "device_ref": "sandbox-4786",
  "service": "second-467730"
}
```

```json
{
  "challenge_id": "950dfc79-03ec-4996-8d37-1564188da6cf",
  "expires_at": "2026-11-02T01:20:24.438847871Z",
  "resend_available_at": "2026-11-02T01:15:25.438847871Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380507153549` → **200**

```json
{
  "phone": "+380507153549",
  "audience": "CLIENT",
  "code": "206182",
  "sent_at": "2026-11-02T01:15:24.444266465Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "950dfc79-03ec-4996-8d37-1564188da6cf",
  "code": "206182",
  "device_ref": "sandbox-4786"
}
```

```json
{
  "session_id": "99f5963c-a7ff-4473-a2d7-8083a1ab9070",
  "subject": {
    "type": "CLIENT",
    "id": "d5dd98af-4486-4e0f-b138-b34e1e3dc748"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNWRkOThhZi00NDg2LTRlMGYtYjEzOC1iMzRlMWUzZGM3NDgiLCJhdWQiOiJyaWRlciIsInN2YyI6IjhhMDQyZTdiLWRlZDgtNDI0Yy1hZWVlLTI5MDI4ZDZmYjg0ZSIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNTgzMDI0LCJpYXQiOjE3OTM1ODIxMjQsImp0aSI6IjllYTEwODgyLTIxYTEtNDFiMS1iNTRhLWU3ZTcyZjE2ZjU3OCIsInNpZCI6Ijk5ZjU5NjNjLWE3ZmYtNDQ3My1hMmQ3LTgwODNhMWFiOTA3MCJ9.SyTzXF0zlitMl8__qZnp4glHXz6gvBHxxxwC-5sNliE",
  "access_expires_at": "2026-11-02T01:30:24.790398895Z",
  "refresh_token": "Td91qQES2Lo8_3Ac726SA5iWLf-IhoFauCjJY0ZbTFA",
  "refresh_expires_at": "2026-12-02T01:15:24.789374491Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "4fd307ea-4d03-44eb-bd02-7ee21c35af12",
  "session_id": "20c4bed4-c2bb-4c82-865d-62a78f172bf0",
  "account_state": "ACTIVE"
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d5dd98af-4486-4e0f-b138-b34e1e3dc748",
  "session_id": "99f5963c-a7ff-4473-a2d7-8083a1ab9070",
  "account_state": "ACTIVE"
}
```

`GET /api/rider/v1/orders` → **200**

```json
{
  "items": [],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

## The second service has no city yet: its app shows none and orders nowhere

`GET /api/config/v1/bootstrap?service=second-467730` → **200**

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
  "cities": [],
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
}
```

`GET /api/rider/v1/vehicle-classes?lat=50.4501&lon=30.5234` → **422**

```json
{
  "instance": "/api/rider/v1/vehicle-classes",
  "status": 422,
  "title": "Outside service area",
  "type": "https://errors.blizz.taxi/outside-service-area",
  "code": "OUTSIDE_SERVICE_AREA",
  "correlation_id": "70d7b50d-d46c-4ffd-bb75-ca8a9caec023"
}
```

## The second service's super admin sees their own service only

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "boss-second-467730",
  "password": "Sandbox-Boss-2026",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "3f6bd6f1-6967-4cac-ae22-45eada6628dc",
  "subject": {
    "type": "STAFF",
    "id": "2f628fc5-6e4d-4ead-96c8-b67baf554010"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZjYyOGZjNS02ZTRkLTRlYWQtOTZjOC1iNjdiYWY1NTQwMTAiLCJhdWQiOiJhZG1pbiIsInN2YyI6IjhhMDQyZTdiLWRlZDgtNDI0Yy1hZWVlLTI5MDI4ZDZmYjg0ZSIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM1ODMwMjcsImlhdCI6MTc5MzU4MjEyNywianRpIjoiOWJmNDQ2N2QtYWI2NC00MzJkLThhOGMtMjQ0YmM3OTRkNjBkIiwic2lkIjoiM2Y2YmQ2ZjEtNjk2Ny00Y2FjLWFlMjItNDVlYWRhNjYyOGRjIn0.TRdmS362edf5sqoyEjc-5u7Z-kEE1K2eVx82EA4oAGQ",
  "access_expires_at": "2026-11-02T01:30:27.057029956Z",
  "refresh_token": "kBtCqGivCCSoN7CY3s20C07kza11FOVtHGOVzb5-7mU",
  "refresh_expires_at": "2026-11-02T13:15:27.055710381Z",
  "password_change_required": true
}
```

`POST /api/admin/v1/me/password` → **204**

```json
{
  "current_password": "Sandbox-Boss-2026",
  "new_password": "Sandbox-Boss-2026-ok"
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "boss-second-467730",
  "password": "Sandbox-Boss-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "3ecd060d-221f-4a2b-939c-adb016bf1b78",
  "subject": {
    "type": "STAFF",
    "id": "2f628fc5-6e4d-4ead-96c8-b67baf554010"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZjYyOGZjNS02ZTRkLTRlYWQtOTZjOC1iNjdiYWY1NTQwMTAiLCJhdWQiOiJhZG1pbiIsInN2YyI6IjhhMDQyZTdiLWRlZDgtNDI0Yy1hZWVlLTI5MDI4ZDZmYjg0ZSIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM1ODMwMjgsImlhdCI6MTc5MzU4MjEyOCwianRpIjoiMzE1NjFlMDAtMGU3Ny00OTgxLTllZWItYTUwZDY2OTRmMzAwIiwic2lkIjoiM2VjZDA2MGQtMjIxZi00YTJiLTkzOWMtYWRiMDE2YmYxYjc4In0.6T7kiGZxl_cyKGVAwzsJFIFdRzx5AfowEubT2uN9UGQ",
  "access_expires_at": "2026-11-02T01:30:28.907537895Z",
  "refresh_token": "WVw3VJ4D1VDT_IcevwOZBKLHgLUNIjxZ1mTagb3xbas",
  "refresh_expires_at": "2026-11-02T13:15:28.906467348Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/cities` → **200**

```json
{
  "cities": []
}
```

`GET /api/admin/v1/staff` → **200**

```json
{
  "staff": [
    {
      "id": "2f628fc5-6e4d-4ead-96c8-b67baf554010",
      "login": "boss-second-467730",
      "profile": {
        "first_name": "Iryna",
        "last_name": "Koval",
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
    }
  ]
}
```

## Suspending the service signs its rider out at once; resuming lets it sign in again

`POST /api/admin/v1/services/8a042e7b-ded8-424c-aeee-29028d6fb84e/suspend` → **200**

```json
{
  "command_id": "1f504f35-9636-4fa7-8f85-6035f469311c",
  "expected_version": 1,
  "reason": "Sandbox: paused"
}
```

```json
{
  "id": "8a042e7b-ded8-424c-aeee-29028d6fb84e",
  "code": "second-467730",
  "name": "Second taxi",
  "state": "SUSPENDED",
  "version": 2,
  "created_at": "2026-11-02T01:15:23.085374Z"
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
  "correlation_id": "b05c6668-0ad5-41ba-93cb-f6ef5997450b"
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "4fd307ea-4d03-44eb-bd02-7ee21c35af12",
  "session_id": "20c4bed4-c2bb-4c82-865d-62a78f172bf0",
  "account_state": "ACTIVE"
}
```

`POST /api/admin/v1/services/8a042e7b-ded8-424c-aeee-29028d6fb84e/resume` → **200**

```json
{
  "command_id": "258cec22-baaa-4f0a-844b-9a0f74cb70c8",
  "expected_version": 2,
  "reason": "Sandbox: back"
}
```

```json
{
  "id": "8a042e7b-ded8-424c-aeee-29028d6fb84e",
  "code": "second-467730",
  "name": "Second taxi",
  "state": "ACTIVE",
  "version": 3,
  "created_at": "2026-11-02T01:15:23.085374Z"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380507153549",
  "device_ref": "sandbox-22947",
  "service": "second-467730"
}
```

```json
{
  "challenge_id": "19f68b2c-e466-4a97-8b5c-2110c3f90eec",
  "expires_at": "2026-11-02T01:20:31.168069914Z",
  "resend_available_at": "2026-11-02T01:15:32.168069914Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380507153549` → **200**

```json
{
  "phone": "+380507153549",
  "audience": "CLIENT",
  "code": "064156",
  "sent_at": "2026-11-02T01:15:31.173130103Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "19f68b2c-e466-4a97-8b5c-2110c3f90eec",
  "code": "064156",
  "device_ref": "sandbox-22947"
}
```

```json
{
  "session_id": "46a378b4-beba-43ec-944f-4b9c2b363a34",
  "subject": {
    "type": "CLIENT",
    "id": "d5dd98af-4486-4e0f-b138-b34e1e3dc748"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNWRkOThhZi00NDg2LTRlMGYtYjEzOC1iMzRlMWUzZGM3NDgiLCJhdWQiOiJyaWRlciIsInN2YyI6IjhhMDQyZTdiLWRlZDgtNDI0Yy1hZWVlLTI5MDI4ZDZmYjg0ZSIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNTgzMDMxLCJpYXQiOjE3OTM1ODIxMzEsImp0aSI6ImRkNGZkZGEzLWNlODAtNGIwMS05MmQ0LWExNDYyYjQxNDBjYiIsInNpZCI6IjQ2YTM3OGI0LWJlYmEtNDNlYy05NDRmLTRiOWMyYjM2M2EzNCJ9.CcTbSjHm3XopdbDfzXi7lsRpY3HAwxkLbZcrw8u42xs",
  "access_expires_at": "2026-11-02T01:30:31.536176073Z",
  "refresh_token": "Zv6z2gv8R1t6raUV1E3X_LaBOjncr4KrhomLCYaG2zA",
  "refresh_expires_at": "2026-12-02T01:15:31.535256053Z",
  "account_created": false
}
```

Done: service second-467730 created by the owner; rider 4fd307ea-4d03-44eb-bd02-7ee21c35af12 in the first service and d5dd98af-4486-4e0f-b138-b34e1e3dc748 in second-467730 share a phone and nothing else.
