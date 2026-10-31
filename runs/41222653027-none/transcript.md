# Fault tests (2026-10-31T17:04:20Z, 5648cb8, break: none)

## Payment: the bank charges a card tip, the server dies before it stores the answer

Server start 1, armed at `payment.after-send:TIP`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677042259",
  "device_ref": "sandbox-1414"
}
```

```json
{
  "challenge_id": "b11d2461-2730-4544-952a-ff0e16bd1957",
  "expires_at": "2026-10-31T17:09:30.929096895Z",
  "resend_available_at": "2026-10-31T17:04:31.929096895Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677042259` → **200**

```json
{
  "phone": "+380677042259",
  "audience": "CLIENT",
  "code": "332999",
  "sent_at": "2026-10-31T17:04:30.940442622Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b11d2461-2730-4544-952a-ff0e16bd1957",
  "code": "332999",
  "device_ref": "sandbox-1414"
}
```

```json
{
  "session_id": "824401d5-7ca8-47cf-b096-ae4c181be460",
  "subject": {
    "type": "CLIENT",
    "id": "fd98dc0f-c69c-4d1c-a6ec-049b039c3869"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZDk4ZGMwZi1jNjljLTRkMWMtYTZlYy0wNDliMDM5YzM4NjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDY3MTc3LCJpYXQiOjE3OTM0NjYyNzcsImp0aSI6ImM0ZWJjMzI2LTViMzEtNDRiNC1iNTVjLWVlZDk2ODAwZjI5MCIsInNpZCI6IjgyNDQwMWQ1LTdjYTgtNDdjZi1iMDk2LWFlNGMxODFiZTQ2MCJ9.tezorHbTnzutnVF2PzGSXHDNfE8CFypq7iK2cojnVK0",
  "access_expires_at": "2026-10-31T17:19:37.964810239Z",
  "refresh_token": "y_0LESMoB3aRzxpY3Sgu1JaRDDdW_VsB9hbs0Baoy3U",
  "refresh_expires_at": "2026-11-30T17:04:37.963107193Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "e08ef178-0e0f-4e1b-ba25-c2e551da7320",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "704c0ae8-97d8-42b0-8ae1-f8a0c22c5298",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-704c0ae8-97d8-42b0-8ae1-f8a0c22c5298",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "3a587055dcff5f666383cd526d7ccd8e",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=704c0ae8-97d8-42b0-8ae1-f8a0c22c5298",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380677042259"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=704c0ae8-97d8-42b0-8ae1-f8a0c22c5298",
  "expires_at": "2026-10-31T17:34:38.271284Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/704c0ae8-97d8-42b0-8ae1-f8a0c22c5298` → **200**

```json
{
  "id": "704c0ae8-97d8-42b0-8ae1-f8a0c22c5298",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-31T17:34:38.271284Z",
  "card": {
    "id": "6ec46a3b-575c-46ad-93ae-e76808962817",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7963",
    "card_type": "Visa",
    "created_at": "2026-10-31T17:04:38.53751Z"
  },
  "failure_reason": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15467"
}
```

```json
{
  "challenge_id": "88b7fabe-a52c-481a-bbb0-4e074b4fa6cd",
  "expires_at": "2026-10-31T17:09:38.8054916Z",
  "resend_available_at": "2026-10-31T17:04:39.8054916Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "685287",
  "sent_at": "2026-10-31T17:04:38.809464387Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88b7fabe-a52c-481a-bbb0-4e074b4fa6cd",
  "code": "685287",
  "device_ref": "sandbox-15467"
}
```

```json
{
  "session_id": "1bccb8fa-63df-4969-bd66-c4742370b017",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ2NzE3OSwiaWF0IjoxNzkzNDY2Mjc5LCJqdGkiOiI4MmYxM2JlZS02Y2Q2LTQwYTgtYmQxNi0zODk1ODQ1ZmRkM2YiLCJzaWQiOiIxYmNjYjhmYS02M2RmLTQ5NjktYmQ2Ni1jNDc0MjM3MGIwMTcifQ.OeswU7OdMed8GXNPUxQCB0Y81XI6MOig6okWaw0Uaso",
  "access_expires_at": "2026-10-31T17:19:39.146078792Z",
  "refresh_token": "iuN4l7hSxbEGy3rZaYwfCmG3lZFBxCi8BUeU1bBL6Oc",
  "refresh_expires_at": "2026-11-30T17:04:39.144285653Z",
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
  "command_id": "27686879-d7f6-4877-b980-6432660b26a1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:04:39Z",
    "sequence": 1793466279706
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dd138339-4fa6-42bc-87bb-523dd7ca9354",
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
  "last_heartbeat_at": "2026-10-31T17:04:39.810271Z",
  "last_location_at": "2026-10-31T17:04:39.810271Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "25ed8a3f-7b90-49ff-981a-d09c6be21a27",
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
  "id": "e233121b-051d-4d16-b8fc-f2472af5c5b2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T17:09:40.101806Z",
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
  "command_id": "a5ac72b2-57d1-4517-bc94-e2942edc75eb",
  "quote_id": "e233121b-051d-4d16-b8fc-f2472af5c5b2",
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
  "id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "fd98dc0f-c69c-4d1c-a6ec-049b039c3869",
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
  "created_at": "2026-10-31T17:04:40.448247Z",
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

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0` → **200**

```json
{
  "id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "fd98dc0f-c69c-4d1c-a6ec-049b039c3869",
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
  "created_at": "2026-10-31T17:04:40.448247Z",
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

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0` → **200**

```json
{
  "id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fd98dc0f-c69c-4d1c-a6ec-049b039c3869",
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
  "created_at": "2026-10-31T17:04:40.448247Z",
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
    "id": "34f4f2f8-f0c3-4458-a8d8-7429f763a9c0",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "expires_at": "2026-10-31T17:04:56.387972Z",
    "server_time": "2026-10-31T17:04:42.249563921Z",
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

`POST /api/driver/v1/offers/34f4f2f8-f0c3-4458-a8d8-7429f763a9c0/accept` → **200**

```json
{
  "command_id": "fbc48b1e-de03-427b-a4de-e9ea1c58d77e"
}
```

```json
{
  "id": "c78dfd96-bdf1-436d-bc7f-d126b9f32885",
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bf98ec1c-afc1-4e74-b343-50fcadc568d2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bf98ec1c-afc1-4e74-b343-50fcadc568d2",
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "assignment_id": "c78dfd96-bdf1-436d-bc7f-d126b9f32885",
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

`POST /api/driver/v1/work-sessions/dd138339-4fa6-42bc-87bb-523dd7ca9354/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:04:43Z",
    "sequence": 1793466283436
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dd138339-4fa6-42bc-87bb-523dd7ca9354",
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
  "last_heartbeat_at": "2026-10-31T17:04:43.066298Z",
  "last_location_at": "2026-10-31T17:04:43.066298Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/bf98ec1c-afc1-4e74-b343-50fcadc568d2/arrive` → **200**

```json
{
  "command_id": "7077bafc-8cd7-4800-b681-81bd14511ce7",
  "expected_version": 0
}
```

```json
{
  "id": "bf98ec1c-afc1-4e74-b343-50fcadc568d2",
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "assignment_id": "c78dfd96-bdf1-436d-bc7f-d126b9f32885",
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
  "arrived_at": "2026-10-31T17:04:43.330792Z",
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

`POST /api/driver/v1/trips/bf98ec1c-afc1-4e74-b343-50fcadc568d2/start` → **200**

```json
{
  "command_id": "6c56b885-80d4-4cbe-9e80-317c7e6919a5",
  "expected_version": 1
}
```

```json
{
  "id": "bf98ec1c-afc1-4e74-b343-50fcadc568d2",
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "assignment_id": "c78dfd96-bdf1-436d-bc7f-d126b9f32885",
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
  "arrived_at": "2026-10-31T17:04:43.330792Z",
  "started_at": "2026-10-31T17:04:43.600296Z",
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

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0` → **200**

```json
{
  "id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "fd98dc0f-c69c-4d1c-a6ec-049b039c3869",
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
    "id": "c78dfd96-bdf1-436d-bc7f-d126b9f32885",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "bf98ec1c-afc1-4e74-b343-50fcadc568d2",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:04:40.448247Z",
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

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0` → **200**

```json
{
  "id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "fd98dc0f-c69c-4d1c-a6ec-049b039c3869",
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
    "id": "c78dfd96-bdf1-436d-bc7f-d126b9f32885",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "bf98ec1c-afc1-4e74-b343-50fcadc568d2",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:04:40.448247Z",
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

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0` → **200**

```json
{
  "id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "fd98dc0f-c69c-4d1c-a6ec-049b039c3869",
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
    "id": "c78dfd96-bdf1-436d-bc7f-d126b9f32885",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "bf98ec1c-afc1-4e74-b343-50fcadc568d2",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:04:40.448247Z",
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

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0` → **200**

```json
{
  "id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "fd98dc0f-c69c-4d1c-a6ec-049b039c3869",
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
    "id": "c78dfd96-bdf1-436d-bc7f-d126b9f32885",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "bf98ec1c-afc1-4e74-b343-50fcadc568d2",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:04:40.448247Z",
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

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": true,
  "tip": null
}
```

Tip 1600 on order 7db2ba4b-d3fa-4ab9-85be-07018923fcb0; the bank journal has 5 lines before it.
Crash point payment.after-send:TIP reached: halting as kill -9 would

The server halted at its crash point (exit 137).

Server start 2.

The worker asks the bank about the operation once its 2-minute lease has run out.

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
  }
}
```

`GET /api/rider/v1/orders/7db2ba4b-d3fa-4ab9-85be-07018923fcb0/tip` → **200**

```json
{
  "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:43.868134Z",
  "open": false,
  "tip": {
    "id": "5dfe5251-7a69-4782-867f-e1444aa9a512",
    "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:48.203936Z"
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
      "id": "83050030-6ab7-4785-8fac-bbc805b6be64",
      "at": "2026-10-31T17:04:44.505225Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 8939,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
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
      "id": "98ee3e98-62bc-4bb9-a166-7c9589752a12",
      "at": "2026-10-31T17:06:51.680809Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 1600,
      "reason": "Tip for the driver",
      "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
      "counterpart_id": null
    },
    {
      "id": "83050030-6ab7-4785-8fac-bbc805b6be64",
      "at": "2026-10-31T17:04:44.505225Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 8939,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7db2ba4b-d3fa-4ab9-85be-07018923fcb0",
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
  "session_id": "dd138339-4fa6-42bc-87bb-523dd7ca9354",
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
  "last_heartbeat_at": "2026-10-31T17:04:43.066298Z",
  "last_location_at": "2026-10-31T17:04:43.066298Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/dd138339-4fa6-42bc-87bb-523dd7ca9354/close` → **200**

```json
{
  "command_id": "c3cfa4c1-974b-498e-99a2-85e8df7802fb",
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
  "phone": "+380679319598",
  "device_ref": "sandbox-31194"
}
```

```json
{
  "challenge_id": "7507c59c-696b-4c2c-a9de-90ba025bd323",
  "expires_at": "2026-10-31T17:12:02.899506438Z",
  "resend_available_at": "2026-10-31T17:07:03.899506438Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679319598` → **200**

```json
{
  "phone": "+380679319598",
  "audience": "CLIENT",
  "code": "703641",
  "sent_at": "2026-10-31T17:07:02.918724197Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7507c59c-696b-4c2c-a9de-90ba025bd323",
  "code": "703641",
  "device_ref": "sandbox-31194"
}
```

```json
{
  "session_id": "b890ed45-6111-46bd-8799-cbd7a4b8c62f",
  "subject": {
    "type": "CLIENT",
    "id": "a74eafcd-de35-49db-9b3d-5b015b705c51"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNzRlYWZjZC1kZTM1LTQ5ZGItOWIzZC01YjAxNWI3MDVjNTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDY3MzIzLCJpYXQiOjE3OTM0NjY0MjMsImp0aSI6IjJiNGUwNmY4LTJjOTMtNDU0MC1iNTU3LTMwMWRjYTFhNjI0ZSIsInNpZCI6ImI4OTBlZDQ1LTYxMTEtNDZiZC04Nzk5LWNiZDdhNGI4YzYyZiJ9.yECK3-9mLvmpsoIrnHx4k-T_E4TLcGFBiPB0pQ-Dy7g",
  "access_expires_at": "2026-10-31T17:22:03.243887975Z",
  "refresh_token": "hU600a10Oz3Fv_0aazUFJN2kQ-2riEBGpVd3A9Bm0Hk",
  "refresh_expires_at": "2026-11-30T17:07:03.241670261Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-30050"
}
```

```json
{
  "challenge_id": "d5433160-5cf4-4495-81ea-308b0e0abc15",
  "expires_at": "2026-10-31T17:12:03.531866921Z",
  "resend_available_at": "2026-10-31T17:07:04.531866921Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "363768",
  "sent_at": "2026-10-31T17:07:03.536969651Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d5433160-5cf4-4495-81ea-308b0e0abc15",
  "code": "363768",
  "device_ref": "sandbox-30050"
}
```

```json
{
  "session_id": "5c407ddc-e80c-4717-b895-b1ce726ed29c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ2NzMyMywiaWF0IjoxNzkzNDY2NDIzLCJqdGkiOiIwZDkxYzNiYS0zOWMzLTRlMDktYWE5MS0zOGY3YjRjYjczODAiLCJzaWQiOiI1YzQwN2RkYy1lODBjLTQ3MTctYjg5NS1iMWNlNzI2ZWQyOWMifQ.w-mNg2SjuBK0Q_5A0AV0590v7FcAsmPC0BFQ6CaC94M",
  "access_expires_at": "2026-10-31T17:22:03.829511957Z",
  "refresh_token": "ng55PQ9iygqXQpJ_d1bGTtiHbxiSkrULXEddyKswq3M",
  "refresh_expires_at": "2026-11-30T17:07:03.828562395Z",
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
  "command_id": "b4102b52-6fe1-4885-aa8c-726a3e123512",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:07:04Z",
    "sequence": 1793466424365
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6e6b73de-8966-4320-9963-7a308d84a9fa",
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
  "last_heartbeat_at": "2026-10-31T17:07:04.425935Z",
  "last_location_at": "2026-10-31T17:07:04.425935Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4f433a6f-33d2-4523-8a14-012ddd7f078e",
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
  "id": "e5595e08-8774-42c0-a9a1-c7227c86ce3c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T17:12:04.787616Z",
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
  "command_id": "967338f4-5cce-40d8-aeff-d7a9fd8e0909",
  "quote_id": "e5595e08-8774-42c0-a9a1-c7227c86ce3c",
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
  "id": "614cd405-2ff1-49db-a63a-4d11321f4cf2",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a74eafcd-de35-49db-9b3d-5b015b705c51",
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
  "created_at": "2026-10-31T17:07:05.113413Z",
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
    "id": "2670a44c-6c7b-4da0-8e21-d8081ac1c127",
    "order_id": "614cd405-2ff1-49db-a63a-4d11321f4cf2",
    "expires_at": "2026-10-31T17:07:20.122872Z",
    "server_time": "2026-10-31T17:07:05.442535082Z",
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

`POST /api/driver/v1/offers/2670a44c-6c7b-4da0-8e21-d8081ac1c127/accept` → **200**

```json
{
  "command_id": "a002fd40-7a9f-4594-9f63-9ef19b3fcef9"
}
```

```json
{
  "id": "7fae0216-2d6c-423e-a635-85889a6a7451",
  "order_id": "614cd405-2ff1-49db-a63a-4d11321f4cf2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9e66b2b3-68a9-4c3d-9594-e9cd239ff4a9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9e66b2b3-68a9-4c3d-9594-e9cd239ff4a9",
  "order_id": "614cd405-2ff1-49db-a63a-4d11321f4cf2",
  "assignment_id": "7fae0216-2d6c-423e-a635-85889a6a7451",
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

`POST /api/driver/v1/work-sessions/6e6b73de-8966-4320-9963-7a308d84a9fa/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:07:06Z",
    "sequence": 1793466426256
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6e6b73de-8966-4320-9963-7a308d84a9fa",
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
  "last_heartbeat_at": "2026-10-31T17:07:06.282261Z",
  "last_location_at": "2026-10-31T17:07:06.282261Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/9e66b2b3-68a9-4c3d-9594-e9cd239ff4a9/arrive` → **200**

```json
{
  "command_id": "22cb6637-27f3-45e2-b0d7-43effc4af510",
  "expected_version": 0
}
```

```json
{
  "id": "9e66b2b3-68a9-4c3d-9594-e9cd239ff4a9",
  "order_id": "614cd405-2ff1-49db-a63a-4d11321f4cf2",
  "assignment_id": "7fae0216-2d6c-423e-a635-85889a6a7451",
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
  "arrived_at": "2026-10-31T17:07:06.557444Z",
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

`POST /api/driver/v1/trips/9e66b2b3-68a9-4c3d-9594-e9cd239ff4a9/start` → **200**

```json
{
  "command_id": "a6103dfe-f8b0-4c3b-9bd8-1869f5fb071d",
  "expected_version": 1
}
```

```json
{
  "id": "9e66b2b3-68a9-4c3d-9594-e9cd239ff4a9",
  "order_id": "614cd405-2ff1-49db-a63a-4d11321f4cf2",
  "assignment_id": "7fae0216-2d6c-423e-a635-85889a6a7451",
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
  "arrived_at": "2026-10-31T17:07:06.557444Z",
  "started_at": "2026-10-31T17:07:06.843044Z",
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

TripCompleted dcc1fb11-e62c-450a-b837-8d94d950b2f4: PENDING after the crash.

Server start 4.

Consumers of the crashed event: `backoffice.problem-queues finance.trip-fare-posting finance.wallet-order-settlement notification.order-live-feed notification.push-feed operator-bonuses payments.trip-capture promotions.driver-trips promotions.trip-rewards`.

Live messages of the crashed event: **1** (sent before the crash, not again after it).

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6e6b73de-8966-4320-9963-7a308d84a9fa",
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
  "last_heartbeat_at": "2026-10-31T17:07:06.282261Z",
  "last_location_at": "2026-10-31T17:07:06.282261Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6e6b73de-8966-4320-9963-7a308d84a9fa/close` → **200**

```json
{
  "command_id": "040ff0a6-c0af-4aa5-898e-69b896c163e2",
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
  "phone": "+380676767359",
  "device_ref": "sandbox-14358"
}
```

```json
{
  "challenge_id": "b26c9467-31b4-4838-9808-fb3996c34b3d",
  "expires_at": "2026-10-31T17:12:49.787685986Z",
  "resend_available_at": "2026-10-31T17:07:50.787685986Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676767359` → **200**

```json
{
  "phone": "+380676767359",
  "audience": "CLIENT",
  "code": "635141",
  "sent_at": "2026-10-31T17:07:49.80402344Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b26c9467-31b4-4838-9808-fb3996c34b3d",
  "code": "635141",
  "device_ref": "sandbox-14358"
}
```

```json
{
  "session_id": "4b9275a6-3935-462c-9002-6683afc6cad8",
  "subject": {
    "type": "CLIENT",
    "id": "b3d586a7-f20f-4312-a21d-e28707a9caff"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiM2Q1ODZhNy1mMjBmLTQzMTItYTIxZC1lMjg3MDdhOWNhZmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDY3MzcwLCJpYXQiOjE3OTM0NjY0NzAsImp0aSI6IjBkMWZmMjI5LWNjZjktNGI3ZC04ODA3LTM3MmQ0MWM1MTcxMCIsInNpZCI6IjRiOTI3NWE2LTM5MzUtNDYyYy05MDAyLTY2ODNhZmM2Y2FkOCJ9.5zWDa18mhuK7Y2zwooiLhHGlGZ_p2SRB0oWQ-E4qMyk",
  "access_expires_at": "2026-10-31T17:22:50.107245102Z",
  "refresh_token": "gbKWgTsyzlTpFPjBMOo-C31BPX_HvtPKn2DmTCtZ96Q",
  "refresh_expires_at": "2026-11-30T17:07:50.105156478Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10445"
}
```

```json
{
  "challenge_id": "40e13502-6ad2-49e0-a069-833011ecef06",
  "expires_at": "2026-10-31T17:12:50.393652258Z",
  "resend_available_at": "2026-10-31T17:07:51.393652258Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "545091",
  "sent_at": "2026-10-31T17:07:50.398655561Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "40e13502-6ad2-49e0-a069-833011ecef06",
  "code": "545091",
  "device_ref": "sandbox-10445"
}
```

```json
{
  "session_id": "a403d421-426f-4940-841e-bd5f8788b4fe",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ2NzM3MCwiaWF0IjoxNzkzNDY2NDcwLCJqdGkiOiI1OWZkM2ZhYy1lOGM5LTQ0YTgtYjFmMS0wYjA4ODc1NzUxNzQiLCJzaWQiOiJhNDAzZDQyMS00MjZmLTQ5NDAtODQxZS1iZDVmODc4OGI0ZmUifQ.XZFn5hsL9BfBkvB1iKzZuzJd5wA7aF9h1My2njXWhrc",
  "access_expires_at": "2026-10-31T17:22:50.708283661Z",
  "refresh_token": "izMTGdaWbR_vX4fIcnw0XUijpMgDB0cepNATEh4QVAQ",
  "refresh_expires_at": "2026-11-30T17:07:50.706768987Z",
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
  "command_id": "098927fd-0bb9-483b-9e52-234cc7dde9a5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:07:51Z",
    "sequence": 1793466471240
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "95ffe441-eb88-470f-aecc-5528eacd632f",
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
  "last_heartbeat_at": "2026-10-31T17:07:51.293658Z",
  "last_location_at": "2026-10-31T17:07:51.293658Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8a20393d-2fff-448a-b006-f23252e8eee4",
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
  "id": "e02f0afc-18c0-41c3-954d-d94a66532dee",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T17:12:51.623783Z",
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
  "command_id": "d326df76-8b0c-4913-a77f-7f44ef05fea4",
  "quote_id": "e02f0afc-18c0-41c3-954d-d94a66532dee",
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
  "id": "8a70b48e-4778-4619-bc4c-69928fb39423",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b3d586a7-f20f-4312-a21d-e28707a9caff",
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
  "created_at": "2026-10-31T17:07:51.948652Z",
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
    "id": "c44becac-3c88-4f62-b212-f5cdc40194fb",
    "order_id": "8a70b48e-4778-4619-bc4c-69928fb39423",
    "expires_at": "2026-10-31T17:08:06.957101Z",
    "server_time": "2026-10-31T17:07:52.260359052Z",
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

`POST /api/driver/v1/offers/c44becac-3c88-4f62-b212-f5cdc40194fb/accept` → **200**

```json
{
  "command_id": "bc3a7bb7-4664-401e-9207-8662270c88a3"
}
```

```json
{
  "id": "3ed3525b-856b-459b-974b-ed2d252f0e35",
  "order_id": "8a70b48e-4778-4619-bc4c-69928fb39423",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d1be1c5a-7c36-4861-a562-83bd91e1742d",
  "trip_phase": "TO_PICKUP"
}
```

The retry with the same command: HTTP 200.

One assignment, and the retry returned it.

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d1be1c5a-7c36-4861-a562-83bd91e1742d",
  "order_id": "8a70b48e-4778-4619-bc4c-69928fb39423",
  "assignment_id": "3ed3525b-856b-459b-974b-ed2d252f0e35",
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

`POST /api/driver/v1/work-sessions/95ffe441-eb88-470f-aecc-5528eacd632f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:08:00Z",
    "sequence": 1793466480827
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "95ffe441-eb88-470f-aecc-5528eacd632f",
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
  "last_heartbeat_at": "2026-10-31T17:08:00.898641Z",
  "last_location_at": "2026-10-31T17:08:00.898641Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/d1be1c5a-7c36-4861-a562-83bd91e1742d/arrive` → **200**

```json
{
  "command_id": "ae36e21f-86dd-4914-a9d1-87660f6ba911",
  "expected_version": 0
}
```

```json
{
  "id": "d1be1c5a-7c36-4861-a562-83bd91e1742d",
  "order_id": "8a70b48e-4778-4619-bc4c-69928fb39423",
  "assignment_id": "3ed3525b-856b-459b-974b-ed2d252f0e35",
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
  "arrived_at": "2026-10-31T17:08:01.182919Z",
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

`POST /api/driver/v1/trips/d1be1c5a-7c36-4861-a562-83bd91e1742d/start` → **200**

```json
{
  "command_id": "167c2ada-1601-40fe-840c-5ad74ee6e4e7",
  "expected_version": 1
}
```

```json
{
  "id": "d1be1c5a-7c36-4861-a562-83bd91e1742d",
  "order_id": "8a70b48e-4778-4619-bc4c-69928fb39423",
  "assignment_id": "3ed3525b-856b-459b-974b-ed2d252f0e35",
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
  "arrived_at": "2026-10-31T17:08:01.182919Z",
  "started_at": "2026-10-31T17:08:01.447984Z",
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
  "session_id": "95ffe441-eb88-470f-aecc-5528eacd632f",
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
  "last_heartbeat_at": "2026-10-31T17:08:00.898641Z",
  "last_location_at": "2026-10-31T17:08:00.898641Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/95ffe441-eb88-470f-aecc-5528eacd632f/close` → **200**

```json
{
  "command_id": "d816c5bd-3467-47b5-9590-483a42c9bd8c",
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
  "phone": "+380679229537",
  "device_ref": "sandbox-39"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 500,
  "title": "Internal error",
  "type": "https://errors.blizz.taxi/internal-error",
  "code": "INTERNAL_ERROR",
  "correlation_id": "70a535be-aace-4613-b85c-04441cdac608"
}
```

**Expected 201, got 500 — scenario stopped.**

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670210358",
  "device_ref": "sandbox-30582"
}
```

```json
{
  "challenge_id": "7e9d4bc9-da41-4c0b-859a-c3423c0e30f2",
  "expires_at": "2026-10-31T17:13:11.314128618Z",
  "resend_available_at": "2026-10-31T17:08:12.314128618Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670210358` → **200**

```json
{
  "phone": "+380670210358",
  "audience": "CLIENT",
  "code": "566067",
  "sent_at": "2026-10-31T17:08:11.329921043Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7e9d4bc9-da41-4c0b-859a-c3423c0e30f2",
  "code": "566067",
  "device_ref": "sandbox-30582"
}
```

```json
{
  "session_id": "fe12ae2f-cd53-4312-80d0-3f2f9fa30559",
  "subject": {
    "type": "CLIENT",
    "id": "59a968de-8eac-485d-a74d-4b6ce727d2b5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWE5NjhkZS04ZWFjLTQ4NWQtYTc0ZC00YjZjZTcyN2QyYjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDY3MzkxLCJpYXQiOjE3OTM0NjY0OTEsImp0aSI6IjlkNDA4Y2I3LTE2MGEtNDBhYy1iNWFmLTFhYjIyNTM1YTgyYSIsInNpZCI6ImZlMTJhZTJmLWNkNTMtNDMxMi04MGQwLTNmMmY5ZmEzMDU1OSJ9.AtEQzrn5xTpX9o3PWnZXqPo2xDHKEzimjD64BFwswSA",
  "access_expires_at": "2026-10-31T17:23:11.649949819Z",
  "refresh_token": "zcibGFU7UjMSfNUJrCuo5jbOjv-SQRSBOt7d3K8qb8M",
  "refresh_expires_at": "2026-11-30T17:08:11.647287807Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-25722"
}
```

```json
{
  "challenge_id": "9c5c9c16-c1f5-4f67-83af-6947316d5c96",
  "expires_at": "2026-10-31T17:13:11.928984802Z",
  "resend_available_at": "2026-10-31T17:08:12.928984802Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "017506",
  "sent_at": "2026-10-31T17:08:11.933953921Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c5c9c16-c1f5-4f67-83af-6947316d5c96",
  "code": "017506",
  "device_ref": "sandbox-25722"
}
```

```json
{
  "session_id": "a57068c5-da26-49e2-9520-c9ea0c7c33e0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ2NzM5MiwiaWF0IjoxNzkzNDY2NDkyLCJqdGkiOiIwNDAxZGYxMi0zYzgyLTQ3YjctOWYzYS0wNDE4ZjFjMTdlOWEiLCJzaWQiOiJhNTcwNjhjNS1kYTI2LTQ5ZTItOTUyMC1jOWVhMGM3YzMzZTAifQ.fcT9G1aq8n1r_M_UYdWsVWVSYYfOoLswccfTd8zlje0",
  "access_expires_at": "2026-10-31T17:23:12.208691324Z",
  "refresh_token": "LwfPUmsBOn6SSX_asDRtSOLN0g-YeOochYNNUwt9eIc",
  "refresh_expires_at": "2026-11-30T17:08:12.206771007Z",
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
  "command_id": "1693e03f-63ee-441f-abb4-9f23c6f3926a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:08:12Z",
    "sequence": 1793466492733
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "916761c4-9b41-4d6d-9164-754ef7f8c4ee",
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
  "last_heartbeat_at": "2026-10-31T17:08:12.791826Z",
  "last_location_at": "2026-10-31T17:08:12.791826Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7782b565-9010-429c-af79-dcba88057438",
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
  "id": "3184572a-4f3d-4608-b6a4-21cfd319f2cb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T17:13:13.100213Z",
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
  "command_id": "3138310f-3b01-4b73-8de4-d545a0f915fe",
  "quote_id": "3184572a-4f3d-4608-b6a4-21cfd319f2cb",
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
  "id": "3e73013a-21e2-4518-80ee-198135dde52c",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "59a968de-8eac-485d-a74d-4b6ce727d2b5",
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
  "created_at": "2026-10-31T17:08:13.42804Z",
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
    "id": "752e423f-23ce-4c1f-871a-1faee1f55cb6",
    "order_id": "3e73013a-21e2-4518-80ee-198135dde52c",
    "expires_at": "2026-10-31T17:08:28.436392Z",
    "server_time": "2026-10-31T17:08:13.739745779Z",
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

`POST /api/driver/v1/offers/752e423f-23ce-4c1f-871a-1faee1f55cb6/accept` → **200**

```json
{
  "command_id": "678d753f-de92-4adb-b4fa-5280cb63de0e"
}
```

```json
{
  "id": "0117d356-5cff-4437-acfd-7cf6bb3d116a",
  "order_id": "3e73013a-21e2-4518-80ee-198135dde52c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c1329161-d59e-4338-9acc-3c38b7d4bb5f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c1329161-d59e-4338-9acc-3c38b7d4bb5f",
  "order_id": "3e73013a-21e2-4518-80ee-198135dde52c",
  "assignment_id": "0117d356-5cff-4437-acfd-7cf6bb3d116a",
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

`POST /api/driver/v1/work-sessions/916761c4-9b41-4d6d-9164-754ef7f8c4ee/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:08:14Z",
    "sequence": 1793466494543
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "916761c4-9b41-4d6d-9164-754ef7f8c4ee",
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
  "last_heartbeat_at": "2026-10-31T17:08:14.567865Z",
  "last_location_at": "2026-10-31T17:08:14.567865Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/c1329161-d59e-4338-9acc-3c38b7d4bb5f/arrive` → **200**

```json
{
  "command_id": "3bf44602-e588-4e96-ae16-57e63bb38fd5",
  "expected_version": 0
}
```

```json
{
  "id": "c1329161-d59e-4338-9acc-3c38b7d4bb5f",
  "order_id": "3e73013a-21e2-4518-80ee-198135dde52c",
  "assignment_id": "0117d356-5cff-4437-acfd-7cf6bb3d116a",
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
  "arrived_at": "2026-10-31T17:08:14.846034Z",
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

`POST /api/driver/v1/trips/c1329161-d59e-4338-9acc-3c38b7d4bb5f/start` → **200**

```json
{
  "command_id": "6cbbf40d-b287-45ee-a0ce-a315ebd0bf9e",
  "expected_version": 1
}
```

```json
{
  "id": "c1329161-d59e-4338-9acc-3c38b7d4bb5f",
  "order_id": "3e73013a-21e2-4518-80ee-198135dde52c",
  "assignment_id": "0117d356-5cff-4437-acfd-7cf6bb3d116a",
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
  "arrived_at": "2026-10-31T17:08:14.846034Z",
  "started_at": "2026-10-31T17:08:15.135035Z",
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
  "session_id": "916761c4-9b41-4d6d-9164-754ef7f8c4ee",
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
  "last_heartbeat_at": "2026-10-31T17:08:14.567865Z",
  "last_location_at": "2026-10-31T17:08:14.567865Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/916761c4-9b41-4d6d-9164-754ef7f8c4ee/close` → **200**

```json
{
  "command_id": "5e688122-4b8a-41ce-ba26-15d34947b79c",
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
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793466629538E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793466629586E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793466629588E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793466629544E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793466629588E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
