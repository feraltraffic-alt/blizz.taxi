# Fault tests (2026-10-31T19:26:04Z, 1e26c2d, break: none)

## Payment: the bank charges a card tip, the server dies before it stores the answer

Server start 1, armed at `payment.after-send:TIP`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679434016",
  "device_ref": "sandbox-10431"
}
```

```json
{
  "challenge_id": "084720e2-6fc8-4bf5-8a3f-0d0a3096f1c9",
  "expires_at": "2026-10-31T19:31:18.189760582Z",
  "resend_available_at": "2026-10-31T19:26:19.189760582Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679434016` → **200**

```json
{
  "phone": "+380679434016",
  "audience": "CLIENT",
  "code": "870188",
  "sent_at": "2026-10-31T19:26:18.203182935Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "084720e2-6fc8-4bf5-8a3f-0d0a3096f1c9",
  "code": "870188",
  "device_ref": "sandbox-10431"
}
```

```json
{
  "session_id": "d28864ed-438c-4c64-9390-96fbb11bc813",
  "subject": {
    "type": "CLIENT",
    "id": "0e487b21-95a1-4b61-a4dc-3dfcf6386618"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZTQ4N2IyMS05NWExLTRiNjEtYTRkYy0zZGZjZjYzODY2MTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDc1Njg3LCJpYXQiOjE3OTM0NzQ3ODcsImp0aSI6IjQzN2I2ZDQ1LTgyYjItNDE0ZS04NGNhLThiNzAwZWZkMTllOCIsInNpZCI6ImQyODg2NGVkLTQzOGMtNGM2NC05MzkwLTk2ZmJiMTFiYzgxMyJ9.p42etsZC7_CFIgq232-KFjUwLCmPnzKGmZN8mcItG7U",
  "access_expires_at": "2026-10-31T19:41:27.168193147Z",
  "refresh_token": "Iu8bJC69rhR-BRn-zO4AbIxeinDsoKDpwuYHv_Ow4Io",
  "refresh_expires_at": "2026-11-30T19:26:27.165928759Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "94f31031-f052-496d-ad6f-cc86dc746665",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "8c64cdb9-63b6-4892-ae4a-07e7cd9d3fd7",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-8c64cdb9-63b6-4892-ae4a-07e7cd9d3fd7",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "4a60f9a5aae3735a9993783f77ac3c9b",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=8c64cdb9-63b6-4892-ae4a-07e7cd9d3fd7",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380679434016"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=8c64cdb9-63b6-4892-ae4a-07e7cd9d3fd7",
  "expires_at": "2026-10-31T19:56:27.592455Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/8c64cdb9-63b6-4892-ae4a-07e7cd9d3fd7` → **200**

```json
{
  "id": "8c64cdb9-63b6-4892-ae4a-07e7cd9d3fd7",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-31T19:56:27.592455Z",
  "card": {
    "id": "e0d36429-7f93-4789-b90f-2e17a9d63962",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6980",
    "card_type": "Visa",
    "created_at": "2026-10-31T19:26:27.939466Z"
  },
  "failure_reason": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29003"
}
```

```json
{
  "challenge_id": "18d5a102-64ad-4e75-ab9a-925774a45438",
  "expires_at": "2026-10-31T19:31:28.292163206Z",
  "resend_available_at": "2026-10-31T19:26:29.292163206Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "962762",
  "sent_at": "2026-10-31T19:26:28.297222963Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "18d5a102-64ad-4e75-ab9a-925774a45438",
  "code": "962762",
  "device_ref": "sandbox-29003"
}
```

```json
{
  "session_id": "8646bd72-7412-4144-afb4-c3fbd11cbe38",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3NTY4OCwiaWF0IjoxNzkzNDc0Nzg4LCJqdGkiOiIwNjU2Njc4NC1lNzczLTRkZGMtYmI1MC1jN2U0ZTMwNDc4YjciLCJzaWQiOiI4NjQ2YmQ3Mi03NDEyLTQxNDQtYWZiNC1jM2ZiZDExY2JlMzgifQ.krvvJd6jwI2OXnO_Vpodc9Gup2-qNPptigvFhKbbUNU",
  "access_expires_at": "2026-10-31T19:41:28.65004391Z",
  "refresh_token": "j37g6BvpPj44CfZf4mfdYaETEt6HiG4RcrZiwxDGqXk",
  "refresh_expires_at": "2026-11-30T19:26:28.64889722Z",
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
  "command_id": "95fd65f6-b222-4d65-bc56-4546a8229913",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T19:26:29Z",
    "sequence": 1793474789314
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7fd94e7a-c6f0-4ae6-8ddd-d9ea52d5b88a",
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
  "last_heartbeat_at": "2026-10-31T19:26:29.426689Z",
  "last_location_at": "2026-10-31T19:26:29.426689Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3d2b16ca-69f5-4f58-90c7-c2ac07a694aa",
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
  "id": "32535234-4752-4830-9183-d28251bc978f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T19:31:29.820111Z",
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
  "command_id": "fdc96e82-91c0-4b26-9346-85c6c9f1cd2a",
  "quote_id": "32535234-4752-4830-9183-d28251bc978f",
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
  "id": "830e6d12-6540-4e63-851c-022d1936d411",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0e487b21-95a1-4b61-a4dc-3dfcf6386618",
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
  "created_at": "2026-10-31T19:26:30.255666Z",
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

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411` → **200**

```json
{
  "id": "830e6d12-6540-4e63-851c-022d1936d411",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0e487b21-95a1-4b61-a4dc-3dfcf6386618",
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
  "created_at": "2026-10-31T19:26:30.255666Z",
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

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411` → **200**

```json
{
  "id": "830e6d12-6540-4e63-851c-022d1936d411",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0e487b21-95a1-4b61-a4dc-3dfcf6386618",
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
  "created_at": "2026-10-31T19:26:30.255666Z",
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
    "id": "3dcc3e55-5c01-4384-88dd-27d7193b6e98",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "expires_at": "2026-10-31T19:26:46.315248Z",
    "server_time": "2026-10-31T19:26:32.276667289Z",
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

`POST /api/driver/v1/offers/3dcc3e55-5c01-4384-88dd-27d7193b6e98/accept` → **200**

```json
{
  "command_id": "1d6ff864-0b5e-464e-b871-004ae51eda2c"
}
```

```json
{
  "id": "ab1c946b-b8ed-401e-b2bb-6d35f7fbff45",
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "aec33455-893d-44b1-be46-93ee8f1601e0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "aec33455-893d-44b1-be46-93ee8f1601e0",
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "assignment_id": "ab1c946b-b8ed-401e-b2bb-6d35f7fbff45",
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

`POST /api/driver/v1/work-sessions/7fd94e7a-c6f0-4ae6-8ddd-d9ea52d5b88a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T19:26:33Z",
    "sequence": 1793474793258
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7fd94e7a-c6f0-4ae6-8ddd-d9ea52d5b88a",
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
  "last_heartbeat_at": "2026-10-31T19:26:33.286856Z",
  "last_location_at": "2026-10-31T19:26:33.286856Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/aec33455-893d-44b1-be46-93ee8f1601e0/arrive` → **200**

```json
{
  "command_id": "dd6cebd0-2706-4d93-8524-0e5257359f76",
  "expected_version": 0
}
```

```json
{
  "id": "aec33455-893d-44b1-be46-93ee8f1601e0",
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "assignment_id": "ab1c946b-b8ed-401e-b2bb-6d35f7fbff45",
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
  "arrived_at": "2026-10-31T19:26:33.627669Z",
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

`POST /api/driver/v1/trips/aec33455-893d-44b1-be46-93ee8f1601e0/start` → **200**

```json
{
  "command_id": "1f4d3ba2-2177-4722-9c2a-026e21958861",
  "expected_version": 1
}
```

```json
{
  "id": "aec33455-893d-44b1-be46-93ee8f1601e0",
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "assignment_id": "ab1c946b-b8ed-401e-b2bb-6d35f7fbff45",
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
  "arrived_at": "2026-10-31T19:26:33.627669Z",
  "started_at": "2026-10-31T19:26:33.969334Z",
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

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411` → **200**

```json
{
  "id": "830e6d12-6540-4e63-851c-022d1936d411",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "0e487b21-95a1-4b61-a4dc-3dfcf6386618",
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
    "id": "ab1c946b-b8ed-401e-b2bb-6d35f7fbff45",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "aec33455-893d-44b1-be46-93ee8f1601e0",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T19:26:30.255666Z",
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

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411` → **200**

```json
{
  "id": "830e6d12-6540-4e63-851c-022d1936d411",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "0e487b21-95a1-4b61-a4dc-3dfcf6386618",
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
    "id": "ab1c946b-b8ed-401e-b2bb-6d35f7fbff45",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "aec33455-893d-44b1-be46-93ee8f1601e0",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T19:26:30.255666Z",
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

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": true,
  "tip": null
}
```

Tip 1600 on order 830e6d12-6540-4e63-851c-022d1936d411; the bank journal has 5 lines before it.
Crash point payment.after-send:TIP reached: halting as kill -9 would

The server halted at its crash point (exit 137).

Server start 2.

The worker asks the bank about the operation once its 2-minute lease has run out.

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
  }
}
```

`GET /api/rider/v1/orders/830e6d12-6540-4e63-851c-022d1936d411/tip` → **200**

```json
{
  "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T19:26:34.315114Z",
  "open": false,
  "tip": {
    "id": "8379d03c-1a7e-408e-a3ed-df00325b47f1",
    "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-31T19:26:36.366113Z"
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
      "id": "09051507-48f4-4e55-9125-a5cc39a35ee4",
      "at": "2026-10-31T19:28:37.843254Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 1600,
      "reason": "Tip for the driver",
      "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
      "counterpart_id": null
    },
    {
      "id": "9cfd6aae-bf34-488c-af35-ec7ebe1309fa",
      "at": "2026-10-31T19:26:34.46868Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 8939,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "830e6d12-6540-4e63-851c-022d1936d411",
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
  "session_id": "7fd94e7a-c6f0-4ae6-8ddd-d9ea52d5b88a",
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
  "last_heartbeat_at": "2026-10-31T19:26:33.286856Z",
  "last_location_at": "2026-10-31T19:26:33.286856Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7fd94e7a-c6f0-4ae6-8ddd-d9ea52d5b88a/close` → **200**

```json
{
  "command_id": "b680a468-921a-418f-abdf-8af9cb14964b",
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
  "phone": "+380674672990",
  "device_ref": "sandbox-25835"
}
```

```json
{
  "challenge_id": "c881caf2-714e-47f1-bfae-e443ede40501",
  "expires_at": "2026-10-31T19:33:52.882513392Z",
  "resend_available_at": "2026-10-31T19:28:53.882513392Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674672990` → **200**

```json
{
  "phone": "+380674672990",
  "audience": "CLIENT",
  "code": "037438",
  "sent_at": "2026-10-31T19:28:52.905272013Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c881caf2-714e-47f1-bfae-e443ede40501",
  "code": "037438",
  "device_ref": "sandbox-25835"
}
```

```json
{
  "session_id": "ceae3922-1cd2-4006-9f2a-5627658af839",
  "subject": {
    "type": "CLIENT",
    "id": "ced19eb7-af6d-4b76-909f-edd75d207c1f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZWQxOWViNy1hZjZkLTRiNzYtOTA5Zi1lZGQ3NWQyMDdjMWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDc1ODMzLCJpYXQiOjE3OTM0NzQ5MzMsImp0aSI6ImQyZjJmNGVjLWNkYTItNDY1ZC04NzlkLTViMjQ4NWQ0YTgyNCIsInNpZCI6ImNlYWUzOTIyLTFjZDItNDAwNi05ZjJhLTU2Mjc2NThhZjgzOSJ9.FSZ43-wD3fX4waXe9Am0zbKAOG5FanCubG9B20AkCnI",
  "access_expires_at": "2026-10-31T19:43:53.342292326Z",
  "refresh_token": "YP6dEVMoXYIXNnRqoucN8At2FTGY5DMGII8t0K4jMQg",
  "refresh_expires_at": "2026-11-30T19:28:53.339356778Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17219"
}
```

```json
{
  "challenge_id": "c6bea75e-a17f-43a7-b2f9-65d2a83c5150",
  "expires_at": "2026-10-31T19:33:53.707801859Z",
  "resend_available_at": "2026-10-31T19:28:54.707801859Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "226365",
  "sent_at": "2026-10-31T19:28:53.714312838Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c6bea75e-a17f-43a7-b2f9-65d2a83c5150",
  "code": "226365",
  "device_ref": "sandbox-17219"
}
```

```json
{
  "session_id": "e9fe927b-5366-48a5-8e3b-a30eae667133",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3NTgzNCwiaWF0IjoxNzkzNDc0OTM0LCJqdGkiOiIyMTllYWI0Ni05NGI3LTQwYjItODQ0Ny1lMDg2N2VjYjk4OGYiLCJzaWQiOiJlOWZlOTI3Yi01MzY2LTQ4YTUtOGUzYi1hMzBlYWU2NjcxMzMifQ.yNn4b9OrWP6psY5KUdgsA9t-N6GyO59QNHCxt4IBkRA",
  "access_expires_at": "2026-10-31T19:43:54.067614252Z",
  "refresh_token": "Jg7NDIlt2kpe-k9I2mFz_oqDwXdiFLLBwI6lYzlNxfQ",
  "refresh_expires_at": "2026-11-30T19:28:54.066452572Z",
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
  "command_id": "ab9521f2-4dc7-48f3-858d-18c61cd7bef9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T19:28:54Z",
    "sequence": 1793474934752
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c5f7517a-71c9-40af-8da5-878c646bc4b2",
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
  "last_heartbeat_at": "2026-10-31T19:28:54.827576Z",
  "last_location_at": "2026-10-31T19:28:54.827576Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e4df3824-da86-4601-a5b6-d653413d49a9",
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
  "id": "ed223d67-bccf-476a-875b-0242338261c0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T19:33:55.295424Z",
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
  "command_id": "d0784c22-f40a-459a-80cf-9608db8c03f7",
  "quote_id": "ed223d67-bccf-476a-875b-0242338261c0",
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
  "id": "4d8d8ca4-6aed-41b5-925a-1e8d2b1e5329",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ced19eb7-af6d-4b76-909f-edd75d207c1f",
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
  "created_at": "2026-10-31T19:28:55.746951Z",
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
    "id": "1c3954f7-776f-428b-ba69-481d4f8467e7",
    "order_id": "4d8d8ca4-6aed-41b5-925a-1e8d2b1e5329",
    "expires_at": "2026-10-31T19:29:10.759878Z",
    "server_time": "2026-10-31T19:28:56.153799839Z",
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

`POST /api/driver/v1/offers/1c3954f7-776f-428b-ba69-481d4f8467e7/accept` → **200**

```json
{
  "command_id": "b9ffbf4c-853c-47eb-a969-3cc86b5254bb"
}
```

```json
{
  "id": "d1f4fc66-e48d-40e8-baa3-e6be397cd313",
  "order_id": "4d8d8ca4-6aed-41b5-925a-1e8d2b1e5329",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "53c62fcb-d445-4cec-a0e1-444bfaeb7124",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "53c62fcb-d445-4cec-a0e1-444bfaeb7124",
  "order_id": "4d8d8ca4-6aed-41b5-925a-1e8d2b1e5329",
  "assignment_id": "d1f4fc66-e48d-40e8-baa3-e6be397cd313",
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

`POST /api/driver/v1/work-sessions/c5f7517a-71c9-40af-8da5-878c646bc4b2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T19:28:57Z",
    "sequence": 1793474937192
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c5f7517a-71c9-40af-8da5-878c646bc4b2",
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
  "last_heartbeat_at": "2026-10-31T19:28:57.220261Z",
  "last_location_at": "2026-10-31T19:28:57.220261Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/53c62fcb-d445-4cec-a0e1-444bfaeb7124/arrive` → **200**

```json
{
  "command_id": "76208066-f44e-496a-aa9c-d3cebe45f8f2",
  "expected_version": 0
}
```

```json
{
  "id": "53c62fcb-d445-4cec-a0e1-444bfaeb7124",
  "order_id": "4d8d8ca4-6aed-41b5-925a-1e8d2b1e5329",
  "assignment_id": "d1f4fc66-e48d-40e8-baa3-e6be397cd313",
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
  "arrived_at": "2026-10-31T19:28:57.563816Z",
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

`POST /api/driver/v1/trips/53c62fcb-d445-4cec-a0e1-444bfaeb7124/start` → **200**

```json
{
  "command_id": "5f537a5b-30ad-440b-ac7f-10c801815375",
  "expected_version": 1
}
```

```json
{
  "id": "53c62fcb-d445-4cec-a0e1-444bfaeb7124",
  "order_id": "4d8d8ca4-6aed-41b5-925a-1e8d2b1e5329",
  "assignment_id": "d1f4fc66-e48d-40e8-baa3-e6be397cd313",
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
  "arrived_at": "2026-10-31T19:28:57.563816Z",
  "started_at": "2026-10-31T19:28:57.920387Z",
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

TripCompleted 78265575-1b0a-47ed-8442-e77483683c5e: PENDING after the crash.

Server start 4.

Consumers of the crashed event: `backoffice.problem-queues finance.trip-fare-posting finance.wallet-order-settlement notification.order-live-feed notification.push-feed operator-bonuses payments.trip-capture promotions.driver-trips promotions.trip-rewards`.

Live messages of the crashed event: **1** (sent before the crash, not again after it).

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c5f7517a-71c9-40af-8da5-878c646bc4b2",
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
  "last_heartbeat_at": "2026-10-31T19:28:57.220261Z",
  "last_location_at": "2026-10-31T19:28:57.220261Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c5f7517a-71c9-40af-8da5-878c646bc4b2/close` → **200**

```json
{
  "command_id": "787e766b-7d09-4b87-8218-e544b8f4504b",
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
  "phone": "+380670990209",
  "device_ref": "sandbox-11363"
}
```

```json
{
  "challenge_id": "262e3acf-318f-4597-92e0-d75e9e3e8025",
  "expires_at": "2026-10-31T19:34:44.412391445Z",
  "resend_available_at": "2026-10-31T19:29:45.412391445Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670990209` → **200**

```json
{
  "phone": "+380670990209",
  "audience": "CLIENT",
  "code": "588571",
  "sent_at": "2026-10-31T19:29:44.431818564Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "262e3acf-318f-4597-92e0-d75e9e3e8025",
  "code": "588571",
  "device_ref": "sandbox-11363"
}
```

```json
{
  "session_id": "539ce6d5-dc36-41a9-b689-da0ac7b2e04e",
  "subject": {
    "type": "CLIENT",
    "id": "81d0bf7a-e846-4828-8e6e-1e15cc06ed28"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MWQwYmY3YS1lODQ2LTQ4MjgtOGU2ZS0xZTE1Y2MwNmVkMjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDc1ODg0LCJpYXQiOjE3OTM0NzQ5ODQsImp0aSI6ImMxYmI0ODFjLTdiZGYtNDllNC1hYmQ4LWE3NDNhZWQ4MDYyYyIsInNpZCI6IjUzOWNlNmQ1LWRjMzYtNDFhOS1iNjg5LWRhMGFjN2IyZTA0ZSJ9.m3YHqN4_4aaV_YoLBxIf1rHCSjreNNLU-1TrS8vqTQ4",
  "access_expires_at": "2026-10-31T19:44:44.827538803Z",
  "refresh_token": "xlLMbHrWQlTYQndxPVCf_wJRzYVhrN3I8uN7ROPY5yU",
  "refresh_expires_at": "2026-11-30T19:29:44.823598619Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15553"
}
```

```json
{
  "challenge_id": "84593b4b-0f78-465a-9aed-e8b944ac0fde",
  "expires_at": "2026-10-31T19:34:45.226936586Z",
  "resend_available_at": "2026-10-31T19:29:46.226936586Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "783319",
  "sent_at": "2026-10-31T19:29:45.232969051Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "84593b4b-0f78-465a-9aed-e8b944ac0fde",
  "code": "783319",
  "device_ref": "sandbox-15553"
}
```

```json
{
  "session_id": "693a53b3-4c13-47e9-b1c5-9400aa716681",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3NTg4NSwiaWF0IjoxNzkzNDc0OTg1LCJqdGkiOiI0MmVhMTI5YS1mYjFkLTQwNWUtOGJjMS0yNTllNWJiMjhiYzciLCJzaWQiOiI2OTNhNTNiMy00YzEzLTQ3ZTktYjFjNS05NDAwYWE3MTY2ODEifQ.ZZYaGOrDTqQK1iH9pSFVkDMEfJDA2Q0H76Jo-2hjHe8",
  "access_expires_at": "2026-10-31T19:44:45.573784729Z",
  "refresh_token": "2lkjNxe4gbvnPWxu8J5ihv00hlbXDFiIwksq3uht1jU",
  "refresh_expires_at": "2026-11-30T19:29:45.57258987Z",
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
  "command_id": "4094df7f-f9ea-4282-9fa1-aeab32660dbc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T19:29:46Z",
    "sequence": 1793474986233
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ae9c50c8-92a0-470a-ae75-8cfeea7dc8c4",
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
  "last_heartbeat_at": "2026-10-31T19:29:46.301773Z",
  "last_location_at": "2026-10-31T19:29:46.301773Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bbd7dcb3-dd4d-4aae-819d-730b94e38f99",
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
  "id": "f952994c-1fef-488d-951e-642348dde946",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T19:34:46.705106Z",
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
  "command_id": "9ae0b6ca-b901-4bf2-847c-d22e15c9041b",
  "quote_id": "f952994c-1fef-488d-951e-642348dde946",
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
  "id": "c910ae4e-faab-4732-9d89-29d4b3a8be13",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "81d0bf7a-e846-4828-8e6e-1e15cc06ed28",
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
  "created_at": "2026-10-31T19:29:47.111421Z",
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
    "id": "b8e0ffb6-ab14-4d6d-a66e-3b227ca4fbba",
    "order_id": "c910ae4e-faab-4732-9d89-29d4b3a8be13",
    "expires_at": "2026-10-31T19:30:02.121269Z",
    "server_time": "2026-10-31T19:29:47.496211836Z",
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

`POST /api/driver/v1/offers/b8e0ffb6-ab14-4d6d-a66e-3b227ca4fbba/accept` → **200**

```json
{
  "command_id": "e7631a8e-619c-4a70-acc4-e428d5eaef37"
}
```

```json
{
  "id": "f94b82ad-5aa0-4015-b374-11f480bea52f",
  "order_id": "c910ae4e-faab-4732-9d89-29d4b3a8be13",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4dd015a5-5116-4f3b-9053-602edce0d238",
  "trip_phase": "TO_PICKUP"
}
```

The retry with the same command: HTTP 200.

One assignment, and the retry returned it.

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4dd015a5-5116-4f3b-9053-602edce0d238",
  "order_id": "c910ae4e-faab-4732-9d89-29d4b3a8be13",
  "assignment_id": "f94b82ad-5aa0-4015-b374-11f480bea52f",
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

`POST /api/driver/v1/work-sessions/ae9c50c8-92a0-470a-ae75-8cfeea7dc8c4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T19:29:59Z",
    "sequence": 1793474999574
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ae9c50c8-92a0-470a-ae75-8cfeea7dc8c4",
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
  "last_heartbeat_at": "2026-10-31T19:29:59.658048Z",
  "last_location_at": "2026-10-31T19:29:59.658048Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/4dd015a5-5116-4f3b-9053-602edce0d238/arrive` → **200**

```json
{
  "command_id": "685bf702-cfd0-46a1-ba58-734473e11dcc",
  "expected_version": 0
}
```

```json
{
  "id": "4dd015a5-5116-4f3b-9053-602edce0d238",
  "order_id": "c910ae4e-faab-4732-9d89-29d4b3a8be13",
  "assignment_id": "f94b82ad-5aa0-4015-b374-11f480bea52f",
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
  "arrived_at": "2026-10-31T19:30:00.044611Z",
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

`POST /api/driver/v1/trips/4dd015a5-5116-4f3b-9053-602edce0d238/start` → **200**

```json
{
  "command_id": "24a6d80a-368e-45fe-b16c-f7d16dd2a593",
  "expected_version": 1
}
```

```json
{
  "id": "4dd015a5-5116-4f3b-9053-602edce0d238",
  "order_id": "c910ae4e-faab-4732-9d89-29d4b3a8be13",
  "assignment_id": "f94b82ad-5aa0-4015-b374-11f480bea52f",
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
  "arrived_at": "2026-10-31T19:30:00.044611Z",
  "started_at": "2026-10-31T19:30:00.374613Z",
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
  "session_id": "ae9c50c8-92a0-470a-ae75-8cfeea7dc8c4",
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
  "last_heartbeat_at": "2026-10-31T19:29:59.658048Z",
  "last_location_at": "2026-10-31T19:29:59.658048Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ae9c50c8-92a0-470a-ae75-8cfeea7dc8c4/close` → **200**

```json
{
  "command_id": "eb3e5262-e749-4c8d-8978-9e2e53ac9b7c",
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

Answers during the cut: 831×201 5×429 8×503 

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670169600",
  "device_ref": "sandbox-8404"
}
```

```json
{
  "challenge_id": "2f3619cb-fe77-48da-b1bc-37c7cbc5e8a9",
  "expires_at": "2026-10-31T19:35:21.030181053Z",
  "resend_available_at": "2026-10-31T19:30:22.030181053Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670169600` → **200**

```json
{
  "phone": "+380670169600",
  "audience": "CLIENT",
  "code": "994799",
  "sent_at": "2026-10-31T19:30:21.033214658Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2f3619cb-fe77-48da-b1bc-37c7cbc5e8a9",
  "code": "994799",
  "device_ref": "sandbox-8404"
}
```

```json
{
  "session_id": "42c13201-72a7-43ab-aff2-3a70028c69a3",
  "subject": {
    "type": "CLIENT",
    "id": "0448c347-9392-4289-943d-0ab53ca8700a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNDQ4YzM0Ny05MzkyLTQyODktOTQzZC0wYWI1M2NhODcwMGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDc1OTIxLCJpYXQiOjE3OTM0NzUwMjEsImp0aSI6IjI2YjZjMWVlLTA0MTctNDI3ZS05YTQ2LTg2ZjhjZTYwY2I4ZiIsInNpZCI6IjQyYzEzMjAxLTcyYTctNDNhYi1hZmYyLTNhNzAwMjhjNjlhMyJ9.TRg0QmiBigJWLkwarxe_opU3C3r3qPZwkoU06bY3suY",
  "access_expires_at": "2026-10-31T19:45:21.39348365Z",
  "refresh_token": "Q7yQ9__Vcvl8ysW_c4tDR5uJ1DVbzEhZPGbMTigq1L0",
  "refresh_expires_at": "2026-11-30T19:30:21.39097Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21292"
}
```

```json
{
  "challenge_id": "5f7d80cc-62e0-4de1-897a-fec21138e7b7",
  "expires_at": "2026-10-31T19:35:21.764909786Z",
  "resend_available_at": "2026-10-31T19:30:22.764909786Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "208333",
  "sent_at": "2026-10-31T19:30:21.767847028Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5f7d80cc-62e0-4de1-897a-fec21138e7b7",
  "code": "208333",
  "device_ref": "sandbox-21292"
}
```

```json
{
  "session_id": "29320e9c-41cc-4665-8545-c3acd60c2460",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3NTkyMiwiaWF0IjoxNzkzNDc1MDIyLCJqdGkiOiIzZWI4MTZjZS03MjBhLTRiYWYtODg2YS01NGQzY2IwNWY2MDIiLCJzaWQiOiIyOTMyMGU5Yy00MWNjLTQ2NjUtODU0NS1jM2FjZDYwYzI0NjAifQ.E_-AQfW3jejrkSyC5nJf8ci3nzGPgc3bd4yxBemVeFM",
  "access_expires_at": "2026-10-31T19:45:22.110459639Z",
  "refresh_token": "mM4Z8zrIUGdYcGgo_ryIHi4J5bVSsEBDLw59xlJAqXk",
  "refresh_expires_at": "2026-11-30T19:30:22.108598571Z",
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
  "command_id": "d403ba1e-21e5-4e29-9146-4a2ef18d9317",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T19:30:22Z",
    "sequence": 1793475022804
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "30fb8a44-c3ee-4dd1-86f1-ccb6c8ef0c62",
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
  "last_heartbeat_at": "2026-10-31T19:30:22.869674Z",
  "last_location_at": "2026-10-31T19:30:22.869674Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "00bf328d-18cf-4256-9f1f-57fd09473571",
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
  "id": "f72e8b66-4320-4e69-a0ec-470f3faebaae",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T19:35:23.277913Z",
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
  "command_id": "7effc8ba-d0d1-44f5-85dc-f958d60a6731",
  "quote_id": "f72e8b66-4320-4e69-a0ec-470f3faebaae",
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
  "id": "52df217d-d58c-4bdd-afee-4ae6c31daa77",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0448c347-9392-4289-943d-0ab53ca8700a",
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
  "created_at": "2026-10-31T19:30:23.781207Z",
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
    "id": "a117e3c3-15da-4867-aaa8-5521c9716ccd",
    "order_id": "52df217d-d58c-4bdd-afee-4ae6c31daa77",
    "expires_at": "2026-10-31T19:30:38.791289Z",
    "server_time": "2026-10-31T19:30:24.210527248Z",
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

`POST /api/driver/v1/offers/a117e3c3-15da-4867-aaa8-5521c9716ccd/accept` → **200**

```json
{
  "command_id": "2f7bd3b5-a85e-40a2-b689-23e05a4b7630"
}
```

```json
{
  "id": "74f9c980-a99f-42fe-8485-04935997f95e",
  "order_id": "52df217d-d58c-4bdd-afee-4ae6c31daa77",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7ab05e19-9da5-4d7d-8204-ffb89eaf210f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7ab05e19-9da5-4d7d-8204-ffb89eaf210f",
  "order_id": "52df217d-d58c-4bdd-afee-4ae6c31daa77",
  "assignment_id": "74f9c980-a99f-42fe-8485-04935997f95e",
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

`POST /api/driver/v1/work-sessions/30fb8a44-c3ee-4dd1-86f1-ccb6c8ef0c62/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T19:30:25Z",
    "sequence": 1793475025234
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "30fb8a44-c3ee-4dd1-86f1-ccb6c8ef0c62",
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
  "last_heartbeat_at": "2026-10-31T19:30:25.260975Z",
  "last_location_at": "2026-10-31T19:30:25.260975Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/7ab05e19-9da5-4d7d-8204-ffb89eaf210f/arrive` → **200**

```json
{
  "command_id": "3a5d14e5-07e1-4f58-86ed-c0ffe0922a44",
  "expected_version": 0
}
```

```json
{
  "id": "7ab05e19-9da5-4d7d-8204-ffb89eaf210f",
  "order_id": "52df217d-d58c-4bdd-afee-4ae6c31daa77",
  "assignment_id": "74f9c980-a99f-42fe-8485-04935997f95e",
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
  "arrived_at": "2026-10-31T19:30:25.603309Z",
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

`POST /api/driver/v1/trips/7ab05e19-9da5-4d7d-8204-ffb89eaf210f/start` → **200**

```json
{
  "command_id": "12098703-0387-4e37-9ba1-df15707f7768",
  "expected_version": 1
}
```

```json
{
  "id": "7ab05e19-9da5-4d7d-8204-ffb89eaf210f",
  "order_id": "52df217d-d58c-4bdd-afee-4ae6c31daa77",
  "assignment_id": "74f9c980-a99f-42fe-8485-04935997f95e",
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
  "arrived_at": "2026-10-31T19:30:25.603309Z",
  "started_at": "2026-10-31T19:30:25.936226Z",
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
  "session_id": "30fb8a44-c3ee-4dd1-86f1-ccb6c8ef0c62",
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
  "last_heartbeat_at": "2026-10-31T19:30:25.260975Z",
  "last_location_at": "2026-10-31T19:30:25.260975Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/30fb8a44-c3ee-4dd1-86f1-ccb6c8ef0c62/close` → **200**

```json
{
  "command_id": "7b5c6066-b2dc-495d-afb1-e47f24202541",
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
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.79347516371E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793475163791E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793475163792E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793475163719E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793475163793E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
