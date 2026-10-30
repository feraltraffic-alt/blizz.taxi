# Sandbox transcript (2026-10-30T10:50:07Z, 5bbd31f)

# Scenario: chargeback

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731570379",
  "device_ref": "sandbox-10832"
}
```

```json
{
  "challenge_id": "f1c87f57-1ef4-44a6-99ba-0bdc6cea522c",
  "expires_at": "2026-10-30T10:55:07.871586941Z",
  "resend_available_at": "2026-10-30T10:50:08.871586941Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731570379` → **200**

```json
{
  "phone": "+380731570379",
  "audience": "CLIENT",
  "code": "561246",
  "sent_at": "2026-10-30T10:50:07.886943401Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f1c87f57-1ef4-44a6-99ba-0bdc6cea522c",
  "code": "561246",
  "device_ref": "sandbox-10832"
}
```

```json
{
  "session_id": "bcc24c3d-638e-4145-9b0d-74d31020ec25",
  "subject": {
    "type": "CLIENT",
    "id": "7dba71ab-b44a-4308-89ab-f10f2d11c36c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZGJhNzFhYi1iNDRhLTQzMDgtODlhYi1mMTBmMmQxMWMzNmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU4MzE0LCJpYXQiOjE3OTMzNTc0MTQsImp0aSI6IjRkZWE0ZjNkLTRmYjItNGI3Zi1hOTVmLTUyZjE4N2Y2NTdkOCIsInNpZCI6ImJjYzI0YzNkLTYzOGUtNDE0NS05YjBkLTc0ZDMxMDIwZWMyNSJ9.ZyhgUHBpAnoouxkYp41sbDRsIshERlxz1yLB8TAwS9U",
  "access_expires_at": "2026-10-30T11:05:14.716442261Z",
  "refresh_token": "7BAzJ7IVylzSpXrE-AyxFhTlSpLsD_324mOdnCy3Wkw",
  "refresh_expires_at": "2026-11-29T10:50:14.714354544Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "57328dd4-fa19-4eee-ac7d-df5ce82855bb",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b78c1227-5134-4689-90a3-ce228d6058c4",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b78c1227-5134-4689-90a3-ce228d6058c4",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "29b66d682d4cc290638adccac75090fc",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b78c1227-5134-4689-90a3-ce228d6058c4",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731570379"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b78c1227-5134-4689-90a3-ce228d6058c4",
  "expires_at": "2026-10-30T11:20:15.040125Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/b78c1227-5134-4689-90a3-ce228d6058c4` → **200**

```json
{
  "id": "b78c1227-5134-4689-90a3-ce228d6058c4",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T11:20:15.040125Z",
  "card": {
    "id": "d771480f-8f58-413f-880d-3960b45142ac",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7340",
    "card_type": "Visa",
    "created_at": "2026-10-30T10:50:15.341675Z"
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
  "device_ref": "sandbox-32569"
}
```

```json
{
  "challenge_id": "5d4ef909-9968-427b-a25e-27fd975e181e",
  "expires_at": "2026-10-30T10:55:15.645468498Z",
  "resend_available_at": "2026-10-30T10:50:16.645468498Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "109630",
  "sent_at": "2026-10-30T10:50:15.651710714Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5d4ef909-9968-427b-a25e-27fd975e181e",
  "code": "109630",
  "device_ref": "sandbox-32569"
}
```

```json
{
  "session_id": "13feaeb4-8d56-420c-9051-f66ba279995e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1ODMxNSwiaWF0IjoxNzkzMzU3NDE1LCJqdGkiOiI5YmVjY2M0Ni1hNDcyLTRiOWEtOTU2ZC0yODk2MDE5OGFhZDUiLCJzaWQiOiIxM2ZlYWViNC04ZDU2LTQyMGMtOTA1MS1mNjZiYTI3OTk5NWUifQ.67W5wTY6vFfrWpB-XLoK1GSIt0l2n9f_7ujh-hPa0Wc",
  "access_expires_at": "2026-10-30T11:05:15.958128501Z",
  "refresh_token": "QXHfvYjpE5jA7lGKMtYXbXcvmhmb79D6NKqnBsr5SOs",
  "refresh_expires_at": "2026-11-29T10:50:15.956743533Z",
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
  "command_id": "a083d187-956f-4e7f-8e06-8df7a058e5de",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:50:16Z",
    "sequence": 1793357416512
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0262b1c0-7051-4568-ac00-aafc6e06fa0c",
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
  "last_heartbeat_at": "2026-10-30T10:50:16.757336Z",
  "last_location_at": "2026-10-30T10:50:16.757336Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cd10345f-8115-4841-aeac-e4b976c45b35",
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
  "id": "9361f479-bc34-4f03-8794-ee1b65837c51",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:55:17.082697Z",
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
  "command_id": "0b20c527-71f8-472e-af6f-baf7a984fb34",
  "quote_id": "9361f479-bc34-4f03-8794-ee1b65837c51",
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
  "id": "02633df3-ae0f-43d5-be55-bcf9d31233d3",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7dba71ab-b44a-4308-89ab-f10f2d11c36c",
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
  "created_at": "2026-10-30T10:50:17.438061Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/02633df3-ae0f-43d5-be55-bcf9d31233d3` → **200**

```json
{
  "id": "02633df3-ae0f-43d5-be55-bcf9d31233d3",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7dba71ab-b44a-4308-89ab-f10f2d11c36c",
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
  "created_at": "2026-10-30T10:50:17.438061Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/02633df3-ae0f-43d5-be55-bcf9d31233d3` → **200**

```json
{
  "id": "02633df3-ae0f-43d5-be55-bcf9d31233d3",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7dba71ab-b44a-4308-89ab-f10f2d11c36c",
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
  "created_at": "2026-10-30T10:50:17.438061Z",
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
    "id": "426036eb-d71a-4867-9f5b-036e27bacd15",
    "order_id": "02633df3-ae0f-43d5-be55-bcf9d31233d3",
    "expires_at": "2026-10-30T10:50:33.080059Z",
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

`POST /api/driver/v1/offers/426036eb-d71a-4867-9f5b-036e27bacd15/accept` → **200**

```json
{
  "command_id": "216fb07d-df8c-4d8d-97c7-0ee3abf04c55"
}
```

```json
{
  "id": "a17f5cc7-205e-4782-96c2-97b33b009b6b",
  "order_id": "02633df3-ae0f-43d5-be55-bcf9d31233d3",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b30ee0a0-b93f-472b-aa82-0a9abe0f4a43",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b30ee0a0-b93f-472b-aa82-0a9abe0f4a43",
  "order_id": "02633df3-ae0f-43d5-be55-bcf9d31233d3",
  "assignment_id": "a17f5cc7-205e-4782-96c2-97b33b009b6b",
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

`POST /api/rider/v1/orders/02633df3-ae0f-43d5-be55-bcf9d31233d3/messages` → **201**

```json
{
  "command_id": "94fddf62-c93c-43cb-a2a2-e78b6bd20fd0",
  "body": "Я біля входу, мій номер +380731570379, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "0984d4ca-83f5-44e5-9c4f-e8b4e61f738c",
  "order_id": "02633df3-ae0f-43d5-be55-bcf9d31233d3",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380731570379, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T10:50:20.19580548Z"
}
```

`POST /api/driver/v1/trips/b30ee0a0-b93f-472b-aa82-0a9abe0f4a43/messages` → **201**

```json
{
  "command_id": "4a5fc8ec-1dd0-4162-8985-a68e3a06658a",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "2835af61-8544-438d-8c07-4b8d936a115f",
  "order_id": "02633df3-ae0f-43d5-be55-bcf9d31233d3",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T10:50:20.467973724Z"
}
```

`POST /api/driver/v1/work-sessions/0262b1c0-7051-4568-ac00-aafc6e06fa0c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:50:20Z",
    "sequence": 1793357420731
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0262b1c0-7051-4568-ac00-aafc6e06fa0c",
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
  "last_heartbeat_at": "2026-10-30T10:50:20.755955Z",
  "last_location_at": "2026-10-30T10:50:20.755955Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b30ee0a0-b93f-472b-aa82-0a9abe0f4a43/arrive` → **200**

```json
{
  "command_id": "4c48f3b9-8c27-4a44-8044-bcfa55db9b38",
  "expected_version": 0
}
```

```json
{
  "id": "b30ee0a0-b93f-472b-aa82-0a9abe0f4a43",
  "order_id": "02633df3-ae0f-43d5-be55-bcf9d31233d3",
  "assignment_id": "a17f5cc7-205e-4782-96c2-97b33b009b6b",
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
  "arrived_at": "2026-10-30T10:50:21.054516Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b30ee0a0-b93f-472b-aa82-0a9abe0f4a43/start` → **200**

```json
{
  "command_id": "09fbb365-1105-4318-b488-f6a1acc71006",
  "expected_version": 1
}
```

```json
{
  "id": "b30ee0a0-b93f-472b-aa82-0a9abe0f4a43",
  "order_id": "02633df3-ae0f-43d5-be55-bcf9d31233d3",
  "assignment_id": "a17f5cc7-205e-4782-96c2-97b33b009b6b",
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
  "arrived_at": "2026-10-30T10:50:21.054516Z",
  "started_at": "2026-10-30T10:50:21.35393Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/0262b1c0-7051-4568-ac00-aafc6e06fa0c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:50:21Z",
    "sequence": 1793357421641
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0262b1c0-7051-4568-ac00-aafc6e06fa0c",
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
  "last_heartbeat_at": "2026-10-30T10:50:21.663885Z",
  "last_location_at": "2026-10-30T10:50:21.663885Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/b30ee0a0-b93f-472b-aa82-0a9abe0f4a43/complete` → **200**

```json
{
  "command_id": "f7851d3b-1bc9-472d-9d58-514991f83c01",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:50:21Z",
  "cash_received": false
}
```

```json
{
  "id": "b30ee0a0-b93f-472b-aa82-0a9abe0f4a43",
  "order_id": "02633df3-ae0f-43d5-be55-bcf9d31233d3",
  "assignment_id": "a17f5cc7-205e-4782-96c2-97b33b009b6b",
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
  "arrived_at": "2026-10-30T10:50:21.054516Z",
  "started_at": "2026-10-30T10:50:21.35393Z",
  "completed_at": "2026-10-30T10:50:21.963653Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/02633df3-ae0f-43d5-be55-bcf9d31233d3` → **200**

```json
{
  "id": "02633df3-ae0f-43d5-be55-bcf9d31233d3",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "7dba71ab-b44a-4308-89ab-f10f2d11c36c",
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
    "id": "a17f5cc7-205e-4782-96c2-97b33b009b6b",
    "order_id": "02633df3-ae0f-43d5-be55-bcf9d31233d3",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b30ee0a0-b93f-472b-aa82-0a9abe0f4a43",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:50:17.438061Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/02633df3-ae0f-43d5-be55-bcf9d31233d3` → **200**

```json
{
  "id": "02633df3-ae0f-43d5-be55-bcf9d31233d3",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "7dba71ab-b44a-4308-89ab-f10f2d11c36c",
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
    "id": "a17f5cc7-205e-4782-96c2-97b33b009b6b",
    "order_id": "02633df3-ae0f-43d5-be55-bcf9d31233d3",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b30ee0a0-b93f-472b-aa82-0a9abe0f4a43",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:50:17.438061Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/02633df3-ae0f-43d5-be55-bcf9d31233d3` → **200**

```json
{
  "id": "02633df3-ae0f-43d5-be55-bcf9d31233d3",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "7dba71ab-b44a-4308-89ab-f10f2d11c36c",
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
    "id": "a17f5cc7-205e-4782-96c2-97b33b009b6b",
    "order_id": "02633df3-ae0f-43d5-be55-bcf9d31233d3",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b30ee0a0-b93f-472b-aa82-0a9abe0f4a43",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:50:17.438061Z",
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
  "session_id": "0262b1c0-7051-4568-ac00-aafc6e06fa0c",
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
  "last_heartbeat_at": "2026-10-30T10:50:21.663885Z",
  "last_location_at": "2026-10-30T10:50:21.663885Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0262b1c0-7051-4568-ac00-aafc6e06fa0c/close` → **200**

```json
{
  "command_id": "16babf9e-1656-47fb-9df2-3904a63edd7c",
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
  "correlation_id": "e0c71c0f-f7fb-4667-b356-0456a820daeb"
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
  "session_id": "6e2d3efe-c9c6-4a09-a07c-e1270dd0e3aa",
  "subject": {
    "type": "STAFF",
    "id": "38152c1c-34b8-43c4-8d83-cf9416de44a9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzODE1MmMxYy0zNGI4LTQzYzQtOGQ4My1jZjk0MTZkZTQ0YTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTgzMjYsImlhdCI6MTc5MzM1NzQyNiwianRpIjoiMjM2YTQzOWMtOWU2Mi00MzViLThjNzktZjEwN2JlYjk5NTgzIiwic2lkIjoiNmUyZDNlZmUtYzljNi00YTA5LWEwN2MtZTEyNzBkZDBlM2FhIn0.8kVC4zn8zzls0GpeOY-vjd2jZmDMkCTM-uhEych7Pl8",
  "access_expires_at": "2026-10-30T11:05:26.747944845Z",
  "refresh_token": "wpCrRuS2hMTTWDd4H4JeGHMTe9YMm9LyIZ1isWTaIgM",
  "refresh_expires_at": "2026-10-30T22:50:26.747100063Z",
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
  "session_id": "91055ba1-d008-47c2-8a12-8df796236f01",
  "subject": {
    "type": "STAFF",
    "id": "38152c1c-34b8-43c4-8d83-cf9416de44a9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzODE1MmMxYy0zNGI4LTQzYzQtOGQ4My1jZjk0MTZkZTQ0YTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTgzMjgsImlhdCI6MTc5MzM1NzQyOCwianRpIjoiMzExYmEyNTUtZTllNS00YTg0LWJkNGMtODk4MjkwMTExYWM2Iiwic2lkIjoiOTEwNTViYTEtZDAwOC00N2MyLThhMTItOGRmNzk2MjM2ZjAxIn0.mAUX91WT7Jocdo7v8nhgGv4R_tw0LtKoR-c2UcGGxB4",
  "access_expires_at": "2026-10-30T11:05:28.640497737Z",
  "refresh_token": "fBsMJFVMPzxwRJ3pFjdGgxVEDR9ydXzYENzeXHQnZLY",
  "refresh_expires_at": "2026-10-30T22:50:28.639572007Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/02633df3-ae0f-43d5-be55-bcf9d31233d3/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/02633df3-ae0f-43d5-be55-bcf9d31233d3/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "2e5cea5b-13c4-4a10-ac60-d57df4c08976"
}
```

`GET /api/admin/v1/orders/02633df3-ae0f-43d5-be55-bcf9d31233d3/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T10:50:29.195732176Z",
  "order": {
    "id": "02633df3-ae0f-43d5-be55-bcf9d31233d3",
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
    "created_at": "2026-10-30T10:50:17.438061Z",
    "assigned_at": "2026-10-30T10:50:19.633727Z",
    "arrived_at": "2026-10-30T10:50:21.054516Z",
    "started_at": "2026-10-30T10:50:21.35393Z",
    "completed_at": "2026-10-30T10:50:21.963653Z"
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
    "id": "7dba71ab-b44a-4308-89ab-f10f2d11c36c",
    "registered_at": "2026-10-30T10:50:14.706381Z",
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
      "created_at": "2026-10-30T10:50:17.44663Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T10:50:22.262712Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/02633df3-ae0f-43d5-be55-bcf9d31233d3/chargebacks` → **422**

```json
{
  "command_id": "69c3e7ba-7244-4cbd-8549-388db5b6363c",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/02633df3-ae0f-43d5-be55-bcf9d31233d3/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "01b830ad-00de-4a7d-9070-9e0090f9e8c9"
}
```

`POST /api/admin/v1/orders/02633df3-ae0f-43d5-be55-bcf9d31233d3/chargebacks` → **201**

```json
{
  "command_id": "57e9847a-018d-4f02-8c4e-927b9efa1442",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "fa59010b-c1a7-4026-ba36-6e20c88668ed",
  "order_id": "02633df3-ae0f-43d5-be55-bcf9d31233d3",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T10:50:29.836403Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/02633df3-ae0f-43d5-be55-bcf9d31233d3/chargebacks` → **201**

```json
{
  "command_id": "57e9847a-018d-4f02-8c4e-927b9efa1442",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "fa59010b-c1a7-4026-ba36-6e20c88668ed",
  "order_id": "02633df3-ae0f-43d5-be55-bcf9d31233d3",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T10:50:29.836403Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/7dba71ab-b44a-4308-89ab-f10f2d11c36c` → **200**

```json
{
  "client": {
    "id": "7dba71ab-b44a-4308-89ab-f10f2d11c36c",
    "phone": "+380731570379",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T10:50:14.706381Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "02633df3-ae0f-43d5-be55-bcf9d31233d3",
      "short_number": 1,
      "status": "FULFILLED",
      "created_at": "2026-10-30T10:50:17.438061Z",
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

`POST /api/admin/v1/orders/02633df3-ae0f-43d5-be55-bcf9d31233d3/chargebacks/fa59010b-c1a7-4026-ba36-6e20c88668ed/resolve` → **200**

```json
{
  "command_id": "23bacd3b-6555-4326-bc33-53a027a4f592",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "fa59010b-c1a7-4026-ba36-6e20c88668ed",
  "order_id": "02633df3-ae0f-43d5-be55-bcf9d31233d3",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T10:50:29.836403Z",
  "resolved_at": "2026-10-30T10:50:30.75897Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/7dba71ab-b44a-4308-89ab-f10f2d11c36c` → **200**

```json
{
  "client": {
    "id": "7dba71ab-b44a-4308-89ab-f10f2d11c36c",
    "phone": "+380731570379",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T10:50:14.706381Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "02633df3-ae0f-43d5-be55-bcf9d31233d3",
      "short_number": 1,
      "status": "FULFILLED",
      "created_at": "2026-10-30T10:50:17.438061Z",
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

`GET /api/admin/v1/clients/7dba71ab-b44a-4308-89ab-f10f2d11c36c` → **200**

```json
{
  "client": {
    "id": "7dba71ab-b44a-4308-89ab-f10f2d11c36c",
    "phone": "+380731570379",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T10:50:14.706381Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "02633df3-ae0f-43d5-be55-bcf9d31233d3",
      "short_number": 1,
      "status": "FULFILLED",
      "created_at": "2026-10-30T10:50:17.438061Z",
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

`POST /api/admin/v1/orders/02633df3-ae0f-43d5-be55-bcf9d31233d3/chargebacks/fa59010b-c1a7-4026-ba36-6e20c88668ed/resolve` → **409**

```json
{
  "command_id": "ef17ebe1-6ae8-45e0-a654-9f4614505f0b",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/02633df3-ae0f-43d5-be55-bcf9d31233d3/chargebacks/fa59010b-c1a7-4026-ba36-6e20c88668ed/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "83401685-7e49-4767-9018-76dcd596566a"
}
```

`GET /api/admin/v1/orders/02633df3-ae0f-43d5-be55-bcf9d31233d3/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "fa59010b-c1a7-4026-ba36-6e20c88668ed",
      "order_id": "02633df3-ae0f-43d5-be55-bcf9d31233d3",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T10:50:29.836403Z",
      "resolved_at": "2026-10-30T10:50:30.75897Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 02633df3-ae0f-43d5-be55-bcf9d31233d3 without phone or card digits; chargeback fa59010b-c1a7-4026-ba36-6e20c88668ed recorded and won.

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
