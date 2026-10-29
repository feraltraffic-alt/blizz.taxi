# Sandbox transcript (2026-10-29T09:30:44Z, bfc4cfb)

# Scenario: chargeback

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380730837383",
  "device_ref": "sandbox-32177"
}
```

```json
{
  "challenge_id": "7b5ed32e-cf33-419c-9266-c731abdf8d17",
  "expires_at": "2026-10-29T09:35:44.479984076Z",
  "resend_available_at": "2026-10-29T09:30:45.479984076Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380730837383` → **200**

```json
{
  "phone": "+380730837383",
  "audience": "CLIENT",
  "code": "590614",
  "sent_at": "2026-10-29T09:30:44.528339982Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7b5ed32e-cf33-419c-9266-c731abdf8d17",
  "code": "590614",
  "device_ref": "sandbox-32177"
}
```

```json
{
  "session_id": "6d3f0599-440a-4769-b6fe-1a4c33891195",
  "subject": {
    "type": "CLIENT",
    "id": "7413818d-f271-4e4b-ac0d-c2d8e2a1d3b0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NDEzODE4ZC1mMjcxLTRlNGItYWMwZC1jMmQ4ZTJhMWQzYjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MTUwLCJpYXQiOjE3OTMyNjYyNTAsImp0aSI6IjQ5OTcxOWMwLWFjY2QtNDc0YS1iMzcyLWMxNWY1YTI5YzM0NyIsInNpZCI6IjZkM2YwNTk5LTQ0MGEtNDc2OS1iNmZlLTFhNGMzMzg5MTE5NSJ9.QiE0Tt6rcBRn97OU4QEKwTIlGHT4lvYV26iLYzRt1Nk",
  "access_expires_at": "2026-10-29T09:45:50.841405709Z",
  "refresh_token": "RPwtBdUJQ8-HyGVFJpEdXt_3srMuu172HAzcTBTv8wQ",
  "refresh_expires_at": "2026-11-28T09:30:50.839151155Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "9a8b26b4-bfdb-468d-a84f-44b9ce8bee52",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "554d27ae-ac90-47a3-bb84-9b1960baba1e",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-554d27ae-ac90-47a3-bb84-9b1960baba1e",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "4abbed1165b616d4e1193bb91c101626",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=554d27ae-ac90-47a3-bb84-9b1960baba1e",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730837383"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=554d27ae-ac90-47a3-bb84-9b1960baba1e",
  "expires_at": "2026-10-29T10:00:51.126292Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/554d27ae-ac90-47a3-bb84-9b1960baba1e` → **200**

```json
{
  "id": "554d27ae-ac90-47a3-bb84-9b1960baba1e",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T10:00:51.126292Z",
  "card": {
    "id": "fa63099b-23a3-4aa2-bb0a-fdf2993cbfe8",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8419",
    "card_type": "Visa",
    "created_at": "2026-10-29T09:30:51.368066Z"
  },
  "failure_reason": null
}
```

## Andrii is online nearby

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-23580"
}
```

```json
{
  "challenge_id": "778abf54-4d98-4f7e-9104-de1001eae1f7",
  "expires_at": "2026-10-29T09:35:51.612899037Z",
  "resend_available_at": "2026-10-29T09:30:52.612899037Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "826298",
  "sent_at": "2026-10-29T09:30:51.617122797Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "778abf54-4d98-4f7e-9104-de1001eae1f7",
  "code": "826298",
  "device_ref": "sandbox-23580"
}
```

```json
{
  "session_id": "404aa1b1-5ffe-4614-aa48-4c6961978a84",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzE1MSwiaWF0IjoxNzkzMjY2MjUxLCJqdGkiOiJjNDc3ZDExZC1kZTQ2LTQ2OTktODE1Yi1lMzM2NzU3M2RjNDYiLCJzaWQiOiI0MDRhYTFiMS01ZmZlLTQ2MTQtYWE0OC00YzY5NjE5NzhhODQifQ.gFLcCzxM5Y6zJU27BlYLfpyZ5s7TvSkgSzgb1IiiqVc",
  "access_expires_at": "2026-10-29T09:45:51.861515362Z",
  "refresh_token": "1o-BC0VOetIQR0CDucR-sK1EBXKDjWyFcOArBy-zuB4",
  "refresh_expires_at": "2026-11-28T09:30:51.860734513Z",
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
  "command_id": "62a91db3-cebf-4d09-89c3-96dba1a574de",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:30:52Z",
    "sequence": 1793266252306
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "28602d56-a472-4d51-80cc-7c3e995f2644",
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
  "last_heartbeat_at": "2026-10-29T09:30:52.460918Z",
  "last_location_at": "2026-10-29T09:30:52.460918Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "eac6cebe-bf7b-4e7d-9748-ae38f48fb78c",
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
  "id": "6edc621e-a0c7-4221-9b71-34a079f0d478",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:35:52.729037Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 16297,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "05204261-2e3b-4595-88e2-457627eed827",
  "quote_id": "6edc621e-a0c7-4221-9b71-34a079f0d478",
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
  "id": "a7728861-4107-4c91-8301-5f62fe307306",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7413818d-f271-4e4b-ac0d-c2d8e2a1d3b0",
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
  "created_at": "2026-10-29T09:30:53.034778Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a7728861-4107-4c91-8301-5f62fe307306` → **200**

```json
{
  "id": "a7728861-4107-4c91-8301-5f62fe307306",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7413818d-f271-4e4b-ac0d-c2d8e2a1d3b0",
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
  "created_at": "2026-10-29T09:30:53.034778Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a7728861-4107-4c91-8301-5f62fe307306` → **200**

```json
{
  "id": "a7728861-4107-4c91-8301-5f62fe307306",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7413818d-f271-4e4b-ac0d-c2d8e2a1d3b0",
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
  "created_at": "2026-10-29T09:30:53.034778Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "ba36b727-17ee-4dbe-a64d-7adb9fa803d1",
    "order_id": "a7728861-4107-4c91-8301-5f62fe307306",
    "expires_at": "2026-10-29T09:31:09.083253Z",
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

`POST /api/driver/v1/offers/ba36b727-17ee-4dbe-a64d-7adb9fa803d1/accept` → **200**

```json
{
  "command_id": "7bd5094f-1df8-477a-bfcc-c0be75fcb17d"
}
```

```json
{
  "id": "9d888af7-95c4-42a6-9330-3aeb6de3d604",
  "order_id": "a7728861-4107-4c91-8301-5f62fe307306",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9c7c2004-5982-421a-8ee9-6077dd9c16b8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9c7c2004-5982-421a-8ee9-6077dd9c16b8",
  "order_id": "a7728861-4107-4c91-8301-5f62fe307306",
  "assignment_id": "9d888af7-95c4-42a6-9330-3aeb6de3d604",
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
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/rider/v1/orders/a7728861-4107-4c91-8301-5f62fe307306/messages` → **201**

```json
{
  "command_id": "45171bea-a4c3-49cd-8e89-fa1139acdeca",
  "body": "Я біля входу, мій номер +380730837383, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "20959304-791c-411b-8e38-a59f9c73103e",
  "order_id": "a7728861-4107-4c91-8301-5f62fe307306",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380730837383, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-29T09:30:55.419059479Z"
}
```

`POST /api/driver/v1/trips/9c7c2004-5982-421a-8ee9-6077dd9c16b8/messages` → **201**

```json
{
  "command_id": "bf66430a-50fe-4b68-8327-a8511b6583e3",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "cf7651e3-cab9-4173-9d7a-1d61ccdc325b",
  "order_id": "a7728861-4107-4c91-8301-5f62fe307306",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-29T09:30:55.659090202Z"
}
```

`POST /api/driver/v1/work-sessions/28602d56-a472-4d51-80cc-7c3e995f2644/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:30:55Z",
    "sequence": 1793266255870
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "28602d56-a472-4d51-80cc-7c3e995f2644",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-29T09:30:55.895179Z",
  "last_location_at": "2026-10-29T09:30:55.895179Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9c7c2004-5982-421a-8ee9-6077dd9c16b8/arrive` → **200**

```json
{
  "command_id": "b9314e90-7c92-47c8-8068-34b796eb857c",
  "expected_version": 0
}
```

```json
{
  "id": "9c7c2004-5982-421a-8ee9-6077dd9c16b8",
  "order_id": "a7728861-4107-4c91-8301-5f62fe307306",
  "assignment_id": "9d888af7-95c4-42a6-9330-3aeb6de3d604",
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
  "arrived_at": "2026-10-29T09:30:56.121635Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9c7c2004-5982-421a-8ee9-6077dd9c16b8/start` → **200**

```json
{
  "command_id": "53798e9b-8993-46df-8de5-d8ac5f5bd85c",
  "expected_version": 1
}
```

```json
{
  "id": "9c7c2004-5982-421a-8ee9-6077dd9c16b8",
  "order_id": "a7728861-4107-4c91-8301-5f62fe307306",
  "assignment_id": "9d888af7-95c4-42a6-9330-3aeb6de3d604",
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
  "arrived_at": "2026-10-29T09:30:56.121635Z",
  "started_at": "2026-10-29T09:30:56.35118Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/28602d56-a472-4d51-80cc-7c3e995f2644/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:30:56Z",
    "sequence": 1793266256554
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "28602d56-a472-4d51-80cc-7c3e995f2644",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "ON_TRIP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-29T09:30:56.576006Z",
  "last_location_at": "2026-10-29T09:30:56.576006Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/9c7c2004-5982-421a-8ee9-6077dd9c16b8/complete` → **200**

```json
{
  "command_id": "b483f16b-3b01-42a5-aa97-cc2903dbf62e",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:30:56Z",
  "cash_received": false
}
```

```json
{
  "id": "9c7c2004-5982-421a-8ee9-6077dd9c16b8",
  "order_id": "a7728861-4107-4c91-8301-5f62fe307306",
  "assignment_id": "9d888af7-95c4-42a6-9330-3aeb6de3d604",
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
  "arrived_at": "2026-10-29T09:30:56.121635Z",
  "started_at": "2026-10-29T09:30:56.35118Z",
  "completed_at": "2026-10-29T09:30:56.807998Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/a7728861-4107-4c91-8301-5f62fe307306` → **200**

```json
{
  "id": "a7728861-4107-4c91-8301-5f62fe307306",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "7413818d-f271-4e4b-ac0d-c2d8e2a1d3b0",
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
    "id": "9d888af7-95c4-42a6-9330-3aeb6de3d604",
    "order_id": "a7728861-4107-4c91-8301-5f62fe307306",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9c7c2004-5982-421a-8ee9-6077dd9c16b8",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:30:53.034778Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a7728861-4107-4c91-8301-5f62fe307306` → **200**

```json
{
  "id": "a7728861-4107-4c91-8301-5f62fe307306",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "7413818d-f271-4e4b-ac0d-c2d8e2a1d3b0",
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
    "id": "9d888af7-95c4-42a6-9330-3aeb6de3d604",
    "order_id": "a7728861-4107-4c91-8301-5f62fe307306",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9c7c2004-5982-421a-8ee9-6077dd9c16b8",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:30:53.034778Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a7728861-4107-4c91-8301-5f62fe307306` → **200**

```json
{
  "id": "a7728861-4107-4c91-8301-5f62fe307306",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "7413818d-f271-4e4b-ac0d-c2d8e2a1d3b0",
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
    "id": "9d888af7-95c4-42a6-9330-3aeb6de3d604",
    "order_id": "a7728861-4107-4c91-8301-5f62fe307306",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9c7c2004-5982-421a-8ee9-6077dd9c16b8",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:30:53.034778Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "28602d56-a472-4d51-80cc-7c3e995f2644",
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
  "last_heartbeat_at": "2026-10-29T09:30:56.576006Z",
  "last_location_at": "2026-10-29T09:30:56.576006Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/28602d56-a472-4d51-80cc-7c3e995f2644/close` → **200**

```json
{
  "command_id": "6a2f6a22-0a1e-4fb2-a96a-07b8d8e9b369",
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

## The bank disputes the payment: finance exports the evidence

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
  "correlation_id": "c2bdc01b-4b19-4ccb-8044-6f46a9e3ea93"
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
  "session_id": "58d43dd4-f280-416a-9c6b-30a4099ca429",
  "subject": {
    "type": "STAFF",
    "id": "fa9480d0-d486-4778-9a96-edb409a54ff2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYTk0ODBkMC1kNDg2LTQ3NzgtOWE5Ni1lZGI0MDlhNTRmZjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcxNjAsImlhdCI6MTc5MzI2NjI2MCwianRpIjoiZmM5ZGYxMTItY2M4OC00OTRlLWFjNDItZjNmZTdlOTcyYzE4Iiwic2lkIjoiNThkNDNkZDQtZjI4MC00MTZhLTljNmItMzBhNDA5OWNhNDI5In0.wGbVLgLvQxDeSk42CJt2LI-aUIP-uKPYxVNq-jH_zSA",
  "access_expires_at": "2026-10-29T09:46:00.793582433Z",
  "refresh_token": "TGIno7irvIZnW5HYQHFSdx8PvyS7kHflaGS4_V61udg",
  "refresh_expires_at": "2026-10-29T21:31:00.793011319Z",
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
  "session_id": "f1bf4399-f309-4a47-895b-38d6d664a43e",
  "subject": {
    "type": "STAFF",
    "id": "fa9480d0-d486-4778-9a96-edb409a54ff2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYTk0ODBkMC1kNDg2LTQ3NzgtOWE5Ni1lZGI0MDlhNTRmZjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcxNjEsImlhdCI6MTc5MzI2NjI2MSwianRpIjoiYzI3NmE1MGYtNThiYi00N2ViLWFjNTMtNDRhYjBmZWRkYjUzIiwic2lkIjoiZjFiZjQzOTktZjMwOS00YTQ3LTg5NWItMzhkNmQ2NjRhNDNlIn0.9R80YXjMq8f76V7IqDFuJckZGL8Xih25l0QQkjeDPvE",
  "access_expires_at": "2026-10-29T09:46:01.96592209Z",
  "refresh_token": "Rps_I9XNx_SWT9qrqLb29c_90u-jSXwKLY8nxBC53x8",
  "refresh_expires_at": "2026-10-29T21:31:01.965271155Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/a7728861-4107-4c91-8301-5f62fe307306/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/a7728861-4107-4c91-8301-5f62fe307306/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "533d577e-3ae6-41ab-912c-29feaa5b46d3"
}
```

`GET /api/admin/v1/orders/a7728861-4107-4c91-8301-5f62fe307306/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-29T09:31:02.410018566Z",
  "order": {
    "id": "a7728861-4107-4c91-8301-5f62fe307306",
    "short_number": 1,
    "status": "FULFILLED",
    "payment_method": "CARD",
    "payment_state": "PAID",
    "pickup_label": "вул. Дмитрівська",
    "dropoff_label": "Нивки",
    "quoted_price_minor": 16297,
    "final_price_minor": 16297,
    "currency": "UAH",
    "wallet_minor": 0,
    "discount_minor": 0,
    "fare": {
      "amount_minor": 16297,
      "currency": "UAH",
      "policy": "M1_AGREED_PLUS_WAITING",
      "agreed_minor": 16297,
      "waiting_seconds": 0,
      "free_waiting_seconds": 180,
      "charged_waiting_seconds": 0,
      "waiting_minor": 0
    },
    "created_at": "2026-10-29T09:30:53.034778Z",
    "assigned_at": "2026-10-29T09:30:54.967564Z",
    "arrived_at": "2026-10-29T09:30:56.121635Z",
    "started_at": "2026-10-29T09:30:56.35118Z",
    "completed_at": "2026-10-29T09:30:56.807998Z"
  },
  "driver": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "name": "Андрій Шевчук",
    "vehicle": {
      "make": "Hyundai",
      "model": "Sonata",
      "color": "black",
      "registration_number": "AA0003TX"
    }
  },
  "track": {
    "points": 0,
    "flagged_points": 0,
    "first_point_at": null,
    "last_point_at": null,
    "duration_seconds": 0,
    "length_meters": 0
  },
  "rider": {
    "id": "7413818d-f271-4e4b-ac0d-c2d8e2a1d3b0",
    "registered_at": "2026-10-29T09:30:50.832512Z",
    "trips_last_year": [
      {
        "currency": "UAH",
        "trips": 1,
        "total_minor": 16297
      }
    ]
  },
  "card_operations": [
    {
      "type": "AUTH",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "WaitingAuthComplete",
      "created_at": "2026-10-29T09:30:53.041968Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-29T09:30:57.192158Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/a7728861-4107-4c91-8301-5f62fe307306/chargebacks` → **422**

```json
{
  "command_id": "569edc0b-59da-4216-ac59-bd0682fb7dd9",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "instance": "/api/admin/v1/orders/a7728861-4107-4c91-8301-5f62fe307306/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "c35498a8-54aa-4f54-a97b-f4f426841d10"
}
```

`POST /api/admin/v1/orders/a7728861-4107-4c91-8301-5f62fe307306/chargebacks` → **201**

```json
{
  "command_id": "dd04dd45-bea8-4adb-82d5-70d66e33fc28",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "19e958cf-5542-448f-be4c-990361217b35",
  "order_id": "a7728861-4107-4c91-8301-5f62fe307306",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T09:31:02.943574Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/a7728861-4107-4c91-8301-5f62fe307306/chargebacks` → **201**

```json
{
  "command_id": "dd04dd45-bea8-4adb-82d5-70d66e33fc28",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "19e958cf-5542-448f-be4c-990361217b35",
  "order_id": "a7728861-4107-4c91-8301-5f62fe307306",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T09:31:02.943574Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/7413818d-f271-4e4b-ac0d-c2d8e2a1d3b0` → **200**

```json
{
  "client": {
    "id": "7413818d-f271-4e4b-ac0d-c2d8e2a1d3b0",
    "phone": "+380730837383",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T09:30:50.832512Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "a7728861-4107-4c91-8301-5f62fe307306",
      "short_number": 1,
      "status": "FULFILLED",
      "created_at": "2026-10-29T09:30:53.034778Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "vehicle_class": "STANDARD",
      "price_minor": 16297,
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CARD",
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
      "cancellation": null,
      "pickup_at": null
    }
  ],
  "bonuses": [],
  "debt": [
    {
      "currency": "UAH",
      "amount_minor": 16297
    }
  ],
  "cases": []
}
```

## The provider's risk managers win it back: the debt is gone; a second answer is refused

`POST /api/admin/v1/orders/a7728861-4107-4c91-8301-5f62fe307306/chargebacks/19e958cf-5542-448f-be4c-990361217b35/resolve` → **200**

```json
{
  "command_id": "6f8c3d7e-a993-464d-b98a-b845d0e2ecdb",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "19e958cf-5542-448f-be4c-990361217b35",
  "order_id": "a7728861-4107-4c91-8301-5f62fe307306",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-29T09:31:02.943574Z",
  "resolved_at": "2026-10-29T09:31:03.68458Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/7413818d-f271-4e4b-ac0d-c2d8e2a1d3b0` → **200**

```json
{
  "client": {
    "id": "7413818d-f271-4e4b-ac0d-c2d8e2a1d3b0",
    "phone": "+380730837383",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T09:30:50.832512Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "a7728861-4107-4c91-8301-5f62fe307306",
      "short_number": 1,
      "status": "FULFILLED",
      "created_at": "2026-10-29T09:30:53.034778Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "vehicle_class": "STANDARD",
      "price_minor": 16297,
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CARD",
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
      "cancellation": null,
      "pickup_at": null
    }
  ],
  "bonuses": [],
  "debt": [
    {
      "currency": "UAH",
      "amount_minor": 16297
    }
  ],
  "cases": []
}
```

`GET /api/admin/v1/clients/7413818d-f271-4e4b-ac0d-c2d8e2a1d3b0` → **200**

```json
{
  "client": {
    "id": "7413818d-f271-4e4b-ac0d-c2d8e2a1d3b0",
    "phone": "+380730837383",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T09:30:50.832512Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "a7728861-4107-4c91-8301-5f62fe307306",
      "short_number": 1,
      "status": "FULFILLED",
      "created_at": "2026-10-29T09:30:53.034778Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "vehicle_class": "STANDARD",
      "price_minor": 16297,
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CARD",
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
      "cancellation": null,
      "pickup_at": null
    }
  ],
  "bonuses": [],
  "debt": [],
  "cases": []
}
```

`POST /api/admin/v1/orders/a7728861-4107-4c91-8301-5f62fe307306/chargebacks/19e958cf-5542-448f-be4c-990361217b35/resolve` → **409**

```json
{
  "command_id": "5ac6a33e-1ff0-450e-b378-98c4f2bb210a",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/a7728861-4107-4c91-8301-5f62fe307306/chargebacks/19e958cf-5542-448f-be4c-990361217b35/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a0d8daeb-f972-40cb-9cc7-87db537e5537"
}
```

`GET /api/admin/v1/orders/a7728861-4107-4c91-8301-5f62fe307306/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "19e958cf-5542-448f-be4c-990361217b35",
      "order_id": "a7728861-4107-4c91-8301-5f62fe307306",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-28",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-29T09:31:02.943574Z",
      "resolved_at": "2026-10-29T09:31:03.68458Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order a7728861-4107-4c91-8301-5f62fe307306 without phone or card digits; chargeback 19e958cf-5542-448f-be4c-990361217b35 recorded and won.

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
