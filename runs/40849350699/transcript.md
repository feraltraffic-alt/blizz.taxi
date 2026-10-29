# Sandbox transcript (2026-10-29T09:25:15Z, 22064c0)

# Scenario: chargeback

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733959992",
  "device_ref": "sandbox-20073"
}
```

```json
{
  "challenge_id": "681a4e9b-bbab-4eee-851a-94aa76873f90",
  "expires_at": "2026-10-29T09:30:15.95515761Z",
  "resend_available_at": "2026-10-29T09:25:16.95515761Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733959992` → **200**

```json
{
  "phone": "+380733959992",
  "audience": "CLIENT",
  "code": "668767",
  "sent_at": "2026-10-29T09:25:15.967961509Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "681a4e9b-bbab-4eee-851a-94aa76873f90",
  "code": "668767",
  "device_ref": "sandbox-20073"
}
```

```json
{
  "session_id": "5ff751ce-5b1b-4c32-a7ce-d16191770ff5",
  "subject": {
    "type": "CLIENT",
    "id": "79c76027-d02a-4fb5-a797-f493f90ef67d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3OWM3NjAyNy1kMDJhLTRmYjUtYTc5Ny1mNDkzZjkwZWY2N2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY2ODIyLCJpYXQiOjE3OTMyNjU5MjIsImp0aSI6IjE4ZDUwMTg2LTFjODgtNDc4Ni04MTIxLWVkNjdhZDIzYzgzYyIsInNpZCI6IjVmZjc1MWNlLTViMWItNGMzMi1hN2NlLWQxNjE5MTc3MGZmNSJ9.OTPFgDTjxNEj954M5VgiqBTz7WQ2mRJoOizhFH90mcU",
  "access_expires_at": "2026-10-29T09:40:22.897723245Z",
  "refresh_token": "ouIqhvMfmAg_kpr95PshpofPdEEoXgQ81F69orquJiE",
  "refresh_expires_at": "2026-11-28T09:25:22.895602632Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "88e04cf6-6c9a-45bb-8580-bc087d863be0",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "662fd3bb-9c10-4208-97f8-19c7cadc69f5",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-662fd3bb-9c10-4208-97f8-19c7cadc69f5",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "672127c8184d53d8cd2268a5976c1f20",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=662fd3bb-9c10-4208-97f8-19c7cadc69f5",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733959992"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=662fd3bb-9c10-4208-97f8-19c7cadc69f5",
  "expires_at": "2026-10-29T09:55:23.159592Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/662fd3bb-9c10-4208-97f8-19c7cadc69f5` → **200**

```json
{
  "id": "662fd3bb-9c10-4208-97f8-19c7cadc69f5",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T09:55:23.159592Z",
  "card": {
    "id": "6ca3dd1b-61f3-409b-8844-e8b4befcda51",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9960",
    "card_type": "Visa",
    "created_at": "2026-10-29T09:25:23.3941Z"
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
  "device_ref": "sandbox-22344"
}
```

```json
{
  "challenge_id": "b0f8c14e-924f-4f46-b60d-febfc52cc1bc",
  "expires_at": "2026-10-29T09:30:23.637019609Z",
  "resend_available_at": "2026-10-29T09:25:24.637019609Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "225726",
  "sent_at": "2026-10-29T09:25:23.642201667Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b0f8c14e-924f-4f46-b60d-febfc52cc1bc",
  "code": "225726",
  "device_ref": "sandbox-22344"
}
```

```json
{
  "session_id": "060fe606-e437-4ffe-9818-ceb9234dd3e1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NjgyMywiaWF0IjoxNzkzMjY1OTIzLCJqdGkiOiJhOTlkYzM4Mi1lODJiLTQ1M2ItOWYzNi05N2M4YjUzMTg5NTciLCJzaWQiOiIwNjBmZTYwNi1lNDM3LTRmZmUtOTgxOC1jZWI5MjM0ZGQzZTEifQ.q3qJ3uiRKdo1OIpe_3J68k8PiV9vNaYxZ4bREivgRAA",
  "access_expires_at": "2026-10-29T09:40:23.886178212Z",
  "refresh_token": "WuGslPJ5_C6hvNvUcj1XBKjvjgqYAG4QsQ9wVsAaqCI",
  "refresh_expires_at": "2026-11-28T09:25:23.885180855Z",
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
  "command_id": "e2b01c40-254d-43e5-99e3-f78c6b89a8c1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:25:24Z",
    "sequence": 1793265924330
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bd71c840-dc77-4272-97ef-5912c53806a4",
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
  "last_heartbeat_at": "2026-10-29T09:25:24.510253Z",
  "last_location_at": "2026-10-29T09:25:24.510253Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "55a44867-5bb5-4771-888a-b32643ddf322",
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
  "id": "3c390c35-0bf2-48b0-9fa1-9e4fc6049a06",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:30:24.776109Z",
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
  "command_id": "26d17350-ea37-445e-a9a8-6e7a9630ba9b",
  "quote_id": "3c390c35-0bf2-48b0-9fa1-9e4fc6049a06",
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
  "id": "bbbaa77c-82de-4738-b685-cf491c695409",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "79c76027-d02a-4fb5-a797-f493f90ef67d",
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
  "created_at": "2026-10-29T09:25:25.076962Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bbbaa77c-82de-4738-b685-cf491c695409` → **200**

```json
{
  "id": "bbbaa77c-82de-4738-b685-cf491c695409",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "79c76027-d02a-4fb5-a797-f493f90ef67d",
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
  "created_at": "2026-10-29T09:25:25.076962Z",
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
    "id": "ee6ae65a-42e0-4a9b-810b-06662707f312",
    "order_id": "bbbaa77c-82de-4738-b685-cf491c695409",
    "expires_at": "2026-10-29T09:25:40.23917Z",
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

`POST /api/driver/v1/offers/ee6ae65a-42e0-4a9b-810b-06662707f312/accept` → **200**

```json
{
  "command_id": "e0429b33-a10e-4ab1-a100-e2d258a9728c"
}
```

```json
{
  "id": "94a00e06-a732-47a8-b51e-b6e1066d9be6",
  "order_id": "bbbaa77c-82de-4738-b685-cf491c695409",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4f8db396-0809-4ba9-9dfa-ee601eff21a6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4f8db396-0809-4ba9-9dfa-ee601eff21a6",
  "order_id": "bbbaa77c-82de-4738-b685-cf491c695409",
  "assignment_id": "94a00e06-a732-47a8-b51e-b6e1066d9be6",
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

`POST /api/rider/v1/orders/bbbaa77c-82de-4738-b685-cf491c695409/messages` → **201**

```json
{
  "command_id": "c7ded785-353e-4700-9363-b521c40cb85a",
  "body": "Я біля входу, мій номер +380733959992, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "65dc2f2b-fd69-4a8b-a607-97763c5e5b99",
  "order_id": "bbbaa77c-82de-4738-b685-cf491c695409",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380733959992, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-29T09:25:26.243918417Z"
}
```

`POST /api/driver/v1/trips/4f8db396-0809-4ba9-9dfa-ee601eff21a6/messages` → **201**

```json
{
  "command_id": "15a0ee42-6ae9-425a-8ae9-2bd8d7e8ac67",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "3f743c97-3a0d-45b2-90bd-48e677e7b34b",
  "order_id": "bbbaa77c-82de-4738-b685-cf491c695409",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-29T09:25:26.470227295Z"
}
```

`POST /api/driver/v1/work-sessions/bd71c840-dc77-4272-97ef-5912c53806a4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:25:26Z",
    "sequence": 1793265926680
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bd71c840-dc77-4272-97ef-5912c53806a4",
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
  "last_heartbeat_at": "2026-10-29T09:25:26.707072Z",
  "last_location_at": "2026-10-29T09:25:26.707072Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4f8db396-0809-4ba9-9dfa-ee601eff21a6/arrive` → **200**

```json
{
  "command_id": "d3ad2d48-2824-404d-b0ab-5e49caf5a58d",
  "expected_version": 0
}
```

```json
{
  "id": "4f8db396-0809-4ba9-9dfa-ee601eff21a6",
  "order_id": "bbbaa77c-82de-4738-b685-cf491c695409",
  "assignment_id": "94a00e06-a732-47a8-b51e-b6e1066d9be6",
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
  "arrived_at": "2026-10-29T09:25:26.930738Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4f8db396-0809-4ba9-9dfa-ee601eff21a6/start` → **200**

```json
{
  "command_id": "9ad25b79-37a1-4e49-85db-323576d34963",
  "expected_version": 1
}
```

```json
{
  "id": "4f8db396-0809-4ba9-9dfa-ee601eff21a6",
  "order_id": "bbbaa77c-82de-4738-b685-cf491c695409",
  "assignment_id": "94a00e06-a732-47a8-b51e-b6e1066d9be6",
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
  "arrived_at": "2026-10-29T09:25:26.930738Z",
  "started_at": "2026-10-29T09:25:27.152278Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/bd71c840-dc77-4272-97ef-5912c53806a4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:25:27Z",
    "sequence": 1793265927368
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bd71c840-dc77-4272-97ef-5912c53806a4",
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
  "last_heartbeat_at": "2026-10-29T09:25:27.389685Z",
  "last_location_at": "2026-10-29T09:25:27.389685Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/4f8db396-0809-4ba9-9dfa-ee601eff21a6/complete` → **200**

```json
{
  "command_id": "3a13668c-d8ea-4831-88f5-f604029fc417",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:25:27Z",
  "cash_received": false
}
```

```json
{
  "id": "4f8db396-0809-4ba9-9dfa-ee601eff21a6",
  "order_id": "bbbaa77c-82de-4738-b685-cf491c695409",
  "assignment_id": "94a00e06-a732-47a8-b51e-b6e1066d9be6",
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
  "arrived_at": "2026-10-29T09:25:26.930738Z",
  "started_at": "2026-10-29T09:25:27.152278Z",
  "completed_at": "2026-10-29T09:25:27.623259Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/bbbaa77c-82de-4738-b685-cf491c695409` → **200**

```json
{
  "id": "bbbaa77c-82de-4738-b685-cf491c695409",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "79c76027-d02a-4fb5-a797-f493f90ef67d",
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
    "id": "94a00e06-a732-47a8-b51e-b6e1066d9be6",
    "order_id": "bbbaa77c-82de-4738-b685-cf491c695409",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4f8db396-0809-4ba9-9dfa-ee601eff21a6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:25:25.076962Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bbbaa77c-82de-4738-b685-cf491c695409` → **200**

```json
{
  "id": "bbbaa77c-82de-4738-b685-cf491c695409",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "79c76027-d02a-4fb5-a797-f493f90ef67d",
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
    "id": "94a00e06-a732-47a8-b51e-b6e1066d9be6",
    "order_id": "bbbaa77c-82de-4738-b685-cf491c695409",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4f8db396-0809-4ba9-9dfa-ee601eff21a6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:25:25.076962Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bbbaa77c-82de-4738-b685-cf491c695409` → **200**

```json
{
  "id": "bbbaa77c-82de-4738-b685-cf491c695409",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "79c76027-d02a-4fb5-a797-f493f90ef67d",
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
    "id": "94a00e06-a732-47a8-b51e-b6e1066d9be6",
    "order_id": "bbbaa77c-82de-4738-b685-cf491c695409",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4f8db396-0809-4ba9-9dfa-ee601eff21a6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:25:25.076962Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bbbaa77c-82de-4738-b685-cf491c695409` → **200**

```json
{
  "id": "bbbaa77c-82de-4738-b685-cf491c695409",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "79c76027-d02a-4fb5-a797-f493f90ef67d",
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
    "id": "94a00e06-a732-47a8-b51e-b6e1066d9be6",
    "order_id": "bbbaa77c-82de-4738-b685-cf491c695409",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4f8db396-0809-4ba9-9dfa-ee601eff21a6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:25:25.076962Z",
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
  "session_id": "bd71c840-dc77-4272-97ef-5912c53806a4",
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
  "last_heartbeat_at": "2026-10-29T09:25:27.389685Z",
  "last_location_at": "2026-10-29T09:25:27.389685Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bd71c840-dc77-4272-97ef-5912c53806a4/close` → **200**

```json
{
  "command_id": "c154fe95-ad27-4ac2-8888-955f8e2739c8",
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
  "correlation_id": "5d9c7369-c78f-420f-952d-aeadb9b92d5e"
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
  "session_id": "c4e89a72-eedc-403e-965f-35e5447d88ff",
  "subject": {
    "type": "STAFF",
    "id": "16709b32-240e-4e3c-87f1-591901153873"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNjcwOWIzMi0yNDBlLTRlM2MtODdmMS01OTE5MDExNTM4NzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjY4MzIsImlhdCI6MTc5MzI2NTkzMiwianRpIjoiZmI3MzAyYzQtNjUxOS00OWZkLTgzYTktYmFkMTMxMzc2MGRjIiwic2lkIjoiYzRlODlhNzItZWVkYy00MDNlLTk2NWYtMzVlNTQ0N2Q4OGZmIn0.A2VLb8EHC1bq96mYvXc7ZeD0V6GSatnJadmL7dHIZF0",
  "access_expires_at": "2026-10-29T09:40:32.834497978Z",
  "refresh_token": "R50qNNj_c3zrFSRDQ8p_tms9VcIUhhQrlhSXXzYpFYc",
  "refresh_expires_at": "2026-10-29T21:25:32.833802404Z",
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
  "session_id": "577493a8-0f25-403f-88c8-782044a56bc5",
  "subject": {
    "type": "STAFF",
    "id": "16709b32-240e-4e3c-87f1-591901153873"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNjcwOWIzMi0yNDBlLTRlM2MtODdmMS01OTE5MDExNTM4NzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjY4MzMsImlhdCI6MTc5MzI2NTkzMywianRpIjoiNTAzNTE2MGEtMGJkNC00NDZkLTkyZjUtNDRhZGQ2YTcyMGE4Iiwic2lkIjoiNTc3NDkzYTgtMGYyNS00MDNmLTg4YzgtNzgyMDQ0YTU2YmM1In0.nAjOqCT5aGVeNADb2td5fDdAaZ-mSXnO1okPV9NH5LY",
  "access_expires_at": "2026-10-29T09:40:33.910680853Z",
  "refresh_token": "lXHTTGN_rYLEateW9g4rPx2xZvBO_wvCR-BBf-waD-E",
  "refresh_expires_at": "2026-10-29T21:25:33.909993842Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/bbbaa77c-82de-4738-b685-cf491c695409/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/bbbaa77c-82de-4738-b685-cf491c695409/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "5892986a-b2cb-4f9d-bc54-884a008a74d2"
}
```

`GET /api/admin/v1/orders/bbbaa77c-82de-4738-b685-cf491c695409/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-29T09:25:34.578664333Z",
  "order": {
    "id": "bbbaa77c-82de-4738-b685-cf491c695409",
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
    "created_at": "2026-10-29T09:25:25.076962Z",
    "assigned_at": "2026-10-29T09:25:25.787314Z",
    "arrived_at": "2026-10-29T09:25:26.930738Z",
    "started_at": "2026-10-29T09:25:27.152278Z",
    "completed_at": "2026-10-29T09:25:27.623259Z"
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
    "id": "79c76027-d02a-4fb5-a797-f493f90ef67d",
    "registered_at": "2026-10-29T09:25:22.888314Z",
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
      "created_at": "2026-10-29T09:25:25.0862Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-29T09:25:28.372682Z"
    }
  ],
  "chat": [
    {
```

Done: the evidence of card order bbbaa77c-82de-4738-b685-cf491c695409, without phone or card digits.

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
