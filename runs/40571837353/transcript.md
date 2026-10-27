# Sandbox transcript (2026-10-27T19:45:56Z, 4b23642)

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664755877",
  "device_ref": "sandbox-7306"
}
```

```json
{
  "challenge_id": "1d5a6454-1b5f-4e70-bed5-313830c7e296",
  "expires_at": "2026-10-27T19:50:56.183856717Z",
  "resend_available_at": "2026-10-27T19:45:57.183856717Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664755877` → **200**

```json
{
  "phone": "+380664755877",
  "audience": "CLIENT",
  "code": "567480",
  "sent_at": "2026-10-27T19:45:56.193502512Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1d5a6454-1b5f-4e70-bed5-313830c7e296",
  "code": "567480",
  "device_ref": "sandbox-7306"
}
```

```json
{
  "session_id": "f0efe75a-6167-4e50-aabd-5b850c93ae15",
  "subject": {
    "type": "CLIENT",
    "id": "d2230501-f71b-4a5d-9d71-2db897256b0f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMjIzMDUwMS1mNzFiLTRhNWQtOWQ3MS0yZGI4OTcyNTZiMGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxMjU2LCJpYXQiOjE3OTMxMzAzNTYsImp0aSI6IjNiNzJhZWU0LTgzZTEtNDlmNS1hZmJkLTk0NGY0NjEzOWYxMiIsInNpZCI6ImYwZWZlNzVhLTYxNjctNGU1MC1hYWJkLTViODUwYzkzYWUxNSJ9.VMhwjtQeTPB6Lubhz62APM4tn-ZjRxCsxHPu1rPuAqk",
  "access_expires_at": "2026-10-27T20:00:56.314023914Z",
  "refresh_token": "L87x4W9RTnBagAEwoyjOa3-4LtTB95l4vp7QyGu7VRU",
  "refresh_expires_at": "2026-11-26T19:45:56.311650786Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d2230501-f71b-4a5d-9d71-2db897256b0f",
  "session_id": "f0efe75a-6167-4e50-aabd-5b850c93ae15",
  "account_state": "ACTIVE"
}
```

## Staff find the rider by the last 7 digits of the phone and open the card

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
  "correlation_id": "826839b9-931c-4f0d-abdc-d0dbdd3767bf"
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
  "session_id": "ec4686a0-d311-4c2d-a1c8-80c5551a2523",
  "subject": {
    "type": "STAFF",
    "id": "18203326-8215-42c7-9cfd-ab6f29291428"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODIwMzMyNi04MjE1LTQyYzctOWNmZC1hYjZmMjkyOTE0MjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzEyNTcsImlhdCI6MTc5MzEzMDM1NywianRpIjoiYTA1MTRmMzktMzFlYy00MzljLTllNDMtZDg4YjkyY2Q5NzY5Iiwic2lkIjoiZWM0Njg2YTAtZDMxMS00YzJkLWExYzgtODBjNTU1MWEyNTIzIn0.V1Mlks6ziFNY-iSjlsvYG_PRBoAf2NGrMSSu3Qke7f4",
  "access_expires_at": "2026-10-27T20:00:57.001342762Z",
  "refresh_token": "poqY4fJiTeIWt-sIzjXMdp6oAYzEYiSpXesghbq3wmY",
  "refresh_expires_at": "2026-10-28T07:45:57.000153384Z",
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
  "session_id": "6f27d2e1-c0fe-48e5-ac9f-2561379911f4",
  "subject": {
    "type": "STAFF",
    "id": "18203326-8215-42c7-9cfd-ab6f29291428"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODIwMzMyNi04MjE1LTQyYzctOWNmZC1hYjZmMjkyOTE0MjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzEyNTgsImlhdCI6MTc5MzEzMDM1OCwianRpIjoiZWJiZjM1MzEtY2JiZC00YTE3LWJmNWEtYTQ4MzZiNjdmZDFhIiwic2lkIjoiNmYyN2QyZTEtYzBmZS00OGU1LWFjOWYtMjU2MTM3OTkxMWY0In0.XYQIvuP85iy8hl1bm5FF_52-lfynl7Ulk2uUNHQJJvU",
  "access_expires_at": "2026-10-27T20:00:58.095771386Z",
  "refresh_token": "jLC_yHmwdqTw1VGpyOHONkgj8IjII6y1MunEgIo6Ojc",
  "refresh_expires_at": "2026-10-28T07:45:58.094867385Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=4755877&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "d2230501-f71b-4a5d-9d71-2db897256b0f",
      "phone": "+380664755877",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-27T19:45:56.30049Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/d2230501-f71b-4a5d-9d71-2db897256b0f` → **200**

```json
{
  "client": {
    "id": "d2230501-f71b-4a5d-9d71-2db897256b0f",
    "phone": "+380664755877",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-27T19:45:56.30049Z",
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

`POST /api/admin/v1/clients/d2230501-f71b-4a5d-9d71-2db897256b0f/block` → **400**

```json
{
  "command_id": "79443fc0-87d5-4b00-ae23-dec00799ff21",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/d2230501-f71b-4a5d-9d71-2db897256b0f/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "3f74e57e-7c7e-4a63-bc15-c47e91f03e10",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/d2230501-f71b-4a5d-9d71-2db897256b0f/block` → **200**

```json
{
  "command_id": "d3db903d-c456-43ba-aea4-594270467e36",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "d2230501-f71b-4a5d-9d71-2db897256b0f",
  "phone": "+380664755877",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-27T19:45:56.30049Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-27T19:45:58.281346Z",
    "by": "18203326-8215-42c7-9cfd-ab6f29291428"
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
  "correlation_id": "bf923574-6ca9-4a6d-a529-8aa6aca7595e"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664755877",
  "device_ref": "sandbox-23031"
}
```

```json
{
  "challenge_id": "c7dc7c0b-583f-4305-a999-dca6cf55155f",
  "expires_at": "2026-10-27T19:51:00.346074219Z",
  "resend_available_at": "2026-10-27T19:46:01.346074219Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664755877` → **200**

```json
{
  "phone": "+380664755877",
  "audience": "CLIENT",
  "code": "026462",
  "sent_at": "2026-10-27T19:46:00.349363762Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "c7dc7c0b-583f-4305-a999-dca6cf55155f",
  "code": "026462",
  "device_ref": "sandbox-23031"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "67098dd2-2425-45f6-81ba-f0e8c219cf49"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/d2230501-f71b-4a5d-9d71-2db897256b0f` → **200**

```json
{
  "client": {
    "id": "d2230501-f71b-4a5d-9d71-2db897256b0f",
    "phone": "+380664755877",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-27T19:45:56.30049Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-27T19:45:58.281346Z",
      "by": "18203326-8215-42c7-9cfd-ab6f29291428"
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

`POST /api/admin/v1/clients/d2230501-f71b-4a5d-9d71-2db897256b0f/unblock` → **200**

```json
{
  "command_id": "611a16c0-8c1c-4d58-81ff-96d459b9ee46",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "d2230501-f71b-4a5d-9d71-2db897256b0f",
  "phone": "+380664755877",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-27T19:45:56.30049Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664755877",
  "device_ref": "sandbox-734"
}
```

```json
{
  "challenge_id": "9164be2d-2d08-4042-95f7-2c223ea23f16",
  "expires_at": "2026-10-27T19:51:02.539698524Z",
  "resend_available_at": "2026-10-27T19:46:03.539698524Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664755877` → **200**

```json
{
  "phone": "+380664755877",
  "audience": "CLIENT",
  "code": "818265",
  "sent_at": "2026-10-27T19:46:02.545141864Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9164be2d-2d08-4042-95f7-2c223ea23f16",
  "code": "818265",
  "device_ref": "sandbox-734"
}
```

```json
{
  "session_id": "7ceb1f4c-f7c2-457f-b6bb-8f8ca7821c3f",
  "subject": {
    "type": "CLIENT",
    "id": "d2230501-f71b-4a5d-9d71-2db897256b0f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMjIzMDUwMS1mNzFiLTRhNWQtOWQ3MS0yZGI4OTcyNTZiMGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxMjYyLCJpYXQiOjE3OTMxMzAzNjIsImp0aSI6IjY5MTEwMmZjLTI3ZDEtNGQzOS05YWMwLTEyMWM0YTg0ZmRmNSIsInNpZCI6IjdjZWIxZjRjLWY3YzItNDU3Zi1iNmJiLThmOGNhNzgyMWMzZiJ9.z9u_zE3bq-eJl6eOOVQNhmS0zTfK7qqdrvVkxrzGNXg",
  "access_expires_at": "2026-10-27T20:01:02.611673614Z",
  "refresh_token": "GUTvU3KrAfPMNcfU0QjHY77UbasVFVaLLsoy8CaJ4FM",
  "refresh_expires_at": "2026-11-26T19:46:02.610814965Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d2230501-f71b-4a5d-9d71-2db897256b0f",
  "session_id": "7ceb1f4c-f7c2-457f-b6bb-8f8ca7821c3f",
  "account_state": "ACTIVE"
}
```

Done: found, blocked (signed out, sign-in refused) and unblocked.
