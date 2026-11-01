# Fault tests (2026-11-01T06:37:22Z, 20b07af, break: none)

## Payment: the bank charges a card tip, the server dies before it stores the answer

Server start 1, armed at `payment.after-send:TIP`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675851116",
  "device_ref": "sandbox-28555"
}
```

```json
{
  "challenge_id": "bb72b0a9-612a-487e-81d9-ff27b8920b5e",
  "expires_at": "2026-11-01T06:42:32.499317959Z",
  "resend_available_at": "2026-11-01T06:37:33.499317959Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675851116` → **200**

```json
{
  "phone": "+380675851116",
  "audience": "CLIENT",
  "code": "901217",
  "sent_at": "2026-11-01T06:37:32.513290163Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bb72b0a9-612a-487e-81d9-ff27b8920b5e",
  "code": "901217",
  "device_ref": "sandbox-28555"
}
```

```json
{
  "session_id": "dab25282-8b61-4f0e-86bf-71651a854286",
  "subject": {
    "type": "CLIENT",
    "id": "8b12e805-623c-4055-be8b-d463c915eb89"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YjEyZTgwNS02MjNjLTQwNTUtYmU4Yi1kNDYzYzkxNWViODkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNTE1OTU4LCJpYXQiOjE3OTM1MTUwNTgsImp0aSI6ImExOTE3OTc2LTk1NDUtNGFlNy1iZTU0LTQzMDk3MjUzOGNjNiIsInNpZCI6ImRhYjI1MjgyLThiNjEtNGYwZS04NmJmLTcxNjUxYTg1NDI4NiJ9.XlkOwj05FXkPe3cFtFzNzZpSYAKG6W6fGpqKpKE8KGY",
  "access_expires_at": "2026-11-01T06:52:38.370724164Z",
  "refresh_token": "L47LfPjIe1A3fG8as2a0EX7Jf8OaUjF2bWr2mkNXbmI",
  "refresh_expires_at": "2026-12-01T06:37:38.368206996Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "5476ef8d-b8d8-480c-8695-97f16339ba6f",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b7c99167-a761-4224-a3cc-5677b24d14ab",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b7c99167-a761-4224-a3cc-5677b24d14ab",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "3947a628520ada7db07c5064a31e7438",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b7c99167-a761-4224-a3cc-5677b24d14ab",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380675851116"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b7c99167-a761-4224-a3cc-5677b24d14ab",
  "expires_at": "2026-11-01T07:07:38.657467Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/b7c99167-a761-4224-a3cc-5677b24d14ab` → **200**

```json
{
  "id": "b7c99167-a761-4224-a3cc-5677b24d14ab",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-11-01T07:07:38.657467Z",
  "card": {
    "id": "d00bb9cc-e338-44fa-995c-539156b7c0d6",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3827",
    "card_type": "Visa",
    "created_at": "2026-11-01T06:37:38.911077Z"
  },
  "failure_reason": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10287"
}
```

```json
{
  "challenge_id": "aea7c675-6c95-49ba-8dcb-b1b258a9b0d9",
  "expires_at": "2026-11-01T06:42:39.153790713Z",
  "resend_available_at": "2026-11-01T06:37:40.153790713Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "336804",
  "sent_at": "2026-11-01T06:37:39.158147699Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aea7c675-6c95-49ba-8dcb-b1b258a9b0d9",
  "code": "336804",
  "device_ref": "sandbox-10287"
}
```

```json
{
  "session_id": "5e5b7ed9-87c0-447c-a94c-36f0627bc903",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzUxNTk1OSwiaWF0IjoxNzkzNTE1MDU5LCJqdGkiOiIzYmFjOTVjNS1kYWI1LTQwZjAtYWY1YS01OGNmY2E4NGQ2Y2YiLCJzaWQiOiI1ZTViN2VkOS04N2MwLTQ0N2MtYTk0Yy0zNmYwNjI3YmM5MDMifQ.sA3SBeiLyU35Vd_at38T0ZFvLFZ5IyVByEXqiMNBz-Q",
  "access_expires_at": "2026-11-01T06:52:39.410211679Z",
  "refresh_token": "CK14Ke5QqA427e1rv-DJjb0hC7G04Fk8V-EGhgfW9AQ",
  "refresh_expires_at": "2026-12-01T06:37:39.408896939Z",
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
  "command_id": "7a9b5d34-8b80-48b7-b0c5-dedc3cb5a731",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-11-01T06:37:39Z",
    "sequence": 1793515059873
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "369ec19c-b4f2-4411-82ef-4b07259473ed",
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
  "last_heartbeat_at": "2026-11-01T06:37:39.96974Z",
  "last_location_at": "2026-11-01T06:37:39.96974Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cad972e5-e0c7-47b3-bb11-718c7b8a7aad",
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
  "id": "3d19c2a0-e734-40fd-b3c1-ebf044e67d92",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-11-01T06:42:40.242957Z",
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
  "command_id": "08c689af-506d-4b4c-934f-15d2c9db7851",
  "quote_id": "3d19c2a0-e734-40fd-b3c1-ebf044e67d92",
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
  "id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8b12e805-623c-4055-be8b-d463c915eb89",
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
  "created_at": "2026-11-01T06:37:40.582731Z",
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

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f` → **200**

```json
{
  "id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8b12e805-623c-4055-be8b-d463c915eb89",
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
  "created_at": "2026-11-01T06:37:40.582731Z",
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

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f` → **200**

```json
{
  "id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8b12e805-623c-4055-be8b-d463c915eb89",
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
  "created_at": "2026-11-01T06:37:40.582731Z",
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
    "id": "be38e554-c490-4537-858b-0a2de332e9f6",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "expires_at": "2026-11-01T06:37:56.385916Z",
    "server_time": "2026-11-01T06:37:42.332988177Z",
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

`POST /api/driver/v1/offers/be38e554-c490-4537-858b-0a2de332e9f6/accept` → **200**

```json
{
  "command_id": "bf4934e0-c53e-4dbb-9ef5-57a900d4f056"
}
```

```json
{
  "id": "8201766e-5b11-46b4-b9e4-c8c14ccb3f3f",
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "771d4168-0343-40b8-8dd6-84f919b148f4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "771d4168-0343-40b8-8dd6-84f919b148f4",
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "assignment_id": "8201766e-5b11-46b4-b9e4-c8c14ccb3f3f",
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

`POST /api/driver/v1/work-sessions/369ec19c-b4f2-4411-82ef-4b07259473ed/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-11-01T06:37:43Z",
    "sequence": 1793515063659
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "369ec19c-b4f2-4411-82ef-4b07259473ed",
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
  "last_heartbeat_at": "2026-11-01T06:37:43.089877Z",
  "last_location_at": "2026-11-01T06:37:43.089877Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/771d4168-0343-40b8-8dd6-84f919b148f4/arrive` → **200**

```json
{
  "command_id": "b715f7b7-3499-4eaf-a935-c1f3a2f1bc2a",
  "expected_version": 0
}
```

```json
{
  "id": "771d4168-0343-40b8-8dd6-84f919b148f4",
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "assignment_id": "8201766e-5b11-46b4-b9e4-c8c14ccb3f3f",
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
  "arrived_at": "2026-11-01T06:37:43.333087Z",
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

`POST /api/driver/v1/trips/771d4168-0343-40b8-8dd6-84f919b148f4/start` → **200**

```json
{
  "command_id": "31a10b0b-89aa-40e0-aa90-bc0955143917",
  "expected_version": 1
}
```

```json
{
  "id": "771d4168-0343-40b8-8dd6-84f919b148f4",
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "assignment_id": "8201766e-5b11-46b4-b9e4-c8c14ccb3f3f",
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
  "arrived_at": "2026-11-01T06:37:43.333087Z",
  "started_at": "2026-11-01T06:37:43.608265Z",
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

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f` → **200**

```json
{
  "id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8b12e805-623c-4055-be8b-d463c915eb89",
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
    "id": "8201766e-5b11-46b4-b9e4-c8c14ccb3f3f",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "771d4168-0343-40b8-8dd6-84f919b148f4",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-11-01T06:37:40.582731Z",
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

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f` → **200**

```json
{
  "id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8b12e805-623c-4055-be8b-d463c915eb89",
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
    "id": "8201766e-5b11-46b4-b9e4-c8c14ccb3f3f",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "771d4168-0343-40b8-8dd6-84f919b148f4",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-11-01T06:37:40.582731Z",
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

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f` → **200**

```json
{
  "id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "8b12e805-623c-4055-be8b-d463c915eb89",
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
    "id": "8201766e-5b11-46b4-b9e4-c8c14ccb3f3f",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "771d4168-0343-40b8-8dd6-84f919b148f4",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-11-01T06:37:40.582731Z",
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

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": true,
  "tip": null
}
```

Tip 1600 on order 87e3abf2-6eea-439c-9bfb-037522eb298f; the bank journal has 5 lines before it.
Crash point payment.after-send:TIP reached: halting as kill -9 would

The server halted at its crash point (exit 137).

Server start 2.

The worker asks the bank about the operation once its 2-minute lease has run out.

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
  }
}
```

`GET /api/rider/v1/orders/87e3abf2-6eea-439c-9bfb-037522eb298f/tip` → **200**

```json
{
  "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-02T06:37:43.883885Z",
  "open": false,
  "tip": {
    "id": "55594669-c523-40d1-8500-1fe085074ff8",
    "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-11-01T06:37:46.912542Z"
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
      "id": "f6ca5b40-59c5-4129-9820-7828ad3a3d90",
      "at": "2026-11-01T06:37:44.513889Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 8939,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
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
      "id": "b964e42f-29e8-4c02-a1f1-acc5f434a359",
      "at": "2026-11-01T06:39:50.666913Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 1600,
      "reason": "Tip for the driver",
      "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
      "counterpart_id": null
    },
    {
      "id": "f6ca5b40-59c5-4129-9820-7828ad3a3d90",
      "at": "2026-11-01T06:37:44.513889Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 8939,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "87e3abf2-6eea-439c-9bfb-037522eb298f",
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
  "session_id": "369ec19c-b4f2-4411-82ef-4b07259473ed",
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
  "last_heartbeat_at": "2026-11-01T06:37:43.089877Z",
  "last_location_at": "2026-11-01T06:37:43.089877Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/369ec19c-b4f2-4411-82ef-4b07259473ed/close` → **200**

```json
{
  "command_id": "00c5d8b4-67dc-4785-9b1d-e923c43c737d",
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
  "phone": "+380670092784",
  "device_ref": "sandbox-7379"
}
```

```json
{
  "challenge_id": "7668696c-91ab-4007-9cbb-6e1bdeab6f01",
  "expires_at": "2026-11-01T06:45:02.086090667Z",
  "resend_available_at": "2026-11-01T06:40:03.086090667Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670092784` → **200**

```json
{
  "phone": "+380670092784",
  "audience": "CLIENT",
  "code": "251209",
  "sent_at": "2026-11-01T06:40:02.096173742Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7668696c-91ab-4007-9cbb-6e1bdeab6f01",
  "code": "251209",
  "device_ref": "sandbox-7379"
}
```

```json
{
  "session_id": "9eaa1f49-61c3-4ed2-83cc-9bae25e1ad3e",
  "subject": {
    "type": "CLIENT",
    "id": "6b45a702-199c-43cc-9557-9fda6ee921f3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YjQ1YTcwMi0xOTljLTQzY2MtOTU1Ny05ZmRhNmVlOTIxZjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNTE2MTAyLCJpYXQiOjE3OTM1MTUyMDIsImp0aSI6ImNmMDQ2ZDRjLWE3MzktNGQwMS05NjMyLWM2M2E2NGZmZThiOCIsInNpZCI6IjllYWExZjQ5LTYxYzMtNGVkMi04M2NjLTliYWUyNWUxYWQzZSJ9.rqZbW-NUVAyeBQTRcuf7Sk378Dof3EcV27mXNkNvr54",
  "access_expires_at": "2026-11-01T06:55:02.350607634Z",
  "refresh_token": "VMTDmcc2ijhWrtHGQeDIisG1-rmtSyVbz3ejWSLLRoo",
  "refresh_expires_at": "2026-12-01T06:40:02.348614792Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-7067"
}
```

```json
{
  "challenge_id": "e98223b3-38c1-470e-95c1-934226c86445",
  "expires_at": "2026-11-01T06:45:02.58044151Z",
  "resend_available_at": "2026-11-01T06:40:03.58044151Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "674074",
  "sent_at": "2026-11-01T06:40:02.584831378Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e98223b3-38c1-470e-95c1-934226c86445",
  "code": "674074",
  "device_ref": "sandbox-7067"
}
```

```json
{
  "session_id": "42b70faa-2410-485a-9fb7-b4c45252dbb9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzUxNjEwMiwiaWF0IjoxNzkzNTE1MjAyLCJqdGkiOiI3YTM3NzQ1Yi05ZjBkLTRiODMtODBjMi04MGQ0ZDE1YjZjZWQiLCJzaWQiOiI0MmI3MGZhYS0yNDEwLTQ4NWEtOWZiNy1iNGM0NTI1MmRiYjkifQ.tyeAua2YgkRlGp7DwRDBi8LyOoblA2KwHCTRBAY7O-g",
  "access_expires_at": "2026-11-01T06:55:02.814604719Z",
  "refresh_token": "cJ2UppSLUCcT2XTybbtyjCJF-xhVMinLLwtUR6V5S38",
  "refresh_expires_at": "2026-12-01T06:40:02.812355589Z",
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
  "command_id": "362a36d6-ed81-472e-8a90-fc4355f63ffb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-11-01T06:40:03Z",
    "sequence": 1793515203257
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5d61c007-b100-4869-832f-bf03997dc58c",
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
  "last_heartbeat_at": "2026-11-01T06:40:03.322212Z",
  "last_location_at": "2026-11-01T06:40:03.322212Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fa01ca45-50c9-4243-8315-306bc5307270",
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
  "id": "e7363ae2-a9ac-4c47-bab0-b98e198b2861",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-11-01T06:45:03.642752Z",
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

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "26fc99fc-d1d1-4893-9732-7c384d727b25",
  "quote_id": "e7363ae2-a9ac-4c47-bab0-b98e198b2861",
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
  "id": "be33b988-a085-4358-b11f-0c434f602d71",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6b45a702-199c-43cc-9557-9fda6ee921f3",
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
  "created_at": "2026-11-01T06:40:03.926948Z",
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
    "id": "2426d59a-35f3-449c-bc7e-d46c3aa8128f",
    "order_id": "be33b988-a085-4358-b11f-0c434f602d71",
    "expires_at": "2026-11-01T06:40:18.934852Z",
    "server_time": "2026-11-01T06:40:04.251753734Z",
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

`POST /api/driver/v1/offers/2426d59a-35f3-449c-bc7e-d46c3aa8128f/accept` → **200**

```json
{
  "command_id": "ec4bce49-0c26-49ac-a160-750c46d68a91"
}
```

```json
{
  "id": "8076c101-8897-4a2f-aae6-ffaac28b5143",
  "order_id": "be33b988-a085-4358-b11f-0c434f602d71",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "60c3511f-3903-45e4-9a65-ce838e8a13ca",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "60c3511f-3903-45e4-9a65-ce838e8a13ca",
  "order_id": "be33b988-a085-4358-b11f-0c434f602d71",
  "assignment_id": "8076c101-8897-4a2f-aae6-ffaac28b5143",
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

`POST /api/driver/v1/work-sessions/5d61c007-b100-4869-832f-bf03997dc58c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-11-01T06:40:04Z",
    "sequence": 1793515204897
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5d61c007-b100-4869-832f-bf03997dc58c",
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
  "last_heartbeat_at": "2026-11-01T06:40:04.9187Z",
  "last_location_at": "2026-11-01T06:40:04.9187Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/60c3511f-3903-45e4-9a65-ce838e8a13ca/arrive` → **200**

```json
{
  "command_id": "0e08150a-7b16-4335-ad69-a1ae11642104",
  "expected_version": 0
}
```

```json
{
  "id": "60c3511f-3903-45e4-9a65-ce838e8a13ca",
  "order_id": "be33b988-a085-4358-b11f-0c434f602d71",
  "assignment_id": "8076c101-8897-4a2f-aae6-ffaac28b5143",
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
  "arrived_at": "2026-11-01T06:40:05.14733Z",
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

`POST /api/driver/v1/trips/60c3511f-3903-45e4-9a65-ce838e8a13ca/start` → **200**

```json
{
  "command_id": "6e173972-6316-4a66-aced-746da077c9f1",
  "expected_version": 1
}
```

```json
{
  "id": "60c3511f-3903-45e4-9a65-ce838e8a13ca",
  "order_id": "be33b988-a085-4358-b11f-0c434f602d71",
  "assignment_id": "8076c101-8897-4a2f-aae6-ffaac28b5143",
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
  "arrived_at": "2026-11-01T06:40:05.14733Z",
  "started_at": "2026-11-01T06:40:05.384728Z",
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

TripCompleted 4fa883a2-7c06-4e19-b79f-61fe1214abdb: PENDING after the crash.

Server start 4.

Consumers of the crashed event: `backoffice.problem-queues finance.trip-fare-posting finance.wallet-order-settlement notification.order-live-feed notification.push-feed operator-bonuses payments.trip-capture promotions.driver-trips promotions.trip-rewards`.

Live messages of the crashed event: **1** (sent before the crash, not again after it).

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5d61c007-b100-4869-832f-bf03997dc58c",
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
  "last_heartbeat_at": "2026-11-01T06:40:04.9187Z",
  "last_location_at": "2026-11-01T06:40:04.9187Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5d61c007-b100-4869-832f-bf03997dc58c/close` → **200**

```json
{
  "command_id": "47184177-6845-4200-b741-6bcdb9ab29f2",
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
  "phone": "+380675164192",
  "device_ref": "sandbox-19497"
}
```

```json
{
  "challenge_id": "4337130c-0123-48b0-977c-33d389bd3be8",
  "expires_at": "2026-11-01T06:45:48.809050484Z",
  "resend_available_at": "2026-11-01T06:40:49.809050484Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675164192` → **200**

```json
{
  "phone": "+380675164192",
  "audience": "CLIENT",
  "code": "510736",
  "sent_at": "2026-11-01T06:40:48.820402426Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4337130c-0123-48b0-977c-33d389bd3be8",
  "code": "510736",
  "device_ref": "sandbox-19497"
}
```

```json
{
  "session_id": "975f198e-01b9-4764-9e53-5a0cdcdeb962",
  "subject": {
    "type": "CLIENT",
    "id": "21d7f9a0-e615-457c-b6f8-211b7d7c13d4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMWQ3ZjlhMC1lNjE1LTQ1N2MtYjZmOC0yMTFiN2Q3YzEzZDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNTE2MTQ5LCJpYXQiOjE3OTM1MTUyNDksImp0aSI6IjE0OTUwY2NmLWJiYzktNDhmYy05ZmI1LTA4NjQzY2RmMzliMiIsInNpZCI6Ijk3NWYxOThlLTAxYjktNDc2NC05ZTUzLTVhMGNkY2RlYjk2MiJ9.IN-k_RaTlP38m0-0pl9NK434Yd78794xXSLfXxRneyM",
  "access_expires_at": "2026-11-01T06:55:49.096569882Z",
  "refresh_token": "_blULRu0je3RNfUfkGGYcts66JFVryNH7ZRQRofdPm4",
  "refresh_expires_at": "2026-12-01T06:40:49.094637119Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15418"
}
```

```json
{
  "challenge_id": "f0d0bb86-477a-4ab0-8623-b8232489d3bd",
  "expires_at": "2026-11-01T06:45:49.328792345Z",
  "resend_available_at": "2026-11-01T06:40:50.328792345Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "838113",
  "sent_at": "2026-11-01T06:40:49.333854898Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f0d0bb86-477a-4ab0-8623-b8232489d3bd",
  "code": "838113",
  "device_ref": "sandbox-15418"
}
```

```json
{
  "session_id": "edf87d32-89b2-4931-a0a7-1001886ec2ae",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzUxNjE0OSwiaWF0IjoxNzkzNTE1MjQ5LCJqdGkiOiJjZjg5YTY5Zi1iMTM3LTQ4NDUtYjg0YS0wMmMwMTBjZGE1ZjYiLCJzaWQiOiJlZGY4N2QzMi04OWIyLTQ5MzEtYTBhNy0xMDAxODg2ZWMyYWUifQ.CxLsYS3tPSClx5HWY3n0CehA05eeDfU0Sst49rbSNz8",
  "access_expires_at": "2026-11-01T06:55:49.554673042Z",
  "refresh_token": "37riNRjz6MdzzBcMcMt1zM2D0STEsH7i0ibl2nlHQu0",
  "refresh_expires_at": "2026-12-01T06:40:49.553869533Z",
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
  "command_id": "8671256b-9cac-4331-a5d7-1b62f721d525",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-11-01T06:40:49Z",
    "sequence": 1793515249986
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "42f66f78-01a7-4d4a-912e-916dbda23b21",
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
  "last_heartbeat_at": "2026-11-01T06:40:50.036106Z",
  "last_location_at": "2026-11-01T06:40:50.036106Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "28da88f0-5188-4bf1-8fa8-30f39c8b4063",
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
  "id": "b2a1dcb3-7b59-425e-85bb-2b2e590f4885",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-11-01T06:45:50.322449Z",
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

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2a81e697-45a9-4823-a562-591aa79af9ef",
  "quote_id": "b2a1dcb3-7b59-425e-85bb-2b2e590f4885",
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
  "id": "6f66b8f4-3dc3-4e20-81ae-948e796910ce",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21d7f9a0-e615-457c-b6f8-211b7d7c13d4",
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
  "created_at": "2026-11-01T06:40:50.600523Z",
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
    "id": "1d4a5b5c-079a-43f2-828c-b99c1d387efb",
    "order_id": "6f66b8f4-3dc3-4e20-81ae-948e796910ce",
    "expires_at": "2026-11-01T06:41:05.611638Z",
    "server_time": "2026-11-01T06:40:50.860490927Z",
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

`POST /api/driver/v1/offers/1d4a5b5c-079a-43f2-828c-b99c1d387efb/accept` → **200**

```json
{
  "command_id": "2fa2bcb1-bbd1-499b-b3b5-6d8beb8a2f63"
}
```

```json
{
  "id": "63d744bf-b8ac-4c3f-b11f-a4cb6db9e69b",
  "order_id": "6f66b8f4-3dc3-4e20-81ae-948e796910ce",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5ef476b2-2853-4906-ac54-b2eb6d238515",
  "trip_phase": "TO_PICKUP"
}
```

The retry with the same command: HTTP 200.

One assignment, and the retry returned it.

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5ef476b2-2853-4906-ac54-b2eb6d238515",
  "order_id": "6f66b8f4-3dc3-4e20-81ae-948e796910ce",
  "assignment_id": "63d744bf-b8ac-4c3f-b11f-a4cb6db9e69b",
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

`POST /api/driver/v1/work-sessions/42f66f78-01a7-4d4a-912e-916dbda23b21/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-11-01T06:40:58Z",
    "sequence": 1793515258234
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "42f66f78-01a7-4d4a-912e-916dbda23b21",
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
  "last_heartbeat_at": "2026-11-01T06:40:58.294108Z",
  "last_location_at": "2026-11-01T06:40:58.294108Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/5ef476b2-2853-4906-ac54-b2eb6d238515/arrive` → **200**

```json
{
  "command_id": "0f26ccea-49d4-4f0b-b66a-01d720893da3",
  "expected_version": 0
}
```

```json
{
  "id": "5ef476b2-2853-4906-ac54-b2eb6d238515",
  "order_id": "6f66b8f4-3dc3-4e20-81ae-948e796910ce",
  "assignment_id": "63d744bf-b8ac-4c3f-b11f-a4cb6db9e69b",
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
  "arrived_at": "2026-11-01T06:40:58.523301Z",
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

`POST /api/driver/v1/trips/5ef476b2-2853-4906-ac54-b2eb6d238515/start` → **200**

```json
{
  "command_id": "afd3f5d2-6b2b-4738-ac97-f3ca506f1619",
  "expected_version": 1
}
```

```json
{
  "id": "5ef476b2-2853-4906-ac54-b2eb6d238515",
  "order_id": "6f66b8f4-3dc3-4e20-81ae-948e796910ce",
  "assignment_id": "63d744bf-b8ac-4c3f-b11f-a4cb6db9e69b",
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
  "arrived_at": "2026-11-01T06:40:58.523301Z",
  "started_at": "2026-11-01T06:40:58.736099Z",
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
  "session_id": "42f66f78-01a7-4d4a-912e-916dbda23b21",
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
  "last_heartbeat_at": "2026-11-01T06:40:58.294108Z",
  "last_location_at": "2026-11-01T06:40:58.294108Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/42f66f78-01a7-4d4a-912e-916dbda23b21/close` → **200**

```json
{
  "command_id": "889629c8-6295-4aff-a24b-9ef153c26b28",
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

Answers during the cut: 1381×201 14×429 9×503 

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677058268",
  "device_ref": "sandbox-8591"
}
```

```json
{
  "challenge_id": "3434ba21-01bc-4184-bea6-fb8536010237",
  "expires_at": "2026-11-01T06:46:15.041797391Z",
  "resend_available_at": "2026-11-01T06:41:16.041797391Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677058268` → **200**

```json
{
  "phone": "+380677058268",
  "audience": "CLIENT",
  "code": "801499",
  "sent_at": "2026-11-01T06:41:15.044852811Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3434ba21-01bc-4184-bea6-fb8536010237",
  "code": "801499",
  "device_ref": "sandbox-8591"
}
```

```json
{
  "session_id": "f858b107-ae11-46e5-88f2-60524fc3d9db",
  "subject": {
    "type": "CLIENT",
    "id": "a804bda5-37d4-4cf3-8640-efd3a78dc499"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhODA0YmRhNS0zN2Q0LTRjZjMtODY0MC1lZmQzYTc4ZGM0OTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNTE2MTc1LCJpYXQiOjE3OTM1MTUyNzUsImp0aSI6ImUzOTQxY2UyLWU4OTAtNDE4OS1hMzVkLTdmNzAwOWNiNjc3YSIsInNpZCI6ImY4NThiMTA3LWFlMTEtNDZlNS04OGYyLTYwNTI0ZmMzZDlkYiJ9.9CRWOmOxs1dnPPGEerf29H-izNJAw_b1jLAuleaxAYo",
  "access_expires_at": "2026-11-01T06:56:15.297256347Z",
  "refresh_token": "ubb5RLauvxk8e7HSolyjtwlp2qN-VPgsCGlwjq5kyeo",
  "refresh_expires_at": "2026-12-01T06:41:15.295716469Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-3459"
}
```

```json
{
  "challenge_id": "2d6dbf1f-9568-4f43-ad4e-7db215523dfe",
  "expires_at": "2026-11-01T06:46:15.528163067Z",
  "resend_available_at": "2026-11-01T06:41:16.528163067Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "299368",
  "sent_at": "2026-11-01T06:41:15.530830138Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2d6dbf1f-9568-4f43-ad4e-7db215523dfe",
  "code": "299368",
  "device_ref": "sandbox-3459"
}
```

```json
{
  "session_id": "43d49515-5838-437e-bbd1-c28b64b748b4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzUxNjE3NSwiaWF0IjoxNzkzNTE1Mjc1LCJqdGkiOiIyODExOGRhMS01ZDBkLTRjZTctOTg1ZS1iY2Y1NjI1NDgzM2QiLCJzaWQiOiI0M2Q0OTUxNS01ODM4LTQzN2UtYmJkMS1jMjhiNjRiNzQ4YjQifQ.mkEfPm6i-PYO__qZVj5pXcR9OVDQCTyYoN-8hrfzo0M",
  "access_expires_at": "2026-11-01T06:56:15.755951714Z",
  "refresh_token": "s75a3Qm3zShbgvH4cmzCAXHzTTlcp2lLJQao66WUHyo",
  "refresh_expires_at": "2026-12-01T06:41:15.754549762Z",
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
  "command_id": "95680445-babc-420e-87c1-a247e256ba3f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-11-01T06:41:16Z",
    "sequence": 1793515276187
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2b1d8a45-eefe-4279-9f9b-c35143ebe7d1",
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
  "last_heartbeat_at": "2026-11-01T06:41:16.234706Z",
  "last_location_at": "2026-11-01T06:41:16.234706Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9760802d-20c0-4e63-84fb-b8b396fc66ac",
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
  "id": "9ae70b48-eb62-4b78-a390-bbcc10ee65bf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-11-01T06:46:16.502289Z",
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

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "134c9226-8124-4704-98e3-8b7bb2aed5e8",
  "quote_id": "9ae70b48-eb62-4b78-a390-bbcc10ee65bf",
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
  "id": "cbb638b4-986d-4e2f-a77f-3c811db51150",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a804bda5-37d4-4cf3-8640-efd3a78dc499",
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
  "created_at": "2026-11-01T06:41:16.776925Z",
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
    "id": "1aa3612b-67a2-4123-967f-3a7d2c623e24",
    "order_id": "cbb638b4-986d-4e2f-a77f-3c811db51150",
    "expires_at": "2026-11-01T06:41:31.782258Z",
    "server_time": "2026-11-01T06:41:17.044430496Z",
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

`POST /api/driver/v1/offers/1aa3612b-67a2-4123-967f-3a7d2c623e24/accept` → **200**

```json
{
  "command_id": "a52e17a9-58b8-4458-9ed0-e50304e64306"
}
```

```json
{
  "id": "8d689753-17a9-4c2b-bb26-b3eb52f11fba",
  "order_id": "cbb638b4-986d-4e2f-a77f-3c811db51150",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0c5cfed6-4a57-4313-8c53-5c5546ed3e14",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0c5cfed6-4a57-4313-8c53-5c5546ed3e14",
  "order_id": "cbb638b4-986d-4e2f-a77f-3c811db51150",
  "assignment_id": "8d689753-17a9-4c2b-bb26-b3eb52f11fba",
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

`POST /api/driver/v1/work-sessions/2b1d8a45-eefe-4279-9f9b-c35143ebe7d1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-11-01T06:41:17Z",
    "sequence": 1793515277715
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2b1d8a45-eefe-4279-9f9b-c35143ebe7d1",
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
  "last_heartbeat_at": "2026-11-01T06:41:17.737358Z",
  "last_location_at": "2026-11-01T06:41:17.737358Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/0c5cfed6-4a57-4313-8c53-5c5546ed3e14/arrive` → **200**

```json
{
  "command_id": "127d50b7-d63e-4d77-b85f-fdad8cf5d52f",
  "expected_version": 0
}
```

```json
{
  "id": "0c5cfed6-4a57-4313-8c53-5c5546ed3e14",
  "order_id": "cbb638b4-986d-4e2f-a77f-3c811db51150",
  "assignment_id": "8d689753-17a9-4c2b-bb26-b3eb52f11fba",
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
  "arrived_at": "2026-11-01T06:41:17.961022Z",
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

`POST /api/driver/v1/trips/0c5cfed6-4a57-4313-8c53-5c5546ed3e14/start` → **200**

```json
{
  "command_id": "60432d63-fe33-4435-bd50-a9f0065db930",
  "expected_version": 1
}
```

```json
{
  "id": "0c5cfed6-4a57-4313-8c53-5c5546ed3e14",
  "order_id": "cbb638b4-986d-4e2f-a77f-3c811db51150",
  "assignment_id": "8d689753-17a9-4c2b-bb26-b3eb52f11fba",
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
  "arrived_at": "2026-11-01T06:41:17.961022Z",
  "started_at": "2026-11-01T06:41:18.186526Z",
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
  "session_id": "2b1d8a45-eefe-4279-9f9b-c35143ebe7d1",
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
  "last_heartbeat_at": "2026-11-01T06:41:17.737358Z",
  "last_location_at": "2026-11-01T06:41:17.737358Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2b1d8a45-eefe-4279-9f9b-c35143ebe7d1/close` → **200**

```json
{
  "command_id": "51697c25-5b1b-4899-b2bf-c95dba318640",
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
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793515411938E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793515411982E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793515411983E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793515411947E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793515411984E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
