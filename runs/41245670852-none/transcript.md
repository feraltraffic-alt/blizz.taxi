# Fault tests (2026-10-31T21:54:09Z, 234f73b, break: none)

## Payment: the bank charges a card tip, the server dies before it stores the answer

Server start 1, armed at `payment.after-send:TIP`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677551395",
  "device_ref": "sandbox-23914"
}
```

```json
{
  "challenge_id": "b8a28564-79f3-40eb-bbf1-c96e850dac8c",
  "expires_at": "2026-10-31T21:59:20.622280499Z",
  "resend_available_at": "2026-10-31T21:54:21.622280499Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677551395` → **200**

```json
{
  "phone": "+380677551395",
  "audience": "CLIENT",
  "code": "821460",
  "sent_at": "2026-10-31T21:54:20.63642302Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b8a28564-79f3-40eb-bbf1-c96e850dac8c",
  "code": "821460",
  "device_ref": "sandbox-23914"
}
```

```json
{
  "session_id": "c75f6882-444e-4723-a8c0-80cbf3acbeff",
  "subject": {
    "type": "CLIENT",
    "id": "88ac06f6-0233-4fb2-842d-43b8af944fb6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OGFjMDZmNi0wMjMzLTRmYjItODQyZC00M2I4YWY5NDRmYjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDg0NTY2LCJpYXQiOjE3OTM0ODM2NjYsImp0aSI6IjdkZjc3ZWM0LTljNDYtNDAxYi04ZTQyLTg4ZjljNjFiZDZmMSIsInNpZCI6ImM3NWY2ODgyLTQ0NGUtNDcyMy1hOGMwLTgwY2JmM2FjYmVmZiJ9.ZjThkBial5-0HwFjpZve4gwMZ1ZpHGgCWntj3FkAd0E",
  "access_expires_at": "2026-10-31T22:09:26.006907864Z",
  "refresh_token": "jgr9wT2xfu7enW5Ga8i1Cn73qqVog1meZNOdgh92218",
  "refresh_expires_at": "2026-11-30T21:54:26.005302412Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "1d4eb15b-fad6-40e3-b951-47af2dc5d9d2",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "f65b2a15-3da1-419a-9495-938c8b1c0b21",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-f65b2a15-3da1-419a-9495-938c8b1c0b21",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "862c41c114bf3030ef8cbb4074b07f41",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=f65b2a15-3da1-419a-9495-938c8b1c0b21",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380677551395"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=f65b2a15-3da1-419a-9495-938c8b1c0b21",
  "expires_at": "2026-10-31T22:24:26.333993Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/f65b2a15-3da1-419a-9495-938c8b1c0b21` → **200**

```json
{
  "id": "f65b2a15-3da1-419a-9495-938c8b1c0b21",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-31T22:24:26.333993Z",
  "card": {
    "id": "13921bc5-7302-47de-97be-e233d98157d5",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8828",
    "card_type": "Visa",
    "created_at": "2026-10-31T21:54:26.619157Z"
  },
  "failure_reason": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-16265"
}
```

```json
{
  "challenge_id": "d8ad8689-745f-43ba-8323-3559d30ddfea",
  "expires_at": "2026-10-31T21:59:26.900881461Z",
  "resend_available_at": "2026-10-31T21:54:27.900881461Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "788206",
  "sent_at": "2026-10-31T21:54:26.905265627Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d8ad8689-745f-43ba-8323-3559d30ddfea",
  "code": "788206",
  "device_ref": "sandbox-16265"
}
```

```json
{
  "session_id": "a6ed7a75-c502-4bd6-a9d9-37eb43948232",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ4NDU2NywiaWF0IjoxNzkzNDgzNjY3LCJqdGkiOiIxZmE2MDEzMC1lYjljLTQxNmUtYjRhNS1hZDUwYmIxZjM2MjIiLCJzaWQiOiJhNmVkN2E3NS1jNTAyLTRiZDYtYTlkOS0zN2ViNDM5NDgyMzIifQ.JaAlr8xBkyWzgQXI4V2-iqNz0YZ-pq-AZ9gPet1e0XA",
  "access_expires_at": "2026-10-31T22:09:27.221482314Z",
  "refresh_token": "YDJKgs7U-Ca5l8YKZiRYz1tL7LKCKhTSyeT53zZJsbU",
  "refresh_expires_at": "2026-11-30T21:54:27.220229329Z",
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
  "command_id": "2c4eaf49-a892-435f-838b-8315c12bddc0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T21:54:27Z",
    "sequence": 1793483667795
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1dce1a3c-70b4-40b9-9aa5-f5775f40ff16",
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
  "last_heartbeat_at": "2026-10-31T21:54:27.91925Z",
  "last_location_at": "2026-10-31T21:54:27.91925Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "82fba6c0-9b94-488f-917d-a54742c0b83b",
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
  "id": "3bff006d-7f1b-45c9-a02b-c4dbe6ba51d6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T21:59:28.222996Z",
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
  "command_id": "111a76e5-e17a-4454-a5c2-7c3c99953304",
  "quote_id": "3bff006d-7f1b-45c9-a02b-c4dbe6ba51d6",
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
  "id": "8a256044-87b6-4b18-925e-601861116415",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "88ac06f6-0233-4fb2-842d-43b8af944fb6",
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
  "created_at": "2026-10-31T21:54:28.558142Z",
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

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415` → **200**

```json
{
  "id": "8a256044-87b6-4b18-925e-601861116415",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "88ac06f6-0233-4fb2-842d-43b8af944fb6",
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
  "created_at": "2026-10-31T21:54:28.558142Z",
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

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415` → **200**

```json
{
  "id": "8a256044-87b6-4b18-925e-601861116415",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "88ac06f6-0233-4fb2-842d-43b8af944fb6",
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
  "created_at": "2026-10-31T21:54:28.558142Z",
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
    "id": "2b6adaa4-7a57-4f5b-9dfe-5055ab49e528",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "expires_at": "2026-10-31T21:54:44.187865Z",
    "server_time": "2026-10-31T21:54:30.43425594Z",
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

`POST /api/driver/v1/offers/2b6adaa4-7a57-4f5b-9dfe-5055ab49e528/accept` → **200**

```json
{
  "command_id": "50cba130-1492-4243-a405-171fd0e8870d"
}
```

```json
{
  "id": "dcb7c6f2-057d-4ba3-bf91-c75abeb54011",
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7b6eddb1-5231-42cc-a770-0480f4fdc966",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7b6eddb1-5231-42cc-a770-0480f4fdc966",
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "assignment_id": "dcb7c6f2-057d-4ba3-bf91-c75abeb54011",
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

`POST /api/driver/v1/work-sessions/1dce1a3c-70b4-40b9-9aa5-f5775f40ff16/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T21:54:31Z",
    "sequence": 1793483671252
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1dce1a3c-70b4-40b9-9aa5-f5775f40ff16",
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
  "last_heartbeat_at": "2026-10-31T21:54:31.276656Z",
  "last_location_at": "2026-10-31T21:54:31.276656Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/7b6eddb1-5231-42cc-a770-0480f4fdc966/arrive` → **200**

```json
{
  "command_id": "e7eba063-ca58-445d-9ca7-ebe0a24dd590",
  "expected_version": 0
}
```

```json
{
  "id": "7b6eddb1-5231-42cc-a770-0480f4fdc966",
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "assignment_id": "dcb7c6f2-057d-4ba3-bf91-c75abeb54011",
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
  "arrived_at": "2026-10-31T21:54:31.595695Z",
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

`POST /api/driver/v1/trips/7b6eddb1-5231-42cc-a770-0480f4fdc966/start` → **200**

```json
{
  "command_id": "a3728c0d-1eec-4a2c-ae4c-fd4a95423021",
  "expected_version": 1
}
```

```json
{
  "id": "7b6eddb1-5231-42cc-a770-0480f4fdc966",
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "assignment_id": "dcb7c6f2-057d-4ba3-bf91-c75abeb54011",
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
  "arrived_at": "2026-10-31T21:54:31.595695Z",
  "started_at": "2026-10-31T21:54:31.880735Z",
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

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415` → **200**

```json
{
  "id": "8a256044-87b6-4b18-925e-601861116415",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "88ac06f6-0233-4fb2-842d-43b8af944fb6",
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
    "id": "dcb7c6f2-057d-4ba3-bf91-c75abeb54011",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7b6eddb1-5231-42cc-a770-0480f4fdc966",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T21:54:28.558142Z",
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

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415` → **200**

```json
{
  "id": "8a256044-87b6-4b18-925e-601861116415",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "88ac06f6-0233-4fb2-842d-43b8af944fb6",
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
    "id": "dcb7c6f2-057d-4ba3-bf91-c75abeb54011",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7b6eddb1-5231-42cc-a770-0480f4fdc966",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T21:54:28.558142Z",
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

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": true,
  "tip": null
}
```

Tip 1600 on order 8a256044-87b6-4b18-925e-601861116415; the bank journal has 5 lines before it.
Crash point payment.after-send:TIP reached: halting as kill -9 would

The server halted at its crash point (exit 137).

Server start 2.

The worker asks the bank about the operation once its 2-minute lease has run out.

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
  }
}
```

`GET /api/rider/v1/orders/8a256044-87b6-4b18-925e-601861116415/tip` → **200**

```json
{
  "order_id": "8a256044-87b6-4b18-925e-601861116415",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T21:54:32.164533Z",
  "open": false,
  "tip": {
    "id": "1c5f5a94-2887-4918-8caa-6304840c81c7",
    "order_id": "8a256044-87b6-4b18-925e-601861116415",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-31T21:54:34.037488Z"
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
      "id": "d16670db-668e-4f84-b113-ddd5276d5b18",
      "at": "2026-10-31T21:54:32.357118Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 8939,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "8a256044-87b6-4b18-925e-601861116415",
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
      "id": "a777be34-3976-4c4b-937d-97dab09f157d",
      "at": "2026-10-31T21:56:36.759026Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 1600,
      "reason": "Tip for the driver",
      "order_id": "8a256044-87b6-4b18-925e-601861116415",
      "counterpart_id": null
    },
    {
      "id": "d16670db-668e-4f84-b113-ddd5276d5b18",
      "at": "2026-10-31T21:54:32.357118Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 8939,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "8a256044-87b6-4b18-925e-601861116415",
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
  "session_id": "1dce1a3c-70b4-40b9-9aa5-f5775f40ff16",
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
  "last_heartbeat_at": "2026-10-31T21:54:31.276656Z",
  "last_location_at": "2026-10-31T21:54:31.276656Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/1dce1a3c-70b4-40b9-9aa5-f5775f40ff16/close` → **200**

```json
{
  "command_id": "b5450094-2a0b-4e7b-b663-2363ba082a26",
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
  "phone": "+380670397828",
  "device_ref": "sandbox-11312"
}
```

```json
{
  "challenge_id": "1f88d3f3-5eff-4455-91a9-991f66744a09",
  "expires_at": "2026-10-31T22:01:50.482233555Z",
  "resend_available_at": "2026-10-31T21:56:51.482233555Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670397828` → **200**

```json
{
  "phone": "+380670397828",
  "audience": "CLIENT",
  "code": "822277",
  "sent_at": "2026-10-31T21:56:50.569257982Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1f88d3f3-5eff-4455-91a9-991f66744a09",
  "code": "822277",
  "device_ref": "sandbox-11312"
}
```

```json
{
  "session_id": "867475c7-65aa-4cb9-b5c2-9818c2d5754a",
  "subject": {
    "type": "CLIENT",
    "id": "2b23b068-243d-48f6-9e66-5c6c9f20a687"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYjIzYjA2OC0yNDNkLTQ4ZjYtOWU2Ni01YzZjOWYyMGE2ODciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDg0NzEwLCJpYXQiOjE3OTM0ODM4MTAsImp0aSI6IjU0ZWJlNTU1LTE1OGQtNGU4OC05NDc1LTkzOTVjNjQwYWJjOSIsInNpZCI6Ijg2NzQ3NWM3LTY1YWEtNGNiOS1iNWMyLTk4MThjMmQ1NzU0YSJ9.i0k00_iDTdDo21EsImJ7bhcoPoRa3tA7KC1_UZGrLEk",
  "access_expires_at": "2026-10-31T22:11:50.876743422Z",
  "refresh_token": "SJGIy9YtSewmsmgWdiUCiGCiOuxtVrgWe-ESahtY2V4",
  "refresh_expires_at": "2026-11-30T21:56:50.874791359Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-22599"
}
```

```json
{
  "challenge_id": "ad0cedb9-f283-4ef0-9090-715d906d2d9a",
  "expires_at": "2026-10-31T22:01:51.17259643Z",
  "resend_available_at": "2026-10-31T21:56:52.17259643Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "462818",
  "sent_at": "2026-10-31T21:56:51.177907204Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad0cedb9-f283-4ef0-9090-715d906d2d9a",
  "code": "462818",
  "device_ref": "sandbox-22599"
}
```

```json
{
  "session_id": "92517244-807a-4ac0-bf6e-59185680bd02",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ4NDcxMSwiaWF0IjoxNzkzNDgzODExLCJqdGkiOiJiOTlkZTJhMi1mOWQ0LTRjY2UtOTYwYy0zMzk0MjQyOWJkMDEiLCJzaWQiOiI5MjUxNzI0NC04MDdhLTRhYzAtYmY2ZS01OTE4NTY4MGJkMDIifQ.CprQcnSMCGaIZ48_J354k0wmXbeMXtIDdpXZMO1NGk0",
  "access_expires_at": "2026-10-31T22:11:51.457699383Z",
  "refresh_token": "1WPPfDcmMVnbsALtw5Z029YLkC95_lEiVAuveuVKvwU",
  "refresh_expires_at": "2026-11-30T21:56:51.456722304Z",
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
  "command_id": "48fdeed5-8e57-4dc9-afbc-c576b74eb6e8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T21:56:51Z",
    "sequence": 1793483811994
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9d012f3e-46b0-4940-860f-dd1d72da3f9a",
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
  "last_heartbeat_at": "2026-10-31T21:56:52.050879Z",
  "last_location_at": "2026-10-31T21:56:52.050879Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "693ff1d7-d85a-47f8-ad48-ba26e0542d9d",
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
  "id": "36314b2b-b140-4dbd-b896-ec80f550d8b8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T22:01:52.367147Z",
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
  "command_id": "1032fec9-faf4-4c16-a14e-7fbcbad6e113",
  "quote_id": "36314b2b-b140-4dbd-b896-ec80f550d8b8",
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
  "id": "f31f40fa-3c90-49e4-926e-709a056b41bc",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2b23b068-243d-48f6-9e66-5c6c9f20a687",
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
  "created_at": "2026-10-31T21:56:52.71525Z",
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
    "id": "4358371b-0bfd-484c-b2d2-2296810f3b6a",
    "order_id": "f31f40fa-3c90-49e4-926e-709a056b41bc",
    "expires_at": "2026-10-31T21:57:07.730436Z",
    "server_time": "2026-10-31T21:56:53.076318087Z",
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

`POST /api/driver/v1/offers/4358371b-0bfd-484c-b2d2-2296810f3b6a/accept` → **200**

```json
{
  "command_id": "3c617aa4-7f5d-42eb-adc0-f1e006a559a6"
}
```

```json
{
  "id": "7af93877-c6de-4671-a311-bf39e84c79ad",
  "order_id": "f31f40fa-3c90-49e4-926e-709a056b41bc",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "86c0842c-5ff4-458b-9167-8dc85e65766e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "86c0842c-5ff4-458b-9167-8dc85e65766e",
  "order_id": "f31f40fa-3c90-49e4-926e-709a056b41bc",
  "assignment_id": "7af93877-c6de-4671-a311-bf39e84c79ad",
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

`POST /api/driver/v1/work-sessions/9d012f3e-46b0-4940-860f-dd1d72da3f9a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T21:56:53Z",
    "sequence": 1793483813906
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9d012f3e-46b0-4940-860f-dd1d72da3f9a",
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
  "last_heartbeat_at": "2026-10-31T21:56:53.932907Z",
  "last_location_at": "2026-10-31T21:56:53.932907Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/86c0842c-5ff4-458b-9167-8dc85e65766e/arrive` → **200**

```json
{
  "command_id": "9a2de36f-d467-4bb1-a6e0-630f18a967a2",
  "expected_version": 0
}
```

```json
{
  "id": "86c0842c-5ff4-458b-9167-8dc85e65766e",
  "order_id": "f31f40fa-3c90-49e4-926e-709a056b41bc",
  "assignment_id": "7af93877-c6de-4671-a311-bf39e84c79ad",
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
  "arrived_at": "2026-10-31T21:56:54.213338Z",
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

`POST /api/driver/v1/trips/86c0842c-5ff4-458b-9167-8dc85e65766e/start` → **200**

```json
{
  "command_id": "ceff9a2d-1c2a-4e7b-8a6a-894ed3514e73",
  "expected_version": 1
}
```

```json
{
  "id": "86c0842c-5ff4-458b-9167-8dc85e65766e",
  "order_id": "f31f40fa-3c90-49e4-926e-709a056b41bc",
  "assignment_id": "7af93877-c6de-4671-a311-bf39e84c79ad",
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
  "arrived_at": "2026-10-31T21:56:54.213338Z",
  "started_at": "2026-10-31T21:56:54.501968Z",
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

TripCompleted f091fe29-65ae-4d18-9057-b1a63712c547: PENDING after the crash.

Server start 4.

Consumers of the crashed event: `backoffice.problem-queues finance.trip-fare-posting finance.wallet-order-settlement notification.order-live-feed notification.push-feed operator-bonuses payments.trip-capture promotions.driver-trips promotions.trip-rewards`.

Live messages of the crashed event: **1** (sent before the crash, not again after it).

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9d012f3e-46b0-4940-860f-dd1d72da3f9a",
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
  "last_heartbeat_at": "2026-10-31T21:56:53.932907Z",
  "last_location_at": "2026-10-31T21:56:53.932907Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/9d012f3e-46b0-4940-860f-dd1d72da3f9a/close` → **200**

```json
{
  "command_id": "eee8c3b5-2571-4857-ad6f-cdcf7c418002",
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
  "phone": "+380674972976",
  "device_ref": "sandbox-3255"
}
```

```json
{
  "challenge_id": "e38e7eae-561e-454c-adbf-4d86edbe4072",
  "expires_at": "2026-10-31T22:02:40.43019747Z",
  "resend_available_at": "2026-10-31T21:57:41.43019747Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674972976` → **200**

```json
{
  "phone": "+380674972976",
  "audience": "CLIENT",
  "code": "211163",
  "sent_at": "2026-10-31T21:57:40.447746988Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e38e7eae-561e-454c-adbf-4d86edbe4072",
  "code": "211163",
  "device_ref": "sandbox-3255"
}
```

```json
{
  "session_id": "62eba3a4-be73-4b81-9d3f-daa28d4da9ba",
  "subject": {
    "type": "CLIENT",
    "id": "db4a4209-622c-4911-818b-d985c4ff34e9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjRhNDIwOS02MjJjLTQ5MTEtODE4Yi1kOTg1YzRmZjM0ZTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDg0NzYwLCJpYXQiOjE3OTM0ODM4NjAsImp0aSI6IjM0YmY4YWNlLTNhMzYtNDMxOS1hZTBmLTUzZTliZGYyMjA4NyIsInNpZCI6IjYyZWJhM2E0LWJlNzMtNGI4MS05ZDNmLWRhYTI4ZDRkYTliYSJ9.pTchVZ3WcUSIpiMwd4hqNPI03ilnUtNTc5sq5OdwY_A",
  "access_expires_at": "2026-10-31T22:12:40.763607858Z",
  "refresh_token": "WoL6MSJxeqgve3BInUhvDi8WVokiW9YmCWCltxcd-L0",
  "refresh_expires_at": "2026-11-30T21:57:40.760991754Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26329"
}
```

```json
{
  "challenge_id": "3e1fb429-f010-40e0-b19e-483d9c652990",
  "expires_at": "2026-10-31T22:02:41.058259005Z",
  "resend_available_at": "2026-10-31T21:57:42.058259005Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "280530",
  "sent_at": "2026-10-31T21:57:41.063003403Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3e1fb429-f010-40e0-b19e-483d9c652990",
  "code": "280530",
  "device_ref": "sandbox-26329"
}
```

```json
{
  "session_id": "0d6ea426-580e-4f27-8f85-e2efeb19ca01",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ4NDc2MSwiaWF0IjoxNzkzNDgzODYxLCJqdGkiOiJlNDBlODE0ZC03NWY3LTRiZGItODM4Ni03MDAzMjc3NTQyZTEiLCJzaWQiOiIwZDZlYTQyNi01ODBlLTRmMjctOGY4NS1lMmVmZWIxOWNhMDEifQ.cVlO0LqRcDWfLJRT2a-ruWZ-igpLEAG31q6UakrzA4g",
  "access_expires_at": "2026-10-31T22:12:41.341319807Z",
  "refresh_token": "s8XRXirC_4YTBM9B8Xw57AvLMRUjeJTyc9V_l67wkRg",
  "refresh_expires_at": "2026-11-30T21:57:41.340182627Z",
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
  "command_id": "63bfaa89-a889-40db-a107-f16ed826982d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T21:57:41Z",
    "sequence": 1793483861883
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ab14a21e-0140-48bf-87ea-38b398bda884",
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
  "last_heartbeat_at": "2026-10-31T21:57:41.93798Z",
  "last_location_at": "2026-10-31T21:57:41.93798Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a0c3da52-4e17-4980-aafa-b551bcd8ae74",
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
  "id": "2341a664-ea89-4156-bb1b-2788946ccc77",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T22:02:42.269956Z",
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
  "command_id": "7a06f02d-ad11-45d2-8916-16e886d53cb0",
  "quote_id": "2341a664-ea89-4156-bb1b-2788946ccc77",
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
  "id": "2a6e9411-b609-410b-88ed-d763b7dc6136",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "db4a4209-622c-4911-818b-d985c4ff34e9",
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
  "created_at": "2026-10-31T21:57:42.600967Z",
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
    "id": "4b27421e-cd91-44b3-978e-9f61e022a4ca",
    "order_id": "2a6e9411-b609-410b-88ed-d763b7dc6136",
    "expires_at": "2026-10-31T21:57:57.609634Z",
    "server_time": "2026-10-31T21:57:42.928917161Z",
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

`POST /api/driver/v1/offers/4b27421e-cd91-44b3-978e-9f61e022a4ca/accept` → **200**

```json
{
  "command_id": "273f4811-03e6-4e00-8de2-982aadad7e0d"
}
```

```json
{
  "id": "010a6912-de37-4a28-a168-b18301f99d2f",
  "order_id": "2a6e9411-b609-410b-88ed-d763b7dc6136",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f35a2ff2-02c6-49e8-b103-656e7dcc6a78",
  "trip_phase": "TO_PICKUP"
}
```

The retry with the same command: HTTP 200.

One assignment, and the retry returned it.

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f35a2ff2-02c6-49e8-b103-656e7dcc6a78",
  "order_id": "2a6e9411-b609-410b-88ed-d763b7dc6136",
  "assignment_id": "010a6912-de37-4a28-a168-b18301f99d2f",
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

`POST /api/driver/v1/work-sessions/ab14a21e-0140-48bf-87ea-38b398bda884/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T21:57:52Z",
    "sequence": 1793483872621
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ab14a21e-0140-48bf-87ea-38b398bda884",
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
  "last_heartbeat_at": "2026-10-31T21:57:52.697104Z",
  "last_location_at": "2026-10-31T21:57:52.697104Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/f35a2ff2-02c6-49e8-b103-656e7dcc6a78/arrive` → **200**

```json
{
  "command_id": "d161bb10-b801-4d97-bdd6-bdd607ab4e06",
  "expected_version": 0
}
```

```json
{
  "id": "f35a2ff2-02c6-49e8-b103-656e7dcc6a78",
  "order_id": "2a6e9411-b609-410b-88ed-d763b7dc6136",
  "assignment_id": "010a6912-de37-4a28-a168-b18301f99d2f",
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
  "arrived_at": "2026-10-31T21:57:53.016348Z",
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

`POST /api/driver/v1/trips/f35a2ff2-02c6-49e8-b103-656e7dcc6a78/start` → **200**

```json
{
  "command_id": "39ebceca-b290-4f4d-ab02-8a62de9fb2e5",
  "expected_version": 1
}
```

```json
{
  "id": "f35a2ff2-02c6-49e8-b103-656e7dcc6a78",
  "order_id": "2a6e9411-b609-410b-88ed-d763b7dc6136",
  "assignment_id": "010a6912-de37-4a28-a168-b18301f99d2f",
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
  "arrived_at": "2026-10-31T21:57:53.016348Z",
  "started_at": "2026-10-31T21:57:53.297615Z",
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
  "session_id": "ab14a21e-0140-48bf-87ea-38b398bda884",
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
  "last_heartbeat_at": "2026-10-31T21:57:52.697104Z",
  "last_location_at": "2026-10-31T21:57:52.697104Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ab14a21e-0140-48bf-87ea-38b398bda884/close` → **200**

```json
{
  "command_id": "7702dbf0-33fe-41e4-9990-f3f1ba16756e",
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

Answers during the cut: 851×201 4×429 9×503 

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678972334",
  "device_ref": "sandbox-20487"
}
```

```json
{
  "challenge_id": "0a2d4110-d2dd-4259-bb5c-2901650377b8",
  "expires_at": "2026-10-31T22:03:11.030276626Z",
  "resend_available_at": "2026-10-31T21:58:12.030276626Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678972334` → **200**

```json
{
  "phone": "+380678972334",
  "audience": "CLIENT",
  "code": "122517",
  "sent_at": "2026-10-31T21:58:11.032517787Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0a2d4110-d2dd-4259-bb5c-2901650377b8",
  "code": "122517",
  "device_ref": "sandbox-20487"
}
```

```json
{
  "session_id": "f74e31b2-d41c-4619-8ada-6750f00ecc3b",
  "subject": {
    "type": "CLIENT",
    "id": "9910ce4f-93d8-4831-bf41-bd820db5bc9d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5OTEwY2U0Zi05M2Q4LTQ4MzEtYmY0MS1iZDgyMGRiNWJjOWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDg0NzkxLCJpYXQiOjE3OTM0ODM4OTEsImp0aSI6Ijc5YWFkMDFhLTI4ZTUtNGZkOC1hNzE2LTI1ZDFlMjQ1YjMzMiIsInNpZCI6ImY3NGUzMWIyLWQ0MWMtNDYxOS04YWRhLTY3NTBmMDBlY2MzYiJ9.5QJCHe4D0Xoev5CeRLK98hjIk5dy4EVm0x3Ky0gHAMM",
  "access_expires_at": "2026-10-31T22:13:11.339267759Z",
  "refresh_token": "AjQnSpJzVM2WOauauNQn27jR8eY9tR2buoHEcy53d4c",
  "refresh_expires_at": "2026-11-30T21:58:11.337383992Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21588"
}
```

```json
{
  "challenge_id": "1bdb4181-a2d3-4cad-9278-8a60f25a0286",
  "expires_at": "2026-10-31T22:03:11.634586625Z",
  "resend_available_at": "2026-10-31T21:58:12.634586625Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "142181",
  "sent_at": "2026-10-31T21:58:11.636975083Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1bdb4181-a2d3-4cad-9278-8a60f25a0286",
  "code": "142181",
  "device_ref": "sandbox-21588"
}
```

```json
{
  "session_id": "2ce5deb0-de07-4e13-869e-33668a1c3e1c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ4NDc5MSwiaWF0IjoxNzkzNDgzODkxLCJqdGkiOiJlMTFjNzc1MS00MGRiLTRmMDAtYWMzMi02YTI4M2E2OGRmYjEiLCJzaWQiOiIyY2U1ZGViMC1kZTA3LTRlMTMtODY5ZS0zMzY2OGExYzNlMWMifQ.NU5XkNaYATCtxn3ZYsQ5FreMZ_SjSsWOVwpGMXeKOYs",
  "access_expires_at": "2026-10-31T22:13:11.922506202Z",
  "refresh_token": "9xTDgWpGgOpelodHQseS1hKZQLMiqOCmAqCkgAvO4AM",
  "refresh_expires_at": "2026-11-30T21:58:11.921026676Z",
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
  "command_id": "75a474e7-8353-40db-8fbc-fe85cecb1b62",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T21:58:12Z",
    "sequence": 1793483892481
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "39465a5e-9d06-4b24-aabe-52b0eb59876d",
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
  "last_heartbeat_at": "2026-10-31T21:58:12.539485Z",
  "last_location_at": "2026-10-31T21:58:12.539485Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bc61b3ce-be25-4c30-befc-557a36298c5e",
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
  "id": "2d12c045-6331-4938-adf5-905e1f126b78",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T22:03:12.886629Z",
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
  "command_id": "7434bbee-768a-4a65-a5f2-51dd4f38e69e",
  "quote_id": "2d12c045-6331-4938-adf5-905e1f126b78",
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
  "id": "5544a8d6-4875-425c-828b-37ec183712dc",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9910ce4f-93d8-4831-bf41-bd820db5bc9d",
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
  "created_at": "2026-10-31T21:58:13.269579Z",
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
    "id": "61781dd0-b013-4a04-98a0-de75180f26dc",
    "order_id": "5544a8d6-4875-425c-828b-37ec183712dc",
    "expires_at": "2026-10-31T21:58:28.277666Z",
    "server_time": "2026-10-31T21:58:13.594660345Z",
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

`POST /api/driver/v1/offers/61781dd0-b013-4a04-98a0-de75180f26dc/accept` → **200**

```json
{
  "command_id": "3d9b3585-a4c3-44e5-8ea5-8728310a23e6"
}
```

```json
{
  "id": "49cbf4c6-3ac2-4f66-9245-9db0b886847b",
  "order_id": "5544a8d6-4875-425c-828b-37ec183712dc",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ba38426f-6aad-495b-b3b2-0cdd6fad43b6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ba38426f-6aad-495b-b3b2-0cdd6fad43b6",
  "order_id": "5544a8d6-4875-425c-828b-37ec183712dc",
  "assignment_id": "49cbf4c6-3ac2-4f66-9245-9db0b886847b",
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

`POST /api/driver/v1/work-sessions/39465a5e-9d06-4b24-aabe-52b0eb59876d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T21:58:14Z",
    "sequence": 1793483894470
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "39465a5e-9d06-4b24-aabe-52b0eb59876d",
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
  "last_heartbeat_at": "2026-10-31T21:58:14.493531Z",
  "last_location_at": "2026-10-31T21:58:14.493531Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/ba38426f-6aad-495b-b3b2-0cdd6fad43b6/arrive` → **200**

```json
{
  "command_id": "50e7879a-d15a-4cd3-b2ef-726fb3740fc3",
  "expected_version": 0
}
```

```json
{
  "id": "ba38426f-6aad-495b-b3b2-0cdd6fad43b6",
  "order_id": "5544a8d6-4875-425c-828b-37ec183712dc",
  "assignment_id": "49cbf4c6-3ac2-4f66-9245-9db0b886847b",
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
  "arrived_at": "2026-10-31T21:58:14.766686Z",
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

`POST /api/driver/v1/trips/ba38426f-6aad-495b-b3b2-0cdd6fad43b6/start` → **200**

```json
{
  "command_id": "47aa013c-4833-4769-a4af-1d1c6ab55d1f",
  "expected_version": 1
}
```

```json
{
  "id": "ba38426f-6aad-495b-b3b2-0cdd6fad43b6",
  "order_id": "5544a8d6-4875-425c-828b-37ec183712dc",
  "assignment_id": "49cbf4c6-3ac2-4f66-9245-9db0b886847b",
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
  "arrived_at": "2026-10-31T21:58:14.766686Z",
  "started_at": "2026-10-31T21:58:15.042895Z",
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
  "session_id": "39465a5e-9d06-4b24-aabe-52b0eb59876d",
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
  "last_heartbeat_at": "2026-10-31T21:58:14.493531Z",
  "last_location_at": "2026-10-31T21:58:14.493531Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/39465a5e-9d06-4b24-aabe-52b0eb59876d/close` → **200**

```json
{
  "command_id": "905c709b-0ffe-493c-bdf7-73e2a07ee8ee",
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
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793484031302E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793484031361E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793484031362E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793484031308E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793484031363E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
