# Sandbox transcript (2026-10-27T16:13:23Z, 4de5c04)

# Scenario: bonuses

## The admin starts «Осінь −10 %» in Kyiv

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
  "correlation_id": "19b7eb0c-3879-4b92-a417-75e9600390b3"
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
  "session_id": "e45c5b61-e397-4ace-b9ac-6198fbdbe160",
  "subject": {
    "type": "STAFF",
    "id": "e5e7800f-85c9-49ac-b87f-a953b2fb2378"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWU3ODAwZi04NWM5LTQ5YWMtYjg3Zi1hOTUzYjJmYjIzNzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg1MDMsImlhdCI6MTc5MzExNzYwMywianRpIjoiYjhiODZiMjAtNmQ5NC00MTBkLTg1NWQtZWJlZTc2NTEyYjEyIiwic2lkIjoiZTQ1YzViNjEtZTM5Ny00YWNlLWI5YWMtNjE5OGZiZGJlMTYwIn0.ROvCUQ6nzzKoebXV8gtWVD7Oh2sQR7DbjgTAob1RwWY",
  "access_expires_at": "2026-10-27T16:28:23.864448871Z",
  "refresh_token": "DtpPTbXLJmcChqOENKaTC1TXK7LUm-AuNdA5JFZljDo",
  "refresh_expires_at": "2026-10-28T04:13:23.861501397Z",
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
  "session_id": "293288fb-97b1-46e3-9ce1-7d49dee77ab7",
  "subject": {
    "type": "STAFF",
    "id": "e5e7800f-85c9-49ac-b87f-a953b2fb2378"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWU3ODAwZi04NWM5LTQ5YWMtYjg3Zi1hOTUzYjJmYjIzNzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg1MDUsImlhdCI6MTc5MzExNzYwNSwianRpIjoiZjhlZjRjMjItMTQyMC00MmJhLWIzNDktYTBiOGRlMWU5NDk0Iiwic2lkIjoiMjkzMjg4ZmItOTdiMS00NmUzLTljZTEtN2Q0OWRlZTc3YWI3In0.dRtytf3JMhpYmPrQyPxxooBR54I6Ow9u_NOJyihbhFg",
  "access_expires_at": "2026-10-27T16:28:25.18546077Z",
  "refresh_token": "8OOU_PYxFIV8s00xUb0KL2IidFqoPel2QOVYCu1InS8",
  "refresh_expires_at": "2026-10-28T04:13:25.18422193Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "706d78d7-faec-4c30-b753-115267368217",
  "reason": "Осіння акція",
  "promotion": {
    "name": "Осінь −10 %",
    "kind": "DISCOUNT",
    "value_type": "PERCENT",
    "value": 1000,
    "conditions": {
      "city_id": "5a000000-0000-4000-8000-000000000001"
    }
  }
}
```

```json
{
  "id": "62fea038-f137-492e-b444-23a0ce53832d",
  "name": "Осінь −10 %",
  "kind": "DISCOUNT",
  "value_type": "PERCENT",
  "value": 1000,
  "currency": null,
  "conditions": {
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "vehicle_class": null,
    "every_nth_trip": null,
    "days_of_week": null,
    "time_from": null,
    "time_to": null,
    "pickup_zone_id": null,
    "dropoff_zone_id": null,
    "starts_at": null,
    "ends_at": null
  },
  "state": "ACTIVE",
  "version": 1,
  "created_by": "e5e7800f-85c9-49ac-b87f-a953b2fb2378",
  "created_at": "2026-10-27T16:13:25.25414Z",
  "updated_at": "2026-10-27T16:13:25.25414Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630817025",
  "device_ref": "sandbox-10455"
}
```

```json
{
  "challenge_id": "e43f94df-e299-4ae9-bda4-496c4354f3ad",
  "expires_at": "2026-10-27T16:18:25.309055912Z",
  "resend_available_at": "2026-10-27T16:13:26.309055912Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630817025` → **200**

```json
{
  "phone": "+380630817025",
  "audience": "CLIENT",
  "code": "212554",
  "sent_at": "2026-10-27T16:13:25.316332189Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e43f94df-e299-4ae9-bda4-496c4354f3ad",
  "code": "212554",
  "device_ref": "sandbox-10455"
}
```

```json
{
  "session_id": "123133cb-fb9c-40a8-876f-066be3cd7a67",
  "subject": {
    "type": "CLIENT",
    "id": "ccccc9fe-2e8b-4786-996b-32d3f2261351"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjY2NjYzlmZS0yZThiLTQ3ODYtOTk2Yi0zMmQzZjIyNjEzNTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4NTA1LCJpYXQiOjE3OTMxMTc2MDUsImp0aSI6IjhjZDZmODYxLWYyOTgtNGEyYi1hN2Q4LTAzMWRmNmExNDQyNSIsInNpZCI6IjEyMzEzM2NiLWZiOWMtNDBhOC04NzZmLTA2NmJlM2NkN2E2NyJ9.cXjBRTGAX5cCd_-TsQMA3YDHh2rshNPqXVSgSYVSSd0",
  "access_expires_at": "2026-10-27T16:28:25.402648641Z",
  "refresh_token": "UpyECR50jvgM0zQ5IgpyK5pPv8_hRZkV2EgglXVUlw0",
  "refresh_expires_at": "2026-11-26T16:13:25.401381449Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380630817025` → **200**

```json
{
  "client_id": "ccccc9fe-2e8b-4786-996b-32d3f2261351"
}
```

`POST /api/admin/v1/rider-wallets/ccccc9fe-2e8b-4786-996b-32d3f2261351/top-ups` → **201**

```json
{
  "command_id": "3b05240c-5e52-44b9-ae6e-857e6e68b9b3",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "ccccc9fe-2e8b-4786-996b-32d3f2261351",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 5000,
      "reserved_minor": 0,
      "available_minor": 5000
    }
  ],
  "entries": [
    {
      "id": "4fd99c34-53fa-4da8-b5c2-c9898d958554",
      "at": "2026-10-27T16:13:25.495364Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e5e7800f-85c9-49ac-b87f-a953b2fb2378",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d15a6a65-3faf-4055-b5a9-779cba6c003c",
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
  "id": "594d4b30-d61e-46cc-b492-32f2c4d9b01d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:18:25.673443Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 1052,
  "to_pay_minor": 9465,
  "promotions": [
    {
      "id": "62fea038-f137-492e-b444-23a0ce53832d",
      "name": "Осінь −10 %",
      "kind": "DISCOUNT",
      "value_type": "PERCENT",
      "value": 1000,
      "discount_minor": 1052
    }
  ]
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-5968"
}
```

```json
{
  "challenge_id": "638dcc48-d5ef-4daa-9086-21a5de0b3624",
  "expires_at": "2026-10-27T16:18:25.752593268Z",
  "resend_available_at": "2026-10-27T16:13:26.752593268Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "277597",
  "sent_at": "2026-10-27T16:13:25.756764048Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "638dcc48-d5ef-4daa-9086-21a5de0b3624",
  "code": "277597",
  "device_ref": "sandbox-5968"
}
```

```json
{
  "session_id": "beaeacb1-c6ba-46a4-843d-4a99dec01ef7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODUwNSwiaWF0IjoxNzkzMTE3NjA1LCJqdGkiOiIxNDdlODY0ZS1iN2NkLTQ1NDQtOGNhOS1mN2JiYjA5ZmNlNTQiLCJzaWQiOiJiZWFlYWNiMS1jNmJhLTQ2YTQtODQzZC00YTk5ZGVjMDFlZjcifQ.I1Qcn2DWFQIcslABZYFmKcsqq3-OviEIBGZnnqAbQ38",
  "access_expires_at": "2026-10-27T16:28:25.819777277Z",
  "refresh_token": "P2hutESyuYARvNrNwiubqHIG_4AFLuf8ZDv5qz5oces",
  "refresh_expires_at": "2026-11-26T16:13:25.818672321Z",
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
  "command_id": "6440d2b7-a994-4de6-855d-059c746cdd13",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:13:25Z",
    "sequence": 1793117605890
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dedafff1-d5ff-427b-b526-13094620f12b",
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
  "last_heartbeat_at": "2026-10-27T16:13:25.938187Z",
  "last_location_at": "2026-10-27T16:13:25.938187Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b1686ae7-4dd7-4d77-a4c3-a3f4f86ca2c2",
  "quote_id": "594d4b30-d61e-46cc-b492-32f2c4d9b01d",
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
  "payment_method": "CASH",
  "wallet_minor": 2000
}
```

```json
{
  "id": "538d2526-184c-4884-949f-e99ecec0f0d6",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ccccc9fe-2e8b-4786-996b-32d3f2261351",
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
  "created_at": "2026-10-27T16:13:26.027944Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "ccccc9fe-2e8b-4786-996b-32d3f2261351",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 5000,
      "reserved_minor": 2000,
      "available_minor": 3000
    }
  ],
  "entries": [
    {
      "id": "4fd99c34-53fa-4da8-b5c2-c9898d958554",
      "at": "2026-10-27T16:13:25.495364Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e5e7800f-85c9-49ac-b87f-a953b2fb2378",
      "order_id": null
    }
  ]
}
```

## Ivan drives; he collects the price minus the discount and the bonuses

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "39b7cd6f-d56c-4a3e-bfa8-ab832e54b37a",
    "order_id": "538d2526-184c-4884-949f-e99ecec0f0d6",
    "expires_at": "2026-10-27T16:13:41.04551Z",
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
    "distance_m": 211
  }
]
```

`POST /api/driver/v1/offers/39b7cd6f-d56c-4a3e-bfa8-ab832e54b37a/accept` → **200**

```json
{
  "command_id": "83ca8f21-6472-4083-af66-d45be1d77847"
}
```

```json
{
  "id": "56e24c26-6a3e-4ecc-9206-9a9655eca426",
  "order_id": "538d2526-184c-4884-949f-e99ecec0f0d6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b29db723-af12-4d0c-afac-9cc08248450b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b29db723-af12-4d0c-afac-9cc08248450b",
  "order_id": "538d2526-184c-4884-949f-e99ecec0f0d6",
  "assignment_id": "56e24c26-6a3e-4ecc-9206-9a9655eca426",
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
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/dedafff1-d5ff-427b-b526-13094620f12b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:13:26Z",
    "sequence": 1793117606242
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dedafff1-d5ff-427b-b526-13094620f12b",
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
  "last_heartbeat_at": "2026-10-27T16:13:26.269374Z",
  "last_location_at": "2026-10-27T16:13:26.269374Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b29db723-af12-4d0c-afac-9cc08248450b/arrive` → **200**

```json
{
  "command_id": "43cea5d3-cc92-4fe1-bf47-941bba3ab5d6",
  "expected_version": 0
}
```

```json
{
  "id": "b29db723-af12-4d0c-afac-9cc08248450b",
  "order_id": "538d2526-184c-4884-949f-e99ecec0f0d6",
  "assignment_id": "56e24c26-6a3e-4ecc-9206-9a9655eca426",
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
  "arrived_at": "2026-10-27T16:13:26.325554Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b29db723-af12-4d0c-afac-9cc08248450b/start` → **200**

```json
{
  "command_id": "fdb1ff76-10a1-4e51-a902-ea67245a6297",
  "expected_version": 1
}
```

```json
{
  "id": "b29db723-af12-4d0c-afac-9cc08248450b",
  "order_id": "538d2526-184c-4884-949f-e99ecec0f0d6",
  "assignment_id": "56e24c26-6a3e-4ecc-9206-9a9655eca426",
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
  "arrived_at": "2026-10-27T16:13:26.325554Z",
  "started_at": "2026-10-27T16:13:26.397359Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/b29db723-af12-4d0c-afac-9cc08248450b/complete` → **200**

```json
{
  "command_id": "94551a25-fe53-476d-bb02-070fdc8404ef",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:13:26Z",
  "cash_received": true
}
```

```json
{
  "id": "b29db723-af12-4d0c-afac-9cc08248450b",
  "order_id": "538d2526-184c-4884-949f-e99ecec0f0d6",
  "assignment_id": "56e24c26-6a3e-4ecc-9206-9a9655eca426",
  "phase": "COMPLETED",
  "version": 3,
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
  "arrived_at": "2026-10-27T16:13:26.325554Z",
  "started_at": "2026-10-27T16:13:26.397359Z",
  "completed_at": "2026-10-27T16:13:26.477246Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "ccccc9fe-2e8b-4786-996b-32d3f2261351",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 3000,
      "reserved_minor": 0,
      "available_minor": 3000
    }
  ],
  "entries": [
    {
      "id": "50afc523-e3ce-48bd-b0e4-c15ae5372f82",
      "at": "2026-10-27T16:13:27.410443Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "538d2526-184c-4884-949f-e99ecec0f0d6"
    },
    {
      "id": "4fd99c34-53fa-4da8-b5c2-c9898d958554",
      "at": "2026-10-27T16:13:25.495364Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e5e7800f-85c9-49ac-b87f-a953b2fb2378",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/62fea038-f137-492e-b444-23a0ce53832d/archive` → **200**

```json
{
  "command_id": "8d025a6f-1a89-41f9-abaa-5943a519d7c6",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "62fea038-f137-492e-b444-23a0ce53832d",
  "name": "Осінь −10 %",
  "kind": "DISCOUNT",
  "value_type": "PERCENT",
  "value": 1000,
  "currency": null,
  "conditions": {
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "vehicle_class": null,
    "every_nth_trip": null,
    "days_of_week": null,
    "time_from": null,
    "time_to": null,
    "pickup_zone_id": null,
    "dropoff_zone_id": null,
    "starts_at": null,
    "ends_at": null
  },
  "state": "ARCHIVED",
  "version": 2,
  "created_by": "e5e7800f-85c9-49ac-b87f-a953b2fb2378",
  "created_at": "2026-10-27T16:13:25.25414Z",
  "updated_at": "2026-10-27T16:13:29.586896Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dedafff1-d5ff-427b-b526-13094620f12b",
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
  "last_heartbeat_at": "2026-10-27T16:13:26.269374Z",
  "last_location_at": "2026-10-27T16:13:26.269374Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dedafff1-d5ff-427b-b526-13094620f12b/close` → **200**

```json
{
  "command_id": "b96098a0-02be-43c1-9f50-af65c66996fc",
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

Done: order 538d2526-184c-4884-949f-e99ecec0f0d6.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638021083",
  "device_ref": "sandbox-29135"
}
```

```json
{
  "challenge_id": "77ab4710-9b8a-470a-a9f8-23135824834e",
  "expires_at": "2026-10-27T16:18:29.721002082Z",
  "resend_available_at": "2026-10-27T16:13:30.721002082Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638021083` → **200**

```json
{
  "phone": "+380638021083",
  "audience": "CLIENT",
  "code": "990055",
  "sent_at": "2026-10-27T16:13:29.724746825Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "77ab4710-9b8a-470a-a9f8-23135824834e",
  "code": "990055",
  "device_ref": "sandbox-29135"
}
```

```json
{
  "session_id": "efb1cb91-b2a2-4f63-8745-d35daaa44baa",
  "subject": {
    "type": "CLIENT",
    "id": "34c66a12-1b8f-4bd3-af63-76b542b20a07"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNGM2NmExMi0xYjhmLTRiZDMtYWY2My03NmI1NDJiMjBhMDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4NTA5LCJpYXQiOjE3OTMxMTc2MDksImp0aSI6ImY2OWQ3MGQ3LWY5YjAtNDZkMi04MDhiLTFiNmE3MzZlYmZmMSIsInNpZCI6ImVmYjFjYjkxLWIyYTItNGY2My04NzQ1LWQzNWRhYWE0NGJhYSJ9.Fn1TieirqKt-qWU2CF7Rnt2S8azgpho04bQJyZyHlFY",
  "access_expires_at": "2026-10-27T16:28:29.786645027Z",
  "refresh_token": "PchJEWeQeguZ0XPGFz5WGY6-ZBMXTZ2_1-E5cC-2mL0",
  "refresh_expires_at": "2026-11-26T16:13:29.785763341Z",
  "account_created": true
}
```

`GET /api/rider/v1/cancel-reasons` → **200**

```json
{
  "reasons": [
    {
      "code": "CHANGED_MIND",
      "labels": {
        "en": "Changed my mind",
        "ru": "Передумал ехать",
        "pl": "Zmiana planów",
        "uk": "Передумав їхати"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "en": "The wait is too long",
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "en": "Wrong address",
        "ru": "Ошибся адресом",
        "pl": "Błędny adres",
        "uk": "Помилився адресою"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "en": "Found other transport",
        "ru": "Уеду на другом транспорте",
        "pl": "Inny transport",
        "uk": "Поїду іншим транспортом"
      },
      "driver_outcome": null
    }
  ]
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-15364"
}
```

```json
{
  "challenge_id": "cf9a7a98-3ed0-4cfc-9f6f-0e3a7cd0c2e9",
  "expires_at": "2026-10-27T16:18:29.846552116Z",
  "resend_available_at": "2026-10-27T16:13:30.846552116Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "921412",
  "sent_at": "2026-10-27T16:13:29.850174333Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cf9a7a98-3ed0-4cfc-9f6f-0e3a7cd0c2e9",
  "code": "921412",
  "device_ref": "sandbox-15364"
}
```

```json
{
  "session_id": "59521d30-98ed-41b6-9fc2-087ef82375dc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODUwOSwiaWF0IjoxNzkzMTE3NjA5LCJqdGkiOiI2NTEwMTI3Ni03MWMxLTQ2NjktYWQ4ZS1lYWE5Zjc4NGU1YzEiLCJzaWQiOiI1OTUyMWQzMC05OGVkLTQxYjYtOWZjMi0wODdlZjgyMzc1ZGMifQ.s5fjo2v5QoDMA84U0KGlY9s79_fPk_kFcZimDJrqAHg",
  "access_expires_at": "2026-10-27T16:28:29.912941152Z",
  "refresh_token": "JB3vrJ-GXtEwX8MHZwFEP_DX1A4IJJAQKuTnaEH3zqA",
  "refresh_expires_at": "2026-11-26T16:13:29.911998178Z",
  "account_created": false
}
```

`GET /api/driver/v1/cancel-reasons` → **200**

```json
{
  "reasons": [
    {
      "code": "NO_SHOW",
      "labels": {
        "en": "Passenger did not show up",
        "ru": "Пассажир не вышел",
        "pl": "Pasażer nie przyszedł",
        "uk": "Пасажир не вийшов"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "en": "Vehicle problem",
        "ru": "Неисправность автомобиля",
        "pl": "Awaria samochodu",
        "uk": "Несправність автомобіля"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "en": "Cannot reach the pickup",
        "ru": "Не могу подъехать",
        "pl": "Nie mogę dojechać",
        "uk": "Не можу під'їхати"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    }
  ]
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
  "session_id": "0e2830d6-38e9-4128-8ecb-ec6bfa88058e",
  "subject": {
    "type": "STAFF",
    "id": "e5e7800f-85c9-49ac-b87f-a953b2fb2378"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWU3ODAwZi04NWM5LTQ5YWMtYjg3Zi1hOTUzYjJmYjIzNzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg1MTAsImlhdCI6MTc5MzExNzYxMCwianRpIjoiMzU3ZmUxMjQtMmNiZC00ODFkLWIwYzAtYzFiMGEyODNmZWU3Iiwic2lkIjoiMGUyODMwZDYtMzhlOS00MTI4LThlY2ItZWM2YmZhODgwNThlIn0.JwZEsNvwidAAmcCYMz6x8TDIty5FIPjbrrayIisezLk",
  "access_expires_at": "2026-10-27T16:28:30.266996858Z",
  "refresh_token": "LqaNL0bh6pioWHgP-YW_XKt__FcWgCp7cSS7abj5Cso",
  "refresh_expires_at": "2026-10-28T04:13:30.266111031Z",
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
  "session_id": "052f0f4e-2113-4fd2-9359-d48a4e6c064a",
  "subject": {
    "type": "STAFF",
    "id": "e5e7800f-85c9-49ac-b87f-a953b2fb2378"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWU3ODAwZi04NWM5LTQ5YWMtYjg3Zi1hOTUzYjJmYjIzNzgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg1MTAsImlhdCI6MTc5MzExNzYxMCwianRpIjoiZWNlNDJkNzYtZGRiMS00MDYwLWExYTEtNWRmNmYyMTk4ZWQ4Iiwic2lkIjoiMDUyZjBmNGUtMjExMy00ZmQyLTkzNTktZDQ4YTRlNmMwNjRhIn0.U-KN2w2Umbb5nW793l0IYpKiud5yX3CEATtKqxRUDZY",
  "access_expires_at": "2026-10-27T16:28:30.592990851Z",
  "refresh_token": "245Qi2Cm3yjOQcOjeDEHI2Fili4o_DcOPW8K4uM9iqA",
  "refresh_expires_at": "2026-10-28T04:13:30.59221126Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/cancel-reasons` → **200**

```json
{
  "reasons": [
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "en": "Passenger asked",
        "ru": "Пассажир попросил",
        "pl": "Na prośbę pasażera",
        "uk": "Пасажир попросив"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "en": "Duplicate order",
        "ru": "Дубль заказа",
        "pl": "Duplikat zamówienia",
        "uk": "Дубль замовлення"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "en": "No cars available",
        "ru": "Нет свободных машин",
        "pl": "Brak wolnych aut",
        "uk": "Немає вільних авто"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "en": "Test order",
        "ru": "Тестовый заказ",
        "pl": "Zamówienie testowe",
        "uk": "Тестове замовлення"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "en": "Operator error",
        "ru": "Ошибка оператора",
        "pl": "Błąd operatora",
        "uk": "Помилка оператора"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "en": "Accident",
        "ru": "ДТП",
        "pl": "Wypadek",
        "uk": "ДТП"
      },
      "driver_outcome": null
    }
  ]
}
```

## The rider orders and cancels: «Долго ждать машину»

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f658b37b-3db9-475d-8ff2-7344c4069312",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6520
  }
}
```

```json
{
  "id": "61acd6a4-1a3e-44ed-90b8-072eb242b48c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T16:18:30.665500Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 30533,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "19be091d-5840-4da2-8c26-218253fe87cb",
  "quote_id": "61acd6a4-1a3e-44ed-90b8-072eb242b48c",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6520
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH"
}
```

```json
{
  "id": "b4531eac-b99e-4000-a371-13839bc688bb",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "34c66a12-1b8f-4bd3-af63-76b542b20a07",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 30533,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-27T16:13:30.710089Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/b4531eac-b99e-4000-a371-13839bc688bb` → **200**

```json
{
  "id": "b4531eac-b99e-4000-a371-13839bc688bb",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "34c66a12-1b8f-4bd3-af63-76b542b20a07",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 30533,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-27T16:13:30.710089Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/b4531eac-b99e-4000-a371-13839bc688bb/cancel` → **200**

```json
{
  "command_id": "577f230f-4914-43cf-b281-d486e5890a64",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "b4531eac-b99e-4000-a371-13839bc688bb",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "34c66a12-1b8f-4bd3-af63-76b542b20a07",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 30533,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": null,
  "created_at": "2026-10-27T16:13:30.710089Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "en": "The wait is too long",
      "ru": "Долго ждать машину",
      "pl": "Zbyt długie oczekiwanie",
      "uk": "Довго чекати авто"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Two drivers online; the order goes to the nearest one

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
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
  "command_id": "384538e2-be48-4778-a5cb-d91df540bd26",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:13:30Z",
    "sequence": 1793117610855
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d7f3a5ce-24ce-46ac-aa1b-f9e82e14cd40",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-27T16:13:30.875484Z",
  "last_location_at": "2026-10-27T16:13:30.875484Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-24074"
}
```

```json
{
  "challenge_id": "4f2fff47-f149-49d7-8ec2-d03d8d6a5f9d",
  "expires_at": "2026-10-27T16:18:30.907993235Z",
  "resend_available_at": "2026-10-27T16:13:31.907993235Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "871230",
  "sent_at": "2026-10-27T16:13:30.91150879Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f2fff47-f149-49d7-8ec2-d03d8d6a5f9d",
  "code": "871230",
  "device_ref": "sandbox-24074"
}
```

```json
{
  "session_id": "eeb596c8-e2c7-4780-a8cc-b58be64a4e08",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODUxMCwiaWF0IjoxNzkzMTE3NjEwLCJqdGkiOiJiZjhkNmU5Ny01MjEyLTQ1NDQtYjU4Ni1hOWNkYjRjMWY4YmYiLCJzaWQiOiJlZWI1OTZjOC1lMmM3LTQ3ODAtYThjYy1iNThiZTY0YTRlMDgifQ._9OU2GVNf8FSmSW1Vms2vNcajnh9Gc3tMAJtu5V1aXY",
  "access_expires_at": "2026-10-27T16:28:30.971910034Z",
  "refresh_token": "RAj1OpLIell1KKRG5rer-T0l8pBqOg59aE6lmJzMoko",
  "refresh_expires_at": "2026-11-26T16:13:30.971047901Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
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
  "command_id": "d1471d12-9ca2-44bf-b1e0-436171c72838",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:13:31Z",
    "sequence": 1793117611276
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "40ae597c-9d72-43ec-8d47-b974188480ac",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-27T16:13:31.047715Z",
  "last_location_at": "2026-10-27T16:13:31.047715Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "50ec76c6-66eb-4bcf-9cf8-6ff8295134a3",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6520
  }
}
```

```json
{
  "id": "a38d9a8d-4624-4963-9c96-734b44dbe803",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T16:18:31.089186Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 30533,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "1cb6b595-a320-4188-b6e9-fba0934633d6",
  "quote_id": "a38d9a8d-4624-4963-9c96-734b44dbe803",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6520
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH"
}
```

```json
{
  "id": "7a5d7c20-941d-44b3-9d9d-1a7437faadc4",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "34c66a12-1b8f-4bd3-af63-76b542b20a07",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 30533,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-27T16:13:31.131594Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "14c6c4a9-79c1-46bf-8430-c843a9ecaf8d",
    "order_id": "7a5d7c20-941d-44b3-9d9d-1a7437faadc4",
    "expires_at": "2026-10-27T16:13:46.136179Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4547,
      "lon": 30.5238
    },
    "pickup_label": "Хрещатик, 22",
    "dropoff_label": "Позняки",
    "payment_method": "CASH",
    "price_minor": 30533,
    "currency": "UAH",
    "distance_m": 478
  }
]
```

`POST /api/driver/v1/offers/14c6c4a9-79c1-46bf-8430-c843a9ecaf8d/accept` → **200**

```json
{
  "command_id": "d29974bd-cc45-4e95-a3af-d9f9d8a75cd6"
}
```

```json
{
  "id": "dc448f93-5cf4-44b7-9d39-433e1922b10b",
  "order_id": "7a5d7c20-941d-44b3-9d9d-1a7437faadc4",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1788b8e1-abd7-4364-b972-5f38b03c7975",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1788b8e1-abd7-4364-b972-5f38b03c7975",
  "order_id": "7a5d7c20-941d-44b3-9d9d-1a7437faadc4",
  "assignment_id": "dc448f93-5cf4-44b7-9d39-433e1922b10b",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "price_minor": 30533,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1788b8e1-abd7-4364-b972-5f38b03c7975/cancel` → **200**

```json
{
  "command_id": "06d0ac0c-c280-462f-8ce2-3758386ce3a1",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "1788b8e1-abd7-4364-b972-5f38b03c7975",
  "order_id": "7a5d7c20-941d-44b3-9d9d-1a7437faadc4",
  "assignment_id": "dc448f93-5cf4-44b7-9d39-433e1922b10b",
  "phase": "ABORTED",
  "version": 1,
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "price_minor": 30533,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/7a5d7c20-941d-44b3-9d9d-1a7437faadc4` → **200**

```json
{
  "id": "7a5d7c20-941d-44b3-9d9d-1a7437faadc4",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "34c66a12-1b8f-4bd3-af63-76b542b20a07",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 30533,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": {
    "id": "dc448f93-5cf4-44b7-9d39-433e1922b10b",
    "order_id": "7a5d7c20-941d-44b3-9d9d-1a7437faadc4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "1788b8e1-abd7-4364-b972-5f38b03c7975",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T16:13:31.131594Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Andrii gets it and cancels: «Пассажир попросил отменить»

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "7e86ee60-24f7-48a3-b9a3-c7ce571356aa",
    "order_id": "7a5d7c20-941d-44b3-9d9d-1a7437faadc4",
    "expires_at": "2026-10-27T16:13:46.287113Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4547,
      "lon": 30.5238
    },
    "pickup_label": "Хрещатик, 22",
    "dropoff_label": "Позняки",
    "payment_method": "CASH",
    "price_minor": 30533,
    "currency": "UAH",
    "distance_m": 1146
  }
]
```

`POST /api/driver/v1/offers/7e86ee60-24f7-48a3-b9a3-c7ce571356aa/accept` → **200**

```json
{
  "command_id": "faaf78ac-1bcd-4034-b6d6-ae204d411e89"
}
```

```json
{
  "id": "6420ab78-9c06-4de2-b7c4-0d001fb567cb",
  "order_id": "7a5d7c20-941d-44b3-9d9d-1a7437faadc4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d96e0322-0d03-40d6-a6bc-e307b0bd2e59",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d96e0322-0d03-40d6-a6bc-e307b0bd2e59",
  "order_id": "7a5d7c20-941d-44b3-9d9d-1a7437faadc4",
  "assignment_id": "6420ab78-9c06-4de2-b7c4-0d001fb567cb",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "price_minor": 30533,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d96e0322-0d03-40d6-a6bc-e307b0bd2e59/cancel` → **200**

```json
{
  "command_id": "92ef9a58-9213-449e-836c-593dc479d56a",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "d96e0322-0d03-40d6-a6bc-e307b0bd2e59",
  "order_id": "7a5d7c20-941d-44b3-9d9d-1a7437faadc4",
  "assignment_id": "6420ab78-9c06-4de2-b7c4-0d001fb567cb",
  "phase": "ABORTED",
  "version": 1,
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "price_minor": 30533,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The rider sees who cancelled; the operator sees the whole history

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "7a5d7c20-941d-44b3-9d9d-1a7437faadc4",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-27T16:13:31.131594Z",
    "pickup_label": "Хрещатик, 22",
    "dropoff_label": "Позняки",
    "vehicle_class": "STANDARD",
    "price_minor": 30533,
    "final_price_minor": null,
    "currency": "UAH",
    "payment_method": "CASH",
    "driver": {
      "name": "Андрій Шевчук",
      "vehicle": {
        "make": "Hyundai",
        "model": "Sonata",
        "color": "black",
        "registration_number": "AA0003TX"
      }
    },
    "chat_available": true,
    "cancellation": {
      "by": "DRIVER",
      "reason_code": "PASSENGER_ASKED",
      "reason_labels": {
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати"
      }
    },
    "pickup_at": null
  },
  {
    "id": "b4531eac-b99e-4000-a371-13839bc688bb",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T16:13:30.710089Z",
    "pickup_label": "Хрещатик, 22",
    "dropoff_label": "Позняки",
    "vehicle_class": "STANDARD",
    "price_minor": 30533,
    "final_price_minor": null,
    "currency": "UAH",
    "payment_method": "CASH",
    "driver": null,
    "chat_available": false,
    "cancellation": {
      "by": "RIDER",
      "reason_code": "WAIT_TOO_LONG",
      "reason_labels": {
        "en": "The wait is too long",
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/7a5d7c20-941d-44b3-9d9d-1a7437faadc4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T16:13:31.132291Z",
      "actor": {
        "type": "CLIENT",
        "id": "34c66a12-1b8f-4bd3-af63-76b542b20a07",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "7a5d7c20-941d-44b3-9d9d-1a7437faadc4",
        "quote_id": "a38d9a8d-4624-4963-9c96-734b44dbe803",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T16:13:31.134894Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7a5d7c20-941d-44b3-9d9d-1a7437faadc4",
        "attempt_id": "26d96e85-d65d-45fd-8652-f755a2411bba",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T16:13:31.14339Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "14c6c4a9-79c1-46bf-8430-c843a9ecaf8d",
        "order_id": "7a5d7c20-941d-44b3-9d9d-1a7437faadc4",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T16:13:31.207382Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "14c6c4a9-79c1-46bf-8430-c843a9ecaf8d",
        "order_id": "7a5d7c20-941d-44b3-9d9d-1a7437faadc4",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "dc448f93-5cf4-44b7-9d39-433e1922b10b"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders b4531eac-b99e-4000-a371-13839bc688bb, 7a5d7c20-941d-44b3-9d9d-1a7437faadc4.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739266320",
  "device_ref": "sandbox-25380"
}
```

```json
{
  "challenge_id": "213a6662-5e54-4fd3-be51-59dd5d3e59fd",
  "expires_at": "2026-10-27T16:18:31.581614191Z",
  "resend_available_at": "2026-10-27T16:13:32.581614191Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380739266320` → **200**

```json
{
  "phone": "+380739266320",
  "audience": "CLIENT",
  "code": "039005",
  "sent_at": "2026-10-27T16:13:31.584834684Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "213a6662-5e54-4fd3-be51-59dd5d3e59fd",
  "code": "039005",
  "device_ref": "sandbox-25380"
}
```

```json
{
  "session_id": "2dca50c1-ae55-458e-8181-2566b2004a2a",
  "subject": {
    "type": "CLIENT",
    "id": "94ff6cab-30ff-4dd9-a695-088bcc5f5550"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NGZmNmNhYi0zMGZmLTRkZDktYTY5NS0wODhiY2M1ZjU1NTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4NTExLCJpYXQiOjE3OTMxMTc2MTEsImp0aSI6IjRiMzY3YTI2LWY0ZWYtNGUyZi04ZWY3LWUwNTZhMGIyZjhlNyIsInNpZCI6IjJkY2E1MGMxLWFlNTUtNDU4ZS04MTgxLTI1NjZiMjAwNGEyYSJ9.EYbLYbqWK4bUCTt-Ks5oDw-8xGAT-Ytvg74EPhYKHAY",
  "access_expires_at": "2026-10-27T16:28:31.64354203Z",
  "refresh_token": "1DSgtO5ONlrfdzHp6x2uL0QP6jz0SJWxXRO0vHYquKI",
  "refresh_expires_at": "2026-11-26T16:13:31.642750059Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "982b30ba-eb76-4ff5-950d-7adda1512f70",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "3bca41f1-a9b4-461e-b255-af39cff7bbe9",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-3bca41f1-a9b4-461e-b255-af39cff7bbe9",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "ed9a86950bfd6562ff5a553d12b30360",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=3bca41f1-a9b4-461e-b255-af39cff7bbe9",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739266320"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=3bca41f1-a9b4-461e-b255-af39cff7bbe9",
  "expires_at": "2026-10-27T16:43:31.684042Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/3bca41f1-a9b4-461e-b255-af39cff7bbe9` → **200**

```json
{
  "id": "3bca41f1-a9b4-461e-b255-af39cff7bbe9",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T16:43:31.684042Z",
  "card": {
    "id": "45b28d88-e2bb-4f85-ac28-4af54de0a7d0",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8033",
    "card_type": "Visa",
    "created_at": "2026-10-27T16:13:31.733233Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "45b28d88-e2bb-4f85-ac28-4af54de0a7d0",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****8033",
      "card_type": "Visa",
      "created_at": "2026-10-27T16:13:31.733233Z"
    }
  ]
}
```

## Andrii is online nearby

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-18239"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "9f738668-0628-4dea-86e0-3dce1ab7e81a",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-18239"
}
```

```json
{
  "challenge_id": "a42bcba2-e45f-4bf3-a98f-fc17de0f72c4",
  "expires_at": "2026-10-27T16:18:32.853037818Z",
  "resend_available_at": "2026-10-27T16:13:33.853037818Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "766125",
  "sent_at": "2026-10-27T16:13:32.856043487Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a42bcba2-e45f-4bf3-a98f-fc17de0f72c4",
  "code": "766125",
  "device_ref": "sandbox-18239"
}
```

```json
{
  "session_id": "9629f693-d99e-4b44-9a35-6266d94f7b85",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODUxMiwiaWF0IjoxNzkzMTE3NjEyLCJqdGkiOiJjOWRiOTZlNy1jNGM2LTQyNmItODQ2Mi1kNDNhZjYwYjNkNjgiLCJzaWQiOiI5NjI5ZjY5My1kOTllLTRiNDQtOWEzNS02MjY2ZDk0ZjdiODUifQ.k1lA5qZkBAkMmkueRhHHMDwGjtYiaTIAs7YGjiDdbqc",
  "access_expires_at": "2026-10-27T16:28:32.914052178Z",
  "refresh_token": "TVWKqto7OQ2rv0gaovx4DGV-n18uoTLxvMmAJXJSmlc",
  "refresh_expires_at": "2026-11-26T16:13:32.913313236Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "40ae597c-9d72-43ec-8d47-b974188480ac",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-27T16:13:31.047715Z",
  "last_location_at": "2026-10-27T16:13:31.047715Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/40ae597c-9d72-43ec-8d47-b974188480ac/handover` → **200**

```json
{
  "command_id": "f7b6ae30-2629-49a4-a027-23be0c18011f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "40ae597c-9d72-43ec-8d47-b974188480ac",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-27T16:13:31.047715Z",
  "last_location_at": "2026-10-27T16:13:31.047715Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/40ae597c-9d72-43ec-8d47-b974188480ac/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:13:33Z",
    "sequence": 1793117613152
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "40ae597c-9d72-43ec-8d47-b974188480ac",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-27T16:13:33.036362Z",
  "last_location_at": "2026-10-27T16:13:33.036362Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "99c83eae-8ac1-450f-a5c9-836443813c0e",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.4970
  },
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.4300
  }
}
```

```json
{
  "id": "af00282b-87dc-4841-bb0c-6ff88090ba30",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T16:18:33.077186Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 16297,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "bd283dbf-9fa8-4a1d-b62b-258471d358e2",
  "quote_id": "af00282b-87dc-4841-bb0c-6ff88090ba30",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.4970
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.4300
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD"
}
```

```json
{
  "id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "94ff6cab-30ff-4dd9-a695-088bcc5f5550",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "AUTH_PENDING",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-27T16:13:33.121819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/f02a8ed2-8d79-4068-adc8-d54f20444e48` → **200**

```json
{
  "id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "94ff6cab-30ff-4dd9-a695-088bcc5f5550",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "AUTH_PENDING",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-27T16:13:33.121819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/f02a8ed2-8d79-4068-adc8-d54f20444e48` → **200**

```json
{
  "id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "94ff6cab-30ff-4dd9-a695-088bcc5f5550",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "AUTHORIZED",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-27T16:13:33.121819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Andrii takes it and drives

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "71a82084-0f17-4ec3-946d-ce8575113ba2",
    "order_id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
    "expires_at": "2026-10-27T16:13:48.528356Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4437,
      "lon": 30.497
    },
    "pickup_label": "вул. Дмитрівська",
    "dropoff_label": "Нивки",
    "payment_method": "CARD",
    "price_minor": 16297,
    "currency": "UAH",
    "distance_m": 478
  }
]
```

`POST /api/driver/v1/offers/71a82084-0f17-4ec3-946d-ce8575113ba2/accept` → **200**

```json
{
  "command_id": "fff5904e-de05-4daa-b394-6ba7ef5e48c1"
}
```

```json
{
  "id": "a5abbfbd-ab07-46a1-bf61-0b9976fc7739",
  "order_id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e0c55b66-75e2-40ba-86f4-47e0a5d7a1eb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e0c55b66-75e2-40ba-86f4-47e0a5d7a1eb",
  "order_id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
  "assignment_id": "a5abbfbd-ab07-46a1-bf61-0b9976fc7739",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/40ae597c-9d72-43ec-8d47-b974188480ac/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:13:34Z",
    "sequence": 1793117614311
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "40ae597c-9d72-43ec-8d47-b974188480ac",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-27T16:13:34.33297Z",
  "last_location_at": "2026-10-27T16:13:34.33297Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e0c55b66-75e2-40ba-86f4-47e0a5d7a1eb/arrive` → **200**

```json
{
  "command_id": "5920c049-c1e7-40d2-93ae-21cab32cf048",
  "expected_version": 0
}
```

```json
{
  "id": "e0c55b66-75e2-40ba-86f4-47e0a5d7a1eb",
  "order_id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
  "assignment_id": "a5abbfbd-ab07-46a1-bf61-0b9976fc7739",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-27T16:13:34.375546Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e0c55b66-75e2-40ba-86f4-47e0a5d7a1eb/start` → **200**

```json
{
  "command_id": "75739bea-a096-4e37-be19-7a295647a08a",
  "expected_version": 1
}
```

```json
{
  "id": "e0c55b66-75e2-40ba-86f4-47e0a5d7a1eb",
  "order_id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
  "assignment_id": "a5abbfbd-ab07-46a1-bf61-0b9976fc7739",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-27T16:13:34.375546Z",
  "started_at": "2026-10-27T16:13:34.41997Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e0c55b66-75e2-40ba-86f4-47e0a5d7a1eb/complete` → **200**

```json
{
  "command_id": "c5b8c760-18f5-48a1-bda4-9ddf935bb8db",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:13:34Z"
}
```

```json
{
  "id": "e0c55b66-75e2-40ba-86f4-47e0a5d7a1eb",
  "order_id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
  "assignment_id": "a5abbfbd-ab07-46a1-bf61-0b9976fc7739",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-27T16:13:34.375546Z",
  "started_at": "2026-10-27T16:13:34.41997Z",
  "completed_at": "2026-10-27T16:13:34.470075Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/f02a8ed2-8d79-4068-adc8-d54f20444e48` → **200**

```json
{
  "id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "94ff6cab-30ff-4dd9-a695-088bcc5f5550",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "CAPTURE_PENDING",
  "price_minor": 16297,
  "final_price_minor": 16297,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "a5abbfbd-ab07-46a1-bf61-0b9976fc7739",
    "order_id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e0c55b66-75e2-40ba-86f4-47e0a5d7a1eb",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T16:13:33.121819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/f02a8ed2-8d79-4068-adc8-d54f20444e48` → **200**

```json
{
  "id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "94ff6cab-30ff-4dd9-a695-088bcc5f5550",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "CAPTURE_PENDING",
  "price_minor": 16297,
  "final_price_minor": 16297,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "a5abbfbd-ab07-46a1-bf61-0b9976fc7739",
    "order_id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e0c55b66-75e2-40ba-86f4-47e0a5d7a1eb",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T16:13:33.121819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/f02a8ed2-8d79-4068-adc8-d54f20444e48` → **200**

```json
{
  "id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "94ff6cab-30ff-4dd9-a695-088bcc5f5550",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "CAPTURE_PENDING",
  "price_minor": 16297,
  "final_price_minor": 16297,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "a5abbfbd-ab07-46a1-bf61-0b9976fc7739",
    "order_id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e0c55b66-75e2-40ba-86f4-47e0a5d7a1eb",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T16:13:33.121819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/f02a8ed2-8d79-4068-adc8-d54f20444e48` → **200**

```json
{
  "id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "94ff6cab-30ff-4dd9-a695-088bcc5f5550",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "PAID",
  "price_minor": 16297,
  "final_price_minor": 16297,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "a5abbfbd-ab07-46a1-bf61-0b9976fc7739",
    "order_id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e0c55b66-75e2-40ba-86f4-47e0a5d7a1eb",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T16:13:33.121819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/driver/v1/balance` → **200**

```json
{
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 13852,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

## The rider tips 15 % on the same card; all of it goes to Andrii

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 13852
    }
  ],
  "entries": [
    {
      "id": "d7bd0846-3fac-413d-b02f-c1fcfeeac5e8",
      "at": "2026-10-27T16:13:34.556222Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/f02a8ed2-8d79-4068-adc8-d54f20444e48/tip` → **200**

```json
{
  "order_id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
  "currency": "UAH",
  "trip_cost_minor": 16297,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1700
    },
    {
      "percent": 15,
      "amount_minor": 2500
    },
    {
      "percent": 20,
      "amount_minor": 3300
    },
    {
      "percent": 25,
      "amount_minor": 4100
    }
  ],
  "min_minor": 100,
  "max_minor": 16300,
  "method": "CARD",
  "available_until": "2026-10-28T16:13:34.470075Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/f02a8ed2-8d79-4068-adc8-d54f20444e48/tip` → **201**

```json
{
  "command_id": "8004b1d5-48ed-4432-a15d-3ef0f8871fa5",
  "amount_minor": 2500
}
```

```json
{
  "id": "6ba45f35-53c5-447a-9845-561f72d4bb35",
  "order_id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-27T16:13:37.739247Z"
}
```

`GET /api/rider/v1/orders/f02a8ed2-8d79-4068-adc8-d54f20444e48/tip` → **200**

```json
{
  "order_id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
  "currency": "UAH",
  "trip_cost_minor": 16297,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1700
    },
    {
      "percent": 15,
      "amount_minor": 2500
    },
    {
      "percent": 20,
      "amount_minor": 3300
    },
    {
      "percent": 25,
      "amount_minor": 4100
    }
  ],
  "min_minor": 100,
  "max_minor": 16300,
  "method": "CARD",
  "available_until": "2026-10-28T16:13:34.470075Z",
  "open": false,
  "tip": {
    "id": "6ba45f35-53c5-447a-9845-561f72d4bb35",
    "order_id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-27T16:13:37.739247Z"
  }
}
```

`GET /api/rider/v1/orders/f02a8ed2-8d79-4068-adc8-d54f20444e48/tip` → **200**

```json
{
  "order_id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
  "currency": "UAH",
  "trip_cost_minor": 16297,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1700
    },
    {
      "percent": 15,
      "amount_minor": 2500
    },
    {
      "percent": 20,
      "amount_minor": 3300
    },
    {
      "percent": 25,
      "amount_minor": 4100
    }
  ],
  "min_minor": 100,
  "max_minor": 16300,
  "method": "CARD",
  "available_until": "2026-10-28T16:13:34.470075Z",
  "open": false,
  "tip": {
    "id": "6ba45f35-53c5-447a-9845-561f72d4bb35",
    "order_id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-27T16:13:37.739247Z"
  }
}
```

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 13852
    }
  ],
  "entries": [
    {
      "id": "d7bd0846-3fac-413d-b02f-c1fcfeeac5e8",
      "at": "2026-10-27T16:13:34.556222Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 16352
    }
  ],
  "entries": [
    {
      "id": "b1cb5ed4-c572-4004-8c97-16d0d0af9a8c",
      "at": "2026-10-27T16:13:39.636105Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
      "counterpart_id": null
    },
    {
      "id": "d7bd0846-3fac-413d-b02f-c1fcfeeac5e8",
      "at": "2026-10-27T16:13:34.556222Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f02a8ed2-8d79-4068-adc8-d54f20444e48",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "40ae597c-9d72-43ec-8d47-b974188480ac",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-27T16:13:34.33297Z",
  "last_location_at": "2026-10-27T16:13:34.33297Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/40ae597c-9d72-43ec-8d47-b974188480ac/close` → **200**

```json
{
  "command_id": "11de7f83-853d-4573-b91e-738d79e7bfdb",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
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

Done: card order f02a8ed2-8d79-4068-adc8-d54f20444e48.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380730315951",
  "device_ref": "sandbox-27501"
}
```

```json
{
  "challenge_id": "160802bd-be55-46fa-bb78-17f0b7d76f80",
  "expires_at": "2026-10-27T16:18:39.96922069Z",
  "resend_available_at": "2026-10-27T16:13:40.96922069Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380730315951` → **200**

```json
{
  "phone": "+380730315951",
  "audience": "CLIENT",
  "code": "560167",
  "sent_at": "2026-10-27T16:13:39.972797913Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "160802bd-be55-46fa-bb78-17f0b7d76f80",
  "code": "560167",
  "device_ref": "sandbox-27501"
}
```

```json
{
  "session_id": "01cbd31e-8c00-495f-8802-eab6ec3e6e98",
  "subject": {
    "type": "CLIENT",
    "id": "f4aeb3c0-efb5-40b7-b3ef-c5670659376b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNGFlYjNjMC1lZmI1LTQwYjctYjNlZi1jNTY3MDY1OTM3NmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4NTIwLCJpYXQiOjE3OTMxMTc2MjAsImp0aSI6IjU2ODhjNGVjLWZlYTEtNDQzYi04ZmIwLTBlYjIzODU4N2I4ZiIsInNpZCI6IjAxY2JkMzFlLThjMDAtNDk1Zi04ODAyLWVhYjZlYzNlNmU5OCJ9.NiJh-gR2mNeSVRN-ywnCJXIMII0u-izTaCmCjCiyjdE",
  "access_expires_at": "2026-10-27T16:28:40.030802966Z",
  "refresh_token": "6GB54pSbauhi3ugxwDcCVzLb4v006Wh-bKbDCpAg9hQ",
  "refresh_expires_at": "2026-11-26T16:13:40.030023678Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "e1f66004-b5c6-40d0-bba5-8d27d2eb00c0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "b0c94924-552f-4d21-a79e-0c62adc8c991",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-b0c94924-552f-4d21-a79e-0c62adc8c991",
    "orderDate": "1793117620",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "c1a8ae85ec72b09326c9cd42b61d000a",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=b0c94924-552f-4d21-a79e-0c62adc8c991",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730315951"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=b0c94924-552f-4d21-a79e-0c62adc8c991",
  "created_at": "2026-10-27T16:13:40.068689Z",
  "expires_at": "2026-10-27T16:43:40.068689Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/b0c94924-552f-4d21-a79e-0c62adc8c991` → **200**

```json
{
  "id": "b0c94924-552f-4d21-a79e-0c62adc8c991",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T16:13:40.068689Z",
  "expires_at": "2026-10-27T16:43:40.068689Z",
  "completed_at": "2026-10-27T16:13:40.107603Z",
  "masked_pan": "41****7750",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "f4aeb3c0-efb5-40b7-b3ef-c5670659376b",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "f4aeb3c0-efb5-40b7-b3ef-c5670659376b",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 15000,
      "reserved_minor": 0,
      "available_minor": 15000
    }
  ],
  "entries": [
    {
      "id": "a95fbd5b-580d-4f82-b9f9-82bbbb88c7c3",
      "at": "2026-10-27T16:13:40.647065Z",
      "kind": "CARD_TOP_UP",
      "currency": "UAH",
      "amount_minor": 15000,
      "reason": "Top-up by card",
      "staff_id": null,
      "order_id": null
    }
  ]
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "f4aeb3c0-efb5-40b7-b3ef-c5670659376b",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 15000,
      "reserved_minor": 0,
      "available_minor": 15000
    }
  ],
  "entries": [
    {
      "id": "a95fbd5b-580d-4f82-b9f9-82bbbb88c7c3",
      "at": "2026-10-27T16:13:40.647065Z",
      "kind": "CARD_TOP_UP",
      "currency": "UAH",
      "amount_minor": 15000,
      "reason": "Top-up by card",
      "staff_id": null,
      "order_id": null
    }
  ]
}
```

## The driver tops up the balance by 500.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-15999"
}
```

```json
{
  "challenge_id": "77b8dafd-6c3f-43e3-a9e4-3307cd08aaab",
  "expires_at": "2026-10-27T16:18:41.250835515Z",
  "resend_available_at": "2026-10-27T16:13:42.250835515Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "583644",
  "sent_at": "2026-10-27T16:13:41.253972703Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "77b8dafd-6c3f-43e3-a9e4-3307cd08aaab",
  "code": "583644",
  "device_ref": "sandbox-15999"
}
```

```json
{
  "session_id": "6a3e48c6-7178-4d78-81f6-28f952362fae",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODUyMSwiaWF0IjoxNzkzMTE3NjIxLCJqdGkiOiI3YjUxYTk4Yy0yZjRkLTQwNmItYjBmZS1lNzFiMmEwYTNhODgiLCJzaWQiOiI2YTNlNDhjNi03MTc4LTRkNzgtODFmNi0yOGY5NTIzNjJmYWUifQ.gvntqO9JsqT4V1Wup7ET8lpKUyA9yWxyTNfWQyD0Dsk",
  "access_expires_at": "2026-10-27T16:28:41.313049751Z",
  "refresh_token": "UwTuzOue2tf184_CWBftbNhE5CsFxBrVVdcOUwOhWiY",
  "refresh_expires_at": "2026-11-26T16:13:41.312400585Z",
  "account_created": false
}
```

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "balances": [],
  "entries": []
}
```

`POST /api/driver/v1/balance/card-top-ups` → **201**

```json
{
  "command_id": "cfbdf38c-81cb-456c-bc77-82db0b295de9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "473cc099-e4e2-4e98-b5bc-79dbc702bd8b",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-473cc099-e4e2-4e98-b5bc-79dbc702bd8b",
    "orderDate": "1793117621",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "561c8f45d32e44352bfea5b85c1cd6ee",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=473cc099-e4e2-4e98-b5bc-79dbc702bd8b",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=473cc099-e4e2-4e98-b5bc-79dbc702bd8b",
  "created_at": "2026-10-27T16:13:41.374842Z",
  "expires_at": "2026-10-27T16:43:41.374842Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/473cc099-e4e2-4e98-b5bc-79dbc702bd8b` → **200**

```json
{
  "id": "473cc099-e4e2-4e98-b5bc-79dbc702bd8b",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T16:13:41.374842Z",
  "expires_at": "2026-10-27T16:43:41.374842Z",
  "completed_at": "2026-10-27T16:13:41.409035Z",
  "masked_pan": "41****9071",
  "failure_reason": null
}
```

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "balances": [],
  "entries": []
}
```

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 50000
    }
  ],
  "entries": [
    {
      "id": "58fbe1ed-c31a-4fcf-a06f-1cc9684aa6d0",
      "at": "2026-10-27T16:13:41.656303Z",
      "kind": "CARD_TOP_UP",
      "currency": "UAH",
      "amount_minor": 50000,
      "reason": "Top-up by card",
      "order_id": null,
      "counterpart_id": null
    }
  ]
}
```

## A rider's token does not open the driver's path

`POST /api/driver/v1/balance/card-top-ups` → **401**

```json
{
  "command_id": "8fc87c89-525b-4be7-830b-2f8fd3e567d4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "instance": "/api/driver/v1/balance/card-top-ups",
  "status": 401,
  "title": "Unauthenticated",
  "type": "https://errors.blizz.taxi/unauthenticated",
  "code": "UNAUTHENTICATED",
  "correlation_id": "fa35278b-2b3b-4a5f-b14f-5bf1b0d0561b"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673448173",
  "device_ref": "sandbox-14582"
}
```

```json
{
  "challenge_id": "e0990db8-e1ed-43da-ab04-02ad0675fc21",
  "expires_at": "2026-10-27T16:18:42.574233637Z",
  "resend_available_at": "2026-10-27T16:13:43.574233637Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673448173` → **200**

```json
{
  "phone": "+380673448173",
  "audience": "CLIENT",
  "code": "014408",
  "sent_at": "2026-10-27T16:13:42.577058471Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e0990db8-e1ed-43da-ab04-02ad0675fc21",
  "code": "014408",
  "device_ref": "sandbox-14582"
}
```

```json
{
  "session_id": "221d4db5-22c8-464e-90b7-cf64d1b08fb5",
  "subject": {
    "type": "CLIENT",
    "id": "55f277c8-35d3-406e-8f3d-2860f10c905b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWYyNzdjOC0zNWQzLTQwNmUtOGYzZC0yODYwZjEwYzkwNWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4NTIyLCJpYXQiOjE3OTMxMTc2MjIsImp0aSI6IjAxNDFkNGNkLTUyNzktNDUwNi05NTBkLTM0ZDNjZDljYjU1MyIsInNpZCI6IjIyMWQ0ZGI1LTIyYzgtNDY0ZS05MGI3LWNmNjRkMWIwOGZiNSJ9.qIWxphLvrejBEvgkOBfcu3IrgEkqANHrmJENbgZuG7g",
  "access_expires_at": "2026-10-27T16:28:42.636741922Z",
  "refresh_token": "9qo13x7_CAdQW0gBXfQkiYNtq2aPPRGC46G9S5RJABM",
  "refresh_expires_at": "2026-11-26T16:13:42.636125338Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "55f277c8-35d3-406e-8f3d-2860f10c905b",
  "session_id": "221d4db5-22c8-464e-90b7-cf64d1b08fb5",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6852a2f6-de88-4be4-8867-9c4e8b997fe4",
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
  "id": "64d6a69c-8a37-483c-a477-ac20f5bfe468",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:18:42.702450Z",
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

## Step one: a code to confirm the deletion (a sign-in code would not do)

`POST /api/rider/v1/me/deletion-request/challenge` → **201**

```json
{
  "challenge_id": "4a980d97-44c9-4f2a-81e0-0de51121bcb3",
  "expires_at": "2026-10-27T16:18:44.74407549Z",
  "resend_available_at": "2026-10-27T16:13:45.74407549Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673448173` → **200**

```json
{
  "phone": "+380673448173",
  "audience": "CLIENT",
  "code": "683792",
  "sent_at": "2026-10-27T16:13:44.746510663Z"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "48f0e904-c2dc-4728-b00b-99b60cf151c8",
  "challenge_id": "4a980d97-44c9-4f2a-81e0-0de51121bcb3",
  "otp_code": "683792"
}
```

```json
{
  "client_id": "55f277c8-35d3-406e-8f3d-2860f10c905b",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-27T16:13:44.817800565Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "ecb351f8-8158-4e88-ad01-11d4a5bcbe47",
  "quote_id": "64d6a69c-8a37-483c-a477-ac20f5bfe468",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "payment_method": "CASH"
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 403,
  "title": "Account not active",
  "type": "https://errors.blizz.taxi/account-not-active",
  "code": "ACCOUNT_NOT_ACTIVE",
  "correlation_id": "f0a98996-5178-49a1-a13a-4b8e02c86486"
}
```

## Staff see the request with nothing blocking it and complete it

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
  "session_id": "7c5bfb4e-0f05-47a9-b934-9b1b589ffdb0",
  "subject": {
    "type": "STAFF",
    "id": "e5e7800f-85c9-49ac-b87f-a953b2fb2378"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWU3ODAwZi04NWM5LTQ5YWMtYjg3Zi1hOTUzYjJmYjIzNzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg1MjUsImlhdCI6MTc5MzExNzYyNSwianRpIjoiOTA1NGYwOWMtNDMyMy00MDZkLThkODMtMTc1ODVhZWIyYjAxIiwic2lkIjoiN2M1YmZiNGUtMGYwNS00N2E5LWI5MzQtOWIxYjU4OWZmZGIwIn0.VLTdqJ5fA5qWRKX3ulHBTO-ffr5Sk64qRo09v_JlCuI",
  "access_expires_at": "2026-10-27T16:28:45.188935157Z",
  "refresh_token": "gQu8tnyUes9SyfjjOn0pzGDP0CgISrxDDHzVSHiPlf0",
  "refresh_expires_at": "2026-10-28T04:13:45.188122537Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "55f277c8-35d3-406e-8f3d-2860f10c905b",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-27T16:13:44.817801Z",
      "blockers": {
        "active_order_id": null,
        "debt": [],
        "open_support_cases": 0,
        "bonuses_to_burn": [],
        "blocked": false
      }
    }
  ]
}
```

`POST /api/admin/v1/client-deletions/55f277c8-35d3-406e-8f3d-2860f10c905b/complete` → **200**

```json
{
  "command_id": "92dcef48-d1be-4ca9-8062-25610907c244",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "55f277c8-35d3-406e-8f3d-2860f10c905b",
  "account_state": "ANONYMIZED"
}
```

## The old token no longer works

`GET /api/rider/v1/me` → **401**

```json
{
  "instance": "/api/rider/v1/me",
  "status": 401,
  "title": "Unauthenticated",
  "type": "https://errors.blizz.taxi/unauthenticated",
  "code": "UNAUTHENTICATED",
  "correlation_id": "f3f7cf50-622b-4cc9-bb78-adf03e506638"
}
```

Done: client 55f277c8-35d3-406e-8f3d-2860f10c905b anonymized.

# Scenario: full-ride

## Start-up data for the apps

`GET /api/config/v1/bootstrap` → **200**

```json
{
  "settings_version": 0,
  "brand": {
    "service_name": "Blizz Taxi",
    "primary_color": "#111111",
    "on_primary_color": "#FFFFFF",
    "accent_color": null,
    "logo_url": null,
    "support_phone": null,
    "support_email": null,
    "support_telegram": null,
    "privacy_policy_url": null,
    "terms_url": null
  },
  "languages": {
    "default_language": "ru",
    "enabled": [
      "uk",
      "pl",
      "ru",
      "en"
    ]
  },
  "calls": {
    "mode": "DIRECT",
    "service_phone": null
  },
  "preorders": {
    "threshold_minutes": 60,
    "max_days_ahead": 7
  },
  "maps": {
    "provider": null,
    "android_key": null,
    "ios_key": null,
    "web_key": null
  },
  "cities": [
    {
      "id": "5a000000-0000-4000-8000-000000000002",
      "code": "warszawa",
      "name": "Warszawa",
      "currency": "PLN",
      "timezone": "Europe/Warsaw"
    },
    {
      "id": "5a000000-0000-4000-8000-000000000001",
      "code": "kyiv",
      "name": "Київ",
      "currency": "UAH",
      "timezone": "Europe/Kyiv"
    }
  ]
}
```

## Driver signs in and goes online 200 m from the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21533"
}
```

```json
{
  "challenge_id": "8e0415f0-7738-467c-afe8-d050f4109daf",
  "expires_at": "2026-10-27T16:18:45.386210588Z",
  "resend_available_at": "2026-10-27T16:13:46.386210588Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "847156",
  "sent_at": "2026-10-27T16:13:45.38895525Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8e0415f0-7738-467c-afe8-d050f4109daf",
  "code": "847156",
  "device_ref": "sandbox-21533"
}
```

```json
{
  "session_id": "f2b302c3-ec5c-41e2-9212-fdd2946dcdd6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODUyNSwiaWF0IjoxNzkzMTE3NjI1LCJqdGkiOiJmZGE5MDVkNy02ZmE5LTQ4YWYtOTgxOC03YmFlMzIyMjFhOTIiLCJzaWQiOiJmMmIzMDJjMy1lYzVjLTQxZTItOTIxMi1mZGQyOTQ2ZGNkZDYifQ.MRFC4RVHFQ3kFIyXDnxTHEf-l3IjPSMROihTdDizIIo",
  "access_expires_at": "2026-10-27T16:28:45.447746481Z",
  "refresh_token": "BuBCyS3xFeAt-Lwafs6tT-308qSvs8GMvu_2Y63_k3k",
  "refresh_expires_at": "2026-11-26T16:13:45.447070917Z",
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
  "command_id": "b883ad5b-c464-436f-b57d-83cbbc6e1c73",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:13:45Z",
    "sequence": 1793117625502
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ab1073ce-86d9-4f53-9613-c3f31547e432",
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
  "last_heartbeat_at": "2026-10-27T16:13:45.521687Z",
  "last_location_at": "2026-10-27T16:13:45.521687Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679974371",
  "device_ref": "sandbox-2625"
}
```

```json
{
  "challenge_id": "5272a28a-3360-44e9-b199-27a05eb7948d",
  "expires_at": "2026-10-27T16:18:45.559260973Z",
  "resend_available_at": "2026-10-27T16:13:46.559260973Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679974371` → **200**

```json
{
  "phone": "+380679974371",
  "audience": "CLIENT",
  "code": "644180",
  "sent_at": "2026-10-27T16:13:45.561757573Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5272a28a-3360-44e9-b199-27a05eb7948d",
  "code": "644180",
  "device_ref": "sandbox-2625"
}
```

```json
{
  "session_id": "19d61f59-7b7f-427c-9b3a-a79e31994fea",
  "subject": {
    "type": "CLIENT",
    "id": "ab33d08f-e940-4288-82d7-f05390838b1f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYjMzZDA4Zi1lOTQwLTQyODgtODJkNy1mMDUzOTA4MzhiMWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4NTI1LCJpYXQiOjE3OTMxMTc2MjUsImp0aSI6IjY1ZjhmOGM5LTYzZDYtNGE3Mi1iY2I2LTU3OWY2ZjE2MWQ4NCIsInNpZCI6IjE5ZDYxZjU5LTdiN2YtNDI3Yy05YjNhLWE3OWUzMTk5NGZlYSJ9.45sKJBcv0UKyjGTcuyPcgp_VEK4JX7be55HNlJYXidQ",
  "access_expires_at": "2026-10-27T16:28:45.62072655Z",
  "refresh_token": "Cv-h3UbLCjqaN4XAx0xeK08oR2t8U296TX7WMy9ahCU",
  "refresh_expires_at": "2026-11-26T16:13:45.620040146Z",
  "account_created": true
}
```

`GET /api/rider/v1/vehicle-classes?lat=50.4501&lon=30.5234` → **200**

```json
[
  {
    "code": "COMFORT",
    "name": "Комфорт"
  },
  {
    "code": "STANDARD",
    "name": "Стандарт"
  }
]
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "439235e1-3f47-411e-90a2-a568450a508e",
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
  "id": "404a8ca7-0a66-4cd1-91ea-d0f7d9a287c2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:18:45.696842Z",
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

## Both phones register for pushes (the sandbox only records them: /sandbox/v1/pushes)

`POST /api/driver/v1/push-devices` → **201**

```json
{
  "command_id": "3296eefe-ca3a-4b40-a52f-f644c27e4342",
  "platform": "ANDROID",
  "token": "sandbox-driver-81ed5287-9314-474e-9466-8a2e0e95d32e"
}
```

```json
{
  "id": "ba915c24-aefb-4b70-9864-f246f0db1916",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T16:13:45.747189Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "c479df6e-39ed-4770-bc37-540e9778bc2b",
  "platform": "ANDROID",
  "token": "sandbox-rider-1b5131b0-921e-444b-afe3-380bf9e20a4f"
}
```

```json
{
  "id": "cc3feccf-9ae7-4a2a-9710-d4f22a5841e6",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T16:13:45.7884Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "7c8004d2-e709-49f6-acc5-164f2d926ad4",
  "quote_id": "404a8ca7-0a66-4cd1-91ea-d0f7d9a287c2",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан Незалежності",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "dropoff_label": "Залізничний вокзал",
  "payment_method": "CASH"
}
```

```json
{
  "id": "28c04c30-53b3-4a08-8177-e71cd3aa2487",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ab33d08f-e940-4288-82d7-f05390838b1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан Незалежності",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Залізничний вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-27T16:13:45.836921Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The driver gets the offer and accepts it

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "1aac8076-6e1c-4485-8a88-03382d5754fb",
    "order_id": "28c04c30-53b3-4a08-8177-e71cd3aa2487",
    "expires_at": "2026-10-27T16:14:00.841786Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "payment_method": "CASH",
    "price_minor": 10517,
    "currency": "UAH",
    "distance_m": 44
  }
]
```

`POST /api/driver/v1/offers/1aac8076-6e1c-4485-8a88-03382d5754fb/accept` → **200**

```json
{
  "command_id": "15e7cb22-14e6-47d9-b64a-b073e442cb8f"
}
```

```json
{
  "id": "3f48bb56-cc6e-4d1e-9f7e-233803105d50",
  "order_id": "28c04c30-53b3-4a08-8177-e71cd3aa2487",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cb039b1c-e01c-40a8-bbfb-61857fe99ec8",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T16:13:45.811Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T16:13:45.811Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T16:13:45.811Z` → **200**

```json
[
  {
    "at": "2026-10-27T16:13:47.355377109Z",
    "token_suffix": "95d32e",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_id": "28c04c30-53b3-4a08-8177-e71cd3aa2487",
      "order_version": "2",
      "event_id": "102f4fca-8987-4e4e-800b-8f6d2a59fbb7",
      "event_type": "OfferMade",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380679974371&after=2026-10-27T16:13:45.811Z` → **200**

```json
[
  {
    "at": "2026-10-27T16:13:47.357566053Z",
    "token_suffix": "e20a4f",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_id": "28c04c30-53b3-4a08-8177-e71cd3aa2487",
      "order_version": "3",
      "event_id": "7a086449-bd02-46f7-a549-b638c5dc6fde",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/28c04c30-53b3-4a08-8177-e71cd3aa2487/messages` → **201**

```json
{
  "command_id": "167a3055-b4e4-48cd-bc73-732d0535d8e2",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "08711630-bad0-4cde-88e0-68b2800c5ab1",
  "order_id": "28c04c30-53b3-4a08-8177-e71cd3aa2487",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T16:13:48.077918019Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cb039b1c-e01c-40a8-bbfb-61857fe99ec8",
  "order_id": "28c04c30-53b3-4a08-8177-e71cd3aa2487",
  "assignment_id": "3f48bb56-cc6e-4d1e-9f7e-233803105d50",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан Незалежності",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Залізничний вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cb039b1c-e01c-40a8-bbfb-61857fe99ec8/messages` → **201**

```json
{
  "command_id": "571d2358-d643-47a2-b4ef-df5e1d7601aa",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "9a3e7300-30b8-4a05-9d35-03692fbe1416",
  "order_id": "28c04c30-53b3-4a08-8177-e71cd3aa2487",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T16:13:48.13544213Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/28c04c30-53b3-4a08-8177-e71cd3aa2487/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/cb039b1c-e01c-40a8-bbfb-61857fe99ec8/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380679974371"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/ab1073ce-86d9-4f53-9613-c3f31547e432/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:13:48Z",
    "sequence": 1793117628217
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ab1073ce-86d9-4f53-9613-c3f31547e432",
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
  "last_heartbeat_at": "2026-10-27T16:13:48.237698Z",
  "last_location_at": "2026-10-27T16:13:48.237698Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cb039b1c-e01c-40a8-bbfb-61857fe99ec8",
  "order_id": "28c04c30-53b3-4a08-8177-e71cd3aa2487",
  "assignment_id": "3f48bb56-cc6e-4d1e-9f7e-233803105d50",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан Незалежності",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Залізничний вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cb039b1c-e01c-40a8-bbfb-61857fe99ec8/arrive` → **200**

```json
{
  "command_id": "706ff4b5-4df8-439a-9d06-23e4e51d42f5",
  "expected_version": 0
}
```

```json
{
  "id": "cb039b1c-e01c-40a8-bbfb-61857fe99ec8",
  "order_id": "28c04c30-53b3-4a08-8177-e71cd3aa2487",
  "assignment_id": "3f48bb56-cc6e-4d1e-9f7e-233803105d50",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан Незалежності",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Залізничний вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-27T16:13:48.292505Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cb039b1c-e01c-40a8-bbfb-61857fe99ec8/start` → **200**

```json
{
  "command_id": "608fd1a5-aec7-4f07-91b1-5942277a77d4",
  "expected_version": 1
}
```

```json
{
  "id": "cb039b1c-e01c-40a8-bbfb-61857fe99ec8",
  "order_id": "28c04c30-53b3-4a08-8177-e71cd3aa2487",
  "assignment_id": "3f48bb56-cc6e-4d1e-9f7e-233803105d50",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан Незалежності",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Залізничний вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-27T16:13:48.292505Z",
  "started_at": "2026-10-27T16:13:48.329059Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/ab1073ce-86d9-4f53-9613-c3f31547e432/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:13:48Z",
    "sequence": 1793117628354
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ab1073ce-86d9-4f53-9613-c3f31547e432",
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
  "last_heartbeat_at": "2026-10-27T16:13:48.37602Z",
  "last_location_at": "2026-10-27T16:13:48.37602Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/cb039b1c-e01c-40a8-bbfb-61857fe99ec8/complete` → **200**

```json
{
  "command_id": "3dd24aca-ed09-4bcf-8d98-014f501bf3f8",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:13:48Z",
  "cash_received": true
}
```

```json
{
  "id": "cb039b1c-e01c-40a8-bbfb-61857fe99ec8",
  "order_id": "28c04c30-53b3-4a08-8177-e71cd3aa2487",
  "assignment_id": "3f48bb56-cc6e-4d1e-9f7e-233803105d50",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан Незалежності",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Залізничний вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-27T16:13:48.292505Z",
  "started_at": "2026-10-27T16:13:48.329059Z",
  "completed_at": "2026-10-27T16:13:48.414293Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/28c04c30-53b3-4a08-8177-e71cd3aa2487` → **200**

```json
{
  "id": "28c04c30-53b3-4a08-8177-e71cd3aa2487",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "ab33d08f-e940-4288-82d7-f05390838b1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан Незалежності",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Залізничний вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_REPORTED",
  "price_minor": 10517,
  "final_price_minor": 10517,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "3f48bb56-cc6e-4d1e-9f7e-233803105d50",
    "order_id": "28c04c30-53b3-4a08-8177-e71cd3aa2487",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cb039b1c-e01c-40a8-bbfb-61857fe99ec8",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T16:13:45.836921Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "28c04c30-53b3-4a08-8177-e71cd3aa2487",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-27T16:13:45.836921Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "vehicle_class": "STANDARD",
    "price_minor": 10517,
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "driver": {
      "name": "Іван Петренко",
      "vehicle": {
        "make": "Skoda",
        "model": "Octavia",
        "color": "white",
        "registration_number": "AA0001TX"
      }
    },
    "chat_available": true,
    "cancellation": null,
    "pickup_at": null
  }
]
```

`GET /api/driver/v1/trips` → **200**

```json
[
  {
    "id": "cb039b1c-e01c-40a8-bbfb-61857fe99ec8",
    "order_id": "28c04c30-53b3-4a08-8177-e71cd3aa2487",
    "order_short_number": 5,
    "created_at": "2026-10-27T16:13:45.915834Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "b29db723-af12-4d0c-afac-9cc08248450b",
    "order_id": "538d2526-184c-4884-949f-e99ecec0f0d6",
    "order_short_number": 1,
    "created_at": "2026-10-27T16:13:26.186038Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  }
]
```

`GET /api/driver/v1/balance` → **200**

```json
{
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": -104,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

## The rider leaves a 10 % tip in cash: it is only recorded

`GET /api/rider/v1/orders/28c04c30-53b3-4a08-8177-e71cd3aa2487/tip` → **200**

```json
{
  "order_id": "28c04c30-53b3-4a08-8177-e71cd3aa2487",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CASH",
  "available_until": "2026-10-28T16:13:48.414293Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/28c04c30-53b3-4a08-8177-e71cd3aa2487/tip` → **201**

```json
{
  "command_id": "a1aad2ae-e01c-48bf-ad71-556744ff8032",
  "amount_minor": 1100
}
```

```json
{
  "id": "23a92b38-eb0a-495e-b066-f889fcfdf42c",
  "order_id": "28c04c30-53b3-4a08-8177-e71cd3aa2487",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-27T16:13:51.600961Z"
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
  "session_id": "459a1b15-01db-4727-a100-ab0e063ef454",
  "subject": {
    "type": "STAFF",
    "id": "e5e7800f-85c9-49ac-b87f-a953b2fb2378"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWU3ODAwZi04NWM5LTQ5YWMtYjg3Zi1hOTUzYjJmYjIzNzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg1MzEsImlhdCI6MTc5MzExNzYzMSwianRpIjoiOTE4ODkyMTktMTY1Yy00Yzk3LTg2MWUtYTZkNTM5ZTQwYmQwIiwic2lkIjoiNDU5YTFiMTUtMDFkYi00NzI3LWExMDAtYWIwZTA2M2VmNDU0In0.HQTViIhNYwPmXSY3TXedvyPZHsb_t6ZIiQLeknSO3X0",
  "access_expires_at": "2026-10-27T16:28:51.932844395Z",
  "refresh_token": "ZMOzD0F0Q8W7jePJBN7aLpxNfYSSE3AKerZciJRGGA8",
  "refresh_expires_at": "2026-10-28T04:13:51.932125791Z",
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
  "session_id": "e408a109-9ec9-4c7f-9a95-e26371760354",
  "subject": {
    "type": "STAFF",
    "id": "e5e7800f-85c9-49ac-b87f-a953b2fb2378"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWU3ODAwZi04NWM5LTQ5YWMtYjg3Zi1hOTUzYjJmYjIzNzgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg1MzIsImlhdCI6MTc5MzExNzYzMiwianRpIjoiMTMyODgxYmYtMDczZi00OTRhLWI3MjUtODJlNmE0YzYxYTdmIiwic2lkIjoiZTQwOGExMDktOWVjOS00YzdmLTlhOTUtZTI2MzcxNzYwMzU0In0.p8H9NEFVTj1cqUADogmok1widnBYhBTNqkXaqLonw20",
  "access_expires_at": "2026-10-27T16:28:52.257347558Z",
  "refresh_token": "ntyx0TU7Fmmf_8kqDonzpj5y-m4r2D7c8SrpUzIvnqA",
  "refresh_expires_at": "2026-10-28T04:13:52.256627753Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/28c04c30-53b3-4a08-8177-e71cd3aa2487/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T16:13:45.83771Z",
      "actor": {
        "type": "CLIENT",
        "id": "ab33d08f-e940-4288-82d7-f05390838b1f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "28c04c30-53b3-4a08-8177-e71cd3aa2487",
        "quote_id": "404a8ca7-0a66-4cd1-91ea-d0f7d9a287c2",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T16:13:45.840454Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "28c04c30-53b3-4a08-8177-e71cd3aa2487",
        "attempt_id": "7a02e430-abb7-4594-acd2-1337fe95ccb9",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T16:13:45.848712Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1aac8076-6e1c-4485-8a88-03382d5754fb",
        "order_id": "28c04c30-53b3-4a08-8177-e71cd3aa2487",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T16:13:45.918207Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "1aac8076-6e1c-4485-8a88-03382d5754fb",
        "order_id": "28c04c30-53b3-4a08-8177-e71cd3aa2487",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "3f48bb56-cc6e-4d1e-9f7e-233803105d50"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order 28c04c30-53b3-4a08-8177-e71cd3aa2487.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31258"
}
```

```json
{
  "challenge_id": "ee02bea9-0b23-4afe-8b64-621f1d48aa91",
  "expires_at": "2026-10-27T16:18:52.328931717Z",
  "resend_available_at": "2026-10-27T16:13:53.328931717Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "826785",
  "sent_at": "2026-10-27T16:13:52.331837131Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ee02bea9-0b23-4afe-8b64-621f1d48aa91",
  "code": "826785",
  "device_ref": "sandbox-31258"
}
```

```json
{
  "session_id": "2032cbec-28d0-4449-815f-44b219112ee3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODUzMiwiaWF0IjoxNzkzMTE3NjMyLCJqdGkiOiIxMmNiMDI3ZC05MGM1LTQwOTYtYjY0Ni0zMjg4NjFlMTVlYmQiLCJzaWQiOiIyMDMyY2JlYy0yOGQwLTQ0NDktODE1Zi00NGIyMTkxMTJlZTMifQ.JtLB6LDw4X2yTuw94bg2sOODcGHkFAThTfsniiOM4i0",
  "access_expires_at": "2026-10-27T16:28:52.393461955Z",
  "refresh_token": "xy-atfcE4WFtP9hQyULr3VJf_vTz-GzA_0hmLpxKKYQ",
  "refresh_expires_at": "2026-11-26T16:13:52.392847706Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ab1073ce-86d9-4f53-9613-c3f31547e432",
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
  "last_heartbeat_at": "2026-10-27T16:13:48.37602Z",
  "last_location_at": "2026-10-27T16:13:48.37602Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ab1073ce-86d9-4f53-9613-c3f31547e432/handover` → **200**

```json
{
  "command_id": "4209816a-2540-4d6d-a81b-92a6b2218fe9",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ab1073ce-86d9-4f53-9613-c3f31547e432",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-27T16:13:48.37602Z",
  "last_location_at": "2026-10-27T16:13:48.37602Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ab1073ce-86d9-4f53-9613-c3f31547e432/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:13:52Z",
    "sequence": 1793117632485
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ab1073ce-86d9-4f53-9613-c3f31547e432",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-27T16:13:52.505998Z",
  "last_location_at": "2026-10-27T16:13:52.505998Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669513372",
  "device_ref": "sandbox-10300"
}
```

```json
{
  "challenge_id": "de337b18-afec-4215-8da7-fcacc4a58836",
  "expires_at": "2026-10-27T16:18:52.533877566Z",
  "resend_available_at": "2026-10-27T16:13:53.533877566Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669513372` → **200**

```json
{
  "phone": "+380669513372",
  "audience": "CLIENT",
  "code": "202481",
  "sent_at": "2026-10-27T16:13:52.536746751Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "de337b18-afec-4215-8da7-fcacc4a58836",
  "code": "202481",
  "device_ref": "sandbox-10300"
}
```

```json
{
  "session_id": "5a28962e-9476-40c3-9123-331d93319a5e",
  "subject": {
    "type": "CLIENT",
    "id": "395d09b6-46d1-4f70-8f00-552937ea6bae"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOTVkMDliNi00NmQxLTRmNzAtOGYwMC01NTI5MzdlYTZiYWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4NTMyLCJpYXQiOjE3OTMxMTc2MzIsImp0aSI6ImE5ZmQ0Yzc5LTY3NTQtNDYzYS1iMDg4LTgxY2I4NmFlYmFhNiIsInNpZCI6IjVhMjg5NjJlLTk0NzYtNDBjMy05MTIzLTMzMWQ5MzMxOWE1ZSJ9.RkuoIZr6oZbxylHFztJbe6OCRZ0lzxg0m8RlxB_1pTs",
  "access_expires_at": "2026-10-27T16:28:52.597348001Z",
  "refresh_token": "PxUADOKmlHhZIKKHeICIUD8ZMCggQcXim5q3n5iOzA4",
  "refresh_expires_at": "2026-11-26T16:13:52.596736548Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c7481ff7-62d7-4371-bd5f-82dad40e3126",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4268,
    "lon": 30.5636
  },
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  }
}
```

```json
{
  "id": "ad8333d3-e7dd-4221-85e4-e568463ad0ff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T16:18:52.644431Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 21185,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "41004bb3-a734-4050-a7f9-24e0318d2474",
  "quote_id": "ad8333d3-e7dd-4221-85e4-e568463ad0ff",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4268,
    "lon": 30.5636
  },
  "pickup_label": "Палац спорту",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "CASH"
}
```

```json
{
  "id": "3fb30ebe-edae-4d7d-8ce7-882c5db9fcd8",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "395d09b6-46d1-4f70-8f00-552937ea6bae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4268,
    "lon": 30.5636
  },
  "pickup_label": "Палац спорту",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 21185,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-27T16:13:52.687618Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "c864c8fc-a89a-4bab-8dc0-75bec59f1520",
    "order_id": "3fb30ebe-edae-4d7d-8ce7-882c5db9fcd8",
    "expires_at": "2026-10-27T16:14:07.691596Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4268,
      "lon": 30.5636
    },
    "pickup_label": "Палац спорту",
    "dropoff_label": "Голосіїв",
    "payment_method": "CASH",
    "price_minor": 21185,
    "currency": "UAH",
    "distance_m": 78
  }
]
```

`POST /api/driver/v1/offers/c864c8fc-a89a-4bab-8dc0-75bec59f1520/accept` → **200**

```json
{
  "command_id": "9789de16-71ff-468f-91df-4b9b0328121a"
}
```

```json
{
  "id": "a3e15073-7bdd-4d8a-8862-8474889e99c8",
  "order_id": "3fb30ebe-edae-4d7d-8ce7-882c5db9fcd8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9d8e423e-3f0c-494c-8e20-d07118a920e7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9d8e423e-3f0c-494c-8e20-d07118a920e7",
  "order_id": "3fb30ebe-edae-4d7d-8ce7-882c5db9fcd8",
  "assignment_id": "a3e15073-7bdd-4d8a-8862-8474889e99c8",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4268,
    "lon": 30.5636
  },
  "pickup_label": "Палац спорту",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "CASH",
  "price_minor": 21185,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/ab1073ce-86d9-4f53-9613-c3f31547e432/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:13:52Z",
    "sequence": 1793117632807
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ab1073ce-86d9-4f53-9613-c3f31547e432",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-27T16:13:52.828049Z",
  "last_location_at": "2026-10-27T16:13:52.828049Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9d8e423e-3f0c-494c-8e20-d07118a920e7/arrive` → **200**

```json
{
  "command_id": "8394ec53-f912-4f90-a9a8-2a0994fc95fd",
  "expected_version": 0
}
```

```json
{
  "id": "9d8e423e-3f0c-494c-8e20-d07118a920e7",
  "order_id": "3fb30ebe-edae-4d7d-8ce7-882c5db9fcd8",
  "assignment_id": "a3e15073-7bdd-4d8a-8862-8474889e99c8",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.4268,
    "lon": 30.5636
  },
  "pickup_label": "Палац спорту",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "CASH",
  "price_minor": 21185,
  "currency": "UAH",
  "arrived_at": "2026-10-27T16:13:52.866714Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9d8e423e-3f0c-494c-8e20-d07118a920e7/start` → **200**

```json
{
  "command_id": "5e853074-108a-4bd1-b00d-7651acd82103",
  "expected_version": 1
}
```

```json
{
  "id": "9d8e423e-3f0c-494c-8e20-d07118a920e7",
  "order_id": "3fb30ebe-edae-4d7d-8ce7-882c5db9fcd8",
  "assignment_id": "a3e15073-7bdd-4d8a-8862-8474889e99c8",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4268,
    "lon": 30.5636
  },
  "pickup_label": "Палац спорту",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "CASH",
  "price_minor": 21185,
  "currency": "UAH",
  "arrived_at": "2026-10-27T16:13:52.866714Z",
  "started_at": "2026-10-27T16:13:52.908825Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/ab1073ce-86d9-4f53-9613-c3f31547e432/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:13:52Z",
    "sequence": 1793117632936
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ab1073ce-86d9-4f53-9613-c3f31547e432",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "ON_TRIP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-27T16:13:52.957005Z",
  "last_location_at": "2026-10-27T16:13:52.957005Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-136"
}
```

```json
{
  "challenge_id": "41a41d98-2835-47c4-babc-0e278065bb00",
  "expires_at": "2026-10-27T16:18:52.983336202Z",
  "resend_available_at": "2026-10-27T16:13:53.983336202Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "670912",
  "sent_at": "2026-10-27T16:13:52.985875921Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "41a41d98-2835-47c4-babc-0e278065bb00",
  "code": "670912",
  "device_ref": "sandbox-136"
}
```

```json
{
  "session_id": "db01832a-8b00-4fc1-9b65-60e9b96f86cb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODUzMywiaWF0IjoxNzkzMTE3NjMzLCJqdGkiOiI2NjVmYTBkNS0xMjRlLTQyMDEtOGZjZi0yYWU4ZjVhNmIyOGYiLCJzaWQiOiJkYjAxODMyYS04YjAwLTRmYzEtOWI2NS02MGU5Yjk2Zjg2Y2IifQ.xbqmdBCPo4XgI0nmACY49Xxo9WkUZr4hRrGCnKoqjGM",
  "access_expires_at": "2026-10-27T16:28:53.045934651Z",
  "refresh_token": "Vbe6KpD-Uy7z8QhDUu3z6GiLUEEQU1-BD84YN3OTXwA",
  "refresh_expires_at": "2026-11-26T16:13:53.045365417Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d7f3a5ce-24ce-46ac-aa1b-f9e82e14cd40",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-27T16:13:30.875484Z",
  "last_location_at": "2026-10-27T16:13:30.875484Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/d7f3a5ce-24ce-46ac-aa1b-f9e82e14cd40/handover` → **200**

```json
{
  "command_id": "011e9c9d-1554-494c-8a7d-55cfcf4ce85d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d7f3a5ce-24ce-46ac-aa1b-f9e82e14cd40",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-27T16:13:30.875484Z",
  "last_location_at": "2026-10-27T16:13:30.875484Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/d7f3a5ce-24ce-46ac-aa1b-f9e82e14cd40/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:13:53Z",
    "sequence": 1793117633140
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d7f3a5ce-24ce-46ac-aa1b-f9e82e14cd40",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-27T16:13:53.161399Z",
  "last_location_at": "2026-10-27T16:13:53.161399Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The operator interrupts: «Поломка автомобиля в пути», follow-up on the service

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
  "session_id": "2f1c27d5-af80-4cf1-9209-9c456410c5c8",
  "subject": {
    "type": "STAFF",
    "id": "e5e7800f-85c9-49ac-b87f-a953b2fb2378"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWU3ODAwZi04NWM5LTQ5YWMtYjg3Zi1hOTUzYjJmYjIzNzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg1MzMsImlhdCI6MTc5MzExNzYzMywianRpIjoiYWQwOTQ3Y2ItYTFhOC00NmMxLWE1NDQtODZjMDBhMjA4NjY2Iiwic2lkIjoiMmYxYzI3ZDUtYWY4MC00Y2YxLTkyMDktOWM0NTY0MTBjNWM4In0.BZZykos5BjIuPIfL0zKjF86zkLQHxNeFHLSD5IuFf14",
  "access_expires_at": "2026-10-27T16:28:53.487438084Z",
  "refresh_token": "wtFMh6RafWTQGFzJC3ei-V19390cNd5E-vUMufjWFsQ",
  "refresh_expires_at": "2026-10-28T04:13:53.486665049Z",
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
  "session_id": "cafc5625-5711-4a98-9f7c-a320ce13f45a",
  "subject": {
    "type": "STAFF",
    "id": "e5e7800f-85c9-49ac-b87f-a953b2fb2378"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWU3ODAwZi04NWM5LTQ5YWMtYjg3Zi1hOTUzYjJmYjIzNzgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg1MzMsImlhdCI6MTc5MzExNzYzMywianRpIjoiZTE5ZGJlZmQtMjcyZS00NjFiLWJkNTgtZDBmMTFhY2ExMDY4Iiwic2lkIjoiY2FmYzU2MjUtNTcxMS00YTk4LTlmN2MtYTMyMGNlMTNmNDVhIn0.yUzpww71rki0h03iG1-cC233rp44Kr1bM_T6Oe090Zk",
  "access_expires_at": "2026-10-27T16:28:53.81145618Z",
  "refresh_token": "RA4muMADoI-Tc7A6iCK62bPrNB-3PjAk-HS0CzIunIs",
  "refresh_expires_at": "2026-10-28T04:13:53.810802057Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3fb30ebe-edae-4d7d-8ce7-882c5db9fcd8` → **200**

```json
{
  "id": "3fb30ebe-edae-4d7d-8ce7-882c5db9fcd8",
  "short_number": 6,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "395d09b6-46d1-4f70-8f00-552937ea6bae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4268,
    "lon": 30.5636
  },
  "pickup_label": "Палац спорту",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 21185,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "a3e15073-7bdd-4d8a-8862-8474889e99c8",
    "order_id": "3fb30ebe-edae-4d7d-8ce7-882c5db9fcd8",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "9d8e423e-3f0c-494c-8e20-d07118a920e7",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T16:13:52.687618Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3fb30ebe-edae-4d7d-8ce7-882c5db9fcd8/interrupt` → **200**

```json
{
  "command_id": "1733f447-b229-400e-b82c-b8ce89f1fe98",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "3fb30ebe-edae-4d7d-8ce7-882c5db9fcd8",
    "short_number": 6,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "395d09b6-46d1-4f70-8f00-552937ea6bae",
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4268,
      "lon": 30.5636
    },
    "pickup_label": "Палац спорту",
    "dropoff": {
      "lat": 50.3906,
      "lon": 30.4825
    },
    "dropoff_label": "Голосіїв",
    "payment_method": "CASH",
    "payment_state": "CASH_EXPECTED",
    "price_minor": 21185,
    "final_price_minor": null,
    "currency": "UAH",
    "search_phase": "STOPPED",
    "assignment": {
      "id": "a3e15073-7bdd-4d8a-8862-8474889e99c8",
      "order_id": "3fb30ebe-edae-4d7d-8ce7-882c5db9fcd8",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "9d8e423e-3f0c-494c-8e20-d07118a920e7",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T16:13:52.687618Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "3a081707-903f-4a9d-9220-dbf80c5de0fb",
    "short_number": 7,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "395d09b6-46d1-4f70-8f00-552937ea6bae",
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.41,
      "lon": 30.525
    },
    "pickup_label": "Where the previous car stopped",
    "dropoff": {
      "lat": 50.3906,
      "lon": 30.4825
    },
    "dropoff_label": "Голосіїв",
    "payment_method": "SERVICE",
    "payment_state": null,
    "price_minor": 13074,
    "final_price_minor": null,
    "currency": "UAH",
    "search_phase": "PERSONAL",
```

## Oleh takes the follow-up and finishes; the rider sees both orders

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "e3bfcd76-3f09-43e0-9723-1aad86a67c0f",
    "order_id": "3a081707-903f-4a9d-9220-dbf80c5de0fb",
    "expires_at": "2026-10-27T16:14:08.92774Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.41,
      "lon": 30.525
    },
    "pickup_label": "Where the previous car stopped",
    "dropoff_label": "Голосіїв",
    "payment_method": "SERVICE",
    "price_minor": 13074,
    "currency": "UAH",
    "distance_m": 56
  }
]
```

`POST /api/driver/v1/offers/e3bfcd76-3f09-43e0-9723-1aad86a67c0f/accept` → **200**

```json
{
  "command_id": "712f821f-d425-49c4-b532-b7ccf0a97acf"
}
```

```json
{
  "id": "f9052425-e105-40f4-94c4-96bc70695293",
  "order_id": "3a081707-903f-4a9d-9220-dbf80c5de0fb",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "10a2744a-6ca5-4545-a0da-232203c21a7c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "10a2744a-6ca5-4545-a0da-232203c21a7c",
  "order_id": "3a081707-903f-4a9d-9220-dbf80c5de0fb",
  "assignment_id": "f9052425-e105-40f4-94c4-96bc70695293",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.41,
    "lon": 30.525
  },
  "pickup_label": "Where the previous car stopped",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "SERVICE",
  "price_minor": 13074,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d7f3a5ce-24ce-46ac-aa1b-f9e82e14cd40",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-27T16:13:53.161399Z",
  "last_location_at": "2026-10-27T16:13:53.161399Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/d7f3a5ce-24ce-46ac-aa1b-f9e82e14cd40/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:13:54Z",
    "sequence": 1793117634132
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d7f3a5ce-24ce-46ac-aa1b-f9e82e14cd40",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-27T16:13:54.156102Z",
  "last_location_at": "2026-10-27T16:13:54.156102Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/10a2744a-6ca5-4545-a0da-232203c21a7c/arrive` → **200**

