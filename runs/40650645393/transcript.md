# Sandbox transcript (2026-10-28T07:32:25Z, 95bd9b2)

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
  "correlation_id": "238214e0-955f-4e8d-8f7d-9ddb392e8af5"
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
  "session_id": "6609dc0c-5153-4958-a815-283e2673302c",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM2NDYsImlhdCI6MTc5MzE3Mjc0NiwianRpIjoiNGQwNzNlYWUtOTlmMC00NTZkLWE2MzMtNTNhOTE3MjhlYjI0Iiwic2lkIjoiNjYwOWRjMGMtNTE1My00OTU4LWE4MTUtMjgzZTI2NzMzMDJjIn0.5BfJ1uP_Ym9phQaU6ECPM_ZaKBB_tADj8Lq2jE_-obg",
  "access_expires_at": "2026-10-28T07:47:26.41889561Z",
  "refresh_token": "0BPB43z593RQCjKMhmlOBXbmYjXLQLMALHvr0OPnnQs",
  "refresh_expires_at": "2026-10-28T19:32:26.416763358Z",
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
  "session_id": "e88eb711-ba19-4ffe-b14e-cc0d73a28405",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM2NDcsImlhdCI6MTc5MzE3Mjc0NywianRpIjoiNzEyMWRiMzEtMTczMS00Mzc0LWIyMGMtMDhlNDEwMTE5MDVmIiwic2lkIjoiZTg4ZWI3MTEtYmExOS00ZmZlLWIxNGUtY2MwZDczYTI4NDA1In0.lneSlbA68ETe-9IVxI3OkhWW0Rl2BPVCd_Vb9Azl8ys",
  "access_expires_at": "2026-10-28T07:47:27.666093844Z",
  "refresh_token": "9DN34utDGosnty39yooTn3fURgJ49bW_mZiBtIw92mQ",
  "refresh_expires_at": "2026-10-28T19:32:27.665017825Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "6d40b26f-3ac9-49a2-a6bf-6eaffec559cf",
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
  "id": "de3c4f63-2739-405b-8b19-dd0ea323ba3c",
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
  "created_by": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
  "created_at": "2026-10-28T07:32:27.723799Z",
  "updated_at": "2026-10-28T07:32:27.723799Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634833103",
  "device_ref": "sandbox-20398"
}
```

```json
{
  "challenge_id": "10b6e818-b4cc-4981-97ba-8b571e6a9f82",
  "expires_at": "2026-10-28T07:37:27.768958573Z",
  "resend_available_at": "2026-10-28T07:32:28.768958573Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634833103` → **200**

```json
{
  "phone": "+380634833103",
  "audience": "CLIENT",
  "code": "626374",
  "sent_at": "2026-10-28T07:32:27.779035351Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "10b6e818-b4cc-4981-97ba-8b571e6a9f82",
  "code": "626374",
  "device_ref": "sandbox-20398"
}
```

```json
{
  "session_id": "4d56287c-5496-4c57-b547-c8804b2bff78",
  "subject": {
    "type": "CLIENT",
    "id": "8e156bc5-f4aa-46df-91f3-e3d38814102d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZTE1NmJjNS1mNGFhLTQ2ZGYtOTFmMy1lM2QzODgxNDEwMmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNjQ3LCJpYXQiOjE3OTMxNzI3NDcsImp0aSI6ImU4NTI1NjY3LWJmNzMtNGI5ZC1hYTI4LWMxZDNhNzMxNTBmYyIsInNpZCI6IjRkNTYyODdjLTU0OTYtNGM1Ny1iNTQ3LWM4ODA0YjJiZmY3OCJ9.18XpX0EGnBZ20T1RSW6PH-JBjN-zgT1ty17sm5pA3Ps",
  "access_expires_at": "2026-10-28T07:47:27.866710846Z",
  "refresh_token": "EEpM6PeSilCH5uK7eLg5UXBOSuO7uIyzSYZzg_dhYZE",
  "refresh_expires_at": "2026-11-27T07:32:27.865347076Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380634833103` → **200**

```json
{
  "client_id": "8e156bc5-f4aa-46df-91f3-e3d38814102d"
}
```

`POST /api/admin/v1/rider-wallets/8e156bc5-f4aa-46df-91f3-e3d38814102d/top-ups` → **201**

```json
{
  "command_id": "2bfb2d47-412e-4e08-ac64-d03baa7f357f",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "8e156bc5-f4aa-46df-91f3-e3d38814102d",
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
      "id": "3da9a024-1318-4229-8233-925678b3ca78",
      "at": "2026-10-28T07:32:27.942044Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "00c29e12-a782-492e-a8cf-8748e505b9cd",
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
  "id": "c9293aab-4bb9-4adb-ac3b-0bc35d85bdef",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:37:28.097883Z",
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
      "id": "de3c4f63-2739-405b-8b19-dd0ea323ba3c",
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
  "device_ref": "sandbox-9095"
}
```

```json
{
  "challenge_id": "b77c71fe-593c-4fa5-b45d-740d07884fa1",
  "expires_at": "2026-10-28T07:37:28.160876147Z",
  "resend_available_at": "2026-10-28T07:32:29.160876147Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "870602",
  "sent_at": "2026-10-28T07:32:28.164532413Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b77c71fe-593c-4fa5-b45d-740d07884fa1",
  "code": "870602",
  "device_ref": "sandbox-9095"
}
```

```json
{
  "session_id": "c883290d-a7ce-4a47-8daa-bb35f689c4ea",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzY0OCwiaWF0IjoxNzkzMTcyNzQ4LCJqdGkiOiI2MjZkYjk4NS1jZThlLTQ5MjMtOTJiZC1hYWZmYjZjMzlkMGYiLCJzaWQiOiJjODgzMjkwZC1hN2NlLTRhNDctOGRhYS1iYjM1ZjY4OWM0ZWEifQ.Ix27tzBvzHKV42ErZpwi_M_QB2YIQGWccX9AIC-2inU",
  "access_expires_at": "2026-10-28T07:47:28.214661373Z",
  "refresh_token": "ijmej5MyZd2o1x8CTbyWk_nvLR_6gZz8C453LdcjMIA",
  "refresh_expires_at": "2026-11-27T07:32:28.213719136Z",
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
  "command_id": "33da5724-ad82-49cb-a2c6-c9d66e8ef0ad",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:32:28Z",
    "sequence": 1793172748274
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ffe87c77-5b60-48d7-9586-ac036c131a09",
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
  "last_heartbeat_at": "2026-10-28T07:32:28.31737Z",
  "last_location_at": "2026-10-28T07:32:28.31737Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "115e0c28-fa37-4307-bee5-bb28adf03176",
  "quote_id": "c9293aab-4bb9-4adb-ac3b-0bc35d85bdef",
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
  "id": "8b6a67cd-f292-4041-9a27-1c04fd8da155",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8e156bc5-f4aa-46df-91f3-e3d38814102d",
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
  "created_at": "2026-10-28T07:32:28.413287Z",
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
  "client_id": "8e156bc5-f4aa-46df-91f3-e3d38814102d",
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
      "id": "3da9a024-1318-4229-8233-925678b3ca78",
      "at": "2026-10-28T07:32:27.942044Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
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
    "id": "b9be7b17-915b-4780-9569-92ae89895226",
    "order_id": "8b6a67cd-f292-4041-9a27-1c04fd8da155",
    "expires_at": "2026-10-28T07:32:43.428222Z",
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

`POST /api/driver/v1/offers/b9be7b17-915b-4780-9569-92ae89895226/accept` → **200**

```json
{
  "command_id": "d08bb60c-f0a8-4096-a4b9-d089b41086b4"
}
```

```json
{
  "id": "011d21a9-8c1c-4deb-8743-b34760962913",
  "order_id": "8b6a67cd-f292-4041-9a27-1c04fd8da155",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "999820b2-3fbd-4696-a532-bc31f1cb4c88",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "999820b2-3fbd-4696-a532-bc31f1cb4c88",
  "order_id": "8b6a67cd-f292-4041-9a27-1c04fd8da155",
  "assignment_id": "011d21a9-8c1c-4deb-8743-b34760962913",
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

`POST /api/driver/v1/work-sessions/ffe87c77-5b60-48d7-9586-ac036c131a09/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:32:28Z",
    "sequence": 1793172748579
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ffe87c77-5b60-48d7-9586-ac036c131a09",
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
  "last_heartbeat_at": "2026-10-28T07:32:28.601287Z",
  "last_location_at": "2026-10-28T07:32:28.601287Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/999820b2-3fbd-4696-a532-bc31f1cb4c88/arrive` → **200**

```json
{
  "command_id": "d3123965-829a-49d7-97d8-d746cb47ce40",
  "expected_version": 0
}
```

```json
{
  "id": "999820b2-3fbd-4696-a532-bc31f1cb4c88",
  "order_id": "8b6a67cd-f292-4041-9a27-1c04fd8da155",
  "assignment_id": "011d21a9-8c1c-4deb-8743-b34760962913",
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
  "arrived_at": "2026-10-28T07:32:28.645001Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/999820b2-3fbd-4696-a532-bc31f1cb4c88/start` → **200**

```json
{
  "command_id": "568788b1-2e9f-43ee-9f7b-8eed015fb0d2",
  "expected_version": 1
}
```

```json
{
  "id": "999820b2-3fbd-4696-a532-bc31f1cb4c88",
  "order_id": "8b6a67cd-f292-4041-9a27-1c04fd8da155",
  "assignment_id": "011d21a9-8c1c-4deb-8743-b34760962913",
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
  "arrived_at": "2026-10-28T07:32:28.645001Z",
  "started_at": "2026-10-28T07:32:28.685836Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/999820b2-3fbd-4696-a532-bc31f1cb4c88/complete` → **200**

```json
{
  "command_id": "b162196b-02ff-444a-84fb-226600bebdd2",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:32:28Z",
  "cash_received": true
}
```

```json
{
  "id": "999820b2-3fbd-4696-a532-bc31f1cb4c88",
  "order_id": "8b6a67cd-f292-4041-9a27-1c04fd8da155",
  "assignment_id": "011d21a9-8c1c-4deb-8743-b34760962913",
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
  "arrived_at": "2026-10-28T07:32:28.645001Z",
  "started_at": "2026-10-28T07:32:28.685836Z",
  "completed_at": "2026-10-28T07:32:28.744526Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "8e156bc5-f4aa-46df-91f3-e3d38814102d",
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
      "id": "3361ff43-abec-4fea-be05-a1233947ff74",
      "at": "2026-10-28T07:32:29.275711Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "8b6a67cd-f292-4041-9a27-1c04fd8da155"
    },
    {
      "id": "3da9a024-1318-4229-8233-925678b3ca78",
      "at": "2026-10-28T07:32:27.942044Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/de3c4f63-2739-405b-8b19-dd0ea323ba3c/archive` → **200**

```json
{
  "command_id": "e88b9108-87f9-477f-a8e9-20b4baabea17",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "de3c4f63-2739-405b-8b19-dd0ea323ba3c",
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
  "created_by": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
  "created_at": "2026-10-28T07:32:27.723799Z",
  "updated_at": "2026-10-28T07:32:31.829127Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ffe87c77-5b60-48d7-9586-ac036c131a09",
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
  "last_heartbeat_at": "2026-10-28T07:32:28.601287Z",
  "last_location_at": "2026-10-28T07:32:28.601287Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ffe87c77-5b60-48d7-9586-ac036c131a09/close` → **200**

```json
{
  "command_id": "626f3c25-c7c8-4f96-8f1f-17dcc2f83072",
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

Done: order 8b6a67cd-f292-4041-9a27-1c04fd8da155.

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
  "session_id": "6b5576fc-dba7-4d32-86e1-65e9d14833d7",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM2NTIsImlhdCI6MTc5MzE3Mjc1MiwianRpIjoiNjJiOWU2NjctYzVmZS00NTlhLTkzMTktNGVhZGQ2MzZlOGNiIiwic2lkIjoiNmI1NTc2ZmMtZGJhNy00ZDMyLTg2ZTEtNjVlOWQxNDgzM2Q3In0.hh1iiEk_CB__9A53lQY3gyVWBpwUO4oQd05qqUw1W70",
  "access_expires_at": "2026-10-28T07:47:32.220918512Z",
  "refresh_token": "6KcUml_MW_xDphfBSnze0Q1Xu8os1UNLCbOtXUDLXGo",
  "refresh_expires_at": "2026-10-28T19:32:32.220013138Z",
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
  "command_id": "c4a2931f-1635-45ff-b8ae-99309d1b2f32",
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
  "session_id": "5792d9f5-1e23-452a-99fd-2cb7d306eb53",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM2NTIsImlhdCI6MTc5MzE3Mjc1MiwianRpIjoiODhlNmNjMmItZGUzOC00ODk4LWI5OGItMTVmODRkZjliZjdkIiwic2lkIjoiNTc5MmQ5ZjUtMWUyMy00NTJhLTk5ZmQtMmNiN2QzMDZlYjUzIn0.x_5WNh6ubBVCR33nHTTnFY6tmMQvJs2OfHhXLo6cz3w",
  "access_expires_at": "2026-10-28T07:47:32.609729693Z",
  "refresh_token": "p46cL2yeE63ZByGzqMY-U8cBIYLCvF6VE09Bl8FunZI",
  "refresh_expires_at": "2026-10-28T19:32:32.608827637Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.2269917633",
    "linkedid": "1730052700.2269917633",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672466179"
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
    "id": "1730052700.2269917633",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "3b373d45-b6f3-4b6e-b84b-40026854b354",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380672466179",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T07:32:32.635992Z",
      "answered_at": null,
      "ended_at": "2026-10-28T07:32:32.657711Z",
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
    "id": "1730052600.2767726513",
    "linkedid": "1730052600.2767726513",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672466179"
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
      "id": "e9932ffb-c4d0-4733-8e1c-e280db4bb53d",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672466179",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T07:32:32.719648Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/e9932ffb-c4d0-4733-8e1c-e280db4bb53d/answer` → **200**

```json
{
  "command_id": "5c19bf92-6e28-44b8-821f-f00f86043fe7"
}
```

```json
{
  "id": "e9932ffb-c4d0-4733-8e1c-e280db4bb53d",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672466179",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
  "order_ids": [],
  "started_at": "2026-10-28T07:32:32.719648Z",
  "answered_at": "2026-10-28T07:32:32.779124Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2767726513",
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
    "id": "1730052600.2767726513",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "e9932ffb-c4d0-4733-8e1c-e280db4bb53d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672466179",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
      "order_ids": [],
      "started_at": "2026-10-28T07:32:32.719648Z",
      "answered_at": "2026-10-28T07:32:32.779124Z",
      "ended_at": "2026-10-28T07:32:32.826861Z",
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
      "id": "e9932ffb-c4d0-4733-8e1c-e280db4bb53d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672466179",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
      "order_ids": [],
      "started_at": "2026-10-28T07:32:32.719648Z",
      "answered_at": "2026-10-28T07:32:32.779124Z",
      "ended_at": "2026-10-28T07:32:32.826861Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T07:32:34.138242Z"
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
      "id": "e9932ffb-c4d0-4733-8e1c-e280db4bb53d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672466179",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
      "order_ids": [],
      "started_at": "2026-10-28T07:32:32.719648Z",
      "answered_at": "2026-10-28T07:32:32.779124Z",
      "ended_at": "2026-10-28T07:32:32.826861Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T07:32:34.138242Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/e9932ffb-c4d0-4733-8e1c-e280db4bb53d/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/e9932ffb-c4d0-4733-8e1c-e280db4bb53d/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=e9932ffb-c4d0-4733-8e1c-e280db4bb53d` → **200**

```json
{
  "changes": [
    {
      "id": "2a2a8f9d-dafe-4e9e-82b7-06a1f9c8603f",
      "occurred_at": "2026-10-28T07:32:34.969896Z",
      "actor_type": "STAFF",
      "actor_id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "e9932ffb-c4d0-4733-8e1c-e280db4bb53d",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"e22c5cf4-3677-4620-89c4-33aabd6f2202\", \"order_ids\": []}",
      "correlation_id": "9064b3d8-855e-4d6d-950c-b80677632194"
    },
    {
      "id": "6e21fba8-3c27-4b36-8006-0831f77943b4",
      "occurred_at": "2026-10-28T07:32:34.939098Z",
      "actor_type": "STAFF",
      "actor_id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "e9932ffb-c4d0-4733-8e1c-e280db4bb53d",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"e22c5cf4-3677-4620-89c4-33aabd6f2202\", \"order_ids\": []}",
      "correlation_id": "2550b237-f611-4614-84d8-771556e6e0c9"
    }
  ]
}
```

Done: call e9932ffb-c4d0-4733-8e1c-e280db4bb53d recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631121213",
  "device_ref": "sandbox-1356"
}
```

```json
{
  "challenge_id": "f823acb0-3c91-4178-be85-5d940cfacc29",
  "expires_at": "2026-10-28T07:37:35.037358883Z",
  "resend_available_at": "2026-10-28T07:32:36.037358883Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631121213` → **200**

```json
{
  "phone": "+380631121213",
  "audience": "CLIENT",
  "code": "091103",
  "sent_at": "2026-10-28T07:32:35.040701195Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f823acb0-3c91-4178-be85-5d940cfacc29",
  "code": "091103",
  "device_ref": "sandbox-1356"
}
```

```json
{
  "session_id": "25c31d0f-657b-4345-b6a6-fa189038b71f",
  "subject": {
    "type": "CLIENT",
    "id": "8f08890e-6439-43d7-b99d-7015f5c75a70"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjA4ODkwZS02NDM5LTQzZDctYjk5ZC03MDE1ZjVjNzVhNzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNjU1LCJpYXQiOjE3OTMxNzI3NTUsImp0aSI6IjMyNDY5MzYwLTc1YTktNGY5NS05OWZmLTc3MTc0ZWM0M2E5YyIsInNpZCI6IjI1YzMxZDBmLTY1N2ItNDM0NS1iNmE2LWZhMTg5MDM4YjcxZiJ9.NTDAc2IdlvQUV4sw001tu-o-pgf6-tYxCB3W4KcBLMQ",
  "access_expires_at": "2026-10-28T07:47:35.094088325Z",
  "refresh_token": "kVjg0MQNM5QzZ4MR_oELgRJtWwTtRLGnw8mTzhs0nxk",
  "refresh_expires_at": "2026-11-27T07:32:35.093071035Z",
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
        "pl": "Zmiana planów",
        "ru": "Передумал ехать",
        "en": "Changed my mind"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "uk": "Помилився адресою",
        "pl": "Błędny adres",
        "ru": "Ошибся адресом",
        "en": "Wrong address"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "uk": "Поїду іншим транспортом",
        "pl": "Inny transport",
        "ru": "Уеду на другом транспорте",
        "en": "Found other transport"
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
  "device_ref": "sandbox-7701"
}
```

```json
{
  "challenge_id": "25ae5f76-15cd-4318-b1fb-15c7eeda776d",
  "expires_at": "2026-10-28T07:37:35.144035834Z",
  "resend_available_at": "2026-10-28T07:32:36.144035834Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "289109",
  "sent_at": "2026-10-28T07:32:35.146942847Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "25ae5f76-15cd-4318-b1fb-15c7eeda776d",
  "code": "289109",
  "device_ref": "sandbox-7701"
}
```

```json
{
  "session_id": "8ceb33e3-aa8a-4ecd-ae7a-9bfd38668901",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzY1NSwiaWF0IjoxNzkzMTcyNzU1LCJqdGkiOiJiOWUwODc2MC1jNjZjLTQ0MTItODZmNC1kMzE1YWIyMzQ1YTIiLCJzaWQiOiI4Y2ViMzNlMy1hYThhLTRlY2QtYWU3YS05YmZkMzg2Njg5MDEifQ.9gsCuv7uWq6yNEsPylfUOP7dvESMUtdjZOuTyb3V75A",
  "access_expires_at": "2026-10-28T07:47:35.198408374Z",
  "refresh_token": "5y0DoUEswsuOO5Rt8FeYxOtu8XCM6htI1LqAcPWvltI",
  "refresh_expires_at": "2026-11-27T07:32:35.197713204Z",
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
        "pl": "Pasażer nie przyszedł",
        "ru": "Пассажир не вышел",
        "en": "Passenger did not show up"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "uk": "Несправність автомобіля",
        "pl": "Awaria samochodu",
        "ru": "Неисправность автомобиля",
        "en": "Vehicle problem"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "uk": "Не можу під'їхати",
        "pl": "Nie mogę dojechać",
        "ru": "Не могу подъехать",
        "en": "Cannot reach the pickup"
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
  "session_id": "36cf81c0-67b1-4df9-927d-67c941d1c217",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM2NTUsImlhdCI6MTc5MzE3Mjc1NSwianRpIjoiM2MwMWUyNGMtMThjNy00YTIwLTlhYmMtYzc5NDMyYzZmODM2Iiwic2lkIjoiMzZjZjgxYzAtNjdiMS00ZGY5LTkyN2QtNjdjOTQxZDFjMjE3In0.DqglYz3ZaqifxKRCi2AEVmhMnxcJm09g0ZosUXWJN8c",
  "access_expires_at": "2026-10-28T07:47:35.528349568Z",
  "refresh_token": "JJHkCm0szPSqjAIIjMs72PWUqop_tAzuRt8GXoARQHc",
  "refresh_expires_at": "2026-10-28T19:32:35.527358513Z",
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
  "session_id": "2200d933-cecf-4102-93d3-cdd6e5e47ee5",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM2NTUsImlhdCI6MTc5MzE3Mjc1NSwianRpIjoiZWQxMmQxZGEtODZhMC00OWMwLTg5N2UtNGU0NTk4MWU5YTAwIiwic2lkIjoiMjIwMGQ5MzMtY2VjZi00MTAyLTkzZDMtY2RkNmU1ZTQ3ZWU1In0.rrAumtLZ8SQP6BsBuqw69BZug8JSBrYHK_1Fctvo3Sw",
  "access_expires_at": "2026-10-28T07:47:35.836576362Z",
  "refresh_token": "_AjskkvkOag6Trh4VbklC2MiMI9dpd2ZiH847jsy82A",
  "refresh_expires_at": "2026-10-28T19:32:35.835977462Z",
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
        "pl": "Na prośbę pasażera",
        "ru": "Пассажир попросил",
        "en": "Passenger asked"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "uk": "Дубль замовлення",
        "pl": "Duplikat zamówienia",
        "ru": "Дубль заказа",
        "en": "Duplicate order"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "uk": "Немає вільних авто",
        "pl": "Brak wolnych aut",
        "ru": "Нет свободных машин",
        "en": "No cars available"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "uk": "Тестове замовлення",
        "pl": "Zamówienie testowe",
        "ru": "Тестовый заказ",
        "en": "Test order"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "uk": "Помилка оператора",
        "pl": "Błąd operatora",
        "ru": "Ошибка оператора",
        "en": "Operator error"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "uk": "ДТП",
        "pl": "Wypadek",
        "ru": "ДТП",
        "en": "Accident"
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
  "command_id": "2f2c2844-1978-4473-b364-828fe00d40d2",
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
  "id": "344c0ebb-dd38-46bf-bce4-fb5105c3bba1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T07:37:35.892430Z",
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
  "command_id": "cba303ea-f9e4-4462-816f-bbba83187f2c",
  "quote_id": "344c0ebb-dd38-46bf-bce4-fb5105c3bba1",
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
  "id": "95c78b87-7ba2-46c6-9ae1-5d887981294a",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8f08890e-6439-43d7-b99d-7015f5c75a70",
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
  "created_at": "2026-10-28T07:32:35.928505Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/95c78b87-7ba2-46c6-9ae1-5d887981294a` → **200**

```json
{
  "id": "95c78b87-7ba2-46c6-9ae1-5d887981294a",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8f08890e-6439-43d7-b99d-7015f5c75a70",
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
  "created_at": "2026-10-28T07:32:35.928505Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/95c78b87-7ba2-46c6-9ae1-5d887981294a/cancel` → **200**

```json
{
  "command_id": "37d3cd50-896d-4b05-bdce-aa4a65781880",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "95c78b87-7ba2-46c6-9ae1-5d887981294a",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8f08890e-6439-43d7-b99d-7015f5c75a70",
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
  "created_at": "2026-10-28T07:32:35.928505Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "uk": "Довго чекати авто",
      "pl": "Zbyt długie oczekiwanie",
      "ru": "Долго ждать машину",
      "en": "The wait is too long"
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
  "command_id": "7cb0289d-a3fb-4eb5-a385-9f999e70e3a5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:32:36Z",
    "sequence": 1793172756554
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "15d8258a-00a4-43fa-938a-460cbdf7773f",
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
  "last_heartbeat_at": "2026-10-28T07:32:36.07315Z",
  "last_location_at": "2026-10-28T07:32:36.07315Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-15847"
}
```

```json
{
  "challenge_id": "b54aef08-0fcc-4284-8b0c-5e10e7957e29",
  "expires_at": "2026-10-28T07:37:36.101500116Z",
  "resend_available_at": "2026-10-28T07:32:37.101500116Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "186893",
  "sent_at": "2026-10-28T07:32:36.104846696Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b54aef08-0fcc-4284-8b0c-5e10e7957e29",
  "code": "186893",
  "device_ref": "sandbox-15847"
}
```

```json
{
  "session_id": "47ac982f-bf32-4bd6-82cb-434ba54e63d3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzY1NiwiaWF0IjoxNzkzMTcyNzU2LCJqdGkiOiI1MzE2NmUyOC02NTkwLTQ4NTEtYjU0ZS0wZDM3YThhNDkyMTgiLCJzaWQiOiI0N2FjOTgyZi1iZjMyLTRiZDYtODJjYi00MzRiYTU0ZTYzZDMifQ.VTqCk1r3ckFCllFTObbpGmgd04o1Kl9vkkPRNV1giYI",
  "access_expires_at": "2026-10-28T07:47:36.156846131Z",
  "refresh_token": "xZvH5HaCnkMOoJ8lUXS6th8LlsM1_3fdgBLZcK-QCkI",
  "refresh_expires_at": "2026-11-27T07:32:36.156074654Z",
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
  "command_id": "aa97bfd7-3436-4028-9f6e-c1b0c0482eff",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:32:36Z",
    "sequence": 1793172756555
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d7a2c967-b5d5-48dd-ad2b-a8e26cd7f0d1",
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
  "last_heartbeat_at": "2026-10-28T07:32:36.218342Z",
  "last_location_at": "2026-10-28T07:32:36.218342Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f6967d7b-0ab3-4fec-a1e6-717511df93e3",
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
  "id": "9a7850c5-805b-4e3b-963b-f98062d4eafd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T07:37:36.255774Z",
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
  "command_id": "0c28077c-34c8-4ec4-9390-6222fe279a3c",
  "quote_id": "9a7850c5-805b-4e3b-963b-f98062d4eafd",
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
  "id": "b4666c81-4432-4038-b84f-2468798c42a3",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8f08890e-6439-43d7-b99d-7015f5c75a70",
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
  "created_at": "2026-10-28T07:32:36.295334Z",
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
    "id": "3a955398-0053-4a0b-b0a3-e59f8f3a31d8",
    "order_id": "b4666c81-4432-4038-b84f-2468798c42a3",
    "expires_at": "2026-10-28T07:32:51.30105Z",
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

`POST /api/driver/v1/offers/3a955398-0053-4a0b-b0a3-e59f8f3a31d8/accept` → **200**

```json
{
  "command_id": "b9bdbc49-fa0e-496f-9c64-eeba1b3f3086"
}
```

```json
{
  "id": "c081ba1f-9dba-4ca8-abde-9cc58df3874c",
  "order_id": "b4666c81-4432-4038-b84f-2468798c42a3",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8ed553a8-fbf2-4601-9a35-a7c7c67b1f24",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8ed553a8-fbf2-4601-9a35-a7c7c67b1f24",
  "order_id": "b4666c81-4432-4038-b84f-2468798c42a3",
  "assignment_id": "c081ba1f-9dba-4ca8-abde-9cc58df3874c",
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

`POST /api/driver/v1/trips/8ed553a8-fbf2-4601-9a35-a7c7c67b1f24/cancel` → **200**

```json
{
  "command_id": "710f8582-b97b-4b9e-ac2f-7a45e6ee226f",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "8ed553a8-fbf2-4601-9a35-a7c7c67b1f24",
  "order_id": "b4666c81-4432-4038-b84f-2468798c42a3",
  "assignment_id": "c081ba1f-9dba-4ca8-abde-9cc58df3874c",
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

`GET /api/rider/v1/orders/b4666c81-4432-4038-b84f-2468798c42a3` → **200**

```json
{
  "id": "b4666c81-4432-4038-b84f-2468798c42a3",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "8f08890e-6439-43d7-b99d-7015f5c75a70",
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
    "id": "c081ba1f-9dba-4ca8-abde-9cc58df3874c",
    "order_id": "b4666c81-4432-4038-b84f-2468798c42a3",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "8ed553a8-fbf2-4601-9a35-a7c7c67b1f24",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T07:32:36.295334Z",
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
    "id": "43908d5d-0244-4e23-81ef-9d7e1100a79e",
    "order_id": "b4666c81-4432-4038-b84f-2468798c42a3",
    "expires_at": "2026-10-28T07:32:51.452406Z",
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

`POST /api/driver/v1/offers/43908d5d-0244-4e23-81ef-9d7e1100a79e/accept` → **200**

```json
{
  "command_id": "a295b726-4cc2-450d-9547-f2e5c7e0e19f"
}
```

```json
{
  "id": "f15201c2-8334-4438-897d-77f01a22cf80",
  "order_id": "b4666c81-4432-4038-b84f-2468798c42a3",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "52e13e25-f86b-4310-969a-dcc215ddc0f6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "52e13e25-f86b-4310-969a-dcc215ddc0f6",
  "order_id": "b4666c81-4432-4038-b84f-2468798c42a3",
  "assignment_id": "f15201c2-8334-4438-897d-77f01a22cf80",
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

`POST /api/driver/v1/trips/52e13e25-f86b-4310-969a-dcc215ddc0f6/cancel` → **200**

```json
{
  "command_id": "60c1fff6-045b-41f6-963b-79b79de6077a",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "52e13e25-f86b-4310-969a-dcc215ddc0f6",
  "order_id": "b4666c81-4432-4038-b84f-2468798c42a3",
  "assignment_id": "f15201c2-8334-4438-897d-77f01a22cf80",
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
    "id": "b4666c81-4432-4038-b84f-2468798c42a3",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T07:32:36.295334Z",
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
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel"
      }
    },
    "pickup_at": null
  },
  {
    "id": "95c78b87-7ba2-46c6-9ae1-5d887981294a",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T07:32:35.928505Z",
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
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/b4666c81-4432-4038-b84f-2468798c42a3/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T07:32:36.296476Z",
      "actor": {
        "type": "CLIENT",
        "id": "8f08890e-6439-43d7-b99d-7015f5c75a70",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b4666c81-4432-4038-b84f-2468798c42a3",
        "quote_id": "9a7850c5-805b-4e3b-963b-f98062d4eafd",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T07:32:36.299644Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b4666c81-4432-4038-b84f-2468798c42a3",
        "attempt_id": "e9eb7265-7531-4699-9516-efd458814ac0",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T07:32:36.314995Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3a955398-0053-4a0b-b0a3-e59f8f3a31d8",
        "order_id": "b4666c81-4432-4038-b84f-2468798c42a3",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T07:32:36.382604Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "3a955398-0053-4a0b-b0a3-e59f8f3a31d8",
        "order_id": "b4666c81-4432-4038-b84f-2468798c42a3",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "c081ba1f-9dba-4ca8-abde-9cc58df3874c"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 95c78b87-7ba2-46c6-9ae1-5d887981294a, b4666c81-4432-4038-b84f-2468798c42a3.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733456930",
  "device_ref": "sandbox-15158"
}
```

```json
{
  "challenge_id": "9984cd4b-c95d-4f58-a48c-31a2db35f77a",
  "expires_at": "2026-10-28T07:37:36.685305581Z",
  "resend_available_at": "2026-10-28T07:32:37.685305581Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380733456930` → **200**

```json
{
  "phone": "+380733456930",
  "audience": "CLIENT",
  "code": "573299",
  "sent_at": "2026-10-28T07:32:36.688434965Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9984cd4b-c95d-4f58-a48c-31a2db35f77a",
  "code": "573299",
  "device_ref": "sandbox-15158"
}
```

```json
{
  "session_id": "8fada372-5875-4ad3-a858-3d750f0810fe",
  "subject": {
    "type": "CLIENT",
    "id": "503a4f0f-eac4-4ade-9c5c-006151ea5f7e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MDNhNGYwZi1lYWM0LTRhZGUtOWM1Yy0wMDYxNTFlYTVmN2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNjU2LCJpYXQiOjE3OTMxNzI3NTYsImp0aSI6IjI4NmJjMzE4LWY1NzUtNDMwYy04OTcyLWE0OWM0YmRkZGVhOSIsInNpZCI6IjhmYWRhMzcyLTU4NzUtNGFkMy1hODU4LTNkNzUwZjA4MTBmZSJ9.zq6384yXP2C-Bxjj4IVs-KEXRXNuUBbGhm_uhU4VC0Y",
  "access_expires_at": "2026-10-28T07:47:36.736809759Z",
  "refresh_token": "SM1sH8BqyDIfanGLP12CxPWyXNCsvARq6vbWPKQ58qU",
  "refresh_expires_at": "2026-11-27T07:32:36.736255096Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "7df6a590-0129-4775-909d-d2fcfc1b707f",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "10a28786-b942-4329-b1ca-8d2efb189d7f",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-10a28786-b942-4329-b1ca-8d2efb189d7f",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "2380522d61d342b1d795f9e4090b4298",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=10a28786-b942-4329-b1ca-8d2efb189d7f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733456930"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=10a28786-b942-4329-b1ca-8d2efb189d7f",
  "expires_at": "2026-10-28T08:02:36.767442Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/10a28786-b942-4329-b1ca-8d2efb189d7f` → **200**

```json
{
  "id": "10a28786-b942-4329-b1ca-8d2efb189d7f",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T08:02:36.767442Z",
  "card": {
    "id": "7a6839ed-8d54-4364-b0e7-a324e3fd58f3",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5578",
    "card_type": "Visa",
    "created_at": "2026-10-28T07:32:36.808216Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "7a6839ed-8d54-4364-b0e7-a324e3fd58f3",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****5578",
      "card_type": "Visa",
      "created_at": "2026-10-28T07:32:36.808216Z"
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
  "device_ref": "sandbox-29844"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "e9d96217-2400-48cb-94fb-be956cb4bfc0",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-29844"
}
```

```json
{
  "challenge_id": "6ced7c32-0390-42a8-818e-13cd4712bc9e",
  "expires_at": "2026-10-28T07:37:37.905859664Z",
  "resend_available_at": "2026-10-28T07:32:38.905859664Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "890258",
  "sent_at": "2026-10-28T07:32:37.908720219Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6ced7c32-0390-42a8-818e-13cd4712bc9e",
  "code": "890258",
  "device_ref": "sandbox-29844"
}
```

```json
{
  "session_id": "2e40e074-d70f-430c-9ea0-19e914ba62ce",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzY1NywiaWF0IjoxNzkzMTcyNzU3LCJqdGkiOiJmOWM4MmJjZS03ZjM2LTQ5NjktODRhNi00ZTZiNTAwMzg1MDgiLCJzaWQiOiIyZTQwZTA3NC1kNzBmLTQzMGMtOWVhMC0xOWU5MTRiYTYyY2UifQ.w28YBtM_Mgdh0Sq9aC9p-Cg4_rIhl3wSDL8M8XZgmPE",
  "access_expires_at": "2026-10-28T07:47:37.954682596Z",
  "refresh_token": "C8v4w_Ts9J_CIGHyRCYvoEC1unAEirVNZdl4YXb2OPQ",
  "refresh_expires_at": "2026-11-27T07:32:37.954017418Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d7a2c967-b5d5-48dd-ad2b-a8e26cd7f0d1",
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
  "last_heartbeat_at": "2026-10-28T07:32:36.218342Z",
  "last_location_at": "2026-10-28T07:32:36.218342Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d7a2c967-b5d5-48dd-ad2b-a8e26cd7f0d1/handover` → **200**

```json
{
  "command_id": "8a6836b2-b296-42f6-a05c-30f58076b881",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d7a2c967-b5d5-48dd-ad2b-a8e26cd7f0d1",
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
  "last_heartbeat_at": "2026-10-28T07:32:36.218342Z",
  "last_location_at": "2026-10-28T07:32:36.218342Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d7a2c967-b5d5-48dd-ad2b-a8e26cd7f0d1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:32:38Z",
    "sequence": 1793172758347
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d7a2c967-b5d5-48dd-ad2b-a8e26cd7f0d1",
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
  "last_heartbeat_at": "2026-10-28T07:32:38.053121Z",
  "last_location_at": "2026-10-28T07:32:38.053121Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c9355c84-6b64-47cc-b83d-16744c0cbc90",
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
  "id": "fbdf8d00-76b1-41c9-95f4-2ae5ea1d4a3c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-28T07:37:38.090312Z",
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
  "command_id": "5bd5af90-9955-4da1-b6d5-3177c4facc37",
  "quote_id": "fbdf8d00-76b1-41c9-95f4-2ae5ea1d4a3c",
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
  "id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "503a4f0f-eac4-4ade-9c5c-006151ea5f7e",
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
  "created_at": "2026-10-28T07:32:38.12752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/eaf5cf45-5b8f-4fbf-a6c7-e596ed810603` → **200**

```json
{
  "id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "503a4f0f-eac4-4ade-9c5c-006151ea5f7e",
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
  "created_at": "2026-10-28T07:32:38.12752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/eaf5cf45-5b8f-4fbf-a6c7-e596ed810603` → **200**

```json
{
  "id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "503a4f0f-eac4-4ade-9c5c-006151ea5f7e",
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
  "created_at": "2026-10-28T07:32:38.12752Z",
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
    "id": "90bff3a2-3d24-4142-a13c-0ac5832dd3ef",
    "order_id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
    "expires_at": "2026-10-28T07:32:53.405143Z",
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

`POST /api/driver/v1/offers/90bff3a2-3d24-4142-a13c-0ac5832dd3ef/accept` → **200**

```json
{
  "command_id": "18f068b6-c443-4a5a-a21d-3cdf97cd97fa"
}
```

```json
{
  "id": "a6f6c380-adaa-4cdc-95d3-348bce0785a0",
  "order_id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "13a49ce2-40af-485f-a96d-c06e8670b39c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "13a49ce2-40af-485f-a96d-c06e8670b39c",
  "order_id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
  "assignment_id": "a6f6c380-adaa-4cdc-95d3-348bce0785a0",
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

`POST /api/driver/v1/work-sessions/d7a2c967-b5d5-48dd-ad2b-a8e26cd7f0d1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:32:39Z",
    "sequence": 1793172759290
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d7a2c967-b5d5-48dd-ad2b-a8e26cd7f0d1",
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
  "last_heartbeat_at": "2026-10-28T07:32:39.308337Z",
  "last_location_at": "2026-10-28T07:32:39.308337Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/13a49ce2-40af-485f-a96d-c06e8670b39c/arrive` → **200**

```json
{
  "command_id": "30e848b1-d852-4861-a1ce-ea17e6066b13",
  "expected_version": 0
}
```

```json
{
  "id": "13a49ce2-40af-485f-a96d-c06e8670b39c",
  "order_id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
  "assignment_id": "a6f6c380-adaa-4cdc-95d3-348bce0785a0",
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
  "arrived_at": "2026-10-28T07:32:39.341905Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/13a49ce2-40af-485f-a96d-c06e8670b39c/start` → **200**

```json
{
  "command_id": "e517315b-c57f-4235-84e0-754b018d7222",
  "expected_version": 1
}
```

```json
{
  "id": "13a49ce2-40af-485f-a96d-c06e8670b39c",
  "order_id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
  "assignment_id": "a6f6c380-adaa-4cdc-95d3-348bce0785a0",
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
  "arrived_at": "2026-10-28T07:32:39.341905Z",
  "started_at": "2026-10-28T07:32:39.377977Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/13a49ce2-40af-485f-a96d-c06e8670b39c/complete` → **200**

```json
{
  "command_id": "e4df9df6-10c7-4e30-b719-5102f7eda3b7",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:32:39Z"
}
```

```json
{
  "id": "13a49ce2-40af-485f-a96d-c06e8670b39c",
  "order_id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
  "assignment_id": "a6f6c380-adaa-4cdc-95d3-348bce0785a0",
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
  "arrived_at": "2026-10-28T07:32:39.341905Z",
  "started_at": "2026-10-28T07:32:39.377977Z",
  "completed_at": "2026-10-28T07:32:39.415514Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/eaf5cf45-5b8f-4fbf-a6c7-e596ed810603` → **200**

```json
{
  "id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "503a4f0f-eac4-4ade-9c5c-006151ea5f7e",
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
    "id": "a6f6c380-adaa-4cdc-95d3-348bce0785a0",
    "order_id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "13a49ce2-40af-485f-a96d-c06e8670b39c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:32:38.12752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/eaf5cf45-5b8f-4fbf-a6c7-e596ed810603` → **200**

```json
{
  "id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "503a4f0f-eac4-4ade-9c5c-006151ea5f7e",
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
    "id": "a6f6c380-adaa-4cdc-95d3-348bce0785a0",
    "order_id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "13a49ce2-40af-485f-a96d-c06e8670b39c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:32:38.12752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/eaf5cf45-5b8f-4fbf-a6c7-e596ed810603` → **200**

```json
{
  "id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "503a4f0f-eac4-4ade-9c5c-006151ea5f7e",
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
    "id": "a6f6c380-adaa-4cdc-95d3-348bce0785a0",
    "order_id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "13a49ce2-40af-485f-a96d-c06e8670b39c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:32:38.12752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/eaf5cf45-5b8f-4fbf-a6c7-e596ed810603` → **200**

```json
{
  "id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "503a4f0f-eac4-4ade-9c5c-006151ea5f7e",
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
    "id": "a6f6c380-adaa-4cdc-95d3-348bce0785a0",
    "order_id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "13a49ce2-40af-485f-a96d-c06e8670b39c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:32:38.12752Z",
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
      "id": "386a3418-4966-4354-8139-5700e292987f",
      "at": "2026-10-28T07:32:40.444054Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/eaf5cf45-5b8f-4fbf-a6c7-e596ed810603/tip` → **200**

```json
{
  "order_id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
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
  "available_until": "2026-10-29T07:32:39.415514Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/eaf5cf45-5b8f-4fbf-a6c7-e596ed810603/tip` → **201**

```json
{
  "command_id": "d6e3ab81-f65c-43e2-aba1-77231a623d1f",
  "amount_minor": 2500
}
```

```json
{
  "id": "2ced78b5-5dc9-4ee2-9b54-8da0ce0d6562",
  "order_id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T07:32:42.631104Z"
}
```

`GET /api/rider/v1/orders/eaf5cf45-5b8f-4fbf-a6c7-e596ed810603/tip` → **200**

```json
{
  "order_id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
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
  "available_until": "2026-10-29T07:32:39.415514Z",
  "open": false,
  "tip": {
    "id": "2ced78b5-5dc9-4ee2-9b54-8da0ce0d6562",
    "order_id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T07:32:42.631104Z"
  }
}
```

`GET /api/rider/v1/orders/eaf5cf45-5b8f-4fbf-a6c7-e596ed810603/tip` → **200**

```json
{
  "order_id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
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
  "available_until": "2026-10-29T07:32:39.415514Z",
  "open": false,
  "tip": {
    "id": "2ced78b5-5dc9-4ee2-9b54-8da0ce0d6562",
    "order_id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T07:32:42.631104Z"
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
      "id": "386a3418-4966-4354-8139-5700e292987f",
      "at": "2026-10-28T07:32:40.444054Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
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
      "id": "1539f386-bc99-4279-bfe6-4825cc69dede",
      "at": "2026-10-28T07:32:44.494149Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
      "counterpart_id": null
    },
    {
      "id": "386a3418-4966-4354-8139-5700e292987f",
      "at": "2026-10-28T07:32:40.444054Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "eaf5cf45-5b8f-4fbf-a6c7-e596ed810603",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d7a2c967-b5d5-48dd-ad2b-a8e26cd7f0d1",
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
  "last_heartbeat_at": "2026-10-28T07:32:39.308337Z",
  "last_location_at": "2026-10-28T07:32:39.308337Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d7a2c967-b5d5-48dd-ad2b-a8e26cd7f0d1/close` → **200**

```json
{
  "command_id": "9c98895b-0a0c-4c38-8ddb-2451e4baea38",
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

Done: card order eaf5cf45-5b8f-4fbf-a6c7-e596ed810603.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731189972",
  "device_ref": "sandbox-21771"
}
```

```json
{
  "challenge_id": "61b9708b-7235-478f-bf74-6657aa8ff927",
  "expires_at": "2026-10-28T07:37:44.820154623Z",
  "resend_available_at": "2026-10-28T07:32:45.820154623Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380731189972` → **200**

```json
{
  "phone": "+380731189972",
  "audience": "CLIENT",
  "code": "002732",
  "sent_at": "2026-10-28T07:32:44.822854009Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "61b9708b-7235-478f-bf74-6657aa8ff927",
  "code": "002732",
  "device_ref": "sandbox-21771"
}
```

```json
{
  "session_id": "e41453bf-38ca-4720-8d6e-b5068d7fd298",
  "subject": {
    "type": "CLIENT",
    "id": "31f9541e-362f-47d0-aee3-bfdcc7a0ab0e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWY5NTQxZS0zNjJmLTQ3ZDAtYWVlMy1iZmRjYzdhMGFiMGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNjY0LCJpYXQiOjE3OTMxNzI3NjQsImp0aSI6ImRkMTMwM2Y0LTgxY2QtNDllNy04Y2FhLWNhZGMyNmM1Y2M2MCIsInNpZCI6ImU0MTQ1M2JmLTM4Y2EtNDcyMC04ZDZlLWI1MDY4ZDdmZDI5OCJ9.mu3j1HJXw4RmPxuxQibBioOliTVPItsgCCq1lapMYJ8",
  "access_expires_at": "2026-10-28T07:47:44.86943757Z",
  "refresh_token": "Xrjm3qXnQLjeKMppEu2V7vd_P0nnMVt_R6Xxsdn2J2Y",
  "refresh_expires_at": "2026-11-27T07:32:44.86874514Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "f9760112-7514-43ac-94c3-e2f1a4bc6980",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "3d0fa2e6-3642-4fa2-8a9c-8bbdd106e2ba",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-3d0fa2e6-3642-4fa2-8a9c-8bbdd106e2ba",
    "orderDate": "1793172764",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "62b6c02e37232dc0b8022b79a44bb347",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=3d0fa2e6-3642-4fa2-8a9c-8bbdd106e2ba",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731189972"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=3d0fa2e6-3642-4fa2-8a9c-8bbdd106e2ba",
  "created_at": "2026-10-28T07:32:44.901433Z",
  "expires_at": "2026-10-28T08:02:44.901433Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/3d0fa2e6-3642-4fa2-8a9c-8bbdd106e2ba` → **200**

```json
{
  "id": "3d0fa2e6-3642-4fa2-8a9c-8bbdd106e2ba",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T07:32:44.901433Z",
  "expires_at": "2026-10-28T08:02:44.901433Z",
  "completed_at": "2026-10-28T07:32:44.934027Z",
  "masked_pan": "41****1376",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "31f9541e-362f-47d0-aee3-bfdcc7a0ab0e",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "31f9541e-362f-47d0-aee3-bfdcc7a0ab0e",
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
      "id": "7703663d-413e-4ff4-9410-458f2c578c4c",
      "at": "2026-10-28T07:32:45.508744Z",
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
  "client_id": "31f9541e-362f-47d0-aee3-bfdcc7a0ab0e",
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
      "id": "7703663d-413e-4ff4-9410-458f2c578c4c",
      "at": "2026-10-28T07:32:45.508744Z",
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
  "device_ref": "sandbox-15936"
}
```

```json
{
  "challenge_id": "4092a003-0f81-447b-94b4-6aad6dd5d5aa",
  "expires_at": "2026-10-28T07:37:46.045028734Z",
  "resend_available_at": "2026-10-28T07:32:47.045028734Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "192264",
  "sent_at": "2026-10-28T07:32:46.047674713Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4092a003-0f81-447b-94b4-6aad6dd5d5aa",
  "code": "192264",
  "device_ref": "sandbox-15936"
}
```

```json
{
  "session_id": "057e853c-b743-4a5b-9728-049f17b29506",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzY2NiwiaWF0IjoxNzkzMTcyNzY2LCJqdGkiOiI3ZTIyOTY2YS1jMDg5LTRiNzUtOGY3MS1lOGYzMzExNDMxMjgiLCJzaWQiOiIwNTdlODUzYy1iNzQzLTRhNWItOTcyOC0wNDlmMTdiMjk1MDYifQ.8Anxut0gD1jPquGeiGJeYhuRxyIsaLJdWIMrv34P7Wg",
  "access_expires_at": "2026-10-28T07:47:46.098145252Z",
  "refresh_token": "GdvFNl64AM3SAgbOvOteUjOA1uO5kE7HMrOgXcZlbqk",
  "refresh_expires_at": "2026-11-27T07:32:46.097410814Z",
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
  "command_id": "9d15b11c-8133-4c17-9026-4974da910786",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "9b8d4999-c457-40cf-992d-d9d328738d01",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-9b8d4999-c457-40cf-992d-d9d328738d01",
    "orderDate": "1793172766",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "ce253603334191da09cc78bf2c4a9b7f",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=9b8d4999-c457-40cf-992d-d9d328738d01",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=9b8d4999-c457-40cf-992d-d9d328738d01",
  "created_at": "2026-10-28T07:32:46.14681Z",
  "expires_at": "2026-10-28T08:02:46.14681Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/9b8d4999-c457-40cf-992d-d9d328738d01` → **200**

```json
{
  "id": "9b8d4999-c457-40cf-992d-d9d328738d01",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T07:32:46.14681Z",
  "expires_at": "2026-10-28T08:02:46.14681Z",
  "completed_at": "2026-10-28T07:32:46.176371Z",
  "masked_pan": "41****9188",
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
      "id": "305e34c6-8a46-4146-ac26-57d651242538",
      "at": "2026-10-28T07:32:46.516875Z",
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
  "command_id": "3c248c2c-07ca-4419-9ea5-37d76540a104",
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
  "correlation_id": "df42c2a2-beb4-4704-9a41-842f2f232038"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674133036",
  "device_ref": "sandbox-3440"
}
```

```json
{
  "challenge_id": "17d44987-c37e-4bbc-82c6-07757867ab64",
  "expires_at": "2026-10-28T07:37:47.29898324Z",
  "resend_available_at": "2026-10-28T07:32:48.29898324Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674133036` → **200**

```json
{
  "phone": "+380674133036",
  "audience": "CLIENT",
  "code": "912441",
  "sent_at": "2026-10-28T07:32:47.301957854Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "17d44987-c37e-4bbc-82c6-07757867ab64",
  "code": "912441",
  "device_ref": "sandbox-3440"
}
```

```json
{
  "session_id": "83480d23-0650-4d4a-94d4-b2679b225887",
  "subject": {
    "type": "CLIENT",
    "id": "6ff3f9e6-5ed2-4272-a75f-8490da6a651d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmYzZjllNi01ZWQyLTQyNzItYTc1Zi04NDkwZGE2YTY1MWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNjY3LCJpYXQiOjE3OTMxNzI3NjcsImp0aSI6IjJiNDkxODc0LTRmMTctNDM3MS05OTcwLTk0OTgxNjQ5NTQ4YyIsInNpZCI6IjgzNDgwZDIzLTA2NTAtNGQ0YS05NGQ0LWIyNjc5YjIyNTg4NyJ9.6qCPMlyf6L51GGlURXPatcZvXkJPpzR1A6Hbk_cfGHQ",
  "access_expires_at": "2026-10-28T07:47:47.349101585Z",
  "refresh_token": "FAx7aHxPbtXSKphmA97SlkTqwiQaCHKAR9_LHUG_vxk",
  "refresh_expires_at": "2026-11-27T07:32:47.348457701Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6ff3f9e6-5ed2-4272-a75f-8490da6a651d",
  "session_id": "83480d23-0650-4d4a-94d4-b2679b225887",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "747eba3f-11e4-4df2-8a1b-ffa341f378a2",
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
  "id": "dee2646f-93e9-4af0-9d0c-af92331c167a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:37:47.401924Z",
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
  "challenge_id": "0b8b3f1c-c1a0-4f26-8973-356d9d485c38",
  "expires_at": "2026-10-28T07:37:49.438584858Z",
  "resend_available_at": "2026-10-28T07:32:50.438584858Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674133036` → **200**

```json
{
  "phone": "+380674133036",
  "audience": "CLIENT",
  "code": "287345",
  "sent_at": "2026-10-28T07:32:49.441141783Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "1e53e9aa-fafe-4a17-a128-3b470256375d",
  "challenge_id": "0b8b3f1c-c1a0-4f26-8973-356d9d485c38",
  "otp_code": "287345"
}
```

```json
{
  "client_id": "6ff3f9e6-5ed2-4272-a75f-8490da6a651d",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T07:32:49.499072068Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "435a7101-df86-43e5-9046-85c4437806cb",
  "quote_id": "dee2646f-93e9-4af0-9d0c-af92331c167a",
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
  "correlation_id": "822d88db-ebdb-48a1-84fe-2e0a8bf6e038"
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
  "session_id": "31ae4a53-cf45-46dc-9c27-7d59509d3079",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM2NjksImlhdCI6MTc5MzE3Mjc2OSwianRpIjoiZjI3ODlkM2UtMGY1My00NDg1LThkNTAtZjRlZDIxNmYzMzViIiwic2lkIjoiMzFhZTRhNTMtY2Y0NS00NmRjLTljMjctN2Q1OTUwOWQzMDc5In0.TVqAFmWJZFWVX9lMTg4z0SmaszwL2MjsxT7Mv03W4Q4",
  "access_expires_at": "2026-10-28T07:47:49.845079703Z",
  "refresh_token": "nfwhz5wEGl3WdJ0zooXS9f_4oSNBmyQ-nXfHHnSNtkI",
  "refresh_expires_at": "2026-10-28T19:32:49.844364184Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "6ff3f9e6-5ed2-4272-a75f-8490da6a651d",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T07:32:49.499072Z",
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

`POST /api/admin/v1/client-deletions/6ff3f9e6-5ed2-4272-a75f-8490da6a651d/complete` → **200**

```json
{
  "command_id": "d2af0443-0936-4402-9f86-da986266111f",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "6ff3f9e6-5ed2-4272-a75f-8490da6a651d",
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
  "correlation_id": "a1f73347-3098-4ff8-93af-8a25d9553356"
}
```

Done: client 6ff3f9e6-5ed2-4272-a75f-8490da6a651d anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662671013",
  "device_ref": "sandbox-13230"
}
```

```json
{
  "challenge_id": "e03e1648-f54d-4362-b657-812c71dd8ae6",
  "expires_at": "2026-10-28T07:37:49.971907857Z",
  "resend_available_at": "2026-10-28T07:32:50.971907857Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662671013` → **200**

```json
{
  "phone": "+380662671013",
  "audience": "CLIENT",
  "code": "927295",
  "sent_at": "2026-10-28T07:32:49.97444798Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e03e1648-f54d-4362-b657-812c71dd8ae6",
  "code": "927295",
  "device_ref": "sandbox-13230"
}
```

```json
{
  "session_id": "24b29470-2002-4526-9a5a-0fbdef20b2c1",
  "subject": {
    "type": "CLIENT",
    "id": "7dd75914-4eaf-4e53-8bce-6764d091aa91"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZGQ3NTkxNC00ZWFmLTRlNTMtOGJjZS02NzY0ZDA5MWFhOTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNjcwLCJpYXQiOjE3OTMxNzI3NzAsImp0aSI6IjUyZGQzYjIzLTE3NTktNDVjOS1iZmY0LWYwMDFiN2YzODc3NyIsInNpZCI6IjI0YjI5NDcwLTIwMDItNDUyNi05YTVhLTBmYmRlZjIwYjJjMSJ9.QVNzL8cKElYBR_Tt7vSW_J3xCY4xj19TvR15kCFsVRQ",
  "access_expires_at": "2026-10-28T07:47:50.027622411Z",
  "refresh_token": "4lpgi5Luic9f-HhSfWTpotbqbzAqOZGsICu05rD4jnw",
  "refresh_expires_at": "2026-11-27T07:32:50.026932062Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7dd75914-4eaf-4e53-8bce-6764d091aa91",
  "session_id": "24b29470-2002-4526-9a5a-0fbdef20b2c1",
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
  "session_id": "231db16b-62d7-4a3d-9ea1-bf8c25688841",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM2NzAsImlhdCI6MTc5MzE3Mjc3MCwianRpIjoiM2Q4MjMzMjEtMzM0Ni00ZDc0LThmYTctOGY1ZGE1NGRkMWZhIiwic2lkIjoiMjMxZGIxNmItNjJkNy00YTNkLTllYTEtYmY4YzI1Njg4ODQxIn0.HiiU5W2R3Pd7QpkzAX2aZa0s0HaOs_J88_6F6LLSP88",
  "access_expires_at": "2026-10-28T07:47:50.358088489Z",
  "refresh_token": "1S7BcZBC4TX7-Wq3Rm0tYZyRMsOzh3A3N0V24gB8Gmo",
  "refresh_expires_at": "2026-10-28T19:32:50.357494072Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=2671013&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "7dd75914-4eaf-4e53-8bce-6764d091aa91",
      "phone": "+380662671013",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T07:32:50.024294Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/7dd75914-4eaf-4e53-8bce-6764d091aa91` → **200**

```json
{
  "client": {
    "id": "7dd75914-4eaf-4e53-8bce-6764d091aa91",
    "phone": "+380662671013",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T07:32:50.024294Z",
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

`POST /api/admin/v1/clients/7dd75914-4eaf-4e53-8bce-6764d091aa91/block` → **400**

```json
{
  "command_id": "f97620ee-1abd-43e0-95b2-2fb98be5a8a8",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/7dd75914-4eaf-4e53-8bce-6764d091aa91/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "78746e2c-954c-4fa0-a34f-cb6fb16a73b3",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/7dd75914-4eaf-4e53-8bce-6764d091aa91/block` → **200**

```json
{
  "command_id": "dd6d03d6-3ff1-4035-a3e3-6357d6fc2343",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "7dd75914-4eaf-4e53-8bce-6764d091aa91",
  "phone": "+380662671013",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T07:32:50.024294Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T07:32:50.506859Z",
    "by": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
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
  "correlation_id": "00a9ed38-a221-464f-bfaa-0a021e65e45e"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662671013",
  "device_ref": "sandbox-14554"
}
```

```json
{
  "challenge_id": "75aa3d00-fe34-49eb-a9df-3f840b44ab7e",
  "expires_at": "2026-10-28T07:37:52.56730061Z",
  "resend_available_at": "2026-10-28T07:32:53.56730061Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662671013` → **200**

```json
{
  "phone": "+380662671013",
  "audience": "CLIENT",
  "code": "310477",
  "sent_at": "2026-10-28T07:32:52.569695065Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "75aa3d00-fe34-49eb-a9df-3f840b44ab7e",
  "code": "310477",
  "device_ref": "sandbox-14554"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "74f5222d-0c02-442e-9406-bb967f689022"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/7dd75914-4eaf-4e53-8bce-6764d091aa91` → **200**

```json
{
  "client": {
    "id": "7dd75914-4eaf-4e53-8bce-6764d091aa91",
    "phone": "+380662671013",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T07:32:50.024294Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T07:32:50.506859Z",
      "by": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
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

`POST /api/admin/v1/clients/7dd75914-4eaf-4e53-8bce-6764d091aa91/unblock` → **200**

```json
{
  "command_id": "0d199ce7-d148-4a3a-b74d-218815044b65",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "7dd75914-4eaf-4e53-8bce-6764d091aa91",
  "phone": "+380662671013",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T07:32:50.024294Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662671013",
  "device_ref": "sandbox-13342"
}
```

```json
{
  "challenge_id": "9e52ecf5-a6b8-4bb4-b132-3ed5c1af57cb",
  "expires_at": "2026-10-28T07:37:54.713766964Z",
  "resend_available_at": "2026-10-28T07:32:55.713766964Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662671013` → **200**

```json
{
  "phone": "+380662671013",
  "audience": "CLIENT",
  "code": "885338",
  "sent_at": "2026-10-28T07:32:54.718882721Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9e52ecf5-a6b8-4bb4-b132-3ed5c1af57cb",
  "code": "885338",
  "device_ref": "sandbox-13342"
}
```

```json
{
  "session_id": "413d4daa-8388-493e-9812-cea0532fe117",
  "subject": {
    "type": "CLIENT",
    "id": "7dd75914-4eaf-4e53-8bce-6764d091aa91"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZGQ3NTkxNC00ZWFmLTRlNTMtOGJjZS02NzY0ZDA5MWFhOTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNjc0LCJpYXQiOjE3OTMxNzI3NzQsImp0aSI6IjZkM2QxZjE4LTEwMjctNDQyMi1iYjg2LWFmOWNiZGViYzBkNyIsInNpZCI6IjQxM2Q0ZGFhLTgzODgtNDkzZS05ODEyLWNlYTA1MzJmZTExNyJ9.uX8D2rQ3Uo3aKDCDxxM1MT46HMMMnjLjNuZ4dzvNLx0",
  "access_expires_at": "2026-10-28T07:47:54.772890123Z",
  "refresh_token": "OF8kKtSqX7iJZtbZxZ0zFU46xXRflYH-Gz5viSj3_0Q",
  "refresh_expires_at": "2026-11-27T07:32:54.772272677Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7dd75914-4eaf-4e53-8bce-6764d091aa91",
  "session_id": "413d4daa-8388-493e-9812-cea0532fe117",
  "account_state": "ACTIVE"
}
```

Done: found, blocked (signed out, sign-in refused) and unblocked.

# Scenario: data-export

## A rider signs in and asks for a code to confirm the copy

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638448347",
  "device_ref": "sandbox-31709"
}
```

```json
{
  "challenge_id": "65c0300a-ff52-4d88-b2ee-ec0e08726164",
  "expires_at": "2026-10-28T07:37:54.826225654Z",
  "resend_available_at": "2026-10-28T07:32:55.826225654Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638448347` → **200**

```json
{
  "phone": "+380638448347",
  "audience": "CLIENT",
  "code": "289048",
  "sent_at": "2026-10-28T07:32:54.828729783Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "65c0300a-ff52-4d88-b2ee-ec0e08726164",
  "code": "289048",
  "device_ref": "sandbox-31709"
}
```

```json
{
  "session_id": "ba5749f9-860c-4562-a8f6-2fdd60bcbba2",
  "subject": {
    "type": "CLIENT",
    "id": "eb3084b7-7aff-4169-94f6-7e50680263b6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYjMwODRiNy03YWZmLTQxNjktOTRmNi03ZTUwNjgwMjYzYjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNjc0LCJpYXQiOjE3OTMxNzI3NzQsImp0aSI6IjFjYzQ3YzEzLTE5MDUtNGMxNi04ZmIzLTMzMWY1YWMyODJhZiIsInNpZCI6ImJhNTc0OWY5LTg2MGMtNDU2Mi1hOGY2LTJmZGQ2MGJjYmJhMiJ9.SkYPZkjY62WUA_undYNw3riOqwXiCq6s6qAVjaAyp4c",
  "access_expires_at": "2026-10-28T07:47:54.878380542Z",
  "refresh_token": "BS75cn0E5l_aZU34xVomiiM10mxZ1ZYfVKV1fev2HCU",
  "refresh_expires_at": "2026-11-27T07:32:54.877595033Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "ad193489-b467-4665-8809-c3b27cbe05fb",
  "expires_at": "2026-10-28T07:37:56.909339785Z",
  "resend_available_at": "2026-10-28T07:32:57.909339785Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638448347` → **200**

```json
{
  "phone": "+380638448347",
  "audience": "CLIENT",
  "code": "656060",
  "sent_at": "2026-10-28T07:32:56.911351296Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "6bb2f41e-3f90-4ce3-8232-341fb9a5f60c",
  "challenge_id": "ad193489-b467-4665-8809-c3b27cbe05fb",
  "otp_code": "656060"
}
```

```json
{
  "id": "334b830a-84c2-42b6-b980-302eaac6f04c",
  "state": "PENDING",
  "created_at": "2026-10-28T07:32:56.963623Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/334b830a-84c2-42b6-b980-302eaac6f04c` → **200**

```json
{
  "id": "334b830a-84c2-42b6-b980-302eaac6f04c",
  "state": "PENDING",
  "created_at": "2026-10-28T07:32:56.963623Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/334b830a-84c2-42b6-b980-302eaac6f04c` → **200**

```json
{
  "id": "334b830a-84c2-42b6-b980-302eaac6f04c",
  "state": "PENDING",
  "created_at": "2026-10-28T07:32:56.963623Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/334b830a-84c2-42b6-b980-302eaac6f04c` → **200**

```json
{
  "id": "334b830a-84c2-42b6-b980-302eaac6f04c",
  "state": "PENDING",
  "created_at": "2026-10-28T07:32:56.963623Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/334b830a-84c2-42b6-b980-302eaac6f04c` → **200**

```json
{
  "id": "334b830a-84c2-42b6-b980-302eaac6f04c",
  "state": "PENDING",
  "created_at": "2026-10-28T07:32:56.963623Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/334b830a-84c2-42b6-b980-302eaac6f04c` → **200**

```json
{
  "id": "334b830a-84c2-42b6-b980-302eaac6f04c",
  "state": "PENDING",
  "created_at": "2026-10-28T07:32:56.963623Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/334b830a-84c2-42b6-b980-302eaac6f04c` → **200**

```json
{
  "id": "334b830a-84c2-42b6-b980-302eaac6f04c",
  "state": "PENDING",
  "created_at": "2026-10-28T07:32:56.963623Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/334b830a-84c2-42b6-b980-302eaac6f04c` → **200**

```json
{
  "id": "334b830a-84c2-42b6-b980-302eaac6f04c",
  "state": "PENDING",
  "created_at": "2026-10-28T07:32:56.963623Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/334b830a-84c2-42b6-b980-302eaac6f04c` → **200**

```json
{
  "id": "334b830a-84c2-42b6-b980-302eaac6f04c",
  "state": "READY",
  "created_at": "2026-10-28T07:32:56.963623Z",
  "ready_at": "2026-10-28T07:33:04.137776Z",
  "expires_at": "2026-11-04T07:33:04.137776Z",
  "size_bytes": 985
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/334b830a-84c2-42b6-b980-302eaac6f04c/file` → **200**, sections: ["calls","card_payments","codes_sent","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635258006",
  "device_ref": "sandbox-9935"
}
```

```json
{
  "challenge_id": "6d257fed-6482-4db5-8d4d-86fcff1099fb",
  "expires_at": "2026-10-28T07:38:04.207706855Z",
  "resend_available_at": "2026-10-28T07:33:05.207706855Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635258006` → **200**

```json
{
  "phone": "+380635258006",
  "audience": "CLIENT",
  "code": "614807",
  "sent_at": "2026-10-28T07:33:04.20999296Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6d257fed-6482-4db5-8d4d-86fcff1099fb",
  "code": "614807",
  "device_ref": "sandbox-9935"
}
```

```json
{
  "session_id": "e04d2df5-35d5-4015-855d-fae86234458d",
  "subject": {
    "type": "CLIENT",
    "id": "62768f8f-acc4-4bae-90af-1c73b951ca6a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2Mjc2OGY4Zi1hY2M0LTRiYWUtOTBhZi0xYzczYjk1MWNhNmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNjg0LCJpYXQiOjE3OTMxNzI3ODQsImp0aSI6IjBiNDA2NDE4LTE5OGQtNDQ0NC05OWJhLTM4MzFhYjc0ODU5MSIsInNpZCI6ImUwNGQyZGY1LTM1ZDUtNDAxNS04NTVkLWZhZTg2MjM0NDU4ZCJ9.b3Uenw0ms5jpoPP9dqQ45H38PJV0vvZ3MRVUCIDLiPA",
  "access_expires_at": "2026-10-28T07:48:04.257363613Z",
  "refresh_token": "5NOrsM4yjSFnu5AEWdNBfwaJqcuNv_MHVcRCU2bDq0Y",
  "refresh_expires_at": "2026-11-27T07:33:04.256785255Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/334b830a-84c2-42b6-b980-302eaac6f04c/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/334b830a-84c2-42b6-b980-302eaac6f04c/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "123d793d-1ecf-4edd-ae57-4a02de39cfce"
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
  "session_id": "d788a4de-8bfe-4113-8797-0720e4a6cb3b",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM2ODQsImlhdCI6MTc5MzE3Mjc4NCwianRpIjoiMWUxNTQ5ZjEtN2E5My00NDlmLThiNWUtNDliYzEzYmNmMzY1Iiwic2lkIjoiZDc4OGE0ZGUtOGJmZS00MTEzLTg3OTctMDcyMGU0YTZjYjNiIn0.MEPSFk29ggmo-0Sig5736cCeAq7P21xifYpjvot1jlM",
  "access_expires_at": "2026-10-28T07:48:04.584495803Z",
  "refresh_token": "M_5RbtoAZhtagWrXMxOuSl1AmTfBKe5jJkgmJjGQhJ8",
  "refresh_expires_at": "2026-10-28T19:33:04.583976378Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "eb3084b7-7aff-4169-94f6-7e50680263b6",
  "session_id": "ba5749f9-860c-4562-a8f6-2fdd60bcbba2",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/eb3084b7-7aff-4169-94f6-7e50680263b6/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "334b830a-84c2-42b6-b980-302eaac6f04c",
      "state": "READY",
      "created_at": "2026-10-28T07:32:56.963623Z",
      "ready_at": "2026-10-28T07:33:04.137776Z",
      "expires_at": "2026-11-04T07:33:04.137776Z",
      "size_bytes": 985
    }
  ]
}
```

Done: the copy was asked for with a code, built in the background and downloaded by the rider only.

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
  "device_ref": "sandbox-22450"
}
```

```json
{
  "challenge_id": "fc42721e-cb67-40aa-a1ed-dcc0e5ebb901",
  "expires_at": "2026-10-28T07:38:04.689391929Z",
  "resend_available_at": "2026-10-28T07:33:05.689391929Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "078661",
  "sent_at": "2026-10-28T07:33:04.691745254Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fc42721e-cb67-40aa-a1ed-dcc0e5ebb901",
  "code": "078661",
  "device_ref": "sandbox-22450"
}
```

```json
{
  "session_id": "7163c77b-2606-450a-b541-533b18225e1d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzY4NCwiaWF0IjoxNzkzMTcyNzg0LCJqdGkiOiI5MTY1NDRlOS02MTEzLTQ1OTEtOTIyMS03NjM1OGRiYmYxZTQiLCJzaWQiOiI3MTYzYzc3Yi0yNjA2LTQ1MGEtYjU0MS01MzNiMTgyMjVlMWQifQ.fEhfnpmkqKuGzuWM_riF3ZeTxjnuuXWeKrHG-JGzXko",
  "access_expires_at": "2026-10-28T07:48:04.738801961Z",
  "refresh_token": "N6eF5-13Xb6hT6dCUOeDSJju8Q09krQs-oGe2gK8qCw",
  "refresh_expires_at": "2026-11-27T07:33:04.738203417Z",
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
  "command_id": "315dd816-c81d-44f6-ac2e-f785cd52eed7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:33:04Z",
    "sequence": 1793172784781
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d06d716f-aab3-48c4-90d1-a8a9d1888bd6",
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
  "last_heartbeat_at": "2026-10-28T07:33:04.796692Z",
  "last_location_at": "2026-10-28T07:33:04.796692Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675954051",
  "device_ref": "sandbox-3010"
}
```

```json
{
  "challenge_id": "33b662f3-aa00-461a-8519-2cb61bca43fd",
  "expires_at": "2026-10-28T07:38:04.827532475Z",
  "resend_available_at": "2026-10-28T07:33:05.827532475Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675954051` → **200**

```json
{
  "phone": "+380675954051",
  "audience": "CLIENT",
  "code": "066686",
  "sent_at": "2026-10-28T07:33:04.830361503Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "33b662f3-aa00-461a-8519-2cb61bca43fd",
  "code": "066686",
  "device_ref": "sandbox-3010"
}
```

```json
{
  "session_id": "96a3372d-4fad-41bb-b9aa-08f790c5eb29",
  "subject": {
    "type": "CLIENT",
    "id": "df33728f-f276-4c47-ab75-f865d1ee07eb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZjMzNzI4Zi1mMjc2LTRjNDctYWI3NS1mODY1ZDFlZTA3ZWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNjg0LCJpYXQiOjE3OTMxNzI3ODQsImp0aSI6ImE1Yjk4ZGE5LWQwNDctNDgwOS05MzQ2LThlMjY3ZGFiOGQ3MSIsInNpZCI6Ijk2YTMzNzJkLTRmYWQtNDFiYi1iOWFhLTA4Zjc5MGM1ZWIyOSJ9.bSy50YqRshx6dNp0Ytw1t-3LEVdUPYWeiDn3NAAVu7s",
  "access_expires_at": "2026-10-28T07:48:04.884324341Z",
  "refresh_token": "ydvLeQP4qMNDoHVHrESjcyae-FwI93BMHLZRMcAWZyM",
  "refresh_expires_at": "2026-11-27T07:33:04.883808082Z",
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
  "command_id": "7a174136-c71d-4dba-9f17-10f65e7b5264",
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
  "id": "d5350bcc-878b-4078-986a-c2a2b07763da",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:38:04.939398Z",
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
  "command_id": "1a0a3f42-4798-46b8-909f-fb48c4df5627",
  "platform": "ANDROID",
  "token": "sandbox-driver-d32b2a37-1847-4f84-9b1f-19b6f713b771"
}
```

```json
{
  "id": "502acf64-aff2-42b3-b28a-0acd8345c506",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T07:33:04.979472Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "592caf04-bb54-4f2b-893e-c18ef18d5053",
  "platform": "ANDROID",
  "token": "sandbox-rider-e9fd150a-7358-44ce-8da6-2543da55775f"
}
```

```json
{
  "id": "c2f6ff7b-a4a4-4548-8ec4-4ee0402f20bc",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T07:33:05.011923Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ffe21a80-8dda-4a1c-b5eb-376caf81e529",
  "quote_id": "d5350bcc-878b-4078-986a-c2a2b07763da",
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
  "id": "048cf675-c958-442b-9895-a0eddddc9db0",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "df33728f-f276-4c47-ab75-f865d1ee07eb",
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
  "created_at": "2026-10-28T07:33:05.052233Z",
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
    "id": "e3cdea86-fbcf-4d5e-b6f6-04b80d39a390",
    "order_id": "048cf675-c958-442b-9895-a0eddddc9db0",
    "expires_at": "2026-10-28T07:33:20.055923Z",
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

`POST /api/driver/v1/offers/e3cdea86-fbcf-4d5e-b6f6-04b80d39a390/accept` → **200**

```json
{
  "command_id": "ef0cf6c9-a74e-440b-8b8d-8378682c1cce"
}
```

```json
{
  "id": "c67bb148-55b7-4e20-b164-b80a5182714b",
  "order_id": "048cf675-c958-442b-9895-a0eddddc9db0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "515147a7-494b-4c3a-a96b-96d9ea39346f",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T07:33:05.308Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T07:33:05.308Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T07:33:05.308Z` → **200**

```json
[
  {
    "at": "2026-10-28T07:33:06.292154788Z",
    "token_suffix": "13b771",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "event_id": "2b6f32ad-991b-4c64-9565-3d9ff90ba078",
      "order_version": "2",
      "order_id": "048cf675-c958-442b-9895-a0eddddc9db0",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380675954051&after=2026-10-28T07:33:05.308Z` → **200**

```json
[
  {
    "at": "2026-10-28T07:33:06.293976278Z",
    "token_suffix": "55775f",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "event_id": "475ea8b0-cd8a-472c-a87f-1935f76d9a6a",
      "order_version": "3",
      "order_id": "048cf675-c958-442b-9895-a0eddddc9db0",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/048cf675-c958-442b-9895-a0eddddc9db0/messages` → **201**

```json
{
  "command_id": "0b9e3cfc-7981-4ea0-ad6e-afac2bedf062",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "f575fd40-53c6-4e06-a36b-affb4ad5c5a5",
  "order_id": "048cf675-c958-442b-9895-a0eddddc9db0",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T07:33:07.247273735Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "515147a7-494b-4c3a-a96b-96d9ea39346f",
  "order_id": "048cf675-c958-442b-9895-a0eddddc9db0",
  "assignment_id": "c67bb148-55b7-4e20-b164-b80a5182714b",
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

`POST /api/driver/v1/trips/515147a7-494b-4c3a-a96b-96d9ea39346f/messages` → **201**

```json
{
  "command_id": "cfc201cf-1468-410c-ab6c-db4c40bcf4db",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "1d0f0cc1-c337-40da-86d2-76214a68663c",
  "order_id": "048cf675-c958-442b-9895-a0eddddc9db0",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T07:33:07.293426345Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/048cf675-c958-442b-9895-a0eddddc9db0/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/515147a7-494b-4c3a-a96b-96d9ea39346f/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380675954051"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/d06d716f-aab3-48c4-90d1-a8a9d1888bd6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:33:07Z",
    "sequence": 1793172787356
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d06d716f-aab3-48c4-90d1-a8a9d1888bd6",
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
  "last_heartbeat_at": "2026-10-28T07:33:07.372868Z",
  "last_location_at": "2026-10-28T07:33:07.372868Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "515147a7-494b-4c3a-a96b-96d9ea39346f",
  "order_id": "048cf675-c958-442b-9895-a0eddddc9db0",
  "assignment_id": "c67bb148-55b7-4e20-b164-b80a5182714b",
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

`POST /api/driver/v1/trips/515147a7-494b-4c3a-a96b-96d9ea39346f/arrive` → **200**

```json
{
  "command_id": "a226c116-6ed8-4bf4-82e4-8cefd7dddb10",
  "expected_version": 0
}
```

```json
{
  "id": "515147a7-494b-4c3a-a96b-96d9ea39346f",
  "order_id": "048cf675-c958-442b-9895-a0eddddc9db0",
  "assignment_id": "c67bb148-55b7-4e20-b164-b80a5182714b",
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
  "arrived_at": "2026-10-28T07:33:07.417076Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/515147a7-494b-4c3a-a96b-96d9ea39346f/start` → **200**

```json
{
  "command_id": "157ada6b-cc93-4f4e-a237-fdae0358a2cc",
  "expected_version": 1
}
```

```json
{
  "id": "515147a7-494b-4c3a-a96b-96d9ea39346f",
  "order_id": "048cf675-c958-442b-9895-a0eddddc9db0",
  "assignment_id": "c67bb148-55b7-4e20-b164-b80a5182714b",
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
  "arrived_at": "2026-10-28T07:33:07.417076Z",
  "started_at": "2026-10-28T07:33:07.4466Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/d06d716f-aab3-48c4-90d1-a8a9d1888bd6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:33:07Z",
    "sequence": 1793172787466
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d06d716f-aab3-48c4-90d1-a8a9d1888bd6",
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
  "last_heartbeat_at": "2026-10-28T07:33:07.482356Z",
  "last_location_at": "2026-10-28T07:33:07.482356Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/515147a7-494b-4c3a-a96b-96d9ea39346f/complete` → **200**

```json
{
  "command_id": "ea6f6709-58af-4efd-8d2a-965998312151",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:33:07Z",
  "cash_received": true
}
```

```json
{
  "id": "515147a7-494b-4c3a-a96b-96d9ea39346f",
  "order_id": "048cf675-c958-442b-9895-a0eddddc9db0",
  "assignment_id": "c67bb148-55b7-4e20-b164-b80a5182714b",
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
  "arrived_at": "2026-10-28T07:33:07.417076Z",
  "started_at": "2026-10-28T07:33:07.4466Z",
  "completed_at": "2026-10-28T07:33:07.514036Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/048cf675-c958-442b-9895-a0eddddc9db0` → **200**

```json
{
  "id": "048cf675-c958-442b-9895-a0eddddc9db0",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "df33728f-f276-4c47-ab75-f865d1ee07eb",
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
    "id": "c67bb148-55b7-4e20-b164-b80a5182714b",
    "order_id": "048cf675-c958-442b-9895-a0eddddc9db0",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "515147a7-494b-4c3a-a96b-96d9ea39346f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:33:05.052233Z",
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
    "id": "048cf675-c958-442b-9895-a0eddddc9db0",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-28T07:33:05.052233Z",
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
    "id": "515147a7-494b-4c3a-a96b-96d9ea39346f",
    "order_id": "048cf675-c958-442b-9895-a0eddddc9db0",
    "order_short_number": 5,
    "created_at": "2026-10-28T07:33:05.115481Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "999820b2-3fbd-4696-a532-bc31f1cb4c88",
    "order_id": "8b6a67cd-f292-4041-9a27-1c04fd8da155",
    "order_short_number": 1,
    "created_at": "2026-10-28T07:32:28.532976Z",
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

`GET /api/rider/v1/orders/048cf675-c958-442b-9895-a0eddddc9db0/tip` → **200**

```json
{
  "order_id": "048cf675-c958-442b-9895-a0eddddc9db0",
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
  "available_until": "2026-10-29T07:33:07.514036Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/048cf675-c958-442b-9895-a0eddddc9db0/tip` → **201**

```json
{
  "command_id": "98b6f4ef-830e-4cd2-803b-dd223b7530d3",
  "amount_minor": 1100
}
```

```json
{
  "id": "4fff1a64-4a7a-472e-a1da-70d27f531984",
  "order_id": "048cf675-c958-442b-9895-a0eddddc9db0",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T07:33:10.701164Z"
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
  "session_id": "35d14ab8-7d77-4470-8229-4b964735247b",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM2OTEsImlhdCI6MTc5MzE3Mjc5MSwianRpIjoiNTMwYzYxNmYtMThmNy00ZGU1LTllNDQtMThiYTNjNzhiMzM4Iiwic2lkIjoiMzVkMTRhYjgtN2Q3Ny00NDcwLTgyMjktNGI5NjQ3MzUyNDdiIn0.4y8b4NyBNy8N0102i31thhXodBP5NzmIeQXjbtKT5lQ",
  "access_expires_at": "2026-10-28T07:48:11.012976512Z",
  "refresh_token": "duaB8zZhvk7gkcPwcePAgQh629KCijE1QIcV5Pzf874",
  "refresh_expires_at": "2026-10-28T19:33:11.012399097Z",
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
          "RIDER": 1,
          "DRIVER": 1
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
      "RIDER": 1,
      "DRIVER": 1
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
  ],
  "generated_at": "2026-10-28T07:33:11.040500733Z"
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
  "generated_at": "2026-10-28T07:33:11.068737281Z"
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
  "session_id": "01059aad-8510-4822-b38f-35b06d22ea34",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM2OTEsImlhdCI6MTc5MzE3Mjc5MSwianRpIjoiYjY5MTVmY2UtMWRkZi00YzU4LTgyODktNTcwMjZjODAwMzRkIiwic2lkIjoiMDEwNTlhYWQtODUxMC00ODIyLWIzOGYtMzViMDZkMjJlYTM0In0.wYki10XJtDReSoBfg4E02D7PygJrciaFuO3Q29ABTo0",
  "access_expires_at": "2026-10-28T07:48:11.378003048Z",
  "refresh_token": "aU1zlp0vkfEt4HDQAmgiLYyTeDz9-5Zlb8nKca4HfKg",
  "refresh_expires_at": "2026-10-28T19:33:11.377282006Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/048cf675-c958-442b-9895-a0eddddc9db0/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T07:33:05.05295Z",
      "actor": {
        "type": "CLIENT",
        "id": "df33728f-f276-4c47-ab75-f865d1ee07eb",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "048cf675-c958-442b-9895-a0eddddc9db0",
        "quote_id": "d5350bcc-878b-4078-986a-c2a2b07763da",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T07:33:05.054741Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "048cf675-c958-442b-9895-a0eddddc9db0",
        "attempt_id": "2affaf1a-1c6f-48ab-8678-9727a9e78b64",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T07:33:05.060945Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e3cdea86-fbcf-4d5e-b6f6-04b80d39a390",
        "order_id": "048cf675-c958-442b-9895-a0eddddc9db0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T07:33:05.117592Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "e3cdea86-fbcf-4d5e-b6f6-04b80d39a390",
        "order_id": "048cf675-c958-442b-9895-a0eddddc9db0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "c67bb148-55b7-4e20-b164-b80a5182714b"
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
  "at": "2026-10-28T07:33:11.42353068Z",
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
      "last_location_at": "2026-10-28T07:33:07.482356Z",
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
      "connection": "DISCONNECTED",
      "geolocation": "STALE",
      "location": {
        "lat": 50.459,
        "lon": 30.5238
      },
      "last_location_at": "2026-10-28T07:32:36.07315Z",
      "order_id": null
    }
  ]
}
```

Done: order 048cf675-c958-442b-9895-a0eddddc9db0.

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
  "session_id": "6c9d75aa-8193-4369-a0c9-e2c84cfcc5ad",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM2OTEsImlhdCI6MTc5MzE3Mjc5MSwianRpIjoiYzg5NGJlNWQtNzkyNS00ZGNjLWEyNjAtYjBjZTQ4YzRjM2NkIiwic2lkIjoiNmM5ZDc1YWEtODE5My00MzY5LWEwYzktZTJjODRjZmNjNWFkIn0.Jik32mF-MjC-HTEwQ-M1V2RCycWQfLBmIGS385hL7RM",
  "access_expires_at": "2026-10-28T07:48:11.744643255Z",
  "refresh_token": "mh12SPoBZU7myzsI8q4hcTK2V5zYHYgurTnSmfwv81c",
  "refresh_expires_at": "2026-10-28T19:33:11.744030937Z",
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
  "command_id": "1d9cea93-a887-47ed-879a-9fe3d3a7a848",
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
  "timestamp": "2026-10-28T07:33:11.000+0000",
  "channel": {
    "id": "1730052000.115421000",
    "linkedid": "1730052000.115421000",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679832880"
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
  "timestamp": "2026-10-28T07:33:11.000+0000",
  "channel": {
    "id": "1730052000.115421000",
    "linkedid": "1730052000.115421000",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679832880"
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
  "session_id": "6ed979b9-1634-4b02-91c6-c6ed3c8c518d",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM2OTIsImlhdCI6MTc5MzE3Mjc5MiwianRpIjoiOGZlYTNlMzEtOGE1NC00OTQ4LTg5OGUtNTM2MmU0NDZjMmQ5Iiwic2lkIjoiNmVkOTc5YjktMTYzNC00YjAyLTkxYzYtYzZlZDNjOGM1MThkIn0.FgpuXku7_GE9btBOjc1P1qbv9jpSAKVvJDQCehedMVU",
  "access_expires_at": "2026-10-28T07:48:12.146737237Z",
  "refresh_token": "rf2Slnf_dJywbbGmKdrHbSeGFfxyVigGrNQR6oSFxP8",
  "refresh_expires_at": "2026-10-28T19:33:12.146162047Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "28bd2e9e-03a0-4bd4-b049-43de951146fa",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679832880",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T07:33:11Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/28bd2e9e-03a0-4bd4-b049-43de951146fa/answer` → **200**

```json
{
  "command_id": "875d3725-529b-4337-b9c4-8a22b22a0266"
}
```

```json
{
  "id": "28bd2e9e-03a0-4bd4-b049-43de951146fa",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679832880",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
  "order_ids": [],
  "started_at": "2026-10-28T07:33:11Z",
  "answered_at": "2026-10-28T07:33:12.205757Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.115421000",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "6b93e926-88dd-4423-bd5a-53420d9710d6",
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
  "id": "60419706-6363-4cb9-99cc-210504410b76",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:38:12.260492Z",
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
  "command_id": "c4abd7bf-b2f9-4251-b941-8910889ed332",
  "quote_id": "60419706-6363-4cb9-99cc-210504410b76",
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
    "phone": "+380679832880"
  },
  "call_id": "28bd2e9e-03a0-4bd4-b049-43de951146fa"
}
```

```json
{
  "id": "18053ae5-4da1-497d-a2c0-7f157dabfc4c",
  "short_number": 6,
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
  "created_at": "2026-10-28T07:33:12.308514Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679832880"
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
    "id": "1730052000.115421000",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "28bd2e9e-03a0-4bd4-b049-43de951146fa",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679832880",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
      "order_ids": [
        "18053ae5-4da1-497d-a2c0-7f157dabfc4c"
      ],
      "started_at": "2026-10-28T07:33:11Z",
      "answered_at": "2026-10-28T07:33:12.205757Z",
      "ended_at": "2026-10-28T07:33:12.354642Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "e9932ffb-c4d0-4733-8e1c-e280db4bb53d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672466179",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
      "order_ids": [],
      "started_at": "2026-10-28T07:32:32.719648Z",
      "answered_at": "2026-10-28T07:32:32.779124Z",
      "ended_at": "2026-10-28T07:32:32.826861Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T07:32:34.138242Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/18053ae5-4da1-497d-a2c0-7f157dabfc4c` → **200**

```json
{
  "id": "18053ae5-4da1-497d-a2c0-7f157dabfc4c",
  "short_number": 6,
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
  "created_at": "2026-10-28T07:33:12.308514Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679832880"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/18053ae5-4da1-497d-a2c0-7f157dabfc4c` → **200**

```json
{
  "id": "18053ae5-4da1-497d-a2c0-7f157dabfc4c",
  "short_number": 6,
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
  "created_at": "2026-10-28T07:33:12.308514Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679832880"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/18053ae5-4da1-497d-a2c0-7f157dabfc4c/cancel` → **200**

```json
{
  "command_id": "e4c154dc-97ce-492e-b69b-a08e0c23948a",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "18053ae5-4da1-497d-a2c0-7f157dabfc4c",
  "short_number": 6,
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
  "created_at": "2026-10-28T07:33:12.308514Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679832880"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 28bd2e9e-03a0-4bd4-b049-43de951146fa with order 18053ae5-4da1-497d-a2c0-7f157dabfc4c.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-22592"
}
```

```json
{
  "challenge_id": "bdc071f9-ca31-457d-aca7-937ba201d1e6",
  "expires_at": "2026-10-28T07:38:12.496126362Z",
  "resend_available_at": "2026-10-28T07:33:13.496126362Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "209096",
  "sent_at": "2026-10-28T07:33:12.498884804Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bdc071f9-ca31-457d-aca7-937ba201d1e6",
  "code": "209096",
  "device_ref": "sandbox-22592"
}
```

```json
{
  "session_id": "15f334ae-62f5-486b-8853-7e463567b16e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzY5MiwiaWF0IjoxNzkzMTcyNzkyLCJqdGkiOiI5NGZiYWYwMi1iODEzLTQwZWEtYTg5Ny0xNWM1YjhkNGY0OGQiLCJzaWQiOiIxNWYzMzRhZS02MmY1LTQ4NmItODg1My03ZTQ2MzU2N2IxNmUifQ.m1nNHjXXy-FONmW3N6Yp9cXfzJUJSVFDog5jHHYxpSM",
  "access_expires_at": "2026-10-28T07:48:12.548081858Z",
  "refresh_token": "100THzAaAhW3_kBej2WmCUh3PxXa-wDH2cTkuRZvMJo",
  "refresh_expires_at": "2026-11-27T07:33:12.54751004Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d06d716f-aab3-48c4-90d1-a8a9d1888bd6",
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
  "last_heartbeat_at": "2026-10-28T07:33:07.482356Z",
  "last_location_at": "2026-10-28T07:33:07.482356Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d06d716f-aab3-48c4-90d1-a8a9d1888bd6/handover` → **200**

```json
{
  "command_id": "cfe37822-7dbb-478c-8423-762a30d57c8b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d06d716f-aab3-48c4-90d1-a8a9d1888bd6",
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
  "last_heartbeat_at": "2026-10-28T07:33:07.482356Z",
  "last_location_at": "2026-10-28T07:33:07.482356Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d06d716f-aab3-48c4-90d1-a8a9d1888bd6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:33:12Z",
    "sequence": 1793172792621
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d06d716f-aab3-48c4-90d1-a8a9d1888bd6",
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
  "last_heartbeat_at": "2026-10-28T07:33:12.642865Z",
  "last_location_at": "2026-10-28T07:33:12.642865Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665434593",
  "device_ref": "sandbox-5787"
}
```

```json
{
  "challenge_id": "5c066e1b-9177-4792-923b-396464c2b7db",
  "expires_at": "2026-10-28T07:38:12.665243029Z",
  "resend_available_at": "2026-10-28T07:33:13.665243029Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665434593` → **200**

```json
{
  "phone": "+380665434593",
  "audience": "CLIENT",
  "code": "163012",
  "sent_at": "2026-10-28T07:33:12.667645363Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5c066e1b-9177-4792-923b-396464c2b7db",
  "code": "163012",
  "device_ref": "sandbox-5787"
}
```

```json
{
  "session_id": "25f470c6-813d-4844-809b-2755aa9c411c",
  "subject": {
    "type": "CLIENT",
    "id": "6ed1fe15-3dbf-4edd-9661-bd62e7eb2c33"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWQxZmUxNS0zZGJmLTRlZGQtOTY2MS1iZDYyZTdlYjJjMzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNjkyLCJpYXQiOjE3OTMxNzI3OTIsImp0aSI6IjBkY2Q4Mzk0LTUzMWItNDEyNC1iMWU3LWMxNTUwYmRhZTQ3NSIsInNpZCI6IjI1ZjQ3MGM2LTgxM2QtNDg0NC04MDliLTI3NTVhYTljNDExYyJ9.zdzh_UcsATCKzRkA4Ip0A9Dxax9-qTT9AaJ3biIY0mQ",
  "access_expires_at": "2026-10-28T07:48:12.716511748Z",
  "refresh_token": "H9ICso5CdSAaC_-ECrqzwq_b191uKh2nP8qouWRmPB8",
  "refresh_expires_at": "2026-11-27T07:33:12.71596191Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e7a3fca9-5c5e-4969-b8e1-26808a628654",
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
  "id": "b34b2d44-5172-4b7a-875e-5d44f54b882e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-28T07:38:12.745246Z",
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
  "command_id": "badc040b-21c3-403f-b59b-e9252e8a6867",
  "quote_id": "b34b2d44-5172-4b7a-875e-5d44f54b882e",
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
  "id": "45069453-e7e6-412a-8a34-8b886cf7bceb",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6ed1fe15-3dbf-4edd-9661-bd62e7eb2c33",
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
  "created_at": "2026-10-28T07:33:12.777528Z",
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
    "id": "dafa464b-4305-4dd6-8ade-baeb9583f07c",
    "order_id": "45069453-e7e6-412a-8a34-8b886cf7bceb",
    "expires_at": "2026-10-28T07:33:27.781056Z",
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

`POST /api/driver/v1/offers/dafa464b-4305-4dd6-8ade-baeb9583f07c/accept` → **200**

```json
{
  "command_id": "7bfeaec8-f00d-4d9e-a850-28cb0d87f60b"
}
```

```json
{
  "id": "31cd4407-c4d2-42da-9aa3-b8965caf6cb3",
  "order_id": "45069453-e7e6-412a-8a34-8b886cf7bceb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ab790795-e3e8-46ac-b055-f94bb00a4ebb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ab790795-e3e8-46ac-b055-f94bb00a4ebb",
  "order_id": "45069453-e7e6-412a-8a34-8b886cf7bceb",
  "assignment_id": "31cd4407-c4d2-42da-9aa3-b8965caf6cb3",
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

`POST /api/driver/v1/work-sessions/d06d716f-aab3-48c4-90d1-a8a9d1888bd6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:33:12Z",
    "sequence": 1793172792873
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d06d716f-aab3-48c4-90d1-a8a9d1888bd6",
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
  "last_heartbeat_at": "2026-10-28T07:33:12.889036Z",
  "last_location_at": "2026-10-28T07:33:12.889036Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ab790795-e3e8-46ac-b055-f94bb00a4ebb/arrive` → **200**

```json
{
  "command_id": "6b8a15e3-c8c7-4dc9-a09f-6686a5145dba",
  "expected_version": 0
}
```

```json
{
  "id": "ab790795-e3e8-46ac-b055-f94bb00a4ebb",
  "order_id": "45069453-e7e6-412a-8a34-8b886cf7bceb",
  "assignment_id": "31cd4407-c4d2-42da-9aa3-b8965caf6cb3",
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
  "arrived_at": "2026-10-28T07:33:12.920761Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ab790795-e3e8-46ac-b055-f94bb00a4ebb/start` → **200**

```json
{
  "command_id": "c7b32fc9-21c0-4031-a6f7-c60a28e47844",
  "expected_version": 1
}
```

```json
{
  "id": "ab790795-e3e8-46ac-b055-f94bb00a4ebb",
  "order_id": "45069453-e7e6-412a-8a34-8b886cf7bceb",
  "assignment_id": "31cd4407-c4d2-42da-9aa3-b8965caf6cb3",
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
  "arrived_at": "2026-10-28T07:33:12.920761Z",
  "started_at": "2026-10-28T07:33:12.95414Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/d06d716f-aab3-48c4-90d1-a8a9d1888bd6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:33:12Z",
    "sequence": 1793172792975
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d06d716f-aab3-48c4-90d1-a8a9d1888bd6",
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
  "last_heartbeat_at": "2026-10-28T07:33:12.991069Z",
  "last_location_at": "2026-10-28T07:33:12.991069Z",
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
  "device_ref": "sandbox-28580"
}
```

```json
{
  "challenge_id": "f6153389-59bc-4bc8-b432-0cd81fa25f3d",
  "expires_at": "2026-10-28T07:38:13.011703659Z",
  "resend_available_at": "2026-10-28T07:33:14.011703659Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "010817",
  "sent_at": "2026-10-28T07:33:13.013715676Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f6153389-59bc-4bc8-b432-0cd81fa25f3d",
  "code": "010817",
  "device_ref": "sandbox-28580"
}
```

```json
{
  "session_id": "9080c791-75cc-4c5b-98f0-c30d9cbd389b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzY5MywiaWF0IjoxNzkzMTcyNzkzLCJqdGkiOiJjNWI1YjVhZi03NTAzLTRjNGQtODhiOC0wZDNhNDNiN2ViOTciLCJzaWQiOiI5MDgwYzc5MS03NWNjLTRjNWItOThmMC1jMzBkOWNiZDM4OWIifQ.3a8CRzz6uovIKBmwjl03mS7Vv8ylM3XahlPsQpWehRs",
  "access_expires_at": "2026-10-28T07:48:13.06072599Z",
  "refresh_token": "42lm1I5cRDkfFhuWz7EKOQrNv8D1lGLa_VFlxJRNcZc",
  "refresh_expires_at": "2026-11-27T07:33:13.06010875Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "15d8258a-00a4-43fa-938a-460cbdf7773f",
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
  "last_heartbeat_at": "2026-10-28T07:32:36.07315Z",
  "last_location_at": "2026-10-28T07:32:36.07315Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/15d8258a-00a4-43fa-938a-460cbdf7773f/handover` → **200**

```json
{
  "command_id": "0618df9e-aa59-488f-84a8-73d20f6ebc89",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "15d8258a-00a4-43fa-938a-460cbdf7773f",
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
  "last_heartbeat_at": "2026-10-28T07:32:36.07315Z",
  "last_location_at": "2026-10-28T07:32:36.07315Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/15d8258a-00a4-43fa-938a-460cbdf7773f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:33:13Z",
    "sequence": 1793172793136
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "15d8258a-00a4-43fa-938a-460cbdf7773f",
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
  "last_heartbeat_at": "2026-10-28T07:33:13.152375Z",
  "last_location_at": "2026-10-28T07:33:13.152375Z",
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
  "session_id": "d7ba2e58-5fb6-4b0f-bef3-2dc31adb76d4",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM2OTMsImlhdCI6MTc5MzE3Mjc5MywianRpIjoiZjAzMWVmNjItY2IxYy00N2Q4LTgxYWItOWUwNDJmNjU1OTczIiwic2lkIjoiZDdiYTJlNTgtNWZiNi00YjBmLWJlZjMtMmRjMzFhZGI3NmQ0In0.tNV8XflWoxKbj6iZqCzQ31L46StVEDIsKqGWVKxQark",
  "access_expires_at": "2026-10-28T07:48:13.459301846Z",
  "refresh_token": "PYszM6Zaz0LO7Ck20vyTyaTTke6JLFPH-Sb1hY9I2rM",
  "refresh_expires_at": "2026-10-28T19:33:13.458602451Z",
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
  "session_id": "941b46aa-0bff-4bf2-9010-5cd7ad601fd0",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM2OTMsImlhdCI6MTc5MzE3Mjc5MywianRpIjoiM2YyZThlNDYtNDQyZS00ZWM0LWEwYjMtMTk1YzM3N2NlZDVhIiwic2lkIjoiOTQxYjQ2YWEtMGJmZi00YmYyLTkwMTAtNWNkN2FkNjAxZmQwIn0.kGkgyrzmoBqCOerAYWxFeHNN2r0Nw0p_F5VzY8Vljbw",
  "access_expires_at": "2026-10-28T07:48:13.768668761Z",
  "refresh_token": "VENBJ8XewutJvqgRXH1TYwbvXerK1A7nhbTSPgM5FHc",
  "refresh_expires_at": "2026-10-28T19:33:13.768186576Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/45069453-e7e6-412a-8a34-8b886cf7bceb` → **200**

```json
{
  "id": "45069453-e7e6-412a-8a34-8b886cf7bceb",
  "short_number": 7,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "6ed1fe15-3dbf-4edd-9661-bd62e7eb2c33",
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
    "id": "31cd4407-c4d2-42da-9aa3-b8965caf6cb3",
    "order_id": "45069453-e7e6-412a-8a34-8b886cf7bceb",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "ab790795-e3e8-46ac-b055-f94bb00a4ebb",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T07:33:12.777528Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/45069453-e7e6-412a-8a34-8b886cf7bceb/interrupt` → **200**

```json
{
  "command_id": "ec876d40-af6e-4282-8c1b-da52f2c96acc",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "45069453-e7e6-412a-8a34-8b886cf7bceb",
    "short_number": 7,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "6ed1fe15-3dbf-4edd-9661-bd62e7eb2c33",
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
      "id": "31cd4407-c4d2-42da-9aa3-b8965caf6cb3",
      "order_id": "45069453-e7e6-412a-8a34-8b886cf7bceb",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "ab790795-e3e8-46ac-b055-f94bb00a4ebb",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T07:33:12.777528Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "30c3719f-1755-4281-af35-2ce291def3d4",
    "short_number": 8,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "6ed1fe15-3dbf-4edd-9661-bd62e7eb2c33",
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
    "id": "994e2cd9-2726-44dd-a93c-34c52bc6be6f",
    "order_id": "30c3719f-1755-4281-af35-2ce291def3d4",
    "expires_at": "2026-10-28T07:33:28.838072Z",
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

`POST /api/driver/v1/offers/994e2cd9-2726-44dd-a93c-34c52bc6be6f/accept` → **200**

```json
{
  "command_id": "b5c9d475-380f-40a0-9b26-214048d2376a"
}
```

```json
{
  "id": "89864903-7425-4526-8d3a-eee35f526220",
  "order_id": "30c3719f-1755-4281-af35-2ce291def3d4",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cac545e1-326c-41ba-9300-35ea814dfd6a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cac545e1-326c-41ba-9300-35ea814dfd6a",
  "order_id": "30c3719f-1755-4281-af35-2ce291def3d4",
  "assignment_id": "89864903-7425-4526-8d3a-eee35f526220",
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
  "session_id": "15d8258a-00a4-43fa-938a-460cbdf7773f",
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
  "last_heartbeat_at": "2026-10-28T07:33:13.152375Z",
  "last_location_at": "2026-10-28T07:33:13.152375Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/15d8258a-00a4-43fa-938a-460cbdf7773f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:33:13Z",
    "sequence": 1793172793949
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "15d8258a-00a4-43fa-938a-460cbdf7773f",
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
  "last_heartbeat_at": "2026-10-28T07:33:13.965976Z",
  "last_location_at": "2026-10-28T07:33:13.965976Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/cac545e1-326c-41ba-9300-35ea814dfd6a/arrive` → **200**

```json
{
  "command_id": "8c45c328-cbef-4c89-8892-e32f7efd17f8",
  "expected_version": 0
}
```

```json
{
  "id": "cac545e1-326c-41ba-9300-35ea814dfd6a",
  "order_id": "30c3719f-1755-4281-af35-2ce291def3d4",
  "assignment_id": "89864903-7425-4526-8d3a-eee35f526220",
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
  "arrived_at": "2026-10-28T07:33:13.998094Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cac545e1-326c-41ba-9300-35ea814dfd6a/start` → **200**

```json
{
  "command_id": "aacfe016-9529-41a8-826d-b250660fd283",
  "expected_version": 1
}
```

```json
{
  "id": "cac545e1-326c-41ba-9300-35ea814dfd6a",
  "order_id": "30c3719f-1755-4281-af35-2ce291def3d4",
  "assignment_id": "89864903-7425-4526-8d3a-eee35f526220",
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
  "arrived_at": "2026-10-28T07:33:13.998094Z",
  "started_at": "2026-10-28T07:33:14.032118Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cac545e1-326c-41ba-9300-35ea814dfd6a/complete` → **200**

```json
{
  "command_id": "0ab52973-c6b8-4716-a2d3-981f55b75ecf",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:33:14Z"
}
```

```json
{
  "id": "cac545e1-326c-41ba-9300-35ea814dfd6a",
  "order_id": "30c3719f-1755-4281-af35-2ce291def3d4",
  "assignment_id": "89864903-7425-4526-8d3a-eee35f526220",
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
  "arrived_at": "2026-10-28T07:33:13.998094Z",
  "started_at": "2026-10-28T07:33:14.032118Z",
  "completed_at": "2026-10-28T07:33:14.068457Z",
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
    "id": "30c3719f-1755-4281-af35-2ce291def3d4",
    "short_number": 8,
    "status": "FULFILLED",
    "created_at": "2026-10-28T07:33:13.828285Z",
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
    "id": "45069453-e7e6-412a-8a34-8b886cf7bceb",
    "short_number": 7,
    "status": "CANCELLED",
    "created_at": "2026-10-28T07:33:12.777528Z",
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
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way"
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

`GET /api/operator/v1/orders/45069453-e7e6-412a-8a34-8b886cf7bceb/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T07:33:12.778054Z",
      "actor": {
        "type": "CLIENT",
        "id": "6ed1fe15-3dbf-4edd-9661-bd62e7eb2c33",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "45069453-e7e6-412a-8a34-8b886cf7bceb",
        "quote_id": "b34b2d44-5172-4b7a-875e-5d44f54b882e",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T07:33:12.779994Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "45069453-e7e6-412a-8a34-8b886cf7bceb",
        "attempt_id": "3a3201a3-f93f-41de-9cb7-884818d05e73",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T07:33:12.786065Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "dafa464b-4305-4dd6-8ade-baeb9583f07c",
        "order_id": "45069453-e7e6-412a-8a34-8b886cf7bceb",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T07:33:12.837078Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "dafa464b-4305-4dd6-8ade-baeb9583f07c",
        "order_id": "45069453-e7e6-412a-8a34-8b886cf7bceb",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "31cd4407-c4d2-42da-9aa3-b8965caf6cb3"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted 45069453-e7e6-412a-8a34-8b886cf7bceb, follow-up 30c3719f-1755-4281-af35-2ce291def3d4.

# Scenario: multiple-orders

## A driver goes online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-19611"
}
```

```json
{
  "challenge_id": "10b5f0f7-3293-4906-b142-56efab1a918a",
  "expires_at": "2026-10-28T07:38:17.183894441Z",
  "resend_available_at": "2026-10-28T07:33:18.183894441Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "383031",
  "sent_at": "2026-10-28T07:33:17.185887701Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "10b5f0f7-3293-4906-b142-56efab1a918a",
  "code": "383031",
  "device_ref": "sandbox-19611"
}
```

```json
{
  "session_id": "33ff4ee8-15ac-4e19-bccc-9140efb55807",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzY5NywiaWF0IjoxNzkzMTcyNzk3LCJqdGkiOiIxMzFkYjdkYi0zNzA0LTQ4ZDAtOWQxOC03YmM0MDFmMDQ0Y2YiLCJzaWQiOiIzM2ZmNGVlOC0xNWFjLTRlMTktYmNjYy05MTQwZWZiNTU4MDcifQ.cHlIEOb4DEsD7qEtzCkBxT4OCfl-CiMpO_qgdOMLZH0",
  "access_expires_at": "2026-10-28T07:48:17.232830861Z",
  "refresh_token": "HjlFDpTAEuIAtm1Z0O6IDrpElLKp41abXq1KceoDSCo",
  "refresh_expires_at": "2026-11-27T07:33:17.232279133Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "15d8258a-00a4-43fa-938a-460cbdf7773f",
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
  "last_heartbeat_at": "2026-10-28T07:33:13.965976Z",
  "last_location_at": "2026-10-28T07:33:13.965976Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/15d8258a-00a4-43fa-938a-460cbdf7773f/handover` → **200**

```json
{
  "command_id": "aad17554-7996-4bed-b278-b9b547f22107",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "15d8258a-00a4-43fa-938a-460cbdf7773f",
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
  "last_heartbeat_at": "2026-10-28T07:33:13.965976Z",
  "last_location_at": "2026-10-28T07:33:13.965976Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/15d8258a-00a4-43fa-938a-460cbdf7773f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:33:17Z",
    "sequence": 1793172797304
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "15d8258a-00a4-43fa-938a-460cbdf7773f",
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
  "last_heartbeat_at": "2026-10-28T07:33:17.319963Z",
  "last_location_at": "2026-10-28T07:33:17.319963Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672321428",
  "device_ref": "sandbox-147"
}
```

```json
{
  "challenge_id": "91880961-af76-46ff-92dc-5d85d1155e44",
  "expires_at": "2026-10-28T07:38:17.343851989Z",
  "resend_available_at": "2026-10-28T07:33:18.343851989Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672321428` → **200**

```json
{
  "phone": "+380672321428",
  "audience": "CLIENT",
  "code": "813020",
  "sent_at": "2026-10-28T07:33:17.346024287Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "91880961-af76-46ff-92dc-5d85d1155e44",
  "code": "813020",
  "device_ref": "sandbox-147"
}
```

```json
{
  "session_id": "55822897-c12b-4c01-bebe-d42efd1fa4af",
  "subject": {
    "type": "CLIENT",
    "id": "b7ef224d-8d5f-4823-b171-ef3ad63cd762"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiN2VmMjI0ZC04ZDVmLTQ4MjMtYjE3MS1lZjNhZDYzY2Q3NjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNjk3LCJpYXQiOjE3OTMxNzI3OTcsImp0aSI6IjM4MTk5OGRmLWQ1YmYtNDkyZC1iZjlhLWI5ZjgyZTkzMWQwNyIsInNpZCI6IjU1ODIyODk3LWMxMmItNGMwMS1iZWJlLWQ0MmVmZDFmYTRhZiJ9.2ICSwtFlqjsfxQ5pEiJKQoh-szwctZW00QvYiKCEkaw",
  "access_expires_at": "2026-10-28T07:48:17.392051901Z",
  "refresh_token": "e0-yK2WawQrMcQe_uScleP6sr36nvksRwmjjbxSr_ao",
  "refresh_expires_at": "2026-11-27T07:33:17.391411453Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "412df813-623a-4dcd-9344-72fe56d298ff",
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
  "id": "3a5043a2-7590-449e-9a90-254d6015c01b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:38:17.423070Z",
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
  "command_id": "63434cc9-4d4d-4543-9133-71a77412338b",
  "quote_id": "3a5043a2-7590-449e-9a90-254d6015c01b",
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
    "phone": "+380670517821"
  }
}
```

```json
{
  "id": "09da4052-f4d4-4680-9b4e-90fd81675145",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b7ef224d-8d5f-4823-b171-ef3ad63cd762",
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
  "created_at": "2026-10-28T07:33:17.456594Z",
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
    "id": "50eff364-d258-4228-8006-33e57d32f18a",
    "order_id": "09da4052-f4d4-4680-9b4e-90fd81675145",
    "expires_at": "2026-10-28T07:33:32.459508Z",
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

`POST /api/driver/v1/offers/50eff364-d258-4228-8006-33e57d32f18a/accept` → **200**

```json
{
  "command_id": "544902ad-0857-4212-b84d-444962559f84"
}
```

```json
{
  "id": "38f01539-7aa0-459e-a561-1e43c0485be0",
  "order_id": "09da4052-f4d4-4680-9b4e-90fd81675145",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e16394b8-545f-4ccd-9710-1bfe385bf901",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e16394b8-545f-4ccd-9710-1bfe385bf901",
  "order_id": "09da4052-f4d4-4680-9b4e-90fd81675145",
  "assignment_id": "38f01539-7aa0-459e-a561-1e43c0485be0",
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
    "phone": "+380670517821"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "687790f3-7634-4bee-8751-aef3804d9077",
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
  "id": "6ce93aec-6508-48eb-8438-9f985ade490d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:38:17.572870Z",
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
  "command_id": "e89dccde-3fa5-4efe-93e6-5519ab961488",
  "quote_id": "6ce93aec-6508-48eb-8438-9f985ade490d",
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
  "id": "11603dbc-fd81-4a3f-b3f4-65c7800578cb",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b7ef224d-8d5f-4823-b171-ef3ad63cd762",
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
  "created_at": "2026-10-28T07:33:17.604803Z",
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
  "command_id": "48c0779e-874f-4dd6-a212-a8a20ef6875d",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T10:33:17Z"
}
```

```json
{
  "id": "41097c17-b2a1-49d0-932f-7194b5e57de6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:38:17.643176Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T10:33:17Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "79714264-02d7-45d9-9fe3-0a2c4ace16ed",
  "quote_id": "41097c17-b2a1-49d0-932f-7194b5e57de6",
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
  "pickup_at": "2026-10-28T10:33:17Z"
}
```

```json
{
  "id": "6283da1a-846b-426a-b549-0246a36688c4",
  "short_number": 11,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b7ef224d-8d5f-4823-b171-ef3ad63cd762",
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
  "created_at": "2026-10-28T07:33:17.677952Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T10:33:17Z",
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
  "command_id": "687e749f-86de-4440-8ece-f63288630f3b",
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
  "id": "e20f4f7f-ea7a-4e99-b0be-60ab0f00e6f4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:38:17.718826Z",
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
  "command_id": "3a2b0481-e87e-47c3-8ca4-7a56fc2e82c3",
  "quote_id": "e20f4f7f-ea7a-4e99-b0be-60ab0f00e6f4",
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
  "correlation_id": "76f1d6c5-fd34-43b4-9d8c-9aaca6ff3299"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "6283da1a-846b-426a-b549-0246a36688c4",
      "short_number": 11,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "b7ef224d-8d5f-4823-b171-ef3ad63cd762",
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
      "created_at": "2026-10-28T07:33:17.677952Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T10:33:17Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "11603dbc-fd81-4a3f-b3f4-65c7800578cb",
      "short_number": 10,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "b7ef224d-8d5f-4823-b171-ef3ad63cd762",
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
      "created_at": "2026-10-28T07:33:17.604803Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "09da4052-f4d4-4680-9b4e-90fd81675145",
      "short_number": 9,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "b7ef224d-8d5f-4823-b171-ef3ad63cd762",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "11603dbc-fd81-4a3f-b3f4-65c7800578cb",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b7ef224d-8d5f-4823-b171-ef3ad63cd762",
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
  "created_at": "2026-10-28T07:33:17.604803Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/09da4052-f4d4-4680-9b4e-90fd81675145` → **200**

```json
{
  "id": "09da4052-f4d4-4680-9b4e-90fd81675145",
  "short_number": 9,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b7ef224d-8d5f-4823-b171-ef3ad63cd762",
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
    "id": "38f01539-7aa0-459e-a561-1e43c0485be0",
    "order_id": "09da4052-f4d4-4680-9b4e-90fd81675145",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "e16394b8-545f-4ccd-9710-1bfe385bf901",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T07:33:17.456594Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/09da4052-f4d4-4680-9b4e-90fd81675145/cancel` → **200**

```json
{
  "command_id": "e6d8399e-27ee-4466-aff3-67cd39c2322e",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "09da4052-f4d4-4680-9b4e-90fd81675145",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "b7ef224d-8d5f-4823-b171-ef3ad63cd762",
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
    "id": "38f01539-7aa0-459e-a561-1e43c0485be0",
    "order_id": "09da4052-f4d4-4680-9b4e-90fd81675145",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "e16394b8-545f-4ccd-9710-1bfe385bf901",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T07:33:17.456594Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/11603dbc-fd81-4a3f-b3f4-65c7800578cb` → **200**

```json
{
  "id": "11603dbc-fd81-4a3f-b3f4-65c7800578cb",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b7ef224d-8d5f-4823-b171-ef3ad63cd762",
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
  "created_at": "2026-10-28T07:33:17.604803Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/11603dbc-fd81-4a3f-b3f4-65c7800578cb/cancel` → **200**

```json
{
  "command_id": "52acbcff-4254-4c03-8797-d840bed7e555",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "11603dbc-fd81-4a3f-b3f4-65c7800578cb",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b7ef224d-8d5f-4823-b171-ef3ad63cd762",
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
  "created_at": "2026-10-28T07:33:17.604803Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/6283da1a-846b-426a-b549-0246a36688c4` → **200**

```json
{
  "id": "6283da1a-846b-426a-b549-0246a36688c4",
  "short_number": 11,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b7ef224d-8d5f-4823-b171-ef3ad63cd762",
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
  "created_at": "2026-10-28T07:33:17.677952Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T10:33:17Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/6283da1a-846b-426a-b549-0246a36688c4/cancel` → **200**

```json
{
  "command_id": "12bdde57-db47-4968-9ac1-cce208ce5102",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6283da1a-846b-426a-b549-0246a36688c4",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "b7ef224d-8d5f-4823-b171-ef3ad63cd762",
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
  "created_at": "2026-10-28T07:33:17.677952Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind"
    }
  },
  "pickup_at": "2026-10-28T10:33:17Z",
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
  "session_id": "15d8258a-00a4-43fa-938a-460cbdf7773f",
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
  "last_heartbeat_at": "2026-10-28T07:33:17.319963Z",
  "last_location_at": "2026-10-28T07:33:17.319963Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/15d8258a-00a4-43fa-938a-460cbdf7773f/close` → **200**

```json
{
  "command_id": "7f911e28-0c5e-4cfb-953a-a464344c047e",
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

Done: orders 09da4052-f4d4-4680-9b4e-90fd81675145, 11603dbc-fd81-4a3f-b3f4-65c7800578cb, 6283da1a-846b-426a-b549-0246a36688c4.

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
  "session_id": "0fed9e1d-0c25-4e33-aa61-34795519d861",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM2OTgsImlhdCI6MTc5MzE3Mjc5OCwianRpIjoiYjJlYWIwZWYtMzFhMC00ZDdmLWI4MTAtZGIwYjk5Y2JlNDBkIiwic2lkIjoiMGZlZDllMWQtMGMyNS00ZTMzLWFhNjEtMzQ3OTU1MTlkODYxIn0.nVaj2zsa_RLck8eYjcIUciXxzpJFmya2MShw_SWCia0",
  "access_expires_at": "2026-10-28T07:48:18.304658569Z",
  "refresh_token": "d9LmB9MpOmAZxom3kBJeLvCnnlKM1Kf9MQKDVNrKhCU",
  "refresh_expires_at": "2026-10-28T19:33:18.304086464Z",
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
  "session_id": "26c7553e-86fe-40a7-9d0d-e6c13666a711",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM2OTgsImlhdCI6MTc5MzE3Mjc5OCwianRpIjoiOGQxY2U1NmMtNzQ0ZC00Y2Q1LTg2NDctOWNlNjI4YmM1OTM5Iiwic2lkIjoiMjZjNzU1M2UtODZmZS00MGE3LTlkMGQtZTZjMTM2NjZhNzExIn0.s1wJ_8cJNHgZdI16iQ79PC2INLIJmAQ8Sn2fRq82Ov0",
  "access_expires_at": "2026-10-28T07:48:18.60968827Z",
  "refresh_token": "io14UAp1bjyPNFVOY4FL3bXBE6kmMstKJ5mSBq-Z34Y",
  "refresh_expires_at": "2026-10-28T19:33:18.609165219Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-3974"
}
```

```json
{
  "challenge_id": "c1cd42c0-0055-46f4-822e-24d4f79f4ff2",
  "expires_at": "2026-10-28T07:38:18.631152082Z",
  "resend_available_at": "2026-10-28T07:33:19.631152082Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "514739",
  "sent_at": "2026-10-28T07:33:18.633637381Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c1cd42c0-0055-46f4-822e-24d4f79f4ff2",
  "code": "514739",
  "device_ref": "sandbox-3974"
}
```

```json
{
  "session_id": "e05f2b40-c7d6-4632-9d2d-7ded6554897b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzY5OCwiaWF0IjoxNzkzMTcyNzk4LCJqdGkiOiI2OGU5MmIzOC0zOTVkLTQ5MzYtYTEwNC01NjJkMzVjMmZjYjYiLCJzaWQiOiJlMDVmMmI0MC1jN2Q2LTQ2MzItOWQyZC03ZGVkNjU1NDg5N2IifQ.i5OpHRtE8lBN51NBx5Uq2BcyEUJd17MjcIyg3BUZJ14",
  "access_expires_at": "2026-10-28T07:48:18.680996356Z",
  "refresh_token": "2Kk9-SiLG_YCcHalSycWuubSmQIl-cJkBRS63VE1iYM",
  "refresh_expires_at": "2026-11-27T07:33:18.680493634Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d06d716f-aab3-48c4-90d1-a8a9d1888bd6",
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
  "last_heartbeat_at": "2026-10-28T07:33:12.991069Z",
  "last_location_at": "2026-10-28T07:33:12.991069Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d06d716f-aab3-48c4-90d1-a8a9d1888bd6/handover` → **200**

```json
{
  "command_id": "412d75d9-0cee-4ef8-b509-68005c4da0e8",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d06d716f-aab3-48c4-90d1-a8a9d1888bd6",
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
  "last_heartbeat_at": "2026-10-28T07:33:12.991069Z",
  "last_location_at": "2026-10-28T07:33:12.991069Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d06d716f-aab3-48c4-90d1-a8a9d1888bd6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:33:18Z",
    "sequence": 1793172798756
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d06d716f-aab3-48c4-90d1-a8a9d1888bd6",
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
  "last_heartbeat_at": "2026-10-28T07:33:18.772056Z",
  "last_location_at": "2026-10-28T07:33:18.772056Z",
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
  "command_id": "f43fc85e-154d-4225-ac7f-867751775c47",
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
  "effective_at": "2026-10-28T07:33:18.832625Z",
  "changed_by": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T07:33:18.85810366Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "1aead92f-1da7-4aa1-a47b-e078cdbf2fdc",
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
  "id": "9badaf72-0420-407d-99d3-e6fd017e1c0c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T07:38:18.888166Z",
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
  "command_id": "b15c75a2-3a5b-4a0b-841c-bb7377595952",
  "quote_id": "9badaf72-0420-407d-99d3-e6fd017e1c0c",
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
    "phone": "+3806711114068"
  }
}
```

```json
{
  "id": "a2ae2e70-b9f8-422d-a10b-d733f82cb6a0",
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
  "created_at": "2026-10-28T07:33:18.920058Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114068"
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
    "id": "9fdf3122-f0c3-4dc9-90bf-e6ac81245b2f",
    "order_id": "a2ae2e70-b9f8-422d-a10b-d733f82cb6a0",
    "expires_at": "2026-10-28T07:33:33.923519Z",
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

`POST /api/driver/v1/offers/9fdf3122-f0c3-4dc9-90bf-e6ac81245b2f/accept` → **200**

```json
{
  "command_id": "f2e7995f-0f6b-47cf-96d2-fe9dfd92bdaf"
}
```

```json
{
  "id": "631597c0-4c7b-4139-9400-14cbc89220f7",
  "order_id": "a2ae2e70-b9f8-422d-a10b-d733f82cb6a0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6afcf6a1-a8a3-4212-a027-b411a30a3c70",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6afcf6a1-a8a3-4212-a027-b411a30a3c70",
  "order_id": "a2ae2e70-b9f8-422d-a10b-d733f82cb6a0",
  "assignment_id": "631597c0-4c7b-4139-9400-14cbc89220f7",
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
    "phone": "+3806711114068"
  }
}
```

`POST /api/driver/v1/work-sessions/d06d716f-aab3-48c4-90d1-a8a9d1888bd6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:33:19Z",
    "sequence": 1793172799111
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d06d716f-aab3-48c4-90d1-a8a9d1888bd6",
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
  "last_heartbeat_at": "2026-10-28T07:33:19.026565Z",
  "last_location_at": "2026-10-28T07:33:19.026565Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6afcf6a1-a8a3-4212-a027-b411a30a3c70/arrive` → **200**

```json
{
  "command_id": "ec057b19-81e0-4d64-a235-dc95da880636",
  "expected_version": 0
}
```

```json
{
  "id": "6afcf6a1-a8a3-4212-a027-b411a30a3c70",
  "order_id": "a2ae2e70-b9f8-422d-a10b-d733f82cb6a0",
  "assignment_id": "631597c0-4c7b-4139-9400-14cbc89220f7",
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
  "arrived_at": "2026-10-28T07:33:19.055414Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711114068"
  }
}
```

`POST /api/driver/v1/trips/6afcf6a1-a8a3-4212-a027-b411a30a3c70/start` → **200**

```json
{
  "command_id": "6b82d261-0a5e-4529-8f3a-1eafe6381c3b",
  "expected_version": 1
}
```

```json
{
  "id": "6afcf6a1-a8a3-4212-a027-b411a30a3c70",
  "order_id": "a2ae2e70-b9f8-422d-a10b-d733f82cb6a0",
  "assignment_id": "631597c0-4c7b-4139-9400-14cbc89220f7",
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
  "arrived_at": "2026-10-28T07:33:19.055414Z",
  "started_at": "2026-10-28T07:33:19.087894Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711114068"
  }
}
```

`POST /api/driver/v1/trips/6afcf6a1-a8a3-4212-a027-b411a30a3c70/complete` → **200**

```json
{
  "command_id": "cf0006ae-2b92-40f1-8c43-d148956b6242",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:33:19Z",
  "cash_received": true
}
```

```json
{
  "id": "6afcf6a1-a8a3-4212-a027-b411a30a3c70",
  "order_id": "a2ae2e70-b9f8-422d-a10b-d733f82cb6a0",
  "assignment_id": "631597c0-4c7b-4139-9400-14cbc89220f7",
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
  "arrived_at": "2026-10-28T07:33:19.055414Z",
  "started_at": "2026-10-28T07:33:19.087894Z",
  "completed_at": "2026-10-28T07:33:19.125978Z",
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
  "command_id": "56156f17-0bd4-480e-956e-6de3b70c6fdc",
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
  "id": "19f799f9-583f-4465-92cf-af0c5f1dc746",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T07:38:19.164388Z",
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
  "command_id": "ebbb09d1-4277-4156-9e15-53862f293b31",
  "quote_id": "19f799f9-583f-4465-92cf-af0c5f1dc746",
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
    "phone": "+380671113913"
  }
}
```

```json
{
  "id": "e5065073-7851-422e-af1a-3096320bc4bb",
  "short_number": 13,
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
  "created_at": "2026-10-28T07:33:19.195369Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671113913"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/e5065073-7851-422e-af1a-3096320bc4bb` → **200**

```json
{
  "id": "e5065073-7851-422e-af1a-3096320bc4bb",
  "short_number": 13,
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
  "created_at": "2026-10-28T07:33:19.195369Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671113913"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e5065073-7851-422e-af1a-3096320bc4bb/cancel` → **200**

```json
{
  "command_id": "40060941-03f6-4e77-945b-d5e289aa1bbb",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "e5065073-7851-422e-af1a-3096320bc4bb",
  "short_number": 13,
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
  "created_at": "2026-10-28T07:33:19.195369Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671113913"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "uk": "Помилка оператора",
      "pl": "Błąd operatora",
      "ru": "Ошибка оператора",
      "en": "Operator error"
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
  "staff_id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T07:33:19.254842Z",
  "last_entries": [
    {
      "order_id": "e5065073-7851-422e-af1a-3096320bc4bb",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T07:33:19.254842Z"
    },
    {
      "order_id": "a2ae2e70-b9f8-422d-a10b-d733f82cb6a0",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T07:33:19.131885Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d06d716f-aab3-48c4-90d1-a8a9d1888bd6",
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
  "last_heartbeat_at": "2026-10-28T07:33:19.026565Z",
  "last_location_at": "2026-10-28T07:33:19.026565Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d06d716f-aab3-48c4-90d1-a8a9d1888bd6/close` → **200**

```json
{
  "command_id": "a558edc9-5c40-4f71-a283-6d8e7ee43c9a",
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

Done: operator bonus for fulfilled a2ae2e70-b9f8-422d-a10b-d733f82cb6a0 and operator-fault cancellation e5065073-7851-422e-af1a-3096320bc4bb.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674330399",
  "device_ref": "sandbox-7576"
}
```

```json
{
  "challenge_id": "6742f6b9-865c-4301-9b49-aeb4a56f5b43",
  "expires_at": "2026-10-28T07:38:21.38563192Z",
  "resend_available_at": "2026-10-28T07:33:22.38563192Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674330399` → **200**

```json
{
  "phone": "+380674330399",
  "audience": "CLIENT",
  "code": "572566",
  "sent_at": "2026-10-28T07:33:21.387701054Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675375619",
  "device_ref": "sandbox-9246",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "0bacb874-4be2-45fb-8706-692386e70b5b",
  "expires_at": "2026-10-28T07:38:21.431841063Z",
  "resend_available_at": "2026-10-28T07:33:22.431841063Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675375619` → **200**

```json
{
  "phone": "+380675375619",
  "audience": "CLIENT",
  "code": "893165",
  "sent_at": "2026-10-28T07:33:21.433669389Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676110000",
  "device_ref": "sandbox-14828"
}
```

```json
{
  "challenge_id": "429cf07d-79b4-46c9-9996-64789ab8340d",
  "expires_at": "2026-10-28T07:38:21.476040685Z",
  "resend_available_at": "2026-10-28T07:33:22.476040685Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676110000` → **200**

```json
{
  "phone": "+380676110000",
  "audience": "CLIENT",
  "code": "456172",
  "sent_at": "2026-10-28T07:33:21.478279912Z",
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
  "session_id": "3a3e9122-6124-4ff4-8bd6-c4fb654dc62a",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM3MDEsImlhdCI6MTc5MzE3MjgwMSwianRpIjoiMTg3ZWI3NWUtYmZkZC00OGU4LTgxZjItMWVmNTYzMjE3ZTFkIiwic2lkIjoiM2EzZTkxMjItNjEyNC00ZmY0LThiZDYtYzRmYjY1NGRjNjJhIn0.iZFcStfUnti5nnFg7Td9QkXsPKIiaioUmEBrKOtGO6g",
  "access_expires_at": "2026-10-28T07:48:21.805363866Z",
  "refresh_token": "4LKBLrRIv-a2L2oyQJP2N61ebvHCFpaJoKZcmM4mj5Y",
  "refresh_expires_at": "2026-10-28T19:33:21.804830621Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676110000` → **200**

```json
{
  "deliveries": [
    {
      "id": "ff0e33ec-c4ad-4eb6-9a0c-b89d8062fcb6",
      "challenge_id": "429cf07d-79b4-46c9-9996-64789ab8340d",
      "phone": "+380676110000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-0910cfc5-3086-493a-9e66-2ac4c8082f04",
      "error": null,
      "attempted_at": "2026-10-28T07:33:21.478438Z"
    },
    {
      "id": "35c6720a-3ea2-4e6b-bfc1-f8f26461db80",
      "challenge_id": "429cf07d-79b4-46c9-9996-64789ab8340d",
      "phone": "+380676110000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T07:33:21.47783Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380676110000` → **200**

```json
{
  "phone": "+380676110000",
  "audience": "CLIENT",
  "code": "456172",
  "sent_at": "2026-10-28T07:33:21.478279912Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675375619` → **200**

```json
{
  "deliveries": [
    {
      "id": "c7284003-0a42-43e5-b759-98ad1f28bbf4",
      "challenge_id": "0bacb874-4be2-45fb-8706-692386e70b5b",
      "phone": "+380675375619",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-c0a33683-0f19-4fb0-a57f-4a32f0fa82f9",
      "error": null,
      "attempted_at": "2026-10-28T07:33:21.433834Z"
    }
  ]
}
```

Done: SMS to +380674330399, a call to +380675375619, SMS then a call to +380676110000.

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
  "session_id": "8d46b0d4-38d1-475f-8239-df6bbc8a3feb",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM3MDIsImlhdCI6MTc5MzE3MjgwMiwianRpIjoiOWNlMmYwZjEtNzAyMS00YjVmLTk1MzAtZWNhNWVhNGE0MTYzIiwic2lkIjoiOGQ0NmIwZDQtMzhkMS00NzVmLTgyMzktZGY2YmJjOGEzZmViIn0.YEAolCyr8iRxOFfubaopdAD-QU82baN6ARfyiikG66c",
  "access_expires_at": "2026-10-28T07:48:22.193313879Z",
  "refresh_token": "7VBrV-Pvei-eRx11whQoxdfcELK-owF_GQiZDADcNJw",
  "refresh_expires_at": "2026-10-28T19:33:22.192825775Z",
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
  "session_id": "b3b300a6-f591-4d9b-bf14-2aaa2a3f1806",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM3MDIsImlhdCI6MTc5MzE3MjgwMiwianRpIjoiMjk1NTcwMmItNWY1MC00NWVjLTk0ODYtN2Q5YTZlZTZiZTg5Iiwic2lkIjoiYjNiMzAwYTYtZjU5MS00ZDliLWJmMTQtMmFhYTJhM2YxODA2In0.PT4yvCNW2b5eDi5UyFqoRqx123gsKB6X8UoV3HCznJw",
  "access_expires_at": "2026-10-28T07:48:22.499005495Z",
  "refresh_token": "nNqR6Dje-b5U_axmWjfaBG119U6Mz-R_NoMsUCGoTHI",
  "refresh_expires_at": "2026-10-28T19:33:22.498425942Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
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
    "reports.view"
  ]
}
```

`GET /api/admin/v1/staff-extensions` → **200**

```json
{
  "extensions": []
}
```

`POST /api/admin/v1/staff-extensions/851609bd-7b4a-4753-ac8b-5b8b4118c9a2` → **200**

```json
{
  "command_id": "5c28d72e-0b1c-4d88-a05b-7633dd263916",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "270e3823-c0ea-43ae-a53f-037adfe41c18",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T07:33:22.614967Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T07:33:22.614967Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "00eefb07-41db-4efa-a41b-b7c88af296ab",
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
  "id": "cf272c7c-75ab-40bc-8145-85360a98f2cf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:38:22.669288Z",
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
  "command_id": "c89bc4d9-0feb-4114-bc66-1d12de18b202",
  "quote_id": "cf272c7c-75ab-40bc-8145-85360a98f2cf",
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
    "phone": "+380675311567"
  }
}
```

```json
{
  "id": "52b9a240-7df7-4c10-a9c1-0ff39d90e3a1",
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
  "created_at": "2026-10-28T07:33:22.701316Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675311567"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/52b9a240-7df7-4c10-a9c1-0ff39d90e3a1/calls` → **201**

```json
{
  "command_id": "6140d96b-32a4-4735-87ed-37395abe75cf",
  "to": "CALLER"
}
```

```json
{
  "id": "e08f951a-c005-4a92-bd25-49a40f4f0eab",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
  "order_ids": [
    "52b9a240-7df7-4c10-a9c1-0ff39d90e3a1"
  ],
  "started_at": "2026-10-28T07:33:22.743066Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/52b9a240-7df7-4c10-a9c1-0ff39d90e3a1/calls` → **201**

```json
{
  "command_id": "6140d96b-32a4-4735-87ed-37395abe75cf",
  "to": "CALLER"
}
```

```json
{
  "id": "e08f951a-c005-4a92-bd25-49a40f4f0eab",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
  "order_ids": [
    "52b9a240-7df7-4c10-a9c1-0ff39d90e3a1"
  ],
  "started_at": "2026-10-28T07:33:22.743066Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "e08f951a-c005-4a92-bd25-49a40f4f0eab",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380675311567",
    "at": "2026-10-28T07:33:22.76167793Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "e08f951a-c005-4a92-bd25-49a40f4f0eab",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.20949",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "e08f951a-c005-4a92-bd25-49a40f4f0eab"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "e08f951a-c005-4a92-bd25-49a40f4f0eab",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=52b9a240-7df7-4c10-a9c1-0ff39d90e3a1` → **200**

```json
{
  "calls": [
    {
      "id": "e08f951a-c005-4a92-bd25-49a40f4f0eab",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
      "order_ids": [
        "52b9a240-7df7-4c10-a9c1-0ff39d90e3a1"
      ],
      "started_at": "2026-10-28T07:33:22.743066Z",
      "answered_at": "2026-10-28T07:33:22.879924Z",
      "ended_at": "2026-10-28T07:33:22.897647Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=52b9a240-7df7-4c10-a9c1-0ff39d90e3a1` → **200**

```json
{
  "calls": [
    {
      "id": "e08f951a-c005-4a92-bd25-49a40f4f0eab",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
      "order_ids": [
        "52b9a240-7df7-4c10-a9c1-0ff39d90e3a1"
      ],
      "started_at": "2026-10-28T07:33:22.743066Z",
      "answered_at": "2026-10-28T07:33:22.879924Z",
      "ended_at": "2026-10-28T07:33:22.897647Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T07:33:24.157776Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/52b9a240-7df7-4c10-a9c1-0ff39d90e3a1` → **200**

```json
{
  "id": "52b9a240-7df7-4c10-a9c1-0ff39d90e3a1",
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
  "created_at": "2026-10-28T07:33:22.701316Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675311567"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/52b9a240-7df7-4c10-a9c1-0ff39d90e3a1/cancel` → **200**

```json
{
  "command_id": "a6f43f85-3099-4a72-a35c-204647074e47",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "52b9a240-7df7-4c10-a9c1-0ff39d90e3a1",
  "short_number": 14,
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
  "created_at": "2026-10-28T07:33:22.701316Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675311567"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available"
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
  "command_id": "259f2bec-52cd-49f2-bb04-b014041d439f",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T07:33:25.040127Z",
  "extension": "101"
}
```

Done: outgoing call e08f951a-c005-4a92-bd25-49a40f4f0eab from order 52b9a240-7df7-4c10-a9c1-0ff39d90e3a1, recorded.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638509739",
  "device_ref": "sandbox-25403"
}
```

```json
{
  "challenge_id": "f98877d9-430c-46bc-a4fd-5aeb8f471e5d",
  "expires_at": "2026-10-28T07:38:25.077784104Z",
  "resend_available_at": "2026-10-28T07:33:26.077784104Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638509739` → **200**

```json
{
  "phone": "+380638509739",
  "audience": "CLIENT",
  "code": "941129",
  "sent_at": "2026-10-28T07:33:25.08231364Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f98877d9-430c-46bc-a4fd-5aeb8f471e5d",
  "code": "941129",
  "device_ref": "sandbox-25403"
}
```

```json
{
  "session_id": "a8256d55-7b05-4024-8cb5-963f873cc3f5",
  "subject": {
    "type": "CLIENT",
    "id": "4034be1b-6dd6-451b-bd2d-476a868e2b4f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MDM0YmUxYi02ZGQ2LTQ1MWItYmQyZC00NzZhODY4ZTJiNGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNzA1LCJpYXQiOjE3OTMxNzI4MDUsImp0aSI6IjVjNTcwMjczLTVlYWMtNDhkZi1iZWRkLTlhMTk4YjgwZjE2MyIsInNpZCI6ImE4MjU2ZDU1LTdiMDUtNDAyNC04Y2I1LTk2M2Y4NzNjYzNmNSJ9.cVzu2WBunYveBvF3IS6yVl0FVM6WwtvKrduGvhaGdxQ",
  "access_expires_at": "2026-10-28T07:48:25.129756805Z",
  "refresh_token": "g6qDL4ME6g5irbTrqqT4V_4d4Wa4girBF_ddSiT4-qw",
  "refresh_expires_at": "2026-11-27T07:33:25.129218461Z",
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
  "session_id": "32bae918-8b2e-462f-80e0-f3d10faa8bf9",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM3MDUsImlhdCI6MTc5MzE3MjgwNSwianRpIjoiYWNlNWYyMzItZDViYi00ZmRjLWE5MTItOGRmYzFmZTZkNDhjIiwic2lkIjoiMzJiYWU5MTgtOGIyZS00NjJmLTgwZTAtZjNkMTBmYWE4YmY5In0.d9eiEBcsRJA-34oJ26_FrmUGd7AAg3wFLXAvwTPpkFY",
  "access_expires_at": "2026-10-28T07:48:25.505330658Z",
  "refresh_token": "2uIhh4QTZ5oDvWhDNaCoLqNkUtHvwS1ZpSzYqJ_XuQU",
  "refresh_expires_at": "2026-10-28T19:33:25.504850393Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380638509739` → **200**

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
  "correlation_id": "288e0d77-1642-4858-bd25-b93f1b2fb810"
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
  "session_id": "fcb93949-79a8-4173-88b8-d58b64a7b96d",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM3MDUsImlhdCI6MTc5MzE3MjgwNSwianRpIjoiNzUwMGNjOGMtYWYzNC00NWM2LWE1NGUtYTI4YjhmNGRkN2RmIiwic2lkIjoiZmNiOTM5NDktNzlhOC00MTczLTg4YjgtZDU4YjY0YTdiOTZkIn0.uf-36ZSl6j7TfFZFP2NSL9cXfP_3p5wnPSGKlaApNUQ",
  "access_expires_at": "2026-10-28T07:48:25.868896519Z",
  "refresh_token": "QTX-qtaF_2KUcqHsuvdMg8e7nT4NVpqW9IOj6dz3DCs",
  "refresh_expires_at": "2026-10-28T19:33:25.868406815Z",
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
  "command_id": "0abc93c6-8447-47fd-a545-7b454c9d8a72",
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
  "changed_by": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T07:33:25.930866929Z"
}
```

## The rider books the airport for 2026-10-28T10:33:25Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600946778",
  "device_ref": "sandbox-16235"
}
```

```json
{
  "challenge_id": "8b4027b5-0fbf-43c4-9a87-4b603302f3d7",
  "expires_at": "2026-10-28T07:38:25.957232952Z",
  "resend_available_at": "2026-10-28T07:33:26.957232952Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600946778` → **200**

```json
{
  "phone": "+48600946778",
  "audience": "CLIENT",
  "code": "606279",
  "sent_at": "2026-10-28T07:33:25.959130423Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8b4027b5-0fbf-43c4-9a87-4b603302f3d7",
  "code": "606279",
  "device_ref": "sandbox-16235"
}
```

```json
{
  "session_id": "1e9d90f3-96d7-48cc-9695-e54a76e68d87",
  "subject": {
    "type": "CLIENT",
    "id": "3cd074c8-bccb-49f7-a352-c15315c168f9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzY2QwNzRjOC1iY2NiLTQ5ZjctYTM1Mi1jMTUzMTVjMTY4ZjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNzA2LCJpYXQiOjE3OTMxNzI4MDYsImp0aSI6IjliZGM2MjcxLTdjNTgtNGIxMi04YzgxLWQ3MjY4Y2Y1OGUzMCIsInNpZCI6IjFlOWQ5MGYzLTk2ZDctNDhjYy05Njk1LWU1NGE3NmU2OGQ4NyJ9.pSDLB5dpdMY4OyBUvdO0JMthziCs5-dBXZhJOHjMBsY",
  "access_expires_at": "2026-10-28T07:48:26.002951162Z",
  "refresh_token": "iKgKy7X75SXg-duy6S53CJOapVwYQOC23IX3BPkqp1U",
  "refresh_expires_at": "2026-11-27T07:33:26.002475552Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f877c423-496e-4ee2-90a4-fae1f09dbc77",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T10:33:25Z"
}
```

```json
{
  "id": "e7ffc019-7d89-4630-a9e6-75d950551ae4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-28T07:38:26.033292Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T10:33:25Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "bfccaf54-3081-440d-928a-3af6b6a4a1d5",
  "quote_id": "e7ffc019-7d89-4630-a9e6-75d950551ae4",
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
  "pickup_at": "2026-10-28T10:33:25Z"
}
```

```json
{
  "id": "f287cb6d-e54c-4da3-983f-ab56ca8f98f3",
  "short_number": 15,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3cd074c8-bccb-49f7-a352-c15315c168f9",
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
  "created_at": "2026-10-28T07:33:26.063507Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T10:33:25Z",
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
  "device_ref": "sandbox-25914"
}
```

```json
{
  "challenge_id": "5a5e126b-3f47-4887-8cda-4d7e6a76b784",
  "expires_at": "2026-10-28T07:38:26.090608498Z",
  "resend_available_at": "2026-10-28T07:33:27.090608498Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "140501",
  "sent_at": "2026-10-28T07:33:26.0924703Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5a5e126b-3f47-4887-8cda-4d7e6a76b784",
  "code": "140501",
  "device_ref": "sandbox-25914"
}
```

```json
{
  "session_id": "28b406a8-626e-4912-94db-934fe428afc1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzcwNiwiaWF0IjoxNzkzMTcyODA2LCJqdGkiOiJmZDcyZjdmZS1jZDVlLTQ2YTItYjhiZS1iM2E3NWM4ZTJiNjAiLCJzaWQiOiIyOGI0MDZhOC02MjZlLTQ5MTItOTRkYi05MzRmZTQyOGFmYzEifQ.QIym6c2TqF0hF5yYxvVneIMsIz0NnABAvuJ9wxYPt4o",
  "access_expires_at": "2026-10-28T07:48:26.13693475Z",
  "refresh_token": "ufRHnePuS8QIWaU-A_NgdSHw8C4r0iG7zz490JKCU2U",
  "refresh_expires_at": "2026-11-27T07:33:26.136395909Z",
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
  "command_id": "3e5bb431-bb33-4fa4-bfda-8d3f7b36ec05",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:33:26Z",
    "sequence": 1793172806176
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "9a90f296-9e71-48f9-9ab1-91dd8346ff9c",
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
  "last_heartbeat_at": "2026-10-28T07:33:26.191848Z",
  "last_location_at": "2026-10-28T07:33:26.191848Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "f287cb6d-e54c-4da3-983f-ab56ca8f98f3",
      "short_number": 15,
      "pickup_at": "2026-10-28T10:33:25Z",
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

`POST /api/driver/v1/preorders/f287cb6d-e54c-4da3-983f-ab56ca8f98f3/reserve` → **200**

```json
{
  "command_id": "9c5e1211-d93b-4e40-b8ca-a58e627692d7"
}
```

```json
{
  "id": "80776e18-a32f-4a8d-a2d4-383324fe3de8",
  "state": "RESERVED",
  "order": {
    "order_id": "f287cb6d-e54c-4da3-983f-ab56ca8f98f3",
    "short_number": 15,
    "pickup_at": "2026-10-28T10:33:25Z",
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
  "reserved_at": "2026-10-28T07:33:26.248979Z",
  "confirm_from": "2026-10-28T10:03:25Z",
  "confirm_until": "2026-10-28T10:13:25Z",
  "drop_until": "2026-10-28T09:33:25Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "80776e18-a32f-4a8d-a2d4-383324fe3de8",
      "state": "RESERVED",
      "order": {
        "order_id": "f287cb6d-e54c-4da3-983f-ab56ca8f98f3",
        "short_number": 15,
        "pickup_at": "2026-10-28T10:33:25Z",
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
      "reserved_at": "2026-10-28T07:33:26.248979Z",
      "confirm_from": "2026-10-28T10:03:25Z",
      "confirm_until": "2026-10-28T10:13:25Z",
      "drop_until": "2026-10-28T09:33:25Z"
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
      "id": "80776e18-a32f-4a8d-a2d4-383324fe3de8",
      "state": "RESERVED",
      "order": {
        "order_id": "f287cb6d-e54c-4da3-983f-ab56ca8f98f3",
        "short_number": 15,
        "pickup_at": "2026-10-28T10:33:25Z",
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
      "reserved_at": "2026-10-28T07:33:26.248979Z",
      "confirm_from": "2026-10-28T10:03:25Z",
      "confirm_until": "2026-10-28T10:13:25Z",
      "drop_until": "2026-10-28T09:33:25Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/80776e18-a32f-4a8d-a2d4-383324fe3de8/confirm` → **409**

```json
{
  "command_id": "e111308a-9cf3-42c5-8fed-9c8974467a68"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/80776e18-a32f-4a8d-a2d4-383324fe3de8/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "81650725-833d-44e2-8451-bae0e990c35d"
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
  "session_id": "4c3a5e37-ea37-4d95-b19d-4e98cb00ae7c",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM3MDYsImlhdCI6MTc5MzE3MjgwNiwianRpIjoiZDMzODJlMDItNWQ4OS00MjdiLTlhNWEtNjc4YjBiM2ZjY2ViIiwic2lkIjoiNGMzYTVlMzctZWEzNy00ZDk1LWIxOWQtNGU5OGNiMDBhZTdjIn0.CAEMc-qMbirlaNVl5Dg8b-VIegVzypxQBuPt_aDbD74",
  "access_expires_at": "2026-10-28T07:48:26.63002162Z",
  "refresh_token": "idh-v7RnWQJQt9mv8elNMsoMwHpOer57Pk_eRbTT5Y0",
  "refresh_expires_at": "2026-10-28T19:33:26.629494906Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f287cb6d-e54c-4da3-983f-ab56ca8f98f3` → **200**

```json
{
  "id": "f287cb6d-e54c-4da3-983f-ab56ca8f98f3",
  "short_number": 15,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "3cd074c8-bccb-49f7-a352-c15315c168f9",
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
  "created_at": "2026-10-28T07:33:26.063507Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T10:33:25Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "80776e18-a32f-4a8d-a2d4-383324fe3de8",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T07:33:26.248979Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/f287cb6d-e54c-4da3-983f-ab56ca8f98f3/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T07:33:26.064474Z",
      "actor": {
        "type": "CLIENT",
        "id": "3cd074c8-bccb-49f7-a352-c15315c168f9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "f287cb6d-e54c-4da3-983f-ab56ca8f98f3",
        "preorder": true,
        "quote_id": "e7ffc019-7d89-4630-a9e6-75d950551ae4",
        "pickup_at": "2026-10-28T10:33:25Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T07:33:26.250089Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f287cb6d-e54c-4da3-983f-ab56ca8f98f3",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "80776e18-a32f-4a8d-a2d4-383324fe3de8"
      }
    }
  ]
}
```

Done: pre-order f287cb6d-e54c-4da3-983f-ab56ca8f98f3, reservation 80776e18-a32f-4a8d-a2d4-383324fe3de8.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17794"
}
```

```json
{
  "challenge_id": "9b8815d1-7d14-4a86-aca0-b95ad4214ae9",
  "expires_at": "2026-10-28T07:38:26.701846528Z",
  "resend_available_at": "2026-10-28T07:33:27.701846528Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "122785",
  "sent_at": "2026-10-28T07:33:26.704032Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9b8815d1-7d14-4a86-aca0-b95ad4214ae9",
  "code": "122785",
  "device_ref": "sandbox-17794"
}
```

```json
{
  "session_id": "9dea30ef-249e-4a4e-aeb5-3d5073c373eb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzcwNiwiaWF0IjoxNzkzMTcyODA2LCJqdGkiOiI3NDI0OTIyYS1hNTM0LTQzNzMtYjhhMC1lZDAxNzQyZDExZjEiLCJzaWQiOiI5ZGVhMzBlZi0yNDllLTRhNGUtYWViNS0zZDUwNzNjMzczZWIifQ.XyvUF_ImAu3iEUYD3goRZFuIYQ6IHHsNIeHW06ARNP4",
  "access_expires_at": "2026-10-28T07:48:26.747477947Z",
  "refresh_token": "dx98RBb0CJkPAhDXOIEwZvvzRIFt9tlujpW81jp_zL0",
  "refresh_expires_at": "2026-11-27T07:33:26.747022222Z",
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
  "command_id": "bbc28ee2-754a-4dc2-813a-fe3b3d339efa",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:33:26Z",
    "sequence": 1793172806787
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fd592aed-0cf0-46e9-b591-889046c698e3",
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
  "last_heartbeat_at": "2026-10-28T07:33:26.80226Z",
  "last_location_at": "2026-10-28T07:33:26.80226Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670028604",
  "device_ref": "sandbox-25935"
}
```

```json
{
  "challenge_id": "1e6fa5f9-5d6f-4c1f-a09d-3087bef41afc",
  "expires_at": "2026-10-28T07:38:26.827409473Z",
  "resend_available_at": "2026-10-28T07:33:27.827409473Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670028604` → **200**

```json
{
  "phone": "+380670028604",
  "audience": "CLIENT",
  "code": "827971",
  "sent_at": "2026-10-28T07:33:26.829149712Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1e6fa5f9-5d6f-4c1f-a09d-3087bef41afc",
  "code": "827971",
  "device_ref": "sandbox-25935"
}
```

```json
{
  "session_id": "7c5d9ff6-81f8-4925-b62d-75ea02158658",
  "subject": {
    "type": "CLIENT",
    "id": "16386159-fb7e-4b5c-8876-d6a0d3a36ac6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNjM4NjE1OS1mYjdlLTRiNWMtODg3Ni1kNmEwZDNhMzZhYzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNzA2LCJpYXQiOjE3OTMxNzI4MDYsImp0aSI6IjU1M2JlMzBkLWNmNTktNDA1MC05NmUyLTFiZDE3NmUxNTQ5ZiIsInNpZCI6IjdjNWQ5ZmY2LTgxZjgtNDkyNS1iNjJkLTc1ZWEwMjE1ODY1OCJ9.3z0of00b1ttMptdx59djHJEHGpDvmAR1edO1aOWbrzU",
  "access_expires_at": "2026-10-28T07:48:26.873401074Z",
  "refresh_token": "y3We3Pc4C-PpK0eG2DUw7yWbgz8TEuyF_UiX2fKIjKg",
  "refresh_expires_at": "2026-11-27T07:33:26.872949329Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b9d0693d-9276-4dfc-8326-516280eeedd5",
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
  "id": "cfdd6934-55b5-4a14-8e86-ac92d47a6319",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:38:26.903924Z",
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
  "command_id": "bd34f93b-c78b-4286-9c0d-420bcf231fca",
  "quote_id": "cfdd6934-55b5-4a14-8e86-ac92d47a6319",
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
  "id": "dd1bfc9d-7b6d-46db-9371-7c97ff206e8a",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "16386159-fb7e-4b5c-8876-d6a0d3a36ac6",
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
  "created_at": "2026-10-28T07:33:26.935001Z",
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
    "id": "d9eef08d-89e7-4e8f-8f8c-817e2a38f4e8",
    "order_id": "dd1bfc9d-7b6d-46db-9371-7c97ff206e8a",
    "expires_at": "2026-10-28T07:33:41.937401Z",
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

`POST /api/driver/v1/offers/d9eef08d-89e7-4e8f-8f8c-817e2a38f4e8/accept` → **200**

```json
{
  "command_id": "0dc7a1b2-7ab3-4754-88c6-eae4e881b647"
}
```

```json
{
  "id": "0824ce7e-a7a5-49e7-bbe7-9ea7e04a64e6",
  "order_id": "dd1bfc9d-7b6d-46db-9371-7c97ff206e8a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bbe9f03e-b5c8-4cc6-ba26-4f7a9526493d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bbe9f03e-b5c8-4cc6-ba26-4f7a9526493d",
  "order_id": "dd1bfc9d-7b6d-46db-9371-7c97ff206e8a",
  "assignment_id": "0824ce7e-a7a5-49e7-bbe7-9ea7e04a64e6",
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

`POST /api/driver/v1/work-sessions/fd592aed-0cf0-46e9-b591-889046c698e3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:33:27Z",
    "sequence": 1793172807234
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fd592aed-0cf0-46e9-b591-889046c698e3",
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
  "last_heartbeat_at": "2026-10-28T07:33:27.038561Z",
  "last_location_at": "2026-10-28T07:33:27.038561Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bbe9f03e-b5c8-4cc6-ba26-4f7a9526493d",
  "order_id": "dd1bfc9d-7b6d-46db-9371-7c97ff206e8a",
  "assignment_id": "0824ce7e-a7a5-49e7-bbe7-9ea7e04a64e6",
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

`POST /api/driver/v1/trips/bbe9f03e-b5c8-4cc6-ba26-4f7a9526493d/arrive` → **200**

```json
{
  "command_id": "ea60e8ed-c98a-4783-b62b-ae0eafe765cf",
  "expected_version": 0
}
```

```json
{
  "id": "bbe9f03e-b5c8-4cc6-ba26-4f7a9526493d",
  "order_id": "dd1bfc9d-7b6d-46db-9371-7c97ff206e8a",
  "assignment_id": "0824ce7e-a7a5-49e7-bbe7-9ea7e04a64e6",
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
  "arrived_at": "2026-10-28T07:33:27.080233Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bbe9f03e-b5c8-4cc6-ba26-4f7a9526493d/start` → **200**

```json
{
  "command_id": "e356246c-abdf-47cd-907b-d5b9a648b774",
  "expected_version": 1
}
```

```json
{
  "id": "bbe9f03e-b5c8-4cc6-ba26-4f7a9526493d",
  "order_id": "dd1bfc9d-7b6d-46db-9371-7c97ff206e8a",
  "assignment_id": "0824ce7e-a7a5-49e7-bbe7-9ea7e04a64e6",
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
  "arrived_at": "2026-10-28T07:33:27.080233Z",
  "started_at": "2026-10-28T07:33:27.107919Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/fd592aed-0cf0-46e9-b591-889046c698e3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:33:27Z",
    "sequence": 1793172807235
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fd592aed-0cf0-46e9-b591-889046c698e3",
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
  "last_heartbeat_at": "2026-10-28T07:33:27.14232Z",
  "last_location_at": "2026-10-28T07:33:27.14232Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/bbe9f03e-b5c8-4cc6-ba26-4f7a9526493d/complete` → **200**

```json
{
  "command_id": "7dc5820f-038b-445c-b920-5d8d1e86afbb",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:33:27Z",
  "cash_received": true
}
```

```json
{
  "id": "bbe9f03e-b5c8-4cc6-ba26-4f7a9526493d",
  "order_id": "dd1bfc9d-7b6d-46db-9371-7c97ff206e8a",
  "assignment_id": "0824ce7e-a7a5-49e7-bbe7-9ea7e04a64e6",
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
  "arrived_at": "2026-10-28T07:33:27.080233Z",
  "started_at": "2026-10-28T07:33:27.107919Z",
  "completed_at": "2026-10-28T07:33:27.167967Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/dd1bfc9d-7b6d-46db-9371-7c97ff206e8a/rating` → **200**

```json
{
  "command_id": "927298f2-e660-4b9b-8740-07b2f75d3971",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "dd1bfc9d-7b6d-46db-9371-7c97ff206e8a",
  "score": 5,
  "created_at": "2026-10-28T07:33:27.210345683Z"
}
```

`POST /api/driver/v1/orders/dd1bfc9d-7b6d-46db-9371-7c97ff206e8a/rating` → **200**

```json
{
  "command_id": "32d2872c-1aab-4323-b7b0-d9950307c5a9",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "dd1bfc9d-7b6d-46db-9371-7c97ff206e8a",
  "score": 4,
  "created_at": "2026-10-28T07:33:27.240338408Z"
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
  "session_id": "32f3b586-ec49-4f5b-9471-a92184861186",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM3MDcsImlhdCI6MTc5MzE3MjgwNywianRpIjoiYjcwODQ0MTgtNzMzMy00ZTE1LThjNTItNWU1YWIxNjk5NWM1Iiwic2lkIjoiMzJmM2I1ODYtZWM0OS00ZjViLTk0NzEtYTkyMTg0ODYxMTg2In0.ZJWPYqjRy1QnlxBNGZzz1Jh3BH7Pf0RRcRLhKP6cDpw",
  "access_expires_at": "2026-10-28T07:48:27.573402355Z",
  "refresh_token": "SGfPj0BVoCJZXaa884Khi-IXAEGedThYE-iPtMLuecI",
  "refresh_expires_at": "2026-10-28T19:33:27.572925282Z",
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
  "session_id": "9b2f220f-042f-4431-98f0-de09c351f542",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM3MDcsImlhdCI6MTc5MzE3MjgwNywianRpIjoiY2ZiYmE5MzItMmI4OC00Y2QwLTk3ODQtNjJmNjI0OGEzMGI2Iiwic2lkIjoiOWIyZjIyMGYtMDQyZi00NDMxLTk4ZjAtZGUwOWMzNTFmNTQyIn0.87UbCLH3xEnRYHjN8z0t74Egw8ETQg5m9y3Zww2SSSI",
  "access_expires_at": "2026-10-28T07:48:27.880963776Z",
  "refresh_token": "JcyQDkHmTVGDRXBOi3XvuHleMbo_rcSjHLXbUScqSbU",
  "refresh_expires_at": "2026-10-28T19:33:27.880513425Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/dd1bfc9d-7b6d-46db-9371-7c97ff206e8a/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "dd1bfc9d-7b6d-46db-9371-7c97ff206e8a",
      "author_type": "RIDER",
      "author_id": "16386159-fb7e-4b5c-8876-d6a0d3a36ac6",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T07:33:27.210346Z"
    },
    {
      "order_id": "dd1bfc9d-7b6d-46db-9371-7c97ff206e8a",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "16386159-fb7e-4b5c-8876-d6a0d3a36ac6",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T07:33:27.240338Z"
    }
  ]
}
```

Done: ratings for order dd1bfc9d-7b6d-46db-9371-7c97ff206e8a.

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
  "session_id": "ebb4f4fe-932a-4a31-97da-49985d88640f",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM3MDgsImlhdCI6MTc5MzE3MjgwOCwianRpIjoiMmUyMzE1YTctNGViZS00MmI1LWFmYjktMTQxZWQ3ZWQ4NTc3Iiwic2lkIjoiZWJiNGY0ZmUtOTMyYS00YTMxLTk3ZGEtNDk5ODVkODg2NDBmIn0.uaRh8mznUDySj9DKrJQMIyfNgW3877biTzfggfgHMdY",
  "access_expires_at": "2026-10-28T07:48:28.226046744Z",
  "refresh_token": "rkrMgKeP8oO2XSxBeVBvb38FF1egqSgfhEmJwJVrVsY",
  "refresh_expires_at": "2026-10-28T19:33:28.225518987Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "5417c310-6b89-4e7e-9d21-e6499cf7aa35",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "6907923f-453c-418c-91a8-cbfbf777ba95",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:33:28.261335Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6907923f-453c-418c-91a8-cbfbf777ba95` → **200**

```json
{
  "id": "6907923f-453c-418c-91a8-cbfbf777ba95",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:33:28.261335Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6907923f-453c-418c-91a8-cbfbf777ba95` → **200**

```json
{
  "id": "6907923f-453c-418c-91a8-cbfbf777ba95",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T07:33:28.261335Z",
  "ready_at": "2026-10-28T07:33:29.169078Z",
  "expires_at": "2026-10-29T07:33:29.169078Z"
}
```

`GET /api/admin/v1/reports/exports/6907923f-453c-418c-91a8-cbfbf777ba95/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,15,6,9,0,0,11,4,0,13,1,0,1,4,1,4
total,15,6,9,0,0,11,4,0,13,1,0,1,4,1,4
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "fd1a52ac-63b4-4a6e-b614-faa8153592b8",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "67057243-3e84-4fce-9c84-0d5808ac7679",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:33:29.365524Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/67057243-3e84-4fce-9c84-0d5808ac7679` → **200**

```json
{
  "id": "67057243-3e84-4fce-9c84-0d5808ac7679",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:33:29.365524Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/67057243-3e84-4fce-9c84-0d5808ac7679` → **200**

```json
{
  "id": "67057243-3e84-4fce-9c84-0d5808ac7679",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:33:29.365524Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/67057243-3e84-4fce-9c84-0d5808ac7679` → **200**

```json
{
  "id": "67057243-3e84-4fce-9c84-0d5808ac7679",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:33:29.365524Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/67057243-3e84-4fce-9c84-0d5808ac7679` → **200**

```json
{
  "id": "67057243-3e84-4fce-9c84-0d5808ac7679",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:33:29.365524Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/67057243-3e84-4fce-9c84-0d5808ac7679` → **200**

```json
{
  "id": "67057243-3e84-4fce-9c84-0d5808ac7679",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:33:29.365524Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/67057243-3e84-4fce-9c84-0d5808ac7679` → **200**

```json
{
  "id": "67057243-3e84-4fce-9c84-0d5808ac7679",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T07:33:29.365524Z",
  "ready_at": "2026-10-28T07:33:34.176868Z",
  "expires_at": "2026-10-29T07:33:34.176868Z"
}
```

`GET /api/admin/v1/reports/exports/67057243-3e84-4fce-9c84-0d5808ac7679/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/93b57e66-1c4f-4fae-aba7-d9d9a38ab9dd` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/93b57e66-1c4f-4fae-aba7-d9d9a38ab9dd",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "545cff2e-c542-4e4b-a70b-3f8ff3fb256a"
}
```

Done: both reports were built in the background and downloaded.

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
  "session_id": "3f788b30-2f96-480f-961a-95c92a9e097a",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM3MTQsImlhdCI6MTc5MzE3MjgxNCwianRpIjoiYTNkYjQxMjctNzdhMi00NDA4LTg0NTgtMGUwY2Q3Njk0MzI3Iiwic2lkIjoiM2Y3ODhiMzAtMmY5Ni00ODBmLTk2MWEtOTVjOTJhOWUwOTdhIn0.cakljhXpr_bUFh5MfnT85iBqIfZE6DjF4SyfjWeHaPs",
  "access_expires_at": "2026-10-28T07:48:34.862455662Z",
  "refresh_token": "h4Em7QoQRyOqcqeBRw_s131JZwBUwOPn0cQq122xR7M",
  "refresh_expires_at": "2026-10-28T19:33:34.861977637Z",
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
  "command_id": "90a5c7c1-bc26-4159-a4fd-87fb2493cad9",
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
  "changed_by": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T07:33:34.924076Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "90a5c7c1-bc26-4159-a4fd-87fb2493cad9",
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
  "changed_by": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T07:33:34.924076Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48020964611",
  "device_ref": "sandbox-26917"
}
```

```json
{
  "challenge_id": "876278a5-ee30-41ac-a324-1d45c5ced6ae",
  "expires_at": "2026-10-28T07:38:34.988145995Z",
  "resend_available_at": "2026-10-28T07:33:35.988145995Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48020964611` → **200**

```json
{
  "phone": "+48020964611",
  "audience": "CLIENT",
  "code": "849884",
  "sent_at": "2026-10-28T07:33:34.990235938Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "876278a5-ee30-41ac-a324-1d45c5ced6ae",
  "code": "849884",
  "device_ref": "sandbox-26917"
}
```

```json
{
  "session_id": "33ec5719-3266-417f-8dea-5431318a91d2",
  "subject": {
    "type": "CLIENT",
    "id": "3b6a235e-60e5-46f7-ad2c-1edad4c305b2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYjZhMjM1ZS02MGU1LTQ2ZjctYWQyYy0xZWRhZDRjMzA1YjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNzE1LCJpYXQiOjE3OTMxNzI4MTUsImp0aSI6IjY2MWQzMzI0LTFhMjAtNDUwOS04OGMxLWUwZWRkYzA3MjQyMiIsInNpZCI6IjMzZWM1NzE5LTMyNjYtNDE3Zi04ZGVhLTU0MzEzMThhOTFkMiJ9.AespgGWtRCKlGyPN4xo1jWcdx5cb1WqP2mB-lDeXnOY",
  "access_expires_at": "2026-10-28T07:48:35.034938276Z",
  "refresh_token": "qq91_g-BFqlzqbcZIuKKrDYLuNJqFCS5mKKY3woEka0",
  "refresh_expires_at": "2026-11-27T07:33:35.034443515Z",
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
  "correlation_id": "55bbbbb2-cd6d-4ca3-b5af-8d7641e6b58f"
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
  "device_ref": "sandbox-18711"
}
```

```json
{
  "challenge_id": "a90fdf01-1160-411e-b53f-a8ad91feb15c",
  "expires_at": "2026-10-28T07:38:35.102860575Z",
  "resend_available_at": "2026-10-28T07:33:36.102860575Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "177579",
  "sent_at": "2026-10-28T07:33:35.105003256Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a90fdf01-1160-411e-b53f-a8ad91feb15c",
  "code": "177579",
  "device_ref": "sandbox-18711"
}
```

```json
{
  "session_id": "506d2436-e349-4188-960e-d27ee21241f0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzcxNSwiaWF0IjoxNzkzMTcyODE1LCJqdGkiOiJmYTA3MDY2MS1iYjQ4LTRjMmMtOTE3My1lMzdmMzdmZGZhOTIiLCJzaWQiOiI1MDZkMjQzNi1lMzQ5LTQxODgtOTYwZS1kMjdlZTIxMjQxZjAifQ.FBPt3KhcB7jIK-HUzj9fhbt3VlnIsPg38hlAy9hrPQw",
  "access_expires_at": "2026-10-28T07:48:35.149559012Z",
  "refresh_token": "up2gqIM68L2srq1SHsWnP1Px3w0dSHoE5VVXZlHJOcg",
  "refresh_expires_at": "2026-11-27T07:33:35.149030215Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "9a90f296-9e71-48f9-9ab1-91dd8346ff9c",
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
  "last_heartbeat_at": "2026-10-28T07:33:26.191848Z",
  "last_location_at": "2026-10-28T07:33:26.191848Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9a90f296-9e71-48f9-9ab1-91dd8346ff9c/handover` → **200**

```json
{
  "command_id": "b7204dcd-4f84-4a8e-bd9b-948ab44b20d8",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "9a90f296-9e71-48f9-9ab1-91dd8346ff9c",
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
  "last_heartbeat_at": "2026-10-28T07:33:26.191848Z",
  "last_location_at": "2026-10-28T07:33:26.191848Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9a90f296-9e71-48f9-9ab1-91dd8346ff9c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:33:35Z",
    "sequence": 1793172815222
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "9a90f296-9e71-48f9-9ab1-91dd8346ff9c",
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
  "last_heartbeat_at": "2026-10-28T07:33:35.238383Z",
  "last_location_at": "2026-10-28T07:33:35.238383Z",
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
  "session_id": "9a90f296-9e71-48f9-9ab1-91dd8346ff9c",
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
  "last_heartbeat_at": "2026-10-28T07:33:35.238383Z",
  "last_location_at": "2026-10-28T07:33:35.238383Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9a90f296-9e71-48f9-9ab1-91dd8346ff9c/close` → **200**

```json
{
  "command_id": "099b300c-a905-44f3-b0c4-0b5fb8b89e87",
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
  "correlation_id": "56512e7f-ff1d-47ea-b51b-8dcb0f024572"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675339646",
  "device_ref": "sandbox-19384"
}
```

```json
{
  "challenge_id": "7a05dbca-ace5-43db-b1a9-f1dc4f707d69",
  "expires_at": "2026-10-28T07:38:35.36832041Z",
  "resend_available_at": "2026-10-28T07:33:36.36832041Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675339646` → **200**

```json
{
  "phone": "+380675339646",
  "audience": "CLIENT",
  "code": "509621",
  "sent_at": "2026-10-28T07:33:35.370111576Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7a05dbca-ace5-43db-b1a9-f1dc4f707d69",
  "code": "509621",
  "device_ref": "sandbox-19384"
}
```

```json
{
  "session_id": "84b619d2-36e6-4136-9ca4-9b245408743d",
  "subject": {
    "type": "CLIENT",
    "id": "305815e2-fb23-4b9d-8387-0e4a3a21f9f2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMDU4MTVlMi1mYjIzLTRiOWQtODM4Ny0wZTRhM2EyMWY5ZjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNzE1LCJpYXQiOjE3OTMxNzI4MTUsImp0aSI6IjNlMTM3MGNkLWM4ZTYtNDMyZi04N2YzLTMxMDRlOTIwOTgzNiIsInNpZCI6Ijg0YjYxOWQyLTM2ZTYtNDEzNi05Y2E0LTliMjQ1NDA4NzQzZCJ9.iVqq5sTl02W_WTj0p3bD94XrMkuZR6Nq56SOoADD-i0",
  "access_expires_at": "2026-10-28T07:48:35.414508644Z",
  "refresh_token": "iv-FARRl_1PwaRwhoO2Tpn0jtSQZiBu50gKeSVnCdpM",
  "refresh_expires_at": "2026-11-27T07:33:35.413943253Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "fff1fe81-09a2-4b5a-bd9b-65b98ad3456f",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "394b8630-7956-46d0-a8af-a687a29c06ab",
  "upload_path": "/api/rider/v1/uploads/394b8630-7956-46d0-a8af-a687a29c06ab",
  "expires_at": "2026-10-28T07:48:35.443624286Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/394b8630-7956-46d0-a8af-a687a29c06ab` → **200**

```json
{
  "file_id": "394b8630-7956-46d0-a8af-a687a29c06ab",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "4475c299-ad82-488f-af41-b686c35aa4ef",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "394b8630-7956-46d0-a8af-a687a29c06ab"
  ]
}
```

```json
{
  "id": "a6913941-4fea-4ebe-8d73-c5f346be4f21",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "305815e2-fb23-4b9d-8387-0e4a3a21f9f2",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T07:33:35.501788Z",
  "updated_at": "2026-10-28T07:33:35.501788Z",
  "messages": [
    {
      "id": "175fd5f3-0d98-44b3-bb0d-c334d3294d7e",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "305815e2-fb23-4b9d-8387-0e4a3a21f9f2",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T07:33:35.502983Z",
      "attachments": [
        {
          "file_id": "394b8630-7956-46d0-a8af-a687a29c06ab",
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
  "session_id": "5b2581cf-6a9a-42a3-a6e6-58075457b0df",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM3MTUsImlhdCI6MTc5MzE3MjgxNSwianRpIjoiYWRkMTViY2EtNzk2OS00ZjM0LWJhM2UtZmE2YTMxMzNlMzFiIiwic2lkIjoiNWIyNTgxY2YtNmE5YS00MmEzLWE2ZTYtNTgwNzU0NTdiMGRmIn0.XuTyl7jMIJh053nVdzOUKs4Gjes7xriB_fuNXPrbiVA",
  "access_expires_at": "2026-10-28T07:48:35.826982337Z",
  "refresh_token": "3kxprLG1hlQhyeNp_FpIPnvNsCFVnCwQx8xVYZpl2V0",
  "refresh_expires_at": "2026-10-28T19:33:35.826457805Z",
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
  "session_id": "ee4c43ec-67aa-43f8-8990-7c819208bf4c",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM3MTYsImlhdCI6MTc5MzE3MjgxNiwianRpIjoiNDVmY2ZmYTQtMmJiZi00MmVhLWIzYmUtMWUxZjlkZWVhOTdhIiwic2lkIjoiZWU0YzQzZWMtNjdhYS00M2Y4LTg5OTAtN2M4MTkyMDhiZjRjIn0.aOtZkDWzXpcCOxGkZucFY6F-1kUMDHqfq9YN78-ArMI",
  "access_expires_at": "2026-10-28T07:48:36.133346242Z",
  "refresh_token": "EN1DcZaH-HJEEVASiL-jeNMCgxDp0r9jfdy2LMX1tTY",
  "refresh_expires_at": "2026-10-28T19:33:36.132491143Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/a6913941-4fea-4ebe-8d73-c5f346be4f21/attachments/394b8630-7956-46d0-a8af-a687a29c06ab` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "8c82b910-5018-44ac-a6e0-24f9ab63bd8e",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "44382e61-fe99-4e80-887b-04c94f7a74e1",
  "upload_path": "/api/operator/v1/uploads/44382e61-fe99-4e80-887b-04c94f7a74e1",
  "expires_at": "2026-10-28T07:48:36.174075973Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/44382e61-fe99-4e80-887b-04c94f7a74e1` → **200**

```json
{
  "file_id": "44382e61-fe99-4e80-887b-04c94f7a74e1",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/a6913941-4fea-4ebe-8d73-c5f346be4f21` → **200**

```json
{
  "id": "a6913941-4fea-4ebe-8d73-c5f346be4f21",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "305815e2-fb23-4b9d-8387-0e4a3a21f9f2",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T07:33:35.501788Z",
  "updated_at": "2026-10-28T07:33:35.501788Z",
  "messages": [
    {
      "id": "175fd5f3-0d98-44b3-bb0d-c334d3294d7e",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "305815e2-fb23-4b9d-8387-0e4a3a21f9f2",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T07:33:35.502983Z",
      "attachments": [
        {
          "file_id": "394b8630-7956-46d0-a8af-a687a29c06ab",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/a6913941-4fea-4ebe-8d73-c5f346be4f21/comments` → **200**

```json
{
  "command_id": "9dd923df-3931-440f-b3df-e87351a70b20",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "44382e61-fe99-4e80-887b-04c94f7a74e1"
  ]
}
```

```json
{
  "id": "a6913941-4fea-4ebe-8d73-c5f346be4f21",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "305815e2-fb23-4b9d-8387-0e4a3a21f9f2",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T07:33:35.501788Z",
  "updated_at": "2026-10-28T07:33:36.259937Z",
  "messages": [
    {
      "id": "175fd5f3-0d98-44b3-bb0d-c334d3294d7e",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "305815e2-fb23-4b9d-8387-0e4a3a21f9f2",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T07:33:35.502983Z",
      "attachments": [
        {
          "file_id": "394b8630-7956-46d0-a8af-a687a29c06ab",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "4a180be0-e7b7-49fe-923a-aa84049972b9",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T07:33:36.259566Z",
      "attachments": [
        {
          "file_id": "44382e61-fe99-4e80-887b-04c94f7a74e1",
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

`GET /api/rider/v1/support/cases/a6913941-4fea-4ebe-8d73-c5f346be4f21` → **200**

```json
{
  "id": "a6913941-4fea-4ebe-8d73-c5f346be4f21",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "305815e2-fb23-4b9d-8387-0e4a3a21f9f2",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T07:33:35.501788Z",
  "updated_at": "2026-10-28T07:33:36.259937Z",
  "messages": [
    {
      "id": "175fd5f3-0d98-44b3-bb0d-c334d3294d7e",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "305815e2-fb23-4b9d-8387-0e4a3a21f9f2",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T07:33:35.502983Z",
      "attachments": [
        {
          "file_id": "394b8630-7956-46d0-a8af-a687a29c06ab",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "4a180be0-e7b7-49fe-923a-aa84049972b9",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T07:33:36.259566Z",
      "attachments": [
        {
          "file_id": "44382e61-fe99-4e80-887b-04c94f7a74e1",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/a6913941-4fea-4ebe-8d73-c5f346be4f21/attachments/44382e61-fe99-4e80-887b-04c94f7a74e1` → **200**

Done: support case a6913941-4fea-4ebe-8d73-c5f346be4f21, rider attachment 394b8630-7956-46d0-a8af-a687a29c06ab, operator attachment 44382e61-fe99-4e80-887b-04c94f7a74e1.

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
  "session_id": "5dbc8e5d-1094-4953-a3b3-6c8bddeb590e",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM3MTYsImlhdCI6MTc5MzE3MjgxNiwianRpIjoiOGEzNjAxMzktMzRjMS00NTVlLTljODMtMTdjMGJhMTU5YTIyIiwic2lkIjoiNWRiYzhlNWQtMTA5NC00OTUzLWEzYjMtNmM4YmRkZWI1OTBlIn0.rbG7LJ24J73_nelhGMFhIpLErRfscNKeXox5-M_73jE",
  "access_expires_at": "2026-10-28T07:48:36.619808835Z",
  "refresh_token": "k4OciPSTr3HmLi-_Fb_80ULUEdYxK652nyxrJLiR0WU",
  "refresh_expires_at": "2026-10-28T19:33:36.619188587Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-21537"
}
```

```json
{
  "challenge_id": "db0a7d21-7995-421f-9c02-92ad8e067560",
  "expires_at": "2026-10-28T07:38:36.643622263Z",
  "resend_available_at": "2026-10-28T07:33:37.643622263Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "506687",
  "sent_at": "2026-10-28T07:33:36.646210235Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "db0a7d21-7995-421f-9c02-92ad8e067560",
  "code": "506687",
  "device_ref": "sandbox-21537"
}
```

```json
{
  "session_id": "354ae7ba-1148-4e9d-be7d-c8c7640d95d8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzcxNiwiaWF0IjoxNzkzMTcyODE2LCJqdGkiOiJmZDBhYmI3Ny03ZmI4LTQ3NjgtOGNjMi02NDVlYjc5OGE4NGUiLCJzaWQiOiIzNTRhZTdiYS0xMTQ4LTRlOWQtYmU3ZC1jOGM3NjQwZDk1ZDgifQ.EhGIJgFV5IxwaPs2tTJxOnZAxlqXMxadKFbD8YDn3kU",
  "access_expires_at": "2026-10-28T07:48:36.690407469Z",
  "refresh_token": "DrQ5_EgAvhCN6jiMhdB2PtJAsD93RspDNN-A3Ke1-Zk",
  "refresh_expires_at": "2026-11-27T07:33:36.689866862Z",
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
  "command_id": "0a041746-1768-4c64-9801-0a4c46ff79b9",
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
  "device_ref": "sandbox-17505"
}
```

```json
{
  "challenge_id": "814fef04-2922-4343-a6e2-3c351deebb1c",
  "expires_at": "2026-10-28T07:38:36.79899121Z",
  "resend_available_at": "2026-10-28T07:33:37.79899121Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "939196",
  "sent_at": "2026-10-28T07:33:36.800917321Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "814fef04-2922-4343-a6e2-3c351deebb1c",
  "code": "939196",
  "device_ref": "sandbox-17505"
}
```

```json
{
  "session_id": "6d6f6c54-2115-4ece-b8fa-05a37ae08740",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzcxNiwiaWF0IjoxNzkzMTcyODE2LCJqdGkiOiI4NmUzMGE4Mi04NWM3LTQzZjMtOGNkMS0xZGIzNmFkNmMyY2EiLCJzaWQiOiI2ZDZmNmM1NC0yMTE1LTRlY2UtYjhmYS0wNWEzN2FlMDg3NDAifQ.hp2RJZ-JW_d7anen_UIJ85kJMAOmdoup2InE9b2glCI",
  "access_expires_at": "2026-10-28T07:48:36.845938183Z",
  "refresh_token": "oknQKBakS7Z2C_NCajRvlAtLQTRY-IBwFq4eH-IjoDE",
  "refresh_expires_at": "2026-11-27T07:33:36.845355369Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fd592aed-0cf0-46e9-b591-889046c698e3",
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
  "last_heartbeat_at": "2026-10-28T07:33:27.14232Z",
  "last_location_at": "2026-10-28T07:33:27.14232Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fd592aed-0cf0-46e9-b591-889046c698e3/handover` → **200**

```json
{
  "command_id": "f545b22f-5f6e-4ebe-b332-910205f39719",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fd592aed-0cf0-46e9-b591-889046c698e3",
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
  "last_heartbeat_at": "2026-10-28T07:33:27.14232Z",
  "last_location_at": "2026-10-28T07:33:27.14232Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fd592aed-0cf0-46e9-b591-889046c698e3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:33:36Z",
    "sequence": 1793172816914
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fd592aed-0cf0-46e9-b591-889046c698e3",
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
  "last_heartbeat_at": "2026-10-28T07:33:36.929154Z",
  "last_location_at": "2026-10-28T07:33:36.929154Z",
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
  "command_id": "d60e53a8-5ca1-4062-93db-4ba3f2da89de",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:33:36Z",
    "sequence": 1793172816968
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a8884ad3-8008-4a70-8980-6ceae34be96f",
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
  "last_heartbeat_at": "2026-10-28T07:33:36.982992Z",
  "last_location_at": "2026-10-28T07:33:36.982992Z",
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
  "session_id": "7597a12b-cfc6-44d3-b51b-c41fba0a42c5",
  "subject": {
    "type": "STAFF",
    "id": "851609bd-7b4a-4753-ac8b-5b8b4118c9a2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTE2MDliZC03YjRhLTQ3NTMtYWM4Yi01YjhiNDExOGM5YTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM3MTcsImlhdCI6MTc5MzE3MjgxNywianRpIjoiYjM5M2FkYzYtYmE3ZS00YWRmLTgxNzQtMzdmNDRhMDI0OWNlIiwic2lkIjoiNzU5N2ExMmItY2ZjNi00NGQzLWI1MWItYzQxZmJhMGE0MmM1In0.LaXWDhZtEwLMzwTrMKSS01f-7O7nNyEZ_r_BHrb-FmY",
  "access_expires_at": "2026-10-28T07:48:37.293886627Z",
  "refresh_token": "-RYokFOoPwstCI0UiyZC5gAQ5fgHHY_ZMl_YPrGMAOo",
  "refresh_expires_at": "2026-10-28T19:33:37.293333705Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "61bc2ecc-68c6-4e47-bca3-b5ec4962f5cd",
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
  "id": "cdc183fc-6b14-495c-86a6-642bf0405a5e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T07:38:37.321312Z",
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
  "command_id": "612e5f30-cfb4-4167-97a2-096de00513f0",
  "quote_id": "cdc183fc-6b14-495c-86a6-642bf0405a5e",
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
  "id": "6fe0800a-fba7-4159-a683-7090fb2581cb",
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
  "created_at": "2026-10-28T07:33:37.354966Z",
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
    "id": "f0006f92-5690-458c-bd68-28b49767f2d2",
    "order_id": "6fe0800a-fba7-4159-a683-7090fb2581cb",
    "expires_at": "2026-10-28T07:33:52.35891Z",
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

`POST /api/driver/v1/offers/f0006f92-5690-458c-bd68-28b49767f2d2/accept` → **200**

```json
{
  "command_id": "14a4106a-feef-446a-9745-7c524edab881"
}
```

```json
{
  "id": "2fe03a1d-97ca-4de5-b4a3-e52f9d2aeda5",
  "order_id": "6fe0800a-fba7-4159-a683-7090fb2581cb",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ecc4ad4b-b3b5-4340-8b87-54b18d441852",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ecc4ad4b-b3b5-4340-8b87-54b18d441852",
  "order_id": "6fe0800a-fba7-4159-a683-7090fb2581cb",
  "assignment_id": "2fe03a1d-97ca-4de5-b4a3-e52f9d2aeda5",
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

`POST /api/driver/v1/work-sessions/a8884ad3-8008-4a70-8980-6ceae34be96f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:33:37Z",
    "sequence": 1793172817468
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a8884ad3-8008-4a70-8980-6ceae34be96f",
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
  "last_heartbeat_at": "2026-10-28T07:33:37.482849Z",
  "last_location_at": "2026-10-28T07:33:37.482849Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ecc4ad4b-b3b5-4340-8b87-54b18d441852/arrive` → **200**

```json
{
  "command_id": "520b140e-a7fd-410b-b529-a7a7c007bbeb",
  "expected_version": 0
}
```

```json
{
  "id": "ecc4ad4b-b3b5-4340-8b87-54b18d441852",
  "order_id": "6fe0800a-fba7-4159-a683-7090fb2581cb",
  "assignment_id": "2fe03a1d-97ca-4de5-b4a3-e52f9d2aeda5",
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
  "arrived_at": "2026-10-28T07:33:37.511398Z",
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

`POST /api/driver/v1/trips/ecc4ad4b-b3b5-4340-8b87-54b18d441852/start` → **200**

```json
{
  "command_id": "d72e2ae0-0a91-4ab6-8add-86dc9c50db49",
  "expected_version": 1
}
```

```json
{
  "id": "ecc4ad4b-b3b5-4340-8b87-54b18d441852",
  "order_id": "6fe0800a-fba7-4159-a683-7090fb2581cb",
  "assignment_id": "2fe03a1d-97ca-4de5-b4a3-e52f9d2aeda5",
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
  "arrived_at": "2026-10-28T07:33:37.511398Z",
  "started_at": "2026-10-28T07:33:37.543909Z",
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

`POST /api/driver/v1/trips/ecc4ad4b-b3b5-4340-8b87-54b18d441852/complete` → **200**

```json
{
  "command_id": "57120946-3fd7-48c6-bf0f-ae438c50b4bd",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:33:37Z",
  "cash_received": true
}
```

```json
{
  "id": "ecc4ad4b-b3b5-4340-8b87-54b18d441852",
  "order_id": "6fe0800a-fba7-4159-a683-7090fb2581cb",
  "assignment_id": "2fe03a1d-97ca-4de5-b4a3-e52f9d2aeda5",
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
  "arrived_at": "2026-10-28T07:33:37.511398Z",
  "started_at": "2026-10-28T07:33:37.543909Z",
  "completed_at": "2026-10-28T07:33:37.578974Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/6fe0800a-fba7-4159-a683-7090fb2581cb` → **200**

```json
{
  "id": "6fe0800a-fba7-4159-a683-7090fb2581cb",
  "short_number": 17,
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
    "id": "2fe03a1d-97ca-4de5-b4a3-e52f9d2aeda5",
    "order_id": "6fe0800a-fba7-4159-a683-7090fb2581cb",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ecc4ad4b-b3b5-4340-8b87-54b18d441852",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:33:37.354966Z",
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
  "session_id": "fd592aed-0cf0-46e9-b591-889046c698e3",
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
  "last_heartbeat_at": "2026-10-28T07:33:36.929154Z",
  "last_location_at": "2026-10-28T07:33:36.929154Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fd592aed-0cf0-46e9-b591-889046c698e3/close` → **200**

```json
{
  "command_id": "50033c4b-4f54-4d64-a0f4-af4dd9759b10",
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
  "session_id": "a8884ad3-8008-4a70-8980-6ceae34be96f",
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
  "last_heartbeat_at": "2026-10-28T07:33:37.482849Z",
  "last_location_at": "2026-10-28T07:33:37.482849Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a8884ad3-8008-4a70-8980-6ceae34be96f/close` → **200**

```json
{
  "command_id": "660e79ce-e012-4a00-8725-69963a75509a",
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

Done: terminal order 6fe0800a-fba7-4159-a683-7090fb2581cb by Andrii (5a000000-0000-4000-8000-000000000403).
