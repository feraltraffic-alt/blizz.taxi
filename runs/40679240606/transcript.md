# Sandbox transcript (2026-10-28T11:21:42Z, 417cbf5)

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
  "correlation_id": "f94587ef-4689-4ee0-ac04-674cea32bf9b"
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
  "session_id": "fbb4d0ed-f6cf-4150-9d74-599ce4f593f3",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc0MDgsImlhdCI6MTc5MzE4NjUwOCwianRpIjoiZjU2ZTE2YTItNzRiZi00ODRhLTk0MTAtOTFjMzdhMGFmODIxIiwic2lkIjoiZmJiNGQwZWQtZjZjZi00MTUwLTlkNzQtNTk5Y2U0ZjU5M2YzIn0.RaPpGv-erf76uzt9eV5VJNXSwh6npvXK-P9hH561D2o",
  "access_expires_at": "2026-10-28T11:36:48.04647488Z",
  "refresh_token": "yfIGnQ3tvTOBLVRtmGW09VFICLYM8HblPgKFd2ykmRc",
  "refresh_expires_at": "2026-10-28T23:21:48.044830369Z",
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
  "session_id": "abd489ed-0668-4a07-8083-6791cd694c3d",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc0MDksImlhdCI6MTc5MzE4NjUwOSwianRpIjoiZjEzZTNlZmUtMTNiOC00OTY5LThmZjYtMjcwNmM4ZjM1MmMxIiwic2lkIjoiYWJkNDg5ZWQtMDY2OC00YTA3LTgwODMtNjc5MWNkNjk0YzNkIn0.WqRCYUlrVu7ZWtZVLDpynLEJiOzpy0mpgbrUBAePr7E",
  "access_expires_at": "2026-10-28T11:36:49.125531255Z",
  "refresh_token": "dlSrgukBVxHPfspZilJzTVHN_pZAf-amUqePk66ik2Q",
  "refresh_expires_at": "2026-10-28T23:21:49.124782789Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "5f922528-a4a3-41db-802d-098d88fdba76",
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
  "id": "ea46d928-7fe4-4ee5-b808-ca48171d2162",
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
  "created_by": "23eabed1-5103-466a-be3b-89bb210931f7",
  "created_at": "2026-10-28T11:21:49.332639Z",
  "updated_at": "2026-10-28T11:21:49.332639Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634665195",
  "device_ref": "sandbox-14145"
}
```

```json
{
  "challenge_id": "565fc4e6-f866-4818-a97c-d355527e2b58",
  "expires_at": "2026-10-28T11:26:49.527836788Z",
  "resend_available_at": "2026-10-28T11:21:50.527836788Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634665195` → **200**

```json
{
  "phone": "+380634665195",
  "audience": "CLIENT",
  "code": "299556",
  "sent_at": "2026-10-28T11:21:49.535273991Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "565fc4e6-f866-4818-a97c-d355527e2b58",
  "code": "299556",
  "device_ref": "sandbox-14145"
}
```

```json
{
  "session_id": "5f5ce256-3a80-451a-84ec-f0ec5acbb6e5",
  "subject": {
    "type": "CLIENT",
    "id": "1a9a609f-d426-4e2f-89fb-0c3008bd0e4d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYTlhNjA5Zi1kNDI2LTRlMmYtODlmYi0wYzMwMDhiZDBlNGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg3NDA5LCJpYXQiOjE3OTMxODY1MDksImp0aSI6Ijc5NzhlYTFjLTdjZTYtNGQ5ZC05MjAxLTFhZWU4OWM5NjlmNiIsInNpZCI6IjVmNWNlMjU2LTNhODAtNDUxYS04NGVjLWYwZWM1YWNiYjZlNSJ9.W9JdZ58WRrSqDy5dJAZJJ_n8nQ8jS6u8eUbUTYH62hg",
  "access_expires_at": "2026-10-28T11:36:49.755866025Z",
  "refresh_token": "CLVIxKehf9UFQ5X6c-loujvO0yvLDlHA38OYl_oqiuE",
  "refresh_expires_at": "2026-11-27T11:21:49.755125222Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380634665195` → **200**

```json
{
  "client_id": "1a9a609f-d426-4e2f-89fb-0c3008bd0e4d"
}
```

`POST /api/admin/v1/rider-wallets/1a9a609f-d426-4e2f-89fb-0c3008bd0e4d/top-ups` → **201**

```json
{
  "command_id": "13bfbabd-bdf9-4f07-8522-0b8e33366b24",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "1a9a609f-d426-4e2f-89fb-0c3008bd0e4d",
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
      "id": "12663eed-96d9-4532-ad8d-705efdc7b9aa",
      "at": "2026-10-28T11:21:50.123559Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "23eabed1-5103-466a-be3b-89bb210931f7",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "432342ab-531b-4fa3-9894-9e5f766c5bc2",
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
  "id": "7efe01e5-d070-45ba-beaf-5b12f4df4b0a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:26:50.417671Z",
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
      "id": "ea46d928-7fe4-4ee5-b808-ca48171d2162",
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
  "device_ref": "sandbox-10837"
}
```

```json
{
  "challenge_id": "b44337a7-4598-4cfc-b3f7-e4684c133150",
  "expires_at": "2026-10-28T11:26:50.618530094Z",
  "resend_available_at": "2026-10-28T11:21:51.618530094Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "618454",
  "sent_at": "2026-10-28T11:21:50.621699747Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b44337a7-4598-4cfc-b3f7-e4684c133150",
  "code": "618454",
  "device_ref": "sandbox-10837"
}
```

```json
{
  "session_id": "918bdbb3-7224-4508-8c36-e444bf1e7763",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NzQxMCwiaWF0IjoxNzkzMTg2NTEwLCJqdGkiOiIzNmVkNjYyMy00OWQ1LTRlNzQtOWY0ZC00ZmUxNzI3NjMxY2EiLCJzaWQiOiI5MThiZGJiMy03MjI0LTQ1MDgtOGMzNi1lNDQ0YmYxZTc3NjMifQ.4TxRrQVDnpP8zYFEvO9l-p8-Bf6FUC3BFy5AupeD-fA",
  "access_expires_at": "2026-10-28T11:36:50.829378087Z",
  "refresh_token": "tpkciGmb-ARdQ8KP-_tB-IlZ2kXJNzERRsdB-m604z4",
  "refresh_expires_at": "2026-11-27T11:21:50.828566929Z",
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
  "command_id": "3e77e425-880f-40f5-82a9-c3cd7d414c8c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:21:51Z",
    "sequence": 1793186511199
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4154e959-9af4-4917-808a-8dbdf688d5b4",
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
  "last_heartbeat_at": "2026-10-28T11:21:51.249993Z",
  "last_location_at": "2026-10-28T11:21:51.249993Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "29d5c73b-906d-471d-aa1e-59e44fdaa6c0",
  "quote_id": "7efe01e5-d070-45ba-beaf-5b12f4df4b0a",
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
  "id": "33717be1-5bb2-43a2-a09b-62b0c991849e",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1a9a609f-d426-4e2f-89fb-0c3008bd0e4d",
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
  "created_at": "2026-10-28T11:21:51.486376Z",
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
  "client_id": "1a9a609f-d426-4e2f-89fb-0c3008bd0e4d",
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
      "id": "12663eed-96d9-4532-ad8d-705efdc7b9aa",
      "at": "2026-10-28T11:21:50.123559Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "23eabed1-5103-466a-be3b-89bb210931f7",
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
    "id": "990d6fbd-aac1-4599-a1ac-0141c376635f",
    "order_id": "33717be1-5bb2-43a2-a09b-62b0c991849e",
    "expires_at": "2026-10-28T11:22:06.497923Z",
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

`POST /api/driver/v1/offers/990d6fbd-aac1-4599-a1ac-0141c376635f/accept` → **200**

```json
{
  "command_id": "13e1a7d2-7116-47ec-af6c-baf73c8d76c6"
}
```

```json
{
  "id": "a9834522-df8b-4a90-b4ac-457333aeb701",
  "order_id": "33717be1-5bb2-43a2-a09b-62b0c991849e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "93208b62-77b2-4650-8794-d1cd1aefe465",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "93208b62-77b2-4650-8794-d1cd1aefe465",
  "order_id": "33717be1-5bb2-43a2-a09b-62b0c991849e",
  "assignment_id": "a9834522-df8b-4a90-b4ac-457333aeb701",
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

`POST /api/driver/v1/work-sessions/4154e959-9af4-4917-808a-8dbdf688d5b4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:21:52Z",
    "sequence": 1793186512496
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4154e959-9af4-4917-808a-8dbdf688d5b4",
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
  "last_heartbeat_at": "2026-10-28T11:21:52.518146Z",
  "last_location_at": "2026-10-28T11:21:52.518146Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/93208b62-77b2-4650-8794-d1cd1aefe465/arrive` → **200**

```json
{
  "command_id": "f5464954-3019-4c89-91d1-7ee196471500",
  "expected_version": 0
}
```

```json
{
  "id": "93208b62-77b2-4650-8794-d1cd1aefe465",
  "order_id": "33717be1-5bb2-43a2-a09b-62b0c991849e",
  "assignment_id": "a9834522-df8b-4a90-b4ac-457333aeb701",
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
  "arrived_at": "2026-10-28T11:21:52.709731Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/93208b62-77b2-4650-8794-d1cd1aefe465/start` → **200**

```json
{
  "command_id": "9bd201b3-4803-44b6-af33-26ee1c4c8501",
  "expected_version": 1
}
```

```json
{
  "id": "93208b62-77b2-4650-8794-d1cd1aefe465",
  "order_id": "33717be1-5bb2-43a2-a09b-62b0c991849e",
  "assignment_id": "a9834522-df8b-4a90-b4ac-457333aeb701",
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
  "arrived_at": "2026-10-28T11:21:52.709731Z",
  "started_at": "2026-10-28T11:21:52.91827Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/93208b62-77b2-4650-8794-d1cd1aefe465/complete` → **200**

```json
{
  "command_id": "079400d6-20fd-4776-8972-f90a60c009a1",
  "expected_version": 2,
  "reported_at": "2026-10-28T11:21:53Z",
  "cash_received": true
}
```

```json
{
  "id": "93208b62-77b2-4650-8794-d1cd1aefe465",
  "order_id": "33717be1-5bb2-43a2-a09b-62b0c991849e",
  "assignment_id": "a9834522-df8b-4a90-b4ac-457333aeb701",
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
  "arrived_at": "2026-10-28T11:21:52.709731Z",
  "started_at": "2026-10-28T11:21:52.91827Z",
  "completed_at": "2026-10-28T11:21:53.123149Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "1a9a609f-d426-4e2f-89fb-0c3008bd0e4d",
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
      "id": "06beb163-8cf8-4ed7-81ce-39cdffc29ad0",
      "at": "2026-10-28T11:21:53.460331Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "33717be1-5bb2-43a2-a09b-62b0c991849e"
    },
    {
      "id": "12663eed-96d9-4532-ad8d-705efdc7b9aa",
      "at": "2026-10-28T11:21:50.123559Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "23eabed1-5103-466a-be3b-89bb210931f7",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/ea46d928-7fe4-4ee5-b808-ca48171d2162/archive` → **200**

```json
{
  "command_id": "5a879550-fd12-4234-8f01-0c093fa5b48e",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "ea46d928-7fe4-4ee5-b808-ca48171d2162",
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
  "created_by": "23eabed1-5103-466a-be3b-89bb210931f7",
  "created_at": "2026-10-28T11:21:49.332639Z",
  "updated_at": "2026-10-28T11:21:56.504519Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4154e959-9af4-4917-808a-8dbdf688d5b4",
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
  "last_heartbeat_at": "2026-10-28T11:21:52.518146Z",
  "last_location_at": "2026-10-28T11:21:52.518146Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4154e959-9af4-4917-808a-8dbdf688d5b4/close` → **200**

```json
{
  "command_id": "ae63bb2e-0f5d-4802-a78e-2cf2f054413e",
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

Done: order 33717be1-5bb2-43a2-a09b-62b0c991849e.

# Scenario: call-recording

## The admin says which city the service number belongs to

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
  "session_id": "73f102bc-23d0-4328-92b3-bbe0be2f3de3",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc0MTcsImlhdCI6MTc5MzE4NjUxNywianRpIjoiMTZmYWYxNGUtMzg3ZS00MTU4LWJkMDgtZWY4NTVjYjE5ZWZjIiwic2lkIjoiNzNmMTAyYmMtMjNkMC00MzI4LTkyYjMtYmJlMGJlMmYzZGUzIn0.G2mA2deLheHegigxqJ1Oy2BiIgWBbXbn1WLJF0ggUlY",
  "access_expires_at": "2026-10-28T11:36:57.290872363Z",
  "refresh_token": "5vVR-yfcn9Uc1nXxYyk5SFQN_WpTw2bi0NWoE-I8vjs",
  "refresh_expires_at": "2026-10-28T23:21:57.290120874Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/call-lines` → **200**

```json
{
  "lines": []
}
```

`POST /api/admin/v1/call-lines/%2B380441110060` → **200**

```json
{
  "command_id": "6286b984-f81b-49c2-8120-f317fd9c84b2",
  "expected_version": 0,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "label": "Kyiv call centre",
  "reason": "Sandbox call-recording scenario"
}
```

```json
{
  "number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "label": "Kyiv call centre",
  "version": 1
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
  "session_id": "3906e61a-0233-4e1a-9f83-03da20380177",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc0MTgsImlhdCI6MTc5MzE4NjUxOCwianRpIjoiZGViNzBhN2YtOWU3Yy00MWQyLWI3MDItN2FiNTg0MDAyNmFmIiwic2lkIjoiMzkwNmU2MWEtMDIzMy00ZTFhLTlmODMtMDNkYTIwMzgwMTc3In0.BrCnrMAiQn2vRlOKI_g84Xf382Kc6rouflgKrjjBk8o",
  "access_expires_at": "2026-10-28T11:36:58.055669787Z",
  "refresh_token": "Nw3A2OCbRN5dqKxFfltyQlF4-W06HIdDIqZSR25G85o",
  "refresh_expires_at": "2026-10-28T23:21:58.055021462Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.3022728184",
    "linkedid": "1730052700.3022728184",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674776534"
    },
    "dialplan": {
      "context": "from-trunk",
      "exten": "380441110060"
    }
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "1730052700.3022728184",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "e905f284-ceac-4721-a763-11f5a710d9a4",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380674776534",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T11:21:58.241451Z",
      "answered_at": null,
      "ended_at": "2026-10-28T11:21:58.26445Z",
      "recording": null
    }
  ]
}
```

## A call is taken and ends: its recording is fetched from Asterisk

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052600.2145524020",
    "linkedid": "1730052600.2145524020",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674776534"
    },
    "dialplan": {
      "context": "from-trunk",
      "exten": "380441110060"
    }
  }
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "fe458435-3756-4865-ba52-804ddb3f7aab",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674776534",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T11:21:58.485474Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/fe458435-3756-4865-ba52-804ddb3f7aab/answer` → **200**

```json
{
  "command_id": "a82698f6-ef48-41c0-b034-cb639a03eb55"
}
```

```json
{
  "id": "fe458435-3756-4865-ba52-804ddb3f7aab",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674776534",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "23eabed1-5103-466a-be3b-89bb210931f7",
  "order_ids": [],
  "started_at": "2026-10-28T11:21:58.485474Z",
  "answered_at": "2026-10-28T11:21:58.703699Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2145524020",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "1730052600.2145524020",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "fe458435-3756-4865-ba52-804ddb3f7aab",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674776534",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "23eabed1-5103-466a-be3b-89bb210931f7",
      "order_ids": [],
      "started_at": "2026-10-28T11:21:58.485474Z",
      "answered_at": "2026-10-28T11:21:58.703699Z",
      "ended_at": "2026-10-28T11:21:58.908758Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "fe458435-3756-4865-ba52-804ddb3f7aab",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674776534",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "23eabed1-5103-466a-be3b-89bb210931f7",
      "order_ids": [],
      "started_at": "2026-10-28T11:21:58.485474Z",
      "answered_at": "2026-10-28T11:21:58.703699Z",
      "ended_at": "2026-10-28T11:21:58.908758Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "fe458435-3756-4865-ba52-804ddb3f7aab",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674776534",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "23eabed1-5103-466a-be3b-89bb210931f7",
      "order_ids": [],
      "started_at": "2026-10-28T11:21:58.485474Z",
      "answered_at": "2026-10-28T11:21:58.703699Z",
      "ended_at": "2026-10-28T11:21:58.908758Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T11:22:01.312028Z"
      }
    }
  ]
}
```

Recording: STORED

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "fe458435-3756-4865-ba52-804ddb3f7aab",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674776534",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "23eabed1-5103-466a-be3b-89bb210931f7",
      "order_ids": [],
      "started_at": "2026-10-28T11:21:58.485474Z",
      "answered_at": "2026-10-28T11:21:58.703699Z",
      "ended_at": "2026-10-28T11:21:58.908758Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T11:22:01.312028Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/fe458435-3756-4865-ba52-804ddb3f7aab/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/fe458435-3756-4865-ba52-804ddb3f7aab/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=fe458435-3756-4865-ba52-804ddb3f7aab` → **200**

```json
{
  "changes": [
    {
      "id": "f7d17a7d-4176-4cac-9ec1-74dc4b18cc31",
      "occurred_at": "2026-10-28T11:22:03.732865Z",
      "actor_type": "STAFF",
      "actor_id": "23eabed1-5103-466a-be3b-89bb210931f7",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "fe458435-3756-4865-ba52-804ddb3f7aab",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"ac042356-8688-4e70-af2f-ef48d48a14c2\", \"order_ids\": []}",
      "correlation_id": "bfaac99c-3551-4be7-b7b5-602d3ed31948"
    },
    {
      "id": "cbac546a-433a-454e-be8b-31c94ab7017b",
      "occurred_at": "2026-10-28T11:22:03.704243Z",
      "actor_type": "STAFF",
      "actor_id": "23eabed1-5103-466a-be3b-89bb210931f7",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "fe458435-3756-4865-ba52-804ddb3f7aab",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"ac042356-8688-4e70-af2f-ef48d48a14c2\", \"order_ids\": []}",
      "correlation_id": "6e34834f-e044-452e-a289-e138dffd8a56"
    }
  ]
}
```