```json
{
  "command_id": "bcf9df4c-44eb-42fc-87de-993dcc0a0b52",
  "expected_version": 0
}
```

```json
{
  "id": "10a2744a-6ca5-4545-a0da-232203c21a7c",
  "order_id": "3a081707-903f-4a9d-9220-dbf80c5de0fb",
  "assignment_id": "f9052425-e105-40f4-94c4-96bc70695293",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.41,
    "lon": 30.525
  },
  "pickup_label": "Where the previous car stopped",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "SERVICE",
  "price_minor": 13074,
  "currency": "UAH",
  "arrived_at": "2026-10-27T16:13:54.199617Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/10a2744a-6ca5-4545-a0da-232203c21a7c/start` → **200**

```json
{
  "command_id": "7c11f356-26c6-4097-b352-f53f592341bf",
  "expected_version": 1
}
```

```json
{
  "id": "10a2744a-6ca5-4545-a0da-232203c21a7c",
  "order_id": "3a081707-903f-4a9d-9220-dbf80c5de0fb",
  "assignment_id": "f9052425-e105-40f4-94c4-96bc70695293",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.41,
    "lon": 30.525
  },
  "pickup_label": "Where the previous car stopped",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "SERVICE",
  "price_minor": 13074,
  "currency": "UAH",
  "arrived_at": "2026-10-27T16:13:54.199617Z",
  "started_at": "2026-10-27T16:13:54.256368Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/10a2744a-6ca5-4545-a0da-232203c21a7c/complete` → **200**

