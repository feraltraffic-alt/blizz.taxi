# Fault tests (2026-10-31T17:21:49Z, 8d71ec1, break: payment)

## Payment: the bank charges a card tip, the server dies before it stores the answer

Server start 1, armed at `payment.after-send:TIP`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671778334",
  "device_ref": "sandbox-3875"
}
```

```json
{
  "challenge_id": "26b12bf4-6c3c-4d3d-b1b9-aa147defb6bb",
  "expires_at": "2026-10-31T17:27:00.103577205Z",
  "resend_available_at": "2026-10-31T17:22:01.103577205Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671778334` → **200**

```json
{
  "phone": "+380671778334",
  "audience": "CLIENT",
  "code": "641020",
  "sent_at": "2026-10-31T17:22:00.114716554Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "26b12bf4-6c3c-4d3d-b1b9-aa147defb6bb",
  "code": "641020",
  "device_ref": "sandbox-3875"
}
```

```json
{
  "session_id": "1fdd6967-19b1-4959-b8fb-042cb94d76c3",
  "subject": {
    "type": "CLIENT",
    "id": "351f5d55-147e-459f-b1d0-a4a433a14c28"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNTFmNWQ1NS0xNDdlLTQ1OWYtYjFkMC1hNGE0MzNhMTRjMjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDY4MjI1LCJpYXQiOjE3OTM0NjczMjUsImp0aSI6IjUyYzg0Mjg5LTViOTQtNDYxOC1iMDdlLWFhNzFjYWVjNDI5NSIsInNpZCI6IjFmZGQ2OTY3LTE5YjEtNDk1OS1iOGZiLTA0MmNiOTRkNzZjMyJ9.nLaO_w6vWD4-gm66S_03iNYvZ_jjl0qsZEUPAluJiEM",
  "access_expires_at": "2026-10-31T17:37:05.393444519Z",
  "refresh_token": "XxBJ4hy-GAYGqk1_Kd6BVUrgSvJ0oVElZGhArffXHdE",
  "refresh_expires_at": "2026-11-30T17:22:05.39180919Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "e472302a-6a7f-41b0-af3f-a3e293c10510",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "c098be60-f6dc-4b02-8c9e-c570a74778d9",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-c098be60-f6dc-4b02-8c9e-c570a74778d9",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "44282d01af5250d45415170cbd0d8817",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=c098be60-f6dc-4b02-8c9e-c570a74778d9",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380671778334"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=c098be60-f6dc-4b02-8c9e-c570a74778d9",
  "expires_at": "2026-10-31T17:52:05.637114Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/c098be60-f6dc-4b02-8c9e-c570a74778d9` → **200**

```json
{
  "id": "c098be60-f6dc-4b02-8c9e-c570a74778d9",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-31T17:52:05.637114Z",
  "card": {
    "id": "d4b113f0-e1fe-4f93-827b-216ad384ea9b",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2842",
    "card_type": "Visa",
    "created_at": "2026-10-31T17:22:05.863042Z"
  },
  "failure_reason": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26033"
}
```

```json
{
  "challenge_id": "2ef82e9b-f00f-41c5-9bc4-fc601fd9ffd4",
  "expires_at": "2026-10-31T17:27:06.084231931Z",
  "resend_available_at": "2026-10-31T17:22:07.084231931Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "467026",
  "sent_at": "2026-10-31T17:22:06.087870501Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2ef82e9b-f00f-41c5-9bc4-fc601fd9ffd4",
  "code": "467026",
  "device_ref": "sandbox-26033"
}
```

```json
{
  "session_id": "c4985275-75aa-459a-9378-46197fee00cd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ2ODIyNiwiaWF0IjoxNzkzNDY3MzI2LCJqdGkiOiJmMzQxMzQ4NC1iOGQ0LTQ5OWEtOGM1YS1iZWFkN2NjODI2NjEiLCJzaWQiOiJjNDk4NTI3NS03NWFhLTQ1OWEtOTM3OC00NjE5N2ZlZTAwY2QifQ.KaP_LWfdpQ0D3HSitqWbfl02zUNalirzifqyXMo08GE",
  "access_expires_at": "2026-10-31T17:37:06.32203211Z",
  "refresh_token": "KF2aesyIgBsdReY2gSstk3gaOCvUvvkOeJgAG37rms4",
  "refresh_expires_at": "2026-11-30T17:22:06.321277868Z",
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
  "command_id": "95c6e273-d97e-48b3-8bad-e7746db994d8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:22:06Z",
    "sequence": 1793467326738
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "945b7285-093d-4f3a-bf55-a971d8acae86",
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
  "last_heartbeat_at": "2026-10-31T17:22:06.877766Z",
  "last_location_at": "2026-10-31T17:22:06.877766Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6d2f2138-40bb-4b44-b3e2-a1bfad9bfcb5",
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
  "id": "c864ee00-6c17-44ec-a138-5e99d2bcd378",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T17:27:07.129771Z",
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
  "command_id": "f25bc187-1633-4b50-b58b-17cd151f677e",
  "quote_id": "c864ee00-6c17-44ec-a138-5e99d2bcd378",
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
  "id": "8c004543-9200-401b-916f-5268a8b970b6",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "351f5d55-147e-459f-b1d0-a4a433a14c28",
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
  "created_at": "2026-10-31T17:22:07.394908Z",
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

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6` → **200**

```json
{
  "id": "8c004543-9200-401b-916f-5268a8b970b6",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "351f5d55-147e-459f-b1d0-a4a433a14c28",
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
  "created_at": "2026-10-31T17:22:07.394908Z",
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

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6` → **200**

```json
{
  "id": "8c004543-9200-401b-916f-5268a8b970b6",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "351f5d55-147e-459f-b1d0-a4a433a14c28",
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
  "created_at": "2026-10-31T17:22:07.394908Z",
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
    "id": "ea263d87-f8ac-4b64-81a9-f2e76b42ad49",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "expires_at": "2026-10-31T17:22:23.096896Z",
    "server_time": "2026-10-31T17:22:09.091858987Z",
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

`POST /api/driver/v1/offers/ea263d87-f8ac-4b64-81a9-f2e76b42ad49/accept` → **200**

```json
{
  "command_id": "99f46d33-852b-47c5-a4e7-f5121e512fc0"
}
```

```json
{
  "id": "c9f61cda-0695-4f6f-9590-78475f784ce0",
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fc13a1a8-d76e-41bf-9d08-6652e6efd555",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fc13a1a8-d76e-41bf-9d08-6652e6efd555",
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "assignment_id": "c9f61cda-0695-4f6f-9590-78475f784ce0",
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

`POST /api/driver/v1/work-sessions/945b7285-093d-4f3a-bf55-a971d8acae86/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:22:09Z",
    "sequence": 1793467329770
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "945b7285-093d-4f3a-bf55-a971d8acae86",
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
  "last_heartbeat_at": "2026-10-31T17:22:09.793836Z",
  "last_location_at": "2026-10-31T17:22:09.793836Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/fc13a1a8-d76e-41bf-9d08-6652e6efd555/arrive` → **200**

```json
{
  "command_id": "e2c037ea-890f-44a2-8251-2beb7586ac0f",
  "expected_version": 0
}
```

```json
{
  "id": "fc13a1a8-d76e-41bf-9d08-6652e6efd555",
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "assignment_id": "c9f61cda-0695-4f6f-9590-78475f784ce0",
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
  "arrived_at": "2026-10-31T17:22:10.031616Z",
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

`POST /api/driver/v1/trips/fc13a1a8-d76e-41bf-9d08-6652e6efd555/start` → **200**

```json
{
  "command_id": "997134d9-2a7b-462a-a984-5083f6b61133",
  "expected_version": 1
}
```

```json
{
  "id": "fc13a1a8-d76e-41bf-9d08-6652e6efd555",
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "assignment_id": "c9f61cda-0695-4f6f-9590-78475f784ce0",
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
  "arrived_at": "2026-10-31T17:22:10.031616Z",
  "started_at": "2026-10-31T17:22:10.271865Z",
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

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6` → **200**

```json
{
  "id": "8c004543-9200-401b-916f-5268a8b970b6",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "351f5d55-147e-459f-b1d0-a4a433a14c28",
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
    "id": "c9f61cda-0695-4f6f-9590-78475f784ce0",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "fc13a1a8-d76e-41bf-9d08-6652e6efd555",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:22:07.394908Z",
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

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6` → **200**

```json
{
  "id": "8c004543-9200-401b-916f-5268a8b970b6",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "351f5d55-147e-459f-b1d0-a4a433a14c28",
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
    "id": "c9f61cda-0695-4f6f-9590-78475f784ce0",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "fc13a1a8-d76e-41bf-9d08-6652e6efd555",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:22:07.394908Z",
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

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6` → **200**

```json
{
  "id": "8c004543-9200-401b-916f-5268a8b970b6",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "351f5d55-147e-459f-b1d0-a4a433a14c28",
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
    "id": "c9f61cda-0695-4f6f-9590-78475f784ce0",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "fc13a1a8-d76e-41bf-9d08-6652e6efd555",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:22:07.394908Z",
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

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6` → **200**

```json
{
  "id": "8c004543-9200-401b-916f-5268a8b970b6",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "351f5d55-147e-459f-b1d0-a4a433a14c28",
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
    "id": "c9f61cda-0695-4f6f-9590-78475f784ce0",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "fc13a1a8-d76e-41bf-9d08-6652e6efd555",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:22:07.394908Z",
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

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": true,
  "tip": null
}
```

Tip 1600 on order 8c004543-9200-401b-916f-5268a8b970b6; the bank journal has 5 lines before it.
Crash point payment.after-send:TIP reached: halting as kill -9 would

The server halted at its crash point (exit 137).

Server start 2.

The worker asks the bank about the operation once its 2-minute lease has run out.

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

`GET /api/rider/v1/orders/8c004543-9200-401b-916f-5268a8b970b6/tip` → **200**

```json
{
  "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:22:10.500076Z",
  "open": false,
  "tip": {
    "id": "49c04173-bcd6-4108-96e6-1a33eacbd05b",
    "order_id": "8c004543-9200-401b-916f-5268a8b970b6",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-31T17:22:14.670237Z"
  }
}
```

Charges the bank received for the tip: **2**.

**The tip was charged 2 times.**