Done: call fe458435-3756-4865-ba52-804ddb3f7aab recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638934365",
  "device_ref": "sandbox-32"
}
```

```json
{
  "challenge_id": "580d86b7-1f7f-43f5-90b0-4509b36f98de",
  "expires_at": "2026-10-28T11:27:03.953740696Z",
  "resend_available_at": "2026-10-28T11:22:04.953740696Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638934365` → **200**

```json
{
  "phone": "+380638934365",
  "audience": "CLIENT",
  "code": "168657",
  "sent_at": "2026-10-28T11:22:03.956283726Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "580d86b7-1f7f-43f5-90b0-4509b36f98de",
  "code": "168657",
  "device_ref": "sandbox-32"
}
```

```json
{
  "session_id": "0bb5d72e-1f12-4013-ba68-73c468264191",
  "subject": {
    "type": "CLIENT",
    "id": "9fe4ebfd-2079-4eb3-a84c-2b90bf98dd0d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmU0ZWJmZC0yMDc5LTRlYjMtYTg0Yy0yYjkwYmY5OGRkMGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg3NDI0LCJpYXQiOjE3OTMxODY1MjQsImp0aSI6IjRjZjMyYzUzLTgxMjctNDUxOS1hYzJiLWFkYmMyN2EwZTY1MCIsInNpZCI6IjBiYjVkNzJlLTFmMTItNDAxMy1iYTY4LTczYzQ2ODI2NDE5MSJ9.vOfFzUT1stjZwws1bMhZ6Wg_1BgrhA3H6ozsIwOalaI",
  "access_expires_at": "2026-10-28T11:37:04.157241366Z",
  "refresh_token": "ZSDxCGUpBD2lAh22fvzU73j2N3lbD5cu0mju-xc0fTk",
  "refresh_expires_at": "2026-11-27T11:22:04.156842161Z",
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
  "device_ref": "sandbox-8206"
}
```

```json
{
  "challenge_id": "16ee28ed-1559-4284-b5d3-13d660226c46",
  "expires_at": "2026-10-28T11:27:04.509559318Z",
  "resend_available_at": "2026-10-28T11:22:05.509559318Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "984397",
  "sent_at": "2026-10-28T11:22:04.512051912Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "16ee28ed-1559-4284-b5d3-13d660226c46",
  "code": "984397",
  "device_ref": "sandbox-8206"
}
```

```json
{
  "session_id": "73afef76-b395-4369-99b3-b4185fac2fce",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NzQyNCwiaWF0IjoxNzkzMTg2NTI0LCJqdGkiOiIzNTI1ODk4Ni0zNGE4LTRjZDgtYjBmNS1lOGRmMGJlNmIwMDUiLCJzaWQiOiI3M2FmZWY3Ni1iMzk1LTQzNjktOTliMy1iNDE4NWZhYzJmY2UifQ.iqlplWjhAYMPjKYMmCkrscmaE-CLFXdbrfMTa_jlHk4",
  "access_expires_at": "2026-10-28T11:37:04.707454234Z",
  "refresh_token": "5nPodcT-b3IrLZZkte5LrBXiG1TC8AsDWMacxELWnp8",
  "refresh_expires_at": "2026-11-27T11:22:04.706808933Z",
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
  "session_id": "84d15cc0-a8a1-4bad-95e0-846181cd1583",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc0MjUsImlhdCI6MTc5MzE4NjUyNSwianRpIjoiYWY5NWQ0ODYtNzhkNC00YzgxLTgzOTMtMDBjM2I3MzQwYjQ4Iiwic2lkIjoiODRkMTVjYzAtYThhMS00YmFkLTk1ZTAtODQ2MTgxY2QxNTgzIn0.6EKy9CY2Ig9u2m25FibYLR0ZscjDdAXUdu2OF6XvSE8",
  "access_expires_at": "2026-10-28T11:37:05.293751704Z",
  "refresh_token": "Glum2R_Jmg2e9sMJf6vNtR249P4-3PsxODtlk_aR9d0",
  "refresh_expires_at": "2026-10-28T23:22:05.293260972Z",
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
  "session_id": "f21573f6-222b-4dee-b14c-f5529f88e8c5",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc0MjUsImlhdCI6MTc5MzE4NjUyNSwianRpIjoiMjFmNjBiODktNjg2NC00OTI1LWJiMGUtZmZhMzFjODNhYmI4Iiwic2lkIjoiZjIxNTczZjYtMjIyYi00ZGVlLWIxNGMtZjU1MjlmODhlOGM1In0.Ebne4FaoipTniZtpv7v9_6GjVccvBdq3gjj-dkxLdeU",
  "access_expires_at": "2026-10-28T11:37:05.680726709Z",
  "refresh_token": "i0Cnav5ZhPuDZuQxufXbNklvB8QDfgbkDT99TIqpL5k",
  "refresh_expires_at": "2026-10-28T23:22:05.680198542Z",
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
  "command_id": "1d13928a-0069-4bba-9f48-96adc216150f",
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
  "id": "8fc83247-5f82-4d00-92da-1334386d7f64",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:27:06.036157Z",
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
  "command_id": "fdc28605-aff7-4934-8abb-164a04a00297",
  "quote_id": "8fc83247-5f82-4d00-92da-1334386d7f64",
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
  "id": "3b28811e-6a78-4260-9432-ea13b806f07c",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9fe4ebfd-2079-4eb3-a84c-2b90bf98dd0d",
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
  "created_at": "2026-10-28T11:22:06.227646Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/3b28811e-6a78-4260-9432-ea13b806f07c` → **200**

```json
{
  "id": "3b28811e-6a78-4260-9432-ea13b806f07c",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9fe4ebfd-2079-4eb3-a84c-2b90bf98dd0d",
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
  "created_at": "2026-10-28T11:22:06.227646Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/3b28811e-6a78-4260-9432-ea13b806f07c/cancel` → **200**

```json
{
  "command_id": "2b8a1a65-db6f-44ce-8d07-c1efdebd9e27",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "3b28811e-6a78-4260-9432-ea13b806f07c",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9fe4ebfd-2079-4eb3-a84c-2b90bf98dd0d",
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
  "created_at": "2026-10-28T11:22:06.227646Z",
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
  "command_id": "d8c36cf8-dc12-4efe-978b-c5f8acec4614",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:22:06Z",
    "sequence": 1793186526974
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "516ab83d-1194-4877-a716-7a2e093d817a",
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
  "last_heartbeat_at": "2026-10-28T11:22:06.992061Z",
  "last_location_at": "2026-10-28T11:22:06.992061Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-16990"
}
```

```json
{
  "challenge_id": "0ea34977-901a-485a-9b38-a9a6368439dd",
  "expires_at": "2026-10-28T11:27:07.175097018Z",
  "resend_available_at": "2026-10-28T11:22:08.175097018Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "195719",
  "sent_at": "2026-10-28T11:22:07.177646447Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0ea34977-901a-485a-9b38-a9a6368439dd",
  "code": "195719",
  "device_ref": "sandbox-16990"
}
```

```json
{
  "session_id": "4538241b-ae57-4625-9bdb-380372722b35",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NzQyNywiaWF0IjoxNzkzMTg2NTI3LCJqdGkiOiJiYjdhMTRjOS1lZDg0LTQ4NzAtOTljMy1hZWVhM2M3MzlkOTEiLCJzaWQiOiI0NTM4MjQxYi1hZTU3LTQ2MjUtOWJkYi0zODAzNzI3MjJiMzUifQ.1UmGy8EqihVMUOsxqka5hU4fg1QZKt8oYV0jn2Fi_Hg",
  "access_expires_at": "2026-10-28T11:37:07.375990202Z",
  "refresh_token": "e-iw3I2RDWXQ2fMkusT7H-MHOhyNheqUGT0T8octQqg",
  "refresh_expires_at": "2026-11-27T11:22:07.375446272Z",
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
  "command_id": "98f379a0-e3cb-4c55-9dfe-be963d756fe9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:22:07Z",
    "sequence": 1793186527714
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0d1bbf74-8b15-4d83-96f6-375902a0824a",
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
  "last_heartbeat_at": "2026-10-28T11:22:07.731285Z",
  "last_location_at": "2026-10-28T11:22:07.731285Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b5f480a6-7b94-4bec-a0db-5acef30702e6",
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
  "id": "c0f1e9fc-ba6b-41e9-875e-fd375d4a9f13",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:27:07.916041Z",
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
  "command_id": "3a305298-edea-4494-9fcc-f07ad9a22d6b",
  "quote_id": "c0f1e9fc-ba6b-41e9-875e-fd375d4a9f13",
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
  "id": "29adcba2-f157-4ccb-8832-7e9b0a340c97",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9fe4ebfd-2079-4eb3-a84c-2b90bf98dd0d",
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
  "created_at": "2026-10-28T11:22:08.107441Z",
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
    "id": "4d294df2-06a9-410a-8adb-f8c8f397e3cf",
    "order_id": "29adcba2-f157-4ccb-8832-7e9b0a340c97",
    "expires_at": "2026-10-28T11:22:23.110338Z",
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

`POST /api/driver/v1/offers/4d294df2-06a9-410a-8adb-f8c8f397e3cf/accept` → **200**

```json
{
  "command_id": "2b0a27c5-eb18-4a69-9d55-7d253f302229"
}
```

```json
{
  "id": "fa634841-9adc-487d-b537-859078df7343",
  "order_id": "29adcba2-f157-4ccb-8832-7e9b0a340c97",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e48532fd-f2c1-4118-aa52-ac6e9af7de1c",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e48532fd-f2c1-4118-aa52-ac6e9af7de1c",
  "order_id": "29adcba2-f157-4ccb-8832-7e9b0a340c97",
  "assignment_id": "fa634841-9adc-487d-b537-859078df7343",
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

`POST /api/driver/v1/trips/e48532fd-f2c1-4118-aa52-ac6e9af7de1c/cancel` → **200**

```json
{
  "command_id": "af263dcc-0873-46fb-980c-c5a204b225a6",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "e48532fd-f2c1-4118-aa52-ac6e9af7de1c",
  "order_id": "29adcba2-f157-4ccb-8832-7e9b0a340c97",
  "assignment_id": "fa634841-9adc-487d-b537-859078df7343",
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

`GET /api/rider/v1/orders/29adcba2-f157-4ccb-8832-7e9b0a340c97` → **200**

```json
{
  "id": "29adcba2-f157-4ccb-8832-7e9b0a340c97",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "9fe4ebfd-2079-4eb3-a84c-2b90bf98dd0d",
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
    "id": "fa634841-9adc-487d-b537-859078df7343",
    "order_id": "29adcba2-f157-4ccb-8832-7e9b0a340c97",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "e48532fd-f2c1-4118-aa52-ac6e9af7de1c",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T11:22:08.107441Z",
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
    "id": "64e159d4-238b-477b-853c-6a1d15d8893a",
    "order_id": "29adcba2-f157-4ccb-8832-7e9b0a340c97",
    "expires_at": "2026-10-28T11:22:23.855116Z",
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

`POST /api/driver/v1/offers/64e159d4-238b-477b-853c-6a1d15d8893a/accept` → **200**

```json
{
  "command_id": "b18101ac-271b-4272-99bc-16361cfe4121"
}
```

```json
{
  "id": "0a2f67e1-9a59-414b-a0af-5484862c9ec3",
  "order_id": "29adcba2-f157-4ccb-8832-7e9b0a340c97",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2bc36c08-0d67-4be7-b8d2-8fffbd3339d2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2bc36c08-0d67-4be7-b8d2-8fffbd3339d2",
  "order_id": "29adcba2-f157-4ccb-8832-7e9b0a340c97",
  "assignment_id": "0a2f67e1-9a59-414b-a0af-5484862c9ec3",
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

`POST /api/driver/v1/trips/2bc36c08-0d67-4be7-b8d2-8fffbd3339d2/cancel` → **200**

```json
{
  "command_id": "23a22b06-62d4-4b30-9c18-6b5b064c6e36",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "2bc36c08-0d67-4be7-b8d2-8fffbd3339d2",
  "order_id": "29adcba2-f157-4ccb-8832-7e9b0a340c97",
  "assignment_id": "0a2f67e1-9a59-414b-a0af-5484862c9ec3",
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
    "id": "29adcba2-f157-4ccb-8832-7e9b0a340c97",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T11:22:08.107441Z",
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
    "id": "3b28811e-6a78-4260-9432-ea13b806f07c",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T11:22:06.227646Z",
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

`GET /api/operator/v1/orders/29adcba2-f157-4ccb-8832-7e9b0a340c97/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T11:22:08.107995Z",
      "actor": {
        "type": "CLIENT",
        "id": "9fe4ebfd-2079-4eb3-a84c-2b90bf98dd0d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "29adcba2-f157-4ccb-8832-7e9b0a340c97",
        "quote_id": "c0f1e9fc-ba6b-41e9-875e-fd375d4a9f13",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "8b52831e-e584-4a35-a362-c353b45ade3b"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T11:22:08.109546Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "29adcba2-f157-4ccb-8832-7e9b0a340c97",
        "attempt_id": "edf91b1b-1a78-4ff8-9a04-29849bce6a31",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "8b52831e-e584-4a35-a362-c353b45ade3b"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T11:22:08.114757Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "4d294df2-06a9-410a-8adb-f8c8f397e3cf",
        "order_id": "29adcba2-f157-4ccb-8832-7e9b0a340c97",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "8b52831e-e584-4a35-a362-c353b45ade3b"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T11:22:08.483047Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "4d294df2-06a9-410a-8adb-f8c8f397e3cf",
        "order_id": "29adcba2-f157-4ccb-8832-7e9b0a340c97",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "fa634841-9adc-487d-b537-859078df7343"
      },
      "correlation_id": "52936a30-c1d5-420b-971f-657db5138ede"
```

Done: orders 3b28811e-6a78-4260-9432-ea13b806f07c, 29adcba2-f157-4ccb-8832-7e9b0a340c97.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731164987",
  "device_ref": "sandbox-26958"
}
```

```json
{
  "challenge_id": "d5675341-78a3-49b3-a262-852d43e1d9b8",
  "expires_at": "2026-10-28T11:27:10.327526271Z",
  "resend_available_at": "2026-10-28T11:22:11.327526271Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380731164987` → **200**

```json
{
  "phone": "+380731164987",
  "audience": "CLIENT",
  "code": "888706",
  "sent_at": "2026-10-28T11:22:10.330351701Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d5675341-78a3-49b3-a262-852d43e1d9b8",
  "code": "888706",
  "device_ref": "sandbox-26958"
}
```

```json
{
  "session_id": "ae07b6f0-8f44-460b-97ca-e32c63ce8761",
  "subject": {
    "type": "CLIENT",
    "id": "a1e6d725-1389-4c24-bd76-05495f777216"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMWU2ZDcyNS0xMzg5LTRjMjQtYmQ3Ni0wNTQ5NWY3NzcyMTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg3NDMwLCJpYXQiOjE3OTMxODY1MzAsImp0aSI6ImQ0YWQyNGY0LWZkNTEtNDViMS1iZDRlLWI2MjFiYzAyNzQ2YiIsInNpZCI6ImFlMDdiNmYwLThmNDQtNDYwYi05N2NhLWUzMmM2M2NlODc2MSJ9.F7NeDBOnfInvb2LnhPsMFaCBo5415wH0fpBxh85yHZQ",
  "access_expires_at": "2026-10-28T11:37:10.529888254Z",
  "refresh_token": "A-PKx54w4M9Xw2st751yGJAJLkXU_s3QAKw7nG_Qx_Q",
  "refresh_expires_at": "2026-11-27T11:22:10.529453446Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "02371702-f111-42da-b1ec-cc83cb140ab2",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "cdd7dec2-9848-4f21-a462-3ad843078ddb",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-cdd7dec2-9848-4f21-a462-3ad843078ddb",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "8b3afa7317f0d960470782074f15876f",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=cdd7dec2-9848-4f21-a462-3ad843078ddb",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731164987"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=cdd7dec2-9848-4f21-a462-3ad843078ddb",
  "expires_at": "2026-10-28T11:52:10.715724Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/cdd7dec2-9848-4f21-a462-3ad843078ddb` → **200**

```json
{
  "id": "cdd7dec2-9848-4f21-a462-3ad843078ddb",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T11:52:10.715724Z",
  "card": {
    "id": "d47d811a-e104-4311-a270-6bc328e13c45",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3778",
    "card_type": "Visa",
    "created_at": "2026-10-28T11:22:10.904765Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "d47d811a-e104-4311-a270-6bc328e13c45",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****3778",
      "card_type": "Visa",
      "created_at": "2026-10-28T11:22:10.904765Z"
    }
  ]
}
```

## Andrii is online nearby

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-17189"
}
```

```json
{
  "challenge_id": "8c5fe637-8b7a-40d4-8ea8-1394faf4ae1d",
  "expires_at": "2026-10-28T11:27:11.270591554Z",
  "resend_available_at": "2026-10-28T11:22:12.270591554Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "254870",
  "sent_at": "2026-10-28T11:22:11.272959462Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8c5fe637-8b7a-40d4-8ea8-1394faf4ae1d",
  "code": "254870",
  "device_ref": "sandbox-17189"
}
```

```json
{
  "session_id": "08d8a016-393f-48fe-9130-7474aefe7cf1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NzQzMSwiaWF0IjoxNzkzMTg2NTMxLCJqdGkiOiJkNDg4Yzg3Yy1kYmRjLTQ4Y2YtYmEwYy03YzBkYzdkZTRhOTQiLCJzaWQiOiIwOGQ4YTAxNi0zOTNmLTQ4ZmUtOTEzMC03NDc0YWVmZTdjZjEifQ.pveBOzcH3nZckcSiR9F9zzh5aLDAo_O-zJnhtpBAQCI",
  "access_expires_at": "2026-10-28T11:37:11.478433885Z",
  "refresh_token": "Kyj5GLXRsFJy-kuuzidG1Hq_TWqDvXvkuaLDquneoVM",
  "refresh_expires_at": "2026-11-27T11:22:11.478013458Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0d1bbf74-8b15-4d83-96f6-375902a0824a",
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
  "last_heartbeat_at": "2026-10-28T11:22:07.731285Z",
  "last_location_at": "2026-10-28T11:22:07.731285Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0d1bbf74-8b15-4d83-96f6-375902a0824a/handover` → **200**

```json
{
  "command_id": "c5ec60ab-b46e-4e0d-8f1e-bee00a63169d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0d1bbf74-8b15-4d83-96f6-375902a0824a",
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
  "last_heartbeat_at": "2026-10-28T11:22:07.731285Z",
  "last_location_at": "2026-10-28T11:22:07.731285Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0d1bbf74-8b15-4d83-96f6-375902a0824a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:22:12Z",
    "sequence": 1793186532177
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0d1bbf74-8b15-4d83-96f6-375902a0824a",
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
  "last_heartbeat_at": "2026-10-28T11:22:12.036183Z",
  "last_location_at": "2026-10-28T11:22:12.036183Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6477ed9a-7eaf-4e67-b195-4d084d0bdade",
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
  "id": "a9b23b73-ade2-4526-bb8d-a20d344e1c8b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:27:12.223706Z",
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
  "command_id": "9e7df466-8cc3-48b2-b424-d1ca1c15a378",
  "quote_id": "a9b23b73-ade2-4526-bb8d-a20d344e1c8b",
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
  "id": "27f691c7-db0c-4dc8-8eff-cfea9ee48626",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a1e6d725-1389-4c24-bd76-05495f777216",
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
  "created_at": "2026-10-28T11:22:12.407434Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/27f691c7-db0c-4dc8-8eff-cfea9ee48626` → **200**

```json
{
  "id": "27f691c7-db0c-4dc8-8eff-cfea9ee48626",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a1e6d725-1389-4c24-bd76-05495f777216",
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
  "created_at": "2026-10-28T11:22:12.407434Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/27f691c7-db0c-4dc8-8eff-cfea9ee48626` → **200**

```json
{
  "id": "27f691c7-db0c-4dc8-8eff-cfea9ee48626",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a1e6d725-1389-4c24-bd76-05495f777216",
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
  "created_at": "2026-10-28T11:22:12.407434Z",
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
    "id": "b99ff284-06e8-4fd2-81e5-63b4612bd996",
    "order_id": "27f691c7-db0c-4dc8-8eff-cfea9ee48626",
    "expires_at": "2026-10-28T11:22:27.59849Z",
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

`POST /api/driver/v1/offers/b99ff284-06e8-4fd2-81e5-63b4612bd996/accept` → **200**

```json
{
  "command_id": "8b5fe86f-9c5e-422f-9967-9b290ef1105f"
}
```

```json
{
  "id": "e2999095-008f-46bd-8ad4-eb18ac3891e6",
  "order_id": "27f691c7-db0c-4dc8-8eff-cfea9ee48626",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1ed29e8a-70bb-4ce8-a5a7-8259e2541d46",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1ed29e8a-70bb-4ce8-a5a7-8259e2541d46",
  "order_id": "27f691c7-db0c-4dc8-8eff-cfea9ee48626",
  "assignment_id": "e2999095-008f-46bd-8ad4-eb18ac3891e6",
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

`POST /api/driver/v1/work-sessions/0d1bbf74-8b15-4d83-96f6-375902a0824a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:22:14Z",
    "sequence": 1793186534487
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0d1bbf74-8b15-4d83-96f6-375902a0824a",
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
  "last_heartbeat_at": "2026-10-28T11:22:14.505881Z",
  "last_location_at": "2026-10-28T11:22:14.505881Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1ed29e8a-70bb-4ce8-a5a7-8259e2541d46/arrive` → **200**

```json
{
  "command_id": "71592d87-1f8a-41a8-9353-fad5a7b14602",
  "expected_version": 0
}
```

```json
{
  "id": "1ed29e8a-70bb-4ce8-a5a7-8259e2541d46",
  "order_id": "27f691c7-db0c-4dc8-8eff-cfea9ee48626",
  "assignment_id": "e2999095-008f-46bd-8ad4-eb18ac3891e6",
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
  "arrived_at": "2026-10-28T11:22:14.691289Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1ed29e8a-70bb-4ce8-a5a7-8259e2541d46/start` → **200**

```json
{
  "command_id": "b645f37d-5c8b-4252-8efc-5b1e67be247a",
  "expected_version": 1
}
```

```json
{
  "id": "1ed29e8a-70bb-4ce8-a5a7-8259e2541d46",
  "order_id": "27f691c7-db0c-4dc8-8eff-cfea9ee48626",
  "assignment_id": "e2999095-008f-46bd-8ad4-eb18ac3891e6",
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
  "arrived_at": "2026-10-28T11:22:14.691289Z",
  "started_at": "2026-10-28T11:22:14.87656Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1ed29e8a-70bb-4ce8-a5a7-8259e2541d46/complete` → **200**

```json
{
  "command_id": "8877696a-358d-4584-9de1-66f4e850901c",
  "expected_version": 2,
  "reported_at": "2026-10-28T11:22:15Z"
}
```

```json
{
  "id": "1ed29e8a-70bb-4ce8-a5a7-8259e2541d46",
  "order_id": "27f691c7-db0c-4dc8-8eff-cfea9ee48626",
  "assignment_id": "e2999095-008f-46bd-8ad4-eb18ac3891e6",
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
  "arrived_at": "2026-10-28T11:22:14.691289Z",
  "started_at": "2026-10-28T11:22:14.87656Z",
  "completed_at": "2026-10-28T11:22:15.070913Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/27f691c7-db0c-4dc8-8eff-cfea9ee48626` → **200**

```json
{
  "id": "27f691c7-db0c-4dc8-8eff-cfea9ee48626",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "a1e6d725-1389-4c24-bd76-05495f777216",
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
    "id": "e2999095-008f-46bd-8ad4-eb18ac3891e6",
    "order_id": "27f691c7-db0c-4dc8-8eff-cfea9ee48626",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "1ed29e8a-70bb-4ce8-a5a7-8259e2541d46",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T11:22:12.407434Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/27f691c7-db0c-4dc8-8eff-cfea9ee48626` → **200**

```json
{
  "id": "27f691c7-db0c-4dc8-8eff-cfea9ee48626",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "a1e6d725-1389-4c24-bd76-05495f777216",
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
    "id": "e2999095-008f-46bd-8ad4-eb18ac3891e6",
    "order_id": "27f691c7-db0c-4dc8-8eff-cfea9ee48626",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "1ed29e8a-70bb-4ce8-a5a7-8259e2541d46",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T11:22:12.407434Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/27f691c7-db0c-4dc8-8eff-cfea9ee48626` → **200**

```json
{
  "id": "27f691c7-db0c-4dc8-8eff-cfea9ee48626",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "a1e6d725-1389-4c24-bd76-05495f777216",
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
    "id": "e2999095-008f-46bd-8ad4-eb18ac3891e6",
    "order_id": "27f691c7-db0c-4dc8-8eff-cfea9ee48626",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "1ed29e8a-70bb-4ce8-a5a7-8259e2541d46",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T11:22:12.407434Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/27f691c7-db0c-4dc8-8eff-cfea9ee48626` → **200**

```json
{
  "id": "27f691c7-db0c-4dc8-8eff-cfea9ee48626",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "a1e6d725-1389-4c24-bd76-05495f777216",
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
    "id": "e2999095-008f-46bd-8ad4-eb18ac3891e6",
    "order_id": "27f691c7-db0c-4dc8-8eff-cfea9ee48626",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "1ed29e8a-70bb-4ce8-a5a7-8259e2541d46",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T11:22:12.407434Z",
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
      "id": "b8cbd16f-eaa8-4f96-8e01-e37aa2d50f28",
      "at": "2026-10-28T11:22:15.635319Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "27f691c7-db0c-4dc8-8eff-cfea9ee48626",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/27f691c7-db0c-4dc8-8eff-cfea9ee48626/tip` → **200**

```json
{
  "order_id": "27f691c7-db0c-4dc8-8eff-cfea9ee48626",
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
  "available_until": "2026-10-29T11:22:15.070913Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/27f691c7-db0c-4dc8-8eff-cfea9ee48626/tip` → **201**

```json
{
  "command_id": "46e36263-740f-4eb0-95d9-95bfbccc3f6b",
  "amount_minor": 2500
}
```

```json
{
  "id": "92f7f0df-d392-4711-a633-3c4d172eb04e",
  "order_id": "27f691c7-db0c-4dc8-8eff-cfea9ee48626",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T11:22:19.521485Z"
}
```

`GET /api/rider/v1/orders/27f691c7-db0c-4dc8-8eff-cfea9ee48626/tip` → **200**

```json
{
  "order_id": "27f691c7-db0c-4dc8-8eff-cfea9ee48626",
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
  "available_until": "2026-10-29T11:22:15.070913Z",
  "open": false,
  "tip": {
    "id": "92f7f0df-d392-4711-a633-3c4d172eb04e",
    "order_id": "27f691c7-db0c-4dc8-8eff-cfea9ee48626",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T11:22:19.521485Z"
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
      "id": "b8cbd16f-eaa8-4f96-8e01-e37aa2d50f28",
      "at": "2026-10-28T11:22:15.635319Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "27f691c7-db0c-4dc8-8eff-cfea9ee48626",
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
      "id": "9b049b58-e50c-4389-b033-584dcf097e20",
      "at": "2026-10-28T11:22:20.690476Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "27f691c7-db0c-4dc8-8eff-cfea9ee48626",
      "counterpart_id": null
    },
    {
      "id": "b8cbd16f-eaa8-4f96-8e01-e37aa2d50f28",
      "at": "2026-10-28T11:22:15.635319Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "27f691c7-db0c-4dc8-8eff-cfea9ee48626",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0d1bbf74-8b15-4d83-96f6-375902a0824a",
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
  "last_heartbeat_at": "2026-10-28T11:22:14.505881Z",
  "last_location_at": "2026-10-28T11:22:14.505881Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0d1bbf74-8b15-4d83-96f6-375902a0824a/close` → **200**

```json
{
  "command_id": "50eaab0b-2835-4407-a1cd-6a2dc56ffece",
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

Done: card order 27f691c7-db0c-4dc8-8eff-cfea9ee48626.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732775729",
  "device_ref": "sandbox-4927"
}
```

```json
{
  "challenge_id": "8df97fe0-d1c0-481f-9619-a15775c723f5",
  "expires_at": "2026-10-28T11:27:21.598278576Z",
  "resend_available_at": "2026-10-28T11:22:22.598278576Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732775729` → **200**

```json
{
  "phone": "+380732775729",
  "audience": "CLIENT",
  "code": "706228",
  "sent_at": "2026-10-28T11:22:21.600422721Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8df97fe0-d1c0-481f-9619-a15775c723f5",
  "code": "706228",
  "device_ref": "sandbox-4927"
}
```

```json
{
  "session_id": "7bea80d4-a80a-4f37-a360-de8cd461d740",
  "subject": {
    "type": "CLIENT",
    "id": "5f193bcf-aaf3-46ad-82b8-30bdaaef4c23"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZjE5M2JjZi1hYWYzLTQ2YWQtODJiOC0zMGJkYWFlZjRjMjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg3NDQxLCJpYXQiOjE3OTMxODY1NDEsImp0aSI6IjQ4NmRkNGUzLTVlM2UtNDAwNy05ZWY1LTNmNjJhZmIwNjY0YyIsInNpZCI6IjdiZWE4MGQ0LWE4MGEtNGYzNy1hMzYwLWRlOGNkNDYxZDc0MCJ9.JOFVg9qU4UVTfcXll18Zl0dLAoz4pjkShOvUuhQ8JaE",
  "access_expires_at": "2026-10-28T11:37:21.800173459Z",
  "refresh_token": "k_Osa4QteXES3dsdVw0klOwmETI7f3UbLzBgD5ytjeo",
  "refresh_expires_at": "2026-11-27T11:22:21.799729949Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "275d2324-5f18-4780-b2ec-8bf62399e10e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "44620673-e57c-4e9d-bf6f-07f0c1c838d0",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-44620673-e57c-4e9d-bf6f-07f0c1c838d0",
    "orderDate": "1793186541",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "441c7766ff6fe68c3cc9c274d411b6d5",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=44620673-e57c-4e9d-bf6f-07f0c1c838d0",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732775729"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=44620673-e57c-4e9d-bf6f-07f0c1c838d0",
  "created_at": "2026-10-28T11:22:21.981457Z",
  "expires_at": "2026-10-28T11:52:21.981457Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/44620673-e57c-4e9d-bf6f-07f0c1c838d0` → **200**

```json
{
  "id": "44620673-e57c-4e9d-bf6f-07f0c1c838d0",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T11:22:21.981457Z",
  "expires_at": "2026-10-28T11:52:21.981457Z",
  "completed_at": "2026-10-28T11:22:22.166949Z",
  "masked_pan": "41****7756",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "5f193bcf-aaf3-46ad-82b8-30bdaaef4c23",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "5f193bcf-aaf3-46ad-82b8-30bdaaef4c23",
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
      "id": "48655b0f-f2a1-462d-a607-e863036a30b7",
      "at": "2026-10-28T11:22:22.707128Z",
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
  "client_id": "5f193bcf-aaf3-46ad-82b8-30bdaaef4c23",
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
      "id": "48655b0f-f2a1-462d-a607-e863036a30b7",
      "at": "2026-10-28T11:22:22.707128Z",
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
  "device_ref": "sandbox-32450"
}
```

```json
{
  "challenge_id": "c543c3a1-6919-4145-8cb6-3ea4b913d841",
  "expires_at": "2026-10-28T11:27:23.918363998Z",
  "resend_available_at": "2026-10-28T11:22:24.918363998Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "390045",
  "sent_at": "2026-10-28T11:22:23.921037953Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c543c3a1-6919-4145-8cb6-3ea4b913d841",
  "code": "390045",
  "device_ref": "sandbox-32450"
}
```

```json
{
  "session_id": "12ad19f3-afea-47c4-9aae-4ea9d7c07267",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NzQ0NCwiaWF0IjoxNzkzMTg2NTQ0LCJqdGkiOiI1ZWViZTc3YS1hZGEyLTQxNzMtOGQxOS01YmNlYzNjZDNlMjEiLCJzaWQiOiIxMmFkMTlmMy1hZmVhLTQ3YzQtOWFhZS00ZWE5ZDdjMDcyNjcifQ._KPnmllTo9nL-XluzSSV39Y3rne4uR9CLeCOSUmgbkg",
  "access_expires_at": "2026-10-28T11:37:24.121214485Z",
  "refresh_token": "ogpRm7AjS2tw6K1eZARgeCoLDXE1amAnil6P7NhqXMI",
  "refresh_expires_at": "2026-11-27T11:22:24.120764284Z",
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
  "command_id": "46c4beec-b7fc-44b7-bf05-4dccab1ad81d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "2e5cc5a7-e938-4226-897c-551deadfa195",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-2e5cc5a7-e938-4226-897c-551deadfa195",
    "orderDate": "1793186544",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "694a4cdbbd224f6736808d1d611d3840",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=2e5cc5a7-e938-4226-897c-551deadfa195",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=2e5cc5a7-e938-4226-897c-551deadfa195",
  "created_at": "2026-10-28T11:22:24.472155Z",
  "expires_at": "2026-10-28T11:52:24.472155Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/2e5cc5a7-e938-4226-897c-551deadfa195` → **200**

```json
{
  "id": "2e5cc5a7-e938-4226-897c-551deadfa195",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T11:22:24.472155Z",
  "expires_at": "2026-10-28T11:52:24.472155Z",
  "completed_at": "2026-10-28T11:22:24.651665Z",
  "masked_pan": "41****8671",
  "failure_reason": null
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
      "id": "cc25a6d8-0c02-4260-8fa1-e9ccdbc7129f",
      "at": "2026-10-28T11:22:24.713339Z",
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
  "command_id": "1f3aab13-4f8d-40e9-976b-f9d231a0f91b",
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
  "correlation_id": "f76199da-8fbd-4431-b5c0-21bd4807458b"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: city-operations

## Staff open Warsaw's operations (version 0 until the first change: around the clock, every method)

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
  "session_id": "34841979-f2b6-47ea-b410-0351f0acece3",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc0NDUsImlhdCI6MTc5MzE4NjU0NSwianRpIjoiYmIxYjA3NzUtZDljNy00MTVhLTkxZjQtMzRmYjVlZDIyZDAyIiwic2lkIjoiMzQ4NDE5NzktZjJiNi00N2VhLWI0MTAtMDM1MWYwYWNlY2UzIn0.RJ-aJVh5bGVfueFRnj7AIp_ipu3ABa_evD6io2CM0tM",
  "access_expires_at": "2026-10-28T11:37:25.422101439Z",
  "refresh_token": "K7KJ30TSOgdRWqMamnjk-JOUTnkzGdcWvwyl3avBZMo",
  "refresh_expires_at": "2026-10-28T23:22:25.421668454Z",
  "password_change_required": false
}
```

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
      "timezone": "Europe/Warsaw",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
    },
    {
      "id": "5a000000-0000-4000-8000-000000000001",
      "code": "kyiv",
      "name": "Київ",
      "currency": "UAH",
      "timezone": "Europe/Kyiv",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
    }
  ]
}
```

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 0
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600655322",
  "device_ref": "sandbox-20044"
}
```

```json
{
  "challenge_id": "371dccbe-acce-4c4f-ae95-bca531b6d17f",
  "expires_at": "2026-10-28T11:27:25.959533052Z",
  "resend_available_at": "2026-10-28T11:22:26.959533052Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600655322` → **200**

```json
{
  "phone": "+48600655322",
  "audience": "CLIENT",
  "code": "036322",
  "sent_at": "2026-10-28T11:22:25.961925687Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "371dccbe-acce-4c4f-ae95-bca531b6d17f",
  "code": "036322",
  "device_ref": "sandbox-20044"
}
```

```json
{
  "session_id": "b924a7e8-753e-44e0-a2dc-dba3ca40467e",
  "subject": {
    "type": "CLIENT",
    "id": "d0e655d7-a185-410c-a84b-8401c71d222b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMGU2NTVkNy1hMTg1LTQxMGMtYTg0Yi04NDAxYzcxZDIyMmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg3NDQ2LCJpYXQiOjE3OTMxODY1NDYsImp0aSI6IjA1NDgzMGY3LWRlYzgtNGE2ZC1hZTg3LTI1MzBkMmQ5M2RhYyIsInNpZCI6ImI5MjRhN2U4LTc1M2UtNDRlMC1hMmRjLWRiYTNjYTQwNDY3ZSJ9.oWq5kCe2gMoh5bim3nrac7g77mAUBKwdZWHHmsYDpWM",
  "access_expires_at": "2026-10-28T11:37:26.161758548Z",
  "refresh_token": "-mnNj9dnx0LbyB8FQhe2fx3GGRzsEKupEFpmkVVKCQE",
  "refresh_expires_at": "2026-11-27T11:22:26.161396739Z",
  "account_created": true
}
```

## Staff pause new orders: a reason is required

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 0
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **400**

```json
{
  "command_id": "4628776e-d6f5-4607-bd5d-48f844130a48",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "8718411a-5cbe-4650-a766-1f6298715d81",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 0
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **200**

```json
{
  "command_id": "c07c2fad-9cce-4aa6-a113-de3ec17d5823",
  "expected_version": 0,
  "reason": "Storm warning"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": true,
  "pause_reason": "Storm warning",
  "paused_at": "2026-10-28T11:22:26.878419289Z",
  "version": 1
}
```

## The apps see the pause, and the rider's order is refused

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
      "timezone": "Europe/Warsaw",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": true
    },
    {
      "id": "5a000000-0000-4000-8000-000000000001",
      "code": "kyiv",
      "name": "Київ",
      "currency": "UAH",
      "timezone": "Europe/Kyiv",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
    }
  ]
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5c7c7c76-cdc7-4bfa-b08e-c96213812965",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  }
}
```

```json
{
  "id": "ca71dc79-f02c-4371-9099-4f27fae98176",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:27:27.247424Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 1500,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **422**

```json
{
  "command_id": "324b6ecf-5304-4970-b871-05a7eb29df04",
  "quote_id": "ca71dc79-f02c-4371-9099-4f27fae98176",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "Pałac Kultury",
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  },
  "dropoff_label": "Warszawa Centralna",
  "payment_method": "CASH"
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 422,
  "title": "City paused",
  "type": "https://errors.blizz.taxi/city-paused",
  "code": "CITY_PAUSED",
  "correlation_id": "2be0f530-44b0-4cf6-8d6e-3ae4cf3b57af"
}
```

## Staff lift the pause

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": true,
  "pause_reason": "Storm warning",
  "paused_at": "2026-10-28T11:22:26.878419Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "f0244a67-abd3-41a4-a73b-606dde5a40ca",
  "expected_version": 1,
  "reason": "Storm over"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 2
}
```

## Warsaw offers only cards for now: a cash order is refused

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 2
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "command_id": "3bf371f8-8f1d-4d59-a4eb-90f5fe1675a4",
  "expected_version": 2,
  "working_hours": [],
  "payment_methods": [
    "CARD"
  ],
  "reason": "Cash collection paused"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 3
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "080bfa66-b94c-40d5-933c-02060b6dee5f",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  }
}
```

```json
{
  "id": "d28ffbbc-d55f-4ffc-8b69-9695c4ed2381",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:27:28.383917Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 1500,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **422**

```json
{
  "command_id": "3bf1faba-04f4-4364-9119-c81871036060",
  "quote_id": "d28ffbbc-d55f-4ffc-8b69-9695c4ed2381",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "Pałac Kultury",
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  },
  "dropoff_label": "Warszawa Centralna",
  "payment_method": "CASH"
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 422,
  "title": "Payment method not offered",
  "type": "https://errors.blizz.taxi/payment-method-not-offered",
  "code": "PAYMENT_METHOD_NOT_OFFERED",
  "correlation_id": "78dbe698-7ebb-451c-9570-680a6e246258"
}
```

## Working hours that do not include now: an order for now is refused

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 3
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "command_id": "a8d52aec-3145-49ef-884d-c8d080a24a66",
  "expected_version": 3,
  "working_hours": [
    {
      "days_of_week": [
        1,
        2,
        3,
        4,
        5,
        6,
        7
      ],
      "from": "14:00",
      "to": "15:00"
    }
  ],
  "payment_methods": [
    "CASH",
    "CARD",
    "TERMINAL"
  ],
  "reason": "One hour a day"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [
    {
      "days_of_week": [
        1,
        2,
        3,
        4,
        5,
        6,
        7
      ],
      "from": "14:00",
      "to": "15:00"
    }
  ],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 4
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b6de8ed6-d97f-40ee-860e-2960bf01809d",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  }
}
```

```json
{
  "id": "6076bc70-8a67-4a35-8e66-5c034535c6e7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:27:29.135760Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 1500,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **422**

```json
{
  "command_id": "9b335b1a-ad5e-4fd2-98f4-08cb9d94dd92",
  "quote_id": "6076bc70-8a67-4a35-8e66-5c034535c6e7",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "Pałac Kultury",
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  },
  "dropoff_label": "Warszawa Centralna",
  "payment_method": "CASH"
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 422,
  "title": "City closed",
  "type": "https://errors.blizz.taxi/city-closed",
  "code": "CITY_CLOSED",
  "correlation_id": "49403c52-4530-4045-a1cd-a3d2bdf06004"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "e578c23e-29eb-4a0d-b63d-d10495d2a2fa",
  "expected_version": 0,
  "reason": "stale"
}
```

```json
{
  "instance": "/api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause",
  "status": 409,
  "title": "Version conflict",
  "type": "https://errors.blizz.taxi/version-conflict",
  "code": "VERSION_CONFLICT",
  "correlation_id": "7c0d5c6e-b662-4995-839b-a8052e7c91bc"
}
```

Done: paused and resumed, a method not offered and closed hours refused orders; Warsaw is restored on exit.

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [
    {
      "days_of_week": [
        1,
        2,
        3,
        4,
        5,
        6,
        7
      ],
      "from": "14:00",
      "to": "15:00"
    }
  ],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 4
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "command_id": "1b15be0b-5677-47aa-ab10-941ff38525a9",
  "expected_version": 4,
  "working_hours": [],
  "payment_methods": [
    "CASH",
    "CARD",
    "TERMINAL"
  ],
  "reason": "Sandbox clean-up"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 5
}
```

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670180402",
  "device_ref": "sandbox-11292"
}
```