```json
{
  "command_id": "c0c47d9a-4a70-4c25-a7f1-4e07e37a824e",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:13:54Z"
}
```

```json
{
  "id": "10a2744a-6ca5-4545-a0da-232203c21a7c",
  "order_id": "3a081707-903f-4a9d-9220-dbf80c5de0fb",
  "assignment_id": "f9052425-e105-40f4-94c4-96bc70695293",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": 50.41,
    "lon": 30.525
  },
  "pickup_label": "Where the previous car stopped",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "SERVICE",
  "price_minor": 13074,
  "currency": "UAH",
  "arrived_at": "2026-10-27T16:13:54.199617Z",
  "started_at": "2026-10-27T16:13:54.256368Z",
  "completed_at": "2026-10-27T16:13:54.305307Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "3a081707-903f-4a9d-9220-dbf80c5de0fb",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-27T16:13:53.911261Z",
    "pickup_label": "Where the previous car stopped",
    "dropoff_label": "Голосіїв",
    "vehicle_class": "STANDARD",
    "price_minor": 13074,
    "final_price_minor": 13074,
    "currency": "UAH",
    "payment_method": "SERVICE",
    "driver": {
      "name": "Олег Коваль",
      "vehicle": {
        "make": "Toyota",
        "model": "Corolla",
        "color": "grey",
        "registration_number": "AA0002TX"
      }
    },
    "chat_available": true,
    "cancellation": null,
    "pickup_at": null
  },
  {
    "id": "3fb30ebe-edae-4d7d-8ce7-882c5db9fcd8",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-27T16:13:52.687618Z",
    "pickup_label": "Палац спорту",
    "dropoff_label": "Голосіїв",
    "vehicle_class": "STANDARD",
    "price_minor": 21185,
    "final_price_minor": null,
    "currency": "UAH",
    "payment_method": "CASH",
    "driver": {
      "name": "Іван Петренко",
      "vehicle": {
        "make": "Skoda",
        "model": "Octavia",
        "color": "white",
        "registration_number": "AA0001TX"
      }
    },
    "chat_available": true,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/driver/v1/balance` → **200**

