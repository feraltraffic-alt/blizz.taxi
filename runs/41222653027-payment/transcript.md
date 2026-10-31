# Fault tests (2026-10-31T17:04:22Z, 5648cb8, break: payment)

## Payment: the bank charges a card tip, the server dies before it stores the answer

Server start 1, armed at `payment.after-send:TIP`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678863510",
  "device_ref": "sandbox-17935"
}
```

```json
{
  "challenge_id": "951ab9c4-77e0-4b75-941c-eb34a7e2b297",
  "expires_at": "2026-10-31T17:09:36.168718436Z",
  "resend_available_at": "2026-10-31T17:04:37.168718436Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678863510` → **200**

```json
{
  "phone": "+380678863510",
  "audience": "CLIENT",
  "code": "440128",
  "sent_at": "2026-10-31T17:04:36.183785058Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "951ab9c4-77e0-4b75-941c-eb34a7e2b297",
  "code": "440128",
  "device_ref": "sandbox-17935"
}
```

```json
{
  "session_id": "2595ab44-b22e-4a25-97cf-7853d9ac8934",
  "subject": {
    "type": "CLIENT",
    "id": "573eb3a9-0751-4de5-bfbc-d59e1a4d87b9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NzNlYjNhOS0wNzUxLTRkZTUtYmZiYy1kNTllMWE0ZDg3YjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDY3MTg2LCJpYXQiOjE3OTM0NjYyODYsImp0aSI6ImFkYjE1NzJjLTA0OWMtNDdhMi1iZjkzLTcyMGNiMzRjYjhlZCIsInNpZCI6IjI1OTVhYjQ0LWIyMmUtNGEyNS05N2NmLTc4NTNkOWFjODkzNCJ9.Tjczy_YQaHrxqbYevk-04O1ygraZUDP536VdanwRU-U",
  "access_expires_at": "2026-10-31T17:19:46.105180534Z",
  "refresh_token": "GAbijLl94ZgDexUndf9PfMDbRK2X8NeVdgpqdbAtvZ0",
  "refresh_expires_at": "2026-11-30T17:04:46.101975532Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "00f9bcfb-62a2-443d-8b19-bfa2519305e5",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "1ded5271-25d3-4f5a-a2cd-87f6314026f3",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-1ded5271-25d3-4f5a-a2cd-87f6314026f3",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "92ff555c866e1fb26acf2d1fe9cd8bc6",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=1ded5271-25d3-4f5a-a2cd-87f6314026f3",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380678863510"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=1ded5271-25d3-4f5a-a2cd-87f6314026f3",
  "expires_at": "2026-10-31T17:34:46.494181Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/1ded5271-25d3-4f5a-a2cd-87f6314026f3` → **200**

```json
{
  "id": "1ded5271-25d3-4f5a-a2cd-87f6314026f3",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-31T17:34:46.494181Z",
  "card": {
    "id": "5f0247b2-048d-49bc-9e8f-d4ae922dea14",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9530",
    "card_type": "Visa",
    "created_at": "2026-10-31T17:04:46.862889Z"
  },
  "failure_reason": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-3361"
}
```

```json
{
  "challenge_id": "80bb90a7-1113-43a7-a3db-4f4d8f220d6b",
  "expires_at": "2026-10-31T17:09:47.2224262Z",
  "resend_available_at": "2026-10-31T17:04:48.2224262Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "786279",
  "sent_at": "2026-10-31T17:04:47.227670357Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "80bb90a7-1113-43a7-a3db-4f4d8f220d6b",
  "code": "786279",
  "device_ref": "sandbox-3361"
}
```

```json
{
  "session_id": "2e6bcc1f-3a6d-4882-ab01-cf85645b79a3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ2NzE4NywiaWF0IjoxNzkzNDY2Mjg3LCJqdGkiOiIzM2RmM2FmZi00OThkLTQ5NjYtOGEwMi04NDBmM2RmNjlmMmQiLCJzaWQiOiIyZTZiY2MxZi0zYTZkLTQ4ODItYWIwMS1jZjg1NjQ1Yjc5YTMifQ.Fgn3Sj8uVrfuH6zmwH_BtV0W4MKrbL8SLE5gbM68j5c",
  "access_expires_at": "2026-10-31T17:19:47.587109501Z",
  "refresh_token": "4UapARGZPKZQ6Oxfd2FPXGzz1rhTltsR5rNBCAqLqPk",
  "refresh_expires_at": "2026-11-30T17:04:47.585968133Z",
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
  "command_id": "bb05260a-a3e6-4b95-a65a-9ea8731c50b6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:04:48Z",
    "sequence": 1793466288262
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f7421450-a6ce-452c-8d1c-1e809d4c64b5",
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
  "last_heartbeat_at": "2026-10-31T17:04:48.369003Z",
  "last_location_at": "2026-10-31T17:04:48.369003Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "17e7b1f3-452c-486f-b3c2-582741da4ff7",
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
  "id": "f0668f56-0250-40d6-acca-7f9af09ac432",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T17:09:48.790434Z",
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
  "command_id": "a9ea766a-b0ca-49be-9a17-83aae77cb283",
  "quote_id": "f0668f56-0250-40d6-acca-7f9af09ac432",
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
  "id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "573eb3a9-0751-4de5-bfbc-d59e1a4d87b9",
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
  "created_at": "2026-10-31T17:04:49.214515Z",
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

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e` → **200**

```json
{
  "id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "573eb3a9-0751-4de5-bfbc-d59e1a4d87b9",
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
  "created_at": "2026-10-31T17:04:49.214515Z",
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

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e` → **200**

```json
{
  "id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "573eb3a9-0751-4de5-bfbc-d59e1a4d87b9",
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
  "created_at": "2026-10-31T17:04:49.214515Z",
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
    "id": "5f41639b-42ba-44af-a4f3-4c46c48544d5",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "expires_at": "2026-10-31T17:05:04.710468Z",
    "server_time": "2026-10-31T17:04:51.371009024Z",
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

`POST /api/driver/v1/offers/5f41639b-42ba-44af-a4f3-4c46c48544d5/accept` → **200**

```json
{
  "command_id": "ff3000f0-302f-4d59-b8ca-0ec567799fc0"
}
```

```json
{
  "id": "961e8f99-8bf8-4f7d-9782-ec9fa953c756",
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6ab4cc76-8163-4a3d-81ef-10c006de54b8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6ab4cc76-8163-4a3d-81ef-10c006de54b8",
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "assignment_id": "961e8f99-8bf8-4f7d-9782-ec9fa953c756",
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

`POST /api/driver/v1/work-sessions/f7421450-a6ce-452c-8d1c-1e809d4c64b5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:04:52Z",
    "sequence": 1793466292389
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f7421450-a6ce-452c-8d1c-1e809d4c64b5",
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
  "last_heartbeat_at": "2026-10-31T17:04:52.418708Z",
  "last_location_at": "2026-10-31T17:04:52.418708Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/6ab4cc76-8163-4a3d-81ef-10c006de54b8/arrive` → **200**

```json
{
  "command_id": "21a02c36-f2cc-40d8-84cc-ac844b161109",
  "expected_version": 0
}
```

```json
{
  "id": "6ab4cc76-8163-4a3d-81ef-10c006de54b8",
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "assignment_id": "961e8f99-8bf8-4f7d-9782-ec9fa953c756",
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
  "arrived_at": "2026-10-31T17:04:52.768612Z",
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

`POST /api/driver/v1/trips/6ab4cc76-8163-4a3d-81ef-10c006de54b8/start` → **200**

```json
{
  "command_id": "78fd68e0-d031-465b-8a06-52500d663c66",
  "expected_version": 1
}
```

```json
{
  "id": "6ab4cc76-8163-4a3d-81ef-10c006de54b8",
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "assignment_id": "961e8f99-8bf8-4f7d-9782-ec9fa953c756",
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
  "arrived_at": "2026-10-31T17:04:52.768612Z",
  "started_at": "2026-10-31T17:04:53.123322Z",
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

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e` → **200**

```json
{
  "id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "573eb3a9-0751-4de5-bfbc-d59e1a4d87b9",
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
    "id": "961e8f99-8bf8-4f7d-9782-ec9fa953c756",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6ab4cc76-8163-4a3d-81ef-10c006de54b8",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:04:49.214515Z",
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

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e` → **200**

```json
{
  "id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "573eb3a9-0751-4de5-bfbc-d59e1a4d87b9",
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
    "id": "961e8f99-8bf8-4f7d-9782-ec9fa953c756",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6ab4cc76-8163-4a3d-81ef-10c006de54b8",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:04:49.214515Z",
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

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e` → **200**

```json
{
  "id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "573eb3a9-0751-4de5-bfbc-d59e1a4d87b9",
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
    "id": "961e8f99-8bf8-4f7d-9782-ec9fa953c756",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6ab4cc76-8163-4a3d-81ef-10c006de54b8",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:04:49.214515Z",
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

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": true,
  "tip": null
}
```

Tip 1600 on order d80d590c-7269-4ec9-b767-a96f6181006e; the bank journal has 5 lines before it.
Crash point payment.after-send:TIP reached: halting as kill -9 would

The server halted at its crash point (exit 137).

Server start 2.

The worker asks the bank about the operation once its 2-minute lease has run out.

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

`GET /api/rider/v1/orders/d80d590c-7269-4ec9-b767-a96f6181006e/tip` → **200**

```json
{
  "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:04:53.46936Z",
  "open": false,
  "tip": {
    "id": "f669de87-0539-42bc-8c54-95ac4ba91998",
    "order_id": "d80d590c-7269-4ec9-b767-a96f6181006e",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-31T17:04:56.894046Z"
  }
}
```

Charges the bank received for the tip: **2**.

**The tip was charged 2 times.**
