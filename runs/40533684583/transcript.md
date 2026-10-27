# Sandbox transcript (2026-10-27T15:43:31Z, 3d2ac90)

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670795040",
  "device_ref": "sandbox-4225"
}
```

```json
{
  "challenge_id": "f2e93326-5f1a-4e29-ae72-749644fe9829",
  "expires_at": "2026-10-27T15:48:32.022151645Z",
  "resend_available_at": "2026-10-27T15:43:33.022151645Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670795040` → **200**

```json
{
  "phone": "+380670795040",
  "audience": "CLIENT",
  "code": "564713",
  "sent_at": "2026-10-27T15:43:32.029052782Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f2e93326-5f1a-4e29-ae72-749644fe9829",
  "code": "564713",
  "device_ref": "sandbox-4225"
}
```

```json
{
  "session_id": "80b1df0d-ea15-47aa-bc65-bc7d7ed85992",
  "subject": {
    "type": "CLIENT",
    "id": "4933441b-06dd-45f5-9991-9f02e09778d8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OTMzNDQxYi0wNmRkLTQ1ZjUtOTk5MS05ZjAyZTA5Nzc4ZDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE2NzEyLCJpYXQiOjE3OTMxMTU4MTIsImp0aSI6IjQ0ZDNjMDdiLWI5MDEtNDJkMy1iNGU4LTk5MjA4YzQ2YTk0NiIsInNpZCI6IjgwYjFkZjBkLWVhMTUtNDdhYS1iYzY1LWJjN2Q3ZWQ4NTk5MiJ9.mPykzXUlSsp5ZHB_eDRr2cIJOUkPRNvdvalZLqc-LTA",
  "access_expires_at": "2026-10-27T15:58:32.114294427Z",
  "refresh_token": "ySTsrPjFsGybgsX_-lKuE6levuaXCnMMS6HXSqAa1AA",
  "refresh_expires_at": "2026-11-26T15:43:32.112481754Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "4933441b-06dd-45f5-9991-9f02e09778d8",
  "session_id": "80b1df0d-ea15-47aa-bc65-bc7d7ed85992",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "38604ba2-ca0f-4039-869a-cc8aedb2e13e",
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
  "id": "81ec6114-b72c-49ae-a792-4cc2217a8ab6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T15:48:32.326954Z",
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
  "challenge_id": "4c4b2100-bf64-46bc-8091-f72d0b884032",
  "expires_at": "2026-10-27T15:48:34.402553586Z",
  "resend_available_at": "2026-10-27T15:43:35.402553586Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670795040` → **200**

```json
{
  "phone": "+380670795040",
  "audience": "CLIENT",
  "code": "872837",
  "sent_at": "2026-10-27T15:43:34.405573087Z"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "c575e8e5-3404-4aeb-97a1-9da72692287d",
  "challenge_id": "4c4b2100-bf64-46bc-8091-f72d0b884032",
  "otp_code": "872837"
}
```

```json
{
  "client_id": "4933441b-06dd-45f5-9991-9f02e09778d8",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-27T15:43:34.477180638Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "0369d31c-4a40-456e-888c-e81171d6c4ab",
  "quote_id": "81ec6114-b72c-49ae-a792-4cc2217a8ab6",
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
  "correlation_id": "1a5ba8e4-4c33-49b1-8e12-b58cf1a03a17"
}
```

## Staff see the request with nothing blocking it and complete it

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
  "correlation_id": "3bbce26a-9ea2-4fda-a430-b0426b12b36c"
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
  "session_id": "dfcfe803-3bbe-4133-8a2d-0b964cb04109",
  "subject": {
    "type": "STAFF",
    "id": "4e801019-e5f6-4223-886b-5a12a4ca587f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZTgwMTAxOS1lNWY2LTQyMjMtODg2Yi01YTEyYTRjYTU4N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY3MTUsImlhdCI6MTc5MzExNTgxNSwianRpIjoiYWQ4OTY1YWYtZWJlZC00NmI2LWJjYWEtZTIyNDI3OWVhYTA3Iiwic2lkIjoiZGZjZmU4MDMtM2JiZS00MTMzLThhMmQtMGI5NjRjYjA0MTA5In0.1UKxs5Juv3WqUWC63ER3t75JmLKfcwi6hgHGjoxxz3w",
  "access_expires_at": "2026-10-27T15:58:35.209174817Z",
  "refresh_token": "_pwHp7i_3NFyq9HzFOYIOoOcaRQpch1OR7-vPnNvw1M",
  "refresh_expires_at": "2026-10-28T03:43:35.207771144Z",
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
  "session_id": "aff3fce3-624f-428c-8ec4-34b93c926f96",
  "subject": {
    "type": "STAFF",
    "id": "4e801019-e5f6-4223-886b-5a12a4ca587f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZTgwMTAxOS1lNWY2LTQyMjMtODg2Yi01YTEyYTRjYTU4N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY3MTYsImlhdCI6MTc5MzExNTgxNiwianRpIjoiMGQwMTg0NmUtYWRlNS00NWYwLTg4ZWMtMDQyMjU5MjM5NDdlIiwic2lkIjoiYWZmM2ZjZTMtNjI0Zi00MjhjLThlYzQtMzRiOTNjOTI2Zjk2In0.IrC5EGNGYRK0n4c5osbiKW6xSnJ7RAX9Bfa1MJnWOs0",
  "access_expires_at": "2026-10-27T15:58:36.448422878Z",
  "refresh_token": "uL7p53RfDwwEVlawJ0cHVsHXmDId0BkFGV7LEIszoYI",
  "refresh_expires_at": "2026-10-28T03:43:36.447407403Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "4933441b-06dd-45f5-9991-9f02e09778d8",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-27T15:43:34.477181Z",
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

`POST /api/admin/v1/client-deletions/4933441b-06dd-45f5-9991-9f02e09778d8/complete` → **200**

```json
{
  "command_id": "85611b09-2ae7-4c71-b936-2f013c1704c8",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "4933441b-06dd-45f5-9991-9f02e09778d8",
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
  "correlation_id": "316f81e4-23b8-4508-944d-9d370af30856"
}
```

Done: client 4933441b-06dd-45f5-9991-9f02e09778d8 anonymized.
