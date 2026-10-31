# Fault tests (2026-10-31T17:53:34Z, 4796389, break: none)

## Payment: the bank charges a card tip, the server dies before it stores the answer

Server start 1, armed at `payment.after-send:TIP`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670997019",
  "device_ref": "sandbox-18833"
}
```

```json
{
  "challenge_id": "cd487d6c-3875-47b8-89fb-efd177ddf78d",
  "expires_at": "2026-10-31T17:58:48.237073266Z",
  "resend_available_at": "2026-10-31T17:53:49.237073266Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670997019` → **200**

```json
{
  "phone": "+380670997019",
  "audience": "CLIENT",
  "code": "619442",
  "sent_at": "2026-10-31T17:53:48.257836125Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd487d6c-3875-47b8-89fb-efd177ddf78d",
  "code": "619442",
  "device_ref": "sandbox-18833"
}
```

```json
{
  "session_id": "1ea02256-29b6-4543-ba7a-c1bd9677910b",
  "subject": {
    "type": "CLIENT",
    "id": "8bfa6328-645c-4dc2-881b-b5952566d972"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YmZhNjMyOC02NDVjLTRkYzItODgxYi1iNTk1MjU2NmQ5NzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDcwMTM4LCJpYXQiOjE3OTM0NjkyMzgsImp0aSI6ImYzOGJlYzZjLTdkNDctNDFiZi1hMmUzLWVkZmI5ZmZiZDAxMiIsInNpZCI6IjFlYTAyMjU2LTI5YjYtNDU0My1iYTdhLWMxYmQ5Njc3OTEwYiJ9.ktnIZZTCZsRcMKdScUBTYh-BJPoFXE2YJltiuNPbf8E",
  "access_expires_at": "2026-10-31T18:08:58.353035123Z",
  "refresh_token": "0wMv8WQ_hWOazrGzvYGZAOg7oOljxOgdEqwdxYp2hKg",
  "refresh_expires_at": "2026-11-30T17:53:58.350416435Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "c713a546-d881-4769-ab7e-6ade4fd3ccf3",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "326ffa7b-8d50-4606-81f6-1d4c8744771c",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-326ffa7b-8d50-4606-81f6-1d4c8744771c",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "28afb6c7023f68412b071391547088a9",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=326ffa7b-8d50-4606-81f6-1d4c8744771c",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380670997019"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=326ffa7b-8d50-4606-81f6-1d4c8744771c",
  "expires_at": "2026-10-31T18:23:58.781364Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/326ffa7b-8d50-4606-81f6-1d4c8744771c` → **200**

```json
{
  "id": "326ffa7b-8d50-4606-81f6-1d4c8744771c",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-31T18:23:58.781364Z",
  "card": {
    "id": "467e6236-ac16-4c54-911a-e11279f50891",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5501",
    "card_type": "Visa",
    "created_at": "2026-10-31T17:53:59.124408Z"
  },
  "failure_reason": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-16167"
}
```

```json
{
  "challenge_id": "464f0129-52d7-4bc0-a94f-b188ec2ff512",
  "expires_at": "2026-10-31T17:58:59.504357576Z",
  "resend_available_at": "2026-10-31T17:54:00.504357576Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "175759",
  "sent_at": "2026-10-31T17:53:59.509392187Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "464f0129-52d7-4bc0-a94f-b188ec2ff512",
  "code": "175759",
  "device_ref": "sandbox-16167"
}
```

```json
{
  "session_id": "57561bd4-fac7-486c-91d5-5cda644dcf22",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3MDEzOSwiaWF0IjoxNzkzNDY5MjM5LCJqdGkiOiJjZjlmN2U4OC1kZGNmLTRkMjEtYTFhMy1lNzZhMWJlMTEyNDMiLCJzaWQiOiI1NzU2MWJkNC1mYWM3LTQ4NmMtOTFkNS01Y2RhNjQ0ZGNmMjIifQ.bQmbBl7nYurI0rQB1IpBzVmkCP7J5MFDiS_qmMZPyj4",
  "access_expires_at": "2026-10-31T18:08:59.849299504Z",
  "refresh_token": "Guxbkb_vBX_h7HH22pk-2LPehV7rUcuae9uFpXzbMls",
  "refresh_expires_at": "2026-11-30T17:53:59.847911436Z",
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
  "command_id": "0899bcd6-33d7-4ffc-afd8-14bc7d16bcd9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:54:00Z",
    "sequence": 1793469240515
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e03155d5-b3e9-41b3-8ef9-d18af9c61b20",
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
  "last_heartbeat_at": "2026-10-31T17:54:00.622738Z",
  "last_location_at": "2026-10-31T17:54:00.622738Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4717fbb0-64bc-49bd-8632-2fc4814d3def",
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
  "id": "3ae103d4-e94c-454b-8a7d-48cbf666c122",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T17:59:00.994942Z",
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
  "command_id": "686f0571-ca04-4311-ac7b-39c2afc4b86f",
  "quote_id": "3ae103d4-e94c-454b-8a7d-48cbf666c122",
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
  "id": "1f96a43c-1061-445f-a035-03aa82048a99",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8bfa6328-645c-4dc2-881b-b5952566d972",
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
  "created_at": "2026-10-31T17:54:01.415111Z",
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

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99` → **200**

```json
{
  "id": "1f96a43c-1061-445f-a035-03aa82048a99",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8bfa6328-645c-4dc2-881b-b5952566d972",
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
  "created_at": "2026-10-31T17:54:01.415111Z",
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

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99` → **200**

```json
{
  "id": "1f96a43c-1061-445f-a035-03aa82048a99",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8bfa6328-645c-4dc2-881b-b5952566d972",
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
  "created_at": "2026-10-31T17:54:01.415111Z",
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
    "id": "286890f6-aa60-4f2e-90fa-d5a89a012ec2",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "expires_at": "2026-10-31T17:54:17.073691Z",
    "server_time": "2026-10-31T17:54:03.5287161Z",
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

`POST /api/driver/v1/offers/286890f6-aa60-4f2e-90fa-d5a89a012ec2/accept` → **200**

```json
{
  "command_id": "2f500b41-c8e1-4cce-9bf5-94e59325b3f6"
}
```

```json
{
  "id": "323edd2c-b314-4757-82bd-8aa43df46a6c",
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b6a49292-413f-46e4-b707-fbe101de91da",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b6a49292-413f-46e4-b707-fbe101de91da",
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
  "assignment_id": "323edd2c-b314-4757-82bd-8aa43df46a6c",
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

`POST /api/driver/v1/work-sessions/e03155d5-b3e9-41b3-8ef9-d18af9c61b20/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:54:04Z",
    "sequence": 1793469244522
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e03155d5-b3e9-41b3-8ef9-d18af9c61b20",
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
  "last_heartbeat_at": "2026-10-31T17:54:04.551808Z",
  "last_location_at": "2026-10-31T17:54:04.551808Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/b6a49292-413f-46e4-b707-fbe101de91da/arrive` → **200**

```json
{
  "command_id": "8f741d0c-1fb8-4837-9708-97395b0d3959",
  "expected_version": 0
}
```

```json
{
  "id": "b6a49292-413f-46e4-b707-fbe101de91da",
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
  "assignment_id": "323edd2c-b314-4757-82bd-8aa43df46a6c",
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
  "arrived_at": "2026-10-31T17:54:04.882294Z",
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

`POST /api/driver/v1/trips/b6a49292-413f-46e4-b707-fbe101de91da/start` → **200**

```json
{
  "command_id": "d7a948b8-601b-4c47-a414-87b8551bc4ca",
  "expected_version": 1
}
```

```json
{
  "id": "b6a49292-413f-46e4-b707-fbe101de91da",
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
  "assignment_id": "323edd2c-b314-4757-82bd-8aa43df46a6c",
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
  "arrived_at": "2026-10-31T17:54:04.882294Z",
  "started_at": "2026-10-31T17:54:05.224228Z",
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

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99` → **200**

```json
{
  "id": "1f96a43c-1061-445f-a035-03aa82048a99",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8bfa6328-645c-4dc2-881b-b5952566d972",
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
    "id": "323edd2c-b314-4757-82bd-8aa43df46a6c",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b6a49292-413f-46e4-b707-fbe101de91da",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:54:01.415111Z",
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

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99` → **200**

```json
{
  "id": "1f96a43c-1061-445f-a035-03aa82048a99",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8bfa6328-645c-4dc2-881b-b5952566d972",
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
    "id": "323edd2c-b314-4757-82bd-8aa43df46a6c",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b6a49292-413f-46e4-b707-fbe101de91da",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:54:01.415111Z",
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

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99` → **200**

```json
{
  "id": "1f96a43c-1061-445f-a035-03aa82048a99",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "8bfa6328-645c-4dc2-881b-b5952566d972",
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
    "id": "323edd2c-b314-4757-82bd-8aa43df46a6c",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b6a49292-413f-46e4-b707-fbe101de91da",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:54:01.415111Z",
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

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": true,
  "tip": null
}
```

Tip 1600 on order 1f96a43c-1061-445f-a035-03aa82048a99; the bank journal has 5 lines before it.
Crash point payment.after-send:TIP reached: halting as kill -9 would

The server halted at its crash point (exit 137).

Server start 2.

The worker asks the bank about the operation once its 2-minute lease has run out.

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
  }
}
```

`GET /api/rider/v1/orders/1f96a43c-1061-445f-a035-03aa82048a99/tip` → **200**

```json
{
  "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "available_until": "2026-11-01T17:54:05.571442Z",
  "open": false,
  "tip": {
    "id": "ef36d954-0009-4eb9-bf1d-1c62424caeda",
    "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:08.956806Z"
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
      "balance_minor": 8939
    }
  ],
  "entries": [
    {
      "id": "825f7934-90f0-4973-8b58-66a99c3632f9",
      "at": "2026-10-31T17:54:06.239615Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 8939,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
      "counterpart_id": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

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
      "id": "343897b4-5d9e-45e8-95ad-14d62b1f4512",
      "at": "2026-10-31T17:56:11.159616Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 1600,
      "reason": "Tip for the driver",
      "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
      "counterpart_id": null
    },
    {
      "id": "825f7934-90f0-4973-8b58-66a99c3632f9",
      "at": "2026-10-31T17:54:06.239615Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 8939,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1f96a43c-1061-445f-a035-03aa82048a99",
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
  "session_id": "e03155d5-b3e9-41b3-8ef9-d18af9c61b20",
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
  "last_heartbeat_at": "2026-10-31T17:54:04.551808Z",
  "last_location_at": "2026-10-31T17:54:04.551808Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e03155d5-b3e9-41b3-8ef9-d18af9c61b20/close` → **200**

```json
{
  "command_id": "e0bc6c29-362d-4130-9ecb-2a8222e7c3ac",
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
  "phone": "+380673981573",
  "device_ref": "sandbox-12634"
}
```

```json
{
  "challenge_id": "ec9ac2c4-4f8e-4655-9f22-d40c03b7eb65",
  "expires_at": "2026-10-31T18:01:26.208636529Z",
  "resend_available_at": "2026-10-31T17:56:27.208636529Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673981573` → **200**

```json
{
  "phone": "+380673981573",
  "audience": "CLIENT",
  "code": "671598",
  "sent_at": "2026-10-31T17:56:26.227214604Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ec9ac2c4-4f8e-4655-9f22-d40c03b7eb65",
  "code": "671598",
  "device_ref": "sandbox-12634"
}
```

```json
{
  "session_id": "f3ccb479-8f14-42a8-8740-6eb2e61ddd0a",
  "subject": {
    "type": "CLIENT",
    "id": "60cd147a-8d31-44d2-8351-99830bbd80a4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MGNkMTQ3YS04ZDMxLTQ0ZDItODM1MS05OTgzMGJiZDgwYTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDcwMjg2LCJpYXQiOjE3OTM0NjkzODYsImp0aSI6IjQ5YmFkOTQ2LTNjYjYtNDBmZS05NzZkLTNiNTZjZGU3ZDZiYiIsInNpZCI6ImYzY2NiNDc5LThmMTQtNDJhOC04NzQwLTZlYjJlNjFkZGQwYSJ9.PGLe2O1eNYhqTaAyVYNeqbLjkjtTFcG0BcDyx61QZyI",
  "access_expires_at": "2026-10-31T18:11:26.634733916Z",
  "refresh_token": "d3qwE5TlTqPf1TzzS5Ptshsl5UdJIsPOw8NyWoCZYyA",
  "refresh_expires_at": "2026-11-30T17:56:26.632047433Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-4284"
}
```

```json
{
  "challenge_id": "dbb82518-1357-45b0-bef7-8847c06e8e6f",
  "expires_at": "2026-10-31T18:01:27.00118933Z",
  "resend_available_at": "2026-10-31T17:56:28.00118933Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "931849",
  "sent_at": "2026-10-31T17:56:27.008479103Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dbb82518-1357-45b0-bef7-8847c06e8e6f",
  "code": "931849",
  "device_ref": "sandbox-4284"
}
```

```json
{
  "session_id": "8bc6051e-dd04-499f-ba3b-93b96e91f855",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3MDI4NywiaWF0IjoxNzkzNDY5Mzg3LCJqdGkiOiIzYWQxNzY3NC05N2I2LTRkNmUtOTE1Yy01ZmMwYjBlOGUzYjMiLCJzaWQiOiI4YmM2MDUxZS1kZDA0LTQ5OWYtYmEzYi05M2I5NmU5MWY4NTUifQ.YWfC3XIvoNkez3LStoz_MluGQXZO7saPUwtIWrlFP-4",
  "access_expires_at": "2026-10-31T18:11:27.358182439Z",
  "refresh_token": "QC-EvnZZmzzkbq80LhVU5swCuiEF_av-gQXokOeRIY4",
  "refresh_expires_at": "2026-11-30T17:56:27.357042312Z",
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
  "command_id": "444864e7-ea22-4c8e-8b98-5bdcccc214f1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:56:28Z",
    "sequence": 1793469388266
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bfa82288-18fa-4514-9b11-77b0f48b11a4",
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
  "last_heartbeat_at": "2026-10-31T17:56:28.095731Z",
  "last_location_at": "2026-10-31T17:56:28.095731Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "42461145-5f41-4cab-b1b3-d907c411a3d1",
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
  "id": "aacef805-2c70-4922-b6df-24b4bff9c50d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T18:01:28.485458Z",
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
  "command_id": "8e787aba-24be-45ca-8df0-997cd2312d22",
  "quote_id": "aacef805-2c70-4922-b6df-24b4bff9c50d",
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
  "id": "495c3a7a-221d-4b42-b398-215ba4e108b1",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "60cd147a-8d31-44d2-8351-99830bbd80a4",
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
  "created_at": "2026-10-31T17:56:28.913141Z",
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
    "id": "575254e5-54dd-4d79-979a-bfb740c43b2f",
    "order_id": "495c3a7a-221d-4b42-b398-215ba4e108b1",
    "expires_at": "2026-10-31T17:56:43.924599Z",
    "server_time": "2026-10-31T17:56:29.305860858Z",
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

`POST /api/driver/v1/offers/575254e5-54dd-4d79-979a-bfb740c43b2f/accept` → **200**

```json
{
  "command_id": "1aced5f1-8bcd-4b6c-bd36-92239d85d99c"
}
```

```json
{
  "id": "49ad8f95-d60d-4852-aed0-892e22917fc4",
  "order_id": "495c3a7a-221d-4b42-b398-215ba4e108b1",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "511f6e3f-e2ee-4737-ad92-bcfa41dc075d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "511f6e3f-e2ee-4737-ad92-bcfa41dc075d",
  "order_id": "495c3a7a-221d-4b42-b398-215ba4e108b1",
  "assignment_id": "49ad8f95-d60d-4852-aed0-892e22917fc4",
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

`POST /api/driver/v1/work-sessions/bfa82288-18fa-4514-9b11-77b0f48b11a4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:56:30Z",
    "sequence": 1793469390323
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bfa82288-18fa-4514-9b11-77b0f48b11a4",
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
  "last_heartbeat_at": "2026-10-31T17:56:30.355075Z",
  "last_location_at": "2026-10-31T17:56:30.355075Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/511f6e3f-e2ee-4737-ad92-bcfa41dc075d/arrive` → **200**

```json
{
  "command_id": "de8b69c8-762f-4de8-88a1-e16e05d35074",
  "expected_version": 0
}
```

```json
{
  "id": "511f6e3f-e2ee-4737-ad92-bcfa41dc075d",
  "order_id": "495c3a7a-221d-4b42-b398-215ba4e108b1",
  "assignment_id": "49ad8f95-d60d-4852-aed0-892e22917fc4",
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
  "arrived_at": "2026-10-31T17:56:30.720072Z",
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

`POST /api/driver/v1/trips/511f6e3f-e2ee-4737-ad92-bcfa41dc075d/start` → **200**

```json
{
  "command_id": "abfce9b1-8794-4d24-8ead-aafed7ca87cf",
  "expected_version": 1
}
```

```json
{
  "id": "511f6e3f-e2ee-4737-ad92-bcfa41dc075d",
  "order_id": "495c3a7a-221d-4b42-b398-215ba4e108b1",
  "assignment_id": "49ad8f95-d60d-4852-aed0-892e22917fc4",
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
  "arrived_at": "2026-10-31T17:56:30.720072Z",
  "started_at": "2026-10-31T17:56:31.064309Z",
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

TripCompleted 99616503-e97f-4b41-9593-fdf10fa0e448: PENDING after the crash.

Server start 4.

Consumers of the crashed event: `backoffice.problem-queues finance.trip-fare-posting finance.wallet-order-settlement notification.order-live-feed notification.push-feed operator-bonuses payments.trip-capture promotions.driver-trips promotions.trip-rewards`.

Live messages of the crashed event: **1** (sent before the crash, not again after it).

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bfa82288-18fa-4514-9b11-77b0f48b11a4",
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
  "last_heartbeat_at": "2026-10-31T17:56:30.355075Z",
  "last_location_at": "2026-10-31T17:56:30.355075Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/bfa82288-18fa-4514-9b11-77b0f48b11a4/close` → **200**

```json
{
  "command_id": "d9ce8342-b877-40af-a462-a51222a68f06",
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
  "phone": "+380677985653",
  "device_ref": "sandbox-32500"
}
```

```json
{
  "challenge_id": "fe99409d-89c5-491b-83ff-e1599b800f35",
  "expires_at": "2026-10-31T18:02:17.453583148Z",
  "resend_available_at": "2026-10-31T17:57:18.453583148Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677985653` → **200**

```json
{
  "phone": "+380677985653",
  "audience": "CLIENT",
  "code": "002438",
  "sent_at": "2026-10-31T17:57:17.470814011Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fe99409d-89c5-491b-83ff-e1599b800f35",
  "code": "002438",
  "device_ref": "sandbox-32500"
}
```

```json
{
  "session_id": "fb443406-3d59-4672-8bcc-540795559586",
  "subject": {
    "type": "CLIENT",
    "id": "4c3012b7-9225-41d3-8ebc-0ff1f8ace095"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YzMwMTJiNy05MjI1LTQxZDMtOGViYy0wZmYxZjhhY2UwOTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDcwMzM3LCJpYXQiOjE3OTM0Njk0MzcsImp0aSI6ImNlZTRkMTU4LTY5Y2ItNDM4ZS05N2E5LTkzZWZjMjIwOTk4YyIsInNpZCI6ImZiNDQzNDA2LTNkNTktNDY3Mi04YmNjLTU0MDc5NTU1OTU4NiJ9.2tcqU6x0hT4as3SmkgHtGKostz2vce5lfZ3NoZn2wNI",
  "access_expires_at": "2026-10-31T18:12:17.852529242Z",
  "refresh_token": "ZMbKA8lJIRpyoFg_RO5B9v35i1Mjndv_ruDKhGu05E4",
  "refresh_expires_at": "2026-11-30T17:57:17.849274155Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-20635"
}
```

```json
{
  "challenge_id": "f5dde28f-d5d5-4abb-b15d-ea99eeb71a60",
  "expires_at": "2026-10-31T18:02:18.223444102Z",
  "resend_available_at": "2026-10-31T17:57:19.223444102Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "808280",
  "sent_at": "2026-10-31T17:57:18.22968818Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f5dde28f-d5d5-4abb-b15d-ea99eeb71a60",
  "code": "808280",
  "device_ref": "sandbox-20635"
}
```

```json
{
  "session_id": "673aa9fe-fb22-4966-8ec2-3df0b6d4703a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3MDMzOCwiaWF0IjoxNzkzNDY5NDM4LCJqdGkiOiI2MDdiMzQ1MC04MTMyLTQwZDYtODg3MC03M2JjNmQ5NDdmNTUiLCJzaWQiOiI2NzNhYTlmZS1mYjIyLTQ5NjYtOGVjMi0zZGYwYjZkNDcwM2EifQ.o_f7N0VicrwyweEXyCXTlLeuXsjY4NX8D4dwRuOaRQ8",
  "access_expires_at": "2026-10-31T18:12:18.584819086Z",
  "refresh_token": "mtBbt-IX3OzrwxwpRrrmfFkD_hQE9D1Hx7WNorqUr0k",
  "refresh_expires_at": "2026-11-30T17:57:18.583265267Z",
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
  "command_id": "bcf96b85-0f42-42c3-8b35-ec1ece8a9f17",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:57:19Z",
    "sequence": 1793469439264
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4e0113e2-ddd1-414d-b39c-6aba16e62771",
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
  "last_heartbeat_at": "2026-10-31T17:57:19.332123Z",
  "last_location_at": "2026-10-31T17:57:19.332123Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "32e0b96c-a46d-4330-a2c1-87a9e38880d5",
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
  "id": "c59aa95b-655d-4ba7-99d9-c614b5df494f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T18:02:19.723778Z",
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
  "command_id": "13d15c44-11c5-45c4-b706-dce058a6211f",
  "quote_id": "c59aa95b-655d-4ba7-99d9-c614b5df494f",
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
  "id": "2e2c35bd-34a1-4d1a-bd8d-332778771d57",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4c3012b7-9225-41d3-8ebc-0ff1f8ace095",
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
  "created_at": "2026-10-31T17:57:20.160067Z",
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
    "id": "a4149763-31e3-404e-a37c-a8829d663fd9",
    "order_id": "2e2c35bd-34a1-4d1a-bd8d-332778771d57",
    "expires_at": "2026-10-31T17:57:35.170066Z",
    "server_time": "2026-10-31T17:57:20.565903999Z",
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

`POST /api/driver/v1/offers/a4149763-31e3-404e-a37c-a8829d663fd9/accept` → **200**

```json
{
  "command_id": "94859fdf-7943-4ba0-abcf-776680109952"
}
```

```json
{
  "id": "f3bdbed1-188b-4aaa-9670-6c7961a79f3d",
  "order_id": "2e2c35bd-34a1-4d1a-bd8d-332778771d57",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d25dfd07-77db-48ea-8329-614bc75e8f1f",
  "trip_phase": "TO_PICKUP"
}
```

The retry with the same command: HTTP 200.

One assignment, and the retry returned it.

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d25dfd07-77db-48ea-8329-614bc75e8f1f",
  "order_id": "2e2c35bd-34a1-4d1a-bd8d-332778771d57",
  "assignment_id": "f3bdbed1-188b-4aaa-9670-6c7961a79f3d",
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

`POST /api/driver/v1/work-sessions/4e0113e2-ddd1-414d-b39c-6aba16e62771/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:57:32Z",
    "sequence": 1793469452624
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4e0113e2-ddd1-414d-b39c-6aba16e62771",
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
  "last_heartbeat_at": "2026-10-31T17:57:32.711689Z",
  "last_location_at": "2026-10-31T17:57:32.711689Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/d25dfd07-77db-48ea-8329-614bc75e8f1f/arrive` → **200**

```json
{
  "command_id": "19ee8701-41c7-423c-993c-8f0166de89d4",
  "expected_version": 0
}
```

```json
{
  "id": "d25dfd07-77db-48ea-8329-614bc75e8f1f",
  "order_id": "2e2c35bd-34a1-4d1a-bd8d-332778771d57",
  "assignment_id": "f3bdbed1-188b-4aaa-9670-6c7961a79f3d",
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
  "arrived_at": "2026-10-31T17:57:33.065127Z",
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

`POST /api/driver/v1/trips/d25dfd07-77db-48ea-8329-614bc75e8f1f/start` → **200**

```json
{
  "command_id": "7799b3fa-5aa8-438f-aec1-7a9dc076d72a",
  "expected_version": 1
}
```

```json
{
  "id": "d25dfd07-77db-48ea-8329-614bc75e8f1f",
  "order_id": "2e2c35bd-34a1-4d1a-bd8d-332778771d57",
  "assignment_id": "f3bdbed1-188b-4aaa-9670-6c7961a79f3d",
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
  "arrived_at": "2026-10-31T17:57:33.065127Z",
  "started_at": "2026-10-31T17:57:33.403976Z",
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
  "session_id": "4e0113e2-ddd1-414d-b39c-6aba16e62771",
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
  "last_heartbeat_at": "2026-10-31T17:57:32.711689Z",
  "last_location_at": "2026-10-31T17:57:32.711689Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4e0113e2-ddd1-414d-b39c-6aba16e62771/close` → **200**

```json
{
  "command_id": "293c9ac3-3cec-487e-a3e8-9e43935a4cf1",
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

Answers during the cut: 768×201 1×429 9×500 

**A lost database connection was answered with 500, not a retryable 503.**
