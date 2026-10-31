# Sandbox transcript (2026-10-31T23:28:21Z, b4ffe26)

# Scenario: retention

## Technical data retention

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
  "correlation_id": "5dad7de7-36ce-4a0d-96f4-10168edc1cd1"
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
  "session_id": "cfda3304-c561-4180-beed-a50efdfe4bce",
  "subject": {
    "type": "STAFF",
    "id": "0b9209c2-e6e6-46fb-b990-a1e17c2115dc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYjkyMDljMi1lNmU2LTQ2ZmItYjk5MC1hMWUxN2MyMTE1ZGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0OTAyMDcsImlhdCI6MTc5MzQ4OTMwNywianRpIjoiM2NlN2YxMGYtZmNlMS00MWYwLTg2YTAtZTQ3Njk5ODNmYjJjIiwic2lkIjoiY2ZkYTMzMDQtYzU2MS00MTgwLWJlZWQtYTUwZWZkZmU0YmNlIn0.sZm6YFThNrnT0exsdmMBKwJdpMIVX7Zw9WZNH-9-eL0",
  "access_expires_at": "2026-10-31T23:43:27.163767251Z",
  "refresh_token": "ATdg3QeOKADNpsJi9Dj9oyayEssetzFoEjAI3jWyTYg",
  "refresh_expires_at": "2026-11-01T11:28:27.162038692Z",
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
  "session_id": "8c4f23be-1427-4da5-8a99-47d3ce5024b6",
  "subject": {
    "type": "STAFF",
    "id": "0b9209c2-e6e6-46fb-b990-a1e17c2115dc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYjkyMDljMi1lNmU2LTQ2ZmItYjk5MC1hMWUxN2MyMTE1ZGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0OTAyMDgsImlhdCI6MTc5MzQ4OTMwOCwianRpIjoiZjI2NzhkN2MtNzQ3ZC00NmVlLThkOTUtYTY0MDMzNzY5ZDRlIiwic2lkIjoiOGM0ZjIzYmUtMTQyNy00ZGE1LThhOTktNDdkM2NlNTAyNGI2In0.yMD6nTxG2vQG-ve_-GPxirP6Xz93hd6exNjd5M5cwKo",
  "access_expires_at": "2026-10-31T23:43:28.458752456Z",
  "refresh_token": "W4mmy3rJF-HAPbNwlVeVvOiGrKugj7LdysRAm7Ymwbs",
  "refresh_expires_at": "2026-11-01T11:28:28.457807266Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/retention` → **200**

```json
{
  "version": 0,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 30,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "changed_by": null,
  "reason": null,
  "changed_at": null
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "e5157607-9dff-4a22-b0ce-e1e0f33c8cb0",
  "expected_version": 0,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 1,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "reason": "Sandbox retention boundary"
}
```

```json
{
  "version": 1,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 1,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "changed_by": "0b9209c2-e6e6-46fb-b990-a1e17c2115dc",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-31T23:28:28.894064576Z"
}
```

`POST /sandbox/v1/retention/fixtures/823c11b4-87ea-474b-b54d-924b89ed8a40` → **200**

```json
{
  "old_done": 1,
  "recent_done": 1,
  "failed": 1
}
```

`POST /sandbox/v1/retention/run` → **200**

```json
{
  "sessions": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "sign_in_codes": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "code_deliveries": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "delivered_events": {
    "deleted": 1,
    "failures": 0,
    "examined": 1
  },
  "consumer_receipts": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "command_receipts": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "upload_sessions": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "quarantined_files": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "call_recordings": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  }
}
```

`GET /sandbox/v1/retention/fixtures/823c11b4-87ea-474b-b54d-924b89ed8a40` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/823c11b4-87ea-474b-b54d-924b89ed8a40` → **204**

`GET /api/admin/v1/retention` → **200**

```json
{
  "version": 1,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 1,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "changed_by": "0b9209c2-e6e6-46fb-b990-a1e17c2115dc",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-31T23:28:28.894065Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "11fef814-336b-4f98-aca0-2f1c8e977b03",
  "expected_version": 1,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 30,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "reason": "Restore policy after retention sandbox"
}
```

```json
{
  "version": 2,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 30,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "changed_by": "0b9209c2-e6e6-46fb-b990-a1e17c2115dc",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-31T23:28:29.422841397Z"
}
```
