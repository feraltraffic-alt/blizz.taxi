# Sandbox transcript (2026-10-28T15:02:04Z, 295fd40)

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738135368",
  "device_ref": "sandbox-28833"
}
```

```json
{
  "challenge_id": "80149a61-39fe-4d66-88d4-62424af85f58",
  "expires_at": "2026-10-28T15:07:04.318270295Z",
  "resend_available_at": "2026-10-28T15:02:05.318270295Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380738135368` → **200**

```json
{
  "phone": "+380738135368",
  "audience": "CLIENT",
  "code": "277557",
  "sent_at": "2026-10-28T15:02:04.325877149Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "80149a61-39fe-4d66-88d4-62424af85f58",
  "code": "277557",
  "device_ref": "sandbox-28833"
}
```

```json
{
  "session_id": "d7ce49cf-4322-4982-8cba-d5f5683bedda",
  "subject": {
    "type": "CLIENT",
    "id": "189ab6d9-823f-44fb-b0cc-71fdd2b25e0b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODlhYjZkOS04MjNmLTQ0ZmItYjBjYy03MWZkZDJiMjVlMGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwNjMxLCJpYXQiOjE3OTMxOTk3MzEsImp0aSI6IjE2ZTM1ZjBmLTBiMTAtNDFiZS1hYmU5LWMwODkzZjExN2Q1ZSIsInNpZCI6ImQ3Y2U0OWNmLTQzMjItNDk4Mi04Y2JhLWQ1ZjU2ODNiZWRkYSJ9.3poN9poj5W9QnclVOJ-HmBK6B2UXxzjT4pzuJsYyDec",
  "access_expires_at": "2026-10-28T15:17:11.241434912Z",
  "refresh_token": "4Movo_kfx2pqSLQXM9lNigYBcSeusJLhtVDtmBPcSr4",
  "refresh_expires_at": "2026-11-27T15:02:11.239403931Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "e2629fad-45a8-4442-8a58-9e8954a64aea",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "96bcbac0-33e8-4c7b-80db-e297bcba5aa3",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-96bcbac0-33e8-4c7b-80db-e297bcba5aa3",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "28c92d2c91df9a92dd2636c16a0031e2",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=96bcbac0-33e8-4c7b-80db-e297bcba5aa3",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738135368"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=96bcbac0-33e8-4c7b-80db-e297bcba5aa3",
  "expires_at": "2026-10-28T15:32:11.571092Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/96bcbac0-33e8-4c7b-80db-e297bcba5aa3` → **200**

```json
{
  "id": "96bcbac0-33e8-4c7b-80db-e297bcba5aa3",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T15:32:11.571092Z",
  "card": {
    "id": "39788a59-bd32-470a-b92f-efc21429e07b",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7873",
    "card_type": "Visa",
    "created_at": "2026-10-28T15:02:11.809729Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "39788a59-bd32-470a-b92f-efc21429e07b",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****7873",
      "card_type": "Visa",
      "created_at": "2026-10-28T15:02:11.809729Z"
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
  "device_ref": "sandbox-13833"
}
```

```json
{
  "challenge_id": "b3551b7d-a703-4d06-86ba-3218707b9db9",
  "expires_at": "2026-10-28T15:07:12.279395436Z",
  "resend_available_at": "2026-10-28T15:02:13.279395436Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "245865",
  "sent_at": "2026-10-28T15:02:12.282348826Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b3551b7d-a703-4d06-86ba-3218707b9db9",
  "code": "245865",
  "device_ref": "sandbox-13833"
}
```

```json
{
  "session_id": "f0599446-a300-4f15-a1a3-918343d25eee",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDYzMiwiaWF0IjoxNzkzMTk5NzMyLCJqdGkiOiI3N2Q2ZDg0Zi00OThlLTQ3YTAtOWMwNi0yMWRlNjA2MjY2YjUiLCJzaWQiOiJmMDU5OTQ0Ni1hMzAwLTRmMTUtYTFhMy05MTgzNDNkMjVlZWUifQ.Ew1hhN0JwaEJtOXjEPvK4B2OYHQaNqHixUM895a2c00",
  "access_expires_at": "2026-10-28T15:17:12.569638063Z",
  "refresh_token": "JyF7PCOJzrBrHUV8HqlSavM7rw_ONjmTp2bbtGLJCwU",
  "refresh_expires_at": "2026-11-27T15:02:12.567907964Z",
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
  "command_id": "c0400bcd-266d-4dd5-89e7-c4109b9f1c03",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:02:13Z",
    "sequence": 1793199733334
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6ed21631-cadf-4d61-9dab-5d88acdf7c85",
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
  "last_heartbeat_at": "2026-10-28T15:02:13.216209Z",
  "last_location_at": "2026-10-28T15:02:13.216209Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "701fe1b9-f824-433d-a925-580cdc1cf3e4",
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
  "id": "b678f0d1-bb70-4e3a-b9a4-c3c5a065a359",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:07:13.512272Z",
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
  "command_id": "549d75a9-893f-4ef6-968a-1af785638c16",
  "quote_id": "b678f0d1-bb70-4e3a-b9a4-c3c5a065a359",
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
  "payment_method": "CARD",
  "wallet_minor": 0
}
```

```json
{
  "id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "189ab6d9-823f-44fb-b0cc-71fdd2b25e0b",
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
  "created_at": "2026-10-28T15:02:13.805194Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff10b4cc-6094-4be7-be31-0ef37336d839` → **200**

```json
{
  "id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "189ab6d9-823f-44fb-b0cc-71fdd2b25e0b",
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
  "created_at": "2026-10-28T15:02:13.805194Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff10b4cc-6094-4be7-be31-0ef37336d839` → **200**

```json
{
  "id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "189ab6d9-823f-44fb-b0cc-71fdd2b25e0b",
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
  "created_at": "2026-10-28T15:02:13.805194Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Andrii takes it and drives

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "0e092b63-318c-41e0-95e9-c216b4df2ba8",
    "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
    "expires_at": "2026-10-28T15:02:29.3031Z",
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

`POST /api/driver/v1/offers/0e092b63-318c-41e0-95e9-c216b4df2ba8/accept` → **200**

```json
{
  "command_id": "39bccb80-ad65-4f83-b027-c8cb0618343b"
}
```

```json
{
  "id": "629d8e9f-b715-427a-a8d4-42cde878bd4d",
  "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "38347234-7731-4c0f-8f91-d5121c30d301",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "38347234-7731-4c0f-8f91-d5121c30d301",
  "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
  "assignment_id": "629d8e9f-b715-427a-a8d4-42cde878bd4d",
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

`POST /api/driver/v1/work-sessions/6ed21631-cadf-4d61-9dab-5d88acdf7c85/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:02:16Z",
    "sequence": 1793199736160
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6ed21631-cadf-4d61-9dab-5d88acdf7c85",
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
  "last_heartbeat_at": "2026-10-28T15:02:16.18395Z",
  "last_location_at": "2026-10-28T15:02:16.18395Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/38347234-7731-4c0f-8f91-d5121c30d301/arrive` → **200**

```json
{
  "command_id": "d5389db3-d0cb-4df8-8b52-8412d826653a",
  "expected_version": 0
}
```

```json
{
  "id": "38347234-7731-4c0f-8f91-d5121c30d301",
  "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
  "assignment_id": "629d8e9f-b715-427a-a8d4-42cde878bd4d",
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
  "arrived_at": "2026-10-28T15:02:16.41864Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/38347234-7731-4c0f-8f91-d5121c30d301/start` → **200**

```json
{
  "command_id": "bee81ae8-0dba-4263-b272-de00100b5632",
  "expected_version": 1
}
```

```json
{
  "id": "38347234-7731-4c0f-8f91-d5121c30d301",
  "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
  "assignment_id": "629d8e9f-b715-427a-a8d4-42cde878bd4d",
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
  "arrived_at": "2026-10-28T15:02:16.41864Z",
  "started_at": "2026-10-28T15:02:16.653234Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/38347234-7731-4c0f-8f91-d5121c30d301/complete` → **200**

```json
{
  "command_id": "e68b3acb-9cbf-4576-a59f-84b6aadd2d41",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:02:16Z",
  "cash_received": true
}
```

```json
{
  "id": "38347234-7731-4c0f-8f91-d5121c30d301",
  "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
  "assignment_id": "629d8e9f-b715-427a-a8d4-42cde878bd4d",
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
  "arrived_at": "2026-10-28T15:02:16.41864Z",
  "started_at": "2026-10-28T15:02:16.653234Z",
  "completed_at": "2026-10-28T15:02:16.88689Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/ff10b4cc-6094-4be7-be31-0ef37336d839` → **200**

```json
{
  "id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "189ab6d9-823f-44fb-b0cc-71fdd2b25e0b",
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
    "id": "629d8e9f-b715-427a-a8d4-42cde878bd4d",
    "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "38347234-7731-4c0f-8f91-d5121c30d301",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:02:13.805194Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff10b4cc-6094-4be7-be31-0ef37336d839` → **200**

```json
{
  "id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "189ab6d9-823f-44fb-b0cc-71fdd2b25e0b",
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
    "id": "629d8e9f-b715-427a-a8d4-42cde878bd4d",
    "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "38347234-7731-4c0f-8f91-d5121c30d301",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:02:13.805194Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff10b4cc-6094-4be7-be31-0ef37336d839` → **200**

```json
{
  "id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "189ab6d9-823f-44fb-b0cc-71fdd2b25e0b",
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
    "id": "629d8e9f-b715-427a-a8d4-42cde878bd4d",
    "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "38347234-7731-4c0f-8f91-d5121c30d301",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:02:13.805194Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
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
      "id": "85270b88-f2db-4852-af6d-84f2b03164f2",
      "at": "2026-10-28T15:02:17.449002Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/ff10b4cc-6094-4be7-be31-0ef37336d839/tip` → **200**

```json
{
  "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
  "currency": "UAH",
  "trip_cost_minor": 16297,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1700
    },
    {
      "percent": 15,
      "amount_minor": 2500
    },
    {
      "percent": 20,
      "amount_minor": 3300
    },
    {
      "percent": 25,
      "amount_minor": 4100
    }
  ],
  "min_minor": 100,
  "max_minor": 16300,
  "method": "CARD",
  "available_until": "2026-10-29T15:02:16.88689Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/ff10b4cc-6094-4be7-be31-0ef37336d839/tip` → **201**

```json
{
  "command_id": "7b196730-57f9-4286-bd2d-1c862913d704",
  "amount_minor": 2500
}
```

```json
{
  "id": "0d2aa7d3-c5c5-49d7-a8c7-34c4a99ccfd7",
  "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T15:02:20.456706Z"
}
```

`GET /api/rider/v1/orders/ff10b4cc-6094-4be7-be31-0ef37336d839/tip` → **200**

```json
{
  "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
  "currency": "UAH",
  "trip_cost_minor": 16297,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1700
    },
    {
      "percent": 15,
      "amount_minor": 2500
    },
    {
      "percent": 20,
      "amount_minor": 3300
    },
    {
      "percent": 25,
      "amount_minor": 4100
    }
  ],
  "min_minor": 100,
  "max_minor": 16300,
  "method": "CARD",
  "available_until": "2026-10-29T15:02:16.88689Z",
  "open": false,
  "tip": {
    "id": "0d2aa7d3-c5c5-49d7-a8c7-34c4a99ccfd7",
    "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T15:02:20.456706Z"
  }
}
```

`GET /api/rider/v1/orders/ff10b4cc-6094-4be7-be31-0ef37336d839/tip` → **200**

```json
{
  "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
  "currency": "UAH",
  "trip_cost_minor": 16297,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1700
    },
    {
      "percent": 15,
      "amount_minor": 2500
    },
    {
      "percent": 20,
      "amount_minor": 3300
    },
    {
      "percent": 25,
      "amount_minor": 4100
    }
  ],
  "min_minor": 100,
  "max_minor": 16300,
  "method": "CARD",
  "available_until": "2026-10-29T15:02:16.88689Z",
  "open": false,
  "tip": {
    "id": "0d2aa7d3-c5c5-49d7-a8c7-34c4a99ccfd7",
    "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T15:02:20.456706Z"
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
      "id": "85270b88-f2db-4852-af6d-84f2b03164f2",
      "at": "2026-10-28T15:02:17.449002Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
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
      "balance_minor": 16352
    }
  ],
  "entries": [
    {
      "id": "fc8f4e84-46c6-4fb1-9807-aedf7e07cf01",
      "at": "2026-10-28T15:02:22.650359Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
      "counterpart_id": null
    },
    {
      "id": "85270b88-f2db-4852-af6d-84f2b03164f2",
      "at": "2026-10-28T15:02:17.449002Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d4a47ea1-1baa-4aff-87fc-6e3aa955ad9d",
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
  "id": "0d3c6567-51ce-4661-8137-4761f640cdc5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:07:23.589507Z",
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

## Bonuses cover the fare; 300 minor units remain for a larger card tip

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
  "correlation_id": "e49d3742-a4ae-4be4-9dc8-c7fb34276cbd"
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
  "session_id": "5c541572-1062-4b2e-b686-7b4e98dbbcb8",
  "subject": {
    "type": "STAFF",
    "id": "86a656a9-a51d-46ea-b3df-d68865531794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NmE2NTZhOS1hNTFkLTQ2ZWEtYjNkZi1kNjg4NjU1MzE3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA2NDQsImlhdCI6MTc5MzE5OTc0NCwianRpIjoiNTAxNjBlYjItMjAzMi00YTQ2LTgxYWMtNTJlZDViMWM5YTdhIiwic2lkIjoiNWM1NDE1NzItMTA2Mi00YjJlLWI2ODYtN2I0ZTk4ZGJiY2I4In0.vTTxlWSVnJwBeHBDhEvRotbzm7Iw12FiQDN34w86L74",
  "access_expires_at": "2026-10-28T15:17:24.62040137Z",
  "refresh_token": "axNDHAuaOFfGpS7JcaBCQ6J60QYsNk87eVKXRs3t6tQ",
  "refresh_expires_at": "2026-10-29T03:02:24.619503572Z",
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
  "session_id": "f50891d4-707b-4bc4-b00e-ad332d2ef31b",
  "subject": {
    "type": "STAFF",
    "id": "86a656a9-a51d-46ea-b3df-d68865531794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NmE2NTZhOS1hNTFkLTQ2ZWEtYjNkZi1kNjg4NjU1MzE3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA2NDYsImlhdCI6MTc5MzE5OTc0NiwianRpIjoiN2Y1OWE2OWYtMDUwMS00ZTNmLThjMzktMzVmOTRkMDkyZDhiIiwic2lkIjoiZjUwODkxZDQtNzA3Yi00YmM0LWIwMGUtYWQzMzJkMmVmMzFiIn0.SgASsJuKIAXa7smu_lskh4mzXW2eGkpM2_-LqkbBL10",
  "access_expires_at": "2026-10-28T15:17:26.000189768Z",
  "refresh_token": "cdjYcm154lXFN-oZoaVnp_OY4HW7GIjTy9mloL2IagQ",
  "refresh_expires_at": "2026-10-29T03:02:25.999547595Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380738135368` → **200**

```json
{
  "client_id": "189ab6d9-823f-44fb-b0cc-71fdd2b25e0b"
}
```

`POST /api/admin/v1/rider-wallets/189ab6d9-823f-44fb-b0cc-71fdd2b25e0b/top-ups` → **201**

```json
{
  "command_id": "70bcd33c-955d-42ae-8806-3c7c6c62e1d2",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "189ab6d9-823f-44fb-b0cc-71fdd2b25e0b",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 16597,
      "reserved_minor": 0,
      "available_minor": 16597
    }
  ],
  "entries": [
    {
      "id": "20a53729-66d9-43da-8115-d615ec279471",
      "at": "2026-10-28T15:02:26.457717Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "86a656a9-a51d-46ea-b3df-d68865531794",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4671439f-2794-4f5d-89ad-92f7f6e40b0d",
  "quote_id": "0d3c6567-51ce-4661-8137-4761f640cdc5",
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
  "payment_method": "CARD",
  "wallet_minor": 16297
}
```

```json
{
  "id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "189ab6d9-823f-44fb-b0cc-71fdd2b25e0b",
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
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-28T15:02:26.942154Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/36de19bd-d4e1-4ae6-9a69-fea33737c77e` → **200**

```json
{
  "id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "189ab6d9-823f-44fb-b0cc-71fdd2b25e0b",
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
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-28T15:02:26.942154Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Andrii takes it and drives

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "d4a50417-f1c5-466a-8375-401becea0869",
    "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
    "expires_at": "2026-10-28T15:02:41.948275Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4437,
      "lon": 30.497
    },
    "pickup_label": "вул. Дмитрівська",
    "dropoff_label": "Нивки",
    "payment_method": "CASH",
    "price_minor": 16297,
    "currency": "UAH",
    "distance_m": 11
  }
]
```

`POST /api/driver/v1/offers/d4a50417-f1c5-466a-8375-401becea0869/accept` → **200**

```json
{
  "command_id": "1c07d1c7-903d-412d-a01b-434af88ecca7"
}
```

```json
{
  "id": "5ccd6521-7097-4e31-bc64-d2aef8ba2e22",
  "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7a3c93b6-d345-4882-ac37-58a00d7b7c53",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7a3c93b6-d345-4882-ac37-58a00d7b7c53",
  "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
  "assignment_id": "5ccd6521-7097-4e31-bc64-d2aef8ba2e22",
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
  "payment_method": "CASH",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/6ed21631-cadf-4d61-9dab-5d88acdf7c85/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:02:28Z",
    "sequence": 1793199748703
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6ed21631-cadf-4d61-9dab-5d88acdf7c85",
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
  "last_heartbeat_at": "2026-10-28T15:02:28.089778Z",
  "last_location_at": "2026-10-28T15:02:28.089778Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7a3c93b6-d345-4882-ac37-58a00d7b7c53/arrive` → **200**

```json
{
  "command_id": "ce44d8d9-b697-463b-acd3-36c58a93b0f2",
  "expected_version": 0
}
```

```json
{
  "id": "7a3c93b6-d345-4882-ac37-58a00d7b7c53",
  "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
  "assignment_id": "5ccd6521-7097-4e31-bc64-d2aef8ba2e22",
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
  "payment_method": "CASH",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-28T15:02:28.316084Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7a3c93b6-d345-4882-ac37-58a00d7b7c53/start` → **200**

```json
{
  "command_id": "3f3feaa0-903a-43ab-918f-fbfad11c3cd9",
  "expected_version": 1
}
```

```json
{
  "id": "7a3c93b6-d345-4882-ac37-58a00d7b7c53",
  "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
  "assignment_id": "5ccd6521-7097-4e31-bc64-d2aef8ba2e22",
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
  "payment_method": "CASH",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-28T15:02:28.316084Z",
  "started_at": "2026-10-28T15:02:28.557453Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7a3c93b6-d345-4882-ac37-58a00d7b7c53/complete` → **200**

```json
{
  "command_id": "852608fc-64e6-43cc-b855-68f6c63a8846",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:02:28Z",
  "cash_received": true
}
```

```json
{
  "id": "7a3c93b6-d345-4882-ac37-58a00d7b7c53",
  "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
  "assignment_id": "5ccd6521-7097-4e31-bc64-d2aef8ba2e22",
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
  "payment_method": "CASH",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-28T15:02:28.316084Z",
  "started_at": "2026-10-28T15:02:28.557453Z",
  "completed_at": "2026-10-28T15:02:28.799297Z",
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "189ab6d9-823f-44fb-b0cc-71fdd2b25e0b",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 16597,
      "reserved_minor": 16297,
      "available_minor": 300
    }
  ],
  "entries": [
    {
      "id": "20a53729-66d9-43da-8115-d615ec279471",
      "at": "2026-10-28T15:02:26.457717Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "86a656a9-a51d-46ea-b3df-d68865531794",
      "order_id": null
    }
  ]
}
```

`GET /api/driver/v1/balance` → **200**

```json
{
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 16352,
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
      "balance_minor": 16352
    }
  ],
  "entries": [
    {
      "id": "fc8f4e84-46c6-4fb1-9807-aedf7e07cf01",
      "at": "2026-10-28T15:02:22.650359Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
      "counterpart_id": null
    },
    {
      "id": "85270b88-f2db-4852-af6d-84f2b03164f2",
      "at": "2026-10-28T15:02:17.449002Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/36de19bd-d4e1-4ae6-9a69-fea33737c77e/tip` → **200**

```json
{
  "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
  "currency": "UAH",
  "trip_cost_minor": 16297,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1700
    },
    {
      "percent": 15,
      "amount_minor": 2500
    },
    {
      "percent": 20,
      "amount_minor": 3300
    },
    {
      "percent": 25,
      "amount_minor": 4100
    }
  ],
  "min_minor": 100,
  "max_minor": 16300,
  "method": "WALLET",
  "available_until": "2026-10-29T15:02:28.799297Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/36de19bd-d4e1-4ae6-9a69-fea33737c77e/tip` → **201**

```json
{
  "command_id": "386155d0-955c-4b91-81e7-d7ace2bfbd90",
  "amount_minor": 2500
}
```

```json
{
  "id": "c83b1c98-dbb4-4ffd-905a-7bbef3959008",
  "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T15:02:29.923713Z"
}
```

`GET /api/rider/v1/orders/36de19bd-d4e1-4ae6-9a69-fea33737c77e/tip` → **200**

```json
{
  "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
  "currency": "UAH",
  "trip_cost_minor": 16297,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1700
    },
    {
      "percent": 15,
      "amount_minor": 2500
    },
    {
      "percent": 20,
      "amount_minor": 3300
    },
    {
      "percent": 25,
      "amount_minor": 4100
    }
  ],
  "min_minor": 100,
  "max_minor": 16300,
  "method": "WALLET",
  "available_until": "2026-10-29T15:02:28.799297Z",
  "open": false,
  "tip": {
    "id": "c83b1c98-dbb4-4ffd-905a-7bbef3959008",
    "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T15:02:29.923713Z"
  }
}
```

`GET /api/rider/v1/orders/36de19bd-d4e1-4ae6-9a69-fea33737c77e/tip` → **200**

```json
{
  "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
  "currency": "UAH",
  "trip_cost_minor": 16297,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1700
    },
    {
      "percent": 15,
      "amount_minor": 2500
    },
    {
      "percent": 20,
      "amount_minor": 3300
    },
    {
      "percent": 25,
      "amount_minor": 4100
    }
  ],
  "min_minor": 100,
  "max_minor": 16300,
  "method": "WALLET",
  "available_until": "2026-10-29T15:02:28.799297Z",
  "open": false,
  "tip": {
    "id": "c83b1c98-dbb4-4ffd-905a-7bbef3959008",
    "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T15:02:29.923713Z"
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
      "balance_minor": 30204
    }
  ],
  "entries": [
    {
      "id": "b22cf149-9a4e-4837-9e5d-e24e64123121",
      "at": "2026-10-28T15:02:29.696625Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "fc8f4e84-46c6-4fb1-9807-aedf7e07cf01",
      "at": "2026-10-28T15:02:22.650359Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
      "counterpart_id": null
    },
    {
      "id": "85270b88-f2db-4852-af6d-84f2b03164f2",
      "at": "2026-10-28T15:02:17.449002Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
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
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "a2742d7e-2302-4ff9-ab12-bb05fcaef881",
      "at": "2026-10-28T15:02:31.778425Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "b22cf149-9a4e-4837-9e5d-e24e64123121",
      "at": "2026-10-28T15:02:29.696625Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "fc8f4e84-46c6-4fb1-9807-aedf7e07cf01",
      "at": "2026-10-28T15:02:22.650359Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
      "counterpart_id": null
    },
    {
      "id": "85270b88-f2db-4852-af6d-84f2b03164f2",
      "at": "2026-10-28T15:02:17.449002Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
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
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "a2742d7e-2302-4ff9-ab12-bb05fcaef881",
      "at": "2026-10-28T15:02:31.778425Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "b22cf149-9a4e-4837-9e5d-e24e64123121",
      "at": "2026-10-28T15:02:29.696625Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "fc8f4e84-46c6-4fb1-9807-aedf7e07cf01",
      "at": "2026-10-28T15:02:22.650359Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
      "counterpart_id": null
    },
    {
      "id": "85270b88-f2db-4852-af6d-84f2b03164f2",
      "at": "2026-10-28T15:02:17.449002Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
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
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "a2742d7e-2302-4ff9-ab12-bb05fcaef881",
      "at": "2026-10-28T15:02:31.778425Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "b22cf149-9a4e-4837-9e5d-e24e64123121",
      "at": "2026-10-28T15:02:29.696625Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "fc8f4e84-46c6-4fb1-9807-aedf7e07cf01",
      "at": "2026-10-28T15:02:22.650359Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
      "counterpart_id": null
    },
    {
      "id": "85270b88-f2db-4852-af6d-84f2b03164f2",
      "at": "2026-10-28T15:02:17.449002Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
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
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "a2742d7e-2302-4ff9-ab12-bb05fcaef881",
      "at": "2026-10-28T15:02:31.778425Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "b22cf149-9a4e-4837-9e5d-e24e64123121",
      "at": "2026-10-28T15:02:29.696625Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "fc8f4e84-46c6-4fb1-9807-aedf7e07cf01",
      "at": "2026-10-28T15:02:22.650359Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
      "counterpart_id": null
    },
    {
      "id": "85270b88-f2db-4852-af6d-84f2b03164f2",
      "at": "2026-10-28T15:02:17.449002Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
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
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "a2742d7e-2302-4ff9-ab12-bb05fcaef881",
      "at": "2026-10-28T15:02:31.778425Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "b22cf149-9a4e-4837-9e5d-e24e64123121",
      "at": "2026-10-28T15:02:29.696625Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "fc8f4e84-46c6-4fb1-9807-aedf7e07cf01",
      "at": "2026-10-28T15:02:22.650359Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
      "counterpart_id": null
    },
    {
      "id": "85270b88-f2db-4852-af6d-84f2b03164f2",
      "at": "2026-10-28T15:02:17.449002Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
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
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "a2742d7e-2302-4ff9-ab12-bb05fcaef881",
      "at": "2026-10-28T15:02:31.778425Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "b22cf149-9a4e-4837-9e5d-e24e64123121",
      "at": "2026-10-28T15:02:29.696625Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "fc8f4e84-46c6-4fb1-9807-aedf7e07cf01",
      "at": "2026-10-28T15:02:22.650359Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
      "counterpart_id": null
    },
    {
      "id": "85270b88-f2db-4852-af6d-84f2b03164f2",
      "at": "2026-10-28T15:02:17.449002Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
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
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "a2742d7e-2302-4ff9-ab12-bb05fcaef881",
      "at": "2026-10-28T15:02:31.778425Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "b22cf149-9a4e-4837-9e5d-e24e64123121",
      "at": "2026-10-28T15:02:29.696625Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "fc8f4e84-46c6-4fb1-9807-aedf7e07cf01",
      "at": "2026-10-28T15:02:22.650359Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
      "counterpart_id": null
    },
    {
      "id": "85270b88-f2db-4852-af6d-84f2b03164f2",
      "at": "2026-10-28T15:02:17.449002Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
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
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "a2742d7e-2302-4ff9-ab12-bb05fcaef881",
      "at": "2026-10-28T15:02:31.778425Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "b22cf149-9a4e-4837-9e5d-e24e64123121",
      "at": "2026-10-28T15:02:29.696625Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "fc8f4e84-46c6-4fb1-9807-aedf7e07cf01",
      "at": "2026-10-28T15:02:22.650359Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
      "counterpart_id": null
    },
    {
      "id": "85270b88-f2db-4852-af6d-84f2b03164f2",
      "at": "2026-10-28T15:02:17.449002Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
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
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "a2742d7e-2302-4ff9-ab12-bb05fcaef881",
      "at": "2026-10-28T15:02:31.778425Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "b22cf149-9a4e-4837-9e5d-e24e64123121",
      "at": "2026-10-28T15:02:29.696625Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "fc8f4e84-46c6-4fb1-9807-aedf7e07cf01",
      "at": "2026-10-28T15:02:22.650359Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
      "counterpart_id": null
    },
    {
      "id": "85270b88-f2db-4852-af6d-84f2b03164f2",
      "at": "2026-10-28T15:02:17.449002Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
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
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "a2742d7e-2302-4ff9-ab12-bb05fcaef881",
      "at": "2026-10-28T15:02:31.778425Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "b22cf149-9a4e-4837-9e5d-e24e64123121",
      "at": "2026-10-28T15:02:29.696625Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "fc8f4e84-46c6-4fb1-9807-aedf7e07cf01",
      "at": "2026-10-28T15:02:22.650359Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
      "counterpart_id": null
    },
    {
      "id": "85270b88-f2db-4852-af6d-84f2b03164f2",
      "at": "2026-10-28T15:02:17.449002Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
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
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "a2742d7e-2302-4ff9-ab12-bb05fcaef881",
      "at": "2026-10-28T15:02:31.778425Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "b22cf149-9a4e-4837-9e5d-e24e64123121",
      "at": "2026-10-28T15:02:29.696625Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "fc8f4e84-46c6-4fb1-9807-aedf7e07cf01",
      "at": "2026-10-28T15:02:22.650359Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
      "counterpart_id": null
    },
    {
      "id": "85270b88-f2db-4852-af6d-84f2b03164f2",
      "at": "2026-10-28T15:02:17.449002Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
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
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "a2742d7e-2302-4ff9-ab12-bb05fcaef881",
      "at": "2026-10-28T15:02:31.778425Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "b22cf149-9a4e-4837-9e5d-e24e64123121",
      "at": "2026-10-28T15:02:29.696625Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "fc8f4e84-46c6-4fb1-9807-aedf7e07cf01",
      "at": "2026-10-28T15:02:22.650359Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
      "counterpart_id": null
    },
    {
      "id": "85270b88-f2db-4852-af6d-84f2b03164f2",
      "at": "2026-10-28T15:02:17.449002Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
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
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "a2742d7e-2302-4ff9-ab12-bb05fcaef881",
      "at": "2026-10-28T15:02:31.778425Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "b22cf149-9a4e-4837-9e5d-e24e64123121",
      "at": "2026-10-28T15:02:29.696625Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "fc8f4e84-46c6-4fb1-9807-aedf7e07cf01",
      "at": "2026-10-28T15:02:22.650359Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
      "counterpart_id": null
    },
    {
      "id": "85270b88-f2db-4852-af6d-84f2b03164f2",
      "at": "2026-10-28T15:02:17.449002Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
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
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "a2742d7e-2302-4ff9-ab12-bb05fcaef881",
      "at": "2026-10-28T15:02:31.778425Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "b22cf149-9a4e-4837-9e5d-e24e64123121",
      "at": "2026-10-28T15:02:29.696625Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "fc8f4e84-46c6-4fb1-9807-aedf7e07cf01",
      "at": "2026-10-28T15:02:22.650359Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
      "counterpart_id": null
    },
    {
      "id": "85270b88-f2db-4852-af6d-84f2b03164f2",
      "at": "2026-10-28T15:02:17.449002Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
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
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "a2742d7e-2302-4ff9-ab12-bb05fcaef881",
      "at": "2026-10-28T15:02:31.778425Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "b22cf149-9a4e-4837-9e5d-e24e64123121",
      "at": "2026-10-28T15:02:29.696625Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "fc8f4e84-46c6-4fb1-9807-aedf7e07cf01",
      "at": "2026-10-28T15:02:22.650359Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
      "counterpart_id": null
    },
    {
      "id": "85270b88-f2db-4852-af6d-84f2b03164f2",
      "at": "2026-10-28T15:02:17.449002Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
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
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "a2742d7e-2302-4ff9-ab12-bb05fcaef881",
      "at": "2026-10-28T15:02:31.778425Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "b22cf149-9a4e-4837-9e5d-e24e64123121",
      "at": "2026-10-28T15:02:29.696625Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "fc8f4e84-46c6-4fb1-9807-aedf7e07cf01",
      "at": "2026-10-28T15:02:22.650359Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
      "counterpart_id": null
    },
    {
      "id": "85270b88-f2db-4852-af6d-84f2b03164f2",
      "at": "2026-10-28T15:02:17.449002Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
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
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "a2742d7e-2302-4ff9-ab12-bb05fcaef881",
      "at": "2026-10-28T15:02:31.778425Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "b22cf149-9a4e-4837-9e5d-e24e64123121",
      "at": "2026-10-28T15:02:29.696625Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "fc8f4e84-46c6-4fb1-9807-aedf7e07cf01",
      "at": "2026-10-28T15:02:22.650359Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
      "counterpart_id": null
    },
    {
      "id": "85270b88-f2db-4852-af6d-84f2b03164f2",
      "at": "2026-10-28T15:02:17.449002Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
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
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "a2742d7e-2302-4ff9-ab12-bb05fcaef881",
      "at": "2026-10-28T15:02:31.778425Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "b22cf149-9a4e-4837-9e5d-e24e64123121",
      "at": "2026-10-28T15:02:29.696625Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "fc8f4e84-46c6-4fb1-9807-aedf7e07cf01",
      "at": "2026-10-28T15:02:22.650359Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
      "counterpart_id": null
    },
    {
      "id": "85270b88-f2db-4852-af6d-84f2b03164f2",
      "at": "2026-10-28T15:02:17.449002Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
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
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "a2742d7e-2302-4ff9-ab12-bb05fcaef881",
      "at": "2026-10-28T15:02:31.778425Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "b22cf149-9a4e-4837-9e5d-e24e64123121",
      "at": "2026-10-28T15:02:29.696625Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "36de19bd-d4e1-4ae6-9a69-fea33737c77e",
      "counterpart_id": null
    },
    {
      "id": "fc8f4e84-46c6-4fb1-9807-aedf7e07cf01",
      "at": "2026-10-28T15:02:22.650359Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
      "counterpart_id": null
    },
    {
      "id": "85270b88-f2db-4852-af6d-84f2b03164f2",
      "at": "2026-10-28T15:02:17.449002Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff10b4cc-6094-4be7-be31-0ef37336d839",
      "counterpart_id": null
    }
  ]
}
```

**Waited for ([.balances[] | select(.currency == "UAH") | .balance_minor] | add // 0) - 16352 = 2500, still 16352 — scenario stopped.**

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6ed21631-cadf-4d61-9dab-5d88acdf7c85",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-28T15:02:28.089778Z",
  "last_location_at": "2026-10-28T15:02:28.089778Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6ed21631-cadf-4d61-9dab-5d88acdf7c85/close` → **200**

```json
{
  "command_id": "517cb64e-4cb6-4795-8aeb-ccf641557fa5",
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
