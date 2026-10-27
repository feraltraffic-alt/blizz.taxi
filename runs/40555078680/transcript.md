# Sandbox transcript (2026-10-27T17:56:02Z, d56fdae)

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
  "correlation_id": "1ca75694-ce41-45ee-8d63-d373d6ba88fc"
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
  "session_id": "42e18969-806d-492b-9891-a1c4e965c9dd",
  "subject": {
    "type": "STAFF",
    "id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWZhODRhMi01MjYxLTQxYTktYjczZS05ZDA0NzU3YjlmOGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQ2NjMsImlhdCI6MTc5MzEyMzc2MywianRpIjoiMGY0ODZiYmMtZjJjOS00Yjc1LWIzZGEtZjE0YzFhMzI5YThmIiwic2lkIjoiNDJlMTg5NjktODA2ZC00OTJiLTk4OTEtYTFjNGU5NjVjOWRkIn0.fyziXL4xfcBSHpaLiLQRvJHLPU9be081EeDvnIAYCYk",
  "access_expires_at": "2026-10-27T18:11:03.261046794Z",
  "refresh_token": "cntxtvxQj_jn6MCVcYdLu0TpZi3AhMLmirF9pm1HuBg",
  "refresh_expires_at": "2026-10-28T05:56:03.258973206Z",
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
  "session_id": "32875859-da3e-409c-b128-df1ea3b60c41",
  "subject": {
    "type": "STAFF",
    "id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWZhODRhMi01MjYxLTQxYTktYjczZS05ZDA0NzU3YjlmOGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQ2NjQsImlhdCI6MTc5MzEyMzc2NCwianRpIjoiYTBjMmRmOTEtMDllMS00ZmJmLWE2YjktYjk5NjYzOTBjZjA5Iiwic2lkIjoiMzI4NzU4NTktZGEzZS00MDljLWIxMjgtZGYxZWEzYjYwYzQxIn0.uV89a7dr6lWuiEjbJjkP9f7E01x-Qg7rgAWOeIW10nY",
  "access_expires_at": "2026-10-27T18:11:04.55375618Z",
  "refresh_token": "-V6gNL0CH2TfA_UDLgBAtChHlLWq1pu7z344Kimy1pc",
  "refresh_expires_at": "2026-10-28T05:56:04.552670206Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "839f48d3-4042-4c7b-8293-9c1dcf0734f7",
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
  "id": "802bac08-6e2e-482e-b1b0-072de1ea2fbf",
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
  "created_by": "4efa84a2-5261-41a9-b73e-9d04757b9f8d",
  "created_at": "2026-10-27T17:56:04.613989Z",
  "updated_at": "2026-10-27T17:56:04.613989Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633232847",
  "device_ref": "sandbox-30259"
}
```

```json
{
  "challenge_id": "824cbd1b-f8fe-4d28-949e-8a8be61ddb47",
  "expires_at": "2026-10-27T18:01:04.663056214Z",
  "resend_available_at": "2026-10-27T17:56:05.663056214Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633232847` → **200**

```json
{
  "phone": "+380633232847",
  "audience": "CLIENT",
  "code": "483318",
  "sent_at": "2026-10-27T17:56:04.670160149Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "824cbd1b-f8fe-4d28-949e-8a8be61ddb47",
  "code": "483318",
  "device_ref": "sandbox-30259"
}
```

```json
{
  "session_id": "03bd3b0c-db09-4692-88e1-dd4d9807f5df",
  "subject": {
    "type": "CLIENT",
    "id": "f0c2fb53-00a1-4626-abe4-38075fde96e3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGMyZmI1My0wMGExLTQ2MjYtYWJlNC0zODA3NWZkZTk2ZTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI0NjY0LCJpYXQiOjE3OTMxMjM3NjQsImp0aSI6IjlkODMyNDg5LWVjYzktNDkzMy1iZWIwLWMwNDk5ZGU1ZDhhMSIsInNpZCI6IjAzYmQzYjBjLWRiMDktNDY5Mi04OGUxLWRkNGQ5ODA3ZjVkZiJ9.kb39sRqlq_oD53KxDj4ky2ARS04AG3fYcJp7aBZS2VY",
  "access_expires_at": "2026-10-27T18:11:04.771350379Z",
  "refresh_token": "URwtodZ1hG816_eS5xsDrXVkn1Q7h5-rWP8EsVtg2NQ",
  "refresh_expires_at": "2026-11-26T17:56:04.769996356Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380633232847` → **200**

```json
{
  "client_id": "f0c2fb53-00a1-4626-abe4-38075fde96e3"
}
```

`POST /api/admin/v1/rider-wallets/f0c2fb53-00a1-4626-abe4-38075fde96e3/top-ups` → **201**

```json
{
  "command_id": "c9ca7e87-1776-4ad8-9d5a-c1c53f9f2c65",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "f0c2fb53-00a1-4626-abe4-38075fde96e3",
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
      "id": "e39ac7e2-d1f2-476f-95f3-2fa78d3f5083",
      "at": "2026-10-27T17:56:04.864875Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "59d6730e-cfb8-4b0e-9156-b7afd90b956c",
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
  "id": "d8966b27-8740-4af3-ac93-0e29036282bc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T18:01:05.022047Z",
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
      "id": "802bac08-6e2e-482e-b1b0-072de1ea2fbf",
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
  "device_ref": "sandbox-1307"
}
```

```json
{
  "challenge_id": "bff89465-8979-4141-82fa-602d2142e012",
  "expires_at": "2026-10-27T18:01:05.102763272Z",
  "resend_available_at": "2026-10-27T17:56:06.102763272Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "430844",
  "sent_at": "2026-10-27T17:56:05.10657183Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bff89465-8979-4141-82fa-602d2142e012",
  "code": "430844",
  "device_ref": "sandbox-1307"
}
```

```json
{
  "session_id": "3d3e1c85-9730-4feb-86c3-6d51b8b82889",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDY2NSwiaWF0IjoxNzkzMTIzNzY1LCJqdGkiOiI5ZDNhMTEzYy0yZmEwLTQwNjEtOWMxYi04ZjFiOTdlZTM1YTEiLCJzaWQiOiIzZDNlMWM4NS05NzMwLTRmZWItODZjMy02ZDUxYjhiODI4ODkifQ.N0QI1g31Z3oxaRuo8n0YTuy0r7GQV2EElVwpjn_UQyw",
  "access_expires_at": "2026-10-27T18:11:05.163764075Z",
  "refresh_token": "rE-Txu5k573QfuKByrkwmqunqKqgKKZColpIPd0UPtI",
  "refresh_expires_at": "2026-11-26T17:56:05.162705218Z",
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
  "command_id": "7488348a-6443-4c9b-b8e7-711962f1e904",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:56:05Z",
    "sequence": 1793123765225
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3d00b2ca-d79d-4839-a890-c015693f4f4b",
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
  "last_heartbeat_at": "2026-10-27T17:56:05.264645Z",
  "last_location_at": "2026-10-27T17:56:05.264645Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c426c786-ba00-4f1c-a429-2a1eba3a8e25",
  "quote_id": "d8966b27-8740-4af3-ac93-0e29036282bc",
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
  "id": "0185cbb9-3feb-4247-afcf-ef1b57588cee",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f0c2fb53-00a1-4626-abe4-38075fde96e3",
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
  "created_at": "2026-10-27T17:56:05.354153Z",
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
  "client_id": "f0c2fb53-00a1-4626-abe4-38075fde96e3",
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
      "id": "e39ac7e2-d1f2-476f-95f3-2fa78d3f5083",
      "at": "2026-10-27T17:56:04.864875Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d",
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
    "id": "f9f1089e-d4b3-4134-9e76-52226c7ef931",
    "order_id": "0185cbb9-3feb-4247-afcf-ef1b57588cee",
    "expires_at": "2026-10-27T17:56:20.367673Z",
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

`POST /api/driver/v1/offers/f9f1089e-d4b3-4134-9e76-52226c7ef931/accept` → **200**

```json
{
  "command_id": "8d38db18-825f-400e-8dda-e10168a3f1f9"
}
```

```json
{
  "id": "3535cec0-cf55-4833-8c0b-746ef034e85c",
  "order_id": "0185cbb9-3feb-4247-afcf-ef1b57588cee",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4967cf4a-ab8d-40d3-a323-5ab0965580ae",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4967cf4a-ab8d-40d3-a323-5ab0965580ae",
  "order_id": "0185cbb9-3feb-4247-afcf-ef1b57588cee",
  "assignment_id": "3535cec0-cf55-4833-8c0b-746ef034e85c",
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

`POST /api/driver/v1/work-sessions/3d00b2ca-d79d-4839-a890-c015693f4f4b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:56:05Z",
    "sequence": 1793123765540
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3d00b2ca-d79d-4839-a890-c015693f4f4b",
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
  "last_heartbeat_at": "2026-10-27T17:56:05.564344Z",
  "last_location_at": "2026-10-27T17:56:05.564344Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4967cf4a-ab8d-40d3-a323-5ab0965580ae/arrive` → **200**

```json
{
  "command_id": "0ae56aa8-2943-46ed-8038-3146f60efb91",
  "expected_version": 0
}
```

```json
{
  "id": "4967cf4a-ab8d-40d3-a323-5ab0965580ae",
  "order_id": "0185cbb9-3feb-4247-afcf-ef1b57588cee",
  "assignment_id": "3535cec0-cf55-4833-8c0b-746ef034e85c",
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
  "arrived_at": "2026-10-27T17:56:05.612699Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4967cf4a-ab8d-40d3-a323-5ab0965580ae/start` → **200**

```json
{
  "command_id": "47bb2ef1-3352-4857-868d-084cad2c3fc1",
  "expected_version": 1
}
```

```json
{
  "id": "4967cf4a-ab8d-40d3-a323-5ab0965580ae",
  "order_id": "0185cbb9-3feb-4247-afcf-ef1b57588cee",
  "assignment_id": "3535cec0-cf55-4833-8c0b-746ef034e85c",
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
  "arrived_at": "2026-10-27T17:56:05.612699Z",
  "started_at": "2026-10-27T17:56:05.656813Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/4967cf4a-ab8d-40d3-a323-5ab0965580ae/complete` → **200**

```json
{
  "command_id": "8e39376c-ffdc-41f4-a7a2-8bfadbc36441",
  "expected_version": 2,
  "reported_at": "2026-10-27T17:56:05Z",
  "cash_received": true
}
```

```json
{
  "id": "4967cf4a-ab8d-40d3-a323-5ab0965580ae",
  "order_id": "0185cbb9-3feb-4247-afcf-ef1b57588cee",
  "assignment_id": "3535cec0-cf55-4833-8c0b-746ef034e85c",
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
  "arrived_at": "2026-10-27T17:56:05.612699Z",
  "started_at": "2026-10-27T17:56:05.656813Z",
  "completed_at": "2026-10-27T17:56:05.721895Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "f0c2fb53-00a1-4626-abe4-38075fde96e3",
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
      "id": "a5204348-260e-44c9-a66c-317bc7ed6c92",
      "at": "2026-10-27T17:56:05.836306Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "0185cbb9-3feb-4247-afcf-ef1b57588cee"
    },
    {
      "id": "e39ac7e2-d1f2-476f-95f3-2fa78d3f5083",
      "at": "2026-10-27T17:56:04.864875Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/802bac08-6e2e-482e-b1b0-072de1ea2fbf/archive` → **200**

```json
{
  "command_id": "7adea526-f63f-4395-a983-7d0612305022",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "802bac08-6e2e-482e-b1b0-072de1ea2fbf",
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
  "created_by": "4efa84a2-5261-41a9-b73e-9d04757b9f8d",
  "created_at": "2026-10-27T17:56:04.613989Z",
  "updated_at": "2026-10-27T17:56:08.819448Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3d00b2ca-d79d-4839-a890-c015693f4f4b",
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
  "last_heartbeat_at": "2026-10-27T17:56:05.564344Z",
  "last_location_at": "2026-10-27T17:56:05.564344Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3d00b2ca-d79d-4839-a890-c015693f4f4b/close` → **200**

```json
{
  "command_id": "3759e99e-9b77-434b-8880-2ec5ab2f6413",
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

Done: order 0185cbb9-3feb-4247-afcf-ef1b57588cee.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631617147",
  "device_ref": "sandbox-21132"
}
```

```json
{
  "challenge_id": "25dc02a7-7978-4734-8e78-6314399f4052",
  "expires_at": "2026-10-27T18:01:08.950456815Z",
  "resend_available_at": "2026-10-27T17:56:09.950456815Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631617147` → **200**

```json
{
  "phone": "+380631617147",
  "audience": "CLIENT",
  "code": "420396",
  "sent_at": "2026-10-27T17:56:08.954156338Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "25dc02a7-7978-4734-8e78-6314399f4052",
  "code": "420396",
  "device_ref": "sandbox-21132"
}
```

```json
{
  "session_id": "1b457793-47ad-4cd5-9b63-5375b5319db9",
  "subject": {
    "type": "CLIENT",
    "id": "002b4df6-6483-4b7c-9fb8-284c876b3d36"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMDJiNGRmNi02NDgzLTRiN2MtOWZiOC0yODRjODc2YjNkMzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI0NjY5LCJpYXQiOjE3OTMxMjM3NjksImp0aSI6ImQ5YjRkMGFkLTQxNTctNGQ0OC1hZWIzLTA2MmIwODI3Njc1ZSIsInNpZCI6IjFiNDU3NzkzLTQ3YWQtNGNkNS05YjYzLTUzNzViNTMxOWRiOSJ9.D0R-RSjBdEsds-VgEul0AwPx_6YYB7imzaMkYALY9xM",
  "access_expires_at": "2026-10-27T18:11:09.009927071Z",
  "refresh_token": "A2VcJgUOyyzkWb1I-P-nBB6HqoUHRFwDw__n4Cfoe-8",
  "refresh_expires_at": "2026-11-26T17:56:09.008986715Z",
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
        "uk": "Передумав їхати",
        "en": "Changed my mind",
        "ru": "Передумал ехать",
        "pl": "Zmiana planów"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "uk": "Довго чекати авто",
        "en": "The wait is too long",
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "uk": "Помилився адресою",
        "en": "Wrong address",
        "ru": "Ошибся адресом",
        "pl": "Błędny adres"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "uk": "Поїду іншим транспортом",
        "en": "Found other transport",
        "ru": "Уеду на другом транспорте",
        "pl": "Inny transport"
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
  "device_ref": "sandbox-4109"
}
```

```json
{
  "challenge_id": "8f0a77f8-318d-4a4e-b8a9-8832be1a9516",
  "expires_at": "2026-10-27T18:01:09.066465448Z",
  "resend_available_at": "2026-10-27T17:56:10.066465448Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "202872",
  "sent_at": "2026-10-27T17:56:09.069979187Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8f0a77f8-318d-4a4e-b8a9-8832be1a9516",
  "code": "202872",
  "device_ref": "sandbox-4109"
}
```

```json
{
  "session_id": "91c34392-de8e-4263-aacf-31d267672cbd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDY2OSwiaWF0IjoxNzkzMTIzNzY5LCJqdGkiOiI3NGUyYzAyOC0zNWNkLTRjYzctYmFmZi04YzU0YTM0ZGRjNzgiLCJzaWQiOiI5MWMzNDM5Mi1kZThlLTQyNjMtYWFjZi0zMWQyNjc2NzJjYmQifQ._P5s_ARo-64l3BKUbpupyURf9erTZRfvejsDx6MZV0I",
  "access_expires_at": "2026-10-27T18:11:09.127485188Z",
  "refresh_token": "gV4Y3jy6zbZ2XmEl5RyDIpzRMGGo3lwiCpXk4xyawdw",
  "refresh_expires_at": "2026-11-26T17:56:09.126498753Z",
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
        "uk": "Пасажир не вийшов",
        "en": "Passenger did not show up",
        "ru": "Пассажир не вышел",
        "pl": "Pasażer nie przyszedł"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "uk": "Несправність автомобіля",
        "en": "Vehicle problem",
        "ru": "Неисправность автомобиля",
        "pl": "Awaria samochodu"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "uk": "Не можу під'їхати",
        "en": "Cannot reach the pickup",
        "ru": "Не могу подъехать",
        "pl": "Nie mogę dojechać"
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
  "session_id": "3677744e-9b7a-4a1c-9f3d-6475b1813fd9",
  "subject": {
    "type": "STAFF",
    "id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWZhODRhMi01MjYxLTQxYTktYjczZS05ZDA0NzU3YjlmOGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQ2NjksImlhdCI6MTc5MzEyMzc2OSwianRpIjoiYzZlYzdlODItMGYxNi00ZjJmLTljYWYtN2FlY2ExNTJhOTE2Iiwic2lkIjoiMzY3Nzc0NGUtOWI3YS00YTFjLTlmM2QtNjQ3NWIxODEzZmQ5In0.XF9mR7xC2jRJsLj3Q7gEWAGYOk9QUjnsiWf0_hcwVRE",
  "access_expires_at": "2026-10-27T18:11:09.475454252Z",
  "refresh_token": "skjx3uvwz5hHndLmqetpn6l1d6YoXP7_KC5I7DzA9ok",
  "refresh_expires_at": "2026-10-28T05:56:09.474684753Z",
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
  "session_id": "2ffa1316-6b56-47e0-975a-84811f5d1b48",
  "subject": {
    "type": "STAFF",
    "id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWZhODRhMi01MjYxLTQxYTktYjczZS05ZDA0NzU3YjlmOGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQ2NjksImlhdCI6MTc5MzEyMzc2OSwianRpIjoiYTQ5MjdiMzctNDg5My00MjExLTkwZjQtOGQwNzZkMjkyYjRiIiwic2lkIjoiMmZmYTEzMTYtNmI1Ni00N2UwLTk3NWEtODQ4MTFmNWQxYjQ4In0.Lt7eb4Sb5jPZsHNIQpC8QoejLz1fJFCIHA3w0IG9pe8",
  "access_expires_at": "2026-10-27T18:11:09.796684009Z",
  "refresh_token": "UTwwISMP90KS1WS_6ywsAiYSxv7Fqx5JmIMyeHCSw-w",
  "refresh_expires_at": "2026-10-28T05:56:09.795886625Z",
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
        "uk": "Пасажир попросив",
        "en": "Passenger asked",
        "ru": "Пассажир попросил",
        "pl": "Na prośbę pasażera"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "uk": "Дубль замовлення",
        "en": "Duplicate order",
        "ru": "Дубль заказа",
        "pl": "Duplikat zamówienia"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "uk": "Немає вільних авто",
        "en": "No cars available",
        "ru": "Нет свободных машин",
        "pl": "Brak wolnych aut"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "uk": "Тестове замовлення",
        "en": "Test order",
        "ru": "Тестовый заказ",
        "pl": "Zamówienie testowe"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "uk": "Помилка оператора",
        "en": "Operator error",
        "ru": "Ошибка оператора",
        "pl": "Błąd operatora"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "uk": "ДТП",
        "en": "Accident",
        "ru": "ДТП",
        "pl": "Wypadek"
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
  "command_id": "c89e6fba-59a2-4f8b-acc8-42ec04868d31",
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
  "id": "59c8be1c-b0cf-4133-b1e4-5ba157d4c6bf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T18:01:09.860586Z",
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
  "command_id": "b5a296b3-9fb3-4859-b70e-b0aedfde22fb",
  "quote_id": "59c8be1c-b0cf-4133-b1e4-5ba157d4c6bf",
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
  "id": "cdcbee3d-0980-47fa-bd68-09fe23395fc6",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "002b4df6-6483-4b7c-9fb8-284c876b3d36",
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
  "created_at": "2026-10-27T17:56:09.901352Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/cdcbee3d-0980-47fa-bd68-09fe23395fc6` → **200**

```json
{
  "id": "cdcbee3d-0980-47fa-bd68-09fe23395fc6",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "002b4df6-6483-4b7c-9fb8-284c876b3d36",
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
  "created_at": "2026-10-27T17:56:09.901352Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/cdcbee3d-0980-47fa-bd68-09fe23395fc6/cancel` → **200**

```json
{
  "command_id": "4d8c8a70-e842-4de1-8051-4b3f473b825a",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "cdcbee3d-0980-47fa-bd68-09fe23395fc6",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "002b4df6-6483-4b7c-9fb8-284c876b3d36",
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
  "created_at": "2026-10-27T17:56:09.901352Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "uk": "Довго чекати авто",
      "en": "The wait is too long",
      "ru": "Долго ждать машину",
      "pl": "Zbyt długie oczekiwanie"
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
  "command_id": "ec16736f-8b3d-44ab-9c3a-e44210a620c5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:56:10Z",
    "sequence": 1793123770372
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "73c26bfd-592c-460b-b8f4-736a66981f9b",
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
  "last_heartbeat_at": "2026-10-27T17:56:10.056574Z",
  "last_location_at": "2026-10-27T17:56:10.056574Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-10603"
}
```

```json
{
  "challenge_id": "07d56441-2264-42f1-b5a3-5852f70d8752",
  "expires_at": "2026-10-27T18:01:10.086917803Z",
  "resend_available_at": "2026-10-27T17:56:11.086917803Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "391529",
  "sent_at": "2026-10-27T17:56:10.090030141Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "07d56441-2264-42f1-b5a3-5852f70d8752",
  "code": "391529",
  "device_ref": "sandbox-10603"
}
```

```json
{
  "session_id": "245940fa-6714-44c6-b87c-048d397ac964",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDY3MCwiaWF0IjoxNzkzMTIzNzcwLCJqdGkiOiIyNTljNDIzOS1kMjBhLTQzZDctODgwMS1mYjNlODg2ZDlhMjkiLCJzaWQiOiIyNDU5NDBmYS02NzE0LTQ0YzYtYjg3Yy0wNDhkMzk3YWM5NjQifQ.H4quRQeYbUP74TSKHz9cqm-_ld8xa36RF88Cy8HNpQI",
  "access_expires_at": "2026-10-27T18:11:10.146064059Z",
  "refresh_token": "hsQgeGH3NKURchyOMYZ8AX4Uogy0-EiVXWb7CNjzJjA",
  "refresh_expires_at": "2026-11-26T17:56:10.145254315Z",
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
  "command_id": "fb82ef1c-826b-401b-b44f-02e53696be7a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:56:10Z",
    "sequence": 1793123770373
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7b25ff9a-05ff-44c4-90c6-038b169cab45",
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
  "last_heartbeat_at": "2026-10-27T17:56:10.218518Z",
  "last_location_at": "2026-10-27T17:56:10.218518Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ecdf5595-52e1-46c5-ac0d-181ff6454a9b",
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
  "id": "2c8e3cd8-1a88-4255-b5c8-ce7108e97b09",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T18:01:10.259611Z",
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
  "command_id": "0f6f8112-bbba-4921-be12-a5b190e0f006",
  "quote_id": "2c8e3cd8-1a88-4255-b5c8-ce7108e97b09",
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
  "id": "437d8586-4941-403a-9262-4babe204a2d5",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "002b4df6-6483-4b7c-9fb8-284c876b3d36",
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
  "created_at": "2026-10-27T17:56:10.299123Z",
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
    "id": "e229b93f-6118-4136-9991-58400ca40499",
    "order_id": "437d8586-4941-403a-9262-4babe204a2d5",
    "expires_at": "2026-10-27T17:56:25.303446Z",
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

`POST /api/driver/v1/offers/e229b93f-6118-4136-9991-58400ca40499/accept` → **200**

```json
{
  "command_id": "065f5bff-8145-4766-a851-b47db6333622"
}
```

```json
{
  "id": "aa9f7788-17e3-47df-ba57-f9884923ed87",
  "order_id": "437d8586-4941-403a-9262-4babe204a2d5",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "41a845d9-7cb5-4f13-a4a2-d263ae8c9fbf",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "41a845d9-7cb5-4f13-a4a2-d263ae8c9fbf",
  "order_id": "437d8586-4941-403a-9262-4babe204a2d5",
  "assignment_id": "aa9f7788-17e3-47df-ba57-f9884923ed87",
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

`POST /api/driver/v1/trips/41a845d9-7cb5-4f13-a4a2-d263ae8c9fbf/cancel` → **200**

```json
{
  "command_id": "07565db6-f093-4e05-ab4c-3b956b192246",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "41a845d9-7cb5-4f13-a4a2-d263ae8c9fbf",
  "order_id": "437d8586-4941-403a-9262-4babe204a2d5",
  "assignment_id": "aa9f7788-17e3-47df-ba57-f9884923ed87",
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

`GET /api/rider/v1/orders/437d8586-4941-403a-9262-4babe204a2d5` → **200**

```json
{
  "id": "437d8586-4941-403a-9262-4babe204a2d5",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "002b4df6-6483-4b7c-9fb8-284c876b3d36",
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
    "id": "aa9f7788-17e3-47df-ba57-f9884923ed87",
    "order_id": "437d8586-4941-403a-9262-4babe204a2d5",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "41a845d9-7cb5-4f13-a4a2-d263ae8c9fbf",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T17:56:10.299123Z",
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
    "id": "99b6fd22-d707-4b8e-a6c8-37fb8f874458",
    "order_id": "437d8586-4941-403a-9262-4babe204a2d5",
    "expires_at": "2026-10-27T17:56:25.444823Z",
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

`POST /api/driver/v1/offers/99b6fd22-d707-4b8e-a6c8-37fb8f874458/accept` → **200**

```json
{
  "command_id": "8c61e248-62a7-4b4d-b7ee-1066fa26bf6c"
}
```

```json
{
  "id": "e9161c85-aebe-46d5-b838-7ae1f2b624d7",
  "order_id": "437d8586-4941-403a-9262-4babe204a2d5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "661bcd10-7b19-47b9-af6a-5465f4c452ec",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "661bcd10-7b19-47b9-af6a-5465f4c452ec",
  "order_id": "437d8586-4941-403a-9262-4babe204a2d5",
  "assignment_id": "e9161c85-aebe-46d5-b838-7ae1f2b624d7",
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

`POST /api/driver/v1/trips/661bcd10-7b19-47b9-af6a-5465f4c452ec/cancel` → **200**

```json
{
  "command_id": "613d80b2-9e59-4ca4-b99b-f7a518121008",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "661bcd10-7b19-47b9-af6a-5465f4c452ec",
  "order_id": "437d8586-4941-403a-9262-4babe204a2d5",
  "assignment_id": "e9161c85-aebe-46d5-b838-7ae1f2b624d7",
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
    "id": "437d8586-4941-403a-9262-4babe204a2d5",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-27T17:56:10.299123Z",
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
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie"
      }
    },
    "pickup_at": null
  },
  {
    "id": "cdcbee3d-0980-47fa-bd68-09fe23395fc6",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T17:56:09.901352Z",
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
        "uk": "Довго чекати авто",
        "en": "The wait is too long",
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/437d8586-4941-403a-9262-4babe204a2d5/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T17:56:10.299843Z",
      "actor": {
        "type": "CLIENT",
        "id": "002b4df6-6483-4b7c-9fb8-284c876b3d36",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "437d8586-4941-403a-9262-4babe204a2d5",
        "quote_id": "2c8e3cd8-1a88-4255-b5c8-ce7108e97b09",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T17:56:10.302357Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "437d8586-4941-403a-9262-4babe204a2d5",
        "attempt_id": "7c2c9adb-d7e5-4e75-b177-4e0a00f19e87",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T17:56:10.30911Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e229b93f-6118-4136-9991-58400ca40499",
        "order_id": "437d8586-4941-403a-9262-4babe204a2d5",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T17:56:10.369932Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "e229b93f-6118-4136-9991-58400ca40499",
        "order_id": "437d8586-4941-403a-9262-4babe204a2d5",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "aa9f7788-17e3-47df-ba57-f9884923ed87"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders cdcbee3d-0980-47fa-bd68-09fe23395fc6, 437d8586-4941-403a-9262-4babe204a2d5.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731868510",
  "device_ref": "sandbox-24033"
}
```

```json
{
  "challenge_id": "ce2284ae-c32e-4e8e-a2da-6a750e952e5f",
  "expires_at": "2026-10-27T18:01:10.70190733Z",
  "resend_available_at": "2026-10-27T17:56:11.70190733Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380731868510` → **200**

```json
{
  "phone": "+380731868510",
  "audience": "CLIENT",
  "code": "131234",
  "sent_at": "2026-10-27T17:56:10.704807724Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce2284ae-c32e-4e8e-a2da-6a750e952e5f",
  "code": "131234",
  "device_ref": "sandbox-24033"
}
```

```json
{
  "session_id": "af026522-c0f9-427c-9222-16faf713f737",
  "subject": {
    "type": "CLIENT",
    "id": "5ba50854-49eb-4697-8435-c2b2e7099911"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YmE1MDg1NC00OWViLTQ2OTctODQzNS1jMmIyZTcwOTk5MTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI0NjcwLCJpYXQiOjE3OTMxMjM3NzAsImp0aSI6IjY4N2JiY2U0LTNiNjYtNGRlNC1iODA5LTk1NDJjZjMzNjI2NCIsInNpZCI6ImFmMDI2NTIyLWMwZjktNDI3Yy05MjIyLTE2ZmFmNzEzZjczNyJ9.gIt4n3GfLNvirdA1TKUYqJZajj6Pu7lwRr3A45WNnAs",
  "access_expires_at": "2026-10-27T18:11:10.76005816Z",
  "refresh_token": "7sIvlnhf8Bt-LOj8sUrUoVmg-Tg3MWad8kovdE-H_O0",
  "refresh_expires_at": "2026-11-26T17:56:10.759359544Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "17927c29-84e6-4e2b-87c1-44925fdee682",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "e42678f5-dd05-4145-8333-9504fb102720",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-e42678f5-dd05-4145-8333-9504fb102720",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "f6eb6f638ef439fbc360122c01355312",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=e42678f5-dd05-4145-8333-9504fb102720",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731868510"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=e42678f5-dd05-4145-8333-9504fb102720",
  "expires_at": "2026-10-27T18:26:10.798212Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/e42678f5-dd05-4145-8333-9504fb102720` → **200**

```json
{
  "id": "e42678f5-dd05-4145-8333-9504fb102720",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T18:26:10.798212Z",
  "card": {
    "id": "d9630252-2d46-498f-89f7-e3dc3deb42a1",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8988",
    "card_type": "Visa",
    "created_at": "2026-10-27T17:56:10.845969Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "d9630252-2d46-498f-89f7-e3dc3deb42a1",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****8988",
      "card_type": "Visa",
      "created_at": "2026-10-27T17:56:10.845969Z"
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
  "device_ref": "sandbox-16357"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "728607a4-177d-40a2-977e-ca12495fde3e",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-16357"
}
```

```json
{
  "challenge_id": "912cdf95-72d5-4468-8d29-38c0d4180734",
  "expires_at": "2026-10-27T18:01:11.968624958Z",
  "resend_available_at": "2026-10-27T17:56:12.968624958Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "990463",
  "sent_at": "2026-10-27T17:56:11.971335327Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "912cdf95-72d5-4468-8d29-38c0d4180734",
  "code": "990463",
  "device_ref": "sandbox-16357"
}
```

```json
{
  "session_id": "236782c3-6d37-4bda-9f22-36850abb6d85",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDY3MiwiaWF0IjoxNzkzMTIzNzcyLCJqdGkiOiI0ZmY4NTRiZC1iNjVhLTQ5NjItYThlNi0yMmUyN2U1ZTg1YzYiLCJzaWQiOiIyMzY3ODJjMy02ZDM3LTRiZGEtOWYyMi0zNjg1MGFiYjZkODUifQ.o0dm_EVzie1FhtOkNOLt3f5IlpZBOXZRNHL9aYm9Ipw",
  "access_expires_at": "2026-10-27T18:11:12.02439342Z",
  "refresh_token": "Zl1J1Ak-4dZ6K5loKube2oM3O_NCFi5bM-kcW-_iwlc",
  "refresh_expires_at": "2026-11-26T17:56:12.023745498Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7b25ff9a-05ff-44c4-90c6-038b169cab45",
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
  "last_heartbeat_at": "2026-10-27T17:56:10.218518Z",
  "last_location_at": "2026-10-27T17:56:10.218518Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7b25ff9a-05ff-44c4-90c6-038b169cab45/handover` → **200**

```json
{
  "command_id": "2091d71b-9ff6-491e-b0c8-0a265742741a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7b25ff9a-05ff-44c4-90c6-038b169cab45",
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
  "last_heartbeat_at": "2026-10-27T17:56:10.218518Z",
  "last_location_at": "2026-10-27T17:56:10.218518Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7b25ff9a-05ff-44c4-90c6-038b169cab45/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:56:12Z",
    "sequence": 1793123772113
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7b25ff9a-05ff-44c4-90c6-038b169cab45",
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
  "last_heartbeat_at": "2026-10-27T17:56:12.133324Z",
  "last_location_at": "2026-10-27T17:56:12.133324Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9ed3f58a-f11a-4a70-9265-9ed08fee55f5",
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
  "id": "3d4dae22-ffe6-406b-b680-2174b4c188a9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T18:01:12.170621Z",
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
  "command_id": "6d0f4299-d135-416d-a00e-d42def5f48be",
  "quote_id": "3d4dae22-ffe6-406b-b680-2174b4c188a9",
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
  "id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5ba50854-49eb-4697-8435-c2b2e7099911",
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
  "created_at": "2026-10-27T17:56:12.212462Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/8e9a8c14-8242-4bcb-8396-66b9a659b871` → **200**

```json
{
  "id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5ba50854-49eb-4697-8435-c2b2e7099911",
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
  "created_at": "2026-10-27T17:56:12.212462Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/8e9a8c14-8242-4bcb-8396-66b9a659b871` → **200**

```json
{
  "id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5ba50854-49eb-4697-8435-c2b2e7099911",
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
  "created_at": "2026-10-27T17:56:12.212462Z",
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
    "id": "7b15976b-fb01-425c-8c75-12b360151cd6",
    "order_id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
    "expires_at": "2026-10-27T17:56:27.977353Z",
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

`POST /api/driver/v1/offers/7b15976b-fb01-425c-8c75-12b360151cd6/accept` → **200**

```json
{
  "command_id": "49729c61-b006-44f9-a453-f756ec87c7fa"
}
```

```json
{
  "id": "17328f43-0a85-4619-9547-4790d8dce07e",
  "order_id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "09442a7b-2d01-415f-9ce2-11940674e010",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "09442a7b-2d01-415f-9ce2-11940674e010",
  "order_id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
  "assignment_id": "17328f43-0a85-4619-9547-4790d8dce07e",
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

`POST /api/driver/v1/work-sessions/7b25ff9a-05ff-44c4-90c6-038b169cab45/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:56:13Z",
    "sequence": 1793123773382
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7b25ff9a-05ff-44c4-90c6-038b169cab45",
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
  "last_heartbeat_at": "2026-10-27T17:56:13.401788Z",
  "last_location_at": "2026-10-27T17:56:13.401788Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/09442a7b-2d01-415f-9ce2-11940674e010/arrive` → **200**

```json
{
  "command_id": "c458e63d-dc65-472d-9368-1ffcebec8520",
  "expected_version": 0
}
```

```json
{
  "id": "09442a7b-2d01-415f-9ce2-11940674e010",
  "order_id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
  "assignment_id": "17328f43-0a85-4619-9547-4790d8dce07e",
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
  "arrived_at": "2026-10-27T17:56:13.439078Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/09442a7b-2d01-415f-9ce2-11940674e010/start` → **200**

```json
{
  "command_id": "5de6747a-8543-417c-b0a6-7eef4a772351",
  "expected_version": 1
}
```

```json
{
  "id": "09442a7b-2d01-415f-9ce2-11940674e010",
  "order_id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
  "assignment_id": "17328f43-0a85-4619-9547-4790d8dce07e",
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
  "arrived_at": "2026-10-27T17:56:13.439078Z",
  "started_at": "2026-10-27T17:56:13.480801Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/09442a7b-2d01-415f-9ce2-11940674e010/complete` → **200**

```json
{
  "command_id": "3e40bcba-61e6-4772-99f2-f2c9b951d9df",
  "expected_version": 2,
  "reported_at": "2026-10-27T17:56:13Z"
}
```

```json
{
  "id": "09442a7b-2d01-415f-9ce2-11940674e010",
  "order_id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
  "assignment_id": "17328f43-0a85-4619-9547-4790d8dce07e",
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
  "arrived_at": "2026-10-27T17:56:13.439078Z",
  "started_at": "2026-10-27T17:56:13.480801Z",
  "completed_at": "2026-10-27T17:56:13.527082Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/8e9a8c14-8242-4bcb-8396-66b9a659b871` → **200**

```json
{
  "id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "5ba50854-49eb-4697-8435-c2b2e7099911",
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
    "id": "17328f43-0a85-4619-9547-4790d8dce07e",
    "order_id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "09442a7b-2d01-415f-9ce2-11940674e010",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T17:56:12.212462Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/8e9a8c14-8242-4bcb-8396-66b9a659b871` → **200**

```json
{
  "id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "5ba50854-49eb-4697-8435-c2b2e7099911",
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
    "id": "17328f43-0a85-4619-9547-4790d8dce07e",
    "order_id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "09442a7b-2d01-415f-9ce2-11940674e010",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T17:56:12.212462Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/8e9a8c14-8242-4bcb-8396-66b9a659b871` → **200**

```json
{
  "id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "5ba50854-49eb-4697-8435-c2b2e7099911",
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
    "id": "17328f43-0a85-4619-9547-4790d8dce07e",
    "order_id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "09442a7b-2d01-415f-9ce2-11940674e010",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T17:56:12.212462Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/8e9a8c14-8242-4bcb-8396-66b9a659b871` → **200**

```json
{
  "id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "5ba50854-49eb-4697-8435-c2b2e7099911",
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
    "id": "17328f43-0a85-4619-9547-4790d8dce07e",
    "order_id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "09442a7b-2d01-415f-9ce2-11940674e010",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T17:56:12.212462Z",
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
      "id": "9a0abffb-2eee-49cc-8768-0c654b87e663",
      "at": "2026-10-27T17:56:14.019314Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/8e9a8c14-8242-4bcb-8396-66b9a659b871/tip` → **200**

```json
{
  "order_id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
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
  "available_until": "2026-10-28T17:56:13.527082Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/8e9a8c14-8242-4bcb-8396-66b9a659b871/tip` → **201**

```json
{
  "command_id": "005ee69d-d897-4d27-9629-c8d010a0cb83",
  "amount_minor": 2500
}
```

```json
{
  "id": "e4e41b16-16d3-485a-b472-a83a3a870015",
  "order_id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-27T17:56:16.773203Z"
}
```

`GET /api/rider/v1/orders/8e9a8c14-8242-4bcb-8396-66b9a659b871/tip` → **200**

```json
{
  "order_id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
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
  "available_until": "2026-10-28T17:56:13.527082Z",
  "open": false,
  "tip": {
    "id": "e4e41b16-16d3-485a-b472-a83a3a870015",
    "order_id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-27T17:56:16.773203Z"
  }
}
```

`GET /api/rider/v1/orders/8e9a8c14-8242-4bcb-8396-66b9a659b871/tip` → **200**

```json
{
  "order_id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
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
  "available_until": "2026-10-28T17:56:13.527082Z",
  "open": false,
  "tip": {
    "id": "e4e41b16-16d3-485a-b472-a83a3a870015",
    "order_id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-27T17:56:16.773203Z"
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
      "id": "9a0abffb-2eee-49cc-8768-0c654b87e663",
      "at": "2026-10-27T17:56:14.019314Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
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
      "id": "1a63e6e2-11dd-42a4-8edb-2d85a37857b1",
      "at": "2026-10-27T17:56:18.07267Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
      "counterpart_id": null
    },
    {
      "id": "9a0abffb-2eee-49cc-8768-0c654b87e663",
      "at": "2026-10-27T17:56:14.019314Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "8e9a8c14-8242-4bcb-8396-66b9a659b871",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7b25ff9a-05ff-44c4-90c6-038b169cab45",
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
  "last_heartbeat_at": "2026-10-27T17:56:13.401788Z",
  "last_location_at": "2026-10-27T17:56:13.401788Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7b25ff9a-05ff-44c4-90c6-038b169cab45/close` → **200**

```json
{
  "command_id": "cef25e57-a9aa-4be7-b51a-c2186e49e1c1",
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

Done: card order 8e9a8c14-8242-4bcb-8396-66b9a659b871.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380730795220",
  "device_ref": "sandbox-10885"
}
```

```json
{
  "challenge_id": "f2756e0d-7dc8-47ec-9588-251bca4faff4",
  "expires_at": "2026-10-27T18:01:18.988246774Z",
  "resend_available_at": "2026-10-27T17:56:19.988246774Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380730795220` → **200**

```json
{
  "phone": "+380730795220",
  "audience": "CLIENT",
  "code": "931316",
  "sent_at": "2026-10-27T17:56:18.991502481Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f2756e0d-7dc8-47ec-9588-251bca4faff4",
  "code": "931316",
  "device_ref": "sandbox-10885"
}
```

```json
{
  "session_id": "160d08c8-200c-4fdf-80bf-a0c7466d5e8e",
  "subject": {
    "type": "CLIENT",
    "id": "aca25e4e-286e-4f86-b29a-4980319da5fc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhY2EyNWU0ZS0yODZlLTRmODYtYjI5YS00OTgwMzE5ZGE1ZmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI0Njc5LCJpYXQiOjE3OTMxMjM3NzksImp0aSI6ImQxZDRiNjVmLWI5NGMtNDgzNC1iN2M4LTQ0MzhmMTM2MTU3ZSIsInNpZCI6IjE2MGQwOGM4LTIwMGMtNGZkZi04MGJmLWEwYzc0NjZkNWU4ZSJ9.eIaVai7LkuuvmAixfS-X6ySF4YcTAzCjyJkcnYlT0qI",
  "access_expires_at": "2026-10-27T18:11:19.046622555Z",
  "refresh_token": "kZVvE6lYIH1aKj5qp3xle8SPDJcy2kwtZ-q6xG8LhDs",
  "refresh_expires_at": "2026-11-26T17:56:19.045886555Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "ef296d5e-da75-4c51-9ea2-b6849735fa66",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "6949bacd-7b7c-455d-a50e-808986f0043a",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-6949bacd-7b7c-455d-a50e-808986f0043a",
    "orderDate": "1793123779",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "954d86147844aeafe7e8927f2861ea0c",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=6949bacd-7b7c-455d-a50e-808986f0043a",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730795220"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=6949bacd-7b7c-455d-a50e-808986f0043a",
  "created_at": "2026-10-27T17:56:19.084516Z",
  "expires_at": "2026-10-27T18:26:19.084516Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/6949bacd-7b7c-455d-a50e-808986f0043a` → **200**

```json
{
  "id": "6949bacd-7b7c-455d-a50e-808986f0043a",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T17:56:19.084516Z",
  "expires_at": "2026-10-27T18:26:19.084516Z",
  "completed_at": "2026-10-27T17:56:19.125863Z",
  "masked_pan": "41****1480",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "aca25e4e-286e-4f86-b29a-4980319da5fc",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "aca25e4e-286e-4f86-b29a-4980319da5fc",
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
      "id": "da3efccd-967c-4285-9323-c30505983cea",
      "at": "2026-10-27T17:56:20.08838Z",
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
  "client_id": "aca25e4e-286e-4f86-b29a-4980319da5fc",
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
      "id": "da3efccd-967c-4285-9323-c30505983cea",
      "at": "2026-10-27T17:56:20.08838Z",
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
  "device_ref": "sandbox-1457"
}
```

```json
{
  "challenge_id": "11725b6b-f43e-40d6-85af-71d1ae9ed8ff",
  "expires_at": "2026-10-27T18:01:20.260079889Z",
  "resend_available_at": "2026-10-27T17:56:21.260079889Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "627670",
  "sent_at": "2026-10-27T17:56:20.263056224Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "11725b6b-f43e-40d6-85af-71d1ae9ed8ff",
  "code": "627670",
  "device_ref": "sandbox-1457"
}
```

```json
{
  "session_id": "1d9ea448-bdaa-445e-8a40-8950c58b7446",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDY4MCwiaWF0IjoxNzkzMTIzNzgwLCJqdGkiOiI5YWI0MTViNi02ZWI2LTQ4MTQtODY2YS03YjA3ODgxZWM5M2QiLCJzaWQiOiIxZDllYTQ0OC1iZGFhLTQ0NWUtOGE0MC04OTUwYzU4Yjc0NDYifQ.y9Tfuwa5COTSNCYcyjXpoDhD3hIlAsluDo2JYvCfRs4",
  "access_expires_at": "2026-10-27T18:11:20.318133273Z",
  "refresh_token": "MtdmW7oRxBIFO21l5L8zEfG2hQ2kVAZmlry5YxchgeE",
  "refresh_expires_at": "2026-11-26T17:56:20.317488397Z",
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
  "command_id": "7988846a-0018-4538-9757-c43b53c41ab7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "17055444-12d9-4f4c-b691-95c8c7ac653f",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-17055444-12d9-4f4c-b691-95c8c7ac653f",
    "orderDate": "1793123780",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "79106cc31abd9046a6d5e980cf9d2c62",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=17055444-12d9-4f4c-b691-95c8c7ac653f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=17055444-12d9-4f4c-b691-95c8c7ac653f",
  "created_at": "2026-10-27T17:56:20.372908Z",
  "expires_at": "2026-10-27T18:26:20.372908Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/17055444-12d9-4f4c-b691-95c8c7ac653f` → **200**

```json
{
  "id": "17055444-12d9-4f4c-b691-95c8c7ac653f",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T17:56:20.372908Z",
  "expires_at": "2026-10-27T18:26:20.372908Z",
  "completed_at": "2026-10-27T17:56:20.404104Z",
  "masked_pan": "41****4895",
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
      "id": "e7cb9609-143f-4059-b386-15891087ae25",
      "at": "2026-10-27T17:56:21.095633Z",
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
  "command_id": "2bc60704-663b-4de3-be24-e35069e7a1a4",
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
  "correlation_id": "71e000fa-5249-425f-9ab5-d0edf8017d41"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674184312",
  "device_ref": "sandbox-17206"
}
```

```json
{
  "challenge_id": "e0101421-274f-463e-9ef4-1826f4f8163d",
  "expires_at": "2026-10-27T18:01:21.544368095Z",
  "resend_available_at": "2026-10-27T17:56:22.544368095Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674184312` → **200**

```json
{
  "phone": "+380674184312",
  "audience": "CLIENT",
  "code": "117151",
  "sent_at": "2026-10-27T17:56:21.547085238Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e0101421-274f-463e-9ef4-1826f4f8163d",
  "code": "117151",
  "device_ref": "sandbox-17206"
}
```

```json
{
  "session_id": "debab9fc-49f8-474e-863d-706cd5e46ee6",
  "subject": {
    "type": "CLIENT",
    "id": "a3343ca3-263b-4155-8ee8-55dddd7eddd3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzM0M2NhMy0yNjNiLTQxNTUtOGVlOC01NWRkZGQ3ZWRkZDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI0NjgxLCJpYXQiOjE3OTMxMjM3ODEsImp0aSI6IjAzYzEzMzdkLTVlYWQtNDEyMy05ZGRlLWYzNmM1MTZiOGM4YyIsInNpZCI6ImRlYmFiOWZjLTQ5ZjgtNDc0ZS04NjNkLTcwNmNkNWU0NmVlNiJ9.syWaoAG7ztuL-nntpaa2fTZBhbk80dTRoW97NgKPRLA",
  "access_expires_at": "2026-10-27T18:11:21.601603149Z",
  "refresh_token": "qviUzN9M2C_Rv2dZ2xzFXbzDcAdwxSmfB9EkTSNB4nk",
  "refresh_expires_at": "2026-11-26T17:56:21.600973802Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a3343ca3-263b-4155-8ee8-55dddd7eddd3",
  "session_id": "debab9fc-49f8-474e-863d-706cd5e46ee6",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f38aaf3a-5436-48e7-80ca-743de97bc41c",
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
  "id": "5ea2a98d-baee-44be-a4ec-c4d088a7b444",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T18:01:21.662333Z",
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
  "challenge_id": "5cf9f89e-256d-4cc3-9a98-d62e2b9c6de7",
  "expires_at": "2026-10-27T18:01:23.700418767Z",
  "resend_available_at": "2026-10-27T17:56:24.700418767Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674184312` → **200**

```json
{
  "phone": "+380674184312",
  "audience": "CLIENT",
  "code": "976515",
  "sent_at": "2026-10-27T17:56:23.702980347Z"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "8a92979f-259b-4374-8980-bd3b26ec2e61",
  "challenge_id": "5cf9f89e-256d-4cc3-9a98-d62e2b9c6de7",
  "otp_code": "976515"
}
```

```json
{
  "client_id": "a3343ca3-263b-4155-8ee8-55dddd7eddd3",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-27T17:56:23.769207664Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "05125523-4a4d-410a-b5a1-c5cbd19fe592",
  "quote_id": "5ea2a98d-baee-44be-a4ec-c4d088a7b444",
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
  "correlation_id": "83681685-e6bd-4339-905b-89665418c9e4"
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
  "session_id": "5e25eb67-dba4-4ad0-ad83-89b319ee6f2e",
  "subject": {
    "type": "STAFF",
    "id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWZhODRhMi01MjYxLTQxYTktYjczZS05ZDA0NzU3YjlmOGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQ2ODQsImlhdCI6MTc5MzEyMzc4NCwianRpIjoiMGQwYjIxMDUtNGY5NS00ZGZkLThlYTgtNTYzNWFiZWRiN2E2Iiwic2lkIjoiNWUyNWViNjctZGJhNC00YWQwLWFkODMtODliMzE5ZWU2ZjJlIn0.S25Bjgth2Mjy7So9uXwYXSpsVvgJjP9laTI6IvlJzaE",
  "access_expires_at": "2026-10-27T18:11:24.133545288Z",
  "refresh_token": "hkbl2cB9gUoXFlYq5P5uOiLtnwj9WLtrexEXvhWKBjY",
  "refresh_expires_at": "2026-10-28T05:56:24.13285164Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "a3343ca3-263b-4155-8ee8-55dddd7eddd3",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-27T17:56:23.769208Z",
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

`POST /api/admin/v1/client-deletions/a3343ca3-263b-4155-8ee8-55dddd7eddd3/complete` → **200**

```json
{
  "command_id": "b5573d71-5bff-48fe-8f0c-9cfe08b737ef",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "a3343ca3-263b-4155-8ee8-55dddd7eddd3",
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
  "correlation_id": "8c226691-6958-40fd-bdf1-e3b66c351608"
}
```

Done: client a3343ca3-263b-4155-8ee8-55dddd7eddd3 anonymized.

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
  "device_ref": "sandbox-23230"
}
```

```json
{
  "challenge_id": "fb4a76b6-31d1-4dc7-965f-813505df977c",
  "expires_at": "2026-10-27T18:01:24.329003787Z",
  "resend_available_at": "2026-10-27T17:56:25.329003787Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "808968",
  "sent_at": "2026-10-27T17:56:24.333373189Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fb4a76b6-31d1-4dc7-965f-813505df977c",
  "code": "808968",
  "device_ref": "sandbox-23230"
}
```

```json
{
  "session_id": "8a3959a1-3866-4e4d-85e4-5fb5a3f48d70",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDY4NCwiaWF0IjoxNzkzMTIzNzg0LCJqdGkiOiI0MjRhYzg2YS1iZTg1LTQxZjctYTFkOS0zN2Y5MWIxMjNkNmUiLCJzaWQiOiI4YTM5NTlhMS0zODY2LTRlNGQtODVlNC01ZmI1YTNmNDhkNzAifQ.GyR-UxMICpXF8bYX0mULMhXqo1-uGFxDc-iGaPF2F7s",
  "access_expires_at": "2026-10-27T18:11:24.393343237Z",
  "refresh_token": "X42FQws0H2fdlbJoMD2EYGqbZC4nyI-XXkE-QdN976I",
  "refresh_expires_at": "2026-11-26T17:56:24.392644868Z",
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
  "command_id": "dca45c10-0d53-4f19-95fb-b9687a9567e5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:56:24Z",
    "sequence": 1793123784446
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2e7b5035-22a0-4916-b398-af90bd8bd452",
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
  "last_heartbeat_at": "2026-10-27T17:56:24.463923Z",
  "last_location_at": "2026-10-27T17:56:24.463923Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674684146",
  "device_ref": "sandbox-22028"
}
```

```json
{
  "challenge_id": "18eea078-12d0-49dc-b03b-6017b27fb373",
  "expires_at": "2026-10-27T18:01:24.498160842Z",
  "resend_available_at": "2026-10-27T17:56:25.498160842Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674684146` → **200**

```json
{
  "phone": "+380674684146",
  "audience": "CLIENT",
  "code": "796102",
  "sent_at": "2026-10-27T17:56:24.500601513Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "18eea078-12d0-49dc-b03b-6017b27fb373",
  "code": "796102",
  "device_ref": "sandbox-22028"
}
```

```json
{
  "session_id": "51944bc3-078b-44f8-ac83-76ddcb907d09",
  "subject": {
    "type": "CLIENT",
    "id": "b79daf48-8008-40b5-a784-fc3e10fa1d80"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzlkYWY0OC04MDA4LTQwYjUtYTc4NC1mYzNlMTBmYTFkODAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI0Njg0LCJpYXQiOjE3OTMxMjM3ODQsImp0aSI6ImY2OWEyZjAzLTI3YTItNDljNi1hYTg5LWRmNWM5NmFlMGI3ZiIsInNpZCI6IjUxOTQ0YmMzLTA3OGItNDRmOC1hYzgzLTc2ZGRjYjkwN2QwOSJ9.ObdyOaMMOpRSjm4IZZfmDFNvpqE5muhf0w7lF2R5Bxw",
  "access_expires_at": "2026-10-27T18:11:24.55380875Z",
  "refresh_token": "TMfJZ9-MaitNr1UJEjRq6dcDVkIahWSxKzObbBeLQfM",
  "refresh_expires_at": "2026-11-26T17:56:24.553090858Z",
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
  "command_id": "146bc1aa-221c-4779-b0ce-48029cc00b35",
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
  "id": "0bdeaf84-f249-417d-8d55-3d61eb17fc11",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T18:01:24.614995Z",
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
  "command_id": "6f5720b0-5b99-462e-a79d-cbaa6534a554",
  "platform": "ANDROID",
  "token": "sandbox-driver-b3cb0044-d39e-4eb2-be2c-1177765aefc1"
}
```

```json
{
  "id": "a474e6f5-0bcd-4161-a7fc-c5a14e300a34",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T17:56:24.659721Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "75f96f47-2c4a-469c-af27-f7d2d2654fb6",
  "platform": "ANDROID",
  "token": "sandbox-rider-69cb0a01-8df3-46ca-91cd-cbb60f4b7ab3"
}
```

```json
{
  "id": "5f935cd4-9ef0-47b3-9bde-cf98e571f7c5",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T17:56:24.694931Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "964bce8a-5fa1-4e99-95b7-d52aca1f0250",
  "quote_id": "0bdeaf84-f249-417d-8d55-3d61eb17fc11",
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
  "id": "9947ebb7-4717-4b45-b1a4-6f308f76ecfc",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b79daf48-8008-40b5-a784-fc3e10fa1d80",
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
  "created_at": "2026-10-27T17:56:24.7388Z",
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
    "id": "ef35d04e-252e-4b82-b062-4bac8828eac4",
    "order_id": "9947ebb7-4717-4b45-b1a4-6f308f76ecfc",
    "expires_at": "2026-10-27T17:56:39.742917Z",
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

`POST /api/driver/v1/offers/ef35d04e-252e-4b82-b062-4bac8828eac4/accept` → **200**

```json
{
  "command_id": "f5ac96dc-64bc-4164-9f43-16956579448b"
}
```

```json
{
  "id": "59ee5b0d-2bb9-400a-aa6c-57d42f6f4223",
  "order_id": "9947ebb7-4717-4b45-b1a4-6f308f76ecfc",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0c2a3795-f0ec-46a1-be32-fbb3f8eb9873",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T17:56:24.713Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T17:56:24.713Z` → **200**

```json
[
  {
    "at": "2026-10-27T17:56:25.823655305Z",
    "token_suffix": "5aefc1",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "9947ebb7-4717-4b45-b1a4-6f308f76ecfc",
      "order_version": "2",
      "event_id": "d79988c6-084b-4f0d-ac30-34f43feff4a7"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380674684146&after=2026-10-27T17:56:24.713Z` → **200**

```json
[
  {
    "at": "2026-10-27T17:56:25.825287134Z",
    "token_suffix": "4b7ab3",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "9947ebb7-4717-4b45-b1a4-6f308f76ecfc",
      "order_version": "3",
      "event_id": "a423e80e-c4c6-44b3-b385-e9af0ed24036"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/9947ebb7-4717-4b45-b1a4-6f308f76ecfc/messages` → **201**

```json
{
  "command_id": "8f29db3b-139a-4d3b-86cc-18f3c82b525e",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "d83fd4d3-a5bc-40ab-a0b0-09eda2015e0e",
  "order_id": "9947ebb7-4717-4b45-b1a4-6f308f76ecfc",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T17:56:25.935975492Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0c2a3795-f0ec-46a1-be32-fbb3f8eb9873",
  "order_id": "9947ebb7-4717-4b45-b1a4-6f308f76ecfc",
  "assignment_id": "59ee5b0d-2bb9-400a-aa6c-57d42f6f4223",
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

`POST /api/driver/v1/trips/0c2a3795-f0ec-46a1-be32-fbb3f8eb9873/messages` → **201**

```json
{
  "command_id": "4fc3b67e-4e5b-4bfb-8f6d-f9609e8df05f",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "64a133c2-8e5d-473e-8fe9-2f166c1fceca",
  "order_id": "9947ebb7-4717-4b45-b1a4-6f308f76ecfc",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T17:56:25.988230968Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/9947ebb7-4717-4b45-b1a4-6f308f76ecfc/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/0c2a3795-f0ec-46a1-be32-fbb3f8eb9873/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674684146"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/2e7b5035-22a0-4916-b398-af90bd8bd452/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:56:26Z",
    "sequence": 1793123786651
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2e7b5035-22a0-4916-b398-af90bd8bd452",
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
  "last_heartbeat_at": "2026-10-27T17:56:26.083921Z",
  "last_location_at": "2026-10-27T17:56:26.083921Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0c2a3795-f0ec-46a1-be32-fbb3f8eb9873",
  "order_id": "9947ebb7-4717-4b45-b1a4-6f308f76ecfc",
  "assignment_id": "59ee5b0d-2bb9-400a-aa6c-57d42f6f4223",
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

`POST /api/driver/v1/trips/0c2a3795-f0ec-46a1-be32-fbb3f8eb9873/arrive` → **200**

```json
{
  "command_id": "4deb793b-c3aa-4d12-bf7d-4da8a0bac975",
  "expected_version": 0
}
```

```json
{
  "id": "0c2a3795-f0ec-46a1-be32-fbb3f8eb9873",
  "order_id": "9947ebb7-4717-4b45-b1a4-6f308f76ecfc",
  "assignment_id": "59ee5b0d-2bb9-400a-aa6c-57d42f6f4223",
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
  "arrived_at": "2026-10-27T17:56:26.135835Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0c2a3795-f0ec-46a1-be32-fbb3f8eb9873/start` → **200**

```json
{
  "command_id": "7bb01467-b7ec-4c6d-af71-87e6180b233b",
  "expected_version": 1
}
```

```json
{
  "id": "0c2a3795-f0ec-46a1-be32-fbb3f8eb9873",
  "order_id": "9947ebb7-4717-4b45-b1a4-6f308f76ecfc",
  "assignment_id": "59ee5b0d-2bb9-400a-aa6c-57d42f6f4223",
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
  "arrived_at": "2026-10-27T17:56:26.135835Z",
  "started_at": "2026-10-27T17:56:26.170105Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/2e7b5035-22a0-4916-b398-af90bd8bd452/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:56:26Z",
    "sequence": 1793123786652
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2e7b5035-22a0-4916-b398-af90bd8bd452",
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
  "last_heartbeat_at": "2026-10-27T17:56:26.21223Z",
  "last_location_at": "2026-10-27T17:56:26.21223Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/0c2a3795-f0ec-46a1-be32-fbb3f8eb9873/complete` → **200**

```json
{
  "command_id": "93aca381-cd35-4022-89ce-ef0eb6521f63",
  "expected_version": 2,
  "reported_at": "2026-10-27T17:56:26Z",
  "cash_received": true
}
```

```json
{
  "id": "0c2a3795-f0ec-46a1-be32-fbb3f8eb9873",
  "order_id": "9947ebb7-4717-4b45-b1a4-6f308f76ecfc",
  "assignment_id": "59ee5b0d-2bb9-400a-aa6c-57d42f6f4223",
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
  "arrived_at": "2026-10-27T17:56:26.135835Z",
  "started_at": "2026-10-27T17:56:26.170105Z",
  "completed_at": "2026-10-27T17:56:26.248042Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/9947ebb7-4717-4b45-b1a4-6f308f76ecfc` → **200**

```json
{
  "id": "9947ebb7-4717-4b45-b1a4-6f308f76ecfc",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "b79daf48-8008-40b5-a784-fc3e10fa1d80",
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
    "id": "59ee5b0d-2bb9-400a-aa6c-57d42f6f4223",
    "order_id": "9947ebb7-4717-4b45-b1a4-6f308f76ecfc",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0c2a3795-f0ec-46a1-be32-fbb3f8eb9873",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T17:56:24.7388Z",
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
    "id": "9947ebb7-4717-4b45-b1a4-6f308f76ecfc",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-27T17:56:24.7388Z",
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
    "id": "0c2a3795-f0ec-46a1-be32-fbb3f8eb9873",
    "order_id": "9947ebb7-4717-4b45-b1a4-6f308f76ecfc",
    "order_short_number": 5,
    "created_at": "2026-10-27T17:56:24.811244Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "4967cf4a-ab8d-40d3-a323-5ab0965580ae",
    "order_id": "0185cbb9-3feb-4247-afcf-ef1b57588cee",
    "order_short_number": 1,
    "created_at": "2026-10-27T17:56:05.489572Z",
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

`GET /api/driver/v1/earnings?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-27&to=2026-10-27` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-27",
  "to": "2026-10-27",
  "days": [
    {
      "date": "2026-10-27",
      "figures": {
        "trips": 2,
        "fare_minor": 21034,
        "commission_minor": 3156,
        "driver_share_minor": 17878,
        "cash_minor": 17982,
        "cashless_minor": 3052,
        "tips_minor": 0,
        "bonuses_minor": 0,
        "top_ups_minor": 0,
        "transfers_in_minor": 0,
        "transfers_out_minor": 0,
        "adjustments_minor": 0,
        "net_minor": -104
      }
    }
  ],
  "total": {
    "trips": 2,
    "fare_minor": 21034,
    "commission_minor": 3156,
    "driver_share_minor": 17878,
    "cash_minor": 17982,
    "cashless_minor": 3052,
    "tips_minor": 0,
    "bonuses_minor": 0,
    "top_ups_minor": 0,
    "transfers_in_minor": 0,
    "transfers_out_minor": 0,
    "adjustments_minor": 0,
    "net_minor": -104
  },
  "balance_minor": -104
}
```

## The rider leaves a 10 % tip in cash: it is only recorded

`GET /api/rider/v1/orders/9947ebb7-4717-4b45-b1a4-6f308f76ecfc/tip` → **200**

```json
{
  "order_id": "9947ebb7-4717-4b45-b1a4-6f308f76ecfc",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
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
  "available_until": "2026-10-28T17:56:26.248042Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/9947ebb7-4717-4b45-b1a4-6f308f76ecfc/tip` → **201**

```json
{
  "command_id": "7cbddc20-f3af-4f3a-87cc-494e99d9575d",
  "amount_minor": 1100
}
```

```json
{
  "id": "069cd252-1f59-404c-9994-061b91c41a78",
  "order_id": "9947ebb7-4717-4b45-b1a4-6f308f76ecfc",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-27T17:56:29.453463Z"
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
  "session_id": "c97ca015-0a7b-4c9b-b2f9-1d06d20139d2",
  "subject": {
    "type": "STAFF",
    "id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWZhODRhMi01MjYxLTQxYTktYjczZS05ZDA0NzU3YjlmOGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQ2ODksImlhdCI6MTc5MzEyMzc4OSwianRpIjoiYjVjYTNlM2UtZmU2OS00Y2ZiLTljZDgtN2RjYWVhOGVhODliIiwic2lkIjoiYzk3Y2EwMTUtMGE3Yi00YzliLWIyZjktMWQwNmQyMDEzOWQyIn0.KioDjuWaJhyDM8ociHNFd4Q63E3X-B8EWTe2aZOxoa8",
  "access_expires_at": "2026-10-27T18:11:29.781931412Z",
  "refresh_token": "_cZyhEMGXjRsET_0Wg3vMaiKqYlHch6GUtUxS5JyR8k",
  "refresh_expires_at": "2026-10-28T05:56:29.78129391Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/reports/orders?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-27&to=2026-10-27` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-27",
  "to": "2026-10-27",
  "days": [
    {
      "date": "2026-10-27",
      "counts": {
        "created": 5,
        "fulfilled": 3,
        "cancelled": 2,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "APP": 5
        },
        "by_payment": {
          "CASH": 4,
          "CARD": 1
        },
        "cancelled_by": {
          "DRIVER": 1,
          "RIDER": 1
        }
      }
    }
  ],
  "total": {
    "created": 5,
    "fulfilled": 3,
    "cancelled": 2,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "APP": 5
    },
    "by_payment": {
      "CASH": 4,
      "CARD": 1
    },
    "cancelled_by": {
      "DRIVER": 1,
      "RIDER": 1
    }
  },
  "cancellation_reasons": [
    {
      "cancelled_by": "DRIVER",
      "code": "PASSENGER_ASKED",
      "count": 1
    },
    {
      "cancelled_by": "RIDER",
      "code": "WAIT_TOO_LONG",
      "count": 1
    }
  ]
}
```

`GET /api/admin/v1/reports/finance?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-27&to=2026-10-27` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-27",
  "to": "2026-10-27",
  "days": [
    {
      "date": "2026-10-27",
      "figures": {
        "trips": 3,
        "fares_minor": 37331,
        "service_rides_minor": 0,
        "commission_minor": 5601,
        "driver_share_minor": 31730,
        "discounts_minor": 1052,
        "bonuses_granted_minor": 0,
        "paid_by_card_minor": 16297,
        "paid_with_bonuses_minor": 2000,
        "collected_by_drivers_minor": 17982,
        "tips_minor": 2500,
        "rider_debt_change_minor": 0
      }
    }
  ],
  "total": {
    "trips": 3,
    "fares_minor": 37331,
    "service_rides_minor": 0,
    "commission_minor": 5601,
    "driver_share_minor": 31730,
    "discounts_minor": 1052,
    "bonuses_granted_minor": 0,
    "paid_by_card_minor": 16297,
    "paid_with_bonuses_minor": 2000,
    "collected_by_drivers_minor": 17982,
    "tips_minor": 2500,
    "rider_debt_change_minor": 0
  }
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
  "session_id": "69172ff4-160c-4e5c-ae31-6e45ebf02e54",
  "subject": {
    "type": "STAFF",
    "id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWZhODRhMi01MjYxLTQxYTktYjczZS05ZDA0NzU3YjlmOGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQ2OTAsImlhdCI6MTc5MzEyMzc5MCwianRpIjoiMDdjMzAyNzAtOWNjYi00MTg5LTlhNjgtNTllZTFmMzM2NTI2Iiwic2lkIjoiNjkxNzJmZjQtMTYwYy00ZTVjLWFlMzEtNmU0NWViZjAyZTU0In0.eZxaj_CUpK1wY-jo3HrEvo7DsU173IWDpGmoGRIYGng",
  "access_expires_at": "2026-10-27T18:11:30.169969908Z",
  "refresh_token": "by6rKRCyWNoFgON-aS6OFxwkuOMFfV6bnRQIATwEQeY",
  "refresh_expires_at": "2026-10-28T05:56:30.169347672Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9947ebb7-4717-4b45-b1a4-6f308f76ecfc/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T17:56:24.739549Z",
      "actor": {
        "type": "CLIENT",
        "id": "b79daf48-8008-40b5-a784-fc3e10fa1d80",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "9947ebb7-4717-4b45-b1a4-6f308f76ecfc",
        "quote_id": "0bdeaf84-f249-417d-8d55-3d61eb17fc11",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T17:56:24.741886Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9947ebb7-4717-4b45-b1a4-6f308f76ecfc",
        "attempt_id": "6dc6bc52-37f0-45b7-ac6f-27a18d0cb48c",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T17:56:24.747867Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ef35d04e-252e-4b82-b062-4bac8828eac4",
        "order_id": "9947ebb7-4717-4b45-b1a4-6f308f76ecfc",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T17:56:24.813753Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "ef35d04e-252e-4b82-b062-4bac8828eac4",
        "order_id": "9947ebb7-4717-4b45-b1a4-6f308f76ecfc",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "59ee5b0d-2bb9-400a-aa6c-57d42f6f4223"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-27T17:56:30.218677513Z",
  "drivers": [
    {
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "name": "Іван Петренко",
      "car": {
        "registration_number": "AA0001TX",
        "make": "Skoda",
        "model": "Octavia",
        "color": "white",
        "classes": [
          "STANDARD",
          "COMFORT"
        ]
      },
      "has_payment_terminal": false,
      "status": "FREE",
      "occupancy": "FREE",
      "connection": "CONNECTED",
      "geolocation": "FRESH",
      "location": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "last_location_at": "2026-10-27T17:56:26.21223Z",
      "order_id": null
    },
    {
      "driver_id": "5a000000-0000-4000-8000-000000000402",
      "name": "Олег Коваль",
      "car": {
        "registration_number": "AA0002TX",
        "make": "Toyota",
        "model": "Corolla",
        "color": "grey",
        "classes": [
          "STANDARD"
        ]
      },
      "has_payment_terminal": false,
      "status": "NO_SIGNAL",
      "occupancy": "FREE",
      "connection": "STALE",
      "geolocation": "STALE",
      "location": {
        "lat": 50.459,
        "lon": 30.5238
      },
      "last_location_at": "2026-10-27T17:56:10.056574Z",
      "order_id": null
    }
  ]
}
```

Done: order 9947ebb7-4717-4b45-b1a4-6f308f76ecfc.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31623"
}
```

```json
{
  "challenge_id": "465d46f0-7a85-47a4-9388-86a1486daef5",
  "expires_at": "2026-10-27T18:01:30.262422374Z",
  "resend_available_at": "2026-10-27T17:56:31.262422374Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "523301",
  "sent_at": "2026-10-27T17:56:30.264997847Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "465d46f0-7a85-47a4-9388-86a1486daef5",
  "code": "523301",
  "device_ref": "sandbox-31623"
}
```

```json
{
  "session_id": "80d91537-bb1b-478f-9ef7-a83746f4404a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDY5MCwiaWF0IjoxNzkzMTIzNzkwLCJqdGkiOiI4YTA2N2U5OC1kOTQxLTQ3ZjctYmNhNy00OGNlY2I4M2E2OTUiLCJzaWQiOiI4MGQ5MTUzNy1iYjFiLTQ3OGYtOWVmNy1hODM3NDZmNDQwNGEifQ.zgz3HdY0rKMomimtu8j5HLv1PzLJDmTyRSjdgx5MfGs",
  "access_expires_at": "2026-10-27T18:11:30.323478033Z",
  "refresh_token": "yK__4_Vj1Lg1SQ1PCUkMIEDtx02v_hD-FbOoVz7nzus",
  "refresh_expires_at": "2026-11-26T17:56:30.322793239Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2e7b5035-22a0-4916-b398-af90bd8bd452",
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
  "last_heartbeat_at": "2026-10-27T17:56:26.21223Z",
  "last_location_at": "2026-10-27T17:56:26.21223Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2e7b5035-22a0-4916-b398-af90bd8bd452/handover` → **200**

```json
{
  "command_id": "f89bd5fd-1ec6-4117-beda-e9182f41f972",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2e7b5035-22a0-4916-b398-af90bd8bd452",
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
  "last_heartbeat_at": "2026-10-27T17:56:26.21223Z",
  "last_location_at": "2026-10-27T17:56:26.21223Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2e7b5035-22a0-4916-b398-af90bd8bd452/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:56:30Z",
    "sequence": 1793123790414
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2e7b5035-22a0-4916-b398-af90bd8bd452",
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
  "last_heartbeat_at": "2026-10-27T17:56:30.433759Z",
  "last_location_at": "2026-10-27T17:56:30.433759Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666709478",
  "device_ref": "sandbox-24054"
}
```

```json
{
  "challenge_id": "8c9539b8-7eb8-444e-a5a1-bb46aff3eb65",
  "expires_at": "2026-10-27T18:01:30.460388431Z",
  "resend_available_at": "2026-10-27T17:56:31.460388431Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666709478` → **200**

```json
{
  "phone": "+380666709478",
  "audience": "CLIENT",
  "code": "457977",
  "sent_at": "2026-10-27T17:56:30.462786249Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8c9539b8-7eb8-444e-a5a1-bb46aff3eb65",
  "code": "457977",
  "device_ref": "sandbox-24054"
}
```

```json
{
  "session_id": "5e230e01-3612-493e-bb34-a1b407ea4a26",
  "subject": {
    "type": "CLIENT",
    "id": "b66ab911-77f3-4c1c-9131-7be681dd5657"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNjZhYjkxMS03N2YzLTRjMWMtOTEzMS03YmU2ODFkZDU2NTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI0NjkwLCJpYXQiOjE3OTMxMjM3OTAsImp0aSI6ImU5NzFhMzg5LTRlNWQtNDZkMC1hNGYxLTM0NmIzY2MwZjNiZSIsInNpZCI6IjVlMjMwZTAxLTM2MTItNDkzZS1iYjM0LWExYjQwN2VhNGEyNiJ9.5ZO2EokL7qxE3SHNlA8SA0rlxLyRk4gBl2tuoB2GM1A",
  "access_expires_at": "2026-10-27T18:11:30.516105813Z",
  "refresh_token": "2JaWPm0hg82EsO3gCI4OaeQWK6IVpQEZxfNlkaashsY",
  "refresh_expires_at": "2026-11-26T17:56:30.515368354Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "10119412-27fe-473d-8d93-fe3ac31a61b9",
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
  "id": "7a5cc48c-9834-4e84-a767-9bbe571e89b6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T18:01:30.551069Z",
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
  "command_id": "5bcad094-cd8d-442c-9110-28a9dc7c939f",
  "quote_id": "7a5cc48c-9834-4e84-a767-9bbe571e89b6",
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
  "id": "7212ac35-096e-4aae-b258-8beb53b54c82",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b66ab911-77f3-4c1c-9131-7be681dd5657",
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
  "created_at": "2026-10-27T17:56:30.588261Z",
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
    "id": "3cc06bdd-4c1f-4bf0-a176-66bae2d620f0",
    "order_id": "7212ac35-096e-4aae-b258-8beb53b54c82",
    "expires_at": "2026-10-27T17:56:45.591955Z",
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

`POST /api/driver/v1/offers/3cc06bdd-4c1f-4bf0-a176-66bae2d620f0/accept` → **200**

```json
{
  "command_id": "69b7bc9b-b1ed-46ad-841e-6b2ed69ea254"
}
```

```json
{
  "id": "ffabdd0a-a48b-4f62-af6e-329a8806c6e9",
  "order_id": "7212ac35-096e-4aae-b258-8beb53b54c82",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7d5b00ec-b38f-4d5b-ad07-943e1f351cbd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7d5b00ec-b38f-4d5b-ad07-943e1f351cbd",
  "order_id": "7212ac35-096e-4aae-b258-8beb53b54c82",
  "assignment_id": "ffabdd0a-a48b-4f62-af6e-329a8806c6e9",
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

`POST /api/driver/v1/work-sessions/2e7b5035-22a0-4916-b398-af90bd8bd452/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:56:30Z",
    "sequence": 1793123790698
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2e7b5035-22a0-4916-b398-af90bd8bd452",
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
  "last_heartbeat_at": "2026-10-27T17:56:30.717612Z",
  "last_location_at": "2026-10-27T17:56:30.717612Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7d5b00ec-b38f-4d5b-ad07-943e1f351cbd/arrive` → **200**

```json
{
  "command_id": "c7f66b3a-7b0c-43e1-9481-87eedb55205f",
  "expected_version": 0
}
```

```json
{
  "id": "7d5b00ec-b38f-4d5b-ad07-943e1f351cbd",
  "order_id": "7212ac35-096e-4aae-b258-8beb53b54c82",
  "assignment_id": "ffabdd0a-a48b-4f62-af6e-329a8806c6e9",
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
  "arrived_at": "2026-10-27T17:56:30.755036Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7d5b00ec-b38f-4d5b-ad07-943e1f351cbd/start` → **200**

```json
{
  "command_id": "1acfeecc-d5d2-4db7-9eb6-10e57d02c73a",
  "expected_version": 1
}
```

```json
{
  "id": "7d5b00ec-b38f-4d5b-ad07-943e1f351cbd",
  "order_id": "7212ac35-096e-4aae-b258-8beb53b54c82",
  "assignment_id": "ffabdd0a-a48b-4f62-af6e-329a8806c6e9",
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
  "arrived_at": "2026-10-27T17:56:30.755036Z",
  "started_at": "2026-10-27T17:56:30.795985Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/2e7b5035-22a0-4916-b398-af90bd8bd452/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:56:30Z",
    "sequence": 1793123790823
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2e7b5035-22a0-4916-b398-af90bd8bd452",
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
  "last_heartbeat_at": "2026-10-27T17:56:30.841501Z",
  "last_location_at": "2026-10-27T17:56:30.841501Z",
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
  "device_ref": "sandbox-32091"
}
```

```json
{
  "challenge_id": "1d9fdbc9-9b94-40b1-be85-0a3b508762bd",
  "expires_at": "2026-10-27T18:01:30.865735572Z",
  "resend_available_at": "2026-10-27T17:56:31.865735572Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "226667",
  "sent_at": "2026-10-27T17:56:30.868464536Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1d9fdbc9-9b94-40b1-be85-0a3b508762bd",
  "code": "226667",
  "device_ref": "sandbox-32091"
}
```

```json
{
  "session_id": "b75dcc22-e4cb-4789-99d0-7ca8ef63fdc5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDY5MCwiaWF0IjoxNzkzMTIzNzkwLCJqdGkiOiIyMDg5ZTg4My01MDhkLTRhMzQtODFkNC00Y2RhMDI1YjA4OWQiLCJzaWQiOiJiNzVkY2MyMi1lNGNiLTQ3ODktOTlkMC03Y2E4ZWY2M2ZkYzUifQ.axnW51Im31kueLDARKeW6DMS6XZvAfXfaVUOWTg2Z1g",
  "access_expires_at": "2026-10-27T18:11:30.922579126Z",
  "refresh_token": "gjqIFWHL135h5RfVU0XMjwHFLVA9ZIl9XX6NSYJfmck",
  "refresh_expires_at": "2026-11-26T17:56:30.92198741Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "73c26bfd-592c-460b-b8f4-736a66981f9b",
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
  "last_heartbeat_at": "2026-10-27T17:56:10.056574Z",
  "last_location_at": "2026-10-27T17:56:10.056574Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/73c26bfd-592c-460b-b8f4-736a66981f9b/handover` → **200**

```json
{
  "command_id": "22c5c198-7ac4-457a-856d-8c6f8322df09",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "73c26bfd-592c-460b-b8f4-736a66981f9b",
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
  "last_heartbeat_at": "2026-10-27T17:56:10.056574Z",
  "last_location_at": "2026-10-27T17:56:10.056574Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/73c26bfd-592c-460b-b8f4-736a66981f9b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:56:31Z",
    "sequence": 1793123791792
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "73c26bfd-592c-460b-b8f4-736a66981f9b",
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
  "last_heartbeat_at": "2026-10-27T17:56:31.026728Z",
  "last_location_at": "2026-10-27T17:56:31.026728Z",
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
  "session_id": "7d899d0f-1c27-4562-aa68-c3d3ce21540f",
  "subject": {
    "type": "STAFF",
    "id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWZhODRhMi01MjYxLTQxYTktYjczZS05ZDA0NzU3YjlmOGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQ2OTEsImlhdCI6MTc5MzEyMzc5MSwianRpIjoiMTQ3Mjg3ZmUtYzk2Ny00NDdkLWFlOTUtNGJlOWI3NmRkYzczIiwic2lkIjoiN2Q4OTlkMGYtMWMyNy00NTYyLWFhNjgtYzNkM2NlMjE1NDBmIn0.g7HcwSlOvLTKM4_Iec9xIVBKnVc5EIptuR8BMik7kyQ",
  "access_expires_at": "2026-10-27T18:11:31.351372453Z",
  "refresh_token": "BMDqxab3Xf0Ji-8zSVU-DtN-nbmTph3AsOFtTiS6hgA",
  "refresh_expires_at": "2026-10-28T05:56:31.350798199Z",
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
  "session_id": "bac2b739-07a8-42c9-bc8c-8adca7363485",
  "subject": {
    "type": "STAFF",
    "id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWZhODRhMi01MjYxLTQxYTktYjczZS05ZDA0NzU3YjlmOGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQ2OTEsImlhdCI6MTc5MzEyMzc5MSwianRpIjoiZjBlNTAxZTgtMzBkOS00YzQxLWEwYTgtNGY3Y2FmZmE2YmM3Iiwic2lkIjoiYmFjMmI3MzktMDdhOC00MmM5LWJjOGMtOGFkY2E3MzYzNDg1In0.bPzrese-VkfGsA8L_OXnSfSXAEJjuwJ8IWzw2DWHBHk",
  "access_expires_at": "2026-10-27T18:11:31.671974837Z",
  "refresh_token": "ooCL_dGNq-E2HvbAtfWhvuJ0mOFbhBylf7zCjk2v7-o",
  "refresh_expires_at": "2026-10-28T05:56:31.671304062Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/7212ac35-096e-4aae-b258-8beb53b54c82` → **200**

```json
{
  "id": "7212ac35-096e-4aae-b258-8beb53b54c82",
  "short_number": 6,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "b66ab911-77f3-4c1c-9131-7be681dd5657",
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
    "id": "ffabdd0a-a48b-4f62-af6e-329a8806c6e9",
    "order_id": "7212ac35-096e-4aae-b258-8beb53b54c82",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "7d5b00ec-b38f-4d5b-ad07-943e1f351cbd",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T17:56:30.588261Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7212ac35-096e-4aae-b258-8beb53b54c82/interrupt` → **200**

```json
{
  "command_id": "e1c7cb71-046e-4082-beed-a43609631206",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "7212ac35-096e-4aae-b258-8beb53b54c82",
    "short_number": 6,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "b66ab911-77f3-4c1c-9131-7be681dd5657",
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
      "id": "ffabdd0a-a48b-4f62-af6e-329a8806c6e9",
      "order_id": "7212ac35-096e-4aae-b258-8beb53b54c82",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "7d5b00ec-b38f-4d5b-ad07-943e1f351cbd",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T17:56:30.588261Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "51cd35f1-d01c-47e4-82b4-986c7b051d9e",
    "short_number": 7,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "b66ab911-77f3-4c1c-9131-7be681dd5657",
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
    "id": "15835278-7897-4982-a51f-b313eabc3d2b",
    "order_id": "51cd35f1-d01c-47e4-82b4-986c7b051d9e",
    "expires_at": "2026-10-27T17:56:46.760744Z",
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

`POST /api/driver/v1/offers/15835278-7897-4982-a51f-b313eabc3d2b/accept` → **200**

```json
{
  "command_id": "b882d14d-3c1b-4f4d-8268-9281357586d7"
}
```

```json
{
  "id": "dcfc0fce-102d-4a77-bdb6-5881e2ffac42",
  "order_id": "51cd35f1-d01c-47e4-82b4-986c7b051d9e",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "feefae7c-774c-4080-9b03-f2ad42b35ec0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "feefae7c-774c-4080-9b03-f2ad42b35ec0",
  "order_id": "51cd35f1-d01c-47e4-82b4-986c7b051d9e",
  "assignment_id": "dcfc0fce-102d-4a77-bdb6-5881e2ffac42",
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
  "session_id": "73c26bfd-592c-460b-b8f4-736a66981f9b",
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
  "last_heartbeat_at": "2026-10-27T17:56:31.026728Z",
  "last_location_at": "2026-10-27T17:56:31.026728Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/73c26bfd-592c-460b-b8f4-736a66981f9b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:56:31Z",
    "sequence": 1793123791892
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "73c26bfd-592c-460b-b8f4-736a66981f9b",
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
  "last_heartbeat_at": "2026-10-27T17:56:31.910642Z",
  "last_location_at": "2026-10-27T17:56:31.910642Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/feefae7c-774c-4080-9b03-f2ad42b35ec0/arrive` → **200**

```json
{
  "command_id": "c01ffaea-88b7-4959-a8e4-030fffa9794d",
  "expected_version": 0
}
```

```json
{
  "id": "feefae7c-774c-4080-9b03-f2ad42b35ec0",
  "order_id": "51cd35f1-d01c-47e4-82b4-986c7b051d9e",
  "assignment_id": "dcfc0fce-102d-4a77-bdb6-5881e2ffac42",
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
  "arrived_at": "2026-10-27T17:56:31.947489Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/feefae7c-774c-4080-9b03-f2ad42b35ec0/start` → **200**

```json
{
  "command_id": "0ad1e270-ddb4-4817-8047-e1af1630f8b6",
  "expected_version": 1
}
```

```json
{
  "id": "feefae7c-774c-4080-9b03-f2ad42b35ec0",
  "order_id": "51cd35f1-d01c-47e4-82b4-986c7b051d9e",
  "assignment_id": "dcfc0fce-102d-4a77-bdb6-5881e2ffac42",
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
  "arrived_at": "2026-10-27T17:56:31.947489Z",
  "started_at": "2026-10-27T17:56:31.986204Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/feefae7c-774c-4080-9b03-f2ad42b35ec0/complete` → **200**

```json
{
  "command_id": "502ed638-30ed-40e8-b514-8964a36a5a3b",
  "expected_version": 2,
  "reported_at": "2026-10-27T17:56:32Z"
}
```

```json
{
  "id": "feefae7c-774c-4080-9b03-f2ad42b35ec0",
  "order_id": "51cd35f1-d01c-47e4-82b4-986c7b051d9e",
  "assignment_id": "dcfc0fce-102d-4a77-bdb6-5881e2ffac42",
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
  "arrived_at": "2026-10-27T17:56:31.947489Z",
  "started_at": "2026-10-27T17:56:31.986204Z",
  "completed_at": "2026-10-27T17:56:32.028171Z",
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
    "id": "51cd35f1-d01c-47e4-82b4-986c7b051d9e",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-27T17:56:31.750755Z",
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
    "id": "7212ac35-096e-4aae-b258-8beb53b54c82",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-27T17:56:30.588261Z",
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
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie"
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

`GET /api/operator/v1/orders/7212ac35-096e-4aae-b258-8beb53b54c82/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T17:56:30.588818Z",
      "actor": {
        "type": "CLIENT",
        "id": "b66ab911-77f3-4c1c-9131-7be681dd5657",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "7212ac35-096e-4aae-b258-8beb53b54c82",
        "quote_id": "7a5cc48c-9834-4e84-a767-9bbe571e89b6",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T17:56:30.590964Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7212ac35-096e-4aae-b258-8beb53b54c82",
        "attempt_id": "78c0df25-a01e-40ae-94ed-4713220500c3",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T17:56:30.597765Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3cc06bdd-4c1f-4bf0-a176-66bae2d620f0",
        "order_id": "7212ac35-096e-4aae-b258-8beb53b54c82",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T17:56:30.653582Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "3cc06bdd-4c1f-4bf0-a176-66bae2d620f0",
        "order_id": "7212ac35-096e-4aae-b258-8beb53b54c82",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "ffabdd0a-a48b-4f62-af6e-329a8806c6e9"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted 7212ac35-096e-4aae-b258-8beb53b54c82, follow-up 51cd35f1-d01c-47e4-82b4-986c7b051d9e.

# Scenario: multiple-orders

## A driver goes online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-26892"
}
```

```json
{
  "challenge_id": "bf8f3de6-f35e-4c58-9ec3-b2f4d4b2d187",
  "expires_at": "2026-10-27T18:01:35.160335871Z",
  "resend_available_at": "2026-10-27T17:56:36.160335871Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "598885",
  "sent_at": "2026-10-27T17:56:35.162687782Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bf8f3de6-f35e-4c58-9ec3-b2f4d4b2d187",
  "code": "598885",
  "device_ref": "sandbox-26892"
}
```

```json
{
  "session_id": "b8b90ee8-b147-4397-8f90-a8e3abbf9ed8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDY5NSwiaWF0IjoxNzkzMTIzNzk1LCJqdGkiOiIwNTVmMTA3My1hNDU5LTRiNjUtYTQ5Mi1iYzlhYzBiNjU5NDAiLCJzaWQiOiJiOGI5MGVlOC1iMTQ3LTQzOTctOGY5MC1hOGUzYWJiZjllZDgifQ.3kByOdYgBMdibxtmyg99HdbrJHpXKUmBV8Wb5XQEzcw",
  "access_expires_at": "2026-10-27T18:11:35.215939404Z",
  "refresh_token": "70c2f3vpI_LMVEYdXMBbGDzjyYfNtm8rHbcPV0IMtAo",
  "refresh_expires_at": "2026-11-26T17:56:35.21532548Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "73c26bfd-592c-460b-b8f4-736a66981f9b",
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
  "last_heartbeat_at": "2026-10-27T17:56:31.910642Z",
  "last_location_at": "2026-10-27T17:56:31.910642Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/73c26bfd-592c-460b-b8f4-736a66981f9b/handover` → **200**

```json
{
  "command_id": "abf22201-b092-43f3-b332-ccbe5ff4b391",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "73c26bfd-592c-460b-b8f4-736a66981f9b",
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
  "last_heartbeat_at": "2026-10-27T17:56:31.910642Z",
  "last_location_at": "2026-10-27T17:56:31.910642Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/73c26bfd-592c-460b-b8f4-736a66981f9b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:56:35Z",
    "sequence": 1793123795298
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "73c26bfd-592c-460b-b8f4-736a66981f9b",
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
  "last_heartbeat_at": "2026-10-27T17:56:35.316214Z",
  "last_location_at": "2026-10-27T17:56:35.316214Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677786752",
  "device_ref": "sandbox-14571"
}
```

```json
{
  "challenge_id": "548f89eb-ba2e-497a-8f2e-a5918d9cc999",
  "expires_at": "2026-10-27T18:01:35.342991091Z",
  "resend_available_at": "2026-10-27T17:56:36.342991091Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677786752` → **200**

```json
{
  "phone": "+380677786752",
  "audience": "CLIENT",
  "code": "260040",
  "sent_at": "2026-10-27T17:56:35.345184673Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "548f89eb-ba2e-497a-8f2e-a5918d9cc999",
  "code": "260040",
  "device_ref": "sandbox-14571"
}
```

```json
{
  "session_id": "ad43d416-d34c-4ce7-9fa2-4829c0d6a568",
  "subject": {
    "type": "CLIENT",
    "id": "685873b6-f6b9-42a2-9723-d4fe9e2f59b7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODU4NzNiNi1mNmI5LTQyYTItOTcyMy1kNGZlOWUyZjU5YjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI0Njk1LCJpYXQiOjE3OTMxMjM3OTUsImp0aSI6IjUyNDAzMjg4LWFjZjUtNGI5Yy1hODdlLWI4ODU5MjBhNzI2OSIsInNpZCI6ImFkNDNkNDE2LWQzNGMtNGNlNy05ZmEyLTQ4MjljMGQ2YTU2OCJ9.Ha1HyDHB552b3bxafrcFpbD71Rx2VWiYugW2WQS7WKs",
  "access_expires_at": "2026-10-27T18:11:35.398541406Z",
  "refresh_token": "XLfuNJbLF84UIvDD0iPYLRdDkybFApzXvyPEAk8imLc",
  "refresh_expires_at": "2026-11-26T17:56:35.397982832Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "93c27031-d6ad-4b08-8ff7-bbc62b108f6e",
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
  "id": "8bdc399f-90c9-480f-904a-7a4b90b6fc3d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T18:01:35.432973Z",
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
  "command_id": "264b8918-3380-4909-9df8-9d738b68ed9e",
  "quote_id": "8bdc399f-90c9-480f-904a-7a4b90b6fc3d",
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
    "phone": "+380675101954"
  }
}
```

```json
{
  "id": "0264957b-e9e2-4347-b013-8878baee9a3b",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "685873b6-f6b9-42a2-9723-d4fe9e2f59b7",
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
  "created_at": "2026-10-27T17:56:35.473665Z",
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
    "id": "8b9dea2f-c427-4141-86e4-de9b3e5ea36c",
    "order_id": "0264957b-e9e2-4347-b013-8878baee9a3b",
    "expires_at": "2026-10-27T17:56:50.477736Z",
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

`POST /api/driver/v1/offers/8b9dea2f-c427-4141-86e4-de9b3e5ea36c/accept` → **200**

```json
{
  "command_id": "fd6bf329-a4d0-405e-b312-cb991bf1ef87"
}
```

```json
{
  "id": "f7bd53af-641a-4062-8960-b88ebde9746a",
  "order_id": "0264957b-e9e2-4347-b013-8878baee9a3b",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "39bfd8c9-8fb7-40ca-9e3a-b0cad4e4b4ef",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "39bfd8c9-8fb7-40ca-9e3a-b0cad4e4b4ef",
  "order_id": "0264957b-e9e2-4347-b013-8878baee9a3b",
  "assignment_id": "f7bd53af-641a-4062-8960-b88ebde9746a",
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
    "phone": "+380675101954"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "773b290e-90db-429f-9a20-e5491497d30b",
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
  "id": "34362872-3945-49ef-8d9a-48afebc31c43",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T18:01:35.609920Z",
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
  "command_id": "e9e308d7-4764-4f31-9b55-a1811d076bee",
  "quote_id": "34362872-3945-49ef-8d9a-48afebc31c43",
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
  "id": "d9438c6f-005e-4d41-bd90-c72d5572609f",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "685873b6-f6b9-42a2-9723-d4fe9e2f59b7",
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
  "created_at": "2026-10-27T17:56:35.645997Z",
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
  "command_id": "9c5cc8f1-a43a-4f15-a98e-8e0cdf713b40",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-27T20:56:35Z"
}
```

```json
{
  "id": "358b9982-f805-4364-9a02-beb97a427d72",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T18:01:35.696069Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T20:56:35Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "30161980-1e22-4499-972d-5db77dde8fda",
  "quote_id": "358b9982-f805-4364-9a02-beb97a427d72",
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
  "pickup_at": "2026-10-27T20:56:35Z"
}
```

```json
{
  "id": "d27e33bc-0c4f-4ef5-91eb-43e4c7f65c65",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "685873b6-f6b9-42a2-9723-d4fe9e2f59b7",
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
  "created_at": "2026-10-27T17:56:35.736252Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T20:56:35Z",
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
  "command_id": "a43c25c2-2630-4c7c-9315-107d5b0d976d",
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
  "id": "4b826b39-2b7a-4617-bd8e-82a53cc67ae3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T18:01:35.777790Z",
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
  "command_id": "46fb62f5-0716-48bf-9d67-79dd243ad0f4",
  "quote_id": "4b826b39-2b7a-4617-bd8e-82a53cc67ae3",
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
  "correlation_id": "f67079bf-6860-430d-8b8b-63533435afcc"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "d27e33bc-0c4f-4ef5-91eb-43e4c7f65c65",
      "short_number": 10,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "685873b6-f6b9-42a2-9723-d4fe9e2f59b7",
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
      "created_at": "2026-10-27T17:56:35.736252Z",
      "cancellation": null,
      "pickup_at": "2026-10-27T20:56:35Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "d9438c6f-005e-4d41-bd90-c72d5572609f",
      "short_number": 9,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "685873b6-f6b9-42a2-9723-d4fe9e2f59b7",
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
      "created_at": "2026-10-27T17:56:35.645997Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "0264957b-e9e2-4347-b013-8878baee9a3b",
      "short_number": 8,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "685873b6-f6b9-42a2-9723-d4fe9e2f59b7",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "d9438c6f-005e-4d41-bd90-c72d5572609f",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "685873b6-f6b9-42a2-9723-d4fe9e2f59b7",
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
  "created_at": "2026-10-27T17:56:35.645997Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/0264957b-e9e2-4347-b013-8878baee9a3b` → **200**

```json
{
  "id": "0264957b-e9e2-4347-b013-8878baee9a3b",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "685873b6-f6b9-42a2-9723-d4fe9e2f59b7",
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
    "id": "f7bd53af-641a-4062-8960-b88ebde9746a",
    "order_id": "0264957b-e9e2-4347-b013-8878baee9a3b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "39bfd8c9-8fb7-40ca-9e3a-b0cad4e4b4ef",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-27T17:56:35.473665Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/0264957b-e9e2-4347-b013-8878baee9a3b/cancel` → **200**

```json
{
  "command_id": "00d51082-cea1-4eaf-a000-1faba71d56b2",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0264957b-e9e2-4347-b013-8878baee9a3b",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "685873b6-f6b9-42a2-9723-d4fe9e2f59b7",
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
    "id": "f7bd53af-641a-4062-8960-b88ebde9746a",
    "order_id": "0264957b-e9e2-4347-b013-8878baee9a3b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "39bfd8c9-8fb7-40ca-9e3a-b0cad4e4b4ef",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T17:56:35.473665Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/d9438c6f-005e-4d41-bd90-c72d5572609f` → **200**

```json
{
  "id": "d9438c6f-005e-4d41-bd90-c72d5572609f",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "685873b6-f6b9-42a2-9723-d4fe9e2f59b7",
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
  "created_at": "2026-10-27T17:56:35.645997Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/d9438c6f-005e-4d41-bd90-c72d5572609f/cancel` → **200**

```json
{
  "command_id": "4430c124-4bec-4611-84e3-af17a6b2b96e",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d9438c6f-005e-4d41-bd90-c72d5572609f",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "685873b6-f6b9-42a2-9723-d4fe9e2f59b7",
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
  "created_at": "2026-10-27T17:56:35.645997Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/d27e33bc-0c4f-4ef5-91eb-43e4c7f65c65` → **200**

```json
{
  "id": "d27e33bc-0c4f-4ef5-91eb-43e4c7f65c65",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "685873b6-f6b9-42a2-9723-d4fe9e2f59b7",
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
  "created_at": "2026-10-27T17:56:35.736252Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T20:56:35Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/d27e33bc-0c4f-4ef5-91eb-43e4c7f65c65/cancel` → **200**

```json
{
  "command_id": "6c6a3d49-f973-49b3-9bc3-12f088b41241",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d27e33bc-0c4f-4ef5-91eb-43e4c7f65c65",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "685873b6-f6b9-42a2-9723-d4fe9e2f59b7",
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
  "created_at": "2026-10-27T17:56:35.736252Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów"
    }
  },
  "pickup_at": "2026-10-27T20:56:35Z",
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
  "session_id": "73c26bfd-592c-460b-b8f4-736a66981f9b",
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
  "last_heartbeat_at": "2026-10-27T17:56:35.316214Z",
  "last_location_at": "2026-10-27T17:56:35.316214Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/73c26bfd-592c-460b-b8f4-736a66981f9b/close` → **200**

```json
{
  "command_id": "7688c0f6-86dc-468a-aee5-8aa040bf4d3e",
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

Done: orders 0264957b-e9e2-4347-b013-8878baee9a3b, d9438c6f-005e-4d41-bd90-c72d5572609f, d27e33bc-0c4f-4ef5-91eb-43e4c7f65c65.

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
  "session_id": "dd08312f-749f-46d7-99b1-5480432916d1",
  "subject": {
    "type": "STAFF",
    "id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWZhODRhMi01MjYxLTQxYTktYjczZS05ZDA0NzU3YjlmOGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQ2OTYsImlhdCI6MTc5MzEyMzc5NiwianRpIjoiN2I3YmJmOTEtYWQ0ZC00OWUyLTg0YjItOTM3NmY0MDBkMDQ0Iiwic2lkIjoiZGQwODMxMmYtNzQ5Zi00NmQ3LTk5YjEtNTQ4MDQzMjkxNmQxIn0.HeSXh0N0c02LbKY44FriyHc7jdJ31mVD5U0yKO7Epak",
  "access_expires_at": "2026-10-27T18:11:36.448601696Z",
  "refresh_token": "OnAL-p_Me1F9OK36ca_c-XjqFitkkDrMNAy5pU_ep4U",
  "refresh_expires_at": "2026-10-28T05:56:36.447922042Z",
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
  "session_id": "767cbb5e-bdea-46c4-b1ae-7d9f16d74511",
  "subject": {
    "type": "STAFF",
    "id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWZhODRhMi01MjYxLTQxYTktYjczZS05ZDA0NzU3YjlmOGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQ2OTYsImlhdCI6MTc5MzEyMzc5NiwianRpIjoiMDQyYTk5MDMtMDMxYi00YWE0LWJjYmItOGU1YWZjNGVlOTZjIiwic2lkIjoiNzY3Y2JiNWUtYmRlYS00NmM0LWIxYWUtN2Q5ZjE2ZDc0NTExIn0.FWPoqoll8jM6pZzcngaPvxnVONsfDA2rpHiBjEudLnw",
  "access_expires_at": "2026-10-27T18:11:36.77067775Z",
  "refresh_token": "hs_7hDRr3j5HZWS3noChYgW1xLZRBHT0nNdosMgVT8c",
  "refresh_expires_at": "2026-10-28T05:56:36.770079017Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-16368"
}
```

```json
{
  "challenge_id": "3421a416-ef5d-4814-abec-4ec9f210bcbb",
  "expires_at": "2026-10-27T18:01:36.79330718Z",
  "resend_available_at": "2026-10-27T17:56:37.79330718Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "943715",
  "sent_at": "2026-10-27T17:56:36.795397356Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3421a416-ef5d-4814-abec-4ec9f210bcbb",
  "code": "943715",
  "device_ref": "sandbox-16368"
}
```

```json
{
  "session_id": "c1ba1e80-b760-4076-98b8-9a7623ca4ddb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDY5NiwiaWF0IjoxNzkzMTIzNzk2LCJqdGkiOiIzZjNhMjU4YS1jMWYwLTQwNWItYWM4MC1kZTczM2Y0NTJkODQiLCJzaWQiOiJjMWJhMWU4MC1iNzYwLTQwNzYtOThiOC05YTc2MjNjYTRkZGIifQ.WouhtvfPN1VZE9B_SZL7gUlReqHKrUc_CP8of1tKKWw",
  "access_expires_at": "2026-10-27T18:11:36.850886967Z",
  "refresh_token": "1EpqJiB40DN0A1ifIYaxbQ3aOMAvk59BiXmnJmpV2-A",
  "refresh_expires_at": "2026-11-26T17:56:36.850122151Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2e7b5035-22a0-4916-b398-af90bd8bd452",
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
  "last_heartbeat_at": "2026-10-27T17:56:30.841501Z",
  "last_location_at": "2026-10-27T17:56:30.841501Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2e7b5035-22a0-4916-b398-af90bd8bd452/handover` → **200**

```json
{
  "command_id": "5f69286f-6222-453e-a8c1-ae7a5bdcb1c2",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2e7b5035-22a0-4916-b398-af90bd8bd452",
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
  "last_heartbeat_at": "2026-10-27T17:56:30.841501Z",
  "last_location_at": "2026-10-27T17:56:30.841501Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2e7b5035-22a0-4916-b398-af90bd8bd452/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:56:36Z",
    "sequence": 1793123796934
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2e7b5035-22a0-4916-b398-af90bd8bd452",
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
  "last_heartbeat_at": "2026-10-27T17:56:36.952893Z",
  "last_location_at": "2026-10-27T17:56:36.952893Z",
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
  "command_id": "2c8e9a2b-e933-4365-9b19-677bbbc406f3",
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
  "effective_at": "2026-10-27T17:56:37.02788Z",
  "changed_by": "4efa84a2-5261-41a9-b73e-9d04757b9f8d",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-27T17:56:37.058946188Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "291f946e-4b08-4922-aab3-5bab244b1793",
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
  "id": "e5764432-ce46-45de-88b5-43683dd8ad14",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T18:01:37.098558Z",
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
  "command_id": "9a9ef888-5a4d-413b-a461-1cf8e2c65ab7",
  "quote_id": "e5764432-ce46-45de-88b5-43683dd8ad14",
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
    "phone": "+380671117777"
  }
}
```

```json
{
  "id": "8d0105e8-b3b6-4613-a8be-59bf6922f238",
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
  "created_at": "2026-10-27T17:56:37.159957Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671117777"
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
    "id": "574e342a-e142-4dfb-8d58-c4b0331908e7",
    "order_id": "8d0105e8-b3b6-4613-a8be-59bf6922f238",
    "expires_at": "2026-10-27T17:56:52.165342Z",
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

`POST /api/driver/v1/offers/574e342a-e142-4dfb-8d58-c4b0331908e7/accept` → **200**

```json
{
  "command_id": "2cc66e0c-10fe-457a-ac8e-04fd97fbd264"
}
```

```json
{
  "id": "ca5a556e-8384-46bc-8321-3320af5dad2c",
  "order_id": "8d0105e8-b3b6-4613-a8be-59bf6922f238",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "06a50ec0-d7aa-4e0b-a6d7-0a4499c22de2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "06a50ec0-d7aa-4e0b-a6d7-0a4499c22de2",
  "order_id": "8d0105e8-b3b6-4613-a8be-59bf6922f238",
  "assignment_id": "ca5a556e-8384-46bc-8321-3320af5dad2c",
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
    "phone": "+380671117777"
  }
}
```

`POST /api/driver/v1/work-sessions/2e7b5035-22a0-4916-b398-af90bd8bd452/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:56:37Z",
    "sequence": 1793123797269
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2e7b5035-22a0-4916-b398-af90bd8bd452",
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
  "last_heartbeat_at": "2026-10-27T17:56:37.292352Z",
  "last_location_at": "2026-10-27T17:56:37.292352Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/06a50ec0-d7aa-4e0b-a6d7-0a4499c22de2/arrive` → **200**

```json
{
  "command_id": "44a32bd4-948f-49b3-ad88-20dfe325b640",
  "expected_version": 0
}
```

```json
{
  "id": "06a50ec0-d7aa-4e0b-a6d7-0a4499c22de2",
  "order_id": "8d0105e8-b3b6-4613-a8be-59bf6922f238",
  "assignment_id": "ca5a556e-8384-46bc-8321-3320af5dad2c",
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
  "arrived_at": "2026-10-27T17:56:37.329583Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671117777"
  }
}
```

`POST /api/driver/v1/trips/06a50ec0-d7aa-4e0b-a6d7-0a4499c22de2/start` → **200**

```json
{
  "command_id": "7dcbc126-9124-4302-bcb3-385510c0d0d7",
  "expected_version": 1
}
```

```json
{
  "id": "06a50ec0-d7aa-4e0b-a6d7-0a4499c22de2",
  "order_id": "8d0105e8-b3b6-4613-a8be-59bf6922f238",
  "assignment_id": "ca5a556e-8384-46bc-8321-3320af5dad2c",
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
  "arrived_at": "2026-10-27T17:56:37.329583Z",
  "started_at": "2026-10-27T17:56:37.367608Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671117777"
  }
}
```

`POST /api/driver/v1/trips/06a50ec0-d7aa-4e0b-a6d7-0a4499c22de2/complete` → **200**

```json
{
  "command_id": "49b0a7cb-1d4b-4bc8-b5de-4bd3985a3361",
  "expected_version": 2,
  "reported_at": "2026-10-27T17:56:37Z",
  "cash_received": true
}
```

```json
{
  "id": "06a50ec0-d7aa-4e0b-a6d7-0a4499c22de2",
  "order_id": "8d0105e8-b3b6-4613-a8be-59bf6922f238",
  "assignment_id": "ca5a556e-8384-46bc-8321-3320af5dad2c",
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
  "arrived_at": "2026-10-27T17:56:37.329583Z",
  "started_at": "2026-10-27T17:56:37.367608Z",
  "completed_at": "2026-10-27T17:56:37.408967Z",
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
  "command_id": "189f8d08-dd0f-45e1-8bc3-fe7fe41f48b2",
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
  "id": "6691715e-e0be-47a7-ba26-f42a66c1db68",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T18:01:37.452773Z",
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
  "command_id": "10056869-5529-48d9-98a5-90ca99d6fbd9",
  "quote_id": "6691715e-e0be-47a7-ba26-f42a66c1db68",
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
    "phone": "+380671118432"
  }
}
```

```json
{
  "id": "9ff132ae-7d2b-49bd-9841-474c13489dbc",
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
  "created_at": "2026-10-27T17:56:37.490665Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118432"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/9ff132ae-7d2b-49bd-9841-474c13489dbc` → **200**

```json
{
  "id": "9ff132ae-7d2b-49bd-9841-474c13489dbc",
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
  "created_at": "2026-10-27T17:56:37.490665Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118432"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9ff132ae-7d2b-49bd-9841-474c13489dbc/cancel` → **200**

```json
{
  "command_id": "8e97f924-6bc0-467c-a12e-6eef75e76413",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "9ff132ae-7d2b-49bd-9841-474c13489dbc",
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
  "created_at": "2026-10-27T17:56:37.490665Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118432"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "uk": "Помилка оператора",
      "en": "Operator error",
      "ru": "Ошибка оператора",
      "pl": "Błąd operatora"
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
  "staff_id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-27T17:56:37.414906Z",
  "last_entries": [
    {
      "order_id": "9ff132ae-7d2b-49bd-9841-474c13489dbc",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-27T17:56:37.564487Z"
    },
    {
      "order_id": "8d0105e8-b3b6-4613-a8be-59bf6922f238",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-27T17:56:37.414906Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2e7b5035-22a0-4916-b398-af90bd8bd452",
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
  "last_heartbeat_at": "2026-10-27T17:56:37.292352Z",
  "last_location_at": "2026-10-27T17:56:37.292352Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2e7b5035-22a0-4916-b398-af90bd8bd452/close` → **200**

```json
{
  "command_id": "ea8d83a0-a99b-450d-bc9f-1ea033e705ae",
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

Done: operator bonus for fulfilled 8d0105e8-b3b6-4613-a8be-59bf6922f238 and operator-fault cancellation 9ff132ae-7d2b-49bd-9841-474c13489dbc.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639127087",
  "device_ref": "sandbox-21595"
}
```

```json
{
  "challenge_id": "f7dfd05d-83f3-430b-a2dd-3f84892802ac",
  "expires_at": "2026-10-27T18:01:39.716842925Z",
  "resend_available_at": "2026-10-27T17:56:40.716842925Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639127087` → **200**

```json
{
  "phone": "+380639127087",
  "audience": "CLIENT",
  "code": "082156",
  "sent_at": "2026-10-27T17:56:39.719023633Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f7dfd05d-83f3-430b-a2dd-3f84892802ac",
  "code": "082156",
  "device_ref": "sandbox-21595"
}
```

```json
{
  "session_id": "fa2dfade-ba3a-4be0-b7e3-a5a6fdec6fe5",
  "subject": {
    "type": "CLIENT",
    "id": "88beaf4c-0943-468b-8346-1bcd641b2271"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OGJlYWY0Yy0wOTQzLTQ2OGItODM0Ni0xYmNkNjQxYjIyNzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI0Njk5LCJpYXQiOjE3OTMxMjM3OTksImp0aSI6IjkxNWRmZjUwLTk1OTItNGQxNS1iMDg4LTliMGMwMzM2YzUwNSIsInNpZCI6ImZhMmRmYWRlLWJhM2EtNGJlMC1iN2UzLWE1YTZmZGVjNmZlNSJ9.nx7vvueqfCWZengM-BWHv32jU6Jp0cugJmci1H-UkP8",
  "access_expires_at": "2026-10-27T18:11:39.771727651Z",
  "refresh_token": "wbOY2uS0ZpA8P58x41lkLLedzFJQ-Cnh9foytc0ebZk",
  "refresh_expires_at": "2026-11-26T17:56:39.77115489Z",
  "account_created": true
}
```

`GET /api/rider/v1/places?query=%D0%9C%D0%B0%D0%B9%D0%B4%D0%B0%D0%BD&lat=50.4501&lon=30.5234` → **200**

```json
{
  "provider": "FAKE",
  "places": [
    {
      "source": "FAKE",
      "address_id": null,
      "label": "Майдан, 1",
      "street": "Майдан",
      "house": "1",
      "point": {
        "lat": 50.4531,
        "lon": 30.5234
      },
      "instructions": null
    },
    {
      "source": "FAKE",
      "address_id": null,
      "label": "Майдан, 2",
      "street": "Майдан",
      "house": "2",
      "point": {
        "lat": 50.4561,
        "lon": 30.5234
      },
      "instructions": null
    },
    {
      "source": "FAKE",
      "address_id": null,
      "label": "Майдан, 3",
      "street": "Майдан",
      "house": "3",
      "point": {
        "lat": 50.4591,
        "lon": 30.5234
      },
      "instructions": null
    }
  ]
}
```

## A point on the map gives an address

`GET /api/rider/v1/places/reverse?lat=50.4501&lon=30.5234` → **200**

```json
{
  "source": "FAKE",
  "address_id": null,
  "label": "Fake street 1",
  "street": "Fake street",
  "house": "1",
  "point": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "instructions": null
}
```

## The operator searches for a caller

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
  "session_id": "58b7ffb6-5c06-485a-89bf-d9e9564e7c9f",
  "subject": {
    "type": "STAFF",
    "id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWZhODRhMi01MjYxLTQxYTktYjczZS05ZDA0NzU3YjlmOGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQ3MDAsImlhdCI6MTc5MzEyMzgwMCwianRpIjoiZTM0MWU0NWMtMmZhZS00NTUyLTk1YmEtZmUwNjg1MWY2M2FlIiwic2lkIjoiNThiN2ZmYjYtNWMwNi00ODVhLTg5YmYtZDllOTU2NGU3YzlmIn0.jfSQqEfblfAtBPn0tRRoswfFhv63wtfEaYAg_OnLHTU",
  "access_expires_at": "2026-10-27T18:11:40.17222237Z",
  "refresh_token": "kPZkLTOL7_riVwF_6g6D3JWxdh6JOcDKncuNIzHXo8E",
  "refresh_expires_at": "2026-10-28T05:56:40.171617249Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380639127087` → **200**

```json
{
  "provider": "FAKE",
  "places": [
    {
      "source": "FAKE",
      "address_id": null,
      "label": "Вокзал, 1",
      "street": "Вокзал",
      "house": "1",
      "point": {
        "lat": 50.4531,
        "lon": 30.5234
      },
      "instructions": null
    },
    {
      "source": "FAKE",
      "address_id": null,
      "label": "Вокзал, 2",
      "street": "Вокзал",
      "house": "2",
      "point": {
        "lat": 50.4561,
        "lon": 30.5234
      },
      "instructions": null
    },
    {
      "source": "FAKE",
      "address_id": null,
      "label": "Вокзал, 3",
      "street": "Вокзал",
      "house": "3",
      "point": {
        "lat": 50.4591,
        "lon": 30.5234
      },
      "instructions": null
    }
  ]
}
```

## Outside the service area

`GET /api/rider/v1/places?query=x&lat=10&lon=10` → **422**

```json
{
  "instance": "/api/rider/v1/places",
  "status": 422,
  "title": "Outside service area",
  "type": "https://errors.blizz.taxi/outside-service-area",
  "code": "OUTSIDE_SERVICE_AREA",
  "correlation_id": "70304b53-388f-481f-b8df-2cd96290d7aa"
}
```

Done: address search through FAKE.

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
  "session_id": "cd28d42b-1296-4914-9958-894339d0c9dd",
  "subject": {
    "type": "STAFF",
    "id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWZhODRhMi01MjYxLTQxYTktYjczZS05ZDA0NzU3YjlmOGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQ3MDAsImlhdCI6MTc5MzEyMzgwMCwianRpIjoiNjVmYjk3MDYtNzUwYS00OTk1LWJmNTItY2I0NzA1Y2I5ZWM3Iiwic2lkIjoiY2QyOGQ0MmItMTI5Ni00OTE0LTk5NTgtODk0MzM5ZDBjOWRkIn0.Yd2Bin17gD85hGrLtH7PjOfMreZHmPL849beRnqmXTc",
  "access_expires_at": "2026-10-27T18:11:40.562485191Z",
  "refresh_token": "HnGzQsvLEmPRzdvCPSSgPTuFqhhWrq0HTfUDuu9R33g",
  "refresh_expires_at": "2026-10-28T05:56:40.561898256Z",
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
  "command_id": "e5cddff5-3b08-452d-bbf2-7adc0ff3d3e3",
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
  "changed_by": "4efa84a2-5261-41a9-b73e-9d04757b9f8d",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T17:56:40.635512445Z"
}
```

## The rider books the airport for 2026-10-27T20:56:40Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600326076",
  "device_ref": "sandbox-31155"
}
```

```json
{
  "challenge_id": "d07eee66-4283-47c4-aa68-df17f5f0cfc0",
  "expires_at": "2026-10-27T18:01:40.66902043Z",
  "resend_available_at": "2026-10-27T17:56:41.66902043Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600326076` → **200**

```json
{
  "phone": "+48600326076",
  "audience": "CLIENT",
  "code": "938519",
  "sent_at": "2026-10-27T17:56:40.671673766Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d07eee66-4283-47c4-aa68-df17f5f0cfc0",
  "code": "938519",
  "device_ref": "sandbox-31155"
}
```

```json
{
  "session_id": "504f0e42-2bbe-4f9f-b1e7-cbe3fb658af5",
  "subject": {
    "type": "CLIENT",
    "id": "453e73c4-258f-4216-8c29-04b558ab2c20"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NTNlNzNjNC0yNThmLTQyMTYtOGMyOS0wNGI1NThhYjJjMjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI0NzAwLCJpYXQiOjE3OTMxMjM4MDAsImp0aSI6IjA5NTYwMThlLWJhMTktNDQxOS05MDNjLTBiYzJkOWNkNDQ1ZSIsInNpZCI6IjUwNGYwZTQyLTJiYmUtNGY5Zi1iMWU3LWNiZTNmYjY1OGFmNSJ9.aq3hOG3h0v7JmP5IswadTzqOXc59dFmsW7IrDNuu5Hg",
  "access_expires_at": "2026-10-27T18:11:40.724690525Z",
  "refresh_token": "lGJi3sAgNiuSI3MJ8V6XtlsxpASYTUh2TmCg8SroWmk",
  "refresh_expires_at": "2026-11-26T17:56:40.724068737Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f693b9c7-74cd-4825-953a-818c6ebc9fe0",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T20:56:40Z"
}
```

```json
{
  "id": "2db0d460-97c9-4d2c-8863-289d3a5c98d4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T18:01:40.758250Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T20:56:40Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "db82086d-16f9-45ea-a371-6cba6af5216a",
  "quote_id": "2db0d460-97c9-4d2c-8863-289d3a5c98d4",
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
  "pickup_at": "2026-10-27T20:56:40Z"
}
```

```json
{
  "id": "34997ec8-d30e-493d-8214-b72dbd2fcf41",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "453e73c4-258f-4216-8c29-04b558ab2c20",
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
  "created_at": "2026-10-27T17:56:40.794725Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T20:56:40Z",
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
  "device_ref": "sandbox-32565"
}
```

```json
{
  "challenge_id": "d5a16443-77bc-48b2-a554-b97f111c3b48",
  "expires_at": "2026-10-27T18:01:40.826483713Z",
  "resend_available_at": "2026-10-27T17:56:41.826483713Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "125146",
  "sent_at": "2026-10-27T17:56:40.828616487Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d5a16443-77bc-48b2-a554-b97f111c3b48",
  "code": "125146",
  "device_ref": "sandbox-32565"
}
```

```json
{
  "session_id": "7b2d8c19-45d9-48a8-a629-0e0eb6f6194c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDcwMCwiaWF0IjoxNzkzMTIzODAwLCJqdGkiOiIzYjk0ODlmMC0wMzQ5LTQ0YTEtYjMyOS0wZmU4ZDMxYjc5YTUiLCJzaWQiOiI3YjJkOGMxOS00NWQ5LTQ4YTgtYTYyOS0wZTBlYjZmNjE5NGMifQ.Ym5Nu6WMgtVzXpsOMbQ0oAdb1WNBJgPNFsD8-qlZB0o",
  "access_expires_at": "2026-10-27T18:11:40.882498415Z",
  "refresh_token": "uNFVYao4lkeHhclN1idjj2v3qmBpqdIPni4i8yXhsb4",
  "refresh_expires_at": "2026-11-26T17:56:40.881827295Z",
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
  "command_id": "fc84fac6-18db-4cc4-89d2-7a9c32dddee5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:56:40Z",
    "sequence": 1793123800934
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b1f4f031-4812-48b9-91a4-762130d0e2a3",
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
  "last_heartbeat_at": "2026-10-27T17:56:40.951109Z",
  "last_location_at": "2026-10-27T17:56:40.951109Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "34997ec8-d30e-493d-8214-b72dbd2fcf41",
      "short_number": 13,
      "pickup_at": "2026-10-27T20:56:40Z",
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

`POST /api/driver/v1/preorders/34997ec8-d30e-493d-8214-b72dbd2fcf41/reserve` → **200**

```json
{
  "command_id": "5da5b665-7e0b-453d-876c-96a87d01af0c"
}
```

```json
{
  "id": "11722ec7-dace-413d-924f-64e7dd5a6a60",
  "state": "RESERVED",
  "order": {
    "order_id": "34997ec8-d30e-493d-8214-b72dbd2fcf41",
    "short_number": 13,
    "pickup_at": "2026-10-27T20:56:40Z",
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
  "reserved_at": "2026-10-27T17:56:41.015332Z",
  "confirm_from": "2026-10-27T20:26:40Z",
  "confirm_until": "2026-10-27T20:36:40Z",
  "drop_until": "2026-10-27T19:56:40Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "11722ec7-dace-413d-924f-64e7dd5a6a60",
      "state": "RESERVED",
      "order": {
        "order_id": "34997ec8-d30e-493d-8214-b72dbd2fcf41",
        "short_number": 13,
        "pickup_at": "2026-10-27T20:56:40Z",
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
      "reserved_at": "2026-10-27T17:56:41.015332Z",
      "confirm_from": "2026-10-27T20:26:40Z",
      "confirm_until": "2026-10-27T20:36:40Z",
      "drop_until": "2026-10-27T19:56:40Z"
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
      "id": "11722ec7-dace-413d-924f-64e7dd5a6a60",
      "state": "RESERVED",
      "order": {
        "order_id": "34997ec8-d30e-493d-8214-b72dbd2fcf41",
        "short_number": 13,
        "pickup_at": "2026-10-27T20:56:40Z",
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
      "reserved_at": "2026-10-27T17:56:41.015332Z",
      "confirm_from": "2026-10-27T20:26:40Z",
      "confirm_until": "2026-10-27T20:36:40Z",
      "drop_until": "2026-10-27T19:56:40Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/11722ec7-dace-413d-924f-64e7dd5a6a60/confirm` → **409**

```json
{
  "command_id": "77ac2559-d116-4776-8c8f-96a14df179b3"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/11722ec7-dace-413d-924f-64e7dd5a6a60/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d07f6cb0-21db-4b2c-b958-62952a018abf"
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
  "session_id": "87b445fd-74ac-4370-a321-c3efcbee319f",
  "subject": {
    "type": "STAFF",
    "id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWZhODRhMi01MjYxLTQxYTktYjczZS05ZDA0NzU3YjlmOGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQ3MDEsImlhdCI6MTc5MzEyMzgwMSwianRpIjoiNTVjNTQ0NGUtY2EzZS00OTNhLTkwZTItZmY3MmM5YjUyODRjIiwic2lkIjoiODdiNDQ1ZmQtNzRhYy00MzcwLWEzMjEtYzNlZmNiZWUzMTlmIn0.lP1XLtvRzF5ioU-93-8NmVoU4xBnh9nhaJxUS-CUXe4",
  "access_expires_at": "2026-10-27T18:11:41.423379634Z",
  "refresh_token": "48bBauYsnwLuxz_ECCa1qpCxDhmlKr00ytmhIu85g2o",
  "refresh_expires_at": "2026-10-28T05:56:41.422800723Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/34997ec8-d30e-493d-8214-b72dbd2fcf41` → **200**

```json
{
  "id": "34997ec8-d30e-493d-8214-b72dbd2fcf41",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "453e73c4-258f-4216-8c29-04b558ab2c20",
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
  "created_at": "2026-10-27T17:56:40.794725Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T20:56:40Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "11722ec7-dace-413d-924f-64e7dd5a6a60",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T17:56:41.015332Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/34997ec8-d30e-493d-8214-b72dbd2fcf41/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T17:56:40.795984Z",
      "actor": {
        "type": "CLIENT",
        "id": "453e73c4-258f-4216-8c29-04b558ab2c20",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "34997ec8-d30e-493d-8214-b72dbd2fcf41",
        "preorder": true,
        "quote_id": "2db0d460-97c9-4d2c-8863-289d3a5c98d4",
        "pickup_at": "2026-10-27T20:56:40Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T17:56:41.016423Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "34997ec8-d30e-493d-8214-b72dbd2fcf41",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "11722ec7-dace-413d-924f-64e7dd5a6a60"
      }
    }
  ]
}
```

Done: pre-order 34997ec8-d30e-493d-8214-b72dbd2fcf41, reservation 11722ec7-dace-413d-924f-64e7dd5a6a60.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-1683"
}
```

```json
{
  "challenge_id": "6d6e69ec-f2d0-4b22-a36f-e5df3a913f65",
  "expires_at": "2026-10-27T18:01:41.5088041Z",
  "resend_available_at": "2026-10-27T17:56:42.5088041Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "223826",
  "sent_at": "2026-10-27T17:56:41.510964522Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6d6e69ec-f2d0-4b22-a36f-e5df3a913f65",
  "code": "223826",
  "device_ref": "sandbox-1683"
}
```

```json
{
  "session_id": "f5f202c7-8535-4727-a83d-7f7fd8fa84d3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDcwMSwiaWF0IjoxNzkzMTIzODAxLCJqdGkiOiI5Y2E3NjZmNC0zNDQ2LTRhMDAtYmUxNi1mNjFiZTJlMDIwYjMiLCJzaWQiOiJmNWYyMDJjNy04NTM1LTQ3MjctYTgzZC03ZjdmZDhmYTg0ZDMifQ.S9HtM_MLsNtk4EQLMFTtef8kKSfmqgBWMZ9OzrusOSU",
  "access_expires_at": "2026-10-27T18:11:41.563768891Z",
  "refresh_token": "l3X2ZNFvoVIIRbB5crDw6ZP5cTBlO31MySxY1zqGDAE",
  "refresh_expires_at": "2026-11-26T17:56:41.563190962Z",
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
  "command_id": "ca2fb1e6-c1e4-4cbd-af4c-561294aa463a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:56:41Z",
    "sequence": 1793123801614
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3dca2824-592a-43d1-ad2e-5983ab7ed05e",
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
  "last_heartbeat_at": "2026-10-27T17:56:41.631632Z",
  "last_location_at": "2026-10-27T17:56:41.631632Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671684112",
  "device_ref": "sandbox-28822"
}
```

```json
{
  "challenge_id": "4147f5a0-c76f-489f-8923-01138b15e085",
  "expires_at": "2026-10-27T18:01:41.659593024Z",
  "resend_available_at": "2026-10-27T17:56:42.659593024Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671684112` → **200**

```json
{
  "phone": "+380671684112",
  "audience": "CLIENT",
  "code": "127912",
  "sent_at": "2026-10-27T17:56:41.661852137Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4147f5a0-c76f-489f-8923-01138b15e085",
  "code": "127912",
  "device_ref": "sandbox-28822"
}
```

```json
{
  "session_id": "aeb1e4d2-2427-489e-bb50-fcf0b314dbf4",
  "subject": {
    "type": "CLIENT",
    "id": "c2b2653d-f425-4184-8b2d-aa9c23bae85e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIyNjUzZC1mNDI1LTQxODQtOGIyZC1hYTljMjNiYWU4NWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI0NzAxLCJpYXQiOjE3OTMxMjM4MDEsImp0aSI6IjM3NGVkMWYwLTA3YTktNGU4MS1hYmI0LTg4YjBlMjVmMzJjYSIsInNpZCI6ImFlYjFlNGQyLTI0MjctNDg5ZS1iYjUwLWZjZjBiMzE0ZGJmNCJ9.cgewV5DDVHfl8cxKiRZ0mtF73b-ErKNIU-e8fU16L7M",
  "access_expires_at": "2026-10-27T18:11:41.714603404Z",
  "refresh_token": "k-6F5I4sO9eds-cAtMvfJaCWtiNd_pEgmwLtbbNU4V0",
  "refresh_expires_at": "2026-11-26T17:56:41.713949633Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5ce3bd1b-41d6-4258-aa68-631fb3c73317",
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
  "id": "af957ca9-9c88-48b3-ab9d-6b891dc25abc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T18:01:41.750656Z",
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
  "command_id": "01005125-15ba-406a-b25e-04380a3409e6",
  "quote_id": "af957ca9-9c88-48b3-ab9d-6b891dc25abc",
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
  "id": "b3b54b4d-52c8-4d09-9fa3-33ad7224aa57",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c2b2653d-f425-4184-8b2d-aa9c23bae85e",
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
  "created_at": "2026-10-27T17:56:41.787842Z",
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
    "id": "c6e871c3-d85c-422a-8561-09c4ed7d287b",
    "order_id": "b3b54b4d-52c8-4d09-9fa3-33ad7224aa57",
    "expires_at": "2026-10-27T17:56:56.79073Z",
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

`POST /api/driver/v1/offers/c6e871c3-d85c-422a-8561-09c4ed7d287b/accept` → **200**

```json
{
  "command_id": "0eedb05c-1c58-4686-aa1d-c5c3df7a32db"
}
```

```json
{
  "id": "2b68ea3e-add7-4c15-8362-4d1245107614",
  "order_id": "b3b54b4d-52c8-4d09-9fa3-33ad7224aa57",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b232afe6-a740-4e47-82e1-a860d741eea2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b232afe6-a740-4e47-82e1-a860d741eea2",
  "order_id": "b3b54b4d-52c8-4d09-9fa3-33ad7224aa57",
  "assignment_id": "2b68ea3e-add7-4c15-8362-4d1245107614",
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

`POST /api/driver/v1/work-sessions/3dca2824-592a-43d1-ad2e-5983ab7ed05e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:56:41Z",
    "sequence": 1793123801892
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3dca2824-592a-43d1-ad2e-5983ab7ed05e",
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
  "last_heartbeat_at": "2026-10-27T17:56:41.909572Z",
  "last_location_at": "2026-10-27T17:56:41.909572Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b232afe6-a740-4e47-82e1-a860d741eea2",
  "order_id": "b3b54b4d-52c8-4d09-9fa3-33ad7224aa57",
  "assignment_id": "2b68ea3e-add7-4c15-8362-4d1245107614",
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

`POST /api/driver/v1/trips/b232afe6-a740-4e47-82e1-a860d741eea2/arrive` → **200**

```json
{
  "command_id": "953edabc-a8ed-40b5-9211-0f18f15c8528",
  "expected_version": 0
}
```

```json
{
  "id": "b232afe6-a740-4e47-82e1-a860d741eea2",
  "order_id": "b3b54b4d-52c8-4d09-9fa3-33ad7224aa57",
  "assignment_id": "2b68ea3e-add7-4c15-8362-4d1245107614",
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
  "arrived_at": "2026-10-27T17:56:41.957406Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b232afe6-a740-4e47-82e1-a860d741eea2/start` → **200**

```json
{
  "command_id": "a796e10a-74d6-4745-902e-f3426f4dd9af",
  "expected_version": 1
}
```

```json
{
  "id": "b232afe6-a740-4e47-82e1-a860d741eea2",
  "order_id": "b3b54b4d-52c8-4d09-9fa3-33ad7224aa57",
  "assignment_id": "2b68ea3e-add7-4c15-8362-4d1245107614",
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
  "arrived_at": "2026-10-27T17:56:41.957406Z",
  "started_at": "2026-10-27T17:56:41.990167Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/3dca2824-592a-43d1-ad2e-5983ab7ed05e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:56:42Z",
    "sequence": 1793123802130
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3dca2824-592a-43d1-ad2e-5983ab7ed05e",
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
  "last_heartbeat_at": "2026-10-27T17:56:42.031024Z",
  "last_location_at": "2026-10-27T17:56:42.031024Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/b232afe6-a740-4e47-82e1-a860d741eea2/complete` → **200**

```json
{
  "command_id": "bb2d93f7-6baa-421d-b956-2bee4c2e2c08",
  "expected_version": 2,
  "reported_at": "2026-10-27T17:56:42Z",
  "cash_received": true
}
```

```json
{
  "id": "b232afe6-a740-4e47-82e1-a860d741eea2",
  "order_id": "b3b54b4d-52c8-4d09-9fa3-33ad7224aa57",
  "assignment_id": "2b68ea3e-add7-4c15-8362-4d1245107614",
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
  "arrived_at": "2026-10-27T17:56:41.957406Z",
  "started_at": "2026-10-27T17:56:41.990167Z",
  "completed_at": "2026-10-27T17:56:42.06261Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/b3b54b4d-52c8-4d09-9fa3-33ad7224aa57/rating` → **200**

```json
{
  "command_id": "57b59e3c-bc4e-4e50-bc5f-16b0cfaf65a9",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "b3b54b4d-52c8-4d09-9fa3-33ad7224aa57",
  "score": 5,
  "created_at": "2026-10-27T17:56:42.112139368Z"
}
```

`POST /api/driver/v1/orders/b3b54b4d-52c8-4d09-9fa3-33ad7224aa57/rating` → **200**

```json
{
  "command_id": "7dcf4f91-f443-4a17-be7d-a3d930c16fd2",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "b3b54b4d-52c8-4d09-9fa3-33ad7224aa57",
  "score": 4,
  "created_at": "2026-10-27T17:56:42.146360535Z"
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
  "session_id": "1ee98eec-8c74-40c9-bb7c-7fea286f599d",
  "subject": {
    "type": "STAFF",
    "id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWZhODRhMi01MjYxLTQxYTktYjczZS05ZDA0NzU3YjlmOGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQ3MDIsImlhdCI6MTc5MzEyMzgwMiwianRpIjoiOTU3MzU3ZTEtMmVhMS00ODU3LTgzMGMtMmFmMzE5Yjg1YmIwIiwic2lkIjoiMWVlOThlZWMtOGM3NC00MGM5LWJiN2MtN2ZlYTI4NmY1OTlkIn0.HTAn0OAWY0LIwkXj_b6JTaqLZFtVTxGnynl0NE88FfY",
  "access_expires_at": "2026-10-27T18:11:42.51142063Z",
  "refresh_token": "wXSYumakDez8GRbx4a63IOKa-Gn0Hq6hBZ7G0Dfeh5Y",
  "refresh_expires_at": "2026-10-28T05:56:42.510765286Z",
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
  "session_id": "a75a4080-ad03-4e61-a6eb-994e3862e332",
  "subject": {
    "type": "STAFF",
    "id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWZhODRhMi01MjYxLTQxYTktYjczZS05ZDA0NzU3YjlmOGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQ3MDIsImlhdCI6MTc5MzEyMzgwMiwianRpIjoiYTMzMTRlZmEtZDE0Zi00MmRiLWE2MjMtZmNlODBlYzBjMTE5Iiwic2lkIjoiYTc1YTQwODAtYWQwMy00ZTYxLWE2ZWItOTk0ZTM4NjJlMzMyIn0.wg1nJSYZZy21-SJ3zZj6RNXLkAFuak5EDq2VeRsq5lo",
  "access_expires_at": "2026-10-27T18:11:42.832195637Z",
  "refresh_token": "mdJ57l6uIB8t1EbfPaY8cnbxvpaKEEFm0huxb4dL0kU",
  "refresh_expires_at": "2026-10-28T05:56:42.831519835Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b3b54b4d-52c8-4d09-9fa3-33ad7224aa57/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "b3b54b4d-52c8-4d09-9fa3-33ad7224aa57",
      "author_type": "RIDER",
      "author_id": "c2b2653d-f425-4184-8b2d-aa9c23bae85e",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T17:56:42.112139Z"
    },
    {
      "order_id": "b3b54b4d-52c8-4d09-9fa3-33ad7224aa57",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "c2b2653d-f425-4184-8b2d-aa9c23bae85e",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T17:56:42.146361Z"
    }
  ]
}
```

Done: ratings for order b3b54b4d-52c8-4d09-9fa3-33ad7224aa57.

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
  "session_id": "f80f3d9d-fa8b-4b94-8126-5e279ec03618",
  "subject": {
    "type": "STAFF",
    "id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWZhODRhMi01MjYxLTQxYTktYjczZS05ZDA0NzU3YjlmOGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQ3MDMsImlhdCI6MTc5MzEyMzgwMywianRpIjoiMTRiMWYzMzgtODM4Yy00YmE5LWJkNWEtMmMzZTQ1YTY0MTlhIiwic2lkIjoiZjgwZjNkOWQtZmE4Yi00Yjk0LTgxMjYtNWUyNzllYzAzNjE4In0.VrHNWF6DHmyNQQhHQfqFwse07svwOKPRIe2iaVSqNVM",
  "access_expires_at": "2026-10-27T18:11:43.19971601Z",
  "refresh_token": "9psCswKIb0xKu6g_PEkDMiV6ay-DYkikT7JTrmifeR8",
  "refresh_expires_at": "2026-10-28T05:56:43.199146145Z",
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
  "command_id": "3bc2bbeb-b8a8-421c-a984-cb75f991f9be",
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
  "changed_by": "4efa84a2-5261-41a9-b73e-9d04757b9f8d",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T17:56:43.266687Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "3bc2bbeb-b8a8-421c-a984-cb75f991f9be",
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
  "changed_by": "4efa84a2-5261-41a9-b73e-9d04757b9f8d",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T17:56:43.266687Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48648573171",
  "device_ref": "sandbox-23305"
}
```

```json
{
  "challenge_id": "eff5be27-5d70-4289-9eca-f001f0d49d6f",
  "expires_at": "2026-10-27T18:01:43.343487861Z",
  "resend_available_at": "2026-10-27T17:56:44.343487861Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48648573171` → **200**

```json
{
  "phone": "+48648573171",
  "audience": "CLIENT",
  "code": "819681",
  "sent_at": "2026-10-27T17:56:43.345634022Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eff5be27-5d70-4289-9eca-f001f0d49d6f",
  "code": "819681",
  "device_ref": "sandbox-23305"
}
```

```json
{
  "session_id": "a009ae2d-fc55-455c-af61-9523acbffc0f",
  "subject": {
    "type": "CLIENT",
    "id": "475abb01-51d3-4255-889c-30c169100aa1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NzVhYmIwMS01MWQzLTQyNTUtODg5Yy0zMGMxNjkxMDBhYTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI0NzAzLCJpYXQiOjE3OTMxMjM4MDMsImp0aSI6ImJhNGFiMzRkLWMxMzAtNDY0ZS04N2JlLWYwNjEwODYwZjI1MiIsInNpZCI6ImEwMDlhZTJkLWZjNTUtNDU1Yy1hZjYxLTk1MjNhY2JmZmMwZiJ9.Es79PLjYDxhRLf3MjH8me2pNPCp-aiErABbC-zuablw",
  "access_expires_at": "2026-10-27T18:11:43.399060851Z",
  "refresh_token": "I7SogG5VQzArOJ4KsZ2QoZhMENGMf3x_c-KOug27SwI",
  "refresh_expires_at": "2026-11-26T17:56:43.398552782Z",
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
  "correlation_id": "2bfb5827-bb47-4e51-a695-1b5be803cbf9"
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
  "device_ref": "sandbox-13534"
}
```

```json
{
  "challenge_id": "fe19e09f-0b06-494d-a5e2-421d4a7dc796",
  "expires_at": "2026-10-27T18:01:43.475969802Z",
  "resend_available_at": "2026-10-27T17:56:44.475969802Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "116996",
  "sent_at": "2026-10-27T17:56:43.478162651Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fe19e09f-0b06-494d-a5e2-421d4a7dc796",
  "code": "116996",
  "device_ref": "sandbox-13534"
}
```

```json
{
  "session_id": "d6004028-4a53-42d3-918b-07f9d3c22882",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDcwMywiaWF0IjoxNzkzMTIzODAzLCJqdGkiOiJjMzA0YmYxNS02OTRlLTQxODItODRkNC1hYWQ4ODI3NjEzY2EiLCJzaWQiOiJkNjAwNDAyOC00YTUzLTQyZDMtOTE4Yi0wN2Y5ZDNjMjI4ODIifQ.ih3f-nhMwtsamc80YjxpUSIRGxY86aCsPQRWa9zhIEk",
  "access_expires_at": "2026-10-27T18:11:43.533006296Z",
  "refresh_token": "xUpoTSgSk4kckhqig4D5maf0eY9BVzWYhPg0BFoS1-s",
  "refresh_expires_at": "2026-11-26T17:56:43.532413959Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b1f4f031-4812-48b9-91a4-762130d0e2a3",
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
  "last_heartbeat_at": "2026-10-27T17:56:40.951109Z",
  "last_location_at": "2026-10-27T17:56:40.951109Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b1f4f031-4812-48b9-91a4-762130d0e2a3/handover` → **200**

```json
{
  "command_id": "b5225a5e-51de-4e1c-8132-d199db4a2812",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b1f4f031-4812-48b9-91a4-762130d0e2a3",
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
  "last_heartbeat_at": "2026-10-27T17:56:40.951109Z",
  "last_location_at": "2026-10-27T17:56:40.951109Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b1f4f031-4812-48b9-91a4-762130d0e2a3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:56:43Z",
    "sequence": 1793123803617
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b1f4f031-4812-48b9-91a4-762130d0e2a3",
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
  "last_heartbeat_at": "2026-10-27T17:56:43.636983Z",
  "last_location_at": "2026-10-27T17:56:43.636983Z",
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
  "session_id": "b1f4f031-4812-48b9-91a4-762130d0e2a3",
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
  "last_heartbeat_at": "2026-10-27T17:56:43.636983Z",
  "last_location_at": "2026-10-27T17:56:43.636983Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b1f4f031-4812-48b9-91a4-762130d0e2a3/close` → **200**

```json
{
  "command_id": "13e65d82-4764-4b1c-8987-637c24bbbe68",
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
  "correlation_id": "18a52c52-8a7b-4bce-9a88-565c1acff22a"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678837342",
  "device_ref": "sandbox-25315"
}
```

```json
{
  "challenge_id": "4c485846-c8e8-4f2b-ace7-5027734dca75",
  "expires_at": "2026-10-27T18:01:43.793947338Z",
  "resend_available_at": "2026-10-27T17:56:44.793947338Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678837342` → **200**

```json
{
  "phone": "+380678837342",
  "audience": "CLIENT",
  "code": "487728",
  "sent_at": "2026-10-27T17:56:43.795971261Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4c485846-c8e8-4f2b-ace7-5027734dca75",
  "code": "487728",
  "device_ref": "sandbox-25315"
}
```

```json
{
  "session_id": "4f39cef5-4225-402d-b49e-100a217c0353",
  "subject": {
    "type": "CLIENT",
    "id": "00029954-4b44-459d-996e-8438d2519cfc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMDAyOTk1NC00YjQ0LTQ1OWQtOTk2ZS04NDM4ZDI1MTljZmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI0NzAzLCJpYXQiOjE3OTMxMjM4MDMsImp0aSI6IjM3MGUzN2UzLTZhY2ItNGIxNi05ZjVkLWJhMWExMjhkMmEzNiIsInNpZCI6IjRmMzljZWY1LTQyMjUtNDAyZC1iNDllLTEwMGEyMTdjMDM1MyJ9.52cDepMYSUZu7lD_4mXqmC03WW00l4Jotu1W-IfHVhU",
  "access_expires_at": "2026-10-27T18:11:43.850232818Z",
  "refresh_token": "XR2cN1PM4X-k-LbDg3ek4FnmpVPk1trybsfNJGxeOKY",
  "refresh_expires_at": "2026-11-26T17:56:43.849615636Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "f97eacc1-d881-46c7-9a5d-ba06367a2222",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "24a4c2de-8330-40df-a32e-094bec00ce34",
  "upload_path": "/api/rider/v1/uploads/24a4c2de-8330-40df-a32e-094bec00ce34",
  "expires_at": "2026-10-27T18:11:43.89702416Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/24a4c2de-8330-40df-a32e-094bec00ce34` → **200**

```json
{
  "file_id": "24a4c2de-8330-40df-a32e-094bec00ce34",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "11431260-19bc-4979-877c-7478e1c30507",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "24a4c2de-8330-40df-a32e-094bec00ce34"
  ]
}
```

```json
{
  "id": "f42c1426-8feb-42ee-841c-6ad175b4ccf4",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "00029954-4b44-459d-996e-8438d2519cfc",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T17:56:43.964773Z",
  "updated_at": "2026-10-27T17:56:43.964773Z",
  "messages": [
    {
      "id": "45e1f1fa-36a9-4d17-9e07-e4327715ef11",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "00029954-4b44-459d-996e-8438d2519cfc",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T17:56:43.966113Z",
      "attachments": [
        {
          "file_id": "24a4c2de-8330-40df-a32e-094bec00ce34",
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
  "session_id": "47e57f0d-a40a-4f51-becf-32c912fe2aac",
  "subject": {
    "type": "STAFF",
    "id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWZhODRhMi01MjYxLTQxYTktYjczZS05ZDA0NzU3YjlmOGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQ3MDQsImlhdCI6MTc5MzEyMzgwNCwianRpIjoiMzlhNTgyN2EtZWI0OC00Y2ZjLTkyZmMtYmYzNzlhOTkzMzdmIiwic2lkIjoiNDdlNTdmMGQtYTQwYS00ZjUxLWJlY2YtMzJjOTEyZmUyYWFjIn0.bHA7W_KkaxFmyARyXUMlCkMJ0sjnKwoDL7AVQovrcZ8",
  "access_expires_at": "2026-10-27T18:11:44.30771786Z",
  "refresh_token": "_IRG69odAzmbfJ6SE39nIf710mYyy4AVPFtPzG2MlFE",
  "refresh_expires_at": "2026-10-28T05:56:44.30710924Z",
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
  "session_id": "b5e14ee2-aaf4-4ee8-9897-73fd462df987",
  "subject": {
    "type": "STAFF",
    "id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWZhODRhMi01MjYxLTQxYTktYjczZS05ZDA0NzU3YjlmOGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQ3MDQsImlhdCI6MTc5MzEyMzgwNCwianRpIjoiMzY3MGI2Y2YtZGNjYy00NzliLTgxMmEtMDU2NjhlYTY1ZDBkIiwic2lkIjoiYjVlMTRlZTItYWFmNC00ZWU4LTk4OTctNzNmZDQ2MmRmOTg3In0.YGL7c5Ivra8KF1O_Y7xTy2WvdUQdIr2SoR4pwFubY1s",
  "access_expires_at": "2026-10-27T18:11:44.627684207Z",
  "refresh_token": "sUL3ZMZ3ftknY35AphzwmQ7vVKsYDR3uzKH7ZOf1Qpg",
  "refresh_expires_at": "2026-10-28T05:56:44.627135382Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/f42c1426-8feb-42ee-841c-6ad175b4ccf4/attachments/24a4c2de-8330-40df-a32e-094bec00ce34` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "afebda79-7686-4d02-9dca-0fbde8156361",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "82774a38-945d-4b51-a286-4aafdccace56",
  "upload_path": "/api/operator/v1/uploads/82774a38-945d-4b51-a286-4aafdccace56",
  "expires_at": "2026-10-27T18:11:44.673566965Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/82774a38-945d-4b51-a286-4aafdccace56` → **200**

```json
{
  "file_id": "82774a38-945d-4b51-a286-4aafdccace56",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/f42c1426-8feb-42ee-841c-6ad175b4ccf4` → **200**

```json
{
  "id": "f42c1426-8feb-42ee-841c-6ad175b4ccf4",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "00029954-4b44-459d-996e-8438d2519cfc",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T17:56:43.964773Z",
  "updated_at": "2026-10-27T17:56:43.964773Z",
  "messages": [
    {
      "id": "45e1f1fa-36a9-4d17-9e07-e4327715ef11",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "00029954-4b44-459d-996e-8438d2519cfc",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T17:56:43.966113Z",
      "attachments": [
        {
          "file_id": "24a4c2de-8330-40df-a32e-094bec00ce34",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/f42c1426-8feb-42ee-841c-6ad175b4ccf4/comments` → **200**

```json
{
  "command_id": "573a5dae-1919-4e17-8f77-cb87df3173ff",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "82774a38-945d-4b51-a286-4aafdccace56"
  ]
}
```

```json
{
  "id": "f42c1426-8feb-42ee-841c-6ad175b4ccf4",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "00029954-4b44-459d-996e-8438d2519cfc",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T17:56:43.964773Z",
  "updated_at": "2026-10-27T17:56:44.76726Z",
  "messages": [
    {
      "id": "45e1f1fa-36a9-4d17-9e07-e4327715ef11",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "00029954-4b44-459d-996e-8438d2519cfc",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T17:56:43.966113Z",
      "attachments": [
        {
          "file_id": "24a4c2de-8330-40df-a32e-094bec00ce34",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "a1add437-7fe7-490a-b7b8-17c9c10eb721",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T17:56:44.766926Z",
      "attachments": [
        {
          "file_id": "82774a38-945d-4b51-a286-4aafdccace56",
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

`GET /api/rider/v1/support/cases/f42c1426-8feb-42ee-841c-6ad175b4ccf4` → **200**

```json
{
  "id": "f42c1426-8feb-42ee-841c-6ad175b4ccf4",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "00029954-4b44-459d-996e-8438d2519cfc",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T17:56:43.964773Z",
  "updated_at": "2026-10-27T17:56:44.76726Z",
  "messages": [
    {
      "id": "45e1f1fa-36a9-4d17-9e07-e4327715ef11",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "00029954-4b44-459d-996e-8438d2519cfc",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T17:56:43.966113Z",
      "attachments": [
        {
          "file_id": "24a4c2de-8330-40df-a32e-094bec00ce34",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "a1add437-7fe7-490a-b7b8-17c9c10eb721",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T17:56:44.766926Z",
      "attachments": [
        {
          "file_id": "82774a38-945d-4b51-a286-4aafdccace56",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/f42c1426-8feb-42ee-841c-6ad175b4ccf4/attachments/82774a38-945d-4b51-a286-4aafdccace56` → **200**

Done: support case f42c1426-8feb-42ee-841c-6ad175b4ccf4, rider attachment 24a4c2de-8330-40df-a32e-094bec00ce34, operator attachment 82774a38-945d-4b51-a286-4aafdccace56.

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
  "session_id": "e7ce99fd-30f1-4cf5-9189-93cfacab6119",
  "subject": {
    "type": "STAFF",
    "id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWZhODRhMi01MjYxLTQxYTktYjczZS05ZDA0NzU3YjlmOGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQ3MDUsImlhdCI6MTc5MzEyMzgwNSwianRpIjoiZTRiN2NmMmItZDA5YS00ZGU4LTgxZjMtYjdjYjVkMmM0NmZkIiwic2lkIjoiZTdjZTk5ZmQtMzBmMS00Y2Y1LTkxODktOTNjZmFjYWI2MTE5In0.CHAk4jAzppZKfA2XOvIL1VI7S1gz2XXIoZtCOI8rh88",
  "access_expires_at": "2026-10-27T18:11:45.151703242Z",
  "refresh_token": "c625Olvkm4nUHCnYvCAwjE2YdVDIOUL8DsrDEPEQndk",
  "refresh_expires_at": "2026-10-28T05:56:45.151143235Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-15894"
}
```

```json
{
  "challenge_id": "bc59d0db-0957-473a-985e-376bc2e4f978",
  "expires_at": "2026-10-27T18:01:45.177484254Z",
  "resend_available_at": "2026-10-27T17:56:46.177484254Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "725658",
  "sent_at": "2026-10-27T17:56:45.179595082Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc59d0db-0957-473a-985e-376bc2e4f978",
  "code": "725658",
  "device_ref": "sandbox-15894"
}
```

```json
{
  "session_id": "169432ea-dcfb-4345-b505-13be30bdc6e7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDcwNSwiaWF0IjoxNzkzMTIzODA1LCJqdGkiOiJiYzYxMTUyNy1hZmNjLTQyNjQtYjRhMS0wZjA1YjkwZDFkNmYiLCJzaWQiOiIxNjk0MzJlYS1kY2ZiLTQzNDUtYjUwNS0xM2JlMzBiZGM2ZTcifQ.KlVdnep7HLRlaHwBFOkR4kRVXlmsJoEfXqznyfOxE0g",
  "access_expires_at": "2026-10-27T18:11:45.232261569Z",
  "refresh_token": "7w3GlDCME14SJxHjcT9inGVT7H44vh4hV1tEK_8dZHI",
  "refresh_expires_at": "2026-11-26T17:56:45.231599821Z",
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
  "command_id": "d1873ddd-10dd-46b1-949b-e8f57764158a",
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
  "device_ref": "sandbox-6466"
}
```

```json
{
  "challenge_id": "176a6b05-fc9a-4701-951b-e18d633c0947",
  "expires_at": "2026-10-27T18:01:45.357570115Z",
  "resend_available_at": "2026-10-27T17:56:46.357570115Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "760897",
  "sent_at": "2026-10-27T17:56:45.359575786Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "176a6b05-fc9a-4701-951b-e18d633c0947",
  "code": "760897",
  "device_ref": "sandbox-6466"
}
```

```json
{
  "session_id": "e768940b-e4b1-4c43-b39f-56a8d1894ccd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDcwNSwiaWF0IjoxNzkzMTIzODA1LCJqdGkiOiI3NWRlZDQ5Yy05MTNmLTQ3MTgtYjIzNC1iM2UyZGM4NGYzZDYiLCJzaWQiOiJlNzY4OTQwYi1lNGIxLTRjNDMtYjM5Zi01NmE4ZDE4OTRjY2QifQ.EyvA2MRyLzpaHk1zYyme1_jhAE-evaO5xyaZ7QBXNuM",
  "access_expires_at": "2026-10-27T18:11:45.412261735Z",
  "refresh_token": "uVdISG8LwjUzvv6wz1Dpi4D2u-gnldIATqxrI53d-uQ",
  "refresh_expires_at": "2026-11-26T17:56:45.411752232Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3dca2824-592a-43d1-ad2e-5983ab7ed05e",
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
  "last_heartbeat_at": "2026-10-27T17:56:42.031024Z",
  "last_location_at": "2026-10-27T17:56:42.031024Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3dca2824-592a-43d1-ad2e-5983ab7ed05e/handover` → **200**

```json
{
  "command_id": "8581886c-63c5-4739-b5a9-fdc9cf8a2ac5",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3dca2824-592a-43d1-ad2e-5983ab7ed05e",
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
  "last_heartbeat_at": "2026-10-27T17:56:42.031024Z",
  "last_location_at": "2026-10-27T17:56:42.031024Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3dca2824-592a-43d1-ad2e-5983ab7ed05e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:56:45Z",
    "sequence": 1793123805498
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3dca2824-592a-43d1-ad2e-5983ab7ed05e",
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
  "last_heartbeat_at": "2026-10-27T17:56:45.519895Z",
  "last_location_at": "2026-10-27T17:56:45.519895Z",
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
  "command_id": "99653fa9-5429-4945-bc73-1c1db79099d5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:56:45Z",
    "sequence": 1793123805573
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e169c1d5-5cb5-4002-a7d6-999bbdbb0c78",
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
  "last_heartbeat_at": "2026-10-27T17:56:45.591145Z",
  "last_location_at": "2026-10-27T17:56:45.591145Z",
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
  "session_id": "8597ed3b-0af7-4e2b-a879-7b458112dd9b",
  "subject": {
    "type": "STAFF",
    "id": "4efa84a2-5261-41a9-b73e-9d04757b9f8d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWZhODRhMi01MjYxLTQxYTktYjczZS05ZDA0NzU3YjlmOGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQ3MDUsImlhdCI6MTc5MzEyMzgwNSwianRpIjoiOWY2OTM5ZGQtMzU3OS00MGFjLWEyMTItNTEyNDY4Yjg0MzQxIiwic2lkIjoiODU5N2VkM2ItMGFmNy00ZTJiLWE4NzktN2I0NTgxMTJkZDliIn0.Rt36L78K2vaYEt-RomvPsL0gvkKTefr38tqsyqFThV4",
  "access_expires_at": "2026-10-27T18:11:45.926651895Z",
  "refresh_token": "XbXjAFTFpRImifOf2Er2AQixt-wpW_JeVkSrOdpbQ-Q",
  "refresh_expires_at": "2026-10-28T05:56:45.926039073Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "0104a992-76fb-43bc-830c-8b445d931973",
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
  "id": "54402826-71f0-4334-bb1c-eea519ca7965",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T18:01:45.960576Z",
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
  "command_id": "8cc2baf3-9296-44e1-9412-7fd75f21dc85",
  "quote_id": "54402826-71f0-4334-bb1c-eea519ca7965",
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
  "id": "4192bb31-23a8-4c2b-a8f3-89c855073c08",
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
  "created_at": "2026-10-27T17:56:45.999918Z",
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
    "id": "491d0f92-0d7e-480d-84da-f86acef7d97b",
    "order_id": "4192bb31-23a8-4c2b-a8f3-89c855073c08",
    "expires_at": "2026-10-27T17:57:01.003473Z",
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

`POST /api/driver/v1/offers/491d0f92-0d7e-480d-84da-f86acef7d97b/accept` → **200**

```json
{
  "command_id": "65902b51-8db1-46f7-b9f5-7b9f10f68504"
}
```

```json
{
  "id": "79b965b0-69c5-4229-828d-2bd19eeedac2",
  "order_id": "4192bb31-23a8-4c2b-a8f3-89c855073c08",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4dc946ba-2067-45d2-9963-e43510dce937",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4dc946ba-2067-45d2-9963-e43510dce937",
  "order_id": "4192bb31-23a8-4c2b-a8f3-89c855073c08",
  "assignment_id": "79b965b0-69c5-4229-828d-2bd19eeedac2",
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

`POST /api/driver/v1/work-sessions/e169c1d5-5cb5-4002-a7d6-999bbdbb0c78/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:56:46Z",
    "sequence": 1793123806150
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e169c1d5-5cb5-4002-a7d6-999bbdbb0c78",
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
  "last_heartbeat_at": "2026-10-27T17:56:46.16975Z",
  "last_location_at": "2026-10-27T17:56:46.16975Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4dc946ba-2067-45d2-9963-e43510dce937/arrive` → **200**

```json
{
  "command_id": "667e0df4-d991-414f-aaba-097f801d0466",
  "expected_version": 0
}
```

```json
{
  "id": "4dc946ba-2067-45d2-9963-e43510dce937",
  "order_id": "4192bb31-23a8-4c2b-a8f3-89c855073c08",
  "assignment_id": "79b965b0-69c5-4229-828d-2bd19eeedac2",
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
  "arrived_at": "2026-10-27T17:56:46.206812Z",
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

`POST /api/driver/v1/trips/4dc946ba-2067-45d2-9963-e43510dce937/start` → **200**

```json
{
  "command_id": "1490e474-4dab-403e-a449-5fd0dc48ae97",
  "expected_version": 1
}
```

```json
{
  "id": "4dc946ba-2067-45d2-9963-e43510dce937",
  "order_id": "4192bb31-23a8-4c2b-a8f3-89c855073c08",
  "assignment_id": "79b965b0-69c5-4229-828d-2bd19eeedac2",
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
  "arrived_at": "2026-10-27T17:56:46.206812Z",
  "started_at": "2026-10-27T17:56:46.253285Z",
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

`POST /api/driver/v1/trips/4dc946ba-2067-45d2-9963-e43510dce937/complete` → **200**

```json
{
  "command_id": "073cb23d-c90f-4724-9022-ffe6a8e1d221",
  "expected_version": 2,
  "reported_at": "2026-10-27T17:56:46Z",
  "cash_received": true
}
```

```json
{
  "id": "4dc946ba-2067-45d2-9963-e43510dce937",
  "order_id": "4192bb31-23a8-4c2b-a8f3-89c855073c08",
  "assignment_id": "79b965b0-69c5-4229-828d-2bd19eeedac2",
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
  "arrived_at": "2026-10-27T17:56:46.206812Z",
  "started_at": "2026-10-27T17:56:46.253285Z",
  "completed_at": "2026-10-27T17:56:46.297312Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/4192bb31-23a8-4c2b-a8f3-89c855073c08` → **200**

```json
{
  "id": "4192bb31-23a8-4c2b-a8f3-89c855073c08",
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
    "id": "79b965b0-69c5-4229-828d-2bd19eeedac2",
    "order_id": "4192bb31-23a8-4c2b-a8f3-89c855073c08",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4dc946ba-2067-45d2-9963-e43510dce937",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T17:56:45.999918Z",
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
  "session_id": "3dca2824-592a-43d1-ad2e-5983ab7ed05e",
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
  "last_heartbeat_at": "2026-10-27T17:56:45.519895Z",
  "last_location_at": "2026-10-27T17:56:45.519895Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3dca2824-592a-43d1-ad2e-5983ab7ed05e/close` → **200**

```json
{
  "command_id": "f78c2cf3-a420-44df-807a-c313a99f3fec",
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
  "session_id": "e169c1d5-5cb5-4002-a7d6-999bbdbb0c78",
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
  "last_heartbeat_at": "2026-10-27T17:56:46.16975Z",
  "last_location_at": "2026-10-27T17:56:46.16975Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e169c1d5-5cb5-4002-a7d6-999bbdbb0c78/close` → **200**

```json
{
  "command_id": "6c44b5a6-d8ee-443c-8ff6-bf2be0b51cc6",
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

Done: terminal order 4192bb31-23a8-4c2b-a8f3-89c855073c08 by Andrii (5a000000-0000-4000-8000-000000000403).
