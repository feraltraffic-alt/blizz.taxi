# Sandbox transcript (2026-10-27T20:17:20Z, 03b89e0)

# Scenario: call-recording

## The admin says which city the service number belongs to

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
  "correlation_id": "f337c453-9a37-4f59-9444-10d04b481d07"
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
  "session_id": "6f2c2bb4-879b-428f-9dcb-f8affb43cc43",
  "subject": {
    "type": "STAFF",
    "id": "9bdd3f4f-d864-465b-93f6-ef99e4d0e27f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmRkM2Y0Zi1kODY0LTQ2NWItOTNmNi1lZjk5ZTRkMGUyN2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMxNDEsImlhdCI6MTc5MzEzMjI0MSwianRpIjoiNDgyMWVkYjMtMWE4MC00NTM1LWE2Y2ItYzhjYzdjZDY5ZWY3Iiwic2lkIjoiNmYyYzJiYjQtODc5Yi00MjhmLTlkY2ItZjhhZmZiNDNjYzQzIn0.Q0p9kJUNdKMWu0A5Q25paAT1x__3zxW9XBUwm2AAQdg",
  "access_expires_at": "2026-10-27T20:32:21.295757384Z",
  "refresh_token": "_kR6dZwP3uwNflpb9uF-Zry7utK4A_NKpAY9J7l2sXM",
  "refresh_expires_at": "2026-10-28T08:17:21.29354905Z",
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
  "session_id": "02b0f2f0-e229-49bb-826e-c3da08daba9a",
  "subject": {
    "type": "STAFF",
    "id": "9bdd3f4f-d864-465b-93f6-ef99e4d0e27f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmRkM2Y0Zi1kODY0LTQ2NWItOTNmNi1lZjk5ZTRkMGUyN2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMxNDIsImlhdCI6MTc5MzEzMjI0MiwianRpIjoiYzg1NGZiNWItZWNiNy00OWJmLTgyNzUtMmNkZTQ3ZTY1NGE5Iiwic2lkIjoiMDJiMGYyZjAtZTIyOS00OWJiLTgyNmUtYzNkYTA4ZGFiYTlhIn0.BsRAQglCwBEpOr4OLOsZK_W1BEZEMNQqRM7xKbRbW98",
  "access_expires_at": "2026-10-27T20:32:22.587768869Z",
  "refresh_token": "XOdHVON_c4hYcgJhlNtFgwt26K_dqgycAWpruvpasUs",
  "refresh_expires_at": "2026-10-28T08:17:22.585525409Z",
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
  "command_id": "9af8d758-e30e-4326-a876-88b0505c8579",
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
  "session_id": "45fcf6bc-bb37-4d7c-9487-51f9b1962eec",
  "subject": {
    "type": "STAFF",
    "id": "9bdd3f4f-d864-465b-93f6-ef99e4d0e27f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmRkM2Y0Zi1kODY0LTQ2NWItOTNmNi1lZjk5ZTRkMGUyN2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMxNDMsImlhdCI6MTc5MzEzMjI0MywianRpIjoiODI0ZGY5NzEtNzQ3YS00YzcxLTk4OWEtYmIyNmI4MGFmYmFhIiwic2lkIjoiNDVmY2Y2YmMtYmIzNy00ZDdjLTk0ODctNTFmOWIxOTYyZWVjIn0.KP5P9ZAHM5jLznCDmgMoLR19eJIk9SIUPr5a_tlkRDk",
  "access_expires_at": "2026-10-27T20:32:23.03599626Z",
  "refresh_token": "e6nELhVBDwV_TcjJ9c7QcemlueZlN2c8H3QIogQjU7w",
  "refresh_expires_at": "2026-10-28T08:17:23.035026875Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.1557228573",
    "linkedid": "1730052700.1557228573",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674243803"
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
    "id": "1730052700.1557228573",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "2fa51d1e-0295-4522-b6f0-2a52ab03c9f2",
      "state": "MISSED",
      "caller_phone": "+380674243803",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-27T20:17:23.071455Z",
      "answered_at": null,
      "ended_at": "2026-10-27T20:17:23.097818Z",
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
    "id": "1730052600.630027063",
    "linkedid": "1730052600.630027063",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674243803"
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
      "id": "4a5cf032-e4ba-4401-b510-1e806879ed2e",
      "state": "RINGING",
      "caller_phone": "+380674243803",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-27T20:17:23.173724Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/4a5cf032-e4ba-4401-b510-1e806879ed2e/answer` → **200**

```json
{
  "command_id": "1c402955-ea96-4ac2-b2f6-ead15675b881"
}
```

```json
{
  "id": "4a5cf032-e4ba-4401-b510-1e806879ed2e",
  "state": "ANSWERED",
  "caller_phone": "+380674243803",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "9bdd3f4f-d864-465b-93f6-ef99e4d0e27f",
  "order_ids": [],
  "started_at": "2026-10-27T20:17:23.173724Z",
  "answered_at": "2026-10-27T20:17:23.247905Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.630027063",
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
    "id": "1730052600.630027063",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "4a5cf032-e4ba-4401-b510-1e806879ed2e",
      "state": "ENDED",
      "caller_phone": "+380674243803",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9bdd3f4f-d864-465b-93f6-ef99e4d0e27f",
      "order_ids": [],
      "started_at": "2026-10-27T20:17:23.173724Z",
      "answered_at": "2026-10-27T20:17:23.247905Z",
      "ended_at": "2026-10-27T20:17:23.301899Z",
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
      "id": "4a5cf032-e4ba-4401-b510-1e806879ed2e",
      "state": "ENDED",
      "caller_phone": "+380674243803",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9bdd3f4f-d864-465b-93f6-ef99e4d0e27f",
      "order_ids": [],
      "started_at": "2026-10-27T20:17:23.173724Z",
      "answered_at": "2026-10-27T20:17:23.247905Z",
      "ended_at": "2026-10-27T20:17:23.301899Z",
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
      "id": "4a5cf032-e4ba-4401-b510-1e806879ed2e",
      "state": "ENDED",
      "caller_phone": "+380674243803",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9bdd3f4f-d864-465b-93f6-ef99e4d0e27f",
      "order_ids": [],
      "started_at": "2026-10-27T20:17:23.173724Z",
      "answered_at": "2026-10-27T20:17:23.247905Z",
      "ended_at": "2026-10-27T20:17:23.301899Z",
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
      "id": "4a5cf032-e4ba-4401-b510-1e806879ed2e",
      "state": "ENDED",
      "caller_phone": "+380674243803",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9bdd3f4f-d864-465b-93f6-ef99e4d0e27f",
      "order_ids": [],
      "started_at": "2026-10-27T20:17:23.173724Z",
      "answered_at": "2026-10-27T20:17:23.247905Z",
      "ended_at": "2026-10-27T20:17:23.301899Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-27T20:17:29.098845Z"
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
      "id": "4a5cf032-e4ba-4401-b510-1e806879ed2e",
      "state": "ENDED",
      "caller_phone": "+380674243803",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9bdd3f4f-d864-465b-93f6-ef99e4d0e27f",
      "order_ids": [],
      "started_at": "2026-10-27T20:17:23.173724Z",
      "answered_at": "2026-10-27T20:17:23.247905Z",
      "ended_at": "2026-10-27T20:17:23.301899Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-27T20:17:29.098845Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/4a5cf032-e4ba-4401-b510-1e806879ed2e/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/4a5cf032-e4ba-4401-b510-1e806879ed2e/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=4a5cf032-e4ba-4401-b510-1e806879ed2e` → **200**

```json
{
  "changes": [
    {
      "id": "298f591a-5435-4390-a1b2-f89b4ac2ae60",
      "occurred_at": "2026-10-27T20:17:29.52999Z",
      "actor_type": "STAFF",
      "actor_id": "9bdd3f4f-d864-465b-93f6-ef99e4d0e27f",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "4a5cf032-e4ba-4401-b510-1e806879ed2e",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"891a1821-cabd-4d88-967e-c113d869e4aa\", \"order_ids\": []}",
      "correlation_id": "be534ec4-9101-4616-ab39-a0a3cd8019f1"
    },
    {
      "id": "96ce06f7-c2c7-41f3-a5ff-5597bc8d2da0",
      "occurred_at": "2026-10-27T20:17:29.496515Z",
      "actor_type": "STAFF",
      "actor_id": "9bdd3f4f-d864-465b-93f6-ef99e4d0e27f",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "4a5cf032-e4ba-4401-b510-1e806879ed2e",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"891a1821-cabd-4d88-967e-c113d869e4aa\", \"order_ids\": []}",
      "correlation_id": "26bf24f3-d3c8-4a2d-adb0-813e090b9326"
    }
  ]
}
```

Done: call 4a5cf032-e4ba-4401-b510-1e806879ed2e recorded, listened to twice.