```json
{
  "challenge_id": "42027847-8807-4afc-aca5-4ae900e6141b",
  "expires_at": "2026-10-28T11:27:30.084450915Z",
  "resend_available_at": "2026-10-28T11:22:31.084450915Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670180402` → **200**

```json
{
  "phone": "+380670180402",
  "audience": "CLIENT",
  "code": "674681",
  "sent_at": "2026-10-28T11:22:30.086402163Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "42027847-8807-4afc-aca5-4ae900e6141b",
  "code": "674681",
  "device_ref": "sandbox-11292"
}
```

```json
{
  "session_id": "5dc3736e-8613-4ed7-88a3-1ef7ec761f94",
  "subject": {
    "type": "CLIENT",
    "id": "d73d04d5-8956-4784-9f5b-9bf4fd4d0099"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNzNkMDRkNS04OTU2LTQ3ODQtOWY1Yi05YmY0ZmQ0ZDAwOTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg3NDUwLCJpYXQiOjE3OTMxODY1NTAsImp0aSI6Ijc2NmVkNTEwLTU3Y2QtNGFmZi04YTg3LTI2NzYyNTBlZWQ4MiIsInNpZCI6IjVkYzM3MzZlLTg2MTMtNGVkNy04OGEzLTFlZjdlYzc2MWY5NCJ9.kUcvSTr8ktzXbFe7nj3H7TStGGWDLHmxKOQDDC38Vks",
  "access_expires_at": "2026-10-28T11:37:30.283552027Z",
  "refresh_token": "agep_m_aoglxmaymvsxvv4oCplS3hDJfxumjlgWQIH8",
  "refresh_expires_at": "2026-11-27T11:22:30.283148786Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d73d04d5-8956-4784-9f5b-9bf4fd4d0099",
  "session_id": "5dc3736e-8613-4ed7-88a3-1ef7ec761f94",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3589e377-26c5-43a4-9615-329341a189ea",
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
  "id": "0b701b7f-654d-4294-9768-d062ddbd2d84",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:27:30.633903Z",
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
  "challenge_id": "76c2c331-9e20-45e5-bd69-0a7e26922d66",
  "expires_at": "2026-10-28T11:27:32.826429551Z",
  "resend_available_at": "2026-10-28T11:22:33.826429551Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670180402` → **200**

```json
{
  "phone": "+380670180402",
  "audience": "CLIENT",
  "code": "651324",
  "sent_at": "2026-10-28T11:22:32.828011849Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "24eeabc5-121f-45e7-adb7-74257ca94a2a",
  "challenge_id": "76c2c331-9e20-45e5-bd69-0a7e26922d66",
  "otp_code": "651324"
}
```

```json
{
  "client_id": "d73d04d5-8956-4784-9f5b-9bf4fd4d0099",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T11:22:33.057994828Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "d6f68c66-fba3-4e8e-9aa4-c5c1351721b2",
  "quote_id": "0b701b7f-654d-4294-9768-d062ddbd2d84",
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
  "correlation_id": "e0ab25c9-dcde-4a37-85ba-a399ba3a8416"
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
  "session_id": "122cb463-4055-4e1c-ace4-248c39673745",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc0NTMsImlhdCI6MTc5MzE4NjU1MywianRpIjoiYWVlZjg2MzYtMjQ2OC00ZDg3LWIzNmEtN2Q4MzQ5NjQzZDVlIiwic2lkIjoiMTIyY2I0NjMtNDA1NS00ZTFjLWFjZTQtMjQ4YzM5NjczNzQ1In0.NECu5iTz0yNDRguyT2FJeF0EpPvD_v-O_D4_lY_VJEk",
  "access_expires_at": "2026-10-28T11:37:33.646373971Z",
  "refresh_token": "jYdM5e-QLBnRaQ4X3gsmBgmxfUgWQG2hpWVleteXOEQ",
  "refresh_expires_at": "2026-10-28T23:22:33.645942779Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "d73d04d5-8956-4784-9f5b-9bf4fd4d0099",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T11:22:33.057995Z",
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

`POST /api/admin/v1/client-deletions/d73d04d5-8956-4784-9f5b-9bf4fd4d0099/complete` → **200**

```json
{
  "command_id": "e2ce9a42-bf4b-420c-a117-33ba51e3e412",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "d73d04d5-8956-4784-9f5b-9bf4fd4d0099",
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
  "correlation_id": "a0055bd7-1aec-4564-ad71-e66a6880fee8"
}
```

Done: client d73d04d5-8956-4784-9f5b-9bf4fd4d0099 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664693565",
  "device_ref": "sandbox-25240"
}
```

```json
{
  "challenge_id": "9c50fb0a-fe80-442c-8668-db16f4bfabff",
  "expires_at": "2026-10-28T11:27:34.383132878Z",
  "resend_available_at": "2026-10-28T11:22:35.383132878Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664693565` → **200**

```json
{
  "phone": "+380664693565",
  "audience": "CLIENT",
  "code": "830677",
  "sent_at": "2026-10-28T11:22:34.385246047Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c50fb0a-fe80-442c-8668-db16f4bfabff",
  "code": "830677",
  "device_ref": "sandbox-25240"
}
```

```json
{
  "session_id": "5951d35b-a31f-42af-9353-ef4ff8549071",
  "subject": {
    "type": "CLIENT",
    "id": "a44f88af-bb50-41e8-bae6-6d67564d1ee5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDRmODhhZi1iYjUwLTQxZTgtYmFlNi02ZDY3NTY0ZDFlZTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg3NDU0LCJpYXQiOjE3OTMxODY1NTQsImp0aSI6ImJlZDdkZjJjLTVhZDItNDU5Yy1iMjQyLWQ4Mjk3NDdkZTNmMCIsInNpZCI6IjU5NTFkMzViLWEzMWYtNDJhZi05MzUzLWVmNGZmODU0OTA3MSJ9.lINlYUGEE7Tw9UmrUV3hcVeqNpmnKemIKVNOKO74Uwc",
  "access_expires_at": "2026-10-28T11:37:34.577931101Z",
  "refresh_token": "ToyT9jmyBp6avcRihCTgU3t1WzCMqH1Dgy_uP7gCLS4",
  "refresh_expires_at": "2026-11-27T11:22:34.577398647Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a44f88af-bb50-41e8-bae6-6d67564d1ee5",
  "session_id": "5951d35b-a31f-42af-9353-ef4ff8549071",
  "account_state": "ACTIVE"
}
```

## Staff find the rider by the last 7 digits of the phone and open the card

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
  "session_id": "c2aae793-3090-468a-a9ac-3e3d502b3628",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc0NTUsImlhdCI6MTc5MzE4NjU1NSwianRpIjoiZmUzNDVhZjYtZWQ2Yi00NTE4LWE2OWYtZjg0YjBmM2YzNTYyIiwic2lkIjoiYzJhYWU3OTMtMzA5MC00NjhhLWE5YWMtM2UzZDUwMmIzNjI4In0.9GLFiFjyxVllGCZQpxZJaXqZfLmLVm7rcWrDaieD8LM",
  "access_expires_at": "2026-10-28T11:37:35.144701335Z",
  "refresh_token": "cwWtx0M4LdQztnADDxVTHPNV3aRIbHkqcZftgHgXbi8",
  "refresh_expires_at": "2026-10-28T23:22:35.144208109Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=4693565&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "a44f88af-bb50-41e8-bae6-6d67564d1ee5",
      "phone": "+380664693565",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T11:22:34.575423Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/a44f88af-bb50-41e8-bae6-6d67564d1ee5` → **200**

```json
{
  "client": {
    "id": "a44f88af-bb50-41e8-bae6-6d67564d1ee5",
    "phone": "+380664693565",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T11:22:34.575423Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [],
  "bonuses": [],
  "debt": [],
  "cases": []
}
```

## A block needs a reason

`POST /api/admin/v1/clients/a44f88af-bb50-41e8-bae6-6d67564d1ee5/block` → **400**

```json
{
  "command_id": "7c799baa-c30b-4c3b-aa8f-f958cfebb3e3",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/a44f88af-bb50-41e8-bae6-6d67564d1ee5/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "18b08dda-6622-4475-a445-94bdb908d861",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/a44f88af-bb50-41e8-bae6-6d67564d1ee5/block` → **200**

```json
{
  "command_id": "5c994e4c-983b-4fae-9ed5-5cec7334467a",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "a44f88af-bb50-41e8-bae6-6d67564d1ee5",
  "phone": "+380664693565",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T11:22:34.575423Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T11:22:35.913039Z",
    "by": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "deletion_requested_at": null
}
```

`GET /api/rider/v1/me` → **401**

```json
{
  "instance": "/api/rider/v1/me",
  "status": 401,
  "title": "Unauthenticated",
  "type": "https://errors.blizz.taxi/unauthenticated",
  "code": "UNAUTHENTICATED",
  "correlation_id": "98daaf85-9196-49ed-9ea2-475c12c3336d"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664693565",
  "device_ref": "sandbox-27253"
}
```

```json
{
  "challenge_id": "a6d29800-c96a-4571-af12-842ca06cf8ba",
  "expires_at": "2026-10-28T11:27:38.284965459Z",
  "resend_available_at": "2026-10-28T11:22:39.284965459Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664693565` → **200**

```json
{
  "phone": "+380664693565",
  "audience": "CLIENT",
  "code": "585503",
  "sent_at": "2026-10-28T11:22:38.287087724Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "a6d29800-c96a-4571-af12-842ca06cf8ba",
  "code": "585503",
  "device_ref": "sandbox-27253"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "918ea410-cc87-42f4-9355-49f591a064d8"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/a44f88af-bb50-41e8-bae6-6d67564d1ee5` → **200**

```json
{
  "client": {
    "id": "a44f88af-bb50-41e8-bae6-6d67564d1ee5",
    "phone": "+380664693565",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T11:22:34.575423Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T11:22:35.913039Z",
      "by": "23eabed1-5103-466a-be3b-89bb210931f7"
    },
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [],
  "bonuses": [],
  "debt": [],
  "cases": []
}
```

`POST /api/admin/v1/clients/a44f88af-bb50-41e8-bae6-6d67564d1ee5/unblock` → **200**

```json
{
  "command_id": "a990fbe4-a6f8-4d37-85bf-0dfb084e7393",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "a44f88af-bb50-41e8-bae6-6d67564d1ee5",
  "phone": "+380664693565",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T11:22:34.575423Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664693565",
  "device_ref": "sandbox-26872"
}
```

```json
{
  "challenge_id": "80677fc7-c70e-4821-9eab-7ae34cfd9abc",
  "expires_at": "2026-10-28T11:27:41.109636247Z",
  "resend_available_at": "2026-10-28T11:22:42.109636247Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664693565` → **200**

```json
{
  "phone": "+380664693565",
  "audience": "CLIENT",
  "code": "909359",
  "sent_at": "2026-10-28T11:22:41.111370552Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "80677fc7-c70e-4821-9eab-7ae34cfd9abc",
  "code": "909359",
  "device_ref": "sandbox-26872"
}
```

```json
{
  "session_id": "c068601e-f889-486d-9705-74b8a80f6650",
  "subject": {
    "type": "CLIENT",
    "id": "a44f88af-bb50-41e8-bae6-6d67564d1ee5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDRmODhhZi1iYjUwLTQxZTgtYmFlNi02ZDY3NTY0ZDFlZTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg3NDYxLCJpYXQiOjE3OTMxODY1NjEsImp0aSI6IjI4MDY0NzRkLTc0ZDItNGYzNC05NzA4LWUwYWE4OGRmNjUxOSIsInNpZCI6ImMwNjg2MDFlLWY4ODktNDg2ZC05NzA1LTc0YjhhODBmNjY1MCJ9.Cz62jePgQJ2ZUxdbpSP2h9kwqwp9022CRtpqflWa5oc",
  "access_expires_at": "2026-10-28T11:37:41.307801941Z",
  "refresh_token": "1Kt2t3hDsC4SPD2LeK6vLHjdlvhIVTNEoaC-AnIHBQQ",
  "refresh_expires_at": "2026-11-27T11:22:41.307276899Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a44f88af-bb50-41e8-bae6-6d67564d1ee5",
  "session_id": "c068601e-f889-486d-9705-74b8a80f6650",
  "account_state": "ACTIVE"
}
```

Done: found, blocked (signed out, sign-in refused) and unblocked.

# Scenario: correlation-search

## A rider orders; the app sends its own correlation id with the request

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668897922",
  "device_ref": "sandbox-7702"
}
```

```json
{
  "challenge_id": "2309579e-d69a-4ee1-9027-4f29a840bacd",
  "expires_at": "2026-10-28T11:27:41.668082959Z",
  "resend_available_at": "2026-10-28T11:22:42.668082959Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668897922` → **200**

```json
{
  "phone": "+380668897922",
  "audience": "CLIENT",
  "code": "727553",
  "sent_at": "2026-10-28T11:22:41.66987531Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2309579e-d69a-4ee1-9027-4f29a840bacd",
  "code": "727553",
  "device_ref": "sandbox-7702"
}
```

```json
{
  "session_id": "dfbf1474-6a68-4bb4-9f22-970ea367313e",
  "subject": {
    "type": "CLIENT",
    "id": "47587a85-2889-4243-a0a2-feae91168381"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NzU4N2E4NS0yODg5LTQyNDMtYTBhMi1mZWFlOTExNjgzODEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg3NDYxLCJpYXQiOjE3OTMxODY1NjEsImp0aSI6Ijk0NjNlMjdjLWYzYzYtNGYxYi05NjIyLWY3Nzc4MDcyN2E4MSIsInNpZCI6ImRmYmYxNDc0LTZhNjgtNGJiNC05ZjIyLTk3MGVhMzY3MzEzZSJ9.qsyGpa5xZAWFvy3118sLvUafV9rTMBVXcexiVYkE3Rk",
  "access_expires_at": "2026-10-28T11:37:41.870865492Z",
  "refresh_token": "6yLatngjis3YvXZIiT9t02LKzGKQnssyk_XeTpFPr8I",
  "refresh_expires_at": "2026-11-27T11:22:41.870350645Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c7f505c1-a6bc-4580-a2e4-ca9b006c6bd3",
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
  "id": "46715f40-29f1-4a5e-9adb-3374d59b5f3f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:27:42.050121Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 2ea110a0-9543-49e9-ad03-479931e11e77) → **201**

## The operator sees the id on the order's history

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
  "session_id": "1fb607c5-7cca-4ae1-81bd-543725fb80f7",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc0NjIsImlhdCI6MTc5MzE4NjU2MiwianRpIjoiNDNlNmJlMTktZjM0OS00NjE1LTk0YmMtMDZiZWNmY2RjZGFkIiwic2lkIjoiMWZiNjA3YzUtN2NjYS00YWUxLTgxYmQtNTQzNzI1ZmI4MGY3In0.bm9qL9Q1WH-qqQ28eQH_JaMTwlRRseoYWbgOc6mIYys",
  "access_expires_at": "2026-10-28T11:37:42.477799328Z",
  "refresh_token": "GlM9kIP-Ms_q4t06IeTigwmP0S4CyVAYyyV3W2fGj4c",
  "refresh_expires_at": "2026-10-28T23:22:42.47743812Z",
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
  "session_id": "1e7d5445-285a-4981-b927-781a398c3d7b",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc0NjIsImlhdCI6MTc5MzE4NjU2MiwianRpIjoiOTEyZDIwMWItZjYyZS00YTQxLWIzMTMtZjAxNWQzZGJmNDE0Iiwic2lkIjoiMWU3ZDU0NDUtMjg1YS00OTgxLWI5MjctNzgxYTM5OGMzZDdiIn0.zzyDQ4ircof0O1TupZ2KyHYsUf855WLw_PCbwiGccVs",
  "access_expires_at": "2026-10-28T11:37:42.865119601Z",
  "refresh_token": "ooE419uoackDqWB8mn6lQQCAR0TQp-4zjlNdVfwTj8w",
  "refresh_expires_at": "2026-10-28T23:22:42.864608461Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/38628afb-63dd-4b69-919b-7d4906a3a957/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T11:22:42.238609Z",
      "actor": {
        "type": "CLIENT",
        "id": "47587a85-2889-4243-a0a2-feae91168381",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "38628afb-63dd-4b69-919b-7d4906a3a957",
        "quote_id": "46715f40-29f1-4a5e-9adb-3374d59b5f3f",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "2ea110a0-9543-49e9-ad03-479931e11e77"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T11:22:42.239976Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "38628afb-63dd-4b69-919b-7d4906a3a957",
        "attempt_id": "f10cf855-d650-4c40-af68-52b9b2a84076",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "2ea110a0-9543-49e9-ad03-479931e11e77"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T11:22:42.246845Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "38628afb-63dd-4b69-919b-7d4906a3a957",
        "attempt_id": "f10cf855-d650-4c40-af68-52b9b2a84076"
      },
      "correlation_id": "2ea110a0-9543-49e9-ad03-479931e11e77"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "f10cf855-d650-4c40-af68-52b9b2a84076",
        "generation": 1,
        "started_at": "2026-10-28T11:22:42.239056Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T11:22:42.246845Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T11:22:42.240709Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/2ea110a0-9543-49e9-ad03-479931e11e77` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "38628afb-63dd-4b69-919b-7d4906a3a957:0",
      "order_id": "38628afb-63dd-4b69-919b-7d4906a3a957",
      "at": "2026-10-28T11:22:42.238609Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "38628afb-63dd-4b69-919b-7d4906a3a957:1",
      "order_id": "38628afb-63dd-4b69-919b-7d4906a3a957",
      "at": "2026-10-28T11:22:42.239976Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "38628afb-63dd-4b69-919b-7d4906a3a957:2",
      "order_id": "38628afb-63dd-4b69-919b-7d4906a3a957",
      "at": "2026-10-28T11:22:42.246845Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/106ee4b0-f604-425e-99f6-0e59829fdd1c` → **200**

```json
{
  "found": []
}
```

Done: request 2ea110a0-9543-49e9-ad03-479931e11e77 — order 38628afb-63dd-4b69-919b-7d4906a3a957 found by its id.

`GET /api/rider/v1/orders/38628afb-63dd-4b69-919b-7d4906a3a957` → **200**

```json
{
  "id": "38628afb-63dd-4b69-919b-7d4906a3a957",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "47587a85-2889-4243-a0a2-feae91168381",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T11:22:42.238162Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/38628afb-63dd-4b69-919b-7d4906a3a957/cancel` → **200**

```json
{
  "command_id": "eacd451d-610f-43a8-8b22-c474915e2ca0",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "38628afb-63dd-4b69-919b-7d4906a3a957",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "47587a85-2889-4243-a0a2-feae91168381",
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
  "created_at": "2026-10-28T11:22:42.238162Z",
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

# Scenario: data-export

## A rider signs in and asks for a code to confirm the copy

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632174332",
  "device_ref": "sandbox-24433"
}
```

```json
{
  "challenge_id": "67d3cf00-d927-4faf-89e2-0c9f56756152",
  "expires_at": "2026-10-28T11:27:44.014551178Z",
  "resend_available_at": "2026-10-28T11:22:45.014551178Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632174332` → **200**

```json
{
  "phone": "+380632174332",
  "audience": "CLIENT",
  "code": "442981",
  "sent_at": "2026-10-28T11:22:44.016304547Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "67d3cf00-d927-4faf-89e2-0c9f56756152",
  "code": "442981",
  "device_ref": "sandbox-24433"
}
```

```json
{
  "session_id": "da7d34ba-af3e-4599-9444-2f5b76c05096",
  "subject": {
    "type": "CLIENT",
    "id": "c08c65b1-b583-458a-9ad7-7b22733dce04"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMDhjNjViMS1iNTgzLTQ1OGEtOWFkNy03YjIyNzMzZGNlMDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg3NDY0LCJpYXQiOjE3OTMxODY1NjQsImp0aSI6IjAxMjcxMTMxLTNlN2UtNGQxMS1hZjE1LTUzYTlmNWQ2ZWU5NiIsInNpZCI6ImRhN2QzNGJhLWFmM2UtNDU5OS05NDQ0LTJmNWI3NmMwNTA5NiJ9.AyT0Pq88ANhcBGpdTN4RecpdpSQdIZG_im8r7H4-Y9Y",
  "access_expires_at": "2026-10-28T11:37:44.21503Z",
  "refresh_token": "3eYuFDQ7MKzbHdIg2l9k1mMo8jbkzYg4YFXessB8IhU",
  "refresh_expires_at": "2026-11-27T11:22:44.214608943Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "4ff5260a-1ec7-404d-b80a-eb84c146f554",
  "expires_at": "2026-10-28T11:27:46.393507025Z",
  "resend_available_at": "2026-10-28T11:22:47.393507025Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632174332` → **200**

```json
{
  "phone": "+380632174332",
  "audience": "CLIENT",
  "code": "405881",
  "sent_at": "2026-10-28T11:22:46.394937326Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "d3ccfcc3-9535-4adb-8335-5cd225739ed2",
  "challenge_id": "4ff5260a-1ec7-404d-b80a-eb84c146f554",
  "otp_code": "405881"
}
```

```json
{
  "id": "d0dae0af-55b5-4941-8f92-34285a72ca73",
  "state": "PENDING",
  "created_at": "2026-10-28T11:22:46.603456Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/d0dae0af-55b5-4941-8f92-34285a72ca73` → **200**

```json
{
  "id": "d0dae0af-55b5-4941-8f92-34285a72ca73",
  "state": "PENDING",
  "created_at": "2026-10-28T11:22:46.603456Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d0dae0af-55b5-4941-8f92-34285a72ca73` → **200**

```json
{
  "id": "d0dae0af-55b5-4941-8f92-34285a72ca73",
  "state": "PENDING",
  "created_at": "2026-10-28T11:22:46.603456Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d0dae0af-55b5-4941-8f92-34285a72ca73` → **200**

```json
{
  "id": "d0dae0af-55b5-4941-8f92-34285a72ca73",
  "state": "PENDING",
  "created_at": "2026-10-28T11:22:46.603456Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d0dae0af-55b5-4941-8f92-34285a72ca73` → **200**

```json
{
  "id": "d0dae0af-55b5-4941-8f92-34285a72ca73",
  "state": "PENDING",
  "created_at": "2026-10-28T11:22:46.603456Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d0dae0af-55b5-4941-8f92-34285a72ca73` → **200**

```json
{
  "id": "d0dae0af-55b5-4941-8f92-34285a72ca73",
  "state": "READY",
  "created_at": "2026-10-28T11:22:46.603456Z",
  "ready_at": "2026-10-28T11:22:51.319794Z",
  "expires_at": "2026-11-04T11:22:51.319794Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/d0dae0af-55b5-4941-8f92-34285a72ca73/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634741824",
  "device_ref": "sandbox-22194"
}
```

```json
{
  "challenge_id": "1f05a39c-65f1-4450-b4f8-bee2f53c9748",
  "expires_at": "2026-10-28T11:27:51.694429359Z",
  "resend_available_at": "2026-10-28T11:22:52.694429359Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634741824` → **200**

```json
{
  "phone": "+380634741824",
  "audience": "CLIENT",
  "code": "313467",
  "sent_at": "2026-10-28T11:22:51.696307653Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1f05a39c-65f1-4450-b4f8-bee2f53c9748",
  "code": "313467",
  "device_ref": "sandbox-22194"
}
```

```json
{
  "session_id": "912082c6-ba70-4a04-bbac-0575f4a68d02",
  "subject": {
    "type": "CLIENT",
    "id": "6141c947-4da8-4935-8cff-6abc6c0e3ebc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTQxYzk0Ny00ZGE4LTQ5MzUtOGNmZi02YWJjNmMwZTNlYmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg3NDcxLCJpYXQiOjE3OTMxODY1NzEsImp0aSI6ImM5ODZhMmU0LTZiYTItNDVjMi1iOWQxLTE1NWFhZTQ0MDQ3MyIsInNpZCI6IjkxMjA4MmM2LWJhNzAtNGEwNC1iYmFjLTA1NzVmNGE2OGQwMiJ9.HpRFTU5oaxdeywK6cuHle85OuE1mK-_bemRC6jelLQI",
  "access_expires_at": "2026-10-28T11:37:51.902557872Z",
  "refresh_token": "FQqxPj_zyjkCrleb3a490AUKZGj70cmrqI5vyZlsGlo",
  "refresh_expires_at": "2026-11-27T11:22:51.902160468Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/d0dae0af-55b5-4941-8f92-34285a72ca73/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/d0dae0af-55b5-4941-8f92-34285a72ca73/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f1759b98-613e-4ec6-ae81-10b65e218f82"
}
```

## Support sees that it was asked for, not what is in it

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
  "session_id": "4aa43751-de58-4ced-a572-60308b6cc9c4",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc0NzIsImlhdCI6MTc5MzE4NjU3MiwianRpIjoiZGNjYTZiM2UtY2QyYS00YmZmLWE3YTUtY2UzOTA3YTY0OTNhIiwic2lkIjoiNGFhNDM3NTEtZGU1OC00Y2VkLWE1NzItNjAzMDhiNmNjOWM0In0.H3IX0UEE6aYzed3UPBYeXI8YC6b0kZZ0z-qvKkwK1vQ",
  "access_expires_at": "2026-10-28T11:37:52.471183871Z",
  "refresh_token": "k15FP8PTaKGfcNwHQOJe1mtbVT1efKu6oA1BH1CL78c",
  "refresh_expires_at": "2026-10-28T23:22:52.470768191Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c08c65b1-b583-458a-9ad7-7b22733dce04",
  "session_id": "da7d34ba-af3e-4599-9444-2f5b76c05096",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/c08c65b1-b583-458a-9ad7-7b22733dce04/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "d0dae0af-55b5-4941-8f92-34285a72ca73",
      "state": "READY",
      "created_at": "2026-10-28T11:22:46.603456Z",
      "ready_at": "2026-10-28T11:22:51.319794Z",
      "expires_at": "2026-11-04T11:22:51.319794Z",
      "size_bytes": 1031
    }
  ]
}
```

Done: the copy was asked for with a code, built in the background and downloaded by the rider only.

# Scenario: dispatch-journal

## Only the two drivers of this scenario are online

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-1707"
}
```

```json
{
  "challenge_id": "81c06c3d-91d5-4468-8001-02501316addf",
  "expires_at": "2026-10-28T11:27:53.009365909Z",
  "resend_available_at": "2026-10-28T11:22:54.009365909Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "225105",
  "sent_at": "2026-10-28T11:22:53.01134263Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "81c06c3d-91d5-4468-8001-02501316addf",
  "code": "225105",
  "device_ref": "sandbox-1707"
}
```

```json
{
  "session_id": "820b3ff5-2464-4e93-852b-fe0378c852b2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NzQ3MywiaWF0IjoxNzkzMTg2NTczLCJqdGkiOiIzMTYyODk0MS1kNGVlLTQ5MmEtOTFmMS05N2E1YjhiZWQwOGQiLCJzaWQiOiI4MjBiM2ZmNS0yNDY0LTRlOTMtODUyYi1mZTAzNzhjODUyYjIifQ.vVuXOz4TWutQNxbXHfj-J3tGBqzjWTdmwz3dVUEnXYw",
  "access_expires_at": "2026-10-28T11:37:53.21624783Z",
  "refresh_token": "vGRynw28SMqWtUz55nblx4KX0_iukCYbyYL02hrtVi4",
  "refresh_expires_at": "2026-11-27T11:22:53.21587268Z",
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

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-5705"
}
```

```json
{
  "challenge_id": "982dbda6-039c-4fc5-acb8-385836fb921e",
  "expires_at": "2026-10-28T11:27:53.575419008Z",
  "resend_available_at": "2026-10-28T11:22:54.575419008Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "783774",
  "sent_at": "2026-10-28T11:22:53.577195049Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "982dbda6-039c-4fc5-acb8-385836fb921e",
  "code": "783774",
  "device_ref": "sandbox-5705"
}
```

```json
{
  "session_id": "d1442ede-359d-4d19-ba56-f0dc48e72de8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NzQ3MywiaWF0IjoxNzkzMTg2NTczLCJqdGkiOiI5OGZiMGIzOC0wMDE1LTRhZmYtYmIwMi00YTA4ZTQ2NmRmMGMiLCJzaWQiOiJkMTQ0MmVkZS0zNTlkLTRkMTktYmE1Ni1mMGRjNDhlNzJkZTgifQ.CRrCI8R6oMU7qGaTCC7rlH36ifhUxePpmvcYMG2xczQ",
  "access_expires_at": "2026-10-28T11:37:53.778304042Z",
  "refresh_token": "aO1MGm9fG0d3IoVOzBv1CnrGWl7jUY7sgZf5PO4fKYk",
  "refresh_expires_at": "2026-11-27T11:22:53.777938566Z",
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
  "command_id": "d4fcecf1-8dc0-4419-9a8e-4221bc568c5d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:22:54Z",
    "sequence": 1793186574134
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cb3c5d1e-7068-49ae-afd7-6661059a1a09",
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
  "last_heartbeat_at": "2026-10-28T11:22:54.151897Z",
  "last_location_at": "2026-10-28T11:22:54.151897Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-8201"
}
```

```json
{
  "challenge_id": "f591f842-4673-4f8d-a5ba-254eecc929f1",
  "expires_at": "2026-10-28T11:27:54.338312465Z",
  "resend_available_at": "2026-10-28T11:22:55.338312465Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "214351",
  "sent_at": "2026-10-28T11:22:54.340122287Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f591f842-4673-4f8d-a5ba-254eecc929f1",
  "code": "214351",
  "device_ref": "sandbox-8201"
}
```

```json
{
  "session_id": "fac79310-d564-42ec-894b-c7d1ba54f1f7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NzQ3NCwiaWF0IjoxNzkzMTg2NTc0LCJqdGkiOiIxNWY2ZTYzMi0zOGY1LTQ2NzItYWFiZi0zNTBlZGUzZjAwNDciLCJzaWQiOiJmYWM3OTMxMC1kNTY0LTQyZWMtODk0Yi1jN2QxYmE1NGYxZjcifQ.LcPP4-CFc5rR4I29Hx6tBSd0wY3nf7gPcHdsrFW-ihs",
  "access_expires_at": "2026-10-28T11:37:54.544460641Z",
  "refresh_token": "F_R6RLRoq1DFl2gBEzHGdj6yqnqhsjv0JOG2bHSyRrk",
  "refresh_expires_at": "2026-11-27T11:22:54.544080774Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "516ab83d-1194-4877-a716-7a2e093d817a",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T11:22:06.992061Z",
  "last_location_at": "2026-10-28T11:22:06.992061Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/516ab83d-1194-4877-a716-7a2e093d817a/handover` → **200**