```json
{
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 61113,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/operator/v1/orders/3fb30ebe-edae-4d7d-8ce7-882c5db9fcd8/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T16:13:52.688214Z",
      "actor": {
        "type": "CLIENT",
        "id": "395d09b6-46d1-4f70-8f00-552937ea6bae",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "3fb30ebe-edae-4d7d-8ce7-882c5db9fcd8",
        "quote_id": "ad8333d3-e7dd-4221-85e4-e568463ad0ff",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T16:13:52.690488Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3fb30ebe-edae-4d7d-8ce7-882c5db9fcd8",
        "attempt_id": "63e6e9cd-5146-4563-9c5a-85cbcdb80160",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T16:13:52.698757Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c864c8fc-a89a-4bab-8dc0-75bec59f1520",
        "order_id": "3fb30ebe-edae-4d7d-8ce7-882c5db9fcd8",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T16:13:52.762887Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "c864c8fc-a89a-4bab-8dc0-75bec59f1520",
        "order_id": "3fb30ebe-edae-4d7d-8ce7-882c5db9fcd8",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "a3e15073-7bdd-4d8a-8862-8474889e99c8"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted 3fb30ebe-edae-4d7d-8ce7-882c5db9fcd8, follow-up 3a081707-903f-4a9d-9220-dbf80c5de0fb.

# Scenario: multiple-orders

## A driver goes online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-20720"
}
```

