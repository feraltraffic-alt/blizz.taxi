# Fault tests (2026-10-31T17:12:31Z, 8b135d5, break: payment)

## Payment: the bank charges a card tip, the server dies before it stores the answer

Server start 1, armed at `payment.after-send:TIP`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671012468",
  "device_ref": "sandbox-18618"
}
```

```json
{
  "challenge_id": "81680b7a-2be9-4a6e-9208-71729d776033",
  "expires_at": "2026-10-31T17:17:45.731482741Z",
  "resend_available_at": "2026-10-31T17:12:46.731482741Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671012468` → **200**

```json
{
  "phone": "+380671012468",
  "audience": "CLIENT",
  "code": "645427",
  "sent_at": "2026-10-31T17:12:45.746753269Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "81680b7a-2be9-4a6e-9208-71729d776033",
  "code": "645427",
  "device_ref": "sandbox-18618"
}
```

```json
{
  "session_id": "6ef153ab-3dfc-43f5-a178-dfb226ac666a",
  "subject": {
    "type": "CLIENT",
    "id": "99466497-a069-4fa9-88d2-a95d924bc2e2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5OTQ2NjQ5Ny1hMDY5LTRmYTktODhkMi1hOTVkOTI0YmMyZTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDY3Njc0LCJpYXQiOjE3OTM0NjY3NzQsImp0aSI6IjcyNzRjNGE1LTEwMjEtNDlmZC1hZWY1LTVmMGI4MmI3OTBjYSIsInNpZCI6IjZlZjE1M2FiLTNkZmMtNDNmNS1hMTc4LWRmYjIyNmFjNjY2YSJ9.hmR2B6W4twWsr5SUhvwPyWtUA1IoTj8p_9-pG28W-q8",
  "access_expires_at": "2026-10-31T17:27:54.827098766Z",
  "refresh_token": "SF6uOUdTEIN4OaIX96bvniQdrTmQT_DojHtU6B6u-Nc",
  "refresh_expires_at": "2026-11-30T17:12:54.825063744Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "af0e9655-19fc-4d91-9ffc-2c782cef7708",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b623f055-8246-430d-805b-929bce718fbe",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b623f055-8246-430d-805b-929bce718fbe",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "f0d3dd940df867f2f2f1a080925edbc7",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b623f055-8246-430d-805b-929bce718fbe",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380671012468"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b623f055-8246-430d-805b-929bce718fbe",
  "expires_at": "2026-10-31T17:42:55.236837Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/b623f055-8246-430d-805b-929bce718fbe` → **200**

```json
{
  "id": "b623f055-8246-430d-805b-929bce718fbe",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-31T17:42:55.236837Z",
  "card": {
    "id": "19afa7c1-119f-4a47-881f-88e4cffe3855",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3581",
    "card_type": "Visa",
    "created_at": "2026-10-31T17:12:55.598003Z"
  },
  "failure_reason": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15823"
}
```

```json
{
  "challenge_id": "0ae2181c-fe0e-46c8-b239-e8ddb05141aa",
  "expires_at": "2026-10-31T17:17:55.955822408Z",
  "resend_available_at": "2026-10-31T17:12:56.955822408Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "194634",
  "sent_at": "2026-10-31T17:12:55.961543883Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0ae2181c-fe0e-46c8-b239-e8ddb05141aa",
  "code": "194634",
  "device_ref": "sandbox-15823"
}
```

```json
{
  "session_id": "418383fc-1b60-4a42-96ac-c789b986e540",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ2NzY3NiwiaWF0IjoxNzkzNDY2Nzc2LCJqdGkiOiI3NGNkY2MzMy0xODEzLTRlNjYtYWU0OS05MDc3MWI5YTM3NTQiLCJzaWQiOiI0MTgzODNmYy0xYjYwLTRhNDItOTZhYy1jNzg5Yjk4NmU1NDAifQ.xDG-cFPSs57YFHj422IuIyaZbEAfnAufPskOQ09WQcg",
  "access_expires_at": "2026-10-31T17:27:56.315950733Z",
  "refresh_token": "6nft9XCeb9q22_3z4jw4_HzKY9ndxdGBPzio2Ty_8Uo",
  "refresh_expires_at": "2026-11-30T17:12:56.31469283Z",
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
  "command_id": "aedc58bb-2f90-439d-8e48-1186925688b6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:12:56Z",
    "sequence": 1793466776995
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2cd3305d-221f-4621-a8c1-1e5402c78fb9",
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
  "last_heartbeat_at": "2026-10-31T17:12:57.125918Z",
  "last_location_at": "2026-10-31T17:12:57.125918Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0d7e02e2-d260-45ac-986a-897c327d71a8",
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
  "id": "1e208d6c-4911-401b-a6fc-04f9e1ae1bac",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T17:17:57.532312Z",
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
  "command_id": "47a912e2-8558-4b61-bbcc-4d64b0a590d0",
  "quote_id": "1e208d6c-4911-401b-a6fc-04f9e1ae1bac",
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
  "id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "99466497-a069-4fa9-88d2-a95d924bc2e2",
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
  "created_at": "2026-10-31T17:12:57.964781Z",
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

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050` → **200**

```json
{
  "id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "99466497-a069-4fa9-88d2-a95d924bc2e2",
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
  "created_at": "2026-10-31T17:12:57.964781Z",
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

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050` → **200**

```json
{
  "id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "99466497-a069-4fa9-88d2-a95d924bc2e2",
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
  "created_at": "2026-10-31T17:12:57.964781Z",
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
    "id": "bae17b74-bbbd-433b-83d2-f0663665d2e8",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "expires_at": "2026-10-31T17:13:13.641652Z",
    "server_time": "2026-10-31T17:13:00.084411387Z",
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

`POST /api/driver/v1/offers/bae17b74-bbbd-433b-83d2-f0663665d2e8/accept` → **200**

```json
{
  "command_id": "3908afc8-5dd5-4da3-a67b-fbf726a9d751"
}
```

```json
{
  "id": "c258f957-655d-4df7-8618-e23526ad5868",
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2a2ce697-0427-488a-8713-970e50eaae0b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2a2ce697-0427-488a-8713-970e50eaae0b",
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
  "assignment_id": "c258f957-655d-4df7-8618-e23526ad5868",
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

`POST /api/driver/v1/work-sessions/2cd3305d-221f-4621-a8c1-1e5402c78fb9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:13:01Z",
    "sequence": 1793466781103
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2cd3305d-221f-4621-a8c1-1e5402c78fb9",
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
  "last_heartbeat_at": "2026-10-31T17:13:01.136056Z",
  "last_location_at": "2026-10-31T17:13:01.136056Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/2a2ce697-0427-488a-8713-970e50eaae0b/arrive` → **200**

```json
{
  "command_id": "7be7cfce-379b-4cca-a5ca-1ac027c06fd5",
  "expected_version": 0
}
```

```json
{
  "id": "2a2ce697-0427-488a-8713-970e50eaae0b",
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
  "assignment_id": "c258f957-655d-4df7-8618-e23526ad5868",
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
  "arrived_at": "2026-10-31T17:13:01.478219Z",
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

`POST /api/driver/v1/trips/2a2ce697-0427-488a-8713-970e50eaae0b/start` → **200**

```json
{
  "command_id": "89247973-d95e-4b45-af46-6b04bece447a",
  "expected_version": 1
}
```

```json
{
  "id": "2a2ce697-0427-488a-8713-970e50eaae0b",
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
  "assignment_id": "c258f957-655d-4df7-8618-e23526ad5868",
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
  "arrived_at": "2026-10-31T17:13:01.478219Z",
  "started_at": "2026-10-31T17:13:01.823101Z",
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

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050` → **200**

```json
{
  "id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "99466497-a069-4fa9-88d2-a95d924bc2e2",
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
    "id": "c258f957-655d-4df7-8618-e23526ad5868",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2a2ce697-0427-488a-8713-970e50eaae0b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:12:57.964781Z",
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

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050` → **200**

```json
{
  "id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "99466497-a069-4fa9-88d2-a95d924bc2e2",
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
    "id": "c258f957-655d-4df7-8618-e23526ad5868",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2a2ce697-0427-488a-8713-970e50eaae0b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:12:57.964781Z",
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

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050` → **200**

```json
{
  "id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "99466497-a069-4fa9-88d2-a95d924bc2e2",
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
    "id": "c258f957-655d-4df7-8618-e23526ad5868",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2a2ce697-0427-488a-8713-970e50eaae0b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:12:57.964781Z",
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

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": true,
  "tip": null
}
```

Tip 1600 on order cbd07520-9164-4760-b5ee-ab46cbe2f050; the bank journal has 5 lines before it.
Crash point payment.after-send:TIP reached: halting as kill -9 would

The server halted at its crash point (exit 137).

Server start 2.

The worker asks the bank about the operation once its 2-minute lease has run out.

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

`GET /api/rider/v1/orders/cbd07520-9164-4760-b5ee-ab46cbe2f050/tip` → **200**

```json
{
  "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
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
  "available_until": "2026-11-01T17:13:02.178423Z",
  "open": false,
  "tip": {
    "id": "feaa2cf7-f694-4b60-a392-373debbb3ba2",
    "order_id": "cbd07520-9164-4760-b5ee-ab46cbe2f050",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-31T17:13:05.574286Z"
  }
}
```

Charges the bank received for the tip: **2**.

**The tip was charged 2 times.**
