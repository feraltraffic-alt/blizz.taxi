# Sandbox transcript (2026-10-28T10:19:13Z, eebf49b)

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
  "correlation_id": "b9fee3a7-437e-47f8-b8a1-da4757a5546a"
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
  "session_id": "54c7a36e-055f-46e9-82f9-5ff9dc8f1c2e",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM2NjIsImlhdCI6MTc5MzE4Mjc2MiwianRpIjoiZWRjZDgyOWUtMzhiMy00MWU5LTlkOGQtNmRmZjZlMjQwNTQ1Iiwic2lkIjoiNTRjN2EzNmUtMDU1Zi00NmU5LTgyZjktNWZmOWRjOGYxYzJlIn0.kG1CAnBbl3hiy1_vDuVpM8XsYuzfE8YRKGFAYEJ99_g",
  "access_expires_at": "2026-10-28T10:34:22.531341476Z",
  "refresh_token": "ofR09WcOFSWaMshcX7zBRYAJT3pT9CsiYTmBWdUjJS4",
  "refresh_expires_at": "2026-10-28T22:19:22.529471197Z",
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
  "session_id": "c918801c-d637-4d09-9b98-72c2493bc231",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM2NjQsImlhdCI6MTc5MzE4Mjc2NCwianRpIjoiMWU2NTA0MzQtMzI3NC00ZjliLThjNjQtNDAxYjczYTJmYTc2Iiwic2lkIjoiYzkxODgwMWMtZDYzNy00ZDA5LTliOTgtNzJjMjQ5M2JjMjMxIn0.V_f_7enl3h5f95VUVWVaHIh9beanFYBZWplC79wdivQ",
  "access_expires_at": "2026-10-28T10:34:24.095665738Z",
  "refresh_token": "XPYsl956pVLlhOdgOju_1O2ykjmmP6sD8Rp0A_cJjls",
  "refresh_expires_at": "2026-10-28T22:19:24.094480011Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "8e6d77e1-47e1-4263-8cc8-502ecad5c11f",
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
  "id": "e80db552-7fb7-441e-90ff-ce519a1a723e",
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
  "created_by": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
  "created_at": "2026-10-28T10:19:24.396186Z",
  "updated_at": "2026-10-28T10:19:24.396186Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638862483",
  "device_ref": "sandbox-19712"
}
```

```json
{
  "challenge_id": "3145ebe5-54a1-4da0-84a8-6584f962e009",
  "expires_at": "2026-10-28T10:24:24.684798792Z",
  "resend_available_at": "2026-10-28T10:19:25.684798792Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638862483` → **200**

```json
{
  "phone": "+380638862483",
  "audience": "CLIENT",
  "code": "792347",
  "sent_at": "2026-10-28T10:19:24.693161008Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3145ebe5-54a1-4da0-84a8-6584f962e009",
  "code": "792347",
  "device_ref": "sandbox-19712"
}
```

```json
{
  "session_id": "d3197276-449b-4714-9424-f4543f9707ee",
  "subject": {
    "type": "CLIENT",
    "id": "154b9296-e783-4894-bb90-3676c8062556"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTRiOTI5Ni1lNzgzLTQ4OTQtYmI5MC0zNjc2YzgwNjI1NTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNjY1LCJpYXQiOjE3OTMxODI3NjUsImp0aSI6ImUyNjEzZTA0LWZlNTgtNDAzMC05ZjkwLTRkMzRhMTJhYjdkZCIsInNpZCI6ImQzMTk3Mjc2LTQ0OWItNDcxNC05NDI0LWY0NTQzZjk3MDdlZSJ9.fiakMLk2M1dw4MWulZ5IwzTygJzMCs7H-8l0r0_G6Ys",
  "access_expires_at": "2026-10-28T10:34:25.019596496Z",
  "refresh_token": "b_LxW3UBYmqJPTZS6K7qVvffSGKgVAs6POBmOwhX52I",
  "refresh_expires_at": "2026-11-27T10:19:25.018532489Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380638862483` → **200**

```json
{
  "client_id": "154b9296-e783-4894-bb90-3676c8062556"
}
```

`POST /api/admin/v1/rider-wallets/154b9296-e783-4894-bb90-3676c8062556/top-ups` → **201**

```json
{
  "command_id": "64a9beb1-0705-4d5b-94a8-e0c86f70d1b0",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "154b9296-e783-4894-bb90-3676c8062556",
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
      "id": "f8efaab3-50d2-4255-a925-214feb001701",
      "at": "2026-10-28T10:19:25.561209Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5f7d8a42-af4a-484f-8d4d-2df79c0e00a3",
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
  "id": "5b6864dd-a3d4-4ce3-b295-81ec632acc2d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:24:26.011696Z",
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
      "id": "e80db552-7fb7-441e-90ff-ce519a1a723e",
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
  "device_ref": "sandbox-5804"
}
```

```json
{
  "challenge_id": "6046fa95-d8da-47af-b88b-ea45a1531b71",
  "expires_at": "2026-10-28T10:24:26.308209687Z",
  "resend_available_at": "2026-10-28T10:19:27.308209687Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "072288",
  "sent_at": "2026-10-28T10:19:26.311956284Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6046fa95-d8da-47af-b88b-ea45a1531b71",
  "code": "072288",
  "device_ref": "sandbox-5804"
}
```

```json
{
  "session_id": "c92e5d43-30c9-4c9d-bbec-0bbede7979a4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzY2NiwiaWF0IjoxNzkzMTgyNzY2LCJqdGkiOiIyZDEzMDYwOC00NmM5LTRlMDktYTJlYi00MjY3NTgzYzU5ZTMiLCJzaWQiOiJjOTJlNWQ0My0zMGM5LTRjOWQtYmJlYy0wYmJlZGU3OTc5YTQifQ.SFbAmWgeDkvFocCQoyWXK09KhBdcvleaT9Y7dwtXhLE",
  "access_expires_at": "2026-10-28T10:34:26.594737901Z",
  "refresh_token": "fDZioyZPo_glxRpaL11Ezh8ZgaKCftDFfuELg39FbKA",
  "refresh_expires_at": "2026-11-27T10:19:26.593634778Z",
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
  "command_id": "5b513f8e-5e12-4d49-92ba-a189b8e28d2b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:19:27Z",
    "sequence": 1793182767112
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cf850df4-9108-4618-bf11-177e0e62b242",
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
  "last_heartbeat_at": "2026-10-28T10:19:27.158344Z",
  "last_location_at": "2026-10-28T10:19:27.158344Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3b0e525a-c231-4f6e-96c1-4c87d09041b9",
  "quote_id": "5b6864dd-a3d4-4ce3-b295-81ec632acc2d",
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
  "id": "b1c57e29-1083-4ea0-8a06-9aa0988e468d",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "154b9296-e783-4894-bb90-3676c8062556",
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
  "created_at": "2026-10-28T10:19:27.480228Z",
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
  "client_id": "154b9296-e783-4894-bb90-3676c8062556",
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
      "id": "f8efaab3-50d2-4255-a925-214feb001701",
      "at": "2026-10-28T10:19:25.561209Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
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
    "id": "795075ac-9da0-4dcf-a05a-623aa727b063",
    "order_id": "b1c57e29-1083-4ea0-8a06-9aa0988e468d",
    "expires_at": "2026-10-28T10:19:42.496324Z",
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

`POST /api/driver/v1/offers/795075ac-9da0-4dcf-a05a-623aa727b063/accept` → **200**

```json
{
  "command_id": "efd02c8b-d724-41c1-8ebf-8a55edbaaf2b"
}
```

```json
{
  "id": "4fdca224-3fd7-4f0e-a206-191368c37581",
  "order_id": "b1c57e29-1083-4ea0-8a06-9aa0988e468d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4ab9eece-eccf-46f5-ad09-e7441d58f4bd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4ab9eece-eccf-46f5-ad09-e7441d58f4bd",
  "order_id": "b1c57e29-1083-4ea0-8a06-9aa0988e468d",
  "assignment_id": "4fdca224-3fd7-4f0e-a206-191368c37581",
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

`POST /api/driver/v1/work-sessions/cf850df4-9108-4618-bf11-177e0e62b242/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:19:28Z",
    "sequence": 1793182768871
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cf850df4-9108-4618-bf11-177e0e62b242",
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
  "last_heartbeat_at": "2026-10-28T10:19:28.89677Z",
  "last_location_at": "2026-10-28T10:19:28.89677Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4ab9eece-eccf-46f5-ad09-e7441d58f4bd/arrive` → **200**

```json
{
  "command_id": "5e3b25a0-55d1-4b16-b39c-778c72525788",
  "expected_version": 0
}
```

```json
{
  "id": "4ab9eece-eccf-46f5-ad09-e7441d58f4bd",
  "order_id": "b1c57e29-1083-4ea0-8a06-9aa0988e468d",
  "assignment_id": "4fdca224-3fd7-4f0e-a206-191368c37581",
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
  "arrived_at": "2026-10-28T10:19:29.184178Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4ab9eece-eccf-46f5-ad09-e7441d58f4bd/start` → **200**

```json
{
  "command_id": "568c6bad-19e2-4c05-8dba-35679aca5a3f",
  "expected_version": 1
}
```

```json
{
  "id": "4ab9eece-eccf-46f5-ad09-e7441d58f4bd",
  "order_id": "b1c57e29-1083-4ea0-8a06-9aa0988e468d",
  "assignment_id": "4fdca224-3fd7-4f0e-a206-191368c37581",
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
  "arrived_at": "2026-10-28T10:19:29.184178Z",
  "started_at": "2026-10-28T10:19:29.456291Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/4ab9eece-eccf-46f5-ad09-e7441d58f4bd/complete` → **200**

```json
{
  "command_id": "18f0b76b-cad4-4e9c-8ebe-6f2b0788b1e9",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:19:29Z",
  "cash_received": true
}
```

```json
{
  "id": "4ab9eece-eccf-46f5-ad09-e7441d58f4bd",
  "order_id": "b1c57e29-1083-4ea0-8a06-9aa0988e468d",
  "assignment_id": "4fdca224-3fd7-4f0e-a206-191368c37581",
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
  "arrived_at": "2026-10-28T10:19:29.184178Z",
  "started_at": "2026-10-28T10:19:29.456291Z",
  "completed_at": "2026-10-28T10:19:29.762037Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "154b9296-e783-4894-bb90-3676c8062556",
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
      "id": "ec564d38-f2f5-4922-b4b3-649085002f18",
      "at": "2026-10-28T10:19:30.011548Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "b1c57e29-1083-4ea0-8a06-9aa0988e468d"
    },
    {
      "id": "f8efaab3-50d2-4255-a925-214feb001701",
      "at": "2026-10-28T10:19:25.561209Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/e80db552-7fb7-441e-90ff-ce519a1a723e/archive` → **200**

```json
{
  "command_id": "f607c45d-3be8-4c5c-abfd-efeb39e5e8eb",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "e80db552-7fb7-441e-90ff-ce519a1a723e",
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
  "created_by": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
  "created_at": "2026-10-28T10:19:24.396186Z",
  "updated_at": "2026-10-28T10:19:33.348487Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cf850df4-9108-4618-bf11-177e0e62b242",
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
  "last_heartbeat_at": "2026-10-28T10:19:28.89677Z",
  "last_location_at": "2026-10-28T10:19:28.89677Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cf850df4-9108-4618-bf11-177e0e62b242/close` → **200**

```json
{
  "command_id": "ab73124e-ffb0-45c9-b635-3a3328a5bcd2",
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

Done: order b1c57e29-1083-4ea0-8a06-9aa0988e468d.

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
  "session_id": "16db6953-56e7-424b-b9d8-f224a7494cb6",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM2NzQsImlhdCI6MTc5MzE4Mjc3NCwianRpIjoiYjViZThhZjktMmE2Ni00N2Y5LWI2ZTQtMGJiNWIwMGQwMjAxIiwic2lkIjoiMTZkYjY5NTMtNTZlNy00MjRiLWI5ZDgtZjIyNGE3NDk0Y2I2In0.N8v5dqw25xtH3g1HIiM8Gjl3bsaillWVFef7MNFMSwQ",
  "access_expires_at": "2026-10-28T10:34:34.477201602Z",
  "refresh_token": "5CD1wftSJhhldD6T-vNvkgrE8rrliFzhW0pOeswsOJk",
  "refresh_expires_at": "2026-10-28T22:19:34.476363892Z",
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
  "command_id": "e1be9853-3386-4208-b456-6435616ccf9d",
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
  "session_id": "eecae8fa-a090-4f64-aa4f-4a6aabb0a313",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM2NzUsImlhdCI6MTc5MzE4Mjc3NSwianRpIjoiNjEwNTViMjgtOTI0NS00ZWM4LWE0YTUtNjhlNzdlMjhmMjQ3Iiwic2lkIjoiZWVjYWU4ZmEtYTA5MC00ZjY0LWFhNGYtNGE2YWFiYjBhMzEzIn0.H-HO9JWzWqgz9LGmHK00l5rFprTuxhnreQ6_4KNB2-E",
  "access_expires_at": "2026-10-28T10:34:35.576380208Z",
  "refresh_token": "9q3CFb8N87HVco4vEDMkbNvjflRzpmyRhv1_-LhKGfo",
  "refresh_expires_at": "2026-10-28T22:19:35.57563321Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.410515642",
    "linkedid": "1730052700.410515642",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677119201"
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
    "id": "1730052700.410515642",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "7001cde1-be52-4fb1-a68b-c6efc0c14429",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380677119201",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:19:35.831435Z",
      "answered_at": null,
      "ended_at": "2026-10-28T10:19:35.856052Z",
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
    "id": "1730052600.2998225044",
    "linkedid": "1730052600.2998225044",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677119201"
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
      "id": "302f3029-ba43-4c57-88ce-76f6e1d01b5b",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677119201",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:19:36.164339Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/302f3029-ba43-4c57-88ce-76f6e1d01b5b/answer` → **200**

```json
{
  "command_id": "637127be-ad97-4f11-b08f-facf0ee60823"
}
```

```json
{
  "id": "302f3029-ba43-4c57-88ce-76f6e1d01b5b",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677119201",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
  "order_ids": [],
  "started_at": "2026-10-28T10:19:36.164339Z",
  "answered_at": "2026-10-28T10:19:36.469923Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2998225044",
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
    "id": "1730052600.2998225044",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "302f3029-ba43-4c57-88ce-76f6e1d01b5b",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677119201",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
      "order_ids": [],
      "started_at": "2026-10-28T10:19:36.164339Z",
      "answered_at": "2026-10-28T10:19:36.469923Z",
      "ended_at": "2026-10-28T10:19:36.758388Z",
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
      "id": "302f3029-ba43-4c57-88ce-76f6e1d01b5b",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677119201",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
      "order_ids": [],
      "started_at": "2026-10-28T10:19:36.164339Z",
      "answered_at": "2026-10-28T10:19:36.469923Z",
      "ended_at": "2026-10-28T10:19:36.758388Z",
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
      "id": "302f3029-ba43-4c57-88ce-76f6e1d01b5b",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677119201",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
      "order_ids": [],
      "started_at": "2026-10-28T10:19:36.164339Z",
      "answered_at": "2026-10-28T10:19:36.469923Z",
      "ended_at": "2026-10-28T10:19:36.758388Z",
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
      "id": "302f3029-ba43-4c57-88ce-76f6e1d01b5b",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677119201",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
      "order_ids": [],
      "started_at": "2026-10-28T10:19:36.164339Z",
      "answered_at": "2026-10-28T10:19:36.469923Z",
      "ended_at": "2026-10-28T10:19:36.758388Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:19:41.807916Z"
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
      "id": "302f3029-ba43-4c57-88ce-76f6e1d01b5b",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677119201",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
      "order_ids": [],
      "started_at": "2026-10-28T10:19:36.164339Z",
      "answered_at": "2026-10-28T10:19:36.469923Z",
      "ended_at": "2026-10-28T10:19:36.758388Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:19:41.807916Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/302f3029-ba43-4c57-88ce-76f6e1d01b5b/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/302f3029-ba43-4c57-88ce-76f6e1d01b5b/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=302f3029-ba43-4c57-88ce-76f6e1d01b5b` → **200**

```json
{
  "changes": [
    {
      "id": "9151c90a-2f97-4266-bfc1-d421ecf54269",
      "occurred_at": "2026-10-28T10:19:44.196643Z",
      "actor_type": "STAFF",
      "actor_id": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "302f3029-ba43-4c57-88ce-76f6e1d01b5b",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"b7757d70-c8b3-488a-a890-d65db7352b04\", \"order_ids\": []}",
      "correlation_id": "8c26ba61-ff33-432b-b39a-fd9a088c7c86"
    },
    {
      "id": "a6e8c5d5-ca80-4c6f-ba69-0efab92f7f77",
      "occurred_at": "2026-10-28T10:19:44.160173Z",
      "actor_type": "STAFF",
      "actor_id": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "302f3029-ba43-4c57-88ce-76f6e1d01b5b",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"b7757d70-c8b3-488a-a890-d65db7352b04\", \"order_ids\": []}",
      "correlation_id": "58bd8024-da54-4c4a-8aeb-613937ccaf65"
    }
  ]
}
```

Done: call 302f3029-ba43-4c57-88ce-76f6e1d01b5b recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633149446",
  "device_ref": "sandbox-10753"
}
```

```json
{
  "challenge_id": "b4e32a3a-b4c9-421b-b35e-0f086eea461d",
  "expires_at": "2026-10-28T10:24:44.516100114Z",
  "resend_available_at": "2026-10-28T10:19:45.516100114Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633149446` → **200**

```json
{
  "phone": "+380633149446",
  "audience": "CLIENT",
  "code": "126459",
  "sent_at": "2026-10-28T10:19:44.519609883Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b4e32a3a-b4c9-421b-b35e-0f086eea461d",
  "code": "126459",
  "device_ref": "sandbox-10753"
}
```

```json
{
  "session_id": "fba11750-a293-4a62-a57f-bbe98d149a65",
  "subject": {
    "type": "CLIENT",
    "id": "ae75ce20-1fba-4b32-b3b6-d2f2467a56eb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZTc1Y2UyMC0xZmJhLTRiMzItYjNiNi1kMmYyNDY3YTU2ZWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNjg0LCJpYXQiOjE3OTMxODI3ODQsImp0aSI6IjQyYWM3MWMyLTZmN2YtNDU2Yi04ZDRhLWIzYjBkOTgyYWVmYyIsInNpZCI6ImZiYTExNzUwLWEyOTMtNGE2Mi1hNTdmLWJiZTk4ZDE0OWE2NSJ9.j4WZUp_Ig6Vg3K_p9y8NEfShKgWQrPXOOFXKHJk-1j8",
  "access_expires_at": "2026-10-28T10:34:44.811801645Z",
  "refresh_token": "aL09ifPC7rou0rQkOo8TSva4mJwxJSvOwqVulWsD2O4",
  "refresh_expires_at": "2026-11-27T10:19:44.811147071Z",
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
  "device_ref": "sandbox-22088"
}
```

```json
{
  "challenge_id": "206e4dcd-37b2-45a9-ad1c-a1319f7b6353",
  "expires_at": "2026-10-28T10:24:45.340854971Z",
  "resend_available_at": "2026-10-28T10:19:46.340854971Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "740745",
  "sent_at": "2026-10-28T10:19:45.344009411Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "206e4dcd-37b2-45a9-ad1c-a1319f7b6353",
  "code": "740745",
  "device_ref": "sandbox-22088"
}
```

```json
{
  "session_id": "345e60a7-2f0e-46bb-98aa-89001b57a5dc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzY4NSwiaWF0IjoxNzkzMTgyNzg1LCJqdGkiOiIwYTA0YzFlNy00NzdkLTQ0ZTItYWZmNi1jMzI5ZjE1MTNhM2YiLCJzaWQiOiIzNDVlNjBhNy0yZjBlLTQ2YmItOThhYS04OTAwMWI1N2E1ZGMifQ.1AVtP-KpNu6O0e8t2F6rqk3Ir1-wx7bMF8AbBdON3Ao",
  "access_expires_at": "2026-10-28T10:34:45.630737741Z",
  "refresh_token": "7jFQCQiYXb93IZZf59hwn5C27kcQT3kreAIfkAkp0E4",
  "refresh_expires_at": "2026-11-27T10:19:45.630047506Z",
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
  "session_id": "fb428a7f-6f73-444e-9220-8fbb134d37b2",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM2ODYsImlhdCI6MTc5MzE4Mjc4NiwianRpIjoiNjQyZDkyNGQtODM3ZC00MzJmLWI0YzMtZGQwODBiNzk0NDBlIiwic2lkIjoiZmI0MjhhN2YtNmY3My00NDRlLTkyMjAtOGZiYjEzNGQzN2IyIn0.-Mdf6rq_l0vy1eW6Xf5YNjni1H4TbkjOuBNwPTXIKJQ",
  "access_expires_at": "2026-10-28T10:34:46.452783175Z",
  "refresh_token": "zOwF0b1xipIsukc4Uf1-JWDJcKeyFVFEze5Xm1tpM4k",
  "refresh_expires_at": "2026-10-28T22:19:46.452077654Z",
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
  "session_id": "4d9bde94-7dbc-4b2e-b474-62f2131146b1",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM2ODcsImlhdCI6MTc5MzE4Mjc4NywianRpIjoiM2RiZmExNzQtZDViMi00ZjgxLTg5YjEtN2RjNDc3YjBhY2ZkIiwic2lkIjoiNGQ5YmRlOTQtN2RiYy00YjJlLWI0NzQtNjJmMjEzMTE0NmIxIn0.qSmEVSpTEN0oXLmIAsdMdlxNcxTL0AtL9Ax2SG74anE",
  "access_expires_at": "2026-10-28T10:34:47.016918075Z",
  "refresh_token": "o2Sw_SRGiTlI_GhsPitv6pliZ7HTJYAoZ766kssIefg",
  "refresh_expires_at": "2026-10-28T22:19:47.015846293Z",
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
  "command_id": "8da4feaf-7587-41f4-949b-7d399201b84d",
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
  "id": "c70d5bb5-9de8-44b9-b5c6-fc1ce247a934",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:24:47.544237Z",
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
  "command_id": "b91d1759-40d8-4ee9-8aa0-06eada4fc0f1",
  "quote_id": "c70d5bb5-9de8-44b9-b5c6-fc1ce247a934",
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
  "id": "db64d944-c06d-4ab4-8dfa-c46ee5d6915b",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ae75ce20-1fba-4b32-b3b6-d2f2467a56eb",
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
  "created_at": "2026-10-28T10:19:47.834426Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/db64d944-c06d-4ab4-8dfa-c46ee5d6915b` → **200**

```json
{
  "id": "db64d944-c06d-4ab4-8dfa-c46ee5d6915b",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ae75ce20-1fba-4b32-b3b6-d2f2467a56eb",
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
  "created_at": "2026-10-28T10:19:47.834426Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/db64d944-c06d-4ab4-8dfa-c46ee5d6915b/cancel` → **200**

```json
{
  "command_id": "0a4756c0-4de1-4372-9e06-21464f82e8ec",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "db64d944-c06d-4ab4-8dfa-c46ee5d6915b",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ae75ce20-1fba-4b32-b3b6-d2f2467a56eb",
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
  "created_at": "2026-10-28T10:19:47.834426Z",
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
  "command_id": "32b09aa3-dd23-4399-9d09-37e8cfb1e8aa",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:19:48Z",
    "sequence": 1793182788982
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5415554d-58bc-4d1e-8aeb-20f271160a3d",
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
  "last_heartbeat_at": "2026-10-28T10:19:49.002563Z",
  "last_location_at": "2026-10-28T10:19:49.002563Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-11756"
}
```

```json
{
  "challenge_id": "ce94e099-8a9d-4109-bf90-1a64c16cafaa",
  "expires_at": "2026-10-28T10:24:49.272777529Z",
  "resend_available_at": "2026-10-28T10:19:50.272777529Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "144169",
  "sent_at": "2026-10-28T10:19:49.27658329Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce94e099-8a9d-4109-bf90-1a64c16cafaa",
  "code": "144169",
  "device_ref": "sandbox-11756"
}
```

```json
{
  "session_id": "34c6086d-6910-4dda-bb42-fb6efae1f8d1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzY4OSwiaWF0IjoxNzkzMTgyNzg5LCJqdGkiOiIxNGM1YjhlMi1jNjIzLTQ5ZjQtODgzOC1hZjMxY2FiY2QyOGQiLCJzaWQiOiIzNGM2MDg2ZC02OTEwLTRkZGEtYmI0Mi1mYjZlZmFlMWY4ZDEifQ.oy-z_2WA9Wv8r5rb1eRNTkkXPzb-YifptBz_FhtiGrc",
  "access_expires_at": "2026-10-28T10:34:49.561832708Z",
  "refresh_token": "e_DIhONXIegq9CHwskHGR6BnKhvk3y5KDwZJpqLbU6A",
  "refresh_expires_at": "2026-11-27T10:19:49.561219792Z",
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
  "command_id": "5246c943-507f-480a-a31e-da5f98b20ef3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:19:50Z",
    "sequence": 1793182790816
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6160575c-6fbd-49da-ae4d-1515d4dbac0b",
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
  "last_heartbeat_at": "2026-10-28T10:19:50.101566Z",
  "last_location_at": "2026-10-28T10:19:50.101566Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3d6b59b0-836a-440d-b897-4fbde2055b3e",
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
  "id": "825b3a02-4f75-4143-8dc9-a9af99ff66f2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:24:50.387843Z",
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
  "command_id": "659d144c-5b5a-457f-8284-4c18da05b4c5",
  "quote_id": "825b3a02-4f75-4143-8dc9-a9af99ff66f2",
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
  "id": "7cee09a9-cdad-49fe-bac3-ab4a3434b7d1",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ae75ce20-1fba-4b32-b3b6-d2f2467a56eb",
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
  "created_at": "2026-10-28T10:19:50.682785Z",
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
    "id": "07088c6c-5d5d-4f72-9fce-aa08e54d5fe9",
    "order_id": "7cee09a9-cdad-49fe-bac3-ab4a3434b7d1",
    "expires_at": "2026-10-28T10:20:05.688025Z",
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

`POST /api/driver/v1/offers/07088c6c-5d5d-4f72-9fce-aa08e54d5fe9/accept` → **200**

```json
{
  "command_id": "4faa5aed-131b-4e01-a66c-850167223422"
}
```

```json
{
  "id": "c5da09f9-8221-43aa-9e8c-e3a150e3823b",
  "order_id": "7cee09a9-cdad-49fe-bac3-ab4a3434b7d1",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "27015a57-9d9c-4ed9-8549-8a300a28b3a2",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "27015a57-9d9c-4ed9-8549-8a300a28b3a2",
  "order_id": "7cee09a9-cdad-49fe-bac3-ab4a3434b7d1",
  "assignment_id": "c5da09f9-8221-43aa-9e8c-e3a150e3823b",
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

`POST /api/driver/v1/trips/27015a57-9d9c-4ed9-8549-8a300a28b3a2/cancel` → **200**

```json
{
  "command_id": "874d231a-6a01-4c34-9ce6-7b0dd946e3ea",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "27015a57-9d9c-4ed9-8549-8a300a28b3a2",
  "order_id": "7cee09a9-cdad-49fe-bac3-ab4a3434b7d1",
  "assignment_id": "c5da09f9-8221-43aa-9e8c-e3a150e3823b",
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

`GET /api/rider/v1/orders/7cee09a9-cdad-49fe-bac3-ab4a3434b7d1` → **200**

```json
{
  "id": "7cee09a9-cdad-49fe-bac3-ab4a3434b7d1",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "ae75ce20-1fba-4b32-b3b6-d2f2467a56eb",
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
    "id": "c5da09f9-8221-43aa-9e8c-e3a150e3823b",
    "order_id": "7cee09a9-cdad-49fe-bac3-ab4a3434b7d1",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "27015a57-9d9c-4ed9-8549-8a300a28b3a2",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T10:19:50.682785Z",
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
    "id": "654cecc1-2fc7-46a6-b37e-cc2771a5e812",
    "order_id": "7cee09a9-cdad-49fe-bac3-ab4a3434b7d1",
    "expires_at": "2026-10-28T10:20:06.794477Z",
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

`POST /api/driver/v1/offers/654cecc1-2fc7-46a6-b37e-cc2771a5e812/accept` → **200**

```json
{
  "command_id": "83f4fa56-32bd-4b95-9e49-381201aea7b7"
}
```

```json
{
  "id": "1e6c0299-3763-48ef-be74-cac07036b685",
  "order_id": "7cee09a9-cdad-49fe-bac3-ab4a3434b7d1",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d8638656-f151-45b3-a697-326bdd20ec71",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d8638656-f151-45b3-a697-326bdd20ec71",
  "order_id": "7cee09a9-cdad-49fe-bac3-ab4a3434b7d1",
  "assignment_id": "1e6c0299-3763-48ef-be74-cac07036b685",
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

`POST /api/driver/v1/trips/d8638656-f151-45b3-a697-326bdd20ec71/cancel` → **200**

```json
{
  "command_id": "ddfcf053-958a-4d5d-8735-560d28b366fe",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "d8638656-f151-45b3-a697-326bdd20ec71",
  "order_id": "7cee09a9-cdad-49fe-bac3-ab4a3434b7d1",
  "assignment_id": "1e6c0299-3763-48ef-be74-cac07036b685",
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
    "id": "7cee09a9-cdad-49fe-bac3-ab4a3434b7d1",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T10:19:50.682785Z",
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
    "id": "db64d944-c06d-4ab4-8dfa-c46ee5d6915b",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T10:19:47.834426Z",
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

`GET /api/operator/v1/orders/7cee09a9-cdad-49fe-bac3-ab4a3434b7d1/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:19:50.683625Z",
      "actor": {
        "type": "CLIENT",
        "id": "ae75ce20-1fba-4b32-b3b6-d2f2467a56eb",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "7cee09a9-cdad-49fe-bac3-ab4a3434b7d1",
        "quote_id": "825b3a02-4f75-4143-8dc9-a9af99ff66f2",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "07363738-50aa-4add-a8e9-41bb9ea69a7a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:19:50.686595Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7cee09a9-cdad-49fe-bac3-ab4a3434b7d1",
        "attempt_id": "e61cb8a4-3fde-4bbc-b742-e602011e51b9",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "07363738-50aa-4add-a8e9-41bb9ea69a7a"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:19:50.695065Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "07088c6c-5d5d-4f72-9fce-aa08e54d5fe9",
        "order_id": "7cee09a9-cdad-49fe-bac3-ab4a3434b7d1",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "07363738-50aa-4add-a8e9-41bb9ea69a7a"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T10:19:51.249521Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "07088c6c-5d5d-4f72-9fce-aa08e54d5fe9",
        "order_id": "7cee09a9-cdad-49fe-bac3-ab4a3434b7d1",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "c5da09f9-8221-43aa-9e8c-e3a150e3823b"
      },
      "correlation_id": "ddfd3534-9adf-4102-a89b-1aefbfe088c0"
```

Done: orders db64d944-c06d-4ab4-8dfa-c46ee5d6915b, 7cee09a9-cdad-49fe-bac3-ab4a3434b7d1.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732659524",
  "device_ref": "sandbox-30116"
}
```

```json
{
  "challenge_id": "412c35c6-4583-4dd8-a9c1-abbcb3036682",
  "expires_at": "2026-10-28T10:24:54.07379517Z",
  "resend_available_at": "2026-10-28T10:19:55.07379517Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732659524` → **200**

```json
{
  "phone": "+380732659524",
  "audience": "CLIENT",
  "code": "113556",
  "sent_at": "2026-10-28T10:19:54.077742965Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "412c35c6-4583-4dd8-a9c1-abbcb3036682",
  "code": "113556",
  "device_ref": "sandbox-30116"
}
```

```json
{
  "session_id": "2bfa47ec-36c2-4e5a-9da4-4aa911c9d365",
  "subject": {
    "type": "CLIENT",
    "id": "bbfc714a-abd3-4e17-a722-98a614273713"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmZjNzE0YS1hYmQzLTRlMTctYTcyMi05OGE2MTQyNzM3MTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNjk0LCJpYXQiOjE3OTMxODI3OTQsImp0aSI6IjgzMTBiMzZlLTM3MDMtNDkyNy04ZGYwLTc5NGVkOGFhNjc5MCIsInNpZCI6IjJiZmE0N2VjLTM2YzItNGU1YS05ZGE0LTRhYTkxMWM5ZDM2NSJ9.4Vx8VlooMKQG6nxYz2rGHcBylvuKpIZfO7q6Z__YiVA",
  "access_expires_at": "2026-10-28T10:34:54.381339949Z",
  "refresh_token": "tZWZHDhCPe7_NZZzPi4YbaMivelRr0y2HK3SK1BwTUw",
  "refresh_expires_at": "2026-11-27T10:19:54.380609592Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "459765a9-2cc1-4e99-bb63-41ddc10a55c0",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "2101007b-5a66-40dc-98db-f2325a4882b5",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-2101007b-5a66-40dc-98db-f2325a4882b5",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "428b8e5b125d326c4b3c845560294d31",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=2101007b-5a66-40dc-98db-f2325a4882b5",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732659524"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=2101007b-5a66-40dc-98db-f2325a4882b5",
  "expires_at": "2026-10-28T10:49:54.661178Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/2101007b-5a66-40dc-98db-f2325a4882b5` → **200**

```json
{
  "id": "2101007b-5a66-40dc-98db-f2325a4882b5",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T10:49:54.661178Z",
  "card": {
    "id": "62845a3c-c512-4ac5-ae3b-e5caa33fc6b1",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5106",
    "card_type": "Visa",
    "created_at": "2026-10-28T10:19:54.964389Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "62845a3c-c512-4ac5-ae3b-e5caa33fc6b1",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****5106",
      "card_type": "Visa",
      "created_at": "2026-10-28T10:19:54.964389Z"
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
  "device_ref": "sandbox-7453"
}
```

```json
{
  "challenge_id": "964cb43e-32ff-4344-a263-fb0cc16e5e4b",
  "expires_at": "2026-10-28T10:24:55.523297001Z",
  "resend_available_at": "2026-10-28T10:19:56.523297001Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "756429",
  "sent_at": "2026-10-28T10:19:55.526592086Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "964cb43e-32ff-4344-a263-fb0cc16e5e4b",
  "code": "756429",
  "device_ref": "sandbox-7453"
}
```

```json
{
  "session_id": "67772553-efd8-4c70-85e0-6d4b1b97ed34",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzY5NSwiaWF0IjoxNzkzMTgyNzk1LCJqdGkiOiI1MGQyZDU4Yi1kZDY5LTRhOTQtOWU1ZS05ZGFiNzUzZTc3OTQiLCJzaWQiOiI2Nzc3MjU1My1lZmQ4LTRjNzAtODVlMC02ZDRiMWI5N2VkMzQifQ.Xd8oa7kmPT4_GqajtM7Jee3A-XpoGxsfmWoy5_4p-mk",
  "access_expires_at": "2026-10-28T10:34:55.808407409Z",
  "refresh_token": "kBdC8zIgI0XgNo8uML_1_LP_eVxV-hRuym3WKFdJlL8",
  "refresh_expires_at": "2026-11-27T10:19:55.80758644Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6160575c-6fbd-49da-ae4d-1515d4dbac0b",
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
  "last_heartbeat_at": "2026-10-28T10:19:50.101566Z",
  "last_location_at": "2026-10-28T10:19:50.101566Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6160575c-6fbd-49da-ae4d-1515d4dbac0b/handover` → **200**

```json
{
  "command_id": "2eda9bdd-f908-4934-a7ae-3d9fab32a66e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6160575c-6fbd-49da-ae4d-1515d4dbac0b",
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
  "last_heartbeat_at": "2026-10-28T10:19:50.101566Z",
  "last_location_at": "2026-10-28T10:19:50.101566Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6160575c-6fbd-49da-ae4d-1515d4dbac0b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:19:56Z",
    "sequence": 1793182796624
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6160575c-6fbd-49da-ae4d-1515d4dbac0b",
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
  "last_heartbeat_at": "2026-10-28T10:19:56.645561Z",
  "last_location_at": "2026-10-28T10:19:56.645561Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ea256cd3-0d62-4b14-a9ce-0feba1e89067",
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
  "id": "e826fbcc-35ac-40aa-8315-62522d8c3db3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:24:56.925169Z",
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
  "command_id": "9510b8da-0825-4116-ab30-086b1b86a786",
  "quote_id": "e826fbcc-35ac-40aa-8315-62522d8c3db3",
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
  "id": "f9cab80b-8759-4125-ad72-740599da5707",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "bbfc714a-abd3-4e17-a722-98a614273713",
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
  "created_at": "2026-10-28T10:19:57.217907Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/f9cab80b-8759-4125-ad72-740599da5707` → **200**

```json
{
  "id": "f9cab80b-8759-4125-ad72-740599da5707",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "bbfc714a-abd3-4e17-a722-98a614273713",
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
  "created_at": "2026-10-28T10:19:57.217907Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/f9cab80b-8759-4125-ad72-740599da5707` → **200**

```json
{
  "id": "f9cab80b-8759-4125-ad72-740599da5707",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bbfc714a-abd3-4e17-a722-98a614273713",
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
  "created_at": "2026-10-28T10:19:57.217907Z",
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
    "id": "9501ccee-2b8c-4ea4-9cfe-b65cd72832d2",
    "order_id": "f9cab80b-8759-4125-ad72-740599da5707",
    "expires_at": "2026-10-28T10:20:13.193584Z",
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

`POST /api/driver/v1/offers/9501ccee-2b8c-4ea4-9cfe-b65cd72832d2/accept` → **200**

```json
{
  "command_id": "083e31a5-01e3-452b-b4d6-c55facbc75b1"
}
```

```json
{
  "id": "0a7ceb20-6a20-4fad-ab00-d9402f2982a8",
  "order_id": "f9cab80b-8759-4125-ad72-740599da5707",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dae8c25c-ae44-4454-8a4b-d2da2ea00bbb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dae8c25c-ae44-4454-8a4b-d2da2ea00bbb",
  "order_id": "f9cab80b-8759-4125-ad72-740599da5707",
  "assignment_id": "0a7ceb20-6a20-4fad-ab00-d9402f2982a8",
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

`POST /api/driver/v1/work-sessions/6160575c-6fbd-49da-ae4d-1515d4dbac0b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:19:59Z",
    "sequence": 1793182799847
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6160575c-6fbd-49da-ae4d-1515d4dbac0b",
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
  "last_heartbeat_at": "2026-10-28T10:19:59.867363Z",
  "last_location_at": "2026-10-28T10:19:59.867363Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/dae8c25c-ae44-4454-8a4b-d2da2ea00bbb/arrive` → **200**

```json
{
  "command_id": "1e1c3d07-196c-4c2a-8018-36fcd99774e2",
  "expected_version": 0
}
```

```json
{
  "id": "dae8c25c-ae44-4454-8a4b-d2da2ea00bbb",
  "order_id": "f9cab80b-8759-4125-ad72-740599da5707",
  "assignment_id": "0a7ceb20-6a20-4fad-ab00-d9402f2982a8",
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
  "arrived_at": "2026-10-28T10:20:00.15248Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/dae8c25c-ae44-4454-8a4b-d2da2ea00bbb/start` → **200**

```json
{
  "command_id": "e36aae98-6367-4ec1-946d-b376277a5685",
  "expected_version": 1
}
```

```json
{
  "id": "dae8c25c-ae44-4454-8a4b-d2da2ea00bbb",
  "order_id": "f9cab80b-8759-4125-ad72-740599da5707",
  "assignment_id": "0a7ceb20-6a20-4fad-ab00-d9402f2982a8",
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
  "arrived_at": "2026-10-28T10:20:00.15248Z",
  "started_at": "2026-10-28T10:20:00.437924Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/dae8c25c-ae44-4454-8a4b-d2da2ea00bbb/complete` → **200**

```json
{
  "command_id": "5653e1f0-563c-4475-a1bf-572355733f4a",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:20:00Z"
}
```

```json
{
  "id": "dae8c25c-ae44-4454-8a4b-d2da2ea00bbb",
  "order_id": "f9cab80b-8759-4125-ad72-740599da5707",
  "assignment_id": "0a7ceb20-6a20-4fad-ab00-d9402f2982a8",
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
  "arrived_at": "2026-10-28T10:20:00.15248Z",
  "started_at": "2026-10-28T10:20:00.437924Z",
  "completed_at": "2026-10-28T10:20:00.726098Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/f9cab80b-8759-4125-ad72-740599da5707` → **200**

```json
{
  "id": "f9cab80b-8759-4125-ad72-740599da5707",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "bbfc714a-abd3-4e17-a722-98a614273713",
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
    "id": "0a7ceb20-6a20-4fad-ab00-d9402f2982a8",
    "order_id": "f9cab80b-8759-4125-ad72-740599da5707",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "dae8c25c-ae44-4454-8a4b-d2da2ea00bbb",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:19:57.217907Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/f9cab80b-8759-4125-ad72-740599da5707` → **200**

```json
{
  "id": "f9cab80b-8759-4125-ad72-740599da5707",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "bbfc714a-abd3-4e17-a722-98a614273713",
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
    "id": "0a7ceb20-6a20-4fad-ab00-d9402f2982a8",
    "order_id": "f9cab80b-8759-4125-ad72-740599da5707",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "dae8c25c-ae44-4454-8a4b-d2da2ea00bbb",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:19:57.217907Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/f9cab80b-8759-4125-ad72-740599da5707` → **200**

```json
{
  "id": "f9cab80b-8759-4125-ad72-740599da5707",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "bbfc714a-abd3-4e17-a722-98a614273713",
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
    "id": "0a7ceb20-6a20-4fad-ab00-d9402f2982a8",
    "order_id": "f9cab80b-8759-4125-ad72-740599da5707",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "dae8c25c-ae44-4454-8a4b-d2da2ea00bbb",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:19:57.217907Z",
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
      "id": "d4c10e67-e4b2-4aac-94ab-f98a9dc637fa",
      "at": "2026-10-28T10:20:01.250101Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f9cab80b-8759-4125-ad72-740599da5707",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/f9cab80b-8759-4125-ad72-740599da5707/tip` → **200**

```json
{
  "order_id": "f9cab80b-8759-4125-ad72-740599da5707",
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
  "available_until": "2026-10-29T10:20:00.726098Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/f9cab80b-8759-4125-ad72-740599da5707/tip` → **201**

```json
{
  "command_id": "7962fe5b-fd4b-4136-ad39-b88c0bd8a18a",
  "amount_minor": 2500
}
```

```json
{
  "id": "cd3deee2-1b51-4537-bf65-77fab1819763",
  "order_id": "f9cab80b-8759-4125-ad72-740599da5707",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T10:20:04.63818Z"
}
```

`GET /api/rider/v1/orders/f9cab80b-8759-4125-ad72-740599da5707/tip` → **200**

```json
{
  "order_id": "f9cab80b-8759-4125-ad72-740599da5707",
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
  "available_until": "2026-10-29T10:20:00.726098Z",
  "open": false,
  "tip": {
    "id": "cd3deee2-1b51-4537-bf65-77fab1819763",
    "order_id": "f9cab80b-8759-4125-ad72-740599da5707",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T10:20:04.63818Z"
  }
}
```

`GET /api/rider/v1/orders/f9cab80b-8759-4125-ad72-740599da5707/tip` → **200**

```json
{
  "order_id": "f9cab80b-8759-4125-ad72-740599da5707",
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
  "available_until": "2026-10-29T10:20:00.726098Z",
  "open": false,
  "tip": {
    "id": "cd3deee2-1b51-4537-bf65-77fab1819763",
    "order_id": "f9cab80b-8759-4125-ad72-740599da5707",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T10:20:04.63818Z"
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
      "balance_minor": 16352
    }
  ],
  "entries": [
    {
      "id": "80347584-532d-440a-addd-a3b236b0ed04",
      "at": "2026-10-28T10:20:06.314426Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f9cab80b-8759-4125-ad72-740599da5707",
      "counterpart_id": null
    },
    {
      "id": "d4c10e67-e4b2-4aac-94ab-f98a9dc637fa",
      "at": "2026-10-28T10:20:01.250101Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f9cab80b-8759-4125-ad72-740599da5707",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6160575c-6fbd-49da-ae4d-1515d4dbac0b",
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
  "last_heartbeat_at": "2026-10-28T10:19:59.867363Z",
  "last_location_at": "2026-10-28T10:19:59.867363Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6160575c-6fbd-49da-ae4d-1515d4dbac0b/close` → **200**

```json
{
  "command_id": "8dc44128-3802-4dc3-b7a1-02f538baa1e4",
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

Done: card order f9cab80b-8759-4125-ad72-740599da5707.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737323976",
  "device_ref": "sandbox-31905"
}
```

```json
{
  "challenge_id": "88261597-b685-4db6-b770-9dfea79ee2a8",
  "expires_at": "2026-10-28T10:25:07.225063564Z",
  "resend_available_at": "2026-10-28T10:20:08.225063564Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380737323976` → **200**

```json
{
  "phone": "+380737323976",
  "audience": "CLIENT",
  "code": "045748",
  "sent_at": "2026-10-28T10:20:07.228424803Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88261597-b685-4db6-b770-9dfea79ee2a8",
  "code": "045748",
  "device_ref": "sandbox-31905"
}
```

```json
{
  "session_id": "edfa20fb-a948-46bd-b0db-e3cb854b6b99",
  "subject": {
    "type": "CLIENT",
    "id": "39db0993-428a-4f1d-94a8-6d60bb114ab8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOWRiMDk5My00MjhhLTRmMWQtOTRhOC02ZDYwYmIxMTRhYjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNzA3LCJpYXQiOjE3OTMxODI4MDcsImp0aSI6ImIyOGQwOTc0LTc1MzgtNGRhZS04NTY1LWY1NGFkODU4MWYzNSIsInNpZCI6ImVkZmEyMGZiLWE5NDgtNDZiZC1iMGRiLWUzY2I4NTRiNmI5OSJ9.RSUr4xYVzofaqUfDtnTsPLHOVhseLhWRpRd5uuT4Rv0",
  "access_expires_at": "2026-10-28T10:35:07.511113871Z",
  "refresh_token": "ybH52IXkCWeKl2ttRx1WvLr2_FTWzvWSTwZqd_v_qRg",
  "refresh_expires_at": "2026-11-27T10:20:07.510531202Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "ef542c17-0420-4156-b481-eccb9b5605f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "804d250a-3795-4b83-bf7d-31834fdc155c",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-804d250a-3795-4b83-bf7d-31834fdc155c",
    "orderDate": "1793182807",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "05198686c62eeba627161c1fa0e9910e",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=804d250a-3795-4b83-bf7d-31834fdc155c",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737323976"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=804d250a-3795-4b83-bf7d-31834fdc155c",
  "created_at": "2026-10-28T10:20:07.77326Z",
  "expires_at": "2026-10-28T10:50:07.77326Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/804d250a-3795-4b83-bf7d-31834fdc155c` → **200**

```json
{
  "id": "804d250a-3795-4b83-bf7d-31834fdc155c",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T10:20:07.77326Z",
  "expires_at": "2026-10-28T10:50:07.77326Z",
  "completed_at": "2026-10-28T10:20:08.039584Z",
  "masked_pan": "41****7917",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "39db0993-428a-4f1d-94a8-6d60bb114ab8",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "39db0993-428a-4f1d-94a8-6d60bb114ab8",
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
      "id": "955c1920-b55f-4dd5-b60f-df0cd64f9922",
      "at": "2026-10-28T10:20:08.337874Z",
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
  "client_id": "39db0993-428a-4f1d-94a8-6d60bb114ab8",
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
      "id": "955c1920-b55f-4dd5-b60f-df0cd64f9922",
      "at": "2026-10-28T10:20:08.337874Z",
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
  "device_ref": "sandbox-19637"
}
```

```json
{
  "challenge_id": "d7e71cb6-7e7b-4c40-928a-87f85b73fdba",
  "expires_at": "2026-10-28T10:25:10.170934759Z",
  "resend_available_at": "2026-10-28T10:20:11.170934759Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "355299",
  "sent_at": "2026-10-28T10:20:10.17410453Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d7e71cb6-7e7b-4c40-928a-87f85b73fdba",
  "code": "355299",
  "device_ref": "sandbox-19637"
}
```

```json
{
  "session_id": "7dba643b-9c77-43c4-bfd7-a8b26587e6fa",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzcxMCwiaWF0IjoxNzkzMTgyODEwLCJqdGkiOiI1MjY4MzY0Zi1mNTcxLTQyZjMtOTZiNC02OWM2MDNhZTg5MDQiLCJzaWQiOiI3ZGJhNjQzYi05Yzc3LTQzYzQtYmZkNy1hOGIyNjU4N2U2ZmEifQ.GrwKPUAOaATwVIJQJttJd8m1Wu-QqA11pIQOWxb5zXU",
  "access_expires_at": "2026-10-28T10:35:10.504570725Z",
  "refresh_token": "F0LvNfMP7aPaYATcALvA1IVvUKHcR7ceHhFELhaHW28",
  "refresh_expires_at": "2026-11-27T10:20:10.503779693Z",
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
  "command_id": "c0929c0b-c256-4b3d-8f39-c32629e338a0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "ed94c75c-08fd-464b-8ac9-4c726cb1010d",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-ed94c75c-08fd-464b-8ac9-4c726cb1010d",
    "orderDate": "1793182811",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "1151615f2b7f931d3a6b9431d2992016",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=ed94c75c-08fd-464b-8ac9-4c726cb1010d",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=ed94c75c-08fd-464b-8ac9-4c726cb1010d",
  "created_at": "2026-10-28T10:20:11.126276Z",
  "expires_at": "2026-10-28T10:50:11.126276Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/ed94c75c-08fd-464b-8ac9-4c726cb1010d` → **200**

```json
{
  "id": "ed94c75c-08fd-464b-8ac9-4c726cb1010d",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T10:20:11.126276Z",
  "expires_at": "2026-10-28T10:50:11.126276Z",
  "completed_at": "2026-10-28T10:20:11.416519Z",
  "masked_pan": "41****3135",
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
      "id": "392d7295-db17-41ce-b5a4-366d7cb64e23",
      "at": "2026-10-28T10:20:12.360453Z",
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
  "command_id": "59d45e7d-b643-4b32-8e37-b1659244da89",
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
  "correlation_id": "b8ca8dbc-584a-4e70-8d90-fc08ed15938e"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678056067",
  "device_ref": "sandbox-2668"
}
```

```json
{
  "challenge_id": "93840956-53b2-4db5-b67d-b1c6a995b7a4",
  "expires_at": "2026-10-28T10:25:13.507383908Z",
  "resend_available_at": "2026-10-28T10:20:14.507383908Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678056067` → **200**

```json
{
  "phone": "+380678056067",
  "audience": "CLIENT",
  "code": "723451",
  "sent_at": "2026-10-28T10:20:13.510130892Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "93840956-53b2-4db5-b67d-b1c6a995b7a4",
  "code": "723451",
  "device_ref": "sandbox-2668"
}
```

```json
{
  "session_id": "e5dc4520-e781-4b92-8684-303bec62ee47",
  "subject": {
    "type": "CLIENT",
    "id": "b59408ef-78c5-4298-9e33-64442d69827a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTk0MDhlZi03OGM1LTQyOTgtOWUzMy02NDQ0MmQ2OTgyN2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNzEzLCJpYXQiOjE3OTMxODI4MTMsImp0aSI6IjA4YzNlMTc3LTc3OWUtNDU5ZS1iZTk1LTkyMDliM2E2NDQwMyIsInNpZCI6ImU1ZGM0NTIwLWU3ODEtNGI5Mi04Njg0LTMwM2JlYzYyZWU0NyJ9.YynSF2SK2a25wXlFDgbUsCLF4vuuftjYhh2fDlONc_Y",
  "access_expires_at": "2026-10-28T10:35:13.803544616Z",
  "refresh_token": "UAuJUtVPwy0XFbEgB21h76399mnmj12YWOh2BGzEcCY",
  "refresh_expires_at": "2026-11-27T10:20:13.802858843Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b59408ef-78c5-4298-9e33-64442d69827a",
  "session_id": "e5dc4520-e781-4b92-8684-303bec62ee47",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7bd7e567-c4d1-443d-8abd-aea00affd173",
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
  "id": "c8be1b1c-e777-41c2-84a6-f92832ce0e6e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:25:14.374165Z",
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
  "challenge_id": "96aa0c07-4130-4028-837d-fd4c845bd542",
  "expires_at": "2026-10-28T10:25:16.647137675Z",
  "resend_available_at": "2026-10-28T10:20:17.647137675Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678056067` → **200**

```json
{
  "phone": "+380678056067",
  "audience": "CLIENT",
  "code": "476678",
  "sent_at": "2026-10-28T10:20:16.649357769Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "2c09be84-a8df-4070-adbe-6570cdba3a58",
  "challenge_id": "96aa0c07-4130-4028-837d-fd4c845bd542",
  "otp_code": "476678"
}
```

```json
{
  "client_id": "b59408ef-78c5-4298-9e33-64442d69827a",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T10:20:16.943316417Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "9295a501-8d9f-41f0-a736-0a8a74b78cce",
  "quote_id": "c8be1b1c-e777-41c2-84a6-f92832ce0e6e",
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
  "correlation_id": "58b2b566-6ed5-4246-982c-7c6ba080ce54"
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
  "session_id": "5b5b164d-941c-46b9-9667-d8bf70982daa",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM3MTcsImlhdCI6MTc5MzE4MjgxNywianRpIjoiNTViMjllODEtNTQ5NS00MTQwLTk0YmMtMjcwNjNhYjc4NDE4Iiwic2lkIjoiNWI1YjE2NGQtOTQxYy00NmI5LTk2NjctZDhiZjcwOTgyZGFhIn0.RKWSd8H_67Sofek79M7LLDZYSHafAh-UTPk5vCi_jIA",
  "access_expires_at": "2026-10-28T10:35:17.768385038Z",
  "refresh_token": "_0NQuWekUwRLh5qIFde8Tn6wKSU9VC2s46SzM-4zoU0",
  "refresh_expires_at": "2026-10-28T22:20:17.767788052Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "b59408ef-78c5-4298-9e33-64442d69827a",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T10:20:16.943316Z",
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

`POST /api/admin/v1/client-deletions/b59408ef-78c5-4298-9e33-64442d69827a/complete` → **200**

```json
{
  "command_id": "0c5d2e84-aad1-46cb-a1aa-48da6b8860c0",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "b59408ef-78c5-4298-9e33-64442d69827a",
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
  "correlation_id": "e15dcecb-1def-46dc-8982-b4864fbc34db"
}
```

Done: client b59408ef-78c5-4298-9e33-64442d69827a anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666056081",
  "device_ref": "sandbox-16979"
}
```

```json
{
  "challenge_id": "94dcb7a2-df2b-4a08-935b-c9e71d84aef2",
  "expires_at": "2026-10-28T10:25:18.88332987Z",
  "resend_available_at": "2026-10-28T10:20:19.88332987Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666056081` → **200**

```json
{
  "phone": "+380666056081",
  "audience": "CLIENT",
  "code": "167861",
  "sent_at": "2026-10-28T10:20:18.886108119Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "94dcb7a2-df2b-4a08-935b-c9e71d84aef2",
  "code": "167861",
  "device_ref": "sandbox-16979"
}
```

```json
{
  "session_id": "1d139465-fa91-4b0c-ab06-a1674c211ae3",
  "subject": {
    "type": "CLIENT",
    "id": "c9970f37-7fff-49d4-bb14-75ca6ce23d77"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOTk3MGYzNy03ZmZmLTQ5ZDQtYmIxNC03NWNhNmNlMjNkNzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNzE5LCJpYXQiOjE3OTMxODI4MTksImp0aSI6IjQzYTc5NDk0LWU1YTYtNGI2YS1hMTI4LWJhMGE3MzVkZGQ2ZSIsInNpZCI6IjFkMTM5NDY1LWZhOTEtNGIwYy1hYjA2LWExNjc0YzIxMWFlMyJ9.y5A7G6X1sQKrQqf1fE3tyljYrIjlobrPaXd_x1veTeE",
  "access_expires_at": "2026-10-28T10:35:19.179401631Z",
  "refresh_token": "mql9aIRwNo4YZENbTUzFu9t3PZTVqzVXnerlMuv4yZU",
  "refresh_expires_at": "2026-11-27T10:20:19.178698665Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c9970f37-7fff-49d4-bb14-75ca6ce23d77",
  "session_id": "1d139465-fa91-4b0c-ab06-a1674c211ae3",
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
  "session_id": "96646628-7cb9-46e9-875e-325ee55a8d93",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM3MTksImlhdCI6MTc5MzE4MjgxOSwianRpIjoiYTM2ZTA1OTEtNzI2MS00Njc1LWI4MzAtNGU5MDJiMzBhZTdhIiwic2lkIjoiOTY2NDY2MjgtN2NiOS00NmU5LTg3NWUtMzI1ZWU1NWE4ZDkzIn0.BDVOiJgIKAfeC03FxexBXaoUWJw8s2vm5_PmVblYv1M",
  "access_expires_at": "2026-10-28T10:35:19.979772011Z",
  "refresh_token": "MyNrYmKaQrbipvzc1Y2HA_g3IvtvVMzfjzH_6G81SRw",
  "refresh_expires_at": "2026-10-28T22:20:19.979207607Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=6056081&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "c9970f37-7fff-49d4-bb14-75ca6ce23d77",
      "phone": "+380666056081",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T10:20:19.176729Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/c9970f37-7fff-49d4-bb14-75ca6ce23d77` → **200**

```json
{
  "client": {
    "id": "c9970f37-7fff-49d4-bb14-75ca6ce23d77",
    "phone": "+380666056081",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T10:20:19.176729Z",
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

`POST /api/admin/v1/clients/c9970f37-7fff-49d4-bb14-75ca6ce23d77/block` → **400**

```json
{
  "command_id": "0d1f71ab-372d-4c81-8d5e-ef4d567b3fce",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/c9970f37-7fff-49d4-bb14-75ca6ce23d77/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "269991aa-b5e4-4ab2-82cd-a80914ff66b8",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/c9970f37-7fff-49d4-bb14-75ca6ce23d77/block` → **200**

```json
{
  "command_id": "bc95a03b-a24a-4ef1-93ea-be0746c5dc3f",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "c9970f37-7fff-49d4-bb14-75ca6ce23d77",
  "phone": "+380666056081",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T10:20:19.176729Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T10:20:21.100203Z",
    "by": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
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
  "correlation_id": "81d1b253-6ef2-4230-927a-7221ead43353"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666056081",
  "device_ref": "sandbox-23681"
}
```

```json
{
  "challenge_id": "0a7348cd-6741-45d2-8cae-c773a97567e4",
  "expires_at": "2026-10-28T10:25:23.623241492Z",
  "resend_available_at": "2026-10-28T10:20:24.623241492Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666056081` → **200**

```json
{
  "phone": "+380666056081",
  "audience": "CLIENT",
  "code": "113601",
  "sent_at": "2026-10-28T10:20:23.625660935Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "0a7348cd-6741-45d2-8cae-c773a97567e4",
  "code": "113601",
  "device_ref": "sandbox-23681"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "e36578ff-d2da-41a0-bbfc-52ad50338e7a"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/c9970f37-7fff-49d4-bb14-75ca6ce23d77` → **200**

```json
{
  "client": {
    "id": "c9970f37-7fff-49d4-bb14-75ca6ce23d77",
    "phone": "+380666056081",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T10:20:19.176729Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T10:20:21.100203Z",
      "by": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
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

`POST /api/admin/v1/clients/c9970f37-7fff-49d4-bb14-75ca6ce23d77/unblock` → **200**

```json
{
  "command_id": "b7565b9e-68d5-4b31-9e59-7f0633214450",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "c9970f37-7fff-49d4-bb14-75ca6ce23d77",
  "phone": "+380666056081",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T10:20:19.176729Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666056081",
  "device_ref": "sandbox-16252"
}
```

```json
{
  "challenge_id": "e437dc2d-4b0a-4f54-9a69-e5c7bada1afe",
  "expires_at": "2026-10-28T10:25:26.745853462Z",
  "resend_available_at": "2026-10-28T10:20:27.745853462Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666056081` → **200**

```json
{
  "phone": "+380666056081",
  "audience": "CLIENT",
  "code": "365614",
  "sent_at": "2026-10-28T10:20:26.748329319Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e437dc2d-4b0a-4f54-9a69-e5c7bada1afe",
  "code": "365614",
  "device_ref": "sandbox-16252"
}
```

```json
{
  "session_id": "cbf7f907-1638-4ecc-87ea-68d86f1806b5",
  "subject": {
    "type": "CLIENT",
    "id": "c9970f37-7fff-49d4-bb14-75ca6ce23d77"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOTk3MGYzNy03ZmZmLTQ5ZDQtYmIxNC03NWNhNmNlMjNkNzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNzI3LCJpYXQiOjE3OTMxODI4MjcsImp0aSI6ImQ1NTRlOTAyLTUyNDItNGQ2Zi05MjZhLWE3ZjZjNjY4ZjQzNiIsInNpZCI6ImNiZjdmOTA3LTE2MzgtNGVjYy04N2VhLTY4ZDg2ZjE4MDZiNSJ9.ri7sjJQgVx7MJZBkWk8OaTv84KGymkaAKZHKDC6NwJI",
  "access_expires_at": "2026-10-28T10:35:27.034690854Z",
  "refresh_token": "tWt3_ithgDaR_qK14EzXK6dANjleVuuDFim43lPljLY",
  "refresh_expires_at": "2026-11-27T10:20:27.034107674Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c9970f37-7fff-49d4-bb14-75ca6ce23d77",
  "session_id": "cbf7f907-1638-4ecc-87ea-68d86f1806b5",
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
  "phone": "+380669814519",
  "device_ref": "sandbox-31201"
}
```

```json
{
  "challenge_id": "23eccd35-8e81-4b42-afde-3edefed5afd0",
  "expires_at": "2026-10-28T10:25:27.554536645Z",
  "resend_available_at": "2026-10-28T10:20:28.554536645Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669814519` → **200**

```json
{
  "phone": "+380669814519",
  "audience": "CLIENT",
  "code": "194240",
  "sent_at": "2026-10-28T10:20:27.557032712Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "23eccd35-8e81-4b42-afde-3edefed5afd0",
  "code": "194240",
  "device_ref": "sandbox-31201"
}
```

```json
{
  "session_id": "ce2a9a2e-5aca-44c2-acf0-1099f5e32569",
  "subject": {
    "type": "CLIENT",
    "id": "7ed3eeaa-d05c-4795-9163-a9d1cce57de4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZWQzZWVhYS1kMDVjLTQ3OTUtOTE2My1hOWQxY2NlNTdkZTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNzI3LCJpYXQiOjE3OTMxODI4MjcsImp0aSI6ImE1ZGJkN2MwLTRlMDktNDMwOS05MWEyLWZiZDgyYzhhOTU5YiIsInNpZCI6ImNlMmE5YTJlLTVhY2EtNDRjMi1hY2YwLTEwOTlmNWUzMjU2OSJ9.yMp-cpVT8woflJlwXh2VNMHkOZuntEUweBWqYJIvR4A",
  "access_expires_at": "2026-10-28T10:35:27.857714362Z",
  "refresh_token": "H5YMB_sEFrRqy2R1h4MRS1T1817RBsfN_4WKi0lurQ4",
  "refresh_expires_at": "2026-11-27T10:20:27.857175386Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "37de8023-96ac-42b8-ac8e-6287147b1ee4",
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
  "id": "d58b0121-b6d5-40b7-8cba-15f42d8125e8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:25:28.120327Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: c7d30ee7-9b15-48a1-a3e9-fafe004aaa86) → **201**

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
  "session_id": "0eaeb4bb-c4ec-4067-a5b8-901a4b471a2b",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM3MjgsImlhdCI6MTc5MzE4MjgyOCwianRpIjoiYzZmYzBjYWMtMjdjNi00OGYzLTk0NWYtODFiY2NjNzZkZTk1Iiwic2lkIjoiMGVhZWI0YmItYzRlYy00MDY3LWE1YjgtOTAxYTRiNDcxYTJiIn0.FjKnRq14u6mVlZ4XqkQM249lXfPyvuPL5DXpT9U9LlM",
  "access_expires_at": "2026-10-28T10:35:28.727192922Z",
  "refresh_token": "95ZVKT0ML2UCAEJApNiMcCJby6vPtojA0dKmKUrKy5g",
  "refresh_expires_at": "2026-10-28T22:20:28.726564016Z",
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
  "session_id": "6f749667-f3a9-4a18-917d-e4d636e213f0",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM3MjksImlhdCI6MTc5MzE4MjgyOSwianRpIjoiZWQ5NDYyOTMtYTZkYi00ZmE4LTk3OGEtMGM4ODQyODA5ZWIyIiwic2lkIjoiNmY3NDk2NjctZjNhOS00YTE4LTkxN2QtZTRkNjM2ZTIxM2YwIn0.wEw5dlbHOGDcNBHKBEsVqqmhez_6G5nipzD3UbdZjAk",
  "access_expires_at": "2026-10-28T10:35:29.287767937Z",
  "refresh_token": "PI8YuwZOB7HRML-QcbymSRdKyaEbCkYymrSIkr9SO8M",
  "refresh_expires_at": "2026-10-28T22:20:29.287208863Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4a99b83f-0467-49fe-98e0-93c4bed252aa/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:20:28.393176Z",
      "actor": {
        "type": "CLIENT",
        "id": "7ed3eeaa-d05c-4795-9163-a9d1cce57de4",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4a99b83f-0467-49fe-98e0-93c4bed252aa",
        "quote_id": "d58b0121-b6d5-40b7-8cba-15f42d8125e8",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "c7d30ee7-9b15-48a1-a3e9-fafe004aaa86"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:20:28.395158Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4a99b83f-0467-49fe-98e0-93c4bed252aa",
        "attempt_id": "c6f7e711-bf0a-42e4-a40e-a6964f0b1c55",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c7d30ee7-9b15-48a1-a3e9-fafe004aaa86"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T10:20:28.405527Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4a99b83f-0467-49fe-98e0-93c4bed252aa",
        "attempt_id": "c6f7e711-bf0a-42e4-a40e-a6964f0b1c55"
      },
      "correlation_id": "c7d30ee7-9b15-48a1-a3e9-fafe004aaa86"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "c6f7e711-bf0a-42e4-a40e-a6964f0b1c55",
        "generation": 1,
        "started_at": "2026-10-28T10:20:28.394023Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T10:20:28.405527Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T10:20:28.396193Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/c7d30ee7-9b15-48a1-a3e9-fafe004aaa86` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "4a99b83f-0467-49fe-98e0-93c4bed252aa:0",
      "order_id": "4a99b83f-0467-49fe-98e0-93c4bed252aa",
      "at": "2026-10-28T10:20:28.393176Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "4a99b83f-0467-49fe-98e0-93c4bed252aa:1",
      "order_id": "4a99b83f-0467-49fe-98e0-93c4bed252aa",
      "at": "2026-10-28T10:20:28.395158Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "4a99b83f-0467-49fe-98e0-93c4bed252aa:2",
      "order_id": "4a99b83f-0467-49fe-98e0-93c4bed252aa",
      "at": "2026-10-28T10:20:28.405527Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/fc59612b-11dc-4b03-ad17-79d89f876cfb` → **200**

```json
{
  "found": []
}
```

Done: request c7d30ee7-9b15-48a1-a3e9-fafe004aaa86 — order 4a99b83f-0467-49fe-98e0-93c4bed252aa found by its id.

`GET /api/rider/v1/orders/4a99b83f-0467-49fe-98e0-93c4bed252aa` → **200**

```json
{
  "id": "4a99b83f-0467-49fe-98e0-93c4bed252aa",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7ed3eeaa-d05c-4795-9163-a9d1cce57de4",
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
  "created_at": "2026-10-28T10:20:28.392519Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/4a99b83f-0467-49fe-98e0-93c4bed252aa/cancel` → **200**

```json
{
  "command_id": "10c0b434-bbc4-49cb-b82c-aeb9ec07bce5",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4a99b83f-0467-49fe-98e0-93c4bed252aa",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7ed3eeaa-d05c-4795-9163-a9d1cce57de4",
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
  "created_at": "2026-10-28T10:20:28.392519Z",
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

# Scenario: data-export

## A rider signs in and asks for a code to confirm the copy

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637174883",
  "device_ref": "sandbox-31708"
}
```

```json
{
  "challenge_id": "4b2229fd-234f-4e0a-a314-05683c51b6c6",
  "expires_at": "2026-10-28T10:25:30.952172642Z",
  "resend_available_at": "2026-10-28T10:20:31.952172642Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637174883` → **200**

```json
{
  "phone": "+380637174883",
  "audience": "CLIENT",
  "code": "179296",
  "sent_at": "2026-10-28T10:20:30.954729562Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4b2229fd-234f-4e0a-a314-05683c51b6c6",
  "code": "179296",
  "device_ref": "sandbox-31708"
}
```

```json
{
  "session_id": "95866e35-a68c-4949-8d90-eeb400000861",
  "subject": {
    "type": "CLIENT",
    "id": "a3dbba6f-ff40-4106-a9cd-a1e3e1d168b4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2RiYmE2Zi1mZjQwLTQxMDYtYTljZC1hMWUzZTFkMTY4YjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNzMxLCJpYXQiOjE3OTMxODI4MzEsImp0aSI6IjY5M2FjMzA4LWJhZGMtNGQxNS05ZWZmLWIxZDUwZWYxNzVhNSIsInNpZCI6Ijk1ODY2ZTM1LWE2OGMtNDk0OS04ZDkwLWVlYjQwMDAwMDg2MSJ9.aRF-BAR-hEQTCrqvbmDSJhPR-oi4Rc-w6DSCDSiy8nI",
  "access_expires_at": "2026-10-28T10:35:31.244323841Z",
  "refresh_token": "BVoGnwAyMvXv_22AEfBAZ8f4KO8AsA71LIRpPtjx1sw",
  "refresh_expires_at": "2026-11-27T10:20:31.243643285Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "e131a034-f329-4d54-8197-8ddaee71b680",
  "expires_at": "2026-10-28T10:25:33.515988146Z",
  "resend_available_at": "2026-10-28T10:20:34.515988146Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637174883` → **200**

```json
{
  "phone": "+380637174883",
  "audience": "CLIENT",
  "code": "403017",
  "sent_at": "2026-10-28T10:20:33.518088908Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "22d130a4-b5a6-44a9-8a9d-a545f16403bc",
  "challenge_id": "e131a034-f329-4d54-8197-8ddaee71b680",
  "otp_code": "403017"
}
```

```json
{
  "id": "9e3fb1c3-00eb-43ee-a601-e5468dec7019",
  "state": "PENDING",
  "created_at": "2026-10-28T10:20:33.823512Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/9e3fb1c3-00eb-43ee-a601-e5468dec7019` → **200**

```json
{
  "id": "9e3fb1c3-00eb-43ee-a601-e5468dec7019",
  "state": "PENDING",
  "created_at": "2026-10-28T10:20:33.823512Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9e3fb1c3-00eb-43ee-a601-e5468dec7019` → **200**

```json
{
  "id": "9e3fb1c3-00eb-43ee-a601-e5468dec7019",
  "state": "PENDING",
  "created_at": "2026-10-28T10:20:33.823512Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9e3fb1c3-00eb-43ee-a601-e5468dec7019` → **200**

```json
{
  "id": "9e3fb1c3-00eb-43ee-a601-e5468dec7019",
  "state": "PENDING",
  "created_at": "2026-10-28T10:20:33.823512Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9e3fb1c3-00eb-43ee-a601-e5468dec7019` → **200**

```json
{
  "id": "9e3fb1c3-00eb-43ee-a601-e5468dec7019",
  "state": "PENDING",
  "created_at": "2026-10-28T10:20:33.823512Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9e3fb1c3-00eb-43ee-a601-e5468dec7019` → **200**

```json
{
  "id": "9e3fb1c3-00eb-43ee-a601-e5468dec7019",
  "state": "PENDING",
  "created_at": "2026-10-28T10:20:33.823512Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9e3fb1c3-00eb-43ee-a601-e5468dec7019` → **200**

```json
{
  "id": "9e3fb1c3-00eb-43ee-a601-e5468dec7019",
  "state": "PENDING",
  "created_at": "2026-10-28T10:20:33.823512Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9e3fb1c3-00eb-43ee-a601-e5468dec7019` → **200**

```json
{
  "id": "9e3fb1c3-00eb-43ee-a601-e5468dec7019",
  "state": "PENDING",
  "created_at": "2026-10-28T10:20:33.823512Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9e3fb1c3-00eb-43ee-a601-e5468dec7019` → **200**

```json
{
  "id": "9e3fb1c3-00eb-43ee-a601-e5468dec7019",
  "state": "READY",
  "created_at": "2026-10-28T10:20:33.823512Z",
  "ready_at": "2026-10-28T10:20:41.828565Z",
  "expires_at": "2026-11-04T10:20:41.828565Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/9e3fb1c3-00eb-43ee-a601-e5468dec7019/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631844169",
  "device_ref": "sandbox-12157"
}
```

```json
{
  "challenge_id": "c66d36ed-1d4a-434e-95bb-fde8f25c97de",
  "expires_at": "2026-10-28T10:25:43.256932753Z",
  "resend_available_at": "2026-10-28T10:20:44.256932753Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631844169` → **200**

```json
{
  "phone": "+380631844169",
  "audience": "CLIENT",
  "code": "396126",
  "sent_at": "2026-10-28T10:20:43.259510144Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c66d36ed-1d4a-434e-95bb-fde8f25c97de",
  "code": "396126",
  "device_ref": "sandbox-12157"
}
```

```json
{
  "session_id": "00e97610-41a5-49fd-9627-ec37697219fc",
  "subject": {
    "type": "CLIENT",
    "id": "072e42e4-0084-4f1b-9b9b-a5e8a9d6ab7c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNzJlNDJlNC0wMDg0LTRmMWItOWI5Yi1hNWU4YTlkNmFiN2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNzQzLCJpYXQiOjE3OTMxODI4NDMsImp0aSI6IjNmZjVlMTc5LTg0ZjktNDJmNy04YmM1LWY1ZWY3NGQzZjA2NiIsInNpZCI6IjAwZTk3NjEwLTQxYTUtNDlmZC05NjI3LWVjMzc2OTcyMTlmYyJ9.snzQWdEQY5eXeVvCfHghLzLMEr2aHWQspXu_4t2dX-U",
  "access_expires_at": "2026-10-28T10:35:43.54432878Z",
  "refresh_token": "FqrgXLWXn0zuaQsZVfbWUQjKsJfbIhKLYm4JoWPjciA",
  "refresh_expires_at": "2026-11-27T10:20:43.543774284Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/9e3fb1c3-00eb-43ee-a601-e5468dec7019/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/9e3fb1c3-00eb-43ee-a601-e5468dec7019/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d6dfe45d-2429-4007-afd7-a40ad6462d9b"
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
  "session_id": "c6aa4167-a145-4eb9-a054-5067dad83641",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM3NDQsImlhdCI6MTc5MzE4Mjg0NCwianRpIjoiOGMzM2RhZTAtZGM3Ny00NjIxLWJhNGEtNjJhNTEwMjFlMzRmIiwic2lkIjoiYzZhYTQxNjctYTE0NS00ZWI5LWEwNTQtNTA2N2RhZDgzNjQxIn0.U0qv8MoBe7-AAqkrpu92gxDDlmEhDwzHxV2ZChVJhwE",
  "access_expires_at": "2026-10-28T10:35:44.363691984Z",
  "refresh_token": "XGScCxD5Upb1onPWbqTBRpQH3vW3nFTTKnm25gX9FOA",
  "refresh_expires_at": "2026-10-28T22:20:44.363082304Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a3dbba6f-ff40-4106-a9cd-a1e3e1d168b4",
  "session_id": "95866e35-a68c-4949-8d90-eeb400000861",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/a3dbba6f-ff40-4106-a9cd-a1e3e1d168b4/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "9e3fb1c3-00eb-43ee-a601-e5468dec7019",
      "state": "READY",
      "created_at": "2026-10-28T10:20:33.823512Z",
      "ready_at": "2026-10-28T10:20:41.828565Z",
      "expires_at": "2026-11-04T10:20:41.828565Z",
      "size_bytes": 1032
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
  "device_ref": "sandbox-30213"
}
```

```json
{
  "challenge_id": "04d98ed2-00fc-4657-848f-5e3b06018629",
  "expires_at": "2026-10-28T10:25:45.167717111Z",
  "resend_available_at": "2026-10-28T10:20:46.167717111Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "145767",
  "sent_at": "2026-10-28T10:20:45.170052977Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "04d98ed2-00fc-4657-848f-5e3b06018629",
  "code": "145767",
  "device_ref": "sandbox-30213"
}
```

```json
{
  "session_id": "46f04164-6cff-4042-877a-07178527c5de",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mzc0NSwiaWF0IjoxNzkzMTgyODQ1LCJqdGkiOiI3NTQyMjFjYi05YmQwLTRjMTktOTFhNC1jMzk2NzI4YWZiNjEiLCJzaWQiOiI0NmYwNDE2NC02Y2ZmLTQwNDItODc3YS0wNzE3ODUyN2M1ZGUifQ.eD9ZY3pv0cQWv3h11hj2XuCF9XpoW40_gnT-y9NpFuc",
  "access_expires_at": "2026-10-28T10:35:45.456829075Z",
  "refresh_token": "lC3jOWIltxBvl7GxEG1HPXQyDHsWIyMwjthlBEPl6WA",
  "refresh_expires_at": "2026-11-27T10:20:45.456117342Z",
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
  "device_ref": "sandbox-20407"
}
```

```json
{
  "challenge_id": "5d8539e8-fb99-42ad-8efd-8ab04937776d",
  "expires_at": "2026-10-28T10:25:45.972317026Z",
  "resend_available_at": "2026-10-28T10:20:46.972317026Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "262682",
  "sent_at": "2026-10-28T10:20:45.974572413Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5d8539e8-fb99-42ad-8efd-8ab04937776d",
  "code": "262682",
  "device_ref": "sandbox-20407"
}
```

```json
{
  "session_id": "c3658d51-cab5-4258-847a-6ebae133e58e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mzc0NiwiaWF0IjoxNzkzMTgyODQ2LCJqdGkiOiI5MDFmODA4Yy01MDcxLTQwZjgtOGNhNC03OTAxOGQ5NmJjYTciLCJzaWQiOiJjMzY1OGQ1MS1jYWI1LTQyNTgtODQ3YS02ZWJhZTEzM2U1OGUifQ.N_uF-udUcbPZPpvHi8YfpFMOu1fWFyrq-wxUZ2LoOkI",
  "access_expires_at": "2026-10-28T10:35:46.263012143Z",
  "refresh_token": "PApZxIzUqUodMPrPxWVSHYO9rwTQPqNtees8QjDtvUg",
  "refresh_expires_at": "2026-11-27T10:20:46.262372708Z",
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
  "command_id": "06689951-f4c7-4b6c-a600-fd7dc2d8278b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:20:46Z",
    "sequence": 1793182846786
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6e29cc56-de7d-4d62-8562-d2c05316a9ba",
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
  "last_heartbeat_at": "2026-10-28T10:20:46.805979Z",
  "last_location_at": "2026-10-28T10:20:46.805979Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-12893"
}
```

```json
{
  "challenge_id": "1a1dabd5-df73-4afb-8fd1-c93e09503781",
  "expires_at": "2026-10-28T10:25:47.099368162Z",
  "resend_available_at": "2026-10-28T10:20:48.099368162Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "512605",
  "sent_at": "2026-10-28T10:20:47.101991861Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1a1dabd5-df73-4afb-8fd1-c93e09503781",
  "code": "512605",
  "device_ref": "sandbox-12893"
}
```

```json
{
  "session_id": "f824c12d-2c12-47f0-92bb-f9f4424e9f81",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mzc0NywiaWF0IjoxNzkzMTgyODQ3LCJqdGkiOiJkZGFkYjM0Yi1hNzg1LTRiMjktOGU2NS00ODIzZTQyMzJmMmMiLCJzaWQiOiJmODI0YzEyZC0yYzEyLTQ3ZjAtOTJiYi1mOWY0NDI0ZTlmODEifQ.tZ4YDiytpUavGwuHyCgGa45L7LuY_fTEUS4VxhP5uog",
  "access_expires_at": "2026-10-28T10:35:47.39090672Z",
  "refresh_token": "z7t_EDcL8oOz6egQKhRpEpcsotqwog_tt3NnVGljJ4M",
  "refresh_expires_at": "2026-11-27T10:20:47.39030258Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5415554d-58bc-4d1e-8aeb-20f271160a3d",
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
  "last_heartbeat_at": "2026-10-28T10:19:49.002563Z",
  "last_location_at": "2026-10-28T10:19:49.002563Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5415554d-58bc-4d1e-8aeb-20f271160a3d/handover` → **200**

```json
{
  "command_id": "4ddf3387-e15a-4702-bb73-43f579a5a6b8",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5415554d-58bc-4d1e-8aeb-20f271160a3d",
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
  "last_heartbeat_at": "2026-10-28T10:19:49.002563Z",
  "last_location_at": "2026-10-28T10:19:49.002563Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5415554d-58bc-4d1e-8aeb-20f271160a3d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:20:48Z",
    "sequence": 1793182848202
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5415554d-58bc-4d1e-8aeb-20f271160a3d",
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
  "last_heartbeat_at": "2026-10-28T10:20:48.22197Z",
  "last_location_at": "2026-10-28T10:20:48.22197Z",
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
  "session_id": "daa1cdc6-9300-4650-941d-bfaaed161205",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM3NDgsImlhdCI6MTc5MzE4Mjg0OCwianRpIjoiMjZkNjkwMWQtZDVkYi00ZjlhLWE3YmUtMzFiNzhlZGQzODZhIiwic2lkIjoiZGFhMWNkYzYtOTMwMC00NjUwLTk0MWQtYmZhYWVkMTYxMjA1In0.6821_j1_QYMkiNsj6tpYWP1Xf-55Mv7IeCACzz5iv6k",
  "access_expires_at": "2026-10-28T10:35:48.782796522Z",
  "refresh_token": "1FpX1SXz_H1DEB4Byi3yqsD2AHTgGcNqi3igPTw4SWs",
  "refresh_expires_at": "2026-10-28T22:20:48.782181936Z",
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
  "session_id": "9eb0bb80-315d-41e7-bdc7-cfbb39341a4e",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM3NDksImlhdCI6MTc5MzE4Mjg0OSwianRpIjoiNzQ2ODA4YzYtMTRlZi00OTM1LThkYjAtMzUxNDllMWI4MTZjIiwic2lkIjoiOWViMGJiODAtMzE1ZC00MWU3LWJkYzctY2ZiYjM5MzQxYTRlIn0.zLM6rZGpPLBp1Rfof3Rp4cyrhPRZpGE4P3f8LYo5img",
  "access_expires_at": "2026-10-28T10:35:49.343984555Z",
  "refresh_token": "Wg7pupcXKXw2fZqJq_Y-B_Do1Gcrd8M-DmeMxCVGF9I",
  "refresh_expires_at": "2026-10-28T22:20:49.343321906Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380686151295",
  "device_ref": "sandbox-14008"
}
```

```json
{
  "challenge_id": "b9dc6c78-b3c4-4925-a68e-98cfa2b52122",
  "expires_at": "2026-10-28T10:25:49.619311098Z",
  "resend_available_at": "2026-10-28T10:20:50.619311098Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380686151295` → **200**

```json
{
  "phone": "+380686151295",
  "audience": "CLIENT",
  "code": "174106",
  "sent_at": "2026-10-28T10:20:49.621769334Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b9dc6c78-b3c4-4925-a68e-98cfa2b52122",
  "code": "174106",
  "device_ref": "sandbox-14008"
}
```

```json
{
  "session_id": "f92ed5e4-2e0a-480b-966f-462e9b1b68d5",
  "subject": {
    "type": "CLIENT",
    "id": "b129b3a1-a241-4723-b8af-218beda336ac"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTI5YjNhMS1hMjQxLTQ3MjMtYjhhZi0yMThiZWRhMzM2YWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNzQ5LCJpYXQiOjE3OTMxODI4NDksImp0aSI6Ijg2Yjc0ZDlkLTIzODMtNDVkZi04OTZjLTJjN2UxYjM5ZDliMiIsInNpZCI6ImY5MmVkNWU0LTJlMGEtNDgwYi05NjZmLTQ2MmU5YjFiNjhkNSJ9.PE399otZxs35FwqGfm9ekbfNthFWYJafATKdxLJQSsE",
  "access_expires_at": "2026-10-28T10:35:49.907812691Z",
  "refresh_token": "SLhPidBKDXRQ_ccUo7hcND-DkFNxjpBAhwJW2SUYz38",
  "refresh_expires_at": "2026-11-27T10:20:49.907256712Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "315009d5-7d46-4096-a945-f1d6abd399ac",
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
  "id": "2ed890b0-90f2-4fa6-8f8f-6ad4a887e178",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:25:50.179732Z",
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
  "command_id": "963e079a-c3d6-4421-b72f-9971d245edfe",
  "quote_id": "2ed890b0-90f2-4fa6-8f8f-6ad4a887e178",
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
  "id": "534b1aec-eb12-4cfb-9096-11265477e548",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b129b3a1-a241-4723-b8af-218beda336ac",
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
  "created_at": "2026-10-28T10:20:50.449328Z",
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
    "id": "10098257-8ea2-4e7e-8696-4a31e0422c43",
    "order_id": "534b1aec-eb12-4cfb-9096-11265477e548",
    "expires_at": "2026-10-28T10:21:05.452582Z",
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

`POST /api/driver/v1/offers/10098257-8ea2-4e7e-8696-4a31e0422c43/reject` → **204**

```json
{
  "command_id": "e4bdfa89-2542-4352-b52d-3ce15dc6bfa2"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "be66b904-9903-4ea7-ab75-cedce53552cc",
    "order_id": "534b1aec-eb12-4cfb-9096-11265477e548",
    "expires_at": "2026-10-28T10:21:06.007753Z",
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

`POST /api/driver/v1/offers/be66b904-9903-4ea7-ab75-cedce53552cc/accept` → **200**

```json
{
  "command_id": "688bd7ae-6ba9-407b-8f6a-4a7084283d54"
}
```

```json
{
  "id": "7f0aa479-2586-4f3c-aa64-5c4cf9591bdf",
  "order_id": "534b1aec-eb12-4cfb-9096-11265477e548",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1628cfc5-f2a6-47ec-8d8a-cb3ce11e8743",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/534b1aec-eb12-4cfb-9096-11265477e548/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:20:50.449832Z",
      "actor": {
        "type": "CLIENT",
        "id": "b129b3a1-a241-4723-b8af-218beda336ac",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "534b1aec-eb12-4cfb-9096-11265477e548",
        "quote_id": "2ed890b0-90f2-4fa6-8f8f-6ad4a887e178",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "f0989422-baad-40f2-8d46-b8cb09e3652b"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:20:50.451721Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "534b1aec-eb12-4cfb-9096-11265477e548",
        "attempt_id": "fb0f5ca8-05de-471b-8fc6-4fc1e5f55d4b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f0989422-baad-40f2-8d46-b8cb09e3652b"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:20:50.458695Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "10098257-8ea2-4e7e-8696-4a31e0422c43",
        "order_id": "534b1aec-eb12-4cfb-9096-11265477e548",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "f0989422-baad-40f2-8d46-b8cb09e3652b"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T10:20:51.006652Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "10098257-8ea2-4e7e-8696-4a31e0422c43",
        "order_id": "534b1aec-eb12-4cfb-9096-11265477e548"
      },
      "correlation_id": "21f03e67-7c08-48d0-9528-3519814e3a5c"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 534b1aec-eb12-4cfb-9096-11265477e548 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/534b1aec-eb12-4cfb-9096-11265477e548` → **200**

```json
{
  "id": "534b1aec-eb12-4cfb-9096-11265477e548",
  "short_number": 6,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "b129b3a1-a241-4723-b8af-218beda336ac",
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
    "id": "7f0aa479-2586-4f3c-aa64-5c4cf9591bdf",
    "order_id": "534b1aec-eb12-4cfb-9096-11265477e548",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "1628cfc5-f2a6-47ec-8d8a-cb3ce11e8743",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T10:20:50.449328Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/534b1aec-eb12-4cfb-9096-11265477e548/cancel` → **200**

```json
{
  "command_id": "e3adbe36-5524-4d43-bed4-de3cae5a13e2",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "534b1aec-eb12-4cfb-9096-11265477e548",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "b129b3a1-a241-4723-b8af-218beda336ac",
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
    "id": "7f0aa479-2586-4f3c-aa64-5c4cf9591bdf",
    "order_id": "534b1aec-eb12-4cfb-9096-11265477e548",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "1628cfc5-f2a6-47ec-8d8a-cb3ce11e8743",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T10:20:50.449328Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто"
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
  "session_id": "6e29cc56-de7d-4d62-8562-d2c05316a9ba",
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
  "last_heartbeat_at": "2026-10-28T10:20:46.805979Z",
  "last_location_at": "2026-10-28T10:20:46.805979Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6e29cc56-de7d-4d62-8562-d2c05316a9ba/close` → **200**

```json
{
  "command_id": "2c39c9de-5513-4029-ab62-19f2cb45975a",
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
  "session_id": "5415554d-58bc-4d1e-8aeb-20f271160a3d",
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
  "last_heartbeat_at": "2026-10-28T10:20:48.22197Z",
  "last_location_at": "2026-10-28T10:20:48.22197Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5415554d-58bc-4d1e-8aeb-20f271160a3d/close` → **200**

```json
{
  "command_id": "b997420b-1ba2-4da4-b1a2-a640cb0ac4f7",
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
  "device_ref": "sandbox-6959"
}
```

```json
{
  "challenge_id": "6434c300-f2de-4919-a9d8-aeaf076e4c7d",
  "expires_at": "2026-10-28T10:25:53.836854602Z",
  "resend_available_at": "2026-10-28T10:20:54.836854602Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "464917",
  "sent_at": "2026-10-28T10:20:53.839131335Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6434c300-f2de-4919-a9d8-aeaf076e4c7d",
  "code": "464917",
  "device_ref": "sandbox-6959"
}
```

```json
{
  "session_id": "a2e10e0d-c822-41ef-94a8-7a002dcdea42",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mzc1NCwiaWF0IjoxNzkzMTgyODU0LCJqdGkiOiIxYTlhZjI4Ny1iZGU3LTQ2MzktYWZlMC01YjdhMWVkNzM5N2EiLCJzaWQiOiJhMmUxMGUwZC1jODIyLTQxZWYtOTRhOC03YTAwMmRjZGVhNDIifQ.X0QcRLE3uZJyAEjjJXWzxQ5xXgYfB4C9b9rS_0-venw",
  "access_expires_at": "2026-10-28T10:35:54.127641555Z",
  "refresh_token": "SHkhhuZpa9U12QFbHb2-szEncUdhjykHsSXxcLE3uj0",
  "refresh_expires_at": "2026-11-27T10:20:54.127074195Z",
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
  "command_id": "1a7b6120-4806-4bd4-984e-36dd9c8b10c2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:20:54Z",
    "sequence": 1793182854672
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "edc5d843-3fcf-49a7-a67b-6d1ff5a8b594",
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
  "last_heartbeat_at": "2026-10-28T10:20:54.691178Z",
  "last_location_at": "2026-10-28T10:20:54.691178Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678092314",
  "device_ref": "sandbox-18517"
}
```

```json
{
  "challenge_id": "8efaa377-d631-4c9d-b1fe-d55f6f2cddd8",
  "expires_at": "2026-10-28T10:25:54.955579287Z",
  "resend_available_at": "2026-10-28T10:20:55.955579287Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678092314` → **200**

```json
{
  "phone": "+380678092314",
  "audience": "CLIENT",
  "code": "182327",
  "sent_at": "2026-10-28T10:20:54.957930047Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8efaa377-d631-4c9d-b1fe-d55f6f2cddd8",
  "code": "182327",
  "device_ref": "sandbox-18517"
}
```

```json
{
  "session_id": "b46ad998-5d5c-4f1d-8fd1-ebf2763777fa",
  "subject": {
    "type": "CLIENT",
    "id": "efb06682-0519-42fc-9537-cd60e3b9f586"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmIwNjY4Mi0wNTE5LTQyZmMtOTUzNy1jZDYwZTNiOWY1ODYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNzU1LCJpYXQiOjE3OTMxODI4NTUsImp0aSI6ImI1NzkwYzcxLTMyNTctNDEzNS04MjdmLWEwN2MzZjc1OGNkMSIsInNpZCI6ImI0NmFkOTk4LTVkNWMtNGYxZC04ZmQxLWViZjI3NjM3NzdmYSJ9.KEzJAh6FnAyBEl0w6sPgUYALFl8jihlzLbL2sCN3tiY",
  "access_expires_at": "2026-10-28T10:35:55.240007785Z",
  "refresh_token": "51dRsCeUmlpYcsRlffXYFVwIaXUB_q8p_Cz3qqqedpA",
  "refresh_expires_at": "2026-11-27T10:20:55.2393418Z",
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
  "command_id": "4bd2e44f-1a71-4dc1-9832-5482e901d8aa",
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
  "id": "b1e72cfc-1dd9-470b-a03c-1c26fae61d10",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:25:55.775764Z",
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
  "command_id": "37d5c1c6-96c8-4e0a-bc2f-5eb3fecb96b8",
  "platform": "ANDROID",
  "token": "sandbox-driver-0a02a902-96ee-4202-a425-f079aae3702c"
}
```

```json
{
  "id": "29a86706-08d4-4552-933c-685063eae286",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T10:20:56.065203Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "78bf8587-a198-442f-8829-314fa3e7825c",
  "platform": "ANDROID",
  "token": "sandbox-rider-95549b8b-ae8a-4451-999a-d4dc2212b0ae"
}
```

```json
{
  "id": "f5cffe04-1e0b-4ef1-90f0-04e7c5d2154f",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T10:20:56.33372Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c1b32c25-73b0-4663-8d62-adcaec959021",
  "quote_id": "b1e72cfc-1dd9-470b-a03c-1c26fae61d10",
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
  "id": "4db7a022-9309-436b-a93c-ec7c95886aff",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "efb06682-0519-42fc-9537-cd60e3b9f586",
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
  "created_at": "2026-10-28T10:20:56.602059Z",
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
    "id": "56b2b0c4-9316-41da-80b9-758fad1c3fe5",
    "order_id": "4db7a022-9309-436b-a93c-ec7c95886aff",
    "expires_at": "2026-10-28T10:21:11.60526Z",
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

`POST /api/driver/v1/offers/56b2b0c4-9316-41da-80b9-758fad1c3fe5/accept` → **200**

```json
{
  "command_id": "42935124-ab7a-45fa-8991-75a5975fa09a"
}
```

```json
{
  "id": "132574cc-4f5d-45b4-9d73-757577d2c297",
  "order_id": "4db7a022-9309-436b-a93c-ec7c95886aff",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d314734a-bbdf-4d77-bad5-2fe72a307f09",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T10:20:56.577Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T10:20:56.577Z` → **200**

```json
[
  {
    "at": "2026-10-28T10:20:58.066427795Z",
    "token_suffix": "e3702c",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "0d09f52b-9122-4fc6-9d23-2c78be2bf80c",
      "order_version": "2",
      "order_id": "4db7a022-9309-436b-a93c-ec7c95886aff",
      "type": "driver.offer",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380678092314&after=2026-10-28T10:20:56.577Z` → **200**

```json
[
  {
    "at": "2026-10-28T10:20:58.069226353Z",
    "token_suffix": "12b0ae",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "3401888b-5db0-4442-a0b9-38bf23219e0e",
      "order_version": "3",
      "order_id": "4db7a022-9309-436b-a93c-ec7c95886aff",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/4db7a022-9309-436b-a93c-ec7c95886aff/messages` → **201**

```json
{
  "command_id": "edc7862c-625f-4af5-8279-958f3427bd23",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "fd8fda47-6759-4b97-91ea-6be95e076ed5",
  "order_id": "4db7a022-9309-436b-a93c-ec7c95886aff",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T10:20:58.507454254Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d314734a-bbdf-4d77-bad5-2fe72a307f09",
  "order_id": "4db7a022-9309-436b-a93c-ec7c95886aff",
  "assignment_id": "132574cc-4f5d-45b4-9d73-757577d2c297",
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

`POST /api/driver/v1/trips/d314734a-bbdf-4d77-bad5-2fe72a307f09/messages` → **201**

```json
{
  "command_id": "48833467-22bb-494a-acbf-2a76c5293e76",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "e2a9740d-c19f-4ac6-a2d1-6611cc40060e",
  "order_id": "4db7a022-9309-436b-a93c-ec7c95886aff",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T10:20:59.040978754Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/4db7a022-9309-436b-a93c-ec7c95886aff/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/d314734a-bbdf-4d77-bad5-2fe72a307f09/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380678092314"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/edc5d843-3fcf-49a7-a67b-6d1ff5a8b594/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:20:59Z",
    "sequence": 1793182859812
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "edc5d843-3fcf-49a7-a67b-6d1ff5a8b594",
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
  "last_heartbeat_at": "2026-10-28T10:20:59.830805Z",
  "last_location_at": "2026-10-28T10:20:59.830805Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d314734a-bbdf-4d77-bad5-2fe72a307f09",
  "order_id": "4db7a022-9309-436b-a93c-ec7c95886aff",
  "assignment_id": "132574cc-4f5d-45b4-9d73-757577d2c297",
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

`POST /api/driver/v1/trips/d314734a-bbdf-4d77-bad5-2fe72a307f09/arrive` → **200**

```json
{
  "command_id": "8ebb4539-b9bc-4162-bbc4-d720d9a6b4d3",
  "expected_version": 0
}
```

```json
{
  "id": "d314734a-bbdf-4d77-bad5-2fe72a307f09",
  "order_id": "4db7a022-9309-436b-a93c-ec7c95886aff",
  "assignment_id": "132574cc-4f5d-45b4-9d73-757577d2c297",
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
  "arrived_at": "2026-10-28T10:21:00.353334Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d314734a-bbdf-4d77-bad5-2fe72a307f09/start` → **200**

```json
{
  "command_id": "36a569ca-1ff0-42ea-9ddf-d5975b7e432b",
  "expected_version": 1
}
```

```json
{
  "id": "d314734a-bbdf-4d77-bad5-2fe72a307f09",
  "order_id": "4db7a022-9309-436b-a93c-ec7c95886aff",
  "assignment_id": "132574cc-4f5d-45b4-9d73-757577d2c297",
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
  "arrived_at": "2026-10-28T10:21:00.353334Z",
  "started_at": "2026-10-28T10:21:00.644919Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/edc5d843-3fcf-49a7-a67b-6d1ff5a8b594/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:21:00Z",
    "sequence": 1793182860897
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "edc5d843-3fcf-49a7-a67b-6d1ff5a8b594",
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
  "last_heartbeat_at": "2026-10-28T10:21:00.916826Z",
  "last_location_at": "2026-10-28T10:21:00.916826Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/d314734a-bbdf-4d77-bad5-2fe72a307f09/complete` → **200**

```json
{
  "command_id": "38eb4587-a9e3-44d2-a940-3f61a904ec83",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:21:01Z",
  "cash_received": true
}
```

```json
{
  "id": "d314734a-bbdf-4d77-bad5-2fe72a307f09",
  "order_id": "4db7a022-9309-436b-a93c-ec7c95886aff",
  "assignment_id": "132574cc-4f5d-45b4-9d73-757577d2c297",
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
  "arrived_at": "2026-10-28T10:21:00.353334Z",
  "started_at": "2026-10-28T10:21:00.644919Z",
  "completed_at": "2026-10-28T10:21:01.190815Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/4db7a022-9309-436b-a93c-ec7c95886aff` → **200**

```json
{
  "id": "4db7a022-9309-436b-a93c-ec7c95886aff",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "efb06682-0519-42fc-9537-cd60e3b9f586",
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
    "id": "132574cc-4f5d-45b4-9d73-757577d2c297",
    "order_id": "4db7a022-9309-436b-a93c-ec7c95886aff",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d314734a-bbdf-4d77-bad5-2fe72a307f09",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:20:56.602059Z",
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
    "id": "4db7a022-9309-436b-a93c-ec7c95886aff",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-28T10:20:56.602059Z",
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
    "id": "d314734a-bbdf-4d77-bad5-2fe72a307f09",
    "order_id": "4db7a022-9309-436b-a93c-ec7c95886aff",
    "order_short_number": 7,
    "created_at": "2026-10-28T10:20:57.146422Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "4ab9eece-eccf-46f5-ad09-e7441d58f4bd",
    "order_id": "b1c57e29-1083-4ea0-8a06-9aa0988e468d",
    "order_short_number": 1,
    "created_at": "2026-10-28T10:19:28.339469Z",
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

`GET /api/rider/v1/orders/4db7a022-9309-436b-a93c-ec7c95886aff/tip` → **200**

```json
{
  "order_id": "4db7a022-9309-436b-a93c-ec7c95886aff",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
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
  "available_until": "2026-10-29T10:21:01.190815Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/4db7a022-9309-436b-a93c-ec7c95886aff/tip` → **201**

```json
{
  "command_id": "0fad724c-7389-43fd-8760-6e8930846588",
  "amount_minor": 1100
}
```

```json
{
  "id": "38c293a3-6a6c-4eeb-bebb-5046d707d6e9",
  "order_id": "4db7a022-9309-436b-a93c-ec7c95886aff",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T10:21:06.034264Z"
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
  "session_id": "512a5ee3-d0c0-4afe-9f10-c1aa164a2edc",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM3NjYsImlhdCI6MTc5MzE4Mjg2NiwianRpIjoiMDMzYjJkYzMtNmFjOS00OTRlLThjMGItYjY3YTljYWZlMmE3Iiwic2lkIjoiNTEyYTVlZTMtZDBjMC00YWZlLTlmMTAtYzFhYTE2NGEyZWRjIn0.zfKQkWWQ2P4oHZggTKwE7ROMzZrLUbfMiuKgDNtqFqU",
  "access_expires_at": "2026-10-28T10:36:06.585099419Z",
  "refresh_token": "zLYJspzaLaMiN_5R36Z1mQRFCRL0jysDZpaDrXuhLXo",
  "refresh_expires_at": "2026-10-28T22:21:06.584382036Z",
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
          "CARD": 1,
          "CASH": 6
        },
        "cancelled_by": {
          "RIDER": 2,
          "STAFF": 1,
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
      "CARD": 1,
      "CASH": 6
    },
    "cancelled_by": {
      "RIDER": 2,
      "STAFF": 1,
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
  "generated_at": "2026-10-28T10:21:06.850330519Z"
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
  "generated_at": "2026-10-28T10:21:07.119452193Z"
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
  "session_id": "be157773-a8dc-4868-bbe8-993c5062a85a",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM3NjcsImlhdCI6MTc5MzE4Mjg2NywianRpIjoiNjg4ZTEzM2UtYjk0NC00MzRlLWIxY2EtNmE0ZTE2N2FkNDYwIiwic2lkIjoiYmUxNTc3NzMtYThkYy00ODY4LWJiZTgtOTkzYzUwNjJhODVhIn0.-dNFaIHXQ79gNQvSTpoENFV-CXq50YvTzGvKxuaEWMQ",
  "access_expires_at": "2026-10-28T10:36:07.677533506Z",
  "refresh_token": "eF4ZogwydMzGYKX0UU4Vyo5Y1lOaiCW8sKSCnPOABbw",
  "refresh_expires_at": "2026-10-28T22:21:07.676926298Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4db7a022-9309-436b-a93c-ec7c95886aff/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:20:56.602591Z",
      "actor": {
        "type": "CLIENT",
        "id": "efb06682-0519-42fc-9537-cd60e3b9f586",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4db7a022-9309-436b-a93c-ec7c95886aff",
        "quote_id": "b1e72cfc-1dd9-470b-a03c-1c26fae61d10",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "41c939eb-cbb3-45a6-8e7a-47c569994f24"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:20:56.604383Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4db7a022-9309-436b-a93c-ec7c95886aff",
        "attempt_id": "74136e43-23c1-4fee-9f41-61a2dc13fd82",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "41c939eb-cbb3-45a6-8e7a-47c569994f24"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:20:56.611266Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "56b2b0c4-9316-41da-80b9-758fad1c3fe5",
        "order_id": "4db7a022-9309-436b-a93c-ec7c95886aff",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "41c939eb-cbb3-45a6-8e7a-47c569994f24"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T10:20:57.148523Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "56b2b0c4-9316-41da-80b9-758fad1c3fe5",
        "order_id": "4db7a022-9309-436b-a93c-ec7c95886aff",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "132574cc-4f5d-45b4-9d73-757577d2c297"
      },
      "correlation_id": "69a29e6e-d63d-4a14-869b-f6cefa26c0ea"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T10:21:08.192713811Z",
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
      "last_location_at": "2026-10-28T10:21:00.916826Z",
      "order_id": null
    }
  ]
}
```

Done: order 4db7a022-9309-436b-a93c-ec7c95886aff.

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
  "session_id": "3aaa1ee5-1d24-41eb-88ed-da07932dcca7",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM3NjgsImlhdCI6MTc5MzE4Mjg2OCwianRpIjoiOTQ1ZTZlNzItZDZhYS00Y2Q4LTkxOWYtMTdiZTc4NGNkMjlmIiwic2lkIjoiM2FhYTFlZTUtMWQyNC00MWViLTg4ZWQtZGEwNzkzMmRjY2E3In0.2K1qMHh8X7ZIVMa19QN97XKEPMXkp9k_jkuySlzjYbQ",
  "access_expires_at": "2026-10-28T10:36:08.761695359Z",
  "refresh_token": "VxMYO_Nnrk9lIVHdRuBDHd1RsSnc11Kr0YEVThLqCVY",
  "refresh_expires_at": "2026-10-28T22:21:08.761125384Z",
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
  "command_id": "f7410e0a-1157-4cb2-be57-0090251fd203",
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
  "timestamp": "2026-10-28T10:21:09.000+0000",
  "channel": {
    "id": "1730052000.1859813536",
    "linkedid": "1730052000.1859813536",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673872783"
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
  "timestamp": "2026-10-28T10:21:09.000+0000",
  "channel": {
    "id": "1730052000.1859813536",
    "linkedid": "1730052000.1859813536",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673872783"
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
  "session_id": "97a9ba3a-eb9e-4673-b996-6ef1d1125bcb",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM3NjksImlhdCI6MTc5MzE4Mjg2OSwianRpIjoiMjU0Mjg4YmEtMTUzZC00ZjU5LTgxMmMtZjZjZTdjNjAxY2E5Iiwic2lkIjoiOTdhOWJhM2EtZWI5ZS00NjczLWI5OTYtNmVmMWQxMTI1YmNiIn0.-uo5esFPLZF3gsb3lUNb0XRkYu8JCad1T9bSftDaQEQ",
  "access_expires_at": "2026-10-28T10:36:09.901750992Z",
  "refresh_token": "ANJIL74ivCQb0ynZLy8RvnGPe4p7QRzy3s7HFGRykxU",
  "refresh_expires_at": "2026-10-28T22:21:09.90112017Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "44d9d725-1346-4bb5-8db1-e61725304fd2",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673872783",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:21:09Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/44d9d725-1346-4bb5-8db1-e61725304fd2/answer` → **200**

```json
{
  "command_id": "4730f0aa-7508-4f2e-9dc8-f159adcf0c0c"
}
```

```json
{
  "id": "44d9d725-1346-4bb5-8db1-e61725304fd2",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673872783",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
  "order_ids": [],
  "started_at": "2026-10-28T10:21:09Z",
  "answered_at": "2026-10-28T10:21:10.477248Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1859813536",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "b990714c-7814-4b32-a0c2-ccfcc5720b53",
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
  "id": "ea264312-03a8-49f9-8bb6-cb5a7a2d8025",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:26:10.808696Z",
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
  "command_id": "cc06dc59-ead8-439a-b5e6-aa5e6939953b",
  "quote_id": "ea264312-03a8-49f9-8bb6-cb5a7a2d8025",
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
    "phone": "+380673872783"
  },
  "call_id": "44d9d725-1346-4bb5-8db1-e61725304fd2"
}
```

```json
{
  "id": "d2e99dab-dba4-4423-8c40-111b58cbce59",
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
  "created_at": "2026-10-28T10:21:11.127407Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673872783"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

**Contract validation failed — scenario stopped.**

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-16928"
}
```

```json
{
  "challenge_id": "772c6f3c-7082-4206-aadd-7145162c04eb",
  "expires_at": "2026-10-28T10:26:11.421556997Z",
  "resend_available_at": "2026-10-28T10:21:12.421556997Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "758083",
  "sent_at": "2026-10-28T10:21:11.423855554Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "772c6f3c-7082-4206-aadd-7145162c04eb",
  "code": "758083",
  "device_ref": "sandbox-16928"
}
```

```json
{
  "session_id": "e731b6b6-3897-4e0f-a388-3ace67d3ab10",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mzc3MSwiaWF0IjoxNzkzMTgyODcxLCJqdGkiOiIyN2IzYzExNy0zNmEzLTQzOTYtODRjNy1lYjVhNWJjODhmZGUiLCJzaWQiOiJlNzMxYjZiNi0zODk3LTRlMGYtYTM4OC0zYWNlNjdkM2FiMTAifQ.AfHhkhBQUvCox2mMH-cmhEmO_dUwcTtudB_nO5BpLtg",
  "access_expires_at": "2026-10-28T10:36:11.710916117Z",
  "refresh_token": "-TtqBcKdRNubv7lnRnlzs5E578NBaYG_gaABxM3jGkw",
  "refresh_expires_at": "2026-11-27T10:21:11.710353066Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "edc5d843-3fcf-49a7-a67b-6d1ff5a8b594",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:21:00.916826Z",
  "last_location_at": "2026-10-28T10:21:00.916826Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/edc5d843-3fcf-49a7-a67b-6d1ff5a8b594/handover` → **200**

```json
{
  "command_id": "eee84747-db75-4bb7-8ac8-dd8e1c15188d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "edc5d843-3fcf-49a7-a67b-6d1ff5a8b594",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:21:00.916826Z",
  "last_location_at": "2026-10-28T10:21:00.916826Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/edc5d843-3fcf-49a7-a67b-6d1ff5a8b594/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:21:12Z",
    "sequence": 1793182872510
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "edc5d843-3fcf-49a7-a67b-6d1ff5a8b594",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:21:12.529744Z",
  "last_location_at": "2026-10-28T10:21:12.529744Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668456474",
  "device_ref": "sandbox-16227"
}
```

```json
{
  "challenge_id": "38cb987c-89ff-4b63-a531-940220d61684",
  "expires_at": "2026-10-28T10:26:12.79250541Z",
  "resend_available_at": "2026-10-28T10:21:13.79250541Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668456474` → **200**

```json
{
  "phone": "+380668456474",
  "audience": "CLIENT",
  "code": "749100",
  "sent_at": "2026-10-28T10:21:12.79505563Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "38cb987c-89ff-4b63-a531-940220d61684",
  "code": "749100",
  "device_ref": "sandbox-16227"
}
```

```json
{
  "session_id": "23821211-eec9-4e39-80d3-3f5ce0f8c3cd",
  "subject": {
    "type": "CLIENT",
    "id": "2728329c-7731-4644-98db-26ec7f25d2d7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNzI4MzI5Yy03NzMxLTQ2NDQtOThkYi0yNmVjN2YyNWQyZDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNzczLCJpYXQiOjE3OTMxODI4NzMsImp0aSI6ImY3ODQ1OTdkLTk2MjctNDgyNy05OTFlLWQ5ZjBmZGZmMDA1ZiIsInNpZCI6IjIzODIxMjExLWVlYzktNGUzOS04MGQzLTNmNWNlMGY4YzNjZCJ9.3wEtCOb0dC8TSIAhdBv__6Biq8DDjW3VGsqQ0TkHUzo",
  "access_expires_at": "2026-10-28T10:36:13.076961187Z",
  "refresh_token": "3cP0Te6fKeDhPcUcoIZY5BGYKiWharQt4Iraqk23RWE",
  "refresh_expires_at": "2026-11-27T10:21:13.076370363Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "38d350c1-1df0-4502-9f4e-9d2d9b369aba",
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
  "id": "881485bb-6326-472f-8bc5-91ca1466fc33",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:26:13.341581Z",
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
  "command_id": "729d5590-4943-4df3-9e35-74bb82a422e4",
  "quote_id": "881485bb-6326-472f-8bc5-91ca1466fc33",
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
  "id": "5f4a8876-13a9-4208-8be0-5c34ce81790b",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2728329c-7731-4644-98db-26ec7f25d2d7",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T10:21:13.61207Z",
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
    "id": "ae5596d0-825d-4fbf-a061-09958b8ce6e9",
    "order_id": "d2e99dab-dba4-4423-8c40-111b58cbce59",
    "expires_at": "2026-10-28T10:21:26.131835Z",
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
    "distance_m": 2667
  }
]
```

`POST /api/driver/v1/offers/ae5596d0-825d-4fbf-a061-09958b8ce6e9/accept` → **200**

```json
{
  "command_id": "9356d55e-7924-4482-9ce6-233ab18042f4"
}
```

```json
{
  "id": "76af0143-0b20-4dff-b4e4-5e32b02bbc28",
  "order_id": "d2e99dab-dba4-4423-8c40-111b58cbce59",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9d075652-9f27-4c51-b5c0-ffb63d057ff2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9d075652-9f27-4c51-b5c0-ffb63d057ff2",
  "order_id": "d2e99dab-dba4-4423-8c40-111b58cbce59",
  "assignment_id": "76af0143-0b20-4dff-b4e4-5e32b02bbc28",
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
    "name": "Caller",
    "phone": "+380673872783"
  }
}
```

`POST /api/driver/v1/work-sessions/edc5d843-3fcf-49a7-a67b-6d1ff5a8b594/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:21:14Z",
    "sequence": 1793182874690
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "edc5d843-3fcf-49a7-a67b-6d1ff5a8b594",
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
  "last_heartbeat_at": "2026-10-28T10:21:14.710087Z",
  "last_location_at": "2026-10-28T10:21:14.710087Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9d075652-9f27-4c51-b5c0-ffb63d057ff2/arrive` → **422**

```json
{
  "command_id": "4a24b176-9e7b-44ab-958d-58c0f7488297",
  "expected_version": 0
}
```

```json
{
  "instance": "/api/driver/v1/trips/9d075652-9f27-4c51-b5c0-ffb63d057ff2/arrive",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "8f887507-c7d4-43eb-93c3-c03266490fc6"
}
```

**Expected 200, got 422 — scenario stopped.**

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
  "session_id": "f02377e1-ab1a-4119-96a3-e8cdadb1a34e",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM3NzUsImlhdCI6MTc5MzE4Mjg3NSwianRpIjoiZjY4Y2EyYjYtMTcyYy00YjlmLWJlMmQtMjM0NGMyMWRmOTA1Iiwic2lkIjoiZjAyMzc3ZTEtYWIxYS00MTE5LTk2YTMtZThjZGFkYjFhMzRlIn0.KpF43kDVJ_CXRgxjkhZzLDNlYwQBfkPfHH1quhLKTOQ",
  "access_expires_at": "2026-10-28T10:36:15.579279304Z",
  "refresh_token": "4nhGskiVysfQs7X806ci63GHzjmfrnZmByPQ4Gy5rck",
  "refresh_expires_at": "2026-10-28T22:21:15.578731902Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "650a673d-2101-4bb8-8831-81ea872da281",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:21:15Z"
}
```

```json
{
  "id": "90e19e30-ad3a-4d54-9e1c-5101cc7a68f6",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:21:15Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/90e19e30-ad3a-4d54-9e1c-5101cc7a68f6/publish` → **200**

```json
{
  "command_id": "0e1a4dd0-5f48-4de5-846a-33c518ea7e83",
  "expected_version": 0
}
```

```json
{
  "id": "90e19e30-ad3a-4d54-9e1c-5101cc7a68f6",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:21:16.130487Z",
  "published_at": "2026-10-28T10:21:16.130487Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "90e19e30-ad3a-4d54-9e1c-5101cc7a68f6",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T10:21:16.130487Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633257402",
  "device_ref": "sandbox-23146"
}
```

```json
{
  "challenge_id": "b310c565-e0ab-435d-badb-7200c5f8fa28",
  "expires_at": "2026-10-28T10:26:16.659955119Z",
  "resend_available_at": "2026-10-28T10:21:17.659955119Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633257402` → **200**

```json
{
  "phone": "+380633257402",
  "audience": "CLIENT",
  "code": "006264",
  "sent_at": "2026-10-28T10:21:16.663104968Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b310c565-e0ab-435d-badb-7200c5f8fa28",
  "code": "006264",
  "device_ref": "sandbox-23146"
}
```

```json
{
  "session_id": "6a0621c5-80bf-4d10-ae4e-5c096e852de1",
  "subject": {
    "type": "CLIENT",
    "id": "d8f47941-fceb-4ea5-9b51-a9dee8cc4518"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkOGY0Nzk0MS1mY2ViLTRlYTUtOWI1MS1hOWRlZThjYzQ1MTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNzc2LCJpYXQiOjE3OTMxODI4NzYsImp0aSI6IjY3YjExZWQ0LTA0NmMtNGFjYS05N2IzLTJiNGQwYTU1OGY4NSIsInNpZCI6IjZhMDYyMWM1LTgwYmYtNGQxMC1hZTRlLTVjMDk2ZTg1MmRlMSJ9.C_Ur6bcjUX9oDycjZNaNKm8VA7WxDifH0Fx9Z0R78S0",
  "access_expires_at": "2026-10-28T10:36:16.941811408Z",
  "refresh_token": "XLl3OVxd97MidgAHyVw5cGFWbmG2urUzfdPMGBa9BiM",
  "refresh_expires_at": "2026-11-27T10:21:16.941142888Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "90e19e30-ad3a-4d54-9e1c-5101cc7a68f6",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T10:21:16.130487Z",
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
  "command_id": "940d4995-be9f-48bb-afd1-77f4489c57b4",
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
  "id": "8d12886c-06fd-4c0c-bf32-6e0e19b25141",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:26:17.459279Z",
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
  "command_id": "30291452-901f-48a7-96a1-fd2285c0be82",
  "quote_id": "8d12886c-06fd-4c0c-bf32-6e0e19b25141",
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
  "correlation_id": "0e971ab1-fa83-40b0-9a25-8f21b5bcbc9b"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "f9d2df11-8bc4-44a4-8097-61b4aefccaf3",
  "version_id": "90e19e30-ad3a-4d54-9e1c-5101cc7a68f6",
  "language": "uk"
}
```

```json
{
  "version_id": "90e19e30-ad3a-4d54-9e1c-5101cc7a68f6",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T10:21:17.991506Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0ed7831b-f23b-4b80-918b-9dbfa960bcf3",
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
  "id": "9b201248-d57f-4705-a804-3a581f57abbe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:26:18.255036Z",
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
  "command_id": "d29738d5-7062-445e-ac99-84ea2335ef31",
  "quote_id": "9b201248-d57f-4705-a804-3a581f57abbe",
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
  "id": "f530e03a-84ac-4ea7-9065-c492f7a175fc",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d8f47941-fceb-4ea5-9b51-a9dee8cc4518",
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
  "created_at": "2026-10-28T10:21:18.529455Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/f530e03a-84ac-4ea7-9065-c492f7a175fc` → **200**

```json
{
  "id": "f530e03a-84ac-4ea7-9065-c492f7a175fc",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d8f47941-fceb-4ea5-9b51-a9dee8cc4518",
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
  "created_at": "2026-10-28T10:21:18.529455Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/f530e03a-84ac-4ea7-9065-c492f7a175fc/cancel` → **200**

```json
{
  "command_id": "0a3f96b7-f44b-4de2-aa4b-b6122e4f05e7",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f530e03a-84ac-4ea7-9065-c492f7a175fc",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d8f47941-fceb-4ea5-9b51-a9dee8cc4518",
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
  "created_at": "2026-10-28T10:21:18.529455Z",
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

## A published version never changes

`POST /api/admin/v1/legal-documents/90e19e30-ad3a-4d54-9e1c-5101cc7a68f6` → **409**

```json
{
  "command_id": "d02ba6ff-92c0-4a77-b7f6-5dd1d89b704e",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:21:19Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/90e19e30-ad3a-4d54-9e1c-5101cc7a68f6",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3388ec15-7162-478d-92b2-56ea1899a32f"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "a635bc8b-30dd-4334-b1ad-91819ec81844",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:21:19Z"
}
```

```json
{
  "id": "1b50ef53-cdbd-4353-9db9-d4c8fb8139f3",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:21:19Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/1b50ef53-cdbd-4353-9db9-d4c8fb8139f3/publish` → **200**

```json
{
  "command_id": "6f884e5d-ef77-4616-811e-4c4b9dc0ead3",
  "expected_version": 0
}
```

```json
{
  "id": "1b50ef53-cdbd-4353-9db9-d4c8fb8139f3",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:21:19.930978Z",
  "published_at": "2026-10-28T10:21:19.930978Z",
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
  "device_ref": "sandbox-29561"
}
```

```json
{
  "challenge_id": "f8c5220a-9184-47d5-a48d-419c63b2fbd0",
  "expires_at": "2026-10-28T10:26:20.204303823Z",
  "resend_available_at": "2026-10-28T10:21:21.204303823Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "390723",
  "sent_at": "2026-10-28T10:21:20.207329278Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f8c5220a-9184-47d5-a48d-419c63b2fbd0",
  "code": "390723",
  "device_ref": "sandbox-29561"
}
```

```json
{
  "session_id": "e56227dc-3655-4db1-ab1d-830ed9d848e3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mzc4MCwiaWF0IjoxNzkzMTgyODgwLCJqdGkiOiJiY2I0MWExMy0xOTdiLTQxMjctYWI2My1jZDc5YWFkMjAxMGUiLCJzaWQiOiJlNTYyMjdkYy0zNjU1LTRkYjEtYWIxZC04MzBlZDlkODQ4ZTMifQ.gEUjszyOJ9ZU70M_xMuM47yUV1Cd3MyZhRgBuHCumhY",
  "access_expires_at": "2026-10-28T10:36:20.495469491Z",
  "refresh_token": "dhGFGyUPiFouqVo4O1XP1L9wgxFWzA7bMvH2IYEIrrM",
  "refresh_expires_at": "2026-11-27T10:21:20.49493856Z",
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
  "command_id": "93b97178-bd50-43af-9e95-48583240c154",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:21:21Z",
    "sequence": 1793182881707
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7718745a-344a-4621-81c2-116983f98439",
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
  "last_heartbeat_at": "2026-10-28T10:21:21.025109Z",
  "last_location_at": "2026-10-28T10:21:21.025109Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678680450",
  "device_ref": "sandbox-29612"
}
```

```json
{
  "challenge_id": "de69e114-0480-4d2b-9c2e-b9ff53f51a3e",
  "expires_at": "2026-10-28T10:26:21.30513369Z",
  "resend_available_at": "2026-10-28T10:21:22.30513369Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678680450` → **200**

```json
{
  "phone": "+380678680450",
  "audience": "CLIENT",
  "code": "950897",
  "sent_at": "2026-10-28T10:21:21.3076361Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "de69e114-0480-4d2b-9c2e-b9ff53f51a3e",
  "code": "950897",
  "device_ref": "sandbox-29612"
}
```

```json
{
  "session_id": "9e417c06-d085-45ac-949f-7e1ad9f1fd9b",
  "subject": {
    "type": "CLIENT",
    "id": "e9f025c2-9481-4932-b525-ac4349c89de7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOWYwMjVjMi05NDgxLTQ5MzItYjUyNS1hYzQzNDljODlkZTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNzgxLCJpYXQiOjE3OTMxODI4ODEsImp0aSI6ImMxZGZiNzI4LWU2NTEtNGM4Yi05NzRiLTUyOWQyNjg2ZjM4MCIsInNpZCI6IjllNDE3YzA2LWQwODUtNDVhYy05NDlmLTdlMWFkOWYxZmQ5YiJ9.M3m1jeEyffdTi8bqMbABDLl-ez5hy710Vl9oLX-Cu0I",
  "access_expires_at": "2026-10-28T10:36:21.587193535Z",
  "refresh_token": "3nY8_-z5NDQXTkvATWA28pLZvR9Y68LsFcztzwfjxco",
  "refresh_expires_at": "2026-11-27T10:21:21.586637677Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3ae5ac67-861f-4576-8277-d8d59b3049ea",
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
  "id": "a12827d7-860f-49ad-b5df-13514a779610",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:26:21.852044Z",
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
  "command_id": "7e86f462-8e18-4ee4-a31d-4df5278289a8",
  "quote_id": "a12827d7-860f-49ad-b5df-13514a779610",
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
    "phone": "+380670050295"
  }
}
```

```json
{
  "id": "4f402854-15e1-46c1-a783-1ebbf7d81a8f",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e9f025c2-9481-4932-b525-ac4349c89de7",
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
  "created_at": "2026-10-28T10:21:22.132851Z",
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
    "id": "463605b9-5fd5-4708-847c-3df1d76d5ff3",
    "order_id": "4f402854-15e1-46c1-a783-1ebbf7d81a8f",
    "expires_at": "2026-10-28T10:21:37.13681Z",
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

`POST /api/driver/v1/offers/463605b9-5fd5-4708-847c-3df1d76d5ff3/accept` → **200**

```json
{
  "command_id": "5b8e1294-5f2b-4c06-b99d-a4399bb34a85"
}
```

```json
{
  "id": "1fb11856-3d91-418b-8da7-d9f2ea140bd3",
  "order_id": "4f402854-15e1-46c1-a783-1ebbf7d81a8f",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "be791c6d-8e6f-4c40-93a6-8534f46e97d7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "be791c6d-8e6f-4c40-93a6-8534f46e97d7",
  "order_id": "4f402854-15e1-46c1-a783-1ebbf7d81a8f",
  "assignment_id": "1fb11856-3d91-418b-8da7-d9f2ea140bd3",
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
    "phone": "+380670050295"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "08283e16-ce20-4b45-bc75-d073107a6712",
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
  "id": "77ec4419-5cf4-4a2a-a748-5dcf8e91f4a2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:26:23.224835Z",
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
  "command_id": "caf61bbe-e435-4fab-958f-23a52ac21e86",
  "quote_id": "77ec4419-5cf4-4a2a-a748-5dcf8e91f4a2",
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
  "id": "44b88ba2-c6a4-40e5-9334-26cbf68bbb63",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e9f025c2-9481-4932-b525-ac4349c89de7",
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
  "created_at": "2026-10-28T10:21:23.502164Z",
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
  "command_id": "2be6960c-520b-4a7b-931c-c4b0de21ccc7",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T13:21:23Z"
}
```

```json
{
  "id": "0c1ecaa5-6c3f-49d5-8b0b-1a597b097904",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:26:23.796978Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T13:21:23Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0484e504-cc67-4c6c-a74e-5dbebaaf9664",
  "quote_id": "0c1ecaa5-6c3f-49d5-8b0b-1a597b097904",
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
  "pickup_at": "2026-10-28T13:21:23Z"
}
```

```json
{
  "id": "ad45e077-a2a1-48ea-b027-32d755f7e656",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e9f025c2-9481-4932-b525-ac4349c89de7",
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
  "created_at": "2026-10-28T10:21:24.073072Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:21:23Z",
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
  "command_id": "14300e17-79c1-49c7-8582-2aeb2610dca4",
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
  "id": "7f70aac5-450c-4f69-9ae1-e50da023b039",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:26:24.353656Z",
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
  "command_id": "6e7ac772-7d9b-4f22-84b2-376d17e67b73",
  "quote_id": "7f70aac5-450c-4f69-9ae1-e50da023b039",
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
  "correlation_id": "51239d2a-850c-4a30-b230-9b94d82fbead"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "ad45e077-a2a1-48ea-b027-32d755f7e656",
      "short_number": 13,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "e9f025c2-9481-4932-b525-ac4349c89de7",
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
      "created_at": "2026-10-28T10:21:24.073072Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T13:21:23Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "44b88ba2-c6a4-40e5-9334-26cbf68bbb63",
      "short_number": 12,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "e9f025c2-9481-4932-b525-ac4349c89de7",
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
      "created_at": "2026-10-28T10:21:23.502164Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "4f402854-15e1-46c1-a783-1ebbf7d81a8f",
      "short_number": 11,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "e9f025c2-9481-4932-b525-ac4349c89de7",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "44b88ba2-c6a4-40e5-9334-26cbf68bbb63",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e9f025c2-9481-4932-b525-ac4349c89de7",
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
  "created_at": "2026-10-28T10:21:23.502164Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/4f402854-15e1-46c1-a783-1ebbf7d81a8f` → **200**

```json
{
  "id": "4f402854-15e1-46c1-a783-1ebbf7d81a8f",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e9f025c2-9481-4932-b525-ac4349c89de7",
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
    "id": "1fb11856-3d91-418b-8da7-d9f2ea140bd3",
    "order_id": "4f402854-15e1-46c1-a783-1ebbf7d81a8f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "be791c6d-8e6f-4c40-93a6-8534f46e97d7",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T10:21:22.132851Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/4f402854-15e1-46c1-a783-1ebbf7d81a8f/cancel` → **200**

```json
{
  "command_id": "0832e3bf-5b76-4e30-82ee-22147717ea64",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4f402854-15e1-46c1-a783-1ebbf7d81a8f",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "e9f025c2-9481-4932-b525-ac4349c89de7",
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
    "id": "1fb11856-3d91-418b-8da7-d9f2ea140bd3",
    "order_id": "4f402854-15e1-46c1-a783-1ebbf7d81a8f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "be791c6d-8e6f-4c40-93a6-8534f46e97d7",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T10:21:22.132851Z",
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

`GET /api/rider/v1/orders/44b88ba2-c6a4-40e5-9334-26cbf68bbb63` → **200**

```json
{
  "id": "44b88ba2-c6a4-40e5-9334-26cbf68bbb63",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e9f025c2-9481-4932-b525-ac4349c89de7",
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
  "created_at": "2026-10-28T10:21:23.502164Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/44b88ba2-c6a4-40e5-9334-26cbf68bbb63/cancel` → **200**

```json
{
  "command_id": "71038179-96e4-4c96-a2ec-db6e7ceb3c49",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "44b88ba2-c6a4-40e5-9334-26cbf68bbb63",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e9f025c2-9481-4932-b525-ac4349c89de7",
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
  "created_at": "2026-10-28T10:21:23.502164Z",
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

`GET /api/rider/v1/orders/ad45e077-a2a1-48ea-b027-32d755f7e656` → **200**

```json
{
  "id": "ad45e077-a2a1-48ea-b027-32d755f7e656",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e9f025c2-9481-4932-b525-ac4349c89de7",
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
  "created_at": "2026-10-28T10:21:24.073072Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:21:23Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/ad45e077-a2a1-48ea-b027-32d755f7e656/cancel` → **200**

```json
{
  "command_id": "53e7fbdb-b282-4d1c-a0f4-8ce021921412",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ad45e077-a2a1-48ea-b027-32d755f7e656",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "e9f025c2-9481-4932-b525-ac4349c89de7",
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
  "created_at": "2026-10-28T10:21:24.073072Z",
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
  "pickup_at": "2026-10-28T13:21:23Z",
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
  "session_id": "7718745a-344a-4621-81c2-116983f98439",
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
  "last_heartbeat_at": "2026-10-28T10:21:21.025109Z",
  "last_location_at": "2026-10-28T10:21:21.025109Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7718745a-344a-4621-81c2-116983f98439/close` → **200**

```json
{
  "command_id": "ba73d8e6-8635-4bc4-9aef-bc832b378ab5",
  "expected_version": 0
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

Done: orders 4f402854-15e1-46c1-a783-1ebbf7d81a8f, 44b88ba2-c6a4-40e5-9334-26cbf68bbb63, ad45e077-a2a1-48ea-b027-32d755f7e656.

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
  "session_id": "498f7864-7202-4f50-a4a9-2b0734aa7075",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM3ODcsImlhdCI6MTc5MzE4Mjg4NywianRpIjoiNTYzYzA0OWMtMmNlOC00OTNkLWIyNmUtOTRlNzI4NDhiYzJiIiwic2lkIjoiNDk4Zjc4NjQtNzIwMi00ZjUwLWE0YTktMmIwNzM0YWE3MDc1In0.7vNF1ynf41uRd-fKVmbwgTvPHDQl_EUxEyQ7Ul-hAJQ",
  "access_expires_at": "2026-10-28T10:36:27.973977171Z",
  "refresh_token": "Ayo1jGJ70PD2IYDuWXtcsXnyiM8LYPB009JxjSL9o-Q",
  "refresh_expires_at": "2026-10-28T22:21:27.973419871Z",
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
  "session_id": "a90118f6-6790-40ee-be27-75cf4aea2169",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM3ODgsImlhdCI6MTc5MzE4Mjg4OCwianRpIjoiNDFhYjhiMTAtZjE1MS00OGY0LTk4MmQtOGQ3ZGUxNjQ4YzhmIiwic2lkIjoiYTkwMTE4ZjYtNjc5MC00MGVlLWJlMjctNzVjZjRhZWEyMTY5In0.Ou6UN9dAcZ4SC0C2qnH-s_pkK2mxSmE0HYnwfbso97I",
  "access_expires_at": "2026-10-28T10:36:28.528978562Z",
  "refresh_token": "BR24bU6Ka_r4eHPZsZISK9yiqB6qaApI6bbtjk6ONpE",
  "refresh_expires_at": "2026-10-28T22:21:28.528400722Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10114"
}
```

```json
{
  "challenge_id": "f0325733-9806-4a57-a849-1edbc8c5a49a",
  "expires_at": "2026-10-28T10:26:28.791267259Z",
  "resend_available_at": "2026-10-28T10:21:29.791267259Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "564098",
  "sent_at": "2026-10-28T10:21:28.793578128Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f0325733-9806-4a57-a849-1edbc8c5a49a",
  "code": "564098",
  "device_ref": "sandbox-10114"
}
```

```json
{
  "session_id": "a318e144-7b5c-4c23-bd4f-793dbe4d0410",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mzc4OSwiaWF0IjoxNzkzMTgyODg5LCJqdGkiOiIwZTlkY2Y2MC05NjViLTRjZmEtYjA5YS03OTAyMTNiYWYxZDQiLCJzaWQiOiJhMzE4ZTE0NC03YjVjLTRjMjMtYmQ0Zi03OTNkYmU0ZDA0MTAifQ._DzGaZEhNMXLlSv6tzv0EOA_poDtyOEIrsSpLD0TYl8",
  "access_expires_at": "2026-10-28T10:36:29.083995505Z",
  "refresh_token": "udEnvY4w83p_F0E_mIOnszgHzZ4lGhLIk9pRGNRtg-A",
  "refresh_expires_at": "2026-11-27T10:21:29.083442953Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "edc5d843-3fcf-49a7-a67b-6d1ff5a8b594",
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
  "last_heartbeat_at": "2026-10-28T10:21:14.710087Z",
  "last_location_at": "2026-10-28T10:21:14.710087Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/edc5d843-3fcf-49a7-a67b-6d1ff5a8b594/handover` → **200**

```json
{
  "command_id": "c6d0388b-04bb-4a6f-973d-5a042ba1f6ec",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "edc5d843-3fcf-49a7-a67b-6d1ff5a8b594",
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
  "last_heartbeat_at": "2026-10-28T10:21:14.710087Z",
  "last_location_at": "2026-10-28T10:21:14.710087Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/edc5d843-3fcf-49a7-a67b-6d1ff5a8b594/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:21:29Z",
    "sequence": 1793182889870
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "edc5d843-3fcf-49a7-a67b-6d1ff5a8b594",
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
  "last_heartbeat_at": "2026-10-28T10:21:29.888807Z",
  "last_location_at": "2026-10-28T10:21:29.888807Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
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
  "command_id": "bff00087-f446-4fcd-ac81-b589dc91373d",
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
  "effective_at": "2026-10-28T10:21:30.450216Z",
  "changed_by": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T10:21:30.733801121Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "3669d73b-174d-4222-bee8-36616e76dc29",
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
  "id": "450d341f-ffec-47ad-a800-ef00f596b0af",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:26:31.005171Z",
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
  "command_id": "057c4dc0-f853-4bb2-9502-52865a8ec62f",
  "quote_id": "450d341f-ffec-47ad-a800-ef00f596b0af",
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
    "phone": "+380671112387"
  }
}
```

```json
{
  "id": "7d6fca22-872d-4944-9489-40f92e89c00e",
  "short_number": 14,
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T10:21:31.277461Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671112387"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

**Contract validation failed — scenario stopped.**

`GET /api/driver/v1/offers` → **200**

```json
[]
```

`POST /api/driver/v1/offers/null/accept` → **400**

```json
{
  "command_id": "58de8f08-ee3f-4a01-a20c-a0edf1333550"
}
```

```json
{
  "instance": "/api/driver/v1/offers/null/accept",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "76df8fe3-77a3-43a4-9077-599fff33a348"
}
```

**Expected 200, got 400 — scenario stopped.**

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675619132",
  "device_ref": "sandbox-8152"
}
```

```json
{
  "challenge_id": "7f306116-87d8-42ac-b252-f1940b792b19",
  "expires_at": "2026-10-28T10:26:32.143766858Z",
  "resend_available_at": "2026-10-28T10:21:33.143766858Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675619132` → **200**

```json
{
  "phone": "+380675619132",
  "audience": "CLIENT",
  "code": "995322",
  "sent_at": "2026-10-28T10:21:32.145856439Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670024100",
  "device_ref": "sandbox-20238",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "bad85fe5-7930-4210-9bf7-3d7bc0d63c53",
  "expires_at": "2026-10-28T10:26:32.434265188Z",
  "resend_available_at": "2026-10-28T10:21:33.434265188Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670024100` → **200**

```json
{
  "phone": "+380670024100",
  "audience": "CLIENT",
  "code": "994472",
  "sent_at": "2026-10-28T10:21:32.436645627Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677750000",
  "device_ref": "sandbox-19298"
}
```

```json
{
  "challenge_id": "1de0b36d-f16f-4bb6-9600-300a7cfbea46",
  "expires_at": "2026-10-28T10:26:32.725404216Z",
  "resend_available_at": "2026-10-28T10:21:33.725404216Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677750000` → **200**

```json
{
  "phone": "+380677750000",
  "audience": "CLIENT",
  "code": "205745",
  "sent_at": "2026-10-28T10:21:32.728087787Z",
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
  "session_id": "5951c303-ee38-44cb-a063-64fdd0693a5e",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM3OTMsImlhdCI6MTc5MzE4Mjg5MywianRpIjoiMWVmZjg4N2YtODRmYS00OTQyLWFiZjUtNTBmNTEyNTgxMjc2Iiwic2lkIjoiNTk1MWMzMDMtZWUzOC00NGNiLWEwNjMtNjRmZGQwNjkzYTVlIn0.OGUvuSUFiJ8POaiXhvhAJVpUL4McobFuNmFsSrlHbYc",
  "access_expires_at": "2026-10-28T10:36:33.297991208Z",
  "refresh_token": "YWFCB_XElpysuK_-61oJsszJHD-7oLvykKJxM8OzzEY",
  "refresh_expires_at": "2026-10-28T22:21:33.297410513Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677750000` → **200**

```json
{
  "deliveries": [
    {
      "id": "11788d00-990e-4a78-bc45-fa37a1128bd4",
      "challenge_id": "1de0b36d-f16f-4bb6-9600-300a7cfbea46",
      "phone": "+380677750000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-15ac4079-4566-44dc-9826-5e7791dcbd53",
      "error": null,
      "attempted_at": "2026-10-28T10:21:32.7283Z"
    },
    {
      "id": "46b32eae-a2d2-4d2c-ae52-b93c3a6fb693",
      "challenge_id": "1de0b36d-f16f-4bb6-9600-300a7cfbea46",
      "phone": "+380677750000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T10:21:32.727588Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380677750000` → **200**

```json
{
  "phone": "+380677750000",
  "audience": "CLIENT",
  "code": "205745",
  "sent_at": "2026-10-28T10:21:32.728087787Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670024100` → **200**

```json
{
  "deliveries": [
    {
      "id": "b5a83d17-f49b-405c-869c-3bff606b49e5",
      "challenge_id": "bad85fe5-7930-4210-9bf7-3d7bc0d63c53",
      "phone": "+380670024100",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-56a4b2b2-6f3d-4a46-9f64-718508c69f08",
      "error": null,
      "attempted_at": "2026-10-28T10:21:32.436911Z"
    }
  ]
}
```

Done: SMS to +380675619132, a call to +380670024100, SMS then a call to +380677750000.

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
  "session_id": "104a3e58-a3a7-4edc-8a7d-e1c115a17a1a",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM3OTQsImlhdCI6MTc5MzE4Mjg5NCwianRpIjoiYjJlNjZiMWMtN2VjOC00NTQwLThiNmQtNDU5NmNiOTg0ZGJlIiwic2lkIjoiMTA0YTNlNTgtYTNhNy00ZWRjLThhN2QtZTFjMTE1YTE3YTFhIn0.uDvH_tIROebgP2WZ2exNAx66-3bhyzS8NV-srVEJ5Rw",
  "access_expires_at": "2026-10-28T10:36:34.424443158Z",
  "refresh_token": "4Uc25v0XkLBeweZhm7Z77HhBGfdGLEGfTRhQVTJ8QEI",
  "refresh_expires_at": "2026-10-28T22:21:34.423834801Z",
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
  "session_id": "81434b29-cf97-4651-9058-6436ea97d533",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM3OTQsImlhdCI6MTc5MzE4Mjg5NCwianRpIjoiZjkwYTlkODMtNmFlNy00M2ZhLTgyYTctN2QyOTA4M2E0NDkzIiwic2lkIjoiODE0MzRiMjktY2Y5Ny00NjUxLTkwNTgtNjQzNmVhOTdkNTMzIn0.vimppc8vij9o086PTK74OcJ2-Y0DceemwO12aDIGCNE",
  "access_expires_at": "2026-10-28T10:36:34.974578971Z",
  "refresh_token": "k0QBy0F2EfG4O8VcXFUtYahFXPW-6rFvnsRdpeYOR88",
  "refresh_expires_at": "2026-10-28T22:21:34.974005981Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
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

`POST /api/admin/v1/staff-extensions/8fa91117-f61a-4c8e-a789-3932a5d4573a` → **200**

```json
{
  "command_id": "9e305401-395a-4d36-b35a-140463afc9df",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "56503415-9c0e-48e9-bebf-8d46cd8b20cf",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T10:21:36.071539Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T10:21:36.071539Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ce697607-9463-4b6c-9634-5e3013f292dd",
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
  "id": "e5b619ba-9b37-445f-ad5a-3bbf10c5169d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:26:36.604211Z",
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
  "command_id": "b54c4958-f755-4989-8c5c-187496f52bfd",
  "quote_id": "e5b619ba-9b37-445f-ad5a-3bbf10c5169d",
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
    "phone": "+380675970406"
  }
}
```

```json
{
  "id": "96400d45-1276-43ff-b053-28e44382e785",
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
  "created_at": "2026-10-28T10:21:36.890443Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675970406"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

**Contract validation failed — scenario stopped.**

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633973367",
  "device_ref": "sandbox-24171"
}
```

```json
{
  "challenge_id": "3dfca2a6-a674-4207-a4b1-6f3b0e2076f0",
  "expires_at": "2026-10-28T10:26:37.203154627Z",
  "resend_available_at": "2026-10-28T10:21:38.203154627Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633973367` → **200**

```json
{
  "phone": "+380633973367",
  "audience": "CLIENT",
  "code": "399105",
  "sent_at": "2026-10-28T10:21:37.205332992Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3dfca2a6-a674-4207-a4b1-6f3b0e2076f0",
  "code": "399105",
  "device_ref": "sandbox-24171"
}
```

```json
{
  "session_id": "4d1a11a6-abcb-4f99-91f1-def401da7072",
  "subject": {
    "type": "CLIENT",
    "id": "a4df89a9-8aa4-44e4-b9f3-de035af5a3ca"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNGRmODlhOS04YWE0LTQ0ZTQtYjlmMy1kZTAzNWFmNWEzY2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzNzk3LCJpYXQiOjE3OTMxODI4OTcsImp0aSI6IjQxNmU2M2IyLTBlN2EtNGNlZi1hZTc5LTRjMDQ4MDlmMDU1ZCIsInNpZCI6IjRkMWExMWE2LWFiY2ItNGY5OS05MWYxLWRlZjQwMWRhNzA3MiJ9.oSV9IdEPnHtU8Kl7u8I7kyrq8wtSXU_3jQYCp853w8k",
  "access_expires_at": "2026-10-28T10:36:37.49333124Z",
  "refresh_token": "V8GcqBNes8ZCM_EcwKcwsF0yZlXU4ZSLJAck02PGqQ0",
  "refresh_expires_at": "2026-11-27T10:21:37.492798024Z",
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
  "session_id": "ff284ff3-f6f2-436a-aa5d-5c4b0b579cbc",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM3OTgsImlhdCI6MTc5MzE4Mjg5OCwianRpIjoiMjk2MGYzZGItODA5Yy00M2RlLThhOWQtM2RmNTQ1YmE1NjRjIiwic2lkIjoiZmYyODRmZjMtZjZmMi00MzZhLWFhNWQtNWM0YjBiNTc5Y2JjIn0.gETGlp3jjTIU9mVX5Kcw9rHvrzUKbyK-IKWP0h1RWIY",
  "access_expires_at": "2026-10-28T10:36:38.604488998Z",
  "refresh_token": "kSCfdOOT_Q_qXyj2jve51L262cm839VzOOEl_DjRKv4",
  "refresh_expires_at": "2026-10-28T22:21:38.603926056Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380633973367` → **200**

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
  "correlation_id": "23cec1ca-8409-4cca-af71-27e387ab3843"
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
  "session_id": "ace2958f-f8bb-4ae4-b331-97a4ffeeb532",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM3OTksImlhdCI6MTc5MzE4Mjg5OSwianRpIjoiMGFkMjAwOTYtY2E2MC00MzEzLThhYjktOGRjZGQzZThjNDZiIiwic2lkIjoiYWNlMjk1OGYtZjhiYi00YWU0LWIzMzEtOTdhNGZmZWViNTMyIn0.aXbUHfm-OGRlvEr1ZkAgcJudUvpDgi68fXkai47ot2A",
  "access_expires_at": "2026-10-28T10:36:39.696289913Z",
  "refresh_token": "Gzolia3xmgxdJz0iS1GQnvxgJz-bFq0BzPi67qZ3R-Y",
  "refresh_expires_at": "2026-10-28T22:21:39.695749944Z",
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
  "command_id": "0c5c8772-4873-43eb-b3f1-b5f09988f55e",
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
  "changed_by": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T10:21:40.269750796Z"
}
```

## The rider books the airport for 2026-10-28T13:21:39Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600653487",
  "device_ref": "sandbox-24203"
}
```

```json
{
  "challenge_id": "89db3a71-78d0-46e4-80fa-0d7e06102af3",
  "expires_at": "2026-10-28T10:26:40.546767721Z",
  "resend_available_at": "2026-10-28T10:21:41.546767721Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600653487` → **200**

```json
{
  "phone": "+48600653487",
  "audience": "CLIENT",
  "code": "832499",
  "sent_at": "2026-10-28T10:21:40.548937353Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "89db3a71-78d0-46e4-80fa-0d7e06102af3",
  "code": "832499",
  "device_ref": "sandbox-24203"
}
```

```json
{
  "session_id": "fe875c2d-7318-4d80-afeb-9c4f58bb9449",
  "subject": {
    "type": "CLIENT",
    "id": "dcb7663b-5093-4496-b342-6ca619cf4af5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkY2I3NjYzYi01MDkzLTQ0OTYtYjM0Mi02Y2E2MTljZjRhZjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzODAwLCJpYXQiOjE3OTMxODI5MDAsImp0aSI6ImNmNzAyNzY0LWE5YzItNGIzNy1hNmUwLWY5OWQ4N2IwMzA4OSIsInNpZCI6ImZlODc1YzJkLTczMTgtNGQ4MC1hZmViLTljNGY1OGJiOTQ0OSJ9.y_V5DR6cYLLEnHuJmPj4A9dqsWayfBCMJK1NgrLrpHQ",
  "access_expires_at": "2026-10-28T10:36:40.845032921Z",
  "refresh_token": "OpFhg41FONDoMbUBUD79W899x-eY5tEd6RmRaJw7clw",
  "refresh_expires_at": "2026-11-27T10:21:40.844470711Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7caedf06-cc63-4a5c-a0cb-1b64ea7a2456",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T13:21:39Z"
}
```

```json
{
  "id": "f87c6c41-33cd-49b5-8fae-96f4f013b655",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:26:41.116236Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T13:21:39Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ee93e639-b021-46be-9dd6-9b432c41a198",
  "quote_id": "f87c6c41-33cd-49b5-8fae-96f4f013b655",
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
  "pickup_at": "2026-10-28T13:21:39Z"
}
```

```json
{
  "id": "695e6082-1feb-43d4-b588-0f047c106346",
  "short_number": 16,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "dcb7663b-5093-4496-b342-6ca619cf4af5",
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
  "created_at": "2026-10-28T10:21:41.386974Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:21:39Z",
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
  "device_ref": "sandbox-5232"
}
```

```json
{
  "challenge_id": "ee11aa72-61c6-4cc4-b603-4475e7e4b71d",
  "expires_at": "2026-10-28T10:26:41.663765603Z",
  "resend_available_at": "2026-10-28T10:21:42.663765603Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "337928",
  "sent_at": "2026-10-28T10:21:41.666546317Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ee11aa72-61c6-4cc4-b603-4475e7e4b71d",
  "code": "337928",
  "device_ref": "sandbox-5232"
}
```

```json
{
  "session_id": "afdd828f-64ea-4a37-a31a-834d40c7ae17",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzgwMSwiaWF0IjoxNzkzMTgyOTAxLCJqdGkiOiJlNmQ5ZGJkMC1kNjYxLTRkZDEtYTI0NS0yYzE0Yzk5ZGYyMTQiLCJzaWQiOiJhZmRkODI4Zi02NGVhLTRhMzctYTMxYS04MzRkNDBjN2FlMTcifQ.eTooagbtaZccgsJL554Asbd5S_I9fJkBWNST5mxLt5M",
  "access_expires_at": "2026-10-28T10:36:41.988389948Z",
  "refresh_token": "hxdnIm9F4Pixuy_uhZwmm8fEKCZ8FQJ49c37ixZ-tng",
  "refresh_expires_at": "2026-11-27T10:21:41.987702238Z",
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
  "command_id": "96ad4efa-5537-487c-976c-134ba3fbe915",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:21:42Z",
    "sequence": 1793182902510
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "305a4b81-e7ec-423f-bd02-1e2ee93a228b",
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
  "last_heartbeat_at": "2026-10-28T10:21:42.52857Z",
  "last_location_at": "2026-10-28T10:21:42.52857Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "695e6082-1feb-43d4-b588-0f047c106346",
      "short_number": 16,
      "pickup_at": "2026-10-28T13:21:39Z",
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

`POST /api/driver/v1/preorders/695e6082-1feb-43d4-b588-0f047c106346/reserve` → **200**

```json
{
  "command_id": "0f2edbc6-552d-46ec-9e4d-2075a8937002"
}
```

```json
{
  "id": "337986b3-2b7f-4ef8-a346-e51425f5fac6",
  "state": "RESERVED",
  "order": {
    "order_id": "695e6082-1feb-43d4-b588-0f047c106346",
    "short_number": 16,
    "pickup_at": "2026-10-28T13:21:39Z",
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
  "reserved_at": "2026-10-28T10:21:43.063485Z",
  "confirm_from": "2026-10-28T12:51:39Z",
  "confirm_until": "2026-10-28T13:01:39Z",
  "drop_until": "2026-10-28T12:21:39Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "337986b3-2b7f-4ef8-a346-e51425f5fac6",
      "state": "RESERVED",
      "order": {
        "order_id": "695e6082-1feb-43d4-b588-0f047c106346",
        "short_number": 16,
        "pickup_at": "2026-10-28T13:21:39Z",
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
      "reserved_at": "2026-10-28T10:21:43.063485Z",
      "confirm_from": "2026-10-28T12:51:39Z",
      "confirm_until": "2026-10-28T13:01:39Z",
      "drop_until": "2026-10-28T12:21:39Z"
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
      "id": "337986b3-2b7f-4ef8-a346-e51425f5fac6",
      "state": "RESERVED",
      "order": {
        "order_id": "695e6082-1feb-43d4-b588-0f047c106346",
        "short_number": 16,
        "pickup_at": "2026-10-28T13:21:39Z",
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
      "reserved_at": "2026-10-28T10:21:43.063485Z",
      "confirm_from": "2026-10-28T12:51:39Z",
      "confirm_until": "2026-10-28T13:01:39Z",
      "drop_until": "2026-10-28T12:21:39Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/337986b3-2b7f-4ef8-a346-e51425f5fac6/confirm` → **409**

```json
{
  "command_id": "f22104dd-044d-43a8-934e-2cfead7e20bb"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/337986b3-2b7f-4ef8-a346-e51425f5fac6/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "aef2d43a-aa78-43c0-9eef-967abff68179"
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
  "session_id": "b8b7d6c5-7c61-42f6-a8f0-79611f5805ea",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM4MDQsImlhdCI6MTc5MzE4MjkwNCwianRpIjoiOTA1ZjA4YTYtZWIxMC00YTE2LWEyYTMtMDY4ZWNkMGExYzgzIiwic2lkIjoiYjhiN2Q2YzUtN2M2MS00MmY2LWE4ZjAtNzk2MTFmNTgwNWVhIn0.Jn6BI5aIobe-3dfHW0g4Z8iOZHSI2Ci0OWZS4NhLuxc",
  "access_expires_at": "2026-10-28T10:36:44.441067598Z",
  "refresh_token": "0aEHxuNp4Y1uLq6udG0-gXheCX3pRTJkD4sruYc1P-A",
  "refresh_expires_at": "2026-10-28T22:21:44.440408295Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/695e6082-1feb-43d4-b588-0f047c106346` → **200**

```json
{
  "id": "695e6082-1feb-43d4-b588-0f047c106346",
  "short_number": 16,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "dcb7663b-5093-4496-b342-6ca619cf4af5",
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
  "created_at": "2026-10-28T10:21:41.386974Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T13:21:39Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "337986b3-2b7f-4ef8-a346-e51425f5fac6",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T10:21:43.063485Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/695e6082-1feb-43d4-b588-0f047c106346/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T10:21:41.388149Z",
      "actor": {
        "type": "CLIENT",
        "id": "dcb7663b-5093-4496-b342-6ca619cf4af5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "695e6082-1feb-43d4-b588-0f047c106346",
        "preorder": true,
        "quote_id": "f87c6c41-33cd-49b5-8fae-96f4f013b655",
        "pickup_at": "2026-10-28T13:21:39Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "4fd64008-fb12-475d-97b4-d2d4d86b5429"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T10:21:43.064672Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "695e6082-1feb-43d4-b588-0f047c106346",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "337986b3-2b7f-4ef8-a346-e51425f5fac6"
      },
      "correlation_id": "d394f1fa-3c18-4846-8863-5a2760eb51cc"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 695e6082-1feb-43d4-b588-0f047c106346, reservation 337986b3-2b7f-4ef8-a346-e51425f5fac6.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-8148"
}
```

```json
{
  "challenge_id": "b85c5777-8f59-460d-bb48-9499d474424b",
  "expires_at": "2026-10-28T10:26:45.269336891Z",
  "resend_available_at": "2026-10-28T10:21:46.269336891Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "640006",
  "sent_at": "2026-10-28T10:21:45.273679611Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b85c5777-8f59-460d-bb48-9499d474424b",
  "code": "640006",
  "device_ref": "sandbox-8148"
}
```

```json
{
  "session_id": "207bdeb9-369c-4e0d-81e2-7c88697bea65",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzgwNSwiaWF0IjoxNzkzMTgyOTA1LCJqdGkiOiJmMDIwZTEyZC0zMGJjLTRlMWQtOWYwZS02NDdiYjZlMjcyYzYiLCJzaWQiOiIyMDdiZGViOS0zNjljLTRlMGQtODFlMi03Yzg4Njk3YmVhNjUifQ.o0_Ux9tRkuJNAGBl81784c5Ce9sQu4wsnGtArkWwb7o",
  "access_expires_at": "2026-10-28T10:36:45.56819864Z",
  "refresh_token": "l1-N0DI9VliwVEvJVmGvUwMlqgQhL01-h-5y7fts_Gs",
  "refresh_expires_at": "2026-11-27T10:21:45.56749356Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "edc5d843-3fcf-49a7-a67b-6d1ff5a8b594",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:21:29.888807Z",
  "last_location_at": "2026-10-28T10:21:29.888807Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/edc5d843-3fcf-49a7-a67b-6d1ff5a8b594/handover` → **200**

```json
{
  "command_id": "7da61a5b-de93-4044-b3cc-516b61015fb4",
  "expected_version": 2
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "edc5d843-3fcf-49a7-a67b-6d1ff5a8b594",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:21:29.888807Z",
  "last_location_at": "2026-10-28T10:21:29.888807Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/edc5d843-3fcf-49a7-a67b-6d1ff5a8b594/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:21:46Z",
    "sequence": 1793182906375
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "edc5d843-3fcf-49a7-a67b-6d1ff5a8b594",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:21:46.394585Z",
  "last_location_at": "2026-10-28T10:21:46.394585Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678104925",
  "device_ref": "sandbox-22024"
}
```

```json
{
  "challenge_id": "850101c0-5612-48a4-a76b-60bb8a9aacd3",
  "expires_at": "2026-10-28T10:26:46.662063081Z",
  "resend_available_at": "2026-10-28T10:21:47.662063081Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678104925` → **200**

```json
{
  "phone": "+380678104925",
  "audience": "CLIENT",
  "code": "814881",
  "sent_at": "2026-10-28T10:21:46.664065999Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "850101c0-5612-48a4-a76b-60bb8a9aacd3",
  "code": "814881",
  "device_ref": "sandbox-22024"
}
```

```json
{
  "session_id": "5d33260c-1e8f-4cb9-a58b-a0536c8836b6",
  "subject": {
    "type": "CLIENT",
    "id": "94e1ffc5-4d6c-4cc2-a373-4df6f5bbc8c2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NGUxZmZjNS00ZDZjLTRjYzItYTM3My00ZGY2ZjViYmM4YzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzODA2LCJpYXQiOjE3OTMxODI5MDYsImp0aSI6ImMxZGEwNWZhLTUyNTYtNDVmNS1iMDU0LTY0MmIyMzM0YTNhMyIsInNpZCI6IjVkMzMyNjBjLTFlOGYtNGNiOS1hNThiLWEwNTM2Yzg4MzZiNiJ9.s41DYnDsG_WTk4fDWhayyYFIM791Y9oV893E9A50LsE",
  "access_expires_at": "2026-10-28T10:36:46.950210766Z",
  "refresh_token": "rF7fCZCKl8kk7ODufZ4KsAEYj7SjjsTnjgD2YDxnDxA",
  "refresh_expires_at": "2026-11-27T10:21:46.949685566Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e49ec8f2-ca38-40df-be88-203d041829a5",
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
  "id": "a207bb2c-6e9c-4bb9-aafa-515dd231eb2c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:26:47.223476Z",
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
  "command_id": "10c10d0d-a70a-44a4-85c5-60dd88aa746a",
  "quote_id": "a207bb2c-6e9c-4bb9-aafa-515dd231eb2c",
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
  "id": "9d32d37a-8e9e-463a-9f9d-051b3b3e1ffa",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e1ffc5-4d6c-4cc2-a373-4df6f5bbc8c2",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T10:21:47.494412Z",
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
[]
```

`POST /api/driver/v1/offers/null/accept` → **400**

```json
{
  "command_id": "3e2f3021-7b4f-4903-9775-4d3cc975e8f6"
}
```

```json
{
  "instance": "/api/driver/v1/offers/null/accept",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "524c83f5-2f0f-458d-9d9f-54dd7562235f"
}
```

**Expected 200, got 400 — scenario stopped.**

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
  "session_id": "23c5f78f-1102-4650-b9f7-1fe4b182cbb7",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM4MDgsImlhdCI6MTc5MzE4MjkwOCwianRpIjoiZjhjZDg1NGUtYmE3Yi00N2I1LWEwYzUtMDUzZWVjOGI0YjJiIiwic2lkIjoiMjNjNWY3OGYtMTEwMi00NjUwLWI5ZjctMWZlNGIxODJjYmI3In0.YA83uvBDeQviHGwQNRu-yaRuxdVknHYbJ1P0XHAZz_Y",
  "access_expires_at": "2026-10-28T10:36:48.593305846Z",
  "refresh_token": "VviMoq0jB9uvYV-oZkxheVz5r9x8IJEqjDTNFooY0Pw",
  "refresh_expires_at": "2026-10-28T22:21:48.592718208Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "20e19b53-8412-401b-9d3b-3e0656ffebfa",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "6d86da08-a4fa-42c2-9560-e1e88892e9b1",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:21:48.879068Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6d86da08-a4fa-42c2-9560-e1e88892e9b1` → **200**

```json
{
  "id": "6d86da08-a4fa-42c2-9560-e1e88892e9b1",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:21:48.879068Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6d86da08-a4fa-42c2-9560-e1e88892e9b1` → **200**

```json
{
  "id": "6d86da08-a4fa-42c2-9560-e1e88892e9b1",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:21:48.879068Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6d86da08-a4fa-42c2-9560-e1e88892e9b1` → **200**

```json
{
  "id": "6d86da08-a4fa-42c2-9560-e1e88892e9b1",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:21:48.879068Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6d86da08-a4fa-42c2-9560-e1e88892e9b1` → **200**

```json
{
  "id": "6d86da08-a4fa-42c2-9560-e1e88892e9b1",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T10:21:48.879068Z",
  "ready_at": "2026-10-28T10:21:51.872539Z",
  "expires_at": "2026-10-29T10:21:51.872539Z"
}
```

`GET /api/admin/v1/reports/exports/6d86da08-a4fa-42c2-9560-e1e88892e9b1/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,16,3,8,0,5,13,3,0,15,1,0,0,6,1,1
total,16,3,8,0,5,13,3,0,15,1,0,0,6,1,1
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "808ebe35-84f1-4bfa-a5fd-1a6a844d7388",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "4493acb4-5ea2-4cc0-92b0-4fa6f2e7c44a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:21:53.253439Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/4493acb4-5ea2-4cc0-92b0-4fa6f2e7c44a` → **200**

```json
{
  "id": "4493acb4-5ea2-4cc0-92b0-4fa6f2e7c44a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:21:53.253439Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/4493acb4-5ea2-4cc0-92b0-4fa6f2e7c44a` → **200**

```json
{
  "id": "4493acb4-5ea2-4cc0-92b0-4fa6f2e7c44a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:21:53.253439Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/4493acb4-5ea2-4cc0-92b0-4fa6f2e7c44a` → **200**

```json
{
  "id": "4493acb4-5ea2-4cc0-92b0-4fa6f2e7c44a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:21:53.253439Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/4493acb4-5ea2-4cc0-92b0-4fa6f2e7c44a` → **200**

```json
{
  "id": "4493acb4-5ea2-4cc0-92b0-4fa6f2e7c44a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T10:21:53.253439Z",
  "ready_at": "2026-10-28T10:21:56.881538Z",
  "expires_at": "2026-10-29T10:21:56.881538Z"
}
```

`GET /api/admin/v1/reports/exports/4493acb4-5ea2-4cc0-92b0-4fa6f2e7c44a/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,3,373.31,0.00,56.01,317.30,10.52,0.00,162.97,20.00,179.82,25.00,0.00
total,UAH,3,373.31,0.00,56.01,317.30,10.52,0.00,162.97,20.00,179.82,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/26e6dd41-e8ee-4728-8653-2d2ccd597210` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/26e6dd41-e8ee-4728-8653-2d2ccd597210",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c31a490c-e7e8-4d9c-89d3-8dbcf5eaaf4e"
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
  "device_ref": "sandbox-12248"
}
```

```json
{
  "challenge_id": "5e167b6f-c826-488b-b19f-392575ff988f",
  "expires_at": "2026-10-28T10:26:57.925289448Z",
  "resend_available_at": "2026-10-28T10:21:58.925289448Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "560183",
  "sent_at": "2026-10-28T10:21:57.927591699Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5e167b6f-c826-488b-b19f-392575ff988f",
  "code": "560183",
  "device_ref": "sandbox-12248"
}
```

```json
{
  "session_id": "fb26228a-ebbe-4a7c-b297-1581c2c4e632",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzgxOCwiaWF0IjoxNzkzMTgyOTE4LCJqdGkiOiI0ZGFiZmRjOS1lMjI3LTQ2ZWEtYjZmMS1jYzRmY2FjZGEzYWQiLCJzaWQiOiJmYjI2MjI4YS1lYmJlLTRhN2MtYjI5Ny0xNTgxYzJjNGU2MzIifQ.SG_qPB8INV7QIVZfufNeHsbQ7AW0aGgkbaJjbChGZ8U",
  "access_expires_at": "2026-10-28T10:36:58.213545477Z",
  "refresh_token": "KgsT18gkrXNpMEfCOpRIKrfKU0dNDVsN_Sa06KMMsmk",
  "refresh_expires_at": "2026-11-27T10:21:58.21298502Z",
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
  "command_id": "3404a991-b210-46fe-bd2d-8b91d467cb28",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:21:58Z",
    "sequence": 1793182918992
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a1cd94d0-3163-41f0-96ff-2cbdcc32709f",
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
  "last_heartbeat_at": "2026-10-28T10:21:59.010522Z",
  "last_location_at": "2026-10-28T10:21:59.010522Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "13786dec-f5df-4dbf-bed0-428e29ca6fdb",
  "points": [
    {
      "sequence": 1793182921286,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T10:21:01Z"
    },
    {
      "sequence": 1793182921294,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T10:22:01Z"
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
  "session_id": "5b44e9f7-5838-4210-ba5c-42d4b1d8c071",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM4MjEsImlhdCI6MTc5MzE4MjkyMSwianRpIjoiM2EzYmU2NzctYmMyNS00MGExLTk2Y2MtYzI1MGM3ZTViMzQ0Iiwic2lkIjoiNWI0NGU5ZjctNTgzOC00MjEwLWJhNWMtNDJkNGIxZDhjMDcxIn0.VTnUN1oieH_YniU24yfeZErULOnQ23By2dsWs0H8uR0",
  "access_expires_at": "2026-10-28T10:37:01.902326501Z",
  "refresh_token": "EZYVyG1EZSKX8NjfuNbJ4SP3ERCnPbEA42T37sq-nv8",
  "refresh_expires_at": "2026-10-28T22:22:01.901754773Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "c73e1e43-eaff-4d1a-bbf6-62f56a64ebdc",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T10:22:01Z",
        "track_point_id": "a17a048b-9fb9-48f3-8a67-11ad54f69022",
        "work_session_id": "a1cd94d0-3163-41f0-96ff-2cbdcc32709f"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T10:22:01Z",
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

`POST /api/admin/v1/driver-risk-flags/c73e1e43-eaff-4d1a-bbf6-62f56a64ebdc/confirm` → **200**

```json
{
  "command_id": "ed077402-0585-49ba-bae2-0e9219a3731f",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "c73e1e43-eaff-4d1a-bbf6-62f56a64ebdc",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T10:22:01Z",
    "track_point_id": "a17a048b-9fb9-48f3-8a67-11ad54f69022",
    "work_session_id": "a1cd94d0-3163-41f0-96ff-2cbdcc32709f"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T10:22:01Z",
  "reason": null,
  "reviewed_by": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
  "reviewed_at": "2026-10-28T10:22:02.756926Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/c73e1e43-eaff-4d1a-bbf6-62f56a64ebdc/dismiss` → **409**

```json
{
  "command_id": "e6cd2de8-80d2-4077-b5d8-4913be052ffd",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/c73e1e43-eaff-4d1a-bbf6-62f56a64ebdc/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a5d0e961-1852-46d5-afe5-81645e95e143"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "94fac301-4dc5-49e5-b700-a13d898aed18",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "c585dccd-466c-4fe4-9f5a-06e9a9d0aa10",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
  "raised_at": "2026-10-28T10:22:03.316225Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/c585dccd-466c-4fe4-9f5a-06e9a9d0aa10/dismiss` → **200**

```json
{
  "command_id": "bef5b844-a845-4b14-be13-e07f63a5f7ac",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "c585dccd-466c-4fe4-9f5a-06e9a9d0aa10",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
  "raised_at": "2026-10-28T10:22:03.316225Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
  "reviewed_at": "2026-10-28T10:22:03.596461Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "5f64f023-34bb-4ab8-a18a-f4bb40492ab9",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "c73e1e43-eaff-4d1a-bbf6-62f56a64ebdc"
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
      "actor_id": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:22:03.883992Z"
    }
  ]
}
```

Done: flag c73e1e43-eaff-4d1a-bbf6-62f56a64ebdc confirmed, suspension named it, driver reinstated.

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
  "session_id": "51c574aa-7414-48a3-85b5-30efee598d65",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM4MjQsImlhdCI6MTc5MzE4MjkyNCwianRpIjoiMzY5ZDdmZWEtODE2NS00NTJkLTg5ZDYtOWRlOTA5ZTM2YjIzIiwic2lkIjoiNTFjNTc0YWEtNzQxNC00OGEzLTg1YjUtMzBlZmVlNTk4ZDY1In0.GJZ3ex54fzwQgp4z4WIbbhp0JEm0-CiykQCS3VwCY6c",
  "access_expires_at": "2026-10-28T10:37:04.725463264Z",
  "refresh_token": "36JYvUzWcufFC328aCMT8FQgf19_VxpgNAaxWZ7WqaU",
  "refresh_expires_at": "2026-10-28T22:22:04.724946619Z",
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
      "actor_id": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:22:03.883992Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "19b352ff-1b4b-4352-8fde-66b0e8b836c9",
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
  "session_id": "a1cd94d0-3163-41f0-96ff-2cbdcc32709f",
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
  "last_heartbeat_at": "2026-10-28T10:21:59.010522Z",
  "last_location_at": "2026-10-28T10:21:59.010522Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a1cd94d0-3163-41f0-96ff-2cbdcc32709f/close` → **200**

```json
{
  "command_id": "1fc1c2dd-2ede-4b45-a771-9cb5730e8431",
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
  "session_id": "9760e751-59c5-4bbb-b9a3-b672443c2063",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM4MjYsImlhdCI6MTc5MzE4MjkyNiwianRpIjoiNmE0NjdmNDItMDIyOC00ZTQwLTg3NWMtMDAxMGJkNDk4YWI4Iiwic2lkIjoiOTc2MGU3NTEtNTljNS00YmJiLWI5YTMtYjY3MjQ0M2MyMDYzIn0.a2CMs3n1xgtXsiCciLkSaVdu2sP8L-Olpz7LjZIoZvM",
  "access_expires_at": "2026-10-28T10:37:06.373523681Z",
  "refresh_token": "bDnWmyKI0_U4muSJxZrMUAK4sIr32uNFLh9Wj6d-VXI",
  "refresh_expires_at": "2026-10-28T22:22:06.372957674Z",
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
  "command_id": "0aeb825b-f160-4188-a0a4-16e9763029c4",
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
  "changed_by": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T10:22:06.919844Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "0aeb825b-f160-4188-a0a4-16e9763029c4",
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
  "changed_by": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T10:22:06.919844Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48812583285",
  "device_ref": "sandbox-16817"
}
```

```json
{
  "challenge_id": "503ceb71-9e39-4c79-b921-a2dc71375b51",
  "expires_at": "2026-10-28T10:27:07.472971353Z",
  "resend_available_at": "2026-10-28T10:22:08.472971353Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48812583285` → **200**

```json
{
  "phone": "+48812583285",
  "audience": "CLIENT",
  "code": "835674",
  "sent_at": "2026-10-28T10:22:07.475459355Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "503ceb71-9e39-4c79-b921-a2dc71375b51",
  "code": "835674",
  "device_ref": "sandbox-16817"
}
```

```json
{
  "session_id": "bbf584ed-d216-4cf0-847e-a575eec3c6e2",
  "subject": {
    "type": "CLIENT",
    "id": "ba8820a6-4549-43fb-865d-e802e407a73c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYTg4MjBhNi00NTQ5LTQzZmItODY1ZC1lODAyZTQwN2E3M2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzODI3LCJpYXQiOjE3OTMxODI5MjcsImp0aSI6ImFiOThjMzRlLTAwODktNDNiOS04ODQzLWFiZDNiM2FiODQ2MyIsInNpZCI6ImJiZjU4NGVkLWQyMTYtNGNmMC04NDdlLWE1NzVlZWMzYzZlMiJ9.Z8TGryX0zmW8uGccpnreLpYukjs_lfu1Pduvo1A_yTk",
  "access_expires_at": "2026-10-28T10:37:07.756549697Z",
  "refresh_token": "9YMRzGhNGtvijOicab0B7k6TV7ikxLHfT4k5O-rc3ys",
  "refresh_expires_at": "2026-11-27T10:22:07.755846701Z",
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
  "correlation_id": "37d6a521-a863-4645-a444-551207d0a659"
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
  "device_ref": "sandbox-13533"
}
```

```json
{
  "challenge_id": "f0d30722-c60c-4d08-a5f1-03e9454de8e1",
  "expires_at": "2026-10-28T10:27:08.550410201Z",
  "resend_available_at": "2026-10-28T10:22:09.550410201Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "873905",
  "sent_at": "2026-10-28T10:22:08.552648642Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f0d30722-c60c-4d08-a5f1-03e9454de8e1",
  "code": "873905",
  "device_ref": "sandbox-13533"
}
```

```json
{
  "session_id": "d4ab4482-9bb7-47ad-a5db-897800a99611",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzgyOCwiaWF0IjoxNzkzMTgyOTI4LCJqdGkiOiJmODAxNjE1ZC03ODZmLTQxZTItYWE0Yi02OTQxYTI3MjM4MGUiLCJzaWQiOiJkNGFiNDQ4Mi05YmI3LTQ3YWQtYTVkYi04OTc4MDBhOTk2MTEifQ.HivcIpGL_-5GgEVa_mqnbnfYPyDshuSbTuLIXNZedCs",
  "access_expires_at": "2026-10-28T10:37:08.852042641Z",
  "refresh_token": "DxnDC0o87gU-2KVVxg6vaxhcpAcftjR3eaAudVaEfFo",
  "refresh_expires_at": "2026-11-27T10:22:08.851483867Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "305a4b81-e7ec-423f-bd02-1e2ee93a228b",
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
  "last_heartbeat_at": "2026-10-28T10:21:42.52857Z",
  "last_location_at": "2026-10-28T10:21:42.52857Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/305a4b81-e7ec-423f-bd02-1e2ee93a228b/handover` → **200**

```json
{
  "command_id": "dd12da72-6067-4387-9a93-76cdbc7ac401",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "305a4b81-e7ec-423f-bd02-1e2ee93a228b",
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
  "last_heartbeat_at": "2026-10-28T10:21:42.52857Z",
  "last_location_at": "2026-10-28T10:21:42.52857Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/305a4b81-e7ec-423f-bd02-1e2ee93a228b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:22:09Z",
    "sequence": 1793182929654
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "305a4b81-e7ec-423f-bd02-1e2ee93a228b",
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
  "last_heartbeat_at": "2026-10-28T10:22:09.672842Z",
  "last_location_at": "2026-10-28T10:22:09.672842Z",
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
  "session_id": "305a4b81-e7ec-423f-bd02-1e2ee93a228b",
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
  "last_heartbeat_at": "2026-10-28T10:22:09.672842Z",
  "last_location_at": "2026-10-28T10:22:09.672842Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/305a4b81-e7ec-423f-bd02-1e2ee93a228b/close` → **200**

```json
{
  "command_id": "19f4e71d-1ecf-4135-8bb8-8d2df0f184e2",
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
  "correlation_id": "ae4e3a84-198f-4110-a6ed-d01d74a159ce"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673241469",
  "device_ref": "sandbox-16302"
}
```

```json
{
  "challenge_id": "9925d1df-fb74-4743-9077-7d7bd0e3fcd9",
  "expires_at": "2026-10-28T10:27:11.127262565Z",
  "resend_available_at": "2026-10-28T10:22:12.127262565Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673241469` → **200**

```json
{
  "phone": "+380673241469",
  "audience": "CLIENT",
  "code": "588235",
  "sent_at": "2026-10-28T10:22:11.129723046Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9925d1df-fb74-4743-9077-7d7bd0e3fcd9",
  "code": "588235",
  "device_ref": "sandbox-16302"
}
```

```json
{
  "session_id": "20fe1953-9dab-4984-aa24-8bd4e1100696",
  "subject": {
    "type": "CLIENT",
    "id": "86aa04a5-2bcd-4f81-9232-e8f8e6269db1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NmFhMDRhNS0yYmNkLTRmODEtOTIzMi1lOGY4ZTYyNjlkYjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzODMxLCJpYXQiOjE3OTMxODI5MzEsImp0aSI6ImM4MzJjMDYzLTNiZWQtNDUyMC1hMDQ5LTE2OTljZDY0YjFhZiIsInNpZCI6IjIwZmUxOTUzLTlkYWItNDk4NC1hYTI0LThiZDRlMTEwMDY5NiJ9.zCyJN597kppU77eIEtxH0QogcglgDUWrAQgFSeQ0kKw",
  "access_expires_at": "2026-10-28T10:37:11.462758648Z",
  "refresh_token": "WmYCgP9zYQqa_DniaMtJNat_1o6w08GLOPNDZstkhvU",
  "refresh_expires_at": "2026-11-27T10:22:11.462247985Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "bd5b0d19-dc07-42cc-80e1-b8404b42e8ed",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "a2d1ebe9-19ca-44c0-9052-feb87b216e18",
  "upload_path": "/api/rider/v1/uploads/a2d1ebe9-19ca-44c0-9052-feb87b216e18",
  "expires_at": "2026-10-28T10:37:11.740481441Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/a2d1ebe9-19ca-44c0-9052-feb87b216e18` → **200**

```json
{
  "file_id": "a2d1ebe9-19ca-44c0-9052-feb87b216e18",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "2cc54f24-0b64-4f2c-aec5-8e61683c1244",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "a2d1ebe9-19ca-44c0-9052-feb87b216e18"
  ]
}
```

```json
{
  "id": "9ecf39c0-3e71-416d-a975-912d75d2e3fb",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "86aa04a5-2bcd-4f81-9232-e8f8e6269db1",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T10:22:12.049517Z",
  "updated_at": "2026-10-28T10:22:12.049517Z",
  "messages": [
    {
      "id": "676a12a3-0bf0-492c-9409-6a260fb24727",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "86aa04a5-2bcd-4f81-9232-e8f8e6269db1",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:22:12.051233Z",
      "attachments": [
        {
          "file_id": "a2d1ebe9-19ca-44c0-9052-feb87b216e18",
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
  "session_id": "44e729bc-07aa-4378-adb5-8fddeff33572",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM4MzIsImlhdCI6MTc5MzE4MjkzMiwianRpIjoiNjdmOWM4YWQtMzBmNS00YThkLWJlMTAtZGQ1NTE2OTQ4Y2E0Iiwic2lkIjoiNDRlNzI5YmMtMDdhYS00Mzc4LWFkYjUtOGZkZGVmZjMzNTcyIn0.jRQPqk_yM6AP_fHmZppJsCCpwh_2I4HYDcXqZXLECJ8",
  "access_expires_at": "2026-10-28T10:37:12.632598559Z",
  "refresh_token": "y0xTU2NIhn37xUzzFYv4MXdJnYhkCGk1ALKkN9oltWY",
  "refresh_expires_at": "2026-10-28T22:22:12.632032712Z",
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
  "session_id": "96153516-97a7-488b-9829-f1bf94aae2d9",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM4MzMsImlhdCI6MTc5MzE4MjkzMywianRpIjoiYzc1MDAwM2QtYTVjOS00OWU0LWE1NTUtZTU1ZTA4NDZhZDY4Iiwic2lkIjoiOTYxNTM1MTYtOTdhNy00ODhiLTk4MjktZjFiZjk0YWFlMmQ5In0.lTbBZgq2gi7JsuuQdqR-c_OaNM4gh2Uoqk67R0Dj7ww",
  "access_expires_at": "2026-10-28T10:37:13.188342528Z",
  "refresh_token": "lWgS5TcdqP3Sh-Bi6GfjPRa-fxua1VvEZ48Gjc9JWvY",
  "refresh_expires_at": "2026-10-28T22:22:13.187583457Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/9ecf39c0-3e71-416d-a975-912d75d2e3fb/attachments/a2d1ebe9-19ca-44c0-9052-feb87b216e18` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "56d1aea0-70fc-41c5-b04d-c08b383174e8",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "96016ed6-10a9-47df-9f06-c5e4e7466737",
  "upload_path": "/api/operator/v1/uploads/96016ed6-10a9-47df-9f06-c5e4e7466737",
  "expires_at": "2026-10-28T10:37:13.476830837Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/96016ed6-10a9-47df-9f06-c5e4e7466737` → **200**

```json
{
  "file_id": "96016ed6-10a9-47df-9f06-c5e4e7466737",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/9ecf39c0-3e71-416d-a975-912d75d2e3fb` → **200**

```json
{
  "id": "9ecf39c0-3e71-416d-a975-912d75d2e3fb",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "86aa04a5-2bcd-4f81-9232-e8f8e6269db1",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T10:22:12.049517Z",
  "updated_at": "2026-10-28T10:22:12.049517Z",
  "messages": [
    {
      "id": "676a12a3-0bf0-492c-9409-6a260fb24727",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "86aa04a5-2bcd-4f81-9232-e8f8e6269db1",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:22:12.051233Z",
      "attachments": [
        {
          "file_id": "a2d1ebe9-19ca-44c0-9052-feb87b216e18",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/9ecf39c0-3e71-416d-a975-912d75d2e3fb/comments` → **200**

```json
{
  "command_id": "b4dad0a3-665d-43da-ab53-77a4f96eda41",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "96016ed6-10a9-47df-9f06-c5e4e7466737"
  ]
}
```

```json
{
  "id": "9ecf39c0-3e71-416d-a975-912d75d2e3fb",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "86aa04a5-2bcd-4f81-9232-e8f8e6269db1",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T10:22:12.049517Z",
  "updated_at": "2026-10-28T10:22:14.072594Z",
  "messages": [
    {
      "id": "676a12a3-0bf0-492c-9409-6a260fb24727",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "86aa04a5-2bcd-4f81-9232-e8f8e6269db1",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:22:12.051233Z",
      "attachments": [
        {
          "file_id": "a2d1ebe9-19ca-44c0-9052-feb87b216e18",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "c15dc9fe-70ee-45db-8530-498f4b7a8bad",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T10:22:14.072107Z",
      "attachments": [
        {
          "file_id": "96016ed6-10a9-47df-9f06-c5e4e7466737",
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

`GET /api/rider/v1/support/cases/9ecf39c0-3e71-416d-a975-912d75d2e3fb` → **200**

```json
{
  "id": "9ecf39c0-3e71-416d-a975-912d75d2e3fb",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "86aa04a5-2bcd-4f81-9232-e8f8e6269db1",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T10:22:12.049517Z",
  "updated_at": "2026-10-28T10:22:14.072594Z",
  "messages": [
    {
      "id": "676a12a3-0bf0-492c-9409-6a260fb24727",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "86aa04a5-2bcd-4f81-9232-e8f8e6269db1",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:22:12.051233Z",
      "attachments": [
        {
          "file_id": "a2d1ebe9-19ca-44c0-9052-feb87b216e18",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "c15dc9fe-70ee-45db-8530-498f4b7a8bad",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T10:22:14.072107Z",
      "attachments": [
        {
          "file_id": "96016ed6-10a9-47df-9f06-c5e4e7466737",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/9ecf39c0-3e71-416d-a975-912d75d2e3fb/attachments/96016ed6-10a9-47df-9f06-c5e4e7466737` → **200**

Done: support case 9ecf39c0-3e71-416d-a975-912d75d2e3fb, rider attachment a2d1ebe9-19ca-44c0-9052-feb87b216e18, operator attachment 96016ed6-10a9-47df-9f06-c5e4e7466737.

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
  "session_id": "f0ea26f5-55b9-49a5-8300-fcb47858b5d5",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM4MzQsImlhdCI6MTc5MzE4MjkzNCwianRpIjoiNTcwNDM1ZDUtNzYyZi00NDRkLTg4NzEtY2MzZWU1MDdjMDg4Iiwic2lkIjoiZjBlYTI2ZjUtNTViOS00OWE1LTgzMDAtZmNiNDc4NThiNWQ1In0.pexG0FOQugND2SZidWMVAq-UvryRauS76HKv3Ie3w_8",
  "access_expires_at": "2026-10-28T10:37:14.97790619Z",
  "refresh_token": "r5zgpVYWO6KZ7p3VjgjTh58K4lf6e6xC9TEM7vDzsQM",
  "refresh_expires_at": "2026-10-28T22:22:14.976754488Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-14728"
}
```

```json
{
  "challenge_id": "840ea84e-422b-48ae-898b-4486750d632d",
  "expires_at": "2026-10-28T10:27:15.254604349Z",
  "resend_available_at": "2026-10-28T10:22:16.254604349Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "354487",
  "sent_at": "2026-10-28T10:22:15.257076792Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "840ea84e-422b-48ae-898b-4486750d632d",
  "code": "354487",
  "device_ref": "sandbox-14728"
}
```

```json
{
  "session_id": "deb10ab5-54cb-458c-974e-050f28c91aa9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzgzNSwiaWF0IjoxNzkzMTgyOTM1LCJqdGkiOiIyYTM5ZDRiNi0xZWFkLTQ3NzktODk4Zi01NTZiZjE3NzNiZWMiLCJzaWQiOiJkZWIxMGFiNS01NGNiLTQ1OGMtOTc0ZS0wNTBmMjhjOTFhYTkifQ.MUZqyOe70NuoUi0tvL3FsHEblBw2q-cpUVan6pwP6a4",
  "access_expires_at": "2026-10-28T10:37:15.54322164Z",
  "refresh_token": "XDVfoX53svIR-Rn7J5vRzNXiXmhES3clF9TgZbRpiY4",
  "refresh_expires_at": "2026-11-27T10:22:15.54235732Z",
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
      "actor_id": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:22:03.883992Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "8fa91117-f61a-4c8e-a789-3932a5d4573a",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T10:22:05.270276Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "1fe082fb-7963-43d1-b4a2-254b5f1c27a1",
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
  "device_ref": "sandbox-17661"
}
```

```json
{
  "challenge_id": "2af6f379-028f-4887-91d8-eee862a473aa",
  "expires_at": "2026-10-28T10:27:16.654041663Z",
  "resend_available_at": "2026-10-28T10:22:17.654041663Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "144941",
  "sent_at": "2026-10-28T10:22:16.656910994Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2af6f379-028f-4887-91d8-eee862a473aa",
  "code": "144941",
  "device_ref": "sandbox-17661"
}
```

```json
{
  "session_id": "cfe9edac-adf9-4bc3-a3a0-a3730d3f5664",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzgzNiwiaWF0IjoxNzkzMTgyOTM2LCJqdGkiOiJkZjJmMTE3Yi1kOTQ2LTQ0MDUtODcxMy01OTJlM2UzODc2ZWYiLCJzaWQiOiJjZmU5ZWRhYy1hZGY5LTRiYzMtYTNhMC1hMzczMGQzZjU2NjQifQ.t-bxX0PeXIrAUGjMJo-NRluknREHB8QiJ3xgaD5Ecxs",
  "access_expires_at": "2026-10-28T10:37:16.973785095Z",
  "refresh_token": "htktR_kVlUPXfxJfen2xdxFsto3dBYwzaup5JXw-zME",
  "refresh_expires_at": "2026-11-27T10:22:16.973044642Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "edc5d843-3fcf-49a7-a67b-6d1ff5a8b594",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:21:46.394585Z",
  "last_location_at": "2026-10-28T10:21:46.394585Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/edc5d843-3fcf-49a7-a67b-6d1ff5a8b594/handover` → **200**

```json
{
  "command_id": "0e23f5d9-b25d-4bf6-997b-4252e56ab10d",
  "expected_version": 3
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "edc5d843-3fcf-49a7-a67b-6d1ff5a8b594",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:21:46.394585Z",
  "last_location_at": "2026-10-28T10:21:46.394585Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/edc5d843-3fcf-49a7-a67b-6d1ff5a8b594/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:22:17Z",
    "sequence": 1793182937812
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "edc5d843-3fcf-49a7-a67b-6d1ff5a8b594",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:22:17.834377Z",
  "last_location_at": "2026-10-28T10:22:17.834377Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
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
  "command_id": "5e438531-53de-42bf-bd40-ea03505f2fe9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:22:18Z",
    "sequence": 1793182938400
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e6548305-a2a6-4e50-b79c-5276c6e7fe23",
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
  "last_heartbeat_at": "2026-10-28T10:22:18.421705Z",
  "last_location_at": "2026-10-28T10:22:18.421705Z",
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
  "session_id": "1243f216-d314-48f9-8eac-770360e5e5e7",
  "subject": {
    "type": "STAFF",
    "id": "8fa91117-f61a-4c8e-a789-3932a5d4573a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE5MTExNy1mNjFhLTRjOGUtYTc4OS0zOTMyYTVkNDU3M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM4MzksImlhdCI6MTc5MzE4MjkzOSwianRpIjoiMDZkYWExZDctNTkzMi00OTA5LTgxN2UtNDBiNDJjZWRlM2VkIiwic2lkIjoiMTI0M2YyMTYtZDMxNC00OGY5LThlYWMtNzcwMzYwZTVlNWU3In0.ARATjxfnnBcDGIoCrVqQuiHJMsPYYvCHf8AB0mJ-4zQ",
  "access_expires_at": "2026-10-28T10:37:19.019410591Z",
  "refresh_token": "N0hEO-i5NmunBGGCdJQc1vhlKp7NZWCXlJ1gVoc3xLs",
  "refresh_expires_at": "2026-10-28T22:22:19.018685714Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "dcc79646-50f0-40b4-b31c-ef632a7854f9",
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
  "id": "7b518cb7-09ab-4dba-902a-bf5127c88844",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:27:19.295774Z",
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
  "command_id": "e3ca256c-89bc-40a6-bd89-56b8a31a5011",
  "quote_id": "7b518cb7-09ab-4dba-902a-bf5127c88844",
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
  "id": "5a9363ad-4330-46ea-b985-412256a50d22",
  "short_number": 18,
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
  "created_at": "2026-10-28T10:22:19.580163Z",
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

**Contract validation failed — scenario stopped.**
