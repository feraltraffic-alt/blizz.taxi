# Fault tests (2026-10-31T18:07:22Z, b6b39a4, break: none)

## Payment: the bank charges a card tip, the server dies before it stores the answer

Server start 1, armed at `payment.after-send:TIP`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675004367",
  "device_ref": "sandbox-6607"
}
```

```json
{
  "challenge_id": "64a939d8-ab52-4fa3-8f3f-3ca36002d12f",
  "expires_at": "2026-10-31T18:12:31.037289363Z",
  "resend_available_at": "2026-10-31T18:07:32.037289363Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675004367` → **200**

```json
{
  "phone": "+380675004367",
  "audience": "CLIENT",
  "code": "535348",
  "sent_at": "2026-10-31T18:07:31.046856654Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "64a939d8-ab52-4fa3-8f3f-3ca36002d12f",
  "code": "535348",
  "device_ref": "sandbox-6607"
}
```

```json
{
  "session_id": "af449cc6-f5cf-4b39-b50a-88c3928eb288",
  "subject": {
    "type": "CLIENT",
    "id": "c6d21fb2-2dbe-4356-a245-4f45ef8e9d77"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNmQyMWZiMi0yZGJlLTQzNTYtYTI0NS00ZjQ1ZWY4ZTlkNzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDcwOTU1LCJpYXQiOjE3OTM0NzAwNTUsImp0aSI6IjQ5NzJlZDI1LTM3NjAtNDNmOS1iOWViLTg0YzIwYjkzMjUxZiIsInNpZCI6ImFmNDQ5Y2M2LWY1Y2YtNGIzOS1iNTBhLTg4YzM5MjhlYjI4OCJ9.21K5Gqo2AZx4ASK1PS7qJiUFKdXv0t2FqQJKUx6wL2A",
  "access_expires_at": "2026-10-31T18:22:35.889766685Z",
  "refresh_token": "2C4o30XIr4VFsKOpW4l0QS2JhRm5SC2xLu5hE5qJ5BE",
  "refresh_expires_at": "2026-11-30T18:07:35.888315394Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "9004cbca-f3a2-41e7-a05f-49c670e7d537",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "0e2c4da2-ee06-452d-9125-34f15783e75b",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-0e2c4da2-ee06-452d-9125-34f15783e75b",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "360008a3e3298da3688b14ca24197d6d",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=0e2c4da2-ee06-452d-9125-34f15783e75b",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380675004367"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=0e2c4da2-ee06-452d-9125-34f15783e75b",
  "expires_at": "2026-10-31T18:37:36.12785Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/0e2c4da2-ee06-452d-9125-34f15783e75b` → **200**

```json
{
  "id": "0e2c4da2-ee06-452d-9125-34f15783e75b",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-31T18:37:36.12785Z",
  "card": {
    "id": "0f50ab8e-da70-4641-a8cd-a8680e691e75",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4590",
    "card_type": "Visa",
    "created_at": "2026-10-31T18:07:36.354894Z"
  },
  "failure_reason": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31178"
}
```

```json
{
  "challenge_id": "7d023f00-6d47-41ba-96a0-7e1159a979f1",
  "expires_at": "2026-10-31T18:12:36.568194295Z",
  "resend_available_at": "2026-10-31T18:07:37.568194295Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "932100",
  "sent_at": "2026-10-31T18:07:36.572365071Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7d023f00-6d47-41ba-96a0-7e1159a979f1",
  "code": "932100",
  "device_ref": "sandbox-31178"
}
```

```json
{
  "session_id": "846f30f9-826f-4db6-a642-75501cc9379e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3MDk1NiwiaWF0IjoxNzkzNDcwMDU2LCJqdGkiOiI1ZDkzZDVhOC0zZjczLTQzNjgtOGEzZC0yNjhmZTk2NGE1ZjciLCJzaWQiOiI4NDZmMzBmOS04MjZmLTRkYjYtYTY0Mi03NTUwMWNjOTM3OWUifQ.q8UTKiQ1j0Jg8NLm1PfStR5Ikxjc787e10V--onwYOA",
  "access_expires_at": "2026-10-31T18:22:36.788626988Z",
  "refresh_token": "DbPQFj6Fxshl80sh0QmhvQifQgyps-QzO11MdZtX3gg",
  "refresh_expires_at": "2026-11-30T18:07:36.787892829Z",
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
  "command_id": "ba3c7656-332f-47f1-b102-1940794ed8d6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T18:07:37Z",
    "sequence": 1793470057191
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "068caf76-0ee5-480b-8743-1e34935ac2c1",
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
  "last_heartbeat_at": "2026-10-31T18:07:37.27956Z",
  "last_location_at": "2026-10-31T18:07:37.27956Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4ca4cb23-6a99-49a7-87a4-18a4e595abab",
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
  "id": "5a42693a-4879-4e8a-9e8c-d0b6380fd329",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T18:12:37.511002Z",
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
  "command_id": "4bd51307-49d4-4faa-be57-2f89e5173309",
  "quote_id": "5a42693a-4879-4e8a-9e8c-d0b6380fd329",
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
  "id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c6d21fb2-2dbe-4356-a245-4f45ef8e9d77",
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
  "created_at": "2026-10-31T18:07:37.781042Z",
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

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209` → **200**

```json
{
  "id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c6d21fb2-2dbe-4356-a245-4f45ef8e9d77",
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
  "created_at": "2026-10-31T18:07:37.781042Z",
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

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209` → **200**

```json
{
  "id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c6d21fb2-2dbe-4356-a245-4f45ef8e9d77",
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
  "created_at": "2026-10-31T18:07:37.781042Z",
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
    "id": "fe96ec01-895f-44c6-b247-39b48458430e",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "expires_at": "2026-10-31T18:07:53.546287Z",
    "server_time": "2026-10-31T18:07:39.410669719Z",
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

`POST /api/driver/v1/offers/fe96ec01-895f-44c6-b247-39b48458430e/accept` → **200**

```json
{
  "command_id": "4e34fb37-64b0-4d5c-ab85-9c8c2fc0f2e6"
}
```

```json
{
  "id": "38018571-f856-45c8-a0b5-d06ed012b013",
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "18f0cb03-6e05-4f2d-bf2d-4b18d55ec22a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "18f0cb03-6e05-4f2d-bf2d-4b18d55ec22a",
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "assignment_id": "38018571-f856-45c8-a0b5-d06ed012b013",
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

`POST /api/driver/v1/work-sessions/068caf76-0ee5-480b-8743-1e34935ac2c1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T18:07:40Z",
    "sequence": 1793470060336
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "068caf76-0ee5-480b-8743-1e34935ac2c1",
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
  "last_heartbeat_at": "2026-10-31T18:07:40.055489Z",
  "last_location_at": "2026-10-31T18:07:40.055489Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/18f0cb03-6e05-4f2d-bf2d-4b18d55ec22a/arrive` → **200**

```json
{
  "command_id": "b1e7772f-194b-4dcf-b634-d04e3ff35120",
  "expected_version": 0
}
```

```json
{
  "id": "18f0cb03-6e05-4f2d-bf2d-4b18d55ec22a",
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "assignment_id": "38018571-f856-45c8-a0b5-d06ed012b013",
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
  "arrived_at": "2026-10-31T18:07:40.265014Z",
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

`POST /api/driver/v1/trips/18f0cb03-6e05-4f2d-bf2d-4b18d55ec22a/start` → **200**

```json
{
  "command_id": "cf8b060d-25d4-43e6-9cdb-40a9e27ba0fa",
  "expected_version": 1
}
```

```json
{
  "id": "18f0cb03-6e05-4f2d-bf2d-4b18d55ec22a",
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "assignment_id": "38018571-f856-45c8-a0b5-d06ed012b013",
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
  "arrived_at": "2026-10-31T18:07:40.265014Z",
  "started_at": "2026-10-31T18:07:40.483744Z",
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

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209` → **200**

```json
{
  "id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c6d21fb2-2dbe-4356-a245-4f45ef8e9d77",
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
    "id": "38018571-f856-45c8-a0b5-d06ed012b013",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "18f0cb03-6e05-4f2d-bf2d-4b18d55ec22a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T18:07:37.781042Z",
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

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209` → **200**

```json
{
  "id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c6d21fb2-2dbe-4356-a245-4f45ef8e9d77",
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
    "id": "38018571-f856-45c8-a0b5-d06ed012b013",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "18f0cb03-6e05-4f2d-bf2d-4b18d55ec22a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T18:07:37.781042Z",
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

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209` → **200**

```json
{
  "id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "c6d21fb2-2dbe-4356-a245-4f45ef8e9d77",
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
    "id": "38018571-f856-45c8-a0b5-d06ed012b013",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "18f0cb03-6e05-4f2d-bf2d-4b18d55ec22a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T18:07:37.781042Z",
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

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": true,
  "tip": null
}
```

Tip 1600 on order 6e99fb47-6287-45f0-aad7-dfb3cb340209; the bank journal has 5 lines before it.
Crash point payment.after-send:TIP reached: halting as kill -9 would

The server halted at its crash point (exit 137).

Server start 2.

The worker asks the bank about the operation once its 2-minute lease has run out.

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
  }
}
```

`GET /api/rider/v1/orders/6e99fb47-6287-45f0-aad7-dfb3cb340209/tip` → **200**

```json
{
  "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:07:40.719027Z",
  "open": false,
  "tip": {
    "id": "2ff0e1eb-733d-4f96-b80e-b53664f54cb1",
    "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-31T18:07:43.549754Z"
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
      "balance_minor": 10539
    }
  ],
  "entries": [
    {
      "id": "774f4102-ad96-4c6a-bd9c-35ff887b6f20",
      "at": "2026-10-31T18:09:44.743197Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 1600,
      "reason": "Tip for the driver",
      "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
      "counterpart_id": null
    },
    {
      "id": "a91bb45f-8d82-46d5-9119-cdbda45a87e7",
      "at": "2026-10-31T18:07:41.678434Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 8939,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "6e99fb47-6287-45f0-aad7-dfb3cb340209",
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
  "session_id": "068caf76-0ee5-480b-8743-1e34935ac2c1",
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
  "last_heartbeat_at": "2026-10-31T18:07:40.055489Z",
  "last_location_at": "2026-10-31T18:07:40.055489Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/068caf76-0ee5-480b-8743-1e34935ac2c1/close` → **200**

```json
{
  "command_id": "2da12308-22fb-4ee2-b2ce-1630c5e6f597",
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
  "phone": "+380676108239",
  "device_ref": "sandbox-9436"
}
```

```json
{
  "challenge_id": "e1f46c57-214b-4d82-ac15-e7e4bc3de646",
  "expires_at": "2026-10-31T18:14:54.478497467Z",
  "resend_available_at": "2026-10-31T18:09:55.478497467Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676108239` → **200**

```json
{
  "phone": "+380676108239",
  "audience": "CLIENT",
  "code": "845211",
  "sent_at": "2026-10-31T18:09:54.488094681Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e1f46c57-214b-4d82-ac15-e7e4bc3de646",
  "code": "845211",
  "device_ref": "sandbox-9436"
}
```

```json
{
  "session_id": "54e90b6a-1a56-4873-9757-b1aa31afe93b",
  "subject": {
    "type": "CLIENT",
    "id": "a9c1af83-eeef-404c-8b60-323654fba082"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWMxYWY4My1lZWVmLTQwNGMtOGI2MC0zMjM2NTRmYmEwODIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDcxMDk0LCJpYXQiOjE3OTM0NzAxOTQsImp0aSI6Ijk3ZjBlM2U4LTdhZTgtNGI3OC1hZDBhLTNlMGU2ZmE5NzBlOCIsInNpZCI6IjU0ZTkwYjZhLTFhNTYtNDg3My05NzU3LWIxYWEzMWFmZTkzYiJ9.4gc7uwcEw8-hzFHYUohLQ0xc-9q0Qn7QL4SVw3YWzX0",
  "access_expires_at": "2026-10-31T18:24:54.740632799Z",
  "refresh_token": "hczgWS5vLcXAyQs0rP025zZ1Ecm8ywZvnN2DloCwyMY",
  "refresh_expires_at": "2026-11-30T18:09:54.73863589Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6285"
}
```

```json
{
  "challenge_id": "15ab2cfe-54e7-43bb-b593-f4532ac1ddd5",
  "expires_at": "2026-10-31T18:14:54.972544892Z",
  "resend_available_at": "2026-10-31T18:09:55.972544892Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "097131",
  "sent_at": "2026-10-31T18:09:54.977253869Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "15ab2cfe-54e7-43bb-b593-f4532ac1ddd5",
  "code": "097131",
  "device_ref": "sandbox-6285"
}
```

```json
{
  "session_id": "400d2511-2325-437d-9625-dfe59684ed52",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3MTA5NSwiaWF0IjoxNzkzNDcwMTk1LCJqdGkiOiI1YTFlODY1MC1lMzM2LTRlNDYtYjE3Mi03OTIyYmMyMmFhMjAiLCJzaWQiOiI0MDBkMjUxMS0yMzI1LTQzN2QtOTYyNS1kZmU1OTY4NGVkNTIifQ.bsrm36TGeaZYImOHlA8iNuvBdYVwXipGAjoavr9B4Ys",
  "access_expires_at": "2026-10-31T18:24:55.196839738Z",
  "refresh_token": "Y7dTe59f8MWRN3SauR5VfxFF7JR-cr7NBg0qQUkVc3Q",
  "refresh_expires_at": "2026-11-30T18:09:55.195953344Z",
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
  "command_id": "2a84a1bd-e16e-4810-a06d-96f8d4f0bc18",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T18:09:55Z",
    "sequence": 1793470195615
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9931e348-8cc5-49e8-bb08-0927a93aa1c9",
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
  "last_heartbeat_at": "2026-10-31T18:09:55.668254Z",
  "last_location_at": "2026-10-31T18:09:55.668254Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "da070476-25b0-49be-8b6b-5d6a656ea22c",
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
  "id": "274960d2-c726-4e17-afbf-558fa2594f3c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T18:14:55.921975Z",
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
  "command_id": "65d8b04f-0419-4df1-827a-42220c3f1710",
  "quote_id": "274960d2-c726-4e17-afbf-558fa2594f3c",
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
  "id": "03164d61-fb1d-4bbb-9a56-667ca35467e7",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a9c1af83-eeef-404c-8b60-323654fba082",
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
  "created_at": "2026-10-31T18:09:56.178343Z",
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
    "id": "c7ec4148-c225-47c2-b5c1-f780db8c5923",
    "order_id": "03164d61-fb1d-4bbb-9a56-667ca35467e7",
    "expires_at": "2026-10-31T18:10:11.186022Z",
    "server_time": "2026-10-31T18:09:56.429048321Z",
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

`POST /api/driver/v1/offers/c7ec4148-c225-47c2-b5c1-f780db8c5923/accept` → **200**

```json
{
  "command_id": "881208c9-8ad7-4934-9be6-fd2caecb49fe"
}
```

```json
{
  "id": "ef106176-5253-49ee-baa0-8c1d20df05cc",
  "order_id": "03164d61-fb1d-4bbb-9a56-667ca35467e7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "67928d43-0cad-4995-a19b-c026fc9473c5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "67928d43-0cad-4995-a19b-c026fc9473c5",
  "order_id": "03164d61-fb1d-4bbb-9a56-667ca35467e7",
  "assignment_id": "ef106176-5253-49ee-baa0-8c1d20df05cc",
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

`POST /api/driver/v1/work-sessions/9931e348-8cc5-49e8-bb08-0927a93aa1c9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T18:09:57Z",
    "sequence": 1793470197680
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9931e348-8cc5-49e8-bb08-0927a93aa1c9",
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
  "last_heartbeat_at": "2026-10-31T18:09:57.091185Z",
  "last_location_at": "2026-10-31T18:09:57.091185Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/67928d43-0cad-4995-a19b-c026fc9473c5/arrive` → **200**

```json
{
  "command_id": "9101abde-c46b-4c15-a164-ad07490f7efe",
  "expected_version": 0
}
```

```json
{
  "id": "67928d43-0cad-4995-a19b-c026fc9473c5",
  "order_id": "03164d61-fb1d-4bbb-9a56-667ca35467e7",
  "assignment_id": "ef106176-5253-49ee-baa0-8c1d20df05cc",
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
  "arrived_at": "2026-10-31T18:09:57.306585Z",
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

`POST /api/driver/v1/trips/67928d43-0cad-4995-a19b-c026fc9473c5/start` → **200**

```json
{
  "command_id": "0378c5eb-1d8e-474e-97fd-2df6b0f31980",
  "expected_version": 1
}
```

```json
{
  "id": "67928d43-0cad-4995-a19b-c026fc9473c5",
  "order_id": "03164d61-fb1d-4bbb-9a56-667ca35467e7",
  "assignment_id": "ef106176-5253-49ee-baa0-8c1d20df05cc",
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
  "arrived_at": "2026-10-31T18:09:57.306585Z",
  "started_at": "2026-10-31T18:09:57.518374Z",
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

TripCompleted a993db59-4186-44d8-bf7d-619b1bc792b3: PENDING after the crash.

Server start 4.

Consumers of the crashed event: `backoffice.problem-queues finance.trip-fare-posting finance.wallet-order-settlement notification.order-live-feed notification.push-feed operator-bonuses payments.trip-capture promotions.driver-trips promotions.trip-rewards`.

Live messages of the crashed event: **1** (sent before the crash, not again after it).

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9931e348-8cc5-49e8-bb08-0927a93aa1c9",
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
  "last_heartbeat_at": "2026-10-31T18:09:57.091185Z",
  "last_location_at": "2026-10-31T18:09:57.091185Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/9931e348-8cc5-49e8-bb08-0927a93aa1c9/close` → **200**

```json
{
  "command_id": "447899f3-e7fc-4aec-8189-39489da8d476",
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
  "phone": "+380673480386",
  "device_ref": "sandbox-29428"
}
```

```json
{
  "challenge_id": "1d2278ac-6115-4dd9-bd9f-b2b5e6b43a8b",
  "expires_at": "2026-10-31T18:15:40.923120017Z",
  "resend_available_at": "2026-10-31T18:10:41.923120017Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673480386` → **200**

```json
{
  "phone": "+380673480386",
  "audience": "CLIENT",
  "code": "425305",
  "sent_at": "2026-10-31T18:10:40.933421124Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1d2278ac-6115-4dd9-bd9f-b2b5e6b43a8b",
  "code": "425305",
  "device_ref": "sandbox-29428"
}
```

```json
{
  "session_id": "59dfdd36-b6df-4fca-b71b-1583786e6bc0",
  "subject": {
    "type": "CLIENT",
    "id": "16213892-415a-4232-9246-9f74bb171710"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNjIxMzg5Mi00MTVhLTQyMzItOTI0Ni05Zjc0YmIxNzE3MTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDcxMTQxLCJpYXQiOjE3OTM0NzAyNDEsImp0aSI6ImJjNmVjZTE0LTc1ZDgtNGRiNC1iODQwLTQ5NTQxMDdiY2ViOCIsInNpZCI6IjU5ZGZkZDM2LWI2ZGYtNGZjYS1iNzFiLTE1ODM3ODZlNmJjMCJ9.CISB90FO28Lf7KQSuX--J55ZCieEpYZFgSZWLshXQ8k",
  "access_expires_at": "2026-10-31T18:25:41.179473213Z",
  "refresh_token": "oTVmSkEk8EUp4mZWBoGXTjUB83mGpEOZ8B7aLhWO2RM",
  "refresh_expires_at": "2026-11-30T18:10:41.17755055Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-11759"
}
```

```json
{
  "challenge_id": "655e1b31-e988-4a87-9a62-8b137361ce2f",
  "expires_at": "2026-10-31T18:15:41.402208786Z",
  "resend_available_at": "2026-10-31T18:10:42.402208786Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "278565",
  "sent_at": "2026-10-31T18:10:41.406350681Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "655e1b31-e988-4a87-9a62-8b137361ce2f",
  "code": "278565",
  "device_ref": "sandbox-11759"
}
```

```json
{
  "session_id": "7837564a-bb95-427d-a6b1-913900034548",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3MTE0MSwiaWF0IjoxNzkzNDcwMjQxLCJqdGkiOiJiNjRkMjdjZC1kYjNlLTRmYTctYmE1My1mNDZkMDQ0ZjA3MzIiLCJzaWQiOiI3ODM3NTY0YS1iYjk1LTQyN2QtYTZiMS05MTM5MDAwMzQ1NDgifQ.7Lw3gmtI1xVIwVjbGpstxTQkNCPJFc3QC55q_IW8rGo",
  "access_expires_at": "2026-10-31T18:25:41.622703494Z",
  "refresh_token": "WWioiUcC95YQLUJ6b0tg5VL4Fo5DqeWsTUibb2nvLww",
  "refresh_expires_at": "2026-11-30T18:10:41.621856325Z",
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
  "command_id": "59121f29-0475-4d4c-9e11-5ab23e13dae7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T18:10:42Z",
    "sequence": 1793470242365
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8d5c7afc-e721-45b9-85cd-1fc36b32b8d6",
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
  "last_heartbeat_at": "2026-10-31T18:10:42.088824Z",
  "last_location_at": "2026-10-31T18:10:42.088824Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2ae440cb-d465-496a-9ab4-a65c42fabe45",
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
  "id": "f111ee52-de83-4a7e-8c11-f60f48350327",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T18:15:42.364533Z",
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
  "command_id": "8d75f639-1d1e-454c-af0a-ec654426beaf",
  "quote_id": "f111ee52-de83-4a7e-8c11-f60f48350327",
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
  "id": "426c98fd-b838-470a-998c-2352ba073fd3",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "16213892-415a-4232-9246-9f74bb171710",
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
  "created_at": "2026-10-31T18:10:42.614168Z",
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
    "id": "2dd7f335-fb26-4642-95cd-7ff9a32e59eb",
    "order_id": "426c98fd-b838-470a-998c-2352ba073fd3",
    "expires_at": "2026-10-31T18:10:57.62305Z",
    "server_time": "2026-10-31T18:10:42.867094152Z",
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

`POST /api/driver/v1/offers/2dd7f335-fb26-4642-95cd-7ff9a32e59eb/accept` → **200**

```json
{
  "command_id": "60d56d07-bdba-4139-9b0d-3653dd9cd2c9"
}
```

```json
{
  "id": "e9727feb-c354-44d6-b285-1c5e2e2d1f02",
  "order_id": "426c98fd-b838-470a-998c-2352ba073fd3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "feb225ec-a31b-48eb-8ce5-09613e33182b",
  "trip_phase": "TO_PICKUP"
}
```

The retry with the same command: HTTP 200.

One assignment, and the retry returned it.

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "feb225ec-a31b-48eb-8ce5-09613e33182b",
  "order_id": "426c98fd-b838-470a-998c-2352ba073fd3",
  "assignment_id": "e9727feb-c354-44d6-b285-1c5e2e2d1f02",
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

`POST /api/driver/v1/work-sessions/8d5c7afc-e721-45b9-85cd-1fc36b32b8d6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T18:10:50Z",
    "sequence": 1793470250188
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8d5c7afc-e721-45b9-85cd-1fc36b32b8d6",
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
  "last_heartbeat_at": "2026-10-31T18:10:50.253723Z",
  "last_location_at": "2026-10-31T18:10:50.253723Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/feb225ec-a31b-48eb-8ce5-09613e33182b/arrive` → **200**

```json
{
  "command_id": "d01e4f4f-d95d-466e-8098-4864ac07f05f",
  "expected_version": 0
}
```

```json
{
  "id": "feb225ec-a31b-48eb-8ce5-09613e33182b",
  "order_id": "426c98fd-b838-470a-998c-2352ba073fd3",
  "assignment_id": "e9727feb-c354-44d6-b285-1c5e2e2d1f02",
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
  "arrived_at": "2026-10-31T18:10:50.483355Z",
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

`POST /api/driver/v1/trips/feb225ec-a31b-48eb-8ce5-09613e33182b/start` → **200**

```json
{
  "command_id": "acd5fb23-372f-493f-8ec3-d86e6c981776",
  "expected_version": 1
}
```

```json
{
  "id": "feb225ec-a31b-48eb-8ce5-09613e33182b",
  "order_id": "426c98fd-b838-470a-998c-2352ba073fd3",
  "assignment_id": "e9727feb-c354-44d6-b285-1c5e2e2d1f02",
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
  "arrived_at": "2026-10-31T18:10:50.483355Z",
  "started_at": "2026-10-31T18:10:50.697139Z",
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
  "session_id": "8d5c7afc-e721-45b9-85cd-1fc36b32b8d6",
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
  "last_heartbeat_at": "2026-10-31T18:10:50.253723Z",
  "last_location_at": "2026-10-31T18:10:50.253723Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8d5c7afc-e721-45b9-85cd-1fc36b32b8d6/close` → **200**

```json
{
  "command_id": "8295cd78-9f1a-4e49-bcdf-8ff5af6a22d5",
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

Answers during the cut: 1353×201 11×429 10×503 

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672005159",
  "device_ref": "sandbox-14934"
}
```

```json
{
  "challenge_id": "f847d210-8daf-4b4a-bd3e-07b0f1ae21f1",
  "expires_at": "2026-10-31T18:16:29.030168508Z",
  "resend_available_at": "2026-10-31T18:11:30.030168508Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672005159` → **200**

```json
{
  "phone": "+380672005159",
  "audience": "CLIENT",
  "code": "918208",
  "sent_at": "2026-10-31T18:11:29.032077136Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f847d210-8daf-4b4a-bd3e-07b0f1ae21f1",
  "code": "918208",
  "device_ref": "sandbox-14934"
}
```

```json
{
  "session_id": "ea1b4418-828c-4812-9db2-5a952aef4f53",
  "subject": {
    "type": "CLIENT",
    "id": "36a375a4-e08e-4a57-97cd-3f9162dd7f88"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNmEzNzVhNC1lMDhlLTRhNTctOTdjZC0zZjkxNjJkZDdmODgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDcxMTg5LCJpYXQiOjE3OTM0NzAyODksImp0aSI6ImYwOTlhMzE5LTUyYjctNDIzZi05OGRkLThiZDQ1OGM4ZjExYSIsInNpZCI6ImVhMWI0NDE4LTgyOGMtNDgxMi05ZGIyLTVhOTUyYWVmNGY1MyJ9.AfSIR6yTFZn59FbHTV0OpZLP2JslNYwk6x4hMLeiFU0",
  "access_expires_at": "2026-10-31T18:26:29.269897964Z",
  "refresh_token": "IS_1LLe6_2lX7SxQluzYuqxCfNzSW7aHhzhOIyhavRw",
  "refresh_expires_at": "2026-11-30T18:11:29.268461034Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-5766"
}
```

```json
{
  "challenge_id": "30ca4c51-9d75-4f7c-a7c3-dd0d6480330b",
  "expires_at": "2026-10-31T18:16:29.494039978Z",
  "resend_available_at": "2026-10-31T18:11:30.494039978Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "644762",
  "sent_at": "2026-10-31T18:11:29.496279697Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "30ca4c51-9d75-4f7c-a7c3-dd0d6480330b",
  "code": "644762",
  "device_ref": "sandbox-5766"
}
```

```json
{
  "session_id": "bbb3cfe7-5aac-48af-b934-52cf269574e0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3MTE4OSwiaWF0IjoxNzkzNDcwMjg5LCJqdGkiOiI1MmQ3YmVjOC04ZTllLTQ4MTMtOTk1Mi0yMDA0MjA3MzAyYmQiLCJzaWQiOiJiYmIzY2ZlNy01YWFjLTQ4YWYtYjkzNC01MmNmMjY5NTc0ZTAifQ.vzx6nrZ912jUzb9M6eiDxTMqaEWG05qQ6JyKZt7LVjU",
  "access_expires_at": "2026-10-31T18:26:29.709395311Z",
  "refresh_token": "YXhmIn3c0AznieT-N5LmE4rBRFB-zehj9QSSyeSRa1A",
  "refresh_expires_at": "2026-11-30T18:11:29.707661348Z",
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
  "command_id": "2227125d-cfce-43fc-8a65-28b0eedccca0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T18:11:30Z",
    "sequence": 1793470290119
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "564d31cb-ef44-4186-9258-d4869ab91fcc",
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
  "last_heartbeat_at": "2026-10-31T18:11:30.168489Z",
  "last_location_at": "2026-10-31T18:11:30.168489Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cefc1206-85cf-4f8b-a323-d1e638779b0f",
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
  "id": "cfa0b465-07a5-4fb5-ab55-81c1cd2c38a5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T18:16:30.451466Z",
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
  "command_id": "715fa9c4-ccc8-4846-aefa-7f2340ad1acd",
  "quote_id": "cfa0b465-07a5-4fb5-ab55-81c1cd2c38a5",
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
  "id": "5f6af8a8-69c9-4928-8a46-726b664cd56d",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "36a375a4-e08e-4a57-97cd-3f9162dd7f88",
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
  "created_at": "2026-10-31T18:11:30.740397Z",
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
    "id": "c34c8fcc-3cfa-49f0-9e47-fb1927d05b7f",
    "order_id": "5f6af8a8-69c9-4928-8a46-726b664cd56d",
    "expires_at": "2026-10-31T18:11:45.747651Z",
    "server_time": "2026-10-31T18:11:30.998554393Z",
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

`POST /api/driver/v1/offers/c34c8fcc-3cfa-49f0-9e47-fb1927d05b7f/accept` → **200**

```json
{
  "command_id": "d8ce7f0c-0b50-417d-85ee-4d8166fab3ae"
}
```

```json
{
  "id": "5d9ad057-ce78-44bf-ba69-b14067c72836",
  "order_id": "5f6af8a8-69c9-4928-8a46-726b664cd56d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c4bf3c3f-fe4a-47f1-9d71-47ff3b3e11b3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c4bf3c3f-fe4a-47f1-9d71-47ff3b3e11b3",
  "order_id": "5f6af8a8-69c9-4928-8a46-726b664cd56d",
  "assignment_id": "5d9ad057-ce78-44bf-ba69-b14067c72836",
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

`POST /api/driver/v1/work-sessions/564d31cb-ef44-4186-9258-d4869ab91fcc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T18:11:31Z",
    "sequence": 1793470291650
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "564d31cb-ef44-4186-9258-d4869ab91fcc",
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
  "last_heartbeat_at": "2026-10-31T18:11:31.671128Z",
  "last_location_at": "2026-10-31T18:11:31.671128Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/c4bf3c3f-fe4a-47f1-9d71-47ff3b3e11b3/arrive` → **200**

```json
{
  "command_id": "555ec801-7ab9-4d81-83bd-234aa6717493",
  "expected_version": 0
}
```

```json
{
  "id": "c4bf3c3f-fe4a-47f1-9d71-47ff3b3e11b3",
  "order_id": "5f6af8a8-69c9-4928-8a46-726b664cd56d",
  "assignment_id": "5d9ad057-ce78-44bf-ba69-b14067c72836",
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
  "arrived_at": "2026-10-31T18:11:31.87755Z",
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

`POST /api/driver/v1/trips/c4bf3c3f-fe4a-47f1-9d71-47ff3b3e11b3/start` → **200**

```json
{
  "command_id": "30a5e4e5-c4d0-4262-a2bf-e94516bcca8f",
  "expected_version": 1
}
```

```json
{
  "id": "c4bf3c3f-fe4a-47f1-9d71-47ff3b3e11b3",
  "order_id": "5f6af8a8-69c9-4928-8a46-726b664cd56d",
  "assignment_id": "5d9ad057-ce78-44bf-ba69-b14067c72836",
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
  "arrived_at": "2026-10-31T18:11:31.87755Z",
  "started_at": "2026-10-31T18:11:32.086507Z",
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
  "session_id": "564d31cb-ef44-4186-9258-d4869ab91fcc",
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
  "last_heartbeat_at": "2026-10-31T18:11:31.671128Z",
  "last_location_at": "2026-10-31T18:11:31.671128Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/564d31cb-ef44-4186-9258-d4869ab91fcc/close` → **200**

```json
{
  "command_id": "b6e02bde-8c1e-433a-a8bb-1a0eb64340ec",
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
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793470424727E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793470424762E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793470424763E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793470424731E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793470424764E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