```json
{
  "challenge_id": "37276d92-cad6-45f6-a001-0f30fef631ff",
  "expires_at": "2026-10-27T16:18:57.443188738Z",
  "resend_available_at": "2026-10-27T16:13:58.443188738Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "256797",
  "sent_at": "2026-10-27T16:13:57.445667903Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "37276d92-cad6-45f6-a001-0f30fef631ff",
  "code": "256797",
  "device_ref": "sandbox-20720"
}
```

```json
{
  "session_id": "17d81bb6-e899-4255-ab9a-1831dcdb8acc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODUzNywiaWF0IjoxNzkzMTE3NjM3LCJqdGkiOiJkOWNmMDU1NC1lMWJiLTQzNWMtYWIwZC1kN2Q3ZDE1ZjhiYzAiLCJzaWQiOiIxN2Q4MWJiNi1lODk5LTQyNTUtYWI5YS0xODMxZGNkYjhhY2MifQ.evRbEx0zOj3g0q5Vhnkiw14klSRwjGpMRjrCdLBEGb0",
  "access_expires_at": "2026-10-27T16:28:57.503971445Z",
  "refresh_token": "33Kfc5wLEeDsR_QE1vpsDsLSoGhkArMNCbtCmlY6AZQ",
  "refresh_expires_at": "2026-11-26T16:13:57.503332617Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d7f3a5ce-24ce-46ac-aa1b-f9e82e14cd40",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-27T16:13:54.156102Z",
  "last_location_at": "2026-10-27T16:13:54.156102Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d7f3a5ce-24ce-46ac-aa1b-f9e82e14cd40/handover` → **200**

```json
{
  "command_id": "5bb3991b-291b-4c99-b36d-87c5adeb4fb3",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d7f3a5ce-24ce-46ac-aa1b-f9e82e14cd40",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-27T16:13:54.156102Z",
  "last_location_at": "2026-10-27T16:13:54.156102Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d7f3a5ce-24ce-46ac-aa1b-f9e82e14cd40/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:13:57Z",
    "sequence": 1793117637592
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d7f3a5ce-24ce-46ac-aa1b-f9e82e14cd40",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-27T16:13:57.612729Z",
  "last_location_at": "2026-10-27T16:13:57.612729Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674413046",
  "device_ref": "sandbox-13719"
}
```

```json
{
  "challenge_id": "1b2fcbf5-206e-47c6-89ea-7b854f4c86ea",
  "expires_at": "2026-10-27T16:18:57.641901703Z",
  "resend_available_at": "2026-10-27T16:13:58.641901703Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674413046` → **200**

```json
{
  "phone": "+380674413046",
  "audience": "CLIENT",
  "code": "609909",
  "sent_at": "2026-10-27T16:13:57.644370611Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1b2fcbf5-206e-47c6-89ea-7b854f4c86ea",
  "code": "609909",
  "device_ref": "sandbox-13719"
}
```

```json
{
  "session_id": "56289b38-8847-4993-a6fd-f78903dda9d4",
  "subject": {
    "type": "CLIENT",
    "id": "389b0a87-d54d-4452-947a-524ec1370e68"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzODliMGE4Ny1kNTRkLTQ0NTItOTQ3YS01MjRlYzEzNzBlNjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4NTM3LCJpYXQiOjE3OTMxMTc2MzcsImp0aSI6IjIzYzY2ZjhlLTA2M2QtNDAyYy1iNWVhLTJiOGRkOTE4YTYwNiIsInNpZCI6IjU2Mjg5YjM4LTg4NDctNDk5My1hNmZkLWY3ODkwM2RkYTlkNCJ9.qmWLiGLVwoiGUl-kkw_5qM3c6qYs29u2hm5pE-Y-bkQ",
  "access_expires_at": "2026-10-27T16:28:57.705604073Z",
  "refresh_token": "7jcCM3HIqlRZ9KZ0YB4grQs36ZVqSjXjKD7zRojYNTA",
  "refresh_expires_at": "2026-11-26T16:13:57.704742818Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8407254f-dd17-4684-81ce-20b4e40d95e7",
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
  "id": "7743c37b-73ec-4638-b2e9-7d66023a7f3d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:18:57.752167Z",
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
  "command_id": "5f66013e-d425-45bf-9490-b94d3b4815dd",
  "quote_id": "7743c37b-73ec-4638-b2e9-7d66023a7f3d",
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
  "payment_method": "CASH",
  "recipient": {
    "name": "Бабуся Ольга",
    "phone": "+380677241632"
  }
}
```

```json
{
  "id": "856e9408-df75-4b72-bc64-9c8983cd15ab",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "389b0a87-d54d-4452-947a-524ec1370e68",
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
  "created_at": "2026-10-27T16:13:57.796645Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The offer says nothing about granny; once accepted, the trip does

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "5432ec40-f076-457a-a4eb-96f973038863",
    "order_id": "856e9408-df75-4b72-bc64-9c8983cd15ab",
    "expires_at": "2026-10-27T16:14:12.800734Z",
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
    "distance_m": 211
  }
]
```

`POST /api/driver/v1/offers/5432ec40-f076-457a-a4eb-96f973038863/accept` → **200**

```json
{
  "command_id": "d46d53e8-8959-4c62-8708-b708aa49cdbb"
}
```

```json
{
  "id": "e95f4304-eeb7-4f1e-8f8b-2c283268ed86",
  "order_id": "856e9408-df75-4b72-bc64-9c8983cd15ab",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "362a013b-3bc4-4d07-a0a9-0f45efd3ff3c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "362a013b-3bc4-4d07-a0a9-0f45efd3ff3c",
  "order_id": "856e9408-df75-4b72-bc64-9c8983cd15ab",
  "assignment_id": "e95f4304-eeb7-4f1e-8f8b-2c283268ed86",
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
  "recipient": {
    "name": "Бабуся Ольга",
    "phone": "+380677241632"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f2552afc-0a0b-45be-b094-8b677bea5d87",
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
  "id": "45fd7ed7-1d5d-43b7-8cbb-f154bbe47299",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:18:57.949254Z",
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
  "command_id": "f43ba393-c5bb-4d96-83c2-aa1ca4247a96",
  "quote_id": "45fd7ed7-1d5d-43b7-8cbb-f154bbe47299",
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
  "payment_method": "CASH",
  "recipient": null
}
```

```json
{
  "id": "6da38d08-80cb-43fc-91af-cdbfe0a312c1",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "389b0a87-d54d-4452-947a-524ec1370e68",
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
  "created_at": "2026-10-27T16:13:57.987041Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "89daed74-5cbe-4026-aaf0-4738e3d0a07d",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-27T19:13:58Z"
}
```

```json
{
  "id": "e0ba1b39-04ee-4f2b-a956-987c5438a293",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:18:58.037933Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T19:13:58Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "876a9275-5e26-4961-9188-dca030ce3f90",
  "quote_id": "e0ba1b39-04ee-4f2b-a956-987c5438a293",
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
  "payment_method": "CASH",
  "recipient": null,
  "pickup_at": "2026-10-27T19:13:58Z"
}
```

```json
{
  "id": "34541399-2321-4aa8-8ecb-89ca466f89e7",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "389b0a87-d54d-4452-947a-524ec1370e68",
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
  "price_minor": 13517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-27T16:13:58.079363Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T19:13:58Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The fourth is refused: at most three active orders, orders for later included

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5dde017e-7b82-4a39-aa75-4d9331103577",
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
  "id": "c9bd2f74-0f2b-49fd-a2e5-db2b84230db2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:18:58.122068Z",
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

`POST /api/rider/v1/orders` → **409**

```json
{
  "command_id": "ae168eb1-eb51-4245-9532-5817ef59632b",
  "quote_id": "c9bd2f74-0f2b-49fd-a2e5-db2b84230db2",
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
  "payment_method": "CASH",
  "recipient": null
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 409,
  "title": "Active order limit",
  "type": "https://errors.blizz.taxi/active-order-limit",
  "code": "ACTIVE_ORDER_LIMIT",
  "correlation_id": "0b09450f-dbc0-460f-ad50-737fdb32c71f"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "34541399-2321-4aa8-8ecb-89ca466f89e7",
      "short_number": 10,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "389b0a87-d54d-4452-947a-524ec1370e68",
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
      "price_minor": 13517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": null,
      "assignment": null,
      "created_at": "2026-10-27T16:13:58.079363Z",
      "cancellation": null,
      "pickup_at": "2026-10-27T19:13:58Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "6da38d08-80cb-43fc-91af-cdbfe0a312c1",
      "short_number": 9,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "389b0a87-d54d-4452-947a-524ec1370e68",
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
      "created_at": "2026-10-27T16:13:57.987041Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "856e9408-df75-4b72-bc64-9c8983cd15ab",
      "short_number": 8,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "389b0a87-d54d-4452-947a-524ec1370e68",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "6da38d08-80cb-43fc-91af-cdbfe0a312c1",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "389b0a87-d54d-4452-947a-524ec1370e68",
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
  "created_at": "2026-10-27T16:13:57.987041Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/856e9408-df75-4b72-bc64-9c8983cd15ab` → **200**

```json
{
  "id": "856e9408-df75-4b72-bc64-9c8983cd15ab",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "389b0a87-d54d-4452-947a-524ec1370e68",
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
  "search_phase": "STOPPED",
  "assignment": {
    "id": "e95f4304-eeb7-4f1e-8f8b-2c283268ed86",
    "order_id": "856e9408-df75-4b72-bc64-9c8983cd15ab",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "362a013b-3bc4-4d07-a0a9-0f45efd3ff3c",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-27T16:13:57.796645Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/856e9408-df75-4b72-bc64-9c8983cd15ab/cancel` → **200**

```json
{
  "command_id": "d65224f5-2a14-42e3-813e-a7200b55ce2c",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "856e9408-df75-4b72-bc64-9c8983cd15ab",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "389b0a87-d54d-4452-947a-524ec1370e68",
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
  "search_phase": "STOPPED",
  "assignment": {
    "id": "e95f4304-eeb7-4f1e-8f8b-2c283268ed86",
    "order_id": "856e9408-df75-4b72-bc64-9c8983cd15ab",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "362a013b-3bc4-4d07-a0a9-0f45efd3ff3c",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T16:13:57.796645Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/6da38d08-80cb-43fc-91af-cdbfe0a312c1` → **200**

```json
{
  "id": "6da38d08-80cb-43fc-91af-cdbfe0a312c1",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "389b0a87-d54d-4452-947a-524ec1370e68",
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
  "created_at": "2026-10-27T16:13:57.987041Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/6da38d08-80cb-43fc-91af-cdbfe0a312c1/cancel` → **200**

```json
{
  "command_id": "5f524aa6-f193-4119-9a28-0c8cb60a7985",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6da38d08-80cb-43fc-91af-cdbfe0a312c1",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "389b0a87-d54d-4452-947a-524ec1370e68",
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
  "search_phase": "STOPPED",
  "assignment": null,
  "created_at": "2026-10-27T16:13:57.987041Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/34541399-2321-4aa8-8ecb-89ca466f89e7` → **200**

```json
{
  "id": "34541399-2321-4aa8-8ecb-89ca466f89e7",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "389b0a87-d54d-4452-947a-524ec1370e68",
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
  "price_minor": 13517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-27T16:13:58.079363Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T19:13:58Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/34541399-2321-4aa8-8ecb-89ca466f89e7/cancel` → **200**

```json
{
  "command_id": "29943bc0-77ce-412b-9bb9-d47c5d302986",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "34541399-2321-4aa8-8ecb-89ca466f89e7",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "389b0a87-d54d-4452-947a-524ec1370e68",
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
  "price_minor": 13517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-27T16:13:58.079363Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати"
    }
  },
  "pickup_at": "2026-10-27T19:13:58Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d7f3a5ce-24ce-46ac-aa1b-f9e82e14cd40",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-27T16:13:57.612729Z",
  "last_location_at": "2026-10-27T16:13:57.612729Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d7f3a5ce-24ce-46ac-aa1b-f9e82e14cd40/close` → **200**

```json
{
  "command_id": "cecb7e75-da14-428f-a6d3-285499ac586f",
  "expected_version": 2
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
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

Done: orders 856e9408-df75-4b72-bc64-9c8983cd15ab, 6da38d08-80cb-43fc-91af-cdbfe0a312c1, 34541399-2321-4aa8-8ecb-89ca466f89e7.

# Scenario: operator-bonus

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
  "session_id": "4525a61d-3042-4753-afaa-60786edd3589",
  "subject": {
    "type": "STAFF",
    "id": "e5e7800f-85c9-49ac-b87f-a953b2fb2378"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWU3ODAwZi04NWM5LTQ5YWMtYjg3Zi1hOTUzYjJmYjIzNzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg1MzgsImlhdCI6MTc5MzExNzYzOCwianRpIjoiMjllODA1YjctMTFjZS00Y2I5LTliODQtOTA2NTRmN2QyOTM4Iiwic2lkIjoiNDUyNWE2MWQtMzA0Mi00NzUzLWFmYWEtNjA3ODZlZGQzNTg5In0.3EgcWIy94HKq4HOD3vWbLAxxY1lm4UGjSyxeQEW2qSE",
  "access_expires_at": "2026-10-27T16:28:58.813817291Z",
  "refresh_token": "JYVwKBoDUSvuOfWyKii7IJf6GAKe6IbWhOjh-iCFVAA",
  "refresh_expires_at": "2026-10-28T04:13:58.813215713Z",
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
  "session_id": "8cc5bf6f-c611-4fb5-9953-ccb6cefdad70",
  "subject": {
    "type": "STAFF",
    "id": "e5e7800f-85c9-49ac-b87f-a953b2fb2378"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWU3ODAwZi04NWM5LTQ5YWMtYjg3Zi1hOTUzYjJmYjIzNzgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg1MzksImlhdCI6MTc5MzExNzYzOSwianRpIjoiMDk0ZjFmMmMtMDZlZC00MDMyLWI3MjMtMDgyODNiYmZjZmVmIiwic2lkIjoiOGNjNWJmNmYtYzYxMS00ZmI1LTk5NTMtY2NiNmNlZmRhZDcwIn0.RXzimnE14FfIMJsgr8hx543bmmwyLruYPdpLMstG2KE",
  "access_expires_at": "2026-10-27T16:28:59.139423095Z",
  "refresh_token": "a3DIqzp1jkK86EK2VKNLxwJcGCnH_rVpQM4_j7D5sfM",
  "refresh_expires_at": "2026-10-28T04:13:59.138769119Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-28249"
}
```

```json
{
  "challenge_id": "2acb41e9-03a9-47e3-a416-1ccba5c9c7bf",
  "expires_at": "2026-10-27T16:18:59.165265035Z",
  "resend_available_at": "2026-10-27T16:14:00.165265035Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "878210",
  "sent_at": "2026-10-27T16:13:59.167627998Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2acb41e9-03a9-47e3-a416-1ccba5c9c7bf",
  "code": "878210",
  "device_ref": "sandbox-28249"
}
```

```json
{
  "session_id": "d8797797-6f14-48bc-9729-13dfa92510e0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODUzOSwiaWF0IjoxNzkzMTE3NjM5LCJqdGkiOiJlMGRhY2M0NC0zOTA2LTQ3OTQtODExZS1iMDE2MGFlOGMwZmEiLCJzaWQiOiJkODc5Nzc5Ny02ZjE0LTQ4YmMtOTcyOS0xM2RmYTkyNTEwZTAifQ.cKu-SrqlVhQV2p8jzfHUDjJIL_W1EM83Jbz5uTufVb8",
  "access_expires_at": "2026-10-27T16:28:59.229820797Z",
  "refresh_token": "vqzJN3ladbxNYADZbmTKJ6VY4oLkXQj-DGqobHydk_U",
  "refresh_expires_at": "2026-11-26T16:13:59.229213456Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ab1073ce-86d9-4f53-9613-c3f31547e432",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-27T16:13:52.957005Z",
  "last_location_at": "2026-10-27T16:13:52.957005Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ab1073ce-86d9-4f53-9613-c3f31547e432/handover` → **200**

```json
{
  "command_id": "027a2c6d-92ec-4eed-ab51-977d890a6e8f",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ab1073ce-86d9-4f53-9613-c3f31547e432",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-27T16:13:52.957005Z",
  "last_location_at": "2026-10-27T16:13:52.957005Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ab1073ce-86d9-4f53-9613-c3f31547e432/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:13:59Z",
    "sequence": 1793117639320
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ab1073ce-86d9-4f53-9613-c3f31547e432",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-27T16:13:59.340275Z",
  "last_location_at": "2026-10-27T16:13:59.340275Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Admin sets operator bonus m=2, g=3

`GET /api/admin/v1/settings/operator-bonuses` → **200**

```json
{
  "version": 0,
  "settings": {
    "m": 1,
    "g": 10,
    "count_cancellations": true,
    "reset_day": 1,
    "time_rules": []
  },
  "effective_at": "2000-01-01T00:00:00Z",
  "changed_by": null,
  "reason": "Initial operator bonus settings"
}
```

`POST /api/admin/v1/settings/operator-bonuses` → **200**

```json
{
  "command_id": "7012b1e4-2dad-4dd5-9c91-efd6ba60c7ac",
  "expected_version": 0,
  "settings": {
    "m": 2,
    "g": 3,
    "count_cancellations": true,
    "reset_day": 28,
    "time_rules": []
  },
  "reason": "Sandbox operator bonus scenario"
}
```

```json
{
  "version": 1,
  "settings": {
    "m": 2,
    "g": 3,
    "count_cancellations": true,
    "reset_day": 28,
    "time_rules": []
  },
  "effective_at": "2026-10-27T16:13:59.418826Z",
  "changed_by": "e5e7800f-85c9-49ac-b87f-a953b2fb2378",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "e5e7800f-85c9-49ac-b87f-a953b2fb2378",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-27T16:13:59.452787893Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "346d5128-b36c-4dd9-a262-05ed65a18e53",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  }
}
```

```json
{
  "id": "b8c96e9d-c9b5-4c97-a6c6-923268bf5f14",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T16:18:59.498044Z",
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

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "e36c5f3e-f9a8-42d4-af07-69833b8d8764",
  "quote_id": "b8c96e9d-c9b5-4c97-a6c6-923268bf5f14",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711118360"
  }
}
```

```json
{
  "id": "38d8224f-f7bb-4a7f-9fce-252ff4ea081c",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 29967,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-27T16:13:59.55227Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711118360"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "ff184ab1-a0bd-4c20-bd25-f911a06bf1ae",
    "order_id": "38d8224f-f7bb-4a7f-9fce-252ff4ea081c",
    "expires_at": "2026-10-27T16:14:14.556608Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "pickup_label": "Bonus pickup",
    "dropoff_label": "Bonus dropoff",
    "payment_method": "CASH",
    "price_minor": 29967,
    "currency": "UAH",
    "distance_m": 100
  }
]
```

`POST /api/driver/v1/offers/ff184ab1-a0bd-4c20-bd25-f911a06bf1ae/accept` → **200**

```json
{
  "command_id": "aa3f1483-f076-4cab-8674-daffb2ffabd8"
}
```

```json
{
  "id": "6bfc4451-39bb-4674-8a95-1853f8dad421",
  "order_id": "38d8224f-f7bb-4a7f-9fce-252ff4ea081c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6dfee544-b858-4565-9764-b34c0e9da7ed",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6dfee544-b858-4565-9764-b34c0e9da7ed",
  "order_id": "38d8224f-f7bb-4a7f-9fce-252ff4ea081c",
  "assignment_id": "6bfc4451-39bb-4674-8a95-1853f8dad421",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "price_minor": 29967,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711118360"
  }
}
```

`POST /api/driver/v1/work-sessions/ab1073ce-86d9-4f53-9613-c3f31547e432/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:13:59Z",
    "sequence": 1793117639667
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ab1073ce-86d9-4f53-9613-c3f31547e432",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-27T16:13:59.687333Z",
  "last_location_at": "2026-10-27T16:13:59.687333Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6dfee544-b858-4565-9764-b34c0e9da7ed/arrive` → **200**

