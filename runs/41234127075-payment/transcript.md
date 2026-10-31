# Fault tests (2026-10-31T19:25:59Z, 1e26c2d, break: payment)

## Payment: the bank charges a card tip, the server dies before it stores the answer

Server start 1, armed at `payment.after-send:TIP`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673344650",
  "device_ref": "sandbox-25449"
}
```

```json
{
  "challenge_id": "7f4b4849-ea19-4291-ab01-ae7d5aebcdd5",
  "expires_at": "2026-10-31T19:31:13.120833437Z",
  "resend_available_at": "2026-10-31T19:26:14.120833437Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673344650` → **200**

```json
{
  "phone": "+380673344650",
  "audience": "CLIENT",
  "code": "676297",
  "sent_at": "2026-10-31T19:26:13.134309102Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f4b4849-ea19-4291-ab01-ae7d5aebcdd5",
  "code": "676297",
  "device_ref": "sandbox-25449"
}
```

```json
{
  "session_id": "098db3b9-3596-4507-a55c-c413d701f892",
  "subject": {
    "type": "CLIENT",
    "id": "935e0fd3-eb3c-4076-837d-7e0f8c87a516"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MzVlMGZkMy1lYjNjLTQwNzYtODM3ZC03ZTBmOGM4N2E1MTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDc1NjgyLCJpYXQiOjE3OTM0NzQ3ODIsImp0aSI6IjM2NTE1ZGQwLTA5YzEtNDcwOC1iYTQ1LWNiOWY3MWEyYzcyNCIsInNpZCI6IjA5OGRiM2I5LTM1OTYtNDUwNy1hNTVjLWM0MTNkNzAxZjg5MiJ9.ShXzCEreYn-EWm4n1ITW68tS1T1nBbilbULaJuLJQag",
  "access_expires_at": "2026-10-31T19:41:22.540681108Z",
  "refresh_token": "5J5uONIe_ObjHmwa5SgQ2cca7Rtoo5oPO85JnPCMFAs",
  "refresh_expires_at": "2026-11-30T19:26:22.538847931Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "72396c4e-7301-4bb7-97a2-1db42fe9e812",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "7bcaac45-b0d8-4aae-b97a-83c691515c69",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-7bcaac45-b0d8-4aae-b97a-83c691515c69",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "d927991fa7137a192145b0a73cc30fca",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=7bcaac45-b0d8-4aae-b97a-83c691515c69",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380673344650"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=7bcaac45-b0d8-4aae-b97a-83c691515c69",
  "expires_at": "2026-10-31T19:56:22.958969Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/7bcaac45-b0d8-4aae-b97a-83c691515c69` → **200**

```json
{
  "id": "7bcaac45-b0d8-4aae-b97a-83c691515c69",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-31T19:56:22.958969Z",
  "card": {
    "id": "25de7eb5-d7ed-4fa8-8c0c-b43310442553",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1562",
    "card_type": "Visa",
    "created_at": "2026-10-31T19:26:23.289654Z"
  },
  "failure_reason": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-5677"
}
```

```json
{
  "challenge_id": "6463f9dd-1487-46cf-950d-64979a38afaf",
  "expires_at": "2026-10-31T19:31:23.624914117Z",
  "resend_available_at": "2026-10-31T19:26:24.624914117Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "499037",
  "sent_at": "2026-10-31T19:26:23.63017085Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6463f9dd-1487-46cf-950d-64979a38afaf",
  "code": "499037",
  "device_ref": "sandbox-5677"
}
```

```json
{
  "session_id": "cb306d9e-cc9c-4056-ac19-c4f8f5b74a60",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3NTY4MywiaWF0IjoxNzkzNDc0NzgzLCJqdGkiOiI3NDkxNGY4Ny1jYzZkLTRhYzMtYTFlOS0wYjk5OGM4Mjg5ZDMiLCJzaWQiOiJjYjMwNmQ5ZS1jYzljLTQwNTYtYWMxOS1jNGY4ZjViNzRhNjAifQ.2P_CZRRwMo0SueSUjZKAjfEepFPD8dmgBGoaayxfHjo",
  "access_expires_at": "2026-10-31T19:41:23.975197976Z",
  "refresh_token": "G5T7pcqeK0Hora5PD3bWZ6E3IJuuL-UXaR1kUcdKe40",
  "refresh_expires_at": "2026-11-30T19:26:23.974149234Z",
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
  "command_id": "ed0c4bc3-825f-481b-bc8b-085a260d9256",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T19:26:24Z",
    "sequence": 1793474784630
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b87ba135-8d15-4e47-9b12-399a004ab98f",
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
  "last_heartbeat_at": "2026-10-31T19:26:24.736363Z",
  "last_location_at": "2026-10-31T19:26:24.736363Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "92ea6b60-3b95-447d-b551-3b31acb7155b",
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
  "id": "b92cb2df-93f1-4d59-9768-589f3edee77c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T19:31:25.111623Z",
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
  "command_id": "973e9b1c-6a90-45fb-92cc-766637bfe1d0",
  "quote_id": "b92cb2df-93f1-4d59-9768-589f3edee77c",
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
  "id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "935e0fd3-eb3c-4076-837d-7e0f8c87a516",
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
  "created_at": "2026-10-31T19:26:25.528245Z",
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

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e` → **200**

```json
{
  "id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "935e0fd3-eb3c-4076-837d-7e0f8c87a516",
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
  "created_at": "2026-10-31T19:26:25.528245Z",
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
    "id": "d0dc6255-e3f5-4592-baf6-6a145082df3a",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "expires_at": "2026-10-31T19:26:40.706041Z",
    "server_time": "2026-10-31T19:26:26.318747307Z",
    "seconds_left": 14,
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

`POST /api/driver/v1/offers/d0dc6255-e3f5-4592-baf6-6a145082df3a/accept` → **200**

```json
{
  "command_id": "24edd238-a2b3-43d9-9e31-087d15020751"
}
```

```json
{
  "id": "dc2dde9e-7ced-4960-84c9-6b55864c6bef",
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "413ac48b-08d9-4da0-8a3b-4b12f88376a7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "413ac48b-08d9-4da0-8a3b-4b12f88376a7",
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "assignment_id": "dc2dde9e-7ced-4960-84c9-6b55864c6bef",
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

`POST /api/driver/v1/work-sessions/b87ba135-8d15-4e47-9b12-399a004ab98f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T19:26:27Z",
    "sequence": 1793474787306
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b87ba135-8d15-4e47-9b12-399a004ab98f",
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
  "last_heartbeat_at": "2026-10-31T19:26:27.332757Z",
  "last_location_at": "2026-10-31T19:26:27.332757Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/413ac48b-08d9-4da0-8a3b-4b12f88376a7/arrive` → **200**

```json
{
  "command_id": "1f14c3f7-0304-4c7d-baee-87f147398d98",
  "expected_version": 0
}
```

```json
{
  "id": "413ac48b-08d9-4da0-8a3b-4b12f88376a7",
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "assignment_id": "dc2dde9e-7ced-4960-84c9-6b55864c6bef",
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
  "arrived_at": "2026-10-31T19:26:27.669124Z",
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

`POST /api/driver/v1/trips/413ac48b-08d9-4da0-8a3b-4b12f88376a7/start` → **200**

```json
{
  "command_id": "9d1541ac-2498-446e-b3f1-eafb60d5b24d",
  "expected_version": 1
}
```

```json
{
  "id": "413ac48b-08d9-4da0-8a3b-4b12f88376a7",
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "assignment_id": "dc2dde9e-7ced-4960-84c9-6b55864c6bef",
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
  "arrived_at": "2026-10-31T19:26:27.669124Z",
  "started_at": "2026-10-31T19:26:28.023939Z",
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

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e` → **200**

```json
{
  "id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "935e0fd3-eb3c-4076-837d-7e0f8c87a516",
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
    "id": "dc2dde9e-7ced-4960-84c9-6b55864c6bef",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "413ac48b-08d9-4da0-8a3b-4b12f88376a7",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T19:26:25.528245Z",
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

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e` → **200**

```json
{
  "id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "935e0fd3-eb3c-4076-837d-7e0f8c87a516",
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
    "id": "dc2dde9e-7ced-4960-84c9-6b55864c6bef",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "413ac48b-08d9-4da0-8a3b-4b12f88376a7",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T19:26:25.528245Z",
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

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e` → **200**

```json
{
  "id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "935e0fd3-eb3c-4076-837d-7e0f8c87a516",
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
    "id": "dc2dde9e-7ced-4960-84c9-6b55864c6bef",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "413ac48b-08d9-4da0-8a3b-4b12f88376a7",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T19:26:25.528245Z",
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

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": true,
  "tip": null
}
```

Tip 1600 on order a426b0ff-9943-405b-9451-feace7fa533e; the bank journal has 5 lines before it.
Crash point payment.after-send:TIP reached: halting as kill -9 would

The server halted at its crash point (exit 137).

Server start 2.

The worker asks the bank about the operation once its 2-minute lease has run out.

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

`GET /api/rider/v1/orders/a426b0ff-9943-405b-9451-feace7fa533e/tip` → **200**

```json
{
  "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:28.362312Z",
  "open": false,
  "tip": {
    "id": "4defb10d-3bb1-4a87-88bc-509c1d0ecdb8",
    "order_id": "a426b0ff-9943-405b-9451-feace7fa533e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:31.770421Z"
  }
}
```

Charges the bank received for the tip: **2**.

**The tip was charged 2 times.**
