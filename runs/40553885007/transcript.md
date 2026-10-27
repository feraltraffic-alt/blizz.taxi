# Sandbox transcript (2026-10-27T17:48:28Z, 719337d)

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
  "correlation_id": "565fceec-6abc-44df-9dd5-9a48b37d19a3"
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
  "session_id": "750c4ef7-190a-45de-a2db-363abe6acb7b",
  "subject": {
    "type": "STAFF",
    "id": "1c94c3c8-7ece-415c-83ee-f2363504523f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzk0YzNjOC03ZWNlLTQxNWMtODNlZS1mMjM2MzUwNDUyM2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQyMDksImlhdCI6MTc5MzEyMzMwOSwianRpIjoiOTE2ODQxYzMtNWNiNS00MjEzLWExOTItNmU5ZmI3ZTY3NGQ0Iiwic2lkIjoiNzUwYzRlZjctMTkwYS00NWRlLWEyZGItMzYzYWJlNmFjYjdiIn0.YQSnjA0jsambaGTzi6AH0A17Be0rFjA18VNEy-iWbcI",
  "access_expires_at": "2026-10-27T18:03:29.188744335Z",
  "refresh_token": "2IQHzmX_W-Ccnq_w4N8gjRYsjpJq5Mxy4nSqGp0uevo",
  "refresh_expires_at": "2026-10-28T05:48:29.186781964Z",
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
  "session_id": "47acde87-24ca-46eb-b21b-c781e564049e",
  "subject": {
    "type": "STAFF",
    "id": "1c94c3c8-7ece-415c-83ee-f2363504523f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzk0YzNjOC03ZWNlLTQxNWMtODNlZS1mMjM2MzUwNDUyM2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQyMTAsImlhdCI6MTc5MzEyMzMxMCwianRpIjoiZmVlOTI2MTItY2FkMS00NTQ5LWE5NmUtZmJmZjUyN2IzMDYxIiwic2lkIjoiNDdhY2RlODctMjRjYS00NmViLWIyMWItYzc4MWU1NjQwNDllIn0.ILkRpJg8Nggg1iJTHk-c3MfL43kAlbUB2EdkythsOe8",
  "access_expires_at": "2026-10-27T18:03:30.396967037Z",
  "refresh_token": "GptMM_m_JxBiTlf-ljkmTC_TRTS4mYOUwz9Bm1KlE4k",
  "refresh_expires_at": "2026-10-28T05:48:30.396185799Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "c2c6961b-aab1-4c7a-bc68-afa1d4e82019",
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
  "id": "a00c54c4-c674-4465-a545-8f9296e6296f",
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
  "created_by": "1c94c3c8-7ece-415c-83ee-f2363504523f",
  "created_at": "2026-10-27T17:48:30.459072Z",
  "updated_at": "2026-10-27T17:48:30.459072Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630290852",
  "device_ref": "sandbox-28768"
}
```

```json
{
  "challenge_id": "6eb4a42d-1da0-4656-a551-562c7a0c50dd",
  "expires_at": "2026-10-27T17:53:30.505522679Z",
  "resend_available_at": "2026-10-27T17:48:31.505522679Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630290852` → **200**

```json
{
  "phone": "+380630290852",
  "audience": "CLIENT",
  "code": "562590",
  "sent_at": "2026-10-27T17:48:30.512466442Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6eb4a42d-1da0-4656-a551-562c7a0c50dd",
  "code": "562590",
  "device_ref": "sandbox-28768"
}
```

```json
{
  "session_id": "e4251de2-31a8-44ed-b9b2-b44a2812f279",
  "subject": {
    "type": "CLIENT",
    "id": "fcfce1ee-fbaa-4487-b612-39d7815e3b8e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2ZjZTFlZS1mYmFhLTQ0ODctYjYxMi0zOWQ3ODE1ZTNiOGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI0MjEwLCJpYXQiOjE3OTMxMjMzMTAsImp0aSI6Ijc3Y2Q3MGU2LTNhODgtNDc3YS05ZTE5LTk1Y2I3MGIyZGYzMiIsInNpZCI6ImU0MjUxZGUyLTMxYTgtNDRlZC1iOWIyLWI0NGEyODEyZjI3OSJ9.h0e_k-CGqIzGiFZlhwD-VTSwRGiklCNmQTzwTArou9o",
  "access_expires_at": "2026-10-27T18:03:30.58630117Z",
  "refresh_token": "QSBr5ICqkyU5mUNHVj67OmkGRyDKYRHEVsvjn4-TbAM",
  "refresh_expires_at": "2026-11-26T17:48:30.58535388Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380630290852` → **200**

```json
{
  "client_id": "fcfce1ee-fbaa-4487-b612-39d7815e3b8e"
}
```

`POST /api/admin/v1/rider-wallets/fcfce1ee-fbaa-4487-b612-39d7815e3b8e/top-ups` → **201**

```json
{
  "command_id": "60b44a8b-2e2f-4378-ad2b-ccf6a253213c",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "fcfce1ee-fbaa-4487-b612-39d7815e3b8e",
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
      "id": "7b4548d6-e5b2-4ae7-8a0b-eaed916e366c",
      "at": "2026-10-27T17:48:30.6673Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "1c94c3c8-7ece-415c-83ee-f2363504523f",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f927f38f-1e53-4b0f-b3e8-77bdce3f4b0d",
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
  "id": "6816948e-aa74-44a8-a50d-f7c5f5371216",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T17:53:31.015304Z",
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
      "id": "a00c54c4-c674-4465-a545-8f9296e6296f",
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
  "device_ref": "sandbox-794"
}
```

```json
{
  "challenge_id": "eae46a22-7b32-4bcc-a859-196734c0c929",
  "expires_at": "2026-10-27T17:53:31.077952877Z",
  "resend_available_at": "2026-10-27T17:48:32.077952877Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "585686",
  "sent_at": "2026-10-27T17:48:31.081332112Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eae46a22-7b32-4bcc-a859-196734c0c929",
  "code": "585686",
  "device_ref": "sandbox-794"
}
```

```json
{
  "session_id": "66a3936a-b871-46be-b868-189ac1bf8395",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDIxMSwiaWF0IjoxNzkzMTIzMzExLCJqdGkiOiJkZGIyYjYxMy01Nzc5LTQyNTgtOTQ5Ny01NjE0MGZlNDIxMmEiLCJzaWQiOiI2NmEzOTM2YS1iODcxLTQ2YmUtYjg2OC0xODlhYzFiZjgzOTUifQ.NnXJsLnOx6ulBo2jk55YzKcFSeT2M6ohTP0Pbzs6E6o",
  "access_expires_at": "2026-10-27T18:03:31.135408801Z",
  "refresh_token": "Nqr2MpIASoDw5ULWPzCeK1EX7osDQQZt79zDrpWPqzI",
  "refresh_expires_at": "2026-11-26T17:48:31.134532238Z",
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
  "command_id": "c7af66e1-e99a-4848-aeb5-be62035dcffa",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:48:31Z",
    "sequence": 1793123311247
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "550f7539-6f58-463f-9e08-c311e0247221",
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
  "last_heartbeat_at": "2026-10-27T17:48:31.282828Z",
  "last_location_at": "2026-10-27T17:48:31.282828Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8362ada8-a131-4e85-997f-68be22e9a51f",
  "quote_id": "6816948e-aa74-44a8-a50d-f7c5f5371216",
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
  "id": "7beb0fa9-fc75-4639-9381-9524de2a999e",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fcfce1ee-fbaa-4487-b612-39d7815e3b8e",
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
  "created_at": "2026-10-27T17:48:31.386674Z",
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
  "client_id": "fcfce1ee-fbaa-4487-b612-39d7815e3b8e",
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
      "id": "7b4548d6-e5b2-4ae7-8a0b-eaed916e366c",
      "at": "2026-10-27T17:48:30.6673Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "1c94c3c8-7ece-415c-83ee-f2363504523f",
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
    "id": "a65579ce-a9ac-4715-bb9f-10d1661820ab",
    "order_id": "7beb0fa9-fc75-4639-9381-9524de2a999e",
    "expires_at": "2026-10-27T17:48:46.399378Z",
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

`POST /api/driver/v1/offers/a65579ce-a9ac-4715-bb9f-10d1661820ab/accept` → **200**

```json
{
  "command_id": "5a60075f-230e-453c-addf-16b8663c7cac"
}
```

```json
{
  "id": "4c21b710-92a2-4c99-907a-cce2557996fc",
  "order_id": "7beb0fa9-fc75-4639-9381-9524de2a999e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8bf845ed-97e5-4140-ba0e-b7f8ed537b62",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8bf845ed-97e5-4140-ba0e-b7f8ed537b62",
  "order_id": "7beb0fa9-fc75-4639-9381-9524de2a999e",
  "assignment_id": "4c21b710-92a2-4c99-907a-cce2557996fc",
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

`POST /api/driver/v1/work-sessions/550f7539-6f58-463f-9e08-c311e0247221/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:48:31Z",
    "sequence": 1793123311581
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "550f7539-6f58-463f-9e08-c311e0247221",
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
  "last_heartbeat_at": "2026-10-27T17:48:31.612759Z",
  "last_location_at": "2026-10-27T17:48:31.612759Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8bf845ed-97e5-4140-ba0e-b7f8ed537b62/arrive` → **200**

```json
{
  "command_id": "6d4509e0-0518-4a27-b9b1-b99a8adb5954",
  "expected_version": 0
}
```

```json
{
  "id": "8bf845ed-97e5-4140-ba0e-b7f8ed537b62",
  "order_id": "7beb0fa9-fc75-4639-9381-9524de2a999e",
  "assignment_id": "4c21b710-92a2-4c99-907a-cce2557996fc",
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
  "arrived_at": "2026-10-27T17:48:31.658767Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8bf845ed-97e5-4140-ba0e-b7f8ed537b62/start` → **200**

```json
{
  "command_id": "da383e3e-1903-407e-bcce-ec0d0eabc043",
  "expected_version": 1
}
```

```json
{
  "id": "8bf845ed-97e5-4140-ba0e-b7f8ed537b62",
  "order_id": "7beb0fa9-fc75-4639-9381-9524de2a999e",
  "assignment_id": "4c21b710-92a2-4c99-907a-cce2557996fc",
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
  "arrived_at": "2026-10-27T17:48:31.658767Z",
  "started_at": "2026-10-27T17:48:31.700245Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/8bf845ed-97e5-4140-ba0e-b7f8ed537b62/complete` → **200**

```json
{
  "command_id": "1adb5926-b00a-42d6-af41-7b5491326d76",
  "expected_version": 2,
  "reported_at": "2026-10-27T17:48:31Z",
  "cash_received": true
}
```

```json
{
  "id": "8bf845ed-97e5-4140-ba0e-b7f8ed537b62",
  "order_id": "7beb0fa9-fc75-4639-9381-9524de2a999e",
  "assignment_id": "4c21b710-92a2-4c99-907a-cce2557996fc",
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
  "arrived_at": "2026-10-27T17:48:31.658767Z",
  "started_at": "2026-10-27T17:48:31.700245Z",
  "completed_at": "2026-10-27T17:48:31.761649Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "fcfce1ee-fbaa-4487-b612-39d7815e3b8e",
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
      "id": "e13fb732-88de-49b1-9b44-4f264d882c4c",
      "at": "2026-10-27T17:48:32.360963Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "7beb0fa9-fc75-4639-9381-9524de2a999e"
    },
    {
      "id": "7b4548d6-e5b2-4ae7-8a0b-eaed916e366c",
      "at": "2026-10-27T17:48:30.6673Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "1c94c3c8-7ece-415c-83ee-f2363504523f",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/a00c54c4-c674-4465-a545-8f9296e6296f/archive` → **200**

```json
{
  "command_id": "39326ee8-be81-445d-a7c2-f278be6d1253",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "a00c54c4-c674-4465-a545-8f9296e6296f",
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
  "created_by": "1c94c3c8-7ece-415c-83ee-f2363504523f",
  "created_at": "2026-10-27T17:48:30.459072Z",
  "updated_at": "2026-10-27T17:48:34.845637Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "550f7539-6f58-463f-9e08-c311e0247221",
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
  "last_heartbeat_at": "2026-10-27T17:48:31.612759Z",
  "last_location_at": "2026-10-27T17:48:31.612759Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/550f7539-6f58-463f-9e08-c311e0247221/close` → **200**

```json
{
  "command_id": "4dbc0f2e-dbc4-4e3c-941e-84edaddbbd6b",
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

Done: order 7beb0fa9-fc75-4639-9381-9524de2a999e.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639024274",
  "device_ref": "sandbox-3727"
}
```

```json
{
  "challenge_id": "6c263103-6f16-4523-a9aa-73b5ec6d7ad4",
  "expires_at": "2026-10-27T17:53:34.958210946Z",
  "resend_available_at": "2026-10-27T17:48:35.958210946Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639024274` → **200**

```json
{
  "phone": "+380639024274",
  "audience": "CLIENT",
  "code": "651795",
  "sent_at": "2026-10-27T17:48:34.961258992Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6c263103-6f16-4523-a9aa-73b5ec6d7ad4",
  "code": "651795",
  "device_ref": "sandbox-3727"
}
```

```json
{
  "session_id": "4ef8f7c4-ded9-4b84-acbd-07fdac183071",
  "subject": {
    "type": "CLIENT",
    "id": "15eca462-5a91-4d3a-a27b-bef6d3d848e9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNWVjYTQ2Mi01YTkxLTRkM2EtYTI3Yi1iZWY2ZDNkODQ4ZTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI0MjE1LCJpYXQiOjE3OTMxMjMzMTUsImp0aSI6ImZjNTAzYzkyLTZjMmUtNDJiYy1iMWY5LTcxNmExMmQzYWM2MiIsInNpZCI6IjRlZjhmN2M0LWRlZDktNGI4NC1hY2JkLTA3ZmRhYzE4MzA3MSJ9.cEhm3mDJ3sj4Juwa7aUtRiFzrvq_PbcvjbQ_NrI2Mgw",
  "access_expires_at": "2026-10-27T18:03:35.013603086Z",
  "refresh_token": "_H6mnAab7A5GXC1FHJk9-ybHQIau356jijj5T1ntC98",
  "refresh_expires_at": "2026-11-26T17:48:35.012712953Z",
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
        "pl": "Zmiana planów",
        "ru": "Передумал ехать",
        "en": "Changed my mind",
        "uk": "Передумав їхати"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long",
        "uk": "Довго чекати авто"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "pl": "Błędny adres",
        "ru": "Ошибся адресом",
        "en": "Wrong address",
        "uk": "Помилився адресою"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "pl": "Inny transport",
        "ru": "Уеду на другом транспорте",
        "en": "Found other transport",
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
  "device_ref": "sandbox-7453"
}
```

```json
{
  "challenge_id": "3a79e31a-95e5-45c5-9837-a322a29a82fd",
  "expires_at": "2026-10-27T17:53:35.068795676Z",
  "resend_available_at": "2026-10-27T17:48:36.068795676Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "173212",
  "sent_at": "2026-10-27T17:48:35.071786946Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3a79e31a-95e5-45c5-9837-a322a29a82fd",
  "code": "173212",
  "device_ref": "sandbox-7453"
}
```

```json
{
  "session_id": "1ae49c61-7e88-4079-aaa0-ded092145e99",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDIxNSwiaWF0IjoxNzkzMTIzMzE1LCJqdGkiOiJiMjRjMjk0NS05Njg4LTRhNzUtOWY2NS1kZGZhZDY3ZDQxNTIiLCJzaWQiOiIxYWU0OWM2MS03ZTg4LTQwNzktYWFhMC1kZWQwOTIxNDVlOTkifQ.cbPrP_S3YUip4m9JGyn0YaC_RHle9R5nn0_3uukVk_M",
  "access_expires_at": "2026-10-27T18:03:35.124627675Z",
  "refresh_token": "dOvKqlS-Z09kWdamNZ-fyNXpZcffh_c3Ww-gXlE7oPE",
  "refresh_expires_at": "2026-11-26T17:48:35.1239816Z",
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
        "pl": "Pasażer nie przyszedł",
        "ru": "Пассажир не вышел",
        "en": "Passenger did not show up",
        "uk": "Пасажир не вийшов"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "pl": "Awaria samochodu",
        "ru": "Неисправность автомобиля",
        "en": "Vehicle problem",
        "uk": "Несправність автомобіля"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "pl": "Nie mogę dojechać",
        "ru": "Не могу подъехать",
        "en": "Cannot reach the pickup",
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
  "session_id": "1ed81c49-9f1c-4584-969c-e6ae0024483b",
  "subject": {
    "type": "STAFF",
    "id": "1c94c3c8-7ece-415c-83ee-f2363504523f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzk0YzNjOC03ZWNlLTQxNWMtODNlZS1mMjM2MzUwNDUyM2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQyMTUsImlhdCI6MTc5MzEyMzMxNSwianRpIjoiYWFlYzZlMzMtODc3Zi00ZmRlLTg2MzYtNzlkZGMwZWNjZThhIiwic2lkIjoiMWVkODFjNDktOWYxYy00NTg0LTk2OWMtZTZhZTAwMjQ0ODNiIn0.2UFB1XQ2UDMNspy7Pr4MKbzmLGAIW0qUwntc_E6-jL0",
  "access_expires_at": "2026-10-27T18:03:35.432437696Z",
  "refresh_token": "UTUdOdkC64itjZEyVyilrqveBzjVkuS1JUCRuEVWMK8",
  "refresh_expires_at": "2026-10-28T05:48:35.431781746Z",
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
  "session_id": "ba2d04c0-0d93-4f8a-aec4-0ea1c20cecac",
  "subject": {
    "type": "STAFF",
    "id": "1c94c3c8-7ece-415c-83ee-f2363504523f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzk0YzNjOC03ZWNlLTQxNWMtODNlZS1mMjM2MzUwNDUyM2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQyMTUsImlhdCI6MTc5MzEyMzMxNSwianRpIjoiM2QzMWEyY2UtNmEwZi00MmNjLTgwYjItMDEzYjU4MzM5ZDZlIiwic2lkIjoiYmEyZDA0YzAtMGQ5My00ZjhhLWFlYzQtMGVhMWMyMGNlY2FjIn0.K_udG9kDYIwbVsJGilKSshYhVjJ6smoEx0UM4ywpGaM",
  "access_expires_at": "2026-10-27T18:03:35.719292674Z",
  "refresh_token": "nYyAP2Szru4Je055PqT5Ec_olpfSZ1_3o_mFCIrdFik",
  "refresh_expires_at": "2026-10-28T05:48:35.718609809Z",
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
        "pl": "Na prośbę pasażera",
        "ru": "Пассажир попросил",
        "en": "Passenger asked",
        "uk": "Пасажир попросив"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "pl": "Duplikat zamówienia",
        "ru": "Дубль заказа",
        "en": "Duplicate order",
        "uk": "Дубль замовлення"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "pl": "Brak wolnych aut",
        "ru": "Нет свободных машин",
        "en": "No cars available",
        "uk": "Немає вільних авто"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "pl": "Zamówienie testowe",
        "ru": "Тестовый заказ",
        "en": "Test order",
        "uk": "Тестове замовлення"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "pl": "Błąd operatora",
        "ru": "Ошибка оператора",
        "en": "Operator error",
        "uk": "Помилка оператора"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "pl": "Wypadek",
        "ru": "ДТП",
        "en": "Accident",
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
  "command_id": "bebffbb6-ca13-47de-b0c5-5e2139f0634d",
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
  "id": "933eff27-ce7a-4814-bbca-8b335e8227f0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T17:53:35.779207Z",
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
  "command_id": "06c36ea0-f09a-4786-b207-24eaa23e289f",
  "quote_id": "933eff27-ce7a-4814-bbca-8b335e8227f0",
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
  "id": "883624eb-019c-4830-8313-497588b083cf",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15eca462-5a91-4d3a-a27b-bef6d3d848e9",
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
  "created_at": "2026-10-27T17:48:35.81719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/883624eb-019c-4830-8313-497588b083cf` → **200**

```json
{
  "id": "883624eb-019c-4830-8313-497588b083cf",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15eca462-5a91-4d3a-a27b-bef6d3d848e9",
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
  "created_at": "2026-10-27T17:48:35.81719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/883624eb-019c-4830-8313-497588b083cf/cancel` → **200**

```json
{
  "command_id": "ef2678da-5816-4f66-a891-446ed404bdc5",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "883624eb-019c-4830-8313-497588b083cf",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "15eca462-5a91-4d3a-a27b-bef6d3d848e9",
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
  "created_at": "2026-10-27T17:48:35.81719Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "pl": "Zbyt długie oczekiwanie",
      "ru": "Долго ждать машину",
      "en": "The wait is too long",
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
  "command_id": "7b9bf518-6003-435f-a606-24ccc86fabad",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:48:35Z",
    "sequence": 1793123315940
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d8d46801-2897-4d20-b97f-e71916eeaf32",
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
  "last_heartbeat_at": "2026-10-27T17:48:35.95806Z",
  "last_location_at": "2026-10-27T17:48:35.95806Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-26791"
}
```

```json
{
  "challenge_id": "aca14c6d-e0a4-4779-824c-d775808b73ab",
  "expires_at": "2026-10-27T17:53:35.985773088Z",
  "resend_available_at": "2026-10-27T17:48:36.985773088Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "175615",
  "sent_at": "2026-10-27T17:48:35.988463118Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aca14c6d-e0a4-4779-824c-d775808b73ab",
  "code": "175615",
  "device_ref": "sandbox-26791"
}
```

```json
{
  "session_id": "5a4c7a5a-1a1d-469c-b166-da002de5cb64",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDIxNiwiaWF0IjoxNzkzMTIzMzE2LCJqdGkiOiJlOTliYjk2YS03Mzk2LTQwNGMtYmJiZi0xN2EzNjJhMzI5OWEiLCJzaWQiOiI1YTRjN2E1YS0xYTFkLTQ2OWMtYjE2Ni1kYTAwMmRlNWNiNjQifQ.7BOlGOa_fDNXcDn4MB_Te7FF1SF8JL3NV2KiwMOhQ84",
  "access_expires_at": "2026-10-27T18:03:36.040522314Z",
  "refresh_token": "79Vs7npMvYt7hUbo0KFLS588E79VtIGWd7eEu5Ow-88",
  "refresh_expires_at": "2026-11-26T17:48:36.039984717Z",
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
  "command_id": "7f8bc243-f99f-4d6b-9839-b871f8fc7cd7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:48:36Z",
    "sequence": 1793123316880
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "41fe8bd3-2d23-420f-8c2b-2d6cc3737bc1",
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
  "last_heartbeat_at": "2026-10-27T17:48:36.105174Z",
  "last_location_at": "2026-10-27T17:48:36.105174Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f32678e2-4792-4f60-90fc-7f23320b82ef",
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
  "id": "afe9d48d-2ecc-43cb-ae6a-8bb018638217",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T17:53:36.141167Z",
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
  "command_id": "00d34129-a641-4968-aeb6-c5dfb32582af",
  "quote_id": "afe9d48d-2ecc-43cb-ae6a-8bb018638217",
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
  "id": "2dcf12f0-4b7e-4fc3-b3e1-488e5e6cf05d",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15eca462-5a91-4d3a-a27b-bef6d3d848e9",
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
  "created_at": "2026-10-27T17:48:36.180037Z",
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
    "id": "ff52a397-0863-40a2-92b3-e8c3b3714080",
    "order_id": "2dcf12f0-4b7e-4fc3-b3e1-488e5e6cf05d",
    "expires_at": "2026-10-27T17:48:51.184151Z",
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

`POST /api/driver/v1/offers/ff52a397-0863-40a2-92b3-e8c3b3714080/accept` → **200**

```json
{
  "command_id": "e33d390d-4bc9-4bec-8eaf-833b0a9fb20e"
}
```

```json
{
  "id": "2c0679ee-c2df-4394-988e-04554b52aa3e",
  "order_id": "2dcf12f0-4b7e-4fc3-b3e1-488e5e6cf05d",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "28b9e45a-d451-4ec5-be0d-9299ae66c14e",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "28b9e45a-d451-4ec5-be0d-9299ae66c14e",
  "order_id": "2dcf12f0-4b7e-4fc3-b3e1-488e5e6cf05d",
  "assignment_id": "2c0679ee-c2df-4394-988e-04554b52aa3e",
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

`POST /api/driver/v1/trips/28b9e45a-d451-4ec5-be0d-9299ae66c14e/cancel` → **200**

```json
{
  "command_id": "0b761aa5-7ed9-4bd7-a3de-7f1a0abfb149",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "28b9e45a-d451-4ec5-be0d-9299ae66c14e",
  "order_id": "2dcf12f0-4b7e-4fc3-b3e1-488e5e6cf05d",
  "assignment_id": "2c0679ee-c2df-4394-988e-04554b52aa3e",
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

`GET /api/rider/v1/orders/2dcf12f0-4b7e-4fc3-b3e1-488e5e6cf05d` → **200**

```json
{
  "id": "2dcf12f0-4b7e-4fc3-b3e1-488e5e6cf05d",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "15eca462-5a91-4d3a-a27b-bef6d3d848e9",
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
    "id": "2c0679ee-c2df-4394-988e-04554b52aa3e",
    "order_id": "2dcf12f0-4b7e-4fc3-b3e1-488e5e6cf05d",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "28b9e45a-d451-4ec5-be0d-9299ae66c14e",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T17:48:36.180037Z",
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
    "id": "877abffa-ce18-4b27-8d4d-a535dd0ef3b9",
    "order_id": "2dcf12f0-4b7e-4fc3-b3e1-488e5e6cf05d",
    "expires_at": "2026-10-27T17:48:51.325488Z",
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

`POST /api/driver/v1/offers/877abffa-ce18-4b27-8d4d-a535dd0ef3b9/accept` → **200**

```json
{
  "command_id": "7118b8c2-ee1f-4c55-87c9-181228e348ac"
}
```

```json
{
  "id": "653402d1-c9ec-4654-891b-a321d09f39b8",
  "order_id": "2dcf12f0-4b7e-4fc3-b3e1-488e5e6cf05d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9d6b196f-c57e-431b-86ac-4b74548f5cb8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9d6b196f-c57e-431b-86ac-4b74548f5cb8",
  "order_id": "2dcf12f0-4b7e-4fc3-b3e1-488e5e6cf05d",
  "assignment_id": "653402d1-c9ec-4654-891b-a321d09f39b8",
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

`POST /api/driver/v1/trips/9d6b196f-c57e-431b-86ac-4b74548f5cb8/cancel` → **200**

```json
{
  "command_id": "358994a9-cad5-45af-af3d-4643c2072ba0",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "9d6b196f-c57e-431b-86ac-4b74548f5cb8",
  "order_id": "2dcf12f0-4b7e-4fc3-b3e1-488e5e6cf05d",
  "assignment_id": "653402d1-c9ec-4654-891b-a321d09f39b8",
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
    "id": "2dcf12f0-4b7e-4fc3-b3e1-488e5e6cf05d",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-27T17:48:36.180037Z",
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
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати"
      }
    },
    "pickup_at": null
  },
  {
    "id": "883624eb-019c-4830-8313-497588b083cf",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T17:48:35.81719Z",
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
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long",
        "uk": "Довго чекати авто"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/2dcf12f0-4b7e-4fc3-b3e1-488e5e6cf05d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T17:48:36.180826Z",
      "actor": {
        "type": "CLIENT",
        "id": "15eca462-5a91-4d3a-a27b-bef6d3d848e9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2dcf12f0-4b7e-4fc3-b3e1-488e5e6cf05d",
        "quote_id": "afe9d48d-2ecc-43cb-ae6a-8bb018638217",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T17:48:36.183201Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2dcf12f0-4b7e-4fc3-b3e1-488e5e6cf05d",
        "attempt_id": "0d791dae-5629-4b5f-ab4b-ae59faee63cb",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T17:48:36.196706Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ff52a397-0863-40a2-92b3-e8c3b3714080",
        "order_id": "2dcf12f0-4b7e-4fc3-b3e1-488e5e6cf05d",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T17:48:36.253351Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "ff52a397-0863-40a2-92b3-e8c3b3714080",
        "order_id": "2dcf12f0-4b7e-4fc3-b3e1-488e5e6cf05d",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "2c0679ee-c2df-4394-988e-04554b52aa3e"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 883624eb-019c-4830-8313-497588b083cf, 2dcf12f0-4b7e-4fc3-b3e1-488e5e6cf05d.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731284309",
  "device_ref": "sandbox-264"
}
```

```json
{
  "challenge_id": "0e915a3b-9a14-46dc-814c-d904f9ac9d6d",
  "expires_at": "2026-10-27T17:53:36.573424653Z",
  "resend_available_at": "2026-10-27T17:48:37.573424653Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380731284309` → **200**

```json
{
  "phone": "+380731284309",
  "audience": "CLIENT",
  "code": "899157",
  "sent_at": "2026-10-27T17:48:36.5758009Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0e915a3b-9a14-46dc-814c-d904f9ac9d6d",
  "code": "899157",
  "device_ref": "sandbox-264"
}
```

```json
{
  "session_id": "c959e4a2-2787-4435-94c4-545597fcb23c",
  "subject": {
    "type": "CLIENT",
    "id": "69d3651a-cf46-47c6-8784-c11c0c150bff"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OWQzNjUxYS1jZjQ2LTQ3YzYtODc4NC1jMTFjMGMxNTBiZmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI0MjE2LCJpYXQiOjE3OTMxMjMzMTYsImp0aSI6IjczYWRhYzk1LWY2M2ItNGU5OS1iZjJkLWQ3NmY1MjVhZTU5ZSIsInNpZCI6ImM5NTllNGEyLTI3ODctNDQzNS05NGM0LTU0NTU5N2ZjYjIzYyJ9.ETS6iZImH-gF5fqL-kGuHbbHX0nyuZYv1sb6psbHIe0",
  "access_expires_at": "2026-10-27T18:03:36.627997016Z",
  "refresh_token": "MAdonYkX4BRigrHtR2_G6YCU717C0lAWHDSevwOcO1Q",
  "refresh_expires_at": "2026-11-26T17:48:36.627478899Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "4ec6210b-07de-44f0-9407-1cf4a4d83eea",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "72e07d3a-e2a0-4448-8d2f-d952c3c9e01e",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-72e07d3a-e2a0-4448-8d2f-d952c3c9e01e",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "22f9834ff1e126a1cbac93b7cfd62add",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=72e07d3a-e2a0-4448-8d2f-d952c3c9e01e",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731284309"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=72e07d3a-e2a0-4448-8d2f-d952c3c9e01e",
  "expires_at": "2026-10-27T18:18:36.668079Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/72e07d3a-e2a0-4448-8d2f-d952c3c9e01e` → **200**

```json
{
  "id": "72e07d3a-e2a0-4448-8d2f-d952c3c9e01e",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T18:18:36.668079Z",
  "card": {
    "id": "dcaee2b3-3646-4074-9047-c1e9ef8f80e2",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5965",
    "card_type": "Visa",
    "created_at": "2026-10-27T17:48:36.713095Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "dcaee2b3-3646-4074-9047-c1e9ef8f80e2",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****5965",
      "card_type": "Visa",
      "created_at": "2026-10-27T17:48:36.713095Z"
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
  "device_ref": "sandbox-5864"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "0ad6395c-2668-49f8-87c1-958e706969ca",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-5864"
}
```

```json
{
  "challenge_id": "76384279-a654-4206-bed0-eada49bb1534",
  "expires_at": "2026-10-27T17:53:37.817505685Z",
  "resend_available_at": "2026-10-27T17:48:38.817505685Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "600436",
  "sent_at": "2026-10-27T17:48:37.819974551Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "76384279-a654-4206-bed0-eada49bb1534",
  "code": "600436",
  "device_ref": "sandbox-5864"
}
```

```json
{
  "session_id": "1e7252b1-e156-4691-8f0d-0ef5348672f4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDIxNywiaWF0IjoxNzkzMTIzMzE3LCJqdGkiOiIzMGI2MGFjNi1kYjFmLTQ5ZTktODg1NC02YTc3MDk2NGE0NjYiLCJzaWQiOiIxZTcyNTJiMS1lMTU2LTQ2OTEtOGYwZC0wZWY1MzQ4NjcyZjQifQ.sX4itwpyc5rDDumyz6cBj1ZyujRuS3Cc1LvNNFPWJ2Y",
  "access_expires_at": "2026-10-27T18:03:37.872582369Z",
  "refresh_token": "m1q-PLjGUd7WwpWIGCfXD7dO-pde2k2DnhfTsPy8RFY",
  "refresh_expires_at": "2026-11-26T17:48:37.871971227Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "41fe8bd3-2d23-420f-8c2b-2d6cc3737bc1",
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
  "last_heartbeat_at": "2026-10-27T17:48:36.105174Z",
  "last_location_at": "2026-10-27T17:48:36.105174Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/41fe8bd3-2d23-420f-8c2b-2d6cc3737bc1/handover` → **200**

```json
{
  "command_id": "7c880d70-4c9e-4df5-898a-786287e754b0",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "41fe8bd3-2d23-420f-8c2b-2d6cc3737bc1",
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
  "last_heartbeat_at": "2026-10-27T17:48:36.105174Z",
  "last_location_at": "2026-10-27T17:48:36.105174Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/41fe8bd3-2d23-420f-8c2b-2d6cc3737bc1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:48:37Z",
    "sequence": 1793123317958
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "41fe8bd3-2d23-420f-8c2b-2d6cc3737bc1",
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
  "last_heartbeat_at": "2026-10-27T17:48:37.977133Z",
  "last_location_at": "2026-10-27T17:48:37.977133Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c25f40c5-b69f-4e04-add4-695ce4ce1c2a",
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
  "id": "148ff343-a5dc-48b0-b835-83bb791a822c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T17:53:38.011439Z",
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
  "command_id": "51940820-b4da-4a30-a4a2-f4b21025d327",
  "quote_id": "148ff343-a5dc-48b0-b835-83bb791a822c",
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
  "id": "24150130-a2c5-46cc-987f-d67c9f6e4a1a",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "69d3651a-cf46-47c6-8784-c11c0c150bff",
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
  "created_at": "2026-10-27T17:48:38.047653Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/24150130-a2c5-46cc-987f-d67c9f6e4a1a` → **200**

```json
{
  "id": "24150130-a2c5-46cc-987f-d67c9f6e4a1a",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "69d3651a-cf46-47c6-8784-c11c0c150bff",
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
  "created_at": "2026-10-27T17:48:38.047653Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/24150130-a2c5-46cc-987f-d67c9f6e4a1a` → **200**

```json
{
  "id": "24150130-a2c5-46cc-987f-d67c9f6e4a1a",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "69d3651a-cf46-47c6-8784-c11c0c150bff",
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
  "created_at": "2026-10-27T17:48:38.047653Z",
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
    "id": "7e051d2b-4432-4de9-8681-866d0eb2dbc4",
    "order_id": "24150130-a2c5-46cc-987f-d67c9f6e4a1a",
    "expires_at": "2026-10-27T17:48:53.803205Z",
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

`POST /api/driver/v1/offers/7e051d2b-4432-4de9-8681-866d0eb2dbc4/accept` → **200**

```json
{
  "command_id": "b7b8b78e-c034-4d9a-bcf0-44e8fcffed20"
}
```

```json
{
  "id": "68fe8dfe-9690-4b57-b52d-fee56b6e38f5",
  "order_id": "24150130-a2c5-46cc-987f-d67c9f6e4a1a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0cc1dca7-4bce-4010-88db-783d5587151c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0cc1dca7-4bce-4010-88db-783d5587151c",
  "order_id": "24150130-a2c5-46cc-987f-d67c9f6e4a1a",
  "assignment_id": "68fe8dfe-9690-4b57-b52d-fee56b6e38f5",
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

`POST /api/driver/v1/work-sessions/41fe8bd3-2d23-420f-8c2b-2d6cc3737bc1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:48:39Z",
    "sequence": 1793123319211
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "41fe8bd3-2d23-420f-8c2b-2d6cc3737bc1",
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
  "last_heartbeat_at": "2026-10-27T17:48:39.229408Z",
  "last_location_at": "2026-10-27T17:48:39.229408Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0cc1dca7-4bce-4010-88db-783d5587151c/arrive` → **200**

```json
{
  "command_id": "b919bacb-9361-4bd4-9d71-9ed702a26b95",
  "expected_version": 0
}
```

```json
{
  "id": "0cc1dca7-4bce-4010-88db-783d5587151c",
  "order_id": "24150130-a2c5-46cc-987f-d67c9f6e4a1a",
  "assignment_id": "68fe8dfe-9690-4b57-b52d-fee56b6e38f5",
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
  "arrived_at": "2026-10-27T17:48:39.264426Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0cc1dca7-4bce-4010-88db-783d5587151c/start` → **200**

```json
{
  "command_id": "5e7a94a5-0743-4f78-be8f-bf6103a6e76d",
  "expected_version": 1
}
```

```json
{
  "id": "0cc1dca7-4bce-4010-88db-783d5587151c",
  "order_id": "24150130-a2c5-46cc-987f-d67c9f6e4a1a",
  "assignment_id": "68fe8dfe-9690-4b57-b52d-fee56b6e38f5",
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
  "arrived_at": "2026-10-27T17:48:39.264426Z",
  "started_at": "2026-10-27T17:48:39.303507Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0cc1dca7-4bce-4010-88db-783d5587151c/complete` → **200**

```json
{
  "command_id": "7ff53421-2f06-4070-9004-70884b15ea69",
  "expected_version": 2,
  "reported_at": "2026-10-27T17:48:39Z"
}
```

```json
{
  "id": "0cc1dca7-4bce-4010-88db-783d5587151c",
  "order_id": "24150130-a2c5-46cc-987f-d67c9f6e4a1a",
  "assignment_id": "68fe8dfe-9690-4b57-b52d-fee56b6e38f5",
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
  "arrived_at": "2026-10-27T17:48:39.264426Z",
  "started_at": "2026-10-27T17:48:39.303507Z",
  "completed_at": "2026-10-27T17:48:39.344815Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/24150130-a2c5-46cc-987f-d67c9f6e4a1a` → **200**

```json
{
  "id": "24150130-a2c5-46cc-987f-d67c9f6e4a1a",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "69d3651a-cf46-47c6-8784-c11c0c150bff",
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
    "id": "68fe8dfe-9690-4b57-b52d-fee56b6e38f5",
    "order_id": "24150130-a2c5-46cc-987f-d67c9f6e4a1a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0cc1dca7-4bce-4010-88db-783d5587151c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T17:48:38.047653Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/24150130-a2c5-46cc-987f-d67c9f6e4a1a` → **200**

```json
{
  "id": "24150130-a2c5-46cc-987f-d67c9f6e4a1a",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "69d3651a-cf46-47c6-8784-c11c0c150bff",
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
    "id": "68fe8dfe-9690-4b57-b52d-fee56b6e38f5",
    "order_id": "24150130-a2c5-46cc-987f-d67c9f6e4a1a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0cc1dca7-4bce-4010-88db-783d5587151c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T17:48:38.047653Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/24150130-a2c5-46cc-987f-d67c9f6e4a1a` → **200**

```json
{
  "id": "24150130-a2c5-46cc-987f-d67c9f6e4a1a",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "69d3651a-cf46-47c6-8784-c11c0c150bff",
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
    "id": "68fe8dfe-9690-4b57-b52d-fee56b6e38f5",
    "order_id": "24150130-a2c5-46cc-987f-d67c9f6e4a1a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0cc1dca7-4bce-4010-88db-783d5587151c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T17:48:38.047653Z",
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
      "id": "4833e16e-6ec9-43ea-9ed8-f60ea121d05e",
      "at": "2026-10-27T17:48:39.851483Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "24150130-a2c5-46cc-987f-d67c9f6e4a1a",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/24150130-a2c5-46cc-987f-d67c9f6e4a1a/tip` → **200**

```json
{
  "order_id": "24150130-a2c5-46cc-987f-d67c9f6e4a1a",
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
  "available_until": "2026-10-28T17:48:39.344815Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/24150130-a2c5-46cc-987f-d67c9f6e4a1a/tip` → **201**

```json
{
  "command_id": "59623aa2-4eb2-4962-9c58-61efc1a3f097",
  "amount_minor": 2500
}
```

```json
{
  "id": "0cab8f0e-ad29-4b60-94d1-c4e6e7c38693",
  "order_id": "24150130-a2c5-46cc-987f-d67c9f6e4a1a",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-27T17:48:41.552785Z"
}
```

`GET /api/rider/v1/orders/24150130-a2c5-46cc-987f-d67c9f6e4a1a/tip` → **200**

```json
{
  "order_id": "24150130-a2c5-46cc-987f-d67c9f6e4a1a",
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
  "available_until": "2026-10-28T17:48:39.344815Z",
  "open": false,
  "tip": {
    "id": "0cab8f0e-ad29-4b60-94d1-c4e6e7c38693",
    "order_id": "24150130-a2c5-46cc-987f-d67c9f6e4a1a",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-27T17:48:41.552785Z"
  }
}
```

`GET /api/rider/v1/orders/24150130-a2c5-46cc-987f-d67c9f6e4a1a/tip` → **200**

```json
{
  "order_id": "24150130-a2c5-46cc-987f-d67c9f6e4a1a",
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
  "available_until": "2026-10-28T17:48:39.344815Z",
  "open": false,
  "tip": {
    "id": "0cab8f0e-ad29-4b60-94d1-c4e6e7c38693",
    "order_id": "24150130-a2c5-46cc-987f-d67c9f6e4a1a",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-27T17:48:41.552785Z"
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
      "id": "4833e16e-6ec9-43ea-9ed8-f60ea121d05e",
      "at": "2026-10-27T17:48:39.851483Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "24150130-a2c5-46cc-987f-d67c9f6e4a1a",
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
      "id": "89960261-fb2a-43ad-9cb2-e419e7e5201f",
      "at": "2026-10-27T17:48:43.089507Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "24150130-a2c5-46cc-987f-d67c9f6e4a1a",
      "counterpart_id": null
    },
    {
      "id": "4833e16e-6ec9-43ea-9ed8-f60ea121d05e",
      "at": "2026-10-27T17:48:39.851483Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "24150130-a2c5-46cc-987f-d67c9f6e4a1a",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "41fe8bd3-2d23-420f-8c2b-2d6cc3737bc1",
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
  "last_heartbeat_at": "2026-10-27T17:48:39.229408Z",
  "last_location_at": "2026-10-27T17:48:39.229408Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/41fe8bd3-2d23-420f-8c2b-2d6cc3737bc1/close` → **200**

```json
{
  "command_id": "1646d612-f44a-474c-ac80-58e230045f78",
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

Done: card order 24150130-a2c5-46cc-987f-d67c9f6e4a1a.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737395833",
  "device_ref": "sandbox-26834"
}
```

```json
{
  "challenge_id": "bbff4339-1670-4fb4-9249-466b8f528380",
  "expires_at": "2026-10-27T17:53:43.748968151Z",
  "resend_available_at": "2026-10-27T17:48:44.748968151Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380737395833` → **200**

```json
{
  "phone": "+380737395833",
  "audience": "CLIENT",
  "code": "978060",
  "sent_at": "2026-10-27T17:48:43.751572982Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bbff4339-1670-4fb4-9249-466b8f528380",
  "code": "978060",
  "device_ref": "sandbox-26834"
}
```

```json
{
  "session_id": "5612c634-d260-4202-9b5d-efc6e9cd075e",
  "subject": {
    "type": "CLIENT",
    "id": "ffc3ea99-59b2-4c48-8424-93ed23245105"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZmMzZWE5OS01OWIyLTRjNDgtODQyNC05M2VkMjMyNDUxMDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI0MjIzLCJpYXQiOjE3OTMxMjMzMjMsImp0aSI6IjVmZTJhMmIxLTZmZDktNGQ5MS04ZGVkLTBjODQxMGI2MzMxMSIsInNpZCI6IjU2MTJjNjM0LWQyNjAtNDIwMi05YjVkLWVmYzZlOWNkMDc1ZSJ9.qiWpNYnt3du0ZQIjaHNXDfFO0lN2V4GfCaYbD3aBua0",
  "access_expires_at": "2026-10-27T18:03:43.801736943Z",
  "refresh_token": "Alp8Au4aoV2T6xQixpgl0AG0lwvVR_sDkuMZGkWZ6Z8",
  "refresh_expires_at": "2026-11-26T17:48:43.801186152Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "f49a1a43-989c-4efe-a14b-1d3aaf3b7237",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "10ce3a1f-2536-4f0e-b6cd-b2a3fda5cc6c",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-10ce3a1f-2536-4f0e-b6cd-b2a3fda5cc6c",
    "orderDate": "1793123323",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "0b9c49aa5d5c43cc85cd91ec0f3ce167",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=10ce3a1f-2536-4f0e-b6cd-b2a3fda5cc6c",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737395833"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=10ce3a1f-2536-4f0e-b6cd-b2a3fda5cc6c",
  "created_at": "2026-10-27T17:48:43.83439Z",
  "expires_at": "2026-10-27T18:18:43.83439Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/10ce3a1f-2536-4f0e-b6cd-b2a3fda5cc6c` → **200**

```json
{
  "id": "10ce3a1f-2536-4f0e-b6cd-b2a3fda5cc6c",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T17:48:43.83439Z",
  "expires_at": "2026-10-27T18:18:43.83439Z",
  "completed_at": "2026-10-27T17:48:43.86836Z",
  "masked_pan": "41****8990",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "ffc3ea99-59b2-4c48-8424-93ed23245105",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "ffc3ea99-59b2-4c48-8424-93ed23245105",
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
      "id": "520f8f93-ddbf-48c3-a2e8-f39b8a0c8fa3",
      "at": "2026-10-27T17:48:44.0999Z",
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
  "client_id": "ffc3ea99-59b2-4c48-8424-93ed23245105",
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
      "id": "520f8f93-ddbf-48c3-a2e8-f39b8a0c8fa3",
      "at": "2026-10-27T17:48:44.0999Z",
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
  "device_ref": "sandbox-21057"
}
```

```json
{
  "challenge_id": "ab9989b3-61d3-4177-a4b1-3320c661570f",
  "expires_at": "2026-10-27T17:53:44.987999851Z",
  "resend_available_at": "2026-10-27T17:48:45.987999851Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "607613",
  "sent_at": "2026-10-27T17:48:44.990528467Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ab9989b3-61d3-4177-a4b1-3320c661570f",
  "code": "607613",
  "device_ref": "sandbox-21057"
}
```

```json
{
  "session_id": "45ebfc75-d9a9-42c7-9c0e-f55f4fed7e27",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDIyNSwiaWF0IjoxNzkzMTIzMzI1LCJqdGkiOiJmN2Y0OWVkZC03OTdjLTRjMWUtYjE1Ny1kNWQ0OWM0NTBlMmQiLCJzaWQiOiI0NWViZmM3NS1kOWE5LTQyYzctOWMwZS1mNTVmNGZlZDdlMjcifQ.LObdJxbNmPysQmngsla6seoEjeiOqLAaOH6GKNtYcrY",
  "access_expires_at": "2026-10-27T18:03:45.113359292Z",
  "refresh_token": "ZOb0czAottliXRabw9abYq0rnXq-TlZtyjUjUL4YD40",
  "refresh_expires_at": "2026-11-26T17:48:45.112677894Z",
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
  "command_id": "6bcacbef-f7d9-4ef8-98e6-28db46d937c1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "82d405f6-dd96-4001-84ad-e932088d370e",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-82d405f6-dd96-4001-84ad-e932088d370e",
    "orderDate": "1793123325",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "56a0b0468b68e02845db18b318d1b768",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=82d405f6-dd96-4001-84ad-e932088d370e",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=82d405f6-dd96-4001-84ad-e932088d370e",
  "created_at": "2026-10-27T17:48:45.165603Z",
  "expires_at": "2026-10-27T18:18:45.165603Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/82d405f6-dd96-4001-84ad-e932088d370e` → **200**

```json
{
  "id": "82d405f6-dd96-4001-84ad-e932088d370e",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T17:48:45.165603Z",
  "expires_at": "2026-10-27T18:18:45.165603Z",
  "completed_at": "2026-10-27T17:48:45.19459Z",
  "masked_pan": "41****7837",
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
      "id": "a8a47b1d-ff12-429e-bea7-eb73760372f3",
      "at": "2026-10-27T17:48:46.152018Z",
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
  "command_id": "10d5bdf8-9509-46c8-8e1b-43e43538040f",
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
  "correlation_id": "c551d51c-dbca-46f6-8420-6c90172af727"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670894174",
  "device_ref": "sandbox-7453"
}
```

```json
{
  "challenge_id": "e5867f8e-557c-4339-860b-c6805a3f432f",
  "expires_at": "2026-10-27T17:53:46.329048822Z",
  "resend_available_at": "2026-10-27T17:48:47.329048822Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670894174` → **200**

```json
{
  "phone": "+380670894174",
  "audience": "CLIENT",
  "code": "940554",
  "sent_at": "2026-10-27T17:48:46.331572831Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e5867f8e-557c-4339-860b-c6805a3f432f",
  "code": "940554",
  "device_ref": "sandbox-7453"
}
```

```json
{
  "session_id": "28d21d3d-363f-4807-8ee4-2deb5301d5c2",
  "subject": {
    "type": "CLIENT",
    "id": "a10df6d7-22c0-4961-a867-6a5df22c2738"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMTBkZjZkNy0yMmMwLTQ5NjEtYTg2Ny02YTVkZjIyYzI3MzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI0MjI2LCJpYXQiOjE3OTMxMjMzMjYsImp0aSI6ImEyMmNiMDIyLWJlNzQtNDJmMS1iMjRhLTYwYzRkNjhjZTI0ZiIsInNpZCI6IjI4ZDIxZDNkLTM2M2YtNDgwNy04ZWU0LTJkZWI1MzAxZDVjMiJ9.YoSeskTbKP7OkCOW3qhQ30HRkNM6DNdZgq4jN7fB3YM",
  "access_expires_at": "2026-10-27T18:03:46.385395494Z",
  "refresh_token": "fOcnumXud0tQoK3BZHVUc1CE_tLRJpn99ML0Rr1vPqk",
  "refresh_expires_at": "2026-11-26T17:48:46.384747967Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a10df6d7-22c0-4961-a867-6a5df22c2738",
  "session_id": "28d21d3d-363f-4807-8ee4-2deb5301d5c2",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "67601ec9-a03d-4314-8b05-eba1a8311157",
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
  "id": "86f1c942-7f0c-4016-a06b-95b4a4c7ab27",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T17:53:46.440990Z",
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
  "challenge_id": "f4522398-7625-474a-83a7-4eaff2f6dec4",
  "expires_at": "2026-10-27T17:53:48.476320461Z",
  "resend_available_at": "2026-10-27T17:48:49.476320461Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670894174` → **200**

```json
{
  "phone": "+380670894174",
  "audience": "CLIENT",
  "code": "484518",
  "sent_at": "2026-10-27T17:48:48.478343349Z"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "6ca24049-594b-4448-b564-d36730c5052c",
  "challenge_id": "f4522398-7625-474a-83a7-4eaff2f6dec4",
  "otp_code": "484518"
}
```

```json
{
  "client_id": "a10df6d7-22c0-4961-a867-6a5df22c2738",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-27T17:48:48.54964389Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "d614c601-f56c-47c3-87f0-f00e6ac1495d",
  "quote_id": "86f1c942-7f0c-4016-a06b-95b4a4c7ab27",
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
  "correlation_id": "023d549a-41e3-4b9c-afab-f896e1fb9f72"
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
  "session_id": "18fb58cf-91d2-4b4e-a286-78c97e08ddf8",
  "subject": {
    "type": "STAFF",
    "id": "1c94c3c8-7ece-415c-83ee-f2363504523f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzk0YzNjOC03ZWNlLTQxNWMtODNlZS1mMjM2MzUwNDUyM2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQyMjgsImlhdCI6MTc5MzEyMzMyOCwianRpIjoiYTcxOTEwNDItZGMxZS00N2M5LTk0ZWUtZDkxYjlkMDYxNzNkIiwic2lkIjoiMThmYjU4Y2YtOTFkMi00YjRlLWEyODYtNzhjOTdlMDhkZGY4In0.MpYCNAtKyF8lArdhhogbB9cMytVBnkelxEi_zjxuHfw",
  "access_expires_at": "2026-10-27T18:03:48.874158414Z",
  "refresh_token": "7X4VI3sYXqkIAPSwgsa8vqfL115Ltuifi2zSbp22SqY",
  "refresh_expires_at": "2026-10-28T05:48:48.873589305Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "a10df6d7-22c0-4961-a867-6a5df22c2738",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-27T17:48:48.549644Z",
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

`POST /api/admin/v1/client-deletions/a10df6d7-22c0-4961-a867-6a5df22c2738/complete` → **200**

```json
{
  "command_id": "8444aecc-a498-4611-8619-01043588a5d5",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "a10df6d7-22c0-4961-a867-6a5df22c2738",
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
  "correlation_id": "314ce518-bf23-4327-882a-563314f36dcf"
}
```

Done: client a10df6d7-22c0-4961-a867-6a5df22c2738 anonymized.

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
  "device_ref": "sandbox-438"
}
```

```json
{
  "challenge_id": "0ad6f2c6-e9fb-4ea3-a15a-543446522519",
  "expires_at": "2026-10-27T17:53:49.181365948Z",
  "resend_available_at": "2026-10-27T17:48:50.181365948Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "438410",
  "sent_at": "2026-10-27T17:48:49.188219792Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0ad6f2c6-e9fb-4ea3-a15a-543446522519",
  "code": "438410",
  "device_ref": "sandbox-438"
}
```

```json
{
  "session_id": "2ec1ce93-eee3-42bf-ad5c-47817b3f518a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDIyOSwiaWF0IjoxNzkzMTIzMzI5LCJqdGkiOiI5ZWY3ZTM0Zi0zODA3LTRhOWQtODQ3OC01OGFmOWZmZTA1ZWQiLCJzaWQiOiIyZWMxY2U5My1lZWUzLTQyYmYtYWQ1Yy00NzgxN2IzZjUxOGEifQ.i2tfEetNUl50sPmPEw6nvhYpxsxZgeesWGvf2B2aW0g",
  "access_expires_at": "2026-10-27T18:03:49.243290624Z",
  "refresh_token": "OzrP9bYcnuaRE2BYvX7YogWVr1q8S9BnDQDuPFF-DHg",
  "refresh_expires_at": "2026-11-26T17:48:49.242808216Z",
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
  "command_id": "4c47569f-bcb6-48ab-89c5-3ecc03d9eca3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:48:49Z",
    "sequence": 1793123329290
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8a0de8fe-ee07-4f47-8337-bfacd48b48d9",
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
  "last_heartbeat_at": "2026-10-27T17:48:49.307201Z",
  "last_location_at": "2026-10-27T17:48:49.307201Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674160608",
  "device_ref": "sandbox-15272"
}
```

```json
{
  "challenge_id": "85ba4349-47f6-4101-8700-16089b81cc69",
  "expires_at": "2026-10-27T17:53:49.336839177Z",
  "resend_available_at": "2026-10-27T17:48:50.336839177Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674160608` → **200**

```json
{
  "phone": "+380674160608",
  "audience": "CLIENT",
  "code": "086786",
  "sent_at": "2026-10-27T17:48:49.365927534Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "85ba4349-47f6-4101-8700-16089b81cc69",
  "code": "086786",
  "device_ref": "sandbox-15272"
}
```

```json
{
  "session_id": "0ca89168-0be3-435d-85ac-de38acb8bbfe",
  "subject": {
    "type": "CLIENT",
    "id": "d0beb903-2b24-44cc-a2be-8e865723248a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMGJlYjkwMy0yYjI0LTQ0Y2MtYTJiZS04ZTg2NTcyMzI0OGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI0MjI5LCJpYXQiOjE3OTMxMjMzMjksImp0aSI6IjM1YjAzZjQwLWVlZjUtNDQyNS1iYzNmLTUxZmE5ZmQwOTE4ZSIsInNpZCI6IjBjYTg5MTY4LTBiZTMtNDM1ZC04NWFjLWRlMzhhY2I4YmJmZSJ9.4LR3b0knR0_TLpsrQ6oPp_xN_cOdRcQpamwLPR4L3aM",
  "access_expires_at": "2026-10-27T18:03:49.417418982Z",
  "refresh_token": "cIOHA8vTgNKVwEXAnpQx1slEMJlybVsSpX0G6gbGXEk",
  "refresh_expires_at": "2026-11-26T17:48:49.416919928Z",
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
  "command_id": "c6d5b686-2476-43ca-9579-61c17b1731d7",
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
  "id": "5eadbe0d-4b94-48a7-bbc5-74d5912b5888",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T17:53:49.477313Z",
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
  "command_id": "6794b9ab-ee9d-41fe-95fa-686994c6d162",
  "platform": "ANDROID",
  "token": "sandbox-driver-335d0d5b-35e5-4fb2-94e7-993ef5c9c562"
}
```

```json
{
  "id": "bc320bdf-9748-4628-821b-030ec639c52a",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T17:48:49.516551Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "31fb28a3-76db-4e39-a4e7-dc4c91c1a575",
  "platform": "ANDROID",
  "token": "sandbox-rider-b7c6fa46-1490-448f-8971-c14d2407c87f"
}
```

```json
{
  "id": "ad0f68ef-a80a-4841-a637-353d72f76005",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T17:48:49.557683Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "da8551f8-47f9-4048-a395-9ce7e3ac56c6",
  "quote_id": "5eadbe0d-4b94-48a7-bbc5-74d5912b5888",
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
  "id": "292cfe58-de9e-49db-a3d4-0c93e4e6f2c7",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d0beb903-2b24-44cc-a2be-8e865723248a",
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
  "created_at": "2026-10-27T17:48:49.664617Z",
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
    "id": "75d4dbaf-ea3c-4544-a7e3-d72d7d042ded",
    "order_id": "292cfe58-de9e-49db-a3d4-0c93e4e6f2c7",
    "expires_at": "2026-10-27T17:49:04.667752Z",
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

`POST /api/driver/v1/offers/75d4dbaf-ea3c-4544-a7e3-d72d7d042ded/accept` → **200**

```json
{
  "command_id": "8f3bbacd-b62e-4645-86bb-6ccd046d7429"
}
```

```json
{
  "id": "bf6339ee-76f5-4575-86aa-70d0cda5f692",
  "order_id": "292cfe58-de9e-49db-a3d4-0c93e4e6f2c7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "151ebf3e-f831-45d7-943d-e8f6362e2a94",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T17:48:49.643Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T17:48:49.643Z` → **200**

```json
[
  {
    "at": "2026-10-27T17:48:50.357939429Z",
    "token_suffix": "c9c562",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "be388bff-841d-4349-9644-a68df95bb6e0",
      "order_version": "2",
      "order_id": "292cfe58-de9e-49db-a3d4-0c93e4e6f2c7",
      "type": "driver.offer",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380674160608&after=2026-10-27T17:48:49.643Z` → **200**

```json
[
  {
    "at": "2026-10-27T17:48:50.3596628Z",
    "token_suffix": "07c87f",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "286ccc86-64bd-4032-9a06-93658297458f",
      "order_version": "3",
      "order_id": "292cfe58-de9e-49db-a3d4-0c93e4e6f2c7",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/292cfe58-de9e-49db-a3d4-0c93e4e6f2c7/messages` → **201**

```json
{
  "command_id": "09f8b17b-0358-4d59-9df3-5c328613a476",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "8e217ec0-c0d7-4593-8518-0f54b0097a31",
  "order_id": "292cfe58-de9e-49db-a3d4-0c93e4e6f2c7",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T17:48:50.845180463Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "151ebf3e-f831-45d7-943d-e8f6362e2a94",
  "order_id": "292cfe58-de9e-49db-a3d4-0c93e4e6f2c7",
  "assignment_id": "bf6339ee-76f5-4575-86aa-70d0cda5f692",
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

`POST /api/driver/v1/trips/151ebf3e-f831-45d7-943d-e8f6362e2a94/messages` → **201**

```json
{
  "command_id": "12df1d33-232e-4486-a785-1d649a195fbb",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "a39a32e6-9cdb-48bf-807c-436edf22576c",
  "order_id": "292cfe58-de9e-49db-a3d4-0c93e4e6f2c7",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T17:48:50.896489091Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/292cfe58-de9e-49db-a3d4-0c93e4e6f2c7/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/151ebf3e-f831-45d7-943d-e8f6362e2a94/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674160608"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/8a0de8fe-ee07-4f47-8337-bfacd48b48d9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:48:50Z",
    "sequence": 1793123330965
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8a0de8fe-ee07-4f47-8337-bfacd48b48d9",
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
  "last_heartbeat_at": "2026-10-27T17:48:50.983236Z",
  "last_location_at": "2026-10-27T17:48:50.983236Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "151ebf3e-f831-45d7-943d-e8f6362e2a94",
  "order_id": "292cfe58-de9e-49db-a3d4-0c93e4e6f2c7",
  "assignment_id": "bf6339ee-76f5-4575-86aa-70d0cda5f692",
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

`POST /api/driver/v1/trips/151ebf3e-f831-45d7-943d-e8f6362e2a94/arrive` → **200**

```json
{
  "command_id": "c44331f1-fc27-4f84-8b79-be848bbe1294",
  "expected_version": 0
}
```

```json
{
  "id": "151ebf3e-f831-45d7-943d-e8f6362e2a94",
  "order_id": "292cfe58-de9e-49db-a3d4-0c93e4e6f2c7",
  "assignment_id": "bf6339ee-76f5-4575-86aa-70d0cda5f692",
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
  "arrived_at": "2026-10-27T17:48:51.134247Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/151ebf3e-f831-45d7-943d-e8f6362e2a94/start` → **200**

```json
{
  "command_id": "3f2c3f6f-4721-4c6f-89f2-502a2f0c4968",
  "expected_version": 1
}
```

```json
{
  "id": "151ebf3e-f831-45d7-943d-e8f6362e2a94",
  "order_id": "292cfe58-de9e-49db-a3d4-0c93e4e6f2c7",
  "assignment_id": "bf6339ee-76f5-4575-86aa-70d0cda5f692",
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
  "arrived_at": "2026-10-27T17:48:51.134247Z",
  "started_at": "2026-10-27T17:48:51.165365Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/8a0de8fe-ee07-4f47-8337-bfacd48b48d9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:48:51Z",
    "sequence": 1793123331186
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8a0de8fe-ee07-4f47-8337-bfacd48b48d9",
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
  "last_heartbeat_at": "2026-10-27T17:48:51.204547Z",
  "last_location_at": "2026-10-27T17:48:51.204547Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/151ebf3e-f831-45d7-943d-e8f6362e2a94/complete` → **200**

```json
{
  "command_id": "f2995a5d-a158-4a2f-8b1b-1607735d0b6d",
  "expected_version": 2,
  "reported_at": "2026-10-27T17:48:51Z",
  "cash_received": true
}
```

```json
{
  "id": "151ebf3e-f831-45d7-943d-e8f6362e2a94",
  "order_id": "292cfe58-de9e-49db-a3d4-0c93e4e6f2c7",
  "assignment_id": "bf6339ee-76f5-4575-86aa-70d0cda5f692",
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
  "arrived_at": "2026-10-27T17:48:51.134247Z",
  "started_at": "2026-10-27T17:48:51.165365Z",
  "completed_at": "2026-10-27T17:48:51.237234Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/292cfe58-de9e-49db-a3d4-0c93e4e6f2c7` → **200**

```json
{
  "id": "292cfe58-de9e-49db-a3d4-0c93e4e6f2c7",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "d0beb903-2b24-44cc-a2be-8e865723248a",
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
    "id": "bf6339ee-76f5-4575-86aa-70d0cda5f692",
    "order_id": "292cfe58-de9e-49db-a3d4-0c93e4e6f2c7",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "151ebf3e-f831-45d7-943d-e8f6362e2a94",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T17:48:49.664617Z",
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
    "id": "292cfe58-de9e-49db-a3d4-0c93e4e6f2c7",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-27T17:48:49.664617Z",
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
    "id": "151ebf3e-f831-45d7-943d-e8f6362e2a94",
    "order_id": "292cfe58-de9e-49db-a3d4-0c93e4e6f2c7",
    "order_short_number": 5,
    "created_at": "2026-10-27T17:48:49.730078Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "8bf845ed-97e5-4140-ba0e-b7f8ed537b62",
    "order_id": "7beb0fa9-fc75-4639-9381-9524de2a999e",
    "order_short_number": 1,
    "created_at": "2026-10-27T17:48:31.526363Z",
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

`GET /api/rider/v1/orders/292cfe58-de9e-49db-a3d4-0c93e4e6f2c7/tip` → **200**

```json
{
  "order_id": "292cfe58-de9e-49db-a3d4-0c93e4e6f2c7",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
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
  "available_until": "2026-10-28T17:48:51.237234Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/292cfe58-de9e-49db-a3d4-0c93e4e6f2c7/tip` → **201**

```json
{
  "command_id": "06b5f959-21fd-42ff-a601-5ef418128c44",
  "amount_minor": 1100
}
```

```json
{
  "id": "dd469773-7b6f-4896-9294-a86678580e7a",
  "order_id": "292cfe58-de9e-49db-a3d4-0c93e4e6f2c7",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-27T17:48:54.427553Z"
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
  "session_id": "6f199caa-a3d1-487c-a0f9-b14f6b53a943",
  "subject": {
    "type": "STAFF",
    "id": "1c94c3c8-7ece-415c-83ee-f2363504523f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzk0YzNjOC03ZWNlLTQxNWMtODNlZS1mMjM2MzUwNDUyM2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQyMzQsImlhdCI6MTc5MzEyMzMzNCwianRpIjoiNDE1NjMxYmYtNjljZS00M2IwLWFiOWQtYWE3NDUyMzkyOTI0Iiwic2lkIjoiNmYxOTljYWEtYTNkMS00ODdjLWEwZjktYjE0ZjZiNTNhOTQzIn0.JnksR21uOHK7CTJU5cXk2d3ceXR-pDNAfU4UiVIRM8w",
  "access_expires_at": "2026-10-27T18:03:54.727265253Z",
  "refresh_token": "4gu3YawSrE0kECu-moxh7axINIhRPVe0Bc2WCuApykw",
  "refresh_expires_at": "2026-10-28T05:48:54.726645512Z",
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
  "session_id": "fc04ce5e-3345-4867-85a5-23d1b84d08b7",
  "subject": {
    "type": "STAFF",
    "id": "1c94c3c8-7ece-415c-83ee-f2363504523f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzk0YzNjOC03ZWNlLTQxNWMtODNlZS1mMjM2MzUwNDUyM2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQyMzUsImlhdCI6MTc5MzEyMzMzNSwianRpIjoiNmE0MDQ0ODAtY2ZkZC00Y2RiLTkwMzYtNzg2YzUwNTk2NDM4Iiwic2lkIjoiZmMwNGNlNWUtMzM0NS00ODY3LTg1YTUtMjNkMWI4NGQwOGI3In0.HzhL1YMVBQ1Ue343gLNlQu-hRVYQr2ArUNsXpe-Vj3E",
  "access_expires_at": "2026-10-27T18:03:55.011890929Z",
  "refresh_token": "w2rl8iGiUo0b7t9D2RRyXWhJkU09Wi7xG5LmaPBKI5U",
  "refresh_expires_at": "2026-10-28T05:48:55.011430003Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/292cfe58-de9e-49db-a3d4-0c93e4e6f2c7/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T17:48:49.665207Z",
      "actor": {
        "type": "CLIENT",
        "id": "d0beb903-2b24-44cc-a2be-8e865723248a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "292cfe58-de9e-49db-a3d4-0c93e4e6f2c7",
        "quote_id": "5eadbe0d-4b94-48a7-bbc5-74d5912b5888",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T17:48:49.666934Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "292cfe58-de9e-49db-a3d4-0c93e4e6f2c7",
        "attempt_id": "03cc4f79-412e-497a-9adb-89b91b96aec4",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T17:48:49.672285Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "75d4dbaf-ea3c-4544-a7e3-d72d7d042ded",
        "order_id": "292cfe58-de9e-49db-a3d4-0c93e4e6f2c7",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T17:48:49.731788Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "75d4dbaf-ea3c-4544-a7e3-d72d7d042ded",
        "order_id": "292cfe58-de9e-49db-a3d4-0c93e4e6f2c7",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "bf6339ee-76f5-4575-86aa-70d0cda5f692"
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
  "at": "2026-10-27T17:48:55.059141868Z",
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
      "last_location_at": "2026-10-27T17:48:51.204547Z",
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
      "last_location_at": "2026-10-27T17:48:35.95806Z",
      "order_id": null
    }
  ]
}
```

Done: order 292cfe58-de9e-49db-a3d4-0c93e4e6f2c7.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-4593"
}
```

```json
{
  "challenge_id": "5626e800-e47d-4a30-9403-bcf03372164c",
  "expires_at": "2026-10-27T17:53:55.098373033Z",
  "resend_available_at": "2026-10-27T17:48:56.098373033Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "250238",
  "sent_at": "2026-10-27T17:48:55.109487537Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5626e800-e47d-4a30-9403-bcf03372164c",
  "code": "250238",
  "device_ref": "sandbox-4593"
}
```

```json
{
  "session_id": "1808bc3b-de5c-4a1e-a73d-97cda1d74d7e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDIzNSwiaWF0IjoxNzkzMTIzMzM1LCJqdGkiOiI0YzhkYjNlMy0yYmJhLTQ1NzUtOGYwYy1mMWRiOTg2ZTIzNTAiLCJzaWQiOiIxODA4YmMzYi1kZTVjLTRhMWUtYTczZC05N2NkYTFkNzRkN2UifQ.iQYmpcM7fQuVB1XZLBx2UZrbBtasl8TEX-b19nZX-EE",
  "access_expires_at": "2026-10-27T18:03:55.15905368Z",
  "refresh_token": "16rXxZoh782HCZtN8vJaQZygYljjlL_3jsDMK7gLprs",
  "refresh_expires_at": "2026-11-26T17:48:55.158519534Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8a0de8fe-ee07-4f47-8337-bfacd48b48d9",
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
  "last_heartbeat_at": "2026-10-27T17:48:51.204547Z",
  "last_location_at": "2026-10-27T17:48:51.204547Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8a0de8fe-ee07-4f47-8337-bfacd48b48d9/handover` → **200**

```json
{
  "command_id": "7ae852fc-4882-43a4-b98c-192c08f652d0",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8a0de8fe-ee07-4f47-8337-bfacd48b48d9",
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
  "last_heartbeat_at": "2026-10-27T17:48:51.204547Z",
  "last_location_at": "2026-10-27T17:48:51.204547Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8a0de8fe-ee07-4f47-8337-bfacd48b48d9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:48:55Z",
    "sequence": 1793123335237
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8a0de8fe-ee07-4f47-8337-bfacd48b48d9",
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
  "last_heartbeat_at": "2026-10-27T17:48:55.254699Z",
  "last_location_at": "2026-10-27T17:48:55.254699Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666065176",
  "device_ref": "sandbox-13369"
}
```

```json
{
  "challenge_id": "130f2b85-be10-4a09-8a9f-ee853b867c93",
  "expires_at": "2026-10-27T17:53:55.277611464Z",
  "resend_available_at": "2026-10-27T17:48:56.277611464Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666065176` → **200**

```json
{
  "phone": "+380666065176",
  "audience": "CLIENT",
  "code": "295938",
  "sent_at": "2026-10-27T17:48:55.279413744Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "130f2b85-be10-4a09-8a9f-ee853b867c93",
  "code": "295938",
  "device_ref": "sandbox-13369"
}
```

```json
{
  "session_id": "f3ab3b27-4fcf-491d-9279-2bc4f561a250",
  "subject": {
    "type": "CLIENT",
    "id": "61661d1d-67c7-457f-9ae9-e092eb2984c6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTY2MWQxZC02N2M3LTQ1N2YtOWFlOS1lMDkyZWIyOTg0YzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI0MjM1LCJpYXQiOjE3OTMxMjMzMzUsImp0aSI6Ijg1ODMyNjFkLTY1NTYtNDI3Mi1hOTYwLWQ2ZGQ1NDI3YWE1MSIsInNpZCI6ImYzYWIzYjI3LTRmY2YtNDkxZC05Mjc5LTJiYzRmNTYxYTI1MCJ9.cyAR6y7NZIGTSdvBhs65EohImeATB9P8CUeCYo-MC_8",
  "access_expires_at": "2026-10-27T18:03:55.330119081Z",
  "refresh_token": "W3oVaImD9rLrSHQnR7yUNQBXmgGAolG2x-zQm1r5y7w",
  "refresh_expires_at": "2026-11-26T17:48:55.329598365Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "305690a4-34fa-4a4d-9c1b-326293282ec2",
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
  "id": "a0fe5922-9514-41ec-b3fb-5bfa97921041",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T17:53:55.362706Z",
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
  "command_id": "8fe9767c-8910-41a7-ab22-62435a9bab90",
  "quote_id": "a0fe5922-9514-41ec-b3fb-5bfa97921041",
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
  "id": "a69809ce-2890-4f34-ac35-1b949dd7795c",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "61661d1d-67c7-457f-9ae9-e092eb2984c6",
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
  "created_at": "2026-10-27T17:48:55.397603Z",
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
    "id": "41b19162-3f22-4429-8e94-6d2b206517a7",
    "order_id": "a69809ce-2890-4f34-ac35-1b949dd7795c",
    "expires_at": "2026-10-27T17:49:10.401453Z",
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

`POST /api/driver/v1/offers/41b19162-3f22-4429-8e94-6d2b206517a7/accept` → **200**

```json
{
  "command_id": "d5cff744-9f3e-46cf-b98c-642c83e7f8c1"
}
```

```json
{
  "id": "a2698bbd-fce5-449c-b6b2-50c7c2b8b302",
  "order_id": "a69809ce-2890-4f34-ac35-1b949dd7795c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5b4f44c6-47c2-486f-b366-2cfd886d292c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5b4f44c6-47c2-486f-b366-2cfd886d292c",
  "order_id": "a69809ce-2890-4f34-ac35-1b949dd7795c",
  "assignment_id": "a2698bbd-fce5-449c-b6b2-50c7c2b8b302",
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

`POST /api/driver/v1/work-sessions/8a0de8fe-ee07-4f47-8337-bfacd48b48d9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:48:55Z",
    "sequence": 1793123335500
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8a0de8fe-ee07-4f47-8337-bfacd48b48d9",
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
  "last_heartbeat_at": "2026-10-27T17:48:55.517022Z",
  "last_location_at": "2026-10-27T17:48:55.517022Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5b4f44c6-47c2-486f-b366-2cfd886d292c/arrive` → **200**

```json
{
  "command_id": "137e1e0e-e94c-46a8-82c2-e3212fb21ae6",
  "expected_version": 0
}
```

```json
{
  "id": "5b4f44c6-47c2-486f-b366-2cfd886d292c",
  "order_id": "a69809ce-2890-4f34-ac35-1b949dd7795c",
  "assignment_id": "a2698bbd-fce5-449c-b6b2-50c7c2b8b302",
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
  "arrived_at": "2026-10-27T17:48:55.549812Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5b4f44c6-47c2-486f-b366-2cfd886d292c/start` → **200**

```json
{
  "command_id": "ad9001e6-e904-42e3-b55d-14c12d5295b6",
  "expected_version": 1
}
```

```json
{
  "id": "5b4f44c6-47c2-486f-b366-2cfd886d292c",
  "order_id": "a69809ce-2890-4f34-ac35-1b949dd7795c",
  "assignment_id": "a2698bbd-fce5-449c-b6b2-50c7c2b8b302",
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
  "arrived_at": "2026-10-27T17:48:55.549812Z",
  "started_at": "2026-10-27T17:48:55.638745Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/8a0de8fe-ee07-4f47-8337-bfacd48b48d9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:48:55Z",
    "sequence": 1793123335662
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8a0de8fe-ee07-4f47-8337-bfacd48b48d9",
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
  "last_heartbeat_at": "2026-10-27T17:48:55.679996Z",
  "last_location_at": "2026-10-27T17:48:55.679996Z",
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
  "device_ref": "sandbox-30915"
}
```

```json
{
  "challenge_id": "2119c5a5-cf62-4e45-ba29-aeb78be04e30",
  "expires_at": "2026-10-27T17:53:55.702519377Z",
  "resend_available_at": "2026-10-27T17:48:56.702519377Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "020005",
  "sent_at": "2026-10-27T17:48:55.704646267Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2119c5a5-cf62-4e45-ba29-aeb78be04e30",
  "code": "020005",
  "device_ref": "sandbox-30915"
}
```

```json
{
  "session_id": "64ae8c5a-74ad-4553-9b6b-8fe48e29f4c4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDIzNSwiaWF0IjoxNzkzMTIzMzM1LCJqdGkiOiIyMTBiNGI5OC1kNzc3LTQxMjUtYTgyMi1jNGE3NGVmYWMxZTMiLCJzaWQiOiI2NGFlOGM1YS03NGFkLTQ1NTMtOWI2Yi04ZmU0OGUyOWY0YzQifQ.6dqMukaurCTb-dQUkDLdtAyEJErioe4CbRVmX1YZbD8",
  "access_expires_at": "2026-10-27T18:03:55.755129779Z",
  "refresh_token": "nQI80DiOZme0AqeX_GePc1JKZ-s9uPixq6Gkf83dXgo",
  "refresh_expires_at": "2026-11-26T17:48:55.75450067Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d8d46801-2897-4d20-b97f-e71916eeaf32",
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
  "last_heartbeat_at": "2026-10-27T17:48:35.95806Z",
  "last_location_at": "2026-10-27T17:48:35.95806Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/d8d46801-2897-4d20-b97f-e71916eeaf32/handover` → **200**

```json
{
  "command_id": "62d4999e-78d6-4125-9ad7-99e9b1271cd5",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d8d46801-2897-4d20-b97f-e71916eeaf32",
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
  "last_heartbeat_at": "2026-10-27T17:48:35.95806Z",
  "last_location_at": "2026-10-27T17:48:35.95806Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/d8d46801-2897-4d20-b97f-e71916eeaf32/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:48:55Z",
    "sequence": 1793123335832
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d8d46801-2897-4d20-b97f-e71916eeaf32",
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
  "last_heartbeat_at": "2026-10-27T17:48:55.849756Z",
  "last_location_at": "2026-10-27T17:48:55.849756Z",
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
  "session_id": "7e399b3f-8144-43f7-bf68-8cf584aee5e6",
  "subject": {
    "type": "STAFF",
    "id": "1c94c3c8-7ece-415c-83ee-f2363504523f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzk0YzNjOC03ZWNlLTQxNWMtODNlZS1mMjM2MzUwNDUyM2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQyMzYsImlhdCI6MTc5MzEyMzMzNiwianRpIjoiMWYwOGQ1Y2MtZjhlNS00YjcwLTk0MjUtMDkzNjFmNzRlMmE2Iiwic2lkIjoiN2UzOTliM2YtODE0NC00M2Y3LWJmNjgtOGNmNTg0YWVlNWU2In0.HyzSm2TSeabUDWYQl6Txefb9g1l_i7ay2Ek9AfLmXuY",
  "access_expires_at": "2026-10-27T18:03:56.132855893Z",
  "refresh_token": "N0STcjnWlf-D2qvxpbc0Ct_zs_4yyKNpwaDWBhN46tI",
  "refresh_expires_at": "2026-10-28T05:48:56.132328217Z",
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
  "session_id": "8574b5e5-9bc2-4df7-b2c8-38a98e018c9f",
  "subject": {
    "type": "STAFF",
    "id": "1c94c3c8-7ece-415c-83ee-f2363504523f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzk0YzNjOC03ZWNlLTQxNWMtODNlZS1mMjM2MzUwNDUyM2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQyMzYsImlhdCI6MTc5MzEyMzMzNiwianRpIjoiZDM3ZmUxZjktOTI2Mi00NWI5LWEzMGMtOGM3ZDkyOWIzNzlmIiwic2lkIjoiODU3NGI1ZTUtOWJjMi00ZGY3LWIyYzgtMzhhOThlMDE4YzlmIn0.0TsslcghWEWhHGT5sVLtt3a_y2xpR9Rhz7lJGPKW_CI",
  "access_expires_at": "2026-10-27T18:03:56.416453263Z",
  "refresh_token": "W14Bw402yQLVezlEf10ZAB9jBDv2LVOno8EyMUy362U",
  "refresh_expires_at": "2026-10-28T05:48:56.415779619Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a69809ce-2890-4f34-ac35-1b949dd7795c` → **200**

```json
{
  "id": "a69809ce-2890-4f34-ac35-1b949dd7795c",
  "short_number": 6,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "61661d1d-67c7-457f-9ae9-e092eb2984c6",
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
    "id": "a2698bbd-fce5-449c-b6b2-50c7c2b8b302",
    "order_id": "a69809ce-2890-4f34-ac35-1b949dd7795c",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "5b4f44c6-47c2-486f-b366-2cfd886d292c",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T17:48:55.397603Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a69809ce-2890-4f34-ac35-1b949dd7795c/interrupt` → **200**

```json
{
  "command_id": "e2e0f6c7-72a3-4daa-be0f-33a7ee73cdf4",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "a69809ce-2890-4f34-ac35-1b949dd7795c",
    "short_number": 6,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "61661d1d-67c7-457f-9ae9-e092eb2984c6",
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
      "id": "a2698bbd-fce5-449c-b6b2-50c7c2b8b302",
      "order_id": "a69809ce-2890-4f34-ac35-1b949dd7795c",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "5b4f44c6-47c2-486f-b366-2cfd886d292c",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T17:48:55.397603Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "71c8be84-9f56-43ff-8edd-75a184abca96",
    "short_number": 7,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "61661d1d-67c7-457f-9ae9-e092eb2984c6",
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
    "id": "caabd154-3bf5-47df-b019-30972d6baa6a",
    "order_id": "71c8be84-9f56-43ff-8edd-75a184abca96",
    "expires_at": "2026-10-27T17:49:11.49801Z",
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

`POST /api/driver/v1/offers/caabd154-3bf5-47df-b019-30972d6baa6a/accept` → **200**

```json
{
  "command_id": "b3243782-5fad-43c8-ba51-f8e207466a2f"
}
```

```json
{
  "id": "c68c59cc-e146-4e2c-bb28-5b328a88f1a3",
  "order_id": "71c8be84-9f56-43ff-8edd-75a184abca96",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5d465451-3c01-49b9-baa9-a6b3fc070a38",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5d465451-3c01-49b9-baa9-a6b3fc070a38",
  "order_id": "71c8be84-9f56-43ff-8edd-75a184abca96",
  "assignment_id": "c68c59cc-e146-4e2c-bb28-5b328a88f1a3",
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
  "session_id": "d8d46801-2897-4d20-b97f-e71916eeaf32",
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
  "last_heartbeat_at": "2026-10-27T17:48:55.849756Z",
  "last_location_at": "2026-10-27T17:48:55.849756Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/d8d46801-2897-4d20-b97f-e71916eeaf32/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:48:56Z",
    "sequence": 1793123336623
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d8d46801-2897-4d20-b97f-e71916eeaf32",
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
  "last_heartbeat_at": "2026-10-27T17:48:56.641257Z",
  "last_location_at": "2026-10-27T17:48:56.641257Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5d465451-3c01-49b9-baa9-a6b3fc070a38/arrive` → **200**

```json
{
  "command_id": "1a6c0a16-9267-47dc-965b-f3b8e28e4cbe",
  "expected_version": 0
}
```

```json
{
  "id": "5d465451-3c01-49b9-baa9-a6b3fc070a38",
  "order_id": "71c8be84-9f56-43ff-8edd-75a184abca96",
  "assignment_id": "c68c59cc-e146-4e2c-bb28-5b328a88f1a3",
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
  "arrived_at": "2026-10-27T17:48:56.675632Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5d465451-3c01-49b9-baa9-a6b3fc070a38/start` → **200**

```json
{
  "command_id": "01f73f09-6298-47d8-8059-8bd8844e0743",
  "expected_version": 1
}
```

```json
{
  "id": "5d465451-3c01-49b9-baa9-a6b3fc070a38",
  "order_id": "71c8be84-9f56-43ff-8edd-75a184abca96",
  "assignment_id": "c68c59cc-e146-4e2c-bb28-5b328a88f1a3",
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
  "arrived_at": "2026-10-27T17:48:56.675632Z",
  "started_at": "2026-10-27T17:48:56.713379Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5d465451-3c01-49b9-baa9-a6b3fc070a38/complete` → **200**

```json
{
  "command_id": "31f8af0f-acb2-4235-9b28-e021f7f43386",
  "expected_version": 2,
  "reported_at": "2026-10-27T17:48:56Z"
}
```

```json
{
  "id": "5d465451-3c01-49b9-baa9-a6b3fc070a38",
  "order_id": "71c8be84-9f56-43ff-8edd-75a184abca96",
  "assignment_id": "c68c59cc-e146-4e2c-bb28-5b328a88f1a3",
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
  "arrived_at": "2026-10-27T17:48:56.675632Z",
  "started_at": "2026-10-27T17:48:56.713379Z",
  "completed_at": "2026-10-27T17:48:56.753912Z",
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
    "id": "71c8be84-9f56-43ff-8edd-75a184abca96",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-27T17:48:56.489525Z",
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
    "id": "a69809ce-2890-4f34-ac35-1b949dd7795c",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-27T17:48:55.397603Z",
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
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
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

`GET /api/operator/v1/orders/a69809ce-2890-4f34-ac35-1b949dd7795c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T17:48:55.39815Z",
      "actor": {
        "type": "CLIENT",
        "id": "61661d1d-67c7-457f-9ae9-e092eb2984c6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a69809ce-2890-4f34-ac35-1b949dd7795c",
        "quote_id": "a0fe5922-9514-41ec-b3fb-5bfa97921041",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T17:48:55.399768Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a69809ce-2890-4f34-ac35-1b949dd7795c",
        "attempt_id": "f767a31f-7a66-43d8-81e2-affd80564a77",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T17:48:55.408461Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "41b19162-3f22-4429-8e94-6d2b206517a7",
        "order_id": "a69809ce-2890-4f34-ac35-1b949dd7795c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T17:48:55.462311Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "41b19162-3f22-4429-8e94-6d2b206517a7",
        "order_id": "a69809ce-2890-4f34-ac35-1b949dd7795c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "a2698bbd-fce5-449c-b6b2-50c7c2b8b302"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted a69809ce-2890-4f34-ac35-1b949dd7795c, follow-up 71c8be84-9f56-43ff-8edd-75a184abca96.

# Scenario: multiple-orders

## A driver goes online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-25805"
}
```

```json
{
  "challenge_id": "dd4d8684-f364-43d6-8fb5-8d09d26e6c01",
  "expires_at": "2026-10-27T17:53:59.868347936Z",
  "resend_available_at": "2026-10-27T17:49:00.868347936Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "898834",
  "sent_at": "2026-10-27T17:48:59.870271775Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dd4d8684-f364-43d6-8fb5-8d09d26e6c01",
  "code": "898834",
  "device_ref": "sandbox-25805"
}
```

```json
{
  "session_id": "4e6ea849-a1f0-4dc5-94ba-f89675f9fdc2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDIzOSwiaWF0IjoxNzkzMTIzMzM5LCJqdGkiOiJjNDQ0Nzk3ZS1lNGNmLTQxMGQtODIyOC05OTM4MmZjM2Y5YzUiLCJzaWQiOiI0ZTZlYTg0OS1hMWYwLTRkYzUtOTRiYS1mODk2NzVmOWZkYzIifQ.hQGTCeCj9uQ0hba2-8NFTcYchdTvweFPjodITfWoFqY",
  "access_expires_at": "2026-10-27T18:03:59.919055095Z",
  "refresh_token": "CtQQBRRAtf9K3_-67gNLIL5P_Mu4fAZfLQRbOTaVR_U",
  "refresh_expires_at": "2026-11-26T17:48:59.918601299Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d8d46801-2897-4d20-b97f-e71916eeaf32",
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
  "last_heartbeat_at": "2026-10-27T17:48:56.641257Z",
  "last_location_at": "2026-10-27T17:48:56.641257Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d8d46801-2897-4d20-b97f-e71916eeaf32/handover` → **200**

```json
{
  "command_id": "ca2a1b4a-8c24-4db8-a88e-f2b35bd747ee",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d8d46801-2897-4d20-b97f-e71916eeaf32",
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
  "last_heartbeat_at": "2026-10-27T17:48:56.641257Z",
  "last_location_at": "2026-10-27T17:48:56.641257Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d8d46801-2897-4d20-b97f-e71916eeaf32/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:48:59Z",
    "sequence": 1793123339995
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d8d46801-2897-4d20-b97f-e71916eeaf32",
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
  "last_heartbeat_at": "2026-10-27T17:49:00.011886Z",
  "last_location_at": "2026-10-27T17:49:00.011886Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679985794",
  "device_ref": "sandbox-29407"
}
```

```json
{
  "challenge_id": "4c383a7b-1b25-4ba8-9d59-77688e694089",
  "expires_at": "2026-10-27T17:54:00.036910952Z",
  "resend_available_at": "2026-10-27T17:49:01.036910952Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679985794` → **200**

```json
{
  "phone": "+380679985794",
  "audience": "CLIENT",
  "code": "193288",
  "sent_at": "2026-10-27T17:49:00.051938962Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4c383a7b-1b25-4ba8-9d59-77688e694089",
  "code": "193288",
  "device_ref": "sandbox-29407"
}
```

```json
{
  "session_id": "4ce936eb-bd22-4264-836a-a20941b0d70c",
  "subject": {
    "type": "CLIENT",
    "id": "69f28d85-5dd5-4f6a-bb01-b28dacc7d421"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OWYyOGQ4NS01ZGQ1LTRmNmEtYmIwMS1iMjhkYWNjN2Q0MjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI0MjQwLCJpYXQiOjE3OTMxMjMzNDAsImp0aSI6IjMwM2ZlYWI2LTBiNGUtNGFlZi1hNDg1LTliZDI5ZTY4MWUyYyIsInNpZCI6IjRjZTkzNmViLWJkMjItNDI2NC04MzZhLWEyMDk0MWIwZDcwYyJ9.km6mGygjWsmwshJrrwrEGUU-bDQIFRQ0ncfi-EZPHUw",
  "access_expires_at": "2026-10-27T18:04:00.102060316Z",
  "refresh_token": "_PkEqI3OFnqJg8X1fCXbKlpHvd9H6PXDSNm45bEDh4M",
  "refresh_expires_at": "2026-11-26T17:49:00.101640922Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "df95d3b6-2356-4461-b84c-7353af28f512",
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
  "id": "3e382c50-972e-4129-a351-779d405db294",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T17:54:00.132707Z",
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
  "command_id": "cc1eb3cb-43e6-4ed1-9695-33304f0fe8a2",
  "quote_id": "3e382c50-972e-4129-a351-779d405db294",
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
    "phone": "+380673074220"
  }
}
```

```json
{
  "id": "69f33c33-f61d-44d0-a1fa-22397681cd1b",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "69f28d85-5dd5-4f6a-bb01-b28dacc7d421",
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
  "created_at": "2026-10-27T17:49:00.167842Z",
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
    "id": "4a94e07e-4540-44f3-b001-fc4e7a797559",
    "order_id": "69f33c33-f61d-44d0-a1fa-22397681cd1b",
    "expires_at": "2026-10-27T17:49:15.171014Z",
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

`POST /api/driver/v1/offers/4a94e07e-4540-44f3-b001-fc4e7a797559/accept` → **200**

```json
{
  "command_id": "e367d5bd-544c-4eba-8fcd-3b9fb7ed1fd1"
}
```

```json
{
  "id": "8ce70285-e728-4b74-88f2-52f3c8b7501a",
  "order_id": "69f33c33-f61d-44d0-a1fa-22397681cd1b",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "50d46451-79d1-4255-b29e-2e937f738adc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "50d46451-79d1-4255-b29e-2e937f738adc",
  "order_id": "69f33c33-f61d-44d0-a1fa-22397681cd1b",
  "assignment_id": "8ce70285-e728-4b74-88f2-52f3c8b7501a",
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
    "phone": "+380673074220"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e806bb43-1b37-4e1e-a5f2-8e7ddbacb762",
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
  "id": "1d366c5f-b138-4a3b-ba92-1e0c525199f0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T17:54:00.293277Z",
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
  "command_id": "a41ca266-d688-4e8a-9561-b00db03e4608",
  "quote_id": "1d366c5f-b138-4a3b-ba92-1e0c525199f0",
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
  "id": "0681ee60-34b4-445c-82f6-1c44ee0ff579",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "69f28d85-5dd5-4f6a-bb01-b28dacc7d421",
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
  "created_at": "2026-10-27T17:49:00.32679Z",
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
  "command_id": "fe343763-7bbd-4efe-83da-6b4690398184",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-27T20:49:00Z"
}
```

```json
{
  "id": "24cf5ae7-6382-4cbc-b791-3f7d23e5b1b0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T17:54:00.371528Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T20:49:00Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "68f36d51-256b-43cd-a24a-418193216a6b",
  "quote_id": "24cf5ae7-6382-4cbc-b791-3f7d23e5b1b0",
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
  "pickup_at": "2026-10-27T20:49:00Z"
}
```

```json
{
  "id": "36f34234-c062-4ae9-9c79-2957897eeda0",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "69f28d85-5dd5-4f6a-bb01-b28dacc7d421",
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
  "created_at": "2026-10-27T17:49:00.406631Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T20:49:00Z",
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
  "command_id": "26386cac-1cbf-48a6-a96e-d65fd8cb879a",
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
  "id": "823717a0-8586-4f64-9c02-440da698d74b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T17:54:00.445242Z",
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
  "command_id": "695144a7-b04b-4ae3-99d9-21278c586e58",
  "quote_id": "823717a0-8586-4f64-9c02-440da698d74b",
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
  "correlation_id": "146727f0-0abf-425e-861a-cead36077481"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "36f34234-c062-4ae9-9c79-2957897eeda0",
      "short_number": 10,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "69f28d85-5dd5-4f6a-bb01-b28dacc7d421",
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
      "created_at": "2026-10-27T17:49:00.406631Z",
      "cancellation": null,
      "pickup_at": "2026-10-27T20:49:00Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "0681ee60-34b4-445c-82f6-1c44ee0ff579",
      "short_number": 9,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "69f28d85-5dd5-4f6a-bb01-b28dacc7d421",
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
      "created_at": "2026-10-27T17:49:00.32679Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "69f33c33-f61d-44d0-a1fa-22397681cd1b",
      "short_number": 8,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "69f28d85-5dd5-4f6a-bb01-b28dacc7d421",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "0681ee60-34b4-445c-82f6-1c44ee0ff579",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "69f28d85-5dd5-4f6a-bb01-b28dacc7d421",
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
  "created_at": "2026-10-27T17:49:00.32679Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/69f33c33-f61d-44d0-a1fa-22397681cd1b` → **200**

```json
{
  "id": "69f33c33-f61d-44d0-a1fa-22397681cd1b",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "69f28d85-5dd5-4f6a-bb01-b28dacc7d421",
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
    "id": "8ce70285-e728-4b74-88f2-52f3c8b7501a",
    "order_id": "69f33c33-f61d-44d0-a1fa-22397681cd1b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "50d46451-79d1-4255-b29e-2e937f738adc",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-27T17:49:00.167842Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/69f33c33-f61d-44d0-a1fa-22397681cd1b/cancel` → **200**

```json
{
  "command_id": "cce9bdf8-cc17-4c4f-b24e-c4a308968ce1",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "69f33c33-f61d-44d0-a1fa-22397681cd1b",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "69f28d85-5dd5-4f6a-bb01-b28dacc7d421",
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
    "id": "8ce70285-e728-4b74-88f2-52f3c8b7501a",
    "order_id": "69f33c33-f61d-44d0-a1fa-22397681cd1b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "50d46451-79d1-4255-b29e-2e937f738adc",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T17:49:00.167842Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
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

`GET /api/rider/v1/orders/0681ee60-34b4-445c-82f6-1c44ee0ff579` → **200**

```json
{
  "id": "0681ee60-34b4-445c-82f6-1c44ee0ff579",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "69f28d85-5dd5-4f6a-bb01-b28dacc7d421",
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
  "created_at": "2026-10-27T17:49:00.32679Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/0681ee60-34b4-445c-82f6-1c44ee0ff579/cancel` → **200**

```json
{
  "command_id": "26fed23e-ef30-47b8-9c3a-64f104e1403a",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0681ee60-34b4-445c-82f6-1c44ee0ff579",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "69f28d85-5dd5-4f6a-bb01-b28dacc7d421",
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
  "created_at": "2026-10-27T17:49:00.32679Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
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

`GET /api/rider/v1/orders/36f34234-c062-4ae9-9c79-2957897eeda0` → **200**

```json
{
  "id": "36f34234-c062-4ae9-9c79-2957897eeda0",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "69f28d85-5dd5-4f6a-bb01-b28dacc7d421",
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
  "created_at": "2026-10-27T17:49:00.406631Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T20:49:00Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/36f34234-c062-4ae9-9c79-2957897eeda0/cancel` → **200**

```json
{
  "command_id": "b55a556b-a5d6-4d2a-81f4-2be842f565de",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "36f34234-c062-4ae9-9c79-2957897eeda0",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "69f28d85-5dd5-4f6a-bb01-b28dacc7d421",
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
  "created_at": "2026-10-27T17:49:00.406631Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
    }
  },
  "pickup_at": "2026-10-27T20:49:00Z",
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
  "session_id": "d8d46801-2897-4d20-b97f-e71916eeaf32",
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
  "last_heartbeat_at": "2026-10-27T17:49:00.011886Z",
  "last_location_at": "2026-10-27T17:49:00.011886Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d8d46801-2897-4d20-b97f-e71916eeaf32/close` → **200**

```json
{
  "command_id": "48d1020a-b84d-42ab-86a1-4fe728d8f0d0",
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

Done: orders 69f33c33-f61d-44d0-a1fa-22397681cd1b, 0681ee60-34b4-445c-82f6-1c44ee0ff579, 36f34234-c062-4ae9-9c79-2957897eeda0.

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
  "session_id": "ffa20296-6263-4b45-93d2-700063c1dbfe",
  "subject": {
    "type": "STAFF",
    "id": "1c94c3c8-7ece-415c-83ee-f2363504523f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzk0YzNjOC03ZWNlLTQxNWMtODNlZS1mMjM2MzUwNDUyM2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQyNDEsImlhdCI6MTc5MzEyMzM0MSwianRpIjoiZTUxMTE5YTItNjU0Mi00NjczLWIxMmQtZjgzMmFlY2QxNTc4Iiwic2lkIjoiZmZhMjAyOTYtNjI2My00YjQ1LTkzZDItNzAwMDYzYzFkYmZlIn0.O-vmSrhZxbZrmJykXRQmZ4Klr1gwM11lQuhbwNRWmE4",
  "access_expires_at": "2026-10-27T18:04:01.090811562Z",
  "refresh_token": "bUuxJPMATpKXcmpdT8uJLXBi0akwWJ73pptRoHlvsEA",
  "refresh_expires_at": "2026-10-28T05:49:01.090251968Z",
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
  "session_id": "fe964272-7707-49cb-916f-50de91e8374c",
  "subject": {
    "type": "STAFF",
    "id": "1c94c3c8-7ece-415c-83ee-f2363504523f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzk0YzNjOC03ZWNlLTQxNWMtODNlZS1mMjM2MzUwNDUyM2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQyNDEsImlhdCI6MTc5MzEyMzM0MSwianRpIjoiMjhkNTMyZGItMGUyNC00NGY1LTlkODQtOWE5ZWI0NTU5NTFjIiwic2lkIjoiZmU5NjQyNzItNzcwNy00OWNiLTkxNmYtNTBkZTkxZTgzNzRjIn0.P_Ykeue0LpDTNnDfF6Q54kfoJheE8_dcdL-CDiMxj2Q",
  "access_expires_at": "2026-10-27T18:04:01.380386141Z",
  "refresh_token": "Oj8bt8vEtVhpCq67iBLJVVPXbDDA2dD_D0zBxsNZSsU",
  "refresh_expires_at": "2026-10-28T05:49:01.379899687Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-25848"
}
```

```json
{
  "challenge_id": "c8c7e6ea-6a82-470a-840d-a3e0be938812",
  "expires_at": "2026-10-27T17:54:01.402013671Z",
  "resend_available_at": "2026-10-27T17:49:02.402013671Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "573988",
  "sent_at": "2026-10-27T17:49:01.403824829Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c8c7e6ea-6a82-470a-840d-a3e0be938812",
  "code": "573988",
  "device_ref": "sandbox-25848"
}
```

```json
{
  "session_id": "cf3fc721-a15d-4b9e-b6a0-d4974587d24d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDI0MSwiaWF0IjoxNzkzMTIzMzQxLCJqdGkiOiI1MjI0ZWNiNC1hOGUyLTRiZWYtYjdiOS02NzM0YWFkZjVhMDQiLCJzaWQiOiJjZjNmYzcyMS1hMTVkLTRiOWUtYjZhMC1kNDk3NDU4N2QyNGQifQ._ZyEZCqwgk56fztWejAd40ZxNOwx5SXPBrOarfxeZNw",
  "access_expires_at": "2026-10-27T18:04:01.453512833Z",
  "refresh_token": "kpAtQmRHb9b0euL6hzc3vFJ4lttf5f4ShwQ-AL3La6c",
  "refresh_expires_at": "2026-11-26T17:49:01.453041496Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8a0de8fe-ee07-4f47-8337-bfacd48b48d9",
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
  "last_heartbeat_at": "2026-10-27T17:48:55.679996Z",
  "last_location_at": "2026-10-27T17:48:55.679996Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8a0de8fe-ee07-4f47-8337-bfacd48b48d9/handover` → **200**

```json
{
  "command_id": "8814fd71-8993-4793-88b4-d81095488826",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8a0de8fe-ee07-4f47-8337-bfacd48b48d9",
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
  "last_heartbeat_at": "2026-10-27T17:48:55.679996Z",
  "last_location_at": "2026-10-27T17:48:55.679996Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8a0de8fe-ee07-4f47-8337-bfacd48b48d9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:49:01Z",
    "sequence": 1793123341528
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8a0de8fe-ee07-4f47-8337-bfacd48b48d9",
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
  "last_heartbeat_at": "2026-10-27T17:49:01.547112Z",
  "last_location_at": "2026-10-27T17:49:01.547112Z",
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
  "command_id": "0fd3ed07-bfbc-4b87-b7a1-809aeb43a74b",
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
  "effective_at": "2026-10-27T17:49:01.613517Z",
  "changed_by": "1c94c3c8-7ece-415c-83ee-f2363504523f",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "1c94c3c8-7ece-415c-83ee-f2363504523f",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-27T17:49:01.643229947Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "80588707-1f4f-402c-86c5-dad68e154e50",
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
  "id": "ea23908d-9ed2-439d-a441-7abe31e88cb2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T17:54:01.678599Z",
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
  "command_id": "aed0f542-c795-4ff8-8dcd-7371cb83df3e",
  "quote_id": "ea23908d-9ed2-439d-a441-7abe31e88cb2",
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
    "phone": "+3806711111645"
  }
}
```

```json
{
  "id": "5fc6e1a1-8f85-4ed5-b3d0-0a9f514bc7ce",
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
  "created_at": "2026-10-27T17:49:01.724383Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711111645"
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
    "id": "bc709f18-4b6c-4576-9b46-bdd59ce06d95",
    "order_id": "5fc6e1a1-8f85-4ed5-b3d0-0a9f514bc7ce",
    "expires_at": "2026-10-27T17:49:16.728465Z",
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

`POST /api/driver/v1/offers/bc709f18-4b6c-4576-9b46-bdd59ce06d95/accept` → **200**

```json
{
  "command_id": "5c3e47df-72dc-405d-9c5d-b267c5d6996a"
}
```

```json
{
  "id": "ba62da63-5a95-4dc8-b4a7-8283f774e194",
  "order_id": "5fc6e1a1-8f85-4ed5-b3d0-0a9f514bc7ce",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3925e4d3-e98f-4cb7-8c1e-86d3b7807ce5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3925e4d3-e98f-4cb7-8c1e-86d3b7807ce5",
  "order_id": "5fc6e1a1-8f85-4ed5-b3d0-0a9f514bc7ce",
  "assignment_id": "ba62da63-5a95-4dc8-b4a7-8283f774e194",
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
    "phone": "+3806711111645"
  }
}
```

`POST /api/driver/v1/work-sessions/8a0de8fe-ee07-4f47-8337-bfacd48b48d9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:49:01Z",
    "sequence": 1793123341944
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8a0de8fe-ee07-4f47-8337-bfacd48b48d9",
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
  "last_heartbeat_at": "2026-10-27T17:49:01.960375Z",
  "last_location_at": "2026-10-27T17:49:01.960375Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3925e4d3-e98f-4cb7-8c1e-86d3b7807ce5/arrive` → **200**

```json
{
  "command_id": "cbdad9b7-c09f-4309-a31f-db4000d4eae3",
  "expected_version": 0
}
```

```json
{
  "id": "3925e4d3-e98f-4cb7-8c1e-86d3b7807ce5",
  "order_id": "5fc6e1a1-8f85-4ed5-b3d0-0a9f514bc7ce",
  "assignment_id": "ba62da63-5a95-4dc8-b4a7-8283f774e194",
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
  "arrived_at": "2026-10-27T17:49:01.991681Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711111645"
  }
}
```

`POST /api/driver/v1/trips/3925e4d3-e98f-4cb7-8c1e-86d3b7807ce5/start` → **200**

```json
{
  "command_id": "30f7c234-72fb-4196-9a98-8dab78420ab7",
  "expected_version": 1
}
```

```json
{
  "id": "3925e4d3-e98f-4cb7-8c1e-86d3b7807ce5",
  "order_id": "5fc6e1a1-8f85-4ed5-b3d0-0a9f514bc7ce",
  "assignment_id": "ba62da63-5a95-4dc8-b4a7-8283f774e194",
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
  "arrived_at": "2026-10-27T17:49:01.991681Z",
  "started_at": "2026-10-27T17:49:02.025847Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711111645"
  }
}
```

`POST /api/driver/v1/trips/3925e4d3-e98f-4cb7-8c1e-86d3b7807ce5/complete` → **200**

```json
{
  "command_id": "7809db91-91d6-4623-a4b1-0b09d6bc8076",
  "expected_version": 2,
  "reported_at": "2026-10-27T17:49:02Z",
  "cash_received": true
}
```

```json
{
  "id": "3925e4d3-e98f-4cb7-8c1e-86d3b7807ce5",
  "order_id": "5fc6e1a1-8f85-4ed5-b3d0-0a9f514bc7ce",
  "assignment_id": "ba62da63-5a95-4dc8-b4a7-8283f774e194",
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
  "arrived_at": "2026-10-27T17:49:01.991681Z",
  "started_at": "2026-10-27T17:49:02.025847Z",
  "completed_at": "2026-10-27T17:49:02.063042Z",
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
  "command_id": "c854a648-a2d8-4960-ba30-ea7b19b2922d",
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
  "id": "523aa85e-3e64-4758-8902-5dd2f582878e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T17:54:02.127865Z",
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
  "command_id": "1c67e617-8d38-46b1-9499-bd238cc022bc",
  "quote_id": "523aa85e-3e64-4758-8902-5dd2f582878e",
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
    "phone": "+3806711118810"
  }
}
```

```json
{
  "id": "278638ee-4ebb-4eef-8f6f-7c400c9b3bee",
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
  "created_at": "2026-10-27T17:49:02.207223Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711118810"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/278638ee-4ebb-4eef-8f6f-7c400c9b3bee` → **200**

```json
{
  "id": "278638ee-4ebb-4eef-8f6f-7c400c9b3bee",
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
  "created_at": "2026-10-27T17:49:02.207223Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711118810"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/278638ee-4ebb-4eef-8f6f-7c400c9b3bee/cancel` → **200**

```json
{
  "command_id": "612eaf27-130c-4d7f-82d7-b15d0f06fbb3",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "278638ee-4ebb-4eef-8f6f-7c400c9b3bee",
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
  "created_at": "2026-10-27T17:49:02.207223Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711118810"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "pl": "Błąd operatora",
      "ru": "Ошибка оператора",
      "en": "Operator error",
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
  "staff_id": "1c94c3c8-7ece-415c-83ee-f2363504523f",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-27T17:49:02.272544Z",
  "last_entries": [
    {
      "order_id": "278638ee-4ebb-4eef-8f6f-7c400c9b3bee",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-27T17:49:02.272544Z"
    },
    {
      "order_id": "5fc6e1a1-8f85-4ed5-b3d0-0a9f514bc7ce",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-27T17:49:02.067402Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8a0de8fe-ee07-4f47-8337-bfacd48b48d9",
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
  "last_heartbeat_at": "2026-10-27T17:49:01.960375Z",
  "last_location_at": "2026-10-27T17:49:01.960375Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8a0de8fe-ee07-4f47-8337-bfacd48b48d9/close` → **200**

```json
{
  "command_id": "e3b6984d-1485-4ce0-a397-b8b589242170",
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

Done: operator bonus for fulfilled 5fc6e1a1-8f85-4ed5-b3d0-0a9f514bc7ce and operator-fault cancellation 278638ee-4ebb-4eef-8f6f-7c400c9b3bee.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636177357",
  "device_ref": "sandbox-19438"
}
```

```json
{
  "challenge_id": "53e45cf8-cbb2-4def-b00e-a6e1e50b0422",
  "expires_at": "2026-10-27T17:54:04.452546649Z",
  "resend_available_at": "2026-10-27T17:49:05.452546649Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636177357` → **200**

```json
{
  "phone": "+380636177357",
  "audience": "CLIENT",
  "code": "635696",
  "sent_at": "2026-10-27T17:49:04.454523377Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "53e45cf8-cbb2-4def-b00e-a6e1e50b0422",
  "code": "635696",
  "device_ref": "sandbox-19438"
}
```

```json
{
  "session_id": "d545e00e-91c9-4b32-8f33-b2b455de316e",
  "subject": {
    "type": "CLIENT",
    "id": "83d22994-d855-4338-a6ba-ebf2f597fe90"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4M2QyMjk5NC1kODU1LTQzMzgtYTZiYS1lYmYyZjU5N2ZlOTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI0MjQ0LCJpYXQiOjE3OTMxMjMzNDQsImp0aSI6IjA3YTE3ZjE5LTJmYTgtNDA4My04Yjk2LWY2MmQ5ZTdmYTZhYyIsInNpZCI6ImQ1NDVlMDBlLTkxYzktNGIzMi04ZjMzLWIyYjQ1NWRlMzE2ZSJ9.0OxV3qCYpKdorTL1ch9uluX6Nc58I_hIvsrohnIzOyk",
  "access_expires_at": "2026-10-27T18:04:04.503100771Z",
  "refresh_token": "6kakDDHrbCpB8cjI1IdimoKrnWsaqoRfwvn5sePe0O8",
  "refresh_expires_at": "2026-11-26T17:49:04.502674708Z",
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
  "session_id": "9fd4d5f0-47f0-410d-9143-77e42e2e00c6",
  "subject": {
    "type": "STAFF",
    "id": "1c94c3c8-7ece-415c-83ee-f2363504523f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzk0YzNjOC03ZWNlLTQxNWMtODNlZS1mMjM2MzUwNDUyM2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQyNDQsImlhdCI6MTc5MzEyMzM0NCwianRpIjoiZjcxNmU4OGItMDk4MC00MWE3LTg4OTItYTRjOTJhN2Q2ODc5Iiwic2lkIjoiOWZkNGQ1ZjAtNDdmMC00MTBkLTkxNDMtNzdlNDJlMmUwMGM2In0.nZtMHGZkGHqJ5qguNcAJ0dbZgY2ekavCv2NwMuulLaM",
  "access_expires_at": "2026-10-27T18:04:04.861916863Z",
  "refresh_token": "pzx2OwQZfpOE7H1isdJN8vZ4rCOArlt7oNZayuMlRaI",
  "refresh_expires_at": "2026-10-28T05:49:04.861473755Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380636177357` → **200**

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
  "correlation_id": "8278deaf-27d7-4847-a433-44376a6f1a31"
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
  "session_id": "d9ea1581-72e0-4ccc-b3fd-164f33dedfd4",
  "subject": {
    "type": "STAFF",
    "id": "1c94c3c8-7ece-415c-83ee-f2363504523f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzk0YzNjOC03ZWNlLTQxNWMtODNlZS1mMjM2MzUwNDUyM2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQyNDUsImlhdCI6MTc5MzEyMzM0NSwianRpIjoiMTNhMzNhYzMtZGExZS00NGRkLWE2ODItOWY2YmY2OWM3NGU2Iiwic2lkIjoiZDllYTE1ODEtNzJlMC00Y2NjLWIzZmQtMTY0ZjMzZGVkZmQ0In0.0aH755xjqzfFtmRJBc-iRGx5jYrux2q6FjGYwtBvBr0",
  "access_expires_at": "2026-10-27T18:04:05.2121447Z",
  "refresh_token": "v5IzA-yiNvIptjPS20RA8vAU1GteCrDetWnBi_ZH2Hs",
  "refresh_expires_at": "2026-10-28T05:49:05.211705878Z",
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
  "command_id": "1f738415-e807-472b-a2f8-5da14f5e8ea5",
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
  "changed_by": "1c94c3c8-7ece-415c-83ee-f2363504523f",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T17:49:05.277942892Z"
}
```

## The rider books the airport for 2026-10-27T20:49:04Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600380768",
  "device_ref": "sandbox-25975"
}
```

```json
{
  "challenge_id": "cbd8155b-8a8f-4eb5-b841-fd61b226ef61",
  "expires_at": "2026-10-27T17:54:05.306582753Z",
  "resend_available_at": "2026-10-27T17:49:06.306582753Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600380768` → **200**

```json
{
  "phone": "+48600380768",
  "audience": "CLIENT",
  "code": "144506",
  "sent_at": "2026-10-27T17:49:05.308540632Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cbd8155b-8a8f-4eb5-b841-fd61b226ef61",
  "code": "144506",
  "device_ref": "sandbox-25975"
}
```

```json
{
  "session_id": "a90678cc-5054-42e8-be32-03981ae16c2d",
  "subject": {
    "type": "CLIENT",
    "id": "8169fa27-df86-4050-a9fc-3cd190045d56"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MTY5ZmEyNy1kZjg2LTQwNTAtYTlmYy0zY2QxOTAwNDVkNTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI0MjQ1LCJpYXQiOjE3OTMxMjMzNDUsImp0aSI6ImNiZWI3ZmEwLTY1MTYtNDc5YS05MmVlLTI5ODJmZTYyZTY2MCIsInNpZCI6ImE5MDY3OGNjLTUwNTQtNDJlOC1iZTMyLTAzOTgxYWUxNmMyZCJ9.MrRPSvQfoU8npU_OWC9pV3-xEs_edGa_0TcKAYJ0HIk",
  "access_expires_at": "2026-10-27T18:04:05.358046347Z",
  "refresh_token": "eTcWreS9c3-nxBshE8-qCeLvB3jwFkdVH7MRQmYwHFE",
  "refresh_expires_at": "2026-11-26T17:49:05.357572211Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3b1591e7-9090-4e24-a4de-7a9f9c1d2b0f",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T20:49:04Z"
}
```

```json
{
  "id": "79872368-0091-4f86-94b1-e41d9a559b5b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T17:54:05.390663Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T20:49:04Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "cb18e141-9e54-439b-8198-113d6461e9ed",
  "quote_id": "79872368-0091-4f86-94b1-e41d9a559b5b",
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
  "pickup_at": "2026-10-27T20:49:04Z"
}
```

```json
{
  "id": "420b8191-899c-4d54-b60a-c4c6f0cd0752",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8169fa27-df86-4050-a9fc-3cd190045d56",
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
  "created_at": "2026-10-27T17:49:05.423814Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T20:49:04Z",
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
  "device_ref": "sandbox-10236"
}
```

```json
{
  "challenge_id": "6c261e00-175a-4000-aa30-286edf5cb8cb",
  "expires_at": "2026-10-27T17:54:05.452605561Z",
  "resend_available_at": "2026-10-27T17:49:06.452605561Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "918576",
  "sent_at": "2026-10-27T17:49:05.454335267Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6c261e00-175a-4000-aa30-286edf5cb8cb",
  "code": "918576",
  "device_ref": "sandbox-10236"
}
```

```json
{
  "session_id": "454d195e-ff61-4d08-9349-8d68fed60c52",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDI0NSwiaWF0IjoxNzkzMTIzMzQ1LCJqdGkiOiIyODE3OTBiZS1iODI0LTQ4MGMtODMwMy1iODZjOTE5OTlhZWYiLCJzaWQiOiI0NTRkMTk1ZS1mZjYxLTRkMDgtOTM0OS04ZDY4ZmVkNjBjNTIifQ.7xFgCl2TzIGuVjF1uvD2kCF8awBErL292jnsTOJ9tzQ",
  "access_expires_at": "2026-10-27T18:04:05.503341403Z",
  "refresh_token": "G2ZGkwrkWs0YaMLkvsDvzEAIpeRsYchLjjLNZWY0ciQ",
  "refresh_expires_at": "2026-11-26T17:49:05.502847648Z",
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
  "command_id": "87b121c1-d973-4a91-9f46-dbe8f42549e7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:49:05Z",
    "sequence": 1793123345550
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ba0aa032-13dc-4e10-8dfa-3b5bad7b9976",
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
  "last_heartbeat_at": "2026-10-27T17:49:05.566345Z",
  "last_location_at": "2026-10-27T17:49:05.566345Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "420b8191-899c-4d54-b60a-c4c6f0cd0752",
      "short_number": 13,
      "pickup_at": "2026-10-27T20:49:04Z",
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

`POST /api/driver/v1/preorders/420b8191-899c-4d54-b60a-c4c6f0cd0752/reserve` → **200**

```json
{
  "command_id": "479943de-0bbf-4086-a26c-0c7ce142763b"
}
```

```json
{
  "id": "8fd86a0a-2686-4a1c-8ad9-703a5f5cfded",
  "state": "RESERVED",
  "order": {
    "order_id": "420b8191-899c-4d54-b60a-c4c6f0cd0752",
    "short_number": 13,
    "pickup_at": "2026-10-27T20:49:04Z",
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
  "reserved_at": "2026-10-27T17:49:05.625591Z",
  "confirm_from": "2026-10-27T20:19:04Z",
  "confirm_until": "2026-10-27T20:29:04Z",
  "drop_until": "2026-10-27T19:49:04Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "8fd86a0a-2686-4a1c-8ad9-703a5f5cfded",
      "state": "RESERVED",
      "order": {
        "order_id": "420b8191-899c-4d54-b60a-c4c6f0cd0752",
        "short_number": 13,
        "pickup_at": "2026-10-27T20:49:04Z",
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
      "reserved_at": "2026-10-27T17:49:05.625591Z",
      "confirm_from": "2026-10-27T20:19:04Z",
      "confirm_until": "2026-10-27T20:29:04Z",
      "drop_until": "2026-10-27T19:49:04Z"
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
      "id": "8fd86a0a-2686-4a1c-8ad9-703a5f5cfded",
      "state": "RESERVED",
      "order": {
        "order_id": "420b8191-899c-4d54-b60a-c4c6f0cd0752",
        "short_number": 13,
        "pickup_at": "2026-10-27T20:49:04Z",
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
      "reserved_at": "2026-10-27T17:49:05.625591Z",
      "confirm_from": "2026-10-27T20:19:04Z",
      "confirm_until": "2026-10-27T20:29:04Z",
      "drop_until": "2026-10-27T19:49:04Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/8fd86a0a-2686-4a1c-8ad9-703a5f5cfded/confirm` → **409**

```json
{
  "command_id": "3e7f051e-10d7-4002-adc4-f57f6373a52e"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/8fd86a0a-2686-4a1c-8ad9-703a5f5cfded/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b5288b89-02d8-43ae-853c-fba75fdaba2f"
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
  "session_id": "4592b16c-fa84-4639-91dc-bcecb008f51f",
  "subject": {
    "type": "STAFF",
    "id": "1c94c3c8-7ece-415c-83ee-f2363504523f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzk0YzNjOC03ZWNlLTQxNWMtODNlZS1mMjM2MzUwNDUyM2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQyNDUsImlhdCI6MTc5MzEyMzM0NSwianRpIjoiMGE4ZmFmNDQtOWUzNy00NmNlLTlhZTAtNDg0MDczNDU3YWEwIiwic2lkIjoiNDU5MmIxNmMtZmE4NC00NjM5LTkxZGMtYmNlY2IwMDhmNTFmIn0.vZfXCezzUhJks_CUplPEq3xYAhHzfZifYUP-r1yrp2Y",
  "access_expires_at": "2026-10-27T18:04:05.992824637Z",
  "refresh_token": "C6IySSeDnmoJ3oBiMcRz8YU3_ykRzNZG-DDlt6lfeC0",
  "refresh_expires_at": "2026-10-28T05:49:05.992375589Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/420b8191-899c-4d54-b60a-c4c6f0cd0752` → **200**

```json
{
  "id": "420b8191-899c-4d54-b60a-c4c6f0cd0752",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "8169fa27-df86-4050-a9fc-3cd190045d56",
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
  "created_at": "2026-10-27T17:49:05.423814Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T20:49:04Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "8fd86a0a-2686-4a1c-8ad9-703a5f5cfded",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T17:49:05.625591Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/420b8191-899c-4d54-b60a-c4c6f0cd0752/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T17:49:05.424698Z",
      "actor": {
        "type": "CLIENT",
        "id": "8169fa27-df86-4050-a9fc-3cd190045d56",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "420b8191-899c-4d54-b60a-c4c6f0cd0752",
        "preorder": true,
        "quote_id": "79872368-0091-4f86-94b1-e41d9a559b5b",
        "pickup_at": "2026-10-27T20:49:04Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T17:49:05.626534Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "420b8191-899c-4d54-b60a-c4c6f0cd0752",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "8fd86a0a-2686-4a1c-8ad9-703a5f5cfded"
      }
    }
  ]
}
```

Done: pre-order 420b8191-899c-4d54-b60a-c4c6f0cd0752, reservation 8fd86a0a-2686-4a1c-8ad9-703a5f5cfded.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-7240"
}
```

```json
{
  "challenge_id": "ea0e1bdf-5c37-4db2-96a6-4000119c5e4c",
  "expires_at": "2026-10-27T17:54:06.072883464Z",
  "resend_available_at": "2026-10-27T17:49:07.072883464Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "093754",
  "sent_at": "2026-10-27T17:49:06.074692364Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ea0e1bdf-5c37-4db2-96a6-4000119c5e4c",
  "code": "093754",
  "device_ref": "sandbox-7240"
}
```

```json
{
  "session_id": "4809a3f1-13e2-48fe-9d70-426e6fdfb598",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDI0NiwiaWF0IjoxNzkzMTIzMzQ2LCJqdGkiOiIyYmU3NDliYS1jM2FmLTRhNmYtOTIzOC1hOGZlZTFiOTA4OWMiLCJzaWQiOiI0ODA5YTNmMS0xM2UyLTQ4ZmUtOWQ3MC00MjZlNmZkZmI1OTgifQ.7wMB_Al8GJeC3oPe9mcT0jEabG1lIAV9BL672WGUZHU",
  "access_expires_at": "2026-10-27T18:04:06.123024557Z",
  "refresh_token": "xbrusYmuwUK7pCXeVgMUOAvv16FVYhZcoJtEM1SFVi4",
  "refresh_expires_at": "2026-11-26T17:49:06.12258221Z",
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
  "command_id": "6cef5240-def4-483c-ba06-5fe1e80e7751",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:49:06Z",
    "sequence": 1793123346167
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a825e231-072e-43d0-9ed5-70988f5d7b24",
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
  "last_heartbeat_at": "2026-10-27T17:49:06.183304Z",
  "last_location_at": "2026-10-27T17:49:06.183304Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679497165",
  "device_ref": "sandbox-20510"
}
```

```json
{
  "challenge_id": "d5203cd0-ad40-440c-a300-0a0e6b0f3009",
  "expires_at": "2026-10-27T17:54:06.209399672Z",
  "resend_available_at": "2026-10-27T17:49:07.209399672Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679497165` → **200**

```json
{
  "phone": "+380679497165",
  "audience": "CLIENT",
  "code": "490171",
  "sent_at": "2026-10-27T17:49:06.211239473Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d5203cd0-ad40-440c-a300-0a0e6b0f3009",
  "code": "490171",
  "device_ref": "sandbox-20510"
}
```

```json
{
  "session_id": "5489c01a-7b8b-43ea-9342-3e4ff4ae1c81",
  "subject": {
    "type": "CLIENT",
    "id": "4bc98004-97cc-4ac5-b389-3d2874ebbab5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YmM5ODAwNC05N2NjLTRhYzUtYjM4OS0zZDI4NzRlYmJhYjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI0MjQ2LCJpYXQiOjE3OTMxMjMzNDYsImp0aSI6ImY2N2VhYzlhLWIzMjItNDllNy1iY2VjLTI5NDdlOWNlNWQ5NiIsInNpZCI6IjU0ODljMDFhLTdiOGItNDNlYS05MzQyLTNlNGZmNGFlMWM4MSJ9.3tLE6myBaysd-G0Bl-I9jEFGm5HDnG0yZ9d-gnpmg5Q",
  "access_expires_at": "2026-10-27T18:04:06.259158889Z",
  "refresh_token": "y5xXZbUCOv6UH71eT8LIKjHLbGXODD1s4IoNI03xNIQ",
  "refresh_expires_at": "2026-11-26T17:49:06.25876884Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7ea49a39-471a-46bb-95d9-2c86afd3ec5d",
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
  "id": "ceae007a-da68-45c5-b7c1-3f5385f0177d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T17:54:06.291070Z",
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
  "command_id": "739050f1-c162-4302-a05e-26cf854d94c9",
  "quote_id": "ceae007a-da68-45c5-b7c1-3f5385f0177d",
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
  "id": "9615232a-d359-4097-86f9-1ae8c5ddf2ff",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4bc98004-97cc-4ac5-b389-3d2874ebbab5",
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
  "created_at": "2026-10-27T17:49:06.323956Z",
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
    "id": "3eb38782-e9d8-4173-8cc0-f16c432c6be7",
    "order_id": "9615232a-d359-4097-86f9-1ae8c5ddf2ff",
    "expires_at": "2026-10-27T17:49:21.326664Z",
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

`POST /api/driver/v1/offers/3eb38782-e9d8-4173-8cc0-f16c432c6be7/accept` → **200**

```json
{
  "command_id": "a9ec2da3-6056-4576-b477-965692cc785f"
}
```

```json
{
  "id": "5cbf976a-7470-45ff-8a21-1960c3581fe0",
  "order_id": "9615232a-d359-4097-86f9-1ae8c5ddf2ff",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9573d7de-154d-4349-b0a0-c91719cfaac4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9573d7de-154d-4349-b0a0-c91719cfaac4",
  "order_id": "9615232a-d359-4097-86f9-1ae8c5ddf2ff",
  "assignment_id": "5cbf976a-7470-45ff-8a21-1960c3581fe0",
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

`POST /api/driver/v1/work-sessions/a825e231-072e-43d0-9ed5-70988f5d7b24/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:49:06Z",
    "sequence": 1793123346421
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a825e231-072e-43d0-9ed5-70988f5d7b24",
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
  "last_heartbeat_at": "2026-10-27T17:49:06.4384Z",
  "last_location_at": "2026-10-27T17:49:06.4384Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9573d7de-154d-4349-b0a0-c91719cfaac4",
  "order_id": "9615232a-d359-4097-86f9-1ae8c5ddf2ff",
  "assignment_id": "5cbf976a-7470-45ff-8a21-1960c3581fe0",
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

`POST /api/driver/v1/trips/9573d7de-154d-4349-b0a0-c91719cfaac4/arrive` → **200**

```json
{
  "command_id": "58014d15-66b3-4aba-b816-e5b8d48e1168",
  "expected_version": 0
}
```

```json
{
  "id": "9573d7de-154d-4349-b0a0-c91719cfaac4",
  "order_id": "9615232a-d359-4097-86f9-1ae8c5ddf2ff",
  "assignment_id": "5cbf976a-7470-45ff-8a21-1960c3581fe0",
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
  "arrived_at": "2026-10-27T17:49:06.485419Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9573d7de-154d-4349-b0a0-c91719cfaac4/start` → **200**

```json
{
  "command_id": "5ebd8c95-85a0-4521-a436-5013eb467f8d",
  "expected_version": 1
}
```

```json
{
  "id": "9573d7de-154d-4349-b0a0-c91719cfaac4",
  "order_id": "9615232a-d359-4097-86f9-1ae8c5ddf2ff",
  "assignment_id": "5cbf976a-7470-45ff-8a21-1960c3581fe0",
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
  "arrived_at": "2026-10-27T17:49:06.485419Z",
  "started_at": "2026-10-27T17:49:06.515691Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/a825e231-072e-43d0-9ed5-70988f5d7b24/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:49:06Z",
    "sequence": 1793123346536
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a825e231-072e-43d0-9ed5-70988f5d7b24",
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
  "last_heartbeat_at": "2026-10-27T17:49:06.55327Z",
  "last_location_at": "2026-10-27T17:49:06.55327Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/9573d7de-154d-4349-b0a0-c91719cfaac4/complete` → **200**

```json
{
  "command_id": "1943ea11-9060-4311-b3f4-ed8e9262c28a",
  "expected_version": 2,
  "reported_at": "2026-10-27T17:49:06Z",
  "cash_received": true
}
```

```json
{
  "id": "9573d7de-154d-4349-b0a0-c91719cfaac4",
  "order_id": "9615232a-d359-4097-86f9-1ae8c5ddf2ff",
  "assignment_id": "5cbf976a-7470-45ff-8a21-1960c3581fe0",
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
  "arrived_at": "2026-10-27T17:49:06.485419Z",
  "started_at": "2026-10-27T17:49:06.515691Z",
  "completed_at": "2026-10-27T17:49:06.593079Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/9615232a-d359-4097-86f9-1ae8c5ddf2ff/rating` → **200**

```json
{
  "command_id": "30f637f7-f1ef-4e45-a0b0-d3e3b7f15c26",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "9615232a-d359-4097-86f9-1ae8c5ddf2ff",
  "score": 5,
  "created_at": "2026-10-27T17:49:06.635396698Z"
}
```

`POST /api/driver/v1/orders/9615232a-d359-4097-86f9-1ae8c5ddf2ff/rating` → **200**

```json
{
  "command_id": "bce058fe-134c-47ff-afa7-bdc53acc3e40",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "9615232a-d359-4097-86f9-1ae8c5ddf2ff",
  "score": 4,
  "created_at": "2026-10-27T17:49:06.667039455Z"
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
  "session_id": "3af2d0f6-6d8d-4d28-aff9-ecf5aa9a5029",
  "subject": {
    "type": "STAFF",
    "id": "1c94c3c8-7ece-415c-83ee-f2363504523f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzk0YzNjOC03ZWNlLTQxNWMtODNlZS1mMjM2MzUwNDUyM2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQyNDYsImlhdCI6MTc5MzEyMzM0NiwianRpIjoiYmRiMzhmZTctNzQ5Zi00ZDJmLWJiZjktYjE5YTQ5NDA4ZjI4Iiwic2lkIjoiM2FmMmQwZjYtNmQ4ZC00ZDI4LWFmZjktZWNmNWFhOWE1MDI5In0.rlLKeHP2axBhPZA10NfMOIGYJNoXuKJOCtn8GrqZi5Y",
  "access_expires_at": "2026-10-27T18:04:06.992469635Z",
  "refresh_token": "rOqZINHaH6zwg1ai-u8LzmbCwxPfkBSLo5Ey3wAuMTM",
  "refresh_expires_at": "2026-10-28T05:49:06.992061179Z",
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
  "session_id": "0e8d88cb-66f7-4317-938e-921562b49b83",
  "subject": {
    "type": "STAFF",
    "id": "1c94c3c8-7ece-415c-83ee-f2363504523f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzk0YzNjOC03ZWNlLTQxNWMtODNlZS1mMjM2MzUwNDUyM2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQyNDcsImlhdCI6MTc5MzEyMzM0NywianRpIjoiZTJmZWQ0YzAtZTA0Yy00ZTk0LWI3NmMtMjcxOTg2MmUwMmU2Iiwic2lkIjoiMGU4ZDg4Y2ItNjZmNy00MzE3LTkzOGUtOTIxNTYyYjQ5YjgzIn0.HN-zp0dgC3GklMMYwoDXqamFViF_6RZixgMRu8Q9lEg",
  "access_expires_at": "2026-10-27T18:04:07.274454992Z",
  "refresh_token": "vc8Af_VfLddnpldwBzxWLl4ct1gvcprcsmL4QVyApuo",
  "refresh_expires_at": "2026-10-28T05:49:07.274047817Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9615232a-d359-4097-86f9-1ae8c5ddf2ff/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "9615232a-d359-4097-86f9-1ae8c5ddf2ff",
      "author_type": "RIDER",
      "author_id": "4bc98004-97cc-4ac5-b389-3d2874ebbab5",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T17:49:06.635397Z"
    },
    {
      "order_id": "9615232a-d359-4097-86f9-1ae8c5ddf2ff",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "4bc98004-97cc-4ac5-b389-3d2874ebbab5",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T17:49:06.667039Z"
    }
  ]
}
```

Done: ratings for order 9615232a-d359-4097-86f9-1ae8c5ddf2ff.

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
  "session_id": "5803a8c6-5c8d-46a6-8f62-c4b087d9343a",
  "subject": {
    "type": "STAFF",
    "id": "1c94c3c8-7ece-415c-83ee-f2363504523f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzk0YzNjOC03ZWNlLTQxNWMtODNlZS1mMjM2MzUwNDUyM2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQyNDcsImlhdCI6MTc5MzEyMzM0NywianRpIjoiODE3ZmMwYmMtNDU5My00NzJhLTg2YjAtNWE3OGNiOTQwMTkzIiwic2lkIjoiNTgwM2E4YzYtNWM4ZC00NmE2LThmNjItYzRiMDg3ZDkzNDNhIn0.ycPt5lgtKMDGvhnqiIlx3LXch0usyci16Fz0CveJTd0",
  "access_expires_at": "2026-10-27T18:04:07.607815449Z",
  "refresh_token": "1Fy6BICjHxKltLnka5gQp30eQ9jSI4cMqDnzAoZr8KU",
  "refresh_expires_at": "2026-10-28T05:49:07.607291488Z",
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
  "command_id": "0ac8bcbb-4bcf-46be-a786-d4fd02097dc2",
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
  "changed_by": "1c94c3c8-7ece-415c-83ee-f2363504523f",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T17:49:07.673316Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "0ac8bcbb-4bcf-46be-a786-d4fd02097dc2",
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
  "changed_by": "1c94c3c8-7ece-415c-83ee-f2363504523f",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T17:49:07.673316Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48936005490",
  "device_ref": "sandbox-7491"
}
```

```json
{
  "challenge_id": "0faebb40-7844-4a4d-be2b-b59971262792",
  "expires_at": "2026-10-27T17:54:07.741136415Z",
  "resend_available_at": "2026-10-27T17:49:08.741136415Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48936005490` → **200**

```json
{
  "phone": "+48936005490",
  "audience": "CLIENT",
  "code": "181392",
  "sent_at": "2026-10-27T17:49:07.743320567Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0faebb40-7844-4a4d-be2b-b59971262792",
  "code": "181392",
  "device_ref": "sandbox-7491"
}
```

```json
{
  "session_id": "4b009358-2000-46e2-a128-c95304bc4504",
  "subject": {
    "type": "CLIENT",
    "id": "e0ba370b-8d66-4c26-a053-4606a4ac69fd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMGJhMzcwYi04ZDY2LTRjMjYtYTA1My00NjA2YTRhYzY5ZmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI0MjQ3LCJpYXQiOjE3OTMxMjMzNDcsImp0aSI6IjNiZWJhYTFjLWYwZmMtNDFiZS05YWVmLTlmY2FjMDFiMTFjMCIsInNpZCI6IjRiMDA5MzU4LTIwMDAtNDZlMi1hMTI4LWM5NTMwNGJjNDUwNCJ9.6D7X6dMLDpFvBs71vro1woIZ64E80xmp-ogS8z9VpY0",
  "access_expires_at": "2026-10-27T18:04:07.792232064Z",
  "refresh_token": "Q02gcEa-mS7hqb8NutnuQBHJwu8K78BRd8p3Af_GzUU",
  "refresh_expires_at": "2026-11-26T17:49:07.791751474Z",
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
  "correlation_id": "c7a8e36d-981c-4c86-832d-3a561dc8645b"
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
  "device_ref": "sandbox-28888"
}
```

```json
{
  "challenge_id": "9ff62fe2-0ee4-4344-853e-719905bcc89c",
  "expires_at": "2026-10-27T17:54:07.865320533Z",
  "resend_available_at": "2026-10-27T17:49:08.865320533Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "667676",
  "sent_at": "2026-10-27T17:49:07.867006266Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9ff62fe2-0ee4-4344-853e-719905bcc89c",
  "code": "667676",
  "device_ref": "sandbox-28888"
}
```

```json
{
  "session_id": "f1729aec-f68f-448e-b860-a0680df31ffc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDI0NywiaWF0IjoxNzkzMTIzMzQ3LCJqdGkiOiI3YjAzZmYxMi0yNzg2LTQ2M2EtYWEyNy04ZWZkMTZlOWM3OGIiLCJzaWQiOiJmMTcyOWFlYy1mNjhmLTQ0OGUtYjg2MC1hMDY4MGRmMzFmZmMifQ.7DR2gHAELo8K4UIbFP73itZ_pFl4DtH9m3L5giGsgyI",
  "access_expires_at": "2026-10-27T18:04:07.916558632Z",
  "refresh_token": "kMuQHclqevSzqn69RvB089UYvzWj0Zo_KEUQozdhiFc",
  "refresh_expires_at": "2026-11-26T17:49:07.916117186Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ba0aa032-13dc-4e10-8dfa-3b5bad7b9976",
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
  "last_heartbeat_at": "2026-10-27T17:49:05.566345Z",
  "last_location_at": "2026-10-27T17:49:05.566345Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ba0aa032-13dc-4e10-8dfa-3b5bad7b9976/handover` → **200**

```json
{
  "command_id": "a96fc630-9b80-432d-b7ff-e4efcb6220a0",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ba0aa032-13dc-4e10-8dfa-3b5bad7b9976",
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
  "last_heartbeat_at": "2026-10-27T17:49:05.566345Z",
  "last_location_at": "2026-10-27T17:49:05.566345Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ba0aa032-13dc-4e10-8dfa-3b5bad7b9976/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:49:07Z",
    "sequence": 1793123347990
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ba0aa032-13dc-4e10-8dfa-3b5bad7b9976",
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
  "last_heartbeat_at": "2026-10-27T17:49:08.007109Z",
  "last_location_at": "2026-10-27T17:49:08.007109Z",
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
  "session_id": "ba0aa032-13dc-4e10-8dfa-3b5bad7b9976",
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
  "last_heartbeat_at": "2026-10-27T17:49:08.007109Z",
  "last_location_at": "2026-10-27T17:49:08.007109Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ba0aa032-13dc-4e10-8dfa-3b5bad7b9976/close` → **200**

```json
{
  "command_id": "b9817aea-b104-4100-ac6b-8fba8d3b25d8",
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
  "correlation_id": "b54f1490-7b91-4d5c-ab7c-755cf026b2a7"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677541781",
  "device_ref": "sandbox-19805"
}
```

```json
{
  "challenge_id": "d48a29c0-810b-4fa9-8906-d80cb86e19f8",
  "expires_at": "2026-10-27T17:54:08.188001689Z",
  "resend_available_at": "2026-10-27T17:49:09.188001689Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677541781` → **200**

```json
{
  "phone": "+380677541781",
  "audience": "CLIENT",
  "code": "602342",
  "sent_at": "2026-10-27T17:49:08.189674413Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d48a29c0-810b-4fa9-8906-d80cb86e19f8",
  "code": "602342",
  "device_ref": "sandbox-19805"
}
```

```json
{
  "session_id": "9a8d84a5-bc85-4152-a2d1-b128feff994f",
  "subject": {
    "type": "CLIENT",
    "id": "f15dbefe-dedf-48be-afe4-5ff48af84d67"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMTVkYmVmZS1kZWRmLTQ4YmUtYWZlNC01ZmY0OGFmODRkNjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI0MjQ4LCJpYXQiOjE3OTMxMjMzNDgsImp0aSI6IjgzOWEyYzA4LTg3NTgtNDA2Yi1iYjU3LTFhYWQ2MTVlNjRiYyIsInNpZCI6IjlhOGQ4NGE1LWJjODUtNDE1Mi1hMmQxLWIxMjhmZWZmOTk0ZiJ9.UN2g7xWH3qSw9WCnHmG_RL9e_c6mIsX_Jr2PRNMESZ0",
  "access_expires_at": "2026-10-27T18:04:08.238533727Z",
  "refresh_token": "mBPAC-X0xCc7a_vU7A40uMbar3zrQLjzdcTEcVlLT2A",
  "refresh_expires_at": "2026-11-26T17:49:08.238043377Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "e4837156-f531-4b84-ae98-f320f378d4fe",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "9cb98e86-1034-408b-9c22-e22f46dd8c50",
  "upload_path": "/api/rider/v1/uploads/9cb98e86-1034-408b-9c22-e22f46dd8c50",
  "expires_at": "2026-10-27T18:04:08.27001456Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/9cb98e86-1034-408b-9c22-e22f46dd8c50` → **200**

```json
{
  "file_id": "9cb98e86-1034-408b-9c22-e22f46dd8c50",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "ea08b2bb-3458-4ffd-a55f-efb92327d730",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "9cb98e86-1034-408b-9c22-e22f46dd8c50"
  ]
}
```

```json
{
  "id": "28020520-c8bd-43e2-be7d-a4ba5c37388b",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f15dbefe-dedf-48be-afe4-5ff48af84d67",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T17:49:08.332357Z",
  "updated_at": "2026-10-27T17:49:08.332357Z",
  "messages": [
    {
      "id": "a7143e60-9f58-4ba9-9b3e-da1214a0d520",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f15dbefe-dedf-48be-afe4-5ff48af84d67",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T17:49:08.33354Z",
      "attachments": [
        {
          "file_id": "9cb98e86-1034-408b-9c22-e22f46dd8c50",
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
  "session_id": "45519a0f-dd8c-4158-901c-ab48b98f61f4",
  "subject": {
    "type": "STAFF",
    "id": "1c94c3c8-7ece-415c-83ee-f2363504523f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzk0YzNjOC03ZWNlLTQxNWMtODNlZS1mMjM2MzUwNDUyM2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQyNDgsImlhdCI6MTc5MzEyMzM0OCwianRpIjoiNWM3NGE1MTctZGUxYS00OWRkLWI2MGQtZWFlNjBmZGY5NzUwIiwic2lkIjoiNDU1MTlhMGYtZGQ4Yy00MTU4LTkwMWMtYWI0OGI5OGY2MWY0In0.4QiJsxabbBy1jqy9g4ySZVezTqeYTQOC36JqyJG5el0",
  "access_expires_at": "2026-10-27T18:04:08.630731146Z",
  "refresh_token": "ki_ShCDSzBy_nMJqk3nSbYFf3QhWZEAbNp_5oAYwzFo",
  "refresh_expires_at": "2026-10-28T05:49:08.630318043Z",
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
  "session_id": "2bfedf74-e196-44e4-9592-f6cf189ae326",
  "subject": {
    "type": "STAFF",
    "id": "1c94c3c8-7ece-415c-83ee-f2363504523f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzk0YzNjOC03ZWNlLTQxNWMtODNlZS1mMjM2MzUwNDUyM2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQyNDgsImlhdCI6MTc5MzEyMzM0OCwianRpIjoiMDYyOWZlYWUtODhmOS00ZmQyLWE5N2MtYjRhMjNhNTRhMWQ2Iiwic2lkIjoiMmJmZWRmNzQtZTE5Ni00NGU0LTk1OTItZjZjZjE4OWFlMzI2In0.MGYFAjdJuFc8tzGV3IpfcWV6-gxEY78E3CNS3-njdvU",
  "access_expires_at": "2026-10-27T18:04:08.913999429Z",
  "refresh_token": "IvmVSfAFUNvpb3p9rYKUpHVwwo8GUd-QAw6slyDTTOU",
  "refresh_expires_at": "2026-10-28T05:49:08.913547307Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/28020520-c8bd-43e2-be7d-a4ba5c37388b/attachments/9cb98e86-1034-408b-9c22-e22f46dd8c50` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "6fe76a8f-cbec-4af1-a7ee-4fb46515c45e",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "190c00f1-d629-45db-8ea8-3df84a37990a",
  "upload_path": "/api/operator/v1/uploads/190c00f1-d629-45db-8ea8-3df84a37990a",
  "expires_at": "2026-10-27T18:04:08.958932642Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/190c00f1-d629-45db-8ea8-3df84a37990a` → **200**

```json
{
  "file_id": "190c00f1-d629-45db-8ea8-3df84a37990a",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/28020520-c8bd-43e2-be7d-a4ba5c37388b` → **200**

```json
{
  "id": "28020520-c8bd-43e2-be7d-a4ba5c37388b",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f15dbefe-dedf-48be-afe4-5ff48af84d67",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T17:49:08.332357Z",
  "updated_at": "2026-10-27T17:49:08.332357Z",
  "messages": [
    {
      "id": "a7143e60-9f58-4ba9-9b3e-da1214a0d520",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f15dbefe-dedf-48be-afe4-5ff48af84d67",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T17:49:08.33354Z",
      "attachments": [
        {
          "file_id": "9cb98e86-1034-408b-9c22-e22f46dd8c50",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/28020520-c8bd-43e2-be7d-a4ba5c37388b/comments` → **200**

```json
{
  "command_id": "7a0d9bdb-e739-4aae-851c-ee4e0c2217be",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "190c00f1-d629-45db-8ea8-3df84a37990a"
  ]
}
```

```json
{
  "id": "28020520-c8bd-43e2-be7d-a4ba5c37388b",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f15dbefe-dedf-48be-afe4-5ff48af84d67",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T17:49:08.332357Z",
  "updated_at": "2026-10-27T17:49:09.049689Z",
  "messages": [
    {
      "id": "a7143e60-9f58-4ba9-9b3e-da1214a0d520",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f15dbefe-dedf-48be-afe4-5ff48af84d67",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T17:49:08.33354Z",
      "attachments": [
        {
          "file_id": "9cb98e86-1034-408b-9c22-e22f46dd8c50",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "58dfdc07-7ec6-4ab2-b9f5-c678463f098e",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "1c94c3c8-7ece-415c-83ee-f2363504523f",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T17:49:09.049321Z",
      "attachments": [
        {
          "file_id": "190c00f1-d629-45db-8ea8-3df84a37990a",
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

`GET /api/rider/v1/support/cases/28020520-c8bd-43e2-be7d-a4ba5c37388b` → **200**

```json
{
  "id": "28020520-c8bd-43e2-be7d-a4ba5c37388b",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f15dbefe-dedf-48be-afe4-5ff48af84d67",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T17:49:08.332357Z",
  "updated_at": "2026-10-27T17:49:09.049689Z",
  "messages": [
    {
      "id": "a7143e60-9f58-4ba9-9b3e-da1214a0d520",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f15dbefe-dedf-48be-afe4-5ff48af84d67",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T17:49:08.33354Z",
      "attachments": [
        {
          "file_id": "9cb98e86-1034-408b-9c22-e22f46dd8c50",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "58dfdc07-7ec6-4ab2-b9f5-c678463f098e",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T17:49:09.049321Z",
      "attachments": [
        {
          "file_id": "190c00f1-d629-45db-8ea8-3df84a37990a",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/28020520-c8bd-43e2-be7d-a4ba5c37388b/attachments/190c00f1-d629-45db-8ea8-3df84a37990a` → **200**

Done: support case 28020520-c8bd-43e2-be7d-a4ba5c37388b, rider attachment 9cb98e86-1034-408b-9c22-e22f46dd8c50, operator attachment 190c00f1-d629-45db-8ea8-3df84a37990a.

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
  "session_id": "1e3b17ef-9fe0-4a0c-badd-230dfa098fa8",
  "subject": {
    "type": "STAFF",
    "id": "1c94c3c8-7ece-415c-83ee-f2363504523f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzk0YzNjOC03ZWNlLTQxNWMtODNlZS1mMjM2MzUwNDUyM2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQyNDksImlhdCI6MTc5MzEyMzM0OSwianRpIjoiMjBmYTIzMGQtMGYyYS00ZmZiLTlmY2MtY2I0NDNiZDBmODBkIiwic2lkIjoiMWUzYjE3ZWYtOWZlMC00YTBjLWJhZGQtMjMwZGZhMDk4ZmE4In0.ScvjX4SL2SG72nDB2b_dicuUrxP8cPquR4P3G6m-I8M",
  "access_expires_at": "2026-10-27T18:04:09.395589255Z",
  "refresh_token": "_bZ5FlS4j-8S33IAmUo-Om87Cspx5QeaLfxcRl41wAk",
  "refresh_expires_at": "2026-10-28T05:49:09.395189542Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-7090"
}
```

```json
{
  "challenge_id": "9bac0dfb-07e8-4520-9e52-4f2f2cab8f58",
  "expires_at": "2026-10-27T17:54:09.419684623Z",
  "resend_available_at": "2026-10-27T17:49:10.419684623Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "541923",
  "sent_at": "2026-10-27T17:49:09.421359004Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9bac0dfb-07e8-4520-9e52-4f2f2cab8f58",
  "code": "541923",
  "device_ref": "sandbox-7090"
}
```

```json
{
  "session_id": "0ea7c8d8-e9d1-4273-8647-b67640cd8a21",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDI0OSwiaWF0IjoxNzkzMTIzMzQ5LCJqdGkiOiJhYmQ2ZjQyMy04YzliLTQzNTItOGRiMC0zZjUwYjkzYjIzZTQiLCJzaWQiOiIwZWE3YzhkOC1lOWQxLTQyNzMtODY0Ny1iNjc2NDBjZDhhMjEifQ.D66TajoyqfMqmoDB6kxUapR7vZsMUzgSLgwH4omosOk",
  "access_expires_at": "2026-10-27T18:04:09.469142565Z",
  "refresh_token": "-Zg5exm97xzxFFAysO2IDHbEPWmJ7P7Mm4LC02E4SS4",
  "refresh_expires_at": "2026-11-26T17:49:09.468711154Z",
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
  "command_id": "d99e1647-6a1c-4e5d-b7f3-9363ece14425",
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
  "device_ref": "sandbox-9380"
}
```

```json
{
  "challenge_id": "1025be96-4b58-4581-b166-9a62b3331170",
  "expires_at": "2026-10-27T17:54:09.582432518Z",
  "resend_available_at": "2026-10-27T17:49:10.582432518Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "516038",
  "sent_at": "2026-10-27T17:49:09.584172443Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1025be96-4b58-4581-b166-9a62b3331170",
  "code": "516038",
  "device_ref": "sandbox-9380"
}
```

```json
{
  "session_id": "39b5e66c-ad0c-44d3-95a3-e4a8c86b9b60",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyNDI0OSwiaWF0IjoxNzkzMTIzMzQ5LCJqdGkiOiJmMWRjN2NhNC0xMTBmLTQ0ZjMtOGQ3Ni0yYThjNTg0YjY4YzYiLCJzaWQiOiIzOWI1ZTY2Yy1hZDBjLTQ0ZDMtOTVhMy1lNGE4Yzg2YjliNjAifQ.49cFT4jaA07GuztHe6vedvtJdDgox7KPHVUcC2O2y9A",
  "access_expires_at": "2026-10-27T18:04:09.632849382Z",
  "refresh_token": "Qhr6x-c1NE9kaR6s3z2Xb2gRI3ypg_SKTDFhZ-nfIyc",
  "refresh_expires_at": "2026-11-26T17:49:09.632446564Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a825e231-072e-43d0-9ed5-70988f5d7b24",
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
  "last_heartbeat_at": "2026-10-27T17:49:06.55327Z",
  "last_location_at": "2026-10-27T17:49:06.55327Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a825e231-072e-43d0-9ed5-70988f5d7b24/handover` → **200**

```json
{
  "command_id": "cbc49d0f-e973-4659-b6b1-352c8a2c7a54",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a825e231-072e-43d0-9ed5-70988f5d7b24",
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
  "last_heartbeat_at": "2026-10-27T17:49:06.55327Z",
  "last_location_at": "2026-10-27T17:49:06.55327Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a825e231-072e-43d0-9ed5-70988f5d7b24/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:49:09Z",
    "sequence": 1793123349707
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a825e231-072e-43d0-9ed5-70988f5d7b24",
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
  "last_heartbeat_at": "2026-10-27T17:49:09.723641Z",
  "last_location_at": "2026-10-27T17:49:09.723641Z",
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
  "command_id": "ff86661e-9d82-48be-883e-57f0c41d0a46",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:49:09Z",
    "sequence": 1793123349767
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d2c74dc1-68da-48ad-835e-c4c72c0b6074",
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
  "last_heartbeat_at": "2026-10-27T17:49:09.78323Z",
  "last_location_at": "2026-10-27T17:49:09.78323Z",
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
  "session_id": "c326790c-682b-43cc-8d60-b679820d69d5",
  "subject": {
    "type": "STAFF",
    "id": "1c94c3c8-7ece-415c-83ee-f2363504523f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzk0YzNjOC03ZWNlLTQxNWMtODNlZS1mMjM2MzUwNDUyM2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjQyNTAsImlhdCI6MTc5MzEyMzM1MCwianRpIjoiMDA4YjRhMDEtM2M0ZS00NWNiLTgxNTAtYjJjMWQ3NzAxMDU1Iiwic2lkIjoiYzMyNjc5MGMtNjgyYi00M2NjLThkNjAtYjY3OTgyMGQ2OWQ1In0.AwyzY-lB8VZUaGPKx7ehUng_YdCubbAgjP6hNbb22bA",
  "access_expires_at": "2026-10-27T18:04:10.145185389Z",
  "refresh_token": "oe8FOC-dqBtqercHk2Msgt_mD-xH1uxMts20t1L_cHI",
  "refresh_expires_at": "2026-10-28T05:49:10.144756502Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c825151a-abb4-48c7-999f-4fcf68393597",
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
  "id": "766b5f25-5b1e-4153-82c9-e1eff1b8f301",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T17:54:10.174173Z",
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
  "command_id": "bef113d7-f605-4a5d-bbdb-21e48a5d48f8",
  "quote_id": "766b5f25-5b1e-4153-82c9-e1eff1b8f301",
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
  "id": "1c2079be-67c8-481a-9d86-0f81d8dd978c",
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
  "created_at": "2026-10-27T17:49:10.206909Z",
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
    "id": "9af20246-8284-49b0-9874-c1508bf2d8bc",
    "order_id": "1c2079be-67c8-481a-9d86-0f81d8dd978c",
    "expires_at": "2026-10-27T17:49:25.20929Z",
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

`POST /api/driver/v1/offers/9af20246-8284-49b0-9874-c1508bf2d8bc/accept` → **200**

```json
{
  "command_id": "d8573054-edb3-47eb-8973-765f0ab8193b"
}
```

```json
{
  "id": "7e4965ca-3186-4a8d-b411-a2ba9dd135bf",
  "order_id": "1c2079be-67c8-481a-9d86-0f81d8dd978c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "52e2f382-3c52-48d5-a66b-fc753aed0034",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "52e2f382-3c52-48d5-a66b-fc753aed0034",
  "order_id": "1c2079be-67c8-481a-9d86-0f81d8dd978c",
  "assignment_id": "7e4965ca-3186-4a8d-b411-a2ba9dd135bf",
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

`POST /api/driver/v1/work-sessions/d2c74dc1-68da-48ad-835e-c4c72c0b6074/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:49:10Z",
    "sequence": 1793123350326
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d2c74dc1-68da-48ad-835e-c4c72c0b6074",
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
  "last_heartbeat_at": "2026-10-27T17:49:10.342681Z",
  "last_location_at": "2026-10-27T17:49:10.342681Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/52e2f382-3c52-48d5-a66b-fc753aed0034/arrive` → **200**

```json
{
  "command_id": "633cc770-3547-45ff-bfa6-f58113962def",
  "expected_version": 0
}
```

```json
{
  "id": "52e2f382-3c52-48d5-a66b-fc753aed0034",
  "order_id": "1c2079be-67c8-481a-9d86-0f81d8dd978c",
  "assignment_id": "7e4965ca-3186-4a8d-b411-a2ba9dd135bf",
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
  "arrived_at": "2026-10-27T17:49:10.374387Z",
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

`POST /api/driver/v1/trips/52e2f382-3c52-48d5-a66b-fc753aed0034/start` → **200**

```json
{
  "command_id": "83c6270f-a7ff-4841-85db-a8438976dccb",
  "expected_version": 1
}
```

```json
{
  "id": "52e2f382-3c52-48d5-a66b-fc753aed0034",
  "order_id": "1c2079be-67c8-481a-9d86-0f81d8dd978c",
  "assignment_id": "7e4965ca-3186-4a8d-b411-a2ba9dd135bf",
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
  "arrived_at": "2026-10-27T17:49:10.374387Z",
  "started_at": "2026-10-27T17:49:10.410391Z",
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

`POST /api/driver/v1/trips/52e2f382-3c52-48d5-a66b-fc753aed0034/complete` → **200**

```json
{
  "command_id": "e57f0558-b048-4440-b018-28bd18a351bd",
  "expected_version": 2,
  "reported_at": "2026-10-27T17:49:10Z",
  "cash_received": true
}
```

```json
{
  "id": "52e2f382-3c52-48d5-a66b-fc753aed0034",
  "order_id": "1c2079be-67c8-481a-9d86-0f81d8dd978c",
  "assignment_id": "7e4965ca-3186-4a8d-b411-a2ba9dd135bf",
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
  "arrived_at": "2026-10-27T17:49:10.374387Z",
  "started_at": "2026-10-27T17:49:10.410391Z",
  "completed_at": "2026-10-27T17:49:10.450348Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/1c2079be-67c8-481a-9d86-0f81d8dd978c` → **200**

```json
{
  "id": "1c2079be-67c8-481a-9d86-0f81d8dd978c",
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
    "id": "7e4965ca-3186-4a8d-b411-a2ba9dd135bf",
    "order_id": "1c2079be-67c8-481a-9d86-0f81d8dd978c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "52e2f382-3c52-48d5-a66b-fc753aed0034",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T17:49:10.206909Z",
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
  "session_id": "a825e231-072e-43d0-9ed5-70988f5d7b24",
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
  "last_heartbeat_at": "2026-10-27T17:49:09.723641Z",
  "last_location_at": "2026-10-27T17:49:09.723641Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a825e231-072e-43d0-9ed5-70988f5d7b24/close` → **200**

```json
{
  "command_id": "ad323c7f-c71f-4878-a69e-624962ac677d",
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
  "session_id": "d2c74dc1-68da-48ad-835e-c4c72c0b6074",
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
  "last_heartbeat_at": "2026-10-27T17:49:10.342681Z",
  "last_location_at": "2026-10-27T17:49:10.342681Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d2c74dc1-68da-48ad-835e-c4c72c0b6074/close` → **200**

```json
{
  "command_id": "615d73d9-8ab2-4ccf-ba67-c5b74a271235",
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

Done: terminal order 1c2079be-67c8-481a-9d86-0f81d8dd978c by Andrii (5a000000-0000-4000-8000-000000000403).