```json
{
  "command_id": "f76913e9-7739-42b4-8a57-ab8175653098",
  "expected_version": 0
}
```

```json
{
  "id": "6dfee544-b858-4565-9764-b34c0e9da7ed",
  "order_id": "38d8224f-f7bb-4a7f-9fce-252ff4ea081c",
  "assignment_id": "6bfc4451-39bb-4674-8a95-1853f8dad421",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "price_minor": 29967,
  "currency": "UAH",
  "arrived_at": "2026-10-27T16:13:59.725814Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711118360"
  }
}
```

`POST /api/driver/v1/trips/6dfee544-b858-4565-9764-b34c0e9da7ed/start` → **200**

```json
{
  "command_id": "af464cc8-e9d5-4293-aae7-a59447d5d2f2",
  "expected_version": 1
}
```

```json
{
  "id": "6dfee544-b858-4565-9764-b34c0e9da7ed",
  "order_id": "38d8224f-f7bb-4a7f-9fce-252ff4ea081c",
  "assignment_id": "6bfc4451-39bb-4674-8a95-1853f8dad421",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "price_minor": 29967,
  "currency": "UAH",
  "arrived_at": "2026-10-27T16:13:59.725814Z",
  "started_at": "2026-10-27T16:13:59.766951Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711118360"
  }
}
```

`POST /api/driver/v1/trips/6dfee544-b858-4565-9764-b34c0e9da7ed/complete` → **200**

```json
{
  "command_id": "e7baf64f-c834-4840-8da4-a51cfa4c2d5c",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:13:59Z",
  "cash_received": true
}
```

```json
{
  "id": "6dfee544-b858-4565-9764-b34c0e9da7ed",
  "order_id": "38d8224f-f7bb-4a7f-9fce-252ff4ea081c",
  "assignment_id": "6bfc4451-39bb-4674-8a95-1853f8dad421",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "price_minor": 29967,
  "currency": "UAH",
  "arrived_at": "2026-10-27T16:13:59.725814Z",
  "started_at": "2026-10-27T16:13:59.766951Z",
  "completed_at": "2026-10-27T16:13:59.811319Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Second phone order is cancelled for operator error

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c29f270a-cc14-4314-ac51-834c4b9b4cbe",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  }
}
```

```json
{
  "id": "598a1b33-5ee2-45ad-a73e-87625b03790c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T16:18:59.860977Z",
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

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "e68e6a20-72ca-495e-89b1-91d61edd354e",
  "quote_id": "598a1b33-5ee2-45ad-a73e-87625b03790c",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711124606"
  }
}
```

```json
{
  "id": "2a554e8e-d7b4-45a3-a3e3-fc1b9cd3adbd",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 29967,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-27T16:13:59.910006Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711124606"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/2a554e8e-d7b4-45a3-a3e3-fc1b9cd3adbd` → **200**

```json
{
  "id": "2a554e8e-d7b4-45a3-a3e3-fc1b9cd3adbd",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 29967,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-27T16:13:59.910006Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711124606"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/2a554e8e-d7b4-45a3-a3e3-fc1b9cd3adbd/cancel` → **200**

```json
{
  "command_id": "32ca8442-b3bb-4772-baeb-d03945ad88a8",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "2a554e8e-d7b4-45a3-a3e3-fc1b9cd3adbd",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "OPERATOR_ERROR",
  "version": 3,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 29967,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": null,
  "created_at": "2026-10-27T16:13:59.910006Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711124606"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "en": "Operator error",
      "ru": "Ошибка оператора",
      "pl": "Błąd operatora",
      "uk": "Помилка оператора"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Operator reads own bonus account

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "e5e7800f-85c9-49ac-b87f-a953b2fb2378",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-27T16:13:59.817338Z",
  "last_entries": [
    {
      "order_id": "2a554e8e-d7b4-45a3-a3e3-fc1b9cd3adbd",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-27T16:13:59.996919Z"
    },
    {
      "order_id": "38d8224f-f7bb-4a7f-9fce-252ff4ea081c",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-27T16:13:59.817338Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ab1073ce-86d9-4f53-9613-c3f31547e432",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-27T16:13:59.687333Z",
  "last_location_at": "2026-10-27T16:13:59.687333Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ab1073ce-86d9-4f53-9613-c3f31547e432/close` → **200**

```json
{
  "command_id": "bd1909bd-8d7d-4d67-b7e8-daba082b2d21",
  "expected_version": 2
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

Done: operator bonus for fulfilled 38d8224f-f7bb-4a7f-9fce-252ff4ea081c and operator-fault cancellation 2a554e8e-d7b4-45a3-a3e3-fc1b9cd3adbd.

# Scenario: preorders

## The admin switches pre-orders to reservations

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
  "session_id": "3d8dcc16-bbb1-4eab-b6d1-b0c17d0a633c",
  "subject": {
    "type": "STAFF",
    "id": "e5e7800f-85c9-49ac-b87f-a953b2fb2378"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWU3ODAwZi04NWM5LTQ5YWMtYjg3Zi1hOTUzYjJmYjIzNzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg1NDIsImlhdCI6MTc5MzExNzY0MiwianRpIjoiNmJiMzk4MWQtMTIwYy00Y2Q5LTk3NzQtNmRkYTQ1ZTU3NDc0Iiwic2lkIjoiM2Q4ZGNjMTYtYmJiMS00ZWFiLWI2ZDEtYjBjMTdkMGE2MzNjIn0.JeWoKnj_xsoMq7QN8jWm8YPNwZjBha-xHqJq1O2G-LM",
  "access_expires_at": "2026-10-27T16:29:02.462410449Z",
  "refresh_token": "bTnCLtwb-U46ABN8Rk1Spi9PFmaQsMVjjuwkZxNZoOk",
  "refresh_expires_at": "2026-10-28T04:14:02.461787774Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/settings` → **200**

```json
{
  "version": 0,
  "settings": {
    "brand": {
      "service_name": "Blizz Taxi",
      "primary_color": "#111111",
      "on_primary_color": "#FFFFFF",
      "accent_color": null,
      "logo_url": null,
      "support_phone": null,
      "support_email": null,
      "support_telegram": null,
      "privacy_policy_url": null,
      "terms_url": null
    },
    "languages": {
      "default_language": "ru",
      "enabled": [
        "uk",
        "pl",
        "ru",
        "en"
      ]
    },
    "calls": {
      "mode": "DIRECT",
      "service_phone": null
    },
    "preorders": {
      "threshold_minutes": 60,
      "max_days_ahead": 7,
      "dispatch": "BROADCAST_BEFORE",
      "release_minutes_before": 30,
      "confirm_minutes_before": 30,
      "confirm_window_minutes": 10,
      "driver_cancel_until_minutes_before": 60
    },
    "ratings": {
      "edit_window_hours": 24
    },
    "tips": {
      "window_hours": 24
    },
    "orders": {
      "active_per_payer": 3
    }
  },
  "changed_by": null,
  "reason": null,
  "changed_at": null
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "8c03e7c8-fb9b-4538-ba41-c9bd81b5b169",
  "expected_version": 0,
  "settings": {
    "brand": {
      "service_name": "Blizz Taxi",
      "primary_color": "#111111",
      "on_primary_color": "#FFFFFF",
      "accent_color": null,
      "logo_url": null,
      "support_phone": null,
      "support_email": null,
      "support_telegram": null,
      "privacy_policy_url": null,
      "terms_url": null
    },
    "languages": {
      "default_language": "ru",
      "enabled": [
        "uk",
        "pl",
        "ru",
        "en"
      ]
    },
    "calls": {
      "mode": "DIRECT",
      "service_phone": null
    },
    "preorders": {
      "threshold_minutes": 60,
      "max_days_ahead": 7,
      "dispatch": "RESERVATION",
      "release_minutes_before": 30,
      "confirm_minutes_before": 30,
      "confirm_window_minutes": 10,
      "driver_cancel_until_minutes_before": 60
    },
    "ratings": {
      "edit_window_hours": 24
    },
    "tips": {
      "window_hours": 24
    },
    "orders": {
      "active_per_payer": 3
    }
  },
  "reason": "Sandbox: pre-orders by reservation"
}
```

```json
{
  "version": 1,
  "settings": {
    "brand": {
      "service_name": "Blizz Taxi",
      "primary_color": "#111111",
      "on_primary_color": "#FFFFFF",
      "accent_color": null,
      "logo_url": null,
      "support_phone": null,
      "support_email": null,
      "support_telegram": null,
      "privacy_policy_url": null,
      "terms_url": null
    },
    "languages": {
      "default_language": "ru",
      "enabled": [
        "uk",
        "pl",
        "ru",
        "en"
      ]
    },
    "calls": {
      "mode": "DIRECT",
      "service_phone": null
    },
    "preorders": {
      "threshold_minutes": 60,
      "max_days_ahead": 7,
      "dispatch": "RESERVATION",
      "release_minutes_before": 30,
      "confirm_minutes_before": 30,
      "confirm_window_minutes": 10,
      "driver_cancel_until_minutes_before": 60
    },
    "ratings": {
      "edit_window_hours": 24
    },
    "tips": {
      "window_hours": 24
    },
    "orders": {
      "active_per_payer": 3
    }
  },
  "changed_by": "e5e7800f-85c9-49ac-b87f-a953b2fb2378",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T16:14:02.543871539Z"
}
```

