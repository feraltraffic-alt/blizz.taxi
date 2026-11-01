# Fault tests (2026-11-01T06:37:21Z, 20b07af, break: payment)

## Payment: the bank charges a card tip, the server dies before it stores the answer

Server start 1, armed at `payment.after-send:TIP`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679530446",
  "device_ref": "sandbox-1083"
}
```

```json
{
  "challenge_id": "465d1f4a-3b07-4b40-aed4-8fd7cac02e93",
  "expires_at": "2026-11-01T06:42:34.873344075Z",
  "resend_available_at": "2026-11-01T06:37:35.873344075Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679530446` → **200**

```json
{
  "phone": "+380679530446",
  "audience": "CLIENT",
  "code": "313980",
  "sent_at": "2026-11-01T06:37:34.890209691Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "465d1f4a-3b07-4b40-aed4-8fd7cac02e93",
  "code": "313980",
  "device_ref": "sandbox-1083"
}
```

```json
{
  "session_id": "fea71936-137c-4824-b0e1-f746c336de71",
  "subject": {
    "type": "CLIENT",
    "id": "ac554699-dd80-47c7-adb1-431d2f4a0095"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzU1NDY5OS1kZDgwLTQ3YzctYWRiMS00MzFkMmY0YTAwOTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNTE1OTY0LCJpYXQiOjE3OTM1MTUwNjQsImp0aSI6IjdkMmVhOWMyLTQ1YWEtNGVkNy1hZjhmLTRkNGNlNzVlZDcwMSIsInNpZCI6ImZlYTcxOTM2LTEzN2MtNDgyNC1iMGUxLWY3NDZjMzM2ZGU3MSJ9.zjTtx6OaE4bIwTKksj_zNH2IgGb1jnwWZkEqC_Jw5ZE",
  "access_expires_at": "2026-11-01T06:52:44.013335257Z",
  "refresh_token": "RpQAmwcCWFD0XvIcoTaSxUvVmjU-BPAuveN0lav5dC0",
  "refresh_expires_at": "2026-12-01T06:37:44.011400011Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "117b0f86-059b-493a-a43a-6681e2b8f5e1",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "fd91c234-ac30-42d3-9964-6f7b79889ab5",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-fd91c234-ac30-42d3-9964-6f7b79889ab5",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "086c259ede52f3be27d7f61b14d98da9",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=fd91c234-ac30-42d3-9964-6f7b79889ab5",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380679530446"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=fd91c234-ac30-42d3-9964-6f7b79889ab5",
  "expires_at": "2026-11-01T07:07:44.425314Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/fd91c234-ac30-42d3-9964-6f7b79889ab5` → **200**

```json
{
  "id": "fd91c234-ac30-42d3-9964-6f7b79889ab5",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-11-01T07:07:44.425314Z",
  "card": {
    "id": "db7dd72e-9f63-413c-b984-ea240d4a1aab",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7387",
    "card_type": "Visa",
    "created_at": "2026-11-01T06:37:44.782097Z"
  },
  "failure_reason": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-1369"
}
```

```json
{
  "challenge_id": "43386218-746c-4389-8d7f-83db6ed72074",
  "expires_at": "2026-11-01T06:42:45.134688788Z",
  "resend_available_at": "2026-11-01T06:37:46.134688788Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "571336",
  "sent_at": "2026-11-01T06:37:45.140213764Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "43386218-746c-4389-8d7f-83db6ed72074",
  "code": "571336",
  "device_ref": "sandbox-1369"
}
```

```json
{
  "session_id": "2a2bd7cd-3ca9-4df2-a24c-34b63c680428",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzUxNTk2NSwiaWF0IjoxNzkzNTE1MDY1LCJqdGkiOiI3YzNmNjllOC04YmZkLTQ2YzAtOGRkMy1hOTczY2IyNjIzMGMiLCJzaWQiOiIyYTJiZDdjZC0zY2E5LTRkZjItYTI0Yy0zNGI2M2M2ODA0MjgifQ.wVPTlL5liHtbAycYwXtX8l3c3b7Cyl6gGNC5mQcKKW0",
  "access_expires_at": "2026-11-01T06:52:45.486497198Z",
  "refresh_token": "evVCHiGxvJhx3DdldHm57osemGSSprLSO1o1Ablzf48",
  "refresh_expires_at": "2026-12-01T06:37:45.4854982Z",
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
  "command_id": "92e0cdbd-c2dd-436b-8ca6-698cb3475125",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-11-01T06:37:46Z",
    "sequence": 1793515066183
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "17e96165-5a96-4a82-8f50-206c617f146b",
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
  "last_heartbeat_at": "2026-11-01T06:37:46.373424Z",
  "last_location_at": "2026-11-01T06:37:46.373424Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "376288c5-5023-4eaa-89e7-b12d98b0354b",
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
  "id": "6aaf50ac-263a-46a8-befb-2a9e2b68880c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-11-01T06:42:46.775669Z",
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
  "promotions": [],
  "payment_methods": [
    "CARD",
    "CASH"
  ],
  "card_hold_minor": 10517
}
```

`POST /api/rider/v1/orders` → **202**

```json
{
  "command_id": "dc559c52-06f9-4b3c-88ed-dfa36d5253dd",
  "quote_id": "6aaf50ac-263a-46a8-befb-2a9e2b68880c",
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
  "id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ac554699-dd80-47c7-adb1-431d2f4a0095",
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
  "created_at": "2026-11-01T06:37:47.215676Z",
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

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1` → **200**

```json
{
  "id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ac554699-dd80-47c7-adb1-431d2f4a0095",
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
  "created_at": "2026-11-01T06:37:47.215676Z",
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

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1` → **200**

```json
{
  "id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ac554699-dd80-47c7-adb1-431d2f4a0095",
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
  "created_at": "2026-11-01T06:37:47.215676Z",
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
    "id": "27bb61e1-4aea-4b13-be82-0c951b86ea6a",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "expires_at": "2026-11-01T06:38:02.604396Z",
    "server_time": "2026-11-01T06:37:49.31377201Z",
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

`POST /api/driver/v1/offers/27bb61e1-4aea-4b13-be82-0c951b86ea6a/accept` → **200**

```json
{
  "command_id": "34bc1801-ef76-405e-828c-dfd3ccd329d1"
}
```

```json
{
  "id": "601a5f92-9bfb-4704-adb3-00a38166d8bf",
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f2e0e0fa-49fe-4e21-94e8-36c908c8ddf5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f2e0e0fa-49fe-4e21-94e8-36c908c8ddf5",
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "assignment_id": "601a5f92-9bfb-4704-adb3-00a38166d8bf",
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

`POST /api/driver/v1/work-sessions/17e96165-5a96-4a82-8f50-206c617f146b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-11-01T06:37:50Z",
    "sequence": 1793515070343
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "17e96165-5a96-4a82-8f50-206c617f146b",
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
  "last_heartbeat_at": "2026-11-01T06:37:50.372053Z",
  "last_location_at": "2026-11-01T06:37:50.372053Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/f2e0e0fa-49fe-4e21-94e8-36c908c8ddf5/arrive` → **200**

```json
{
  "command_id": "3e580283-a6b8-44d4-92a2-6757239e7683",
  "expected_version": 0
}
```

```json
{
  "id": "f2e0e0fa-49fe-4e21-94e8-36c908c8ddf5",
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "assignment_id": "601a5f92-9bfb-4704-adb3-00a38166d8bf",
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
  "arrived_at": "2026-11-01T06:37:50.714408Z",
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

`POST /api/driver/v1/trips/f2e0e0fa-49fe-4e21-94e8-36c908c8ddf5/start` → **200**

```json
{
  "command_id": "e946dd22-910c-488c-9bc8-c7f04727f586",
  "expected_version": 1
}
```

```json
{
  "id": "f2e0e0fa-49fe-4e21-94e8-36c908c8ddf5",
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "assignment_id": "601a5f92-9bfb-4704-adb3-00a38166d8bf",
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
  "arrived_at": "2026-11-01T06:37:50.714408Z",
  "started_at": "2026-11-01T06:37:51.074951Z",
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

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1` → **200**

```json
{
  "id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "ac554699-dd80-47c7-adb1-431d2f4a0095",
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
    "id": "601a5f92-9bfb-4704-adb3-00a38166d8bf",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f2e0e0fa-49fe-4e21-94e8-36c908c8ddf5",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-11-01T06:37:47.215676Z",
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

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1` → **200**

```json
{
  "id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "ac554699-dd80-47c7-adb1-431d2f4a0095",
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
    "id": "601a5f92-9bfb-4704-adb3-00a38166d8bf",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f2e0e0fa-49fe-4e21-94e8-36c908c8ddf5",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-11-01T06:37:47.215676Z",
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

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1` → **200**

```json
{
  "id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "ac554699-dd80-47c7-adb1-431d2f4a0095",
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
    "id": "601a5f92-9bfb-4704-adb3-00a38166d8bf",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f2e0e0fa-49fe-4e21-94e8-36c908c8ddf5",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-11-01T06:37:47.215676Z",
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

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": true,
  "tip": null
}
```

Tip 1600 on order 5c9577e9-8c9b-46d4-9479-f60d48538ed1; the bank journal has 5 lines before it.
Crash point payment.after-send:TIP reached: halting as kill -9 would

The server halted at its crash point (exit 137).

Server start 2.

The worker asks the bank about the operation once its 2-minute lease has run out.

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

`GET /api/rider/v1/orders/5c9577e9-8c9b-46d4-9479-f60d48538ed1/tip` → **200**

```json
{
  "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:51.442486Z",
  "open": false,
  "tip": {
    "id": "fe711aca-54af-42d9-ac8f-a2b2a2fad9d4",
    "order_id": "5c9577e9-8c9b-46d4-9479-f60d48538ed1",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:54.875853Z"
  }
}
```

Charges the bank received for the tip: **2**.

**The tip was charged 2 times.**
