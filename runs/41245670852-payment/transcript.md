# Fault tests (2026-10-31T21:54:16Z, 234f73b, break: payment)

## Payment: the bank charges a card tip, the server dies before it stores the answer

Server start 1, armed at `payment.after-send:TIP`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678700284",
  "device_ref": "sandbox-10462"
}
```

```json
{
  "challenge_id": "3704f5fd-59f4-4f17-aedc-21b765fe3858",
  "expires_at": "2026-10-31T21:59:29.76366097Z",
  "resend_available_at": "2026-10-31T21:54:30.76366097Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678700284` → **200**

```json
{
  "phone": "+380678700284",
  "audience": "CLIENT",
  "code": "424929",
  "sent_at": "2026-10-31T21:54:29.779884257Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3704f5fd-59f4-4f17-aedc-21b765fe3858",
  "code": "424929",
  "device_ref": "sandbox-10462"
}
```

```json
{
  "session_id": "6fab0c78-df0a-4108-9272-90f8b0376641",
  "subject": {
    "type": "CLIENT",
    "id": "17f56aa3-ef48-428f-9b36-1d881cb246c8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxN2Y1NmFhMy1lZjQ4LTQyOGYtOWIzNi0xZDg4MWNiMjQ2YzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDg0NTc5LCJpYXQiOjE3OTM0ODM2NzksImp0aSI6IjJmYTlmOGFjLTgzM2QtNGNjOC1hYWI2LWQzYWFiMWQyZmU4MyIsInNpZCI6IjZmYWIwYzc4LWRmMGEtNDEwOC05MjcyLTkwZjhiMDM3NjY0MSJ9.aJF-cDvWNrCV4N7F7W3mibUbp45YZdsVn1XN8zSiYFs",
  "access_expires_at": "2026-10-31T22:09:39.729310117Z",
  "refresh_token": "y0M7jsGid2RB2EJAwc3mgEUMGmhbdzPOmCXbKfwHdec",
  "refresh_expires_at": "2026-11-30T21:54:39.726557967Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "60330388-1c8d-4582-861f-7540b363000a",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "eda8b494-458a-4a83-bcfb-f8d916e4b777",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-eda8b494-458a-4a83-bcfb-f8d916e4b777",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "e78f03d17b745afc67e16ab968897eac",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=eda8b494-458a-4a83-bcfb-f8d916e4b777",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380678700284"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=eda8b494-458a-4a83-bcfb-f8d916e4b777",
  "expires_at": "2026-10-31T22:24:40.137525Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/eda8b494-458a-4a83-bcfb-f8d916e4b777` → **200**

```json
{
  "id": "eda8b494-458a-4a83-bcfb-f8d916e4b777",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-31T22:24:40.137525Z",
  "card": {
    "id": "48f7250b-bdf6-4c50-a5d6-54916b5e6b71",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1201",
    "card_type": "Visa",
    "created_at": "2026-10-31T21:54:40.484458Z"
  },
  "failure_reason": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-24922"
}
```

```json
{
  "challenge_id": "4f1bcb71-5390-4f09-9b53-c74f3c0e6de5",
  "expires_at": "2026-10-31T21:59:40.838763363Z",
  "resend_available_at": "2026-10-31T21:54:41.838763363Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "488845",
  "sent_at": "2026-10-31T21:54:40.843737059Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f1bcb71-5390-4f09-9b53-c74f3c0e6de5",
  "code": "488845",
  "device_ref": "sandbox-24922"
}
```

```json
{
  "session_id": "cb63c7b0-c5cb-4c67-8cb3-9dc40e8b9081",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ4NDU4MSwiaWF0IjoxNzkzNDgzNjgxLCJqdGkiOiJiZjNmY2Q3Ny1lNjAxLTRkOGUtYTU3Ny05MTI1YmNiYzdlNDAiLCJzaWQiOiJjYjYzYzdiMC1jNWNiLTRjNjctOGNiMy05ZGM0MGU4YjkwODEifQ.6SFifPEgWTlMKiR8mZ0c5AVFkQcUnzTWgirP20fJJ18",
  "access_expires_at": "2026-10-31T22:09:41.184425678Z",
  "refresh_token": "7eH17qktA4uqhTri0s6MFJl--T0VlizXonRnHTdQitQ",
  "refresh_expires_at": "2026-11-30T21:54:41.183387697Z",
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
  "command_id": "41e039ea-faeb-46d7-b5c1-6c43d859f54b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T21:54:41Z",
    "sequence": 1793483681864
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "16e652be-cd3f-4c2d-bc83-3cd061c54989",
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
  "last_heartbeat_at": "2026-10-31T21:54:41.968602Z",
  "last_location_at": "2026-10-31T21:54:41.968602Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "68bbc8d6-aa1b-4a98-86a9-ee34ea0ade2b",
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
  "id": "a9b5a5ce-8089-4bf0-9248-03c1ee02c598",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T21:59:42.351834Z",
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
  "command_id": "42866775-44ba-4bb3-8032-c7fd4e0ccbf6",
  "quote_id": "a9b5a5ce-8089-4bf0-9248-03c1ee02c598",
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
  "id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "17f56aa3-ef48-428f-9b36-1d881cb246c8",
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
  "created_at": "2026-10-31T21:54:42.786196Z",
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

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32` → **200**

```json
{
  "id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "17f56aa3-ef48-428f-9b36-1d881cb246c8",
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
  "created_at": "2026-10-31T21:54:42.786196Z",
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

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32` → **200**

```json
{
  "id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "17f56aa3-ef48-428f-9b36-1d881cb246c8",
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
  "created_at": "2026-10-31T21:54:42.786196Z",
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
    "id": "6c99d63c-5ab1-49da-8836-83302f36ca5f",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "expires_at": "2026-10-31T21:54:58.459945Z",
    "server_time": "2026-10-31T21:54:44.843858632Z",
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

`POST /api/driver/v1/offers/6c99d63c-5ab1-49da-8836-83302f36ca5f/accept` → **200**

```json
{
  "command_id": "d8b9b403-b2ce-4bbe-bfb0-f4030a1dfb2e"
}
```

```json
{
  "id": "0bcfeaa7-84ba-423d-8013-32da7e13e25a",
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a95b033d-2cf4-42bf-92cd-0c3e95f4135a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a95b033d-2cf4-42bf-92cd-0c3e95f4135a",
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "assignment_id": "0bcfeaa7-84ba-423d-8013-32da7e13e25a",
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

`POST /api/driver/v1/work-sessions/16e652be-cd3f-4c2d-bc83-3cd061c54989/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T21:54:45Z",
    "sequence": 1793483685893
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "16e652be-cd3f-4c2d-bc83-3cd061c54989",
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
  "last_heartbeat_at": "2026-10-31T21:54:45.920888Z",
  "last_location_at": "2026-10-31T21:54:45.920888Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/a95b033d-2cf4-42bf-92cd-0c3e95f4135a/arrive` → **200**

```json
{
  "command_id": "c07172e9-8938-489c-9495-006c6dc0a197",
  "expected_version": 0
}
```

```json
{
  "id": "a95b033d-2cf4-42bf-92cd-0c3e95f4135a",
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "assignment_id": "0bcfeaa7-84ba-423d-8013-32da7e13e25a",
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
  "arrived_at": "2026-10-31T21:54:46.26768Z",
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

`POST /api/driver/v1/trips/a95b033d-2cf4-42bf-92cd-0c3e95f4135a/start` → **200**

```json
{
  "command_id": "2029413e-873d-4bc3-9615-75fb12015c86",
  "expected_version": 1
}
```

```json
{
  "id": "a95b033d-2cf4-42bf-92cd-0c3e95f4135a",
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "assignment_id": "0bcfeaa7-84ba-423d-8013-32da7e13e25a",
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
  "arrived_at": "2026-10-31T21:54:46.26768Z",
  "started_at": "2026-10-31T21:54:46.611217Z",
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

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32` → **200**

```json
{
  "id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "17f56aa3-ef48-428f-9b36-1d881cb246c8",
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
    "id": "0bcfeaa7-84ba-423d-8013-32da7e13e25a",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a95b033d-2cf4-42bf-92cd-0c3e95f4135a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T21:54:42.786196Z",
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

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32` → **200**

```json
{
  "id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "17f56aa3-ef48-428f-9b36-1d881cb246c8",
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
    "id": "0bcfeaa7-84ba-423d-8013-32da7e13e25a",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a95b033d-2cf4-42bf-92cd-0c3e95f4135a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T21:54:42.786196Z",
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

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32` → **200**

```json
{
  "id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "17f56aa3-ef48-428f-9b36-1d881cb246c8",
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
    "id": "0bcfeaa7-84ba-423d-8013-32da7e13e25a",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a95b033d-2cf4-42bf-92cd-0c3e95f4135a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T21:54:42.786196Z",
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

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": true,
  "tip": null
}
```

Tip 1600 on order acdd674e-329e-48b3-83f0-fd22b33adf32; the bank journal has 5 lines before it.
Crash point payment.after-send:TIP reached: halting as kill -9 would

The server halted at its crash point (exit 137).

Server start 2.

The worker asks the bank about the operation once its 2-minute lease has run out.

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

`GET /api/rider/v1/orders/acdd674e-329e-48b3-83f0-fd22b33adf32/tip` → **200**

```json
{
  "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:46.96635Z",
  "open": false,
  "tip": {
    "id": "96c2d4cc-eb52-4801-95dd-2d1329998a36",
    "order_id": "acdd674e-329e-48b3-83f0-fd22b33adf32",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:50.355591Z"
  }
}
```

Charges the bank received for the tip: **2**.

**The tip was charged 2 times.**
