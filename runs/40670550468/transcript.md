# Sandbox transcript (2026-10-28T10:15:23Z, 5d5573e)

# Scenario: bonuses

## The admin starts «Осінь −10 %» in Kyiv

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
  "correlation_id": "2a4d2678-d2f0-4810-8d05-1379c40ae5d6"
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
  "session_id": "5c2ab405-49ec-480e-9913-85b762829a19",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM0MzAsImlhdCI6MTc5MzE4MjUzMCwianRpIjoiNTdiNDA2NzctMzhhMC00NjkyLTliNzMtNWJhYzY4YmI4MDc2Iiwic2lkIjoiNWMyYWI0MDUtNDllYy00ODBlLTk5MTMtODViNzYyODI5YTE5In0.PBzCjiBPyu7uwEGLYMipSCpGqK1sroSYuCGA-fCapUE",
  "access_expires_at": "2026-10-28T10:30:30.223931145Z",
  "refresh_token": "hZOeVi7LyAWPr-RC9CMid0fvMnPZYCVpKr04HUVt3BE",
  "refresh_expires_at": "2026-10-28T22:15:30.222404544Z",
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
  "session_id": "ff5c5cb6-6e14-4241-899c-00f5d122e615",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM0MzEsImlhdCI6MTc5MzE4MjUzMSwianRpIjoiNzUwODlhYmItMjFiNS00NDJkLTlhOTMtM2M3ZTI1MWQ1MGNjIiwic2lkIjoiZmY1YzVjYjYtNmUxNC00MjQxLTg5OWMtMDBmNWQxMjJlNjE1In0.I3d3Jj6eFXt6AXF4EU0unqVqUJB5pOql9uWv7hW5Mkc",
  "access_expires_at": "2026-10-28T10:30:31.227416888Z",
  "refresh_token": "csQxmS9Cyw2BeoxZRXpN_3o_p3-RAEOQL7pZdyItQV0",
  "refresh_expires_at": "2026-10-28T22:15:31.226698285Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "3f4dc32b-1b1a-4dc6-b573-0133ca012213",
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
  "id": "f7f16c43-060d-461d-837c-aecb1196ccc0",
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
  "created_by": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
  "created_at": "2026-10-28T10:15:31.403187Z",
  "updated_at": "2026-10-28T10:15:31.403187Z"
}
```

**Contract validation failed — scenario stopped.**

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
  "session_id": "fc451ce2-7c1c-4d85-8be5-72ee91aaf3d9",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM0MzEsImlhdCI6MTc5MzE4MjUzMSwianRpIjoiMGU2ZjlkZDItNjk0Ny00NzVlLTkzYWYtNjNmY2I0ZDZiYzRhIiwic2lkIjoiZmM0NTFjZTItN2MxYy00ZDg1LThiZTUtNzJlZTkxYWFmM2Q5In0.srEGA1zpajqc5eyUPiDoFM0Ph2x8fnMga5LskzRk4K8",
  "access_expires_at": "2026-10-28T10:30:31.782441256Z",
  "refresh_token": "04Nn3QeKTP43qLLPcOtWGcUJiO4Y_T5BvLwOKoSDiZA",
  "refresh_expires_at": "2026-10-28T22:15:31.781257061Z",
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
  "command_id": "027b2114-fe30-4b36-bfca-dfa322b947b8",
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
  "session_id": "11a13038-6804-4126-82f9-9de84b293f5e",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM0MzIsImlhdCI6MTc5MzE4MjUzMiwianRpIjoiMTc4ZWU1NTktN2RmYS00OTBkLWIyZWEtNGU1MjJkNGEzNGM0Iiwic2lkIjoiMTFhMTMwMzgtNjgwNC00MTI2LTgyZjktOWRlODRiMjkzZjVlIn0.pliODDHlvRoaZJ7Fi_ZMEDLvzdBMKAhaB-u_8O-8Ooc",
  "access_expires_at": "2026-10-28T10:30:32.509333867Z",
  "refresh_token": "Zkij9P5H6IPCSx3eIDo7JrwqEFhDjcPXZzmufiOuttc",
  "refresh_expires_at": "2026-10-28T22:15:32.508173774Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.159967730",
    "linkedid": "1730052700.159967730",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671510621"
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
    "id": "1730052700.159967730",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "e9d36103-d957-4da3-a373-46e02936538f",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380671510621",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:15:32.736873Z",
      "answered_at": null,
      "ended_at": "2026-10-28T10:15:32.767529Z",
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
    "id": "1730052600.242918485",
    "linkedid": "1730052600.242918485",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671510621"
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
      "id": "bcbd7bd8-1b4f-48e4-b9cf-9d0a364d56cd",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380671510621",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:15:32.97667Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/bcbd7bd8-1b4f-48e4-b9cf-9d0a364d56cd/answer` → **200**

```json
{
  "command_id": "e29cae85-d425-4c42-a400-503f306286f4"
}
```

```json
{
  "id": "bcbd7bd8-1b4f-48e4-b9cf-9d0a364d56cd",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380671510621",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
  "order_ids": [],
  "started_at": "2026-10-28T10:15:32.97667Z",
  "answered_at": "2026-10-28T10:15:33.180435Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.242918485",
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
    "id": "1730052600.242918485",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "bcbd7bd8-1b4f-48e4-b9cf-9d0a364d56cd",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671510621",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
      "order_ids": [],
      "started_at": "2026-10-28T10:15:32.97667Z",
      "answered_at": "2026-10-28T10:15:33.180435Z",
      "ended_at": "2026-10-28T10:15:33.372156Z",
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
      "id": "bcbd7bd8-1b4f-48e4-b9cf-9d0a364d56cd",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671510621",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
      "order_ids": [],
      "started_at": "2026-10-28T10:15:32.97667Z",
      "answered_at": "2026-10-28T10:15:33.180435Z",
      "ended_at": "2026-10-28T10:15:33.372156Z",
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
      "id": "bcbd7bd8-1b4f-48e4-b9cf-9d0a364d56cd",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671510621",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
      "order_ids": [],
      "started_at": "2026-10-28T10:15:32.97667Z",
      "answered_at": "2026-10-28T10:15:33.180435Z",
      "ended_at": "2026-10-28T10:15:33.372156Z",
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
      "id": "bcbd7bd8-1b4f-48e4-b9cf-9d0a364d56cd",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671510621",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
      "order_ids": [],
      "started_at": "2026-10-28T10:15:32.97667Z",
      "answered_at": "2026-10-28T10:15:33.180435Z",
      "ended_at": "2026-10-28T10:15:33.372156Z",
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
      "id": "bcbd7bd8-1b4f-48e4-b9cf-9d0a364d56cd",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671510621",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
      "order_ids": [],
      "started_at": "2026-10-28T10:15:32.97667Z",
      "answered_at": "2026-10-28T10:15:33.180435Z",
      "ended_at": "2026-10-28T10:15:33.372156Z",
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
      "id": "bcbd7bd8-1b4f-48e4-b9cf-9d0a364d56cd",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671510621",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
      "order_ids": [],
      "started_at": "2026-10-28T10:15:32.97667Z",
      "answered_at": "2026-10-28T10:15:33.180435Z",
      "ended_at": "2026-10-28T10:15:33.372156Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:15:42.776234Z"
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
      "id": "bcbd7bd8-1b4f-48e4-b9cf-9d0a364d56cd",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671510621",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
      "order_ids": [],
      "started_at": "2026-10-28T10:15:32.97667Z",
      "answered_at": "2026-10-28T10:15:33.180435Z",
      "ended_at": "2026-10-28T10:15:33.372156Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:15:42.776234Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/bcbd7bd8-1b4f-48e4-b9cf-9d0a364d56cd/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/bcbd7bd8-1b4f-48e4-b9cf-9d0a364d56cd/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=bcbd7bd8-1b4f-48e4-b9cf-9d0a364d56cd` → **200**

```json
{
  "changes": [
    {
      "id": "1be228fc-61cf-4ecd-a324-39f9acb4ba7e",
      "occurred_at": "2026-10-28T10:15:44.653428Z",
      "actor_type": "STAFF",
      "actor_id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "bcbd7bd8-1b4f-48e4-b9cf-9d0a364d56cd",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"0f9af008-ba0d-4817-aacd-9d57c3263d82\", \"order_ids\": []}",
      "correlation_id": "5cc85838-c0d6-4a91-9a8a-f82f23d0b539"
    },
    {
      "id": "2a560e5f-15a3-4b62-a9d9-09efa49e8099",
      "occurred_at": "2026-10-28T10:15:44.624808Z",
      "actor_type": "STAFF",
      "actor_id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "bcbd7bd8-1b4f-48e4-b9cf-9d0a364d56cd",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"0f9af008-ba0d-4817-aacd-9d57c3263d82\", \"order_ids\": []}",
      "correlation_id": "4224c55e-ad42-418d-a0e1-b27b557f9bdc"
    }
  ]
}
```

