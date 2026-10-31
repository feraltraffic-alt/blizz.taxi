# Fault tests (2026-10-31T18:07:37Z, b6b39a4, break: payment)

## Payment: the bank charges a card tip, the server dies before it stores the answer

Server start 1, armed at `payment.after-send:TIP`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679202975",
  "device_ref": "sandbox-14668"
}
```

```json
{
  "challenge_id": "9905cda5-0701-4f94-bf4f-13a8e814eed6",
  "expires_at": "2026-10-31T18:12:50.942308131Z",
  "resend_available_at": "2026-10-31T18:07:51.942308131Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679202975` → **200**

```json
{
  "phone": "+380679202975",
  "audience": "CLIENT",
  "code": "112762",
  "sent_at": "2026-10-31T18:07:50.956361566Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9905cda5-0701-4f94-bf4f-13a8e814eed6",
  "code": "112762",
  "device_ref": "sandbox-14668"
}
```

```json
{
  "session_id": "e1fe0d14-a7d7-4b8b-8c9e-c4e8ca3756c2",
  "subject": {
    "type": "CLIENT",
    "id": "a3619e35-2a9b-4adf-9c6b-1db6a81219a7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzYxOWUzNS0yYTliLTRhZGYtOWM2Yi0xZGI2YTgxMjE5YTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDcwOTc5LCJpYXQiOjE3OTM0NzAwNzksImp0aSI6ImUzZDQ5NDcxLTBmODItNDFlMC1hYzNiLTZlNzgwMTE2OGRkOSIsInNpZCI6ImUxZmUwZDE0LWE3ZDctNGI4Yi04YzllLWM0ZThjYTM3NTZjMiJ9.YBGjwhapgiP4kY_zsvMcH5jAZ7HU2k-irQT9hW_8GGg",
  "access_expires_at": "2026-10-31T18:22:59.62564712Z",
  "refresh_token": "0hlkNGTllpQ9pSvFFg08nTW94mEgKEUgL1BcdxEpOtA",
  "refresh_expires_at": "2026-11-30T18:07:59.623318121Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "49fac9f5-befc-4f36-851e-74dde1376abe",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "c17ae898-1bd2-415c-89a0-9226bcf07730",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-c17ae898-1bd2-415c-89a0-9226bcf07730",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "fa70b27169a89a37c36b340b57882c1d",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=c17ae898-1bd2-415c-89a0-9226bcf07730",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380679202975"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=c17ae898-1bd2-415c-89a0-9226bcf07730",
  "expires_at": "2026-10-31T18:38:00.004937Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/c17ae898-1bd2-415c-89a0-9226bcf07730` → **200**

```json
{
  "id": "c17ae898-1bd2-415c-89a0-9226bcf07730",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-31T18:38:00.004937Z",
  "card": {
    "id": "9cfc0e19-fb22-41c8-b655-a774aa46efd0",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8664",
    "card_type": "Visa",
    "created_at": "2026-10-31T18:08:00.34557Z"
  },
  "failure_reason": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-27037"
}
```

```json
{
  "challenge_id": "e17f6bae-d1c1-474f-aaed-1eddac6c622e",
  "expires_at": "2026-10-31T18:13:00.682581901Z",
  "resend_available_at": "2026-10-31T18:08:01.682581901Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "063881",
  "sent_at": "2026-10-31T18:08:00.687988414Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e17f6bae-d1c1-474f-aaed-1eddac6c622e",
  "code": "063881",
  "device_ref": "sandbox-27037"
}
```

```json
{
  "session_id": "06679c38-faf3-46e7-8dac-2d6ea967940c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3MDk4MSwiaWF0IjoxNzkzNDcwMDgxLCJqdGkiOiI1NmE5YWU3MC1mMjAyLTQyNzktODY4Ni1jYzRhOGI1NTI0MmYiLCJzaWQiOiIwNjY3OWMzOC1mYWYzLTQ2ZTctOGRhYy0yZDZlYTk2Nzk0MGMifQ.XY8TUFWrIQhQJU9FPEy0u18By06fbWqyS1EjQat0kfc",
  "access_expires_at": "2026-10-31T18:23:01.031381536Z",
  "refresh_token": "U2gc34aTGFftPHSLFOmt_cY3LX5r1lM7I7M_KqmJo-w",
  "refresh_expires_at": "2026-11-30T18:08:01.030401387Z",
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
  "command_id": "a7d63889-5a98-4067-95b1-bd300ecdba24",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T18:08:01Z",
    "sequence": 1793470081690
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e75e2537-6e62-468e-a6a1-8b8664e5f6f9",
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
  "last_heartbeat_at": "2026-10-31T18:08:01.872803Z",
  "last_location_at": "2026-10-31T18:08:01.872803Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5a2cd2f6-49bc-45eb-a068-3fff043dd485",
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
  "id": "0ce74b47-91a5-41be-97a7-c6a6fb264e28",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T18:13:02.253422Z",
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
  "command_id": "c274a2a1-68f7-4bcf-9bf2-46e85b11cbb8",
  "quote_id": "0ce74b47-91a5-41be-97a7-c6a6fb264e28",
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
  "id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a3619e35-2a9b-4adf-9c6b-1db6a81219a7",
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
  "created_at": "2026-10-31T18:08:02.670969Z",
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

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783` → **200**

```json
{
  "id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a3619e35-2a9b-4adf-9c6b-1db6a81219a7",
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
  "created_at": "2026-10-31T18:08:02.670969Z",
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

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783` → **200**

```json
{
  "id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a3619e35-2a9b-4adf-9c6b-1db6a81219a7",
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
  "created_at": "2026-10-31T18:08:02.670969Z",
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
    "id": "e17d10ab-0b12-47bc-bb5d-8d54e7e751dd",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "expires_at": "2026-10-31T18:08:18.163798Z",
    "server_time": "2026-10-31T18:08:04.725138622Z",
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

`POST /api/driver/v1/offers/e17d10ab-0b12-47bc-bb5d-8d54e7e751dd/accept` → **200**

```json
{
  "command_id": "3f0529d8-5ce3-4eb3-af4c-2d40814d66e1"
}
```

```json
{
  "id": "54762fa3-ec3f-49a0-9975-d2ebeb640936",
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a5ee0988-123c-4780-8307-aef0789ca62d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a5ee0988-123c-4780-8307-aef0789ca62d",
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "assignment_id": "54762fa3-ec3f-49a0-9975-d2ebeb640936",
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

`POST /api/driver/v1/work-sessions/e75e2537-6e62-468e-a6a1-8b8664e5f6f9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T18:08:05Z",
    "sequence": 1793470085714
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e75e2537-6e62-468e-a6a1-8b8664e5f6f9",
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
  "last_heartbeat_at": "2026-10-31T18:08:05.741283Z",
  "last_location_at": "2026-10-31T18:08:05.741283Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/a5ee0988-123c-4780-8307-aef0789ca62d/arrive` → **200**

```json
{
  "command_id": "2d39ba4d-7439-4972-87fd-1772eafe3745",
  "expected_version": 0
}
```

```json
{
  "id": "a5ee0988-123c-4780-8307-aef0789ca62d",
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "assignment_id": "54762fa3-ec3f-49a0-9975-d2ebeb640936",
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
  "arrived_at": "2026-10-31T18:08:06.069023Z",
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

`POST /api/driver/v1/trips/a5ee0988-123c-4780-8307-aef0789ca62d/start` → **200**

```json
{
  "command_id": "d6bd320b-2fee-4987-86a4-0f4fb13f519a",
  "expected_version": 1
}
```

```json
{
  "id": "a5ee0988-123c-4780-8307-aef0789ca62d",
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "assignment_id": "54762fa3-ec3f-49a0-9975-d2ebeb640936",
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
  "arrived_at": "2026-10-31T18:08:06.069023Z",
  "started_at": "2026-10-31T18:08:06.40962Z",
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

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783` → **200**

```json
{
  "id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "a3619e35-2a9b-4adf-9c6b-1db6a81219a7",
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
    "id": "54762fa3-ec3f-49a0-9975-d2ebeb640936",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a5ee0988-123c-4780-8307-aef0789ca62d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T18:08:02.670969Z",
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

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783` → **200**

```json
{
  "id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "a3619e35-2a9b-4adf-9c6b-1db6a81219a7",
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
    "id": "54762fa3-ec3f-49a0-9975-d2ebeb640936",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a5ee0988-123c-4780-8307-aef0789ca62d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T18:08:02.670969Z",
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

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783` → **200**

```json
{
  "id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "a3619e35-2a9b-4adf-9c6b-1db6a81219a7",
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
    "id": "54762fa3-ec3f-49a0-9975-d2ebeb640936",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a5ee0988-123c-4780-8307-aef0789ca62d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T18:08:02.670969Z",
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

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": true,
  "tip": null
}
```

Tip 1600 on order 667e411d-8625-4dfd-885c-43c57d94a783; the bank journal has 5 lines before it.
Crash point payment.after-send:TIP reached: halting as kill -9 would

The server halted at its crash point (exit 137).

Server start 2.

The worker asks the bank about the operation once its 2-minute lease has run out.

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

`GET /api/rider/v1/orders/667e411d-8625-4dfd-885c-43c57d94a783/tip` → **200**

```json
{
  "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T18:08:06.749211Z",
  "open": false,
  "tip": {
    "id": "eed329bc-edab-4ba7-b4ab-5a92bd769da0",
    "order_id": "667e411d-8625-4dfd-885c-43c57d94a783",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-31T18:08:10.106079Z"
  }
}
```

Charges the bank received for the tip: **2**.

**The tip was charged 2 times.**
