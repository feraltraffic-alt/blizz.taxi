# Sandbox transcript (2026-10-27T19:52:38Z, 4ee6023)

# Scenario: incoming-call

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
  "correlation_id": "6712e343-d4da-4b09-8ecf-824aedf83a9f"
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
  "session_id": "9152fbe9-c967-48ba-bfc9-0df2eaf020d6",
  "subject": {
    "type": "STAFF",
    "id": "dce5e68c-95e8-4998-b059-69295b0f11d6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkY2U1ZTY4Yy05NWU4LTQ5OTgtYjA1OS02OTI5NWIwZjExZDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE2NTgsImlhdCI6MTc5MzEzMDc1OCwianRpIjoiZWIwMTYwZjgtNWNmYi00ZDA5LWJiZTUtNWIyOTI5YTQ2YmRmIiwic2lkIjoiOTE1MmZiZTktYzk2Ny00OGJhLWJmYzktMGRmMmVhZjAyMGQ2In0.E47vu8vwIHUgF5n--SAC1qJNqmnTj02SWTWp04CNWlg",
  "access_expires_at": "2026-10-27T20:07:38.848274898Z",
  "refresh_token": "t-AgzO4PDKoc3pHSyTCbm4iXwrm6PFZJub9F9MVC2zk",
  "refresh_expires_at": "2026-10-28T07:52:38.845918367Z",
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
  "session_id": "733210ac-f4ed-4361-bbf8-44e89b9a4663",
  "subject": {
    "type": "STAFF",
    "id": "dce5e68c-95e8-4998-b059-69295b0f11d6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkY2U1ZTY4Yy05NWU4LTQ5OTgtYjA1OS02OTI5NWIwZjExZDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE2NjAsImlhdCI6MTc5MzEzMDc2MCwianRpIjoiZGI2MjA2NTAtNTUyMy00YzNlLTliNjUtYTgxYzA5YWRiYjU0Iiwic2lkIjoiNzMzMjEwYWMtZjRlZC00MzYxLWJiZjgtNDRlODliOWE0NjYzIn0.dN2TTvWEp22LilbvSdI_PgoQuZr5acQQgsOynSkqmsE",
  "access_expires_at": "2026-10-27T20:07:40.148249918Z",
  "refresh_token": "bEz55RpqIQ_KG_YTbzlhB5FUOG3v2nzDvTDCiMUnTTQ",
  "refresh_expires_at": "2026-10-28T07:52:40.147204933Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/call-lines` → **200**

```json
{
  "lines": []
}
```

`POST /api/admin/v1/call-lines/%2B380441110064` → **200**

```json
{
  "command_id": "2bb78f1f-7b79-44c3-8def-f133008dd6f2",
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
  "timestamp": "2026-10-27T19:52:40.000+0000",
  "channel": {
    "id": "1730052000.185602389",
    "linkedid": "1730052000.185602389",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679404518"
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
  "timestamp": "2026-10-27T19:52:40.000+0000",
  "channel": {
    "id": "1730052000.185602389",
    "linkedid": "1730052000.185602389",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679404518"
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
  "session_id": "e15f41bc-b363-424e-acca-c2096e551831",
  "subject": {
    "type": "STAFF",
    "id": "dce5e68c-95e8-4998-b059-69295b0f11d6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkY2U1ZTY4Yy05NWU4LTQ5OTgtYjA1OS02OTI5NWIwZjExZDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE2NjAsImlhdCI6MTc5MzEzMDc2MCwianRpIjoiY2M5YTJmYzQtNDU5Yi00ODljLTk3ODgtMTE2YzlhNmQ4OWRjIiwic2lkIjoiZTE1ZjQxYmMtYjM2My00MjRlLWFjY2EtYzIwOTZlNTUxODMxIn0.ro4HazWfnci38JMV1izja6r1KEQL-Orz7US7jI_uvPI",
  "access_expires_at": "2026-10-27T20:07:40.66511428Z",
  "refresh_token": "oi_t3qWheoyYdYTpHwhBkRwOGxT3fW8gmKfe9HjbU3U",
  "refresh_expires_at": "2026-10-28T07:52:40.664030598Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "c2b77da4-04cd-4dfb-83b0-19c8e84e2dcc",
      "state": "RINGING",
      "caller_phone": "+380679404518",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-27T19:52:40Z",
      "answered_at": null,
      "ended_at": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/c2b77da4-04cd-4dfb-83b0-19c8e84e2dcc/answer` → **200**

```json
{
  "command_id": "c34b53d3-b913-4ed7-b3fa-44586e26527a"
}
```

```json
{
  "id": "c2b77da4-04cd-4dfb-83b0-19c8e84e2dcc",
  "state": "ANSWERED",
  "caller_phone": "+380679404518",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "dce5e68c-95e8-4998-b059-69295b0f11d6",
  "order_ids": [],
  "started_at": "2026-10-27T19:52:40Z",
  "answered_at": "2026-10-27T19:52:40.756648Z",
  "ended_at": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.185602389",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "f2397f87-3767-4833-9c0b-8041d0817092",
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
  "id": "51f32707-2c1a-4118-b93c-ffaeb1cf9eb9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:57:40.913925Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false
}
```

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "675e9386-1f08-4d89-a5a3-f8a74b365be9",
  "quote_id": "51f32707-2c1a-4118-b93c-ffaeb1cf9eb9",
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
    "phone": "+380679404518"
  },
  "call_id": "c2b77da4-04cd-4dfb-83b0-19c8e84e2dcc"
}
```

```json
{
  "id": "c86989d9-f598-43fe-87ac-e4360e6bbd11",
  "short_number": 1,
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
  "created_at": "2026-10-27T19:52:41.047841Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679404518"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The caller hangs up: the call is over, the order is not

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "1730052000.185602389",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "c2b77da4-04cd-4dfb-83b0-19c8e84e2dcc",
      "state": "ENDED",
      "caller_phone": "+380679404518",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "dce5e68c-95e8-4998-b059-69295b0f11d6",
      "order_ids": [
        "c86989d9-f598-43fe-87ac-e4360e6bbd11"
      ],
      "started_at": "2026-10-27T19:52:40Z",
      "answered_at": "2026-10-27T19:52:40.756648Z",
      "ended_at": "2026-10-27T19:52:41.138812Z"
    }
  ]
}
```

`GET /api/operator/v1/orders/c86989d9-f598-43fe-87ac-e4360e6bbd11` → **200**

```json
{
  "id": "c86989d9-f598-43fe-87ac-e4360e6bbd11",
  "short_number": 1,
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
  "created_at": "2026-10-27T19:52:41.047841Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679404518"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/c86989d9-f598-43fe-87ac-e4360e6bbd11` → **200**

```json
{
  "id": "c86989d9-f598-43fe-87ac-e4360e6bbd11",
  "short_number": 1,
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
  "created_at": "2026-10-27T19:52:41.047841Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679404518"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c86989d9-f598-43fe-87ac-e4360e6bbd11/cancel` → **200**

```json
{
  "command_id": "703ba343-e380-4b30-9a4a-f28fbf44beab",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "c86989d9-f598-43fe-87ac-e4360e6bbd11",
  "short_number": 1,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
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
  "search_phase": "STOPPED",
  "assignment": null,
  "created_at": "2026-10-27T19:52:41.047841Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679404518"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call c2b77da4-04cd-4dfb-83b0-19c8e84e2dcc with order c86989d9-f598-43fe-87ac-e4360e6bbd11.
