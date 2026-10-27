# Sandbox transcript (2026-10-27T19:47:11Z, 717e2d8)

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
  "correlation_id": "de1af3c2-7d19-4f9c-9122-182a671a0a49"
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
  "session_id": "03065ada-a970-4ce5-a3c0-8a1c2ec21090",
  "subject": {
    "type": "STAFF",
    "id": "ce6be66d-238b-4682-8d12-ab404a4a68e7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTZiZTY2ZC0yMzhiLTQ2ODItOGQxMi1hYjQwNGE0YTY4ZTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzEzMzIsImlhdCI6MTc5MzEzMDQzMiwianRpIjoiNTdjNTkyMDQtOTQxNy00NTdmLWJhM2MtNWIwMTc0MzdjNjBhIiwic2lkIjoiMDMwNjVhZGEtYTk3MC00Y2U1LWEzYzAtOGExYzJlYzIxMDkwIn0.w76pA2qIHCVtJjXaPA3IwcxIsSwPwY-SkKtV2EUU7x0",
  "access_expires_at": "2026-10-27T20:02:12.073466704Z",
  "refresh_token": "rb1mT-M3pnREbIJKWVL0tHreI414iYxdsrc7qD_i_wI",
  "refresh_expires_at": "2026-10-28T07:47:12.071311226Z",
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
  "session_id": "5ce27e5e-822d-4e3f-b48c-db94e44b6cfe",
  "subject": {
    "type": "STAFF",
    "id": "ce6be66d-238b-4682-8d12-ab404a4a68e7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTZiZTY2ZC0yMzhiLTQ2ODItOGQxMi1hYjQwNGE0YTY4ZTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzEzMzMsImlhdCI6MTc5MzEzMDQzMywianRpIjoiMDk3NjQ3YzUtYjBkZC00MzRmLTg4N2UtM2VjMTMwYWEwZTBiIiwic2lkIjoiNWNlMjdlNWUtODIyZC00ZTNmLWI0OGMtZGI5NGU0NGI2Y2ZlIn0.sfE-SDo_fjp5XvVKVixKJAYhtJoZORgkwUibXausuPs",
  "access_expires_at": "2026-10-27T20:02:13.367575867Z",
  "refresh_token": "KksWm2MlZHPJkWGf_UtyvFAa9ij0hRHKapzFzSNcRLk",
  "refresh_expires_at": "2026-10-28T07:47:13.366429813Z",
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
  "command_id": "90a3c9a1-e553-45b5-b610-44baab8d377f",
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
  "timestamp": "2026-10-27T19:47:13.000+0000",
  "channel": {
    "id": "1730052000.2731726624",
    "linkedid": "1730052000.2731726624",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675101488"
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
  "timestamp": "2026-10-27T19:47:13.000+0000",
  "channel": {
    "id": "1730052000.2731726624",
    "linkedid": "1730052000.2731726624",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675101488"
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
  "session_id": "1b7be44b-e22d-46e5-b7d3-13606fc091e9",
  "subject": {
    "type": "STAFF",
    "id": "ce6be66d-238b-4682-8d12-ab404a4a68e7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTZiZTY2ZC0yMzhiLTQ2ODItOGQxMi1hYjQwNGE0YTY4ZTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzEzMzMsImlhdCI6MTc5MzEzMDQzMywianRpIjoiMmI5OWM4ZmQtZDIzMi00YzNhLTg1ODYtNDg3NjE4Y2JiYTVmIiwic2lkIjoiMWI3YmU0NGItZTIyZC00NmU1LWI3ZDMtMTM2MDZmYzA5MWU5In0.MRUcDqFcyx2lX1Y3eVf-u6VAgpTuweB5ker7-72hUm8",
  "access_expires_at": "2026-10-27T20:02:13.881964221Z",
  "refresh_token": "1LZyx0wMV8Ni6IjojdLqMko1kuyakIBP4mk3Qq0rwd4",
  "refresh_expires_at": "2026-10-28T07:47:13.880862131Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "08ff4184-f69f-43b5-90ab-a4510b0e3dd3",
      "state": "RINGING",
      "caller_phone": "+380675101488",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-27T19:47:13Z",
      "answered_at": null,
      "ended_at": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/08ff4184-f69f-43b5-90ab-a4510b0e3dd3/answer` → **200**

```json
{
  "command_id": "73750f98-d3c7-4190-a8d7-9695fd97273c"
}
```

```json
{
  "id": "08ff4184-f69f-43b5-90ab-a4510b0e3dd3",
  "state": "ANSWERED",
  "caller_phone": "+380675101488",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "ce6be66d-238b-4682-8d12-ab404a4a68e7",
  "order_ids": [],
  "started_at": "2026-10-27T19:47:13Z",
  "answered_at": "2026-10-27T19:47:13.972819Z",
  "ended_at": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2731726624",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "79af0458-9f63-4eaa-ae02-d7ab1c5c36c2",
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
  "id": "217489d5-cdf5-4835-acc8-91ec86505425",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:52:14.156286Z",
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
  "command_id": "11f64e0e-062c-4223-914f-94b816fef514",
  "quote_id": "217489d5-cdf5-4835-acc8-91ec86505425",
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
    "phone": "+380675101488"
  },
  "call_id": "08ff4184-f69f-43b5-90ab-a4510b0e3dd3"
}
```

```json
{
  "id": "ea9945dd-da37-4e33-9c13-8756ad8d9d9d",
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
  "created_at": "2026-10-27T19:47:14.287574Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675101488"
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
    "id": "1730052000.2731726624",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "08ff4184-f69f-43b5-90ab-a4510b0e3dd3",
      "state": "ENDED",
      "caller_phone": "+380675101488",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ce6be66d-238b-4682-8d12-ab404a4a68e7",
      "order_ids": [
        "ea9945dd-da37-4e33-9c13-8756ad8d9d9d"
      ],
      "started_at": "2026-10-27T19:47:13Z",
      "answered_at": "2026-10-27T19:47:13.972819Z",
      "ended_at": "2026-10-27T19:47:14.377986Z"
    }
  ]
}
```

`GET /api/operator/v1/orders/ea9945dd-da37-4e33-9c13-8756ad8d9d9d` → **200**

```json
{
  "id": "ea9945dd-da37-4e33-9c13-8756ad8d9d9d",
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
  "created_at": "2026-10-27T19:47:14.287574Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675101488"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/ea9945dd-da37-4e33-9c13-8756ad8d9d9d` → **200**

```json
{
  "id": "ea9945dd-da37-4e33-9c13-8756ad8d9d9d",
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
  "created_at": "2026-10-27T19:47:14.287574Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675101488"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ea9945dd-da37-4e33-9c13-8756ad8d9d9d/cancel` → **200**

```json
{
  "command_id": "ba57c073-3ffa-45e3-a444-297ae61a3c37",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "ea9945dd-da37-4e33-9c13-8756ad8d9d9d",
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
  "created_at": "2026-10-27T19:47:14.287574Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675101488"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 08ff4184-f69f-43b5-90ab-a4510b0e3dd3 with order ea9945dd-da37-4e33-9c13-8756ad8d9d9d.