```json
{
  "command_id": "8dfdd528-5598-4c7f-ac0e-d2c614ed8c1b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "516ab83d-1194-4877-a716-7a2e093d817a",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T11:22:06.992061Z",
  "last_location_at": "2026-10-28T11:22:06.992061Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/516ab83d-1194-4877-a716-7a2e093d817a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:22:55Z",
    "sequence": 1793186575985
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "516ab83d-1194-4877-a716-7a2e093d817a",
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
  "last_heartbeat_at": "2026-10-28T11:22:55.115488Z",
  "last_location_at": "2026-10-28T11:22:55.115488Z",
  "eligible": true,
  "ineligible_reasons": []
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
  "session_id": "4732e271-82ee-44e3-8906-934e49648b2a",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc0NzUsImlhdCI6MTc5MzE4NjU3NSwianRpIjoiZDA1MTg2NWUtZDFmMi00MTlmLWI3ZDUtYzY1ZGVjODliZThhIiwic2lkIjoiNDczMmUyNzEtODJlZS00NGUzLTg5MDYtOTM0ZTQ5NjQ4YjJhIn0.GpBnUVgEwfEXWnL2muUnC6o7NY0eroil0pQ9ei22w-o",
  "access_expires_at": "2026-10-28T11:37:55.507881957Z",
  "refresh_token": "j5WPqmdku1DKTWPaLInh9h-7K9XPKcOWdkG6zIYg9Mo",
  "refresh_expires_at": "2026-10-28T23:22:55.507411666Z",
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
  "session_id": "5554da95-421e-439f-9d39-addb9ee6f0a8",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc0NzUsImlhdCI6MTc5MzE4NjU3NSwianRpIjoiOWI0Nzg4MGMtYjEyOS00YmFhLThmYmItMzg4MTBiZDJmZDI2Iiwic2lkIjoiNTU1NGRhOTUtNDIxZS00MzlmLTlkMzktYWRkYjllZTZmMGE4In0.Cqj-5tjdzsIxK_OV0xtCSKIIIS6jk42WJl2AW3IYUbU",
  "access_expires_at": "2026-10-28T11:37:55.90017725Z",
  "refresh_token": "QT5eLN4xHD550fzlhaaAk4Tr-JwrMdg6wm3FiVBBRqc",
  "refresh_expires_at": "2026-10-28T23:22:55.899769542Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380687141895",
  "device_ref": "sandbox-7701"
}
```

```json
{
  "challenge_id": "3bf49966-d609-48a4-bf4b-6c828d97e5d5",
  "expires_at": "2026-10-28T11:27:56.083509402Z",
  "resend_available_at": "2026-10-28T11:22:57.083509402Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380687141895` → **200**

```json
{
  "phone": "+380687141895",
  "audience": "CLIENT",
  "code": "488154",
  "sent_at": "2026-10-28T11:22:56.085330616Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3bf49966-d609-48a4-bf4b-6c828d97e5d5",
  "code": "488154",
  "device_ref": "sandbox-7701"
}
```

```json
{
  "session_id": "8983bd94-e510-4ab4-b3f5-e5797ecd84c6",
  "subject": {
    "type": "CLIENT",
    "id": "0db85bec-b1f7-4f82-aee3-666975bfcaec"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGI4NWJlYy1iMWY3LTRmODItYWVlMy02NjY5NzViZmNhZWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg3NDc2LCJpYXQiOjE3OTMxODY1NzYsImp0aSI6IjViMDNlYTc0LWY2NzctNDdmYS1iYjlkLTE0NTY2Y2MwMmE3ZiIsInNpZCI6Ijg5ODNiZDk0LWU1MTAtNGFiNC1iM2Y1LWU1Nzk3ZWNkODRjNiJ9.YXR1JHcZzMgCiCgjOBp8UjiJ9JWYLpNY_WWDRDjASJM",
  "access_expires_at": "2026-10-28T11:37:56.282359542Z",
  "refresh_token": "xoKbxRyeXS3HhWE6DYYJumHNTFU72NS3zjnYjA46xTQ",
  "refresh_expires_at": "2026-11-27T11:22:56.281952034Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ca8bc359-5d63-42a4-8e2c-c26ef19ac2a8",
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
  "id": "a4ac14ae-789f-46a9-8a1a-cb5f14e9d23d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:27:56.467075Z",
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
  "command_id": "6da41a34-b37a-4ab1-86b3-10a859e8eb70",
  "quote_id": "a4ac14ae-789f-46a9-8a1a-cb5f14e9d23d",
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
  "id": "aa7fd3da-efce-417c-9d7e-89b91cfa1a9d",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0db85bec-b1f7-4f82-aee3-666975bfcaec",
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
  "created_at": "2026-10-28T11:22:56.657431Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The nearest driver declines, the next one accepts

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "c9a45d10-0334-445f-b4b9-3db8839ce251",
    "order_id": "aa7fd3da-efce-417c-9d7e-89b91cfa1a9d",
    "expires_at": "2026-10-28T11:23:11.659675Z",
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
    "distance_m": 200
  }
]
```

`POST /api/driver/v1/offers/c9a45d10-0334-445f-b4b9-3db8839ce251/reject` → **204**

```json
{
  "command_id": "562f0642-a6a0-43a5-953d-21c2323e4b93"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "237832f3-f0ab-43f4-a2ce-7410fda70f08",
    "order_id": "aa7fd3da-efce-417c-9d7e-89b91cfa1a9d",
    "expires_at": "2026-10-28T11:23:12.036358Z",
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
    "distance_m": 601
  }
]
```

`POST /api/driver/v1/offers/237832f3-f0ab-43f4-a2ce-7410fda70f08/accept` → **200**

```json
{
  "command_id": "8bf84fcb-f3d7-42e1-915a-e3bbb5a075d2"
}
```

```json
{
  "id": "319264e7-74fe-486f-9185-e6e814130b91",
  "order_id": "aa7fd3da-efce-417c-9d7e-89b91cfa1a9d",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "59f0bd87-4026-4a9a-b6b3-b3030c003106",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/aa7fd3da-efce-417c-9d7e-89b91cfa1a9d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T11:22:56.657843Z",
      "actor": {
        "type": "CLIENT",
        "id": "0db85bec-b1f7-4f82-aee3-666975bfcaec",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "aa7fd3da-efce-417c-9d7e-89b91cfa1a9d",
        "quote_id": "a4ac14ae-789f-46a9-8a1a-cb5f14e9d23d",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "5f3a77c1-4269-4338-ad59-c562d6d938a7"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T11:22:56.65913Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "aa7fd3da-efce-417c-9d7e-89b91cfa1a9d",
        "attempt_id": "c85a11e8-12dc-43b5-a0be-b7f4a9fa51d8",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "5f3a77c1-4269-4338-ad59-c562d6d938a7"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T11:22:56.663849Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c9a45d10-0334-445f-b4b9-3db8839ce251",
        "order_id": "aa7fd3da-efce-417c-9d7e-89b91cfa1a9d",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "5f3a77c1-4269-4338-ad59-c562d6d938a7"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T11:22:57.03545Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c9a45d10-0334-445f-b4b9-3db8839ce251",
        "order_id": "aa7fd3da-efce-417c-9d7e-89b91cfa1a9d"
      },
      "correlation_id": "1b911ec5-771f-45cd-bff1-6f01276f0165"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order aa7fd3da-efce-417c-9d7e-89b91cfa1a9d — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/aa7fd3da-efce-417c-9d7e-89b91cfa1a9d` → **200**

```json
{
  "id": "aa7fd3da-efce-417c-9d7e-89b91cfa1a9d",
  "short_number": 6,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "0db85bec-b1f7-4f82-aee3-666975bfcaec",
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
    "id": "319264e7-74fe-486f-9185-e6e814130b91",
    "order_id": "aa7fd3da-efce-417c-9d7e-89b91cfa1a9d",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "59f0bd87-4026-4a9a-b6b3-b3030c003106",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T11:22:56.657431Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/aa7fd3da-efce-417c-9d7e-89b91cfa1a9d/cancel` → **200**

```json
{
  "command_id": "8fa71cfd-1aaa-4ab6-986a-d18bd418c210",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "aa7fd3da-efce-417c-9d7e-89b91cfa1a9d",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "0db85bec-b1f7-4f82-aee3-666975bfcaec",
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
    "id": "319264e7-74fe-486f-9185-e6e814130b91",
    "order_id": "aa7fd3da-efce-417c-9d7e-89b91cfa1a9d",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "59f0bd87-4026-4a9a-b6b3-b3030c003106",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T11:22:56.657431Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cb3c5d1e-7068-49ae-afd7-6661059a1a09",
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
  "last_heartbeat_at": "2026-10-28T11:22:54.151897Z",
  "last_location_at": "2026-10-28T11:22:54.151897Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cb3c5d1e-7068-49ae-afd7-6661059a1a09/close` → **200**

```json
{
  "command_id": "bc33bc7d-7583-41b1-ace6-3d9b0164a890",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "516ab83d-1194-4877-a716-7a2e093d817a",
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
  "last_heartbeat_at": "2026-10-28T11:22:55.115488Z",
  "last_location_at": "2026-10-28T11:22:55.115488Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/516ab83d-1194-4877-a716-7a2e093d817a/close` → **200**

```json
{
  "command_id": "5d679598-7d3b-4e6e-97b2-46352abb9848",
  "expected_version": 1
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
      "timezone": "Europe/Warsaw",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
    },
    {
      "id": "5a000000-0000-4000-8000-000000000001",
      "code": "kyiv",
      "name": "Київ",
      "currency": "UAH",
      "timezone": "Europe/Kyiv",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
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
  "device_ref": "sandbox-5747"
}
```

```json
{
  "challenge_id": "7c5d7a6e-e664-4d5b-8cbd-25bdfcd0483b",
  "expires_at": "2026-10-28T11:27:58.943728532Z",
  "resend_available_at": "2026-10-28T11:22:59.943728532Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "867181",
  "sent_at": "2026-10-28T11:22:58.94571457Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7c5d7a6e-e664-4d5b-8cbd-25bdfcd0483b",
  "code": "867181",
  "device_ref": "sandbox-5747"
}
```

```json
{
  "session_id": "6d130e44-ebdb-4f15-929d-27ad8e737084",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NzQ3OSwiaWF0IjoxNzkzMTg2NTc5LCJqdGkiOiI1MTk4MDdlMy0xYWE0LTRjNGYtYWQyNS1hMzViZmY4NjZmOWMiLCJzaWQiOiI2ZDEzMGU0NC1lYmRiLTRmMTUtOTI5ZC0yN2FkOGU3MzcwODQifQ.p6SvLX9ZRjEbKDeKfQaUwZwdv0_O1QcIFDWWeD7q6GU",
  "access_expires_at": "2026-10-28T11:37:59.147232406Z",
  "refresh_token": "Ools1aJ67TS5NBLge0BUAr70GsF839jRVF8HeqHXQck",
  "refresh_expires_at": "2026-11-27T11:22:59.14681177Z",
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
  "command_id": "1b45bd10-ef0f-452e-98e3-2274a0165623",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:22:59Z",
    "sequence": 1793186579507
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1120070b-198b-4d5f-8654-b8a2da53517c",
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
  "last_heartbeat_at": "2026-10-28T11:22:59.523637Z",
  "last_location_at": "2026-10-28T11:22:59.523637Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672221469",
  "device_ref": "sandbox-1758"
}
```

```json
{
  "challenge_id": "d4ec66c6-540d-43fe-b002-a547a9c342a2",
  "expires_at": "2026-10-28T11:27:59.703418381Z",
  "resend_available_at": "2026-10-28T11:23:00.703418381Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672221469` → **200**

```json
{
  "phone": "+380672221469",
  "audience": "CLIENT",
  "code": "194280",
  "sent_at": "2026-10-28T11:22:59.705265732Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d4ec66c6-540d-43fe-b002-a547a9c342a2",
  "code": "194280",
  "device_ref": "sandbox-1758"
}
```

```json
{
  "session_id": "55257f12-88f1-42f2-a31c-cc1c3ac80815",
  "subject": {
    "type": "CLIENT",
    "id": "c7406522-5a85-4a04-8ef9-72aaf3585ad7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNzQwNjUyMi01YTg1LTRhMDQtOGVmOS03MmFhZjM1ODVhZDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg3NDc5LCJpYXQiOjE3OTMxODY1NzksImp0aSI6IjIxNWQ0NDg2LWI2YmEtNDUyOS04YWEzLTExYTNkNDg5MTUzMCIsInNpZCI6IjU1MjU3ZjEyLTg4ZjEtNDJmMi1hMzFjLWNjMWMzYWM4MDgxNSJ9.o7PTBicJxaGl4JUSq1HKlN3IRcarMlYDAslrNOsNhhc",
  "access_expires_at": "2026-10-28T11:37:59.900257378Z",
  "refresh_token": "dWIjhWF7dO4p9lwak36-yEs2fT4vuNYMCJoYItS7a6s",
  "refresh_expires_at": "2026-11-27T11:22:59.899888098Z",
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
  "command_id": "36aaddfd-d05b-4404-9411-8c6ca88e9dee",
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
  "id": "433c5d95-a550-4c86-a56a-b2ea6424cdf9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:28:00.263842Z",
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
  "command_id": "5239187c-b2f3-4d65-84b4-d804478ad3d3",
  "platform": "ANDROID",
  "token": "sandbox-driver-01ae7c10-1c3e-42bb-a502-fa5a6cecfbf5"
}
```

```json
{
  "id": "29a65a65-b2b5-4047-8758-3db33d2878e9",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T11:23:00.462364Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "7b7435d6-306d-430d-a364-031a7d3fb426",
  "platform": "ANDROID",
  "token": "sandbox-rider-dcf94e4b-2b2c-49b2-b8f7-b4547a16ce66"
}
```

```json
{
  "id": "6ade3864-da3f-4718-9a0b-9ca2f0812d18",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T11:23:00.645827Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "1dc3fa1f-44c6-48c1-b115-cdf2ea7fa530",
  "quote_id": "433c5d95-a550-4c86-a56a-b2ea6424cdf9",
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
  "id": "127acfb0-b730-4b87-8f3e-e619fd217f07",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c7406522-5a85-4a04-8ef9-72aaf3585ad7",
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
  "created_at": "2026-10-28T11:23:00.838323Z",
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
    "id": "9a0d90d6-3607-491a-ab57-89e75db096da",
    "order_id": "127acfb0-b730-4b87-8f3e-e619fd217f07",
    "expires_at": "2026-10-28T11:23:15.840586Z",
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

`POST /api/driver/v1/offers/9a0d90d6-3607-491a-ab57-89e75db096da/accept` → **200**

```json
{
  "command_id": "d1fb347c-3e06-4bdf-aab2-521e27f4289a"
}
```

```json
{
  "id": "5822ac70-a14c-467b-b4ab-75c33a9543b5",
  "order_id": "127acfb0-b730-4b87-8f3e-e619fd217f07",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2ada26b8-1239-44ea-a947-fe57809e9983",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T11:23:00.817Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T11:23:00.817Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T11:23:00.817Z` → **200**

```json
[
  {
    "at": "2026-10-28T11:23:02.497143844Z",
    "token_suffix": "ecfbf5",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "127acfb0-b730-4b87-8f3e-e619fd217f07",
      "order_version": "2",
      "event_id": "21434046-6c48-4dfd-9645-474c9923b67c",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380672221469&after=2026-10-28T11:23:00.817Z` → **200**

```json
[
  {
    "at": "2026-10-28T11:23:02.499955303Z",
    "token_suffix": "16ce66",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "127acfb0-b730-4b87-8f3e-e619fd217f07",
      "order_version": "3",
      "event_id": "a4f55dbb-5d20-467e-8b86-e61080b288a3",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/127acfb0-b730-4b87-8f3e-e619fd217f07/messages` → **201**

```json
{
  "command_id": "2c4d36ee-4336-4013-ae3e-711a857e2833",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "992ece8b-850d-47e9-b86f-f5ce9de0683e",
  "order_id": "127acfb0-b730-4b87-8f3e-e619fd217f07",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T11:23:03.525313659Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2ada26b8-1239-44ea-a947-fe57809e9983",
  "order_id": "127acfb0-b730-4b87-8f3e-e619fd217f07",
  "assignment_id": "5822ac70-a14c-467b-b4ab-75c33a9543b5",
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

`POST /api/driver/v1/trips/2ada26b8-1239-44ea-a947-fe57809e9983/messages` → **201**

```json
{
  "command_id": "3e13f227-9e2e-46a1-9a6d-2baf5587570d",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "f3bdef38-09ce-4f9c-a8d3-e1a49cb6bb7a",
  "order_id": "127acfb0-b730-4b87-8f3e-e619fd217f07",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T11:23:03.892437241Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/127acfb0-b730-4b87-8f3e-e619fd217f07/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/2ada26b8-1239-44ea-a947-fe57809e9983/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380672221469"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/1120070b-198b-4d5f-8654-b8a2da53517c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:23:04Z",
    "sequence": 1793186584429
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1120070b-198b-4d5f-8654-b8a2da53517c",
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
  "last_heartbeat_at": "2026-10-28T11:23:04.446413Z",
  "last_location_at": "2026-10-28T11:23:04.446413Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2ada26b8-1239-44ea-a947-fe57809e9983",
  "order_id": "127acfb0-b730-4b87-8f3e-e619fd217f07",
  "assignment_id": "5822ac70-a14c-467b-b4ab-75c33a9543b5",
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

`POST /api/driver/v1/trips/2ada26b8-1239-44ea-a947-fe57809e9983/arrive` → **200**

```json
{
  "command_id": "5eb0ff1a-1107-41e5-bfb6-099186e19259",
  "expected_version": 0
}
```

```json
{
  "id": "2ada26b8-1239-44ea-a947-fe57809e9983",
  "order_id": "127acfb0-b730-4b87-8f3e-e619fd217f07",
  "assignment_id": "5822ac70-a14c-467b-b4ab-75c33a9543b5",
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
  "arrived_at": "2026-10-28T11:23:04.809953Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2ada26b8-1239-44ea-a947-fe57809e9983/start` → **200**

```json
{
  "command_id": "95ed3a39-82f2-4a69-8758-645f1b8a8ee8",
  "expected_version": 1
}
```

```json
{
  "id": "2ada26b8-1239-44ea-a947-fe57809e9983",
  "order_id": "127acfb0-b730-4b87-8f3e-e619fd217f07",
  "assignment_id": "5822ac70-a14c-467b-b4ab-75c33a9543b5",
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
  "arrived_at": "2026-10-28T11:23:04.809953Z",
  "started_at": "2026-10-28T11:23:04.999797Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/1120070b-198b-4d5f-8654-b8a2da53517c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:23:05Z",
    "sequence": 1793186585177
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1120070b-198b-4d5f-8654-b8a2da53517c",
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
  "last_heartbeat_at": "2026-10-28T11:23:05.194496Z",
  "last_location_at": "2026-10-28T11:23:05.194496Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/2ada26b8-1239-44ea-a947-fe57809e9983/complete` → **200**

```json
{
  "command_id": "25177ca5-7906-4510-8fae-0ff7dc0c0f03",
  "expected_version": 2,
  "reported_at": "2026-10-28T11:23:05Z",
  "cash_received": true
}
```

```json
{
  "id": "2ada26b8-1239-44ea-a947-fe57809e9983",
  "order_id": "127acfb0-b730-4b87-8f3e-e619fd217f07",
  "assignment_id": "5822ac70-a14c-467b-b4ab-75c33a9543b5",
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
  "arrived_at": "2026-10-28T11:23:04.809953Z",
  "started_at": "2026-10-28T11:23:04.999797Z",
  "completed_at": "2026-10-28T11:23:05.384136Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/127acfb0-b730-4b87-8f3e-e619fd217f07` → **200**

```json
{
  "id": "127acfb0-b730-4b87-8f3e-e619fd217f07",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c7406522-5a85-4a04-8ef9-72aaf3585ad7",
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
    "id": "5822ac70-a14c-467b-b4ab-75c33a9543b5",
    "order_id": "127acfb0-b730-4b87-8f3e-e619fd217f07",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2ada26b8-1239-44ea-a947-fe57809e9983",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T11:23:00.838323Z",
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
    "id": "127acfb0-b730-4b87-8f3e-e619fd217f07",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-28T11:23:00.838323Z",
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
    "id": "2ada26b8-1239-44ea-a947-fe57809e9983",
    "order_id": "127acfb0-b730-4b87-8f3e-e619fd217f07",
    "order_short_number": 7,
    "created_at": "2026-10-28T11:23:01.220229Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "93208b62-77b2-4650-8794-d1cd1aefe465",
    "order_id": "33717be1-5bb2-43a2-a09b-62b0c991849e",
    "order_short_number": 1,
    "created_at": "2026-10-28T11:21:52.107408Z",
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

`GET /api/driver/v1/earnings?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-28&to=2026-10-28` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-28",
  "to": "2026-10-28",
  "days": [
    {
      "date": "2026-10-28",
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

`GET /api/rider/v1/orders/127acfb0-b730-4b87-8f3e-e619fd217f07/tip` → **200**

```json
{
  "order_id": "127acfb0-b730-4b87-8f3e-e619fd217f07",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
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
  "available_until": "2026-10-29T11:23:05.384136Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/127acfb0-b730-4b87-8f3e-e619fd217f07/tip` → **201**

```json
{
  "command_id": "adca451a-8923-45e0-9c1c-12542533ad17",
  "amount_minor": 1100
}
```

```json
{
  "id": "d0c8ab87-f627-49ad-8810-26c95e554df3",
  "order_id": "127acfb0-b730-4b87-8f3e-e619fd217f07",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T11:23:09.682092Z"
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
  "session_id": "c94c4fd5-a502-43b4-bbee-73c87533e48c",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc0OTAsImlhdCI6MTc5MzE4NjU5MCwianRpIjoiYTkxMzFmOWYtNzA2OS00ODZiLTgyNjUtY2JmNzkzMmI1NTNiIiwic2lkIjoiYzk0YzRmZDUtYTUwMi00M2I0LWJiZWUtNzNjODc1MzNlNDhjIn0.Aq5dir6B6ZrFcLzcP4ybiwSdtZ1HrLF26jtLXH82nkc",
  "access_expires_at": "2026-10-28T11:38:10.075107454Z",
  "refresh_token": "tA92wuPlIThJWQTJOwAuwIJrZ7nSbhMT6Xf1N7VpMeQ",
  "refresh_expires_at": "2026-10-28T23:23:10.074586177Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/reports/orders?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-28&to=2026-10-28` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-28",
  "to": "2026-10-28",
  "days": [
    {
      "date": "2026-10-28",
      "counts": {
        "created": 7,
        "fulfilled": 3,
        "cancelled": 4,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "APP": 7
        },
        "by_payment": {
          "CASH": 6,
          "CARD": 1
        },
        "cancelled_by": {
          "STAFF": 1,
          "RIDER": 2,
          "DRIVER": 1
        }
      }
    }
  ],
  "total": {
    "created": 7,
    "fulfilled": 3,
    "cancelled": 4,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "APP": 7
    },
    "by_payment": {
      "CASH": 6,
      "CARD": 1
    },
    "cancelled_by": {
      "STAFF": 1,
      "RIDER": 2,
      "DRIVER": 1
    }
  },
  "cancellation_reasons": [
    {
      "cancelled_by": "RIDER",
      "code": "CHANGED_MIND",
      "count": 1
    },
    {
      "cancelled_by": "STAFF",
      "code": "NO_CARS",
      "count": 1
    },
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
  ],
  "generated_at": "2026-10-28T11:23:10.259025646Z"
}
```

`GET /api/admin/v1/reports/finance?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-28&to=2026-10-28` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-28",
  "to": "2026-10-28",
  "days": [
    {
      "date": "2026-10-28",
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
  },
  "generated_at": "2026-10-28T11:23:10.447380278Z"
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
  "session_id": "8704d281-dd33-4b69-b43c-f8eacba50908",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc0OTAsImlhdCI6MTc5MzE4NjU5MCwianRpIjoiMDc0NGQzMDMtYmQ3Yi00MGNmLTg4Y2MtMTJiYmExOGE0MTE4Iiwic2lkIjoiODcwNGQyODEtZGQzMy00YjY5LWI0M2MtZjhlYWNiYTUwOTA4In0.J2kpVrKI9RB-H8drXY4RQ5XgCEQml4HjDDTGf1idot0",
  "access_expires_at": "2026-10-28T11:38:10.845458027Z",
  "refresh_token": "tYK9GpnjtPYG1dD6qJaBDFsgJXe92zl6SeJ2XZKXJr0",
  "refresh_expires_at": "2026-10-28T23:23:10.845089298Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/127acfb0-b730-4b87-8f3e-e619fd217f07/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T11:23:00.838703Z",
      "actor": {
        "type": "CLIENT",
        "id": "c7406522-5a85-4a04-8ef9-72aaf3585ad7",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "127acfb0-b730-4b87-8f3e-e619fd217f07",
        "quote_id": "433c5d95-a550-4c86-a56a-b2ea6424cdf9",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "57738528-b029-45e8-8c28-21438e98c189"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T11:23:00.840034Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "127acfb0-b730-4b87-8f3e-e619fd217f07",
        "attempt_id": "d03b496d-d63d-4852-8ee0-3fc5fd8da99b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "57738528-b029-45e8-8c28-21438e98c189"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T11:23:00.844343Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "9a0d90d6-3607-491a-ab57-89e75db096da",
        "order_id": "127acfb0-b730-4b87-8f3e-e619fd217f07",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "57738528-b029-45e8-8c28-21438e98c189"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T11:23:01.22137Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "9a0d90d6-3607-491a-ab57-89e75db096da",
        "order_id": "127acfb0-b730-4b87-8f3e-e619fd217f07",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "5822ac70-a14c-467b-b4ab-75c33a9543b5"
      },
      "correlation_id": "f90ff0da-4646-4961-8924-4441476d89b5"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T11:23:11.212249815Z",
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
      "last_location_at": "2026-10-28T11:23:05.194496Z",
      "order_id": null
    }
  ]
}
```

Done: order 127acfb0-b730-4b87-8f3e-e619fd217f07.

# Scenario: incoming-call

## The admin says which city the service number belongs to

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
  "session_id": "fc22087b-ad20-4ea9-89b7-86b06ef423de",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc0OTEsImlhdCI6MTc5MzE4NjU5MSwianRpIjoiZmQ5YzU0YmYtMDY4MS00MDdlLWEzMDEtZTk2M2M2YzRkZTQxIiwic2lkIjoiZmMyMjA4N2ItYWQyMC00ZWE5LTg5YjctODZiMDZlZjQyM2RlIn0.CLsDiUuW_aqdMcKIncVOxuip5BW3-goPvBcAR5rjZqE",
  "access_expires_at": "2026-10-28T11:38:11.624476464Z",
  "refresh_token": "AacLld2FjTPsaRJazievvRueF7L0zChV_JURarUQAtM",
  "refresh_expires_at": "2026-10-28T23:23:11.624103589Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/call-lines` → **200**

```json
{
  "lines": [
    {
      "number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "label": "Kyiv call centre",
      "version": 1
    }
  ]
}
```

`POST /api/admin/v1/call-lines/%2B380441110064` → **200**

```json
{
  "command_id": "1dc8914c-368a-47c2-b1f1-88e386103f27",
  "expected_version": 0,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "label": "Kyiv call centre",
  "reason": "Sandbox incoming-call scenario"
}
```

```json
{
  "number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "label": "Kyiv call centre",
  "version": 1
}
```

