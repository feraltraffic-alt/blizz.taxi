# Fault tests (2026-10-31T17:59:33Z, b70f5cf, break: outbox)

## Dispatch: the driver's accept is committed, the server dies before it answers; the app retries

Server start 1, armed at `dispatch.after-accept`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674078262",
  "device_ref": "sandbox-26116"
}
```

```json
{
  "challenge_id": "02763b5d-36e3-4cfd-aec4-43c282cf05f2",
  "expires_at": "2026-10-31T18:04:46.655291003Z",
  "resend_available_at": "2026-10-31T17:59:47.655291003Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674078262` → **200**

```json
{
  "phone": "+380674078262",
  "audience": "CLIENT",
  "code": "645220",
  "sent_at": "2026-10-31T17:59:46.669474569Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "02763b5d-36e3-4cfd-aec4-43c282cf05f2",
  "code": "645220",
  "device_ref": "sandbox-26116"
}
```

```json
{
  "session_id": "37853519-0bca-4097-a885-19a5a6949dd5",
  "subject": {
    "type": "CLIENT",
    "id": "e44cfbc4-d744-4c58-835c-a47acc59714d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNDRjZmJjNC1kNzQ0LTRjNTgtODM1Yy1hNDdhY2M1OTcxNGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDcwNDk1LCJpYXQiOjE3OTM0Njk1OTUsImp0aSI6IjdlZTVlYTdkLTExOGQtNGZkMy04OTJmLWY1ZTdjZTU4YzQ5MSIsInNpZCI6IjM3ODUzNTE5LTBiY2EtNDA5Ny1hODg1LTE5YTVhNjk0OWRkNSJ9.eIMqnPO7RQwDxf0Eg7Gpuk_hIhqIk6kd3pfH8B_Gj7M",
  "access_expires_at": "2026-10-31T18:14:55.503489525Z",
  "refresh_token": "GaTkzecCFjvez-uRot6X8jjg6nTTqjQHORB6FMoNwBU",
  "refresh_expires_at": "2026-11-30T17:59:55.501911289Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-23889"
}
```

```json
{
  "challenge_id": "9b72e9e6-eaef-48f3-8967-b75261bb5986",
  "expires_at": "2026-10-31T18:04:55.950276342Z",
  "resend_available_at": "2026-10-31T17:59:56.950276342Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "514872",
  "sent_at": "2026-10-31T17:59:55.955193832Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9b72e9e6-eaef-48f3-8967-b75261bb5986",
  "code": "514872",
  "device_ref": "sandbox-23889"
}
```

```json
{
  "session_id": "52dfa2d8-a67f-4c1a-9f46-405d762dcc77",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3MDQ5NiwiaWF0IjoxNzkzNDY5NTk2LCJqdGkiOiI2YjU0ZWY1My1iNTcxLTRlNzMtYjlkYi00N2E1MjkwYmJmN2YiLCJzaWQiOiI1MmRmYTJkOC1hNjdmLTRjMWEtOWY0Ni00MDVkNzYyZGNjNzcifQ.QSA3_09zWmz62hn7U-dKz6-yeNAE7N0RJCyzpHumPdg",
  "access_expires_at": "2026-10-31T18:14:56.224042005Z",
  "refresh_token": "6-lk6vlGWdCbH4WP_1_wixnjnsCPkg7lGHxDGBNUT5o",
  "refresh_expires_at": "2026-11-30T17:59:56.223171557Z",
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
  "command_id": "6b97427d-ff53-4088-8728-4e9ea4610361",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:59:56Z",
    "sequence": 1793469596747
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7623fa5a-755c-46ae-9f83-391d3896626a",
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
  "last_heartbeat_at": "2026-10-31T17:59:56.881546Z",
  "last_location_at": "2026-10-31T17:59:56.881546Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3c4d4ab7-9e4b-4752-966a-7c605148c9f3",
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
  "id": "b0b90fe8-8070-4253-976b-1f2c7131c3f7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T18:04:57.168700Z",
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
  "command_id": "94be95a7-37e8-4393-b8dd-942a64930539",
  "quote_id": "b0b90fe8-8070-4253-976b-1f2c7131c3f7",
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
  "id": "8f7be6bc-56bc-4d3a-80bc-603829754440",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e44cfbc4-d744-4c58-835c-a47acc59714d",
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
  "created_at": "2026-10-31T17:59:57.486971Z",
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
    "id": "5a1b8c06-415d-4488-92f7-02cdff9023d9",
    "order_id": "8f7be6bc-56bc-4d3a-80bc-603829754440",
    "expires_at": "2026-10-31T18:00:12.495852Z",
    "server_time": "2026-10-31T17:59:57.809394568Z",
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

Server start 2.

`POST /api/driver/v1/offers/5a1b8c06-415d-4488-92f7-02cdff9023d9/accept` → **200**

```json
{
  "command_id": "e392591c-ce29-4742-a34a-797cb4573311"
}
```

```json
{
  "id": "34c11bd8-b920-4566-8d77-f8b88873689b",
  "order_id": "8f7be6bc-56bc-4d3a-80bc-603829754440",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e5e8ed70-2b43-4052-8a5e-d73eb00a1652",
  "trip_phase": "TO_PICKUP"
}
```

The retry with the same command: HTTP 200.

One assignment, and the retry returned it.

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e5e8ed70-2b43-4052-8a5e-d73eb00a1652",
  "order_id": "8f7be6bc-56bc-4d3a-80bc-603829754440",
  "assignment_id": "34c11bd8-b920-4566-8d77-f8b88873689b",
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

`POST /api/driver/v1/work-sessions/7623fa5a-755c-46ae-9f83-391d3896626a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T18:00:07Z",
    "sequence": 1793469607772
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7623fa5a-755c-46ae-9f83-391d3896626a",
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
  "last_heartbeat_at": "2026-10-31T18:00:07.838724Z",
  "last_location_at": "2026-10-31T18:00:07.838724Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/e5e8ed70-2b43-4052-8a5e-d73eb00a1652/arrive` → **200**

```json
{
  "command_id": "304cd44b-e4c6-4afa-acda-ac9a4f5189d2",
  "expected_version": 0
}
```

```json
{
  "id": "e5e8ed70-2b43-4052-8a5e-d73eb00a1652",
  "order_id": "8f7be6bc-56bc-4d3a-80bc-603829754440",
  "assignment_id": "34c11bd8-b920-4566-8d77-f8b88873689b",
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
  "arrived_at": "2026-10-31T18:00:08.112495Z",
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

`POST /api/driver/v1/trips/e5e8ed70-2b43-4052-8a5e-d73eb00a1652/start` → **200**

```json
{
  "command_id": "f301e49d-6be5-4a29-938e-fd9b3684f19f",
  "expected_version": 1
}
```

```json
{
  "id": "e5e8ed70-2b43-4052-8a5e-d73eb00a1652",
  "order_id": "8f7be6bc-56bc-4d3a-80bc-603829754440",
  "assignment_id": "34c11bd8-b920-4566-8d77-f8b88873689b",
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
  "arrived_at": "2026-10-31T18:00:08.112495Z",
  "started_at": "2026-10-31T18:00:08.378322Z",
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
  "session_id": "7623fa5a-755c-46ae-9f83-391d3896626a",
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
  "last_heartbeat_at": "2026-10-31T18:00:07.838724Z",
  "last_location_at": "2026-10-31T18:00:07.838724Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7623fa5a-755c-46ae-9f83-391d3896626a/close` → **200**

```json
{
  "command_id": "d3b947dc-6e8a-45c8-a605-c32884d5a77c",
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
  "phone": "+380672930315",
  "device_ref": "sandbox-19130"
}
```

```json
{
  "challenge_id": "0494f940-bba6-4c43-a734-ce1f0b5b1443",
  "expires_at": "2026-10-31T18:05:19.094101911Z",
  "resend_available_at": "2026-10-31T18:00:20.094101911Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672930315` → **000**

```json
{
  "challenge_id": "0494f940-bba6-4c43-a734-ce1f0b5b1443",
  "expires_at": "2026-10-31T18:05:19.094101911Z",
  "resend_available_at": "2026-10-31T18:00:20.094101911Z",
  "channel": "SMS"
}
```

**Expected 200, got 000 — scenario stopped.**
