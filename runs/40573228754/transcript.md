# Sandbox transcript (2026-10-27T19:54:53Z, 70e6955)

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
  "correlation_id": "80e38e58-7a37-4818-b848-7dad0b33c2e3"
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
  "session_id": "92b49218-1d2e-410e-ad3a-bb182b717dcd",
  "subject": {
    "type": "STAFF",
    "id": "2d3d37bc-af3c-434a-aa03-72d0b418adb8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZDNkMzdiYy1hZjNjLTQzNGEtYWEwMy03MmQwYjQxOGFkYjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE3OTQsImlhdCI6MTc5MzEzMDg5NCwianRpIjoiZDJlYTk0YWItMDI3ZS00YmE4LWEwYjAtYzNjODM0MGEzZGM5Iiwic2lkIjoiOTJiNDkyMTgtMWQyZS00MTBlLWFkM2EtYmIxODJiNzE3ZGNkIn0.Rd1T9UQT6f73m7IkuQ5hV9N6d9Z5bDWvXYdELKxqfx0",
  "access_expires_at": "2026-10-27T20:09:54.284668217Z",
  "refresh_token": "n2ewX-V8v2toQCIXsZxagZ05F-aR4PhvrF7gTYuRu5w",
  "refresh_expires_at": "2026-10-28T07:54:54.281817199Z",
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
  "session_id": "6da15caa-51d3-4654-b184-0d5be63a370b",
  "subject": {
    "type": "STAFF",
    "id": "2d3d37bc-af3c-434a-aa03-72d0b418adb8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZDNkMzdiYy1hZjNjLTQzNGEtYWEwMy03MmQwYjQxOGFkYjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE3OTUsImlhdCI6MTc5MzEzMDg5NSwianRpIjoiNjc1NTkzYTktOTU5ZS00MWU0LTk0ZDgtMWJjNDBhNjY0MDk4Iiwic2lkIjoiNmRhMTVjYWEtNTFkMy00NjU0LWIxODQtMGQ1YmU2M2EzNzBiIn0.0RuRjOsyZaD0FE1aJchpWZMxva12v8SaZu_wG4DIJeY",
  "access_expires_at": "2026-10-27T20:09:55.622312455Z",
  "refresh_token": "VQGhX1VZU7vEEGhiPWHCdwbsXQa_BlWBz5IeFmGij7Q",
  "refresh_expires_at": "2026-10-28T07:54:55.621303501Z",
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
  "command_id": "eaff6b1f-e829-4d7f-8f46-3744e25236be",
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
  "timestamp": "2026-10-27T19:54:55.000+0000",
  "channel": {
    "id": "1730052000.623013796",
    "linkedid": "1730052000.623013796",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678483892"
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
  "timestamp": "2026-10-27T19:54:55.000+0000",
  "channel": {
    "id": "1730052000.623013796",
    "linkedid": "1730052000.623013796",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678483892"
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
  "session_id": "59f6823a-69f1-4c2a-8bac-88c57b1b1011",
  "subject": {
    "type": "STAFF",
    "id": "2d3d37bc-af3c-434a-aa03-72d0b418adb8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZDNkMzdiYy1hZjNjLTQzNGEtYWEwMy03MmQwYjQxOGFkYjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE3OTYsImlhdCI6MTc5MzEzMDg5NiwianRpIjoiNTA0ZTM2NzQtZGM2Ni00MWY1LThiM2QtY2IyMDk5NGU3Yzk1Iiwic2lkIjoiNTlmNjgyM2EtNjlmMS00YzJhLThiYWMtODhjNTdiMWIxMDExIn0.zhhEU_OuM_IyjXzZBHVY5gVjQMOchDoIFpb2-sSf_xg",
  "access_expires_at": "2026-10-27T20:09:56.125139623Z",
  "refresh_token": "huJi1oREuyHkd3Cdv5wdeAsYpdQRBwzDIrFLW6oLqGM",
  "refresh_expires_at": "2026-10-28T07:54:56.124130182Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "d8bb0c0c-4436-4778-a4b4-2c6bf515048f",
      "state": "RINGING",
      "caller_phone": "+380678483892",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-27T19:54:55Z",
      "answered_at": null,
      "ended_at": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/d8bb0c0c-4436-4778-a4b4-2c6bf515048f/answer` → **200**

```json
{
  "command_id": "c3a72afd-874c-4e70-b1a6-e746703e48bb"
}
```

```json
{
  "id": "d8bb0c0c-4436-4778-a4b4-2c6bf515048f",
  "state": "ANSWERED",
  "caller_phone": "+380678483892",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "2d3d37bc-af3c-434a-aa03-72d0b418adb8",
  "order_ids": [],
  "started_at": "2026-10-27T19:54:55Z",
  "answered_at": "2026-10-27T19:54:56.214324Z",
  "ended_at": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.623013796",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "e7f8519f-6f00-4416-a35a-fc1ddcee7900",
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
  "id": "7bcb405a-1669-46f4-92e0-c98fcfd1069b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:59:56.360823Z",
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
  "command_id": "69b673e3-6c4f-4e14-8f45-3d7f77616c6b",
  "quote_id": "7bcb405a-1669-46f4-92e0-c98fcfd1069b",
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
    "phone": "+380678483892"
  },
  "call_id": "d8bb0c0c-4436-4778-a4b4-2c6bf515048f"
}
```

```json
{
  "id": "c46d0693-a264-40ad-b2c2-ab4b5626f488",
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
  "created_at": "2026-10-27T19:54:56.47854Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678483892"
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
    "id": "1730052000.623013796",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "d8bb0c0c-4436-4778-a4b4-2c6bf515048f",
      "state": "ENDED",
      "caller_phone": "+380678483892",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2d3d37bc-af3c-434a-aa03-72d0b418adb8",
      "order_ids": [
        "c46d0693-a264-40ad-b2c2-ab4b5626f488"
      ],
      "started_at": "2026-10-27T19:54:55Z",
      "answered_at": "2026-10-27T19:54:56.214324Z",
      "ended_at": "2026-10-27T19:54:56.572835Z"
    }
  ]
}
```

`GET /api/operator/v1/orders/c46d0693-a264-40ad-b2c2-ab4b5626f488` → **200**

```json
{
  "id": "c46d0693-a264-40ad-b2c2-ab4b5626f488",
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
  "created_at": "2026-10-27T19:54:56.47854Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678483892"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/c46d0693-a264-40ad-b2c2-ab4b5626f488` → **200**

```json
{
  "id": "c46d0693-a264-40ad-b2c2-ab4b5626f488",
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
  "created_at": "2026-10-27T19:54:56.47854Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678483892"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c46d0693-a264-40ad-b2c2-ab4b5626f488/cancel` → **200**

```json
{
  "command_id": "d2167d29-2de3-4212-b88b-1c0ad864952b",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "c46d0693-a264-40ad-b2c2-ab4b5626f488",
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
  "created_at": "2026-10-27T19:54:56.47854Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678483892"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call d8bb0c0c-4436-4778-a4b4-2c6bf515048f with order c46d0693-a264-40ad-b2c2-ab4b5626f488.