## The rider books the airport for 2026-10-27T19:14:02Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600145127",
  "device_ref": "sandbox-6131"
}
```

```json
{
  "challenge_id": "dd7cb6f8-d370-4398-bd90-c880302ebf74",
  "expires_at": "2026-10-27T16:19:02.577612076Z",
  "resend_available_at": "2026-10-27T16:14:03.577612076Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600145127` → **200**

```json
{
  "phone": "+48600145127",
  "audience": "CLIENT",
  "code": "498954",
  "sent_at": "2026-10-27T16:14:02.579920776Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dd7cb6f8-d370-4398-bd90-c880302ebf74",
  "code": "498954",
  "device_ref": "sandbox-6131"
}
```

```json
{
  "session_id": "a6059f5d-b8f9-40a4-a075-2845527be763",
  "subject": {
    "type": "CLIENT",
    "id": "89f18800-d82f-4eae-98ce-f67bcc521a36"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OWYxODgwMC1kODJmLTRlYWUtOThjZS1mNjdiY2M1MjFhMzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4NTQyLCJpYXQiOjE3OTMxMTc2NDIsImp0aSI6IjFlZjNmOWFmLTg3OTgtNGE4Mi04YTA2LTgyZDQyNDlmNjk1YSIsInNpZCI6ImE2MDU5ZjVkLWI4ZjktNDBhNC1hMDc1LTI4NDU1MjdiZTc2MyJ9.Mg_cW6Mjt9cxlYynlc8wh2s-YPH_rD-rBG9x6aFjGMA",
  "access_expires_at": "2026-10-27T16:29:02.637692587Z",
  "refresh_token": "WaRenzqCGKF-oKvotM7G4UGPzLvJfO8-dMMSCkRJWrA",
  "refresh_expires_at": "2026-11-26T16:14:02.637034849Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c110019a-5375-4b4f-a958-df71a329a382",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T19:14:02Z"
}
```

```json
{
  "id": "66b14587-9323-4387-a123-ac482853459d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T16:19:02.674529Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T19:14:02Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9edb0202-0dc4-40d7-a6fd-79f2b0770a44",
  "quote_id": "66b14587-9323-4387-a123-ac482853459d",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "Pałac Kultury i Nauki",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko Chopina",
  "payment_method": "CASH",
  "pickup_at": "2026-10-27T19:14:02Z"
}
```

```json
{
  "id": "cab37c52-dc55-42d5-b45a-ca0317042931",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "89f18800-d82f-4eae-98ce-f67bcc521a36",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "Pałac Kultury i Nauki",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko Chopina",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 5436,
  "final_price_minor": null,
  "currency": "PLN",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-27T16:14:02.715728Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T19:14:02Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## A driver in Warsaw sees it and reserves it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-10825"
}
```

```json
{
  "challenge_id": "d031c1b6-6241-43fe-a37b-535e7763443e",
  "expires_at": "2026-10-27T16:19:02.748858608Z",
  "resend_available_at": "2026-10-27T16:14:03.748858608Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "101367",
  "sent_at": "2026-10-27T16:14:02.751317247Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d031c1b6-6241-43fe-a37b-535e7763443e",
  "code": "101367",
  "device_ref": "sandbox-10825"
}
```

```json
{
  "session_id": "a75cfeba-8c6f-491b-b75d-512054617912",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODU0MiwiaWF0IjoxNzkzMTE3NjQyLCJqdGkiOiIwNWNmMzhiOC1kMWU1LTQxNjMtOTNjMi1mMjcxZThkNTI5ZTgiLCJzaWQiOiJhNzVjZmViYS04YzZmLTQ5MWItYjc1ZC01MTIwNTQ2MTc5MTIifQ.WN-_zAJNp3otAWuVBitT750M_r80Jr5AguTBBbydaWA",
  "access_expires_at": "2026-10-27T16:29:02.814577783Z",
  "refresh_token": "59EXhCJLIb3yWKtQFcMuaElSS5b7A3cnGpf_id6UtcA",
  "refresh_expires_at": "2026-11-26T16:14:02.813829293Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
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
  "command_id": "b3711e92-ceba-4085-868d-03da4468cd8d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:14:02Z",
    "sequence": 1793117642873
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "3863fc4b-6143-4772-b275-0b9fdaa5b6f2",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-27T16:14:02.892191Z",
  "last_location_at": "2026-10-27T16:14:02.892191Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "cab37c52-dc55-42d5-b45a-ca0317042931",
      "short_number": 13,
      "pickup_at": "2026-10-27T19:14:02Z",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 52.2297,
        "lon": 21.0122
      },
      "pickup_label": "Pałac Kultury i Nauki",
      "dropoff_label": "Lotnisko Chopina",
      "price_minor": 5436,
      "currency": "PLN",
      "payment_method": "CASH"
    }
  ]
}
```

`POST /api/driver/v1/preorders/cab37c52-dc55-42d5-b45a-ca0317042931/reserve` → **200**

```json
{
  "command_id": "8ac92900-cf49-4415-bbfa-64dbb4906761"
}
```

```json
{
  "id": "fea0aaf2-0667-4349-8137-8c456b1876eb",
  "state": "RESERVED",
  "order": {
    "order_id": "cab37c52-dc55-42d5-b45a-ca0317042931",
    "short_number": 13,
    "pickup_at": "2026-10-27T19:14:02Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 52.2297,
      "lon": 21.0122
    },
    "pickup_label": "Pałac Kultury i Nauki",
    "dropoff_label": "Lotnisko Chopina",
    "price_minor": 5436,
    "currency": "PLN",
    "payment_method": "CASH"
  },
  "reserved_at": "2026-10-27T16:14:02.967221Z",
  "confirm_from": "2026-10-27T18:44:02Z",
  "confirm_until": "2026-10-27T18:54:02Z",
  "drop_until": "2026-10-27T18:14:02Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "fea0aaf2-0667-4349-8137-8c456b1876eb",
      "state": "RESERVED",
      "order": {
        "order_id": "cab37c52-dc55-42d5-b45a-ca0317042931",
        "short_number": 13,
        "pickup_at": "2026-10-27T19:14:02Z",
        "vehicle_class": "STANDARD",
        "pickup": {
          "lat": 52.2297,
          "lon": 21.0122
        },
        "pickup_label": "Pałac Kultury i Nauki",
        "dropoff_label": "Lotnisko Chopina",
        "price_minor": 5436,
        "currency": "PLN",
        "payment_method": "CASH"
      },
      "reserved_at": "2026-10-27T16:14:02.967221Z",
      "confirm_from": "2026-10-27T18:44:02Z",
      "confirm_until": "2026-10-27T18:54:02Z",
      "drop_until": "2026-10-27T18:14:02Z"
    }
  ]
}
```

## "On my way" is too early now; the operator sees who holds the order

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "fea0aaf2-0667-4349-8137-8c456b1876eb",
      "state": "RESERVED",
      "order": {
        "order_id": "cab37c52-dc55-42d5-b45a-ca0317042931",
        "short_number": 13,
        "pickup_at": "2026-10-27T19:14:02Z",
        "vehicle_class": "STANDARD",
        "pickup": {
          "lat": 52.2297,
          "lon": 21.0122
        },
        "pickup_label": "Pałac Kultury i Nauki",
        "dropoff_label": "Lotnisko Chopina",
        "price_minor": 5436,
        "currency": "PLN",
        "payment_method": "CASH"
      },
      "reserved_at": "2026-10-27T16:14:02.967221Z",
      "confirm_from": "2026-10-27T18:44:02Z",
      "confirm_until": "2026-10-27T18:54:02Z",
      "drop_until": "2026-10-27T18:14:02Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/fea0aaf2-0667-4349-8137-8c456b1876eb/confirm` → **409**

```json
{
  "command_id": "d1f63e68-5ed4-4c92-8fd0-a5e22c273473"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/fea0aaf2-0667-4349-8137-8c456b1876eb/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "9e3d6ee5-f7bc-4af6-9d58-c5940fcf5610"
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
  "session_id": "6e223c25-7b7a-4b23-8042-152683585854",
  "subject": {
    "type": "STAFF",
    "id": "e5e7800f-85c9-49ac-b87f-a953b2fb2378"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWU3ODAwZi04NWM5LTQ5YWMtYjg3Zi1hOTUzYjJmYjIzNzgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg1NDMsImlhdCI6MTc5MzExNzY0MywianRpIjoiZTYxMWVkNTYtNWI4Zi00NWFmLWFlN2UtNTFhOTNhNDE1ZGUyIiwic2lkIjoiNmUyMjNjMjUtN2I3YS00YjIzLTgwNDItMTUyNjgzNTg1ODU0In0.dpJIFD3LCIQG7z49jNtgil4VGH5oQl6TLc7qKRlNFzU",
  "access_expires_at": "2026-10-27T16:29:03.383938025Z",
  "refresh_token": "_70SN-r8ga-NlWG465bkDfsT-CszlCEDA9Be8CCzP_U",
  "refresh_expires_at": "2026-10-28T04:14:03.383327533Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/cab37c52-dc55-42d5-b45a-ca0317042931` → **200**

```json
{
  "id": "cab37c52-dc55-42d5-b45a-ca0317042931",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "89f18800-d82f-4eae-98ce-f67bcc521a36",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "Pałac Kultury i Nauki",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko Chopina",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 5436,
  "final_price_minor": null,
  "currency": "PLN",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-27T16:14:02.715728Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T19:14:02Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "fea0aaf2-0667-4349-8137-8c456b1876eb",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T16:14:02.967221Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/cab37c52-dc55-42d5-b45a-ca0317042931/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T16:14:02.716917Z",
      "actor": {
        "type": "CLIENT",
        "id": "89f18800-d82f-4eae-98ce-f67bcc521a36",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "cab37c52-dc55-42d5-b45a-ca0317042931",
        "preorder": true,
        "quote_id": "66b14587-9323-4387-a123-ac482853459d",
        "pickup_at": "2026-10-27T19:14:02Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T16:14:02.968432Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "cab37c52-dc55-42d5-b45a-ca0317042931",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "fea0aaf2-0667-4349-8137-8c456b1876eb"
      }
    }
  ]
}
```

Done: pre-order cab37c52-dc55-42d5-b45a-ca0317042931, reservation fea0aaf2-0667-4349-8137-8c456b1876eb.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-11448"
}
```

```json
{
  "challenge_id": "5241ace1-196a-400d-9705-ef72ed250122",
  "expires_at": "2026-10-27T16:19:03.482188856Z",
  "resend_available_at": "2026-10-27T16:14:04.482188856Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "868162",
  "sent_at": "2026-10-27T16:14:03.485192774Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5241ace1-196a-400d-9705-ef72ed250122",
  "code": "868162",
  "device_ref": "sandbox-11448"
}
```

```json
{
  "session_id": "0929bc36-c527-4dc4-8ed0-66422839ebd6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODU0MywiaWF0IjoxNzkzMTE3NjQzLCJqdGkiOiJlMjg0ODI0Mi0zYmQzLTQ5NGQtOWRkOS1mZTVjZjcwZjFhNjIiLCJzaWQiOiIwOTI5YmMzNi1jNTI3LTRkYzQtOGVkMC02NjQyMjgzOWViZDYifQ.zRn9K9LbvqSMtdq9liYwAc_eMxlyWffehngY7B9Sb6s",
  "access_expires_at": "2026-10-27T16:29:03.547170574Z",
  "refresh_token": "TDpLxRcQ9cxHY5WagtTCK3bkGRV-Jt9DtWVVfJAeqVM",
  "refresh_expires_at": "2026-11-26T16:14:03.546588796Z",
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
  "command_id": "ac1d0230-ffdc-412f-9ed5-7418b3e4d847",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:14:03Z",
    "sequence": 1793117643600
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "24565544-9ad9-4e66-903c-fd68bba445ca",
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
  "last_heartbeat_at": "2026-10-27T16:14:03.618858Z",
  "last_location_at": "2026-10-27T16:14:03.618858Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675060499",
  "device_ref": "sandbox-24104"
}
```

```json
{
  "challenge_id": "82b73313-2c11-4874-abb9-b0a0ddae2e29",
  "expires_at": "2026-10-27T16:19:03.649848377Z",
  "resend_available_at": "2026-10-27T16:14:04.649848377Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675060499` → **200**

```json
{
  "phone": "+380675060499",
  "audience": "CLIENT",
  "code": "055098",
  "sent_at": "2026-10-27T16:14:03.652099357Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "82b73313-2c11-4874-abb9-b0a0ddae2e29",
  "code": "055098",
  "device_ref": "sandbox-24104"
}
```

```json
{
  "session_id": "4d7fc585-7852-43d5-8b11-4fb4c68172b2",
  "subject": {
    "type": "CLIENT",
    "id": "79031852-f252-40df-bf3e-32ffe6ae947d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3OTAzMTg1Mi1mMjUyLTQwZGYtYmYzZS0zMmZmZTZhZTk0N2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4NTQzLCJpYXQiOjE3OTMxMTc2NDMsImp0aSI6ImI1NTAxYjFjLWE0ZmYtNDZiNi1iMzQ2LTVhYmUwOWI1NzdmMiIsInNpZCI6IjRkN2ZjNTg1LTc4NTItNDNkNS04YjExLTRmYjRjNjgxNzJiMiJ9.UhK05G3NkTi0wpNRroaAOXEocqLTiYCoL5mVqcgIH9A",
  "access_expires_at": "2026-10-27T16:29:03.710937748Z",
  "refresh_token": "5h8p7tVeeAKG3FTRk-PqWJYYO601MaGSlBSAnAHNOhw",
  "refresh_expires_at": "2026-11-26T16:14:03.710247564Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "582ff98d-efd9-4919-ae58-4e5ff140753c",
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
  "id": "9247c227-afaf-4aad-9555-6ab527ac139f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:19:03.750375Z",
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
  "command_id": "9351a799-926a-492a-9409-7484c3171c00",
  "quote_id": "9247c227-afaf-4aad-9555-6ab527ac139f",
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
  "id": "a2b2ffa1-9603-4044-9c13-43cb695ad12d",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "79031852-f252-40df-bf3e-32ffe6ae947d",
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
  "created_at": "2026-10-27T16:14:03.789284Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Driver accepts and completes the ride

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "56a6c1f4-6cf7-4e27-8354-463e781656fd",
    "order_id": "a2b2ffa1-9603-4044-9c13-43cb695ad12d",
    "expires_at": "2026-10-27T16:14:18.792576Z",
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
    "distance_m": 22
  }
]
```

`POST /api/driver/v1/offers/56a6c1f4-6cf7-4e27-8354-463e781656fd/accept` → **200**

```json
{
  "command_id": "56e76589-fe6f-40df-8c03-1e603d32ba95"
}
```

```json
{
  "id": "a74ffd08-10c5-4ee3-8076-7f634ee20dde",
  "order_id": "a2b2ffa1-9603-4044-9c13-43cb695ad12d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fb4324d6-e3ad-483f-9792-35cfc89bbeef",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fb4324d6-e3ad-483f-9792-35cfc89bbeef",
  "order_id": "a2b2ffa1-9603-4044-9c13-43cb695ad12d",
  "assignment_id": "a74ffd08-10c5-4ee3-8076-7f634ee20dde",
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
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/24565544-9ad9-4e66-903c-fd68bba445ca/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:14:03Z",
    "sequence": 1793117643903
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "24565544-9ad9-4e66-903c-fd68bba445ca",
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
  "last_heartbeat_at": "2026-10-27T16:14:03.922635Z",
  "last_location_at": "2026-10-27T16:14:03.922635Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fb4324d6-e3ad-483f-9792-35cfc89bbeef",
  "order_id": "a2b2ffa1-9603-4044-9c13-43cb695ad12d",
  "assignment_id": "a74ffd08-10c5-4ee3-8076-7f634ee20dde",
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
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fb4324d6-e3ad-483f-9792-35cfc89bbeef/arrive` → **200**

```json
{
  "command_id": "3b89c023-b30b-43cd-88f2-7cbde5fa55c1",
  "expected_version": 0
}
```

```json
{
  "id": "fb4324d6-e3ad-483f-9792-35cfc89bbeef",
  "order_id": "a2b2ffa1-9603-4044-9c13-43cb695ad12d",
  "assignment_id": "a74ffd08-10c5-4ee3-8076-7f634ee20dde",
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
  "arrived_at": "2026-10-27T16:14:03.980991Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fb4324d6-e3ad-483f-9792-35cfc89bbeef/start` → **200**

```json
{
  "command_id": "2316de53-a53d-4290-8dc0-b44d540b5b01",
  "expected_version": 1
}
```

```json
{
  "id": "fb4324d6-e3ad-483f-9792-35cfc89bbeef",
  "order_id": "a2b2ffa1-9603-4044-9c13-43cb695ad12d",
  "assignment_id": "a74ffd08-10c5-4ee3-8076-7f634ee20dde",
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
  "arrived_at": "2026-10-27T16:14:03.980991Z",
  "started_at": "2026-10-27T16:14:04.016536Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/24565544-9ad9-4e66-903c-fd68bba445ca/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:14:04Z",
    "sequence": 1793117644413
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "24565544-9ad9-4e66-903c-fd68bba445ca",
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
  "last_heartbeat_at": "2026-10-27T16:14:04.060528Z",
  "last_location_at": "2026-10-27T16:14:04.060528Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/fb4324d6-e3ad-483f-9792-35cfc89bbeef/complete` → **200**

```json
{
  "command_id": "bd23484f-a7a1-4bce-91cf-80ef24d9007c",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:14:04Z",
  "cash_received": true
}
```

```json
{
  "id": "fb4324d6-e3ad-483f-9792-35cfc89bbeef",
  "order_id": "a2b2ffa1-9603-4044-9c13-43cb695ad12d",
  "assignment_id": "a74ffd08-10c5-4ee3-8076-7f634ee20dde",
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
  "arrived_at": "2026-10-27T16:14:03.980991Z",
  "started_at": "2026-10-27T16:14:04.016536Z",
  "completed_at": "2026-10-27T16:14:04.09504Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/a2b2ffa1-9603-4044-9c13-43cb695ad12d/rating` → **200**

```json
{
  "command_id": "e71f0fc4-0d6f-4f21-b7ed-8cc092cfaa43",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "a2b2ffa1-9603-4044-9c13-43cb695ad12d",
  "score": 5,
  "created_at": "2026-10-27T16:14:04.150031281Z"
}
```

`POST /api/driver/v1/orders/a2b2ffa1-9603-4044-9c13-43cb695ad12d/rating` → **200**

```json
{
  "command_id": "bcd33da5-67fe-4378-b4c9-ff07fe293e56",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "a2b2ffa1-9603-4044-9c13-43cb695ad12d",
  "score": 4,
  "created_at": "2026-10-27T16:14:04.190636059Z"
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
  "session_id": "42cce5f6-23c7-4b38-9514-7cd041a23396",
  "subject": {
    "type": "STAFF",
    "id": "e5e7800f-85c9-49ac-b87f-a953b2fb2378"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWU3ODAwZi04NWM5LTQ5YWMtYjg3Zi1hOTUzYjJmYjIzNzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg1NDQsImlhdCI6MTc5MzExNzY0NCwianRpIjoiMTc4NzdmNzYtZDM2OS00ODE5LTg4YmUtZjhmYTE5OTIyZTE0Iiwic2lkIjoiNDJjY2U1ZjYtMjNjNy00YjM4LTk1MTQtN2NkMDQxYTIzMzk2In0.8mrMRyJd8dR5RYxDzRTr1z4tvbVN1PwshNkNa1-3-No",
  "access_expires_at": "2026-10-27T16:29:04.557879278Z",
  "refresh_token": "fxaildP8ejQDkYg7emUSu5KTa82pR6wJOAr3jG5MRJU",
  "refresh_expires_at": "2026-10-28T04:14:04.557165202Z",
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
  "session_id": "b2a0af57-2452-46b0-8734-ef3ad3f136b2",
  "subject": {
    "type": "STAFF",
    "id": "e5e7800f-85c9-49ac-b87f-a953b2fb2378"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWU3ODAwZi04NWM5LTQ5YWMtYjg3Zi1hOTUzYjJmYjIzNzgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg1NDQsImlhdCI6MTc5MzExNzY0NCwianRpIjoiYjAzYmUwNDgtYTZhMS00YjAwLWIxODItMTliNjEwNzI0ZGZmIiwic2lkIjoiYjJhMGFmNTctMjQ1Mi00NmIwLTg3MzQtZWYzYWQzZjEzNmIyIn0.La_5cMYHR3_44G4UgVtIAwYPmyrNaen6KtnJcSw0vSs",
  "access_expires_at": "2026-10-27T16:29:04.879912969Z",
  "refresh_token": "RlY7zCC5_7Yt-WdweY6yJnI7y2ezNCx8zeAl9ndY-i0",
  "refresh_expires_at": "2026-10-28T04:14:04.879323776Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a2b2ffa1-9603-4044-9c13-43cb695ad12d/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "a2b2ffa1-9603-4044-9c13-43cb695ad12d",
      "author_type": "RIDER",
      "author_id": "79031852-f252-40df-bf3e-32ffe6ae947d",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T16:14:04.150031Z"
    },
    {
      "order_id": "a2b2ffa1-9603-4044-9c13-43cb695ad12d",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "79031852-f252-40df-bf3e-32ffe6ae947d",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T16:14:04.190636Z"
    }
  ]
}
```

Done: ratings for order a2b2ffa1-9603-4044-9c13-43cb695ad12d.

# Scenario: safety-contacts

## The admin reads the city's contacts and replaces them

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
  "session_id": "a4281f51-0c38-4f08-9cd1-f9cb8a7b7d83",
  "subject": {
    "type": "STAFF",
    "id": "e5e7800f-85c9-49ac-b87f-a953b2fb2378"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWU3ODAwZi04NWM5LTQ5YWMtYjg3Zi1hOTUzYjJmYjIzNzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg1NDUsImlhdCI6MTc5MzExNzY0NSwianRpIjoiMGNmNTBkOWEtNDI0NS00NzQ0LTgwNzktZmQ5YTM3NTJmZGUzIiwic2lkIjoiYTQyODFmNTEtMGMzOC00ZjA4LTljZDEtZjljYjhhN2I3ZDgzIn0.F_nJdwbDLs8td6uE7fDtB6clxl07UMQhMiDbyu4JZ9o",
  "access_expires_at": "2026-10-27T16:29:05.253200507Z",
  "refresh_token": "pv0iNSEZYuXxRjtdvqr2Bn17IPuY-6b7oaSTEfmPMO4",
  "refresh_expires_at": "2026-10-28T04:14:05.25261393Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "version": 0,
  "emergency_number": "112",
  "support_phone": null,
  "extra": [],
  "changed_by": null,
  "reason": null,
  "changed_at": null
}
```

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "80f7796d-bd8c-49e7-88c2-6a6e33e4961f",
  "expected_version": 0,
  "emergency_number": "112",
  "support_phone": "+48220000101",
  "extra": [
    {
      "label": {
        "pl": "Infolinia",
        "uk": "Гаряча лінія",
        "ru": "Горячая линия",
        "en": "Hotline"
      },
      "phone": "+48220000997"
    }
  ],
  "reason": "Sandbox: contacts of Warszawa"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "version": 1,
  "emergency_number": "112",
  "support_phone": "+48220000101",
  "extra": [
    {
      "label": {
        "en": "Hotline",
        "pl": "Infolinia",
        "ru": "Горячая линия",
        "uk": "Гаряча лінія"
      },
      "phone": "+48220000997"
    }
  ],
  "changed_by": "e5e7800f-85c9-49ac-b87f-a953b2fb2378",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T16:14:05.330213Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "80f7796d-bd8c-49e7-88c2-6a6e33e4961f",
  "expected_version": 0,
  "emergency_number": "112",
  "support_phone": "+48220000101",
  "extra": [
    {
      "label": {
        "pl": "Infolinia",
        "uk": "Гаряча лінія",
        "ru": "Горячая линия",
        "en": "Hotline"
      },
      "phone": "+48220000997"
    }
  ],
  "reason": "Sandbox: contacts of Warszawa"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "version": 1,
  "emergency_number": "112",
  "support_phone": "+48220000101",
  "extra": [
    {
      "label": {
        "en": "Hotline",
        "pl": "Infolinia",
        "ru": "Горячая линия",
        "uk": "Гаряча лінія"
      },
      "phone": "+48220000997"
    }
  ],
  "changed_by": "e5e7800f-85c9-49ac-b87f-a953b2fb2378",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T16:14:05.330213Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48708284997",
  "device_ref": "sandbox-2512"
}
```

```json
{
  "challenge_id": "c6886b1a-dbe2-446e-9c55-769e4a698aa0",
  "expires_at": "2026-10-27T16:19:05.414910553Z",
  "resend_available_at": "2026-10-27T16:14:06.414910553Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48708284997` → **200**

```json
{
  "phone": "+48708284997",
  "audience": "CLIENT",
  "code": "639623",
  "sent_at": "2026-10-27T16:14:05.417646872Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c6886b1a-dbe2-446e-9c55-769e4a698aa0",
  "code": "639623",
  "device_ref": "sandbox-2512"
}
```

```json
{
  "session_id": "67503a73-b278-465a-ae2f-e1ec2b4e888c",
  "subject": {
    "type": "CLIENT",
    "id": "a1d1f429-86b6-48e4-affe-8004911f0763"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMWQxZjQyOS04NmI2LTQ4ZTQtYWZmZS04MDA0OTExZjA3NjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4NTQ1LCJpYXQiOjE3OTMxMTc2NDUsImp0aSI6IjI2MWJkOWM2LWM1MDgtNGVhZi1hYjQwLWFjZGIyOGEwYjUxZCIsInNpZCI6IjY3NTAzYTczLWIyNzgtNDY1YS1hZTJmLWUxZWMyYjRlODg4YyJ9.BUAHb76kjacgVRSNNyyBT1oNoxwfMQuM7NFU6H6kM4M",
  "access_expires_at": "2026-10-27T16:29:05.475904577Z",
  "refresh_token": "bMUVN6Wuz3TxPak7n2kAsUh48NDtQloGQtRv6vIT1CI",
  "refresh_expires_at": "2026-11-26T16:14:05.475339119Z",
  "account_created": true
}
```

`GET /api/rider/v1/safety-contacts` → **400**

```json
{
  "instance": "/api/rider/v1/safety-contacts",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "a8b8895d-9f6a-4880-95ec-ffdf0b90e51c"
}
```

`GET /api/rider/v1/safety-contacts?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "emergency_number": "112",
  "support_phone": "+48220000101",
  "extra": [
    {
      "label": "Горячая линия",
      "phone": "+48220000997"
    }
  ],
  "disclaimer_code": "NO_AUTO_DISPATCH"
}
```

## The driver on line in Warszawa opens it (the city of his session)

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-23367"
}
```

```json
{
  "challenge_id": "881db764-8d4e-4bf5-94dc-2de7f61ca81d",
  "expires_at": "2026-10-27T16:19:05.564873571Z",
  "resend_available_at": "2026-10-27T16:14:06.564873571Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "637464",
  "sent_at": "2026-10-27T16:14:05.567180458Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "881db764-8d4e-4bf5-94dc-2de7f61ca81d",
  "code": "637464",
  "device_ref": "sandbox-23367"
}
```

```json
{
  "session_id": "15987c1f-5610-4f12-86cd-c7bafc1422a1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODU0NSwiaWF0IjoxNzkzMTE3NjQ1LCJqdGkiOiJjNjVhNDUyMi02N2E5LTQyMTYtOTBiNC03NTgyNWJlNDdlYzAiLCJzaWQiOiIxNTk4N2MxZi01NjEwLTRmMTItODZjZC1jN2JhZmMxNDIyYTEifQ.hi9eShksl5NOYYfGWqAT1jIzUd0_u0GUx3F-xx89-d8",
  "access_expires_at": "2026-10-27T16:29:05.625885758Z",
  "refresh_token": "HivqjjTRQ1Rz5H0XM3ES9_OVtgilwV8thDwtCFKsRrE",
  "refresh_expires_at": "2026-11-26T16:14:05.625316643Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "3863fc4b-6143-4772-b275-0b9fdaa5b6f2",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-27T16:14:02.892191Z",
  "last_location_at": "2026-10-27T16:14:02.892191Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3863fc4b-6143-4772-b275-0b9fdaa5b6f2/handover` → **200**

```json
{
  "command_id": "c6605b69-6758-4ed9-9fe4-d582d6e602d9",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "3863fc4b-6143-4772-b275-0b9fdaa5b6f2",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-27T16:14:02.892191Z",
  "last_location_at": "2026-10-27T16:14:02.892191Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3863fc4b-6143-4772-b275-0b9fdaa5b6f2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:14:05Z",
    "sequence": 1793117645717
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "3863fc4b-6143-4772-b275-0b9fdaa5b6f2",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-27T16:14:05.736742Z",
  "last_location_at": "2026-10-27T16:14:05.736742Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/safety-contacts` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "emergency_number": "112",
  "support_phone": "+48220000101",
  "extra": [
    {
      "label": "Infolinia",
      "phone": "+48220000997"
    }
  ],
  "disclaimer_code": "NO_AUTO_DISPATCH"
}
```

## The driver goes off line; without a session there is no city

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "3863fc4b-6143-4772-b275-0b9fdaa5b6f2",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-27T16:14:05.736742Z",
  "last_location_at": "2026-10-27T16:14:05.736742Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3863fc4b-6143-4772-b275-0b9fdaa5b6f2/close` → **200**

