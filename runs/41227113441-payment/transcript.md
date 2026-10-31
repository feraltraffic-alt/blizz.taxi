# Fault tests (2026-10-31T17:59:31Z, b70f5cf, break: payment)

## Payment: the bank charges a card tip, the server dies before it stores the answer

Server start 1, armed at `payment.after-send:TIP`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677590721",
  "device_ref": "sandbox-23360"
}
```

```json
{
  "challenge_id": "2dc306bd-cfd8-4dcf-8c19-f89fb2b1e50d",
  "expires_at": "2026-10-31T18:04:45.015795151Z",
  "resend_available_at": "2026-10-31T17:59:46.015795151Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677590721` → **200**

```json
{
  "phone": "+380677590721",
  "audience": "CLIENT",
  "code": "518181",
  "sent_at": "2026-10-31T17:59:45.032809127Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2dc306bd-cfd8-4dcf-8c19-f89fb2b1e50d",
  "code": "518181",
  "device_ref": "sandbox-23360"
}
```

```json
{
  "session_id": "41b8e1c4-c4fe-41f0-9a4b-c83efb1628c2",
  "subject": {
    "type": "CLIENT",
    "id": "88ba66ec-c064-4ede-baa3-f0c0536037dd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OGJhNjZlYy1jMDY0LTRlZGUtYmFhMy1mMGMwNTM2MDM3ZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDcwNDk1LCJpYXQiOjE3OTM0Njk1OTUsImp0aSI6IjNlNDUwYzQxLTRlMWItNDMzOS1iOWUwLThkNTgyYjM5Y2IxYyIsInNpZCI6IjQxYjhlMWM0LWM0ZmUtNDFmMC05YTRiLWM4M2VmYjE2MjhjMiJ9.k_1foGqHFTPrqe9D6MSxGqqObcEpjE0pGUhZZXg0XbE",
  "access_expires_at": "2026-10-31T18:14:55.04080967Z",
  "refresh_token": "2_4r7WimEJOgiDCz0r0SJOR7RI6oEWszniOXWvvQCP4",
  "refresh_expires_at": "2026-11-30T17:59:55.038515057Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "baecefbd-90d7-468c-8520-0603df2b4533",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "9faf45c9-30a1-4e31-b2b6-2b353a50f09d",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-9faf45c9-30a1-4e31-b2b6-2b353a50f09d",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "397b88c403cf233d8cbfc48ca5913515",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=9faf45c9-30a1-4e31-b2b6-2b353a50f09d",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380677590721"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=9faf45c9-30a1-4e31-b2b6-2b353a50f09d",
  "expires_at": "2026-10-31T18:29:55.443728Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/9faf45c9-30a1-4e31-b2b6-2b353a50f09d` → **200**

```json
{
  "id": "9faf45c9-30a1-4e31-b2b6-2b353a50f09d",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-31T18:29:55.443728Z",
  "card": {
    "id": "bef4adb8-e748-4fe7-9b08-0bbe3742f62e",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6420",
    "card_type": "Visa",
    "created_at": "2026-10-31T17:59:55.799905Z"
  },
  "failure_reason": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6847"
}
```

```json
{
  "challenge_id": "30d6b844-e845-40c1-82ec-537b1ba3a76b",
  "expires_at": "2026-10-31T18:04:56.159798039Z",
  "resend_available_at": "2026-10-31T17:59:57.159798039Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "166038",
  "sent_at": "2026-10-31T17:59:56.164502542Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "30d6b844-e845-40c1-82ec-537b1ba3a76b",
  "code": "166038",
  "device_ref": "sandbox-6847"
}
```

```json
{
  "session_id": "03f6ad0b-5755-4ac4-b8a1-41527770eeae",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3MDQ5NiwiaWF0IjoxNzkzNDY5NTk2LCJqdGkiOiJhNzJkYmFiNS1jNGEyLTQ2MDAtOGMyNi0yODc4NWIxYjI1OWYiLCJzaWQiOiIwM2Y2YWQwYi01NzU1LTRhYzQtYjhhMS00MTUyNzc3MGVlYWUifQ.nM5JnbBcqRaiY77cC7nrPXcr3q62QLxgh6x7JKq5XEE",
  "access_expires_at": "2026-10-31T18:14:56.513675673Z",
  "refresh_token": "xS8kW5GHO8GJ--VLYrgBlXGWc0Jn7RmhsfuQ8sZPRyQ",
  "refresh_expires_at": "2026-11-30T17:59:56.51256813Z",
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
  "command_id": "7defdd53-af84-49d8-8c86-a9800130c8aa",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:59:57Z",
    "sequence": 1793469597217
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "372234a3-284f-4699-89f9-931c47334e5a",
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
  "last_heartbeat_at": "2026-10-31T17:59:57.433531Z",
  "last_location_at": "2026-10-31T17:59:57.433531Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3b9c1672-b57f-4a45-a8a2-22bd1872df16",
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
  "id": "83e98687-f6b2-427f-97df-4532230dcbb5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T18:04:57.826166Z",
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
  "command_id": "b53aa41c-718e-40e1-b787-bc3346543441",
  "quote_id": "83e98687-f6b2-427f-97df-4532230dcbb5",
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
  "id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "88ba66ec-c064-4ede-baa3-f0c0536037dd",
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
  "created_at": "2026-10-31T17:59:58.259945Z",
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

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374` → **200**

```json
{
  "id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "88ba66ec-c064-4ede-baa3-f0c0536037dd",
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
  "created_at": "2026-10-31T17:59:58.259945Z",
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

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374` → **200**

```json
{
  "id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "88ba66ec-c064-4ede-baa3-f0c0536037dd",
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
  "created_at": "2026-10-31T17:59:58.259945Z",
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
    "id": "73a2249d-ba59-4e3f-876e-918929ed1a9c",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "expires_at": "2026-10-31T18:00:13.867146Z",
    "server_time": "2026-10-31T18:00:00.372899386Z",
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

`POST /api/driver/v1/offers/73a2249d-ba59-4e3f-876e-918929ed1a9c/accept` → **200**

```json
{
  "command_id": "4b9925dd-62c2-477e-85f9-3f7b4053d270"
}
```

```json
{
  "id": "7efc1a4e-87b3-463d-a9ea-04ab448459d6",
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a401fb83-4725-4552-a236-e1517d751099",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a401fb83-4725-4552-a236-e1517d751099",
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "assignment_id": "7efc1a4e-87b3-463d-a9ea-04ab448459d6",
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

`POST /api/driver/v1/work-sessions/372234a3-284f-4699-89f9-931c47334e5a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T18:00:01Z",
    "sequence": 1793469601426
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "372234a3-284f-4699-89f9-931c47334e5a",
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
  "last_heartbeat_at": "2026-10-31T18:00:01.45623Z",
  "last_location_at": "2026-10-31T18:00:01.45623Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/a401fb83-4725-4552-a236-e1517d751099/arrive` → **200**

```json
{
  "command_id": "250b6d67-20bc-4d00-bf99-6bc9f6776527",
  "expected_version": 0
}
```

```json
{
  "id": "a401fb83-4725-4552-a236-e1517d751099",
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "assignment_id": "7efc1a4e-87b3-463d-a9ea-04ab448459d6",
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
  "arrived_at": "2026-10-31T18:00:01.812615Z",
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

`POST /api/driver/v1/trips/a401fb83-4725-4552-a236-e1517d751099/start` → **200**

```json
{
  "command_id": "2e759e05-593f-47bd-8d6b-897fb6040b6f",
  "expected_version": 1
}
```

```json
{
  "id": "a401fb83-4725-4552-a236-e1517d751099",
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "assignment_id": "7efc1a4e-87b3-463d-a9ea-04ab448459d6",
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
  "arrived_at": "2026-10-31T18:00:01.812615Z",
  "started_at": "2026-10-31T18:00:02.168155Z",
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

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374` → **200**

```json
{
  "id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "88ba66ec-c064-4ede-baa3-f0c0536037dd",
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
    "id": "7efc1a4e-87b3-463d-a9ea-04ab448459d6",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a401fb83-4725-4552-a236-e1517d751099",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:59:58.259945Z",
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

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374` → **200**

```json
{
  "id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "88ba66ec-c064-4ede-baa3-f0c0536037dd",
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
    "id": "7efc1a4e-87b3-463d-a9ea-04ab448459d6",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a401fb83-4725-4552-a236-e1517d751099",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:59:58.259945Z",
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

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374` → **200**

```json
{
  "id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "88ba66ec-c064-4ede-baa3-f0c0536037dd",
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
    "id": "7efc1a4e-87b3-463d-a9ea-04ab448459d6",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a401fb83-4725-4552-a236-e1517d751099",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:59:58.259945Z",
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

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": true,
  "tip": null
}
```

Tip 1600 on order 70027eef-926f-47b6-b895-aa575a2ca374; the bank journal has 5 lines before it.
Crash point payment.after-send:TIP reached: halting as kill -9 would

The server halted at its crash point (exit 137).

Server start 2.

The worker asks the bank about the operation once its 2-minute lease has run out.

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

`GET /api/rider/v1/orders/70027eef-926f-47b6-b895-aa575a2ca374/tip` → **200**

```json
{
  "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:00:02.541839Z",
  "open": false,
  "tip": {
    "id": "74b7bd58-e608-4229-af96-adf65ec57828",
    "order_id": "70027eef-926f-47b6-b895-aa575a2ca374",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-31T18:00:05.970945Z"
  }
}
```

Charges the bank received for the tip: **2**.

**The tip was charged 2 times.**
