# Fault tests (2026-10-31T21:54:19Z, 234f73b, break: outbox)

## Dispatch: the driver's accept is committed, the server dies before it answers; the app retries

Server start 1, armed at `dispatch.after-accept`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677277764",
  "device_ref": "sandbox-10748"
}
```

```json
{
  "challenge_id": "f957843b-ba77-48a8-b559-4cdb0b4f0a10",
  "expires_at": "2026-10-31T21:59:31.682207735Z",
  "resend_available_at": "2026-10-31T21:54:32.682207735Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677277764` → **200**

```json
{
  "phone": "+380677277764",
  "audience": "CLIENT",
  "code": "277965",
  "sent_at": "2026-10-31T21:54:31.694607856Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f957843b-ba77-48a8-b559-4cdb0b4f0a10",
  "code": "277965",
  "device_ref": "sandbox-10748"
}
```

```json
{
  "session_id": "0ca7ed3c-382f-43e7-a937-f36c6a50a49e",
  "subject": {
    "type": "CLIENT",
    "id": "e44dde0b-3d8e-4238-8365-4983801c2a6f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNDRkZGUwYi0zZDhlLTQyMzgtODM2NS00OTgzODAxYzJhNmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDg0NTc5LCJpYXQiOjE3OTM0ODM2NzksImp0aSI6IjNiZGE5MjNiLWUwYzQtNGM2MC05YTcyLTM3ZTQxNWQ1YTEzZiIsInNpZCI6IjBjYTdlZDNjLTM4MmYtNDNlNy1hOTM3LWYzNmM2YTUwYTQ5ZSJ9.jcUQr7vsx2hRe45dgrau5o3i89DVkXHvwrhjQXGPEsg",
  "access_expires_at": "2026-10-31T22:09:39.456368499Z",
  "refresh_token": "8j3-_jOz1DfBv5-wFjl1fhLhelskEWFF-n1icqPNFlg",
  "refresh_expires_at": "2026-11-30T21:54:39.454722967Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-3633"
}
```

```json
{
  "challenge_id": "53224269-e0aa-4173-9d6a-71d86f868ca3",
  "expires_at": "2026-10-31T21:59:39.749842884Z",
  "resend_available_at": "2026-10-31T21:54:40.749842884Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "064647",
  "sent_at": "2026-10-31T21:54:39.754283539Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "53224269-e0aa-4173-9d6a-71d86f868ca3",
  "code": "064647",
  "device_ref": "sandbox-3633"
}
```

```json
{
  "session_id": "d8968d56-c5cf-4116-9130-2f221fabc53a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ4NDU4MCwiaWF0IjoxNzkzNDgzNjgwLCJqdGkiOiIzZDQ4ODhjZS1kMTRmLTQ5ZmItOWQ0NS1hOTRmNzc2NDZlZjgiLCJzaWQiOiJkODk2OGQ1Ni1jNWNmLTQxMTYtOTEzMC0yZjIyMWZhYmM1M2EifQ.NIe63RhevhAN7Yk2ho1eZayJxhuytY6NFl8kR1jJoHE",
  "access_expires_at": "2026-10-31T22:09:40.028190218Z",
  "refresh_token": "-GqZrxviYHn7gQm3JW4ewVAAmBS83CShn5w-9bqnSiE",
  "refresh_expires_at": "2026-11-30T21:54:40.027460343Z",
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
  "command_id": "34b5529a-b696-4d80-ae20-58565040cf89",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T21:54:40Z",
    "sequence": 1793483680554
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bfa0e7f0-e4e5-43cc-8a0d-97c06291bc93",
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
  "last_heartbeat_at": "2026-10-31T21:54:40.680091Z",
  "last_location_at": "2026-10-31T21:54:40.680091Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "de03556e-1d6d-4c7f-a082-0f44a47f17e7",
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
  "id": "ba23f68b-445d-4217-9683-3ad6954acc3b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T21:59:40.989746Z",
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
  "command_id": "5970f322-0dae-4ca1-9652-9531c1701ee7",
  "quote_id": "ba23f68b-445d-4217-9683-3ad6954acc3b",
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
  "id": "27d86a92-04e1-4bc7-a79e-fffab373dfab",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e44dde0b-3d8e-4238-8365-4983801c2a6f",
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
  "created_at": "2026-10-31T21:54:41.477237Z",
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
    "id": "d33825b1-1b76-4799-b3e7-a87d9bef67b8",
    "order_id": "27d86a92-04e1-4bc7-a79e-fffab373dfab",
    "expires_at": "2026-10-31T21:54:56.485279Z",
    "server_time": "2026-10-31T21:54:41.82929407Z",
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

`POST /api/driver/v1/offers/d33825b1-1b76-4799-b3e7-a87d9bef67b8/accept` → **200**

```json
{
  "command_id": "5e584b23-3345-444d-acf2-c0b8177c45b6"
}
```

```json
{
  "id": "5ccb7e41-5faa-4807-a2b3-4b3b0ba9fd63",
  "order_id": "27d86a92-04e1-4bc7-a79e-fffab373dfab",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "56319c3c-05b6-476c-97a1-dac2f3fa2cd5",
  "trip_phase": "TO_PICKUP"
}
```

The retry with the same command: HTTP 200.

One assignment, and the retry returned it.

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "56319c3c-05b6-476c-97a1-dac2f3fa2cd5",
  "order_id": "27d86a92-04e1-4bc7-a79e-fffab373dfab",
  "assignment_id": "5ccb7e41-5faa-4807-a2b3-4b3b0ba9fd63",
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

`POST /api/driver/v1/work-sessions/bfa0e7f0-e4e5-43cc-8a0d-97c06291bc93/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T21:54:51Z",
    "sequence": 1793483691558
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bfa0e7f0-e4e5-43cc-8a0d-97c06291bc93",
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
  "last_heartbeat_at": "2026-10-31T21:54:51.633819Z",
  "last_location_at": "2026-10-31T21:54:51.633819Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/56319c3c-05b6-476c-97a1-dac2f3fa2cd5/arrive` → **200**

```json
{
  "command_id": "08b2a7b8-a22a-4d71-b89e-6b7292ef0bad",
  "expected_version": 0
}
```

```json
{
  "id": "56319c3c-05b6-476c-97a1-dac2f3fa2cd5",
  "order_id": "27d86a92-04e1-4bc7-a79e-fffab373dfab",
  "assignment_id": "5ccb7e41-5faa-4807-a2b3-4b3b0ba9fd63",
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
  "arrived_at": "2026-10-31T21:54:51.990726Z",
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

`POST /api/driver/v1/trips/56319c3c-05b6-476c-97a1-dac2f3fa2cd5/start` → **200**

```json
{
  "command_id": "9edf0707-1074-4953-9f1b-6cdd891a6f50",
  "expected_version": 1
}
```

```json
{
  "id": "56319c3c-05b6-476c-97a1-dac2f3fa2cd5",
  "order_id": "27d86a92-04e1-4bc7-a79e-fffab373dfab",
  "assignment_id": "5ccb7e41-5faa-4807-a2b3-4b3b0ba9fd63",
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
  "arrived_at": "2026-10-31T21:54:51.990726Z",
  "started_at": "2026-10-31T21:54:52.261627Z",
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
  "session_id": "bfa0e7f0-e4e5-43cc-8a0d-97c06291bc93",
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
  "last_heartbeat_at": "2026-10-31T21:54:51.633819Z",
  "last_location_at": "2026-10-31T21:54:51.633819Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bfa0e7f0-e4e5-43cc-8a0d-97c06291bc93/close` → **200**

```json
{
  "command_id": "05eba1a7-a52b-4260-a3c0-622d79f9d443",
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
  "phone": "+380678755600",
  "device_ref": "sandbox-1209"
}
```

```json
{
  "challenge_id": "9694be08-221f-4eee-9c05-321f8ebb5149",
  "expires_at": "2026-10-31T22:00:04.11251238Z",
  "resend_available_at": "2026-10-31T21:55:05.11251238Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678755600` → **200**

```json
{
  "phone": "+380678755600",
  "audience": "CLIENT",
  "code": "814026",
  "sent_at": "2026-10-31T21:55:04.126692379Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9694be08-221f-4eee-9c05-321f8ebb5149",
  "code": "814026",
  "device_ref": "sandbox-1209"
}
```

```json
{
  "session_id": "c5c6f6d3-d439-4617-964d-03fee90e25b1",
  "subject": {
    "type": "CLIENT",
    "id": "42ec5c9b-4aff-4180-b8cc-54ac3f7e7875"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmVjNWM5Yi00YWZmLTQxODAtYjhjYy01NGFjM2Y3ZTc4NzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDg0NjA0LCJpYXQiOjE3OTM0ODM3MDQsImp0aSI6IjQyNWFlYjU1LWYyZWMtNDJmNC1iMjM5LTVhN2NlZGVkNzIzMyIsInNpZCI6ImM1YzZmNmQzLWQ0MzktNDYxNy05NjRkLTAzZmVlOTBlMjViMSJ9.G8Cg6yfdQ4BO_OB8S33pCLy_Xv4nmQJa1MBGs50llKE",
  "access_expires_at": "2026-10-31T22:10:04.49339413Z",
  "refresh_token": "YN8bn0h9Kte_ZpKehLGZpvTeAUCMHD2H2bquiDsOiKM",
  "refresh_expires_at": "2026-11-30T21:55:04.490684328Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31651"
}
```

```json
{
  "challenge_id": "a7e100ec-f986-4935-9f0e-189dae4dff96",
  "expires_at": "2026-10-31T22:00:04.801607515Z",
  "resend_available_at": "2026-10-31T21:55:05.801607515Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "868908",
  "sent_at": "2026-10-31T21:55:04.807451177Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a7e100ec-f986-4935-9f0e-189dae4dff96",
  "code": "868908",
  "device_ref": "sandbox-31651"
}
```

```json
{
  "session_id": "7f4c3718-8984-4a31-9e1b-ab38a629c15f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ4NDYwNSwiaWF0IjoxNzkzNDgzNzA1LCJqdGkiOiJlMjY2YWVjYy0xOTY3LTQ4MzItOGY2OC0yZGFlZGE0NjdjMTQiLCJzaWQiOiI3ZjRjMzcxOC04OTg0LTRhMzEtOWUxYi1hYjM4YTYyOWMxNWYifQ.KAjVY16I8N62ZW4grkyg-YUf-O-dX7B2o3u22Ug1ZNQ",
  "access_expires_at": "2026-10-31T22:10:05.100230762Z",
  "refresh_token": "zSphQ1R8c9fFrMzzHL6r0kvOtVndClktBJl-JoTSBlo",
  "refresh_expires_at": "2026-11-30T21:55:05.099133353Z",
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
  "command_id": "b13696ab-568f-4533-9671-2faa886e7632",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T21:55:05Z",
    "sequence": 1793483705707
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3eaf9e34-7b8a-42ad-bf7f-340a2ec9f64a",
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
  "last_heartbeat_at": "2026-10-31T21:55:05.762034Z",
  "last_location_at": "2026-10-31T21:55:05.762034Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "949d2543-5a28-40dd-8d5a-d84c620a4706",
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
  "id": "2540b9ef-df02-4933-a72e-c5f17001594d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T22:00:06.078192Z",
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
  "command_id": "9e3f5f90-908a-46c2-8ee3-759394bc8901",
  "quote_id": "2540b9ef-df02-4933-a72e-c5f17001594d",
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
  "id": "fe391b1d-26cc-4edd-ba12-e6912980d62c",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "42ec5c9b-4aff-4180-b8cc-54ac3f7e7875",
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
  "created_at": "2026-10-31T21:55:06.437483Z",
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
    "id": "1ee231d8-ec3b-46bc-a32b-4022a05c5824",
    "order_id": "fe391b1d-26cc-4edd-ba12-e6912980d62c",
    "expires_at": "2026-10-31T21:55:21.449142Z",
    "server_time": "2026-10-31T21:55:06.768899714Z",
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

`POST /api/driver/v1/offers/1ee231d8-ec3b-46bc-a32b-4022a05c5824/accept` → **200**

```json
{
  "command_id": "8f97d405-09f4-473d-b23f-febafa042fc0"
}
```

```json
{
  "id": "24884a5b-5424-4712-8855-5cb2943f02bb",
  "order_id": "fe391b1d-26cc-4edd-ba12-e6912980d62c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "667fc86c-8c27-4471-83f1-59a611a0e0cb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "667fc86c-8c27-4471-83f1-59a611a0e0cb",
  "order_id": "fe391b1d-26cc-4edd-ba12-e6912980d62c",
  "assignment_id": "24884a5b-5424-4712-8855-5cb2943f02bb",
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

`POST /api/driver/v1/work-sessions/3eaf9e34-7b8a-42ad-bf7f-340a2ec9f64a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T21:55:07Z",
    "sequence": 1793483707568
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3eaf9e34-7b8a-42ad-bf7f-340a2ec9f64a",
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
  "last_heartbeat_at": "2026-10-31T21:55:07.592308Z",
  "last_location_at": "2026-10-31T21:55:07.592308Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/667fc86c-8c27-4471-83f1-59a611a0e0cb/arrive` → **200**

```json
{
  "command_id": "a6d3c48c-9876-42e9-9791-1143ef13ed1a",
  "expected_version": 0
}
```

```json
{
  "id": "667fc86c-8c27-4471-83f1-59a611a0e0cb",
  "order_id": "fe391b1d-26cc-4edd-ba12-e6912980d62c",
  "assignment_id": "24884a5b-5424-4712-8855-5cb2943f02bb",
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
  "arrived_at": "2026-10-31T21:55:07.862682Z",
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

`POST /api/driver/v1/trips/667fc86c-8c27-4471-83f1-59a611a0e0cb/start` → **200**

```json
{
  "command_id": "d5db9a7d-05a1-423a-a1aa-16bdbb69b0f0",
  "expected_version": 1
}
```

```json
{
  "id": "667fc86c-8c27-4471-83f1-59a611a0e0cb",
  "order_id": "fe391b1d-26cc-4edd-ba12-e6912980d62c",
  "assignment_id": "24884a5b-5424-4712-8855-5cb2943f02bb",
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
  "arrived_at": "2026-10-31T21:55:07.862682Z",
  "started_at": "2026-10-31T21:55:08.137567Z",
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

TripCompleted d76454d6-6b56-483d-845d-ee81eb6ab59f: PENDING after the crash.

Server start 4.

Consumers of the crashed event: `backoffice.problem-queues finance.trip-fare-posting finance.wallet-order-settlement notification.order-live-feed notification.push-feed operator-bonuses payments.trip-capture promotions.driver-trips promotions.trip-rewards`.

Live messages of the crashed event: **2** (sent before the crash, not again after it).

**The live message went out 2 times.**