## A call comes in; Asterisk reports it twice — one call in the log

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "timestamp": "2026-10-28T11:23:12.000+0000",
  "channel": {
    "id": "1730052000.2776925753",
    "linkedid": "1730052000.2776925753",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676501626"
    },
    "dialplan": {
      "context": "from-trunk",
      "exten": "380441110064"
    }
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "timestamp": "2026-10-28T11:23:12.000+0000",
  "channel": {
    "id": "1730052000.2776925753",
    "linkedid": "1730052000.2776925753",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676501626"
    },
    "dialplan": {
      "context": "from-trunk",
      "exten": "380441110064"
    }
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
  "session_id": "d794e9fa-a3a5-4bf4-897b-2583fe38161c",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc0OTIsImlhdCI6MTc5MzE4NjU5MiwianRpIjoiMmU2MWM5NzEtNDk4OS00NDZiLWE5ZDYtZjQyYzk5N2YyYWI2Iiwic2lkIjoiZDc5NGU5ZmEtYTNhNS00YmY0LTg5N2ItMjU4M2ZlMzgxNjFjIn0.fJ82FaArbnYLBK31eLUY2hvr5MXS9yIZJ-bnb1kk_w0",
  "access_expires_at": "2026-10-28T11:38:12.428440156Z",
  "refresh_token": "w8J6JkznMGVwjQDThQvC-4ON1WXNx90DOVkO6ISi6DM",
  "refresh_expires_at": "2026-10-28T23:23:12.428081442Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "4ead08ac-ccdb-4594-8f2c-2f4d04319a57",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380676501626",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T11:23:12Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/4ead08ac-ccdb-4594-8f2c-2f4d04319a57/answer` → **200**

```json
{
  "command_id": "e35bda8b-b761-45d0-947a-062a78bd656c"
}
```

```json
{
  "id": "4ead08ac-ccdb-4594-8f2c-2f4d04319a57",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380676501626",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "23eabed1-5103-466a-be3b-89bb210931f7",
  "order_ids": [],
  "started_at": "2026-10-28T11:23:12Z",
  "answered_at": "2026-10-28T11:23:12.803755Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2776925753",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "3736e173-a11a-47ba-933f-d5f747debaac",
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
  "id": "82e3c08a-daac-45ab-b7a0-bc456e072f15",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:28:13.017392Z",
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

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "293564de-a134-4aa6-924e-ec2a9fd1c6a5",
  "quote_id": "82e3c08a-daac-45ab-b7a0-bc456e072f15",
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
  "caller": {
    "name": "Caller",
    "phone": "+380676501626"
  },
  "call_id": "4ead08ac-ccdb-4594-8f2c-2f4d04319a57"
}
```

```json
{
  "id": "affb4f0f-e893-4870-ab60-093469c52a71",
  "short_number": 8,
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
  "created_at": "2026-10-28T11:23:13.21679Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676501626"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The caller hangs up: the call is over, the order is not

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "1730052000.2776925753",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "4ead08ac-ccdb-4594-8f2c-2f4d04319a57",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676501626",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "23eabed1-5103-466a-be3b-89bb210931f7",
      "order_ids": [
        "affb4f0f-e893-4870-ab60-093469c52a71"
      ],
      "started_at": "2026-10-28T11:23:12Z",
      "answered_at": "2026-10-28T11:23:12.803755Z",
      "ended_at": "2026-10-28T11:23:13.414732Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "fe458435-3756-4865-ba52-804ddb3f7aab",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674776534",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "23eabed1-5103-466a-be3b-89bb210931f7",
      "order_ids": [],
      "started_at": "2026-10-28T11:21:58.485474Z",
      "answered_at": "2026-10-28T11:21:58.703699Z",
      "ended_at": "2026-10-28T11:21:58.908758Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T11:22:01.312028Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/affb4f0f-e893-4870-ab60-093469c52a71` → **200**

```json
{
  "id": "affb4f0f-e893-4870-ab60-093469c52a71",
  "short_number": 8,
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
  "created_at": "2026-10-28T11:23:13.21679Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676501626"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/affb4f0f-e893-4870-ab60-093469c52a71` → **200**

```json
{
  "id": "affb4f0f-e893-4870-ab60-093469c52a71",
  "short_number": 8,
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
  "created_at": "2026-10-28T11:23:13.21679Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676501626"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/affb4f0f-e893-4870-ab60-093469c52a71/cancel` → **200**

```json
{
  "command_id": "9d1d8212-fad2-45ae-af3b-29fef26d7e6e",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "affb4f0f-e893-4870-ab60-093469c52a71",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
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
  "created_at": "2026-10-28T11:23:13.21679Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676501626"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 4ead08ac-ccdb-4594-8f2c-2f4d04319a57 with order affb4f0f-e893-4870-ab60-093469c52a71.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17849"
}
```

```json
{
  "challenge_id": "11518d8b-95e3-4bd9-b71f-747c40bb78eb",
  "expires_at": "2026-10-28T11:28:14.221072575Z",
  "resend_available_at": "2026-10-28T11:23:15.221072575Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "359992",
  "sent_at": "2026-10-28T11:23:14.222898996Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "11518d8b-95e3-4bd9-b71f-747c40bb78eb",
  "code": "359992",
  "device_ref": "sandbox-17849"
}
```

```json
{
  "session_id": "84defda0-5d71-4626-b0f8-dbc7c2fedfdb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NzQ5NCwiaWF0IjoxNzkzMTg2NTk0LCJqdGkiOiJiYWIxMjU2OC02MGY3LTQwYjEtYWRlZS1iMWRhMTMxZTY4ZDAiLCJzaWQiOiI4NGRlZmRhMC01ZDcxLTQ2MjYtYjBmOC1kYmM3YzJmZWRmZGIifQ.3IkWlqGgUGkmhWtw3_voH6IQUYMLmG-O40xstnkKI8Q",
  "access_expires_at": "2026-10-28T11:38:14.421505672Z",
  "refresh_token": "M4k5u1mTfp67Ta-xAvkiBrqcq1JkHDxNBz762kidKJ8",
  "refresh_expires_at": "2026-11-27T11:23:14.421000939Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1120070b-198b-4d5f-8654-b8a2da53517c",
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
  "last_heartbeat_at": "2026-10-28T11:23:05.194496Z",
  "last_location_at": "2026-10-28T11:23:05.194496Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1120070b-198b-4d5f-8654-b8a2da53517c/handover` → **200**

```json
{
  "command_id": "6bb824aa-1577-4aa5-b0cd-063409b75be2",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1120070b-198b-4d5f-8654-b8a2da53517c",
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
  "last_heartbeat_at": "2026-10-28T11:23:05.194496Z",
  "last_location_at": "2026-10-28T11:23:05.194496Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1120070b-198b-4d5f-8654-b8a2da53517c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:23:14Z",
    "sequence": 1793186594964
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1120070b-198b-4d5f-8654-b8a2da53517c",
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
  "last_heartbeat_at": "2026-10-28T11:23:14.980406Z",
  "last_location_at": "2026-10-28T11:23:14.980406Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661853840",
  "device_ref": "sandbox-32549"
}
```

```json
{
  "challenge_id": "cd870134-1c9f-402b-9ed0-bac806831eb7",
  "expires_at": "2026-10-28T11:28:15.163196096Z",
  "resend_available_at": "2026-10-28T11:23:16.163196096Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661853840` → **200**

```json
{
  "phone": "+380661853840",
  "audience": "CLIENT",
  "code": "413874",
  "sent_at": "2026-10-28T11:23:15.164979664Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd870134-1c9f-402b-9ed0-bac806831eb7",
  "code": "413874",
  "device_ref": "sandbox-32549"
}
```

```json
{
  "session_id": "0d5007be-a5d5-4187-bf6a-6085aab99a29",
  "subject": {
    "type": "CLIENT",
    "id": "6411ad81-7a1f-47fc-8f7b-ad189306ca07"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NDExYWQ4MS03YTFmLTQ3ZmMtOGY3Yi1hZDE4OTMwNmNhMDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg3NDk1LCJpYXQiOjE3OTMxODY1OTUsImp0aSI6ImQyNmI1ZjY0LWY4MDUtNGE1ZS1hNzAzLWM4NTQwNGFmNmY3MiIsInNpZCI6IjBkNTAwN2JlLWE1ZDUtNDE4Ny1iZjZhLTYwODVhYWI5OWEyOSJ9.mnJ7hjgrw0leHdpKlu6eyPV98kkgdegxKYLaMcFVaOQ",
  "access_expires_at": "2026-10-28T11:38:15.368349118Z",
  "refresh_token": "Gsu-aonxRsr_GHpn36Y00vokIfVbHKwcjKFcQzcterg",
  "refresh_expires_at": "2026-11-27T11:23:15.367942102Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "40308023-8f0f-43a2-bf30-813e82bdd856",
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
  "id": "3d52a3b8-1d36-4ac9-8514-88d3baba4b9c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:28:15.556090Z",
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
  "command_id": "9efc27eb-bd9a-40a6-a157-f09c654c554a",
  "quote_id": "3d52a3b8-1d36-4ac9-8514-88d3baba4b9c",
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
  "id": "768d53a7-f355-4bd6-a756-af8c9d605e12",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6411ad81-7a1f-47fc-8f7b-ad189306ca07",
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
  "created_at": "2026-10-28T11:23:15.751631Z",
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
    "id": "d0fda145-17e5-4f8b-a56a-eb5c8ce657ef",
    "order_id": "768d53a7-f355-4bd6-a756-af8c9d605e12",
    "expires_at": "2026-10-28T11:23:30.754005Z",
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

`POST /api/driver/v1/offers/d0fda145-17e5-4f8b-a56a-eb5c8ce657ef/accept` → **200**

```json
{
  "command_id": "354a24bb-c308-4f93-9d65-b06c81d99666"
}
```

```json
{
  "id": "ba1266af-a190-4007-bf1a-3ca581b48225",
  "order_id": "768d53a7-f355-4bd6-a756-af8c9d605e12",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "24a7660c-e251-4ab5-bcd2-f561c10fd2e2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "24a7660c-e251-4ab5-bcd2-f561c10fd2e2",
  "order_id": "768d53a7-f355-4bd6-a756-af8c9d605e12",
  "assignment_id": "ba1266af-a190-4007-bf1a-3ca581b48225",
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

`POST /api/driver/v1/work-sessions/1120070b-198b-4d5f-8654-b8a2da53517c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:23:16Z",
    "sequence": 1793186596474
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1120070b-198b-4d5f-8654-b8a2da53517c",
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
  "last_heartbeat_at": "2026-10-28T11:23:16.491043Z",
  "last_location_at": "2026-10-28T11:23:16.491043Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/24a7660c-e251-4ab5-bcd2-f561c10fd2e2/arrive` → **200**

```json
{
  "command_id": "debb8f1f-124b-48b5-bada-10377437a276",
  "expected_version": 0
}
```

```json
{
  "id": "24a7660c-e251-4ab5-bcd2-f561c10fd2e2",
  "order_id": "768d53a7-f355-4bd6-a756-af8c9d605e12",
  "assignment_id": "ba1266af-a190-4007-bf1a-3ca581b48225",
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
  "arrived_at": "2026-10-28T11:23:16.677109Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/24a7660c-e251-4ab5-bcd2-f561c10fd2e2/start` → **200**

```json
{
  "command_id": "d917e3ef-b21a-4180-a647-a4904389d80c",
  "expected_version": 1
}
```

```json
{
  "id": "24a7660c-e251-4ab5-bcd2-f561c10fd2e2",
  "order_id": "768d53a7-f355-4bd6-a756-af8c9d605e12",
  "assignment_id": "ba1266af-a190-4007-bf1a-3ca581b48225",
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
  "arrived_at": "2026-10-28T11:23:16.677109Z",
  "started_at": "2026-10-28T11:23:16.867409Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/1120070b-198b-4d5f-8654-b8a2da53517c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:23:17Z",
    "sequence": 1793186597505
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1120070b-198b-4d5f-8654-b8a2da53517c",
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
  "last_heartbeat_at": "2026-10-28T11:23:17.066712Z",
  "last_location_at": "2026-10-28T11:23:17.066712Z",
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
  "device_ref": "sandbox-24836"
}
```

```json
{
  "challenge_id": "6022fd21-8c0d-42a4-a81a-f83493b4c601",
  "expires_at": "2026-10-28T11:28:17.248205781Z",
  "resend_available_at": "2026-10-28T11:23:18.248205781Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "113342",
  "sent_at": "2026-10-28T11:23:17.249930431Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6022fd21-8c0d-42a4-a81a-f83493b4c601",
  "code": "113342",
  "device_ref": "sandbox-24836"
}
```

```json
{
  "session_id": "be80189c-5be0-47e0-8ee7-073225c1488a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NzQ5NywiaWF0IjoxNzkzMTg2NTk3LCJqdGkiOiIzNmNmNDYyZC01N2IyLTQxNWMtOGFjZC1kY2Q2ZDBjOTFjNzciLCJzaWQiOiJiZTgwMTg5Yy01YmUwLTQ3ZTAtOGVlNy0wNzMyMjVjMTQ4OGEifQ.w8ikepp-ZZ6jF-_VYACsIpJSPljUjieC4sh111BJQxw",
  "access_expires_at": "2026-10-28T11:38:17.455840761Z",
  "refresh_token": "IqIrLtaTK7JLgZvO-Q-_VjOKtFJdo_Qq_8XTHDXc0oI",
  "refresh_expires_at": "2026-11-27T11:23:17.455425832Z",
  "account_created": false
}
```

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
  "command_id": "0c82dcd9-4dab-4fa2-bcb7-87c0cc12bcf8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:23:17Z",
    "sequence": 1793186597830
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ee8cff57-2be9-4d2d-bfb9-dc8cccaf2bae",
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
  "last_heartbeat_at": "2026-10-28T11:23:17.846334Z",
  "last_location_at": "2026-10-28T11:23:17.846334Z",
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
  "session_id": "e9c97252-d4af-46a9-8012-52e23557371b",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc0OTgsImlhdCI6MTc5MzE4NjU5OCwianRpIjoiNzY2OWEzMjAtNWU0ZS00Y2JmLWEzOGQtYzIyNzNiN2ZmNDllIiwic2lkIjoiZTljOTcyNTItZDRhZi00NmE5LTgwMTItNTJlMjM1NTczNzFiIn0.ol_SGXY_CHy6WqFRJCh6FcHmKTCLO0hRdkSaoSH0rLM",
  "access_expires_at": "2026-10-28T11:38:18.243881381Z",
  "refresh_token": "46z6WrdUIR6yT_ZUNgdW5dc0sz2bGOTCH3JZpFTR-wk",
  "refresh_expires_at": "2026-10-28T23:23:18.243454435Z",
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
  "session_id": "11d703d0-4fa5-45f7-b038-44d5345bcef9",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc0OTgsImlhdCI6MTc5MzE4NjU5OCwianRpIjoiZjFhNjhmZDAtNWYzZi00YTgxLWI2ODgtYTViZGY0MDZlZjc4Iiwic2lkIjoiMTFkNzAzZDAtNGZhNS00NWY3LWIwMzgtNDRkNTM0NWJjZWY5In0.SOwPHoplW2j4yNTyX2EAmYtUQ9pEzBvB8yu0ucHSauc",
  "access_expires_at": "2026-10-28T11:38:18.63427426Z",
  "refresh_token": "7Filv1YzZIlZTOkIZ5SnWnTXbNBROtc7pyEPY1NBWT8",
  "refresh_expires_at": "2026-10-28T23:23:18.63392526Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/768d53a7-f355-4bd6-a756-af8c9d605e12` → **200**

```json
{
  "id": "768d53a7-f355-4bd6-a756-af8c9d605e12",
  "short_number": 9,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "6411ad81-7a1f-47fc-8f7b-ad189306ca07",
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
    "id": "ba1266af-a190-4007-bf1a-3ca581b48225",
    "order_id": "768d53a7-f355-4bd6-a756-af8c9d605e12",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "24a7660c-e251-4ab5-bcd2-f561c10fd2e2",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T11:23:15.751631Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/768d53a7-f355-4bd6-a756-af8c9d605e12/interrupt` → **200**

```json
{
  "command_id": "77bed734-c74f-4017-917d-50fd3d8f3163",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "768d53a7-f355-4bd6-a756-af8c9d605e12",
    "short_number": 9,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "6411ad81-7a1f-47fc-8f7b-ad189306ca07",
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
      "id": "ba1266af-a190-4007-bf1a-3ca581b48225",
      "order_id": "768d53a7-f355-4bd6-a756-af8c9d605e12",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "24a7660c-e251-4ab5-bcd2-f561c10fd2e2",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T11:23:15.751631Z",
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
    "id": "0cb37462-a142-4c89-a1db-ce3cd6da96f9",
    "short_number": 10,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "6411ad81-7a1f-47fc-8f7b-ad189306ca07",
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
    "id": "53d6e430-282e-4c4d-9bae-496d97eb29c5",
    "order_id": "0cb37462-a142-4c89-a1db-ce3cd6da96f9",
    "expires_at": "2026-10-28T11:23:34.026105Z",
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

`POST /api/driver/v1/offers/53d6e430-282e-4c4d-9bae-496d97eb29c5/accept` → **200**

```json
{
  "command_id": "4ee2b527-92e8-40ff-9055-d621021a2a29"
}
```

```json
{
  "id": "57cef8b3-15a8-4d08-9f67-91949eb8820b",
  "order_id": "0cb37462-a142-4c89-a1db-ce3cd6da96f9",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "27ff32b0-599b-4428-b571-e733bb662025",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "27ff32b0-599b-4428-b571-e733bb662025",
  "order_id": "0cb37462-a142-4c89-a1db-ce3cd6da96f9",
  "assignment_id": "57cef8b3-15a8-4d08-9f67-91949eb8820b",
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
  "session_id": "ee8cff57-2be9-4d2d-bfb9-dc8cccaf2bae",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T11:23:17.846334Z",
  "last_location_at": "2026-10-28T11:23:17.846334Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/ee8cff57-2be9-4d2d-bfb9-dc8cccaf2bae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:23:19Z",
    "sequence": 1793186599922
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ee8cff57-2be9-4d2d-bfb9-dc8cccaf2bae",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T11:23:19.939035Z",
  "last_location_at": "2026-10-28T11:23:19.939035Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/27ff32b0-599b-4428-b571-e733bb662025/arrive` → **200**

```json
{
  "command_id": "61a39091-55b0-4c6f-beff-7cb0df031251",
  "expected_version": 0
}
```

```json
{
  "id": "27ff32b0-599b-4428-b571-e733bb662025",
  "order_id": "0cb37462-a142-4c89-a1db-ce3cd6da96f9",
  "assignment_id": "57cef8b3-15a8-4d08-9f67-91949eb8820b",
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
  "arrived_at": "2026-10-28T11:23:20.12942Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/27ff32b0-599b-4428-b571-e733bb662025/start` → **200**

```json
{
  "command_id": "0828af1d-d536-49e6-bd4b-ca689f2d0cf9",
  "expected_version": 1
}
```

```json
{
  "id": "27ff32b0-599b-4428-b571-e733bb662025",
  "order_id": "0cb37462-a142-4c89-a1db-ce3cd6da96f9",
  "assignment_id": "57cef8b3-15a8-4d08-9f67-91949eb8820b",
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
  "arrived_at": "2026-10-28T11:23:20.12942Z",
  "started_at": "2026-10-28T11:23:20.327987Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/27ff32b0-599b-4428-b571-e733bb662025/complete` → **200**

```json
{
  "command_id": "50f8eff1-3882-447e-915b-8405787592e2",
  "expected_version": 2,
  "reported_at": "2026-10-28T11:23:20Z"
}
```

```json
{
  "id": "27ff32b0-599b-4428-b571-e733bb662025",
  "order_id": "0cb37462-a142-4c89-a1db-ce3cd6da96f9",
  "assignment_id": "57cef8b3-15a8-4d08-9f67-91949eb8820b",
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
  "arrived_at": "2026-10-28T11:23:20.12942Z",
  "started_at": "2026-10-28T11:23:20.327987Z",
  "completed_at": "2026-10-28T11:23:20.52017Z",
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
    "id": "0cb37462-a142-4c89-a1db-ce3cd6da96f9",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T11:23:19.019327Z",
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
    "id": "768d53a7-f355-4bd6-a756-af8c9d605e12",
    "short_number": 9,
    "status": "CANCELLED",
    "created_at": "2026-10-28T11:23:15.751631Z",
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

`GET /api/operator/v1/orders/768d53a7-f355-4bd6-a756-af8c9d605e12/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T11:23:15.752033Z",
      "actor": {
        "type": "CLIENT",
        "id": "6411ad81-7a1f-47fc-8f7b-ad189306ca07",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "768d53a7-f355-4bd6-a756-af8c9d605e12",
        "quote_id": "3d52a3b8-1d36-4ac9-8514-88d3baba4b9c",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "7f51afa0-10b4-4ddd-9824-6f9abcf39b1f"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T11:23:15.75335Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "768d53a7-f355-4bd6-a756-af8c9d605e12",
        "attempt_id": "291b38ec-bb8d-471c-8aaf-4608d05cde34",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "7f51afa0-10b4-4ddd-9824-6f9abcf39b1f"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T11:23:15.756039Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d0fda145-17e5-4f8b-a56a-eb5c8ce657ef",
        "order_id": "768d53a7-f355-4bd6-a756-af8c9d605e12",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "7f51afa0-10b4-4ddd-9824-6f9abcf39b1f"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T11:23:16.131246Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "d0fda145-17e5-4f8b-a56a-eb5c8ce657ef",
        "order_id": "768d53a7-f355-4bd6-a756-af8c9d605e12",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "ba1266af-a190-4007-bf1a-3ca581b48225"
      },
      "correlation_id": "9dc07dff-f8c3-4fad-954f-3aa541a30f16"
```

Done: interrupted 768d53a7-f355-4bd6-a756-af8c9d605e12, follow-up 0cb37462-a142-4c89-a1db-ce3cd6da96f9.

# Scenario: legal-acceptance

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
  "session_id": "50a077c6-8051-4beb-b0ec-45aee9eb9db8",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc1MDQsImlhdCI6MTc5MzE4NjYwNCwianRpIjoiMzRiN2MzNmUtNDA1ZC00YmQ4LTliZmUtNDVkMjUzNzM2YzQ0Iiwic2lkIjoiNTBhMDc3YzYtODA1MS00YmViLWIwZWMtNDVhZWU5ZWI5ZGI4In0.uje7ryNeimOQVs3mwJ9chDZJaYRtun8go3wbfvmk4iA",
  "access_expires_at": "2026-10-28T11:38:24.474244133Z",
  "refresh_token": "Dv0GV-Icr67DUo_t-Y0ycLSsy_vRwNZhjrsOAsBt41o",
  "refresh_expires_at": "2026-10-28T23:23:24.4737452Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "218b8a8c-1f2b-4398-a863-beee7a9a24b1",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T11:23:24Z"
}
```

```json
{
  "id": "27af8a5f-0b91-4ef9-8c33-e2ff76b4f317",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T11:23:24Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/27af8a5f-0b91-4ef9-8c33-e2ff76b4f317/publish` → **200**

```json
{
  "command_id": "4d8e8c21-d1d1-4e45-a65d-8ef58e088df9",
  "expected_version": 0
}
```

```json
{
  "id": "27af8a5f-0b91-4ef9-8c33-e2ff76b4f317",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T11:23:24.867457Z",
  "published_at": "2026-10-28T11:23:24.867457Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "27af8a5f-0b91-4ef9-8c33-e2ff76b4f317",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T11:23:24.867457Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635202416",
  "device_ref": "sandbox-8983"
}
```

```json
{
  "challenge_id": "5f793a0b-9e2c-4176-b3bd-8a05dbf3aec6",
  "expires_at": "2026-10-28T11:28:25.234588342Z",
  "resend_available_at": "2026-10-28T11:23:26.234588342Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635202416` → **200**

```json
{
  "phone": "+380635202416",
  "audience": "CLIENT",
  "code": "693294",
  "sent_at": "2026-10-28T11:23:25.236422455Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5f793a0b-9e2c-4176-b3bd-8a05dbf3aec6",
  "code": "693294",
  "device_ref": "sandbox-8983"
}
```

```json
{
  "session_id": "5dbee5c7-2e6b-40ec-981e-0f18ede7b129",
  "subject": {
    "type": "CLIENT",
    "id": "63798792-17b0-4219-ad10-671ca3f1fb77"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2Mzc5ODc5Mi0xN2IwLTQyMTktYWQxMC02NzFjYTNmMWZiNzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg3NTA1LCJpYXQiOjE3OTMxODY2MDUsImp0aSI6ImRkNTQ0NjM0LTNlZjYtNGUxOC1iYjUwLTdiZDE1NGQyZDUxMSIsInNpZCI6IjVkYmVlNWM3LTJlNmItNDBlYy05ODFlLTBmMThlZGU3YjEyOSJ9.YhgcGfuF5eYD9fYXtQFnqZmWRy7riJGlc5dr0DMoU18",
  "access_expires_at": "2026-10-28T11:38:25.430996713Z",
  "refresh_token": "pDaeQtMwt7cw9oisifsyI-7NLGGgf7rAddM7uFk7CMY",
  "refresh_expires_at": "2026-11-27T11:23:25.430672009Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "27af8a5f-0b91-4ef9-8c33-e2ff76b4f317",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T11:23:24.867457Z",
      "languages": [
        "pl",
        "uk"
      ]
    }
  ]
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5d88662d-34c4-4fd9-8b67-9b524d4a1f25",
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
  "id": "81d3f7fe-b16d-436e-bbb8-e75bed6194bc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:28:25.783323Z",
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

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "a4acfe69-a7c5-472f-ab9c-9f9456d89fcd",
  "quote_id": "81d3f7fe-b16d-436e-bbb8-e75bed6194bc",
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
  "instance": "/api/rider/v1/orders",
  "status": 403,
  "title": "Acceptance required",
  "type": "https://errors.blizz.taxi/acceptance-required",
  "code": "ACCEPTANCE_REQUIRED",
  "correlation_id": "be135580-2134-4f20-82c6-523c12640e9d"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "1685ae34-73cd-4516-8552-6ead2ad2a2ca",
  "version_id": "27af8a5f-0b91-4ef9-8c33-e2ff76b4f317",
  "language": "uk"
}
```

```json
{
  "version_id": "27af8a5f-0b91-4ef9-8c33-e2ff76b4f317",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T11:23:26.158289Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2ccb854b-8171-4bc4-96d4-162a152a2b81",
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
  "id": "9bd368d4-d9b6-40f1-9917-35e0b124f16f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:28:26.347881Z",
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
  "command_id": "ad70c89f-29ce-4ddc-82f5-c9609c799193",
  "quote_id": "9bd368d4-d9b6-40f1-9917-35e0b124f16f",
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
  "id": "c9618159-50ed-4a4a-a1cc-7e310040bd1d",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "63798792-17b0-4219-ad10-671ca3f1fb77",
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
  "created_at": "2026-10-28T11:23:26.542623Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/c9618159-50ed-4a4a-a1cc-7e310040bd1d` → **200**

```json
{
  "id": "c9618159-50ed-4a4a-a1cc-7e310040bd1d",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "63798792-17b0-4219-ad10-671ca3f1fb77",
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
  "created_at": "2026-10-28T11:23:26.542623Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/c9618159-50ed-4a4a-a1cc-7e310040bd1d/cancel` → **200**

```json
{
  "command_id": "7fec4dfc-8c32-4a12-b4fc-162ce1303186",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c9618159-50ed-4a4a-a1cc-7e310040bd1d",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "63798792-17b0-4219-ad10-671ca3f1fb77",
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
  "created_at": "2026-10-28T11:23:26.542623Z",
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

## A published version never changes

`POST /api/admin/v1/legal-documents/27af8a5f-0b91-4ef9-8c33-e2ff76b4f317` → **409**

```json
{
  "command_id": "d951d2ec-48eb-40d0-aa11-be8982408dcd",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T11:23:27Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/27af8a5f-0b91-4ef9-8c33-e2ff76b4f317",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "dc043725-b7fa-4e66-ab61-34c00d38bc2d"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "4465992f-a2a6-44a2-82e2-45003f57d61e",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T11:23:27Z"
}
```

```json
{
  "id": "8906b9fd-aae4-4a28-862f-d59bde076616",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T11:23:27Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/8906b9fd-aae4-4a28-862f-d59bde076616/publish` → **200**

```json
{
  "command_id": "901b3bdb-a229-46c9-b33d-368147ac4c2f",
  "expected_version": 0
}
```

```json
{
  "id": "8906b9fd-aae4-4a28-862f-d59bde076616",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T11:23:27.57273Z",
  "published_at": "2026-10-28T11:23:27.57273Z",
  "version": 1
}
```

# Scenario: multiple-orders

## A driver goes online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-10872"
}
```

```json
{
  "challenge_id": "716926be-22ff-4816-8529-e39e9ad87581",
  "expires_at": "2026-10-28T11:28:27.760183889Z",
  "resend_available_at": "2026-10-28T11:23:28.760183889Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "530272",
  "sent_at": "2026-10-28T11:23:27.762149858Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "716926be-22ff-4816-8529-e39e9ad87581",
  "code": "530272",
  "device_ref": "sandbox-10872"
}
```

```json
{
  "session_id": "6d4e73c4-9ced-4423-a5c3-35d4febca237",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NzUwNywiaWF0IjoxNzkzMTg2NjA3LCJqdGkiOiIxN2Q5NjVkMy0xYWNkLTRhN2YtOWQ0OC1iZTNjMjgyYmRhODMiLCJzaWQiOiI2ZDRlNzNjNC05Y2VkLTQ0MjMtYTVjMy0zNWQ0ZmViY2EyMzcifQ.J0G-zc5luPeijE_eRXjCkoLcBdriJ1nucvbOsGbzYZI",
  "access_expires_at": "2026-10-28T11:38:27.962654493Z",
  "refresh_token": "qQ8vf1ChIcOQ_eEc9VRebEx1c_FEjACCKRLTvUG9a64",
  "refresh_expires_at": "2026-11-27T11:23:27.962247517Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ee8cff57-2be9-4d2d-bfb9-dc8cccaf2bae",
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
  "last_heartbeat_at": "2026-10-28T11:23:19.939035Z",
  "last_location_at": "2026-10-28T11:23:19.939035Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ee8cff57-2be9-4d2d-bfb9-dc8cccaf2bae/handover` → **200**

```json
{
  "command_id": "9d87fff4-4e11-4144-af64-eeb9ac7edb0e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ee8cff57-2be9-4d2d-bfb9-dc8cccaf2bae",
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
  "last_heartbeat_at": "2026-10-28T11:23:19.939035Z",
  "last_location_at": "2026-10-28T11:23:19.939035Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ee8cff57-2be9-4d2d-bfb9-dc8cccaf2bae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:23:28Z",
    "sequence": 1793186608502
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ee8cff57-2be9-4d2d-bfb9-dc8cccaf2bae",
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
  "last_heartbeat_at": "2026-10-28T11:23:28.518561Z",
  "last_location_at": "2026-10-28T11:23:28.518561Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671110046",
  "device_ref": "sandbox-732"
}
```

```json
{
  "challenge_id": "3ca4c4b8-eb64-4851-81ac-e8d70ae999a9",
  "expires_at": "2026-10-28T11:28:28.6998454Z",
  "resend_available_at": "2026-10-28T11:23:29.6998454Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671110046` → **200**

```json
{
  "phone": "+380671110046",
  "audience": "CLIENT",
  "code": "679178",
  "sent_at": "2026-10-28T11:23:28.702275011Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3ca4c4b8-eb64-4851-81ac-e8d70ae999a9",
  "code": "679178",
  "device_ref": "sandbox-732"
}
```

```json
{
  "session_id": "fd3006c8-d715-40db-a73d-8927234cb4a0",
  "subject": {
    "type": "CLIENT",
    "id": "9477cc45-a3c9-4517-b55e-683fe65cbf5e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDc3Y2M0NS1hM2M5LTQ1MTctYjU1ZS02ODNmZTY1Y2JmNWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg3NTA4LCJpYXQiOjE3OTMxODY2MDgsImp0aSI6ImIyNTU4ODU2LTQ5N2MtNGU3YS1iNGI0LWY4MTA4YWY3OTcwNCIsInNpZCI6ImZkMzAwNmM4LWQ3MTUtNDBkYi1hNzNkLTg5MjcyMzRjYjRhMCJ9.52Q36AhWvSQp3WT5WdZbxYSmZZ8uRnbM8Hl9SpkAdEQ",
  "access_expires_at": "2026-10-28T11:38:28.915400834Z",
  "refresh_token": "0wjS03CTGhuHkKSOVIYNKvt03PPWEYRccRj-bBakXbE",
  "refresh_expires_at": "2026-11-27T11:23:28.9150296Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b0269282-ed1a-4ad3-9c19-0a1b92af4ecb",
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
  "id": "39f102cb-5db9-4b19-959f-29bedf6b04a2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:28:29.097871Z",
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
  "command_id": "fbdaecc3-f4ab-44c6-be5d-3512a4cdc6a8",
  "quote_id": "39f102cb-5db9-4b19-959f-29bedf6b04a2",
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
    "phone": "+380679439330"
  }
}
```

```json
{
  "id": "af52b68a-d663-4a30-9956-f9654ad55cf5",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9477cc45-a3c9-4517-b55e-683fe65cbf5e",
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
  "created_at": "2026-10-28T11:23:29.290539Z",
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
    "id": "91f2ae3e-ba2a-419a-ba55-95487ae37b41",
    "order_id": "af52b68a-d663-4a30-9956-f9654ad55cf5",
    "expires_at": "2026-10-28T11:23:44.292991Z",
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

`POST /api/driver/v1/offers/91f2ae3e-ba2a-419a-ba55-95487ae37b41/accept` → **200**

```json
{
  "command_id": "6a43db1f-3f53-4fe0-88f6-7a99d4fe11f7"
}
```

```json
{
  "id": "2bcb8244-8ce5-4aea-9f9d-8d36bb1b0a1e",
  "order_id": "af52b68a-d663-4a30-9956-f9654ad55cf5",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5ca98397-023b-4c8c-93ab-8d46f019a9a2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5ca98397-023b-4c8c-93ab-8d46f019a9a2",
  "order_id": "af52b68a-d663-4a30-9956-f9654ad55cf5",
  "assignment_id": "2bcb8244-8ce5-4aea-9f9d-8d36bb1b0a1e",
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
    "phone": "+380679439330"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2851b171-0795-47d7-9b64-e75335850948",
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
  "id": "2b176e5d-12e5-45e5-a339-717957c238c2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:28:30.089343Z",
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
  "command_id": "6c19210d-ecb8-4194-b771-5662b70012ad",
  "quote_id": "2b176e5d-12e5-45e5-a339-717957c238c2",
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
  "id": "3569c849-c4a8-493c-86dc-b3a3326d4fe6",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9477cc45-a3c9-4517-b55e-683fe65cbf5e",
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
  "created_at": "2026-10-28T11:23:30.279028Z",
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
  "command_id": "f1b9c4bc-9859-498c-8f93-ec5f29d07559",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T14:23:30Z"
}
```

```json
{
  "id": "d912fdfe-b9a4-479e-a0be-b0af1f83c2a4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:28:30.491417Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T14:23:30Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "caa93f30-c28d-4ba3-be03-cab005ec393e",
  "quote_id": "d912fdfe-b9a4-479e-a0be-b0af1f83c2a4",
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
  "pickup_at": "2026-10-28T14:23:30Z"
}
```

```json
{
  "id": "a3292c33-710a-4e2c-aa7f-3f16089a9846",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9477cc45-a3c9-4517-b55e-683fe65cbf5e",
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
  "created_at": "2026-10-28T11:23:30.686977Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T14:23:30Z",
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
  "command_id": "4890b4fa-b6d2-4c61-b06d-7bdc6daa8cd2",
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
  "id": "604f2559-ecc1-47a8-b120-355a5f619453",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:28:30.903722Z",
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
  "command_id": "08345c3d-5236-4b01-9c3d-f665a7074a27",
  "quote_id": "604f2559-ecc1-47a8-b120-355a5f619453",
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
  "correlation_id": "8184f1af-9c6a-4e27-aa61-2582f8909531"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "a3292c33-710a-4e2c-aa7f-3f16089a9846",
      "short_number": 14,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "9477cc45-a3c9-4517-b55e-683fe65cbf5e",
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
      "created_at": "2026-10-28T11:23:30.686977Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T14:23:30Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "3569c849-c4a8-493c-86dc-b3a3326d4fe6",
      "short_number": 13,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "9477cc45-a3c9-4517-b55e-683fe65cbf5e",
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
      "created_at": "2026-10-28T11:23:30.279028Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "af52b68a-d663-4a30-9956-f9654ad55cf5",
      "short_number": 12,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "9477cc45-a3c9-4517-b55e-683fe65cbf5e",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "3569c849-c4a8-493c-86dc-b3a3326d4fe6",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9477cc45-a3c9-4517-b55e-683fe65cbf5e",
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
  "created_at": "2026-10-28T11:23:30.279028Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/af52b68a-d663-4a30-9956-f9654ad55cf5` → **200**

```json
{
  "id": "af52b68a-d663-4a30-9956-f9654ad55cf5",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9477cc45-a3c9-4517-b55e-683fe65cbf5e",
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
    "id": "2bcb8244-8ce5-4aea-9f9d-8d36bb1b0a1e",
    "order_id": "af52b68a-d663-4a30-9956-f9654ad55cf5",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "5ca98397-023b-4c8c-93ab-8d46f019a9a2",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T11:23:29.290539Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/af52b68a-d663-4a30-9956-f9654ad55cf5/cancel` → **200**

```json
{
  "command_id": "e2ff58e2-a040-4a86-a578-5355bc7516c0",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "af52b68a-d663-4a30-9956-f9654ad55cf5",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9477cc45-a3c9-4517-b55e-683fe65cbf5e",
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
    "id": "2bcb8244-8ce5-4aea-9f9d-8d36bb1b0a1e",
    "order_id": "af52b68a-d663-4a30-9956-f9654ad55cf5",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "5ca98397-023b-4c8c-93ab-8d46f019a9a2",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T11:23:29.290539Z",
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

`GET /api/rider/v1/orders/3569c849-c4a8-493c-86dc-b3a3326d4fe6` → **200**

```json
{
  "id": "3569c849-c4a8-493c-86dc-b3a3326d4fe6",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9477cc45-a3c9-4517-b55e-683fe65cbf5e",
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
  "created_at": "2026-10-28T11:23:30.279028Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/3569c849-c4a8-493c-86dc-b3a3326d4fe6/cancel` → **200**

```json
{
  "command_id": "28d26233-d69d-457f-8593-a0fcbc8ef099",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3569c849-c4a8-493c-86dc-b3a3326d4fe6",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9477cc45-a3c9-4517-b55e-683fe65cbf5e",
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
  "created_at": "2026-10-28T11:23:30.279028Z",
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

`GET /api/rider/v1/orders/a3292c33-710a-4e2c-aa7f-3f16089a9846` → **200**

```json
{
  "id": "a3292c33-710a-4e2c-aa7f-3f16089a9846",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9477cc45-a3c9-4517-b55e-683fe65cbf5e",
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
  "created_at": "2026-10-28T11:23:30.686977Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T14:23:30Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/a3292c33-710a-4e2c-aa7f-3f16089a9846/cancel` → **200**

```json
{
  "command_id": "9230cf17-8fda-4e46-a93c-8ed29e0c40e9",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a3292c33-710a-4e2c-aa7f-3f16089a9846",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "9477cc45-a3c9-4517-b55e-683fe65cbf5e",
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
  "created_at": "2026-10-28T11:23:30.686977Z",
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
  "pickup_at": "2026-10-28T14:23:30Z",
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
  "session_id": "ee8cff57-2be9-4d2d-bfb9-dc8cccaf2bae",
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
  "last_heartbeat_at": "2026-10-28T11:23:28.518561Z",
  "last_location_at": "2026-10-28T11:23:28.518561Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ee8cff57-2be9-4d2d-bfb9-dc8cccaf2bae/close` → **200**

```json
{
  "command_id": "1f1483d8-75cb-4b76-b2b7-0440db542035",
  "expected_version": 1
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

Done: orders af52b68a-d663-4a30-9956-f9654ad55cf5, 3569c849-c4a8-493c-86dc-b3a3326d4fe6, a3292c33-710a-4e2c-aa7f-3f16089a9846.

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
  "session_id": "58c1be9a-2eb9-45c2-afc4-97018a70e446",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc1MTMsImlhdCI6MTc5MzE4NjYxMywianRpIjoiYjRiZGRlYjctYjZiMS00ZTJiLTk0ZDItZTEwYjBiMWIwY2U3Iiwic2lkIjoiNThjMWJlOWEtMmViOS00NWMyLWFmYzQtOTcwMThhNzBlNDQ2In0.VFK5M_t0AgnQiJdNHmdJDXGbaRMV_C-zQ1cI-68PVJE",
  "access_expires_at": "2026-10-28T11:38:33.459909371Z",
  "refresh_token": "T8FfUSqYRXm4wXFR3xDhJhDkA3_sHbs-S_nhU7rN1vU",
  "refresh_expires_at": "2026-10-28T23:23:33.459550176Z",
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
  "session_id": "ea9d717c-33e1-4e75-a200-b6dd667e1dea",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc1MTMsImlhdCI6MTc5MzE4NjYxMywianRpIjoiYjg0NWEzYjAtNWU4YS00NmJhLTliMjYtZWExNmRiYmY3ZWRiIiwic2lkIjoiZWE5ZDcxN2MtMzNlMS00ZTc1LWEyMDAtYjZkZDY2N2UxZGVhIn0.0JsGPMrn7RltRyJq04TNsUKAyJsG0d6heRmhYdELmc4",
  "access_expires_at": "2026-10-28T11:38:33.895060618Z",
  "refresh_token": "rg32gmnP_rUZHGn_O4Ss6GeRzAcJgcp9isEzYfp9xDw",
  "refresh_expires_at": "2026-10-28T23:23:33.894664748Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-13211"
}
```

```json
{
  "challenge_id": "f9b76957-c8c2-4575-a90c-19809125d437",
  "expires_at": "2026-10-28T11:28:34.068958213Z",
  "resend_available_at": "2026-10-28T11:23:35.068958213Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "765880",
  "sent_at": "2026-10-28T11:23:34.070661111Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f9b76957-c8c2-4575-a90c-19809125d437",
  "code": "765880",
  "device_ref": "sandbox-13211"
}
```

```json
{
  "session_id": "3dbaa5f6-b9e1-41eb-b42f-5cc71fdbfed7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NzUxNCwiaWF0IjoxNzkzMTg2NjE0LCJqdGkiOiJiNjBkODU0My1kNDJiLTQ1ZjUtODhjNC02ZTE5ZDAyMWYzNzAiLCJzaWQiOiIzZGJhYTVmNi1iOWUxLTQxZWItYjQyZi01Y2M3MWZkYmZlZDcifQ.hdsp4iEoUCdggeVwO_R4vSc-UyWmUwAxo_TYCMWghFI",
  "access_expires_at": "2026-10-28T11:38:34.265252884Z",
  "refresh_token": "fp7sdohjc26SSrVKuwLVxuBVprk7Lz7E7o-rU8BbJaw",
  "refresh_expires_at": "2026-11-27T11:23:34.26488157Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1120070b-198b-4d5f-8654-b8a2da53517c",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T11:23:17.066712Z",
  "last_location_at": "2026-10-28T11:23:17.066712Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/1120070b-198b-4d5f-8654-b8a2da53517c/handover` → **200**

```json
{
  "command_id": "5befddae-0652-4f8b-b693-0e8f47dbaf47",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1120070b-198b-4d5f-8654-b8a2da53517c",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T11:23:17.066712Z",
  "last_location_at": "2026-10-28T11:23:17.066712Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/1120070b-198b-4d5f-8654-b8a2da53517c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:23:34Z",
    "sequence": 1793186614814
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1120070b-198b-4d5f-8654-b8a2da53517c",
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
  "last_heartbeat_at": "2026-10-28T11:23:34.830509Z",
  "last_location_at": "2026-10-28T11:23:34.830509Z",
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
  "command_id": "1564c2a8-af34-4b34-91c5-c6b8229b3b07",
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
  "effective_at": "2026-10-28T11:23:35.203848Z",
  "changed_by": "23eabed1-5103-466a-be3b-89bb210931f7",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "23eabed1-5103-466a-be3b-89bb210931f7",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T11:23:35.385102661Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ce21328e-a277-4c8b-8128-fdad0c288992",
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
  "id": "93bf2f11-6dbf-47cb-aadc-6f99235e5968",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:28:35.574562Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 29967,
  "promotions": []
}
```

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "26c4839e-b4c5-4476-9f06-5b55365ca56d",
  "quote_id": "93bf2f11-6dbf-47cb-aadc-6f99235e5968",
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
    "phone": "+380671119873"
  }
}
```

```json
{
  "id": "7bd1d3f8-7d5d-4c9e-83eb-5031a4291b6c",
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
  "created_at": "2026-10-28T11:23:35.769714Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671119873"
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
    "id": "3354b459-0e4b-4091-b780-47da6d94cf00",
    "order_id": "7bd1d3f8-7d5d-4c9e-83eb-5031a4291b6c",
    "expires_at": "2026-10-28T11:23:50.77237Z",
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

`POST /api/driver/v1/offers/3354b459-0e4b-4091-b780-47da6d94cf00/accept` → **200**

```json
{
  "command_id": "d698d012-0546-46d5-a244-2d146bc57ada"
}
```

```json
{
  "id": "707f54bd-6812-4001-af84-c2406564f2e7",
  "order_id": "7bd1d3f8-7d5d-4c9e-83eb-5031a4291b6c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ea2743b3-1f17-4991-a720-bc61cbbcf0a1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ea2743b3-1f17-4991-a720-bc61cbbcf0a1",
  "order_id": "7bd1d3f8-7d5d-4c9e-83eb-5031a4291b6c",
  "assignment_id": "707f54bd-6812-4001-af84-c2406564f2e7",
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
    "phone": "+380671119873"
  }
}
```

`POST /api/driver/v1/work-sessions/1120070b-198b-4d5f-8654-b8a2da53517c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:23:36Z",
    "sequence": 1793186616523
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1120070b-198b-4d5f-8654-b8a2da53517c",
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
  "last_heartbeat_at": "2026-10-28T11:23:36.542038Z",
  "last_location_at": "2026-10-28T11:23:36.542038Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ea2743b3-1f17-4991-a720-bc61cbbcf0a1/arrive` → **200**

```json
{
  "command_id": "5cd6231c-a5ec-41f2-b24a-c01f700ebe59",
  "expected_version": 0
}
```

```json
{
  "id": "ea2743b3-1f17-4991-a720-bc61cbbcf0a1",
  "order_id": "7bd1d3f8-7d5d-4c9e-83eb-5031a4291b6c",
  "assignment_id": "707f54bd-6812-4001-af84-c2406564f2e7",
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
  "arrived_at": "2026-10-28T11:23:36.730728Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671119873"
  }
}
```

`POST /api/driver/v1/trips/ea2743b3-1f17-4991-a720-bc61cbbcf0a1/start` → **200**

```json
{
  "command_id": "e15e2a7b-e130-453f-9aed-baefb43c4dbf",
  "expected_version": 1
}
```

```json
{
  "id": "ea2743b3-1f17-4991-a720-bc61cbbcf0a1",
  "order_id": "7bd1d3f8-7d5d-4c9e-83eb-5031a4291b6c",
  "assignment_id": "707f54bd-6812-4001-af84-c2406564f2e7",
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
  "arrived_at": "2026-10-28T11:23:36.730728Z",
  "started_at": "2026-10-28T11:23:36.92068Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671119873"
  }
}
```

`POST /api/driver/v1/trips/ea2743b3-1f17-4991-a720-bc61cbbcf0a1/complete` → **200**

```json
{
  "command_id": "6dc1c04a-c0eb-408a-8dbc-9902505b8aba",
  "expected_version": 2,
  "reported_at": "2026-10-28T11:23:37Z",
  "cash_received": true
}
```

```json
{
  "id": "ea2743b3-1f17-4991-a720-bc61cbbcf0a1",
  "order_id": "7bd1d3f8-7d5d-4c9e-83eb-5031a4291b6c",
  "assignment_id": "707f54bd-6812-4001-af84-c2406564f2e7",
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
  "arrived_at": "2026-10-28T11:23:36.730728Z",
  "started_at": "2026-10-28T11:23:36.92068Z",
  "completed_at": "2026-10-28T11:23:37.118338Z",
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
  "command_id": "12c6ace6-2614-4562-ad3d-b0dd5ad62236",
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
  "id": "0f2437f3-22b6-4a46-8e15-a2e8cc694bb6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:28:37.313141Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 29967,
  "promotions": []
}
```

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "6f085418-11cc-44c7-a73d-39f2433dbd00",
  "quote_id": "0f2437f3-22b6-4a46-8e15-a2e8cc694bb6",
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
    "phone": "+380671114322"
  }
}
```

```json
{
  "id": "2a2c47d0-c9d1-4c6a-a6d1-532197a7c6d0",
  "short_number": 16,
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
  "created_at": "2026-10-28T11:23:37.513219Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671114322"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/2a2c47d0-c9d1-4c6a-a6d1-532197a7c6d0` → **200**

```json
{
  "id": "2a2c47d0-c9d1-4c6a-a6d1-532197a7c6d0",
  "short_number": 16,
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
  "created_at": "2026-10-28T11:23:37.513219Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671114322"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/2a2c47d0-c9d1-4c6a-a6d1-532197a7c6d0/cancel` → **200**

```json
{
  "command_id": "0a6547d8-a1ea-445d-a981-4562f14b9db9",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "2a2c47d0-c9d1-4c6a-a6d1-532197a7c6d0",
  "short_number": 16,
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
  "created_at": "2026-10-28T11:23:37.513219Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671114322"
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
  "staff_id": "23eabed1-5103-466a-be3b-89bb210931f7",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T11:23:37.121751Z",
  "last_entries": [
    {
      "order_id": "2a2c47d0-c9d1-4c6a-a6d1-532197a7c6d0",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T11:23:37.903426Z"
    },
    {
      "order_id": "7bd1d3f8-7d5d-4c9e-83eb-5031a4291b6c",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T11:23:37.121751Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1120070b-198b-4d5f-8654-b8a2da53517c",
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
  "last_heartbeat_at": "2026-10-28T11:23:36.542038Z",
  "last_location_at": "2026-10-28T11:23:36.542038Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1120070b-198b-4d5f-8654-b8a2da53517c/close` → **200**

```json
{
  "command_id": "c44d1e79-a66f-4f2f-ba43-c72871778188",
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

Done: operator bonus for fulfilled 7bd1d3f8-7d5d-4c9e-83eb-5031a4291b6c and operator-fault cancellation 2a2c47d0-c9d1-4c6a-a6d1-532197a7c6d0.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673554488",
  "device_ref": "sandbox-10572"
}
```

```json
{
  "challenge_id": "5a515289-c6d7-43a0-8698-959ad0582750",
  "expires_at": "2026-10-28T11:28:40.688329301Z",
  "resend_available_at": "2026-10-28T11:23:41.688329301Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673554488` → **200**

```json
{
  "phone": "+380673554488",
  "audience": "CLIENT",
  "code": "898115",
  "sent_at": "2026-10-28T11:23:40.690093349Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675904587",
  "device_ref": "sandbox-28771",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "a5fcf106-9bd3-4f84-b355-aef03844036b",
  "expires_at": "2026-10-28T11:28:40.890750744Z",
  "resend_available_at": "2026-10-28T11:23:41.890750744Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675904587` → **200**

```json
{
  "phone": "+380675904587",
  "audience": "CLIENT",
  "code": "293906",
  "sent_at": "2026-10-28T11:23:40.892367533Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676840000",
  "device_ref": "sandbox-31680"
}
```

```json
{
  "challenge_id": "2bf7a3e2-fc5c-4051-99f3-e7d8c346cedf",
  "expires_at": "2026-10-28T11:28:41.093400848Z",
  "resend_available_at": "2026-10-28T11:23:42.093400848Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676840000` → **200**

```json
{
  "phone": "+380676840000",
  "audience": "CLIENT",
  "code": "698011",
  "sent_at": "2026-10-28T11:23:41.095211245Z",
  "channel": "VOICE"
}
```

## What support sees: the attempts, never the code

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
  "session_id": "582d108f-b51a-4782-a2ba-00709ca5da43",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc1MjEsImlhdCI6MTc5MzE4NjYyMSwianRpIjoiMGZiNTU5MWUtOGI5My00ODQwLThjYzctNjYyNDI2OTc4ZTEyIiwic2lkIjoiNTgyZDEwOGYtYjUxYS00NzgyLWEyYmEtMDA3MDljYTVkYTQzIn0.Zopa0BQ_6HFNexea5TFxRDcXbxf4FzpilHPERwInKVY",
  "access_expires_at": "2026-10-28T11:38:41.505190746Z",
  "refresh_token": "qcamXT1-Vg5eImcbWKHQXVcYDLPzJB8_t0voWY68viQ",
  "refresh_expires_at": "2026-10-28T23:23:41.504807446Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676840000` → **200**

```json
{
  "deliveries": [
    {
      "id": "b2ec4529-4c0e-474e-8f4b-045f165c0510",
      "challenge_id": "2bf7a3e2-fc5c-4051-99f3-e7d8c346cedf",
      "phone": "+380676840000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-ac467c53-aa2c-4d17-8cef-71e0feb237a9",
      "error": null,
      "attempted_at": "2026-10-28T11:23:41.095434Z"
    },
    {
      "id": "472fe5dd-7671-451a-9b46-7c7d480969f4",
      "challenge_id": "2bf7a3e2-fc5c-4051-99f3-e7d8c346cedf",
      "phone": "+380676840000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T11:23:41.094834Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380676840000` → **200**

```json
{
  "phone": "+380676840000",
  "audience": "CLIENT",
  "code": "698011",
  "sent_at": "2026-10-28T11:23:41.095211245Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675904587` → **200**

```json
{
  "deliveries": [
    {
      "id": "bda3220e-36ef-4f2f-98dc-c7493f51aea0",
      "challenge_id": "a5fcf106-9bd3-4f84-b355-aef03844036b",
      "phone": "+380675904587",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-41ba93d1-7c02-4b87-abaf-59611fd9856f",
      "error": null,
      "attempted_at": "2026-10-28T11:23:40.892624Z"
    }
  ]
}
```

Done: SMS to +380673554488, a call to +380675904587, SMS then a call to +380676840000.

# Scenario: outgoing-call

## The admin gives the operator an internal number

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
  "session_id": "1d5e0e37-efaa-43e8-8bc7-603f6995580f",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc1MjIsImlhdCI6MTc5MzE4NjYyMiwianRpIjoiNzAxNjIyYWUtMTljYi00Mjg3LWE1MGUtZDVkMjQ0NmFjZjEyIiwic2lkIjoiMWQ1ZTBlMzctZWZhYS00M2U4LThiYzctNjAzZjY5OTU1ODBmIn0.EdUiNYAuR3g4P191lQb6t4kqcySH3iR__ZgSvIdun28",
  "access_expires_at": "2026-10-28T11:38:42.29891965Z",
  "refresh_token": "I4Oss0W0NZDHyJ4nD3C8-FS59kUBs-RomN-xJ06FpKE",
  "refresh_expires_at": "2026-10-28T23:23:42.298519825Z",
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
  "session_id": "6bd60643-db11-4dd2-94f6-cebf2577ca3d",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc1MjIsImlhdCI6MTc5MzE4NjYyMiwianRpIjoiMDU1NTk1ODgtMWIwNi00OTE0LWEzYjMtYzExOGVmNTA5ZDc4Iiwic2lkIjoiNmJkNjA2NDMtZGIxMS00ZGQyLTk0ZjYtY2ViZjI1NzdjYTNkIn0.ESKeMciwvLEOiDe3nOaG1Un54a5x7gYqTybygCWyHOc",
  "access_expires_at": "2026-10-28T11:38:42.688542176Z",
  "refresh_token": "yaMSH79_JFEQg3T6jbjLzTzFobKngI9HbgAnSwplAZU",
  "refresh_expires_at": "2026-10-28T23:23:42.688186386Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "23eabed1-5103-466a-be3b-89bb210931f7",
    "login": "admin",
    "profile": {
      "first_name": "Super",
      "last_name": "Admin",
      "contacts": {
        "phone": null,
        "email": null,
        "telegram": null
      },
      "role": "SUPER_ADMIN",
      "permissions": [],
      "all_cities": true,
      "city_ids": []
    },
    "state": "ACTIVE",
    "password_change_required": false,
    "version": 0
  },
  "effective_permissions": [
    "orders.create",
    "orders.cancel",
    "orders.reassign",
    "orders.interrupt",
    "orders.view",
    "calls.answer",
    "calls.listen",
    "calls.supervise",
    "driver.review",
    "drivers.risk",
    "geo.manage",
    "pricing.manage",
    "finance.manage",
    "wallets.manage",
    "promotions.manage",
    "support.manage",
    "clients.manage",
    "clients.delete",
    "operator-bonuses.manage",
    "settings.manage",
    "integrations.manage",
    "audit.view",
    "reports.view",
    "legal.manage"
  ]
}
```

`GET /api/admin/v1/staff-extensions` → **200**

```json
{
  "extensions": []
}
```

`POST /api/admin/v1/staff-extensions/23eabed1-5103-466a-be3b-89bb210931f7` → **200**

```json
{
  "command_id": "a646cefb-5dd5-4d14-ab30-9bc0c792561a",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "23eabed1-5103-466a-be3b-89bb210931f7",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "7f157913-96fc-4698-917b-0517f1fe01ba",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T11:23:43.427364Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T11:23:43.427364Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "a15df10e-f706-4ad4-83be-e83eeb2190de",
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
  "id": "59925b81-5e56-43db-bb8c-49e2dc24938b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:28:43.787961Z",
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

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "a965699d-c545-4c6c-babb-49abff8042ef",
  "quote_id": "59925b81-5e56-43db-bb8c-49e2dc24938b",
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
  "caller": {
    "name": "Caller",
    "phone": "+380673848271"
  }
}
```

```json
{
  "id": "a495e72c-4a76-4e61-b816-f257f30f325b",
  "short_number": 17,
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
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T11:23:43.988345Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673848271"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/a495e72c-4a76-4e61-b816-f257f30f325b/calls` → **201**

```json
{
  "command_id": "01bb624a-4881-48be-a46d-e792350662ea",
  "to": "CALLER"
}
```

```json
{
  "id": "0bb88fc4-a0d0-4d79-83cc-26a16c84c080",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "23eabed1-5103-466a-be3b-89bb210931f7",
  "order_ids": [
    "a495e72c-4a76-4e61-b816-f257f30f325b"
  ],
  "started_at": "2026-10-28T11:23:44.195617Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/a495e72c-4a76-4e61-b816-f257f30f325b/calls` → **201**

```json
{
  "command_id": "01bb624a-4881-48be-a46d-e792350662ea",
  "to": "CALLER"
}
```

```json
{
  "id": "0bb88fc4-a0d0-4d79-83cc-26a16c84c080",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "23eabed1-5103-466a-be3b-89bb210931f7",
  "order_ids": [
    "a495e72c-4a76-4e61-b816-f257f30f325b"
  ],
  "started_at": "2026-10-28T11:23:44.195617Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "0bb88fc4-a0d0-4d79-83cc-26a16c84c080",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380673848271",
    "at": "2026-10-28T11:23:44.197217104Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "0bb88fc4-a0d0-4d79-83cc-26a16c84c080",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.8443",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "0bb88fc4-a0d0-4d79-83cc-26a16c84c080"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "0bb88fc4-a0d0-4d79-83cc-26a16c84c080",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=a495e72c-4a76-4e61-b816-f257f30f325b` → **200**

```json
{
  "calls": [
    {
      "id": "0bb88fc4-a0d0-4d79-83cc-26a16c84c080",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "23eabed1-5103-466a-be3b-89bb210931f7",
      "order_ids": [
        "a495e72c-4a76-4e61-b816-f257f30f325b"
      ],
      "started_at": "2026-10-28T11:23:44.195617Z",
      "answered_at": "2026-10-28T11:23:44.625665Z",
      "ended_at": "2026-10-28T11:23:44.643377Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=a495e72c-4a76-4e61-b816-f257f30f325b` → **200**

```json
{
  "calls": [
    {
      "id": "0bb88fc4-a0d0-4d79-83cc-26a16c84c080",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "23eabed1-5103-466a-be3b-89bb210931f7",
      "order_ids": [
        "a495e72c-4a76-4e61-b816-f257f30f325b"
      ],
      "started_at": "2026-10-28T11:23:44.195617Z",
      "answered_at": "2026-10-28T11:23:44.625665Z",
      "ended_at": "2026-10-28T11:23:44.643377Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=a495e72c-4a76-4e61-b816-f257f30f325b` → **200**

```json
{
  "calls": [
    {
      "id": "0bb88fc4-a0d0-4d79-83cc-26a16c84c080",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "23eabed1-5103-466a-be3b-89bb210931f7",
      "order_ids": [
        "a495e72c-4a76-4e61-b816-f257f30f325b"
      ],
      "started_at": "2026-10-28T11:23:44.195617Z",
      "answered_at": "2026-10-28T11:23:44.625665Z",
      "ended_at": "2026-10-28T11:23:44.643377Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=a495e72c-4a76-4e61-b816-f257f30f325b` → **200**

```json
{
  "calls": [
    {
      "id": "0bb88fc4-a0d0-4d79-83cc-26a16c84c080",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "23eabed1-5103-466a-be3b-89bb210931f7",
      "order_ids": [
        "a495e72c-4a76-4e61-b816-f257f30f325b"
      ],
      "started_at": "2026-10-28T11:23:44.195617Z",
      "answered_at": "2026-10-28T11:23:44.625665Z",
      "ended_at": "2026-10-28T11:23:44.643377Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=a495e72c-4a76-4e61-b816-f257f30f325b` → **200**

```json
{
  "calls": [
    {
      "id": "0bb88fc4-a0d0-4d79-83cc-26a16c84c080",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "23eabed1-5103-466a-be3b-89bb210931f7",
      "order_ids": [
        "a495e72c-4a76-4e61-b816-f257f30f325b"
      ],
      "started_at": "2026-10-28T11:23:44.195617Z",
      "answered_at": "2026-10-28T11:23:44.625665Z",
      "ended_at": "2026-10-28T11:23:44.643377Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T11:23:51.340993Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/a495e72c-4a76-4e61-b816-f257f30f325b` → **200**

```json
{
  "id": "a495e72c-4a76-4e61-b816-f257f30f325b",
  "short_number": 17,
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
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T11:23:43.988345Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673848271"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a495e72c-4a76-4e61-b816-f257f30f325b/cancel` → **200**

```json
{
  "command_id": "c39b2f88-c650-4f52-b535-04a035f2ebc5",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "a495e72c-4a76-4e61-b816-f257f30f325b",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
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
  "created_at": "2026-10-28T11:23:43.988345Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673848271"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "64ac4d19-2a9e-46cb-97fd-26fc9894189e",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T11:23:54.04686Z",
  "extension": "101"
}
```

Done: outgoing call 0bb88fc4-a0d0-4d79-83cc-26a16c84c080 from order a495e72c-4a76-4e61-b816-f257f30f325b, recorded.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632437167",
  "device_ref": "sandbox-17883"
}
```

```json
{
  "challenge_id": "482f36c3-9f38-46f5-ae26-bb2dc1fd7bee",
  "expires_at": "2026-10-28T11:28:54.242386661Z",
  "resend_available_at": "2026-10-28T11:23:55.242386661Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632437167` → **200**

```json
{
  "phone": "+380632437167",
  "audience": "CLIENT",
  "code": "353224",
  "sent_at": "2026-10-28T11:23:54.244087617Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "482f36c3-9f38-46f5-ae26-bb2dc1fd7bee",
  "code": "353224",
  "device_ref": "sandbox-17883"
}
```

```json
{
  "session_id": "f2dff480-4cfe-458e-b782-68b29b662925",
  "subject": {
    "type": "CLIENT",
    "id": "e4c46670-32e0-45aa-9db4-abc833cb4e08"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGM0NjY3MC0zMmUwLTQ1YWEtOWRiNC1hYmM4MzNjYjRlMDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg3NTM0LCJpYXQiOjE3OTMxODY2MzQsImp0aSI6IjhmYTQ0NzJkLTUwMmMtNDM2OS05MDMxLTczY2E3OWJkYmM2MSIsInNpZCI6ImYyZGZmNDgwLTRjZmUtNDU4ZS1iNzgyLTY4YjI5YjY2MjkyNSJ9.wAD2ncyb-VD5bjN1CijJxpYJvMzHxHKl7hfHC_8eNbE",
  "access_expires_at": "2026-10-28T11:38:54.44346729Z",
  "refresh_token": "gsh8_jQLVjyt0_s3D88sIoKqaY0BbegO8oZrY_nbi24",
  "refresh_expires_at": "2026-11-27T11:23:54.443102747Z",
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
  "session_id": "6c5bc791-db13-4b0a-863d-c0e80676461d",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc1MzUsImlhdCI6MTc5MzE4NjYzNSwianRpIjoiYWNhOTZhMzYtNGQxNC00MDA1LThmODUtZmU1MGE1N2UwMTc4Iiwic2lkIjoiNmM1YmM3OTEtZGIxMy00YjBhLTg2M2QtYzBlODA2NzY0NjFkIn0.M5GYtG67qOOXAEbhqU1OH0bAaRETccH3AWDDznOfHGE",
  "access_expires_at": "2026-10-28T11:38:55.218580995Z",
  "refresh_token": "o5OoCIOmIw3tVvo87aN6edM7wufbz600KLyVxB4OXqE",
  "refresh_expires_at": "2026-10-28T23:23:55.21807402Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380632437167` → **200**

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
  "correlation_id": "f155ebc9-b56c-40b6-8de9-d7af1d657edb"
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
  "session_id": "707eae83-f002-49e4-9b03-a1dde38a570a",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc1MzUsImlhdCI6MTc5MzE4NjYzNSwianRpIjoiYWVkZjRhZDktMDEyMi00MjVkLWIyODMtZmZhYTA2ZjI1YTk0Iiwic2lkIjoiNzA3ZWFlODMtZjAwMi00OWU0LTliMDMtYTFkZGUzOGE1NzBhIn0.6zOL2X3huBUNrafplclfeVJyXgUFIBYKt2SAQAPZsg4",
  "access_expires_at": "2026-10-28T11:38:55.974712988Z",
  "refresh_token": "mYBtpBqsi9fT4HjznBGEHfzDYYHehF-OHjbntVzj34k",
  "refresh_expires_at": "2026-10-28T23:23:55.974260573Z",
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
  "command_id": "35e3b52e-76c7-4bd0-a9a4-770d32ff7f11",
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
  "changed_by": "23eabed1-5103-466a-be3b-89bb210931f7",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T11:23:56.344059845Z"
}
```

## The rider books the airport for 2026-10-28T14:23:55Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600079171",
  "device_ref": "sandbox-13791"
}
```

```json
{
  "challenge_id": "c5fc0ee4-d080-4719-9cde-602d20bebe08",
  "expires_at": "2026-10-28T11:28:56.530276424Z",
  "resend_available_at": "2026-10-28T11:23:57.530276424Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600079171` → **200**

```json
{
  "phone": "+48600079171",
  "audience": "CLIENT",
  "code": "285214",
  "sent_at": "2026-10-28T11:23:56.532715429Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c5fc0ee4-d080-4719-9cde-602d20bebe08",
  "code": "285214",
  "device_ref": "sandbox-13791"
}
```

```json
{
  "session_id": "83131cde-e398-4290-8c59-11f3d5c5dacc",
  "subject": {
    "type": "CLIENT",
    "id": "8b0186cb-d17a-4b7d-80da-c66e8c5b2fc4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YjAxODZjYi1kMTdhLTRiN2QtODBkYS1jNjZlOGM1YjJmYzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg3NTM2LCJpYXQiOjE3OTMxODY2MzYsImp0aSI6ImU3YzEzZGM2LWI3ZTUtNDg5Mi1hZDg5LWY0M2FlNDJmYTVkMSIsInNpZCI6IjgzMTMxY2RlLWUzOTgtNDI5MC04YzU5LTExZjNkNWM1ZGFjYyJ9.HsIlyLs_3jnhw4_gM4fKqhhdLFZESB-Lnqd1DqnpiEM",
  "access_expires_at": "2026-10-28T11:38:56.731156134Z",
  "refresh_token": "xzeX6vlpd_-YxaH0vN74NQm8xGqYKF3QQbjceWRfQZM",
  "refresh_expires_at": "2026-11-27T11:23:56.730725353Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f2271456-6884-4030-b41b-9ea5de4757c5",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T14:23:55Z"
}
```

```json
{
  "id": "7afd0ebb-733e-414e-9336-57a70ed01c8c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:28:56.911049Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T14:23:55Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "290ba3ca-8ce6-4156-aaae-e0e84d14896f",
  "quote_id": "7afd0ebb-733e-414e-9336-57a70ed01c8c",
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
  "pickup_at": "2026-10-28T14:23:55Z"
}
```

```json
{
  "id": "6fe05dbb-eaf2-40be-99d4-80b46cc8f42e",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8b0186cb-d17a-4b7d-80da-c66e8c5b2fc4",
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
  "created_at": "2026-10-28T11:23:57.101785Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T14:23:55Z",
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
  "device_ref": "sandbox-11657"
}
```

```json
{
  "challenge_id": "467dde52-db09-4117-bb0b-111306c32133",
  "expires_at": "2026-10-28T11:28:57.295275922Z",
  "resend_available_at": "2026-10-28T11:23:58.295275922Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "797186",
  "sent_at": "2026-10-28T11:23:57.296953051Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "467dde52-db09-4117-bb0b-111306c32133",
  "code": "797186",
  "device_ref": "sandbox-11657"
}
```

```json
{
  "session_id": "bdce4ecf-02b0-44d6-b2eb-016df289bc42",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NzUzNywiaWF0IjoxNzkzMTg2NjM3LCJqdGkiOiI1Nzk5YzFjMi1kZjIxLTQ2YzUtOTNiNS02MjE1ZTFmNzRjNjIiLCJzaWQiOiJiZGNlNGVjZi0wMmIwLTQ0ZDYtYjJlYi0wMTZkZjI4OWJjNDIifQ.xC9oO_wfMdoi3bpYXW2d5fZ0Jdjo6FLdJUJBTSUZXBU",
  "access_expires_at": "2026-10-28T11:38:57.496656528Z",
  "refresh_token": "Id-i--ExHTy5OstjDUsnzwor89FuG5EpFpacnLbbtT0",
  "refresh_expires_at": "2026-11-27T11:23:57.496200469Z",
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
  "command_id": "fe9993ef-b816-4d82-be5c-87fd003f3cb2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:23:57Z",
    "sequence": 1793186637874
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "14cb7767-cfa9-4a03-80d1-d6d53fe570e1",
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
  "last_heartbeat_at": "2026-10-28T11:23:57.890601Z",
  "last_location_at": "2026-10-28T11:23:57.890601Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "6fe05dbb-eaf2-40be-99d4-80b46cc8f42e",
      "short_number": 18,
      "pickup_at": "2026-10-28T14:23:55Z",
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

`POST /api/driver/v1/preorders/6fe05dbb-eaf2-40be-99d4-80b46cc8f42e/reserve` → **200**

```json
{
  "command_id": "ffd1367a-7883-4631-9934-303dce4a729f"
}
```

```json
{
  "id": "cfba1f1e-dd12-41ab-aecc-324e19382636",
  "state": "RESERVED",
  "order": {
    "order_id": "6fe05dbb-eaf2-40be-99d4-80b46cc8f42e",
    "short_number": 18,
    "pickup_at": "2026-10-28T14:23:55Z",
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
  "reserved_at": "2026-10-28T11:23:58.263328Z",
  "confirm_from": "2026-10-28T13:53:55Z",
  "confirm_until": "2026-10-28T14:03:55Z",
  "drop_until": "2026-10-28T13:23:55Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "cfba1f1e-dd12-41ab-aecc-324e19382636",
      "state": "RESERVED",
      "order": {
        "order_id": "6fe05dbb-eaf2-40be-99d4-80b46cc8f42e",
        "short_number": 18,
        "pickup_at": "2026-10-28T14:23:55Z",
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
      "reserved_at": "2026-10-28T11:23:58.263328Z",
      "confirm_from": "2026-10-28T13:53:55Z",
      "confirm_until": "2026-10-28T14:03:55Z",
      "drop_until": "2026-10-28T13:23:55Z"
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
      "id": "cfba1f1e-dd12-41ab-aecc-324e19382636",
      "state": "RESERVED",
      "order": {
        "order_id": "6fe05dbb-eaf2-40be-99d4-80b46cc8f42e",
        "short_number": 18,
        "pickup_at": "2026-10-28T14:23:55Z",
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
      "reserved_at": "2026-10-28T11:23:58.263328Z",
      "confirm_from": "2026-10-28T13:53:55Z",
      "confirm_until": "2026-10-28T14:03:55Z",
      "drop_until": "2026-10-28T13:23:55Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/cfba1f1e-dd12-41ab-aecc-324e19382636/confirm` → **409**

```json
{
  "command_id": "3a54a718-5ed0-4475-89fa-56e09afc5876"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/cfba1f1e-dd12-41ab-aecc-324e19382636/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4c8a2564-a113-45ba-b0e3-9825d7072f36"
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
  "session_id": "d3818a67-a817-4969-be90-d4905ec03c75",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc1MzksImlhdCI6MTc5MzE4NjYzOSwianRpIjoiOWMyODE2ODctZWJkMC00ODE2LTgzOTEtMzc2NjkzZjdhODFkIiwic2lkIjoiZDM4MThhNjctYTgxNy00OTY5LWJlOTAtZDQ5MDVlYzAzYzc1In0.7Hti_Y-1QGcc1ZEf4UrmLEC9--n0f1tsOk8bwstGA_g",
  "access_expires_at": "2026-10-28T11:38:59.227102269Z",
  "refresh_token": "grtq0BqPhLRLb0cHyzUq0EhuWvwds3wEz8mkNMXu1-E",
  "refresh_expires_at": "2026-10-28T23:23:59.226643696Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/6fe05dbb-eaf2-40be-99d4-80b46cc8f42e` → **200**

```json
{
  "id": "6fe05dbb-eaf2-40be-99d4-80b46cc8f42e",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "8b0186cb-d17a-4b7d-80da-c66e8c5b2fc4",
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
  "created_at": "2026-10-28T11:23:57.101785Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T14:23:55Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "cfba1f1e-dd12-41ab-aecc-324e19382636",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T11:23:58.263328Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/6fe05dbb-eaf2-40be-99d4-80b46cc8f42e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T11:23:57.102729Z",
      "actor": {
        "type": "CLIENT",
        "id": "8b0186cb-d17a-4b7d-80da-c66e8c5b2fc4",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "6fe05dbb-eaf2-40be-99d4-80b46cc8f42e",
        "preorder": true,
        "quote_id": "7afd0ebb-733e-414e-9336-57a70ed01c8c",
        "pickup_at": "2026-10-28T14:23:55Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "8a8c1af7-3f14-4e6c-b689-121502d079ab"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T11:23:58.264244Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6fe05dbb-eaf2-40be-99d4-80b46cc8f42e",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "cfba1f1e-dd12-41ab-aecc-324e19382636"
      },
      "correlation_id": "5562a243-1e44-4b40-9fe8-0058cbb4db25"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 6fe05dbb-eaf2-40be-99d4-80b46cc8f42e, reservation cfba1f1e-dd12-41ab-aecc-324e19382636.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-20567"
}
```

```json
{
  "challenge_id": "567de4ff-06a9-4919-9b17-df52d88369e8",
  "expires_at": "2026-10-28T11:28:59.793780399Z",
  "resend_available_at": "2026-10-28T11:24:00.793780399Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "028775",
  "sent_at": "2026-10-28T11:23:59.79555271Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "567de4ff-06a9-4919-9b17-df52d88369e8",
  "code": "028775",
  "device_ref": "sandbox-20567"
}
```

```json
{
  "session_id": "32972879-f242-47c5-b39a-0dd74f41649b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NzU0MCwiaWF0IjoxNzkzMTg2NjQwLCJqdGkiOiI5MjM0YmE1Yi04YjRhLTQ3NjMtYjdjZS0zMWNmOGVmZjk2ZGMiLCJzaWQiOiIzMjk3Mjg3OS1mMjQyLTQ3YzUtYjM5YS0wZGQ3NGY0MTY0OWIifQ.3I0Ax-liOuLiTwAwGvE_9NhB8nO_0ybaVPy69Dx5qyE",
  "access_expires_at": "2026-10-28T11:39:00.004521935Z",
  "refresh_token": "MAhxybDH4AiS7baTFVKBxN6-PmYCswpjO62eFFsNAhU",
  "refresh_expires_at": "2026-11-27T11:24:00.004004024Z",
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
  "command_id": "8c47a523-d9e5-4f59-9e56-41bd3f35a05d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:24:00Z",
    "sequence": 1793186640373
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3aa145b4-79b3-4f7e-a4b7-d7ed26204ec2",
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
  "last_heartbeat_at": "2026-10-28T11:24:00.389626Z",
  "last_location_at": "2026-10-28T11:24:00.389626Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671202018",
  "device_ref": "sandbox-32758"
}
```

```json
{
  "challenge_id": "d531dd5c-9857-40d9-be7e-062ae2c44fc4",
  "expires_at": "2026-10-28T11:29:00.578167209Z",
  "resend_available_at": "2026-10-28T11:24:01.578167209Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671202018` → **200**

```json
{
  "phone": "+380671202018",
  "audience": "CLIENT",
  "code": "801577",
  "sent_at": "2026-10-28T11:24:00.579811429Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d531dd5c-9857-40d9-be7e-062ae2c44fc4",
  "code": "801577",
  "device_ref": "sandbox-32758"
}
```

```json
{
  "session_id": "0ed2cd6a-90dc-4f8a-82d2-58cf551acd77",
  "subject": {
    "type": "CLIENT",
    "id": "a815eeb4-8f2f-4e0b-bec5-bac12340c9c0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhODE1ZWViNC04ZjJmLTRlMGItYmVjNS1iYWMxMjM0MGM5YzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg3NTQwLCJpYXQiOjE3OTMxODY2NDAsImp0aSI6IjAzYzU2NTNhLWNkNWUtNDQ3NC04MzI0LTFhMzY0ZWNlODdhMCIsInNpZCI6IjBlZDJjZDZhLTkwZGMtNGY4YS04MmQyLTU4Y2Y1NTFhY2Q3NyJ9.nFPkF-7nQsmQFIor8G2Ml77Hp9GH-mvU96ngN4UMLmQ",
  "access_expires_at": "2026-10-28T11:39:00.78967015Z",
  "refresh_token": "eUWFMxRSRLzUavESqG-iZpiBC0o-oxQdOv9wDQLSyEg",
  "refresh_expires_at": "2026-11-27T11:24:00.789279868Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7cc0b666-28f8-4152-ac34-6703d80458c0",
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
  "id": "17333438-477e-48c6-add6-8a1c9ee52610",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:29:00.979716Z",
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
  "command_id": "6ccc4c57-81d2-450e-ad86-8d4d71e806fd",
  "quote_id": "17333438-477e-48c6-add6-8a1c9ee52610",
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
  "id": "7f715c60-80d8-4b73-a155-bc5c3b7a05eb",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a815eeb4-8f2f-4e0b-bec5-bac12340c9c0",
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
  "created_at": "2026-10-28T11:24:01.211367Z",
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
    "id": "5cabc591-06f9-45c2-ade3-068f3dd8ac08",
    "order_id": "7f715c60-80d8-4b73-a155-bc5c3b7a05eb",
    "expires_at": "2026-10-28T11:24:16.213793Z",
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

`POST /api/driver/v1/offers/5cabc591-06f9-45c2-ade3-068f3dd8ac08/accept` → **200**

```json
{
  "command_id": "bfe5639b-96b4-47d7-bdb1-d198d8ad7218"
}
```

```json
{
  "id": "0ebdf1d1-2cc3-42da-b15b-388330dc5938",
  "order_id": "7f715c60-80d8-4b73-a155-bc5c3b7a05eb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a325ba8f-3f96-45b6-a656-07dbf44e8fb2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a325ba8f-3f96-45b6-a656-07dbf44e8fb2",
  "order_id": "7f715c60-80d8-4b73-a155-bc5c3b7a05eb",
  "assignment_id": "0ebdf1d1-2cc3-42da-b15b-388330dc5938",
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

`POST /api/driver/v1/work-sessions/3aa145b4-79b3-4f7e-a4b7-d7ed26204ec2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:24:01Z",
    "sequence": 1793186641959
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3aa145b4-79b3-4f7e-a4b7-d7ed26204ec2",
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
  "last_heartbeat_at": "2026-10-28T11:24:01.9761Z",
  "last_location_at": "2026-10-28T11:24:01.9761Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a325ba8f-3f96-45b6-a656-07dbf44e8fb2",
  "order_id": "7f715c60-80d8-4b73-a155-bc5c3b7a05eb",
  "assignment_id": "0ebdf1d1-2cc3-42da-b15b-388330dc5938",
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

`POST /api/driver/v1/trips/a325ba8f-3f96-45b6-a656-07dbf44e8fb2/arrive` → **200**

```json
{
  "command_id": "bd83fdfd-687c-4cd5-adc5-49f236ad5acc",
  "expected_version": 0
}
```

```json
{
  "id": "a325ba8f-3f96-45b6-a656-07dbf44e8fb2",
  "order_id": "7f715c60-80d8-4b73-a155-bc5c3b7a05eb",
  "assignment_id": "0ebdf1d1-2cc3-42da-b15b-388330dc5938",
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
  "arrived_at": "2026-10-28T11:24:02.336984Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a325ba8f-3f96-45b6-a656-07dbf44e8fb2/start` → **200**

```json
{
  "command_id": "d3612184-8373-4bd6-a808-cc4f666b09cb",
  "expected_version": 1
}
```

```json
{
  "id": "a325ba8f-3f96-45b6-a656-07dbf44e8fb2",
  "order_id": "7f715c60-80d8-4b73-a155-bc5c3b7a05eb",
  "assignment_id": "0ebdf1d1-2cc3-42da-b15b-388330dc5938",
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
  "arrived_at": "2026-10-28T11:24:02.336984Z",
  "started_at": "2026-10-28T11:24:02.525533Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/3aa145b4-79b3-4f7e-a4b7-d7ed26204ec2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:24:02Z",
    "sequence": 1793186642702
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3aa145b4-79b3-4f7e-a4b7-d7ed26204ec2",
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
  "last_heartbeat_at": "2026-10-28T11:24:02.718823Z",
  "last_location_at": "2026-10-28T11:24:02.718823Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/a325ba8f-3f96-45b6-a656-07dbf44e8fb2/complete` → **200**

```json
{
  "command_id": "daf12237-270e-40f3-850d-6d2096d553ea",
  "expected_version": 2,
  "reported_at": "2026-10-28T11:24:02Z",
  "cash_received": true
}
```

```json
{
  "id": "a325ba8f-3f96-45b6-a656-07dbf44e8fb2",
  "order_id": "7f715c60-80d8-4b73-a155-bc5c3b7a05eb",
  "assignment_id": "0ebdf1d1-2cc3-42da-b15b-388330dc5938",
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
  "arrived_at": "2026-10-28T11:24:02.336984Z",
  "started_at": "2026-10-28T11:24:02.525533Z",
  "completed_at": "2026-10-28T11:24:02.905999Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/7f715c60-80d8-4b73-a155-bc5c3b7a05eb/rating` → **200**

```json
{
  "command_id": "a9a4b6ce-ad29-42a8-9847-c10e5ef76819",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "7f715c60-80d8-4b73-a155-bc5c3b7a05eb",
  "score": 5,
  "created_at": "2026-10-28T11:24:03.104885501Z"
}
```

`POST /api/driver/v1/orders/7f715c60-80d8-4b73-a155-bc5c3b7a05eb/rating` → **200**

```json
{
  "command_id": "b3d23a5e-8ead-40c6-8604-1ce6cb8f4584",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "7f715c60-80d8-4b73-a155-bc5c3b7a05eb",
  "score": 4,
  "created_at": "2026-10-28T11:24:03.289420133Z"
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
  "session_id": "793e3321-8ce1-4aa4-ac26-6c537134342e",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc1NDMsImlhdCI6MTc5MzE4NjY0MywianRpIjoiY2JmODMzMWYtNDFhOC00NDJkLTg4YzgtOWQxY2M5NDFlNDIzIiwic2lkIjoiNzkzZTMzMjEtOGNlMS00YWE0LWFjMjYtNmM1MzcxMzQzNDJlIn0.v-D81rmScDOD0_Rjquahaiu5Re_Ub6ep30FHR-3ZMEg",
  "access_expires_at": "2026-10-28T11:39:03.861245795Z",
  "refresh_token": "-QOpySoXaK-3t_-7oR-dAVTZhuHHHH6g2FeTq64wATs",
  "refresh_expires_at": "2026-10-28T23:24:03.860878669Z",
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
  "session_id": "a3e8ccee-f707-49fe-9574-45a34fc9c459",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc1NDQsImlhdCI6MTc5MzE4NjY0NCwianRpIjoiMjA3ZWRkN2MtN2M1Mi00MGExLWJkMGQtYmFjYzg2YzljNTEzIiwic2lkIjoiYTNlOGNjZWUtZjcwNy00OWZlLTk1NzQtNDVhMzRmYzljNDU5In0.5UdORyO1G68fmNC_QfhdrrNNYES5DTU1ZppMvgWxIVo",
  "access_expires_at": "2026-10-28T11:39:04.246422874Z",
  "refresh_token": "zU4BWXz7-US6ra-2jPYFNn8Np48d2A0p2JoEzxeg1TE",
  "refresh_expires_at": "2026-10-28T23:24:04.246078691Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/7f715c60-80d8-4b73-a155-bc5c3b7a05eb/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "7f715c60-80d8-4b73-a155-bc5c3b7a05eb",
      "author_type": "RIDER",
      "author_id": "a815eeb4-8f2f-4e0b-bec5-bac12340c9c0",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T11:24:03.104886Z"
    },
    {
      "order_id": "7f715c60-80d8-4b73-a155-bc5c3b7a05eb",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "a815eeb4-8f2f-4e0b-bec5-bac12340c9c0",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T11:24:03.28942Z"
    }
  ]
}
```

Done: ratings for order 7f715c60-80d8-4b73-a155-bc5c3b7a05eb.

# Scenario: report-export

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
  "session_id": "fa3b887e-b4e8-44ab-b07f-68ab31f2e024",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc1NDQsImlhdCI6MTc5MzE4NjY0NCwianRpIjoiM2VhODQ0MzMtMmRjNy00M2Y3LWIwNjUtOGE4NjkyYjZmNzkyIiwic2lkIjoiZmEzYjg4N2UtYjRlOC00NGFiLWIwN2YtNjhhYjMxZjJlMDI0In0.DRmBKKo7IK1kzmwuN3-a8MAaTmMKQwYXqWu3v5aBR8w",
  "access_expires_at": "2026-10-28T11:39:04.832594415Z",
  "refresh_token": "O6sf_poY1pkO8TjDhTrAzYygh9s_B_UGkaxNviW7nDA",
  "refresh_expires_at": "2026-10-28T23:24:04.832125656Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "97728218-9b19-47ae-a720-295bd972664c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "6039585a-7dac-4de4-b3a5-7d50e6acc8bf",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T11:24:05.02137Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6039585a-7dac-4de4-b3a5-7d50e6acc8bf` → **200**

```json
{
  "id": "6039585a-7dac-4de4-b3a5-7d50e6acc8bf",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T11:24:05.02137Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6039585a-7dac-4de4-b3a5-7d50e6acc8bf` → **200**

```json
{
  "id": "6039585a-7dac-4de4-b3a5-7d50e6acc8bf",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T11:24:05.02137Z",
  "ready_at": "2026-10-28T11:24:06.3604Z",
  "expires_at": "2026-10-29T11:24:06.3604Z"
}
```

`GET /api/admin/v1/reports/exports/6039585a-7dac-4de4-b3a5-7d50e6acc8bf/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
total,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "ec5e0559-90c4-4b6c-a288-6b8b5b810ba8",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "577f36c3-83a4-44b2-b00b-659c72dce338",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T11:24:06.606959Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/577f36c3-83a4-44b2-b00b-659c72dce338` → **200**

```json
{
  "id": "577f36c3-83a4-44b2-b00b-659c72dce338",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T11:24:06.606959Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/577f36c3-83a4-44b2-b00b-659c72dce338` → **200**

```json
{
  "id": "577f36c3-83a4-44b2-b00b-659c72dce338",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T11:24:06.606959Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/577f36c3-83a4-44b2-b00b-659c72dce338` → **200**

```json
{
  "id": "577f36c3-83a4-44b2-b00b-659c72dce338",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T11:24:06.606959Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/577f36c3-83a4-44b2-b00b-659c72dce338` → **200**

```json
{
  "id": "577f36c3-83a4-44b2-b00b-659c72dce338",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T11:24:06.606959Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/577f36c3-83a4-44b2-b00b-659c72dce338` → **200**

```json
{
  "id": "577f36c3-83a4-44b2-b00b-659c72dce338",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T11:24:06.606959Z",
  "ready_at": "2026-10-28T11:24:11.366578Z",
  "expires_at": "2026-10-29T11:24:11.366578Z"
}
```

`GET /api/admin/v1/reports/exports/577f36c3-83a4-44b2-b00b-659c72dce338/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/b639471e-a17c-4c62-8112-439de8b9e8ec` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/b639471e-a17c-4c62-8112-439de8b9e8ec",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "07ea8926-dee6-4fe2-9388-00cd9c74cfd0"
}
```

Done: both reports were built in the background and downloaded.

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-13804"
}
```

```json
{
  "challenge_id": "ea7363c1-08f9-4e82-a95a-8476d95a48de",
  "expires_at": "2026-10-28T11:29:11.918594563Z",
  "resend_available_at": "2026-10-28T11:24:12.918594563Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "578153",
  "sent_at": "2026-10-28T11:24:11.920394104Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ea7363c1-08f9-4e82-a95a-8476d95a48de",
  "code": "578153",
  "device_ref": "sandbox-13804"
}
```

```json
{
  "session_id": "8740bd29-8127-43f4-a1ff-739f0c671b90",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NzU1MiwiaWF0IjoxNzkzMTg2NjUyLCJqdGkiOiJkZTNmMTRlMS1hZGNmLTQ3NGQtYWVlOS00N2FiZjk3MDQ4NjciLCJzaWQiOiI4NzQwYmQyOS04MTI3LTQzZjQtYTFmZi03MzlmMGM2NzFiOTAifQ.NvE_Q1Qfymd6nx4qQv9xWWxZGzqmSmeWjGggcpdkCv0",
  "access_expires_at": "2026-10-28T11:39:12.123544852Z",
  "refresh_token": "FztDdyuELw8atpIowzwJG5QN1_wbd6LQSCpp9Iq8T8I",
  "refresh_expires_at": "2026-11-27T11:24:12.123152338Z",
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
  "command_id": "bf38d331-4fe9-41bf-93d8-3fe6d284b5a0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:24:12Z",
    "sequence": 1793186652658
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7bb40ae0-9704-40ad-843e-935c6fd52d97",
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
  "last_heartbeat_at": "2026-10-28T11:24:12.673863Z",
  "last_location_at": "2026-10-28T11:24:12.673863Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "489f0b5c-8cd2-4dc5-a880-c6ece63bfa90",
  "points": [
    {
      "sequence": 1793186654858,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T11:23:14Z"
    },
    {
      "sequence": 1793186654864,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T11:24:14Z"
    }
  ]
}
```

```json
{
  "accepted": 2,
  "duplicates": 0,
  "flagged": 1
}
```

## Support finds one open flag — the driver is still approved

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
  "session_id": "f6203bda-c329-400c-90de-b5bfd3c8ca89",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc1NTUsImlhdCI6MTc5MzE4NjY1NSwianRpIjoiMWQwZDkxZmMtY2IzMy00MmYwLWJjZDItZGRmNmEzYzg1ZmMwIiwic2lkIjoiZjYyMDNiZGEtYzMyOS00MDBjLTkwZGUtYjViZmQzYzhjYTg5In0.tGgCF_KuQDwJ_SuPJNfCLIoO-ZmMEyUjCuBqFesQLAI",
  "access_expires_at": "2026-10-28T11:39:15.29875102Z",
  "refresh_token": "Tah8BInpACcfaSgZ3eaidS8J5rKiGBk-qVKc35nW4Ys",
  "refresh_expires_at": "2026-10-28T23:24:15.298221741Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "079e2b1f-096e-488f-b3ce-1c009939773e",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T11:24:14Z",
        "track_point_id": "f8a689dc-35ac-4b11-9dad-f2fee63f4d17",
        "work_session_id": "7bb40ae0-9704-40ad-843e-935c6fd52d97"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T11:24:14Z",
      "reason": null,
      "reviewed_by": null,
      "reviewed_at": null,
      "review_reason": null,
      "version": 1
    }
  ]
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
    "version": 4,
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

## Support confirms it with a reason — once

`POST /api/admin/v1/driver-risk-flags/079e2b1f-096e-488f-b3ce-1c009939773e/confirm` → **200**

```json
{
  "command_id": "f06cdbca-8a37-4ffe-8c5b-6fa78103dae7",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "079e2b1f-096e-488f-b3ce-1c009939773e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T11:24:14Z",
    "track_point_id": "f8a689dc-35ac-4b11-9dad-f2fee63f4d17",
    "work_session_id": "7bb40ae0-9704-40ad-843e-935c6fd52d97"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T11:24:14Z",
  "reason": null,
  "reviewed_by": "23eabed1-5103-466a-be3b-89bb210931f7",
  "reviewed_at": "2026-10-28T11:24:15.913008Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/079e2b1f-096e-488f-b3ce-1c009939773e/dismiss` → **409**

```json
{
  "command_id": "6a8dfc11-cbd7-46db-b0de-74d85be324e4",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/079e2b1f-096e-488f-b3ce-1c009939773e/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ebc502bb-21b6-4d77-8f0a-99ed1043259c"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "f51e1039-da3e-4390-bda8-2b28080c66f4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "041ce163-8050-471a-ae2e-9716190eb9f8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "23eabed1-5103-466a-be3b-89bb210931f7",
  "raised_at": "2026-10-28T11:24:16.323815Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/041ce163-8050-471a-ae2e-9716190eb9f8/dismiss` → **200**

```json
{
  "command_id": "711e6642-a7f9-46c1-8cb4-33750dcfd94e",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "041ce163-8050-471a-ae2e-9716190eb9f8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "23eabed1-5103-466a-be3b-89bb210931f7",
  "raised_at": "2026-10-28T11:24:16.323815Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "23eabed1-5103-466a-be3b-89bb210931f7",
  "reviewed_at": "2026-10-28T11:24:16.520054Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "e5ffb667-a0f2-4d22-9218-032b58b988a9",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "079e2b1f-096e-488f-b3ce-1c009939773e"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "SUSPENDED",
  "version": 5,
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
    "review_status": "SUSPENDED",
    "version": 5,
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
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "23eabed1-5103-466a-be3b-89bb210931f7",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T11:24:16.718567Z"
    }
  ]
}
```

Done: flag 079e2b1f-096e-488f-b3ce-1c009939773e confirmed, suspension named it, driver reinstated.

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
  "session_id": "7216dc4e-e61c-43eb-baf3-203089b52a24",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc1NTcsImlhdCI6MTc5MzE4NjY1NywianRpIjoiMWE1Mjk1ZjQtYmJlYy00ZGRiLWJjMmQtMDEzODZjYjU2YjI1Iiwic2lkIjoiNzIxNmRjNGUtZTYxYy00M2ViLWJhZjMtMjAzMDg5YjUyYTI0In0.116TnayqkW0EGqehrNX7dE-oBPcI-ISGQaf3uUeLbQg",
  "access_expires_at": "2026-10-28T11:39:17.296978337Z",
  "refresh_token": "Q_chHmCwGDJfs-ExbET2LDNFk7rSUYyXBs3pADCp2w8",
  "refresh_expires_at": "2026-10-28T23:24:17.296578561Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "SUSPENDED",
    "version": 5,
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
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "23eabed1-5103-466a-be3b-89bb210931f7",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T11:24:16.718567Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "80ab8df4-7fd7-4f57-8e2d-d037607d132d",
  "expected_version": 5,
  "reason": "Sandbox clean-up"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 6,
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7bb40ae0-9704-40ad-843e-935c6fd52d97",
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
  "last_heartbeat_at": "2026-10-28T11:24:12.673863Z",
  "last_location_at": "2026-10-28T11:24:12.673863Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7bb40ae0-9704-40ad-843e-935c6fd52d97/close` → **200**

```json
{
  "command_id": "38db34c0-67db-4ebb-bfa7-1c1d651b5263",
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
  "session_id": "8a6cbd9e-3844-420e-9022-ae87a9667ae0",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc1NTgsImlhdCI6MTc5MzE4NjY1OCwianRpIjoiYTBhMWI5NjItZTM1NS00ZjQ3LWE4NTQtMzBlNDI2NTZmZDZlIiwic2lkIjoiOGE2Y2JkOWUtMzg0NC00MjBlLTkwMjItYWU4N2E5NjY3YWUwIn0.9j8uLb_RgQNwAipiBvSns9zC7Vu9hSq53XLCygH7104",
  "access_expires_at": "2026-10-28T11:39:18.522948176Z",
  "refresh_token": "TacQ1Hyb56TuHqNk13_WTWMyOsLC02PT7t3bIzOLT68",
  "refresh_expires_at": "2026-10-28T23:24:18.52254848Z",
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
  "command_id": "642c9dd0-6a32-4e1f-a551-68adb06bba92",
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
  "changed_by": "23eabed1-5103-466a-be3b-89bb210931f7",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T11:24:18.89218Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "642c9dd0-6a32-4e1f-a551-68adb06bba92",
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
  "changed_by": "23eabed1-5103-466a-be3b-89bb210931f7",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T11:24:18.89218Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48066869551",
  "device_ref": "sandbox-3942"
}
```

```json
{
  "challenge_id": "b6f7472a-5119-4966-9cf4-76652af60645",
  "expires_at": "2026-10-28T11:29:19.264865215Z",
  "resend_available_at": "2026-10-28T11:24:20.264865215Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48066869551` → **200**

```json
{
  "phone": "+48066869551",
  "audience": "CLIENT",
  "code": "045345",
  "sent_at": "2026-10-28T11:24:19.266588994Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b6f7472a-5119-4966-9cf4-76652af60645",
  "code": "045345",
  "device_ref": "sandbox-3942"
}
```

```json
{
  "session_id": "0b2b5941-2fdf-4b8b-bdc0-49c2f976f482",
  "subject": {
    "type": "CLIENT",
    "id": "044b7173-bbe9-45e8-a827-d2f326d47d99"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNDRiNzE3My1iYmU5LTQ1ZTgtYTgyNy1kMmYzMjZkNDdkOTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg3NTU5LCJpYXQiOjE3OTMxODY2NTksImp0aSI6IjM4MmIxZDg4LTg3YTgtNGIwOS04NDkzLWZhYTRiZDE3NDJhNiIsInNpZCI6IjBiMmI1OTQxLTJmZGYtNGI4Yi1iZGMwLTQ5YzJmOTc2ZjQ4MiJ9.TUvbxldo5KSy554CnwHO80Nk8f-DjwUUqmYpXoA46dA",
  "access_expires_at": "2026-10-28T11:39:19.476709399Z",
  "refresh_token": "7wcQJXXKLScL1E49oN0CW16OdMgBHLHRBub_ov_7TCY",
  "refresh_expires_at": "2026-11-27T11:24:19.476380969Z",
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
  "correlation_id": "32681ac7-2403-4c16-b5c4-c421d6364a0b"
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
  "device_ref": "sandbox-20401"
}
```

```json
{
  "challenge_id": "cb1f22f2-dcf5-4a58-b555-fae7cb32a3fd",
  "expires_at": "2026-10-28T11:29:20.047644952Z",
  "resend_available_at": "2026-10-28T11:24:21.047644952Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "285264",
  "sent_at": "2026-10-28T11:24:20.04961Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cb1f22f2-dcf5-4a58-b555-fae7cb32a3fd",
  "code": "285264",
  "device_ref": "sandbox-20401"
}
```

```json
{
  "session_id": "f7e49f25-e3ab-497b-88ff-890ab12f4877",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NzU2MCwiaWF0IjoxNzkzMTg2NjYwLCJqdGkiOiI3YTY5ZGRlYS1jOWQ3LTQ2YjUtYjQzMi0yNzIxY2Q2ZmNjYTQiLCJzaWQiOiJmN2U0OWYyNS1lM2FiLTQ5N2ItODhmZi04OTBhYjEyZjQ4NzcifQ.s2rBGn00Ettx1pzOrvp91XAwc2XgVnX9-F3VDJcTRwQ",
  "access_expires_at": "2026-10-28T11:39:20.252235556Z",
  "refresh_token": "HfuzxFOCVYe5PdF6cYgxxz6zWcNXMixV_r4D86bm55o",
  "refresh_expires_at": "2026-11-27T11:24:20.251840497Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "14cb7767-cfa9-4a03-80d1-d6d53fe570e1",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-28T11:23:57.890601Z",
  "last_location_at": "2026-10-28T11:23:57.890601Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/14cb7767-cfa9-4a03-80d1-d6d53fe570e1/handover` → **200**

```json
{
  "command_id": "82fbbeab-43ee-46f0-b61d-953a33b6f3e5",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "14cb7767-cfa9-4a03-80d1-d6d53fe570e1",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-28T11:23:57.890601Z",
  "last_location_at": "2026-10-28T11:23:57.890601Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/14cb7767-cfa9-4a03-80d1-d6d53fe570e1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:24:20Z",
    "sequence": 1793186660800
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "14cb7767-cfa9-4a03-80d1-d6d53fe570e1",
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
  "last_heartbeat_at": "2026-10-28T11:24:20.817284Z",
  "last_location_at": "2026-10-28T11:24:20.817284Z",
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
  "session_id": "14cb7767-cfa9-4a03-80d1-d6d53fe570e1",
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
  "last_heartbeat_at": "2026-10-28T11:24:20.817284Z",
  "last_location_at": "2026-10-28T11:24:20.817284Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/14cb7767-cfa9-4a03-80d1-d6d53fe570e1/close` → **200**

```json
{
  "command_id": "47289aa0-9588-4ff5-886a-67a5818a138a",
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
  "correlation_id": "b2b657cc-fddc-421f-9993-d75ff3cd5358"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673143496",
  "device_ref": "sandbox-12113"
}
```

```json
{
  "challenge_id": "de5f392e-d83d-4400-a90e-0c0fb1e940df",
  "expires_at": "2026-10-28T11:29:21.72231886Z",
  "resend_available_at": "2026-10-28T11:24:22.72231886Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673143496` → **200**

```json
{
  "phone": "+380673143496",
  "audience": "CLIENT",
  "code": "901840",
  "sent_at": "2026-10-28T11:24:21.72416344Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "de5f392e-d83d-4400-a90e-0c0fb1e940df",
  "code": "901840",
  "device_ref": "sandbox-12113"
}
```

```json
{
  "session_id": "ee205be9-e066-4beb-8261-db7b290b2319",
  "subject": {
    "type": "CLIENT",
    "id": "6b9ba27e-4d4d-494b-b709-e119baf53f07"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YjliYTI3ZS00ZDRkLTQ5NGItYjcwOS1lMTE5YmFmNTNmMDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg3NTYxLCJpYXQiOjE3OTMxODY2NjEsImp0aSI6IjBiZTMxMDI0LTVkMjktNDhkZi05OThmLTQ1MjgzMTFmNjZjZCIsInNpZCI6ImVlMjA1YmU5LWUwNjYtNGJlYi04MjYxLWRiN2IyOTBiMjMxOSJ9.A4WxJGBcJyTAQVNGt8fw1FZq6oA70NnXWUbta9xpi0Q",
  "access_expires_at": "2026-10-28T11:39:21.927344402Z",
  "refresh_token": "Bi4JYQu3hKqU2UjaGJSt-PL_uXW61Y1IqIdQPhRGc0c",
  "refresh_expires_at": "2026-11-27T11:24:21.926967961Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "1d422a74-435c-4b20-bbc0-ea69a8022a59",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "6c295395-3e29-4272-bdbf-0b48f5826ccc",
  "upload_path": "/api/rider/v1/uploads/6c295395-3e29-4272-bdbf-0b48f5826ccc",
  "expires_at": "2026-10-28T11:39:22.114871617Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/6c295395-3e29-4272-bdbf-0b48f5826ccc` → **200**

```json
{
  "file_id": "6c295395-3e29-4272-bdbf-0b48f5826ccc",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "78a06ee7-019b-489c-a302-e5a1e94593c2",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "6c295395-3e29-4272-bdbf-0b48f5826ccc"
  ]
}
```

```json
{
  "id": "8dc3ba34-b22c-46d5-abe5-b681f843df3d",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "6b9ba27e-4d4d-494b-b709-e119baf53f07",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T11:24:22.332453Z",
  "updated_at": "2026-10-28T11:24:22.332453Z",
  "messages": [
    {
      "id": "e01aef0b-566a-41d2-9e3e-86920bae7f3d",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "6b9ba27e-4d4d-494b-b709-e119baf53f07",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T11:24:22.333634Z",
      "attachments": [
        {
          "file_id": "6c295395-3e29-4272-bdbf-0b48f5826ccc",
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
  "session_id": "f09849de-ddaf-4283-b48b-4f8d413382c2",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc1NjIsImlhdCI6MTc5MzE4NjY2MiwianRpIjoiNzliOTgzMTAtYTIxZi00MGQzLWFiMWEtNzRjNTBkOWVjZDJlIiwic2lkIjoiZjA5ODQ5ZGUtZGRhZi00MjgzLWI0OGItNGY4ZDQxMzM4MmMyIn0.azgBTmApl6uhzC9ilb-z8hf83DTEJiZa7Qq72phSXsM",
  "access_expires_at": "2026-10-28T11:39:22.739123838Z",
  "refresh_token": "ETvxyTsYxxFAIe_gt4sk3upKauckafRHolLbK2OEnac",
  "refresh_expires_at": "2026-10-28T23:24:22.738737893Z",
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
  "session_id": "62814c8f-ff14-46fd-94a2-f44a7354477a",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc1NjMsImlhdCI6MTc5MzE4NjY2MywianRpIjoiYWY4ZTMwNDAtOWM5ZS00NmE0LWEwOGItZTNhMmY4ZGJkY2FhIiwic2lkIjoiNjI4MTRjOGYtZmYxNC00NmZkLTk0YTItZjQ0YTczNTQ0NzdhIn0.Qxyl7CDiKA8z5Vh_WBS9Z4_Opa-djWkXa2LxBn-1hxg",
  "access_expires_at": "2026-10-28T11:39:23.129132834Z",
  "refresh_token": "9z-7lxunnaXu_rjcW3bkpg54ruVwg2NOUzzF09ozric",
  "refresh_expires_at": "2026-10-28T23:24:23.128755331Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/8dc3ba34-b22c-46d5-abe5-b681f843df3d/attachments/6c295395-3e29-4272-bdbf-0b48f5826ccc` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "ebb5bf94-bc0b-41b8-99c0-5872cb1d6814",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "a9603966-11f9-491c-b42e-fa32390eacb4",
  "upload_path": "/api/operator/v1/uploads/a9603966-11f9-491c-b42e-fa32390eacb4",
  "expires_at": "2026-10-28T11:39:23.33625437Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/a9603966-11f9-491c-b42e-fa32390eacb4` → **200**

```json
{
  "file_id": "a9603966-11f9-491c-b42e-fa32390eacb4",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/8dc3ba34-b22c-46d5-abe5-b681f843df3d` → **200**

```json
{
  "id": "8dc3ba34-b22c-46d5-abe5-b681f843df3d",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "6b9ba27e-4d4d-494b-b709-e119baf53f07",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T11:24:22.332453Z",
  "updated_at": "2026-10-28T11:24:22.332453Z",
  "messages": [
    {
      "id": "e01aef0b-566a-41d2-9e3e-86920bae7f3d",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "6b9ba27e-4d4d-494b-b709-e119baf53f07",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T11:24:22.333634Z",
      "attachments": [
        {
          "file_id": "6c295395-3e29-4272-bdbf-0b48f5826ccc",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/8dc3ba34-b22c-46d5-abe5-b681f843df3d/comments` → **200**

```json
{
  "command_id": "b261144f-3580-485b-ba2f-5f8c6bb89f1d",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "a9603966-11f9-491c-b42e-fa32390eacb4"
  ]
}
```

```json
{
  "id": "8dc3ba34-b22c-46d5-abe5-b681f843df3d",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "6b9ba27e-4d4d-494b-b709-e119baf53f07",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T11:24:22.332453Z",
  "updated_at": "2026-10-28T11:24:23.746937Z",
  "messages": [
    {
      "id": "e01aef0b-566a-41d2-9e3e-86920bae7f3d",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "6b9ba27e-4d4d-494b-b709-e119baf53f07",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T11:24:22.333634Z",
      "attachments": [
        {
          "file_id": "6c295395-3e29-4272-bdbf-0b48f5826ccc",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "443dddbb-d0d4-4a1e-ac04-b0baef04c395",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "23eabed1-5103-466a-be3b-89bb210931f7",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T11:24:23.746613Z",
      "attachments": [
        {
          "file_id": "a9603966-11f9-491c-b42e-fa32390eacb4",
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

`GET /api/rider/v1/support/cases/8dc3ba34-b22c-46d5-abe5-b681f843df3d` → **200**

```json
{
  "id": "8dc3ba34-b22c-46d5-abe5-b681f843df3d",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "6b9ba27e-4d4d-494b-b709-e119baf53f07",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T11:24:22.332453Z",
  "updated_at": "2026-10-28T11:24:23.746937Z",
  "messages": [
    {
      "id": "e01aef0b-566a-41d2-9e3e-86920bae7f3d",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "6b9ba27e-4d4d-494b-b709-e119baf53f07",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T11:24:22.333634Z",
      "attachments": [
        {
          "file_id": "6c295395-3e29-4272-bdbf-0b48f5826ccc",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "443dddbb-d0d4-4a1e-ac04-b0baef04c395",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T11:24:23.746613Z",
      "attachments": [
        {
          "file_id": "a9603966-11f9-491c-b42e-fa32390eacb4",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/8dc3ba34-b22c-46d5-abe5-b681f843df3d/attachments/a9603966-11f9-491c-b42e-fa32390eacb4` → **200**

Done: support case 8dc3ba34-b22c-46d5-abe5-b681f843df3d, rider attachment 6c295395-3e29-4272-bdbf-0b48f5826ccc, operator attachment a9603966-11f9-491c-b42e-fa32390eacb4.

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
  "session_id": "5065d704-b612-4756-b6e9-e07aad77716a",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc1NjQsImlhdCI6MTc5MzE4NjY2NCwianRpIjoiZWJhMWNkZjgtY2MyNS00NjcxLTk4YWQtNDc1OGQ5MDQ5N2FjIiwic2lkIjoiNTA2NWQ3MDQtYjYxMi00NzU2LWI2ZTktZTA3YWFkNzc3MTZhIn0.RsGfSJHZ-h30SfdgTqdjUA8S4nHVDZUwEjs63tJ6tRc",
  "access_expires_at": "2026-10-28T11:39:24.349216531Z",
  "refresh_token": "UIKnwM26My7YFBht8pbPR9UE4eSBzhgAUlbcr9hdh40",
  "refresh_expires_at": "2026-10-28T23:24:24.348732248Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-28676"
}
```

```json
{
  "challenge_id": "4e9d9d5b-e4a5-4d86-ba41-796b935f89cf",
  "expires_at": "2026-10-28T11:29:24.521102955Z",
  "resend_available_at": "2026-10-28T11:24:25.521102955Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "121654",
  "sent_at": "2026-10-28T11:24:24.522870379Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4e9d9d5b-e4a5-4d86-ba41-796b935f89cf",
  "code": "121654",
  "device_ref": "sandbox-28676"
}
```

```json
{
  "session_id": "7007a370-9525-42de-9b40-2e234e9594ad",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NzU2NCwiaWF0IjoxNzkzMTg2NjY0LCJqdGkiOiI1Y2I2MzIyYy00NmY3LTQ2MjYtOTM3Ni1mYjkzZmZmYmE2NjciLCJzaWQiOiI3MDA3YTM3MC05NTI1LTQyZGUtOWI0MC0yZTIzNGU5NTk0YWQifQ.N7NDz6p1ebITVeRHINPggKZe5kDMHCuQvxPrzgdYuwY",
  "access_expires_at": "2026-10-28T11:39:24.721928348Z",
  "refresh_token": "XiqXxHmHj3jwArTvcFyAXKVnG3sDs-e5Z223jKhQNZQ",
  "refresh_expires_at": "2026-11-27T11:24:24.721459469Z",
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
  "version": 7,
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
    "version": 7,
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
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "23eabed1-5103-466a-be3b-89bb210931f7",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T11:24:16.718567Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "23eabed1-5103-466a-be3b-89bb210931f7",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T11:24:17.741174Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "b59a000f-5083-4623-a792-f07548794bd7",
  "expected_version": 7,
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
  "version": 8,
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
  "device_ref": "sandbox-17584"
}
```

```json
{
  "challenge_id": "72dcbadb-7f36-4300-aaad-a5bd9957edc7",
  "expires_at": "2026-10-28T11:29:25.467370169Z",
  "resend_available_at": "2026-10-28T11:24:26.467370169Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "089222",
  "sent_at": "2026-10-28T11:24:25.469051725Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "72dcbadb-7f36-4300-aaad-a5bd9957edc7",
  "code": "089222",
  "device_ref": "sandbox-17584"
}
```

```json
{
  "session_id": "6197a388-e441-4b53-b7ff-cd6d022bda09",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NzU2NSwiaWF0IjoxNzkzMTg2NjY1LCJqdGkiOiI2OTNiOTA4YS02ZjVlLTRmODYtOWU0ZS1kM2FiMzE5YzdkZDMiLCJzaWQiOiI2MTk3YTM4OC1lNDQxLTRiNTMtYjdmZi1jZDZkMDIyYmRhMDkifQ.bgviYMwoNeFBxxvauVl6Q7NQhKm2RFLGRv-xb7mBEi0",
  "access_expires_at": "2026-10-28T11:39:25.671909687Z",
  "refresh_token": "ABJJCu5fVUG0U_shfD2vCfHVwZdPiTA12WLdly1u0Io",
  "refresh_expires_at": "2026-11-27T11:24:25.67148191Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3aa145b4-79b3-4f7e-a4b7-d7ed26204ec2",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T11:24:02.718823Z",
  "last_location_at": "2026-10-28T11:24:02.718823Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/3aa145b4-79b3-4f7e-a4b7-d7ed26204ec2/handover` → **200**

```json
{
  "command_id": "540868c6-3137-4d2b-98dd-0fc303d34f5a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3aa145b4-79b3-4f7e-a4b7-d7ed26204ec2",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T11:24:02.718823Z",
  "last_location_at": "2026-10-28T11:24:02.718823Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/3aa145b4-79b3-4f7e-a4b7-d7ed26204ec2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:24:26Z",
    "sequence": 1793186666200
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3aa145b4-79b3-4f7e-a4b7-d7ed26204ec2",
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
  "last_heartbeat_at": "2026-10-28T11:24:26.216604Z",
  "last_location_at": "2026-10-28T11:24:26.216604Z",
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
  "command_id": "bb65f423-90c4-4807-9789-2494e04630a8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:24:26Z",
    "sequence": 1793186666581
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6067ea81-8f23-4feb-bb23-4c8469651058",
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
  "last_heartbeat_at": "2026-10-28T11:24:26.596897Z",
  "last_location_at": "2026-10-28T11:24:26.596897Z",
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
  "session_id": "24dc99bb-2a57-4ee7-ae02-29fdadf94243",
  "subject": {
    "type": "STAFF",
    "id": "23eabed1-5103-466a-be3b-89bb210931f7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2VhYmVkMS01MTAzLTQ2NmEtYmUzYi04OWJiMjEwOTMxZjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODc1NjYsImlhdCI6MTc5MzE4NjY2NiwianRpIjoiZTA5OWJlNmEtYWI1Mi00ZGM0LThkMDEtZGU2YzQ3ZGQzNGUxIiwic2lkIjoiMjRkYzk5YmItMmE1Ny00ZWU3LWFlMDItMjlmZGFkZjk0MjQzIn0.UTgPk3Jq53jKwYMoM2A_B19Fv4M3sDY8mCgMqMEwh-M",
  "access_expires_at": "2026-10-28T11:39:26.986863832Z",
  "refresh_token": "KU-xub8JXpR1mvQB7JGHNi8HvUWd3-4WQbKD2IL8gdU",
  "refresh_expires_at": "2026-10-28T23:24:26.986454762Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "8b5466cc-f2b6-4701-82e9-0be0d1189454",
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
  "id": "d351cfac-80e0-471b-bf78-470f4ef72ba8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:29:27.164555Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 29967,
  "promotions": []
}
```

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "9199f432-5cdc-432e-9957-0961da8c4d09",
  "quote_id": "d351cfac-80e0-471b-bf78-470f4ef72ba8",
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
  "id": "f27c9499-793c-4c2f-9622-064ec6974013",
  "short_number": 20,
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
  "created_at": "2026-10-28T11:24:27.36149Z",
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
    "id": "d8a0ce37-29a0-446e-bada-56e850c2edf1",
    "order_id": "f27c9499-793c-4c2f-9622-064ec6974013",
    "expires_at": "2026-10-28T11:24:42.364634Z",
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

`POST /api/driver/v1/offers/d8a0ce37-29a0-446e-bada-56e850c2edf1/accept` → **200**

```json
{
  "command_id": "ada83755-4eaf-460b-94b5-977ebfa51daa"
}
```

```json
{
  "id": "878e1caa-6c41-4f9f-831c-240152303836",
  "order_id": "f27c9499-793c-4c2f-9622-064ec6974013",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3e1bd146-e75e-429a-a509-c8f6ff6a037d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3e1bd146-e75e-429a-a509-c8f6ff6a037d",
  "order_id": "f27c9499-793c-4c2f-9622-064ec6974013",
  "assignment_id": "878e1caa-6c41-4f9f-831c-240152303836",
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

`POST /api/driver/v1/work-sessions/6067ea81-8f23-4feb-bb23-4c8469651058/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:24:28Z",
    "sequence": 1793186668275
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6067ea81-8f23-4feb-bb23-4c8469651058",
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
  "last_heartbeat_at": "2026-10-28T11:24:28.291285Z",
  "last_location_at": "2026-10-28T11:24:28.291285Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3e1bd146-e75e-429a-a509-c8f6ff6a037d/arrive` → **200**

```json
{
  "command_id": "78192e41-a9ef-4fde-b2e8-6eb8ea5da4ad",
  "expected_version": 0
}
```

```json
{
  "id": "3e1bd146-e75e-429a-a509-c8f6ff6a037d",
  "order_id": "f27c9499-793c-4c2f-9622-064ec6974013",
  "assignment_id": "878e1caa-6c41-4f9f-831c-240152303836",
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
  "arrived_at": "2026-10-28T11:24:28.480145Z",
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

`POST /api/driver/v1/trips/3e1bd146-e75e-429a-a509-c8f6ff6a037d/start` → **200**

```json
{
  "command_id": "dc4bad23-3bda-443d-a33a-52e998323a3f",
  "expected_version": 1
}
```

```json
{
  "id": "3e1bd146-e75e-429a-a509-c8f6ff6a037d",
  "order_id": "f27c9499-793c-4c2f-9622-064ec6974013",
  "assignment_id": "878e1caa-6c41-4f9f-831c-240152303836",
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
  "arrived_at": "2026-10-28T11:24:28.480145Z",
  "started_at": "2026-10-28T11:24:28.668383Z",
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

`POST /api/driver/v1/trips/3e1bd146-e75e-429a-a509-c8f6ff6a037d/complete` → **200**

```json
{
  "command_id": "94ef3743-8bac-4fc5-b2e3-c7e608e7f7bb",
  "expected_version": 2,
  "reported_at": "2026-10-28T11:24:28Z",
  "cash_received": true
}
```

```json
{
  "id": "3e1bd146-e75e-429a-a509-c8f6ff6a037d",
  "order_id": "f27c9499-793c-4c2f-9622-064ec6974013",
  "assignment_id": "878e1caa-6c41-4f9f-831c-240152303836",
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
  "arrived_at": "2026-10-28T11:24:28.480145Z",
  "started_at": "2026-10-28T11:24:28.668383Z",
  "completed_at": "2026-10-28T11:24:28.870353Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/f27c9499-793c-4c2f-9622-064ec6974013` → **200**

```json
{
  "id": "f27c9499-793c-4c2f-9622-064ec6974013",
  "short_number": 20,
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
    "id": "878e1caa-6c41-4f9f-831c-240152303836",
    "order_id": "f27c9499-793c-4c2f-9622-064ec6974013",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3e1bd146-e75e-429a-a509-c8f6ff6a037d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T11:24:27.36149Z",
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
  "session_id": "3aa145b4-79b3-4f7e-a4b7-d7ed26204ec2",
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
  "last_heartbeat_at": "2026-10-28T11:24:26.216604Z",
  "last_location_at": "2026-10-28T11:24:26.216604Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3aa145b4-79b3-4f7e-a4b7-d7ed26204ec2/close` → **200**

```json
{
  "command_id": "d06ff5dc-a4c3-46b7-8d32-1e8950ee732b",
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
  "session_id": "6067ea81-8f23-4feb-bb23-4c8469651058",
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
  "last_heartbeat_at": "2026-10-28T11:24:28.291285Z",
  "last_location_at": "2026-10-28T11:24:28.291285Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6067ea81-8f23-4feb-bb23-4c8469651058/close` → **200**

```json
{
  "command_id": "3b8ec052-43bc-45e6-a36a-5cffa60c5e8b",
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

Done: terminal order f27c9499-793c-4c2f-9622-064ec6974013 by Andrii (5a000000-0000-4000-8000-000000000403).
