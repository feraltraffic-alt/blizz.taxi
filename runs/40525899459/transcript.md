# Sandbox transcript (2026-10-27T14:56:26Z, 1bb029b)

# Scenario: safety-contacts

## The admin reads the city's contacts and replaces them

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
  "correlation_id": "d8f4f42a-9e37-4639-9326-c38a4a4e4a33"
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
  "session_id": "8c736d3a-dfa3-4a60-901e-36bf0caa4975",
  "subject": {
    "type": "STAFF",
    "id": "53772430-00b9-4f99-8992-8bd627ffe330"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1Mzc3MjQzMC0wMGI5LTRmOTktODk5Mi04YmQ2MjdmZmUzMzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTM4ODcsImlhdCI6MTc5MzExMjk4NywianRpIjoiZWFiNjQzODAtNDIzZS00ZmIyLWFiMmQtNTU4YTRmNTg1MTAxIiwic2lkIjoiOGM3MzZkM2EtZGZhMy00YTYwLTkwMWUtMzZiZjBjYWE0OTc1In0.Ya59mbrdk4EyeP2el8t7YCngiUq6u7vUB7BDWnwNGiQ",
  "access_expires_at": "2026-10-27T15:11:27.294188746Z",
  "refresh_token": "OhKCStdOfp842m22DH9kgeZsbHkRbtB_y-2Zw35KQ6s",
  "refresh_expires_at": "2026-10-28T02:56:27.29254956Z",
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
  "session_id": "459e90b4-06ef-4d71-960f-62d72272a4a3",
  "subject": {
    "type": "STAFF",
    "id": "53772430-00b9-4f99-8992-8bd627ffe330"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1Mzc3MjQzMC0wMGI5LTRmOTktODk5Mi04YmQ2MjdmZmUzMzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTM4ODgsImlhdCI6MTc5MzExMjk4OCwianRpIjoiMWQ1NjU1MTYtN2RjNC00Y2VkLTliNGUtNjkxZGUyNjc5YjAxIiwic2lkIjoiNDU5ZTkwYjQtMDZlZi00ZDcxLTk2MGYtNjJkNzIyNzJhNGEzIn0.fIvHiiBT1wqNcfMq9kNzK_nH9Uny95wRMEo8Sxdh81g",
  "access_expires_at": "2026-10-27T15:11:28.166066048Z",
  "refresh_token": "vfLaF9ih8lt-kK6WD-J5141YyB3wHYjhuYTA9angf1Y",
  "refresh_expires_at": "2026-10-28T02:56:28.165274568Z",
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
  "command_id": "41e87a04-fda6-463a-931a-5c2a94775af1",
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
  "changed_by": "53772430-00b9-4f99-8992-8bd627ffe330",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T14:56:28.253853Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "41e87a04-fda6-463a-931a-5c2a94775af1",
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
  "changed_by": "53772430-00b9-4f99-8992-8bd627ffe330",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T14:56:28.253853Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48302805266",
  "device_ref": "sandbox-23057"
}
```

```json
{
  "challenge_id": "47e92137-adcd-4c50-bdcb-1989b2864db3",
  "expires_at": "2026-10-27T15:01:28.33245855Z",
  "resend_available_at": "2026-10-27T14:56:29.33245855Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48302805266` → **200**

```json
{
  "phone": "+48302805266",
  "audience": "CLIENT",
  "code": "835328",
  "sent_at": "2026-10-27T14:56:28.337506169Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "47e92137-adcd-4c50-bdcb-1989b2864db3",
  "code": "835328",
  "device_ref": "sandbox-23057"
}
```

```json
{
  "session_id": "21024464-2bfd-4dd8-965c-9cba4a75874a",
  "subject": {
    "type": "CLIENT",
    "id": "87ae34f4-ced3-40be-bb05-8d6ad4c13970"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4N2FlMzRmNC1jZWQzLTQwYmUtYmIwNS04ZDZhZDRjMTM5NzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEzODg4LCJpYXQiOjE3OTMxMTI5ODgsImp0aSI6ImJmYjY2MzYxLWVkNmYtNDdjZC05NjNjLTFjZGMwMDMyZDljYiIsInNpZCI6IjIxMDI0NDY0LTJiZmQtNGRkOC05NjVjLTljYmE0YTc1ODc0YSJ9.5wF3zyFHK0VYP5oyGXO0vUMlUteP_yPoSFtElPQg7Kk",
  "access_expires_at": "2026-10-27T15:11:28.399524687Z",
  "refresh_token": "bQUIkG8mAxFbIpnzHDXXYMM2ha02uyN0e0iOB97_IBk",
  "refresh_expires_at": "2026-11-26T14:56:28.398836082Z",
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
  "correlation_id": "1b969766-c499-401a-bcf4-0b33ed09c3ca"
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
  "device_ref": "sandbox-6183"
}
```

```json
{
  "challenge_id": "d7c594d0-b9c2-43cb-9b32-a61c55e78dfb",
  "expires_at": "2026-10-27T15:01:28.472179818Z",
  "resend_available_at": "2026-10-27T14:56:29.472179818Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "243641",
  "sent_at": "2026-10-27T14:56:28.47536021Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d7c594d0-b9c2-43cb-9b32-a61c55e78dfb",
  "code": "243641",
  "device_ref": "sandbox-6183"
}
```

```json
{
  "session_id": "cb32086e-6d20-40bb-b072-f9ec58b316cf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzg4OCwiaWF0IjoxNzkzMTEyOTg4LCJqdGkiOiJmMGVjNDhiMy1iY2RhLTQzZWQtODhhYS1iYzA1NDNiNDAxYTgiLCJzaWQiOiJjYjMyMDg2ZS02ZDIwLTQwYmItYjA3Mi1mOWVjNThiMzE2Y2YifQ.ekEzp_nI_sZ6fz9AM6ojhtYcnjqMTV2YSXIlDEIsRZo",
  "access_expires_at": "2026-10-27T15:11:28.52185005Z",
  "refresh_token": "CiJ12mQrezF68kHqcOyWIUm8ovGO_-rApYJk7almUuE",
  "refresh_expires_at": "2026-11-26T14:56:28.521060463Z",
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
  "command_id": "630ac97e-030f-4452-b150-a3cc351336fb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:56:28Z",
    "sequence": 1793112988571
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6bbfd751-03a3-4351-b79d-e85087db12cc",
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
  "last_heartbeat_at": "2026-10-27T14:56:28.64578Z",
  "last_location_at": "2026-10-27T14:56:28.64578Z",
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
  "session_id": "6bbfd751-03a3-4351-b79d-e85087db12cc",
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
  "last_heartbeat_at": "2026-10-27T14:56:28.64578Z",
  "last_location_at": "2026-10-27T14:56:28.64578Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6bbfd751-03a3-4351-b79d-e85087db12cc/close` → **200**

```json
{
  "command_id": "c3e65f11-5bd6-458f-a997-2209174c1e79",
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

`GET /api/driver/v1/safety-contacts` → **409**

```json
{
  "instance": "/api/driver/v1/safety-contacts",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d417fdda-59fe-4480-95cc-cd73a8ab0eb7"
}
```

Done: safety contacts of Warszawa, version 1.
