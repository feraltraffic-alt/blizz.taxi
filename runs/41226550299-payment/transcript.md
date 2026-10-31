# Fault tests (2026-10-31T17:53:30Z, 4796389, break: payment)

## Payment: the bank charges a card tip, the server dies before it stores the answer

Server start 1, armed at `payment.after-send:TIP`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671814763",
  "device_ref": "sandbox-29965"
}
```

```json
{
  "challenge_id": "fbaa7f03-f63f-4e92-a92d-c5b4b8d10686",
  "expires_at": "2026-10-31T17:58:43.241214125Z",
  "resend_available_at": "2026-10-31T17:53:44.241214125Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671814763` → **200**

```json
{
  "phone": "+380671814763",
  "audience": "CLIENT",
  "code": "103985",
  "sent_at": "2026-10-31T17:53:43.255380327Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fbaa7f03-f63f-4e92-a92d-c5b4b8d10686",
  "code": "103985",
  "device_ref": "sandbox-29965"
}
```

```json
{
  "session_id": "53f0a44e-83e3-4e3c-9300-76f5468bc069",
  "subject": {
    "type": "CLIENT",
    "id": "ec4f59b4-e1b9-4f53-89ec-bfcfaf89c0a9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYzRmNTliNC1lMWI5LTRmNTMtODllYy1iZmNmYWY4OWMwYTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDcwMTMxLCJpYXQiOjE3OTM0NjkyMzEsImp0aSI6IjI5NWNlNDIwLTU3MTQtNDJiZS04YjJiLWQyNWZiZmRlNDU0ZCIsInNpZCI6IjUzZjBhNDRlLTgzZTMtNGUzYy05MzAwLTc2ZjU0NjhiYzA2OSJ9.2TUbMVoiISrAovMMoscXDAasYWYbL7OM3yvDjbV7fjI",
  "access_expires_at": "2026-10-31T18:08:51.299731368Z",
  "refresh_token": "_tLbH5JnzHw9ksIBn9tR-ezjCZXvspSiP3AEW9b0kCA",
  "refresh_expires_at": "2026-11-30T17:53:51.297452712Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "29152fc4-39d8-4fdb-b3cc-9e713e84189b",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "28169e54-27ee-4dee-8e71-ff5c686a352f",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-28169e54-27ee-4dee-8e71-ff5c686a352f",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "115a5c60c9a894f20ac81424ee59dbaf",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=28169e54-27ee-4dee-8e71-ff5c686a352f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380671814763"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=28169e54-27ee-4dee-8e71-ff5c686a352f",
  "expires_at": "2026-10-31T18:23:51.674617Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/28169e54-27ee-4dee-8e71-ff5c686a352f` → **200**

```json
{
  "id": "28169e54-27ee-4dee-8e71-ff5c686a352f",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-31T18:23:51.674617Z",
  "card": {
    "id": "6069a62c-c7f9-4356-a8e1-923e919e01e2",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4456",
    "card_type": "Visa",
    "created_at": "2026-10-31T17:53:51.988499Z"
  },
  "failure_reason": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-7886"
}
```

```json
{
  "challenge_id": "d6902f9a-09ae-4ba8-8253-fbd92f82ac1a",
  "expires_at": "2026-10-31T17:58:52.306563995Z",
  "resend_available_at": "2026-10-31T17:53:53.306563995Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "673179",
  "sent_at": "2026-10-31T17:53:52.312022062Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d6902f9a-09ae-4ba8-8253-fbd92f82ac1a",
  "code": "673179",
  "device_ref": "sandbox-7886"
}
```

```json
{
  "session_id": "9dd4dd38-49a6-4b1e-9e6e-2a4a70bff018",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3MDEzMiwiaWF0IjoxNzkzNDY5MjMyLCJqdGkiOiJlODk2Y2YxZS1mMjQ0LTRhZWEtODRmZi0zOTY5ZWI2ZmNlYjgiLCJzaWQiOiI5ZGQ0ZGQzOC00OWE2LTRiMWUtOWU2ZS0yYTRhNzBiZmYwMTgifQ.VH6ZVr_ak61EWgMNYhZkJrJ-mnYJR1r-ekRonln6lMk",
  "access_expires_at": "2026-10-31T18:08:52.639106354Z",
  "refresh_token": "aOVWUBkPCPqIJ2a2Bl6AeLkwQWY_EEeLgCPXYU3Sscw",
  "refresh_expires_at": "2026-11-30T17:53:52.638221483Z",
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
  "command_id": "efa55d20-6fe6-4d74-9c8f-fcda898a4f8b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:53:53Z",
    "sequence": 1793469233247
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "adfedb4e-184f-42b8-9767-43ee86cc6c92",
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
  "last_heartbeat_at": "2026-10-31T17:53:53.338161Z",
  "last_location_at": "2026-10-31T17:53:53.338161Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4cd9ab61-e1ca-4184-bd1f-e70d0b9c8b0d",
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
  "id": "42416514-5a75-4475-94c4-566bb8e7ee1b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T17:58:53.716846Z",
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
  "command_id": "52b86d5d-79a5-4945-aa95-5cd51458431c",
  "quote_id": "42416514-5a75-4475-94c4-566bb8e7ee1b",
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
  "id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ec4f59b4-e1b9-4f53-89ec-bfcfaf89c0a9",
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
  "created_at": "2026-10-31T17:53:54.126156Z",
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

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889` → **200**

```json
{
  "id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "short_number": 1,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ec4f59b4-e1b9-4f53-89ec-bfcfaf89c0a9",
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
  "created_at": "2026-10-31T17:53:54.126156Z",
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

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889` → **200**

```json
{
  "id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ec4f59b4-e1b9-4f53-89ec-bfcfaf89c0a9",
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
  "created_at": "2026-10-31T17:53:54.126156Z",
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
    "id": "23d16d17-0456-4bdf-8870-8e60df977838",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "expires_at": "2026-10-31T17:54:09.525045Z",
    "server_time": "2026-10-31T17:53:56.115138384Z",
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

`POST /api/driver/v1/offers/23d16d17-0456-4bdf-8870-8e60df977838/accept` → **200**

```json
{
  "command_id": "913bbc0c-886d-4a59-bdcb-9ed725046042"
}
```

```json
{
  "id": "92169330-feca-4e9f-a145-49e1d20048f7",
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f06805e5-033f-4fd2-bbe2-137092893ac9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f06805e5-033f-4fd2-bbe2-137092893ac9",
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "assignment_id": "92169330-feca-4e9f-a145-49e1d20048f7",
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

`POST /api/driver/v1/work-sessions/adfedb4e-184f-42b8-9767-43ee86cc6c92/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:53:57Z",
    "sequence": 1793469237317
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "adfedb4e-184f-42b8-9767-43ee86cc6c92",
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
  "last_heartbeat_at": "2026-10-31T17:53:57.055872Z",
  "last_location_at": "2026-10-31T17:53:57.055872Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/f06805e5-033f-4fd2-bbe2-137092893ac9/arrive` → **200**

```json
{
  "command_id": "e55ae17a-e529-4568-a1e8-f24a553f36e4",
  "expected_version": 0
}
```

```json
{
  "id": "f06805e5-033f-4fd2-bbe2-137092893ac9",
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "assignment_id": "92169330-feca-4e9f-a145-49e1d20048f7",
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
  "arrived_at": "2026-10-31T17:53:57.372949Z",
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

`POST /api/driver/v1/trips/f06805e5-033f-4fd2-bbe2-137092893ac9/start` → **200**

```json
{
  "command_id": "f341dac0-c686-48de-8310-37eba2101507",
  "expected_version": 1
}
```

```json
{
  "id": "f06805e5-033f-4fd2-bbe2-137092893ac9",
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "assignment_id": "92169330-feca-4e9f-a145-49e1d20048f7",
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
  "arrived_at": "2026-10-31T17:53:57.372949Z",
  "started_at": "2026-10-31T17:53:57.685081Z",
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

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889` → **200**

```json
{
  "id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "ec4f59b4-e1b9-4f53-89ec-bfcfaf89c0a9",
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
    "id": "92169330-feca-4e9f-a145-49e1d20048f7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f06805e5-033f-4fd2-bbe2-137092893ac9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:53:54.126156Z",
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

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889` → **200**

```json
{
  "id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "ec4f59b4-e1b9-4f53-89ec-bfcfaf89c0a9",
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
    "id": "92169330-feca-4e9f-a145-49e1d20048f7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f06805e5-033f-4fd2-bbe2-137092893ac9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:53:54.126156Z",
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

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889` → **200**

```json
{
  "id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "ec4f59b4-e1b9-4f53-89ec-bfcfaf89c0a9",
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
    "id": "92169330-feca-4e9f-a145-49e1d20048f7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f06805e5-033f-4fd2-bbe2-137092893ac9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:53:54.126156Z",
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

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889` → **200**

```json
{
  "id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "ec4f59b4-e1b9-4f53-89ec-bfcfaf89c0a9",
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
    "id": "92169330-feca-4e9f-a145-49e1d20048f7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f06805e5-033f-4fd2-bbe2-137092893ac9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T17:53:54.126156Z",
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

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": true,
  "tip": null
}
```

Tip 1600 on order 5c849eb1-6b6b-49d5-b3cc-eca29b8f7889; the bank journal has 5 lines before it.
Crash point payment.after-send:TIP reached: halting as kill -9 would

The server halted at its crash point (exit 137).

Server start 2.

The worker asks the bank about the operation once its 2-minute lease has run out.

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

`GET /api/rider/v1/orders/5c849eb1-6b6b-49d5-b3cc-eca29b8f7889/tip` → **200**

```json
{
  "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CARD",
  "available_until": "2026-11-01T17:53:58.001574Z",
  "open": false,
  "tip": {
    "id": "023f49fd-8e72-47e8-9cf7-e3344ec906b7",
    "order_id": "5c849eb1-6b6b-49d5-b3cc-eca29b8f7889",
    "amount_minor": 1600,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-31T17:54:02.601698Z"
  }
}
```

Charges the bank received for the tip: **2**.

**The tip was charged 2 times.**
