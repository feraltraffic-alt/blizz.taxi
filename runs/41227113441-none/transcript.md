# Fault tests (2026-10-31T17:59:28Z, b70f5cf, break: none)

## Payment: the bank charges a card tip, the server dies before it stores the answer

Server start 1, armed at `payment.after-send:TIP`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670398855",
  "device_ref": "sandbox-23752"
}
```

```json
{
  "challenge_id": "6ef9d051-369b-4505-91d4-94fe3b4fc403",
  "expires_at": "2026-10-31T18:04:40.798555188Z",
  "resend_available_at": "2026-10-31T17:59:41.798555188Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670398855` → **200**

```json
{
  "phone": "+380670398855",
  "audience": "CLIENT",
  "code": "907336",
  "sent_at": "2026-10-31T17:59:40.82107655Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6ef9d051-369b-4505-91d4-94fe3b4fc403",
  "code": "907336",
  "device_ref": "sandbox-23752"
}
```

```json
{
  "session_id": "c952d4c8-a36a-43ba-9c8b-c919eb396b4b",
  "subject": {
    "type": "CLIENT",
    "id": "5451aa7d-3911-433a-b55a-2cb707ac0bf6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDUxYWE3ZC0zOTExLTQzM2EtYjU1YS0yY2I3MDdhYzBiZjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDcwNDg4LCJpYXQiOjE3OTM0Njk1ODgsImp0aSI6IjdkMzNhMGZjLTVmOTctNDIxYi04MmJkLWU3ZjBhMWRiYTkxNCIsInNpZCI6ImM5NTJkNGM4LWEzNmEtNDNiYS05YzhiLWM5MTllYjM5NmI0YiJ9.VmOCuAxPDVl0q01mf55bb1LKNZrbAjC3nMBFk7JFpPE",
  "access_expires_at": "2026-10-31T18:14:48.741688705Z",
  "refresh_token": "9qk0F-D5utAtX76psxEBCgghlmNYhiKCw-_iJ8fu8B4",
  "refresh_expires_at": "2026-11-30T17:59:48.73959181Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "c8e7b863-bda2-496c-8117-b170ed0b72c5",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "ffd4cd8d-16d1-4026-b192-68452c13b771",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-ffd4cd8d-16d1-4026-b192-68452c13b771",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "a6aa40cb536e08517ee645436168179f",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=ffd4cd8d-16d1-4026-b192-68452c13b771",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380670398855"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=ffd4cd8d-16d1-4026-b192-68452c13b771",
  "expires_at": "2026-10-31T18:29:49.125849Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/ffd4cd8d-16d1-4026-b192-68452c13b771` → **200**

```json
{
  "id": "ffd4cd8d-16d1-4026-b192-68452c13b771",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-31T18:29:49.125849Z",
  "card": {
    "id": "461d1a34-d083-43c9-be97-37d005a2a6c8",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2149",
    "card_type": "Visa",
    "created_at": "2026-10-31T17:59:49.466653Z"
  },
  "failure_reason": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10087"
}
```

```json
{
  "challenge_id": "cb10f069-3e4c-4755-9fdc-3a1dee51ce51",
  "expires_at": "2026-10-31T18:04:49.803078197Z",
  "resend_available_at": "2026-10-31T17:59:50.803078197Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "568159",
  "sent_at": "2026-10-31T17:59:49.808309829Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cb10f069-3e4c-4755-9fdc-3a1dee51ce51",
  "code": "568159",
  "device_ref": "sandbox-10087"
}
```

```json
{
  "session_id": "32aba624-0f24-487a-b7fe-f1c16dd05ba5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3MDQ5MCwiaWF0IjoxNzkzNDY5NTkwLCJqdGkiOiIxYjdkNzQ2Mi0yZGJjLTQwMzktODVlZC1mZmFkMGQxNmQ0ZDUiLCJzaWQiOiIzMmFiYTYyNC0wZjI0LTQ4N2EtYjdmZS1mMWMxNmRkMDViYTUifQ.oIDaBLS6dY2M9mfQCpjmq0ir1mwmRPmnqVcjE39Z3pw",
  "access_expires_at": "2026-10-31T18:14:50.155802771Z",
  "refresh_token": "jvRSzFIfk7VrCaZrdZe2oW7iaSf9syfayE_M5jmITj0",
  "refresh_expires_at": "2026-11-30T17:59:50.154832955Z",
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
  "command_id": "b4a93532-4d52-4f74-acdc-c0ed05c03918",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:59:50Z",
    "sequence": 1793469590793
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3721e6c5-8940-4330-94cd-133a46d7e999",
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
  "last_heartbeat_at": "2026-10-31T17:59:50.892834Z",
  "last_location_at": "2026-10-31T17:59:50.892834Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "07db129e-e338-4762-89a4-c6e4db1869df",
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
  "id": "db1ded9a-6501-4d7c-b39e-648a9555d75e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T18:04:51.293350Z",
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

`POST /api/rider/v1/orders` → **202**

```json
{
  "command_id": "65f35d0e-81c4-4e93-86ad-1b1a405580e0",
  "quote_id": "db1ded9a-6501-4d7c-b39e-648a9555d75e",
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
  "payment_method": "CARD"
}
```

```json
{
  "id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5451aa7d-3911-433a-b55a-2cb707ac0bf6",
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
  "payment_method": "CARD",
  "payment_state": "AUTH_PENDING",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-31T17:59:51.704583Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed` → **200**

```json
{
  "id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5451aa7d-3911-433a-b55a-2cb707ac0bf6",
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
  "payment_method": "CARD",
  "payment_state": "AUTH_PENDING",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-31T17:59:51.704583Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed` → **200**

```json
{
  "id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5451aa7d-3911-433a-b55a-2cb707ac0bf6",
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
  "payment_method": "CARD",
  "payment_state": "AUTHORIZED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-31T17:59:51.704583Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "62b66790-0894-4f2d-9b9a-72d5801147e9",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "expires_at": "2026-10-31T18:00:07.10099Z",
    "server_time": "2026-10-31T17:59:53.769480392Z",
    "seconds_left": 13,
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "payment_method": "CARD",
    "price_minor": 10517,
    "currency": "UAH",
    "distance_m": 44,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/62b66790-0894-4f2d-9b9a-72d5801147e9/accept` → **200**

```json
{
  "command_id": "c2bdd81b-25c4-4e88-8483-1032803afcff"
}
```

```json
{
  "id": "c580b0f6-dcca-473d-a00d-a29293f2a934",
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cab230d7-fc20-49cf-981f-2d603180c5bd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cab230d7-fc20-49cf-981f-2d603180c5bd",
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "assignment_id": "c580b0f6-dcca-473d-a00d-a29293f2a934",
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
  "payment_method": "CARD",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/work-sessions/3721e6c5-8940-4330-94cd-133a46d7e999/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:59:54Z",
    "sequence": 1793469594755
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3721e6c5-8940-4330-94cd-133a46d7e999",
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
  "last_heartbeat_at": "2026-10-31T17:59:54.782743Z",
  "last_location_at": "2026-10-31T17:59:54.782743Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/cab230d7-fc20-49cf-981f-2d603180c5bd/arrive` → **200**

```json
{
  "command_id": "2ab95bfa-af6d-43f6-ba50-29a21a95ab35",
  "expected_version": 0
}
```

```json
{
  "id": "cab230d7-fc20-49cf-981f-2d603180c5bd",
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "assignment_id": "c580b0f6-dcca-473d-a00d-a29293f2a934",
  "phase": "WAITING",
  "version": 1,
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
  "payment_method": "CARD",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-31T17:59:55.147658Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/trips/cab230d7-fc20-49cf-981f-2d603180c5bd/start` → **200**

```json
{
  "command_id": "0f80e001-8744-4eb8-8553-2a72590fd77d",
  "expected_version": 1
}
```

```json
{
  "id": "cab230d7-fc20-49cf-981f-2d603180c5bd",
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "assignment_id": "c580b0f6-dcca-473d-a00d-a29293f2a934",
  "phase": "IN_PROGRESS",
  "version": 2,
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
  "payment_method": "CARD",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-31T17:59:55.147658Z",
  "started_at": "2026-10-31T17:59:55.488615Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed` → **200**

```json
{
  "id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "5451aa7d-3911-433a-b55a-2cb707ac0bf6",
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
  "payment_method": "CARD",
  "payment_state": "CAPTURE_PENDING",
  "price_minor": 10517,
  "final_price_minor": 10517,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "c580b0f6-dcca-473d-a00d-a29293f2a934",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cab230d7-fc20-49cf-981f-2d603180c5bd",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:59:51.704583Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": {
    "name": "Іван Петренко",
    "make": "Skoda",
    "model": "Octavia",
    "color": "white",
    "registration_number": "AA0001TX",
    "photo_url": null
  },
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed` → **200**

```json
{
  "id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "5451aa7d-3911-433a-b55a-2cb707ac0bf6",
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
  "payment_method": "CARD",
  "payment_state": "CAPTURE_PENDING",
  "price_minor": 10517,
  "final_price_minor": 10517,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "c580b0f6-dcca-473d-a00d-a29293f2a934",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cab230d7-fc20-49cf-981f-2d603180c5bd",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:59:51.704583Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": {
    "name": "Іван Петренко",
    "make": "Skoda",
    "model": "Octavia",
    "color": "white",
    "registration_number": "AA0001TX",
    "photo_url": null
  },
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed` → **200**

```json
{
  "id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "5451aa7d-3911-433a-b55a-2cb707ac0bf6",
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
  "payment_method": "CARD",
  "payment_state": "PAID",
  "price_minor": 10517,
  "final_price_minor": 10517,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "c580b0f6-dcca-473d-a00d-a29293f2a934",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cab230d7-fc20-49cf-981f-2d603180c5bd",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:59:51.704583Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": {
    "name": "Іван Петренко",
    "make": "Skoda",
    "model": "Octavia",
    "color": "white",
    "registration_number": "AA0001TX",
    "photo_url": null
  },
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": true,
  "tip": null
}
```

Tip 1600 on order fed13664-efbc-4e9d-8b32-a395fe902fed; the bank journal has 5 lines before it.
Crash point payment.after-send:TIP reached: halting as kill -9 would

The server halted at its crash point (exit 137).

Server start 2.

The worker asks the bank about the operation once its 2-minute lease has run out.

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

`GET /api/rider/v1/orders/fed13664-efbc-4e9d-8b32-a395fe902fed/tip` → **200**

```json
{
  "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:59:55.830754Z",
  "open": false,
  "tip": {
    "id": "ff4916a7-ae00-4572-865b-d88ad5fbe8af",
    "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-31T17:59:59.208609Z"
  }
}
```

Charges the bank received for the tip: **1**.

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 10539
    }
  ],
  "entries": [
    {
      "id": "a7fa2a84-d8d5-4ebf-8d09-da4d5055abff",
      "at": "2026-10-31T18:02:01.896367Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 1600,
      "reason": "Tip for the driver",
      "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
      "counterpart_id": null
    },
    {
      "id": "b047012f-27f7-4c87-835b-6b2a4f453295",
      "at": "2026-10-31T17:59:56.266066Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 8939,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "fed13664-efbc-4e9d-8b32-a395fe902fed",
      "counterpart_id": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3721e6c5-8940-4330-94cd-133a46d7e999",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-31T17:59:54.782743Z",
  "last_location_at": "2026-10-31T17:59:54.782743Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/3721e6c5-8940-4330-94cd-133a46d7e999/close` → **200**

```json
{
  "command_id": "cc1d3e8a-6a1f-43fc-acce-a210a7aa4aa9",
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

## Outbox: one consumer handled TripCompleted, the server dies before the others and the DONE mark

Server start 3, armed at `outbox.after-handler:TripCompleted/notification.order-live-feed`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671694704",
  "device_ref": "sandbox-19929"
}
```

```json
{
  "challenge_id": "d06c9114-2103-4d5b-8e77-ba166e2fe842",
  "expires_at": "2026-10-31T18:07:15.23593025Z",
  "resend_available_at": "2026-10-31T18:02:16.23593025Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671694704` → **200**

```json
{
  "phone": "+380671694704",
  "audience": "CLIENT",
  "code": "615787",
  "sent_at": "2026-10-31T18:02:15.25516051Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d06c9114-2103-4d5b-8e77-ba166e2fe842",
  "code": "615787",
  "device_ref": "sandbox-19929"
}
```

```json
{
  "session_id": "0c86e67c-7373-4964-acf6-89b4795ce6b1",
  "subject": {
    "type": "CLIENT",
    "id": "af50b246-9eeb-4416-901b-200224f0311d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjUwYjI0Ni05ZWViLTQ0MTYtOTAxYi0yMDAyMjRmMDMxMWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDcwNjM1LCJpYXQiOjE3OTM0Njk3MzUsImp0aSI6IjJmZWRkMmY0LWQ5OWItNGYwYS05NjAyLWQ5MDRlMWQwNjFkOCIsInNpZCI6IjBjODZlNjdjLTczNzMtNDk2NC1hY2Y2LTg5YjQ3OTVjZTZiMSJ9.bsnliBLcbGxySWHMLLXr9yVgOZK2Ngf_C0YyvOcqh3k",
  "access_expires_at": "2026-10-31T18:17:15.639481555Z",
  "refresh_token": "D7OZWpf_JID20KzWTBxUQQWqCN_eoBU4wTmYREzXBqA",
  "refresh_expires_at": "2026-11-30T18:02:15.636721778Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-3500"
}
```

```json
{
  "challenge_id": "12bf052f-9602-4a10-b0f6-f63bc66c33b1",
  "expires_at": "2026-10-31T18:07:16.003840988Z",
  "resend_available_at": "2026-10-31T18:02:17.003840988Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "980248",
  "sent_at": "2026-10-31T18:02:16.010090937Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "12bf052f-9602-4a10-b0f6-f63bc66c33b1",
  "code": "980248",
  "device_ref": "sandbox-3500"
}
```

```json
{
  "session_id": "4c42d15b-91b8-4b08-b4d1-1844ed1cfb4e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3MDYzNiwiaWF0IjoxNzkzNDY5NzM2LCJqdGkiOiI0MmRiOTE5Zi1kMGFhLTRiNWItYjVkNy1lODZkMWE1ZmVhNTYiLCJzaWQiOiI0YzQyZDE1Yi05MWI4LTRiMDgtYjRkMS0xODQ0ZWQxY2ZiNGUifQ.9HVolyVhYsXKLu6TcRun4SdoKe1STqaUIBsGjWClzzo",
  "access_expires_at": "2026-10-31T18:17:16.343992377Z",
  "refresh_token": "PrpPFo_z4TEFKsb8RrsJT-UoVo4SIgR_IqItHiDCAPA",
  "refresh_expires_at": "2026-11-30T18:02:16.342915581Z",
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
  "command_id": "733e94a8-6726-48d6-86a8-6550ac1e4534",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T18:02:16Z",
    "sequence": 1793469737162
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "511a321e-c72f-4a00-9bb8-bec803bf3a3e",
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
  "last_heartbeat_at": "2026-10-31T18:02:17.070009Z",
  "last_location_at": "2026-10-31T18:02:17.070009Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c33d5756-b8da-4f75-9e13-74317ea3f77d",
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
  "id": "00d1476a-03b6-4e08-8ddb-1a95be7fb730",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T18:07:17.496197Z",
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

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "275a74a2-fc8b-4d64-a2d4-e93a31c43214",
  "quote_id": "00d1476a-03b6-4e08-8ddb-1a95be7fb730",
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
  "id": "b8c00999-3f86-4524-ad47-fa6c327fb5e6",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "af50b246-9eeb-4416-901b-200224f0311d",
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
  "created_at": "2026-10-31T18:02:17.920162Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "937e37ef-3b98-40de-87b3-b098277be399",
    "order_id": "b8c00999-3f86-4524-ad47-fa6c327fb5e6",
    "expires_at": "2026-10-31T18:02:32.933335Z",
    "server_time": "2026-10-31T18:02:18.330938148Z",
    "seconds_left": 14,
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
    "distance_m": 44,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/937e37ef-3b98-40de-87b3-b098277be399/accept` → **200**

```json
{
  "command_id": "bda22474-74b1-46fb-bf48-b14d0d1b1922"
}
```

```json
{
  "id": "6a39605a-a238-4e9d-b679-d1ed64b5dd27",
  "order_id": "b8c00999-3f86-4524-ad47-fa6c327fb5e6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ec7a52f2-dd81-493d-ad00-4ca88621c5c8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ec7a52f2-dd81-493d-ad00-4ca88621c5c8",
  "order_id": "b8c00999-3f86-4524-ad47-fa6c327fb5e6",
  "assignment_id": "6a39605a-a238-4e9d-b679-d1ed64b5dd27",
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
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/work-sessions/511a321e-c72f-4a00-9bb8-bec803bf3a3e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T18:02:19Z",
    "sequence": 1793469739322
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "511a321e-c72f-4a00-9bb8-bec803bf3a3e",
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
  "last_heartbeat_at": "2026-10-31T18:02:19.351759Z",
  "last_location_at": "2026-10-31T18:02:19.351759Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/ec7a52f2-dd81-493d-ad00-4ca88621c5c8/arrive` → **200**

```json
{
  "command_id": "abca68dc-c7e5-46cd-80dc-6193207e4b41",
  "expected_version": 0
}
```

```json
{
  "id": "ec7a52f2-dd81-493d-ad00-4ca88621c5c8",
  "order_id": "b8c00999-3f86-4524-ad47-fa6c327fb5e6",
  "assignment_id": "6a39605a-a238-4e9d-b679-d1ed64b5dd27",
  "phase": "WAITING",
  "version": 1,
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
  "arrived_at": "2026-10-31T18:02:19.691577Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/trips/ec7a52f2-dd81-493d-ad00-4ca88621c5c8/start` → **200**

```json
{
  "command_id": "03077c43-e5e9-4170-8f2f-b518dbd44e31",
  "expected_version": 1
}
```

```json
{
  "id": "ec7a52f2-dd81-493d-ad00-4ca88621c5c8",
  "order_id": "b8c00999-3f86-4524-ad47-fa6c327fb5e6",
  "assignment_id": "6a39605a-a238-4e9d-b679-d1ed64b5dd27",
  "phase": "IN_PROGRESS",
  "version": 2,
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
  "arrived_at": "2026-10-31T18:02:19.691577Z",
  "started_at": "2026-10-31T18:02:20.067173Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```
Crash point outbox.after-handler:TripCompleted/notification.order-live-feed reached: halting as kill -9 would

The server halted at its crash point (exit 137).

TripCompleted 2236e22e-0d3f-4940-8637-411fb114816a: PENDING after the crash.

Server start 4.

Consumers of the crashed event: `backoffice.problem-queues finance.trip-fare-posting finance.wallet-order-settlement notification.order-live-feed notification.push-feed operator-bonuses payments.trip-capture promotions.driver-trips promotions.trip-rewards`.

Live messages of the crashed event: **1** (sent before the crash, not again after it).

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "511a321e-c72f-4a00-9bb8-bec803bf3a3e",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-31T18:02:19.351759Z",
  "last_location_at": "2026-10-31T18:02:19.351759Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/511a321e-c72f-4a00-9bb8-bec803bf3a3e/close` → **200**

```json
{
  "command_id": "3f0855f8-a3c4-4fa1-9e28-cb843fd2bb19",
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

## Dispatch: the driver's accept is committed, the server dies before it answers; the app retries

Server start 5, armed at `dispatch.after-accept`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673994586",
  "device_ref": "sandbox-5268"
}
```

```json
{
  "challenge_id": "19a1d574-ec0b-436b-929d-67e6a541d132",
  "expires_at": "2026-10-31T18:08:06.552040317Z",
  "resend_available_at": "2026-10-31T18:03:07.552040317Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673994586` → **200**

```json
{
  "phone": "+380673994586",
  "audience": "CLIENT",
  "code": "155870",
  "sent_at": "2026-10-31T18:03:06.570361028Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "19a1d574-ec0b-436b-929d-67e6a541d132",
  "code": "155870",
  "device_ref": "sandbox-5268"
}
```

```json
{
  "session_id": "1fed0551-e642-47cb-8f11-b2576d065e69",
  "subject": {
    "type": "CLIENT",
    "id": "028c980c-97bf-47e7-a396-be1488a00eb4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjhjOTgwYy05N2JmLTQ3ZTctYTM5Ni1iZTE0ODhhMDBlYjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDcwNjg3LCJpYXQiOjE3OTM0Njk3ODcsImp0aSI6ImZhMWQxYjE5LWZmMDEtNGNlNS1hNDRlLTQyZGQ5N2M3NjA0NiIsInNpZCI6IjFmZWQwNTUxLWU2NDItNDdjYi04ZjExLWIyNTc2ZDA2NWU2OSJ9.kCLo94hCet_3sIkha6pH-rFIvkr50R9NDk4ZOXCqzhM",
  "access_expires_at": "2026-10-31T18:18:07.018170265Z",
  "refresh_token": "6dNqerqT1EB--JaiGMJ2lP5FOybthNt8Owl4KNmBA10",
  "refresh_expires_at": "2026-11-30T18:03:07.015543969Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-24802"
}
```

```json
{
  "challenge_id": "22622a70-f300-45b5-a915-749513bbf8ce",
  "expires_at": "2026-10-31T18:08:07.375569733Z",
  "resend_available_at": "2026-10-31T18:03:08.375569733Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "096064",
  "sent_at": "2026-10-31T18:03:07.381581926Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "22622a70-f300-45b5-a915-749513bbf8ce",
  "code": "096064",
  "device_ref": "sandbox-24802"
}
```

```json
{
  "session_id": "dd15e0e7-a16c-4546-8b78-dd1c04af4c60",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3MDY4NywiaWF0IjoxNzkzNDY5Nzg3LCJqdGkiOiJjYjYyMjMxZC03NGI2LTQ1ZmItYjRiNC0xNTE4Zjc2ZTkxNGQiLCJzaWQiOiJkZDE1ZTBlNy1hMTZjLTQ1NDYtOGI3OC1kZDFjMDRhZjRjNjAifQ.MxKb9UAtYnnqUT3CVc9hK5E-xHoALiaC1jO4FI8vwOc",
  "access_expires_at": "2026-10-31T18:18:07.718904709Z",
  "refresh_token": "eXWIim_kNTXXRuwoEl9adYDxxLvht2rTEqIFLsOnPwo",
  "refresh_expires_at": "2026-11-30T18:03:07.717627098Z",
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
  "command_id": "562930f8-4ba5-46d7-9329-c2547a2e3f24",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T18:03:08Z",
    "sequence": 1793469788374
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "538303c7-61b1-4e84-a756-115cef74ab43",
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
  "last_heartbeat_at": "2026-10-31T18:03:08.442318Z",
  "last_location_at": "2026-10-31T18:03:08.442318Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fa3c292c-574f-4c97-b194-0515d764e67a",
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
  "id": "3d087c5c-f260-489c-b0bb-587639eac574",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T18:08:08.844663Z",
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

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ab2b012a-8513-45a1-94bb-199cfe0bb001",
  "quote_id": "3d087c5c-f260-489c-b0bb-587639eac574",
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
  "id": "70c17237-b5b0-4be0-ae91-dd6627fde021",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028c980c-97bf-47e7-a396-be1488a00eb4",
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
  "created_at": "2026-10-31T18:03:09.292924Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "45f72441-7c7c-4ddd-a270-718aaca34b29",
    "order_id": "70c17237-b5b0-4be0-ae91-dd6627fde021",
    "expires_at": "2026-10-31T18:03:24.307602Z",
    "server_time": "2026-10-31T18:03:09.754541566Z",
    "seconds_left": 14,
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
    "distance_m": 44,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": null,
    "entrance": null
  }
]
```

The first accept: HTTP 000 (000: the connection was cut).
Crash point dispatch.after-accept reached: halting as kill -9 would

The server halted at its crash point (exit 137).

Server start 6.

`POST /api/driver/v1/offers/45f72441-7c7c-4ddd-a270-718aaca34b29/accept` → **200**

```json
{
  "command_id": "87a89c81-98a0-4b56-82e7-b04d8900e56b"
}
```

```json
{
  "id": "31998db9-4a65-4fa5-9be9-80c9b214915e",
  "order_id": "70c17237-b5b0-4be0-ae91-dd6627fde021",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "045615df-2f19-4300-bc00-6740d9961942",
  "trip_phase": "TO_PICKUP"
}
```

The retry with the same command: HTTP 200.

One assignment, and the retry returned it.

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "045615df-2f19-4300-bc00-6740d9961942",
  "order_id": "70c17237-b5b0-4be0-ae91-dd6627fde021",
  "assignment_id": "31998db9-4a65-4fa5-9be9-80c9b214915e",
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
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/work-sessions/538303c7-61b1-4e84-a756-115cef74ab43/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T18:03:20Z",
    "sequence": 1793469800778
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "538303c7-61b1-4e84-a756-115cef74ab43",
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
  "last_heartbeat_at": "2026-10-31T18:03:20.863968Z",
  "last_location_at": "2026-10-31T18:03:20.863968Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/045615df-2f19-4300-bc00-6740d9961942/arrive` → **200**

```json
{
  "command_id": "56c5a98c-792c-4311-9a3f-3cd7680d2d20",
  "expected_version": 0
}
```

```json
{
  "id": "045615df-2f19-4300-bc00-6740d9961942",
  "order_id": "70c17237-b5b0-4be0-ae91-dd6627fde021",
  "assignment_id": "31998db9-4a65-4fa5-9be9-80c9b214915e",
  "phase": "WAITING",
  "version": 1,
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
  "arrived_at": "2026-10-31T18:03:21.217541Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/trips/045615df-2f19-4300-bc00-6740d9961942/start` → **200**

```json
{
  "command_id": "a30c77d4-1d18-4dc2-bfa1-d2c6591e6644",
  "expected_version": 1
}
```

```json
{
  "id": "045615df-2f19-4300-bc00-6740d9961942",
  "order_id": "70c17237-b5b0-4be0-ae91-dd6627fde021",
  "assignment_id": "31998db9-4a65-4fa5-9be9-80c9b214915e",
  "phase": "IN_PROGRESS",
  "version": 2,
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
  "arrived_at": "2026-10-31T18:03:21.217541Z",
  "started_at": "2026-10-31T18:03:21.558283Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "538303c7-61b1-4e84-a756-115cef74ab43",
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
  "last_heartbeat_at": "2026-10-31T18:03:20.863968Z",
  "last_location_at": "2026-10-31T18:03:20.863968Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/538303c7-61b1-4e84-a756-115cef74ab43/close` → **200**

```json
{
  "command_id": "4e7600ff-67ed-45be-9d7f-834a475c5a0f",
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

## Database: every connection of the server is cut; it comes back by itself

Server start 7.

Connections cut: 20, while four clients ask for sign-in codes.

Answers during the cut: 819×201 1×429 9×503 

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676957580",
  "device_ref": "sandbox-6918"
}
```

```json
{
  "challenge_id": "f479873d-b121-4813-8eb8-25c4c2a5b97b",
  "expires_at": "2026-10-31T18:08:40.043719705Z",
  "resend_available_at": "2026-10-31T18:03:41.043719705Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676957580` → **200**

```json
{
  "phone": "+380676957580",
  "audience": "CLIENT",
  "code": "698210",
  "sent_at": "2026-10-31T18:03:40.046478667Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f479873d-b121-4813-8eb8-25c4c2a5b97b",
  "code": "698210",
  "device_ref": "sandbox-6918"
}
```

```json
{
  "session_id": "b269126e-2bcb-4cf7-9fde-6ce3f4845ca2",
  "subject": {
    "type": "CLIENT",
    "id": "7685e9db-8e28-49bd-b479-b8ced3958ffd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3Njg1ZTlkYi04ZTI4LTQ5YmQtYjQ3OS1iOGNlZDM5NThmZmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDcwNzIwLCJpYXQiOjE3OTM0Njk4MjAsImp0aSI6ImMwOGU1NTcxLTY4ZGEtNDk2My1iN2VmLTc0MGZlYzRmYjAyNSIsInNpZCI6ImIyNjkxMjZlLTJiY2ItNGNmNy05ZmRlLTZjZTNmNDg0NWNhMiJ9.pM2fZESu58k99CLmbF4t401Fp57ysVANn5q7dbwq-dc",
  "access_expires_at": "2026-10-31T18:18:40.413938439Z",
  "refresh_token": "SQwZwYbuoe7WYutlh3jAvOXrrnYy9Kg5LX7g67xhODE",
  "refresh_expires_at": "2026-11-30T18:03:40.411381786Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31922"
}
```

```json
{
  "challenge_id": "db3719b2-fdbc-4984-b550-999f2dbf5d92",
  "expires_at": "2026-10-31T18:08:40.779004673Z",
  "resend_available_at": "2026-10-31T18:03:41.779004673Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "892555",
  "sent_at": "2026-10-31T18:03:40.781847523Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "db3719b2-fdbc-4984-b550-999f2dbf5d92",
  "code": "892555",
  "device_ref": "sandbox-31922"
}
```

```json
{
  "session_id": "beb88c77-c83c-4727-ba87-5ac0da47cbad",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3MDcyMSwiaWF0IjoxNzkzNDY5ODIxLCJqdGkiOiJkNjU3ZWQ3Mi0wMDJkLTRiNjEtOGE4Yy01MjJhNzI5NjAxNjAiLCJzaWQiOiJiZWI4OGM3Ny1jODNjLTQ3MjctYmE4Ny01YWMwZGE0N2NiYWQifQ.x1YvMknUDMKinerYcjYuc-2tgnARvj1gWqg2WLeXmK8",
  "access_expires_at": "2026-10-31T18:18:41.121070145Z",
  "refresh_token": "6616NV3GMnwndZiIxrG3UPxOnPg6w7JinLI4JXvYvxA",
  "refresh_expires_at": "2026-11-30T18:03:41.120381056Z",
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
  "command_id": "67356f37-24a3-4337-978e-2ee3d2eeb46b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T18:03:41Z",
    "sequence": 1793469821787
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ddbdc6e1-cd87-4a12-94d2-139a586966c9",
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
  "last_heartbeat_at": "2026-10-31T18:03:41.85194Z",
  "last_location_at": "2026-10-31T18:03:41.85194Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0eb3d127-d861-4f01-a76c-c0a07f676d2c",
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
  "id": "317d67a5-72e9-4011-905c-0efd4e173293",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T18:08:42.387708Z",
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

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3e8fae4f-1462-4749-87fa-51aaa257cc71",
  "quote_id": "317d67a5-72e9-4011-905c-0efd4e173293",
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
  "id": "f9fac98b-0918-4529-bbd5-5e7a1dccdba6",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7685e9db-8e28-49bd-b479-b8ced3958ffd",
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
  "created_at": "2026-10-31T18:03:42.791401Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "9c9fe96f-7e9f-4426-aa6a-d0e02d6d7ee7",
    "order_id": "f9fac98b-0918-4529-bbd5-5e7a1dccdba6",
    "expires_at": "2026-10-31T18:03:57.805436Z",
    "server_time": "2026-10-31T18:03:43.17958079Z",
    "seconds_left": 14,
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
    "distance_m": 44,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/9c9fe96f-7e9f-4426-aa6a-d0e02d6d7ee7/accept` → **200**

```json
{
  "command_id": "ab411f63-c95f-4f13-9b92-c129865b0bf4"
}
```

```json
{
  "id": "ee915f5c-84d9-4db3-a4d0-d6ba4f9e7645",
  "order_id": "f9fac98b-0918-4529-bbd5-5e7a1dccdba6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cc9f62d4-1d5f-46be-9655-e32257adf58b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cc9f62d4-1d5f-46be-9655-e32257adf58b",
  "order_id": "f9fac98b-0918-4529-bbd5-5e7a1dccdba6",
  "assignment_id": "ee915f5c-84d9-4db3-a4d0-d6ba4f9e7645",
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
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/work-sessions/ddbdc6e1-cd87-4a12-94d2-139a586966c9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T18:03:44Z",
    "sequence": 1793469824212
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ddbdc6e1-cd87-4a12-94d2-139a586966c9",
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
  "last_heartbeat_at": "2026-10-31T18:03:44.23886Z",
  "last_location_at": "2026-10-31T18:03:44.23886Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/cc9f62d4-1d5f-46be-9655-e32257adf58b/arrive` → **200**

```json
{
  "command_id": "03933464-0713-4fe1-b6af-ace4c0079296",
  "expected_version": 0
}
```

```json
{
  "id": "cc9f62d4-1d5f-46be-9655-e32257adf58b",
  "order_id": "f9fac98b-0918-4529-bbd5-5e7a1dccdba6",
  "assignment_id": "ee915f5c-84d9-4db3-a4d0-d6ba4f9e7645",
  "phase": "WAITING",
  "version": 1,
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
  "arrived_at": "2026-10-31T18:03:44.571766Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/trips/cc9f62d4-1d5f-46be-9655-e32257adf58b/start` → **200**

```json
{
  "command_id": "86d63e39-0073-47c2-bdcf-f73b7cf25ccd",
  "expected_version": 1
}
```

```json
{
  "id": "cc9f62d4-1d5f-46be-9655-e32257adf58b",
  "order_id": "f9fac98b-0918-4529-bbd5-5e7a1dccdba6",
  "assignment_id": "ee915f5c-84d9-4db3-a4d0-d6ba4f9e7645",
  "phase": "IN_PROGRESS",
  "version": 2,
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
  "arrived_at": "2026-10-31T18:03:44.571766Z",
  "started_at": "2026-10-31T18:03:44.90697Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

After the cut: a whole ride, and its TripCompleted delivered.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ddbdc6e1-cd87-4a12-94d2-139a586966c9",
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
  "last_heartbeat_at": "2026-10-31T18:03:44.23886Z",
  "last_location_at": "2026-10-31T18:03:44.23886Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ddbdc6e1-cd87-4a12-94d2-139a586966c9/close` → **200**

```json
{
  "command_id": "3de82be2-10ca-42fa-9a11-d3636143357e",
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

## The invariant scan is clean after the faults

Server start 8.

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793469961698E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793469961776E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793469961778E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793469961707E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793469961779E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