Done: call bcbd7bd8-1b4f-48e4-b9cf-9d0a364d56cd recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631409593",
  "device_ref": "sandbox-25441"
}
```

```json
{
  "challenge_id": "5bf8b69f-005a-4b7d-a29f-a851d69ad0fe",
  "expires_at": "2026-10-28T10:20:44.871413765Z",
  "resend_available_at": "2026-10-28T10:15:45.871413765Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631409593` → **200**

```json
{
  "phone": "+380631409593",
  "audience": "CLIENT",
  "code": "533321",
  "sent_at": "2026-10-28T10:15:44.876809182Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5bf8b69f-005a-4b7d-a29f-a851d69ad0fe",
  "code": "533321",
  "device_ref": "sandbox-25441"
}
```

```json
{
  "session_id": "900e58ec-8327-4263-87a5-f515d07c4a11",
  "subject": {
    "type": "CLIENT",
    "id": "fa4ae159-3e41-44ea-9dcc-f2ef44fc2e56"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYTRhZTE1OS0zZTQxLTQ0ZWEtOWRjYy1mMmVmNDRmYzJlNTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNDQ1LCJpYXQiOjE3OTMxODI1NDUsImp0aSI6IjUxNzA5MDU4LWI4OTQtNDdiNy05MWZlLTFiNTMwOGViOWJiNCIsInNpZCI6IjkwMGU1OGVjLTgzMjctNDI2My04N2E1LWY1MTVkMDdjNGExMSJ9.OKcpxIR2LCOM-NB33g_vVpA44laLrHNptioOVXywZ9A",
  "access_expires_at": "2026-10-28T10:30:45.088526253Z",
  "refresh_token": "xYMPPXGhxIeJSpN4V4ksebgACRwqR-MR0amJhNdQa-w",
  "refresh_expires_at": "2026-11-27T10:15:45.08775434Z",
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
        "uk": "Передумав їхати",
        "pl": "Zmiana planów",
        "ru": "Передумал ехать",
        "en": "Changed my mind"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "uk": "Помилився адресою",
        "pl": "Błędny adres",
        "ru": "Ошибся адресом",
        "en": "Wrong address"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "uk": "Поїду іншим транспортом",
        "pl": "Inny transport",
        "ru": "Уеду на другом транспорте",
        "en": "Found other transport"
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
  "device_ref": "sandbox-31107"
}
```

```json
{
  "challenge_id": "c8b4e453-fee0-4cc9-a0db-f2ad567fac3a",
  "expires_at": "2026-10-28T10:20:45.425881707Z",
  "resend_available_at": "2026-10-28T10:15:46.425881707Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "122394",
  "sent_at": "2026-10-28T10:15:45.428356733Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c8b4e453-fee0-4cc9-a0db-f2ad567fac3a",
  "code": "122394",
  "device_ref": "sandbox-31107"
}
```

```json
{
  "session_id": "0f94018e-2346-4307-95f1-173b12f8afd5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzQ0NSwiaWF0IjoxNzkzMTgyNTQ1LCJqdGkiOiI2M2VhYjBkYy0xMzVhLTRlNzYtOTFiYy1lZjAxODYzYjlmZWQiLCJzaWQiOiIwZjk0MDE4ZS0yMzQ2LTQzMDctOTVmMS0xNzNiMTJmOGFmZDUifQ.G2szRchkeYSn7p0R0xdzMLpHDDQdl_lPHAVNK4FA50U",
  "access_expires_at": "2026-10-28T10:30:45.616843503Z",
  "refresh_token": "wiesTKukjOvj_G_q7hnJGVr_qkNtxuBCSMHXK_F1UZk",
  "refresh_expires_at": "2026-11-27T10:15:45.616189421Z",
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
        "uk": "Пасажир не вийшов",
        "pl": "Pasażer nie przyszedł",
        "ru": "Пассажир не вышел",
        "en": "Passenger did not show up"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "uk": "Несправність автомобіля",
        "pl": "Awaria samochodu",
        "ru": "Неисправность автомобиля",
        "en": "Vehicle problem"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "uk": "Не можу під'їхати",
        "pl": "Nie mogę dojechać",
        "ru": "Не могу подъехать",
        "en": "Cannot reach the pickup"
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
  "session_id": "d9964c27-f620-496a-a2da-610ae3408e89",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM0NDYsImlhdCI6MTc5MzE4MjU0NiwianRpIjoiMmQ3NTg1YjAtZWE5My00Y2E5LWJlYTQtMGM3MTg0ZWQ4OWRjIiwic2lkIjoiZDk5NjRjMjctZjYyMC00OTZhLWEyZGEtNjEwYWUzNDA4ZTg5In0.i-_WRDQIy8b00bFgJ4wWH9cL6LLbmG8ZcY-wX1p9RbU",
  "access_expires_at": "2026-10-28T10:30:46.145282409Z",
  "refresh_token": "9uAS0XaLeC2EJxDGAk3_1OGMeF9li0fslF_TuHowkcs",
  "refresh_expires_at": "2026-10-28T22:15:46.144753718Z",
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
  "session_id": "4d9cf902-79ba-4b2a-bc0b-efa90e9bf1bf",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM0NDYsImlhdCI6MTc5MzE4MjU0NiwianRpIjoiNzIzNzYyZjAtNjE3Yy00ZjRjLWExZjEtN2YyYWU3NzUyMDE4Iiwic2lkIjoiNGQ5Y2Y5MDItNzliYS00YjJhLWJjMGItZWZhOTBlOWJmMWJmIn0.iZ4xfs95fr3-p8fVHDIm4C8OeYWJqrk9Hxp855Fjcas",
  "access_expires_at": "2026-10-28T10:30:46.507581146Z",
  "refresh_token": "OoMIsX7QrslK4OCxVdj3hJ4yaMJ-yFGx_dOFHm7ebuk",
  "refresh_expires_at": "2026-10-28T22:15:46.507148214Z",
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
        "uk": "Пасажир попросив",
        "pl": "Na prośbę pasażera",
        "ru": "Пассажир попросил",
        "en": "Passenger asked"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "uk": "Дубль замовлення",
        "pl": "Duplikat zamówienia",
        "ru": "Дубль заказа",
        "en": "Duplicate order"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "uk": "Немає вільних авто",
        "pl": "Brak wolnych aut",
        "ru": "Нет свободных машин",
        "en": "No cars available"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "uk": "Тестове замовлення",
        "pl": "Zamówienie testowe",
        "ru": "Тестовый заказ",
        "en": "Test order"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "uk": "Помилка оператора",
        "pl": "Błąd operatora",
        "ru": "Ошибка оператора",
        "en": "Operator error"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "uk": "ДТП",
        "pl": "Wypadek",
        "ru": "ДТП",
        "en": "Accident"
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
  "command_id": "fb38987d-35c4-4e49-b36a-a3a73b203774",
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
  "id": "563f49d0-f088-4bbc-838c-b64753fac067",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:20:47.046066Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 3053,
  "to_pay_minor": 27480,
  "promotions": [
    {
      "id": "f7f16c43-060d-461d-837c-aecb1196ccc0",
      "name": "Осінь −10 %",
      "kind": "DISCOUNT",
      "value_type": "PERCENT",
      "value": 1000,
      "discount_minor": 3053
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d0c4d5c0-56ff-410b-af8c-63fea4bd97de",
  "quote_id": "563f49d0-f088-4bbc-838c-b64753fac067",
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
  "id": "3cb0af93-eb00-48bf-b101-0a6929447a74",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fa4ae159-3e41-44ea-9dcc-f2ef44fc2e56",
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
  "created_at": "2026-10-28T10:15:47.274889Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 3053
}
```

`GET /api/rider/v1/orders/3cb0af93-eb00-48bf-b101-0a6929447a74` → **200**

```json
{
  "id": "3cb0af93-eb00-48bf-b101-0a6929447a74",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fa4ae159-3e41-44ea-9dcc-f2ef44fc2e56",
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
  "created_at": "2026-10-28T10:15:47.274889Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 3053
}
```

`POST /api/rider/v1/orders/3cb0af93-eb00-48bf-b101-0a6929447a74/cancel` → **200**

```json
{
  "command_id": "3c5dddeb-9db7-400d-8f6a-21e095c44be6",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "3cb0af93-eb00-48bf-b101-0a6929447a74",
  "short_number": 1,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fa4ae159-3e41-44ea-9dcc-f2ef44fc2e56",
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
  "created_at": "2026-10-28T10:15:47.274889Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "uk": "Довго чекати авто",
      "pl": "Zbyt długie oczekiwanie",
      "ru": "Долго ждать машину",
      "en": "The wait is too long"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 3053
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
  "command_id": "065e020c-0bbd-4653-900d-b6281619dbc4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:15:48Z",
    "sequence": 1793182548144
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "750eafa9-ee0a-4e42-925c-d7d9f42acb94",
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
  "last_heartbeat_at": "2026-10-28T10:15:48.043451Z",
  "last_location_at": "2026-10-28T10:15:48.043451Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-12321"
}
```

```json
{
  "challenge_id": "ca7da5cd-408f-4faa-97f5-fbe6685837b9",
  "expires_at": "2026-10-28T10:20:48.220000201Z",
  "resend_available_at": "2026-10-28T10:15:49.220000201Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "955624",
  "sent_at": "2026-10-28T10:15:48.222629861Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ca7da5cd-408f-4faa-97f5-fbe6685837b9",
  "code": "955624",
  "device_ref": "sandbox-12321"
}
```

```json
{
  "session_id": "0f1397f5-5f0c-4950-a40d-c7aa3371ff60",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzQ0OCwiaWF0IjoxNzkzMTgyNTQ4LCJqdGkiOiIwYTkzYTY0YS05NmViLTQwYTMtYmQ4YS0wZWI3ODVmYzg5NWIiLCJzaWQiOiIwZjEzOTdmNS01ZjBjLTQ5NTAtYTQwZC1jN2FhMzM3MWZmNjAifQ.oF1ZEUsDWraMAq31pbw4otGPgHbHSIBm-MRoNmE_mjI",
  "access_expires_at": "2026-10-28T10:30:48.415572295Z",
  "refresh_token": "tXymgy1oHNTdMQLXMrHlGXYX3ZXpe4px3pl9CBfQi3I",
  "refresh_expires_at": "2026-11-27T10:15:48.415065676Z",
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
  "command_id": "f2ac44bc-dff4-484a-bf60-a9598bcd9f64",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:15:48Z",
    "sequence": 1793182548755
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d08211de-91e7-4cf1-8d51-47f062b64ee6",
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
  "last_heartbeat_at": "2026-10-28T10:15:48.771999Z",
  "last_location_at": "2026-10-28T10:15:48.771999Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a980a35f-01fc-4f4a-a30b-2808b40a3f04",
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
  "id": "5610fea3-8dbd-45fd-8294-75a3dc61de72",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:20:48.956607Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 3053,
  "to_pay_minor": 27480,
  "promotions": [
    {
      "id": "f7f16c43-060d-461d-837c-aecb1196ccc0",
      "name": "Осінь −10 %",
      "kind": "DISCOUNT",
      "value_type": "PERCENT",
      "value": 1000,
      "discount_minor": 3053
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "199b4031-8a42-44fd-958a-8e39bfeb1ceb",
  "quote_id": "5610fea3-8dbd-45fd-8294-75a3dc61de72",
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
  "id": "5571c514-489d-430e-8312-02e731d5ff9a",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fa4ae159-3e41-44ea-9dcc-f2ef44fc2e56",
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
  "created_at": "2026-10-28T10:15:49.138149Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 3053
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "95e5f48c-21ce-4ebb-8e90-d8e75331b637",
    "order_id": "5571c514-489d-430e-8312-02e731d5ff9a",
    "expires_at": "2026-10-28T10:16:04.141609Z",
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

`POST /api/driver/v1/offers/95e5f48c-21ce-4ebb-8e90-d8e75331b637/accept` → **200**

```json
{
  "command_id": "23bcde70-4e6f-484d-8573-d208793b5452"
}
```

```json
{
  "id": "dc277916-169a-4941-b816-41705b84111c",
  "order_id": "5571c514-489d-430e-8312-02e731d5ff9a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "02bfa867-7b00-42da-a18c-7b9e9a6f5c1d",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "02bfa867-7b00-42da-a18c-7b9e9a6f5c1d",
  "order_id": "5571c514-489d-430e-8312-02e731d5ff9a",
  "assignment_id": "dc277916-169a-4941-b816-41705b84111c",
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
  "discount_minor": 3053,
  "recipient": null
}
```

`POST /api/driver/v1/trips/02bfa867-7b00-42da-a18c-7b9e9a6f5c1d/cancel` → **200**

```json
{
  "command_id": "a97bce0b-8911-4513-a476-7b2d103e9cf1",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "02bfa867-7b00-42da-a18c-7b9e9a6f5c1d",
  "order_id": "5571c514-489d-430e-8312-02e731d5ff9a",
  "assignment_id": "dc277916-169a-4941-b816-41705b84111c",
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
  "discount_minor": 3053,
  "recipient": null
}
```

`GET /api/rider/v1/orders/5571c514-489d-430e-8312-02e731d5ff9a` → **200**

```json
{
  "id": "5571c514-489d-430e-8312-02e731d5ff9a",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "fa4ae159-3e41-44ea-9dcc-f2ef44fc2e56",
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
    "id": "dc277916-169a-4941-b816-41705b84111c",
    "order_id": "5571c514-489d-430e-8312-02e731d5ff9a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "02bfa867-7b00-42da-a18c-7b9e9a6f5c1d",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T10:15:49.138149Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 3053
}
```

## Andrii gets it and cancels: «Пассажир попросил отменить»

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "59833618-1967-4f03-b2d8-82ecbb673d25",
    "order_id": "5571c514-489d-430e-8312-02e731d5ff9a",
    "expires_at": "2026-10-28T10:16:05.030305Z",
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

`POST /api/driver/v1/offers/59833618-1967-4f03-b2d8-82ecbb673d25/accept` → **200**

```json
{
  "command_id": "3581a891-f66d-492b-8aac-624c4094d17e"
}
```

```json
{
  "id": "c1b57063-018a-4ce7-8d0a-30a7853b05df",
  "order_id": "5571c514-489d-430e-8312-02e731d5ff9a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "754988db-b0ed-494b-9560-3c2e09cec430",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "754988db-b0ed-494b-9560-3c2e09cec430",
  "order_id": "5571c514-489d-430e-8312-02e731d5ff9a",
  "assignment_id": "c1b57063-018a-4ce7-8d0a-30a7853b05df",
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
  "discount_minor": 3053,
  "recipient": null
}
```

`POST /api/driver/v1/trips/754988db-b0ed-494b-9560-3c2e09cec430/cancel` → **200**

```json
{
  "command_id": "b08a0696-1de2-4490-8fbf-b9e6be46b93d",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "754988db-b0ed-494b-9560-3c2e09cec430",
  "order_id": "5571c514-489d-430e-8312-02e731d5ff9a",
  "assignment_id": "c1b57063-018a-4ce7-8d0a-30a7853b05df",
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
  "discount_minor": 3053,
  "recipient": null
}
```

## The rider sees who cancelled; the operator sees the whole history

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "5571c514-489d-430e-8312-02e731d5ff9a",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T10:15:49.138149Z",
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
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel"
      }
    },
    "pickup_at": null
  },
  {
    "id": "3cb0af93-eb00-48bf-b101-0a6929447a74",
    "short_number": 1,
    "status": "CANCELLED",
    "created_at": "2026-10-28T10:15:47.274889Z",
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
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/5571c514-489d-430e-8312-02e731d5ff9a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:15:49.138774Z",
      "actor": {
        "type": "CLIENT",
        "id": "fa4ae159-3e41-44ea-9dcc-f2ef44fc2e56",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5571c514-489d-430e-8312-02e731d5ff9a",
        "quote_id": "5610fea3-8dbd-45fd-8294-75a3dc61de72",
        "price_minor": 30533,
        "discount_minor": 3053,
        "payment_method": "CASH"
      },
      "correlation_id": "0fc54523-4b28-4c69-a78b-c20810df87f2"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:15:49.140657Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5571c514-489d-430e-8312-02e731d5ff9a",
        "attempt_id": "630fa003-2371-4279-bc16-36ef9d84aa0a",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "0fc54523-4b28-4c69-a78b-c20810df87f2"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:15:49.148546Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "95e5f48c-21ce-4ebb-8e90-d8e75331b637",
        "order_id": "5571c514-489d-430e-8312-02e731d5ff9a",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "0fc54523-4b28-4c69-a78b-c20810df87f2"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T10:15:49.664137Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "95e5f48c-21ce-4ebb-8e90-d8e75331b637",
        "order_id": "5571c514-489d-430e-8312-02e731d5ff9a",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "dc277916-169a-4941-b816-41705b84111c"
      },
```

Done: orders 3cb0af93-eb00-48bf-b101-0a6929447a74, 5571c514-489d-430e-8312-02e731d5ff9a.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738166686",
  "device_ref": "sandbox-4534"
}
```

```json
{
  "challenge_id": "6f00b8c3-9b83-451d-a5ab-fc3693eed58b",
  "expires_at": "2026-10-28T10:20:51.461038515Z",
  "resend_available_at": "2026-10-28T10:15:52.461038515Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380738166686` → **200**

```json
{
  "phone": "+380738166686",
  "audience": "CLIENT",
  "code": "653176",
  "sent_at": "2026-10-28T10:15:51.486158459Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6f00b8c3-9b83-451d-a5ab-fc3693eed58b",
  "code": "653176",
  "device_ref": "sandbox-4534"
}
```

```json
{
  "session_id": "6bfb126d-7dc6-4b60-b756-284bea4fff0c",
  "subject": {
    "type": "CLIENT",
    "id": "9f731e6f-d6c7-4659-95ec-e2a6e9e72e56"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZjczMWU2Zi1kNmM3LTQ2NTktOTVlYy1lMmE2ZTllNzJlNTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNDUxLCJpYXQiOjE3OTMxODI1NTEsImp0aSI6IjY3ZTM4MjNmLTllNzItNDA4OC04Nzk2LTQwNjRiODlhOTRkYiIsInNpZCI6IjZiZmIxMjZkLTdkYzYtNGI2MC1iNzU2LTI4NGJlYTRmZmYwYyJ9.j9Y_nJ1Iap0FbyvrJRZCt3Y2qJpf_o5fLO-f4uqi7Bg",
  "access_expires_at": "2026-10-28T10:30:51.670262579Z",
  "refresh_token": "8lzhrGUg18HpPXBT6Z9Quwl0IVNMZcLXWou768iPGY8",
  "refresh_expires_at": "2026-11-27T10:15:51.669806902Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "3d75f201-df15-4aad-8853-961cb628e8ad",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "cfb33b11-ed7e-4321-85f9-a1f2b7e5da12",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-cfb33b11-ed7e-4321-85f9-a1f2b7e5da12",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "938699edef4280eac656d7de67522765",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=cfb33b11-ed7e-4321-85f9-a1f2b7e5da12",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738166686"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=cfb33b11-ed7e-4321-85f9-a1f2b7e5da12",
  "expires_at": "2026-10-28T10:45:51.845015Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/cfb33b11-ed7e-4321-85f9-a1f2b7e5da12` → **200**

```json
{
  "id": "cfb33b11-ed7e-4321-85f9-a1f2b7e5da12",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T10:45:51.845015Z",
  "card": {
    "id": "3dbc953d-b56a-42d0-8e28-b08146107ae5",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6784",
    "card_type": "Visa",
    "created_at": "2026-10-28T10:15:52.029571Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "3dbc953d-b56a-42d0-8e28-b08146107ae5",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****6784",
      "card_type": "Visa",
      "created_at": "2026-10-28T10:15:52.029571Z"
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
  "device_ref": "sandbox-6595"
}
```

```json
{
  "challenge_id": "01da1cda-d5b2-48e0-b8b6-6f24d51c2ae4",
  "expires_at": "2026-10-28T10:20:52.381814589Z",
  "resend_available_at": "2026-10-28T10:15:53.381814589Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "605308",
  "sent_at": "2026-10-28T10:15:52.384353666Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "01da1cda-d5b2-48e0-b8b6-6f24d51c2ae4",
  "code": "605308",
  "device_ref": "sandbox-6595"
}
```

```json
{
  "session_id": "868adc62-3d0c-4c7f-a733-a7b8ea4fc382",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzQ1MiwiaWF0IjoxNzkzMTgyNTUyLCJqdGkiOiI2Y2RlYTNmZi1hYzY0LTRiODYtODkzZS0xOThlYzFmMjM4MDciLCJzaWQiOiI4NjhhZGM2Mi0zZDBjLTRjN2YtYTczMy1hN2I4ZWE0ZmMzODIifQ.tsG3jw5bwqR272d3plx5ZkJq_nj3CzTxXc2Hj3tK3fA",
  "access_expires_at": "2026-10-28T10:30:52.576398252Z",
  "refresh_token": "sshk5AgjiBe4NvO3e_zlPTsEeR7oYqlRmc0zAH3uPy0",
  "refresh_expires_at": "2026-11-27T10:15:52.575931905Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d08211de-91e7-4cf1-8d51-47f062b64ee6",
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
  "last_heartbeat_at": "2026-10-28T10:15:48.771999Z",
  "last_location_at": "2026-10-28T10:15:48.771999Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d08211de-91e7-4cf1-8d51-47f062b64ee6/handover` → **200**

```json
{
  "command_id": "0df03f0f-97c1-481b-9034-1e6d88216eb3",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d08211de-91e7-4cf1-8d51-47f062b64ee6",
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
  "last_heartbeat_at": "2026-10-28T10:15:48.771999Z",
  "last_location_at": "2026-10-28T10:15:48.771999Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d08211de-91e7-4cf1-8d51-47f062b64ee6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:15:53Z",
    "sequence": 1793182553998
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d08211de-91e7-4cf1-8d51-47f062b64ee6",
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
  "last_heartbeat_at": "2026-10-28T10:15:53.119332Z",
  "last_location_at": "2026-10-28T10:15:53.119332Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "38955aa6-4009-4a0f-a36f-c9386237fbc2",
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
  "id": "668d1ab2-5f2d-4075-8ad5-eaa18ace853b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:20:53.297408Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 1630,
  "to_pay_minor": 14667,
  "promotions": [
    {
      "id": "f7f16c43-060d-461d-837c-aecb1196ccc0",
      "name": "Осінь −10 %",
      "kind": "DISCOUNT",
      "value_type": "PERCENT",
      "value": 1000,
      "discount_minor": 1630
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0f1fefc2-7d1c-4a2a-8e92-cd1d5dfb3e32",
  "quote_id": "668d1ab2-5f2d-4075-8ad5-eaa18ace853b",
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
  "id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
  "short_number": 3,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9f731e6f-d6c7-4659-95ec-e2a6e9e72e56",
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
  "created_at": "2026-10-28T10:15:53.477977Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 1630
}
```

`GET /api/rider/v1/orders/28186d3d-af5a-40b2-89e0-94f7278aa7aa` → **200**

```json
{
  "id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
  "short_number": 3,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9f731e6f-d6c7-4659-95ec-e2a6e9e72e56",
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
  "created_at": "2026-10-28T10:15:53.477977Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 1630
}
```

`GET /api/rider/v1/orders/28186d3d-af5a-40b2-89e0-94f7278aa7aa` → **200**

```json
{
  "id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9f731e6f-d6c7-4659-95ec-e2a6e9e72e56",
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
  "created_at": "2026-10-28T10:15:53.477977Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 1630
}
```

## Andrii takes it and drives

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "b25a9233-fe67-45c3-b543-4b62a3cdee2c",
    "order_id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
    "expires_at": "2026-10-28T10:16:08.972658Z",
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

`POST /api/driver/v1/offers/b25a9233-fe67-45c3-b543-4b62a3cdee2c/accept` → **200**

```json
{
  "command_id": "24defc6c-0736-4970-bd8d-dfde02cbd93b"
}
```

```json
{
  "id": "ee3f7b7c-8b73-4744-a724-044612de886a",
  "order_id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3d59227b-fc1e-4fbe-8e1b-6accd77581c9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3d59227b-fc1e-4fbe-8e1b-6accd77581c9",
  "order_id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
  "assignment_id": "ee3f7b7c-8b73-4744-a724-044612de886a",
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
  "discount_minor": 1630,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/d08211de-91e7-4cf1-8d51-47f062b64ee6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:15:55Z",
    "sequence": 1793182555509
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d08211de-91e7-4cf1-8d51-47f062b64ee6",
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
  "last_heartbeat_at": "2026-10-28T10:15:55.527154Z",
  "last_location_at": "2026-10-28T10:15:55.527154Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3d59227b-fc1e-4fbe-8e1b-6accd77581c9/arrive` → **200**

```json
{
  "command_id": "6eb8e459-fb73-4d37-8101-1ecc0c116664",
  "expected_version": 0
}
```

```json
{
  "id": "3d59227b-fc1e-4fbe-8e1b-6accd77581c9",
  "order_id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
  "assignment_id": "ee3f7b7c-8b73-4744-a724-044612de886a",
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
  "arrived_at": "2026-10-28T10:15:55.706655Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 1630,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3d59227b-fc1e-4fbe-8e1b-6accd77581c9/start` → **200**

```json
{
  "command_id": "ce333369-bf3d-4516-98fd-ff4f92f79e34",
  "expected_version": 1
}
```

```json
{
  "id": "3d59227b-fc1e-4fbe-8e1b-6accd77581c9",
  "order_id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
  "assignment_id": "ee3f7b7c-8b73-4744-a724-044612de886a",
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
  "arrived_at": "2026-10-28T10:15:55.706655Z",
  "started_at": "2026-10-28T10:15:55.884122Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 1630,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3d59227b-fc1e-4fbe-8e1b-6accd77581c9/complete` → **200**

```json
{
  "command_id": "a2a776c8-2b1b-4a04-9890-c55479b5bd74",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:15:56Z"
}
```

```json
{
  "id": "3d59227b-fc1e-4fbe-8e1b-6accd77581c9",
  "order_id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
  "assignment_id": "ee3f7b7c-8b73-4744-a724-044612de886a",
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
  "arrived_at": "2026-10-28T10:15:55.706655Z",
  "started_at": "2026-10-28T10:15:55.884122Z",
  "completed_at": "2026-10-28T10:15:56.072046Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 1630,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/28186d3d-af5a-40b2-89e0-94f7278aa7aa` → **200**

```json
{
  "id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "9f731e6f-d6c7-4659-95ec-e2a6e9e72e56",
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
    "id": "ee3f7b7c-8b73-4744-a724-044612de886a",
    "order_id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3d59227b-fc1e-4fbe-8e1b-6accd77581c9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:15:53.477977Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 1630
}
```

`GET /api/rider/v1/orders/28186d3d-af5a-40b2-89e0-94f7278aa7aa` → **200**

```json
{
  "id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "9f731e6f-d6c7-4659-95ec-e2a6e9e72e56",
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
    "id": "ee3f7b7c-8b73-4744-a724-044612de886a",
    "order_id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3d59227b-fc1e-4fbe-8e1b-6accd77581c9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:15:53.477977Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 1630
}
```

`GET /api/rider/v1/orders/28186d3d-af5a-40b2-89e0-94f7278aa7aa` → **200**

```json
{
  "id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "9f731e6f-d6c7-4659-95ec-e2a6e9e72e56",
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
    "id": "ee3f7b7c-8b73-4744-a724-044612de886a",
    "order_id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3d59227b-fc1e-4fbe-8e1b-6accd77581c9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:15:53.477977Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 1630
}
```

`GET /api/rider/v1/orders/28186d3d-af5a-40b2-89e0-94f7278aa7aa` → **200**

```json
{
  "id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "9f731e6f-d6c7-4659-95ec-e2a6e9e72e56",
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
    "id": "ee3f7b7c-8b73-4744-a724-044612de886a",
    "order_id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3d59227b-fc1e-4fbe-8e1b-6accd77581c9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:15:53.477977Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 1630
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
      "id": "f52dfe32-f169-44c4-b49b-6a97c92c2088",
      "at": "2026-10-28T10:15:57.027521Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/28186d3d-af5a-40b2-89e0-94f7278aa7aa/tip` → **200**

```json
{
  "order_id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
  "currency": "UAH",
  "trip_cost_minor": 14667,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1500
    },
    {
      "percent": 15,
      "amount_minor": 2300
    },
    {
      "percent": 20,
      "amount_minor": 3000
    },
    {
      "percent": 25,
      "amount_minor": 3700
    }
  ],
  "min_minor": 100,
  "max_minor": 14700,
  "method": "CARD",
  "available_until": "2026-10-29T10:15:56.072046Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/28186d3d-af5a-40b2-89e0-94f7278aa7aa/tip` → **201**

```json
{
  "command_id": "93833b33-ee40-49ab-925f-4386c0afa54c",
  "amount_minor": 2300
}
```

```json
{
  "id": "ce2c53b8-3efa-4590-aa3d-f00b0bfa69be",
  "order_id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
  "amount_minor": 2300,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T10:16:00.449911Z"
}
```

`GET /api/rider/v1/orders/28186d3d-af5a-40b2-89e0-94f7278aa7aa/tip` → **200**

```json
{
  "order_id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
  "currency": "UAH",
  "trip_cost_minor": 14667,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1500
    },
    {
      "percent": 15,
      "amount_minor": 2300
    },
    {
      "percent": 20,
      "amount_minor": 3000
    },
    {
      "percent": 25,
      "amount_minor": 3700
    }
  ],
  "min_minor": 100,
  "max_minor": 14700,
  "method": "CARD",
  "available_until": "2026-10-29T10:15:56.072046Z",
  "open": false,
  "tip": {
    "id": "ce2c53b8-3efa-4590-aa3d-f00b0bfa69be",
    "order_id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
    "amount_minor": 2300,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T10:16:00.449911Z"
  }
}
```

`GET /api/rider/v1/orders/28186d3d-af5a-40b2-89e0-94f7278aa7aa/tip` → **200**

```json
{
  "order_id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
  "currency": "UAH",
  "trip_cost_minor": 14667,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1500
    },
    {
      "percent": 15,
      "amount_minor": 2300
    },
    {
      "percent": 20,
      "amount_minor": 3000
    },
    {
      "percent": 25,
      "amount_minor": 3700
    }
  ],
  "min_minor": 100,
  "max_minor": 14700,
  "method": "CARD",
  "available_until": "2026-10-29T10:15:56.072046Z",
  "open": false,
  "tip": {
    "id": "ce2c53b8-3efa-4590-aa3d-f00b0bfa69be",
    "order_id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
    "amount_minor": 2300,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T10:16:00.449911Z"
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
      "id": "f52dfe32-f169-44c4-b49b-6a97c92c2088",
      "at": "2026-10-28T10:15:57.027521Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
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
      "balance_minor": 16152
    }
  ],
  "entries": [
    {
      "id": "c59127db-bd22-4a37-9d06-951de45c3096",
      "at": "2026-10-28T10:16:02.090852Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2300,
      "reason": "Tip for the driver",
      "order_id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
      "counterpart_id": null
    },
    {
      "id": "f52dfe32-f169-44c4-b49b-6a97c92c2088",
      "at": "2026-10-28T10:15:57.027521Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "28186d3d-af5a-40b2-89e0-94f7278aa7aa",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d08211de-91e7-4cf1-8d51-47f062b64ee6",
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
  "last_heartbeat_at": "2026-10-28T10:15:55.527154Z",
  "last_location_at": "2026-10-28T10:15:55.527154Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d08211de-91e7-4cf1-8d51-47f062b64ee6/close` → **200**

```json
{
  "command_id": "306996ef-5e32-495d-af3b-795dd92c6094",
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

Done: card order 28186d3d-af5a-40b2-89e0-94f7278aa7aa.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731797602",
  "device_ref": "sandbox-31997"
}
```

```json
{
  "challenge_id": "01b7b9cb-7e34-46f9-932e-1037d1bc22e2",
  "expires_at": "2026-10-28T10:21:03.679433442Z",
  "resend_available_at": "2026-10-28T10:16:04.679433442Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380731797602` → **200**

```json
{
  "phone": "+380731797602",
  "audience": "CLIENT",
  "code": "004262",
  "sent_at": "2026-10-28T10:16:03.681687791Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "01b7b9cb-7e34-46f9-932e-1037d1bc22e2",
  "code": "004262",
  "device_ref": "sandbox-31997"
}
```

```json
{
  "session_id": "8cce86ae-caa3-4164-992c-01fde67cdac0",
  "subject": {
    "type": "CLIENT",
    "id": "1e2ee61a-77c5-4d3f-adaf-457263330bad"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZTJlZTYxYS03N2M1LTRkM2YtYWRhZi00NTcyNjMzMzBiYWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNDYzLCJpYXQiOjE3OTMxODI1NjMsImp0aSI6ImYyOTAzM2I5LWEyNzItNDY5My04ZjdjLTNiNzA3ZTQxYzI4ZiIsInNpZCI6IjhjY2U4NmFlLWNhYTMtNDE2NC05OTJjLTAxZmRlNjdjZGFjMCJ9.WaigxEc1oi1VxS7-YCb0u7fLyVhNX26yQTWb6TtOuRg",
  "access_expires_at": "2026-10-28T10:31:03.87467596Z",
  "refresh_token": "JHwO6xoXVkdgYPrSktvipR7jtcKH89EsStpt6cT9juY",
  "refresh_expires_at": "2026-11-27T10:16:03.87426776Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "1674e5a7-524f-40e9-b1a0-98ea4517e6bb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "1e5be577-bca5-46fb-93cc-a2471627e539",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-1e5be577-bca5-46fb-93cc-a2471627e539",
    "orderDate": "1793182564",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "e79a29bf9201b97bac9bca4ee20c32c4",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=1e5be577-bca5-46fb-93cc-a2471627e539",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731797602"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=1e5be577-bca5-46fb-93cc-a2471627e539",
  "created_at": "2026-10-28T10:16:04.04863Z",
  "expires_at": "2026-10-28T10:46:04.04863Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/1e5be577-bca5-46fb-93cc-a2471627e539` → **200**

```json
{
  "id": "1e5be577-bca5-46fb-93cc-a2471627e539",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T10:16:04.04863Z",
  "expires_at": "2026-10-28T10:46:04.04863Z",
  "completed_at": "2026-10-28T10:16:04.228056Z",
  "masked_pan": "41****6337",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "1e2ee61a-77c5-4d3f-adaf-457263330bad",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "1e2ee61a-77c5-4d3f-adaf-457263330bad",
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
      "id": "1150673e-4e67-4f6f-922b-4b820eded014",
      "at": "2026-10-28T10:16:05.107916Z",
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
  "client_id": "1e2ee61a-77c5-4d3f-adaf-457263330bad",
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
      "id": "1150673e-4e67-4f6f-922b-4b820eded014",
      "at": "2026-10-28T10:16:05.107916Z",
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
  "device_ref": "sandbox-5696"
}
```

```json
{
  "challenge_id": "3e9d8b82-e931-4ffc-850e-9dc05657666a",
  "expires_at": "2026-10-28T10:21:05.996353992Z",
  "resend_available_at": "2026-10-28T10:16:06.996353992Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "210563",
  "sent_at": "2026-10-28T10:16:05.998468075Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3e9d8b82-e931-4ffc-850e-9dc05657666a",
  "code": "210563",
  "device_ref": "sandbox-5696"
}
```

```json
{
  "session_id": "3d4805fb-def4-4815-92d9-a66364d80359",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzQ2NiwiaWF0IjoxNzkzMTgyNTY2LCJqdGkiOiI0MzRiZjYxNC1mMTI4LTRlZGQtOTUwMS1kMTRjMjcyYTY1MzIiLCJzaWQiOiIzZDQ4MDVmYi1kZWY0LTQ4MTUtOTJkOS1hNjYzNjRkODAzNTkifQ.ZujSULFOmF5qpKa1EcnnXcWwov0p6sp2jhERQt_WI1w",
  "access_expires_at": "2026-10-28T10:31:06.188467273Z",
  "refresh_token": "a-l7C3WgpZtAXIZ2i570hwX2CbvSCz9mWjN6Cy88hAw",
  "refresh_expires_at": "2026-11-27T10:16:06.188010378Z",
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
  "command_id": "4d831b93-8456-4b6d-a7ff-c9c10ae000ee",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "6e42947a-98b4-4d2b-8def-727d3c522980",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-6e42947a-98b4-4d2b-8def-727d3c522980",
    "orderDate": "1793182566",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "434d025c47ff4091beb9d7671c69c14b",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=6e42947a-98b4-4d2b-8def-727d3c522980",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=6e42947a-98b4-4d2b-8def-727d3c522980",
  "created_at": "2026-10-28T10:16:06.53774Z",
  "expires_at": "2026-10-28T10:46:06.53774Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/6e42947a-98b4-4d2b-8def-727d3c522980` → **200**

```json
{
  "id": "6e42947a-98b4-4d2b-8def-727d3c522980",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T10:16:06.53774Z",
  "expires_at": "2026-10-28T10:46:06.53774Z",
  "completed_at": "2026-10-28T10:16:06.714141Z",
  "masked_pan": "41****4437",
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
      "id": "676dcd20-a21b-4c62-b312-8df8f051fcc5",
      "at": "2026-10-28T10:16:07.117544Z",
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
  "command_id": "577cda07-193a-4012-b7fe-7cd5c26c35de",
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
  "correlation_id": "0e8cb85a-78c9-41d2-9c4c-b4d1123c1f78"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675632719",
  "device_ref": "sandbox-31390"
}
```

```json
{
  "challenge_id": "74373208-6dca-43fb-91eb-4015c9474499",
  "expires_at": "2026-10-28T10:21:08.432971478Z",
  "resend_available_at": "2026-10-28T10:16:09.432971478Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675632719` → **200**

```json
{
  "phone": "+380675632719",
  "audience": "CLIENT",
  "code": "336618",
  "sent_at": "2026-10-28T10:16:08.434882529Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "74373208-6dca-43fb-91eb-4015c9474499",
  "code": "336618",
  "device_ref": "sandbox-31390"
}
```

```json
{
  "session_id": "d9283ff4-af14-4e00-9e6b-57b6b343daab",
  "subject": {
    "type": "CLIENT",
    "id": "cee8c23b-9dbf-4534-8468-c9caccf42d44"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZWU4YzIzYi05ZGJmLTQ1MzQtODQ2OC1jOWNhY2NmNDJkNDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNDY4LCJpYXQiOjE3OTMxODI1NjgsImp0aSI6ImFkYTBlNzIwLTYzMGItNDg4My1iNWRhLWY5MjRiMDc0NTcyNiIsInNpZCI6ImQ5MjgzZmY0LWFmMTQtNGUwMC05ZTZiLTU3YjZiMzQzZGFhYiJ9.qab6T5DLeWdwEH_51VxpEHsWPAIAE8HKLAmXHD1P5uA",
  "access_expires_at": "2026-10-28T10:31:08.623049591Z",
  "refresh_token": "52L-ws3tiCTqeGwWrH335AvpRamsfuE99zZlhf48-NY",
  "refresh_expires_at": "2026-11-27T10:16:08.622653303Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "cee8c23b-9dbf-4534-8468-c9caccf42d44",
  "session_id": "d9283ff4-af14-4e00-9e6b-57b6b343daab",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "576cdaa5-1a1f-4c67-ba84-94c5efbda7d6",
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
  "id": "95fb901e-2496-4222-a82d-f4d610f9d69e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:21:08.958790Z",
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
      "id": "f7f16c43-060d-461d-837c-aecb1196ccc0",
      "name": "Осінь −10 %",
      "kind": "DISCOUNT",
      "value_type": "PERCENT",
      "value": 1000,
      "discount_minor": 1052
    }
  ]
}
```

## Step one: a code to confirm the deletion (a sign-in code would not do)

`POST /api/rider/v1/me/deletion-request/challenge` → **201**

```json
{
  "challenge_id": "6c0a6de3-14ac-4865-b339-8465983c1855",
  "expires_at": "2026-10-28T10:21:11.131202546Z",
  "resend_available_at": "2026-10-28T10:16:12.131202546Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675632719` → **200**

```json
{
  "phone": "+380675632719",
  "audience": "CLIENT",
  "code": "067008",
  "sent_at": "2026-10-28T10:16:11.133087698Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "77669530-6550-4e9f-82d5-e3a33f709d7f",
  "challenge_id": "6c0a6de3-14ac-4865-b339-8465983c1855",
  "otp_code": "067008"
}
```

```json
{
  "client_id": "cee8c23b-9dbf-4534-8468-c9caccf42d44",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T10:16:11.327842781Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "c8432c3c-1577-4070-8877-af931437f82a",
  "quote_id": "95fb901e-2496-4222-a82d-f4d610f9d69e",
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
  "correlation_id": "cc29dc64-f406-4591-a3d6-316e1b413f62"
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
  "session_id": "bd15e7f8-dcbe-490f-a4b7-15542be8640d",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM0NzEsImlhdCI6MTc5MzE4MjU3MSwianRpIjoiMTY4NGNiYTgtZjM4MC00YTUxLWE5NDYtN2IwZTg3NGVlZmJkIiwic2lkIjoiYmQxNWU3ZjgtZGNiZS00OTBmLWE0YjctMTU1NDJiZTg2NDBkIn0.OVdG6bG8HPE9d9rj480jvZkpkatyXmnYrngCZR5mKPY",
  "access_expires_at": "2026-10-28T10:31:11.871386869Z",
  "refresh_token": "jLZHzznA7xLgkdlDUzJc3D1L0l_ENrOhq8N6qTCjkLc",
  "refresh_expires_at": "2026-10-28T22:16:11.870964592Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "cee8c23b-9dbf-4534-8468-c9caccf42d44",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T10:16:11.327843Z",
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

`POST /api/admin/v1/client-deletions/cee8c23b-9dbf-4534-8468-c9caccf42d44/complete` → **200**

```json
{
  "command_id": "9f6213ad-937d-4090-8c2b-ea3f11a25dff",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "cee8c23b-9dbf-4534-8468-c9caccf42d44",
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
  "correlation_id": "4894ba20-c725-4e5e-8c5e-61de6e5bc4e8"
}
```

Done: client cee8c23b-9dbf-4534-8468-c9caccf42d44 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668268122",
  "device_ref": "sandbox-3542"
}
```

```json
{
  "challenge_id": "25209172-cb7b-4d30-b2d2-cabff003fe84",
  "expires_at": "2026-10-28T10:21:12.573305208Z",
  "resend_available_at": "2026-10-28T10:16:13.573305208Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668268122` → **200**

```json
{
  "phone": "+380668268122",
  "audience": "CLIENT",
  "code": "490765",
  "sent_at": "2026-10-28T10:16:12.575512766Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "25209172-cb7b-4d30-b2d2-cabff003fe84",
  "code": "490765",
  "device_ref": "sandbox-3542"
}
```

```json
{
  "session_id": "acc36ac9-ffaa-46db-9d2c-99651c9d02cd",
  "subject": {
    "type": "CLIENT",
    "id": "5124ab55-c70c-481a-9e1b-cd62cfee36e7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MTI0YWI1NS1jNzBjLTQ4MWEtOWUxYi1jZDYyY2ZlZTM2ZTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNDcyLCJpYXQiOjE3OTMxODI1NzIsImp0aSI6IjQ2ODM3N2NlLTAxZWQtNDM3YS1iNjE0LWRjM2Q0MTQ5NDg1ZCIsInNpZCI6ImFjYzM2YWM5LWZmYWEtNDZkYi05ZDJjLTk5NjUxYzlkMDJjZCJ9.1Rx_TV5uodzN9rBwPgj-zq5nk4Ti8A-RbdL8OWiag9M",
  "access_expires_at": "2026-10-28T10:31:12.760425057Z",
  "refresh_token": "vvLo3V4e4W3knOO2uFw6jya77d_xYDq2ucTtPDsaObk",
  "refresh_expires_at": "2026-11-27T10:16:12.760045415Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "5124ab55-c70c-481a-9e1b-cd62cfee36e7",
  "session_id": "acc36ac9-ffaa-46db-9d2c-99651c9d02cd",
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
  "session_id": "54e3c161-efd5-425f-a253-c00285280626",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM0NzMsImlhdCI6MTc5MzE4MjU3MywianRpIjoiMjllZDFhOGItNzdhMi00MTdkLWIxZWYtMmVkNWE1NzlkYjdlIiwic2lkIjoiNTRlM2MxNjEtZWZkNS00MjVmLWEyNTMtYzAwMjg1MjgwNjI2In0.RwXnYYVMqUxV6ojTmE9jaOxDjhTObZ6Pj2gFQTBEgIk",
  "access_expires_at": "2026-10-28T10:31:13.283895468Z",
  "refresh_token": "vC7T7Go0cbpBG2LONXgODrS8MGgpW4ddd-u1S0xR0m0",
  "refresh_expires_at": "2026-10-28T22:16:13.283535185Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=8268122&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "5124ab55-c70c-481a-9e1b-cd62cfee36e7",
      "phone": "+380668268122",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T10:16:12.758067Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/5124ab55-c70c-481a-9e1b-cd62cfee36e7` → **200**

```json
{
  "client": {
    "id": "5124ab55-c70c-481a-9e1b-cd62cfee36e7",
    "phone": "+380668268122",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T10:16:12.758067Z",
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

`POST /api/admin/v1/clients/5124ab55-c70c-481a-9e1b-cd62cfee36e7/block` → **400**

```json
{
  "command_id": "b6931924-6a03-41a9-bf71-cd5c11e660cf",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/5124ab55-c70c-481a-9e1b-cd62cfee36e7/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "1cb59df0-dc86-42c8-a0dd-16e97900321f",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/5124ab55-c70c-481a-9e1b-cd62cfee36e7/block` → **200**

```json
{
  "command_id": "ce844f79-0b73-4163-a29f-0289282bbe83",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "5124ab55-c70c-481a-9e1b-cd62cfee36e7",
  "phone": "+380668268122",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T10:16:12.758067Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T10:16:14.025453Z",
    "by": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
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
  "correlation_id": "345b8126-cfed-4c0f-aab7-4d37a9c3f6b7"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668268122",
  "device_ref": "sandbox-28748"
}
```

```json
{
  "challenge_id": "c0b5cd1e-08bc-43a0-ade7-dd223770025f",
  "expires_at": "2026-10-28T10:21:16.367792927Z",
  "resend_available_at": "2026-10-28T10:16:17.367792927Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668268122` → **200**

```json
{
  "phone": "+380668268122",
  "audience": "CLIENT",
  "code": "697116",
  "sent_at": "2026-10-28T10:16:16.369750788Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "c0b5cd1e-08bc-43a0-ade7-dd223770025f",
  "code": "697116",
  "device_ref": "sandbox-28748"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "1128a1e2-106d-48a7-879d-21a6b2852fc1"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/5124ab55-c70c-481a-9e1b-cd62cfee36e7` → **200**

```json
{
  "client": {
    "id": "5124ab55-c70c-481a-9e1b-cd62cfee36e7",
    "phone": "+380668268122",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T10:16:12.758067Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T10:16:14.025453Z",
      "by": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
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

`POST /api/admin/v1/clients/5124ab55-c70c-481a-9e1b-cd62cfee36e7/unblock` → **200**

```json
{
  "command_id": "59b5947e-5d84-4ff0-bbcc-2d6f8e76f001",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "5124ab55-c70c-481a-9e1b-cd62cfee36e7",
  "phone": "+380668268122",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T10:16:12.758067Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668268122",
  "device_ref": "sandbox-18038"
}
```

```json
{
  "challenge_id": "5c68021b-0c60-41cc-a5d4-f0a7ee428c11",
  "expires_at": "2026-10-28T10:21:19.089543428Z",
  "resend_available_at": "2026-10-28T10:16:20.089543428Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668268122` → **200**

```json
{
  "phone": "+380668268122",
  "audience": "CLIENT",
  "code": "854729",
  "sent_at": "2026-10-28T10:16:19.091194938Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5c68021b-0c60-41cc-a5d4-f0a7ee428c11",
  "code": "854729",
  "device_ref": "sandbox-18038"
}
```

```json
{
  "session_id": "f614481b-3669-4955-9af6-ef03b9c27408",
  "subject": {
    "type": "CLIENT",
    "id": "5124ab55-c70c-481a-9e1b-cd62cfee36e7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MTI0YWI1NS1jNzBjLTQ4MWEtOWUxYi1jZDYyY2ZlZTM2ZTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNDc5LCJpYXQiOjE3OTMxODI1NzksImp0aSI6ImM3MTY4OWQxLWU4NzYtNDQ4MS05ZGFlLWE0YTdiZDFkODBmMiIsInNpZCI6ImY2MTQ0ODFiLTM2NjktNDk1NS05YWY2LWVmMDNiOWMyNzQwOCJ9.T3smMYMrek8LUMSEKeoycDsYNHXiPguKOwvsD_-luwY",
  "access_expires_at": "2026-10-28T10:31:19.284329843Z",
  "refresh_token": "4qtJFlot8eLekxWJMVozBeUwUuRM1EFZRKk9_62TCE8",
  "refresh_expires_at": "2026-11-27T10:16:19.283795523Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "5124ab55-c70c-481a-9e1b-cd62cfee36e7",
  "session_id": "f614481b-3669-4955-9af6-ef03b9c27408",
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
  "phone": "+380664978068",
  "device_ref": "sandbox-404"
}
```

```json
{
  "challenge_id": "60e8e5f1-320c-4b3b-b36d-3a0fd08145bc",
  "expires_at": "2026-10-28T10:21:19.637755654Z",
  "resend_available_at": "2026-10-28T10:16:20.637755654Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664978068` → **200**

```json
{
  "phone": "+380664978068",
  "audience": "CLIENT",
  "code": "753605",
  "sent_at": "2026-10-28T10:16:19.63952037Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "60e8e5f1-320c-4b3b-b36d-3a0fd08145bc",
  "code": "753605",
  "device_ref": "sandbox-404"
}
```

```json
{
  "session_id": "31db5eab-d155-47de-b065-fe28855b55bc",
  "subject": {
    "type": "CLIENT",
    "id": "e76fce12-f355-465c-9092-a2d751d745f2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzZmY2UxMi1mMzU1LTQ2NWMtOTA5Mi1hMmQ3NTFkNzQ1ZjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNDc5LCJpYXQiOjE3OTMxODI1NzksImp0aSI6IjhiMWZmYmRkLTk4OTMtNDZlYS1iM2FmLTM2NGQwODhkMzIzMCIsInNpZCI6IjMxZGI1ZWFiLWQxNTUtNDdkZS1iMDY1LWZlMjg4NTViNTViYyJ9.mkI4fRLQeEpCzSqoqsNodcep7XocDLP8sa3_To4_I4Q",
  "access_expires_at": "2026-10-28T10:31:19.827667346Z",
  "refresh_token": "EnE_rLfeVdmhzIFHu641NYqKgjxA8XRakjGAfcVyii8",
  "refresh_expires_at": "2026-11-27T10:16:19.827323628Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "17b4097b-1c03-4346-8412-1c5a65ca38d4",
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
  "id": "3d4db973-6e97-4bf9-93fc-5d2b4d2c20bb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:21:20.000099Z",
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
      "id": "f7f16c43-060d-461d-837c-aecb1196ccc0",
      "name": "Осінь −10 %",
      "kind": "DISCOUNT",
      "value_type": "PERCENT",
      "value": 1000,
      "discount_minor": 1052
    }
  ]
}
```

`POST /api/rider/v1/orders` (X-Correlation-Id: e06eb162-a2b4-4afd-af8e-09911a158fae) → **201**

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
  "session_id": "52683c25-454d-4b65-b9a0-dfa3e729bc60",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM0ODAsImlhdCI6MTc5MzE4MjU4MCwianRpIjoiYjEwMjZkNmQtYTU1YS00ZDYzLTlmNTAtNmEyY2M3MTA1ZTZjIiwic2lkIjoiNTI2ODNjMjUtNDU0ZC00YjY1LWI5YTAtZGZhM2U3MjliYzYwIn0.o7mPnMCdwx9xGjcUkYnQsdnsartPs15scIT6127Iiz4",
  "access_expires_at": "2026-10-28T10:31:20.403396943Z",
  "refresh_token": "4SbtUwxZV6E7Ln2wrRHMtPgFOH73et9d9jtcxU2pi9M",
  "refresh_expires_at": "2026-10-28T22:16:20.403059644Z",
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
  "session_id": "f33afd1b-1bae-4b75-b444-4184ef52fe72",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM0ODAsImlhdCI6MTc5MzE4MjU4MCwianRpIjoiYWE5Yzk0ZTQtNjA4Ny00Mjg0LWI2NzktODY3ZjI5ZmQ2ODA0Iiwic2lkIjoiZjMzYWZkMWItMWJhZS00Yjc1LWI0NDQtNDE4NGVmNTJmZTcyIn0.B8lG-zzoWpdfgsy88inKmB-iYJlsgCoSiOskCV8QFn4",
  "access_expires_at": "2026-10-28T10:31:20.75930811Z",
  "refresh_token": "4Viioya0f_YAfpoQx-R-0eHShio-JjBmjlAPii3IkCI",
  "refresh_expires_at": "2026-10-28T22:16:20.758913455Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a2814663-7e48-4d63-8239-a11f43c397ad/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:16:20.1791Z",
      "actor": {
        "type": "CLIENT",
        "id": "e76fce12-f355-465c-9092-a2d751d745f2",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a2814663-7e48-4d63-8239-a11f43c397ad",
        "quote_id": "3d4db973-6e97-4bf9-93fc-5d2b4d2c20bb",
        "price_minor": 10517,
        "discount_minor": 1052,
        "payment_method": "CASH"
      },
      "correlation_id": "e06eb162-a2b4-4afd-af8e-09911a158fae"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:16:20.180352Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a2814663-7e48-4d63-8239-a11f43c397ad",
        "attempt_id": "49bd7ae5-3d74-42e2-a570-e9d79f54e5ae",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "e06eb162-a2b4-4afd-af8e-09911a158fae"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T10:16:20.187248Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a2814663-7e48-4d63-8239-a11f43c397ad",
        "attempt_id": "49bd7ae5-3d74-42e2-a570-e9d79f54e5ae"
      },
      "correlation_id": "e06eb162-a2b4-4afd-af8e-09911a158fae"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "49bd7ae5-3d74-42e2-a570-e9d79f54e5ae",
        "generation": 1,
        "started_at": "2026-10-28T10:16:20.17962Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T10:16:20.187248Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T10:16:20.181204Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/e06eb162-a2b4-4afd-af8e-09911a158fae` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "a2814663-7e48-4d63-8239-a11f43c397ad:0",
      "order_id": "a2814663-7e48-4d63-8239-a11f43c397ad",
      "at": "2026-10-28T10:16:20.1791Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "a2814663-7e48-4d63-8239-a11f43c397ad:1",
      "order_id": "a2814663-7e48-4d63-8239-a11f43c397ad",
      "at": "2026-10-28T10:16:20.180352Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "a2814663-7e48-4d63-8239-a11f43c397ad:2",
      "order_id": "a2814663-7e48-4d63-8239-a11f43c397ad",
      "at": "2026-10-28T10:16:20.187248Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/acfda385-f9ba-4c18-813d-cf4fb212c3b3` → **200**

```json
{
  "found": []
}
```

Done: request e06eb162-a2b4-4afd-af8e-09911a158fae — order a2814663-7e48-4d63-8239-a11f43c397ad found by its id.

`GET /api/rider/v1/orders/a2814663-7e48-4d63-8239-a11f43c397ad` → **200**

```json
{
  "id": "a2814663-7e48-4d63-8239-a11f43c397ad",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e76fce12-f355-465c-9092-a2d751d745f2",
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
  "created_at": "2026-10-28T10:16:20.178594Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 1052
}
```

`POST /api/rider/v1/orders/a2814663-7e48-4d63-8239-a11f43c397ad/cancel` → **200**

```json
{
  "command_id": "4fc4d8e3-d6a7-40d7-b67e-a903feea0ef0",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a2814663-7e48-4d63-8239-a11f43c397ad",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e76fce12-f355-465c-9092-a2d751d745f2",
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
  "created_at": "2026-10-28T10:16:20.178594Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 1052
}
```

# Scenario: data-export

## A rider signs in and asks for a code to confirm the copy

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636438323",
  "device_ref": "sandbox-1508"
}
```

```json
{
  "challenge_id": "1092bf12-23e3-4f10-8d02-7016eac29f10",
  "expires_at": "2026-10-28T10:21:21.81077638Z",
  "resend_available_at": "2026-10-28T10:16:22.81077638Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636438323` → **200**

```json
{
  "phone": "+380636438323",
  "audience": "CLIENT",
  "code": "177191",
  "sent_at": "2026-10-28T10:16:21.812788749Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1092bf12-23e3-4f10-8d02-7016eac29f10",
  "code": "177191",
  "device_ref": "sandbox-1508"
}
```

```json
{
  "session_id": "2e02cee2-5212-4f60-b893-361e9b6a656b",
  "subject": {
    "type": "CLIENT",
    "id": "9fcd3d54-dbe1-44fa-b9d1-cc7a6352a2fe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmNkM2Q1NC1kYmUxLTQ0ZmEtYjlkMS1jYzdhNjM1MmEyZmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNDgyLCJpYXQiOjE3OTMxODI1ODIsImp0aSI6IjExODhkN2FiLWVkMmEtNDA5YS05OWY1LTdmYWNhNjQ5NjI2NyIsInNpZCI6IjJlMDJjZWUyLTUyMTItNGY2MC1iODkzLTM2MWU5YjZhNjU2YiJ9.2pg2PbAYs35mDOLn-2tQWSmZjd2xyD2-CazBCHtSta0",
  "access_expires_at": "2026-10-28T10:31:22.002492948Z",
  "refresh_token": "ybIfJd-URw7yA_pMsbynoGeO4Ld13SKGUmaGAEpqhys",
  "refresh_expires_at": "2026-11-27T10:16:22.00216209Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "5fc9c6c3-5f66-4efe-a82b-9bf23adea5ee",
  "expires_at": "2026-10-28T10:21:24.168646192Z",
  "resend_available_at": "2026-10-28T10:16:25.168646192Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636438323` → **200**

```json
{
  "phone": "+380636438323",
  "audience": "CLIENT",
  "code": "816960",
  "sent_at": "2026-10-28T10:16:24.170122538Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "b587f241-0252-425f-856e-c2e8c7e99e03",
  "challenge_id": "5fc9c6c3-5f66-4efe-a82b-9bf23adea5ee",
  "otp_code": "816960"
}
```

```json
{
  "id": "82d8c915-674b-46a2-a282-0cfe0a59e829",
  "state": "PENDING",
  "created_at": "2026-10-28T10:16:24.369826Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/82d8c915-674b-46a2-a282-0cfe0a59e829` → **200**

```json
{
  "id": "82d8c915-674b-46a2-a282-0cfe0a59e829",
  "state": "PENDING",
  "created_at": "2026-10-28T10:16:24.369826Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/82d8c915-674b-46a2-a282-0cfe0a59e829` → **200**

```json
{
  "id": "82d8c915-674b-46a2-a282-0cfe0a59e829",
  "state": "PENDING",
  "created_at": "2026-10-28T10:16:24.369826Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/82d8c915-674b-46a2-a282-0cfe0a59e829` → **200**

```json
{
  "id": "82d8c915-674b-46a2-a282-0cfe0a59e829",
  "state": "PENDING",
  "created_at": "2026-10-28T10:16:24.369826Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/82d8c915-674b-46a2-a282-0cfe0a59e829` → **200**

```json
{
  "id": "82d8c915-674b-46a2-a282-0cfe0a59e829",
  "state": "PENDING",
  "created_at": "2026-10-28T10:16:24.369826Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/82d8c915-674b-46a2-a282-0cfe0a59e829` → **200**

```json
{
  "id": "82d8c915-674b-46a2-a282-0cfe0a59e829",
  "state": "PENDING",
  "created_at": "2026-10-28T10:16:24.369826Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/82d8c915-674b-46a2-a282-0cfe0a59e829` → **200**

```json
{
  "id": "82d8c915-674b-46a2-a282-0cfe0a59e829",
  "state": "PENDING",
  "created_at": "2026-10-28T10:16:24.369826Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/82d8c915-674b-46a2-a282-0cfe0a59e829` → **200**

```json
{
  "id": "82d8c915-674b-46a2-a282-0cfe0a59e829",
  "state": "PENDING",
  "created_at": "2026-10-28T10:16:24.369826Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/82d8c915-674b-46a2-a282-0cfe0a59e829` → **200**

```json
{
  "id": "82d8c915-674b-46a2-a282-0cfe0a59e829",
  "state": "PENDING",
  "created_at": "2026-10-28T10:16:24.369826Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/82d8c915-674b-46a2-a282-0cfe0a59e829` → **200**

```json
{
  "id": "82d8c915-674b-46a2-a282-0cfe0a59e829",
  "state": "READY",
  "created_at": "2026-10-28T10:16:24.369826Z",
  "ready_at": "2026-10-28T10:16:32.791702Z",
  "expires_at": "2026-11-04T10:16:32.791702Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/82d8c915-674b-46a2-a282-0cfe0a59e829/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635600348",
  "device_ref": "sandbox-24855"
}
```

```json
{
  "challenge_id": "eb2073ee-ebd0-4fb5-bb82-2a27951b4b40",
  "expires_at": "2026-10-28T10:21:34.111294333Z",
  "resend_available_at": "2026-10-28T10:16:35.111294333Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635600348` → **200**

```json
{
  "phone": "+380635600348",
  "audience": "CLIENT",
  "code": "225335",
  "sent_at": "2026-10-28T10:16:34.11336512Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eb2073ee-ebd0-4fb5-bb82-2a27951b4b40",
  "code": "225335",
  "device_ref": "sandbox-24855"
}
```

```json
{
  "session_id": "5c941930-72b7-43e9-99b5-195c17cfd1c6",
  "subject": {
    "type": "CLIENT",
    "id": "d377e7c6-c05d-4a7b-91bd-4721c07b041d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzc3ZTdjNi1jMDVkLTRhN2ItOTFiZC00NzIxYzA3YjA0MWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNDk0LCJpYXQiOjE3OTMxODI1OTQsImp0aSI6ImI4NjhmMjUwLTBmMWQtNDU4ZS1iNGU2LTlmYzNkMmQ4MzdlZSIsInNpZCI6IjVjOTQxOTMwLTcyYjctNDNlOS05OWI1LTE5NWMxN2NmZDFjNiJ9.rtGxx0LMl-3moCBOhx4frGJIYCDIT-BMwa91yZ7C5AM",
  "access_expires_at": "2026-10-28T10:31:34.302625171Z",
  "refresh_token": "NxDAP-C2O6rKWRIxJONotRAQU1XzFgmp107mR-EFMY0",
  "refresh_expires_at": "2026-11-27T10:16:34.302121833Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/82d8c915-674b-46a2-a282-0cfe0a59e829/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/82d8c915-674b-46a2-a282-0cfe0a59e829/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "01a93f5c-9391-454d-9793-ebd73db17c44"
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
  "session_id": "7fa830e9-94c0-4264-a0bf-0b4acea9adc3",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM0OTQsImlhdCI6MTc5MzE4MjU5NCwianRpIjoiNTIzODY2OTItM2U4Zi00YmYxLThmZmItNmQxZGYyZjYzMjMzIiwic2lkIjoiN2ZhODMwZTktOTRjMC00MjY0LWEwYmYtMGI0YWNlYTlhZGMzIn0.C53YDeZ8wvZmOP45OkHZHnA-UN4mZeVzFY3pDXeTcQ8",
  "access_expires_at": "2026-10-28T10:31:34.835101232Z",
  "refresh_token": "j-VR2cbLzRfXG6WEupHz6guehasBngY1sr4mfoam0vI",
  "refresh_expires_at": "2026-10-28T22:16:34.834709802Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9fcd3d54-dbe1-44fa-b9d1-cc7a6352a2fe",
  "session_id": "2e02cee2-5212-4f60-b893-361e9b6a656b",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/9fcd3d54-dbe1-44fa-b9d1-cc7a6352a2fe/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "82d8c915-674b-46a2-a282-0cfe0a59e829",
      "state": "READY",
      "created_at": "2026-10-28T10:16:24.369826Z",
      "ready_at": "2026-10-28T10:16:32.791702Z",
      "expires_at": "2026-11-04T10:16:32.791702Z",
      "size_bytes": 1031
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
  "device_ref": "sandbox-10443"
}
```

```json
{
  "challenge_id": "5ae02261-29f2-4dc9-a9eb-a8b632efc749",
  "expires_at": "2026-10-28T10:21:35.346748032Z",
  "resend_available_at": "2026-10-28T10:16:36.346748032Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "066471",
  "sent_at": "2026-10-28T10:16:35.348617486Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5ae02261-29f2-4dc9-a9eb-a8b632efc749",
  "code": "066471",
  "device_ref": "sandbox-10443"
}
```

```json
{
  "session_id": "1fb0593b-8a3f-410e-85e7-d72a2a818153",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzQ5NSwiaWF0IjoxNzkzMTgyNTk1LCJqdGkiOiI3ZWVkOTdkNi1mNTkyLTQ2ZWUtYWRmYS1lNzA2NTZhMjU0OTIiLCJzaWQiOiIxZmIwNTkzYi04YTNmLTQxMGUtODVlNy1kNzJhMmE4MTgxNTMifQ.SZuiGGBRJX1WjYgyOY8FTVhc6mGpg3rrrWnJ3UoMCWc",
  "access_expires_at": "2026-10-28T10:31:35.534412713Z",
  "refresh_token": "DTKam1Dw1eH03I0-XesqpMPDc91fKdWUjSH3sT5OTXo",
  "refresh_expires_at": "2026-11-27T10:16:35.5339955Z",
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
  "device_ref": "sandbox-31347"
}
```

```json
{
  "challenge_id": "b723dc70-f5c7-4495-a6f3-067495734cb4",
  "expires_at": "2026-10-28T10:21:35.87397997Z",
  "resend_available_at": "2026-10-28T10:16:36.87397997Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "848078",
  "sent_at": "2026-10-28T10:16:35.875889387Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b723dc70-f5c7-4495-a6f3-067495734cb4",
  "code": "848078",
  "device_ref": "sandbox-31347"
}
```

```json
{
  "session_id": "fa9dd8a0-de5e-440a-8cc9-7b629f62cdc8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzQ5NiwiaWF0IjoxNzkzMTgyNTk2LCJqdGkiOiIyNTU3MGE4OC1lYzBmLTRjMWQtYjBmYi05ZjA3ZTdkYTg4ZjkiLCJzaWQiOiJmYTlkZDhhMC1kZTVlLTQ0MGEtOGNjOS03YjYyOWY2MmNkYzgifQ.2shpooKEODKPMEmDtsyG1iMG3NgxPOyC3YTAbdITAlE",
  "access_expires_at": "2026-10-28T10:31:36.07178367Z",
  "refresh_token": "QyLbwte4SYtyFsEySiB-B6MTm7M_NrJHoAnMQw-rB14",
  "refresh_expires_at": "2026-11-27T10:16:36.071429366Z",
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
  "command_id": "0ab4237a-dd93-4b74-adc6-78f61a659e92",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:16:36Z",
    "sequence": 1793182596405
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c2432fe8-0857-493b-9948-6ed7fc91bdab",
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
  "last_heartbeat_at": "2026-10-28T10:16:36.42175Z",
  "last_location_at": "2026-10-28T10:16:36.42175Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-18593"
}
```

```json
{
  "challenge_id": "cb1c66d7-9a8f-42b8-94de-58ddcf7cf061",
  "expires_at": "2026-10-28T10:21:36.592304165Z",
  "resend_available_at": "2026-10-28T10:16:37.592304165Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "144721",
  "sent_at": "2026-10-28T10:16:36.594081273Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cb1c66d7-9a8f-42b8-94de-58ddcf7cf061",
  "code": "144721",
  "device_ref": "sandbox-18593"
}
```

```json
{
  "session_id": "c70a2865-3ea5-450b-9ebb-285bafb24f94",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzQ5NiwiaWF0IjoxNzkzMTgyNTk2LCJqdGkiOiI2ZjQ3NjRlNy1kMzAyLTQ3MjUtYWNlOS04NjYzODAyMTVhNzQiLCJzaWQiOiJjNzBhMjg2NS0zZWE1LTQ1MGItOWViYi0yODViYWZiMjRmOTQifQ.FX29NTeHgKCxQX4u4Tqiz2QbkxaoedJGuAmJ6OxFTzY",
  "access_expires_at": "2026-10-28T10:31:36.796451711Z",
  "refresh_token": "1kQAIPM8vfW1nzm3ACk9l_fDJ6C2y01H99N1fylwGFo",
  "refresh_expires_at": "2026-11-27T10:16:36.795907697Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "750eafa9-ee0a-4e42-925c-d7d9f42acb94",
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
  "last_heartbeat_at": "2026-10-28T10:15:48.043451Z",
  "last_location_at": "2026-10-28T10:15:48.043451Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/750eafa9-ee0a-4e42-925c-d7d9f42acb94/handover` → **200**

```json
{
  "command_id": "4b9d9a10-f906-4bb6-8fb2-2c41a0d728f4",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "750eafa9-ee0a-4e42-925c-d7d9f42acb94",
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
  "last_heartbeat_at": "2026-10-28T10:15:48.043451Z",
  "last_location_at": "2026-10-28T10:15:48.043451Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/750eafa9-ee0a-4e42-925c-d7d9f42acb94/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:16:37Z",
    "sequence": 1793182597727
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "750eafa9-ee0a-4e42-925c-d7d9f42acb94",
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
  "last_heartbeat_at": "2026-10-28T10:16:37.7436Z",
  "last_location_at": "2026-10-28T10:16:37.7436Z",
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
  "session_id": "544b6fda-9c16-4762-95ab-795dc95949f5",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM0OTgsImlhdCI6MTc5MzE4MjU5OCwianRpIjoiNGUwYTgyNmEtZGM0ZC00Zjk5LWJjNDctZWI5NjE1ZDNmNjg4Iiwic2lkIjoiNTQ0YjZmZGEtOWMxNi00NzYyLTk1YWItNzk1ZGM5NTk0OWY1In0.DRhhTf4jnqOLHzU_EsPCOi4Fd5Zl0rzR4OqK7aHfNIY",
  "access_expires_at": "2026-10-28T10:31:38.105862323Z",
  "refresh_token": "pd-ftor_VmZKDjJ-oG5IWAPNJNobS3fTuxaALPYddOs",
  "refresh_expires_at": "2026-10-28T22:16:38.105533157Z",
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
  "session_id": "5fb29342-746c-4300-944d-b4a6d4031000",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM0OTgsImlhdCI6MTc5MzE4MjU5OCwianRpIjoiOGY1NjlmY2EtNjEwOS00OGFmLTljOWUtZjU4NThjMmJlZTVlIiwic2lkIjoiNWZiMjkzNDItNzQ2Yy00MzAwLTk0NGQtYjRhNmQ0MDMxMDAwIn0.RoZ8PPk-OWCvz5Atn5hx8WfO98Bzql_lSqkvj3Rh3qc",
  "access_expires_at": "2026-10-28T10:31:38.476545002Z",
  "refresh_token": "SWkJkj-tWddq2uHBbhOWeR7ofP0m28t4UBU6cYKBf_U",
  "refresh_expires_at": "2026-10-28T22:16:38.476158279Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380681711756",
  "device_ref": "sandbox-13437"
}
```

```json
{
  "challenge_id": "7477b2e3-b6bf-4195-b976-00279ba74f45",
  "expires_at": "2026-10-28T10:21:38.647558624Z",
  "resend_available_at": "2026-10-28T10:16:39.647558624Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380681711756` → **200**

```json
{
  "phone": "+380681711756",
  "audience": "CLIENT",
  "code": "523865",
  "sent_at": "2026-10-28T10:16:38.649388366Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7477b2e3-b6bf-4195-b976-00279ba74f45",
  "code": "523865",
  "device_ref": "sandbox-13437"
}
```

```json
{
  "session_id": "8912ff63-b879-4033-b82f-af7eb15060bf",
  "subject": {
    "type": "CLIENT",
    "id": "54a7daa1-ba28-4cc6-8178-996adb88031f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NGE3ZGFhMS1iYTI4LTRjYzYtODE3OC05OTZhZGI4ODAzMWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNDk4LCJpYXQiOjE3OTMxODI1OTgsImp0aSI6ImJkNzEyZmJkLWEyZjktNDU4Yi1iZTMyLTdmMGUyMWQwYWJhMSIsInNpZCI6Ijg5MTJmZjYzLWI4NzktNDAzMy1iODJmLWFmN2ViMTUwNjBiZiJ9.in-fx33s3-lc1DvsPriraDNs5D0tBgWUhLmV0RSmoxw",
  "access_expires_at": "2026-10-28T10:31:38.841149031Z",
  "refresh_token": "s-MzTLVaB8B_7Ic9jjCD1jtHgo3AyF2bffn8MiYwdWo",
  "refresh_expires_at": "2026-11-27T10:16:38.840631457Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4072e8c1-0ba7-4434-b41a-37846c806da5",
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
  "id": "d1bdd362-40ce-48fb-a097-c22626343c3e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:21:39.020872Z",
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
      "id": "f7f16c43-060d-461d-837c-aecb1196ccc0",
      "name": "Осінь −10 %",
      "kind": "DISCOUNT",
      "value_type": "PERCENT",
      "value": 1000,
      "discount_minor": 1052
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "10e9e929-e851-4764-b37a-3db286d44f15",
  "quote_id": "d1bdd362-40ce-48fb-a097-c22626343c3e",
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
  "id": "8261efdc-9254-4c03-8bdc-d04b6f99b47d",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a7daa1-ba28-4cc6-8178-996adb88031f",
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
  "created_at": "2026-10-28T10:16:39.21453Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 1052
}
```

## The nearest driver declines, the next one accepts

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "cfa21844-ef42-4d4f-be55-d40f01801c2c",
    "order_id": "8261efdc-9254-4c03-8bdc-d04b6f99b47d",
    "expires_at": "2026-10-28T10:16:54.217265Z",
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

`POST /api/driver/v1/offers/cfa21844-ef42-4d4f-be55-d40f01801c2c/reject` → **204**

```json
{
  "command_id": "d65f7dc3-429b-453f-9a6e-70d7c989da8a"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "500292e6-8e88-4753-a9f3-6fb3871b992d",
    "order_id": "8261efdc-9254-4c03-8bdc-d04b6f99b47d",
    "expires_at": "2026-10-28T10:16:54.574897Z",
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

`POST /api/driver/v1/offers/500292e6-8e88-4753-a9f3-6fb3871b992d/accept` → **200**

```json
{
  "command_id": "59751473-a483-462b-9ae4-aa5e5b8108b6"
}
```

```json
{
  "id": "4e7f4d7d-98c9-4763-a59c-1d858a50b077",
  "order_id": "8261efdc-9254-4c03-8bdc-d04b6f99b47d",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4d23cda8-b591-4d18-a808-059a1a2134d8",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/8261efdc-9254-4c03-8bdc-d04b6f99b47d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:16:39.215109Z",
      "actor": {
        "type": "CLIENT",
        "id": "54a7daa1-ba28-4cc6-8178-996adb88031f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "8261efdc-9254-4c03-8bdc-d04b6f99b47d",
        "quote_id": "d1bdd362-40ce-48fb-a097-c22626343c3e",
        "price_minor": 10517,
        "discount_minor": 1052,
        "payment_method": "CASH"
      },
      "correlation_id": "7d2e6766-f820-456f-adc3-bb3b5f367c60"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:16:39.216612Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8261efdc-9254-4c03-8bdc-d04b6f99b47d",
        "attempt_id": "b47ec095-39ef-4309-b3fc-56e0022f25a3",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "7d2e6766-f820-456f-adc3-bb3b5f367c60"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:16:39.221315Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "cfa21844-ef42-4d4f-be55-d40f01801c2c",
        "order_id": "8261efdc-9254-4c03-8bdc-d04b6f99b47d",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "7d2e6766-f820-456f-adc3-bb3b5f367c60"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T10:16:39.574203Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "cfa21844-ef42-4d4f-be55-d40f01801c2c",
        "order_id": "8261efdc-9254-4c03-8bdc-d04b6f99b47d"
      },
      "correlation_id": "40743925-1589-432c-822a-bad2660b45e1"
    },
    {
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 8261efdc-9254-4c03-8bdc-d04b6f99b47d — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/8261efdc-9254-4c03-8bdc-d04b6f99b47d` → **200**

```json
{
  "id": "8261efdc-9254-4c03-8bdc-d04b6f99b47d",
  "short_number": 5,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "54a7daa1-ba28-4cc6-8178-996adb88031f",
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
    "id": "4e7f4d7d-98c9-4763-a59c-1d858a50b077",
    "order_id": "8261efdc-9254-4c03-8bdc-d04b6f99b47d",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "4d23cda8-b591-4d18-a808-059a1a2134d8",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T10:16:39.21453Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

**Contract validation failed — scenario stopped.**

`POST /api/operator/v1/orders/8261efdc-9254-4c03-8bdc-d04b6f99b47d/cancel` → **400**

```json
{"command_id":"c3e980e3-6ae1-4aa7-9a2a-ce21c044e663","expected_version":,"reason_code":"NO_CARS"}
```

```json
{
  "instance": "/api/operator/v1/orders/8261efdc-9254-4c03-8bdc-d04b6f99b47d/cancel",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "3a2b96d7-c4de-4322-a535-1dd64b23a4b7"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c2432fe8-0857-493b-9948-6ed7fc91bdab",
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
  "last_heartbeat_at": "2026-10-28T10:16:36.42175Z",
  "last_location_at": "2026-10-28T10:16:36.42175Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c2432fe8-0857-493b-9948-6ed7fc91bdab/close` → **200**

```json
{
  "command_id": "8a14883b-360d-49b9-b328-a807cbeddb97",
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
  "session_id": "750eafa9-ee0a-4e42-925c-d7d9f42acb94",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T10:16:37.7436Z",
  "last_location_at": "2026-10-28T10:16:37.7436Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/750eafa9-ee0a-4e42-925c-d7d9f42acb94/close` → **200**

```json
{
  "command_id": "8834f9a4-63fa-40eb-a16a-845bbb245177",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "750eafa9-ee0a-4e42-925c-d7d9f42acb94",
  "session_version": 2,
  "session_state": "CLOSING",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T10:16:37.7436Z",
  "last_location_at": "2026-10-28T10:16:37.7436Z",
  "eligible": false,
  "ineligible_reasons": [
    "SESSION_CLOSING",
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

# Scenario: full-ride

## Start-up data for the apps

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
      "timezone": "Europe/Warsaw"
    },
    {
      "id": "5a000000-0000-4000-8000-000000000001",
      "code": "kyiv",
      "name": "Київ",
      "currency": "UAH",
      "timezone": "Europe/Kyiv"
    }
  ]
}
```

## Driver signs in and goes online 200 m from the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21410"
}
```

```json
{
  "challenge_id": "4a47e8a8-4e23-4639-98d6-4bcbf6283b87",
  "expires_at": "2026-10-28T10:21:41.394404446Z",
  "resend_available_at": "2026-10-28T10:16:42.394404446Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "388535",
  "sent_at": "2026-10-28T10:16:41.396055344Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4a47e8a8-4e23-4639-98d6-4bcbf6283b87",
  "code": "388535",
  "device_ref": "sandbox-21410"
}
```

```json
{
  "session_id": "01593679-8440-4d81-8841-fa61856eb92f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzUwMSwiaWF0IjoxNzkzMTgyNjAxLCJqdGkiOiIyNTNmMDIwZi01OGUzLTQ3YzctYmMxNy03NWNjMjdmYTYxNWEiLCJzaWQiOiIwMTU5MzY3OS04NDQwLTRkODEtODg0MS1mYTYxODU2ZWI5MmYifQ.h9daRqPS20Lrxm7g71dMH0Oed5UcDZcxNpwj8MNWmK4",
  "access_expires_at": "2026-10-28T10:31:41.585585298Z",
  "refresh_token": "gR15gt615-zrowCpsr_BxoVfYjk9QeMQBoonU1A4YhU",
  "refresh_expires_at": "2026-11-27T10:16:41.585206186Z",
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
  "command_id": "825aa033-cf74-46fc-82d9-91f58f7f65bd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:16:41Z",
    "sequence": 1793182601925
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8ea21c8a-862f-4043-b631-78a485206983",
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
  "last_heartbeat_at": "2026-10-28T10:16:41.941472Z",
  "last_location_at": "2026-10-28T10:16:41.941472Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670983043",
  "device_ref": "sandbox-12705"
}
```

```json
{
  "challenge_id": "0e7d5b93-d4a5-462a-a941-6a976586b107",
  "expires_at": "2026-10-28T10:21:42.115413107Z",
  "resend_available_at": "2026-10-28T10:16:43.115413107Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670983043` → **200**

```json
{
  "phone": "+380670983043",
  "audience": "CLIENT",
  "code": "133627",
  "sent_at": "2026-10-28T10:16:42.117070025Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0e7d5b93-d4a5-462a-a941-6a976586b107",
  "code": "133627",
  "device_ref": "sandbox-12705"
}
```

```json
{
  "session_id": "bfeabcaa-f83e-48af-bffb-04b8c01ecc0d",
  "subject": {
    "type": "CLIENT",
    "id": "d7e19f89-e411-4882-9738-e40e9aaf6280"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkN2UxOWY4OS1lNDExLTQ4ODItOTczOC1lNDBlOWFhZjYyODAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNTAyLCJpYXQiOjE3OTMxODI2MDIsImp0aSI6IjMwMzkyYmNmLTU5MjctNDBlMC1iYjY3LTA3YWQ0MmQ0MWEwNSIsInNpZCI6ImJmZWFiY2FhLWY4M2UtNDhhZi1iZmZiLTA0YjhjMDFlY2MwZCJ9.gnlji4PSvNAuUim07_QdislDfDmxigwk4dIuS6zFf78",
  "access_expires_at": "2026-10-28T10:31:42.313672549Z",
  "refresh_token": "yswgIMTDRXl0a0DFAAgGbF0Hy1wXUSe5sXqhKEfuSvk",
  "refresh_expires_at": "2026-11-27T10:16:42.313299938Z",
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
  "command_id": "a30581cf-1a7e-4f6c-a460-16d58ea38589",
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
  "id": "2b3acfa7-4e5a-4f66-815a-c20d94a84c5e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:21:42.662443Z",
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
      "id": "f7f16c43-060d-461d-837c-aecb1196ccc0",
      "name": "Осінь −10 %",
      "kind": "DISCOUNT",
      "value_type": "PERCENT",
      "value": 1000,
      "discount_minor": 1052
    }
  ]
}
```

## Both phones register for pushes (the sandbox only records them: /sandbox/v1/pushes)

`POST /api/driver/v1/push-devices` → **201**

```json
{
  "command_id": "aa5a4292-603f-4511-a045-ffc3d22a8497",
  "platform": "ANDROID",
  "token": "sandbox-driver-b13985c9-090a-42cc-b11a-6d65e01947b5"
}
```

```json
{
  "id": "b88ca88d-4556-4b0e-8066-d9d6425b8fcc",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T10:16:42.852371Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "44989ba1-7317-4b52-9b42-ea765af4a995",
  "platform": "ANDROID",
  "token": "sandbox-rider-76c716d9-3cd7-41a9-addf-575fb2a0dfd7"
}
```

```json
{
  "id": "5347b28c-07fa-4c24-8e8b-0119ca35fe5b",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T10:16:43.026581Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "39e896cc-7b9b-470b-926d-bcc0a5b1fc40",
  "quote_id": "2b3acfa7-4e5a-4f66-815a-c20d94a84c5e",
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
  "id": "4abe0c46-ed18-4cba-8ce6-ecf513b6fcde",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d7e19f89-e411-4882-9738-e40e9aaf6280",
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
  "created_at": "2026-10-28T10:16:43.203898Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 1052
}
```

## The driver gets the offer and accepts it

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "73c3dbaf-2bf4-4e6f-ac4b-71dc0c48469e",
    "order_id": "4abe0c46-ed18-4cba-8ce6-ecf513b6fcde",
    "expires_at": "2026-10-28T10:16:58.206305Z",
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

`POST /api/driver/v1/offers/73c3dbaf-2bf4-4e6f-ac4b-71dc0c48469e/accept` → **200**

```json
{
  "command_id": "7461906f-bbc5-4111-b3ac-c32669f942e1"
}
```

```json
{
  "id": "5881c559-098d-4a01-9225-c2f8ce1defd4",
  "order_id": "4abe0c46-ed18-4cba-8ce6-ecf513b6fcde",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "edb1d41b-10a0-4a95-8525-3af227e8cbba",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T10:16:43.184Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T10:16:43.184Z` → **200**

```json
[
  {
    "at": "2026-10-28T10:16:43.957596413Z",
    "token_suffix": "1947b5",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "event_id": "4377f6f7-224f-4943-9c65-e15bed04da43",
      "order_version": "2",
      "order_id": "4abe0c46-ed18-4cba-8ce6-ecf513b6fcde",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380670983043&after=2026-10-28T10:16:43.184Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380670983043&after=2026-10-28T10:16:43.184Z` → **200**

```json
[
  {
    "at": "2026-10-28T10:16:44.961178609Z",
    "token_suffix": "a0dfd7",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "event_id": "4fdfea42-a251-4d3a-976d-9eca0c59c880",
      "order_version": "3",
      "order_id": "4abe0c46-ed18-4cba-8ce6-ecf513b6fcde",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/4abe0c46-ed18-4cba-8ce6-ecf513b6fcde/messages` → **201**

```json
{
  "command_id": "17e05271-4501-44a9-925b-dfa0b2009154",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "de154c30-5d61-4da2-a6b2-6f340ad27acb",
  "order_id": "4abe0c46-ed18-4cba-8ce6-ecf513b6fcde",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T10:16:45.842917029Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "edb1d41b-10a0-4a95-8525-3af227e8cbba",
  "order_id": "4abe0c46-ed18-4cba-8ce6-ecf513b6fcde",
  "assignment_id": "5881c559-098d-4a01-9225-c2f8ce1defd4",
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
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/edb1d41b-10a0-4a95-8525-3af227e8cbba/messages` → **201**

```json
{
  "command_id": "85ab87ae-fd12-42e7-9de5-ad8e0fc382be",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "7ed83262-7036-4da7-8a85-b592b114aa27",
  "order_id": "4abe0c46-ed18-4cba-8ce6-ecf513b6fcde",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T10:16:46.184155701Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/4abe0c46-ed18-4cba-8ce6-ecf513b6fcde/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/edb1d41b-10a0-4a95-8525-3af227e8cbba/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380670983043"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/8ea21c8a-862f-4043-b631-78a485206983/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:16:46Z",
    "sequence": 1793182606682
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8ea21c8a-862f-4043-b631-78a485206983",
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
  "last_heartbeat_at": "2026-10-28T10:16:46.6985Z",
  "last_location_at": "2026-10-28T10:16:46.6985Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "edb1d41b-10a0-4a95-8525-3af227e8cbba",
  "order_id": "4abe0c46-ed18-4cba-8ce6-ecf513b6fcde",
  "assignment_id": "5881c559-098d-4a01-9225-c2f8ce1defd4",
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
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/edb1d41b-10a0-4a95-8525-3af227e8cbba/arrive` → **200**

```json
{
  "command_id": "950d85c6-5f74-4d41-a14d-0236c98ebe92",
  "expected_version": 0
}
```

```json
{
  "id": "edb1d41b-10a0-4a95-8525-3af227e8cbba",
  "order_id": "4abe0c46-ed18-4cba-8ce6-ecf513b6fcde",
  "assignment_id": "5881c559-098d-4a01-9225-c2f8ce1defd4",
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
  "arrived_at": "2026-10-28T10:16:47.036324Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/edb1d41b-10a0-4a95-8525-3af227e8cbba/start` → **200**

```json
{
  "command_id": "6fabd8b9-6af3-4c1b-87b9-6c4c48790057",
  "expected_version": 1
}
```

```json
{
  "id": "edb1d41b-10a0-4a95-8525-3af227e8cbba",
  "order_id": "4abe0c46-ed18-4cba-8ce6-ecf513b6fcde",
  "assignment_id": "5881c559-098d-4a01-9225-c2f8ce1defd4",
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
  "arrived_at": "2026-10-28T10:16:47.036324Z",
  "started_at": "2026-10-28T10:16:47.213485Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/8ea21c8a-862f-4043-b631-78a485206983/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:16:47Z",
    "sequence": 1793182607382
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8ea21c8a-862f-4043-b631-78a485206983",
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
  "last_heartbeat_at": "2026-10-28T10:16:47.399111Z",
  "last_location_at": "2026-10-28T10:16:47.399111Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/edb1d41b-10a0-4a95-8525-3af227e8cbba/complete` → **200**

```json
{
  "command_id": "cb92e3bf-89af-4f08-b5c0-1adb51e9fdd1",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:16:47Z",
  "cash_received": true
}
```

```json
{
  "id": "edb1d41b-10a0-4a95-8525-3af227e8cbba",
  "order_id": "4abe0c46-ed18-4cba-8ce6-ecf513b6fcde",
  "assignment_id": "5881c559-098d-4a01-9225-c2f8ce1defd4",
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
  "arrived_at": "2026-10-28T10:16:47.036324Z",
  "started_at": "2026-10-28T10:16:47.213485Z",
  "completed_at": "2026-10-28T10:16:47.585262Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 1052,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/4abe0c46-ed18-4cba-8ce6-ecf513b6fcde` → **200**

```json
{
  "id": "4abe0c46-ed18-4cba-8ce6-ecf513b6fcde",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "d7e19f89-e411-4882-9738-e40e9aaf6280",
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
    "id": "5881c559-098d-4a01-9225-c2f8ce1defd4",
    "order_id": "4abe0c46-ed18-4cba-8ce6-ecf513b6fcde",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "edb1d41b-10a0-4a95-8525-3af227e8cbba",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:16:43.203898Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 1052
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "4abe0c46-ed18-4cba-8ce6-ecf513b6fcde",
    "short_number": 6,
    "status": "FULFILLED",
    "created_at": "2026-10-28T10:16:43.203898Z",
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
    "id": "edb1d41b-10a0-4a95-8525-3af227e8cbba",
    "order_id": "4abe0c46-ed18-4cba-8ce6-ecf513b6fcde",
    "order_short_number": 6,
    "created_at": "2026-10-28T10:16:43.566171Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
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
      "balance_minor": -526,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/driver/v1/earnings?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-28&to=2026-10-28` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-28",
  "to": "2026-10-28",
  "days": [
    {
      "date": "2026-10-28",
      "figures": {
        "trips": 1,
        "fare_minor": 10517,
        "commission_minor": 1578,
        "driver_share_minor": 8939,
        "cash_minor": 9465,
        "cashless_minor": 1052,
        "tips_minor": 0,
        "bonuses_minor": 0,
        "top_ups_minor": 0,
        "transfers_in_minor": 0,
        "transfers_out_minor": 0,
        "adjustments_minor": 0,
        "net_minor": -526
      }
    }
  ],
  "total": {
    "trips": 1,
    "fare_minor": 10517,
    "commission_minor": 1578,
    "driver_share_minor": 8939,
    "cash_minor": 9465,
    "cashless_minor": 1052,
    "tips_minor": 0,
    "bonuses_minor": 0,
    "top_ups_minor": 0,
    "transfers_in_minor": 0,
    "transfers_out_minor": 0,
    "adjustments_minor": 0,
    "net_minor": -526
  },
  "balance_minor": -526
}
```

## The rider leaves a 10 % tip in cash: it is only recorded

`GET /api/rider/v1/orders/4abe0c46-ed18-4cba-8ce6-ecf513b6fcde/tip` → **200**

```json
{
  "order_id": "4abe0c46-ed18-4cba-8ce6-ecf513b6fcde",
  "currency": "UAH",
  "trip_cost_minor": 9465,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1000
    },
    {
      "percent": 15,
      "amount_minor": 1500
    },
    {
      "percent": 20,
      "amount_minor": 1900
    },
    {
      "percent": 25,
      "amount_minor": 2400
    }
  ],
  "min_minor": 100,
  "max_minor": 9500,
  "method": "CASH",
  "available_until": "2026-10-29T10:16:47.585262Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/4abe0c46-ed18-4cba-8ce6-ecf513b6fcde/tip` → **201**

```json
{
  "command_id": "273bf9e2-92b6-4619-a55b-3eb86f48404f",
  "amount_minor": 1000
}
```

```json
{
  "id": "fff6b368-0139-4f33-afa6-75687a2dbd7d",
  "order_id": "4abe0c46-ed18-4cba-8ce6-ecf513b6fcde",
  "amount_minor": 1000,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T10:16:51.828919Z"
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
  "session_id": "cf7e2e01-55ed-41b8-9e8c-97c1b1ebdaeb",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM1MTIsImlhdCI6MTc5MzE4MjYxMiwianRpIjoiMWI5YWY1MzMtYmY0Ni00M2QxLTk1MGUtZTg3ZGNlYmU3Y2Y1Iiwic2lkIjoiY2Y3ZTJlMDEtNTVlZC00MWI4LTllOGMtOTdjMWIxZWJkYWViIn0.10XldBG_J_nd54_4AG56wFov4OWj1-6VTxqzENwdUUc",
  "access_expires_at": "2026-10-28T10:31:52.198866291Z",
  "refresh_token": "M6SUT3RArHIqqqk1S6XjihaENVbewlCNAN_tk4RCGCk",
  "refresh_expires_at": "2026-10-28T22:16:52.198536915Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/reports/orders?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-28&to=2026-10-28` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-28",
  "to": "2026-10-28",
  "days": [
    {
      "date": "2026-10-28",
      "counts": {
        "created": 6,
        "fulfilled": 2,
        "cancelled": 3,
        "unfulfilled": 0,
        "open": 1,
        "by_channel": {
          "APP": 6
        },
        "by_payment": {
          "CARD": 1,
          "CASH": 5
        },
        "cancelled_by": {
          "RIDER": 2,
          "DRIVER": 1
        }
      }
    }
  ],
  "total": {
    "created": 6,
    "fulfilled": 2,
    "cancelled": 3,
    "unfulfilled": 0,
    "open": 1,
    "by_channel": {
      "APP": 6
    },
    "by_payment": {
      "CARD": 1,
      "CASH": 5
    },
    "cancelled_by": {
      "RIDER": 2,
      "DRIVER": 1
    }
  },
  "cancellation_reasons": [
    {
      "cancelled_by": "RIDER",
      "code": "CHANGED_MIND",
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
  "generated_at": "2026-10-28T10:16:52.374589978Z"
}
```

`GET /api/admin/v1/reports/finance?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-28&to=2026-10-28` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-28",
  "to": "2026-10-28",
  "days": [
    {
      "date": "2026-10-28",
      "figures": {
        "trips": 2,
        "fares_minor": 26814,
        "service_rides_minor": 0,
        "commission_minor": 4023,
        "driver_share_minor": 22791,
        "discounts_minor": 2682,
        "bonuses_granted_minor": 0,
        "paid_by_card_minor": 14667,
        "paid_with_bonuses_minor": 0,
        "collected_by_drivers_minor": 9465,
        "tips_minor": 2300,
        "rider_debt_change_minor": 0
      }
    }
  ],
  "total": {
    "trips": 2,
    "fares_minor": 26814,
    "service_rides_minor": 0,
    "commission_minor": 4023,
    "driver_share_minor": 22791,
    "discounts_minor": 2682,
    "bonuses_granted_minor": 0,
    "paid_by_card_minor": 14667,
    "paid_with_bonuses_minor": 0,
    "collected_by_drivers_minor": 9465,
    "tips_minor": 2300,
    "rider_debt_change_minor": 0
  },
  "generated_at": "2026-10-28T10:16:52.554796939Z"
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
  "session_id": "42223c12-37ca-4d11-946c-37a699126660",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM1MTIsImlhdCI6MTc5MzE4MjYxMiwianRpIjoiNDAxMzkyZWEtMjEzMy00NGZiLThhYTItMThlMWRlYjJkMDc5Iiwic2lkIjoiNDIyMjNjMTItMzdjYS00ZDExLTk0NmMtMzdhNjk5MTI2NjYwIn0.TOIOKjLTILEW86-g1etTQUniF56xP2ylaQtI2SnOGIw",
  "access_expires_at": "2026-10-28T10:31:52.927428493Z",
  "refresh_token": "VicuagCecQ2pWlTFNFMsV19TGl0MjmvFeGy38WT4MWg",
  "refresh_expires_at": "2026-10-28T22:16:52.926964678Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4abe0c46-ed18-4cba-8ce6-ecf513b6fcde/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:16:43.20438Z",
      "actor": {
        "type": "CLIENT",
        "id": "d7e19f89-e411-4882-9738-e40e9aaf6280",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4abe0c46-ed18-4cba-8ce6-ecf513b6fcde",
        "quote_id": "2b3acfa7-4e5a-4f66-815a-c20d94a84c5e",
        "price_minor": 10517,
        "discount_minor": 1052,
        "payment_method": "CASH"
      },
      "correlation_id": "c34433b6-24ac-45d4-bb38-8069ee5d414a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:16:43.20573Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4abe0c46-ed18-4cba-8ce6-ecf513b6fcde",
        "attempt_id": "7bfe7e0b-d39a-4475-b9bd-9f87596b1644",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c34433b6-24ac-45d4-bb38-8069ee5d414a"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:16:43.21035Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "73c3dbaf-2bf4-4e6f-ac4b-71dc0c48469e",
        "order_id": "4abe0c46-ed18-4cba-8ce6-ecf513b6fcde",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "c34433b6-24ac-45d4-bb38-8069ee5d414a"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T10:16:43.56745Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "73c3dbaf-2bf4-4e6f-ac4b-71dc0c48469e",
        "order_id": "4abe0c46-ed18-4cba-8ce6-ecf513b6fcde",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "5881c559-098d-4a01-9225-c2f8ce1defd4"
      },
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T10:16:53.271176172Z",
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
      "last_location_at": "2026-10-28T10:16:47.399111Z",
      "order_id": null
    },
    {
      "driver_id": "5a000000-0000-4000-8000-000000000402",
      "name": "Олег Коваль",
      "car": {
        "registration_number": "AA0002TX",
        "make": "Toyota",
        "model": "Corolla",
        "color": "grey",
        "classes": [
          "STANDARD"
        ]
      },
      "has_payment_terminal": false,
      "status": "ON_ORDER",
      "occupancy": "TO_PICKUP",
      "connection": "STALE",
      "geolocation": "STALE",
      "location": {
        "lat": 50.4555,
        "lon": 30.5234
      },
      "last_location_at": "2026-10-28T10:16:37.7436Z",
      "order_id": "8261efdc-9254-4c03-8bdc-d04b6f99b47d"
    }
  ]
}
```

Done: order 4abe0c46-ed18-4cba-8ce6-ecf513b6fcde.

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
  "session_id": "c492e292-fec3-4955-8805-3bef90a3fd42",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM1MTMsImlhdCI6MTc5MzE4MjYxMywianRpIjoiM2VjOTFmNmYtNGRlNS00MjA4LWFjOWMtODg5ZjkxMzhmYjM0Iiwic2lkIjoiYzQ5MmUyOTItZmVjMy00OTU1LTg4MDUtM2JlZjkwYTNmZDQyIn0.b1vKNZ043pPS6klHQmKYL7B4lgIfzQeM7OzztPr09-4",
  "access_expires_at": "2026-10-28T10:31:53.656963291Z",
  "refresh_token": "L0gkkW9kaEjQZoo8ZEn-Jxl5OHvOASq_3vpD02DU1vY",
  "refresh_expires_at": "2026-10-28T22:16:53.656538922Z",
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
  "command_id": "297f2f0b-aa6e-4868-bfed-7ffecac692b0",
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
  "timestamp": "2026-10-28T10:16:54.000+0000",
  "channel": {
    "id": "1730052000.2046714938",
    "linkedid": "1730052000.2046714938",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674107217"
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
  "timestamp": "2026-10-28T10:16:54.000+0000",
  "channel": {
    "id": "1730052000.2046714938",
    "linkedid": "1730052000.2046714938",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674107217"
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
  "session_id": "fe33ed84-3184-4859-bf3b-72f6b4173a5d",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM1MTQsImlhdCI6MTc5MzE4MjYxNCwianRpIjoiNmNmMDljNjctOTBhNi00Y2RiLTg0NzktZTIwZjNmNjBjZmRhIiwic2lkIjoiZmUzM2VkODQtMzE4NC00ODU5LWJmM2ItNzJmNmI0MTczYTVkIn0.5ihVIIQ-_tsplOoIR01KOs7pG15hWubFICLSLwMWmvQ",
  "access_expires_at": "2026-10-28T10:31:54.403849985Z",
  "refresh_token": "tWHQizROvvzyZQ-qIE71YEeMe7qhLEakyjSt7rdj57k",
  "refresh_expires_at": "2026-10-28T22:16:54.403527189Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "a59f965e-6c97-486c-a1b7-e54af23336ba",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674107217",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:16:54Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/a59f965e-6c97-486c-a1b7-e54af23336ba/answer` → **200**

```json
{
  "command_id": "1cbe44d4-e8a1-4f0d-a9cf-560bebe42028"
}
```

```json
{
  "id": "a59f965e-6c97-486c-a1b7-e54af23336ba",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674107217",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
  "order_ids": [],
  "started_at": "2026-10-28T10:16:54Z",
  "answered_at": "2026-10-28T10:16:54.760443Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2046714938",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "5337ef66-c9a9-4efc-b0fc-37de52c1f8f3",
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
  "id": "c9de12b7-2527-4ef3-b941-b3bb0d489733",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:21:54.969362Z",
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
  "command_id": "7f79bbb6-1a8a-4c5f-9420-cc247d64428f",
  "quote_id": "c9de12b7-2527-4ef3-b941-b3bb0d489733",
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
    "phone": "+380674107217"
  },
  "call_id": "a59f965e-6c97-486c-a1b7-e54af23336ba"
}
```

```json
{
  "id": "c02944a2-6845-480e-9976-1c44ecf3fb1b",
  "short_number": 7,
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
  "created_at": "2026-10-28T10:16:55.169132Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674107217"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

**Contract validation failed — scenario stopped.**

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26182"
}
```

```json
{
  "challenge_id": "92ed3022-2643-40c7-9820-b9a19725e983",
  "expires_at": "2026-10-28T10:21:55.37907068Z",
  "resend_available_at": "2026-10-28T10:16:56.37907068Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "477437",
  "sent_at": "2026-10-28T10:16:55.38079865Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "92ed3022-2643-40c7-9820-b9a19725e983",
  "code": "477437",
  "device_ref": "sandbox-26182"
}
```

```json
{
  "session_id": "7894fa20-5a44-4603-870b-1572519978b8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzUxNSwiaWF0IjoxNzkzMTgyNjE1LCJqdGkiOiJmZDE2NGYwZC0wMjZjLTRjZDYtODVhMC1iOWFjNTI5MDY0YmYiLCJzaWQiOiI3ODk0ZmEyMC01YTQ0LTQ2MDMtODcwYi0xNTcyNTE5OTc4YjgifQ.6tcBOZZkSOYyNDkPoNdfdME5OgI7LX6vn8hHOZR1BQ8",
  "access_expires_at": "2026-10-28T10:31:55.576538986Z",
  "refresh_token": "DgOFsVLzfLoTkDITO0oawZHqZ8KF6ed9QPWpGtRVe74",
  "refresh_expires_at": "2026-11-27T10:16:55.576154546Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8ea21c8a-862f-4043-b631-78a485206983",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:16:47.399111Z",
  "last_location_at": "2026-10-28T10:16:47.399111Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/8ea21c8a-862f-4043-b631-78a485206983/handover` → **200**

```json
{
  "command_id": "0f1c522b-3a7b-4b19-a777-2a2255df6ef3",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8ea21c8a-862f-4043-b631-78a485206983",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:16:47.399111Z",
  "last_location_at": "2026-10-28T10:16:47.399111Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/8ea21c8a-862f-4043-b631-78a485206983/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:16:56Z",
    "sequence": 1793182616100
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8ea21c8a-862f-4043-b631-78a485206983",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:16:56.11686Z",
  "last_location_at": "2026-10-28T10:16:56.11686Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661629336",
  "device_ref": "sandbox-6932"
}
```

```json
{
  "challenge_id": "a1b5529f-fc81-43b0-8ae1-c5bacb0fac15",
  "expires_at": "2026-10-28T10:21:56.285991242Z",
  "resend_available_at": "2026-10-28T10:16:57.285991242Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661629336` → **200**

```json
{
  "phone": "+380661629336",
  "audience": "CLIENT",
  "code": "365872",
  "sent_at": "2026-10-28T10:16:56.287609475Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a1b5529f-fc81-43b0-8ae1-c5bacb0fac15",
  "code": "365872",
  "device_ref": "sandbox-6932"
}
```

```json
{
  "session_id": "630c52a2-bbde-4ade-a2bd-739da904b27e",
  "subject": {
    "type": "CLIENT",
    "id": "41485d67-ee7f-4deb-bcb9-1ea7a2f58973"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MTQ4NWQ2Ny1lZTdmLTRkZWItYmNiOS0xZWE3YTJmNTg5NzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNTE2LCJpYXQiOjE3OTMxODI2MTYsImp0aSI6ImVlMTJjZGNjLTFhOTAtNGRlZC05NmNjLTRiODI3MzE1NDE4OSIsInNpZCI6IjYzMGM1MmEyLWJiZGUtNGFkZS1hMmJkLTczOWRhOTA0YjI3ZSJ9.2CfXX6eGXZKeEMdVZrmgihlQQA91dRLGvzZ7BSZzeCw",
  "access_expires_at": "2026-10-28T10:31:56.474734881Z",
  "refresh_token": "wn0mLZz-B0R-5cCKpxY5Ni4bUBBfhu7yTy8-6sQQ0N8",
  "refresh_expires_at": "2026-11-27T10:16:56.474423572Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "dfc65786-c129-471c-9b0a-3ae83715b6de",
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
  "id": "9f3213fc-cce8-480b-b10e-34418474efe6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:21:56.646229Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 2119,
  "to_pay_minor": 19066,
  "promotions": [
    {
      "id": "f7f16c43-060d-461d-837c-aecb1196ccc0",
      "name": "Осінь −10 %",
      "kind": "DISCOUNT",
      "value_type": "PERCENT",
      "value": 1000,
      "discount_minor": 2119
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2aa70aea-a684-44d1-9a0e-12cf4a1971d7",
  "quote_id": "9f3213fc-cce8-480b-b10e-34418474efe6",
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
  "id": "8e9037dd-e139-452b-a2a1-2b574a639133",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "41485d67-ee7f-4deb-bcb9-1ea7a2f58973",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T10:16:56.822589Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 2119
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "9dcb5d99-e72c-4f65-9401-c97c37a811dc",
    "order_id": "c02944a2-6845-480e-9976-1c44ecf3fb1b",
    "expires_at": "2026-10-28T10:17:10.17197Z",
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
    "distance_m": 2667
  }
]
```

`POST /api/driver/v1/offers/9dcb5d99-e72c-4f65-9401-c97c37a811dc/accept` → **200**

```json
{
  "command_id": "c58cabd3-7b51-45a9-9b6f-d772660c8f1e"
}
```

```json
{
  "id": "9c2f18ab-87c9-4e06-a7e7-69e581b1ce80",
  "order_id": "c02944a2-6845-480e-9976-1c44ecf3fb1b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "723130d2-bbfc-43c9-835a-9659301b5387",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "723130d2-bbfc-43c9-835a-9659301b5387",
  "order_id": "c02944a2-6845-480e-9976-1c44ecf3fb1b",
  "assignment_id": "9c2f18ab-87c9-4e06-a7e7-69e581b1ce80",
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
    "name": "Caller",
    "phone": "+380674107217"
  }
}
```

`POST /api/driver/v1/work-sessions/8ea21c8a-862f-4043-b631-78a485206983/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:16:57Z",
    "sequence": 1793182617491
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8ea21c8a-862f-4043-b631-78a485206983",
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
  "last_heartbeat_at": "2026-10-28T10:16:57.50744Z",
  "last_location_at": "2026-10-28T10:16:57.50744Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/723130d2-bbfc-43c9-835a-9659301b5387/arrive` → **422**

```json
{
  "command_id": "d59f06c2-8add-4cd0-9ac8-643b2543be33",
  "expected_version": 0
}
```

```json
{
  "instance": "/api/driver/v1/trips/723130d2-bbfc-43c9-835a-9659301b5387/arrive",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "2c8bd8a6-27b2-4e68-a944-690b1359b654"
}
```

**Expected 200, got 422 — scenario stopped.**

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
  "session_id": "12e3ca36-c3a3-4044-99bd-2e95adf3bc6c",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM1MTgsImlhdCI6MTc5MzE4MjYxOCwianRpIjoiMjAxMmI1YTMtODE4ZS00YmY3LWFjZDQtZTllZDMxNGU1MWNmIiwic2lkIjoiMTJlM2NhMzYtYzNhMy00MDQ0LTk5YmQtMmU5NWFkZjNiYzZjIn0.4TqlG_h-BCxiQ7WIc_5QYPwr8Xdd3-TBT0OAd4wGgG8",
  "access_expires_at": "2026-10-28T10:31:58.066076025Z",
  "refresh_token": "pKJj2KtHqi4QiIYV92UDdf5pTz_II0qHmVjJvQjCwZE",
  "refresh_expires_at": "2026-10-28T22:16:58.065606347Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "68b28ddb-de3b-4f17-ad47-bb46ca79d7f7",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:16:58Z"
}
```

```json
{
  "id": "da0878bf-f5d6-49dd-b527-0b6c1eeab43f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:16:58Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/da0878bf-f5d6-49dd-b527-0b6c1eeab43f/publish` → **200**

```json
{
  "command_id": "2f31bb30-4cf5-47ff-bbc7-11c062b6fa70",
  "expected_version": 0
}
```

```json
{
  "id": "da0878bf-f5d6-49dd-b527-0b6c1eeab43f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:16:58.423302Z",
  "published_at": "2026-10-28T10:16:58.423302Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "da0878bf-f5d6-49dd-b527-0b6c1eeab43f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T10:16:58.423302Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633808147",
  "device_ref": "sandbox-32100"
}
```

```json
{
  "challenge_id": "c440c160-5b13-4300-ab62-e9ff9329644c",
  "expires_at": "2026-10-28T10:21:58.766359841Z",
  "resend_available_at": "2026-10-28T10:16:59.766359841Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633808147` → **200**

```json
{
  "phone": "+380633808147",
  "audience": "CLIENT",
  "code": "049077",
  "sent_at": "2026-10-28T10:16:58.768362229Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c440c160-5b13-4300-ab62-e9ff9329644c",
  "code": "049077",
  "device_ref": "sandbox-32100"
}
```

```json
{
  "session_id": "d61a79ba-76ff-497b-b8fb-8da0e5598c68",
  "subject": {
    "type": "CLIENT",
    "id": "e9954948-8adc-498d-89be-e8d83d9e3049"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTk1NDk0OC04YWRjLTQ5OGQtODliZS1lOGQ4M2Q5ZTMwNDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNTE4LCJpYXQiOjE3OTMxODI2MTgsImp0aSI6ImVhMmJmN2VhLTQ5ZTMtNDdlZi1iNjYyLTBiMDE0MGFmY2MxZCIsInNpZCI6ImQ2MWE3OWJhLTc2ZmYtNDk3Yi1iOGZiLThkYTBlNTU5OGM2OCJ9.6KowInhaMtEvIkd6nIUnU4D9LKDoyeN9gfy057eFP7E",
  "access_expires_at": "2026-10-28T10:31:58.95986701Z",
  "refresh_token": "wPQ5G_1TevBxO7ruoBTv2DeR_ZBPsuQFjj1hc38tBF4",
  "refresh_expires_at": "2026-11-27T10:16:58.959521018Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "da0878bf-f5d6-49dd-b527-0b6c1eeab43f",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T10:16:58.423302Z",
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
  "command_id": "184f1fc7-dbc1-4695-818d-ed2b303d437e",
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
  "id": "61fc59fc-4b67-48a2-9aa2-b523dacbe6b0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:21:59.305630Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 3053,
  "to_pay_minor": 27480,
  "promotions": [
    {
      "id": "f7f16c43-060d-461d-837c-aecb1196ccc0",
      "name": "Осінь −10 %",
      "kind": "DISCOUNT",
      "value_type": "PERCENT",
      "value": 1000,
      "discount_minor": 3053
    }
  ]
}
```

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "4e2970d2-fdde-4b5f-b847-468b6c7b0427",
  "quote_id": "61fc59fc-4b67-48a2-9aa2-b523dacbe6b0",
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
  "correlation_id": "3d7f0faf-7e91-4360-9fcd-6c7940819ddf"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "9d9193b3-92e9-4c36-a18c-b93a8cadf660",
  "version_id": "da0878bf-f5d6-49dd-b527-0b6c1eeab43f",
  "language": "uk"
}
```

```json
{
  "version_id": "da0878bf-f5d6-49dd-b527-0b6c1eeab43f",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T10:16:59.664645Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fa99453c-f761-43c7-9cd1-a5f8dca2d6b9",
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
  "id": "d9cca3a4-b651-4144-b878-2dff401c4774",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:21:59.837479Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 3053,
  "to_pay_minor": 27480,
  "promotions": [
    {
      "id": "f7f16c43-060d-461d-837c-aecb1196ccc0",
      "name": "Осінь −10 %",
      "kind": "DISCOUNT",
      "value_type": "PERCENT",
      "value": 1000,
      "discount_minor": 3053
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "be34ee50-48f5-47ae-9aa6-39793355d928",
  "quote_id": "d9cca3a4-b651-4144-b878-2dff401c4774",
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
  "id": "0ffc49c1-a10a-4da0-baed-55fb908d36f4",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e9954948-8adc-498d-89be-e8d83d9e3049",
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
  "created_at": "2026-10-28T10:17:00.0137Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 3053
}
```

`GET /api/rider/v1/orders/0ffc49c1-a10a-4da0-baed-55fb908d36f4` → **200**

```json
{
  "id": "0ffc49c1-a10a-4da0-baed-55fb908d36f4",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e9954948-8adc-498d-89be-e8d83d9e3049",
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
  "created_at": "2026-10-28T10:17:00.0137Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 3053
}
```

`POST /api/rider/v1/orders/0ffc49c1-a10a-4da0-baed-55fb908d36f4/cancel` → **200**

```json
{
  "command_id": "eee44ad5-b382-45bf-a17c-09de1f07e29a",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0ffc49c1-a10a-4da0-baed-55fb908d36f4",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e9954948-8adc-498d-89be-e8d83d9e3049",
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
  "created_at": "2026-10-28T10:17:00.0137Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 3053
}
```

## A published version never changes

`POST /api/admin/v1/legal-documents/da0878bf-f5d6-49dd-b527-0b6c1eeab43f` → **409**

```json
{
  "command_id": "8ba45470-18c6-492c-b8ca-9d92a5fe1746",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:17:00Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/da0878bf-f5d6-49dd-b527-0b6c1eeab43f",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "dbfd5588-9421-47d7-80d8-9634e857408f"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "0ce18f07-ecf3-4572-a147-6657be755ff0",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:17:00Z"
}
```

```json
{
  "id": "042e2b44-e097-4405-bdfd-b2a4ecb3d8a3",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:17:00Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/042e2b44-e097-4405-bdfd-b2a4ecb3d8a3/publish` → **200**

```json
{
  "command_id": "43927556-9ddb-4796-8d36-94b0de35b0da",
  "expected_version": 0
}
```

```json
{
  "id": "042e2b44-e097-4405-bdfd-b2a4ecb3d8a3",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:17:00.889134Z",
  "published_at": "2026-10-28T10:17:00.889134Z",
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
  "device_ref": "sandbox-24435"
}
```

```json
{
  "challenge_id": "2e89e5d1-700f-47fd-87fe-e8657d777cde",
  "expires_at": "2026-10-28T10:22:01.056422133Z",
  "resend_available_at": "2026-10-28T10:17:02.056422133Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "037370",
  "sent_at": "2026-10-28T10:17:01.058262427Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2e89e5d1-700f-47fd-87fe-e8657d777cde",
  "code": "037370",
  "device_ref": "sandbox-24435"
}
```

```json
{
  "session_id": "515b4823-8ad5-4e4a-816b-452d3d66d7f3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzUyMSwiaWF0IjoxNzkzMTgyNjIxLCJqdGkiOiJjZjRmYjUxNC1jOGNhLTQyNWQtYTdlNC1kYmFkYzgzZjBhOTYiLCJzaWQiOiI1MTViNDgyMy04YWQ1LTRlNGEtODE2Yi00NTJkM2Q2NmQ3ZjMifQ.6ctaLqbtaIvm3g9eMnewjCzViodbK2DFGwDuBzGOIhk",
  "access_expires_at": "2026-10-28T10:32:01.246397446Z",
  "refresh_token": "ebCetMdgOeYmytiV0aRLhzZLTZxkNhZaEaSInuJuBfY",
  "refresh_expires_at": "2026-11-27T10:17:01.246033647Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "750eafa9-ee0a-4e42-925c-d7d9f42acb94",
  "session_version": 2,
  "session_state": "CLOSING",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T10:16:37.7436Z",
  "last_location_at": "2026-10-28T10:16:37.7436Z",
  "eligible": false,
  "ineligible_reasons": [
    "SESSION_CLOSING",
    "INTENT_PAUSE_AFTER_CURRENT",
    "CONNECTION_STALE",
    "LOCATION_STALE",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/750eafa9-ee0a-4e42-925c-d7d9f42acb94/handover` → **200**

```json
{
  "command_id": "7382128e-ddf9-498a-962e-c219c7f53517",
  "expected_version": 2
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "750eafa9-ee0a-4e42-925c-d7d9f42acb94",
  "session_version": 3,
  "session_state": "CLOSING",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T10:16:37.7436Z",
  "last_location_at": "2026-10-28T10:16:37.7436Z",
  "eligible": false,
  "ineligible_reasons": [
    "SESSION_CLOSING",
    "INTENT_PAUSE_AFTER_CURRENT",
    "CONNECTION_STALE",
    "LOCATION_STALE",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/750eafa9-ee0a-4e42-925c-d7d9f42acb94/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:17:01Z",
    "sequence": 1793182621750
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "750eafa9-ee0a-4e42-925c-d7d9f42acb94",
  "session_version": 3,
  "session_state": "CLOSING",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T10:17:01.765539Z",
  "last_location_at": "2026-10-28T10:17:01.765539Z",
  "eligible": false,
  "ineligible_reasons": [
    "SESSION_CLOSING",
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674340523",
  "device_ref": "sandbox-14749"
}
```

```json
{
  "challenge_id": "c402f518-bd14-4900-aee5-4f9fa816b731",
  "expires_at": "2026-10-28T10:22:01.92931394Z",
  "resend_available_at": "2026-10-28T10:17:02.92931394Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674340523` → **200**

```json
{
  "phone": "+380674340523",
  "audience": "CLIENT",
  "code": "841234",
  "sent_at": "2026-10-28T10:17:01.931405934Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c402f518-bd14-4900-aee5-4f9fa816b731",
  "code": "841234",
  "device_ref": "sandbox-14749"
}
```

```json
{
  "session_id": "9b11d44d-b9e8-4ff6-852d-d1e77e10852c",
  "subject": {
    "type": "CLIENT",
    "id": "04697c21-a86b-4b5a-bbf3-84d07ff09ac5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNDY5N2MyMS1hODZiLTRiNWEtYmJmMy04NGQwN2ZmMDlhYzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNTIyLCJpYXQiOjE3OTMxODI2MjIsImp0aSI6ImM1M2IwYjhjLTJlZmYtNDgxZi05ZmE0LWEyZmVhNzlhNTI1NSIsInNpZCI6IjliMTFkNDRkLWI5ZTgtNGZmNi04NTJkLWQxZTc3ZTEwODUyYyJ9.84f2Xhwqx3pSGBsdSJY4PXSv7FLXIWs_qxwPUnt164I",
  "access_expires_at": "2026-10-28T10:32:02.118772498Z",
  "refresh_token": "WRzgfo2-xUy5ptjtWKaiQWNCebyyNu9c8A9XaAbA2S8",
  "refresh_expires_at": "2026-11-27T10:17:02.118383672Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c616e63b-925b-4176-949b-20dcea6aa666",
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
  "id": "d5d0589d-c518-4f76-aa4a-8fb8b19c10db",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:22:02.287523Z",
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
      "id": "f7f16c43-060d-461d-837c-aecb1196ccc0",
      "name": "Осінь −10 %",
      "kind": "DISCOUNT",
      "value_type": "PERCENT",
      "value": 1000,
      "discount_minor": 1052
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9fad2f5c-ac02-4508-9569-5e5e721366d7",
  "quote_id": "d5d0589d-c518-4f76-aa4a-8fb8b19c10db",
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
    "phone": "+380676267690"
  }
}
```

```json
{
  "id": "c84ba157-c2c6-4aa8-9ed3-2819322efd05",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "04697c21-a86b-4b5a-bbf3-84d07ff09ac5",
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
  "created_at": "2026-10-28T10:17:02.463974Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 1052
}
```

## The offer says nothing about granny; once accepted, the trip does

`GET /api/driver/v1/offers` → **200**

```json
[]
```

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
  "session_id": "60b2ae18-9b63-4117-bbf2-b85441e55e8a",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM1MjMsImlhdCI6MTc5MzE4MjYyMywianRpIjoiYjA5MTgwNmItYWNkYi00MWRlLWJlODItYTc5OTgwZjg1N2FjIiwic2lkIjoiNjBiMmFlMTgtOWI2My00MTE3LWJiZjItYjg1NDQxZTU1ZThhIn0.KbuS-6EP4KZI09H0eWg-xbD4IXWHzM7klOMbengstX8",
  "access_expires_at": "2026-10-28T10:32:03.017994837Z",
  "refresh_token": "rmHqMA7GcyyED2N4otTgpZQpYvdVzTNCkncPxjKSKRQ",
  "refresh_expires_at": "2026-10-28T22:17:03.0175887Z",
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
  "session_id": "bd167fe8-d1b0-49d7-8abc-5a2e6bc9c212",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM1MjMsImlhdCI6MTc5MzE4MjYyMywianRpIjoiMGYyMzU0MWMtMmM0Yy00NmY0LWE3NDMtZDhjZDdkMzc3ZGU1Iiwic2lkIjoiYmQxNjdmZTgtZDFiMC00OWQ3LThhYmMtNWEyZTZiYzljMjEyIn0.2dWQRjYyKZp9p3HCadtb4RzUESEQ3JkqbzQz1LoLc3o",
  "access_expires_at": "2026-10-28T10:32:03.378884236Z",
  "refresh_token": "hcEpRRxcpZqmdk2DLzcERuRvi1SiE-l30YgX-qyk9zk",
  "refresh_expires_at": "2026-10-28T22:17:03.378479502Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21818"
}
```

```json
{
  "challenge_id": "ae2bfbb5-eb50-4ca7-a086-7d23498104c5",
  "expires_at": "2026-10-28T10:22:03.543664147Z",
  "resend_available_at": "2026-10-28T10:17:04.543664147Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "813777",
  "sent_at": "2026-10-28T10:17:03.545623451Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ae2bfbb5-eb50-4ca7-a086-7d23498104c5",
  "code": "813777",
  "device_ref": "sandbox-21818"
}
```

```json
{
  "session_id": "2dd86c2f-5acd-4bb2-ac89-42789192fa98",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzUyMywiaWF0IjoxNzkzMTgyNjIzLCJqdGkiOiJkY2U3ODYzZi03ZDdhLTRiOGUtYmFiYy1mMTgxMGUyYTNkY2EiLCJzaWQiOiIyZGQ4NmMyZi01YWNkLTRiYjItYWM4OS00Mjc4OTE5MmZhOTgifQ.ibfs0b_nbK5ao0Sicj_U8FPBDy1Vy8IQUu41ES4lwng",
  "access_expires_at": "2026-10-28T10:32:03.729134808Z",
  "refresh_token": "HjvFF1s5GJsN4KHiKWMbq0wUk7-az6Oy-BUHUqsp64Q",
  "refresh_expires_at": "2026-11-27T10:17:03.728735051Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8ea21c8a-862f-4043-b631-78a485206983",
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
  "last_heartbeat_at": "2026-10-28T10:16:57.50744Z",
  "last_location_at": "2026-10-28T10:16:57.50744Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/8ea21c8a-862f-4043-b631-78a485206983/handover` → **200**

```json
{
  "command_id": "0d2e2c7a-03b5-4dab-9a70-8f1b9adeee03",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8ea21c8a-862f-4043-b631-78a485206983",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:16:57.50744Z",
  "last_location_at": "2026-10-28T10:16:57.50744Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/8ea21c8a-862f-4043-b631-78a485206983/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:17:04Z",
    "sequence": 1793182624221
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8ea21c8a-862f-4043-b631-78a485206983",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:17:04.236475Z",
  "last_location_at": "2026-10-28T10:17:04.236475Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
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
  "command_id": "80ef8c55-307f-46b9-a796-5817b4d0b518",
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
  "effective_at": "2026-10-28T10:17:04.57502Z",
  "changed_by": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T10:17:04.739516375Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "8c8cc05d-707b-45c8-b611-fc465a61d739",
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
  "id": "12185078-2acc-4505-8d51-810c02c64db4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:22:04.907214Z",
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
  "command_id": "4bafbd0a-c112-4e5a-8364-187b6361d654",
  "quote_id": "12185078-2acc-4505-8d51-810c02c64db4",
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
    "phone": "+3806711128685"
  }
}
```

```json
{
  "id": "debccd0c-43aa-4805-b405-3d6f13fc6259",
  "short_number": 11,
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T10:17:05.080471Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711128685"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

**Contract validation failed — scenario stopped.**

`GET /api/driver/v1/offers` → **200**

```json
[]
```

`POST /api/driver/v1/offers/null/accept` → **400**

```json
{
  "command_id": "3d4e6312-e424-43fa-85ad-4aeb0acbc718"
}
```

```json
{
  "instance": "/api/driver/v1/offers/null/accept",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "acfdd556-6dc5-46dd-bf6f-f30f718437c4"
}
```

**Expected 200, got 400 — scenario stopped.**

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677101881",
  "device_ref": "sandbox-23999"
}
```

```json
{
  "challenge_id": "5fcf4628-0cd5-40a9-9d92-9cb56ad89bcc",
  "expires_at": "2026-10-28T10:22:05.602735865Z",
  "resend_available_at": "2026-10-28T10:17:06.602735865Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677101881` → **200**

```json
{
  "phone": "+380677101881",
  "audience": "CLIENT",
  "code": "711580",
  "sent_at": "2026-10-28T10:17:05.60448667Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670587136",
  "device_ref": "sandbox-7545",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "0e412236-21a4-4fa5-8b58-2ecf5827a046",
  "expires_at": "2026-10-28T10:22:05.789820675Z",
  "resend_available_at": "2026-10-28T10:17:06.789820675Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670587136` → **200**

```json
{
  "phone": "+380670587136",
  "audience": "CLIENT",
  "code": "236463",
  "sent_at": "2026-10-28T10:17:05.791789844Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675970000",
  "device_ref": "sandbox-1499"
}
```

```json
{
  "challenge_id": "0e124ea4-dd2d-4db1-8541-076ef2444789",
  "expires_at": "2026-10-28T10:22:05.973203614Z",
  "resend_available_at": "2026-10-28T10:17:06.973203614Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675970000` → **200**

```json
{
  "phone": "+380675970000",
  "audience": "CLIENT",
  "code": "766252",
  "sent_at": "2026-10-28T10:17:05.97538647Z",
  "channel": "VOICE"
}
```

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
  "session_id": "2b628277-b22f-46e5-9eb3-88aa8d9e8aa1",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM1MjYsImlhdCI6MTc5MzE4MjYyNiwianRpIjoiZjczZTYwYmItOGI4MC00YWVjLWE4OGItYWY3Yzk3NzhlZGMzIiwic2lkIjoiMmI2MjgyNzctYjIyZi00NmU1LTllYjMtODhhYThkOWU4YWExIn0.vGHey5iCiF-ri3dvdCZ7qis7ZCjv4qUBB9GIKjr6tnk",
  "access_expires_at": "2026-10-28T10:32:06.362551034Z",
  "refresh_token": "4ckXXulCjD8-EfFwqKUBb3RRRDIPNSPXwjao_ZDjvAs",
  "refresh_expires_at": "2026-10-28T22:17:06.362154266Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675970000` → **200**

```json
{
  "deliveries": [
    {
      "id": "7af118a2-b453-4f9b-b245-3c96b9f6a789",
      "challenge_id": "0e124ea4-dd2d-4db1-8541-076ef2444789",
      "phone": "+380675970000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-01cb5256-6ab5-4a58-9b41-19c3d2cdf026",
      "error": null,
      "attempted_at": "2026-10-28T10:17:05.975604Z"
    },
    {
      "id": "f479923a-7d36-4fae-9032-688cabcd1ff9",
      "challenge_id": "0e124ea4-dd2d-4db1-8541-076ef2444789",
      "phone": "+380675970000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T10:17:05.974982Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380675970000` → **200**

```json
{
  "phone": "+380675970000",
  "audience": "CLIENT",
  "code": "766252",
  "sent_at": "2026-10-28T10:17:05.97538647Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670587136` → **200**

```json
{
  "deliveries": [
    {
      "id": "9db1eec1-0a56-42f1-b890-7bf8eb406465",
      "challenge_id": "0e412236-21a4-4fa5-8b58-2ecf5827a046",
      "phone": "+380670587136",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-50a760c5-e57f-44b2-b08d-6f9a70d1342b",
      "error": null,
      "attempted_at": "2026-10-28T10:17:05.792054Z"
    }
  ]
}
```

Done: SMS to +380677101881, a call to +380670587136, SMS then a call to +380675970000.

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
  "session_id": "385179cc-20a3-427c-b360-29d8c6bd829e",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM1MjcsImlhdCI6MTc5MzE4MjYyNywianRpIjoiMjExZjZkZTMtNGU0ZS00ODQ5LWExZGEtYTE1MGRmYzdlODE1Iiwic2lkIjoiMzg1MTc5Y2MtMjBhMy00MjdjLWIzNjAtMjlkOGM2YmQ4MjllIn0.3pbxxWLDq7zYUiY8-kyl3NFncxcjgZRN2ENSiTiYjJM",
  "access_expires_at": "2026-10-28T10:32:07.085310914Z",
  "refresh_token": "gdK0Y2tlp9Fmn35MmVDOcCnUc1b3DBbD_3agw4ZxbmY",
  "refresh_expires_at": "2026-10-28T22:17:07.084968207Z",
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
  "session_id": "0fa61abe-bcd3-40c6-b853-019a0451dcaa",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM1MjcsImlhdCI6MTc5MzE4MjYyNywianRpIjoiOTU0ZTlmZjUtNGJiOS00OTYwLWJkZmYtNzA3MzBjN2VlYzUzIiwic2lkIjoiMGZhNjFhYmUtYmNkMy00MGM2LWI4NTMtMDE5YTA0NTFkY2FhIn0.rpJ0FFa9FnKsLF78DQ30_pzDpimoTv9Ik3SHgvDteLM",
  "access_expires_at": "2026-10-28T10:32:07.444438523Z",
  "refresh_token": "jIyAxlsLLZQsPS7jXBufJTZtE0LwalblPG_YM59qusw",
  "refresh_expires_at": "2026-10-28T22:17:07.444077239Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
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
    "promotions.manage",
    "support.manage",
    "clients.manage",
    "clients.delete",
    "operator-bonuses.manage",
    "settings.manage",
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

`POST /api/admin/v1/staff-extensions/59c53031-c99e-4bd7-a9c3-25a0d21d702d` → **200**

```json
{
  "command_id": "2e14927a-c0e2-4181-b3a9-cc4f0a937fad",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "093d0e70-d1b1-4a79-8418-ab72a312df92",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T10:17:08.125975Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T10:17:08.125975Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "65e08e9a-639a-4cc9-95a7-b5fdecc10b6b",
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
  "id": "5fba2f8c-bf86-473a-89c1-66213031e11b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:22:08.451182Z",
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
  "command_id": "6772df6c-897d-411d-9bf3-bd9d8632967e",
  "quote_id": "5fba2f8c-bf86-473a-89c1-66213031e11b",
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
    "phone": "+380676188626"
  }
}
```

```json
{
  "id": "cbe9f0ee-3161-4ffb-b4f6-783fa11dced0",
  "short_number": 12,
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
  "created_at": "2026-10-28T10:17:08.628793Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676188626"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

**Contract validation failed — scenario stopped.**

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632149253",
  "device_ref": "sandbox-27704"
}
```

```json
{
  "challenge_id": "5de93187-8e34-4379-a188-d3780b843271",
  "expires_at": "2026-10-28T10:22:08.814615799Z",
  "resend_available_at": "2026-10-28T10:17:09.814615799Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632149253` → **200**

```json
{
  "phone": "+380632149253",
  "audience": "CLIENT",
  "code": "779957",
  "sent_at": "2026-10-28T10:17:08.816239377Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5de93187-8e34-4379-a188-d3780b843271",
  "code": "779957",
  "device_ref": "sandbox-27704"
}
```

```json
{
  "session_id": "32b3c6d5-c3d0-458c-95bf-50e569ed0ead",
  "subject": {
    "type": "CLIENT",
    "id": "515cf436-9ed9-4ca4-9f13-ff68c6a04af1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MTVjZjQzNi05ZWQ5LTRjYTQtOWYxMy1mZjY4YzZhMDRhZjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNTI4LCJpYXQiOjE3OTMxODI2MjgsImp0aSI6IjI0YTkzMjNlLTYwOWQtNDQzNy04YjI3LTU4NDZhNDA1NjJiZSIsInNpZCI6IjMyYjNjNmQ1LWMzZDAtNDU4Yy05NWJmLTUwZTU2OWVkMGVhZCJ9.cRccv81JLRqps93fR6jQ_G56uBbxQ_oLCgu56PykumM",
  "access_expires_at": "2026-10-28T10:32:08.998867346Z",
  "refresh_token": "J62uf-DkcSl-1jb2qAZj4XOjq8_9D7LRGqQYql4hU5s",
  "refresh_expires_at": "2026-11-27T10:17:08.998520327Z",
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
  "session_id": "0366112b-c49f-48bf-bd2e-1e6332a8cc75",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM1MjksImlhdCI6MTc5MzE4MjYyOSwianRpIjoiYzc4ODViMGUtN2QwYS00MzYwLWJlZGItYmFiOGM2MGE1NTgzIiwic2lkIjoiMDM2NjExMmItYzQ5Zi00OGJmLWJkMmUtMWU2MzMyYThjYzc1In0.GQthUApo22KKyoQS0NF6ejuHIp1kU52lAx06-5XYo1Q",
  "access_expires_at": "2026-10-28T10:32:09.710195533Z",
  "refresh_token": "-OR7v9eig912hcCwreofozEOnbp8YhjdIYRQ_E52iJs",
  "refresh_expires_at": "2026-10-28T22:17:09.709876482Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380632149253` → **200**

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
  "correlation_id": "d06a6548-e6bc-439f-84cb-486d4ec48964"
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
  "session_id": "bcf0b30d-b534-4fee-a835-3e35b72b9129",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM1MzAsImlhdCI6MTc5MzE4MjYzMCwianRpIjoiNjdkNjY4YTUtYzgzNS00NjE5LWJiOTYtMGYyYzk3OTAxOGQ4Iiwic2lkIjoiYmNmMGIzMGQtYjUzNC00ZmVlLWE4MzUtM2UzNWI3MmI5MTI5In0.cuE3R099JgFmnQtI0ZZSgoJc4ZJ6PLYTVrF5Fq-hN38",
  "access_expires_at": "2026-10-28T10:32:10.414011957Z",
  "refresh_token": "I3JYYyz43464ptwGoww_clXVfjgShm0PPeiEpWziyHI",
  "refresh_expires_at": "2026-10-28T22:17:10.413668099Z",
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
  "command_id": "5e8fc802-8831-4224-a3d6-560e06577ee1",
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
    }
  },
  "reason": "Sandbox: pre-orders by reservation"
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
    }
  },
  "changed_by": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T10:17:10.752824798Z"
}
```

## The rider books the airport for 2026-10-28T13:17:10Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600249308",
  "device_ref": "sandbox-17073"
}
```

```json
{
  "challenge_id": "563f0eee-a22e-4112-9f0a-6fa98407725f",
  "expires_at": "2026-10-28T10:22:10.91987208Z",
  "resend_available_at": "2026-10-28T10:17:11.91987208Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600249308` → **200**

```json
{
  "phone": "+48600249308",
  "audience": "CLIENT",
  "code": "818705",
  "sent_at": "2026-10-28T10:17:10.921525128Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "563f0eee-a22e-4112-9f0a-6fa98407725f",
  "code": "818705",
  "device_ref": "sandbox-17073"
}
```

```json
{
  "session_id": "c01d8f34-42c4-4811-a346-10eea9c134de",
  "subject": {
    "type": "CLIENT",
    "id": "6d0dd1f9-38f5-4596-9b23-f8ce467c80db"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZDBkZDFmOS0zOGY1LTQ1OTYtOWIyMy1mOGNlNDY3YzgwZGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNTMxLCJpYXQiOjE3OTMxODI2MzEsImp0aSI6ImViOTc0NWI5LTYyYTktNDc0Ny1iY2Q0LTI0YzZjMDE0Yzc3MiIsInNpZCI6ImMwMWQ4ZjM0LTQyYzQtNDgxMS1hMzQ2LTEwZWVhOWMxMzRkZSJ9.jRG1oWidjO0q9RmBzps38dxI1xYXvMWEAi2UhzD2ZEU",
  "access_expires_at": "2026-10-28T10:32:11.108267158Z",
  "refresh_token": "iDqM6h0rdH3gIqk_ECBnxNoCxxwOVYax8X0iYJCPTXE",
  "refresh_expires_at": "2026-11-27T10:17:11.107829288Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ee957665-46f3-44f3-8553-c004dab0a60d",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T13:17:10Z"
}
```

```json
{
  "id": "7816ab0d-c269-4e7f-b870-9fe6a131d1f8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:22:11.279329Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T13:17:10Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c64ef03f-1bb4-4898-bc01-179cdfe0290f",
  "quote_id": "7816ab0d-c269-4e7f-b870-9fe6a131d1f8",
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
  "pickup_at": "2026-10-28T13:17:10Z"
}
```

```json
{
  "id": "7e18f30c-e1ba-48a0-ab68-0607334de5b4",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "6d0dd1f9-38f5-4596-9b23-f8ce467c80db",
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
  "created_at": "2026-10-28T10:17:11.458592Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:17:10Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## A driver in Warsaw sees it and reserves it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-9623"
}
```

```json
{
  "challenge_id": "f07ddc12-1242-4e62-8e83-9e26f9c30cf8",
  "expires_at": "2026-10-28T10:22:11.63036211Z",
  "resend_available_at": "2026-10-28T10:17:12.63036211Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "793081",
  "sent_at": "2026-10-28T10:17:11.632077846Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f07ddc12-1242-4e62-8e83-9e26f9c30cf8",
  "code": "793081",
  "device_ref": "sandbox-9623"
}
```

```json
{
  "session_id": "5b7ccadc-d0c2-445f-92cc-93a33b1c8b5e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzUzMSwiaWF0IjoxNzkzMTgyNjMxLCJqdGkiOiIzZGM1NDBmYy1lN2I5LTRmY2QtODU2ZS01YTI4ZWJmYjFjZTkiLCJzaWQiOiI1YjdjY2FkYy1kMGMyLTQ0NWYtOTJjYy05M2EzM2IxYzhiNWUifQ.Z2XI6qdjt6KnAVRHaepiHA1Y1j3gg-vJDArrX5hwFFg",
  "access_expires_at": "2026-10-28T10:32:11.813226725Z",
  "refresh_token": "1lpzicoTYPZosvx5AwsPODw4rAByeQL-EgHv_B_zSys",
  "refresh_expires_at": "2026-11-27T10:17:11.812889537Z",
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
  "command_id": "fec7580b-1072-4d1d-ada3-2a1adf241cae",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:17:12Z",
    "sequence": 1793182632130
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f22d4614-3ff4-4aef-9320-3bb24b13e7b9",
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
  "last_heartbeat_at": "2026-10-28T10:17:12.144989Z",
  "last_location_at": "2026-10-28T10:17:12.144989Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "7e18f30c-e1ba-48a0-ab68-0607334de5b4",
      "short_number": 13,
      "pickup_at": "2026-10-28T13:17:10Z",
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

`POST /api/driver/v1/preorders/7e18f30c-e1ba-48a0-ab68-0607334de5b4/reserve` → **200**

```json
{
  "command_id": "973df40b-addd-4ee3-9635-aeaed877edfa"
}
```

```json
{
  "id": "8193f98e-42bc-4cd9-b565-26fc7232f7ef",
  "state": "RESERVED",
  "order": {
    "order_id": "7e18f30c-e1ba-48a0-ab68-0607334de5b4",
    "short_number": 13,
    "pickup_at": "2026-10-28T13:17:10Z",
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
  "reserved_at": "2026-10-28T10:17:12.486421Z",
  "confirm_from": "2026-10-28T12:47:10Z",
  "confirm_until": "2026-10-28T12:57:10Z",
  "drop_until": "2026-10-28T12:17:10Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "8193f98e-42bc-4cd9-b565-26fc7232f7ef",
      "state": "RESERVED",
      "order": {
        "order_id": "7e18f30c-e1ba-48a0-ab68-0607334de5b4",
        "short_number": 13,
        "pickup_at": "2026-10-28T13:17:10Z",
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
      "reserved_at": "2026-10-28T10:17:12.486421Z",
      "confirm_from": "2026-10-28T12:47:10Z",
      "confirm_until": "2026-10-28T12:57:10Z",
      "drop_until": "2026-10-28T12:17:10Z"
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
      "id": "8193f98e-42bc-4cd9-b565-26fc7232f7ef",
      "state": "RESERVED",
      "order": {
        "order_id": "7e18f30c-e1ba-48a0-ab68-0607334de5b4",
        "short_number": 13,
        "pickup_at": "2026-10-28T13:17:10Z",
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
      "reserved_at": "2026-10-28T10:17:12.486421Z",
      "confirm_from": "2026-10-28T12:47:10Z",
      "confirm_until": "2026-10-28T12:57:10Z",
      "drop_until": "2026-10-28T12:17:10Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/8193f98e-42bc-4cd9-b565-26fc7232f7ef/confirm` → **409**

```json
{
  "command_id": "bdd3cea4-2a8d-4eba-ae6a-5ec645793bfa"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/8193f98e-42bc-4cd9-b565-26fc7232f7ef/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a523a532-2caa-4c75-8e03-3081d6d8371b"
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
  "session_id": "f4ed98aa-4c3c-4314-b67c-4fc7e424758e",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM1MzMsImlhdCI6MTc5MzE4MjYzMywianRpIjoiNTEzNjUwNjItNTQ3OC00NTA5LWEzMWQtYWUyMGY5ODFiOTUzIiwic2lkIjoiZjRlZDk4YWEtNGMzYy00MzE0LWI2N2MtNGZjN2U0MjQ3NThlIn0.YB99dLdFF27zF6P-W-Z4qRha6uRw9cOLOXAWtz2AXyM",
  "access_expires_at": "2026-10-28T10:32:13.349213107Z",
  "refresh_token": "2GdPmuQdT2Kg35wh3R-lL0YWIOVKDe2BBFVAW2xN4Bw",
  "refresh_expires_at": "2026-10-28T22:17:13.348901417Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/7e18f30c-e1ba-48a0-ab68-0607334de5b4` → **200**

```json
{
  "id": "7e18f30c-e1ba-48a0-ab68-0607334de5b4",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "6d0dd1f9-38f5-4596-9b23-f8ce467c80db",
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
  "created_at": "2026-10-28T10:17:11.458592Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T13:17:10Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "8193f98e-42bc-4cd9-b565-26fc7232f7ef",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T10:17:12.486421Z"
  },
  "related_order_id": null
}
```

**Contract validation failed — scenario stopped.**

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-5165"
}
```

```json
{
  "challenge_id": "883760a0-5168-4d31-9a65-ca8adbd1ba1c",
  "expires_at": "2026-10-28T10:22:13.685635621Z",
  "resend_available_at": "2026-10-28T10:17:14.685635621Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "476602",
  "sent_at": "2026-10-28T10:17:13.687424097Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "883760a0-5168-4d31-9a65-ca8adbd1ba1c",
  "code": "476602",
  "device_ref": "sandbox-5165"
}
```

```json
{
  "session_id": "d2f62b31-1e48-442d-986c-46405d133890",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzUzMywiaWF0IjoxNzkzMTgyNjMzLCJqdGkiOiIyYjkyZWEwNC0xYmUwLTRkYTEtOGUyNi1iZWE0YjJiOTcwMzYiLCJzaWQiOiJkMmY2MmIzMS0xZTQ4LTQ0MmQtOTg2Yy00NjQwNWQxMzM4OTAifQ.FuXCftcW78yVnqzDJ7o2k-DJdT0064MYMRDBaZxIBAg",
  "access_expires_at": "2026-10-28T10:32:13.881584991Z",
  "refresh_token": "fd6YfWbZvERSWD1vPOhDEjdWxhYIH9cwGXTYDulUgH8",
  "refresh_expires_at": "2026-11-27T10:17:13.881198889Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8ea21c8a-862f-4043-b631-78a485206983",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:17:04.236475Z",
  "last_location_at": "2026-10-28T10:17:04.236475Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/8ea21c8a-862f-4043-b631-78a485206983/handover` → **200**

```json
{
  "command_id": "de35a61a-3959-4969-890f-aad05d6f5f82",
  "expected_version": 2
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8ea21c8a-862f-4043-b631-78a485206983",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:17:04.236475Z",
  "last_location_at": "2026-10-28T10:17:04.236475Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/8ea21c8a-862f-4043-b631-78a485206983/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:17:14Z",
    "sequence": 1793182634393
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8ea21c8a-862f-4043-b631-78a485206983",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:17:14.40858Z",
  "last_location_at": "2026-10-28T10:17:14.40858Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676764235",
  "device_ref": "sandbox-7364"
}
```

```json
{
  "challenge_id": "1c4cfdc8-021f-474a-b20b-64645ff14312",
  "expires_at": "2026-10-28T10:22:14.572086477Z",
  "resend_available_at": "2026-10-28T10:17:15.572086477Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676764235` → **200**

```json
{
  "phone": "+380676764235",
  "audience": "CLIENT",
  "code": "019317",
  "sent_at": "2026-10-28T10:17:14.573659859Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1c4cfdc8-021f-474a-b20b-64645ff14312",
  "code": "019317",
  "device_ref": "sandbox-7364"
}
```

```json
{
  "session_id": "6ab23139-4c62-4d1f-9e86-24ed7739f84a",
  "subject": {
    "type": "CLIENT",
    "id": "9e4df2f0-7e01-41b5-8870-c2a716de4da0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZTRkZjJmMC03ZTAxLTQxYjUtODg3MC1jMmE3MTZkZTRkYTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNTM0LCJpYXQiOjE3OTMxODI2MzQsImp0aSI6ImRiN2RiMWQzLWU5ZDgtNDgyOS04ZTNhLTY0ZmM2NjEyYWNlMyIsInNpZCI6IjZhYjIzMTM5LTRjNjItNGQxZi05ZTg2LTI0ZWQ3NzM5Zjg0YSJ9.hKS5XAURlz8w0Qmvoz24adqe_ONRLhBlfopo8z0NmUc",
  "access_expires_at": "2026-10-28T10:32:14.759589916Z",
  "refresh_token": "EUMBsmgTETyBe19zl8sbQzLGZ7WD9IGUmq00JqocHts",
  "refresh_expires_at": "2026-11-27T10:17:14.759215487Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c65437e2-fb18-40cc-88ae-7d633d2c0d30",
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
  "id": "1e4d4d2c-52ef-4a44-9f2e-d20d4fb40aba",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:22:14.929469Z",
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
      "id": "f7f16c43-060d-461d-837c-aecb1196ccc0",
      "name": "Осінь −10 %",
      "kind": "DISCOUNT",
      "value_type": "PERCENT",
      "value": 1000,
      "discount_minor": 1052
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "fc0869cf-59d9-4d4e-9171-bf06787e6c9e",
  "quote_id": "1e4d4d2c-52ef-4a44-9f2e-d20d4fb40aba",
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
  "id": "04e8d3dd-f47c-4141-b52d-c728361cc330",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9e4df2f0-7e01-41b5-8870-c2a716de4da0",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T10:17:15.107097Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 1052
}
```

## Driver accepts and completes the ride

`GET /api/driver/v1/offers` → **200**

```json
[]
```

`POST /api/driver/v1/offers/null/accept` → **400**

```json
{
  "command_id": "62312650-f7ae-45c2-9953-18415f37c125"
}
```

```json
{
  "instance": "/api/driver/v1/offers/null/accept",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "f994d80a-bba5-4b8f-8a89-fe5b053433d5"
}
```

**Expected 200, got 400 — scenario stopped.**

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
  "session_id": "2af1e4e1-6f58-43e9-b93e-b42e2cdbbc46",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM1MzUsImlhdCI6MTc5MzE4MjYzNSwianRpIjoiZTA4ZWMxNzAtN2Q5Ny00YmRiLTllMjUtNTA0N2Y1Mjg0ZjkwIiwic2lkIjoiMmFmMWU0ZTEtNmY1OC00M2U5LWI5M2UtYjQyZTJjZGJiYzQ2In0.EHhkjylTxf_JmYXOwOPYO1Nt27A8XjF0qVb23k-RIkI",
  "access_expires_at": "2026-10-28T10:32:15.817618215Z",
  "refresh_token": "D6ViWOTwtzM4yyZIC-1xSJxSMXHHhz2_l_pdnVY7VYM",
  "refresh_expires_at": "2026-10-28T22:17:15.817267977Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "67a4c036-1171-427f-a149-bf85a58251ae",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "51337460-7844-40fc-9e85-04bb93280d8a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:17:15.993614Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/51337460-7844-40fc-9e85-04bb93280d8a` → **200**

```json
{
  "id": "51337460-7844-40fc-9e85-04bb93280d8a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:17:15.993614Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/51337460-7844-40fc-9e85-04bb93280d8a` → **200**

```json
{
  "id": "51337460-7844-40fc-9e85-04bb93280d8a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:17:15.993614Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/51337460-7844-40fc-9e85-04bb93280d8a` → **200**

```json
{
  "id": "51337460-7844-40fc-9e85-04bb93280d8a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T10:17:15.993614Z",
  "ready_at": "2026-10-28T10:17:17.812172Z",
  "expires_at": "2026-10-29T10:17:17.812172Z"
}
```

`GET /api/admin/v1/reports/exports/51337460-7844-40fc-9e85-04bb93280d8a/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,13,2,4,0,7,10,3,0,12,1,0,0,3,1,0
total,13,2,4,0,7,10,3,0,12,1,0,0,3,1,0
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "23714f2d-bb9c-456d-8004-73c0a131b68e",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "1f61531b-295b-40db-8b40-a1a286fcd40a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:17:18.691382Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1f61531b-295b-40db-8b40-a1a286fcd40a` → **200**

```json
{
  "id": "1f61531b-295b-40db-8b40-a1a286fcd40a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:17:18.691382Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1f61531b-295b-40db-8b40-a1a286fcd40a` → **200**

```json
{
  "id": "1f61531b-295b-40db-8b40-a1a286fcd40a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:17:18.691382Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1f61531b-295b-40db-8b40-a1a286fcd40a` → **200**

```json
{
  "id": "1f61531b-295b-40db-8b40-a1a286fcd40a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:17:18.691382Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1f61531b-295b-40db-8b40-a1a286fcd40a` → **200**

```json
{
  "id": "1f61531b-295b-40db-8b40-a1a286fcd40a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:17:18.691382Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1f61531b-295b-40db-8b40-a1a286fcd40a` → **200**

```json
{
  "id": "1f61531b-295b-40db-8b40-a1a286fcd40a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T10:17:18.691382Z",
  "ready_at": "2026-10-28T10:17:22.818359Z",
  "expires_at": "2026-10-29T10:17:22.818359Z"
}
```

`GET /api/admin/v1/reports/exports/1f61531b-295b-40db-8b40-a1a286fcd40a/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,2,268.14,0.00,40.23,227.91,26.82,0.00,146.67,0.00,94.65,23.00,0.00
total,UAH,2,268.14,0.00,40.23,227.91,26.82,0.00,146.67,0.00,94.65,23.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/5e8eacc1-b949-4031-a9fc-48a4beaba792` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/5e8eacc1-b949-4031-a9fc-48a4beaba792",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9372356a-6156-4aae-8f81-ece874a03b85"
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
  "device_ref": "sandbox-15114"
}
```

```json
{
  "challenge_id": "d0c7bcea-6ac8-442c-a676-154ebfd824d9",
  "expires_at": "2026-10-28T10:22:23.864278016Z",
  "resend_available_at": "2026-10-28T10:17:24.864278016Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "257602",
  "sent_at": "2026-10-28T10:17:23.865896156Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d0c7bcea-6ac8-442c-a676-154ebfd824d9",
  "code": "257602",
  "device_ref": "sandbox-15114"
}
```

```json
{
  "session_id": "9fd378f8-fa45-404f-9710-c62f927c39d5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzU0NCwiaWF0IjoxNzkzMTgyNjQ0LCJqdGkiOiI1MjZjOWI4OS03MGZkLTQwMWMtOGE3OS1iMTE2YmMwYjQ4NDgiLCJzaWQiOiI5ZmQzNzhmOC1mYTQ1LTQwNGYtOTcxMC1jNjJmOTI3YzM5ZDUifQ.mcSy97woywAUglfTNXUY-FME5GybrPzHju3lUf-pKoU",
  "access_expires_at": "2026-10-28T10:32:24.048723809Z",
  "refresh_token": "v9vR8mhClENQP9NamY8pdvO1nNjPpIKM3T_Oheivfg4",
  "refresh_expires_at": "2026-11-27T10:17:24.048421994Z",
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
  "command_id": "2578af08-6db2-4fde-b8b2-17012eef5678",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:17:24Z",
    "sequence": 1793182644519
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "15ea613f-481c-4ef1-be40-90eb2cca7da4",
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
  "last_heartbeat_at": "2026-10-28T10:17:24.537319Z",
  "last_location_at": "2026-10-28T10:17:24.537319Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "f9010517-cbc9-4db9-9b13-c9ea4f893f6c",
  "points": [
    {
      "sequence": 1793182646701,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T10:16:26Z"
    },
    {
      "sequence": 1793182646707,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T10:17:26Z"
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
  "session_id": "64b357d5-2802-4aa8-afa7-f96ffd1a25a6",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM1NDcsImlhdCI6MTc5MzE4MjY0NywianRpIjoiNTY5MDQyZmQtYTI2Ni00NmFmLWI2M2EtNmZhM2QwNjQ0YzNmIiwic2lkIjoiNjRiMzU3ZDUtMjgwMi00YWE4LWFmYTctZjk2ZmZkMWEyNWE2In0.eg0ZhSfrQ7pLHQ8I4iF1h87SuSLUuTPBdW4Uvb2BaY8",
  "access_expires_at": "2026-10-28T10:32:27.099075477Z",
  "refresh_token": "8h4wI9L8hceNcd-aZNB3WjsZD_Ra-28sRNFpabSXorc",
  "refresh_expires_at": "2026-10-28T22:17:27.098690035Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": []
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "1146bd5d-0259-4b0a-b085-5e6a5e396b21",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T10:17:26Z",
        "track_point_id": "737df37f-5774-4c8e-b2da-df11aed71a4c",
        "work_session_id": "15ea613f-481c-4ef1-be40-90eb2cca7da4"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T10:17:26Z",
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
    "version": 4,
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

`POST /api/admin/v1/driver-risk-flags/1146bd5d-0259-4b0a-b085-5e6a5e396b21/confirm` → **200**

```json
{
  "command_id": "88c8ffee-87b4-4160-922f-f98690d1b18b",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "1146bd5d-0259-4b0a-b085-5e6a5e396b21",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T10:17:26Z",
    "track_point_id": "737df37f-5774-4c8e-b2da-df11aed71a4c",
    "work_session_id": "15ea613f-481c-4ef1-be40-90eb2cca7da4"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T10:17:26Z",
  "reason": null,
  "reviewed_by": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
  "reviewed_at": "2026-10-28T10:17:28.783346Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/1146bd5d-0259-4b0a-b085-5e6a5e396b21/dismiss` → **409**

```json
{
  "command_id": "83d47850-3748-489b-9e34-1b1154ec3627",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/1146bd5d-0259-4b0a-b085-5e6a5e396b21/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2ac2b3cb-d552-4b27-ac14-b6cf84684685"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "e874bce6-acc2-4e07-b94c-5ba2ccc9a4ec",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "8133265f-42fa-4066-ae95-81fb8c158238",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
  "raised_at": "2026-10-28T10:17:29.127715Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/8133265f-42fa-4066-ae95-81fb8c158238/dismiss` → **200**

```json
{
  "command_id": "55581d89-61ff-4e3f-80b6-a2506575cd0b",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "8133265f-42fa-4066-ae95-81fb8c158238",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
  "raised_at": "2026-10-28T10:17:29.127715Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
  "reviewed_at": "2026-10-28T10:17:29.296699Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "1a13e675-bd1a-4265-a3c6-6c7a4fc963cb",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "1146bd5d-0259-4b0a-b085-5e6a5e396b21"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "SUSPENDED",
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
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:17:29.469699Z"
    }
  ]
}
```

Done: flag 1146bd5d-0259-4b0a-b085-5e6a5e396b21 confirmed, suspension named it, driver reinstated.

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
  "session_id": "a41d7565-0f51-4bd6-995f-07e61aa2bb4b",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM1NDksImlhdCI6MTc5MzE4MjY0OSwianRpIjoiMDc5MDA3MTYtNDc3Ni00NmRkLWIzY2MtNjYzM2ViZTgzNjQyIiwic2lkIjoiYTQxZDc1NjUtMGY1MS00YmQ2LTk5NWYtMDdlNjFhYTJiYjRiIn0.MbcUo9uGYCrKbsNX_4oe_aRKZuxdlM2-Q_lSmKwTK84",
  "access_expires_at": "2026-10-28T10:32:29.98912097Z",
  "refresh_token": "62rTBnLP-e-IX7ymlIJc9sDY-4XLC97RsJ_RUhxdVoo",
  "refresh_expires_at": "2026-10-28T22:17:29.988801848Z",
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
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:17:29.469699Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "4318825b-7e9d-472d-9002-ede46c8e6931",
  "expected_version": 5,
  "reason": "Sandbox clean-up"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "15ea613f-481c-4ef1-be40-90eb2cca7da4",
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
  "last_heartbeat_at": "2026-10-28T10:17:24.537319Z",
  "last_location_at": "2026-10-28T10:17:24.537319Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/15ea613f-481c-4ef1-be40-90eb2cca7da4/close` → **200**

```json
{
  "command_id": "af5eede1-9cdf-4532-a831-e5b7cf6e2274",
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
  "session_id": "4996ef8b-6d5f-4b78-95b7-09b2c1e48be1",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM1NTEsImlhdCI6MTc5MzE4MjY1MSwianRpIjoiNjY2YzZmMTAtZGQyYS00OTgxLWI5YzQtYjM5YTAxMjNjNjUyIiwic2lkIjoiNDk5NmVmOGItNmQ1Zi00Yjc4LTk1YjctMDliMmMxZTQ4YmUxIn0.byNmBbPohKK5DqenKciMaXCIOuB-SNOV2sSTuEqcFYE",
  "access_expires_at": "2026-10-28T10:32:31.05124456Z",
  "refresh_token": "RWxsijyEgjMrHqfxDAVYysMFNfh3EypQBuIIOcyp0P0",
  "refresh_expires_at": "2026-10-28T22:17:31.050925649Z",
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
  "command_id": "0c488803-1cc8-4c68-8efb-424552eb879d",
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
  "changed_by": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T10:17:31.395681Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "0c488803-1cc8-4c68-8efb-424552eb879d",
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
  "changed_by": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T10:17:31.395681Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48684852413",
  "device_ref": "sandbox-28950"
}
```

```json
{
  "challenge_id": "a3ead7b7-9885-4e34-9e36-dc65655933da",
  "expires_at": "2026-10-28T10:22:31.758914816Z",
  "resend_available_at": "2026-10-28T10:17:32.758914816Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48684852413` → **200**

```json
{
  "phone": "+48684852413",
  "audience": "CLIENT",
  "code": "140560",
  "sent_at": "2026-10-28T10:17:31.76066874Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a3ead7b7-9885-4e34-9e36-dc65655933da",
  "code": "140560",
  "device_ref": "sandbox-28950"
}
```

```json
{
  "session_id": "cb96287a-8587-4347-9f67-1fdbefedf0f4",
  "subject": {
    "type": "CLIENT",
    "id": "0c07f2e0-05d8-46ae-8863-6afdbab47620"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYzA3ZjJlMC0wNWQ4LTQ2YWUtODg2My02YWZkYmFiNDc2MjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNTUxLCJpYXQiOjE3OTMxODI2NTEsImp0aSI6IjA0ODI0MTE4LTE2NTktNDY1Ny1hYzU0LTM4MjZlNDAzN2FmMiIsInNpZCI6ImNiOTYyODdhLTg1ODctNDM0Ny05ZjY3LTFmZGJlZmVkZjBmNCJ9.uFO2B6-ngtnT_nXBhPq-LljH097QxedR_LTCjOG7TvQ",
  "access_expires_at": "2026-10-28T10:32:31.937879332Z",
  "refresh_token": "yVfpD3X_Ur6ZjWmFBw4vHPHsLsQbK0kZ4nRQyyBUziI",
  "refresh_expires_at": "2026-11-27T10:17:31.937564097Z",
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
  "correlation_id": "facea2b3-46b2-4ebe-bb21-cfb23d1fab04"
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
  "device_ref": "sandbox-5499"
}
```

```json
{
  "challenge_id": "07b364ee-8b1a-426a-b4ae-2c8d071f0712",
  "expires_at": "2026-10-28T10:22:32.433023902Z",
  "resend_available_at": "2026-10-28T10:17:33.433023902Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "890878",
  "sent_at": "2026-10-28T10:17:32.43455911Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "07b364ee-8b1a-426a-b4ae-2c8d071f0712",
  "code": "890878",
  "device_ref": "sandbox-5499"
}
```

```json
{
  "session_id": "7bed9a99-925e-47f4-bf41-f8edf6c03915",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzU1MiwiaWF0IjoxNzkzMTgyNjUyLCJqdGkiOiI2NGEzNjM0YS03NGRkLTQ3MzItYWI0NC1kNDk5YTVhN2VlNTEiLCJzaWQiOiI3YmVkOWE5OS05MjVlLTQ3ZjQtYmY0MS1mOGVkZjZjMDM5MTUifQ.NzZR-VFTUVtlJSb4jCYQY57YljWC5IzkIP4zBlVdxCE",
  "access_expires_at": "2026-10-28T10:32:32.612274469Z",
  "refresh_token": "rlQ5U4CgIfekbRzuY8LccUe5DVJ-Le5oA1ErtZFdwR4",
  "refresh_expires_at": "2026-11-27T10:17:32.611945343Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f22d4614-3ff4-4aef-9320-3bb24b13e7b9",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-28T10:17:12.144989Z",
  "last_location_at": "2026-10-28T10:17:12.144989Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f22d4614-3ff4-4aef-9320-3bb24b13e7b9/handover` → **200**

```json
{
  "command_id": "a6bfa2c7-250d-42de-a1b2-836aed306f22",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f22d4614-3ff4-4aef-9320-3bb24b13e7b9",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-28T10:17:12.144989Z",
  "last_location_at": "2026-10-28T10:17:12.144989Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f22d4614-3ff4-4aef-9320-3bb24b13e7b9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:17:33Z",
    "sequence": 1793182653109
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f22d4614-3ff4-4aef-9320-3bb24b13e7b9",
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
  "last_heartbeat_at": "2026-10-28T10:17:33.127942Z",
  "last_location_at": "2026-10-28T10:17:33.127942Z",
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
  "session_id": "f22d4614-3ff4-4aef-9320-3bb24b13e7b9",
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
  "last_heartbeat_at": "2026-10-28T10:17:33.127942Z",
  "last_location_at": "2026-10-28T10:17:33.127942Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f22d4614-3ff4-4aef-9320-3bb24b13e7b9/close` → **200**

```json
{
  "command_id": "228790d0-8218-4f7f-81f1-a3b4f61c1075",
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
  "correlation_id": "f99fc26d-2674-48a7-ac2d-b64ab49d64d1"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673309075",
  "device_ref": "sandbox-6457"
}
```

```json
{
  "challenge_id": "4eb34066-a15b-4eb5-8448-2e839e37134a",
  "expires_at": "2026-10-28T10:22:33.96912396Z",
  "resend_available_at": "2026-10-28T10:17:34.96912396Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673309075` → **200**

```json
{
  "phone": "+380673309075",
  "audience": "CLIENT",
  "code": "481644",
  "sent_at": "2026-10-28T10:17:33.971187351Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4eb34066-a15b-4eb5-8448-2e839e37134a",
  "code": "481644",
  "device_ref": "sandbox-6457"
}
```

```json
{
  "session_id": "97b89bab-abda-4734-a249-49a65b21a349",
  "subject": {
    "type": "CLIENT",
    "id": "c9d7b151-76f3-4389-9a20-63ee4f23c232"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOWQ3YjE1MS03NmYzLTQzODktOWEyMC02M2VlNGYyM2MyMzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNTU0LCJpYXQiOjE3OTMxODI2NTQsImp0aSI6ImU1MzI1OTcxLTE1ZTQtNDJmNy04OGM4LTNiYThiY2MxYWUzMyIsInNpZCI6Ijk3Yjg5YmFiLWFiZGEtNDczNC1hMjQ5LTQ5YTY1YjIxYTM0OSJ9.Xk1vnMGVX-8cUhBU_pJKmjrhlOdlDpP_lcUYKayPH4M",
  "access_expires_at": "2026-10-28T10:32:34.155400438Z",
  "refresh_token": "1-s9U58ANZMvWSPNH3umtOyCSnR18RTqP5bFwGFv8x4",
  "refresh_expires_at": "2026-11-27T10:17:34.155107667Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "6f136715-0c0e-4752-ae91-6784fafb230a",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "35f9cfc7-cf0f-4bfc-ba5b-7469babe2419",
  "upload_path": "/api/rider/v1/uploads/35f9cfc7-cf0f-4bfc-ba5b-7469babe2419",
  "expires_at": "2026-10-28T10:32:34.324550651Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/35f9cfc7-cf0f-4bfc-ba5b-7469babe2419` → **200**

```json
{
  "file_id": "35f9cfc7-cf0f-4bfc-ba5b-7469babe2419",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "012aa29b-816e-4d8b-b02b-a7a96a0a83c8",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "35f9cfc7-cf0f-4bfc-ba5b-7469babe2419"
  ]
}
```

```json
{
  "id": "0d00f0f7-70b0-437b-a877-aa0ead1a2659",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "c9d7b151-76f3-4389-9a20-63ee4f23c232",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T10:17:34.560636Z",
  "updated_at": "2026-10-28T10:17:34.560636Z",
  "messages": [
    {
      "id": "d928ef11-4d62-460b-ac83-262dafae728a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "c9d7b151-76f3-4389-9a20-63ee4f23c232",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:17:34.561659Z",
      "attachments": [
        {
          "file_id": "35f9cfc7-cf0f-4bfc-ba5b-7469babe2419",
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
  "session_id": "3ef0b037-3d21-42b8-9e70-2849b2bc7d1d",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM1NTQsImlhdCI6MTc5MzE4MjY1NCwianRpIjoiMmI1ZWRmOGQtNDI3ZS00MTYyLTgwNjktNTRkYWQ5ZGRkMjRjIiwic2lkIjoiM2VmMGIwMzctM2QyMS00MmI4LTllNzAtMjg0OWIyYmM3ZDFkIn0.sXVSQhms59RnIn2yzLrzmq7k134og7q8HDtnzK6L-ag",
  "access_expires_at": "2026-10-28T10:32:34.934536733Z",
  "refresh_token": "KfeUgg_Vmx6rK42LDade6EBVfTxZbBzlnpon2i4C35c",
  "refresh_expires_at": "2026-10-28T22:17:34.93418299Z",
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
  "session_id": "162740d4-3705-4880-9375-848bd4119c65",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM1NTUsImlhdCI6MTc5MzE4MjY1NSwianRpIjoiZTczNDBlYTgtYmM2Yy00NzA1LWFlNGUtNTgyMGE2NmNhZDgzIiwic2lkIjoiMTYyNzQwZDQtMzcwNS00ODgwLTkzNzUtODQ4YmQ0MTE5YzY1In0.WtMhMieCswhB4C7-z40i3NWmVSqvK8K5Ld_7pJK2yMo",
  "access_expires_at": "2026-10-28T10:32:35.292942709Z",
  "refresh_token": "tHuTXIz7XLo57LF-cnPSNHkuGql0JusI-K6psZcSwiA",
  "refresh_expires_at": "2026-10-28T22:17:35.292547108Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/0d00f0f7-70b0-437b-a877-aa0ead1a2659/attachments/35f9cfc7-cf0f-4bfc-ba5b-7469babe2419` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "a3d65023-eb3c-4091-8667-b28abfbc4980",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "d11f0df6-5f0c-4362-9ddd-3333dfc2b8f4",
  "upload_path": "/api/operator/v1/uploads/d11f0df6-5f0c-4362-9ddd-3333dfc2b8f4",
  "expires_at": "2026-10-28T10:32:35.466445202Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/d11f0df6-5f0c-4362-9ddd-3333dfc2b8f4` → **200**

```json
{
  "file_id": "d11f0df6-5f0c-4362-9ddd-3333dfc2b8f4",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/0d00f0f7-70b0-437b-a877-aa0ead1a2659` → **200**

```json
{
  "id": "0d00f0f7-70b0-437b-a877-aa0ead1a2659",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "c9d7b151-76f3-4389-9a20-63ee4f23c232",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T10:17:34.560636Z",
  "updated_at": "2026-10-28T10:17:34.560636Z",
  "messages": [
    {
      "id": "d928ef11-4d62-460b-ac83-262dafae728a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "c9d7b151-76f3-4389-9a20-63ee4f23c232",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:17:34.561659Z",
      "attachments": [
        {
          "file_id": "35f9cfc7-cf0f-4bfc-ba5b-7469babe2419",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/0d00f0f7-70b0-437b-a877-aa0ead1a2659/comments` → **200**

```json
{
  "command_id": "82d855ac-f9ab-4122-9dfe-b0438ad24576",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "d11f0df6-5f0c-4362-9ddd-3333dfc2b8f4"
  ]
}
```

```json
{
  "id": "0d00f0f7-70b0-437b-a877-aa0ead1a2659",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "c9d7b151-76f3-4389-9a20-63ee4f23c232",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T10:17:34.560636Z",
  "updated_at": "2026-10-28T10:17:35.820845Z",
  "messages": [
    {
      "id": "d928ef11-4d62-460b-ac83-262dafae728a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "c9d7b151-76f3-4389-9a20-63ee4f23c232",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:17:34.561659Z",
      "attachments": [
        {
          "file_id": "35f9cfc7-cf0f-4bfc-ba5b-7469babe2419",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "1614b9b8-d092-47b2-9b6b-10ef6f03d5b5",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T10:17:35.820497Z",
      "attachments": [
        {
          "file_id": "d11f0df6-5f0c-4362-9ddd-3333dfc2b8f4",
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

`GET /api/rider/v1/support/cases/0d00f0f7-70b0-437b-a877-aa0ead1a2659` → **200**

```json
{
  "id": "0d00f0f7-70b0-437b-a877-aa0ead1a2659",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "c9d7b151-76f3-4389-9a20-63ee4f23c232",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T10:17:34.560636Z",
  "updated_at": "2026-10-28T10:17:35.820845Z",
  "messages": [
    {
      "id": "d928ef11-4d62-460b-ac83-262dafae728a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "c9d7b151-76f3-4389-9a20-63ee4f23c232",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:17:34.561659Z",
      "attachments": [
        {
          "file_id": "35f9cfc7-cf0f-4bfc-ba5b-7469babe2419",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "1614b9b8-d092-47b2-9b6b-10ef6f03d5b5",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T10:17:35.820497Z",
      "attachments": [
        {
          "file_id": "d11f0df6-5f0c-4362-9ddd-3333dfc2b8f4",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/0d00f0f7-70b0-437b-a877-aa0ead1a2659/attachments/d11f0df6-5f0c-4362-9ddd-3333dfc2b8f4` → **200**

Done: support case 0d00f0f7-70b0-437b-a877-aa0ead1a2659, rider attachment 35f9cfc7-cf0f-4bfc-ba5b-7469babe2419, operator attachment d11f0df6-5f0c-4362-9ddd-3333dfc2b8f4.

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
  "session_id": "715284b1-7e56-4009-9cfd-b8c63443c5b4",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM1NTYsImlhdCI6MTc5MzE4MjY1NiwianRpIjoiZDcyNDQ5MzgtMmZkNy00NzNmLWIxNjYtZTFlOTAzOWRhNTUzIiwic2lkIjoiNzE1Mjg0YjEtN2U1Ni00MDA5LTljZmQtYjhjNjM0NDNjNWI0In0.1I5KRiAJwMi1H1ey3K1xwskn-U8ffEFa8e1QnlSc5KU",
  "access_expires_at": "2026-10-28T10:32:36.38252548Z",
  "refresh_token": "OQeMs-msJNjGqQQ4iIxL-_8sDWTda9-7raWkoTOHIB0",
  "refresh_expires_at": "2026-10-28T22:17:36.382088752Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-22098"
}
```

```json
{
  "challenge_id": "62c17257-e7e2-4a30-b548-e006febca62a",
  "expires_at": "2026-10-28T10:22:36.549581336Z",
  "resend_available_at": "2026-10-28T10:17:37.549581336Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "721586",
  "sent_at": "2026-10-28T10:17:36.551272475Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62c17257-e7e2-4a30-b548-e006febca62a",
  "code": "721586",
  "device_ref": "sandbox-22098"
}
```

```json
{
  "session_id": "387b5537-3765-4963-949a-c9ca4e6ddfc7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzU1NiwiaWF0IjoxNzkzMTgyNjU2LCJqdGkiOiJjMWY4YmQwMy0yNzZkLTRhMjMtODRjMi02MDgzNTg5MGZiYTYiLCJzaWQiOiIzODdiNTUzNy0zNzY1LTQ5NjMtOTQ5YS1jOWNhNGU2ZGRmYzcifQ.UHzLCwyQS43c_jW1qDQV-rcBagEXUnRNt-LppTAydOQ",
  "access_expires_at": "2026-10-28T10:32:36.736445981Z",
  "refresh_token": "_3_TuW5NAeSJIT2MiQZccxQSYMfthodH7n5uR8tAWFQ",
  "refresh_expires_at": "2026-11-27T10:17:36.735904625Z",
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
  },
  "phone": "+380500000003",
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:17:29.469699Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T10:17:30.337746Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "3b52b9d0-2b64-47fd-81d5-5ca1ded6883d",
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
  "review_status": "APPROVED",
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
  "device_ref": "sandbox-21009"
}
```

```json
{
  "challenge_id": "58758c42-1900-449d-9481-d88da8a952ca",
  "expires_at": "2026-10-28T10:22:37.414694079Z",
  "resend_available_at": "2026-10-28T10:17:38.414694079Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "054946",
  "sent_at": "2026-10-28T10:17:37.416377713Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "58758c42-1900-449d-9481-d88da8a952ca",
  "code": "054946",
  "device_ref": "sandbox-21009"
}
```

```json
{
  "session_id": "96ff0966-5358-4631-b789-55265ac00774",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzU1NywiaWF0IjoxNzkzMTgyNjU3LCJqdGkiOiIzMDNkOTc1NS0zYzZmLTQ4NzctOTZkZi1jNmFjMmY2NWY4Y2EiLCJzaWQiOiI5NmZmMDk2Ni01MzU4LTQ2MzEtYjc4OS01NTI2NWFjMDA3NzQifQ.eCDwHb7Wg15B4075QER2oV0XXMd8Njlsds0h2rpqNGE",
  "access_expires_at": "2026-10-28T10:32:37.597312873Z",
  "refresh_token": "_tw2d82V3OSUFe74ilQ-1XB7oA3zkORE9yOxbr8iUEc",
  "refresh_expires_at": "2026-11-27T10:17:37.596940612Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8ea21c8a-862f-4043-b631-78a485206983",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:17:14.40858Z",
  "last_location_at": "2026-10-28T10:17:14.40858Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/8ea21c8a-862f-4043-b631-78a485206983/handover` → **200**

```json
{
  "command_id": "6aed974f-03b4-46d7-83eb-c01257fd0794",
  "expected_version": 3
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8ea21c8a-862f-4043-b631-78a485206983",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:17:14.40858Z",
  "last_location_at": "2026-10-28T10:17:14.40858Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/8ea21c8a-862f-4043-b631-78a485206983/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:17:38Z",
    "sequence": 1793182658138
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8ea21c8a-862f-4043-b631-78a485206983",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:17:38.15339Z",
  "last_location_at": "2026-10-28T10:17:38.15339Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
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
  "command_id": "ac7b4f73-271c-4777-a246-3be2315d86b0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:17:38Z",
    "sequence": 1793182658473
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "70714f0d-c6dd-4d77-a792-b937222f8ad7",
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
  "last_heartbeat_at": "2026-10-28T10:17:38.48781Z",
  "last_location_at": "2026-10-28T10:17:38.48781Z",
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
  "session_id": "7df4a0bb-3da6-4176-a135-903c6ed4ef22",
  "subject": {
    "type": "STAFF",
    "id": "59c53031-c99e-4bd7-a9c3-25a0d21d702d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWM1MzAzMS1jOTllLTRiZDctYTljMy0yNWEwZDIxZDcwMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM1NTgsImlhdCI6MTc5MzE4MjY1OCwianRpIjoiMGE4NmY5YmMtMTM0MC00NGNlLThjYzctZDIwYWVkNmFkM2VjIiwic2lkIjoiN2RmNGEwYmItM2RhNi00MTc2LWExMzUtOTAzYzZlZDRlZjIyIn0.DFS9fIb78OCNVzRHU0ZLPyggp-K6dzWjqMHhGImc_08",
  "access_expires_at": "2026-10-28T10:32:38.847564704Z",
  "refresh_token": "-9qxjUEg1VkT8lPzaJkXP7mMOCEGEdtrk72AYpI9BIc",
  "refresh_expires_at": "2026-10-28T22:17:38.846960027Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "426fa46e-9c63-4061-a792-74e427b1bb0a",
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
  "id": "1021a4c3-6b53-44cf-8fb4-75a5cbba858e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:22:39.016329Z",
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
  "command_id": "e41c8e65-4f71-4e97-86f1-5676f054a261",
  "quote_id": "1021a4c3-6b53-44cf-8fb4-75a5cbba858e",
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
  "id": "b99d1f60-aaa8-4ea6-a784-56c2248b0421",
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
  "created_at": "2026-10-28T10:17:39.200995Z",
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

**Contract validation failed — scenario stopped.**
