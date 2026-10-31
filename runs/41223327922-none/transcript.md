# Fault tests (2026-10-31T17:12:16Z, 8b135d5, break: none)

## Payment: the bank charges a card tip, the server dies before it stores the answer

Server start 1, armed at `payment.after-send:TIP`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674669745",
  "device_ref": "sandbox-31186"
}
```

```json
{
  "challenge_id": "2a121e53-1ea7-43be-96af-97afb15af4fb",
  "expires_at": "2026-10-31T17:17:24.501738768Z",
  "resend_available_at": "2026-10-31T17:12:25.501738768Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674669745` → **200**

```json
{
  "phone": "+380674669745",
  "audience": "CLIENT",
  "code": "237202",
  "sent_at": "2026-10-31T17:12:24.511645725Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2a121e53-1ea7-43be-96af-97afb15af4fb",
  "code": "237202",
  "device_ref": "sandbox-31186"
}
```

```json
{
  "session_id": "71c219ac-7ad0-4bd7-be0b-067cf84f8d82",
  "subject": {
    "type": "CLIENT",
    "id": "2bf6a0a8-5e66-4b56-b572-7e5eff3e5507"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYmY2YTBhOC01ZTY2LTRiNTYtYjU3Mi03ZTVlZmYzZTU1MDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDY3NjQ5LCJpYXQiOjE3OTM0NjY3NDksImp0aSI6ImU4ZjQ4MmI5LTQyYjAtNGZhMy04MDU1LWQ4Zjg0ODdhMjQxYSIsInNpZCI6IjcxYzIxOWFjLTdhZDAtNGJkNy1iZTBiLTA2N2NmODRmOGQ4MiJ9.vcjcagsdhK8xZW89VEb-5stzyXMry6djwtozykBvaO8",
  "access_expires_at": "2026-10-31T17:27:29.834840675Z",
  "refresh_token": "RBA63d5b0nu4SpC08dSVe6QaC0HrJy1i65tx7kAvRDY",
  "refresh_expires_at": "2026-11-30T17:12:29.833583732Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "a93f819e-bc65-4295-bc96-9cf24486d256",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "bfa96cd7-9088-460d-bf57-63286c9c55b9",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-bfa96cd7-9088-460d-bf57-63286c9c55b9",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "1ebe9b88cf720f81b76e694697ad16fe",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=bfa96cd7-9088-460d-bf57-63286c9c55b9",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380674669745"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=bfa96cd7-9088-460d-bf57-63286c9c55b9",
  "expires_at": "2026-10-31T17:42:30.074505Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/bfa96cd7-9088-460d-bf57-63286c9c55b9` → **200**

```json
{
  "id": "bfa96cd7-9088-460d-bf57-63286c9c55b9",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-31T17:42:30.074505Z",
  "card": {
    "id": "8e970426-573f-48a8-b922-d4a361a644c4",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1331",
    "card_type": "Visa",
    "created_at": "2026-10-31T17:12:30.283347Z"
  },
  "failure_reason": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15136"
}
```

```json
{
  "challenge_id": "5cd06d57-f9ff-458d-ba00-898e8b3b8620",
  "expires_at": "2026-10-31T17:17:30.493530148Z",
  "resend_available_at": "2026-10-31T17:12:31.493530148Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "770555",
  "sent_at": "2026-10-31T17:12:30.497755594Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5cd06d57-f9ff-458d-ba00-898e8b3b8620",
  "code": "770555",
  "device_ref": "sandbox-15136"
}
```

```json
{
  "session_id": "de38c732-db17-4d50-9286-b05c9d864605",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ2NzY1MCwiaWF0IjoxNzkzNDY2NzUwLCJqdGkiOiI0MzNlMjU4Zi03ZGFlLTQ0YzUtODUxZi02YzM2MjlmMDAyMzIiLCJzaWQiOiJkZTM4YzczMi1kYjE3LTRkNTAtOTI4Ni1iMDVjOWQ4NjQ2MDUifQ.Gw6wpsvmZnkzso1Iqc237lLfQvPdz_O-jzMYrU232VY",
  "access_expires_at": "2026-10-31T17:27:30.726978264Z",
  "refresh_token": "y5M8tjg-mrvXyX46Rl1EW2LGQaFiw7P2Vtw-rUEaSdc",
  "refresh_expires_at": "2026-11-30T17:12:30.726336578Z",
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
  "command_id": "514b66c3-5d44-4b1e-a04c-c2a8bfc3d8de",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:12:31Z",
    "sequence": 1793466751127
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f11b242f-d8fa-4b70-a05b-fa3164a043bb",
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
  "last_heartbeat_at": "2026-10-31T17:12:31.207094Z",
  "last_location_at": "2026-10-31T17:12:31.207094Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "02e6e8bb-e978-4568-af50-6b9925d28450",
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
  "id": "3c54882f-7432-48a5-86f4-3218f1dadceb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T17:17:31.445344Z",
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
  "command_id": "770bedb7-ec52-4dd8-a41d-6299440fca01",
  "quote_id": "3c54882f-7432-48a5-86f4-3218f1dadceb",
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
  "id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "2bf6a0a8-5e66-4b56-b572-7e5eff3e5507",
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
  "created_at": "2026-10-31T17:12:31.706153Z",
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

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77` → **200**

```json
{
  "id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "2bf6a0a8-5e66-4b56-b572-7e5eff3e5507",
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
  "created_at": "2026-10-31T17:12:31.706153Z",
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

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77` → **200**

```json
{
  "id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2bf6a0a8-5e66-4b56-b572-7e5eff3e5507",
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
  "created_at": "2026-10-31T17:12:31.706153Z",
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
    "id": "4283b20b-7241-485a-bbed-8d285d25752e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "expires_at": "2026-10-31T17:12:47.556859Z",
    "server_time": "2026-10-31T17:12:33.353310301Z",
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

`POST /api/driver/v1/offers/4283b20b-7241-485a-bbed-8d285d25752e/accept` → **200**

```json
{
  "command_id": "fba99f77-9b67-4371-a6e6-c3eee06bc4c9"
}
```

```json
{
  "id": "e859aafb-01ee-41b4-8218-1891a6d13095",
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0d9d2329-8945-43ed-b1f7-0d6fa7b8653d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0d9d2329-8945-43ed-b1f7-0d6fa7b8653d",
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "assignment_id": "e859aafb-01ee-41b4-8218-1891a6d13095",
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

`POST /api/driver/v1/work-sessions/f11b242f-d8fa-4b70-a05b-fa3164a043bb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:12:34Z",
    "sequence": 1793466754129
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f11b242f-d8fa-4b70-a05b-fa3164a043bb",
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
  "last_heartbeat_at": "2026-10-31T17:12:34.034835Z",
  "last_location_at": "2026-10-31T17:12:34.034835Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/0d9d2329-8945-43ed-b1f7-0d6fa7b8653d/arrive` → **200**

```json
{
  "command_id": "5b4b37b7-3912-4c62-86ca-eb84e19edf80",
  "expected_version": 0
}
```

```json
{
  "id": "0d9d2329-8945-43ed-b1f7-0d6fa7b8653d",
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "assignment_id": "e859aafb-01ee-41b4-8218-1891a6d13095",
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
  "arrived_at": "2026-10-31T17:12:34.248349Z",
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

`POST /api/driver/v1/trips/0d9d2329-8945-43ed-b1f7-0d6fa7b8653d/start` → **200**

```json
{
  "command_id": "ffcca4a5-032c-4d0b-b5ff-88bdb0caae16",
  "expected_version": 1
}
```

```json
{
  "id": "0d9d2329-8945-43ed-b1f7-0d6fa7b8653d",
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "assignment_id": "e859aafb-01ee-41b4-8218-1891a6d13095",
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
  "arrived_at": "2026-10-31T17:12:34.248349Z",
  "started_at": "2026-10-31T17:12:34.458983Z",
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

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77` → **200**

```json
{
  "id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "2bf6a0a8-5e66-4b56-b572-7e5eff3e5507",
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
    "id": "e859aafb-01ee-41b4-8218-1891a6d13095",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0d9d2329-8945-43ed-b1f7-0d6fa7b8653d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:12:31.706153Z",
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

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77` → **200**

```json
{
  "id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "2bf6a0a8-5e66-4b56-b572-7e5eff3e5507",
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
    "id": "e859aafb-01ee-41b4-8218-1891a6d13095",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0d9d2329-8945-43ed-b1f7-0d6fa7b8653d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:12:31.706153Z",
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

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77` → **200**

```json
{
  "id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "2bf6a0a8-5e66-4b56-b572-7e5eff3e5507",
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
    "id": "e859aafb-01ee-41b4-8218-1891a6d13095",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0d9d2329-8945-43ed-b1f7-0d6fa7b8653d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:12:31.706153Z",
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

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77` → **200**

```json
{
  "id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "2bf6a0a8-5e66-4b56-b572-7e5eff3e5507",
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
    "id": "e859aafb-01ee-41b4-8218-1891a6d13095",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0d9d2329-8945-43ed-b1f7-0d6fa7b8653d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:12:31.706153Z",
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

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": true,
  "tip": null
}
```

Tip 1600 on order 46235bae-0bd6-473a-b9ef-7c113e1fca77; the bank journal has 5 lines before it.
Crash point payment.after-send:TIP reached: halting as kill -9 would

The server halted at its crash point (exit 137).

Server start 2.

The worker asks the bank about the operation once its 2-minute lease has run out.

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
  }
}
```

`GET /api/rider/v1/orders/46235bae-0bd6-473a-b9ef-7c113e1fca77/tip` → **200**

```json
{
  "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:12:34.675884Z",
  "open": false,
  "tip": {
    "id": "1e1735f8-8ce7-4c9e-b7ad-03abbd61ec9e",
    "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-31T17:12:38.743939Z"
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
      "id": "70867446-4a99-40a7-8e66-247fecc39850",
      "at": "2026-10-31T17:12:35.652658Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 8939,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
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
      "id": "a6d58ecc-a2fc-4f7f-9b66-d4fc4995fab7",
      "at": "2026-10-31T17:14:40.981523Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 1600,
      "reason": "Tip for the driver",
      "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
      "counterpart_id": null
    },
    {
      "id": "70867446-4a99-40a7-8e66-247fecc39850",
      "at": "2026-10-31T17:12:35.652658Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 8939,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "46235bae-0bd6-473a-b9ef-7c113e1fca77",
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
  "session_id": "f11b242f-d8fa-4b70-a05b-fa3164a043bb",
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
  "last_heartbeat_at": "2026-10-31T17:12:34.034835Z",
  "last_location_at": "2026-10-31T17:12:34.034835Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f11b242f-d8fa-4b70-a05b-fa3164a043bb/close` → **200**

```json
{
  "command_id": "f82244ae-85e6-44e1-bcfa-7ee85b1ddb08",
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
  "phone": "+380677539630",
  "device_ref": "sandbox-26542"
}
```

```json
{
  "challenge_id": "360e7216-28dc-4bd9-9768-8791ae15daec",
  "expires_at": "2026-10-31T17:19:51.274940185Z",
  "resend_available_at": "2026-10-31T17:14:52.274940185Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677539630` → **200**

```json
{
  "phone": "+380677539630",
  "audience": "CLIENT",
  "code": "970635",
  "sent_at": "2026-10-31T17:14:51.287401956Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "360e7216-28dc-4bd9-9768-8791ae15daec",
  "code": "970635",
  "device_ref": "sandbox-26542"
}
```

```json
{
  "session_id": "2501a532-be48-46da-a52d-9f1f470374a6",
  "subject": {
    "type": "CLIENT",
    "id": "9b57a166-dcf7-4a99-8a3b-2f640922eea2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU3YTE2Ni1kY2Y3LTRhOTktOGEzYi0yZjY0MDkyMmVlYTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDY3NzkxLCJpYXQiOjE3OTM0NjY4OTEsImp0aSI6ImFiOWI4NzQ0LTQ5Y2MtNDZlYy1hNjZhLWRlYzFiODM0ZDM0ZSIsInNpZCI6IjI1MDFhNTMyLWJlNDgtNDZkYS1hNTJkLTlmMWY0NzAzNzRhNiJ9.iW8J_dzEX7LTPCTyH_aSBPBXbxizIaMjnhGdrAXC2mM",
  "access_expires_at": "2026-10-31T17:29:51.550235447Z",
  "refresh_token": "IxDbAy3vOE8Rt3J6JUSJrAdLX1LDD0euLBp8N5DrDxE",
  "refresh_expires_at": "2026-11-30T17:14:51.54816225Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-30024"
}
```

```json
{
  "challenge_id": "c13f691f-cdaf-4111-8761-b55578017cd5",
  "expires_at": "2026-10-31T17:19:51.790472602Z",
  "resend_available_at": "2026-10-31T17:14:52.790472602Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "656444",
  "sent_at": "2026-10-31T17:14:51.795845042Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c13f691f-cdaf-4111-8761-b55578017cd5",
  "code": "656444",
  "device_ref": "sandbox-30024"
}
```

```json
{
  "session_id": "11b9693c-10a3-4b60-9d92-6a97eb0a877d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ2Nzc5MiwiaWF0IjoxNzkzNDY2ODkyLCJqdGkiOiJmZWU5YjU0Ni00YjJjLTRiZjQtODJiZC0zYzEyOTUzMzk5Y2YiLCJzaWQiOiIxMWI5NjkzYy0xMGEzLTRiNjAtOWQ5Mi02YTk3ZWIwYTg3N2QifQ.gz3BfnWp2IngYuvETBk3zSCxp1-RMtJis92xggHHzI4",
  "access_expires_at": "2026-10-31T17:29:52.033297048Z",
  "refresh_token": "CdunX3PqGIy-CMQToeU7EtMAsXTa1zBcSTCZrkI1PPo",
  "refresh_expires_at": "2026-11-30T17:14:52.03242198Z",
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
  "command_id": "cd60e25c-cca5-43c9-b69a-68ff03fe4637",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:14:52Z",
    "sequence": 1793466892480
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "52de03a5-aca8-4071-bae8-98e62e5b3cff",
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
  "last_heartbeat_at": "2026-10-31T17:14:52.536413Z",
  "last_location_at": "2026-10-31T17:14:52.536413Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e0fa7b0d-318a-4354-8081-b6fd5924bf66",
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
  "id": "200a6f59-1eb4-4b27-bb3f-87716814d0cb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T17:19:52.812846Z",
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
  "command_id": "11e8db3c-dcca-4199-90e7-1744e8eec7a7",
  "quote_id": "200a6f59-1eb4-4b27-bb3f-87716814d0cb",
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
  "id": "234d594f-fa86-494a-9cfb-4283eb176d3e",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9b57a166-dcf7-4a99-8a3b-2f640922eea2",
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
  "created_at": "2026-10-31T17:14:53.109188Z",
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
    "id": "6be8fb8b-49e0-401e-abb7-51878cbb8dba",
    "order_id": "234d594f-fa86-494a-9cfb-4283eb176d3e",
    "expires_at": "2026-10-31T17:15:08.11922Z",
    "server_time": "2026-10-31T17:14:53.380263649Z",
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

`POST /api/driver/v1/offers/6be8fb8b-49e0-401e-abb7-51878cbb8dba/accept` → **200**

```json
{
  "command_id": "24f75521-294c-4d33-8e79-6c12903302f3"
}
```

```json
{
  "id": "211aeadd-1f18-43b2-aca6-cffa53953aac",
  "order_id": "234d594f-fa86-494a-9cfb-4283eb176d3e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "75c38d58-b18e-4c33-990d-cd03267918eb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "75c38d58-b18e-4c33-990d-cd03267918eb",
  "order_id": "234d594f-fa86-494a-9cfb-4283eb176d3e",
  "assignment_id": "211aeadd-1f18-43b2-aca6-cffa53953aac",
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

`POST /api/driver/v1/work-sessions/52de03a5-aca8-4071-bae8-98e62e5b3cff/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:14:54Z",
    "sequence": 1793466894778
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "52de03a5-aca8-4071-bae8-98e62e5b3cff",
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
  "last_heartbeat_at": "2026-10-31T17:14:54.102543Z",
  "last_location_at": "2026-10-31T17:14:54.102543Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/75c38d58-b18e-4c33-990d-cd03267918eb/arrive` → **200**

```json
{
  "command_id": "a9cd5f05-f451-4e7f-9263-7f34dd579ce0",
  "expected_version": 0
}
```

```json
{
  "id": "75c38d58-b18e-4c33-990d-cd03267918eb",
  "order_id": "234d594f-fa86-494a-9cfb-4283eb176d3e",
  "assignment_id": "211aeadd-1f18-43b2-aca6-cffa53953aac",
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
  "arrived_at": "2026-10-31T17:14:54.322897Z",
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

`POST /api/driver/v1/trips/75c38d58-b18e-4c33-990d-cd03267918eb/start` → **200**

```json
{
  "command_id": "41bee25a-0491-4366-bd52-079c755dcc28",
  "expected_version": 1
}
```

```json
{
  "id": "75c38d58-b18e-4c33-990d-cd03267918eb",
  "order_id": "234d594f-fa86-494a-9cfb-4283eb176d3e",
  "assignment_id": "211aeadd-1f18-43b2-aca6-cffa53953aac",
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
  "arrived_at": "2026-10-31T17:14:54.322897Z",
  "started_at": "2026-10-31T17:14:54.546057Z",
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

TripCompleted 31a34546-311d-46cd-905b-a94768340d04: PENDING after the crash.

Server start 4.

Consumers of the crashed event: `backoffice.problem-queues finance.trip-fare-posting finance.wallet-order-settlement notification.order-live-feed notification.push-feed operator-bonuses payments.trip-capture promotions.driver-trips promotions.trip-rewards`.

Live messages of the crashed event: **1** (sent before the crash, not again after it).

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "52de03a5-aca8-4071-bae8-98e62e5b3cff",
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
  "last_heartbeat_at": "2026-10-31T17:14:54.102543Z",
  "last_location_at": "2026-10-31T17:14:54.102543Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/52de03a5-aca8-4071-bae8-98e62e5b3cff/close` → **200**

```json
{
  "command_id": "edaf734d-4989-4e5f-9028-44484877d5e2",
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
  "phone": "+380674285458",
  "device_ref": "sandbox-26110"
}
```

```json
{
  "challenge_id": "503caf7b-23a3-4ed5-a5d2-91b18c03ad02",
  "expires_at": "2026-10-31T17:20:35.96665254Z",
  "resend_available_at": "2026-10-31T17:15:36.96665254Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674285458` → **200**

```json
{
  "phone": "+380674285458",
  "audience": "CLIENT",
  "code": "233395",
  "sent_at": "2026-10-31T17:15:35.977432264Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "503caf7b-23a3-4ed5-a5d2-91b18c03ad02",
  "code": "233395",
  "device_ref": "sandbox-26110"
}
```

```json
{
  "session_id": "f3824b57-748f-4aa0-b174-ba2655200520",
  "subject": {
    "type": "CLIENT",
    "id": "d58f0292-2137-4c0c-ade4-4634097ca365"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNThmMDI5Mi0yMTM3LTRjMGMtYWRlNC00NjM0MDk3Y2EzNjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDY3ODM2LCJpYXQiOjE3OTM0NjY5MzYsImp0aSI6IjUzMDJjOWZlLTg3ZjAtNGFlYS1hMTFjLTUxZDcwMWQ1OWRiNSIsInNpZCI6ImYzODI0YjU3LTc0OGYtNGFhMC1iMTc0LWJhMjY1NTIwMDUyMCJ9.v8q7uPkcccCmM9ERWzMBY8ZcpgdvZcVsotQANxjeahE",
  "access_expires_at": "2026-10-31T17:30:36.216493184Z",
  "refresh_token": "L_nFQUJDbsb-tIaXyP3KuEUvyMOh5p0dFWZBtAkGzOI",
  "refresh_expires_at": "2026-11-30T17:15:36.21467789Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26065"
}
```

```json
{
  "challenge_id": "ad833fca-b71f-47bc-9ecd-d652cde8ccc2",
  "expires_at": "2026-10-31T17:20:36.454148377Z",
  "resend_available_at": "2026-10-31T17:15:37.454148377Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "324818",
  "sent_at": "2026-10-31T17:15:36.458880894Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad833fca-b71f-47bc-9ecd-d652cde8ccc2",
  "code": "324818",
  "device_ref": "sandbox-26065"
}
```

```json
{
  "session_id": "8bf7548f-207b-46e6-85e8-c625ea664289",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ2NzgzNiwiaWF0IjoxNzkzNDY2OTM2LCJqdGkiOiJjMWY5Nzc1My1jYWVlLTQzOWItYjFiNS0yYzY5NTgxMTdiMDkiLCJzaWQiOiI4YmY3NTQ4Zi0yMDdiLTQ2ZTYtODVlOC1jNjI1ZWE2NjQyODkifQ.G8dEsS_3aanavz3wNfO0gzHYg_a8r-96IpEIWQWm7us",
  "access_expires_at": "2026-10-31T17:30:36.683913076Z",
  "refresh_token": "zxWqKTqd9kdgiCWQifilqo-pEzMTTSIuEcraMqo2cKQ",
  "refresh_expires_at": "2026-11-30T17:15:36.683080396Z",
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
  "command_id": "f9e78411-f02f-42c4-ae22-59058ae8a02e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:15:37Z",
    "sequence": 1793466937106
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4cf20549-001b-442e-b716-5508708a3d48",
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
  "last_heartbeat_at": "2026-10-31T17:15:37.162271Z",
  "last_location_at": "2026-10-31T17:15:37.162271Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3cec40e9-2ab2-4873-a701-b13795195186",
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
  "id": "039a0b3c-9e4c-48b1-a355-db3f2517bbb7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T17:20:37.442233Z",
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
  "command_id": "494665f0-d29b-4393-bf42-bc38d9176921",
  "quote_id": "039a0b3c-9e4c-48b1-a355-db3f2517bbb7",
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
  "id": "b6cd6f71-70f9-4092-a1d5-5be28707319f",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d58f0292-2137-4c0c-ade4-4634097ca365",
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
  "created_at": "2026-10-31T17:15:37.712329Z",
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
    "id": "9a58127b-406e-49a6-91d1-7874d3923bfc",
    "order_id": "b6cd6f71-70f9-4092-a1d5-5be28707319f",
    "expires_at": "2026-10-31T17:15:52.722366Z",
    "server_time": "2026-10-31T17:15:37.970073585Z",
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

`POST /api/driver/v1/offers/9a58127b-406e-49a6-91d1-7874d3923bfc/accept` → **200**

```json
{
  "command_id": "4b49f38d-c768-4109-af32-15ff695037c1"
}
```

```json
{
  "id": "529c929e-f6ec-479f-ae86-79891e88e2c5",
  "order_id": "b6cd6f71-70f9-4092-a1d5-5be28707319f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1f889dbf-ee25-49dc-b95f-b1d3fae2e69d",
  "trip_phase": "TO_PICKUP"
}
```

The retry with the same command: HTTP 200.

One assignment, and the retry returned it.

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1f889dbf-ee25-49dc-b95f-b1d3fae2e69d",
  "order_id": "b6cd6f71-70f9-4092-a1d5-5be28707319f",
  "assignment_id": "529c929e-f6ec-479f-ae86-79891e88e2c5",
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

`POST /api/driver/v1/work-sessions/4cf20549-001b-442e-b716-5508708a3d48/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:15:45Z",
    "sequence": 1793466945316
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4cf20549-001b-442e-b716-5508708a3d48",
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
  "last_heartbeat_at": "2026-10-31T17:15:45.375366Z",
  "last_location_at": "2026-10-31T17:15:45.375366Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/1f889dbf-ee25-49dc-b95f-b1d3fae2e69d/arrive` → **200**

```json
{
  "command_id": "1d11f961-8b5d-45a4-bc74-74d066242f6b",
  "expected_version": 0
}
```

```json
{
  "id": "1f889dbf-ee25-49dc-b95f-b1d3fae2e69d",
  "order_id": "b6cd6f71-70f9-4092-a1d5-5be28707319f",
  "assignment_id": "529c929e-f6ec-479f-ae86-79891e88e2c5",
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
  "arrived_at": "2026-10-31T17:15:45.604243Z",
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

`POST /api/driver/v1/trips/1f889dbf-ee25-49dc-b95f-b1d3fae2e69d/start` → **200**

```json
{
  "command_id": "f711f96e-e103-4fe4-98c3-0669f7232878",
  "expected_version": 1
}
```

```json
{
  "id": "1f889dbf-ee25-49dc-b95f-b1d3fae2e69d",
  "order_id": "b6cd6f71-70f9-4092-a1d5-5be28707319f",
  "assignment_id": "529c929e-f6ec-479f-ae86-79891e88e2c5",
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
  "arrived_at": "2026-10-31T17:15:45.604243Z",
  "started_at": "2026-10-31T17:15:45.840705Z",
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
  "session_id": "4cf20549-001b-442e-b716-5508708a3d48",
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
  "last_heartbeat_at": "2026-10-31T17:15:45.375366Z",
  "last_location_at": "2026-10-31T17:15:45.375366Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4cf20549-001b-442e-b716-5508708a3d48/close` → **200**

```json
{
  "command_id": "259db370-cd8c-400e-943d-06d5b166a68e",
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

Connections cut: 20.

`POST /auth/v1/otp/challenges` → **500**

```json
{
  "audience": "CLIENT",
  "phone": "+380670641237",
  "device_ref": "sandbox-24674"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 500,
  "title": "Internal error",
  "type": "https://errors.blizz.taxi/internal-error",
  "code": "INTERNAL_ERROR",
  "correlation_id": "0b2e7265-3c98-4373-966f-947b78eaf559"
}
```

**Expected 201, got 500 — scenario stopped.**

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671822300",
  "device_ref": "sandbox-8050"
}
```

```json
{
  "challenge_id": "f84e7a56-f864-47d0-bc31-56c5f81e4928",
  "expires_at": "2026-10-31T17:20:54.246835306Z",
  "resend_available_at": "2026-10-31T17:15:55.246835306Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671822300` → **200**

```json
{
  "phone": "+380671822300",
  "audience": "CLIENT",
  "code": "030778",
  "sent_at": "2026-10-31T17:15:54.258313357Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f84e7a56-f864-47d0-bc31-56c5f81e4928",
  "code": "030778",
  "device_ref": "sandbox-8050"
}
```

```json
{
  "session_id": "2cbbc47c-ee73-4210-a10a-e88ef4697ddc",
  "subject": {
    "type": "CLIENT",
    "id": "5ceaf9cb-c05b-4dfe-83f9-a7c7cfb7fe88"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1Y2VhZjljYi1jMDViLTRkZmUtODNmOS1hN2M3Y2ZiN2ZlODgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDY3ODU0LCJpYXQiOjE3OTM0NjY5NTQsImp0aSI6IjM3OGVhYTcyLTFhZDItNDBjMS04NDZhLTBjN2E5NGY1ZmJiNSIsInNpZCI6IjJjYmJjNDdjLWVlNzMtNDIxMC1hMTBhLWU4OGVmNDY5N2RkYyJ9.tc0ecuBxnYLU7tajp8y7SubyOdozywo88W42_x1Pe0U",
  "access_expires_at": "2026-10-31T17:30:54.515305287Z",
  "refresh_token": "9Hvz0cDyQ5baF_xcGRdO47dDySv0VHxTRtY6O0umhiA",
  "refresh_expires_at": "2026-11-30T17:15:54.513297533Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-30192"
}
```

```json
{
  "challenge_id": "7bc56e86-99f9-45bc-afed-1e8a59b54d5c",
  "expires_at": "2026-10-31T17:20:54.74617178Z",
  "resend_available_at": "2026-10-31T17:15:55.74617178Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "456182",
  "sent_at": "2026-10-31T17:15:54.751166938Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7bc56e86-99f9-45bc-afed-1e8a59b54d5c",
  "code": "456182",
  "device_ref": "sandbox-30192"
}
```

```json
{
  "session_id": "eaef3d9a-a601-4ee5-843b-0ab52e198a5a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ2Nzg1NCwiaWF0IjoxNzkzNDY2OTU0LCJqdGkiOiJmNzAwZDM5ZS0xNWMyLTQ3ZTgtYmQ4Ny02NThlZGJmN2RmMzMiLCJzaWQiOiJlYWVmM2Q5YS1hNjAxLTRlZTUtODQzYi0wYWI1MmUxOThhNWEifQ.AbgtNK_kbWQnzZFMX001j1rBn7f81VumlJlRO84avbU",
  "access_expires_at": "2026-10-31T17:30:54.971074284Z",
  "refresh_token": "KEwARcmTu-HgCUgodb_hvKKau5iYO9FM9YndSf3GcFU",
  "refresh_expires_at": "2026-11-30T17:15:54.970113197Z",
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
  "command_id": "e79a5a9d-66fe-48ba-814c-a0d8d65625e7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:15:55Z",
    "sequence": 1793466955408
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d04526c9-accb-410d-be60-682084bf481f",
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
  "last_heartbeat_at": "2026-10-31T17:15:55.46342Z",
  "last_location_at": "2026-10-31T17:15:55.46342Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6e4d4def-ba1f-478c-b555-794e6c5881db",
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
  "id": "3e654d0c-1bad-476b-946e-5563f6e4bc81",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T17:20:55.726954Z",
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
  "command_id": "873ab96f-11a0-4e34-8a1c-13fa7b502ca1",
  "quote_id": "3e654d0c-1bad-476b-946e-5563f6e4bc81",
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
  "id": "955d83f1-36f4-44a9-ab96-874530002630",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5ceaf9cb-c05b-4dfe-83f9-a7c7cfb7fe88",
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
  "created_at": "2026-10-31T17:15:55.999321Z",
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
    "id": "1ff05414-942f-479c-a567-2815b97e2712",
    "order_id": "955d83f1-36f4-44a9-ab96-874530002630",
    "expires_at": "2026-10-31T17:16:11.00834Z",
    "server_time": "2026-10-31T17:15:56.282660212Z",
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

`POST /api/driver/v1/offers/1ff05414-942f-479c-a567-2815b97e2712/accept` → **200**

```json
{
  "command_id": "b2ab7795-9ba0-4078-9fc5-4f57d4fef165"
}
```

```json
{
  "id": "b0a1da79-e41b-4450-97ba-bdbbf7aef8d9",
  "order_id": "955d83f1-36f4-44a9-ab96-874530002630",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "25a24e1e-3035-4b13-b2cb-ee217a08348c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "25a24e1e-3035-4b13-b2cb-ee217a08348c",
  "order_id": "955d83f1-36f4-44a9-ab96-874530002630",
  "assignment_id": "b0a1da79-e41b-4450-97ba-bdbbf7aef8d9",
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

`POST /api/driver/v1/work-sessions/d04526c9-accb-410d-be60-682084bf481f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:15:56Z",
    "sequence": 1793466956949
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d04526c9-accb-410d-be60-682084bf481f",
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
  "last_heartbeat_at": "2026-10-31T17:15:56.974959Z",
  "last_location_at": "2026-10-31T17:15:56.974959Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/25a24e1e-3035-4b13-b2cb-ee217a08348c/arrive` → **200**

```json
{
  "command_id": "a4aaae7d-e59e-41bc-b713-497e5070109b",
  "expected_version": 0
}
```

```json
{
  "id": "25a24e1e-3035-4b13-b2cb-ee217a08348c",
  "order_id": "955d83f1-36f4-44a9-ab96-874530002630",
  "assignment_id": "b0a1da79-e41b-4450-97ba-bdbbf7aef8d9",
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
  "arrived_at": "2026-10-31T17:15:57.232597Z",
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

`POST /api/driver/v1/trips/25a24e1e-3035-4b13-b2cb-ee217a08348c/start` → **200**

```json
{
  "command_id": "bbadc7d0-b45e-4c03-8abe-2b6054b91d10",
  "expected_version": 1
}
```

```json
{
  "id": "25a24e1e-3035-4b13-b2cb-ee217a08348c",
  "order_id": "955d83f1-36f4-44a9-ab96-874530002630",
  "assignment_id": "b0a1da79-e41b-4450-97ba-bdbbf7aef8d9",
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
  "arrived_at": "2026-10-31T17:15:57.232597Z",
  "started_at": "2026-10-31T17:15:57.451747Z",
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
  "session_id": "d04526c9-accb-410d-be60-682084bf481f",
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
  "last_heartbeat_at": "2026-10-31T17:15:56.974959Z",
  "last_location_at": "2026-10-31T17:15:56.974959Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d04526c9-accb-410d-be60-682084bf481f/close` → **200**

```json
{
  "command_id": "70f53001-c955-4788-88e9-fd6286decbfe",
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
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793467090739E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793467090789E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.79346709079E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793467090742E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.79346709079E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