```json
{
  "command_id": "31e698b4-32a8-42d3-a7dc-ecd4476ac1cd",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
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

`GET /api/driver/v1/safety-contacts` → **409**

```json
{
  "instance": "/api/driver/v1/safety-contacts",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "60db65c1-b105-4724-b62c-05bad1610a9f"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673960094",
  "device_ref": "sandbox-8460"
}
```

```json
{
  "challenge_id": "5511a44f-7af9-4807-892e-ad019ed9cdfd",
  "expires_at": "2026-10-27T16:19:05.909175563Z",
  "resend_available_at": "2026-10-27T16:14:06.909175563Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673960094` → **200**

```json
{
  "phone": "+380673960094",
  "audience": "CLIENT",
  "code": "508373",
  "sent_at": "2026-10-27T16:14:05.911381551Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5511a44f-7af9-4807-892e-ad019ed9cdfd",
  "code": "508373",
  "device_ref": "sandbox-8460"
}
```

```json
{
  "session_id": "2a81e9d1-f41a-49cb-8ab4-bf9c0bdea99f",
  "subject": {
    "type": "CLIENT",
    "id": "d3427de8-3390-44ff-81fb-df62a48c7fc0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzQyN2RlOC0zMzkwLTQ0ZmYtODFmYi1kZjYyYTQ4YzdmYzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4NTQ1LCJpYXQiOjE3OTMxMTc2NDUsImp0aSI6IjVmMTdhY2E3LWYwNDUtNGY4YS04N2Q2LTUxZGY3NGI5YjViNyIsInNpZCI6IjJhODFlOWQxLWY0MWEtNDljYi04YWI0LWJmOWMwYmRlYTk5ZiJ9.Q6gAiNoOk55jMymZu9ilkBsfIT44fQry6hVC-IdQf4o",
  "access_expires_at": "2026-10-27T16:29:05.970586801Z",
  "refresh_token": "8FOqT0ECsFDEi4snKkKM5HlsBrzObmnCeAa3R28tB2M",
  "refresh_expires_at": "2026-11-26T16:14:05.970021336Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "77cd9f7b-cd45-4521-b12a-11bc0814f808",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "cc8a5a6c-1a62-4238-bdbc-e01b35c1cf7f",
  "upload_path": "/api/rider/v1/uploads/cc8a5a6c-1a62-4238-bdbc-e01b35c1cf7f",
  "expires_at": "2026-10-27T16:29:06.009603183Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/cc8a5a6c-1a62-4238-bdbc-e01b35c1cf7f` → **200**

```json
{
  "file_id": "cc8a5a6c-1a62-4238-bdbc-e01b35c1cf7f",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "cdf7ca3f-6ef1-4eba-a7e1-03358fd97706",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "cc8a5a6c-1a62-4238-bdbc-e01b35c1cf7f"
  ]
}
```

```json
{
  "id": "40029466-0057-4b5c-adbd-4bbdd1618987",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d3427de8-3390-44ff-81fb-df62a48c7fc0",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T16:14:06.086085Z",
  "updated_at": "2026-10-27T16:14:06.086085Z",
  "messages": [
    {
      "id": "1cb368f3-2692-449d-8859-83a5de6d4c2f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d3427de8-3390-44ff-81fb-df62a48c7fc0",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T16:14:06.087615Z",
      "attachments": [
        {
          "file_id": "cc8a5a6c-1a62-4238-bdbc-e01b35c1cf7f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

## Operator downloads the rider photo and replies with another file

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
  "session_id": "6ccc2000-2029-46d7-81bb-6f6a731f7884",
  "subject": {
    "type": "STAFF",
    "id": "e5e7800f-85c9-49ac-b87f-a953b2fb2378"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWU3ODAwZi04NWM5LTQ5YWMtYjg3Zi1hOTUzYjJmYjIzNzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg1NDYsImlhdCI6MTc5MzExNzY0NiwianRpIjoiNGNhMDZmOTQtYTA5MS00ZDEyLTkxNDQtM2M0YTE1ZWNjZWJmIiwic2lkIjoiNmNjYzIwMDAtMjAyOS00NmQ3LTgxYmItNmY2YTczMWY3ODg0In0.BI2ggSqKlYbPIE2Q_o8j7Rxf659T6u3KvvEttqbFgxo",
  "access_expires_at": "2026-10-27T16:29:06.431359087Z",
  "refresh_token": "Zl7sKfVP5dMoKieJPmhNmHxfATyX_2dZEX3Do3YgtVw",
  "refresh_expires_at": "2026-10-28T04:14:06.430704202Z",
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
  "session_id": "e4fb43f9-420a-4116-af7f-7e1c289f7c0b",
  "subject": {
    "type": "STAFF",
    "id": "e5e7800f-85c9-49ac-b87f-a953b2fb2378"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWU3ODAwZi04NWM5LTQ5YWMtYjg3Zi1hOTUzYjJmYjIzNzgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg1NDYsImlhdCI6MTc5MzExNzY0NiwianRpIjoiYjJmYmE1YzEtZDQwNS00YTRkLWJiZTUtZmYwMzdmMTY4NGZlIiwic2lkIjoiZTRmYjQzZjktNDIwYS00MTE2LWFmN2YtN2UxYzI4OWY3YzBiIn0.vWCZ044ee1TqBCfVkTXURu8EyMaYJeKorBeIhL2Vuko",
  "access_expires_at": "2026-10-27T16:29:06.759519055Z",
  "refresh_token": "iFHyq-tAX_Y5NaWQaluGOp44oQW5Yz6yAHPgka1Xyys",
  "refresh_expires_at": "2026-10-28T04:14:06.758778141Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/40029466-0057-4b5c-adbd-4bbdd1618987/attachments/cc8a5a6c-1a62-4238-bdbc-e01b35c1cf7f` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "52792b9c-260a-4522-950f-e20baca66356",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "3e6b2904-b5a1-4577-88ba-e5699341a51c",
  "upload_path": "/api/operator/v1/uploads/3e6b2904-b5a1-4577-88ba-e5699341a51c",
  "expires_at": "2026-10-27T16:29:06.817899344Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/3e6b2904-b5a1-4577-88ba-e5699341a51c` → **200**

```json
{
  "file_id": "3e6b2904-b5a1-4577-88ba-e5699341a51c",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/40029466-0057-4b5c-adbd-4bbdd1618987` → **200**

```json
{
  "id": "40029466-0057-4b5c-adbd-4bbdd1618987",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d3427de8-3390-44ff-81fb-df62a48c7fc0",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T16:14:06.086085Z",
  "updated_at": "2026-10-27T16:14:06.086085Z",
  "messages": [
    {
      "id": "1cb368f3-2692-449d-8859-83a5de6d4c2f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d3427de8-3390-44ff-81fb-df62a48c7fc0",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T16:14:06.087615Z",
      "attachments": [
        {
          "file_id": "cc8a5a6c-1a62-4238-bdbc-e01b35c1cf7f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/40029466-0057-4b5c-adbd-4bbdd1618987/comments` → **200**

```json
{
  "command_id": "078bb657-022f-4bc5-ba4a-817b5419139e",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "3e6b2904-b5a1-4577-88ba-e5699341a51c"
  ]
}
```

```json
{
  "id": "40029466-0057-4b5c-adbd-4bbdd1618987",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d3427de8-3390-44ff-81fb-df62a48c7fc0",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T16:14:06.086085Z",
  "updated_at": "2026-10-27T16:14:06.927502Z",
  "messages": [
    {
      "id": "1cb368f3-2692-449d-8859-83a5de6d4c2f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d3427de8-3390-44ff-81fb-df62a48c7fc0",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T16:14:06.087615Z",
      "attachments": [
        {
          "file_id": "cc8a5a6c-1a62-4238-bdbc-e01b35c1cf7f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "f275e9d1-6662-4ed0-90ca-781a4cfe56dd",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "e5e7800f-85c9-49ac-b87f-a953b2fb2378",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T16:14:06.927107Z",
      "attachments": [
        {
          "file_id": "3e6b2904-b5a1-4577-88ba-e5699341a51c",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

## Rider sees the public reply and downloads its attachment

`GET /api/rider/v1/support/cases/40029466-0057-4b5c-adbd-4bbdd1618987` → **200**

```json
{
  "id": "40029466-0057-4b5c-adbd-4bbdd1618987",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d3427de8-3390-44ff-81fb-df62a48c7fc0",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T16:14:06.086085Z",
  "updated_at": "2026-10-27T16:14:06.927502Z",
  "messages": [
    {
      "id": "1cb368f3-2692-449d-8859-83a5de6d4c2f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d3427de8-3390-44ff-81fb-df62a48c7fc0",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T16:14:06.087615Z",
      "attachments": [
        {
          "file_id": "cc8a5a6c-1a62-4238-bdbc-e01b35c1cf7f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "f275e9d1-6662-4ed0-90ca-781a4cfe56dd",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T16:14:06.927107Z",
      "attachments": [
        {
          "file_id": "3e6b2904-b5a1-4577-88ba-e5699341a51c",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/40029466-0057-4b5c-adbd-4bbdd1618987/attachments/3e6b2904-b5a1-4577-88ba-e5699341a51c` → **200**

Done: support case 40029466-0057-4b5c-adbd-4bbdd1618987, rider attachment cc8a5a6c-1a62-4238-bdbc-e01b35c1cf7f, operator attachment 3e6b2904-b5a1-4577-88ba-e5699341a51c.

# Scenario: terminal-ride

## The admin marks that Andrii has an own card terminal

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
  "session_id": "01952317-46c2-4157-bb15-a946b5e77603",
  "subject": {
    "type": "STAFF",
    "id": "e5e7800f-85c9-49ac-b87f-a953b2fb2378"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWU3ODAwZi04NWM5LTQ5YWMtYjg3Zi1hOTUzYjJmYjIzNzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg1NDcsImlhdCI6MTc5MzExNzY0NywianRpIjoiMzdiN2Y0YzEtODYzNS00NWU3LWJhNTEtYTBlY2QwOTM5ZWFlIiwic2lkIjoiMDE5NTIzMTctNDZjMi00MTU3LWJiMTUtYTk0NmI1ZTc3NjAzIn0.iVJRHfB8olR4uVW6eInDoDq4q9PY2hNTpAjKQSQLK-A",
  "access_expires_at": "2026-10-27T16:29:07.324080683Z",
  "refresh_token": "3oU4MprnO6SSpGFIGf--VMQah-_I8keWiycTNvWAmbI",
  "refresh_expires_at": "2026-10-28T04:14:07.323396232Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-4447"
}
```

```json
{
  "challenge_id": "384a04a8-99d7-40b9-98bb-f48a46f99f6c",
  "expires_at": "2026-10-27T16:19:07.355234499Z",
  "resend_available_at": "2026-10-27T16:14:08.355234499Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "315334",
  "sent_at": "2026-10-27T16:14:07.357397549Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "384a04a8-99d7-40b9-98bb-f48a46f99f6c",
  "code": "315334",
  "device_ref": "sandbox-4447"
}
```

```json
{
  "session_id": "afaeafbc-6c84-4f6a-aa36-f4b53b731133",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODU0NywiaWF0IjoxNzkzMTE3NjQ3LCJqdGkiOiI0OWU4MzA2NS1hMzMzLTQ4MDQtYmNiMS01ZjJmZGJkMDk5MGEiLCJzaWQiOiJhZmFlYWZiYy02Yzg0LTRmNmEtYWEzNi1mNGI1M2I3MzExMzMifQ.AUIHP1g1sirRR_7DJ_BidF6TkB_RLzMD0IGiiDN8sdE",
  "access_expires_at": "2026-10-27T16:29:07.413562559Z",
  "refresh_token": "2FHObpMivIFlJp00WR-ODJwxUNXK7nsRE_y25o6A6H8",
  "refresh_expires_at": "2026-11-26T16:14:07.412994085Z",
  "account_created": false
}
```

`GET /api/driver/v1/profile` → **200**

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 3,
  "has_payment_terminal": false,
  "vehicles": [
    {
      "id": "5a000000-0000-4000-8000-000000000503",
      "registration_number": "AA0003TX",
      "make": "Hyundai",
      "model": "Sonata",
      "color": "black",
      "production_year": 2022,
      "state": "APPROVED",
      "class_approvals": [
        "STANDARD",
        "COMFORT"
      ]
    }
  ],
  "documents": []
}
```

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "APPROVED",
    "version": 3,
    "has_payment_terminal": false,
    "vehicles": [
      {
        "id": "5a000000-0000-4000-8000-000000000503",
        "registration_number": "AA0003TX",
        "make": "Hyundai",
        "model": "Sonata",
        "color": "black",
        "production_year": 2022,
        "state": "APPROVED",
        "class_approvals": [
          "STANDARD",
          "COMFORT"
        ]
      }
    ],
    "documents": []
  },
  "phone": "+380500000003",
  "history": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "b441162f-b44c-4523-b482-ec7cff7580c5",
  "expected_version": 3,
  "has_terminal": true,
  "reason": "ФОП, власний POS-термінал"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 4,
  "has_payment_terminal": true,
  "vehicles": [
    {
      "id": "5a000000-0000-4000-8000-000000000503",
      "registration_number": "AA0003TX",
      "make": "Hyundai",
      "model": "Sonata",
      "color": "black",
      "production_year": 2022,
      "state": "APPROVED",
      "class_approvals": [
        "STANDARD",
        "COMFORT"
      ]
    }
  ],
  "documents": []
}
```

## Ivan (no terminal) is nearer than Andrii

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-1620"
}
```

```json
{
  "challenge_id": "6bb90c67-9feb-4fa8-9841-37f4cbeda11b",
  "expires_at": "2026-10-27T16:19:07.546310415Z",
  "resend_available_at": "2026-10-27T16:14:08.546310415Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "336093",
  "sent_at": "2026-10-27T16:14:07.548514844Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6bb90c67-9feb-4fa8-9841-37f4cbeda11b",
  "code": "336093",
  "device_ref": "sandbox-1620"
}
```

```json
{
  "session_id": "0c85a4cd-6f72-4ab0-9c18-22b2e9892502",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODU0NywiaWF0IjoxNzkzMTE3NjQ3LCJqdGkiOiJiZDUxOWI2OS0yN2Q3LTQ2YjItYTVlMi1hMzhhNTNjYmFjZjUiLCJzaWQiOiIwYzg1YTRjZC02ZjcyLTRhYjAtOWMxOC0yMmIyZTk4OTI1MDIifQ.B7Ba4wKX9gJELcTTE5yx5xxFIIiebJKul1vgJLNxTy8",
  "access_expires_at": "2026-10-27T16:29:07.605616905Z",
  "refresh_token": "SMnN4F_pR8Y3QFyj4vlycVegL8bbIyqMsFYaBpu9Uqw",
  "refresh_expires_at": "2026-11-26T16:14:07.605024257Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "24565544-9ad9-4e66-903c-fd68bba445ca",
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
  "last_heartbeat_at": "2026-10-27T16:14:04.060528Z",
  "last_location_at": "2026-10-27T16:14:04.060528Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/24565544-9ad9-4e66-903c-fd68bba445ca/handover` → **200**

```json
{
  "command_id": "fbbea1f4-b47c-4540-8ffc-625a0acaf769",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "24565544-9ad9-4e66-903c-fd68bba445ca",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-27T16:14:04.060528Z",
  "last_location_at": "2026-10-27T16:14:04.060528Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/24565544-9ad9-4e66-903c-fd68bba445ca/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:14:07Z",
    "sequence": 1793117647695
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "24565544-9ad9-4e66-903c-fd68bba445ca",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-27T16:14:07.714824Z",
  "last_location_at": "2026-10-27T16:14:07.714824Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
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
  "command_id": "d60f5515-82d2-4461-8d45-6271386b84d3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:14:07Z",
    "sequence": 1793117647766
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f86bbea2-9b3d-49b2-b44b-09b5ed184936",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-27T16:14:07.784552Z",
  "last_location_at": "2026-10-27T16:14:07.784552Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The operator takes a phone order paid at the terminal

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
  "session_id": "562465d0-ed87-48d3-a289-83a608b807a2",
  "subject": {
    "type": "STAFF",
    "id": "e5e7800f-85c9-49ac-b87f-a953b2fb2378"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWU3ODAwZi04NWM5LTQ5YWMtYjg3Zi1hOTUzYjJmYjIzNzgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg1NDgsImlhdCI6MTc5MzExNzY0OCwianRpIjoiNTRjZDIzOTUtYTczNy00ZmM1LWEwOTktODQ2YjM0ZWRhMGMwIiwic2lkIjoiNTYyNDY1ZDAtZWQ4Ny00OGQzLWEyODktODNhNjA4YjgwN2EyIn0.cVyprhqttRGFyK6tKPU0LUyq3F30pzqUfm2VUWW5Y8g",
  "access_expires_at": "2026-10-27T16:29:08.121217014Z",
  "refresh_token": "ZQBs5PYf7AOU1Eq2jLzctoOhdOvA8OWLAn8NowGczJA",
  "refresh_expires_at": "2026-10-28T04:14:08.120564022Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "df7a040d-bd9e-4848-ba68-702f5f24bb54",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  }
}
```

```json
{
  "id": "84c2e1ed-f4c9-4fd5-90a3-147eb86848e0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T16:19:08.155606Z",
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

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "5543d3c7-2943-4b7d-bb5a-2525fcd3f260",
  "quote_id": "84c2e1ed-f4c9-4fd5-90a3-147eb86848e0",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Позняки",
  "payment_method": "TERMINAL",
  "caller": {
    "name": "Олена",
    "phone": "+380671112233"
  }
}
```

```json
{
  "id": "17b87832-9fac-4761-93ee-e7f39c0d9cb6",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Позняки",
  "payment_method": "TERMINAL",
  "payment_state": "TERMINAL_EXPECTED",
  "price_minor": 29967,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-27T16:14:08.194671Z",
  "caller": {
    "name": "Олена",
    "phone": "+380671112233"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[]
```

## Andrii accepts, drives and reports the card payment went through

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "ce6bcba2-ac6e-4353-a50e-2935d47bd400",
    "order_id": "17b87832-9fac-4761-93ee-e7f39c0d9cb6",
    "expires_at": "2026-10-27T16:14:23.198289Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "pickup_label": "Майдан",
    "dropoff_label": "Позняки",
    "payment_method": "TERMINAL",
    "price_minor": 29967,
    "currency": "UAH",
    "distance_m": 656
  }
]
```

`POST /api/driver/v1/offers/ce6bcba2-ac6e-4353-a50e-2935d47bd400/accept` → **200**

```json
{
  "command_id": "d00c2384-aa51-4f33-b90b-9d033a13038a"
}
```

```json
{
  "id": "fac1cb81-97ab-4c7b-907c-93ddaa12a583",
  "order_id": "17b87832-9fac-4761-93ee-e7f39c0d9cb6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "340b4a4a-a984-4093-98af-a9159725357e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "340b4a4a-a984-4093-98af-a9159725357e",
  "order_id": "17b87832-9fac-4761-93ee-e7f39c0d9cb6",
  "assignment_id": "fac1cb81-97ab-4c7b-907c-93ddaa12a583",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Позняки",
  "payment_method": "TERMINAL",
  "price_minor": 29967,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671112233"
  }
}
```

`POST /api/driver/v1/work-sessions/f86bbea2-9b3d-49b2-b44b-09b5ed184936/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:14:08Z",
    "sequence": 1793117648335
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f86bbea2-9b3d-49b2-b44b-09b5ed184936",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-27T16:14:08.355421Z",
  "last_location_at": "2026-10-27T16:14:08.355421Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/340b4a4a-a984-4093-98af-a9159725357e/arrive` → **200**

```json
{
  "command_id": "01b05442-1dba-4820-a3d7-d2cc099a2d44",
  "expected_version": 0
}
```

```json
{
  "id": "340b4a4a-a984-4093-98af-a9159725357e",
  "order_id": "17b87832-9fac-4761-93ee-e7f39c0d9cb6",
  "assignment_id": "fac1cb81-97ab-4c7b-907c-93ddaa12a583",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Позняки",
  "payment_method": "TERMINAL",
  "price_minor": 29967,
  "currency": "UAH",
  "arrived_at": "2026-10-27T16:14:08.395825Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671112233"
  }
}
```

`POST /api/driver/v1/trips/340b4a4a-a984-4093-98af-a9159725357e/start` → **200**

```json
{
  "command_id": "b3ddfcd1-d263-4e2b-b1f5-31b9ee932ae9",
  "expected_version": 1
}
```

```json
{
  "id": "340b4a4a-a984-4093-98af-a9159725357e",
  "order_id": "17b87832-9fac-4761-93ee-e7f39c0d9cb6",
  "assignment_id": "fac1cb81-97ab-4c7b-907c-93ddaa12a583",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Позняки",
  "payment_method": "TERMINAL",
  "price_minor": 29967,
  "currency": "UAH",
  "arrived_at": "2026-10-27T16:14:08.395825Z",
  "started_at": "2026-10-27T16:14:08.439486Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671112233"
  }
}
```

`POST /api/driver/v1/trips/340b4a4a-a984-4093-98af-a9159725357e/complete` → **200**

```json
{
  "command_id": "c521a002-4fb0-47cc-be0c-616c944b648d",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:14:08Z",
  "cash_received": true
}
```

```json
{
  "id": "340b4a4a-a984-4093-98af-a9159725357e",
  "order_id": "17b87832-9fac-4761-93ee-e7f39c0d9cb6",
  "assignment_id": "fac1cb81-97ab-4c7b-907c-93ddaa12a583",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Позняки",
  "payment_method": "TERMINAL",
  "price_minor": 29967,
  "currency": "UAH",
  "arrived_at": "2026-10-27T16:14:08.395825Z",
  "started_at": "2026-10-27T16:14:08.439486Z",
  "completed_at": "2026-10-27T16:14:08.485549Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/17b87832-9fac-4761-93ee-e7f39c0d9cb6` → **200**

```json
{
  "id": "17b87832-9fac-4761-93ee-e7f39c0d9cb6",
  "short_number": 15,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Позняки",
  "payment_method": "TERMINAL",
  "payment_state": "TERMINAL_REPORTED",
  "price_minor": 29967,
  "final_price_minor": 29967,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "fac1cb81-97ab-4c7b-907c-93ddaa12a583",
    "order_id": "17b87832-9fac-4761-93ee-e7f39c0d9cb6",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "340b4a4a-a984-4093-98af-a9159725357e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T16:14:08.194671Z",
  "caller": {
    "name": "Олена",
    "phone": "+380671112233"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/driver/v1/balance` → **200**

```json
{
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 11857,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "24565544-9ad9-4e66-903c-fd68bba445ca",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-27T16:14:07.714824Z",
  "last_location_at": "2026-10-27T16:14:07.714824Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/24565544-9ad9-4e66-903c-fd68bba445ca/close` → **200**

```json
{
  "command_id": "13e50012-e244-491f-8fe9-0892caa4fd58",
  "expected_version": 1
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f86bbea2-9b3d-49b2-b44b-09b5ed184936",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-27T16:14:08.355421Z",
  "last_location_at": "2026-10-27T16:14:08.355421Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f86bbea2-9b3d-49b2-b44b-09b5ed184936/close` → **200**

```json
{
  "command_id": "d47d10ec-1cce-41ae-a783-c0f06af13370",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
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

Done: terminal order 17b87832-9fac-4761-93ee-e7f39c0d9cb6 by Andrii (5a000000-0000-4000-8000-000000000403).
