# Sandbox transcript (2026-10-27T13:10:28Z, be50623)

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2122"
}
```

```json
{
  "challenge_id": "6f52cbf2-67b1-4913-9487-d616539dcc4e",
  "expires_at": "2026-10-27T13:15:28.425591325Z",
  "resend_available_at": "2026-10-27T13:10:29.425591325Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "833943",
  "sent_at": "2026-10-27T13:10:28.432936578Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6f52cbf2-67b1-4913-9487-d616539dcc4e",
  "code": "833943",
  "device_ref": "sandbox-2122"
}
```

```json
{
  "session_id": "3fd7ae7f-55e2-4f87-9bec-16e7a87fa69e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwNzUyOCwiaWF0IjoxNzkzMTA2NjI4LCJqdGkiOiI0OTI1NTM2Mi1iNWE5LTRmMTQtOGVmMi0yNWRlMzAxN2I0MjAiLCJzaWQiOiIzZmQ3YWU3Zi01NWUyLTRmODctOWJlYy0xNmU3YTg3ZmE2OWUifQ._JFm_uT6TI8Kvq20A5dS7m7SbMg3O2UnLdBeqny0zkc",
  "access_expires_at": "2026-10-27T13:25:28.53400258Z",
  "refresh_token": "o00NPtlgbX-KLMlwLsCcZGrtqVb8vU7g_uyNG3Wg-Is",
  "refresh_expires_at": "2026-11-26T13:10:28.531214961Z",
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
  "command_id": "c1434c73-f629-4dae-bfdc-955bd0baa4f0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:10:28Z",
    "sequence": 1793106628704
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bd435c43-2325-4355-ab46-96d8b5ad0c3d",
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
  "last_heartbeat_at": "2026-10-27T13:10:28.792749Z",
  "last_location_at": "2026-10-27T13:10:28.792749Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678309035",
  "device_ref": "sandbox-112"
}
```

```json
{
  "challenge_id": "9c363915-e5be-4574-81a4-85e9fb7d963f",
  "expires_at": "2026-10-27T13:15:28.836373671Z",
  "resend_available_at": "2026-10-27T13:10:29.836373671Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678309035` → **200**

```json
{
  "phone": "+380678309035",
  "audience": "CLIENT",
  "code": "733497",
  "sent_at": "2026-10-27T13:10:28.840011617Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c363915-e5be-4574-81a4-85e9fb7d963f",
  "code": "733497",
  "device_ref": "sandbox-112"
}
```

```json
{
  "session_id": "1a899f03-2e24-47a3-8f28-9a9f568f3256",
  "subject": {
    "type": "CLIENT",
    "id": "2d42f322-23b3-4fed-8d1d-693f80784f70"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZDQyZjMyMi0yM2IzLTRmZWQtOGQxZC02OTNmODA3ODRmNzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTA3NTI4LCJpYXQiOjE3OTMxMDY2MjgsImp0aSI6IjI0NTk0NWU2LWJmMjctNGYyZi1hNjU0LTQ0NGE1NzAyYWU1NCIsInNpZCI6IjFhODk5ZjAzLTJlMjQtNDdhMy04ZjI4LTlhOWY1NjhmMzI1NiJ9.bz9VaJ5KgGmPMlv8Lz-NbjJyKOhRjkHymR-xX0_G_Vo",
  "access_expires_at": "2026-10-27T13:25:28.902433454Z",
  "refresh_token": "xYQn92z30-nd1KmP-1GHDgf7Zc0LResamY8OXVU_6mM",
  "refresh_expires_at": "2026-11-26T13:10:28.900925323Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fe890587-b01c-4f34-b598-f3302021808c",
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
  "id": "17a69eb8-e965-49ff-a0a5-40c42bc47a9d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T13:15:28.983057Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d86b192b-cd04-496a-8621-31e75b974cf4",
  "quote_id": "17a69eb8-e965-49ff-a0a5-40c42bc47a9d",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Ratings pickup",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "dropoff_label": "Ratings dropoff",
  "payment_method": "CASH"
}
```

```json
{
  "id": "5b838a35-2ec1-4f5e-b111-9e4ed421e151",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d42f322-23b3-4fed-8d1d-693f80784f70",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Ratings pickup",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Ratings dropoff",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-27T13:10:29.095964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

## Driver accepts and completes the ride

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "db4e7279-eb8e-493b-a1e1-b575bda953cf",
    "order_id": "5b838a35-2ec1-4f5e-b111-9e4ed421e151",
    "expires_at": "2026-10-27T13:10:44.10799Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "pickup_label": "Ratings pickup",
    "dropoff_label": "Ratings dropoff",
    "payment_method": "CASH",
    "price_minor": 10517,
    "currency": "UAH",
    "distance_m": 211
  }
]
```

`POST /api/driver/v1/offers/db4e7279-eb8e-493b-a1e1-b575bda953cf/accept` → **200**

```json
{
  "command_id": "7cf74e7d-e701-4f86-a5f4-7303db5bfcbf"
}
```

```json
{
  "id": "254a3014-5bc9-418f-9279-26274090db2b",
  "order_id": "5b838a35-2ec1-4f5e-b111-9e4ed421e151",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5ebb0cff-68b5-4120-ac9a-41102c97ec5f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5ebb0cff-68b5-4120-ac9a-41102c97ec5f",
  "order_id": "5b838a35-2ec1-4f5e-b111-9e4ed421e151",
  "assignment_id": "254a3014-5bc9-418f-9279-26274090db2b",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Ratings pickup",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Ratings dropoff",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/work-sessions/bd435c43-2325-4355-ab46-96d8b5ad0c3d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:10:29Z",
    "sequence": 1793106629284
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bd435c43-2325-4355-ab46-96d8b5ad0c3d",
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
  "last_heartbeat_at": "2026-10-27T13:10:29.306722Z",
  "last_location_at": "2026-10-27T13:10:29.306722Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5ebb0cff-68b5-4120-ac9a-41102c97ec5f",
  "order_id": "5b838a35-2ec1-4f5e-b111-9e4ed421e151",
  "assignment_id": "254a3014-5bc9-418f-9279-26274090db2b",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Ratings pickup",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Ratings dropoff",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/5ebb0cff-68b5-4120-ac9a-41102c97ec5f/arrive` → **200**

```json
{
  "command_id": "144e8e5e-8309-44ad-9175-1e159733e3a9",
  "expected_version": 0
}
```

```json
{
  "id": "5ebb0cff-68b5-4120-ac9a-41102c97ec5f",
  "order_id": "5b838a35-2ec1-4f5e-b111-9e4ed421e151",
  "assignment_id": "254a3014-5bc9-418f-9279-26274090db2b",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Ratings pickup",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Ratings dropoff",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-27T13:10:29.397685Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/5ebb0cff-68b5-4120-ac9a-41102c97ec5f/start` → **200**

```json
{
  "command_id": "7df2ac75-51a6-492d-a3d2-266a751fa69a",
  "expected_version": 1
}
```

```json
{
  "id": "5ebb0cff-68b5-4120-ac9a-41102c97ec5f",
  "order_id": "5b838a35-2ec1-4f5e-b111-9e4ed421e151",
  "assignment_id": "254a3014-5bc9-418f-9279-26274090db2b",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Ratings pickup",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Ratings dropoff",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-27T13:10:29.397685Z",
  "started_at": "2026-10-27T13:10:29.453685Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/work-sessions/bd435c43-2325-4355-ab46-96d8b5ad0c3d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:10:29Z",
    "sequence": 1793106629490
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bd435c43-2325-4355-ab46-96d8b5ad0c3d",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "ON_TRIP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-27T13:10:29.510455Z",
  "last_location_at": "2026-10-27T13:10:29.510455Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/5ebb0cff-68b5-4120-ac9a-41102c97ec5f/complete` → **200**

```json
{
  "command_id": "4d3c2af2-e7a7-4560-bb5d-8f3930078ddf",
  "expected_version": 2,
  "reported_at": "2026-10-27T13:10:29Z",
  "cash_received": true
}
```

```json
{
  "id": "5ebb0cff-68b5-4120-ac9a-41102c97ec5f",
  "order_id": "5b838a35-2ec1-4f5e-b111-9e4ed421e151",
  "assignment_id": "254a3014-5bc9-418f-9279-26274090db2b",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Ratings pickup",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Ratings dropoff",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-27T13:10:29.397685Z",
  "started_at": "2026-10-27T13:10:29.453685Z",
  "completed_at": "2026-10-27T13:10:29.562304Z",
  "needs_review": false
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/5b838a35-2ec1-4f5e-b111-9e4ed421e151/rating` → **200**

```json
{
  "command_id": "3c6e0a11-e625-4ab7-af2a-2d100c7fc3d2",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "5b838a35-2ec1-4f5e-b111-9e4ed421e151",
  "score": 5,
  "created_at": "2026-10-27T13:10:29.632199758Z"
}
```

`POST /api/driver/v1/orders/5b838a35-2ec1-4f5e-b111-9e4ed421e151/rating` → **200**

```json
{
  "command_id": "9b9dbac8-aa70-4060-b44e-7f914abc374f",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "5b838a35-2ec1-4f5e-b111-9e4ed421e151",
  "score": 4,
  "created_at": "2026-10-27T13:10:29.669942881Z"
}
```

## Driver sees only aggregate score

`GET /api/driver/v1/me/rating` → **200**

```json
{
  "score_sum": 5,
  "count": 1,
  "average_hundredths": 500
}
```

## Operator sees both staff-only comments

`POST /auth/v1/staff/sign-in` → **401**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "instance": "/auth/v1/staff/sign-in",
  "status": 401,
  "title": "Unauthenticated",
  "type": "https://errors.blizz.taxi/unauthenticated",
  "code": "UNAUTHENTICATED",
  "correlation_id": "273f16d0-f4e8-4d6d-b2af-fb16c81646ee"
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "54339eeb-71f1-4b9c-a1cf-b08d2b496914",
  "subject": {
    "type": "STAFF",
    "id": "18a2af36-408e-44e8-a858-6beab32b83e6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOGEyYWYzNi00MDhlLTQ0ZTgtYTg1OC02YmVhYjMyYjgzZTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDc1MzAsImlhdCI6MTc5MzEwNjYzMCwianRpIjoiMzI1NmI3MTUtZmQ1NC00YWU0LWJjYjgtOGEzYWZkMDYwNWRkIiwic2lkIjoiNTQzMzllZWItNzFmMS00YjljLWExY2YtYjA4ZDJiNDk2OTE0In0.HJBZRHgSpkBAa3nZbwKBfZKwFPAtmVcf1sA6YT5m02U",
  "access_expires_at": "2026-10-27T13:25:30.405657636Z",
  "refresh_token": "6HOEyQZsYU4CPkFbZxgg7K3mzJCaMhYXtNg4G5zuEaQ",
  "refresh_expires_at": "2026-10-28T01:10:30.404711677Z",
  "password_change_required": true
}
```

`POST /api/admin/v1/me/password` → **204**

```json
{
  "current_password": "Sandbox-Admin-2026",
  "new_password": "Sandbox-Admin-2026-ok"
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "d196a478-72aa-4fd2-a0d1-699a8aeeb704",
  "subject": {
    "type": "STAFF",
    "id": "18a2af36-408e-44e8-a858-6beab32b83e6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOGEyYWYzNi00MDhlLTQ0ZTgtYTg1OC02YmVhYjMyYjgzZTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDc1MzEsImlhdCI6MTc5MzEwNjYzMSwianRpIjoiZDAyMTMyZDctODkxZS00NDYxLTliZjQtZDkxYTY0OTQyNTViIiwic2lkIjoiZDE5NmE0NzgtNzJhYS00ZmQyLWEwZDEtNjk5YThhZWViNzA0In0.HCuQ9f6mpVOZESiCb8_FnWcUpNU82-nRIH2sPOac78w",
  "access_expires_at": "2026-10-27T13:25:31.647542652Z",
  "refresh_token": "Aojb3Neto2Hi6nAtpJSiMERS0gNk_ElblOlfhiloIl4",
  "refresh_expires_at": "2026-10-28T01:10:31.646677705Z",
  "password_change_required": false
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "d6d84020-9bf7-4215-828a-8858fddf0839",
  "subject": {
    "type": "STAFF",
    "id": "18a2af36-408e-44e8-a858-6beab32b83e6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOGEyYWYzNi00MDhlLTQ0ZTgtYTg1OC02YmVhYjMyYjgzZTYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDc1MzEsImlhdCI6MTc5MzEwNjYzMSwianRpIjoiNmNkNzE4YzktYzJjYi00YWY3LTk3NWQtMDdiOWE2YWYzZjQyIiwic2lkIjoiZDZkODQwMjAtOWJmNy00MjE1LTgyOGEtODg1OGZkZGYwODM5In0.YchZHwlXtJT6AfQUbhBQuVlJG0MBDizygAumTWXqfBQ",
  "access_expires_at": "2026-10-27T13:25:31.971627521Z",
  "refresh_token": "2rkFZO1W2yKc2owXNoirYea75S6ORFWj9QRnkdNUm7s",
  "refresh_expires_at": "2026-10-28T01:10:31.970795284Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5b838a35-2ec1-4f5e-b111-9e4ed421e151/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "5b838a35-2ec1-4f5e-b111-9e4ed421e151",
      "author_type": "RIDER",
      "author_id": "2d42f322-23b3-4fed-8d1d-693f80784f70",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T13:10:29.6322Z"
    },
    {
      "order_id": "5b838a35-2ec1-4f5e-b111-9e4ed421e151",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "2d42f322-23b3-4fed-8d1d-693f80784f70",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T13:10:29.669943Z"
    }
  ]
}
```

Done: ratings for order 5b838a35-2ec1-4f5e-b111-9e4ed421e151.
