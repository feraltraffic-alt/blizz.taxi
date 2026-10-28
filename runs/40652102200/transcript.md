# Sandbox transcript (2026-10-28T07:46:00Z, d506100)

# Scenario: data-export

## A rider signs in and asks for a code to confirm the copy

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630969624",
  "device_ref": "sandbox-28441"
}
```

```json
{
  "challenge_id": "2128de6f-c16f-4657-a959-13c93d447628",
  "expires_at": "2026-10-28T07:51:00.083614986Z",
  "resend_available_at": "2026-10-28T07:46:01.083614986Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630969624` → **200**

```json
{
  "phone": "+380630969624",
  "audience": "CLIENT",
  "code": "649440",
  "sent_at": "2026-10-28T07:46:00.095306944Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2128de6f-c16f-4657-a959-13c93d447628",
  "code": "649440",
  "device_ref": "sandbox-28441"
}
```

```json
{
  "session_id": "ad6e188f-10d7-42b4-a0d3-6086d647bb6d",
  "subject": {
    "type": "CLIENT",
    "id": "dffe1e78-add4-477f-81a4-b31faf0c3756"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZmZlMWU3OC1hZGQ0LTQ3N2YtODFhNC1iMzFmYWYwYzM3NTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc0NDYwLCJpYXQiOjE3OTMxNzM1NjAsImp0aSI6IjA4ZDExY2UzLWM2OGUtNGMwNi1iY2JlLWU5MzNmM2I2ZDc1YSIsInNpZCI6ImFkNmUxODhmLTEwZDctNDJiNC1hMGQzLTYwODZkNjQ3YmI2ZCJ9.s5ZACSu7GHOgrEhUY3qZHzzLb5wC0YYKUiEf5eUCe4M",
  "access_expires_at": "2026-10-28T08:01:00.185921129Z",
  "refresh_token": "gmA88Ez6Lm4SMCaWNP7M0Jn8aDEN0pXEtOJSLaxU9ZM",
  "refresh_expires_at": "2026-11-27T07:46:00.184339888Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "eb219f2c-a14a-4331-9dbc-5ce29c8cd862",
  "expires_at": "2026-10-28T07:51:02.256984543Z",
  "resend_available_at": "2026-10-28T07:46:03.256984543Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630969624` → **200**

```json
{
  "phone": "+380630969624",
  "audience": "CLIENT",
  "code": "271370",
  "sent_at": "2026-10-28T07:46:02.25932209Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "6aa4d4aa-6767-4f50-b303-b81c31b8a2b8",
  "challenge_id": "eb219f2c-a14a-4331-9dbc-5ce29c8cd862",
  "otp_code": "271370"
}
```

```json
{
  "id": "3706f780-6513-444d-9c6e-f369bf75c745",
  "state": "PENDING",
  "created_at": "2026-10-28T07:46:02.32384Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/3706f780-6513-444d-9c6e-f369bf75c745` → **200**

```json
{
  "id": "3706f780-6513-444d-9c6e-f369bf75c745",
  "state": "PENDING",
  "created_at": "2026-10-28T07:46:02.32384Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3706f780-6513-444d-9c6e-f369bf75c745` → **200**

```json
{
  "id": "3706f780-6513-444d-9c6e-f369bf75c745",
  "state": "PENDING",
  "created_at": "2026-10-28T07:46:02.32384Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3706f780-6513-444d-9c6e-f369bf75c745` → **200**

```json
{
  "id": "3706f780-6513-444d-9c6e-f369bf75c745",
  "state": "PENDING",
  "created_at": "2026-10-28T07:46:02.32384Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3706f780-6513-444d-9c6e-f369bf75c745` → **200**

```json
{
  "id": "3706f780-6513-444d-9c6e-f369bf75c745",
  "state": "PENDING",
  "created_at": "2026-10-28T07:46:02.32384Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3706f780-6513-444d-9c6e-f369bf75c745` → **200**

```json
{
  "id": "3706f780-6513-444d-9c6e-f369bf75c745",
  "state": "PENDING",
  "created_at": "2026-10-28T07:46:02.32384Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3706f780-6513-444d-9c6e-f369bf75c745` → **200**

```json
{
  "id": "3706f780-6513-444d-9c6e-f369bf75c745",
  "state": "PENDING",
  "created_at": "2026-10-28T07:46:02.32384Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3706f780-6513-444d-9c6e-f369bf75c745` → **200**

```json
{
  "id": "3706f780-6513-444d-9c6e-f369bf75c745",
  "state": "PENDING",
  "created_at": "2026-10-28T07:46:02.32384Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3706f780-6513-444d-9c6e-f369bf75c745` → **200**

```json
{
  "id": "3706f780-6513-444d-9c6e-f369bf75c745",
  "state": "READY",
  "created_at": "2026-10-28T07:46:02.32384Z",
  "ready_at": "2026-10-28T07:46:08.609433Z",
  "expires_at": "2026-11-04T07:46:08.609433Z",
  "size_bytes": 1029
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/3706f780-6513-444d-9c6e-f369bf75c745/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631604756",
  "device_ref": "sandbox-1838"
}
```

```json
{
  "challenge_id": "dff87cf8-f8e3-4b5a-bc91-97b3db6bc39d",
  "expires_at": "2026-10-28T07:51:09.584320517Z",
  "resend_available_at": "2026-10-28T07:46:10.584320517Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631604756` → **200**

```json
{
  "phone": "+380631604756",
  "audience": "CLIENT",
  "code": "639678",
  "sent_at": "2026-10-28T07:46:09.587479604Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dff87cf8-f8e3-4b5a-bc91-97b3db6bc39d",
  "code": "639678",
  "device_ref": "sandbox-1838"
}
```

```json
{
  "session_id": "4a63b2c3-5650-4e18-b21a-b7dc740f061b",
  "subject": {
    "type": "CLIENT",
    "id": "af59ba89-4fff-4461-83e6-c861aaf0fed6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjU5YmE4OS00ZmZmLTQ0NjEtODNlNi1jODYxYWFmMGZlZDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc0NDY5LCJpYXQiOjE3OTMxNzM1NjksImp0aSI6IjAzYjMxYmI5LWU2NDItNDFjZS1hMjY3LTYxOTkyZDIxOWNlNSIsInNpZCI6IjRhNjNiMmMzLTU2NTAtNGUxOC1iMjFhLWI3ZGM3NDBmMDYxYiJ9.lRhL-rY-r0Kq2F1ZVkAGo5qKhlKQnev7qhysdF_-j7w",
  "access_expires_at": "2026-10-28T08:01:09.638261298Z",
  "refresh_token": "Eqitdf5Z8apLzaQuQ3zoPhRzY_FuDJ-G7Gy4RiYrFeU",
  "refresh_expires_at": "2026-11-27T07:46:09.637617098Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/3706f780-6513-444d-9c6e-f369bf75c745/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/3706f780-6513-444d-9c6e-f369bf75c745/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "890f7fde-f278-4aa1-85b0-d3e3d50e7aeb"
}
```

## Support sees that it was asked for, not what is in it

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
  "correlation_id": "1cb403d4-a265-4ab8-bf60-460a89644b3c"
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
  "session_id": "5efff645-f209-47d5-ab1a-adb8d4abfded",
  "subject": {
    "type": "STAFF",
    "id": "3717b1df-bf94-4c12-af84-7fdb209b2dcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNzE3YjFkZi1iZjk0LTRjMTItYWY4NC03ZmRiMjA5YjJkY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQ0NzAsImlhdCI6MTc5MzE3MzU3MCwianRpIjoiNTZkOTUzNDktNTk2ZS00MTExLWFiOTQtZjdjOWRjNjc1NWE2Iiwic2lkIjoiNWVmZmY2NDUtZjIwOS00N2Q1LWFiMWEtYWRiOGQ0YWJmZGVkIn0.l2pNPtqTw6lwqXGfCyEBUMs2UuM6a9mKV1v5C6WXnJg",
  "access_expires_at": "2026-10-28T08:01:10.247049594Z",
  "refresh_token": "td8bpcC6kYTDbaE15z5AI3oiO8ukPAAOFcCh9M5_MyA",
  "refresh_expires_at": "2026-10-28T19:46:10.24622612Z",
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
  "session_id": "69885129-8f28-4ff2-b9dd-3a4e7352796e",
  "subject": {
    "type": "STAFF",
    "id": "3717b1df-bf94-4c12-af84-7fdb209b2dcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNzE3YjFkZi1iZjk0LTRjMTItYWY4NC03ZmRiMjA5YjJkY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQ0NzEsImlhdCI6MTc5MzE3MzU3MSwianRpIjoiMTNlZjJhY2EtMzJjZi00YjQwLTg4Y2EtOWU5NDAyYjFmNjhmIiwic2lkIjoiNjk4ODUxMjktOGYyOC00ZmYyLWI5ZGQtM2E0ZTczNTI3OTZlIn0._tbxzqr8qUhH88eN7i8KeoTEPvusNradb2Kpqkrp7-Q",
  "access_expires_at": "2026-10-28T08:01:11.33563104Z",
  "refresh_token": "1av_IP08QeDkcKiLEUiBTiNwrWAf6Kt7P7G8NKsvSic",
  "refresh_expires_at": "2026-10-28T19:46:11.334761428Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "dffe1e78-add4-477f-81a4-b31faf0c3756",
  "session_id": "ad6e188f-10d7-42b4-a0d3-6086d647bb6d",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/dffe1e78-add4-477f-81a4-b31faf0c3756/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "3706f780-6513-444d-9c6e-f369bf75c745",
      "state": "READY",
      "created_at": "2026-10-28T07:46:02.32384Z",
      "ready_at": "2026-10-28T07:46:08.609433Z",
      "expires_at": "2026-11-04T07:46:08.609433Z",
      "size_bytes": 1029
    }
  ]
}
```

Done: the copy was asked for with a code, built in the background and downloaded by the rider only.
