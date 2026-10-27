# Sandbox transcript (2026-10-27T12:13:41Z, 5ef0a3f)

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677904194",
  "device_ref": "sandbox-1348"
}
```

```json
{
  "challenge_id": "58ed3aaf-5c04-4b47-a915-417088f9fc38",
  "expires_at": "2026-10-27T12:18:41.889963447Z",
  "resend_available_at": "2026-10-27T12:13:42.889963447Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677904194` → **200**

```json
{
  "phone": "+380677904194",
  "audience": "CLIENT",
  "code": "522064",
  "sent_at": "2026-10-27T12:13:41.945316581Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "58ed3aaf-5c04-4b47-a915-417088f9fc38",
  "code": "522064",
  "device_ref": "sandbox-1348"
}
```

```json
{
  "session_id": "51d7aa14-d079-4c46-804c-e6da727fac11",
  "subject": {
    "type": "CLIENT",
    "id": "51854e2d-16e0-4a5e-8d0f-054a27471b2b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MTg1NGUyZC0xNmUwLTRhNWUtOGQwZi0wNTRhMjc0NzFiMmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTA0MTIyLCJpYXQiOjE3OTMxMDMyMjIsImp0aSI6ImUxYzJmZDJjLTAxZjItNDNmZi05NDIxLTNhOWVlNzBjYzU5NCIsInNpZCI6IjUxZDdhYTE0LWQwNzktNGM0Ni04MDRjLWU2ZGE3MjdmYWMxMSJ9.4zuQ5HM_71G9vJNqMfRy2r41wvmNyT2NZ9Qch7Q5LCQ",
  "access_expires_at": "2026-10-27T12:28:42.047179555Z",
  "refresh_token": "WgmzucA3s3cepokxlvZx2pK9MAM1NMIGNE-uapbJedY",
  "refresh_expires_at": "2026-11-26T12:13:42.044779881Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "47d4672a-5281-4da7-a27e-6864404ec35f",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "529bda51-84c8-4dc8-980a-f01b2bf2c4fd",
  "upload_path": "/api/rider/v1/uploads/529bda51-84c8-4dc8-980a-f01b2bf2c4fd",
  "expires_at": "2026-10-27T12:28:42.139589006Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/529bda51-84c8-4dc8-980a-f01b2bf2c4fd` → **200**

```json
{
  "file_id": "529bda51-84c8-4dc8-980a-f01b2bf2c4fd",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "f6688916-9f81-425e-af25-45450829782b",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "529bda51-84c8-4dc8-980a-f01b2bf2c4fd"
  ]
}
```

```json
{
  "id": "0a12b034-2aca-44c3-aeca-6dfd51003048",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "51854e2d-16e0-4a5e-8d0f-054a27471b2b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T12:13:42.219639Z",
  "updated_at": "2026-10-27T12:13:42.219639Z",
  "messages": [
    {
      "id": "01524a34-a931-4b5b-81ef-ee2e78cca161",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "51854e2d-16e0-4a5e-8d0f-054a27471b2b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T12:13:42.22229Z",
      "attachments": [
        {
          "file_id": "529bda51-84c8-4dc8-980a-f01b2bf2c4fd",
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
  "correlation_id": "a3b7959e-388c-496e-9dc0-3ae6c034f4f2"
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
  "session_id": "32b8df55-a291-4d83-9d35-7e429537725b",
  "subject": {
    "type": "STAFF",
    "id": "1f5e9fd6-248b-42cc-b3f2-1e9854afef1f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjVlOWZkNi0yNDhiLTQyY2MtYjNmMi0xZTk4NTRhZmVmMWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDQxMjIsImlhdCI6MTc5MzEwMzIyMiwianRpIjoiYTIxNzY2NWEtZWY4Zi00YjA5LThjMTktYTAwM2M5NjU0MGVhIiwic2lkIjoiMzJiOGRmNTUtYTI5MS00ZDgzLTlkMzUtN2U0Mjk1Mzc3MjViIn0.Susme8ODtZm8SRsYxy3UAQhQ-2KxSoVqrrupC5SZqOc",
  "access_expires_at": "2026-10-27T12:28:42.747537367Z",
  "refresh_token": "qlLjhNQUFuUTTc-RDCo8ZEBS5jrP6CAwZXMod7Vabqw",
  "refresh_expires_at": "2026-10-28T00:13:42.746646299Z",
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
  "session_id": "0575a5fd-5c9c-411b-8d73-5ebcac89178d",
  "subject": {
    "type": "STAFF",
    "id": "1f5e9fd6-248b-42cc-b3f2-1e9854afef1f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjVlOWZkNi0yNDhiLTQyY2MtYjNmMi0xZTk4NTRhZmVmMWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDQxMjMsImlhdCI6MTc5MzEwMzIyMywianRpIjoiYjIyNTYwOWQtOGJhMC00YTQ5LWFlMWYtMTVkYTM3YjI4NmY0Iiwic2lkIjoiMDU3NWE1ZmQtNWM5Yy00MTFiLThkNzMtNWViY2FjODkxNzhkIn0.DIDDJ1OZAyAoteLNoISEIWiNj6jcJY2W7aBDuc2jxlM",
  "access_expires_at": "2026-10-27T12:28:43.664824508Z",
  "refresh_token": "CE2zqh2LGpmXA0cZYIzWGqqmlxE8XdzLiXrD9OXPETs",
  "refresh_expires_at": "2026-10-28T00:13:43.664049241Z",
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
  "session_id": "a77ceb47-4e59-4905-b18b-7a0f3064ba98",
  "subject": {
    "type": "STAFF",
    "id": "1f5e9fd6-248b-42cc-b3f2-1e9854afef1f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjVlOWZkNi0yNDhiLTQyY2MtYjNmMi0xZTk4NTRhZmVmMWYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDQxMjMsImlhdCI6MTc5MzEwMzIyMywianRpIjoiOGU4MjkxNmQtNmMwZC00NzA5LTkzODktY2I2YjA4NzU4ZjBlIiwic2lkIjoiYTc3Y2ViNDctNGU1OS00OTA1LWIxOGItN2EwZjMwNjRiYTk4In0.SF3HVX_-0ohKjRNIoznctL188_ooocTDSDZR3aMZZC4",
  "access_expires_at": "2026-10-27T12:28:43.905971118Z",
  "refresh_token": "8TEng3Ttr9uiHa4KjODoqV9bM6jLTb25RlcYCxEAMdM",
  "refresh_expires_at": "2026-10-28T00:13:43.90501422Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/0a12b034-2aca-44c3-aeca-6dfd51003048/attachments/529bda51-84c8-4dc8-980a-f01b2bf2c4fd` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "67dda170-4626-4a36-9335-8336e7f40ba4",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "26662af5-ddc3-40df-b54f-22cb6738c305",
  "upload_path": "/api/operator/v1/uploads/26662af5-ddc3-40df-b54f-22cb6738c305",
  "expires_at": "2026-10-27T12:28:43.965441894Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/26662af5-ddc3-40df-b54f-22cb6738c305` → **200**

```json
{
  "file_id": "26662af5-ddc3-40df-b54f-22cb6738c305",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/0a12b034-2aca-44c3-aeca-6dfd51003048` → **200**

```json
{
  "id": "0a12b034-2aca-44c3-aeca-6dfd51003048",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "51854e2d-16e0-4a5e-8d0f-054a27471b2b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T12:13:42.219639Z",
  "updated_at": "2026-10-27T12:13:42.219639Z",
  "messages": [
    {
      "id": "01524a34-a931-4b5b-81ef-ee2e78cca161",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "51854e2d-16e0-4a5e-8d0f-054a27471b2b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T12:13:42.22229Z",
      "attachments": [
        {
          "file_id": "529bda51-84c8-4dc8-980a-f01b2bf2c4fd",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/0a12b034-2aca-44c3-aeca-6dfd51003048/comments` → **200**

```json
{
  "command_id": "e96770c3-8f6e-4a61-be1e-0d04a60d9bfc",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "26662af5-ddc3-40df-b54f-22cb6738c305"
  ]
}
```

```json
{
  "id": "0a12b034-2aca-44c3-aeca-6dfd51003048",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "51854e2d-16e0-4a5e-8d0f-054a27471b2b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T12:13:42.219639Z",
  "updated_at": "2026-10-27T12:13:44.074098Z",
  "messages": [
    {
      "id": "01524a34-a931-4b5b-81ef-ee2e78cca161",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "51854e2d-16e0-4a5e-8d0f-054a27471b2b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T12:13:42.22229Z",
      "attachments": [
        {
          "file_id": "529bda51-84c8-4dc8-980a-f01b2bf2c4fd",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "e24d4abd-7a10-4b73-a0b7-cbe8eeabe178",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "1f5e9fd6-248b-42cc-b3f2-1e9854afef1f",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T12:13:44.073547Z",
      "attachments": [
        {
          "file_id": "26662af5-ddc3-40df-b54f-22cb6738c305",
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

`GET /api/rider/v1/support/cases/0a12b034-2aca-44c3-aeca-6dfd51003048` → **200**

```json
{
  "id": "0a12b034-2aca-44c3-aeca-6dfd51003048",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "51854e2d-16e0-4a5e-8d0f-054a27471b2b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T12:13:42.219639Z",
  "updated_at": "2026-10-27T12:13:44.074098Z",
  "messages": [
    {
      "id": "01524a34-a931-4b5b-81ef-ee2e78cca161",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "51854e2d-16e0-4a5e-8d0f-054a27471b2b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T12:13:42.22229Z",
      "attachments": [
        {
          "file_id": "529bda51-84c8-4dc8-980a-f01b2bf2c4fd",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "e24d4abd-7a10-4b73-a0b7-cbe8eeabe178",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T12:13:44.073547Z",
      "attachments": [
        {
          "file_id": "26662af5-ddc3-40df-b54f-22cb6738c305",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/0a12b034-2aca-44c3-aeca-6dfd51003048/attachments/26662af5-ddc3-40df-b54f-22cb6738c305` → **200**

Done: support case 0a12b034-2aca-44c3-aeca-6dfd51003048, rider attachment 529bda51-84c8-4dc8-980a-f01b2bf2c4fd, operator attachment 26662af5-ddc3-40df-b54f-22cb6738c305.
